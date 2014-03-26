/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemCallTemplate.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemCallTemplate.java 468643 2006-10-28 06:56:03Z minchau $ 
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
SourceLocator	TokenNameIdentifier	 Source Locator
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
/** * Implement xsl:call-template. * <pre> * &amp;!ELEMENT xsl:call-template (xsl:with-param)*> * &amp;!ATTLIST xsl:call-template * name %qname; #REQUIRED * &amp; * </pre> * @see <a href="http://www.w3.org/TR/xslt#named-templates">named-templates in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:call-template. <pre> &amp;!ELEMENT xsl:call-template (xsl:with-param)*> &amp;!ATTLIST xsl:call-template name %qname; #REQUIRED &amp; </pre> @see <a href="http://www.w3.org/TR/xslt#named-templates">named-templates in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemCallTemplate	TokenNameIdentifier	 Elem Call Template
extends	TokenNameextends	
ElemForEach	TokenNameIdentifier	 Elem For Each
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
5009634612916030591L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * An xsl:call-template element invokes a template by name; * it has a required name attribute that identifies the template to be invoked. * @serial */	TokenNameCOMMENT_JAVADOC	 An xsl:call-template element invokes a template by name; it has a required name attribute that identifies the template to be invoked. @serial 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
m_templateName	TokenNameIdentifier	 m template Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the "name" attribute. * An xsl:call-template element invokes a template by name; * it has a required name attribute that identifies the template to be invoked. * * @param name Name attribute to set */	TokenNameCOMMENT_JAVADOC	 Set the "name" attribute. An xsl:call-template element invokes a template by name; it has a required name attribute that identifies the template to be invoked. * @param name Name attribute to set 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_templateName	TokenNameIdentifier	 m template Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "name" attribute. * An xsl:call-template element invokes a template by name; * it has a required name attribute that identifies the template to be invoked. * * @return Name attribute of this element */	TokenNameCOMMENT_JAVADOC	 Get the "name" attribute. An xsl:call-template element invokes a template by name; it has a required name attribute that identifies the template to be invoked. * @return Name attribute of this element 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_templateName	TokenNameIdentifier	 m template Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The template which is named by QName. * @serial */	TokenNameCOMMENT_JAVADOC	 The template which is named by QName. @serial 
private	TokenNameprivate	
ElemTemplate	TokenNameIdentifier	 Elem Template
m_template	TokenNameIdentifier	 m template
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Get an int constant identifying the type of element. * @see org.apache.xalan.templates.Constants * * @return The token ID for this element */	TokenNameCOMMENT_JAVADOC	 Get an int constant identifying the type of element. @see org.apache.xalan.templates.Constants * @return The token ID for this element 
public	TokenNamepublic	
int	TokenNameint	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_CALLTEMPLATE	TokenNameIdentifier	 ELEMNAME  CALLTEMPLATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node name. * * @return The name of this element */	TokenNameCOMMENT_JAVADOC	 Return the node name. * @return The name of this element 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_CALLTEMPLATE_STRING	TokenNameIdentifier	 ELEMNAME  CALLTEMPLATE  STRING
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
super	TokenNamesuper	
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Call compose on each param no matter if this is apply-templates 	TokenNameCOMMENT_LINE	Call compose on each param no matter if this is apply-templates 
// or call templates. 	TokenNameCOMMENT_LINE	or call templates. 
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
getParamElemCount	TokenNameIdentifier	 get Param Elem Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemWithParam	TokenNameIdentifier	 Elem With Param
ewp	TokenNameIdentifier	 ewp
=	TokenNameEQUAL	
getParamElem	TokenNameIdentifier	 get Param Elem
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ewp	TokenNameIdentifier	 ewp
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_templateName	TokenNameIdentifier	 m template Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_template	TokenNameIdentifier	 m template
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_template	TokenNameIdentifier	 m template
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTemplateComposed	TokenNameIdentifier	 get Template Composed
(	TokenNameLPAREN	
m_templateName	TokenNameIdentifier	 m template Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_template	TokenNameIdentifier	 m template
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
themsg	TokenNameIdentifier	 themsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_ELEMTEMPLATEELEM_ERR	TokenNameIdentifier	 ER  ELEMTEMPLATEELEM  ERR
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
m_templateName	TokenNameIdentifier	 m template Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
themsg	TokenNameIdentifier	 themsg
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Could not find template named: '"+templateName+"'"); 	TokenNameCOMMENT_LINE	"Could not find template named: '"+templateName+"'"); 
}	TokenNameRBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
getParamElemCount	TokenNameIdentifier	 get Param Elem Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemWithParam	TokenNameIdentifier	 Elem With Param
ewp	TokenNameIdentifier	 ewp
=	TokenNameEQUAL	
getParamElem	TokenNameIdentifier	 get Param Elem
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ewp	TokenNameIdentifier	 ewp
.	TokenNameDOT	
m_index	TokenNameIdentifier	 m index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Find the position of the param in the template being called, 	TokenNameCOMMENT_LINE	Find the position of the param in the template being called, 
// and set the index of the param slot. 	TokenNameCOMMENT_LINE	and set the index of the param slot. 
int	TokenNameint	
etePos	TokenNameIdentifier	 ete Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
ete	TokenNameIdentifier	 ete
=	TokenNameEQUAL	
m_template	TokenNameIdentifier	 m template
.	TokenNameDOT	
getFirstChildElem	TokenNameIdentifier	 get First Child Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ete	TokenNameIdentifier	 ete
;	TokenNameSEMICOLON	
ete	TokenNameIdentifier	 ete
=	TokenNameEQUAL	
ete	TokenNameIdentifier	 ete
.	TokenNameDOT	
getNextSiblingElem	TokenNameIdentifier	 get Next Sibling Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ete	TokenNameIdentifier	 ete
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_PARAMVARIABLE	TokenNameIdentifier	 ELEMNAME  PARAMVARIABLE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemParam	TokenNameIdentifier	 Elem Param
ep	TokenNameIdentifier	 ep
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemParam	TokenNameIdentifier	 Elem Param
)	TokenNameRPAREN	
ete	TokenNameIdentifier	 ete
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ep	TokenNameIdentifier	 ep
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ewp	TokenNameIdentifier	 ewp
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ewp	TokenNameIdentifier	 ewp
.	TokenNameDOT	
m_index	TokenNameIdentifier	 m index
=	TokenNameEQUAL	
etePos	TokenNameIdentifier	 ete Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
etePos	TokenNameIdentifier	 ete Pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This after the template's children have been composed. */	TokenNameCOMMENT_JAVADOC	 This after the template's children have been composed. 
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
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
getParamElemCount	TokenNameIdentifier	 get Param Elem Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemWithParam	TokenNameIdentifier	 Elem With Param
ewp	TokenNameIdentifier	 ewp
=	TokenNameEQUAL	
getParamElem	TokenNameIdentifier	 get Param Elem
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ewp	TokenNameIdentifier	 ewp
.	TokenNameDOT	
endCompose	TokenNameIdentifier	 end Compose
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
endCompose	TokenNameIdentifier	 end Compose
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoke a named template. * @see <a href="http://www.w3.org/TR/xslt#named-templates">named-templates in XSLT Specification</a> * * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Invoke a named template. @see <a href="http://www.w3.org/TR/xslt#named-templates">named-templates in XSLT Specification</a> * @param transformer non-null reference to the the current transform-time state. * @throws TransformerException 
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
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_template	TokenNameIdentifier	 m template
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
VariableStack	TokenNameIdentifier	 Variable Stack
vars	TokenNameIdentifier	 vars
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getVarStack	TokenNameIdentifier	 get Var Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
thisframe	TokenNameIdentifier	 thisframe
=	TokenNameEQUAL	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
getStackFrame	TokenNameIdentifier	 get Stack Frame
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nextFrame	TokenNameIdentifier	 next Frame
=	TokenNameEQUAL	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
link	TokenNameIdentifier	 link
(	TokenNameLPAREN	
m_template	TokenNameIdentifier	 m template
.	TokenNameDOT	
m_frameSize	TokenNameIdentifier	 m frame Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We have to clear the section of the stack frame that has params 	TokenNameCOMMENT_LINE	We have to clear the section of the stack frame that has params 
// so that the default param evaluation will work correctly. 	TokenNameCOMMENT_LINE	so that the default param evaluation will work correctly. 
if	TokenNameif	
(	TokenNameLPAREN	
m_template	TokenNameIdentifier	 m template
.	TokenNameDOT	
m_inArgsSize	TokenNameIdentifier	 m in Args Size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
clearLocalSlots	TokenNameIdentifier	 clear Local Slots
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_template	TokenNameIdentifier	 m template
.	TokenNameDOT	
m_inArgsSize	TokenNameIdentifier	 m in Args Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_paramElems	TokenNameIdentifier	 m param Elems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
setStackFrame	TokenNameIdentifier	 set Stack Frame
(	TokenNameLPAREN	
thisframe	TokenNameIdentifier	 thisframe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
m_paramElems	TokenNameIdentifier	 m param Elems
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemWithParam	TokenNameIdentifier	 Elem With Param
ewp	TokenNameIdentifier	 ewp
=	TokenNameEQUAL	
m_paramElems	TokenNameIdentifier	 m param Elems
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ewp	TokenNameIdentifier	 ewp
.	TokenNameDOT	
m_index	TokenNameIdentifier	 m index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
ewp	TokenNameIdentifier	 ewp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
ewp	TokenNameIdentifier	 ewp
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
currentNode	TokenNameIdentifier	 current Node
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
ewp	TokenNameIdentifier	 ewp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Note here that the index for ElemWithParam must have been 	TokenNameCOMMENT_LINE	Note here that the index for ElemWithParam must have been 
// statically made relative to the xsl:template being called, 	TokenNameCOMMENT_LINE	statically made relative to the xsl:template being called, 
// NOT this xsl:template. 	TokenNameCOMMENT_LINE	NOT this xsl:template. 
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
setLocalVariable	TokenNameIdentifier	 set Local Variable
(	TokenNameLPAREN	
ewp	TokenNameIdentifier	 ewp
.	TokenNameDOT	
m_index	TokenNameIdentifier	 m index
,	TokenNameCOMMA	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
nextFrame	TokenNameIdentifier	 next Frame
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
setStackFrame	TokenNameIdentifier	 set Stack Frame
(	TokenNameLPAREN	
nextFrame	TokenNameIdentifier	 next Frame
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
SourceLocator	TokenNameIdentifier	 Source Locator
savedLocator	TokenNameIdentifier	 saved Locator
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getSAXLocator	TokenNameIdentifier	 get SAX Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
setSAXLocator	TokenNameIdentifier	 set SAX Locator
(	TokenNameLPAREN	
m_template	TokenNameIdentifier	 m template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// template.executeChildTemplates(transformer, sourceNode, mode, true); 	TokenNameCOMMENT_LINE	template.executeChildTemplates(transformer, sourceNode, mode, true); 
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
pushElemTemplateElement	TokenNameIdentifier	 push Elem Template Element
(	TokenNameLPAREN	
m_template	TokenNameIdentifier	 m template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_template	TokenNameIdentifier	 m template
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
popElemTemplateElement	TokenNameIdentifier	 pop Elem Template Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
setSAXLocator	TokenNameIdentifier	 set SAX Locator
(	TokenNameLPAREN	
savedLocator	TokenNameIdentifier	 saved Locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// When we entered this function, the current 	TokenNameCOMMENT_LINE	When we entered this function, the current 
// frame buffer (cfb) index in the variable stack may 	TokenNameCOMMENT_LINE	frame buffer (cfb) index in the variable stack may 
// have been manually set. If we just call 	TokenNameCOMMENT_LINE	have been manually set. If we just call 
// unlink(), however, it will restore the cfb to the 	TokenNameCOMMENT_LINE	unlink(), however, it will restore the cfb to the 
// previous link index from the link stack, rather than 	TokenNameCOMMENT_LINE	previous link index from the link stack, rather than 
// the manually set cfb. So, 	TokenNameCOMMENT_LINE	the manually set cfb. So, 
// the only safe solution is to restore it back 	TokenNameCOMMENT_LINE	the only safe solution is to restore it back 
// to the same position it was on entry, since we're 	TokenNameCOMMENT_LINE	to the same position it was on entry, since we're 
// really not working in a stack context here. (Bug4218) 	TokenNameCOMMENT_LINE	really not working in a stack context here. (Bug4218) 
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
unlink	TokenNameIdentifier	 unlink
(	TokenNameLPAREN	
thisframe	TokenNameIdentifier	 thisframe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getMsgMgr	TokenNameIdentifier	 get Msg Mgr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_TEMPLATE_NOT_FOUND	TokenNameIdentifier	 ER  TEMPLATE  NOT  FOUND
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
m_templateName	TokenNameIdentifier	 m template Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Could not find template named: '"+templateName+"'"); 	TokenNameCOMMENT_LINE	"Could not find template named: '"+templateName+"'"); 
}	TokenNameRBRACE	
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
/** Vector of xsl:param elements associated with this element. * @serial */	TokenNameCOMMENT_JAVADOC	 Vector of xsl:param elements associated with this element. @serial 
protected	TokenNameprotected	
ElemWithParam	TokenNameIdentifier	 Elem With Param
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_paramElems	TokenNameIdentifier	 m param Elems
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Get the count xsl:param elements associated with this element. * @return The number of xsl:param elements. */	TokenNameCOMMENT_JAVADOC	 Get the count xsl:param elements associated with this element. @return The number of xsl:param elements. 
public	TokenNamepublic	
int	TokenNameint	
getParamElemCount	TokenNameIdentifier	 get Param Elem Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_paramElems	TokenNameIdentifier	 m param Elems
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
m_paramElems	TokenNameIdentifier	 m param Elems
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a xsl:param element associated with this element. * * @param i Index of element to find * * @return xsl:param element at given index */	TokenNameCOMMENT_JAVADOC	 Get a xsl:param element associated with this element. * @param i Index of element to find * @return xsl:param element at given index 
public	TokenNamepublic	
ElemWithParam	TokenNameIdentifier	 Elem With Param
getParamElem	TokenNameIdentifier	 get Param Elem
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_paramElems	TokenNameIdentifier	 m param Elems
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a xsl:param element associated with this element. * * @param ParamElem xsl:param element to set. */	TokenNameCOMMENT_JAVADOC	 Set a xsl:param element associated with this element. * @param ParamElem xsl:param element to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setParamElem	TokenNameIdentifier	 set Param Elem
(	TokenNameLPAREN	
ElemWithParam	TokenNameIdentifier	 Elem With Param
ParamElem	TokenNameIdentifier	 Param Elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_paramElems	TokenNameIdentifier	 m param Elems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_paramElems	TokenNameIdentifier	 m param Elems
=	TokenNameEQUAL	
new	TokenNamenew	
ElemWithParam	TokenNameIdentifier	 Elem With Param
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_paramElems	TokenNameIdentifier	 m param Elems
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ParamElem	TokenNameIdentifier	 Param Elem
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Expensive 1 at a time growth, but this is done at build time, so 	TokenNameCOMMENT_LINE	Expensive 1 at a time growth, but this is done at build time, so 
// I think it's OK. 	TokenNameCOMMENT_LINE	I think it's OK. 
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
m_paramElems	TokenNameIdentifier	 m param Elems
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
ElemWithParam	TokenNameIdentifier	 Elem With Param
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ewp	TokenNameIdentifier	 ewp
=	TokenNameEQUAL	
new	TokenNamenew	
ElemWithParam	TokenNameIdentifier	 Elem With Param
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_paramElems	TokenNameIdentifier	 m param Elems
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ewp	TokenNameIdentifier	 ewp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_paramElems	TokenNameIdentifier	 m param Elems
=	TokenNameEQUAL	
ewp	TokenNameIdentifier	 ewp
;	TokenNameSEMICOLON	
ewp	TokenNameIdentifier	 ewp
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ParamElem	TokenNameIdentifier	 Param Elem
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add a child to the child list. * <!ELEMENT xsl:apply-templates (xsl:sort|xsl:with-param)*> * <!ATTLIST xsl:apply-templates * select %expr; "node()" * mode %qname; #IMPLIED * > * * @param newChild Child to add to this node's children list * * @return The child that was just added the children list * * @throws DOMException */	TokenNameCOMMENT_JAVADOC	 Add a child to the child list. <!ELEMENT xsl:apply-templates (xsl:sort|xsl:with-param)*> <!ATTLIST xsl:apply-templates select %expr; "node()" mode %qname; #IMPLIED > * @param newChild Child to add to this node's children list * @return The child that was just added the children list * @throws DOMException 
public	TokenNamepublic	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_WITHPARAM	TokenNameIdentifier	 ELEMNAME  WITHPARAM
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setParamElem	TokenNameIdentifier	 set Param Elem
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElemWithParam	TokenNameIdentifier	 Elem With Param
)	TokenNameRPAREN	
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// You still have to append, because this element can 	TokenNameCOMMENT_LINE	You still have to append, because this element can 
// contain a for-each, and other elements. 	TokenNameCOMMENT_LINE	contain a for-each, and other elements. 
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Call the children visitors. * @param visitor The visitor whose appropriate method will be called. */	TokenNameCOMMENT_JAVADOC	 Call the children visitors. @param visitor The visitor whose appropriate method will be called. 
public	TokenNamepublic	
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
// if (null != m_paramElems) 	TokenNameCOMMENT_LINE	if (null != m_paramElems) 
// { 	TokenNameCOMMENT_LINE	{ 
// int size = m_paramElems.length; 	TokenNameCOMMENT_LINE	int size = m_paramElems.length; 
// 	TokenNameCOMMENT_LINE	 
// for (int i = 0; i < size; i++) 	TokenNameCOMMENT_LINE	for (int i = 0; i < size; i++) 
// { 	TokenNameCOMMENT_LINE	{ 
// ElemWithParam ewp = m_paramElems[i]; 	TokenNameCOMMENT_LINE	ElemWithParam ewp = m_paramElems[i]; 
// ewp.callVisitors(visitor); 	TokenNameCOMMENT_LINE	ewp.callVisitors(visitor); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
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
}	TokenNameRBRACE	
