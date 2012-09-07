grammar BimQL;

options {
	language = Java;
	}

@header {
	package nl.wietmazairac.bimql;
	import java.util.HashMap;
	import java.util.Map;
	import nl.wietmazairac.bimql.get.attribute.GetAttributeMain;
	import nl.wietmazairac.bimql.get.entitytype.GetEntityTypeMain;
	import nl.wietmazairac.bimql.get.property.GetPropertyMain;
	import nl.wietmazairac.bimql.set.attribute.SetAttributeMain;
	import org.bimserver.ifc.IfcModel;
	import org.bimserver.models.ifc2x3.IfcObject;
	import org.bimserver.models.ifc2x3.IfcRoot;
	}

@lexer::header {
	package nl.wietmazairac.bimql;
	}
	
@members {
	Map<String, List<Object>> hashMapObjectList = new HashMap<String, List<Object>>();
	Map<String, IfcModel> hashMapIfcModel = new HashMap<String, IfcModel>();
	}

bimql [IfcModel ifcModel] returns [List<Object> bimqlReturns]
	:	{	List<IfcRoot> ifcRootList = new ArrayList<IfcRoot>();
			ifcRootList = ifcModel.getAllWithSubTypes(IfcRoot.class);
			List<Object> objectList = new ArrayList<Object>();			
			for (IfcRoot ifcRoot : ifcRootList) {
				objectList.add(ifcRoot);
			}
		}
		select [objectList] {
		$bimqlReturns = $select.selectReturns;
		}
	;
	
select [List<Object> objectList] returns [List <Object> selectReturns]
	:	'Select' VARIABLE {     
			$selectReturns = $select.objectList;      
			hashMapObjectList.put($VARIABLE.text, objectList);
		}
		(	where[$VARIABLE.text] {   
				$selectReturns = hashMapObjectList.get($VARIABLE.text);
			}
        )?
        (	cascade {        
        		$selectReturns = hashMapObjectList.get($cascade.cascadeReturns);
        	}
        )*
        set?
  ;
	

cascade returns [String cascadeReturns]
	:	'Select' VARIABLE1 = VARIABLE ':=' VARIABLE2 = VARIABLE
		(	'.Attribute.' string1 = STRING {
				List<Object> objectList = new ArrayList<Object>(hashMapObjectList.get($VARIABLE2.text));
				GetAttributeMain getAttributeMain = new GetAttributeMain(objectList, $string1.text);
				List<ArrayList> arrayListList = new ArrayList<ArrayList>(getAttributeMain.getResult());
				objectList.clear();
				
				FlattenList flattenList = new FlattenList(arrayListList);				
				objectList = flattenList.getResult();
				
				hashMapObjectList.put($VARIABLE1.text, objectList);
				$cascadeReturns = $VARIABLE1.text;
			}
		|	'.Property.' string2 = STRING {
				List<Object> objectList = new ArrayList<Object>(hashMapObjectList.get($VARIABLE2.text));
				GetPropertyMain getPropertyMain = new GetPropertyMain(objectList, $string2.text);
				List<ArrayList> arrayListList = new ArrayList<ArrayList>(getPropertyMain.getResult());
				objectList.clear();
				FlattenList flattenList = new FlattenList(arrayListList);				
				objectList = flattenList.getResult();
				hashMapObjectList.put($VARIABLE1.text, objectList);
				$cascadeReturns = $VARIABLE1.text;
	
			}
		)
		(	where[$VARIABLE1.text]
		)?
	;

	
where [String string]
	:	'Where' statement {
			CullList cullList = new CullList(hashMapObjectList.get($string), $statement.statementReturns);
			hashMapObjectList.put($string, cullList.getResult());
		}
	;
	
set
	:	'Set' VARIABLE1 = VARIABLE '.Attribute.' string1 = STRING ':=' (string2 = INTEGER | string2 = REAL | string2 = STRING) {
		SetAttributeMain setAttributeMain = new SetAttributeMain(hashMapObjectList.get($VARIABLE1.text), $string1.text, $string2.text);
		setAttributeMain.setAttribute();
		}
	;

statement returns [List<Boolean> statementReturns]
	:	relation1 = relation {
			List<Boolean> firstBooleanList = new ArrayList<Boolean>($relation1.relationReturns);
			$statementReturns = firstBooleanList;
			}
		(
		'And' relation2 = relation {			
			List<Boolean> tempBooleanList = new ArrayList<Boolean>($statementReturns);
			AndOperator andOperator = new AndOperator(tempBooleanList, $relation2.relationReturns);
			List<Boolean> andBooleanList = new ArrayList<Boolean>(andOperator.getResult());
			$statementReturns = andBooleanList;
			}
		|
		'Or' relation3 = relation {			
			List<Boolean> tempBooleanList = new ArrayList<Boolean>($statementReturns);
			OrOperator orOperator = new OrOperator(tempBooleanList, $relation3.relationReturns);
			List<Boolean> orBooleanList = new ArrayList<Boolean>(orOperator.getResult());
			$statementReturns = orBooleanList;
			}
		)*
	;

