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
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestCheckIndex	TokenNameIdentifier	 Test Check Index
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDeletedDocs	TokenNameIdentifier	 test Deleted Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
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
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMaxBufferedDocs	TokenNameIdentifier	 set Max Buffered Docs
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
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
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"aaa"	TokenNameStringLiteral	aaa
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
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
WITH_POSITIONS_OFFSETS	TokenNameIdentifier	 WITH  POSITIONS  OFFSETS
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
19	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
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
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
bos	TokenNameIdentifier	 bos
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CheckIndex	TokenNameIdentifier	 Check Index
checker	TokenNameIdentifier	 checker
=	TokenNameEQUAL	
new	TokenNamenew	
CheckIndex	TokenNameIdentifier	 Check Index
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checker	TokenNameIdentifier	 checker
.	TokenNameDOT	
setInfoStream	TokenNameIdentifier	 set Info Stream
(	TokenNameLPAREN	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
bos	TokenNameIdentifier	 bos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
checker	TokenNameIdentifier	 checker
.	TokenNameDOT	
setInfoStream	TokenNameIdentifier	 set Info Stream
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CheckIndex	TokenNameIdentifier	 Check Index
.	TokenNameDOT	
Status	TokenNameIdentifier	 Status
indexStatus	TokenNameIdentifier	 index Status
=	TokenNameEQUAL	
checker	TokenNameIdentifier	 checker
.	TokenNameDOT	
checkIndex	TokenNameIdentifier	 check Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexStatus	TokenNameIdentifier	 index Status
.	TokenNameDOT	
clean	TokenNameIdentifier	 clean
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"CheckIndex failed"	TokenNameStringLiteral	CheckIndex failed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
bos	TokenNameIdentifier	 bos
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
CheckIndex	TokenNameIdentifier	 Check Index
.	TokenNameDOT	
Status	TokenNameIdentifier	 Status
.	TokenNameDOT	
SegmentInfoStatus	TokenNameIdentifier	 Segment Info Status
seg	TokenNameIdentifier	 seg
=	TokenNameEQUAL	
indexStatus	TokenNameIdentifier	 index Status
.	TokenNameDOT	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
openReaderPassed	TokenNameIdentifier	 open Reader Passed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
diagnostics	TokenNameIdentifier	 diagnostics
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
fieldNormStatus	TokenNameIdentifier	 field Norm Status
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
fieldNormStatus	TokenNameIdentifier	 field Norm Status
.	TokenNameDOT	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
fieldNormStatus	TokenNameIdentifier	 field Norm Status
.	TokenNameDOT	
totFields	TokenNameIdentifier	 tot Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
termIndexStatus	TokenNameIdentifier	 term Index Status
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
termIndexStatus	TokenNameIdentifier	 term Index Status
.	TokenNameDOT	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
termIndexStatus	TokenNameIdentifier	 term Index Status
.	TokenNameDOT	
termCount	TokenNameIdentifier	 term Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
termIndexStatus	TokenNameIdentifier	 term Index Status
.	TokenNameDOT	
totFreq	TokenNameIdentifier	 tot Freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
termIndexStatus	TokenNameIdentifier	 term Index Status
.	TokenNameDOT	
totPos	TokenNameIdentifier	 tot Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
storedFieldStatus	TokenNameIdentifier	 stored Field Status
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
storedFieldStatus	TokenNameIdentifier	 stored Field Status
.	TokenNameDOT	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
storedFieldStatus	TokenNameIdentifier	 stored Field Status
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
storedFieldStatus	TokenNameIdentifier	 stored Field Status
.	TokenNameDOT	
totFields	TokenNameIdentifier	 tot Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
termVectorStatus	TokenNameIdentifier	 term Vector Status
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
termVectorStatus	TokenNameIdentifier	 term Vector Status
.	TokenNameDOT	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
termVectorStatus	TokenNameIdentifier	 term Vector Status
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
termVectorStatus	TokenNameIdentifier	 term Vector Status
.	TokenNameDOT	
totVectors	TokenNameIdentifier	 tot Vectors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
diagnostics	TokenNameIdentifier	 diagnostics
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
onlySegments	TokenNameIdentifier	 only Segments
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
onlySegments	TokenNameIdentifier	 only Segments
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"_0"	TokenNameStringLiteral	_0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
checker	TokenNameIdentifier	 checker
.	TokenNameDOT	
checkIndex	TokenNameIdentifier	 check Index
(	TokenNameLPAREN	
onlySegments	TokenNameIdentifier	 only Segments
)	TokenNameRPAREN	
.	TokenNameDOT	
clean	TokenNameIdentifier	 clean
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLuceneConstantVersion	TokenNameIdentifier	 test Lucene Constant Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// common-build.xml sets lucene.version 	TokenNameCOMMENT_LINE	common-build.xml sets lucene.version 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"lucene.version"	TokenNameStringLiteral	lucene.version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"null version"	TokenNameStringLiteral	null version
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Invalid version: "	TokenNameStringLiteral	Invalid version: 
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
LUCENE_MAIN_VERSION	TokenNameIdentifier	 LUCENE  MAIN  VERSION
+	TokenNamePLUS	
"-SNAPSHOT"	TokenNameStringLiteral	-SNAPSHOT
)	TokenNameRPAREN	
||	TokenNameOR_OR	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
LUCENE_MAIN_VERSION	TokenNameIdentifier	 LUCENE  MAIN  VERSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
" should start with: "	TokenNameStringLiteral	 should start with: 
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
LUCENE_VERSION	TokenNameIdentifier	 LUCENE  VERSION
,	TokenNameCOMMA	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
LUCENE_VERSION	TokenNameIdentifier	 LUCENE  VERSION
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
