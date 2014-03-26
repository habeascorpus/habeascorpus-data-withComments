/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMChildIterNodeList.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMChildIterNodeList.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
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
/** * <code>DTMNodeList</code> gives us an implementation of the DOM's * NodeList interface wrapped around a DTM Iterator. The author * considers this something of an abominations, since NodeList was not * intended to be a general purpose "list of nodes" API and is * generally considered by the DOM WG to have be a mistake... but I'm * told that some of the XPath/XSLT folks say they must have this * solution. * * Please note that this is not necessarily equivlaent to a DOM * NodeList operating over the same document. In particular: * <ul> * * <li>If there are several Text nodes in logical succession (ie, * across CDATASection and EntityReference boundaries), we will return * only the first; the caller is responsible for stepping through * them. * (%REVIEW% Provide a convenience routine here to assist, pending * proposed DOM Level 3 getAdjacentText() operation?) </li> * * <li>Since the whole XPath/XSLT architecture assumes that the source * document is not altered while we're working with it, we do not * promise to implement the DOM NodeList's "live view" response to * document mutation. </li> * * </ul> * * <p>State: In progress!!</p> * */	TokenNameCOMMENT_JAVADOC	 <code>DTMNodeList</code> gives us an implementation of the DOM's NodeList interface wrapped around a DTM Iterator. The author considers this something of an abominations, since NodeList was not intended to be a general purpose "list of nodes" API and is generally considered by the DOM WG to have be a mistake... but I'm told that some of the XPath/XSLT folks say they must have this solution. * Please note that this is not necessarily equivlaent to a DOM NodeList operating over the same document. In particular: <ul> * <li>If there are several Text nodes in logical succession (ie, across CDATASection and EntityReference boundaries), we will return only the first; the caller is responsible for stepping through them. (%REVIEW% Provide a convenience routine here to assist, pending proposed DOM Level 3 getAdjacentText() operation?) </li> * <li>Since the whole XPath/XSLT architecture assumes that the source document is not altered while we're working with it, we do not promise to implement the DOM NodeList's "live view" response to document mutation. </li> * </ul> * <p>State: In progress!!</p> 
public	TokenNamepublic	
class	TokenNameclass	
DTMChildIterNodeList	TokenNameIdentifier	 DTM Child Iter Node List
extends	TokenNameextends	
DTMNodeListBase	TokenNameIdentifier	 DTM Node List Base
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
m_firstChild	TokenNameIdentifier	 m first Child
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DTM	TokenNameIdentifier	 DTM
m_parentDTM	TokenNameIdentifier	 m parent DTM
;	TokenNameSEMICOLON	
//================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
// Methods unique to this class 	TokenNameCOMMENT_LINE	Methods unique to this class 
private	TokenNameprivate	
DTMChildIterNodeList	TokenNameIdentifier	 DTM Child Iter Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Public constructor: Create a NodeList to support * DTMNodeProxy.getChildren(). * * Unfortunately AxisIterators and DTMIterators don't share an API, * so I can't use the existing Axis.CHILD iterator. Rather than * create Yet Another Class, let's set up a special case of this * one. * * @param parentDTM The DTM containing this node * @param parentHandle DTM node-handle integer * */	TokenNameCOMMENT_JAVADOC	 Public constructor: Create a NodeList to support DTMNodeProxy.getChildren(). * Unfortunately AxisIterators and DTMIterators don't share an API, so I can't use the existing Axis.CHILD iterator. Rather than create Yet Another Class, let's set up a special case of this one. * @param parentDTM The DTM containing this node @param parentHandle DTM node-handle integer 
public	TokenNamepublic	
DTMChildIterNodeList	TokenNameIdentifier	 DTM Child Iter Node List
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
parentDTM	TokenNameIdentifier	 parent DTM
,	TokenNameCOMMA	
int	TokenNameint	
parentHandle	TokenNameIdentifier	 parent Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_parentDTM	TokenNameIdentifier	 m parent DTM
=	TokenNameEQUAL	
parentDTM	TokenNameIdentifier	 parent DTM
;	TokenNameSEMICOLON	
m_firstChild	TokenNameIdentifier	 m first Child
=	TokenNameEQUAL	
parentDTM	TokenNameIdentifier	 parent DTM
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
parentHandle	TokenNameIdentifier	 parent Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
// org.w3c.dom.NodeList API follows 	TokenNameCOMMENT_LINE	org.w3c.dom.NodeList API follows 
/** * Returns the <code>index</code>th item in the collection. If * <code>index</code> is greater than or equal to the number of nodes in * the list, this returns <code>null</code>. * @param index Index into the collection. * @return The node at the <code>index</code>th position in the * <code>NodeList</code>, or <code>null</code> if that is not a valid * index. */	TokenNameCOMMENT_JAVADOC	 Returns the <code>index</code>th item in the collection. If <code>index</code> is greater than or equal to the number of nodes in the list, this returns <code>null</code>. @param index Index into the collection. @return The node at the <code>index</code>th position in the <code>NodeList</code>, or <code>null</code> if that is not a valid index. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
handle	TokenNameIdentifier	 handle
=	TokenNameEQUAL	
m_firstChild	TokenNameIdentifier	 m first Child
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
handle	TokenNameIdentifier	 handle
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handle	TokenNameIdentifier	 handle
=	TokenNameEQUAL	
m_parentDTM	TokenNameIdentifier	 m parent DTM
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_parentDTM	TokenNameIdentifier	 m parent DTM
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The number of nodes in the list. The range of valid child node indices * is 0 to <code>length-1</code> inclusive. */	TokenNameCOMMENT_JAVADOC	 The number of nodes in the list. The range of valid child node indices is 0 to <code>length-1</code> inclusive. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
handle	TokenNameIdentifier	 handle
=	TokenNameEQUAL	
m_firstChild	TokenNameIdentifier	 m first Child
;	TokenNameSEMICOLON	
handle	TokenNameIdentifier	 handle
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
handle	TokenNameIdentifier	 handle
=	TokenNameEQUAL	
m_parentDTM	TokenNameIdentifier	 m parent DTM
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
