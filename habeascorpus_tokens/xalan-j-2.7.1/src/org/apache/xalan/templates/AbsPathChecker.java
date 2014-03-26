/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: AbsPathChecker.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: AbsPathChecker.java 468643 2006-10-28 06:56:03Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
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
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncCurrent	TokenNameIdentifier	 Func Current
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
FuncExtFunction	TokenNameIdentifier	 Func Ext Function
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
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
Variable	TokenNameIdentifier	 Variable
;	TokenNameSEMICOLON	
/** * This class runs over a path expression that is assumed to be absolute, and * checks for variables and the like that may make it context dependent. */	TokenNameCOMMENT_JAVADOC	 This class runs over a path expression that is assumed to be absolute, and checks for variables and the like that may make it context dependent. 
public	TokenNamepublic	
class	TokenNameclass	
AbsPathChecker	TokenNameIdentifier	 Abs Path Checker
extends	TokenNameextends	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
m_isAbs	TokenNameIdentifier	 m is Abs
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Process the LocPathIterator to see if it contains variables * or functions that may make it context dependent. * @param path LocPathIterator that is assumed to be absolute, but needs checking. * @return true if the path is confirmed to be absolute, false if it * may contain context dependencies. */	TokenNameCOMMENT_JAVADOC	 Process the LocPathIterator to see if it contains variables or functions that may make it context dependent. @param path LocPathIterator that is assumed to be absolute, but needs checking. @return true if the path is confirmed to be absolute, false if it may contain context dependencies. 
public	TokenNamepublic	
boolean	TokenNameboolean	
checkAbsolute	TokenNameIdentifier	 check Absolute
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_isAbs	TokenNameIdentifier	 m is Abs
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_isAbs	TokenNameIdentifier	 m is Abs
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
FuncCurrent	TokenNameIdentifier	 Func Current
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
func	TokenNameIdentifier	 func
instanceof	TokenNameinstanceof	
FuncExtFunction	TokenNameIdentifier	 Func Ext Function
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_isAbs	TokenNameIdentifier	 m is Abs
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
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
m_isAbs	TokenNameIdentifier	 m is Abs
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
