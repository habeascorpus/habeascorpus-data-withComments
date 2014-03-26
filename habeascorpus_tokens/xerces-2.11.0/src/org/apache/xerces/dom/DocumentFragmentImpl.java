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
DocumentFragment	TokenNameIdentifier	 Document Fragment
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
/** * DocumentFragment is a "lightweight" or "minimal" Document * object. It is very common to want to be able to extract a portion * of a document's tree or to create a new fragment of a * document. Imagine implementing a user command like cut or * rearranging a document by moving fragments around. It is desirable * to have an object which can hold such fragments and it is quite * natural to use a Node for this purpose. While it is true that a * Document object could fulfil this role, a Document object can * potentially be a heavyweight object, depending on the underlying * implementation... and in DOM Level 1, nodes aren't allowed to cross * Document boundaries anyway. What is really needed for this is a * very lightweight object. DocumentFragment is such an object. * <P> * Furthermore, various operations -- such as inserting nodes as * children of another Node -- may take DocumentFragment objects as * arguments; this results in all the child nodes of the * DocumentFragment being moved to the child list of this node. * <P> * The children of a DocumentFragment node are zero or more nodes * representing the tops of any sub-trees defining the structure of * the document. DocumentFragment do not need to be well-formed XML * documents (although they do need to follow the rules imposed upon * well-formed XML parsed entities, which can have multiple top * nodes). For example, a DocumentFragment might have only one child * and that child node could be a Text node. Such a structure model * represents neither an HTML document nor a well-formed XML document. * <P> * When a DocumentFragment is inserted into a Document (or indeed any * other Node that may take children) the children of the * DocumentFragment and not the DocumentFragment itself are inserted * into the Node. This makes the DocumentFragment very useful when the * user wishes to create nodes that are siblings; the DocumentFragment * acts as the parent of these nodes so that the user can use the * standard methods from the Node interface, such as insertBefore() * and appendChild(). * * @xerces.internal * * @version $Id: DocumentFragmentImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ * @since PR-DOM-Level-1-19980818. */	TokenNameCOMMENT_JAVADOC	 DocumentFragment is a "lightweight" or "minimal" Document object. It is very common to want to be able to extract a portion of a document's tree or to create a new fragment of a document. Imagine implementing a user command like cut or rearranging a document by moving fragments around. It is desirable to have an object which can hold such fragments and it is quite natural to use a Node for this purpose. While it is true that a Document object could fulfil this role, a Document object can potentially be a heavyweight object, depending on the underlying implementation... and in DOM Level 1, nodes aren't allowed to cross Document boundaries anyway. What is really needed for this is a very lightweight object. DocumentFragment is such an object. <P> Furthermore, various operations -- such as inserting nodes as children of another Node -- may take DocumentFragment objects as arguments; this results in all the child nodes of the DocumentFragment being moved to the child list of this node. <P> The children of a DocumentFragment node are zero or more nodes representing the tops of any sub-trees defining the structure of the document. DocumentFragment do not need to be well-formed XML documents (although they do need to follow the rules imposed upon well-formed XML parsed entities, which can have multiple top nodes). For example, a DocumentFragment might have only one child and that child node could be a Text node. Such a structure model represents neither an HTML document nor a well-formed XML document. <P> When a DocumentFragment is inserted into a Document (or indeed any other Node that may take children) the children of the DocumentFragment and not the DocumentFragment itself are inserted into the Node. This makes the DocumentFragment very useful when the user wishes to create nodes that are siblings; the DocumentFragment acts as the parent of these nodes so that the user can use the standard methods from the Node interface, such as insertBefore() and appendChild(). * @xerces.internal * @version $Id: DocumentFragmentImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
class	TokenNameclass	
DocumentFragmentImpl	TokenNameIdentifier	 Document Fragment Impl
extends	TokenNameextends	
ParentNode	TokenNameIdentifier	 Parent Node
implements	TokenNameimplements	
DocumentFragment	TokenNameIdentifier	 Document Fragment
{	TokenNameLBRACE	
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
7596449967279236746L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Factory constructor. */	TokenNameCOMMENT_JAVADOC	 Factory constructor. 
public	TokenNamepublic	
DocumentFragmentImpl	TokenNameIdentifier	 Document Fragment Impl
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDoc	TokenNameIdentifier	 owner Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ownerDoc	TokenNameIdentifier	 owner Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Constructor for serialization. */	TokenNameCOMMENT_JAVADOC	 Constructor for serialization. 
public	TokenNamepublic	
DocumentFragmentImpl	TokenNameIdentifier	 Document Fragment Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
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
"#document-fragment"	TokenNameStringLiteral	#document-fragment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override default behavior to call normalize() on this Node's * children. It is up to implementors or Node to override normalize() * to take action. */	TokenNameCOMMENT_JAVADOC	 Override default behavior to call normalize() on this Node's children. It is up to implementors or Node to override normalize() to take action. 
public	TokenNamepublic	
void	TokenNamevoid	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No need to normalize if already normalized. 	TokenNameCOMMENT_LINE	No need to normalize if already normalized. 
if	TokenNameif	
(	TokenNameLPAREN	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ChildNode	TokenNameIdentifier	 Child Node
kid	TokenNameIdentifier	 kid
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
;	TokenNameSEMICOLON	
kid	TokenNameIdentifier	 kid
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
// If kid is a text node, we need to check for one of two 	TokenNameCOMMENT_LINE	If kid is a text node, we need to check for one of two 
// conditions: 	TokenNameCOMMENT_LINE	conditions: 
// 1) There is an adjacent text node 	TokenNameCOMMENT_LINE	1) There is an adjacent text node 
// 2) There is no adjacent text node, but kid is 	TokenNameCOMMENT_LINE	2) There is no adjacent text node, but kid is 
// an empty text node. 	TokenNameCOMMENT_LINE	an empty text node. 
if	TokenNameif	
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
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
// If an adjacent text node, merge it with kid 	TokenNameCOMMENT_LINE	If an adjacent text node, merge it with kid 
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
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
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Text	TokenNameIdentifier	 Text
)	TokenNameRPAREN	
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
.	TokenNameDOT	
appendData	TokenNameIdentifier	 append Data
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
kid	TokenNameIdentifier	 kid
;	TokenNameSEMICOLON	
// Don't advance; there might be another. 	TokenNameCOMMENT_LINE	Don't advance; there might be another. 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// If kid is empty, remove it 	TokenNameCOMMENT_LINE	If kid is empty, remove it 
if	TokenNameif	
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class DocumentFragmentImpl 	TokenNameCOMMENT_LINE	class DocumentFragmentImpl 
