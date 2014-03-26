/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
;	TokenNameSEMICOLON	
/** * Utility class that represents a two byte integer with conversion * rules for the big endian byte order of ZIP files. * */	TokenNameCOMMENT_JAVADOC	 Utility class that represents a two byte integer with conversion rules for the big endian byte order of ZIP files. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ZipShort	TokenNameIdentifier	 Zip Short
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
=	TokenNameEQUAL	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BYTE_1_MASK	TokenNameIdentifier	 BYTE 1  MASK
=	TokenNameEQUAL	
0xFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BYTE_1_SHIFT	TokenNameIdentifier	 BYTE 1  SHIFT
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * Create instance from a number. * @param value the int to store as a ZipShort * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Create instance from a number. @param value the int to store as a ZipShort @since 1.1 
public	TokenNamepublic	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create instance from bytes. * @param bytes the bytes to store as a ZipShort * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Create instance from bytes. @param bytes the bytes to store as a ZipShort @since 1.1 
public	TokenNamepublic	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create instance from the two bytes starting at offset. * @param bytes the bytes to store as a ZipShort * @param offset the offset to start * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Create instance from the two bytes starting at offset. @param bytes the bytes to store as a ZipShort @param offset the offset to start @since 1.1 
public	TokenNamepublic	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get value as two bytes in big endian byte order. * @return the value as a a two byte array in big endian byte order * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Get value as two bytes in big endian byte order. @return the value as a a two byte array in big endian byte order @since 1.1 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
&	TokenNameAND	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
&	TokenNameAND	
BYTE_1_MASK	TokenNameIdentifier	 BYTE 1  MASK
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
BYTE_1_SHIFT	TokenNameIdentifier	 BYTE 1  SHIFT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get value as Java int. * @return value as a Java int * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Get value as Java int. @return value as a Java int @since 1.1 
public	TokenNamepublic	
int	TokenNameint	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get value as two bytes in big endian byte order. * @param value the Java int to convert to bytes * @return the converted int as a byte array in big endian byte order */	TokenNameCOMMENT_JAVADOC	 Get value as two bytes in big endian byte order. @param value the Java int to convert to bytes @return the converted int as a byte array in big endian byte order 
public	TokenNamepublic	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
&	TokenNameAND	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
&	TokenNameAND	
BYTE_1_MASK	TokenNameIdentifier	 BYTE 1  MASK
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
BYTE_1_SHIFT	TokenNameIdentifier	 BYTE 1  SHIFT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Helper method to get the value as a java int from two bytes starting at given array offset * @param bytes the array of bytes * @param offset the offset to start * @return the correspondanding java int value */	TokenNameCOMMENT_JAVADOC	 Helper method to get the value as a java int from two bytes starting at given array offset @param bytes the array of bytes @param offset the offset to start @return the correspondanding java int value 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
BYTE_1_SHIFT	TokenNameIdentifier	 BYTE 1  SHIFT
)	TokenNameRPAREN	
&	TokenNameAND	
BYTE_1_MASK	TokenNameIdentifier	 BYTE 1  MASK
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
BYTE_MASK	TokenNameIdentifier	 BYTE  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Helper method to get the value as a java int from a two-byte array * @param bytes the array of bytes * @return the correspondanding java int value */	TokenNameCOMMENT_JAVADOC	 Helper method to get the value as a java int from a two-byte array @param bytes the array of bytes @return the correspondanding java int value 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override to make two instances with same value equal. * @param o an object to compare * @return true if the objects are equal * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Override to make two instances with same value equal. @param o an object to compare @return true if the objects are equal @since 1.1 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
ZipShort	TokenNameIdentifier	 Zip Short
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override to make two instances with same value equal. * @return the value stored in the ZipShort * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Override to make two instances with same value equal. @return the value stored in the ZipShort @since 1.1 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
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
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// impossible 	TokenNameCOMMENT_LINE	impossible 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
