/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Sep 14, 2000: 	TokenNameCOMMENT_LINE	Sep 14, 2000: 
// Fixed serializer to report IO exception directly, instead at 	TokenNameCOMMENT_LINE	Fixed serializer to report IO exception directly, instead at 
// the end of document processing. 	TokenNameCOMMENT_LINE	the end of document processing. 
// Reported by Patrick Higgins <phiggins@transzap.com> 	TokenNameCOMMENT_LINE	Reported by Patrick Higgins <phiggins@transzap.com> 
// Aug 21, 2000: 	TokenNameCOMMENT_LINE	Aug 21, 2000: 
// Fixed bug in startDocument not calling prepare. 	TokenNameCOMMENT_LINE	Fixed bug in startDocument not calling prepare. 
// Reported by Mikael Staldal <d96-mst-ingen-reklam@d.kth.se> 	TokenNameCOMMENT_LINE	Reported by Mikael Staldal <d96-mst-ingen-reklam@d.kth.se> 
// Aug 21, 2000: 	TokenNameCOMMENT_LINE	Aug 21, 2000: 
// Added ability to omit DOCTYPE declaration. 	TokenNameCOMMENT_LINE	Added ability to omit DOCTYPE declaration. 
// Sep 1, 2000: 	TokenNameCOMMENT_LINE	Sep 1, 2000: 
// If no output format is provided the serializer now defaults 	TokenNameCOMMENT_LINE	If no output format is provided the serializer now defaults 
// to ISO-8859-1 encoding. Reported by Mikael Staldal 	TokenNameCOMMENT_LINE	to ISO-8859-1 encoding. Reported by Mikael Staldal 
// <d96-mst@d.kth.se> 	TokenNameCOMMENT_LINE	<d96-mst@d.kth.se> 
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
Locale	TokenNameIdentifier	 Locale
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
/** * Implements an HTML/XHTML serializer supporting both DOM and SAX * pretty serializing. HTML/XHTML mode is determined in the * constructor. For usage instructions see {@link Serializer}. * <p> * If an output stream is used, the encoding is taken from the * output format (defaults to <tt>UTF-8</tt>). If a writer is * used, make sure the writer uses the same encoding (if applies) * as specified in the output format. * <p> * The serializer supports both DOM and SAX. DOM serializing is done * by calling {@link #serialize} and SAX serializing is done by firing * SAX events and using the serializer as a document handler. * <p> * If an I/O exception occurs while serializing, the serializer * will not throw an exception directly, but only throw it * at the end of serializing (either DOM or SAX's {@link * org.xml.sax.DocumentHandler#endDocument}. * <p> * For elements that are not specified as whitespace preserving, * the serializer will potentially break long text lines at space * boundaries, indent lines, and serialize elements on separate * lines. Line terminators will be regarded as spaces, and * spaces at beginning of line will be stripped. * <p> * XHTML is slightly different than HTML: * <ul> * <li>Element/attribute names are lower case and case matters * <li>Attributes must specify value, even if empty string * <li>Empty elements must have '/' in empty tag * <li>Contents of SCRIPT and STYLE elements serialized as CDATA * </ul> * * @deprecated This class was deprecated in Xerces 2.6.2. It is * recommended that new applications use JAXP's Transformation API * for XML (TrAX) for serializing HTML. See the Xerces documentation * for more information. * @version $Revision: 704573 $ $Date: 2008-10-14 12:11:22 -0400 (Tue, 14 Oct 2008) $ * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> * @see Serializer */	TokenNameCOMMENT_JAVADOC	 Implements an HTML/XHTML serializer supporting both DOM and SAX pretty serializing. HTML/XHTML mode is determined in the constructor. For usage instructions see {@link Serializer}. <p> If an output stream is used, the encoding is taken from the output format (defaults to <tt>UTF-8</tt>). If a writer is used, make sure the writer uses the same encoding (if applies) as specified in the output format. <p> The serializer supports both DOM and SAX. DOM serializing is done by calling {@link #serialize} and SAX serializing is done by firing SAX events and using the serializer as a document handler. <p> If an I/O exception occurs while serializing, the serializer will not throw an exception directly, but only throw it at the end of serializing (either DOM or SAX's {@link org.xml.sax.DocumentHandler#endDocument}. <p> For elements that are not specified as whitespace preserving, the serializer will potentially break long text lines at space boundaries, indent lines, and serialize elements on separate lines. Line terminators will be regarded as spaces, and spaces at beginning of line will be stripped. <p> XHTML is slightly different than HTML: <ul> <li>Element/attribute names are lower case and case matters <li>Attributes must specify value, even if empty string <li>Empty elements must have '/' in empty tag <li>Contents of SCRIPT and STYLE elements serialized as CDATA </ul> * @deprecated This class was deprecated in Xerces 2.6.2. It is recommended that new applications use JAXP's Transformation API for XML (TrAX) for serializing HTML. See the Xerces documentation for more information. @version $Revision: 704573 $ $Date: 2008-10-14 12:11:22 -0400 (Tue, 14 Oct 2008) $ @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> @see Serializer 
public	TokenNamepublic	
class	TokenNameclass	
HTMLSerializer	TokenNameIdentifier	 HTML Serializer
extends	TokenNameextends	
BaseMarkupSerializer	TokenNameIdentifier	 Base Markup Serializer
{	TokenNameLBRACE	
/** * True if serializing in XHTML format. */	TokenNameCOMMENT_JAVADOC	 True if serializing in XHTML format. 
private	TokenNameprivate	
boolean	TokenNameboolean	
_xhtml	TokenNameIdentifier	 xhtml
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XHTMLNamespace	TokenNameIdentifier	 XHTML Namespace
=	TokenNameEQUAL	
"http://www.w3.org/1999/xhtml"	TokenNameStringLiteral	http://www.w3.org/1999/xhtml
;	TokenNameSEMICOLON	
// for users to override XHTMLNamespace if need be. 	TokenNameCOMMENT_LINE	for users to override XHTMLNamespace if need be. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fUserXHTMLNamespace	TokenNameIdentifier	 f User XHTML Namespace
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Constructs a new HTML/XHTML serializer depending on the value of * <tt>xhtml</tt>. The serializer cannot be used without calling * {@link #setOutputCharStream} or {@link #setOutputByteStream} first. * * @param xhtml True if XHTML serializing */	TokenNameCOMMENT_JAVADOC	 Constructs a new HTML/XHTML serializer depending on the value of <tt>xhtml</tt>. The serializer cannot be used without calling {@link #setOutputCharStream} or {@link #setOutputByteStream} first. * @param xhtml True if XHTML serializing 
protected	TokenNameprotected	
HTMLSerializer	TokenNameIdentifier	 HTML Serializer
(	TokenNameLPAREN	
boolean	TokenNameboolean	
xhtml	TokenNameIdentifier	 xhtml
,	TokenNameCOMMA	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_xhtml	TokenNameIdentifier	 xhtml
=	TokenNameEQUAL	
xhtml	TokenNameIdentifier	 xhtml
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new serializer. The serializer cannot be used without * calling {@link #setOutputCharStream} or {@link #setOutputByteStream} * first. */	TokenNameCOMMENT_JAVADOC	 Constructs a new serializer. The serializer cannot be used without calling {@link #setOutputCharStream} or {@link #setOutputByteStream} first. 
public	TokenNamepublic	
HTMLSerializer	TokenNameIdentifier	 HTML Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
new	TokenNamenew	
OutputFormat	TokenNameIdentifier	 Output Format
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
HTML	TokenNameIdentifier	 HTML
,	TokenNameCOMMA	
"ISO-8859-1"	TokenNameStringLiteral	ISO-8859-1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new serializer. The serializer cannot be used without * calling {@link #setOutputCharStream} or {@link #setOutputByteStream} * first. */	TokenNameCOMMENT_JAVADOC	 Constructs a new serializer. The serializer cannot be used without calling {@link #setOutputCharStream} or {@link #setOutputByteStream} first. 
public	TokenNamepublic	
HTMLSerializer	TokenNameIdentifier	 HTML Serializer
(	TokenNameLPAREN	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
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
HTML	TokenNameIdentifier	 HTML
,	TokenNameCOMMA	
"ISO-8859-1"	TokenNameStringLiteral	ISO-8859-1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new serializer that writes to the specified writer * using the specified output format. If <tt>format</tt> is null, * will use a default output format. * * @param writer The writer to use * @param format The output format to use, null for the default */	TokenNameCOMMENT_JAVADOC	 Constructs a new serializer that writes to the specified writer using the specified output format. If <tt>format</tt> is null, will use a default output format. * @param writer The writer to use @param format The output format to use, null for the default 
public	TokenNamepublic	
HTMLSerializer	TokenNameIdentifier	 HTML Serializer
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
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
HTML	TokenNameIdentifier	 HTML
,	TokenNameCOMMA	
"ISO-8859-1"	TokenNameStringLiteral	ISO-8859-1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
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
HTMLSerializer	TokenNameIdentifier	 HTML Serializer
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
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
HTML	TokenNameIdentifier	 HTML
,	TokenNameCOMMA	
"ISO-8859-1"	TokenNameStringLiteral	ISO-8859-1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
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
HTML	TokenNameIdentifier	 HTML
,	TokenNameCOMMA	
"ISO-8859-1"	TokenNameStringLiteral	ISO-8859-1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Set value for alternate XHTML namespace. 	TokenNameCOMMENT_LINE	Set value for alternate XHTML namespace. 
public	TokenNamepublic	
void	TokenNamevoid	
setXHTMLNamespace	TokenNameIdentifier	 set XHTML Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newNamespace	TokenNameIdentifier	 new Namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fUserXHTMLNamespace	TokenNameIdentifier	 f User XHTML Namespace
=	TokenNameEQUAL	
newNamespace	TokenNameIdentifier	 new Namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setXHTMLNamespace(String) 	TokenNameCOMMENT_LINE	setXHTMLNamespace(String) 
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
String	TokenNameIdentifier	 String
htmlName	TokenNameIdentifier	 html Name
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
addNSAttr	TokenNameIdentifier	 add NS Attr
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_printer	TokenNameIdentifier	 printer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
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
// As per SAX2, the namespace URI is an empty string if the element has no 	TokenNameCOMMENT_LINE	As per SAX2, the namespace URI is an empty string if the element has no 
// namespace URI, or namespaces is turned off. The check against null protects 	TokenNameCOMMENT_LINE	namespace URI, or namespaces is turned off. The check against null protects 
// against broken SAX implementations, so I've left it there. - mrglavas 	TokenNameCOMMENT_LINE	against broken SAX implementations, so I've left it there. - mrglavas 
boolean	TokenNameboolean	
hasNamespaceURI	TokenNameIdentifier	 has Namespace URI
=	TokenNameEQUAL	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// SAX2: rawName (QName) could be empty string if 	TokenNameCOMMENT_LINE	SAX2: rawName (QName) could be empty string if 
// namespace-prefixes property is false. 	TokenNameCOMMENT_LINE	namespace-prefixes property is false. 
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
rawName	TokenNameIdentifier	 raw Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasNamespaceURI	TokenNameIdentifier	 has Namespace URI
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
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rawName	TokenNameIdentifier	 raw Name
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addNSAttr	TokenNameIdentifier	 add NS Attr
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasNamespaceURI	TokenNameIdentifier	 has Namespace URI
)	TokenNameRPAREN	
htmlName	TokenNameIdentifier	 html Name
=	TokenNameEQUAL	
rawName	TokenNameIdentifier	 raw Name
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XHTMLNamespace	TokenNameIdentifier	 XHTML Namespace
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
fUserXHTMLNamespace	TokenNameIdentifier	 f User XHTML Namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fUserXHTMLNamespace	TokenNameIdentifier	 f User XHTML Namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
htmlName	TokenNameIdentifier	 html Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
else	TokenNameelse	
htmlName	TokenNameIdentifier	 html Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XHTML: element names are lower case, DOM will be different 	TokenNameCOMMENT_LINE	XHTML: element names are lower case, DOM will be different 
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_xhtml	TokenNameIdentifier	 xhtml
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
rawName	TokenNameIdentifier	 raw Name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
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
// For each attribute serialize it's name and value as one part, 	TokenNameCOMMENT_LINE	For each attribute serialize it's name and value as one part, 
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
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
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
_xhtml	TokenNameIdentifier	 xhtml
||	TokenNameOR_OR	
hasNamespaceURI	TokenNameIdentifier	 has Namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XHTML: print empty string for null values. 	TokenNameCOMMENT_LINE	XHTML: print empty string for null values. 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
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
"="""	TokenNameStringLiteral	=""
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// HTML: Empty values print as attribute name, no value. 	TokenNameCOMMENT_LINE	HTML: Empty values print as attribute name, no value. 
// HTML: URI attributes will print unescaped 	TokenNameCOMMENT_LINE	HTML: URI attributes will print unescaped 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getPreserveEmptyAttributes	TokenNameIdentifier	 get Preserve Empty Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
HTMLdtd	TokenNameIdentifier	 HTM Ldtd
.	TokenNameDOT	
isURI	TokenNameIdentifier	 is URI
(	TokenNameLPAREN	
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
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
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
escapeURI	TokenNameIdentifier	 escape URI
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
HTMLdtd	TokenNameIdentifier	 HTM Ldtd
.	TokenNameDOT	
isBoolean	TokenNameIdentifier	 is Boolean
(	TokenNameLPAREN	
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
htmlName	TokenNameIdentifier	 html Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
HTMLdtd	TokenNameIdentifier	 HTM Ldtd
.	TokenNameDOT	
isPreserveSpace	TokenNameIdentifier	 is Preserve Space
(	TokenNameLPAREN	
htmlName	TokenNameIdentifier	 html Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
preserveSpace	TokenNameIdentifier	 preserve Space
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
addNSAttr	TokenNameIdentifier	 add NS Attr
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
// Prevents line breaks inside A/TD 	TokenNameCOMMENT_LINE	Prevents line breaks inside A/TD 
if	TokenNameif	
(	TokenNameLPAREN	
htmlName	TokenNameIdentifier	 html Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
htmlName	TokenNameIdentifier	 html Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
)	TokenNameRPAREN	
||	TokenNameOR_OR	
htmlName	TokenNameIdentifier	 html Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"TD"	TokenNameStringLiteral	TD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Handle SCRIPT and STYLE specifically by changing the 	TokenNameCOMMENT_LINE	Handle SCRIPT and STYLE specifically by changing the 
// state of the current element to CDATA (XHTML) or 	TokenNameCOMMENT_LINE	state of the current element to CDATA (XHTML) or 
// unescaped (HTML). 	TokenNameCOMMENT_LINE	unescaped (HTML). 
if	TokenNameif	
(	TokenNameLPAREN	
htmlName	TokenNameIdentifier	 html Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
rawName	TokenNameIdentifier	 raw Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"SCRIPT"	TokenNameStringLiteral	SCRIPT
)	TokenNameRPAREN	
||	TokenNameOR_OR	
rawName	TokenNameIdentifier	 raw Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"STYLE"	TokenNameStringLiteral	STYLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xhtml	TokenNameIdentifier	 xhtml
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XHTML: Print contents as CDATA section 	TokenNameCOMMENT_LINE	XHTML: Print contents as CDATA section 
state	TokenNameIdentifier	 state
.	TokenNameDOT	
doCData	TokenNameIdentifier	 do C Data
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// HTML: Print contents unescaped 	TokenNameCOMMENT_LINE	HTML: Print contents unescaped 
state	TokenNameIdentifier	 state
.	TokenNameDOT	
unescaped	TokenNameIdentifier	 unescaped
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
String	TokenNameIdentifier	 String
htmlName	TokenNameIdentifier	 html Name
;	TokenNameSEMICOLON	
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
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
htmlName	TokenNameIdentifier	 html Name
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
rawName	TokenNameIdentifier	 raw Name
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XHTMLNamespace	TokenNameIdentifier	 XHTML Namespace
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
fUserXHTMLNamespace	TokenNameIdentifier	 f User XHTML Namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fUserXHTMLNamespace	TokenNameIdentifier	 f User XHTML Namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
htmlName	TokenNameIdentifier	 html Name
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
else	TokenNameelse	
htmlName	TokenNameIdentifier	 html Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xhtml	TokenNameIdentifier	 xhtml
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
" />"	TokenNameStringLiteral	 />
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
// XHTML: element names are lower case, DOM will be different 	TokenNameCOMMENT_LINE	XHTML: element names are lower case, DOM will be different 
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
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
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
// This element is not empty and that last content was 	TokenNameCOMMENT_LINE	This element is not empty and that last content was 
// another element, so print a line break before that 	TokenNameCOMMENT_LINE	another element, so print a line break before that 
// last element and this element's closing tag. 	TokenNameCOMMENT_LINE	last element and this element's closing tag. 
// [keith] Provided this is not an anchor. 	TokenNameCOMMENT_LINE	[keith] Provided this is not an anchor. 
// HTML: some elements do not print closing tag (e.g. LI) 	TokenNameCOMMENT_LINE	HTML: some elements do not print closing tag (e.g. LI) 
if	TokenNameif	
(	TokenNameLPAREN	
htmlName	TokenNameIdentifier	 html Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
HTMLdtd	TokenNameIdentifier	 HTM Ldtd
.	TokenNameDOT	
isOnlyOpening	TokenNameIdentifier	 is Only Opening
(	TokenNameLPAREN	
htmlName	TokenNameIdentifier	 html Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_indenting	TokenNameIdentifier	 indenting
&&	TokenNameAND_AND	
!	TokenNameNOT	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
preserveSpace	TokenNameIdentifier	 preserve Space
&&	TokenNameAND_AND	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterElement	TokenNameIdentifier	 after Element
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Must leave CData section first (Illegal in HTML, but still) 	TokenNameCOMMENT_LINE	Must leave CData section first (Illegal in HTML, but still) 
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
}	TokenNameRBRACE	
// Leave the element state and update that of the parent 	TokenNameCOMMENT_LINE	Leave the element state and update that of the parent 
// (if we're not root) to not empty and after element. 	TokenNameCOMMENT_LINE	(if we're not root) to not empty and after element. 
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
leaveElementState	TokenNameIdentifier	 leave Element State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Temporary hack to prevent line breaks inside A/TD 	TokenNameCOMMENT_LINE	Temporary hack to prevent line breaks inside A/TD 
if	TokenNameif	
(	TokenNameLPAREN	
htmlName	TokenNameIdentifier	 html Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
htmlName	TokenNameIdentifier	 html Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
htmlName	TokenNameIdentifier	 html Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"TD"	TokenNameStringLiteral	TD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
//------------------------------------------// 	TokenNameCOMMENT_LINE	------------------------------------------// 
// SAX document handler serializing methods // 	TokenNameCOMMENT_LINE	SAX document handler serializing methods // 
//------------------------------------------// 	TokenNameCOMMENT_LINE	------------------------------------------// 
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
// HTML: no CDATA section 	TokenNameCOMMENT_LINE	HTML: no CDATA section 
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
false	TokenNamefalse	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
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
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_printer	TokenNameIdentifier	 printer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
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
// XHTML: element names are lower case, DOM will be different 	TokenNameCOMMENT_LINE	XHTML: element names are lower case, DOM will be different 
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_xhtml	TokenNameIdentifier	 xhtml
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
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
// For each attribute serialize it's name and value as one part, 	TokenNameCOMMENT_LINE	For each attribute serialize it's name and value as one part, 
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
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
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
_xhtml	TokenNameIdentifier	 xhtml
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XHTML: print empty string for null values. 	TokenNameCOMMENT_LINE	XHTML: print empty string for null values. 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
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
"="""	TokenNameStringLiteral	=""
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// HTML: Empty values print as attribute name, no value. 	TokenNameCOMMENT_LINE	HTML: Empty values print as attribute name, no value. 
// HTML: URI attributes will print unescaped 	TokenNameCOMMENT_LINE	HTML: URI attributes will print unescaped 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getPreserveEmptyAttributes	TokenNameIdentifier	 get Preserve Empty Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
HTMLdtd	TokenNameIdentifier	 HTM Ldtd
.	TokenNameDOT	
isURI	TokenNameIdentifier	 is URI
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
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
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
escapeURI	TokenNameIdentifier	 escape URI
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
HTMLdtd	TokenNameIdentifier	 HTM Ldtd
.	TokenNameDOT	
isBoolean	TokenNameIdentifier	 is Boolean
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
HTMLdtd	TokenNameIdentifier	 HTM Ldtd
.	TokenNameDOT	
isPreserveSpace	TokenNameIdentifier	 is Preserve Space
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
preserveSpace	TokenNameIdentifier	 preserve Space
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
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
// Prevents line breaks inside A/TD 	TokenNameCOMMENT_LINE	Prevents line breaks inside A/TD 
if	TokenNameif	
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
)	TokenNameRPAREN	
||	TokenNameOR_OR	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"TD"	TokenNameStringLiteral	TD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Handle SCRIPT and STYLE specifically by changing the 	TokenNameCOMMENT_LINE	Handle SCRIPT and STYLE specifically by changing the 
// state of the current element to CDATA (XHTML) or 	TokenNameCOMMENT_LINE	state of the current element to CDATA (XHTML) or 
// unescaped (HTML). 	TokenNameCOMMENT_LINE	unescaped (HTML). 
if	TokenNameif	
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"SCRIPT"	TokenNameStringLiteral	SCRIPT
)	TokenNameRPAREN	
||	TokenNameOR_OR	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"STYLE"	TokenNameStringLiteral	STYLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xhtml	TokenNameIdentifier	 xhtml
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XHTML: Print contents as CDATA section 	TokenNameCOMMENT_LINE	XHTML: Print contents as CDATA section 
state	TokenNameIdentifier	 state
.	TokenNameDOT	
doCData	TokenNameIdentifier	 do C Data
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// HTML: Print contents unescaped 	TokenNameCOMMENT_LINE	HTML: Print contents unescaped 
state	TokenNameIdentifier	 state
.	TokenNameDOT	
unescaped	TokenNameIdentifier	 unescaped
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
// Not supported in HTML/XHTML, but we still have to switch 	TokenNameCOMMENT_LINE	Not supported in HTML/XHTML, but we still have to switch 
// out of DTD mode. 	TokenNameCOMMENT_LINE	out of DTD mode. 
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
// If the public and system identifiers were not specified 	TokenNameCOMMENT_LINE	If the public and system identifiers were not specified 
// in the output format, use the appropriate ones for HTML 	TokenNameCOMMENT_LINE	in the output format, use the appropriate ones for HTML 
// or XHTML. 	TokenNameCOMMENT_LINE	or XHTML. 
if	TokenNameif	
(	TokenNameLPAREN	
_docTypePublicId	TokenNameIdentifier	 doc Type Public Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
_docTypeSystemId	TokenNameIdentifier	 doc Type System Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xhtml	TokenNameIdentifier	 xhtml
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_docTypePublicId	TokenNameIdentifier	 doc Type Public Id
=	TokenNameEQUAL	
HTMLdtd	TokenNameIdentifier	 HTM Ldtd
.	TokenNameDOT	
XHTMLPublicId	TokenNameIdentifier	 XHTML Public Id
;	TokenNameSEMICOLON	
_docTypeSystemId	TokenNameIdentifier	 doc Type System Id
=	TokenNameEQUAL	
HTMLdtd	TokenNameIdentifier	 HTM Ldtd
.	TokenNameDOT	
XHTMLSystemId	TokenNameIdentifier	 XHTML System Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_docTypePublicId	TokenNameIdentifier	 doc Type Public Id
=	TokenNameEQUAL	
HTMLdtd	TokenNameIdentifier	 HTM Ldtd
.	TokenNameDOT	
HTMLPublicId	TokenNameIdentifier	 HTML Public Id
;	TokenNameSEMICOLON	
_docTypeSystemId	TokenNameIdentifier	 doc Type System Id
=	TokenNameEQUAL	
HTMLdtd	TokenNameIdentifier	 HTM Ldtd
.	TokenNameDOT	
HTMLSystemId	TokenNameIdentifier	 HTML System Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// XHTML: If public identifier and system identifier 	TokenNameCOMMENT_LINE	XHTML: If public identifier and system identifier 
// specified, print them, else print just system identifier 	TokenNameCOMMENT_LINE	specified, print them, else print just system identifier 
// HTML: If public identifier specified, print it with 	TokenNameCOMMENT_LINE	HTML: If public identifier specified, print it with 
// system identifier, if specified. 	TokenNameCOMMENT_LINE	system identifier, if specified. 
// XHTML requires that all element names are lower case, so the 	TokenNameCOMMENT_LINE	XHTML requires that all element names are lower case, so the 
// root on the DOCTYPE must be 'html'. - mrglavas 	TokenNameCOMMENT_LINE	root on the DOCTYPE must be 'html'. - mrglavas 
if	TokenNameif	
(	TokenNameLPAREN	
_docTypePublicId	TokenNameIdentifier	 doc Type Public Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
_xhtml	TokenNameIdentifier	 xhtml
||	TokenNameOR_OR	
_docTypeSystemId	TokenNameIdentifier	 doc Type System Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xhtml	TokenNameIdentifier	 xhtml
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"<!DOCTYPE html PUBLIC "	TokenNameStringLiteral	<!DOCTYPE html PUBLIC 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"<!DOCTYPE HTML PUBLIC "	TokenNameStringLiteral	<!DOCTYPE HTML PUBLIC 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printDoctypeURL	TokenNameIdentifier	 print Doctype URL
(	TokenNameLPAREN	
_docTypePublicId	TokenNameIdentifier	 doc Type Public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_docTypeSystemId	TokenNameIdentifier	 doc Type System Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printDoctypeURL	TokenNameIdentifier	 print Doctype URL
(	TokenNameLPAREN	
_docTypeSystemId	TokenNameIdentifier	 doc Type System Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
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
_docTypeSystemId	TokenNameIdentifier	 doc Type System Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xhtml	TokenNameIdentifier	 xhtml
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"<!DOCTYPE html SYSTEM "	TokenNameStringLiteral	<!DOCTYPE html SYSTEM 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"<!DOCTYPE HTML SYSTEM "	TokenNameStringLiteral	<!DOCTYPE HTML SYSTEM 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printDoctypeURL	TokenNameIdentifier	 print Doctype URL
(	TokenNameLPAREN	
_docTypeSystemId	TokenNameIdentifier	 doc Type System Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
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
boolean	TokenNameboolean	
preserveSpace	TokenNameIdentifier	 preserve Space
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
// XHTML: element names are lower case, DOM will be different 	TokenNameCOMMENT_LINE	XHTML: element names are lower case, DOM will be different 
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_xhtml	TokenNameIdentifier	 xhtml
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
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
// Lookup the element's attribute, but only print specified 	TokenNameCOMMENT_LINE	Lookup the element's attribute, but only print specified 
// attributes. (Unspecified attributes are derived from the DTD. 	TokenNameCOMMENT_LINE	attributes. (Unspecified attributes are derived from the DTD. 
// For each attribute print it's name and value as one part, 	TokenNameCOMMENT_LINE	For each attribute print it's name and value as one part, 
// separated with a space so the element can be broken on 	TokenNameCOMMENT_LINE	separated with a space so the element can be broken on 
// multiple lines. 	TokenNameCOMMENT_LINE	multiple lines. 
attrMap	TokenNameIdentifier	 attr Map
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attrMap	TokenNameIdentifier	 attr Map
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
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
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
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getSpecified	TokenNameIdentifier	 get Specified
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
if	TokenNameif	
(	TokenNameLPAREN	
_xhtml	TokenNameIdentifier	 xhtml
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XHTML: print empty string for null values. 	TokenNameCOMMENT_LINE	XHTML: print empty string for null values. 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
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
"="""	TokenNameStringLiteral	=""
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// HTML: Empty values print as attribute name, no value. 	TokenNameCOMMENT_LINE	HTML: Empty values print as attribute name, no value. 
// HTML: URI attributes will print unescaped 	TokenNameCOMMENT_LINE	HTML: URI attributes will print unescaped 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getPreserveEmptyAttributes	TokenNameIdentifier	 get Preserve Empty Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
HTMLdtd	TokenNameIdentifier	 HTM Ldtd
.	TokenNameDOT	
isURI	TokenNameIdentifier	 is URI
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
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
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
escapeURI	TokenNameIdentifier	 escape URI
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
HTMLdtd	TokenNameIdentifier	 HTM Ldtd
.	TokenNameDOT	
isBoolean	TokenNameIdentifier	 is Boolean
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
HTMLdtd	TokenNameIdentifier	 HTM Ldtd
.	TokenNameDOT	
isPreserveSpace	TokenNameIdentifier	 is Preserve Space
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
preserveSpace	TokenNameIdentifier	 preserve Space
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// If element has children, or if element is not an empty tag, 	TokenNameCOMMENT_LINE	If element has children, or if element is not an empty tag, 
// serialize an opening tag. 	TokenNameCOMMENT_LINE	serialize an opening tag. 
if	TokenNameif	
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
HTMLdtd	TokenNameIdentifier	 HTM Ldtd
.	TokenNameDOT	
isEmptyTag	TokenNameIdentifier	 is Empty Tag
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
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
// Prevents line breaks inside A/TD 	TokenNameCOMMENT_LINE	Prevents line breaks inside A/TD 
if	TokenNameif	
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
)	TokenNameRPAREN	
||	TokenNameOR_OR	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"TD"	TokenNameStringLiteral	TD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Handle SCRIPT and STYLE specifically by changing the 	TokenNameCOMMENT_LINE	Handle SCRIPT and STYLE specifically by changing the 
// state of the current element to CDATA (XHTML) or 	TokenNameCOMMENT_LINE	state of the current element to CDATA (XHTML) or 
// unescaped (HTML). 	TokenNameCOMMENT_LINE	unescaped (HTML). 
if	TokenNameif	
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"SCRIPT"	TokenNameStringLiteral	SCRIPT
)	TokenNameRPAREN	
||	TokenNameOR_OR	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"STYLE"	TokenNameStringLiteral	STYLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xhtml	TokenNameIdentifier	 xhtml
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XHTML: Print contents as CDATA section 	TokenNameCOMMENT_LINE	XHTML: Print contents as CDATA section 
state	TokenNameIdentifier	 state
.	TokenNameDOT	
doCData	TokenNameIdentifier	 do C Data
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// HTML: Print contents unescaped 	TokenNameCOMMENT_LINE	HTML: Print contents unescaped 
state	TokenNameIdentifier	 state
.	TokenNameDOT	
unescaped	TokenNameIdentifier	 unescaped
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
unindent	TokenNameIdentifier	 unindent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XHTML: Close empty tag with ' />' so it's XML and HTML compatible. 	TokenNameCOMMENT_LINE	XHTML: Close empty tag with ' />' so it's XML and HTML compatible. 
// HTML: Empty tags are defined as such in DTD no in document. 	TokenNameCOMMENT_LINE	HTML: Empty tags are defined as such in DTD no in document. 
if	TokenNameif	
(	TokenNameLPAREN	
_xhtml	TokenNameIdentifier	 xhtml
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
" />"	TokenNameStringLiteral	 />
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
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
protected	TokenNameprotected	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// HTML: no CDATA section 	TokenNameCOMMENT_LINE	HTML: no CDATA section 
content	TokenNameIdentifier	 content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
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
HTMLdtd	TokenNameIdentifier	 HTM Ldtd
.	TokenNameDOT	
fromChar	TokenNameIdentifier	 from Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
escapeURI	TokenNameIdentifier	 escape URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
// XXX Apparently Netscape doesn't like if we escape the URI 	TokenNameCOMMENT_LINE	XXX Apparently Netscape doesn't like if we escape the URI 
// using %nn, so we leave it as is, just remove any quotes. 	TokenNameCOMMENT_LINE	using %nn, so we leave it as is, just remove any quotes. 
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
