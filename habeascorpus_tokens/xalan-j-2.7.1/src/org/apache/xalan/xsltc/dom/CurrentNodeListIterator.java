/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: CurrentNodeListIterator.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: CurrentNodeListIterator.java 468651 2006-10-28 07:04:25Z minchau $ 
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
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
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
/** * Iterators of this kind use a CurrentNodeListFilter to filter a subset of * nodes from a source iterator. For each node from the source, the boolean * method CurrentNodeListFilter.test() is called. * * All nodes from the source are read into an array upon calling setStartNode() * (this is needed to determine the value of last, a parameter to * CurrentNodeListFilter.test()). The method getLast() returns the last element * after applying the filter. * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 Iterators of this kind use a CurrentNodeListFilter to filter a subset of nodes from a source iterator. For each node from the source, the boolean method CurrentNodeListFilter.test() is called. * All nodes from the source are read into an array upon calling setStartNode() (this is needed to determine the value of last, a parameter to CurrentNodeListFilter.test()). The method getLast() returns the last element after applying the filter. @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author Morten Jorgensen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CurrentNodeListIterator	TokenNameIdentifier	 Current Node List Iterator
extends	TokenNameextends	
DTMAxisIteratorBase	TokenNameIdentifier	 DTM Axis Iterator Base
{	TokenNameLBRACE	
/** * A flag indicating if nodes are returned in document order. */	TokenNameCOMMENT_JAVADOC	 A flag indicating if nodes are returned in document order. 
private	TokenNameprivate	
boolean	TokenNameboolean	
_docOrder	TokenNameIdentifier	 doc Order
;	TokenNameSEMICOLON	
/** * The source for this iterator. */	TokenNameCOMMENT_JAVADOC	 The source for this iterator. 
private	TokenNameprivate	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
_source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
/** * A reference to a filter object. */	TokenNameCOMMENT_JAVADOC	 A reference to a filter object. 
private	TokenNameprivate	
final	TokenNamefinal	
CurrentNodeListFilter	TokenNameIdentifier	 Current Node List Filter
_filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
/** * An integer array to store nodes from source iterator. */	TokenNameCOMMENT_JAVADOC	 An integer array to store nodes from source iterator. 
private	TokenNameprivate	
IntegerArray	TokenNameIdentifier	 Integer Array
_nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
new	TokenNamenew	
IntegerArray	TokenNameIdentifier	 Integer Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Index in _nodes of the next node to filter. */	TokenNameCOMMENT_JAVADOC	 Index in _nodes of the next node to filter. 
private	TokenNameprivate	
int	TokenNameint	
_currentIndex	TokenNameIdentifier	 current Index
;	TokenNameSEMICOLON	
/** * The current node in the stylesheet at the time of evaluation. */	TokenNameCOMMENT_JAVADOC	 The current node in the stylesheet at the time of evaluation. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
/** * A reference to the translet. */	TokenNameCOMMENT_JAVADOC	 A reference to the translet. 
private	TokenNameprivate	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
_translet	TokenNameIdentifier	 translet
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CurrentNodeListIterator	TokenNameIdentifier	 Current Node List Iterator
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
CurrentNodeListFilter	TokenNameIdentifier	 Current Node List Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
currentNode	TokenNameIdentifier	 current Node
,	TokenNameCOMMA	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
translet	TokenNameIdentifier	 translet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
!	TokenNameNOT	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
isReverse	TokenNameIdentifier	 is Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
currentNode	TokenNameIdentifier	 current Node
,	TokenNameCOMMA	
translet	TokenNameIdentifier	 translet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CurrentNodeListIterator	TokenNameIdentifier	 Current Node List Iterator
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
boolean	TokenNameboolean	
docOrder	TokenNameIdentifier	 doc Order
,	TokenNameCOMMA	
CurrentNodeListFilter	TokenNameIdentifier	 Current Node List Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
currentNode	TokenNameIdentifier	 current Node
,	TokenNameCOMMA	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
translet	TokenNameIdentifier	 translet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
_filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
_translet	TokenNameIdentifier	 translet
=	TokenNameEQUAL	
translet	TokenNameIdentifier	 translet
;	TokenNameSEMICOLON	
_docOrder	TokenNameIdentifier	 doc Order
=	TokenNameEQUAL	
docOrder	TokenNameIdentifier	 doc Order
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
forceNaturalOrder	TokenNameIdentifier	 force Natural Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_docOrder	TokenNameIdentifier	 doc Order
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
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
boolean	TokenNameboolean	
isReverse	TokenNameIdentifier	 is Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
_docOrder	TokenNameIdentifier	 doc Order
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
CurrentNodeListIterator	TokenNameIdentifier	 Current Node List Iterator
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CurrentNodeListIterator	TokenNameIdentifier	 Current Node List Iterator
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
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentIndex	TokenNameIdentifier	 current Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
final	TokenNamefinal	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
translet	TokenNameIdentifier	 translet
=	TokenNameEQUAL	
_translet	TokenNameIdentifier	 translet
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
_currentIndex	TokenNameIdentifier	 current Index
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
_docOrder	TokenNameIdentifier	 doc Order
?	TokenNameQUESTION	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
last	TokenNameIdentifier	 last
-	TokenNameMINUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// note increment 	TokenNameCOMMENT_LINE	note increment 
if	TokenNameif	
(	TokenNameLPAREN	
_filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
test	TokenNameIdentifier	 test
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
,	TokenNameCOMMA	
currentNode	TokenNameIdentifier	 current Node
,	TokenNameCOMMA	
translet	TokenNameIdentifier	 translet
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentIndex	TokenNameIdentifier	 current Index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
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
_currentIndex	TokenNameIdentifier	 current Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
_last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
computePositionOfLast	TokenNameIdentifier	 compute Position Of Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_last	TokenNameIdentifier	 last
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
_currentIndex	TokenNameIdentifier	 current Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentIndex	TokenNameIdentifier	 current Index
=	TokenNameEQUAL	
_markedNode	TokenNameIdentifier	 marked Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
computePositionOfLast	TokenNameIdentifier	 compute Position Of Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
currNode	TokenNameIdentifier	 curr Node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
final	TokenNamefinal	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
translet	TokenNameIdentifier	 translet
=	TokenNameEQUAL	
_translet	TokenNameIdentifier	 translet
;	TokenNameSEMICOLON	
int	TokenNameint	
lastPosition	TokenNameIdentifier	 last Position
=	TokenNameEQUAL	
_position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
_currentIndex	TokenNameIdentifier	 current Index
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
_docOrder	TokenNameIdentifier	 doc Order
?	TokenNameQUESTION	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
last	TokenNameIdentifier	 last
-	TokenNameMINUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// note increment 	TokenNameCOMMENT_LINE	note increment 
if	TokenNameif	
(	TokenNameLPAREN	
_filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
test	TokenNameIdentifier	 test
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
,	TokenNameCOMMA	
currNode	TokenNameIdentifier	 curr Node
,	TokenNameCOMMA	
translet	TokenNameIdentifier	 translet
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastPosition	TokenNameIdentifier	 last Position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
lastPosition	TokenNameIdentifier	 last Position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
