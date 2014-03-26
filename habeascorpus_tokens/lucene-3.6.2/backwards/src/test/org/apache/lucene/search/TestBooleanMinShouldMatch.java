package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
IndexReader	TokenNameIdentifier	 Index Reader
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
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
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
Term	TokenNameIdentifier	 Term
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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
AfterClass	TokenNameIdentifier	 After Class
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
BeforeClass	TokenNameIdentifier	 Before Class
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormat	TokenNameIdentifier	 Decimal Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
/** Test that BooleanQuery.setMinimumNumberShouldMatch works. */	TokenNameCOMMENT_JAVADOC	 Test that BooleanQuery.setMinimumNumberShouldMatch works. 
public	TokenNamepublic	
class	TokenNameclass	
TestBooleanMinShouldMatch	TokenNameIdentifier	 Test Boolean Min Should Match
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Directory	TokenNameIdentifier	 Directory
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
IndexSearcher	TokenNameIdentifier	 Index Searcher
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
@	TokenNameAT	
BeforeClass	TokenNameIdentifier	 Before Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
beforeClass	TokenNameIdentifier	 before Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"A 1 2 3 4 5 6"	TokenNameStringLiteral	A 1 2 3 4 5 6
,	TokenNameCOMMA	
"Z 4 5 6"	TokenNameStringLiteral	Z 4 5 6
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"B 2 4 5 6"	TokenNameStringLiteral	B 2 4 5 6
,	TokenNameCOMMA	
"Y 3 5 6"	TokenNameStringLiteral	Y 3 5 6
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"C 3 6"	TokenNameStringLiteral	C 3 6
,	TokenNameCOMMA	
"X 4 5 6"	TokenNameStringLiteral	X 4 5 6
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
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
data	TokenNameIdentifier	 data
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
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
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
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Field.Keyword("id",String.valueOf(i))); 	TokenNameCOMMENT_LINE	Field.Keyword("id",String.valueOf(i))); 
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"all"	TokenNameStringLiteral	all
,	TokenNameCOMMA	
"all"	TokenNameStringLiteral	all
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
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Field.Keyword("all","all")); 	TokenNameCOMMENT_LINE	Field.Keyword("all","all")); 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
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
//Field.Text("data",data[i])); 	TokenNameCOMMENT_LINE	Field.Text("data",data[i])); 
}	TokenNameRBRACE	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("Set up " + getName()); 	TokenNameCOMMENT_LINE	System.out.println("Set up " + getName()); 
}	TokenNameRBRACE	
@	TokenNameAT	
AfterClass	TokenNameIdentifier	 After Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
afterClass	TokenNameIdentifier	 after Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
verifyNrHits	TokenNameIdentifier	 verify Nr Hits
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
int	TokenNameint	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
!=	TokenNameNOT_EQUAL	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printHits	TokenNameIdentifier	 print Hits
(	TokenNameLPAREN	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"result count"	TokenNameStringLiteral	result count
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAllOptional	TokenNameIdentifier	 test All Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
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
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
}	TokenNameRBRACE	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setMinimumNumberShouldMatch	TokenNameIdentifier	 set Minimum Number Should Match
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// match at least two of 4 	TokenNameCOMMENT_LINE	match at least two of 4 
verifyNrHits	TokenNameIdentifier	 verify Nr Hits
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOneReqAndSomeOptional	TokenNameIdentifier	 test One Req And Some Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/* one required, some optional */	TokenNameCOMMENT_BLOCK	 one required, some optional 
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"all"	TokenNameStringLiteral	all
,	TokenNameCOMMA	
"all"	TokenNameStringLiteral	all
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//true, false); 	TokenNameCOMMENT_LINE	true, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setMinimumNumberShouldMatch	TokenNameIdentifier	 set Minimum Number Should Match
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 2 of 3 optional 	TokenNameCOMMENT_LINE	2 of 3 optional 
verifyNrHits	TokenNameIdentifier	 verify Nr Hits
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSomeReqAndSomeOptional	TokenNameIdentifier	 test Some Req And Some Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/* two required, some optional */	TokenNameCOMMENT_BLOCK	 two required, some optional 
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"all"	TokenNameStringLiteral	all
,	TokenNameCOMMA	
"all"	TokenNameStringLiteral	all
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//true, false); 	TokenNameCOMMENT_LINE	true, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//true, false); 	TokenNameCOMMENT_LINE	true, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setMinimumNumberShouldMatch	TokenNameIdentifier	 set Minimum Number Should Match
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 2 of 3 optional 	TokenNameCOMMENT_LINE	2 of 3 optional 
verifyNrHits	TokenNameIdentifier	 verify Nr Hits
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOneProhibAndSomeOptional	TokenNameIdentifier	 test One Prohib And Some Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/* one prohibited, some optional */	TokenNameCOMMENT_BLOCK	 one prohibited, some optional 
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, true ); 	TokenNameCOMMENT_LINE	false, true ); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setMinimumNumberShouldMatch	TokenNameIdentifier	 set Minimum Number Should Match
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 2 of 3 optional 	TokenNameCOMMENT_LINE	2 of 3 optional 
verifyNrHits	TokenNameIdentifier	 verify Nr Hits
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSomeProhibAndSomeOptional	TokenNameIdentifier	 test Some Prohib And Some Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/* two prohibited, some optional */	TokenNameCOMMENT_BLOCK	 two prohibited, some optional 
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, true ); 	TokenNameCOMMENT_LINE	false, true ); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"C"	TokenNameStringLiteral	C
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, true ); 	TokenNameCOMMENT_LINE	false, true ); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setMinimumNumberShouldMatch	TokenNameIdentifier	 set Minimum Number Should Match
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 2 of 3 optional 	TokenNameCOMMENT_LINE	2 of 3 optional 
verifyNrHits	TokenNameIdentifier	 verify Nr Hits
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOneReqOneProhibAndSomeOptional	TokenNameIdentifier	 test One Req One Prohib And Some Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/* one required, one prohibited, some optional */	TokenNameCOMMENT_BLOCK	 one required, one prohibited, some optional 
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// true, false); 	TokenNameCOMMENT_LINE	true, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, true ); 	TokenNameCOMMENT_LINE	false, true ); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setMinimumNumberShouldMatch	TokenNameIdentifier	 set Minimum Number Should Match
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 3 of 4 optional 	TokenNameCOMMENT_LINE	3 of 4 optional 
verifyNrHits	TokenNameIdentifier	 verify Nr Hits
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSomeReqOneProhibAndSomeOptional	TokenNameIdentifier	 test Some Req One Prohib And Some Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/* two required, one prohibited, some optional */	TokenNameCOMMENT_BLOCK	 two required, one prohibited, some optional 
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"all"	TokenNameStringLiteral	all
,	TokenNameCOMMA	
"all"	TokenNameStringLiteral	all
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//true, false); 	TokenNameCOMMENT_LINE	true, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//true, false); 	TokenNameCOMMENT_LINE	true, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, true ); 	TokenNameCOMMENT_LINE	false, true ); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setMinimumNumberShouldMatch	TokenNameIdentifier	 set Minimum Number Should Match
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 3 of 4 optional 	TokenNameCOMMENT_LINE	3 of 4 optional 
verifyNrHits	TokenNameIdentifier	 verify Nr Hits
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOneReqSomeProhibAndSomeOptional	TokenNameIdentifier	 test One Req Some Prohib And Some Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/* one required, two prohibited, some optional */	TokenNameCOMMENT_BLOCK	 one required, two prohibited, some optional 
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//true, false); 	TokenNameCOMMENT_LINE	true, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, true ); 	TokenNameCOMMENT_LINE	false, true ); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"C"	TokenNameStringLiteral	C
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, true ); 	TokenNameCOMMENT_LINE	false, true ); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setMinimumNumberShouldMatch	TokenNameIdentifier	 set Minimum Number Should Match
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 3 of 4 optional 	TokenNameCOMMENT_LINE	3 of 4 optional 
verifyNrHits	TokenNameIdentifier	 verify Nr Hits
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSomeReqSomeProhibAndSomeOptional	TokenNameIdentifier	 test Some Req Some Prohib And Some Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/* two required, two prohibited, some optional */	TokenNameCOMMENT_BLOCK	 two required, two prohibited, some optional 
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"all"	TokenNameStringLiteral	all
,	TokenNameCOMMA	
"all"	TokenNameStringLiteral	all
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//true, false); 	TokenNameCOMMENT_LINE	true, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//true, false); 	TokenNameCOMMENT_LINE	true, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, true ); 	TokenNameCOMMENT_LINE	false, true ); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"C"	TokenNameStringLiteral	C
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, true ); 	TokenNameCOMMENT_LINE	false, true ); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setMinimumNumberShouldMatch	TokenNameIdentifier	 set Minimum Number Should Match
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 3 of 4 optional 	TokenNameCOMMENT_LINE	3 of 4 optional 
verifyNrHits	TokenNameIdentifier	 verify Nr Hits
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMinHigherThenNumOptional	TokenNameIdentifier	 test Min Higher Then Num Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/* two required, two prohibited, some optional */	TokenNameCOMMENT_BLOCK	 two required, two prohibited, some optional 
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"all"	TokenNameStringLiteral	all
,	TokenNameCOMMA	
"all"	TokenNameStringLiteral	all
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//true, false); 	TokenNameCOMMENT_LINE	true, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//true, false); 	TokenNameCOMMENT_LINE	true, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, true ); 	TokenNameCOMMENT_LINE	false, true ); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"C"	TokenNameStringLiteral	C
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, true ); 	TokenNameCOMMENT_LINE	false, true ); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setMinimumNumberShouldMatch	TokenNameIdentifier	 set Minimum Number Should Match
(	TokenNameLPAREN	
90	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 90 of 4 optional ?!?!?! 	TokenNameCOMMENT_LINE	90 of 4 optional ?!?!?! 
verifyNrHits	TokenNameIdentifier	 verify Nr Hits
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMinEqualToNumOptional	TokenNameIdentifier	 test Min Equal To Num Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/* two required, two optional */	TokenNameCOMMENT_BLOCK	 two required, two optional 
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"all"	TokenNameStringLiteral	all
,	TokenNameCOMMA	
"all"	TokenNameStringLiteral	all
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//true, false); 	TokenNameCOMMENT_LINE	true, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//true, false); 	TokenNameCOMMENT_LINE	true, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setMinimumNumberShouldMatch	TokenNameIdentifier	 set Minimum Number Should Match
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 2 of 2 optional 	TokenNameCOMMENT_LINE	2 of 2 optional 
verifyNrHits	TokenNameIdentifier	 verify Nr Hits
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOneOptionalEqualToMin	TokenNameIdentifier	 test One Optional Equal To Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/* two required, one optional */	TokenNameCOMMENT_BLOCK	 two required, one optional 
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"all"	TokenNameStringLiteral	all
,	TokenNameCOMMA	
"all"	TokenNameStringLiteral	all
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//true, false); 	TokenNameCOMMENT_LINE	true, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//false, false); 	TokenNameCOMMENT_LINE	false, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//true, false); 	TokenNameCOMMENT_LINE	true, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setMinimumNumberShouldMatch	TokenNameIdentifier	 set Minimum Number Should Match
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 1 of 1 optional 	TokenNameCOMMENT_LINE	1 of 1 optional 
verifyNrHits	TokenNameIdentifier	 verify Nr Hits
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoOptionalButMin	TokenNameIdentifier	 test No Optional But Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/* two required, no optional */	TokenNameCOMMENT_BLOCK	 two required, no optional 
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"all"	TokenNameStringLiteral	all
,	TokenNameCOMMA	
"all"	TokenNameStringLiteral	all
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//true, false); 	TokenNameCOMMENT_LINE	true, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//true, false); 	TokenNameCOMMENT_LINE	true, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setMinimumNumberShouldMatch	TokenNameIdentifier	 set Minimum Number Should Match
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 1 of 0 optional 	TokenNameCOMMENT_LINE	1 of 0 optional 
verifyNrHits	TokenNameIdentifier	 verify Nr Hits
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoOptionalButMin2	TokenNameIdentifier	 test No Optional But Min2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/* one required, no optional */	TokenNameCOMMENT_BLOCK	 one required, no optional 
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"all"	TokenNameStringLiteral	all
,	TokenNameCOMMA	
"all"	TokenNameStringLiteral	all
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//true, false); 	TokenNameCOMMENT_LINE	true, false); 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setMinimumNumberShouldMatch	TokenNameIdentifier	 set Minimum Number Should Match
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 1 of 0 optional 	TokenNameCOMMENT_LINE	1 of 0 optional 
verifyNrHits	TokenNameIdentifier	 verify Nr Hits
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRandomQueries	TokenNameIdentifier	 test Random Queries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
"data"	TokenNameStringLiteral	data
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vals	TokenNameIdentifier	 vals
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
"Z"	TokenNameStringLiteral	Z
,	TokenNameCOMMA	
"B"	TokenNameStringLiteral	B
,	TokenNameCOMMA	
"Y"	TokenNameStringLiteral	Y
,	TokenNameCOMMA	
"Z"	TokenNameStringLiteral	Z
,	TokenNameCOMMA	
"X"	TokenNameStringLiteral	X
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxLev	TokenNameIdentifier	 max Lev
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// callback object to set a random setMinimumNumberShouldMatch 	TokenNameCOMMENT_LINE	callback object to set a random setMinimumNumberShouldMatch 
TestBoolean2	TokenNameIdentifier	 Test Boolean2
.	TokenNameDOT	
Callback	TokenNameIdentifier	 Callback
minNrCB	TokenNameIdentifier	 min Nr CB
=	TokenNameEQUAL	
new	TokenNamenew	
TestBoolean2	TokenNameIdentifier	 Test Boolean2
.	TokenNameDOT	
Callback	TokenNameIdentifier	 Callback
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
postCreate	TokenNameIdentifier	 post Create
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BooleanClause	TokenNameIdentifier	 Boolean Clause
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
getClauses	TokenNameIdentifier	 get Clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
opt	TokenNameIdentifier	 opt
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
c	TokenNameIdentifier	 c
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getOccur	TokenNameIdentifier	 get Occur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
opt	TokenNameIdentifier	 opt
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setMinimumNumberShouldMatch	TokenNameIdentifier	 set Minimum Number Should Match
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
opt	TokenNameIdentifier	 opt
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// increase number of iterations for more complete testing 	TokenNameCOMMENT_LINE	increase number of iterations for more complete testing 
int	TokenNameint	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
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
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lev	TokenNameIdentifier	 lev
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
maxLev	TokenNameIdentifier	 max Lev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
seed	TokenNameIdentifier	 seed
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextLong	TokenNameIdentifier	 next Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
TestBoolean2	TokenNameIdentifier	 Test Boolean2
.	TokenNameDOT	
randBoolQuery	TokenNameIdentifier	 rand Bool Query
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
lev	TokenNameIdentifier	 lev
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// BooleanQuery q2 = TestBoolean2.randBoolQuery(new Random(seed), lev, field, vals, minNrCB); 	TokenNameCOMMENT_LINE	BooleanQuery q2 = TestBoolean2.randBoolQuery(new Random(seed), lev, field, vals, minNrCB); 
BooleanQuery	TokenNameIdentifier	 Boolean Query
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
TestBoolean2	TokenNameIdentifier	 Test Boolean2
.	TokenNameDOT	
randBoolQuery	TokenNameIdentifier	 rand Bool Query
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
lev	TokenNameIdentifier	 lev
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// only set minimumNumberShouldMatch on the top level query since setting 	TokenNameCOMMENT_LINE	only set minimumNumberShouldMatch on the top level query since setting 
// at a lower level can change the score. 	TokenNameCOMMENT_LINE	at a lower level can change the score. 
minNrCB	TokenNameIdentifier	 min Nr CB
.	TokenNameDOT	
postCreate	TokenNameIdentifier	 post Create
(	TokenNameLPAREN	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Can't use Hits because normalized scores will mess things 	TokenNameCOMMENT_LINE	Can't use Hits because normalized scores will mess things 
// up. The non-sorting version of search() that returns TopDocs 	TokenNameCOMMENT_LINE	up. The non-sorting version of search() that returns TopDocs 
// will not normalize scores. 	TokenNameCOMMENT_LINE	will not normalize scores. 
TopDocs	TokenNameIdentifier	 Top Docs
top1	TokenNameIdentifier	 top1
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TopDocs	TokenNameIdentifier	 Top Docs
top2	TokenNameIdentifier	 top2
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q2	TokenNameIdentifier	 q2
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
q2	TokenNameIdentifier	 q2
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// The constrained query 	TokenNameCOMMENT_LINE	The constrained query 
// should be a superset to the unconstrained query. 	TokenNameCOMMENT_LINE	should be a superset to the unconstrained query. 
if	TokenNameif	
(	TokenNameLPAREN	
top2	TokenNameIdentifier	 top2
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
>	TokenNameGREATER	
top1	TokenNameIdentifier	 top1
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Constrained results not a subset: "	TokenNameStringLiteral	Constrained results not a subset: 
+	TokenNamePLUS	
CheckHits	TokenNameIdentifier	 Check Hits
.	TokenNameDOT	
topdocsString	TokenNameIdentifier	 topdocs String
(	TokenNameLPAREN	
top1	TokenNameIdentifier	 top1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
CheckHits	TokenNameIdentifier	 Check Hits
.	TokenNameDOT	
topdocsString	TokenNameIdentifier	 topdocs String
(	TokenNameLPAREN	
top2	TokenNameIdentifier	 top2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"for query:"	TokenNameStringLiteral	for query:
+	TokenNamePLUS	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
hit	TokenNameIdentifier	 hit
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hit	TokenNameIdentifier	 hit
<	TokenNameLESS	
top2	TokenNameIdentifier	 top2
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
hit	TokenNameIdentifier	 hit
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
top2	TokenNameIdentifier	 top2
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
hit	TokenNameIdentifier	 hit
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
top2	TokenNameIdentifier	 top2
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
hit	TokenNameIdentifier	 hit
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// find this doc in other hits 	TokenNameCOMMENT_LINE	find this doc in other hits 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
<	TokenNameLESS	
top1	TokenNameIdentifier	 top1
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
top1	TokenNameIdentifier	 top1
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
other	TokenNameIdentifier	 other
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
==	TokenNameEQUAL_EQUAL	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
otherScore	TokenNameIdentifier	 other Score
=	TokenNameEQUAL	
top1	TokenNameIdentifier	 top1
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
other	TokenNameIdentifier	 other
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
// check if scores match 	TokenNameCOMMENT_LINE	check if scores match 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Doc "	TokenNameStringLiteral	Doc 
+	TokenNamePLUS	
id	TokenNameIdentifier	 id
+	TokenNamePLUS	
" scores don't match "	TokenNameStringLiteral	 scores don't match 
+	TokenNamePLUS	
CheckHits	TokenNameIdentifier	 Check Hits
.	TokenNameDOT	
topdocsString	TokenNameIdentifier	 topdocs String
(	TokenNameLPAREN	
top1	TokenNameIdentifier	 top1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
CheckHits	TokenNameIdentifier	 Check Hits
.	TokenNameDOT	
topdocsString	TokenNameIdentifier	 topdocs String
(	TokenNameLPAREN	
top2	TokenNameIdentifier	 top2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"for query:"	TokenNameStringLiteral	for query:
+	TokenNamePLUS	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
otherScore	TokenNameIdentifier	 other Score
,	TokenNameCOMMA	
1.0e-6f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// check if subset 	TokenNameCOMMENT_LINE	check if subset 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Doc "	TokenNameStringLiteral	Doc 
+	TokenNamePLUS	
id	TokenNameIdentifier	 id
+	TokenNamePLUS	
" not found "	TokenNameStringLiteral	 not found 
+	TokenNamePLUS	
CheckHits	TokenNameIdentifier	 Check Hits
.	TokenNameDOT	
topdocsString	TokenNameIdentifier	 topdocs String
(	TokenNameLPAREN	
top1	TokenNameIdentifier	 top1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
CheckHits	TokenNameIdentifier	 Check Hits
.	TokenNameDOT	
topdocsString	TokenNameIdentifier	 topdocs String
(	TokenNameLPAREN	
top2	TokenNameIdentifier	 top2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"for query:"	TokenNameStringLiteral	for query:
+	TokenNamePLUS	
q2	TokenNameIdentifier	 q2
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// System.out.println("Total hits:"+tot); 	TokenNameCOMMENT_LINE	System.out.println("Total hits:"+tot); 
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
printHits	TokenNameIdentifier	 print Hits
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"------- "	TokenNameStringLiteral	------- 
+	TokenNamePLUS	
test	TokenNameIdentifier	 test
+	TokenNamePLUS	
" -------"	TokenNameStringLiteral	 -------
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DecimalFormat	TokenNameIdentifier	 Decimal Format
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
DecimalFormat	TokenNameIdentifier	 Decimal Format
(	TokenNameLPAREN	
"0.000000"	TokenNameStringLiteral	0.000000
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
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"#"	TokenNameStringLiteral	#
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
+	TokenNamePLUS	
" - "	TokenNameStringLiteral	 - 
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
+	TokenNamePLUS	
" - "	TokenNameStringLiteral	 - 
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"data"	TokenNameStringLiteral	data
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
