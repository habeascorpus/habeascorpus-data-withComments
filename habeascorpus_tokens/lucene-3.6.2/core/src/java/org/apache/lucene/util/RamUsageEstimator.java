package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
ManagementFactory	TokenNameIdentifier	 Management Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormat	TokenNameIdentifier	 Decimal Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormatSymbols	TokenNameIdentifier	 Decimal Format Symbols
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Estimates the size (memory representation) of Java objects. * * <p>NOTE: Starting with Lucene 3.6, creating instances of this class * is deprecated. If you still do this, please note, that instances of * {@code RamUsageEstimator} are not thread-safe! * It is also deprecated to enable checking of String intern-ness, * the new static method no longer allow to do this. Interned strings * will be counted as any other object and count for memory usage. * * <p>In Lucene 3.6, custom {@code MemoryModel}s were completely * removed. The new implementation is now using Hotspot&trade; internals * to get the correct scale factors and offsets for calculating * memory usage. * * @see #sizeOf(Object) * @see #shallowSizeOf(Object) * @see #shallowSizeOfInstance(Class) * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Estimates the size (memory representation) of Java objects. * <p>NOTE: Starting with Lucene 3.6, creating instances of this class is deprecated. If you still do this, please note, that instances of {@code RamUsageEstimator} are not thread-safe! It is also deprecated to enable checking of String intern-ness, the new static method no longer allow to do this. Interned strings will be counted as any other object and count for memory usage. * <p>In Lucene 3.6, custom {@code MemoryModel}s were completely removed. The new implementation is now using Hotspot&trade; internals to get the correct scale factors and offsets for calculating memory usage. * @see #sizeOf(Object) @see #shallowSizeOf(Object) @see #shallowSizeOfInstance(Class) * @lucene.internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
{	TokenNameLBRACE	
/** * JVM diagnostic features. */	TokenNameCOMMENT_JAVADOC	 JVM diagnostic features. 
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
JvmFeature	TokenNameIdentifier	 Jvm Feature
{	TokenNameLBRACE	
OBJECT_REFERENCE_SIZE	TokenNameIdentifier	 OBJECT  REFERENCE  SIZE
(	TokenNameLPAREN	
"Object reference size estimated using array index scale"	TokenNameStringLiteral	Object reference size estimated using array index scale
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ARRAY_HEADER_SIZE	TokenNameIdentifier	 ARRAY  HEADER  SIZE
(	TokenNameLPAREN	
"Array header size estimated using array based offset"	TokenNameStringLiteral	Array header size estimated using array based offset
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FIELD_OFFSETS	TokenNameIdentifier	 FIELD  OFFSETS
(	TokenNameLPAREN	
"Shallow instance size based on field offsets"	TokenNameStringLiteral	Shallow instance size based on field offsets
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OBJECT_ALIGNMENT	TokenNameIdentifier	 OBJECT  ALIGNMENT
(	TokenNameLPAREN	
"Object alignment retrieved from HotSpotDiagnostic MX bean"	TokenNameStringLiteral	Object alignment retrieved from HotSpotDiagnostic MX bean
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JvmFeature	TokenNameIdentifier	 Jvm Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
description	TokenNameIdentifier	 description
=	TokenNameEQUAL	
description	TokenNameIdentifier	 description
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
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" ("	TokenNameStringLiteral	 (
+	TokenNamePLUS	
description	TokenNameIdentifier	 description
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** JVM info string for debugging and reports. */	TokenNameCOMMENT_JAVADOC	 JVM info string for debugging and reports. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
JVM_INFO_STRING	TokenNameIdentifier	 JVM  INFO  STRING
;	TokenNameSEMICOLON	
/** One kilobyte bytes. */	TokenNameCOMMENT_JAVADOC	 One kilobyte bytes. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
ONE_KB	TokenNameIdentifier	 ONE  KB
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** One megabyte bytes. */	TokenNameCOMMENT_JAVADOC	 One megabyte bytes. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
ONE_MB	TokenNameIdentifier	 ONE  MB
=	TokenNameEQUAL	
ONE_KB	TokenNameIdentifier	 ONE  KB
*	TokenNameMULTIPLY	
ONE_KB	TokenNameIdentifier	 ONE  KB
;	TokenNameSEMICOLON	
/** One gigabyte bytes.*/	TokenNameCOMMENT_JAVADOC	 One gigabyte bytes.
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
ONE_GB	TokenNameIdentifier	 ONE  GB
=	TokenNameEQUAL	
ONE_KB	TokenNameIdentifier	 ONE  KB
*	TokenNameMULTIPLY	
ONE_MB	TokenNameIdentifier	 ONE  MB
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NUM_BYTES_BOOLEAN	TokenNameIdentifier	 NUM  BYTES  BOOLEAN
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NUM_BYTES_BYTE	TokenNameIdentifier	 NUM  BYTES  BYTE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NUM_BYTES_CHAR	TokenNameIdentifier	 NUM  BYTES  CHAR
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NUM_BYTES_SHORT	TokenNameIdentifier	 NUM  BYTES  SHORT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NUM_BYTES_FLOAT	TokenNameIdentifier	 NUM  BYTES  FLOAT
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NUM_BYTES_LONG	TokenNameIdentifier	 NUM  BYTES  LONG
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NUM_BYTES_DOUBLE	TokenNameIdentifier	 NUM  BYTES  DOUBLE
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Number of bytes this jvm uses to represent an object reference. */	TokenNameCOMMENT_JAVADOC	 Number of bytes this jvm uses to represent an object reference. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
;	TokenNameSEMICOLON	
/** * Number of bytes to represent an object header (no fields, no alignments). */	TokenNameCOMMENT_JAVADOC	 Number of bytes to represent an object header (no fields, no alignments). 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NUM_BYTES_OBJECT_HEADER	TokenNameIdentifier	 NUM  BYTES  OBJECT  HEADER
;	TokenNameSEMICOLON	
/** * Number of bytes to represent an array header (no content, but with alignments). */	TokenNameCOMMENT_JAVADOC	 Number of bytes to represent an array header (no content, but with alignments). 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NUM_BYTES_ARRAY_HEADER	TokenNameIdentifier	 NUM  BYTES  ARRAY  HEADER
;	TokenNameSEMICOLON	
/** * A constant specifying the object alignment boundary inside the JVM. Objects will * always take a full multiple of this constant, possibly wasting some space. */	TokenNameCOMMENT_JAVADOC	 A constant specifying the object alignment boundary inside the JVM. Objects will always take a full multiple of this constant, possibly wasting some space. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NUM_BYTES_OBJECT_ALIGNMENT	TokenNameIdentifier	 NUM  BYTES  OBJECT  ALIGNMENT
;	TokenNameSEMICOLON	
/** * Sizes of primitive classes. */	TokenNameCOMMENT_JAVADOC	 Sizes of primitive classes. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
primitiveSizes	TokenNameIdentifier	 primitive Sizes
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
primitiveSizes	TokenNameIdentifier	 primitive Sizes
=	TokenNameEQUAL	
new	TokenNamenew	
IdentityHashMap	TokenNameIdentifier	 Identity Hash Map
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
primitiveSizes	TokenNameIdentifier	 primitive Sizes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
boolean	TokenNameboolean	
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
NUM_BYTES_BOOLEAN	TokenNameIdentifier	 NUM  BYTES  BOOLEAN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
primitiveSizes	TokenNameIdentifier	 primitive Sizes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
byte	TokenNamebyte	
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
NUM_BYTES_BYTE	TokenNameIdentifier	 NUM  BYTES  BYTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
primitiveSizes	TokenNameIdentifier	 primitive Sizes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
char	TokenNamechar	
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
NUM_BYTES_CHAR	TokenNameIdentifier	 NUM  BYTES  CHAR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
primitiveSizes	TokenNameIdentifier	 primitive Sizes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
short	TokenNameshort	
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
NUM_BYTES_SHORT	TokenNameIdentifier	 NUM  BYTES  SHORT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
primitiveSizes	TokenNameIdentifier	 primitive Sizes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
int	TokenNameint	
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
primitiveSizes	TokenNameIdentifier	 primitive Sizes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
float	TokenNamefloat	
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
NUM_BYTES_FLOAT	TokenNameIdentifier	 NUM  BYTES  FLOAT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
primitiveSizes	TokenNameIdentifier	 primitive Sizes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
double	TokenNamedouble	
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
NUM_BYTES_DOUBLE	TokenNameIdentifier	 NUM  BYTES  DOUBLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
primitiveSizes	TokenNameIdentifier	 primitive Sizes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
long	TokenNamelong	
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
NUM_BYTES_LONG	TokenNameIdentifier	 NUM  BYTES  LONG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A handle to <code>sun.misc.Unsafe</code>. */	TokenNameCOMMENT_JAVADOC	 A handle to <code>sun.misc.Unsafe</code>. 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
theUnsafe	TokenNameIdentifier	 the Unsafe
;	TokenNameSEMICOLON	
/** * A handle to <code>sun.misc.Unsafe#fieldOffset(Field)</code>. */	TokenNameCOMMENT_JAVADOC	 A handle to <code>sun.misc.Unsafe#fieldOffset(Field)</code>. 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
Method	TokenNameIdentifier	 Method
objectFieldOffsetMethod	TokenNameIdentifier	 object Field Offset Method
;	TokenNameSEMICOLON	
/** * All the supported "internal" JVM features detected at clinit. */	TokenNameCOMMENT_JAVADOC	 All the supported "internal" JVM features detected at clinit. 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
JvmFeature	TokenNameIdentifier	 Jvm Feature
>	TokenNameGREATER	
supportedFeatures	TokenNameIdentifier	 supported Features
;	TokenNameSEMICOLON	
/** * Initialize constants and try to collect information about the JVM internals. */	TokenNameCOMMENT_JAVADOC	 Initialize constants and try to collect information about the JVM internals. 
static	TokenNamestatic	
{	TokenNameLBRACE	
// Initialize empirically measured defaults. We'll modify them to the current 	TokenNameCOMMENT_LINE	Initialize empirically measured defaults. We'll modify them to the current 
// JVM settings later on if possible. 	TokenNameCOMMENT_LINE	JVM settings later on if possible. 
int	TokenNameint	
referenceSize	TokenNameIdentifier	 reference Size
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JRE_IS_64BIT	TokenNameIdentifier	 JRE  IS 64 BIT
?	TokenNameQUESTION	
8	TokenNameIntegerLiteral	
:	TokenNameCOLON	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
objectHeader	TokenNameIdentifier	 object Header
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JRE_IS_64BIT	TokenNameIdentifier	 JRE  IS 64 BIT
?	TokenNameQUESTION	
16	TokenNameIntegerLiteral	
:	TokenNameCOLON	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The following is objectHeader + NUM_BYTES_INT, but aligned (object alignment) 	TokenNameCOMMENT_LINE	The following is objectHeader + NUM_BYTES_INT, but aligned (object alignment) 
// so on 64 bit JVMs it'll be align(16 + 4, @8) = 24. 	TokenNameCOMMENT_LINE	so on 64 bit JVMs it'll be align(16 + 4, @8) = 24. 
int	TokenNameint	
arrayHeader	TokenNameIdentifier	 array Header
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JRE_IS_64BIT	TokenNameIdentifier	 JRE  IS 64 BIT
?	TokenNameQUESTION	
24	TokenNameIntegerLiteral	
:	TokenNameCOLON	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
supportedFeatures	TokenNameIdentifier	 supported Features
=	TokenNameEQUAL	
EnumSet	TokenNameIdentifier	 Enum Set
.	TokenNameDOT	
noneOf	TokenNameIdentifier	 none Of
(	TokenNameLPAREN	
JvmFeature	TokenNameIdentifier	 Jvm Feature
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
unsafeClass	TokenNameIdentifier	 unsafe Class
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
tempTheUnsafe	TokenNameIdentifier	 temp The Unsafe
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
unsafeClass	TokenNameIdentifier	 unsafe Class
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"sun.misc.Unsafe"	TokenNameStringLiteral	sun.misc.Unsafe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
unsafeField	TokenNameIdentifier	 unsafe Field
=	TokenNameEQUAL	
unsafeClass	TokenNameIdentifier	 unsafe Class
.	TokenNameDOT	
getDeclaredField	TokenNameIdentifier	 get Declared Field
(	TokenNameLPAREN	
"theUnsafe"	TokenNameStringLiteral	theUnsafe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unsafeField	TokenNameIdentifier	 unsafe Field
.	TokenNameDOT	
setAccessible	TokenNameIdentifier	 set Accessible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempTheUnsafe	TokenNameIdentifier	 temp The Unsafe
=	TokenNameEQUAL	
unsafeField	TokenNameIdentifier	 unsafe Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ignore. 	TokenNameCOMMENT_LINE	Ignore. 
}	TokenNameRBRACE	
theUnsafe	TokenNameIdentifier	 the Unsafe
=	TokenNameEQUAL	
tempTheUnsafe	TokenNameIdentifier	 temp The Unsafe
;	TokenNameSEMICOLON	
// get object reference size by getting scale factor of Object[] arrays: 	TokenNameCOMMENT_LINE	get object reference size by getting scale factor of Object[] arrays: 
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
Method	TokenNameIdentifier	 Method
arrayIndexScaleM	TokenNameIdentifier	 array Index Scale M
=	TokenNameEQUAL	
unsafeClass	TokenNameIdentifier	 unsafe Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"arrayIndexScale"	TokenNameStringLiteral	arrayIndexScale
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
referenceSize	TokenNameIdentifier	 reference Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Number	TokenNameIdentifier	 Number
)	TokenNameRPAREN	
arrayIndexScaleM	TokenNameIdentifier	 array Index Scale M
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
theUnsafe	TokenNameIdentifier	 the Unsafe
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
supportedFeatures	TokenNameIdentifier	 supported Features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
JvmFeature	TokenNameIdentifier	 Jvm Feature
.	TokenNameDOT	
OBJECT_REFERENCE_SIZE	TokenNameIdentifier	 OBJECT  REFERENCE  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore. 	TokenNameCOMMENT_LINE	ignore. 
}	TokenNameRBRACE	
// "best guess" based on reference size. We will attempt to modify 	TokenNameCOMMENT_LINE	"best guess" based on reference size. We will attempt to modify 
// these to exact values if there is supported infrastructure. 	TokenNameCOMMENT_LINE	these to exact values if there is supported infrastructure. 
objectHeader	TokenNameIdentifier	 object Header
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JRE_IS_64BIT	TokenNameIdentifier	 JRE  IS 64 BIT
?	TokenNameQUESTION	
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
referenceSize	TokenNameIdentifier	 reference Size
)	TokenNameRPAREN	
:	TokenNameCOLON	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
arrayHeader	TokenNameIdentifier	 array Header
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JRE_IS_64BIT	TokenNameIdentifier	 JRE  IS 64 BIT
?	TokenNameQUESTION	
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
referenceSize	TokenNameIdentifier	 reference Size
)	TokenNameRPAREN	
:	TokenNameCOLON	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// get the object header size: 	TokenNameCOMMENT_LINE	get the object header size: 
// - first try out if the field offsets are not scaled (see warning in Unsafe docs) 	TokenNameCOMMENT_LINE	- first try out if the field offsets are not scaled (see warning in Unsafe docs) 
// - get the object header size by getting the field offset of the first field of a dummy object 	TokenNameCOMMENT_LINE	- get the object header size by getting the field offset of the first field of a dummy object 
// If the scaling is byte-wise and unsafe is available, enable dynamic size measurement for 	TokenNameCOMMENT_LINE	If the scaling is byte-wise and unsafe is available, enable dynamic size measurement for 
// estimateRamUsage(). 	TokenNameCOMMENT_LINE	estimateRamUsage(). 
Method	TokenNameIdentifier	 Method
tempObjectFieldOffsetMethod	TokenNameIdentifier	 temp Object Field Offset Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
Method	TokenNameIdentifier	 Method
objectFieldOffsetM	TokenNameIdentifier	 object Field Offset M
=	TokenNameEQUAL	
unsafeClass	TokenNameIdentifier	 unsafe Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"objectFieldOffset"	TokenNameStringLiteral	objectFieldOffset
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
dummy1Field	TokenNameIdentifier	 dummy1 Field
=	TokenNameEQUAL	
DummyTwoLongObject	TokenNameIdentifier	 Dummy Two Long Object
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getDeclaredField	TokenNameIdentifier	 get Declared Field
(	TokenNameLPAREN	
"dummy1"	TokenNameStringLiteral	dummy1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
ofs1	TokenNameIdentifier	 ofs1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Number	TokenNameIdentifier	 Number
)	TokenNameRPAREN	
objectFieldOffsetM	TokenNameIdentifier	 object Field Offset M
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
theUnsafe	TokenNameIdentifier	 the Unsafe
,	TokenNameCOMMA	
dummy1Field	TokenNameIdentifier	 dummy1 Field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
dummy2Field	TokenNameIdentifier	 dummy2 Field
=	TokenNameEQUAL	
DummyTwoLongObject	TokenNameIdentifier	 Dummy Two Long Object
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getDeclaredField	TokenNameIdentifier	 get Declared Field
(	TokenNameLPAREN	
"dummy2"	TokenNameStringLiteral	dummy2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
ofs2	TokenNameIdentifier	 ofs2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Number	TokenNameIdentifier	 Number
)	TokenNameRPAREN	
objectFieldOffsetM	TokenNameIdentifier	 object Field Offset M
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
theUnsafe	TokenNameIdentifier	 the Unsafe
,	TokenNameCOMMA	
dummy2Field	TokenNameIdentifier	 dummy2 Field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
ofs2	TokenNameIdentifier	 ofs2
-	TokenNameMINUS	
ofs1	TokenNameIdentifier	 ofs1
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
NUM_BYTES_LONG	TokenNameIdentifier	 NUM  BYTES  LONG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
baseField	TokenNameIdentifier	 base Field
=	TokenNameEQUAL	
DummyOneFieldObject	TokenNameIdentifier	 Dummy One Field Object
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getDeclaredField	TokenNameIdentifier	 get Declared Field
(	TokenNameLPAREN	
"base"	TokenNameStringLiteral	base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
objectHeader	TokenNameIdentifier	 object Header
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Number	TokenNameIdentifier	 Number
)	TokenNameRPAREN	
objectFieldOffsetM	TokenNameIdentifier	 object Field Offset M
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
theUnsafe	TokenNameIdentifier	 the Unsafe
,	TokenNameCOMMA	
baseField	TokenNameIdentifier	 base Field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
supportedFeatures	TokenNameIdentifier	 supported Features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
JvmFeature	TokenNameIdentifier	 Jvm Feature
.	TokenNameDOT	
FIELD_OFFSETS	TokenNameIdentifier	 FIELD  OFFSETS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempObjectFieldOffsetMethod	TokenNameIdentifier	 temp Object Field Offset Method
=	TokenNameEQUAL	
objectFieldOffsetM	TokenNameIdentifier	 object Field Offset M
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ignore. 	TokenNameCOMMENT_LINE	Ignore. 
}	TokenNameRBRACE	
objectFieldOffsetMethod	TokenNameIdentifier	 object Field Offset Method
=	TokenNameEQUAL	
tempObjectFieldOffsetMethod	TokenNameIdentifier	 temp Object Field Offset Method
;	TokenNameSEMICOLON	
// Get the array header size by retrieving the array base offset 	TokenNameCOMMENT_LINE	Get the array header size by retrieving the array base offset 
// (offset of the first element of an array). 	TokenNameCOMMENT_LINE	(offset of the first element of an array). 
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
Method	TokenNameIdentifier	 Method
arrayBaseOffsetM	TokenNameIdentifier	 array Base Offset M
=	TokenNameEQUAL	
unsafeClass	TokenNameIdentifier	 unsafe Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"arrayBaseOffset"	TokenNameStringLiteral	arrayBaseOffset
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we calculate that only for byte[] arrays, it's actually the same for all types: 	TokenNameCOMMENT_LINE	we calculate that only for byte[] arrays, it's actually the same for all types: 
arrayHeader	TokenNameIdentifier	 array Header
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Number	TokenNameIdentifier	 Number
)	TokenNameRPAREN	
arrayBaseOffsetM	TokenNameIdentifier	 array Base Offset M
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
theUnsafe	TokenNameIdentifier	 the Unsafe
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
supportedFeatures	TokenNameIdentifier	 supported Features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
JvmFeature	TokenNameIdentifier	 Jvm Feature
.	TokenNameDOT	
ARRAY_HEADER_SIZE	TokenNameIdentifier	 ARRAY  HEADER  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ignore. 	TokenNameCOMMENT_LINE	Ignore. 
}	TokenNameRBRACE	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
=	TokenNameEQUAL	
referenceSize	TokenNameIdentifier	 reference Size
;	TokenNameSEMICOLON	
NUM_BYTES_OBJECT_HEADER	TokenNameIdentifier	 NUM  BYTES  OBJECT  HEADER
=	TokenNameEQUAL	
objectHeader	TokenNameIdentifier	 object Header
;	TokenNameSEMICOLON	
NUM_BYTES_ARRAY_HEADER	TokenNameIdentifier	 NUM  BYTES  ARRAY  HEADER
=	TokenNameEQUAL	
arrayHeader	TokenNameIdentifier	 array Header
;	TokenNameSEMICOLON	
// Try to get the object alignment (the default seems to be 8 on Hotspot, 	TokenNameCOMMENT_LINE	Try to get the object alignment (the default seems to be 8 on Hotspot, 
// regardless of the architecture). Retrieval only works with Java 6. 	TokenNameCOMMENT_LINE	regardless of the architecture). Retrieval only works with Java 6. 
int	TokenNameint	
objectAlignment	TokenNameIdentifier	 object Alignment
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
beanClazz	TokenNameIdentifier	 bean Clazz
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"com.sun.management.HotSpotDiagnosticMXBean"	TokenNameStringLiteral	com.sun.management.HotSpotDiagnosticMXBean
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
hotSpotBean	TokenNameIdentifier	 hot Spot Bean
=	TokenNameEQUAL	
ManagementFactory	TokenNameIdentifier	 Management Factory
.	TokenNameDOT	
newPlatformMXBeanProxy	TokenNameIdentifier	 new Platform MX Bean Proxy
(	TokenNameLPAREN	
ManagementFactory	TokenNameIdentifier	 Management Factory
.	TokenNameDOT	
getPlatformMBeanServer	TokenNameIdentifier	 get Platform M Bean Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"com.sun.management:type=HotSpotDiagnostic"	TokenNameStringLiteral	com.sun.management:type=HotSpotDiagnostic
,	TokenNameCOMMA	
beanClazz	TokenNameIdentifier	 bean Clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Method	TokenNameIdentifier	 Method
getVMOptionMethod	TokenNameIdentifier	 get VM Option Method
=	TokenNameEQUAL	
beanClazz	TokenNameIdentifier	 bean Clazz
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getVMOption"	TokenNameStringLiteral	getVMOption
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
vmOption	TokenNameIdentifier	 vm Option
=	TokenNameEQUAL	
getVMOptionMethod	TokenNameIdentifier	 get VM Option Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
hotSpotBean	TokenNameIdentifier	 hot Spot Bean
,	TokenNameCOMMA	
"ObjectAlignmentInBytes"	TokenNameStringLiteral	ObjectAlignmentInBytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
objectAlignment	TokenNameIdentifier	 object Alignment
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
vmOption	TokenNameIdentifier	 vm Option
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getValue"	TokenNameStringLiteral	getValue
)	TokenNameRPAREN	
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
vmOption	TokenNameIdentifier	 vm Option
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
supportedFeatures	TokenNameIdentifier	 supported Features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
JvmFeature	TokenNameIdentifier	 Jvm Feature
.	TokenNameDOT	
OBJECT_ALIGNMENT	TokenNameIdentifier	 OBJECT  ALIGNMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ignore. 	TokenNameCOMMENT_LINE	Ignore. 
}	TokenNameRBRACE	
NUM_BYTES_OBJECT_ALIGNMENT	TokenNameIdentifier	 NUM  BYTES  OBJECT  ALIGNMENT
=	TokenNameEQUAL	
objectAlignment	TokenNameIdentifier	 object Alignment
;	TokenNameSEMICOLON	
JVM_INFO_STRING	TokenNameIdentifier	 JVM  INFO  STRING
=	TokenNameEQUAL	
"[JVM: "	TokenNameStringLiteral	[JVM: 
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JVM_NAME	TokenNameIdentifier	 JVM  NAME
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JVM_VERSION	TokenNameIdentifier	 JVM  VERSION
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JVM_VENDOR	TokenNameIdentifier	 JVM  VENDOR
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JAVA_VENDOR	TokenNameIdentifier	 JAVA  VENDOR
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JAVA_VERSION	TokenNameIdentifier	 JAVA  VERSION
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cached information about a given class. */	TokenNameCOMMENT_JAVADOC	 Cached information about a given class. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
ClassCache	TokenNameIdentifier	 Class Cache
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
alignedShallowInstanceSize	TokenNameIdentifier	 aligned Shallow Instance Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
referenceFields	TokenNameIdentifier	 reference Fields
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ClassCache	TokenNameIdentifier	 Class Cache
(	TokenNameLPAREN	
long	TokenNamelong	
alignedShallowInstanceSize	TokenNameIdentifier	 aligned Shallow Instance Size
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
referenceFields	TokenNameIdentifier	 reference Fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
alignedShallowInstanceSize	TokenNameIdentifier	 aligned Shallow Instance Size
=	TokenNameEQUAL	
alignedShallowInstanceSize	TokenNameIdentifier	 aligned Shallow Instance Size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
referenceFields	TokenNameIdentifier	 reference Fields
=	TokenNameEQUAL	
referenceFields	TokenNameIdentifier	 reference Fields
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Object with just one field to determine the object header size by getting the offset of the dummy field: 	TokenNameCOMMENT_LINE	Object with just one field to determine the object header size by getting the offset of the dummy field: 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unused"	TokenNameStringLiteral	unused
)	TokenNameRPAREN	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
DummyOneFieldObject	TokenNameIdentifier	 Dummy One Field Object
{	TokenNameLBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Another test object for checking, if the difference in offsets of dummy1 and dummy2 is 8 bytes. 	TokenNameCOMMENT_LINE	Another test object for checking, if the difference in offsets of dummy1 and dummy2 is 8 bytes. 
// Only then we can be sure that those are real, unscaled offsets: 	TokenNameCOMMENT_LINE	Only then we can be sure that those are real, unscaled offsets: 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unused"	TokenNameStringLiteral	unused
)	TokenNameRPAREN	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
DummyTwoLongObject	TokenNameIdentifier	 Dummy Two Long Object
{	TokenNameLBRACE	
public	TokenNamepublic	
long	TokenNamelong	
dummy1	TokenNameIdentifier	 dummy1
,	TokenNameCOMMA	
dummy2	TokenNameIdentifier	 dummy2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true, if the current JVM is fully supported by {@code RamUsageEstimator}. * If this method returns {@code false} you are maybe using a 3rd party Java VM * that is not supporting Oracle/Sun private APIs. The memory estimates can be * imprecise then (no way of detecting compressed references, alignments, etc.). * Lucene still tries to use sensible defaults. */	TokenNameCOMMENT_JAVADOC	 Returns true, if the current JVM is fully supported by {@code RamUsageEstimator}. If this method returns {@code false} you are maybe using a 3rd party Java VM that is not supporting Oracle/Sun private APIs. The memory estimates can be imprecise then (no way of detecting compressed references, alignments, etc.). Lucene still tries to use sensible defaults. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isSupportedJVM	TokenNameIdentifier	 is Supported JVM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
supportedFeatures	TokenNameIdentifier	 supported Features
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
JvmFeature	TokenNameIdentifier	 Jvm Feature
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Aligns an object size to be the next multiple of {@link #NUM_BYTES_OBJECT_ALIGNMENT}. */	TokenNameCOMMENT_JAVADOC	 Aligns an object size to be the next multiple of {@link #NUM_BYTES_OBJECT_ALIGNMENT}. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
alignObjectSize	TokenNameIdentifier	 align Object Size
(	TokenNameLPAREN	
long	TokenNamelong	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
NUM_BYTES_OBJECT_ALIGNMENT	TokenNameIdentifier	 NUM  BYTES  OBJECT  ALIGNMENT
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
%	TokenNameREMAINDER	
NUM_BYTES_OBJECT_ALIGNMENT	TokenNameIdentifier	 NUM  BYTES  OBJECT  ALIGNMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the size in bytes of the byte[] object. */	TokenNameCOMMENT_JAVADOC	 Returns the size in bytes of the byte[] object. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arr	TokenNameIdentifier	 arr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
alignObjectSize	TokenNameIdentifier	 align Object Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
NUM_BYTES_ARRAY_HEADER	TokenNameIdentifier	 NUM  BYTES  ARRAY  HEADER
+	TokenNamePLUS	
arr	TokenNameIdentifier	 arr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the size in bytes of the boolean[] object. */	TokenNameCOMMENT_JAVADOC	 Returns the size in bytes of the boolean[] object. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arr	TokenNameIdentifier	 arr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
alignObjectSize	TokenNameIdentifier	 align Object Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
NUM_BYTES_ARRAY_HEADER	TokenNameIdentifier	 NUM  BYTES  ARRAY  HEADER
+	TokenNamePLUS	
arr	TokenNameIdentifier	 arr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the size in bytes of the char[] object. */	TokenNameCOMMENT_JAVADOC	 Returns the size in bytes of the char[] object. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arr	TokenNameIdentifier	 arr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
alignObjectSize	TokenNameIdentifier	 align Object Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
NUM_BYTES_ARRAY_HEADER	TokenNameIdentifier	 NUM  BYTES  ARRAY  HEADER
+	TokenNamePLUS	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
NUM_BYTES_CHAR	TokenNameIdentifier	 NUM  BYTES  CHAR
*	TokenNameMULTIPLY	
arr	TokenNameIdentifier	 arr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the size in bytes of the short[] object. */	TokenNameCOMMENT_JAVADOC	 Returns the size in bytes of the short[] object. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arr	TokenNameIdentifier	 arr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
alignObjectSize	TokenNameIdentifier	 align Object Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
NUM_BYTES_ARRAY_HEADER	TokenNameIdentifier	 NUM  BYTES  ARRAY  HEADER
+	TokenNamePLUS	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
NUM_BYTES_SHORT	TokenNameIdentifier	 NUM  BYTES  SHORT
*	TokenNameMULTIPLY	
arr	TokenNameIdentifier	 arr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the size in bytes of the int[] object. */	TokenNameCOMMENT_JAVADOC	 Returns the size in bytes of the int[] object. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arr	TokenNameIdentifier	 arr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
alignObjectSize	TokenNameIdentifier	 align Object Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
NUM_BYTES_ARRAY_HEADER	TokenNameIdentifier	 NUM  BYTES  ARRAY  HEADER
+	TokenNamePLUS	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
*	TokenNameMULTIPLY	
arr	TokenNameIdentifier	 arr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the size in bytes of the float[] object. */	TokenNameCOMMENT_JAVADOC	 Returns the size in bytes of the float[] object. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arr	TokenNameIdentifier	 arr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
alignObjectSize	TokenNameIdentifier	 align Object Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
NUM_BYTES_ARRAY_HEADER	TokenNameIdentifier	 NUM  BYTES  ARRAY  HEADER
+	TokenNamePLUS	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
NUM_BYTES_FLOAT	TokenNameIdentifier	 NUM  BYTES  FLOAT
*	TokenNameMULTIPLY	
arr	TokenNameIdentifier	 arr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the size in bytes of the long[] object. */	TokenNameCOMMENT_JAVADOC	 Returns the size in bytes of the long[] object. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arr	TokenNameIdentifier	 arr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
alignObjectSize	TokenNameIdentifier	 align Object Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
NUM_BYTES_ARRAY_HEADER	TokenNameIdentifier	 NUM  BYTES  ARRAY  HEADER
+	TokenNamePLUS	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
NUM_BYTES_LONG	TokenNameIdentifier	 NUM  BYTES  LONG
*	TokenNameMULTIPLY	
arr	TokenNameIdentifier	 arr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the size in bytes of the double[] object. */	TokenNameCOMMENT_JAVADOC	 Returns the size in bytes of the double[] object. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arr	TokenNameIdentifier	 arr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
alignObjectSize	TokenNameIdentifier	 align Object Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
NUM_BYTES_ARRAY_HEADER	TokenNameIdentifier	 NUM  BYTES  ARRAY  HEADER
+	TokenNamePLUS	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
NUM_BYTES_DOUBLE	TokenNameIdentifier	 NUM  BYTES  DOUBLE
*	TokenNameMULTIPLY	
arr	TokenNameIdentifier	 arr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Estimates the RAM usage by the given object. It will * walk the object tree and sum up all referenced objects. * * <p><b>Resource Usage:</b> This method internally uses a set of * every object seen during traversals so it does allocate memory * (it isn't side-effect free). After the method exits, this memory * should be GCed.</p> */	TokenNameCOMMENT_JAVADOC	 Estimates the RAM usage by the given object. It will walk the object tree and sum up all referenced objects. * <p><b>Resource Usage:</b> This method internally uses a set of every object seen during traversals so it does allocate memory (it isn't side-effect free). After the method exits, this memory should be GCed.</p> 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
measureObjectSize	TokenNameIdentifier	 measure Object Size
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Estimates a "shallow" memory usage of the given object. For arrays, this will be the * memory taken by array storage (no subreferences will be followed). For objects, this * will be the memory taken by the fields. * * JVM object alignments are also applied. */	TokenNameCOMMENT_JAVADOC	 Estimates a "shallow" memory usage of the given object. For arrays, this will be the memory taken by array storage (no subreferences will be followed). For objects, this will be the memory taken by the fields. * JVM object alignments are also applied. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
shallowSizeOf	TokenNameIdentifier	 shallow Size Of
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
clz	TokenNameIdentifier	 clz
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clz	TokenNameIdentifier	 clz
.	TokenNameDOT	
isArray	TokenNameIdentifier	 is Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
shallowSizeOfArray	TokenNameIdentifier	 shallow Size Of Array
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
shallowSizeOfInstance	TokenNameIdentifier	 shallow Size Of Instance
(	TokenNameLPAREN	
clz	TokenNameIdentifier	 clz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the shallow instance size in bytes an instance of the given class would occupy. * This works with all conventional classes and primitive types, but not with arrays * (the size then depends on the number of elements and varies from object to object). * * @see #shallowSizeOf(Object) * @throws IllegalArgumentException if {@code clazz} is an array class. */	TokenNameCOMMENT_JAVADOC	 Returns the shallow instance size in bytes an instance of the given class would occupy. This works with all conventional classes and primitive types, but not with arrays (the size then depends on the number of elements and varies from object to object). * @see #shallowSizeOf(Object) @throws IllegalArgumentException if {@code clazz} is an array class. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
shallowSizeOfInstance	TokenNameIdentifier	 shallow Size Of Instance
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
isArray	TokenNameIdentifier	 is Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"This method does not work with array classes."	TokenNameStringLiteral	This method does not work with array classes.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
isPrimitive	TokenNameIdentifier	 is Primitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
primitiveSizes	TokenNameIdentifier	 primitive Sizes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
NUM_BYTES_OBJECT_HEADER	TokenNameIdentifier	 NUM  BYTES  OBJECT  HEADER
;	TokenNameSEMICOLON	
// Walk type hierarchy 	TokenNameCOMMENT_LINE	Walk type hierarchy 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
clazz	TokenNameIdentifier	 clazz
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getSuperclass	TokenNameIdentifier	 get Superclass
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getDeclaredFields	TokenNameIdentifier	 get Declared Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Field	TokenNameIdentifier	 Field
f	TokenNameIdentifier	 f
:	TokenNameCOLON	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
isStatic	TokenNameIdentifier	 is Static
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
adjustForField	TokenNameIdentifier	 adjust For Field
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
alignObjectSize	TokenNameIdentifier	 align Object Size
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return shallow size of any <code>array</code>. */	TokenNameCOMMENT_JAVADOC	 Return shallow size of any <code>array</code>. 
private	TokenNameprivate	
static	TokenNamestatic	
long	TokenNamelong	
shallowSizeOfArray	TokenNameIdentifier	 shallow Size Of Array
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
NUM_BYTES_ARRAY_HEADER	TokenNameIdentifier	 NUM  BYTES  ARRAY  HEADER
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
Array	TokenNameIdentifier	 Array
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
arrayElementClazz	TokenNameIdentifier	 array Element Clazz
=	TokenNameEQUAL	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getComponentType	TokenNameIdentifier	 get Component Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arrayElementClazz	TokenNameIdentifier	 array Element Clazz
.	TokenNameDOT	
isPrimitive	TokenNameIdentifier	 is Primitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
*	TokenNameMULTIPLY	
primitiveSizes	TokenNameIdentifier	 primitive Sizes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
arrayElementClazz	TokenNameIdentifier	 array Element Clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
*	TokenNameMULTIPLY	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
alignObjectSize	TokenNameIdentifier	 align Object Size
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Non-recursive version of object descend. This consumes more memory than recursive in-depth * traversal but prevents stack overflows on long chains of objects * or complex graphs (a max. recursion depth on my machine was ~5000 objects linked in a chain * so not too much). */	TokenNameCOMMENT_BLOCK	 Non-recursive version of object descend. This consumes more memory than recursive in-depth traversal but prevents stack overflows on long chains of objects or complex graphs (a max. recursion depth on my machine was ~5000 objects linked in a chain so not too much). 
private	TokenNameprivate	
static	TokenNamestatic	
long	TokenNamelong	
measureObjectSize	TokenNameIdentifier	 measure Object Size
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
boolean	TokenNameboolean	
checkInterned	TokenNameIdentifier	 check Interned
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Objects seen so far. 	TokenNameCOMMENT_LINE	Objects seen so far. 
final	TokenNamefinal	
IdentityHashSet	TokenNameIdentifier	 Identity Hash Set
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
seen	TokenNameIdentifier	 seen
=	TokenNameEQUAL	
new	TokenNamenew	
IdentityHashSet	TokenNameIdentifier	 Identity Hash Set
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Class cache with reference Field and precalculated shallow size. 	TokenNameCOMMENT_LINE	Class cache with reference Field and precalculated shallow size. 
final	TokenNamefinal	
IdentityHashMap	TokenNameIdentifier	 Identity Hash Map
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
,	TokenNameCOMMA	
ClassCache	TokenNameIdentifier	 Class Cache
>	TokenNameGREATER	
classCache	TokenNameIdentifier	 class Cache
=	TokenNameEQUAL	
new	TokenNamenew	
IdentityHashMap	TokenNameIdentifier	 Identity Hash Map
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
,	TokenNameCOMMA	
ClassCache	TokenNameIdentifier	 Class Cache
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Stack of objects pending traversal. Recursion caused stack overflows. 	TokenNameCOMMENT_LINE	Stack of objects pending traversal. Recursion caused stack overflows. 
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
totalSize	TokenNameIdentifier	 total Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
ob	TokenNameIdentifier	 ob
=	TokenNameEQUAL	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ob	TokenNameIdentifier	 ob
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
seen	TokenNameIdentifier	 seen
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
ob	TokenNameIdentifier	 ob
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
seen	TokenNameIdentifier	 seen
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ob	TokenNameIdentifier	 ob
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// *** BEGIN deprecation 	TokenNameCOMMENT_LINE	*** BEGIN deprecation 
if	TokenNameif	
(	TokenNameLPAREN	
checkInterned	TokenNameIdentifier	 check Interned
&&	TokenNameAND_AND	
ob	TokenNameIdentifier	 ob
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
&&	TokenNameAND_AND	
ob	TokenNameIdentifier	 ob
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
ob	TokenNameIdentifier	 ob
)	TokenNameRPAREN	
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// *** END deprecation 	TokenNameCOMMENT_LINE	*** END deprecation 
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
obClazz	TokenNameIdentifier	 ob Clazz
=	TokenNameEQUAL	
ob	TokenNameIdentifier	 ob
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obClazz	TokenNameIdentifier	 ob Clazz
.	TokenNameDOT	
isArray	TokenNameIdentifier	 is Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * Consider an array, possibly of primitive types. Push any of its references to * the processing stack and accumulate this array's shallow size. */	TokenNameCOMMENT_BLOCK	 Consider an array, possibly of primitive types. Push any of its references to the processing stack and accumulate this array's shallow size. 
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
NUM_BYTES_ARRAY_HEADER	TokenNameIdentifier	 NUM  BYTES  ARRAY  HEADER
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
Array	TokenNameIdentifier	 Array
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
ob	TokenNameIdentifier	 ob
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
componentClazz	TokenNameIdentifier	 component Clazz
=	TokenNameEQUAL	
obClazz	TokenNameIdentifier	 ob Clazz
.	TokenNameDOT	
getComponentType	TokenNameIdentifier	 get Component Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
componentClazz	TokenNameIdentifier	 component Clazz
.	TokenNameDOT	
isPrimitive	TokenNameIdentifier	 is Primitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
*	TokenNameMULTIPLY	
primitiveSizes	TokenNameIdentifier	 primitive Sizes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
componentClazz	TokenNameIdentifier	 component Clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
*	TokenNameMULTIPLY	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
// Push refs for traversal later. 	TokenNameCOMMENT_LINE	Push refs for traversal later. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
Array	TokenNameIdentifier	 Array
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ob	TokenNameIdentifier	 ob
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
seen	TokenNameIdentifier	 seen
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
totalSize	TokenNameIdentifier	 total Size
+=	TokenNamePLUS_EQUAL	
alignObjectSize	TokenNameIdentifier	 align Object Size
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
/* * Consider an object. Push any references it has to the processing stack * and accumulate this object's shallow size. */	TokenNameCOMMENT_BLOCK	 Consider an object. Push any references it has to the processing stack and accumulate this object's shallow size. 
try	TokenNametry	
{	TokenNameLBRACE	
ClassCache	TokenNameIdentifier	 Class Cache
cachedInfo	TokenNameIdentifier	 cached Info
=	TokenNameEQUAL	
classCache	TokenNameIdentifier	 class Cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
obClazz	TokenNameIdentifier	 ob Clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cachedInfo	TokenNameIdentifier	 cached Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classCache	TokenNameIdentifier	 class Cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
obClazz	TokenNameIdentifier	 ob Clazz
,	TokenNameCOMMA	
cachedInfo	TokenNameIdentifier	 cached Info
=	TokenNameEQUAL	
createCacheEntry	TokenNameIdentifier	 create Cache Entry
(	TokenNameLPAREN	
obClazz	TokenNameIdentifier	 ob Clazz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Field	TokenNameIdentifier	 Field
f	TokenNameIdentifier	 f
:	TokenNameCOLON	
cachedInfo	TokenNameIdentifier	 cached Info
.	TokenNameDOT	
referenceFields	TokenNameIdentifier	 reference Fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fast path to eliminate redundancies. 	TokenNameCOMMENT_LINE	Fast path to eliminate redundancies. 
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ob	TokenNameIdentifier	 ob
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
seen	TokenNameIdentifier	 seen
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
totalSize	TokenNameIdentifier	 total Size
+=	TokenNamePLUS_EQUAL	
cachedInfo	TokenNameIdentifier	 cached Info
.	TokenNameDOT	
alignedShallowInstanceSize	TokenNameIdentifier	 aligned Shallow Instance Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this should never happen as we enabled setAccessible(). 	TokenNameCOMMENT_LINE	this should never happen as we enabled setAccessible(). 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Reflective field access failed?"	TokenNameStringLiteral	Reflective field access failed?
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Help the GC (?). 	TokenNameCOMMENT_LINE	Help the GC (?). 
seen	TokenNameIdentifier	 seen
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classCache	TokenNameIdentifier	 class Cache
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
totalSize	TokenNameIdentifier	 total Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a cached information about shallow size and reference fields for * a given class. */	TokenNameCOMMENT_JAVADOC	 Create a cached information about shallow size and reference fields for a given class. 
private	TokenNameprivate	
static	TokenNamestatic	
ClassCache	TokenNameIdentifier	 Class Cache
createCacheEntry	TokenNameIdentifier	 create Cache Entry
(	TokenNameLPAREN	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassCache	TokenNameIdentifier	 Class Cache
cachedInfo	TokenNameIdentifier	 cached Info
;	TokenNameSEMICOLON	
long	TokenNamelong	
shallowInstanceSize	TokenNameIdentifier	 shallow Instance Size
=	TokenNameEQUAL	
NUM_BYTES_OBJECT_HEADER	TokenNameIdentifier	 NUM  BYTES  OBJECT  HEADER
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Field	TokenNameIdentifier	 Field
>	TokenNameGREATER	
referenceFields	TokenNameIdentifier	 reference Fields
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Field	TokenNameIdentifier	 Field
>	TokenNameGREATER	
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getSuperclass	TokenNameIdentifier	 get Superclass
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getDeclaredFields	TokenNameIdentifier	 get Declared Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
f	TokenNameIdentifier	 f
:	TokenNameCOLON	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
isStatic	TokenNameIdentifier	 is Static
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
shallowInstanceSize	TokenNameIdentifier	 shallow Instance Size
=	TokenNameEQUAL	
adjustForField	TokenNameIdentifier	 adjust For Field
(	TokenNameLPAREN	
shallowInstanceSize	TokenNameIdentifier	 shallow Instance Size
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isPrimitive	TokenNameIdentifier	 is Primitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setAccessible	TokenNameIdentifier	 set Accessible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
referenceFields	TokenNameIdentifier	 reference Fields
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
cachedInfo	TokenNameIdentifier	 cached Info
=	TokenNameEQUAL	
new	TokenNamenew	
ClassCache	TokenNameIdentifier	 Class Cache
(	TokenNameLPAREN	
alignObjectSize	TokenNameIdentifier	 align Object Size
(	TokenNameLPAREN	
shallowInstanceSize	TokenNameIdentifier	 shallow Instance Size
)	TokenNameRPAREN	
,	TokenNameCOMMA	
referenceFields	TokenNameIdentifier	 reference Fields
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
referenceFields	TokenNameIdentifier	 reference Fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cachedInfo	TokenNameIdentifier	 cached Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method returns the maximum representation size of an object. <code>sizeSoFar</code> * is the object's size measured so far. <code>f</code> is the field being probed. * * <p>The returned offset will be the maximum of whatever was measured so far and * <code>f</code> field's offset and representation size (unaligned). */	TokenNameCOMMENT_JAVADOC	 This method returns the maximum representation size of an object. <code>sizeSoFar</code> is the object's size measured so far. <code>f</code> is the field being probed. * <p>The returned offset will be the maximum of whatever was measured so far and <code>f</code> field's offset and representation size (unaligned). 
private	TokenNameprivate	
static	TokenNamestatic	
long	TokenNamelong	
adjustForField	TokenNameIdentifier	 adjust For Field
(	TokenNameLPAREN	
long	TokenNamelong	
sizeSoFar	TokenNameIdentifier	 size So Far
,	TokenNameCOMMA	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
fsize	TokenNameIdentifier	 fsize
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
isPrimitive	TokenNameIdentifier	 is Primitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
primitiveSizes	TokenNameIdentifier	 primitive Sizes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
:	TokenNameCOLON	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
objectFieldOffsetMethod	TokenNameIdentifier	 object Field Offset Method
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
offsetPlusSize	TokenNameIdentifier	 offset Plus Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Number	TokenNameIdentifier	 Number
)	TokenNameRPAREN	
objectFieldOffsetMethod	TokenNameIdentifier	 object Field Offset Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
theUnsafe	TokenNameIdentifier	 the Unsafe
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
fsize	TokenNameIdentifier	 fsize
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
sizeSoFar	TokenNameIdentifier	 size So Far
,	TokenNameCOMMA	
offsetPlusSize	TokenNameIdentifier	 offset Plus Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Access problem with sun.misc.Unsafe"	TokenNameStringLiteral	Access problem with sun.misc.Unsafe
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
ite	TokenNameIdentifier	 ite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
=	TokenNameEQUAL	
ite	TokenNameIdentifier	 ite
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
instanceof	TokenNameinstanceof	
RuntimeException	TokenNameIdentifier	 Runtime Exception
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
instanceof	TokenNameinstanceof	
Error	TokenNameIdentifier	 Error
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
Error	TokenNameIdentifier	 Error
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
;	TokenNameSEMICOLON	
// this should never happen (Unsafe does not declare 	TokenNameCOMMENT_LINE	this should never happen (Unsafe does not declare 
// checked Exceptions for this method), but who knows? 	TokenNameCOMMENT_LINE	checked Exceptions for this method), but who knows? 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Call to Unsafe's objectFieldOffset() throwed "	TokenNameStringLiteral	Call to Unsafe's objectFieldOffset() throwed 
+	TokenNamePLUS	
"checked Exception when accessing field "	TokenNameStringLiteral	checked Exception when accessing field 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getDeclaringClass	TokenNameIdentifier	 get Declaring Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"#"	TokenNameStringLiteral	#
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// TODO: No alignments based on field type/ subclass fields alignments? 	TokenNameCOMMENT_LINE	TODO: No alignments based on field type/ subclass fields alignments? 
return	TokenNamereturn	
sizeSoFar	TokenNameIdentifier	 size So Far
+	TokenNamePLUS	
fsize	TokenNameIdentifier	 fsize
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Return the set of unsupported JVM features that improve the estimation. */	TokenNameCOMMENT_JAVADOC	 Return the set of unsupported JVM features that improve the estimation. 
public	TokenNamepublic	
static	TokenNamestatic	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
JvmFeature	TokenNameIdentifier	 Jvm Feature
>	TokenNameGREATER	
getUnsupportedFeatures	TokenNameIdentifier	 get Unsupported Features
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
JvmFeature	TokenNameIdentifier	 Jvm Feature
>	TokenNameGREATER	
unsupported	TokenNameIdentifier	 unsupported
=	TokenNameEQUAL	
EnumSet	TokenNameIdentifier	 Enum Set
.	TokenNameDOT	
allOf	TokenNameIdentifier	 all Of
(	TokenNameLPAREN	
JvmFeature	TokenNameIdentifier	 Jvm Feature
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unsupported	TokenNameIdentifier	 unsupported
.	TokenNameDOT	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
supportedFeatures	TokenNameIdentifier	 supported Features
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
unsupported	TokenNameIdentifier	 unsupported
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the set of supported JVM features that improve the estimation. */	TokenNameCOMMENT_JAVADOC	 Return the set of supported JVM features that improve the estimation. 
public	TokenNamepublic	
static	TokenNamestatic	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
JvmFeature	TokenNameIdentifier	 Jvm Feature
>	TokenNameGREATER	
getSupportedFeatures	TokenNameIdentifier	 get Supported Features
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
EnumSet	TokenNameIdentifier	 Enum Set
.	TokenNameDOT	
copyOf	TokenNameIdentifier	 copy Of
(	TokenNameLPAREN	
supportedFeatures	TokenNameIdentifier	 supported Features
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>size</code> in human-readable units (GB, MB, KB or bytes). */	TokenNameCOMMENT_JAVADOC	 Returns <code>size</code> in human-readable units (GB, MB, KB or bytes). 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
humanReadableUnits	TokenNameIdentifier	 human Readable Units
(	TokenNameLPAREN	
long	TokenNamelong	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
humanReadableUnits	TokenNameIdentifier	 human Readable Units
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
new	TokenNamenew	
DecimalFormat	TokenNameIdentifier	 Decimal Format
(	TokenNameLPAREN	
"0.#"	TokenNameStringLiteral	0.#
,	TokenNameCOMMA	
new	TokenNamenew	
DecimalFormatSymbols	TokenNameIdentifier	 Decimal Format Symbols
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>size</code> in human-readable units (GB, MB, KB or bytes). */	TokenNameCOMMENT_JAVADOC	 Returns <code>size</code> in human-readable units (GB, MB, KB or bytes). 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
humanReadableUnits	TokenNameIdentifier	 human Readable Units
(	TokenNameLPAREN	
long	TokenNamelong	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
DecimalFormat	TokenNameIdentifier	 Decimal Format
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
/	TokenNameDIVIDE	
ONE_GB	TokenNameIdentifier	 ONE  GB
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
bytes	TokenNameIdentifier	 bytes
/	TokenNameDIVIDE	
ONE_GB	TokenNameIdentifier	 ONE  GB
)	TokenNameRPAREN	
+	TokenNamePLUS	
" GB"	TokenNameStringLiteral	 GB
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
/	TokenNameDIVIDE	
ONE_MB	TokenNameIdentifier	 ONE  MB
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
bytes	TokenNameIdentifier	 bytes
/	TokenNameDIVIDE	
ONE_MB	TokenNameIdentifier	 ONE  MB
)	TokenNameRPAREN	
+	TokenNamePLUS	
" MB"	TokenNameStringLiteral	 MB
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
/	TokenNameDIVIDE	
ONE_KB	TokenNameIdentifier	 ONE  KB
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
bytes	TokenNameIdentifier	 bytes
/	TokenNameDIVIDE	
ONE_KB	TokenNameIdentifier	 ONE  KB
)	TokenNameRPAREN	
+	TokenNamePLUS	
" KB"	TokenNameStringLiteral	 KB
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
bytes	TokenNameIdentifier	 bytes
+	TokenNamePLUS	
" bytes"	TokenNameStringLiteral	 bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return a human-readable size of a given object. * @see #sizeOf(Object) * @see #humanReadableUnits(long) */	TokenNameCOMMENT_JAVADOC	 Return a human-readable size of a given object. @see #sizeOf(Object) @see #humanReadableUnits(long) 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
humanSizeOf	TokenNameIdentifier	 human Size Of
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
humanReadableUnits	TokenNameIdentifier	 human Readable Units
(	TokenNameLPAREN	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An identity hash set implemented using open addressing. No null keys are allowed. * * TODO: If this is useful outside this class, make it public - needs some work */	TokenNameCOMMENT_JAVADOC	 An identity hash set implemented using open addressing. No null keys are allowed. * TODO: If this is useful outside this class, make it public - needs some work 
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
IdentityHashSet	TokenNameIdentifier	 Identity Hash Set
<	TokenNameLESS	
KType	TokenNameIdentifier	 K Type
>	TokenNameGREATER	
implements	TokenNameimplements	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
KType	TokenNameIdentifier	 K Type
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** * Default load factor. */	TokenNameCOMMENT_JAVADOC	 Default load factor. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
float	TokenNamefloat	
DEFAULT_LOAD_FACTOR	TokenNameIdentifier	 DEFAULT  LOAD  FACTOR
=	TokenNameEQUAL	
0.75f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
/** * Minimum capacity for the set. */	TokenNameCOMMENT_JAVADOC	 Minimum capacity for the set. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
MIN_CAPACITY	TokenNameIdentifier	 MIN  CAPACITY
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * All of set entries. Always of power of two length. */	TokenNameCOMMENT_JAVADOC	 All of set entries. Always of power of two length. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
/** * Cached number of assigned slots. */	TokenNameCOMMENT_JAVADOC	 Cached number of assigned slots. 
public	TokenNamepublic	
int	TokenNameint	
assigned	TokenNameIdentifier	 assigned
;	TokenNameSEMICOLON	
/** * The load factor for this set (fraction of allocated or deleted slots before * the buffers must be rehashed or reallocated). */	TokenNameCOMMENT_JAVADOC	 The load factor for this set (fraction of allocated or deleted slots before the buffers must be rehashed or reallocated). 
public	TokenNamepublic	
final	TokenNamefinal	
float	TokenNamefloat	
loadFactor	TokenNameIdentifier	 load Factor
;	TokenNameSEMICOLON	
/** * Cached capacity threshold at which we must resize the buffers. */	TokenNameCOMMENT_JAVADOC	 Cached capacity threshold at which we must resize the buffers. 
private	TokenNameprivate	
int	TokenNameint	
resizeThreshold	TokenNameIdentifier	 resize Threshold
;	TokenNameSEMICOLON	
/** * Creates a hash set with the default capacity of 16. * load factor of {@value #DEFAULT_LOAD_FACTOR}. ` */	TokenNameCOMMENT_JAVADOC	 Creates a hash set with the default capacity of 16. load factor of {@value #DEFAULT_LOAD_FACTOR}. ` 
public	TokenNamepublic	
IdentityHashSet	TokenNameIdentifier	 Identity Hash Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DEFAULT_LOAD_FACTOR	TokenNameIdentifier	 DEFAULT  LOAD  FACTOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a hash set with the given capacity, load factor of * {@value #DEFAULT_LOAD_FACTOR}. */	TokenNameCOMMENT_JAVADOC	 Creates a hash set with the given capacity, load factor of {@value #DEFAULT_LOAD_FACTOR}. 
public	TokenNamepublic	
IdentityHashSet	TokenNameIdentifier	 Identity Hash Set
(	TokenNameLPAREN	
int	TokenNameint	
initialCapacity	TokenNameIdentifier	 initial Capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
initialCapacity	TokenNameIdentifier	 initial Capacity
,	TokenNameCOMMA	
DEFAULT_LOAD_FACTOR	TokenNameIdentifier	 DEFAULT  LOAD  FACTOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a hash set with the given capacity and load factor. */	TokenNameCOMMENT_JAVADOC	 Creates a hash set with the given capacity and load factor. 
public	TokenNamepublic	
IdentityHashSet	TokenNameIdentifier	 Identity Hash Set
(	TokenNameLPAREN	
int	TokenNameint	
initialCapacity	TokenNameIdentifier	 initial Capacity
,	TokenNameCOMMA	
float	TokenNamefloat	
loadFactor	TokenNameIdentifier	 load Factor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialCapacity	TokenNameIdentifier	 initial Capacity
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
MIN_CAPACITY	TokenNameIdentifier	 MIN  CAPACITY
,	TokenNameCOMMA	
initialCapacity	TokenNameIdentifier	 initial Capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
initialCapacity	TokenNameIdentifier	 initial Capacity
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"Initial capacity must be between (0, "	TokenNameStringLiteral	Initial capacity must be between (0, 
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
;	TokenNameSEMICOLON	
assert	TokenNameassert	
loadFactor	TokenNameIdentifier	 load Factor
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
loadFactor	TokenNameIdentifier	 load Factor
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"Load factor must be between (0, 1)."	TokenNameStringLiteral	Load factor must be between (0, 1).
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
loadFactor	TokenNameIdentifier	 load Factor
=	TokenNameEQUAL	
loadFactor	TokenNameIdentifier	 load Factor
;	TokenNameSEMICOLON	
allocateBuffers	TokenNameIdentifier	 allocate Buffers
(	TokenNameLPAREN	
roundCapacity	TokenNameIdentifier	 round Capacity
(	TokenNameLPAREN	
initialCapacity	TokenNameIdentifier	 initial Capacity
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a reference to the set. Null keys are not allowed. */	TokenNameCOMMENT_JAVADOC	 Adds a reference to the set. Null keys are not allowed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
KType	TokenNameIdentifier	 K Type
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
"Null keys not allowed."	TokenNameStringLiteral	Null keys not allowed.
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
assigned	TokenNameIdentifier	 assigned
>=	TokenNameGREATER_EQUAL	
resizeThreshold	TokenNameIdentifier	 resize Threshold
)	TokenNameRPAREN	
expandAndRehash	TokenNameIdentifier	 expand And Rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
mask	TokenNameIdentifier	 mask
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
existing	TokenNameIdentifier	 existing
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
existing	TokenNameIdentifier	 existing
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
==	TokenNameEQUAL_EQUAL	
existing	TokenNameIdentifier	 existing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// already found. 	TokenNameCOMMENT_LINE	already found. 
}	TokenNameRBRACE	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assigned	TokenNameIdentifier	 assigned
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if the set contains a given ref. */	TokenNameCOMMENT_JAVADOC	 Checks if the set contains a given ref. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
KType	TokenNameIdentifier	 K Type
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
mask	TokenNameIdentifier	 mask
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
existing	TokenNameIdentifier	 existing
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
existing	TokenNameIdentifier	 existing
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
==	TokenNameEQUAL_EQUAL	
existing	TokenNameIdentifier	 existing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Rehash via MurmurHash. * * <p>The implementation is based on the * finalization step from Austin Appleby's * <code>MurmurHash3</code>. * * @see "http://sites.google.com/site/murmurhash/" */	TokenNameCOMMENT_JAVADOC	 Rehash via MurmurHash. * <p>The implementation is based on the finalization step from Austin Appleby's <code>MurmurHash3</code>. * @see "http://sites.google.com/site/murmurhash/" 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
identityHashCode	TokenNameIdentifier	 identity Hash Code
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
^=	TokenNameXOR_EQUAL	
k	TokenNameIdentifier	 k
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
*=	TokenNameMULTIPLY_EQUAL	
0x85ebca6b	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
^=	TokenNameXOR_EQUAL	
k	TokenNameIdentifier	 k
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
*=	TokenNameMULTIPLY_EQUAL	
0xc2b2ae35	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
^=	TokenNameXOR_EQUAL	
k	TokenNameIdentifier	 k
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expand the internal storage buffers (capacity) or rehash current keys and * values if there are a lot of deleted slots. */	TokenNameCOMMENT_JAVADOC	 Expand the internal storage buffers (capacity) or rehash current keys and values if there are a lot of deleted slots. 
private	TokenNameprivate	
void	TokenNamevoid	
expandAndRehash	TokenNameIdentifier	 expand And Rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldKeys	TokenNameIdentifier	 old Keys
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
assert	TokenNameassert	
assigned	TokenNameIdentifier	 assigned
>=	TokenNameGREATER_EQUAL	
resizeThreshold	TokenNameIdentifier	 resize Threshold
;	TokenNameSEMICOLON	
allocateBuffers	TokenNameIdentifier	 allocate Buffers
(	TokenNameLPAREN	
nextCapacity	TokenNameIdentifier	 next Capacity
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * Rehash all assigned slots from the old hash table. */	TokenNameCOMMENT_BLOCK	 Rehash all assigned slots from the old hash table. 
final	TokenNamefinal	
int	TokenNameint	
mask	TokenNameIdentifier	 mask
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
oldKeys	TokenNameIdentifier	 old Keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
oldKeys	TokenNameIdentifier	 old Keys
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
oldKeys	TokenNameIdentifier	 old Keys
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Allocate internal buffers for a given capacity. * * @param capacity * New capacity (must be a power of two). */	TokenNameCOMMENT_JAVADOC	 Allocate internal buffers for a given capacity. * @param capacity New capacity (must be a power of two). 
private	TokenNameprivate	
void	TokenNamevoid	
allocateBuffers	TokenNameIdentifier	 allocate Buffers
(	TokenNameLPAREN	
int	TokenNameint	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
capacity	TokenNameIdentifier	 capacity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
resizeThreshold	TokenNameIdentifier	 resize Threshold
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
capacity	TokenNameIdentifier	 capacity
*	TokenNameMULTIPLY	
DEFAULT_LOAD_FACTOR	TokenNameIdentifier	 DEFAULT  LOAD  FACTOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the next possible capacity, counting from the current buffers' size. */	TokenNameCOMMENT_JAVADOC	 Return the next possible capacity, counting from the current buffers' size. 
protected	TokenNameprotected	
int	TokenNameint	
nextCapacity	TokenNameIdentifier	 next Capacity
(	TokenNameLPAREN	
int	TokenNameint	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
current	TokenNameIdentifier	 current
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
bitCount	TokenNameIdentifier	 bit Count
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"Capacity must be a power of two."	TokenNameStringLiteral	Capacity must be a power of two.
;	TokenNameSEMICOLON	
assert	TokenNameassert	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"Maximum capacity exceeded ("	TokenNameStringLiteral	Maximum capacity exceeded (
+	TokenNamePLUS	
(	TokenNameLPAREN	
0x80000000	TokenNameIntegerLiteral	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")."	TokenNameStringLiteral	).
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
<	TokenNameLESS	
MIN_CAPACITY	TokenNameIdentifier	 MIN  CAPACITY
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
MIN_CAPACITY	TokenNameIdentifier	 MIN  CAPACITY
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Round the capacity to the next allowed value. */	TokenNameCOMMENT_JAVADOC	 Round the capacity to the next allowed value. 
protected	TokenNameprotected	
int	TokenNameint	
roundCapacity	TokenNameIdentifier	 round Capacity
(	TokenNameLPAREN	
int	TokenNameint	
requestedCapacity	TokenNameIdentifier	 requested Capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Maximum positive integer that is a power of two. 	TokenNameCOMMENT_LINE	Maximum positive integer that is a power of two. 
if	TokenNameif	
(	TokenNameLPAREN	
requestedCapacity	TokenNameIdentifier	 requested Capacity
>	TokenNameGREATER	
(	TokenNameLPAREN	
0x80000000	TokenNameIntegerLiteral	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
0x80000000	TokenNameIntegerLiteral	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
capacity	TokenNameIdentifier	 capacity
=	TokenNameEQUAL	
MIN_CAPACITY	TokenNameIdentifier	 MIN  CAPACITY
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
capacity	TokenNameIdentifier	 capacity
<	TokenNameLESS	
requestedCapacity	TokenNameIdentifier	 requested Capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
capacity	TokenNameIdentifier	 capacity
<<=	TokenNameLEFT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
capacity	TokenNameIdentifier	 capacity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assigned	TokenNameIdentifier	 assigned
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
assigned	TokenNameIdentifier	 assigned
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
KType	TokenNameIdentifier	 K Type
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
KType	TokenNameIdentifier	 K Type
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
nextElement	TokenNameIdentifier	 next Element
=	TokenNameEQUAL	
fetchNext	TokenNameIdentifier	 fetch Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nextElement	TokenNameIdentifier	 next Element
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
KType	TokenNameIdentifier	 K Type
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
=	TokenNameEQUAL	
fetchNext	TokenNameIdentifier	 fetch Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
KType	TokenNameIdentifier	 K Type
)	TokenNameRPAREN	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
fetchNext	TokenNameIdentifier	 fetch Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// deprecated API (will be removed in 4.0): 	TokenNameCOMMENT_LINE	deprecated API (will be removed in 4.0): 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
checkInterned	TokenNameIdentifier	 check Interned
;	TokenNameSEMICOLON	
/** Creates a new instance of {@code RamUsageEstimator} with intern checking * enabled. Don't ever use this method, as intern checking is deprecated, * because it is not free of side-effects and strains the garbage collector * additionally. * @deprecated Don't create instances of this class, instead use the static * {@link #sizeOf(Object)} method that has no intern checking, too. */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of {@code RamUsageEstimator} with intern checking enabled. Don't ever use this method, as intern checking is deprecated, because it is not free of side-effects and strains the garbage collector additionally. @deprecated Don't create instances of this class, instead use the static {@link #sizeOf(Object)} method that has no intern checking, too. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates a new instance of {@code RamUsageEstimator}. * @param checkInterned check if Strings are interned and don't add to size * if they are. Defaults to true but if you know the objects you are checking * won't likely contain many interned Strings, it will be faster to turn off * intern checking. Intern checking is deprecated altogether, as it is not free * of side-effects and strains the garbage collector additionally. * @deprecated Don't create instances of this class, instead use the static * {@link #sizeOf(Object)} method. */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of {@code RamUsageEstimator}. @param checkInterned check if Strings are interned and don't add to size if they are. Defaults to true but if you know the objects you are checking won't likely contain many interned Strings, it will be faster to turn off intern checking. Intern checking is deprecated altogether, as it is not free of side-effects and strains the garbage collector additionally. @deprecated Don't create instances of this class, instead use the static {@link #sizeOf(Object)} method. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
(	TokenNameLPAREN	
boolean	TokenNameboolean	
checkInterned	TokenNameIdentifier	 check Interned
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
checkInterned	TokenNameIdentifier	 check Interned
=	TokenNameEQUAL	
checkInterned	TokenNameIdentifier	 check Interned
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates a new istance of {@code RamUsageEstimator}. * @deprecated Don't create instances of this class, instead use the static * {@link #sizeOf(Object)} method. * @see #sizeOf(Object) */	TokenNameCOMMENT_JAVADOC	 Creates a new istance of {@code RamUsageEstimator}. @deprecated Don't create instances of this class, instead use the static {@link #sizeOf(Object)} method. @see #sizeOf(Object) 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
estimateRamUsage	TokenNameIdentifier	 estimate Ram Usage
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
measureObjectSize	TokenNameIdentifier	 measure Object Size
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
checkInterned	TokenNameIdentifier	 check Interned
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
