/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Aug 21, 2000: 	TokenNameCOMMENT_LINE	Aug 21, 2000: 
// Added ability to omit DOCTYPE declaration. 	TokenNameCOMMENT_LINE	Added ability to omit DOCTYPE declaration. 
// Reported by Lars Martin <lars@smb-tec.com> 	TokenNameCOMMENT_LINE	Reported by Lars Martin <lars@smb-tec.com> 
// Aug 25, 2000: 	TokenNameCOMMENT_LINE	Aug 25, 2000: 
// Added ability to omit comments. 	TokenNameCOMMENT_LINE	Added ability to omit comments. 
// Contributed by Anupam Bagchi <abagchi@jtcsv.com> 	TokenNameCOMMENT_LINE	Contributed by Anupam Bagchi <abagchi@jtcsv.com> 
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
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
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
DocumentType	TokenNameIdentifier	 Document Type
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
html	TokenNameIdentifier	 html
.	TokenNameDOT	
HTMLDocument	TokenNameIdentifier	 HTML Document
;	TokenNameSEMICOLON	
/** * Specifies an output format to control the serializer. Based on the * XSLT specification for output format, plus additional parameters. * Used to select the suitable serializer and determine how the * document should be formatted on output. * <p> * The two interesting constructors are: * <ul> * <li>{@link #OutputFormat(String,String,boolean)} creates a format * for the specified method (XML, HTML, Text, etc), encoding and indentation * <li>{@link #OutputFormat(Document,String,boolean)} creates a format * compatible with the document type (XML, HTML, Text, etc), encoding and * indentation * </ul> * * * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended * that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation * API for XML (TrAX) for serializing XML and HTML. See the Xerces documentation for * more information. * @version $Revision: 476048 $ $Date: 2006-11-16 23:32:47 -0500 (Thu, 16 Nov 2006) $ * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> * <a href="mailto:visco@intalio.com">Keith Visco</a> * @see Serializer * @see Method * @see LineSeparator */	TokenNameCOMMENT_JAVADOC	 Specifies an output format to control the serializer. Based on the XSLT specification for output format, plus additional parameters. Used to select the suitable serializer and determine how the document should be formatted on output. <p> The two interesting constructors are: <ul> <li>{@link #OutputFormat(String,String,boolean)} creates a format for the specified method (XML, HTML, Text, etc), encoding and indentation <li>{@link #OutputFormat(Document,String,boolean)} creates a format compatible with the document type (XML, HTML, Text, etc), encoding and indentation </ul> * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation API for XML (TrAX) for serializing XML and HTML. See the Xerces documentation for more information. @version $Revision: 476048 $ $Date: 2006-11-16 23:32:47 -0500 (Thu, 16 Nov 2006) $ @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> <a href="mailto:visco@intalio.com">Keith Visco</a> @see Serializer @see Method @see LineSeparator 
public	TokenNamepublic	
class	TokenNameclass	
OutputFormat	TokenNameIdentifier	 Output Format
{	TokenNameLBRACE	
/** * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended * that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation * API for XML (TrAX) for serializing XML and HTML. See the Xerces documentation for * more information. */	TokenNameCOMMENT_JAVADOC	 @deprecated This class was deprecated in Xerces 2.9.0. It is recommended that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation API for XML (TrAX) for serializing XML and HTML. See the Xerces documentation for more information. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
DTD	TokenNameIdentifier	 DTD
{	TokenNameLBRACE	
/** * Public identifier for HTML 4.01 (Strict) document type. */	TokenNameCOMMENT_JAVADOC	 Public identifier for HTML 4.01 (Strict) document type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HTMLPublicId	TokenNameIdentifier	 HTML Public Id
=	TokenNameEQUAL	
"-//W3C//DTD HTML 4.01//EN"	TokenNameStringLiteral	-//W3C//DTD HTML 4.01//EN
;	TokenNameSEMICOLON	
/** * System identifier for HTML 4.01 (Strict) document type. */	TokenNameCOMMENT_JAVADOC	 System identifier for HTML 4.01 (Strict) document type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HTMLSystemId	TokenNameIdentifier	 HTML System Id
=	TokenNameEQUAL	
"http://www.w3.org/TR/html4/strict.dtd"	TokenNameStringLiteral	http://www.w3.org/TR/html4/strict.dtd
;	TokenNameSEMICOLON	
/** * Public identifier for XHTML 1.0 (Strict) document type. */	TokenNameCOMMENT_JAVADOC	 Public identifier for XHTML 1.0 (Strict) document type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XHTMLPublicId	TokenNameIdentifier	 XHTML Public Id
=	TokenNameEQUAL	
"-//W3C//DTD XHTML 1.0 Strict//EN"	TokenNameStringLiteral	-//W3C//DTD XHTML 1.0 Strict//EN
;	TokenNameSEMICOLON	
/** * System identifier for XHTML 1.0 (Strict) document type. */	TokenNameCOMMENT_JAVADOC	 System identifier for XHTML 1.0 (Strict) document type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XHTMLSystemId	TokenNameIdentifier	 XHTML System Id
=	TokenNameEQUAL	
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"	TokenNameStringLiteral	http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended * that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation * API for XML (TrAX) for serializing XML and HTML. See the Xerces documentation for * more information. */	TokenNameCOMMENT_JAVADOC	 @deprecated This class was deprecated in Xerces 2.9.0. It is recommended that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation API for XML (TrAX) for serializing XML and HTML. See the Xerces documentation for more information. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Defaults	TokenNameIdentifier	 Defaults
{	TokenNameLBRACE	
/** * If indentation is turned on, the default identation * level is 4. * * @see #setIndenting(boolean) */	TokenNameCOMMENT_JAVADOC	 If indentation is turned on, the default identation level is 4. * @see #setIndenting(boolean) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
Indent	TokenNameIdentifier	 Indent
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The default encoding for Web documents it UTF-8. * * @see #getEncoding() */	TokenNameCOMMENT_JAVADOC	 The default encoding for Web documents it UTF-8. * @see #getEncoding() 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
Encoding	TokenNameIdentifier	 Encoding
=	TokenNameEQUAL	
"UTF-8"	TokenNameStringLiteral	UTF-8
;	TokenNameSEMICOLON	
/** * The default line width at which to break long lines * when identing. This is set to 72. */	TokenNameCOMMENT_JAVADOC	 The default line width at which to break long lines when identing. This is set to 72. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LineWidth	TokenNameIdentifier	 Line Width
=	TokenNameEQUAL	
72	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Holds the output method specified for this document, * or null if no method was specified. */	TokenNameCOMMENT_JAVADOC	 Holds the output method specified for this document, or null if no method was specified. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
/** * Specifies the version of the output method. */	TokenNameCOMMENT_JAVADOC	 Specifies the version of the output method. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
/** * The indentation level, or zero if no indentation * was requested. */	TokenNameCOMMENT_JAVADOC	 The indentation level, or zero if no indentation was requested. 
private	TokenNameprivate	
int	TokenNameint	
_indent	TokenNameIdentifier	 indent
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The encoding to use, if an input stream is used. * The default is always UTF-8. */	TokenNameCOMMENT_JAVADOC	 The encoding to use, if an input stream is used. The default is always UTF-8. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
Defaults	TokenNameIdentifier	 Defaults
.	TokenNameDOT	
Encoding	TokenNameIdentifier	 Encoding
;	TokenNameSEMICOLON	
/** * The EncodingInfo instance for _encoding. */	TokenNameCOMMENT_JAVADOC	 The EncodingInfo instance for _encoding. 
private	TokenNameprivate	
EncodingInfo	TokenNameIdentifier	 Encoding Info
_encodingInfo	TokenNameIdentifier	 encoding Info
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// whether java names for encodings are permitted 	TokenNameCOMMENT_LINE	whether java names for encodings are permitted 
private	TokenNameprivate	
boolean	TokenNameboolean	
_allowJavaNames	TokenNameIdentifier	 allow Java Names
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The specified media type or null. */	TokenNameCOMMENT_JAVADOC	 The specified media type or null. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_mediaType	TokenNameIdentifier	 media Type
;	TokenNameSEMICOLON	
/** * The specified document type system identifier, or null. */	TokenNameCOMMENT_JAVADOC	 The specified document type system identifier, or null. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_doctypeSystem	TokenNameIdentifier	 doctype System
;	TokenNameSEMICOLON	
/** * The specified document type public identifier, or null. */	TokenNameCOMMENT_JAVADOC	 The specified document type public identifier, or null. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_doctypePublic	TokenNameIdentifier	 doctype Public
;	TokenNameSEMICOLON	
/** * True if the XML declaration should be ommited; */	TokenNameCOMMENT_JAVADOC	 True if the XML declaration should be ommited; 
private	TokenNameprivate	
boolean	TokenNameboolean	
_omitXmlDeclaration	TokenNameIdentifier	 omit Xml Declaration
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * True if the DOCTYPE declaration should be ommited; */	TokenNameCOMMENT_JAVADOC	 True if the DOCTYPE declaration should be ommited; 
private	TokenNameprivate	
boolean	TokenNameboolean	
_omitDoctype	TokenNameIdentifier	 omit Doctype
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * True if comments should be ommited; */	TokenNameCOMMENT_JAVADOC	 True if comments should be ommited; 
private	TokenNameprivate	
boolean	TokenNameboolean	
_omitComments	TokenNameIdentifier	 omit Comments
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * True if the document type should be marked as standalone. */	TokenNameCOMMENT_JAVADOC	 True if the document type should be marked as standalone. 
private	TokenNameprivate	
boolean	TokenNameboolean	
_standalone	TokenNameIdentifier	 standalone
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * List of element tag names whose text node children must * be output as CDATA. */	TokenNameCOMMENT_JAVADOC	 List of element tag names whose text node children must be output as CDATA. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_cdataElements	TokenNameIdentifier	 cdata Elements
;	TokenNameSEMICOLON	
/** * List of element tag names whose text node children must * be output unescaped. */	TokenNameCOMMENT_JAVADOC	 List of element tag names whose text node children must be output unescaped. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_nonEscapingElements	TokenNameIdentifier	 non Escaping Elements
;	TokenNameSEMICOLON	
/** * The selected line separator. */	TokenNameCOMMENT_JAVADOC	 The selected line separator. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_lineSeparator	TokenNameIdentifier	 line Separator
=	TokenNameEQUAL	
LineSeparator	TokenNameIdentifier	 Line Separator
.	TokenNameDOT	
Web	TokenNameIdentifier	 Web
;	TokenNameSEMICOLON	
/** * The line width at which to wrap long lines when indenting. */	TokenNameCOMMENT_JAVADOC	 The line width at which to wrap long lines when indenting. 
private	TokenNameprivate	
int	TokenNameint	
_lineWidth	TokenNameIdentifier	 line Width
=	TokenNameEQUAL	
Defaults	TokenNameIdentifier	 Defaults
.	TokenNameDOT	
LineWidth	TokenNameIdentifier	 Line Width
;	TokenNameSEMICOLON	
/** * True if spaces should be preserved in elements that do not * specify otherwise, or specify the default behavior. */	TokenNameCOMMENT_JAVADOC	 True if spaces should be preserved in elements that do not specify otherwise, or specify the default behavior. 
private	TokenNameprivate	
boolean	TokenNameboolean	
_preserve	TokenNameIdentifier	 preserve
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** If true, an empty string valued attribute is output as "". If false and * and we are using the HTMLSerializer, then only the attribute name is * serialized. Defaults to false for backwards compatibility. */	TokenNameCOMMENT_JAVADOC	 If true, an empty string valued attribute is output as "". If false and and we are using the HTMLSerializer, then only the attribute name is serialized. Defaults to false for backwards compatibility. 
private	TokenNameprivate	
boolean	TokenNameboolean	
_preserveEmptyAttributes	TokenNameIdentifier	 preserve Empty Attributes
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Constructs a new output format with the default values. */	TokenNameCOMMENT_JAVADOC	 Constructs a new output format with the default values. 
public	TokenNamepublic	
OutputFormat	TokenNameIdentifier	 Output Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructs a new output format with the default values for * the specified method and encoding. If <tt>indent</tt> * is true, the document will be pretty printed with the default * indentation level and default line wrapping. * * @param method The specified output method * @param encoding The specified encoding * @param indenting True for pretty printing * @see #setEncoding * @see #setIndenting * @see #setMethod */	TokenNameCOMMENT_JAVADOC	 Constructs a new output format with the default values for the specified method and encoding. If <tt>indent</tt> is true, the document will be pretty printed with the default indentation level and default line wrapping. * @param method The specified output method @param encoding The specified encoding @param indenting True for pretty printing @see #setEncoding @see #setIndenting @see #setMethod 
public	TokenNamepublic	
OutputFormat	TokenNameIdentifier	 Output Format
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
boolean	TokenNameboolean	
indenting	TokenNameIdentifier	 indenting
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setMethod	TokenNameIdentifier	 set Method
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setIndenting	TokenNameIdentifier	 set Indenting
(	TokenNameLPAREN	
indenting	TokenNameIdentifier	 indenting
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new output format with the proper method, * document type identifiers and media type for the specified * document. * * @param doc The document to output * @see #whichMethod */	TokenNameCOMMENT_JAVADOC	 Constructs a new output format with the proper method, document type identifiers and media type for the specified document. * @param doc The document to output @see #whichMethod 
public	TokenNamepublic	
OutputFormat	TokenNameIdentifier	 Output Format
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setMethod	TokenNameIdentifier	 set Method
(	TokenNameLPAREN	
whichMethod	TokenNameIdentifier	 which Method
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setDoctype	TokenNameIdentifier	 set Doctype
(	TokenNameLPAREN	
whichDoctypePublic	TokenNameIdentifier	 which Doctype Public
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
,	TokenNameCOMMA	
whichDoctypeSystem	TokenNameIdentifier	 which Doctype System
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMediaType	TokenNameIdentifier	 set Media Type
(	TokenNameLPAREN	
whichMediaType	TokenNameIdentifier	 which Media Type
(	TokenNameLPAREN	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new output format with the proper method, * document type identifiers and media type for the specified * document, and with the specified encoding. If <tt>indent</tt> * is true, the document will be pretty printed with the default * indentation level and default line wrapping. * * @param doc The document to output * @param encoding The specified encoding * @param indenting True for pretty printing * @see #setEncoding * @see #setIndenting * @see #whichMethod */	TokenNameCOMMENT_JAVADOC	 Constructs a new output format with the proper method, document type identifiers and media type for the specified document, and with the specified encoding. If <tt>indent</tt> is true, the document will be pretty printed with the default indentation level and default line wrapping. * @param doc The document to output @param encoding The specified encoding @param indenting True for pretty printing @see #setEncoding @see #setIndenting @see #whichMethod 
public	TokenNamepublic	
OutputFormat	TokenNameIdentifier	 Output Format
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
boolean	TokenNameboolean	
indenting	TokenNameIdentifier	 indenting
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setIndenting	TokenNameIdentifier	 set Indenting
(	TokenNameLPAREN	
indenting	TokenNameIdentifier	 indenting
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the method specified for this output format. * Typically the method will be <tt>xml</tt>, <tt>html</tt> * or <tt>text</tt>, but it might be other values. * If no method was specified, null will be returned * and the most suitable method will be determined for * the document by calling {@link #whichMethod}. * * @return The specified output method, or null */	TokenNameCOMMENT_JAVADOC	 Returns the method specified for this output format. Typically the method will be <tt>xml</tt>, <tt>html</tt> or <tt>text</tt>, but it might be other values. If no method was specified, null will be returned and the most suitable method will be determined for the document by calling {@link #whichMethod}. * @return The specified output method, or null 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the method for this output format. * * @see #getMethod * @param method The output method, or null */	TokenNameCOMMENT_JAVADOC	 Sets the method for this output format. * @see #getMethod @param method The output method, or null 
public	TokenNamepublic	
void	TokenNamevoid	
setMethod	TokenNameIdentifier	 set Method
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the version for this output method. * If no version was specified, will return null * and the default version number will be used. * If the serializer does not support that particular * version, it should default to a supported version. * * @return The specified method version, or null */	TokenNameCOMMENT_JAVADOC	 Returns the version for this output method. If no version was specified, will return null and the default version number will be used. If the serializer does not support that particular version, it should default to a supported version. * @return The specified method version, or null 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the version for this output method. * For XML the value would be "1.0", for HTML * it would be "4.0". * * @see #getVersion * @param version The output method version, or null */	TokenNameCOMMENT_JAVADOC	 Sets the version for this output method. For XML the value would be "1.0", for HTML it would be "4.0". * @see #getVersion @param version The output method version, or null 
public	TokenNamepublic	
void	TokenNamevoid	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the indentation specified. If no indentation * was specified, zero is returned and the document * should not be indented. * * @return The indentation or zero * @see #setIndenting */	TokenNameCOMMENT_JAVADOC	 Returns the indentation specified. If no indentation was specified, zero is returned and the document should not be indented. * @return The indentation or zero @see #setIndenting 
public	TokenNamepublic	
int	TokenNameint	
getIndent	TokenNameIdentifier	 get Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_indent	TokenNameIdentifier	 indent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if indentation was specified. */	TokenNameCOMMENT_JAVADOC	 Returns true if indentation was specified. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getIndenting	TokenNameIdentifier	 get Indenting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_indent	TokenNameIdentifier	 indent
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the indentation. The document will not be * indented if the indentation is set to zero. * Calling {@link #setIndenting} will reset this * value to zero (off) or the default (on). * * @param indent The indentation, or zero */	TokenNameCOMMENT_JAVADOC	 Sets the indentation. The document will not be indented if the indentation is set to zero. Calling {@link #setIndenting} will reset this value to zero (off) or the default (on). * @param indent The indentation, or zero 
public	TokenNamepublic	
void	TokenNamevoid	
setIndent	TokenNameIdentifier	 set Indent
(	TokenNameLPAREN	
int	TokenNameint	
indent	TokenNameIdentifier	 indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
indent	TokenNameIdentifier	 indent
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
_indent	TokenNameIdentifier	 indent
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
_indent	TokenNameIdentifier	 indent
=	TokenNameEQUAL	
indent	TokenNameIdentifier	 indent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the indentation on and off. When set on, the default * indentation level and default line wrapping is used * (see {@link Defaults#Indent} and {@link Defaults#LineWidth}). * To specify a different indentation level or line wrapping, * use {@link #setIndent} and {@link #setLineWidth}. * * @param on True if indentation should be on */	TokenNameCOMMENT_JAVADOC	 Sets the indentation on and off. When set on, the default indentation level and default line wrapping is used (see {@link Defaults#Indent} and {@link Defaults#LineWidth}). To specify a different indentation level or line wrapping, use {@link #setIndent} and {@link #setLineWidth}. * @param on True if indentation should be on 
public	TokenNamepublic	
void	TokenNamevoid	
setIndenting	TokenNameIdentifier	 set Indenting
(	TokenNameLPAREN	
boolean	TokenNameboolean	
on	TokenNameIdentifier	 on
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
on	TokenNameIdentifier	 on
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_indent	TokenNameIdentifier	 indent
=	TokenNameEQUAL	
Defaults	TokenNameIdentifier	 Defaults
.	TokenNameDOT	
Indent	TokenNameIdentifier	 Indent
;	TokenNameSEMICOLON	
_lineWidth	TokenNameIdentifier	 line Width
=	TokenNameEQUAL	
Defaults	TokenNameIdentifier	 Defaults
.	TokenNameDOT	
LineWidth	TokenNameIdentifier	 Line Width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_indent	TokenNameIdentifier	 indent
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_lineWidth	TokenNameIdentifier	 line Width
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the specified encoding. If no encoding was * specified, the default is always "UTF-8". * * @return The encoding */	TokenNameCOMMENT_JAVADOC	 Returns the specified encoding. If no encoding was specified, the default is always "UTF-8". * @return The encoding 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the encoding for this output method. If no * encoding was specified, the default is always "UTF-8". * Make sure the encoding is compatible with the one * used by the {@link java.io.Writer}. * * @see #getEncoding * @param encoding The encoding, or null */	TokenNameCOMMENT_JAVADOC	 Sets the encoding for this output method. If no encoding was specified, the default is always "UTF-8". Make sure the encoding is compatible with the one used by the {@link java.io.Writer}. * @see #getEncoding @param encoding The encoding, or null 
public	TokenNamepublic	
void	TokenNamevoid	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
_encodingInfo	TokenNameIdentifier	 encoding Info
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the encoding for this output method with an <code>EncodingInfo</code> * instance. */	TokenNameCOMMENT_JAVADOC	 Sets the encoding for this output method with an <code>EncodingInfo</code> instance. 
public	TokenNamepublic	
void	TokenNamevoid	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
EncodingInfo	TokenNameIdentifier	 Encoding Info
encInfo	TokenNameIdentifier	 enc Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
encInfo	TokenNameIdentifier	 enc Info
.	TokenNameDOT	
getIANAName	TokenNameIdentifier	 get IANA Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_encodingInfo	TokenNameIdentifier	 encoding Info
=	TokenNameEQUAL	
encInfo	TokenNameIdentifier	 enc Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an <code>EncodingInfo</code> instance for the encoding. * * @see #setEncoding */	TokenNameCOMMENT_JAVADOC	 Returns an <code>EncodingInfo</code> instance for the encoding. * @see #setEncoding 
public	TokenNamepublic	
EncodingInfo	TokenNameIdentifier	 Encoding Info
getEncodingInfo	TokenNameIdentifier	 get Encoding Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_encodingInfo	TokenNameIdentifier	 encoding Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_encodingInfo	TokenNameIdentifier	 encoding Info
=	TokenNameEQUAL	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
getEncodingInfo	TokenNameIdentifier	 get Encoding Info
(	TokenNameLPAREN	
_encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
_allowJavaNames	TokenNameIdentifier	 allow Java Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_encodingInfo	TokenNameIdentifier	 encoding Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets whether java encoding names are permitted */	TokenNameCOMMENT_JAVADOC	 Sets whether java encoding names are permitted 
public	TokenNamepublic	
void	TokenNamevoid	
setAllowJavaNames	TokenNameIdentifier	 set Allow Java Names
(	TokenNameLPAREN	
boolean	TokenNameboolean	
allow	TokenNameIdentifier	 allow
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_allowJavaNames	TokenNameIdentifier	 allow Java Names
=	TokenNameEQUAL	
allow	TokenNameIdentifier	 allow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether java encoding names are permitted */	TokenNameCOMMENT_JAVADOC	 Returns whether java encoding names are permitted 
public	TokenNamepublic	
boolean	TokenNameboolean	
setAllowJavaNames	TokenNameIdentifier	 set Allow Java Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_allowJavaNames	TokenNameIdentifier	 allow Java Names
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specified media type, or null. * To determine the media type based on the * document type, use {@link #whichMediaType}. * * @return The specified media type, or null */	TokenNameCOMMENT_JAVADOC	 Returns the specified media type, or null. To determine the media type based on the document type, use {@link #whichMediaType}. * @return The specified media type, or null 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMediaType	TokenNameIdentifier	 get Media Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_mediaType	TokenNameIdentifier	 media Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the media type. * * @see #getMediaType * @param mediaType The specified media type */	TokenNameCOMMENT_JAVADOC	 Sets the media type. * @see #getMediaType @param mediaType The specified media type 
public	TokenNamepublic	
void	TokenNamevoid	
setMediaType	TokenNameIdentifier	 set Media Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mediaType	TokenNameIdentifier	 media Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_mediaType	TokenNameIdentifier	 media Type
=	TokenNameEQUAL	
mediaType	TokenNameIdentifier	 media Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the document type public and system identifiers. * Required only if the DOM Document or SAX events do not * specify the document type, and one must be present in * the serialized document. Any document type specified * by the DOM Document or SAX events will override these * values. * * @param publicId The public identifier, or null * @param systemId The system identifier, or null */	TokenNameCOMMENT_JAVADOC	 Sets the document type public and system identifiers. Required only if the DOM Document or SAX events do not specify the document type, and one must be present in the serialized document. Any document type specified by the DOM Document or SAX events will override these values. * @param publicId The public identifier, or null @param systemId The system identifier, or null 
public	TokenNamepublic	
void	TokenNamevoid	
setDoctype	TokenNameIdentifier	 set Doctype
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_doctypePublic	TokenNameIdentifier	 doctype Public
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
_doctypeSystem	TokenNameIdentifier	 doctype System
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specified document type public identifier, * or null. */	TokenNameCOMMENT_JAVADOC	 Returns the specified document type public identifier, or null. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDoctypePublic	TokenNameIdentifier	 get Doctype Public
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_doctypePublic	TokenNameIdentifier	 doctype Public
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specified document type system identifier, * or null. */	TokenNameCOMMENT_JAVADOC	 Returns the specified document type system identifier, or null. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDoctypeSystem	TokenNameIdentifier	 get Doctype System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_doctypeSystem	TokenNameIdentifier	 doctype System
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if comments should be ommited. * The default is false. */	TokenNameCOMMENT_JAVADOC	 Returns true if comments should be ommited. The default is false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getOmitComments	TokenNameIdentifier	 get Omit Comments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_omitComments	TokenNameIdentifier	 omit Comments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets comment omitting on and off. * * @param omit True if comments should be ommited */	TokenNameCOMMENT_JAVADOC	 Sets comment omitting on and off. * @param omit True if comments should be ommited 
public	TokenNamepublic	
void	TokenNamevoid	
setOmitComments	TokenNameIdentifier	 set Omit Comments
(	TokenNameLPAREN	
boolean	TokenNameboolean	
omit	TokenNameIdentifier	 omit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_omitComments	TokenNameIdentifier	 omit Comments
=	TokenNameEQUAL	
omit	TokenNameIdentifier	 omit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the DOCTYPE declaration should * be ommited. The default is false. */	TokenNameCOMMENT_JAVADOC	 Returns true if the DOCTYPE declaration should be ommited. The default is false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getOmitDocumentType	TokenNameIdentifier	 get Omit Document Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_omitDoctype	TokenNameIdentifier	 omit Doctype
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets DOCTYPE declaration omitting on and off. * * @param omit True if DOCTYPE declaration should be ommited */	TokenNameCOMMENT_JAVADOC	 Sets DOCTYPE declaration omitting on and off. * @param omit True if DOCTYPE declaration should be ommited 
public	TokenNamepublic	
void	TokenNamevoid	
setOmitDocumentType	TokenNameIdentifier	 set Omit Document Type
(	TokenNameLPAREN	
boolean	TokenNameboolean	
omit	TokenNameIdentifier	 omit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_omitDoctype	TokenNameIdentifier	 omit Doctype
=	TokenNameEQUAL	
omit	TokenNameIdentifier	 omit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the XML document declaration should * be ommited. The default is false. */	TokenNameCOMMENT_JAVADOC	 Returns true if the XML document declaration should be ommited. The default is false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getOmitXMLDeclaration	TokenNameIdentifier	 get Omit XML Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_omitXmlDeclaration	TokenNameIdentifier	 omit Xml Declaration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets XML declaration omitting on and off. * * @param omit True if XML declaration should be ommited */	TokenNameCOMMENT_JAVADOC	 Sets XML declaration omitting on and off. * @param omit True if XML declaration should be ommited 
public	TokenNamepublic	
void	TokenNamevoid	
setOmitXMLDeclaration	TokenNameIdentifier	 set Omit XML Declaration
(	TokenNameLPAREN	
boolean	TokenNameboolean	
omit	TokenNameIdentifier	 omit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_omitXmlDeclaration	TokenNameIdentifier	 omit Xml Declaration
=	TokenNameEQUAL	
omit	TokenNameIdentifier	 omit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the document type is standalone. * The default is false. */	TokenNameCOMMENT_JAVADOC	 Returns true if the document type is standalone. The default is false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getStandalone	TokenNameIdentifier	 get Standalone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_standalone	TokenNameIdentifier	 standalone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets document DTD standalone. The public and system * identifiers must be null for the document to be * serialized as standalone. * * @param standalone True if document DTD is standalone */	TokenNameCOMMENT_JAVADOC	 Sets document DTD standalone. The public and system identifiers must be null for the document to be serialized as standalone. * @param standalone True if document DTD is standalone 
public	TokenNamepublic	
void	TokenNamevoid	
setStandalone	TokenNameIdentifier	 set Standalone
(	TokenNameLPAREN	
boolean	TokenNameboolean	
standalone	TokenNameIdentifier	 standalone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_standalone	TokenNameIdentifier	 standalone
=	TokenNameEQUAL	
standalone	TokenNameIdentifier	 standalone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a list of all the elements whose text node children * should be output as CDATA, or null if no such elements were * specified. */	TokenNameCOMMENT_JAVADOC	 Returns a list of all the elements whose text node children should be output as CDATA, or null if no such elements were specified. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCDataElements	TokenNameIdentifier	 get C Data Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_cdataElements	TokenNameIdentifier	 cdata Elements
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the text node children of the given elements * should be output as CDATA. * * @param tagName The element's tag name * @return True if should serialize as CDATA */	TokenNameCOMMENT_JAVADOC	 Returns true if the text node children of the given elements should be output as CDATA. * @param tagName The element's tag name @return True if should serialize as CDATA 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCDataElement	TokenNameIdentifier	 is C Data Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_cdataElements	TokenNameIdentifier	 cdata Elements
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
_cdataElements	TokenNameIdentifier	 cdata Elements
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
_cdataElements	TokenNameIdentifier	 cdata Elements
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the list of elements for which text node children * should be output as CDATA. * * @param cdataElements List of CDATA element tag names */	TokenNameCOMMENT_JAVADOC	 Sets the list of elements for which text node children should be output as CDATA. * @param cdataElements List of CDATA element tag names 
public	TokenNamepublic	
void	TokenNamevoid	
setCDataElements	TokenNameIdentifier	 set C Data Elements
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cdataElements	TokenNameIdentifier	 cdata Elements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_cdataElements	TokenNameIdentifier	 cdata Elements
=	TokenNameEQUAL	
cdataElements	TokenNameIdentifier	 cdata Elements
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a list of all the elements whose text node children * should be output unescaped (no character references), or null * if no such elements were specified. */	TokenNameCOMMENT_JAVADOC	 Returns a list of all the elements whose text node children should be output unescaped (no character references), or null if no such elements were specified. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getNonEscapingElements	TokenNameIdentifier	 get Non Escaping Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_nonEscapingElements	TokenNameIdentifier	 non Escaping Elements
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the text node children of the given elements * should be output unescaped. * * @param tagName The element's tag name * @return True if should serialize unescaped */	TokenNameCOMMENT_JAVADOC	 Returns true if the text node children of the given elements should be output unescaped. * @param tagName The element's tag name @return True if should serialize unescaped 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNonEscapingElement	TokenNameIdentifier	 is Non Escaping Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_nonEscapingElements	TokenNameIdentifier	 non Escaping Elements
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
_nonEscapingElements	TokenNameIdentifier	 non Escaping Elements
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
_nonEscapingElements	TokenNameIdentifier	 non Escaping Elements
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the list of elements for which text node children * should be output unescaped (no character references). * * @param nonEscapingElements List of unescaped element tag names */	TokenNameCOMMENT_JAVADOC	 Sets the list of elements for which text node children should be output unescaped (no character references). * @param nonEscapingElements List of unescaped element tag names 
public	TokenNamepublic	
void	TokenNamevoid	
setNonEscapingElements	TokenNameIdentifier	 set Non Escaping Elements
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
nonEscapingElements	TokenNameIdentifier	 non Escaping Elements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nonEscapingElements	TokenNameIdentifier	 non Escaping Elements
=	TokenNameEQUAL	
nonEscapingElements	TokenNameIdentifier	 non Escaping Elements
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a specific line separator to use. The default is the * Web line separator (<tt>\n</tt>). A string is returned to * support double codes (CR + LF). * * @return The specified line separator */	TokenNameCOMMENT_JAVADOC	 Returns a specific line separator to use. The default is the Web line separator (<tt>\n</tt>). A string is returned to support double codes (CR + LF). * @return The specified line separator 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLineSeparator	TokenNameIdentifier	 get Line Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_lineSeparator	TokenNameIdentifier	 line Separator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the line separator. The default is the Web line separator * (<tt>\n</tt>). The machine's line separator can be obtained * from the system property <tt>line.separator</tt>, but is only * useful if the document is edited on machines of the same type. * For general documents, use the Web line separator. * * @param lineSeparator The specified line separator */	TokenNameCOMMENT_JAVADOC	 Sets the line separator. The default is the Web line separator (<tt>\n</tt>). The machine's line separator can be obtained from the system property <tt>line.separator</tt>, but is only useful if the document is edited on machines of the same type. For general documents, use the Web line separator. * @param lineSeparator The specified line separator 
public	TokenNamepublic	
void	TokenNamevoid	
setLineSeparator	TokenNameIdentifier	 set Line Separator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lineSeparator	TokenNameIdentifier	 line Separator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lineSeparator	TokenNameIdentifier	 line Separator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_lineSeparator	TokenNameIdentifier	 line Separator
=	TokenNameEQUAL	
LineSeparator	TokenNameIdentifier	 Line Separator
.	TokenNameDOT	
Web	TokenNameIdentifier	 Web
;	TokenNameSEMICOLON	
else	TokenNameelse	
_lineSeparator	TokenNameIdentifier	 line Separator
=	TokenNameEQUAL	
lineSeparator	TokenNameIdentifier	 line Separator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the default behavior for this format is to * preserve spaces. All elements that do not specify otherwise * or specify the default behavior will be formatted based on * this rule. All elements that specify space preserving will * always preserve space. */	TokenNameCOMMENT_JAVADOC	 Returns true if the default behavior for this format is to preserve spaces. All elements that do not specify otherwise or specify the default behavior will be formatted based on this rule. All elements that specify space preserving will always preserve space. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getPreserveSpace	TokenNameIdentifier	 get Preserve Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_preserve	TokenNameIdentifier	 preserve
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets space preserving as the default behavior. The default is * space stripping and all elements that do not specify otherwise * or use the default value will not preserve spaces. * * @param preserve True if spaces should be preserved */	TokenNameCOMMENT_JAVADOC	 Sets space preserving as the default behavior. The default is space stripping and all elements that do not specify otherwise or use the default value will not preserve spaces. * @param preserve True if spaces should be preserved 
public	TokenNamepublic	
void	TokenNamevoid	
setPreserveSpace	TokenNameIdentifier	 set Preserve Space
(	TokenNameLPAREN	
boolean	TokenNameboolean	
preserve	TokenNameIdentifier	 preserve
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_preserve	TokenNameIdentifier	 preserve
=	TokenNameEQUAL	
preserve	TokenNameIdentifier	 preserve
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the selected line width for breaking up long lines. * When indenting, and only when indenting, long lines will be * broken at space boundaries based on this line width. * No line wrapping occurs if this value is zero. */	TokenNameCOMMENT_JAVADOC	 Return the selected line width for breaking up long lines. When indenting, and only when indenting, long lines will be broken at space boundaries based on this line width. No line wrapping occurs if this value is zero. 
public	TokenNamepublic	
int	TokenNameint	
getLineWidth	TokenNameIdentifier	 get Line Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_lineWidth	TokenNameIdentifier	 line Width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the line width. If zero then no line wrapping will * occur. Calling {@link #setIndenting} will reset this * value to zero (off) or the default (on). * * @param lineWidth The line width to use, zero for default * @see #getLineWidth * @see #setIndenting */	TokenNameCOMMENT_JAVADOC	 Sets the line width. If zero then no line wrapping will occur. Calling {@link #setIndenting} will reset this value to zero (off) or the default (on). * @param lineWidth The line width to use, zero for default @see #getLineWidth @see #setIndenting 
public	TokenNamepublic	
void	TokenNamevoid	
setLineWidth	TokenNameIdentifier	 set Line Width
(	TokenNameLPAREN	
int	TokenNameint	
lineWidth	TokenNameIdentifier	 line Width
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lineWidth	TokenNameIdentifier	 line Width
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
_lineWidth	TokenNameIdentifier	 line Width
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
_lineWidth	TokenNameIdentifier	 line Width
=	TokenNameEQUAL	
lineWidth	TokenNameIdentifier	 line Width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the preserveEmptyAttribute flag. If flag is false, then' * attributes with empty string values are output as the attribute * name only (in HTML mode). * @return preserve the preserve flag */	TokenNameCOMMENT_JAVADOC	 Returns the preserveEmptyAttribute flag. If flag is false, then' attributes with empty string values are output as the attribute name only (in HTML mode). @return preserve the preserve flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
getPreserveEmptyAttributes	TokenNameIdentifier	 get Preserve Empty Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_preserveEmptyAttributes	TokenNameIdentifier	 preserve Empty Attributes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the preserveEmptyAttribute flag. If flag is false, then' * attributes with empty string values are output as the attribute * name only (in HTML mode). * @param preserve the preserve flag */	TokenNameCOMMENT_JAVADOC	 Sets the preserveEmptyAttribute flag. If flag is false, then' attributes with empty string values are output as the attribute name only (in HTML mode). @param preserve the preserve flag 
public	TokenNamepublic	
void	TokenNamevoid	
setPreserveEmptyAttributes	TokenNameIdentifier	 set Preserve Empty Attributes
(	TokenNameLPAREN	
boolean	TokenNameboolean	
preserve	TokenNameIdentifier	 preserve
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_preserveEmptyAttributes	TokenNameIdentifier	 preserve Empty Attributes
=	TokenNameEQUAL	
preserve	TokenNameIdentifier	 preserve
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the last printable character based on the selected * encoding. Control characters and non-printable characters * are always printed as character references. */	TokenNameCOMMENT_JAVADOC	 Returns the last printable character based on the selected encoding. Control characters and non-printable characters are always printed as character references. 
public	TokenNamepublic	
char	TokenNamechar	
getLastPrintable	TokenNameIdentifier	 get Last Printable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"ASCII"	TokenNameStringLiteral	ASCII
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine the output method for the specified document. * If the document is an instance of {@link org.w3c.dom.html.HTMLDocument} * then the method is said to be <tt>html</tt>. If the root * element is 'html' and all text nodes preceding the root * element are all whitespace, then the method is said to be * <tt>html</tt>. Otherwise the method is <tt>xml</tt>. * * @param doc The document to check * @return The suitable method */	TokenNameCOMMENT_JAVADOC	 Determine the output method for the specified document. If the document is an instance of {@link org.w3c.dom.html.HTMLDocument} then the method is said to be <tt>html</tt>. If the root element is 'html' and all text nodes preceding the root element are all whitespace, then the method is said to be <tt>html</tt>. Otherwise the method is <tt>xml</tt>. * @param doc The document to check @return The suitable method 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
whichMethod	TokenNameIdentifier	 which Method
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// If document is derived from HTMLDocument then the default 	TokenNameCOMMENT_LINE	If document is derived from HTMLDocument then the default 
// method is html. 	TokenNameCOMMENT_LINE	method is html. 
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
instanceof	TokenNameinstanceof	
HTMLDocument	TokenNameIdentifier	 HTML Document
)	TokenNameRPAREN	
return	TokenNamereturn	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
HTML	TokenNameIdentifier	 HTML
;	TokenNameSEMICOLON	
// Lookup the root element and the text nodes preceding it. 	TokenNameCOMMENT_LINE	Lookup the root element and the text nodes preceding it. 
// If root element is html and all text nodes contain whitespace 	TokenNameCOMMENT_LINE	If root element is html and all text nodes contain whitespace 
// only, the method is html. 	TokenNameCOMMENT_LINE	only, the method is html. 
// FIXME (SM) should we care about namespaces here? 	TokenNameCOMMENT_LINE	FIXME (SM) should we care about namespaces here? 
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the root element is html, the method is html. 	TokenNameCOMMENT_LINE	If the root element is html, the method is html. 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
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
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"html"	TokenNameStringLiteral	html
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
HTML	TokenNameIdentifier	 HTML
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
FOP	TokenNameIdentifier	 FOP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XML	TokenNameIdentifier	 XML
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If a text node preceding the root element contains 	TokenNameCOMMENT_LINE	If a text node preceding the root element contains 
// only whitespace, this might be html, otherwise it's 	TokenNameCOMMENT_LINE	only whitespace, this might be html, otherwise it's 
// definitely xml. 	TokenNameCOMMENT_LINE	definitely xml. 
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
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
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x20	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x0A	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x09	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x0D	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XML	TokenNameIdentifier	 XML
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Anything else, the method is xml. 	TokenNameCOMMENT_LINE	Anything else, the method is xml. 
return	TokenNamereturn	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XML	TokenNameIdentifier	 XML
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the document type public identifier * specified for this document, or null. */	TokenNameCOMMENT_JAVADOC	 Returns the document type public identifier specified for this document, or null. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
whichDoctypePublic	TokenNameIdentifier	 which Doctype Public
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocumentType	TokenNameIdentifier	 Document Type
doctype	TokenNameIdentifier	 doctype
;	TokenNameSEMICOLON	
/* DOM Level 2 was introduced into the code base*/	TokenNameCOMMENT_BLOCK	 DOM Level 2 was introduced into the code base
doctype	TokenNameIdentifier	 doctype
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDoctype	TokenNameIdentifier	 get Doctype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doctype	TokenNameIdentifier	 doctype
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Note on catch: DOM Level 1 does not specify this method 	TokenNameCOMMENT_LINE	Note on catch: DOM Level 1 does not specify this method 
// and the code will throw a NoSuchMethodError 	TokenNameCOMMENT_LINE	and the code will throw a NoSuchMethodError 
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
doctype	TokenNameIdentifier	 doctype
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Error	TokenNameIdentifier	 Error
except	TokenNameIdentifier	 except
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
instanceof	TokenNameinstanceof	
HTMLDocument	TokenNameIdentifier	 HTML Document
)	TokenNameRPAREN	
return	TokenNamereturn	
DTD	TokenNameIdentifier	 DTD
.	TokenNameDOT	
XHTMLPublicId	TokenNameIdentifier	 XHTML Public Id
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the document type system identifier * specified for this document, or null. */	TokenNameCOMMENT_JAVADOC	 Returns the document type system identifier specified for this document, or null. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
whichDoctypeSystem	TokenNameIdentifier	 which Doctype System
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocumentType	TokenNameIdentifier	 Document Type
doctype	TokenNameIdentifier	 doctype
;	TokenNameSEMICOLON	
/* DOM Level 2 was introduced into the code base*/	TokenNameCOMMENT_BLOCK	 DOM Level 2 was introduced into the code base
doctype	TokenNameIdentifier	 doctype
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDoctype	TokenNameIdentifier	 get Doctype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doctype	TokenNameIdentifier	 doctype
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Note on catch: DOM Level 1 does not specify this method 	TokenNameCOMMENT_LINE	Note on catch: DOM Level 1 does not specify this method 
// and the code will throw a NoSuchMethodError 	TokenNameCOMMENT_LINE	and the code will throw a NoSuchMethodError 
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
doctype	TokenNameIdentifier	 doctype
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Error	TokenNameIdentifier	 Error
except	TokenNameIdentifier	 except
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
instanceof	TokenNameinstanceof	
HTMLDocument	TokenNameIdentifier	 HTML Document
)	TokenNameRPAREN	
return	TokenNamereturn	
DTD	TokenNameIdentifier	 DTD
.	TokenNameDOT	
XHTMLSystemId	TokenNameIdentifier	 XHTML System Id
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the suitable media format for a document * output with the specified method. */	TokenNameCOMMENT_JAVADOC	 Returns the suitable media format for a document output with the specified method. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
whichMediaType	TokenNameIdentifier	 which Media Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XML	TokenNameIdentifier	 XML
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"text/xml"	TokenNameStringLiteral	text/xml
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
HTML	TokenNameIdentifier	 HTML
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"text/html"	TokenNameStringLiteral	text/html
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XHTML	TokenNameIdentifier	 XHTML
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"text/html"	TokenNameStringLiteral	text/html
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
TEXT	TokenNameIdentifier	 TEXT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"text/plain"	TokenNameStringLiteral	text/plain
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
FOP	TokenNameIdentifier	 FOP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"application/pdf"	TokenNameStringLiteral	application/pdf
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
