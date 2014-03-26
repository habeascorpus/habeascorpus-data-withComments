/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ProcessorText.java 468640 2006-10-28 06:53:53Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ProcessorText.java 468640 2006-10-28 06:53:53Z minchau $ 
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
/** * Process xsl:text. * @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> * @see <a href="http://www.w3.org/TR/xslt#element-text">element-text in XSLT Specification</a> */	TokenNameCOMMENT_JAVADOC	 Process xsl:text. @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> @see <a href="http://www.w3.org/TR/xslt#element-text">element-text in XSLT Specification</a> 
public	TokenNamepublic	
class	TokenNameclass	
ProcessorText	TokenNameIdentifier	 Processor Text
extends	TokenNameextends	
ProcessorTemplateElem	TokenNameIdentifier	 Processor Template Elem
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
5170229307201307523L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Append the current template element to the current * template element, and then push it onto the current template * element stack. * * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. * @param elem non-null reference to a {@link org.apache.xalan.templates.ElemText}. * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Append the current template element to the current template element, and then push it onto the current template element stack. * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. @param elem non-null reference to a {@link org.apache.xalan.templates.ElemText}. * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. 
protected	TokenNameprotected	
void	TokenNamevoid	
appendAndPush	TokenNameIdentifier	 append And Push
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
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
// Don't push this element onto the element stack. 	TokenNameCOMMENT_LINE	Don't push this element onto the element stack. 
ProcessorCharacters	TokenNameIdentifier	 Processor Characters
charProcessor	TokenNameIdentifier	 char Processor
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ProcessorCharacters	TokenNameIdentifier	 Processor Characters
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getProcessorFor	TokenNameIdentifier	 get Processor For
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"text()"	TokenNameStringLiteral	text()
,	TokenNameCOMMA	
"text"	TokenNameStringLiteral	text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charProcessor	TokenNameIdentifier	 char Processor
.	TokenNameDOT	
setXslTextElement	TokenNameIdentifier	 set Xsl Text Element
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElemText	TokenNameIdentifier	 Elem Text
)	TokenNameRPAREN	
elem	TokenNameIdentifier	 elem
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
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
setDOMBackPointer	TokenNameIdentifier	 set DOM Back Pointer
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getOriginatingNode	TokenNameIdentifier	 get Originating Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
ProcessorCharacters	TokenNameIdentifier	 Processor Characters
charProcessor	TokenNameIdentifier	 char Processor
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ProcessorCharacters	TokenNameIdentifier	 Processor Characters
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getProcessorFor	TokenNameIdentifier	 get Processor For
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"text()"	TokenNameStringLiteral	text()
,	TokenNameCOMMA	
"text"	TokenNameStringLiteral	text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charProcessor	TokenNameIdentifier	 char Processor
.	TokenNameDOT	
setXslTextElement	TokenNameIdentifier	 set Xsl Text Element
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
