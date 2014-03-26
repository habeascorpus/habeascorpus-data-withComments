/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLInputSource	TokenNameIdentifier	 XML Input Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
XMLReader	TokenNameIdentifier	 XML Reader
;	TokenNameSEMICOLON	
/** * <p>An <code>XMLInputSource</code> analogue to <code>javax.xml.transform.sax.SAXSource</code>.</p> * * @version $Id: SAXInputSource.java 447241 2006-09-18 05:12:57Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>An <code>XMLInputSource</code> analogue to <code>javax.xml.transform.sax.SAXSource</code>.</p> * @version $Id: SAXInputSource.java 447241 2006-09-18 05:12:57Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
SAXInputSource	TokenNameIdentifier	 SAX Input Source
extends	TokenNameextends	
XMLInputSource	TokenNameIdentifier	 XML Input Source
{	TokenNameLBRACE	
private	TokenNameprivate	
XMLReader	TokenNameIdentifier	 XML Reader
fXMLReader	TokenNameIdentifier	 f XML Reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InputSource	TokenNameIdentifier	 Input Source
fInputSource	TokenNameIdentifier	 f Input Source
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SAXInputSource	TokenNameIdentifier	 SAX Input Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SAXInputSource	TokenNameIdentifier	 SAX Input Source
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
inputSource	TokenNameIdentifier	 input Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
inputSource	TokenNameIdentifier	 input Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SAXInputSource	TokenNameIdentifier	 SAX Input Source
(	TokenNameLPAREN	
XMLReader	TokenNameIdentifier	 XML Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
InputSource	TokenNameIdentifier	 Input Source
inputSource	TokenNameIdentifier	 input Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
inputSource	TokenNameIdentifier	 input Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
inputSource	TokenNameIdentifier	 input Source
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
,	TokenNameCOMMA	
inputSource	TokenNameIdentifier	 input Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
inputSource	TokenNameIdentifier	 input Source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inputSource	TokenNameIdentifier	 input Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setByteStream	TokenNameIdentifier	 set Byte Stream
(	TokenNameLPAREN	
inputSource	TokenNameIdentifier	 input Source
.	TokenNameDOT	
getByteStream	TokenNameIdentifier	 get Byte Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setCharacterStream	TokenNameIdentifier	 set Character Stream
(	TokenNameLPAREN	
inputSource	TokenNameIdentifier	 input Source
.	TokenNameDOT	
getCharacterStream	TokenNameIdentifier	 get Character Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
inputSource	TokenNameIdentifier	 input Source
.	TokenNameDOT	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fInputSource	TokenNameIdentifier	 f Input Source
=	TokenNameEQUAL	
inputSource	TokenNameIdentifier	 input Source
;	TokenNameSEMICOLON	
fXMLReader	TokenNameIdentifier	 f XML Reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setXMLReader	TokenNameIdentifier	 set XML Reader
(	TokenNameLPAREN	
XMLReader	TokenNameIdentifier	 XML Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fXMLReader	TokenNameIdentifier	 f XML Reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XMLReader	TokenNameIdentifier	 XML Reader
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fXMLReader	TokenNameIdentifier	 f XML Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setInputSource	TokenNameIdentifier	 set Input Source
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
inputSource	TokenNameIdentifier	 input Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inputSource	TokenNameIdentifier	 input Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
inputSource	TokenNameIdentifier	 input Source
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
inputSource	TokenNameIdentifier	 input Source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setByteStream	TokenNameIdentifier	 set Byte Stream
(	TokenNameLPAREN	
inputSource	TokenNameIdentifier	 input Source
.	TokenNameDOT	
getByteStream	TokenNameIdentifier	 get Byte Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setCharacterStream	TokenNameIdentifier	 set Character Stream
(	TokenNameLPAREN	
inputSource	TokenNameIdentifier	 input Source
.	TokenNameDOT	
getCharacterStream	TokenNameIdentifier	 get Character Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
inputSource	TokenNameIdentifier	 input Source
.	TokenNameDOT	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setByteStream	TokenNameIdentifier	 set Byte Stream
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setCharacterStream	TokenNameIdentifier	 set Character Stream
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fInputSource	TokenNameIdentifier	 f Input Source
=	TokenNameEQUAL	
inputSource	TokenNameIdentifier	 input Source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
InputSource	TokenNameIdentifier	 Input Source
getInputSource	TokenNameIdentifier	 get Input Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fInputSource	TokenNameIdentifier	 f Input Source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the public identifier. * * @param publicId The new public identifier. */	TokenNameCOMMENT_JAVADOC	 Sets the public identifier. * @param publicId The new public identifier. 
public	TokenNamepublic	
void	TokenNamevoid	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fInputSource	TokenNameIdentifier	 f Input Source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fInputSource	TokenNameIdentifier	 f Input Source
=	TokenNameEQUAL	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fInputSource	TokenNameIdentifier	 f Input Source
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setPublicId(String) 	TokenNameCOMMENT_LINE	setPublicId(String) 
/** * Sets the system identifier. * * @param systemId The new system identifier. */	TokenNameCOMMENT_JAVADOC	 Sets the system identifier. * @param systemId The new system identifier. 
public	TokenNamepublic	
void	TokenNamevoid	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fInputSource	TokenNameIdentifier	 f Input Source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fInputSource	TokenNameIdentifier	 f Input Source
=	TokenNameEQUAL	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fInputSource	TokenNameIdentifier	 f Input Source
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setSystemId(String) 	TokenNameCOMMENT_LINE	setSystemId(String) 
/** * Sets the byte stream. If the byte stream is not already opened * when this object is instantiated, then the code that opens the * stream should also set the byte stream on this object. Also, if * the encoding is auto-detected, then the encoding should also be * set on this object. * * @param byteStream The new byte stream. */	TokenNameCOMMENT_JAVADOC	 Sets the byte stream. If the byte stream is not already opened when this object is instantiated, then the code that opens the stream should also set the byte stream on this object. Also, if the encoding is auto-detected, then the encoding should also be set on this object. * @param byteStream The new byte stream. 
public	TokenNamepublic	
void	TokenNamevoid	
setByteStream	TokenNameIdentifier	 set Byte Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
byteStream	TokenNameIdentifier	 byte Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setByteStream	TokenNameIdentifier	 set Byte Stream
(	TokenNameLPAREN	
byteStream	TokenNameIdentifier	 byte Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fInputSource	TokenNameIdentifier	 f Input Source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fInputSource	TokenNameIdentifier	 f Input Source
=	TokenNameEQUAL	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fInputSource	TokenNameIdentifier	 f Input Source
.	TokenNameDOT	
setByteStream	TokenNameIdentifier	 set Byte Stream
(	TokenNameLPAREN	
byteStream	TokenNameIdentifier	 byte Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setByteStream(InputStream) 	TokenNameCOMMENT_LINE	setByteStream(InputStream) 
/** * Sets the character stream. If the character stream is not already * opened when this object is instantiated, then the code that opens * the stream should also set the character stream on this object. * Also, the encoding of the byte stream used by the reader should * also be set on this object, if known. * * @param charStream The new character stream. * * @see #setEncoding */	TokenNameCOMMENT_JAVADOC	 Sets the character stream. If the character stream is not already opened when this object is instantiated, then the code that opens the stream should also set the character stream on this object. Also, the encoding of the byte stream used by the reader should also be set on this object, if known. * @param charStream The new character stream. * @see #setEncoding 
public	TokenNamepublic	
void	TokenNamevoid	
setCharacterStream	TokenNameIdentifier	 set Character Stream
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
charStream	TokenNameIdentifier	 char Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setCharacterStream	TokenNameIdentifier	 set Character Stream
(	TokenNameLPAREN	
charStream	TokenNameIdentifier	 char Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fInputSource	TokenNameIdentifier	 f Input Source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fInputSource	TokenNameIdentifier	 f Input Source
=	TokenNameEQUAL	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fInputSource	TokenNameIdentifier	 f Input Source
.	TokenNameDOT	
setCharacterStream	TokenNameIdentifier	 set Character Stream
(	TokenNameLPAREN	
charStream	TokenNameIdentifier	 char Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setCharacterStream(Reader) 	TokenNameCOMMENT_LINE	setCharacterStream(Reader) 
/** * Sets the encoding of the stream. * * @param encoding The new encoding. */	TokenNameCOMMENT_JAVADOC	 Sets the encoding of the stream. * @param encoding The new encoding. 
public	TokenNamepublic	
void	TokenNamevoid	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fInputSource	TokenNameIdentifier	 f Input Source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fInputSource	TokenNameIdentifier	 f Input Source
=	TokenNameEQUAL	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fInputSource	TokenNameIdentifier	 f Input Source
.	TokenNameDOT	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setEncoding(String) 	TokenNameCOMMENT_LINE	setEncoding(String) 
}	TokenNameRBRACE	
// SAXInputSource 	TokenNameCOMMENT_LINE	SAXInputSource 
