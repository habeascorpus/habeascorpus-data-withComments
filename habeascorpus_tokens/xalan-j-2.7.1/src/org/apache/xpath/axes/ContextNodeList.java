/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ContextNodeList.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ContextNodeList.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
axes	TokenNameIdentifier	 axes
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
NodeIterator	TokenNameIdentifier	 Node Iterator
;	TokenNameSEMICOLON	
/** * Classes who implement this interface can be a * <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>, * also refered to here as a <term>context node list</term>. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Classes who implement this interface can be a <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>, also refered to here as a <term>context node list</term>. @xsl.usage advanced 
public	TokenNamepublic	
interface	TokenNameinterface	
ContextNodeList	TokenNameIdentifier	 Context Node List
{	TokenNameLBRACE	
/** * Get the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>. * * * @return The current node, or null. */	TokenNameCOMMENT_JAVADOC	 Get the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>. * @return The current node, or null. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the current position, which is one less than * the next nextNode() call will retrieve. i.e. if * you call getCurrentPos() and the return is 0, the next * fetch will take place at index 1. * * @return The position of the * <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a> * in the <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>. */	TokenNameCOMMENT_JAVADOC	 Get the current position, which is one less than the next nextNode() call will retrieve. i.e. if you call getCurrentPos() and the return is 0, the next fetch will take place at index 1. * @return The position of the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a> in the <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>. 
public	TokenNamepublic	
int	TokenNameint	
getCurrentPos	TokenNameIdentifier	 get Current Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Reset the iterator. */	TokenNameCOMMENT_JAVADOC	 Reset the iterator. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * If setShouldCacheNodes(true) is called, then nodes will * be cached. They are not cached by default. * * @param b true if the nodes should be cached. */	TokenNameCOMMENT_JAVADOC	 If setShouldCacheNodes(true) is called, then nodes will be cached. They are not cached by default. * @param b true if the nodes should be cached. 
public	TokenNamepublic	
void	TokenNamevoid	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * If an index is requested, NodeSetDTM will call this method * to run the iterator to the index. By default this sets * m_next to the index. If the index argument is -1, this * signals that the iterator should be run to the end. * * @param index The index to run to, or -1 if the iterator should be run * to the end. */	TokenNameCOMMENT_JAVADOC	 If an index is requested, NodeSetDTM will call this method to run the iterator to the index. By default this sets m_next to the index. If the index argument is -1, this signals that the iterator should be run to the end. * @param index The index to run to, or -1 if the iterator should be run to the end. 
public	TokenNamepublic	
void	TokenNamevoid	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the current position in the node set. * @param i Must be a valid index. */	TokenNameCOMMENT_JAVADOC	 Set the current position in the node set. @param i Must be a valid index. 
public	TokenNamepublic	
void	TokenNamevoid	
setCurrentPos	TokenNameIdentifier	 set Current Pos
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the length of the list. * * @return The number of nodes in this node list. */	TokenNameCOMMENT_JAVADOC	 Get the length of the list. * @return The number of nodes in this node list. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Tells if this NodeSetDTM is "fresh", in other words, if * the first nextNode() that is called will return the * first node in the set. * * @return true if the iteration of this list has not yet begun. */	TokenNameCOMMENT_JAVADOC	 Tells if this NodeSetDTM is "fresh", in other words, if the first nextNode() that is called will return the first node in the set. * @return true if the iteration of this list has not yet begun. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFresh	TokenNameIdentifier	 is Fresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get a cloned Iterator that is reset to the start of the iteration. * * @return A clone of this iteration that has been reset. * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Get a cloned Iterator that is reset to the start of the iteration. * @return A clone of this iteration that has been reset. * @throws CloneNotSupportedException 
public	TokenNamepublic	
NodeIterator	TokenNameIdentifier	 Node Iterator
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
;	TokenNameSEMICOLON	
/** * Get a clone of this iterator. Be aware that this operation may be * somewhat expensive. * * * @return A clone of this object. * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Get a clone of this iterator. Be aware that this operation may be somewhat expensive. * @return A clone of this object. * @throws CloneNotSupportedException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
;	TokenNameSEMICOLON	
/** * Get the index of the last node in this list. * * * @return the index of the last node in this list. */	TokenNameCOMMENT_JAVADOC	 Get the index of the last node in this list. * @return the index of the last node in this list. 
public	TokenNamepublic	
int	TokenNameint	
getLast	TokenNameIdentifier	 get Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the index of the last node in this list. * * * @param last the index of the last node in this list. */	TokenNameCOMMENT_JAVADOC	 Set the index of the last node in this list. * @param last the index of the last node in this list. 
public	TokenNamepublic	
void	TokenNamevoid	
setLast	TokenNameIdentifier	 set Last
(	TokenNameLPAREN	
int	TokenNameint	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
