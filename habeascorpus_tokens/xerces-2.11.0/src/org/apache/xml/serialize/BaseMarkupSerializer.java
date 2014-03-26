/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Sep 14, 2000: 	TokenNameCOMMENT_LINE	Sep 14, 2000: 
// Fixed comments to preserve whitespaces and add a line break 	TokenNameCOMMENT_LINE	Fixed comments to preserve whitespaces and add a line break 
// when indenting. Reported by Gervase Markham <gerv@gerv.net> 	TokenNameCOMMENT_LINE	when indenting. Reported by Gervase Markham <gerv@gerv.net> 
// Sep 14, 2000: 	TokenNameCOMMENT_LINE	Sep 14, 2000: 
// Fixed serializer to report IO exception directly, instead at 	TokenNameCOMMENT_LINE	Fixed serializer to report IO exception directly, instead at 
// the end of document processing. 	TokenNameCOMMENT_LINE	the end of document processing. 
// Reported by Patrick Higgins <phiggins@transzap.com> 	TokenNameCOMMENT_LINE	Reported by Patrick Higgins <phiggins@transzap.com> 
// Sep 13, 2000: 	TokenNameCOMMENT_LINE	Sep 13, 2000: 
// CR in character data will print as &#0D; 	TokenNameCOMMENT_LINE	CR in character data will print as &#0D; 
// Aug 25, 2000: 	TokenNameCOMMENT_LINE	Aug 25, 2000: 
// Fixed processing instruction printing inside element content 	TokenNameCOMMENT_LINE	Fixed processing instruction printing inside element content 
// to not escape content. Reported by Mikael Staldal 	TokenNameCOMMENT_LINE	to not escape content. Reported by Mikael Staldal 
// <d96-mst@d.kth.se> 	TokenNameCOMMENT_LINE	<d96-mst@d.kth.se> 
// Aug 25, 2000: 	TokenNameCOMMENT_LINE	Aug 25, 2000: 
// Added ability to omit comments. 	TokenNameCOMMENT_LINE	Added ability to omit comments. 
// Contributed by Anupam Bagchi <abagchi@jtcsv.com> 	TokenNameCOMMENT_LINE	Contributed by Anupam Bagchi <abagchi@jtcsv.com> 
// Aug 26, 2000: 	TokenNameCOMMENT_LINE	Aug 26, 2000: 
// Fixed bug in newline handling when preserving spaces. 	TokenNameCOMMENT_LINE	Fixed bug in newline handling when preserving spaces. 
// Contributed by Mike Dusseault <mdusseault@home.com> 	TokenNameCOMMENT_LINE	Contributed by Mike Dusseault <mdusseault@home.com> 
// Aug 29, 2000: 	TokenNameCOMMENT_LINE	Aug 29, 2000: 
// Fixed state.unescaped not being set to false when 	TokenNameCOMMENT_LINE	Fixed state.unescaped not being set to false when 
// entering element state. 	TokenNameCOMMENT_LINE	entering element state. 
// Reported by Lowell Vaughn <lvaughn@agillion.com> 	TokenNameCOMMENT_LINE	Reported by Lowell Vaughn <lvaughn@agillion.com> 
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
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
DOMErrorImpl	TokenNameIdentifier	 DOM Error Impl
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
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
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
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
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
DocumentType	TokenNameIdentifier	 Document Type
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ls	TokenNameIdentifier	 ls
.	TokenNameDOT	
LSException	TokenNameIdentifier	 LS Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ls	TokenNameIdentifier	 ls
.	TokenNameDOT	
LSSerializerFilter	TokenNameIdentifier	 LS Serializer Filter
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
DocumentHandler	TokenNameIdentifier	 Document Handler
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
/** * Base class for a serializer supporting both DOM and SAX pretty * serializing of XML/HTML/XHTML documents. Derives classes perform * the method-specific serializing, this class provides the common * serializing mechanisms. * <p> * The serializer must be initialized with the proper writer and * output format before it can be used by calling {@link #setOutputCharStream} * or {@link #setOutputByteStream} for the writer and {@link #setOutputFormat} * for the output format. * <p> * The serializer can be reused any number of times, but cannot * be used concurrently by two threads. * <p> * If an output stream is used, the encoding is taken from the * output format (defaults to <tt>UTF-8</tt>). If a writer is * used, make sure the writer uses the same encoding (if applies) * as specified in the output format. * <p> * The serializer supports both DOM and SAX. DOM serializing is done * by calling {@link #serialize(Document)} and SAX serializing is done by firing * SAX events and using the serializer as a document handler. * This also applies to derived class. * <p> * If an I/O exception occurs while serializing, the serializer * will not throw an exception directly, but only throw it * at the end of serializing (either DOM or SAX's {@link * org.xml.sax.DocumentHandler#endDocument}. * <p> * For elements that are not specified as whitespace preserving, * the serializer will potentially break long text lines at space * boundaries, indent lines, and serialize elements on separate * lines. Line terminators will be regarded as spaces, and * spaces at beginning of line will be stripped. * <p> * When indenting, the serializer is capable of detecting seemingly * element content, and serializing these elements indented on separate * lines. An element is serialized indented when it is the first or * last child of an element, or immediate following or preceding * another element. * * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended * that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation * API for XML (TrAX) for serializing XML. See the Xerces documentation for more * information. * @version $Revision: 923974 $ $Date: 2010-03-16 16:47:04 -0400 (Tue, 16 Mar 2010) $ * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> * @author <a href="mailto:rahul.srivastava@sun.com">Rahul Srivastava</a> * @author Elena Litani, IBM * @see Serializer * @see org.w3c.dom.ls.LSSerializer */	TokenNameCOMMENT_JAVADOC	 Base class for a serializer supporting both DOM and SAX pretty serializing of XML/HTML/XHTML documents. Derives classes perform the method-specific serializing, this class provides the common serializing mechanisms. <p> The serializer must be initialized with the proper writer and output format before it can be used by calling {@link #setOutputCharStream} or {@link #setOutputByteStream} for the writer and {@link #setOutputFormat} for the output format. <p> The serializer can be reused any number of times, but cannot be used concurrently by two threads. <p> If an output stream is used, the encoding is taken from the output format (defaults to <tt>UTF-8</tt>). If a writer is used, make sure the writer uses the same encoding (if applies) as specified in the output format. <p> The serializer supports both DOM and SAX. DOM serializing is done by calling {@link #serialize(Document)} and SAX serializing is done by firing SAX events and using the serializer as a document handler. This also applies to derived class. <p> If an I/O exception occurs while serializing, the serializer will not throw an exception directly, but only throw it at the end of serializing (either DOM or SAX's {@link org.xml.sax.DocumentHandler#endDocument}. <p> For elements that are not specified as whitespace preserving, the serializer will potentially break long text lines at space boundaries, indent lines, and serialize elements on separate lines. Line terminators will be regarded as spaces, and spaces at beginning of line will be stripped. <p> When indenting, the serializer is capable of detecting seemingly element content, and serializing these elements indented on separate lines. An element is serialized indented when it is the first or last child of an element, or immediate following or preceding another element. * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation API for XML (TrAX) for serializing XML. See the Xerces documentation for more information. @version $Revision: 923974 $ $Date: 2010-03-16 16:47:04 -0400 (Tue, 16 Mar 2010) $ @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> @author <a href="mailto:rahul.srivastava@sun.com">Rahul Srivastava</a> @author Elena Litani, IBM @see Serializer @see org.w3c.dom.ls.LSSerializer 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BaseMarkupSerializer	TokenNameIdentifier	 Base Markup Serializer
implements	TokenNameimplements	
ContentHandler	TokenNameIdentifier	 Content Handler
,	TokenNameCOMMA	
DocumentHandler	TokenNameIdentifier	 Document Handler
,	TokenNameCOMMA	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
,	TokenNameCOMMA	
DTDHandler	TokenNameIdentifier	 DTD Handler
,	TokenNameCOMMA	
DeclHandler	TokenNameIdentifier	 Decl Handler
,	TokenNameCOMMA	
DOMSerializer	TokenNameIdentifier	 DOM Serializer
,	TokenNameCOMMA	
Serializer	TokenNameIdentifier	 Serializer
{	TokenNameLBRACE	
// DOM L3 implementation 	TokenNameCOMMENT_LINE	DOM L3 implementation 
protected	TokenNameprotected	
short	TokenNameshort	
features	TokenNameIdentifier	 features
=	TokenNameEQUAL	
0xFFFFFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
fDOMErrorHandler	TokenNameIdentifier	 f DOM Error Handler
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
DOMErrorImpl	TokenNameIdentifier	 DOM Error Impl
fDOMError	TokenNameIdentifier	 f DOM Error
=	TokenNameEQUAL	
new	TokenNamenew	
DOMErrorImpl	TokenNameIdentifier	 DOM Error Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
LSSerializerFilter	TokenNameIdentifier	 LS Serializer Filter
fDOMFilter	TokenNameIdentifier	 f DOM Filter
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
EncodingInfo	TokenNameIdentifier	 Encoding Info
_encodingInfo	TokenNameIdentifier	 encoding Info
;	TokenNameSEMICOLON	
/** * Holds array of all element states that have been entered. * The array is automatically resized. When leaving an element, * it's state is not removed but reused when later returning * to the same nesting level. */	TokenNameCOMMENT_JAVADOC	 Holds array of all element states that have been entered. The array is automatically resized. When leaving an element, it's state is not removed but reused when later returning to the same nesting level. 
private	TokenNameprivate	
ElementState	TokenNameIdentifier	 Element State
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_elementStates	TokenNameIdentifier	 element States
;	TokenNameSEMICOLON	
/** * The index of the next state to place in the array, * or one plus the index of the current state. When zero, * we are in no state. */	TokenNameCOMMENT_JAVADOC	 The index of the next state to place in the array, or one plus the index of the current state. When zero, we are in no state. 
private	TokenNameprivate	
int	TokenNameint	
_elementStateCount	TokenNameIdentifier	 element State Count
;	TokenNameSEMICOLON	
/** * Vector holding comments and PIs that come before the root * element (even after it), see {@link #serializePreRoot}. */	TokenNameCOMMENT_JAVADOC	 Vector holding comments and PIs that come before the root element (even after it), see {@link #serializePreRoot}. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
_preRoot	TokenNameIdentifier	 pre Root
;	TokenNameSEMICOLON	
/** * If the document has been started (header serialized), this * flag is set to true so it's not started twice. */	TokenNameCOMMENT_JAVADOC	 If the document has been started (header serialized), this flag is set to true so it's not started twice. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
_started	TokenNameIdentifier	 started
;	TokenNameSEMICOLON	
/** * True if the serializer has been prepared. This flag is set * to false when the serializer is reset prior to using it, * and to true after it has been prepared for usage. */	TokenNameCOMMENT_JAVADOC	 True if the serializer has been prepared. This flag is set to false when the serializer is reset prior to using it, and to true after it has been prepared for usage. 
private	TokenNameprivate	
boolean	TokenNameboolean	
_prepared	TokenNameIdentifier	 prepared
;	TokenNameSEMICOLON	
/** * Association between namespace URIs (keys) and prefixes (values). * Accumulated here prior to starting an element and placing this * list in the element state. */	TokenNameCOMMENT_JAVADOC	 Association between namespace URIs (keys) and prefixes (values). Accumulated here prior to starting an element and placing this list in the element state. 
protected	TokenNameprotected	
Hashtable	TokenNameIdentifier	 Hashtable
_prefixes	TokenNameIdentifier	 prefixes
;	TokenNameSEMICOLON	
/** * The system identifier of the document type, if known. */	TokenNameCOMMENT_JAVADOC	 The system identifier of the document type, if known. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
_docTypePublicId	TokenNameIdentifier	 doc Type Public Id
;	TokenNameSEMICOLON	
/** * The system identifier of the document type, if known. */	TokenNameCOMMENT_JAVADOC	 The system identifier of the document type, if known. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
_docTypeSystemId	TokenNameIdentifier	 doc Type System Id
;	TokenNameSEMICOLON	
/** * The output format associated with this serializer. This will never * be a null reference. If no format was passed to the constructor, * the default one for this document type will be used. The format * object is never changed by the serializer. */	TokenNameCOMMENT_JAVADOC	 The output format associated with this serializer. This will never be a null reference. If no format was passed to the constructor, the default one for this document type will be used. The format object is never changed by the serializer. 
protected	TokenNameprotected	
OutputFormat	TokenNameIdentifier	 Output Format
_format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
/** * The printer used for printing text parts. */	TokenNameCOMMENT_JAVADOC	 The printer used for printing text parts. 
protected	TokenNameprotected	
Printer	TokenNameIdentifier	 Printer
_printer	TokenNameIdentifier	 printer
;	TokenNameSEMICOLON	
/** * True if indenting printer. */	TokenNameCOMMENT_JAVADOC	 True if indenting printer. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
_indenting	TokenNameIdentifier	 indenting
;	TokenNameSEMICOLON	
/** Temporary buffer to store character data */	TokenNameCOMMENT_JAVADOC	 Temporary buffer to store character data 
protected	TokenNameprotected	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
fStrBuffer	TokenNameIdentifier	 f Str Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
40	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The underlying writer. */	TokenNameCOMMENT_JAVADOC	 The underlying writer. 
private	TokenNameprivate	
Writer	TokenNameIdentifier	 Writer
_writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
/** * The output stream. */	TokenNameCOMMENT_JAVADOC	 The output stream. 
private	TokenNameprivate	
OutputStream	TokenNameIdentifier	 Output Stream
_output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
/** Current node that is being processed */	TokenNameCOMMENT_JAVADOC	 Current node that is being processed 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//--------------------------------// 	TokenNameCOMMENT_LINE	--------------------------------// 
// Constructor and initialization // 	TokenNameCOMMENT_LINE	Constructor and initialization // 
//--------------------------------// 	TokenNameCOMMENT_LINE	--------------------------------// 
/** * Protected constructor can only be used by derived class. * Must initialize the serializer before serializing any document, * by calling {@link #setOutputCharStream} or {@link #setOutputByteStream} * first */	TokenNameCOMMENT_JAVADOC	 Protected constructor can only be used by derived class. Must initialize the serializer before serializing any document, by calling {@link #setOutputCharStream} or {@link #setOutputByteStream} first 
protected	TokenNameprotected	
BaseMarkupSerializer	TokenNameIdentifier	 Base Markup Serializer
(	TokenNameLPAREN	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
_elementStates	TokenNameIdentifier	 element States
=	TokenNameEQUAL	
new	TokenNamenew	
ElementState	TokenNameIdentifier	 Element State
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
_elementStates	TokenNameIdentifier	 element States
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
_elementStates	TokenNameIdentifier	 element States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
ElementState	TokenNameIdentifier	 Element State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DocumentHandler	TokenNameIdentifier	 Document Handler
asDocumentHandler	TokenNameIdentifier	 as Document Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ContentHandler	TokenNameIdentifier	 Content Handler
asContentHandler	TokenNameIdentifier	 as Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DOMSerializer	TokenNameIdentifier	 DOM Serializer
asDOMSerializer	TokenNameIdentifier	 as DOM Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setOutputByteStream	TokenNameIdentifier	 set Output Byte Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
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
"ArgumentIsNull"	TokenNameStringLiteral	ArgumentIsNull
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"output"	TokenNameStringLiteral	output
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
_writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setOutputCharStream	TokenNameIdentifier	 set Output Char Stream
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
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
"ArgumentIsNull"	TokenNameStringLiteral	ArgumentIsNull
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"writer"	TokenNameStringLiteral	writer
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
_output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
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
"ArgumentIsNull"	TokenNameStringLiteral	ArgumentIsNull
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"format"	TokenNameStringLiteral	format
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_elementStateCount	TokenNameIdentifier	 element State Count
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
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
"ResetInMiddle"	TokenNameStringLiteral	ResetInMiddle
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
_prepared	TokenNameIdentifier	 prepared
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fStrBuffer	TokenNameIdentifier	 f Str Buffer
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_prepared	TokenNameIdentifier	 prepared
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_writer	TokenNameIdentifier	 writer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
_output	TokenNameIdentifier	 output
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
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If the output stream has been set, use it to construct 	TokenNameCOMMENT_LINE	If the output stream has been set, use it to construct 
// the writer. It is possible that the serializer has been 	TokenNameCOMMENT_LINE	the writer. It is possible that the serializer has been 
// reused with the same output stream and different encoding. 	TokenNameCOMMENT_LINE	reused with the same output stream and different encoding. 
_encodingInfo	TokenNameIdentifier	 encoding Info
=	TokenNameEQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getEncodingInfo	TokenNameIdentifier	 get Encoding Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_output	TokenNameIdentifier	 output
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
_encodingInfo	TokenNameIdentifier	 encoding Info
.	TokenNameDOT	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
_output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getIndenting	TokenNameIdentifier	 get Indenting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_indenting	TokenNameIdentifier	 indenting
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
=	TokenNameEQUAL	
new	TokenNamenew	
IndentPrinter	TokenNameIdentifier	 Indent Printer
(	TokenNameLPAREN	
_writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
_format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_indenting	TokenNameIdentifier	 indenting
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
=	TokenNameEQUAL	
new	TokenNamenew	
Printer	TokenNameIdentifier	 Printer
(	TokenNameLPAREN	
_writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
_format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ElementState	TokenNameIdentifier	 Element State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
_elementStateCount	TokenNameIdentifier	 element State Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
_elementStates	TokenNameIdentifier	 element States
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
rawName	TokenNameIdentifier	 raw Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
preserveSpace	TokenNameIdentifier	 preserve Space
=	TokenNameEQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getPreserveSpace	TokenNameIdentifier	 get Preserve Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterElement	TokenNameIdentifier	 after Element
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterComment	TokenNameIdentifier	 after Comment
=	TokenNameEQUAL	
false	TokenNamefalse	
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
state	TokenNameIdentifier	 state
.	TokenNameDOT	
prefixes	TokenNameIdentifier	 prefixes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_docTypePublicId	TokenNameIdentifier	 doc Type Public Id
=	TokenNameEQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getDoctypePublic	TokenNameIdentifier	 get Doctype Public
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_docTypeSystemId	TokenNameIdentifier	 doc Type System Id
=	TokenNameEQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getDoctypeSystem	TokenNameIdentifier	 get Doctype System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_started	TokenNameIdentifier	 started
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
_prepared	TokenNameIdentifier	 prepared
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//----------------------------------// 	TokenNameCOMMENT_LINE	----------------------------------// 
// DOM document serializing methods // 	TokenNameCOMMENT_LINE	DOM document serializing methods // 
//----------------------------------// 	TokenNameCOMMENT_LINE	----------------------------------// 
/** * Serializes the DOM element using the previously specified * writer and output format. Throws an exception only if * an I/O exception occured while serializing. * * @param elem The element to serialize * @throws IOException An I/O exception occured while * serializing */	TokenNameCOMMENT_JAVADOC	 Serializes the DOM element using the previously specified writer and output format. Throws an exception only if an I/O exception occured while serializing. * @param elem The element to serialize @throws IOException An I/O exception occured while serializing 
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serializeNode	TokenNameIdentifier	 serialize Node
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Serializes the DOM document fragmnt using the previously specified * writer and output format. Throws an exception only if * an I/O exception occured while serializing. * * @param frag The document fragment to serialize * @throws IOException An I/O exception occured while * serializing */	TokenNameCOMMENT_JAVADOC	 Serializes the DOM document fragmnt using the previously specified writer and output format. Throws an exception only if an I/O exception occured while serializing. * @param frag The document fragment to serialize @throws IOException An I/O exception occured while serializing 
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
DocumentFragment	TokenNameIdentifier	 Document Fragment
frag	TokenNameIdentifier	 frag
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serializeNode	TokenNameIdentifier	 serialize Node
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Serializes the DOM document using the previously specified * writer and output format. Throws an exception only if * an I/O exception occured while serializing. * * @param doc The document to serialize * @throws IOException An I/O exception occured while * serializing */	TokenNameCOMMENT_JAVADOC	 Serializes the DOM document using the previously specified writer and output format. Throws an exception only if an I/O exception occured while serializing. * @param doc The document to serialize @throws IOException An I/O exception occured while serializing 
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serializeNode	TokenNameIdentifier	 serialize Node
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serializePreRoot	TokenNameIdentifier	 serialize Pre Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------// 	TokenNameCOMMENT_LINE	------------------------------------------// 
// SAX document handler serializing methods // 	TokenNameCOMMENT_LINE	SAX document handler serializing methods // 
//------------------------------------------// 	TokenNameCOMMENT_LINE	------------------------------------------// 
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
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
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
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Nothing to do here. All the magic happens in startDocument(String) 	TokenNameCOMMENT_LINE	Nothing to do here. All the magic happens in startDocument(String) 
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
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
' '	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
_encodingInfo	TokenNameIdentifier	 encoding Info
.	TokenNameDOT	
isPrintable	TokenNameIdentifier	 is Printable
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
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
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
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
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
content	TokenNameIdentifier	 content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Print ignorable whitespaces only when indenting, after 	TokenNameCOMMENT_LINE	Print ignorable whitespaces only when indenting, after 
// all they are indentation. Cancel the indentation to 	TokenNameCOMMENT_LINE	all they are indentation. Cancel the indentation to 
// not indent twice. 	TokenNameCOMMENT_LINE	not indent twice. 
if	TokenNameif	
(	TokenNameLPAREN	
_indenting	TokenNameIdentifier	 indenting
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
setThisIndent	TokenNameIdentifier	 set This Indent
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
final	TokenNamefinal	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
processingInstructionIO	TokenNameIdentifier	 processing Instruction IO
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
code	TokenNameIdentifier	 code
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
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
ElementState	TokenNameIdentifier	 Element State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
content	TokenNameIdentifier	 content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create the processing instruction textual representation. 	TokenNameCOMMENT_LINE	Create the processing instruction textual representation. 
// Make sure we don't have '?>' inside either target or code. 	TokenNameCOMMENT_LINE	Make sure we don't have '?>' inside either target or code. 
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"?>"	TokenNameStringLiteral	?>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fStrBuffer	TokenNameIdentifier	 f Str Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<?"	TokenNameStringLiteral	<?
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fStrBuffer	TokenNameIdentifier	 f Str Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<?"	TokenNameStringLiteral	<?
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStrBuffer	TokenNameIdentifier	 f Str Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"?>"	TokenNameStringLiteral	?>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fStrBuffer	TokenNameIdentifier	 f Str Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fStrBuffer	TokenNameIdentifier	 f Str Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fStrBuffer	TokenNameIdentifier	 f Str Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"?>"	TokenNameStringLiteral	?>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If before the root element (or after it), do not print 	TokenNameCOMMENT_LINE	If before the root element (or after it), do not print 
// the PI directly but place it in the pre-root vector. 	TokenNameCOMMENT_LINE	the PI directly but place it in the pre-root vector. 
if	TokenNameif	
(	TokenNameLPAREN	
isDocumentState	TokenNameIdentifier	 is Document State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_preRoot	TokenNameIdentifier	 pre Root
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_preRoot	TokenNameIdentifier	 pre Root
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_preRoot	TokenNameIdentifier	 pre Root
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
fStrBuffer	TokenNameIdentifier	 f Str Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
fStrBuffer	TokenNameIdentifier	 f Str Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
unindent	TokenNameIdentifier	 unindent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_indenting	TokenNameIdentifier	 indenting
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterElement	TokenNameIdentifier	 after Element
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fStrBuffer	TokenNameIdentifier	 f Str Buffer
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
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
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
ElementState	TokenNameIdentifier	 Element State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getOmitComments	TokenNameIdentifier	 get Omit Comments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
content	TokenNameIdentifier	 content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create the processing comment textual representation. 	TokenNameCOMMENT_LINE	Create the processing comment textual representation. 
// Make sure we don't have '-->' inside the comment. 	TokenNameCOMMENT_LINE	Make sure we don't have '-->' inside the comment. 
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"-->"	TokenNameStringLiteral	-->
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fStrBuffer	TokenNameIdentifier	 f Str Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<!--"	TokenNameStringLiteral	<!--
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-->"	TokenNameStringLiteral	-->
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fStrBuffer	TokenNameIdentifier	 f Str Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<!--"	TokenNameStringLiteral	<!--
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-->"	TokenNameStringLiteral	-->
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If before the root element (or after it), do not print 	TokenNameCOMMENT_LINE	If before the root element (or after it), do not print 
// the comment directly but place it in the pre-root vector. 	TokenNameCOMMENT_LINE	the comment directly but place it in the pre-root vector. 
if	TokenNameif	
(	TokenNameLPAREN	
isDocumentState	TokenNameIdentifier	 is Document State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_preRoot	TokenNameIdentifier	 pre Root
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_preRoot	TokenNameIdentifier	 pre Root
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_preRoot	TokenNameIdentifier	 pre Root
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
fStrBuffer	TokenNameIdentifier	 f Str Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
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
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
fStrBuffer	TokenNameIdentifier	 f Str Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
unindent	TokenNameIdentifier	 unindent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_indenting	TokenNameIdentifier	 indenting
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterElement	TokenNameIdentifier	 after Element
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fStrBuffer	TokenNameIdentifier	 f Str Buffer
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterComment	TokenNameIdentifier	 after Comment
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterElement	TokenNameIdentifier	 after Element
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startCDATA	TokenNameIdentifier	 start CDATA
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
state	TokenNameIdentifier	 state
.	TokenNameDOT	
doCData	TokenNameIdentifier	 do C Data
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endCDATA	TokenNameIdentifier	 end CDATA
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
state	TokenNameIdentifier	 state
.	TokenNameDOT	
doCData	TokenNameIdentifier	 do C Data
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startNonEscaping	TokenNameIdentifier	 start Non Escaping
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
state	TokenNameIdentifier	 state
.	TokenNameDOT	
unescaped	TokenNameIdentifier	 unescaped
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endNonEscaping	TokenNameIdentifier	 end Non Escaping
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
state	TokenNameIdentifier	 state
.	TokenNameDOT	
unescaped	TokenNameIdentifier	 unescaped
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startPreserving	TokenNameIdentifier	 start Preserving
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
state	TokenNameIdentifier	 state
.	TokenNameDOT	
preserveSpace	TokenNameIdentifier	 preserve Space
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endPreserving	TokenNameIdentifier	 end Preserving
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
state	TokenNameIdentifier	 state
.	TokenNameDOT	
preserveSpace	TokenNameIdentifier	 preserve Space
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called at the end of the document to wrap it up. * Will flush the output stream and throw an exception * if any I/O error occured while serializing. * * @throws SAXException An I/O exception occured during * serializing */	TokenNameCOMMENT_JAVADOC	 Called at the end of the document to wrap it up. Will flush the output stream and throw an exception if any I/O error occured while serializing. * @throws SAXException An I/O exception occured during serializing 
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Print all the elements accumulated outside of 	TokenNameCOMMENT_LINE	Print all the elements accumulated outside of 
// the root element. 	TokenNameCOMMENT_LINE	the root element. 
serializePreRoot	TokenNameIdentifier	 serialize Pre Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Flush the output, this is necessary for fStrBuffered output. 	TokenNameCOMMENT_LINE	Flush the output, this is necessary for fStrBuffered output. 
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
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
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ??? 	TokenNameCOMMENT_LINE	??? 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ??? 	TokenNameCOMMENT_LINE	??? 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Nothing to do 	TokenNameCOMMENT_LINE	Nothing to do 
}	TokenNameRBRACE	
//-----------------------------------------// 	TokenNameCOMMENT_LINE	-----------------------------------------// 
// SAX content handler serializing methods // 	TokenNameCOMMENT_LINE	SAX content handler serializing methods // 
//-----------------------------------------// 	TokenNameCOMMENT_LINE	-----------------------------------------// 
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
try	TokenNametry	
{	TokenNameLBRACE	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
content	TokenNameIdentifier	 content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'&'	TokenNameCharacterLiteral	
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
';'	TokenNameCharacterLiteral	
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
if	TokenNameif	
(	TokenNameLPAREN	
_prefixes	TokenNameIdentifier	 prefixes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_prefixes	TokenNameIdentifier	 prefixes
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_prefixes	TokenNameIdentifier	 prefixes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
//------------------------------------------// 	TokenNameCOMMENT_LINE	------------------------------------------// 
// SAX DTD/Decl handler serializing methods // 	TokenNameCOMMENT_LINE	SAX DTD/Decl handler serializing methods // 
//------------------------------------------// 	TokenNameCOMMENT_LINE	------------------------------------------// 
public	TokenNamepublic	
final	TokenNamefinal	
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
try	TokenNametry	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
enterDTD	TokenNameIdentifier	 enter DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_docTypePublicId	TokenNameIdentifier	 doc Type Public Id
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
_docTypeSystemId	TokenNameIdentifier	 doc Type System Id
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
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
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Nothing to do here, all the magic occurs in startDocument(String). 	TokenNameCOMMENT_LINE	Nothing to do here, all the magic occurs in startDocument(String). 
}	TokenNameRBRACE	
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
try	TokenNametry	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
enterDTD	TokenNameIdentifier	 enter DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"<!ELEMENT "	TokenNameStringLiteral	<!ELEMENT 
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
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_indenting	TokenNameIdentifier	 indenting
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
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
try	TokenNametry	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
enterDTD	TokenNameIdentifier	 enter DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"<!ATTLIST "	TokenNameStringLiteral	<!ATTLIST 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
eName	TokenNameIdentifier	 e Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
aName	TokenNameIdentifier	 a Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
valueDefault	TokenNameIdentifier	 value Default
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
valueDefault	TokenNameIdentifier	 value Default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
" ""	TokenNameStringLiteral	 "
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
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_indenting	TokenNameIdentifier	 indenting
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
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
try	TokenNametry	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
enterDTD	TokenNameIdentifier	 enter DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"<!ENTITY "	TokenNameStringLiteral	<!ENTITY 
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
" ""	TokenNameStringLiteral	 "
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
"">"	TokenNameStringLiteral	">
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_indenting	TokenNameIdentifier	 indenting
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
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
try	TokenNametry	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
enterDTD	TokenNameIdentifier	 enter DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unparsedEntityDecl	TokenNameIdentifier	 unparsed Entity Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
null	TokenNamenull	
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
try	TokenNametry	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
enterDTD	TokenNameIdentifier	 enter DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"<!ENTITY "	TokenNameStringLiteral	<!ENTITY 
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
" SYSTEM "	TokenNameStringLiteral	 SYSTEM 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printDoctypeURL	TokenNameIdentifier	 print Doctype URL
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"<!ENTITY "	TokenNameStringLiteral	<!ENTITY 
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
" PUBLIC "	TokenNameStringLiteral	 PUBLIC 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printDoctypeURL	TokenNameIdentifier	 print Doctype URL
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printDoctypeURL	TokenNameIdentifier	 print Doctype URL
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
notationName	TokenNameIdentifier	 notation Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
" NDATA "	TokenNameStringLiteral	 NDATA 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
notationName	TokenNameIdentifier	 notation Name
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
if	TokenNameif	
(	TokenNameLPAREN	
_indenting	TokenNameIdentifier	 indenting
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
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
try	TokenNametry	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
enterDTD	TokenNameIdentifier	 enter DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"<!NOTATION "	TokenNameStringLiteral	<!NOTATION 
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
" PUBLIC "	TokenNameStringLiteral	 PUBLIC 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printDoctypeURL	TokenNameIdentifier	 print Doctype URL
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printDoctypeURL	TokenNameIdentifier	 print Doctype URL
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"<!NOTATION "	TokenNameStringLiteral	<!NOTATION 
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
" SYSTEM "	TokenNameStringLiteral	 SYSTEM 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printDoctypeURL	TokenNameIdentifier	 print Doctype URL
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
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
if	TokenNameif	
(	TokenNameLPAREN	
_indenting	TokenNameIdentifier	 indenting
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
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
//------------------------------------------// 	TokenNameCOMMENT_LINE	------------------------------------------// 
// Generic node serializing methods methods // 	TokenNameCOMMENT_LINE	Generic node serializing methods methods // 
//------------------------------------------// 	TokenNameCOMMENT_LINE	------------------------------------------// 
/** * Serialize the DOM node. This method is shared across XML, HTML and XHTML * serializers and the differences are masked out in a separate {@link * #serializeElement}. * * @param node The node to serialize * @see #serializeElement * @throws IOException An I/O exception occured while * serializing */	TokenNameCOMMENT_JAVADOC	 Serialize the DOM node. This method is shared across XML, HTML and XHTML serializers and the differences are masked out in a separate {@link #serializeElement}. * @param node The node to serialize @see #serializeElement @throws IOException An I/O exception occured while serializing 
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
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
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
SHOW_TEXT	TokenNameIdentifier	 SHOW  TEXT
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
node	TokenNameIdentifier	 node
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_indenting	TokenNameIdentifier	 indenting
||	TokenNameOR_OR	
getElementState	TokenNameIdentifier	 get Element State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
preserveSpace	TokenNameIdentifier	 preserve Space
||	TokenNameOR_OR	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
features	TokenNameIdentifier	 features
&	TokenNameAND	
DOMSerializerImpl	TokenNameIdentifier	 DOM Serializer Impl
.	TokenNameDOT	
CDATA	TokenNameIdentifier	 CDATA
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
SHOW_CDATA_SECTION	TokenNameIdentifier	 SHOW  CDATA  SECTION
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
node	TokenNameIdentifier	 node
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
// skip the CDATA node 	TokenNameCOMMENT_LINE	skip the CDATA node 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
//fall through.. 	TokenNameCOMMENT_LINE	fall through.. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// transform into a text node 	TokenNameCOMMENT_LINE	transform into a text node 
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
getOmitComments	TokenNameIdentifier	 get Omit Comments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
SHOW_COMMENT	TokenNameIdentifier	 SHOW  COMMENT
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
node	TokenNameIdentifier	 node
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
// skip the comment node 	TokenNameCOMMENT_LINE	skip the comment node 
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
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
content	TokenNameIdentifier	 content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
features	TokenNameIdentifier	 features
&	TokenNameAND	
DOMSerializerImpl	TokenNameIdentifier	 DOM Serializer Impl
.	TokenNameDOT	
ENTITIES	TokenNameIdentifier	 ENTITIES
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
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
SHOW_ENTITY_REFERENCE	TokenNameIdentifier	 SHOW  ENTITY  REFERENCE
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
node	TokenNameIdentifier	 node
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
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// remove the node 	TokenNameCOMMENT_LINE	remove the node 
}	TokenNameRBRACE	
case	TokenNamecase	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
:	TokenNameCOLON	
{	TokenNameLBRACE	
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
checkUnboundNamespacePrefixedNode	TokenNameIdentifier	 check Unbound Namespace Prefixed Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"&"	TokenNameStringLiteral	&
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
";"	TokenNameStringLiteral	;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
:	TokenNameCOLON	
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
SHOW_PROCESSING_INSTRUCTION	TokenNameIdentifier	 SHOW  PROCESSING  INSTRUCTION
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
node	TokenNameIdentifier	 node
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
// skip this node 	TokenNameCOMMENT_LINE	skip this node 
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
// fall through 	TokenNameCOMMENT_LINE	fall through 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
processingInstructionIO	TokenNameIdentifier	 processing Instruction IO
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
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
SHOW_ELEMENT	TokenNameIdentifier	 SHOW  ELEMENT
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
node	TokenNameIdentifier	 node
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
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
:	TokenNameCOLON	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
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
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// skip this node 	TokenNameCOMMENT_LINE	skip this node 
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
// fall through 	TokenNameCOMMENT_LINE	fall through 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
DocumentType	TokenNameIdentifier	 Document Type
docType	TokenNameIdentifier	 doc Type
;	TokenNameSEMICOLON	
// If there is a document type, use the SAX events to 	TokenNameCOMMENT_LINE	If there is a document type, use the SAX events to 
// serialize it. 	TokenNameCOMMENT_LINE	serialize it. 
docType	TokenNameIdentifier	 doc Type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDoctype	TokenNameIdentifier	 get Doctype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docType	TokenNameIdentifier	 doc Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// DOM Level 2 (or higher) 	TokenNameCOMMENT_LINE	DOM Level 2 (or higher) 
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
internal	TokenNameIdentifier	 internal
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
enterDTD	TokenNameIdentifier	 enter DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_docTypePublicId	TokenNameIdentifier	 doc Type Public Id
=	TokenNameEQUAL	
docType	TokenNameIdentifier	 doc Type
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_docTypeSystemId	TokenNameIdentifier	 doc Type System Id
=	TokenNameEQUAL	
docType	TokenNameIdentifier	 doc Type
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
internal	TokenNameIdentifier	 internal
=	TokenNameEQUAL	
docType	TokenNameIdentifier	 doc Type
.	TokenNameDOT	
getInternalSubset	TokenNameIdentifier	 get Internal Subset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
internal	TokenNameIdentifier	 internal
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
internal	TokenNameIdentifier	 internal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DOM Level 1 -- does implementation have methods? 	TokenNameCOMMENT_LINE	DOM Level 1 -- does implementation have methods? 
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodError	TokenNameIdentifier	 No Such Method Error
nsme	TokenNameIdentifier	 nsme
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
docTypeClass	TokenNameIdentifier	 doc Type Class
=	TokenNameEQUAL	
docType	TokenNameIdentifier	 doc Type
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
docTypePublicId	TokenNameIdentifier	 doc Type Public Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
docTypeSystemId	TokenNameIdentifier	 doc Type System Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
getPublicId	TokenNameIdentifier	 get Public Id
=	TokenNameEQUAL	
docTypeClass	TokenNameIdentifier	 doc Type Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getPublicId"	TokenNameStringLiteral	getPublicId
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getPublicId	TokenNameIdentifier	 get Public Id
.	TokenNameDOT	
getReturnType	TokenNameIdentifier	 get Return Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docTypePublicId	TokenNameIdentifier	 doc Type Public Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
getPublicId	TokenNameIdentifier	 get Public Id
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
docType	TokenNameIdentifier	 doc Type
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
getSystemId	TokenNameIdentifier	 get System Id
=	TokenNameEQUAL	
docTypeClass	TokenNameIdentifier	 doc Type Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getSystemId"	TokenNameStringLiteral	getSystemId
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getSystemId	TokenNameIdentifier	 get System Id
.	TokenNameDOT	
getReturnType	TokenNameIdentifier	 get Return Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docTypeSystemId	TokenNameIdentifier	 doc Type System Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
getSystemId	TokenNameIdentifier	 get System Id
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
docType	TokenNameIdentifier	 doc Type
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
enterDTD	TokenNameIdentifier	 enter DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_docTypePublicId	TokenNameIdentifier	 doc Type Public Id
=	TokenNameEQUAL	
docTypePublicId	TokenNameIdentifier	 doc Type Public Id
;	TokenNameSEMICOLON	
_docTypeSystemId	TokenNameIdentifier	 doc Type System Id
=	TokenNameEQUAL	
docTypeSystemId	TokenNameIdentifier	 doc Type System Id
;	TokenNameSEMICOLON	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// !! Fall through 	TokenNameCOMMENT_LINE	!! Fall through 
}	TokenNameRBRACE	
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
/** * Must be called by a method about to print any type of content. * If the element was just opened, the opening tag is closed and * will be matched to a closing tag. Returns the current element * state with <tt>empty</tt> and <tt>afterElement</tt> set to false. * * @return The current element state * @throws IOException An I/O exception occurred while * serializing */	TokenNameCOMMENT_JAVADOC	 Must be called by a method about to print any type of content. If the element was just opened, the opening tag is closed and will be matched to a closing tag. Returns the current element state with <tt>empty</tt> and <tt>afterElement</tt> set to false. * @return The current element state @throws IOException An I/O exception occurred while serializing 
protected	TokenNameprotected	
ElementState	TokenNameIdentifier	 Element State
content	TokenNameIdentifier	 content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
// Need to close CData section first 	TokenNameCOMMENT_LINE	Need to close CData section first 
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
inCData	TokenNameIdentifier	 in C Data
&&	TokenNameAND_AND	
!	TokenNameNOT	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
doCData	TokenNameIdentifier	 do C Data
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
// If this is the first content in the element, 	TokenNameCOMMENT_LINE	If this is the first content in the element, 
// change the state to not-empty and close the 	TokenNameCOMMENT_LINE	change the state to not-empty and close the 
// opening element tag. 	TokenNameCOMMENT_LINE	opening element tag. 
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
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Except for one content type, all of them 	TokenNameCOMMENT_LINE	Except for one content type, all of them 
// are not last element. That one content 	TokenNameCOMMENT_LINE	are not last element. That one content 
// type will take care of itself. 	TokenNameCOMMENT_LINE	type will take care of itself. 
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterElement	TokenNameIdentifier	 after Element
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Except for one content type, all of them 	TokenNameCOMMENT_LINE	Except for one content type, all of them 
// are not last comment. That one content 	TokenNameCOMMENT_LINE	are not last comment. That one content 
// type will take care of itself. 	TokenNameCOMMENT_LINE	type will take care of itself. 
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterComment	TokenNameIdentifier	 after Comment
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called to print the text contents in the prevailing element format. * Since this method is capable of printing text as CDATA, it is used * for that purpose as well. White space handling is determined by the * current element state. In addition, the output format can dictate * whether the text is printed as CDATA or unescaped. * * @param text The text to print * @throws IOException An I/O exception occured while * serializing */	TokenNameCOMMENT_JAVADOC	 Called to print the text contents in the prevailing element format. Since this method is capable of printing text as CDATA, it is used for that purpose as well. White space handling is determined by the current element state. In addition, the output format can dictate whether the text is printed as CDATA or unescaped. * @param text The text to print @throws IOException An I/O exception occured while serializing 
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
ElementState	TokenNameIdentifier	 Element State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
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
int	TokenNameint	
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
printCDATAText	TokenNameIdentifier	 print CDATA Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
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
text	TokenNameIdentifier	 text
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
text	TokenNameIdentifier	 text
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
/** * Returns the suitable entity reference for this character value, * or null if no such entity exists. Calling this method with <tt>'&amp;'</tt> * will return <tt>"&amp;amp;"</tt>. * * @param ch Character value * @return Character entity name, or null */	TokenNameCOMMENT_JAVADOC	 Returns the suitable entity reference for this character value, or null if no such entity exists. Calling this method with <tt>'&amp;'</tt> will return <tt>"&amp;amp;"</tt>. * @param ch Character value @return Character entity name, or null 
protected	TokenNameprotected	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getEntityRef	TokenNameIdentifier	 get Entity Ref
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called to serializee the DOM element. The element is serialized based on * the serializer's method (XML, HTML, XHTML). * * @param elem The element to serialize * @throws IOException An I/O exception occured while * serializing */	TokenNameCOMMENT_JAVADOC	 Called to serializee the DOM element. The element is serialized based on the serializer's method (XML, HTML, XHTML). * @param elem The element to serialize @throws IOException An I/O exception occured while serializing 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
serializeElement	TokenNameIdentifier	 serialize Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Comments and PIs cannot be serialized before the root element, * because the root element serializes the document type, which * generally comes first. Instead such PIs and comments are * accumulated inside a vector and serialized by calling this * method. Will be called when the root element is serialized * and when the document finished serializing. * * @throws IOException An I/O exception occured while * serializing */	TokenNameCOMMENT_JAVADOC	 Comments and PIs cannot be serialized before the root element, because the root element serializes the document type, which generally comes first. Instead such PIs and comments are accumulated inside a vector and serialized by calling this method. Will be called when the root element is serialized and when the document finished serializing. * @throws IOException An I/O exception occured while serializing 
protected	TokenNameprotected	
void	TokenNamevoid	
serializePreRoot	TokenNameIdentifier	 serialize Pre Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_preRoot	TokenNameIdentifier	 pre Root
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
_preRoot	TokenNameIdentifier	 pre Root
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
_preRoot	TokenNameIdentifier	 pre Root
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_indenting	TokenNameIdentifier	 indenting
)	TokenNameRPAREN	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
breakLine	TokenNameIdentifier	 break Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_preRoot	TokenNameIdentifier	 pre Root
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//---------------------------------------------// 	TokenNameCOMMENT_LINE	---------------------------------------------// 
// Text pretty printing and formatting methods // 	TokenNameCOMMENT_LINE	Text pretty printing and formatting methods // 
//---------------------------------------------// 	TokenNameCOMMENT_LINE	---------------------------------------------// 
protected	TokenNameprotected	
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
"EndingCDATA"	TokenNameStringLiteral	EndingCDATA
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
features	TokenNameIdentifier	 features
&	TokenNameAND	
DOMSerializerImpl	TokenNameIdentifier	 DOM Serializer Impl
.	TokenNameDOT	
WELLFORMED	TokenNameIdentifier	 WELLFORMED
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// issue fatal error 	TokenNameCOMMENT_LINE	issue fatal error 
modifyDOMError	TokenNameIdentifier	 modify DOM Error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
DOMError	TokenNameIdentifier	 DOM Error
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
,	TokenNameCOMMA	
"wf-invalid-character"	TokenNameStringLiteral	wf-invalid-character
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
throw	TokenNamethrow	
new	TokenNamenew	
LSException	TokenNameIdentifier	 LS Exception
(	TokenNameLPAREN	
LSException	TokenNameIdentifier	 LS Exception
.	TokenNameDOT	
SERIALIZE_ERR	TokenNameIdentifier	 SERIALIZE  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// issue error 	TokenNameCOMMENT_LINE	issue error 
modifyDOMError	TokenNameIdentifier	 modify DOM Error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
DOMError	TokenNameIdentifier	 DOM Error
.	TokenNameDOT	
SEVERITY_ERROR	TokenNameIdentifier	 SEVERITY  ERROR
,	TokenNameCOMMA	
"cdata-section-not-splitted"	TokenNameStringLiteral	cdata-section-not-splitted
,	TokenNameCOMMA	
fCurrentNode	TokenNameIdentifier	 f Current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fDOMErrorHandler	TokenNameIdentifier	 f DOM Error Handler
.	TokenNameDOT	
handleError	TokenNameIdentifier	 handle Error
(	TokenNameLPAREN	
fDOMError	TokenNameIdentifier	 f DOM Error
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
LSException	TokenNameIdentifier	 LS Exception
(	TokenNameLPAREN	
LSException	TokenNameIdentifier	 LS Exception
.	TokenNameDOT	
SERIALIZE_ERR	TokenNameIdentifier	 SERIALIZE  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
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
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
' '	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
_encodingInfo	TokenNameIdentifier	 encoding Info
.	TokenNameDOT	
isPrintable	TokenNameIdentifier	 is Printable
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
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
protected	TokenNameprotected	
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
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isValid	TokenNameIdentifier	 is Valid
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
/** * Called to print additional text with whitespace handling. * If spaces are preserved, the text is printed as if by calling * {@link #printText(String,boolean,boolean)} with a call to {@link Printer#breakLine} * for each new line. If spaces are not preserved, the text is * broken at space boundaries if longer than the line width; * Multiple spaces are printed as such, but spaces at beginning * of line are removed. * * @param chars The text to print * @param start The start offset * @param length The number of characters * @param preserveSpace Space preserving flag * @param unescaped Print unescaped */	TokenNameCOMMENT_JAVADOC	 Called to print additional text with whitespace handling. If spaces are preserved, the text is printed as if by calling {@link #printText(String,boolean,boolean)} with a call to {@link Printer#breakLine} for each new line. If spaces are not preserved, the text is broken at space boundaries if longer than the line width; Multiple spaces are printed as such, but spaces at beginning of line are removed. * @param chars The text to print @param start The start offset @param length The number of characters @param preserveSpace Space preserving flag @param unescaped Print unescaped 
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
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
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
printEscaped	TokenNameIdentifier	 print Escaped
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
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\f'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\t'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printSpace	TokenNameIdentifier	 print Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
printEscaped	TokenNameIdentifier	 print Escaped
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
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
printEscaped	TokenNameIdentifier	 print Escaped
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
' '	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\f'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\t'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printSpace	TokenNameIdentifier	 print Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
printEscaped	TokenNameIdentifier	 print Escaped
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Print a document type public or system identifier URL. * Encapsulates the URL in double quotes, escapes non-printing * characters and print it equivalent to {@link #printText}. * * @param url The document type url to print */	TokenNameCOMMENT_JAVADOC	 Print a document type public or system identifier URL. Encapsulates the URL in double quotes, escapes non-printing characters and print it equivalent to {@link #printText}. * @param url The document type url to print 
protected	TokenNameprotected	
void	TokenNamevoid	
printDoctypeURL	TokenNameIdentifier	 print Doctype URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
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
url	TokenNameIdentifier	 url
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'"'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
<	TokenNameLESS	
0x20	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
>	TokenNameGREATER	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
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
url	TokenNameIdentifier	 url
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
printEscaped	TokenNameIdentifier	 print Escaped
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
charRef	TokenNameIdentifier	 char Ref
;	TokenNameSEMICOLON	
// If there is a suitable entity reference for this 	TokenNameCOMMENT_LINE	If there is a suitable entity reference for this 
// character, print it. The list of available entity 	TokenNameCOMMENT_LINE	character, print it. The list of available entity 
// references is almost but not identical between 	TokenNameCOMMENT_LINE	references is almost but not identical between 
// XML and HTML. 	TokenNameCOMMENT_LINE	XML and HTML. 
charRef	TokenNameIdentifier	 char Ref
=	TokenNameEQUAL	
getEntityRef	TokenNameIdentifier	 get Entity Ref
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
charRef	TokenNameIdentifier	 char Ref
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
charRef	TokenNameIdentifier	 char Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
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
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
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
// Non printables are below ASCII space but not tab or line 	TokenNameCOMMENT_LINE	Non printables are below ASCII space but not tab or line 
// terminator, ASCII delete, or above a certain Unicode threshold. 	TokenNameCOMMENT_LINE	terminator, ASCII delete, or above a certain Unicode threshold. 
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
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
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
0x10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0xd800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
0x10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0xdc00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
/** * Escapes chars */	TokenNameCOMMENT_JAVADOC	 Escapes chars 
final	TokenNamefinal	
void	TokenNamevoid	
printHex	TokenNameIdentifier	 print Hex
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
_printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
printText	TokenNameIdentifier	 print Text
(	TokenNameLPAREN	
"&#x"	TokenNameStringLiteral	&#x
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
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Escapes a string so it may be printed as text content or attribute * value. Non printable characters are escaped using character references. * Where the format specifies a deault entity reference, that reference * is used (e.g. <tt>&amp;lt;</tt>). * * @param source The string to escape */	TokenNameCOMMENT_JAVADOC	 Escapes a string so it may be printed as text content or attribute value. Non printable characters are escaped using character references. Where the format specifies a deault entity reference, that reference is used (e.g. <tt>&amp;lt;</tt>). * @param source The string to escape 
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
&	TokenNameAND	
0xfc00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0xd800	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lowch	TokenNameIdentifier	 lowch
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
lowch	TokenNameIdentifier	 lowch
&	TokenNameAND	
0xfc00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0xdc00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
0x10000	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
0xd800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
lowch	TokenNameIdentifier	 lowch
-	TokenNameMINUS	
0xdc00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
printEscaped	TokenNameIdentifier	 print Escaped
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//--------------------------------// 	TokenNameCOMMENT_LINE	--------------------------------// 
// Element state handling methods // 	TokenNameCOMMENT_LINE	Element state handling methods // 
//--------------------------------// 	TokenNameCOMMENT_LINE	--------------------------------// 
/** * Return the state of the current element. * * @return Current element state */	TokenNameCOMMENT_JAVADOC	 Return the state of the current element. * @return Current element state 
protected	TokenNameprotected	
ElementState	TokenNameIdentifier	 Element State
getElementState	TokenNameIdentifier	 get Element State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_elementStates	TokenNameIdentifier	 element States
[	TokenNameLBRACKET	
_elementStateCount	TokenNameIdentifier	 element State Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Enter a new element state for the specified element. * Tag name and space preserving is specified, element * state is initially empty. * * @return Current element state, or null */	TokenNameCOMMENT_JAVADOC	 Enter a new element state for the specified element. Tag name and space preserving is specified, element state is initially empty. * @return Current element state, or null 
protected	TokenNameprotected	
ElementState	TokenNameIdentifier	 Element State
enterElementState	TokenNameIdentifier	 enter Element State
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
boolean	TokenNameboolean	
preserveSpace	TokenNameIdentifier	 preserve Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElementState	TokenNameIdentifier	 Element State
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_elementStateCount	TokenNameIdentifier	 element State Count
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
_elementStates	TokenNameIdentifier	 element States
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElementState	TokenNameIdentifier	 Element State
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newStates	TokenNameIdentifier	 new States
;	TokenNameSEMICOLON	
// Need to create a larger array of states. This does not happen 	TokenNameCOMMENT_LINE	Need to create a larger array of states. This does not happen 
// often, unless the document is really deep. 	TokenNameCOMMENT_LINE	often, unless the document is really deep. 
newStates	TokenNameIdentifier	 new States
=	TokenNameEQUAL	
new	TokenNamenew	
ElementState	TokenNameIdentifier	 Element State
[	TokenNameLBRACKET	
_elementStates	TokenNameIdentifier	 element States
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
_elementStates	TokenNameIdentifier	 element States
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
newStates	TokenNameIdentifier	 new States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
_elementStates	TokenNameIdentifier	 element States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
_elementStates	TokenNameIdentifier	 element States
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
newStates	TokenNameIdentifier	 new States
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
newStates	TokenNameIdentifier	 new States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
ElementState	TokenNameIdentifier	 Element State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementStates	TokenNameIdentifier	 element States
=	TokenNameEQUAL	
newStates	TokenNameIdentifier	 new States
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
++	TokenNamePLUS_PLUS	
_elementStateCount	TokenNameIdentifier	 element State Count
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
_elementStates	TokenNameIdentifier	 element States
[	TokenNameLBRACKET	
_elementStateCount	TokenNameIdentifier	 element State Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
rawName	TokenNameIdentifier	 raw Name
=	TokenNameEQUAL	
rawName	TokenNameIdentifier	 raw Name
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
preserveSpace	TokenNameIdentifier	 preserve Space
=	TokenNameEQUAL	
preserveSpace	TokenNameIdentifier	 preserve Space
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterElement	TokenNameIdentifier	 after Element
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
afterComment	TokenNameIdentifier	 after Comment
=	TokenNameEQUAL	
false	TokenNamefalse	
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
state	TokenNameIdentifier	 state
.	TokenNameDOT	
unescaped	TokenNameIdentifier	 unescaped
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
prefixes	TokenNameIdentifier	 prefixes
=	TokenNameEQUAL	
_prefixes	TokenNameIdentifier	 prefixes
;	TokenNameSEMICOLON	
_prefixes	TokenNameIdentifier	 prefixes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Leave the current element state and return to the * state of the parent element. If this was the root * element, return to the state of the document. * * @return Previous element state */	TokenNameCOMMENT_JAVADOC	 Leave the current element state and return to the state of the parent element. If this was the root element, return to the state of the document. * @return Previous element state 
protected	TokenNameprotected	
ElementState	TokenNameIdentifier	 Element State
leaveElementState	TokenNameIdentifier	 leave Element State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_elementStateCount	TokenNameIdentifier	 element State Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*Corrected by David Blondeau (blondeau@intalio.com)*/	TokenNameCOMMENT_BLOCK	Corrected by David Blondeau (blondeau@intalio.com)
_prefixes	TokenNameIdentifier	 prefixes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//_prefixes = _elementStates[ _elementStateCount ].prefixes; 	TokenNameCOMMENT_LINE	_prefixes = _elementStates[ _elementStateCount ].prefixes; 
--	TokenNameMINUS_MINUS	
_elementStateCount	TokenNameIdentifier	 element State Count
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_elementStates	TokenNameIdentifier	 element States
[	TokenNameLBRACKET	
_elementStateCount	TokenNameIdentifier	 element State Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
"Internal"	TokenNameStringLiteral	Internal
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
/** * Returns true if in the state of the document. * Returns true before entering any element and after * leaving the root element. * * @return True if in the state of the document */	TokenNameCOMMENT_JAVADOC	 Returns true if in the state of the document. Returns true before entering any element and after leaving the root element. * @return True if in the state of the document 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isDocumentState	TokenNameIdentifier	 is Document State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_elementStateCount	TokenNameIdentifier	 element State Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Clears document state. **/	TokenNameCOMMENT_JAVADOC	 Clears document state. *
final	TokenNamefinal	
void	TokenNamevoid	
clearDocumentState	TokenNameIdentifier	 clear Document State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_elementStateCount	TokenNameIdentifier	 element State Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the namespace prefix for the specified URI. * If the URI has been mapped to a prefix, returns the * prefix, otherwise returns null. * * @param namespaceURI The namespace URI * @return The namespace prefix if known, or null */	TokenNameCOMMENT_JAVADOC	 Returns the namespace prefix for the specified URI. If the URI has been mapped to a prefix, returns the prefix, otherwise returns null. * @param namespaceURI The namespace URI @return The namespace prefix if known, or null 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_prefixes	TokenNameIdentifier	 prefixes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
_prefixes	TokenNameIdentifier	 prefixes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_elementStateCount	TokenNameIdentifier	 element State Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
_elementStateCount	TokenNameIdentifier	 element State Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_elementStates	TokenNameIdentifier	 element States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
prefixes	TokenNameIdentifier	 prefixes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
_elementStates	TokenNameIdentifier	 element States
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
prefixes	TokenNameIdentifier	 prefixes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The method modifies global DOM error object * * @param message * @param severity * @param type * @return a DOMError */	TokenNameCOMMENT_JAVADOC	 The method modifies global DOM error object * @param message @param severity @param type @return a DOMError 
protected	TokenNameprotected	
DOMError	TokenNameIdentifier	 DOM Error
modifyDOMError	TokenNameIdentifier	 modify DOM Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
short	TokenNameshort	
severity	TokenNameIdentifier	 severity
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fMessage	TokenNameIdentifier	 f Message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fSeverity	TokenNameIdentifier	 f Severity
=	TokenNameEQUAL	
severity	TokenNameIdentifier	 severity
;	TokenNameSEMICOLON	
fDOMError	TokenNameIdentifier	 f DOM Error
.	TokenNameDOT	
fLocator	TokenNameIdentifier	 f Locator
=	TokenNameEQUAL	
new	TokenNamenew	
DOMLocatorImpl	TokenNameIdentifier	 DOM Locator Impl
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fDOMError	TokenNameIdentifier	 f DOM Error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDOMErrorHandler	TokenNameIdentifier	 f DOM Error Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modifyDOMError	TokenNameIdentifier	 modify DOM Error
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
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
fDOMErrorHandler	TokenNameIdentifier	 f DOM Error Handler
.	TokenNameDOT	
handleError	TokenNameIdentifier	 handle Error
(	TokenNameLPAREN	
fDOMError	TokenNameIdentifier	 f DOM Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * DOM level 3: * Check a node to determine if it contains unbound namespace prefixes. * * @param node The node to check for unbound namespace prefices */	TokenNameCOMMENT_JAVADOC	 DOM level 3: Check a node to determine if it contains unbound namespace prefixes. * @param node The node to check for unbound namespace prefices 
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
