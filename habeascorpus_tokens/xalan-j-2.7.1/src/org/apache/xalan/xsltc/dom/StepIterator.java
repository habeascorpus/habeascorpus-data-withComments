/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: StepIterator.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: StepIterator.java 468651 2006-10-28 07:04:25Z minchau $ 
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
/** * A step iterator is used to evaluate expressions like "BOOK/TITLE". * A better name for this iterator would have been ParentIterator since * both "BOOK" and "TITLE" are steps in XPath lingo. Step iterators are * constructed from two other iterators which we are going to refer to * as "outer" and "inner". Every node from the outer iterator (the one * for BOOK in our example) is used to initialize the inner iterator. * After this initialization, every node from the inner iterator is * returned (in essence, implementing a "nested loop"). * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author Erwin Bolwidt <ejb@klomp.org> * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 A step iterator is used to evaluate expressions like "BOOK/TITLE". A better name for this iterator would have been ParentIterator since both "BOOK" and "TITLE" are steps in XPath lingo. Step iterators are constructed from two other iterators which we are going to refer to as "outer" and "inner". Every node from the outer iterator (the one for BOOK in our example) is used to initialize the inner iterator. After this initialization, every node from the inner iterator is returned (in essence, implementing a "nested loop"). @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author Erwin Bolwidt <ejb@klomp.org> @author Morten Jorgensen 
public	TokenNamepublic	
class	TokenNameclass	
StepIterator	TokenNameIdentifier	 Step Iterator
extends	TokenNameextends	
DTMAxisIteratorBase	TokenNameIdentifier	 DTM Axis Iterator Base
{	TokenNameLBRACE	
/** * A reference to the "outer" iterator. */	TokenNameCOMMENT_JAVADOC	 A reference to the "outer" iterator. 
protected	TokenNameprotected	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
_source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
/** * A reference to the "inner" iterator. */	TokenNameCOMMENT_JAVADOC	 A reference to the "inner" iterator. 
protected	TokenNameprotected	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
_iterator	TokenNameIdentifier	 iterator
;	TokenNameSEMICOLON	
/** * Temp variable to store a marked position. */	TokenNameCOMMENT_JAVADOC	 Temp variable to store a marked position. 
private	TokenNameprivate	
int	TokenNameint	
_pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StepIterator	TokenNameIdentifier	 Step Iterator
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
iterator	TokenNameIdentifier	 iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
_iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
;	TokenNameSEMICOLON	
// System.out.println("SI source = " + source + " this = " + this); 	TokenNameCOMMENT_LINE	System.out.println("SI source = " + source + " this = " + this); 
// System.out.println("SI iterator = " + iterator + " this = " + this); 	TokenNameCOMMENT_LINE	System.out.println("SI iterator = " + iterator + " this = " + this); 
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
_iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
setRestartable	TokenNameIdentifier	 set Restartable
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// must be restartable 	TokenNameCOMMENT_LINE	must be restartable 
}	TokenNameRBRACE	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
cloneIterator	TokenNameIdentifier	 clone Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
StepIterator	TokenNameIdentifier	 Step Iterator
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StepIterator	TokenNameIdentifier	 Step Iterator
)	TokenNameRPAREN	
super	TokenNamesuper	
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
_iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
_iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
cloneIterator	TokenNameIdentifier	 clone Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
_iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
setRestartable	TokenNameIdentifier	 set Restartable
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// must be restartable 	TokenNameCOMMENT_LINE	must be restartable 
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
// Set start node for left-hand iterator... 	TokenNameCOMMENT_LINE	Set start node for left-hand iterator... 
_source	TokenNameIdentifier	 source
.	TokenNameDOT	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ... and get start node for right-hand iterator from left-hand, 	TokenNameCOMMENT_LINE	... and get start node for right-hand iterator from left-hand, 
// with special case for //* path - see ParentLocationPath 	TokenNameCOMMENT_LINE	with special case for //* path - see ParentLocationPath 
_iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
_includeSelf	TokenNameIdentifier	 include Self
?	TokenNameQUESTION	
_startNode	TokenNameIdentifier	 start Node
:	TokenNameCOLON	
_source	TokenNameIdentifier	 source
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_source	TokenNameIdentifier	 source
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Special case for //* path - see ParentLocationPath 	TokenNameCOMMENT_LINE	Special case for //* path - see ParentLocationPath 
_iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
_includeSelf	TokenNameIdentifier	 include Self
?	TokenNameQUESTION	
_startNode	TokenNameIdentifier	 start Node
:	TokenNameCOLON	
_source	TokenNameIdentifier	 source
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Try to get another node from the right-hand iterator 	TokenNameCOMMENT_LINE	Try to get another node from the right-hand iterator 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If not, get the next starting point from left-hand iterator... 	TokenNameCOMMENT_LINE	If not, get the next starting point from left-hand iterator... 
else	TokenNameelse	
if	TokenNameif	
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
==	TokenNameEQUAL_EQUAL	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ...and pass it on to the right-hand iterator 	TokenNameCOMMENT_LINE	...and pass it on to the right-hand iterator 
else	TokenNameelse	
{	TokenNameLBRACE	
_iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_source	TokenNameIdentifier	 source
.	TokenNameDOT	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//_pos = _position; 	TokenNameCOMMENT_LINE	_pos = _position; 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_source	TokenNameIdentifier	 source
.	TokenNameDOT	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//_position = _pos; 	TokenNameCOMMENT_LINE	_position = _pos; 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
