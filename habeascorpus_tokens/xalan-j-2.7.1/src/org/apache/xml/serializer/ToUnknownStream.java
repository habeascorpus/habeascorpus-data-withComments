/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ToUnknownStream.java 471981 2006-11-07 04:28:00Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ToUnknownStream.java 471981 2006-11-07 04:28:00Z minchau $ 
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
SourceLocator	TokenNameIdentifier	 Source Locator
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
/** *This class wraps another SerializationHandler. The wrapped object will either * handler XML or HTML, which is not known until a little later when the first XML * tag is seen. If the first tag is <html> then the wrapped object is an HTML * handler, otherwise it is an XML handler. * * This class effectively caches the first few calls to it then passes them * on to the wrapped handler (once it exists). After that subsequent calls a * simply passed directly to the wrapped handler. * * The user of this class doesn't know if the output is ultimatley XML or HTML. * * This class is not a public API, it is public because it is used within Xalan. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 *This class wraps another SerializationHandler. The wrapped object will either handler XML or HTML, which is not known until a little later when the first XML tag is seen. If the first tag is <html> then the wrapped object is an HTML handler, otherwise it is an XML handler. * This class effectively caches the first few calls to it then passes them on to the wrapped handler (once it exists). After that subsequent calls a simply passed directly to the wrapped handler. * The user of this class doesn't know if the output is ultimatley XML or HTML. * This class is not a public API, it is public because it is used within Xalan. @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ToUnknownStream	TokenNameIdentifier	 To Unknown Stream
extends	TokenNameextends	
SerializerBase	TokenNameIdentifier	 Serializer Base
{	TokenNameLBRACE	
/** * The wrapped handler, initially XML but possibly switched to HTML */	TokenNameCOMMENT_JAVADOC	 The wrapped handler, initially XML but possibly switched to HTML 
private	TokenNameprivate	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
m_handler	TokenNameIdentifier	 m handler
;	TokenNameSEMICOLON	
/** * A String with no characters */	TokenNameCOMMENT_JAVADOC	 A String with no characters 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * true if the underlying handler (XML or HTML) is fully initialized */	TokenNameCOMMENT_JAVADOC	 true if the underlying handler (XML or HTML) is fully initialized 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_wrapped_handler_not_initialized	TokenNameIdentifier	 m wrapped handler not initialized
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * the prefix of the very first tag in the document */	TokenNameCOMMENT_JAVADOC	 the prefix of the very first tag in the document 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_firstElementPrefix	TokenNameIdentifier	 m first Element Prefix
;	TokenNameSEMICOLON	
/** * the element name (including any prefix) of the very first tag in the document */	TokenNameCOMMENT_JAVADOC	 the element name (including any prefix) of the very first tag in the document 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_firstElementName	TokenNameIdentifier	 m first Element Name
;	TokenNameSEMICOLON	
/** * the namespace URI associated with the first element */	TokenNameCOMMENT_JAVADOC	 the namespace URI associated with the first element 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_firstElementURI	TokenNameIdentifier	 m first Element URI
;	TokenNameSEMICOLON	
/** * the local name (no prefix) associated with the first element */	TokenNameCOMMENT_JAVADOC	 the local name (no prefix) associated with the first element 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_firstElementLocalName	TokenNameIdentifier	 m first Element Local Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * true if the first tag has been emitted to the wrapped handler */	TokenNameCOMMENT_JAVADOC	 true if the first tag has been emitted to the wrapped handler 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * A collection of namespace URI's (only for first element). * _namespacePrefix has the matching prefix for these URI's */	TokenNameCOMMENT_JAVADOC	 A collection of namespace URI's (only for first element). _namespacePrefix has the matching prefix for these URI's 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_namespaceURI	TokenNameIdentifier	 m namespace URI
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * A collection of namespace Prefix (only for first element) * _namespaceURI has the matching URIs for these prefix' */	TokenNameCOMMENT_JAVADOC	 A collection of namespace Prefix (only for first element) _namespaceURI has the matching URIs for these prefix' 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_namespacePrefix	TokenNameIdentifier	 m namespace Prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * true if startDocument() was called before the underlying handler * was initialized */	TokenNameCOMMENT_JAVADOC	 true if startDocument() was called before the underlying handler was initialized 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * true if setVersion() was called before the underlying handler * was initialized */	TokenNameCOMMENT_JAVADOC	 true if setVersion() was called before the underlying handler was initialized 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_setVersion_called	TokenNameIdentifier	 m set Version called
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * true if setDoctypeSystem() was called before the underlying handler * was initialized */	TokenNameCOMMENT_JAVADOC	 true if setDoctypeSystem() was called before the underlying handler was initialized 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_setDoctypeSystem_called	TokenNameIdentifier	 m set Doctype System called
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * true if setDoctypePublic() was called before the underlying handler * was initialized */	TokenNameCOMMENT_JAVADOC	 true if setDoctypePublic() was called before the underlying handler was initialized 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_setDoctypePublic_called	TokenNameIdentifier	 m set Doctype Public called
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * true if setMediaType() was called before the underlying handler * was initialized */	TokenNameCOMMENT_JAVADOC	 true if setMediaType() was called before the underlying handler was initialized 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_setMediaType_called	TokenNameIdentifier	 m set Media Type called
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Default constructor. * Initially this object wraps an XML Stream object, so _handler is never null. * That may change later to an HTML Stream object. */	TokenNameCOMMENT_JAVADOC	 Default constructor. Initially this object wraps an XML Stream object, so _handler is never null. That may change later to an HTML Stream object. 
public	TokenNamepublic	
ToUnknownStream	TokenNameIdentifier	 To Unknown Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
=	TokenNameEQUAL	
new	TokenNamenew	
ToXMLStream	TokenNameIdentifier	 To XML Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see Serializer#asContentHandler() * @return the wrapped XML or HTML handler */	TokenNameCOMMENT_JAVADOC	 @see Serializer#asContentHandler() @return the wrapped XML or HTML handler 
public	TokenNamepublic	
ContentHandler	TokenNameIdentifier	 Content Handler
asContentHandler	TokenNameIdentifier	 as Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
/* don't return the real handler ( m_handler ) because * that would expose the real handler to the outside. * Keep m_handler private so it can be internally swapped * to an HTML handler. */	TokenNameCOMMENT_BLOCK	 don't return the real handler ( m_handler ) because that would expose the real handler to the outside. Keep m_handler private so it can be internally swapped to an HTML handler. 
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#close() */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#close() 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see Serializer#getOutputFormat() * @return the properties of the underlying handler */	TokenNameCOMMENT_JAVADOC	 @see Serializer#getOutputFormat() @return the properties of the underlying handler 
public	TokenNamepublic	
Properties	TokenNameIdentifier	 Properties
getOutputFormat	TokenNameIdentifier	 get Output Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
getOutputFormat	TokenNameIdentifier	 get Output Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see Serializer#getOutputStream() * @return the OutputStream of the underlying XML or HTML handler */	TokenNameCOMMENT_JAVADOC	 @see Serializer#getOutputStream() @return the OutputStream of the underlying XML or HTML handler 
public	TokenNamepublic	
OutputStream	TokenNameIdentifier	 Output Stream
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see Serializer#getWriter() * @return the Writer of the underlying XML or HTML handler */	TokenNameCOMMENT_JAVADOC	 @see Serializer#getWriter() @return the Writer of the underlying XML or HTML handler 
public	TokenNamepublic	
Writer	TokenNameIdentifier	 Writer
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * passes the call on to the underlying HTML or XML handler * @see Serializer#reset() * @return ??? */	TokenNameCOMMENT_JAVADOC	 passes the call on to the underlying HTML or XML handler @see Serializer#reset() @return ??? 
public	TokenNamepublic	
boolean	TokenNameboolean	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts the DOM node to output * @param node the DOM node to transform to output * @see DOMSerializer#serialize(Node) * */	TokenNameCOMMENT_JAVADOC	 Converts the DOM node to output @param node the DOM node to transform to output @see DOMSerializer#serialize(Node) 
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
if	TokenNameif	
(	TokenNameLPAREN	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setEscaping	TokenNameIdentifier	 set Escaping
(	TokenNameLPAREN	
escape	TokenNameIdentifier	 escape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the properties of the handler * @param format the output properties to set * @see Serializer#setOutputFormat(Properties) */	TokenNameCOMMENT_JAVADOC	 Set the properties of the handler @param format the output properties to set @see Serializer#setOutputFormat(Properties) 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the output stream to write to * @param output the OutputStream to write to * @see Serializer#setOutputStream(OutputStream) */	TokenNameCOMMENT_JAVADOC	 Sets the output stream to write to @param output the OutputStream to write to @see Serializer#setOutputStream(OutputStream) 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the writer to write to * @param writer the writer to write to * @see Serializer#setWriter(Writer) */	TokenNameCOMMENT_JAVADOC	 Sets the writer to write to @param writer the writer to write to @see Serializer#setWriter(Writer) 
public	TokenNamepublic	
void	TokenNamevoid	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds an attribute to the currenly open tag * @param uri the URI of a namespace * @param localName the attribute name, without prefix * @param rawName the attribute name, with prefix (if any) * @param type the type of the attribute, typically "CDATA" * @param value the value of the parameter * @param XSLAttribute true if this attribute is coming from an xsl:attribute element * @see ExtendedContentHandler#addAttribute(String, String, String, String, String) */	TokenNameCOMMENT_JAVADOC	 Adds an attribute to the currenly open tag @param uri the URI of a namespace @param localName the attribute name, without prefix @param rawName the attribute name, with prefix (if any) @param type the type of the attribute, typically "CDATA" @param value the value of the parameter @param XSLAttribute true if this attribute is coming from an xsl:attribute element @see ExtendedContentHandler#addAttribute(String, String, String, String, String) 
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
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
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
XSLAttribute	TokenNameIdentifier	 XSL Attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds an attribute to the currenly open tag * @param rawName the attribute name, with prefix (if any) * @param value the value of the parameter * @see ExtendedContentHandler#addAttribute(String, String) */	TokenNameCOMMENT_JAVADOC	 Adds an attribute to the currenly open tag @param rawName the attribute name, with prefix (if any) @param value the value of the parameter @see ExtendedContentHandler#addAttribute(String, String) 
public	TokenNamepublic	
void	TokenNamevoid	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a unique attribute to the currenly open tag */	TokenNameCOMMENT_JAVADOC	 Adds a unique attribute to the currenly open tag 
public	TokenNamepublic	
void	TokenNamevoid	
addUniqueAttribute	TokenNameIdentifier	 add Unique Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
addUniqueAttribute	TokenNameIdentifier	 add Unique Attribute
(	TokenNameLPAREN	
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts the String to a character array and calls the SAX method * characters(char[],int,int); * * @see ExtendedContentHandler#characters(String) */	TokenNameCOMMENT_JAVADOC	 Converts the String to a character array and calls the SAX method characters(char[],int,int); * @see ExtendedContentHandler#characters(String) 
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
/** * Pass the call on to the underlying handler * @see ExtendedContentHandler#endElement(String) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see ExtendedContentHandler#endElement(String) 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
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
this	TokenNamethis	
.	TokenNameDOT	
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
/** * This method is used when a prefix/uri namespace mapping * is indicated after the element was started with a * startElement() and before and endElement(). * startPrefixMapping(prefix,uri) would be used before the * startElement() call. * @param uri the URI of the namespace * @param prefix the prefix associated with the given URI. * * @see ExtendedContentHandler#namespaceAfterStartElement(String, String) */	TokenNameCOMMENT_JAVADOC	 This method is used when a prefix/uri namespace mapping is indicated after the element was started with a startElement() and before and endElement(). startPrefixMapping(prefix,uri) would be used before the startElement() call. @param uri the URI of the namespace @param prefix the prefix associated with the given URI. * @see ExtendedContentHandler#namespaceAfterStartElement(String, String) 
public	TokenNamepublic	
void	TokenNamevoid	
namespaceAfterStartElement	TokenNameIdentifier	 namespace After Start Element
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
// hack for XSLTC with finding URI for default namespace 	TokenNameCOMMENT_LINE	hack for XSLTC with finding URI for default namespace 
if	TokenNameif	
(	TokenNameLPAREN	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
&&	TokenNameAND_AND	
m_firstElementURI	TokenNameIdentifier	 m first Element URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_firstElementName	TokenNameIdentifier	 m first Element Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix1	TokenNameIdentifier	 prefix1
=	TokenNameEQUAL	
getPrefixPart	TokenNameIdentifier	 get Prefix Part
(	TokenNameLPAREN	
m_firstElementName	TokenNameIdentifier	 m first Element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix1	TokenNameIdentifier	 prefix1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the elements URI is not known yet, and it 	TokenNameCOMMENT_LINE	the elements URI is not known yet, and it 
// doesn't have a prefix, and we are currently 	TokenNameCOMMENT_LINE	doesn't have a prefix, and we are currently 
// setting the uri for prefix "", so we have 	TokenNameCOMMENT_LINE	setting the uri for prefix "", so we have 
// the uri for the element... lets remember it 	TokenNameCOMMENT_LINE	the uri for the element... lets remember it 
m_firstElementURI	TokenNameIdentifier	 m first Element URI
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
pushed	TokenNameIdentifier	 pushed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstElementName	TokenNameIdentifier	 m first Element Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
shouldFlush	TokenNameIdentifier	 should Flush
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* we've already seen a startElement, and this is a prefix mapping * for the up coming element, so flush the old element * then send this event on its way. */	TokenNameCOMMENT_BLOCK	 we've already seen a startElement, and this is a prefix mapping for the up coming element, so flush the old element then send this event on its way. 
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushed	TokenNameIdentifier	 pushed
=	TokenNameEQUAL	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
shouldFlush	TokenNameIdentifier	 should Flush
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_namespacePrefix	TokenNameIdentifier	 m namespace Prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_namespacePrefix	TokenNameIdentifier	 m namespace Prefix
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_namespaceURI	TokenNameIdentifier	 m namespace URI
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_namespacePrefix	TokenNameIdentifier	 m namespace Prefix
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_namespaceURI	TokenNameIdentifier	 m namespace URI
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstElementURI	TokenNameIdentifier	 m first Element URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
m_firstElementPrefix	TokenNameIdentifier	 m first Element Prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_firstElementURI	TokenNameIdentifier	 m first Element URI
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pushed	TokenNameIdentifier	 pushed
=	TokenNameEQUAL	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
shouldFlush	TokenNameIdentifier	 should Flush
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
pushed	TokenNameIdentifier	 pushed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method cannot be cached because default is different in * HTML and XML (we need more than a boolean). */	TokenNameCOMMENT_JAVADOC	 This method cannot be cached because default is different in HTML and XML (we need more than a boolean). 
public	TokenNamepublic	
void	TokenNamevoid	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Cache call to setVersion() 	TokenNameCOMMENT_LINE	Cache call to setVersion() 
// super.setVersion(version); 	TokenNameCOMMENT_LINE	super.setVersion(version); 
m_setVersion_called	TokenNameIdentifier	 m set Version called
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#startDocument() */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#startDocument() 
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
qName	TokenNameIdentifier	 q Name
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
this	TokenNamethis	
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
qName	TokenNameIdentifier	 q Name
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
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
/* we are notified of the start of an element */	TokenNameCOMMENT_BLOCK	 we are notified of the start of an element 
if	TokenNameif	
(	TokenNameLPAREN	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* we have not yet sent the first element on its way */	TokenNameCOMMENT_BLOCK	 we have not yet sent the first element on its way 
if	TokenNameif	
(	TokenNameLPAREN	
m_firstElementName	TokenNameIdentifier	 m first Element Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* this is not the first element, but a later one. * But we have the old element pending, so flush it out, * then send this one on its way. */	TokenNameCOMMENT_BLOCK	 this is not the first element, but a later one. But we have the old element pending, so flush it out, then send this one on its way. 
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
/* this is the very first element that we have seen, * so save it for flushing later. We may yet get to know its * URI due to added attributes. */	TokenNameCOMMENT_BLOCK	 this is the very first element that we have seen, so save it for flushing later. We may yet get to know its URI due to added attributes. 
m_wrapped_handler_not_initialized	TokenNameIdentifier	 m wrapped handler not initialized
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_firstElementName	TokenNameIdentifier	 m first Element Name
=	TokenNameEQUAL	
elementName	TokenNameIdentifier	 element Name
;	TokenNameSEMICOLON	
// null if not known 	TokenNameCOMMENT_LINE	null if not known 
m_firstElementPrefix	TokenNameIdentifier	 m first Element Prefix
=	TokenNameEQUAL	
getPrefixPartUnknown	TokenNameIdentifier	 get Prefix Part Unknown
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// null if not known 	TokenNameCOMMENT_LINE	null if not known 
m_firstElementURI	TokenNameIdentifier	 m first Element URI
=	TokenNameEQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
// null if not known 	TokenNameCOMMENT_LINE	null if not known 
m_firstElementLocalName	TokenNameIdentifier	 m first Element Local Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
firePseudoElement	TokenNameIdentifier	 fire Pseudo Element
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* we don't want to call our own addAttributes, which * merely delegates to the wrapped handler, but we want to * add these attributes to m_attributes. So me must call super. * addAttributes() In this case m_attributes is only used for the * first element, after that this class totally delegates to the * wrapped handler which is either XML or HTML. */	TokenNameCOMMENT_BLOCK	 we don't want to call our own addAttributes, which merely delegates to the wrapped handler, but we want to add these attributes to m_attributes. So me must call super. addAttributes() In this case m_attributes is only used for the first element, after that this class totally delegates to the wrapped handler which is either XML or HTML. 
if	TokenNameif	
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
addAttributes	TokenNameIdentifier	 add Attributes
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if there are attributes, then lets make the flush() 	TokenNameCOMMENT_LINE	if there are attributes, then lets make the flush() 
// call the startElement on the handler and send the 	TokenNameCOMMENT_LINE	call the startElement on the handler and send the 
// attributes on their way. 	TokenNameCOMMENT_LINE	attributes on their way. 
if	TokenNameif	
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// this is not the first element, but a later one, so just 	TokenNameCOMMENT_LINE	this is not the first element, but a later one, so just 
// send it on its way. 	TokenNameCOMMENT_LINE	send it on its way. 
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see ExtendedLexicalHandler#comment(String) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see ExtendedLexicalHandler#comment(String) 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
&&	TokenNameAND_AND	
m_firstElementName	TokenNameIdentifier	 m first Element Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
emitFirstTag	TokenNameIdentifier	 emit First Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see XSLOutputAttributes#getDoctypePublic() */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see XSLOutputAttributes#getDoctypePublic() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDoctypePublic	TokenNameIdentifier	 get Doctype Public
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
getDoctypePublic	TokenNameIdentifier	 get Doctype Public
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see XSLOutputAttributes#getDoctypeSystem() */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see XSLOutputAttributes#getDoctypeSystem() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDoctypeSystem	TokenNameIdentifier	 get Doctype System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
getDoctypeSystem	TokenNameIdentifier	 get Doctype System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see XSLOutputAttributes#getEncoding() */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see XSLOutputAttributes#getEncoding() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see XSLOutputAttributes#getIndent() */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see XSLOutputAttributes#getIndent() 
public	TokenNamepublic	
boolean	TokenNameboolean	
getIndent	TokenNameIdentifier	 get Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
getIndent	TokenNameIdentifier	 get Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see XSLOutputAttributes#getIndentAmount() */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see XSLOutputAttributes#getIndentAmount() 
public	TokenNamepublic	
int	TokenNameint	
getIndentAmount	TokenNameIdentifier	 get Indent Amount
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
getIndentAmount	TokenNameIdentifier	 get Indent Amount
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see XSLOutputAttributes#getMediaType() */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see XSLOutputAttributes#getMediaType() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMediaType	TokenNameIdentifier	 get Media Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
getMediaType	TokenNameIdentifier	 get Media Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see XSLOutputAttributes#getOmitXMLDeclaration() */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see XSLOutputAttributes#getOmitXMLDeclaration() 
public	TokenNamepublic	
boolean	TokenNameboolean	
getOmitXMLDeclaration	TokenNameIdentifier	 get Omit XML Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
getOmitXMLDeclaration	TokenNameIdentifier	 get Omit XML Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see XSLOutputAttributes#getStandalone() */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see XSLOutputAttributes#getStandalone() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStandalone	TokenNameIdentifier	 get Standalone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
getStandalone	TokenNameIdentifier	 get Standalone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see XSLOutputAttributes#getVersion() */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see XSLOutputAttributes#getVersion() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#setDoctype(String, String) */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#setDoctype(String, String) 
public	TokenNamepublic	
void	TokenNamevoid	
setDoctype	TokenNameIdentifier	 set Doctype
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
system	TokenNameIdentifier	 system
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pub	TokenNameIdentifier	 pub
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setDoctypePublic	TokenNameIdentifier	 set Doctype Public
(	TokenNameLPAREN	
pub	TokenNameIdentifier	 pub
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setDoctypeSystem	TokenNameIdentifier	 set Doctype System
(	TokenNameLPAREN	
system	TokenNameIdentifier	 system
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the doctype in the underlying XML handler. Remember that this method * was called, just in case we need to transfer this doctype to an HTML handler * @param doctype the public doctype to set * @see XSLOutputAttributes#setDoctypePublic(String) */	TokenNameCOMMENT_JAVADOC	 Set the doctype in the underlying XML handler. Remember that this method was called, just in case we need to transfer this doctype to an HTML handler @param doctype the public doctype to set @see XSLOutputAttributes#setDoctypePublic(String) 
public	TokenNamepublic	
void	TokenNamevoid	
setDoctypePublic	TokenNameIdentifier	 set Doctype Public
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
doctype	TokenNameIdentifier	 doctype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setDoctypePublic	TokenNameIdentifier	 set Doctype Public
(	TokenNameLPAREN	
doctype	TokenNameIdentifier	 doctype
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_setDoctypePublic_called	TokenNameIdentifier	 m set Doctype Public called
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the doctype in the underlying XML handler. Remember that this method * was called, just in case we need to transfer this doctype to an HTML handler * @param doctype the system doctype to set * @see XSLOutputAttributes#setDoctypeSystem(String) */	TokenNameCOMMENT_JAVADOC	 Set the doctype in the underlying XML handler. Remember that this method was called, just in case we need to transfer this doctype to an HTML handler @param doctype the system doctype to set @see XSLOutputAttributes#setDoctypeSystem(String) 
public	TokenNamepublic	
void	TokenNamevoid	
setDoctypeSystem	TokenNameIdentifier	 set Doctype System
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
doctype	TokenNameIdentifier	 doctype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setDoctypeSystem	TokenNameIdentifier	 set Doctype System
(	TokenNameLPAREN	
doctype	TokenNameIdentifier	 doctype
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_setDoctypeSystem_called	TokenNameIdentifier	 m set Doctype System called
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see XSLOutputAttributes#setEncoding(String) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see XSLOutputAttributes#setEncoding(String) 
public	TokenNamepublic	
void	TokenNamevoid	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see XSLOutputAttributes#setIndent(boolean) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see XSLOutputAttributes#setIndent(boolean) 
public	TokenNamepublic	
void	TokenNamevoid	
setIndent	TokenNameIdentifier	 set Indent
(	TokenNameLPAREN	
boolean	TokenNameboolean	
indent	TokenNameIdentifier	 indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setIndent	TokenNameIdentifier	 set Indent
(	TokenNameLPAREN	
indent	TokenNameIdentifier	 indent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler 
public	TokenNamepublic	
void	TokenNamevoid	
setIndentAmount	TokenNameIdentifier	 set Indent Amount
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setIndentAmount	TokenNameIdentifier	 set Indent Amount
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#setMediaType(String) */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#setMediaType(String) 
public	TokenNamepublic	
void	TokenNamevoid	
setMediaType	TokenNameIdentifier	 set Media Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mediaType	TokenNameIdentifier	 media Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setMediaType	TokenNameIdentifier	 set Media Type
(	TokenNameLPAREN	
mediaType	TokenNameIdentifier	 media Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_setMediaType_called	TokenNameIdentifier	 m set Media Type called
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see XSLOutputAttributes#setOmitXMLDeclaration(boolean) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see XSLOutputAttributes#setOmitXMLDeclaration(boolean) 
public	TokenNamepublic	
void	TokenNamevoid	
setOmitXMLDeclaration	TokenNameIdentifier	 set Omit XML Declaration
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setOmitXMLDeclaration	TokenNameIdentifier	 set Omit XML Declaration
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see XSLOutputAttributes#setStandalone(String) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see XSLOutputAttributes#setStandalone(String) 
public	TokenNamepublic	
void	TokenNamevoid	
setStandalone	TokenNameIdentifier	 set Standalone
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
standalone	TokenNameIdentifier	 standalone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setStandalone	TokenNameIdentifier	 set Standalone
(	TokenNameLPAREN	
standalone	TokenNameIdentifier	 standalone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#setVersion(String) */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#setVersion(String) 
/** * Pass the call on to the underlying handler * @see org.xml.sax.ext.DeclHandler#attributeDecl(String, String, String, String, String) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ext.DeclHandler#attributeDecl(String, String, String, String, String) 
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
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
attributeDecl	TokenNameIdentifier	 attribute Decl
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
arg3	TokenNameIdentifier	 arg3
,	TokenNameCOMMA	
arg4	TokenNameIdentifier	 arg4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see org.xml.sax.ext.DeclHandler#elementDecl(String, String) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ext.DeclHandler#elementDecl(String, String) 
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
if	TokenNameif	
(	TokenNameLPAREN	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
emitFirstTag	TokenNameIdentifier	 emit First Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
elementDecl	TokenNameIdentifier	 element Decl
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see org.xml.sax.ext.DeclHandler#externalEntityDecl(String, String, String) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ext.DeclHandler#externalEntityDecl(String, String, String) 
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
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_handler	TokenNameIdentifier	 m handler
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
/** * Pass the call on to the underlying handler * @see org.xml.sax.ext.DeclHandler#internalEntityDecl(String, String) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ext.DeclHandler#internalEntityDecl(String, String) 
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
if	TokenNameif	
(	TokenNameLPAREN	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
internalEntityDecl	TokenNameIdentifier	 internal Entity Decl
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see org.xml.sax.ContentHandler#characters(char[], int, int) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ContentHandler#characters(char[], int, int) 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
characters	TokenNameIdentifier	 characters
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
characters	TokenNameIdentifier	 characters
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see org.xml.sax.ContentHandler#endDocument() */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ContentHandler#endDocument() 
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see org.xml.sax.ContentHandler#endElement(String, String, String) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ContentHandler#endElement(String, String, String) 
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
if	TokenNameif	
(	TokenNameLPAREN	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_firstElementURI	TokenNameIdentifier	 m first Element URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
m_firstElementURI	TokenNameIdentifier	 m first Element URI
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_firstElementLocalName	TokenNameIdentifier	 m first Element Local Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
m_firstElementLocalName	TokenNameIdentifier	 m first Element Local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_handler	TokenNameIdentifier	 m handler
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
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see org.xml.sax.ContentHandler#endPrefixMapping(String) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ContentHandler#endPrefixMapping(String) 
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
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see org.xml.sax.ContentHandler#ignorableWhitespace(char[], int, int) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ContentHandler#ignorableWhitespace(char[], int, int) 
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
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
if	TokenNameif	
(	TokenNameLPAREN	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_handler	TokenNameIdentifier	 m handler
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
/** * Pass the call on to the underlying handler * @see org.xml.sax.ContentHandler#processingInstruction(String, String) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ContentHandler#processingInstruction(String, String) 
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
if	TokenNameif	
(	TokenNameLPAREN	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see org.xml.sax.ContentHandler#setDocumentLocator(Locator) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ContentHandler#setDocumentLocator(Locator) 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see org.xml.sax.ContentHandler#skippedEntity(String) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ContentHandler#skippedEntity(String) 
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
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
skippedEntity	TokenNameIdentifier	 skipped Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see org.xml.sax.ext.LexicalHandler#comment(char[], int, int) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ext.LexicalHandler#comment(char[], int, int) 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
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
if	TokenNameif	
(	TokenNameLPAREN	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_handler	TokenNameIdentifier	 m handler
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
/** * Pass the call on to the underlying handler * @see org.xml.sax.ext.LexicalHandler#endCDATA() */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ext.LexicalHandler#endCDATA() 
public	TokenNamepublic	
void	TokenNamevoid	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see org.xml.sax.ext.LexicalHandler#endDTD() */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ext.LexicalHandler#endDTD() 
public	TokenNamepublic	
void	TokenNamevoid	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see org.xml.sax.ext.LexicalHandler#endEntity(String) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ext.LexicalHandler#endEntity(String) 
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
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
emitFirstTag	TokenNameIdentifier	 emit First Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see org.xml.sax.ext.LexicalHandler#startCDATA() */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ext.LexicalHandler#startCDATA() 
public	TokenNamepublic	
void	TokenNamevoid	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass the call on to the underlying handler * @see org.xml.sax.ext.LexicalHandler#startDTD(String, String, String) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ext.LexicalHandler#startDTD(String, String, String) 
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
m_handler	TokenNameIdentifier	 m handler
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
/** * Pass the call on to the underlying handler * @see org.xml.sax.ext.LexicalHandler#startEntity(String) */	TokenNameCOMMENT_JAVADOC	 Pass the call on to the underlying handler @see org.xml.sax.ext.LexicalHandler#startEntity(String) 
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
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize the wrapped output stream (XML or HTML). * If the stream handler should be HTML, then replace the XML handler with * an HTML handler. After than send the starting method calls that were cached * to the wrapped handler. * */	TokenNameCOMMENT_JAVADOC	 Initialize the wrapped output stream (XML or HTML). If the stream handler should be HTML, then replace the XML handler with an HTML handler. After than send the starting method calls that were cached to the wrapped handler. 
private	TokenNameprivate	
void	TokenNamevoid	
initStreamOutput	TokenNameIdentifier	 init Stream Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// Try to rule out if this is an not to be an HTML document based on prefix 	TokenNameCOMMENT_LINE	Try to rule out if this is an not to be an HTML document based on prefix 
boolean	TokenNameboolean	
firstElementIsHTML	TokenNameIdentifier	 first Element Is HTML
=	TokenNameEQUAL	
isFirstElemHTML	TokenNameIdentifier	 is First Elem HTML
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
firstElementIsHTML	TokenNameIdentifier	 first Element Is HTML
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create an HTML output handler, and initialize it 	TokenNameCOMMENT_LINE	create an HTML output handler, and initialize it 
// keep a reference to the old handler, ... it will soon be gone 	TokenNameCOMMENT_LINE	keep a reference to the old handler, ... it will soon be gone 
SerializationHandler	TokenNameIdentifier	 Serialization Handler
oldHandler	TokenNameIdentifier	 old Handler
=	TokenNameEQUAL	
m_handler	TokenNameIdentifier	 m handler
;	TokenNameSEMICOLON	
/* We have to make sure we get an output properties with the proper * defaults for the HTML method. The easiest way to do this is to * have the OutputProperties class do it. */	TokenNameCOMMENT_BLOCK	 We have to make sure we get an output properties with the proper defaults for the HTML method. The easiest way to do this is to have the OutputProperties class do it. 
Properties	TokenNameIdentifier	 Properties
htmlProperties	TokenNameIdentifier	 html Properties
=	TokenNameEQUAL	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
getDefaultMethodProperties	TokenNameIdentifier	 get Default Method Properties
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
HTML	TokenNameIdentifier	 HTML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Serializer	TokenNameIdentifier	 Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
.	TokenNameDOT	
getSerializer	TokenNameIdentifier	 get Serializer
(	TokenNameLPAREN	
htmlProperties	TokenNameIdentifier	 html Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The factory should be returning a ToStream 	TokenNameCOMMENT_LINE	The factory should be returning a ToStream 
// Don't know what to do if it doesn't 	TokenNameCOMMENT_LINE	Don't know what to do if it doesn't 
// i.e. the user has over-ridden the content-handler property 	TokenNameCOMMENT_LINE	i.e. the user has over-ridden the content-handler property 
// for html 	TokenNameCOMMENT_LINE	for html 
m_handler	TokenNameIdentifier	 m handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
)	TokenNameRPAREN	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
//m_handler = new ToHTMLStream(); 	TokenNameCOMMENT_LINE	m_handler = new ToHTMLStream(); 
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
oldHandler	TokenNameIdentifier	 old Handler
.	TokenNameDOT	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
oldHandler	TokenNameIdentifier	 old Handler
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// need to copy things from the old handler to the new one here 	TokenNameCOMMENT_LINE	need to copy things from the old handler to the new one here 
// if (_setVersion_called) 	TokenNameCOMMENT_LINE	if (_setVersion_called) 
// { 	TokenNameCOMMENT_LINE	{ 
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
oldHandler	TokenNameIdentifier	 old Handler
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// } 	TokenNameCOMMENT_LINE	} 
// if (_setDoctypeSystem_called) 	TokenNameCOMMENT_LINE	if (_setDoctypeSystem_called) 
// { 	TokenNameCOMMENT_LINE	{ 
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setDoctypeSystem	TokenNameIdentifier	 set Doctype System
(	TokenNameLPAREN	
oldHandler	TokenNameIdentifier	 old Handler
.	TokenNameDOT	
getDoctypeSystem	TokenNameIdentifier	 get Doctype System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// } 	TokenNameCOMMENT_LINE	} 
// if (_setDoctypePublic_called) 	TokenNameCOMMENT_LINE	if (_setDoctypePublic_called) 
// { 	TokenNameCOMMENT_LINE	{ 
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setDoctypePublic	TokenNameIdentifier	 set Doctype Public
(	TokenNameLPAREN	
oldHandler	TokenNameIdentifier	 old Handler
.	TokenNameDOT	
getDoctypePublic	TokenNameIdentifier	 get Doctype Public
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// } 	TokenNameCOMMENT_LINE	} 
// if (_setMediaType_called) 	TokenNameCOMMENT_LINE	if (_setMediaType_called) 
// { 	TokenNameCOMMENT_LINE	{ 
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setMediaType	TokenNameIdentifier	 set Media Type
(	TokenNameLPAREN	
oldHandler	TokenNameIdentifier	 old Handler
.	TokenNameDOT	
getMediaType	TokenNameIdentifier	 get Media Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// } 	TokenNameCOMMENT_LINE	} 
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setTransformer	TokenNameIdentifier	 set Transformer
(	TokenNameLPAREN	
oldHandler	TokenNameIdentifier	 old Handler
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Now that we have a real wrapped handler (XML or HTML) lets * pass any cached calls to it */	TokenNameCOMMENT_BLOCK	 Now that we have a real wrapped handler (XML or HTML) lets pass any cached calls to it 
// Call startDocument() if necessary 	TokenNameCOMMENT_LINE	Call startDocument() if necessary 
if	TokenNameif	
(	TokenNameLPAREN	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// the wrapped handler is now fully initialized 	TokenNameCOMMENT_LINE	the wrapped handler is now fully initialized 
m_wrapped_handler_not_initialized	TokenNameIdentifier	 m wrapped handler not initialized
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
emitFirstTag	TokenNameIdentifier	 emit First Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstElementName	TokenNameIdentifier	 m first Element Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_wrapped_handler_not_initialized	TokenNameIdentifier	 m wrapped handler not initialized
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initStreamOutput	TokenNameIdentifier	 init Stream Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_wrapped_handler_not_initialized	TokenNameIdentifier	 m wrapped handler not initialized
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Output first tag 	TokenNameCOMMENT_LINE	Output first tag 
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
m_firstElementURI	TokenNameIdentifier	 m first Element URI
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
m_firstElementName	TokenNameIdentifier	 m first Element Name
,	TokenNameCOMMA	
m_attributes	TokenNameIdentifier	 m attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// don't need the collected attributes of the first element anymore. 	TokenNameCOMMENT_LINE	don't need the collected attributes of the first element anymore. 
m_attributes	TokenNameIdentifier	 m attributes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Output namespaces of first tag 	TokenNameCOMMENT_LINE	Output namespaces of first tag 
if	TokenNameif	
(	TokenNameLPAREN	
m_namespacePrefix	TokenNameIdentifier	 m namespace Prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_namespacePrefix	TokenNameIdentifier	 m namespace Prefix
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_namespacePrefix	TokenNameIdentifier	 m namespace Prefix
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_namespaceURI	TokenNameIdentifier	 m namespace URI
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
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
m_namespacePrefix	TokenNameIdentifier	 m namespace Prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_namespaceURI	TokenNameIdentifier	 m namespace URI
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Utility function for calls to local-name(). * * Don't want to override static function on SerializerBase * So added Unknown suffix to method name. */	TokenNameCOMMENT_JAVADOC	 Utility function for calls to local-name(). * Don't want to override static function on SerializerBase So added Unknown suffix to method name. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getLocalNameUnknown	TokenNameIdentifier	 get Local Name Unknown
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'@'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Utility function to return prefix * * Don't want to override static function on SerializerBase * So added Unknown suffix to method name. */	TokenNameCOMMENT_JAVADOC	 Utility function to return prefix * Don't want to override static function on SerializerBase So added Unknown suffix to method name. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getPrefixPartUnknown	TokenNameIdentifier	 get Prefix Part Unknown
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine if the firts element in the document is <html> or <HTML> * This uses the cached first element name, first element prefix and the * cached namespaces from previous method calls * * @return true if the first element is an opening <html> tag */	TokenNameCOMMENT_JAVADOC	 Determine if the firts element in the document is <html> or <HTML> This uses the cached first element name, first element prefix and the cached namespaces from previous method calls * @return true if the first element is an opening <html> tag 
private	TokenNameprivate	
boolean	TokenNameboolean	
isFirstElemHTML	TokenNameIdentifier	 is First Elem HTML
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isHTML	TokenNameIdentifier	 is HTML
;	TokenNameSEMICOLON	
// is the first tag html, not considering the prefix ? 	TokenNameCOMMENT_LINE	is the first tag html, not considering the prefix ? 
isHTML	TokenNameIdentifier	 is HTML
=	TokenNameEQUAL	
getLocalNameUnknown	TokenNameIdentifier	 get Local Name Unknown
(	TokenNameLPAREN	
m_firstElementName	TokenNameIdentifier	 m first Element Name
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"html"	TokenNameStringLiteral	html
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Try to rule out if this is not to be an HTML document based on URI 	TokenNameCOMMENT_LINE	Try to rule out if this is not to be an HTML document based on URI 
if	TokenNameif	
(	TokenNameLPAREN	
isHTML	TokenNameIdentifier	 is HTML
&&	TokenNameAND_AND	
m_firstElementURI	TokenNameIdentifier	 m first Element URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
m_firstElementURI	TokenNameIdentifier	 m first Element URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the <html> element has a non-trivial namespace 	TokenNameCOMMENT_LINE	the <html> element has a non-trivial namespace 
isHTML	TokenNameIdentifier	 is HTML
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Try to rule out if this is an not to be an HTML document based on prefix 	TokenNameCOMMENT_LINE	Try to rule out if this is an not to be an HTML document based on prefix 
if	TokenNameif	
(	TokenNameLPAREN	
isHTML	TokenNameIdentifier	 is HTML
&&	TokenNameAND_AND	
m_namespacePrefix	TokenNameIdentifier	 m namespace Prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* the first element has a name of "html", but lets check the prefix. * If the prefix points to a namespace with a URL that is not "" * then the doecument doesn't start with an <html> tag, and isn't html */	TokenNameCOMMENT_BLOCK	 the first element has a name of "html", but lets check the prefix. If the prefix points to a namespace with a URL that is not "" then the doecument doesn't start with an <html> tag, and isn't html 
final	TokenNamefinal	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
m_namespacePrefix	TokenNameIdentifier	 m namespace Prefix
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_namespacePrefix	TokenNameIdentifier	 m namespace Prefix
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_namespaceURI	TokenNameIdentifier	 m namespace URI
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstElementPrefix	TokenNameIdentifier	 m first Element Prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_firstElementPrefix	TokenNameIdentifier	 m first Element Prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The first element has a prefix, so it can't be <html> 	TokenNameCOMMENT_LINE	The first element has a prefix, so it can't be <html> 
isHTML	TokenNameIdentifier	 is HTML
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
isHTML	TokenNameIdentifier	 is HTML
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see Serializer#asDOMSerializer() */	TokenNameCOMMENT_JAVADOC	 @see Serializer#asDOMSerializer() 
public	TokenNamepublic	
DOMSerializer	TokenNameIdentifier	 DOM Serializer
asDOMSerializer	TokenNameIdentifier	 as DOM Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
asDOMSerializer	TokenNameIdentifier	 as DOM Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param URI_and_localNames Vector a list of pairs of URI/localName * specified in the cdata-section-elements attribute. * @see SerializationHandler#setCdataSectionElements(java.util.Vector) */	TokenNameCOMMENT_JAVADOC	 @param URI_and_localNames Vector a list of pairs of URI/localName specified in the cdata-section-elements attribute. @see SerializationHandler#setCdataSectionElements(java.util.Vector) 
public	TokenNamepublic	
void	TokenNamevoid	
setCdataSectionElements	TokenNameIdentifier	 set Cdata Section Elements
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
URI_and_localNames	TokenNameIdentifier	 URI and local Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setCdataSectionElements	TokenNameIdentifier	 set Cdata Section Elements
(	TokenNameLPAREN	
URI_and_localNames	TokenNameIdentifier	 URI and local Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#addAttributes(org.xml.sax.Attributes) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#addAttributes(org.xml.sax.Attributes) 
public	TokenNamepublic	
void	TokenNamevoid	
addAttributes	TokenNameIdentifier	 add Attributes
(	TokenNameLPAREN	
Attributes	TokenNameIdentifier	 Attributes
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
addAttributes	TokenNameIdentifier	 add Attributes
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current namespace mappings. * Simply returns the mappings of the wrapped handler. * @see ExtendedContentHandler#getNamespaceMappings() */	TokenNameCOMMENT_JAVADOC	 Get the current namespace mappings. Simply returns the mappings of the wrapped handler. @see ExtendedContentHandler#getNamespaceMappings() 
public	TokenNamepublic	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
getNamespaceMappings	TokenNameIdentifier	 get Namespace Mappings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
mappings	TokenNameIdentifier	 mappings
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_handler	TokenNameIdentifier	 m handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mappings	TokenNameIdentifier	 mappings
=	TokenNameEQUAL	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
getNamespaceMappings	TokenNameIdentifier	 get Namespace Mappings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
mappings	TokenNameIdentifier	 mappings
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#flushPending() */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#flushPending() 
public	TokenNamepublic	
void	TokenNamevoid	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstTagNotEmitted	TokenNameIdentifier	 m first Tag Not Emitted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
emitFirstTag	TokenNameIdentifier	 emit First Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#getPrefix */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#getPrefix 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#entityReference(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#entityReference(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
entityReference	TokenNameIdentifier	 entity Reference
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
entityName	TokenNameIdentifier	 entity Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
entityReference	TokenNameIdentifier	 entity Reference
(	TokenNameLPAREN	
entityName	TokenNameIdentifier	 entity Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#getNamespaceURI(java.lang.String, boolean) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#getNamespaceURI(java.lang.String, boolean) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isElement	TokenNameIdentifier	 is Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
isElement	TokenNameIdentifier	 is Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURIFromPrefix	TokenNameIdentifier	 get Namespace URI From Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
getNamespaceURIFromPrefix	TokenNameIdentifier	 get Namespace URI From Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTransformer	TokenNameIdentifier	 set Transformer
(	TokenNameLPAREN	
Transformer	TokenNameIdentifier	 Transformer
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setTransformer	TokenNameIdentifier	 set Transformer
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
instanceof	TokenNameinstanceof	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
.	TokenNameDOT	
hasTraceListeners	TokenNameIdentifier	 has Trace Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_tracer	TokenNameIdentifier	 m tracer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_tracer	TokenNameIdentifier	 m tracer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Transformer	TokenNameIdentifier	 Transformer
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#setContentHandler(org.xml.sax.ContentHandler) */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#setContentHandler(org.xml.sax.ContentHandler) 
public	TokenNamepublic	
void	TokenNamevoid	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is used to set the source locator, which might be used to * generated an error message. * @param locator the source locator * * @see ExtendedContentHandler#setSourceLocator(javax.xml.transform.SourceLocator) */	TokenNameCOMMENT_JAVADOC	 This method is used to set the source locator, which might be used to generated an error message. @param locator the source locator * @see ExtendedContentHandler#setSourceLocator(javax.xml.transform.SourceLocator) 
public	TokenNamepublic	
void	TokenNamevoid	
setSourceLocator	TokenNameIdentifier	 set Source Locator
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
setSourceLocator	TokenNameIdentifier	 set Source Locator
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
firePseudoElement	TokenNameIdentifier	 fire Pseudo Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// convert the StringBuffer to a char array and 	TokenNameCOMMENT_LINE	convert the StringBuffer to a char array and 
// emit the trace event that these characters "might" 	TokenNameCOMMENT_LINE	emit the trace event that these characters "might" 
// be written 	TokenNameCOMMENT_LINE	be written 
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_tracer	TokenNameIdentifier	 m tracer
.	TokenNameDOT	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_OUTPUT_PSEUDO_CHARACTERS	TokenNameIdentifier	 EVENTTYPE  OUTPUT  PSEUDO  CHARACTERS
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see org.apache.xml.serializer.Serializer#asDOM3Serializer() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xml.serializer.Serializer#asDOM3Serializer() 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
asDOM3Serializer	TokenNameIdentifier	 as DO M3 Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
asDOM3Serializer	TokenNameIdentifier	 as DO M3 Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
