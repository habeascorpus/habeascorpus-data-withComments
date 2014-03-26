/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DupFilterIterator.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DupFilterIterator.java 468651 2006-10-28 07:04:25Z minchau $ 
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
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
BasisLibrary	TokenNameIdentifier	 Basis Library
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IntegerArray	TokenNameIdentifier	 Integer Array
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
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
DTMAxisIteratorBase	TokenNameIdentifier	 DTM Axis Iterator Base
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
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
;	TokenNameSEMICOLON	
/** * Removes duplicates and sorts a source iterator. The nodes from the * source are collected in an array upon calling setStartNode(). This * array is later sorted and duplicates are ignored in next(). * @author G. Todd Miller */	TokenNameCOMMENT_JAVADOC	 Removes duplicates and sorts a source iterator. The nodes from the source are collected in an array upon calling setStartNode(). This array is later sorted and duplicates are ignored in next(). @author G. Todd Miller 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
DupFilterIterator	TokenNameIdentifier	 Dup Filter Iterator
extends	TokenNameextends	
DTMAxisIteratorBase	TokenNameIdentifier	 DTM Axis Iterator Base
{	TokenNameLBRACE	
/** * Reference to source iterator. */	TokenNameCOMMENT_JAVADOC	 Reference to source iterator. 
private	TokenNameprivate	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
_source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
/** * Array to cache all nodes from source. */	TokenNameCOMMENT_JAVADOC	 Array to cache all nodes from source. 
private	TokenNameprivate	
IntegerArray	TokenNameIdentifier	 Integer Array
_nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
new	TokenNamenew	
IntegerArray	TokenNameIdentifier	 Integer Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Index in _nodes array to current node. */	TokenNameCOMMENT_JAVADOC	 Index in _nodes array to current node. 
private	TokenNameprivate	
int	TokenNameint	
_current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Cardinality of _nodes array. */	TokenNameCOMMENT_JAVADOC	 Cardinality of _nodes array. 
private	TokenNameprivate	
int	TokenNameint	
_nodesSize	TokenNameIdentifier	 nodes Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Last value returned by next(). */	TokenNameCOMMENT_JAVADOC	 Last value returned by next(). 
private	TokenNameprivate	
int	TokenNameint	
_lastNext	TokenNameIdentifier	 last Next
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
/** * Temporary variable to store _lastNext. */	TokenNameCOMMENT_JAVADOC	 Temporary variable to store _lastNext. 
private	TokenNameprivate	
int	TokenNameint	
_markedLastNext	TokenNameIdentifier	 marked Last Next
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DupFilterIterator	TokenNameIdentifier	 Dup Filter Iterator
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
// System.out.println("DFI source = " + source + " this = " + this); 	TokenNameCOMMENT_LINE	System.out.println("DFI source = " + source + " this = " + this); 
// Cache contents of id() or key() index right away. Necessary for 	TokenNameCOMMENT_LINE	Cache contents of id() or key() index right away. Necessary for 
// union expressions containing multiple calls to the same index, and 	TokenNameCOMMENT_LINE	union expressions containing multiple calls to the same index, and 
// correct as well since start-node is irrelevant for id()/key() exrp. 	TokenNameCOMMENT_LINE	correct as well since start-node is irrelevant for id()/key() exrp. 
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
KeyIndex	TokenNameIdentifier	 Key Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the start node for this iterator * @param node The start node * @return A reference to this node iterator */	TokenNameCOMMENT_JAVADOC	 Set the start node for this iterator @param node The start node @return A reference to this node iterator 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// KeyIndex iterators are always relative to the root node, so there 	TokenNameCOMMENT_LINE	KeyIndex iterators are always relative to the root node, so there 
// is never any point in re-reading the iterator (and we SHOULD NOT). 	TokenNameCOMMENT_LINE	is never any point in re-reading the iterator (and we SHOULD NOT). 
boolean	TokenNameboolean	
sourceIsKeyIndex	TokenNameIdentifier	 source Is Key Index
=	TokenNameEQUAL	
_source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
KeyIndex	TokenNameIdentifier	 Key Index
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sourceIsKeyIndex	TokenNameIdentifier	 source Is Key Index
&&	TokenNameAND_AND	
_startNode	TokenNameIdentifier	 start Node
==	TokenNameEQUAL_EQUAL	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
_startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_source	TokenNameIdentifier	 source
.	TokenNameDOT	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_source	TokenNameIdentifier	 source
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Nodes produced by KeyIndex are known to be in document order. 	TokenNameCOMMENT_LINE	Nodes produced by KeyIndex are known to be in document order. 
// Take advantage of it. 	TokenNameCOMMENT_LINE	Take advantage of it. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
sourceIsKeyIndex	TokenNameIdentifier	 source Is Key Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_nodesSize	TokenNameIdentifier	 nodes Size
=	TokenNameEQUAL	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_lastNext	TokenNameIdentifier	 last Next
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
_current	TokenNameIdentifier	 current
<	TokenNameLESS	
_nodesSize	TokenNameIdentifier	 nodes Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
_current	TokenNameIdentifier	 current
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
_lastNext	TokenNameIdentifier	 last Next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
_lastNext	TokenNameIdentifier	 last Next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
cloneIterator	TokenNameIdentifier	 clone Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
DupFilterIterator	TokenNameIdentifier	 Dup Filter Iterator
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DupFilterIterator	TokenNameIdentifier	 Dup Filter Iterator
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
_nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IntegerArray	TokenNameIdentifier	 Integer Array
)	TokenNameRPAREN	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
_source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
_source	TokenNameIdentifier	 source
.	TokenNameDOT	
cloneIterator	TokenNameIdentifier	 clone Iterator
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
_source	TokenNameIdentifier	 source
.	TokenNameDOT	
setRestartable	TokenNameIdentifier	 set Restartable
(	TokenNameLPAREN	
isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_markedNode	TokenNameIdentifier	 marked Node
=	TokenNameEQUAL	
_current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
_markedLastNext	TokenNameIdentifier	 marked Last Next
=	TokenNameEQUAL	
_lastNext	TokenNameIdentifier	 last Next
;	TokenNameSEMICOLON	
// Bugzilla 25924 	TokenNameCOMMENT_LINE	Bugzilla 25924 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
_markedNode	TokenNameIdentifier	 marked Node
;	TokenNameSEMICOLON	
_lastNext	TokenNameIdentifier	 last Next
=	TokenNameEQUAL	
_markedLastNext	TokenNameIdentifier	 marked Last Next
;	TokenNameSEMICOLON	
// Bugzilla 25924 	TokenNameCOMMENT_LINE	Bugzilla 25924 
}	TokenNameRBRACE	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_lastNext	TokenNameIdentifier	 last Next
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
