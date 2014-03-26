/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: OneStepIterator.java 469314 2006-10-30 23:31:59Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: OneStepIterator.java 469314 2006-10-30 23:31:59Z minchau $ 
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
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
Expression	TokenNameIdentifier	 Expression
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
Compiler	TokenNameIdentifier	 Compiler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
OpMap	TokenNameIdentifier	 Op Map
;	TokenNameSEMICOLON	
/** * This class implements a general iterator for * those LocationSteps with only one step, and perhaps a predicate. * @see org.apache.xpath.axes#LocPathIterator * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 This class implements a general iterator for those LocationSteps with only one step, and perhaps a predicate. @see org.apache.xpath.axes#LocPathIterator @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
OneStepIterator	TokenNameIdentifier	 One Step Iterator
extends	TokenNameextends	
ChildTestIterator	TokenNameIdentifier	 Child Test Iterator
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
4623710779664998283L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** The traversal axis from where the nodes will be filtered. */	TokenNameCOMMENT_JAVADOC	 The traversal axis from where the nodes will be filtered. 
protected	TokenNameprotected	
int	TokenNameint	
m_axis	TokenNameIdentifier	 m axis
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The DTM inner traversal class, that corresponds to the super axis. */	TokenNameCOMMENT_JAVADOC	 The DTM inner traversal class, that corresponds to the super axis. 
protected	TokenNameprotected	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
m_iterator	TokenNameIdentifier	 m iterator
;	TokenNameSEMICOLON	
/** * Create a OneStepIterator object. * * @param compiler A reference to the Compiler that contains the op map. * @param opPos The position within the op map, which contains the * location path expression for this itterator. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a OneStepIterator object. * @param compiler A reference to the Compiler that contains the op map. @param opPos The position within the op map, which contains the location path expression for this itterator. * @throws javax.xml.transform.TransformerException 
OneStepIterator	TokenNameIdentifier	 One Step Iterator
(	TokenNameLPAREN	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
int	TokenNameint	
analysis	TokenNameIdentifier	 analysis
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
analysis	TokenNameIdentifier	 analysis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
firstStepPos	TokenNameIdentifier	 first Step Pos
=	TokenNameEQUAL	
OpMap	TokenNameIdentifier	 Op Map
.	TokenNameDOT	
getFirstChildPos	TokenNameIdentifier	 get First Child Pos
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axis	TokenNameIdentifier	 m axis
=	TokenNameEQUAL	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
getAxisFromStep	TokenNameIdentifier	 get Axis From Step
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
firstStepPos	TokenNameIdentifier	 first Step Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a OneStepIterator object. * * @param iterator The DTM iterator which this iterator will use. * @param axis One of Axis.Child, etc., or -1 if the axis is unknown. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a OneStepIterator object. * @param iterator The DTM iterator which this iterator will use. @param axis One of Axis.Child, etc., or -1 if the axis is unknown. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
OneStepIterator	TokenNameIdentifier	 One Step Iterator
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
iterator	TokenNameIdentifier	 iterator
,	TokenNameCOMMA	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_iterator	TokenNameIdentifier	 m iterator
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
;	TokenNameSEMICOLON	
m_axis	TokenNameIdentifier	 m axis
=	TokenNameEQUAL	
axis	TokenNameIdentifier	 axis
;	TokenNameSEMICOLON	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
=	TokenNameEQUAL	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
;	TokenNameSEMICOLON	
initNodeTest	TokenNameIdentifier	 init Node Test
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
)	TokenNameRPAREN	
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
super	TokenNamesuper	
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
environment	TokenNameIdentifier	 environment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_axis	TokenNameIdentifier	 m axis
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
m_iterator	TokenNameIdentifier	 m iterator
=	TokenNameEQUAL	
m_cdtm	TokenNameIdentifier	 m cdtm
.	TokenNameDOT	
getAxisIterator	TokenNameIdentifier	 get Axis Iterator
(	TokenNameLPAREN	
m_axis	TokenNameIdentifier	 m axis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_iterator	TokenNameIdentifier	 m iterator
.	TokenNameDOT	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
m_context	TokenNameIdentifier	 m context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Detaches the iterator from the set which it iterated over, releasing * any computational resources and placing the iterator in the INVALID * state. After<code>detach</code> has been invoked, calls to * <code>nextNode</code> or<code>previousNode</code> will raise the * exception INVALID_STATE_ERR. */	TokenNameCOMMENT_JAVADOC	 Detaches the iterator from the set which it iterated over, releasing any computational resources and placing the iterator in the INVALID state. After<code>detach</code> has been invoked, calls to <code>nextNode</code> or<code>previousNode</code> will raise the exception INVALID_STATE_ERR. 
public	TokenNamepublic	
void	TokenNamevoid	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_allowDetach	TokenNameIdentifier	 m allow Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_axis	TokenNameIdentifier	 m axis
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
m_iterator	TokenNameIdentifier	 m iterator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Always call the superclass detach last! 	TokenNameCOMMENT_LINE	Always call the superclass detach last! 
super	TokenNamesuper	
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the next node via getFirstAttribute && getNextAttribute. */	TokenNameCOMMENT_JAVADOC	 Get the next node via getFirstAttribute && getNextAttribute. 
protected	TokenNameprotected	
int	TokenNameint	
getNextNode	TokenNameIdentifier	 get Next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_lastFetched	TokenNameIdentifier	 m last Fetched
=	TokenNameEQUAL	
m_iterator	TokenNameIdentifier	 m iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a cloned iterator. * * @return A new iterator that can be used without mutating this one. * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Get a cloned iterator. * @return A new iterator that can be used without mutating this one. * @throws CloneNotSupportedException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
// Do not access the location path itterator during this operation! 	TokenNameCOMMENT_LINE	Do not access the location path itterator during this operation! 
OneStepIterator	TokenNameIdentifier	 One Step Iterator
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OneStepIterator	TokenNameIdentifier	 One Step Iterator
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_iterator	TokenNameIdentifier	 m iterator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_iterator	TokenNameIdentifier	 m iterator
=	TokenNameEQUAL	
m_iterator	TokenNameIdentifier	 m iterator
.	TokenNameDOT	
cloneIterator	TokenNameIdentifier	 clone Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a cloned Iterator that is reset to the beginning * of the query. * * @return A cloned NodeIterator set of the start of the query. * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Get a cloned Iterator that is reset to the beginning of the query. * @return A cloned NodeIterator set of the start of the query. * @throws CloneNotSupportedException 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
OneStepIterator	TokenNameIdentifier	 One Step Iterator
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OneStepIterator	TokenNameIdentifier	 One Step Iterator
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_iterator	TokenNameIdentifier	 m iterator
=	TokenNameEQUAL	
m_iterator	TokenNameIdentifier	 m iterator
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells if this is a reverse axes. Overrides AxesWalker#isReverseAxes. * * @return true for this class. */	TokenNameCOMMENT_JAVADOC	 Tells if this is a reverse axes. Overrides AxesWalker#isReverseAxes. * @return true for this class. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReverseAxes	TokenNameIdentifier	 is Reverse Axes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_iterator	TokenNameIdentifier	 m iterator
.	TokenNameDOT	
isReverse	TokenNameIdentifier	 is Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current sub-context position. In order to do the * reverse axes count, for the moment this re-searches the axes * up to the predicate. An optimization on this is to cache * the nodes searched, but, for the moment, this case is probably * rare enough that the added complexity isn't worth it. * * @param predicateIndex The predicate index of the proximity position. * * @return The pridicate index, or -1. */	TokenNameCOMMENT_JAVADOC	 Get the current sub-context position. In order to do the reverse axes count, for the moment this re-searches the axes up to the predicate. An optimization on this is to cache the nodes searched, but, for the moment, this case is probably rare enough that the added complexity isn't worth it. * @param predicateIndex The predicate index of the proximity position. * @return The pridicate index, or -1. 
protected	TokenNameprotected	
int	TokenNameint	
getProximityPosition	TokenNameIdentifier	 get Proximity Position
(	TokenNameLPAREN	
int	TokenNameint	
predicateIndex	TokenNameIdentifier	 predicate Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isReverseAxes	TokenNameIdentifier	 is Reverse Axes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getProximityPosition	TokenNameIdentifier	 get Proximity Position
(	TokenNameLPAREN	
predicateIndex	TokenNameIdentifier	 predicate Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// A negative predicate index seems to occur with 	TokenNameCOMMENT_LINE	A negative predicate index seems to occur with 
// (preceding-sibling::*|following-sibling::*)/ancestor::*[position()]/*[position()] 	TokenNameCOMMENT_LINE	(preceding-sibling::*|following-sibling::*)/ancestor::*[position()]/*[position()] 
// -sb 	TokenNameCOMMENT_LINE	-sb 
if	TokenNameif	
(	TokenNameLPAREN	
predicateIndex	TokenNameIdentifier	 predicate Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
[	TokenNameLBRACKET	
predicateIndex	TokenNameIdentifier	 predicate Index
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
OneStepIterator	TokenNameIdentifier	 One Step Iterator
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OneStepIterator	TokenNameIdentifier	 One Step Iterator
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// clone.setPredicateCount(predicateIndex); 	TokenNameCOMMENT_LINE	clone.setPredicateCount(predicateIndex); 
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_predCount	TokenNameIdentifier	 m pred Count
=	TokenNameEQUAL	
predicateIndex	TokenNameIdentifier	 predicate Index
;	TokenNameSEMICOLON	
// Count 'em all 	TokenNameCOMMENT_LINE	Count 'em all 
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
[	TokenNameLBRACKET	
predicateIndex	TokenNameIdentifier	 predicate Index
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// can't happen 	TokenNameCOMMENT_LINE	can't happen 
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentNode	TokenNameIdentifier	 pop Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
[	TokenNameLBRACKET	
predicateIndex	TokenNameIdentifier	 predicate Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The number of nodes in the list. The range of valid child node indices * is 0 to <code>length-1</code> inclusive. * * @return The number of nodes in the list, always greater or equal to zero. */	TokenNameCOMMENT_JAVADOC	 The number of nodes in the list. The range of valid child node indices is 0 to <code>length-1</code> inclusive. * @return The number of nodes in the list, always greater or equal to zero. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isReverseAxes	TokenNameIdentifier	 is Reverse Axes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Tell if this is being called from within a predicate. 	TokenNameCOMMENT_LINE	Tell if this is being called from within a predicate. 
boolean	TokenNameboolean	
isPredicateTest	TokenNameIdentifier	 is Predicate Test
=	TokenNameEQUAL	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
m_execContext	TokenNameIdentifier	 m exec Context
.	TokenNameDOT	
getSubContextList	TokenNameIdentifier	 get Sub Context List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// And get how many total predicates are part of this step. 	TokenNameCOMMENT_LINE	And get how many total predicates are part of this step. 
int	TokenNameint	
predCount	TokenNameIdentifier	 pred Count
=	TokenNameEQUAL	
getPredicateCount	TokenNameIdentifier	 get Predicate Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If we have already calculated the length, and the current predicate 	TokenNameCOMMENT_LINE	If we have already calculated the length, and the current predicate 
// is the first predicate, then return the length. We don't cache 	TokenNameCOMMENT_LINE	is the first predicate, then return the length. We don't cache 
// the anything but the length of the list to the first predicate. 	TokenNameCOMMENT_LINE	the anything but the length of the list to the first predicate. 
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
m_length	TokenNameIdentifier	 m length
&&	TokenNameAND_AND	
isPredicateTest	TokenNameIdentifier	 is Predicate Test
&&	TokenNameAND_AND	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
m_length	TokenNameIdentifier	 m length
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
OneStepIterator	TokenNameIdentifier	 One Step Iterator
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OneStepIterator	TokenNameIdentifier	 One Step Iterator
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_predCount	TokenNameIdentifier	 m pred Count
=	TokenNameEQUAL	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
;	TokenNameSEMICOLON	
int	TokenNameint	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// can't happen 	TokenNameCOMMENT_LINE	can't happen 
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentNode	TokenNameIdentifier	 pop Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isPredicateTest	TokenNameIdentifier	 is Predicate Test
&&	TokenNameAND_AND	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
m_length	TokenNameIdentifier	 m length
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Count backwards one proximity position. * * @param i The predicate index. */	TokenNameCOMMENT_JAVADOC	 Count backwards one proximity position. * @param i The predicate index. 
protected	TokenNameprotected	
void	TokenNamevoid	
countProximityPosition	TokenNameIdentifier	 count Proximity Position
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isReverseAxes	TokenNameIdentifier	 is Reverse Axes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
countProximityPosition	TokenNameIdentifier	 count Proximity Position
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset the iterator. */	TokenNameCOMMENT_JAVADOC	 Reset the iterator. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_iterator	TokenNameIdentifier	 m iterator
)	TokenNameRPAREN	
m_iterator	TokenNameIdentifier	 m iterator
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
m_axis	TokenNameIdentifier	 m axis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see Expression#deepEquals(Expression) */	TokenNameCOMMENT_JAVADOC	 @see Expression#deepEquals(Expression) 
public	TokenNamepublic	
boolean	TokenNameboolean	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
super	TokenNamesuper	
.	TokenNameDOT	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_axis	TokenNameIdentifier	 m axis
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
OneStepIterator	TokenNameIdentifier	 One Step Iterator
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
.	TokenNameDOT	
m_axis	TokenNameIdentifier	 m axis
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
