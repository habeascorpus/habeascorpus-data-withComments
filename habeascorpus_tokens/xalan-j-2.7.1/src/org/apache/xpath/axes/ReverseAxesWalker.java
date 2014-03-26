/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ReverseAxesWalker.java 513117 2007-03-01 03:28:52Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ReverseAxesWalker.java 513117 2007-03-01 03:28:52Z minchau $ 
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
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
/** * Walker for a reverse axes. * @see <a href="http://www.w3.org/TR/xpath#predicates">XPath 2.4 Predicates</a> */	TokenNameCOMMENT_JAVADOC	 Walker for a reverse axes. @see <a href="http://www.w3.org/TR/xpath#predicates">XPath 2.4 Predicates</a> 
public	TokenNamepublic	
class	TokenNameclass	
ReverseAxesWalker	TokenNameIdentifier	 Reverse Axes Walker
extends	TokenNameextends	
AxesWalker	TokenNameIdentifier	 Axes Walker
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
2847007647832768941L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Construct an AxesWalker using a LocPathIterator. * * @param locPathIterator The location path iterator that 'owns' this walker. */	TokenNameCOMMENT_JAVADOC	 Construct an AxesWalker using a LocPathIterator. * @param locPathIterator The location path iterator that 'owns' this walker. 
ReverseAxesWalker	TokenNameIdentifier	 Reverse Axes Walker
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
locPathIterator	TokenNameIdentifier	 loc Path Iterator
,	TokenNameCOMMA	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
locPathIterator	TokenNameIdentifier	 loc Path Iterator
,	TokenNameCOMMA	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the root node of the TreeWalker. * (Not part of the DOM2 TreeWalker interface). * * @param root The context node of this step. */	TokenNameCOMMENT_JAVADOC	 Set the root node of the TreeWalker. (Not part of the DOM2 TreeWalker interface). * @param root The context node of this step. 
public	TokenNamepublic	
void	TokenNamevoid	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
int	TokenNameint	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_iterator	TokenNameIdentifier	 m iterator
=	TokenNameEQUAL	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
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
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Detaches the walker from the set which it iterated over, releasing * any computational resources and placing the iterator in the INVALID * state. */	TokenNameCOMMENT_JAVADOC	 Detaches the walker from the set which it iterated over, releasing any computational resources and placing the iterator in the INVALID state. 
public	TokenNamepublic	
void	TokenNamevoid	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_iterator	TokenNameIdentifier	 m iterator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in document order on the axes. * * @return the next node in document order on the axes, or null. */	TokenNameCOMMENT_JAVADOC	 Get the next node in document order on the axes. * @return the next node in document order on the axes, or null. 
protected	TokenNameprotected	
int	TokenNameint	
getNextNode	TokenNameIdentifier	 get Next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_foundLast	TokenNameIdentifier	 m found Last
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
m_iterator	TokenNameIdentifier	 m iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_isFresh	TokenNameIdentifier	 m is Fresh
)	TokenNameRPAREN	
m_isFresh	TokenNameIdentifier	 m is Fresh
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_foundLast	TokenNameIdentifier	 m found Last
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
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
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Set the root node of the TreeWalker. 	TokenNameCOMMENT_LINE	* Set the root node of the TreeWalker. 
// * 	TokenNameCOMMENT_LINE	* 
// * @param root The context node of this step. 	TokenNameCOMMENT_LINE	* @param root The context node of this step. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public void setRoot(int root) 	TokenNameCOMMENT_LINE	public void setRoot(int root) 
// { 	TokenNameCOMMENT_LINE	{ 
// super.setRoot(root); 	TokenNameCOMMENT_LINE	super.setRoot(root); 
// } 	TokenNameCOMMENT_LINE	} 
/** * Get the current sub-context position. In order to do the * reverse axes count, for the moment this re-searches the axes * up to the predicate. An optimization on this is to cache * the nodes searched, but, for the moment, this case is probably * rare enough that the added complexity isn't worth it. * * @param predicateIndex The predicate index of the proximity position. * * @return The pridicate index, or -1. */	TokenNameCOMMENT_JAVADOC	 Get the current sub-context position. In order to do the reverse axes count, for the moment this re-searches the axes up to the predicate. An optimization on this is to cache the nodes searched, but, for the moment, this case is probably rare enough that the added complexity isn't worth it. * @param predicateIndex The predicate index of the proximity position. * @return The pridicate index, or -1. 
protected	TokenNameprotected	
int	TokenNameint	
getProximityPosition	TokenNameIdentifier	 get Proximity Position
(	TokenNameLPAREN	
int	TokenNameint	
predicateIndex	TokenNameIdentifier	 predicate Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
[	TokenNameLBRACKET	
predicateIndex	TokenNameIdentifier	 predicate Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AxesWalker	TokenNameIdentifier	 Axes Walker
savedWalker	TokenNameIdentifier	 saved Walker
=	TokenNameEQUAL	
wi	TokenNameIdentifier	 wi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLastUsedWalker	TokenNameIdentifier	 get Last Used Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ReverseAxesWalker	TokenNameIdentifier	 Reverse Axes Walker
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ReverseAxesWalker	TokenNameIdentifier	 Reverse Axes Walker
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setPredicateCount	TokenNameIdentifier	 set Predicate Count
(	TokenNameLPAREN	
predicateIndex	TokenNameIdentifier	 predicate Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setPrevWalker	TokenNameIdentifier	 set Prev Walker
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setNextWalker	TokenNameIdentifier	 set Next Walker
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wi	TokenNameIdentifier	 wi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLastUsedWalker	TokenNameIdentifier	 set Last Used Walker
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Count 'em all 	TokenNameCOMMENT_LINE	Count 'em all 
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
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
=	TokenNameEQUAL	
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
wi	TokenNameIdentifier	 wi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLastUsedWalker	TokenNameIdentifier	 set Last Used Walker
(	TokenNameLPAREN	
savedWalker	TokenNameIdentifier	 saved Walker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
/** * Get the number of nodes in this node list. The function is probably ill * named? * * * @param xctxt The XPath runtime context. * * @return the number of nodes in this node list. */	TokenNameCOMMENT_JAVADOC	 Get the number of nodes in this node list. The function is probably ill named? * @param xctxt The XPath runtime context. * @return the number of nodes in this node list. 
public	TokenNamepublic	
int	TokenNameint	
getLastPos	TokenNameIdentifier	 get Last Pos
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
AxesWalker	TokenNameIdentifier	 Axes Walker
savedWalker	TokenNameIdentifier	 saved Walker
=	TokenNameEQUAL	
wi	TokenNameIdentifier	 wi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLastUsedWalker	TokenNameIdentifier	 get Last Used Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ReverseAxesWalker	TokenNameIdentifier	 Reverse Axes Walker
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ReverseAxesWalker	TokenNameIdentifier	 Reverse Axes Walker
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setPredicateCount	TokenNameIdentifier	 set Predicate Count
(	TokenNameLPAREN	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setPrevWalker	TokenNameIdentifier	 set Prev Walker
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setNextWalker	TokenNameIdentifier	 set Next Walker
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wi	TokenNameIdentifier	 wi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLastUsedWalker	TokenNameIdentifier	 set Last Used Walker
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Count 'em all 	TokenNameCOMMENT_LINE	Count 'em all 
// count = 1; 	TokenNameCOMMENT_LINE	count = 1; 
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
wi	TokenNameIdentifier	 wi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLastUsedWalker	TokenNameIdentifier	 set Last Used Walker
(	TokenNameLPAREN	
savedWalker	TokenNameIdentifier	 saved Walker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if all the nodes in the iteration well be returned in document * order. * Warning: This can only be called after setRoot has been called! * * @return false. */	TokenNameCOMMENT_JAVADOC	 Returns true if all the nodes in the iteration well be returned in document order. Warning: This can only be called after setRoot has been called! * @return false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDocOrdered	TokenNameIdentifier	 is Doc Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// I think. 	TokenNameCOMMENT_LINE	I think. 
}	TokenNameRBRACE	
/** The DTM inner traversal class, that corresponds to the super axis. */	TokenNameCOMMENT_JAVADOC	 The DTM inner traversal class, that corresponds to the super axis. 
protected	TokenNameprotected	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
m_iterator	TokenNameIdentifier	 m iterator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
