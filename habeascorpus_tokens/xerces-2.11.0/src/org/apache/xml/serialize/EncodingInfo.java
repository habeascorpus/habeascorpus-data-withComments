/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EncodingMap	TokenNameIdentifier	 Encoding Map
;	TokenNameSEMICOLON	
/** * This class represents an encoding. * * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended * that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation * API for XML (TrAX) for serializing XML. See the Xerces documentation for more * information. * @version $Id: EncodingInfo.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class represents an encoding. * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation API for XML (TrAX) for serializing XML. See the Xerces documentation for more information. @version $Id: EncodingInfo.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
EncodingInfo	TokenNameIdentifier	 Encoding Info
{	TokenNameLBRACE	
// An array to hold the argument for a method of Charset, CharsetEncoder or CharToByteConverter. 	TokenNameCOMMENT_LINE	An array to hold the argument for a method of Charset, CharsetEncoder or CharToByteConverter. 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fArgsForMethod	TokenNameIdentifier	 f Args For Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// name of encoding as registered with IANA; 	TokenNameCOMMENT_LINE	name of encoding as registered with IANA; 
// preferably a MIME name, but aliases are fine too. 	TokenNameCOMMENT_LINE	preferably a MIME name, but aliases are fine too. 
String	TokenNameIdentifier	 String
ianaName	TokenNameIdentifier	 iana Name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
javaName	TokenNameIdentifier	 java Name
;	TokenNameSEMICOLON	
int	TokenNameint	
lastPrintable	TokenNameIdentifier	 last Printable
;	TokenNameSEMICOLON	
// The CharsetEncoder with which we test unusual characters. 	TokenNameCOMMENT_LINE	The CharsetEncoder with which we test unusual characters. 
Object	TokenNameIdentifier	 Object
fCharsetEncoder	TokenNameIdentifier	 f Charset Encoder
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// The CharToByteConverter with which we test unusual characters. 	TokenNameCOMMENT_LINE	The CharToByteConverter with which we test unusual characters. 
Object	TokenNameIdentifier	 Object
fCharToByteConverter	TokenNameIdentifier	 f Char To Byte Converter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Is the converter null because it can't be instantiated 	TokenNameCOMMENT_LINE	Is the converter null because it can't be instantiated 
// for some reason (perhaps we're running with insufficient authority as 	TokenNameCOMMENT_LINE	for some reason (perhaps we're running with insufficient authority as 
// an applet? 	TokenNameCOMMENT_LINE	an applet? 
boolean	TokenNameboolean	
fHaveTriedCToB	TokenNameIdentifier	 f Have Tried C To B
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Is the charset encoder usable or available. 	TokenNameCOMMENT_LINE	Is the charset encoder usable or available. 
boolean	TokenNameboolean	
fHaveTriedCharsetEncoder	TokenNameIdentifier	 f Have Tried Charset Encoder
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Creates new <code>EncodingInfo</code> instance. */	TokenNameCOMMENT_JAVADOC	 Creates new <code>EncodingInfo</code> instance. 
public	TokenNamepublic	
EncodingInfo	TokenNameIdentifier	 Encoding Info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ianaName	TokenNameIdentifier	 iana Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
javaName	TokenNameIdentifier	 java Name
,	TokenNameCOMMA	
int	TokenNameint	
lastPrintable	TokenNameIdentifier	 last Printable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ianaName	TokenNameIdentifier	 iana Name
=	TokenNameEQUAL	
ianaName	TokenNameIdentifier	 iana Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
javaName	TokenNameIdentifier	 java Name
=	TokenNameEQUAL	
EncodingMap	TokenNameIdentifier	 Encoding Map
.	TokenNameDOT	
getIANA2JavaMapping	TokenNameIdentifier	 get IAN A2 Java Mapping
(	TokenNameLPAREN	
ianaName	TokenNameIdentifier	 iana Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lastPrintable	TokenNameIdentifier	 last Printable
=	TokenNameEQUAL	
lastPrintable	TokenNameIdentifier	 last Printable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a MIME charset name of this encoding. */	TokenNameCOMMENT_JAVADOC	 Returns a MIME charset name of this encoding. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getIANAName	TokenNameIdentifier	 get IANA Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
ianaName	TokenNameIdentifier	 iana Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a writer for this encoding based on * an output stream. * * @return A suitable writer * @exception UnsupportedEncodingException There is no convertor * to support this encoding */	TokenNameCOMMENT_JAVADOC	 Returns a writer for this encoding based on an output stream. * @return A suitable writer @exception UnsupportedEncodingException There is no convertor to support this encoding 
public	TokenNamepublic	
Writer	TokenNameIdentifier	 Writer
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
{	TokenNameLBRACE	
// this should always be true! 	TokenNameCOMMENT_LINE	this should always be true! 
if	TokenNameif	
(	TokenNameLPAREN	
javaName	TokenNameIdentifier	 java Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
javaName	TokenNameIdentifier	 java Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javaName	TokenNameIdentifier	 java Name
=	TokenNameEQUAL	
EncodingMap	TokenNameIdentifier	 Encoding Map
.	TokenNameDOT	
getIANA2JavaMapping	TokenNameIdentifier	 get IAN A2 Java Mapping
(	TokenNameLPAREN	
ianaName	TokenNameIdentifier	 iana Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
javaName	TokenNameIdentifier	 java Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// use UTF-8 as preferred encoding 	TokenNameCOMMENT_LINE	use UTF-8 as preferred encoding 
return	TokenNamereturn	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
"UTF8"	TokenNameStringLiteral	UTF8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
javaName	TokenNameIdentifier	 java Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether the specified character is printable or not in this encoding. * * @param ch a code point (0-0x10ffff) */	TokenNameCOMMENT_JAVADOC	 Checks whether the specified character is printable or not in this encoding. * @param ch a code point (0-0x10ffff) 
public	TokenNamepublic	
boolean	TokenNameboolean	
isPrintable	TokenNameIdentifier	 is Printable
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
lastPrintable	TokenNameIdentifier	 last Printable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
isPrintable0	TokenNameIdentifier	 is Printable0
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether the specified character is printable or not in this encoding. * This method accomplishes this using a java.nio.CharsetEncoder. If NIO isn't * available it will attempt use a sun.io.CharToByteConverter. * * @param ch a code point (0-0x10ffff) */	TokenNameCOMMENT_JAVADOC	 Checks whether the specified character is printable or not in this encoding. This method accomplishes this using a java.nio.CharsetEncoder. If NIO isn't available it will attempt use a sun.io.CharToByteConverter. * @param ch a code point (0-0x10ffff) 
private	TokenNameprivate	
boolean	TokenNameboolean	
isPrintable0	TokenNameIdentifier	 is Printable0
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Attempt to get a CharsetEncoder for this encoding. 	TokenNameCOMMENT_LINE	Attempt to get a CharsetEncoder for this encoding. 
if	TokenNameif	
(	TokenNameLPAREN	
fCharsetEncoder	TokenNameIdentifier	 f Charset Encoder
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
CharsetMethods	TokenNameIdentifier	 Charset Methods
.	TokenNameDOT	
fgNIOCharsetAvailable	TokenNameIdentifier	 fg NIO Charset Available
&&	TokenNameAND_AND	
!	TokenNameNOT	
fHaveTriedCharsetEncoder	TokenNameIdentifier	 f Have Tried Charset Encoder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fArgsForMethod	TokenNameIdentifier	 f Args For Method
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fArgsForMethod	TokenNameIdentifier	 f Args For Method
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// try and create the CharsetEncoder 	TokenNameCOMMENT_LINE	try and create the CharsetEncoder 
try	TokenNametry	
{	TokenNameLBRACE	
fArgsForMethod	TokenNameIdentifier	 f Args For Method
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
javaName	TokenNameIdentifier	 java Name
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
charset	TokenNameIdentifier	 charset
=	TokenNameEQUAL	
CharsetMethods	TokenNameIdentifier	 Charset Methods
.	TokenNameDOT	
fgCharsetForNameMethod	TokenNameIdentifier	 fg Charset For Name Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
fArgsForMethod	TokenNameIdentifier	 f Args For Method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
CharsetMethods	TokenNameIdentifier	 Charset Methods
.	TokenNameDOT	
fgCharsetCanEncodeMethod	TokenNameIdentifier	 fg Charset Can Encode Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
charset	TokenNameIdentifier	 charset
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCharsetEncoder	TokenNameIdentifier	 f Charset Encoder
=	TokenNameEQUAL	
CharsetMethods	TokenNameIdentifier	 Charset Methods
.	TokenNameDOT	
fgCharsetNewEncoderMethod	TokenNameIdentifier	 fg Charset New Encoder Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
charset	TokenNameIdentifier	 charset
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This charset cannot be used for encoding, don't try it again... 	TokenNameCOMMENT_LINE	This charset cannot be used for encoding, don't try it again... 
else	TokenNameelse	
{	TokenNameLBRACE	
fHaveTriedCharsetEncoder	TokenNameIdentifier	 f Have Tried Charset Encoder
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// don't try it again... 	TokenNameCOMMENT_LINE	don't try it again... 
fHaveTriedCharsetEncoder	TokenNameIdentifier	 f Have Tried Charset Encoder
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Attempt to use the CharsetEncoder to determine whether the character is printable. 	TokenNameCOMMENT_LINE	Attempt to use the CharsetEncoder to determine whether the character is printable. 
if	TokenNameif	
(	TokenNameLPAREN	
fCharsetEncoder	TokenNameIdentifier	 f Charset Encoder
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fArgsForMethod	TokenNameIdentifier	 f Args For Method
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
CharsetMethods	TokenNameIdentifier	 Charset Methods
.	TokenNameDOT	
fgCharsetEncoderCanEncodeMethod	TokenNameIdentifier	 fg Charset Encoder Can Encode Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
fCharsetEncoder	TokenNameIdentifier	 f Charset Encoder
,	TokenNameCOMMA	
fArgsForMethod	TokenNameIdentifier	 f Args For Method
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// obviously can't use this charset encoder; possibly a JDK bug 	TokenNameCOMMENT_LINE	obviously can't use this charset encoder; possibly a JDK bug 
fCharsetEncoder	TokenNameIdentifier	 f Charset Encoder
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fHaveTriedCharsetEncoder	TokenNameIdentifier	 f Have Tried Charset Encoder
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// As a last resort try to use a sun.io.CharToByteConverter to 	TokenNameCOMMENT_LINE	As a last resort try to use a sun.io.CharToByteConverter to 
// determine whether this character is printable. We will always 	TokenNameCOMMENT_LINE	determine whether this character is printable. We will always 
// reach here on JDK 1.3 or below. 	TokenNameCOMMENT_LINE	reach here on JDK 1.3 or below. 
if	TokenNameif	
(	TokenNameLPAREN	
fCharToByteConverter	TokenNameIdentifier	 f Char To Byte Converter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fHaveTriedCToB	TokenNameIdentifier	 f Have Tried C To B
||	TokenNameOR_OR	
!	TokenNameNOT	
CharToByteConverterMethods	TokenNameIdentifier	 Char To Byte Converter Methods
.	TokenNameDOT	
fgConvertersAvailable	TokenNameIdentifier	 fg Converters Available
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// forget it; nothing we can do... 	TokenNameCOMMENT_LINE	forget it; nothing we can do... 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fArgsForMethod	TokenNameIdentifier	 f Args For Method
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fArgsForMethod	TokenNameIdentifier	 f Args For Method
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// try and create the CharToByteConverter 	TokenNameCOMMENT_LINE	try and create the CharToByteConverter 
try	TokenNametry	
{	TokenNameLBRACE	
fArgsForMethod	TokenNameIdentifier	 f Args For Method
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
javaName	TokenNameIdentifier	 java Name
;	TokenNameSEMICOLON	
fCharToByteConverter	TokenNameIdentifier	 f Char To Byte Converter
=	TokenNameEQUAL	
CharToByteConverterMethods	TokenNameIdentifier	 Char To Byte Converter Methods
.	TokenNameDOT	
fgGetConverterMethod	TokenNameIdentifier	 fg Get Converter Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
fArgsForMethod	TokenNameIdentifier	 f Args For Method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// don't try it again... 	TokenNameCOMMENT_LINE	don't try it again... 
fHaveTriedCToB	TokenNameIdentifier	 f Have Tried C To B
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fArgsForMethod	TokenNameIdentifier	 f Args For Method
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
CharToByteConverterMethods	TokenNameIdentifier	 Char To Byte Converter Methods
.	TokenNameDOT	
fgCanConvertMethod	TokenNameIdentifier	 fg Can Convert Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
fCharToByteConverter	TokenNameIdentifier	 f Char To Byte Converter
,	TokenNameCOMMA	
fArgsForMethod	TokenNameIdentifier	 f Args For Method
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// obviously can't use this converter; probably some kind of 	TokenNameCOMMENT_LINE	obviously can't use this converter; probably some kind of 
// security restriction 	TokenNameCOMMENT_LINE	security restriction 
fCharToByteConverter	TokenNameIdentifier	 f Char To Byte Converter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fHaveTriedCToB	TokenNameIdentifier	 f Have Tried C To B
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// is this an encoding name recognized by this JDK? 	TokenNameCOMMENT_LINE	is this an encoding name recognized by this JDK? 
// if not, will throw UnsupportedEncodingException 	TokenNameCOMMENT_LINE	if not, will throw UnsupportedEncodingException 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
testJavaEncodingName	TokenNameIdentifier	 test Java Encoding Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bTest	TokenNameIdentifier	 b Test
=	TokenNameEQUAL	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'v'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'a'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'l'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'i'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'd'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bTest	TokenNameIdentifier	 b Test
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Holder of methods from java.nio.charset.Charset and java.nio.charset.CharsetEncoder. */	TokenNameCOMMENT_JAVADOC	 Holder of methods from java.nio.charset.Charset and java.nio.charset.CharsetEncoder. 
static	TokenNamestatic	
class	TokenNameclass	
CharsetMethods	TokenNameIdentifier	 Charset Methods
{	TokenNameLBRACE	
// Method: java.nio.charset.Charset.forName(java.lang.String) 	TokenNameCOMMENT_LINE	Method: java.nio.charset.Charset.forName(java.lang.String) 
private	TokenNameprivate	
static	TokenNamestatic	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
fgCharsetForNameMethod	TokenNameIdentifier	 fg Charset For Name Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Method: java.nio.charset.Charset.canEncode() 	TokenNameCOMMENT_LINE	Method: java.nio.charset.Charset.canEncode() 
private	TokenNameprivate	
static	TokenNamestatic	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
fgCharsetCanEncodeMethod	TokenNameIdentifier	 fg Charset Can Encode Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Method: java.nio.charset.Charset.newEncoder() 	TokenNameCOMMENT_LINE	Method: java.nio.charset.Charset.newEncoder() 
private	TokenNameprivate	
static	TokenNamestatic	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
fgCharsetNewEncoderMethod	TokenNameIdentifier	 fg Charset New Encoder Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Method: java.nio.charset.CharsetEncoder.canEncode(char) 	TokenNameCOMMENT_LINE	Method: java.nio.charset.CharsetEncoder.canEncode(char) 
private	TokenNameprivate	
static	TokenNamestatic	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
fgCharsetEncoderCanEncodeMethod	TokenNameIdentifier	 fg Charset Encoder Can Encode Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Flag indicating whether or not java.nio.charset.* is available. 	TokenNameCOMMENT_LINE	Flag indicating whether or not java.nio.charset.* is available. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
fgNIOCharsetAvailable	TokenNameIdentifier	 fg NIO Charset Available
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharsetMethods	TokenNameIdentifier	 Charset Methods
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// Attempt to get methods for Charset and CharsetEncoder on class initialization. 	TokenNameCOMMENT_LINE	Attempt to get methods for Charset and CharsetEncoder on class initialization. 
static	TokenNamestatic	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
charsetClass	TokenNameIdentifier	 charset Class
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"java.nio.charset.Charset"	TokenNameStringLiteral	java.nio.charset.Charset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
charsetEncoderClass	TokenNameIdentifier	 charset Encoder Class
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"java.nio.charset.CharsetEncoder"	TokenNameStringLiteral	java.nio.charset.CharsetEncoder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgCharsetForNameMethod	TokenNameIdentifier	 fg Charset For Name Method
=	TokenNameEQUAL	
charsetClass	TokenNameIdentifier	 charset Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"forName"	TokenNameStringLiteral	forName
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgCharsetCanEncodeMethod	TokenNameIdentifier	 fg Charset Can Encode Method
=	TokenNameEQUAL	
charsetClass	TokenNameIdentifier	 charset Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"canEncode"	TokenNameStringLiteral	canEncode
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgCharsetNewEncoderMethod	TokenNameIdentifier	 fg Charset New Encoder Method
=	TokenNameEQUAL	
charsetClass	TokenNameIdentifier	 charset Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"newEncoder"	TokenNameStringLiteral	newEncoder
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgCharsetEncoderCanEncodeMethod	TokenNameIdentifier	 fg Charset Encoder Can Encode Method
=	TokenNameEQUAL	
charsetEncoderClass	TokenNameIdentifier	 charset Encoder Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"canEncode"	TokenNameStringLiteral	canEncode
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgNIOCharsetAvailable	TokenNameIdentifier	 fg NIO Charset Available
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ClassNotFoundException, NoSuchMethodException or SecurityException 	TokenNameCOMMENT_LINE	ClassNotFoundException, NoSuchMethodException or SecurityException 
// Whatever the case, we cannot use java.nio.charset.*. 	TokenNameCOMMENT_LINE	Whatever the case, we cannot use java.nio.charset.*. 
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fgCharsetForNameMethod	TokenNameIdentifier	 fg Charset For Name Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fgCharsetCanEncodeMethod	TokenNameIdentifier	 fg Charset Can Encode Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fgCharsetEncoderCanEncodeMethod	TokenNameIdentifier	 fg Charset Encoder Can Encode Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fgCharsetNewEncoderMethod	TokenNameIdentifier	 fg Charset New Encoder Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fgNIOCharsetAvailable	TokenNameIdentifier	 fg NIO Charset Available
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Holder of methods from sun.io.CharToByteConverter. */	TokenNameCOMMENT_JAVADOC	 Holder of methods from sun.io.CharToByteConverter. 
static	TokenNamestatic	
class	TokenNameclass	
CharToByteConverterMethods	TokenNameIdentifier	 Char To Byte Converter Methods
{	TokenNameLBRACE	
// Method: sun.io.CharToByteConverter.getConverter(java.lang.String) 	TokenNameCOMMENT_LINE	Method: sun.io.CharToByteConverter.getConverter(java.lang.String) 
private	TokenNameprivate	
static	TokenNamestatic	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
fgGetConverterMethod	TokenNameIdentifier	 fg Get Converter Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Method: sun.io.CharToByteConverter.canConvert(char) 	TokenNameCOMMENT_LINE	Method: sun.io.CharToByteConverter.canConvert(char) 
private	TokenNameprivate	
static	TokenNamestatic	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
fgCanConvertMethod	TokenNameIdentifier	 fg Can Convert Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Flag indicating whether or not sun.io.CharToByteConverter is available. 	TokenNameCOMMENT_LINE	Flag indicating whether or not sun.io.CharToByteConverter is available. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
fgConvertersAvailable	TokenNameIdentifier	 fg Converters Available
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharToByteConverterMethods	TokenNameIdentifier	 Char To Byte Converter Methods
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// Attempt to get methods for char to byte converter on class initialization. 	TokenNameCOMMENT_LINE	Attempt to get methods for char to byte converter on class initialization. 
static	TokenNamestatic	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"sun.io.CharToByteConverter"	TokenNameStringLiteral	sun.io.CharToByteConverter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgGetConverterMethod	TokenNameIdentifier	 fg Get Converter Method
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getConverter"	TokenNameStringLiteral	getConverter
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgCanConvertMethod	TokenNameIdentifier	 fg Can Convert Method
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"canConvert"	TokenNameStringLiteral	canConvert
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fgConvertersAvailable	TokenNameIdentifier	 fg Converters Available
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ClassNotFoundException, NoSuchMethodException or SecurityException 	TokenNameCOMMENT_LINE	ClassNotFoundException, NoSuchMethodException or SecurityException 
// Whatever the case, we cannot use sun.io.CharToByteConverter. 	TokenNameCOMMENT_LINE	Whatever the case, we cannot use sun.io.CharToByteConverter. 
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fgGetConverterMethod	TokenNameIdentifier	 fg Get Converter Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fgCanConvertMethod	TokenNameIdentifier	 fg Can Convert Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fgConvertersAvailable	TokenNameIdentifier	 fg Converters Available
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
