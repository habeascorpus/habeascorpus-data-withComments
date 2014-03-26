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
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileReader	TokenNameIdentifier	 File Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileWriter	TokenNameIdentifier	 File Writer
;	TokenNameSEMICOLON	
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
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringWriter	TokenNameIdentifier	 String Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
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
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
.	TokenNameDOT	
OpenMode	TokenNameIdentifier	 Open Mode
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
_TestUtil	TokenNameIdentifier	 Test Util
;	TokenNameSEMICOLON	
/** JUnit adaptation of an older test case DocTest. */	TokenNameCOMMENT_JAVADOC	 JUnit adaptation of an older test case DocTest. 
public	TokenNamepublic	
class	TokenNameclass	
TestDoc	TokenNameIdentifier	 Test Doc
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
workDir	TokenNameIdentifier	 work Dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
indexDir	TokenNameIdentifier	 index Dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
files	TokenNameIdentifier	 files
;	TokenNameSEMICOLON	
/** Set the test case. This test case needs * a few text files created in the current working directory. */	TokenNameCOMMENT_JAVADOC	 Set the test case. This test case needs a few text files created in the current working directory. 
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
workDir	TokenNameIdentifier	 work Dir
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
getTempDir	TokenNameIdentifier	 get Temp Dir
(	TokenNameLPAREN	
"TestDoc"	TokenNameStringLiteral	TestDoc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
workDir	TokenNameIdentifier	 work Dir
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexDir	TokenNameIdentifier	 index Dir
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
getTempDir	TokenNameIdentifier	 get Temp Dir
(	TokenNameLPAREN	
"testIndex"	TokenNameStringLiteral	testIndex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexDir	TokenNameIdentifier	 index Dir
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
newFSDirectory	TokenNameIdentifier	 new FS Directory
(	TokenNameLPAREN	
indexDir	TokenNameIdentifier	 index Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
"test.txt"	TokenNameStringLiteral	test.txt
,	TokenNameCOMMA	
"This is the first test file"	TokenNameStringLiteral	This is the first test file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
"test2.txt"	TokenNameStringLiteral	test2.txt
,	TokenNameCOMMA	
"This is the second test file"	TokenNameStringLiteral	This is the second test file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FileWriter	TokenNameIdentifier	 File Writer
fw	TokenNameIdentifier	 fw
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
workDir	TokenNameIdentifier	 work Dir
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fw	TokenNameIdentifier	 fw
=	TokenNameEQUAL	
new	TokenNamenew	
FileWriter	TokenNameIdentifier	 File Writer
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
fw	TokenNameIdentifier	 fw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pw	TokenNameIdentifier	 pw
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fw	TokenNameIdentifier	 fw
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
fw	TokenNameIdentifier	 fw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** This test executes a number of merges and compares the contents of * the segments created when using compound file or not using one. * * TODO: the original test used to print the segment contents to System.out * for visual validation. To have the same effect, a new method * checkSegment(String name, ...) should be created that would * assert various things about the segment. */	TokenNameCOMMENT_JAVADOC	 This test executes a number of merges and compares the contents of the segments created when using compound file or not using one. * TODO: the original test used to print the segment contents to System.out for visual validation. To have the same effect, a new method checkSegment(String name, ...) should be created that would assert various things about the segment. 
public	TokenNamepublic	
void	TokenNamevoid	
testIndexAndMerge	TokenNameIdentifier	 test Index And Merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
StringWriter	TokenNameIdentifier	 String Writer
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
sw	TokenNameIdentifier	 sw
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
newFSDirectory	TokenNameIdentifier	 new FS Directory
(	TokenNameLPAREN	
indexDir	TokenNameIdentifier	 index Dir
,	TokenNameCOMMA	
null	TokenNamenull	
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
.	TokenNameDOT	
setOpenMode	TokenNameIdentifier	 set Open Mode
(	TokenNameLPAREN	
OpenMode	TokenNameIdentifier	 Open Mode
.	TokenNameDOT	
CREATE	TokenNameIdentifier	 CREATE
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
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentInfo	TokenNameIdentifier	 Segment Info
si1	TokenNameIdentifier	 si1
=	TokenNameEQUAL	
indexDoc	TokenNameIdentifier	 index Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"test.txt"	TokenNameStringLiteral	test.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSegment	TokenNameIdentifier	 print Segment
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
si1	TokenNameIdentifier	 si1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentInfo	TokenNameIdentifier	 Segment Info
si2	TokenNameIdentifier	 si2
=	TokenNameEQUAL	
indexDoc	TokenNameIdentifier	 index Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"test2.txt"	TokenNameStringLiteral	test2.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSegment	TokenNameIdentifier	 print Segment
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
si2	TokenNameIdentifier	 si2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentInfo	TokenNameIdentifier	 Segment Info
siMerge	TokenNameIdentifier	 si Merge
=	TokenNameEQUAL	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
si1	TokenNameIdentifier	 si1
,	TokenNameCOMMA	
si2	TokenNameIdentifier	 si2
,	TokenNameCOMMA	
"merge"	TokenNameStringLiteral	merge
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSegment	TokenNameIdentifier	 print Segment
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
siMerge	TokenNameIdentifier	 si Merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentInfo	TokenNameIdentifier	 Segment Info
siMerge2	TokenNameIdentifier	 si Merge2
=	TokenNameEQUAL	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
si1	TokenNameIdentifier	 si1
,	TokenNameCOMMA	
si2	TokenNameIdentifier	 si2
,	TokenNameCOMMA	
"merge2"	TokenNameStringLiteral	merge2
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSegment	TokenNameIdentifier	 print Segment
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
siMerge2	TokenNameIdentifier	 si Merge2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentInfo	TokenNameIdentifier	 Segment Info
siMerge3	TokenNameIdentifier	 si Merge3
=	TokenNameEQUAL	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
siMerge	TokenNameIdentifier	 si Merge
,	TokenNameCOMMA	
siMerge2	TokenNameIdentifier	 si Merge2
,	TokenNameCOMMA	
"merge3"	TokenNameStringLiteral	merge3
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSegment	TokenNameIdentifier	 print Segment
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
siMerge3	TokenNameIdentifier	 si Merge3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
multiFileOutput	TokenNameIdentifier	 multi File Output
=	TokenNameEQUAL	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(multiFileOutput); 	TokenNameCOMMENT_LINE	System.out.println(multiFileOutput); 
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
sw	TokenNameIdentifier	 sw
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
newFSDirectory	TokenNameIdentifier	 new FS Directory
(	TokenNameLPAREN	
indexDir	TokenNameIdentifier	 index Dir
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
.	TokenNameDOT	
setOpenMode	TokenNameIdentifier	 set Open Mode
(	TokenNameLPAREN	
OpenMode	TokenNameIdentifier	 Open Mode
.	TokenNameDOT	
CREATE	TokenNameIdentifier	 CREATE
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
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
si1	TokenNameIdentifier	 si1
=	TokenNameEQUAL	
indexDoc	TokenNameIdentifier	 index Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"test.txt"	TokenNameStringLiteral	test.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSegment	TokenNameIdentifier	 print Segment
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
si1	TokenNameIdentifier	 si1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
si2	TokenNameIdentifier	 si2
=	TokenNameEQUAL	
indexDoc	TokenNameIdentifier	 index Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"test2.txt"	TokenNameStringLiteral	test2.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSegment	TokenNameIdentifier	 print Segment
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
si2	TokenNameIdentifier	 si2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
siMerge	TokenNameIdentifier	 si Merge
=	TokenNameEQUAL	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
si1	TokenNameIdentifier	 si1
,	TokenNameCOMMA	
si2	TokenNameIdentifier	 si2
,	TokenNameCOMMA	
"merge"	TokenNameStringLiteral	merge
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSegment	TokenNameIdentifier	 print Segment
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
siMerge	TokenNameIdentifier	 si Merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
siMerge2	TokenNameIdentifier	 si Merge2
=	TokenNameEQUAL	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
si1	TokenNameIdentifier	 si1
,	TokenNameCOMMA	
si2	TokenNameIdentifier	 si2
,	TokenNameCOMMA	
"merge2"	TokenNameStringLiteral	merge2
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSegment	TokenNameIdentifier	 print Segment
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
siMerge2	TokenNameIdentifier	 si Merge2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
siMerge3	TokenNameIdentifier	 si Merge3
=	TokenNameEQUAL	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
siMerge	TokenNameIdentifier	 si Merge
,	TokenNameCOMMA	
siMerge2	TokenNameIdentifier	 si Merge2
,	TokenNameCOMMA	
"merge3"	TokenNameStringLiteral	merge3
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printSegment	TokenNameIdentifier	 print Segment
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
siMerge3	TokenNameIdentifier	 si Merge3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
singleFileOutput	TokenNameIdentifier	 single File Output
=	TokenNameEQUAL	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
multiFileOutput	TokenNameIdentifier	 multi File Output
,	TokenNameCOMMA	
singleFileOutput	TokenNameIdentifier	 single File Output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
SegmentInfo	TokenNameIdentifier	 Segment Info
indexDoc	TokenNameIdentifier	 index Doc
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
workDir	TokenNameIdentifier	 work Dir
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
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
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"contents"	TokenNameStringLiteral	contents
,	TokenNameCOMMA	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
return	TokenNamereturn	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
newestSegment	TokenNameIdentifier	 newest Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
SegmentInfo	TokenNameIdentifier	 Segment Info
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
si1	TokenNameIdentifier	 si1
,	TokenNameCOMMA	
SegmentInfo	TokenNameIdentifier	 Segment Info
si2	TokenNameIdentifier	 si2
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
merged	TokenNameIdentifier	 merged
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useCompoundFile	TokenNameIdentifier	 use Compound File
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SegmentReader	TokenNameIdentifier	 Segment Reader
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
SegmentReader	TokenNameIdentifier	 Segment Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
si1	TokenNameIdentifier	 si1
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
DEFAULT_TERMS_INDEX_DIVISOR	TokenNameIdentifier	 DEFAULT  TERMS  INDEX  DIVISOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentReader	TokenNameIdentifier	 Segment Reader
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
SegmentReader	TokenNameIdentifier	 Segment Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
si2	TokenNameIdentifier	 si2
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
DEFAULT_TERMS_INDEX_DIVISOR	TokenNameIdentifier	 DEFAULT  TERMS  INDEX  DIVISOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentMerger	TokenNameIdentifier	 Segment Merger
merger	TokenNameIdentifier	 merger
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentMerger	TokenNameIdentifier	 Segment Merger
(	TokenNameLPAREN	
si1	TokenNameIdentifier	 si1
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
.	TokenNameDOT	
DEFAULT_TERM_INDEX_INTERVAL	TokenNameIdentifier	 DEFAULT  TERM  INDEX  INTERVAL
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
new	TokenNamenew	
FieldInfos	TokenNameIdentifier	 Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
merger	TokenNameIdentifier	 merger
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
merger	TokenNameIdentifier	 merger
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
r2	TokenNameIdentifier	 r2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
merger	TokenNameIdentifier	 merger
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentInfo	TokenNameIdentifier	 Segment Info
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
,	TokenNameCOMMA	
si1	TokenNameIdentifier	 si1
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
+	TokenNamePLUS	
si2	TokenNameIdentifier	 si2
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
,	TokenNameCOMMA	
si1	TokenNameIdentifier	 si1
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
merger	TokenNameIdentifier	 merger
.	TokenNameDOT	
fieldInfos	TokenNameIdentifier	 field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hasProx	TokenNameIdentifier	 has Prox
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
merger	TokenNameIdentifier	 merger
.	TokenNameDOT	
fieldInfos	TokenNameIdentifier	 field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hasVectors	TokenNameIdentifier	 has Vectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
useCompoundFile	TokenNameIdentifier	 use Compound File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
filesToDelete	TokenNameIdentifier	 files To Delete
=	TokenNameEQUAL	
merger	TokenNameIdentifier	 merger
.	TokenNameDOT	
createCompoundFile	TokenNameIdentifier	 create Compound File
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
+	TokenNamePLUS	
".cfs"	TokenNameStringLiteral	.cfs
,	TokenNameCOMMA	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
setUseCompoundFile	TokenNameIdentifier	 set Use Compound File
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fileToDelete	TokenNameIdentifier	 file To Delete
:	TokenNameCOLON	
filesToDelete	TokenNameIdentifier	 files To Delete
)	TokenNameRPAREN	
si1	TokenNameIdentifier	 si1
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
fileToDelete	TokenNameIdentifier	 file To Delete
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
info	TokenNameIdentifier	 info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
printSegment	TokenNameIdentifier	 print Segment
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
SegmentInfo	TokenNameIdentifier	 Segment Info
si	TokenNameIdentifier	 si
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SegmentReader	TokenNameIdentifier	 Segment Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
SegmentReader	TokenNameIdentifier	 Segment Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
si	TokenNameIdentifier	 si
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
DEFAULT_TERMS_INDEX_DIVISOR	TokenNameIdentifier	 DEFAULT  TERMS  INDEX  DIVISOR
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
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermEnum	TokenNameIdentifier	 Term Enum
tis	TokenNameIdentifier	 tis
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tis	TokenNameIdentifier	 tis
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
tis	TokenNameIdentifier	 tis
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" DF="	TokenNameStringLiteral	 DF=
+	TokenNamePLUS	
tis	TokenNameIdentifier	 tis
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermPositions	TokenNameIdentifier	 Term Positions
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
tis	TokenNameIdentifier	 tis
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" doc="	TokenNameStringLiteral	 doc=
+	TokenNamePLUS	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" TF="	TokenNameStringLiteral	 TF=
+	TokenNamePLUS	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" pos="	TokenNameStringLiteral	 pos=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
tis	TokenNameIdentifier	 tis
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
}	TokenNameRBRACE	
