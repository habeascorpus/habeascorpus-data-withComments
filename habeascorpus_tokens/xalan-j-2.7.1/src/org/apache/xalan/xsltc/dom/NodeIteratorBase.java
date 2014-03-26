/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NodeIteratorBase.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NodeIteratorBase.java 468651 2006-10-28 07:04:25Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
NodeIterator	TokenNameIdentifier	 Node Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
BasisLibrary	TokenNameIdentifier	 Basis Library
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author Morten Jorgensen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
NodeIteratorBase	TokenNameIdentifier	 Node Iterator Base
implements	TokenNameimplements	
NodeIterator	TokenNameIdentifier	 Node Iterator
{	TokenNameLBRACE	
/** * Cached computed value of last(). */	TokenNameCOMMENT_JAVADOC	 Cached computed value of last(). 
protected	TokenNameprotected	
int	TokenNameint	
_last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Value of position() in this iterator. Incremented in * returnNode(). */	TokenNameCOMMENT_JAVADOC	 Value of position() in this iterator. Incremented in returnNode(). 
protected	TokenNameprotected	
int	TokenNameint	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Store node in call to setMark(). */	TokenNameCOMMENT_JAVADOC	 Store node in call to setMark(). 
protected	TokenNameprotected	
int	TokenNameint	
_markedNode	TokenNameIdentifier	 marked Node
;	TokenNameSEMICOLON	
/** * Store node in call to setStartNode(). */	TokenNameCOMMENT_JAVADOC	 Store node in call to setStartNode(). 
protected	TokenNameprotected	
int	TokenNameint	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
NodeIterator	TokenNameIdentifier	 Node Iterator
.	TokenNameDOT	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
/** * Flag indicating if "self" should be returned. */	TokenNameCOMMENT_JAVADOC	 Flag indicating if "self" should be returned. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
_includeSelf	TokenNameIdentifier	 include Self
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Flag indicating if iterator can be restarted. */	TokenNameCOMMENT_JAVADOC	 Flag indicating if iterator can be restarted. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Setter for _isRestartable flag. */	TokenNameCOMMENT_JAVADOC	 Setter for _isRestartable flag. 
public	TokenNamepublic	
void	TokenNamevoid	
setRestartable	TokenNameIdentifier	 set Restartable
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
isRestartable	TokenNameIdentifier	 is Restartable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize iterator using a node. If iterator is not * restartable, then do nothing. If node is equal to END then * subsequent calls to next() must return END. */	TokenNameCOMMENT_JAVADOC	 Initialize iterator using a node. If iterator is not restartable, then do nothing. If node is equal to END then subsequent calls to next() must return END. 
abstract	TokenNameabstract	
public	TokenNamepublic	
NodeIterator	TokenNameIdentifier	 Node Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Reset this iterator using state from last call to * setStartNode(). */	TokenNameCOMMENT_JAVADOC	 Reset this iterator using state from last call to setStartNode(). 
public	TokenNamepublic	
NodeIterator	TokenNameIdentifier	 Node Iterator
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
_isRestartable	TokenNameIdentifier	 is Restartable
;	TokenNameSEMICOLON	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Must adjust _startNode if self is included 	TokenNameCOMMENT_LINE	Must adjust _startNode if self is included 
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
_includeSelf	TokenNameIdentifier	 include Self
?	TokenNameQUESTION	
_startNode	TokenNameIdentifier	 start Node
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
_startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Setter for _includeSelf flag. */	TokenNameCOMMENT_JAVADOC	 Setter for _includeSelf flag. 
public	TokenNamepublic	
NodeIterator	TokenNameIdentifier	 Node Iterator
includeSelf	TokenNameIdentifier	 include Self
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_includeSelf	TokenNameIdentifier	 include Self
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Default implementation of getLast(). Stores current position * and current node, resets the iterator, counts all nodes and * restores iterator to original state. */	TokenNameCOMMENT_JAVADOC	 Default implementation of getLast(). Stores current position and current node, resets the iterator, counts all nodes and restores iterator to original state. 
public	TokenNamepublic	
int	TokenNameint	
getLast	TokenNameIdentifier	 get Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_last	TokenNameIdentifier	 last
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
_position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
_last	TokenNameIdentifier	 last
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the position() in this iterator. */	TokenNameCOMMENT_JAVADOC	 Returns the position() in this iterator. 
public	TokenNamepublic	
int	TokenNameint	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
_position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicates if position in this iterator is computed in reverse * document order. Note that nodes are always returned in document * order. */	TokenNameCOMMENT_JAVADOC	 Indicates if position in this iterator is computed in reverse document order. Note that nodes are always returned in document order. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReverse	TokenNameIdentifier	 is Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clones and resets this iterator. Note that the cloned iterator is * not restartable. This is because cloning is needed for variable * references, and the context node of the original variable * declaration must be preserved. */	TokenNameCOMMENT_JAVADOC	 Clones and resets this iterator. Note that the cloned iterator is not restartable. This is because cloning is needed for variable references, and the context node of the original variable declaration must be preserved. 
public	TokenNamepublic	
NodeIterator	TokenNameIdentifier	 Node Iterator
cloneIterator	TokenNameIdentifier	 clone Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
NodeIteratorBase	TokenNameIdentifier	 Node Iterator Base
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeIteratorBase	TokenNameIdentifier	 Node Iterator Base
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
runTimeError	TokenNameIdentifier	 run Time Error
(	TokenNameLPAREN	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
ITERATOR_CLONE_ERR	TokenNameIdentifier	 ITERATOR  CLONE  ERR
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Utility method that increments position and returns its * argument. */	TokenNameCOMMENT_JAVADOC	 Utility method that increments position and returns its argument. 
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset the position in this iterator. */	TokenNameCOMMENT_JAVADOC	 Reset the position in this iterator. 
protected	TokenNameprotected	
final	TokenNamefinal	
NodeIterator	TokenNameIdentifier	 Node Iterator
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
