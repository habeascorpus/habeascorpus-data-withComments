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
AbstractNode	TokenNameIdentifier	 Abstract Node
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
TreeWalker	TokenNameIdentifier	 Tree Walker
;	TokenNameSEMICOLON	
/** * This class implements the {@link org.w3c.dom.traversal.NodeIterator} * interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: DOMTreeWalker.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the {@link org.w3c.dom.traversal.NodeIterator} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: DOMTreeWalker.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMTreeWalker	TokenNameIdentifier	 DOM Tree Walker
implements	TokenNameimplements	
TreeWalker	TokenNameIdentifier	 Tree Walker
{	TokenNameLBRACE	
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
/** * The current node. */	TokenNameCOMMENT_JAVADOC	 The current node. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
/** * Creates a new TreeWalker object. * @param n The root node. * @param what Which node types are presented via the iterator. * @param nf The NodeFilter used to screen nodes. * @param exp Whether the children of entity reference nodes are visible * to the tree walker. */	TokenNameCOMMENT_JAVADOC	 Creates a new TreeWalker object. @param n The root node. @param what Which node types are presented via the iterator. @param nf The NodeFilter used to screen nodes. @param exp Whether the children of entity reference nodes are visible to the tree walker. 
public	TokenNamepublic	
DOMTreeWalker	TokenNameIdentifier	 DOM Tree Walker
(	TokenNameLPAREN	
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
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link TreeWalker#getRoot()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link TreeWalker#getRoot()}. 
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
/** * <b>DOM</b>: Implements {@link TreeWalker#getWhatToShow()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link TreeWalker#getWhatToShow()}. 
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
/** * <b>DOM</b>: Implements {@link TreeWalker#getFilter()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link TreeWalker#getFilter()}. 
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
/** * <b>DOM</b>: Implements {@link TreeWalker#getExpandEntityReferences()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link TreeWalker#getExpandEntityReferences()}. 
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
/** * <b>DOM</b>: Implements {@link TreeWalker#getCurrentNode()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link TreeWalker#getCurrentNode()}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link TreeWalker#setCurrentNode(Node)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link TreeWalker#setCurrentNode(Node)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setCurrentNode	TokenNameIdentifier	 set Current Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractNode	TokenNameIdentifier	 Abstract Node
)	TokenNameRPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
"null.current.node"	TokenNameStringLiteral	null.current.node
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link TreeWalker#parentNode()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link TreeWalker#parentNode()}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
parentNode	TokenNameIdentifier	 parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
parentNode	TokenNameIdentifier	 parent Node
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link TreeWalker#firstChild()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link TreeWalker#firstChild()}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
firstChild	TokenNameIdentifier	 first Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link TreeWalker#lastChild()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link TreeWalker#lastChild()}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
lastChild	TokenNameIdentifier	 last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
lastChild	TokenNameIdentifier	 last Child
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link TreeWalker#previousSibling()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link TreeWalker#previousSibling()}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
previousSibling	TokenNameIdentifier	 previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
previousSibling	TokenNameIdentifier	 previous Sibling
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link TreeWalker#nextSibling()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link TreeWalker#nextSibling()}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
nextSibling	TokenNameIdentifier	 next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
nextSibling	TokenNameIdentifier	 next Sibling
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link TreeWalker#previousNode()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link TreeWalker#previousNode()}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
previousNode	TokenNameIdentifier	 previous Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
previousSibling	TokenNameIdentifier	 previous Sibling
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
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
parentNode	TokenNameIdentifier	 parent Node
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
lastChild	TokenNameIdentifier	 last Child
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
lastChild	TokenNameIdentifier	 last Child
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
last	TokenNameIdentifier	 last
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link TreeWalker#nextNode()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link TreeWalker#nextNode()}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
nextSibling	TokenNameIdentifier	 next Sibling
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parentNode	TokenNameIdentifier	 parent Node
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
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
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
nextSibling	TokenNameIdentifier	 next Sibling
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the parent node of the given node. */	TokenNameCOMMENT_JAVADOC	 Returns the parent node of the given node. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
parentNode	TokenNameIdentifier	 parent Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
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
result	TokenNameIdentifier	 result
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
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the first child of the given node. */	TokenNameCOMMENT_JAVADOC	 Returns the first child of the given node. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
firstChild	TokenNameIdentifier	 first Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
&&	TokenNameAND_AND	
!	TokenNameNOT	
expandEntityReferences	TokenNameIdentifier	 expand Entity References
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
:	TokenNameCOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
case	TokenNamecase	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
:	TokenNameCOLON	
Node	TokenNameIdentifier	 Node
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Fall through 	TokenNameCOMMENT_LINE	Fall through 
default	TokenNamedefault	
:	TokenNameCOLON	
// NodeFilter.FILTER_REJECT 	TokenNameCOMMENT_LINE	NodeFilter.FILTER_REJECT 
return	TokenNamereturn	
nextSibling	TokenNameIdentifier	 next Sibling
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the last child of the given node. */	TokenNameCOMMENT_JAVADOC	 Returns the last child of the given node. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
lastChild	TokenNameIdentifier	 last Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
&&	TokenNameAND_AND	
!	TokenNameNOT	
expandEntityReferences	TokenNameIdentifier	 expand Entity References
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
:	TokenNameCOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
case	TokenNamecase	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
:	TokenNameCOLON	
Node	TokenNameIdentifier	 Node
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
lastChild	TokenNameIdentifier	 last Child
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Fall through 	TokenNameCOMMENT_LINE	Fall through 
default	TokenNamedefault	
:	TokenNameCOLON	
// NodeFilter.FILTER_REJECT 	TokenNameCOMMENT_LINE	NodeFilter.FILTER_REJECT 
return	TokenNamereturn	
previousSibling	TokenNameIdentifier	 previous Sibling
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the previous sibling of the given node. */	TokenNameCOMMENT_JAVADOC	 Returns the previous sibling of the given node. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
previousSibling	TokenNameIdentifier	 previous Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
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
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
:	TokenNameCOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
case	TokenNamecase	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
:	TokenNameCOLON	
Node	TokenNameIdentifier	 Node
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
lastChild	TokenNameIdentifier	 last Child
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Fall through 	TokenNameCOMMENT_LINE	Fall through 
default	TokenNamedefault	
:	TokenNameCOLON	
// NodeFilter.FILTER_REJECT 	TokenNameCOMMENT_LINE	NodeFilter.FILTER_REJECT 
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the next sibling of the given node. */	TokenNameCOMMENT_JAVADOC	 Returns the next sibling of the given node. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
nextSibling	TokenNameIdentifier	 next Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
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
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
:	TokenNameCOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
case	TokenNamecase	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
:	TokenNameCOLON	
Node	TokenNameIdentifier	 Node
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
firstChild	TokenNameIdentifier	 first Child
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Fall through 	TokenNameCOMMENT_LINE	Fall through 
default	TokenNamedefault	
:	TokenNameCOLON	
// NodeFilter.FILTER_REJECT 	TokenNameCOMMENT_LINE	NodeFilter.FILTER_REJECT 
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Whether or not the given node is accepted by this tree walker. */	TokenNameCOMMENT_JAVADOC	 Whether or not the given node is accepted by this tree walker. 
protected	TokenNameprotected	
short	TokenNameshort	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
n	TokenNameIdentifier	 n
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
