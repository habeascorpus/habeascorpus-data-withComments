/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ProcessorCharacters.java 468640 2006-10-28 06:53:53Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ProcessorCharacters.java 468640 2006-10-28 06:53:53Z minchau $ 
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
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
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
ElemText	TokenNameIdentifier	 Elem Text
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
ElemTextLiteral	TokenNameIdentifier	 Elem Text Literal
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
XMLCharacterRecognizer	TokenNameIdentifier	 XML Character Recognizer
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
/** * This class processes character events for a XSLT template element. * @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> * @see <a href="http://www.w3.org/TR/xslt#section-Creating-the-Result-Tree">section-Creating-the-Result-Tree in XSLT Specification</a> */	TokenNameCOMMENT_JAVADOC	 This class processes character events for a XSLT template element. @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> @see <a href="http://www.w3.org/TR/xslt#section-Creating-the-Result-Tree">section-Creating-the-Result-Tree in XSLT Specification</a> 
public	TokenNamepublic	
class	TokenNameclass	
ProcessorCharacters	TokenNameIdentifier	 Processor Characters
extends	TokenNameextends	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
8632900007814162650L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
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
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getCurrentProcessor	TokenNameIdentifier	 get Current Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
popProcessor	TokenNameIdentifier	 pop Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
nChars	TokenNameIdentifier	 n Chars
=	TokenNameEQUAL	
m_accumulator	TokenNameIdentifier	 m accumulator
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nChars	TokenNameIdentifier	 n Chars
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_xslTextElement	TokenNameIdentifier	 m xsl Text Element
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLCharacterRecognizer	TokenNameIdentifier	 XML Character Recognizer
.	TokenNameDOT	
isWhiteSpace	TokenNameIdentifier	 is White Space
(	TokenNameLPAREN	
m_accumulator	TokenNameIdentifier	 m accumulator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
isSpacePreserve	TokenNameIdentifier	 is Space Preserve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTextLiteral	TokenNameIdentifier	 Elem Text Literal
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
new	TokenNamenew	
ElemTextLiteral	TokenNameIdentifier	 Elem Text Literal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
setDOMBackPointer	TokenNameIdentifier	 set DOM Back Pointer
(	TokenNameLPAREN	
m_firstBackPointer	TokenNameIdentifier	 m first Back Pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
setLocaterInfo	TokenNameIdentifier	 set Locater Info
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
setPrefixes	TokenNameIdentifier	 set Prefixes
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getNamespaceSupport	TokenNameIdentifier	 get Namespace Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
doe	TokenNameIdentifier	 doe
=	TokenNameEQUAL	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_xslTextElement	TokenNameIdentifier	 m xsl Text Element
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_xslTextElement	TokenNameIdentifier	 m xsl Text Element
.	TokenNameDOT	
getDisableOutputEscaping	TokenNameIdentifier	 get Disable Output Escaping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
setDisableOutputEscaping	TokenNameIdentifier	 set Disable Output Escaping
(	TokenNameLPAREN	
doe	TokenNameIdentifier	 doe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
setPreserveSpace	TokenNameIdentifier	 set Preserve Space
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
nChars	TokenNameIdentifier	 n Chars
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_accumulator	TokenNameIdentifier	 m accumulator
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nChars	TokenNameIdentifier	 n Chars
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
setChars	TokenNameIdentifier	 set Chars
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getElemTemplateElement	TokenNameIdentifier	 get Elem Template Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_accumulator	TokenNameIdentifier	 m accumulator
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_firstBackPointer	TokenNameIdentifier	 m first Back Pointer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
m_firstBackPointer	TokenNameIdentifier	 m first Back Pointer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Receive notification of character data inside an element. * * * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. * @param ch The characters. * @param start The start position in the character array. * @param length The number of characters to use from the * character array. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#characters */	TokenNameCOMMENT_JAVADOC	 Receive notification of character data inside an element. * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. @param ch The characters. @param start The start position in the character array. @param length The number of characters to use from the character array. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#characters 
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
m_accumulator	TokenNameIdentifier	 m accumulator
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_firstBackPointer	TokenNameIdentifier	 m first Back Pointer
)	TokenNameRPAREN	
m_firstBackPointer	TokenNameIdentifier	 m first Back Pointer
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getOriginatingNode	TokenNameIdentifier	 get Originating Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Catch all events until a non-character event. 	TokenNameCOMMENT_LINE	Catch all events until a non-character event. 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
!=	TokenNameNOT_EQUAL	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getCurrentProcessor	TokenNameIdentifier	 get Current Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
pushProcessor	TokenNameIdentifier	 push Processor
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the end of an element. * * @param handler The calling StylesheetHandler/TemplatesBuilder. * @param uri The Namespace URI, or the empty string if the * element has no Namespace URI or if Namespace * processing is not being performed. * @param localName The local name (without prefix), or the * empty string if Namespace processing is not being * performed. * @param rawName The raw XML 1.0 name (with prefix), or the * empty string if raw names are not available. * @see org.apache.xalan.processor.StylesheetHandler#startElement * @see org.apache.xalan.processor.StylesheetHandler#endElement * @see org.xml.sax.ContentHandler#startElement * @see org.xml.sax.ContentHandler#endElement * @see org.xml.sax.Attributes */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of an element. * @param handler The calling StylesheetHandler/TemplatesBuilder. @param uri The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed. @param localName The local name (without prefix), or the empty string if Namespace processing is not being performed. @param rawName The raw XML 1.0 name (with prefix), or the empty string if raw names are not available. @see org.apache.xalan.processor.StylesheetHandler#startElement @see org.apache.xalan.processor.StylesheetHandler#endElement @see org.xml.sax.ContentHandler#startElement @see org.xml.sax.ContentHandler#endElement @see org.xml.sax.Attributes 
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
// Since this has been installed as the current processor, we 	TokenNameCOMMENT_LINE	Since this has been installed as the current processor, we 
// may get and end element event, in which case, we pop and clear 	TokenNameCOMMENT_LINE	may get and end element event, in which case, we pop and clear 
// and then call the real element processor. 	TokenNameCOMMENT_LINE	and then call the real element processor. 
startNonText	TokenNameIdentifier	 start Non Text
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getCurrentProcessor	TokenNameIdentifier	 get Current Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
popProcessor	TokenNameIdentifier	 pop Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Accumulate characters, until a non-whitespace event has * occured. */	TokenNameCOMMENT_JAVADOC	 Accumulate characters, until a non-whitespace event has occured. 
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
m_accumulator	TokenNameIdentifier	 m accumulator
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The xsl:text processor will call this to set a * preserve space state. */	TokenNameCOMMENT_JAVADOC	 The xsl:text processor will call this to set a preserve space state. 
private	TokenNameprivate	
ElemText	TokenNameIdentifier	 Elem Text
m_xslTextElement	TokenNameIdentifier	 m xsl Text Element
;	TokenNameSEMICOLON	
/** * Set the current setXslTextElement. The xsl:text * processor will call this to set a preserve space state. * * @param xslTextElement The current xslTextElement that * is preserving state, or null. */	TokenNameCOMMENT_JAVADOC	 Set the current setXslTextElement. The xsl:text processor will call this to set a preserve space state. * @param xslTextElement The current xslTextElement that is preserving state, or null. 
void	TokenNamevoid	
setXslTextElement	TokenNameIdentifier	 set Xsl Text Element
(	TokenNameLPAREN	
ElemText	TokenNameIdentifier	 Elem Text
xslTextElement	TokenNameIdentifier	 xsl Text Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_xslTextElement	TokenNameIdentifier	 m xsl Text Element
=	TokenNameEQUAL	
xslTextElement	TokenNameIdentifier	 xsl Text Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
