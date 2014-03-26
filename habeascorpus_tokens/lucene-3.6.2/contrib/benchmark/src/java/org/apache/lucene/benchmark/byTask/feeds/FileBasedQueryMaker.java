package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
feeds	TokenNameIdentifier	 feeds
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
QueryParser	TokenNameIdentifier	 Query Parser
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
Query	TokenNameIdentifier	 Query
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
NewAnalyzerTask	TokenNameIdentifier	 New Analyzer Task
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * Copyright 2004 The Apache Software Foundation * <p/> * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * <p/> * http://www.apache.org/licenses/LICENSE-2.0 * <p/> * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2004 The Apache Software Foundation <p/> Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at <p/> http://www.apache.org/licenses/LICENSE-2.0 <p/> Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Create queries from a FileReader. One per line, pass them through the * QueryParser. Lines beginning with # are treated as comments * * File can be specified as a absolute, relative or resource. * Two properties can be set: * file.query.maker.file=&lt;Full path to file containing queries&gt; * <br/> * file.query.maker.default.field=&lt;Name of default field - Default value is "body"&gt; * * Example: * file.query.maker.file=c:/myqueries.txt * file.query.maker.default.field=body */	TokenNameCOMMENT_JAVADOC	 Create queries from a FileReader. One per line, pass them through the QueryParser. Lines beginning with # are treated as comments * File can be specified as a absolute, relative or resource. Two properties can be set: file.query.maker.file=&lt;Full path to file containing queries&gt; <br/> file.query.maker.default.field=&lt;Name of default field - Default value is "body"&gt; * Example: file.query.maker.file=c:/myqueries.txt file.query.maker.default.field=body 
public	TokenNamepublic	
class	TokenNameclass	
FileBasedQueryMaker	TokenNameIdentifier	 File Based Query Maker
extends	TokenNameextends	
AbstractQueryMaker	TokenNameIdentifier	 Abstract Query Maker
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
Query	TokenNameIdentifier	 Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prepareQueries	TokenNameIdentifier	 prepare Queries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
anlzr	TokenNameIdentifier	 anlzr
=	TokenNameEQUAL	
NewAnalyzerTask	TokenNameIdentifier	 New Analyzer Task
.	TokenNameDOT	
createAnalyzer	TokenNameIdentifier	 create Analyzer
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"analyzer"	TokenNameStringLiteral	analyzer
,	TokenNameCOMMA	
"org.apache.lucene.analysis.standard.StandardAnalyzer"	TokenNameStringLiteral	org.apache.lucene.analysis.standard.StandardAnalyzer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
defaultField	TokenNameIdentifier	 default Field
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"file.query.maker.default.field"	TokenNameStringLiteral	file.query.maker.default.field
,	TokenNameCOMMA	
DocMaker	TokenNameIdentifier	 Doc Maker
.	TokenNameDOT	
BODY_FIELD	TokenNameIdentifier	 BODY  FIELD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryParser	TokenNameIdentifier	 Query Parser
qp	TokenNameIdentifier	 qp
=	TokenNameEQUAL	
new	TokenNamenew	
QueryParser	TokenNameIdentifier	 Query Parser
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
defaultField	TokenNameIdentifier	 default Field
,	TokenNameCOMMA	
anlzr	TokenNameIdentifier	 anlzr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
setAllowLeadingWildcard	TokenNameIdentifier	 set Allow Leading Wildcard
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
qq	TokenNameIdentifier	 qq
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"file.query.maker.file"	TokenNameStringLiteral	file.query.maker.file
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//see if we can find it as a resource 	TokenNameCOMMENT_LINE	see if we can find it as a resource 
InputStream	TokenNameIdentifier	 Input Stream
asStream	TokenNameIdentifier	 as Stream
=	TokenNameEQUAL	
FileBasedQueryMaker	TokenNameIdentifier	 File Based Query Maker
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
asStream	TokenNameIdentifier	 as Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
asStream	TokenNameIdentifier	 as Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
buffered	TokenNameIdentifier	 buffered
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
lineNum	TokenNameIdentifier	 line Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
buffered	TokenNameIdentifier	 buffered
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"#"	TokenNameStringLiteral	#
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Exception: "	TokenNameStringLiteral	Exception: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" occurred while parsing line: "	TokenNameStringLiteral	 occurred while parsing line: 
+	TokenNamePLUS	
lineNum	TokenNameIdentifier	 line Num
+	TokenNamePLUS	
" Text: "	TokenNameStringLiteral	 Text: 
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
lineNum	TokenNameIdentifier	 line Num
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"No Reader available for: "	TokenNameStringLiteral	No Reader available for: 
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Query	TokenNameIdentifier	 Query
[	TokenNameLBRACKET	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
