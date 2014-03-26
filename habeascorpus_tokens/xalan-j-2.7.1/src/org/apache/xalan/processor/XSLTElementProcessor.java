/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XSLTElementProcessor.java 469688 2006-10-31 22:39:43Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XSLTElementProcessor.java 469688 2006-10-31 22:39:43Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
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
List	TokenNameIdentifier	 List
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
TransformerException	TokenNameIdentifier	 Transformer Exception
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
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
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
IntStack	TokenNameIdentifier	 Int Stack
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
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
AttributesImpl	TokenNameIdentifier	 Attributes Impl
;	TokenNameSEMICOLON	
/** * This class acts as the superclass for all stylesheet element * processors, and deals with things that are common to all elements. * @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> */	TokenNameCOMMENT_JAVADOC	 This class acts as the superclass for all stylesheet element processors, and deals with things that are common to all elements. @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> 
public	TokenNamepublic	
class	TokenNameclass	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
5597421564955304421L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Construct a processor for top-level elements. * @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> */	TokenNameCOMMENT_JAVADOC	 Construct a processor for top-level elements. @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> 
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
IntStack	TokenNameIdentifier	 Int Stack
m_savedLastOrder	TokenNameIdentifier	 m saved Last Order
;	TokenNameSEMICOLON	
/** * The element definition that this processor conforms to. */	TokenNameCOMMENT_JAVADOC	 The element definition that this processor conforms to. 
private	TokenNameprivate	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
m_elemDef	TokenNameIdentifier	 m elem Def
;	TokenNameSEMICOLON	
/** * Get the element definition that belongs to this element. * * @return The element definition object that produced and constrains this element. */	TokenNameCOMMENT_JAVADOC	 Get the element definition that belongs to this element. * @return The element definition object that produced and constrains this element. 
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
getElemDef	TokenNameIdentifier	 get Elem Def
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_elemDef	TokenNameIdentifier	 m elem Def
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the element definition that belongs to this element. * * @param def The element definition object that produced and constrains this element. */	TokenNameCOMMENT_JAVADOC	 Set the element definition that belongs to this element. * @param def The element definition object that produced and constrains this element. 
void	TokenNamevoid	
setElemDef	TokenNameIdentifier	 set Elem Def
(	TokenNameLPAREN	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
def	TokenNameIdentifier	 def
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_elemDef	TokenNameIdentifier	 m elem Def
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resolve an external entity. * * * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. * @param publicId The public identifer, or null if none is * available. * @param systemId The system identifier provided in the XML * document. * @return The new input source, or null to require the * default behaviour. */	TokenNameCOMMENT_JAVADOC	 Resolve an external entity. * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. @param publicId The public identifer, or null if none is available. @param systemId The system identifier provided in the XML document. @return The new input source, or null to require the default behaviour. 
public	TokenNamepublic	
InputSource	TokenNameIdentifier	 Input Source
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
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
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a notation declaration. * * * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. * @param name The notation name. * @param publicId The notation public identifier, or null if not * available. * @param systemId The notation system identifier. * @see org.xml.sax.DTDHandler#notationDecl */	TokenNameCOMMENT_JAVADOC	 Receive notification of a notation declaration. * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. @param name The notation name. @param publicId The notation public identifier, or null if not available. @param systemId The notation system identifier. @see org.xml.sax.DTDHandler#notationDecl 
public	TokenNamepublic	
void	TokenNamevoid	
notationDecl	TokenNameIdentifier	 notation Decl
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no op 	TokenNameCOMMENT_LINE	no op 
}	TokenNameRBRACE	
/** * Receive notification of an unparsed entity declaration. * * * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. * @param name The entity name. * @param publicId The entity public identifier, or null if not * available. * @param systemId The entity system identifier. * @param notationName The name of the associated notation. * @see org.xml.sax.DTDHandler#unparsedEntityDecl */	TokenNameCOMMENT_JAVADOC	 Receive notification of an unparsed entity declaration. * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. @param name The entity name. @param publicId The entity public identifier, or null if not available. @param systemId The entity system identifier. @param notationName The name of the associated notation. @see org.xml.sax.DTDHandler#unparsedEntityDecl 
public	TokenNamepublic	
void	TokenNamevoid	
unparsedEntityDecl	TokenNameIdentifier	 unparsed Entity Decl
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
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
{	TokenNameLBRACE	
// no op 	TokenNameCOMMENT_LINE	no op 
}	TokenNameRBRACE	
/** * Receive notification of the start of the non-text event. This * is sent to the current processor when any non-text event occurs. * * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. */	TokenNameCOMMENT_JAVADOC	 Receive notification of the start of the non-text event. This is sent to the current processor when any non-text event occurs. * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. 
public	TokenNamepublic	
void	TokenNamevoid	
startNonText	TokenNameIdentifier	 start Non Text
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
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
// no op 	TokenNameCOMMENT_LINE	no op 
}	TokenNameRBRACE	
/** * Receive notification of the start of an element. * * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. * @param uri The Namespace URI, or an empty string. * @param localName The local name (without prefix), or empty string if not namespace processing. * @param rawName The qualified name (with prefix). * @param attributes The specified or defaulted attributes. */	TokenNameCOMMENT_JAVADOC	 Receive notification of the start of an element. * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. @param uri The Namespace URI, or an empty string. @param localName The local name (without prefix), or empty string if not namespace processing. @param rawName The qualified name (with prefix). @param attributes The specified or defaulted attributes. 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
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
m_savedLastOrder	TokenNameIdentifier	 m saved Last Order
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_savedLastOrder	TokenNameIdentifier	 m saved Last Order
=	TokenNameEQUAL	
new	TokenNamenew	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_savedLastOrder	TokenNameIdentifier	 m saved Last Order
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
getElemDef	TokenNameIdentifier	 get Elem Def
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLastOrder	TokenNameIdentifier	 get Last Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getElemDef	TokenNameIdentifier	 get Elem Def
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLastOrder	TokenNameIdentifier	 set Last Order
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the end of an element. * * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. * @param uri The Namespace URI, or an empty string. * @param localName The local name (without prefix), or empty string if not namespace processing. * @param rawName The qualified name (with prefix). */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of an element. * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. @param uri The Namespace URI, or an empty string. @param localName The local name (without prefix), or empty string if not namespace processing. @param rawName The qualified name (with prefix). 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
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
m_savedLastOrder	TokenNameIdentifier	 m saved Last Order
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
m_savedLastOrder	TokenNameIdentifier	 m saved Last Order
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
getElemDef	TokenNameIdentifier	 get Elem Def
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLastOrder	TokenNameIdentifier	 set Last Order
(	TokenNameLPAREN	
m_savedLastOrder	TokenNameIdentifier	 m saved Last Order
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getElemDef	TokenNameIdentifier	 get Elem Def
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRequiredFound	TokenNameIdentifier	 get Required Found
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_REQUIRED_ELEM_NOT_FOUND	TokenNameIdentifier	 ER  REQUIRED  ELEM  NOT  FOUND
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
getElemDef	TokenNameIdentifier	 get Elem Def
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRequiredElem	TokenNameIdentifier	 get Required Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of character data inside an element. * * * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. * @param ch The characters. * @param start The start position in the character array. * @param length The number of characters to use from the * character array. */	TokenNameCOMMENT_JAVADOC	 Receive notification of character data inside an element. * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. @param ch The characters. @param start The start position in the character array. @param length The number of characters to use from the character array. 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_CHARS_NOT_ALLOWED	TokenNameIdentifier	 ER  CHARS  NOT  ALLOWED
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Characters are not allowed at this point in the document!", 	TokenNameCOMMENT_LINE	"Characters are not allowed at this point in the document!", 
//null); 	TokenNameCOMMENT_LINE	null); 
}	TokenNameRBRACE	
/** * Receive notification of ignorable whitespace in element content. * * * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. * @param ch The whitespace characters. * @param start The start position in the character array. * @param length The number of characters to use from the * character array. */	TokenNameCOMMENT_JAVADOC	 Receive notification of ignorable whitespace in element content. * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. @param ch The whitespace characters. @param start The start position in the character array. @param length The number of characters to use from the character array. 
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// no op 	TokenNameCOMMENT_LINE	no op 
}	TokenNameRBRACE	
/** * Receive notification of a processing instruction. * * * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. * @param target The processing instruction target. * @param data The processing instruction data, or null if * none is supplied. */	TokenNameCOMMENT_JAVADOC	 Receive notification of a processing instruction. * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. @param target The processing instruction target. @param data The processing instruction data, or null if none is supplied. 
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
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
// no op 	TokenNameCOMMENT_LINE	no op 
}	TokenNameRBRACE	
/** * Receive notification of a skipped entity. * * * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. * @param name The name of the skipped entity. */	TokenNameCOMMENT_JAVADOC	 Receive notification of a skipped entity. * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. @param name The name of the skipped entity. 
public	TokenNamepublic	
void	TokenNamevoid	
skippedEntity	TokenNameIdentifier	 skipped Entity
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
// no op 	TokenNameCOMMENT_LINE	no op 
}	TokenNameRBRACE	
/** * Set the properties of an object from the given attribute list. * @param handler The stylesheet's Content handler, needed for * error reporting. * @param rawName The raw name of the owner element, needed for * error reporting. * @param attributes The list of attributes. * @param target The target element where the properties will be set. */	TokenNameCOMMENT_JAVADOC	 Set the properties of an object from the given attribute list. @param handler The stylesheet's Content handler, needed for error reporting. @param rawName The raw name of the owner element, needed for error reporting. @param attributes The list of attributes. @param target The target element where the properties will be set. 
void	TokenNamevoid	
setPropertiesFromAttributes	TokenNameIdentifier	 set Properties From Attributes
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
target	TokenNameIdentifier	 target
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
setPropertiesFromAttributes	TokenNameIdentifier	 set Properties From Attributes
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the properties of an object from the given attribute list. * @param handler The stylesheet's Content handler, needed for * error reporting. * @param rawName The raw name of the owner element, needed for * error reporting. * @param attributes The list of attributes. * @param target The target element where the properties will be set. * @param throwError True if it should throw an error if an * attribute is not defined. * @return the attributes not allowed on this element. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Set the properties of an object from the given attribute list. @param handler The stylesheet's Content handler, needed for error reporting. @param rawName The raw name of the owner element, needed for error reporting. @param attributes The list of attributes. @param target The target element where the properties will be set. @param throwError True if it should throw an error if an attribute is not defined. @return the attributes not allowed on this element. * @throws TransformerException 
Attributes	TokenNameIdentifier	 Attributes
setPropertiesFromAttributes	TokenNameIdentifier	 set Properties From Attributes
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
boolean	TokenNameboolean	
throwError	TokenNameIdentifier	 throw Error
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
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
def	TokenNameIdentifier	 def
=	TokenNameEQUAL	
getElemDef	TokenNameIdentifier	 get Elem Def
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AttributesImpl	TokenNameIdentifier	 Attributes Impl
undefines	TokenNameIdentifier	 undefines
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isCompatibleMode	TokenNameIdentifier	 is Compatible Mode
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCompatibleMode	TokenNameIdentifier	 get Compatible Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
throwError	TokenNameIdentifier	 throw Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isCompatibleMode	TokenNameIdentifier	 is Compatible Mode
)	TokenNameRPAREN	
undefines	TokenNameIdentifier	 undefines
=	TokenNameEQUAL	
new	TokenNamenew	
AttributesImpl	TokenNameIdentifier	 Attributes Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Keep track of which XSLTAttributeDefs have been processed, so 	TokenNameCOMMENT_LINE	Keep track of which XSLTAttributeDefs have been processed, so 
// I can see which default values need to be set. 	TokenNameCOMMENT_LINE	I can see which default values need to be set. 
List	TokenNameIdentifier	 List
processedDefs	TokenNameIdentifier	 processed Defs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Keep track of XSLTAttributeDefs that were invalid 	TokenNameCOMMENT_LINE	Keep track of XSLTAttributeDefs that were invalid 
List	TokenNameIdentifier	 List
errorDefs	TokenNameIdentifier	 error Defs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nAttrs	TokenNameIdentifier	 n Attrs
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
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
nAttrs	TokenNameIdentifier	 n Attrs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
attrUri	TokenNameIdentifier	 attr Uri
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Hack for Crimson. -sb 	TokenNameCOMMENT_LINE	Hack for Crimson. -sb 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
attrUri	TokenNameIdentifier	 attr Uri
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
attrUri	TokenNameIdentifier	 attr Uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"xmlns:"	TokenNameStringLiteral	xmlns:
)	TokenNameRPAREN	
||	TokenNameOR_OR	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attrUri	TokenNameIdentifier	 attr Uri
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_XMLNAMESPACEURI	TokenNameIdentifier	 S  XMLNAMESPACEURI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
attrLocalName	TokenNameIdentifier	 attr Local Name
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSLTAttributeDef	TokenNameIdentifier	 XSLT Attribute Def
attrDef	TokenNameIdentifier	 attr Def
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getAttributeDef	TokenNameIdentifier	 get Attribute Def
(	TokenNameLPAREN	
attrUri	TokenNameIdentifier	 attr Uri
,	TokenNameCOMMA	
attrLocalName	TokenNameIdentifier	 attr Local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
attrDef	TokenNameIdentifier	 attr Def
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isCompatibleMode	TokenNameIdentifier	 is Compatible Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Then barf, because this element does not allow this attribute. 	TokenNameCOMMENT_LINE	Then barf, because this element does not allow this attribute. 
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_ATTR_NOT_ALLOWED	TokenNameIdentifier	 ER  ATTR  NOT  ALLOWED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
}	TokenNameRBRACE	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"\""+attributes.getQName(i)+"\"" 	TokenNameCOMMENT_LINE	"\""+attributes.getQName(i)+"\"" 
//+ " attribute is not allowed on the " + rawName 	TokenNameCOMMENT_LINE	+ " attribute is not allowed on the " + rawName 
// + " element!", null); 	TokenNameCOMMENT_LINE	+ " element!", null); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
undefines	TokenNameIdentifier	 undefines
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
attrUri	TokenNameIdentifier	 attr Uri
,	TokenNameCOMMA	
attrLocalName	TokenNameIdentifier	 attr Local Name
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Can we switch the order here: 	TokenNameCOMMENT_LINE	Can we switch the order here: 
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
attrDef	TokenNameIdentifier	 attr Def
.	TokenNameDOT	
setAttrValue	TokenNameIdentifier	 set Attr Value
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
attrUri	TokenNameIdentifier	 attr Uri
,	TokenNameCOMMA	
attrLocalName	TokenNameIdentifier	 attr Local Name
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now we only add the element if it passed a validation check 	TokenNameCOMMENT_LINE	Now we only add the element if it passed a validation check 
if	TokenNameif	
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
processedDefs	TokenNameIdentifier	 processed Defs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
attrDef	TokenNameIdentifier	 attr Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
errorDefs	TokenNameIdentifier	 error Defs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
attrDef	TokenNameIdentifier	 attr Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
XSLTAttributeDef	TokenNameIdentifier	 XSLT Attribute Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attrDefs	TokenNameIdentifier	 attr Defs
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nAttrDefs	TokenNameIdentifier	 n Attr Defs
=	TokenNameEQUAL	
attrDefs	TokenNameIdentifier	 attr Defs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
nAttrDefs	TokenNameIdentifier	 n Attr Defs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSLTAttributeDef	TokenNameIdentifier	 XSLT Attribute Def
attrDef	TokenNameIdentifier	 attr Def
=	TokenNameEQUAL	
attrDefs	TokenNameIdentifier	 attr Defs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
defVal	TokenNameIdentifier	 def Val
=	TokenNameEQUAL	
attrDef	TokenNameIdentifier	 attr Def
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
defVal	TokenNameIdentifier	 def Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
processedDefs	TokenNameIdentifier	 processed Defs
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
attrDef	TokenNameIdentifier	 attr Def
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attrDef	TokenNameIdentifier	 attr Def
.	TokenNameDOT	
setDefAttrValue	TokenNameIdentifier	 set Def Attr Value
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attrDef	TokenNameIdentifier	 attr Def
.	TokenNameDOT	
getRequired	TokenNameIdentifier	 get Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
!	TokenNameNOT	
processedDefs	TokenNameIdentifier	 processed Defs
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
attrDef	TokenNameIdentifier	 attr Def
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
errorDefs	TokenNameIdentifier	 error Defs
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
attrDef	TokenNameIdentifier	 attr Def
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_REQUIRES_ATTRIB	TokenNameIdentifier	 ER  REQUIRES  ATTRIB
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
attrDef	TokenNameIdentifier	 attr Def
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
undefines	TokenNameIdentifier	 undefines
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
