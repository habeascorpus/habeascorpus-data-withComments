/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XUnresolvedVariable.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XUnresolvedVariable.java 468643 2006-10-28 06:56:03Z minchau $ 
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
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
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
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
/** * An instance of this class holds unto a variable until * it is executed. It is used at this time for global * variables which must (we think) forward reference. */	TokenNameCOMMENT_JAVADOC	 An instance of this class holds unto a variable until it is executed. It is used at this time for global variables which must (we think) forward reference. 
public	TokenNamepublic	
class	TokenNameclass	
XUnresolvedVariable	TokenNameIdentifier	 X Unresolved Variable
extends	TokenNameextends	
XObject	TokenNameIdentifier	 X Object
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
256779804767950188L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** The node context for execution. */	TokenNameCOMMENT_JAVADOC	 The node context for execution. 
transient	TokenNametransient	
private	TokenNameprivate	
int	TokenNameint	
m_context	TokenNameIdentifier	 m context
;	TokenNameSEMICOLON	
/** The transformer context for execution. */	TokenNameCOMMENT_JAVADOC	 The transformer context for execution. 
transient	TokenNametransient	
private	TokenNameprivate	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
m_transformer	TokenNameIdentifier	 m transformer
;	TokenNameSEMICOLON	
/** An index to the point in the variable stack where we should * begin variable searches for evaluation of expressions. * This is -1 if m_isTopLevel is false. **/	TokenNameCOMMENT_JAVADOC	 An index to the point in the variable stack where we should begin variable searches for evaluation of expressions. This is -1 if m_isTopLevel is false. *
transient	TokenNametransient	
private	TokenNameprivate	
int	TokenNameint	
m_varStackPos	TokenNameIdentifier	 m var Stack Pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** An index into the variable stack where the variable context * ends, i.e. at the point we should terminate the search. **/	TokenNameCOMMENT_JAVADOC	 An index into the variable stack where the variable context ends, i.e. at the point we should terminate the search. *
transient	TokenNametransient	
private	TokenNameprivate	
int	TokenNameint	
m_varStackContext	TokenNameIdentifier	 m var Stack Context
;	TokenNameSEMICOLON	
/** true if this variable or parameter is a global. * @serial */	TokenNameCOMMENT_JAVADOC	 true if this variable or parameter is a global. @serial 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_isGlobal	TokenNameIdentifier	 m is Global
;	TokenNameSEMICOLON	
/** true if this variable or parameter is not currently being evaluated. */	TokenNameCOMMENT_JAVADOC	 true if this variable or parameter is not currently being evaluated. 
transient	TokenNametransient	
private	TokenNameprivate	
boolean	TokenNameboolean	
m_doneEval	TokenNameIdentifier	 m done Eval
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Create an XUnresolvedVariable, that may be executed at a later time. * This is primarily used so that forward referencing works with * global variables. An XUnresolvedVariable is initially pushed * into the global variable stack, and then replaced with the real * thing when it is accessed. * * @param obj Must be a non-null reference to an ElemVariable. * @param sourceNode The node context for execution. * @param transformer The transformer execution context. * @param varStackPos An index to the point in the variable stack where we should * begin variable searches for evaluation of expressions. * @param varStackContext An index into the variable stack where the variable context * ends, i.e. at the point we should terminate the search. * @param isGlobal true if this is a global variable. */	TokenNameCOMMENT_JAVADOC	 Create an XUnresolvedVariable, that may be executed at a later time. This is primarily used so that forward referencing works with global variables. An XUnresolvedVariable is initially pushed into the global variable stack, and then replaced with the real thing when it is accessed. * @param obj Must be a non-null reference to an ElemVariable. @param sourceNode The node context for execution. @param transformer The transformer execution context. @param varStackPos An index to the point in the variable stack where we should begin variable searches for evaluation of expressions. @param varStackContext An index into the variable stack where the variable context ends, i.e. at the point we should terminate the search. @param isGlobal true if this is a global variable. 
public	TokenNamepublic	
XUnresolvedVariable	TokenNameIdentifier	 X Unresolved Variable
(	TokenNameLPAREN	
ElemVariable	TokenNameIdentifier	 Elem Variable
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
int	TokenNameint	
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
int	TokenNameint	
varStackPos	TokenNameIdentifier	 var Stack Pos
,	TokenNameCOMMA	
int	TokenNameint	
varStackContext	TokenNameIdentifier	 var Stack Context
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isGlobal	TokenNameIdentifier	 is Global
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_context	TokenNameIdentifier	 m context
=	TokenNameEQUAL	
sourceNode	TokenNameIdentifier	 source Node
;	TokenNameSEMICOLON	
m_transformer	TokenNameIdentifier	 m transformer
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
// For globals, this value will have to be updated once we 	TokenNameCOMMENT_LINE	For globals, this value will have to be updated once we 
// have determined how many global variables have been pushed. 	TokenNameCOMMENT_LINE	have determined how many global variables have been pushed. 
m_varStackPos	TokenNameIdentifier	 m var Stack Pos
=	TokenNameEQUAL	
varStackPos	TokenNameIdentifier	 var Stack Pos
;	TokenNameSEMICOLON	
// For globals, this should zero. 	TokenNameCOMMENT_LINE	For globals, this should zero. 
m_varStackContext	TokenNameIdentifier	 m var Stack Context
=	TokenNameEQUAL	
varStackContext	TokenNameIdentifier	 var Stack Context
;	TokenNameSEMICOLON	
m_isGlobal	TokenNameIdentifier	 m is Global
=	TokenNameEQUAL	
isGlobal	TokenNameIdentifier	 is Global
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For support of literal objects in xpaths. * * @param xctxt The XPath execution context. * * @return This object. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 For support of literal objects in xpaths. * @param xctxt The XPath execution context. * @return This object. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
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
!	TokenNameNOT	
m_doneEval	TokenNameIdentifier	 m done Eval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getMsgMgr	TokenNameIdentifier	 get Msg Mgr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getSAXLocator	TokenNameIdentifier	 get SAX Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_REFERENCING_ITSELF	TokenNameIdentifier	 ER  REFERENCING  ITSELF
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElemVariable	TokenNameIdentifier	 Elem Variable
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
currentFrame	TokenNameIdentifier	 current Frame
=	TokenNameEQUAL	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
getStackFrame	TokenNameIdentifier	 get Stack Frame
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//// vars.setStackFrame(m_varStackPos); 	TokenNameCOMMENT_LINE	// vars.setStackFrame(m_varStackPos); 
ElemVariable	TokenNameIdentifier	 Elem Variable
velem	TokenNameIdentifier	 velem
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemVariable	TokenNameIdentifier	 Elem Variable
)	TokenNameRPAREN	
m_obj	TokenNameIdentifier	 m obj
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
m_doneEval	TokenNameIdentifier	 m done Eval
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
velem	TokenNameIdentifier	 velem
.	TokenNameDOT	
m_frameSize	TokenNameIdentifier	 m frame Size
)	TokenNameRPAREN	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
link	TokenNameIdentifier	 link
(	TokenNameLPAREN	
velem	TokenNameIdentifier	 velem
.	TokenNameDOT	
m_frameSize	TokenNameIdentifier	 m frame Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
velem	TokenNameIdentifier	 velem
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
m_transformer	TokenNameIdentifier	 m transformer
,	TokenNameCOMMA	
m_context	TokenNameIdentifier	 m context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_doneEval	TokenNameIdentifier	 m done Eval
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
var	TokenNameIdentifier	 var
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
// These two statements need to be combined into one operation. 	TokenNameCOMMENT_LINE	These two statements need to be combined into one operation. 
// vars.setStackFrame(currentFrame); 	TokenNameCOMMENT_LINE	vars.setStackFrame(currentFrame); 
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
velem	TokenNameIdentifier	 velem
.	TokenNameDOT	
m_frameSize	TokenNameIdentifier	 m frame Size
)	TokenNameRPAREN	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
unlink	TokenNameIdentifier	 unlink
(	TokenNameLPAREN	
currentFrame	TokenNameIdentifier	 current Frame
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set an index to the point in the variable stack where we should * begin variable searches for evaluation of expressions. * This is -1 if m_isTopLevel is false. * * @param top A valid value that specifies where in the variable * stack the search should begin. */	TokenNameCOMMENT_JAVADOC	 Set an index to the point in the variable stack where we should begin variable searches for evaluation of expressions. This is -1 if m_isTopLevel is false. * @param top A valid value that specifies where in the variable stack the search should begin. 
public	TokenNamepublic	
void	TokenNamevoid	
setVarStackPos	TokenNameIdentifier	 set Var Stack Pos
(	TokenNameLPAREN	
int	TokenNameint	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_varStackPos	TokenNameIdentifier	 m var Stack Pos
=	TokenNameEQUAL	
top	TokenNameIdentifier	 top
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an index into the variable stack where the variable context * ends, i.e. at the point we should terminate the search. * * @param bottom The point at which the search should terminate, normally * zero for global variables. */	TokenNameCOMMENT_JAVADOC	 Set an index into the variable stack where the variable context ends, i.e. at the point we should terminate the search. * @param bottom The point at which the search should terminate, normally zero for global variables. 
public	TokenNamepublic	
void	TokenNamevoid	
setVarStackContext	TokenNameIdentifier	 set Var Stack Context
(	TokenNameLPAREN	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_varStackContext	TokenNameIdentifier	 m var Stack Context
=	TokenNameEQUAL	
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell what kind of class this is. * * @return CLASS_UNRESOLVEDVARIABLE */	TokenNameCOMMENT_JAVADOC	 Tell what kind of class this is. * @return CLASS_UNRESOLVEDVARIABLE 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CLASS_UNRESOLVEDVARIABLE	TokenNameIdentifier	 CLASS  UNRESOLVEDVARIABLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a request type, return the equivalent string. * For diagnostic purposes. * * @return An informational string. */	TokenNameCOMMENT_JAVADOC	 Given a request type, return the equivalent string. For diagnostic purposes. * @return An informational string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeString	TokenNameIdentifier	 get Type String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"XUnresolvedVariable ("	TokenNameStringLiteral	XUnresolvedVariable (
+	TokenNamePLUS	
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
