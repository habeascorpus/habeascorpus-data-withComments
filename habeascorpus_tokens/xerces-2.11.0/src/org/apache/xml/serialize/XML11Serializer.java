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
XML11Char	TokenNameIdentifier	 XM L11 Char
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * Implements an XML serializer supporting both DOM and SAX pretty * serializing. For usage instructions see {@link Serializer}. * <p> * If an output stream is used, the encoding is taken from the * output format (defaults to <tt>UTF-8</tt>). If a writer is * used, make sure the writer uses the same encoding (if applies) * as specified in the output format. * <p> * The serializer supports both DOM and SAX. SAX serializing is done by firing * SAX events and using the serializer as a document handler. DOM serializing is done * by calling {@link #serialize(Document)} or by using DOM Level 3 * {@link org.w3c.dom.ls.LSSerializer} and * serializing with {@link org.w3c.dom.ls.LSSerializer#write}, * {@link org.w3c.dom.ls.LSSerializer#writeToString}. * <p> * If an I/O exception occurs while serializing, the serializer * will not throw an exception directly, but only throw it * at the end of serializing (either DOM or SAX's {@link * org.xml.sax.DocumentHandler#endDocument}. * <p> * For elements that are not specified as whitespace preserving, * the serializer will potentially break long text lines at space * boundaries, indent lines, and serialize elements on separate * lines. Line terminators will be regarded as spaces, and * spaces at beginning of line will be stripped. * * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended * that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation * API for XML (TrAX) for serializing XML. See the Xerces documentation for more * information. * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> * @author <a href="mailto:rahul.srivastava@sun.com">Rahul Srivastava</a> * @author Elena Litani IBM * @version $Revision: 476047 $ $Date: 2006-11-16 23:27:45 -0500 (Thu, 16 Nov 2006) $ * @see Serializer */	TokenNameCOMMENT_JAVADOC	 Implements an XML serializer supporting both DOM and SAX pretty serializing. For usage instructions see {@link Serializer}. <p> If an output stream is used, the encoding is taken from the output format (defaults to <tt>UTF-8</tt>). If a writer is used, make sure the writer uses the same encoding (if applies) as specified in the output format. <p> The serializer supports both DOM and SAX. SAX serializing is done by firing SAX events and using the serializer as a document handler. DOM serializing is done by calling {@link #serialize(Document)} or by using DOM Level 3 {@link org.w3c.dom.ls.LSSerializer} and serializing with {@link org.w3c.dom.ls.LSSerializer#write}, {@link org.w3c.dom.ls.LSSerializer#writeToString}. <p> If an I/O exception occurs while serializing, the serializer will not throw an exception directly, but only throw it at the end of serializing (either DOM or SAX's {@link org.xml.sax.DocumentHandler#endDocument}. <p> For elements that are not specified as whitespace preserving, the serializer will potentially break long text lines at space boundaries, indent lines, and serialize elements on separate lines. Line terminators will be regarded as spaces, and spaces at beginning of line will be stripped. * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation API for XML (TrAX) for serializing XML. See the Xerces documentation for more information. @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> @author <a href="mailto:rahul.srivastava@sun.com">Rahul Srivastava</a> @author Elena Litani IBM @version $Revision: 476047 $ $Date: 2006-11-16 23:27:45 -0500 (Thu, 16 Nov 2006) $ @see Serializer 
public	TokenNamepublic	
class	TokenNameclass	
XML11Serializer	TokenNameIdentifier	 XM L11 Serializer
extends	TokenNameextends	
XMLSerializer	TokenNameIdentifier	 XML Serializer
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
// is node dom level 1 node? 	TokenNameCOMMENT_LINE	is node dom level 1 node? 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fDOML1	TokenNameIdentifier	 f DOM L1
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// counter for new prefix names 	TokenNameCOMMENT_LINE	counter for new prefix names 
protected	TokenNameprotected	
int	TokenNameint	
fNamespaceCounter	TokenNameIdentifier	 f Namespace Counter
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PREFIX	TokenNameIdentifier	 PREFIX
=	TokenNameEQUAL	
"NS"	TokenNameStringLiteral	NS
;	TokenNameSEMICOLON	
/** * Controls whether namespace fixup should be performed during * the serialization. * NOTE: if this field is set to true the following * fields need to be initialized: fNSBinder, fLocalNSBinder, fSymbolTable, * XMLSymbols.EMPTY_STRING, fXmlSymbol, fXmlnsSymbol, fNamespaceCounter. */	TokenNameCOMMENT_JAVADOC	 Controls whether namespace fixup should be performed during the serialization. NOTE: if this field is set to true the following fields need to be initialized: fNSBinder, fLocalNSBinder, fSymbolTable, XMLSymbols.EMPTY_STRING, fXmlSymbol, fXmlnsSymbol, fNamespaceCounter. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fNamespaces	TokenNameIdentifier	 f Namespaces
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Constructs a new serializer. The serializer cannot be used without * calling {@link #setOutputCharStream} or {@link #setOutputByteStream} * first. */	TokenNameCOMMENT_JAVADOC	 Constructs a new serializer. The serializer cannot be used without calling {@link #setOutputCharStream} or {@link #setOutputByteStream} first. 
public	TokenNamepublic	
XML11Serializer	TokenNameIdentifier	 XM L11 Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new serializer. The serializer cannot be used without * calling {@link #setOutputCharStream} or {@link #setOutputByteStream} * first. */	TokenNameCOMMENT_JAVADOC	 Constructs a new serializer. The serializer cannot be used without calling {@link #setOutputCharStream} or {@link #setOutputByteStream} first. 
public	TokenNamepublic	
XML11Serializer	TokenNameIdentifier	 XM L11 Serializer
(	TokenNameLPAREN	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new serializer that writes to the specified writer * using the specified output format. If <tt>format</tt> is null, * will use a default output format. * * @param writer The writer to use * @param format The output format to use, null for the default */	TokenNameCOMMENT_JAVADOC	 Constructs a new serializer that writes to the specified writer using the specified output format. If <tt>format</tt> is null, will use a default output format. * @param writer The writer to use @param format The output format to use, null for the default 
public	TokenNamepublic	
XML11Serializer	TokenNameIdentifier	 XM L11 Serializer
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
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new serializer that writes to the specified output * stream using the specified output format. If <tt>format</tt> * is null, will use a default output format. * * @param output The output stream to use * @param format The output format to use, null for the default */	TokenNameCOMMENT_JAVADOC	 Constructs a new serializer that writes to the specified output stream using the specified output format. If <tt>format</tt> is null, will use a default output format. * @param output The output stream to use @param format The output format to use, null for the default 
public	TokenNamepublic	
XML11Serializer	TokenNameIdentifier	 XM L11 Serializer
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
output	TokenNameIdentifier	 output
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
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-----------------------------------------// 	TokenNameCOMMENT_LINE	-----------------------------------------// 
// SAX content handler serializing methods // 	TokenNameCOMMENT_LINE	SAX content handler serializing methods // 
//-----------------------------------------// 	TokenNameCOMMENT_LINE	-----------------------------------------// 
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
// Check if text should be print as CDATA section or unescaped 	TokenNameCOMMENT_LINE	Check if text should be print as CDATA section or unescaped 
// based on elements listed in the output format (the element 	TokenNameCOMMENT_LINE	based on elements listed in the output format (the element 
// state) or whether we are inside a CDATA section or entity. 	TokenNameCOMMENT_LINE	state) or whether we are inside a CDATA section or entity. 
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
inCData	TokenNameIdentifier	 in C Data
||	TokenNameOR_OR	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
doCData	TokenNameIdentifier	 do C Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
saveIndent	TokenNameIdentifier	 save Indent
;	TokenNameSEMICOLON	
// Print a CDATA section. The text is not escaped, but ']]>' 	TokenNameCOMMENT_LINE	Print a CDATA section. The text is not escaped, but ']]>' 
// appearing in the code must be identified and dealt with. 	TokenNameCOMMENT_LINE	appearing in the code must be identified and dealt with. 
// The contents of a text node is considered space preserving. 	TokenNameCOMMENT_LINE	The contents of a text node is considered space preserving. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
inCData	TokenNameIdentifier	 in C Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"<![CDATA["	TokenNameStringLiteral	<![CDATA[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
inCData	TokenNameIdentifier	 in C Data
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
saveIndent	TokenNameIdentifier	 save Indent
=	TokenNameEQUAL	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
getNextIndent	TokenNameIdentifier	 get Next Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
setNextIndent	TokenNameIdentifier	 set Next Indent
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
<	TokenNameLESS	
end	TokenNameIdentifier	 end
&&	TokenNameAND_AND	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"]]]]><![CDATA[>"	TokenNameStringLiteral	]]]]><![CDATA[>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Valid	TokenNameIdentifier	 is XM L11 Valid
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
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
surrogates	TokenNameIdentifier	 surrogates
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
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
_encodingInfo	TokenNameIdentifier	 encoding Info
.	TokenNameDOT	
isPrintable	TokenNameIdentifier	 is Printable
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidLiteral	TokenNameIdentifier	 is XM L11 Valid Literal
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
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
// The character is not printable -- split CDATA section 	TokenNameCOMMENT_LINE	The character is not printable -- split CDATA section 
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"]]>&#x"	TokenNameStringLiteral	]]>&#x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
";<![CDATA["	TokenNameStringLiteral	;<![CDATA[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
setNextIndent	TokenNameIdentifier	 set Next Indent
(	TokenNameLPAREN	
saveIndent	TokenNameIdentifier	 save Indent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
saveIndent	TokenNameIdentifier	 save Indent
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
preserveSpace	TokenNameIdentifier	 preserve Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If preserving space then hold of indentation so no 	TokenNameCOMMENT_LINE	If preserving space then hold of indentation so no 
// excessive spaces are printed at line breaks, escape 	TokenNameCOMMENT_LINE	excessive spaces are printed at line breaks, escape 
// the text content without replacing spaces and print 	TokenNameCOMMENT_LINE	the text content without replacing spaces and print 
// the text breaking only at line breaks. 	TokenNameCOMMENT_LINE	the text breaking only at line breaks. 
saveIndent	TokenNameIdentifier	 save Indent
=	TokenNameEQUAL	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
getNextIndent	TokenNameIdentifier	 get Next Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
setNextIndent	TokenNameIdentifier	 set Next Indent
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
state	TokenNameIdentifier	 state
.	TokenNameDOT	
unescaped	TokenNameIdentifier	 unescaped
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
setNextIndent	TokenNameIdentifier	 set Next Indent
(	TokenNameLPAREN	
saveIndent	TokenNameIdentifier	 save Indent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
unescaped	TokenNameIdentifier	 unescaped
)	TokenNameRPAREN	
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
// 	TokenNameCOMMENT_LINE	 
// overwrite printing functions to make sure serializer prints out valid XML 	TokenNameCOMMENT_LINE	overwrite printing functions to make sure serializer prints out valid XML 
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
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Valid	TokenNameIdentifier	 is XM L11 Valid
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
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x0085	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
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
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
printCDATAText	TokenNameIdentifier	 print CDATA Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
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
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
<	TokenNameLESS	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check for ']]>' 	TokenNameCOMMENT_LINE	check for ']]>' 
if	TokenNameif	
(	TokenNameLPAREN	
fDOMErrorHandler	TokenNameIdentifier	 f DOM Error Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: this means that if DOM Error handler is not registered we don't report any 	TokenNameCOMMENT_LINE	REVISIT: this means that if DOM Error handler is not registered we don't report any 
// fatal errors and might serialize not wellformed document 	TokenNameCOMMENT_LINE	fatal errors and might serialize not wellformed document 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
features	TokenNameIdentifier	 features
&	TokenNameAND	
DOMSerializerImpl	TokenNameIdentifier	 DOM Serializer Impl
.	TokenNameDOT	
SPLITCDATA	TokenNameIdentifier	 SPLITCDATA
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
features	TokenNameIdentifier	 features
&	TokenNameAND	
DOMSerializerImpl	TokenNameIdentifier	 DOM Serializer Impl
.	TokenNameDOT	
WELLFORMED	TokenNameIdentifier	 WELLFORMED
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// issue fatal error 	TokenNameCOMMENT_LINE	issue fatal error 
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
"EndingCDATA"	TokenNameStringLiteral	EndingCDATA
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
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
fCurrentNode	TokenNameIdentifier	 f Current Node
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
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// issue warning 	TokenNameCOMMENT_LINE	issue warning 
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
"SplittingCDATA"	TokenNameStringLiteral	SplittingCDATA
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
SEVERITY_WARNING	TokenNameIdentifier	 SEVERITY  WARNING
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
fCurrentNode	TokenNameIdentifier	 f Current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDOMErrorHandler	TokenNameIdentifier	 f DOM Error Handler
.	TokenNameDOT	
handleError	TokenNameIdentifier	 handle Error
(	TokenNameLPAREN	
fDOMError	TokenNameIdentifier	 f DOM Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// split CDATA section 	TokenNameCOMMENT_LINE	split CDATA section 
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"]]]]><![CDATA[>"	TokenNameStringLiteral	]]]]><![CDATA[>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Valid	TokenNameIdentifier	 is XM L11 Valid
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
_encodingInfo	TokenNameIdentifier	 encoding Info
.	TokenNameDOT	
isPrintable	TokenNameIdentifier	 is Printable
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidLiteral	TokenNameIdentifier	 is XM L11 Valid Literal
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
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
// The character is not printable -- split CDATA section 	TokenNameCOMMENT_LINE	The character is not printable -- split CDATA section 
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"]]>&#x"	TokenNameStringLiteral	]]>&#x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
";<![CDATA["	TokenNameStringLiteral	;<![CDATA[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// note that this "int" should, in all cases, be a char. 	TokenNameCOMMENT_LINE	note that this "int" should, in all cases, be a char. 
// REVISIT: make it a char... 	TokenNameCOMMENT_LINE	REVISIT: make it a char... 
protected	TokenNameprotected	
final	TokenNamefinal	
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
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x0085	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
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
_encodingInfo	TokenNameIdentifier	 encoding Info
.	TokenNameDOT	
isPrintable	TokenNameIdentifier	 is Printable
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidLiteral	TokenNameIdentifier	 is XM L11 Valid Literal
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
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
final	TokenNamefinal	
void	TokenNamevoid	
surrogates	TokenNameIdentifier	 surrogates
(	TokenNameLPAREN	
int	TokenNameint	
high	TokenNameIdentifier	 high
,	TokenNameCOMMA	
int	TokenNameint	
low	TokenNameIdentifier	 low
,	TokenNameCOMMA	
boolean	TokenNameboolean	
inContent	TokenNameIdentifier	 in Content
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Invalid XML 	TokenNameCOMMENT_LINE	Invalid XML 
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"The character '"	TokenNameStringLiteral	The character '
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
low	TokenNameIdentifier	 low
+	TokenNamePLUS	
"' is an invalid XML character"	TokenNameStringLiteral	' is an invalid XML character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
supplemental	TokenNameIdentifier	 supplemental
=	TokenNameEQUAL	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
supplemental	TokenNameIdentifier	 supplemental
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
high	TokenNameIdentifier	 high
,	TokenNameCOMMA	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Valid	TokenNameIdentifier	 is XM L11 Valid
(	TokenNameLPAREN	
supplemental	TokenNameIdentifier	 supplemental
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Invalid XML 	TokenNameCOMMENT_LINE	Invalid XML 
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
"The character '"	TokenNameStringLiteral	The character '
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
supplemental	TokenNameIdentifier	 supplemental
+	TokenNamePLUS	
"' is an invalid XML character"	TokenNameStringLiteral	' is an invalid XML character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inContent	TokenNameIdentifier	 in Content
&&	TokenNameAND_AND	
content	TokenNameIdentifier	 content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
inCData	TokenNameIdentifier	 in C Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"]]>&#x"	TokenNameStringLiteral	]]>&#x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
supplemental	TokenNameIdentifier	 supplemental
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
";<![CDATA["	TokenNameStringLiteral	;<![CDATA[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
printHex	TokenNameIdentifier	 print Hex
(	TokenNameLPAREN	
supplemental	TokenNameIdentifier	 supplemental
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
high	TokenNameIdentifier	 high
+	TokenNamePLUS	
"' is an invalid XML character"	TokenNameStringLiteral	' is an invalid XML character
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
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Valid	TokenNameIdentifier	 is XM L11 Valid
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
&&	TokenNameAND_AND	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidLiteral	TokenNameIdentifier	 is XM L11 Valid Literal
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
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
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Valid	TokenNameIdentifier	 is XM L11 Valid
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
&&	TokenNameAND_AND	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidLiteral	TokenNameIdentifier	 is XM L11 Valid Literal
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
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
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Valid	TokenNameIdentifier	 is XM L11 Valid
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
&&	TokenNameAND_AND	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidLiteral	TokenNameIdentifier	 is XM L11 Valid Literal
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
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
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Valid	TokenNameIdentifier	 is XM L11 Valid
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
&&	TokenNameAND_AND	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidLiteral	TokenNameIdentifier	 is XM L11 Valid Literal
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
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
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
