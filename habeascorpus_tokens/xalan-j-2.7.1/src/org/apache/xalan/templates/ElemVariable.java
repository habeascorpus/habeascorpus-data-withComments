/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemVariable.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemVariable.java 468643 2006-10-28 06:56:03Z minchau $ 
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
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
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
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XRTreeFrag	TokenNameIdentifier	 XR Tree Frag
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
XRTreeFragSelectWrapper	TokenNameIdentifier	 XR Tree Frag Select Wrapper
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
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
;	TokenNameSEMICOLON	
/** * Implement xsl:variable. * <pre> * <!ELEMENT xsl:variable %template;> * <!ATTLIST xsl:variable * name %qname; #REQUIRED * select %expr; #IMPLIED * > * </pre> * @see <a href="http://www.w3.org/TR/xslt#variables">variables in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:variable. <pre> <!ELEMENT xsl:variable %template;> <!ATTLIST xsl:variable name %qname; #REQUIRED select %expr; #IMPLIED > </pre> @see <a href="http://www.w3.org/TR/xslt#variables">variables in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemVariable	TokenNameIdentifier	 Elem Variable
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
9111131075322790061L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Constructor ElemVariable * */	TokenNameCOMMENT_JAVADOC	 Constructor ElemVariable 
public	TokenNamepublic	
ElemVariable	TokenNameIdentifier	 Elem Variable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * This is the index into the stack frame. */	TokenNameCOMMENT_JAVADOC	 This is the index into the stack frame. 
protected	TokenNameprotected	
int	TokenNameint	
m_index	TokenNameIdentifier	 m index
;	TokenNameSEMICOLON	
/** * The stack frame size for this variable if it is a global variable * that declares an RTF, which is equal to the maximum number * of variables that can be declared in the variable at one time. */	TokenNameCOMMENT_JAVADOC	 The stack frame size for this variable if it is a global variable that declares an RTF, which is equal to the maximum number of variables that can be declared in the variable at one time. 
int	TokenNameint	
m_frameSize	TokenNameIdentifier	 m frame Size
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Sets the relative position of this variable within the stack frame (if local) * or the global area (if global). Note that this should be called only for * global variables since the local position is computed in the compose() method. */	TokenNameCOMMENT_JAVADOC	 Sets the relative position of this variable within the stack frame (if local) or the global area (if global). Note that this should be called only for global variables since the local position is computed in the compose() method. 
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
/** * If this element is not at the top-level, get the relative position of the * variable into the stack frame. If this variable is at the top-level, get * the relative position within the global area. */	TokenNameCOMMENT_JAVADOC	 If this element is not at the top-level, get the relative position of the variable into the stack frame. If this variable is at the top-level, get the relative position within the global area. 
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
/** * The value of the "select" attribute. * @serial */	TokenNameCOMMENT_JAVADOC	 The value of the "select" attribute. @serial 
private	TokenNameprivate	
XPath	TokenNameIdentifier	 X Path
m_selectPattern	TokenNameIdentifier	 m select Pattern
;	TokenNameSEMICOLON	
/** * Set the "select" attribute. * If the variable-binding element has a select attribute, * then the value of the attribute must be an expression and * the value of the variable is the object that results from * evaluating the expression. In this case, the content * of the variable must be empty. * * @param v Value to set for the "select" attribute. */	TokenNameCOMMENT_JAVADOC	 Set the "select" attribute. If the variable-binding element has a select attribute, then the value of the attribute must be an expression and the value of the variable is the object that results from evaluating the expression. In this case, the content of the variable must be empty. * @param v Value to set for the "select" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setSelect	TokenNameIdentifier	 set Select
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_selectPattern	TokenNameIdentifier	 m select Pattern
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "select" attribute. * If the variable-binding element has a select attribute, * then the value of the attribute must be an expression and * the value of the variable is the object that results from * evaluating the expression. In this case, the content * of the variable must be empty. * * @return Value of the "select" attribute. */	TokenNameCOMMENT_JAVADOC	 Get the "select" attribute. If the variable-binding element has a select attribute, then the value of the attribute must be an expression and the value of the variable is the object that results from evaluating the expression. In this case, the content of the variable must be empty. * @return Value of the "select" attribute. 
public	TokenNamepublic	
XPath	TokenNameIdentifier	 X Path
getSelect	TokenNameIdentifier	 get Select
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_selectPattern	TokenNameIdentifier	 m select Pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The value of the "name" attribute. * @serial */	TokenNameCOMMENT_JAVADOC	 The value of the "name" attribute. @serial 
protected	TokenNameprotected	
QName	TokenNameIdentifier	 Q Name
m_qname	TokenNameIdentifier	 m qname
;	TokenNameSEMICOLON	
/** * Set the "name" attribute. * Both xsl:variable and xsl:param have a required name * attribute, which specifies the name of the variable. The * value of the name attribute is a QName, which is expanded * as described in [2.4 Qualified Names]. * @see <a href="http://www.w3.org/TR/xslt#qname">qname in XSLT Specification</a> * * @param v Value to set for the "name" attribute. */	TokenNameCOMMENT_JAVADOC	 Set the "name" attribute. Both xsl:variable and xsl:param have a required name attribute, which specifies the name of the variable. The value of the name attribute is a QName, which is expanded as described in [2.4 Qualified Names]. @see <a href="http://www.w3.org/TR/xslt#qname">qname in XSLT Specification</a> * @param v Value to set for the "name" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_qname	TokenNameIdentifier	 m qname
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "name" attribute. * Both xsl:variable and xsl:param have a required name * attribute, which specifies the name of the variable. The * value of the name attribute is a QName, which is expanded * as described in [2.4 Qualified Names]. * @see <a href="http://www.w3.org/TR/xslt#qname">qname in XSLT Specification</a> * * @return Value of the "name" attribute. */	TokenNameCOMMENT_JAVADOC	 Get the "name" attribute. Both xsl:variable and xsl:param have a required name attribute, which specifies the name of the variable. The value of the name attribute is a QName, which is expanded as described in [2.4 Qualified Names]. @see <a href="http://www.w3.org/TR/xslt#qname">qname in XSLT Specification</a> * @return Value of the "name" attribute. 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_qname	TokenNameIdentifier	 m qname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells if this is a top-level variable or param, or not. * @serial */	TokenNameCOMMENT_JAVADOC	 Tells if this is a top-level variable or param, or not. @serial 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_isTopLevel	TokenNameIdentifier	 m is Top Level
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Set if this is a top-level variable or param, or not. * @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * * @param v Boolean indicating whether this is a top-level variable * or param, or not. */	TokenNameCOMMENT_JAVADOC	 Set if this is a top-level variable or param, or not. @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * @param v Boolean indicating whether this is a top-level variable or param, or not. 
public	TokenNamepublic	
void	TokenNamevoid	
setIsTopLevel	TokenNameIdentifier	 set Is Top Level
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_isTopLevel	TokenNameIdentifier	 m is Top Level
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get if this is a top-level variable or param, or not. * @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * * @return Boolean indicating whether this is a top-level variable * or param, or not. */	TokenNameCOMMENT_JAVADOC	 Get if this is a top-level variable or param, or not. @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * @return Boolean indicating whether this is a top-level variable or param, or not. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getIsTopLevel	TokenNameIdentifier	 get Is Top Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_isTopLevel	TokenNameIdentifier	 m is Top Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an integer representation of the element type. * * @return An integer representation of the element, defined in the * Constants class. * @see org.apache.xalan.templates.Constants */	TokenNameCOMMENT_JAVADOC	 Get an integer representation of the element type. * @return An integer representation of the element, defined in the Constants class. @see org.apache.xalan.templates.Constants 
public	TokenNamepublic	
int	TokenNameint	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_VARIABLE	TokenNameIdentifier	 ELEMNAME  VARIABLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node name. * * @return The node name */	TokenNameCOMMENT_JAVADOC	 Return the node name. * @return The node name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_VARIABLE_STRING	TokenNameIdentifier	 ELEMNAME  VARIABLE  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copy constructor. * * @param param An element created from an xsl:variable * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Copy constructor. * @param param An element created from an xsl:variable * @throws TransformerException 
public	TokenNamepublic	
ElemVariable	TokenNameIdentifier	 Elem Variable
(	TokenNameLPAREN	
ElemVariable	TokenNameIdentifier	 Elem Variable
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
m_selectPattern	TokenNameIdentifier	 m select Pattern
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
m_selectPattern	TokenNameIdentifier	 m select Pattern
;	TokenNameSEMICOLON	
m_qname	TokenNameIdentifier	 m qname
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
m_qname	TokenNameIdentifier	 m qname
;	TokenNameSEMICOLON	
m_isTopLevel	TokenNameIdentifier	 m is Top Level
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
m_isTopLevel	TokenNameIdentifier	 m is Top Level
;	TokenNameSEMICOLON	
// m_value = param.m_value; 	TokenNameCOMMENT_LINE	m_value = param.m_value; 
// m_varContext = param.m_varContext; 	TokenNameCOMMENT_LINE	m_varContext = param.m_varContext; 
}	TokenNameRBRACE	
/** * Execute a variable declaration and push it onto the variable stack. * @see <a href="http://www.w3.org/TR/xslt#variables">variables in XSLT Specification</a> * * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute a variable declaration and push it onto the variable stack. @see <a href="http://www.w3.org/TR/xslt#variables">variables in XSLT Specification</a> * @param transformer non-null reference to the the current transform-time state. * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireTraceEvent	TokenNameIdentifier	 fire Trace Event
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sourceNode	TokenNameIdentifier	 source Node
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
sourceNode	TokenNameIdentifier	 source Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// transformer.getXPathContext().getVarStack().pushVariable(m_qname, var); 	TokenNameCOMMENT_LINE	transformer.getXPathContext().getVarStack().pushVariable(m_qname, var); 
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVarStack	TokenNameIdentifier	 get Var Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLocalVariable	TokenNameIdentifier	 set Local Variable
(	TokenNameLPAREN	
m_index	TokenNameIdentifier	 m index
,	TokenNameCOMMA	
var	TokenNameIdentifier	 var
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireTraceEndEvent	TokenNameIdentifier	 fire Trace End Event
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the XObject representation of the variable. * * @param transformer non-null reference to the the current transform-time state. * @param sourceNode non-null reference to the <a href="http://www.w3.org/TR/xslt#dt-current-node">current source node</a>. * * @return the XObject representation of the variable. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Get the XObject representation of the variable. * @param transformer non-null reference to the the current transform-time state. @param sourceNode non-null reference to the <a href="http://www.w3.org/TR/xslt#dt-current-node">current source node</a>. * @return the XObject representation of the variable. * @throws TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
int	TokenNameint	
sourceNode	TokenNameIdentifier	 source Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
var	TokenNameIdentifier	 var
;	TokenNameSEMICOLON	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
sourceNode	TokenNameIdentifier	 source Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_selectPattern	TokenNameIdentifier	 m select Pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
m_selectPattern	TokenNameIdentifier	 m select Pattern
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
allowDetachToRelease	TokenNameIdentifier	 allow Detach To Release
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireSelectedEvent	TokenNameIdentifier	 fire Selected Event
(	TokenNameLPAREN	
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"select"	TokenNameStringLiteral	select
,	TokenNameCOMMA	
m_selectPattern	TokenNameIdentifier	 m select Pattern
,	TokenNameCOMMA	
var	TokenNameIdentifier	 var
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
getFirstChildElem	TokenNameIdentifier	 get First Child Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
XString	TokenNameIdentifier	 X String
.	TokenNameDOT	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Use result tree fragment. 	TokenNameCOMMENT_LINE	Use result tree fragment. 
// Global variables may be deferred (see XUnresolvedVariable) and hence 	TokenNameCOMMENT_LINE	Global variables may be deferred (see XUnresolvedVariable) and hence 
// need to be assigned to a different set of DTMs than local variables 	TokenNameCOMMENT_LINE	need to be assigned to a different set of DTMs than local variables 
// so they aren't popped off the stack on return from a template. 	TokenNameCOMMENT_LINE	so they aren't popped off the stack on return from a template. 
int	TokenNameint	
df	TokenNameIdentifier	 df
;	TokenNameSEMICOLON	
// Bugzilla 7118: A variable set via an RTF may create local 	TokenNameCOMMENT_LINE	Bugzilla 7118: A variable set via an RTF may create local 
// variables during that computation. To keep them from overwriting 	TokenNameCOMMENT_LINE	variables during that computation. To keep them from overwriting 
// variables at this level, push a new variable stack. 	TokenNameCOMMENT_LINE	variables at this level, push a new variable stack. 
////// PROBLEM: This is provoking a variable-used-before-set 	TokenNameCOMMENT_LINE	//// PROBLEM: This is provoking a variable-used-before-set 
////// problem in parameters. Needs more study. 	TokenNameCOMMENT_LINE	//// problem in parameters. Needs more study. 
try	TokenNametry	
{	TokenNameLBRACE	
//////////xctxt.getVarStack().link(0); 	TokenNameCOMMENT_LINE	////////xctxt.getVarStack().link(0); 
if	TokenNameif	
(	TokenNameLPAREN	
m_parentNode	TokenNameIdentifier	 m parent Node
instanceof	TokenNameinstanceof	
Stylesheet	TokenNameIdentifier	 Stylesheet
)	TokenNameRPAREN	
// Global variable 	TokenNameCOMMENT_LINE	Global variable 
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
transformToGlobalRTF	TokenNameIdentifier	 transform To Global RTF
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
transformToRTF	TokenNameIdentifier	 transform To RTF
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
//////////////xctxt.getVarStack().unlink(); 	TokenNameCOMMENT_LINE	////////////xctxt.getVarStack().unlink(); 
}	TokenNameRBRACE	
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
new	TokenNamenew	
XRTreeFrag	TokenNameIdentifier	 XR Tree Frag
(	TokenNameLPAREN	
df	TokenNameIdentifier	 df
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentNode	TokenNameIdentifier	 pop Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
var	TokenNameIdentifier	 var
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is called after everything else has been * recomposed, and allows the template to set remaining * values that may be based on some other property that * depends on recomposition. */	TokenNameCOMMENT_JAVADOC	 This function is called after everything else has been recomposed, and allows the template to set remaining values that may be based on some other property that depends on recomposition. 
public	TokenNamepublic	
void	TokenNamevoid	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// See if we can reduce an RTF to a select with a string expression. 	TokenNameCOMMENT_LINE	See if we can reduce an RTF to a select with a string expression. 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_selectPattern	TokenNameIdentifier	 m select Pattern
&&	TokenNameAND_AND	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getOptimizer	TokenNameIdentifier	 get Optimizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XPath	TokenNameIdentifier	 X Path
newSelect	TokenNameIdentifier	 new Select
=	TokenNameEQUAL	
rewriteChildToExpression	TokenNameIdentifier	 rewrite Child To Expression
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
newSelect	TokenNameIdentifier	 new Select
)	TokenNameRPAREN	
m_selectPattern	TokenNameIdentifier	 m select Pattern
=	TokenNameEQUAL	
newSelect	TokenNameIdentifier	 new Select
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
.	TokenNameDOT	
ComposeState	TokenNameIdentifier	 Compose State
cstate	TokenNameIdentifier	 cstate
=	TokenNameEQUAL	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getComposeState	TokenNameIdentifier	 get Compose State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This should be done before addVariableName, so we don't have visibility 	TokenNameCOMMENT_LINE	This should be done before addVariableName, so we don't have visibility 
// to the variable now being defined. 	TokenNameCOMMENT_LINE	to the variable now being defined. 
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
vnames	TokenNameIdentifier	 vnames
=	TokenNameEQUAL	
cstate	TokenNameIdentifier	 cstate
.	TokenNameDOT	
getVariableNames	TokenNameIdentifier	 get Variable Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_selectPattern	TokenNameIdentifier	 m select Pattern
)	TokenNameRPAREN	
m_selectPattern	TokenNameIdentifier	 m select Pattern
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vnames	TokenNameIdentifier	 vnames
,	TokenNameCOMMA	
cstate	TokenNameIdentifier	 cstate
.	TokenNameDOT	
getGlobalsSize	TokenNameIdentifier	 get Globals Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Only add the variable if this is not a global. If it is a global, 	TokenNameCOMMENT_LINE	Only add the variable if this is not a global. If it is a global, 
// it was already added by stylesheet root. 	TokenNameCOMMENT_LINE	it was already added by stylesheet root. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
m_parentNode	TokenNameIdentifier	 m parent Node
instanceof	TokenNameinstanceof	
Stylesheet	TokenNameIdentifier	 Stylesheet
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
m_qname	TokenNameIdentifier	 m qname
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_index	TokenNameIdentifier	 m index
=	TokenNameEQUAL	
cstate	TokenNameIdentifier	 cstate
.	TokenNameDOT	
addVariableName	TokenNameIdentifier	 add Variable Name
(	TokenNameLPAREN	
m_qname	TokenNameIdentifier	 m qname
)	TokenNameRPAREN	
-	TokenNameMINUS	
cstate	TokenNameIdentifier	 cstate
.	TokenNameDOT	
getGlobalsSize	TokenNameIdentifier	 get Globals Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_parentNode	TokenNameIdentifier	 m parent Node
instanceof	TokenNameinstanceof	
Stylesheet	TokenNameIdentifier	 Stylesheet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If this is a global, then we need to treat it as if it's a xsl:template, 	TokenNameCOMMENT_LINE	If this is a global, then we need to treat it as if it's a xsl:template, 
// and count the number of variables it contains. So we set the count to 	TokenNameCOMMENT_LINE	and count the number of variables it contains. So we set the count to 
// zero here. 	TokenNameCOMMENT_LINE	zero here. 
cstate	TokenNameIdentifier	 cstate
.	TokenNameDOT	
resetStackFrameSize	TokenNameIdentifier	 reset Stack Frame Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This has to be done after the addVariableName, so that the variable 	TokenNameCOMMENT_LINE	This has to be done after the addVariableName, so that the variable 
// pushed won't be immediately popped again in endCompose. 	TokenNameCOMMENT_LINE	pushed won't be immediately popped again in endCompose. 
super	TokenNamesuper	
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This after the template's children have been composed. We have to get * the count of how many variables have been declared, so we can do a link * and unlink. */	TokenNameCOMMENT_JAVADOC	 This after the template's children have been composed. We have to get the count of how many variables have been declared, so we can do a link and unlink. 
public	TokenNamepublic	
void	TokenNamevoid	
endCompose	TokenNameIdentifier	 end Compose
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
endCompose	TokenNameIdentifier	 end Compose
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_parentNode	TokenNameIdentifier	 m parent Node
instanceof	TokenNameinstanceof	
Stylesheet	TokenNameIdentifier	 Stylesheet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
.	TokenNameDOT	
ComposeState	TokenNameIdentifier	 Compose State
cstate	TokenNameIdentifier	 cstate
=	TokenNameEQUAL	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getComposeState	TokenNameIdentifier	 get Compose State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_frameSize	TokenNameIdentifier	 m frame Size
=	TokenNameEQUAL	
cstate	TokenNameIdentifier	 cstate
.	TokenNameDOT	
getFrameSize	TokenNameIdentifier	 get Frame Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cstate	TokenNameIdentifier	 cstate
.	TokenNameDOT	
resetStackFrameSize	TokenNameIdentifier	 reset Stack Frame Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * This after the template's children have been composed. 	TokenNameCOMMENT_LINE	* This after the template's children have been composed. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public void endCompose() throws TransformerException 	TokenNameCOMMENT_LINE	public void endCompose() throws TransformerException 
// { 	TokenNameCOMMENT_LINE	{ 
// super.endCompose(); 	TokenNameCOMMENT_LINE	super.endCompose(); 
// } 	TokenNameCOMMENT_LINE	} 
/** * If the children of a variable is a single xsl:value-of or text literal, * it is cheaper to evaluate this as an expression, so try and adapt the * child an an expression. * * @param varElem Should be a ElemParam, ElemVariable, or ElemWithParam. * * @return An XPath if rewrite is possible, else null. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 If the children of a variable is a single xsl:value-of or text literal, it is cheaper to evaluate this as an expression, so try and adapt the child an an expression. * @param varElem Should be a ElemParam, ElemVariable, or ElemWithParam. * @return An XPath if rewrite is possible, else null. * @throws TransformerException 
static	TokenNamestatic	
XPath	TokenNameIdentifier	 X Path
rewriteChildToExpression	TokenNameIdentifier	 rewrite Child To Expression
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
varElem	TokenNameIdentifier	 var Elem
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
varElem	TokenNameIdentifier	 var Elem
.	TokenNameDOT	
getFirstChildElem	TokenNameIdentifier	 get First Child Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Down the line this can be done with multiple string objects using 	TokenNameCOMMENT_LINE	Down the line this can be done with multiple string objects using 
// the concat function. 	TokenNameCOMMENT_LINE	the concat function. 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
t	TokenNameIdentifier	 t
&&	TokenNameAND_AND	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getNextSiblingElem	TokenNameIdentifier	 get Next Sibling Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
etype	TokenNameIdentifier	 etype
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_VALUEOF	TokenNameIdentifier	 ELEMNAME  VALUEOF
==	TokenNameEQUAL_EQUAL	
etype	TokenNameIdentifier	 etype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemValueOf	TokenNameIdentifier	 Elem Value Of
valueof	TokenNameIdentifier	 valueof
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemValueOf	TokenNameIdentifier	 Elem Value Of
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
// %TBD% I'm worried about extended attributes here. 	TokenNameCOMMENT_LINE	%TBD% I'm worried about extended attributes here. 
if	TokenNameif	
(	TokenNameLPAREN	
valueof	TokenNameIdentifier	 valueof
.	TokenNameDOT	
getDisableOutputEscaping	TokenNameIdentifier	 get Disable Output Escaping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
&&	TokenNameAND_AND	
valueof	TokenNameIdentifier	 valueof
.	TokenNameDOT	
getDOMBackPointer	TokenNameIdentifier	 get DOM Back Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
varElem	TokenNameIdentifier	 var Elem
.	TokenNameDOT	
m_firstChild	TokenNameIdentifier	 m first Child
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
new	TokenNamenew	
XRTreeFragSelectWrapper	TokenNameIdentifier	 XR Tree Frag Select Wrapper
(	TokenNameLPAREN	
valueof	TokenNameIdentifier	 valueof
.	TokenNameDOT	
getSelect	TokenNameIdentifier	 get Select
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_TEXTLITERALRESULT	TokenNameIdentifier	 ELEMNAME  TEXTLITERALRESULT
==	TokenNameEQUAL_EQUAL	
etype	TokenNameIdentifier	 etype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTextLiteral	TokenNameIdentifier	 Elem Text Literal
lit	TokenNameIdentifier	 lit
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemTextLiteral	TokenNameIdentifier	 Elem Text Literal
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lit	TokenNameIdentifier	 lit
.	TokenNameDOT	
getDisableOutputEscaping	TokenNameIdentifier	 get Disable Output Escaping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
&&	TokenNameAND_AND	
lit	TokenNameIdentifier	 lit
.	TokenNameDOT	
getDOMBackPointer	TokenNameIdentifier	 get DOM Back Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
lit	TokenNameIdentifier	 lit
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XString	TokenNameIdentifier	 X String
xstr	TokenNameIdentifier	 xstr
=	TokenNameEQUAL	
new	TokenNamenew	
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
varElem	TokenNameIdentifier	 var Elem
.	TokenNameDOT	
m_firstChild	TokenNameIdentifier	 m first Child
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
new	TokenNamenew	
XRTreeFragSelectWrapper	TokenNameIdentifier	 XR Tree Frag Select Wrapper
(	TokenNameLPAREN	
xstr	TokenNameIdentifier	 xstr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is called during recomposition to * control how this element is composed. * @param root The root stylesheet for this transformation. */	TokenNameCOMMENT_JAVADOC	 This function is called during recomposition to control how this element is composed. @param root The root stylesheet for this transformation. 
public	TokenNamepublic	
void	TokenNamevoid	
recompose	TokenNameIdentifier	 recompose
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
recomposeVariables	TokenNameIdentifier	 recompose Variables
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the parent as an ElemTemplateElement. * * @param p This node's parent as an ElemTemplateElement */	TokenNameCOMMENT_JAVADOC	 Set the parent as an ElemTemplateElement. * @param p This node's parent as an ElemTemplateElement 
public	TokenNamepublic	
void	TokenNamevoid	
setParentElem	TokenNameIdentifier	 set Parent Elem
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setParentElem	TokenNameIdentifier	 set Parent Elem
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
m_hasVariableDecl	TokenNameIdentifier	 m has Variable Decl
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Accept a visitor and call the appropriate method * for this class. * * @param visitor The visitor whose appropriate method will be called. * @return true if the children of the object should be visited. */	TokenNameCOMMENT_JAVADOC	 Accept a visitor and call the appropriate method for this class. * @param visitor The visitor whose appropriate method will be called. @return true if the children of the object should be visited. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
XSLTVisitor	TokenNameIdentifier	 XSLT Visitor
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitVariableOrParamDecl	TokenNameIdentifier	 visit Variable Or Param Decl
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Call the children visitors. * @param visitor The visitor whose appropriate method will be called. */	TokenNameCOMMENT_JAVADOC	 Call the children visitors. @param visitor The visitor whose appropriate method will be called. 
protected	TokenNameprotected	
void	TokenNamevoid	
callChildVisitors	TokenNameIdentifier	 call Child Visitors
(	TokenNameLPAREN	
XSLTVisitor	TokenNameIdentifier	 XSLT Visitor
visitor	TokenNameIdentifier	 visitor
,	TokenNameCOMMA	
boolean	TokenNameboolean	
callAttrs	TokenNameIdentifier	 call Attrs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_selectPattern	TokenNameIdentifier	 m select Pattern
)	TokenNameRPAREN	
m_selectPattern	TokenNameIdentifier	 m select Pattern
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
m_selectPattern	TokenNameIdentifier	 m select Pattern
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
callChildVisitors	TokenNameIdentifier	 call Child Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
,	TokenNameCOMMA	
callAttrs	TokenNameIdentifier	 call Attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if this is a psuedo variable reference, declared by Xalan instead * of by the user. */	TokenNameCOMMENT_JAVADOC	 Tell if this is a psuedo variable reference, declared by Xalan instead of by the user. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isPsuedoVar	TokenNameIdentifier	 is Psuedo Var
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
RedundentExprEliminator	TokenNameIdentifier	 Redundent Expr Eliminator
.	TokenNameDOT	
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
/** * Add a child to the child list. If the select attribute * is present, an error will be raised. * * @param elem New element to append to this element's children list * * @return null if the select attribute was present, otherwise the * child just added to the child list */	TokenNameCOMMENT_JAVADOC	 Add a child to the child list. If the select attribute is present, an error will be raised. * @param elem New element to append to this element's children list * @return null if the select attribute was present, otherwise the child just added to the child list 
public	TokenNamepublic	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// cannot have content and select 	TokenNameCOMMENT_LINE	cannot have content and select 
if	TokenNameif	
(	TokenNameLPAREN	
m_selectPattern	TokenNameIdentifier	 m select Pattern
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_CANT_HAVE_CONTENT_AND_SELECT	TokenNameIdentifier	 ER  CANT  HAVE  CONTENT  AND  SELECT
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"xsl:"	TokenNameStringLiteral	xsl:
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
