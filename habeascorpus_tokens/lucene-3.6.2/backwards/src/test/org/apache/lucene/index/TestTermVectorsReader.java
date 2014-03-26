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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SortedSet	TokenNameIdentifier	 Sorted Set
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
*	TokenNameMULTIPLY	
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
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
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
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
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
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
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
TestTermVectorsReader	TokenNameIdentifier	 Test Term Vectors Reader
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
//Must be lexicographically sorted, will do in setup, versus trying to maintain here 	TokenNameCOMMENT_LINE	Must be lexicographically sorted, will do in setup, versus trying to maintain here 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
testFields	TokenNameIdentifier	 test Fields
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"f1"	TokenNameStringLiteral	f1
,	TokenNameCOMMA	
"f2"	TokenNameStringLiteral	f2
,	TokenNameCOMMA	
"f3"	TokenNameStringLiteral	f3
,	TokenNameCOMMA	
"f4"	TokenNameStringLiteral	f4
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
testFieldsStorePos	TokenNameIdentifier	 test Fields Store Pos
=	TokenNameEQUAL	
{	TokenNameLBRACE	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
testFieldsStoreOff	TokenNameIdentifier	 test Fields Store Off
=	TokenNameEQUAL	
{	TokenNameLBRACE	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
testTerms	TokenNameIdentifier	 test Terms
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
testTerms	TokenNameIdentifier	 test Terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
testTerms	TokenNameIdentifier	 test Terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
seg	TokenNameIdentifier	 seg
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
new	TokenNamenew	
FieldInfos	TokenNameIdentifier	 Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
TERM_FREQ	TokenNameIdentifier	 TERM  FREQ
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
class	TokenNameclass	
TestToken	TokenNameIdentifier	 Test Token
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
TestToken	TokenNameIdentifier	 Test Token
>	TokenNameGREATER	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
TestToken	TokenNameIdentifier	 Test Token
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
TestToken	TokenNameIdentifier	 Test Token
[	TokenNameLBRACKET	
testTerms	TokenNameIdentifier	 test Terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
TERM_FREQ	TokenNameIdentifier	 TERM  FREQ
]	TokenNameRBRACKET	
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
/* for (int i = 0; i < testFields.length; i++) { fieldInfos.add(testFields[i], true, true, testFieldsStorePos[i], testFieldsStoreOff[i]); } */	TokenNameCOMMENT_BLOCK	 for (int i = 0; i < testFields.length; i++) { fieldInfos.add(testFields[i], true, true, testFieldsStorePos[i], testFieldsStoreOff[i]); } 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
testTerms	TokenNameIdentifier	 test Terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
tokenUpto	TokenNameIdentifier	 token Upto
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
testTerms	TokenNameIdentifier	 test Terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
positions	TokenNameIdentifier	 positions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
TERM_FREQ	TokenNameIdentifier	 TERM  FREQ
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
TERM_FREQ	TokenNameIdentifier	 TERM  FREQ
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// first position must be 0 	TokenNameCOMMENT_LINE	first position must be 0 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
TERM_FREQ	TokenNameIdentifier	 TERM  FREQ
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// positions are always sorted in increasing order 	TokenNameCOMMENT_LINE	positions are always sorted in increasing order 
positions	TokenNameIdentifier	 positions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
random	TokenNameIdentifier	 random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// offsets are always sorted in increasing order 	TokenNameCOMMENT_LINE	offsets are always sorted in increasing order 
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
+	TokenNamePLUS	
testTerms	TokenNameIdentifier	 test Terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestToken	TokenNameIdentifier	 Test Token
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
[	TokenNameLBRACKET	
tokenUpto	TokenNameIdentifier	 token Upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
TestToken	TokenNameIdentifier	 Test Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
testTerms	TokenNameIdentifier	 test Terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
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
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
MyAnalyzer	TokenNameIdentifier	 My Analyzer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMaxBufferedDocs	TokenNameIdentifier	 set Max Buffered Docs
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
newLogMergePolicy	TokenNameIdentifier	 new Log Merge Policy
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
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
testFields	TokenNameIdentifier	 test Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
TermVector	TokenNameIdentifier	 Term Vector
tv	TokenNameIdentifier	 tv
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testFieldsStorePos	TokenNameIdentifier	 test Fields Store Pos
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&&	TokenNameAND_AND	
testFieldsStoreOff	TokenNameIdentifier	 test Fields Store Off
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
tv	TokenNameIdentifier	 tv
=	TokenNameEQUAL	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
WITH_POSITIONS_OFFSETS	TokenNameIdentifier	 WITH  POSITIONS  OFFSETS
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
testFieldsStorePos	TokenNameIdentifier	 test Fields Store Pos
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&&	TokenNameAND_AND	
!	TokenNameNOT	
testFieldsStoreOff	TokenNameIdentifier	 test Fields Store Off
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
tv	TokenNameIdentifier	 tv
=	TokenNameEQUAL	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
WITH_POSITIONS	TokenNameIdentifier	 WITH  POSITIONS
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
testFieldsStorePos	TokenNameIdentifier	 test Fields Store Pos
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&&	TokenNameAND_AND	
testFieldsStoreOff	TokenNameIdentifier	 test Fields Store Off
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
tv	TokenNameIdentifier	 tv
=	TokenNameEQUAL	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
WITH_OFFSETS	TokenNameIdentifier	 WITH  OFFSETS
;	TokenNameSEMICOLON	
else	TokenNameelse	
tv	TokenNameIdentifier	 tv
=	TokenNameEQUAL	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
testFields	TokenNameIdentifier	 test Fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
,	TokenNameCOMMA	
tv	TokenNameIdentifier	 tv
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Create 5 documents for testing, they all have the same 	TokenNameCOMMENT_LINE	Create 5 documents for testing, they all have the same 
//terms 	TokenNameCOMMENT_LINE	terms 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
seg	TokenNameIdentifier	 seg
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
newestSegment	TokenNameIdentifier	 newest Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
new	TokenNamenew	
FieldInfos	TokenNameIdentifier	 Field Infos
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
FIELD_INFOS_EXTENSION	TokenNameIdentifier	 FIELD  INFOS  EXTENSION
)	TokenNameRPAREN	
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
private	TokenNameprivate	
class	TokenNameclass	
MyTokenStream	TokenNameIdentifier	 My Token Stream
extends	TokenNameextends	
TokenStream	TokenNameIdentifier	 Token Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
tokenUpto	TokenNameIdentifier	 token Upto
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncrAtt	TokenNameIdentifier	 pos Incr Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MyTokenStream	TokenNameIdentifier	 My Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenUpto	TokenNameIdentifier	 token Upto
>=	TokenNameGREATER_EQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
TestToken	TokenNameIdentifier	 Test Token
testToken	TokenNameIdentifier	 test Token
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
[	TokenNameLBRACKET	
tokenUpto	TokenNameIdentifier	 token Upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
testToken	TokenNameIdentifier	 test Token
.	TokenNameDOT	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
testToken	TokenNameIdentifier	 test Token
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
testToken	TokenNameIdentifier	 test Token
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenUpto	TokenNameIdentifier	 token Upto
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
testToken	TokenNameIdentifier	 test Token
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
tokens	TokenNameIdentifier	 tokens
[	TokenNameLBRACKET	
tokenUpto	TokenNameIdentifier	 token Upto
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
testToken	TokenNameIdentifier	 test Token
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tokenUpto	TokenNameIdentifier	 token Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
MyAnalyzer	TokenNameIdentifier	 My Analyzer
extends	TokenNameextends	
Analyzer	TokenNameIdentifier	 Analyzer
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MyTokenStream	TokenNameIdentifier	 My Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test	TokenNameIdentifier	 test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//Check to see the files were created properly in setup 	TokenNameCOMMENT_LINE	Check to see the files were created properly in setup 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
VECTORS_DOCUMENTS_EXTENSION	TokenNameIdentifier	 VECTORS  DOCUMENTS  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
VECTORS_INDEX_EXTENSION	TokenNameIdentifier	 VECTORS  INDEX  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReader	TokenNameIdentifier	 test Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
vector	TokenNameIdentifier	 vector
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
testFields	TokenNameIdentifier	 test Fields
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
vector	TokenNameIdentifier	 vector
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
vector	TokenNameIdentifier	 vector
.	TokenNameDOT	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
testTerms	TokenNameIdentifier	 test Terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
//System.out.println("Term: " + term); 	TokenNameCOMMENT_LINE	System.out.println("Term: " + term); 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
testTerms	TokenNameIdentifier	 test Terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPositionReader	TokenNameIdentifier	 test Position Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermPositionVector	TokenNameIdentifier	 Term Position Vector
vector	TokenNameIdentifier	 vector
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
;	TokenNameSEMICOLON	
vector	TokenNameIdentifier	 vector
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermPositionVector	TokenNameIdentifier	 Term Position Vector
)	TokenNameRPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
testFields	TokenNameIdentifier	 test Fields
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
vector	TokenNameIdentifier	 vector
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
vector	TokenNameIdentifier	 vector
.	TokenNameDOT	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
testTerms	TokenNameIdentifier	 test Terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
//System.out.println("Term: " + term); 	TokenNameCOMMENT_LINE	System.out.println("Term: " + term); 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
testTerms	TokenNameIdentifier	 test Terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
vector	TokenNameIdentifier	 vector
.	TokenNameDOT	
getTermPositions	TokenNameIdentifier	 get Term Positions
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
positions	TokenNameIdentifier	 positions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
positions	TokenNameIdentifier	 positions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
vector	TokenNameIdentifier	 vector
.	TokenNameDOT	
getOffsets	TokenNameIdentifier	 get Offsets
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
offset	TokenNameIdentifier	 offset
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
termVectorOffsetInfo	TokenNameIdentifier	 term Vector Offset Info
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
termVectorOffsetInfo	TokenNameIdentifier	 term Vector Offset Info
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
freqVector	TokenNameIdentifier	 freq Vector
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
testFields	TokenNameIdentifier	 test Fields
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//no pos, no offset 	TokenNameCOMMENT_LINE	no pos, no offset 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
freqVector	TokenNameIdentifier	 freq Vector
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
freqVector	TokenNameIdentifier	 freq Vector
instanceof	TokenNameinstanceof	
TermPositionVector	TokenNameIdentifier	 Term Position Vector
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
freqVector	TokenNameIdentifier	 freq Vector
.	TokenNameDOT	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
testTerms	TokenNameIdentifier	 test Terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
//System.out.println("Term: " + term); 	TokenNameCOMMENT_LINE	System.out.println("Term: " + term); 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
testTerms	TokenNameIdentifier	 test Terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOffsetReader	TokenNameIdentifier	 test Offset Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermPositionVector	TokenNameIdentifier	 Term Position Vector
vector	TokenNameIdentifier	 vector
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermPositionVector	TokenNameIdentifier	 Term Position Vector
)	TokenNameRPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
testFields	TokenNameIdentifier	 test Fields
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
vector	TokenNameIdentifier	 vector
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
vector	TokenNameIdentifier	 vector
.	TokenNameDOT	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
testTerms	TokenNameIdentifier	 test Terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
//System.out.println("Term: " + term); 	TokenNameCOMMENT_LINE	System.out.println("Term: " + term); 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
testTerms	TokenNameIdentifier	 test Terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
vector	TokenNameIdentifier	 vector
.	TokenNameDOT	
getTermPositions	TokenNameIdentifier	 get Term Positions
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
positions	TokenNameIdentifier	 positions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
positions	TokenNameIdentifier	 positions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
vector	TokenNameIdentifier	 vector
.	TokenNameDOT	
getOffsets	TokenNameIdentifier	 get Offsets
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
offset	TokenNameIdentifier	 offset
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
termVectorOffsetInfo	TokenNameIdentifier	 term Vector Offset Info
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
termVectorOffsetInfo	TokenNameIdentifier	 term Vector Offset Info
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMapper	TokenNameIdentifier	 test Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SortedTermVectorMapper	TokenNameIdentifier	 Sorted Term Vector Mapper
mapper	TokenNameIdentifier	 mapper
=	TokenNameEQUAL	
new	TokenNamenew	
SortedTermVectorMapper	TokenNameIdentifier	 Sorted Term Vector Mapper
(	TokenNameLPAREN	
new	TokenNamenew	
TermVectorEntryFreqSortedComparator	TokenNameIdentifier	 Term Vector Entry Freq Sorted Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>	TokenNameGREATER	
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
getTermVectorEntrySet	TokenNameIdentifier	 get Term Vector Entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"set is null and it shouldn't be"	TokenNameStringLiteral	set is null and it shouldn't be
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//three fields, 4 terms, all terms are the same 	TokenNameCOMMENT_LINE	three fields, 4 terms, all terms are the same 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"set Size: "	TokenNameStringLiteral	set Size: 
+	TokenNamePLUS	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" is not: "	TokenNameStringLiteral	 is not: 
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Check offsets and positions 	TokenNameCOMMENT_LINE	Check offsets and positions 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
tve	TokenNameIdentifier	 tve
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tve is null and it shouldn't be"	TokenNameStringLiteral	tve is null and it shouldn't be
,	TokenNameCOMMA	
tve	TokenNameIdentifier	 tve
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tve.getOffsets() is null and it shouldn't be"	TokenNameStringLiteral	tve.getOffsets() is null and it shouldn't be
,	TokenNameCOMMA	
tve	TokenNameIdentifier	 tve
.	TokenNameDOT	
getOffsets	TokenNameIdentifier	 get Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tve.getPositions() is null and it shouldn't be"	TokenNameStringLiteral	tve.getPositions() is null and it shouldn't be
,	TokenNameCOMMA	
tve	TokenNameIdentifier	 tve
.	TokenNameDOT	
getPositions	TokenNameIdentifier	 get Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mapper	TokenNameIdentifier	 mapper
=	TokenNameEQUAL	
new	TokenNamenew	
SortedTermVectorMapper	TokenNameIdentifier	 Sorted Term Vector Mapper
(	TokenNameLPAREN	
new	TokenNamenew	
TermVectorEntryFreqSortedComparator	TokenNameIdentifier	 Term Vector Entry Freq Sorted Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
getTermVectorEntrySet	TokenNameIdentifier	 get Term Vector Entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"set is null and it shouldn't be"	TokenNameStringLiteral	set is null and it shouldn't be
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//three fields, 4 terms, all terms are the same 	TokenNameCOMMENT_LINE	three fields, 4 terms, all terms are the same 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"set Size: "	TokenNameStringLiteral	set Size: 
+	TokenNamePLUS	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" is not: "	TokenNameStringLiteral	 is not: 
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Should have offsets and positions b/c we are munging all the fields together 	TokenNameCOMMENT_LINE	Should have offsets and positions b/c we are munging all the fields together 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
tve	TokenNameIdentifier	 tve
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tve is null and it shouldn't be"	TokenNameStringLiteral	tve is null and it shouldn't be
,	TokenNameCOMMA	
tve	TokenNameIdentifier	 tve
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tve.getOffsets() is null and it shouldn't be"	TokenNameStringLiteral	tve.getOffsets() is null and it shouldn't be
,	TokenNameCOMMA	
tve	TokenNameIdentifier	 tve
.	TokenNameDOT	
getOffsets	TokenNameIdentifier	 get Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tve.getPositions() is null and it shouldn't be"	TokenNameStringLiteral	tve.getPositions() is null and it shouldn't be
,	TokenNameCOMMA	
tve	TokenNameIdentifier	 tve
.	TokenNameDOT	
getPositions	TokenNameIdentifier	 get Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FieldSortedTermVectorMapper	TokenNameIdentifier	 Field Sorted Term Vector Mapper
fsMapper	TokenNameIdentifier	 fs Mapper
=	TokenNameEQUAL	
new	TokenNamenew	
FieldSortedTermVectorMapper	TokenNameIdentifier	 Field Sorted Term Vector Mapper
(	TokenNameLPAREN	
new	TokenNamenew	
TermVectorEntryFreqSortedComparator	TokenNameIdentifier	 Term Vector Entry Freq Sorted Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fsMapper	TokenNameIdentifier	 fs Mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>>	TokenNameRIGHT_SHIFT	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
fsMapper	TokenNameIdentifier	 fs Mapper
.	TokenNameDOT	
getFieldToTerms	TokenNameIdentifier	 get Field To Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"map Size: "	TokenNameStringLiteral	map Size: 
+	TokenNamePLUS	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" is not: "	TokenNameStringLiteral	 is not: 
+	TokenNamePLUS	
testFields	TokenNameIdentifier	 test Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
testFields	TokenNameIdentifier	 test Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>>	TokenNameRIGHT_SHIFT	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>	TokenNameGREATER	
sortedSet	TokenNameIdentifier	 sorted Set
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"sortedSet Size: "	TokenNameStringLiteral	sortedSet Size: 
+	TokenNamePLUS	
sortedSet	TokenNameIdentifier	 sorted Set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" is not: "	TokenNameStringLiteral	 is not: 
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sortedSet	TokenNameIdentifier	 sorted Set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
tve	TokenNameIdentifier	 tve
:	TokenNameCOLON	
sortedSet	TokenNameIdentifier	 sorted Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tve is null and it shouldn't be"	TokenNameStringLiteral	tve is null and it shouldn't be
,	TokenNameCOMMA	
tve	TokenNameIdentifier	 tve
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Check offsets and positions. 	TokenNameCOMMENT_LINE	Check offsets and positions. 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tve is null and it shouldn't be"	TokenNameStringLiteral	tve is null and it shouldn't be
,	TokenNameCOMMA	
tve	TokenNameIdentifier	 tve
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
tve	TokenNameIdentifier	 tve
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
testFields	TokenNameIdentifier	 test Fields
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//should have offsets 	TokenNameCOMMENT_LINE	should have offsets 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tve.getOffsets() is null and it shouldn't be"	TokenNameStringLiteral	tve.getOffsets() is null and it shouldn't be
,	TokenNameCOMMA	
tve	TokenNameIdentifier	 tve
.	TokenNameDOT	
getOffsets	TokenNameIdentifier	 get Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tve.getPositions() is null and it shouldn't be"	TokenNameStringLiteral	tve.getPositions() is null and it shouldn't be
,	TokenNameCOMMA	
tve	TokenNameIdentifier	 tve
.	TokenNameDOT	
getPositions	TokenNameIdentifier	 get Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
testFields	TokenNameIdentifier	 test Fields
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//should not have offsets 	TokenNameCOMMENT_LINE	should not have offsets 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tve.getOffsets() is not null and it shouldn't be"	TokenNameStringLiteral	tve.getOffsets() is not null and it shouldn't be
,	TokenNameCOMMA	
tve	TokenNameIdentifier	 tve
.	TokenNameDOT	
getOffsets	TokenNameIdentifier	 get Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tve.getPositions() is not null and it shouldn't be"	TokenNameStringLiteral	tve.getPositions() is not null and it shouldn't be
,	TokenNameCOMMA	
tve	TokenNameIdentifier	 tve
.	TokenNameDOT	
getPositions	TokenNameIdentifier	 get Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//Try mapper that ignores offs and positions 	TokenNameCOMMENT_LINE	Try mapper that ignores offs and positions 
fsMapper	TokenNameIdentifier	 fs Mapper
=	TokenNameEQUAL	
new	TokenNamenew	
FieldSortedTermVectorMapper	TokenNameIdentifier	 Field Sorted Term Vector Mapper
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
new	TokenNamenew	
TermVectorEntryFreqSortedComparator	TokenNameIdentifier	 Term Vector Entry Freq Sorted Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fsMapper	TokenNameIdentifier	 fs Mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
fsMapper	TokenNameIdentifier	 fs Mapper
.	TokenNameDOT	
getFieldToTerms	TokenNameIdentifier	 get Field To Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"map Size: "	TokenNameStringLiteral	map Size: 
+	TokenNamePLUS	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" is not: "	TokenNameStringLiteral	 is not: 
+	TokenNamePLUS	
testFields	TokenNameIdentifier	 test Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
testFields	TokenNameIdentifier	 test Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>>	TokenNameRIGHT_SHIFT	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>	TokenNameGREATER	
sortedSet	TokenNameIdentifier	 sorted Set
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"sortedSet Size: "	TokenNameStringLiteral	sortedSet Size: 
+	TokenNamePLUS	
sortedSet	TokenNameIdentifier	 sorted Set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" is not: "	TokenNameStringLiteral	 is not: 
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sortedSet	TokenNameIdentifier	 sorted Set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
tve	TokenNameIdentifier	 tve
:	TokenNameCOLON	
sortedSet	TokenNameIdentifier	 sorted Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tve is null and it shouldn't be"	TokenNameStringLiteral	tve is null and it shouldn't be
,	TokenNameCOMMA	
tve	TokenNameIdentifier	 tve
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Check offsets and positions. 	TokenNameCOMMENT_LINE	Check offsets and positions. 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tve is null and it shouldn't be"	TokenNameStringLiteral	tve is null and it shouldn't be
,	TokenNameCOMMA	
tve	TokenNameIdentifier	 tve
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
tve	TokenNameIdentifier	 tve
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
testFields	TokenNameIdentifier	 test Fields
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//should have offsets 	TokenNameCOMMENT_LINE	should have offsets 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tve.getOffsets() is null and it shouldn't be"	TokenNameStringLiteral	tve.getOffsets() is null and it shouldn't be
,	TokenNameCOMMA	
tve	TokenNameIdentifier	 tve
.	TokenNameDOT	
getOffsets	TokenNameIdentifier	 get Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tve.getPositions() is null and it shouldn't be"	TokenNameStringLiteral	tve.getPositions() is null and it shouldn't be
,	TokenNameCOMMA	
tve	TokenNameIdentifier	 tve
.	TokenNameDOT	
getPositions	TokenNameIdentifier	 get Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
testFields	TokenNameIdentifier	 test Fields
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//should not have offsets 	TokenNameCOMMENT_LINE	should not have offsets 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tve.getOffsets() is not null and it shouldn't be"	TokenNameStringLiteral	tve.getOffsets() is not null and it shouldn't be
,	TokenNameCOMMA	
tve	TokenNameIdentifier	 tve
.	TokenNameDOT	
getOffsets	TokenNameIdentifier	 get Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"tve.getPositions() is not null and it shouldn't be"	TokenNameStringLiteral	tve.getPositions() is not null and it shouldn't be
,	TokenNameCOMMA	
tve	TokenNameIdentifier	 tve
.	TokenNameDOT	
getPositions	TokenNameIdentifier	 get Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// test setDocumentNumber() 	TokenNameCOMMENT_LINE	test setDocumentNumber() 
IndexReader	TokenNameIdentifier	 Index Reader
ir	TokenNameIdentifier	 ir
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocNumAwareMapper	TokenNameIdentifier	 Doc Num Aware Mapper
docNumAwareMapper	TokenNameIdentifier	 doc Num Aware Mapper
=	TokenNameEQUAL	
new	TokenNamenew	
DocNumAwareMapper	TokenNameIdentifier	 Doc Num Aware Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docNumAwareMapper	TokenNameIdentifier	 doc Num Aware Mapper
.	TokenNameDOT	
getDocumentNumber	TokenNameIdentifier	 get Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docNumAwareMapper	TokenNameIdentifier	 doc Num Aware Mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docNumAwareMapper	TokenNameIdentifier	 doc Num Aware Mapper
.	TokenNameDOT	
getDocumentNumber	TokenNameIdentifier	 get Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docNumAwareMapper	TokenNameIdentifier	 doc Num Aware Mapper
.	TokenNameDOT	
setDocumentNumber	TokenNameIdentifier	 set Document Number
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docNumAwareMapper	TokenNameIdentifier	 doc Num Aware Mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docNumAwareMapper	TokenNameIdentifier	 doc Num Aware Mapper
.	TokenNameDOT	
getDocumentNumber	TokenNameIdentifier	 get Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docNumAwareMapper	TokenNameIdentifier	 doc Num Aware Mapper
.	TokenNameDOT	
setDocumentNumber	TokenNameIdentifier	 set Document Number
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"f1"	TokenNameStringLiteral	f1
,	TokenNameCOMMA	
docNumAwareMapper	TokenNameIdentifier	 doc Num Aware Mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docNumAwareMapper	TokenNameIdentifier	 doc Num Aware Mapper
.	TokenNameDOT	
getDocumentNumber	TokenNameIdentifier	 get Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docNumAwareMapper	TokenNameIdentifier	 doc Num Aware Mapper
.	TokenNameDOT	
setDocumentNumber	TokenNameIdentifier	 set Document Number
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"f2"	TokenNameStringLiteral	f2
,	TokenNameCOMMA	
docNumAwareMapper	TokenNameIdentifier	 doc Num Aware Mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docNumAwareMapper	TokenNameIdentifier	 doc Num Aware Mapper
.	TokenNameDOT	
getDocumentNumber	TokenNameIdentifier	 get Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docNumAwareMapper	TokenNameIdentifier	 doc Num Aware Mapper
.	TokenNameDOT	
setDocumentNumber	TokenNameIdentifier	 set Document Number
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"f1"	TokenNameStringLiteral	f1
,	TokenNameCOMMA	
docNumAwareMapper	TokenNameIdentifier	 doc Num Aware Mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docNumAwareMapper	TokenNameIdentifier	 doc Num Aware Mapper
.	TokenNameDOT	
getDocumentNumber	TokenNameIdentifier	 get Document Number
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
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Make sure exceptions and bad params are handled appropriately */	TokenNameCOMMENT_JAVADOC	 Make sure exceptions and bad params are handled appropriately 
public	TokenNamepublic	
void	TokenNamevoid	
testBadParams	TokenNameIdentifier	 test Bad Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Bad document number, good field number 	TokenNameCOMMENT_LINE	Bad document number, good field number 
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
testFields	TokenNameIdentifier	 test Fields
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expected exception 	TokenNameCOMMENT_LINE	expected exception 
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
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Bad document number, no field 	TokenNameCOMMENT_LINE	Bad document number, no field 
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expected exception 	TokenNameCOMMENT_LINE	expected exception 
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
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorsReader	TokenNameIdentifier	 Term Vectors Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//good document number, bad field number 	TokenNameCOMMENT_LINE	good document number, bad field number 
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
vector	TokenNameIdentifier	 vector
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"f50"	TokenNameStringLiteral	f50
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
vector	TokenNameIdentifier	 vector
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
DocNumAwareMapper	TokenNameIdentifier	 Doc Num Aware Mapper
extends	TokenNameextends	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
{	TokenNameLBRACE	
public	TokenNamepublic	
DocNumAwareMapper	TokenNameIdentifier	 Doc Num Aware Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
documentNumber	TokenNameIdentifier	 document Number
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setExpectations	TokenNameIdentifier	 set Expectations
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
int	TokenNameint	
numTerms	TokenNameIdentifier	 num Terms
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storeOffsets	TokenNameIdentifier	 store Offsets
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storePositions	TokenNameIdentifier	 store Positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
documentNumber	TokenNameIdentifier	 document Number
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Documentnumber should be set at this point!"	TokenNameStringLiteral	Documentnumber should be set at this point!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
map	TokenNameIdentifier	 map
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
int	TokenNameint	
frequency	TokenNameIdentifier	 frequency
,	TokenNameCOMMA	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
positions	TokenNameIdentifier	 positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
documentNumber	TokenNameIdentifier	 document Number
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Documentnumber should be set at this point!"	TokenNameStringLiteral	Documentnumber should be set at this point!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getDocumentNumber	TokenNameIdentifier	 get Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
documentNumber	TokenNameIdentifier	 document Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentNumber	TokenNameIdentifier	 set Document Number
(	TokenNameLPAREN	
int	TokenNameint	
documentNumber	TokenNameIdentifier	 document Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
documentNumber	TokenNameIdentifier	 document Number
=	TokenNameEQUAL	
documentNumber	TokenNameIdentifier	 document Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
