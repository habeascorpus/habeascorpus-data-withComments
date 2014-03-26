/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Encodings.java 471981 2006-11-07 04:28:00Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Encodings.java 471981 2006-11-07 04:28:00Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
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
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
/** * Provides information about encodings. Depends on the Java runtime * to provides writers for the different encodings. * <p> * This class is not a public API. It is only public because it * is used outside of this package. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Provides information about encodings. Depends on the Java runtime to provides writers for the different encodings. <p> This class is not a public API. It is only public because it is used outside of this package. * @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Encodings	TokenNameIdentifier	 Encodings
extends	TokenNameextends	
Object	TokenNameIdentifier	 Object
{	TokenNameLBRACE	
/** * Standard filename for properties file with encodings data. */	TokenNameCOMMENT_JAVADOC	 Standard filename for properties file with encodings data. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ENCODINGS_FILE	TokenNameIdentifier	 ENCODINGS  FILE
=	TokenNameEQUAL	
SerializerBase	TokenNameIdentifier	 Serializer Base
.	TokenNameDOT	
PKG_PATH	TokenNameIdentifier	 PKG  PATH
+	TokenNamePLUS	
"/Encodings.properties"	TokenNameStringLiteral	/Encodings.properties
;	TokenNameSEMICOLON	
/** * Returns a writer for the specified encoding based on * an output stream. * <p> * This is not a public API. * @param output The output stream * @param encoding The encoding MIME name, not a Java name for the encoding. * @return A suitable writer * @throws UnsupportedEncodingException There is no convertor * to support this encoding * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Returns a writer for the specified encoding based on an output stream. <p> This is not a public API. @param output The output stream @param encoding The encoding MIME name, not a Java name for the encoding. @return A suitable writer @throws UnsupportedEncodingException There is no convertor to support this encoding @xsl.usage internal 
static	TokenNamestatic	
Writer	TokenNameIdentifier	 Writer
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
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
_encodings	TokenNameIdentifier	 encodings
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_encodings	TokenNameIdentifier	 encodings
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
javaName	TokenNameIdentifier	 java Name
=	TokenNameEQUAL	
_encodings	TokenNameIdentifier	 encodings
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
javaName	TokenNameIdentifier	 java Name
;	TokenNameSEMICOLON	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
osw	TokenNameIdentifier	 osw
=	TokenNameEQUAL	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
javaName	TokenNameIdentifier	 java Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
osw	TokenNameIdentifier	 osw
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
iae	TokenNameIdentifier	 iae
)	TokenNameRPAREN	
// java 1.1.8 	TokenNameCOMMENT_LINE	java 1.1.8 
{	TokenNameLBRACE	
// keep trying 	TokenNameCOMMENT_LINE	keep trying 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
usee	TokenNameIdentifier	 usee
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// keep trying 	TokenNameCOMMENT_LINE	keep trying 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
iae	TokenNameIdentifier	 iae
)	TokenNameRPAREN	
// java 1.1.8 	TokenNameCOMMENT_LINE	java 1.1.8 
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the EncodingInfo object for the specified * encoding, never null, although the encoding name * inside the returned EncodingInfo object will be if * we can't find a "real" EncodingInfo for the encoding. * <p> * This is not a public API. * * @param encoding The encoding * @return The object that is used to determine if * characters are in the given encoding. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Returns the EncodingInfo object for the specified encoding, never null, although the encoding name inside the returned EncodingInfo object will be if we can't find a "real" EncodingInfo for the encoding. <p> This is not a public API. * @param encoding The encoding @return The object that is used to determine if characters are in the given encoding. @xsl.usage internal 
static	TokenNamestatic	
EncodingInfo	TokenNameIdentifier	 Encoding Info
getEncodingInfo	TokenNameIdentifier	 get Encoding Info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EncodingInfo	TokenNameIdentifier	 Encoding Info
ei	TokenNameIdentifier	 ei
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
normalizedEncoding	TokenNameIdentifier	 normalized Encoding
=	TokenNameEQUAL	
toUpperCaseFast	TokenNameIdentifier	 to Upper Case Fast
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ei	TokenNameIdentifier	 ei
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EncodingInfo	TokenNameIdentifier	 Encoding Info
)	TokenNameRPAREN	
_encodingTableKeyJava	TokenNameIdentifier	 encoding Table Key Java
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
normalizedEncoding	TokenNameIdentifier	 normalized Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ei	TokenNameIdentifier	 ei
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ei	TokenNameIdentifier	 ei
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EncodingInfo	TokenNameIdentifier	 Encoding Info
)	TokenNameRPAREN	
_encodingTableKeyMime	TokenNameIdentifier	 encoding Table Key Mime
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
normalizedEncoding	TokenNameIdentifier	 normalized Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ei	TokenNameIdentifier	 ei
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We shouldn't have to do this, but just in case. 	TokenNameCOMMENT_LINE	We shouldn't have to do this, but just in case. 
ei	TokenNameIdentifier	 ei
=	TokenNameEQUAL	
new	TokenNamenew	
EncodingInfo	TokenNameIdentifier	 Encoding Info
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ei	TokenNameIdentifier	 ei
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines if the encoding specified was recognized by the * serializer or not. * * @param encoding The encoding * @return boolean - true if the encoding was recognized else false */	TokenNameCOMMENT_JAVADOC	 Determines if the encoding specified was recognized by the serializer or not. * @param encoding The encoding @return boolean - true if the encoding was recognized else false 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isRecognizedEncoding	TokenNameIdentifier	 is Recognized Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EncodingInfo	TokenNameIdentifier	 Encoding Info
ei	TokenNameIdentifier	 ei
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
normalizedEncoding	TokenNameIdentifier	 normalized Encoding
=	TokenNameEQUAL	
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ei	TokenNameIdentifier	 ei
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EncodingInfo	TokenNameIdentifier	 Encoding Info
)	TokenNameRPAREN	
_encodingTableKeyJava	TokenNameIdentifier	 encoding Table Key Java
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
normalizedEncoding	TokenNameIdentifier	 normalized Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ei	TokenNameIdentifier	 ei
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ei	TokenNameIdentifier	 ei
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EncodingInfo	TokenNameIdentifier	 Encoding Info
)	TokenNameRPAREN	
_encodingTableKeyMime	TokenNameIdentifier	 encoding Table Key Mime
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
normalizedEncoding	TokenNameIdentifier	 normalized Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ei	TokenNameIdentifier	 ei
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A fast and cheap way to uppercase a String that is * only made of printable ASCII characters. * <p> * This is not a public API. * @param s a String of ASCII characters * @return an uppercased version of the input String, * possibly the same String. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 A fast and cheap way to uppercase a String that is only made of printable ASCII characters. <p> This is not a public API. @param s a String of ASCII characters @return an uppercased version of the input String, possibly the same String. @xsl.usage internal 
static	TokenNamestatic	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
toUpperCaseFast	TokenNameIdentifier	 to Upper Case Fast
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
different	TokenNameIdentifier	 different
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
mx	TokenNameIdentifier	 mx
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
mx	TokenNameIdentifier	 mx
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
mx	TokenNameIdentifier	 mx
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// is the character a lower case ASCII one? 	TokenNameCOMMENT_LINE	is the character a lower case ASCII one? 
if	TokenNameif	
(	TokenNameLPAREN	
'a'	TokenNameCharacterLiteral	
<=	TokenNameLESS_EQUAL	
ch	TokenNameIdentifier	 ch
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// a cheap and fast way to uppercase that is good enough 	TokenNameCOMMENT_LINE	a cheap and fast way to uppercase that is good enough 
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
+	TokenNamePLUS	
(	TokenNameLPAREN	
'A'	TokenNameCharacterLiteral	
-	TokenNameMINUS	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
different	TokenNameIdentifier	 different
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// the uppercased String is different 	TokenNameCOMMENT_LINE	the uppercased String is different 
}	TokenNameRBRACE	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// A little optimization, don't call String.valueOf() if 	TokenNameCOMMENT_LINE	A little optimization, don't call String.valueOf() if 
// the uppercased string is the same as the input string. 	TokenNameCOMMENT_LINE	the uppercased string is the same as the input string. 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
upper	TokenNameIdentifier	 upper
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
different	TokenNameIdentifier	 different
)	TokenNameRPAREN	
upper	TokenNameIdentifier	 upper
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
upper	TokenNameIdentifier	 upper
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
return	TokenNamereturn	
upper	TokenNameIdentifier	 upper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The default encoding, ISO style, ISO style. */	TokenNameCOMMENT_JAVADOC	 The default encoding, ISO style, ISO style. 
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_MIME_ENCODING	TokenNameIdentifier	 DEFAULT  MIME  ENCODING
=	TokenNameEQUAL	
"UTF-8"	TokenNameStringLiteral	UTF-8
;	TokenNameSEMICOLON	
/** * Get the proper mime encoding. From the XSLT recommendation: "The encoding * attribute specifies the preferred encoding to use for outputting the result * tree. XSLT processors are required to respect values of UTF-8 and UTF-16. * For other values, if the XSLT processor does not support the specified * encoding it may signal an error; if it does not signal an error it should * use UTF-8 or UTF-16 instead. The XSLT processor must not use an encoding * whose name does not match the EncName production of the XML Recommendation * [XML]. If no encoding attribute is specified, then the XSLT processor should * use either UTF-8 or UTF-16." * <p> * This is not a public API. * * @param encoding Reference to java-style encoding string, which may be null, * in which case a default will be found. * * @return The ISO-style encoding string, or null if failure. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Get the proper mime encoding. From the XSLT recommendation: "The encoding attribute specifies the preferred encoding to use for outputting the result tree. XSLT processors are required to respect values of UTF-8 and UTF-16. For other values, if the XSLT processor does not support the specified encoding it may signal an error; if it does not signal an error it should use UTF-8 or UTF-16 instead. The XSLT processor must not use an encoding whose name does not match the EncName production of the XML Recommendation [XML]. If no encoding attribute is specified, then the XSLT processor should use either UTF-8 or UTF-16." <p> This is not a public API. * @param encoding Reference to java-style encoding string, which may be null, in which case a default will be found. * @return The ISO-style encoding string, or null if failure. @xsl.usage internal 
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getMimeEncoding	TokenNameIdentifier	 get Mime Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Get the default system character encoding. This may be 	TokenNameCOMMENT_LINE	Get the default system character encoding. This may be 
// incorrect if they passed in a writer, but right now there 	TokenNameCOMMENT_LINE	incorrect if they passed in a writer, but right now there 
// seems to be no way to get the encoding from a writer. 	TokenNameCOMMENT_LINE	seems to be no way to get the encoding from a writer. 
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"file.encoding"	TokenNameStringLiteral	file.encoding
,	TokenNameCOMMA	
"UTF8"	TokenNameStringLiteral	UTF8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * See if the mime type is equal to UTF8. If you don't * do that, then convertJava2MimeEncoding will convert * 8859_1 to "ISO-8859-1", which is not what we want, * I think, and I don't think I want to alter the tables * to convert everything to UTF-8. */	TokenNameCOMMENT_BLOCK	 See if the mime type is equal to UTF8. If you don't do that, then convertJava2MimeEncoding will convert 8859_1 to "ISO-8859-1", which is not what we want, I think, and I don't think I want to alter the tables to convert everything to UTF-8. 
String	TokenNameIdentifier	 String
jencoding	TokenNameIdentifier	 jencoding
=	TokenNameEQUAL	
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"Cp1252"	TokenNameStringLiteral	Cp1252
)	TokenNameRPAREN	
||	TokenNameOR_OR	
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"ISO8859_1"	TokenNameStringLiteral	ISO8859_1
)	TokenNameRPAREN	
||	TokenNameOR_OR	
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"8859_1"	TokenNameStringLiteral	8859_1
)	TokenNameRPAREN	
||	TokenNameOR_OR	
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"UTF8"	TokenNameStringLiteral	UTF8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
DEFAULT_MIME_ENCODING	TokenNameIdentifier	 DEFAULT  MIME  ENCODING
:	TokenNameCOLON	
convertJava2MimeEncoding	TokenNameIdentifier	 convert Java2 Mime Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
jencoding	TokenNameIdentifier	 jencoding
)	TokenNameRPAREN	
?	TokenNameQUESTION	
jencoding	TokenNameIdentifier	 jencoding
:	TokenNameCOLON	
DEFAULT_MIME_ENCODING	TokenNameIdentifier	 DEFAULT  MIME  ENCODING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
DEFAULT_MIME_ENCODING	TokenNameIdentifier	 DEFAULT  MIME  ENCODING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
DEFAULT_MIME_ENCODING	TokenNameIdentifier	 DEFAULT  MIME  ENCODING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
convertJava2MimeEncoding	TokenNameIdentifier	 convert Java2 Mime Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Try the best we can to convert a Java encoding to a XML-style encoding. * <p> * This is not a public API. * @param encoding non-null reference to encoding string, java style. * * @return ISO-style encoding string. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Try the best we can to convert a Java encoding to a XML-style encoding. <p> This is not a public API. @param encoding non-null reference to encoding string, java style. * @return ISO-style encoding string. @xsl.usage internal 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
convertJava2MimeEncoding	TokenNameIdentifier	 convert Java2 Mime Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EncodingInfo	TokenNameIdentifier	 Encoding Info
enc	TokenNameIdentifier	 enc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EncodingInfo	TokenNameIdentifier	 Encoding Info
)	TokenNameRPAREN	
_encodingTableKeyJava	TokenNameIdentifier	 encoding Table Key Java
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
toUpperCaseFast	TokenNameIdentifier	 to Upper Case Fast
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
return	TokenNamereturn	
enc	TokenNameIdentifier	 enc
.	TokenNameDOT	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
return	TokenNamereturn	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Try the best we can to convert a Java encoding to a XML-style encoding. * <p> * This is not a public API. * * @param encoding non-null reference to encoding string, java style. * * @return ISO-style encoding string. * <p> * This method is not a public API. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Try the best we can to convert a Java encoding to a XML-style encoding. <p> This is not a public API. * @param encoding non-null reference to encoding string, java style. * @return ISO-style encoding string. <p> This method is not a public API. @xsl.usage internal 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
convertMime2JavaEncoding	TokenNameIdentifier	 convert Mime2 Java Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
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
_encodings	TokenNameIdentifier	 encodings
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_encodings	TokenNameIdentifier	 encodings
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_encodings	TokenNameIdentifier	 encodings
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
javaName	TokenNameIdentifier	 java Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Load a list of all the supported encodings. * * System property "encodings" formatted using URL syntax may define an * external encodings list. Thanks to Sergey Ushakov for the code * contribution! * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Load a list of all the supported encodings. * System property "encodings" formatted using URL syntax may define an external encodings list. Thanks to Sergey Ushakov for the code contribution! @xsl.usage internal 
private	TokenNameprivate	
static	TokenNamestatic	
EncodingInfo	TokenNameIdentifier	 Encoding Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
loadEncodingInfo	TokenNameIdentifier	 load Encoding Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
;	TokenNameSEMICOLON	
SecuritySupport	TokenNameIdentifier	 Security Support
ss	TokenNameIdentifier	 ss
=	TokenNameEQUAL	
SecuritySupport	TokenNameIdentifier	 Security Support
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ENCODINGS_FILE	TokenNameIdentifier	 ENCODINGS  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Seems to be no real need to force failure here, let the 	TokenNameCOMMENT_LINE	Seems to be no real need to force failure here, let the 
// system do its best... The issue is not really very critical, 	TokenNameCOMMENT_LINE	system do its best... The issue is not really very critical, 
// and the output will be in any case _correct_ though maybe not 	TokenNameCOMMENT_LINE	and the output will be in any case _correct_ though maybe not 
// always human-friendly... :) 	TokenNameCOMMENT_LINE	always human-friendly... :) 
// But maybe report/log the resource problem? 	TokenNameCOMMENT_LINE	But maybe report/log the resource problem? 
// Any standard ways to report/log errors (in static context)? 	TokenNameCOMMENT_LINE	Any standard ways to report/log errors (in static context)? 
}	TokenNameRBRACE	
int	TokenNameint	
totalEntries	TokenNameIdentifier	 total Entries
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
encodingInfo_list	TokenNameIdentifier	 encoding Info list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
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
totalEntries	TokenNameIdentifier	 total Entries
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
javaName	TokenNameIdentifier	 java Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
javaName	TokenNameIdentifier	 java Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
lengthOfMimeNames	TokenNameIdentifier	 length Of Mime Names
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
mimeName	TokenNameIdentifier	 mime Name
;	TokenNameSEMICOLON	
char	TokenNamechar	
highChar	TokenNameIdentifier	 high Char
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// There is no property value, only the javaName, so try and recover 	TokenNameCOMMENT_LINE	There is no property value, only the javaName, so try and recover 
mimeName	TokenNameIdentifier	 mime Name
=	TokenNameEQUAL	
javaName	TokenNameIdentifier	 java Name
;	TokenNameSEMICOLON	
highChar	TokenNameIdentifier	 high Char
=	TokenNameEQUAL	
' '	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
// don't know the high code point, will need to test every character 	TokenNameCOMMENT_LINE	don't know the high code point, will need to test every character 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Get the substring after the Mime names 	TokenNameCOMMENT_LINE	Get the substring after the Mime names 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
highVal	TokenNameIdentifier	 high Val
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
highChar	TokenNameIdentifier	 high Char
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
highVal	TokenNameIdentifier	 high Val
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
highChar	TokenNameIdentifier	 high Char
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
mimeNames	TokenNameIdentifier	 mime Names
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
mimeNames	TokenNameIdentifier	 mime Names
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
boolean	TokenNameboolean	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mimeName	TokenNameIdentifier	 mime Name
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EncodingInfo	TokenNameIdentifier	 Encoding Info
ei	TokenNameIdentifier	 ei
=	TokenNameEQUAL	
new	TokenNamenew	
EncodingInfo	TokenNameIdentifier	 Encoding Info
(	TokenNameLPAREN	
mimeName	TokenNameIdentifier	 mime Name
,	TokenNameCOMMA	
javaName	TokenNameIdentifier	 java Name
,	TokenNameCOMMA	
highChar	TokenNameIdentifier	 high Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
encodingInfo_list	TokenNameIdentifier	 encoding Info list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ei	TokenNameIdentifier	 ei
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_encodingTableKeyMime	TokenNameIdentifier	 encoding Table Key Mime
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
mimeName	TokenNameIdentifier	 mime Name
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ei	TokenNameIdentifier	 ei
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
_encodingTableKeyJava	TokenNameIdentifier	 encoding Table Key Java
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
javaName	TokenNameIdentifier	 java Name
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ei	TokenNameIdentifier	 ei
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Convert the Vector of EncodingInfo objects into an array of them, 	TokenNameCOMMENT_LINE	Convert the Vector of EncodingInfo objects into an array of them, 
// as that is the kind of thing this method returns. 	TokenNameCOMMENT_LINE	as that is the kind of thing this method returns. 
EncodingInfo	TokenNameIdentifier	 Encoding Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret_ei	TokenNameIdentifier	 ret ei
=	TokenNameEQUAL	
new	TokenNamenew	
EncodingInfo	TokenNameIdentifier	 Encoding Info
[	TokenNameLBRACKET	
encodingInfo_list	TokenNameIdentifier	 encoding Info list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
encodingInfo_list	TokenNameIdentifier	 encoding Info list
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
ret_ei	TokenNameIdentifier	 ret ei
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret_ei	TokenNameIdentifier	 ret ei
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
mue	TokenNameIdentifier	 mue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
mue	TokenNameIdentifier	 mue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the length of the Mime names within the property value * @param val The value of the property, which should contain a comma * separated list of Mime names, followed optionally by a space and the * high char value * @return */	TokenNameCOMMENT_JAVADOC	 Get the length of the Mime names within the property value @param val The value of the property, which should contain a comma separated list of Mime names, followed optionally by a space and the high char value @return 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
lengthOfMimeNames	TokenNameIdentifier	 length Of Mime Names
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// look for the space preceding the optional high char 	TokenNameCOMMENT_LINE	look for the space preceding the optional high char 
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If len is zero it means the optional part is not there, so 	TokenNameCOMMENT_LINE	If len is zero it means the optional part is not there, so 
// the value must be all Mime names, so set the length appropriately 	TokenNameCOMMENT_LINE	the value must be all Mime names, so set the length appropriately 
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return true if the character is the high member of a surrogate pair. * <p> * This is not a public API. * @param ch the character to test * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Return true if the character is the high member of a surrogate pair. <p> This is not a public API. @param ch the character to test @xsl.usage internal 
static	TokenNamestatic	
boolean	TokenNameboolean	
isHighUTF16Surrogate	TokenNameIdentifier	 is High UT F16 Surrogate
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
<=	TokenNameLESS_EQUAL	
ch	TokenNameIdentifier	 ch
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return true if the character is the low member of a surrogate pair. * <p> * This is not a public API. * @param ch the character to test * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Return true if the character is the low member of a surrogate pair. <p> This is not a public API. @param ch the character to test @xsl.usage internal 
static	TokenNamestatic	
boolean	TokenNameboolean	
isLowUTF16Surrogate	TokenNameIdentifier	 is Low UT F16 Surrogate
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
<=	TokenNameLESS_EQUAL	
ch	TokenNameIdentifier	 ch
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the unicode code point represented by the high/low surrogate pair. * <p> * This is not a public API. * @param highSurrogate the high char of the high/low pair * @param lowSurrogate the low char of the high/low pair * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Return the unicode code point represented by the high/low surrogate pair. <p> This is not a public API. @param highSurrogate the high char of the high/low pair @param lowSurrogate the low char of the high/low pair @xsl.usage internal 
static	TokenNamestatic	
int	TokenNameint	
toCodePoint	TokenNameIdentifier	 to Code Point
(	TokenNameLPAREN	
char	TokenNamechar	
highSurrogate	TokenNameIdentifier	 high Surrogate
,	TokenNameCOMMA	
char	TokenNamechar	
lowSurrogate	TokenNameIdentifier	 low Surrogate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
codePoint	TokenNameIdentifier	 code Point
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
highSurrogate	TokenNameIdentifier	 high Surrogate
-	TokenNameMINUS	
0xd800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
lowSurrogate	TokenNameIdentifier	 low Surrogate
-	TokenNameMINUS	
0xdc00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
codePoint	TokenNameIdentifier	 code Point
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the unicode code point represented by the char. * A bit of a dummy method, since all it does is return the char, * but as an int value. * <p> * This is not a public API. * @param ch the char. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Return the unicode code point represented by the char. A bit of a dummy method, since all it does is return the char, but as an int value. <p> This is not a public API. @param ch the char. @xsl.usage internal 
static	TokenNamestatic	
int	TokenNameint	
toCodePoint	TokenNameIdentifier	 to Code Point
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
codePoint	TokenNameIdentifier	 code Point
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
return	TokenNamereturn	
codePoint	TokenNameIdentifier	 code Point
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Characters with values at or below the high code point are * in the encoding. Code point values above this one may or may * not be in the encoding, but lower ones certainly are. * <p> * This is for performance. * * @param encoding The encoding * @return The code point for which characters at or below this code point * are in the encoding. Characters with higher code point may or may not be * in the encoding. A value of zero is returned if the high code point is unknown. * <p> * This method is not a public API. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Characters with values at or below the high code point are in the encoding. Code point values above this one may or may not be in the encoding, but lower ones certainly are. <p> This is for performance. * @param encoding The encoding @return The code point for which characters at or below this code point are in the encoding. Characters with higher code point may or may not be in the encoding. A value of zero is returned if the high code point is unknown. <p> This method is not a public API. @xsl.usage internal 
static	TokenNamestatic	
public	TokenNamepublic	
char	TokenNamechar	
getHighChar	TokenNameIdentifier	 get High Char
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
highCodePoint	TokenNameIdentifier	 high Code Point
;	TokenNameSEMICOLON	
EncodingInfo	TokenNameIdentifier	 Encoding Info
ei	TokenNameIdentifier	 ei
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
normalizedEncoding	TokenNameIdentifier	 normalized Encoding
=	TokenNameEQUAL	
toUpperCaseFast	TokenNameIdentifier	 to Upper Case Fast
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ei	TokenNameIdentifier	 ei
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EncodingInfo	TokenNameIdentifier	 Encoding Info
)	TokenNameRPAREN	
_encodingTableKeyJava	TokenNameIdentifier	 encoding Table Key Java
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
normalizedEncoding	TokenNameIdentifier	 normalized Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ei	TokenNameIdentifier	 ei
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ei	TokenNameIdentifier	 ei
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EncodingInfo	TokenNameIdentifier	 Encoding Info
)	TokenNameRPAREN	
_encodingTableKeyMime	TokenNameIdentifier	 encoding Table Key Mime
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
normalizedEncoding	TokenNameIdentifier	 normalized Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ei	TokenNameIdentifier	 ei
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
highCodePoint	TokenNameIdentifier	 high Code Point
=	TokenNameEQUAL	
ei	TokenNameIdentifier	 ei
.	TokenNameDOT	
getHighChar	TokenNameIdentifier	 get High Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
highCodePoint	TokenNameIdentifier	 high Code Point
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
highCodePoint	TokenNameIdentifier	 high Code Point
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Hashtable	TokenNameIdentifier	 Hashtable
_encodingTableKeyJava	TokenNameIdentifier	 encoding Table Key Java
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Hashtable	TokenNameIdentifier	 Hashtable
_encodingTableKeyMime	TokenNameIdentifier	 encoding Table Key Mime
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
EncodingInfo	TokenNameIdentifier	 Encoding Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_encodings	TokenNameIdentifier	 encodings
=	TokenNameEQUAL	
loadEncodingInfo	TokenNameIdentifier	 load Encoding Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