relation returns [List<Boolean> relationReturns]
	:	relationleft
		(
			'=' relationright1 = relationright {
				EqualOperator equalOperator = new EqualOperator($relationleft.relationleftReturns, $relationright1.relationrightReturns);
				List<Boolean> booleanList = new ArrayList<Boolean>(equalOperator.getResult());
				$relationReturns = booleanList;
				}
			| '/=' relationright2 = relationright {
				InEqualOperator inEqualOperator = new InEqualOperator($relationleft.relationleftReturns, $relationright2.relationrightReturns);
				List<Boolean> booleanList = new ArrayList<Boolean>(inEqualOperator.getResult());
				$relationReturns = booleanList;
				}
			| '<' relationright3 = relationright {
				LessOperator lessOperator = new LessOperator($relationleft.relationleftReturns, $relationright3.relationrightReturns);
				List<Boolean> booleanList = new ArrayList<Boolean>(lessOperator.getResult());
				$relationReturns = booleanList;
				}
			| '<=' relationright4 = relationright {
				LessEqualOperator lessEqualOperator = new LessEqualOperator($relationleft.relationleftReturns, $relationright4.relationrightReturns);
				List<Boolean> booleanList = new ArrayList<Boolean>(lessEqualOperator.getResult());
				$relationReturns = booleanList;
				}
			| '>=' relationright5 = relationright {
				GreaterEqualOperator greaterEqualOperator = new GreaterEqualOperator($relationleft.relationleftReturns, $relationright5.relationrightReturns);
				List<Boolean> booleanList = new ArrayList<Boolean>(greaterEqualOperator.getResult());
				$relationReturns = booleanList;
				}
			| '>' relationright6 = relationright {
				GreaterOperator greaterOperator = new GreaterOperator($relationleft.relationleftReturns, $relationright6.relationrightReturns);
				List<Boolean> booleanList = new ArrayList<Boolean>(greaterOperator.getResult());
				$relationReturns = booleanList;
				}
		) 
	;

relationleft returns [List<ArrayList> relationleftReturns]
	:	VARIABLE '.EntityType' {
	    List<Object> objectList = new ArrayList<Object>(hashMapObjectList.get($VARIABLE.text));
      GetEntityTypeMain getEntityTypeMain = new GetEntityTypeMain(objectList);
      List<ArrayList> arrayListList = new ArrayList<ArrayList>(getEntityTypeMain.getResult());
      $relationleftReturns = arrayListList;
	}
	
	| VARIABLE '.Attribute.' STRING {
			List<Object> objectList = new ArrayList<Object>(hashMapObjectList.get($VARIABLE.text));
			GetAttributeMain getAttributeMain = new GetAttributeMain(objectList, $STRING.text);
			List<ArrayList> arrayListList = new ArrayList<ArrayList>(getAttributeMain.getResult());
			$relationleftReturns = arrayListList;
			}
		
	| VARIABLE '.Property.' STRING {
      List<Object> objectList = new ArrayList<Object>(hashMapObjectList.get($VARIABLE.text));
      GetPropertyMain getPropertyMain = new GetPropertyMain(objectList, $STRING.text);
      List<ArrayList> arrayListList = new ArrayList<ArrayList>(getPropertyMain.getResult());
      $relationleftReturns = arrayListList;
      }
  ;
	
relationright returns [String relationrightReturns]
		:	INTEGER {
				$relationrightReturns = $INTEGER.text;
			}
		|	REAL {
				$relationrightReturns = $REAL.text;
			}
		|	STRING {
				$relationrightReturns = $STRING.text;
			}
	;

VARIABLE
	:	'$' STRING
	;
	
INTEGER
	:	('0'..'9')+
	;
	
REAL
	:	INTEGER+ ('.' INTEGER+)?
	;
	
STRING
	:	('\u002A'..'\u002A'
		|'\u003F'..'\u003F'
		|'\u0030'..'\u0039'		//'0'..'9'
		|'\u0041'..'\u005A'		//'A'..'Z'
		|'\u005B'..'\u0060'
		|'\u0061'..'\u007A' 	//'a'..'z'
		)+
	;
	
WS
	:	(' ' | '\t' | '\n' | '\r' | '\f') + {$channel = HIDDEN;}
	;

//() - Parentheses. Used to group several elements, so they are treated as one single token
//? - Any token followed by ? occurs 0 or 1 times
//* - Any token followed by * can occur 0 or more times
//+ - Any token followed by + can occur 1 or more times
//. - Any character/token can occur one time
//~ - Any character/token following the ~ may not occur at the current place
//.. - Between two characters .. spans a range which accepts every character between both boundaries inclusive
