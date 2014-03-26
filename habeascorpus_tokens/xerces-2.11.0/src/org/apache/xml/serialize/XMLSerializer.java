/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Sep 14, 2000: 	TokenNameCOMMENT_LINE	Sep 14, 2000: 
// Fixed problem with namespace handling. Contributed by 	TokenNameCOMMENT_LINE	Fixed problem with namespace handling. Contributed by 
// David Blondeau <blondeau@intalio.com> 	TokenNameCOMMENT_LINE	David Blondeau <blondeau@intalio.com> 
// Sep 14, 2000: 	TokenNameCOMMENT_LINE	Sep 14, 2000: 
// Fixed serializer to report IO exception directly, instead at 	TokenNameCOMMENT_LINE	Fixed serializer to report IO exception directly, instead at 
// the end of document processing. 	TokenNameCOMMENT_LINE	the end of document processing. 
// Reported by Patrick Higgins <phiggins@transzap.com> 	TokenNameCOMMENT_LINE	Reported by Patrick Higgins <phiggins@transzap.com> 
// Aug 21, 2000: 	TokenNameCOMMENT_LINE	Aug 21, 2000: 
// Fixed bug in startDocument not calling prepare. 	TokenNameCOMMENT_LINE	Fixed bug in startDocument not calling prepare. 
// Reported by Mikael Staldal <d96-mst-ingen-reklam@d.kth.se> 	TokenNameCOMMENT_LINE	Reported by Mikael Staldal <d96-mst-ingen-reklam@d.kth.se> 
// Aug 21, 2000: 	TokenNameCOMMENT_LINE	Aug 21, 2000: 
// Added ability to omit DOCTYPE declaration. 	TokenNameCOMMENT_LINE	Added ability to omit DOCTYPE declaration. 
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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SymbolTable	TokenNameIdentifier	 Symbol Table
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLChar	TokenNameIdentifier	 XML Char
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLSymbols	TokenNameIdentifier	 XML Symbols
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
NamespaceContext	TokenNameIdentifier	 Namespace Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Attr	TokenNameIdentifier	 Attr
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMError	TokenNameIdentifier	 DOM Error
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
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeFilter	TokenNameIdentifier	 Node Filter
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
/** * Implements an XML serializer supporting both DOM and SAX pretty * serializing. For usage instructions see {@link Serializer}. * <p> * If an output stream is used, the encoding is taken from the * output format (defaults to <tt>UTF-8</tt>). If a writer is * used, make sure the writer uses the same encoding (if applies) * as specified in the output format. * <p> * The serializer supports both DOM and SAX. SAX serializing is done by firing * SAX events and using the serializer as a document handler. DOM serializing is done * by calling {@link #serialize(Document)} or by using DOM Level 3 * {@link org.w3c.dom.ls.LSSerializer} and * serializing with {@link org.w3c.dom.ls.LSSerializer#write}, * {@link org.w3c.dom.ls.LSSerializer#writeToString}. * <p> * If an I/O exception occurs while serializing, the serializer * will not throw an exception directly, but only throw it * at the end of serializing (either DOM or SAX's {@link * org.xml.sax.DocumentHandler#endDocument}. * <p> * For elements that are not specified as whitespace preserving, * the serializer will potentially break long text lines at space * boundaries, indent lines, and serialize elements on separate * lines. Line terminators will be regarded as spaces, and * spaces at beginning of line will be stripped. * * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended * that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation * API for XML (TrAX) for serializing XML. See the Xerces documentation for more * information. * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> * @author <a href="mailto:rahul.srivastava@sun.com">Rahul Srivastava</a> * @author Elena Litani IBM * @version $Revision: 704573 $ $Date: 2008-10-14 12:11:22 -0400 (Tue, 14 Oct 2008) $ * @see Serializer */	TokenNameCOMMENT_JAVADOC	 Implements an XML serializer supporting both DOM and SAX pretty serializing. For usage instructions see {@link Serializer}. <p> If an output stream is used, the encoding is taken from the output format (defaults to <tt>UTF-8</tt>). If a writer is used, make sure the writer uses the same encoding (if applies) as specified in the output format. <p> The serializer supports both DOM and SAX. SAX serializing is done by firing SAX events and using the serializer as a document handler. DOM serializing is done by calling {@link #serialize(Document)} or by using DOM Level 3 {@link org.w3c.dom.ls.LSSerializer} and serializing with {@link org.w3c.dom.ls.LSSerializer#write}, {@link org.w3c.dom.ls.LSSerializer#writeToString}. <p> If an I/O exception occurs while serializing, the serializer will not throw an exception directly, but only throw it at the end of serializing (either DOM or SAX's {@link org.xml.sax.DocumentHandler#endDocument}. <p> For elements that are not specified as whitespace preserving, the serializer will potentially break long text lines at space boundaries, indent lines, and serialize elements on separate lines. Line terminators will be regarded as spaces, and spaces at beginning of line will be stripped. * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation API for XML (TrAX) for serializing XML. See the Xerces documentation for more information. @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> @author <a href="mailto:rahul.srivastava@sun.com">Rahul Srivastava</a> @author Elena Litani IBM @version $Revision: 704573 $ $Date: 2008-10-14 12:11:22 -0400 (Tue, 14 Oct 2008) $ @see Serializer 
public	TokenNamepublic	
class	TokenNameclass	
XMLSerializer	TokenNameIdentifier	 XML Serializer
extends	TokenNameextends	
BaseMarkupSerializer	TokenNameIdentifier	 Base Markup Serializer
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// constants 	TokenNameCOMMENT_LINE	constants 
// 	TokenNameCOMMENT_LINE	 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// data 	TokenNameCOMMENT_LINE	data 
// 	TokenNameCOMMENT_LINE	 
// 	TokenNameCOMMENT_LINE	 
// DOM Level 3 implementation: variables intialized in DOMSerializerImpl 	TokenNameCOMMENT_LINE	DOM Level 3 implementation: variables intialized in DOMSerializerImpl 
// 	TokenNameCOMMENT_LINE	 
/** stores namespaces in scope */	TokenNameCOMMENT_JAVADOC	 stores namespaces in scope 
protected	TokenNameprotected	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
fNSBinder	TokenNameIdentifier	 f NS Binder
;	TokenNameSEMICOLON	
/** stores all namespace bindings on the current element */	TokenNameCOMMENT_JAVADOC	 stores all namespace bindings on the current element 
protected	TokenNameprotected	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
fLocalNSBinder	TokenNameIdentifier	 f Local NS Binder
;	TokenNameSEMICOLON	
/** symbol table for serialization */	TokenNameCOMMENT_JAVADOC	 symbol table for serialization 
protected	TokenNameprotected	
SymbolTable	TokenNameIdentifier	 Symbol Table
fSymbolTable	TokenNameIdentifier	 f Symbol Table
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PREFIX	TokenNameIdentifier	 PREFIX
=	TokenNameEQUAL	
"NS"	TokenNameStringLiteral	NS
;	TokenNameSEMICOLON	
/** * Controls whether namespace fixup should be performed during * the serialization. * NOTE: if this field is set to true the following * fields need to be initialized: fNSBinder, fLocalNSBinder, fSymbolTable, * XMLSymbols.EMPTY_STRING, fXmlSymbol, fXmlnsSymbol */	TokenNameCOMMENT_JAVADOC	 Controls whether namespace fixup should be performed during the serialization. NOTE: if this field is set to true the following fields need to be initialized: fNSBinder, fLocalNSBinder, fSymbolTable, XMLSymbols.EMPTY_STRING, fXmlSymbol, fXmlnsSymbol 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fNamespaces	TokenNameIdentifier	 f Namespaces
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Controls whether namespace prefixes will be printed out during serialization */	TokenNameCOMMENT_JAVADOC	 Controls whether namespace prefixes will be printed out during serialization 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fNamespacePrefixes	TokenNameIdentifier	 f Namespace Prefixes
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
fPreserveSpace	TokenNameIdentifier	 f Preserve Space
;	TokenNameSEMICOLON	
/** * Constructs a new serializer. The serializer cannot be used without * calling {@link #setOutputCharStream} or {@link #setOutputByteStream} * first. */	TokenNameCOMMENT_JAVADOC	 Constructs a new serializer. The serializer cannot be used without calling {@link #setOutputCharStream} or {@link #setOutputByteStream} first. 
public	TokenNamepublic	
XMLSerializer	TokenNameIdentifier	 XML Serializer
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
XML	TokenNameIdentifier	 XML
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new serializer. The serializer cannot be used without * calling {@link #setOutputCharStream} or {@link #setOutputByteStream} * first. */	TokenNameCOMMENT_JAVADOC	 Constructs a new serializer. The serializer cannot be used without calling {@link #setOutputCharStream} or {@link #setOutputByteStream} first. 
public	TokenNamepublic	
XMLSerializer	TokenNameIdentifier	 XML Serializer
(	TokenNameLPAREN	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
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
XML	TokenNameIdentifier	 XML
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
setMethod	TokenNameIdentifier	 set Method
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XML	TokenNameIdentifier	 XML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new serializer that writes to the specified writer * using the specified output format. If <tt>format</tt> is null, * will use a default output format. * * @param writer The writer to use * @param format The output format to use, null for the default */	TokenNameCOMMENT_JAVADOC	 Constructs a new serializer that writes to the specified writer using the specified output format. If <tt>format</tt> is null, will use a default output format. * @param writer The writer to use @param format The output format to use, null for the default 
public	TokenNamepublic	
XMLSerializer	TokenNameIdentifier	 XML Serializer
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
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
XML	TokenNameIdentifier	 XML
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
setMethod	TokenNameIdentifier	 set Method
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XML	TokenNameIdentifier	 XML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setOutputCharStream	TokenNameIdentifier	 set Output Char Stream
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new serializer that writes to the specified output * stream using the specified output format. If <tt>format</tt> * is null, will use a default output format. * * @param output The output stream to use * @param format The output format to use, null for the default */	TokenNameCOMMENT_JAVADOC	 Constructs a new serializer that writes to the specified output stream using the specified output format. If <tt>format</tt> is null, will use a default output format. * @param output The output stream to use @param format The output format to use, null for the default 
public	TokenNamepublic	
XMLSerializer	TokenNameIdentifier	 XML Serializer
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
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
XML	TokenNameIdentifier	 XML
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
setMethod	TokenNameIdentifier	 set Method
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XML	TokenNameIdentifier	 XML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setOutputByteStream	TokenNameIdentifier	 set Output Byte Stream
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
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
XML	TokenNameIdentifier	 XML
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This methods turns on namespace fixup algorithm during * DOM serialization. * @see org.w3c.dom.ls.LSSerializer * * @param namespaces */	TokenNameCOMMENT_JAVADOC	 This methods turns on namespace fixup algorithm during DOM serialization. @see org.w3c.dom.ls.LSSerializer * @param namespaces 
public	TokenNamepublic	
void	TokenNamevoid	
setNamespaces	TokenNameIdentifier	 set Namespaces
(	TokenNameLPAREN	
boolean	TokenNameboolean	
namespaces	TokenNameIdentifier	 namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaces	TokenNameIdentifier	 f Namespaces
=	TokenNameEQUAL	
namespaces	TokenNameIdentifier	 namespaces
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fNSBinder	TokenNameIdentifier	 f NS Binder
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNSBinder	TokenNameIdentifier	 f NS Binder
=	TokenNameEQUAL	
new	TokenNamenew	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fLocalNSBinder	TokenNameIdentifier	 f Local NS Binder
=	TokenNameEQUAL	
new	TokenNamenew	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
new	TokenNamenew	
SymbolTable	TokenNameIdentifier	 Symbol Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
preserveSpace	TokenNameIdentifier	 preserve Space
;	TokenNameSEMICOLON	
ElementState	TokenNameIdentifier	 Element State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>startElement("	TokenNameStringLiteral	==>startElement(
+	TokenNamePLUS	
namespaceURI	TokenNameIdentifier	 namespace URI
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
localName	TokenNameIdentifier	 local Name
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
rawName	TokenNameIdentifier	 raw Name
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_printer	TokenNameIdentifier	 printer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
SERIALIZER_DOMAIN	TokenNameIdentifier	 SERIALIZER  DOMAIN
,	TokenNameCOMMA	
"NoWriterSupplied"	TokenNameStringLiteral	NoWriterSupplied
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
rawName	TokenNameIdentifier	 raw Name
:	TokenNameCOLON	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// For any other element, if first in parent, then 	TokenNameCOMMENT_LINE	For any other element, if first in parent, then 
// close parent's opening tag and use the parnet's 	TokenNameCOMMENT_LINE	close parent's opening tag and use the parnet's 
// space preserving. 	TokenNameCOMMENT_LINE	space preserving. 
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Must leave CData section first 	TokenNameCOMMENT_LINE	Must leave CData section first 
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
inCData	TokenNameIdentifier	 in C Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"]]>"	TokenNameStringLiteral	]]>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
inCData	TokenNameIdentifier	 in C Data
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Indent this element on a new line if the first 	TokenNameCOMMENT_LINE	Indent this element on a new line if the first 
// content of the parent element or immediately 	TokenNameCOMMENT_LINE	content of the parent element or immediately 
// following an element or a comment 	TokenNameCOMMENT_LINE	following an element or a comment 
if	TokenNameif	
(	TokenNameLPAREN	
_indenting	TokenNameIdentifier	 indenting
&&	TokenNameAND_AND	
!	TokenNameNOT	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
preserveSpace	TokenNameIdentifier	 preserve Space
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
||	TokenNameOR_OR	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterElement	TokenNameIdentifier	 after Element
||	TokenNameOR_OR	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterComment	TokenNameIdentifier	 after Comment
)	TokenNameRPAREN	
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
preserveSpace	TokenNameIdentifier	 preserve Space
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
preserveSpace	TokenNameIdentifier	 preserve Space
;	TokenNameSEMICOLON	
//We remove the namespaces from the attributes list so that they will 	TokenNameCOMMENT_LINE	We remove the namespaces from the attributes list so that they will 
//be in _prefixes 	TokenNameCOMMENT_LINE	be in _prefixes 
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
extractNamespaces	TokenNameIdentifier	 extract Namespaces
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Do not change the current element state yet. 	TokenNameCOMMENT_LINE	Do not change the current element state yet. 
// This only happens in endElement(). 	TokenNameCOMMENT_LINE	This only happens in endElement(). 
if	TokenNameif	
(	TokenNameLPAREN	
rawName	TokenNameIdentifier	 raw Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
rawName	TokenNameIdentifier	 raw Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
SERIALIZER_DOMAIN	TokenNameIdentifier	 SERIALIZER  DOMAIN
,	TokenNameCOMMA	
"NoName"	TokenNameStringLiteral	NoName
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rawName	TokenNameIdentifier	 raw Name
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
rawName	TokenNameIdentifier	 raw Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
rawName	TokenNameIdentifier	 raw Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For each attribute print it's name and value as one part, 	TokenNameCOMMENT_LINE	For each attribute print it's name and value as one part, 
// separated with a space so the element can be broken on 	TokenNameCOMMENT_LINE	separated with a space so the element can be broken on 
// multiple lines. 	TokenNameCOMMENT_LINE	multiple lines. 
if	TokenNameif	
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printSpace	TokenNameIdentifier	 print Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attrURI	TokenNameIdentifier	 attr URI
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrURI	TokenNameIdentifier	 attr URI
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
attrURI	TokenNameIdentifier	 attr URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
attrURI	TokenNameIdentifier	 attr URI
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
attrURI	TokenNameIdentifier	 attr URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
attrURI	TokenNameIdentifier	 attr URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"=""	TokenNameStringLiteral	="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printEscaped	TokenNameIdentifier	 print Escaped
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the attribute xml:space exists, determine whether 	TokenNameCOMMENT_LINE	If the attribute xml:space exists, determine whether 
// to preserve spaces in this and child nodes based on 	TokenNameCOMMENT_LINE	to preserve spaces in this and child nodes based on 
// its value. 	TokenNameCOMMENT_LINE	its value. 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xml:space"	TokenNameStringLiteral	xml:space
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"preserve"	TokenNameStringLiteral	preserve
)	TokenNameRPAREN	
)	TokenNameRPAREN	
preserveSpace	TokenNameIdentifier	 preserve Space
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
preserveSpace	TokenNameIdentifier	 preserve Space
=	TokenNameEQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getPreserveSpace	TokenNameIdentifier	 get Preserve Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_prefixes	TokenNameIdentifier	 prefixes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
_prefixes	TokenNameIdentifier	 prefixes
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printSpace	TokenNameIdentifier	 print Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"xmlns=""	TokenNameStringLiteral	xmlns="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printEscaped	TokenNameIdentifier	 print Escaped
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"xmlns:"	TokenNameStringLiteral	xmlns:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"=""	TokenNameStringLiteral	="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printEscaped	TokenNameIdentifier	 print Escaped
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Now it's time to enter a new element state 	TokenNameCOMMENT_LINE	Now it's time to enter a new element state 
// with the tag name and space preserving. 	TokenNameCOMMENT_LINE	with the tag name and space preserving. 
// We still do not change the curent element state. 	TokenNameCOMMENT_LINE	We still do not change the curent element state. 
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
enterElementState	TokenNameIdentifier	 enter Element State
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
preserveSpace	TokenNameIdentifier	 preserve Space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
rawName	TokenNameIdentifier	 raw Name
:	TokenNameCOLON	
namespaceURI	TokenNameIdentifier	 namespace URI
+	TokenNamePLUS	
"^"	TokenNameStringLiteral	^
+	TokenNamePLUS	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
doCData	TokenNameIdentifier	 do C Data
=	TokenNameEQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
isCDataElement	TokenNameIdentifier	 is C Data Element
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
unescaped	TokenNameIdentifier	 unescaped
=	TokenNameEQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
isNonEscapingElement	TokenNameIdentifier	 is Non Escaping Element
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
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
try	TokenNametry	
{	TokenNameLBRACE	
endElementIO	TokenNameIdentifier	 end Element IO
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
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
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ElementState	TokenNameIdentifier	 Element State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>endElement: "	TokenNameStringLiteral	==>endElement: 
+	TokenNamePLUS	
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Works much like content() with additions for closing 	TokenNameCOMMENT_LINE	Works much like content() with additions for closing 
// an element. Note the different checks for the closed 	TokenNameCOMMENT_LINE	an element. Note the different checks for the closed 
// element's state and the parent element's state. 	TokenNameCOMMENT_LINE	element's state and the parent element's state. 
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
unindent	TokenNameIdentifier	 unindent
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
state	TokenNameIdentifier	 state
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"/>"	TokenNameStringLiteral	/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Must leave CData section first 	TokenNameCOMMENT_LINE	Must leave CData section first 
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
inCData	TokenNameIdentifier	 in C Data
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"]]>"	TokenNameStringLiteral	]]>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This element is not empty and that last content was 	TokenNameCOMMENT_LINE	This element is not empty and that last content was 
// another element, so print a line break before that 	TokenNameCOMMENT_LINE	another element, so print a line break before that 
// last element and this element's closing tag. 	TokenNameCOMMENT_LINE	last element and this element's closing tag. 
if	TokenNameif	
(	TokenNameLPAREN	
_indenting	TokenNameIdentifier	 indenting
&&	TokenNameAND_AND	
!	TokenNameNOT	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
preserveSpace	TokenNameIdentifier	 preserve Space
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterElement	TokenNameIdentifier	 after Element
||	TokenNameOR_OR	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterComment	TokenNameIdentifier	 after Comment
)	TokenNameRPAREN	
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"</"	TokenNameStringLiteral	</
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
afterComment	TokenNameIdentifier	 after Comment
=	TokenNameEQUAL	
false	TokenNamefalse	
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
//------------------------------------------// 	TokenNameCOMMENT_LINE	------------------------------------------// 
// SAX document handler serializing methods // 	TokenNameCOMMENT_LINE	SAX document handler serializing methods // 
//------------------------------------------// 	TokenNameCOMMENT_LINE	------------------------------------------// 
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
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
preserveSpace	TokenNameIdentifier	 preserve Space
;	TokenNameSEMICOLON	
ElementState	TokenNameIdentifier	 Element State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>startElement("	TokenNameStringLiteral	==>startElement(
+	TokenNamePLUS	
tagName	TokenNameIdentifier	 tag Name
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_printer	TokenNameIdentifier	 printer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
SERIALIZER_DOMAIN	TokenNameIdentifier	 SERIALIZER  DOMAIN
,	TokenNameCOMMA	
"NoWriterSupplied"	TokenNameStringLiteral	NoWriterSupplied
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
else	TokenNameelse	
{	TokenNameLBRACE	
// For any other element, if first in parent, then 	TokenNameCOMMENT_LINE	For any other element, if first in parent, then 
// close parent's opening tag and use the parnet's 	TokenNameCOMMENT_LINE	close parent's opening tag and use the parnet's 
// space preserving. 	TokenNameCOMMENT_LINE	space preserving. 
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Must leave CData section first 	TokenNameCOMMENT_LINE	Must leave CData section first 
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
inCData	TokenNameIdentifier	 in C Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"]]>"	TokenNameStringLiteral	]]>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
inCData	TokenNameIdentifier	 in C Data
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Indent this element on a new line if the first 	TokenNameCOMMENT_LINE	Indent this element on a new line if the first 
// content of the parent element or immediately 	TokenNameCOMMENT_LINE	content of the parent element or immediately 
// following an element. 	TokenNameCOMMENT_LINE	following an element. 
if	TokenNameif	
(	TokenNameLPAREN	
_indenting	TokenNameIdentifier	 indenting
&&	TokenNameAND_AND	
!	TokenNameNOT	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
preserveSpace	TokenNameIdentifier	 preserve Space
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
||	TokenNameOR_OR	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterElement	TokenNameIdentifier	 after Element
||	TokenNameOR_OR	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterComment	TokenNameIdentifier	 after Comment
)	TokenNameRPAREN	
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
preserveSpace	TokenNameIdentifier	 preserve Space
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
preserveSpace	TokenNameIdentifier	 preserve Space
;	TokenNameSEMICOLON	
// Do not change the current element state yet. 	TokenNameCOMMENT_LINE	Do not change the current element state yet. 
// This only happens in endElement(). 	TokenNameCOMMENT_LINE	This only happens in endElement(). 
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For each attribute print it's name and value as one part, 	TokenNameCOMMENT_LINE	For each attribute print it's name and value as one part, 
// separated with a space so the element can be broken on 	TokenNameCOMMENT_LINE	separated with a space so the element can be broken on 
// multiple lines. 	TokenNameCOMMENT_LINE	multiple lines. 
if	TokenNameif	
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printSpace	TokenNameIdentifier	 print Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"=""	TokenNameStringLiteral	="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printEscaped	TokenNameIdentifier	 print Escaped
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If the attribute xml:space exists, determine whether 	TokenNameCOMMENT_LINE	If the attribute xml:space exists, determine whether 
// to preserve spaces in this and child nodes based on 	TokenNameCOMMENT_LINE	to preserve spaces in this and child nodes based on 
// its value. 	TokenNameCOMMENT_LINE	its value. 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xml:space"	TokenNameStringLiteral	xml:space
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"preserve"	TokenNameStringLiteral	preserve
)	TokenNameRPAREN	
)	TokenNameRPAREN	
preserveSpace	TokenNameIdentifier	 preserve Space
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
preserveSpace	TokenNameIdentifier	 preserve Space
=	TokenNameEQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getPreserveSpace	TokenNameIdentifier	 get Preserve Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
state	TokenNameIdentifier	 state
.	TokenNameDOT	
doCData	TokenNameIdentifier	 do C Data
=	TokenNameEQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
isCDataElement	TokenNameIdentifier	 is C Data Element
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
unescaped	TokenNameIdentifier	 unescaped
=	TokenNameEQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
isNonEscapingElement	TokenNameIdentifier	 is Non Escaping Element
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
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
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
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------// 	TokenNameCOMMENT_LINE	------------------------------------------// 
// Generic node serializing methods methods // 	TokenNameCOMMENT_LINE	Generic node serializing methods methods // 
//------------------------------------------// 	TokenNameCOMMENT_LINE	------------------------------------------// 
/** * Called to serialize the document's DOCTYPE by the root element. * The document type declaration must name the root element, * but the root element is only known when that element is serialized, * and not at the start of the document. * <p> * This method will check if it has not been called before ({@link #_started}), * will serialize the document type declaration, and will serialize all * pre-root comments and PIs that were accumulated in the document * (see {@link #serializePreRoot}). Pre-root will be serialized even if * this is not the first root element of the document. */	TokenNameCOMMENT_JAVADOC	 Called to serialize the document's DOCTYPE by the root element. The document type declaration must name the root element, but the root element is only known when that element is serialized, and not at the start of the document. <p> This method will check if it has not been called before ({@link #_started}), will serialize the document type declaration, and will serialize all pre-root comments and PIs that were accumulated in the document (see {@link #serializePreRoot}). Pre-root will be serialized even if this is not the first root element of the document. 
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
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
dtd	TokenNameIdentifier	 dtd
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
=	TokenNameEQUAL	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
leaveDTD	TokenNameIdentifier	 leave DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_started	TokenNameIdentifier	 started
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getOmitXMLDeclaration	TokenNameIdentifier	 get Omit XML Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
// Serialize the document declaration appreaing at the head 	TokenNameCOMMENT_LINE	Serialize the document declaration appreaing at the head 
// of very XML document (unless asked not to). 	TokenNameCOMMENT_LINE	of very XML document (unless asked not to). 
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"<?xml version=""	TokenNameStringLiteral	<?xml version="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
format_encoding	TokenNameIdentifier	 format encoding
=	TokenNameEQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
format_encoding	TokenNameIdentifier	 format encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" encoding=""	TokenNameStringLiteral	 encoding="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
format_encoding	TokenNameIdentifier	 format encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getStandalone	TokenNameIdentifier	 get Standalone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
_docTypeSystemId	TokenNameIdentifier	 doc Type System Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
_docTypePublicId	TokenNameIdentifier	 doc Type Public Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" standalone="yes""	TokenNameStringLiteral	 standalone="yes"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"?>"	TokenNameStringLiteral	?>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getOmitDocumentType	TokenNameIdentifier	 get Omit Document Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_docTypeSystemId	TokenNameIdentifier	 doc Type System Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System identifier must be specified to print DOCTYPE. 	TokenNameCOMMENT_LINE	System identifier must be specified to print DOCTYPE. 
// If public identifier is specified print 'PUBLIC 	TokenNameCOMMENT_LINE	If public identifier is specified print 'PUBLIC 
// <public> <system>', if not, print 'SYSTEM <system>'. 	TokenNameCOMMENT_LINE	<public> <system>', if not, print 'SYSTEM <system>'. 
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"<!DOCTYPE "	TokenNameStringLiteral	<!DOCTYPE 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
rootTagName	TokenNameIdentifier	 root Tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_docTypePublicId	TokenNameIdentifier	 doc Type Public Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
" PUBLIC "	TokenNameStringLiteral	 PUBLIC 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printDoctypeURL	TokenNameIdentifier	 print Doctype URL
(	TokenNameLPAREN	
_docTypePublicId	TokenNameIdentifier	 doc Type Public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_indenting	TokenNameIdentifier	 indenting
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
18	TokenNameIntegerLiteral	
+	TokenNamePLUS	
rootTagName	TokenNameIdentifier	 root Tag Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printDoctypeURL	TokenNameIdentifier	 print Doctype URL
(	TokenNameLPAREN	
_docTypeSystemId	TokenNameIdentifier	 doc Type System Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
" SYSTEM "	TokenNameStringLiteral	 SYSTEM 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printDoctypeURL	TokenNameIdentifier	 print Doctype URL
(	TokenNameLPAREN	
_docTypeSystemId	TokenNameIdentifier	 doc Type System Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If we accumulated any DTD contents while printing. 	TokenNameCOMMENT_LINE	If we accumulated any DTD contents while printing. 
// this would be the place to print it. 	TokenNameCOMMENT_LINE	this would be the place to print it. 
if	TokenNameif	
(	TokenNameLPAREN	
dtd	TokenNameIdentifier	 dtd
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
" ["	TokenNameStringLiteral	 [
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
dtd	TokenNameIdentifier	 dtd
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dtd	TokenNameIdentifier	 dtd
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"<!DOCTYPE "	TokenNameStringLiteral	<!DOCTYPE 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
rootTagName	TokenNameIdentifier	 root Tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
" ["	TokenNameStringLiteral	 [
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
dtd	TokenNameIdentifier	 dtd
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"]>"	TokenNameStringLiteral	]>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
Attr	TokenNameIdentifier	 Attr
attr	TokenNameIdentifier	 attr
;	TokenNameSEMICOLON	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
attrMap	TokenNameIdentifier	 attr Map
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
ElementState	TokenNameIdentifier	 Element State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
localUri	TokenNameIdentifier	 local Uri
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespaces	TokenNameIdentifier	 f Namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// local binder stores namespace declaration 	TokenNameCOMMENT_LINE	local binder stores namespace declaration 
// that has been printed out during namespace fixup of 	TokenNameCOMMENT_LINE	that has been printed out during namespace fixup of 
// the current element 	TokenNameCOMMENT_LINE	the current element 
fLocalNSBinder	TokenNameIdentifier	 f Local NS Binder
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add new namespace context 	TokenNameCOMMENT_LINE	add new namespace context 
fNSBinder	TokenNameIdentifier	 f NS Binder
.	TokenNameDOT	
pushContext	TokenNameIdentifier	 push Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>startElement: "	TokenNameStringLiteral	==>startElement: 
+	TokenNamePLUS	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" ns="	TokenNameStringLiteral	 ns=
+	TokenNamePLUS	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// For any other element, if first in parent, then 	TokenNameCOMMENT_LINE	For any other element, if first in parent, then 
// close parent's opening tag and use the parent's 	TokenNameCOMMENT_LINE	close parent's opening tag and use the parent's 
// space preserving. 	TokenNameCOMMENT_LINE	space preserving. 
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Must leave CData section first 	TokenNameCOMMENT_LINE	Must leave CData section first 
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
inCData	TokenNameIdentifier	 in C Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"]]>"	TokenNameStringLiteral	]]>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
inCData	TokenNameIdentifier	 in C Data
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Indent this element on a new line if the first 	TokenNameCOMMENT_LINE	Indent this element on a new line if the first 
// content of the parent element or immediately 	TokenNameCOMMENT_LINE	content of the parent element or immediately 
// following an element. 	TokenNameCOMMENT_LINE	following an element. 
if	TokenNameif	
(	TokenNameLPAREN	
_indenting	TokenNameIdentifier	 indenting
&&	TokenNameAND_AND	
!	TokenNameNOT	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
preserveSpace	TokenNameIdentifier	 preserve Space
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
||	TokenNameOR_OR	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterElement	TokenNameIdentifier	 after Element
||	TokenNameOR_OR	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterComment	TokenNameIdentifier	 after Comment
)	TokenNameRPAREN	
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Do not change the current element state yet. 	TokenNameCOMMENT_LINE	Do not change the current element state yet. 
// This only happens in endElement(). 	TokenNameCOMMENT_LINE	This only happens in endElement(). 
fPreserveSpace	TokenNameIdentifier	 f Preserve Space
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
preserveSpace	TokenNameIdentifier	 preserve Space
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// retrieve attributes 	TokenNameCOMMENT_LINE	retrieve attributes 
if	TokenNameif	
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attrMap	TokenNameIdentifier	 attr Map
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fNamespaces	TokenNameIdentifier	 f Namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no namespace fixup should be performed 	TokenNameCOMMENT_LINE	no namespace fixup should be performed 
// serialize element name 	TokenNameCOMMENT_LINE	serialize element name 
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For each attribute print it's name and value as one part, 	TokenNameCOMMENT_LINE	For each attribute print it's name and value as one part, 
// separated with a space so the element can be broken on 	TokenNameCOMMENT_LINE	separated with a space so the element can be broken on 
// multiple lines. 	TokenNameCOMMENT_LINE	multiple lines. 
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
printAttribute	TokenNameIdentifier	 print Attribute
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getSpecified	TokenNameIdentifier	 get Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// do namespace fixup 	TokenNameCOMMENT_LINE	do namespace fixup 
// REVISIT: some optimization could probably be done to avoid traversing 	TokenNameCOMMENT_LINE	REVISIT: some optimization could probably be done to avoid traversing 
// attributes twice. 	TokenNameCOMMENT_LINE	attributes twice. 
// 	TokenNameCOMMENT_LINE	 
// --------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------- 
// record all valid namespace declarations 	TokenNameCOMMENT_LINE	record all valid namespace declarations 
// before attempting to fix element's namespace 	TokenNameCOMMENT_LINE	before attempting to fix element's namespace 
// --------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------- 
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check if attribute is a namespace decl 	TokenNameCOMMENT_LINE	check if attribute is a namespace decl 
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDOMErrorHandler	TokenNameIdentifier	 f DOM Error Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"CantBindXMLNS"	TokenNameStringLiteral	CantBindXMLNS
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
modifyDOMError	TokenNameIdentifier	 modify DOM Error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
DOMError	TokenNameIdentifier	 DOM Error
.	TokenNameDOT	
SEVERITY_ERROR	TokenNameIdentifier	 SEVERITY  ERROR
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
continueProcess	TokenNameIdentifier	 continue Process
=	TokenNameEQUAL	
fDOMErrorHandler	TokenNameIdentifier	 f DOM Error Handler
.	TokenNameDOT	
handleError	TokenNameIdentifier	 handle Error
(	TokenNameLPAREN	
fDOMError	TokenNameIdentifier	 f DOM Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
continueProcess	TokenNameIdentifier	 continue Process
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// stop the namespace fixup and validation 	TokenNameCOMMENT_LINE	stop the namespace fixup and validation 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
SERIALIZER_DOMAIN	TokenNameIdentifier	 SERIALIZER  DOMAIN
,	TokenNameCOMMA	
"SerializationStopped"	TokenNameStringLiteral	SerializationStopped
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
:	TokenNameCOLON	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//xmlns:prefix 	TokenNameCOMMENT_LINE	xmlns:prefix 
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// record valid decl 	TokenNameCOMMENT_LINE	record valid decl 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNSBinder	TokenNameIdentifier	 f NS Binder
.	TokenNameDOT	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// REVISIT: issue error on invalid declarations 	TokenNameCOMMENT_LINE	REVISIT: issue error on invalid declarations 
// xmlns:foo = "" 	TokenNameCOMMENT_LINE	xmlns:foo = "" 
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// xmlns --- empty prefix is always bound ("" or some string) 	TokenNameCOMMENT_LINE	xmlns --- empty prefix is always bound ("" or some string) 
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNSBinder	TokenNameIdentifier	 f NS Binder
.	TokenNameDOT	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end-else: valid declaration 	TokenNameCOMMENT_LINE	end-else: valid declaration 
}	TokenNameRBRACE	
// end-if: namespace declaration 	TokenNameCOMMENT_LINE	end-if: namespace declaration 
}	TokenNameRBRACE	
// end-for 	TokenNameCOMMENT_LINE	end-for 
//----------------------- 	TokenNameCOMMENT_LINE	----------------------- 
// get element uri/prefix 	TokenNameCOMMENT_LINE	get element uri/prefix 
//----------------------- 	TokenNameCOMMENT_LINE	----------------------- 
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//---------------------- 	TokenNameCOMMENT_LINE	---------------------- 
// output element name 	TokenNameCOMMENT_LINE	output element name 
//---------------------- 	TokenNameCOMMENT_LINE	---------------------- 
// REVISIT: this could be removed if we always convert empty string to null 	TokenNameCOMMENT_LINE	REVISIT: this could be removed if we always convert empty string to null 
// for the namespaces. 	TokenNameCOMMENT_LINE	for the namespaces. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// uri is an empty string and element has some prefix 	TokenNameCOMMENT_LINE	uri is an empty string and element has some prefix 
// the namespace alg later will fix up the namespace attributes 	TokenNameCOMMENT_LINE	the namespace alg later will fix up the namespace attributes 
// remove element prefix 	TokenNameCOMMENT_LINE	remove element prefix 
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// --------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------- 
// Fix up namespaces for element: per DOM L3 	TokenNameCOMMENT_LINE	Fix up namespaces for element: per DOM L3 
// Need to consider the following cases: 	TokenNameCOMMENT_LINE	Need to consider the following cases: 
// 	TokenNameCOMMENT_LINE	 
// case 1: <foo:elem xmlns:ns1="myURI" xmlns="default"/> 	TokenNameCOMMENT_LINE	case 1: <foo:elem xmlns:ns1="myURI" xmlns="default"/> 
// Assume "foo", "ns1" are declared on the parent. We should not miss 	TokenNameCOMMENT_LINE	Assume "foo", "ns1" are declared on the parent. We should not miss 
// redeclaration for both "ns1" and default namespace. To solve this 	TokenNameCOMMENT_LINE	redeclaration for both "ns1" and default namespace. To solve this 
// we add a local binder that stores declaration only for current element. 	TokenNameCOMMENT_LINE	we add a local binder that stores declaration only for current element. 
// This way we avoid outputing duplicate declarations for the same element 	TokenNameCOMMENT_LINE	This way we avoid outputing duplicate declarations for the same element 
// as well as we are not omitting redeclarations. 	TokenNameCOMMENT_LINE	as well as we are not omitting redeclarations. 
// 	TokenNameCOMMENT_LINE	 
// case 2: <elem xmlns="" xmlns="default"/> 	TokenNameCOMMENT_LINE	case 2: <elem xmlns="" xmlns="default"/> 
// We need to bind default namespace to empty string, to be able to 	TokenNameCOMMENT_LINE	We need to bind default namespace to empty string, to be able to 
// omit duplicate declarations for the same element 	TokenNameCOMMENT_LINE	omit duplicate declarations for the same element 
// 	TokenNameCOMMENT_LINE	 
// case 3: <xsl:stylesheet xmlns:xsl="http://xsl"> 	TokenNameCOMMENT_LINE	case 3: <xsl:stylesheet xmlns:xsl="http://xsl"> 
// We create another element body bound to the "http://xsl" namespace 	TokenNameCOMMENT_LINE	We create another element body bound to the "http://xsl" namespace 
// as well as namespace attribute rebounding xsl to another namespace. 	TokenNameCOMMENT_LINE	as well as namespace attribute rebounding xsl to another namespace. 
// <xsl:body xmlns:xsl="http://another"> 	TokenNameCOMMENT_LINE	<xsl:body xmlns:xsl="http://another"> 
// Need to make sure that the new namespace decl value is changed to 	TokenNameCOMMENT_LINE	Need to make sure that the new namespace decl value is changed to 
// "http://xsl" 	TokenNameCOMMENT_LINE	"http://xsl" 
// 	TokenNameCOMMENT_LINE	 
// --------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------- 
// check if prefix/namespace is correct for current element 	TokenNameCOMMENT_LINE	check if prefix/namespace is correct for current element 
// --------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------- 
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Element has a namespace 	TokenNameCOMMENT_LINE	Element has a namespace 
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
:	TokenNameCOLON	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fNSBinder	TokenNameIdentifier	 f NS Binder
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The xmlns:prefix=namespace or xmlns="default" was declared at parent. 	TokenNameCOMMENT_LINE	The xmlns:prefix=namespace or xmlns="default" was declared at parent. 
// The binder always stores mapping of empty prefix to "". 	TokenNameCOMMENT_LINE	The binder always stores mapping of empty prefix to "". 
// (NOTE: local binder does not store this kind of binding!) 	TokenNameCOMMENT_LINE	(NOTE: local binder does not store this kind of binding!) 
// Thus the case where element was declared with uri="" (with or without a prefix) 	TokenNameCOMMENT_LINE	Thus the case where element was declared with uri="" (with or without a prefix) 
// will be covered here. 	TokenNameCOMMENT_LINE	will be covered here. 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// the prefix is either undeclared 	TokenNameCOMMENT_LINE	the prefix is either undeclared 
// or 	TokenNameCOMMENT_LINE	or 
// conflict: the prefix is bound to another URI 	TokenNameCOMMENT_LINE	conflict: the prefix is bound to another URI 
if	TokenNameif	
(	TokenNameLPAREN	
fNamespacePrefixes	TokenNameIdentifier	 f Namespace Prefixes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNamespaceAttr	TokenNameIdentifier	 print Namespace Attr
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fLocalNSBinder	TokenNameIdentifier	 f Local NS Binder
.	TokenNameDOT	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNSBinder	TokenNameIdentifier	 f NS Binder
.	TokenNameDOT	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Element has no namespace 	TokenNameCOMMENT_LINE	Element has no namespace 
if	TokenNameif	
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// DOM Level 1 node! 	TokenNameCOMMENT_LINE	DOM Level 1 node! 
if	TokenNameif	
(	TokenNameLPAREN	
fDOMErrorHandler	TokenNameIdentifier	 f DOM Error Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NullLocalElementName"	TokenNameStringLiteral	NullLocalElementName
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
modifyDOMError	TokenNameIdentifier	 modify DOM Error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
DOMError	TokenNameIdentifier	 DOM Error
.	TokenNameDOT	
SEVERITY_ERROR	TokenNameIdentifier	 SEVERITY  ERROR
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
continueProcess	TokenNameIdentifier	 continue Process
=	TokenNameEQUAL	
fDOMErrorHandler	TokenNameIdentifier	 f DOM Error Handler
.	TokenNameDOT	
handleError	TokenNameIdentifier	 handle Error
(	TokenNameLPAREN	
fDOMError	TokenNameIdentifier	 f DOM Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// REVISIT: should we terminate upon request? 	TokenNameCOMMENT_LINE	REVISIT: should we terminate upon request? 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
continueProcess	TokenNameIdentifier	 continue Process
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
SERIALIZER_DOMAIN	TokenNameIdentifier	 SERIALIZER  DOMAIN
,	TokenNameCOMMA	
"SerializationStopped"	TokenNameStringLiteral	SerializationStopped
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// uri=null and no colon (DOM L2 node) 	TokenNameCOMMENT_LINE	uri=null and no colon (DOM L2 node) 
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fNSBinder	TokenNameIdentifier	 f NS Binder
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// there is a default namespace decl that is bound to 	TokenNameCOMMENT_LINE	there is a default namespace decl that is bound to 
// non-zero length uri, output xmlns="" 	TokenNameCOMMENT_LINE	non-zero length uri, output xmlns="" 
if	TokenNameif	
(	TokenNameLPAREN	
fNamespacePrefixes	TokenNameIdentifier	 f Namespace Prefixes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNamespaceAttr	TokenNameIdentifier	 print Namespace Attr
(	TokenNameLPAREN	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
,	TokenNameCOMMA	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fLocalNSBinder	TokenNameIdentifier	 f Local NS Binder
.	TokenNameDOT	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
,	TokenNameCOMMA	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNSBinder	TokenNameIdentifier	 f NS Binder
.	TokenNameDOT	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
,	TokenNameCOMMA	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ----------------------------------------- 	TokenNameCOMMENT_LINE	----------------------------------------- 
// Fix up namespaces for attributes: per DOM L3 	TokenNameCOMMENT_LINE	Fix up namespaces for attributes: per DOM L3 
// check if prefix/namespace is correct the attributes 	TokenNameCOMMENT_LINE	check if prefix/namespace is correct the attributes 
// ----------------------------------------- 	TokenNameCOMMENT_LINE	----------------------------------------- 
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fix attribute that was declared with a prefix and namespace="" 	TokenNameCOMMENT_LINE	Fix attribute that was declared with a prefix and namespace="" 
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// we must remove prefix for this attribute 	TokenNameCOMMENT_LINE	we must remove prefix for this attribute 
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>process attribute: "	TokenNameStringLiteral	==>process attribute: 
+	TokenNamePLUS	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// make sure that value is never null. 	TokenNameCOMMENT_LINE	make sure that value is never null. 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// attribute has namespace !=null 	TokenNameCOMMENT_LINE	attribute has namespace !=null 
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
:	TokenNameCOLON	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// --------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------- 
// print namespace declarations namespace declarations 	TokenNameCOMMENT_LINE	print namespace declarations namespace declarations 
// --------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------- 
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check if we need to output this declaration 	TokenNameCOMMENT_LINE	check if we need to output this declaration 
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
:	TokenNameCOLON	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//xmlns:prefix 	TokenNameCOMMENT_LINE	xmlns:prefix 
localUri	TokenNameIdentifier	 local Uri
=	TokenNameEQUAL	
fLocalNSBinder	TokenNameIdentifier	 f Local NS Binder
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
localpart	TokenNameIdentifier	 localpart
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// local prefix mapping 	TokenNameCOMMENT_LINE	local prefix mapping 
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
localUri	TokenNameIdentifier	 local Uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// declaration was not printed while fixing element namespace binding 	TokenNameCOMMENT_LINE	declaration was not printed while fixing element namespace binding 
// If the DOM Level 3 namespace-prefixes feature is set to false 	TokenNameCOMMENT_LINE	If the DOM Level 3 namespace-prefixes feature is set to false 
// do not print xmlns attributes 	TokenNameCOMMENT_LINE	do not print xmlns attributes 
if	TokenNameif	
(	TokenNameLPAREN	
fNamespacePrefixes	TokenNameIdentifier	 f Namespace Prefixes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNamespaceAttr	TokenNameIdentifier	 print Namespace Attr
(	TokenNameLPAREN	
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// case 4: <elem xmlns:xx="foo" xx:attr=""/> 	TokenNameCOMMENT_LINE	case 4: <elem xmlns:xx="foo" xx:attr=""/> 
// where attribute is bound to "bar". 	TokenNameCOMMENT_LINE	where attribute is bound to "bar". 
// If the xmlns:xx is output here first, later we should not 	TokenNameCOMMENT_LINE	If the xmlns:xx is output here first, later we should not 
// redeclare "xx" prefix. Instead we would pick up different prefix 	TokenNameCOMMENT_LINE	redeclare "xx" prefix. Instead we would pick up different prefix 
// for the attribute. 	TokenNameCOMMENT_LINE	for the attribute. 
// final: <elem xmlns:xx="foo" NS1:attr="" xmlns:NS1="bar"/> 	TokenNameCOMMENT_LINE	final: <elem xmlns:xx="foo" NS1:attr="" xmlns:NS1="bar"/> 
fLocalNSBinder	TokenNameIdentifier	 f Local NS Binder
.	TokenNameDOT	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// REVISIT: issue error on invalid declarations 	TokenNameCOMMENT_LINE	REVISIT: issue error on invalid declarations 
// xmlns:foo = "" 	TokenNameCOMMENT_LINE	xmlns:foo = "" 
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// xmlns --- empty prefix is always bound ("" or some string) 	TokenNameCOMMENT_LINE	xmlns --- empty prefix is always bound ("" or some string) 
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fNSBinder	TokenNameIdentifier	 f NS Binder
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localUri	TokenNameIdentifier	 local Uri
=	TokenNameEQUAL	
fLocalNSBinder	TokenNameIdentifier	 f Local NS Binder
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
localUri	TokenNameIdentifier	 local Uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// declaration was not printed while fixing element namespace binding 	TokenNameCOMMENT_LINE	declaration was not printed while fixing element namespace binding 
if	TokenNameif	
(	TokenNameLPAREN	
fNamespacePrefixes	TokenNameIdentifier	 f Namespace Prefixes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNamespaceAttr	TokenNameIdentifier	 print Namespace Attr
(	TokenNameLPAREN	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// case 4 does not apply here since attributes can't use 	TokenNameCOMMENT_LINE	case 4 does not apply here since attributes can't use 
// default namespace 	TokenNameCOMMENT_LINE	default namespace 
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find if for this prefix a URI was already declared 	TokenNameCOMMENT_LINE	find if for this prefix a URI was already declared 
String	TokenNameIdentifier	 String
declaredURI	TokenNameIdentifier	 declared URI
=	TokenNameEQUAL	
fNSBinder	TokenNameIdentifier	 f NS Binder
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
||	TokenNameOR_OR	
declaredURI	TokenNameIdentifier	 declared URI
!=	TokenNameNOT_EQUAL	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// attribute has no prefix (default namespace decl does not apply to attributes) 	TokenNameCOMMENT_LINE	attribute has no prefix (default namespace decl does not apply to attributes) 
// OR 	TokenNameCOMMENT_LINE	OR 
// attribute prefix is not declared 	TokenNameCOMMENT_LINE	attribute prefix is not declared 
// OR 	TokenNameCOMMENT_LINE	OR 
// conflict: attr URI does not match the prefix in scope 	TokenNameCOMMENT_LINE	conflict: attr URI does not match the prefix in scope 
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Find if any prefix for attributes namespace URI is available 	TokenNameCOMMENT_LINE	Find if any prefix for attributes namespace URI is available 
// in the scope 	TokenNameCOMMENT_LINE	in the scope 
String	TokenNameIdentifier	 String
declaredPrefix	TokenNameIdentifier	 declared Prefix
=	TokenNameEQUAL	
fNSBinder	TokenNameIdentifier	 f NS Binder
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
declaredPrefix	TokenNameIdentifier	 declared Prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
declaredPrefix	TokenNameIdentifier	 declared Prefix
!=	TokenNameNOT_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// use the prefix that was found 	TokenNameCOMMENT_LINE	use the prefix that was found 
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
declaredPrefix	TokenNameIdentifier	 declared Prefix
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
localpart	TokenNameIdentifier	 localpart
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==> cound not find prefix for the attribute: "	TokenNameStringLiteral	==> cound not find prefix for the attribute: 
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
&&	TokenNameAND_AND	
fLocalNSBinder	TokenNameIdentifier	 f Local NS Binder
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the current prefix is not null and it has no in scope declaration 	TokenNameCOMMENT_LINE	the current prefix is not null and it has no in scope declaration 
// use this prefix 	TokenNameCOMMENT_LINE	use this prefix 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// find a prefix following the pattern "NS" +index (starting at 1) 	TokenNameCOMMENT_LINE	find a prefix following the pattern "NS" +index (starting at 1) 
// make sure this prefix is not declared in the current scope. 	TokenNameCOMMENT_LINE	make sure this prefix is not declared in the current scope. 
int	TokenNameint	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
PREFIX	TokenNameIdentifier	 PREFIX
+	TokenNamePLUS	
counter	TokenNameIdentifier	 counter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
fLocalNSBinder	TokenNameIdentifier	 f Local NS Binder
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
PREFIX	TokenNameIdentifier	 PREFIX
+	TokenNamePLUS	
counter	TokenNameIdentifier	 counter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
localpart	TokenNameIdentifier	 localpart
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// add declaration for the new prefix 	TokenNameCOMMENT_LINE	add declaration for the new prefix 
if	TokenNameif	
(	TokenNameLPAREN	
fNamespacePrefixes	TokenNameIdentifier	 f Namespace Prefixes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printNamespaceAttr	TokenNameIdentifier	 print Namespace Attr
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fLocalNSBinder	TokenNameIdentifier	 f Local NS Binder
.	TokenNameDOT	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNSBinder	TokenNameIdentifier	 f NS Binder
.	TokenNameDOT	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// change prefix for this attribute 	TokenNameCOMMENT_LINE	change prefix for this attribute 
}	TokenNameRBRACE	
printAttribute	TokenNameIdentifier	 print Attribute
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
:	TokenNameCOLON	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getSpecified	TokenNameIdentifier	 get Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// attribute uri == null 	TokenNameCOMMENT_LINE	attribute uri == null 
if	TokenNameif	
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDOMErrorHandler	TokenNameIdentifier	 f DOM Error Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NullLocalAttrName"	TokenNameStringLiteral	NullLocalAttrName
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
modifyDOMError	TokenNameIdentifier	 modify DOM Error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
DOMError	TokenNameIdentifier	 DOM Error
.	TokenNameDOT	
SEVERITY_ERROR	TokenNameIdentifier	 SEVERITY  ERROR
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
continueProcess	TokenNameIdentifier	 continue Process
=	TokenNameEQUAL	
fDOMErrorHandler	TokenNameIdentifier	 f DOM Error Handler
.	TokenNameDOT	
handleError	TokenNameIdentifier	 handle Error
(	TokenNameLPAREN	
fDOMError	TokenNameIdentifier	 f DOM Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
continueProcess	TokenNameIdentifier	 continue Process
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// stop the namespace fixup and validation 	TokenNameCOMMENT_LINE	stop the namespace fixup and validation 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
SERIALIZER_DOMAIN	TokenNameIdentifier	 SERIALIZER  DOMAIN
,	TokenNameCOMMA	
"SerializationStopped"	TokenNameStringLiteral	SerializationStopped
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
printAttribute	TokenNameIdentifier	 print Attribute
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getSpecified	TokenNameIdentifier	 get Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// uri=null and no colon 	TokenNameCOMMENT_LINE	uri=null and no colon 
// no fix up is needed: default namespace decl does not 	TokenNameCOMMENT_LINE	no fix up is needed: default namespace decl does not 
// apply to attributes 	TokenNameCOMMENT_LINE	apply to attributes 
printAttribute	TokenNameIdentifier	 print Attribute
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getSpecified	TokenNameIdentifier	 get Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end loop for attributes 	TokenNameCOMMENT_LINE	end loop for attributes 
}	TokenNameRBRACE	
// end namespace fixup algorithm 	TokenNameCOMMENT_LINE	end namespace fixup algorithm 
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
fPreserveSpace	TokenNameIdentifier	 f Preserve Space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
doCData	TokenNameIdentifier	 do C Data
=	TokenNameEQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
isCDataElement	TokenNameIdentifier	 is C Data Element
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
unescaped	TokenNameIdentifier	 unescaped
=	TokenNameEQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
isNonEscapingElement	TokenNameIdentifier	 is Non Escaping Element
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
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
if	TokenNameif	
(	TokenNameLPAREN	
fNamespaces	TokenNameIdentifier	 f Namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNSBinder	TokenNameIdentifier	 f NS Binder
.	TokenNameDOT	
popContext	TokenNameIdentifier	 pop Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
endElementIO	TokenNameIdentifier	 end Element IO
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>endElement: "	TokenNameStringLiteral	==>endElement: 
+	TokenNamePLUS	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespaces	TokenNameIdentifier	 f Namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNSBinder	TokenNameIdentifier	 f NS Binder
.	TokenNameDOT	
popContext	TokenNameIdentifier	 pop Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
unindent	TokenNameIdentifier	 unindent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"/>"	TokenNameStringLiteral	/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// After element but parent element is no longer empty. 	TokenNameCOMMENT_LINE	After element but parent element is no longer empty. 
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterElement	TokenNameIdentifier	 after Element
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterComment	TokenNameIdentifier	 after Comment
=	TokenNameEQUAL	
false	TokenNamefalse	
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
}	TokenNameRBRACE	
/** * Serializes a namespace attribute with the given prefix and value for URI. * In case prefix is empty will serialize default namespace declaration. * * @param prefix * @param uri * @exception IOException */	TokenNameCOMMENT_JAVADOC	 Serializes a namespace attribute with the given prefix and value for URI. In case prefix is empty will serialize default namespace declaration. * @param prefix @param uri @exception IOException 
private	TokenNameprivate	
void	TokenNamevoid	
printNamespaceAttr	TokenNameIdentifier	 print Namespace Attr
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printSpace	TokenNameIdentifier	 print Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"=>add xmlns=""	TokenNameStringLiteral	=>add xmlns="
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
"" declaration"	TokenNameStringLiteral	" declaration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"=>add xmlns:"	TokenNameStringLiteral	=>add xmlns:
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
"=""	TokenNameStringLiteral	="
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
"" declaration"	TokenNameStringLiteral	" declaration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"xmlns:"	TokenNameStringLiteral	xmlns:
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"=""	TokenNameStringLiteral	="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printEscaped	TokenNameIdentifier	 print Escaped
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints attribute. * NOTE: xml:space attribute modifies output format * * @param name * @param value * @param isSpecified * @exception IOException */	TokenNameCOMMENT_JAVADOC	 Prints attribute. NOTE: xml:space attribute modifies output format * @param name @param value @param isSpecified @exception IOException 
private	TokenNameprivate	
void	TokenNamevoid	
printAttribute	TokenNameIdentifier	 print Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isSpecified	TokenNameIdentifier	 is Specified
,	TokenNameCOMMA	
Attr	TokenNameIdentifier	 Attr
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSpecified	TokenNameIdentifier	 is Specified
||	TokenNameOR_OR	
(	TokenNameLPAREN	
features	TokenNameIdentifier	 features
&	TokenNameAND	
DOMSerializerImpl	TokenNameIdentifier	 DOM Serializer Impl
.	TokenNameDOT	
DISCARDDEFAULT	TokenNameIdentifier	 DISCARDDEFAULT
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDOMFilter	TokenNameIdentifier	 f DOM Filter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fDOMFilter	TokenNameIdentifier	 f DOM Filter
.	TokenNameDOT	
getWhatToShow	TokenNameIdentifier	 get What To Show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
SHOW_ATTRIBUTE	TokenNameIdentifier	 SHOW  ATTRIBUTE
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
fDOMFilter	TokenNameIdentifier	 f DOM Filter
.	TokenNameDOT	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_REJECT	TokenNameIdentifier	 FILTER  REJECT
:	TokenNameCOLON	
case	TokenNamecase	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
// fall through 	TokenNameCOMMENT_LINE	fall through 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printSpace	TokenNameIdentifier	 print Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"=""	TokenNameStringLiteral	="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printEscaped	TokenNameIdentifier	 print Escaped
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If the attribute xml:space exists, determine whether 	TokenNameCOMMENT_LINE	If the attribute xml:space exists, determine whether 
// to preserve spaces in this and child nodes based on 	TokenNameCOMMENT_LINE	to preserve spaces in this and child nodes based on 
// its value. 	TokenNameCOMMENT_LINE	its value. 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xml:space"	TokenNameStringLiteral	xml:space
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"preserve"	TokenNameStringLiteral	preserve
)	TokenNameRPAREN	
)	TokenNameRPAREN	
fPreserveSpace	TokenNameIdentifier	 f Preserve Space
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fPreserveSpace	TokenNameIdentifier	 f Preserve Space
=	TokenNameEQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getPreserveSpace	TokenNameIdentifier	 get Preserve Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getEntityRef	TokenNameIdentifier	 get Entity Ref
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Encode special XML characters into the equivalent character references. 	TokenNameCOMMENT_LINE	Encode special XML characters into the equivalent character references. 
// These five are defined by default for all XML documents. 	TokenNameCOMMENT_LINE	These five are defined by default for all XML documents. 
switch	TokenNameswitch	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'<'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
"lt"	TokenNameStringLiteral	lt
;	TokenNameSEMICOLON	
case	TokenNamecase	
'>'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
"gt"	TokenNameStringLiteral	gt
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
"quot"	TokenNameStringLiteral	quot
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
"apos"	TokenNameStringLiteral	apos
;	TokenNameSEMICOLON	
case	TokenNamecase	
'&'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
"amp"	TokenNameStringLiteral	amp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Retrieve and remove the namespaces declarations from the list of attributes. * */	TokenNameCOMMENT_JAVADOC	 Retrieve and remove the namespaces declarations from the list of attributes. 
private	TokenNameprivate	
Attributes	TokenNameIdentifier	 Attributes
extractNamespaces	TokenNameIdentifier	 extract Namespaces
(	TokenNameLPAREN	
Attributes	TokenNameIdentifier	 Attributes
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
AttributesImpl	TokenNameIdentifier	 Attributes Impl
attrsOnly	TokenNameIdentifier	 attrs Only
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrsOnly	TokenNameIdentifier	 attrs Only
=	TokenNameEQUAL	
new	TokenNamenew	
AttributesImpl	TokenNameIdentifier	 Attributes Impl
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rawName	TokenNameIdentifier	 raw Name
=	TokenNameEQUAL	
attrsOnly	TokenNameIdentifier	 attrs Only
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//We have to exclude the namespaces declarations from the attributes 	TokenNameCOMMENT_LINE	We have to exclude the namespaces declarations from the attributes 
//Append only when the feature http://xml.org/sax/features/namespace-prefixes" 	TokenNameCOMMENT_LINE	Append only when the feature http://xml.org/sax/features/namespace-prefixes" 
//is TRUE 	TokenNameCOMMENT_LINE	is TRUE 
if	TokenNameif	
(	TokenNameLPAREN	
rawName	TokenNameIdentifier	 raw Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rawName	TokenNameIdentifier	 raw Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrsOnly	TokenNameIdentifier	 attrs Only
.	TokenNameDOT	
removeAttribute	TokenNameIdentifier	 remove Attribute
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
rawName	TokenNameIdentifier	 raw Name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
rawName	TokenNameIdentifier	 raw Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrsOnly	TokenNameIdentifier	 attrs Only
.	TokenNameDOT	
removeAttribute	TokenNameIdentifier	 remove Attribute
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
attrsOnly	TokenNameIdentifier	 attrs Only
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Printing attribute value 	TokenNameCOMMENT_LINE	Printing attribute value 
// 	TokenNameCOMMENT_LINE	 
protected	TokenNameprotected	
void	TokenNamevoid	
printEscaped	TokenNameIdentifier	 print Escaped
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
surrogates	TokenNameIdentifier	 surrogates
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"The character '"	TokenNameStringLiteral	The character '
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
+	TokenNamePLUS	
"' is an invalid XML character"	TokenNameStringLiteral	' is an invalid XML character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// escape NL, CR, TAB 	TokenNameCOMMENT_LINE	escape NL, CR, TAB 
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printHex	TokenNameIdentifier	 print Hex
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"&lt;"	TokenNameStringLiteral	&lt;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"&amp;"	TokenNameStringLiteral	&amp;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"&quot;"	TokenNameStringLiteral	&quot;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
' '	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
_encodingInfo	TokenNameIdentifier	 encoding Info
.	TokenNameDOT	
isPrintable	TokenNameIdentifier	 is Printable
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
printHex	TokenNameIdentifier	 print Hex
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** print text data */	TokenNameCOMMENT_JAVADOC	 print text data 
protected	TokenNameprotected	
void	TokenNamevoid	
printXMLChar	TokenNameIdentifier	 print XML Char
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printHex	TokenNameIdentifier	 print Hex
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"&lt;"	TokenNameStringLiteral	&lt;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"&amp;"	TokenNameStringLiteral	&amp;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// character sequence "]]>" can't appear in content, therefore 	TokenNameCOMMENT_LINE	character sequence "]]>" can't appear in content, therefore 
// we should escape '>' 	TokenNameCOMMENT_LINE	we should escape '>' 
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"&gt;"	TokenNameStringLiteral	&gt;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\t'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
' '	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
_encodingInfo	TokenNameIdentifier	 encoding Info
.	TokenNameDOT	
isPrintable	TokenNameIdentifier	 is Printable
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
printHex	TokenNameIdentifier	 print Hex
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
boolean	TokenNameboolean	
preserveSpace	TokenNameIdentifier	 preserve Space
,	TokenNameCOMMA	
boolean	TokenNameboolean	
unescaped	TokenNameIdentifier	 unescaped
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
preserveSpace	TokenNameIdentifier	 preserve Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Preserving spaces: the text must print exactly as it is, 	TokenNameCOMMENT_LINE	Preserving spaces: the text must print exactly as it is, 
// without breaking when spaces appear in the text and without 	TokenNameCOMMENT_LINE	without breaking when spaces appear in the text and without 
// consolidating spaces. If a line terminator is used, a line 	TokenNameCOMMENT_LINE	consolidating spaces. If a line terminator is used, a line 
// break will occur. 	TokenNameCOMMENT_LINE	break will occur. 
for	TokenNamefor	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check if it is surrogate 	TokenNameCOMMENT_LINE	check if it is surrogate 
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
surrogates	TokenNameIdentifier	 surrogates
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"The character '"	TokenNameStringLiteral	The character '
+	TokenNamePLUS	
ch	TokenNameIdentifier	 ch
+	TokenNamePLUS	
"' is an invalid XML character"	TokenNameStringLiteral	' is an invalid XML character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
unescaped	TokenNameIdentifier	 unescaped
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
printXMLChar	TokenNameIdentifier	 print XML Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Not preserving spaces: print one part at a time, and 	TokenNameCOMMENT_LINE	Not preserving spaces: print one part at a time, and 
// use spaces between parts to break them into different 	TokenNameCOMMENT_LINE	use spaces between parts to break them into different 
// lines. Spaces at beginning of line will be stripped 	TokenNameCOMMENT_LINE	lines. Spaces at beginning of line will be stripped 
// by printing mechanism. Line terminator is treated 	TokenNameCOMMENT_LINE	by printing mechanism. Line terminator is treated 
// no different than other text part. 	TokenNameCOMMENT_LINE	no different than other text part. 
for	TokenNamefor	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check if it is surrogate 	TokenNameCOMMENT_LINE	check if it is surrogate 
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
surrogates	TokenNameIdentifier	 surrogates
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"The character '"	TokenNameStringLiteral	The character '
+	TokenNamePLUS	
ch	TokenNameIdentifier	 ch
+	TokenNamePLUS	
"' is an invalid XML character"	TokenNameStringLiteral	' is an invalid XML character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
unescaped	TokenNameIdentifier	 unescaped
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
printXMLChar	TokenNameIdentifier	 print XML Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
printText	TokenNameIdentifier	 print Text
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
,	TokenNameCOMMA	
boolean	TokenNameboolean	
preserveSpace	TokenNameIdentifier	 preserve Space
,	TokenNameCOMMA	
boolean	TokenNameboolean	
unescaped	TokenNameIdentifier	 unescaped
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
preserveSpace	TokenNameIdentifier	 preserve Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Preserving spaces: the text must print exactly as it is, 	TokenNameCOMMENT_LINE	Preserving spaces: the text must print exactly as it is, 
// without breaking when spaces appear in the text and without 	TokenNameCOMMENT_LINE	without breaking when spaces appear in the text and without 
// consolidating spaces. If a line terminator is used, a line 	TokenNameCOMMENT_LINE	consolidating spaces. If a line terminator is used, a line 
// break will occur. 	TokenNameCOMMENT_LINE	break will occur. 
while	TokenNamewhile	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check if it is surrogate 	TokenNameCOMMENT_LINE	check if it is surrogate 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
surrogates	TokenNameIdentifier	 surrogates
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"The character '"	TokenNameStringLiteral	The character '
+	TokenNamePLUS	
ch	TokenNameIdentifier	 ch
+	TokenNamePLUS	
"' is an invalid XML character"	TokenNameStringLiteral	' is an invalid XML character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
unescaped	TokenNameIdentifier	 unescaped
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
printXMLChar	TokenNameIdentifier	 print XML Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Not preserving spaces: print one part at a time, and 	TokenNameCOMMENT_LINE	Not preserving spaces: print one part at a time, and 
// use spaces between parts to break them into different 	TokenNameCOMMENT_LINE	use spaces between parts to break them into different 
// lines. Spaces at beginning of line will be stripped 	TokenNameCOMMENT_LINE	lines. Spaces at beginning of line will be stripped 
// by printing mechanism. Line terminator is treated 	TokenNameCOMMENT_LINE	by printing mechanism. Line terminator is treated 
// no different than other text part. 	TokenNameCOMMENT_LINE	no different than other text part. 
while	TokenNamewhile	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check if it is surrogate 	TokenNameCOMMENT_LINE	check if it is surrogate 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
surrogates	TokenNameIdentifier	 surrogates
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"The character '"	TokenNameStringLiteral	The character '
+	TokenNamePLUS	
ch	TokenNameIdentifier	 ch
+	TokenNamePLUS	
"' is an invalid XML character"	TokenNameStringLiteral	' is an invalid XML character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
unescaped	TokenNameIdentifier	 unescaped
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
printXMLChar	TokenNameIdentifier	 print XML Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * DOM Level 3: * Check a node to determine if it contains unbound namespace prefixes. * * @param node The node to check for unbound namespace prefices */	TokenNameCOMMENT_JAVADOC	 DOM Level 3: Check a node to determine if it contains unbound namespace prefixes. * @param node The node to check for unbound namespace prefices 
protected	TokenNameprotected	
void	TokenNamevoid	
checkUnboundNamespacePrefixedNode	TokenNameIdentifier	 check Unbound Namespace Prefixed Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespaces	TokenNameIdentifier	 f Namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>serializeNode("	TokenNameStringLiteral	==>serializeNode(
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
") [Entity Reference - Namespaces on]"	TokenNameStringLiteral	) [Entity Reference - Namespaces on]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>Declared Prefix Count: "	TokenNameStringLiteral	==>Declared Prefix Count: 
+	TokenNamePLUS	
fNSBinder	TokenNameIdentifier	 f NS Binder
.	TokenNameDOT	
getDeclaredPrefixCount	TokenNameIdentifier	 get Declared Prefix Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>Node Name: "	TokenNameStringLiteral	==>Node Name: 
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>First Child Node Name: "	TokenNameStringLiteral	==>First Child Node Name: 
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>First Child Node Prefix: "	TokenNameStringLiteral	==>First Child Node Prefix: 
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>First Child Node NamespaceURI: "	TokenNameStringLiteral	==>First Child Node NamespaceURI: 
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>serializeNode("	TokenNameStringLiteral	==>serializeNode(
+	TokenNamePLUS	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
") [Child Node]"	TokenNameStringLiteral	) [Child Node]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>serializeNode("	TokenNameStringLiteral	==>serializeNode(
+	TokenNamePLUS	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
") [Child Node Prefix]"	TokenNameStringLiteral	) [Child Node Prefix]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//If a NamespaceURI is not declared for the current 	TokenNameCOMMENT_LINE	If a NamespaceURI is not declared for the current 
//node's prefix, raise a fatal error. 	TokenNameCOMMENT_LINE	node's prefix, raise a fatal error. 
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
:	TokenNameCOLON	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fNSBinder	TokenNameIdentifier	 f NS Binder
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"The replacement text of the entity node '"	TokenNameStringLiteral	The replacement text of the entity node '
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' contains an element node '"	TokenNameStringLiteral	' contains an element node '
+	TokenNamePLUS	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' with an undeclared prefix '"	TokenNameStringLiteral	' with an undeclared prefix '
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
"'."	TokenNameStringLiteral	'.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
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
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
attrPrefix	TokenNameIdentifier	 attr Prefix
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrPrefix	TokenNameIdentifier	 attr Prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
attrPrefix	TokenNameIdentifier	 attr Prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
attrPrefix	TokenNameIdentifier	 attr Prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
:	TokenNameCOLON	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
attrPrefix	TokenNameIdentifier	 attr Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fNSBinder	TokenNameIdentifier	 f NS Binder
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
attrPrefix	TokenNameIdentifier	 attr Prefix
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
attrPrefix	TokenNameIdentifier	 attr Prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"The replacement text of the entity node '"	TokenNameStringLiteral	The replacement text of the entity node '
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' contains an element node '"	TokenNameStringLiteral	' contains an element node '
+	TokenNamePLUS	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' with an attribute '"	TokenNameStringLiteral	' with an attribute '
+	TokenNamePLUS	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' an undeclared prefix '"	TokenNameStringLiteral	' an undeclared prefix '
+	TokenNamePLUS	
attrPrefix	TokenNameIdentifier	 attr Prefix
+	TokenNamePLUS	
"'."	TokenNameStringLiteral	'.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkUnboundNamespacePrefixedNode	TokenNameIdentifier	 check Unbound Namespace Prefixed Node
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fNSBinder	TokenNameIdentifier	 f NS Binder
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNSBinder	TokenNameIdentifier	 f NS Binder
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// during serialization always have a mapping to empty string 	TokenNameCOMMENT_LINE	during serialization always have a mapping to empty string 
// so we assume there is a declaration. 	TokenNameCOMMENT_LINE	so we assume there is a declaration. 
fNSBinder	TokenNameIdentifier	 f NS Binder
.	TokenNameDOT	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
,	TokenNameCOMMA	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
