/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMNodeList.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMNodeList.java 468653 2006-10-28 07:07:05Z minchau $ 
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMIterator	TokenNameIdentifier	 DTM Iterator
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
DTMNodeList	TokenNameIdentifier	 DTM Node List
extends	TokenNameextends	
DTMNodeListBase	TokenNameIdentifier	 DTM Node List Base
{	TokenNameLBRACE	
private	TokenNameprivate	
DTMIterator	TokenNameIdentifier	 DTM Iterator
m_iter	TokenNameIdentifier	 m iter
;	TokenNameSEMICOLON	
//================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
// Methods unique to this class 	TokenNameCOMMENT_LINE	Methods unique to this class 
private	TokenNameprivate	
DTMNodeList	TokenNameIdentifier	 DTM Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Public constructor: Wrap a DTMNodeList around an existing * and preconfigured DTMIterator * * WARNING: THIS HAS THE SIDE EFFECT OF ISSUING setShouldCacheNodes(true) * AGAINST THE DTMIterator. * */	TokenNameCOMMENT_JAVADOC	 Public constructor: Wrap a DTMNodeList around an existing and preconfigured DTMIterator * WARNING: THIS HAS THE SIDE EFFECT OF ISSUING setShouldCacheNodes(true) AGAINST THE DTMIterator. 
public	TokenNamepublic	
DTMNodeList	TokenNameIdentifier	 DTM Node List
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
dtmIterator	TokenNameIdentifier	 dtm Iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dtmIterator	TokenNameIdentifier	 dtm Iterator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
dtmIterator	TokenNameIdentifier	 dtm Iterator
.	TokenNameDOT	
getCurrentPos	TokenNameIdentifier	 get Current Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
m_iter	TokenNameIdentifier	 m iter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
dtmIterator	TokenNameIdentifier	 dtm Iterator
.	TokenNameDOT	
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_iter	TokenNameIdentifier	 m iter
=	TokenNameEQUAL	
dtmIterator	TokenNameIdentifier	 dtm Iterator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
setCurrentPos	TokenNameIdentifier	 set Current Pos
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Access the wrapped DTMIterator. I'm not sure whether anyone will * need this or not, but let's write it and think about it. * */	TokenNameCOMMENT_JAVADOC	 Access the wrapped DTMIterator. I'm not sure whether anyone will need this or not, but let's write it and think about it. 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
getDTMIterator	TokenNameIdentifier	 get DTM Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_iter	TokenNameIdentifier	 m iter
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
if	TokenNameif	
(	TokenNameLPAREN	
m_iter	TokenNameIdentifier	 m iter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
handle	TokenNameIdentifier	 handle
=	TokenNameEQUAL	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The number of nodes in the list. The range of valid child node indices * is 0 to <code>length-1</code> inclusive. */	TokenNameCOMMENT_JAVADOC	 The number of nodes in the list. The range of valid child node indices is 0 to <code>length-1</code> inclusive. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_iter	TokenNameIdentifier	 m iter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
