/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Sep 14, 2000: 	TokenNameCOMMENT_LINE	Sep 14, 2000: 
// Fixed serializer to report IO exception directly, instead at 	TokenNameCOMMENT_LINE	Fixed serializer to report IO exception directly, instead at 
// the end of document processing. 	TokenNameCOMMENT_LINE	the end of document processing. 
// Reported by Patrick Higgins <phiggins@transzap.com> 	TokenNameCOMMENT_LINE	Reported by Patrick Higgins <phiggins@transzap.com> 
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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
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
AttributeList	TokenNameIdentifier	 Attribute List
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
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * Implements a text serializer supporting both DOM and SAX * serializing. For usage instructions see {@link Serializer}. * <p> * If an output stream is used, the encoding is taken from the * output format (defaults to <tt>UTF-8</tt>). If a writer is * used, make sure the writer uses the same encoding (if applies) * as specified in the output format. * <p> * The serializer supports both DOM and SAX. DOM serializing is done * by calling {@link #serialize} and SAX serializing is done by firing * SAX events and using the serializer as a document handler. * <p> * If an I/O exception occurs while serializing, the serializer * will not throw an exception directly, but only throw it * at the end of serializing (either DOM or SAX's {@link * org.xml.sax.DocumentHandler#endDocument}. * * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended * that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation * API for XML (TrAX) for serializing XML and HTML. See the Xerces documentation for more * information. * @version $Revision: 476047 $ $Date: 2006-11-16 23:27:45 -0500 (Thu, 16 Nov 2006) $ * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> * @see Serializer */	TokenNameCOMMENT_JAVADOC	 Implements a text serializer supporting both DOM and SAX serializing. For usage instructions see {@link Serializer}. <p> If an output stream is used, the encoding is taken from the output format (defaults to <tt>UTF-8</tt>). If a writer is used, make sure the writer uses the same encoding (if applies) as specified in the output format. <p> The serializer supports both DOM and SAX. DOM serializing is done by calling {@link #serialize} and SAX serializing is done by firing SAX events and using the serializer as a document handler. <p> If an I/O exception occurs while serializing, the serializer will not throw an exception directly, but only throw it at the end of serializing (either DOM or SAX's {@link org.xml.sax.DocumentHandler#endDocument}. * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation API for XML (TrAX) for serializing XML and HTML. See the Xerces documentation for more information. @version $Revision: 476047 $ $Date: 2006-11-16 23:27:45 -0500 (Thu, 16 Nov 2006) $ @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> @see Serializer 
public	TokenNamepublic	
class	TokenNameclass	
TextSerializer	TokenNameIdentifier	 Text Serializer
extends	TokenNameextends	
BaseMarkupSerializer	TokenNameIdentifier	 Base Markup Serializer
{	TokenNameLBRACE	
/** * Constructs a new serializer. The serializer cannot be used without * calling {@link #setOutputCharStream} or {@link #setOutputByteStream} * first. */	TokenNameCOMMENT_JAVADOC	 Constructs a new serializer. The serializer cannot be used without calling {@link #setOutputCharStream} or {@link #setOutputByteStream} first. 
public	TokenNamepublic	
TextSerializer	TokenNameIdentifier	 Text Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
OutputFormat	TokenNameIdentifier	 Output Format
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
TEXT	TokenNameIdentifier	 TEXT
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
format	TokenNameIdentifier	 format
:	TokenNameCOLON	
new	TokenNamenew	
OutputFormat	TokenNameIdentifier	 Output Format
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
TEXT	TokenNameIdentifier	 TEXT
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-----------------------------------------// 	TokenNameCOMMENT_LINE	-----------------------------------------// 
// SAX content handler serializing methods // 	TokenNameCOMMENT_LINE	SAX content handler serializing methods // 
//-----------------------------------------// 	TokenNameCOMMENT_LINE	-----------------------------------------// 
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
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
rawName	TokenNameIdentifier	 raw Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
localName	TokenNameIdentifier	 local Name
:	TokenNameCOLON	
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
rawName	TokenNameIdentifier	 raw Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
localName	TokenNameIdentifier	 local Name
:	TokenNameCOLON	
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------// 	TokenNameCOMMENT_LINE	------------------------------------------// 
// SAX document handler serializing methods // 	TokenNameCOMMENT_LINE	SAX document handler serializing methods // 
//------------------------------000---------// 	TokenNameCOMMENT_LINE	------------------------------000---------// 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
AttributeList	TokenNameIdentifier	 Attribute List
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
preserveSpace	TokenNameIdentifier	 preserve Space
;	TokenNameSEMICOLON	
ElementState	TokenNameIdentifier	 Element State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
getElementState	TokenNameIdentifier	 get Element State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isDocumentState	TokenNameIdentifier	 is Document State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If this is the root element handle it differently. 	TokenNameCOMMENT_LINE	If this is the root element handle it differently. 
// If the first root element in the document, serialize 	TokenNameCOMMENT_LINE	If the first root element in the document, serialize 
// the document's DOCTYPE. Space preserving defaults 	TokenNameCOMMENT_LINE	the document's DOCTYPE. Space preserving defaults 
// to that of the output format. 	TokenNameCOMMENT_LINE	to that of the output format. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_started	TokenNameIdentifier	 started
)	TokenNameRPAREN	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// For any other element, if first in parent, then 	TokenNameCOMMENT_LINE	For any other element, if first in parent, then 
// use the parnet's space preserving. 	TokenNameCOMMENT_LINE	use the parnet's space preserving. 
preserveSpace	TokenNameIdentifier	 preserve Space
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
preserveSpace	TokenNameIdentifier	 preserve Space
;	TokenNameSEMICOLON	
// Do not change the current element state yet. 	TokenNameCOMMENT_LINE	Do not change the current element state yet. 
// This only happens in endElement(). 	TokenNameCOMMENT_LINE	This only happens in endElement(). 
// Ignore all other attributes of the element, only printing 	TokenNameCOMMENT_LINE	Ignore all other attributes of the element, only printing 
// its contents. 	TokenNameCOMMENT_LINE	its contents. 
// Now it's time to enter a new element state 	TokenNameCOMMENT_LINE	Now it's time to enter a new element state 
// with the tag name and space preserving. 	TokenNameCOMMENT_LINE	with the tag name and space preserving. 
// We still do not change the curent element state. 	TokenNameCOMMENT_LINE	We still do not change the curent element state. 
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
enterElementState	TokenNameIdentifier	 enter Element State
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
preserveSpace	TokenNameIdentifier	 preserve Space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
except	TokenNameIdentifier	 except
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
except	TokenNameIdentifier	 except
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
endElementIO	TokenNameIdentifier	 end Element IO
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
except	TokenNameIdentifier	 except
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
except	TokenNameIdentifier	 except
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endElementIO	TokenNameIdentifier	 end Element IO
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ElementState	TokenNameIdentifier	 Element State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
// Works much like content() with additions for closing 	TokenNameCOMMENT_LINE	Works much like content() with additions for closing 
// an element. Note the different checks for the closed 	TokenNameCOMMENT_LINE	an element. Note the different checks for the closed 
// element's state and the parent element's state. 	TokenNameCOMMENT_LINE	element's state and the parent element's state. 
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
getElementState	TokenNameIdentifier	 get Element State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Leave the element state and update that of the parent 	TokenNameCOMMENT_LINE	Leave the element state and update that of the parent 
// (if we're not root) to not empty and after element. 	TokenNameCOMMENT_LINE	(if we're not root) to not empty and after element. 
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
leaveElementState	TokenNameIdentifier	 leave Element State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterElement	TokenNameIdentifier	 after Element
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isDocumentState	TokenNameIdentifier	 is Document State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
processingInstructionIO	TokenNameIdentifier	 processing Instruction IO
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
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
ElementState	TokenNameIdentifier	 Element State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
content	TokenNameIdentifier	 content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
doCData	TokenNameIdentifier	 do C Data
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
inCData	TokenNameIdentifier	 in C Data
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
except	TokenNameIdentifier	 except
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
except	TokenNameIdentifier	 except
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
boolean	TokenNameboolean	
unescaped	TokenNameIdentifier	 unescaped
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ElementState	TokenNameIdentifier	 Element State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
content	TokenNameIdentifier	 content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
doCData	TokenNameIdentifier	 do C Data
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
inCData	TokenNameIdentifier	 in C Data
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------// 	TokenNameCOMMENT_LINE	------------------------------------------// 
// Generic node serializing methods methods // 	TokenNameCOMMENT_LINE	Generic node serializing methods methods // 
//------------------------------------------// 	TokenNameCOMMENT_LINE	------------------------------------------// 
/** * Called to serialize the document's DOCTYPE by the root element. * <p> * This method will check if it has not been called before ({@link #_started}), * will serialize the document type declaration, and will serialize all * pre-root comments and PIs that were accumulated in the document * (see {@link #serializePreRoot}). Pre-root will be serialized even if * this is not the first root element of the document. */	TokenNameCOMMENT_JAVADOC	 Called to serialize the document's DOCTYPE by the root element. <p> This method will check if it has not been called before ({@link #_started}), will serialize the document type declaration, and will serialize all pre-root comments and PIs that were accumulated in the document (see {@link #serializePreRoot}). Pre-root will be serialized even if this is not the first root element of the document. 
protected	TokenNameprotected	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rootTagName	TokenNameIdentifier	 root Tag Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Required to stop processing the DTD, even though the DTD 	TokenNameCOMMENT_LINE	Required to stop processing the DTD, even though the DTD 
// is not printed. 	TokenNameCOMMENT_LINE	is not printed. 
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
leaveDTD	TokenNameIdentifier	 leave DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_started	TokenNameIdentifier	 started
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Always serialize these, even if not te first root element. 	TokenNameCOMMENT_LINE	Always serialize these, even if not te first root element. 
serializePreRoot	TokenNameIdentifier	 serialize Pre Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called to serialize a DOM element. Equivalent to calling {@link * #startElement}, {@link #endElement} and serializing everything * inbetween, but better optimized. */	TokenNameCOMMENT_JAVADOC	 Called to serialize a DOM element. Equivalent to calling {@link #startElement}, {@link #endElement} and serializing everything inbetween, but better optimized. 
protected	TokenNameprotected	
void	TokenNamevoid	
serializeElement	TokenNameIdentifier	 serialize Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
ElementState	TokenNameIdentifier	 Element State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
preserveSpace	TokenNameIdentifier	 preserve Space
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
;	TokenNameSEMICOLON	
tagName	TokenNameIdentifier	 tag Name
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getTagName	TokenNameIdentifier	 get Tag Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
getElementState	TokenNameIdentifier	 get Element State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isDocumentState	TokenNameIdentifier	 is Document State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If this is the root element handle it differently. 	TokenNameCOMMENT_LINE	If this is the root element handle it differently. 
// If the first root element in the document, serialize 	TokenNameCOMMENT_LINE	If the first root element in the document, serialize 
// the document's DOCTYPE. Space preserving defaults 	TokenNameCOMMENT_LINE	the document's DOCTYPE. Space preserving defaults 
// to that of the output format. 	TokenNameCOMMENT_LINE	to that of the output format. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_started	TokenNameIdentifier	 started
)	TokenNameRPAREN	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// For any other element, if first in parent, then 	TokenNameCOMMENT_LINE	For any other element, if first in parent, then 
// use the parnet's space preserving. 	TokenNameCOMMENT_LINE	use the parnet's space preserving. 
preserveSpace	TokenNameIdentifier	 preserve Space
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
preserveSpace	TokenNameIdentifier	 preserve Space
;	TokenNameSEMICOLON	
// Do not change the current element state yet. 	TokenNameCOMMENT_LINE	Do not change the current element state yet. 
// This only happens in endElement(). 	TokenNameCOMMENT_LINE	This only happens in endElement(). 
// Ignore all other attributes of the element, only printing 	TokenNameCOMMENT_LINE	Ignore all other attributes of the element, only printing 
// its contents. 	TokenNameCOMMENT_LINE	its contents. 
// If element has children, then serialize them, otherwise 	TokenNameCOMMENT_LINE	If element has children, then serialize them, otherwise 
// serialize en empty tag. 	TokenNameCOMMENT_LINE	serialize en empty tag. 
if	TokenNameif	
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Enter an element state, and serialize the children 	TokenNameCOMMENT_LINE	Enter an element state, and serialize the children 
// one by one. Finally, end the element. 	TokenNameCOMMENT_LINE	one by one. Finally, end the element. 
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
enterElementState	TokenNameIdentifier	 enter Element State
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
preserveSpace	TokenNameIdentifier	 preserve Space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
serializeNode	TokenNameIdentifier	 serialize Node
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
endElementIO	TokenNameIdentifier	 end Element IO
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isDocumentState	TokenNameIdentifier	 is Document State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// After element but parent element is no longer empty. 	TokenNameCOMMENT_LINE	After element but parent element is no longer empty. 
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterElement	TokenNameIdentifier	 after Element
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Serialize the DOM node. This method is unique to the Text serializer. * * @param node The node to serialize */	TokenNameCOMMENT_JAVADOC	 Serialize the DOM node. This method is unique to the Text serializer. * @param node The node to serialize 
protected	TokenNameprotected	
void	TokenNamevoid	
serializeNode	TokenNameIdentifier	 serialize Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Based on the node type call the suitable SAX handler. 	TokenNameCOMMENT_LINE	Based on the node type call the suitable SAX handler. 
// Only comments entities and documents which are not 	TokenNameCOMMENT_LINE	Only comments entities and documents which are not 
// handled by SAX are serialized directly. 	TokenNameCOMMENT_LINE	handled by SAX are serialized directly. 
switch	TokenNameswitch	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
// Ignore. 	TokenNameCOMMENT_LINE	Ignore. 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
serializeElement	TokenNameIdentifier	 serialize Element
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
// !!! Fall through 	TokenNameCOMMENT_LINE	!!! Fall through 
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
// By definition this will happen if the node is a document, 	TokenNameCOMMENT_LINE	By definition this will happen if the node is a document, 
// document fragment, etc. Just serialize its contents. It will 	TokenNameCOMMENT_LINE	document fragment, etc. Just serialize its contents. It will 
// work well for other nodes that we do not know how to serialize. 	TokenNameCOMMENT_LINE	work well for other nodes that we do not know how to serialize. 
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
serializeNode	TokenNameIdentifier	 serialize Node
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
ElementState	TokenNameIdentifier	 Element State
content	TokenNameIdentifier	 content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElementState	TokenNameIdentifier	 Element State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
getElementState	TokenNameIdentifier	 get Element State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isDocumentState	TokenNameIdentifier	 is Document State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If this is the first content in the element, 	TokenNameCOMMENT_LINE	If this is the first content in the element, 
// change the state to not-empty. 	TokenNameCOMMENT_LINE	change the state to not-empty. 
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Except for one content type, all of them 	TokenNameCOMMENT_LINE	Except for one content type, all of them 
// are not last element. That one content 	TokenNameCOMMENT_LINE	are not last element. That one content 
// type will take care of itself. 	TokenNameCOMMENT_LINE	type will take care of itself. 
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterElement	TokenNameIdentifier	 after Element
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getEntityRef	TokenNameIdentifier	 get Entity Ref
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
