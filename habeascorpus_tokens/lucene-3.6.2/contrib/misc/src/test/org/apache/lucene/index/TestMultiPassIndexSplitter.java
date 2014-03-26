package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
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
TestMultiPassIndexSplitter	TokenNameIdentifier	 Test Multi Pass Index Splitter
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
int	TokenNameint	
NUM_DOCS	TokenNameIdentifier	 NUM  DOCS
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
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
dir	TokenNameIdentifier	 dir
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
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
NoMergePolicy	TokenNameIdentifier	 No Merge Policy
.	TokenNameDOT	
COMPOUND_FILES	TokenNameIdentifier	 COMPOUND  FILES
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
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
NUM_DOCS	TokenNameIdentifier	 NUM  DOCS
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
""	TokenNameStringLiteral	 
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
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
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
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
3	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// delete the last doc 	TokenNameCOMMENT_LINE	delete the last doc 
input	TokenNameIdentifier	 input
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
input	TokenNameIdentifier	 input
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
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
/** * Test round-robin splitting. */	TokenNameCOMMENT_JAVADOC	 Test round-robin splitting. 
public	TokenNamepublic	
void	TokenNamevoid	
testSplitRR	TokenNameIdentifier	 test Split RR
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
MultiPassIndexSplitter	TokenNameIdentifier	 Multi Pass Index Splitter
splitter	TokenNameIdentifier	 splitter
=	TokenNameEQUAL	
new	TokenNamenew	
MultiPassIndexSplitter	TokenNameIdentifier	 Multi Pass Index Splitter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dirs	TokenNameIdentifier	 dirs
=	TokenNameEQUAL	
new	TokenNamenew	
Directory	TokenNameIdentifier	 Directory
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
splitter	TokenNameIdentifier	 splitter
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
dirs	TokenNameIdentifier	 dirs
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
ir	TokenNameIdentifier	 ir
;	TokenNameSEMICOLON	
ir	TokenNameIdentifier	 ir
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dirs	TokenNameIdentifier	 dirs
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
NUM_DOCS	TokenNameIdentifier	 NUM  DOCS
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// rounding error 	TokenNameCOMMENT_LINE	rounding error 
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
TermEnum	TokenNameIdentifier	 Term Enum
te	TokenNameIdentifier	 te
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ir	TokenNameIdentifier	 ir
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dirs	TokenNameIdentifier	 dirs
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
NUM_DOCS	TokenNameIdentifier	 NUM  DOCS
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ir	TokenNameIdentifier	 ir
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dirs	TokenNameIdentifier	 dirs
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
NUM_DOCS	TokenNameIdentifier	 NUM  DOCS
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
d	TokenNameIdentifier	 d
:	TokenNameCOLON	
dirs	TokenNameIdentifier	 dirs
)	TokenNameRPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test sequential splitting. */	TokenNameCOMMENT_JAVADOC	 Test sequential splitting. 
public	TokenNamepublic	
void	TokenNamevoid	
testSplitSeq	TokenNameIdentifier	 test Split Seq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
MultiPassIndexSplitter	TokenNameIdentifier	 Multi Pass Index Splitter
splitter	TokenNameIdentifier	 splitter
=	TokenNameEQUAL	
new	TokenNamenew	
MultiPassIndexSplitter	TokenNameIdentifier	 Multi Pass Index Splitter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dirs	TokenNameIdentifier	 dirs
=	TokenNameEQUAL	
new	TokenNamenew	
Directory	TokenNameIdentifier	 Directory
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
splitter	TokenNameIdentifier	 splitter
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
dirs	TokenNameIdentifier	 dirs
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
ir	TokenNameIdentifier	 ir
;	TokenNameSEMICOLON	
ir	TokenNameIdentifier	 ir
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dirs	TokenNameIdentifier	 dirs
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
NUM_DOCS	TokenNameIdentifier	 NUM  DOCS
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ir	TokenNameIdentifier	 ir
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dirs	TokenNameIdentifier	 dirs
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
NUM_DOCS	TokenNameIdentifier	 NUM  DOCS
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
+=	TokenNamePLUS_EQUAL	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ir	TokenNameIdentifier	 ir
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dirs	TokenNameIdentifier	 dirs
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
NUM_DOCS	TokenNameIdentifier	 NUM  DOCS
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make sure the deleted doc is not here 	TokenNameCOMMENT_LINE	make sure the deleted doc is not here 
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
TermEnum	TokenNameIdentifier	 Term Enum
te	TokenNameIdentifier	 te
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
(	TokenNameLPAREN	
NUM_DOCS	TokenNameIdentifier	 NUM  DOCS
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
d	TokenNameIdentifier	 d
:	TokenNameCOLON	
dirs	TokenNameIdentifier	 dirs
)	TokenNameRPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
