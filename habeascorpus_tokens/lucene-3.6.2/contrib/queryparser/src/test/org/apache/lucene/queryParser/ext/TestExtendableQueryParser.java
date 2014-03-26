package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
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
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
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
QueryParserTestBase	TokenNameIdentifier	 Query Parser Test Base
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
TermQuery	TokenNameIdentifier	 Term Query
;	TokenNameSEMICOLON	
/** * Testcase for the class {@link ExtendableQueryParser} */	TokenNameCOMMENT_JAVADOC	 Testcase for the class {@link ExtendableQueryParser} 
public	TokenNamepublic	
class	TokenNameclass	
TestExtendableQueryParser	TokenNameIdentifier	 Test Extendable Query Parser
extends	TokenNameextends	
QueryParserTestBase	TokenNameIdentifier	 Query Parser Test Base
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DELIMITERS	TokenNameIdentifier	 DELIMITERS
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Extensions	TokenNameIdentifier	 Extensions
.	TokenNameDOT	
DEFAULT_EXTENSION_FIELD_DELIMITER	TokenNameIdentifier	 DEFAULT  EXTENSION  FIELD  DELIMITER
,	TokenNameCOMMA	
'-'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'|'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
QueryParser	TokenNameIdentifier	 Query Parser
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
QueryParser	TokenNameIdentifier	 Query Parser
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
Extensions	TokenNameIdentifier	 Extensions
extensions	TokenNameIdentifier	 extensions
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
SIMPLE	TokenNameIdentifier	 SIMPLE
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryParser	TokenNameIdentifier	 Query Parser
qp	TokenNameIdentifier	 qp
=	TokenNameEQUAL	
extensions	TokenNameIdentifier	 extensions
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
ExtendableQueryParser	TokenNameIdentifier	 Extendable Query Parser
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
ExtendableQueryParser	TokenNameIdentifier	 Extendable Query Parser
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
extensions	TokenNameIdentifier	 extensions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
setDefaultOperator	TokenNameIdentifier	 set Default Operator
(	TokenNameLPAREN	
QueryParser	TokenNameIdentifier	 Query Parser
.	TokenNameDOT	
OR_OPERATOR	TokenNameIdentifier	 OR  OPERATOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
qp	TokenNameIdentifier	 qp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUnescapedExtDelimiter	TokenNameIdentifier	 test Unescaped Ext Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Extensions	TokenNameIdentifier	 Extensions
ext	TokenNameIdentifier	 ext
=	TokenNameEQUAL	
newExtensions	TokenNameIdentifier	 new Extensions
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"testExt"	TokenNameStringLiteral	testExt
,	TokenNameCOMMA	
new	TokenNamenew	
ExtensionStub	TokenNameIdentifier	 Extension Stub
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExtendableQueryParser	TokenNameIdentifier	 Extendable Query Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendableQueryParser	TokenNameIdentifier	 Extendable Query Parser
)	TokenNameRPAREN	
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
"aField:testExt:"foo \& bar""	TokenNameStringLiteral	aField:testExt:"foo \& bar"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"extension field delimiter is not escaped"	TokenNameStringLiteral	extension field delimiter is not escaped
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testExtFieldUnqoted	TokenNameIdentifier	 test Ext Field Unqoted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
DELIMITERS	TokenNameIdentifier	 DELIMITERS
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Extensions	TokenNameIdentifier	 Extensions
ext	TokenNameIdentifier	 ext
=	TokenNameEQUAL	
newExtensions	TokenNameIdentifier	 new Extensions
(	TokenNameLPAREN	
DELIMITERS	TokenNameIdentifier	 DELIMITERS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"testExt"	TokenNameStringLiteral	testExt
,	TokenNameCOMMA	
new	TokenNamenew	
ExtensionStub	TokenNameIdentifier	 Extension Stub
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExtendableQueryParser	TokenNameIdentifier	 Extendable Query Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendableQueryParser	TokenNameIdentifier	 Extendable Query Parser
)	TokenNameRPAREN	
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
buildExtensionField	TokenNameIdentifier	 build Extension Field
(	TokenNameLPAREN	
"testExt"	TokenNameStringLiteral	testExt
,	TokenNameCOMMA	
"aField"	TokenNameStringLiteral	aField
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%s:foo bar"	TokenNameStringLiteral	%s:foo bar
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected instance of BooleanQuery but was "	TokenNameStringLiteral	expected instance of BooleanQuery but was 
+	TokenNamePLUS	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
instanceof	TokenNameinstanceof	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bquery	TokenNameIdentifier	 bquery
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
BooleanClause	TokenNameIdentifier	 Boolean Clause
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
clauses	TokenNameIdentifier	 clauses
=	TokenNameEQUAL	
bquery	TokenNameIdentifier	 bquery
.	TokenNameDOT	
getClauses	TokenNameIdentifier	 get Clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanClause	TokenNameIdentifier	 Boolean Clause
booleanClause	TokenNameIdentifier	 boolean Clause
=	TokenNameEQUAL	
clauses	TokenNameIdentifier	 clauses
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
booleanClause	TokenNameIdentifier	 boolean Clause
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected instance of TermQuery but was "	TokenNameStringLiteral	expected instance of TermQuery but was 
+	TokenNamePLUS	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
instanceof	TokenNameinstanceof	
TermQuery	TokenNameIdentifier	 Term Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermQuery	TokenNameIdentifier	 Term Query
tquery	TokenNameIdentifier	 tquery
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermQuery	TokenNameIdentifier	 Term Query
)	TokenNameRPAREN	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"aField"	TokenNameStringLiteral	aField
,	TokenNameCOMMA	
tquery	TokenNameIdentifier	 tquery
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
tquery	TokenNameIdentifier	 tquery
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanClause	TokenNameIdentifier	 boolean Clause
=	TokenNameEQUAL	
clauses	TokenNameIdentifier	 clauses
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
booleanClause	TokenNameIdentifier	 boolean Clause
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected instance of TermQuery but was "	TokenNameStringLiteral	expected instance of TermQuery but was 
+	TokenNamePLUS	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
instanceof	TokenNameinstanceof	
TermQuery	TokenNameIdentifier	 Term Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tquery	TokenNameIdentifier	 tquery
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermQuery	TokenNameIdentifier	 Term Query
)	TokenNameRPAREN	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
tquery	TokenNameIdentifier	 tquery
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
tquery	TokenNameIdentifier	 tquery
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testExtDefaultField	TokenNameIdentifier	 test Ext Default Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
DELIMITERS	TokenNameIdentifier	 DELIMITERS
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Extensions	TokenNameIdentifier	 Extensions
ext	TokenNameIdentifier	 ext
=	TokenNameEQUAL	
newExtensions	TokenNameIdentifier	 new Extensions
(	TokenNameLPAREN	
DELIMITERS	TokenNameIdentifier	 DELIMITERS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"testExt"	TokenNameStringLiteral	testExt
,	TokenNameCOMMA	
new	TokenNamenew	
ExtensionStub	TokenNameIdentifier	 Extension Stub
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExtendableQueryParser	TokenNameIdentifier	 Extendable Query Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendableQueryParser	TokenNameIdentifier	 Extendable Query Parser
)	TokenNameRPAREN	
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
buildExtensionField	TokenNameIdentifier	 build Extension Field
(	TokenNameLPAREN	
"testExt"	TokenNameStringLiteral	testExt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
parse	TokenNameIdentifier	 parse
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%s:"foo \& bar""	TokenNameStringLiteral	%s:"foo \& bar"
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected instance of TermQuery but was "	TokenNameStringLiteral	expected instance of TermQuery but was 
+	TokenNamePLUS	
parse	TokenNameIdentifier	 parse
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
instanceof	TokenNameinstanceof	
TermQuery	TokenNameIdentifier	 Term Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermQuery	TokenNameIdentifier	 Term Query
tquery	TokenNameIdentifier	 tquery
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermQuery	TokenNameIdentifier	 Term Query
)	TokenNameRPAREN	
parse	TokenNameIdentifier	 parse
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
tquery	TokenNameIdentifier	 tquery
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"foo & bar"	TokenNameStringLiteral	foo & bar
,	TokenNameCOMMA	
tquery	TokenNameIdentifier	 tquery
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Extensions	TokenNameIdentifier	 Extensions
newExtensions	TokenNameIdentifier	 new Extensions
(	TokenNameLPAREN	
char	TokenNamechar	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Extensions	TokenNameIdentifier	 Extensions
(	TokenNameLPAREN	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testExtField	TokenNameIdentifier	 test Ext Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
DELIMITERS	TokenNameIdentifier	 DELIMITERS
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Extensions	TokenNameIdentifier	 Extensions
ext	TokenNameIdentifier	 ext
=	TokenNameEQUAL	
newExtensions	TokenNameIdentifier	 new Extensions
(	TokenNameLPAREN	
DELIMITERS	TokenNameIdentifier	 DELIMITERS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"testExt"	TokenNameStringLiteral	testExt
,	TokenNameCOMMA	
new	TokenNamenew	
ExtensionStub	TokenNameIdentifier	 Extension Stub
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExtendableQueryParser	TokenNameIdentifier	 Extendable Query Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendableQueryParser	TokenNameIdentifier	 Extendable Query Parser
)	TokenNameRPAREN	
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
buildExtensionField	TokenNameIdentifier	 build Extension Field
(	TokenNameLPAREN	
"testExt"	TokenNameStringLiteral	testExt
,	TokenNameCOMMA	
"afield"	TokenNameStringLiteral	afield
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
parse	TokenNameIdentifier	 parse
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%s:"foo \& bar""	TokenNameStringLiteral	%s:"foo \& bar"
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected instance of TermQuery but was "	TokenNameStringLiteral	expected instance of TermQuery but was 
+	TokenNamePLUS	
parse	TokenNameIdentifier	 parse
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
instanceof	TokenNameinstanceof	
TermQuery	TokenNameIdentifier	 Term Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermQuery	TokenNameIdentifier	 Term Query
tquery	TokenNameIdentifier	 tquery
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermQuery	TokenNameIdentifier	 Term Query
)	TokenNameRPAREN	
parse	TokenNameIdentifier	 parse
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"afield"	TokenNameStringLiteral	afield
,	TokenNameCOMMA	
tquery	TokenNameIdentifier	 tquery
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"foo & bar"	TokenNameStringLiteral	foo & bar
,	TokenNameCOMMA	
tquery	TokenNameIdentifier	 tquery
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
