/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ToXMLSAXHandler.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ToXMLSAXHandler.java 468654 2006-10-28 07:09:23Z minchau $ 
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
IOException	TokenNameIdentifier	 IO Exception
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
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Result	TokenNameIdentifier	 Result
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
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
;	TokenNameSEMICOLON	
/** * This class receives notification of SAX-like events, and with gathered * information over these calls it will invoke the equivalent SAX methods * on a handler, the ultimate xsl:output method is known to be "xml". * * This class is not a public API. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class receives notification of SAX-like events, and with gathered information over these calls it will invoke the equivalent SAX methods on a handler, the ultimate xsl:output method is known to be "xml". * This class is not a public API. @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ToXMLSAXHandler	TokenNameIdentifier	 To XMLSAX Handler
extends	TokenNameextends	
ToSAXHandler	TokenNameIdentifier	 To SAX Handler
{	TokenNameLBRACE	
/** * Keeps track of whether output escaping is currently enabled */	TokenNameCOMMENT_JAVADOC	 Keeps track of whether output escaping is currently enabled 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_escapeSetting	TokenNameIdentifier	 m escape Setting
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ToXMLSAXHandler	TokenNameIdentifier	 To XMLSAX Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default constructor (need to set content handler ASAP !) 	TokenNameCOMMENT_LINE	default constructor (need to set content handler ASAP !) 
m_prefixMap	TokenNameIdentifier	 m prefix Map
=	TokenNameEQUAL	
new	TokenNamenew	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initCDATA	TokenNameIdentifier	 init CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see Serializer#getOutputFormat() */	TokenNameCOMMENT_JAVADOC	 @see Serializer#getOutputFormat() 
public	TokenNamepublic	
Properties	TokenNameIdentifier	 Properties
getOutputFormat	TokenNameIdentifier	 get Output Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see Serializer#getOutputStream() */	TokenNameCOMMENT_JAVADOC	 @see Serializer#getOutputStream() 
public	TokenNamepublic	
OutputStream	TokenNameIdentifier	 Output Stream
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see Serializer#getWriter() */	TokenNameCOMMENT_JAVADOC	 @see Serializer#getWriter() 
public	TokenNamepublic	
Writer	TokenNameIdentifier	 Writer
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Do nothing for SAX. */	TokenNameCOMMENT_JAVADOC	 Do nothing for SAX. 
public	TokenNamepublic	
void	TokenNamevoid	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @see DOMSerializer#serialize(Node) */	TokenNameCOMMENT_JAVADOC	 @see DOMSerializer#serialize(Node) 
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @see SerializationHandler#setEscaping(boolean) */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#setEscaping(boolean) 
public	TokenNamepublic	
boolean	TokenNameboolean	
setEscaping	TokenNameIdentifier	 set Escaping
(	TokenNameLPAREN	
boolean	TokenNameboolean	
escape	TokenNameIdentifier	 escape
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
oldEscapeSetting	TokenNameIdentifier	 old Escape Setting
=	TokenNameEQUAL	
m_escapeSetting	TokenNameIdentifier	 m escape Setting
;	TokenNameSEMICOLON	
m_escapeSetting	TokenNameIdentifier	 m escape Setting
=	TokenNameEQUAL	
escape	TokenNameIdentifier	 escape
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
escape	TokenNameIdentifier	 escape
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
Result	TokenNameIdentifier	 Result
.	TokenNameDOT	
PI_ENABLE_OUTPUT_ESCAPING	TokenNameIdentifier	 PI  ENABLE  OUTPUT  ESCAPING
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
Result	TokenNameIdentifier	 Result
.	TokenNameDOT	
PI_DISABLE_OUTPUT_ESCAPING	TokenNameIdentifier	 PI  DISABLE  OUTPUT  ESCAPING
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
oldEscapeSetting	TokenNameIdentifier	 old Escape Setting
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see Serializer#setOutputFormat(Properties) */	TokenNameCOMMENT_JAVADOC	 @see Serializer#setOutputFormat(Properties) 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @see Serializer#setOutputStream(OutputStream) */	TokenNameCOMMENT_JAVADOC	 @see Serializer#setOutputStream(OutputStream) 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @see Serializer#setWriter(Writer) */	TokenNameCOMMENT_JAVADOC	 @see Serializer#setWriter(Writer) 
public	TokenNamepublic	
void	TokenNamevoid	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.DeclHandler#attributeDecl(String, String, String, String, String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.DeclHandler#attributeDecl(String, String, String, String, String) 
public	TokenNamepublic	
void	TokenNamevoid	
attributeDecl	TokenNameIdentifier	 attribute Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg3	TokenNameIdentifier	 arg3
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg4	TokenNameIdentifier	 arg4
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.DeclHandler#elementDecl(String, String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.DeclHandler#elementDecl(String, String) 
public	TokenNamepublic	
void	TokenNamevoid	
elementDecl	TokenNameIdentifier	 element Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.DeclHandler#externalEntityDecl(String, String, String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.DeclHandler#externalEntityDecl(String, String, String) 
public	TokenNamepublic	
void	TokenNamevoid	
externalEntityDecl	TokenNameIdentifier	 external Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.DeclHandler#internalEntityDecl(String, String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.DeclHandler#internalEntityDecl(String, String) 
public	TokenNamepublic	
void	TokenNamevoid	
internalEntityDecl	TokenNameIdentifier	 internal Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Receives notification of the end of the document. * @see org.xml.sax.ContentHandler#endDocument() */	TokenNameCOMMENT_JAVADOC	 Receives notification of the end of the document. @see org.xml.sax.ContentHandler#endDocument() 
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Close output document 	TokenNameCOMMENT_LINE	Close output document 
m_saxHandler	TokenNameIdentifier	 m sax Handler
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireEndDoc	TokenNameIdentifier	 fire End Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is called when all the data needed for a call to the * SAX handler's startElement() method has been gathered. */	TokenNameCOMMENT_JAVADOC	 This method is called when all the data needed for a call to the SAX handler's startElement() method has been gathered. 
protected	TokenNameprotected	
void	TokenNamevoid	
closeStartTag	TokenNameIdentifier	 close Start Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now is time to send the startElement event 	TokenNameCOMMENT_LINE	Now is time to send the startElement event 
if	TokenNameif	
(	TokenNameLPAREN	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startDocumentInternal	TokenNameIdentifier	 start Document Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_saxHandler	TokenNameIdentifier	 m sax Handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
,	TokenNameCOMMA	
m_attributes	TokenNameIdentifier	 m attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we've sent the official SAX attributes on their way, 	TokenNameCOMMENT_LINE	we've sent the official SAX attributes on their way, 
// now we don't need them anymore. 	TokenNameCOMMENT_LINE	now we don't need them anymore. 
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_state	TokenNameIdentifier	 m state
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_state	TokenNameIdentifier	 m state
.	TokenNameDOT	
setCurrentNode	TokenNameIdentifier	 set Current Node
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Closes ane open cdata tag, and * unlike the this.endCDATA() method (from the LexicalHandler) interface, * this "internal" method will send the endCDATA() call to the wrapped * handler. * */	TokenNameCOMMENT_JAVADOC	 Closes ane open cdata tag, and unlike the this.endCDATA() method (from the LexicalHandler) interface, this "internal" method will send the endCDATA() call to the wrapped handler. 
public	TokenNamepublic	
void	TokenNamevoid	
closeCDATA	TokenNameIdentifier	 close CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// Output closing bracket - "]]>" 	TokenNameCOMMENT_LINE	Output closing bracket - "]]>" 
if	TokenNameif	
(	TokenNameLPAREN	
m_lexHandler	TokenNameIdentifier	 m lex Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lexHandler	TokenNameIdentifier	 m lex Handler
.	TokenNameDOT	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// There are no longer any calls made to 	TokenNameCOMMENT_LINE	There are no longer any calls made to 
// m_lexHandler.startCDATA() without a balancing call to 	TokenNameCOMMENT_LINE	m_lexHandler.startCDATA() without a balancing call to 
// m_lexHandler.endCDATA() 	TokenNameCOMMENT_LINE	m_lexHandler.endCDATA() 
// so we set m_cdataTagOpen to false to remember this. 	TokenNameCOMMENT_LINE	so we set m_cdataTagOpen to false to remember this. 
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#endElement(String, String, String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#endElement(String, String, String) 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
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
// Close any open elements etc. 	TokenNameCOMMENT_LINE	Close any open elements etc. 
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementURI	TokenNameIdentifier	 m element URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementURI	TokenNameIdentifier	 m element URI
;	TokenNameSEMICOLON	
else	TokenNameelse	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementLocalName	TokenNameIdentifier	 m element Local Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementLocalName	TokenNameIdentifier	 m element Local Name
;	TokenNameSEMICOLON	
else	TokenNameelse	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_saxHandler	TokenNameIdentifier	 m sax Handler
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireEndElem	TokenNameIdentifier	 fire End Elem
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Pop all namespaces at the current element depth. * We are not waiting for official endPrefixMapping() calls. */	TokenNameCOMMENT_BLOCK	 Pop all namespaces at the current element depth. We are not waiting for official endPrefixMapping() calls. 
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
popNamespaces	TokenNameIdentifier	 pop Namespaces
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_currentElemDepth	TokenNameIdentifier	 m current Elem Depth
,	TokenNameCOMMA	
m_saxHandler	TokenNameIdentifier	 m sax Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elemContext	TokenNameIdentifier	 m elem Context
=	TokenNameEQUAL	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_prev	TokenNameIdentifier	 m prev
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#endPrefixMapping(String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#endPrefixMapping(String) 
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
/* poping all prefix mappings should have been done * in endElement() already */	TokenNameCOMMENT_BLOCK	 poping all prefix mappings should have been done in endElement() already 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#ignorableWhitespace(char[], int, int) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#ignorableWhitespace(char[], int, int) 
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
int	TokenNameint	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
int	TokenNameint	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_saxHandler	TokenNameIdentifier	 m sax Handler
.	TokenNameDOT	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#setDocumentLocator(Locator) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#setDocumentLocator(Locator) 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_saxHandler	TokenNameIdentifier	 m sax Handler
.	TokenNameDOT	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#skippedEntity(String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#skippedEntity(String) 
public	TokenNamepublic	
void	TokenNamevoid	
skippedEntity	TokenNameIdentifier	 skipped Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_saxHandler	TokenNameIdentifier	 m sax Handler
.	TokenNameDOT	
skippedEntity	TokenNameIdentifier	 skipped Entity
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#startPrefixMapping(String, String) * @param prefix The prefix that maps to the URI * @param uri The URI for the namespace */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#startPrefixMapping(String, String) @param prefix The prefix that maps to the URI @param uri The URI for the namespace 
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
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remember the prefix/uri mapping at the current nested element depth. * * @see org.xml.sax.ContentHandler#startPrefixMapping(String, String) * @param prefix The prefix that maps to the URI * @param uri The URI for the namespace * @param shouldFlush a flag indicating if the mapping applies to the * current element or an up coming child (not used). */	TokenNameCOMMENT_JAVADOC	 Remember the prefix/uri mapping at the current nested element depth. * @see org.xml.sax.ContentHandler#startPrefixMapping(String, String) @param prefix The prefix that maps to the URI @param uri The URI for the namespace @param shouldFlush a flag indicating if the mapping applies to the current element or an up coming child (not used). 
public	TokenNamepublic	
boolean	TokenNameboolean	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shouldFlush	TokenNameIdentifier	 should Flush
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
/* Remember the mapping, and at what depth it was declared * This is one greater than the current depth because these * mappings will apply to the next depth. This is in * consideration that startElement() will soon be called */	TokenNameCOMMENT_BLOCK	 Remember the mapping, and at what depth it was declared This is one greater than the current depth because these mappings will apply to the next depth. This is in consideration that startElement() will soon be called 
boolean	TokenNameboolean	
pushed	TokenNameIdentifier	 pushed
;	TokenNameSEMICOLON	
int	TokenNameint	
pushDepth	TokenNameIdentifier	 push Depth
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shouldFlush	TokenNameIdentifier	 should Flush
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the prefix mapping applies to the child element (one deeper) 	TokenNameCOMMENT_LINE	the prefix mapping applies to the child element (one deeper) 
pushDepth	TokenNameIdentifier	 push Depth
=	TokenNameEQUAL	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_currentElemDepth	TokenNameIdentifier	 m current Elem Depth
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// the prefix mapping applies to the current element 	TokenNameCOMMENT_LINE	the prefix mapping applies to the current element 
pushDepth	TokenNameIdentifier	 push Depth
=	TokenNameEQUAL	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_currentElemDepth	TokenNameIdentifier	 m current Elem Depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pushed	TokenNameIdentifier	 pushed
=	TokenNameEQUAL	
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
pushNamespace	TokenNameIdentifier	 push Namespace
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
pushDepth	TokenNameIdentifier	 push Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pushed	TokenNameIdentifier	 pushed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_saxHandler	TokenNameIdentifier	 m sax Handler
.	TokenNameDOT	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getShouldOutputNSAttr	TokenNameIdentifier	 get Should Output NS Attr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* I don't know if we really needto do this. The * callers of this object should have injected both * startPrefixMapping and the attributes. We are * just covering our butt here. */	TokenNameCOMMENT_BLOCK	 I don't know if we really needto do this. The callers of this object should have injected both startPrefixMapping and the attributes. We are just covering our butt here. 
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
"xmlns"	TokenNameStringLiteral	xmlns
;	TokenNameSEMICOLON	
addAttributeAlways	TokenNameIdentifier	 add Attribute Always
(	TokenNameLPAREN	
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
"CDATA"	TokenNameStringLiteral	CDATA
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// hack for attribset16 test 	TokenNameCOMMENT_LINE	hack for attribset16 test 
{	TokenNameLBRACE	
// that maps ns1 prefix to "" URI 	TokenNameCOMMENT_LINE	that maps ns1 prefix to "" URI 
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
"xmlns:"	TokenNameStringLiteral	xmlns:
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
/* for something like xmlns:abc="w3.pretend.org" * the uri is the value, that is why we pass it in the * value, or 5th slot of addAttributeAlways() */	TokenNameCOMMENT_BLOCK	 for something like xmlns:abc="w3.pretend.org" the uri is the value, that is why we pass it in the value, or 5th slot of addAttributeAlways() 
addAttributeAlways	TokenNameIdentifier	 add Attribute Always
(	TokenNameLPAREN	
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
"CDATA"	TokenNameStringLiteral	CDATA
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
pushed	TokenNameIdentifier	 pushed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.LexicalHandler#comment(char[], int, int) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.LexicalHandler#comment(char[], int, int) 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
int	TokenNameint	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
int	TokenNameint	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_lexHandler	TokenNameIdentifier	 m lex Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_lexHandler	TokenNameIdentifier	 m lex Handler
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireCommentEvent	TokenNameIdentifier	 fire Comment Event
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.LexicalHandler#endCDATA() */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.LexicalHandler#endCDATA() 
public	TokenNamepublic	
void	TokenNamevoid	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
/* Normally we would do somthing with this but we ignore it. * The neccessary call to m_lexHandler.endCDATA() will be made * in flushPending(). * * This is so that if we get calls like these: * this.startCDATA(); * this.characters(chars1, off1, len1); * this.endCDATA(); * this.startCDATA(); * this.characters(chars2, off2, len2); * this.endCDATA(); * * that we will only make these calls to the wrapped handlers: * * m_lexHandler.startCDATA(); * m_saxHandler.characters(chars1, off1, len1); * m_saxHandler.characters(chars1, off2, len2); * m_lexHandler.endCDATA(); * * We will merge adjacent CDATA blocks. */	TokenNameCOMMENT_BLOCK	 Normally we would do somthing with this but we ignore it. The neccessary call to m_lexHandler.endCDATA() will be made in flushPending(). * This is so that if we get calls like these: this.startCDATA(); this.characters(chars1, off1, len1); this.endCDATA(); this.startCDATA(); this.characters(chars2, off2, len2); this.endCDATA(); * that we will only make these calls to the wrapped handlers: * m_lexHandler.startCDATA(); m_saxHandler.characters(chars1, off1, len1); m_saxHandler.characters(chars1, off2, len2); m_lexHandler.endCDATA(); * We will merge adjacent CDATA blocks. 
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.LexicalHandler#endDTD() */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.LexicalHandler#endDTD() 
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
m_lexHandler	TokenNameIdentifier	 m lex Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_lexHandler	TokenNameIdentifier	 m lex Handler
.	TokenNameDOT	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.LexicalHandler#startEntity(String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.LexicalHandler#startEntity(String) 
public	TokenNamepublic	
void	TokenNamevoid	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_lexHandler	TokenNameIdentifier	 m lex Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_lexHandler	TokenNameIdentifier	 m lex Handler
.	TokenNameDOT	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#characters(String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#characters(String) 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
m_charsBuff	TokenNameIdentifier	 m chars Buff
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_charsBuff	TokenNameIdentifier	 m chars Buff
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
m_charsBuff	TokenNameIdentifier	 m chars Buff
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
m_charsBuff	TokenNameIdentifier	 m chars Buff
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ToXMLSAXHandler	TokenNameIdentifier	 To XMLSAX Handler
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initCDATA	TokenNameIdentifier	 init CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// initNamespaces(); 	TokenNameCOMMENT_LINE	initNamespaces(); 
m_prefixMap	TokenNameIdentifier	 m prefix Map
=	TokenNameEQUAL	
new	TokenNamenew	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ToXMLSAXHandler	TokenNameIdentifier	 To XMLSAX Handler
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
lex	TokenNameIdentifier	 lex
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
lex	TokenNameIdentifier	 lex
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initCDATA	TokenNameIdentifier	 init CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// initNamespaces(); 	TokenNameCOMMENT_LINE	initNamespaces(); 
m_prefixMap	TokenNameIdentifier	 m prefix Map
=	TokenNameEQUAL	
new	TokenNamenew	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Start an element in the output document. This might be an XML element * (<elem>data</elem> type) or a CDATA section. */	TokenNameCOMMENT_JAVADOC	 Start an element in the output document. This might be an XML element (<elem>data</elem> type) or a CDATA section. 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementNamespaceURI	TokenNameIdentifier	 element Namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elementLocalName	TokenNameIdentifier	 element Local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
elementNamespaceURI	TokenNameIdentifier	 element Namespace URI
,	TokenNameCOMMA	
elementLocalName	TokenNameIdentifier	 element Local Name
,	TokenNameCOMMA	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// We do the first two things in flushPending() but we don't 	TokenNameCOMMENT_LINE	We do the first two things in flushPending() but we don't 
// close any open CDATA calls. 	TokenNameCOMMENT_LINE	close any open CDATA calls. 
if	TokenNameif	
(	TokenNameLPAREN	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startDocumentInternal	TokenNameIdentifier	 start Document Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closeStartTag	TokenNameIdentifier	 close Start Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_isCdataSection	TokenNameIdentifier	 m is Cdata Section
&&	TokenNameAND_AND	
!	TokenNameNOT	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
&&	TokenNameAND_AND	
m_lexHandler	TokenNameIdentifier	 m lex Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lexHandler	TokenNameIdentifier	 m lex Handler
.	TokenNameDOT	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We have made a call to m_lexHandler.startCDATA() with 	TokenNameCOMMENT_LINE	We have made a call to m_lexHandler.startCDATA() with 
// no balancing call to m_lexHandler.endCDATA() 	TokenNameCOMMENT_LINE	no balancing call to m_lexHandler.endCDATA() 
// so we set m_cdataTagOpen true to remember this. 	TokenNameCOMMENT_LINE	so we set m_cdataTagOpen true to remember this. 
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* If there are any occurances of "]]>" in the character data * let m_saxHandler worry about it, we've already warned them with * the previous call of m_lexHandler.startCDATA(); */	TokenNameCOMMENT_BLOCK	 If there are any occurances of "]]>" in the character data let m_saxHandler worry about it, we've already warned them with the previous call of m_lexHandler.startCDATA(); 
m_saxHandler	TokenNameIdentifier	 m sax Handler
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// time to generate characters event 	TokenNameCOMMENT_LINE	time to generate characters event 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
fireCharEvent	TokenNameIdentifier	 fire Char Event
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#endElement(String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#endElement(String) 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Send a namespace declaration in the output document. The namespace * declaration will not be include if the namespace is already in scope * with the same prefix. */	TokenNameCOMMENT_JAVADOC	 Send a namespace declaration in the output document. The namespace declaration will not be include if the namespace is already in scope with the same prefix. 
public	TokenNamepublic	
void	TokenNamevoid	
namespaceAfterStartElement	TokenNameIdentifier	 namespace After Start Element
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @see org.xml.sax.ContentHandler#processingInstruction(String, String) * Send a processing instruction to the output document */	TokenNameCOMMENT_JAVADOC	 * @see org.xml.sax.ContentHandler#processingInstruction(String, String) Send a processing instruction to the output document 
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
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Pass the processing instruction to the SAX handler 	TokenNameCOMMENT_LINE	Pass the processing instruction to the SAX handler 
m_saxHandler	TokenNameIdentifier	 m sax Handler
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we don't want to leave serializer to fire off this event, 	TokenNameCOMMENT_LINE	we don't want to leave serializer to fire off this event, 
// so do it here. 	TokenNameCOMMENT_LINE	so do it here. 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireEscapingEvent	TokenNameIdentifier	 fire Escaping Event
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Undeclare the namespace that is currently pointed to by a given * prefix. Inform SAX handler if prefix was previously mapped. */	TokenNameCOMMENT_JAVADOC	 Undeclare the namespace that is currently pointed to by a given prefix. Inform SAX handler if prefix was previously mapped. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
popNamespace	TokenNameIdentifier	 pop Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
popNamespace	TokenNameIdentifier	 pop Namespace
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_saxHandler	TokenNameIdentifier	 m sax Handler
.	TokenNameDOT	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// falls through 	TokenNameCOMMENT_LINE	falls through 
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
/* m_cdataTagOpen can only be true here if we have ignored the * previous call to this.endCDATA() and the previous call * this.startCDATA() before that is still "open". In this way * we merge adjacent CDATA. If anything else happened after the * ignored call to this.endCDATA() and this call then a call to * flushPending() would have been made which would have * closed the CDATA and set m_cdataTagOpen to false. */	TokenNameCOMMENT_BLOCK	 m_cdataTagOpen can only be true here if we have ignored the previous call to this.endCDATA() and the previous call this.startCDATA() before that is still "open". In this way we merge adjacent CDATA. If anything else happened after the ignored call to this.endCDATA() and this call then a call to flushPending() would have been made which would have closed the CDATA and set m_cdataTagOpen to false. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_lexHandler	TokenNameIdentifier	 m lex Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lexHandler	TokenNameIdentifier	 m lex Handler
.	TokenNameDOT	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We have made a call to m_lexHandler.startCDATA() with 	TokenNameCOMMENT_LINE	We have made a call to m_lexHandler.startCDATA() with 
// no balancing call to m_lexHandler.endCDATA() 	TokenNameCOMMENT_LINE	no balancing call to m_lexHandler.endCDATA() 
// so we set m_cdataTagOpen true to remember this. 	TokenNameCOMMENT_LINE	so we set m_cdataTagOpen true to remember this. 
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#startElement(String, String, String, Attributes) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#startElement(String, String, String, Attributes) 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Handle document type declaration (for first element only) 	TokenNameCOMMENT_LINE	Handle document type declaration (for first element only) 
if	TokenNameif	
(	TokenNameLPAREN	
m_needToOutputDocTypeDecl	TokenNameIdentifier	 m need To Output Doc Type Decl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
doctypeSystem	TokenNameIdentifier	 doctype System
=	TokenNameEQUAL	
getDoctypeSystem	TokenNameIdentifier	 get Doctype System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doctypeSystem	TokenNameIdentifier	 doctype System
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_lexHandler	TokenNameIdentifier	 m lex Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
doctypePublic	TokenNameIdentifier	 doctype Public
=	TokenNameEQUAL	
getDoctypePublic	TokenNameIdentifier	 get Doctype Public
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doctypeSystem	TokenNameIdentifier	 doctype System
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_lexHandler	TokenNameIdentifier	 m lex Handler
.	TokenNameDOT	
startDTD	TokenNameIdentifier	 start DTD
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
doctypePublic	TokenNameIdentifier	 doctype Public
,	TokenNameCOMMA	
doctypeSystem	TokenNameIdentifier	 doctype System
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_needToOutputDocTypeDecl	TokenNameIdentifier	 m need To Output Doc Type Decl
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_elemContext	TokenNameIdentifier	 m elem Context
=	TokenNameEQUAL	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ensurePrefixIsDeclared depends on the current depth, so 	TokenNameCOMMENT_LINE	ensurePrefixIsDeclared depends on the current depth, so 
// the previous increment is necessary where it is. 	TokenNameCOMMENT_LINE	the previous increment is necessary where it is. 
if	TokenNameif	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ensurePrefixIsDeclared	TokenNameIdentifier	 ensure Prefix Is Declared
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add the attributes to the collected ones 	TokenNameCOMMENT_LINE	add the attributes to the collected ones 
if	TokenNameif	
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
addAttributes	TokenNameIdentifier	 add Attributes
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// do we really need this CDATA section state? 	TokenNameCOMMENT_LINE	do we really need this CDATA section state? 
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_isCdataSection	TokenNameIdentifier	 m is Cdata Section
=	TokenNameEQUAL	
isCdataSection	TokenNameIdentifier	 is Cdata Section
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
ensurePrefixIsDeclared	TokenNameIdentifier	 ensure Prefix Is Declared
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
no_prefix	TokenNameIdentifier	 no prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
rawName	TokenNameIdentifier	 raw Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
no_prefix	TokenNameIdentifier	 no prefix
)	TokenNameRPAREN	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
rawName	TokenNameIdentifier	 raw Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
foundURI	TokenNameIdentifier	 found URI
=	TokenNameEQUAL	
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
lookupNamespace	TokenNameIdentifier	 lookup Namespace
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
foundURI	TokenNameIdentifier	 found URI
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
foundURI	TokenNameIdentifier	 found URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getShouldOutputNSAttr	TokenNameIdentifier	 get Should Output NS Attr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Bugzilla1133: Generate attribute as well as namespace event. 	TokenNameCOMMENT_LINE	Bugzilla1133: Generate attribute as well as namespace event. 
// SAX does expect both. 	TokenNameCOMMENT_LINE	SAX does expect both. 
this	TokenNamethis	
.	TokenNameDOT	
addAttributeAlways	TokenNameIdentifier	 add Attribute Always
(	TokenNameLPAREN	
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral	http://www.w3.org/2000/xmlns/
,	TokenNameCOMMA	
no_prefix	TokenNameIdentifier	 no prefix
?	TokenNameQUESTION	
"xmlns"	TokenNameStringLiteral	xmlns
:	TokenNameCOLON	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
// local name 	TokenNameCOMMENT_LINE	local name 
no_prefix	TokenNameIdentifier	 no prefix
?	TokenNameQUESTION	
"xmlns"	TokenNameStringLiteral	xmlns
:	TokenNameCOLON	
(	TokenNameLPAREN	
"xmlns:"	TokenNameStringLiteral	xmlns:
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
,	TokenNameCOMMA	
// qname 	TokenNameCOMMENT_LINE	qname 
"CDATA"	TokenNameStringLiteral	CDATA
,	TokenNameCOMMA	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds the given attribute to the set of attributes, and also makes sure * that the needed prefix/uri mapping is declared, but only if there is a * currently open element. * * @param uri the URI of the attribute * @param localName the local name of the attribute * @param rawName the qualified name of the attribute * @param type the type of the attribute (probably CDATA) * @param value the value of the attribute * @param XSLAttribute true if this attribute is coming from an xsl:attribute element * @see ExtendedContentHandler#addAttribute(String, String, String, String, String) */	TokenNameCOMMENT_JAVADOC	 Adds the given attribute to the set of attributes, and also makes sure that the needed prefix/uri mapping is declared, but only if there is a currently open element. * @param uri the URI of the attribute @param localName the local name of the attribute @param rawName the qualified name of the attribute @param type the type of the attribute (probably CDATA) @param value the value of the attribute @param XSLAttribute true if this attribute is coming from an xsl:attribute element @see ExtendedContentHandler#addAttribute(String, String, String, String, String) 
public	TokenNamepublic	
void	TokenNamevoid	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
XSLAttribute	TokenNameIdentifier	 XSL Attribute
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensurePrefixIsDeclared	TokenNameIdentifier	 ensure Prefix Is Declared
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addAttributeAlways	TokenNameIdentifier	 add Attribute Always
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Try's to reset the super class and reset this class for * re-use, so that you don't need to create a new serializer * (mostly for performance reasons). * * @return true if the class was successfuly reset. * @see Serializer#reset() */	TokenNameCOMMENT_JAVADOC	 Try's to reset the super class and reset this class for re-use, so that you don't need to create a new serializer (mostly for performance reasons). * @return true if the class was successfuly reset. @see Serializer#reset() 
public	TokenNamepublic	
boolean	TokenNameboolean	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
wasReset	TokenNameIdentifier	 was Reset
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resetToXMLSAXHandler	TokenNameIdentifier	 reset To XMLSAX Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wasReset	TokenNameIdentifier	 was Reset
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
wasReset	TokenNameIdentifier	 was Reset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset all of the fields owned by ToXMLSAXHandler class * */	TokenNameCOMMENT_JAVADOC	 Reset all of the fields owned by ToXMLSAXHandler class 
private	TokenNameprivate	
void	TokenNamevoid	
resetToXMLSAXHandler	TokenNameIdentifier	 reset To XMLSAX Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_escapeSetting	TokenNameIdentifier	 m escape Setting
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
