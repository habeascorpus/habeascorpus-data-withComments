/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Variable.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Variable.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
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
XSLMessages	TokenNameIdentifier	 XSL Messages
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
QName	TokenNameIdentifier	 Q Name
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
XPath	TokenNameIdentifier	 X Path
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
axes	TokenNameIdentifier	 axes
.	TokenNameDOT	
PathComponent	TokenNameIdentifier	 Path Component
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
WalkerFactory	TokenNameIdentifier	 Walker Factory
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
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
;	TokenNameSEMICOLON	
/** * The variable reference expression executer. */	TokenNameCOMMENT_JAVADOC	 The variable reference expression executer. 
public	TokenNamepublic	
class	TokenNameclass	
Variable	TokenNameIdentifier	 Variable
extends	TokenNameextends	
Expression	TokenNameIdentifier	 Expression
implements	TokenNameimplements	
PathComponent	TokenNameIdentifier	 Path Component
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
4334975375609297049L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Tell if fixupVariables was called. * @serial */	TokenNameCOMMENT_JAVADOC	 Tell if fixupVariables was called. @serial 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_fixUpWasCalled	TokenNameIdentifier	 m fix Up Was Called
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** The qualified name of the variable. * @serial */	TokenNameCOMMENT_JAVADOC	 The qualified name of the variable. @serial 
protected	TokenNameprotected	
QName	TokenNameIdentifier	 Q Name
m_qname	TokenNameIdentifier	 m qname
;	TokenNameSEMICOLON	
/** * The index of the variable, which is either an absolute index to a * global, or, if higher than the globals area, must be adjusted by adding * the offset to the current stack frame. */	TokenNameCOMMENT_JAVADOC	 The index of the variable, which is either an absolute index to a global, or, if higher than the globals area, must be adjusted by adding the offset to the current stack frame. 
protected	TokenNameprotected	
int	TokenNameint	
m_index	TokenNameIdentifier	 m index
;	TokenNameSEMICOLON	
/** * Set the index for the variable into the stack. For advanced use only. You * must know what you are doing to use this. * * @param index a global or local index. */	TokenNameCOMMENT_JAVADOC	 Set the index for the variable into the stack. For advanced use only. You must know what you are doing to use this. * @param index a global or local index. 
public	TokenNamepublic	
void	TokenNamevoid	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_index	TokenNameIdentifier	 m index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the index for the variable into the stack. For advanced use only. * * @return index a global or local index. */	TokenNameCOMMENT_JAVADOC	 Set the index for the variable into the stack. For advanced use only. * @return index a global or local index. 
public	TokenNamepublic	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_index	TokenNameIdentifier	 m index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether or not this is a global reference. For advanced use only. * * @param isGlobal true if this should be a global variable reference. */	TokenNameCOMMENT_JAVADOC	 Set whether or not this is a global reference. For advanced use only. * @param isGlobal true if this should be a global variable reference. 
public	TokenNamepublic	
void	TokenNamevoid	
setIsGlobal	TokenNameIdentifier	 set Is Global
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isGlobal	TokenNameIdentifier	 is Global
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_isGlobal	TokenNameIdentifier	 m is Global
=	TokenNameEQUAL	
isGlobal	TokenNameIdentifier	 is Global
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the index for the variable into the stack. For advanced use only. * * @return true if this should be a global variable reference. */	TokenNameCOMMENT_JAVADOC	 Set the index for the variable into the stack. For advanced use only. * @return true if this should be a global variable reference. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getGlobal	TokenNameIdentifier	 get Global
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_isGlobal	TokenNameIdentifier	 m is Global
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_isGlobal	TokenNameIdentifier	 m is Global
=	TokenNameEQUAL	
false	TokenNamefalse	
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
m_fixUpWasCalled	TokenNameIdentifier	 m fix Up Was Called
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QName	TokenNameIdentifier	 Q Name
qn	TokenNameIdentifier	 qn
=	TokenNameEQUAL	
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
)	TokenNameRPAREN	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("qn: "+qn); 	TokenNameCOMMENT_LINE	System.out.println("qn: "+qn); 
if	TokenNameif	
(	TokenNameLPAREN	
qn	TokenNameIdentifier	 qn
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
m_qname	TokenNameIdentifier	 m qname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_isGlobal	TokenNameIdentifier	 m is Global
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_index	TokenNameIdentifier	 m index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_index	TokenNameIdentifier	 m index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
globalsSize	TokenNameIdentifier	 globals Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_COULD_NOT_FIND_VAR	TokenNameIdentifier	 ER  COULD  NOT  FIND  VAR
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
m_qname	TokenNameIdentifier	 m qname
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the qualified name of the variable. * * @param qname Must be a non-null reference to a qualified name. */	TokenNameCOMMENT_JAVADOC	 Set the qualified name of the variable. * @param qname Must be a non-null reference to a qualified name. 
public	TokenNamepublic	
void	TokenNamevoid	
setQName	TokenNameIdentifier	 set Q Name
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_qname	TokenNameIdentifier	 m qname
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the qualified name of the variable. * * @return A non-null reference to a qualified name. */	TokenNameCOMMENT_JAVADOC	 Get the qualified name of the variable. * @return A non-null reference to a qualified name. 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_qname	TokenNameIdentifier	 m qname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute an expression in the XPath runtime context, and return the * result of the expression. * * * @param xctxt The XPath runtime context. * * @return The result of the expression in the form of a <code>XObject</code>. * * @throws javax.xml.transform.TransformerException if a runtime exception * occurs. */	TokenNameCOMMENT_JAVADOC	 Execute an expression in the XPath runtime context, and return the result of the expression. * @param xctxt The XPath runtime context. * @return The result of the expression in the form of a <code>XObject</code>. * @throws javax.xml.transform.TransformerException if a runtime exception occurs. 
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
return	TokenNamereturn	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dereference the variable, and return the reference value. Note that lazy * evaluation will occur. If a variable within scope is not found, a warning * will be sent to the error listener, and an empty nodeset will be returned. * * * @param xctxt The runtime execution context. * * @return The evaluated variable, or an empty nodeset if not found. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Dereference the variable, and return the reference value. Note that lazy evaluation will occur. If a variable within scope is not found, a warning will be sent to the error listener, and an empty nodeset will be returned. * @param xctxt The runtime execution context. * @return The evaluated variable, or an empty nodeset if not found. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
boolean	TokenNameboolean	
destructiveOK	TokenNameIdentifier	 destructive OK
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
xprefixResolver	TokenNameIdentifier	 xprefix Resolver
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getNamespaceContext	TokenNameIdentifier	 get Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
// Is the variable fetched always the same? 	TokenNameCOMMENT_LINE	Is the variable fetched always the same? 
// XObject result = xctxt.getVariable(m_qname); 	TokenNameCOMMENT_LINE	XObject result = xctxt.getVariable(m_qname); 
if	TokenNameif	
(	TokenNameLPAREN	
m_fixUpWasCalled	TokenNameIdentifier	 m fix Up Was Called
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_isGlobal	TokenNameIdentifier	 m is Global
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getVarStack	TokenNameIdentifier	 get Var Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGlobalVariable	TokenNameIdentifier	 get Global Variable
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
m_index	TokenNameIdentifier	 m index
,	TokenNameCOMMA	
destructiveOK	TokenNameIdentifier	 destructive OK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getVarStack	TokenNameIdentifier	 get Var Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLocalVariable	TokenNameIdentifier	 get Local Variable
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
m_index	TokenNameIdentifier	 m index
,	TokenNameCOMMA	
destructiveOK	TokenNameIdentifier	 destructive OK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getVarStack	TokenNameIdentifier	 get Var Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVariableOrParam	TokenNameIdentifier	 get Variable Or Param
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
m_qname	TokenNameIdentifier	 m qname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This should now never happen... 	TokenNameCOMMENT_LINE	This should now never happen... 
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
WG_ILLEGAL_VARIABLE_REFERENCE	TokenNameIdentifier	 WG  ILLEGAL  VARIABLE  REFERENCE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
m_qname	TokenNameIdentifier	 m qname
.	TokenNameDOT	
getLocalPart	TokenNameIdentifier	 get Local Part
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"VariableReference given for variable out "+ 	TokenNameCOMMENT_LINE	"VariableReference given for variable out "+ 
// (new RuntimeException()).printStackTrace(); 	TokenNameCOMMENT_LINE	(new RuntimeException()).printStackTrace(); 
// error(xctxt, XPATHErrorResources.ER_COULDNOT_GET_VAR_NAMED, 	TokenNameCOMMENT_LINE	error(xctxt, XPATHErrorResources.ER_COULDNOT_GET_VAR_NAMED, 
// new Object[]{ m_qname.getLocalPart() }); //"Could not get variable named "+varName); 	TokenNameCOMMENT_LINE	new Object[]{ m_qname.getLocalPart() }); //"Could not get variable named "+varName); 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
XNodeSet	TokenNameIdentifier	 X Node Set
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
// } 	TokenNameCOMMENT_LINE	} 
// else 	TokenNameCOMMENT_LINE	else 
// { 	TokenNameCOMMENT_LINE	{ 
// // Hack city... big time. This is needed to evaluate xpaths from extensions, 	TokenNameCOMMENT_LINE	// Hack city... big time. This is needed to evaluate xpaths from extensions, 
// // pending some bright light going off in my head. Some sort of callback? 	TokenNameCOMMENT_LINE	// pending some bright light going off in my head. Some sort of callback? 
// synchronized(this) 	TokenNameCOMMENT_LINE	synchronized(this) 
// { 	TokenNameCOMMENT_LINE	{ 
// org.apache.xalan.templates.ElemVariable vvar= getElemVariable(); 	TokenNameCOMMENT_LINE	org.apache.xalan.templates.ElemVariable vvar= getElemVariable(); 
// if(null != vvar) 	TokenNameCOMMENT_LINE	if(null != vvar) 
// { 	TokenNameCOMMENT_LINE	{ 
// m_index = vvar.getIndex(); 	TokenNameCOMMENT_LINE	m_index = vvar.getIndex(); 
// m_isGlobal = vvar.getIsTopLevel(); 	TokenNameCOMMENT_LINE	m_isGlobal = vvar.getIsTopLevel(); 
// m_fixUpWasCalled = true; 	TokenNameCOMMENT_LINE	m_fixUpWasCalled = true; 
// return execute(xctxt); 	TokenNameCOMMENT_LINE	return execute(xctxt); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// throw new javax.xml.transform.TransformerException(XSLMessages.createXPATHMessage(XPATHErrorResources.ER_VAR_NOT_RESOLVABLE, new Object[]{m_qname.toString()})); //"Variable not resolvable: "+m_qname); 	TokenNameCOMMENT_LINE	throw new javax.xml.transform.TransformerException(XSLMessages.createXPATHMessage(XPATHErrorResources.ER_VAR_NOT_RESOLVABLE, new Object[]{m_qname.toString()})); //"Variable not resolvable: "+m_qname); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
/** * Get the XSLT ElemVariable that this sub-expression references. In order for * this to work, the SourceLocator must be the owning ElemTemplateElement. * @return The dereference to the ElemVariable, or null if not found. */	TokenNameCOMMENT_JAVADOC	 Get the XSLT ElemVariable that this sub-expression references. In order for this to work, the SourceLocator must be the owning ElemTemplateElement. @return The dereference to the ElemVariable, or null if not found. 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemVariable	TokenNameIdentifier	 Elem Variable
getElemVariable	TokenNameIdentifier	 get Elem Variable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the current ElemTemplateElement, and then walk backwards in 	TokenNameCOMMENT_LINE	Get the current ElemTemplateElement, and then walk backwards in 
// document order, searching 	TokenNameCOMMENT_LINE	document order, searching 
// for an xsl:param element or xsl:variable element that matches our 	TokenNameCOMMENT_LINE	for an xsl:param element or xsl:variable element that matches our 
// qname. If we reach the top level, use the StylesheetRoot's composed 	TokenNameCOMMENT_LINE	qname. If we reach the top level, use the StylesheetRoot's composed 
// list of top level variables and parameters. 	TokenNameCOMMENT_LINE	list of top level variables and parameters. 
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemVariable	TokenNameIdentifier	 Elem Variable
vvar	TokenNameIdentifier	 vvar
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
ExpressionNode	TokenNameIdentifier	 Expression Node
owner	TokenNameIdentifier	 owner
=	TokenNameEQUAL	
getExpressionOwner	TokenNameIdentifier	 get Expression Owner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
owner	TokenNameIdentifier	 owner
&&	TokenNameAND_AND	
owner	TokenNameIdentifier	 owner
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
Stylesheet	TokenNameIdentifier	 Stylesheet
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
Stylesheet	TokenNameIdentifier	 Stylesheet
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
savedprev	TokenNameIdentifier	 savedprev
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
getPreviousSiblingElem	TokenNameIdentifier	 get Previous Sibling Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemVariable	TokenNameIdentifier	 Elem Variable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vvar	TokenNameIdentifier	 vvar
=	TokenNameEQUAL	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemVariable	TokenNameIdentifier	 Elem Variable
)	TokenNameRPAREN	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
vvar	TokenNameIdentifier	 vvar
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
m_qname	TokenNameIdentifier	 m qname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vvar	TokenNameIdentifier	 vvar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
vvar	TokenNameIdentifier	 vvar
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
savedprev	TokenNameIdentifier	 savedprev
.	TokenNameDOT	
getParentElem	TokenNameIdentifier	 get Parent Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
vvar	TokenNameIdentifier	 vvar
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVariableOrParamComposed	TokenNameIdentifier	 get Variable Or Param Composed
(	TokenNameLPAREN	
m_qname	TokenNameIdentifier	 m qname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
vvar	TokenNameIdentifier	 vvar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if this expression returns a stable number that will not change during * iterations within the expression. This is used to determine if a proximity * position predicate can indicate that no more searching has to occur. * * * @return true if the expression represents a stable number. */	TokenNameCOMMENT_JAVADOC	 Tell if this expression returns a stable number that will not change during iterations within the expression. This is used to determine if a proximity position predicate can indicate that no more searching has to occur. * @return true if the expression represents a stable number. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isStableNumber	TokenNameIdentifier	 is Stable Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the analysis bits for this walker, as defined in the WalkerFactory. * @return One of WalkerFactory#BIT_DESCENDANT, etc. */	TokenNameCOMMENT_JAVADOC	 Get the analysis bits for this walker, as defined in the WalkerFactory. @return One of WalkerFactory#BIT_DESCENDANT, etc. 
public	TokenNamepublic	
int	TokenNameint	
getAnalysisBits	TokenNameIdentifier	 get Analysis Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemVariable	TokenNameIdentifier	 Elem Variable
vvar	TokenNameIdentifier	 vvar
=	TokenNameEQUAL	
getElemVariable	TokenNameIdentifier	 get Elem Variable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
vvar	TokenNameIdentifier	 vvar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
=	TokenNameEQUAL	
vvar	TokenNameIdentifier	 vvar
.	TokenNameDOT	
getSelect	TokenNameIdentifier	 get Select
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
xpath	TokenNameIdentifier	 xpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
expr	TokenNameIdentifier	 expr
&&	TokenNameAND_AND	
expr	TokenNameIdentifier	 expr
instanceof	TokenNameinstanceof	
PathComponent	TokenNameIdentifier	 Path Component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PathComponent	TokenNameIdentifier	 Path Component
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
.	TokenNameDOT	
getAnalysisBits	TokenNameIdentifier	 get Analysis Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_FILTER	TokenNameIdentifier	 BIT  FILTER
;	TokenNameSEMICOLON	
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
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitVariableRef	TokenNameIdentifier	 visit Variable Ref
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
this	TokenNamethis	
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
isSameClass	TokenNameIdentifier	 is Same Class
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_qname	TokenNameIdentifier	 m qname
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Variable	TokenNameIdentifier	 Variable
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
.	TokenNameDOT	
m_qname	TokenNameIdentifier	 m qname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// We have to make sure that the qname really references 	TokenNameCOMMENT_LINE	We have to make sure that the qname really references 
// the same variable element. 	TokenNameCOMMENT_LINE	the same variable element. 
if	TokenNameif	
(	TokenNameLPAREN	
getElemVariable	TokenNameIdentifier	 get Elem Variable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Variable	TokenNameIdentifier	 Variable
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
.	TokenNameDOT	
getElemVariable	TokenNameIdentifier	 get Elem Variable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
PSUEDOVARNAMESPACE	TokenNameIdentifier	 PSUEDOVARNAMESPACE
=	TokenNameEQUAL	
"http://xml.apache.org/xalan/psuedovar"	TokenNameStringLiteral	http://xml.apache.org/xalan/psuedovar
;	TokenNameSEMICOLON	
/** * Tell if this is a psuedo variable reference, declared by Xalan instead * of by the user. */	TokenNameCOMMENT_JAVADOC	 Tell if this is a psuedo variable reference, declared by Xalan instead of by the user. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isPsuedoVarRef	TokenNameIdentifier	 is Psuedo Var Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
m_qname	TokenNameIdentifier	 m qname
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
PSUEDOVARNAMESPACE	TokenNameIdentifier	 PSUEDOVARNAMESPACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_qname	TokenNameIdentifier	 m qname
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"#"	TokenNameStringLiteral	#
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
