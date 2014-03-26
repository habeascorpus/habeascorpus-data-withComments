/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XPathVisitor.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XPathVisitor.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
axes	TokenNameIdentifier	 axes
.	TokenNameDOT	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
axes	TokenNameIdentifier	 axes
.	TokenNameDOT	
UnionPathIterator	TokenNameIdentifier	 Union Path Iterator
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
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XString	TokenNameIdentifier	 X String
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
Operation	TokenNameIdentifier	 Operation
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
UnaryOperation	TokenNameIdentifier	 Unary Operation
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
UnionPattern	TokenNameIdentifier	 Union Pattern
;	TokenNameSEMICOLON	
/** * A derivation from this class can be passed to a class that implements * the XPathVisitable interface, to have the appropriate method called * for each component of the XPath. Aside from possible other uses, the * main intention is to provide a reasonable means to perform expression * rewriting. * * <p>Each method has the form * <code>boolean visitComponentType(ExpressionOwner owner, ComponentType compType)</code>. * The ExpressionOwner argument is the owner of the component, and can * be used to reset the expression for rewriting. If a method returns * false, the sub hierarchy will not be traversed.</p> * * <p>This class is meant to be a base class that will be derived by concrete classes, * and doesn't much except return true for each method.</p> */	TokenNameCOMMENT_JAVADOC	 A derivation from this class can be passed to a class that implements the XPathVisitable interface, to have the appropriate method called for each component of the XPath. Aside from possible other uses, the main intention is to provide a reasonable means to perform expression rewriting. * <p>Each method has the form <code>boolean visitComponentType(ExpressionOwner owner, ComponentType compType)</code>. The ExpressionOwner argument is the owner of the component, and can be used to reset the expression for rewriting. If a method returns false, the sub hierarchy will not be traversed.</p> * <p>This class is meant to be a base class that will be derived by concrete classes, and doesn't much except return true for each method.</p> 
public	TokenNamepublic	
class	TokenNameclass	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
{	TokenNameLBRACE	
/** * Visit a LocationPath. * @param owner The owner of the expression, to which the expression can * be reset if rewriting takes place. * @param path The LocationPath object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit a LocationPath. @param owner The owner of the expression, to which the expression can be reset if rewriting takes place. @param path The LocationPath object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitLocationPath	TokenNameIdentifier	 visit Location Path
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit a UnionPath. * @param owner The owner of the expression, to which the expression can * be reset if rewriting takes place. * @param path The UnionPath object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit a UnionPath. @param owner The owner of the expression, to which the expression can be reset if rewriting takes place. @param path The UnionPath object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitUnionPath	TokenNameIdentifier	 visit Union Path
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
UnionPathIterator	TokenNameIdentifier	 Union Path Iterator
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit a step within a location path. * @param owner The owner of the expression, to which the expression can * be reset if rewriting takes place. * @param step The Step object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit a step within a location path. @param owner The owner of the expression, to which the expression can be reset if rewriting takes place. @param step The Step object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitStep	TokenNameIdentifier	 visit Step
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
NodeTest	TokenNameIdentifier	 Node Test
step	TokenNameIdentifier	 step
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit a binary operation. * @param owner The owner of the expression, to which the expression can * be reset if rewriting takes place. * @param op The operation object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit a binary operation. @param owner The owner of the expression, to which the expression can be reset if rewriting takes place. @param op The operation object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitBinaryOperation	TokenNameIdentifier	 visit Binary Operation
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
Operation	TokenNameIdentifier	 Operation
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit a unary operation. * @param owner The owner of the expression, to which the expression can * be reset if rewriting takes place. * @param op The operation object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit a unary operation. @param owner The owner of the expression, to which the expression can be reset if rewriting takes place. @param op The operation object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitUnaryOperation	TokenNameIdentifier	 visit Unary Operation
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
UnaryOperation	TokenNameIdentifier	 Unary Operation
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit a variable reference. * @param owner The owner of the expression, to which the expression can * be reset if rewriting takes place. * @param var The variable reference object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit a variable reference. @param owner The owner of the expression, to which the expression can be reset if rewriting takes place. @param var The variable reference object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitVariableRef	TokenNameIdentifier	 visit Variable Ref
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
Variable	TokenNameIdentifier	 Variable
var	TokenNameIdentifier	 var
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
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
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit a match pattern. * @param owner The owner of the expression, to which the expression can * be reset if rewriting takes place. * @param pattern The match pattern object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit a match pattern. @param owner The owner of the expression, to which the expression can be reset if rewriting takes place. @param pattern The match pattern object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitMatchPattern	TokenNameIdentifier	 visit Match Pattern
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
StepPattern	TokenNameIdentifier	 Step Pattern
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit a union pattern. * @param owner The owner of the expression, to which the expression can * be reset if rewriting takes place. * @param pattern The union pattern object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit a union pattern. @param owner The owner of the expression, to which the expression can be reset if rewriting takes place. @param pattern The union pattern object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitUnionPattern	TokenNameIdentifier	 visit Union Pattern
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
UnionPattern	TokenNameIdentifier	 Union Pattern
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit a string literal. * @param owner The owner of the expression, to which the expression can * be reset if rewriting takes place. * @param str The string literal object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit a string literal. @param owner The owner of the expression, to which the expression can be reset if rewriting takes place. @param str The string literal object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitStringLiteral	TokenNameIdentifier	 visit String Literal
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
XString	TokenNameIdentifier	 X String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit a number literal. * @param owner The owner of the expression, to which the expression can * be reset if rewriting takes place. * @param num The number literal object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit a number literal. @param owner The owner of the expression, to which the expression can be reset if rewriting takes place. @param num The number literal object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitNumberLiteral	TokenNameIdentifier	 visit Number Literal
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
XNumber	TokenNameIdentifier	 X Number
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
