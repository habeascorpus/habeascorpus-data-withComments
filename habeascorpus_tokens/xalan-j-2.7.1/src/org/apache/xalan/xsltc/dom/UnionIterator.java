/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: UnionIterator.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: UnionIterator.java 468651 2006-10-28 07:04:25Z minchau $ 
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
DOM	TokenNameIdentifier	 DOM
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
/** * UnionIterator takes a set of NodeIterators and produces * a merged NodeSet in document order with duplicates removed * The individual iterators are supposed to generate nodes * in document order * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 UnionIterator takes a set of NodeIterators and produces a merged NodeSet in document order with duplicates removed The individual iterators are supposed to generate nodes in document order @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
UnionIterator	TokenNameIdentifier	 Union Iterator
extends	TokenNameextends	
MultiValuedNodeHeapIterator	TokenNameIdentifier	 Multi Valued Node Heap Iterator
{	TokenNameLBRACE	
/** wrapper for NodeIterators to support iterator comparison on the value of their next() method */	TokenNameCOMMENT_JAVADOC	 wrapper for NodeIterators to support iterator comparison on the value of their next() method 
final	TokenNamefinal	
private	TokenNameprivate	
DOM	TokenNameIdentifier	 DOM
_dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
class	TokenNameclass	
LookAheadIterator	TokenNameIdentifier	 Look Ahead Iterator
extends	TokenNameextends	
MultiValuedNodeHeapIterator	TokenNameIdentifier	 Multi Valued Node Heap Iterator
.	TokenNameDOT	
HeapNode	TokenNameIdentifier	 Heap Node
{	TokenNameLBRACE	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
iterator	TokenNameIdentifier	 iterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LookAheadIterator	TokenNameIdentifier	 Look Ahead Iterator
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
iterator	TokenNameIdentifier	 iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
step	TokenNameIdentifier	 step
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
HeapNode	TokenNameIdentifier	 Heap Node
cloneHeapNode	TokenNameIdentifier	 clone Heap Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LookAheadIterator	TokenNameIdentifier	 Look Ahead Iterator
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LookAheadIterator	TokenNameIdentifier	 Look Ahead Iterator
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneHeapNode	TokenNameIdentifier	 clone Heap Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
cloneIterator	TokenNameIdentifier	 clone Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isLessThan	TokenNameIdentifier	 is Less Than
(	TokenNameLPAREN	
HeapNode	TokenNameIdentifier	 Heap Node
heapNode	TokenNameIdentifier	 heap Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LookAheadIterator	TokenNameIdentifier	 Look Ahead Iterator
comparand	TokenNameIdentifier	 comparand
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LookAheadIterator	TokenNameIdentifier	 Look Ahead Iterator
)	TokenNameRPAREN	
heapNode	TokenNameIdentifier	 heap Node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
_node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
heapNode	TokenNameIdentifier	 heap Node
.	TokenNameDOT	
_node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
HeapNode	TokenNameIdentifier	 Heap Node
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
HeapNode	TokenNameIdentifier	 Heap Node
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of LookAheadIterator 	TokenNameCOMMENT_LINE	end of LookAheadIterator 
public	TokenNamepublic	
UnionIterator	TokenNameIdentifier	 Union Iterator
(	TokenNameLPAREN	
DOM	TokenNameIdentifier	 DOM
dom	TokenNameIdentifier	 dom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
UnionIterator	TokenNameIdentifier	 Union Iterator
addIterator	TokenNameIdentifier	 add Iterator
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
iterator	TokenNameIdentifier	 iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addHeapNode	TokenNameIdentifier	 add Heap Node
(	TokenNameLPAREN	
new	TokenNamenew	
LookAheadIterator	TokenNameIdentifier	 Look Ahead Iterator
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
