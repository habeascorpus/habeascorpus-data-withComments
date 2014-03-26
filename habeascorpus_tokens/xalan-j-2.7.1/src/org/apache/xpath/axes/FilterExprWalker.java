/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: FilterExprWalker.java 469367 2006-10-31 04:41:08Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: FilterExprWalker.java 469367 2006-10-31 04:41:08Z minchau $ 
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
ExpressionOwner	TokenNameIdentifier	 Expression Owner
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
OpCodes	TokenNameIdentifier	 Op Codes
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
XNodeSet	TokenNameIdentifier	 X Node Set
;	TokenNameSEMICOLON	
/** * Walker for the OP_VARIABLE, or OP_EXTFUNCTION, or OP_FUNCTION, or OP_GROUP, * op codes. * @see <a href="http://www.w3.org/TR/xpath#NT-FilterExpr">XPath FilterExpr descriptions</a> */	TokenNameCOMMENT_JAVADOC	 Walker for the OP_VARIABLE, or OP_EXTFUNCTION, or OP_FUNCTION, or OP_GROUP, op codes. @see <a href="http://www.w3.org/TR/xpath#NT-FilterExpr">XPath FilterExpr descriptions</a> 
public	TokenNamepublic	
class	TokenNameclass	
FilterExprWalker	TokenNameIdentifier	 Filter Expr Walker
extends	TokenNameextends	
AxesWalker	TokenNameIdentifier	 Axes Walker
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
5457182471424488375L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Construct a FilterExprWalker using a LocPathIterator. * * @param locPathIterator non-null reference to the parent iterator. */	TokenNameCOMMENT_JAVADOC	 Construct a FilterExprWalker using a LocPathIterator. * @param locPathIterator non-null reference to the parent iterator. 
public	TokenNamepublic	
FilterExprWalker	TokenNameIdentifier	 Filter Expr Walker
(	TokenNameLPAREN	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
locPathIterator	TokenNameIdentifier	 loc Path Iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
locPathIterator	TokenNameIdentifier	 loc Path Iterator
,	TokenNameCOMMA	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
FILTEREDLIST	TokenNameIdentifier	 FILTEREDLIST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Init a FilterExprWalker. * * @param compiler non-null reference to the Compiler that is constructing. * @param opPos positive opcode position for this step. * @param stepType The type of step. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Init a FilterExprWalker. * @param compiler non-null reference to the Compiler that is constructing. @param opPos positive opcode position for this step. @param stepType The type of step. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
int	TokenNameint	
stepType	TokenNameIdentifier	 step Type
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
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
stepType	TokenNameIdentifier	 step Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Smooth over an anomily in the opcode map... 	TokenNameCOMMENT_LINE	Smooth over an anomily in the opcode map... 
switch	TokenNameswitch	
(	TokenNameLPAREN	
stepType	TokenNameIdentifier	 step Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_FUNCTION	TokenNameIdentifier	 OP  FUNCTION
:	TokenNameCOLON	
case	TokenNamecase	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_EXTFUNCTION	TokenNameIdentifier	 OP  EXTFUNCTION
:	TokenNameCOLON	
m_mustHardReset	TokenNameIdentifier	 m must Hard Reset
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
case	TokenNamecase	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_GROUP	TokenNameIdentifier	 OP  GROUP
:	TokenNameCOLON	
case	TokenNamecase	
OpCodes	TokenNameIdentifier	 Op Codes
.	TokenNameDOT	
OP_VARIABLE	TokenNameIdentifier	 OP  VARIABLE
:	TokenNameCOLON	
m_expr	TokenNameIdentifier	 m expr
=	TokenNameEQUAL	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_expr	TokenNameIdentifier	 m expr
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//if((OpCodes.OP_FUNCTION == stepType) && (m_expr instanceof org.apache.xalan.templates.FuncKey)) 	TokenNameCOMMENT_LINE	if((OpCodes.OP_FUNCTION == stepType) && (m_expr instanceof org.apache.xalan.templates.FuncKey)) 
if	TokenNameif	
(	TokenNameLPAREN	
m_expr	TokenNameIdentifier	 m expr
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
Variable	TokenNameIdentifier	 Variable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// hack/temp workaround 	TokenNameCOMMENT_LINE	hack/temp workaround 
m_canDetachNodeset	TokenNameIdentifier	 m can Detach Nodeset
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
m_expr	TokenNameIdentifier	 m expr
=	TokenNameEQUAL	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_expr	TokenNameIdentifier	 m expr
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if(m_expr instanceof WalkingIterator) 	TokenNameCOMMENT_LINE	if(m_expr instanceof WalkingIterator) 
// { 	TokenNameCOMMENT_LINE	{ 
// WalkingIterator wi = (WalkingIterator)m_expr; 	TokenNameCOMMENT_LINE	WalkingIterator wi = (WalkingIterator)m_expr; 
// if(wi.getFirstWalker() instanceof FilterExprWalker) 	TokenNameCOMMENT_LINE	if(wi.getFirstWalker() instanceof FilterExprWalker) 
// { 	TokenNameCOMMENT_LINE	{ 
// FilterExprWalker fw = (FilterExprWalker)wi.getFirstWalker(); 	TokenNameCOMMENT_LINE	FilterExprWalker fw = (FilterExprWalker)wi.getFirstWalker(); 
// if(null == fw.getNextWalker()) 	TokenNameCOMMENT_LINE	if(null == fw.getNextWalker()) 
// { 	TokenNameCOMMENT_LINE	{ 
// m_expr = fw.m_expr; 	TokenNameCOMMENT_LINE	m_expr = fw.m_expr; 
// m_expr.exprSetParent(this); 	TokenNameCOMMENT_LINE	m_expr.exprSetParent(this); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
/** * Detaches the walker from the set which it iterated over, releasing * any computational resources and placing the iterator in the INVALID * state. */	TokenNameCOMMENT_JAVADOC	 Detaches the walker from the set which it iterated over, releasing any computational resources and placing the iterator in the INVALID state. 
public	TokenNamepublic	
void	TokenNamevoid	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_canDetachNodeset	TokenNameIdentifier	 m can Detach Nodeset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_exprObj	TokenNameIdentifier	 m expr Obj
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_exprObj	TokenNameIdentifier	 m expr Obj
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the root node of the TreeWalker. * * @param root non-null reference to the root, or starting point of * the query. */	TokenNameCOMMENT_JAVADOC	 Set the root node of the TreeWalker. * @param root non-null reference to the root, or starting point of the query. 
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
m_exprObj	TokenNameIdentifier	 m expr Obj
=	TokenNameEQUAL	
FilterExprIteratorSimple	TokenNameIdentifier	 Filter Expr Iterator Simple
.	TokenNameDOT	
executeFilterExpr	TokenNameIdentifier	 execute Filter Expr
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
m_lpi	TokenNameIdentifier	 m lpi
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_lpi	TokenNameIdentifier	 m lpi
.	TokenNameDOT	
getPrefixResolver	TokenNameIdentifier	 get Prefix Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_lpi	TokenNameIdentifier	 m lpi
.	TokenNameDOT	
getIsTopLevel	TokenNameIdentifier	 get Is Top Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_lpi	TokenNameIdentifier	 m lpi
.	TokenNameDOT	
m_stackFrame	TokenNameIdentifier	 m stack Frame
,	TokenNameCOMMA	
m_expr	TokenNameIdentifier	 m expr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a cloned FilterExprWalker. * * @return A new FilterExprWalker that can be used without mutating this one. * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Get a cloned FilterExprWalker. * @return A new FilterExprWalker that can be used without mutating this one. * @throws CloneNotSupportedException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
FilterExprWalker	TokenNameIdentifier	 Filter Expr Walker
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FilterExprWalker	TokenNameIdentifier	 Filter Expr Walker
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_exprObj	TokenNameIdentifier	 m expr Obj
)	TokenNameRPAREN	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_exprObj	TokenNameIdentifier	 m expr Obj
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
m_exprObj	TokenNameIdentifier	 m expr Obj
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method needs to override AxesWalker.acceptNode because FilterExprWalkers * don't need to, and shouldn't, do a node test. * @param n The node to check to see if it passes the filter or not. * @return a constant to determine whether the node is accepted, * rejected, or skipped, as defined above . */	TokenNameCOMMENT_JAVADOC	 This method needs to override AxesWalker.acceptNode because FilterExprWalkers don't need to, and shouldn't, do a node test. @param n The node to check to see if it passes the filter or not. @return a constant to determine whether the node is accepted, rejected, or skipped, as defined above . 
public	TokenNamepublic	
short	TokenNameshort	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getPredicateCount	TokenNameIdentifier	 get Predicate Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
countProximityPosition	TokenNameIdentifier	 count Proximity Position
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
executePredicates	TokenNameIdentifier	 execute Predicates
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
m_lpi	TokenNameIdentifier	 m lpi
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTMIterator	TokenNameIdentifier	 DTM Iterator
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
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
}	TokenNameRBRACE	
/** * Moves the <code>TreeWalker</code> to the next visible node in document * order relative to the current node, and returns the new node. If the * current node has no next node, or if the search for nextNode attempts * to step upward from the TreeWalker's root node, returns * <code>null</code> , and retains the current node. * @return The new node, or <code>null</code> if the current node has no * next node in the TreeWalker's logical view. */	TokenNameCOMMENT_JAVADOC	 Moves the <code>TreeWalker</code> to the next visible node in document order relative to the current node, and returns the new node. If the current node has no next node, or if the search for nextNode attempts to step upward from the TreeWalker's root node, returns <code>null</code> , and retains the current node. @return The new node, or <code>null</code> if the current node has no next node in the TreeWalker's logical view. 
public	TokenNamepublic	
int	TokenNameint	
getNextNode	TokenNameIdentifier	 get Next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_exprObj	TokenNameIdentifier	 m expr Obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
m_exprObj	TokenNameIdentifier	 m expr Obj
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the last node that can be itterated to. * * * @param xctxt XPath runtime context. * * @return the index of the last node that can be itterated to. */	TokenNameCOMMENT_JAVADOC	 Get the index of the last node that can be itterated to. * @param xctxt XPath runtime context. * @return the index of the last node that can be itterated to. 
public	TokenNamepublic	
int	TokenNameint	
getLastPos	TokenNameIdentifier	 get Last Pos
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_exprObj	TokenNameIdentifier	 m expr Obj
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The contained expression. Should be non-null. * @serial */	TokenNameCOMMENT_JAVADOC	 The contained expression. Should be non-null. @serial 
private	TokenNameprivate	
Expression	TokenNameIdentifier	 Expression
m_expr	TokenNameIdentifier	 m expr
;	TokenNameSEMICOLON	
/** The result of executing m_expr. Needs to be deep cloned on clone op. */	TokenNameCOMMENT_JAVADOC	 The result of executing m_expr. Needs to be deep cloned on clone op. 
transient	TokenNametransient	
private	TokenNameprivate	
XNodeSet	TokenNameIdentifier	 X Node Set
m_exprObj	TokenNameIdentifier	 m expr Obj
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
m_mustHardReset	TokenNameIdentifier	 m must Hard Reset
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
m_canDetachNodeset	TokenNameIdentifier	 m can Detach Nodeset
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
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
super	TokenNamesuper	
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_expr	TokenNameIdentifier	 m expr
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the inner contained expression of this filter. */	TokenNameCOMMENT_JAVADOC	 Get the inner contained expression of this filter. 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getInnerExpression	TokenNameIdentifier	 get Inner Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_expr	TokenNameIdentifier	 m expr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the inner contained expression of this filter. */	TokenNameCOMMENT_JAVADOC	 Set the inner contained expression of this filter. 
public	TokenNamepublic	
void	TokenNamevoid	
setInnerExpression	TokenNameIdentifier	 set Inner Expression
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_expr	TokenNameIdentifier	 m expr
=	TokenNameEQUAL	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the analysis bits for this walker, as defined in the WalkerFactory. * @return One of WalkerFactory#BIT_DESCENDANT, etc. */	TokenNameCOMMENT_JAVADOC	 Get the analysis bits for this walker, as defined in the WalkerFactory. @return One of WalkerFactory#BIT_DESCENDANT, etc. 
public	TokenNamepublic	
int	TokenNameint	
getAnalysisBits	TokenNameIdentifier	 get Analysis Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_expr	TokenNameIdentifier	 m expr
&&	TokenNameAND_AND	
m_expr	TokenNameIdentifier	 m expr
instanceof	TokenNameinstanceof	
PathComponent	TokenNameIdentifier	 Path Component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PathComponent	TokenNameIdentifier	 Path Component
)	TokenNameRPAREN	
m_expr	TokenNameIdentifier	 m expr
)	TokenNameRPAREN	
.	TokenNameDOT	
getAnalysisBits	TokenNameIdentifier	 get Analysis Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_FILTER	TokenNameIdentifier	 BIT  FILTER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if all the nodes in the iteration well be returned in document * order. * Warning: This can only be called after setRoot has been called! * * @return true as a default. */	TokenNameCOMMENT_JAVADOC	 Returns true if all the nodes in the iteration well be returned in document order. Warning: This can only be called after setRoot has been called! * @return true as a default. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDocOrdered	TokenNameIdentifier	 is Doc Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_exprObj	TokenNameIdentifier	 m expr Obj
.	TokenNameDOT	
isDocOrdered	TokenNameIdentifier	 is Doc Ordered
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
m_exprObj	TokenNameIdentifier	 m expr Obj
.	TokenNameDOT	
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
class	TokenNameclass	
filterExprOwner	TokenNameIdentifier	 filter Expr Owner
implements	TokenNameimplements	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
{	TokenNameLBRACE	
/** * @see ExpressionOwner#getExpression() */	TokenNameCOMMENT_JAVADOC	 @see ExpressionOwner#getExpression() 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_expr	TokenNameIdentifier	 m expr
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
FilterExprWalker	TokenNameIdentifier	 Filter Expr Walker
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_expr	TokenNameIdentifier	 m expr
=	TokenNameEQUAL	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This will traverse the heararchy, calling the visitor for * each member. If the called visitor method returns * false, the subtree should not be called. * * @param visitor The visitor whose appropriate method will be called. */	TokenNameCOMMENT_JAVADOC	 This will traverse the heararchy, calling the visitor for each member. If the called visitor method returns false, the subtree should not be called. * @param visitor The visitor whose appropriate method will be called. 
public	TokenNamepublic	
void	TokenNamevoid	
callPredicateVisitors	TokenNameIdentifier	 call Predicate Visitors
(	TokenNameLPAREN	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_expr	TokenNameIdentifier	 m expr
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
new	TokenNamenew	
filterExprOwner	TokenNameIdentifier	 filter Expr Owner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
callPredicateVisitors	TokenNameIdentifier	 call Predicate Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
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
FilterExprWalker	TokenNameIdentifier	 Filter Expr Walker
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FilterExprWalker	TokenNameIdentifier	 Filter Expr Walker
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_expr	TokenNameIdentifier	 m expr
.	TokenNameDOT	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
m_expr	TokenNameIdentifier	 m expr
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
