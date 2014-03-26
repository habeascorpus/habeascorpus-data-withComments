/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DescendantIterator.java 469314 2006-10-30 23:31:59Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DescendantIterator.java 469314 2006-10-30 23:31:59Z minchau $ 
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
OpCodes	TokenNameIdentifier	 Op Codes
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
patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
NodeTest	TokenNameIdentifier	 Node Test
;	TokenNameSEMICOLON	
/** * This class implements an optimized iterator for * descendant, descendant-or-self, or "//foo" patterns. * @see org.apache.xpath.axes.LocPathIterator * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 This class implements an optimized iterator for descendant, descendant-or-self, or "//foo" patterns. @see org.apache.xpath.axes.LocPathIterator @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
DescendantIterator	TokenNameIdentifier	 Descendant Iterator
extends	TokenNameextends	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
1190338607743976938L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Create a DescendantIterator object. * * @param compiler A reference to the Compiler that contains the op map. * @param opPos The position within the op map, which contains the * location path expression for this itterator. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a DescendantIterator object. * @param compiler A reference to the Compiler that contains the op map. @param opPos The position within the op map, which contains the location path expression for this itterator. * @throws javax.xml.transform.TransformerException 
DescendantIterator	TokenNameIdentifier	 Descendant Iterator
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
int	TokenNameint	
stepType	TokenNameIdentifier	 step Type
=	TokenNameEQUAL	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
firstStepPos	TokenNameIdentifier	 first Step Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
orSelf	TokenNameIdentifier	 or Self
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_DESCENDANTS_OR_SELF	TokenNameIdentifier	 FROM  DESCENDANTS  OR  SELF
==	TokenNameEQUAL_EQUAL	
stepType	TokenNameIdentifier	 step Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
fromRoot	TokenNameIdentifier	 from Root
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_SELF	TokenNameIdentifier	 FROM  SELF
==	TokenNameEQUAL_EQUAL	
stepType	TokenNameIdentifier	 step Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
orSelf	TokenNameIdentifier	 or Self
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// firstStepPos += 8; 	TokenNameCOMMENT_LINE	firstStepPos += 8; 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_ROOT	TokenNameIdentifier	 FROM  ROOT
==	TokenNameEQUAL_EQUAL	
stepType	TokenNameIdentifier	 step Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fromRoot	TokenNameIdentifier	 from Root
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Ugly code... will go away when AST work is done. 	TokenNameCOMMENT_LINE	Ugly code... will go away when AST work is done. 
int	TokenNameint	
nextStepPos	TokenNameIdentifier	 next Step Pos
=	TokenNameEQUAL	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getNextStepPos	TokenNameIdentifier	 get Next Step Pos
(	TokenNameLPAREN	
firstStepPos	TokenNameIdentifier	 first Step Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
nextStepPos	TokenNameIdentifier	 next Step Pos
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
FROM_DESCENDANTS_OR_SELF	TokenNameIdentifier	 FROM  DESCENDANTS  OR  SELF
)	TokenNameRPAREN	
orSelf	TokenNameIdentifier	 or Self
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// firstStepPos += 8; 	TokenNameCOMMENT_LINE	firstStepPos += 8; 
}	TokenNameRBRACE	
// Find the position of the last step. 	TokenNameCOMMENT_LINE	Find the position of the last step. 
int	TokenNameint	
nextStepPos	TokenNameIdentifier	 next Step Pos
=	TokenNameEQUAL	
firstStepPos	TokenNameIdentifier	 first Step Pos
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextStepPos	TokenNameIdentifier	 next Step Pos
=	TokenNameEQUAL	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getNextStepPos	TokenNameIdentifier	 get Next Step Pos
(	TokenNameLPAREN	
nextStepPos	TokenNameIdentifier	 next Step Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextStepPos	TokenNameIdentifier	 next Step Pos
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
stepOp	TokenNameIdentifier	 step Op
=	TokenNameEQUAL	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
nextStepPos	TokenNameIdentifier	 next Step Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
ENDOP	TokenNameIdentifier	 ENDOP
!=	TokenNameNOT_EQUAL	
stepOp	TokenNameIdentifier	 step Op
)	TokenNameRPAREN	
firstStepPos	TokenNameIdentifier	 first Step Pos
=	TokenNameEQUAL	
nextStepPos	TokenNameIdentifier	 next Step Pos
;	TokenNameSEMICOLON	
else	TokenNameelse	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Fix for http://nagoya.apache.org/bugzilla/show_bug.cgi?id=1336 	TokenNameCOMMENT_LINE	Fix for http://nagoya.apache.org/bugzilla/show_bug.cgi?id=1336 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
analysis	TokenNameIdentifier	 analysis
&	TokenNameAND	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_CHILD	TokenNameIdentifier	 BIT  CHILD
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
orSelf	TokenNameIdentifier	 or Self
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fromRoot	TokenNameIdentifier	 from Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
orSelf	TokenNameIdentifier	 or Self
)	TokenNameRPAREN	
m_axis	TokenNameIdentifier	 m axis
=	TokenNameEQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANTSORSELFFROMROOT	TokenNameIdentifier	 DESCENDANTSORSELFFROMROOT
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_axis	TokenNameIdentifier	 m axis
=	TokenNameEQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANTSFROMROOT	TokenNameIdentifier	 DESCENDANTSFROMROOT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
orSelf	TokenNameIdentifier	 or Self
)	TokenNameRPAREN	
m_axis	TokenNameIdentifier	 m axis
=	TokenNameEQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANTORSELF	TokenNameIdentifier	 DESCENDANTORSELF
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_axis	TokenNameIdentifier	 m axis
=	TokenNameEQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANT	TokenNameIdentifier	 DESCENDANT
;	TokenNameSEMICOLON	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
=	TokenNameEQUAL	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getWhatToShow	TokenNameIdentifier	 get What To Show
(	TokenNameLPAREN	
firstStepPos	TokenNameIdentifier	 first Step Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
&	TokenNameAND	
(	TokenNameLPAREN	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ATTRIBUTE	TokenNameIdentifier	 SHOW  ATTRIBUTE
|	TokenNameOR	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ELEMENT	TokenNameIdentifier	 SHOW  ELEMENT
|	TokenNameOR	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_PROCESSING_INSTRUCTION	TokenNameIdentifier	 SHOW  PROCESSING  INSTRUCTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
==	TokenNameEQUAL_EQUAL	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
initNodeTest	TokenNameIdentifier	 init Node Test
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
initNodeTest	TokenNameIdentifier	 init Node Test
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
,	TokenNameCOMMA	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getStepNS	TokenNameIdentifier	 get Step NS
(	TokenNameLPAREN	
firstStepPos	TokenNameIdentifier	 first Step Pos
)	TokenNameRPAREN	
,	TokenNameCOMMA	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getStepLocalName	TokenNameIdentifier	 get Step Local Name
(	TokenNameLPAREN	
firstStepPos	TokenNameIdentifier	 first Step Pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
initPredicateInfo	TokenNameIdentifier	 init Predicate Info
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
firstStepPos	TokenNameIdentifier	 first Step Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a DescendantIterator object. * */	TokenNameCOMMENT_JAVADOC	 Create a DescendantIterator object. 
public	TokenNamepublic	
DescendantIterator	TokenNameIdentifier	 Descendant Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axis	TokenNameIdentifier	 m axis
=	TokenNameEQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANTSORSELFFROMROOT	TokenNameIdentifier	 DESCENDANTSORSELFFROMROOT
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
/** * Get a cloned Iterator that is reset to the beginning * of the query. * * @return A cloned NodeIterator set of the start of the query. * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Get a cloned Iterator that is reset to the beginning of the query. * @return A cloned NodeIterator set of the start of the query. * @throws CloneNotSupportedException 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
DescendantIterator	TokenNameIdentifier	 Descendant Iterator
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DescendantIterator	TokenNameIdentifier	 Descendant Iterator
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_traverser	TokenNameIdentifier	 m traverser
=	TokenNameEQUAL	
m_traverser	TokenNameIdentifier	 m traverser
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
resetProximityPositions	TokenNameIdentifier	 reset Proximity Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next node in the set and advances the position of the * iterator in the set. After a NodeIterator is created, the first call * to nextNode() returns the first node in the set. * * @return The next <code>Node</code> in the set being iterated over, or * <code>null</code> if there are no more members in that set. * * @throws DOMException * INVALID_STATE_ERR: Raised if this method is called after the * <code>detach</code> method was invoked. */	TokenNameCOMMENT_JAVADOC	 Returns the next node in the set and advances the position of the iterator in the set. After a NodeIterator is created, the first call to nextNode() returns the first node in the set. * @return The next <code>Node</code> in the set being iterated over, or <code>null</code> if there are no more members in that set. * @throws DOMException INVALID_STATE_ERR: Raised if this method is called after the <code>detach</code> method was invoked. 
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
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
m_lastFetched	TokenNameIdentifier	 m last Fetched
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resetProximityPositions	TokenNameIdentifier	 reset Proximity Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
m_extendedTypeID	TokenNameIdentifier	 m extended Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
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
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
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
,	TokenNameCOMMA	
m_extendedTypeID	TokenNameIdentifier	 m extended Type ID
)	TokenNameRPAREN	
:	TokenNameCOLON	
m_traverser	TokenNameIdentifier	 m traverser
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
m_context	TokenNameIdentifier	 m context
,	TokenNameCOMMA	
m_lastFetched	TokenNameIdentifier	 m last Fetched
,	TokenNameCOMMA	
m_extendedTypeID	TokenNameIdentifier	 m extended Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
m_pos	TokenNameIdentifier	 m pos
++	TokenNamePLUS_PLUS	
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
m_axis	TokenNameIdentifier	 m axis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
what	TokenNameIdentifier	 what
=	TokenNameEQUAL	
m_whatToShow	TokenNameIdentifier	 m what To Show
;	TokenNameSEMICOLON	
// System.out.println("what: "); 	TokenNameCOMMENT_LINE	System.out.println("what: "); 
// NodeTest.debugWhatToShow(what); 	TokenNameCOMMENT_LINE	NodeTest.debugWhatToShow(what); 
if	TokenNameif	
(	TokenNameLPAREN	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
==	TokenNameEQUAL_EQUAL	
what	TokenNameIdentifier	 what
||	TokenNameOR_OR	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
WILD	TokenNameIdentifier	 WILD
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
WILD	TokenNameIdentifier	 WILD
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_extendedTypeID	TokenNameIdentifier	 m extended Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
getNodeTypeTest	TokenNameIdentifier	 get Node Type Test
(	TokenNameLPAREN	
what	TokenNameIdentifier	 what
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_extendedTypeID	TokenNameIdentifier	 m extended Type ID
=	TokenNameEQUAL	
m_cdtm	TokenNameIdentifier	 m cdtm
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return the first node out of the nodeset, if this expression is * a nodeset expression. This is the default implementation for * nodesets. * <p>WARNING: Do not mutate this class from this function!</p> * @param xctxt The XPath runtime context. * @return the first node out of the nodeset, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Return the first node out of the nodeset, if this expression is a nodeset expression. This is the default implementation for nodesets. <p>WARNING: Do not mutate this class from this function!</p> @param xctxt The XPath runtime context. @return the first node out of the nodeset, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
asNode	TokenNameIdentifier	 as Node
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
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
if	TokenNameif	
(	TokenNameLPAREN	
getPredicateCount	TokenNameIdentifier	 get Predicate Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
asNode	TokenNameIdentifier	 as Node
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getAxisTraverser	TokenNameIdentifier	 get Axis Traverser
(	TokenNameLPAREN	
m_axis	TokenNameIdentifier	 m axis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
what	TokenNameIdentifier	 what
=	TokenNameEQUAL	
m_whatToShow	TokenNameIdentifier	 m what To Show
;	TokenNameSEMICOLON	
// System.out.print(" (DescendantIterator) "); 	TokenNameCOMMENT_LINE	System.out.print(" (DescendantIterator) "); 
// System.out.println("what: "); 	TokenNameCOMMENT_LINE	System.out.println("what: "); 
// NodeTest.debugWhatToShow(what); 	TokenNameCOMMENT_LINE	NodeTest.debugWhatToShow(what); 
if	TokenNameif	
(	TokenNameLPAREN	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
==	TokenNameEQUAL_EQUAL	
what	TokenNameIdentifier	 what
||	TokenNameOR_OR	
localName	TokenNameIdentifier	 local Name
==	TokenNameEQUAL_EQUAL	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
WILD	TokenNameIdentifier	 WILD
||	TokenNameOR_OR	
namespace	TokenNameIdentifier	 namespace
==	TokenNameEQUAL_EQUAL	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
WILD	TokenNameIdentifier	 WILD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
traverser	TokenNameIdentifier	 traverser
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
getNodeTypeTest	TokenNameIdentifier	 get Node Type Test
(	TokenNameLPAREN	
what	TokenNameIdentifier	 what
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
extendedType	TokenNameIdentifier	 extended Type
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
traverser	TokenNameIdentifier	 traverser
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
extendedType	TokenNameIdentifier	 extended Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
m_extendedTypeID	TokenNameIdentifier	 m extended Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
/** The traverser to use to navigate over the descendants. */	TokenNameCOMMENT_JAVADOC	 The traverser to use to navigate over the descendants. 
transient	TokenNametransient	
protected	TokenNameprotected	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
m_traverser	TokenNameIdentifier	 m traverser
;	TokenNameSEMICOLON	
/** The axis that we are traversing. */	TokenNameCOMMENT_JAVADOC	 The axis that we are traversing. 
protected	TokenNameprotected	
int	TokenNameint	
m_axis	TokenNameIdentifier	 m axis
;	TokenNameSEMICOLON	
/** The extended type ID, not set until setRoot. */	TokenNameCOMMENT_JAVADOC	 The extended type ID, not set until setRoot. 
protected	TokenNameprotected	
int	TokenNameint	
m_extendedTypeID	TokenNameIdentifier	 m extended Type ID
;	TokenNameSEMICOLON	
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
DescendantIterator	TokenNameIdentifier	 Descendant Iterator
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
