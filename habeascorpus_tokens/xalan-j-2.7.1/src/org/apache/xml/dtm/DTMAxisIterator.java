/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMAxisIterator.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMAxisIterator.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
/** * This class iterates over a single XPath Axis, and returns node handles. */	TokenNameCOMMENT_JAVADOC	 This class iterates over a single XPath Axis, and returns node handles. 
public	TokenNamepublic	
interface	TokenNameinterface	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
extends	TokenNameextends	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** Specifies the end of the iteration, and is the same as DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Specifies the end of the iteration, and is the same as DTM.NULL. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
END	TokenNameIdentifier	 END
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Resets the iterator to the last start node. * * @return A DTMAxisIterator, which may or may not be the same as this * iterator. */	TokenNameCOMMENT_JAVADOC	 Resets the iterator to the last start node. * @return A DTMAxisIterator, which may or may not be the same as this iterator. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return the number of nodes in this iterator. This may be an expensive * operation when called the first time. */	TokenNameCOMMENT_JAVADOC	 @return the number of nodes in this iterator. This may be an expensive operation when called the first time. 
public	TokenNamepublic	
int	TokenNameint	
getLast	TokenNameIdentifier	 get Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return The position of the current node in the set, as defined by XPath. */	TokenNameCOMMENT_JAVADOC	 @return The position of the current node in the set, as defined by XPath. 
public	TokenNamepublic	
int	TokenNameint	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Remembers the current node for the next call to gotoMark(). */	TokenNameCOMMENT_JAVADOC	 Remembers the current node for the next call to gotoMark(). 
public	TokenNamepublic	
void	TokenNamevoid	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Restores the current node remembered by setMark(). */	TokenNameCOMMENT_JAVADOC	 Restores the current node remembered by setMark(). 
public	TokenNamepublic	
void	TokenNamevoid	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @return The root node of the iteration. */	TokenNameCOMMENT_JAVADOC	 Get start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @return The root node of the iteration. 
public	TokenNamepublic	
int	TokenNameint	
getStartNode	TokenNameIdentifier	 get Start Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return true if this iterator has a reversed axis, else false. */	TokenNameCOMMENT_JAVADOC	 @return true if this iterator has a reversed axis, else false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReverse	TokenNameIdentifier	 is Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return a deep copy of this iterator. The clone should not be reset * from its current position. */	TokenNameCOMMENT_JAVADOC	 @return a deep copy of this iterator. The clone should not be reset from its current position. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
cloneIterator	TokenNameIdentifier	 clone Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set if restartable. */	TokenNameCOMMENT_JAVADOC	 Set if restartable. 
public	TokenNamepublic	
void	TokenNamevoid	
setRestartable	TokenNameIdentifier	 set Restartable
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return the node at the given position. * * @param position The position * @return The node at the given position. */	TokenNameCOMMENT_JAVADOC	 Return the node at the given position. * @param position The position @return The node at the given position. 
public	TokenNamepublic	
int	TokenNameint	
getNodeByPosition	TokenNameIdentifier	 get Node By Position
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
