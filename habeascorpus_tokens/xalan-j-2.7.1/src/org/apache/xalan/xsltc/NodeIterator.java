/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NodeIterator.java 468648 2006-10-28 07:00:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NodeIterator.java 468648 2006-10-28 07:00:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
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
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
interface	TokenNameinterface	
NodeIterator	TokenNameIdentifier	 Node Iterator
extends	TokenNameextends	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
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
/** * Callers should not call next() after it returns END. */	TokenNameCOMMENT_JAVADOC	 Callers should not call next() after it returns END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Resets the iterator to the last start node. */	TokenNameCOMMENT_JAVADOC	 Resets the iterator to the last start node. 
public	TokenNamepublic	
NodeIterator	TokenNameIdentifier	 Node Iterator
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the number of elements in this iterator. */	TokenNameCOMMENT_JAVADOC	 Returns the number of elements in this iterator. 
public	TokenNamepublic	
int	TokenNameint	
getLast	TokenNameIdentifier	 get Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the position of the current node in the set. */	TokenNameCOMMENT_JAVADOC	 Returns the position of the current node in the set. 
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
/** * Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. */	TokenNameCOMMENT_JAVADOC	 Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END. 
public	TokenNamepublic	
NodeIterator	TokenNameIdentifier	 Node Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * True if this iterator has a reversed axis. */	TokenNameCOMMENT_JAVADOC	 True if this iterator has a reversed axis. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReverse	TokenNameIdentifier	 is Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a deep copy of this iterator. */	TokenNameCOMMENT_JAVADOC	 Returns a deep copy of this iterator. 
public	TokenNamepublic	
NodeIterator	TokenNameIdentifier	 Node Iterator
cloneIterator	TokenNameIdentifier	 clone Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Prevents or allows iterator restarts. */	TokenNameCOMMENT_JAVADOC	 Prevents or allows iterator restarts. 
public	TokenNamepublic	
void	TokenNamevoid	
setRestartable	TokenNameIdentifier	 set Restartable
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
