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
/** * Byte[] referencing is used because a new norm object needs * to be created for each clone, and the byte array is all * that is needed for sharing between cloned readers. The * current norm referencing is for sharing between readers * whereas the byte[] referencing is for copy on write which * is independent of reader references (i.e. incRef, decRef). */	TokenNameCOMMENT_JAVADOC	 Byte[] referencing is used because a new norm object needs to be created for each clone, and the byte array is all that is needed for sharing between cloned readers. The current norm referencing is for sharing between readers whereas the byte[] referencing is for copy on write which is independent of reader references (i.e. incRef, decRef). 
final	TokenNamefinal	
class	TokenNameclass	
SegmentNorms	TokenNameIdentifier	 Segment Norms
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** norms header placeholder */	TokenNameCOMMENT_JAVADOC	 norms header placeholder 
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NORMS_HEADER	TokenNameIdentifier	 NORMS  HEADER
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
'N'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'R'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'M'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
refCount	TokenNameIdentifier	 ref Count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// If this instance is a clone, the originalNorm 	TokenNameCOMMENT_LINE	If this instance is a clone, the originalNorm 
// references the Norm that has a real open IndexInput: 	TokenNameCOMMENT_LINE	references the Norm that has a real open IndexInput: 
private	TokenNameprivate	
SegmentNorms	TokenNameIdentifier	 Segment Norms
origNorm	TokenNameIdentifier	 orig Norm
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexInput	TokenNameIdentifier	 Index Input
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
normSeek	TokenNameIdentifier	 norm Seek
;	TokenNameSEMICOLON	
// null until bytes is set 	TokenNameCOMMENT_LINE	null until bytes is set 
private	TokenNameprivate	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
bytesRef	TokenNameIdentifier	 bytes Ref
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
dirty	TokenNameIdentifier	 dirty
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
rollbackDirty	TokenNameIdentifier	 rollback Dirty
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
SegmentReader	TokenNameIdentifier	 Segment Reader
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SegmentNorms	TokenNameIdentifier	 Segment Norms
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
int	TokenNameint	
number	TokenNameIdentifier	 number
,	TokenNameCOMMA	
long	TokenNamelong	
normSeek	TokenNameIdentifier	 norm Seek
,	TokenNameCOMMA	
SegmentReader	TokenNameIdentifier	 Segment Reader
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
normSeek	TokenNameIdentifier	 norm Seek
=	TokenNameEQUAL	
normSeek	TokenNameIdentifier	 norm Seek
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
owner	TokenNameIdentifier	 owner
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
refCount	TokenNameIdentifier	 ref Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
origNorm	TokenNameIdentifier	 orig Norm
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
origNorm	TokenNameIdentifier	 orig Norm
.	TokenNameDOT	
refCount	TokenNameIdentifier	 ref Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
refCount	TokenNameIdentifier	 ref Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
closeInput	TokenNameIdentifier	 close Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
!=	TokenNameNOT_EQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
singleNormStream	TokenNameIdentifier	 single Norm Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// It's private to us -- just close it 	TokenNameCOMMENT_LINE	It's private to us -- just close it 
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// We are sharing this with others -- decRef and 	TokenNameCOMMENT_LINE	We are sharing this with others -- decRef and 
// maybe close the shared norm stream 	TokenNameCOMMENT_LINE	maybe close the shared norm stream 
if	TokenNameif	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
singleNormRef	TokenNameIdentifier	 single Norm Ref
.	TokenNameDOT	
decrementAndGet	TokenNameIdentifier	 decrement And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
singleNormStream	TokenNameIdentifier	 single Norm Stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
singleNormStream	TokenNameIdentifier	 single Norm Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
refCount	TokenNameIdentifier	 ref Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
origNorm	TokenNameIdentifier	 orig Norm
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
origNorm	TokenNameIdentifier	 orig Norm
.	TokenNameDOT	
refCount	TokenNameIdentifier	 ref Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
refCount	TokenNameIdentifier	 ref Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
origNorm	TokenNameIdentifier	 orig Norm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
origNorm	TokenNameIdentifier	 orig Norm
.	TokenNameDOT	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
origNorm	TokenNameIdentifier	 orig Norm
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
closeInput	TokenNameIdentifier	 close Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
bytesRef	TokenNameIdentifier	 bytes Ref
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
bytesRef	TokenNameIdentifier	 bytes Ref
.	TokenNameDOT	
decrementAndGet	TokenNameIdentifier	 decrement And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
bytesRef	TokenNameIdentifier	 bytes Ref
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
bytesRef	TokenNameIdentifier	 bytes Ref
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Load bytes but do not cache them if they were not 	TokenNameCOMMENT_LINE	Load bytes but do not cache them if they were not 
// already cached 	TokenNameCOMMENT_LINE	already cached 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytesOut	TokenNameIdentifier	 bytes Out
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
refCount	TokenNameIdentifier	 ref Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
origNorm	TokenNameIdentifier	 orig Norm
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
origNorm	TokenNameIdentifier	 orig Norm
.	TokenNameDOT	
refCount	TokenNameIdentifier	 ref Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Already cached -- copy from cache: 	TokenNameCOMMENT_LINE	Already cached -- copy from cache: 
assert	TokenNameassert	
len	TokenNameIdentifier	 len
<=	TokenNameLESS_EQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bytesOut	TokenNameIdentifier	 bytes Out
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Not cached 	TokenNameCOMMENT_LINE	Not cached 
if	TokenNameif	
(	TokenNameLPAREN	
origNorm	TokenNameIdentifier	 orig Norm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ask origNorm to load 	TokenNameCOMMENT_LINE	Ask origNorm to load 
origNorm	TokenNameIdentifier	 orig Norm
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
bytesOut	TokenNameIdentifier	 bytes Out
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// We are orig -- read ourselves from disk: 	TokenNameCOMMENT_LINE	We are orig -- read ourselves from disk: 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
normSeek	TokenNameIdentifier	 norm Seek
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
bytesOut	TokenNameIdentifier	 bytes Out
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Load & cache full bytes array. Returns bytes. 	TokenNameCOMMENT_LINE	Load & cache full bytes array. Returns bytes. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
refCount	TokenNameIdentifier	 ref Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
origNorm	TokenNameIdentifier	 orig Norm
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
origNorm	TokenNameIdentifier	 orig Norm
.	TokenNameDOT	
refCount	TokenNameIdentifier	 ref Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// value not yet read 	TokenNameCOMMENT_LINE	value not yet read 
assert	TokenNameassert	
bytesRef	TokenNameIdentifier	 bytes Ref
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
origNorm	TokenNameIdentifier	 orig Norm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ask origNorm to load so that for a series of 	TokenNameCOMMENT_LINE	Ask origNorm to load so that for a series of 
// reopened readers we share a single read-only 	TokenNameCOMMENT_LINE	reopened readers we share a single read-only 
// byte[] 	TokenNameCOMMENT_LINE	byte[] 
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
origNorm	TokenNameIdentifier	 orig Norm
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesRef	TokenNameIdentifier	 bytes Ref
=	TokenNameEQUAL	
origNorm	TokenNameIdentifier	 orig Norm
.	TokenNameDOT	
bytesRef	TokenNameIdentifier	 bytes Ref
;	TokenNameSEMICOLON	
bytesRef	TokenNameIdentifier	 bytes Ref
.	TokenNameDOT	
incrementAndGet	TokenNameIdentifier	 increment And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Once we've loaded the bytes we no longer need 	TokenNameCOMMENT_LINE	Once we've loaded the bytes we no longer need 
// origNorm: 	TokenNameCOMMENT_LINE	origNorm: 
origNorm	TokenNameIdentifier	 orig Norm
.	TokenNameDOT	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
origNorm	TokenNameIdentifier	 orig Norm
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// We are the origNorm, so load the bytes for real 	TokenNameCOMMENT_LINE	We are the origNorm, so load the bytes for real 
// ourself: 	TokenNameCOMMENT_LINE	ourself: 
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Since we are orig, in must not be null 	TokenNameCOMMENT_LINE	Since we are orig, in must not be null 
assert	TokenNameassert	
in	TokenNameIdentifier	 in
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Read from disk. 	TokenNameCOMMENT_LINE	Read from disk. 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
normSeek	TokenNameIdentifier	 norm Seek
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bytesRef	TokenNameIdentifier	 bytes Ref
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
closeInput	TokenNameIdentifier	 close Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Only for testing 	TokenNameCOMMENT_LINE	Only for testing 
AtomicInteger	TokenNameIdentifier	 Atomic Integer
bytesRef	TokenNameIdentifier	 bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bytesRef	TokenNameIdentifier	 bytes Ref
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Called if we intend to change a norm value. We make a 	TokenNameCOMMENT_LINE	Called if we intend to change a norm value. We make a 
// private copy of bytes if it's shared with others: 	TokenNameCOMMENT_LINE	private copy of bytes if it's shared with others: 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
copyOnWrite	TokenNameIdentifier	 copy On Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
refCount	TokenNameIdentifier	 ref Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
origNorm	TokenNameIdentifier	 orig Norm
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
origNorm	TokenNameIdentifier	 orig Norm
.	TokenNameDOT	
refCount	TokenNameIdentifier	 ref Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bytes	TokenNameIdentifier	 bytes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bytesRef	TokenNameIdentifier	 bytes Ref
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytesRef	TokenNameIdentifier	 bytes Ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// I cannot be the origNorm for another norm 	TokenNameCOMMENT_LINE	I cannot be the origNorm for another norm 
// instance if I'm being changed. Ie, only the 	TokenNameCOMMENT_LINE	instance if I'm being changed. Ie, only the 
// "head Norm" can be changed: 	TokenNameCOMMENT_LINE	"head Norm" can be changed: 
assert	TokenNameassert	
refCount	TokenNameIdentifier	 ref Count
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
oldRef	TokenNameIdentifier	 old Ref
=	TokenNameEQUAL	
bytesRef	TokenNameIdentifier	 bytes Ref
;	TokenNameSEMICOLON	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
cloneNormBytes	TokenNameIdentifier	 clone Norm Bytes
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesRef	TokenNameIdentifier	 bytes Ref
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldRef	TokenNameIdentifier	 old Ref
.	TokenNameDOT	
decrementAndGet	TokenNameIdentifier	 decrement And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dirty	TokenNameIdentifier	 dirty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Returns a copy of this Norm instance that shares 	TokenNameCOMMENT_LINE	Returns a copy of this Norm instance that shares 
// IndexInput & bytes with the original one 	TokenNameCOMMENT_LINE	IndexInput & bytes with the original one 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
refCount	TokenNameIdentifier	 ref Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
origNorm	TokenNameIdentifier	 orig Norm
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
origNorm	TokenNameIdentifier	 orig Norm
.	TokenNameDOT	
refCount	TokenNameIdentifier	 ref Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentNorms	TokenNameIdentifier	 Segment Norms
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SegmentNorms	TokenNameIdentifier	 Segment Norms
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Cannot happen 	TokenNameCOMMENT_LINE	Cannot happen 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"unexpected CloneNotSupportedException"	TokenNameStringLiteral	unexpected CloneNotSupportedException
,	TokenNameCOMMA	
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
refCount	TokenNameIdentifier	 ref Count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
bytesRef	TokenNameIdentifier	 bytes Ref
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
origNorm	TokenNameIdentifier	 orig Norm
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Clone holds a reference to my bytes: 	TokenNameCOMMENT_LINE	Clone holds a reference to my bytes: 
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
bytesRef	TokenNameIdentifier	 bytes Ref
.	TokenNameDOT	
incrementAndGet	TokenNameIdentifier	 increment And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
bytesRef	TokenNameIdentifier	 bytes Ref
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
origNorm	TokenNameIdentifier	 orig Norm
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// I become the origNorm for the clone: 	TokenNameCOMMENT_LINE	I become the origNorm for the clone: 
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
origNorm	TokenNameIdentifier	 orig Norm
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
origNorm	TokenNameIdentifier	 orig Norm
.	TokenNameDOT	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Only the origNorm will actually readBytes from in: 	TokenNameCOMMENT_LINE	Only the origNorm will actually readBytes from in: 
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Flush all pending changes to the next generation 	TokenNameCOMMENT_LINE	Flush all pending changes to the next generation 
// separate norms file. 	TokenNameCOMMENT_LINE	separate norms file. 
public	TokenNamepublic	
void	TokenNamevoid	
reWrite	TokenNameIdentifier	 re Write
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
si	TokenNameIdentifier	 si
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
refCount	TokenNameIdentifier	 ref Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
origNorm	TokenNameIdentifier	 orig Norm
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
origNorm	TokenNameIdentifier	 orig Norm
.	TokenNameDOT	
refCount	TokenNameIdentifier	 ref Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"refCount="	TokenNameStringLiteral	refCount=
+	TokenNamePLUS	
refCount	TokenNameIdentifier	 ref Count
+	TokenNamePLUS	
" origNorm="	TokenNameStringLiteral	 origNorm=
+	TokenNamePLUS	
origNorm	TokenNameIdentifier	 orig Norm
;	TokenNameSEMICOLON	
// NOTE: norms are re-written in regular directory, not cfs 	TokenNameCOMMENT_LINE	NOTE: norms are re-written in regular directory, not cfs 
si	TokenNameIdentifier	 si
.	TokenNameDOT	
advanceNormGen	TokenNameIdentifier	 advance Norm Gen
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
normFileName	TokenNameIdentifier	 norm File Name
=	TokenNameEQUAL	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
getNormFileName	TokenNameIdentifier	 get Norm File Name
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexOutput	TokenNameIdentifier	 Index Output
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
normFileName	TokenNameIdentifier	 norm File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
SegmentNorms	TokenNameIdentifier	 Segment Norms
.	TokenNameDOT	
NORMS_HEADER	TokenNameIdentifier	 NORMS  HEADER
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SegmentNorms	TokenNameIdentifier	 Segment Norms
.	TokenNameDOT	
NORMS_HEADER	TokenNameIdentifier	 NORMS  HEADER
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
deleteFile	TokenNameIdentifier	 delete File
(	TokenNameLPAREN	
normFileName	TokenNameIdentifier	 norm File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// suppress this so we keep throwing the 	TokenNameCOMMENT_LINE	suppress this so we keep throwing the 
// original exception 	TokenNameCOMMENT_LINE	original exception 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dirty	TokenNameIdentifier	 dirty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
