/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: FilterExprIteratorSimple.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: FilterExprIteratorSimple.java 468655 2006-10-28 07:12:06Z minchau $ 
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
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XNodeSet	TokenNameIdentifier	 X Node Set
;	TokenNameSEMICOLON	
/** * Class to use for one-step iteration that doesn't have a predicate, and * doesn't need to set the context. */	TokenNameCOMMENT_JAVADOC	 Class to use for one-step iteration that doesn't have a predicate, and doesn't need to set the context. 
public	TokenNamepublic	
class	TokenNameclass	
FilterExprIteratorSimple	TokenNameIdentifier	 Filter Expr Iterator Simple
extends	TokenNameextends	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
6978977187025375579L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
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
/** * Create a FilterExprIteratorSimple object. * */	TokenNameCOMMENT_JAVADOC	 Create a FilterExprIteratorSimple object. 
public	TokenNamepublic	
FilterExprIteratorSimple	TokenNameIdentifier	 Filter Expr Iterator Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a FilterExprIteratorSimple object. * */	TokenNameCOMMENT_JAVADOC	 Create a FilterExprIteratorSimple object. 
public	TokenNamepublic	
FilterExprIteratorSimple	TokenNameIdentifier	 Filter Expr Iterator Simple
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_expr	TokenNameIdentifier	 m expr
=	TokenNameEQUAL	
expr	TokenNameIdentifier	 expr
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
m_exprObj	TokenNameIdentifier	 m expr Obj
=	TokenNameEQUAL	
executeFilterExpr	TokenNameIdentifier	 execute Filter Expr
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
m_execContext	TokenNameIdentifier	 m exec Context
,	TokenNameCOMMA	
getPrefixResolver	TokenNameIdentifier	 get Prefix Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getIsTopLevel	TokenNameIdentifier	 get Is Top Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_stackFrame	TokenNameIdentifier	 m stack Frame
,	TokenNameCOMMA	
m_expr	TokenNameIdentifier	 m expr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the expression. Meant for reuse by other FilterExpr iterators * that are not derived from this object. */	TokenNameCOMMENT_JAVADOC	 Execute the expression. Meant for reuse by other FilterExpr iterators that are not derived from this object. 
public	TokenNamepublic	
static	TokenNamestatic	
XNodeSet	TokenNameIdentifier	 X Node Set
executeFilterExpr	TokenNameIdentifier	 execute Filter Expr
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
prefixResolver	TokenNameIdentifier	 prefix Resolver
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isTopLevel	TokenNameIdentifier	 is Top Level
,	TokenNameCOMMA	
int	TokenNameint	
stackFrame	TokenNameIdentifier	 stack Frame
,	TokenNameCOMMA	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
{	TokenNameLBRACE	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
savedResolver	TokenNameIdentifier	 saved Resolver
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getNamespaceContext	TokenNameIdentifier	 get Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XNodeSet	TokenNameIdentifier	 X Node Set
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
setNamespaceContext	TokenNameIdentifier	 set Namespace Context
(	TokenNameLPAREN	
prefixResolver	TokenNameIdentifier	 prefix Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The setRoot operation can take place with a reset operation, 	TokenNameCOMMENT_LINE	The setRoot operation can take place with a reset operation, 
// and so we may not be in the context of LocPathIterator#nextNode, 	TokenNameCOMMENT_LINE	and so we may not be in the context of LocPathIterator#nextNode, 
// so we have to set up the variable context, execute the expression, 	TokenNameCOMMENT_LINE	so we have to set up the variable context, execute the expression, 
// and then restore the variable context. 	TokenNameCOMMENT_LINE	and then restore the variable context. 
if	TokenNameif	
(	TokenNameLPAREN	
isTopLevel	TokenNameIdentifier	 is Top Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("calling m_expr.execute(getXPathContext())"); 	TokenNameCOMMENT_LINE	System.out.println("calling m_expr.execute(getXPathContext())"); 
VariableStack	TokenNameIdentifier	 Variable Stack
vars	TokenNameIdentifier	 vars
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
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
stackFrame	TokenNameIdentifier	 stack Frame
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
true	TokenNametrue	
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
}	TokenNameRBRACE	
else	TokenNameelse	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
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
// TODO: Fix... 	TokenNameCOMMENT_LINE	TODO: Fix... 
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
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
setNamespaceContext	TokenNameIdentifier	 set Namespace Context
(	TokenNameLPAREN	
savedResolver	TokenNameIdentifier	 saved Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
int	TokenNameint	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_exprObj	TokenNameIdentifier	 m expr Obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lastFetched	TokenNameIdentifier	 m last Fetched
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
m_exprObj	TokenNameIdentifier	 m expr Obj
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
m_lastFetched	TokenNameIdentifier	 m last Fetched
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
// m_lastFetched = next; 	TokenNameCOMMENT_LINE	m_lastFetched = next; 
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
/** * Detaches the walker from the set which it iterated over, releasing * any computational resources and placing the iterator in the INVALID * state. */	TokenNameCOMMENT_JAVADOC	 Detaches the walker from the set which it iterated over, releasing any computational resources and placing the iterator in the INVALID state. 
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
super	TokenNamesuper	
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_exprObj	TokenNameIdentifier	 m expr Obj
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_exprObj	TokenNameIdentifier	 m expr Obj
=	TokenNameEQUAL	
null	TokenNamenull	
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
FilterExprIteratorSimple	TokenNameIdentifier	 Filter Expr Iterator Simple
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
FilterExprIteratorSimple	TokenNameIdentifier	 Filter Expr Iterator Simple
fet	TokenNameIdentifier	 fet
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FilterExprIteratorSimple	TokenNameIdentifier	 Filter Expr Iterator Simple
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
fet	TokenNameIdentifier	 fet
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
/** * Returns the axis being iterated, if it is known. * * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple * types. */	TokenNameCOMMENT_JAVADOC	 Returns the axis being iterated, if it is known. * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple types. 
public	TokenNamepublic	
int	TokenNameint	
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_exprObj	TokenNameIdentifier	 m expr Obj
)	TokenNameRPAREN	
return	TokenNamereturn	
m_exprObj	TokenNameIdentifier	 m expr Obj
.	TokenNameDOT	
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
FILTEREDLIST	TokenNameIdentifier	 FILTEREDLIST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
