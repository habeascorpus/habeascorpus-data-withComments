// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g 2013-01-24 15:45:48

    package org.apache.cassandra.cql3;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.EnumSet;
    import java.util.HashMap;
    import java.util.LinkedHashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.Set;

    import org.apache.cassandra.auth.Permission;
    import org.apache.cassandra.auth.DataResource;
    import org.apache.cassandra.auth.IResource;
    import org.apache.cassandra.cql3.operations.*;
    import org.apache.cassandra.cql3.statements.*;
    import org.apache.cassandra.db.marshal.CollectionType;
    import org.apache.cassandra.exceptions.ConfigurationException;
    import org.apache.cassandra.exceptions.InvalidRequestException;
    import org.apache.cassandra.exceptions.SyntaxException;
    import org.apache.cassandra.utils.Pair;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "K_USE", "K_SELECT", "K_COUNT", "K_FROM", "K_WHERE", "K_ORDER", "K_BY", "K_LIMIT", "INTEGER", "K_ALLOW", "K_FILTERING", "K_WRITETIME", "K_TTL", "K_AND", "K_ASC", "K_DESC", "K_INSERT", "K_INTO", "K_VALUES", "K_USING", "K_TIMESTAMP", "K_UPDATE", "K_SET", "K_DELETE", "K_BEGIN", "K_UNLOGGED", "K_COUNTER", "K_BATCH", "K_APPLY", "K_CREATE", "K_KEYSPACE", "K_WITH", "K_COLUMNFAMILY", "K_PRIMARY", "K_KEY", "K_COMPACT", "K_STORAGE", "K_CLUSTERING", "K_INDEX", "IDENT", "K_ON", "K_ALTER", "K_TYPE", "K_ADD", "K_RENAME", "K_TO", "K_DROP", "K_TRUNCATE", "K_GRANT", "K_REVOKE", "K_LIST", "K_OF", "K_NORECURSIVE", "K_MODIFY", "K_AUTHORIZE", "K_ALL", "K_PERMISSIONS", "K_PERMISSION", "K_KEYSPACES", "K_USER", "K_SUPERUSER", "K_NOSUPERUSER", "K_USERS", "K_PASSWORD", "STRING_LITERAL", "QUOTED_NAME", "QMARK", "UUID", "FLOAT", "K_TRUE", "K_FALSE", "K_TOKEN", "K_IN", "K_ASCII", "K_BIGINT", "K_BLOB", "K_BOOLEAN", "K_DECIMAL", "K_DOUBLE", "K_FLOAT", "K_INET", "K_INT", "K_TEXT", "K_UUID", "K_VARCHAR", "K_VARINT", "K_TIMEUUID", "K_MAP", "S", "E", "L", "C", "T", "F", "R", "O", "M", "W", "H", "A", "N", "D", "K", "Y", "I", "U", "P", "G", "B", "X", "V", "Z", "J", "Q", "DIGIT", "LETTER", "HEX", "WS", "COMMENT", "MULTILINE_COMMENT", "';'", "'('", "')'", "','", "'\\*'", "'['", "']'", "'.'", "'{'", "'}'", "':'", "'='", "'+'", "'-'", "'<'", "'<='", "'>='", "'>'"
    };
    public static final int K_FALSE=74;
    public static final int K_TRUE=73;
    public static final int K_PERMISSIONS=60;
    public static final int LETTER=119;
    public static final int K_INT=85;
    public static final int K_PERMISSION=61;
    public static final int K_CREATE=33;
    public static final int K_CLUSTERING=41;
    public static final int K_WRITETIME=15;
    public static final int EOF=-1;
    public static final int K_PRIMARY=37;
    public static final int K_AUTHORIZE=58;
    public static final int K_VALUES=22;
    public static final int K_USE=4;
    public static final int STRING_LITERAL=68;
    public static final int K_GRANT=52;
    public static final int K_ON=44;
    public static final int K_USING=23;
    public static final int K_ADD=47;
    public static final int K_ASC=18;
    public static final int K_KEY=38;
    public static final int COMMENT=122;
    public static final int K_TRUNCATE=51;
    public static final int K_ORDER=9;
    public static final int K_OF=55;
    public static final int K_ALL=59;
    public static final int D=105;
    public static final int T__139=139;
    public static final int E=93;
    public static final int T__138=138;
    public static final int F=97;
    public static final int T__137=137;
    public static final int G=111;
    public static final int T__136=136;
    public static final int K_COUNT=6;
    public static final int K_KEYSPACE=34;
    public static final int K_TYPE=46;
    public static final int A=103;
    public static final int B=112;
    public static final int C=95;
    public static final int L=94;
    public static final int M=100;
    public static final int N=104;
    public static final int O=99;
    public static final int H=102;
    public static final int I=108;
    public static final int J=116;
    public static final int K_UPDATE=25;
    public static final int K=106;
    public static final int K_FILTERING=14;
    public static final int U=109;
    public static final int T=96;
    public static final int W=101;
    public static final int K_TEXT=86;
    public static final int V=114;
    public static final int Q=117;
    public static final int P=110;
    public static final int K_COMPACT=39;
    public static final int S=92;
    public static final int R=98;
    public static final int T__141=141;
    public static final int K_TTL=16;
    public static final int T__140=140;
    public static final int Y=107;
    public static final int X=113;
    public static final int Z=115;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int K_INDEX=42;
    public static final int T__128=128;
    public static final int K_INSERT=20;
    public static final int T__127=127;
    public static final int WS=121;
    public static final int T__129=129;
    public static final int K_RENAME=48;
    public static final int K_APPLY=32;
    public static final int K_INET=84;
    public static final int K_STORAGE=40;
    public static final int K_TIMESTAMP=24;
    public static final int K_AND=17;
    public static final int K_DESC=19;
    public static final int T__130=130;
    public static final int K_TOKEN=75;
    public static final int T__131=131;
    public static final int QMARK=70;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int K_UUID=87;
    public static final int T__135=135;
    public static final int K_BATCH=31;
    public static final int K_ASCII=77;
    public static final int UUID=71;
    public static final int K_LIST=54;
    public static final int K_DELETE=27;
    public static final int T__124=124;
    public static final int K_TO=49;
    public static final int K_BY=10;
    public static final int FLOAT=72;
    public static final int K_VARINT=89;
    public static final int K_FLOAT=83;
    public static final int K_SUPERUSER=64;
    public static final int K_DOUBLE=82;
    public static final int K_SELECT=5;
    public static final int K_LIMIT=11;
    public static final int K_BOOLEAN=80;
    public static final int K_ALTER=45;
    public static final int K_SET=26;
    public static final int K_WHERE=8;
    public static final int QUOTED_NAME=69;
    public static final int MULTILINE_COMMENT=123;
    public static final int K_BLOB=79;
    public static final int K_UNLOGGED=29;
    public static final int HEX=120;
    public static final int K_INTO=21;
    public static final int K_PASSWORD=67;
    public static final int K_REVOKE=53;
    public static final int K_ALLOW=13;
    public static final int K_VARCHAR=88;
    public static final int IDENT=43;
    public static final int DIGIT=118;
    public static final int K_USERS=66;
    public static final int K_BEGIN=28;
    public static final int INTEGER=12;
    public static final int K_KEYSPACES=62;
    public static final int K_COUNTER=30;
    public static final int K_DECIMAL=81;
    public static final int K_WITH=35;
    public static final int K_IN=76;
    public static final int K_NORECURSIVE=56;
    public static final int K_MAP=91;
    public static final int K_FROM=7;
    public static final int K_COLUMNFAMILY=36;
    public static final int K_MODIFY=57;
    public static final int K_DROP=50;
    public static final int K_NOSUPERUSER=65;
    public static final int K_BIGINT=78;
    public static final int K_TIMEUUID=90;
    public static final int K_USER=63;

    // delegates
    // delegators


        public CqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return CqlParser.tokenNames; }
    public String getGrammarFileName() { return "/home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g"; }


        private List<String> recognitionErrors = new ArrayList<String>();
        private int currentBindMarkerIdx = -1;

        public void displayRecognitionError(String[] tokenNames, RecognitionException e)
        {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            recognitionErrors.add(hdr + " " + msg);
        }

        public void addRecognitionError(String msg)
        {
            recognitionErrors.add(msg);
        }

        public List<String> getRecognitionErrors()
        {
            return recognitionErrors;
        }

        public void throwLastRecognitionError() throws SyntaxException
        {
            if (recognitionErrors.size() > 0)
                throw new SyntaxException(recognitionErrors.get((recognitionErrors.size()-1)));
        }

        // used by UPDATE of the counter columns to validate if '-' was supplied by user
        public void validateMinusSupplied(Object op, final Term value, IntStream stream) throws MissingTokenException
        {
            if (op == null && Long.parseLong(value.getText()) > 0)
                throw new MissingTokenException(102, stream, value);
        }

        public Map<String, String> convertMap(Map<Term, Term> terms)
        {
            if (terms == null || terms.isEmpty())
                return Collections.<String, String>emptyMap();

            Map<String, String> res = new HashMap<String, String>(terms.size());

            for (Map.Entry<Term, Term> entry : terms.entrySet())
            {
                // Because the parser tries to be smart and recover on error (to
                // allow displaying more than one error I suppose), we have null
                // entries in there. Just skip those, a proper error will be thrown in the end.
                if (entry.getKey() == null || entry.getValue() == null)
                    break;
                res.put(entry.getKey().getText(), entry.getValue().getText());
            }

            return res;
        }



    // $ANTLR start "query"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:150:1: query returns [ParsedStatement stmnt] : st= cqlStatement ( ';' )* EOF ;
    public final ParsedStatement query() throws RecognitionException {
        ParsedStatement stmnt = null;

        ParsedStatement st = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:153:5: (st= cqlStatement ( ';' )* EOF )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:153:7: st= cqlStatement ( ';' )* EOF
            {
            pushFollow(FOLLOW_cqlStatement_in_query72);
            st=cqlStatement();

            state._fsp--;

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:153:23: ( ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==124) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:153:24: ';'
            	    {
            	    match(input,124,FOLLOW_124_in_query75); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_query79); 
             stmnt = st; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmnt;
    }
    // $ANTLR end "query"


    // $ANTLR start "cqlStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:156:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createColumnFamilyStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropColumnFamilyStatement | st13= dropIndexStatement | st14= alterTableStatement | st15= alterKeyspaceStatement | st16= grantStatement | st17= revokeStatement | st18= listPermissionsStatement | st19= createUserStatement | st20= alterUserStatement | st21= dropUserStatement | st22= listUsersStatement );
    public final ParsedStatement cqlStatement() throws RecognitionException {
        ParsedStatement stmt = null;

        SelectStatement.RawStatement st1 = null;

        UpdateStatement st2 = null;

        UpdateStatement st3 = null;

        BatchStatement st4 = null;

        DeleteStatement st5 = null;

        UseStatement st6 = null;

        TruncateStatement st7 = null;

        CreateKeyspaceStatement st8 = null;

        CreateColumnFamilyStatement.RawStatement st9 = null;

        CreateIndexStatement st10 = null;

        DropKeyspaceStatement st11 = null;

        DropColumnFamilyStatement st12 = null;

        DropIndexStatement st13 = null;

        AlterTableStatement st14 = null;

        AlterKeyspaceStatement st15 = null;

        GrantStatement st16 = null;

        RevokeStatement st17 = null;

        ListPermissionsStatement st18 = null;

        CreateUserStatement st19 = null;

        AlterUserStatement st20 = null;

        DropUserStatement st21 = null;

        ListUsersStatement st22 = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:158:5: (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createColumnFamilyStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropColumnFamilyStatement | st13= dropIndexStatement | st14= alterTableStatement | st15= alterKeyspaceStatement | st16= grantStatement | st17= revokeStatement | st18= listPermissionsStatement | st19= createUserStatement | st20= alterUserStatement | st21= dropUserStatement | st22= listUsersStatement )
            int alt2=22;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:158:7: st1= selectStatement
                    {
                    pushFollow(FOLLOW_selectStatement_in_cqlStatement113);
                    st1=selectStatement();

                    state._fsp--;

                     stmt = st1; 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:159:7: st2= insertStatement
                    {
                    pushFollow(FOLLOW_insertStatement_in_cqlStatement138);
                    st2=insertStatement();

                    state._fsp--;

                     stmt = st2; 

                    }
                    break;
                case 3 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:160:7: st3= updateStatement
                    {
                    pushFollow(FOLLOW_updateStatement_in_cqlStatement163);
                    st3=updateStatement();

                    state._fsp--;

                     stmt = st3; 

                    }
                    break;
                case 4 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:161:7: st4= batchStatement
                    {
                    pushFollow(FOLLOW_batchStatement_in_cqlStatement188);
                    st4=batchStatement();

                    state._fsp--;

                     stmt = st4; 

                    }
                    break;
                case 5 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:162:7: st5= deleteStatement
                    {
                    pushFollow(FOLLOW_deleteStatement_in_cqlStatement214);
                    st5=deleteStatement();

                    state._fsp--;

                     stmt = st5; 

                    }
                    break;
                case 6 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:163:7: st6= useStatement
                    {
                    pushFollow(FOLLOW_useStatement_in_cqlStatement239);
                    st6=useStatement();

                    state._fsp--;

                     stmt = st6; 

                    }
                    break;
                case 7 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:164:7: st7= truncateStatement
                    {
                    pushFollow(FOLLOW_truncateStatement_in_cqlStatement267);
                    st7=truncateStatement();

                    state._fsp--;

                     stmt = st7; 

                    }
                    break;
                case 8 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:165:7: st8= createKeyspaceStatement
                    {
                    pushFollow(FOLLOW_createKeyspaceStatement_in_cqlStatement290);
                    st8=createKeyspaceStatement();

                    state._fsp--;

                     stmt = st8; 

                    }
                    break;
                case 9 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:166:7: st9= createColumnFamilyStatement
                    {
                    pushFollow(FOLLOW_createColumnFamilyStatement_in_cqlStatement307);
                    st9=createColumnFamilyStatement();

                    state._fsp--;

                     stmt = st9; 

                    }
                    break;
                case 10 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:167:7: st10= createIndexStatement
                    {
                    pushFollow(FOLLOW_createIndexStatement_in_cqlStatement319);
                    st10=createIndexStatement();

                    state._fsp--;

                     stmt = st10; 

                    }
                    break;
                case 11 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:168:7: st11= dropKeyspaceStatement
                    {
                    pushFollow(FOLLOW_dropKeyspaceStatement_in_cqlStatement338);
                    st11=dropKeyspaceStatement();

                    state._fsp--;

                     stmt = st11; 

                    }
                    break;
                case 12 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:169:7: st12= dropColumnFamilyStatement
                    {
                    pushFollow(FOLLOW_dropColumnFamilyStatement_in_cqlStatement356);
                    st12=dropColumnFamilyStatement();

                    state._fsp--;

                     stmt = st12; 

                    }
                    break;
                case 13 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:170:7: st13= dropIndexStatement
                    {
                    pushFollow(FOLLOW_dropIndexStatement_in_cqlStatement370);
                    st13=dropIndexStatement();

                    state._fsp--;

                     stmt = st13; 

                    }
                    break;
                case 14 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:171:7: st14= alterTableStatement
                    {
                    pushFollow(FOLLOW_alterTableStatement_in_cqlStatement391);
                    st14=alterTableStatement();

                    state._fsp--;

                     stmt = st14; 

                    }
                    break;
                case 15 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:172:7: st15= alterKeyspaceStatement
                    {
                    pushFollow(FOLLOW_alterKeyspaceStatement_in_cqlStatement411);
                    st15=alterKeyspaceStatement();

                    state._fsp--;

                     stmt = st15; 

                    }
                    break;
                case 16 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:173:7: st16= grantStatement
                    {
                    pushFollow(FOLLOW_grantStatement_in_cqlStatement428);
                    st16=grantStatement();

                    state._fsp--;

                     stmt = st16; 

                    }
                    break;
                case 17 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:174:7: st17= revokeStatement
                    {
                    pushFollow(FOLLOW_revokeStatement_in_cqlStatement453);
                    st17=revokeStatement();

                    state._fsp--;

                     stmt = st17; 

                    }
                    break;
                case 18 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:175:7: st18= listPermissionsStatement
                    {
                    pushFollow(FOLLOW_listPermissionsStatement_in_cqlStatement477);
                    st18=listPermissionsStatement();

                    state._fsp--;

                     stmt = st18; 

                    }
                    break;
                case 19 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:176:7: st19= createUserStatement
                    {
                    pushFollow(FOLLOW_createUserStatement_in_cqlStatement492);
                    st19=createUserStatement();

                    state._fsp--;

                     stmt = st19; 

                    }
                    break;
                case 20 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:177:7: st20= alterUserStatement
                    {
                    pushFollow(FOLLOW_alterUserStatement_in_cqlStatement512);
                    st20=alterUserStatement();

                    state._fsp--;

                     stmt = st20; 

                    }
                    break;
                case 21 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:178:7: st21= dropUserStatement
                    {
                    pushFollow(FOLLOW_dropUserStatement_in_cqlStatement533);
                    st21=dropUserStatement();

                    state._fsp--;

                     stmt = st21; 

                    }
                    break;
                case 22 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:179:7: st22= listUsersStatement
                    {
                    pushFollow(FOLLOW_listUsersStatement_in_cqlStatement555);
                    st22=listUsersStatement();

                    state._fsp--;

                     stmt = st22; 

                    }
                    break;

            }
             if (stmt != null) stmt.setBoundTerms(currentBindMarkerIdx + 1); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "cqlStatement"


    // $ANTLR start "useStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:185:1: useStatement returns [UseStatement stmt] : K_USE ks= keyspaceName ;
    public final UseStatement useStatement() throws RecognitionException {
        UseStatement stmt = null;

        String ks = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:186:5: ( K_USE ks= keyspaceName )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:186:7: K_USE ks= keyspaceName
            {
            match(input,K_USE,FOLLOW_K_USE_in_useStatement589); 
            pushFollow(FOLLOW_keyspaceName_in_useStatement593);
            ks=keyspaceName();

            state._fsp--;

             stmt = new UseStatement(ks); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "useStatement"


    // $ANTLR start "selectStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:189:1: selectStatement returns [SelectStatement.RawStatement expr] : K_SELECT (sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= INTEGER )? ( K_ALLOW K_FILTERING )? ;
    public final SelectStatement.RawStatement selectStatement() throws RecognitionException {
        SelectStatement.RawStatement expr = null;

        Token rows=null;
        List<Selector> sclause = null;

        CFName cf = null;

        List<Relation> wclause = null;



                boolean isCount = false;
                int limit = Integer.MAX_VALUE;
                Map<ColumnIdentifier, Boolean> orderings = new LinkedHashMap<ColumnIdentifier, Boolean>();
                boolean allowFiltering = false;
            
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:202:5: ( K_SELECT (sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= INTEGER )? ( K_ALLOW K_FILTERING )? )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:202:7: K_SELECT (sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= INTEGER )? ( K_ALLOW K_FILTERING )?
            {
            match(input,K_SELECT,FOLLOW_K_SELECT_in_selectStatement627); 
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:202:16: (sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=K_FILTERING && LA3_0<=K_TTL)||LA3_0==K_VALUES||LA3_0==K_TIMESTAMP||LA3_0==K_COUNTER||(LA3_0>=K_KEY && LA3_0<=K_CLUSTERING)||LA3_0==IDENT||LA3_0==K_TYPE||LA3_0==K_LIST||(LA3_0>=K_ALL && LA3_0<=K_PASSWORD)||LA3_0==QUOTED_NAME||(LA3_0>=K_ASCII && LA3_0<=K_MAP)||LA3_0==128) ) {
                alt3=1;
            }
            else if ( (LA3_0==K_COUNT) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==125) ) {
                    alt3=2;
                }
                else if ( (LA3_2==K_FROM||LA3_2==127) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:202:18: sclause= selectClause
                    {
                    pushFollow(FOLLOW_selectClause_in_selectStatement633);
                    sclause=selectClause();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:202:41: ( K_COUNT '(' sclause= selectCountClause ')' )
                    {
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:202:41: ( K_COUNT '(' sclause= selectCountClause ')' )
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:202:42: K_COUNT '(' sclause= selectCountClause ')'
                    {
                    match(input,K_COUNT,FOLLOW_K_COUNT_in_selectStatement638); 
                    match(input,125,FOLLOW_125_in_selectStatement640); 
                    pushFollow(FOLLOW_selectCountClause_in_selectStatement644);
                    sclause=selectCountClause();

                    state._fsp--;

                    match(input,126,FOLLOW_126_in_selectStatement646); 
                     isCount = true; 

                    }


                    }
                    break;

            }

            match(input,K_FROM,FOLLOW_K_FROM_in_selectStatement659); 
            pushFollow(FOLLOW_columnFamilyName_in_selectStatement663);
            cf=columnFamilyName();

            state._fsp--;

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:204:7: ( K_WHERE wclause= whereClause )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==K_WHERE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:204:9: K_WHERE wclause= whereClause
                    {
                    match(input,K_WHERE,FOLLOW_K_WHERE_in_selectStatement673); 
                    pushFollow(FOLLOW_whereClause_in_selectStatement677);
                    wclause=whereClause();

                    state._fsp--;


                    }
                    break;

            }

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:205:7: ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==K_ORDER) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:205:9: K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )*
                    {
                    match(input,K_ORDER,FOLLOW_K_ORDER_in_selectStatement690); 
                    match(input,K_BY,FOLLOW_K_BY_in_selectStatement692); 
                    pushFollow(FOLLOW_orderByClause_in_selectStatement694);
                    orderByClause(orderings);

                    state._fsp--;

                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:205:47: ( ',' orderByClause[orderings] )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==127) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:205:49: ',' orderByClause[orderings]
                    	    {
                    	    match(input,127,FOLLOW_127_in_selectStatement699); 
                    	    pushFollow(FOLLOW_orderByClause_in_selectStatement701);
                    	    orderByClause(orderings);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:206:7: ( K_LIMIT rows= INTEGER )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==K_LIMIT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:206:9: K_LIMIT rows= INTEGER
                    {
                    match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement718); 
                    rows=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_selectStatement722); 
                     limit = Integer.parseInt((rows!=null?rows.getText():null)); 

                    }
                    break;

            }

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:207:7: ( K_ALLOW K_FILTERING )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==K_ALLOW) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:207:9: K_ALLOW K_FILTERING
                    {
                    match(input,K_ALLOW,FOLLOW_K_ALLOW_in_selectStatement737); 
                    match(input,K_FILTERING,FOLLOW_K_FILTERING_in_selectStatement739); 
                     allowFiltering = true; 

                    }
                    break;

            }


                      SelectStatement.Parameters params = new SelectStatement.Parameters(limit,
                                                                                         orderings,
                                                                                         isCount,
                                                                                         allowFiltering);
                      expr = new SelectStatement.RawStatement(cf, params, sclause, wclause);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectStatement"


    // $ANTLR start "selectClause"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:217:1: selectClause returns [List<Selector> expr] : (t1= selector ( ',' tN= selector )* | '\\*' );
    public final List<Selector> selectClause() throws RecognitionException {
        List<Selector> expr = null;

        Selector t1 = null;

        Selector tN = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:218:5: (t1= selector ( ',' tN= selector )* | '\\*' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==K_COUNT||(LA10_0>=K_FILTERING && LA10_0<=K_TTL)||LA10_0==K_VALUES||LA10_0==K_TIMESTAMP||LA10_0==K_COUNTER||(LA10_0>=K_KEY && LA10_0<=K_CLUSTERING)||LA10_0==IDENT||LA10_0==K_TYPE||LA10_0==K_LIST||(LA10_0>=K_ALL && LA10_0<=K_PASSWORD)||LA10_0==QUOTED_NAME||(LA10_0>=K_ASCII && LA10_0<=K_MAP)) ) {
                alt10=1;
            }
            else if ( (LA10_0==128) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:218:7: t1= selector ( ',' tN= selector )*
                    {
                    pushFollow(FOLLOW_selector_in_selectClause776);
                    t1=selector();

                    state._fsp--;

                     expr = new ArrayList<Selector>(); expr.add(t1); 
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:218:73: ( ',' tN= selector )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==127) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:218:74: ',' tN= selector
                    	    {
                    	    match(input,127,FOLLOW_127_in_selectClause781); 
                    	    pushFollow(FOLLOW_selector_in_selectClause785);
                    	    tN=selector();

                    	    state._fsp--;

                    	     expr.add(tN); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:219:7: '\\*'
                    {
                    match(input,128,FOLLOW_128_in_selectClause797); 
                     expr = Collections.<Selector>emptyList();

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
        return expr;
    }
    // $ANTLR end "selectClause"


    // $ANTLR start "selector"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:222:1: selector returns [Selector s] : (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' );
    public final Selector selector() throws RecognitionException {
        Selector s = null;

        ColumnIdentifier c = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:223:5: (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case K_COUNT:
            case K_FILTERING:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case IDENT:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case QUOTED_NAME:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt11=1;
                }
                break;
            case K_WRITETIME:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==125) ) {
                    alt11=2;
                }
                else if ( (LA11_2==K_FROM||LA11_2==127) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case K_TTL:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==125) ) {
                    alt11=3;
                }
                else if ( (LA11_3==K_FROM||LA11_3==127) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:223:7: c= cident
                    {
                    pushFollow(FOLLOW_cident_in_selector822);
                    c=cident();

                    state._fsp--;

                     s = c; 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:224:7: K_WRITETIME '(' c= cident ')'
                    {
                    match(input,K_WRITETIME,FOLLOW_K_WRITETIME_in_selector844); 
                    match(input,125,FOLLOW_125_in_selector846); 
                    pushFollow(FOLLOW_cident_in_selector850);
                    c=cident();

                    state._fsp--;

                    match(input,126,FOLLOW_126_in_selector852); 
                     s = new Selector.WithFunction(c, Selector.Function.WRITE_TIME); 

                    }
                    break;
                case 3 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:225:7: K_TTL '(' c= cident ')'
                    {
                    match(input,K_TTL,FOLLOW_K_TTL_in_selector862); 
                    match(input,125,FOLLOW_125_in_selector864); 
                    pushFollow(FOLLOW_cident_in_selector868);
                    c=cident();

                    state._fsp--;

                    match(input,126,FOLLOW_126_in_selector870); 
                     s = new Selector.WithFunction(c, Selector.Function.TTL); 

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
        return s;
    }
    // $ANTLR end "selector"


    // $ANTLR start "selectCountClause"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:228:1: selectCountClause returns [List<Selector> expr] : ( '\\*' | i= INTEGER );
    public final List<Selector> selectCountClause() throws RecognitionException {
        List<Selector> expr = null;

        Token i=null;

        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:229:5: ( '\\*' | i= INTEGER )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==128) ) {
                alt12=1;
            }
            else if ( (LA12_0==INTEGER) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:229:7: '\\*'
                    {
                    match(input,128,FOLLOW_128_in_selectCountClause899); 
                     expr = Collections.<Selector>emptyList();

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:230:7: i= INTEGER
                    {
                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_selectCountClause921); 
                     if (!i.getText().equals("1")) addRecognitionError("Only COUNT(1) is supported, got COUNT(" + i.getText() + ")"); expr = Collections.<Selector>emptyList();

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
        return expr;
    }
    // $ANTLR end "selectCountClause"


    // $ANTLR start "whereClause"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:233:1: whereClause returns [List<Relation> clause] : relation[$clause] ( K_AND relation[$clause] )* ;
    public final List<Relation> whereClause() throws RecognitionException {
        List<Relation> clause = null;

         clause = new ArrayList<Relation>(); 
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:235:5: ( relation[$clause] ( K_AND relation[$clause] )* )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:235:7: relation[$clause] ( K_AND relation[$clause] )*
            {
            pushFollow(FOLLOW_relation_in_whereClause957);
            relation(clause);

            state._fsp--;

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:235:25: ( K_AND relation[$clause] )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==K_AND) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:235:26: K_AND relation[$clause]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_whereClause961); 
            	    pushFollow(FOLLOW_relation_in_whereClause963);
            	    relation(clause);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
        return clause;
    }
    // $ANTLR end "whereClause"


    // $ANTLR start "orderByClause"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:238:1: orderByClause[Map<ColumnIdentifier, Boolean> orderings] : c= cident ( K_ASC | K_DESC )? ;
    public final void orderByClause(Map<ColumnIdentifier, Boolean> orderings) throws RecognitionException {
        ColumnIdentifier c = null;



                ColumnIdentifier orderBy = null;
                boolean reversed = false;
            
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:243:5: (c= cident ( K_ASC | K_DESC )? )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:243:7: c= cident ( K_ASC | K_DESC )?
            {
            pushFollow(FOLLOW_cident_in_orderByClause994);
            c=cident();

            state._fsp--;

             orderBy = c; 
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:243:33: ( K_ASC | K_DESC )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==K_ASC) ) {
                alt14=1;
            }
            else if ( (LA14_0==K_DESC) ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:243:34: K_ASC
                    {
                    match(input,K_ASC,FOLLOW_K_ASC_in_orderByClause999); 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:243:42: K_DESC
                    {
                    match(input,K_DESC,FOLLOW_K_DESC_in_orderByClause1003); 
                     reversed = true; 

                    }
                    break;

            }

             orderings.put(c, reversed); 

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
    // $ANTLR end "orderByClause"


    // $ANTLR start "insertStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:246:1: insertStatement returns [UpdateStatement expr] : K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= set_operation ( ',' vn= set_operation )* ')' ( usingClause[attrs] )? ;
    public final UpdateStatement insertStatement() throws RecognitionException {
        UpdateStatement expr = null;

        CFName cf = null;

        ColumnIdentifier c1 = null;

        ColumnIdentifier cn = null;

        Operation v1 = null;

        Operation vn = null;



                Attributes attrs = new Attributes();
                List<ColumnIdentifier> columnNames  = new ArrayList<ColumnIdentifier>();
                List<Operation> columnOperations = new ArrayList<Operation>();
            
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:258:5: ( K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= set_operation ( ',' vn= set_operation )* ')' ( usingClause[attrs] )? )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:258:7: K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= set_operation ( ',' vn= set_operation )* ')' ( usingClause[attrs] )?
            {
            match(input,K_INSERT,FOLLOW_K_INSERT_in_insertStatement1041); 
            match(input,K_INTO,FOLLOW_K_INTO_in_insertStatement1043); 
            pushFollow(FOLLOW_columnFamilyName_in_insertStatement1047);
            cf=columnFamilyName();

            state._fsp--;

            match(input,125,FOLLOW_125_in_insertStatement1059); 
            pushFollow(FOLLOW_cident_in_insertStatement1063);
            c1=cident();

            state._fsp--;

             columnNames.add(c1); 
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:259:51: ( ',' cn= cident )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==127) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:259:53: ',' cn= cident
            	    {
            	    match(input,127,FOLLOW_127_in_insertStatement1070); 
            	    pushFollow(FOLLOW_cident_in_insertStatement1074);
            	    cn=cident();

            	    state._fsp--;

            	     columnNames.add(cn); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match(input,126,FOLLOW_126_in_insertStatement1081); 
            match(input,K_VALUES,FOLLOW_K_VALUES_in_insertStatement1091); 
            match(input,125,FOLLOW_125_in_insertStatement1103); 
            pushFollow(FOLLOW_set_operation_in_insertStatement1107);
            v1=set_operation();

            state._fsp--;

             columnOperations.add(v1); 
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:261:62: ( ',' vn= set_operation )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==127) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:261:64: ',' vn= set_operation
            	    {
            	    match(input,127,FOLLOW_127_in_insertStatement1113); 
            	    pushFollow(FOLLOW_set_operation_in_insertStatement1117);
            	    vn=set_operation();

            	    state._fsp--;

            	     columnOperations.add(vn); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match(input,126,FOLLOW_126_in_insertStatement1124); 
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:262:9: ( usingClause[attrs] )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==K_USING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:262:11: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_insertStatement1136);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }


                      expr = new UpdateStatement(cf, attrs, columnNames, columnOperations);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "insertStatement"


    // $ANTLR start "usingClause"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:268:1: usingClause[Attributes attrs] : K_USING usingClauseObjective[attrs] ( ( K_AND )? usingClauseObjective[attrs] )* ;
    public final void usingClause(Attributes attrs) throws RecognitionException {
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:269:5: ( K_USING usingClauseObjective[attrs] ( ( K_AND )? usingClauseObjective[attrs] )* )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:269:7: K_USING usingClauseObjective[attrs] ( ( K_AND )? usingClauseObjective[attrs] )*
            {
            match(input,K_USING,FOLLOW_K_USING_in_usingClause1166); 
            pushFollow(FOLLOW_usingClauseObjective_in_usingClause1168);
            usingClauseObjective(attrs);

            state._fsp--;

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:269:43: ( ( K_AND )? usingClauseObjective[attrs] )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=K_TTL && LA19_0<=K_AND)||LA19_0==K_TIMESTAMP) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:269:45: ( K_AND )? usingClauseObjective[attrs]
            	    {
            	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:269:45: ( K_AND )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==K_AND) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:269:45: K_AND
            	            {
            	            match(input,K_AND,FOLLOW_K_AND_in_usingClause1173); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_usingClauseObjective_in_usingClause1176);
            	    usingClauseObjective(attrs);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
        return ;
    }
    // $ANTLR end "usingClause"


    // $ANTLR start "usingClauseDelete"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:272:1: usingClauseDelete[Attributes attrs] : K_USING usingClauseDeleteObjective[attrs] ( ( K_AND )? usingClauseDeleteObjective[attrs] )* ;
    public final void usingClauseDelete(Attributes attrs) throws RecognitionException {
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:273:5: ( K_USING usingClauseDeleteObjective[attrs] ( ( K_AND )? usingClauseDeleteObjective[attrs] )* )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:273:7: K_USING usingClauseDeleteObjective[attrs] ( ( K_AND )? usingClauseDeleteObjective[attrs] )*
            {
            match(input,K_USING,FOLLOW_K_USING_in_usingClauseDelete1198); 
            pushFollow(FOLLOW_usingClauseDeleteObjective_in_usingClauseDelete1200);
            usingClauseDeleteObjective(attrs);

            state._fsp--;

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:273:49: ( ( K_AND )? usingClauseDeleteObjective[attrs] )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==K_AND||LA21_0==K_TIMESTAMP) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:273:51: ( K_AND )? usingClauseDeleteObjective[attrs]
            	    {
            	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:273:51: ( K_AND )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==K_AND) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:273:51: K_AND
            	            {
            	            match(input,K_AND,FOLLOW_K_AND_in_usingClauseDelete1205); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_usingClauseDeleteObjective_in_usingClauseDelete1208);
            	    usingClauseDeleteObjective(attrs);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
        return ;
    }
    // $ANTLR end "usingClauseDelete"


    // $ANTLR start "usingClauseDeleteObjective"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:276:1: usingClauseDeleteObjective[Attributes attrs] : K_TIMESTAMP ts= INTEGER ;
    public final void usingClauseDeleteObjective(Attributes attrs) throws RecognitionException {
        Token ts=null;

        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:277:5: ( K_TIMESTAMP ts= INTEGER )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:277:7: K_TIMESTAMP ts= INTEGER
            {
            match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseDeleteObjective1230); 
            ts=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_usingClauseDeleteObjective1234); 
             attrs.timestamp = Long.valueOf((ts!=null?ts.getText():null)); 

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
    // $ANTLR end "usingClauseDeleteObjective"


    // $ANTLR start "usingClauseObjective"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:280:1: usingClauseObjective[Attributes attrs] : ( usingClauseDeleteObjective[attrs] | K_TTL t= INTEGER );
    public final void usingClauseObjective(Attributes attrs) throws RecognitionException {
        Token t=null;

        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:281:5: ( usingClauseDeleteObjective[attrs] | K_TTL t= INTEGER )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==K_TIMESTAMP) ) {
                alt22=1;
            }
            else if ( (LA22_0==K_TTL) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:281:7: usingClauseDeleteObjective[attrs]
                    {
                    pushFollow(FOLLOW_usingClauseDeleteObjective_in_usingClauseObjective1254);
                    usingClauseDeleteObjective(attrs);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:282:7: K_TTL t= INTEGER
                    {
                    match(input,K_TTL,FOLLOW_K_TTL_in_usingClauseObjective1263); 
                    t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_usingClauseObjective1267); 
                     attrs.timeToLive = Integer.valueOf((t!=null?t.getText():null)); 

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
        return ;
    }
    // $ANTLR end "usingClauseObjective"


    // $ANTLR start "updateStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:285:1: updateStatement returns [UpdateStatement expr] : K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET termPairWithOperation[columns] ( ',' termPairWithOperation[columns] )* K_WHERE wclause= whereClause ;
    public final UpdateStatement updateStatement() throws RecognitionException {
        UpdateStatement expr = null;

        CFName cf = null;

        List<Relation> wclause = null;



                Attributes attrs = new Attributes();
                List<Pair<ColumnIdentifier, Operation>> columns = new ArrayList<Pair<ColumnIdentifier, Operation>>();
            
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:296:5: ( K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET termPairWithOperation[columns] ( ',' termPairWithOperation[columns] )* K_WHERE wclause= whereClause )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:296:7: K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET termPairWithOperation[columns] ( ',' termPairWithOperation[columns] )* K_WHERE wclause= whereClause
            {
            match(input,K_UPDATE,FOLLOW_K_UPDATE_in_updateStatement1301); 
            pushFollow(FOLLOW_columnFamilyName_in_updateStatement1305);
            cf=columnFamilyName();

            state._fsp--;

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:297:7: ( usingClause[attrs] )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==K_USING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:297:9: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_updateStatement1315);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }

            match(input,K_SET,FOLLOW_K_SET_in_updateStatement1327); 
            pushFollow(FOLLOW_termPairWithOperation_in_updateStatement1329);
            termPairWithOperation(columns);

            state._fsp--;

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:298:44: ( ',' termPairWithOperation[columns] )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==127) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:298:45: ',' termPairWithOperation[columns]
            	    {
            	    match(input,127,FOLLOW_127_in_updateStatement1333); 
            	    pushFollow(FOLLOW_termPairWithOperation_in_updateStatement1335);
            	    termPairWithOperation(columns);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            match(input,K_WHERE,FOLLOW_K_WHERE_in_updateStatement1346); 
            pushFollow(FOLLOW_whereClause_in_updateStatement1350);
            wclause=whereClause();

            state._fsp--;


                      return new UpdateStatement(cf, columns, wclause, attrs);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "updateStatement"


    // $ANTLR start "deleteStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:305:1: deleteStatement returns [DeleteStatement expr] : K_DELETE (ids= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ;
    public final DeleteStatement deleteStatement() throws RecognitionException {
        DeleteStatement expr = null;

        List<Selector> ids = null;

        CFName cf = null;

        List<Relation> wclause = null;



                Attributes attrs = new Attributes();
                List<Selector> columnsList = Collections.emptyList();
            
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:316:5: ( K_DELETE (ids= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:316:7: K_DELETE (ids= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause
            {
            match(input,K_DELETE,FOLLOW_K_DELETE_in_deleteStatement1390); 
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:316:16: (ids= deleteSelection )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==K_COUNT||(LA25_0>=K_FILTERING && LA25_0<=K_TTL)||LA25_0==K_VALUES||LA25_0==K_TIMESTAMP||LA25_0==K_COUNTER||(LA25_0>=K_KEY && LA25_0<=K_CLUSTERING)||LA25_0==IDENT||LA25_0==K_TYPE||LA25_0==K_LIST||(LA25_0>=K_ALL && LA25_0<=K_PASSWORD)||LA25_0==QUOTED_NAME||(LA25_0>=K_ASCII && LA25_0<=K_MAP)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:316:18: ids= deleteSelection
                    {
                    pushFollow(FOLLOW_deleteSelection_in_deleteStatement1396);
                    ids=deleteSelection();

                    state._fsp--;

                     columnsList = ids; 

                    }
                    break;

            }

            match(input,K_FROM,FOLLOW_K_FROM_in_deleteStatement1409); 
            pushFollow(FOLLOW_columnFamilyName_in_deleteStatement1413);
            cf=columnFamilyName();

            state._fsp--;

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:318:7: ( usingClauseDelete[attrs] )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==K_USING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:318:9: usingClauseDelete[attrs]
                    {
                    pushFollow(FOLLOW_usingClauseDelete_in_deleteStatement1423);
                    usingClauseDelete(attrs);

                    state._fsp--;


                    }
                    break;

            }

            match(input,K_WHERE,FOLLOW_K_WHERE_in_deleteStatement1435); 
            pushFollow(FOLLOW_whereClause_in_deleteStatement1439);
            wclause=whereClause();

            state._fsp--;


                      return new DeleteStatement(cf, columnsList, wclause, attrs);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "deleteStatement"


    // $ANTLR start "deleteSelection"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:325:1: deleteSelection returns [List<Selector> expr] : t1= deleteSelector ( ',' tN= deleteSelector )* ;
    public final List<Selector> deleteSelection() throws RecognitionException {
        List<Selector> expr = null;

        Selector t1 = null;

        Selector tN = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:326:5: (t1= deleteSelector ( ',' tN= deleteSelector )* )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:326:7: t1= deleteSelector ( ',' tN= deleteSelector )*
            {
            pushFollow(FOLLOW_deleteSelector_in_deleteSelection1470);
            t1=deleteSelector();

            state._fsp--;

             expr = new ArrayList<Selector>(); expr.add(t1); 
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:326:79: ( ',' tN= deleteSelector )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==127) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:326:80: ',' tN= deleteSelector
            	    {
            	    match(input,127,FOLLOW_127_in_deleteSelection1475); 
            	    pushFollow(FOLLOW_deleteSelector_in_deleteSelection1479);
            	    tN=deleteSelector();

            	    state._fsp--;

            	     expr.add(tN); 

            	    }
            	    break;

            	default :
            	    break loop27;
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
        return expr;
    }
    // $ANTLR end "deleteSelection"


    // $ANTLR start "deleteSelector"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:329:1: deleteSelector returns [Selector s] : (c= cident | c= cident '[' t= term ']' );
    public final Selector deleteSelector() throws RecognitionException {
        Selector s = null;

        ColumnIdentifier c = null;

        Term t = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:330:5: (c= cident | c= cident '[' t= term ']' )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:330:7: c= cident
                    {
                    pushFollow(FOLLOW_cident_in_deleteSelector1506);
                    c=cident();

                    state._fsp--;

                     s = c; 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:331:7: c= cident '[' t= term ']'
                    {
                    pushFollow(FOLLOW_cident_in_deleteSelector1533);
                    c=cident();

                    state._fsp--;

                    match(input,129,FOLLOW_129_in_deleteSelector1535); 
                    pushFollow(FOLLOW_term_in_deleteSelector1539);
                    t=term();

                    state._fsp--;

                    match(input,130,FOLLOW_130_in_deleteSelector1541); 
                     s = new Selector.WithKey(c, t); 

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
        return s;
    }
    // $ANTLR end "deleteSelector"


    // $ANTLR start "batchStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:334:1: batchStatement returns [BatchStatement expr] : K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? s1= batchStatementObjective ( ';' )? (sN= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH ;
    public final BatchStatement batchStatement() throws RecognitionException {
        BatchStatement expr = null;

        ModificationStatement s1 = null;

        ModificationStatement sN = null;



                BatchStatement.Type type = BatchStatement.Type.LOGGED;
                List<ModificationStatement> statements = new ArrayList<ModificationStatement>();
                Attributes attrs = new Attributes();
            
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:364:5: ( K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? s1= batchStatementObjective ( ';' )? (sN= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:364:7: K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? s1= batchStatementObjective ( ';' )? (sN= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH
            {
            match(input,K_BEGIN,FOLLOW_K_BEGIN_in_batchStatement1575); 
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:365:7: ( K_UNLOGGED | K_COUNTER )?
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==K_UNLOGGED) ) {
                alt29=1;
            }
            else if ( (LA29_0==K_COUNTER) ) {
                alt29=2;
            }
            switch (alt29) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:365:9: K_UNLOGGED
                    {
                    match(input,K_UNLOGGED,FOLLOW_K_UNLOGGED_in_batchStatement1585); 
                     type = BatchStatement.Type.UNLOGGED; 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:365:63: K_COUNTER
                    {
                    match(input,K_COUNTER,FOLLOW_K_COUNTER_in_batchStatement1591); 
                     type = BatchStatement.Type.COUNTER; 

                    }
                    break;

            }

            match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement1604); 
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:366:15: ( usingClause[attrs] )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==K_USING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:366:17: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_batchStatement1608);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_batchStatementObjective_in_batchStatement1626);
            s1=batchStatementObjective();

            state._fsp--;

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:367:38: ( ';' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==124) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:367:38: ';'
                    {
                    match(input,124,FOLLOW_124_in_batchStatement1628); 

                    }
                    break;

            }

             statements.add(s1); 
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:367:67: (sN= batchStatementObjective ( ';' )? )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==K_INSERT||LA33_0==K_UPDATE||LA33_0==K_DELETE) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:367:69: sN= batchStatementObjective ( ';' )?
            	    {
            	    pushFollow(FOLLOW_batchStatementObjective_in_batchStatement1637);
            	    sN=batchStatementObjective();

            	    state._fsp--;

            	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:367:96: ( ';' )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==124) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:367:96: ';'
            	            {
            	            match(input,124,FOLLOW_124_in_batchStatement1639); 

            	            }
            	            break;

            	    }

            	     statements.add(sN); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            match(input,K_APPLY,FOLLOW_K_APPLY_in_batchStatement1653); 
            match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement1655); 

                      return new BatchStatement(type, statements, attrs);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "batchStatement"


    // $ANTLR start "batchStatementObjective"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:374:1: batchStatementObjective returns [ModificationStatement statement] : (i= insertStatement | u= updateStatement | d= deleteStatement );
    public final ModificationStatement batchStatementObjective() throws RecognitionException {
        ModificationStatement statement = null;

        UpdateStatement i = null;

        UpdateStatement u = null;

        DeleteStatement d = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:375:5: (i= insertStatement | u= updateStatement | d= deleteStatement )
            int alt34=3;
            switch ( input.LA(1) ) {
            case K_INSERT:
                {
                alt34=1;
                }
                break;
            case K_UPDATE:
                {
                alt34=2;
                }
                break;
            case K_DELETE:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:375:7: i= insertStatement
                    {
                    pushFollow(FOLLOW_insertStatement_in_batchStatementObjective1686);
                    i=insertStatement();

                    state._fsp--;

                     statement = i; 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:376:7: u= updateStatement
                    {
                    pushFollow(FOLLOW_updateStatement_in_batchStatementObjective1699);
                    u=updateStatement();

                    state._fsp--;

                     statement = u; 

                    }
                    break;
                case 3 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:377:7: d= deleteStatement
                    {
                    pushFollow(FOLLOW_deleteStatement_in_batchStatementObjective1712);
                    d=deleteStatement();

                    state._fsp--;

                     statement = d; 

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
        return statement;
    }
    // $ANTLR end "batchStatementObjective"


    // $ANTLR start "createKeyspaceStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:380:1: createKeyspaceStatement returns [CreateKeyspaceStatement expr] : K_CREATE K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] ;
    public final CreateKeyspaceStatement createKeyspaceStatement() throws RecognitionException {
        CreateKeyspaceStatement expr = null;

        String ks = null;


         KSPropDefs attrs = new KSPropDefs(); 
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:385:5: ( K_CREATE K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:385:7: K_CREATE K_KEYSPACE ks= keyspaceName K_WITH properties[attrs]
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createKeyspaceStatement1747); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_createKeyspaceStatement1749); 
            pushFollow(FOLLOW_keyspaceName_in_createKeyspaceStatement1753);
            ks=keyspaceName();

            state._fsp--;

            match(input,K_WITH,FOLLOW_K_WITH_in_createKeyspaceStatement1761); 
            pushFollow(FOLLOW_properties_in_createKeyspaceStatement1763);
            properties(attrs);

            state._fsp--;

             expr = new CreateKeyspaceStatement(ks, attrs); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createKeyspaceStatement"


    // $ANTLR start "createColumnFamilyStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:389:1: createColumnFamilyStatement returns [CreateColumnFamilyStatement.RawStatement expr] : K_CREATE K_COLUMNFAMILY cf= columnFamilyName cfamDefinition[expr] ;
    public final CreateColumnFamilyStatement.RawStatement createColumnFamilyStatement() throws RecognitionException {
        CreateColumnFamilyStatement.RawStatement expr = null;

        CFName cf = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:397:5: ( K_CREATE K_COLUMNFAMILY cf= columnFamilyName cfamDefinition[expr] )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:397:7: K_CREATE K_COLUMNFAMILY cf= columnFamilyName cfamDefinition[expr]
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createColumnFamilyStatement1789); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_createColumnFamilyStatement1791); 
            pushFollow(FOLLOW_columnFamilyName_in_createColumnFamilyStatement1795);
            cf=columnFamilyName();

            state._fsp--;

             expr = new CreateColumnFamilyStatement.RawStatement(cf); 
            pushFollow(FOLLOW_cfamDefinition_in_createColumnFamilyStatement1805);
            cfamDefinition(expr);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createColumnFamilyStatement"


    // $ANTLR start "cfamDefinition"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:401:1: cfamDefinition[CreateColumnFamilyStatement.RawStatement expr] : '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )? ;
    public final void cfamDefinition(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:402:5: ( '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )? )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:402:7: '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )?
            {
            match(input,125,FOLLOW_125_in_cfamDefinition1824); 
            pushFollow(FOLLOW_cfamColumns_in_cfamDefinition1826);
            cfamColumns(expr);

            state._fsp--;

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:402:29: ( ',' ( cfamColumns[expr] )? )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==127) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:402:31: ',' ( cfamColumns[expr] )?
            	    {
            	    match(input,127,FOLLOW_127_in_cfamDefinition1831); 
            	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:402:35: ( cfamColumns[expr] )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==K_COUNT||(LA35_0>=K_FILTERING && LA35_0<=K_TTL)||LA35_0==K_VALUES||LA35_0==K_TIMESTAMP||LA35_0==K_COUNTER||(LA35_0>=K_PRIMARY && LA35_0<=K_CLUSTERING)||LA35_0==IDENT||LA35_0==K_TYPE||LA35_0==K_LIST||(LA35_0>=K_ALL && LA35_0<=K_PASSWORD)||LA35_0==QUOTED_NAME||(LA35_0>=K_ASCII && LA35_0<=K_MAP)) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:402:35: cfamColumns[expr]
            	            {
            	            pushFollow(FOLLOW_cfamColumns_in_cfamDefinition1833);
            	            cfamColumns(expr);

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            match(input,126,FOLLOW_126_in_cfamDefinition1840); 
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:403:7: ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==K_WITH) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:403:9: K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )*
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_cfamDefinition1850); 
                    pushFollow(FOLLOW_cfamProperty_in_cfamDefinition1852);
                    cfamProperty(expr);

                    state._fsp--;

                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:403:35: ( K_AND cfamProperty[expr] )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==K_AND) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:403:37: K_AND cfamProperty[expr]
                    	    {
                    	    match(input,K_AND,FOLLOW_K_AND_in_cfamDefinition1857); 
                    	    pushFollow(FOLLOW_cfamProperty_in_cfamDefinition1859);
                    	    cfamProperty(expr);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


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
        return ;
    }
    // $ANTLR end "cfamDefinition"


    // $ANTLR start "cfamColumns"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:406:1: cfamColumns[CreateColumnFamilyStatement.RawStatement expr] : (k= cident v= comparatorType ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= cident )* ')' );
    public final void cfamColumns(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;

        ParsedType v = null;

        ColumnIdentifier c = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:407:5: (k= cident v= comparatorType ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= cident )* ')' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==K_COUNT||(LA41_0>=K_FILTERING && LA41_0<=K_TTL)||LA41_0==K_VALUES||LA41_0==K_TIMESTAMP||LA41_0==K_COUNTER||(LA41_0>=K_KEY && LA41_0<=K_CLUSTERING)||LA41_0==IDENT||LA41_0==K_TYPE||LA41_0==K_LIST||(LA41_0>=K_ALL && LA41_0<=K_PASSWORD)||LA41_0==QUOTED_NAME||(LA41_0>=K_ASCII && LA41_0<=K_MAP)) ) {
                alt41=1;
            }
            else if ( (LA41_0==K_PRIMARY) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:407:7: k= cident v= comparatorType ( K_PRIMARY K_KEY )?
                    {
                    pushFollow(FOLLOW_cident_in_cfamColumns1885);
                    k=cident();

                    state._fsp--;

                    pushFollow(FOLLOW_comparatorType_in_cfamColumns1889);
                    v=comparatorType();

                    state._fsp--;

                     expr.addDefinition(k, v); 
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:407:64: ( K_PRIMARY K_KEY )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==K_PRIMARY) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:407:65: K_PRIMARY K_KEY
                            {
                            match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns1894); 
                            match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns1896); 
                             expr.addKeyAliases(Collections.singletonList(k)); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:408:7: K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= cident )* ')'
                    {
                    match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns1908); 
                    match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns1910); 
                    match(input,125,FOLLOW_125_in_cfamColumns1912); 
                    pushFollow(FOLLOW_pkDef_in_cfamColumns1914);
                    pkDef(expr);

                    state._fsp--;

                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:408:39: ( ',' c= cident )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==127) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:408:40: ',' c= cident
                    	    {
                    	    match(input,127,FOLLOW_127_in_cfamColumns1918); 
                    	    pushFollow(FOLLOW_cident_in_cfamColumns1922);
                    	    c=cident();

                    	    state._fsp--;

                    	     expr.addColumnAlias(c); 

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    match(input,126,FOLLOW_126_in_cfamColumns1929); 

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
        return ;
    }
    // $ANTLR end "cfamColumns"


    // $ANTLR start "pkDef"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:411:1: pkDef[CreateColumnFamilyStatement.RawStatement expr] : (k= cident | '(' k1= cident ( ',' kn= cident )* ')' );
    public final void pkDef(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;

        ColumnIdentifier k1 = null;

        ColumnIdentifier kn = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:412:5: (k= cident | '(' k1= cident ( ',' kn= cident )* ')' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==K_COUNT||(LA43_0>=K_FILTERING && LA43_0<=K_TTL)||LA43_0==K_VALUES||LA43_0==K_TIMESTAMP||LA43_0==K_COUNTER||(LA43_0>=K_KEY && LA43_0<=K_CLUSTERING)||LA43_0==IDENT||LA43_0==K_TYPE||LA43_0==K_LIST||(LA43_0>=K_ALL && LA43_0<=K_PASSWORD)||LA43_0==QUOTED_NAME||(LA43_0>=K_ASCII && LA43_0<=K_MAP)) ) {
                alt43=1;
            }
            else if ( (LA43_0==125) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:412:7: k= cident
                    {
                    pushFollow(FOLLOW_cident_in_pkDef1949);
                    k=cident();

                    state._fsp--;

                     expr.addKeyAliases(Collections.singletonList(k)); 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:413:7: '(' k1= cident ( ',' kn= cident )* ')'
                    {
                    match(input,125,FOLLOW_125_in_pkDef1959); 
                     List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>(); 
                    pushFollow(FOLLOW_cident_in_pkDef1965);
                    k1=cident();

                    state._fsp--;

                     l.add(k1); 
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:413:102: ( ',' kn= cident )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==127) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:413:104: ',' kn= cident
                    	    {
                    	    match(input,127,FOLLOW_127_in_pkDef1971); 
                    	    pushFollow(FOLLOW_cident_in_pkDef1975);
                    	    kn=cident();

                    	    state._fsp--;

                    	     l.add(kn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    match(input,126,FOLLOW_126_in_pkDef1982); 
                     expr.addKeyAliases(l); 

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
        return ;
    }
    // $ANTLR end "pkDef"


    // $ANTLR start "cfamProperty"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:416:1: cfamProperty[CreateColumnFamilyStatement.RawStatement expr] : ( property[expr.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')' );
    public final void cfamProperty(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:417:5: ( property[expr.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')' )
            int alt45=3;
            switch ( input.LA(1) ) {
            case K_COUNT:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_KEY:
            case K_STORAGE:
            case IDENT:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case QUOTED_NAME:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt45=1;
                }
                break;
            case K_COMPACT:
                {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==K_STORAGE) ) {
                    alt45=2;
                }
                else if ( (LA45_2==135) ) {
                    alt45=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
                }
                break;
            case K_CLUSTERING:
                {
                int LA45_3 = input.LA(2);

                if ( (LA45_3==K_ORDER) ) {
                    alt45=3;
                }
                else if ( (LA45_3==135) ) {
                    alt45=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:417:7: property[expr.properties]
                    {
                    pushFollow(FOLLOW_property_in_cfamProperty2002);
                    property(expr.properties);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:418:7: K_COMPACT K_STORAGE
                    {
                    match(input,K_COMPACT,FOLLOW_K_COMPACT_in_cfamProperty2011); 
                    match(input,K_STORAGE,FOLLOW_K_STORAGE_in_cfamProperty2013); 
                     expr.setCompactStorage(); 

                    }
                    break;
                case 3 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:419:7: K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')'
                    {
                    match(input,K_CLUSTERING,FOLLOW_K_CLUSTERING_in_cfamProperty2023); 
                    match(input,K_ORDER,FOLLOW_K_ORDER_in_cfamProperty2025); 
                    match(input,K_BY,FOLLOW_K_BY_in_cfamProperty2027); 
                    match(input,125,FOLLOW_125_in_cfamProperty2029); 
                    pushFollow(FOLLOW_cfamOrdering_in_cfamProperty2031);
                    cfamOrdering(expr);

                    state._fsp--;

                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:419:56: ( ',' cfamOrdering[expr] )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==127) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:419:57: ',' cfamOrdering[expr]
                    	    {
                    	    match(input,127,FOLLOW_127_in_cfamProperty2035); 
                    	    pushFollow(FOLLOW_cfamOrdering_in_cfamProperty2037);
                    	    cfamOrdering(expr);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    match(input,126,FOLLOW_126_in_cfamProperty2042); 

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
        return ;
    }
    // $ANTLR end "cfamProperty"


    // $ANTLR start "cfamOrdering"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:422:1: cfamOrdering[CreateColumnFamilyStatement.RawStatement expr] : k= cident ( K_ASC | K_DESC ) ;
    public final void cfamOrdering(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;


         boolean reversed=false; 
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:424:5: (k= cident ( K_ASC | K_DESC ) )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:424:7: k= cident ( K_ASC | K_DESC )
            {
            pushFollow(FOLLOW_cident_in_cfamOrdering2070);
            k=cident();

            state._fsp--;

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:424:16: ( K_ASC | K_DESC )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==K_ASC) ) {
                alt46=1;
            }
            else if ( (LA46_0==K_DESC) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:424:17: K_ASC
                    {
                    match(input,K_ASC,FOLLOW_K_ASC_in_cfamOrdering2073); 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:424:25: K_DESC
                    {
                    match(input,K_DESC,FOLLOW_K_DESC_in_cfamOrdering2077); 
                     reversed=true;

                    }
                    break;

            }

             expr.setOrdering(k, reversed); 

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
    // $ANTLR end "cfamOrdering"


    // $ANTLR start "createIndexStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:427:1: createIndexStatement returns [CreateIndexStatement expr] : K_CREATE K_INDEX (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= cident ')' ;
    public final CreateIndexStatement createIndexStatement() throws RecognitionException {
        CreateIndexStatement expr = null;

        Token idxName=null;
        CFName cf = null;

        ColumnIdentifier id = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:431:5: ( K_CREATE K_INDEX (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= cident ')' )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:431:7: K_CREATE K_INDEX (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= cident ')'
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createIndexStatement2106); 
            match(input,K_INDEX,FOLLOW_K_INDEX_in_createIndexStatement2108); 
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:431:24: (idxName= IDENT )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==IDENT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:431:25: idxName= IDENT
                    {
                    idxName=(Token)match(input,IDENT,FOLLOW_IDENT_in_createIndexStatement2113); 

                    }
                    break;

            }

            match(input,K_ON,FOLLOW_K_ON_in_createIndexStatement2117); 
            pushFollow(FOLLOW_columnFamilyName_in_createIndexStatement2121);
            cf=columnFamilyName();

            state._fsp--;

            match(input,125,FOLLOW_125_in_createIndexStatement2123); 
            pushFollow(FOLLOW_cident_in_createIndexStatement2127);
            id=cident();

            state._fsp--;

            match(input,126,FOLLOW_126_in_createIndexStatement2129); 
             expr = new CreateIndexStatement(cf, (idxName!=null?idxName.getText():null), id); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createIndexStatement"


    // $ANTLR start "alterKeyspaceStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:435:1: alterKeyspaceStatement returns [AlterKeyspaceStatement expr] : K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] ;
    public final AlterKeyspaceStatement alterKeyspaceStatement() throws RecognitionException {
        AlterKeyspaceStatement expr = null;

        String ks = null;


         KSPropDefs attrs = new KSPropDefs(); 
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:440:5: ( K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:440:7: K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs]
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterKeyspaceStatement2169); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement2171); 
            pushFollow(FOLLOW_keyspaceName_in_alterKeyspaceStatement2175);
            ks=keyspaceName();

            state._fsp--;

            match(input,K_WITH,FOLLOW_K_WITH_in_alterKeyspaceStatement2185); 
            pushFollow(FOLLOW_properties_in_alterKeyspaceStatement2187);
            properties(attrs);

            state._fsp--;

             expr = new AlterKeyspaceStatement(ks, attrs); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "alterKeyspaceStatement"


    // $ANTLR start "alterTableStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:445:1: alterTableStatement returns [AlterTableStatement expr] : K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) ;
    public final AlterTableStatement alterTableStatement() throws RecognitionException {
        AlterTableStatement expr = null;

        CFName cf = null;

        ColumnIdentifier id = null;

        ParsedType v = null;

        ColumnIdentifier id1 = null;

        ColumnIdentifier toId1 = null;

        ColumnIdentifier idn = null;

        ColumnIdentifier toIdn = null;



                AlterTableStatement.Type type = null;
                CFPropDefs props = new CFPropDefs();
                Map<ColumnIdentifier, ColumnIdentifier> renames = new HashMap<ColumnIdentifier, ColumnIdentifier>();
            
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:458:5: ( K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:458:7: K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement2223); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_alterTableStatement2225); 
            pushFollow(FOLLOW_columnFamilyName_in_alterTableStatement2229);
            cf=columnFamilyName();

            state._fsp--;

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:459:11: ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
            int alt49=4;
            switch ( input.LA(1) ) {
            case K_ALTER:
                {
                alt49=1;
                }
                break;
            case K_ADD:
                {
                alt49=2;
                }
                break;
            case K_WITH:
                {
                alt49=3;
                }
                break;
            case K_RENAME:
                {
                alt49=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:459:13: K_ALTER id= cident K_TYPE v= comparatorType
                    {
                    match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement2243); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2247);
                    id=cident();

                    state._fsp--;

                    match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTableStatement2249); 
                    pushFollow(FOLLOW_comparatorType_in_alterTableStatement2253);
                    v=comparatorType();

                    state._fsp--;

                     type = AlterTableStatement.Type.ALTER; 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:460:13: K_ADD id= cident v= comparatorType
                    {
                    match(input,K_ADD,FOLLOW_K_ADD_in_alterTableStatement2269); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2275);
                    id=cident();

                    state._fsp--;

                    pushFollow(FOLLOW_comparatorType_in_alterTableStatement2279);
                    v=comparatorType();

                    state._fsp--;

                     type = AlterTableStatement.Type.ADD; 

                    }
                    break;
                case 3 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:462:13: K_WITH properties[props]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_alterTableStatement2313); 
                    pushFollow(FOLLOW_properties_in_alterTableStatement2316);
                    properties(props);

                    state._fsp--;

                     type = AlterTableStatement.Type.OPTS; 

                    }
                    break;
                case 4 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:463:13: K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )*
                    {
                    match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTableStatement2349); 
                     type = AlterTableStatement.Type.RENAME; 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2403);
                    id1=cident();

                    state._fsp--;

                    match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement2405); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2409);
                    toId1=cident();

                    state._fsp--;

                     renames.put(id1, toId1); 
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:465:16: ( K_AND idn= cident K_TO toIdn= cident )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==K_AND) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:465:18: K_AND idn= cident K_TO toIdn= cident
                    	    {
                    	    match(input,K_AND,FOLLOW_K_AND_in_alterTableStatement2430); 
                    	    pushFollow(FOLLOW_cident_in_alterTableStatement2434);
                    	    idn=cident();

                    	    state._fsp--;

                    	    match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement2436); 
                    	    pushFollow(FOLLOW_cident_in_alterTableStatement2440);
                    	    toIdn=cident();

                    	    state._fsp--;

                    	     renames.put(idn, toIdn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }


                    expr = new AlterTableStatement(cf, type, id, v, props, renames);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "alterTableStatement"


    // $ANTLR start "dropKeyspaceStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:472:1: dropKeyspaceStatement returns [DropKeyspaceStatement ksp] : K_DROP K_KEYSPACE ks= keyspaceName ;
    public final DropKeyspaceStatement dropKeyspaceStatement() throws RecognitionException {
        DropKeyspaceStatement ksp = null;

        String ks = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:476:5: ( K_DROP K_KEYSPACE ks= keyspaceName )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:476:7: K_DROP K_KEYSPACE ks= keyspaceName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropKeyspaceStatement2486); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement2488); 
            pushFollow(FOLLOW_keyspaceName_in_dropKeyspaceStatement2492);
            ks=keyspaceName();

            state._fsp--;

             ksp = new DropKeyspaceStatement(ks); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ksp;
    }
    // $ANTLR end "dropKeyspaceStatement"


    // $ANTLR start "dropColumnFamilyStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:479:1: dropColumnFamilyStatement returns [DropColumnFamilyStatement stmt] : K_DROP K_COLUMNFAMILY cf= columnFamilyName ;
    public final DropColumnFamilyStatement dropColumnFamilyStatement() throws RecognitionException {
        DropColumnFamilyStatement stmt = null;

        CFName cf = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:483:5: ( K_DROP K_COLUMNFAMILY cf= columnFamilyName )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:483:7: K_DROP K_COLUMNFAMILY cf= columnFamilyName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropColumnFamilyStatement2517); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dropColumnFamilyStatement2519); 
            pushFollow(FOLLOW_columnFamilyName_in_dropColumnFamilyStatement2523);
            cf=columnFamilyName();

            state._fsp--;

             stmt = new DropColumnFamilyStatement(cf); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "dropColumnFamilyStatement"


    // $ANTLR start "dropIndexStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:486:1: dropIndexStatement returns [DropIndexStatement expr] : K_DROP K_INDEX index= IDENT ;
    public final DropIndexStatement dropIndexStatement() throws RecognitionException {
        DropIndexStatement expr = null;

        Token index=null;

        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:490:5: ( K_DROP K_INDEX index= IDENT )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:491:7: K_DROP K_INDEX index= IDENT
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropIndexStatement2554); 
            match(input,K_INDEX,FOLLOW_K_INDEX_in_dropIndexStatement2556); 
            index=(Token)match(input,IDENT,FOLLOW_IDENT_in_dropIndexStatement2560); 
             expr = new DropIndexStatement((index!=null?index.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "dropIndexStatement"


    // $ANTLR start "truncateStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:495:1: truncateStatement returns [TruncateStatement stmt] : K_TRUNCATE cf= columnFamilyName ;
    public final TruncateStatement truncateStatement() throws RecognitionException {
        TruncateStatement stmt = null;

        CFName cf = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:499:5: ( K_TRUNCATE cf= columnFamilyName )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:499:7: K_TRUNCATE cf= columnFamilyName
            {
            match(input,K_TRUNCATE,FOLLOW_K_TRUNCATE_in_truncateStatement2591); 
            pushFollow(FOLLOW_columnFamilyName_in_truncateStatement2595);
            cf=columnFamilyName();

            state._fsp--;

             stmt = new TruncateStatement(cf); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "truncateStatement"


    // $ANTLR start "grantStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:502:1: grantStatement returns [GrantStatement stmt] : K_GRANT permissionOrAll K_ON resource K_TO username ;
    public final GrantStatement grantStatement() throws RecognitionException {
        GrantStatement stmt = null;

        Set<Permission> permissionOrAll1 = null;

        IResource resource2 = null;

        CqlParser.username_return username3 = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:506:5: ( K_GRANT permissionOrAll K_ON resource K_TO username )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:506:7: K_GRANT permissionOrAll K_ON resource K_TO username
            {
            match(input,K_GRANT,FOLLOW_K_GRANT_in_grantStatement2620); 
            pushFollow(FOLLOW_permissionOrAll_in_grantStatement2632);
            permissionOrAll1=permissionOrAll();

            state._fsp--;

            match(input,K_ON,FOLLOW_K_ON_in_grantStatement2640); 
            pushFollow(FOLLOW_resource_in_grantStatement2652);
            resource2=resource();

            state._fsp--;

            match(input,K_TO,FOLLOW_K_TO_in_grantStatement2660); 
            pushFollow(FOLLOW_username_in_grantStatement2672);
            username3=username();

            state._fsp--;

             stmt = new GrantStatement(permissionOrAll1, resource2, (username3!=null?input.toString(username3.start,username3.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "grantStatement"


    // $ANTLR start "revokeStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:515:1: revokeStatement returns [RevokeStatement stmt] : K_REVOKE permissionOrAll K_ON resource K_FROM username ;
    public final RevokeStatement revokeStatement() throws RecognitionException {
        RevokeStatement stmt = null;

        Set<Permission> permissionOrAll4 = null;

        IResource resource5 = null;

        CqlParser.username_return username6 = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:519:5: ( K_REVOKE permissionOrAll K_ON resource K_FROM username )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:519:7: K_REVOKE permissionOrAll K_ON resource K_FROM username
            {
            match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokeStatement2703); 
            pushFollow(FOLLOW_permissionOrAll_in_revokeStatement2715);
            permissionOrAll4=permissionOrAll();

            state._fsp--;

            match(input,K_ON,FOLLOW_K_ON_in_revokeStatement2723); 
            pushFollow(FOLLOW_resource_in_revokeStatement2735);
            resource5=resource();

            state._fsp--;

            match(input,K_FROM,FOLLOW_K_FROM_in_revokeStatement2743); 
            pushFollow(FOLLOW_username_in_revokeStatement2755);
            username6=username();

            state._fsp--;

             stmt = new RevokeStatement(permissionOrAll4, resource5, (username6!=null?input.toString(username6.start,username6.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "revokeStatement"


    // $ANTLR start "listPermissionsStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:528:1: listPermissionsStatement returns [ListPermissionsStatement stmt] : K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )? ;
    public final ListPermissionsStatement listPermissionsStatement() throws RecognitionException {
        ListPermissionsStatement stmt = null;

        IResource resource7 = null;

        CqlParser.username_return username8 = null;

        Set<Permission> permissionOrAll9 = null;



                IResource resource = null;
                String username = null;
                boolean recursive = true;
            
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:534:5: ( K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )? )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:534:7: K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )?
            {
            match(input,K_LIST,FOLLOW_K_LIST_in_listPermissionsStatement2793); 
            pushFollow(FOLLOW_permissionOrAll_in_listPermissionsStatement2805);
            permissionOrAll9=permissionOrAll();

            state._fsp--;

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:536:7: ( K_ON resource )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==K_ON) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:536:9: K_ON resource
                    {
                    match(input,K_ON,FOLLOW_K_ON_in_listPermissionsStatement2815); 
                    pushFollow(FOLLOW_resource_in_listPermissionsStatement2817);
                    resource7=resource();

                    state._fsp--;

                     resource = resource7; 

                    }
                    break;

            }

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:537:7: ( K_OF username )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==K_OF) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:537:9: K_OF username
                    {
                    match(input,K_OF,FOLLOW_K_OF_in_listPermissionsStatement2832); 
                    pushFollow(FOLLOW_username_in_listPermissionsStatement2834);
                    username8=username();

                    state._fsp--;

                     username = (username8!=null?input.toString(username8.start,username8.stop):null); 

                    }
                    break;

            }

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:538:7: ( K_NORECURSIVE )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==K_NORECURSIVE) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:538:9: K_NORECURSIVE
                    {
                    match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listPermissionsStatement2849); 
                     recursive = false; 

                    }
                    break;

            }

             stmt = new ListPermissionsStatement(permissionOrAll9, resource, username, recursive); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "listPermissionsStatement"


    // $ANTLR start "permission"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:542:1: permission returns [Permission perm] : p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE ) ;
    public final Permission permission() throws RecognitionException {
        Permission perm = null;

        Token p=null;

        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:543:5: (p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE ) )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:543:7: p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE )
            {
            p=(Token)input.LT(1);
            if ( input.LA(1)==K_SELECT||input.LA(1)==K_CREATE||input.LA(1)==K_ALTER||input.LA(1)==K_DROP||(input.LA(1)>=K_MODIFY && input.LA(1)<=K_AUTHORIZE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             perm = Permission.valueOf((p!=null?p.getText():null).toUpperCase()); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return perm;
    }
    // $ANTLR end "permission"


    // $ANTLR start "permissionOrAll"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:547:1: permissionOrAll returns [Set<Permission> perms] : ( K_ALL ( K_PERMISSIONS )? | p= permission ( K_PERMISSION )? );
    public final Set<Permission> permissionOrAll() throws RecognitionException {
        Set<Permission> perms = null;

        Permission p = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:548:5: ( K_ALL ( K_PERMISSIONS )? | p= permission ( K_PERMISSION )? )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==K_ALL) ) {
                alt55=1;
            }
            else if ( (LA55_0==K_SELECT||LA55_0==K_CREATE||LA55_0==K_ALTER||LA55_0==K_DROP||(LA55_0>=K_MODIFY && LA55_0<=K_AUTHORIZE)) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:548:7: K_ALL ( K_PERMISSIONS )?
                    {
                    match(input,K_ALL,FOLLOW_K_ALL_in_permissionOrAll2934); 
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:548:13: ( K_PERMISSIONS )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==K_PERMISSIONS) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:548:15: K_PERMISSIONS
                            {
                            match(input,K_PERMISSIONS,FOLLOW_K_PERMISSIONS_in_permissionOrAll2938); 

                            }
                            break;

                    }

                     perms = Permission.ALL_DATA; 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:549:7: p= permission ( K_PERMISSION )?
                    {
                    pushFollow(FOLLOW_permission_in_permissionOrAll2959);
                    p=permission();

                    state._fsp--;

                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:549:20: ( K_PERMISSION )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==K_PERMISSION) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:549:22: K_PERMISSION
                            {
                            match(input,K_PERMISSION,FOLLOW_K_PERMISSION_in_permissionOrAll2963); 

                            }
                            break;

                    }

                     perms = EnumSet.of(p); 

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
        return perms;
    }
    // $ANTLR end "permissionOrAll"


    // $ANTLR start "resource"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:552:1: resource returns [IResource res] : r= dataResource ;
    public final IResource resource() throws RecognitionException {
        IResource res = null;

        DataResource r = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:553:5: (r= dataResource )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:553:7: r= dataResource
            {
            pushFollow(FOLLOW_dataResource_in_resource2991);
            r=dataResource();

            state._fsp--;

             res = r; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return res;
    }
    // $ANTLR end "resource"


    // $ANTLR start "dataResource"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:556:1: dataResource returns [DataResource res] : ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName );
    public final DataResource dataResource() throws RecognitionException {
        DataResource res = null;

        String ks = null;

        CFName cf = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:557:5: ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName )
            int alt57=3;
            switch ( input.LA(1) ) {
            case K_ALL:
                {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==K_KEYSPACES) ) {
                    alt57=1;
                }
                else if ( (LA57_1==EOF||LA57_1==K_FROM||LA57_1==K_TO||(LA57_1>=K_OF && LA57_1<=K_NORECURSIVE)||LA57_1==124||LA57_1==131) ) {
                    alt57=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
                }
                break;
            case K_KEYSPACE:
                {
                alt57=2;
                }
                break;
            case K_COUNT:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_COLUMNFAMILY:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case IDENT:
            case K_TYPE:
            case K_LIST:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case QUOTED_NAME:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:557:7: K_ALL K_KEYSPACES
                    {
                    match(input,K_ALL,FOLLOW_K_ALL_in_dataResource3014); 
                    match(input,K_KEYSPACES,FOLLOW_K_KEYSPACES_in_dataResource3016); 
                     res = DataResource.root(); 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:558:7: K_KEYSPACE ks= keyspaceName
                    {
                    match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dataResource3026); 
                    pushFollow(FOLLOW_keyspaceName_in_dataResource3032);
                    ks=keyspaceName();

                    state._fsp--;

                     res = DataResource.keyspace(ks); 

                    }
                    break;
                case 3 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:559:7: ( K_COLUMNFAMILY )? cf= columnFamilyName
                    {
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:559:7: ( K_COLUMNFAMILY )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==K_COLUMNFAMILY) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:559:9: K_COLUMNFAMILY
                            {
                            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dataResource3044); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_columnFamilyName_in_dataResource3053);
                    cf=columnFamilyName();

                    state._fsp--;

                     res = DataResource.columnFamily(cf.getKeyspace(), cf.getColumnFamily()); 

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
        return res;
    }
    // $ANTLR end "dataResource"


    // $ANTLR start "createUserStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:563:1: createUserStatement returns [CreateUserStatement stmt] : K_CREATE K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
    public final CreateUserStatement createUserStatement() throws RecognitionException {
        CreateUserStatement stmt = null;

        CqlParser.username_return username10 = null;



                UserOptions opts = new UserOptions();
                boolean superuser = false;
            
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:571:5: ( K_CREATE K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:571:7: K_CREATE K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createUserStatement3093); 
            match(input,K_USER,FOLLOW_K_USER_in_createUserStatement3095); 
            pushFollow(FOLLOW_username_in_createUserStatement3097);
            username10=username();

            state._fsp--;

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:572:7: ( K_WITH userOptions[opts] )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==K_WITH) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:572:9: K_WITH userOptions[opts]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_createUserStatement3107); 
                    pushFollow(FOLLOW_userOptions_in_createUserStatement3109);
                    userOptions(opts);

                    state._fsp--;


                    }
                    break;

            }

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:573:7: ( K_SUPERUSER | K_NOSUPERUSER )?
            int alt59=3;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==K_SUPERUSER) ) {
                alt59=1;
            }
            else if ( (LA59_0==K_NOSUPERUSER) ) {
                alt59=2;
            }
            switch (alt59) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:573:9: K_SUPERUSER
                    {
                    match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_createUserStatement3123); 
                     superuser = true; 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:573:45: K_NOSUPERUSER
                    {
                    match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_createUserStatement3129); 
                     superuser = false; 

                    }
                    break;

            }

             stmt = new CreateUserStatement((username10!=null?input.toString(username10.start,username10.stop):null), opts, superuser); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "createUserStatement"


    // $ANTLR start "alterUserStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:577:1: alterUserStatement returns [AlterUserStatement stmt] : K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
    public final AlterUserStatement alterUserStatement() throws RecognitionException {
        AlterUserStatement stmt = null;

        CqlParser.username_return username11 = null;



                UserOptions opts = new UserOptions();
                Boolean superuser = null;
            
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:585:5: ( K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:585:7: K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterUserStatement3174); 
            match(input,K_USER,FOLLOW_K_USER_in_alterUserStatement3176); 
            pushFollow(FOLLOW_username_in_alterUserStatement3178);
            username11=username();

            state._fsp--;

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:586:7: ( K_WITH userOptions[opts] )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==K_WITH) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:586:9: K_WITH userOptions[opts]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_alterUserStatement3188); 
                    pushFollow(FOLLOW_userOptions_in_alterUserStatement3190);
                    userOptions(opts);

                    state._fsp--;


                    }
                    break;

            }

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:587:7: ( K_SUPERUSER | K_NOSUPERUSER )?
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==K_SUPERUSER) ) {
                alt61=1;
            }
            else if ( (LA61_0==K_NOSUPERUSER) ) {
                alt61=2;
            }
            switch (alt61) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:587:9: K_SUPERUSER
                    {
                    match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_alterUserStatement3204); 
                     superuser = true; 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:587:45: K_NOSUPERUSER
                    {
                    match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_alterUserStatement3210); 
                     superuser = false; 

                    }
                    break;

            }

             stmt = new AlterUserStatement((username11!=null?input.toString(username11.start,username11.stop):null), opts, superuser); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "alterUserStatement"


    // $ANTLR start "dropUserStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:591:1: dropUserStatement returns [DropUserStatement stmt] : K_DROP K_USER username ;
    public final DropUserStatement dropUserStatement() throws RecognitionException {
        DropUserStatement stmt = null;

        CqlParser.username_return username12 = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:595:5: ( K_DROP K_USER username )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:595:7: K_DROP K_USER username
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropUserStatement3246); 
            match(input,K_USER,FOLLOW_K_USER_in_dropUserStatement3248); 
            pushFollow(FOLLOW_username_in_dropUserStatement3250);
            username12=username();

            state._fsp--;

             stmt = new DropUserStatement((username12!=null?input.toString(username12.start,username12.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "dropUserStatement"


    // $ANTLR start "listUsersStatement"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:598:1: listUsersStatement returns [ListUsersStatement stmt] : K_LIST K_USERS ;
    public final ListUsersStatement listUsersStatement() throws RecognitionException {
        ListUsersStatement stmt = null;

        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:602:5: ( K_LIST K_USERS )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:602:7: K_LIST K_USERS
            {
            match(input,K_LIST,FOLLOW_K_LIST_in_listUsersStatement3275); 
            match(input,K_USERS,FOLLOW_K_USERS_in_listUsersStatement3277); 
             stmt = new ListUsersStatement(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "listUsersStatement"


    // $ANTLR start "userOptions"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:605:1: userOptions[UserOptions opts] : userOption[opts] ;
    public final void userOptions(UserOptions opts) throws RecognitionException {
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:606:5: ( userOption[opts] )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:606:7: userOption[opts]
            {
            pushFollow(FOLLOW_userOption_in_userOptions3297);
            userOption(opts);

            state._fsp--;


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
    // $ANTLR end "userOptions"


    // $ANTLR start "userOption"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:609:1: userOption[UserOptions opts] : k= K_PASSWORD v= STRING_LITERAL ;
    public final void userOption(UserOptions opts) throws RecognitionException {
        Token k=null;
        Token v=null;

        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:610:5: (k= K_PASSWORD v= STRING_LITERAL )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:610:7: k= K_PASSWORD v= STRING_LITERAL
            {
            k=(Token)match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_userOption3318); 
            v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_userOption3322); 
             opts.put((k!=null?k.getText():null), (v!=null?v.getText():null)); 

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
    // $ANTLR end "userOption"


    // $ANTLR start "cident"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:613:1: cident returns [ColumnIdentifier id] : (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword );
    public final ColumnIdentifier cident() throws RecognitionException {
        ColumnIdentifier id = null;

        Token t=null;
        String k = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:617:5: (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword )
            int alt62=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt62=1;
                }
                break;
            case QUOTED_NAME:
                {
                alt62=2;
                }
                break;
            case K_COUNT:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt62=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:617:7: t= IDENT
                    {
                    t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cident3351); 
                     id = new ColumnIdentifier((t!=null?t.getText():null), false); 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:618:7: t= QUOTED_NAME
                    {
                    t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cident3376); 
                     id = new ColumnIdentifier((t!=null?t.getText():null), true); 

                    }
                    break;
                case 3 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:619:7: k= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_cident3395);
                    k=unreserved_keyword();

                    state._fsp--;

                     id = new ColumnIdentifier(k, false); 

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
        return id;
    }
    // $ANTLR end "cident"


    // $ANTLR start "keyspaceName"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:623:1: keyspaceName returns [String id] : cfOrKsName[name, true] ;
    public final String keyspaceName() throws RecognitionException {
        String id = null;

         CFName name = new CFName(); 
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:625:5: ( cfOrKsName[name, true] )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:625:7: cfOrKsName[name, true]
            {
            pushFollow(FOLLOW_cfOrKsName_in_keyspaceName3428);
            cfOrKsName(name, true);

            state._fsp--;

             id = name.getKeyspace(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "keyspaceName"


    // $ANTLR start "columnFamilyName"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:628:1: columnFamilyName returns [CFName name] : ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false] ;
    public final CFName columnFamilyName() throws RecognitionException {
        CFName name = null;

         name = new CFName(); 
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:630:5: ( ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false] )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:630:7: ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false]
            {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:630:7: ( cfOrKsName[name, true] '.' )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:630:8: cfOrKsName[name, true] '.'
                    {
                    pushFollow(FOLLOW_cfOrKsName_in_columnFamilyName3462);
                    cfOrKsName(name, true);

                    state._fsp--;

                    match(input,131,FOLLOW_131_in_columnFamilyName3465); 

                    }
                    break;

            }

            pushFollow(FOLLOW_cfOrKsName_in_columnFamilyName3469);
            cfOrKsName(name, false);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return name;
    }
    // $ANTLR end "columnFamilyName"


    // $ANTLR start "cfOrKsName"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:633:1: cfOrKsName[CFName name, boolean isKs] : (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword );
    public final void cfOrKsName(CFName name, boolean isKs) throws RecognitionException {
        Token t=null;
        String k = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:634:5: (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword )
            int alt64=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt64=1;
                }
                break;
            case QUOTED_NAME:
                {
                alt64=2;
                }
                break;
            case K_COUNT:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt64=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:634:7: t= IDENT
                    {
                    t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cfOrKsName3490); 
                     if (isKs) name.setKeyspace((t!=null?t.getText():null), false); else name.setColumnFamily((t!=null?t.getText():null), false); 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:635:7: t= QUOTED_NAME
                    {
                    t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cfOrKsName3515); 
                     if (isKs) name.setKeyspace((t!=null?t.getText():null), true); else name.setColumnFamily((t!=null?t.getText():null), true); 

                    }
                    break;
                case 3 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:636:7: k= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_cfOrKsName3534);
                    k=unreserved_keyword();

                    state._fsp--;

                     if (isKs) name.setKeyspace(k, false); else name.setColumnFamily(k, false); 

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
        return ;
    }
    // $ANTLR end "cfOrKsName"


    // $ANTLR start "set_operation"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:639:1: set_operation returns [Operation op] : (t= finalTerm | mk= QMARK | m= map_literal | l= list_literal | s= set_literal );
    public final Operation set_operation() throws RecognitionException {
        Operation op = null;

        Token mk=null;
        Term t = null;

        Map<Term, Term> m = null;

        List<Term> l = null;

        List<Term> s = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:640:5: (t= finalTerm | mk= QMARK | m= map_literal | l= list_literal | s= set_literal )
            int alt65=5;
            switch ( input.LA(1) ) {
            case INTEGER:
            case STRING_LITERAL:
            case UUID:
            case FLOAT:
            case K_TRUE:
            case K_FALSE:
                {
                alt65=1;
                }
                break;
            case QMARK:
                {
                alt65=2;
                }
                break;
            case 132:
                {
                int LA65_3 = input.LA(2);

                if ( (LA65_3==INTEGER||LA65_3==STRING_LITERAL||(LA65_3>=UUID && LA65_3<=K_FALSE)) ) {
                    int LA65_5 = input.LA(3);

                    if ( (LA65_5==127||LA65_5==133) ) {
                        alt65=5;
                    }
                    else if ( (LA65_5==134) ) {
                        alt65=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA65_3==133) ) {
                    alt65=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 3, input);

                    throw nvae;
                }
                }
                break;
            case 129:
                {
                alt65=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:640:7: t= finalTerm
                    {
                    pushFollow(FOLLOW_finalTerm_in_set_operation3559);
                    t=finalTerm();

                    state._fsp--;

                     op = ColumnOperation.Set(t); 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:641:7: mk= QMARK
                    {
                    mk=(Token)match(input,QMARK,FOLLOW_QMARK_in_set_operation3574); 
                     op = new PreparedOperation(new Term((mk!=null?mk.getText():null), (mk!=null?mk.getType():0), ++currentBindMarkerIdx), PreparedOperation.Kind.SET); 

                    }
                    break;
                case 3 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:642:7: m= map_literal
                    {
                    pushFollow(FOLLOW_map_literal_in_set_operation3592);
                    m=map_literal();

                    state._fsp--;

                     op = MapOperation.Set(m);  

                    }
                    break;
                case 4 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:643:7: l= list_literal
                    {
                    pushFollow(FOLLOW_list_literal_in_set_operation3605);
                    l=list_literal();

                    state._fsp--;

                     op = ListOperation.Set(l); 

                    }
                    break;
                case 5 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:644:7: s= set_literal
                    {
                    pushFollow(FOLLOW_set_literal_in_set_operation3617);
                    s=set_literal();

                    state._fsp--;

                     op = SetOperation.Set(s);  

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
        return op;
    }
    // $ANTLR end "set_operation"


    // $ANTLR start "list_literal"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:647:1: list_literal returns [List<Term> value] : '[' (t1= finalTerm ( ',' tn= finalTerm )* )? ']' ;
    public final List<Term> list_literal() throws RecognitionException {
        List<Term> value = null;

        Term t1 = null;

        Term tn = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:648:5: ( '[' (t1= finalTerm ( ',' tn= finalTerm )* )? ']' )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:648:7: '[' (t1= finalTerm ( ',' tn= finalTerm )* )? ']'
            {
            match(input,129,FOLLOW_129_in_list_literal3641); 
             List<Term> l = new ArrayList<Term>(); 
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:648:53: (t1= finalTerm ( ',' tn= finalTerm )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==INTEGER||LA67_0==STRING_LITERAL||(LA67_0>=UUID && LA67_0<=K_FALSE)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:648:55: t1= finalTerm ( ',' tn= finalTerm )*
                    {
                    pushFollow(FOLLOW_finalTerm_in_list_literal3649);
                    t1=finalTerm();

                    state._fsp--;

                     l.add(t1); 
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:648:83: ( ',' tn= finalTerm )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==127) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:648:85: ',' tn= finalTerm
                    	    {
                    	    match(input,127,FOLLOW_127_in_list_literal3655); 
                    	    pushFollow(FOLLOW_finalTerm_in_list_literal3659);
                    	    tn=finalTerm();

                    	    state._fsp--;

                    	     l.add(tn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,130,FOLLOW_130_in_list_literal3669); 
             value = l; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "list_literal"


    // $ANTLR start "set_literal"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:651:1: set_literal returns [List<Term> value] : '{' (t1= finalTerm ( ',' tn= finalTerm )* )? '}' ;
    public final List<Term> set_literal() throws RecognitionException {
        List<Term> value = null;

        Term t1 = null;

        Term tn = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:652:5: ( '{' (t1= finalTerm ( ',' tn= finalTerm )* )? '}' )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:652:7: '{' (t1= finalTerm ( ',' tn= finalTerm )* )? '}'
            {
            match(input,132,FOLLOW_132_in_set_literal3692); 
             List<Term> s = new ArrayList<Term>(); 
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:652:53: (t1= finalTerm ( ',' tn= finalTerm )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==INTEGER||LA69_0==STRING_LITERAL||(LA69_0>=UUID && LA69_0<=K_FALSE)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:652:55: t1= finalTerm ( ',' tn= finalTerm )*
                    {
                    pushFollow(FOLLOW_finalTerm_in_set_literal3700);
                    t1=finalTerm();

                    state._fsp--;

                     s.add(t1); 
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:652:83: ( ',' tn= finalTerm )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==127) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:652:85: ',' tn= finalTerm
                    	    {
                    	    match(input,127,FOLLOW_127_in_set_literal3706); 
                    	    pushFollow(FOLLOW_finalTerm_in_set_literal3710);
                    	    tn=finalTerm();

                    	    state._fsp--;

                    	     s.add(tn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,133,FOLLOW_133_in_set_literal3720); 
             value = s; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "set_literal"


    // $ANTLR start "map_literal"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:655:1: map_literal returns [Map<Term, Term> value] : '{' k1= finalTerm ':' v1= finalTerm ( ',' kn= finalTerm ':' vn= finalTerm )* '}' ;
    public final Map<Term, Term> map_literal() throws RecognitionException {
        Map<Term, Term> value = null;

        Term k1 = null;

        Term v1 = null;

        Term kn = null;

        Term vn = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:657:5: ( '{' k1= finalTerm ':' v1= finalTerm ( ',' kn= finalTerm ':' vn= finalTerm )* '}' )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:657:7: '{' k1= finalTerm ':' v1= finalTerm ( ',' kn= finalTerm ':' vn= finalTerm )* '}'
            {
            match(input,132,FOLLOW_132_in_map_literal3749); 
             Map<Term, Term> m = new HashMap<Term, Term>(); 
            pushFollow(FOLLOW_finalTerm_in_map_literal3765);
            k1=finalTerm();

            state._fsp--;

            match(input,134,FOLLOW_134_in_map_literal3767); 
            pushFollow(FOLLOW_finalTerm_in_map_literal3771);
            v1=finalTerm();

            state._fsp--;

             m.put(k1, v1); 
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:658:60: ( ',' kn= finalTerm ':' vn= finalTerm )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==127) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:658:62: ',' kn= finalTerm ':' vn= finalTerm
            	    {
            	    match(input,127,FOLLOW_127_in_map_literal3777); 
            	    pushFollow(FOLLOW_finalTerm_in_map_literal3781);
            	    kn=finalTerm();

            	    state._fsp--;

            	    match(input,134,FOLLOW_134_in_map_literal3783); 
            	    pushFollow(FOLLOW_finalTerm_in_map_literal3787);
            	    vn=finalTerm();

            	    state._fsp--;

            	     m.put(kn, vn); 

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            match(input,133,FOLLOW_133_in_map_literal3794); 
             value = m; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "map_literal"


    // $ANTLR start "finalTerm"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:662:1: finalTerm returns [Term term] : t= ( STRING_LITERAL | UUID | INTEGER | FLOAT | K_TRUE | K_FALSE ) ;
    public final Term finalTerm() throws RecognitionException {
        Term term = null;

        Token t=null;

        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:663:5: (t= ( STRING_LITERAL | UUID | INTEGER | FLOAT | K_TRUE | K_FALSE ) )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:663:7: t= ( STRING_LITERAL | UUID | INTEGER | FLOAT | K_TRUE | K_FALSE )
            {
            t=(Token)input.LT(1);
            if ( input.LA(1)==INTEGER||input.LA(1)==STRING_LITERAL||(input.LA(1)>=UUID && input.LA(1)<=K_FALSE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             term = new Term((t!=null?t.getText():null), (t!=null?t.getType():0)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return term;
    }
    // $ANTLR end "finalTerm"


    // $ANTLR start "term"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:666:1: term returns [Term term] : (ft= finalTerm | t= QMARK );
    public final Term term() throws RecognitionException {
        Term term = null;

        Token t=null;
        Term ft = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:667:5: (ft= finalTerm | t= QMARK )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==INTEGER||LA71_0==STRING_LITERAL||(LA71_0>=UUID && LA71_0<=K_FALSE)) ) {
                alt71=1;
            }
            else if ( (LA71_0==QMARK) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:667:7: ft= finalTerm
                    {
                    pushFollow(FOLLOW_finalTerm_in_term3874);
                    ft=finalTerm();

                    state._fsp--;

                     term = ft; 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:668:7: t= QMARK
                    {
                    t=(Token)match(input,QMARK,FOLLOW_QMARK_in_term3886); 
                     term = new Term((t!=null?t.getText():null), (t!=null?t.getType():0), ++currentBindMarkerIdx); 

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
        return term;
    }
    // $ANTLR end "term"


    // $ANTLR start "termPairWithOperation"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:671:1: termPairWithOperation[List<Pair<ColumnIdentifier, Operation>> columns] : (key= cident '=' (set_op= set_operation | c= cident op= operation | ll= list_literal '+' c= cident | mk= QMARK '+' c= cident ) | key= cident '[' t= term ']' '=' vv= term );
    public final void termPairWithOperation(List<Pair<ColumnIdentifier, Operation>> columns) throws RecognitionException {
        Token mk=null;
        ColumnIdentifier key = null;

        Operation set_op = null;

        ColumnIdentifier c = null;

        Operation op = null;

        List<Term> ll = null;

        Term t = null;

        Term vv = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:672:5: (key= cident '=' (set_op= set_operation | c= cident op= operation | ll= list_literal '+' c= cident | mk= QMARK '+' c= cident ) | key= cident '[' t= term ']' '=' vv= term )
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:672:7: key= cident '=' (set_op= set_operation | c= cident op= operation | ll= list_literal '+' c= cident | mk= QMARK '+' c= cident )
                    {
                    pushFollow(FOLLOW_cident_in_termPairWithOperation3913);
                    key=cident();

                    state._fsp--;

                    match(input,135,FOLLOW_135_in_termPairWithOperation3915); 
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:673:9: (set_op= set_operation | c= cident op= operation | ll= list_literal '+' c= cident | mk= QMARK '+' c= cident )
                    int alt72=4;
                    alt72 = dfa72.predict(input);
                    switch (alt72) {
                        case 1 :
                            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:673:11: set_op= set_operation
                            {
                            pushFollow(FOLLOW_set_operation_in_termPairWithOperation3929);
                            set_op=set_operation();

                            state._fsp--;

                             columns.add(Pair.<ColumnIdentifier, Operation>create(key, set_op)); 

                            }
                            break;
                        case 2 :
                            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:674:11: c= cident op= operation
                            {
                            pushFollow(FOLLOW_cident_in_termPairWithOperation3945);
                            c=cident();

                            state._fsp--;

                            pushFollow(FOLLOW_operation_in_termPairWithOperation3949);
                            op=operation();

                            state._fsp--;


                                          if (!key.equals(c))
                                              addRecognitionError("Only expressions like X = X <op> <value> are supported.");
                                          columns.add(Pair.<ColumnIdentifier, Operation>create(key, op));
                                      

                            }
                            break;
                        case 3 :
                            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:680:11: ll= list_literal '+' c= cident
                            {
                            pushFollow(FOLLOW_list_literal_in_termPairWithOperation3975);
                            ll=list_literal();

                            state._fsp--;

                            match(input,136,FOLLOW_136_in_termPairWithOperation3977); 
                            pushFollow(FOLLOW_cident_in_termPairWithOperation3981);
                            c=cident();

                            state._fsp--;


                                          if (!key.equals(c))
                                              addRecognitionError("Only expressions like X = <value> + X are supported.");
                                          columns.add(Pair.<ColumnIdentifier, Operation>create(key, ListOperation.Prepend(ll)));
                                      

                            }
                            break;
                        case 4 :
                            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:686:11: mk= QMARK '+' c= cident
                            {
                            mk=(Token)match(input,QMARK,FOLLOW_QMARK_in_termPairWithOperation4007); 
                            match(input,136,FOLLOW_136_in_termPairWithOperation4009); 
                            pushFollow(FOLLOW_cident_in_termPairWithOperation4013);
                            c=cident();

                            state._fsp--;


                                          if (!key.equals(c))
                                              addRecognitionError("Only expressions like X = <value> + X are supported.");
                                          PreparedOperation pop = new PreparedOperation(new Term((mk!=null?mk.getText():null), (mk!=null?mk.getType():0), ++currentBindMarkerIdx), PreparedOperation.Kind.PREPARED_PLUS);
                                          columns.add(Pair.<ColumnIdentifier, Operation>create(key, pop));
                                      

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:694:7: key= cident '[' t= term ']' '=' vv= term
                    {
                    pushFollow(FOLLOW_cident_in_termPairWithOperation4045);
                    key=cident();

                    state._fsp--;

                    match(input,129,FOLLOW_129_in_termPairWithOperation4047); 
                    pushFollow(FOLLOW_term_in_termPairWithOperation4051);
                    t=term();

                    state._fsp--;

                    match(input,130,FOLLOW_130_in_termPairWithOperation4053); 
                    match(input,135,FOLLOW_135_in_termPairWithOperation4055); 
                    pushFollow(FOLLOW_term_in_termPairWithOperation4059);
                    vv=term();

                    state._fsp--;


                              // This is ambiguous, this can either set a list by index, or be a map put.
                              // So we always return a list setIndex and we'll check later and
                              // backtrack to a map operation if need be.
                              columns.add(Pair.<ColumnIdentifier, Operation>create(key, ListOperation.SetIndex(Arrays.asList(t, vv))));
                          

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
        return ;
    }
    // $ANTLR end "termPairWithOperation"


    // $ANTLR start "intTerm"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:703:1: intTerm returns [Term integer] : (t= INTEGER | t= QMARK );
    public final Term intTerm() throws RecognitionException {
        Term integer = null;

        Token t=null;

        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:704:5: (t= INTEGER | t= QMARK )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==INTEGER) ) {
                alt74=1;
            }
            else if ( (LA74_0==QMARK) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:704:7: t= INTEGER
                    {
                    t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_intTerm4090); 
                     integer = new Term((t!=null?t.getText():null), (t!=null?t.getType():0)); 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:705:7: t= QMARK
                    {
                    t=(Token)match(input,QMARK,FOLLOW_QMARK_in_intTerm4102); 
                     integer = new Term((t!=null?t.getText():null), (t!=null?t.getType():0), ++currentBindMarkerIdx); 

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
        return integer;
    }
    // $ANTLR end "intTerm"


    // $ANTLR start "operation"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:709:1: operation returns [Operation op] : ( '+' i= INTEGER | (sign= '-' )? i= INTEGER | '+' mk= QMARK | '-' mk= QMARK | '+' ll= list_literal | '-' ll= list_literal | '+' sl= set_literal | '-' sl= set_literal | '+' ml= map_literal );
    public final Operation operation() throws RecognitionException {
        Operation op = null;

        Token i=null;
        Token sign=null;
        Token mk=null;
        List<Term> ll = null;

        List<Term> sl = null;

        Map<Term, Term> ml = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:710:5: ( '+' i= INTEGER | (sign= '-' )? i= INTEGER | '+' mk= QMARK | '-' mk= QMARK | '+' ll= list_literal | '-' ll= list_literal | '+' sl= set_literal | '-' sl= set_literal | '+' ml= map_literal )
            int alt76=9;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:710:7: '+' i= INTEGER
                    {
                    match(input,136,FOLLOW_136_in_operation4128); 
                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation4132); 
                     op = ColumnOperation.CounterInc(new Term((i!=null?i.getText():null), (i!=null?i.getType():0))); 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:711:7: (sign= '-' )? i= INTEGER
                    {
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:711:11: (sign= '-' )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==137) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:711:11: sign= '-'
                            {
                            sign=(Token)match(input,137,FOLLOW_137_in_operation4144); 

                            }
                            break;

                    }

                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation4149); 

                              Term t = new Term((i!=null?i.getText():null), (i!=null?i.getType():0));
                              validateMinusSupplied(sign, t, input);
                              if (sign == null)
                                  t = new Term(-(Long.valueOf(t.getText())), t.getType());
                              op = ColumnOperation.CounterDec(t);
                          

                    }
                    break;
                case 3 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:719:7: '+' mk= QMARK
                    {
                    match(input,136,FOLLOW_136_in_operation4165); 
                    mk=(Token)match(input,QMARK,FOLLOW_QMARK_in_operation4169); 
                     op = new PreparedOperation(new Term((mk!=null?mk.getText():null), (mk!=null?mk.getType():0), ++currentBindMarkerIdx), PreparedOperation.Kind.PLUS_PREPARED); 

                    }
                    break;
                case 4 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:720:7: '-' mk= QMARK
                    {
                    match(input,137,FOLLOW_137_in_operation4179); 
                    mk=(Token)match(input,QMARK,FOLLOW_QMARK_in_operation4183); 
                     op = new PreparedOperation(new Term((mk!=null?mk.getText():null), (mk!=null?mk.getType():0), ++currentBindMarkerIdx), PreparedOperation.Kind.MINUS_PREPARED); 

                    }
                    break;
                case 5 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:722:7: '+' ll= list_literal
                    {
                    match(input,136,FOLLOW_136_in_operation4194); 
                    pushFollow(FOLLOW_list_literal_in_operation4198);
                    ll=list_literal();

                    state._fsp--;

                     op = ListOperation.Append(ll); 

                    }
                    break;
                case 6 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:723:7: '-' ll= list_literal
                    {
                    match(input,137,FOLLOW_137_in_operation4208); 
                    pushFollow(FOLLOW_list_literal_in_operation4212);
                    ll=list_literal();

                    state._fsp--;

                     op = ListOperation.Discard(ll); 

                    }
                    break;
                case 7 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:725:7: '+' sl= set_literal
                    {
                    match(input,136,FOLLOW_136_in_operation4223); 
                    pushFollow(FOLLOW_set_literal_in_operation4227);
                    sl=set_literal();

                    state._fsp--;

                     op = SetOperation.Add(sl); 

                    }
                    break;
                case 8 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:726:7: '-' sl= set_literal
                    {
                    match(input,137,FOLLOW_137_in_operation4237); 
                    pushFollow(FOLLOW_set_literal_in_operation4241);
                    sl=set_literal();

                    state._fsp--;

                     op = SetOperation.Discard(sl); 

                    }
                    break;
                case 9 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:728:7: '+' ml= map_literal
                    {
                    match(input,136,FOLLOW_136_in_operation4252); 
                    pushFollow(FOLLOW_map_literal_in_operation4256);
                    ml=map_literal();

                    state._fsp--;

                     op = MapOperation.Put(ml); 

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
        return op;
    }
    // $ANTLR end "operation"


    // $ANTLR start "properties"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:731:1: properties[PropertyDefinitions props] : property[props] ( K_AND property[props] )* ;
    public final void properties(PropertyDefinitions props) throws RecognitionException {
        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:732:5: ( property[props] ( K_AND property[props] )* )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:732:7: property[props] ( K_AND property[props] )*
            {
            pushFollow(FOLLOW_property_in_properties4276);
            property(props);

            state._fsp--;

            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:732:23: ( K_AND property[props] )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==K_AND) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:732:24: K_AND property[props]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_properties4280); 
            	    pushFollow(FOLLOW_property_in_properties4282);
            	    property(props);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop77;
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
        return ;
    }
    // $ANTLR end "properties"


    // $ANTLR start "property"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:735:1: property[PropertyDefinitions props] : k= cident '=' (simple= propertyValue | map= map_literal ) ;
    public final void property(PropertyDefinitions props) throws RecognitionException {
        ColumnIdentifier k = null;

        String simple = null;

        Map<Term, Term> map = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:736:5: (k= cident '=' (simple= propertyValue | map= map_literal ) )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:736:7: k= cident '=' (simple= propertyValue | map= map_literal )
            {
            pushFollow(FOLLOW_cident_in_property4305);
            k=cident();

            state._fsp--;

            match(input,135,FOLLOW_135_in_property4307); 
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:736:20: (simple= propertyValue | map= map_literal )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==K_COUNT||LA78_0==INTEGER||(LA78_0>=K_FILTERING && LA78_0<=K_TTL)||LA78_0==K_VALUES||LA78_0==K_TIMESTAMP||LA78_0==K_COUNTER||(LA78_0>=K_KEY && LA78_0<=K_CLUSTERING)||LA78_0==IDENT||LA78_0==K_TYPE||LA78_0==K_LIST||(LA78_0>=K_ALL && LA78_0<=STRING_LITERAL)||(LA78_0>=FLOAT && LA78_0<=K_FALSE)||(LA78_0>=K_ASCII && LA78_0<=K_MAP)) ) {
                alt78=1;
            }
            else if ( (LA78_0==132) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:736:21: simple= propertyValue
                    {
                    pushFollow(FOLLOW_propertyValue_in_property4312);
                    simple=propertyValue();

                    state._fsp--;

                     try { props.addProperty(k.toString(), simple); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:737:24: map= map_literal
                    {
                    pushFollow(FOLLOW_map_literal_in_property4341);
                    map=map_literal();

                    state._fsp--;

                     try { props.addProperty(k.toString(), convertMap(map)); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 

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
        return ;
    }
    // $ANTLR end "property"


    // $ANTLR start "propertyValue"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:740:1: propertyValue returns [String str] : (v= ( STRING_LITERAL | IDENT | INTEGER | FLOAT | K_TRUE | K_FALSE ) | u= unreserved_keyword );
    public final String propertyValue() throws RecognitionException {
        String str = null;

        Token v=null;
        String u = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:741:5: (v= ( STRING_LITERAL | IDENT | INTEGER | FLOAT | K_TRUE | K_FALSE ) | u= unreserved_keyword )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==INTEGER||LA79_0==IDENT||LA79_0==STRING_LITERAL||(LA79_0>=FLOAT && LA79_0<=K_FALSE)) ) {
                alt79=1;
            }
            else if ( (LA79_0==K_COUNT||(LA79_0>=K_FILTERING && LA79_0<=K_TTL)||LA79_0==K_VALUES||LA79_0==K_TIMESTAMP||LA79_0==K_COUNTER||(LA79_0>=K_KEY && LA79_0<=K_CLUSTERING)||LA79_0==K_TYPE||LA79_0==K_LIST||(LA79_0>=K_ALL && LA79_0<=K_PASSWORD)||(LA79_0>=K_ASCII && LA79_0<=K_MAP)) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:741:7: v= ( STRING_LITERAL | IDENT | INTEGER | FLOAT | K_TRUE | K_FALSE )
                    {
                    v=(Token)input.LT(1);
                    if ( input.LA(1)==INTEGER||input.LA(1)==IDENT||input.LA(1)==STRING_LITERAL||(input.LA(1)>=FLOAT && input.LA(1)<=K_FALSE) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     str = (v!=null?v.getText():null); 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:742:7: u= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_propertyValue4403);
                    u=unreserved_keyword();

                    state._fsp--;

                     str = u; 

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
        return str;
    }
    // $ANTLR end "propertyValue"


    // $ANTLR start "tokenDefinition"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:746:1: tokenDefinition returns [Pair<String, List<Term>> tkdef] : ( K_TOKEN '(' t1= term ( ',' tn= term )* ')' | t= STRING_LITERAL );
    public final Pair<String, List<Term>> tokenDefinition() throws RecognitionException {
        Pair<String, List<Term>> tkdef = null;

        Token t=null;
        Term t1 = null;

        Term tn = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:747:5: ( K_TOKEN '(' t1= term ( ',' tn= term )* ')' | t= STRING_LITERAL )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==K_TOKEN) ) {
                alt81=1;
            }
            else if ( (LA81_0==STRING_LITERAL) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:747:7: K_TOKEN '(' t1= term ( ',' tn= term )* ')'
                    {
                    match(input,K_TOKEN,FOLLOW_K_TOKEN_in_tokenDefinition4451); 
                     List<Term> l = new ArrayList<Term>(); 
                    match(input,125,FOLLOW_125_in_tokenDefinition4464); 
                    pushFollow(FOLLOW_term_in_tokenDefinition4468);
                    t1=term();

                    state._fsp--;

                     l.add(t1); 
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:748:37: ( ',' tn= term )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==127) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:748:39: ',' tn= term
                    	    {
                    	    match(input,127,FOLLOW_127_in_tokenDefinition4474); 
                    	    pushFollow(FOLLOW_term_in_tokenDefinition4478);
                    	    tn=term();

                    	    state._fsp--;

                    	     l.add(tn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    match(input,126,FOLLOW_126_in_tokenDefinition4486); 
                     tkdef = Pair.<String, List<Term>>create(null, l); 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:749:7: t= STRING_LITERAL
                    {
                    t=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_tokenDefinition4498); 
                     tkdef = Pair.<String, List<Term>>create((t!=null?t.getText():null), null); 

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
        return tkdef;
    }
    // $ANTLR end "tokenDefinition"


    // $ANTLR start "relation"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:752:1: relation[List<Relation> clauses] : (name= cident type= ( '=' | '<' | '<=' | '>=' | '>' ) t= term | K_TOKEN '(' name1= cident ( ',' namen= cident )* ')' type= ( '=' | '<' | '<=' | '>=' | '>' ) tkd= tokenDefinition | name= cident K_IN '(' f1= term ( ',' fN= term )* ')' );
    public final void relation(List<Relation> clauses) throws RecognitionException {
        Token type=null;
        ColumnIdentifier name = null;

        Term t = null;

        ColumnIdentifier name1 = null;

        ColumnIdentifier namen = null;

        Pair<String, List<Term>> tkd = null;

        Term f1 = null;

        Term fN = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:753:5: (name= cident type= ( '=' | '<' | '<=' | '>=' | '>' ) t= term | K_TOKEN '(' name1= cident ( ',' namen= cident )* ')' type= ( '=' | '<' | '<=' | '>=' | '>' ) tkd= tokenDefinition | name= cident K_IN '(' f1= term ( ',' fN= term )* ')' )
            int alt84=3;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:753:7: name= cident type= ( '=' | '<' | '<=' | '>=' | '>' ) t= term
                    {
                    pushFollow(FOLLOW_cident_in_relation4520);
                    name=cident();

                    state._fsp--;

                    type=(Token)input.LT(1);
                    if ( input.LA(1)==135||(input.LA(1)>=138 && input.LA(1)<=141) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_term_in_relation4546);
                    t=term();

                    state._fsp--;

                     clauses.add(new Relation(name, (type!=null?type.getText():null), t)); 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:754:7: K_TOKEN '(' name1= cident ( ',' namen= cident )* ')' type= ( '=' | '<' | '<=' | '>=' | '>' ) tkd= tokenDefinition
                    {
                    match(input,K_TOKEN,FOLLOW_K_TOKEN_in_relation4556); 
                     List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>(); 
                    match(input,125,FOLLOW_125_in_relation4567); 
                    pushFollow(FOLLOW_cident_in_relation4571);
                    name1=cident();

                    state._fsp--;

                     l.add(name1); 
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:755:43: ( ',' namen= cident )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==127) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:755:45: ',' namen= cident
                    	    {
                    	    match(input,127,FOLLOW_127_in_relation4577); 
                    	    pushFollow(FOLLOW_cident_in_relation4581);
                    	    namen=cident();

                    	    state._fsp--;

                    	     l.add(namen); 

                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    match(input,126,FOLLOW_126_in_relation4587); 
                    type=(Token)input.LT(1);
                    if ( input.LA(1)==135||(input.LA(1)>=138 && input.LA(1)<=141) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_tokenDefinition_in_relation4623);
                    tkd=tokenDefinition();

                    state._fsp--;


                               if (tkd.right != null && tkd.right.size() != l.size())
                               {
                                   addRecognitionError("The number of arguments to the token() function don't match");
                               }
                               else
                               {
                                   Term str = tkd.left == null ? null : new Term(tkd.left, Term.Type.STRING);
                                   for (int i = 0; i < l.size(); i++)
                                   {
                                       Term tt = str == null ? Term.tokenOf(tkd.right.get(i)) : str;
                                       clauses.add(new Relation(l.get(i), (type!=null?type.getText():null), tt, true));
                                   }
                               }
                           

                    }
                    break;
                case 3 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:772:7: name= cident K_IN '(' f1= term ( ',' fN= term )* ')'
                    {
                    pushFollow(FOLLOW_cident_in_relation4642);
                    name=cident();

                    state._fsp--;

                    match(input,K_IN,FOLLOW_K_IN_in_relation4644); 
                     Relation rel = Relation.createInRelation(name); 
                    match(input,125,FOLLOW_125_in_relation4655); 
                    pushFollow(FOLLOW_term_in_relation4659);
                    f1=term();

                    state._fsp--;

                     rel.addInValue(f1); 
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:773:44: ( ',' fN= term )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==127) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:773:45: ',' fN= term
                    	    {
                    	    match(input,127,FOLLOW_127_in_relation4664); 
                    	    pushFollow(FOLLOW_term_in_relation4668);
                    	    fN=term();

                    	    state._fsp--;

                    	     rel.addInValue(fN); 

                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    match(input,126,FOLLOW_126_in_relation4675); 
                     clauses.add(rel); 

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
        return ;
    }
    // $ANTLR end "relation"


    // $ANTLR start "comparatorType"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:776:1: comparatorType returns [ParsedType t] : (c= native_type | c= collection_type | s= STRING_LITERAL );
    public final ParsedType comparatorType() throws RecognitionException {
        ParsedType t = null;

        Token s=null;
        ParsedType c = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:777:5: (c= native_type | c= collection_type | s= STRING_LITERAL )
            int alt85=3;
            switch ( input.LA(1) ) {
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
                {
                alt85=1;
                }
                break;
            case K_SET:
            case K_LIST:
            case K_MAP:
                {
                alt85=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt85=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:777:7: c= native_type
                    {
                    pushFollow(FOLLOW_native_type_in_comparatorType4700);
                    c=native_type();

                    state._fsp--;

                     t = c; 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:778:7: c= collection_type
                    {
                    pushFollow(FOLLOW_collection_type_in_comparatorType4716);
                    c=collection_type();

                    state._fsp--;

                     t = c; 

                    }
                    break;
                case 3 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:779:7: s= STRING_LITERAL
                    {
                    s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_comparatorType4728); 

                            try {
                                t = new ParsedType.Custom((s!=null?s.getText():null));
                            } catch (SyntaxException e) {
                                addRecognitionError("Cannot parse type " + (s!=null?s.getText():null) + ": " + e.getMessage());
                            } catch (ConfigurationException e) {
                                addRecognitionError("Errot setting type " + (s!=null?s.getText():null) + ": " + e.getMessage());
                            }
                          

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
        return t;
    }
    // $ANTLR end "comparatorType"


    // $ANTLR start "native_type"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:791:1: native_type returns [ParsedType t] : ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_TIMESTAMP | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID );
    public final ParsedType native_type() throws RecognitionException {
        ParsedType t = null;

        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:792:5: ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_TIMESTAMP | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID )
            int alt86=16;
            switch ( input.LA(1) ) {
            case K_ASCII:
                {
                alt86=1;
                }
                break;
            case K_BIGINT:
                {
                alt86=2;
                }
                break;
            case K_BLOB:
                {
                alt86=3;
                }
                break;
            case K_BOOLEAN:
                {
                alt86=4;
                }
                break;
            case K_COUNTER:
                {
                alt86=5;
                }
                break;
            case K_DECIMAL:
                {
                alt86=6;
                }
                break;
            case K_DOUBLE:
                {
                alt86=7;
                }
                break;
            case K_FLOAT:
                {
                alt86=8;
                }
                break;
            case K_INET:
                {
                alt86=9;
                }
                break;
            case K_INT:
                {
                alt86=10;
                }
                break;
            case K_TEXT:
                {
                alt86=11;
                }
                break;
            case K_TIMESTAMP:
                {
                alt86=12;
                }
                break;
            case K_UUID:
                {
                alt86=13;
                }
                break;
            case K_VARCHAR:
                {
                alt86=14;
                }
                break;
            case K_VARINT:
                {
                alt86=15;
                }
                break;
            case K_TIMEUUID:
                {
                alt86=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:792:7: K_ASCII
                    {
                    match(input,K_ASCII,FOLLOW_K_ASCII_in_native_type4757); 
                     t = ParsedType.Native.ASCII; 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:793:7: K_BIGINT
                    {
                    match(input,K_BIGINT,FOLLOW_K_BIGINT_in_native_type4771); 
                     t = ParsedType.Native.BIGINT; 

                    }
                    break;
                case 3 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:794:7: K_BLOB
                    {
                    match(input,K_BLOB,FOLLOW_K_BLOB_in_native_type4784); 
                     t = ParsedType.Native.BLOB; 

                    }
                    break;
                case 4 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:795:7: K_BOOLEAN
                    {
                    match(input,K_BOOLEAN,FOLLOW_K_BOOLEAN_in_native_type4799); 
                     t = ParsedType.Native.BOOLEAN; 

                    }
                    break;
                case 5 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:796:7: K_COUNTER
                    {
                    match(input,K_COUNTER,FOLLOW_K_COUNTER_in_native_type4811); 
                     t = ParsedType.Native.COUNTER; 

                    }
                    break;
                case 6 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:797:7: K_DECIMAL
                    {
                    match(input,K_DECIMAL,FOLLOW_K_DECIMAL_in_native_type4823); 
                     t = ParsedType.Native.DECIMAL; 

                    }
                    break;
                case 7 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:798:7: K_DOUBLE
                    {
                    match(input,K_DOUBLE,FOLLOW_K_DOUBLE_in_native_type4835); 
                     t = ParsedType.Native.DOUBLE; 

                    }
                    break;
                case 8 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:799:7: K_FLOAT
                    {
                    match(input,K_FLOAT,FOLLOW_K_FLOAT_in_native_type4848); 
                     t = ParsedType.Native.FLOAT; 

                    }
                    break;
                case 9 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:800:7: K_INET
                    {
                    match(input,K_INET,FOLLOW_K_INET_in_native_type4862); 
                     t = ParsedType.Native.INET;

                    }
                    break;
                case 10 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:801:7: K_INT
                    {
                    match(input,K_INT,FOLLOW_K_INT_in_native_type4877); 
                     t = ParsedType.Native.INT; 

                    }
                    break;
                case 11 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:802:7: K_TEXT
                    {
                    match(input,K_TEXT,FOLLOW_K_TEXT_in_native_type4893); 
                     t = ParsedType.Native.TEXT; 

                    }
                    break;
                case 12 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:803:7: K_TIMESTAMP
                    {
                    match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_native_type4908); 
                     t = ParsedType.Native.TIMESTAMP; 

                    }
                    break;
                case 13 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:804:7: K_UUID
                    {
                    match(input,K_UUID,FOLLOW_K_UUID_in_native_type4918); 
                     t = ParsedType.Native.UUID; 

                    }
                    break;
                case 14 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:805:7: K_VARCHAR
                    {
                    match(input,K_VARCHAR,FOLLOW_K_VARCHAR_in_native_type4933); 
                     t = ParsedType.Native.VARCHAR; 

                    }
                    break;
                case 15 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:806:7: K_VARINT
                    {
                    match(input,K_VARINT,FOLLOW_K_VARINT_in_native_type4945); 
                     t = ParsedType.Native.VARINT; 

                    }
                    break;
                case 16 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:807:7: K_TIMEUUID
                    {
                    match(input,K_TIMEUUID,FOLLOW_K_TIMEUUID_in_native_type4958); 
                     t = ParsedType.Native.TIMEUUID; 

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
        return t;
    }
    // $ANTLR end "native_type"


    // $ANTLR start "collection_type"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:810:1: collection_type returns [ParsedType pt] : ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' );
    public final ParsedType collection_type() throws RecognitionException {
        ParsedType pt = null;

        ParsedType t1 = null;

        ParsedType t2 = null;

        ParsedType t = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:811:5: ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' )
            int alt87=3;
            switch ( input.LA(1) ) {
            case K_MAP:
                {
                alt87=1;
                }
                break;
            case K_LIST:
                {
                alt87=2;
                }
                break;
            case K_SET:
                {
                alt87=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:811:7: K_MAP '<' t1= comparatorType ',' t2= comparatorType '>'
                    {
                    match(input,K_MAP,FOLLOW_K_MAP_in_collection_type4982); 
                    match(input,138,FOLLOW_138_in_collection_type4985); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type4989);
                    t1=comparatorType();

                    state._fsp--;

                    match(input,127,FOLLOW_127_in_collection_type4991); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type4995);
                    t2=comparatorType();

                    state._fsp--;

                    match(input,141,FOLLOW_141_in_collection_type4997); 
                     try { pt = ParsedType.Collection.map(t1, t2); } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:813:7: K_LIST '<' t= comparatorType '>'
                    {
                    match(input,K_LIST,FOLLOW_K_LIST_in_collection_type5015); 
                    match(input,138,FOLLOW_138_in_collection_type5017); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type5021);
                    t=comparatorType();

                    state._fsp--;

                    match(input,141,FOLLOW_141_in_collection_type5023); 
                     try { pt = ParsedType.Collection.list(t); } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;
                case 3 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:815:7: K_SET '<' t= comparatorType '>'
                    {
                    match(input,K_SET,FOLLOW_K_SET_in_collection_type5041); 
                    match(input,138,FOLLOW_138_in_collection_type5044); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type5048);
                    t=comparatorType();

                    state._fsp--;

                    match(input,141,FOLLOW_141_in_collection_type5050); 
                     try { pt = ParsedType.Collection.set(t); } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 

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
        return pt;
    }
    // $ANTLR end "collection_type"

    public static class username_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "username"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:819:1: username : ( IDENT | STRING_LITERAL );
    public final CqlParser.username_return username() throws RecognitionException {
        CqlParser.username_return retval = new CqlParser.username_return();
        retval.start = input.LT(1);

        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:820:5: ( IDENT | STRING_LITERAL )
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:
            {
            if ( input.LA(1)==IDENT||input.LA(1)==STRING_LITERAL ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "username"


    // $ANTLR start "unreserved_keyword"
    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:824:1: unreserved_keyword returns [String str] : (k= ( K_KEY | K_CLUSTERING | K_COUNT | K_TTL | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_WRITETIME | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD ) | t= native_type );
    public final String unreserved_keyword() throws RecognitionException {
        String str = null;

        Token k=null;
        ParsedType t = null;


        try {
            // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:825:5: (k= ( K_KEY | K_CLUSTERING | K_COUNT | K_TTL | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_WRITETIME | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD ) | t= native_type )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==K_COUNT||(LA88_0>=K_FILTERING && LA88_0<=K_TTL)||LA88_0==K_VALUES||(LA88_0>=K_KEY && LA88_0<=K_CLUSTERING)||LA88_0==K_TYPE||LA88_0==K_LIST||(LA88_0>=K_ALL && LA88_0<=K_PASSWORD)||LA88_0==K_MAP) ) {
                alt88=1;
            }
            else if ( (LA88_0==K_TIMESTAMP||LA88_0==K_COUNTER||(LA88_0>=K_ASCII && LA88_0<=K_TIMEUUID)) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:825:7: k= ( K_KEY | K_CLUSTERING | K_COUNT | K_TTL | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_WRITETIME | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD )
                    {
                    k=(Token)input.LT(1);
                    if ( input.LA(1)==K_COUNT||(input.LA(1)>=K_FILTERING && input.LA(1)<=K_TTL)||input.LA(1)==K_VALUES||(input.LA(1)>=K_KEY && input.LA(1)<=K_CLUSTERING)||input.LA(1)==K_TYPE||input.LA(1)==K_LIST||(input.LA(1)>=K_ALL && input.LA(1)<=K_PASSWORD)||input.LA(1)==K_MAP ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     str = (k!=null?k.getText():null); 

                    }
                    break;
                case 2 :
                    // /home/pschulam/data/habeascorpus-workspace/apache-cassandra-1.2.0/src/java/org/apache/cassandra/cql3/Cql.g:847:7: t= native_type
                    {
                    pushFollow(FOLLOW_native_type_in_unreserved_keyword5372);
                    t=native_type();

                    state._fsp--;

                     str = t.toString(); 

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
        return str;
    }
    // $ANTLR end "unreserved_keyword"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA84 dfa84 = new DFA84(this);
    static final String DFA2_eotS =
        "\33\uffff";
    static final String DFA2_eofS =
        "\33\uffff";
    static final String DFA2_minS =
        "\1\4\7\uffff\3\42\2\uffff\1\5\15\uffff";
    static final String DFA2_maxS =
        "\1\66\7\uffff\3\77\2\uffff\1\102\15\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff\1\20\1\21\1\uffff\1"+
        "\10\1\11\1\12\1\23\1\13\1\14\1\15\1\25\1\16\1\17\1\24\1\26\1\22";
    static final String DFA2_specialS =
        "\33\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\6\1\1\16\uffff\1\2\4\uffff\1\3\1\uffff\1\5\1\4\4\uffff\1"+
            "\10\13\uffff\1\12\4\uffff\1\11\1\7\1\13\1\14\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16\1\uffff\1\17\5\uffff\1\20\24\uffff\1\21",
            "\1\22\1\uffff\1\23\5\uffff\1\24\24\uffff\1\25",
            "\1\27\1\uffff\1\26\32\uffff\1\30",
            "",
            "",
            "\1\32\33\uffff\1\32\13\uffff\1\32\4\uffff\1\32\6\uffff\3\32"+
            "\6\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "156:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createColumnFamilyStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropColumnFamilyStatement | st13= dropIndexStatement | st14= alterTableStatement | st15= alterKeyspaceStatement | st16= grantStatement | st17= revokeStatement | st18= listPermissionsStatement | st19= createUserStatement | st20= alterUserStatement | st21= dropUserStatement | st22= listUsersStatement );";
        }
    }
    static final String DFA28_eotS =
        "\26\uffff";
    static final String DFA28_eofS =
        "\26\uffff";
    static final String DFA28_minS =
        "\1\6\23\7\2\uffff";
    static final String DFA28_maxS =
        "\1\133\23\u0081\2\uffff";
    static final String DFA28_acceptS =
        "\24\uffff\1\1\1\2";
    static final String DFA28_specialS =
        "\26\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\3\7\uffff\3\3\5\uffff\1\3\1\uffff\1\17\5\uffff\1\10\7\uffff"+
            "\4\3\1\uffff\1\1\2\uffff\1\3\7\uffff\1\3\4\uffff\11\3\1\uffff"+
            "\1\2\7\uffff\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1"+
            "\20\1\21\1\22\1\23\1\3",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "\1\24\167\uffff\1\24\1\uffff\1\25",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "329:1: deleteSelector returns [Selector s] : (c= cident | c= cident '[' t= term ']' );";
        }
    }
    static final String DFA63_eotS =
        "\26\uffff";
    static final String DFA63_eofS =
        "\1\uffff\23\24\2\uffff";
    static final String DFA63_minS =
        "\1\6\23\7\2\uffff";
    static final String DFA63_maxS =
        "\1\133\23\u0083\2\uffff";
    static final String DFA63_acceptS =
        "\24\uffff\1\2\1\1";
    static final String DFA63_specialS =
        "\26\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\3\7\uffff\3\3\5\uffff\1\3\1\uffff\1\17\5\uffff\1\10\7\uffff"+
            "\4\3\1\uffff\1\1\2\uffff\1\3\7\uffff\1\3\4\uffff\11\3\1\uffff"+
            "\1\2\7\uffff\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1"+
            "\20\1\21\1\22\1\23\1\3",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "\3\24\1\uffff\1\24\1\uffff\1\24\11\uffff\1\24\2\uffff\1\24"+
            "\10\uffff\1\24\11\uffff\1\24\1\uffff\3\24\5\uffff\2\24\103\uffff"+
            "\2\24\5\uffff\1\25",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "630:7: ( cfOrKsName[name, true] '.' )?";
        }
    }
    static final String DFA73_eotS =
        "\26\uffff";
    static final String DFA73_eofS =
        "\26\uffff";
    static final String DFA73_minS =
        "\1\6\23\u0081\2\uffff";
    static final String DFA73_maxS =
        "\1\133\23\u0087\2\uffff";
    static final String DFA73_acceptS =
        "\24\uffff\1\2\1\1";
    static final String DFA73_specialS =
        "\26\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\3\7\uffff\3\3\5\uffff\1\3\1\uffff\1\17\5\uffff\1\10\7\uffff"+
            "\4\3\1\uffff\1\1\2\uffff\1\3\7\uffff\1\3\4\uffff\11\3\1\uffff"+
            "\1\2\7\uffff\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1"+
            "\20\1\21\1\22\1\23\1\3",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "\1\24\5\uffff\1\25",
            "",
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "671:1: termPairWithOperation[List<Pair<ColumnIdentifier, Operation>> columns] : (key= cident '=' (set_op= set_operation | c= cident op= operation | ll= list_literal '+' c= cident | mk= QMARK '+' c= cident ) | key= cident '[' t= term ']' '=' vv= term );";
        }
    }
    static final String DFA72_eotS =
        "\13\uffff";
    static final String DFA72_eofS =
        "\13\uffff";
    static final String DFA72_minS =
        "\1\6\1\uffff\1\10\1\14\2\uffff\1\177\1\10\1\14\1\uffff\1\177";
    static final String DFA72_maxS =
        "\1\u0084\1\uffff\1\u0088\1\u0082\2\uffff\1\u0082\1\u0088\1\112\1"+
        "\uffff\1\u0082";
    static final String DFA72_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\4\3\uffff\1\3\1\uffff";
    static final String DFA72_specialS =
        "\13\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\4\5\uffff\1\1\1\uffff\3\4\5\uffff\1\4\1\uffff\1\4\5\uffff"+
            "\1\4\7\uffff\4\4\1\uffff\1\4\2\uffff\1\4\7\uffff\1\4\4\uffff"+
            "\11\4\1\1\1\4\1\2\4\1\2\uffff\17\4\45\uffff\1\3\2\uffff\1\1",
            "",
            "\1\1\166\uffff\1\1\10\uffff\1\5",
            "\1\6\67\uffff\1\6\2\uffff\4\6\67\uffff\1\7",
            "",
            "",
            "\1\10\2\uffff\1\7",
            "\1\1\166\uffff\1\1\10\uffff\1\11",
            "\1\12\67\uffff\1\12\2\uffff\4\12",
            "",
            "\1\10\2\uffff\1\7"
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "673:9: (set_op= set_operation | c= cident op= operation | ll= list_literal '+' c= cident | mk= QMARK '+' c= cident )";
        }
    }
    static final String DFA76_eotS =
        "\16\uffff";
    static final String DFA76_eofS =
        "\16\uffff";
    static final String DFA76_minS =
        "\3\14\3\uffff\1\14\4\uffff\1\177\2\uffff";
    static final String DFA76_maxS =
        "\1\u0089\2\u0084\3\uffff\1\u0085\4\uffff\1\u0086\2\uffff";
    static final String DFA76_acceptS =
        "\3\uffff\1\2\1\1\1\3\1\uffff\1\5\1\4\1\10\1\6\1\uffff\1\7\1\11";
    static final String DFA76_specialS =
        "\16\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\3\173\uffff\1\1\1\2",
            "\1\4\71\uffff\1\5\72\uffff\1\7\2\uffff\1\6",
            "\1\3\71\uffff\1\10\72\uffff\1\12\2\uffff\1\11",
            "",
            "",
            "",
            "\1\13\67\uffff\1\13\2\uffff\4\13\72\uffff\1\14",
            "",
            "",
            "",
            "",
            "\1\14\5\uffff\1\14\1\15",
            "",
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "709:1: operation returns [Operation op] : ( '+' i= INTEGER | (sign= '-' )? i= INTEGER | '+' mk= QMARK | '-' mk= QMARK | '+' ll= list_literal | '-' ll= list_literal | '+' sl= set_literal | '-' sl= set_literal | '+' ml= map_literal );";
        }
    }
    static final String DFA84_eotS =
        "\27\uffff";
    static final String DFA84_eofS =
        "\27\uffff";
    static final String DFA84_minS =
        "\1\6\23\114\3\uffff";
    static final String DFA84_maxS =
        "\1\133\23\u008d\3\uffff";
    static final String DFA84_acceptS =
        "\24\uffff\1\2\1\1\1\3";
    static final String DFA84_specialS =
        "\27\uffff}>";
    static final String[] DFA84_transitionS = {
            "\1\3\7\uffff\3\3\5\uffff\1\3\1\uffff\1\17\5\uffff\1\10\7\uffff"+
            "\4\3\1\uffff\1\1\2\uffff\1\3\7\uffff\1\3\4\uffff\11\3\1\uffff"+
            "\1\2\5\uffff\1\24\1\uffff\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14"+
            "\1\15\1\16\1\20\1\21\1\22\1\23\1\3",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "\1\26\72\uffff\1\25\2\uffff\4\25",
            "",
            "",
            ""
    };

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "752:1: relation[List<Relation> clauses] : (name= cident type= ( '=' | '<' | '<=' | '>=' | '>' ) t= term | K_TOKEN '(' name1= cident ( ',' namen= cident )* ')' type= ( '=' | '<' | '<=' | '>=' | '>' ) tkd= tokenDefinition | name= cident K_IN '(' f1= term ( ',' fN= term )* ')' );";
        }
    }
 

    public static final BitSet FOLLOW_cqlStatement_in_query72 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_query75 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_EOF_in_query79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectStatement_in_cqlStatement113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertStatement_in_cqlStatement138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateStatement_in_cqlStatement163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_batchStatement_in_cqlStatement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteStatement_in_cqlStatement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_useStatement_in_cqlStatement239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_truncateStatement_in_cqlStatement267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createKeyspaceStatement_in_cqlStatement290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createColumnFamilyStatement_in_cqlStatement307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createIndexStatement_in_cqlStatement319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropKeyspaceStatement_in_cqlStatement338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropColumnFamilyStatement_in_cqlStatement356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropIndexStatement_in_cqlStatement370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterTableStatement_in_cqlStatement391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterKeyspaceStatement_in_cqlStatement411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grantStatement_in_cqlStatement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_revokeStatement_in_cqlStatement453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listPermissionsStatement_in_cqlStatement477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createUserStatement_in_cqlStatement492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterUserStatement_in_cqlStatement512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropUserStatement_in_cqlStatement533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listUsersStatement_in_cqlStatement555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USE_in_useStatement589 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_keyspaceName_in_useStatement593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SELECT_in_selectStatement627 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL,0x0000000000000001L});
    public static final BitSet FOLLOW_selectClause_in_selectStatement633 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_K_COUNT_in_selectStatement638 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_selectStatement640 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_selectCountClause_in_selectStatement644 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_selectStatement646 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_K_FROM_in_selectStatement659 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_columnFamilyName_in_selectStatement663 = new BitSet(new long[]{0x0000000000002B02L});
    public static final BitSet FOLLOW_K_WHERE_in_selectStatement673 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE82FL});
    public static final BitSet FOLLOW_whereClause_in_selectStatement677 = new BitSet(new long[]{0x0000000000002A02L});
    public static final BitSet FOLLOW_K_ORDER_in_selectStatement690 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_K_BY_in_selectStatement692 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_orderByClause_in_selectStatement694 = new BitSet(new long[]{0x0000000000002802L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_selectStatement699 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_orderByClause_in_selectStatement701 = new BitSet(new long[]{0x0000000000002802L,0x8000000000000000L});
    public static final BitSet FOLLOW_K_LIMIT_in_selectStatement718 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INTEGER_in_selectStatement722 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_K_ALLOW_in_selectStatement737 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_K_FILTERING_in_selectStatement739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_selectClause776 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_selectClause781 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_selector_in_selectClause785 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_128_in_selectClause797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_selector822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_WRITETIME_in_selector844 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_selector846 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cident_in_selector850 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_selector852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TTL_in_selector862 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_selector864 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cident_in_selector868 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_selector870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_selectCountClause899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_selectCountClause921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relation_in_whereClause957 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_K_AND_in_whereClause961 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE82FL});
    public static final BitSet FOLLOW_relation_in_whereClause963 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_cident_in_orderByClause994 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_K_ASC_in_orderByClause999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DESC_in_orderByClause1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INSERT_in_insertStatement1041 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_K_INTO_in_insertStatement1043 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_columnFamilyName_in_insertStatement1047 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_insertStatement1059 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cident_in_insertStatement1063 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_127_in_insertStatement1070 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cident_in_insertStatement1074 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_126_in_insertStatement1081 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_K_VALUES_in_insertStatement1091 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_insertStatement1103 = new BitSet(new long[]{0x0000000000001000L,0x00000000000007D0L,0x0000000000000012L});
    public static final BitSet FOLLOW_set_operation_in_insertStatement1107 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_127_in_insertStatement1113 = new BitSet(new long[]{0x0000000000001000L,0x00000000000007D0L,0x0000000000000012L});
    public static final BitSet FOLLOW_set_operation_in_insertStatement1117 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_126_in_insertStatement1124 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_usingClause_in_insertStatement1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USING_in_usingClause1166 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_usingClauseObjective_in_usingClause1168 = new BitSet(new long[]{0x0000000001030002L});
    public static final BitSet FOLLOW_K_AND_in_usingClause1173 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_usingClauseObjective_in_usingClause1176 = new BitSet(new long[]{0x0000000001030002L});
    public static final BitSet FOLLOW_K_USING_in_usingClauseDelete1198 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_usingClauseDeleteObjective_in_usingClauseDelete1200 = new BitSet(new long[]{0x0000000001020002L});
    public static final BitSet FOLLOW_K_AND_in_usingClauseDelete1205 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_usingClauseDeleteObjective_in_usingClauseDelete1208 = new BitSet(new long[]{0x0000000001020002L});
    public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseDeleteObjective1230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INTEGER_in_usingClauseDeleteObjective1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingClauseDeleteObjective_in_usingClauseObjective1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TTL_in_usingClauseObjective1263 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INTEGER_in_usingClauseObjective1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_UPDATE_in_updateStatement1301 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_columnFamilyName_in_updateStatement1305 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_usingClause_in_updateStatement1315 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_K_SET_in_updateStatement1327 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_termPairWithOperation_in_updateStatement1329 = new BitSet(new long[]{0x0000000000000100L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_updateStatement1333 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_termPairWithOperation_in_updateStatement1335 = new BitSet(new long[]{0x0000000000000100L,0x8000000000000000L});
    public static final BitSet FOLLOW_K_WHERE_in_updateStatement1346 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE82FL});
    public static final BitSet FOLLOW_whereClause_in_updateStatement1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DELETE_in_deleteStatement1390 = new BitSet(new long[]{0xF8404BC04141C0C0L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_deleteSelection_in_deleteStatement1396 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_K_FROM_in_deleteStatement1409 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_columnFamilyName_in_deleteStatement1413 = new BitSet(new long[]{0x0000000000800100L});
    public static final BitSet FOLLOW_usingClauseDelete_in_deleteStatement1423 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_K_WHERE_in_deleteStatement1435 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE82FL});
    public static final BitSet FOLLOW_whereClause_in_deleteStatement1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteSelector_in_deleteSelection1470 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_deleteSelection1475 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_deleteSelector_in_deleteSelection1479 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_cident_in_deleteSelector1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_deleteSelector1533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_deleteSelector1535 = new BitSet(new long[]{0x0000000000001000L,0x00000000000007D0L});
    public static final BitSet FOLLOW_term_in_deleteSelector1539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_deleteSelector1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BEGIN_in_batchStatement1575 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_K_UNLOGGED_in_batchStatement1585 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_K_COUNTER_in_batchStatement1591 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_K_BATCH_in_batchStatement1604 = new BitSet(new long[]{0x000000000A900000L});
    public static final BitSet FOLLOW_usingClause_in_batchStatement1608 = new BitSet(new long[]{0x000000000A900000L});
    public static final BitSet FOLLOW_batchStatementObjective_in_batchStatement1626 = new BitSet(new long[]{0x000000010A900000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_batchStatement1628 = new BitSet(new long[]{0x000000010A900000L});
    public static final BitSet FOLLOW_batchStatementObjective_in_batchStatement1637 = new BitSet(new long[]{0x000000010A900000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_batchStatement1639 = new BitSet(new long[]{0x000000010A900000L});
    public static final BitSet FOLLOW_K_APPLY_in_batchStatement1653 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_K_BATCH_in_batchStatement1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertStatement_in_batchStatementObjective1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateStatement_in_batchStatementObjective1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteStatement_in_batchStatementObjective1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createKeyspaceStatement1747 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_createKeyspaceStatement1749 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_keyspaceName_in_createKeyspaceStatement1753 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_K_WITH_in_createKeyspaceStatement1761 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_properties_in_createKeyspaceStatement1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createColumnFamilyStatement1789 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_createColumnFamilyStatement1791 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_columnFamilyName_in_createColumnFamilyStatement1795 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_cfamDefinition_in_createColumnFamilyStatement1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_cfamDefinition1824 = new BitSet(new long[]{0xF8404BE04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition1826 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_127_in_cfamDefinition1831 = new BitSet(new long[]{0xF8404BE04141C040L,0xC00000000FFFE02FL});
    public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition1833 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_126_in_cfamDefinition1840 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_K_WITH_in_cfamDefinition1850 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition1852 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_K_AND_in_cfamDefinition1857 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition1859 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_cident_in_cfamColumns1885 = new BitSet(new long[]{0xF8404BC04541C040L,0x000000000FFFE03FL});
    public static final BitSet FOLLOW_comparatorType_in_cfamColumns1889 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns1894 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_K_KEY_in_cfamColumns1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns1908 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_K_KEY_in_cfamColumns1910 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_cfamColumns1912 = new BitSet(new long[]{0xF8404BC04141C040L,0x200000000FFFE02FL});
    public static final BitSet FOLLOW_pkDef_in_cfamColumns1914 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_127_in_cfamColumns1918 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cident_in_cfamColumns1922 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_126_in_cfamColumns1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_pkDef1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_pkDef1959 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cident_in_pkDef1965 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_127_in_pkDef1971 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cident_in_pkDef1975 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_126_in_pkDef1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_cfamProperty2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COMPACT_in_cfamProperty2011 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_K_STORAGE_in_cfamProperty2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CLUSTERING_in_cfamProperty2023 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_K_ORDER_in_cfamProperty2025 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_K_BY_in_cfamProperty2027 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_cfamProperty2029 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty2031 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_127_in_cfamProperty2035 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty2037 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_126_in_cfamProperty2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_cfamOrdering2070 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_K_ASC_in_cfamOrdering2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DESC_in_cfamOrdering2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createIndexStatement2106 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_K_INDEX_in_createIndexStatement2108 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_IDENT_in_createIndexStatement2113 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_K_ON_in_createIndexStatement2117 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_columnFamilyName_in_createIndexStatement2121 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_createIndexStatement2123 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cident_in_createIndexStatement2127 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_createIndexStatement2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterKeyspaceStatement2169 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement2171 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_keyspaceName_in_alterKeyspaceStatement2175 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_K_WITH_in_alterKeyspaceStatement2185 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_properties_in_alterKeyspaceStatement2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement2223 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_alterTableStatement2225 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_columnFamilyName_in_alterTableStatement2229 = new BitSet(new long[]{0x0001A00800000000L});
    public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement2243 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2247 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_K_TYPE_in_alterTableStatement2249 = new BitSet(new long[]{0xF8404BC04541C040L,0x000000000FFFE03FL});
    public static final BitSet FOLLOW_comparatorType_in_alterTableStatement2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ADD_in_alterTableStatement2269 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2275 = new BitSet(new long[]{0xF8404BC04541C040L,0x000000000FFFE03FL});
    public static final BitSet FOLLOW_comparatorType_in_alterTableStatement2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_WITH_in_alterTableStatement2313 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_properties_in_alterTableStatement2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_RENAME_in_alterTableStatement2349 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2403 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_K_TO_in_alterTableStatement2405 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2409 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_K_AND_in_alterTableStatement2430 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2434 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_K_TO_in_alterTableStatement2436 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2440 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_K_DROP_in_dropKeyspaceStatement2486 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement2488 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_keyspaceName_in_dropKeyspaceStatement2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropColumnFamilyStatement2517 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dropColumnFamilyStatement2519 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_columnFamilyName_in_dropColumnFamilyStatement2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropIndexStatement2554 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_K_INDEX_in_dropIndexStatement2556 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_dropIndexStatement2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TRUNCATE_in_truncateStatement2591 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_columnFamilyName_in_truncateStatement2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_GRANT_in_grantStatement2620 = new BitSet(new long[]{0x0E04200200000020L});
    public static final BitSet FOLLOW_permissionOrAll_in_grantStatement2632 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_K_ON_in_grantStatement2640 = new BitSet(new long[]{0xF8404BD44141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_resource_in_grantStatement2652 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_K_TO_in_grantStatement2660 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_username_in_grantStatement2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_REVOKE_in_revokeStatement2703 = new BitSet(new long[]{0x0E04200200000020L});
    public static final BitSet FOLLOW_permissionOrAll_in_revokeStatement2715 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_K_ON_in_revokeStatement2723 = new BitSet(new long[]{0xF8404BD44141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_resource_in_revokeStatement2735 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_K_FROM_in_revokeStatement2743 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_username_in_revokeStatement2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_LIST_in_listPermissionsStatement2793 = new BitSet(new long[]{0x0E04200200000020L});
    public static final BitSet FOLLOW_permissionOrAll_in_listPermissionsStatement2805 = new BitSet(new long[]{0x0180100000000002L});
    public static final BitSet FOLLOW_K_ON_in_listPermissionsStatement2815 = new BitSet(new long[]{0xF8404BD44141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_resource_in_listPermissionsStatement2817 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_K_OF_in_listPermissionsStatement2832 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_username_in_listPermissionsStatement2834 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_K_NORECURSIVE_in_listPermissionsStatement2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_permission2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALL_in_permissionOrAll2934 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_K_PERMISSIONS_in_permissionOrAll2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_permission_in_permissionOrAll2959 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_K_PERMISSION_in_permissionOrAll2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataResource_in_resource2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALL_in_dataResource3014 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_K_KEYSPACES_in_dataResource3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_dataResource3026 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_keyspaceName_in_dataResource3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dataResource3044 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_columnFamilyName_in_dataResource3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createUserStatement3093 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_K_USER_in_createUserStatement3095 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_username_in_createUserStatement3097 = new BitSet(new long[]{0x0000000800000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_K_WITH_in_createUserStatement3107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_userOptions_in_createUserStatement3109 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_K_SUPERUSER_in_createUserStatement3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_NOSUPERUSER_in_createUserStatement3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterUserStatement3174 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_K_USER_in_alterUserStatement3176 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_username_in_alterUserStatement3178 = new BitSet(new long[]{0x0000000800000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_K_WITH_in_alterUserStatement3188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_userOptions_in_alterUserStatement3190 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_K_SUPERUSER_in_alterUserStatement3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_NOSUPERUSER_in_alterUserStatement3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropUserStatement3246 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_K_USER_in_dropUserStatement3248 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_username_in_dropUserStatement3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_LIST_in_listUsersStatement3275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_K_USERS_in_listUsersStatement3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_userOption_in_userOptions3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PASSWORD_in_userOption3318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_userOption3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_cident3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_cident3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_cident3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfOrKsName_in_keyspaceName3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfOrKsName_in_columnFamilyName3462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_columnFamilyName3465 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cfOrKsName_in_columnFamilyName3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_cfOrKsName3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_cfOrKsName3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_cfOrKsName3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finalTerm_in_set_operation3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_set_operation3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_literal_in_set_operation3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_literal_in_set_operation3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_literal_in_set_operation3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_list_literal3641 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000790L,0x0000000000000004L});
    public static final BitSet FOLLOW_finalTerm_in_list_literal3649 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_127_in_list_literal3655 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000790L});
    public static final BitSet FOLLOW_finalTerm_in_list_literal3659 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_list_literal3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_set_literal3692 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000790L,0x0000000000000020L});
    public static final BitSet FOLLOW_finalTerm_in_set_literal3700 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_127_in_set_literal3706 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000790L});
    public static final BitSet FOLLOW_finalTerm_in_set_literal3710 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_set_literal3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_map_literal3749 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000790L});
    public static final BitSet FOLLOW_finalTerm_in_map_literal3765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_map_literal3767 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000790L});
    public static final BitSet FOLLOW_finalTerm_in_map_literal3771 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_127_in_map_literal3777 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000790L});
    public static final BitSet FOLLOW_finalTerm_in_map_literal3781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_map_literal3783 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000790L});
    public static final BitSet FOLLOW_finalTerm_in_map_literal3787 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_map_literal3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_finalTerm3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finalTerm_in_term3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_term3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_termPairWithOperation3913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_termPairWithOperation3915 = new BitSet(new long[]{0xF8404BC04141D040L,0x000000000FFFE7FFL,0x0000000000000012L});
    public static final BitSet FOLLOW_set_operation_in_termPairWithOperation3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_termPairWithOperation3945 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_operation_in_termPairWithOperation3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_literal_in_termPairWithOperation3975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_termPairWithOperation3977 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cident_in_termPairWithOperation3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_termPairWithOperation4007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_termPairWithOperation4009 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cident_in_termPairWithOperation4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_termPairWithOperation4045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_termPairWithOperation4047 = new BitSet(new long[]{0x0000000000001000L,0x00000000000007D0L});
    public static final BitSet FOLLOW_term_in_termPairWithOperation4051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_termPairWithOperation4053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_termPairWithOperation4055 = new BitSet(new long[]{0x0000000000001000L,0x00000000000007D0L});
    public static final BitSet FOLLOW_term_in_termPairWithOperation4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_intTerm4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_intTerm4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_operation4128 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INTEGER_in_operation4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_operation4144 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INTEGER_in_operation4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_operation4165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_QMARK_in_operation4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_operation4179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_QMARK_in_operation4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_operation4194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_list_literal_in_operation4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_operation4208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_list_literal_in_operation4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_operation4223 = new BitSet(new long[]{0x0000000000001000L,0x00000000000007D0L,0x0000000000000012L});
    public static final BitSet FOLLOW_set_literal_in_operation4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_operation4237 = new BitSet(new long[]{0x0000000000001000L,0x00000000000007D0L,0x0000000000000012L});
    public static final BitSet FOLLOW_set_literal_in_operation4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_operation4252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_map_literal_in_operation4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_properties4276 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_K_AND_in_properties4280 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_property_in_properties4282 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_cident_in_property4305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_property4307 = new BitSet(new long[]{0xF8404BC04141D040L,0x000000000FFFE73FL,0x0000000000000010L});
    public static final BitSet FOLLOW_propertyValue_in_property4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_literal_in_property4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propertyValue4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_propertyValue4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TOKEN_in_tokenDefinition4451 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_tokenDefinition4464 = new BitSet(new long[]{0x0000000000001000L,0x00000000000007D0L});
    public static final BitSet FOLLOW_term_in_tokenDefinition4468 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_127_in_tokenDefinition4474 = new BitSet(new long[]{0x0000000000001000L,0x00000000000007D0L});
    public static final BitSet FOLLOW_term_in_tokenDefinition4478 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_126_in_tokenDefinition4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_tokenDefinition4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_relation4520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003C80L});
    public static final BitSet FOLLOW_set_in_relation4524 = new BitSet(new long[]{0x0000000000001000L,0x00000000000007D0L});
    public static final BitSet FOLLOW_term_in_relation4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TOKEN_in_relation4556 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_relation4567 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cident_in_relation4571 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_127_in_relation4577 = new BitSet(new long[]{0xF8404BC04141C040L,0x000000000FFFE02FL});
    public static final BitSet FOLLOW_cident_in_relation4581 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_126_in_relation4587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003C80L});
    public static final BitSet FOLLOW_set_in_relation4602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000810L});
    public static final BitSet FOLLOW_tokenDefinition_in_relation4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_relation4642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_K_IN_in_relation4644 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_relation4655 = new BitSet(new long[]{0x0000000000001000L,0x00000000000007D0L});
    public static final BitSet FOLLOW_term_in_relation4659 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_127_in_relation4664 = new BitSet(new long[]{0x0000000000001000L,0x00000000000007D0L});
    public static final BitSet FOLLOW_term_in_relation4668 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_126_in_relation4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_native_type_in_comparatorType4700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_type_in_comparatorType4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_comparatorType4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ASCII_in_native_type4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BIGINT_in_native_type4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BLOB_in_native_type4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BOOLEAN_in_native_type4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COUNTER_in_native_type4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DECIMAL_in_native_type4823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DOUBLE_in_native_type4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_FLOAT_in_native_type4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INET_in_native_type4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INT_in_native_type4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TEXT_in_native_type4893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TIMESTAMP_in_native_type4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_UUID_in_native_type4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_VARCHAR_in_native_type4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_VARINT_in_native_type4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TIMEUUID_in_native_type4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_MAP_in_collection_type4982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_collection_type4985 = new BitSet(new long[]{0xF8404BC04541C040L,0x000000000FFFE03FL});
    public static final BitSet FOLLOW_comparatorType_in_collection_type4989 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_collection_type4991 = new BitSet(new long[]{0xF8404BC04541C040L,0x000000000FFFE03FL});
    public static final BitSet FOLLOW_comparatorType_in_collection_type4995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_collection_type4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_LIST_in_collection_type5015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_collection_type5017 = new BitSet(new long[]{0xF8404BC04541C040L,0x000000000FFFE03FL});
    public static final BitSet FOLLOW_comparatorType_in_collection_type5021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_collection_type5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SET_in_collection_type5041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_collection_type5044 = new BitSet(new long[]{0xF8404BC04541C040L,0x000000000FFFE03FL});
    public static final BitSet FOLLOW_comparatorType_in_collection_type5048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_collection_type5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_username0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unreserved_keyword5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_native_type_in_unreserved_keyword5372 = new BitSet(new long[]{0x0000000000000002L});

}