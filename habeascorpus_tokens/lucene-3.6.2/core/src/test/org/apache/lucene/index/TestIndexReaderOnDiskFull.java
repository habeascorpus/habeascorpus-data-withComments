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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
DefaultSimilarity	TokenNameIdentifier	 Default Similarity
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
Similarity	TokenNameIdentifier	 Similarity
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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
RAMDirectory	TokenNameIdentifier	 RAM Directory
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
public	TokenNamepublic	
class	TokenNameclass	
TestIndexReaderOnDiskFull	TokenNameIdentifier	 Test Index Reader On Disk Full
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
/** * Make sure if reader tries to commit but hits disk * full that reader remains consistent and usable. */	TokenNameCOMMENT_JAVADOC	 Make sure if reader tries to commit but hits disk full that reader remains consistent and usable. 
public	TokenNamepublic	
void	TokenNamevoid	
testDiskFull	TokenNameIdentifier	 test Disk Full
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
searchTerm	TokenNameIdentifier	 search Term
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"content"	TokenNameStringLiteral	content
,	TokenNameCOMMA	
"aaa"	TokenNameStringLiteral	aaa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
START_COUNT	TokenNameIdentifier	 START  COUNT
=	TokenNameEQUAL	
157	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
END_COUNT	TokenNameIdentifier	 END  COUNT
=	TokenNameEQUAL	
144	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// First build up a starting index: 	TokenNameCOMMENT_LINE	First build up a starting index: 
MockDirectoryWrapper	TokenNameIdentifier	 Mock Directory Wrapper
startDir	TokenNameIdentifier	 start Dir
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
startDir	TokenNameIdentifier	 start Dir
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
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: create initial index"	TokenNameStringLiteral	TEST: create initial index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
setInfoStream	TokenNameIdentifier	 set Info Stream
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
157	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
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
d	TokenNameIdentifier	 d
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"content"	TokenNameStringLiteral	content
,	TokenNameCOMMA	
"aaa "	TokenNameStringLiteral	aaa 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
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
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
startDir	TokenNameIdentifier	 start Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
searchTerm	TokenNameIdentifier	 search Term
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"exception when init searching: "	TokenNameStringLiteral	exception when init searching: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
diskUsage	TokenNameIdentifier	 disk Usage
=	TokenNameEQUAL	
startDir	TokenNameIdentifier	 start Dir
.	TokenNameDOT	
getRecomputedActualSizeInBytes	TokenNameIdentifier	 get Recomputed Actual Size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
diskFree	TokenNameIdentifier	 disk Free
=	TokenNameEQUAL	
diskUsage	TokenNameIdentifier	 disk Usage
+	TokenNamePLUS	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IOException	TokenNameIdentifier	 IO Exception
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
gotExc	TokenNameIdentifier	 got Exc
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Iterate w/ ever increasing free disk space: 	TokenNameCOMMENT_LINE	Iterate w/ ever increasing free disk space: 
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
done	TokenNameIdentifier	 done
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MockDirectoryWrapper	TokenNameIdentifier	 Mock Directory Wrapper
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
MockDirectoryWrapper	TokenNameIdentifier	 Mock Directory Wrapper
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
startDir	TokenNameIdentifier	 start Dir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If IndexReader hits disk full, it can write to 	TokenNameCOMMENT_LINE	If IndexReader hits disk full, it can write to 
// the same files again. 	TokenNameCOMMENT_LINE	the same files again. 
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
setPreventDoubleWrite	TokenNameIdentifier	 set Prevent Double Write
(	TokenNameLPAREN	
false	TokenNamefalse	
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
// For each disk size, first try to commit against 	TokenNameCOMMENT_LINE	For each disk size, first try to commit against 
// dir that will hit random IOExceptions & disk 	TokenNameCOMMENT_LINE	dir that will hit random IOExceptions & disk 
// full; after, give it infinite disk space & turn 	TokenNameCOMMENT_LINE	full; after, give it infinite disk space & turn 
// off random IOExceptions & retry w/ same reader: 	TokenNameCOMMENT_LINE	off random IOExceptions & retry w/ same reader: 
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
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
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
rate	TokenNameIdentifier	 rate
=	TokenNameEQUAL	
0.05	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
diskRatio	TokenNameIdentifier	 disk Ratio
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
diskFree	TokenNameIdentifier	 disk Free
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
diskUsage	TokenNameIdentifier	 disk Usage
;	TokenNameSEMICOLON	
long	TokenNamelong	
thisDiskFree	TokenNameIdentifier	 this Disk Free
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
testName	TokenNameIdentifier	 test Name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thisDiskFree	TokenNameIdentifier	 this Disk Free
=	TokenNameEQUAL	
diskFree	TokenNameIdentifier	 disk Free
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
diskRatio	TokenNameIdentifier	 disk Ratio
>=	TokenNameGREATER_EQUAL	
2.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rate	TokenNameIdentifier	 rate
/=	TokenNameDIVIDE_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
diskRatio	TokenNameIdentifier	 disk Ratio
>=	TokenNameGREATER_EQUAL	
4.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rate	TokenNameIdentifier	 rate
/=	TokenNameDIVIDE_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
diskRatio	TokenNameIdentifier	 disk Ratio
>=	TokenNameGREATER_EQUAL	
6.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rate	TokenNameIdentifier	 rate
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" cycle: "	TokenNameStringLiteral	 cycle: 
+	TokenNamePLUS	
diskFree	TokenNameIdentifier	 disk Free
+	TokenNamePLUS	
" bytes"	TokenNameStringLiteral	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
testName	TokenNameIdentifier	 test Name
=	TokenNameEQUAL	
"disk full during reader.close() @ "	TokenNameStringLiteral	disk full during reader.close() @ 
+	TokenNamePLUS	
thisDiskFree	TokenNameIdentifier	 this Disk Free
+	TokenNamePLUS	
" bytes"	TokenNameStringLiteral	 bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
thisDiskFree	TokenNameIdentifier	 this Disk Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
rate	TokenNameIdentifier	 rate
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" cycle: same writer: unlimited disk space"	TokenNameStringLiteral	 cycle: same writer: unlimited disk space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
testName	TokenNameIdentifier	 test Name
=	TokenNameEQUAL	
"reader re-use after disk full"	TokenNameStringLiteral	reader re-use after disk full
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
setMaxSizeInBytes	TokenNameIdentifier	 set Max Size In Bytes
(	TokenNameLPAREN	
thisDiskFree	TokenNameIdentifier	 this Disk Free
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
setRandomIOExceptionRate	TokenNameIdentifier	 set Random IO Exception Rate
(	TokenNameLPAREN	
rate	TokenNameIdentifier	 rate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Similarity	TokenNameIdentifier	 Similarity
sim	TokenNameIdentifier	 sim
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultSimilarity	TokenNameIdentifier	 Default Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
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
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
docId	TokenNameIdentifier	 doc Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setNorm	TokenNameIdentifier	 set Norm
(	TokenNameLPAREN	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
"content"	TokenNameStringLiteral	content
,	TokenNameCOMMA	
sim	TokenNameIdentifier	 sim
.	TokenNameDOT	
encodeNormValue	TokenNameIdentifier	 encode Norm Value
(	TokenNameLPAREN	
2.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docId	TokenNameIdentifier	 doc Id
+=	TokenNamePLUS_EQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" hit IOException: "	TokenNameStringLiteral	 hit IOException: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
gotExc	TokenNameIdentifier	 got Exc
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
testName	TokenNameIdentifier	 test Name
+	TokenNamePLUS	
" hit IOException after disk space was freed up"	TokenNameStringLiteral	 hit IOException after disk space was freed up
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Finally, verify index is not corrupt, and, if 	TokenNameCOMMENT_LINE	Finally, verify index is not corrupt, and, if 
// we succeeded, we see all docs changed, and if 	TokenNameCOMMENT_LINE	we succeeded, we see all docs changed, and if 
// we failed, we see either all docs or no docs 	TokenNameCOMMENT_LINE	we failed, we see either all docs or no docs 
// changed (transactional semantics): 	TokenNameCOMMENT_LINE	changed (transactional semantics): 
IndexReader	TokenNameIdentifier	 Index Reader
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
newReader	TokenNameIdentifier	 new Reader
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
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
testName	TokenNameIdentifier	 test Name
+	TokenNamePLUS	
":exception when creating IndexReader after disk full during close: "	TokenNameStringLiteral	:exception when creating IndexReader after disk full during close: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* int result = newReader.docFreq(searchTerm); if (success) { if (result != END_COUNT) { fail(testName + ": method did not throw exception but docFreq('aaa') is " + result + " instead of expected " + END_COUNT); } } else { // On hitting exception we still may have added // all docs: if (result != START_COUNT && result != END_COUNT) { err.printStackTrace(); fail(testName + ": method did throw exception but docFreq('aaa') is " + result + " instead of expected " + START_COUNT + " or " + END_COUNT); } } */	TokenNameCOMMENT_BLOCK	 int result = newReader.docFreq(searchTerm); if (success) { if (result != END_COUNT) { fail(testName + ": method did not throw exception but docFreq('aaa') is " + result + " instead of expected " + END_COUNT); } } else { // On hitting exception we still may have added // all docs: if (result != START_COUNT && result != END_COUNT) { err.printStackTrace(); fail(testName + ": method did throw exception but docFreq('aaa') is " + result + " instead of expected " + START_COUNT + " or " + END_COUNT); } } 
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
newReader	TokenNameIdentifier	 new Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
searchTerm	TokenNameIdentifier	 search Term
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
testName	TokenNameIdentifier	 test Name
+	TokenNamePLUS	
": exception when searching: "	TokenNameStringLiteral	: exception when searching: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
result2	TokenNameIdentifier	 result2
=	TokenNameEQUAL	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result2	TokenNameIdentifier	 result2
!=	TokenNameNOT_EQUAL	
END_COUNT	TokenNameIdentifier	 END  COUNT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
testName	TokenNameIdentifier	 test Name
+	TokenNamePLUS	
": method did not throw exception but hits.length for search on term 'aaa' is "	TokenNameStringLiteral	: method did not throw exception but hits.length for search on term 'aaa' is 
+	TokenNamePLUS	
result2	TokenNameIdentifier	 result2
+	TokenNamePLUS	
" instead of expected "	TokenNameStringLiteral	 instead of expected 
+	TokenNamePLUS	
END_COUNT	TokenNameIdentifier	 END  COUNT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// On hitting exception we still may have added 	TokenNameCOMMENT_LINE	On hitting exception we still may have added 
// all docs: 	TokenNameCOMMENT_LINE	all docs: 
if	TokenNameif	
(	TokenNameLPAREN	
result2	TokenNameIdentifier	 result2
!=	TokenNameNOT_EQUAL	
START_COUNT	TokenNameIdentifier	 START  COUNT
&&	TokenNameAND_AND	
result2	TokenNameIdentifier	 result2
!=	TokenNameNOT_EQUAL	
END_COUNT	TokenNameIdentifier	 END  COUNT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
testName	TokenNameIdentifier	 test Name
+	TokenNamePLUS	
": method did throw exception but hits.length for search on term 'aaa' is "	TokenNameStringLiteral	: method did throw exception but hits.length for search on term 'aaa' is 
+	TokenNamePLUS	
result2	TokenNameIdentifier	 result2
+	TokenNamePLUS	
" instead of expected "	TokenNameStringLiteral	 instead of expected 
+	TokenNamePLUS	
START_COUNT	TokenNameIdentifier	 START  COUNT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newReader	TokenNameIdentifier	 new Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result2	TokenNameIdentifier	 result2
==	TokenNameEQUAL_EQUAL	
END_COUNT	TokenNameIdentifier	 END  COUNT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
gotExc	TokenNameIdentifier	 got Exc
)	TokenNameRPAREN	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"never hit disk full"	TokenNameStringLiteral	never hit disk full
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Try again with more bytes of free space: 	TokenNameCOMMENT_LINE	Try again with more bytes of free space: 
diskFree	TokenNameIdentifier	 disk Free
+=	TokenNamePLUS_EQUAL	
TEST_NIGHTLY	TokenNameIdentifier	 TEST  NIGHTLY
?	TokenNameQUESTION	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
startDir	TokenNameIdentifier	 start Dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
