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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Modifier	TokenNameIdentifier	 Modifier
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestSuite	TokenNameIdentifier	 Test Suite
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
textui	TokenNameIdentifier	 textui
.	TokenNameDOT	
TestRunner	TokenNameIdentifier	 Test Runner
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ReaderUtil	TokenNameIdentifier	 Reader Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestFilterIndexReader	TokenNameIdentifier	 Test Filter Index Reader
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
TestReader	TokenNameIdentifier	 Test Reader
extends	TokenNameextends	
FilterIndexReader	TokenNameIdentifier	 Filter Index Reader
{	TokenNameLBRACE	
/** Filter that only permits terms containing 'e'.*/	TokenNameCOMMENT_JAVADOC	 Filter that only permits terms containing 'e'.
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
TestTermEnum	TokenNameIdentifier	 Test Term Enum
extends	TokenNameextends	
FilterTermEnum	TokenNameIdentifier	 Filter Term Enum
{	TokenNameLBRACE	
public	TokenNamepublic	
TestTermEnum	TokenNameIdentifier	 Test Term Enum
(	TokenNameLPAREN	
TermEnum	TokenNameIdentifier	 Term Enum
termEnum	TokenNameIdentifier	 term Enum
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
termEnum	TokenNameIdentifier	 term Enum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Scan for terms containing the letter 'e'.*/	TokenNameCOMMENT_JAVADOC	 Scan for terms containing the letter 'e'.
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Filter that only returns odd numbered documents. */	TokenNameCOMMENT_JAVADOC	 Filter that only returns odd numbered documents. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
TestTermPositions	TokenNameIdentifier	 Test Term Positions
extends	TokenNameextends	
FilterTermPositions	TokenNameIdentifier	 Filter Term Positions
{	TokenNameLBRACE	
public	TokenNamepublic	
TestTermPositions	TokenNameIdentifier	 Test Term Positions
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Scan for odd numbered documents. */	TokenNameCOMMENT_JAVADOC	 Scan for odd numbered documents. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
TestReader	TokenNameIdentifier	 Test Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Filter terms with TestTermEnum. */	TokenNameCOMMENT_JAVADOC	 Filter terms with TestTermEnum. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermEnum	TokenNameIdentifier	 Term Enum
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TestTermEnum	TokenNameIdentifier	 Test Term Enum
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Filter positions with TestTermPositions. */	TokenNameCOMMENT_JAVADOC	 Filter positions with TestTermPositions. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermPositions	TokenNameIdentifier	 Term Positions
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TestTermPositions	TokenNameIdentifier	 Test Term Positions
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
FieldInfos	TokenNameIdentifier	 Field Infos
getFieldInfos	TokenNameIdentifier	 get Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ReaderUtil	TokenNameIdentifier	 Reader Util
.	TokenNameDOT	
getMergedFieldInfos	TokenNameIdentifier	 get Merged Field Infos
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Main for running test case by itself. */	TokenNameCOMMENT_JAVADOC	 Main for running test case by itself. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TestRunner	TokenNameIdentifier	 Test Runner
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
new	TokenNamenew	
TestSuite	TokenNameIdentifier	 Test Suite
(	TokenNameLPAREN	
TestIndexReader	TokenNameIdentifier	 Test Index Reader
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests the IndexReader.getFieldNames implementation * @throws Exception on error */	TokenNameCOMMENT_JAVADOC	 Tests the IndexReader.getFieldNames implementation @throws Exception on error 
public	TokenNamepublic	
void	TokenNamevoid	
testFilterIndexReader	TokenNameIdentifier	 test Filter Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
d1	TokenNameIdentifier	 d1
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d1	TokenNameIdentifier	 d1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"one two"	TokenNameStringLiteral	one two
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
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
d1	TokenNameIdentifier	 d1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
d2	TokenNameIdentifier	 d2
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d2	TokenNameIdentifier	 d2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"one three"	TokenNameStringLiteral	one three
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
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
d2	TokenNameIdentifier	 d2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
d3	TokenNameIdentifier	 d3
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d3	TokenNameIdentifier	 d3
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"two four"	TokenNameStringLiteral	two four
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
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
d3	TokenNameIdentifier	 d3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
TestReader	TokenNameIdentifier	 Test Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermEnum	TokenNameIdentifier	 Term Enum
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermPositions	TokenNameIdentifier	 Term Positions
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"one"	TokenNameStringLiteral	one
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
NUM_DOCS	TokenNameIdentifier	 NUM  DOCS
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
TermDocs	TokenNameIdentifier	 Term Docs
td	TokenNameIdentifier	 td
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
null	TokenNamenull	
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
NUM_DOCS	TokenNameIdentifier	 NUM  DOCS
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkOverrideMethods	TokenNameIdentifier	 check Override Methods
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
m	TokenNameIdentifier	 m
:	TokenNameCOLON	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getMethods	TokenNameIdentifier	 get Methods
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
mods	TokenNameIdentifier	 mods
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
isStatic	TokenNameIdentifier	 is Static
(	TokenNameLPAREN	
mods	TokenNameIdentifier	 mods
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
(	TokenNameLPAREN	
mods	TokenNameIdentifier	 mods
)	TokenNameRPAREN	
||	TokenNameOR_OR	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
isSynthetic	TokenNameIdentifier	 is Synthetic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
declaringClass	TokenNameIdentifier	 declaring Class
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getDeclaringClass	TokenNameIdentifier	 get Declaring Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
declaringClass	TokenNameIdentifier	 declaring Class
!=	TokenNameNOT_EQUAL	
clazz	TokenNameIdentifier	 clazz
&&	TokenNameAND_AND	
declaringClass	TokenNameIdentifier	 declaring Class
!=	TokenNameNOT_EQUAL	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"method is not overridden by "	TokenNameStringLiteral	method is not overridden by 
+	TokenNamePLUS	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
toGenericString	TokenNameIdentifier	 to Generic String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" does not override some methods; see log above"	TokenNameStringLiteral	 does not override some methods; see log above
,	TokenNameCOMMA	
fail	TokenNameIdentifier	 fail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOverrideMethods	TokenNameIdentifier	 test Override Methods
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
methodsThatShouldNotBeOverridden	TokenNameIdentifier	 methods That Should Not Be Overridden
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
methodsThatShouldNotBeOverridden	TokenNameIdentifier	 methods That Should Not Be Overridden
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"reopen"	TokenNameStringLiteral	reopen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
methodsThatShouldNotBeOverridden	TokenNameIdentifier	 methods That Should Not Be Overridden
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"doOpenIfChanged"	TokenNameStringLiteral	doOpenIfChanged
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
methodsThatShouldNotBeOverridden	TokenNameIdentifier	 methods That Should Not Be Overridden
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"clone"	TokenNameStringLiteral	clone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
m	TokenNameIdentifier	 m
:	TokenNameCOLON	
FilterIndexReader	TokenNameIdentifier	 Filter Index Reader
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethods	TokenNameIdentifier	 get Methods
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
mods	TokenNameIdentifier	 mods
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
isStatic	TokenNameIdentifier	 is Static
(	TokenNameLPAREN	
mods	TokenNameIdentifier	 mods
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
(	TokenNameLPAREN	
mods	TokenNameIdentifier	 mods
)	TokenNameRPAREN	
||	TokenNameOR_OR	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
isSynthetic	TokenNameIdentifier	 is Synthetic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
declaringClass	TokenNameIdentifier	 declaring Class
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getDeclaringClass	TokenNameIdentifier	 get Declaring Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
declaringClass	TokenNameIdentifier	 declaring Class
!=	TokenNameNOT_EQUAL	
FilterIndexReader	TokenNameIdentifier	 Filter Index Reader
.	TokenNameDOT	
class	TokenNameclass	
&&	TokenNameAND_AND	
declaringClass	TokenNameIdentifier	 declaring Class
!=	TokenNameNOT_EQUAL	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
&&	TokenNameAND_AND	
!	TokenNameNOT	
methodsThatShouldNotBeOverridden	TokenNameIdentifier	 methods That Should Not Be Overridden
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"method is not overridden by FilterIndexReader: "	TokenNameStringLiteral	method is not overridden by FilterIndexReader: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
declaringClass	TokenNameIdentifier	 declaring Class
==	TokenNameEQUAL_EQUAL	
FilterIndexReader	TokenNameIdentifier	 Filter Index Reader
.	TokenNameDOT	
class	TokenNameclass	
&&	TokenNameAND_AND	
methodsThatShouldNotBeOverridden	TokenNameIdentifier	 methods That Should Not Be Overridden
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"method should not be overridden by FilterIndexReader: "	TokenNameStringLiteral	method should not be overridden by FilterIndexReader: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"FilterIndexReader overrides (or not) some problematic methods; see log above"	TokenNameStringLiteral	FilterIndexReader overrides (or not) some problematic methods; see log above
,	TokenNameCOMMA	
fail	TokenNameIdentifier	 fail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// some more inner classes: 	TokenNameCOMMENT_LINE	some more inner classes: 
checkOverrideMethods	TokenNameIdentifier	 check Override Methods
(	TokenNameLPAREN	
FilterIndexReader	TokenNameIdentifier	 Filter Index Reader
.	TokenNameDOT	
FilterTermEnum	TokenNameIdentifier	 Filter Term Enum
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkOverrideMethods	TokenNameIdentifier	 check Override Methods
(	TokenNameLPAREN	
FilterIndexReader	TokenNameIdentifier	 Filter Index Reader
.	TokenNameDOT	
FilterTermDocs	TokenNameIdentifier	 Filter Term Docs
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: FilterTermPositions should extend correctly, this is borken, 	TokenNameCOMMENT_LINE	TODO: FilterTermPositions should extend correctly, this is borken, 
// but for backwards compatibility we let it be: 	TokenNameCOMMENT_LINE	but for backwards compatibility we let it be: 
// checkOverrideMethods(FilterIndexReader.FilterTermPositions.class); 	TokenNameCOMMENT_LINE	checkOverrideMethods(FilterIndexReader.FilterTermPositions.class); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
