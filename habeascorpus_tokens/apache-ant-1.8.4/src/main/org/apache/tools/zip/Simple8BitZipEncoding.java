/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
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
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * This ZipEncoding implementation implements a simple 8bit character * set, which mets the following restrictions: * * <ul> * <li>Characters 0x0000 to 0x007f are encoded as the corresponding * byte values 0x00 to 0x7f.</li> * <li>All byte codes from 0x80 to 0xff are mapped to a unique unicode * character in the range 0x0080 to 0x7fff. (No support for * UTF-16 surrogates) * </ul> * * <p>These restrictions most notably apply to the most prominent * omissions of java-1.4's {@link java.nio.charset.Charset Charset} * implementation, Cp437 and Cp850.</p> * * <p>The methods of this class are reentrant.</p> */	TokenNameCOMMENT_JAVADOC	 This ZipEncoding implementation implements a simple 8bit character set, which mets the following restrictions: * <ul> <li>Characters 0x0000 to 0x007f are encoded as the corresponding byte values 0x00 to 0x7f.</li> <li>All byte codes from 0x80 to 0xff are mapped to a unique unicode character in the range 0x0080 to 0x7fff. (No support for UTF-16 surrogates) </ul> * <p>These restrictions most notably apply to the most prominent omissions of java-1.4's {@link java.nio.charset.Charset Charset} implementation, Cp437 and Cp850.</p> * <p>The methods of this class are reentrant.</p> 
class	TokenNameclass	
Simple8BitZipEncoding	TokenNameIdentifier	 Simple8 Bit Zip Encoding
implements	TokenNameimplements	
ZipEncoding	TokenNameIdentifier	 Zip Encoding
{	TokenNameLBRACE	
/** * A character entity, which is put to the reverse mapping table * of a simple encoding. */	TokenNameCOMMENT_JAVADOC	 A character entity, which is put to the reverse mapping table of a simple encoding. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Simple8BitChar	TokenNameIdentifier	 Simple8 Bit Char
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
char	TokenNamechar	
unicode	TokenNameIdentifier	 unicode
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
byte	TokenNamebyte	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
Simple8BitChar	TokenNameIdentifier	 Simple8 Bit Char
(	TokenNameLPAREN	
byte	TokenNamebyte	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
char	TokenNamechar	
unicode	TokenNameIdentifier	 unicode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
unicode	TokenNameIdentifier	 unicode
=	TokenNameEQUAL	
unicode	TokenNameIdentifier	 unicode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Simple8BitChar	TokenNameIdentifier	 Simple8 Bit Char
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Simple8BitChar	TokenNameIdentifier	 Simple8 Bit Char
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
unicode	TokenNameIdentifier	 unicode
-	TokenNameMINUS	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
unicode	TokenNameIdentifier	 unicode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"0x"	TokenNameStringLiteral	0x
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
0xffff	TokenNameIntegerLiteral	
&	TokenNameAND	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
unicode	TokenNameIdentifier	 unicode
)	TokenNameRPAREN	
+	TokenNamePLUS	
"->0x"	TokenNameStringLiteral	->0x
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
0xff	TokenNameIntegerLiteral	
&	TokenNameAND	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The characters for byte values of 128 to 255 stored as an array of * 128 chars. */	TokenNameCOMMENT_JAVADOC	 The characters for byte values of 128 to 255 stored as an array of 128 chars. 
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
highChars	TokenNameIdentifier	 high Chars
;	TokenNameSEMICOLON	
/** * A list of {@link Simple8BitChar} objects sorted by the unicode * field. This list is used to binary search reverse mapping of * unicode characters with a character code greater than 127. */	TokenNameCOMMENT_JAVADOC	 A list of {@link Simple8BitChar} objects sorted by the unicode field. This list is used to binary search reverse mapping of unicode characters with a character code greater than 127. 
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
reverseMapping	TokenNameIdentifier	 reverse Mapping
;	TokenNameSEMICOLON	
/** * @param highChars The characters for byte values of 128 to 255 * stored as an array of 128 chars. */	TokenNameCOMMENT_JAVADOC	 @param highChars The characters for byte values of 128 to 255 stored as an array of 128 chars. 
public	TokenNamepublic	
Simple8BitZipEncoding	TokenNameIdentifier	 Simple8 Bit Zip Encoding
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
highChars	TokenNameIdentifier	 high Chars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
highChars	TokenNameIdentifier	 high Chars
=	TokenNameEQUAL	
highChars	TokenNameIdentifier	 high Chars
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
reverseMapping	TokenNameIdentifier	 reverse Mapping
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
highChars	TokenNameIdentifier	 high Chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
127	TokenNameIntegerLiteral	
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
this	TokenNamethis	
.	TokenNameDOT	
highChars	TokenNameIdentifier	 high Chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reverseMapping	TokenNameIdentifier	 reverse Mapping
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Simple8BitChar	TokenNameIdentifier	 Simple8 Bit Char
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
highChars	TokenNameIdentifier	 high Chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
reverseMapping	TokenNameIdentifier	 reverse Mapping
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the character code for a given encoded byte. * * @param b The byte to decode. * @return The associated character value. */	TokenNameCOMMENT_JAVADOC	 Return the character code for a given encoded byte. * @param b The byte to decode. @return The associated character value. 
public	TokenNamepublic	
char	TokenNamechar	
decodeByte	TokenNameIdentifier	 decode Byte
(	TokenNameLPAREN	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// code 0-127 	TokenNameCOMMENT_LINE	code 0-127 
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// byte is signed, so 128 == -128 and 255 == -1 	TokenNameCOMMENT_LINE	byte is signed, so 128 == -128 and 255 == -1 
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
highChars	TokenNameIdentifier	 high Chars
[	TokenNameLBRACKET	
128	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param c The character to encode. * @return Whether the given unicode character is covered by this encoding. */	TokenNameCOMMENT_JAVADOC	 @param c The character to encode. @return Whether the given unicode character is covered by this encoding. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canEncodeChar	TokenNameIdentifier	 can Encode Char
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Simple8BitChar	TokenNameIdentifier	 Simple8 Bit Char
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
encodeHighChar	TokenNameIdentifier	 encode High Char
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pushes the encoded form of the given character to the given byte buffer. * * @param bb The byte buffer to write to. * @param c The character to encode. * @return Whether the given unicode character is covered by this encoding. * If <code>false</code> is returned, nothing is pushed to the * byte buffer. */	TokenNameCOMMENT_JAVADOC	 Pushes the encoded form of the given character to the given byte buffer. * @param bb The byte buffer to write to. @param c The character to encode. @return Whether the given unicode character is covered by this encoding. If <code>false</code> is returned, nothing is pushed to the byte buffer. 
public	TokenNamepublic	
boolean	TokenNameboolean	
pushEncodedChar	TokenNameIdentifier	 push Encoded Char
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
,	TokenNameCOMMA	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Simple8BitChar	TokenNameIdentifier	 Simple8 Bit Char
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
encodeHighChar	TokenNameIdentifier	 encode High Char
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param c A unicode character in the range from 0x0080 to 0x7f00 * @return A Simple8BitChar, if this character is covered by this encoding. * A <code>null</code> value is returned, if this character is not * covered by this encoding. */	TokenNameCOMMENT_JAVADOC	 @param c A unicode character in the range from 0x0080 to 0x7f00 @return A Simple8BitChar, if this character is covered by this encoding. A <code>null</code> value is returned, if this character is not covered by this encoding. 
private	TokenNameprivate	
Simple8BitChar	TokenNameIdentifier	 Simple8 Bit Char
encodeHighChar	TokenNameIdentifier	 encode High Char
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for performance an simplicity, yet another reincarnation of 	TokenNameCOMMENT_LINE	for performance an simplicity, yet another reincarnation of 
// binary search... 	TokenNameCOMMENT_LINE	binary search... 
int	TokenNameint	
i0	TokenNameIdentifier	 i0
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i1	TokenNameIdentifier	 i1
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
reverseMapping	TokenNameIdentifier	 reverse Mapping
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i1	TokenNameIdentifier	 i1
>	TokenNameGREATER	
i0	TokenNameIdentifier	 i0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
i0	TokenNameIdentifier	 i0
+	TokenNamePLUS	
(	TokenNameLPAREN	
i1	TokenNameIdentifier	 i1
-	TokenNameMINUS	
i0	TokenNameIdentifier	 i0
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Simple8BitChar	TokenNameIdentifier	 Simple8 Bit Char
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Simple8BitChar	TokenNameIdentifier	 Simple8 Bit Char
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
reverseMapping	TokenNameIdentifier	 reverse Mapping
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
unicode	TokenNameIdentifier	 unicode
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
unicode	TokenNameIdentifier	 unicode
<	TokenNameLESS	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i0	TokenNameIdentifier	 i0
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
i1	TokenNameIdentifier	 i1
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i0	TokenNameIdentifier	 i0
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
reverseMapping	TokenNameIdentifier	 reverse Mapping
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Simple8BitChar	TokenNameIdentifier	 Simple8 Bit Char
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Simple8BitChar	TokenNameIdentifier	 Simple8 Bit Char
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
reverseMapping	TokenNameIdentifier	 reverse Mapping
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i0	TokenNameIdentifier	 i0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
unicode	TokenNameIdentifier	 unicode
!=	TokenNameNOT_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see * org.apache.tools.zip.ZipEncoding#canEncode(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.tools.zip.ZipEncoding#canEncode(java.lang.String) 
public	TokenNamepublic	
boolean	TokenNameboolean	
canEncode	TokenNameIdentifier	 can Encode
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
canEncodeChar	TokenNameIdentifier	 can Encode Char
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see * org.apache.tools.zip.ZipEncoding#encode(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.tools.zip.ZipEncoding#encode(java.lang.String) 
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
ZipEncodingHelper	TokenNameIdentifier	 Zip Encoding Helper
.	TokenNameDOT	
growBuffer	TokenNameIdentifier	 grow Buffer
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
pushEncodedChar	TokenNameIdentifier	 push Encoded Char
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipEncodingHelper	TokenNameIdentifier	 Zip Encoding Helper
.	TokenNameDOT	
appendSurrogate	TokenNameIdentifier	 append Surrogate
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
rewind	TokenNameIdentifier	 rewind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see * org.apache.tools.zip.ZipEncoding#decode(byte[]) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.tools.zip.ZipEncoding#decode(byte[]) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
decodeByte	TokenNameIdentifier	 decode Byte
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
