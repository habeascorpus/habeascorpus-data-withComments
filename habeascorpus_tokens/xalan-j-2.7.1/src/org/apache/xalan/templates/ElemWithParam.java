/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemWithParam.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemWithParam.java 468643 2006-10-28 06:56:03Z minchau $ 
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
XString	TokenNameIdentifier	 X String
;	TokenNameSEMICOLON	
/** * Implement xsl:with-param. xsl:with-param is allowed within * both xsl:call-template and xsl:apply-templates. * <pre> * <!ELEMENT xsl:with-param %template;> * <!ATTLIST xsl:with-param * name %qname; #REQUIRED * select %expr; #IMPLIED * > * </pre> * @see <a href="http://www.w3.org/TR/xslt#element-with-param">element-with-param in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:with-param. xsl:with-param is allowed within both xsl:call-template and xsl:apply-templates. <pre> <!ELEMENT xsl:with-param %template;> <!ATTLIST xsl:with-param name %qname; #REQUIRED select %expr; #IMPLIED > </pre> @see <a href="http://www.w3.org/TR/xslt#element-with-param">element-with-param in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemWithParam	TokenNameIdentifier	 Elem With Param
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
1070355175864326257L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * This is the index to the stack frame being called, <emph>not</emph> the * stack frame that contains this element. */	TokenNameCOMMENT_JAVADOC	 This is the index to the stack frame being called, <emph>not</emph> the stack frame that contains this element. 
int	TokenNameint	
m_index	TokenNameIdentifier	 m index
;	TokenNameSEMICOLON	
/** * The "select" attribute, which specifies the value of the * argument, if element content is not specified. * @serial */	TokenNameCOMMENT_JAVADOC	 The "select" attribute, which specifies the value of the argument, if element content is not specified. @serial 
private	TokenNameprivate	
XPath	TokenNameIdentifier	 X Path
m_selectPattern	TokenNameIdentifier	 m select Pattern
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the "select" attribute. * The "select" attribute specifies the value of the * argument, if element content is not specified. * * @param v Value to set for the "select" attribute. */	TokenNameCOMMENT_JAVADOC	 Set the "select" attribute. The "select" attribute specifies the value of the argument, if element content is not specified. * @param v Value to set for the "select" attribute. 
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
/** * Get the "select" attribute. * The "select" attribute specifies the value of the * argument, if element content is not specified. * * @return Value of the "select" attribute. */	TokenNameCOMMENT_JAVADOC	 Get the "select" attribute. The "select" attribute specifies the value of the argument, if element content is not specified. * @return Value of the "select" attribute. 
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
/** * The required name attribute specifies the name of the * parameter (the variable the value of whose binding is * to be replaced). The value of the name attribute is a QName, * which is expanded as described in [2.4 Qualified Names]. * @serial */	TokenNameCOMMENT_JAVADOC	 The required name attribute specifies the name of the parameter (the variable the value of whose binding is to be replaced). The value of the name attribute is a QName, which is expanded as described in [2.4 Qualified Names]. @serial 
private	TokenNameprivate	
QName	TokenNameIdentifier	 Q Name
m_qname	TokenNameIdentifier	 m qname
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
m_qnameID	TokenNameIdentifier	 m qname ID
;	TokenNameSEMICOLON	
/** * Set the "name" attribute. * DJD * * @param v Value to set for the "name" attribute. */	TokenNameCOMMENT_JAVADOC	 Set the "name" attribute. DJD * @param v Value to set for the "name" attribute. 
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
/** * Get the "name" attribute. * DJD * * @return Value of the "name" attribute. */	TokenNameCOMMENT_JAVADOC	 Get the "name" attribute. DJD * @return Value of the "name" attribute. 
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
ELEMNAME_WITHPARAM	TokenNameIdentifier	 ELEMNAME  WITHPARAM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node name. * * @return the node name. */	TokenNameCOMMENT_JAVADOC	 Return the node name. * @return the node name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_WITHPARAM_STRING	TokenNameIdentifier	 ELEMNAME  WITHPARAM  STRING
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
ElemVariable	TokenNameIdentifier	 Elem Variable
.	TokenNameDOT	
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
m_qnameID	TokenNameIdentifier	 m qname ID
=	TokenNameEQUAL	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getComposeState	TokenNameIdentifier	 get Compose State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getQNameID	TokenNameIdentifier	 get Q Name ID
(	TokenNameLPAREN	
m_qname	TokenNameIdentifier	 m qname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
vnames	TokenNameIdentifier	 vnames
=	TokenNameEQUAL	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getComposeState	TokenNameIdentifier	 get Compose State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getComposeState	TokenNameIdentifier	 get Compose State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGlobalsSize	TokenNameIdentifier	 get Globals Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// m_index must be resolved by ElemApplyTemplates and ElemCallTemplate! 	TokenNameCOMMENT_LINE	m_index must be resolved by ElemApplyTemplates and ElemCallTemplate! 
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
// Use result tree fragment 	TokenNameCOMMENT_LINE	Use result tree fragment 
int	TokenNameint	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
transformToRTF	TokenNameIdentifier	 transform To RTF
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
callAttrs	TokenNameIdentifier	 call Attrs
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_selectPattern	TokenNameIdentifier	 m select Pattern
)	TokenNameRPAREN	
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
