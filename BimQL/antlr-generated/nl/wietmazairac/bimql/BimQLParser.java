// $ANTLR 3.1.1 D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g 2013-02-08 10:33:59

	package nl.wietmazairac.bimql;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Iterator;
	import nl.wietmazairac.bimql.get.attribute.GetAttributeMain;
	import nl.wietmazairac.bimql.get.entitytype.GetEntityTypeMain;
	import nl.wietmazairac.bimql.get.property.GetPropertyMain;
	import nl.wietmazairac.bimql.set.attribute.SetAttributeMain;
	import org.bimserver.ifc.IfcModel;
	import org.bimserver.models.ifc2x3tc1.IfcObject;
	import org.bimserver.models.ifc2x3tc1.IfcRoot;
	

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class BimQLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VARIABLE", "STRING", "INTEGER", "REAL", "PLUGIN", "WS", "'Select'", "':='", "'.Attribute.'", "'.Property.'", "'Where'", "'Set'", "'And'", "'Or'", "'='", "'/='", "'<'", "'<='", "'>='", "'>'", "'.EntityType'"
    };
    public static final int INTEGER=6;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int REAL=7;
    public static final int T__19=19;
    public static final int WS=9;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int VARIABLE=4;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int PLUGIN=8;
    public static final int STRING=5;

    // delegates
    // delegators


        public BimQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public BimQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return BimQLParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g"; }


    	Map<String, List<Object>> hashMapObjectList = new HashMap<String, List<Object>>();
    	Map<String, IfcModel> hashMapIfcModel = new HashMap<String, IfcModel>();
    	Map<String, Class> grammarModules = new HashMap <String, Class>();
    	Map<String, BIMQLGrammarPlugin> pluginKeywords = new HashMap<String, BIMQLGrammarPlugin>();
    	IfcModel ifcModel;
    	public BimQLParser(TokenStream input, List<BIMQLGrammarPlugin> importModules) {
            super(input);
               Iterator <BIMQLGrammarPlugin> pluginIter=importModules.iterator();
               while (pluginIter.hasNext()) {
               BIMQLGrammarPlugin aPlugin = (BIMQLGrammarPlugin) pluginIter.next();
              Iterator<String> keyIter = aPlugin.getKeywords().iterator();
                while(keyIter.hasNext())
                {
                    pluginKeywords.put(keyIter.next(),aPlugin);
                }
          
           }
        }
       
       public void registerPlugin (BIMQLGrammarPlugin aPlugin)
       {
          Iterator<String> keyIter = aPlugin.getKeywords().iterator();
          while(keyIter.hasNext())
          {
              pluginKeywords.put(keyIter.next(),aPlugin);
          }
       }
       
    	


    // $ANTLR start "bimql"
    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:56:1: bimql[IfcModel ifcModel] returns [List<Object> bimqlReturns] : select[objectList] ;
    public final List<Object> bimql(IfcModel ifcModel) throws RecognitionException {
        List<Object> bimqlReturns = null;

        List <Object> select1 = null;


        try {
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:57:2: ( select[objectList] )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:57:4: select[objectList]
            {
            	
            	    this.ifcModel=ifcModel;
            	    List<IfcRoot> ifcRootList = new ArrayList<IfcRoot>();
            			ifcRootList = ifcModel.getAllWithSubTypes(IfcRoot.class);
            			List<Object> objectList = new ArrayList<Object>();			
            			for (IfcRoot ifcRoot : ifcRootList) {
            				objectList.add(ifcRoot);
            			}
            		
            pushFollow(FOLLOW_select_in_bimql57);
            select1=select(objectList);

            state._fsp--;


            		bimqlReturns = select1;
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return bimqlReturns;
    }
    // $ANTLR end "bimql"


    // $ANTLR start "select"
    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:71:1: select[List<Object> objectList] returns [List <Object> selectReturns] : 'Select' VARIABLE ( where[$VARIABLE.text] )? ( cascade )* ( set )? ;
    public final List <Object> select(List<Object> objectList) throws RecognitionException {
        List <Object> selectReturns = null;

        Token VARIABLE2=null;
        String cascade3 = null;


        try {
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:72:2: ( 'Select' VARIABLE ( where[$VARIABLE.text] )? ( cascade )* ( set )? )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:72:4: 'Select' VARIABLE ( where[$VARIABLE.text] )? ( cascade )* ( set )?
            {
            match(input,10,FOLLOW_10_in_select79); 
            VARIABLE2=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_select81); 
                 
            			selectReturns = objectList;      
            			hashMapObjectList.put((VARIABLE2!=null?VARIABLE2.getText():null), objectList);
            		
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:76:3: ( where[$VARIABLE.text] )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:76:5: where[$VARIABLE.text]
                    {
                    pushFollow(FOLLOW_where_in_select89);
                    where((VARIABLE2!=null?VARIABLE2.getText():null));

                    state._fsp--;

                       
                    				selectReturns = hashMapObjectList.get((VARIABLE2!=null?VARIABLE2.getText():null));
                    			

                    }
                    break;

            }

            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:80:9: ( cascade )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==10) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:80:11: cascade
            	    {
            	    pushFollow(FOLLOW_cascade_in_select115);
            	    cascade3=cascade();

            	    state._fsp--;

            	            
            	            		selectReturns = hashMapObjectList.get(cascade3);
            	            	

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:84:9: ( set )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:84:9: set
                    {
                    pushFollow(FOLLOW_set_in_select138);
                    set();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return selectReturns;
    }
    // $ANTLR end "select"


    // $ANTLR start "cascade"
    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:88:1: cascade returns [String cascadeReturns] : 'Select' VARIABLE1= VARIABLE ':=' VARIABLE2= VARIABLE ( '.Attribute.' string1= STRING | '.Property.' string2= STRING ) ( where[$VARIABLE1.text] )? ;
    public final String cascade() throws RecognitionException {
        String cascadeReturns = null;

        Token VARIABLE1=null;
        Token VARIABLE2=null;
        Token string1=null;
        Token string2=null;

        try {
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:89:2: ( 'Select' VARIABLE1= VARIABLE ':=' VARIABLE2= VARIABLE ( '.Attribute.' string1= STRING | '.Property.' string2= STRING ) ( where[$VARIABLE1.text] )? )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:89:4: 'Select' VARIABLE1= VARIABLE ':=' VARIABLE2= VARIABLE ( '.Attribute.' string1= STRING | '.Property.' string2= STRING ) ( where[$VARIABLE1.text] )?
            {
            match(input,10,FOLLOW_10_in_cascade157); 
            VARIABLE1=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_cascade163); 
            match(input,11,FOLLOW_11_in_cascade165); 
            VARIABLE2=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_cascade171); 
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:90:3: ( '.Attribute.' string1= STRING | '.Property.' string2= STRING )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:90:5: '.Attribute.' string1= STRING
                    {
                    match(input,12,FOLLOW_12_in_cascade177); 
                    string1=(Token)match(input,STRING,FOLLOW_STRING_in_cascade183); 

                    				List<Object> objectList = new ArrayList<Object>(hashMapObjectList.get((VARIABLE2!=null?VARIABLE2.getText():null)));
                    				GetAttributeMain getAttributeMain = new GetAttributeMain(objectList, (string1!=null?string1.getText():null));
                    				List<ArrayList> arrayListList = new ArrayList<ArrayList>((ArrayList)getAttributeMain.getResult());
                    				objectList.clear();
                    				
                    				FlattenList flattenList = new FlattenList((ArrayList)arrayListList);				
                    				objectList = flattenList.getResult();
                    				
                    				hashMapObjectList.put((VARIABLE1!=null?VARIABLE1.getText():null), objectList);
                    				cascadeReturns = (VARIABLE1!=null?VARIABLE1.getText():null);
                    			

                    }
                    break;
                case 2 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:102:5: '.Property.' string2= STRING
                    {
                    match(input,13,FOLLOW_13_in_cascade191); 
                    string2=(Token)match(input,STRING,FOLLOW_STRING_in_cascade197); 

                    				List<Object> objectList = new ArrayList<Object>(hashMapObjectList.get((VARIABLE2!=null?VARIABLE2.getText():null)));
                    				GetPropertyMain getPropertyMain = new GetPropertyMain(objectList, (string2!=null?string2.getText():null));
                    				List<ArrayList> arrayListList = new ArrayList<ArrayList>((ArrayList)getPropertyMain.getResult());
                    				objectList.clear();
                    				FlattenList flattenList = new FlattenList((ArrayList)arrayListList);				
                    				objectList = flattenList.getResult();
                    				hashMapObjectList.put((VARIABLE1!=null?VARIABLE1.getText():null), objectList);
                    				cascadeReturns = (VARIABLE1!=null?VARIABLE1.getText():null);
                    	
                    			

                    }
                    break;

            }

            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:114:3: ( where[$VARIABLE1.text] )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:114:5: where[$VARIABLE1.text]
                    {
                    pushFollow(FOLLOW_where_in_cascade209);
                    where((VARIABLE1!=null?VARIABLE1.getText():null));

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cascadeReturns;
    }
    // $ANTLR end "cascade"


    // $ANTLR start "where"
    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:119:1: where[String string] : 'Where' statement ;
    public final void where(String string) throws RecognitionException {
        List<Boolean> statement4 = null;


        try {
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:120:2: ( 'Where' statement )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:120:4: 'Where' statement
            {
            match(input,14,FOLLOW_14_in_where230); 
            pushFollow(FOLLOW_statement_in_where232);
            statement4=statement();

            state._fsp--;


            			CullList cullList = new CullList(hashMapObjectList.get(string), statement4);
            			hashMapObjectList.put(string, cullList.getResult());
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "where"


    // $ANTLR start "set"
    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:126:1: set : 'Set' VARIABLE1= VARIABLE '.Attribute.' string1= STRING ':=' (string2= INTEGER | string2= REAL | string2= STRING ) ;
    public final void set() throws RecognitionException {
        Token VARIABLE1=null;
        Token string1=null;
        Token string2=null;

        try {
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:127:2: ( 'Set' VARIABLE1= VARIABLE '.Attribute.' string1= STRING ':=' (string2= INTEGER | string2= REAL | string2= STRING ) )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:127:4: 'Set' VARIABLE1= VARIABLE '.Attribute.' string1= STRING ':=' (string2= INTEGER | string2= REAL | string2= STRING )
            {
            match(input,15,FOLLOW_15_in_set246); 
            VARIABLE1=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_set252); 
            match(input,12,FOLLOW_12_in_set254); 
            string1=(Token)match(input,STRING,FOLLOW_STRING_in_set260); 
            match(input,11,FOLLOW_11_in_set262); 
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:127:67: (string2= INTEGER | string2= REAL | string2= STRING )
            int alt6=3;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt6=1;
                }
                break;
            case REAL:
                {
                alt6=2;
                }
                break;
            case STRING:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:127:68: string2= INTEGER
                    {
                    string2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_set269); 

                    }
                    break;
                case 2 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:127:88: string2= REAL
                    {
                    string2=(Token)match(input,REAL,FOLLOW_REAL_in_set277); 

                    }
                    break;
                case 3 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:127:105: string2= STRING
                    {
                    string2=(Token)match(input,STRING,FOLLOW_STRING_in_set285); 

                    }
                    break;

            }


            		SetAttributeMain setAttributeMain = new SetAttributeMain(hashMapObjectList.get((VARIABLE1!=null?VARIABLE1.getText():null)), (string1!=null?string1.getText():null), (string2!=null?string2.getText():null));
            		setAttributeMain.setAttribute();
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "set"


    // $ANTLR start "statement"
    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:133:1: statement returns [List<Boolean> statementReturns] : relation1= relation ( 'And' relation2= relation | 'Or' relation3= relation )* ;
    public final List<Boolean> statement() throws RecognitionException {
        List<Boolean> statementReturns = null;

        List<Boolean> relation1 = null;

        List<Boolean> relation2 = null;

        List<Boolean> relation3 = null;


        try {
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:134:2: (relation1= relation ( 'And' relation2= relation | 'Or' relation3= relation )* )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:134:4: relation1= relation ( 'And' relation2= relation | 'Or' relation3= relation )*
            {
            pushFollow(FOLLOW_relation_in_statement307);
            relation1=relation();

            state._fsp--;


            			List<Boolean> firstBooleanList = new ArrayList<Boolean>(relation1);
            			statementReturns = firstBooleanList;
            			
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:138:3: ( 'And' relation2= relation | 'Or' relation3= relation )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }
                else if ( (LA7_0==17) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:139:3: 'And' relation2= relation
            	    {
            	    match(input,16,FOLLOW_16_in_statement317); 
            	    pushFollow(FOLLOW_relation_in_statement323);
            	    relation2=relation();

            	    state._fsp--;

            	    			
            	    			List<Boolean> tempBooleanList = new ArrayList<Boolean>(statementReturns);
            	    			AndOperator andOperator = new AndOperator(tempBooleanList, relation2);
            	    			List<Boolean> andBooleanList = new ArrayList<Boolean>(andOperator.getResult());
            	    			statementReturns = andBooleanList;
            	    			

            	    }
            	    break;
            	case 2 :
            	    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:146:3: 'Or' relation3= relation
            	    {
            	    match(input,17,FOLLOW_17_in_statement333); 
            	    pushFollow(FOLLOW_relation_in_statement339);
            	    relation3=relation();

            	    state._fsp--;

            	    			
            	    			List<Boolean> tempBooleanList = new ArrayList<Boolean>(statementReturns);
            	    			OrOperator orOperator = new OrOperator(tempBooleanList, relation3);
            	    			List<Boolean> orBooleanList = new ArrayList<Boolean>(orOperator.getResult());
            	    			statementReturns = orBooleanList;
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return statementReturns;
    }
    // $ANTLR end "statement"


    // $ANTLR start "relation"
    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:155:1: relation returns [List<Boolean> relationReturns] : relationleft ( '=' relationright1= relationright | '/=' relationright2= relationright | '<' relationright3= relationright | '<=' relationright4= relationright | '>=' relationright5= relationright | '>' relationright6= relationright ) ;
    public final List<Boolean> relation() throws RecognitionException {
        List<Boolean> relationReturns = null;

        String relationright1 = null;

        String relationright2 = null;

        String relationright3 = null;

        String relationright4 = null;

        String relationright5 = null;

        String relationright6 = null;

        List<ArrayList> relationleft5 = null;


        try {
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:156:2: ( relationleft ( '=' relationright1= relationright | '/=' relationright2= relationright | '<' relationright3= relationright | '<=' relationright4= relationright | '>=' relationright5= relationright | '>' relationright6= relationright ) )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:156:4: relationleft ( '=' relationright1= relationright | '/=' relationright2= relationright | '<' relationright3= relationright | '<=' relationright4= relationright | '>=' relationright5= relationright | '>' relationright6= relationright )
            {
            pushFollow(FOLLOW_relationleft_in_relation361);
            relationleft5=relationleft();

            state._fsp--;

            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:157:3: ( '=' relationright1= relationright | '/=' relationright2= relationright | '<' relationright3= relationright | '<=' relationright4= relationright | '>=' relationright5= relationright | '>' relationright6= relationright )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            case 22:
                {
                alt8=5;
                }
                break;
            case 23:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:158:4: '=' relationright1= relationright
                    {
                    match(input,18,FOLLOW_18_in_relation370); 
                    pushFollow(FOLLOW_relationright_in_relation376);
                    relationright1=relationright();

                    state._fsp--;


                    				EqualOperator equalOperator = new EqualOperator((ArrayList)relationleft5, relationright1);
                    				List<Boolean> booleanList = new ArrayList<Boolean>(equalOperator.getResult());
                    				relationReturns = booleanList;
                    				

                    }
                    break;
                case 2 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:163:6: '/=' relationright2= relationright
                    {
                    match(input,19,FOLLOW_19_in_relation385); 
                    pushFollow(FOLLOW_relationright_in_relation391);
                    relationright2=relationright();

                    state._fsp--;


                    				InEqualOperator inEqualOperator = new InEqualOperator((ArrayList)relationleft5, relationright2);
                    				List<Boolean> booleanList = new ArrayList<Boolean>(inEqualOperator.getResult());
                    				relationReturns = booleanList;
                    				

                    }
                    break;
                case 3 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:168:6: '<' relationright3= relationright
                    {
                    match(input,20,FOLLOW_20_in_relation400); 
                    pushFollow(FOLLOW_relationright_in_relation406);
                    relationright3=relationright();

                    state._fsp--;


                    				LessOperator lessOperator = new LessOperator((ArrayList)relationleft5, relationright3);
                    				List<Boolean> booleanList = new ArrayList<Boolean>((ArrayList)lessOperator.getResult());
                    				relationReturns = booleanList;
                    				

                    }
                    break;
                case 4 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:173:6: '<=' relationright4= relationright
                    {
                    match(input,21,FOLLOW_21_in_relation415); 
                    pushFollow(FOLLOW_relationright_in_relation421);
                    relationright4=relationright();

                    state._fsp--;


                    				LessEqualOperator lessEqualOperator = new LessEqualOperator((ArrayList)relationleft5, relationright4);
                    				List<Boolean> booleanList = new ArrayList<Boolean>((ArrayList)lessEqualOperator.getResult());
                    				relationReturns = booleanList;
                    				

                    }
                    break;
                case 5 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:178:6: '>=' relationright5= relationright
                    {
                    match(input,22,FOLLOW_22_in_relation430); 
                    pushFollow(FOLLOW_relationright_in_relation436);
                    relationright5=relationright();

                    state._fsp--;


                    				GreaterEqualOperator greaterEqualOperator = new GreaterEqualOperator((ArrayList)relationleft5, relationright5);
                    				List<Boolean> booleanList = new ArrayList<Boolean>((ArrayList)greaterEqualOperator.getResult());
                    				relationReturns = booleanList;
                    				

                    }
                    break;
                case 6 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:183:6: '>' relationright6= relationright
                    {
                    match(input,23,FOLLOW_23_in_relation445); 
                    pushFollow(FOLLOW_relationright_in_relation451);
                    relationright6=relationright();

                    state._fsp--;


                    				GreaterOperator greaterOperator = new GreaterOperator((ArrayList)relationleft5, relationright6);
                    				List<Boolean> booleanList = new ArrayList<Boolean>((ArrayList)greaterOperator.getResult());
                    				relationReturns = booleanList;
                    				

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return relationReturns;
    }
    // $ANTLR end "relation"


    // $ANTLR start "relationleft"
    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:191:1: relationleft returns [List<ArrayList> relationleftReturns] : ( VARIABLE '.EntityType' | VARIABLE '.Attribute.' STRING | VARIABLE '.Property.' STRING | VARIABLE PLUGIN );
    public final List<ArrayList> relationleft() throws RecognitionException {
        List<ArrayList> relationleftReturns = null;

        Token VARIABLE6=null;
        Token VARIABLE7=null;
        Token STRING8=null;
        Token VARIABLE9=null;
        Token STRING10=null;
        Token PLUGIN11=null;
        Token VARIABLE12=null;

        try {
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:192:2: ( VARIABLE '.EntityType' | VARIABLE '.Attribute.' STRING | VARIABLE '.Property.' STRING | VARIABLE PLUGIN )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==VARIABLE) ) {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt9=1;
                    }
                    break;
                case 12:
                    {
                    alt9=2;
                    }
                    break;
                case 13:
                    {
                    alt9=3;
                    }
                    break;
                case PLUGIN:
                    {
                    alt9=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:192:4: VARIABLE '.EntityType'
                    {
                    VARIABLE6=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_relationleft473); 
                    match(input,24,FOLLOW_24_in_relationleft475); 

                    	    List<Object> objectList = new ArrayList<Object>(hashMapObjectList.get((VARIABLE6!=null?VARIABLE6.getText():null)));
                          GetEntityTypeMain getEntityTypeMain = new GetEntityTypeMain(objectList);
                          List<ArrayList> arrayListList = new ArrayList<ArrayList>((ArrayList)getEntityTypeMain.getResult());
                          relationleftReturns = arrayListList;
                    	

                    }
                    break;
                case 2 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:199:4: VARIABLE '.Attribute.' STRING
                    {
                    VARIABLE7=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_relationleft484); 
                    match(input,12,FOLLOW_12_in_relationleft486); 
                    STRING8=(Token)match(input,STRING,FOLLOW_STRING_in_relationleft488); 

                    			List<Object> objectList = new ArrayList<Object>(hashMapObjectList.get((VARIABLE7!=null?VARIABLE7.getText():null)));
                    			GetAttributeMain getAttributeMain = new GetAttributeMain(objectList, (STRING8!=null?STRING8.getText():null));
                    			List<ArrayList> arrayListList = new ArrayList<ArrayList>((ArrayList)getAttributeMain.getResult());
                    			relationleftReturns = arrayListList;
                    			

                    }
                    break;
                case 3 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:206:4: VARIABLE '.Property.' STRING
                    {
                    VARIABLE9=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_relationleft498); 
                    match(input,13,FOLLOW_13_in_relationleft500); 
                    STRING10=(Token)match(input,STRING,FOLLOW_STRING_in_relationleft502); 

                          List<Object> objectList = new ArrayList<Object>(hashMapObjectList.get((VARIABLE9!=null?VARIABLE9.getText():null)));
                          GetPropertyMain getPropertyMain = new GetPropertyMain(objectList, (STRING10!=null?STRING10.getText():null));
                          List<ArrayList> arrayListList = new ArrayList<ArrayList>((ArrayList)getPropertyMain.getResult());
                          relationleftReturns = arrayListList;
                          

                    }
                    break;
                case 4 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:212:5: VARIABLE PLUGIN
                    {
                    VARIABLE12=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_relationleft510); 
                    PLUGIN11=(Token)match(input,PLUGIN,FOLLOW_PLUGIN_in_relationleft512); 

                        System.out.println("searching plugin "+(PLUGIN11!=null?PLUGIN11.getText():null));
                          
                          
                          
                          
                          
                        List<List<Object>> results = new ArrayList<List<Object>>();
                        
                          List<Object> objectList = new ArrayList<Object>(hashMapObjectList.get((VARIABLE12!=null?VARIABLE12.getText():null)));
                          String keyword = (PLUGIN11!=null?PLUGIN11.getText():null);
                          keyword = keyword.replaceAll("^:","");
                          if (pluginKeywords.containsKey(keyword)){
                            System.out.println("found plugin for "+(PLUGIN11!=null?PLUGIN11.getText():null));
                            BIMQLGrammarPlugin plugin = pluginKeywords.get(keyword);
                            
                            plugin.init(ifcModel,objectList);
                            results=plugin.getResult();
                            
                          }
                          else {
                            System.out.println("no plugin for "+(PLUGIN11!=null?PLUGIN11.getText():null)+ " found");
                            ArrayList<Object> stringList = new ArrayList<Object>();
                           stringList.add(new String("test"));
                            for (Object object : objectList){
                              results.add(stringList);
                            }
                        
                          }
                          List<ArrayList> arrayListList = new ArrayList<ArrayList>((ArrayList)results);
                          relationleftReturns = arrayListList;
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return relationleftReturns;
    }
    // $ANTLR end "relationleft"


    // $ANTLR start "relationright"
    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:247:1: relationright returns [String relationrightReturns] : ( INTEGER | REAL | STRING );
    public final String relationright() throws RecognitionException {
        String relationrightReturns = null;

        Token INTEGER13=null;
        Token REAL14=null;
        Token STRING15=null;

        try {
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:248:3: ( INTEGER | REAL | STRING )
            int alt10=3;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt10=1;
                }
                break;
            case REAL:
                {
                alt10=2;
                }
                break;
            case STRING:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:248:5: INTEGER
                    {
                    INTEGER13=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_relationright535); 

                    				relationrightReturns = (INTEGER13!=null?INTEGER13.getText():null);
                    			

                    }
                    break;
                case 2 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:251:5: REAL
                    {
                    REAL14=(Token)match(input,REAL,FOLLOW_REAL_in_relationright543); 

                    				relationrightReturns = (REAL14!=null?REAL14.getText():null);
                    			

                    }
                    break;
                case 3 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:254:5: STRING
                    {
                    STRING15=(Token)match(input,STRING,FOLLOW_STRING_in_relationright551); 

                    				relationrightReturns = (STRING15!=null?STRING15.getText():null);
                    			

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return relationrightReturns;
    }
    // $ANTLR end "relationright"

    // Delegated rules


 

    public static final BitSet FOLLOW_select_in_bimql57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_select79 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VARIABLE_in_select81 = new BitSet(new long[]{0x000000000000C402L});
    public static final BitSet FOLLOW_where_in_select89 = new BitSet(new long[]{0x0000000000008402L});
    public static final BitSet FOLLOW_cascade_in_select115 = new BitSet(new long[]{0x0000000000008402L});
    public static final BitSet FOLLOW_set_in_select138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_cascade157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VARIABLE_in_cascade163 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cascade165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VARIABLE_in_cascade171 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_cascade177 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_in_cascade183 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_13_in_cascade191 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_in_cascade197 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_where_in_cascade209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_where230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_statement_in_where232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_set246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VARIABLE_in_set252 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_set254 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_in_set260 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_set262 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_INTEGER_in_set269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_set277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_set285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relation_in_statement307 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_16_in_statement317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_relation_in_statement323 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_17_in_statement333 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_relation_in_statement339 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_relationleft_in_relation361 = new BitSet(new long[]{0x0000000000FC0000L});
    public static final BitSet FOLLOW_18_in_relation370 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_relationright_in_relation376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_relation385 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_relationright_in_relation391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_relation400 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_relationright_in_relation406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_relation415 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_relationright_in_relation421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_relation430 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_relationright_in_relation436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_relation445 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_relationright_in_relation451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_relationleft473 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_relationleft475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_relationleft484 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_relationleft486 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_in_relationleft488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_relationleft498 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_relationleft500 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_in_relationleft502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_relationleft510 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PLUGIN_in_relationleft512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_relationright535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_relationright543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_relationright551 = new BitSet(new long[]{0x0000000000000002L});

}