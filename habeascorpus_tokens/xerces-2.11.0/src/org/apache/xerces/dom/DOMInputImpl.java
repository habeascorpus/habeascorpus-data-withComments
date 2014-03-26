/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
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
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ls	TokenNameIdentifier	 ls
.	TokenNameDOT	
LSInput	TokenNameIdentifier	 LS Input
;	TokenNameSEMICOLON	
/** * This Class <code>DOMInputImpl</code> represents a single input source for an XML entity. * <p> This Class allows an application to encapsulate information about * an input source in a single object, which may include a public * identifier, a system identifier, a byte stream (possibly with a specified * encoding), and/or a character stream. * <p> The exact definitions of a byte stream and a character stream are * binding dependent. * <p> There are two places that the application will deliver this input * source to the parser: as the argument to the <code>parse</code> method, * or as the return value of the <code>DOMResourceResolver.resolveEntity</code> * method. * <p> The <code>DOMParser</code> will use the <code>LSInput</code> * object to determine how to read XML input. If there is a character stream * available, the parser will read that stream directly; if not, the parser * will use a byte stream, if available; if neither a character stream nor a * byte stream is available, the parser will attempt to open a URI * connection to the resource identified by the system identifier. * <p> An <code>LSInput</code> object belongs to the application: the * parser shall never modify it in any way (it may modify a copy if * necessary). Eventhough all attributes in this interface are writable the * DOM implementation is expected to never mutate a LSInput. * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. * * @xerces.internal * * @author Gopal Sharma, SUN Microsystems Inc. * @version $Id: DOMInputImpl.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This Class <code>DOMInputImpl</code> represents a single input source for an XML entity. <p> This Class allows an application to encapsulate information about an input source in a single object, which may include a public identifier, a system identifier, a byte stream (possibly with a specified encoding), and/or a character stream. <p> The exact definitions of a byte stream and a character stream are binding dependent. <p> There are two places that the application will deliver this input source to the parser: as the argument to the <code>parse</code> method, or as the return value of the <code>DOMResourceResolver.resolveEntity</code> method. <p> The <code>DOMParser</code> will use the <code>LSInput</code> object to determine how to read XML input. If there is a character stream available, the parser will read that stream directly; if not, the parser will use a byte stream, if available; if neither a character stream nor a byte stream is available, the parser will attempt to open a URI connection to the resource identified by the system identifier. <p> An <code>LSInput</code> object belongs to the application: the parser shall never modify it in any way (it may modify a copy if necessary). Eventhough all attributes in this interface are writable the DOM implementation is expected to never mutate a LSInput. <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. * @xerces.internal * @author Gopal Sharma, SUN Microsystems Inc. @version $Id: DOMInputImpl.java 699892 2008-09-28 21:08:27Z mrglavas $ 
// REVISIT: 	TokenNameCOMMENT_LINE	REVISIT: 
// 1. it should be possible to do the following 	TokenNameCOMMENT_LINE	1. it should be possible to do the following 
// DOMInputImpl extends XMLInputSource implements LSInput 	TokenNameCOMMENT_LINE	DOMInputImpl extends XMLInputSource implements LSInput 
// 2. we probably need only the default constructor. -- el 	TokenNameCOMMENT_LINE	2. we probably need only the default constructor. -- el 
public	TokenNamepublic	
class	TokenNameclass	
DOMInputImpl	TokenNameIdentifier	 DOM Input Impl
implements	TokenNameimplements	
LSInput	TokenNameIdentifier	 LS Input
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fPublicId	TokenNameIdentifier	 f Public Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fSystemId	TokenNameIdentifier	 f System Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fBaseSystemId	TokenNameIdentifier	 f Base System Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
InputStream	TokenNameIdentifier	 Input Stream
fByteStream	TokenNameIdentifier	 f Byte Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Reader	TokenNameIdentifier	 Reader
fCharStream	TokenNameIdentifier	 f Char Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fData	TokenNameIdentifier	 f Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fEncoding	TokenNameIdentifier	 f Encoding
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
fCertifiedText	TokenNameIdentifier	 f Certified Text
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Default Constructor, constructs an input source * * */	TokenNameCOMMENT_JAVADOC	 Default Constructor, constructs an input source * 
public	TokenNamepublic	
DOMInputImpl	TokenNameIdentifier	 DOM Input Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructs an input source from just the public and system * identifiers, leaving resolution of the entity and opening of * the input stream up to the caller. * * @param publicId The public identifier, if known. * @param systemId The system identifier. This value should * always be set, if possible, and can be * relative or absolute. If the system identifier * is relative, then the base system identifier * should be set. * @param baseSystemId The base system identifier. This value should * always be set to the fully expanded URI of the * base system identifier, if possible. */	TokenNameCOMMENT_JAVADOC	 Constructs an input source from just the public and system identifiers, leaving resolution of the entity and opening of the input stream up to the caller. * @param publicId The public identifier, if known. @param systemId The system identifier. This value should always be set, if possible, and can be relative or absolute. If the system identifier is relative, then the base system identifier should be set. @param baseSystemId The base system identifier. This value should always be set to the fully expanded URI of the base system identifier, if possible. 
public	TokenNamepublic	
DOMInputImpl	TokenNameIdentifier	 DOM Input Impl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
baseSystemId	TokenNameIdentifier	 base System Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fPublicId	TokenNameIdentifier	 f Public Id
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
fSystemId	TokenNameIdentifier	 f System Id
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
=	TokenNameEQUAL	
baseSystemId	TokenNameIdentifier	 base System Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DOMInputImpl(String,String,String) 	TokenNameCOMMENT_LINE	DOMInputImpl(String,String,String) 
/** * Constructs an input source from a byte stream. * * @param publicId The public identifier, if known. * @param systemId The system identifier. This value should * always be set, if possible, and can be * relative or absolute. If the system identifier * is relative, then the base system identifier * should be set. * @param baseSystemId The base system identifier. This value should * always be set to the fully expanded URI of the * base system identifier, if possible. * @param byteStream The byte stream. * @param encoding The encoding of the byte stream, if known. */	TokenNameCOMMENT_JAVADOC	 Constructs an input source from a byte stream. * @param publicId The public identifier, if known. @param systemId The system identifier. This value should always be set, if possible, and can be relative or absolute. If the system identifier is relative, then the base system identifier should be set. @param baseSystemId The base system identifier. This value should always be set to the fully expanded URI of the base system identifier, if possible. @param byteStream The byte stream. @param encoding The encoding of the byte stream, if known. 
public	TokenNamepublic	
DOMInputImpl	TokenNameIdentifier	 DOM Input Impl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
baseSystemId	TokenNameIdentifier	 base System Id
,	TokenNameCOMMA	
InputStream	TokenNameIdentifier	 Input Stream
byteStream	TokenNameIdentifier	 byte Stream
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fPublicId	TokenNameIdentifier	 f Public Id
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
fSystemId	TokenNameIdentifier	 f System Id
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
=	TokenNameEQUAL	
baseSystemId	TokenNameIdentifier	 base System Id
;	TokenNameSEMICOLON	
fByteStream	TokenNameIdentifier	 f Byte Stream
=	TokenNameEQUAL	
byteStream	TokenNameIdentifier	 byte Stream
;	TokenNameSEMICOLON	
fEncoding	TokenNameIdentifier	 f Encoding
=	TokenNameEQUAL	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DOMInputImpl(String,String,String,InputStream,String) 	TokenNameCOMMENT_LINE	DOMInputImpl(String,String,String,InputStream,String) 
/** * Constructs an input source from a character stream. * * @param publicId The public identifier, if known. * @param systemId The system identifier. This value should * always be set, if possible, and can be * relative or absolute. If the system identifier * is relative, then the base system identifier * should be set. * @param baseSystemId The base system identifier. This value should * always be set to the fully expanded URI of the * base system identifier, if possible. * @param charStream The character stream. * @param encoding The original encoding of the byte stream * used by the reader, if known. */	TokenNameCOMMENT_JAVADOC	 Constructs an input source from a character stream. * @param publicId The public identifier, if known. @param systemId The system identifier. This value should always be set, if possible, and can be relative or absolute. If the system identifier is relative, then the base system identifier should be set. @param baseSystemId The base system identifier. This value should always be set to the fully expanded URI of the base system identifier, if possible. @param charStream The character stream. @param encoding The original encoding of the byte stream used by the reader, if known. 
public	TokenNamepublic	
DOMInputImpl	TokenNameIdentifier	 DOM Input Impl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
baseSystemId	TokenNameIdentifier	 base System Id
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
charStream	TokenNameIdentifier	 char Stream
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fPublicId	TokenNameIdentifier	 f Public Id
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
fSystemId	TokenNameIdentifier	 f System Id
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
=	TokenNameEQUAL	
baseSystemId	TokenNameIdentifier	 base System Id
;	TokenNameSEMICOLON	
fCharStream	TokenNameIdentifier	 f Char Stream
=	TokenNameEQUAL	
charStream	TokenNameIdentifier	 char Stream
;	TokenNameSEMICOLON	
fEncoding	TokenNameIdentifier	 f Encoding
=	TokenNameEQUAL	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DOMInputImpl(String,String,String,Reader,String) 	TokenNameCOMMENT_LINE	DOMInputImpl(String,String,String,Reader,String) 
/** * Constructs an input source from a String. * * @param publicId The public identifier, if known. * @param systemId The system identifier. This value should * always be set, if possible, and can be * relative or absolute. If the system identifier * is relative, then the base system identifier * should be set. * @param baseSystemId The base system identifier. This value should * always be set to the fully expanded URI of the * base system identifier, if possible. * @param data The String Data. * @param encoding The original encoding of the byte stream * used by the reader, if known. */	TokenNameCOMMENT_JAVADOC	 Constructs an input source from a String. * @param publicId The public identifier, if known. @param systemId The system identifier. This value should always be set, if possible, and can be relative or absolute. If the system identifier is relative, then the base system identifier should be set. @param baseSystemId The base system identifier. This value should always be set to the fully expanded URI of the base system identifier, if possible. @param data The String Data. @param encoding The original encoding of the byte stream used by the reader, if known. 
public	TokenNamepublic	
DOMInputImpl	TokenNameIdentifier	 DOM Input Impl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
baseSystemId	TokenNameIdentifier	 base System Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fPublicId	TokenNameIdentifier	 f Public Id
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
fSystemId	TokenNameIdentifier	 f System Id
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
=	TokenNameEQUAL	
baseSystemId	TokenNameIdentifier	 base System Id
;	TokenNameSEMICOLON	
fData	TokenNameIdentifier	 f Data
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
fEncoding	TokenNameIdentifier	 f Encoding
=	TokenNameEQUAL	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DOMInputImpl(String,String,String,String,String) 	TokenNameCOMMENT_LINE	DOMInputImpl(String,String,String,String,String) 
/** * An attribute of a language-binding dependent type that represents a * stream of bytes. * <br>The parser will ignore this if there is also a character stream * specified, but it will use a byte stream in preference to opening a * URI connection itself. * <br>If the application knows the character encoding of the byte stream, * it should set the encoding property. Setting the encoding in this way * will override any encoding specified in the XML declaration itself. */	TokenNameCOMMENT_JAVADOC	 An attribute of a language-binding dependent type that represents a stream of bytes. <br>The parser will ignore this if there is also a character stream specified, but it will use a byte stream in preference to opening a URI connection itself. <br>If the application knows the character encoding of the byte stream, it should set the encoding property. Setting the encoding in this way will override any encoding specified in the XML declaration itself. 
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
getByteStream	TokenNameIdentifier	 get Byte Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fByteStream	TokenNameIdentifier	 f Byte Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An attribute of a language-binding dependent type that represents a * stream of bytes. * <br>The parser will ignore this if there is also a character stream * specified, but it will use a byte stream in preference to opening a * URI connection itself. * <br>If the application knows the character encoding of the byte stream, * it should set the encoding property. Setting the encoding in this way * will override any encoding specified in the XML declaration itself. */	TokenNameCOMMENT_JAVADOC	 An attribute of a language-binding dependent type that represents a stream of bytes. <br>The parser will ignore this if there is also a character stream specified, but it will use a byte stream in preference to opening a URI connection itself. <br>If the application knows the character encoding of the byte stream, it should set the encoding property. Setting the encoding in this way will override any encoding specified in the XML declaration itself. 
public	TokenNamepublic	
void	TokenNamevoid	
setByteStream	TokenNameIdentifier	 set Byte Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
byteStream	TokenNameIdentifier	 byte Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fByteStream	TokenNameIdentifier	 f Byte Stream
=	TokenNameEQUAL	
byteStream	TokenNameIdentifier	 byte Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An attribute of a language-binding dependent type that represents a * stream of 16-bit units. Application must encode the stream using * UTF-16 (defined in and Amendment 1 of ). * <br>If a character stream is specified, the parser will ignore any byte * stream and will not attempt to open a URI connection to the system * identifier. */	TokenNameCOMMENT_JAVADOC	 An attribute of a language-binding dependent type that represents a stream of 16-bit units. Application must encode the stream using UTF-16 (defined in and Amendment 1 of ). <br>If a character stream is specified, the parser will ignore any byte stream and will not attempt to open a URI connection to the system identifier. 
public	TokenNamepublic	
Reader	TokenNameIdentifier	 Reader
getCharacterStream	TokenNameIdentifier	 get Character Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCharStream	TokenNameIdentifier	 f Char Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An attribute of a language-binding dependent type that represents a * stream of 16-bit units. Application must encode the stream using * UTF-16 (defined in and Amendment 1 of ). * <br>If a character stream is specified, the parser will ignore any byte * stream and will not attempt to open a URI connection to the system * identifier. */	TokenNameCOMMENT_JAVADOC	 An attribute of a language-binding dependent type that represents a stream of 16-bit units. Application must encode the stream using UTF-16 (defined in and Amendment 1 of ). <br>If a character stream is specified, the parser will ignore any byte stream and will not attempt to open a URI connection to the system identifier. 
public	TokenNamepublic	
void	TokenNamevoid	
setCharacterStream	TokenNameIdentifier	 set Character Stream
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
characterStream	TokenNameIdentifier	 character Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCharStream	TokenNameIdentifier	 f Char Stream
=	TokenNameEQUAL	
characterStream	TokenNameIdentifier	 character Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A string attribute that represents a sequence of 16 bit units (utf-16 * encoded characters). * <br>If string data is available in the input source, the parser will * ignore the character stream and the byte stream and will not attempt * to open a URI connection to the system identifier. */	TokenNameCOMMENT_JAVADOC	 A string attribute that represents a sequence of 16 bit units (utf-16 encoded characters). <br>If string data is available in the input source, the parser will ignore the character stream and the byte stream and will not attempt to open a URI connection to the system identifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStringData	TokenNameIdentifier	 get String Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fData	TokenNameIdentifier	 f Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A string attribute that represents a sequence of 16 bit units (utf-16 * encoded characters). * <br>If string data is available in the input source, the parser will * ignore the character stream and the byte stream and will not attempt * to open a URI connection to the system identifier. */	TokenNameCOMMENT_JAVADOC	 A string attribute that represents a sequence of 16 bit units (utf-16 encoded characters). <br>If string data is available in the input source, the parser will ignore the character stream and the byte stream and will not attempt to open a URI connection to the system identifier. 
public	TokenNamepublic	
void	TokenNamevoid	
setStringData	TokenNameIdentifier	 set String Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
stringData	TokenNameIdentifier	 string Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fData	TokenNameIdentifier	 f Data
=	TokenNameEQUAL	
stringData	TokenNameIdentifier	 string Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The character encoding, if known. The encoding must be a string * acceptable for an XML encoding declaration ( section 4.3.3 "Character * Encoding in Entities"). * <br>This attribute has no effect when the application provides a * character stream. For other sources of input, an encoding specified * by means of this attribute will override any encoding specified in * the XML claration or the Text Declaration, or an encoding obtained * from a higher level protocol, such as HTTP . */	TokenNameCOMMENT_JAVADOC	 The character encoding, if known. The encoding must be a string acceptable for an XML encoding declaration ( section 4.3.3 "Character Encoding in Entities"). <br>This attribute has no effect when the application provides a character stream. For other sources of input, an encoding specified by means of this attribute will override any encoding specified in the XML claration or the Text Declaration, or an encoding obtained from a higher level protocol, such as HTTP . 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fEncoding	TokenNameIdentifier	 f Encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The character encoding, if known. The encoding must be a string * acceptable for an XML encoding declaration ( section 4.3.3 "Character * Encoding in Entities"). * <br>This attribute has no effect when the application provides a * character stream. For other sources of input, an encoding specified * by means of this attribute will override any encoding specified in * the XML claration or the Text Declaration, or an encoding obtained * from a higher level protocol, such as HTTP . */	TokenNameCOMMENT_JAVADOC	 The character encoding, if known. The encoding must be a string acceptable for an XML encoding declaration ( section 4.3.3 "Character Encoding in Entities"). <br>This attribute has no effect when the application provides a character stream. For other sources of input, an encoding specified by means of this attribute will override any encoding specified in the XML claration or the Text Declaration, or an encoding obtained from a higher level protocol, such as HTTP . 
public	TokenNamepublic	
void	TokenNamevoid	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEncoding	TokenNameIdentifier	 f Encoding
=	TokenNameEQUAL	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The public identifier for this input source. The public identifier is * always optional: if the application writer includes one, it will be * provided as part of the location information. */	TokenNameCOMMENT_JAVADOC	 The public identifier for this input source. The public identifier is always optional: if the application writer includes one, it will be provided as part of the location information. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fPublicId	TokenNameIdentifier	 f Public Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The public identifier for this input source. The public identifier is * always optional: if the application writer includes one, it will be * provided as part of the location information. */	TokenNameCOMMENT_JAVADOC	 The public identifier for this input source. The public identifier is always optional: if the application writer includes one, it will be provided as part of the location information. 
public	TokenNamepublic	
void	TokenNamevoid	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fPublicId	TokenNameIdentifier	 f Public Id
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The system identifier, a URI reference , for this input source. The * system identifier is optional if there is a byte stream or a * character stream, but it is still useful to provide one, since the * application can use it to resolve relative URIs and can include it in * error messages and warnings (the parser will attempt to fetch the * ressource identifier by the URI reference only if there is no byte * stream or character stream specified). * <br>If the application knows the character encoding of the object * pointed to by the system identifier, it can register the encoding by * setting the encoding attribute. * <br>If the system ID is a relative URI reference (see section 5 in ), * the behavior is implementation dependent. */	TokenNameCOMMENT_JAVADOC	 The system identifier, a URI reference , for this input source. The system identifier is optional if there is a byte stream or a character stream, but it is still useful to provide one, since the application can use it to resolve relative URIs and can include it in error messages and warnings (the parser will attempt to fetch the ressource identifier by the URI reference only if there is no byte stream or character stream specified). <br>If the application knows the character encoding of the object pointed to by the system identifier, it can register the encoding by setting the encoding attribute. <br>If the system ID is a relative URI reference (see section 5 in ), the behavior is implementation dependent. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSystemId	TokenNameIdentifier	 f System Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The system identifier, a URI reference , for this input source. The * system identifier is optional if there is a byte stream or a * character stream, but it is still useful to provide one, since the * application can use it to resolve relative URIs and can include it in * error messages and warnings (the parser will attempt to fetch the * ressource identifier by the URI reference only if there is no byte * stream or character stream specified). * <br>If the application knows the character encoding of the object * pointed to by the system identifier, it can register the encoding by * setting the encoding attribute. * <br>If the system ID is a relative URI reference (see section 5 in ), * the behavior is implementation dependent. */	TokenNameCOMMENT_JAVADOC	 The system identifier, a URI reference , for this input source. The system identifier is optional if there is a byte stream or a character stream, but it is still useful to provide one, since the application can use it to resolve relative URIs and can include it in error messages and warnings (the parser will attempt to fetch the ressource identifier by the URI reference only if there is no byte stream or character stream specified). <br>If the application knows the character encoding of the object pointed to by the system identifier, it can register the encoding by setting the encoding attribute. <br>If the system ID is a relative URI reference (see section 5 in ), the behavior is implementation dependent. 
public	TokenNamepublic	
void	TokenNamevoid	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSystemId	TokenNameIdentifier	 f System Id
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The base URI to be used (see section 5.1.4 in ) for resolving relative * URIs to absolute URIs. If the baseURI is itself a relative URI, the * behavior is implementation dependent. */	TokenNameCOMMENT_JAVADOC	 The base URI to be used (see section 5.1.4 in ) for resolving relative URIs to absolute URIs. If the baseURI is itself a relative URI, the behavior is implementation dependent. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseURI	TokenNameIdentifier	 get Base URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The base URI to be used (see section 5.1.4 in ) for resolving relative * URIs to absolute URIs. If the baseURI is itself a relative URI, the * behavior is implementation dependent. */	TokenNameCOMMENT_JAVADOC	 The base URI to be used (see section 5.1.4 in ) for resolving relative URIs to absolute URIs. If the baseURI is itself a relative URI, the behavior is implementation dependent. 
public	TokenNamepublic	
void	TokenNamevoid	
setBaseURI	TokenNameIdentifier	 set Base URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseURI	TokenNameIdentifier	 base URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
=	TokenNameEQUAL	
baseURI	TokenNameIdentifier	 base URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If set to true, assume that the input is certified (see section 2.13 * in [<a href='http://www.w3.org/TR/2002/CR-xml11-20021015/'>XML 1.1</a>]) when * parsing [<a href='http://www.w3.org/TR/2002/CR-xml11-20021015/'>XML 1.1</a>]. */	TokenNameCOMMENT_JAVADOC	 If set to true, assume that the input is certified (see section 2.13 in [<a href='http://www.w3.org/TR/2002/CR-xml11-20021015/'>XML 1.1</a>]) when parsing [<a href='http://www.w3.org/TR/2002/CR-xml11-20021015/'>XML 1.1</a>]. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getCertifiedText	TokenNameIdentifier	 get Certified Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCertifiedText	TokenNameIdentifier	 f Certified Text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If set to true, assume that the input is certified (see section 2.13 * in [<a href='http://www.w3.org/TR/2002/CR-xml11-20021015/'>XML 1.1</a>]) when * parsing [<a href='http://www.w3.org/TR/2002/CR-xml11-20021015/'>XML 1.1</a>]. */	TokenNameCOMMENT_JAVADOC	 If set to true, assume that the input is certified (see section 2.13 in [<a href='http://www.w3.org/TR/2002/CR-xml11-20021015/'>XML 1.1</a>]) when parsing [<a href='http://www.w3.org/TR/2002/CR-xml11-20021015/'>XML 1.1</a>]. 
public	TokenNamepublic	
void	TokenNamevoid	
setCertifiedText	TokenNameIdentifier	 set Certified Text
(	TokenNameLPAREN	
boolean	TokenNameboolean	
certifiedText	TokenNameIdentifier	 certified Text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCertifiedText	TokenNameIdentifier	 f Certified Text
=	TokenNameEQUAL	
certifiedText	TokenNameIdentifier	 certified Text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class DOMInputImpl 	TokenNameCOMMENT_LINE	class DOMInputImpl 
