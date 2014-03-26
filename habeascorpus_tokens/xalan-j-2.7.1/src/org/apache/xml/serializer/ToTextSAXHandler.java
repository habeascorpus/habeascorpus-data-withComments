/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ToTextSAXHandler.java 475978 2006-11-16 23:31:20Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ToTextSAXHandler.java 475978 2006-11-16 23:31:20Z minchau $ 
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
/** * This class converts SAX-like event to SAX events for * xsl:output method "text". * * This class is only to be used internally. This class is not a public API. * * @deprecated As of Xalan 2.7.1, replaced by the use of {@link ToXMLSAXHandler}. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class converts SAX-like event to SAX events for xsl:output method "text". * This class is only to be used internally. This class is not a public API. * @deprecated As of Xalan 2.7.1, replaced by the use of {@link ToXMLSAXHandler}. * @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ToTextSAXHandler	TokenNameIdentifier	 To Text SAX Handler
extends	TokenNameextends	
ToSAXHandler	TokenNameIdentifier	 To SAX Handler
{	TokenNameLBRACE	
/** * From XSLTC * @see ExtendedContentHandler#endElement(String) */	TokenNameCOMMENT_JAVADOC	 From XSLTC @see ExtendedContentHandler#endElement(String) 
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
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#endElement(String, String, String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#endElement(String, String, String) 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
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
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ToTextSAXHandler	TokenNameIdentifier	 To Text SAX Handler
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
hdlr	TokenNameIdentifier	 hdlr
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
hdlr	TokenNameIdentifier	 hdlr
,	TokenNameCOMMA	
lex	TokenNameIdentifier	 lex
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * From XSLTC */	TokenNameCOMMENT_JAVADOC	 From XSLTC 
public	TokenNamepublic	
ToTextSAXHandler	TokenNameIdentifier	 To Text SAX Handler
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
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
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
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
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
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
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
data	TokenNameIdentifier	 data
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
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
m_charsBuff	TokenNameIdentifier	 m chars Buff
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
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
/** * Does nothing because * the indent attribute is ignored for text output. * */	TokenNameCOMMENT_JAVADOC	 Does nothing because the indent attribute is ignored for text output. 
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
/** * @see Serializer#reset() */	TokenNameCOMMENT_JAVADOC	 @see Serializer#reset() 
public	TokenNamepublic	
boolean	TokenNameboolean	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#setIndent(boolean) */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#setIndent(boolean) 
public	TokenNamepublic	
void	TokenNamevoid	
setIndent	TokenNameIdentifier	 set Indent
(	TokenNameLPAREN	
boolean	TokenNameboolean	
indent	TokenNameIdentifier	 indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
/** * @see ExtendedContentHandler#addAttribute(String, String, String, String, String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#addAttribute(String, String, String, String, String) 
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
/** * @see org.xml.sax.ContentHandler#endPrefixMapping(String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#endPrefixMapping(String) 
public	TokenNamepublic	
void	TokenNamevoid	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
/** * From XSLTC * @see org.xml.sax.ContentHandler#processingInstruction(String, String) */	TokenNameCOMMENT_JAVADOC	 From XSLTC @see org.xml.sax.ContentHandler#processingInstruction(String, String) 
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
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
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireEscapingEvent	TokenNameIdentifier	 fire Escaping Event
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
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
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#startElement(String, String, String, Attributes) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#startElement(String, String, String, Attributes) 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
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
Attributes	TokenNameIdentifier	 Attributes
arg3	TokenNameIdentifier	 arg3
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
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
arg3	TokenNameIdentifier	 arg3
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
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.LexicalHandler#startCDATA() */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.LexicalHandler#startCDATA() 
public	TokenNamepublic	
void	TokenNamevoid	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
/** * From XSLTC * @see ExtendedContentHandler#startElement(String) */	TokenNameCOMMENT_JAVADOC	 From XSLTC @see ExtendedContentHandler#startElement(String) 
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
super	TokenNamesuper	
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * From XSLTC * @see org.xml.sax.ContentHandler#endDocument() */	TokenNameCOMMENT_JAVADOC	 From XSLTC @see org.xml.sax.ContentHandler#endDocument() 
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
/** * * @see ExtendedContentHandler#characters(String) */	TokenNameCOMMENT_JAVADOC	 * @see ExtendedContentHandler#characters(String) 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
characters	TokenNameIdentifier	 characters
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
characters	TokenNameIdentifier	 characters
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
characters	TokenNameIdentifier	 characters
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
m_saxHandler	TokenNameIdentifier	 m sax Handler
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
/** * @see org.xml.sax.ContentHandler#characters(char[], int, int) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#characters(char[], int, int) 
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
m_saxHandler	TokenNameIdentifier	 m sax Handler
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
characters	TokenNameIdentifier	 characters
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * From XSLTC */	TokenNameCOMMENT_JAVADOC	 From XSLTC 
public	TokenNamepublic	
void	TokenNamevoid	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// do nothing 	TokenNameCOMMENT_LINE	do nothing 
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
// no namespace support for HTML 	TokenNameCOMMENT_LINE	no namespace support for HTML 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// no namespace support for HTML 	TokenNameCOMMENT_LINE	no namespace support for HTML 
}	TokenNameRBRACE	
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
// no namespace support for HTML 	TokenNameCOMMENT_LINE	no namespace support for HTML 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
