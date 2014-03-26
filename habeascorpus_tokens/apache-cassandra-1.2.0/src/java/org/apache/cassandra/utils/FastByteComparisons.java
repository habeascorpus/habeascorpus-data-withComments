/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteOrder	TokenNameIdentifier	 Byte Order
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
AccessController	TokenNameIdentifier	 Access Controller
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
PrivilegedAction	TokenNameIdentifier	 Privileged Action
;	TokenNameSEMICOLON	
import	TokenNameimport	
sun	TokenNameIdentifier	 sun
.	TokenNameDOT	
misc	TokenNameIdentifier	 misc
.	TokenNameDOT	
Unsafe	TokenNameIdentifier	 Unsafe
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
primitives	TokenNameIdentifier	 primitives
.	TokenNameDOT	
Longs	TokenNameIdentifier	 Longs
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
primitives	TokenNameIdentifier	 primitives
.	TokenNameDOT	
UnsignedBytes	TokenNameIdentifier	 Unsigned Bytes
;	TokenNameSEMICOLON	
/** * Utility code to do optimized byte-array comparison. * This is borrowed and slightly modified from Guava's {@link UnsignedBytes} * class to be able to compare arrays that start at non-zero offsets. */	TokenNameCOMMENT_JAVADOC	 Utility code to do optimized byte-array comparison. This is borrowed and slightly modified from Guava's {@link UnsignedBytes} class to be able to compare arrays that start at non-zero offsets. 
abstract	TokenNameabstract	
class	TokenNameclass	
FastByteComparisons	TokenNameIdentifier	 Fast Byte Comparisons
{	TokenNameLBRACE	
/** * Lexicographically compare two byte arrays. */	TokenNameCOMMENT_JAVADOC	 Lexicographically compare two byte arrays. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b1	TokenNameIdentifier	 b1
,	TokenNameCOMMA	
int	TokenNameint	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
int	TokenNameint	
l1	TokenNameIdentifier	 l1
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b2	TokenNameIdentifier	 b2
,	TokenNameCOMMA	
int	TokenNameint	
s2	TokenNameIdentifier	 s2
,	TokenNameCOMMA	
int	TokenNameint	
l2	TokenNameIdentifier	 l2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicographicalComparerHolder	TokenNameIdentifier	 Lexicographical Comparer Holder
.	TokenNameDOT	
BEST_COMPARER	TokenNameIdentifier	 BEST  COMPARER
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
,	TokenNameCOMMA	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
l1	TokenNameIdentifier	 l1
,	TokenNameCOMMA	
b2	TokenNameIdentifier	 b2
,	TokenNameCOMMA	
s2	TokenNameIdentifier	 s2
,	TokenNameCOMMA	
l2	TokenNameIdentifier	 l2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
interface	TokenNameinterface	
Comparer	TokenNameIdentifier	 Comparer
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
abstract	TokenNameabstract	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
buffer1	TokenNameIdentifier	 buffer1
,	TokenNameCOMMA	
int	TokenNameint	
offset1	TokenNameIdentifier	 offset1
,	TokenNameCOMMA	
int	TokenNameint	
length1	TokenNameIdentifier	 length1
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
buffer2	TokenNameIdentifier	 buffer2
,	TokenNameCOMMA	
int	TokenNameint	
offset2	TokenNameIdentifier	 offset2
,	TokenNameCOMMA	
int	TokenNameint	
length2	TokenNameIdentifier	 length2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Comparer	TokenNameIdentifier	 Comparer
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
lexicographicalComparerJavaImpl	TokenNameIdentifier	 lexicographical Comparer Java Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LexicographicalComparerHolder	TokenNameIdentifier	 Lexicographical Comparer Holder
.	TokenNameDOT	
PureJavaComparer	TokenNameIdentifier	 Pure Java Comparer
.	TokenNameDOT	
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Provides a lexicographical comparer implementation; either a Java * implementation or a faster implementation based on {@link Unsafe}. * * <p>Uses reflection to gracefully fall back to the Java implementation if * {@code Unsafe} isn't available. */	TokenNameCOMMENT_JAVADOC	 Provides a lexicographical comparer implementation; either a Java implementation or a faster implementation based on {@link Unsafe}. * <p>Uses reflection to gracefully fall back to the Java implementation if {@code Unsafe} isn't available. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
LexicographicalComparerHolder	TokenNameIdentifier	 Lexicographical Comparer Holder
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNSAFE_COMPARER_NAME	TokenNameIdentifier	 UNSAFE  COMPARER  NAME
=	TokenNameEQUAL	
LexicographicalComparerHolder	TokenNameIdentifier	 Lexicographical Comparer Holder
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"$UnsafeComparer"	TokenNameStringLiteral	$UnsafeComparer
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
Comparer	TokenNameIdentifier	 Comparer
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
BEST_COMPARER	TokenNameIdentifier	 BEST  COMPARER
=	TokenNameEQUAL	
getBestComparer	TokenNameIdentifier	 get Best Comparer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the Unsafe-using Comparer, or falls back to the pure-Java * implementation if unable to do so. */	TokenNameCOMMENT_JAVADOC	 Returns the Unsafe-using Comparer, or falls back to the pure-Java implementation if unable to do so. 
static	TokenNamestatic	
Comparer	TokenNameIdentifier	 Comparer
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
getBestComparer	TokenNameIdentifier	 get Best Comparer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
theClass	TokenNameIdentifier	 the Class
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
UNSAFE_COMPARER_NAME	TokenNameIdentifier	 UNSAFE  COMPARER  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// yes, UnsafeComparer does implement Comparer<byte[]> 	TokenNameCOMMENT_LINE	yes, UnsafeComparer does implement Comparer<byte[]> 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
Comparer	TokenNameIdentifier	 Comparer
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
comparer	TokenNameIdentifier	 comparer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Comparer	TokenNameIdentifier	 Comparer
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
)	TokenNameRPAREN	
theClass	TokenNameIdentifier	 the Class
.	TokenNameDOT	
getEnumConstants	TokenNameIdentifier	 get Enum Constants
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
comparer	TokenNameIdentifier	 comparer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ensure we really catch *everything* 	TokenNameCOMMENT_LINE	ensure we really catch *everything* 
return	TokenNamereturn	
lexicographicalComparerJavaImpl	TokenNameIdentifier	 lexicographical Comparer Java Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
enum	TokenNameenum	
PureJavaComparer	TokenNameIdentifier	 Pure Java Comparer
implements	TokenNameimplements	
Comparer	TokenNameIdentifier	 Comparer
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
{	TokenNameLBRACE	
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer1	TokenNameIdentifier	 buffer1
,	TokenNameCOMMA	
int	TokenNameint	
offset1	TokenNameIdentifier	 offset1
,	TokenNameCOMMA	
int	TokenNameint	
length1	TokenNameIdentifier	 length1
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer2	TokenNameIdentifier	 buffer2
,	TokenNameCOMMA	
int	TokenNameint	
offset2	TokenNameIdentifier	 offset2
,	TokenNameCOMMA	
int	TokenNameint	
length2	TokenNameIdentifier	 length2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Short circuit equal case 	TokenNameCOMMENT_LINE	Short circuit equal case 
if	TokenNameif	
(	TokenNameLPAREN	
buffer1	TokenNameIdentifier	 buffer1
==	TokenNameEQUAL_EQUAL	
buffer2	TokenNameIdentifier	 buffer2
&&	TokenNameAND_AND	
offset1	TokenNameIdentifier	 offset1
==	TokenNameEQUAL_EQUAL	
offset2	TokenNameIdentifier	 offset2
&&	TokenNameAND_AND	
length1	TokenNameIdentifier	 length1
==	TokenNameEQUAL_EQUAL	
length2	TokenNameIdentifier	 length2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
end1	TokenNameIdentifier	 end1
=	TokenNameEQUAL	
offset1	TokenNameIdentifier	 offset1
+	TokenNamePLUS	
length1	TokenNameIdentifier	 length1
;	TokenNameSEMICOLON	
int	TokenNameint	
end2	TokenNameIdentifier	 end2
=	TokenNameEQUAL	
offset2	TokenNameIdentifier	 offset2
+	TokenNamePLUS	
length2	TokenNameIdentifier	 length2
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset1	TokenNameIdentifier	 offset1
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
offset2	TokenNameIdentifier	 offset2
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end1	TokenNameIdentifier	 end1
&&	TokenNameAND_AND	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
end2	TokenNameIdentifier	 end2
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
(	TokenNameLPAREN	
buffer1	TokenNameIdentifier	 buffer1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
buffer2	TokenNameIdentifier	 buffer2
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
!=	TokenNameNOT_EQUAL	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
-	TokenNameMINUS	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
length1	TokenNameIdentifier	 length1
-	TokenNameMINUS	
length2	TokenNameIdentifier	 length2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unused"	TokenNameStringLiteral	unused
)	TokenNameRPAREN	
// used via reflection 	TokenNameCOMMENT_LINE	used via reflection 
private	TokenNameprivate	
enum	TokenNameenum	
UnsafeComparer	TokenNameIdentifier	 Unsafe Comparer
implements	TokenNameimplements	
Comparer	TokenNameIdentifier	 Comparer
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
{	TokenNameLBRACE	
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
Unsafe	TokenNameIdentifier	 Unsafe
theUnsafe	TokenNameIdentifier	 the Unsafe
;	TokenNameSEMICOLON	
/** The offset to the first element in a byte array. */	TokenNameCOMMENT_JAVADOC	 The offset to the first element in a byte array. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BYTE_ARRAY_BASE_OFFSET	TokenNameIdentifier	 BYTE  ARRAY  BASE  OFFSET
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
theUnsafe	TokenNameIdentifier	 the Unsafe
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Unsafe	TokenNameIdentifier	 Unsafe
)	TokenNameRPAREN	
AccessController	TokenNameIdentifier	 Access Controller
.	TokenNameDOT	
doPrivileged	TokenNameIdentifier	 do Privileged
(	TokenNameLPAREN	
new	TokenNamenew	
PrivilegedAction	TokenNameIdentifier	 Privileged Action
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Field	TokenNameIdentifier	 Field
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
Unsafe	TokenNameIdentifier	 Unsafe
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getDeclaredField	TokenNameIdentifier	 get Declared Field
(	TokenNameLPAREN	
"theUnsafe"	TokenNameStringLiteral	theUnsafe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setAccessible	TokenNameIdentifier	 set Accessible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchFieldException	TokenNameIdentifier	 No Such Field Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// It doesn't matter what we throw; 	TokenNameCOMMENT_LINE	It doesn't matter what we throw; 
// it's swallowed in getBestComparer(). 	TokenNameCOMMENT_LINE	it's swallowed in getBestComparer(). 
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BYTE_ARRAY_BASE_OFFSET	TokenNameIdentifier	 BYTE  ARRAY  BASE  OFFSET
=	TokenNameEQUAL	
theUnsafe	TokenNameIdentifier	 the Unsafe
.	TokenNameDOT	
arrayBaseOffset	TokenNameIdentifier	 array Base Offset
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// sanity check - this should never fail 	TokenNameCOMMENT_LINE	sanity check - this should never fail 
if	TokenNameif	
(	TokenNameLPAREN	
theUnsafe	TokenNameIdentifier	 the Unsafe
.	TokenNameDOT	
arrayIndexScale	TokenNameIdentifier	 array Index Scale
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
littleEndian	TokenNameIdentifier	 little Endian
=	TokenNameEQUAL	
ByteOrder	TokenNameIdentifier	 Byte Order
.	TokenNameDOT	
nativeOrder	TokenNameIdentifier	 native Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteOrder	TokenNameIdentifier	 Byte Order
.	TokenNameDOT	
LITTLE_ENDIAN	TokenNameIdentifier	 LITTLE  ENDIAN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if x1 is less than x2, when both values are treated as * unsigned. */	TokenNameCOMMENT_JAVADOC	 Returns true if x1 is less than x2, when both values are treated as unsigned. 
static	TokenNamestatic	
boolean	TokenNameboolean	
lessThanUnsigned	TokenNameIdentifier	 less Than Unsigned
(	TokenNameLPAREN	
long	TokenNamelong	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
long	TokenNamelong	
x2	TokenNameIdentifier	 x2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
+	TokenNamePLUS	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
<	TokenNameLESS	
(	TokenNameLPAREN	
x2	TokenNameIdentifier	 x2
+	TokenNamePLUS	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Lexicographically compare two arrays. * * @param buffer1 left operand * @param buffer2 right operand * @param offset1 Where to start comparing in the left buffer * @param offset2 Where to start comparing in the right buffer * @param length1 How much to compare from the left buffer * @param length2 How much to compare from the right buffer * @return 0 if equal, < 0 if left is less than right, etc. */	TokenNameCOMMENT_JAVADOC	 Lexicographically compare two arrays. * @param buffer1 left operand @param buffer2 right operand @param offset1 Where to start comparing in the left buffer @param offset2 Where to start comparing in the right buffer @param length1 How much to compare from the left buffer @param length2 How much to compare from the right buffer @return 0 if equal, < 0 if left is less than right, etc. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer1	TokenNameIdentifier	 buffer1
,	TokenNameCOMMA	
int	TokenNameint	
offset1	TokenNameIdentifier	 offset1
,	TokenNameCOMMA	
int	TokenNameint	
length1	TokenNameIdentifier	 length1
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer2	TokenNameIdentifier	 buffer2
,	TokenNameCOMMA	
int	TokenNameint	
offset2	TokenNameIdentifier	 offset2
,	TokenNameCOMMA	
int	TokenNameint	
length2	TokenNameIdentifier	 length2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Short circuit equal case 	TokenNameCOMMENT_LINE	Short circuit equal case 
if	TokenNameif	
(	TokenNameLPAREN	
buffer1	TokenNameIdentifier	 buffer1
==	TokenNameEQUAL_EQUAL	
buffer2	TokenNameIdentifier	 buffer2
&&	TokenNameAND_AND	
offset1	TokenNameIdentifier	 offset1
==	TokenNameEQUAL_EQUAL	
offset2	TokenNameIdentifier	 offset2
&&	TokenNameAND_AND	
length1	TokenNameIdentifier	 length1
==	TokenNameEQUAL_EQUAL	
length2	TokenNameIdentifier	 length2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
minLength	TokenNameIdentifier	 min Length
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
length1	TokenNameIdentifier	 length1
,	TokenNameCOMMA	
length2	TokenNameIdentifier	 length2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
minWords	TokenNameIdentifier	 min Words
=	TokenNameEQUAL	
minLength	TokenNameIdentifier	 min Length
/	TokenNameDIVIDE	
Longs	TokenNameIdentifier	 Longs
.	TokenNameDOT	
BYTES	TokenNameIdentifier	 BYTES
;	TokenNameSEMICOLON	
int	TokenNameint	
offset1Adj	TokenNameIdentifier	 offset1 Adj
=	TokenNameEQUAL	
offset1	TokenNameIdentifier	 offset1
+	TokenNamePLUS	
BYTE_ARRAY_BASE_OFFSET	TokenNameIdentifier	 BYTE  ARRAY  BASE  OFFSET
;	TokenNameSEMICOLON	
int	TokenNameint	
offset2Adj	TokenNameIdentifier	 offset2 Adj
=	TokenNameEQUAL	
offset2	TokenNameIdentifier	 offset2
+	TokenNamePLUS	
BYTE_ARRAY_BASE_OFFSET	TokenNameIdentifier	 BYTE  ARRAY  BASE  OFFSET
;	TokenNameSEMICOLON	
/* * Compare 8 bytes at a time. Benchmarking shows comparing 8 bytes at a * time is no slower than comparing 4 bytes at a time even on 32-bit. * On the other hand, it is substantially faster on 64-bit. */	TokenNameCOMMENT_BLOCK	 Compare 8 bytes at a time. Benchmarking shows comparing 8 bytes at a time is no slower than comparing 4 bytes at a time even on 32-bit. On the other hand, it is substantially faster on 64-bit. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
minWords	TokenNameIdentifier	 min Words
*	TokenNameMULTIPLY	
Longs	TokenNameIdentifier	 Longs
.	TokenNameDOT	
BYTES	TokenNameIdentifier	 BYTES
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
Longs	TokenNameIdentifier	 Longs
.	TokenNameDOT	
BYTES	TokenNameIdentifier	 BYTES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
lw	TokenNameIdentifier	 lw
=	TokenNameEQUAL	
theUnsafe	TokenNameIdentifier	 the Unsafe
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
buffer1	TokenNameIdentifier	 buffer1
,	TokenNameCOMMA	
offset1Adj	TokenNameIdentifier	 offset1 Adj
+	TokenNamePLUS	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
rw	TokenNameIdentifier	 rw
=	TokenNameEQUAL	
theUnsafe	TokenNameIdentifier	 the Unsafe
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
buffer2	TokenNameIdentifier	 buffer2
,	TokenNameCOMMA	
offset2Adj	TokenNameIdentifier	 offset2 Adj
+	TokenNamePLUS	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
lw	TokenNameIdentifier	 lw
^	TokenNameXOR	
rw	TokenNameIdentifier	 rw
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
littleEndian	TokenNameIdentifier	 little Endian
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lessThanUnsigned	TokenNameIdentifier	 less Than Unsigned
(	TokenNameLPAREN	
lw	TokenNameIdentifier	 lw
,	TokenNameCOMMA	
rw	TokenNameIdentifier	 rw
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Use binary search 	TokenNameCOMMENT_LINE	Use binary search 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
lw	TokenNameIdentifier	 lw
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFL	TokenNameLongLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rw	TokenNameIdentifier	 rw
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFL	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// The epilogue to cover the last (minLength % 8) elements. 	TokenNameCOMMENT_LINE	The epilogue to cover the last (minLength % 8) elements. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
minWords	TokenNameIdentifier	 min Words
*	TokenNameMULTIPLY	
Longs	TokenNameIdentifier	 Longs
.	TokenNameDOT	
BYTES	TokenNameIdentifier	 BYTES
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
minLength	TokenNameIdentifier	 min Length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
UnsignedBytes	TokenNameIdentifier	 Unsigned Bytes
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
buffer1	TokenNameIdentifier	 buffer1
[	TokenNameLBRACKET	
offset1	TokenNameIdentifier	 offset1
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
buffer2	TokenNameIdentifier	 buffer2
[	TokenNameLBRACKET	
offset2	TokenNameIdentifier	 offset2
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
length1	TokenNameIdentifier	 length1
-	TokenNameMINUS	
length2	TokenNameIdentifier	 length2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
