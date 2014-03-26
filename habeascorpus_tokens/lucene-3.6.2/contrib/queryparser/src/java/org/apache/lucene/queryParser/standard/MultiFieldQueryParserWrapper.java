package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
standard	TokenNameIdentifier	 standard
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
Analyzer	TokenNameIdentifier	 Analyzer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
BooleanClause	TokenNameIdentifier	 Boolean Clause
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
BooleanQuery	TokenNameIdentifier	 Boolean Query
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Query	TokenNameIdentifier	 Query
;	TokenNameSEMICOLON	
/** * This class behaves as the as the lucene 2.4 MultiFieldQueryParser class, but uses the new * query parser interface instead of the old one. <br/> * <br/> * This class should be used when the new query parser features are needed and * also keep at the same time the old query parser interface. <br/> * * @deprecated this class will be removed soon, it's a temporary class to be * used along the transition from the old query parser to the new * one */	TokenNameCOMMENT_JAVADOC	 This class behaves as the as the lucene 2.4 MultiFieldQueryParser class, but uses the new query parser interface instead of the old one. <br/> <br/> This class should be used when the new query parser features are needed and also keep at the same time the old query parser interface. <br/> * @deprecated this class will be removed soon, it's a temporary class to be used along the transition from the old query parser to the new one 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
MultiFieldQueryParserWrapper	TokenNameIdentifier	 Multi Field Query Parser Wrapper
extends	TokenNameextends	
QueryParserWrapper	TokenNameIdentifier	 Query Parser Wrapper
{	TokenNameLBRACE	
/** * Creates a MultiFieldQueryParser. Allows passing of a map with term to * Boost, and the boost to apply to each term. * * <p> * It will, when parse(String query) is called, construct a query like this * (assuming the query consists of two terms and you specify the two fields * <code>title</code> and <code>body</code>): * </p> * * <code> * (title:term1 body:term1) (title:term2 body:term2) * </code> * * <p> * When setDefaultOperator(AND_OPERATOR) is set, the result will be: * </p> * * <code> * +(title:term1 body:term1) +(title:term2 body:term2) * </code> * * <p> * When you pass a boost (title=>5 body=>10) you can get * </p> * * <code> * +(title:term1^5.0 body:term1^10.0) +(title:term2^5.0 body:term2^10.0) * </code> * * <p> * In other words, all the query's terms must appear, but it doesn't matter in * what fields they appear. * </p> */	TokenNameCOMMENT_JAVADOC	 Creates a MultiFieldQueryParser. Allows passing of a map with term to Boost, and the boost to apply to each term. * <p> It will, when parse(String query) is called, construct a query like this (assuming the query consists of two terms and you specify the two fields <code>title</code> and <code>body</code>): </p> * <code> (title:term1 body:term1) (title:term2 body:term2) </code> * <p> When setDefaultOperator(AND_OPERATOR) is set, the result will be: </p> * <code> +(title:term1 body:term1) +(title:term2 body:term2) </code> * <p> When you pass a boost (title=>5 body=>10) you can get </p> * <code> +(title:term1^5.0 body:term1^10.0) +(title:term2^5.0 body:term2^10.0) </code> * <p> In other words, all the query's terms must appear, but it doesn't matter in what fields they appear. </p> 
public	TokenNamepublic	
MultiFieldQueryParserWrapper	TokenNameIdentifier	 Multi Field Query Parser Wrapper
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
boosts	TokenNameIdentifier	 boosts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StandardQueryParser	TokenNameIdentifier	 Standard Query Parser
qpHelper	TokenNameIdentifier	 qp Helper
=	TokenNameEQUAL	
getQueryParserHelper	TokenNameIdentifier	 get Query Parser Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qpHelper	TokenNameIdentifier	 qp Helper
.	TokenNameDOT	
setMultiFields	TokenNameIdentifier	 set Multi Fields
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qpHelper	TokenNameIdentifier	 qp Helper
.	TokenNameDOT	
setFieldsBoost	TokenNameIdentifier	 set Fields Boost
(	TokenNameLPAREN	
boosts	TokenNameIdentifier	 boosts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a MultiFieldQueryParser. * * <p> * It will, when parse(String query) is called, construct a query like this * (assuming the query consists of two terms and you specify the two fields * <code>title</code> and <code>body</code>): * </p> * * <code> * (title:term1 body:term1) (title:term2 body:term2) * </code> * * <p> * When setDefaultOperator(AND_OPERATOR) is set, the result will be: * </p> * * <code> * +(title:term1 body:term1) +(title:term2 body:term2) * </code> * * <p> * In other words, all the query's terms must appear, but it doesn't matter in * what fields they appear. * </p> */	TokenNameCOMMENT_JAVADOC	 Creates a MultiFieldQueryParser. * <p> It will, when parse(String query) is called, construct a query like this (assuming the query consists of two terms and you specify the two fields <code>title</code> and <code>body</code>): </p> * <code> (title:term1 body:term1) (title:term2 body:term2) </code> * <p> When setDefaultOperator(AND_OPERATOR) is set, the result will be: </p> * <code> +(title:term1 body:term1) +(title:term2 body:term2) </code> * <p> In other words, all the query's terms must appear, but it doesn't matter in what fields they appear. </p> 
public	TokenNamepublic	
MultiFieldQueryParserWrapper	TokenNameIdentifier	 Multi Field Query Parser Wrapper
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StandardQueryParser	TokenNameIdentifier	 Standard Query Parser
qpHelper	TokenNameIdentifier	 qp Helper
=	TokenNameEQUAL	
getQueryParserHelper	TokenNameIdentifier	 get Query Parser Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qpHelper	TokenNameIdentifier	 qp Helper
.	TokenNameDOT	
setAnalyzer	TokenNameIdentifier	 set Analyzer
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qpHelper	TokenNameIdentifier	 qp Helper
.	TokenNameDOT	
setMultiFields	TokenNameIdentifier	 set Multi Fields
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a query which searches on the fields specified. * <p> * If x fields are specified, this effectively constructs: * * <pre> * &lt;code&gt; * (field1:query1) (field2:query2) (field3:query3)...(fieldx:queryx) * &lt;/code&gt; * </pre> * * @param queries * Queries strings to parse * @param fields * Fields to search on * @param analyzer * Analyzer to use * @throws ParseException * if query parsing fails * @throws IllegalArgumentException * if the length of the queries array differs from the length of the * fields array */	TokenNameCOMMENT_JAVADOC	 Parses a query which searches on the fields specified. <p> If x fields are specified, this effectively constructs: * <pre> &lt;code&gt; (field1:query1) (field2:query2) (field3:query3)...(fieldx:queryx) &lt;/code&gt; </pre> * @param queries Queries strings to parse @param fields Fields to search on @param analyzer Analyzer to use @throws ParseException if query parsing fails @throws IllegalArgumentException if the length of the queries array differs from the length of the fields array 
public	TokenNamepublic	
static	TokenNamestatic	
Query	TokenNameIdentifier	 Query
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
queries	TokenNameIdentifier	 queries
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"queries.length != fields.length"	TokenNameStringLiteral	queries.length != fields.length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bQuery	TokenNameIdentifier	 b Query
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QueryParserWrapper	TokenNameIdentifier	 Query Parser Wrapper
qp	TokenNameIdentifier	 qp
=	TokenNameEQUAL	
new	TokenNamenew	
QueryParserWrapper	TokenNameIdentifier	 Query Parser Wrapper
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
queries	TokenNameIdentifier	 queries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
// q never null, just being defensive 	TokenNameCOMMENT_LINE	q never null, just being defensive 
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
instanceof	TokenNameinstanceof	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
.	TokenNameDOT	
getClauses	TokenNameIdentifier	 get Clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bQuery	TokenNameIdentifier	 b Query
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
bQuery	TokenNameIdentifier	 b Query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a query, searching on the fields specified. Use this if you need to * specify certain fields as required, and others as prohibited. * <p> * * <pre> * Usage: * &lt;code&gt; * String[] fields = {&quot;filename&quot;, &quot;contents&quot;, &quot;description&quot;}; * BooleanClause.Occur[] flags = {BooleanClause.Occur.SHOULD, * BooleanClause.Occur.MUST, * BooleanClause.Occur.MUST_NOT}; * MultiFieldQueryParser.parse(&quot;query&quot;, fields, flags, analyzer); * &lt;/code&gt; * </pre> *<p> * The code above would construct a query: * * <pre> * &lt;code&gt; * (filename:query) +(contents:query) -(description:query) * &lt;/code&gt; * </pre> * * @param query * Query string to parse * @param fields * Fields to search on * @param flags * Flags describing the fields * @param analyzer * Analyzer to use * @throws ParseException * if query parsing fails * @throws IllegalArgumentException * if the length of the fields array differs from the length of the * flags array */	TokenNameCOMMENT_JAVADOC	 Parses a query, searching on the fields specified. Use this if you need to specify certain fields as required, and others as prohibited. <p> * <pre> Usage: &lt;code&gt; String[] fields = {&quot;filename&quot;, &quot;contents&quot;, &quot;description&quot;}; BooleanClause.Occur[] flags = {BooleanClause.Occur.SHOULD, BooleanClause.Occur.MUST, BooleanClause.Occur.MUST_NOT}; MultiFieldQueryParser.parse(&quot;query&quot;, fields, flags, analyzer); &lt;/code&gt; </pre> *<p> The code above would construct a query: * <pre> &lt;code&gt; (filename:query) +(contents:query) -(description:query) &lt;/code&gt; </pre> * @param query Query string to parse @param fields Fields to search on @param flags Flags describing the fields @param analyzer Analyzer to use @throws ParseException if query parsing fails @throws IllegalArgumentException if the length of the fields array differs from the length of the flags array 
public	TokenNamepublic	
static	TokenNamestatic	
Query	TokenNameIdentifier	 Query
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
flags	TokenNameIdentifier	 flags
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
flags	TokenNameIdentifier	 flags
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"fields.length != flags.length"	TokenNameStringLiteral	fields.length != flags.length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bQuery	TokenNameIdentifier	 b Query
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QueryParserWrapper	TokenNameIdentifier	 Query Parser Wrapper
qp	TokenNameIdentifier	 qp
=	TokenNameEQUAL	
new	TokenNamenew	
QueryParserWrapper	TokenNameIdentifier	 Query Parser Wrapper
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
// q never null, just being defensive 	TokenNameCOMMENT_LINE	q never null, just being defensive 
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
instanceof	TokenNameinstanceof	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
.	TokenNameDOT	
getClauses	TokenNameIdentifier	 get Clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bQuery	TokenNameIdentifier	 b Query
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
flags	TokenNameIdentifier	 flags
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
bQuery	TokenNameIdentifier	 b Query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a query, searching on the fields specified. Use this if you need to * specify certain fields as required, and others as prohibited. * <p> * * <pre> * Usage: * &lt;code&gt; * String[] query = {&quot;query1&quot;, &quot;query2&quot;, &quot;query3&quot;}; * String[] fields = {&quot;filename&quot;, &quot;contents&quot;, &quot;description&quot;}; * BooleanClause.Occur[] flags = {BooleanClause.Occur.SHOULD, * BooleanClause.Occur.MUST, * BooleanClause.Occur.MUST_NOT}; * MultiFieldQueryParser.parse(query, fields, flags, analyzer); * &lt;/code&gt; * </pre> *<p> * The code above would construct a query: * * <pre> * &lt;code&gt; * (filename:query1) +(contents:query2) -(description:query3) * &lt;/code&gt; * </pre> * * @param queries * Queries string to parse * @param fields * Fields to search on * @param flags * Flags describing the fields * @param analyzer * Analyzer to use * @throws ParseException * if query parsing fails * @throws IllegalArgumentException * if the length of the queries, fields, and flags array differ */	TokenNameCOMMENT_JAVADOC	 Parses a query, searching on the fields specified. Use this if you need to specify certain fields as required, and others as prohibited. <p> * <pre> Usage: &lt;code&gt; String[] query = {&quot;query1&quot;, &quot;query2&quot;, &quot;query3&quot;}; String[] fields = {&quot;filename&quot;, &quot;contents&quot;, &quot;description&quot;}; BooleanClause.Occur[] flags = {BooleanClause.Occur.SHOULD, BooleanClause.Occur.MUST, BooleanClause.Occur.MUST_NOT}; MultiFieldQueryParser.parse(query, fields, flags, analyzer); &lt;/code&gt; </pre> *<p> The code above would construct a query: * <pre> &lt;code&gt; (filename:query1) +(contents:query2) -(description:query3) &lt;/code&gt; </pre> * @param queries Queries string to parse @param fields Fields to search on @param flags Flags describing the fields @param analyzer Analyzer to use @throws ParseException if query parsing fails @throws IllegalArgumentException if the length of the queries, fields, and flags array differ 
public	TokenNamepublic	
static	TokenNamestatic	
Query	TokenNameIdentifier	 Query
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
queries	TokenNameIdentifier	 queries
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
flags	TokenNameIdentifier	 flags
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
flags	TokenNameIdentifier	 flags
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"queries, fields, and flags array have have different length"	TokenNameStringLiteral	queries, fields, and flags array have have different length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bQuery	TokenNameIdentifier	 b Query
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QueryParserWrapper	TokenNameIdentifier	 Query Parser Wrapper
qp	TokenNameIdentifier	 qp
=	TokenNameEQUAL	
new	TokenNamenew	
QueryParserWrapper	TokenNameIdentifier	 Query Parser Wrapper
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
queries	TokenNameIdentifier	 queries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
// q never null, just being defensive 	TokenNameCOMMENT_LINE	q never null, just being defensive 
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
instanceof	TokenNameinstanceof	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
.	TokenNameDOT	
getClauses	TokenNameIdentifier	 get Clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bQuery	TokenNameIdentifier	 b Query
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
flags	TokenNameIdentifier	 flags
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
bQuery	TokenNameIdentifier	 b Query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
