/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: BasicTestIterator.java 469314 2006-10-30 23:31:59Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: BasicTestIterator.java 469314 2006-10-30 23:31:59Z minchau $ 
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
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
/** * Base for iterators that handle predicates. Does the basic next * node logic, so all the derived iterator has to do is get the * next node. */	TokenNameCOMMENT_JAVADOC	 Base for iterators that handle predicates. Does the basic next node logic, so all the derived iterator has to do is get the next node. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BasicTestIterator	TokenNameIdentifier	 Basic Test Iterator
extends	TokenNameextends	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
3505378079378096623L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Create a LocPathIterator object. * * @param nscontext The namespace context for this iterator, * should be OK if null. */	TokenNameCOMMENT_JAVADOC	 Create a LocPathIterator object. * @param nscontext The namespace context for this iterator, should be OK if null. 
protected	TokenNameprotected	
BasicTestIterator	TokenNameIdentifier	 Basic Test Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Create a LocPathIterator object. * * @param nscontext The namespace context for this iterator, * should be OK if null. */	TokenNameCOMMENT_JAVADOC	 Create a LocPathIterator object. * @param nscontext The namespace context for this iterator, should be OK if null. 
protected	TokenNameprotected	
BasicTestIterator	TokenNameIdentifier	 Basic Test Iterator
(	TokenNameLPAREN	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
nscontext	TokenNameIdentifier	 nscontext
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
nscontext	TokenNameIdentifier	 nscontext
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a LocPathIterator object, including creation * of step walkers from the opcode list, and call back * into the Compiler to create predicate expressions. * * @param compiler The Compiler which is creating * this expression. * @param opPos The position of this iterator in the * opcode list from the compiler. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a LocPathIterator object, including creation of step walkers from the opcode list, and call back into the Compiler to create predicate expressions. * @param compiler The Compiler which is creating this expression. @param opPos The position of this iterator in the opcode list from the compiler. * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
BasicTestIterator	TokenNameIdentifier	 Basic Test Iterator
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
SHOW_NAMESPACE	TokenNameIdentifier	 SHOW  NAMESPACE
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
/** * Create a LocPathIterator object, including creation * of step walkers from the opcode list, and call back * into the Compiler to create predicate expressions. * * @param compiler The Compiler which is creating * this expression. * @param opPos The position of this iterator in the * opcode list from the compiler. * @param shouldLoadWalkers True if walkers should be * loaded, or false if this is a derived iterator and * it doesn't wish to load child walkers. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a LocPathIterator object, including creation of step walkers from the opcode list, and call back into the Compiler to create predicate expressions. * @param compiler The Compiler which is creating this expression. @param opPos The position of this iterator in the opcode list from the compiler. @param shouldLoadWalkers True if walkers should be loaded, or false if this is a derived iterator and it doesn't wish to load child walkers. * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
BasicTestIterator	TokenNameIdentifier	 Basic Test Iterator
(	TokenNameLPAREN	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
int	TokenNameint	
analysis	TokenNameIdentifier	 analysis
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shouldLoadWalkers	TokenNameIdentifier	 should Load Walkers
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
shouldLoadWalkers	TokenNameIdentifier	 should Load Walkers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node via getNextXXX. Bottlenecked for derived class override. * @return The next node on the axis, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Get the next node via getNextXXX. Bottlenecked for derived class override. @return The next node on the axis, or DTM.NULL. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
int	TokenNameint	
getNextNode	TokenNameIdentifier	 get Next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the next node in the set and advances the position of the * iterator in the set. After a NodeIterator is created, the first call * to nextNode() returns the first node in the set. * * @return The next <code>Node</code> in the set being iterated over, or * <code>null</code> if there are no more members in that set. */	TokenNameCOMMENT_JAVADOC	 Returns the next node in the set and advances the position of the iterator in the set. After a NodeIterator is created, the first call to nextNode() returns the first node in the set. * @return The next <code>Node</code> in the set being iterated over, or <code>null</code> if there are no more members in that set. 
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
{	TokenNameLBRACE	
m_lastFetched	TokenNameIdentifier	 m last Fetched
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
/** * Get a cloned Iterator that is reset to the beginning * of the query. * * @return A cloned NodeIterator set of the start of the query. * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Get a cloned Iterator that is reset to the beginning of the query. * @return A cloned NodeIterator set of the start of the query. * @throws CloneNotSupportedException 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
ChildTestIterator	TokenNameIdentifier	 Child Test Iterator
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ChildTestIterator	TokenNameIdentifier	 Child Test Iterator
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
