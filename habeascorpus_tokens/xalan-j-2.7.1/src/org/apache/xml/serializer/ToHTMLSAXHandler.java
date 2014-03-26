/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ToHTMLSAXHandler.java 475978 2006-11-16 23:31:20Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ToHTMLSAXHandler.java 475978 2006-11-16 23:31:20Z minchau $ 
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
/** * This class accepts SAX-like calls, then sends true SAX calls to a * wrapped SAX handler. There is optimization done knowing that the ultimate * output is HTML. * * This class is not a public API. * * @deprecated As of Xalan 2.7.1, replaced by the use of {@link ToXMLSAXHandler}. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class accepts SAX-like calls, then sends true SAX calls to a wrapped SAX handler. There is optimization done knowing that the ultimate output is HTML. * This class is not a public API. * @deprecated As of Xalan 2.7.1, replaced by the use of {@link ToXMLSAXHandler}. * @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ToHTMLSAXHandler	TokenNameIdentifier	 To HTMLSAX Handler
extends	TokenNameextends	
ToSAXHandler	TokenNameIdentifier	 To SAX Handler
{	TokenNameLBRACE	
/** * Handle document type declaration (for first element only) */	TokenNameCOMMENT_JAVADOC	 Handle document type declaration (for first element only) 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_dtdHandled	TokenNameIdentifier	 m dtd Handled
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Keeps track of whether output escaping is currently enabled */	TokenNameCOMMENT_JAVADOC	 Keeps track of whether output escaping is currently enabled 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_escapeSetting	TokenNameIdentifier	 m escape Setting
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Returns null. * @return null * @see Serializer#getOutputFormat() */	TokenNameCOMMENT_JAVADOC	 Returns null. @return null @see Serializer#getOutputFormat() 
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
/** * Reurns null * @return null * @see Serializer#getOutputStream() */	TokenNameCOMMENT_JAVADOC	 Reurns null @return null @see Serializer#getOutputStream() 
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
/** * Returns null * @return null * @see Serializer#getWriter() */	TokenNameCOMMENT_JAVADOC	 Returns null @return null @see Serializer#getWriter() 
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
/** * Does nothing. * */	TokenNameCOMMENT_JAVADOC	 Does nothing. 
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
/** * Does nothing. * @see DOMSerializer#serialize(Node) */	TokenNameCOMMENT_JAVADOC	 Does nothing. @see DOMSerializer#serialize(Node) 
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
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Turns special character escaping on/off. * * * @param escape true if escaping is to be set on. * * @see SerializationHandler#setEscaping(boolean) */	TokenNameCOMMENT_JAVADOC	 Turns special character escaping on/off. * @param escape true if escaping is to be set on. * @see SerializationHandler#setEscaping(boolean) 
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
/** * Does nothing * @param indent the number of spaces to indent per indentation level * (ignored) * @see SerializationHandler#setIndent(boolean) */	TokenNameCOMMENT_JAVADOC	 Does nothing @param indent the number of spaces to indent per indentation level (ignored) @see SerializationHandler#setIndent(boolean) 
public	TokenNamepublic	
void	TokenNamevoid	
setIndent	TokenNameIdentifier	 set Indent
(	TokenNameLPAREN	
boolean	TokenNameboolean	
indent	TokenNameIdentifier	 indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Does nothing. * @param format this parameter is not used * @see Serializer#setOutputFormat(Properties) */	TokenNameCOMMENT_JAVADOC	 Does nothing. @param format this parameter is not used @see Serializer#setOutputFormat(Properties) 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Does nothing. * @param output this parameter is ignored * @see Serializer#setOutputStream(OutputStream) */	TokenNameCOMMENT_JAVADOC	 Does nothing. @param output this parameter is ignored @see Serializer#setOutputStream(OutputStream) 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Does nothing. * @param writer this parameter is ignored. * @see Serializer#setWriter(Writer) */	TokenNameCOMMENT_JAVADOC	 Does nothing. @param writer this parameter is ignored. @see Serializer#setWriter(Writer) 
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
/** * Does nothing. * * @param eName this parameter is ignored * @param aName this parameter is ignored * @param type this parameter is ignored * @param valueDefault this parameter is ignored * @param value this parameter is ignored * @see org.xml.sax.ext.DeclHandler#attributeDecl(String, String, String,String,String) */	TokenNameCOMMENT_JAVADOC	 Does nothing. * @param eName this parameter is ignored @param aName this parameter is ignored @param type this parameter is ignored @param valueDefault this parameter is ignored @param value this parameter is ignored @see org.xml.sax.ext.DeclHandler#attributeDecl(String, String, String,String,String) 
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
}	TokenNameRBRACE	
/** * Does nothing. * @see org.xml.sax.ext.DeclHandler#elementDecl(String, String) */	TokenNameCOMMENT_JAVADOC	 Does nothing. @see org.xml.sax.ext.DeclHandler#elementDecl(String, String) 
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
return	TokenNamereturn	
;	TokenNameSEMICOLON	
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
/** * Does nothing. * * @see org.xml.sax.DTDHandler#unparsedEntityDecl */	TokenNameCOMMENT_JAVADOC	 Does nothing. * @see org.xml.sax.DTDHandler#unparsedEntityDecl 
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
}	TokenNameRBRACE	
/** * Receive notification of the end of an element. * * <p>The SAX parser will invoke this method at the end of every * element in the XML document; there will be a corresponding * startElement() event for every endElement() event (even when the * element is empty).</p> * * <p>If the element name has a namespace prefix, the prefix will * still be attached to the name.</p> * * * @param uri The Namespace URI, or the empty string if the * element has no Namespace URI or if Namespace * processing is not being performed. * @param localName The local name (without prefix), or the * empty string if Namespace processing is not being * performed. * @param qName The qualified name (with prefix), or the * empty string if qualified names are not available. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#endElement(String, String, String) */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of an element. * <p>The SAX parser will invoke this method at the end of every element in the XML document; there will be a corresponding startElement() event for every endElement() event (even when the element is empty).</p> * <p>If the element name has a namespace prefix, the prefix will still be attached to the name.</p> * @param uri The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed. @param localName The local name (without prefix), or the empty string if Namespace processing is not being performed. @param qName The qualified name (with prefix), or the empty string if qualified names are not available. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#endElement(String, String, String) 
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
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_saxHandler	TokenNameIdentifier	 m sax Handler
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
// time to fire off endElement event 	TokenNameCOMMENT_LINE	time to fire off endElement event 
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
}	TokenNameRBRACE	
/** * Does nothing. */	TokenNameCOMMENT_JAVADOC	 Does nothing. 
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
/** * Does nothing. * @see org.xml.sax.ContentHandler#ignorableWhitespace(char[], int, int) */	TokenNameCOMMENT_JAVADOC	 Does nothing. @see org.xml.sax.ContentHandler#ignorableWhitespace(char[], int, int) 
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
}	TokenNameRBRACE	
/** * Receive notification of a processing instruction. * * <p>The Parser will invoke this method once for each processing * instruction found: note that processing instructions may occur * before or after the main document element.</p> * * <p>A SAX parser should never report an XML declaration (XML 1.0, * section 2.8) or a text declaration (XML 1.0, section 4.3.1) * using this method.</p> * * @param target The processing instruction target. * @param data The processing instruction data, or null if * none was supplied. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * * @throws org.xml.sax.SAXException * @see org.xml.sax.ContentHandler#processingInstruction(String, String) */	TokenNameCOMMENT_JAVADOC	 Receive notification of a processing instruction. * <p>The Parser will invoke this method once for each processing instruction found: note that processing instructions may occur before or after the main document element.</p> * <p>A SAX parser should never report an XML declaration (XML 1.0, section 2.8) or a text declaration (XML 1.0, section 4.3.1) using this method.</p> * @param target The processing instruction target. @param data The processing instruction data, or null if none was supplied. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. * @throws org.xml.sax.SAXException @see org.xml.sax.ContentHandler#processingInstruction(String, String) 
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
m_saxHandler	TokenNameIdentifier	 m sax Handler
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// time to fire off processing instruction event 	TokenNameCOMMENT_LINE	time to fire off processing instruction event 
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
/** * Does nothing. * @see org.xml.sax.ContentHandler#setDocumentLocator(Locator) */	TokenNameCOMMENT_JAVADOC	 Does nothing. @see org.xml.sax.ContentHandler#setDocumentLocator(Locator) 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// do nothing 	TokenNameCOMMENT_LINE	do nothing 
}	TokenNameRBRACE	
/** * Does nothing. * @see org.xml.sax.ContentHandler#skippedEntity(String) */	TokenNameCOMMENT_JAVADOC	 Does nothing. @see org.xml.sax.ContentHandler#skippedEntity(String) 
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
}	TokenNameRBRACE	
/** * Receive notification of the beginning of an element, although this is a * SAX method additional namespace or attribute information can occur before * or after this call, that is associated with this element. * * * @param namespaceURI The Namespace URI, or the empty string if the * element has no Namespace URI or if Namespace * processing is not being performed. * @param localName The local name (without prefix), or the * empty string if Namespace processing is not being * performed. * @param qName The elements name. * @param atts The attributes attached to the element, if any. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#startElement * @see org.xml.sax.ContentHandler#endElement * @see org.xml.sax.AttributeList * * @throws org.xml.sax.SAXException * * @see org.xml.sax.ContentHandler#startElement(String, String, String, Attributes) */	TokenNameCOMMENT_JAVADOC	 Receive notification of the beginning of an element, although this is a SAX method additional namespace or attribute information can occur before or after this call, that is associated with this element. * @param namespaceURI The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed. @param localName The local name (without prefix), or the empty string if Namespace processing is not being performed. @param qName The elements name. @param atts The attributes attached to the element, if any. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#startElement @see org.xml.sax.ContentHandler#endElement @see org.xml.sax.AttributeList * @throws org.xml.sax.SAXException * @see org.xml.sax.ContentHandler#startElement(String, String, String, Attributes) 
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
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_saxHandler	TokenNameIdentifier	 m sax Handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a comment anywhere in the document. This callback * will be used for comments inside or outside the document element. * @param ch An array holding the characters in the comment. * @param start The starting position in the array. * @param length The number of characters to use from the array. * @throws org.xml.sax.SAXException The application may raise an exception. * * @see org.xml.sax.ext.LexicalHandler#comment(char[], int, int) */	TokenNameCOMMENT_JAVADOC	 Receive notification of a comment anywhere in the document. This callback will be used for comments inside or outside the document element. @param ch An array holding the characters in the comment. @param start The starting position in the array. @param length The number of characters to use from the array. @throws org.xml.sax.SAXException The application may raise an exception. * @see org.xml.sax.ext.LexicalHandler#comment(char[], int, int) 
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
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// time to fire off comment event 	TokenNameCOMMENT_LINE	time to fire off comment event 
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
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Does nothing. * @see org.xml.sax.ext.LexicalHandler#endCDATA() */	TokenNameCOMMENT_JAVADOC	 Does nothing. @see org.xml.sax.ext.LexicalHandler#endCDATA() 
public	TokenNamepublic	
void	TokenNamevoid	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Does nothing. * @see org.xml.sax.ext.LexicalHandler#endDTD() */	TokenNameCOMMENT_JAVADOC	 Does nothing. @see org.xml.sax.ext.LexicalHandler#endDTD() 
public	TokenNamepublic	
void	TokenNamevoid	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Does nothing. * @see org.xml.sax.ext.LexicalHandler#startCDATA() */	TokenNameCOMMENT_JAVADOC	 Does nothing. @see org.xml.sax.ext.LexicalHandler#startCDATA() 
public	TokenNamepublic	
void	TokenNamevoid	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Does nothing. * @see org.xml.sax.ext.LexicalHandler#startEntity(String) */	TokenNameCOMMENT_JAVADOC	 Does nothing. @see org.xml.sax.ext.LexicalHandler#startEntity(String) 
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
}	TokenNameRBRACE	
/** * Receive notification of the end of a document. * * <p>The SAX parser will invoke this method only once, and it will * be the last method invoked during the parse. The parser shall * not invoke this method until it has either abandoned parsing * (because of an unrecoverable error) or reached the end of * input.</p> * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * * @throws org.xml.sax.SAXException * * */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of a document. * <p>The SAX parser will invoke this method only once, and it will be the last method invoked during the parse. The parser shall not invoke this method until it has either abandoned parsing (because of an unrecoverable error) or reached the end of input.</p> * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. * @throws org.xml.sax.SAXException * 
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
// Now is time to send the startElement event 	TokenNameCOMMENT_LINE	Now is time to send the startElement event 
m_saxHandler	TokenNameIdentifier	 m sax Handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
,	TokenNameCOMMA	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
,	TokenNameCOMMA	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
,	TokenNameCOMMA	
m_attributes	TokenNameIdentifier	 m attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Do nothing. * @see SerializationHandler#close() */	TokenNameCOMMENT_JAVADOC	 Do nothing. @see SerializationHandler#close() 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of character data. * * @param chars The string of characters to process. * * @throws org.xml.sax.SAXException * * @see ExtendedContentHandler#characters(String) */	TokenNameCOMMENT_JAVADOC	 Receive notification of character data. * @param chars The string of characters to process. * @throws org.xml.sax.SAXException * @see ExtendedContentHandler#characters(String) 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
final	TokenNamefinal	
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
/** * A constructor * @param handler the wrapped SAX content handler * @param encoding the encoding of the output HTML document */	TokenNameCOMMENT_JAVADOC	 A constructor @param handler the wrapped SAX content handler @param encoding the encoding of the output HTML document 
public	TokenNamepublic	
ToHTMLSAXHandler	TokenNameIdentifier	 To HTMLSAX Handler
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
}	TokenNameRBRACE	
/** * A constructor. * @param handler the wrapped SAX content handler * @param lex the wrapped lexical handler * @param encoding the encoding of the output HTML document */	TokenNameCOMMENT_JAVADOC	 A constructor. @param handler the wrapped SAX content handler @param lex the wrapped lexical handler @param encoding the encoding of the output HTML document 
public	TokenNamepublic	
ToHTMLSAXHandler	TokenNameIdentifier	 To HTMLSAX Handler
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
}	TokenNameRBRACE	
/** * An element starts, but attributes are not fully known yet. * * @param elementNamespaceURI the URI of the namespace of the element * (optional) * @param elementLocalName the element name, but without prefix * (optional) * @param elementName the element name, with prefix, if any (required) * * @see ExtendedContentHandler#startElement(String) */	TokenNameCOMMENT_JAVADOC	 An element starts, but attributes are not fully known yet. * @param elementNamespaceURI the URI of the namespace of the element (optional) @param elementLocalName the element name, but without prefix (optional) @param elementName the element name, with prefix, if any (required) * @see ExtendedContentHandler#startElement(String) 
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
super	TokenNamesuper	
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
elementNamespaceURI	TokenNameIdentifier	 element Namespace URI
,	TokenNameCOMMA	
elementLocalName	TokenNameIdentifier	 element Local Name
,	TokenNameCOMMA	
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Handle document type declaration (for first element only) 	TokenNameCOMMENT_LINE	Handle document type declaration (for first element only) 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_dtdHandled	TokenNameIdentifier	 m dtd Handled
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
doctypeSystem	TokenNameIdentifier	 doctype System
=	TokenNameEQUAL	
getDoctypeSystem	TokenNameIdentifier	 get Doctype System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
doctypePublic	TokenNameIdentifier	 doctype Public
=	TokenNameEQUAL	
getDoctypePublic	TokenNameIdentifier	 get Doctype Public
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
doctypeSystem	TokenNameIdentifier	 doctype System
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
doctypePublic	TokenNameIdentifier	 doctype Public
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_lexHandler	TokenNameIdentifier	 m lex Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_lexHandler	TokenNameIdentifier	 m lex Handler
.	TokenNameDOT	
startDTD	TokenNameIdentifier	 start DTD
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
doctypePublic	TokenNameIdentifier	 doctype Public
,	TokenNameCOMMA	
doctypeSystem	TokenNameIdentifier	 doctype System
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_dtdHandled	TokenNameIdentifier	 m dtd Handled
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_elemContext	TokenNameIdentifier	 m elem Context
=	TokenNameEQUAL	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
elementNamespaceURI	TokenNameIdentifier	 element Namespace URI
,	TokenNameCOMMA	
elementLocalName	TokenNameIdentifier	 element Local Name
,	TokenNameCOMMA	
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An element starts, but attributes are not fully known yet. * * @param elementName the element name, with prefix, if any * * @see ExtendedContentHandler#startElement(String) */	TokenNameCOMMENT_JAVADOC	 An element starts, but attributes are not fully known yet. * @param elementName the element name, with prefix, if any * @see ExtendedContentHandler#startElement(String) 
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
this	TokenNamethis	
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the end of an element. * @param elementName The element type name * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * * @see ExtendedContentHandler#endElement(String) */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of an element. @param elementName The element type name @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. * @see ExtendedContentHandler#endElement(String) 
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
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_saxHandler	TokenNameIdentifier	 m sax Handler
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
,	TokenNameCOMMA	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// time to fire off endElement event 	TokenNameCOMMENT_LINE	time to fire off endElement event 
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
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of character data. * * <p>The Parser will call this method to report each chunk of * character data. SAX parsers may return all contiguous character * data in a single chunk, or they may split it into several * chunks; however, all of the characters in any single event * must come from the same external entity, so that the Locator * provides useful information.</p> * * <p>The application must not attempt to read from the array * outside of the specified range.</p> * * <p>Note that some parsers will report whitespace using the * ignorableWhitespace() method rather than this one (validating * parsers must do so).</p> * * @param ch The characters from the XML document. * @param off The start position in the array. * @param len The number of characters to read from the array. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see #ignorableWhitespace * @see org.xml.sax.Locator * * @throws org.xml.sax.SAXException * * @see org.xml.sax.ContentHandler#characters(char[], int, int) */	TokenNameCOMMENT_JAVADOC	 Receive notification of character data. * <p>The Parser will call this method to report each chunk of character data. SAX parsers may return all contiguous character data in a single chunk, or they may split it into several chunks; however, all of the characters in any single event must come from the same external entity, so that the Locator provides useful information.</p> * <p>The application must not attempt to read from the array outside of the specified range.</p> * <p>Note that some parsers will report whitespace using the ignorableWhitespace() method rather than this one (validating parsers must do so).</p> * @param ch The characters from the XML document. @param off The start position in the array. @param len The number of characters to read from the array. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see #ignorableWhitespace @see org.xml.sax.Locator * @throws org.xml.sax.SAXException * @see org.xml.sax.ContentHandler#characters(char[], int, int) 
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
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
// time to fire off characters event 	TokenNameCOMMENT_LINE	time to fire off characters event 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
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
/** * This method flushes any pending events, which can be startDocument() * closing the opening tag of an element, or closing an open CDATA section. */	TokenNameCOMMENT_JAVADOC	 This method flushes any pending events, which can be startDocument() closing the opening tag of an element, or closing an open CDATA section. 
public	TokenNamepublic	
void	TokenNamevoid	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
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
// Close any open element 	TokenNameCOMMENT_LINE	Close any open element 
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
}	TokenNameRBRACE	
/** * Handle a prefix/uri mapping, which is associated with a startElement() * that is soon to follow. Need to close any open start tag to make * sure than any name space attributes due to this event are associated wih * the up comming element, not the current one. * @see ExtendedContentHandler#startPrefixMapping * * @param prefix The Namespace prefix being declared. * @param uri The Namespace URI the prefix is mapped to. * @param shouldFlush true if any open tags need to be closed first, this * will impact which element the mapping applies to (open parent, or its up * comming child) * @return returns true if the call made a change to the current * namespace information, false if it did not change anything, e.g. if the * prefix/namespace mapping was already in scope from before. * * @throws org.xml.sax.SAXException The client may throw * an exception during processing. */	TokenNameCOMMENT_JAVADOC	 Handle a prefix/uri mapping, which is associated with a startElement() that is soon to follow. Need to close any open start tag to make sure than any name space attributes due to this event are associated wih the up comming element, not the current one. @see ExtendedContentHandler#startPrefixMapping * @param prefix The Namespace prefix being declared. @param uri The Namespace URI the prefix is mapped to. @param shouldFlush true if any open tags need to be closed first, this will impact which element the mapping applies to (open parent, or its up comming child) @return returns true if the call made a change to the current namespace information, false if it did not change anything, e.g. if the prefix/namespace mapping was already in scope from before. * @throws org.xml.sax.SAXException The client may throw an exception during processing. 
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
// no namespace support for HTML 	TokenNameCOMMENT_LINE	no namespace support for HTML 
if	TokenNameif	
(	TokenNameLPAREN	
shouldFlush	TokenNameIdentifier	 should Flush
)	TokenNameRPAREN	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_saxHandler	TokenNameIdentifier	 m sax Handler
.	TokenNameDOT	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Begin the scope of a prefix-URI Namespace mapping * just before another element is about to start. * This call will close any open tags so that the prefix mapping * will not apply to the current element, but the up comming child. * * @see org.xml.sax.ContentHandler#startPrefixMapping * * @param prefix The Namespace prefix being declared. * @param uri The Namespace URI the prefix is mapped to. * * @throws org.xml.sax.SAXException The client may throw * an exception during processing. * */	TokenNameCOMMENT_JAVADOC	 Begin the scope of a prefix-URI Namespace mapping just before another element is about to start. This call will close any open tags so that the prefix mapping will not apply to the current element, but the up comming child. * @see org.xml.sax.ContentHandler#startPrefixMapping * @param prefix The Namespace prefix being declared. @param uri The Namespace URI the prefix is mapped to. * @throws org.xml.sax.SAXException The client may throw an exception during processing. 
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
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
/** * This method is used when a prefix/uri namespace mapping * is indicated after the element was started with a * startElement() and before and endElement(). * startPrefixMapping(prefix,uri) would be used before the * startElement() call. * @param prefix the prefix associated with the given URI. * @param uri the URI of the namespace * * @see ExtendedContentHandler#namespaceAfterStartElement(String, String) */	TokenNameCOMMENT_JAVADOC	 This method is used when a prefix/uri namespace mapping is indicated after the element was started with a startElement() and before and endElement(). startPrefixMapping(prefix,uri) would be used before the startElement() call. @param prefix the prefix associated with the given URI. @param uri the URI of the namespace * @see ExtendedContentHandler#namespaceAfterStartElement(String, String) 
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
// hack for XSLTC with finding URI for default namespace 	TokenNameCOMMENT_LINE	hack for XSLTC with finding URI for default namespace 
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementURI	TokenNameIdentifier	 m element URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix1	TokenNameIdentifier	 prefix1
=	TokenNameEQUAL	
getPrefixPart	TokenNameIdentifier	 get Prefix Part
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
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
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementURI	TokenNameIdentifier	 m element URI
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
resetToHTMLSAXHandler	TokenNameIdentifier	 reset To HTMLSAX Handler
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
/** * Reset all of the fields owned by ToHTMLSAXHandler class * */	TokenNameCOMMENT_JAVADOC	 Reset all of the fields owned by ToHTMLSAXHandler class 
private	TokenNameprivate	
void	TokenNamevoid	
resetToHTMLSAXHandler	TokenNameIdentifier	 reset To HTMLSAX Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_dtdHandled	TokenNameIdentifier	 m dtd Handled
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_escapeSetting	TokenNameIdentifier	 m escape Setting
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
