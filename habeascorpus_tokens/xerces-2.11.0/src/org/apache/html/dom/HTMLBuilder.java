/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
html	TokenNameIdentifier	 html
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
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
ElementImpl	TokenNameIdentifier	 Element Impl
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
ProcessingInstructionImpl	TokenNameIdentifier	 Processing Instruction Impl
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
/** * This is a SAX document handler that is used to build an HTML document. * It can build a document from any SAX parser, but is specifically tuned * for working with the OpenXML HTML parser. * * * @version $Revision: 1029415 $ $Date: 2010-10-31 13:02:22 -0400 (Sun, 31 Oct 2010) $ * @author <a href="mailto:arkin@openxml.org">Assaf Arkin</a> */	TokenNameCOMMENT_JAVADOC	 This is a SAX document handler that is used to build an HTML document. It can build a document from any SAX parser, but is specifically tuned for working with the OpenXML HTML parser. * @version $Revision: 1029415 $ $Date: 2010-10-31 13:02:22 -0400 (Sun, 31 Oct 2010) $ @author <a href="mailto:arkin@openxml.org">Assaf Arkin</a> 
public	TokenNamepublic	
class	TokenNameclass	
HTMLBuilder	TokenNameIdentifier	 HTML Builder
implements	TokenNameimplements	
DocumentHandler	TokenNameIdentifier	 Document Handler
{	TokenNameLBRACE	
/** * The document that is being built. */	TokenNameCOMMENT_JAVADOC	 The document that is being built. 
protected	TokenNameprotected	
HTMLDocumentImpl	TokenNameIdentifier	 HTML Document Impl
_document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
/** * The current node in the document into which elements, text and * other nodes will be inserted. This starts as the document itself * and reflects each element that is currently being parsed. */	TokenNameCOMMENT_JAVADOC	 The current node in the document into which elements, text and other nodes will be inserted. This starts as the document itself and reflects each element that is currently being parsed. 
protected	TokenNameprotected	
ElementImpl	TokenNameIdentifier	 Element Impl
_current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
/** * Applies only to whitespace appearing between element tags in element content, * as per the SAX definition, and true by default. */	TokenNameCOMMENT_JAVADOC	 Applies only to whitespace appearing between element tags in element content, as per the SAX definition, and true by default. 
private	TokenNameprivate	
boolean	TokenNameboolean	
_ignoreWhitespace	TokenNameIdentifier	 ignore Whitespace
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Indicates whether finished building a document. If so, can start building * another document. Must be initially true to get the first document processed. */	TokenNameCOMMENT_JAVADOC	 Indicates whether finished building a document. If so, can start building another document. Must be initially true to get the first document processed. 
private	TokenNameprivate	
boolean	TokenNameboolean	
_done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * The document is only created the same time as the document element, however, certain * nodes may precede the document element (comment and PI), and they are accumulated * in this vector. */	TokenNameCOMMENT_JAVADOC	 The document is only created the same time as the document element, however, certain nodes may precede the document element (comment and PI), and they are accumulated in this vector. 
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
_preRootNodes	TokenNameIdentifier	 pre Root Nodes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_done	TokenNameIdentifier	 done
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
"HTM001 State error: startDocument fired twice on one builder."	TokenNameStringLiteral	HTM001 State error: startDocument fired twice on one builder.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_document	TokenNameIdentifier	 document
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
"HTM002 State error: document never started or missing document element."	TokenNameStringLiteral	HTM002 State error: document never started or missing document element.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
"HTM003 State error: document ended before end of document element."	TokenNameStringLiteral	HTM003 State error: document ended before end of document element.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
AttributeList	TokenNameIdentifier	 Attribute List
attrList	TokenNameIdentifier	 attr List
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
ElementImpl	TokenNameIdentifier	 Element Impl
elem	TokenNameIdentifier	 elem
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
"HTM004 Argument 'tagName' is null."	TokenNameStringLiteral	HTM004 Argument 'tagName' is null.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If this is the root element, this is the time to create a new document, 	TokenNameCOMMENT_LINE	If this is the root element, this is the time to create a new document, 
// because only know we know the document element name and namespace URI. 	TokenNameCOMMENT_LINE	because only know we know the document element name and namespace URI. 
if	TokenNameif	
(	TokenNameLPAREN	
_document	TokenNameIdentifier	 document
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No need to create the element explicitly. 	TokenNameCOMMENT_LINE	No need to create the element explicitly. 
_document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLDocumentImpl	TokenNameIdentifier	 HTML Document Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
"HTM005 State error: Document.getDocumentElement returns null."	TokenNameStringLiteral	HTM005 State error: Document.getDocumentElement returns null.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Insert nodes (comment and PI) that appear before the root element. 	TokenNameCOMMENT_LINE	Insert nodes (comment and PI) that appear before the root element. 
if	TokenNameif	
(	TokenNameLPAREN	
_preRootNodes	TokenNameIdentifier	 pre Root Nodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
_preRootNodes	TokenNameIdentifier	 pre Root Nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
_preRootNodes	TokenNameIdentifier	 pre Root Nodes
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_preRootNodes	TokenNameIdentifier	 pre Root Nodes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// This is a state error, indicates that document has been parsed in full, 	TokenNameCOMMENT_LINE	This is a state error, indicates that document has been parsed in full, 
// or that there are two root elements. 	TokenNameCOMMENT_LINE	or that there are two root elements. 
if	TokenNameif	
(	TokenNameLPAREN	
_current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
"HTM006 State error: startElement called after end of document element."	TokenNameStringLiteral	HTM006 State error: startElement called after end of document element.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_current	TokenNameIdentifier	 current
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add the attributes (specified and not-specified) to this element. 	TokenNameCOMMENT_LINE	Add the attributes (specified and not-specified) to this element. 
if	TokenNameif	
(	TokenNameLPAREN	
attrList	TokenNameIdentifier	 attr List
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
attrList	TokenNameIdentifier	 attr List
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
attrList	TokenNameIdentifier	 attr List
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attrList	TokenNameIdentifier	 attr List
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
_current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
"HTM007 State error: endElement called with no current node."	TokenNameStringLiteral	HTM007 State error: endElement called with no current node.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_current	TokenNameIdentifier	 current
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
"HTM008 State error: mismatch in closing tag name "	TokenNameStringLiteral	HTM008 State error: mismatch in closing tag name 
+	TokenNamePLUS	
tagName	TokenNameIdentifier	 tag Name
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Move up to the parent element. When you reach the top (closing the root element). 	TokenNameCOMMENT_LINE	Move up to the parent element. When you reach the top (closing the root element). 
// the parent is document and current is null. 	TokenNameCOMMENT_LINE	the parent is document and current is null. 
if	TokenNameif	
(	TokenNameLPAREN	
_current	TokenNameIdentifier	 current
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
_current	TokenNameIdentifier	 current
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
_current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
else	TokenNameelse	
_current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
_current	TokenNameIdentifier	 current
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
"HTM009 State error: character data found outside of root element."	TokenNameStringLiteral	HTM009 State error: character data found outside of root element.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_current	TokenNameIdentifier	 current
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
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
if	TokenNameif	
(	TokenNameLPAREN	
_current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
"HTM010 State error: character data found outside of root element."	TokenNameStringLiteral	HTM010 State error: character data found outside of root element.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_current	TokenNameIdentifier	 current
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_ignoreWhitespace	TokenNameIdentifier	 ignore Whitespace
)	TokenNameRPAREN	
_current	TokenNameIdentifier	 current
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
instruction	TokenNameIdentifier	 instruction
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// Processing instruction may appear before the document element (in fact, before the 	TokenNameCOMMENT_LINE	Processing instruction may appear before the document element (in fact, before the 
// document has been created, or after the document element has been closed. 	TokenNameCOMMENT_LINE	document has been created, or after the document element has been closed. 
if	TokenNameif	
(	TokenNameLPAREN	
_current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
_document	TokenNameIdentifier	 document
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_preRootNodes	TokenNameIdentifier	 pre Root Nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_preRootNodes	TokenNameIdentifier	 pre Root Nodes
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_preRootNodes	TokenNameIdentifier	 pre Root Nodes
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
ProcessingInstructionImpl	TokenNameIdentifier	 Processing Instruction Impl
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
instruction	TokenNameIdentifier	 instruction
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
_document	TokenNameIdentifier	 document
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
createProcessingInstruction	TokenNameIdentifier	 create Processing Instruction
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
instruction	TokenNameIdentifier	 instruction
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
_current	TokenNameIdentifier	 current
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
createProcessingInstruction	TokenNameIdentifier	 create Processing Instruction
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
instruction	TokenNameIdentifier	 instruction
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
HTMLDocument	TokenNameIdentifier	 HTML Document
getHTMLDocument	TokenNameIdentifier	 get HTML Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignored 	TokenNameCOMMENT_LINE	ignored 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
