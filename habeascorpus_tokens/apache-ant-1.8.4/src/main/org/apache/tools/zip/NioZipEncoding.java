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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
CharBuffer	TokenNameIdentifier	 Char Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
Charset	TokenNameIdentifier	 Charset
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
CharsetEncoder	TokenNameIdentifier	 Charset Encoder
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
CoderResult	TokenNameIdentifier	 Coder Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
CodingErrorAction	TokenNameIdentifier	 Coding Error Action
;	TokenNameSEMICOLON	
/** * A ZipEncoding, which uses a java.nio {@link * java.nio.charset.Charset Charset} to encode names. * * <p>This implementation works for all cases under java-1.5 or * later. However, in java-1.4, some charsets don't have a java.nio * implementation, most notably the default ZIP encoding Cp437.</p> * * <p>The methods of this class are reentrant.</p> */	TokenNameCOMMENT_JAVADOC	 A ZipEncoding, which uses a java.nio {@link java.nio.charset.Charset Charset} to encode names. * <p>This implementation works for all cases under java-1.5 or later. However, in java-1.4, some charsets don't have a java.nio implementation, most notably the default ZIP encoding Cp437.</p> * <p>The methods of this class are reentrant.</p> 
class	TokenNameclass	
NioZipEncoding	TokenNameIdentifier	 Nio Zip Encoding
implements	TokenNameimplements	
ZipEncoding	TokenNameIdentifier	 Zip Encoding
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Charset	TokenNameIdentifier	 Charset
charset	TokenNameIdentifier	 charset
;	TokenNameSEMICOLON	
/** * Construct an NIO based zip encoding, which wraps the given * charset. * * @param charset The NIO charset to wrap. */	TokenNameCOMMENT_JAVADOC	 Construct an NIO based zip encoding, which wraps the given charset. * @param charset The NIO charset to wrap. 
public	TokenNamepublic	
NioZipEncoding	TokenNameIdentifier	 Nio Zip Encoding
(	TokenNameLPAREN	
Charset	TokenNameIdentifier	 Charset
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
=	TokenNameEQUAL	
charset	TokenNameIdentifier	 charset
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
CharsetEncoder	TokenNameIdentifier	 Charset Encoder
enc	TokenNameIdentifier	 enc
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
newEncoder	TokenNameIdentifier	 new Encoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
enc	TokenNameIdentifier	 enc
.	TokenNameDOT	
onMalformedInput	TokenNameIdentifier	 on Malformed Input
(	TokenNameLPAREN	
CodingErrorAction	TokenNameIdentifier	 Coding Error Action
.	TokenNameDOT	
REPORT	TokenNameIdentifier	 REPORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
enc	TokenNameIdentifier	 enc
.	TokenNameDOT	
onUnmappableCharacter	TokenNameIdentifier	 on Unmappable Character
(	TokenNameLPAREN	
CodingErrorAction	TokenNameIdentifier	 Coding Error Action
.	TokenNameDOT	
REPORT	TokenNameIdentifier	 REPORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
enc	TokenNameIdentifier	 enc
.	TokenNameDOT	
canEncode	TokenNameIdentifier	 can Encode
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
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
CharsetEncoder	TokenNameIdentifier	 Charset Encoder
enc	TokenNameIdentifier	 enc
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
newEncoder	TokenNameIdentifier	 new Encoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
enc	TokenNameIdentifier	 enc
.	TokenNameDOT	
onMalformedInput	TokenNameIdentifier	 on Malformed Input
(	TokenNameLPAREN	
CodingErrorAction	TokenNameIdentifier	 Coding Error Action
.	TokenNameDOT	
REPORT	TokenNameIdentifier	 REPORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
enc	TokenNameIdentifier	 enc
.	TokenNameDOT	
onUnmappableCharacter	TokenNameIdentifier	 on Unmappable Character
(	TokenNameLPAREN	
CodingErrorAction	TokenNameIdentifier	 Coding Error Action
.	TokenNameDOT	
REPORT	TokenNameIdentifier	 REPORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharBuffer	TokenNameIdentifier	 Char Buffer
cb	TokenNameIdentifier	 cb
=	TokenNameEQUAL	
CharBuffer	TokenNameIdentifier	 Char Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
while	TokenNamewhile	
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CoderResult	TokenNameIdentifier	 Coder Result
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
enc	TokenNameIdentifier	 enc
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
isUnmappable	TokenNameIdentifier	 is Unmappable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
isMalformed	TokenNameIdentifier	 is Malformed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// write the unmappable characters in utf-16 	TokenNameCOMMENT_LINE	write the unmappable characters in utf-16 
// pseudo-URL encoding style to ByteBuffer. 	TokenNameCOMMENT_LINE	pseudo-URL encoding style to ByteBuffer. 
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
6	TokenNameIntegerLiteral	
>	TokenNameGREATER	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
res	TokenNameIdentifier	 res
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
6	TokenNameIntegerLiteral	
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
res	TokenNameIdentifier	 res
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipEncodingHelper	TokenNameIdentifier	 Zip Encoding Helper
.	TokenNameDOT	
appendSurrogate	TokenNameIdentifier	 append Surrogate
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
isOverflow	TokenNameIdentifier	 is Overflow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
isUnderflow	TokenNameIdentifier	 is Underflow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
enc	TokenNameIdentifier	 enc
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
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
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
newDecoder	TokenNameIdentifier	 new Decoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
onMalformedInput	TokenNameIdentifier	 on Malformed Input
(	TokenNameLPAREN	
CodingErrorAction	TokenNameIdentifier	 Coding Error Action
.	TokenNameDOT	
REPORT	TokenNameIdentifier	 REPORT
)	TokenNameRPAREN	
.	TokenNameDOT	
onUnmappableCharacter	TokenNameIdentifier	 on Unmappable Character
(	TokenNameLPAREN	
CodingErrorAction	TokenNameIdentifier	 Coding Error Action
.	TokenNameDOT	
REPORT	TokenNameIdentifier	 REPORT
)	TokenNameRPAREN	
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
