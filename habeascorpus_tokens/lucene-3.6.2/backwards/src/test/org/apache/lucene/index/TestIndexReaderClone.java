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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
LockObtainFailedException	TokenNameIdentifier	 Lock Obtain Failed Exception
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
/** * Tests cloning multiple types of readers, modifying the deletedDocs and norms * and verifies copy on write semantics of the deletedDocs and norms is * implemented properly */	TokenNameCOMMENT_JAVADOC	 Tests cloning multiple types of readers, modifying the deletedDocs and norms and verifies copy on write semantics of the deletedDocs and norms is implemented properly 
public	TokenNamepublic	
class	TokenNameclass	
TestIndexReaderClone	TokenNameIdentifier	 Test Index Reader Clone
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCloneReadOnlySegmentReader	TokenNameIdentifier	 test Clone Read Only Segment Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
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
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
readOnlyReader	TokenNameIdentifier	 read Only Reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
readOnlyReader	TokenNameIdentifier	 read Only Reader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"reader isn't read only"	TokenNameStringLiteral	reader isn't read only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
deleteWorked	TokenNameIdentifier	 delete Worked
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
readOnlyReader	TokenNameIdentifier	 read Only Reader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"deleting from the original should not have worked"	TokenNameStringLiteral	deleting from the original should not have worked
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readOnlyReader	TokenNameIdentifier	 read Only Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// open non-readOnly reader1, clone to non-readOnly 	TokenNameCOMMENT_LINE	open non-readOnly reader1, clone to non-readOnly 
// reader2, make sure we can change reader2 	TokenNameCOMMENT_LINE	reader2, make sure we can change reader2 
public	TokenNamepublic	
void	TokenNamevoid	
testCloneNoChangesStillReadOnly	TokenNameIdentifier	 test Clone No Changes Still Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
deleteWorked	TokenNameIdentifier	 delete Worked
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
r2	TokenNameIdentifier	 r2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"deleting from the cloned should have worked"	TokenNameStringLiteral	deleting from the cloned should have worked
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// open non-readOnly reader1, clone to non-readOnly 	TokenNameCOMMENT_LINE	open non-readOnly reader1, clone to non-readOnly 
// reader2, make sure we can change reader1 	TokenNameCOMMENT_LINE	reader2, make sure we can change reader1 
public	TokenNamepublic	
void	TokenNamevoid	
testCloneWriteToOrig	TokenNameIdentifier	 test Clone Write To Orig
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
deleteWorked	TokenNameIdentifier	 delete Worked
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
r1	TokenNameIdentifier	 r1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"deleting from the original should have worked"	TokenNameStringLiteral	deleting from the original should have worked
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// open non-readOnly reader1, clone to non-readOnly 	TokenNameCOMMENT_LINE	open non-readOnly reader1, clone to non-readOnly 
// reader2, make sure we can change reader2 	TokenNameCOMMENT_LINE	reader2, make sure we can change reader2 
public	TokenNamepublic	
void	TokenNamevoid	
testCloneWriteToClone	TokenNameIdentifier	 test Clone Write To Clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
deleteWorked	TokenNameIdentifier	 delete Worked
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
r2	TokenNameIdentifier	 r2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"deleting from the original should have worked"	TokenNameStringLiteral	deleting from the original should have worked
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// should fail because reader1 holds the write lock 	TokenNameCOMMENT_LINE	should fail because reader1 holds the write lock 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"first reader should not be able to delete"	TokenNameStringLiteral	first reader should not be able to delete
,	TokenNameCOMMA	
!	TokenNameNOT	
deleteWorked	TokenNameIdentifier	 delete Worked
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
r1	TokenNameIdentifier	 r1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// should fail because we are now stale (reader1 	TokenNameCOMMENT_LINE	should fail because we are now stale (reader1 
// committed changes) 	TokenNameCOMMENT_LINE	committed changes) 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"first reader should not be able to delete"	TokenNameStringLiteral	first reader should not be able to delete
,	TokenNameCOMMA	
!	TokenNameNOT	
deleteWorked	TokenNameIdentifier	 delete Worked
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
r1	TokenNameIdentifier	 r1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create single-segment index, open non-readOnly 	TokenNameCOMMENT_LINE	create single-segment index, open non-readOnly 
// SegmentReader, add docs, reopen to multireader, then do 	TokenNameCOMMENT_LINE	SegmentReader, add docs, reopen to multireader, then do 
// delete 	TokenNameCOMMENT_LINE	delete 
public	TokenNamepublic	
void	TokenNamevoid	
testReopenSegmentReaderToMultiReader	TokenNameIdentifier	 test Reopen Segment Reader To Multi Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader1	TokenNameIdentifier	 reader1
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
modifyIndex	TokenNameIdentifier	 modify Index
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader2	TokenNameIdentifier	 reader2
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
openIfChanged	TokenNameIdentifier	 open If Changed
(	TokenNameLPAREN	
reader1	TokenNameIdentifier	 reader1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
reader2	TokenNameIdentifier	 reader2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
reader1	TokenNameIdentifier	 reader1
!=	TokenNameNOT_EQUAL	
reader2	TokenNameIdentifier	 reader2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
deleteWorked	TokenNameIdentifier	 delete Worked
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
reader2	TokenNameIdentifier	 reader2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader1	TokenNameIdentifier	 reader1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader2	TokenNameIdentifier	 reader2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// open non-readOnly reader1, clone to readOnly reader2 	TokenNameCOMMENT_LINE	open non-readOnly reader1, clone to readOnly reader2 
public	TokenNamepublic	
void	TokenNamevoid	
testCloneWriteableToReadOnly	TokenNameIdentifier	 test Clone Writeable To Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
readOnlyReader	TokenNameIdentifier	 read Only Reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
readOnlyReader	TokenNameIdentifier	 read Only Reader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"reader isn't read only"	TokenNameStringLiteral	reader isn't read only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
deleteWorked	TokenNameIdentifier	 delete Worked
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
readOnlyReader	TokenNameIdentifier	 read Only Reader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"deleting from the original should not have worked"	TokenNameStringLiteral	deleting from the original should not have worked
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this readonly reader shouldn't have a write lock 	TokenNameCOMMENT_LINE	this readonly reader shouldn't have a write lock 
if	TokenNameif	
(	TokenNameLPAREN	
readOnlyReader	TokenNameIdentifier	 read Only Reader
.	TokenNameDOT	
hasChanges	TokenNameIdentifier	 has Changes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"readOnlyReader has a write lock"	TokenNameStringLiteral	readOnlyReader has a write lock
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readOnlyReader	TokenNameIdentifier	 read Only Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// open non-readOnly reader1, reopen to readOnly reader2 	TokenNameCOMMENT_LINE	open non-readOnly reader1, reopen to readOnly reader2 
public	TokenNamepublic	
void	TokenNamevoid	
testReopenWriteableToReadOnly	TokenNameIdentifier	 test Reopen Writeable To Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
docCount	TokenNameIdentifier	 doc Count
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
deleteWorked	TokenNameIdentifier	 delete Worked
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
docCount	TokenNameIdentifier	 doc Count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
readOnlyReader	TokenNameIdentifier	 read Only Reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
openIfChanged	TokenNameIdentifier	 open If Changed
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
readOnlyReader	TokenNameIdentifier	 read Only Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
readOnlyReader	TokenNameIdentifier	 read Only Reader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"reader isn't read only"	TokenNameStringLiteral	reader isn't read only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
deleteWorked	TokenNameIdentifier	 delete Worked
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
readOnlyReader	TokenNameIdentifier	 read Only Reader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
docCount	TokenNameIdentifier	 doc Count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
readOnlyReader	TokenNameIdentifier	 read Only Reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readOnlyReader	TokenNameIdentifier	 read Only Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// open readOnly reader1, clone to non-readOnly reader2 	TokenNameCOMMENT_LINE	open readOnly reader1, clone to non-readOnly reader2 
public	TokenNamepublic	
void	TokenNamevoid	
testCloneReadOnlyToWriteable	TokenNameIdentifier	 test Clone Read Only To Writeable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader1	TokenNameIdentifier	 reader1
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader2	TokenNameIdentifier	 reader2
=	TokenNameEQUAL	
reader1	TokenNameIdentifier	 reader1
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
reader2	TokenNameIdentifier	 reader2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"reader should not be read only"	TokenNameStringLiteral	reader should not be read only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"deleting from the original reader should not have worked"	TokenNameStringLiteral	deleting from the original reader should not have worked
,	TokenNameCOMMA	
deleteWorked	TokenNameIdentifier	 delete Worked
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
reader1	TokenNameIdentifier	 reader1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this readonly reader shouldn't yet have a write lock 	TokenNameCOMMENT_LINE	this readonly reader shouldn't yet have a write lock 
if	TokenNameif	
(	TokenNameLPAREN	
reader2	TokenNameIdentifier	 reader2
.	TokenNameDOT	
hasChanges	TokenNameIdentifier	 has Changes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"cloned reader should not have write lock"	TokenNameStringLiteral	cloned reader should not have write lock
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"deleting from the cloned reader should have worked"	TokenNameStringLiteral	deleting from the cloned reader should have worked
,	TokenNameCOMMA	
deleteWorked	TokenNameIdentifier	 delete Worked
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
reader2	TokenNameIdentifier	 reader2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader1	TokenNameIdentifier	 reader1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader2	TokenNameIdentifier	 reader2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// open non-readOnly reader1 on multi-segment index, then 	TokenNameCOMMENT_LINE	open non-readOnly reader1 on multi-segment index, then 
// fully merge the index, then clone to readOnly reader2 	TokenNameCOMMENT_LINE	fully merge the index, then clone to readOnly reader2 
public	TokenNamepublic	
void	TokenNamevoid	
testReadOnlyCloneAfterFullMerge	TokenNameIdentifier	 test Read Only Clone After Full Merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader1	TokenNameIdentifier	 reader1
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
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
w	TokenNameIdentifier	 w
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader2	TokenNameIdentifier	 reader2
=	TokenNameEQUAL	
reader1	TokenNameIdentifier	 reader1
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
reader2	TokenNameIdentifier	 reader2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader1	TokenNameIdentifier	 reader1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader2	TokenNameIdentifier	 reader2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
deleteWorked	TokenNameIdentifier	 delete Worked
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// trying to delete from the original reader should throw an exception 	TokenNameCOMMENT_LINE	trying to delete from the original reader should throw an exception 
r	TokenNameIdentifier	 r
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCloneReadOnlyDirectoryReader	TokenNameIdentifier	 test Clone Read Only Directory Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
readOnlyReader	TokenNameIdentifier	 read Only Reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
readOnlyReader	TokenNameIdentifier	 read Only Reader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"reader isn't read only"	TokenNameStringLiteral	reader isn't read only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readOnlyReader	TokenNameIdentifier	 read Only Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
instanceof	TokenNameinstanceof	
ReadOnlySegmentReader	TokenNameIdentifier	 Read Only Segment Reader
||	TokenNameOR_OR	
r	TokenNameIdentifier	 r
instanceof	TokenNameinstanceof	
ReadOnlyDirectoryReader	TokenNameIdentifier	 Read Only Directory Reader
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testParallelReader	TokenNameIdentifier	 test Parallel Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir2	TokenNameIdentifier	 dir2
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ParallelReader	TokenNameIdentifier	 Parallel Reader
pr1	TokenNameIdentifier	 pr1
=	TokenNameEQUAL	
new	TokenNamenew	
ParallelReader	TokenNameIdentifier	 Parallel Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pr1	TokenNameIdentifier	 pr1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pr1	TokenNameIdentifier	 pr1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
r2	TokenNameIdentifier	 r2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
performDefaultTests	TokenNameIdentifier	 perform Default Tests
(	TokenNameLPAREN	
pr1	TokenNameIdentifier	 pr1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pr1	TokenNameIdentifier	 pr1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir2	TokenNameIdentifier	 dir2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * 1. Get a norm from the original reader 2. Clone the original reader 3. * Delete a document and set the norm of the cloned reader 4. Verify the norms * are not the same on each reader 5. Verify the doc deleted is only in the * cloned reader 6. Try to delete a document in the original reader, an * exception should be thrown * * @param r1 IndexReader to perform tests on * @throws Exception */	TokenNameCOMMENT_JAVADOC	 1. Get a norm from the original reader 2. Clone the original reader 3. Delete a document and set the norm of the cloned reader 4. Verify the norms are not the same on each reader 5. Verify the doc deleted is only in the cloned reader 6. Try to delete a document in the original reader, an exception should be thrown * @param r1 IndexReader to perform tests on @throws Exception 
private	TokenNameprivate	
void	TokenNamevoid	
performDefaultTests	TokenNameIdentifier	 perform Default Tests
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
r1	TokenNameIdentifier	 r1
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
float	TokenNamefloat	
norm1	TokenNameIdentifier	 norm1
=	TokenNameEQUAL	
Similarity	TokenNameIdentifier	 Similarity
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
decodeNormValue	TokenNameIdentifier	 decode Norm Value
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
"field1"	TokenNameStringLiteral	field1
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
pr1Clone	TokenNameIdentifier	 pr1 Clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
)	TokenNameRPAREN	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pr1Clone	TokenNameIdentifier	 pr1 Clone
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pr1Clone	TokenNameIdentifier	 pr1 Clone
.	TokenNameDOT	
setNorm	TokenNameIdentifier	 set Norm
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"field1"	TokenNameStringLiteral	field1
,	TokenNameCOMMA	
0.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Similarity	TokenNameIdentifier	 Similarity
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
decodeNormValue	TokenNameIdentifier	 decode Norm Value
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
"field1"	TokenNameStringLiteral	field1
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
norm1	TokenNameIdentifier	 norm1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Similarity	TokenNameIdentifier	 Similarity
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
decodeNormValue	TokenNameIdentifier	 decode Norm Value
(	TokenNameLPAREN	
pr1Clone	TokenNameIdentifier	 pr1 Clone
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
"field1"	TokenNameStringLiteral	field1
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
norm1	TokenNameIdentifier	 norm1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
!	TokenNameNOT	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
pr1Clone	TokenNameIdentifier	 pr1 Clone
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// try to update the original reader, which should throw an exception 	TokenNameCOMMENT_LINE	try to update the original reader, which should throw an exception 
try	TokenNametry	
{	TokenNameLBRACE	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
11	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Tried to delete doc 11 and an exception should have been thrown"	TokenNameStringLiteral	Tried to delete doc 11 and an exception should have been thrown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expectted 	TokenNameCOMMENT_LINE	expectted 
}	TokenNameRBRACE	
pr1Clone	TokenNameIdentifier	 pr1 Clone
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMixedReaders	TokenNameIdentifier	 test Mixed Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir2	TokenNameIdentifier	 dir2
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MultiReader	TokenNameIdentifier	 Multi Reader
multiReader	TokenNameIdentifier	 multi Reader
=	TokenNameEQUAL	
new	TokenNamenew	
MultiReader	TokenNameIdentifier	 Multi Reader
(	TokenNameLPAREN	
new	TokenNamenew	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
r1	TokenNameIdentifier	 r1
,	TokenNameCOMMA	
r2	TokenNameIdentifier	 r2
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
performDefaultTests	TokenNameIdentifier	 perform Default Tests
(	TokenNameLPAREN	
multiReader	TokenNameIdentifier	 multi Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
multiReader	TokenNameIdentifier	 multi Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir2	TokenNameIdentifier	 dir2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSegmentReaderUndeleteall	TokenNameIdentifier	 test Segment Reader Undeleteall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentReader	TokenNameIdentifier	 Segment Reader
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
=	TokenNameEQUAL	
SegmentReader	TokenNameIdentifier	 Segment Reader
.	TokenNameDOT	
getOnlySegmentReader	TokenNameIdentifier	 get Only Segment Reader
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDelDocsRefCountEquals	TokenNameIdentifier	 assert Del Docs Ref Count Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
.	TokenNameDOT	
undeleteAll	TokenNameIdentifier	 undelete All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
.	TokenNameDOT	
deletedDocsRef	TokenNameIdentifier	 deleted Docs Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// need to test norms? 	TokenNameCOMMENT_LINE	need to test norms? 
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSegmentReaderCloseReferencing	TokenNameIdentifier	 test Segment Reader Close Referencing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentReader	TokenNameIdentifier	 Segment Reader
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
=	TokenNameEQUAL	
SegmentReader	TokenNameIdentifier	 Segment Reader
.	TokenNameDOT	
getOnlySegmentReader	TokenNameIdentifier	 get Only Segment Reader
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
.	TokenNameDOT	
setNorm	TokenNameIdentifier	 set Norm
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"field1"	TokenNameStringLiteral	field1
,	TokenNameCOMMA	
0.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentReader	TokenNameIdentifier	 Segment Reader
clonedSegmentReader	TokenNameIdentifier	 cloned Segment Reader
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SegmentReader	TokenNameIdentifier	 Segment Reader
)	TokenNameRPAREN	
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDelDocsRefCountEquals	TokenNameIdentifier	 assert Del Docs Ref Count Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDelDocsRefCountEquals	TokenNameIdentifier	 assert Del Docs Ref Count Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check the norm refs 	TokenNameCOMMENT_LINE	check the norm refs 
SegmentNorms	TokenNameIdentifier	 Segment Norms
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
clonedSegmentReader	TokenNameIdentifier	 cloned Segment Reader
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"field1"	TokenNameStringLiteral	field1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
norm	TokenNameIdentifier	 norm
.	TokenNameDOT	
bytesRef	TokenNameIdentifier	 bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clonedSegmentReader	TokenNameIdentifier	 cloned Segment Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSegmentReaderDelDocsReferenceCounting	TokenNameIdentifier	 test Segment Reader Del Docs Reference Counting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
origReader	TokenNameIdentifier	 orig Reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentReader	TokenNameIdentifier	 Segment Reader
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
=	TokenNameEQUAL	
SegmentReader	TokenNameIdentifier	 Segment Reader
.	TokenNameDOT	
getOnlySegmentReader	TokenNameIdentifier	 get Only Segment Reader
(	TokenNameLPAREN	
origReader	TokenNameIdentifier	 orig Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// deletedDocsRef should be null because nothing has updated yet 	TokenNameCOMMENT_LINE	deletedDocsRef should be null because nothing has updated yet 
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
.	TokenNameDOT	
deletedDocsRef	TokenNameIdentifier	 deleted Docs Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we deleted a document, so there is now a deletedDocs bitvector and a 	TokenNameCOMMENT_LINE	we deleted a document, so there is now a deletedDocs bitvector and a 
// reference to it 	TokenNameCOMMENT_LINE	reference to it 
origReader	TokenNameIdentifier	 orig Reader
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDelDocsRefCountEquals	TokenNameIdentifier	 assert Del Docs Ref Count Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the cloned segmentreader should have 2 references, 1 to itself, and 1 to 	TokenNameCOMMENT_LINE	the cloned segmentreader should have 2 references, 1 to itself, and 1 to 
// the original segmentreader 	TokenNameCOMMENT_LINE	the original segmentreader 
IndexReader	TokenNameIdentifier	 Index Reader
clonedReader	TokenNameIdentifier	 cloned Reader
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
)	TokenNameRPAREN	
origReader	TokenNameIdentifier	 orig Reader
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentReader	TokenNameIdentifier	 Segment Reader
clonedSegmentReader	TokenNameIdentifier	 cloned Segment Reader
=	TokenNameEQUAL	
SegmentReader	TokenNameIdentifier	 Segment Reader
.	TokenNameDOT	
getOnlySegmentReader	TokenNameIdentifier	 get Only Segment Reader
(	TokenNameLPAREN	
clonedReader	TokenNameIdentifier	 cloned Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDelDocsRefCountEquals	TokenNameIdentifier	 assert Del Docs Ref Count Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// deleting a document creates a new deletedDocs bitvector, the refs goes to 	TokenNameCOMMENT_LINE	deleting a document creates a new deletedDocs bitvector, the refs goes to 
// 1 	TokenNameCOMMENT_LINE	1 
clonedReader	TokenNameIdentifier	 cloned Reader
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDelDocsRefCountEquals	TokenNameIdentifier	 assert Del Docs Ref Count Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDelDocsRefCountEquals	TokenNameIdentifier	 assert Del Docs Ref Count Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
clonedSegmentReader	TokenNameIdentifier	 cloned Segment Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make sure the deletedocs objects are different (copy 	TokenNameCOMMENT_LINE	make sure the deletedocs objects are different (copy 
// on write) 	TokenNameCOMMENT_LINE	on write) 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
.	TokenNameDOT	
deletedDocs	TokenNameIdentifier	 deleted Docs
!=	TokenNameNOT_EQUAL	
clonedSegmentReader	TokenNameIdentifier	 cloned Segment Reader
.	TokenNameDOT	
deletedDocs	TokenNameIdentifier	 deleted Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDocDeleted	TokenNameIdentifier	 assert Doc Deleted
(	TokenNameLPAREN	
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
,	TokenNameCOMMA	
clonedSegmentReader	TokenNameIdentifier	 cloned Segment Reader
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
!	TokenNameNOT	
origSegmentReader	TokenNameIdentifier	 orig Segment Reader
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// doc 2 should not be deleted 	TokenNameCOMMENT_LINE	doc 2 should not be deleted 
// in original segmentreader 	TokenNameCOMMENT_LINE	in original segmentreader 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
clonedSegmentReader	TokenNameIdentifier	 cloned Segment Reader
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// doc 2 should be deleted in 	TokenNameCOMMENT_LINE	doc 2 should be deleted in 
// cloned segmentreader 	TokenNameCOMMENT_LINE	cloned segmentreader 
// deleting a doc from the original segmentreader should throw an exception 	TokenNameCOMMENT_LINE	deleting a doc from the original segmentreader should throw an exception 
try	TokenNametry	
{	TokenNameLBRACE	
origReader	TokenNameIdentifier	 orig Reader
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"expected exception"	TokenNameStringLiteral	expected exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
LockObtainFailedException	TokenNameIdentifier	 Lock Obtain Failed Exception
lbfe	TokenNameIdentifier	 lbfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expected 	TokenNameCOMMENT_LINE	expected 
}	TokenNameRBRACE	
origReader	TokenNameIdentifier	 orig Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// try closing the original segment reader to see if it affects the 	TokenNameCOMMENT_LINE	try closing the original segment reader to see if it affects the 
// clonedSegmentReader 	TokenNameCOMMENT_LINE	clonedSegmentReader 
clonedReader	TokenNameIdentifier	 cloned Reader
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clonedReader	TokenNameIdentifier	 cloned Reader
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDelDocsRefCountEquals	TokenNameIdentifier	 assert Del Docs Ref Count Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
clonedSegmentReader	TokenNameIdentifier	 cloned Segment Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test a reopened reader 	TokenNameCOMMENT_LINE	test a reopened reader 
IndexReader	TokenNameIdentifier	 Index Reader
reopenedReader	TokenNameIdentifier	 reopened Reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
openIfChanged	TokenNameIdentifier	 open If Changed
(	TokenNameLPAREN	
clonedReader	TokenNameIdentifier	 cloned Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reopenedReader	TokenNameIdentifier	 reopened Reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reopenedReader	TokenNameIdentifier	 reopened Reader
=	TokenNameEQUAL	
clonedReader	TokenNameIdentifier	 cloned Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
cloneReader2	TokenNameIdentifier	 clone Reader2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
)	TokenNameRPAREN	
reopenedReader	TokenNameIdentifier	 reopened Reader
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentReader	TokenNameIdentifier	 Segment Reader
cloneSegmentReader2	TokenNameIdentifier	 clone Segment Reader2
=	TokenNameEQUAL	
SegmentReader	TokenNameIdentifier	 Segment Reader
.	TokenNameDOT	
getOnlySegmentReader	TokenNameIdentifier	 get Only Segment Reader
(	TokenNameLPAREN	
cloneReader2	TokenNameIdentifier	 clone Reader2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDelDocsRefCountEquals	TokenNameIdentifier	 assert Del Docs Ref Count Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cloneSegmentReader2	TokenNameIdentifier	 clone Segment Reader2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clonedReader	TokenNameIdentifier	 cloned Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reopenedReader	TokenNameIdentifier	 reopened Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cloneReader2	TokenNameIdentifier	 clone Reader2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// LUCENE-1648 	TokenNameCOMMENT_LINE	LUCENE-1648 
public	TokenNamepublic	
void	TokenNamevoid	
testCloneWithDeletes	TokenNameIdentifier	 test Clone With Deletes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
origReader	TokenNameIdentifier	 orig Reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
origReader	TokenNameIdentifier	 orig Reader
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
clonedReader	TokenNameIdentifier	 cloned Reader
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
)	TokenNameRPAREN	
origReader	TokenNameIdentifier	 orig Reader
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
origReader	TokenNameIdentifier	 orig Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clonedReader	TokenNameIdentifier	 cloned Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// LUCENE-1648 	TokenNameCOMMENT_LINE	LUCENE-1648 
public	TokenNamepublic	
void	TokenNamevoid	
testCloneWithSetNorm	TokenNameIdentifier	 test Clone With Set Norm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
orig	TokenNameIdentifier	 orig
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
orig	TokenNameIdentifier	 orig
.	TokenNameDOT	
setNorm	TokenNameIdentifier	 set Norm
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"field1"	TokenNameStringLiteral	field1
,	TokenNameCOMMA	
17.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
encoded	TokenNameIdentifier	 encoded
=	TokenNameEQUAL	
Similarity	TokenNameIdentifier	 Similarity
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
encodeNormValue	TokenNameIdentifier	 encode Norm Value
(	TokenNameLPAREN	
17.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
,	TokenNameCOMMA	
orig	TokenNameIdentifier	 orig
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
"field1"	TokenNameStringLiteral	field1
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the cloned segmentreader should have 2 references, 1 to itself, and 1 to 	TokenNameCOMMENT_LINE	the cloned segmentreader should have 2 references, 1 to itself, and 1 to 
// the original segmentreader 	TokenNameCOMMENT_LINE	the original segmentreader 
IndexReader	TokenNameIdentifier	 Index Reader
clonedReader	TokenNameIdentifier	 cloned Reader
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
)	TokenNameRPAREN	
orig	TokenNameIdentifier	 orig
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
orig	TokenNameIdentifier	 orig
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clonedReader	TokenNameIdentifier	 cloned Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
encoded	TokenNameIdentifier	 encoded
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
"field1"	TokenNameStringLiteral	field1
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertDocDeleted	TokenNameIdentifier	 assert Doc Deleted
(	TokenNameLPAREN	
SegmentReader	TokenNameIdentifier	 Segment Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
SegmentReader	TokenNameIdentifier	 Segment Reader
reader2	TokenNameIdentifier	 reader2
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader2	TokenNameIdentifier	 reader2
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertDelDocsRefCountEquals	TokenNameIdentifier	 assert Del Docs Ref Count Equals
(	TokenNameLPAREN	
int	TokenNameint	
refCount	TokenNameIdentifier	 ref Count
,	TokenNameCOMMA	
SegmentReader	TokenNameIdentifier	 Segment Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
refCount	TokenNameIdentifier	 ref Count
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
deletedDocsRef	TokenNameIdentifier	 deleted Docs Ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCloneSubreaders	TokenNameIdentifier	 test Clone Subreaders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// acquire write lock 	TokenNameCOMMENT_LINE	acquire write lock 
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subs	TokenNameIdentifier	 subs
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
subs	TokenNameIdentifier	 subs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
clones	TokenNameIdentifier	 clones
=	TokenNameEQUAL	
new	TokenNamenew	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
subs	TokenNameIdentifier	 subs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
subs	TokenNameIdentifier	 subs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clones	TokenNameIdentifier	 clones
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
)	TokenNameRPAREN	
subs	TokenNameIdentifier	 subs
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
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
subs	TokenNameIdentifier	 subs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clones	TokenNameIdentifier	 clones
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLucene1516Bug	TokenNameIdentifier	 test Lucene1516 Bug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestIndexReaderReopen	TokenNameIdentifier	 Test Index Reader Reopen
.	TokenNameDOT	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCloseStoredFields	TokenNameIdentifier	 test Close Stored Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
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
newLogMergePolicy	TokenNameIdentifier	 new Log Merge Policy
(	TokenNameLPAREN	
false	TokenNamefalse	
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
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"yes it's stored"	TokenNameStringLiteral	yes it's stored
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
w	TokenNameIdentifier	 w
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r1	TokenNameIdentifier	 r1
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
IndexReader	TokenNameIdentifier	 Index Reader
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
r1	TokenNameIdentifier	 r1
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
false	TokenNamefalse	
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
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
