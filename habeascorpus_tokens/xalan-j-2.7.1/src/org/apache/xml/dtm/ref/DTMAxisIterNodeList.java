/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMAxisIterNodeList.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMAxisIterNodeList.java 468653 2006-10-28 07:07:05Z minchau $ 
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
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
IntVector	TokenNameIdentifier	 Int Vector
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
/** * <code>DTMAxisNodeList</code> gives us an implementation of the DOM's * NodeList interface wrapped around a DTM Iterator. The author * considers this something of an abominations, since NodeList was not * intended to be a general purpose "list of nodes" API and is * generally considered by the DOM WG to have be a mistake... but I'm * told that some of the XPath/XSLT folks say they must have this * solution. * * Please note that this is not necessarily equivlaent to a DOM * NodeList operating over the same document. In particular: * <ul> * * <li>If there are several Text nodes in logical succession (ie, * across CDATASection and EntityReference boundaries), we will return * only the first; the caller is responsible for stepping through * them. * (%REVIEW% Provide a convenience routine here to assist, pending * proposed DOM Level 3 getAdjacentText() operation?) </li> * * <li>Since the whole XPath/XSLT architecture assumes that the source * document is not altered while we're working with it, we do not * promise to implement the DOM NodeList's "live view" response to * document mutation. </li> * * </ul> * * <p>State: In progress!!</p> * */	TokenNameCOMMENT_JAVADOC	 <code>DTMAxisNodeList</code> gives us an implementation of the DOM's NodeList interface wrapped around a DTM Iterator. The author considers this something of an abominations, since NodeList was not intended to be a general purpose "list of nodes" API and is generally considered by the DOM WG to have be a mistake... but I'm told that some of the XPath/XSLT folks say they must have this solution. * Please note that this is not necessarily equivlaent to a DOM NodeList operating over the same document. In particular: <ul> * <li>If there are several Text nodes in logical succession (ie, across CDATASection and EntityReference boundaries), we will return only the first; the caller is responsible for stepping through them. (%REVIEW% Provide a convenience routine here to assist, pending proposed DOM Level 3 getAdjacentText() operation?) </li> * <li>Since the whole XPath/XSLT architecture assumes that the source document is not altered while we're working with it, we do not promise to implement the DOM NodeList's "live view" response to document mutation. </li> * </ul> * <p>State: In progress!!</p> 
public	TokenNamepublic	
class	TokenNameclass	
DTMAxisIterNodeList	TokenNameIdentifier	 DTM Axis Iter Node List
extends	TokenNameextends	
DTMNodeListBase	TokenNameIdentifier	 DTM Node List Base
{	TokenNameLBRACE	
private	TokenNameprivate	
DTM	TokenNameIdentifier	 DTM
m_dtm	TokenNameIdentifier	 m dtm
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
m_iter	TokenNameIdentifier	 m iter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IntVector	TokenNameIdentifier	 Int Vector
m_cachedNodes	TokenNameIdentifier	 m cached Nodes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
// Methods unique to this class 	TokenNameCOMMENT_LINE	Methods unique to this class 
private	TokenNameprivate	
DTMAxisIterNodeList	TokenNameIdentifier	 DTM Axis Iter Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Public constructor: Wrap a DTMNodeList around an existing * and preconfigured DTMAxisIterator */	TokenNameCOMMENT_JAVADOC	 Public constructor: Wrap a DTMNodeList around an existing and preconfigured DTMAxisIterator 
public	TokenNamepublic	
DTMAxisIterNodeList	TokenNameIdentifier	 DTM Axis Iter Node List
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
dtmAxisIterator	TokenNameIdentifier	 dtm Axis Iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dtmAxisIterator	TokenNameIdentifier	 dtm Axis Iterator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_cachedNodes	TokenNameIdentifier	 m cached Nodes
=	TokenNameEQUAL	
new	TokenNamenew	
IntVector	TokenNameIdentifier	 Int Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_dtm	TokenNameIdentifier	 m dtm
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_iter	TokenNameIdentifier	 m iter
=	TokenNameEQUAL	
dtmAxisIterator	TokenNameIdentifier	 dtm Axis Iterator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Access the wrapped DTMIterator. I'm not sure whether anyone will * need this or not, but let's write it and think about it. * */	TokenNameCOMMENT_JAVADOC	 Access the wrapped DTMIterator. I'm not sure whether anyone will need this or not, but let's write it and think about it. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getDTMAxisIterator	TokenNameIdentifier	 get DTM Axis Iterator
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
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
m_cachedNodes	TokenNameIdentifier	 m cached Nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
m_cachedNodes	TokenNameIdentifier	 m cached Nodes
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_last	TokenNameIdentifier	 m last
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
.	TokenNameDOT	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
count	TokenNameIdentifier	 count
<=	TokenNameLESS_EQUAL	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_cachedNodes	TokenNameIdentifier	 m cached Nodes
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
.	TokenNameDOT	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The number of nodes in the list. The range of valid child node indices * is 0 to <code>length-1</code> inclusive. */	TokenNameCOMMENT_JAVADOC	 The number of nodes in the list. The range of valid child node indices is 0 to <code>length-1</code> inclusive. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_last	TokenNameIdentifier	 m last
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
.	TokenNameDOT	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_cachedNodes	TokenNameIdentifier	 m cached Nodes
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
m_cachedNodes	TokenNameIdentifier	 m cached Nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_last	TokenNameIdentifier	 m last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
