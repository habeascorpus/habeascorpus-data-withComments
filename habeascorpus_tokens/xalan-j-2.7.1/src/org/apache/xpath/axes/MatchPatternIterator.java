/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: MatchPatternIterator.java 469314 2006-10-30 23:31:59Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: MatchPatternIterator.java 469314 2006-10-30 23:31:59Z minchau $ 
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
Axis	TokenNameIdentifier	 Axis
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
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
NodeTest	TokenNameIdentifier	 Node Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
StepPattern	TokenNameIdentifier	 Step Pattern
;	TokenNameSEMICOLON	
/** * This class treats a * <a href="http://www.w3.org/TR/xpath#location-paths">LocationPath</a> as a * filtered iteration over the tree, evaluating each node in a super axis * traversal against the LocationPath interpreted as a match pattern. This * class is useful to find nodes in document order that are complex paths * whose steps probably criss-cross each other. */	TokenNameCOMMENT_JAVADOC	 This class treats a <a href="http://www.w3.org/TR/xpath#location-paths">LocationPath</a> as a filtered iteration over the tree, evaluating each node in a super axis traversal against the LocationPath interpreted as a match pattern. This class is useful to find nodes in document order that are complex paths whose steps probably criss-cross each other. 
public	TokenNamepublic	
class	TokenNameclass	
MatchPatternIterator	TokenNameIdentifier	 Match Pattern Iterator
extends	TokenNameextends	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
5201153767396296474L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** This is the select pattern, translated into a match pattern. */	TokenNameCOMMENT_JAVADOC	 This is the select pattern, translated into a match pattern. 
protected	TokenNameprotected	
StepPattern	TokenNameIdentifier	 Step Pattern
m_pattern	TokenNameIdentifier	 m pattern
;	TokenNameSEMICOLON	
/** The traversal axis from where the nodes will be filtered. */	TokenNameCOMMENT_JAVADOC	 The traversal axis from where the nodes will be filtered. 
protected	TokenNameprotected	
int	TokenNameint	
m_superAxis	TokenNameIdentifier	 m super Axis
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The DTM inner traversal class, that corresponds to the super axis. */	TokenNameCOMMENT_JAVADOC	 The DTM inner traversal class, that corresponds to the super axis. 
protected	TokenNameprotected	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
m_traverser	TokenNameIdentifier	 m traverser
;	TokenNameSEMICOLON	
/** DEBUG flag for diagnostic dumps. */	TokenNameCOMMENT_JAVADOC	 DEBUG flag for diagnostic dumps. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// protected int m_nsElemBase = DTM.NULL; 	TokenNameCOMMENT_LINE	protected int m_nsElemBase = DTM.NULL; 
/** * Create a LocPathIterator object, including creation * of step walkers from the opcode list, and call back * into the Compiler to create predicate expressions. * * @param compiler The Compiler which is creating * this expression. * @param opPos The position of this iterator in the * opcode list from the compiler. * @param analysis Analysis bits that give general information about the * LocationPath. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a LocPathIterator object, including creation of step walkers from the opcode list, and call back into the Compiler to create predicate expressions. * @param compiler The Compiler which is creating this expression. @param opPos The position of this iterator in the opcode list from the compiler. @param analysis Analysis bits that give general information about the LocationPath. * @throws javax.xml.transform.TransformerException 
MatchPatternIterator	TokenNameIdentifier	 Match Pattern Iterator
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
,	TokenNameCOMMA	
false	TokenNamefalse	
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
m_pattern	TokenNameIdentifier	 m pattern
=	TokenNameEQUAL	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
loadSteps	TokenNameIdentifier	 load Steps
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
firstStepPos	TokenNameIdentifier	 first Step Pos
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
fromRoot	TokenNameIdentifier	 from Root
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
walkBack	TokenNameIdentifier	 walk Back
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
walkDescendants	TokenNameIdentifier	 walk Descendants
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
walkAttributes	TokenNameIdentifier	 walk Attributes
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
analysis	TokenNameIdentifier	 analysis
&	TokenNameAND	
(	TokenNameLPAREN	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_ROOT	TokenNameIdentifier	 BIT  ROOT
|	TokenNameOR	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_ANY_DESCENDANT_FROM_ROOT	TokenNameIdentifier	 BIT  ANY  DESCENDANT  FROM  ROOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
fromRoot	TokenNameIdentifier	 from Root
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
analysis	TokenNameIdentifier	 analysis
&	TokenNameAND	
(	TokenNameLPAREN	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_ANCESTOR	TokenNameIdentifier	 BIT  ANCESTOR
|	TokenNameOR	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_ANCESTOR_OR_SELF	TokenNameIdentifier	 BIT  ANCESTOR  OR  SELF
|	TokenNameOR	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_PRECEDING	TokenNameIdentifier	 BIT  PRECEDING
|	TokenNameOR	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_PRECEDING_SIBLING	TokenNameIdentifier	 BIT  PRECEDING  SIBLING
|	TokenNameOR	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_FOLLOWING	TokenNameIdentifier	 BIT  FOLLOWING
|	TokenNameOR	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_FOLLOWING_SIBLING	TokenNameIdentifier	 BIT  FOLLOWING  SIBLING
|	TokenNameOR	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_PARENT	TokenNameIdentifier	 BIT  PARENT
|	TokenNameOR	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_FILTER	TokenNameIdentifier	 BIT  FILTER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
walkBack	TokenNameIdentifier	 walk Back
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
analysis	TokenNameIdentifier	 analysis
&	TokenNameAND	
(	TokenNameLPAREN	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_DESCENDANT_OR_SELF	TokenNameIdentifier	 BIT  DESCENDANT  OR  SELF
|	TokenNameOR	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_DESCENDANT	TokenNameIdentifier	 BIT  DESCENDANT
|	TokenNameOR	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_CHILD	TokenNameIdentifier	 BIT  CHILD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
walkDescendants	TokenNameIdentifier	 walk Descendants
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
analysis	TokenNameIdentifier	 analysis
&	TokenNameAND	
(	TokenNameLPAREN	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_ATTRIBUTE	TokenNameIdentifier	 BIT  ATTRIBUTE
|	TokenNameOR	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_NAMESPACE	TokenNameIdentifier	 BIT  NAMESPACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
walkAttributes	TokenNameIdentifier	 walk Attributes
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
false	TokenNamefalse	
||	TokenNameOR_OR	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"analysis: "	TokenNameStringLiteral	analysis: 
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toBinaryString	TokenNameIdentifier	 to Binary String
(	TokenNameLPAREN	
analysis	TokenNameIdentifier	 analysis
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
getAnalysisString	TokenNameIdentifier	 get Analysis String
(	TokenNameLPAREN	
analysis	TokenNameIdentifier	 analysis
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fromRoot	TokenNameIdentifier	 from Root
||	TokenNameOR_OR	
walkBack	TokenNameIdentifier	 walk Back
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
walkAttributes	TokenNameIdentifier	 walk Attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_superAxis	TokenNameIdentifier	 m super Axis
=	TokenNameEQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ALL	TokenNameIdentifier	 ALL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_superAxis	TokenNameIdentifier	 m super Axis
=	TokenNameEQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANTSFROMROOT	TokenNameIdentifier	 DESCENDANTSFROMROOT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
walkDescendants	TokenNameIdentifier	 walk Descendants
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
walkAttributes	TokenNameIdentifier	 walk Attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_superAxis	TokenNameIdentifier	 m super Axis
=	TokenNameEQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ALLFROMNODE	TokenNameIdentifier	 ALLFROMNODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_superAxis	TokenNameIdentifier	 m super Axis
=	TokenNameEQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANTORSELF	TokenNameIdentifier	 DESCENDANTORSELF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_superAxis	TokenNameIdentifier	 m super Axis
=	TokenNameEQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ALL	TokenNameIdentifier	 ALL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
false	TokenNamefalse	
||	TokenNameOR_OR	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"axis: "	TokenNameStringLiteral	axis: 
+	TokenNamePLUS	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
getNames	TokenNameIdentifier	 get Names
(	TokenNameLPAREN	
m_superAxis	TokenNameIdentifier	 m super Axis
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
m_traverser	TokenNameIdentifier	 m traverser
=	TokenNameEQUAL	
m_cdtm	TokenNameIdentifier	 m cdtm
.	TokenNameDOT	
getAxisTraverser	TokenNameIdentifier	 get Axis Traverser
(	TokenNameLPAREN	
m_superAxis	TokenNameIdentifier	 m super Axis
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
m_traverser	TokenNameIdentifier	 m traverser
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
/** * Get the next node via getNextXXX. Bottlenecked for derived class override. * @return The next node on the axis, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Get the next node via getNextXXX. Bottlenecked for derived class override. @return The next node on the axis, or DTM.NULL. 
protected	TokenNameprotected	
int	TokenNameint	
getNextNode	TokenNameIdentifier	 get Next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lastFetched	TokenNameIdentifier	 m last Fetched
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
m_lastFetched	TokenNameIdentifier	 m last Fetched
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_traverser	TokenNameIdentifier	 m traverser
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
m_context	TokenNameIdentifier	 m context
)	TokenNameRPAREN	
:	TokenNameCOLON	
m_traverser	TokenNameIdentifier	 m traverser
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
m_context	TokenNameIdentifier	 m context
,	TokenNameCOMMA	
m_lastFetched	TokenNameIdentifier	 m last Fetched
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_lastFetched	TokenNameIdentifier	 m last Fetched
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next node in the set and advances the position of the * iterator in the set. After a NodeIterator is created, the first call * to nextNode() returns the first node in the set. * @return The next <code>Node</code> in the set being iterated over, or * <code>null</code> if there are no more members in that set. */	TokenNameCOMMENT_JAVADOC	 Returns the next node in the set and advances the position of the iterator in the set. After a NodeIterator is created, the first call to nextNode() returns the first node in the set. @return The next <code>Node</code> in the set being iterated over, or <code>null</code> if there are no more members in that set. 
public	TokenNamepublic	
int	TokenNameint	
nextNode	TokenNameIdentifier	 next Node
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
;	TokenNameSEMICOLON	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
VariableStack	TokenNameIdentifier	 Variable Stack
vars	TokenNameIdentifier	 vars
;	TokenNameSEMICOLON	
int	TokenNameint	
savedStart	TokenNameIdentifier	 saved Start
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
m_stackFrame	TokenNameIdentifier	 m stack Frame
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vars	TokenNameIdentifier	 vars
=	TokenNameEQUAL	
m_execContext	TokenNameIdentifier	 m exec Context
.	TokenNameDOT	
getVarStack	TokenNameIdentifier	 get Var Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// These three statements need to be combined into one operation. 	TokenNameCOMMENT_LINE	These three statements need to be combined into one operation. 
savedStart	TokenNameIdentifier	 saved Start
=	TokenNameEQUAL	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
getStackFrame	TokenNameIdentifier	 get Stack Frame
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
setStackFrame	TokenNameIdentifier	 set Stack Frame
(	TokenNameLPAREN	
m_stackFrame	TokenNameIdentifier	 m stack Frame
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Yuck. Just to shut up the compiler! 	TokenNameCOMMENT_LINE	Yuck. Just to shut up the compiler! 
vars	TokenNameIdentifier	 vars
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
savedStart	TokenNameIdentifier	 saved Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"m_pattern"	TokenNameStringLiteral	m_pattern
+	TokenNamePLUS	
m_pattern	TokenNameIdentifier	 m pattern
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
getNextNode	TokenNameIdentifier	 get Next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
==	TokenNameEQUAL_EQUAL	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
m_execContext	TokenNameIdentifier	 m exec Context
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
else	TokenNameelse	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"next: "	TokenNameStringLiteral	next: 
+	TokenNamePLUS	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"name: "	TokenNameStringLiteral	name: 
+	TokenNamePLUS	
m_cdtm	TokenNameIdentifier	 m cdtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
incrementCurrentPos	TokenNameIdentifier	 increment Current Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_foundLast	TokenNameIdentifier	 m found Last
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
m_stackFrame	TokenNameIdentifier	 m stack Frame
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// These two statements need to be combined into one operation. 	TokenNameCOMMENT_LINE	These two statements need to be combined into one operation. 
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
setStackFrame	TokenNameIdentifier	 set Stack Frame
(	TokenNameLPAREN	
savedStart	TokenNameIdentifier	 saved Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test whether a specified node is visible in the logical view of a * TreeWalker or NodeIterator. This function will be called by the * implementation of TreeWalker and NodeIterator; it is not intended to * be called directly from user code. * @param n The node to check to see if it passes the filter or not. * @return a constant to determine whether the node is accepted, * rejected, or skipped, as defined above . */	TokenNameCOMMENT_JAVADOC	 Test whether a specified node is visible in the logical view of a TreeWalker or NodeIterator. This function will be called by the implementation of TreeWalker and NodeIterator; it is not intended to be called directly from user code. @param n The node to check to see if it passes the filter or not. @return a constant to determine whether the node is accepted, rejected, or skipped, as defined above . 
public	TokenNamepublic	
short	TokenNameshort	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushIteratorRoot	TokenNameIdentifier	 push Iterator Root
(	TokenNameLPAREN	
m_context	TokenNameIdentifier	 m context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"traverser: "	TokenNameStringLiteral	traverser: 
+	TokenNamePLUS	
m_traverser	TokenNameIdentifier	 m traverser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"node: "	TokenNameStringLiteral	node: 
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
m_cdtm	TokenNameIdentifier	 m cdtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if(m_cdtm.getNodeName(n).equals("near-east")) 	TokenNameCOMMENT_LINE	if(m_cdtm.getNodeName(n).equals("near-east")) 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"pattern: "	TokenNameStringLiteral	pattern: 
+	TokenNamePLUS	
m_pattern	TokenNameIdentifier	 m pattern
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pattern	TokenNameIdentifier	 m pattern
.	TokenNameDOT	
debugWhatToShow	TokenNameIdentifier	 debug What To Show
(	TokenNameLPAREN	
m_pattern	TokenNameIdentifier	 m pattern
.	TokenNameDOT	
getWhatToShow	TokenNameIdentifier	 get What To Show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XObject	TokenNameIdentifier	 X Object
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
m_pattern	TokenNameIdentifier	 m pattern
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("analysis: "+Integer.toBinaryString(m_analysis)); 	TokenNameCOMMENT_LINE	System.out.println("analysis: "+Integer.toBinaryString(m_analysis)); 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"score: "	TokenNameStringLiteral	score: 
+	TokenNamePLUS	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"skip: "	TokenNameStringLiteral	skip: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
==	TokenNameEQUAL_EQUAL	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println("\n::acceptNode - score: "+score.num()+"::"); 	TokenNameCOMMENT_LINE	System.out.println("\n::acceptNode - score: "+score.num()+"::"); 
return	TokenNamereturn	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
==	TokenNameEQUAL_EQUAL	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
)	TokenNameRPAREN	
?	TokenNameQUESTION	
DTMIterator	TokenNameIdentifier	 DTM Iterator
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
:	TokenNameCOLON	
DTMIterator	TokenNameIdentifier	 DTM Iterator
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: Fix this. 	TokenNameCOMMENT_LINE	TODO: Fix this. 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentNode	TokenNameIdentifier	 pop Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popIteratorRoot	TokenNameIdentifier	 pop Iterator Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
