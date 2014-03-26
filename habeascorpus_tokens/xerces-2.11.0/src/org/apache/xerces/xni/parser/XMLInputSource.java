/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
;	TokenNameSEMICOLON	
/** * This class represents an input source for an XML document. The * basic properties of an input source are the following: * <ul> * <li>public identifier</li> * <li>system identifier</li> * <li>byte stream or character stream</li> * <li> * </ul> * * @author Andy Clark, IBM * * @version $Id: XMLInputSource.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class represents an input source for an XML document. The basic properties of an input source are the following: <ul> <li>public identifier</li> <li>system identifier</li> <li>byte stream or character stream</li> <li> </ul> * @author Andy Clark, IBM * @version $Id: XMLInputSource.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLInputSource	TokenNameIdentifier	 XML Input Source
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Public identifier. */	TokenNameCOMMENT_JAVADOC	 Public identifier. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fPublicId	TokenNameIdentifier	 f Public Id
;	TokenNameSEMICOLON	
/** System identifier. */	TokenNameCOMMENT_JAVADOC	 System identifier. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fSystemId	TokenNameIdentifier	 f System Id
;	TokenNameSEMICOLON	
/** Base system identifier. */	TokenNameCOMMENT_JAVADOC	 Base system identifier. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fBaseSystemId	TokenNameIdentifier	 f Base System Id
;	TokenNameSEMICOLON	
/** Byte stream. */	TokenNameCOMMENT_JAVADOC	 Byte stream. 
protected	TokenNameprotected	
InputStream	TokenNameIdentifier	 Input Stream
fByteStream	TokenNameIdentifier	 f Byte Stream
;	TokenNameSEMICOLON	
/** Character stream. */	TokenNameCOMMENT_JAVADOC	 Character stream. 
protected	TokenNameprotected	
Reader	TokenNameIdentifier	 Reader
fCharStream	TokenNameIdentifier	 f Char Stream
;	TokenNameSEMICOLON	
/** Encoding. */	TokenNameCOMMENT_JAVADOC	 Encoding. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fEncoding	TokenNameIdentifier	 f Encoding
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs an input source from just the public and system * identifiers, leaving resolution of the entity and opening of * the input stream up to the caller. * * @param publicId The public identifier, if known. * @param systemId The system identifier. This value should * always be set, if possible, and can be * relative or absolute. If the system identifier * is relative, then the base system identifier * should be set. * @param baseSystemId The base system identifier. This value should * always be set to the fully expanded URI of the * base system identifier, if possible. */	TokenNameCOMMENT_JAVADOC	 Constructs an input source from just the public and system identifiers, leaving resolution of the entity and opening of the input stream up to the caller. * @param publicId The public identifier, if known. @param systemId The system identifier. This value should always be set, if possible, and can be relative or absolute. If the system identifier is relative, then the base system identifier should be set. @param baseSystemId The base system identifier. This value should always be set to the fully expanded URI of the base system identifier, if possible. 
public	TokenNamepublic	
XMLInputSource	TokenNameIdentifier	 XML Input Source
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
// <init>(String,String,String) 	TokenNameCOMMENT_LINE	<init>(String,String,String) 
/** * Constructs an input source from a XMLResourceIdentifier * object, leaving resolution of the entity and opening of * the input stream up to the caller. * * @param resourceIdentifier the XMLResourceIdentifier containing the information */	TokenNameCOMMENT_JAVADOC	 Constructs an input source from a XMLResourceIdentifier object, leaving resolution of the entity and opening of the input stream up to the caller. * @param resourceIdentifier the XMLResourceIdentifier containing the information 
public	TokenNamepublic	
XMLInputSource	TokenNameIdentifier	 XML Input Source
(	TokenNameLPAREN	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
resourceIdentifier	TokenNameIdentifier	 resource Identifier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fPublicId	TokenNameIdentifier	 f Public Id
=	TokenNameEQUAL	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fSystemId	TokenNameIdentifier	 f System Id
=	TokenNameEQUAL	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
.	TokenNameDOT	
getLiteralSystemId	TokenNameIdentifier	 get Literal System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
=	TokenNameEQUAL	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
.	TokenNameDOT	
getBaseSystemId	TokenNameIdentifier	 get Base System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(XMLResourceIdentifier) 	TokenNameCOMMENT_LINE	<init>(XMLResourceIdentifier) 
/** * Constructs an input source from a byte stream. * * @param publicId The public identifier, if known. * @param systemId The system identifier. This value should * always be set, if possible, and can be * relative or absolute. If the system identifier * is relative, then the base system identifier * should be set. * @param baseSystemId The base system identifier. This value should * always be set to the fully expanded URI of the * base system identifier, if possible. * @param byteStream The byte stream. * @param encoding The encoding of the byte stream, if known. */	TokenNameCOMMENT_JAVADOC	 Constructs an input source from a byte stream. * @param publicId The public identifier, if known. @param systemId The system identifier. This value should always be set, if possible, and can be relative or absolute. If the system identifier is relative, then the base system identifier should be set. @param baseSystemId The base system identifier. This value should always be set to the fully expanded URI of the base system identifier, if possible. @param byteStream The byte stream. @param encoding The encoding of the byte stream, if known. 
public	TokenNamepublic	
XMLInputSource	TokenNameIdentifier	 XML Input Source
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
// <init>(String,String,String,InputStream,String) 	TokenNameCOMMENT_LINE	<init>(String,String,String,InputStream,String) 
/** * Constructs an input source from a character stream. * * @param publicId The public identifier, if known. * @param systemId The system identifier. This value should * always be set, if possible, and can be * relative or absolute. If the system identifier * is relative, then the base system identifier * should be set. * @param baseSystemId The base system identifier. This value should * always be set to the fully expanded URI of the * base system identifier, if possible. * @param charStream The character stream. * @param encoding The original encoding of the byte stream * used by the reader, if known. */	TokenNameCOMMENT_JAVADOC	 Constructs an input source from a character stream. * @param publicId The public identifier, if known. @param systemId The system identifier. This value should always be set, if possible, and can be relative or absolute. If the system identifier is relative, then the base system identifier should be set. @param baseSystemId The base system identifier. This value should always be set to the fully expanded URI of the base system identifier, if possible. @param charStream The character stream. @param encoding The original encoding of the byte stream used by the reader, if known. 
public	TokenNamepublic	
XMLInputSource	TokenNameIdentifier	 XML Input Source
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
// <init>(String,String,String,Reader,String) 	TokenNameCOMMENT_LINE	<init>(String,String,String,Reader,String) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * Sets the public identifier. * * @param publicId The new public identifier. */	TokenNameCOMMENT_JAVADOC	 Sets the public identifier. * @param publicId The new public identifier. 
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
// setPublicId(String) 	TokenNameCOMMENT_LINE	setPublicId(String) 
/** Returns the public identifier. */	TokenNameCOMMENT_JAVADOC	 Returns the public identifier. 
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
// getPublicId():String 	TokenNameCOMMENT_LINE	getPublicId():String 
/** * Sets the system identifier. * * @param systemId The new system identifier. */	TokenNameCOMMENT_JAVADOC	 Sets the system identifier. * @param systemId The new system identifier. 
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
// setSystemId(String) 	TokenNameCOMMENT_LINE	setSystemId(String) 
/** Returns the system identifier. */	TokenNameCOMMENT_JAVADOC	 Returns the system identifier. 
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
// getSystemId():String 	TokenNameCOMMENT_LINE	getSystemId():String 
/** * Sets the base system identifier. * * @param baseSystemId The new base system identifier. */	TokenNameCOMMENT_JAVADOC	 Sets the base system identifier. * @param baseSystemId The new base system identifier. 
public	TokenNamepublic	
void	TokenNamevoid	
setBaseSystemId	TokenNameIdentifier	 set Base System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseSystemId	TokenNameIdentifier	 base System Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
=	TokenNameEQUAL	
baseSystemId	TokenNameIdentifier	 base System Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setBaseSystemId(String) 	TokenNameCOMMENT_LINE	setBaseSystemId(String) 
/** Returns the base system identifier. */	TokenNameCOMMENT_JAVADOC	 Returns the base system identifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseSystemId	TokenNameIdentifier	 get Base System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getBaseSystemId():String 	TokenNameCOMMENT_LINE	getBaseSystemId():String 
/** * Sets the byte stream. If the byte stream is not already opened * when this object is instantiated, then the code that opens the * stream should also set the byte stream on this object. Also, if * the encoding is auto-detected, then the encoding should also be * set on this object. * * @param byteStream The new byte stream. */	TokenNameCOMMENT_JAVADOC	 Sets the byte stream. If the byte stream is not already opened when this object is instantiated, then the code that opens the stream should also set the byte stream on this object. Also, if the encoding is auto-detected, then the encoding should also be set on this object. * @param byteStream The new byte stream. 
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
// setByteStream(InputSource) 	TokenNameCOMMENT_LINE	setByteStream(InputSource) 
/** Returns the byte stream. */	TokenNameCOMMENT_JAVADOC	 Returns the byte stream. 
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
// getByteStream():InputStream 	TokenNameCOMMENT_LINE	getByteStream():InputStream 
/** * Sets the character stream. If the character stream is not already * opened when this object is instantiated, then the code that opens * the stream should also set the character stream on this object. * Also, the encoding of the byte stream used by the reader should * also be set on this object, if known. * * @param charStream The new character stream. * * @see #setEncoding */	TokenNameCOMMENT_JAVADOC	 Sets the character stream. If the character stream is not already opened when this object is instantiated, then the code that opens the stream should also set the character stream on this object. Also, the encoding of the byte stream used by the reader should also be set on this object, if known. * @param charStream The new character stream. * @see #setEncoding 
public	TokenNamepublic	
void	TokenNamevoid	
setCharacterStream	TokenNameIdentifier	 set Character Stream
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
charStream	TokenNameIdentifier	 char Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCharStream	TokenNameIdentifier	 f Char Stream
=	TokenNameEQUAL	
charStream	TokenNameIdentifier	 char Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setCharacterStream(Reader) 	TokenNameCOMMENT_LINE	setCharacterStream(Reader) 
/** Returns the character stream. */	TokenNameCOMMENT_JAVADOC	 Returns the character stream. 
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
// getCharacterStream():Reader 	TokenNameCOMMENT_LINE	getCharacterStream():Reader 
/** * Sets the encoding of the stream. * * @param encoding The new encoding. */	TokenNameCOMMENT_JAVADOC	 Sets the encoding of the stream. * @param encoding The new encoding. 
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
// setEncoding(String) 	TokenNameCOMMENT_LINE	setEncoding(String) 
/** Returns the encoding of the stream, or null if not known. */	TokenNameCOMMENT_JAVADOC	 Returns the encoding of the stream, or null if not known. 
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
// getEncoding():String 	TokenNameCOMMENT_LINE	getEncoding():String 
}	TokenNameRBRACE	
// class XMLInputSource 	TokenNameCOMMENT_LINE	class XMLInputSource 
