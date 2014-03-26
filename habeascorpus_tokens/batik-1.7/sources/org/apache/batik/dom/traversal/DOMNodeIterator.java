/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
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
AbstractDocument	TokenNameIdentifier	 Abstract Document
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
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeFilter	TokenNameIdentifier	 Node Filter
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
NodeIterator	TokenNameIdentifier	 Node Iterator
;	TokenNameSEMICOLON	
/** * This class implements the {@link org.w3c.dom.traversal.NodeIterator} * interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: DOMNodeIterator.java 478249 2006-11-22 17:29:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class implements the {@link org.w3c.dom.traversal.NodeIterator} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: DOMNodeIterator.java 478249 2006-11-22 17:29:37Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMNodeIterator	TokenNameIdentifier	 DOM Node Iterator
implements	TokenNameimplements	
NodeIterator	TokenNameIdentifier	 Node Iterator
{	TokenNameLBRACE	
/** * The initial state. */	TokenNameCOMMENT_JAVADOC	 The initial state. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
INITIAL	TokenNameIdentifier	 INITIAL
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The invalid state. */	TokenNameCOMMENT_JAVADOC	 The invalid state. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
INVALID	TokenNameIdentifier	 INVALID
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The forward state. */	TokenNameCOMMENT_JAVADOC	 The forward state. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FORWARD	TokenNameIdentifier	 FORWARD
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The backward state. */	TokenNameCOMMENT_JAVADOC	 The backward state. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
BACKWARD	TokenNameIdentifier	 BACKWARD
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The document which created the iterator. */	TokenNameCOMMENT_JAVADOC	 The document which created the iterator. 
protected	TokenNameprotected	
AbstractDocument	TokenNameIdentifier	 Abstract Document
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
/** * The root node. */	TokenNameCOMMENT_JAVADOC	 The root node. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
/** * Which node types are presented via the iterator. */	TokenNameCOMMENT_JAVADOC	 Which node types are presented via the iterator. 
protected	TokenNameprotected	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
;	TokenNameSEMICOLON	
/** * The NodeFilter used to screen nodes. */	TokenNameCOMMENT_JAVADOC	 The NodeFilter used to screen nodes. 
protected	TokenNameprotected	
NodeFilter	TokenNameIdentifier	 Node Filter
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
/** * Whether the children of entity reference nodes are visible * to the iterator. */	TokenNameCOMMENT_JAVADOC	 Whether the children of entity reference nodes are visible to the iterator. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
expandEntityReferences	TokenNameIdentifier	 expand Entity References
;	TokenNameSEMICOLON	
/** * The iterator state. */	TokenNameCOMMENT_JAVADOC	 The iterator state. 
protected	TokenNameprotected	
short	TokenNameshort	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
/** * The reference node. */	TokenNameCOMMENT_JAVADOC	 The reference node. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
referenceNode	TokenNameIdentifier	 reference Node
;	TokenNameSEMICOLON	
/** * Creates a new NodeIterator object. * @param doc The document which created the tree walker. * @param n The root node. * @param what Which node types are presented via the iterator. * @param nf The NodeFilter used to screen nodes. * @param exp Whether the children of entity reference nodes are visible * to the iterator. */	TokenNameCOMMENT_JAVADOC	 Creates a new NodeIterator object. @param doc The document which created the tree walker. @param n The root node. @param what Which node types are presented via the iterator. @param nf The NodeFilter used to screen nodes. @param exp Whether the children of entity reference nodes are visible to the iterator. 
public	TokenNamepublic	
DOMNodeIterator	TokenNameIdentifier	 DOM Node Iterator
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
int	TokenNameint	
what	TokenNameIdentifier	 what
,	TokenNameCOMMA	
NodeFilter	TokenNameIdentifier	 Node Filter
nf	TokenNameIdentifier	 nf
,	TokenNameCOMMA	
boolean	TokenNameboolean	
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
whatToShow	TokenNameIdentifier	 what To Show
=	TokenNameEQUAL	
what	TokenNameIdentifier	 what
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
nf	TokenNameIdentifier	 nf
;	TokenNameSEMICOLON	
expandEntityReferences	TokenNameIdentifier	 expand Entity References
=	TokenNameEQUAL	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
referenceNode	TokenNameIdentifier	 reference Node
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link NodeIterator#getRoot()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link NodeIterator#getRoot()}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link NodeIterator#getWhatToShow()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link NodeIterator#getWhatToShow()}. 
public	TokenNamepublic	
int	TokenNameint	
getWhatToShow	TokenNameIdentifier	 get What To Show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
whatToShow	TokenNameIdentifier	 what To Show
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link NodeIterator#getFilter()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link NodeIterator#getFilter()}. 
public	TokenNamepublic	
NodeFilter	TokenNameIdentifier	 Node Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link NodeIterator#getExpandEntityReferences()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link NodeIterator#getExpandEntityReferences()}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getExpandEntityReferences	TokenNameIdentifier	 get Expand Entity References
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expandEntityReferences	TokenNameIdentifier	 expand Entity References
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link NodeIterator#nextNode()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link NodeIterator#nextNode()}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
INVALID	TokenNameIdentifier	 INVALID
:	TokenNameCOLON	
throw	TokenNamethrow	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
"detached.iterator"	TokenNameStringLiteral	detached.iterator
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
BACKWARD	TokenNameIdentifier	 BACKWARD
:	TokenNameCOLON	
case	TokenNamecase	
INITIAL	TokenNameIdentifier	 INITIAL
:	TokenNameCOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
FORWARD	TokenNameIdentifier	 FORWARD
;	TokenNameSEMICOLON	
return	TokenNamereturn	
referenceNode	TokenNameIdentifier	 reference Node
;	TokenNameSEMICOLON	
case	TokenNamecase	
FORWARD	TokenNameIdentifier	 FORWARD
:	TokenNameCOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unfilteredNextNode	TokenNameIdentifier	 unfiltered Next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
referenceNode	TokenNameIdentifier	 reference Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
referenceNode	TokenNameIdentifier	 reference Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
referenceNode	TokenNameIdentifier	 reference Node
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
referenceNode	TokenNameIdentifier	 reference Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link NodeIterator#previousNode()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link NodeIterator#previousNode()}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
previousNode	TokenNameIdentifier	 previous Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
INVALID	TokenNameIdentifier	 INVALID
:	TokenNameCOLON	
throw	TokenNamethrow	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
"detached.iterator"	TokenNameStringLiteral	detached.iterator
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
FORWARD	TokenNameIdentifier	 FORWARD
:	TokenNameCOLON	
case	TokenNamecase	
INITIAL	TokenNameIdentifier	 INITIAL
:	TokenNameCOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
BACKWARD	TokenNameIdentifier	 BACKWARD
;	TokenNameSEMICOLON	
return	TokenNamereturn	
referenceNode	TokenNameIdentifier	 reference Node
;	TokenNameSEMICOLON	
case	TokenNamecase	
BACKWARD	TokenNameIdentifier	 BACKWARD
:	TokenNameCOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unfilteredPreviousNode	TokenNameIdentifier	 unfiltered Previous Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
referenceNode	TokenNameIdentifier	 reference Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
referenceNode	TokenNameIdentifier	 reference Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
referenceNode	TokenNameIdentifier	 reference Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
referenceNode	TokenNameIdentifier	 reference Node
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
referenceNode	TokenNameIdentifier	 reference Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link NodeIterator#detach()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link NodeIterator#detach()}. 
public	TokenNamepublic	
void	TokenNamevoid	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
INVALID	TokenNameIdentifier	 INVALID
;	TokenNameSEMICOLON	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
detachNodeIterator	TokenNameIdentifier	 detach Node Iterator
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called by the DOM when a node will be removed from the current document. */	TokenNameCOMMENT_JAVADOC	 Called by the DOM when a node will be removed from the current document. 
public	TokenNamepublic	
void	TokenNamevoid	
nodeToBeRemoved	TokenNameIdentifier	 node To Be Removed
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
removedNode	TokenNameIdentifier	 removed Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
INVALID	TokenNameIdentifier	 INVALID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
referenceNode	TokenNameIdentifier	 reference Node
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
removedNode	TokenNameIdentifier	 removed Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
BACKWARD	TokenNameIdentifier	 BACKWARD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Go to the first child 	TokenNameCOMMENT_LINE	Go to the first child 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
||	TokenNameOR_OR	
expandEntityReferences	TokenNameIdentifier	 expand Entity References
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
referenceNode	TokenNameIdentifier	 reference Node
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Go to the next sibling 	TokenNameCOMMENT_LINE	Go to the next sibling 
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
referenceNode	TokenNameIdentifier	 reference Node
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Go to the first sibling of one of the ancestors 	TokenNameCOMMENT_LINE	Go to the first sibling of one of the ancestors 
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
referenceNode	TokenNameIdentifier	 reference Node
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
referenceNode	TokenNameIdentifier	 reference Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Go to the parent of a first child 	TokenNameCOMMENT_LINE	Go to the parent of a first child 
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
referenceNode	TokenNameIdentifier	 reference Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Go to the last child of child... 	TokenNameCOMMENT_LINE	Go to the last child of child... 
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
||	TokenNameOR_OR	
expandEntityReferences	TokenNameIdentifier	 expand Entity References
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
referenceNode	TokenNameIdentifier	 reference Node
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the reference node to the next node, unfiltered. */	TokenNameCOMMENT_JAVADOC	 Sets the reference node to the next node, unfiltered. 
protected	TokenNameprotected	
void	TokenNamevoid	
unfilteredNextNode	TokenNameIdentifier	 unfiltered Next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
referenceNode	TokenNameIdentifier	 reference Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Go to the first child 	TokenNameCOMMENT_LINE	Go to the first child 
if	TokenNameif	
(	TokenNameLPAREN	
referenceNode	TokenNameIdentifier	 reference Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
||	TokenNameOR_OR	
expandEntityReferences	TokenNameIdentifier	 expand Entity References
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
referenceNode	TokenNameIdentifier	 reference Node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
referenceNode	TokenNameIdentifier	 reference Node
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Go to the next sibling 	TokenNameCOMMENT_LINE	Go to the next sibling 
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
referenceNode	TokenNameIdentifier	 reference Node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
referenceNode	TokenNameIdentifier	 reference Node
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Go to the first sibling of one of the ancestors 	TokenNameCOMMENT_LINE	Go to the first sibling of one of the ancestors 
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
referenceNode	TokenNameIdentifier	 reference Node
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
referenceNode	TokenNameIdentifier	 reference Node
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
referenceNode	TokenNameIdentifier	 reference Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the reference node to the previous node, unfiltered. */	TokenNameCOMMENT_JAVADOC	 Sets the reference node to the previous node, unfiltered. 
protected	TokenNameprotected	
void	TokenNamevoid	
unfilteredPreviousNode	TokenNameIdentifier	 unfiltered Previous Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
referenceNode	TokenNameIdentifier	 reference Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// The previous of root is null 	TokenNameCOMMENT_LINE	The previous of root is null 
if	TokenNameif	
(	TokenNameLPAREN	
referenceNode	TokenNameIdentifier	 reference Node
==	TokenNameEQUAL_EQUAL	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
referenceNode	TokenNameIdentifier	 reference Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
referenceNode	TokenNameIdentifier	 reference Node
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Go to the parent of a first child 	TokenNameCOMMENT_LINE	Go to the parent of a first child 
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
referenceNode	TokenNameIdentifier	 reference Node
=	TokenNameEQUAL	
referenceNode	TokenNameIdentifier	 reference Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Go to the last child of child... 	TokenNameCOMMENT_LINE	Go to the last child of child... 
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
||	TokenNameOR_OR	
expandEntityReferences	TokenNameIdentifier	 expand Entity References
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
referenceNode	TokenNameIdentifier	 reference Node
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
