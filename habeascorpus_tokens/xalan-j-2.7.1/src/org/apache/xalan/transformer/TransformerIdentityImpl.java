/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TransformerIdentityImpl.java 575747 2007-09-14 16:28:37Z kcormier $ */	TokenNameCOMMENT_BLOCK	 $Id: TransformerIdentityImpl.java 575747 2007-09-14 16:28:37Z kcormier $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
XMLConstants	TokenNameIdentifier	 XML Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilder	TokenNameIdentifier	 Document Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
ErrorListener	TokenNameIdentifier	 Error Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
OutputKeys	TokenNameIdentifier	 Output Keys
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Result	TokenNameIdentifier	 Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Source	TokenNameIdentifier	 Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Transformer	TokenNameIdentifier	 Transformer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
URIResolver	TokenNameIdentifier	 URI Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMResult	TokenNameIdentifier	 DOM Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMSource	TokenNameIdentifier	 DOM Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXResult	TokenNameIdentifier	 SAX Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXSource	TokenNameIdentifier	 SAX Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamSource	TokenNameIdentifier	 Stream Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamResult	TokenNameIdentifier	 Stream Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
OutputProperties	TokenNameIdentifier	 Output Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
Serializer	TokenNameIdentifier	 Serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
DOMBuilder	TokenNameIdentifier	 DOM Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
XMLReaderManager	TokenNameIdentifier	 XML Reader Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DocumentFragment	TokenNameIdentifier	 Document Fragment
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
DTDHandler	TokenNameIdentifier	 DTD Handler
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
Locator	TokenNameIdentifier	 Locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
DeclHandler	TokenNameIdentifier	 Decl Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
;	TokenNameSEMICOLON	
/** * This class implements an identity transformer for * {@link javax.xml.transform.sax.SAXTransformerFactory#newTransformerHandler()} * and {@link javax.xml.transform.TransformerFactory#newTransformer()}. It * simply feeds SAX events directly to a serializer ContentHandler, if the * result is a stream. If the result is a DOM, it will send the events to * {@link org.apache.xml.utils.DOMBuilder}. If the result is another * content handler, it will simply pass the events on. */	TokenNameCOMMENT_JAVADOC	 This class implements an identity transformer for {@link javax.xml.transform.sax.SAXTransformerFactory#newTransformerHandler()} and {@link javax.xml.transform.TransformerFactory#newTransformer()}. It simply feeds SAX events directly to a serializer ContentHandler, if the result is a stream. If the result is a DOM, it will send the events to {@link org.apache.xml.utils.DOMBuilder}. If the result is another content handler, it will simply pass the events on. 
public	TokenNamepublic	
class	TokenNameclass	
TransformerIdentityImpl	TokenNameIdentifier	 Transformer Identity Impl
extends	TokenNameextends	
Transformer	TokenNameIdentifier	 Transformer
implements	TokenNameimplements	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
,	TokenNameCOMMA	
DeclHandler	TokenNameIdentifier	 Decl Handler
{	TokenNameLBRACE	
/** * Constructor TransformerIdentityImpl creates an identity transform. * */	TokenNameCOMMENT_JAVADOC	 Constructor TransformerIdentityImpl creates an identity transform. 
public	TokenNamepublic	
TransformerIdentityImpl	TokenNameIdentifier	 Transformer Identity Impl
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isSecureProcessing	TokenNameIdentifier	 is Secure Processing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputFormat	TokenNameIdentifier	 m output Format
=	TokenNameEQUAL	
new	TokenNamenew	
OutputProperties	TokenNameIdentifier	 Output Properties
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XML	TokenNameIdentifier	 XML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_isSecureProcessing	TokenNameIdentifier	 m is Secure Processing
=	TokenNameEQUAL	
isSecureProcessing	TokenNameIdentifier	 is Secure Processing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor TransformerIdentityImpl creates an identity transform. * */	TokenNameCOMMENT_JAVADOC	 Constructor TransformerIdentityImpl creates an identity transform. 
public	TokenNamepublic	
TransformerIdentityImpl	TokenNameIdentifier	 Transformer Identity Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Enables the user of the TransformerHandler to set the * to set the Result for the transformation. * * @param result A Result instance, should not be null. * * @throws IllegalArgumentException if result is invalid for some reason. */	TokenNameCOMMENT_JAVADOC	 Enables the user of the TransformerHandler to set the to set the Result for the transformation. * @param result A Result instance, should not be null. * @throws IllegalArgumentException if result is invalid for some reason. 
public	TokenNamepublic	
void	TokenNamevoid	
setResult	TokenNameIdentifier	 set Result
(	TokenNameLPAREN	
Result	TokenNameIdentifier	 Result
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_RESULT_NULL	TokenNameIdentifier	 ER  RESULT  NULL
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Result should not be null"); 	TokenNameCOMMENT_LINE	"Result should not be null"); 
m_result	TokenNameIdentifier	 m result
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the base ID (URI or system ID) from where relative * URLs will be resolved. * @param systemID Base URI for the source tree. */	TokenNameCOMMENT_JAVADOC	 Set the base ID (URI or system ID) from where relative URLs will be resolved. @param systemID Base URI for the source tree. 
public	TokenNamepublic	
void	TokenNamevoid	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemID	TokenNameIdentifier	 system ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_systemID	TokenNameIdentifier	 m system ID
=	TokenNameEQUAL	
systemID	TokenNameIdentifier	 system ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the base ID (URI or system ID) from where relative * URLs will be resolved. * @return The systemID that was set with {@link #setSystemId}. */	TokenNameCOMMENT_JAVADOC	 Get the base ID (URI or system ID) from where relative URLs will be resolved. @return The systemID that was set with {@link #setSystemId}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_systemID	TokenNameIdentifier	 m system ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the Transformer associated with this handler, which * is needed in order to set parameters and output properties. * * @return non-null reference to the transformer. */	TokenNameCOMMENT_JAVADOC	 Get the Transformer associated with this handler, which is needed in order to set parameters and output properties. * @return non-null reference to the transformer. 
public	TokenNamepublic	
Transformer	TokenNameIdentifier	 Transformer
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset the status of the transformer. */	TokenNameCOMMENT_JAVADOC	 Reset the status of the transformer. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_flushedStartDoc	TokenNameIdentifier	 m flushed Start Doc
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_foundFirstElement	TokenNameIdentifier	 m found First Element
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_outputStream	TokenNameIdentifier	 m output Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
clearParameters	TokenNameIdentifier	 clear Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_result	TokenNameIdentifier	 m result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_resultDeclHandler	TokenNameIdentifier	 m result Decl Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_resultDTDHandler	TokenNameIdentifier	 m result DTD Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_serializer	TokenNameIdentifier	 m serializer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_systemID	TokenNameIdentifier	 m system ID
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_URIResolver	TokenNameIdentifier	 m  URI Resolver
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_outputFormat	TokenNameIdentifier	 m output Format
=	TokenNameEQUAL	
new	TokenNamenew	
OutputProperties	TokenNameIdentifier	 Output Properties
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XML	TokenNameIdentifier	 XML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a result ContentHandler from a Result object, based * on the current OutputProperties. * * @param outputTarget Where the transform result should go, * should not be null. * * @return A valid ContentHandler that will create the * result tree when it is fed SAX events. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a result ContentHandler from a Result object, based on the current OutputProperties. * @param outputTarget Where the transform result should go, should not be null. * @return A valid ContentHandler that will create the result tree when it is fed SAX events. * @throws TransformerException 
private	TokenNameprivate	
void	TokenNamevoid	
createResultContentHandler	TokenNameIdentifier	 create Result Content Handler
(	TokenNameLPAREN	
Result	TokenNameIdentifier	 Result
outputTarget	TokenNameIdentifier	 output Target
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
outputTarget	TokenNameIdentifier	 output Target
instanceof	TokenNameinstanceof	
SAXResult	TokenNameIdentifier	 SAX Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SAXResult	TokenNameIdentifier	 SAX Result
saxResult	TokenNameIdentifier	 sax Result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SAXResult	TokenNameIdentifier	 SAX Result
)	TokenNameRPAREN	
outputTarget	TokenNameIdentifier	 output Target
;	TokenNameSEMICOLON	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
=	TokenNameEQUAL	
saxResult	TokenNameIdentifier	 sax Result
.	TokenNameDOT	
getHandler	TokenNameIdentifier	 get Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
=	TokenNameEQUAL	
saxResult	TokenNameIdentifier	 sax Result
.	TokenNameDOT	
getLexicalHandler	TokenNameIdentifier	 get Lexical Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
instanceof	TokenNameinstanceof	
Serializer	TokenNameIdentifier	 Serializer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Dubious but needed, I think. 	TokenNameCOMMENT_LINE	Dubious but needed, I think. 
m_serializer	TokenNameIdentifier	 m serializer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Serializer	TokenNameIdentifier	 Serializer
)	TokenNameRPAREN	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
outputTarget	TokenNameIdentifier	 output Target
instanceof	TokenNameinstanceof	
DOMResult	TokenNameIdentifier	 DOM Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DOMResult	TokenNameIdentifier	 DOM Result
domResult	TokenNameIdentifier	 dom Result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMResult	TokenNameIdentifier	 DOM Result
)	TokenNameRPAREN	
outputTarget	TokenNameIdentifier	 output Target
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
outputNode	TokenNameIdentifier	 output Node
=	TokenNameEQUAL	
domResult	TokenNameIdentifier	 dom Result
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
nextSibling	TokenNameIdentifier	 next Sibling
=	TokenNameEQUAL	
domResult	TokenNameIdentifier	 dom Result
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
short	TokenNameshort	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
outputNode	TokenNameIdentifier	 output Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
outputNode	TokenNameIdentifier	 output Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
)	TokenNameRPAREN	
outputNode	TokenNameIdentifier	 output Node
:	TokenNameCOLON	
outputNode	TokenNameIdentifier	 output Node
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
dbf	TokenNameIdentifier	 dbf
=	TokenNameEQUAL	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_isSecureProcessing	TokenNameIdentifier	 m is Secure Processing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
FEATURE_SECURE_PROCESSING	TokenNameIdentifier	 FEATURE  SECURE  PROCESSING
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
pce	TokenNameIdentifier	 pce
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
DocumentBuilder	TokenNameIdentifier	 Document Builder
db	TokenNameIdentifier	 db
=	TokenNameEQUAL	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
newDocument	TokenNameIdentifier	 new Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
pce	TokenNameIdentifier	 pce
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
pce	TokenNameIdentifier	 pce
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
outputNode	TokenNameIdentifier	 output Node
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
outputNode	TokenNameIdentifier	 output Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DOMResult	TokenNameIdentifier	 DOM Result
)	TokenNameRPAREN	
outputTarget	TokenNameIdentifier	 output Target
)	TokenNameRPAREN	
.	TokenNameDOT	
setNode	TokenNameIdentifier	 set Node
(	TokenNameLPAREN	
outputNode	TokenNameIdentifier	 output Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DOMBuilder	TokenNameIdentifier	 DOM Builder
domBuilder	TokenNameIdentifier	 dom Builder
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
DOMBuilder	TokenNameIdentifier	 DOM Builder
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
(	TokenNameLPAREN	
DocumentFragment	TokenNameIdentifier	 Document Fragment
)	TokenNameRPAREN	
outputNode	TokenNameIdentifier	 output Node
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
DOMBuilder	TokenNameIdentifier	 DOM Builder
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
outputNode	TokenNameIdentifier	 output Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextSibling	TokenNameIdentifier	 next Sibling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
domBuilder	TokenNameIdentifier	 dom Builder
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
nextSibling	TokenNameIdentifier	 next Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
=	TokenNameEQUAL	
domBuilder	TokenNameIdentifier	 dom Builder
;	TokenNameSEMICOLON	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
=	TokenNameEQUAL	
domBuilder	TokenNameIdentifier	 dom Builder
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
outputTarget	TokenNameIdentifier	 output Target
instanceof	TokenNameinstanceof	
StreamResult	TokenNameIdentifier	 Stream Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StreamResult	TokenNameIdentifier	 Stream Result
sresult	TokenNameIdentifier	 sresult
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StreamResult	TokenNameIdentifier	 Stream Result
)	TokenNameRPAREN	
outputTarget	TokenNameIdentifier	 output Target
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Serializer	TokenNameIdentifier	 Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
.	TokenNameDOT	
getSerializer	TokenNameIdentifier	 get Serializer
(	TokenNameLPAREN	
m_outputFormat	TokenNameIdentifier	 m output Format
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_serializer	TokenNameIdentifier	 m serializer
=	TokenNameEQUAL	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
sresult	TokenNameIdentifier	 sresult
.	TokenNameDOT	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
sresult	TokenNameIdentifier	 sresult
.	TokenNameDOT	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
sresult	TokenNameIdentifier	 sresult
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
sresult	TokenNameIdentifier	 sresult
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
sresult	TokenNameIdentifier	 sresult
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fileURL	TokenNameIdentifier	 file URL
=	TokenNameEQUAL	
sresult	TokenNameIdentifier	 sresult
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fileURL	TokenNameIdentifier	 file URL
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"file:///"	TokenNameStringLiteral	file:///
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fileURL	TokenNameIdentifier	 file URL
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileURL	TokenNameIdentifier	 file URL
=	TokenNameEQUAL	
fileURL	TokenNameIdentifier	 file URL
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fileURL	TokenNameIdentifier	 file URL
=	TokenNameEQUAL	
fileURL	TokenNameIdentifier	 file URL
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fileURL	TokenNameIdentifier	 file URL
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"file:/"	TokenNameStringLiteral	file:/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fileURL	TokenNameIdentifier	 file URL
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileURL	TokenNameIdentifier	 file URL
=	TokenNameEQUAL	
fileURL	TokenNameIdentifier	 file URL
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fileURL	TokenNameIdentifier	 file URL
=	TokenNameEQUAL	
fileURL	TokenNameIdentifier	 file URL
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_outputStream	TokenNameIdentifier	 m output Stream
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
fileURL	TokenNameIdentifier	 file URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
m_outputStream	TokenNameIdentifier	 m output Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier	 ER  NO  OUTPUT  SPECIFIED
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"No output specified!"); 	TokenNameCOMMENT_LINE	"No output specified!"); 
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
=	TokenNameEQUAL	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
asContentHandler	TokenNameIdentifier	 as Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_CANNOT_TRANSFORM_TO_RESULT_TYPE	TokenNameIdentifier	 ER  CANNOT  TRANSFORM  TO  RESULT  TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
outputTarget	TokenNameIdentifier	 output Target
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can't transform to a Result of type " 	TokenNameCOMMENT_LINE	"Can't transform to a Result of type " 
// + outputTarget.getClass().getName() 	TokenNameCOMMENT_LINE	+ outputTarget.getClass().getName() 
// + "!"); 	TokenNameCOMMENT_LINE	+ "!"); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
instanceof	TokenNameinstanceof	
DTDHandler	TokenNameIdentifier	 DTD Handler
)	TokenNameRPAREN	
m_resultDTDHandler	TokenNameIdentifier	 m result DTD Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTDHandler	TokenNameIdentifier	 DTD Handler
)	TokenNameRPAREN	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
instanceof	TokenNameinstanceof	
DeclHandler	TokenNameIdentifier	 Decl Handler
)	TokenNameRPAREN	
m_resultDeclHandler	TokenNameIdentifier	 m result Decl Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DeclHandler	TokenNameIdentifier	 Decl Handler
)	TokenNameRPAREN	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
instanceof	TokenNameinstanceof	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process the source tree to the output result. * @param source The input for the source tree. * * @param outputTarget The output target. * * @throws TransformerException If an unrecoverable error occurs * during the course of the transformation. */	TokenNameCOMMENT_JAVADOC	 Process the source tree to the output result. @param source The input for the source tree. * @param outputTarget The output target. * @throws TransformerException If an unrecoverable error occurs during the course of the transformation. 
public	TokenNamepublic	
void	TokenNamevoid	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
Result	TokenNameIdentifier	 Result
outputTarget	TokenNameIdentifier	 output Target
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
createResultContentHandler	TokenNameIdentifier	 create Result Content Handler
(	TokenNameLPAREN	
outputTarget	TokenNameIdentifier	 output Target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * According to JAXP1.2, new SAXSource()/StreamSource() * should create an empty input tree, with a default root node. * new DOMSource()creates an empty document using DocumentBuilder. * newDocument(); Use DocumentBuilder.newDocument() for all 3 situations, * since there is no clear spec. how to create an empty tree when * both SAXSource() and StreamSource() are used. */	TokenNameCOMMENT_BLOCK	 According to JAXP1.2, new SAXSource()/StreamSource() should create an empty input tree, with a default root node. new DOMSource()creates an empty document using DocumentBuilder. newDocument(); Use DocumentBuilder.newDocument() for all 3 situations, since there is no clear spec. how to create an empty tree when both SAXSource() and StreamSource() are used. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
StreamSource	TokenNameIdentifier	 Stream Source
&&	TokenNameAND_AND	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
StreamSource	TokenNameIdentifier	 Stream Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
StreamSource	TokenNameIdentifier	 Stream Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
SAXSource	TokenNameIdentifier	 SAX Source
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAXSource	TokenNameIdentifier	 SAX Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
.	TokenNameDOT	
getInputSource	TokenNameIdentifier	 get Input Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAXSource	TokenNameIdentifier	 SAX Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
DOMSource	TokenNameIdentifier	 DOM Source
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DOMSource	TokenNameIdentifier	 DOM Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
builderF	TokenNameIdentifier	 builder F
=	TokenNameEQUAL	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocumentBuilder	TokenNameIdentifier	 Document Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
builderF	TokenNameIdentifier	 builder F
.	TokenNameDOT	
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
systemID	TokenNameIdentifier	 system ID
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
DOMSource	TokenNameIdentifier	 DOM Source
(	TokenNameLPAREN	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
newDocument	TokenNameIdentifier	 new Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Copy system ID from original, empty Source to new Source 	TokenNameCOMMENT_LINE	Copy system ID from original, empty Source to new Source 
if	TokenNameif	
(	TokenNameLPAREN	
systemID	TokenNameIdentifier	 system ID
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
systemID	TokenNameIdentifier	 system ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
DOMSource	TokenNameIdentifier	 DOM Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DOMSource	TokenNameIdentifier	 DOM Source
dsource	TokenNameIdentifier	 dsource
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMSource	TokenNameIdentifier	 DOM Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
m_systemID	TokenNameIdentifier	 m system ID
=	TokenNameEQUAL	
dsource	TokenNameIdentifier	 dsource
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
dNode	TokenNameIdentifier	 d Node
=	TokenNameEQUAL	
dsource	TokenNameIdentifier	 dsource
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
dNode	TokenNameIdentifier	 d Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dNode	TokenNameIdentifier	 d Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dNode	TokenNameIdentifier	 d Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
dNode	TokenNameIdentifier	 d Node
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
TreeWalker	TokenNameIdentifier	 Tree Walker
walker	TokenNameIdentifier	 walker
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
TreeWalker	TokenNameIdentifier	 Tree Walker
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
m_systemID	TokenNameIdentifier	 m system ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
traverse	TokenNameIdentifier	 traverse
(	TokenNameLPAREN	
dNode	TokenNameIdentifier	 d Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dNode	TokenNameIdentifier	 d Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
messageStr	TokenNameIdentifier	 message Str
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_ILLEGAL_DOMSOURCE_INPUT	TokenNameIdentifier	 ER  ILLEGAL  DOMSOURCE  INPUT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
messageStr	TokenNameIdentifier	 message Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
InputSource	TokenNameIdentifier	 Input Source
xmlSource	TokenNameIdentifier	 xml Source
=	TokenNameEQUAL	
SAXSource	TokenNameIdentifier	 SAX Source
.	TokenNameDOT	
sourceToInputSource	TokenNameIdentifier	 source To Input Source
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
xmlSource	TokenNameIdentifier	 xml Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_CANNOT_TRANSFORM_SOURCE_TYPE	TokenNameIdentifier	 ER  CANNOT  TRANSFORM  SOURCE  TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can't transform a Source of type " 	TokenNameCOMMENT_LINE	"Can't transform a Source of type " 
//+ source.getClass().getName() + "!"); 	TokenNameCOMMENT_LINE	+ source.getClass().getName() + "!"); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
xmlSource	TokenNameIdentifier	 xml Source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_systemID	TokenNameIdentifier	 m system ID
=	TokenNameEQUAL	
xmlSource	TokenNameIdentifier	 xml Source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLReader	TokenNameIdentifier	 XML Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
managedReader	TokenNameIdentifier	 managed Reader
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
SAXSource	TokenNameIdentifier	 SAX Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAXSource	TokenNameIdentifier	 SAX Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
XMLReaderManager	TokenNameIdentifier	 XML Reader Manager
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
managedReader	TokenNameIdentifier	 managed Reader
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
"http://xml.org/sax/features/namespace-prefixes"	TokenNameStringLiteral	http://xml.org/sax/features/namespace-prefixes
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We don't care. 	TokenNameCOMMENT_LINE	We don't care. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Get the input content handler, which will handle the 	TokenNameCOMMENT_LINE	Get the input content handler, which will handle the 
// parse events and create the source tree. 	TokenNameCOMMENT_LINE	parse events and create the source tree. 
ContentHandler	TokenNameIdentifier	 Content Handler
inputHandler	TokenNameIdentifier	 input Handler
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
inputHandler	TokenNameIdentifier	 input Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inputHandler	TokenNameIdentifier	 input Handler
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
DTDHandler	TokenNameIdentifier	 DTD Handler
)	TokenNameRPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setDTDHandler	TokenNameIdentifier	 set DTD Handler
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
DTDHandler	TokenNameIdentifier	 DTD Handler
)	TokenNameRPAREN	
inputHandler	TokenNameIdentifier	 input Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inputHandler	TokenNameIdentifier	 input Handler
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"http://xml.org/sax/properties/lexical-handler"	TokenNameStringLiteral	http://xml.org/sax/properties/lexical-handler
,	TokenNameCOMMA	
inputHandler	TokenNameIdentifier	 input Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inputHandler	TokenNameIdentifier	 input Handler
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
DeclHandler	TokenNameIdentifier	 Decl Handler
)	TokenNameRPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"http://xml.org/sax/properties/declaration-handler"	TokenNameStringLiteral	http://xml.org/sax/properties/declaration-handler
,	TokenNameCOMMA	
inputHandler	TokenNameIdentifier	 input Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inputHandler	TokenNameIdentifier	 input Handler
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"http://xml.org/sax/handlers/LexicalHandler"	TokenNameStringLiteral	http://xml.org/sax/handlers/LexicalHandler
,	TokenNameCOMMA	
inputHandler	TokenNameIdentifier	 input Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inputHandler	TokenNameIdentifier	 input Handler
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
DeclHandler	TokenNameIdentifier	 Decl Handler
)	TokenNameRPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"http://xml.org/sax/handlers/DeclHandler"	TokenNameStringLiteral	http://xml.org/sax/handlers/DeclHandler
,	TokenNameCOMMA	
inputHandler	TokenNameIdentifier	 input Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
snre	TokenNameIdentifier	 snre
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
xmlSource	TokenNameIdentifier	 xml Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
wre	TokenNameIdentifier	 wre
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
throwable	TokenNameIdentifier	 throwable
=	TokenNameEQUAL	
wre	TokenNameIdentifier	 wre
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
throwable	TokenNameIdentifier	 throwable
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwable	TokenNameIdentifier	 throwable
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
)	TokenNameRPAREN	
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
wre	TokenNameIdentifier	 wre
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
managedReader	TokenNameIdentifier	 managed Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLReaderManager	TokenNameIdentifier	 XML Reader Manager
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
releaseXMLReader	TokenNameIdentifier	 release XML Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_outputStream	TokenNameIdentifier	 m output Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m_outputStream	TokenNameIdentifier	 m output Stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
m_outputStream	TokenNameIdentifier	 m output Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add a parameter for the transformation. * * <p>Pass a qualified name as a two-part string, the namespace URI * enclosed in curly braces ({}), followed by the local name. If the * name has a null URL, the String only contain the local name. An * application can safely check for a non-null URI by testing to see if the first * character of the name is a '{' character.</p> * <p>For example, if a URI and local name were obtained from an element * defined with &lt;xyz:foo xmlns:xyz="http://xyz.foo.com/yada/baz.html"/&gt;, * then the qualified name would be "{http://xyz.foo.com/yada/baz.html}foo". Note that * no prefix is used.</p> * * @param name The name of the parameter, which may begin with a namespace URI * in curly braces ({}). * @param value The value object. This can be any valid Java object. It is * up to the processor to provide the proper object coersion or to simply * pass the object on for use in an extension. */	TokenNameCOMMENT_JAVADOC	 Add a parameter for the transformation. * <p>Pass a qualified name as a two-part string, the namespace URI enclosed in curly braces ({}), followed by the local name. If the name has a null URL, the String only contain the local name. An application can safely check for a non-null URI by testing to see if the first character of the name is a '{' character.</p> <p>For example, if a URI and local name were obtained from an element defined with &lt;xyz:foo xmlns:xyz="http://xyz.foo.com/yada/baz.html"/&gt;, then the qualified name would be "{http://xyz.foo.com/yada/baz.html}foo". Note that no prefix is used.</p> * @param name The name of the parameter, which may begin with a namespace URI in curly braces ({}). @param value The value object. This can be any valid Java object. It is up to the processor to provide the proper object coersion or to simply pass the object on for use in an extension. 
public	TokenNamepublic	
void	TokenNamevoid	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_INVALID_SET_PARAM_VALUE	TokenNameIdentifier	 ER  INVALID  SET  PARAM  VALUE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_params	TokenNameIdentifier	 m params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_params	TokenNameIdentifier	 m params
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_params	TokenNameIdentifier	 m params
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a parameter that was explicitly set with setParameter * or setParameters. * * <p>This method does not return a default parameter value, which * cannot be determined until the node context is evaluated during * the transformation process. * * * @param name Name of the parameter. * @return A parameter that has been set with setParameter. */	TokenNameCOMMENT_JAVADOC	 Get a parameter that was explicitly set with setParameter or setParameters. * <p>This method does not return a default parameter value, which cannot be determined until the node context is evaluated during the transformation process. * @param name Name of the parameter. @return A parameter that has been set with setParameter. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getParameter	TokenNameIdentifier	 get Parameter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_params	TokenNameIdentifier	 m params
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_params	TokenNameIdentifier	 m params
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clear all parameters set with setParameter. */	TokenNameCOMMENT_JAVADOC	 Clear all parameters set with setParameter. 
public	TokenNamepublic	
void	TokenNamevoid	
clearParameters	TokenNameIdentifier	 clear Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_params	TokenNameIdentifier	 m params
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
m_params	TokenNameIdentifier	 m params
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an object that will be used to resolve URIs used in * document(). * * <p>If the resolver argument is null, the URIResolver value will * be cleared, and the default behavior will be used.</p> * * @param resolver An object that implements the URIResolver interface, * or null. */	TokenNameCOMMENT_JAVADOC	 Set an object that will be used to resolve URIs used in document(). * <p>If the resolver argument is null, the URIResolver value will be cleared, and the default behavior will be used.</p> * @param resolver An object that implements the URIResolver interface, or null. 
public	TokenNamepublic	
void	TokenNamevoid	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
URIResolver	TokenNameIdentifier	 URI Resolver
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_URIResolver	TokenNameIdentifier	 m  URI Resolver
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an object that will be used to resolve URIs used in * document(), etc. * * @return An object that implements the URIResolver interface, * or null. */	TokenNameCOMMENT_JAVADOC	 Get an object that will be used to resolve URIs used in document(), etc. * @return An object that implements the URIResolver interface, or null. 
public	TokenNamepublic	
URIResolver	TokenNameIdentifier	 URI Resolver
getURIResolver	TokenNameIdentifier	 get URI Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_URIResolver	TokenNameIdentifier	 m  URI Resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the output properties for the transformation. These * properties will override properties set in the Templates * with xsl:output. * * <p>If argument to this function is null, any properties * previously set are removed, and the value will revert to the value * defined in the templates object.</p> * * <p>Pass a qualified property key name as a two-part string, the namespace URI * enclosed in curly braces ({}), followed by the local name. If the * name has a null URL, the String only contain the local name. An * application can safely check for a non-null URI by testing to see if the first * character of the name is a '{' character.</p> * <p>For example, if a URI and local name were obtained from an element * defined with &lt;xyz:foo xmlns:xyz="http://xyz.foo.com/yada/baz.html"/&gt;, * then the qualified name would be "{http://xyz.foo.com/yada/baz.html}foo". Note that * no prefix is used.</p> * * @param oformat A set of output properties that will be * used to override any of the same properties in affect * for the transformation. * * @see javax.xml.transform.OutputKeys * @see java.util.Properties * * @throws IllegalArgumentException if any of the argument keys are not * recognized and are not namespace qualified. */	TokenNameCOMMENT_JAVADOC	 Set the output properties for the transformation. These properties will override properties set in the Templates with xsl:output. * <p>If argument to this function is null, any properties previously set are removed, and the value will revert to the value defined in the templates object.</p> * <p>Pass a qualified property key name as a two-part string, the namespace URI enclosed in curly braces ({}), followed by the local name. If the name has a null URL, the String only contain the local name. An application can safely check for a non-null URI by testing to see if the first character of the name is a '{' character.</p> <p>For example, if a URI and local name were obtained from an element defined with &lt;xyz:foo xmlns:xyz="http://xyz.foo.com/yada/baz.html"/&gt;, then the qualified name would be "{http://xyz.foo.com/yada/baz.html}foo". Note that no prefix is used.</p> * @param oformat A set of output properties that will be used to override any of the same properties in affect for the transformation. * @see javax.xml.transform.OutputKeys @see java.util.Properties * @throws IllegalArgumentException if any of the argument keys are not recognized and are not namespace qualified. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputProperties	TokenNameIdentifier	 set Output Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
oformat	TokenNameIdentifier	 oformat
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
oformat	TokenNameIdentifier	 oformat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// See if an *explicit* method was set. 	TokenNameCOMMENT_LINE	See if an *explicit* method was set. 
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
oformat	TokenNameIdentifier	 oformat
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
m_outputFormat	TokenNameIdentifier	 m output Format
=	TokenNameEQUAL	
new	TokenNamenew	
OutputProperties	TokenNameIdentifier	 Output Properties
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_outputFormat	TokenNameIdentifier	 m output Format
=	TokenNameEQUAL	
new	TokenNamenew	
OutputProperties	TokenNameIdentifier	 Output Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_outputFormat	TokenNameIdentifier	 m output Format
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
oformat	TokenNameIdentifier	 oformat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// if oformat is null JAXP says that any props previously set are removed 	TokenNameCOMMENT_LINE	if oformat is null JAXP says that any props previously set are removed 
// and we are to revert back to those in the templates object (i.e. Stylesheet). 	TokenNameCOMMENT_LINE	and we are to revert back to those in the templates object (i.e. Stylesheet). 
m_outputFormat	TokenNameIdentifier	 m output Format
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get a copy of the output properties for the transformation. * * <p>The properties returned should contain properties set by the user, * and properties set by the stylesheet, and these properties * are "defaulted" by default properties specified by <a href="http://www.w3.org/TR/xslt#output">section 16 of the * XSL Transformations (XSLT) W3C Recommendation</a>. The properties that * were specifically set by the user or the stylesheet should be in the base * Properties list, while the XSLT default properties that were not * specifically set should be the default Properties list. Thus, * getOutputProperties().getProperty(String key) will obtain any * property in that was set by {@link #setOutputProperty}, * {@link #setOutputProperties}, in the stylesheet, <em>or</em> the default * properties, while * getOutputProperties().get(String key) will only retrieve properties * that were explicitly set by {@link #setOutputProperty}, * {@link #setOutputProperties}, or in the stylesheet.</p> * * <p>Note that mutation of the Properties object returned will not * effect the properties that the transformation contains.</p> * * <p>If any of the argument keys are not recognized and are not * namespace qualified, the property will be ignored. In other words the * behaviour is not orthogonal with setOutputProperties.</p> * * @return A copy of the set of output properties in effect * for the next transformation. * * @see javax.xml.transform.OutputKeys * @see java.util.Properties */	TokenNameCOMMENT_JAVADOC	 Get a copy of the output properties for the transformation. * <p>The properties returned should contain properties set by the user, and properties set by the stylesheet, and these properties are "defaulted" by default properties specified by <a href="http://www.w3.org/TR/xslt#output">section 16 of the XSL Transformations (XSLT) W3C Recommendation</a>. The properties that were specifically set by the user or the stylesheet should be in the base Properties list, while the XSLT default properties that were not specifically set should be the default Properties list. Thus, getOutputProperties().getProperty(String key) will obtain any property in that was set by {@link #setOutputProperty}, {@link #setOutputProperties}, in the stylesheet, <em>or</em> the default properties, while getOutputProperties().get(String key) will only retrieve properties that were explicitly set by {@link #setOutputProperty}, {@link #setOutputProperties}, or in the stylesheet.</p> * <p>Note that mutation of the Properties object returned will not effect the properties that the transformation contains.</p> * <p>If any of the argument keys are not recognized and are not namespace qualified, the property will be ignored. In other words the behaviour is not orthogonal with setOutputProperties.</p> * @return A copy of the set of output properties in effect for the next transformation. * @see javax.xml.transform.OutputKeys @see java.util.Properties 
public	TokenNamepublic	
Properties	TokenNameIdentifier	 Properties
getOutputProperties	TokenNameIdentifier	 get Output Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
)	TokenNameRPAREN	
m_outputFormat	TokenNameIdentifier	 m output Format
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an output property that will be in effect for the * transformation. * * <p>Pass a qualified property name as a two-part string, the namespace URI * enclosed in curly braces ({}), followed by the local name. If the * name has a null URL, the String only contain the local name. An * application can safely check for a non-null URI by testing to see if the first * character of the name is a '{' character.</p> * <p>For example, if a URI and local name were obtained from an element * defined with &lt;xyz:foo xmlns:xyz="http://xyz.foo.com/yada/baz.html"/&gt;, * then the qualified name would be "{http://xyz.foo.com/yada/baz.html}foo". Note that * no prefix is used.</p> * * <p>The Properties object that was passed to {@link #setOutputProperties} won't * be effected by calling this method.</p> * * @param name A non-null String that specifies an output * property name, which may be namespace qualified. * @param value The non-null string value of the output property. * * @throws IllegalArgumentException If the property is not supported, and is * not qualified with a namespace. * * @see javax.xml.transform.OutputKeys */	TokenNameCOMMENT_JAVADOC	 Set an output property that will be in effect for the transformation. * <p>Pass a qualified property name as a two-part string, the namespace URI enclosed in curly braces ({}), followed by the local name. If the name has a null URL, the String only contain the local name. An application can safely check for a non-null URI by testing to see if the first character of the name is a '{' character.</p> <p>For example, if a URI and local name were obtained from an element defined with &lt;xyz:foo xmlns:xyz="http://xyz.foo.com/yada/baz.html"/&gt;, then the qualified name would be "{http://xyz.foo.com/yada/baz.html}foo". Note that no prefix is used.</p> * <p>The Properties object that was passed to {@link #setOutputProperties} won't be effected by calling this method.</p> * @param name A non-null String that specifies an output property name, which may be namespace qualified. @param value The non-null string value of the output property. * @throws IllegalArgumentException If the property is not supported, and is not qualified with a namespace. * @see javax.xml.transform.OutputKeys 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
OutputProperties	TokenNameIdentifier	 Output Properties
.	TokenNameDOT	
isLegalPropertyKey	TokenNameIdentifier	 is Legal Property Key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_OUTPUT_PROPERTY_NOT_RECOGNIZED	TokenNameIdentifier	 ER  OUTPUT  PROPERTY  NOT  RECOGNIZED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"output property not recognized: " 	TokenNameCOMMENT_LINE	"output property not recognized: " 
//+ name); 	TokenNameCOMMENT_LINE	+ name); 
m_outputFormat	TokenNameIdentifier	 m output Format
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an output property that is in effect for the * transformation. The property specified may be a property * that was set with setOutputProperty, or it may be a * property specified in the stylesheet. * * @param name A non-null String that specifies an output * property name, which may be namespace qualified. * * @return The string value of the output property, or null * if no property was found. * * @throws IllegalArgumentException If the property is not supported. * * @see javax.xml.transform.OutputKeys */	TokenNameCOMMENT_JAVADOC	 Get an output property that is in effect for the transformation. The property specified may be a property that was set with setOutputProperty, or it may be a property specified in the stylesheet. * @param name A non-null String that specifies an output property name, which may be namespace qualified. * @return The string value of the output property, or null if no property was found. * @throws IllegalArgumentException If the property is not supported. * @see javax.xml.transform.OutputKeys 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOutputProperty	TokenNameIdentifier	 get Output Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
OutputProperties	TokenNameIdentifier	 Output Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
m_outputFormat	TokenNameIdentifier	 m output Format
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
OutputProperties	TokenNameIdentifier	 Output Properties
.	TokenNameDOT	
isLegalPropertyKey	TokenNameIdentifier	 is Legal Property Key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_OUTPUT_PROPERTY_NOT_RECOGNIZED	TokenNameIdentifier	 ER  OUTPUT  PROPERTY  NOT  RECOGNIZED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"output property not recognized: " 	TokenNameCOMMENT_LINE	"output property not recognized: " 
// + name); 	TokenNameCOMMENT_LINE	+ name); 
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the error event listener in effect for the transformation. * * @param listener The new error listener. * @throws IllegalArgumentException if listener is null. */	TokenNameCOMMENT_JAVADOC	 Set the error event listener in effect for the transformation. * @param listener The new error listener. @throws IllegalArgumentException if listener is null. 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorListener	TokenNameIdentifier	 set Error Listener
(	TokenNameLPAREN	
ErrorListener	TokenNameIdentifier	 Error Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NULL_ERROR_HANDLER	TokenNameIdentifier	 ER  NULL  ERROR  HANDLER
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_errorListener	TokenNameIdentifier	 m error Listener
=	TokenNameEQUAL	
listener	TokenNameIdentifier	 listener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the error event handler in effect for the transformation. * * @return The current error handler, which should never be null. */	TokenNameCOMMENT_JAVADOC	 Get the error event handler in effect for the transformation. * @return The current error handler, which should never be null. 
public	TokenNamepublic	
ErrorListener	TokenNameIdentifier	 Error Listener
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_errorListener	TokenNameIdentifier	 m error Listener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Default implementation of DTDHandler interface. 	TokenNameCOMMENT_LINE	Default implementation of DTDHandler interface. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Receive notification of a notation declaration. * * <p>By default, do nothing. Application writers may override this * method in a subclass if they wish to keep track of the notations * declared in a document.</p> * * @param name The notation name. * @param publicId The notation public identifier, or null if not * available. * @param systemId The notation system identifier. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.DTDHandler#notationDecl * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of a notation declaration. * <p>By default, do nothing. Application writers may override this method in a subclass if they wish to keep track of the notations declared in a document.</p> * @param name The notation name. @param publicId The notation public identifier, or null if not available. @param systemId The notation system identifier. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.DTDHandler#notationDecl * @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
notationDecl	TokenNameIdentifier	 notation Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_resultDTDHandler	TokenNameIdentifier	 m result DTD Handler
)	TokenNameRPAREN	
m_resultDTDHandler	TokenNameIdentifier	 m result DTD Handler
.	TokenNameDOT	
notationDecl	TokenNameIdentifier	 notation Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of an unparsed entity declaration. * * <p>By default, do nothing. Application writers may override this * method in a subclass to keep track of the unparsed entities * declared in a document.</p> * * @param name The entity name. * @param publicId The entity public identifier, or null if not * available. * @param systemId The entity system identifier. * @param notationName The name of the associated notation. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.DTDHandler#unparsedEntityDecl * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of an unparsed entity declaration. * <p>By default, do nothing. Application writers may override this method in a subclass to keep track of the unparsed entities declared in a document.</p> * @param name The entity name. @param publicId The entity public identifier, or null if not available. @param systemId The entity system identifier. @param notationName The name of the associated notation. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.DTDHandler#unparsedEntityDecl * @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
unparsedEntityDecl	TokenNameIdentifier	 unparsed Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
notationName	TokenNameIdentifier	 notation Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_resultDTDHandler	TokenNameIdentifier	 m result DTD Handler
)	TokenNameRPAREN	
m_resultDTDHandler	TokenNameIdentifier	 m result DTD Handler
.	TokenNameDOT	
unparsedEntityDecl	TokenNameIdentifier	 unparsed Entity Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
notationName	TokenNameIdentifier	 notation Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Default implementation of ContentHandler interface. 	TokenNameCOMMENT_LINE	Default implementation of ContentHandler interface. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Receive a Locator object for document events. * * <p>By default, do nothing. Application writers may override this * method in a subclass if they wish to store the locator for use * with other document events.</p> * * @param locator A locator for all SAX document events. * @see org.xml.sax.ContentHandler#setDocumentLocator * @see org.xml.sax.Locator */	TokenNameCOMMENT_JAVADOC	 Receive a Locator object for document events. * <p>By default, do nothing. Application writers may override this method in a subclass if they wish to store the locator for use with other document events.</p> * @param locator A locator for all SAX document events. @see org.xml.sax.ContentHandler#setDocumentLocator @see org.xml.sax.Locator 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
)	TokenNameRPAREN	
createResultContentHandler	TokenNameIdentifier	 create Result Content Handler
(	TokenNameLPAREN	
m_result	TokenNameIdentifier	 m result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
.	TokenNameDOT	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the beginning of the document. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions at the beginning * of a document (such as allocating the root node of a tree or * creating an output file).</p> * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#startDocument * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of the beginning of the document. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions at the beginning of a document (such as allocating the root node of a tree or creating an output file).</p> * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#startDocument * @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
)	TokenNameRPAREN	
createResultContentHandler	TokenNameIdentifier	 create Result Content Handler
(	TokenNameLPAREN	
m_result	TokenNameIdentifier	 m result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Reset for multiple transforms with this transformer. 	TokenNameCOMMENT_LINE	Reset for multiple transforms with this transformer. 
m_flushedStartDoc	TokenNameIdentifier	 m flushed Start Doc
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_foundFirstElement	TokenNameIdentifier	 m found First Element
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
m_flushedStartDoc	TokenNameIdentifier	 m flushed Start Doc
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
flushStartDoc	TokenNameIdentifier	 flush Start Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_flushedStartDoc	TokenNameIdentifier	 m flushed Start Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
createResultContentHandler	TokenNameIdentifier	 create Result Content Handler
(	TokenNameLPAREN	
m_result	TokenNameIdentifier	 m result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_flushedStartDoc	TokenNameIdentifier	 m flushed Start Doc
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Receive notification of the end of the document. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions at the end * of a document (such as finalising a tree or closing an output * file).</p> * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#endDocument * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of the document. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions at the end of a document (such as finalising a tree or closing an output file).</p> * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#endDocument * @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
flushStartDoc	TokenNameIdentifier	 flush Start Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the start of a Namespace mapping. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions at the start of * each Namespace prefix scope (such as storing the prefix mapping).</p> * * @param prefix The Namespace prefix being declared. * @param uri The Namespace URI mapped to the prefix. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#startPrefixMapping * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of the start of a Namespace mapping. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions at the start of each Namespace prefix scope (such as storing the prefix mapping).</p> * @param prefix The Namespace prefix being declared. @param uri The Namespace URI mapped to the prefix. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#startPrefixMapping * @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
flushStartDoc	TokenNameIdentifier	 flush Start Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
.	TokenNameDOT	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the end of a Namespace mapping. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions at the end of * each prefix mapping.</p> * * @param prefix The Namespace prefix being declared. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#endPrefixMapping * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of a Namespace mapping. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions at the end of each prefix mapping.</p> * @param prefix The Namespace prefix being declared. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#endPrefixMapping * @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
flushStartDoc	TokenNameIdentifier	 flush Start Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
.	TokenNameDOT	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the start of an element. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions at the start of * each element (such as allocating a new tree node or writing * output to a file).</p> * * @param uri The Namespace URI, or the empty string if the * element has no Namespace URI or if Namespace * processing is not being performed. * @param localName The local name (without prefix), or the * empty string if Namespace processing is not being * performed. * @param qName The qualified name (with prefix), or the * empty string if qualified names are not available. * @param attributes The specified or defaulted attributes. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#startElement * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of the start of an element. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions at the start of each element (such as allocating a new tree node or writing output to a file).</p> * @param uri The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed. @param localName The local name (without prefix), or the empty string if Namespace processing is not being performed. @param qName The qualified name (with prefix), or the empty string if qualified names are not available. @param attributes The specified or defaulted attributes. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#startElement * @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_foundFirstElement	TokenNameIdentifier	 m found First Element
&&	TokenNameAND_AND	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_serializer	TokenNameIdentifier	 m serializer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_foundFirstElement	TokenNameIdentifier	 m found First Element
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
Serializer	TokenNameIdentifier	 Serializer
newSerializer	TokenNameIdentifier	 new Serializer
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
newSerializer	TokenNameIdentifier	 new Serializer
=	TokenNameEQUAL	
SerializerSwitcher	TokenNameIdentifier	 Serializer Switcher
.	TokenNameDOT	
switchSerializerIfHTML	TokenNameIdentifier	 switch Serializer If HTML
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
m_outputFormat	TokenNameIdentifier	 m output Format
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_serializer	TokenNameIdentifier	 m serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newSerializer	TokenNameIdentifier	 new Serializer
!=	TokenNameNOT_EQUAL	
m_serializer	TokenNameIdentifier	 m serializer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
=	TokenNameEQUAL	
newSerializer	TokenNameIdentifier	 new Serializer
.	TokenNameDOT	
asContentHandler	TokenNameIdentifier	 as Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
// why? 	TokenNameCOMMENT_LINE	why? 
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
instanceof	TokenNameinstanceof	
DTDHandler	TokenNameIdentifier	 DTD Handler
)	TokenNameRPAREN	
m_resultDTDHandler	TokenNameIdentifier	 m result DTD Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTDHandler	TokenNameIdentifier	 DTD Handler
)	TokenNameRPAREN	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
instanceof	TokenNameinstanceof	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
;	TokenNameSEMICOLON	
m_serializer	TokenNameIdentifier	 m serializer
=	TokenNameEQUAL	
newSerializer	TokenNameIdentifier	 new Serializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
flushStartDoc	TokenNameIdentifier	 flush Start Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the end of an element. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions at the end of * each element (such as finalising a tree node or writing * output to a file).</p> * * @param uri The Namespace URI, or the empty string if the * element has no Namespace URI or if Namespace * processing is not being performed. * @param localName The local name (without prefix), or the * empty string if Namespace processing is not being * performed. * @param qName The qualified name (with prefix), or the * empty string if qualified names are not available. * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#endElement * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of an element. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions at the end of each element (such as finalising a tree node or writing output to a file).</p> * @param uri The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed. @param localName The local name (without prefix), or the empty string if Namespace processing is not being performed. @param qName The qualified name (with prefix), or the empty string if qualified names are not available. * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#endElement * @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of character data inside an element. * * <p>By default, do nothing. Application writers may override this * method to take specific actions for each chunk of character data * (such as adding the data to a node or buffer, or printing it to * a file).</p> * * @param ch The characters. * @param start The start position in the character array. * @param length The number of characters to use from the * character array. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#characters * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of character data inside an element. * <p>By default, do nothing. Application writers may override this method to take specific actions for each chunk of character data (such as adding the data to a node or buffer, or printing it to a file).</p> * @param ch The characters. @param start The start position in the character array. @param length The number of characters to use from the character array. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#characters * @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
flushStartDoc	TokenNameIdentifier	 flush Start Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of ignorable whitespace in element content. * * <p>By default, do nothing. Application writers may override this * method to take specific actions for each chunk of ignorable * whitespace (such as adding data to a node or buffer, or printing * it to a file).</p> * * @param ch The whitespace characters. * @param start The start position in the character array. * @param length The number of characters to use from the * character array. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#ignorableWhitespace * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of ignorable whitespace in element content. * <p>By default, do nothing. Application writers may override this method to take specific actions for each chunk of ignorable whitespace (such as adding data to a node or buffer, or printing it to a file).</p> * @param ch The whitespace characters. @param start The start position in the character array. @param length The number of characters to use from the character array. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#ignorableWhitespace * @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
.	TokenNameDOT	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a processing instruction. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions for each * processing instruction, such as setting status variables or * invoking other methods.</p> * * @param target The processing instruction target. * @param data The processing instruction data, or null if * none is supplied. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#processingInstruction * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of a processing instruction. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions for each processing instruction, such as setting status variables or invoking other methods.</p> * @param target The processing instruction target. @param data The processing instruction data, or null if none is supplied. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#processingInstruction * @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
flushStartDoc	TokenNameIdentifier	 flush Start Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a skipped entity. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions for each * processing instruction, such as setting status variables or * invoking other methods.</p> * * @param name The name of the skipped entity. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#processingInstruction * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of a skipped entity. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions for each processing instruction, such as setting status variables or invoking other methods.</p> * @param name The name of the skipped entity. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#processingInstruction * @throws SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
skippedEntity	TokenNameIdentifier	 skipped Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
flushStartDoc	TokenNameIdentifier	 flush Start Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
.	TokenNameDOT	
skippedEntity	TokenNameIdentifier	 skipped Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report the start of DTD declarations, if any. * * <p>Any declarations are assumed to be in the internal subset * unless otherwise indicated by a {@link #startEntity startEntity} * event.</p> * * <p>Note that the start/endDTD events will appear within * the start/endDocument events from ContentHandler and * before the first startElement event.</p> * * @param name The document type name. * @param publicId The declared public identifier for the * external DTD subset, or null if none was declared. * @param systemId The declared system identifier for the * external DTD subset, or null if none was declared. * @throws SAXException The application may raise an * exception. * @see #endDTD * @see #startEntity */	TokenNameCOMMENT_JAVADOC	 Report the start of DTD declarations, if any. * <p>Any declarations are assumed to be in the internal subset unless otherwise indicated by a {@link #startEntity startEntity} event.</p> * <p>Note that the start/endDTD events will appear within the start/endDocument events from ContentHandler and before the first startElement event.</p> * @param name The document type name. @param publicId The declared public identifier for the external DTD subset, or null if none was declared. @param systemId The declared system identifier for the external DTD subset, or null if none was declared. @throws SAXException The application may raise an exception. @see #endDTD @see #startEntity 
public	TokenNamepublic	
void	TokenNamevoid	
startDTD	TokenNameIdentifier	 start DTD
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
flushStartDoc	TokenNameIdentifier	 flush Start Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
)	TokenNameRPAREN	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
.	TokenNameDOT	
startDTD	TokenNameIdentifier	 start DTD
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report the end of DTD declarations. * * @throws SAXException The application may raise an exception. * @see #startDTD */	TokenNameCOMMENT_JAVADOC	 Report the end of DTD declarations. * @throws SAXException The application may raise an exception. @see #startDTD 
public	TokenNamepublic	
void	TokenNamevoid	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
)	TokenNameRPAREN	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
.	TokenNameDOT	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report the beginning of an entity in content. * * <p><strong>NOTE:</entity> entity references in attribute * values -- and the start and end of the document entity -- * are never reported.</p> * * <p>The start and end of the external DTD subset are reported * using the pseudo-name "[dtd]". All other events must be * properly nested within start/end entity events.</p> * * <p>Note that skipped entities will be reported through the * {@link org.xml.sax.ContentHandler#skippedEntity skippedEntity} * event, which is part of the ContentHandler interface.</p> * * @param name The name of the entity. If it is a parameter * entity, the name will begin with '%'. * @throws SAXException The application may raise an exception. * @see #endEntity * @see org.xml.sax.ext.DeclHandler#internalEntityDecl * @see org.xml.sax.ext.DeclHandler#externalEntityDecl */	TokenNameCOMMENT_JAVADOC	 Report the beginning of an entity in content. * <p><strong>NOTE:</entity> entity references in attribute values -- and the start and end of the document entity -- are never reported.</p> * <p>The start and end of the external DTD subset are reported using the pseudo-name "[dtd]". All other events must be properly nested within start/end entity events.</p> * <p>Note that skipped entities will be reported through the {@link org.xml.sax.ContentHandler#skippedEntity skippedEntity} event, which is part of the ContentHandler interface.</p> * @param name The name of the entity. If it is a parameter entity, the name will begin with '%'. @throws SAXException The application may raise an exception. @see #endEntity @see org.xml.sax.ext.DeclHandler#internalEntityDecl @see org.xml.sax.ext.DeclHandler#externalEntityDecl 
public	TokenNamepublic	
void	TokenNamevoid	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
)	TokenNameRPAREN	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
.	TokenNameDOT	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report the end of an entity. * * @param name The name of the entity that is ending. * @throws SAXException The application may raise an exception. * @see #startEntity */	TokenNameCOMMENT_JAVADOC	 Report the end of an entity. * @param name The name of the entity that is ending. @throws SAXException The application may raise an exception. @see #startEntity 
public	TokenNamepublic	
void	TokenNamevoid	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
)	TokenNameRPAREN	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
.	TokenNameDOT	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report the start of a CDATA section. * * <p>The contents of the CDATA section will be reported through * the regular {@link org.xml.sax.ContentHandler#characters * characters} event.</p> * * @throws SAXException The application may raise an exception. * @see #endCDATA */	TokenNameCOMMENT_JAVADOC	 Report the start of a CDATA section. * <p>The contents of the CDATA section will be reported through the regular {@link org.xml.sax.ContentHandler#characters characters} event.</p> * @throws SAXException The application may raise an exception. @see #endCDATA 
public	TokenNamepublic	
void	TokenNamevoid	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
)	TokenNameRPAREN	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
.	TokenNameDOT	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report the end of a CDATA section. * * @throws SAXException The application may raise an exception. * @see #startCDATA */	TokenNameCOMMENT_JAVADOC	 Report the end of a CDATA section. * @throws SAXException The application may raise an exception. @see #startCDATA 
public	TokenNamepublic	
void	TokenNamevoid	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
)	TokenNameRPAREN	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
.	TokenNameDOT	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report an XML comment anywhere in the document. * * <p>This callback will be used for comments inside or outside the * document element, including comments in the external DTD * subset (if read).</p> * * @param ch An array holding the characters in the comment. * @param start The starting position in the array. * @param length The number of characters to use from the array. * @throws SAXException The application may raise an exception. */	TokenNameCOMMENT_JAVADOC	 Report an XML comment anywhere in the document. * <p>This callback will be used for comments inside or outside the document element, including comments in the external DTD subset (if read).</p> * @param ch An array holding the characters in the comment. @param start The starting position in the array. @param length The number of characters to use from the array. @throws SAXException The application may raise an exception. 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
flushStartDoc	TokenNameIdentifier	 flush Start Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
)	TokenNameRPAREN	
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Implement DeclHandler 	TokenNameCOMMENT_LINE	Implement DeclHandler 
/** * Report an element type declaration. * * <p>The content model will consist of the string "EMPTY", the * string "ANY", or a parenthesised group, optionally followed * by an occurrence indicator. The model will be normalized so * that all whitespace is removed,and will include the enclosing * parentheses.</p> * * @param name The element type name. * @param model The content model as a normalized string. * @exception SAXException The application may raise an exception. */	TokenNameCOMMENT_JAVADOC	 Report an element type declaration. * <p>The content model will consist of the string "EMPTY", the string "ANY", or a parenthesised group, optionally followed by an occurrence indicator. The model will be normalized so that all whitespace is removed,and will include the enclosing parentheses.</p> * @param name The element type name. @param model The content model as a normalized string. @exception SAXException The application may raise an exception. 
public	TokenNamepublic	
void	TokenNamevoid	
elementDecl	TokenNameIdentifier	 element Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_resultDeclHandler	TokenNameIdentifier	 m result Decl Handler
)	TokenNameRPAREN	
m_resultDeclHandler	TokenNameIdentifier	 m result Decl Handler
.	TokenNameDOT	
elementDecl	TokenNameIdentifier	 element Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report an attribute type declaration. * * <p>Only the effective (first) declaration for an attribute will * be reported. The type will be one of the strings "CDATA", * "ID", "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY", * "ENTITIES", or "NOTATION", or a parenthesized token group with * the separator "|" and all whitespace removed.</p> * * @param eName The name of the associated element. * @param aName The name of the attribute. * @param type A string representing the attribute type. * @param valueDefault A string representing the attribute default * ("#IMPLIED", "#REQUIRED", or "#FIXED") or null if * none of these applies. * @param value A string representing the attribute's default value, * or null if there is none. * @exception SAXException The application may raise an exception. */	TokenNameCOMMENT_JAVADOC	 Report an attribute type declaration. * <p>Only the effective (first) declaration for an attribute will be reported. The type will be one of the strings "CDATA", "ID", "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY", "ENTITIES", or "NOTATION", or a parenthesized token group with the separator "|" and all whitespace removed.</p> * @param eName The name of the associated element. @param aName The name of the attribute. @param type A string representing the attribute type. @param valueDefault A string representing the attribute default ("#IMPLIED", "#REQUIRED", or "#FIXED") or null if none of these applies. @param value A string representing the attribute's default value, or null if there is none. @exception SAXException The application may raise an exception. 
public	TokenNamepublic	
void	TokenNamevoid	
attributeDecl	TokenNameIdentifier	 attribute Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
eName	TokenNameIdentifier	 e Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aName	TokenNameIdentifier	 a Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
valueDefault	TokenNameIdentifier	 value Default
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_resultDeclHandler	TokenNameIdentifier	 m result Decl Handler
)	TokenNameRPAREN	
m_resultDeclHandler	TokenNameIdentifier	 m result Decl Handler
.	TokenNameDOT	
attributeDecl	TokenNameIdentifier	 attribute Decl
(	TokenNameLPAREN	
eName	TokenNameIdentifier	 e Name
,	TokenNameCOMMA	
aName	TokenNameIdentifier	 a Name
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
valueDefault	TokenNameIdentifier	 value Default
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report an internal entity declaration. * * <p>Only the effective (first) declaration for each entity * will be reported.</p> * * @param name The name of the entity. If it is a parameter * entity, the name will begin with '%'. * @param value The replacement text of the entity. * @exception SAXException The application may raise an exception. * @see #externalEntityDecl * @see org.xml.sax.DTDHandler#unparsedEntityDecl */	TokenNameCOMMENT_JAVADOC	 Report an internal entity declaration. * <p>Only the effective (first) declaration for each entity will be reported.</p> * @param name The name of the entity. If it is a parameter entity, the name will begin with '%'. @param value The replacement text of the entity. @exception SAXException The application may raise an exception. @see #externalEntityDecl @see org.xml.sax.DTDHandler#unparsedEntityDecl 
public	TokenNamepublic	
void	TokenNamevoid	
internalEntityDecl	TokenNameIdentifier	 internal Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_resultDeclHandler	TokenNameIdentifier	 m result Decl Handler
)	TokenNameRPAREN	
m_resultDeclHandler	TokenNameIdentifier	 m result Decl Handler
.	TokenNameDOT	
internalEntityDecl	TokenNameIdentifier	 internal Entity Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report a parsed external entity declaration. * * <p>Only the effective (first) declaration for each entity * will be reported.</p> * * @param name The name of the entity. If it is a parameter * entity, the name will begin with '%'. * @param publicId The declared public identifier of the entity, or * null if none was declared. * @param systemId The declared system identifier of the entity. * @exception SAXException The application may raise an exception. * @see #internalEntityDecl * @see org.xml.sax.DTDHandler#unparsedEntityDecl */	TokenNameCOMMENT_JAVADOC	 Report a parsed external entity declaration. * <p>Only the effective (first) declaration for each entity will be reported.</p> * @param name The name of the entity. If it is a parameter entity, the name will begin with '%'. @param publicId The declared public identifier of the entity, or null if none was declared. @param systemId The declared system identifier of the entity. @exception SAXException The application may raise an exception. @see #internalEntityDecl @see org.xml.sax.DTDHandler#unparsedEntityDecl 
public	TokenNamepublic	
void	TokenNamevoid	
externalEntityDecl	TokenNameIdentifier	 external Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_resultDeclHandler	TokenNameIdentifier	 m result Decl Handler
)	TokenNameRPAREN	
m_resultDeclHandler	TokenNameIdentifier	 m result Decl Handler
.	TokenNameDOT	
externalEntityDecl	TokenNameIdentifier	 external Entity Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is null unless we own the stream. */	TokenNameCOMMENT_JAVADOC	 This is null unless we own the stream. 
private	TokenNameprivate	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
m_outputStream	TokenNameIdentifier	 m output Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The content handler where result events will be sent. */	TokenNameCOMMENT_JAVADOC	 The content handler where result events will be sent. 
private	TokenNameprivate	
ContentHandler	TokenNameIdentifier	 Content Handler
m_resultContentHandler	TokenNameIdentifier	 m result Content Handler
;	TokenNameSEMICOLON	
/** The lexical handler where result events will be sent. */	TokenNameCOMMENT_JAVADOC	 The lexical handler where result events will be sent. 
private	TokenNameprivate	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
m_resultLexicalHandler	TokenNameIdentifier	 m result Lexical Handler
;	TokenNameSEMICOLON	
/** The DTD handler where result events will be sent. */	TokenNameCOMMENT_JAVADOC	 The DTD handler where result events will be sent. 
private	TokenNameprivate	
DTDHandler	TokenNameIdentifier	 DTD Handler
m_resultDTDHandler	TokenNameIdentifier	 m result DTD Handler
;	TokenNameSEMICOLON	
/** The Decl handler where result events will be sent. */	TokenNameCOMMENT_JAVADOC	 The Decl handler where result events will be sent. 
private	TokenNameprivate	
DeclHandler	TokenNameIdentifier	 Decl Handler
m_resultDeclHandler	TokenNameIdentifier	 m result Decl Handler
;	TokenNameSEMICOLON	
/** The Serializer, which may or may not be null. */	TokenNameCOMMENT_JAVADOC	 The Serializer, which may or may not be null. 
private	TokenNameprivate	
Serializer	TokenNameIdentifier	 Serializer
m_serializer	TokenNameIdentifier	 m serializer
;	TokenNameSEMICOLON	
/** The Result object. */	TokenNameCOMMENT_JAVADOC	 The Result object. 
private	TokenNameprivate	
Result	TokenNameIdentifier	 Result
m_result	TokenNameIdentifier	 m result
;	TokenNameSEMICOLON	
/** * The system ID, which is unused, but must be returned to fullfill the * TransformerHandler interface. */	TokenNameCOMMENT_JAVADOC	 The system ID, which is unused, but must be returned to fullfill the TransformerHandler interface. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_systemID	TokenNameIdentifier	 m system ID
;	TokenNameSEMICOLON	
/** * The parameters, which is unused, but must be returned to fullfill the * Transformer interface. */	TokenNameCOMMENT_JAVADOC	 The parameters, which is unused, but must be returned to fullfill the Transformer interface. 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
m_params	TokenNameIdentifier	 m params
;	TokenNameSEMICOLON	
/** The error listener for TrAX errors and warnings. */	TokenNameCOMMENT_JAVADOC	 The error listener for TrAX errors and warnings. 
private	TokenNameprivate	
ErrorListener	TokenNameIdentifier	 Error Listener
m_errorListener	TokenNameIdentifier	 m error Listener
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The URIResolver, which is unused, but must be returned to fullfill the * TransformerHandler interface. */	TokenNameCOMMENT_JAVADOC	 The URIResolver, which is unused, but must be returned to fullfill the TransformerHandler interface. 
URIResolver	TokenNameIdentifier	 URI Resolver
m_URIResolver	TokenNameIdentifier	 m  URI Resolver
;	TokenNameSEMICOLON	
/** The output properties. */	TokenNameCOMMENT_JAVADOC	 The output properties. 
private	TokenNameprivate	
OutputProperties	TokenNameIdentifier	 Output Properties
m_outputFormat	TokenNameIdentifier	 m output Format
;	TokenNameSEMICOLON	
/** Flag to set if we've found the first element, so we can tell if we have * to check to see if we should create an HTML serializer. */	TokenNameCOMMENT_JAVADOC	 Flag to set if we've found the first element, so we can tell if we have to check to see if we should create an HTML serializer. 
boolean	TokenNameboolean	
m_foundFirstElement	TokenNameIdentifier	 m found First Element
;	TokenNameSEMICOLON	
/** * State of the secure processing feature. */	TokenNameCOMMENT_JAVADOC	 State of the secure processing feature. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_isSecureProcessing	TokenNameIdentifier	 m is Secure Processing
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
