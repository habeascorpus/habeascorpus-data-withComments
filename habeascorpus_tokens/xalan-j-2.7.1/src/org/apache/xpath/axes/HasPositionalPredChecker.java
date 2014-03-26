/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: HasPositionalPredChecker.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: HasPositionalPredChecker.java 468655 2006-10-28 07:12:06Z minchau $ 
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
XPathVisitor	TokenNameIdentifier	 X Path Visitor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncLast	TokenNameIdentifier	 Func Last
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncPosition	TokenNameIdentifier	 Func Position
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
Function	TokenNameIdentifier	 Function
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
XNumber	TokenNameIdentifier	 X Number
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
Div	TokenNameIdentifier	 Div
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
Minus	TokenNameIdentifier	 Minus
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
Mod	TokenNameIdentifier	 Mod
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
Mult	TokenNameIdentifier	 Mult
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
Plus	TokenNameIdentifier	 Plus
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
Quo	TokenNameIdentifier	 Quo
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
Variable	TokenNameIdentifier	 Variable
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
HasPositionalPredChecker	TokenNameIdentifier	 Has Positional Pred Checker
extends	TokenNameextends	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
m_hasPositionalPred	TokenNameIdentifier	 m has Positional Pred
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
m_predDepth	TokenNameIdentifier	 m pred Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Process the LocPathIterator to see if it contains variables * or functions that may make it context dependent. * @param path LocPathIterator that is assumed to be absolute, but needs checking. * @return true if the path is confirmed to be absolute, false if it * may contain context dependencies. */	TokenNameCOMMENT_JAVADOC	 Process the LocPathIterator to see if it contains variables or functions that may make it context dependent. @param path LocPathIterator that is assumed to be absolute, but needs checking. @return true if the path is confirmed to be absolute, false if it may contain context dependencies. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HasPositionalPredChecker	TokenNameIdentifier	 Has Positional Pred Checker
hppc	TokenNameIdentifier	 hppc
=	TokenNameEQUAL	
new	TokenNamenew	
HasPositionalPredChecker	TokenNameIdentifier	 Has Positional Pred Checker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
hppc	TokenNameIdentifier	 hppc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hppc	TokenNameIdentifier	 hppc
.	TokenNameDOT	
m_hasPositionalPred	TokenNameIdentifier	 m has Positional Pred
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit a function. * @param owner The owner of the expression, to which the expression can * be reset if rewriting takes place. * @param func The function reference object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit a function. @param owner The owner of the expression, to which the expression can be reset if rewriting takes place. @param func The function reference object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitFunction	TokenNameIdentifier	 visit Function
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
Function	TokenNameIdentifier	 Function
func	TokenNameIdentifier	 func
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
func	TokenNameIdentifier	 func
instanceof	TokenNameinstanceof	
FuncPosition	TokenNameIdentifier	 Func Position
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
func	TokenNameIdentifier	 func
instanceof	TokenNameinstanceof	
FuncLast	TokenNameIdentifier	 Func Last
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_hasPositionalPred	TokenNameIdentifier	 m has Positional Pred
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Visit a variable reference. 	TokenNameCOMMENT_LINE	* Visit a variable reference. 
// * @param owner The owner of the expression, to which the expression can 	TokenNameCOMMENT_LINE	* @param owner The owner of the expression, to which the expression can 
// * be reset if rewriting takes place. 	TokenNameCOMMENT_LINE	* be reset if rewriting takes place. 
// * @param var The variable reference object. 	TokenNameCOMMENT_LINE	* @param var The variable reference object. 
// * @return true if the sub expressions should be traversed. 	TokenNameCOMMENT_LINE	* @return true if the sub expressions should be traversed. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public boolean visitVariableRef(ExpressionOwner owner, Variable var) 	TokenNameCOMMENT_LINE	public boolean visitVariableRef(ExpressionOwner owner, Variable var) 
// { 	TokenNameCOMMENT_LINE	{ 
// m_hasPositionalPred = true; 	TokenNameCOMMENT_LINE	m_hasPositionalPred = true; 
// return true; 	TokenNameCOMMENT_LINE	return true; 
// } 	TokenNameCOMMENT_LINE	} 
/** * Visit a predicate within a location path. Note that there isn't a * proper unique component for predicates, and that the expression will * be called also for whatever type Expression is. * * @param owner The owner of the expression, to which the expression can * be reset if rewriting takes place. * @param pred The predicate object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit a predicate within a location path. Note that there isn't a proper unique component for predicates, and that the expression will be called also for whatever type Expression is. * @param owner The owner of the expression, to which the expression can be reset if rewriting takes place. @param pred The predicate object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitPredicate	TokenNameIdentifier	 visit Predicate
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
Expression	TokenNameIdentifier	 Expression
pred	TokenNameIdentifier	 pred
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_predDepth	TokenNameIdentifier	 m pred Depth
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_predDepth	TokenNameIdentifier	 m pred Depth
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pred	TokenNameIdentifier	 pred
instanceof	TokenNameinstanceof	
Variable	TokenNameIdentifier	 Variable
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
pred	TokenNameIdentifier	 pred
instanceof	TokenNameinstanceof	
XNumber	TokenNameIdentifier	 X Number
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
pred	TokenNameIdentifier	 pred
instanceof	TokenNameinstanceof	
Div	TokenNameIdentifier	 Div
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
pred	TokenNameIdentifier	 pred
instanceof	TokenNameinstanceof	
Plus	TokenNameIdentifier	 Plus
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
pred	TokenNameIdentifier	 pred
instanceof	TokenNameinstanceof	
Minus	TokenNameIdentifier	 Minus
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
pred	TokenNameIdentifier	 pred
instanceof	TokenNameinstanceof	
Mod	TokenNameIdentifier	 Mod
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
pred	TokenNameIdentifier	 pred
instanceof	TokenNameinstanceof	
Quo	TokenNameIdentifier	 Quo
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
pred	TokenNameIdentifier	 pred
instanceof	TokenNameinstanceof	
Mult	TokenNameIdentifier	 Mult
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
pred	TokenNameIdentifier	 pred
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
Number	TokenNameIdentifier	 Number
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
pred	TokenNameIdentifier	 pred
instanceof	TokenNameinstanceof	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_hasPositionalPred	TokenNameIdentifier	 m has Positional Pred
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
pred	TokenNameIdentifier	 pred
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_predDepth	TokenNameIdentifier	 m pred Depth
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// Don't go have the caller go any further down the subtree. 	TokenNameCOMMENT_LINE	Don't go have the caller go any further down the subtree. 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
