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
core	TokenNameIdentifier	 core
.	TokenNameDOT	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
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
/** * This class defines utility methods to (help) parse query strings into * {@link Query} objects. */	TokenNameCOMMENT_JAVADOC	 This class defines utility methods to (help) parse query strings into {@link Query} objects. 
final	TokenNamefinal	
public	TokenNamepublic	
class	TokenNameclass	
QueryParserUtil	TokenNameIdentifier	 Query Parser Util
{	TokenNameLBRACE	
/** * Parses a query which searches on the fields specified. * <p> * If x fields are specified, this effectively constructs: * * <pre> * &lt;code&gt; * (field1:query1) (field2:query2) (field3:query3)...(fieldx:queryx) * &lt;/code&gt; * </pre> * * @param queries * Queries strings to parse * @param fields * Fields to search on * @param analyzer * Analyzer to use * @throws IllegalArgumentException * if the length of the queries array differs from the length of the * fields array */	TokenNameCOMMENT_JAVADOC	 Parses a query which searches on the fields specified. <p> If x fields are specified, this effectively constructs: * <pre> &lt;code&gt; (field1:query1) (field2:query2) (field3:query3)...(fieldx:queryx) &lt;/code&gt; </pre> * @param queries Queries strings to parse @param fields Fields to search on @param analyzer Analyzer to use @throws IllegalArgumentException if the length of the queries array differs from the length of the fields array 
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
QueryNodeException	TokenNameIdentifier	 Query Node Exception
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
StandardQueryParser	TokenNameIdentifier	 Standard Query Parser
qp	TokenNameIdentifier	 qp
=	TokenNameEQUAL	
new	TokenNamenew	
StandardQueryParser	TokenNameIdentifier	 Standard Query Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
setAnalyzer	TokenNameIdentifier	 set Analyzer
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
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
,	TokenNameCOMMA	
fields	TokenNameIdentifier	 fields
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
/** * Parses a query, searching on the fields specified. Use this if you need to * specify certain fields as required, and others as prohibited. * <p> * * <pre> * Usage: * &lt;code&gt; * String[] fields = {&quot;filename&quot;, &quot;contents&quot;, &quot;description&quot;}; * BooleanClause.Occur[] flags = {BooleanClause.Occur.SHOULD, * BooleanClause.Occur.MUST, * BooleanClause.Occur.MUST_NOT}; * MultiFieldQueryParser.parse(&quot;query&quot;, fields, flags, analyzer); * &lt;/code&gt; * </pre> *<p> * The code above would construct a query: * * <pre> * &lt;code&gt; * (filename:query) +(contents:query) -(description:query) * &lt;/code&gt; * </pre> * * @param query * Query string to parse * @param fields * Fields to search on * @param flags * Flags describing the fields * @param analyzer * Analyzer to use * @throws IllegalArgumentException * if the length of the fields array differs from the length of the * flags array */	TokenNameCOMMENT_JAVADOC	 Parses a query, searching on the fields specified. Use this if you need to specify certain fields as required, and others as prohibited. <p> * <pre> Usage: &lt;code&gt; String[] fields = {&quot;filename&quot;, &quot;contents&quot;, &quot;description&quot;}; BooleanClause.Occur[] flags = {BooleanClause.Occur.SHOULD, BooleanClause.Occur.MUST, BooleanClause.Occur.MUST_NOT}; MultiFieldQueryParser.parse(&quot;query&quot;, fields, flags, analyzer); &lt;/code&gt; </pre> *<p> The code above would construct a query: * <pre> &lt;code&gt; (filename:query) +(contents:query) -(description:query) &lt;/code&gt; </pre> * @param query Query string to parse @param fields Fields to search on @param flags Flags describing the fields @param analyzer Analyzer to use @throws IllegalArgumentException if the length of the fields array differs from the length of the flags array 
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
QueryNodeException	TokenNameIdentifier	 Query Node Exception
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
StandardQueryParser	TokenNameIdentifier	 Standard Query Parser
qp	TokenNameIdentifier	 qp
=	TokenNameEQUAL	
new	TokenNamenew	
StandardQueryParser	TokenNameIdentifier	 Standard Query Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
setAnalyzer	TokenNameIdentifier	 set Analyzer
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
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
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
fields	TokenNameIdentifier	 fields
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
/** * Parses a query, searching on the fields specified. Use this if you need to * specify certain fields as required, and others as prohibited. * <p> * * <pre> * Usage: * &lt;code&gt; * String[] query = {&quot;query1&quot;, &quot;query2&quot;, &quot;query3&quot;}; * String[] fields = {&quot;filename&quot;, &quot;contents&quot;, &quot;description&quot;}; * BooleanClause.Occur[] flags = {BooleanClause.Occur.SHOULD, * BooleanClause.Occur.MUST, * BooleanClause.Occur.MUST_NOT}; * MultiFieldQueryParser.parse(query, fields, flags, analyzer); * &lt;/code&gt; * </pre> *<p> * The code above would construct a query: * * <pre> * &lt;code&gt; * (filename:query1) +(contents:query2) -(description:query3) * &lt;/code&gt; * </pre> * * @param queries * Queries string to parse * @param fields * Fields to search on * @param flags * Flags describing the fields * @param analyzer * Analyzer to use * @throws IllegalArgumentException * if the length of the queries, fields, and flags array differ */	TokenNameCOMMENT_JAVADOC	 Parses a query, searching on the fields specified. Use this if you need to specify certain fields as required, and others as prohibited. <p> * <pre> Usage: &lt;code&gt; String[] query = {&quot;query1&quot;, &quot;query2&quot;, &quot;query3&quot;}; String[] fields = {&quot;filename&quot;, &quot;contents&quot;, &quot;description&quot;}; BooleanClause.Occur[] flags = {BooleanClause.Occur.SHOULD, BooleanClause.Occur.MUST, BooleanClause.Occur.MUST_NOT}; MultiFieldQueryParser.parse(query, fields, flags, analyzer); &lt;/code&gt; </pre> *<p> The code above would construct a query: * <pre> &lt;code&gt; (filename:query1) +(contents:query2) -(description:query3) &lt;/code&gt; </pre> * @param queries Queries string to parse @param fields Fields to search on @param flags Flags describing the fields @param analyzer Analyzer to use @throws IllegalArgumentException if the length of the queries, fields, and flags array differ 
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
QueryNodeException	TokenNameIdentifier	 Query Node Exception
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
StandardQueryParser	TokenNameIdentifier	 Standard Query Parser
qp	TokenNameIdentifier	 qp
=	TokenNameEQUAL	
new	TokenNamenew	
StandardQueryParser	TokenNameIdentifier	 Standard Query Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
setAnalyzer	TokenNameIdentifier	 set Analyzer
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
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
,	TokenNameCOMMA	
fields	TokenNameIdentifier	 fields
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
/** * Returns a String where those characters that TextParser expects to be * escaped are escaped by a preceding <code>\</code>. */	TokenNameCOMMENT_JAVADOC	 Returns a String where those characters that TextParser expects to be escaped are escaped by a preceding <code>\</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
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
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// These characters are part of the query syntax and must be escaped 	TokenNameCOMMENT_LINE	These characters are part of the query syntax and must be escaped 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'+'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'!'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'('	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
')'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'^'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'['	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\"'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'{'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'}'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'~'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'*'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'?'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'|'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
