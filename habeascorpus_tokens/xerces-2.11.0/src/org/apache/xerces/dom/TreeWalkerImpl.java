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
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
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
/** * This class implements the TreeWalker interface. * * @xerces.internal * * @version $Id: TreeWalkerImpl.java 536630 2007-05-09 19:37:05Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class implements the TreeWalker interface. * @xerces.internal * @version $Id: TreeWalkerImpl.java 536630 2007-05-09 19:37:05Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
TreeWalkerImpl	TokenNameIdentifier	 Tree Walker Impl
implements	TokenNameimplements	
TreeWalker	TokenNameIdentifier	 Tree Walker
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** When TRUE, the children of entites references are returned in the iterator. */	TokenNameCOMMENT_JAVADOC	 When TRUE, the children of entites references are returned in the iterator. 
private	TokenNameprivate	
boolean	TokenNameboolean	
fEntityReferenceExpansion	TokenNameIdentifier	 f Entity Reference Expansion
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** The whatToShow mask. */	TokenNameCOMMENT_JAVADOC	 The whatToShow mask. 
int	TokenNameint	
fWhatToShow	TokenNameIdentifier	 f What To Show
=	TokenNameEQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
;	TokenNameSEMICOLON	
/** The NodeFilter reference. */	TokenNameCOMMENT_JAVADOC	 The NodeFilter reference. 
NodeFilter	TokenNameIdentifier	 Node Filter
fNodeFilter	TokenNameIdentifier	 f Node Filter
;	TokenNameSEMICOLON	
/** The current Node. */	TokenNameCOMMENT_JAVADOC	 The current Node. 
Node	TokenNameIdentifier	 Node
fCurrentNode	TokenNameIdentifier	 f Current Node
;	TokenNameSEMICOLON	
/** The root Node. */	TokenNameCOMMENT_JAVADOC	 The root Node. 
Node	TokenNameIdentifier	 Node
fRoot	TokenNameIdentifier	 f Root
;	TokenNameSEMICOLON	
/** Use Node.isSameNode() to check if one node is the same as another. */	TokenNameCOMMENT_JAVADOC	 Use Node.isSameNode() to check if one node is the same as another. 
private	TokenNameprivate	
boolean	TokenNameboolean	
fUseIsSameNode	TokenNameIdentifier	 f Use Is Same Node
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Implementation Note: No state is kept except the data above 	TokenNameCOMMENT_LINE	Implementation Note: No state is kept except the data above 
// (fWhatToShow, fNodeFilter, fCurrentNode, fRoot) such that 	TokenNameCOMMENT_LINE	(fWhatToShow, fNodeFilter, fCurrentNode, fRoot) such that 
// setters could be created for these data values and the 	TokenNameCOMMENT_LINE	setters could be created for these data values and the 
// implementation will still work. 	TokenNameCOMMENT_LINE	implementation will still work. 
// 	TokenNameCOMMENT_LINE	 
// Constructor 	TokenNameCOMMENT_LINE	Constructor 
// 	TokenNameCOMMENT_LINE	 
/** Public constructor */	TokenNameCOMMENT_JAVADOC	 Public constructor 
public	TokenNamepublic	
TreeWalkerImpl	TokenNameIdentifier	 Tree Walker Impl
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
,	TokenNameCOMMA	
NodeFilter	TokenNameIdentifier	 Node Filter
nodeFilter	TokenNameIdentifier	 node Filter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
entityReferenceExpansion	TokenNameIdentifier	 entity Reference Expansion
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
fRoot	TokenNameIdentifier	 f Root
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
fUseIsSameNode	TokenNameIdentifier	 f Use Is Same Node
=	TokenNameEQUAL	
useIsSameNode	TokenNameIdentifier	 use Is Same Node
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fWhatToShow	TokenNameIdentifier	 f What To Show
=	TokenNameEQUAL	
whatToShow	TokenNameIdentifier	 what To Show
;	TokenNameSEMICOLON	
fNodeFilter	TokenNameIdentifier	 f Node Filter
=	TokenNameEQUAL	
nodeFilter	TokenNameIdentifier	 node Filter
;	TokenNameSEMICOLON	
fEntityReferenceExpansion	TokenNameIdentifier	 f Entity Reference Expansion
=	TokenNameEQUAL	
entityReferenceExpansion	TokenNameIdentifier	 entity Reference Expansion
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fRoot	TokenNameIdentifier	 f Root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the whatToShow value */	TokenNameCOMMENT_JAVADOC	 Return the whatToShow value 
public	TokenNamepublic	
int	TokenNameint	
getWhatToShow	TokenNameIdentifier	 get What To Show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fWhatToShow	TokenNameIdentifier	 f What To Show
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setWhatShow	TokenNameIdentifier	 set What Show
(	TokenNameLPAREN	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fWhatToShow	TokenNameIdentifier	 f What To Show
=	TokenNameEQUAL	
whatToShow	TokenNameIdentifier	 what To Show
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the NodeFilter */	TokenNameCOMMENT_JAVADOC	 Return the NodeFilter 
public	TokenNamepublic	
NodeFilter	TokenNameIdentifier	 Node Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNodeFilter	TokenNameIdentifier	 f Node Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return whether children entity references are included in the iterator. */	TokenNameCOMMENT_JAVADOC	 Return whether children entity references are included in the iterator. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getExpandEntityReferences	TokenNameIdentifier	 get Expand Entity References
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fEntityReferenceExpansion	TokenNameIdentifier	 f Entity Reference Expansion
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the current Node. */	TokenNameCOMMENT_JAVADOC	 Return the current Node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCurrentNode	TokenNameIdentifier	 f Current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the current Node. */	TokenNameCOMMENT_JAVADOC	 Return the current Node. 
public	TokenNamepublic	
void	TokenNamevoid	
setCurrentNode	TokenNameIdentifier	 set Current Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NOT_SUPPORTED_ERR"	TokenNameStringLiteral	NOT_SUPPORTED_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the parent Node from the current node, * after applying filter, whatToshow. * If result is not null, set the current Node. */	TokenNameCOMMENT_JAVADOC	 Return the parent Node from the current node, after applying filter, whatToshow. If result is not null, set the current Node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
parentNode	TokenNameIdentifier	 parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentNode	TokenNameIdentifier	 f Current Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
fCurrentNode	TokenNameIdentifier	 f Current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the first child Node from the current node, * after applying filter, whatToshow. * If result is not null, set the current Node. */	TokenNameCOMMENT_JAVADOC	 Return the first child Node from the current node, after applying filter, whatToshow. If result is not null, set the current Node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
firstChild	TokenNameIdentifier	 first Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentNode	TokenNameIdentifier	 f Current Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
fCurrentNode	TokenNameIdentifier	 f Current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the last child Node from the current node, * after applying filter, whatToshow. * If result is not null, set the current Node. */	TokenNameCOMMENT_JAVADOC	 Return the last child Node from the current node, after applying filter, whatToshow. If result is not null, set the current Node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
lastChild	TokenNameIdentifier	 last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentNode	TokenNameIdentifier	 f Current Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
fCurrentNode	TokenNameIdentifier	 f Current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the previous sibling Node from the current node, * after applying filter, whatToshow. * If result is not null, set the current Node. */	TokenNameCOMMENT_JAVADOC	 Return the previous sibling Node from the current node, after applying filter, whatToshow. If result is not null, set the current Node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
previousSibling	TokenNameIdentifier	 previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentNode	TokenNameIdentifier	 f Current Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
fCurrentNode	TokenNameIdentifier	 f Current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the next sibling Node from the current node, * after applying filter, whatToshow. * If result is not null, set the current Node. */	TokenNameCOMMENT_JAVADOC	 Return the next sibling Node from the current node, after applying filter, whatToshow. If result is not null, set the current Node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
nextSibling	TokenNameIdentifier	 next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentNode	TokenNameIdentifier	 f Current Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
fCurrentNode	TokenNameIdentifier	 f Current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the previous Node from the current node, * after applying filter, whatToshow. * If result is not null, set the current Node. */	TokenNameCOMMENT_JAVADOC	 Return the previous Node from the current node, after applying filter, whatToshow. If result is not null, set the current Node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
previousNode	TokenNameIdentifier	 previous Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentNode	TokenNameIdentifier	 f Current Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// get sibling 	TokenNameCOMMENT_LINE	get sibling 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
fCurrentNode	TokenNameIdentifier	 f Current Node
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
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
fCurrentNode	TokenNameIdentifier	 f Current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fCurrentNode	TokenNameIdentifier	 f Current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get the lastChild of result. 	TokenNameCOMMENT_LINE	get the lastChild of result. 
Node	TokenNameIdentifier	 Node
lastChild	TokenNameIdentifier	 last Child
=	TokenNameEQUAL	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
lastChild	TokenNameIdentifier	 last Child
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
lastChild	TokenNameIdentifier	 last Child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
lastChild	TokenNameIdentifier	 last Child
;	TokenNameSEMICOLON	
lastChild	TokenNameIdentifier	 last Child
=	TokenNameEQUAL	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastChild	TokenNameIdentifier	 last Child
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
// if there is a lastChild which passes filters return it. 	TokenNameCOMMENT_LINE	if there is a lastChild which passes filters return it. 
if	TokenNameif	
(	TokenNameLPAREN	
lastChild	TokenNameIdentifier	 last Child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
lastChild	TokenNameIdentifier	 last Child
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fCurrentNode	TokenNameIdentifier	 f Current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// otherwise return the previous sibling. 	TokenNameCOMMENT_LINE	otherwise return the previous sibling. 
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fCurrentNode	TokenNameIdentifier	 f Current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// otherwise return null. 	TokenNameCOMMENT_LINE	otherwise return null. 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the next Node from the current node, * after applying filter, whatToshow. * If result is not null, set the current Node. */	TokenNameCOMMENT_JAVADOC	 Return the next Node from the current node, after applying filter, whatToshow. If result is not null, set the current Node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentNode	TokenNameIdentifier	 f Current Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
fCurrentNode	TokenNameIdentifier	 f Current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
fCurrentNode	TokenNameIdentifier	 f Current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return parent's 1st sibling. 	TokenNameCOMMENT_LINE	return parent's 1st sibling. 
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
fCurrentNode	TokenNameIdentifier	 f Current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentNode	TokenNameIdentifier	 f Current Node
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end , return null 	TokenNameCOMMENT_LINE	end , return null 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Internal function. * Return the parent Node, from the input node * after applying filter, whatToshow. * The current node is not consulted or set. */	TokenNameCOMMENT_JAVADOC	 Internal function. Return the parent Node, from the input node after applying filter, whatToshow. The current node is not consulted or set. 
Node	TokenNameIdentifier	 Node
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
isSameNode	TokenNameIdentifier	 is Same Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
fRoot	TokenNameIdentifier	 f Root
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
accept	TokenNameIdentifier	 accept
=	TokenNameEQUAL	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
accept	TokenNameIdentifier	 accept
==	TokenNameEQUAL_EQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
)	TokenNameRPAREN	
return	TokenNamereturn	
newNode	TokenNameIdentifier	 new Node
;	TokenNameSEMICOLON	
else	TokenNameelse	
//if (accept == NodeFilter.SKIP_NODE) // and REJECT too. 	TokenNameCOMMENT_LINE	if (accept == NodeFilter.SKIP_NODE) // and REJECT too. 
{	TokenNameLBRACE	
return	TokenNamereturn	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Internal function. * Return the nextSibling Node, from the input node * after applying filter, whatToshow. * The current node is not consulted or set. */	TokenNameCOMMENT_JAVADOC	 Internal function. Return the nextSibling Node, from the input node after applying filter, whatToshow. The current node is not consulted or set. 
Node	TokenNameIdentifier	 Node
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
fRoot	TokenNameIdentifier	 f Root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Internal function. * Return the nextSibling Node, from the input node * after applying filter, whatToshow. * NEVER TRAVERSES ABOVE THE SPECIFIED ROOT NODE. * The current node is not consulted or set. */	TokenNameCOMMENT_JAVADOC	 Internal function. Return the nextSibling Node, from the input node after applying filter, whatToshow. NEVER TRAVERSES ABOVE THE SPECIFIED ROOT NODE. The current node is not consulted or set. 
Node	TokenNameIdentifier	 Node
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
isSameNode	TokenNameIdentifier	 is Same Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newNode	TokenNameIdentifier	 new Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
isSameNode	TokenNameIdentifier	 is Same Node
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
parentAccept	TokenNameIdentifier	 parent Accept
=	TokenNameEQUAL	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parentAccept	TokenNameIdentifier	 parent Accept
==	TokenNameEQUAL_EQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
accept	TokenNameIdentifier	 accept
=	TokenNameEQUAL	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
accept	TokenNameIdentifier	 accept
==	TokenNameEQUAL_EQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
)	TokenNameRPAREN	
return	TokenNamereturn	
newNode	TokenNameIdentifier	 new Node
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
accept	TokenNameIdentifier	 accept
==	TokenNameEQUAL_EQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
fChild	TokenNameIdentifier	 f Child
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fChild	TokenNameIdentifier	 f Child
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fChild	TokenNameIdentifier	 f Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
//if (accept == NodeFilter.REJECT_NODE) 	TokenNameCOMMENT_LINE	if (accept == NodeFilter.REJECT_NODE) 
{	TokenNameLBRACE	
return	TokenNamereturn	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// getNextSibling(Node node) { 	TokenNameCOMMENT_LINE	getNextSibling(Node node) { 
/** Internal function. * Return the previous sibling Node, from the input node * after applying filter, whatToshow. * The current node is not consulted or set. */	TokenNameCOMMENT_JAVADOC	 Internal function. Return the previous sibling Node, from the input node after applying filter, whatToshow. The current node is not consulted or set. 
Node	TokenNameIdentifier	 Node
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
fRoot	TokenNameIdentifier	 f Root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Internal function. * Return the previousSibling Node, from the input node * after applying filter, whatToshow. * NEVER TRAVERSES ABOVE THE SPECIFIED ROOT NODE. * The current node is not consulted or set. */	TokenNameCOMMENT_JAVADOC	 Internal function. Return the previousSibling Node, from the input node after applying filter, whatToshow. NEVER TRAVERSES ABOVE THE SPECIFIED ROOT NODE. The current node is not consulted or set. 
Node	TokenNameIdentifier	 Node
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
isSameNode	TokenNameIdentifier	 is Same Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newNode	TokenNameIdentifier	 new Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
isSameNode	TokenNameIdentifier	 is Same Node
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
parentAccept	TokenNameIdentifier	 parent Accept
=	TokenNameEQUAL	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parentAccept	TokenNameIdentifier	 parent Accept
==	TokenNameEQUAL_EQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
accept	TokenNameIdentifier	 accept
=	TokenNameEQUAL	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
accept	TokenNameIdentifier	 accept
==	TokenNameEQUAL_EQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
)	TokenNameRPAREN	
return	TokenNamereturn	
newNode	TokenNameIdentifier	 new Node
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
accept	TokenNameIdentifier	 accept
==	TokenNameEQUAL_EQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
fChild	TokenNameIdentifier	 f Child
=	TokenNameEQUAL	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fChild	TokenNameIdentifier	 f Child
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fChild	TokenNameIdentifier	 f Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
//if (accept == NodeFilter.REJECT_NODE) 	TokenNameCOMMENT_LINE	if (accept == NodeFilter.REJECT_NODE) 
{	TokenNameLBRACE	
return	TokenNamereturn	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// getPreviousSibling(Node node) { 	TokenNameCOMMENT_LINE	getPreviousSibling(Node node) { 
/** Internal function. * Return the first child Node, from the input node * after applying filter, whatToshow. * The current node is not consulted or set. */	TokenNameCOMMENT_JAVADOC	 Internal function. Return the first child Node, from the input node after applying filter, whatToshow. The current node is not consulted or set. 
Node	TokenNameIdentifier	 Node
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fEntityReferenceExpansion	TokenNameIdentifier	 f Entity Reference Expansion
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
accept	TokenNameIdentifier	 accept
=	TokenNameEQUAL	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
accept	TokenNameIdentifier	 accept
==	TokenNameEQUAL_EQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
)	TokenNameRPAREN	
return	TokenNamereturn	
newNode	TokenNameIdentifier	 new Node
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
accept	TokenNameIdentifier	 accept
==	TokenNameEQUAL_EQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
&&	TokenNameAND_AND	
newNode	TokenNameIdentifier	 new Node
.	TokenNameDOT	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
fChild	TokenNameIdentifier	 f Child
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fChild	TokenNameIdentifier	 f Child
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fChild	TokenNameIdentifier	 f Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
//if (accept == NodeFilter.REJECT_NODE) 	TokenNameCOMMENT_LINE	if (accept == NodeFilter.REJECT_NODE) 
{	TokenNameLBRACE	
return	TokenNamereturn	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Internal function. * Return the last child Node, from the input node * after applying filter, whatToshow. * The current node is not consulted or set. */	TokenNameCOMMENT_JAVADOC	 Internal function. Return the last child Node, from the input node after applying filter, whatToshow. The current node is not consulted or set. 
Node	TokenNameIdentifier	 Node
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fEntityReferenceExpansion	TokenNameIdentifier	 f Entity Reference Expansion
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
accept	TokenNameIdentifier	 accept
=	TokenNameEQUAL	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
accept	TokenNameIdentifier	 accept
==	TokenNameEQUAL_EQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
)	TokenNameRPAREN	
return	TokenNamereturn	
newNode	TokenNameIdentifier	 new Node
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
accept	TokenNameIdentifier	 accept
==	TokenNameEQUAL_EQUAL	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
&&	TokenNameAND_AND	
newNode	TokenNameIdentifier	 new Node
.	TokenNameDOT	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
lChild	TokenNameIdentifier	 l Child
=	TokenNameEQUAL	
getLastChild	TokenNameIdentifier	 get Last Child
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lChild	TokenNameIdentifier	 l Child
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
lChild	TokenNameIdentifier	 l Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
//if (accept == NodeFilter.REJECT_NODE) 	TokenNameCOMMENT_LINE	if (accept == NodeFilter.REJECT_NODE) 
{	TokenNameLBRACE	
return	TokenNamereturn	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Internal function. * The node whatToShow and the filter are combined into one result. */	TokenNameCOMMENT_JAVADOC	 Internal function. The node whatToShow and the filter are combined into one result. 
short	TokenNameshort	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*** 7.1.2.4. Filters and whatToShow flags Iterator and TreeWalker apply whatToShow flags before applying Filters. If a node is rejected by the active whatToShow flags, a Filter will not be called to evaluate that node. When a node is rejected by the active whatToShow flags, children of that node will still be considered, and Filters may be called to evaluate them. ***/	TokenNameCOMMENT_JAVADOC	* 7.1.2.4. Filters and whatToShow flags Iterator and TreeWalker apply whatToShow flags before applying Filters. If a node is rejected by the active whatToShow flags, a Filter will not be called to evaluate that node. When a node is rejected by the active whatToShow flags, children of that node will still be considered, and Filters may be called to evaluate them. **
if	TokenNameif	
(	TokenNameLPAREN	
fNodeFilter	TokenNameIdentifier	 f Node Filter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fWhatToShow	TokenNameIdentifier	 f What To Show
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
node	TokenNameIdentifier	 node
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
return	TokenNamereturn	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
;	TokenNameSEMICOLON	
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
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fWhatToShow	TokenNameIdentifier	 f What To Show
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
node	TokenNameIdentifier	 node
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
return	TokenNamereturn	
fNodeFilter	TokenNameIdentifier	 f Node Filter
.	TokenNameDOT	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// What to show has failed. See above excerpt from spec. 	TokenNameCOMMENT_LINE	What to show has failed. See above excerpt from spec. 
// Equivalent to FILTER_SKIP. 	TokenNameCOMMENT_LINE	Equivalent to FILTER_SKIP. 
return	TokenNamereturn	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Use isSameNode() for testing node identity if the DOM implementation * supports DOM Level 3 core and it isn't the Xerces implementation. */	TokenNameCOMMENT_JAVADOC	 Use isSameNode() for testing node identity if the DOM implementation supports DOM Level 3 core and it isn't the Xerces implementation. 
private	TokenNameprivate	
boolean	TokenNameboolean	
useIsSameNode	TokenNameIdentifier	 use Is Same Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
NodeImpl	TokenNameIdentifier	 Node Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
?	TokenNameQUESTION	
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
:	TokenNameCOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hasFeature	TokenNameIdentifier	 has Feature
(	TokenNameLPAREN	
"Core"	TokenNameStringLiteral	Core
,	TokenNameCOMMA	
"3.0"	TokenNameStringLiteral	3.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if <code>m</code> is the same node <code>n</code>. */	TokenNameCOMMENT_JAVADOC	 Returns true if <code>m</code> is the same node <code>n</code>. 
private	TokenNameprivate	
boolean	TokenNameboolean	
isSameNode	TokenNameIdentifier	 is Same Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fUseIsSameNode	TokenNameIdentifier	 f Use Is Same Node
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
isSameNode	TokenNameIdentifier	 is Same Node
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
:	TokenNameCOLON	
m	TokenNameIdentifier	 m
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
