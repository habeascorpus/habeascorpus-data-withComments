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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
IndexInput	TokenNameIdentifier	 Index Input
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
IndexOutput	TokenNameIdentifier	 Index Output
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
MockDirectoryWrapper	TokenNameIdentifier	 Mock Directory Wrapper
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
WhitespaceAnalyzer	TokenNameIdentifier	 Whitespace Analyzer
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/* Verify we can read the pre-2.1 file format, do searches against it, and add documents to it. */	TokenNameCOMMENT_BLOCK	 Verify we can read the pre-2.1 file format, do searches against it, and add documents to it. 
public	TokenNamepublic	
class	TokenNameclass	
TestIndexFileDeleter	TokenNameIdentifier	 Test Index File Deleter
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDeleteLeftoverFiles	TokenNameIdentifier	 test Delete Leftover Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
MockDirectoryWrapper	TokenNameIdentifier	 Mock Directory Wrapper
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
setPreventDoubleWrite	TokenNameIdentifier	 set Prevent Double Write
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
WhitespaceAnalyzer	TokenNameIdentifier	 Whitespace Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMaxBufferedDocs	TokenNameIdentifier	 set Max Buffered Docs
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
mergePolicy	TokenNameIdentifier	 merge Policy
=	TokenNameEQUAL	
newLogMergePolicy	TokenNameIdentifier	 new Log Merge Policy
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergePolicy	TokenNameIdentifier	 merge Policy
.	TokenNameDOT	
setNoCFSRatio	TokenNameIdentifier	 set No CFS Ratio
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This test expects all of its segments to be in CFS 	TokenNameCOMMENT_LINE	This test expects all of its segments to be in CFS 
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
mergePolicy	TokenNameIdentifier	 merge Policy
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
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
mergePolicy	TokenNameIdentifier	 merge Policy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
setInfoStream	TokenNameIdentifier	 set Info Stream
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
?	TokenNameQUESTION	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
35	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mergePolicy	TokenNameIdentifier	 merge Policy
.	TokenNameDOT	
setUseCompoundFile	TokenNameIdentifier	 set Use Compound File
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
45	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Delete one doc so we get a .del file: 	TokenNameCOMMENT_LINE	Delete one doc so we get a .del file: 
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
Term	TokenNameIdentifier	 Term
searchTerm	TokenNameIdentifier	 search Term
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
"7"	TokenNameStringLiteral	7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
deleteDocuments	TokenNameIdentifier	 delete Documents
(	TokenNameLPAREN	
searchTerm	TokenNameIdentifier	 search Term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"didn't delete the right number of documents"	TokenNameStringLiteral	didn't delete the right number of documents
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
delCount	TokenNameIdentifier	 del Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set one norm so we get a .s0 file: 	TokenNameCOMMENT_LINE	Set one norm so we get a .s0 file: 
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setNorm	TokenNameIdentifier	 set Norm
(	TokenNameLPAREN	
21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"content"	TokenNameStringLiteral	content
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
1.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now, artificially create an extra .del file & extra 	TokenNameCOMMENT_LINE	Now, artificially create an extra .del file & extra 
// .s0 file: 	TokenNameCOMMENT_LINE	.s0 file: 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
listAll	TokenNameIdentifier	 list All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* for(int j=0;j<files.length;j++) { System.out.println(j + ": " + files[j]); } */	TokenNameCOMMENT_BLOCK	 for(int j=0;j<files.length;j++) { System.out.println(j + ": " + files[j]); } 
// The numbering of fields can vary depending on which 	TokenNameCOMMENT_LINE	The numbering of fields can vary depending on which 
// JRE is in use. On some JREs we see content bound to 	TokenNameCOMMENT_LINE	JRE is in use. On some JREs we see content bound to 
// field 0; on others, field 1. So, here we have to 	TokenNameCOMMENT_LINE	field 0; on others, field 1. So, here we have to 
// figure out which field number corresponds to 	TokenNameCOMMENT_LINE	figure out which field number corresponds to 
// "content", and then set our expected file names below 	TokenNameCOMMENT_LINE	"content", and then set our expected file names below 
// accordingly: 	TokenNameCOMMENT_LINE	accordingly: 
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
cfsReader	TokenNameIdentifier	 cfs Reader
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"_2.cfs"	TokenNameStringLiteral	_2.cfs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
new	TokenNamenew	
FieldInfos	TokenNameIdentifier	 Field Infos
(	TokenNameLPAREN	
cfsReader	TokenNameIdentifier	 cfs Reader
,	TokenNameCOMMA	
"_2.fnm"	TokenNameStringLiteral	_2.fnm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
contentFieldIndex	TokenNameIdentifier	 content Field Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldInfo	TokenNameIdentifier	 Field Info
fi	TokenNameIdentifier	 fi
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"content"	TokenNameStringLiteral	content
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
contentFieldIndex	TokenNameIdentifier	 content Field Index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
cfsReader	TokenNameIdentifier	 cfs Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"could not locate the 'content' field number in the _2.cfs segment"	TokenNameStringLiteral	could not locate the 'content' field number in the _2.cfs segment
,	TokenNameCOMMA	
contentFieldIndex	TokenNameIdentifier	 content Field Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
normSuffix	TokenNameIdentifier	 norm Suffix
=	TokenNameEQUAL	
"s"	TokenNameStringLiteral	s
+	TokenNamePLUS	
contentFieldIndex	TokenNameIdentifier	 content Field Index
;	TokenNameSEMICOLON	
// Create a bogus separate norms file for a 	TokenNameCOMMENT_LINE	Create a bogus separate norms file for a 
// segment/field that actually has a separate norms file 	TokenNameCOMMENT_LINE	segment/field that actually has a separate norms file 
// already: 	TokenNameCOMMENT_LINE	already: 
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"_2_1."	TokenNameStringLiteral	_2_1.
+	TokenNamePLUS	
normSuffix	TokenNameIdentifier	 norm Suffix
,	TokenNameCOMMA	
"_2_2."	TokenNameStringLiteral	_2_2.
+	TokenNamePLUS	
normSuffix	TokenNameIdentifier	 norm Suffix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a bogus separate norms file for a 	TokenNameCOMMENT_LINE	Create a bogus separate norms file for a 
// segment/field that actually has a separate norms file 	TokenNameCOMMENT_LINE	segment/field that actually has a separate norms file 
// already, using the "not compound file" extension: 	TokenNameCOMMENT_LINE	already, using the "not compound file" extension: 
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"_2_1."	TokenNameStringLiteral	_2_1.
+	TokenNamePLUS	
normSuffix	TokenNameIdentifier	 norm Suffix
,	TokenNameCOMMA	
"_2_2.f"	TokenNameStringLiteral	_2_2.f
+	TokenNamePLUS	
contentFieldIndex	TokenNameIdentifier	 content Field Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a bogus separate norms file for a 	TokenNameCOMMENT_LINE	Create a bogus separate norms file for a 
// segment/field that does not have a separate norms 	TokenNameCOMMENT_LINE	segment/field that does not have a separate norms 
// file already: 	TokenNameCOMMENT_LINE	file already: 
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"_2_1."	TokenNameStringLiteral	_2_1.
+	TokenNamePLUS	
normSuffix	TokenNameIdentifier	 norm Suffix
,	TokenNameCOMMA	
"_1_1."	TokenNameStringLiteral	_1_1.
+	TokenNamePLUS	
normSuffix	TokenNameIdentifier	 norm Suffix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a bogus separate norms file for a 	TokenNameCOMMENT_LINE	Create a bogus separate norms file for a 
// segment/field that does not have a separate norms 	TokenNameCOMMENT_LINE	segment/field that does not have a separate norms 
// file already using the "not compound file" extension: 	TokenNameCOMMENT_LINE	file already using the "not compound file" extension: 
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"_2_1."	TokenNameStringLiteral	_2_1.
+	TokenNamePLUS	
normSuffix	TokenNameIdentifier	 norm Suffix
,	TokenNameCOMMA	
"_1_1.f"	TokenNameStringLiteral	_1_1.f
+	TokenNamePLUS	
contentFieldIndex	TokenNameIdentifier	 content Field Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a bogus separate del file for a 	TokenNameCOMMENT_LINE	Create a bogus separate del file for a 
// segment that already has a separate del file: 	TokenNameCOMMENT_LINE	segment that already has a separate del file: 
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"_0_1.del"	TokenNameStringLiteral	_0_1.del
,	TokenNameCOMMA	
"_0_2.del"	TokenNameStringLiteral	_0_2.del
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a bogus separate del file for a 	TokenNameCOMMENT_LINE	Create a bogus separate del file for a 
// segment that does not yet have a separate del file: 	TokenNameCOMMENT_LINE	segment that does not yet have a separate del file: 
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"_0_1.del"	TokenNameStringLiteral	_0_1.del
,	TokenNameCOMMA	
"_1_1.del"	TokenNameStringLiteral	_1_1.del
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a bogus separate del file for a 	TokenNameCOMMENT_LINE	Create a bogus separate del file for a 
// non-existent segment: 	TokenNameCOMMENT_LINE	non-existent segment: 
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"_0_1.del"	TokenNameStringLiteral	_0_1.del
,	TokenNameCOMMA	
"_188_1.del"	TokenNameStringLiteral	_188_1.del
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a bogus segment file: 	TokenNameCOMMENT_LINE	Create a bogus segment file: 
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"_0.cfs"	TokenNameStringLiteral	_0.cfs
,	TokenNameCOMMA	
"_188.cfs"	TokenNameStringLiteral	_188.cfs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a bogus fnm file when the CFS already exists: 	TokenNameCOMMENT_LINE	Create a bogus fnm file when the CFS already exists: 
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"_0.cfs"	TokenNameStringLiteral	_0.cfs
,	TokenNameCOMMA	
"_0.fnm"	TokenNameStringLiteral	_0.fnm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a deletable file: 	TokenNameCOMMENT_LINE	Create a deletable file: 
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"_0.cfs"	TokenNameStringLiteral	_0.cfs
,	TokenNameCOMMA	
"deletable"	TokenNameStringLiteral	deletable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create some old segments file: 	TokenNameCOMMENT_LINE	Create some old segments file: 
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"segments_2"	TokenNameStringLiteral	segments_2
,	TokenNameCOMMA	
"segments"	TokenNameStringLiteral	segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"segments_2"	TokenNameStringLiteral	segments_2
,	TokenNameCOMMA	
"segments_1"	TokenNameStringLiteral	segments_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a bogus cfs file shadowing a non-cfs segment: 	TokenNameCOMMENT_LINE	Create a bogus cfs file shadowing a non-cfs segment: 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
"_3.fdt"	TokenNameStringLiteral	_3.fdt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
!	TokenNameNOT	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
"_3.cfs"	TokenNameStringLiteral	_3.cfs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"_1.cfs"	TokenNameStringLiteral	_1.cfs
,	TokenNameCOMMA	
"_3.cfs"	TokenNameStringLiteral	_3.cfs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
filesPre	TokenNameIdentifier	 files Pre
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
listAll	TokenNameIdentifier	 list All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Open & close a writer: it should delete the above 4 	TokenNameCOMMENT_LINE	Open & close a writer: it should delete the above 4 
// files and nothing more: 	TokenNameCOMMENT_LINE	files and nothing more: 
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
setOpenMode	TokenNameIdentifier	 set Open Mode
(	TokenNameLPAREN	
OpenMode	TokenNameIdentifier	 Open Mode
.	TokenNameDOT	
APPEND	TokenNameIdentifier	 APPEND
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files2	TokenNameIdentifier	 files2
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
listAll	TokenNameIdentifier	 list All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
files2	TokenNameIdentifier	 files2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
dif	TokenNameIdentifier	 dif
=	TokenNameEQUAL	
difFiles	TokenNameIdentifier	 dif Files
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
,	TokenNameCOMMA	
files2	TokenNameIdentifier	 files2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
,	TokenNameCOMMA	
files2	TokenNameIdentifier	 files2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"IndexFileDeleter failed to delete unreferenced extra files: should have deleted "	TokenNameStringLiteral	IndexFileDeleter failed to delete unreferenced extra files: should have deleted 
+	TokenNamePLUS	
(	TokenNameLPAREN	
filesPre	TokenNameIdentifier	 files Pre
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
+	TokenNamePLUS	
" files but only deleted "	TokenNameStringLiteral	 files but only deleted 
+	TokenNamePLUS	
(	TokenNameLPAREN	
filesPre	TokenNameIdentifier	 files Pre
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
files2	TokenNameIdentifier	 files2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
+	TokenNamePLUS	
"; expected files: "	TokenNameStringLiteral	; expected files: 
+	TokenNamePLUS	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
+	TokenNamePLUS	
" actual files: "	TokenNameStringLiteral	 actual files: 
+	TokenNamePLUS	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
files2	TokenNameIdentifier	 files2
)	TokenNameRPAREN	
+	TokenNamePLUS	
" dif: "	TokenNameStringLiteral	 dif: 
+	TokenNamePLUS	
dif	TokenNameIdentifier	 dif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
difFiles	TokenNameIdentifier	 dif Files
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files1	TokenNameIdentifier	 files1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files2	TokenNameIdentifier	 files2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
set1	TokenNameIdentifier	 set1
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
set2	TokenNameIdentifier	 set2
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
extra	TokenNameIdentifier	 extra
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
files1	TokenNameIdentifier	 files1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
set1	TokenNameIdentifier	 set1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
files1	TokenNameIdentifier	 files1
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
files2	TokenNameIdentifier	 files2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
set2	TokenNameIdentifier	 set2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
files2	TokenNameIdentifier	 files2
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i1	TokenNameIdentifier	 i1
=	TokenNameEQUAL	
set1	TokenNameIdentifier	 set1
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i1	TokenNameIdentifier	 i1
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
i1	TokenNameIdentifier	 i1
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
set2	TokenNameIdentifier	 set2
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extra	TokenNameIdentifier	 extra
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i2	TokenNameIdentifier	 i2
=	TokenNameEQUAL	
set2	TokenNameIdentifier	 set2
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i2	TokenNameIdentifier	 i2
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
i2	TokenNameIdentifier	 i2
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
set1	TokenNameIdentifier	 set1
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extra	TokenNameIdentifier	 extra
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
extra	TokenNameIdentifier	 extra
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
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
l	TokenNameIdentifier	 l
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
+=	TokenNamePLUS_EQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
+=	TokenNamePLUS_EQUAL	
l	TokenNameIdentifier	 l
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
copyFile	TokenNameIdentifier	 copy File
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexInput	TokenNameIdentifier	 Index Input
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexOutput	TokenNameIdentifier	 Index Output
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
1024	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
remainder	TokenNameIdentifier	 remainder
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
remainder	TokenNameIdentifier	 remainder
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
remainder	TokenNameIdentifier	 remainder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
remainder	TokenNameIdentifier	 remainder
-=	TokenNameMINUS_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
in	TokenNameIdentifier	 in
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
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
int	TokenNameint	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
"content"	TokenNameStringLiteral	content
,	TokenNameCOMMA	
"aaa"	TokenNameStringLiteral	aaa
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
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
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
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
