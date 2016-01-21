// $ANTLR 3.4 C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g 2012-09-05 21:38:01

	package nl.wietmazairac.bimql;
	import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nl.wietmazairac.bimql.get.attribute.GetAttributeMain;
import nl.wietmazairac.bimql.get.entitytype.GetEntityTypeMain;
import nl.wietmazairac.bimql.get.property.GetPropertyMain;
import nl.wietmazairac.bimql.set.attribute.SetAttributeMain;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.models.ifc2x3tc1.IfcRoot;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class BimQLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INTEGER", "REAL", "STRING", "VARIABLE", "WS", "'.Attribute.'", "'.EntityType'", "'.Property.'", "'/='", "':='", "'<'", "'<='", "'='", "'>'", "'>='", "'And'", "'Or'", "'Select'", "'Set'", "'Where'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int INTEGER=4;
    public static final int REAL=5;
    public static final int STRING=6;
    public static final int VARIABLE=7;
    public static final int WS=8;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public BimQLParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public BimQLParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return BimQLParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g"; }


    	Map<String, List<Object>> hashMapObjectList = new HashMap<String, List<Object>>();
    	Map<String, IfcModelInterface> hashMapIfcModel = new HashMap<String, IfcModelInterface>();
    	


    // $ANTLR start "bimql"
    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:29:1: bimql[IfcModel ifcModel] returns [List<Object> bimqlReturns] : select[objectList] ;
    public final List<Object> bimql(IfcModelInterface ifcModel) throws RecognitionException {
        List<Object> bimqlReturns = null;


        List <Object> select1 =null;


        try {
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:30:2: ( select[objectList] )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:30:4: select[objectList]
            {
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
        	// do for sure before leaving
        }
        return bimqlReturns;
    }
    // $ANTLR end "bimql"



    // $ANTLR start "select"
    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:42:1: select[List<Object> objectList] returns [List <Object> selectReturns] : 'Select' VARIABLE ( where[$VARIABLE.text] )? ( cascade )* ( set )? ;
    public final List <Object> select(List<Object> objectList) throws RecognitionException {
        List <Object> selectReturns = null;


        Token VARIABLE2=null;
        String cascade3 =null;


        try {
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:43:2: ( 'Select' VARIABLE ( where[$VARIABLE.text] )? ( cascade )* ( set )? )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:43:4: 'Select' VARIABLE ( where[$VARIABLE.text] )? ( cascade )* ( set )?
            {
            match(input,21,FOLLOW_21_in_select79); 

            VARIABLE2=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_select81); 

                 
            			selectReturns = objectList;      
            			hashMapObjectList.put((VARIABLE2!=null?VARIABLE2.getText():null), objectList);
            		

            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:47:3: ( where[$VARIABLE.text] )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:47:5: where[$VARIABLE.text]
                    {
                    pushFollow(FOLLOW_where_in_select89);
                    where((VARIABLE2!=null?VARIABLE2.getText():null));

                    state._fsp--;


                       
                    				selectReturns = hashMapObjectList.get((VARIABLE2!=null?VARIABLE2.getText():null));
                    			

                    }
                    break;

            }


            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:51:9: ( cascade )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:51:11: cascade
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


            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:55:9: ( set )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:55:9: set
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
        	// do for sure before leaving
        }
        return selectReturns;
    }
    // $ANTLR end "select"



    // $ANTLR start "cascade"
    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:59:1: cascade returns [String cascadeReturns] : 'Select' VARIABLE1= VARIABLE ':=' VARIABLE2= VARIABLE ( '.Attribute.' string1= STRING | '.Property.' string2= STRING ) ( where[$VARIABLE1.text] )? ;
    public final String cascade() throws RecognitionException {
        String cascadeReturns = null;


        Token VARIABLE1=null;
        Token VARIABLE2=null;
        Token string1=null;
        Token string2=null;

        try {
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:60:2: ( 'Select' VARIABLE1= VARIABLE ':=' VARIABLE2= VARIABLE ( '.Attribute.' string1= STRING | '.Property.' string2= STRING ) ( where[$VARIABLE1.text] )? )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:60:4: 'Select' VARIABLE1= VARIABLE ':=' VARIABLE2= VARIABLE ( '.Attribute.' string1= STRING | '.Property.' string2= STRING ) ( where[$VARIABLE1.text] )?
            {
            match(input,21,FOLLOW_21_in_cascade157); 

            VARIABLE1=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_cascade163); 

            match(input,13,FOLLOW_13_in_cascade165); 

            VARIABLE2=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_cascade171); 

            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:61:3: ( '.Attribute.' string1= STRING | '.Property.' string2= STRING )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==9) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:61:5: '.Attribute.' string1= STRING
                    {
                    match(input,9,FOLLOW_9_in_cascade177); 

                    string1=(Token)match(input,STRING,FOLLOW_STRING_in_cascade183); 


                    				List<Object> objectList = new ArrayList<Object>(hashMapObjectList.get((VARIABLE2!=null?VARIABLE2.getText():null)));
                    				GetAttributeMain getAttributeMain = new GetAttributeMain(objectList, (string1!=null?string1.getText():null));
                    				List<List<Object>> arrayListList = new ArrayList<List<Object>>(getAttributeMain.getResult());
                    				objectList.clear();
                    				
                    				FlattenList flattenList = new FlattenList(arrayListList);				
                    				objectList = flattenList.getResult();
                    				
                    				hashMapObjectList.put((VARIABLE1!=null?VARIABLE1.getText():null), objectList);
                    				cascadeReturns = (VARIABLE1!=null?VARIABLE1.getText():null);
                    			

                    }
                    break;
                case 2 :
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:73:5: '.Property.' string2= STRING
                    {
                    match(input,11,FOLLOW_11_in_cascade191); 

                    string2=(Token)match(input,STRING,FOLLOW_STRING_in_cascade197); 


                    				List<Object> objectList = new ArrayList<Object>(hashMapObjectList.get((VARIABLE2!=null?VARIABLE2.getText():null)));
                    				GetPropertyMain getPropertyMain = new GetPropertyMain(objectList, (string2!=null?string2.getText():null));
                    				List<List<Object>> arrayListList = new ArrayList<List<Object>>(getPropertyMain.getResult());
                    				objectList.clear();
                    				FlattenList flattenList = new FlattenList(arrayListList);				
                    				objectList = flattenList.getResult();
                    				hashMapObjectList.put((VARIABLE1!=null?VARIABLE1.getText():null), objectList);
                    				cascadeReturns = (VARIABLE1!=null?VARIABLE1.getText():null);
                    	
                    			

                    }
                    break;

            }


            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:85:3: ( where[$VARIABLE1.text] )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:85:5: where[$VARIABLE1.text]
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
        	// do for sure before leaving
        }
        return cascadeReturns;
    }
    // $ANTLR end "cascade"



    // $ANTLR start "where"
    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:90:1: where[String string] : 'Where' statement ;
    public final void where(String string) throws RecognitionException {
        List<Boolean> statement4 =null;


        try {
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:91:2: ( 'Where' statement )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:91:4: 'Where' statement
            {
            match(input,23,FOLLOW_23_in_where230); 

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
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "where"



    // $ANTLR start "set"
    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:97:1: set : 'Set' VARIABLE1= VARIABLE '.Attribute.' string1= STRING ':=' (string2= INTEGER |string2= REAL |string2= STRING ) ;
    public final void set() throws RecognitionException {
        Token VARIABLE1=null;
        Token string1=null;
        Token string2=null;

        try {
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:98:2: ( 'Set' VARIABLE1= VARIABLE '.Attribute.' string1= STRING ':=' (string2= INTEGER |string2= REAL |string2= STRING ) )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:98:4: 'Set' VARIABLE1= VARIABLE '.Attribute.' string1= STRING ':=' (string2= INTEGER |string2= REAL |string2= STRING )
            {
            match(input,22,FOLLOW_22_in_set246); 

            VARIABLE1=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_set252); 

            match(input,9,FOLLOW_9_in_set254); 

            string1=(Token)match(input,STRING,FOLLOW_STRING_in_set260); 

            match(input,13,FOLLOW_13_in_set262); 

            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:98:67: (string2= INTEGER |string2= REAL |string2= STRING )
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
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:98:68: string2= INTEGER
                    {
                    string2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_set269); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:98:88: string2= REAL
                    {
                    string2=(Token)match(input,REAL,FOLLOW_REAL_in_set277); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:98:105: string2= STRING
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
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "set"



    // $ANTLR start "statement"
    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:104:1: statement returns [List<Boolean> statementReturns] : relation1= relation ( 'And' relation2= relation | 'Or' relation3= relation )* ;
    public final List<Boolean> statement() throws RecognitionException {
        List<Boolean> statementReturns = null;


        List<Boolean> relation1 =null;

        List<Boolean> relation2 =null;

        List<Boolean> relation3 =null;


        try {
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:105:2: (relation1= relation ( 'And' relation2= relation | 'Or' relation3= relation )* )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:105:4: relation1= relation ( 'And' relation2= relation | 'Or' relation3= relation )*
            {
            pushFollow(FOLLOW_relation_in_statement307);
            relation1=relation();

            state._fsp--;



            			List<Boolean> firstBooleanList = new ArrayList<Boolean>(relation1);
            			statementReturns = firstBooleanList;
            			

            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:109:3: ( 'And' relation2= relation | 'Or' relation3= relation )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }
                else if ( (LA7_0==20) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:110:3: 'And' relation2= relation
            	    {
            	    match(input,19,FOLLOW_19_in_statement317); 

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
            	    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:117:3: 'Or' relation3= relation
            	    {
            	    match(input,20,FOLLOW_20_in_statement333); 

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
        	// do for sure before leaving
        }
        return statementReturns;
    }
    // $ANTLR end "statement"



    // $ANTLR start "relation"
    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:126:1: relation returns [List<Boolean> relationReturns] : relationleft ( '=' relationright1= relationright | '/=' relationright2= relationright | '<' relationright3= relationright | '<=' relationright4= relationright | '>=' relationright5= relationright | '>' relationright6= relationright ) ;
    public final List<Boolean> relation() throws RecognitionException {
        List<Boolean> relationReturns = null;


        String relationright1 =null;

        String relationright2 =null;

        String relationright3 =null;

        String relationright4 =null;

        String relationright5 =null;

        String relationright6 =null;

        List<List<Object>> relationleft5 =null;


        try {
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:127:2: ( relationleft ( '=' relationright1= relationright | '/=' relationright2= relationright | '<' relationright3= relationright | '<=' relationright4= relationright | '>=' relationright5= relationright | '>' relationright6= relationright ) )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:127:4: relationleft ( '=' relationright1= relationright | '/=' relationright2= relationright | '<' relationright3= relationright | '<=' relationright4= relationright | '>=' relationright5= relationright | '>' relationright6= relationright )
            {
            pushFollow(FOLLOW_relationleft_in_relation361);
            relationleft5=relationleft();

            state._fsp--;


            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:128:3: ( '=' relationright1= relationright | '/=' relationright2= relationright | '<' relationright3= relationright | '<=' relationright4= relationright | '>=' relationright5= relationright | '>' relationright6= relationright )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 14:
                {
                alt8=3;
                }
                break;
            case 15:
                {
                alt8=4;
                }
                break;
            case 18:
                {
                alt8=5;
                }
                break;
            case 17:
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
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:129:4: '=' relationright1= relationright
                    {
                    match(input,16,FOLLOW_16_in_relation370); 

                    pushFollow(FOLLOW_relationright_in_relation376);
                    relationright1=relationright();

                    state._fsp--;



                    				EqualOperator equalOperator = new EqualOperator(relationleft5, relationright1);
                    				List<Boolean> booleanList = new ArrayList<Boolean>(equalOperator.getResult());
                    				relationReturns = booleanList;
                    				

                    }
                    break;
                case 2 :
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:134:6: '/=' relationright2= relationright
                    {
                    match(input,12,FOLLOW_12_in_relation385); 

                    pushFollow(FOLLOW_relationright_in_relation391);
                    relationright2=relationright();

                    state._fsp--;



                    				InEqualOperator inEqualOperator = new InEqualOperator(relationleft5, relationright2);
                    				List<Boolean> booleanList = new ArrayList<Boolean>(inEqualOperator.getResult());
                    				relationReturns = booleanList;
                    				

                    }
                    break;
                case 3 :
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:139:6: '<' relationright3= relationright
                    {
                    match(input,14,FOLLOW_14_in_relation400); 

                    pushFollow(FOLLOW_relationright_in_relation406);
                    relationright3=relationright();

                    state._fsp--;



                    				LessOperator lessOperator = new LessOperator(relationleft5, relationright3);
                    				List<Boolean> booleanList = new ArrayList<Boolean>(lessOperator.getResult());
                    				relationReturns = booleanList;
                    				

                    }
                    break;
                case 4 :
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:144:6: '<=' relationright4= relationright
                    {
                    match(input,15,FOLLOW_15_in_relation415); 

                    pushFollow(FOLLOW_relationright_in_relation421);
                    relationright4=relationright();

                    state._fsp--;



                    				LessEqualOperator lessEqualOperator = new LessEqualOperator(relationleft5, relationright4);
                    				List<Boolean> booleanList = new ArrayList<Boolean>(lessEqualOperator.getResult());
                    				relationReturns = booleanList;
                    				

                    }
                    break;
                case 5 :
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:149:6: '>=' relationright5= relationright
                    {
                    match(input,18,FOLLOW_18_in_relation430); 

                    pushFollow(FOLLOW_relationright_in_relation436);
                    relationright5=relationright();

                    state._fsp--;



                    				GreaterEqualOperator greaterEqualOperator = new GreaterEqualOperator(relationleft5, relationright5);
                    				List<Boolean> booleanList = new ArrayList<Boolean>(greaterEqualOperator.getResult());
                    				relationReturns = booleanList;
                    				

                    }
                    break;
                case 6 :
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:154:6: '>' relationright6= relationright
                    {
                    match(input,17,FOLLOW_17_in_relation445); 

                    pushFollow(FOLLOW_relationright_in_relation451);
                    relationright6=relationright();

                    state._fsp--;



                    				GreaterOperator greaterOperator = new GreaterOperator(relationleft5, relationright6);
                    				List<Boolean> booleanList = new ArrayList<Boolean>(greaterOperator.getResult());
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
        	// do for sure before leaving
        }
        return relationReturns;
    }
    // $ANTLR end "relation"



    // $ANTLR start "relationleft"
    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:162:1: relationleft returns [List<ArrayList> relationleftReturns] : ( VARIABLE '.EntityType' | VARIABLE '.Attribute.' STRING | VARIABLE '.Property.' STRING );
    public final List<List<Object>> relationleft() throws RecognitionException {
        List<List<Object>> relationleftReturns = null;


        Token VARIABLE6=null;
        Token VARIABLE7=null;
        Token STRING8=null;
        Token VARIABLE9=null;
        Token STRING10=null;

        try {
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:163:2: ( VARIABLE '.EntityType' | VARIABLE '.Attribute.' STRING | VARIABLE '.Property.' STRING )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==VARIABLE) ) {
                switch ( input.LA(2) ) {
                case 10:
                    {
                    alt9=1;
                    }
                    break;
                case 9:
                    {
                    alt9=2;
                    }
                    break;
                case 11:
                    {
                    alt9=3;
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
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:163:4: VARIABLE '.EntityType'
                    {
                    VARIABLE6=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_relationleft473); 

                    match(input,10,FOLLOW_10_in_relationleft475); 


                    	  List<Object> objectList = new ArrayList<Object>(hashMapObjectList.get((VARIABLE6!=null?VARIABLE6.getText():null)));
                          GetEntityTypeMain getEntityTypeMain = new GetEntityTypeMain(objectList);
                          List<List<Object>> arrayListList = new ArrayList<List<Object>>(getEntityTypeMain.getResult());
                          relationleftReturns = arrayListList;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:170:4: VARIABLE '.Attribute.' STRING
                    {
                    VARIABLE7=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_relationleft484); 

                    match(input,9,FOLLOW_9_in_relationleft486); 

                    STRING8=(Token)match(input,STRING,FOLLOW_STRING_in_relationleft488); 


                    			List<Object> objectList = new ArrayList<Object>(hashMapObjectList.get((VARIABLE7!=null?VARIABLE7.getText():null)));
                    			GetAttributeMain getAttributeMain = new GetAttributeMain(objectList, (STRING8!=null?STRING8.getText():null));
                    			List<List<Object>> arrayListList = new ArrayList<List<Object>>(getAttributeMain.getResult());
                    			relationleftReturns = arrayListList;
                    			

                    }
                    break;
                case 3 :
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:177:4: VARIABLE '.Property.' STRING
                    {
                    VARIABLE9=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_relationleft498); 

                    match(input,11,FOLLOW_11_in_relationleft500); 

                    STRING10=(Token)match(input,STRING,FOLLOW_STRING_in_relationleft502); 


                          List<Object> objectList = new ArrayList<Object>(hashMapObjectList.get((VARIABLE9!=null?VARIABLE9.getText():null)));
                          GetPropertyMain getPropertyMain = new GetPropertyMain(objectList, (STRING10!=null?STRING10.getText():null));
                          List<List<Object>> arrayListList = new ArrayList<List<Object>>(getPropertyMain.getResult());
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
        	// do for sure before leaving
        }
        return relationleftReturns;
    }
    // $ANTLR end "relationleft"



    // $ANTLR start "relationright"
    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:185:1: relationright returns [String relationrightReturns] : ( INTEGER | REAL | STRING );
    public final String relationright() throws RecognitionException {
        String relationrightReturns = null;


        Token INTEGER11=null;
        Token REAL12=null;
        Token STRING13=null;

        try {
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:186:3: ( INTEGER | REAL | STRING )
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
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:186:5: INTEGER
                    {
                    INTEGER11=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_relationright522); 


                    				relationrightReturns = (INTEGER11!=null?INTEGER11.getText():null);
                    			

                    }
                    break;
                case 2 :
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:189:5: REAL
                    {
                    REAL12=(Token)match(input,REAL,FOLLOW_REAL_in_relationright530); 


                    				relationrightReturns = (REAL12!=null?REAL12.getText():null);
                    			

                    }
                    break;
                case 3 :
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:192:5: STRING
                    {
                    STRING13=(Token)match(input,STRING,FOLLOW_STRING_in_relationright538); 


                    				relationrightReturns = (STRING13!=null?STRING13.getText():null);
                    			

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return relationrightReturns;
    }
    // $ANTLR end "relationright"

    // Delegated rules


 

    public static final BitSet FOLLOW_select_in_bimql57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_select79 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_VARIABLE_in_select81 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_where_in_select89 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_cascade_in_select115 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_set_in_select138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_cascade157 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_VARIABLE_in_cascade163 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_cascade165 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_VARIABLE_in_cascade171 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_9_in_cascade177 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_in_cascade183 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_11_in_cascade191 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_in_cascade197 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_where_in_cascade209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_where230 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_statement_in_where232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_set246 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_VARIABLE_in_set252 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_set254 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_in_set260 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_set262 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_INTEGER_in_set269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_set277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_set285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relation_in_statement307 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_statement317 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_relation_in_statement323 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_20_in_statement333 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_relation_in_statement339 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_relationleft_in_relation361 = new BitSet(new long[]{0x000000000007D000L});
    public static final BitSet FOLLOW_16_in_relation370 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_relationright_in_relation376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_relation385 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_relationright_in_relation391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_relation400 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_relationright_in_relation406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_relation415 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_relationright_in_relation421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_relation430 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_relationright_in_relation436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_relation445 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_relationright_in_relation451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_relationleft473 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_relationleft475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_relationleft484 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_relationleft486 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_in_relationleft488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_relationleft498 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_relationleft500 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_in_relationleft502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_relationright522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_relationright530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_relationright538 = new BitSet(new long[]{0x0000000000000002L});

}