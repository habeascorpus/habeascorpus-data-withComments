package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Closeable	TokenNameIdentifier	 Closeable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IdentityHashMap	TokenNameIdentifier	 Identity Hash Map
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
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
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
ThrottledIndexOutput	TokenNameIdentifier	 Throttled Index Output
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
/** * This is a Directory Wrapper that adds methods * intended to be used only by unit tests. * It also adds a number of features useful for testing: * <ul> * <li> Instances created by {@link LuceneTestCase#newDirectory()} are tracked * to ensure they are closed by the test. * <li> When a MockDirectoryWrapper is closed, it will throw an exception if * it has any open files against it (with a stacktrace indicating where * they were opened from). * <li> When a MockDirectoryWrapper is closed, it runs CheckIndex to test if * the index was corrupted. * <li> MockDirectoryWrapper simulates some "features" of Windows, such as * refusing to write/delete to open files. * </ul> */	TokenNameCOMMENT_JAVADOC	 This is a Directory Wrapper that adds methods intended to be used only by unit tests. It also adds a number of features useful for testing: <ul> <li> Instances created by {@link LuceneTestCase#newDirectory()} are tracked to ensure they are closed by the test. <li> When a MockDirectoryWrapper is closed, it will throw an exception if it has any open files against it (with a stacktrace indicating where they were opened from). <li> When a MockDirectoryWrapper is closed, it runs CheckIndex to test if the index was corrupted. <li> MockDirectoryWrapper simulates some "features" of Windows, such as refusing to write/delete to open files. </ul> 
public	TokenNamepublic	
class	TokenNameclass	
MockDirectoryWrapper	TokenNameIdentifier	 Mock Directory Wrapper
extends	TokenNameextends	
Directory	TokenNameIdentifier	 Directory
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
long	TokenNamelong	
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
// Max actual bytes used. This is set by MockRAMOutputStream: 	TokenNameCOMMENT_LINE	Max actual bytes used. This is set by MockRAMOutputStream: 
long	TokenNamelong	
maxUsedSize	TokenNameIdentifier	 max Used Size
;	TokenNameSEMICOLON	
double	TokenNamedouble	
randomIOExceptionRate	TokenNameIdentifier	 random IO Exception Rate
;	TokenNameSEMICOLON	
Random	TokenNameIdentifier	 Random
randomState	TokenNameIdentifier	 random State
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
noDeleteOpenFile	TokenNameIdentifier	 no Delete Open File
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
preventDoubleWrite	TokenNameIdentifier	 prevent Double Write
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
checkIndexOnClose	TokenNameIdentifier	 check Index On Close
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
trackDiskUsage	TokenNameIdentifier	 track Disk Usage
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
unSyncedFiles	TokenNameIdentifier	 un Synced Files
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
createdFiles	TokenNameIdentifier	 created Files
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
openFilesForWrite	TokenNameIdentifier	 open Files For Write
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
openLocks	TokenNameIdentifier	 open Locks
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
synchronizedSet	TokenNameIdentifier	 synchronized Set
(	TokenNameLPAREN	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
crashed	TokenNameIdentifier	 crashed
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ThrottledIndexOutput	TokenNameIdentifier	 Throttled Index Output
throttledOutput	TokenNameIdentifier	 throttled Output
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Throttling	TokenNameIdentifier	 Throttling
throttling	TokenNameIdentifier	 throttling
=	TokenNameEQUAL	
Throttling	TokenNameIdentifier	 Throttling
.	TokenNameDOT	
SOMETIMES	TokenNameIdentifier	 SOMETIMES
;	TokenNameSEMICOLON	
final	TokenNamefinal	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
inputCloneCount	TokenNameIdentifier	 input Clone Count
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// use this for tracking files for crash. 	TokenNameCOMMENT_LINE	use this for tracking files for crash. 
// additionally: provides debugging information in case you leave one open 	TokenNameCOMMENT_LINE	additionally: provides debugging information in case you leave one open 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Closeable	TokenNameIdentifier	 Closeable
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
openFileHandles	TokenNameIdentifier	 open File Handles
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
synchronizedMap	TokenNameIdentifier	 synchronized Map
(	TokenNameLPAREN	
new	TokenNamenew	
IdentityHashMap	TokenNameIdentifier	 Identity Hash Map
<	TokenNameLESS	
Closeable	TokenNameIdentifier	 Closeable
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NOTE: we cannot initialize the Map here due to the 	TokenNameCOMMENT_LINE	NOTE: we cannot initialize the Map here due to the 
// order in which our constructor actually does this 	TokenNameCOMMENT_LINE	order in which our constructor actually does this 
// member initialization vs when it calls super. It seems 	TokenNameCOMMENT_LINE	member initialization vs when it calls super. It seems 
// like super is called, then our members are initialized: 	TokenNameCOMMENT_LINE	like super is called, then our members are initialized: 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
openFiles	TokenNameIdentifier	 open Files
;	TokenNameSEMICOLON	
// Only tracked if noDeleteOpenFile is true: if an attempt 	TokenNameCOMMENT_LINE	Only tracked if noDeleteOpenFile is true: if an attempt 
// is made to delete an open file, we enroll it here. 	TokenNameCOMMENT_LINE	is made to delete an open file, we enroll it here. 
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
openFilesDeleted	TokenNameIdentifier	 open Files Deleted
;	TokenNameSEMICOLON	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
openFiles	TokenNameIdentifier	 open Files
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
openFiles	TokenNameIdentifier	 open Files
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
openFilesDeleted	TokenNameIdentifier	 open Files Deleted
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
createdFiles	TokenNameIdentifier	 created Files
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
createdFiles	TokenNameIdentifier	 created Files
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
unSyncedFiles	TokenNameIdentifier	 un Synced Files
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
unSyncedFiles	TokenNameIdentifier	 un Synced Files
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MockDirectoryWrapper	TokenNameIdentifier	 Mock Directory Wrapper
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
=	TokenNameEQUAL	
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
// must make a private random since our methods are 	TokenNameCOMMENT_LINE	must make a private random since our methods are 
// called from different threads; else test failures may 	TokenNameCOMMENT_LINE	called from different threads; else test failures may 
// not be reproducible from the original seed 	TokenNameCOMMENT_LINE	not be reproducible from the original seed 
this	TokenNamethis	
.	TokenNameDOT	
randomState	TokenNameIdentifier	 random State
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
throttledOutput	TokenNameIdentifier	 throttled Output
=	TokenNameEQUAL	
new	TokenNamenew	
ThrottledIndexOutput	TokenNameIdentifier	 Throttled Index Output
(	TokenNameLPAREN	
ThrottledIndexOutput	TokenNameIdentifier	 Throttled Index Output
.	TokenNameDOT	
mBitsToBytes	TokenNameIdentifier	 m Bits To Bytes
(	TokenNameLPAREN	
40	TokenNameIntegerLiteral	
+	TokenNamePLUS	
randomState	TokenNameIdentifier	 random State
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
+	TokenNamePLUS	
randomState	TokenNameIdentifier	 random State
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// force wrapping of lockfactory 	TokenNameCOMMENT_LINE	force wrapping of lockfactory 
try	TokenNametry	
{	TokenNameLBRACE	
setLockFactory	TokenNameIdentifier	 set Lock Factory
(	TokenNameLPAREN	
new	TokenNamenew	
MockLockFactoryWrapper	TokenNameIdentifier	 Mock Lock Factory Wrapper
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
getLockFactory	TokenNameIdentifier	 get Lock Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getInputCloneCount	TokenNameIdentifier	 get Input Clone Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
inputCloneCount	TokenNameIdentifier	 input Clone Count
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTrackDiskUsage	TokenNameIdentifier	 set Track Disk Usage
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trackDiskUsage	TokenNameIdentifier	 track Disk Usage
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If set to true, we throw an IOException if the same * file is opened by createOutput, ever. */	TokenNameCOMMENT_JAVADOC	 If set to true, we throw an IOException if the same file is opened by createOutput, ever. 
public	TokenNamepublic	
void	TokenNamevoid	
setPreventDoubleWrite	TokenNameIdentifier	 set Prevent Double Write
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
preventDoubleWrite	TokenNameIdentifier	 prevent Double Write
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
sync	TokenNameIdentifier	 sync
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maybeThrowDeterministicException	TokenNameIdentifier	 maybe Throw Deterministic Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
crashed	TokenNameIdentifier	 crashed
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"cannot sync after crash"	TokenNameStringLiteral	cannot sync after crash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unSyncedFiles	TokenNameIdentifier	 un Synced Files
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
sync	TokenNameIdentifier	 sync
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
Throttling	TokenNameIdentifier	 Throttling
{	TokenNameLBRACE	
/** always emulate a slow hard disk. could be very slow! */	TokenNameCOMMENT_JAVADOC	 always emulate a slow hard disk. could be very slow! 
ALWAYS	TokenNameIdentifier	 ALWAYS
,	TokenNameCOMMA	
/** sometimes (2% of the time) emulate a slow hard disk. */	TokenNameCOMMENT_JAVADOC	 sometimes (2% of the time) emulate a slow hard disk. 
SOMETIMES	TokenNameIdentifier	 SOMETIMES
,	TokenNameCOMMA	
/** never throttle output */	TokenNameCOMMENT_JAVADOC	 never throttle output 
NEVER	TokenNameIdentifier	 NEVER
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setThrottling	TokenNameIdentifier	 set Throttling
(	TokenNameLPAREN	
Throttling	TokenNameIdentifier	 Throttling
throttling	TokenNameIdentifier	 throttling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
throttling	TokenNameIdentifier	 throttling
=	TokenNameEQUAL	
throttling	TokenNameIdentifier	 throttling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
sync	TokenNameIdentifier	 sync
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maybeThrowDeterministicException	TokenNameIdentifier	 maybe Throw Deterministic Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
crashed	TokenNameIdentifier	 crashed
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"cannot sync after crash"	TokenNameStringLiteral	cannot sync after crash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unSyncedFiles	TokenNameIdentifier	 un Synced Files
.	TokenNameDOT	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
sync	TokenNameIdentifier	 sync
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// NOTE: do not maybeYield here, since it consumes 	TokenNameCOMMENT_LINE	NOTE: do not maybeYield here, since it consumes 
// randomness and can thus (unexpectedly during 	TokenNameCOMMENT_LINE	randomness and can thus (unexpectedly during 
// debugging) change the behavior of a seed 	TokenNameCOMMENT_LINE	debugging) change the behavior of a seed 
// maybeYield(); 	TokenNameCOMMENT_LINE	maybeYield(); 
return	TokenNamereturn	
"MockDirWrapper("	TokenNameStringLiteral	MockDirWrapper(
+	TokenNamePLUS	
delegate	TokenNameIdentifier	 delegate
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
final	TokenNamefinal	
long	TokenNamelong	
sizeInBytes	TokenNameIdentifier	 size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
delegate	TokenNameIdentifier	 delegate
instanceof	TokenNameinstanceof	
RAMDirectory	TokenNameIdentifier	 RAM Directory
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RAMDirectory	TokenNameIdentifier	 RAM Directory
)	TokenNameRPAREN	
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
.	TokenNameDOT	
sizeInBytes	TokenNameIdentifier	 size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// hack 	TokenNameCOMMENT_LINE	hack 
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
:	TokenNameCOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
listAll	TokenNameIdentifier	 list All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
fileLength	TokenNameIdentifier	 file Length
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Simulates a crash of OS or machine by overwriting * unsynced files. */	TokenNameCOMMENT_JAVADOC	 Simulates a crash of OS or machine by overwriting unsynced files. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
crash	TokenNameIdentifier	 crash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
crashed	TokenNameIdentifier	 crashed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
openFiles	TokenNameIdentifier	 open Files
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
openFilesForWrite	TokenNameIdentifier	 open Files For Write
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
openFilesDeleted	TokenNameIdentifier	 open Files Deleted
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
unSyncedFiles	TokenNameIdentifier	 un Synced Files
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unSyncedFiles	TokenNameIdentifier	 un Synced Files
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// first force-close all files, so we can corrupt on windows etc. 	TokenNameCOMMENT_LINE	first force-close all files, so we can corrupt on windows etc. 
// clone the file map, as these guys want to remove themselves on close. 	TokenNameCOMMENT_LINE	clone the file map, as these guys want to remove themselves on close. 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Closeable	TokenNameIdentifier	 Closeable
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
IdentityHashMap	TokenNameIdentifier	 Identity Hash Map
<	TokenNameLESS	
Closeable	TokenNameIdentifier	 Closeable
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
(	TokenNameLPAREN	
openFileHandles	TokenNameIdentifier	 open File Handles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Closeable	TokenNameIdentifier	 Closeable
f	TokenNameIdentifier	 f
:	TokenNameCOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
try	TokenNametry	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ignored	TokenNameIdentifier	 ignored
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
%	TokenNameREMAINDER	
3	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
%	TokenNameREMAINDER	
3	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Zero out file entirely 	TokenNameCOMMENT_LINE	Zero out file entirely 
long	TokenNamelong	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fileLength	TokenNameIdentifier	 file Length
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
zeroes	TokenNameIdentifier	 zeroes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
IndexOutput	TokenNameIdentifier	 Index Output
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
<	TokenNameLESS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
upto	TokenNameIdentifier	 upto
,	TokenNameCOMMA	
zeroes	TokenNameIdentifier	 zeroes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
zeroes	TokenNameIdentifier	 zeroes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
+=	TokenNamePLUS_EQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
%	TokenNameREMAINDER	
3	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Truncate the file: 	TokenNameCOMMENT_LINE	Truncate the file: 
IndexOutput	TokenNameIdentifier	 Index Output
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
fileLength	TokenNameIdentifier	 file Length
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
clearCrash	TokenNameIdentifier	 clear Crash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
crashed	TokenNameIdentifier	 crashed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
openLocks	TokenNameIdentifier	 open Locks
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMaxSizeInBytes	TokenNameIdentifier	 set Max Size In Bytes
(	TokenNameLPAREN	
long	TokenNamelong	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxSize	TokenNameIdentifier	 max Size
=	TokenNameEQUAL	
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getMaxSizeInBytes	TokenNameIdentifier	 get Max Size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the peek actual storage used (bytes) in this * directory. */	TokenNameCOMMENT_JAVADOC	 Returns the peek actual storage used (bytes) in this directory. 
public	TokenNamepublic	
long	TokenNamelong	
getMaxUsedSizeInBytes	TokenNameIdentifier	 get Max Used Size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
maxUsedSize	TokenNameIdentifier	 max Used Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
resetMaxUsedSizeInBytes	TokenNameIdentifier	 reset Max Used Size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxUsedSize	TokenNameIdentifier	 max Used Size
=	TokenNameEQUAL	
getRecomputedActualSizeInBytes	TokenNameIdentifier	 get Recomputed Actual Size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Emulate windows whereby deleting an open file is not * allowed (raise IOException). */	TokenNameCOMMENT_JAVADOC	 Emulate windows whereby deleting an open file is not allowed (raise IOException). 
public	TokenNamepublic	
void	TokenNamevoid	
setNoDeleteOpenFile	TokenNameIdentifier	 set No Delete Open File
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
noDeleteOpenFile	TokenNameIdentifier	 no Delete Open File
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getNoDeleteOpenFile	TokenNameIdentifier	 get No Delete Open File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
noDeleteOpenFile	TokenNameIdentifier	 no Delete Open File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether or not checkindex should be run * on close */	TokenNameCOMMENT_JAVADOC	 Set whether or not checkindex should be run on close 
public	TokenNamepublic	
void	TokenNamevoid	
setCheckIndexOnClose	TokenNameIdentifier	 set Check Index On Close
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
checkIndexOnClose	TokenNameIdentifier	 check Index On Close
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getCheckIndexOnClose	TokenNameIdentifier	 get Check Index On Close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
checkIndexOnClose	TokenNameIdentifier	 check Index On Close
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If 0.0, no exceptions will be thrown. Else this should * be a double 0.0 - 1.0. We will randomly throw an * IOException on the first write to an OutputStream based * on this probability. */	TokenNameCOMMENT_JAVADOC	 If 0.0, no exceptions will be thrown. Else this should be a double 0.0 - 1.0. We will randomly throw an IOException on the first write to an OutputStream based on this probability. 
public	TokenNamepublic	
void	TokenNamevoid	
setRandomIOExceptionRate	TokenNameIdentifier	 set Random IO Exception Rate
(	TokenNameLPAREN	
double	TokenNamedouble	
rate	TokenNameIdentifier	 rate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
randomIOExceptionRate	TokenNameIdentifier	 random IO Exception Rate
=	TokenNameEQUAL	
rate	TokenNameIdentifier	 rate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getRandomIOExceptionRate	TokenNameIdentifier	 get Random IO Exception Rate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
randomIOExceptionRate	TokenNameIdentifier	 random IO Exception Rate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
maybeThrowIOException	TokenNameIdentifier	 maybe Throw IO Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
randomIOExceptionRate	TokenNameIdentifier	 random IO Exception Rate
>	TokenNameGREATER	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
randomState	TokenNameIdentifier	 random State
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
<	TokenNameLESS	
randomIOExceptionRate	TokenNameIdentifier	 random IO Exception Rate
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
.	TokenNameDOT	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": MockDirectoryWrapper: now throw random exception"	TokenNameStringLiteral	: MockDirectoryWrapper: now throw random exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
Throwable	TokenNameIdentifier	 Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"a random IOException"	TokenNameStringLiteral	a random IOException
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// sets the cause of the incoming ioe to be the stack 	TokenNameCOMMENT_LINE	sets the cause of the incoming ioe to be the stack 
// trace when the offending file name was opened 	TokenNameCOMMENT_LINE	trace when the offending file name was opened 
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
IOException	TokenNameIdentifier	 IO Exception
fillOpenTrace	TokenNameIdentifier	 fill Open Trace
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Closeable	TokenNameIdentifier	 Closeable
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
ent	TokenNameIdentifier	 ent
:	TokenNameCOLON	
openFileHandles	TokenNameIdentifier	 open File Handles
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
&&	TokenNameAND_AND	
ent	TokenNameIdentifier	 ent
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
MockIndexInputWrapper	TokenNameIdentifier	 Mock Index Input Wrapper
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MockIndexInputWrapper	TokenNameIdentifier	 Mock Index Input Wrapper
)	TokenNameRPAREN	
ent	TokenNameIdentifier	 ent
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
ent	TokenNameIdentifier	 ent
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
input	TokenNameIdentifier	 input
&&	TokenNameAND_AND	
ent	TokenNameIdentifier	 ent
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
MockIndexOutputWrapper	TokenNameIdentifier	 Mock Index Output Wrapper
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MockIndexOutputWrapper	TokenNameIdentifier	 Mock Index Output Wrapper
)	TokenNameRPAREN	
ent	TokenNameIdentifier	 ent
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
ent	TokenNameIdentifier	 ent
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ioe	TokenNameIdentifier	 ioe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
randomState	TokenNameIdentifier	 random State
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
yield	TokenNameIdentifier	 yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
forced	TokenNameIdentifier	 forced
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maybeThrowDeterministicException	TokenNameIdentifier	 maybe Throw Deterministic Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
crashed	TokenNameIdentifier	 crashed
&&	TokenNameAND_AND	
!	TokenNameNOT	
forced	TokenNameIdentifier	 forced
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"cannot delete after crash"	TokenNameStringLiteral	cannot delete after crash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
unSyncedFiles	TokenNameIdentifier	 un Synced Files
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
unSyncedFiles	TokenNameIdentifier	 un Synced Files
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
forced	TokenNameIdentifier	 forced
&&	TokenNameAND_AND	
noDeleteOpenFile	TokenNameIdentifier	 no Delete Open File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
openFiles	TokenNameIdentifier	 open Files
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
openFilesDeleted	TokenNameIdentifier	 open Files Deleted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
fillOpenTrace	TokenNameIdentifier	 fill Open Trace
(	TokenNameLPAREN	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"MockDirectoryWrapper: file ""	TokenNameStringLiteral	MockDirectoryWrapper: file "
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"" is still open: cannot delete"	TokenNameStringLiteral	" is still open: cannot delete
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
openFilesDeleted	TokenNameIdentifier	 open Files Deleted
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getOpenDeletedFiles	TokenNameIdentifier	 get Open Deleted Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
openFilesDeleted	TokenNameIdentifier	 open Files Deleted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
failOnCreateOutput	TokenNameIdentifier	 fail On Create Output
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setFailOnCreateOutput	TokenNameIdentifier	 set Fail On Create Output
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
failOnCreateOutput	TokenNameIdentifier	 fail On Create Output
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
IndexOutput	TokenNameIdentifier	 Index Output
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
failOnCreateOutput	TokenNameIdentifier	 fail On Create Output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maybeThrowDeterministicException	TokenNameIdentifier	 maybe Throw Deterministic Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
crashed	TokenNameIdentifier	 crashed
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"cannot createOutput after crash"	TokenNameStringLiteral	cannot createOutput after crash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
preventDoubleWrite	TokenNameIdentifier	 prevent Double Write
&&	TokenNameAND_AND	
createdFiles	TokenNameIdentifier	 created Files
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"segments.gen"	TokenNameStringLiteral	segments.gen
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"file ""	TokenNameStringLiteral	file "
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"" was already written to"	TokenNameStringLiteral	" was already written to
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
noDeleteOpenFile	TokenNameIdentifier	 no Delete Open File
&&	TokenNameAND_AND	
openFiles	TokenNameIdentifier	 open Files
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"MockDirectoryWrapper: file ""	TokenNameStringLiteral	MockDirectoryWrapper: file "
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"" is still open: cannot overwrite"	TokenNameStringLiteral	" is still open: cannot overwrite
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
crashed	TokenNameIdentifier	 crashed
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"cannot createOutput after crash"	TokenNameStringLiteral	cannot createOutput after crash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unSyncedFiles	TokenNameIdentifier	 un Synced Files
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createdFiles	TokenNameIdentifier	 created Files
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
delegate	TokenNameIdentifier	 delegate
instanceof	TokenNameinstanceof	
RAMDirectory	TokenNameIdentifier	 RAM Directory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RAMDirectory	TokenNameIdentifier	 RAM Directory
ramdir	TokenNameIdentifier	 ramdir
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RAMDirectory	TokenNameIdentifier	 RAM Directory
)	TokenNameRPAREN	
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
RAMFile	TokenNameIdentifier	 RAM File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
RAMFile	TokenNameIdentifier	 RAM File
(	TokenNameLPAREN	
ramdir	TokenNameIdentifier	 ramdir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RAMFile	TokenNameIdentifier	 RAM File
existing	TokenNameIdentifier	 existing
=	TokenNameEQUAL	
ramdir	TokenNameIdentifier	 ramdir
.	TokenNameDOT	
fileMap	TokenNameIdentifier	 file Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Enforce write once: 	TokenNameCOMMENT_LINE	Enforce write once: 
if	TokenNameif	
(	TokenNameLPAREN	
existing	TokenNameIdentifier	 existing
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"segments.gen"	TokenNameStringLiteral	segments.gen
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
preventDoubleWrite	TokenNameIdentifier	 prevent Double Write
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"file "	TokenNameStringLiteral	file 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" already exists"	TokenNameStringLiteral	 already exists
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
existing	TokenNameIdentifier	 existing
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ramdir	TokenNameIdentifier	 ramdir
.	TokenNameDOT	
sizeInBytes	TokenNameIdentifier	 size In Bytes
.	TokenNameDOT	
getAndAdd	TokenNameIdentifier	 get And Add
(	TokenNameLPAREN	
-	TokenNameMINUS	
existing	TokenNameIdentifier	 existing
.	TokenNameDOT	
sizeInBytes	TokenNameIdentifier	 size In Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
existing	TokenNameIdentifier	 existing
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ramdir	TokenNameIdentifier	 ramdir
.	TokenNameDOT	
fileMap	TokenNameIdentifier	 file Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//System.out.println(Thread.currentThread().getName() + ": MDW: create " + name); 	TokenNameCOMMENT_LINE	System.out.println(Thread.currentThread().getName() + ": MDW: create " + name); 
IndexOutput	TokenNameIdentifier	 Index Output
io	TokenNameIdentifier	 io
=	TokenNameEQUAL	
new	TokenNamenew	
MockIndexOutputWrapper	TokenNameIdentifier	 Mock Index Output Wrapper
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addFileHandle	TokenNameIdentifier	 add File Handle
(	TokenNameLPAREN	
io	TokenNameIdentifier	 io
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
openFilesForWrite	TokenNameIdentifier	 open Files For Write
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// throttling REALLY slows down tests, so don't do it very often for SOMETIMES. 	TokenNameCOMMENT_LINE	throttling REALLY slows down tests, so don't do it very often for SOMETIMES. 
if	TokenNameif	
(	TokenNameLPAREN	
throttling	TokenNameIdentifier	 throttling
==	TokenNameEQUAL_EQUAL	
Throttling	TokenNameIdentifier	 Throttling
.	TokenNameDOT	
ALWAYS	TokenNameIdentifier	 ALWAYS
||	TokenNameOR_OR	
(	TokenNameLPAREN	
throttling	TokenNameIdentifier	 throttling
==	TokenNameEQUAL_EQUAL	
Throttling	TokenNameIdentifier	 Throttling
.	TokenNameDOT	
SOMETIMES	TokenNameIdentifier	 SOMETIMES
&&	TokenNameAND_AND	
randomState	TokenNameIdentifier	 random State
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
.	TokenNameDOT	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"MockDirectoryWrapper: throttling indexOutput"	TokenNameStringLiteral	MockDirectoryWrapper: throttling indexOutput
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
throttledOutput	TokenNameIdentifier	 throttled Output
.	TokenNameDOT	
newFromDelegate	TokenNameIdentifier	 new From Delegate
(	TokenNameLPAREN	
io	TokenNameIdentifier	 io
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
io	TokenNameIdentifier	 io
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
addFileHandle	TokenNameIdentifier	 add File Handle
(	TokenNameLPAREN	
Closeable	TokenNameIdentifier	 Closeable
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
openFiles	TokenNameIdentifier	 open Files
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
openFiles	TokenNameIdentifier	 open Files
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
openFiles	TokenNameIdentifier	 open Files
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
openFileHandles	TokenNameIdentifier	 open File Handles
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"unclosed Index"	TokenNameStringLiteral	unclosed Index
+	TokenNamePLUS	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
?	TokenNameQUESTION	
"Input"	TokenNameStringLiteral	Input
:	TokenNameCOLON	
"Output"	TokenNameStringLiteral	Output
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
failOnOpenInput	TokenNameIdentifier	 fail On Open Input
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setFailOnOpenInput	TokenNameIdentifier	 set Fail On Open Input
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
failOnOpenInput	TokenNameIdentifier	 fail On Open Input
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
IndexInput	TokenNameIdentifier	 Index Input
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
failOnOpenInput	TokenNameIdentifier	 fail On Open Input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maybeThrowDeterministicException	TokenNameIdentifier	 maybe Throw Deterministic Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// cannot open a file for input if it's still open for 	TokenNameCOMMENT_LINE	cannot open a file for input if it's still open for 
// output, except for segments.gen and segments_N 	TokenNameCOMMENT_LINE	output, except for segments.gen and segments_N 
if	TokenNameif	
(	TokenNameLPAREN	
openFilesForWrite	TokenNameIdentifier	 open Files For Write
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"segments"	TokenNameStringLiteral	segments
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
fillOpenTrace	TokenNameIdentifier	 fill Open Trace
(	TokenNameLPAREN	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"MockDirectoryWrapper: file ""	TokenNameStringLiteral	MockDirectoryWrapper: file "
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"" is still open for writing"	TokenNameStringLiteral	" is still open for writing
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
IndexInput	TokenNameIdentifier	 Index Input
ii	TokenNameIdentifier	 ii
=	TokenNameEQUAL	
new	TokenNamenew	
MockIndexInputWrapper	TokenNameIdentifier	 Mock Index Input Wrapper
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addFileHandle	TokenNameIdentifier	 add File Handle
(	TokenNameLPAREN	
ii	TokenNameIdentifier	 ii
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ii	TokenNameIdentifier	 ii
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Provided for testing purposes. Use sizeInBytes() instead. */	TokenNameCOMMENT_JAVADOC	 Provided for testing purposes. Use sizeInBytes() instead. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
final	TokenNamefinal	
long	TokenNamelong	
getRecomputedSizeInBytes	TokenNameIdentifier	 get Recomputed Size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
delegate	TokenNameIdentifier	 delegate
instanceof	TokenNameinstanceof	
RAMDirectory	TokenNameIdentifier	 RAM Directory
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
sizeInBytes	TokenNameIdentifier	 size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
RAMFile	TokenNameIdentifier	 RAM File
file	TokenNameIdentifier	 file
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RAMDirectory	TokenNameIdentifier	 RAM Directory
)	TokenNameRPAREN	
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
.	TokenNameDOT	
fileMap	TokenNameIdentifier	 file Map
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getSizeInBytes	TokenNameIdentifier	 get Size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Like getRecomputedSizeInBytes(), but, uses actual file * lengths rather than buffer allocations (which are * quantized up to nearest * RAMOutputStream.BUFFER_SIZE (now 1024) bytes. */	TokenNameCOMMENT_JAVADOC	 Like getRecomputedSizeInBytes(), but, uses actual file lengths rather than buffer allocations (which are quantized up to nearest RAMOutputStream.BUFFER_SIZE (now 1024) bytes. 
public	TokenNamepublic	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
long	TokenNamelong	
getRecomputedActualSizeInBytes	TokenNameIdentifier	 get Recomputed Actual Size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
delegate	TokenNameIdentifier	 delegate
instanceof	TokenNameinstanceof	
RAMDirectory	TokenNameIdentifier	 RAM Directory
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
sizeInBytes	TokenNameIdentifier	 size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
RAMFile	TokenNameIdentifier	 RAM File
file	TokenNameIdentifier	 file
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RAMDirectory	TokenNameIdentifier	 RAM Directory
)	TokenNameRPAREN	
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
.	TokenNameDOT	
fileMap	TokenNameIdentifier	 file Map
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
openFiles	TokenNameIdentifier	 open Files
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
openFiles	TokenNameIdentifier	 open Files
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
openFilesDeleted	TokenNameIdentifier	 open Files Deleted
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
noDeleteOpenFile	TokenNameIdentifier	 no Delete Open File
&&	TokenNameAND_AND	
openFiles	TokenNameIdentifier	 open Files
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// print the first one as its very verbose otherwise 	TokenNameCOMMENT_LINE	print the first one as its very verbose otherwise 
Exception	TokenNameIdentifier	 Exception
cause	TokenNameIdentifier	 cause
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
stacktraces	TokenNameIdentifier	 stacktraces
=	TokenNameEQUAL	
openFileHandles	TokenNameIdentifier	 open File Handles
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stacktraces	TokenNameIdentifier	 stacktraces
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
=	TokenNameEQUAL	
stacktraces	TokenNameIdentifier	 stacktraces
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// RuntimeException instead of IOException because 	TokenNameCOMMENT_LINE	RuntimeException instead of IOException because 
// super() does not throw IOException currently: 	TokenNameCOMMENT_LINE	super() does not throw IOException currently: 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"MockDirectoryWrapper: cannot close: there are still open files: "	TokenNameStringLiteral	MockDirectoryWrapper: cannot close: there are still open files: 
+	TokenNamePLUS	
openFiles	TokenNameIdentifier	 open Files
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
noDeleteOpenFile	TokenNameIdentifier	 no Delete Open File
&&	TokenNameAND_AND	
openLocks	TokenNameIdentifier	 open Locks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"MockDirectoryWrapper: cannot close: there are still open locks: "	TokenNameStringLiteral	MockDirectoryWrapper: cannot close: there are still open locks: 
+	TokenNamePLUS	
openLocks	TokenNameIdentifier	 open Locks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
open	TokenNameIdentifier	 open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
checkIndexOnClose	TokenNameIdentifier	 check Index On Close
&&	TokenNameAND_AND	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
indexExists	TokenNameIdentifier	 index Exists
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
.	TokenNameDOT	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" NOTE: MockDirectoryWrapper: now run CheckIndex"	TokenNameStringLiteral	 NOTE: MockDirectoryWrapper: now run CheckIndex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
checkIndex	TokenNameIdentifier	 check Index
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
removeOpenFile	TokenNameIdentifier	 remove Open File
(	TokenNameLPAREN	
Closeable	TokenNameIdentifier	 Closeable
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
openFiles	TokenNameIdentifier	 open Files
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Could be null when crash() was called 	TokenNameCOMMENT_LINE	Could be null when crash() was called 
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
openFiles	TokenNameIdentifier	 open Files
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
openFilesDeleted	TokenNameIdentifier	 open Files Deleted
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
openFiles	TokenNameIdentifier	 open Files
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
openFileHandles	TokenNameIdentifier	 open File Handles
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
removeIndexOutput	TokenNameIdentifier	 remove Index Output
(	TokenNameLPAREN	
IndexOutput	TokenNameIdentifier	 Index Output
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
openFilesForWrite	TokenNameIdentifier	 open Files For Write
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
removeOpenFile	TokenNameIdentifier	 remove Open File
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
removeIndexInput	TokenNameIdentifier	 remove Index Input
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeOpenFile	TokenNameIdentifier	 remove Open File
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
open	TokenNameIdentifier	 open
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
isOpen	TokenNameIdentifier	 is Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
open	TokenNameIdentifier	 open
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Objects that represent fail-able conditions. Objects of a derived * class are created and registered with the mock directory. After * register, each object will be invoked once for each first write * of a file, giving the object a chance to throw an IOException. */	TokenNameCOMMENT_JAVADOC	 Objects that represent fail-able conditions. Objects of a derived class are created and registered with the mock directory. After register, each object will be invoked once for each first write of a file, giving the object a chance to throw an IOException. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Failure	TokenNameIdentifier	 Failure
{	TokenNameLBRACE	
/** * eval is called on the first write of every new file. */	TokenNameCOMMENT_JAVADOC	 eval is called on the first write of every new file. 
public	TokenNamepublic	
void	TokenNamevoid	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
MockDirectoryWrapper	TokenNameIdentifier	 Mock Directory Wrapper
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * reset should set the state of the failure to its default * (freshly constructed) state. Reset is convenient for tests * that want to create one failure object and then reuse it in * multiple cases. This, combined with the fact that Failure * subclasses are often anonymous classes makes reset difficult to * do otherwise. * * A typical example of use is * Failure failure = new Failure() { ... }; * ... * mock.failOn(failure.reset()) */	TokenNameCOMMENT_JAVADOC	 reset should set the state of the failure to its default (freshly constructed) state. Reset is convenient for tests that want to create one failure object and then reuse it in multiple cases. This, combined with the fact that Failure subclasses are often anonymous classes makes reset difficult to do otherwise. * A typical example of use is Failure failure = new Failure() { ... }; ... mock.failOn(failure.reset()) 
public	TokenNamepublic	
Failure	TokenNameIdentifier	 Failure
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
doFail	TokenNameIdentifier	 do Fail
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setDoFail	TokenNameIdentifier	 set Do Fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doFail	TokenNameIdentifier	 do Fail
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clearDoFail	TokenNameIdentifier	 clear Do Fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doFail	TokenNameIdentifier	 do Fail
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Failure	TokenNameIdentifier	 Failure
>	TokenNameGREATER	
failures	TokenNameIdentifier	 failures
;	TokenNameSEMICOLON	
/** * add a Failure object to the list of objects to be evaluated * at every potential failure point */	TokenNameCOMMENT_JAVADOC	 add a Failure object to the list of objects to be evaluated at every potential failure point 
synchronized	TokenNamesynchronized	
public	TokenNamepublic	
void	TokenNamevoid	
failOn	TokenNameIdentifier	 fail On
(	TokenNameLPAREN	
Failure	TokenNameIdentifier	 Failure
fail	TokenNameIdentifier	 fail
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
failures	TokenNameIdentifier	 failures
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
failures	TokenNameIdentifier	 failures
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Failure	TokenNameIdentifier	 Failure
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
failures	TokenNameIdentifier	 failures
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fail	TokenNameIdentifier	 fail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Iterate through the failures list, giving each object a * chance to throw an IOE */	TokenNameCOMMENT_JAVADOC	 Iterate through the failures list, giving each object a chance to throw an IOE 
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
maybeThrowDeterministicException	TokenNameIdentifier	 maybe Throw Deterministic Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
failures	TokenNameIdentifier	 failures
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
failures	TokenNameIdentifier	 failures
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
failures	TokenNameIdentifier	 failures
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listAll	TokenNameIdentifier	 list All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
listAll	TokenNameIdentifier	 list All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
fileExists	TokenNameIdentifier	 file Exists
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
long	TokenNamelong	
fileModified	TokenNameIdentifier	 file Modified
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
fileModified	TokenNameIdentifier	 file Modified
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
/* @deprecated Lucene never uses this API; it will be * removed in 4.0. */	TokenNameCOMMENT_BLOCK	 @deprecated Lucene never uses this API; it will be removed in 4.0. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
touchFile	TokenNameIdentifier	 touch File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
touchFile	TokenNameIdentifier	 touch File
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
long	TokenNamelong	
fileLength	TokenNameIdentifier	 file Length
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
fileLength	TokenNameIdentifier	 file Length
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Lock	TokenNameIdentifier	 Lock
makeLock	TokenNameIdentifier	 make Lock
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
makeLock	TokenNameIdentifier	 make Lock
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
clearLock	TokenNameIdentifier	 clear Lock
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
clearLock	TokenNameIdentifier	 clear Lock
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setLockFactory	TokenNameIdentifier	 set Lock Factory
(	TokenNameLPAREN	
LockFactory	TokenNameIdentifier	 Lock Factory
lockFactory	TokenNameIdentifier	 lock Factory
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
setLockFactory	TokenNameIdentifier	 set Lock Factory
(	TokenNameLPAREN	
lockFactory	TokenNameIdentifier	 lock Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
LockFactory	TokenNameIdentifier	 Lock Factory
getLockFactory	TokenNameIdentifier	 get Lock Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
getLockFactory	TokenNameIdentifier	 get Lock Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
getLockID	TokenNameIdentifier	 get Lock ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
getLockID	TokenNameIdentifier	 get Lock ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
to	TokenNameIdentifier	 to
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
maybeYield	TokenNameIdentifier	 maybe Yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
