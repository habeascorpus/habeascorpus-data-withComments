/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: WalkingIterator.java 469314 2006-10-30 23:31:59Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: WalkingIterator.java 469314 2006-10-30 23:31:59Z minchau $ 
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
Expression	TokenNameIdentifier	 Expression
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
VariableStack	TokenNameIdentifier	 Variable Stack
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
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
/** * Location path iterator that uses Walkers. */	TokenNameCOMMENT_JAVADOC	 Location path iterator that uses Walkers. 
public	TokenNamepublic	
class	TokenNameclass	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
extends	TokenNameextends	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
implements	TokenNameimplements	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
9110225941815665906L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Create a WalkingIterator iterator, including creation * of step walkers from the opcode list, and call back * into the Compiler to create predicate expressions. * * @param compiler The Compiler which is creating * this expression. * @param opPos The position of this iterator in the * opcode list from the compiler. * @param shouldLoadWalkers True if walkers should be * loaded, or false if this is a derived iterator and * it doesn't wish to load child walkers. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a WalkingIterator iterator, including creation of step walkers from the opcode list, and call back into the Compiler to create predicate expressions. * @param compiler The Compiler which is creating this expression. @param opPos The position of this iterator in the opcode list from the compiler. @param shouldLoadWalkers True if walkers should be loaded, or false if this is a derived iterator and it doesn't wish to load child walkers. * @throws javax.xml.transform.TransformerException 
WalkingIterator	TokenNameIdentifier	 Walking Iterator
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
if	TokenNameif	
(	TokenNameLPAREN	
shouldLoadWalkers	TokenNameIdentifier	 should Load Walkers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_firstWalker	TokenNameIdentifier	 m first Walker
=	TokenNameEQUAL	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
loadWalkers	TokenNameIdentifier	 load Walkers
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
m_lastUsedWalker	TokenNameIdentifier	 m last Used Walker
=	TokenNameEQUAL	
m_firstWalker	TokenNameIdentifier	 m first Walker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a WalkingIterator object. * * @param nscontext The namespace context for this iterator, * should be OK if null. */	TokenNameCOMMENT_JAVADOC	 Create a WalkingIterator object. * @param nscontext The namespace context for this iterator, should be OK if null. 
public	TokenNamepublic	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
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
/** * Get the analysis bits for this walker, as defined in the WalkerFactory. * @return One of WalkerFactory#BIT_DESCENDANT, etc. */	TokenNameCOMMENT_JAVADOC	 Get the analysis bits for this walker, as defined in the WalkerFactory. @return One of WalkerFactory#BIT_DESCENDANT, etc. 
public	TokenNamepublic	
int	TokenNameint	
getAnalysisBits	TokenNameIdentifier	 get Analysis Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_firstWalker	TokenNameIdentifier	 m first Walker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AxesWalker	TokenNameIdentifier	 Axes Walker
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
m_firstWalker	TokenNameIdentifier	 m first Walker
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
walker	TokenNameIdentifier	 walker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bit	TokenNameIdentifier	 bit
=	TokenNameEQUAL	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
getAnalysisBits	TokenNameIdentifier	 get Analysis Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
|=	TokenNameOR_EQUAL	
bit	TokenNameIdentifier	 bit
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
getNextWalker	TokenNameIdentifier	 get Next Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a cloned WalkingIterator that holds the same * position as this iterator. * * @return A clone of this iterator that holds the same node position. * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Get a cloned WalkingIterator that holds the same position as this iterator. * @return A clone of this iterator that holds the same node position. * @throws CloneNotSupportedException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// clone.m_varStackPos = this.m_varStackPos; 	TokenNameCOMMENT_LINE	clone.m_varStackPos = this.m_varStackPos; 
// clone.m_varStackContext = this.m_varStackContext; 	TokenNameCOMMENT_LINE	clone.m_varStackContext = this.m_varStackContext; 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_firstWalker	TokenNameIdentifier	 m first Walker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_firstWalker	TokenNameIdentifier	 m first Walker
=	TokenNameEQUAL	
m_firstWalker	TokenNameIdentifier	 m first Walker
.	TokenNameDOT	
cloneDeep	TokenNameIdentifier	 clone Deep
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
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
m_firstWalker	TokenNameIdentifier	 m first Walker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lastUsedWalker	TokenNameIdentifier	 m last Used Walker
=	TokenNameEQUAL	
m_firstWalker	TokenNameIdentifier	 m first Walker
;	TokenNameSEMICOLON	
m_firstWalker	TokenNameIdentifier	 m first Walker
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
m_context	TokenNameIdentifier	 m context
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
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_firstWalker	TokenNameIdentifier	 m first Walker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_firstWalker	TokenNameIdentifier	 m first Walker
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_lastUsedWalker	TokenNameIdentifier	 m last Used Walker
=	TokenNameEQUAL	
m_firstWalker	TokenNameIdentifier	 m first Walker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// If the variable stack position is not -1, we'll have to 	TokenNameCOMMENT_LINE	If the variable stack position is not -1, we'll have to 
// set our position in the variable stack, so our variable access 	TokenNameCOMMENT_LINE	set our position in the variable stack, so our variable access 
// will be correct. Iterators that are at the top level of the 	TokenNameCOMMENT_LINE	will be correct. Iterators that are at the top level of the 
// expression need to reset the variable stack, while iterators 	TokenNameCOMMENT_LINE	expression need to reset the variable stack, while iterators 
// in predicates do not need to, and should not, since their execution 	TokenNameCOMMENT_LINE	in predicates do not need to, and should not, since their execution 
// may be much later than top-level iterators. 	TokenNameCOMMENT_LINE	may be much later than top-level iterators. 
// m_varStackPos is set in setRoot, which is called 	TokenNameCOMMENT_LINE	m_varStackPos is set in setRoot, which is called 
// from the execute method. 	TokenNameCOMMENT_LINE	from the execute method. 
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
m_stackFrame	TokenNameIdentifier	 m stack Frame
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
returnNextNode	TokenNameIdentifier	 return Next Node
(	TokenNameLPAREN	
m_firstWalker	TokenNameIdentifier	 m first Walker
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
VariableStack	TokenNameIdentifier	 Variable Stack
vars	TokenNameIdentifier	 vars
=	TokenNameEQUAL	
m_execContext	TokenNameIdentifier	 m exec Context
.	TokenNameDOT	
getVarStack	TokenNameIdentifier	 get Var Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// These three statements need to be combined into one operation. 	TokenNameCOMMENT_LINE	These three statements need to be combined into one operation. 
int	TokenNameint	
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
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
returnNextNode	TokenNameIdentifier	 return Next Node
(	TokenNameLPAREN	
m_firstWalker	TokenNameIdentifier	 m first Walker
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// These two statements need to be combined into one operation. 	TokenNameCOMMENT_LINE	These two statements need to be combined into one operation. 
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
setStackFrame	TokenNameIdentifier	 set Stack Frame
(	TokenNameLPAREN	
savedStart	TokenNameIdentifier	 saved Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the head of the walker list. * * @return The head of the walker list, or null * if this iterator does not implement walkers. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Get the head of the walker list. * @return The head of the walker list, or null if this iterator does not implement walkers. @xsl.usage advanced 
public	TokenNamepublic	
final	TokenNamefinal	
AxesWalker	TokenNameIdentifier	 Axes Walker
getFirstWalker	TokenNameIdentifier	 get First Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_firstWalker	TokenNameIdentifier	 m first Walker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the head of the walker list. * * @param walker Should be a valid AxesWalker. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Set the head of the walker list. * @param walker Should be a valid AxesWalker. @xsl.usage advanced 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setFirstWalker	TokenNameIdentifier	 set First Walker
(	TokenNameLPAREN	
AxesWalker	TokenNameIdentifier	 Axes Walker
walker	TokenNameIdentifier	 walker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_firstWalker	TokenNameIdentifier	 m first Walker
=	TokenNameEQUAL	
walker	TokenNameIdentifier	 walker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the last used walker. * * @param walker The last used walker, or null. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Set the last used walker. * @param walker The last used walker, or null. @xsl.usage advanced 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setLastUsedWalker	TokenNameIdentifier	 set Last Used Walker
(	TokenNameLPAREN	
AxesWalker	TokenNameIdentifier	 Axes Walker
walker	TokenNameIdentifier	 walker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lastUsedWalker	TokenNameIdentifier	 m last Used Walker
=	TokenNameEQUAL	
walker	TokenNameIdentifier	 walker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the last used walker. * * @return The last used walker, or null. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Get the last used walker. * @return The last used walker, or null. @xsl.usage advanced 
public	TokenNamepublic	
final	TokenNamefinal	
AxesWalker	TokenNameIdentifier	 Axes Walker
getLastUsedWalker	TokenNameIdentifier	 get Last Used Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_lastUsedWalker	TokenNameIdentifier	 m last Used Walker
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
AxesWalker	TokenNameIdentifier	 Axes Walker
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
m_firstWalker	TokenNameIdentifier	 m first Walker
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
walker	TokenNameIdentifier	 walker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
getNextWalker	TokenNameIdentifier	 get Next Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_lastUsedWalker	TokenNameIdentifier	 m last Used Walker
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
/** * This function is used to fixup variables from QNames to stack frame * indexes at stylesheet build time. * @param vars List of QNames that correspond to variables. This list * should be searched backwards for the first qualified name that * corresponds to the variable reference qname. The position of the * QName in the vector from the start of the vector will be its position * in the stack frame (but variables above the globalsTop value will need * to be offset to the current stack frame). */	TokenNameCOMMENT_JAVADOC	 This function is used to fixup variables from QNames to stack frame indexes at stylesheet build time. @param vars List of QNames that correspond to variables. This list should be searched backwards for the first qualified name that corresponds to the variable reference qname. The position of the QName in the vector from the start of the vector will be its position in the stack frame (but variables above the globalsTop value will need to be offset to the current stack frame). 
public	TokenNamepublic	
void	TokenNamevoid	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
int	TokenNameint	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
AxesWalker	TokenNameIdentifier	 Axes Walker
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
m_firstWalker	TokenNameIdentifier	 m first Walker
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
walker	TokenNameIdentifier	 walker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
getNextWalker	TokenNameIdentifier	 get Next Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see org.apache.xpath.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xpath.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor) 
public	TokenNamepublic	
void	TokenNamevoid	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitLocationPath	TokenNameIdentifier	 visit Location Path
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_firstWalker	TokenNameIdentifier	 m first Walker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_firstWalker	TokenNameIdentifier	 m first Walker
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** The last used step walker in the walker list. * @serial */	TokenNameCOMMENT_JAVADOC	 The last used step walker in the walker list. @serial 
protected	TokenNameprotected	
AxesWalker	TokenNameIdentifier	 Axes Walker
m_lastUsedWalker	TokenNameIdentifier	 m last Used Walker
;	TokenNameSEMICOLON	
/** The head of the step walker list. * @serial */	TokenNameCOMMENT_JAVADOC	 The head of the step walker list. @serial 
protected	TokenNameprotected	
AxesWalker	TokenNameIdentifier	 Axes Walker
m_firstWalker	TokenNameIdentifier	 m first Walker
;	TokenNameSEMICOLON	
/** * @see ExpressionOwner#getExpression() */	TokenNameCOMMENT_JAVADOC	 @see ExpressionOwner#getExpression() 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_firstWalker	TokenNameIdentifier	 m first Walker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExpressionOwner#setExpression(Expression) */	TokenNameCOMMENT_JAVADOC	 @see ExpressionOwner#setExpression(Expression) 
public	TokenNamepublic	
void	TokenNamevoid	
setExpression	TokenNameIdentifier	 set Expression
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_firstWalker	TokenNameIdentifier	 m first Walker
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AxesWalker	TokenNameIdentifier	 Axes Walker
)	TokenNameRPAREN	
exp	TokenNameIdentifier	 exp
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
AxesWalker	TokenNameIdentifier	 Axes Walker
walker1	TokenNameIdentifier	 walker1
=	TokenNameEQUAL	
m_firstWalker	TokenNameIdentifier	 m first Walker
;	TokenNameSEMICOLON	
AxesWalker	TokenNameIdentifier	 Axes Walker
walker2	TokenNameIdentifier	 walker2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
.	TokenNameDOT	
m_firstWalker	TokenNameIdentifier	 m first Walker
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
walker1	TokenNameIdentifier	 walker1
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
walker2	TokenNameIdentifier	 walker2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
walker1	TokenNameIdentifier	 walker1
.	TokenNameDOT	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
walker2	TokenNameIdentifier	 walker2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
walker1	TokenNameIdentifier	 walker1
=	TokenNameEQUAL	
walker1	TokenNameIdentifier	 walker1
.	TokenNameDOT	
getNextWalker	TokenNameIdentifier	 get Next Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
walker2	TokenNameIdentifier	 walker2
=	TokenNameEQUAL	
walker2	TokenNameIdentifier	 walker2
.	TokenNameDOT	
getNextWalker	TokenNameIdentifier	 get Next Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
walker1	TokenNameIdentifier	 walker1
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
walker2	TokenNameIdentifier	 walker2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
