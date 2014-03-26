package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
packed	TokenNameIdentifier	 packed
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
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
DataOutput	TokenNameIdentifier	 Data Output
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
CodecUtil	TokenNameIdentifier	 Codec Util
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Simplistic compression for array of unsigned long values. * Each value is >= 0 and <= a specified maximum value. The * values are stored as packed ints, with each value * consuming a fixed number of bits. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Simplistic compression for array of unsigned long values. Each value is >= 0 and <= a specified maximum value. The values are stored as packed ints, with each value consuming a fixed number of bits. * @lucene.internal 
public	TokenNamepublic	
class	TokenNameclass	
PackedInts	TokenNameIdentifier	 Packed Ints
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CODEC_NAME	TokenNameIdentifier	 CODEC  NAME
=	TokenNameEQUAL	
"PackedInts"	TokenNameStringLiteral	PackedInts
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
VERSION_START	TokenNameIdentifier	 VERSION  START
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
VERSION_CURRENT	TokenNameIdentifier	 VERSION  CURRENT
=	TokenNameEQUAL	
VERSION_START	TokenNameIdentifier	 VERSION  START
;	TokenNameSEMICOLON	
/** * A read-only random access array of positive integers. * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 A read-only random access array of positive integers. @lucene.internal 
public	TokenNamepublic	
static	TokenNamestatic	
interface	TokenNameinterface	
Reader	TokenNameIdentifier	 Reader
{	TokenNameLBRACE	
/** * @param index the position of the wanted value. * @return the value at the stated index. */	TokenNameCOMMENT_JAVADOC	 @param index the position of the wanted value. @return the value at the stated index. 
long	TokenNamelong	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return the number of bits used to store any given value. * Note: This does not imply that memory usage is * {@code bitsPerValue * #values} as implementations are free to * use non-space-optimal packing of bits. */	TokenNameCOMMENT_JAVADOC	 @return the number of bits used to store any given value. Note: This does not imply that memory usage is {@code bitsPerValue #values} as implementations are free to use non-space-optimal packing of bits. 
int	TokenNameint	
getBitsPerValue	TokenNameIdentifier	 get Bits Per Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return the number of values. */	TokenNameCOMMENT_JAVADOC	 @return the number of values. 
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Expert: if the bit-width of this reader matches one of * java's native types, returns the underlying array * (ie, byte[], short[], int[], long[]); else, returns * null. Note that when accessing the array you must * upgrade the type (bitwise AND with all ones), to * interpret the full value as unsigned. Ie, * bytes[idx]&0xFF, shorts[idx]&0xFFFF, etc. */	TokenNameCOMMENT_JAVADOC	 Expert: if the bit-width of this reader matches one of java's native types, returns the underlying array (ie, byte[], short[], int[], long[]); else, returns null. Note that when accessing the array you must upgrade the type (bitwise AND with all ones), to interpret the full value as unsigned. Ie, bytes[idx]&0xFF, shorts[idx]&0xFFFF, etc. 
Object	TokenNameIdentifier	 Object
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if this implementation is backed by a * native java array. * * @see #getArray */	TokenNameCOMMENT_JAVADOC	 Returns true if this implementation is backed by a native java array. * @see #getArray 
boolean	TokenNameboolean	
hasArray	TokenNameIdentifier	 has Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A packed integer array that can be modified. * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 A packed integer array that can be modified. @lucene.internal 
public	TokenNamepublic	
static	TokenNamestatic	
interface	TokenNameinterface	
Mutable	TokenNameIdentifier	 Mutable
extends	TokenNameextends	
Reader	TokenNameIdentifier	 Reader
{	TokenNameLBRACE	
/** * Set the value at the given index in the array. * @param index where the value should be positioned. * @param value a value conforming to the constraints set by the array. */	TokenNameCOMMENT_JAVADOC	 Set the value at the given index in the array. @param index where the value should be positioned. @param value a value conforming to the constraints set by the array. 
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
long	TokenNamelong	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets all values to 0. */	TokenNameCOMMENT_JAVADOC	 Sets all values to 0. 
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A simple base for Readers that keeps track of valueCount and bitsPerValue. * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 A simple base for Readers that keeps track of valueCount and bitsPerValue. @lucene.internal 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
ReaderImpl	TokenNameIdentifier	 Reader Impl
implements	TokenNameimplements	
Reader	TokenNameIdentifier	 Reader
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
bitsPerValue	TokenNameIdentifier	 bits Per Value
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
ReaderImpl	TokenNameIdentifier	 Reader Impl
(	TokenNameLPAREN	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
int	TokenNameint	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bitsPerValue	TokenNameIdentifier	 bits Per Value
=	TokenNameEQUAL	
bitsPerValue	TokenNameIdentifier	 bits Per Value
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bitsPerValue	TokenNameIdentifier	 bits Per Value
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bitsPerValue	TokenNameIdentifier	 bits Per Value
<=	TokenNameLESS_EQUAL	
64	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"bitsPerValue="	TokenNameStringLiteral	bitsPerValue=
+	TokenNamePLUS	
bitsPerValue	TokenNameIdentifier	 bits Per Value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
valueCount	TokenNameIdentifier	 value Count
=	TokenNameEQUAL	
valueCount	TokenNameIdentifier	 value Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getBitsPerValue	TokenNameIdentifier	 get Bits Per Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bitsPerValue	TokenNameIdentifier	 bits Per Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
valueCount	TokenNameIdentifier	 value Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getMaxValue	TokenNameIdentifier	 get Max Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Convenience method 	TokenNameCOMMENT_LINE	Convenience method 
return	TokenNamereturn	
maxValue	TokenNameIdentifier	 max Value
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasArray	TokenNameIdentifier	 has Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** A write-once Writer. * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 A write-once Writer. @lucene.internal 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
Writer	TokenNameIdentifier	 Writer
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
bitsPerValue	TokenNameIdentifier	 bits Per Value
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Writer	TokenNameIdentifier	 Writer
(	TokenNameLPAREN	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
int	TokenNameint	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
bitsPerValue	TokenNameIdentifier	 bits Per Value
<=	TokenNameLESS_EQUAL	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
valueCount	TokenNameIdentifier	 value Count
=	TokenNameEQUAL	
valueCount	TokenNameIdentifier	 value Count
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bitsPerValue	TokenNameIdentifier	 bits Per Value
=	TokenNameEQUAL	
bitsPerValue	TokenNameIdentifier	 bits Per Value
;	TokenNameSEMICOLON	
CodecUtil	TokenNameIdentifier	 Codec Util
.	TokenNameDOT	
writeHeader	TokenNameIdentifier	 write Header
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
CODEC_NAME	TokenNameIdentifier	 CODEC  NAME
,	TokenNameCOMMA	
VERSION_CURRENT	TokenNameIdentifier	 VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
long	TokenNamelong	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve PackedInt data from the DataInput and return a packed int * structure based on it. * @param in positioned at the beginning of a stored packed int structure. * @return a read only random access capable array of positive integers. * @throws IOException if the structure could not be retrieved. * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Retrieve PackedInt data from the DataInput and return a packed int structure based on it. @param in positioned at the beginning of a stored packed int structure. @return a read only random access capable array of positive integers. @throws IOException if the structure could not be retrieved. @lucene.internal 
public	TokenNamepublic	
static	TokenNamestatic	
Reader	TokenNameIdentifier	 Reader
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
CodecUtil	TokenNameIdentifier	 Codec Util
.	TokenNameDOT	
checkHeader	TokenNameIdentifier	 check Header
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
CODEC_NAME	TokenNameIdentifier	 CODEC  NAME
,	TokenNameCOMMA	
VERSION_START	TokenNameIdentifier	 VERSION  START
,	TokenNameCOMMA	
VERSION_START	TokenNameIdentifier	 VERSION  START
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
bitsPerValue	TokenNameIdentifier	 bits Per Value
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bitsPerValue	TokenNameIdentifier	 bits Per Value
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bitsPerValue	TokenNameIdentifier	 bits Per Value
<=	TokenNameLESS_EQUAL	
64	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"bitsPerValue="	TokenNameStringLiteral	bitsPerValue=
+	TokenNamePLUS	
bitsPerValue	TokenNameIdentifier	 bits Per Value
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
8	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
Direct8	TokenNameIdentifier	 Direct8
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
valueCount	TokenNameIdentifier	 value Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
16	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
Direct16	TokenNameIdentifier	 Direct16
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
valueCount	TokenNameIdentifier	 value Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
32	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
Direct32	TokenNameIdentifier	 Direct32
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
valueCount	TokenNameIdentifier	 value Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
64	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
Direct64	TokenNameIdentifier	 Direct64
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
valueCount	TokenNameIdentifier	 value Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JRE_IS_64BIT	TokenNameIdentifier	 JRE  IS 64 BIT
||	TokenNameOR_OR	
bitsPerValue	TokenNameIdentifier	 bits Per Value
>=	TokenNameGREATER_EQUAL	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Packed64	TokenNameIdentifier	 Packed64
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Packed32	TokenNameIdentifier	 Packed32
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a packed integer array with the given amount of values initialized * to 0. the valueCount and the bitsPerValue cannot be changed after creation. * All Mutables known by this factory are kept fully in RAM. * @param valueCount the number of elements. * @param bitsPerValue the number of bits available for any given value. * @return a mutable packed integer array. * @throws java.io.IOException if the Mutable could not be created. With the * current implementations, this never happens, but the method * signature allows for future persistence-backed Mutables. * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Create a packed integer array with the given amount of values initialized to 0. the valueCount and the bitsPerValue cannot be changed after creation. All Mutables known by this factory are kept fully in RAM. @param valueCount the number of elements. @param bitsPerValue the number of bits available for any given value. @return a mutable packed integer array. @throws java.io.IOException if the Mutable could not be created. With the current implementations, this never happens, but the method signature allows for future persistence-backed Mutables. @lucene.internal 
public	TokenNamepublic	
static	TokenNamestatic	
Mutable	TokenNameIdentifier	 Mutable
getMutable	TokenNameIdentifier	 get Mutable
(	TokenNameLPAREN	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
int	TokenNameint	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
8	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
Direct8	TokenNameIdentifier	 Direct8
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
16	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
Direct16	TokenNameIdentifier	 Direct16
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
32	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
Direct32	TokenNameIdentifier	 Direct32
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
64	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
Direct64	TokenNameIdentifier	 Direct64
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JRE_IS_64BIT	TokenNameIdentifier	 JRE  IS 64 BIT
||	TokenNameOR_OR	
bitsPerValue	TokenNameIdentifier	 bits Per Value
>=	TokenNameGREATER_EQUAL	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Packed64	TokenNameIdentifier	 Packed64
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Packed32	TokenNameIdentifier	 Packed32
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a packed integer array writer for the given number of values at the * given bits/value. Writers append to the given IndexOutput and has very * low memory overhead. * @param out the destination for the produced bits. * @param valueCount the number of elements. * @param bitsPerValue the number of bits available for any given value. * @return a Writer ready for receiving values. * @throws IOException if bits could not be written to out. * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Create a packed integer array writer for the given number of values at the given bits/value. Writers append to the given IndexOutput and has very low memory overhead. @param out the destination for the produced bits. @param valueCount the number of elements. @param bitsPerValue the number of bits available for any given value. @return a Writer ready for receiving values. @throws IOException if bits could not be written to out. @lucene.internal 
public	TokenNamepublic	
static	TokenNamestatic	
Writer	TokenNameIdentifier	 Writer
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
int	TokenNameint	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PackedWriter	TokenNameIdentifier	 Packed Writer
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns how many bits are required to hold values up * to and including maxValue * @param maxValue the maximum value that should be representable. * @return the amount of bits needed to represent values from 0 to maxValue. * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Returns how many bits are required to hold values up to and including maxValue @param maxValue the maximum value that should be representable. @return the amount of bits needed to represent values from 0 to maxValue. @lucene.internal 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
bitsRequired	TokenNameIdentifier	 bits Required
(	TokenNameLPAREN	
long	TokenNamelong	
maxValue	TokenNameIdentifier	 max Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Very high long values does not translate well to double, so we do an 	TokenNameCOMMENT_LINE	Very high long values does not translate well to double, so we do an 
// explicit check for the edge cases 	TokenNameCOMMENT_LINE	explicit check for the edge cases 
if	TokenNameif	
(	TokenNameLPAREN	
maxValue	TokenNameIdentifier	 max Value
>	TokenNameGREATER	
0x3FFFFFFFFFFFFFFFL	TokenNameLongLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
63	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxValue	TokenNameIdentifier	 max Value
>	TokenNameGREATER	
0x1FFFFFFFFFFFFFFFL	TokenNameLongLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
62	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
maxValue	TokenNameIdentifier	 max Value
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
2.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculates the maximum unsigned long that can be expressed with the given * number of bits. * @param bitsPerValue the number of bits available for any given value. * @return the maximum value for the given bits. * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Calculates the maximum unsigned long that can be expressed with the given number of bits. @param bitsPerValue the number of bits available for any given value. @return the maximum value for the given bits. @lucene.internal 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
maxValue	TokenNameIdentifier	 max Value
(	TokenNameLPAREN	
int	TokenNameint	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bitsPerValue	TokenNameIdentifier	 bits Per Value
==	TokenNameEQUAL_EQUAL	
64	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
:	TokenNameCOLON	
~	TokenNameTWIDDLE	
(	TokenNameLPAREN	
~	TokenNameTWIDDLE	
0L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Rounds bitsPerValue up to 8, 16, 32 or 64. */	TokenNameCOMMENT_JAVADOC	 Rounds bitsPerValue up to 8, 16, 32 or 64. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getNextFixedSize	TokenNameIdentifier	 get Next Fixed Size
(	TokenNameLPAREN	
int	TokenNameint	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
<=	TokenNameLESS_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
<=	TokenNameLESS_EQUAL	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
<=	TokenNameLESS_EQUAL	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Possibly wastes some storage in exchange for faster lookups */	TokenNameCOMMENT_JAVADOC	 Possibly wastes some storage in exchange for faster lookups 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getRoundedFixedSize	TokenNameIdentifier	 get Rounded Fixed Size
(	TokenNameLPAREN	
int	TokenNameint	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
>	TokenNameGREATER	
58	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
<	TokenNameLESS	
32	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bitsPerValue	TokenNameIdentifier	 bits Per Value
>	TokenNameGREATER	
29	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 10% space-waste is ok 	TokenNameCOMMENT_LINE	10% space-waste is ok 
return	TokenNamereturn	
getNextFixedSize	TokenNameIdentifier	 get Next Fixed Size
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
bitsPerValue	TokenNameIdentifier	 bits Per Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
