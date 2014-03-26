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
Closeable	TokenNameIdentifier	 Closeable
;	TokenNameSEMICOLON	
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
BytesRef	TokenNameIdentifier	 Bytes Ref
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
DoubleBarrelLRUCache	TokenNameIdentifier	 Double Barrel LRU Cache
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
CloseableThreadLocal	TokenNameIdentifier	 Closeable Thread Local
;	TokenNameSEMICOLON	
/** This stores a monotonically increasing set of <Term, TermInfo> pairs in a * Directory. Pairs are accessed either by Term or by ordinal position the * set. */	TokenNameCOMMENT_JAVADOC	 This stores a monotonically increasing set of <Term, TermInfo> pairs in a Directory. Pairs are accessed either by Term or by ordinal position the set. 
final	TokenNamefinal	
class	TokenNameclass	
TermInfosReader	TokenNameIdentifier	 Term Infos Reader
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
segment	TokenNameIdentifier	 segment
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CloseableThreadLocal	TokenNameIdentifier	 Closeable Thread Local
<	TokenNameLESS	
ThreadResources	TokenNameIdentifier	 Thread Resources
>	TokenNameGREATER	
threadResources	TokenNameIdentifier	 thread Resources
=	TokenNameEQUAL	
new	TokenNamenew	
CloseableThreadLocal	TokenNameIdentifier	 Closeable Thread Local
<	TokenNameLESS	
ThreadResources	TokenNameIdentifier	 Thread Resources
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
origEnum	TokenNameIdentifier	 orig Enum
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
TermInfosReaderIndex	TokenNameIdentifier	 Term Infos Reader Index
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
indexLength	TokenNameIdentifier	 index Length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
totalIndexInterval	TokenNameIdentifier	 total Index Interval
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
DEFAULT_CACHE_SIZE	TokenNameIdentifier	 DEFAULT  CACHE  SIZE
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Just adds term's ord to TermInfo 	TokenNameCOMMENT_LINE	Just adds term's ord to TermInfo 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
TermInfoAndOrd	TokenNameIdentifier	 Term Info And Ord
extends	TokenNameextends	
TermInfo	TokenNameIdentifier	 Term Info
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
termOrd	TokenNameIdentifier	 term Ord
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TermInfoAndOrd	TokenNameIdentifier	 Term Info And Ord
(	TokenNameLPAREN	
TermInfo	TokenNameIdentifier	 Term Info
ti	TokenNameIdentifier	 ti
,	TokenNameCOMMA	
long	TokenNamelong	
termOrd	TokenNameIdentifier	 term Ord
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
termOrd	TokenNameIdentifier	 term Ord
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termOrd	TokenNameIdentifier	 term Ord
=	TokenNameEQUAL	
termOrd	TokenNameIdentifier	 term Ord
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
CloneableTerm	TokenNameIdentifier	 Cloneable Term
extends	TokenNameextends	
DoubleBarrelLRUCache	TokenNameIdentifier	 Double Barrel LRU Cache
.	TokenNameDOT	
CloneableKey	TokenNameIdentifier	 Cloneable Key
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CloneableTerm	TokenNameIdentifier	 Cloneable Term
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CloneableTerm	TokenNameIdentifier	 Cloneable Term
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
_other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CloneableTerm	TokenNameIdentifier	 Cloneable Term
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CloneableTerm	TokenNameIdentifier	 Cloneable Term
)	TokenNameRPAREN	
_other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
DoubleBarrelLRUCache	TokenNameIdentifier	 Double Barrel LRU Cache
<	TokenNameLESS	
CloneableTerm	TokenNameIdentifier	 Cloneable Term
,	TokenNameCOMMA	
TermInfoAndOrd	TokenNameIdentifier	 Term Info And Ord
>	TokenNameGREATER	
termsCache	TokenNameIdentifier	 terms Cache
=	TokenNameEQUAL	
new	TokenNamenew	
DoubleBarrelLRUCache	TokenNameIdentifier	 Double Barrel LRU Cache
<	TokenNameLESS	
CloneableTerm	TokenNameIdentifier	 Cloneable Term
,	TokenNameCOMMA	
TermInfoAndOrd	TokenNameIdentifier	 Term Info And Ord
>	TokenNameGREATER	
(	TokenNameLPAREN	
DEFAULT_CACHE_SIZE	TokenNameIdentifier	 DEFAULT  CACHE  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Per-thread resources managed by ThreadLocal */	TokenNameCOMMENT_JAVADOC	 Per-thread resources managed by ThreadLocal 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
ThreadResources	TokenNameIdentifier	 Thread Resources
{	TokenNameLBRACE	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
termEnum	TokenNameIdentifier	 term Enum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TermInfosReader	TokenNameIdentifier	 Term Infos Reader
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
seg	TokenNameIdentifier	 seg
,	TokenNameCOMMA	
FieldInfos	TokenNameIdentifier	 Field Infos
fis	TokenNameIdentifier	 fis
,	TokenNameCOMMA	
int	TokenNameint	
readBufferSize	TokenNameIdentifier	 read Buffer Size
,	TokenNameCOMMA	
int	TokenNameint	
indexDivisor	TokenNameIdentifier	 index Divisor
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexDivisor	TokenNameIdentifier	 index Divisor
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
indexDivisor	TokenNameIdentifier	 index Divisor
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"indexDivisor must be -1 (don't load terms index) or greater than 0: got "	TokenNameStringLiteral	indexDivisor must be -1 (don't load terms index) or greater than 0: got 
+	TokenNamePLUS	
indexDivisor	TokenNameIdentifier	 index Divisor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
segment	TokenNameIdentifier	 segment
=	TokenNameEQUAL	
seg	TokenNameIdentifier	 seg
;	TokenNameSEMICOLON	
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
fis	TokenNameIdentifier	 fis
;	TokenNameSEMICOLON	
origEnum	TokenNameIdentifier	 orig Enum
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
TERMS_EXTENSION	TokenNameIdentifier	 TERMS  EXTENSION
)	TokenNameRPAREN	
,	TokenNameCOMMA	
readBufferSize	TokenNameIdentifier	 read Buffer Size
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
origEnum	TokenNameIdentifier	 orig Enum
.	TokenNameDOT	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexDivisor	TokenNameIdentifier	 index Divisor
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Load terms index 	TokenNameCOMMENT_LINE	Load terms index 
totalIndexInterval	TokenNameIdentifier	 total Index Interval
=	TokenNameEQUAL	
origEnum	TokenNameIdentifier	 orig Enum
.	TokenNameDOT	
indexInterval	TokenNameIdentifier	 index Interval
*	TokenNameMULTIPLY	
indexDivisor	TokenNameIdentifier	 index Divisor
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
indexFileName	TokenNameIdentifier	 index File Name
=	TokenNameEQUAL	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
segmentFileName	TokenNameIdentifier	 segment File Name
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
IndexFileNames	TokenNameIdentifier	 Index File Names
.	TokenNameDOT	
TERMS_INDEX_EXTENSION	TokenNameIdentifier	 TERMS  INDEX  EXTENSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
indexEnum	TokenNameIdentifier	 index Enum
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
indexFileName	TokenNameIdentifier	 index File Name
,	TokenNameCOMMA	
readBufferSize	TokenNameIdentifier	 read Buffer Size
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
new	TokenNamenew	
TermInfosReaderIndex	TokenNameIdentifier	 Term Infos Reader Index
(	TokenNameLPAREN	
indexEnum	TokenNameIdentifier	 index Enum
,	TokenNameCOMMA	
indexDivisor	TokenNameIdentifier	 index Divisor
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
fileLength	TokenNameIdentifier	 file Length
(	TokenNameLPAREN	
indexFileName	TokenNameIdentifier	 index File Name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
totalIndexInterval	TokenNameIdentifier	 total Index Interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexLength	TokenNameIdentifier	 index Length
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
indexEnum	TokenNameIdentifier	 index Enum
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Do not load terms index: 	TokenNameCOMMENT_LINE	Do not load terms index: 
totalIndexInterval	TokenNameIdentifier	 total Index Interval
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
indexLength	TokenNameIdentifier	 index Length
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
// With lock-less commits, it's entirely possible (and 	TokenNameCOMMENT_LINE	With lock-less commits, it's entirely possible (and 
// fine) to hit a FileNotFound exception above. In 	TokenNameCOMMENT_LINE	fine) to hit a FileNotFound exception above. In 
// this case, we want to explicitly close any subset 	TokenNameCOMMENT_LINE	this case, we want to explicitly close any subset 
// of things that were opened so that we don't have to 	TokenNameCOMMENT_LINE	of things that were opened so that we don't have to 
// wait for a GC to do so. 	TokenNameCOMMENT_LINE	wait for a GC to do so. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getSkipInterval	TokenNameIdentifier	 get Skip Interval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
origEnum	TokenNameIdentifier	 orig Enum
.	TokenNameDOT	
skipInterval	TokenNameIdentifier	 skip Interval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMaxSkipLevels	TokenNameIdentifier	 get Max Skip Levels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
origEnum	TokenNameIdentifier	 orig Enum
.	TokenNameDOT	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
origEnum	TokenNameIdentifier	 orig Enum
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
origEnum	TokenNameIdentifier	 orig Enum
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
threadResources	TokenNameIdentifier	 thread Resources
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the number of term/value pairs in the set. */	TokenNameCOMMENT_JAVADOC	 Returns the number of term/value pairs in the set. 
final	TokenNamefinal	
long	TokenNamelong	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ThreadResources	TokenNameIdentifier	 Thread Resources
getThreadResources	TokenNameIdentifier	 get Thread Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ThreadResources	TokenNameIdentifier	 Thread Resources
resources	TokenNameIdentifier	 resources
=	TokenNameEQUAL	
threadResources	TokenNameIdentifier	 thread Resources
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resources	TokenNameIdentifier	 resources
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resources	TokenNameIdentifier	 resources
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadResources	TokenNameIdentifier	 Thread Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
termEnum	TokenNameIdentifier	 term Enum
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
threadResources	TokenNameIdentifier	 thread Resources
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
resources	TokenNameIdentifier	 resources
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
resources	TokenNameIdentifier	 resources
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the TermInfo for a Term in the set, or null. */	TokenNameCOMMENT_JAVADOC	 Returns the TermInfo for a Term in the set, or null. 
TermInfo	TokenNameIdentifier	 Term Info
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BytesRef	TokenNameIdentifier	 Bytes Ref
termBytesRef	TokenNameIdentifier	 term Bytes Ref
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
termBytesRef	TokenNameIdentifier	 term Bytes Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the TermInfo for a Term in the set, or null. */	TokenNameCOMMENT_JAVADOC	 Returns the TermInfo for a Term in the set, or null. 
private	TokenNameprivate	
TermInfo	TokenNameIdentifier	 Term Info
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
boolean	TokenNameboolean	
mustSeekEnum	TokenNameIdentifier	 must Seek Enum
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
termBytesRef	TokenNameIdentifier	 term Bytes Ref
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ensureIndexIsRead	TokenNameIdentifier	 ensure Index Is Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
CloneableTerm	TokenNameIdentifier	 Cloneable Term
cacheKey	TokenNameIdentifier	 cache Key
=	TokenNameEQUAL	
new	TokenNamenew	
CloneableTerm	TokenNameIdentifier	 Cloneable Term
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermInfoAndOrd	TokenNameIdentifier	 Term Info And Ord
tiOrd	TokenNameIdentifier	 ti Ord
=	TokenNameEQUAL	
termsCache	TokenNameIdentifier	 terms Cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
cacheKey	TokenNameIdentifier	 cache Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ThreadResources	TokenNameIdentifier	 Thread Resources
resources	TokenNameIdentifier	 resources
=	TokenNameEQUAL	
getThreadResources	TokenNameIdentifier	 get Thread Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
mustSeekEnum	TokenNameIdentifier	 must Seek Enum
&&	TokenNameAND_AND	
tiOrd	TokenNameIdentifier	 ti Ord
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tiOrd	TokenNameIdentifier	 ti Ord
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// optimize sequential access: first try scanning cached enum w/o seeking 	TokenNameCOMMENT_LINE	optimize sequential access: first try scanning cached enum w/o seeking 
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
enumerator	TokenNameIdentifier	 enumerator
=	TokenNameEQUAL	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
termEnum	TokenNameIdentifier	 term Enum
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
// term is at or past current 	TokenNameCOMMENT_LINE	term is at or past current 
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
prev	TokenNameIdentifier	 prev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
prev	TokenNameIdentifier	 prev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
enumOffset	TokenNameIdentifier	 enum Offset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
position	TokenNameIdentifier	 position
/	TokenNameDIVIDE	
totalIndexInterval	TokenNameIdentifier	 total Index Interval
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexLength	TokenNameIdentifier	 index Length
==	TokenNameEQUAL_EQUAL	
enumOffset	TokenNameIdentifier	 enum Offset
// but before end of block 	TokenNameCOMMENT_LINE	but before end of block 
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
termBytesRef	TokenNameIdentifier	 term Bytes Ref
,	TokenNameCOMMA	
enumOffset	TokenNameIdentifier	 enum Offset
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no need to seek 	TokenNameCOMMENT_LINE	no need to seek 
final	TokenNamefinal	
TermInfo	TokenNameIdentifier	 Term Info
ti	TokenNameIdentifier	 ti
;	TokenNameSEMICOLON	
int	TokenNameint	
numScans	TokenNameIdentifier	 num Scans
=	TokenNameEQUAL	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
scanTo	TokenNameIdentifier	 scan To
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
termInfo	TokenNameIdentifier	 term Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numScans	TokenNameIdentifier	 num Scans
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we only want to put this TermInfo into the cache if 	TokenNameCOMMENT_LINE	we only want to put this TermInfo into the cache if 
// scanEnum skipped more than one dictionary entry. 	TokenNameCOMMENT_LINE	scanEnum skipped more than one dictionary entry. 
// This prevents RangeQueries or WildcardQueries to 	TokenNameCOMMENT_LINE	This prevents RangeQueries or WildcardQueries to 
// wipe out the cache when they iterate over a large numbers 	TokenNameCOMMENT_LINE	wipe out the cache when they iterate over a large numbers 
// of terms in order 	TokenNameCOMMENT_LINE	of terms in order 
if	TokenNameif	
(	TokenNameLPAREN	
tiOrd	TokenNameIdentifier	 ti Ord
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termsCache	TokenNameIdentifier	 terms Cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
cacheKey	TokenNameIdentifier	 cache Key
,	TokenNameCOMMA	
new	TokenNamenew	
TermInfoAndOrd	TokenNameIdentifier	 Term Info And Ord
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
,	TokenNameCOMMA	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
sameTermInfo	TokenNameIdentifier	 same Term Info
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
,	TokenNameCOMMA	
tiOrd	TokenNameIdentifier	 ti Ord
,	TokenNameCOMMA	
enumerator	TokenNameIdentifier	 enumerator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
tiOrd	TokenNameIdentifier	 ti Ord
.	TokenNameDOT	
termOrd	TokenNameIdentifier	 term Ord
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ti	TokenNameIdentifier	 ti
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// random-access: must seek 	TokenNameCOMMENT_LINE	random-access: must seek 
final	TokenNamefinal	
int	TokenNameint	
indexPos	TokenNameIdentifier	 index Pos
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tiOrd	TokenNameIdentifier	 ti Ord
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indexPos	TokenNameIdentifier	 index Pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
tiOrd	TokenNameIdentifier	 ti Ord
.	TokenNameDOT	
termOrd	TokenNameIdentifier	 term Ord
/	TokenNameDIVIDE	
totalIndexInterval	TokenNameIdentifier	 total Index Interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Must do binary search: 	TokenNameCOMMENT_LINE	Must do binary search: 
indexPos	TokenNameIdentifier	 index Pos
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getIndexOffset	TokenNameIdentifier	 get Index Offset
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
termBytesRef	TokenNameIdentifier	 term Bytes Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
seekEnum	TokenNameIdentifier	 seek Enum
(	TokenNameLPAREN	
enumerator	TokenNameIdentifier	 enumerator
,	TokenNameCOMMA	
indexPos	TokenNameIdentifier	 index Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
scanTo	TokenNameIdentifier	 scan To
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TermInfo	TokenNameIdentifier	 Term Info
ti	TokenNameIdentifier	 ti
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
termInfo	TokenNameIdentifier	 term Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tiOrd	TokenNameIdentifier	 ti Ord
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termsCache	TokenNameIdentifier	 terms Cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
cacheKey	TokenNameIdentifier	 cache Key
,	TokenNameCOMMA	
new	TokenNamenew	
TermInfoAndOrd	TokenNameIdentifier	 Term Info And Ord
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
,	TokenNameCOMMA	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
sameTermInfo	TokenNameIdentifier	 same Term Info
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
,	TokenNameCOMMA	
tiOrd	TokenNameIdentifier	 ti Ord
,	TokenNameCOMMA	
enumerator	TokenNameIdentifier	 enumerator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
tiOrd	TokenNameIdentifier	 ti Ord
.	TokenNameDOT	
termOrd	TokenNameIdentifier	 term Ord
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ti	TokenNameIdentifier	 ti
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// called only from asserts 	TokenNameCOMMENT_LINE	called only from asserts 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
sameTermInfo	TokenNameIdentifier	 same Term Info
(	TokenNameLPAREN	
TermInfo	TokenNameIdentifier	 Term Info
ti1	TokenNameIdentifier	 ti1
,	TokenNameCOMMA	
TermInfo	TokenNameIdentifier	 Term Info
ti2	TokenNameIdentifier	 ti2
,	TokenNameCOMMA	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
enumerator	TokenNameIdentifier	 enumerator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ti1	TokenNameIdentifier	 ti1
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
!=	TokenNameNOT_EQUAL	
ti2	TokenNameIdentifier	 ti2
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ti1	TokenNameIdentifier	 ti1
.	TokenNameDOT	
freqPointer	TokenNameIdentifier	 freq Pointer
!=	TokenNameNOT_EQUAL	
ti2	TokenNameIdentifier	 ti2
.	TokenNameDOT	
freqPointer	TokenNameIdentifier	 freq Pointer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ti1	TokenNameIdentifier	 ti1
.	TokenNameDOT	
proxPointer	TokenNameIdentifier	 prox Pointer
!=	TokenNameNOT_EQUAL	
ti2	TokenNameIdentifier	 ti2
.	TokenNameDOT	
proxPointer	TokenNameIdentifier	 prox Pointer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skipOffset is only valid when docFreq >= skipInterval: 	TokenNameCOMMENT_LINE	skipOffset is only valid when docFreq >= skipInterval: 
if	TokenNameif	
(	TokenNameLPAREN	
ti1	TokenNameIdentifier	 ti1
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
>=	TokenNameGREATER_EQUAL	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
skipInterval	TokenNameIdentifier	 skip Interval
&&	TokenNameAND_AND	
ti1	TokenNameIdentifier	 ti1
.	TokenNameDOT	
skipOffset	TokenNameIdentifier	 skip Offset
!=	TokenNameNOT_EQUAL	
ti2	TokenNameIdentifier	 ti2
.	TokenNameDOT	
skipOffset	TokenNameIdentifier	 skip Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
ensureIndexIsRead	TokenNameIdentifier	 ensure Index Is Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"terms index was not loaded when this reader was created"	TokenNameStringLiteral	terms index was not loaded when this reader was created
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns the position of a Term in the set or -1. */	TokenNameCOMMENT_JAVADOC	 Returns the position of a Term in the set or -1. 
final	TokenNamefinal	
long	TokenNamelong	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ensureIndexIsRead	TokenNameIdentifier	 ensure Index Is Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BytesRef	TokenNameIdentifier	 Bytes Ref
termBytesRef	TokenNameIdentifier	 term Bytes Ref
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
indexOffset	TokenNameIdentifier	 index Offset
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getIndexOffset	TokenNameIdentifier	 get Index Offset
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
termBytesRef	TokenNameIdentifier	 term Bytes Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
enumerator	TokenNameIdentifier	 enumerator
=	TokenNameEQUAL	
getThreadResources	TokenNameIdentifier	 get Thread Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
termEnum	TokenNameIdentifier	 term Enum
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
seekEnum	TokenNameIdentifier	 seek Enum
(	TokenNameLPAREN	
enumerator	TokenNameIdentifier	 enumerator
,	TokenNameCOMMA	
indexOffset	TokenNameIdentifier	 index Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns an enumeration of all the Terms and TermInfos in the set. */	TokenNameCOMMENT_JAVADOC	 Returns an enumeration of all the Terms and TermInfos in the set. 
public	TokenNamepublic	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
)	TokenNameRPAREN	
origEnum	TokenNameIdentifier	 orig Enum
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns an enumeration of terms starting at or after the named term. */	TokenNameCOMMENT_JAVADOC	 Returns an enumeration of terms starting at or after the named term. 
public	TokenNamepublic	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BytesRef	TokenNameIdentifier	 Bytes Ref
termBytesRef	TokenNameIdentifier	 term Bytes Ref
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
termBytesRef	TokenNameIdentifier	 term Bytes Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
)	TokenNameRPAREN	
getThreadResources	TokenNameIdentifier	 get Thread Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
