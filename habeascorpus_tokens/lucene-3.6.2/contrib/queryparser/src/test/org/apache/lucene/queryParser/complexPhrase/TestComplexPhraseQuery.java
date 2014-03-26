package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
complexPhrase	TokenNameIdentifier	 complex Phrase
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
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
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexWriter	TokenNameIdentifier	 Index Writer
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
IndexSearcher	TokenNameIdentifier	 Index Searcher
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
ScoreDoc	TokenNameIdentifier	 Score Doc
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
TopDocs	TokenNameIdentifier	 Top Docs
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
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
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestComplexPhraseQuery	TokenNameIdentifier	 Test Complex Phrase Query
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
rd	TokenNameIdentifier	 rd
;	TokenNameSEMICOLON	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocData	TokenNameIdentifier	 Doc Data
docsContent	TokenNameIdentifier	 docs Content
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
new	TokenNamenew	
DocData	TokenNameIdentifier	 Doc Data
(	TokenNameLPAREN	
"john smith"	TokenNameStringLiteral	john smith
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
DocData	TokenNameIdentifier	 Doc Data
(	TokenNameLPAREN	
"johathon smith"	TokenNameStringLiteral	johathon smith
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
DocData	TokenNameIdentifier	 Doc Data
(	TokenNameLPAREN	
"john percival smith"	TokenNameStringLiteral	john percival smith
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
DocData	TokenNameIdentifier	 Doc Data
(	TokenNameLPAREN	
"jackson waits tom"	TokenNameStringLiteral	jackson waits tom
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
defaultFieldName	TokenNameIdentifier	 default Field Name
=	TokenNameEQUAL	
"name"	TokenNameStringLiteral	name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testComplexPhrases	TokenNameIdentifier	 test Complex Phrases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
checkMatches	TokenNameIdentifier	 check Matches
(	TokenNameLPAREN	
""john smith""	TokenNameStringLiteral	"john smith"
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Simple multi-term still works 	TokenNameCOMMENT_LINE	Simple multi-term still works 
checkMatches	TokenNameIdentifier	 check Matches
(	TokenNameLPAREN	
""j* smyth~""	TokenNameStringLiteral	"j* smyth~"
,	TokenNameCOMMA	
"1,2"	TokenNameStringLiteral	1,2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// wildcards and fuzzies are OK in 	TokenNameCOMMENT_LINE	wildcards and fuzzies are OK in 
// phrases 	TokenNameCOMMENT_LINE	phrases 
checkMatches	TokenNameIdentifier	 check Matches
(	TokenNameLPAREN	
""(jo* -john) smith""	TokenNameStringLiteral	"(jo* -john) smith"
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// boolean logic works 	TokenNameCOMMENT_LINE	boolean logic works 
checkMatches	TokenNameIdentifier	 check Matches
(	TokenNameLPAREN	
""jo* smith"~2"	TokenNameStringLiteral	"jo* smith"~2
,	TokenNameCOMMA	
"1,2,3"	TokenNameStringLiteral	1,2,3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// position logic works. 	TokenNameCOMMENT_LINE	position logic works. 
checkMatches	TokenNameIdentifier	 check Matches
(	TokenNameLPAREN	
""jo* [sma TO smZ]" "	TokenNameStringLiteral	"jo* [sma TO smZ]" 
,	TokenNameCOMMA	
"1,2"	TokenNameStringLiteral	1,2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// range queries supported 	TokenNameCOMMENT_LINE	range queries supported 
checkMatches	TokenNameIdentifier	 check Matches
(	TokenNameLPAREN	
""john""	TokenNameStringLiteral	"john"
,	TokenNameCOMMA	
"1,3"	TokenNameStringLiteral	1,3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Simple single-term still works 	TokenNameCOMMENT_LINE	Simple single-term still works 
checkMatches	TokenNameIdentifier	 check Matches
(	TokenNameLPAREN	
""(john OR johathon) smith""	TokenNameStringLiteral	"(john OR johathon) smith"
,	TokenNameCOMMA	
"1,2"	TokenNameStringLiteral	1,2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// boolean logic with 	TokenNameCOMMENT_LINE	boolean logic with 
// brackets works. 	TokenNameCOMMENT_LINE	brackets works. 
checkMatches	TokenNameIdentifier	 check Matches
(	TokenNameLPAREN	
""(jo* -john) smyth~""	TokenNameStringLiteral	"(jo* -john) smyth~"
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// boolean logic with 	TokenNameCOMMENT_LINE	boolean logic with 
// brackets works. 	TokenNameCOMMENT_LINE	brackets works. 
// checkMatches("\"john -percival\"", "1"); // not logic doesn't work 	TokenNameCOMMENT_LINE	checkMatches("\"john -percival\"", "1"); // not logic doesn't work 
// currently :(. 	TokenNameCOMMENT_LINE	currently :(. 
checkMatches	TokenNameIdentifier	 check Matches
(	TokenNameLPAREN	
""john nosuchword*""	TokenNameStringLiteral	"john nosuchword*"
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// phrases with clauses producing 	TokenNameCOMMENT_LINE	phrases with clauses producing 
// empty sets 	TokenNameCOMMENT_LINE	empty sets 
checkBadQuery	TokenNameIdentifier	 check Bad Query
(	TokenNameLPAREN	
""jo* id:1 smith""	TokenNameStringLiteral	"jo* id:1 smith"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// mixing fields in a phrase is bad 	TokenNameCOMMENT_LINE	mixing fields in a phrase is bad 
checkBadQuery	TokenNameIdentifier	 check Bad Query
(	TokenNameLPAREN	
""jo* "smith" ""	TokenNameStringLiteral	"jo* "smith" "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// phrases inside phrases is bad 	TokenNameCOMMENT_LINE	phrases inside phrases is bad 
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkBadQuery	TokenNameIdentifier	 check Bad Query
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qString	TokenNameIdentifier	 q String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QueryParser	TokenNameIdentifier	 Query Parser
qp	TokenNameIdentifier	 qp
=	TokenNameEQUAL	
new	TokenNamenew	
ComplexPhraseQueryParser	TokenNameIdentifier	 Complex Phrase Query Parser
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
defaultFieldName	TokenNameIdentifier	 default Field Name
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Throwable	TokenNameIdentifier	 Throwable
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
qString	TokenNameIdentifier	 q String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Expected parse error in "	TokenNameStringLiteral	Expected parse error in 
+	TokenNamePLUS	
qString	TokenNameIdentifier	 q String
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkMatches	TokenNameIdentifier	 check Matches
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qString	TokenNameIdentifier	 q String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expectedVals	TokenNameIdentifier	 expected Vals
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
QueryParser	TokenNameIdentifier	 Query Parser
qp	TokenNameIdentifier	 qp
=	TokenNameEQUAL	
new	TokenNamenew	
ComplexPhraseQueryParser	TokenNameIdentifier	 Complex Phrase Query Parser
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
defaultFieldName	TokenNameIdentifier	 default Field Name
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
setFuzzyPrefixLength	TokenNameIdentifier	 set Fuzzy Prefix Length
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// usually a good idea 	TokenNameCOMMENT_LINE	usually a good idea 
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
qString	TokenNameIdentifier	 q String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
expecteds	TokenNameIdentifier	 expecteds
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vals	TokenNameIdentifier	 vals
=	TokenNameEQUAL	
expectedVals	TokenNameIdentifier	 expected Vals
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
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
vals	TokenNameIdentifier	 vals
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
expecteds	TokenNameIdentifier	 expecteds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TopDocs	TokenNameIdentifier	 Top Docs
td	TokenNameIdentifier	 td
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sd	TokenNameIdentifier	 sd
=	TokenNameEQUAL	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
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
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
sd	TokenNameIdentifier	 sd
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
qString	TokenNameIdentifier	 q String
+	TokenNamePLUS	
"matched doc#"	TokenNameStringLiteral	matched doc#
+	TokenNamePLUS	
id	TokenNameIdentifier	 id
+	TokenNamePLUS	
" not expected"	TokenNameStringLiteral	 not expected
,	TokenNameCOMMA	
expecteds	TokenNameIdentifier	 expecteds
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expecteds	TokenNameIdentifier	 expecteds
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
qString	TokenNameIdentifier	 q String
+	TokenNamePLUS	
" missing some matches "	TokenNameStringLiteral	 missing some matches 
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
expecteds	TokenNameIdentifier	 expecteds
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rd	TokenNameIdentifier	 rd
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
rd	TokenNameIdentifier	 rd
,	TokenNameCOMMA	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
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
docsContent	TokenNameIdentifier	 docs Content
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
docsContent	TokenNameIdentifier	 docs Content
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
docsContent	TokenNameIdentifier	 docs Content
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSearcher	TokenNameIdentifier	 Index Searcher
(	TokenNameLPAREN	
rd	TokenNameIdentifier	 rd
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rd	TokenNameIdentifier	 rd
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
DocData	TokenNameIdentifier	 Doc Data
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DocData	TokenNameIdentifier	 Doc Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
