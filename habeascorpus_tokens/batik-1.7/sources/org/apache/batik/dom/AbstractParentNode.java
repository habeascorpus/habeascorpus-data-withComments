/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
DOMMutationEvent	TokenNameIdentifier	 DOM Mutation Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLConstants	TokenNameIdentifier	 XML Constants
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
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
MutationEvent	TokenNameIdentifier	 Mutation Event
;	TokenNameSEMICOLON	
/** * This class implements the Node interface with support for children. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AbstractParentNode.java 601944 2007-12-07 01:01:23Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the Node interface with support for children. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AbstractParentNode.java 601944 2007-12-07 01:01:23Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractParentNode	TokenNameIdentifier	 Abstract Parent Node
extends	TokenNameextends	
AbstractNode	TokenNameIdentifier	 Abstract Node
{	TokenNameLBRACE	
/** * The children. */	TokenNameCOMMENT_JAVADOC	 The children. 
protected	TokenNameprotected	
ChildNodes	TokenNameIdentifier	 Child Nodes
childNodes	TokenNameIdentifier	 child Nodes
;	TokenNameSEMICOLON	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#getChildNodes()}. * @return {@link #childNodes} */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#getChildNodes()}. @return {@link #childNodes} 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
childNodes	TokenNameIdentifier	 child Nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
childNodes	TokenNameIdentifier	 child Nodes
=	TokenNameEQUAL	
new	TokenNamenew	
ChildNodes	TokenNameIdentifier	 Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
childNodes	TokenNameIdentifier	 child Nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#getFirstChild()}. * @return {@link #childNodes}.firstChild */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#getFirstChild()}. @return {@link #childNodes}.firstChild 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
childNodes	TokenNameIdentifier	 child Nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
childNodes	TokenNameIdentifier	 child Nodes
.	TokenNameDOT	
firstChild	TokenNameIdentifier	 first Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#getLastChild()}. * @return {@link #childNodes}.lastChild */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#getLastChild()}. @return {@link #childNodes}.lastChild 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
childNodes	TokenNameIdentifier	 child Nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
childNodes	TokenNameIdentifier	 child Nodes
.	TokenNameDOT	
lastChild	TokenNameIdentifier	 last Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.Node#insertBefore(Node, Node)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#insertBefore(Node, Node)}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newChild	TokenNameIdentifier	 new Child
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
refChild	TokenNameIdentifier	 ref Child
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
refChild	TokenNameIdentifier	 ref Child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
childNodes	TokenNameIdentifier	 child Nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
refChild	TokenNameIdentifier	 ref Child
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
"child.missing"	TokenNameStringLiteral	child.missing
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
refChild	TokenNameIdentifier	 ref Child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
refChild	TokenNameIdentifier	 ref Child
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkAndRemove	TokenNameIdentifier	 check And Remove
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
newChild	TokenNameIdentifier	 new Child
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
refChild	TokenNameIdentifier	 ref Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
ns	TokenNameIdentifier	 ns
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newChild	TokenNameIdentifier	 new Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Node modification 	TokenNameCOMMENT_LINE	Node modification 
if	TokenNameif	
(	TokenNameLPAREN	
childNodes	TokenNameIdentifier	 child Nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
childNodes	TokenNameIdentifier	 child Nodes
=	TokenNameEQUAL	
new	TokenNamenew	
ChildNodes	TokenNameIdentifier	 Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ExtendedNode	TokenNameIdentifier	 Extended Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
childNodes	TokenNameIdentifier	 child Nodes
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
)	TokenNameRPAREN	
newChild	TokenNameIdentifier	 new Child
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
)	TokenNameRPAREN	
refChild	TokenNameIdentifier	 ref Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setParentNode	TokenNameIdentifier	 set Parent Node
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeAdded	TokenNameIdentifier	 node Added
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Mutation event 	TokenNameCOMMENT_LINE	Mutation event 
fireDOMNodeInsertedEvent	TokenNameIdentifier	 fire DOM Node Inserted Event
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireDOMSubtreeModifiedEvent	TokenNameIdentifier	 fire DOM Subtree Modified Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.Node#replaceChild(Node, Node)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#replaceChild(Node, Node)}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
replaceChild	TokenNameIdentifier	 replace Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newChild	TokenNameIdentifier	 new Child
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
oldChild	TokenNameIdentifier	 old Child
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
childNodes	TokenNameIdentifier	 child Nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
oldChild	TokenNameIdentifier	 old Child
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
"child.missing"	TokenNameStringLiteral	child.missing
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
oldChild	TokenNameIdentifier	 old Child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
oldChild	TokenNameIdentifier	 old Child
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkAndRemove	TokenNameIdentifier	 check And Remove
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
newChild	TokenNameIdentifier	 new Child
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
newChild	TokenNameIdentifier	 new Child
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replaceChild	TokenNameIdentifier	 replace Child
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
oldChild	TokenNameIdentifier	 old Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
ps	TokenNameIdentifier	 ps
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
ps	TokenNameIdentifier	 ps
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newChild	TokenNameIdentifier	 new Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Mutation event 	TokenNameCOMMENT_LINE	Mutation event 
fireDOMNodeRemovedEvent	TokenNameIdentifier	 fire DOM Node Removed Event
(	TokenNameLPAREN	
oldChild	TokenNameIdentifier	 old Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getCurrentDocument	TokenNameIdentifier	 get Current Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
nodeToBeRemoved	TokenNameIdentifier	 node To Be Removed
(	TokenNameLPAREN	
oldChild	TokenNameIdentifier	 old Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeToBeRemoved	TokenNameIdentifier	 node To Be Removed
(	TokenNameLPAREN	
oldChild	TokenNameIdentifier	 old Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Node modification 	TokenNameCOMMENT_LINE	Node modification 
ExtendedNode	TokenNameIdentifier	 Extended Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
)	TokenNameRPAREN	
newChild	TokenNameIdentifier	 new Child
;	TokenNameSEMICOLON	
ExtendedNode	TokenNameIdentifier	 Extended Node
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
childNodes	TokenNameIdentifier	 child Nodes
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
)	TokenNameRPAREN	
oldChild	TokenNameIdentifier	 old Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setParentNode	TokenNameIdentifier	 set Parent Node
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
setParentNode	TokenNameIdentifier	 set Parent Node
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeAdded	TokenNameIdentifier	 node Added
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Mutation event 	TokenNameCOMMENT_LINE	Mutation event 
fireDOMNodeInsertedEvent	TokenNameIdentifier	 fire DOM Node Inserted Event
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireDOMSubtreeModifiedEvent	TokenNameIdentifier	 fire DOM Subtree Modified Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#removeChild(Node)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#removeChild(Node)}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
oldChild	TokenNameIdentifier	 old Child
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
childNodes	TokenNameIdentifier	 child Nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
oldChild	TokenNameIdentifier	 old Child
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
"child.missing"	TokenNameStringLiteral	child.missing
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
oldChild	TokenNameIdentifier	 old Child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
oldChild	TokenNameIdentifier	 old Child
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReadonly	TokenNameIdentifier	 is Readonly
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"readonly.node"	TokenNameStringLiteral	readonly.node
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Mutation event 	TokenNameCOMMENT_LINE	Mutation event 
fireDOMNodeRemovedEvent	TokenNameIdentifier	 fire DOM Node Removed Event
(	TokenNameLPAREN	
oldChild	TokenNameIdentifier	 old Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getCurrentDocument	TokenNameIdentifier	 get Current Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
nodeToBeRemoved	TokenNameIdentifier	 node To Be Removed
(	TokenNameLPAREN	
oldChild	TokenNameIdentifier	 old Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeToBeRemoved	TokenNameIdentifier	 node To Be Removed
(	TokenNameLPAREN	
oldChild	TokenNameIdentifier	 old Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Node modification 	TokenNameCOMMENT_LINE	Node modification 
ExtendedNode	TokenNameIdentifier	 Extended Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
childNodes	TokenNameIdentifier	 child Nodes
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
)	TokenNameRPAREN	
oldChild	TokenNameIdentifier	 old Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setParentNode	TokenNameIdentifier	 set Parent Node
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Mutation event 	TokenNameCOMMENT_LINE	Mutation event 
fireDOMSubtreeModifiedEvent	TokenNameIdentifier	 fire DOM Subtree Modified Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#appendChild(Node)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#appendChild(Node)}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
checkAndRemove	TokenNameIdentifier	 check And Remove
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
newChild	TokenNameIdentifier	 new Child
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
ns	TokenNameIdentifier	 ns
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newChild	TokenNameIdentifier	 new Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
childNodes	TokenNameIdentifier	 child Nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
childNodes	TokenNameIdentifier	 child Nodes
=	TokenNameEQUAL	
new	TokenNamenew	
ChildNodes	TokenNameIdentifier	 Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Node modification 	TokenNameCOMMENT_LINE	Node modification 
ExtendedNode	TokenNameIdentifier	 Extended Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
childNodes	TokenNameIdentifier	 child Nodes
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
)	TokenNameRPAREN	
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setParentNode	TokenNameIdentifier	 set Parent Node
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeAdded	TokenNameIdentifier	 node Added
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Mutation event 	TokenNameCOMMENT_LINE	Mutation event 
fireDOMNodeInsertedEvent	TokenNameIdentifier	 fire DOM Node Inserted Event
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireDOMSubtreeModifiedEvent	TokenNameIdentifier	 fire DOM Subtree Modified Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#hasChildNodes()}. * @return true if this node has children, false otherwise. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#hasChildNodes()}. @return true if this node has children, false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
childNodes	TokenNameIdentifier	 child Nodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
childNodes	TokenNameIdentifier	 child Nodes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#normalize()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#normalize()}. 
public	TokenNamepublic	
void	TokenNamevoid	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
&&	TokenNameAND_AND	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractText	TokenNameIdentifier	 Abstract Text
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractText	TokenNameIdentifier	 Abstract Text
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.Element#getElementsByTagName(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Element#getElementsByTagName(String)}. 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getElementsByTagName	TokenNameIdentifier	 get Elements By Tag Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
EMPTY_NODE_LIST	TokenNameIdentifier	 EMPTY  NODE  LIST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AbstractDocument	TokenNameIdentifier	 Abstract Document
ad	TokenNameIdentifier	 ad
=	TokenNameEQUAL	
getCurrentDocument	TokenNameIdentifier	 get Current Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ElementsByTagName	TokenNameIdentifier	 Elements By Tag Name
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
ad	TokenNameIdentifier	 ad
.	TokenNameDOT	
getElementsByTagName	TokenNameIdentifier	 get Elements By Tag Name
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ElementsByTagName	TokenNameIdentifier	 Elements By Tag Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ad	TokenNameIdentifier	 ad
.	TokenNameDOT	
putElementsByTagName	TokenNameIdentifier	 put Elements By Tag Name
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.Element#getElementsByTagNameNS(String,String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Element#getElementsByTagNameNS(String,String)}. 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getElementsByTagNameNS	TokenNameIdentifier	 get Elements By Tag Name NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
EMPTY_NODE_LIST	TokenNameIdentifier	 EMPTY  NODE  LIST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AbstractDocument	TokenNameIdentifier	 Abstract Document
ad	TokenNameIdentifier	 ad
=	TokenNameEQUAL	
getCurrentDocument	TokenNameIdentifier	 get Current Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ElementsByTagNameNS	TokenNameIdentifier	 Elements By Tag Name NS
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
ad	TokenNameIdentifier	 ad
.	TokenNameDOT	
getElementsByTagNameNS	TokenNameIdentifier	 get Elements By Tag Name NS
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ElementsByTagNameNS	TokenNameIdentifier	 Elements By Tag Name NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ad	TokenNameIdentifier	 ad
.	TokenNameDOT	
putElementsByTagNameNS	TokenNameIdentifier	 put Elements By Tag Name NS
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#getTextContent()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#getTextContent()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTextContent	TokenNameIdentifier	 get Text Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractNode	TokenNameIdentifier	 Abstract Node
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
.	TokenNameDOT	
getTextContent	TokenNameIdentifier	 get Text Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Recursively fires a DOMNodeInsertedIntoDocument event. */	TokenNameCOMMENT_JAVADOC	 Recursively fires a DOMNodeInsertedIntoDocument event. 
public	TokenNamepublic	
void	TokenNamevoid	
fireDOMNodeInsertedIntoDocumentEvent	TokenNameIdentifier	 fire DOM Node Inserted Into Document Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractDocument	TokenNameIdentifier	 Abstract Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
getCurrentDocument	TokenNameIdentifier	 get Current Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getEventsEnabled	TokenNameIdentifier	 get Events Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
fireDOMNodeInsertedIntoDocumentEvent	TokenNameIdentifier	 fire DOM Node Inserted Into Document Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractNode	TokenNameIdentifier	 Abstract Node
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
.	TokenNameDOT	
fireDOMNodeInsertedIntoDocumentEvent	TokenNameIdentifier	 fire DOM Node Inserted Into Document Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Recursively fires a DOMNodeRemovedFromDocument event. */	TokenNameCOMMENT_JAVADOC	 Recursively fires a DOMNodeRemovedFromDocument event. 
public	TokenNamepublic	
void	TokenNamevoid	
fireDOMNodeRemovedFromDocumentEvent	TokenNameIdentifier	 fire DOM Node Removed From Document Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractDocument	TokenNameIdentifier	 Abstract Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
getCurrentDocument	TokenNameIdentifier	 get Current Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getEventsEnabled	TokenNameIdentifier	 get Events Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
fireDOMNodeRemovedFromDocumentEvent	TokenNameIdentifier	 fire DOM Node Removed From Document Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractNode	TokenNameIdentifier	 Abstract Node
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
.	TokenNameDOT	
fireDOMNodeRemovedFromDocumentEvent	TokenNameIdentifier	 fire DOM Node Removed From Document Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when a child node has been added. */	TokenNameCOMMENT_JAVADOC	 Called when a child node has been added. 
protected	TokenNameprotected	
void	TokenNamevoid	
nodeAdded	TokenNameIdentifier	 node Added
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called when a child node is going to be removed. */	TokenNameCOMMENT_JAVADOC	 Called when a child node is going to be removed. 
protected	TokenNameprotected	
void	TokenNamevoid	
nodeToBeRemoved	TokenNameIdentifier	 node To Be Removed
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Deeply exports this node to the given document. */	TokenNameCOMMENT_JAVADOC	 Deeply exports this node to the given document. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
deepExport	TokenNameIdentifier	 deep Export
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
deepExport	TokenNameIdentifier	 deep Export
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractNode	TokenNameIdentifier	 Abstract Node
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
.	TokenNameDOT	
deepExport	TokenNameIdentifier	 deep Export
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deeply copy the fields of the current node into the given node. * @param n a node of the type of this. */	TokenNameCOMMENT_JAVADOC	 Deeply copy the fields of the current node into the given node. @param n a node of the type of this. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
deepCopyInto	TokenNameIdentifier	 deep Copy Into
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
deepCopyInto	TokenNameIdentifier	 deep Copy Into
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fires a DOMSubtreeModified event. */	TokenNameCOMMENT_JAVADOC	 Fires a DOMSubtreeModified event. 
protected	TokenNameprotected	
void	TokenNamevoid	
fireDOMSubtreeModifiedEvent	TokenNameIdentifier	 fire DOM Subtree Modified Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractDocument	TokenNameIdentifier	 Abstract Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
getCurrentDocument	TokenNameIdentifier	 get Current Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getEventsEnabled	TokenNameIdentifier	 get Events Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DOMMutationEvent	TokenNameIdentifier	 DOM Mutation Event
ev	TokenNameIdentifier	 ev
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMMutationEvent	TokenNameIdentifier	 DOM Mutation Event
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
"MutationEvents"	TokenNameStringLiteral	MutationEvents
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
initMutationEventNS	TokenNameIdentifier	 init Mutation Event NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMSubtreeModified"	TokenNameStringLiteral	DOMSubtreeModified
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
// canBubbleArg 	TokenNameCOMMENT_LINE	canBubbleArg 
false	TokenNamefalse	
,	TokenNameCOMMA	
// cancelableArg 	TokenNameCOMMENT_LINE	cancelableArg 
null	TokenNamenull	
,	TokenNameCOMMA	
// relatedNodeArg 	TokenNameCOMMENT_LINE	relatedNodeArg 
null	TokenNamenull	
,	TokenNameCOMMA	
// prevValueArg 	TokenNameCOMMENT_LINE	prevValueArg 
null	TokenNamenull	
,	TokenNameCOMMA	
// newValueArg 	TokenNameCOMMENT_LINE	newValueArg 
null	TokenNamenull	
,	TokenNameCOMMA	
// attrNameArg 	TokenNameCOMMENT_LINE	attrNameArg 
MutationEvent	TokenNameIdentifier	 Mutation Event
.	TokenNameDOT	
MODIFICATION	TokenNameIdentifier	 MODIFICATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fires a DOMNodeInserted event. */	TokenNameCOMMENT_JAVADOC	 Fires a DOMNodeInserted event. 
protected	TokenNameprotected	
void	TokenNamevoid	
fireDOMNodeInsertedEvent	TokenNameIdentifier	 fire DOM Node Inserted Event
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractDocument	TokenNameIdentifier	 Abstract Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
getCurrentDocument	TokenNameIdentifier	 get Current Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getEventsEnabled	TokenNameIdentifier	 get Events Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DOMMutationEvent	TokenNameIdentifier	 DOM Mutation Event
ev	TokenNameIdentifier	 ev
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMMutationEvent	TokenNameIdentifier	 DOM Mutation Event
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
"MutationEvents"	TokenNameStringLiteral	MutationEvents
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
initMutationEventNS	TokenNameIdentifier	 init Mutation Event NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMNodeInserted"	TokenNameStringLiteral	DOMNodeInserted
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
// canBubbleArg 	TokenNameCOMMENT_LINE	canBubbleArg 
false	TokenNamefalse	
,	TokenNameCOMMA	
// cancelableArg 	TokenNameCOMMENT_LINE	cancelableArg 
this	TokenNamethis	
,	TokenNameCOMMA	
// relatedNodeArg 	TokenNameCOMMENT_LINE	relatedNodeArg 
null	TokenNamenull	
,	TokenNameCOMMA	
// prevValueArg 	TokenNameCOMMENT_LINE	prevValueArg 
null	TokenNamenull	
,	TokenNameCOMMA	
// newValueArg 	TokenNameCOMMENT_LINE	newValueArg 
null	TokenNamenull	
,	TokenNameCOMMA	
// attrNameArg 	TokenNameCOMMENT_LINE	attrNameArg 
MutationEvent	TokenNameIdentifier	 Mutation Event
.	TokenNameDOT	
ADDITION	TokenNameIdentifier	 ADDITION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractNode	TokenNameIdentifier	 Abstract Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractNode	TokenNameIdentifier	 Abstract Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
fireDOMNodeInsertedIntoDocumentEvent	TokenNameIdentifier	 fire DOM Node Inserted Into Document Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fires a DOMNodeRemoved event. */	TokenNameCOMMENT_JAVADOC	 Fires a DOMNodeRemoved event. 
protected	TokenNameprotected	
void	TokenNamevoid	
fireDOMNodeRemovedEvent	TokenNameIdentifier	 fire DOM Node Removed Event
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractDocument	TokenNameIdentifier	 Abstract Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
getCurrentDocument	TokenNameIdentifier	 get Current Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getEventsEnabled	TokenNameIdentifier	 get Events Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DOMMutationEvent	TokenNameIdentifier	 DOM Mutation Event
ev	TokenNameIdentifier	 ev
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMMutationEvent	TokenNameIdentifier	 DOM Mutation Event
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
"MutationEvents"	TokenNameStringLiteral	MutationEvents
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
initMutationEventNS	TokenNameIdentifier	 init Mutation Event NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"DOMNodeRemoved"	TokenNameStringLiteral	DOMNodeRemoved
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
// canBubbleArg 	TokenNameCOMMENT_LINE	canBubbleArg 
false	TokenNamefalse	
,	TokenNameCOMMA	
// cancelableArg 	TokenNameCOMMENT_LINE	cancelableArg 
this	TokenNamethis	
,	TokenNameCOMMA	
// relatedNodeArg 	TokenNameCOMMENT_LINE	relatedNodeArg 
null	TokenNamenull	
,	TokenNameCOMMA	
// prevValueArg 	TokenNameCOMMENT_LINE	prevValueArg 
null	TokenNamenull	
,	TokenNameCOMMA	
// newValueArg 	TokenNameCOMMENT_LINE	newValueArg 
null	TokenNamenull	
,	TokenNameCOMMA	
// attrNameArg 	TokenNameCOMMENT_LINE	attrNameArg 
MutationEvent	TokenNameIdentifier	 Mutation Event
.	TokenNameDOT	
REMOVAL	TokenNameIdentifier	 REMOVAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractNode	TokenNameIdentifier	 Abstract Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractNode	TokenNameIdentifier	 Abstract Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
fireDOMNodeRemovedFromDocumentEvent	TokenNameIdentifier	 fire DOM Node Removed From Document Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Checks the validity of a node to be inserted, and removes it from * the document if needed. */	TokenNameCOMMENT_JAVADOC	 Checks the validity of a node to be inserted, and removes it from the document if needed. 
protected	TokenNameprotected	
void	TokenNamevoid	
checkAndRemove	TokenNameIdentifier	 check And Remove
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
boolean	TokenNameboolean	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkChildType	TokenNameIdentifier	 check Child Type
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isReadonly	TokenNameIdentifier	 is Readonly
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"readonly.node"	TokenNameStringLiteral	readonly.node
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
getCurrentDocument	TokenNameIdentifier	 get Current Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
WRONG_DOCUMENT_ERR	TokenNameIdentifier	 WRONG  DOCUMENT  ERR
,	TokenNameCOMMA	
"node.from.wrong.document"	TokenNameStringLiteral	node.from.wrong.document
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
HIERARCHY_REQUEST_ERR	TokenNameIdentifier	 HIERARCHY  REQUEST  ERR
,	TokenNameCOMMA	
"add.self"	TokenNameStringLiteral	add.self
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
np	TokenNameIdentifier	 np
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
np	TokenNameIdentifier	 np
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// Already removed from tree, do nothing. 	TokenNameCOMMENT_LINE	Already removed from tree, do nothing. 
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
pn	TokenNameIdentifier	 pn
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
pn	TokenNameIdentifier	 pn
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
pn	TokenNameIdentifier	 pn
=	TokenNameEQUAL	
pn	TokenNameIdentifier	 pn
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pn	TokenNameIdentifier	 pn
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
HIERARCHY_REQUEST_ERR	TokenNameIdentifier	 HIERARCHY  REQUEST  ERR
,	TokenNameCOMMA	
"add.ancestor"	TokenNameStringLiteral	add.ancestor
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Remove the node from the tree 	TokenNameCOMMENT_LINE	Remove the node from the tree 
np	TokenNameIdentifier	 np
.	TokenNameDOT	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To manage a list of nodes. */	TokenNameCOMMENT_JAVADOC	 To manage a list of nodes. 
protected	TokenNameprotected	
class	TokenNameclass	
ElementsByTagName	TokenNameIdentifier	 Elements By Tag Name
implements	TokenNameimplements	
NodeList	TokenNameIdentifier	 Node List
{	TokenNameLBRACE	
/** * The table. */	TokenNameCOMMENT_JAVADOC	 The table. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
/** * The number of nodes. */	TokenNameCOMMENT_JAVADOC	 The number of nodes. 
protected	TokenNameprotected	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The name identifier. */	TokenNameCOMMENT_JAVADOC	 The name identifier. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** * Creates a new ElementsByTagName object. */	TokenNameCOMMENT_JAVADOC	 Creates a new ElementsByTagName object. 
public	TokenNamepublic	
ElementsByTagName	TokenNameIdentifier	 Elements By Tag Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link NodeList#item(int)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link NodeList#item(int)}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link NodeList#getLength()}. * @return {@link #size}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link NodeList#getLength()}. @return {@link #size}. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invalidates the list. */	TokenNameCOMMENT_JAVADOC	 Invalidates the list. 
public	TokenNamepublic	
void	TokenNamevoid	
invalidate	TokenNameIdentifier	 invalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Appends a node to the list. */	TokenNameCOMMENT_JAVADOC	 Appends a node to the list. 
protected	TokenNameprotected	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
11	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the list. */	TokenNameCOMMENT_JAVADOC	 Initializes the list. 
protected	TokenNameprotected	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
AbstractParentNode	TokenNameIdentifier	 Abstract Parent Node
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
nm	TokenNameIdentifier	 nm
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
nm	TokenNameIdentifier	 nm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To manage a list of nodes. */	TokenNameCOMMENT_JAVADOC	 To manage a list of nodes. 
protected	TokenNameprotected	
class	TokenNameclass	
ElementsByTagNameNS	TokenNameIdentifier	 Elements By Tag Name NS
implements	TokenNameimplements	
NodeList	TokenNameIdentifier	 Node List
{	TokenNameLBRACE	
/** * The table. */	TokenNameCOMMENT_JAVADOC	 The table. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
/** * The number of nodes. */	TokenNameCOMMENT_JAVADOC	 The number of nodes. 
protected	TokenNameprotected	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The namespace URI identifier. */	TokenNameCOMMENT_JAVADOC	 The namespace URI identifier. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
/** * The local name identifier. */	TokenNameCOMMENT_JAVADOC	 The local name identifier. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
/** * Creates a new ElementsByTagNameNS object. */	TokenNameCOMMENT_JAVADOC	 Creates a new ElementsByTagNameNS object. 
public	TokenNamepublic	
ElementsByTagNameNS	TokenNameIdentifier	 Elements By Tag Name NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ln	TokenNameIdentifier	 ln
)	TokenNameRPAREN	
{	TokenNameLBRACE	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
ns	TokenNameIdentifier	 ns
;	TokenNameSEMICOLON	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
ln	TokenNameIdentifier	 ln
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link NodeList#item(int)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link NodeList#item(int)}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link NodeList#getLength()}. * @return {@link #size}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link NodeList#getLength()}. @return {@link #size}. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invalidates the list. */	TokenNameCOMMENT_JAVADOC	 Invalidates the list. 
public	TokenNamepublic	
void	TokenNamevoid	
invalidate	TokenNameIdentifier	 invalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Appends a node to the list. */	TokenNameCOMMENT_JAVADOC	 Appends a node to the list. 
protected	TokenNameprotected	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
11	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
[	TokenNameLBRACKET	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the list. */	TokenNameCOMMENT_JAVADOC	 Initializes the list. 
protected	TokenNameprotected	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
AbstractParentNode	TokenNameIdentifier	 Abstract Parent Node
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nm	TokenNameIdentifier	 nm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nsMatch	TokenNameIdentifier	 ns Match
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
||	TokenNameOR_OR	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
nm	TokenNameIdentifier	 nm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
nsMatch	TokenNameIdentifier	 ns Match
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
s2	TokenNameIdentifier	 s2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
s2	TokenNameIdentifier	 s2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To manage the children of this node. */	TokenNameCOMMENT_JAVADOC	 To manage the children of this node. 
protected	TokenNameprotected	
class	TokenNameclass	
ChildNodes	TokenNameIdentifier	 Child Nodes
implements	TokenNameimplements	
NodeList	TokenNameIdentifier	 Node List
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** * The first child. */	TokenNameCOMMENT_JAVADOC	 The first child. 
protected	TokenNameprotected	
ExtendedNode	TokenNameIdentifier	 Extended Node
firstChild	TokenNameIdentifier	 first Child
;	TokenNameSEMICOLON	
/** * The last child. */	TokenNameCOMMENT_JAVADOC	 The last child. 
protected	TokenNameprotected	
ExtendedNode	TokenNameIdentifier	 Extended Node
lastChild	TokenNameIdentifier	 last Child
;	TokenNameSEMICOLON	
/** * The number of children. */	TokenNameCOMMENT_JAVADOC	 The number of children. 
protected	TokenNameprotected	
int	TokenNameint	
children	TokenNameIdentifier	 children
;	TokenNameSEMICOLON	
/** * The number of Element children. */	TokenNameCOMMENT_JAVADOC	 The number of Element children. 
protected	TokenNameprotected	
int	TokenNameint	
elementChildren	TokenNameIdentifier	 element Children
;	TokenNameSEMICOLON	
/** * Creates a new ChildNodes object. */	TokenNameCOMMENT_JAVADOC	 Creates a new ChildNodes object. 
public	TokenNamepublic	
ChildNodes	TokenNameIdentifier	 Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.NodeList#item(int)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.NodeList#item(int)}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
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
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
lastChild	TokenNameIdentifier	 last Child
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.NodeList#getLength()}. * @return {@link #children}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.NodeList#getLength()}. @return {@link #children}. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
children	TokenNameIdentifier	 children
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Appends a node to the tree. * The node is assumed not to be a DocumentFragment instance. */	TokenNameCOMMENT_JAVADOC	 Appends a node to the tree. The node is assumed not to be a DocumentFragment instance. 
public	TokenNamepublic	
ExtendedNode	TokenNameIdentifier	 Extended Node
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastChild	TokenNameIdentifier	 last Child
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
lastChild	TokenNameIdentifier	 last Child
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setPreviousSibling	TokenNameIdentifier	 set Previous Sibling
(	TokenNameLPAREN	
lastChild	TokenNameIdentifier	 last Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastChild	TokenNameIdentifier	 last Child
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
children	TokenNameIdentifier	 children
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
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
elementChildren	TokenNameIdentifier	 element Children
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inserts a node in the tree. */	TokenNameCOMMENT_JAVADOC	 Inserts a node in the tree. 
public	TokenNamepublic	
ExtendedNode	TokenNameIdentifier	 Extended Node
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
ExtendedNode	TokenNameIdentifier	 Extended Node
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
==	TokenNameEQUAL_EQUAL	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
setPreviousSibling	TokenNameIdentifier	 set Previous Sibling
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
children	TokenNameIdentifier	 children
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
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
elementChildren	TokenNameIdentifier	 element Children
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
==	TokenNameEQUAL_EQUAL	
lastChild	TokenNameIdentifier	 last Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExtendedNode	TokenNameIdentifier	 Extended Node
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
)	TokenNameRPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
setPreviousSibling	TokenNameIdentifier	 set Previous Sibling
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setPreviousSibling	TokenNameIdentifier	 set Previous Sibling
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
children	TokenNameIdentifier	 children
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
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
elementChildren	TokenNameIdentifier	 element Children
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ExtendedNode	TokenNameIdentifier	 Extended Node
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
)	TokenNameRPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setPreviousSibling	TokenNameIdentifier	 set Previous Sibling
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
setPreviousSibling	TokenNameIdentifier	 set Previous Sibling
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
children	TokenNameIdentifier	 children
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
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
elementChildren	TokenNameIdentifier	 element Children
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
"child.missing"	TokenNameStringLiteral	child.missing
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Replaces a node in the tree by an other. */	TokenNameCOMMENT_JAVADOC	 Replaces a node in the tree by an other. 
public	TokenNamepublic	
ExtendedNode	TokenNameIdentifier	 Extended Node
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
ExtendedNode	TokenNameIdentifier	 Extended Node
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExtendedNode	TokenNameIdentifier	 Extended Node
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
)	TokenNameRPAREN	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
lastChild	TokenNameIdentifier	 last Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastChild	TokenNameIdentifier	 last Child
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setPreviousSibling	TokenNameIdentifier	 set Previous Sibling
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
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
elementChildren	TokenNameIdentifier	 element Children
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
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
elementChildren	TokenNameIdentifier	 element Children
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
lastChild	TokenNameIdentifier	 last Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExtendedNode	TokenNameIdentifier	 Extended Node
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
)	TokenNameRPAREN	
lastChild	TokenNameIdentifier	 last Child
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setPreviousSibling	TokenNameIdentifier	 set Previous Sibling
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastChild	TokenNameIdentifier	 last Child
.	TokenNameDOT	
setPreviousSibling	TokenNameIdentifier	 set Previous Sibling
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastChild	TokenNameIdentifier	 last Child
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
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
elementChildren	TokenNameIdentifier	 element Children
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
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
elementChildren	TokenNameIdentifier	 element Children
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ExtendedNode	TokenNameIdentifier	 Extended Node
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExtendedNode	TokenNameIdentifier	 Extended Node
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setPreviousSibling	TokenNameIdentifier	 set Previous Sibling
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
setPreviousSibling	TokenNameIdentifier	 set Previous Sibling
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
setPreviousSibling	TokenNameIdentifier	 set Previous Sibling
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
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
elementChildren	TokenNameIdentifier	 element Children
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
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
elementChildren	TokenNameIdentifier	 element Children
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
"child.missing"	TokenNameStringLiteral	child.missing
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the given node from the tree. */	TokenNameCOMMENT_JAVADOC	 Removes the given node from the tree. 
public	TokenNamepublic	
ExtendedNode	TokenNameIdentifier	 Extended Node
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
firstChild	TokenNameIdentifier	 first Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
lastChild	TokenNameIdentifier	 last Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
lastChild	TokenNameIdentifier	 last Child
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
children	TokenNameIdentifier	 children
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
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
elementChildren	TokenNameIdentifier	 element Children
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
firstChild	TokenNameIdentifier	 first Child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
)	TokenNameRPAREN	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
firstChild	TokenNameIdentifier	 first Child
.	TokenNameDOT	
setPreviousSibling	TokenNameIdentifier	 set Previous Sibling
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
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
elementChildren	TokenNameIdentifier	 element Children
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
children	TokenNameIdentifier	 children
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
lastChild	TokenNameIdentifier	 last Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastChild	TokenNameIdentifier	 last Child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
)	TokenNameRPAREN	
lastChild	TokenNameIdentifier	 last Child
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastChild	TokenNameIdentifier	 last Child
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setPreviousSibling	TokenNameIdentifier	 set Previous Sibling
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
children	TokenNameIdentifier	 children
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
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
elementChildren	TokenNameIdentifier	 element Children
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ExtendedNode	TokenNameIdentifier	 Extended Node
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExtendedNode	TokenNameIdentifier	 Extended Node
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendedNode	TokenNameIdentifier	 Extended Node
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
setPreviousSibling	TokenNameIdentifier	 set Previous Sibling
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setPreviousSibling	TokenNameIdentifier	 set Previous Sibling
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setNextSibling	TokenNameIdentifier	 set Next Sibling
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
children	TokenNameIdentifier	 children
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
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
elementChildren	TokenNameIdentifier	 element Children
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
"child.missing"	TokenNameStringLiteral	child.missing
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
