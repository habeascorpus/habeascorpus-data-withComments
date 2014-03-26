/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NodeSetDTM.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NodeSetDTM.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
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
DTMFilter	TokenNameIdentifier	 DTM Filter
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMManager	TokenNameIdentifier	 DTM Manager
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
NodeVector	TokenNameIdentifier	 Node Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
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
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeIterator	TokenNameIdentifier	 Node Iterator
;	TokenNameSEMICOLON	
/** * <p>The NodeSetDTM class can act as either a NodeVector, * NodeList, or NodeIterator. However, in order for it to * act as a NodeVector or NodeList, it's required that * setShouldCacheNodes(true) be called before the first * nextNode() is called, in order that nodes can be added * as they are fetched. Derived classes that implement iterators * must override runTo(int index), in order that they may * run the iteration to the given index. </p> * * <p>Note that we directly implement the DOM's NodeIterator * interface. We do not emulate all the behavior of the * standard NodeIterator. In particular, we do not guarantee * to present a "live view" of the document ... but in XSLT, * the source document should never be mutated, so this should * never be an issue.</p> * * <p>Thought: Should NodeSetDTM really implement NodeList and NodeIterator, * or should there be specific subclasses of it which do so? The * advantage of doing it all here is that all NodeSetDTMs will respond * to the same calls; the disadvantage is that some of them may return * less-than-enlightening results when you do so.</p> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 <p>The NodeSetDTM class can act as either a NodeVector, NodeList, or NodeIterator. However, in order for it to act as a NodeVector or NodeList, it's required that setShouldCacheNodes(true) be called before the first nextNode() is called, in order that nodes can be added as they are fetched. Derived classes that implement iterators must override runTo(int index), in order that they may run the iteration to the given index. </p> * <p>Note that we directly implement the DOM's NodeIterator interface. We do not emulate all the behavior of the standard NodeIterator. In particular, we do not guarantee to present a "live view" of the document ... but in XSLT, the source document should never be mutated, so this should never be an issue.</p> * <p>Thought: Should NodeSetDTM really implement NodeList and NodeIterator, or should there be specific subclasses of it which do so? The advantage of doing it all here is that all NodeSetDTMs will respond to the same calls; the disadvantage is that some of them may return less-than-enlightening results when you do so.</p> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
extends	TokenNameextends	
NodeVector	TokenNameIdentifier	 Node Vector
implements	TokenNameimplements	
/* NodeList, NodeIterator, */	TokenNameCOMMENT_BLOCK	 NodeList, NodeIterator, 
DTMIterator	TokenNameIdentifier	 DTM Iterator
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
7686480133331317070L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Create an empty nodelist. */	TokenNameCOMMENT_JAVADOC	 Create an empty nodelist. 
public	TokenNamepublic	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
(	TokenNameLPAREN	
DTMManager	TokenNameIdentifier	 DTM Manager
dtmManager	TokenNameIdentifier	 dtm Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_manager	TokenNameIdentifier	 m manager
=	TokenNameEQUAL	
dtmManager	TokenNameIdentifier	 dtm Manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an empty, using the given block size. * * @param blocksize Size of blocks to allocate * @param dummy pass zero for right now... */	TokenNameCOMMENT_JAVADOC	 Create an empty, using the given block size. * @param blocksize Size of blocks to allocate @param dummy pass zero for right now... 
public	TokenNamepublic	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
(	TokenNameLPAREN	
int	TokenNameint	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
int	TokenNameint	
dummy	TokenNameIdentifier	 dummy
,	TokenNameCOMMA	
DTMManager	TokenNameIdentifier	 DTM Manager
dtmManager	TokenNameIdentifier	 dtm Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
blocksize	TokenNameIdentifier	 blocksize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_manager	TokenNameIdentifier	 m manager
=	TokenNameEQUAL	
dtmManager	TokenNameIdentifier	 dtm Manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// %TBD% 	TokenNameCOMMENT_LINE	%TBD% 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Create a NodeSetDTM, and copy the members of the 	TokenNameCOMMENT_LINE	* Create a NodeSetDTM, and copy the members of the 
// * given nodelist into it. 	TokenNameCOMMENT_LINE	* given nodelist into it. 
// * 	TokenNameCOMMENT_LINE	* 
// * @param nodelist List of Nodes to be made members of the new set. 	TokenNameCOMMENT_LINE	* @param nodelist List of Nodes to be made members of the new set. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public NodeSetDTM(NodeList nodelist) 	TokenNameCOMMENT_LINE	public NodeSetDTM(NodeList nodelist) 
// { 	TokenNameCOMMENT_LINE	{ 
// 	TokenNameCOMMENT_LINE	 
// super(); 	TokenNameCOMMENT_LINE	super(); 
// 	TokenNameCOMMENT_LINE	 
// addNodes(nodelist); 	TokenNameCOMMENT_LINE	addNodes(nodelist); 
// } 	TokenNameCOMMENT_LINE	} 
/** * Create a NodeSetDTM, and copy the members of the * given NodeSetDTM into it. * * @param nodelist Set of Nodes to be made members of the new set. */	TokenNameCOMMENT_JAVADOC	 Create a NodeSetDTM, and copy the members of the given NodeSetDTM into it. * @param nodelist Set of Nodes to be made members of the new set. 
public	TokenNamepublic	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
(	TokenNameLPAREN	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
nodelist	TokenNameIdentifier	 nodelist
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_manager	TokenNameIdentifier	 m manager
=	TokenNameEQUAL	
nodelist	TokenNameIdentifier	 nodelist
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_root	TokenNameIdentifier	 m root
=	TokenNameEQUAL	
nodelist	TokenNameIdentifier	 nodelist
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addNodes	TokenNameIdentifier	 add Nodes
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
nodelist	TokenNameIdentifier	 nodelist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a NodeSetDTM, and copy the members of the * given DTMIterator into it. * * @param ni Iterator which yields Nodes to be made members of the new set. */	TokenNameCOMMENT_JAVADOC	 Create a NodeSetDTM, and copy the members of the given DTMIterator into it. * @param ni Iterator which yields Nodes to be made members of the new set. 
public	TokenNamepublic	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
ni	TokenNameIdentifier	 ni
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_manager	TokenNameIdentifier	 m manager
=	TokenNameEQUAL	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_root	TokenNameIdentifier	 m root
=	TokenNameEQUAL	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addNodes	TokenNameIdentifier	 add Nodes
(	TokenNameLPAREN	
ni	TokenNameIdentifier	 ni
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a NodeSetDTM, and copy the members of the * given DTMIterator into it. * * @param iterator Iterator which yields Nodes to be made members of the new set. */	TokenNameCOMMENT_JAVADOC	 Create a NodeSetDTM, and copy the members of the given DTMIterator into it. * @param iterator Iterator which yields Nodes to be made members of the new set. 
public	TokenNamepublic	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
(	TokenNameLPAREN	
NodeIterator	TokenNameIdentifier	 Node Iterator
iterator	TokenNameIdentifier	 iterator
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
m_manager	TokenNameIdentifier	 m manager
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
handle	TokenNameIdentifier	 handle
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTMHandleFromNode	TokenNameIdentifier	 get DTM Handle From Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addNodeInDocOrder	TokenNameIdentifier	 add Node In Doc Order
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a NodeSetDTM, and copy the members of the * given DTMIterator into it. * */	TokenNameCOMMENT_JAVADOC	 Create a NodeSetDTM, and copy the members of the given DTMIterator into it. 
public	TokenNamepublic	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nodeList	TokenNameIdentifier	 node List
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_manager	TokenNameIdentifier	 m manager
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
nodeList	TokenNameIdentifier	 node List
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
nodeList	TokenNameIdentifier	 node List
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
handle	TokenNameIdentifier	 handle
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTMHandleFromNode	TokenNameIdentifier	 get DTM Handle From Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Do not reorder or strip duplicate nodes from the given DOM nodelist 	TokenNameCOMMENT_LINE	Do not reorder or strip duplicate nodes from the given DOM nodelist 
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// addNodeInDocOrder(handle, xctxt); 	TokenNameCOMMENT_LINE	addNodeInDocOrder(handle, xctxt); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a NodeSetDTM which contains the given Node. * * @param node Single node to be added to the new set. */	TokenNameCOMMENT_JAVADOC	 Create a NodeSetDTM which contains the given Node. * @param node Single node to be added to the new set. 
public	TokenNamepublic	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
DTMManager	TokenNameIdentifier	 DTM Manager
dtmManager	TokenNameIdentifier	 dtm Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_manager	TokenNameIdentifier	 m manager
=	TokenNameEQUAL	
dtmManager	TokenNameIdentifier	 dtm Manager
;	TokenNameSEMICOLON	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the environment in which this iterator operates, which should provide: * a node (the context node... same value as "root" defined below) * a pair of non-zero positive integers (the context position and the context size) * a set of variable bindings * a function library * the set of namespace declarations in scope for the expression. * * <p>At this time the exact implementation of this environment is application * dependent. Probably a proper interface will be created fairly soon.</p> * * @param environment The environment object. */	TokenNameCOMMENT_JAVADOC	 Set the environment in which this iterator operates, which should provide: a node (the context node... same value as "root" defined below) a pair of non-zero positive integers (the context position and the context size) a set of variable bindings a function library the set of namespace declarations in scope for the expression. * <p>At this time the exact implementation of this environment is application dependent. Probably a proper interface will be created fairly soon.</p> * @param environment The environment object. 
public	TokenNamepublic	
void	TokenNamevoid	
setEnvironment	TokenNameIdentifier	 set Environment
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
environment	TokenNameIdentifier	 environment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no-op 	TokenNameCOMMENT_LINE	no-op 
}	TokenNameRBRACE	
/** * @return The root node of the Iterator, as specified when it was created. * For non-Iterator NodeSetDTMs, this will be null. */	TokenNameCOMMENT_JAVADOC	 @return The root node of the Iterator, as specified when it was created. For non-Iterator NodeSetDTMs, this will be null. 
public	TokenNamepublic	
int	TokenNameint	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
m_root	TokenNameIdentifier	 m root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
m_root	TokenNameIdentifier	 m root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize the context values for this expression * after it is cloned. * * @param context The XPath runtime context for this * transformation. */	TokenNameCOMMENT_JAVADOC	 Initialize the context values for this expression after it is cloned. * @param context The XPath runtime context for this transformation. 
public	TokenNamepublic	
void	TokenNamevoid	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
environment	TokenNameIdentifier	 environment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no-op, I guess... (-sb) 	TokenNameCOMMENT_LINE	no-op, I guess... (-sb) 
}	TokenNameRBRACE	
/** * Clone this NodeSetDTM. * At this time, we only expect this to be used with LocPathIterators; * it may not work with other kinds of NodeSetDTMs. * * @return a new NodeSetDTM of the same type, having the same state... * though unless overridden in the subclasses, it may not copy all * the state information. * * @throws CloneNotSupportedException if this subclass of NodeSetDTM * does not support the clone() operation. */	TokenNameCOMMENT_JAVADOC	 Clone this NodeSetDTM. At this time, we only expect this to be used with LocPathIterators; it may not work with other kinds of NodeSetDTMs. * @return a new NodeSetDTM of the same type, having the same state... though unless overridden in the subclasses, it may not copy all the state information. * @throws CloneNotSupportedException if this subclass of NodeSetDTM does not support the clone() operation. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a cloned Iterator, and reset its state to the beginning of the * iteration. * * @return a new NodeSetDTM of the same type, having the same state... * except that the reset() operation has been called. * * @throws CloneNotSupportedException if this subclass of NodeSetDTM * does not support the clone() operation. */	TokenNameCOMMENT_JAVADOC	 Get a cloned Iterator, and reset its state to the beginning of the iteration. * @return a new NodeSetDTM of the same type, having the same state... except that the reset() operation has been called. * @throws CloneNotSupportedException if this subclass of NodeSetDTM does not support the clone() operation. 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
)	TokenNameRPAREN	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset the iterator. May have no effect on non-iterator Nodesets. */	TokenNameCOMMENT_JAVADOC	 Reset the iterator. May have no effect on non-iterator Nodesets. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This attribute determines which node types are presented via the * iterator. The available set of constants is defined in the * <code>DTMFilter</code> interface. For NodeSetDTMs, the mask has been * hardcoded to show all nodes except EntityReference nodes, which have * no equivalent in the XPath data model. * * @return integer used as a bit-array, containing flags defined in * the DOM's DTMFilter class. The value will be * <code>SHOW_ALL & ~SHOW_ENTITY_REFERENCE</code>, meaning that * only entity references are suppressed. */	TokenNameCOMMENT_JAVADOC	 This attribute determines which node types are presented via the iterator. The available set of constants is defined in the <code>DTMFilter</code> interface. For NodeSetDTMs, the mask has been hardcoded to show all nodes except EntityReference nodes, which have no equivalent in the XPath data model. * @return integer used as a bit-array, containing flags defined in the DOM's DTMFilter class. The value will be <code>SHOW_ALL & ~SHOW_ENTITY_REFERENCE</code>, meaning that only entity references are suppressed. 
public	TokenNamepublic	
int	TokenNameint	
getWhatToShow	TokenNameIdentifier	 get What To Show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
&	TokenNameAND	
~	TokenNameTWIDDLE	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ENTITY_REFERENCE	TokenNameIdentifier	 SHOW  ENTITY  REFERENCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The filter object used to screen nodes. Filters are applied to * further reduce (and restructure) the DTMIterator's view of the * document. In our case, we will be using hardcoded filters built * into our iterators... but getFilter() is part of the DOM's * DTMIterator interface, so we have to support it. * * @return null, which is slightly misleading. True, there is no * user-written filter object, but in fact we are doing some very * sophisticated custom filtering. A DOM purist might suggest * returning a placeholder object just to indicate that this is * not going to return all nodes selected by whatToShow. */	TokenNameCOMMENT_JAVADOC	 The filter object used to screen nodes. Filters are applied to further reduce (and restructure) the DTMIterator's view of the document. In our case, we will be using hardcoded filters built into our iterators... but getFilter() is part of the DOM's DTMIterator interface, so we have to support it. * @return null, which is slightly misleading. True, there is no user-written filter object, but in fact we are doing some very sophisticated custom filtering. A DOM purist might suggest returning a placeholder object just to indicate that this is not going to return all nodes selected by whatToShow. 
public	TokenNamepublic	
DTMFilter	TokenNameIdentifier	 DTM Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The value of this flag determines whether the children of entity * reference nodes are visible to the iterator. If false, they will be * skipped over. * <br> To produce a view of the document that has entity references * expanded and does not expose the entity reference node itself, use the * whatToShow flags to hide the entity reference node and set * expandEntityReferences to true when creating the iterator. To produce * a view of the document that has entity reference nodes but no entity * expansion, use the whatToShow flags to show the entity reference node * and set expandEntityReferences to false. * * @return true for all iterators based on NodeSetDTM, meaning that the * contents of EntityRefrence nodes may be returned (though whatToShow * says that the EntityReferences themselves are not shown.) */	TokenNameCOMMENT_JAVADOC	 The value of this flag determines whether the children of entity reference nodes are visible to the iterator. If false, they will be skipped over. <br> To produce a view of the document that has entity references expanded and does not expose the entity reference node itself, use the whatToShow flags to hide the entity reference node and set expandEntityReferences to true when creating the iterator. To produce a view of the document that has entity reference nodes but no entity expansion, use the whatToShow flags to show the entity reference node and set expandEntityReferences to false. * @return true for all iterators based on NodeSetDTM, meaning that the contents of EntityRefrence nodes may be returned (though whatToShow says that the EntityReferences themselves are not shown.) 
public	TokenNamepublic	
boolean	TokenNameboolean	
getExpandEntityReferences	TokenNameIdentifier	 get Expand Entity References
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an instance of a DTM that "owns" a node handle. Since a node * iterator may be passed without a DTMManager, this allows the * caller to easily get the DTM using just the iterator. * * @param nodeHandle the nodeHandle. * * @return a non-null DTM reference. */	TokenNameCOMMENT_JAVADOC	 Get an instance of a DTM that "owns" a node handle. Since a node iterator may be passed without a DTMManager, this allows the caller to easily get the DTM using just the iterator. * @param nodeHandle the nodeHandle. * @return a non-null DTM reference. 
public	TokenNamepublic	
DTM	TokenNameIdentifier	 DTM
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_manager	TokenNameIdentifier	 m manager
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* An instance of the DTMManager. */	TokenNameCOMMENT_BLOCK	 An instance of the DTMManager. 
DTMManager	TokenNameIdentifier	 DTM Manager
m_manager	TokenNameIdentifier	 m manager
;	TokenNameSEMICOLON	
/** * Get an instance of the DTMManager. Since a node * iterator may be passed without a DTMManager, this allows the * caller to easily get the DTMManager using just the iterator. * * @return a non-null DTMManager reference. */	TokenNameCOMMENT_JAVADOC	 Get an instance of the DTMManager. Since a node iterator may be passed without a DTMManager, this allows the caller to easily get the DTMManager using just the iterator. * @return a non-null DTMManager reference. 
public	TokenNamepublic	
DTMManager	TokenNameIdentifier	 DTM Manager
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_manager	TokenNameIdentifier	 m manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next node in the set and advances the position of the * iterator in the set. After a DTMIterator is created, the first call * to nextNode() returns the first node in the set. * @return The next <code>Node</code> in the set being iterated over, or * <code>DTM.NULL</code> if there are no more members in that set. * @throws DOMException * INVALID_STATE_ERR: Raised if this method is called after the * <code>detach</code> method was invoked. */	TokenNameCOMMENT_JAVADOC	 Returns the next node in the set and advances the position of the iterator in the set. After a DTMIterator is created, the first call to nextNode() returns the first node in the set. @return The next <code>Node</code> in the set being iterated over, or <code>DTM.NULL</code> if there are no more members in that set. @throws DOMException INVALID_STATE_ERR: Raised if this method is called after the <code>detach</code> method was invoked. 
public	TokenNamepublic	
int	TokenNameint	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
)	TokenNameRPAREN	
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_next	TokenNameIdentifier	 m next
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the previous node in the set and moves the position of the * iterator backwards in the set. * @return The previous <code>Node</code> in the set being iterated over, * or<code>DTM.NULL</code> if there are no more members in that set. * @throws DOMException * INVALID_STATE_ERR: Raised if this method is called after the * <code>detach</code> method was invoked. * @throws RuntimeException thrown if this NodeSetDTM is not of * a cached type, and hence doesn't know what the previous node was. */	TokenNameCOMMENT_JAVADOC	 Returns the previous node in the set and moves the position of the iterator backwards in the set. @return The previous <code>Node</code> in the set being iterated over, or<code>DTM.NULL</code> if there are no more members in that set. @throws DOMException INVALID_STATE_ERR: Raised if this method is called after the <code>detach</code> method was invoked. @throws RuntimeException thrown if this NodeSetDTM is not of a cached type, and hence doesn't know what the previous node was. 
public	TokenNamepublic	
int	TokenNameint	
previousNode	TokenNameIdentifier	 previous Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_cacheNodes	TokenNameIdentifier	 m cache Nodes
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_CANNOT_ITERATE	TokenNameIdentifier	 ER  NODESETDTM  CANNOT  ITERATE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM can not iterate to a previous node!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM can not iterate to a previous node!"); 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_next	TokenNameIdentifier	 m next
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Detaches the iterator from the set which it iterated over, releasing * any computational resources and placing the iterator in the INVALID * state. After<code>detach</code> has been invoked, calls to * <code>nextNode</code> or<code>previousNode</code> will raise the * exception INVALID_STATE_ERR. * <p> * This operation is a no-op in NodeSetDTM, and will not cause * INVALID_STATE_ERR to be raised by later operations. * </p> */	TokenNameCOMMENT_JAVADOC	 Detaches the iterator from the set which it iterated over, releasing any computational resources and placing the iterator in the INVALID state. After<code>detach</code> has been invoked, calls to <code>nextNode</code> or<code>previousNode</code> will raise the exception INVALID_STATE_ERR. <p> This operation is a no-op in NodeSetDTM, and will not cause INVALID_STATE_ERR to be raised by later operations. </p> 
public	TokenNamepublic	
void	TokenNamevoid	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Specify if it's OK for detach to release the iterator for reuse. * * @param allowRelease true if it is OK for detach to release this iterator * for pooling. */	TokenNameCOMMENT_JAVADOC	 Specify if it's OK for detach to release the iterator for reuse. * @param allowRelease true if it is OK for detach to release this iterator for pooling. 
public	TokenNamepublic	
void	TokenNamevoid	
allowDetachToRelease	TokenNameIdentifier	 allow Detach To Release
(	TokenNameLPAREN	
boolean	TokenNameboolean	
allowRelease	TokenNameIdentifier	 allow Release
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no action for right now. 	TokenNameCOMMENT_LINE	no action for right now. 
}	TokenNameRBRACE	
/** * Tells if this NodeSetDTM is "fresh", in other words, if * the first nextNode() that is called will return the * first node in the set. * * @return true if nextNode() would return the first node in the set, * false if it would return a later one. */	TokenNameCOMMENT_JAVADOC	 Tells if this NodeSetDTM is "fresh", in other words, if the first nextNode() that is called will return the first node in the set. * @return true if nextNode() would return the first node in the set, false if it would return a later one. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFresh	TokenNameIdentifier	 is Fresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If an index is requested, NodeSetDTM will call this method * to run the iterator to the index. By default this sets * m_next to the index. If the index argument is -1, this * signals that the iterator should be run to the end. * * @param index Position to advance (or retreat) to, with * 0 requesting the reset ("fresh") position and -1 (or indeed * any out-of-bounds value) requesting the final position. * @throws RuntimeException thrown if this NodeSetDTM is not * one of the types which supports indexing/counting. */	TokenNameCOMMENT_JAVADOC	 If an index is requested, NodeSetDTM will call this method to run the iterator to the index. By default this sets m_next to the index. If the index argument is -1, this signals that the iterator should be run to the end. * @param index Position to advance (or retreat) to, with 0 requesting the reset ("fresh") position and -1 (or indeed any out-of-bounds value) requesting the final position. @throws RuntimeException thrown if this NodeSetDTM is not one of the types which supports indexing/counting. 
public	TokenNamepublic	
void	TokenNamevoid	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_cacheNodes	TokenNameIdentifier	 m cache Nodes
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_CANNOT_INDEX	TokenNameIdentifier	 ER  NODESETDTM  CANNOT  INDEX
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM can not do indexing or counting functions!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM can not do indexing or counting functions!"); 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
<	TokenNameLESS	
m_firstFree	TokenNameIdentifier	 m first Free
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the <code>index</code>th item in the collection. If * <code>index</code> is greater than or equal to the number of nodes in * the list, this returns <code>null</code>. * * TODO: What happens if index is out of range? * * @param index Index into the collection. * @return The node at the <code>index</code>th position in the * <code>NodeList</code>, or <code>null</code> if that is not a valid * index. */	TokenNameCOMMENT_JAVADOC	 Returns the <code>index</code>th item in the collection. If <code>index</code> is greater than or equal to the number of nodes in the list, this returns <code>null</code>. * TODO: What happens if index is out of range? * @param index Index into the collection. @return The node at the <code>index</code>th position in the <code>NodeList</code>, or <code>null</code> if that is not a valid index. 
public	TokenNamepublic	
int	TokenNameint	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The number of nodes in the list. The range of valid child node indices is * 0 to <code>length-1</code> inclusive. Note that this operation requires * finding all the matching nodes, which may defeat attempts to defer * that work. * * @return integer indicating how many nodes are represented by this list. */	TokenNameCOMMENT_JAVADOC	 The number of nodes in the list. The range of valid child node indices is 0 to <code>length-1</code> inclusive. Note that this operation requires finding all the matching nodes, which may defeat attempts to defer that work. * @return integer indicating how many nodes are represented by this list. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a node to the NodeSetDTM. Not all types of NodeSetDTMs support this * operation * * @param n Node to be added * @throws RuntimeException thrown if this NodeSetDTM is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Add a node to the NodeSetDTM. Not all types of NodeSetDTMs support this operation * @param n Node to be added @throws RuntimeException thrown if this NodeSetDTM is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM is not mutable!"); 
this	TokenNamethis	
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Insert a node at a given position. * * @param n Node to be added * @param pos Offset at which the node is to be inserted, * with 0 being the first position. * @throws RuntimeException thrown if this NodeSetDTM is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Insert a node at a given position. * @param n Node to be added @param pos Offset at which the node is to be inserted, with 0 being the first position. @throws RuntimeException thrown if this NodeSetDTM is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
insertNode	TokenNameIdentifier	 insert Node
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM is not mutable!"); 
insertElementAt	TokenNameIdentifier	 insert Element At
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove a node. * * @param n Node to be added * @throws RuntimeException thrown if this NodeSetDTM is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Remove a node. * @param n Node to be added @throws RuntimeException thrown if this NodeSetDTM is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
removeNode	TokenNameIdentifier	 remove Node
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM is not mutable!"); 
this	TokenNamethis	
.	TokenNameDOT	
removeElement	TokenNameIdentifier	 remove Element
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// %TBD% 	TokenNameCOMMENT_LINE	%TBD% 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Copy NodeList members into this nodelist, adding in 	TokenNameCOMMENT_LINE	* Copy NodeList members into this nodelist, adding in 
// * document order. If a node is null, don't add it. 	TokenNameCOMMENT_LINE	* document order. If a node is null, don't add it. 
// * 	TokenNameCOMMENT_LINE	* 
// * @param nodelist List of nodes which should now be referenced by 	TokenNameCOMMENT_LINE	* @param nodelist List of nodes which should now be referenced by 
// * this NodeSetDTM. 	TokenNameCOMMENT_LINE	* this NodeSetDTM. 
// * @throws RuntimeException thrown if this NodeSetDTM is not of 	TokenNameCOMMENT_LINE	* @throws RuntimeException thrown if this NodeSetDTM is not of 
// * a mutable type. 	TokenNameCOMMENT_LINE	* a mutable type. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public void addNodes(NodeList nodelist) 	TokenNameCOMMENT_LINE	public void addNodes(NodeList nodelist) 
// { 	TokenNameCOMMENT_LINE	{ 
// 	TokenNameCOMMENT_LINE	 
// if (!m_mutable) 	TokenNameCOMMENT_LINE	if (!m_mutable) 
// throw new RuntimeException("This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	throw new RuntimeException("This NodeSetDTM is not mutable!"); 
// 	TokenNameCOMMENT_LINE	 
// if (null != nodelist) // defensive to fix a bug that Sanjiva reported. 	TokenNameCOMMENT_LINE	if (null != nodelist) // defensive to fix a bug that Sanjiva reported. 
// { 	TokenNameCOMMENT_LINE	{ 
// int nChildren = nodelist.getLength(); 	TokenNameCOMMENT_LINE	int nChildren = nodelist.getLength(); 
// 	TokenNameCOMMENT_LINE	 
// for (int i = 0; i < nChildren; i++) 	TokenNameCOMMENT_LINE	for (int i = 0; i < nChildren; i++) 
// { 	TokenNameCOMMENT_LINE	{ 
// int obj = nodelist.item(i); 	TokenNameCOMMENT_LINE	int obj = nodelist.item(i); 
// 	TokenNameCOMMENT_LINE	 
// if (null != obj) 	TokenNameCOMMENT_LINE	if (null != obj) 
// { 	TokenNameCOMMENT_LINE	{ 
// addElement(obj); 	TokenNameCOMMENT_LINE	addElement(obj); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// // checkDups(); 	TokenNameCOMMENT_LINE	// checkDups(); 
// } 	TokenNameCOMMENT_LINE	} 
// %TBD% 	TokenNameCOMMENT_LINE	%TBD% 
// /** 	TokenNameCOMMENT_LINE	/** 
// * <p>Copy NodeList members into this nodelist, adding in 	TokenNameCOMMENT_LINE	* <p>Copy NodeList members into this nodelist, adding in 
// * document order. Only genuine node references will be copied; 	TokenNameCOMMENT_LINE	* document order. Only genuine node references will be copied; 
// * nulls appearing in the source NodeSetDTM will 	TokenNameCOMMENT_LINE	* nulls appearing in the source NodeSetDTM will 
// * not be added to this one. </p> 	TokenNameCOMMENT_LINE	* not be added to this one. </p> 
// * 	TokenNameCOMMENT_LINE	* 
// * <p> In case you're wondering why this function is needed: NodeSetDTM 	TokenNameCOMMENT_LINE	* <p> In case you're wondering why this function is needed: NodeSetDTM 
// * implements both DTMIterator and NodeList. If this method isn't 	TokenNameCOMMENT_LINE	* implements both DTMIterator and NodeList. If this method isn't 
// * provided, Java can't decide which of those to use when addNodes() 	TokenNameCOMMENT_LINE	* provided, Java can't decide which of those to use when addNodes() 
// * is invoked. Providing the more-explicit match avoids that 	TokenNameCOMMENT_LINE	* is invoked. Providing the more-explicit match avoids that 
// * ambiguity.)</p> 	TokenNameCOMMENT_LINE	* ambiguity.)</p> 
// * 	TokenNameCOMMENT_LINE	* 
// * @param ns NodeSetDTM whose members should be merged into this NodeSetDTM. 	TokenNameCOMMENT_LINE	* @param ns NodeSetDTM whose members should be merged into this NodeSetDTM. 
// * @throws RuntimeException thrown if this NodeSetDTM is not of 	TokenNameCOMMENT_LINE	* @throws RuntimeException thrown if this NodeSetDTM is not of 
// * a mutable type. 	TokenNameCOMMENT_LINE	* a mutable type. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public void addNodes(NodeSetDTM ns) 	TokenNameCOMMENT_LINE	public void addNodes(NodeSetDTM ns) 
// { 	TokenNameCOMMENT_LINE	{ 
// 	TokenNameCOMMENT_LINE	 
// if (!m_mutable) 	TokenNameCOMMENT_LINE	if (!m_mutable) 
// throw new RuntimeException("This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	throw new RuntimeException("This NodeSetDTM is not mutable!"); 
// 	TokenNameCOMMENT_LINE	 
// addNodes((DTMIterator) ns); 	TokenNameCOMMENT_LINE	addNodes((DTMIterator) ns); 
// } 	TokenNameCOMMENT_LINE	} 
/** * Copy NodeList members into this nodelist, adding in * document order. Null references are not added. * * @param iterator DTMIterator which yields the nodes to be added. * @throws RuntimeException thrown if this NodeSetDTM is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Copy NodeList members into this nodelist, adding in document order. Null references are not added. * @param iterator DTMIterator which yields the nodes to be added. @throws RuntimeException thrown if this NodeSetDTM is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
addNodes	TokenNameIdentifier	 add Nodes
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
iterator	TokenNameIdentifier	 iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM is not mutable!"); 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
iterator	TokenNameIdentifier	 iterator
)	TokenNameRPAREN	
// defensive to fix a bug that Sanjiva reported. 	TokenNameCOMMENT_LINE	defensive to fix a bug that Sanjiva reported. 
{	TokenNameLBRACE	
int	TokenNameint	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// checkDups(); 	TokenNameCOMMENT_LINE	checkDups(); 
}	TokenNameRBRACE	
// %TBD% 	TokenNameCOMMENT_LINE	%TBD% 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Copy NodeList members into this nodelist, adding in 	TokenNameCOMMENT_LINE	* Copy NodeList members into this nodelist, adding in 
// * document order. If a node is null, don't add it. 	TokenNameCOMMENT_LINE	* document order. If a node is null, don't add it. 
// * 	TokenNameCOMMENT_LINE	* 
// * @param nodelist List of nodes to be added 	TokenNameCOMMENT_LINE	* @param nodelist List of nodes to be added 
// * @param support The XPath runtime context. 	TokenNameCOMMENT_LINE	* @param support The XPath runtime context. 
// * @throws RuntimeException thrown if this NodeSetDTM is not of 	TokenNameCOMMENT_LINE	* @throws RuntimeException thrown if this NodeSetDTM is not of 
// * a mutable type. 	TokenNameCOMMENT_LINE	* a mutable type. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public void addNodesInDocOrder(NodeList nodelist, XPathContext support) 	TokenNameCOMMENT_LINE	public void addNodesInDocOrder(NodeList nodelist, XPathContext support) 
// { 	TokenNameCOMMENT_LINE	{ 
// 	TokenNameCOMMENT_LINE	 
// if (!m_mutable) 	TokenNameCOMMENT_LINE	if (!m_mutable) 
// throw new RuntimeException("This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	throw new RuntimeException("This NodeSetDTM is not mutable!"); 
// 	TokenNameCOMMENT_LINE	 
// int nChildren = nodelist.getLength(); 	TokenNameCOMMENT_LINE	int nChildren = nodelist.getLength(); 
// 	TokenNameCOMMENT_LINE	 
// for (int i = 0; i < nChildren; i++) 	TokenNameCOMMENT_LINE	for (int i = 0; i < nChildren; i++) 
// { 	TokenNameCOMMENT_LINE	{ 
// int node = nodelist.item(i); 	TokenNameCOMMENT_LINE	int node = nodelist.item(i); 
// 	TokenNameCOMMENT_LINE	 
// if (null != node) 	TokenNameCOMMENT_LINE	if (null != node) 
// { 	TokenNameCOMMENT_LINE	{ 
// addNodeInDocOrder(node, support); 	TokenNameCOMMENT_LINE	addNodeInDocOrder(node, support); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
/** * Copy NodeList members into this nodelist, adding in * document order. If a node is null, don't add it. * * @param iterator DTMIterator which yields the nodes to be added. * @param support The XPath runtime context. * @throws RuntimeException thrown if this NodeSetDTM is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Copy NodeList members into this nodelist, adding in document order. If a node is null, don't add it. * @param iterator DTMIterator which yields the nodes to be added. @param support The XPath runtime context. @throws RuntimeException thrown if this NodeSetDTM is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
addNodesInDocOrder	TokenNameIdentifier	 add Nodes In Doc Order
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
iterator	TokenNameIdentifier	 iterator
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM is not mutable!"); 
int	TokenNameint	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addNodeInDocOrder	TokenNameIdentifier	 add Node In Doc Order
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// %TBD% 	TokenNameCOMMENT_LINE	%TBD% 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Add the node list to this node set in document order. 	TokenNameCOMMENT_LINE	* Add the node list to this node set in document order. 
// * 	TokenNameCOMMENT_LINE	* 
// * @param start index. 	TokenNameCOMMENT_LINE	* @param start index. 
// * @param end index. 	TokenNameCOMMENT_LINE	* @param end index. 
// * @param testIndex index. 	TokenNameCOMMENT_LINE	* @param testIndex index. 
// * @param nodelist The nodelist to add. 	TokenNameCOMMENT_LINE	* @param nodelist The nodelist to add. 
// * @param support The XPath runtime context. 	TokenNameCOMMENT_LINE	* @param support The XPath runtime context. 
// * 	TokenNameCOMMENT_LINE	* 
// * @return false always. 	TokenNameCOMMENT_LINE	* @return false always. 
// * @throws RuntimeException thrown if this NodeSetDTM is not of 	TokenNameCOMMENT_LINE	* @throws RuntimeException thrown if this NodeSetDTM is not of 
// * a mutable type. 	TokenNameCOMMENT_LINE	* a mutable type. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// private boolean addNodesInDocOrder(int start, int end, int testIndex, 	TokenNameCOMMENT_LINE	private boolean addNodesInDocOrder(int start, int end, int testIndex, 
// NodeList nodelist, XPathContext support) 	TokenNameCOMMENT_LINE	NodeList nodelist, XPathContext support) 
// { 	TokenNameCOMMENT_LINE	{ 
// 	TokenNameCOMMENT_LINE	 
// if (!m_mutable) 	TokenNameCOMMENT_LINE	if (!m_mutable) 
// throw new RuntimeException("This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	throw new RuntimeException("This NodeSetDTM is not mutable!"); 
// 	TokenNameCOMMENT_LINE	 
// boolean foundit = false; 	TokenNameCOMMENT_LINE	boolean foundit = false; 
// int i; 	TokenNameCOMMENT_LINE	int i; 
// int node = nodelist.item(testIndex); 	TokenNameCOMMENT_LINE	int node = nodelist.item(testIndex); 
// 	TokenNameCOMMENT_LINE	 
// for (i = end; i >= start; i--) 	TokenNameCOMMENT_LINE	for (i = end; i >= start; i--) 
// { 	TokenNameCOMMENT_LINE	{ 
// int child = elementAt(i); 	TokenNameCOMMENT_LINE	int child = elementAt(i); 
// 	TokenNameCOMMENT_LINE	 
// if (child == node) 	TokenNameCOMMENT_LINE	if (child == node) 
// { 	TokenNameCOMMENT_LINE	{ 
// i = -2; // Duplicate, suppress insert 	TokenNameCOMMENT_LINE	i = -2; // Duplicate, suppress insert 
// 	TokenNameCOMMENT_LINE	 
// break; 	TokenNameCOMMENT_LINE	break; 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// if (!support.getDOMHelper().isNodeAfter(node, child)) 	TokenNameCOMMENT_LINE	if (!support.getDOMHelper().isNodeAfter(node, child)) 
// { 	TokenNameCOMMENT_LINE	{ 
// insertElementAt(node, i + 1); 	TokenNameCOMMENT_LINE	insertElementAt(node, i + 1); 
// 	TokenNameCOMMENT_LINE	 
// testIndex--; 	TokenNameCOMMENT_LINE	testIndex--; 
// 	TokenNameCOMMENT_LINE	 
// if (testIndex > 0) 	TokenNameCOMMENT_LINE	if (testIndex > 0) 
// { 	TokenNameCOMMENT_LINE	{ 
// boolean foundPrev = addNodesInDocOrder(0, i, testIndex, nodelist, 	TokenNameCOMMENT_LINE	boolean foundPrev = addNodesInDocOrder(0, i, testIndex, nodelist, 
// support); 	TokenNameCOMMENT_LINE	support); 
// 	TokenNameCOMMENT_LINE	 
// if (!foundPrev) 	TokenNameCOMMENT_LINE	if (!foundPrev) 
// { 	TokenNameCOMMENT_LINE	{ 
// addNodesInDocOrder(i, size() - 1, testIndex, nodelist, support); 	TokenNameCOMMENT_LINE	addNodesInDocOrder(i, size() - 1, testIndex, nodelist, support); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// break; 	TokenNameCOMMENT_LINE	break; 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// if (i == -1) 	TokenNameCOMMENT_LINE	if (i == -1) 
// { 	TokenNameCOMMENT_LINE	{ 
// insertElementAt(node, 0); 	TokenNameCOMMENT_LINE	insertElementAt(node, 0); 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// return foundit; 	TokenNameCOMMENT_LINE	return foundit; 
// } 	TokenNameCOMMENT_LINE	} 
/** * Add the node into a vector of nodes where it should occur in * document order. * @param node The node to be added. * @param test true if we should test for doc order * @param support The XPath runtime context. * @return insertIndex. * @throws RuntimeException thrown if this NodeSetDTM is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Add the node into a vector of nodes where it should occur in document order. @param node The node to be added. @param test true if we should test for doc order @param support The XPath runtime context. @return insertIndex. @throws RuntimeException thrown if this NodeSetDTM is not of a mutable type. 
public	TokenNamepublic	
int	TokenNameint	
addNodeInDocOrder	TokenNameIdentifier	 add Node In Doc Order
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
boolean	TokenNameboolean	
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM is not mutable!"); 
int	TokenNameint	
insertIndex	TokenNameIdentifier	 insert Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This needs to do a binary search, but a binary search 	TokenNameCOMMENT_LINE	This needs to do a binary search, but a binary search 
// is somewhat tough because the sequence test involves 	TokenNameCOMMENT_LINE	is somewhat tough because the sequence test involves 
// two nodes. 	TokenNameCOMMENT_LINE	two nodes. 
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
==	TokenNameEQUAL_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Duplicate, suppress insert 	TokenNameCOMMENT_LINE	Duplicate, suppress insert 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
support	TokenNameIdentifier	 support
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
isNodeAfter	TokenNameIdentifier	 is Node After
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insertIndex	TokenNameIdentifier	 insert Index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
insertElementAt	TokenNameIdentifier	 insert Element At
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
insertIndex	TokenNameIdentifier	 insert Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
insertIndex	TokenNameIdentifier	 insert Index
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
foundit	TokenNameIdentifier	 foundit
=	TokenNameEQUAL	
false	TokenNamefalse	
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
insertIndex	TokenNameIdentifier	 insert Index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundit	TokenNameIdentifier	 foundit
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
foundit	TokenNameIdentifier	 foundit
)	TokenNameRPAREN	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// checkDups(); 	TokenNameCOMMENT_LINE	checkDups(); 
return	TokenNamereturn	
insertIndex	TokenNameIdentifier	 insert Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end addNodeInDocOrder(Vector v, Object obj) 	TokenNameCOMMENT_LINE	end addNodeInDocOrder(Vector v, Object obj) 
/** * Add the node into a vector of nodes where it should occur in * document order. * @param node The node to be added. * @param support The XPath runtime context. * * @return The index where it was inserted. * @throws RuntimeException thrown if this NodeSetDTM is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Add the node into a vector of nodes where it should occur in document order. @param node The node to be added. @param support The XPath runtime context. * @return The index where it was inserted. @throws RuntimeException thrown if this NodeSetDTM is not of a mutable type. 
public	TokenNamepublic	
int	TokenNameint	
addNodeInDocOrder	TokenNameIdentifier	 add Node In Doc Order
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM is not mutable!"); 
return	TokenNamereturn	
addNodeInDocOrder	TokenNameIdentifier	 add Node In Doc Order
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
support	TokenNameIdentifier	 support
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end addNodeInDocOrder(Vector v, Object obj) 	TokenNameCOMMENT_LINE	end addNodeInDocOrder(Vector v, Object obj) 
/** * Get the length of the list. * * @return The size of this node set. */	TokenNameCOMMENT_JAVADOC	 Get the length of the list. * @return The size of this node set. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append a Node onto the vector. * * @param value The node to be added. * @throws RuntimeException thrown if this NodeSetDTM is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Append a Node onto the vector. * @param value The node to be added. @throws RuntimeException thrown if this NodeSetDTM is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM is not mutable!"); 
super	TokenNamesuper	
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inserts the specified node in this vector at the specified index. * Each component in this vector with an index greater or equal to * the specified index is shifted upward to have an index one greater * than the value it had previously. * * @param value The node to be inserted. * @param at The index where the insert should occur. * @throws RuntimeException thrown if this NodeSetDTM is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Inserts the specified node in this vector at the specified index. Each component in this vector with an index greater or equal to the specified index is shifted upward to have an index one greater than the value it had previously. * @param value The node to be inserted. @param at The index where the insert should occur. @throws RuntimeException thrown if this NodeSetDTM is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
insertElementAt	TokenNameIdentifier	 insert Element At
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM is not mutable!"); 
super	TokenNamesuper	
.	TokenNameDOT	
insertElementAt	TokenNameIdentifier	 insert Element At
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append the nodes to the list. * * @param nodes The nodes to be appended to this node set. * @throws RuntimeException thrown if this NodeSetDTM is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Append the nodes to the list. * @param nodes The nodes to be appended to this node set. @throws RuntimeException thrown if this NodeSetDTM is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
appendNodes	TokenNameIdentifier	 append Nodes
(	TokenNameLPAREN	
NodeVector	TokenNameIdentifier	 Node Vector
nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM is not mutable!"); 
super	TokenNamesuper	
.	TokenNameDOT	
appendNodes	TokenNameIdentifier	 append Nodes
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inserts the specified node in this vector at the specified index. * Each component in this vector with an index greater or equal to * the specified index is shifted upward to have an index one greater * than the value it had previously. * @throws RuntimeException thrown if this NodeSetDTM is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Inserts the specified node in this vector at the specified index. Each component in this vector with an index greater or equal to the specified index is shifted upward to have an index one greater than the value it had previously. @throws RuntimeException thrown if this NodeSetDTM is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM is not mutable!"); 
super	TokenNamesuper	
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the first occurrence of the argument from this vector. * If the object is found in this vector, each component in the vector * with an index greater or equal to the object's index is shifted * downward to have an index one smaller than the value it had * previously. * * @param s The node to be removed. * * @return True if the node was successfully removed * @throws RuntimeException thrown if this NodeSetDTM is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Removes the first occurrence of the argument from this vector. If the object is found in this vector, each component in the vector with an index greater or equal to the object's index is shifted downward to have an index one smaller than the value it had previously. * @param s The node to be removed. * @return True if the node was successfully removed @throws RuntimeException thrown if this NodeSetDTM is not of a mutable type. 
public	TokenNamepublic	
boolean	TokenNameboolean	
removeElement	TokenNameIdentifier	 remove Element
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM is not mutable!"); 
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
removeElement	TokenNameIdentifier	 remove Element
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deletes the component at the specified index. Each component in * this vector with an index greater or equal to the specified * index is shifted downward to have an index one smaller than * the value it had previously. * * @param i The index of the node to be removed. * @throws RuntimeException thrown if this NodeSetDTM is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Deletes the component at the specified index. Each component in this vector with an index greater or equal to the specified index is shifted downward to have an index one smaller than the value it had previously. * @param i The index of the node to be removed. @throws RuntimeException thrown if this NodeSetDTM is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
removeElementAt	TokenNameIdentifier	 remove Element At
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM is not mutable!"); 
super	TokenNamesuper	
.	TokenNameDOT	
removeElementAt	TokenNameIdentifier	 remove Element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the component at the specified index of this vector to be the * specified object. The previous component at that position is discarded. * * The index must be a value greater than or equal to 0 and less * than the current size of the vector. * * @param node The node to be set. * @param index The index of the node to be replaced. * @throws RuntimeException thrown if this NodeSetDTM is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Sets the component at the specified index of this vector to be the specified object. The previous component at that position is discarded. * The index must be a value greater than or equal to 0 and less than the current size of the vector. * @param node The node to be set. @param index The index of the node to be replaced. @throws RuntimeException thrown if this NodeSetDTM is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM is not mutable!"); 
super	TokenNamesuper	
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Same as setElementAt. * * @param node The node to be set. * @param index The index of the node to be replaced. * @throws RuntimeException thrown if this NodeSetDTM is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Same as setElementAt. * @param node The node to be set. @param index The index of the node to be replaced. @throws RuntimeException thrown if this NodeSetDTM is not of a mutable type. 
public	TokenNamepublic	
void	TokenNamevoid	
setItem	TokenNameIdentifier	 set Item
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_mutable	TokenNameIdentifier	 m mutable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM is not mutable!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM is not mutable!"); 
super	TokenNamesuper	
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the nth element. * * @param i The index of the requested node. * * @return Node at specified index. */	TokenNameCOMMENT_JAVADOC	 Get the nth element. * @param i The index of the requested node. * @return Node at specified index. 
public	TokenNamepublic	
int	TokenNameint	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the table contains the given node. * * @param s Node to look for * * @return True if the given node was found. */	TokenNameCOMMENT_JAVADOC	 Tell if the table contains the given node. * @param s Node to look for * @return True if the given node was found. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the first occurence of the given argument, * beginning the search at index, and testing for equality * using the equals method. * * @param elem Node to look for * @param index Index of where to start the search * @return the index of the first occurrence of the object * argument in this vector at position index or later in the * vector; returns -1 if the object is not found. */	TokenNameCOMMENT_JAVADOC	 Searches for the first occurence of the given argument, beginning the search at index, and testing for equality using the equals method. * @param elem Node to look for @param index Index of where to start the search @return the index of the first occurrence of the object argument in this vector at position index or later in the vector; returns -1 if the object is not found. 
public	TokenNamepublic	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
int	TokenNameint	
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the first occurence of the given argument, * beginning the search at index, and testing for equality * using the equals method. * * @param elem Node to look for * @return the index of the first occurrence of the object * argument in this vector at position index or later in the * vector; returns -1 if the object is not found. */	TokenNameCOMMENT_JAVADOC	 Searches for the first occurence of the given argument, beginning the search at index, and testing for equality using the equals method. * @param elem Node to look for @return the index of the first occurrence of the object argument in this vector at position index or later in the vector; returns -1 if the object is not found. 
public	TokenNamepublic	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
int	TokenNameint	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If this node is being used as an iterator, the next index that nextNode() * will return. */	TokenNameCOMMENT_JAVADOC	 If this node is being used as an iterator, the next index that nextNode() will return. 
transient	TokenNametransient	
protected	TokenNameprotected	
int	TokenNameint	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Get the current position, which is one less than * the next nextNode() call will retrieve. i.e. if * you call getCurrentPos() and the return is 0, the next * fetch will take place at index 1. * * @return The the current position index. */	TokenNameCOMMENT_JAVADOC	 Get the current position, which is one less than the next nextNode() call will retrieve. i.e. if you call getCurrentPos() and the return is 0, the next fetch will take place at index 1. * @return The the current position index. 
public	TokenNamepublic	
int	TokenNameint	
getCurrentPos	TokenNameIdentifier	 get Current Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the current position in the node set. * @param i Must be a valid index. * @throws RuntimeException thrown if this NodeSetDTM is not of * a cached type, and thus doesn't permit indexed access. */	TokenNameCOMMENT_JAVADOC	 Set the current position in the node set. @param i Must be a valid index. @throws RuntimeException thrown if this NodeSetDTM is not of a cached type, and thus doesn't permit indexed access. 
public	TokenNamepublic	
void	TokenNamevoid	
setCurrentPos	TokenNameIdentifier	 set Current Pos
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_cacheNodes	TokenNameIdentifier	 m cache Nodes
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_CANNOT_INDEX	TokenNameIdentifier	 ER  NODESETDTM  CANNOT  INDEX
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM can not do indexing or counting functions!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM can not do indexing or counting functions!"); 
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the last fetched node. Needed to support the UnionPathIterator. * * @return the last fetched node. * @throws RuntimeException thrown if this NodeSetDTM is not of * a cached type, and thus doesn't permit indexed access. */	TokenNameCOMMENT_JAVADOC	 Return the last fetched node. Needed to support the UnionPathIterator. * @return the last fetched node. @throws RuntimeException thrown if this NodeSetDTM is not of a cached type, and thus doesn't permit indexed access. 
public	TokenNamepublic	
int	TokenNameint	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_cacheNodes	TokenNameIdentifier	 m cache Nodes
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"This NodeSetDTM can not do indexing or counting functions!"	TokenNameStringLiteral	This NodeSetDTM can not do indexing or counting functions!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
saved	TokenNameIdentifier	 saved
=	TokenNameEQUAL	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
// because nextNode always increments 	TokenNameCOMMENT_LINE	because nextNode always increments 
// But watch out for copy29, where the root iterator didn't 	TokenNameCOMMENT_LINE	But watch out for copy29, where the root iterator didn't 
// have nextNode called on it. 	TokenNameCOMMENT_LINE	have nextNode called on it. 
int	TokenNameint	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_next	TokenNameIdentifier	 m next
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
<	TokenNameLESS	
m_firstFree	TokenNameIdentifier	 m first Free
)	TokenNameRPAREN	
?	TokenNameQUESTION	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
:	TokenNameCOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
saved	TokenNameIdentifier	 saved
;	TokenNameSEMICOLON	
// HACK: I think this is a bit of a hack. -sb 	TokenNameCOMMENT_LINE	HACK: I think this is a bit of a hack. -sb 
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** True if this list can be mutated. */	TokenNameCOMMENT_JAVADOC	 True if this list can be mutated. 
transient	TokenNametransient	
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_mutable	TokenNameIdentifier	 m mutable
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** True if this list is cached. * @serial */	TokenNameCOMMENT_JAVADOC	 True if this list is cached. @serial 
transient	TokenNametransient	
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_cacheNodes	TokenNameIdentifier	 m cache Nodes
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** The root of the iteration, if available. */	TokenNameCOMMENT_JAVADOC	 The root of the iteration, if available. 
protected	TokenNameprotected	
int	TokenNameint	
m_root	TokenNameIdentifier	 m root
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** * Get whether or not this is a cached node set. * * * @return True if this list is cached. */	TokenNameCOMMENT_JAVADOC	 Get whether or not this is a cached node set. * @return True if this list is cached. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getShouldCacheNodes	TokenNameIdentifier	 get Should Cache Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_cacheNodes	TokenNameIdentifier	 m cache Nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If setShouldCacheNodes(true) is called, then nodes will * be cached. They are not cached by default. This switch must * be set before the first call to nextNode is made, to ensure * that all nodes are cached. * * @param b true if this node set should be cached. * @throws RuntimeException thrown if an attempt is made to * request caching after we've already begun stepping through the * nodes in this set. */	TokenNameCOMMENT_JAVADOC	 If setShouldCacheNodes(true) is called, then nodes will be cached. They are not cached by default. This switch must be set before the first call to nextNode is made, to ensure that all nodes are cached. * @param b true if this node set should be cached. @throws RuntimeException thrown if an attempt is made to request caching after we've already begun stepping through the nodes in this set. 
public	TokenNamepublic	
void	TokenNamevoid	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isFresh	TokenNameIdentifier	 is Fresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_CANNOT_CALL_SETSHOULDCACHENODE	TokenNameIdentifier	 ER  CANNOT  CALL  SETSHOULDCACHENODE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can not call setShouldCacheNodes after nextNode has been called!"); 	TokenNameCOMMENT_LINE	"Can not call setShouldCacheNodes after nextNode has been called!"); 
m_cacheNodes	TokenNameIdentifier	 m cache Nodes
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
m_mutable	TokenNameIdentifier	 m mutable
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells if this iterator can have nodes added to it or set via * the <code>setItem(int node, int index)</code> method. * * @return True if the nodelist can be mutated. */	TokenNameCOMMENT_JAVADOC	 Tells if this iterator can have nodes added to it or set via the <code>setItem(int node, int index)</code> method. * @return True if the nodelist can be mutated. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isMutable	TokenNameIdentifier	 is Mutable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_mutable	TokenNameIdentifier	 m mutable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transient	TokenNametransient	
private	TokenNameprivate	
int	TokenNameint	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getLast	TokenNameIdentifier	 get Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_last	TokenNameIdentifier	 m last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLast	TokenNameIdentifier	 set Last
(	TokenNameLPAREN	
int	TokenNameint	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if all the nodes in the iteration well be returned in document * order. * * @return true as a default. */	TokenNameCOMMENT_JAVADOC	 Returns true if all the nodes in the iteration well be returned in document order. * @return true as a default. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDocOrdered	TokenNameIdentifier	 is Doc Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the axis being iterated, if it is known. * * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple * types. */	TokenNameCOMMENT_JAVADOC	 Returns the axis being iterated, if it is known. * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple types. 
public	TokenNamepublic	
int	TokenNameint	
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
