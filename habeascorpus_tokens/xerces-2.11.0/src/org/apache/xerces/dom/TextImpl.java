/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
CharacterData	TokenNameIdentifier	 Character Data
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
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
Text	TokenNameIdentifier	 Text
;	TokenNameSEMICOLON	
/** * Text nodes hold the non-markup, non-Entity content of * an Element or Attribute. * <P> * When a document is first made available to the DOM, there is only * one Text object for each block of adjacent plain-text. Users (ie, * applications) may create multiple adjacent Texts during editing -- * see {@link org.w3c.dom.Element#normalize} for discussion. * <P> * Note that CDATASection is a subclass of Text. This is conceptually * valid, since they're really just two different ways of quoting * characters when they're written out as part of an XML stream. * * @xerces.internal * * @version $Id: TextImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ * @since PR-DOM-Level-1-19980818. */	TokenNameCOMMENT_JAVADOC	 Text nodes hold the non-markup, non-Entity content of an Element or Attribute. <P> When a document is first made available to the DOM, there is only one Text object for each block of adjacent plain-text. Users (ie, applications) may create multiple adjacent Texts during editing -- see {@link org.w3c.dom.Element#normalize} for discussion. <P> Note that CDATASection is a subclass of Text. This is conceptually valid, since they're really just two different ways of quoting characters when they're written out as part of an XML stream. * @xerces.internal * @version $Id: TextImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
class	TokenNameclass	
TextImpl	TokenNameIdentifier	 Text Impl
extends	TokenNameextends	
CharacterDataImpl	TokenNameIdentifier	 Character Data Impl
implements	TokenNameimplements	
CharacterData	TokenNameIdentifier	 Character Data
,	TokenNameCOMMA	
Text	TokenNameIdentifier	 Text
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Private Data members 	TokenNameCOMMENT_LINE	Private Data members 
// 	TokenNameCOMMENT_LINE	 
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
5294980852957403469L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor */	TokenNameCOMMENT_JAVADOC	 Default constructor 
public	TokenNamepublic	
TextImpl	TokenNameIdentifier	 Text Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Factory constructor. */	TokenNameCOMMENT_JAVADOC	 Factory constructor. 
public	TokenNamepublic	
TextImpl	TokenNameIdentifier	 Text Impl
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDoc	TokenNameIdentifier	 owner Doc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ownerDoc	TokenNameIdentifier	 owner Doc
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * NON-DOM: resets node and sets specified values for the current node * * @param ownerDoc * @param data */	TokenNameCOMMENT_JAVADOC	 NON-DOM: resets node and sets specified values for the current node * @param ownerDoc @param data 
public	TokenNamepublic	
void	TokenNamevoid	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDoc	TokenNameIdentifier	 owner Doc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nextSibling	TokenNameIdentifier	 next Sibling
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
previousSibling	TokenNameIdentifier	 previous Sibling
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
setOwnerDocument	TokenNameIdentifier	 set Owner Document
(	TokenNameLPAREN	
ownerDoc	TokenNameIdentifier	 owner Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Node methods 	TokenNameCOMMENT_LINE	Node methods 
// 	TokenNameCOMMENT_LINE	 
/** * A short integer indicating what type of node this is. The named * constants for this value are defined in the org.w3c.dom.Node interface. */	TokenNameCOMMENT_JAVADOC	 A short integer indicating what type of node this is. The named constants for this value are defined in the org.w3c.dom.Node interface. 
public	TokenNamepublic	
short	TokenNameshort	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the node name. */	TokenNameCOMMENT_JAVADOC	 Returns the node name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"#text"	TokenNameStringLiteral	#text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * NON-DOM: Set whether this Text is ignorable whitespace. */	TokenNameCOMMENT_JAVADOC	 NON-DOM: Set whether this Text is ignorable whitespace. 
public	TokenNamepublic	
void	TokenNamevoid	
setIgnorableWhitespace	TokenNameIdentifier	 set Ignorable Whitespace
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignore	TokenNameIdentifier	 ignore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isIgnorableWhitespace	TokenNameIdentifier	 is Ignorable Whitespace
(	TokenNameLPAREN	
ignore	TokenNameIdentifier	 ignore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setIgnorableWhitespace(boolean) 	TokenNameCOMMENT_LINE	setIgnorableWhitespace(boolean) 
/** * DOM L3 Core CR - Experimental * * Returns whether this text node contains * element content whitespace</a>, often abusively called "ignorable whitespace". * The text node is determined to contain whitespace in element content * during the load of the document or if validation occurs while using * <code>Document.normalizeDocument()</code>. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 DOM L3 Core CR - Experimental * Returns whether this text node contains element content whitespace</a>, often abusively called "ignorable whitespace". The text node is determined to contain whitespace in element content during the load of the document or if validation occurs while using <code>Document.normalizeDocument()</code>. @since DOM Level 3 
public	TokenNamepublic	
boolean	TokenNameboolean	
isElementContentWhitespace	TokenNameIdentifier	 is Element Content Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: is this implemenation correct? 	TokenNameCOMMENT_LINE	REVISIT: is this implemenation correct? 
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
internalIsIgnorableWhitespace	TokenNameIdentifier	 internal Is Ignorable Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM Level 3 WD - Experimental. * Returns all text of <code>Text</code> nodes logically-adjacent text * nodes to this node, concatenated in document order. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 DOM Level 3 WD - Experimental. Returns all text of <code>Text</code> nodes logically-adjacent text nodes to this node, concatenated in document order. @since DOM Level 3 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getWholeText	TokenNameIdentifier	 get Whole Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// concatenate text of logically adjacent text nodes to the left of this node in the tree 	TokenNameCOMMENT_LINE	concatenate text of logically adjacent text nodes to the left of this node in the tree 
getWholeTextBackward	TokenNameIdentifier	 get Whole Text Backward
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// clear buffer 	TokenNameCOMMENT_LINE	clear buffer 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// concatenate text of logically adjacent text nodes to the right of this node in the tree 	TokenNameCOMMENT_LINE	concatenate text of logically adjacent text nodes to the right of this node in the tree 
getWholeTextForward	TokenNameIdentifier	 get Whole Text Forward
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
temp	TokenNameIdentifier	 temp
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * internal method taking a StringBuffer in parameter and inserts the * text content at the start of the buffer * * @param buf */	TokenNameCOMMENT_JAVADOC	 internal method taking a StringBuffer in parameter and inserts the text content at the start of the buffer * @param buf 
protected	TokenNameprotected	
void	TokenNamevoid	
insertTextContent	TokenNameIdentifier	 insert Text Content
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Concatenates the text of all logically-adjacent text nodes to the * right of this node * @param node * @param buffer * @param parent * @return true - if execution was stopped because the type of node * other than EntityRef, Text, CDATA is encountered, otherwise * return false */	TokenNameCOMMENT_JAVADOC	 Concatenates the text of all logically-adjacent text nodes to the right of this node @param node @param buffer @param parent @return true - if execution was stopped because the type of node other than EntityRef, Text, CDATA is encountered, otherwise return false 
private	TokenNameprivate	
boolean	TokenNameboolean	
getWholeTextForward	TokenNameIdentifier	 get Whole Text Forward
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// boolean to indicate whether node is a child of an entity reference 	TokenNameCOMMENT_LINE	boolean to indicate whether node is a child of an entity reference 
boolean	TokenNameboolean	
inEntRef	TokenNameIdentifier	 in Ent Ref
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inEntRef	TokenNameIdentifier	 in Ent Ref
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getWholeTextForward	TokenNameIdentifier	 get Whole Text Forward
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getTextContent	TokenNameIdentifier	 get Text Content
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
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
// if the parent node is an entity reference node, must 	TokenNameCOMMENT_LINE	if the parent node is an entity reference node, must 
// check nodes to the right of the parent entity reference node for logically adjacent 	TokenNameCOMMENT_LINE	check nodes to the right of the parent entity reference node for logically adjacent 
// text nodes 	TokenNameCOMMENT_LINE	text nodes 
if	TokenNameif	
(	TokenNameLPAREN	
inEntRef	TokenNameIdentifier	 in Ent Ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getWholeTextForward	TokenNameIdentifier	 get Whole Text Forward
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Concatenates the text of all logically-adjacent text nodes to the left of * the node * @param node * @param buffer * @param parent * @return true - if execution was stopped because the type of node * other than EntityRef, Text, CDATA is encountered, otherwise * return false */	TokenNameCOMMENT_JAVADOC	 Concatenates the text of all logically-adjacent text nodes to the left of the node @param node @param buffer @param parent @return true - if execution was stopped because the type of node other than EntityRef, Text, CDATA is encountered, otherwise return false 
private	TokenNameprivate	
boolean	TokenNameboolean	
getWholeTextBackward	TokenNameIdentifier	 get Whole Text Backward
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// boolean to indicate whether node is a child of an entity reference 	TokenNameCOMMENT_LINE	boolean to indicate whether node is a child of an entity reference 
boolean	TokenNameboolean	
inEntRef	TokenNameIdentifier	 in Ent Ref
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inEntRef	TokenNameIdentifier	 in Ent Ref
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getWholeTextBackward	TokenNameIdentifier	 get Whole Text Backward
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TextImpl	TokenNameIdentifier	 Text Impl
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
insertTextContent	TokenNameIdentifier	 insert Text Content
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if the parent node is an entity reference node, must 	TokenNameCOMMENT_LINE	if the parent node is an entity reference node, must 
// check nodes to the left of the parent entity reference node for logically adjacent 	TokenNameCOMMENT_LINE	check nodes to the left of the parent entity reference node for logically adjacent 
// text nodes 	TokenNameCOMMENT_LINE	text nodes 
if	TokenNameif	
(	TokenNameLPAREN	
inEntRef	TokenNameIdentifier	 in Ent Ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getWholeTextBackward	TokenNameIdentifier	 get Whole Text Backward
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Replaces the text of the current node and all logically-adjacent text * nodes with the specified text. All logically-adjacent text nodes are * removed including the current node unless it was the recipient of the * replacement text. * * @param content * The content of the replacing Text node. * @return text - The Text node created with the specified content. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 Replaces the text of the current node and all logically-adjacent text nodes with the specified text. All logically-adjacent text nodes are removed including the current node unless it was the recipient of the replacement text. * @param content The content of the replacing Text node. @return text - The Text node created with the specified content. @since DOM Level 3 
public	TokenNamepublic	
Text	TokenNameIdentifier	 Text
replaceWholeText	TokenNameIdentifier	 replace Whole Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//if the content is null 	TokenNameCOMMENT_LINE	if the content is null 
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// remove current node 	TokenNameCOMMENT_LINE	remove current node 
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check if node in the tree 	TokenNameCOMMENT_LINE	check if node in the tree 
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// make sure we can make the replacement 	TokenNameCOMMENT_LINE	make sure we can make the replacement 
if	TokenNameif	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
canModifyPrev	TokenNameIdentifier	 can Modify Prev
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NO_MODIFICATION_ALLOWED_ERR"	TokenNameStringLiteral	NO_MODIFICATION_ALLOWED_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// make sure we can make the replacement 	TokenNameCOMMENT_LINE	make sure we can make the replacement 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
canModifyNext	TokenNameIdentifier	 can Modify Next
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NO_MODIFICATION_ALLOWED_ERR"	TokenNameStringLiteral	NO_MODIFICATION_ALLOWED_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//replace the text node 	TokenNameCOMMENT_LINE	replace the text node 
Text	TokenNameIdentifier	 Text
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Text	TokenNameIdentifier	 Text
newNode	TokenNameIdentifier	 new Node
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check if node in the tree 	TokenNameCOMMENT_LINE	check if node in the tree 
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
newNode	TokenNameIdentifier	 new Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
newNode	TokenNameIdentifier	 new Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setData	TokenNameIdentifier	 set Data
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//check logically-adjacent text nodes 	TokenNameCOMMENT_LINE	check logically-adjacent text nodes 
Node	TokenNameIdentifier	 Node
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//If the logically-adjacent next node can be removed 	TokenNameCOMMENT_LINE	If the logically-adjacent next node can be removed 
//remove it. A logically adjacent node can be removed if 	TokenNameCOMMENT_LINE	remove it. A logically adjacent node can be removed if 
//it is a Text or CDATASection node or an EntityReference with 	TokenNameCOMMENT_LINE	it is a Text or CDATASection node or an EntityReference with 
//Text and CDATA only children. 	TokenNameCOMMENT_LINE	Text and CDATA only children. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
&&	TokenNameAND_AND	
hasTextOnlyChildren	TokenNameIdentifier	 has Text Only Children
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//check logically-adjacent text nodes 	TokenNameCOMMENT_LINE	check logically-adjacent text nodes 
Node	TokenNameIdentifier	 Node
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//If the logically-adjacent next node can be removed 	TokenNameCOMMENT_LINE	If the logically-adjacent next node can be removed 
//remove it. A logically adjacent node can be removed if 	TokenNameCOMMENT_LINE	remove it. A logically adjacent node can be removed if 
//it is a Text or CDATASection node or an EntityReference with 	TokenNameCOMMENT_LINE	it is a Text or CDATASection node or an EntityReference with 
//Text and CDATA only children. 	TokenNameCOMMENT_LINE	Text and CDATA only children. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
&&	TokenNameAND_AND	
hasTextOnlyChildren	TokenNameIdentifier	 has Text Only Children
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If any EntityReference to be removed has descendants that are not * EntityReference, Text, or CDATASection nodes, the replaceWholeText method * must fail before performing any modification of the document, raising a * DOMException with the code NO_MODIFICATION_ALLOWED_ERR. Traverse previous * siblings of the node to be replaced. If a previous sibling is an * EntityReference node, get it's last child. If the last child was a Text * or CDATASection node and its previous siblings are neither a replaceable * EntityReference or Text or CDATASection nodes, return false. IF the last * child was neither Text nor CDATASection nor a replaceable EntityReference * Node, then return true. If the last child was a Text or CDATASection node * any its previous sibling was not or was an EntityReference that did not * contain only Text or CDATASection nodes, return false. Check this * recursively for EntityReference nodes. * * @param node * @return true - can replace text false - can't replace exception must be * raised */	TokenNameCOMMENT_JAVADOC	 If any EntityReference to be removed has descendants that are not EntityReference, Text, or CDATASection nodes, the replaceWholeText method must fail before performing any modification of the document, raising a DOMException with the code NO_MODIFICATION_ALLOWED_ERR. Traverse previous siblings of the node to be replaced. If a previous sibling is an EntityReference node, get it's last child. If the last child was a Text or CDATASection node and its previous siblings are neither a replaceable EntityReference or Text or CDATASection nodes, return false. IF the last child was neither Text nor CDATASection nor a replaceable EntityReference Node, then return true. If the last child was a Text or CDATASection node any its previous sibling was not or was an EntityReference that did not contain only Text or CDATASection nodes, return false. Check this recursively for EntityReference nodes. * @param node @return true - can replace text false - can't replace exception must be raised 
private	TokenNameprivate	
boolean	TokenNameboolean	
canModifyPrev	TokenNameIdentifier	 can Modify Prev
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
textLastChild	TokenNameIdentifier	 text Last Child
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//If the previous sibling was entityreference 	TokenNameCOMMENT_LINE	If the previous sibling was entityreference 
//check if its content is replaceable 	TokenNameCOMMENT_LINE	check if its content is replaceable 
Node	TokenNameIdentifier	 Node
lastChild	TokenNameIdentifier	 last Child
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//if the entity reference has no children 	TokenNameCOMMENT_LINE	if the entity reference has no children 
//return false 	TokenNameCOMMENT_LINE	return false 
if	TokenNameif	
(	TokenNameLPAREN	
lastChild	TokenNameIdentifier	 last Child
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//The replacement text of the entity reference should 	TokenNameCOMMENT_LINE	The replacement text of the entity reference should 
//be either only text,cadatsections or replaceable entity 	TokenNameCOMMENT_LINE	be either only text,cadatsections or replaceable entity 
//reference nodes or the last child should be neither of these 	TokenNameCOMMENT_LINE	reference nodes or the last child should be neither of these 
while	TokenNamewhile	
(	TokenNameLPAREN	
lastChild	TokenNameIdentifier	 last Child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
lType	TokenNameIdentifier	 l Type
=	TokenNameEQUAL	
lastChild	TokenNameIdentifier	 last Child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lType	TokenNameIdentifier	 l Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
||	TokenNameOR_OR	
lType	TokenNameIdentifier	 l Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textLastChild	TokenNameIdentifier	 text Last Child
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
lType	TokenNameIdentifier	 l Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
canModifyPrev	TokenNameIdentifier	 can Modify Prev
(	TokenNameLPAREN	
lastChild	TokenNameIdentifier	 last Child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//If the EntityReference child contains 	TokenNameCOMMENT_LINE	If the EntityReference child contains 
//only text, or non-text or ends with a 	TokenNameCOMMENT_LINE	only text, or non-text or ends with a 
//non-text node. 	TokenNameCOMMENT_LINE	non-text node. 
textLastChild	TokenNameIdentifier	 text Last Child
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//If the last child was replaceable and others are not 	TokenNameCOMMENT_LINE	If the last child was replaceable and others are not 
//Text or CDataSection or replaceable EntityRef nodes 	TokenNameCOMMENT_LINE	Text or CDataSection or replaceable EntityRef nodes 
//return false. 	TokenNameCOMMENT_LINE	return false. 
if	TokenNameif	
(	TokenNameLPAREN	
textLastChild	TokenNameIdentifier	 text Last Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
lastChild	TokenNameIdentifier	 last Child
=	TokenNameEQUAL	
lastChild	TokenNameIdentifier	 last Child
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//If the previous sibling was text or cdatasection move to next 	TokenNameCOMMENT_LINE	If the previous sibling was text or cdatasection move to next 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//If the previous sibling was anything but text or 	TokenNameCOMMENT_LINE	If the previous sibling was anything but text or 
//cdatasection or an entity reference, stop search and 	TokenNameCOMMENT_LINE	cdatasection or an entity reference, stop search and 
//return true 	TokenNameCOMMENT_LINE	return true 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If any EntityReference to be removed has descendants that are not * EntityReference, Text, or CDATASection nodes, the replaceWholeText method * must fail before performing any modification of the document, raising a * DOMException with the code NO_MODIFICATION_ALLOWED_ERR. Traverse previous * siblings of the node to be replaced. If a previous sibling is an * EntityReference node, get it's last child. If the first child was a Text * or CDATASection node and its next siblings are neither a replaceable * EntityReference or Text or CDATASection nodes, return false. IF the first * child was neither Text nor CDATASection nor a replaceable EntityReference * Node, then return true. If the first child was a Text or CDATASection * node any its next sibling was not or was an EntityReference that did not * contain only Text or CDATASection nodes, return false. Check this * recursively for EntityReference nodes. * * @param node * @return true - can replace text false - can't replace exception must be * raised */	TokenNameCOMMENT_JAVADOC	 If any EntityReference to be removed has descendants that are not EntityReference, Text, or CDATASection nodes, the replaceWholeText method must fail before performing any modification of the document, raising a DOMException with the code NO_MODIFICATION_ALLOWED_ERR. Traverse previous siblings of the node to be replaced. If a previous sibling is an EntityReference node, get it's last child. If the first child was a Text or CDATASection node and its next siblings are neither a replaceable EntityReference or Text or CDATASection nodes, return false. IF the first child was neither Text nor CDATASection nor a replaceable EntityReference Node, then return true. If the first child was a Text or CDATASection node any its next sibling was not or was an EntityReference that did not contain only Text or CDATASection nodes, return false. Check this recursively for EntityReference nodes. * @param node @return true - can replace text false - can't replace exception must be raised 
private	TokenNameprivate	
boolean	TokenNameboolean	
canModifyNext	TokenNameIdentifier	 can Modify Next
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
textFirstChild	TokenNameIdentifier	 text First Child
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//If the previous sibling was entityreference 	TokenNameCOMMENT_LINE	If the previous sibling was entityreference 
//check if its content is replaceable 	TokenNameCOMMENT_LINE	check if its content is replaceable 
Node	TokenNameIdentifier	 Node
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//if the entity reference has no children 	TokenNameCOMMENT_LINE	if the entity reference has no children 
//return false 	TokenNameCOMMENT_LINE	return false 
if	TokenNameif	
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//The replacement text of the entity reference should 	TokenNameCOMMENT_LINE	The replacement text of the entity reference should 
//be either only text,cadatsections or replaceable entity 	TokenNameCOMMENT_LINE	be either only text,cadatsections or replaceable entity 
//reference nodes or the last child should be neither of these 	TokenNameCOMMENT_LINE	reference nodes or the last child should be neither of these 
while	TokenNamewhile	
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
lType	TokenNameIdentifier	 l Type
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lType	TokenNameIdentifier	 l Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
||	TokenNameOR_OR	
lType	TokenNameIdentifier	 l Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textFirstChild	TokenNameIdentifier	 text First Child
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
lType	TokenNameIdentifier	 l Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
canModifyNext	TokenNameIdentifier	 can Modify Next
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//If the EntityReference child contains 	TokenNameCOMMENT_LINE	If the EntityReference child contains 
//only text, or non-text or ends with a 	TokenNameCOMMENT_LINE	only text, or non-text or ends with a 
//non-text node. 	TokenNameCOMMENT_LINE	non-text node. 
textFirstChild	TokenNameIdentifier	 text First Child
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//If the first child was replaceable text and next 	TokenNameCOMMENT_LINE	If the first child was replaceable text and next 
//children are not, then return false 	TokenNameCOMMENT_LINE	children are not, then return false 
if	TokenNameif	
(	TokenNameLPAREN	
textFirstChild	TokenNameIdentifier	 text First Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//If the previous sibling was text or cdatasection move to next 	TokenNameCOMMENT_LINE	If the previous sibling was text or cdatasection move to next 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//If the next sibling was anything but text or 	TokenNameCOMMENT_LINE	If the next sibling was anything but text or 
//cdatasection or an entity reference, stop search and 	TokenNameCOMMENT_LINE	cdatasection or an entity reference, stop search and 
//return true 	TokenNameCOMMENT_LINE	return true 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if an EntityReference node has Text Only child nodes * * @param node * @return true - Contains text only children */	TokenNameCOMMENT_JAVADOC	 Check if an EntityReference node has Text Only child nodes * @param node @return true - Contains text only children 
private	TokenNameprivate	
boolean	TokenNameboolean	
hasTextOnlyChildren	TokenNameIdentifier	 has Text Only Children
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
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
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hasTextOnlyChildren	TokenNameIdentifier	 has Text Only Children
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * NON-DOM: Returns whether this Text is ignorable whitespace. */	TokenNameCOMMENT_JAVADOC	 NON-DOM: Returns whether this Text is ignorable whitespace. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isIgnorableWhitespace	TokenNameIdentifier	 is Ignorable Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
internalIsIgnorableWhitespace	TokenNameIdentifier	 internal Is Ignorable Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isIgnorableWhitespace():boolean 	TokenNameCOMMENT_LINE	isIgnorableWhitespace():boolean 
// 	TokenNameCOMMENT_LINE	 
// Text methods 	TokenNameCOMMENT_LINE	Text methods 
// 	TokenNameCOMMENT_LINE	 
/** * Break a text node into two sibling nodes. (Note that if the current node * has no parent, they won't wind up as "siblings" -- they'll both be * orphans.) * * @param offset * The offset at which to split. If offset is at the end of the * available data, the second node will be empty. * * @return A reference to the new node (containing data after the offset * point). The original node will contain data up to that point. * * @throws DOMException(INDEX_SIZE_ERR) * if offset is <0 or >length. * * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) * if node is read-only. */	TokenNameCOMMENT_JAVADOC	 Break a text node into two sibling nodes. (Note that if the current node has no parent, they won't wind up as "siblings" -- they'll both be orphans.) * @param offset The offset at which to split. If offset is at the end of the available data, the second node will be empty. * @return A reference to the new node (containing data after the offset point). The original node will contain data up to that point. * @throws DOMException(INDEX_SIZE_ERR) if offset is <0 or >length. * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is read-only. 
public	TokenNamepublic	
Text	TokenNameIdentifier	 Text
splitText	TokenNameIdentifier	 split Text
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NO_MODIFICATION_ALLOWED_ERR"	TokenNameStringLiteral	NO_MODIFICATION_ALLOWED_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
>	TokenNameGREATER	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INDEX_SIZE_ERR"	TokenNameStringLiteral	INDEX_SIZE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// split text into two separate nodes 	TokenNameCOMMENT_LINE	split text into two separate nodes 
Text	TokenNameIdentifier	 Text
newText	TokenNameIdentifier	 new Text
=	TokenNameEQUAL	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// insert new text node 	TokenNameCOMMENT_LINE	insert new text node 
Node	TokenNameIdentifier	 Node
parentNode	TokenNameIdentifier	 parent Node
=	TokenNameEQUAL	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parentNode	TokenNameIdentifier	 parent Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parentNode	TokenNameIdentifier	 parent Node
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
newText	TokenNameIdentifier	 new Text
,	TokenNameCOMMA	
nextSibling	TokenNameIdentifier	 next Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newText	TokenNameIdentifier	 new Text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// splitText(int):Text 	TokenNameCOMMENT_LINE	splitText(int):Text 
/** * NON-DOM (used by DOMParser): Reset data for the node. */	TokenNameCOMMENT_JAVADOC	 NON-DOM (used by DOMParser): Reset data for the node. 
public	TokenNamepublic	
void	TokenNamevoid	
replaceData	TokenNameIdentifier	 replace Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * NON-DOM (used by DOMParser: Sets data to empty string. * Returns the value the data was set to. */	TokenNameCOMMENT_JAVADOC	 NON-DOM (used by DOMParser: Sets data to empty string. Returns the value the data was set to. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
removeData	TokenNameIdentifier	 remove Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
olddata	TokenNameIdentifier	 olddata
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
return	TokenNamereturn	
olddata	TokenNameIdentifier	 olddata
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class TextImpl 	TokenNameCOMMENT_LINE	class TextImpl 
