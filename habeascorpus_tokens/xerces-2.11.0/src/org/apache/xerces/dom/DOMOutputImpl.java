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
OutputStream	TokenNameIdentifier	 Output Stream
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ls	TokenNameIdentifier	 ls
.	TokenNameDOT	
LSOutput	TokenNameIdentifier	 LS Output
;	TokenNameSEMICOLON	
/** * This class represents an output destination for data. * This interface allows an application to encapsulate information about an * output destination in a single object, which may include a URI, a byte stream * (possibly with a specifiedencoding), a base URI, and/or a character stream. * The exact definitions of a byte stream and a character stream are binding * dependent. * The application is expected to provide objects that implement this interface * whenever such objects are needed. The application can either provide its * own objects that implement this interface, or it can use the generic factory * method DOMImplementationLS.createLSOutput() to create objects that * implement this interface. * The DOMSerializer will use the LSOutput object to determine where to * serialize the output to. The DOMSerializer will look at the different * outputs specified in the LSOutput in the following order to know which one * to output to, the first one that data can be output to will be used: * 1.LSOutput.characterStream * 2.LSOutput.byteStream * 3.LSOutput.systemId * LSOutput objects belong to the application. The DOM implementation will * never modify them (though it may make copies and modify the copies, * if necessary). * * @xerces.internal * * @author Arun Yadav, Sun Microsytems * @author Gopal Sharma, Sun Microsystems **/	TokenNameCOMMENT_JAVADOC	 This class represents an output destination for data. This interface allows an application to encapsulate information about an output destination in a single object, which may include a URI, a byte stream (possibly with a specifiedencoding), a base URI, and/or a character stream. The exact definitions of a byte stream and a character stream are binding dependent. The application is expected to provide objects that implement this interface whenever such objects are needed. The application can either provide its own objects that implement this interface, or it can use the generic factory method DOMImplementationLS.createLSOutput() to create objects that implement this interface. The DOMSerializer will use the LSOutput object to determine where to serialize the output to. The DOMSerializer will look at the different outputs specified in the LSOutput in the following order to know which one to output to, the first one that data can be output to will be used: 1.LSOutput.characterStream 2.LSOutput.byteStream 3.LSOutput.systemId LSOutput objects belong to the application. The DOM implementation will never modify them (though it may make copies and modify the copies, if necessary). * @xerces.internal * @author Arun Yadav, Sun Microsytems @author Gopal Sharma, Sun Microsystems *
public	TokenNamepublic	
class	TokenNameclass	
DOMOutputImpl	TokenNameIdentifier	 DOM Output Impl
implements	TokenNameimplements	
LSOutput	TokenNameIdentifier	 LS Output
{	TokenNameLBRACE	
protected	TokenNameprotected	
Writer	TokenNameIdentifier	 Writer
fCharStream	TokenNameIdentifier	 f Char Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
OutputStream	TokenNameIdentifier	 Output Stream
fByteStream	TokenNameIdentifier	 f Byte Stream
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
fEncoding	TokenNameIdentifier	 f Encoding
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Default Constructor */	TokenNameCOMMENT_JAVADOC	 Default Constructor 
public	TokenNamepublic	
DOMOutputImpl	TokenNameIdentifier	 DOM Output Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * An attribute of a language and binding dependent type that represents a * writable stream of bytes. If the application knows the character encoding * of the byte stream, it should set the encoding attribute. Setting the * encoding in this way will override any encoding specified in an XML * declaration in the data. */	TokenNameCOMMENT_JAVADOC	 An attribute of a language and binding dependent type that represents a writable stream of bytes. If the application knows the character encoding of the byte stream, it should set the encoding attribute. Setting the encoding in this way will override any encoding specified in an XML declaration in the data. 
public	TokenNamepublic	
Writer	TokenNameIdentifier	 Writer
getCharacterStream	TokenNameIdentifier	 get Character Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCharStream	TokenNameIdentifier	 f Char Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * An attribute of a language and binding dependent type that represents a * writable stream of bytes. If the application knows the character encoding * of the byte stream, it should set the encoding attribute. Setting the * encoding in this way will override any encoding specified in an XML * declaration in the data. */	TokenNameCOMMENT_JAVADOC	 An attribute of a language and binding dependent type that represents a writable stream of bytes. If the application knows the character encoding of the byte stream, it should set the encoding attribute. Setting the encoding in this way will override any encoding specified in an XML declaration in the data. 
public	TokenNamepublic	
void	TokenNamevoid	
setCharacterStream	TokenNameIdentifier	 set Character Stream
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
characterStream	TokenNameIdentifier	 character Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCharStream	TokenNameIdentifier	 f Char Stream
=	TokenNameEQUAL	
characterStream	TokenNameIdentifier	 character Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Depending on the language binding in use, this attribute may not be * available. An attribute of a language and binding dependent type that * represents a writable stream to which 16-bit units can be output. The * application must encode the stream using UTF-16 (defined in [Unicode] and * Amendment 1 of [ISO/IEC 10646]). */	TokenNameCOMMENT_JAVADOC	 Depending on the language binding in use, this attribute may not be available. An attribute of a language and binding dependent type that represents a writable stream to which 16-bit units can be output. The application must encode the stream using UTF-16 (defined in [Unicode] and Amendment 1 of [ISO/IEC 10646]). 
public	TokenNamepublic	
OutputStream	TokenNameIdentifier	 Output Stream
getByteStream	TokenNameIdentifier	 get Byte Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fByteStream	TokenNameIdentifier	 f Byte Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Depending on the language binding in use, this attribute may not be * available. An attribute of a language and binding dependent type that * represents a writable stream to which 16-bit units can be output. The * application must encode the stream using UTF-16 (defined in [Unicode] and * Amendment 1 of [ISO/IEC 10646]). */	TokenNameCOMMENT_JAVADOC	 Depending on the language binding in use, this attribute may not be available. An attribute of a language and binding dependent type that represents a writable stream to which 16-bit units can be output. The application must encode the stream using UTF-16 (defined in [Unicode] and Amendment 1 of [ISO/IEC 10646]). 
public	TokenNamepublic	
void	TokenNamevoid	
setByteStream	TokenNameIdentifier	 set Byte Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
byteStream	TokenNameIdentifier	 byte Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fByteStream	TokenNameIdentifier	 f Byte Stream
=	TokenNameEQUAL	
byteStream	TokenNameIdentifier	 byte Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * The system identifier, a URI reference [IETF RFC 2396], for this output * destination. If the application knows the character encoding of the * object pointed to by the system identifier, it can set the encoding * using the encoding attribute. If the system ID is a relative URI * reference (see section 5 in [IETF RFC 2396]), the behavior is * implementation dependent. */	TokenNameCOMMENT_JAVADOC	 The system identifier, a URI reference [IETF RFC 2396], for this output destination. If the application knows the character encoding of the object pointed to by the system identifier, it can set the encoding using the encoding attribute. If the system ID is a relative URI reference (see section 5 in [IETF RFC 2396]), the behavior is implementation dependent. 
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
;	TokenNameSEMICOLON	
/** * The system identifier, a URI reference [IETF RFC 2396], for this output * destination. If the application knows the character encoding of the * object pointed to by the system identifier, it can set the encoding * using the encoding attribute. If the system ID is a relative URI * reference (see section 5 in [IETF RFC 2396]), the behavior is * implementation dependent. */	TokenNameCOMMENT_JAVADOC	 The system identifier, a URI reference [IETF RFC 2396], for this output destination. If the application knows the character encoding of the object pointed to by the system identifier, it can set the encoding using the encoding attribute. If the system ID is a relative URI reference (see section 5 in [IETF RFC 2396]), the behavior is implementation dependent. 
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
;	TokenNameSEMICOLON	
/** * The character encoding, if known. The encoding must be a string * acceptable for an XML encoding declaration ([XML 1.0] section 4.3.3 * "Character Encoding in Entities"). This attribute has no effect when the * application provides a character stream or string data. For other sources * of input, an encoding specified by means of this attribute will override * any encoding specified in the XML declaration or the Text declaration, or * an encoding obtained from a higher level protocol, such as HTTP * [IETF RFC 2616]. */	TokenNameCOMMENT_JAVADOC	 The character encoding, if known. The encoding must be a string acceptable for an XML encoding declaration ([XML 1.0] section 4.3.3 "Character Encoding in Entities"). This attribute has no effect when the application provides a character stream or string data. For other sources of input, an encoding specified by means of this attribute will override any encoding specified in the XML declaration or the Text declaration, or an encoding obtained from a higher level protocol, such as HTTP [IETF RFC 2616]. 
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
;	TokenNameSEMICOLON	
/** * The character encoding, if known. The encoding must be a string * acceptable for an XML encoding declaration ([XML 1.0] section 4.3.3 * "Character Encoding in Entities"). This attribute has no effect when the * application provides a character stream or string data. For other sources * of input, an encoding specified by means of this attribute will override * any encoding specified in the XML declaration or the Text declaration, or * an encoding obtained from a higher level protocol, such as HTTP * [IETF RFC 2616]. */	TokenNameCOMMENT_JAVADOC	 The character encoding, if known. The encoding must be a string acceptable for an XML encoding declaration ([XML 1.0] section 4.3.3 "Character Encoding in Entities"). This attribute has no effect when the application provides a character stream or string data. For other sources of input, an encoding specified by means of this attribute will override any encoding specified in the XML declaration or the Text declaration, or an encoding obtained from a higher level protocol, such as HTTP [IETF RFC 2616]. 
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//DOMOutputImpl 	TokenNameCOMMENT_LINE	DOMOutputImpl 
