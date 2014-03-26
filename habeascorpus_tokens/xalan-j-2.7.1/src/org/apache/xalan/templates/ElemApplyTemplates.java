/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemApplyTemplates.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemApplyTemplates.java 468643 2006-10-28 06:56:03Z minchau $ 
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
StackGuard	TokenNameIdentifier	 Stack Guard
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
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
IntStack	TokenNameIdentifier	 Int Stack
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * Implement xsl:apply-templates. * <pre> * &amp;!ELEMENT xsl:apply-templates (xsl:sort|xsl:with-param)*> * &amp;!ATTLIST xsl:apply-templates * select %expr; "node()" * mode %qname; #IMPLIED * &amp; * </pre> * @see <a href="http://www.w3.org/TR/xslt#section-Applying-Template-Rules">section-Applying-Template-Rules in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:apply-templates. <pre> &amp;!ELEMENT xsl:apply-templates (xsl:sort|xsl:with-param)*> &amp;!ATTLIST xsl:apply-templates select %expr; "node()" mode %qname; #IMPLIED &amp; </pre> @see <a href="http://www.w3.org/TR/xslt#section-Applying-Template-Rules">section-Applying-Template-Rules in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemApplyTemplates	TokenNameIdentifier	 Elem Apply Templates
extends	TokenNameextends	
ElemCallTemplate	TokenNameIdentifier	 Elem Call Template
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
2903125371542621004L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * mode %qname; #IMPLIED * @serial */	TokenNameCOMMENT_JAVADOC	 mode %qname; #IMPLIED @serial 
private	TokenNameprivate	
QName	TokenNameIdentifier	 Q Name
m_mode	TokenNameIdentifier	 m mode
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the mode attribute for this element. * * @param mode reference, which may be null, to the <a href="http://www.w3.org/TR/xslt#modes">current mode</a>. */	TokenNameCOMMENT_JAVADOC	 Set the mode attribute for this element. * @param mode reference, which may be null, to the <a href="http://www.w3.org/TR/xslt#modes">current mode</a>. 
public	TokenNamepublic	
void	TokenNamevoid	
setMode	TokenNameIdentifier	 set Mode
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_mode	TokenNameIdentifier	 m mode
=	TokenNameEQUAL	
mode	TokenNameIdentifier	 mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the mode attribute for this element. * * @return The mode attribute for this element */	TokenNameCOMMENT_JAVADOC	 Get the mode attribute for this element. * @return The mode attribute for this element 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_mode	TokenNameIdentifier	 m mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells if this belongs to a default template, * in which case it will act different with * regard to processing modes. * @see <a href="http://www.w3.org/TR/xslt#built-in-rule">built-in-rule in XSLT Specification</a> * @serial */	TokenNameCOMMENT_JAVADOC	 Tells if this belongs to a default template, in which case it will act different with regard to processing modes. @see <a href="http://www.w3.org/TR/xslt#built-in-rule">built-in-rule in XSLT Specification</a> @serial 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_isDefaultTemplate	TokenNameIdentifier	 m is Default Template
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// /** 	TokenNameCOMMENT_LINE	/** 
// * List of namespace/localname IDs, for identification of xsl:with-param to 	TokenNameCOMMENT_LINE	* List of namespace/localname IDs, for identification of xsl:with-param to 
// * xsl:params. Initialized in the compose() method. 	TokenNameCOMMENT_LINE	* xsl:params. Initialized in the compose() method. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// private int[] m_paramIDs; 	TokenNameCOMMENT_LINE	private int[] m_paramIDs; 
/** * Set if this belongs to a default template, * in which case it will act different with * regard to processing modes. * @see <a href="http://www.w3.org/TR/xslt#built-in-rule">built-in-rule in XSLT Specification</a> * * @param b boolean value to set. */	TokenNameCOMMENT_JAVADOC	 Set if this belongs to a default template, in which case it will act different with regard to processing modes. @see <a href="http://www.w3.org/TR/xslt#built-in-rule">built-in-rule in XSLT Specification</a> * @param b boolean value to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setIsDefaultTemplate	TokenNameIdentifier	 set Is Default Template
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_isDefaultTemplate	TokenNameIdentifier	 m is Default Template
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an int constant identifying the type of element. * @see org.apache.xalan.templates.Constants * * @return Token ID for this element types */	TokenNameCOMMENT_JAVADOC	 Get an int constant identifying the type of element. @see org.apache.xalan.templates.Constants * @return Token ID for this element types 
public	TokenNamepublic	
int	TokenNameint	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_APPLY_TEMPLATES	TokenNameIdentifier	 ELEMNAME  APPLY  TEMPLATES
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
}	TokenNameRBRACE	
/** * Return the node name. * * @return Element name */	TokenNameCOMMENT_JAVADOC	 Return the node name. * @return Element name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_APPLY_TEMPLATES_STRING	TokenNameIdentifier	 ELEMNAME  APPLY  TEMPLATES  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Apply the context node to the matching templates. * @see <a href="http://www.w3.org/TR/xslt#section-Applying-Template-Rules">section-Applying-Template-Rules in XSLT Specification</a> * * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Apply the context node to the matching templates. @see <a href="http://www.w3.org/TR/xslt#section-Applying-Template-Rules">section-Applying-Template-Rules in XSLT Specification</a> * @param transformer non-null reference to the the current transform-time state. * @throws TransformerException 
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
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
pushCurrentTemplateRuleIsNull	TokenNameIdentifier	 push Current Template Rule Is Null
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
pushMode	TokenNameIdentifier	 push Mode
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// %REVIEW% Do we need this check?? 	TokenNameCOMMENT_LINE	%REVIEW% Do we need this check?? 
// if (null != sourceNode) 	TokenNameCOMMENT_LINE	if (null != sourceNode) 
// { 	TokenNameCOMMENT_LINE	{ 
// boolean needToTurnOffInfiniteLoopCheck = false; 	TokenNameCOMMENT_LINE	boolean needToTurnOffInfiniteLoopCheck = false; 
QName	TokenNameIdentifier	 Q Name
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_isDefaultTemplate	TokenNameIdentifier	 m is Default Template
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_mode	TokenNameIdentifier	 m mode
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
mode	TokenNameIdentifier	 mode
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
m_mode	TokenNameIdentifier	 m mode
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pushMode	TokenNameIdentifier	 push Mode
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
pushMode	TokenNameIdentifier	 push Mode
(	TokenNameLPAREN	
m_mode	TokenNameIdentifier	 m mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
fireTraceEvent	TokenNameIdentifier	 fire Trace Event
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformSelectedNodes	TokenNameIdentifier	 transform Selected Nodes
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
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
fireTraceEndEvent	TokenNameIdentifier	 fire Trace End Event
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pushMode	TokenNameIdentifier	 push Mode
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
popMode	TokenNameIdentifier	 pop Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
popCurrentTemplateRuleIsNull	TokenNameIdentifier	 pop Current Template Rule Is Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Perform a query if needed, and call transformNode for each child. * * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException Thrown in a variety of circumstances. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Perform a query if needed, and call transformNode for each child. * @param transformer non-null reference to the the current transform-time state. * @throws TransformerException Thrown in a variety of circumstances. @xsl.usage advanced 
public	TokenNamepublic	
void	TokenNamevoid	
transformSelectedNodes	TokenNameIdentifier	 transform Selected Nodes
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
sourceNode	TokenNameIdentifier	 source Node
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTMIterator	TokenNameIdentifier	 DTM Iterator
sourceNodes	TokenNameIdentifier	 source Nodes
=	TokenNameEQUAL	
m_selectExpression	TokenNameIdentifier	 m select Expression
.	TokenNameDOT	
asIterator	TokenNameIdentifier	 as Iterator
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
sourceNode	TokenNameIdentifier	 source Node
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
nParams	TokenNameIdentifier	 n Params
=	TokenNameEQUAL	
getParamElemCount	TokenNameIdentifier	 get Param Elem Count
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
StackGuard	TokenNameIdentifier	 Stack Guard
guard	TokenNameIdentifier	 guard
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getStackGuard	TokenNameIdentifier	 get Stack Guard
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
check	TokenNameIdentifier	 check
=	TokenNameEQUAL	
(	TokenNameLPAREN	
guard	TokenNameIdentifier	 guard
.	TokenNameDOT	
getRecursionLimit	TokenNameIdentifier	 get Recursion Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
true	TokenNametrue	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
pushContextNodeListFlag	TokenNameIdentifier	 push Context Node List Flag
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentExpressionNode	TokenNameIdentifier	 push Current Expression Node
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushSAXLocatorNull	TokenNameIdentifier	 push SAX Locator Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
pushElemTemplateElement	TokenNameIdentifier	 push Elem Template Element
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Vector	TokenNameIdentifier	 Vector
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_sortElems	TokenNameIdentifier	 m sort Elems
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
processSortKeys	TokenNameIdentifier	 process Sort Keys
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
sourceNode	TokenNameIdentifier	 source Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Sort if we need to. 	TokenNameCOMMENT_LINE	Sort if we need to. 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
keys	TokenNameIdentifier	 keys
)	TokenNameRPAREN	
sourceNodes	TokenNameIdentifier	 source Nodes
=	TokenNameEQUAL	
sortNodes	TokenNameIdentifier	 sort Nodes
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
sourceNodes	TokenNameIdentifier	 source Nodes
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
{	TokenNameLBRACE	
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
new	TokenNamenew	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
m_selectExpression	TokenNameIdentifier	 m select Expression
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XNodeSet	TokenNameIdentifier	 X Node Set
(	TokenNameLPAREN	
sourceNodes	TokenNameIdentifier	 source Nodes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
rth	TokenNameIdentifier	 rth
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getSerializationHandler	TokenNameIdentifier	 get Serialization Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ContentHandler chandler = rth.getContentHandler(); 	TokenNameCOMMENT_LINE	ContentHandler chandler = rth.getContentHandler(); 
final	TokenNamefinal	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
sroot	TokenNameIdentifier	 sroot
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TemplateList	TokenNameIdentifier	 Template List
tl	TokenNameIdentifier	 tl
=	TokenNameEQUAL	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getTemplateListComposed	TokenNameIdentifier	 get Template List Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
quiet	TokenNameIdentifier	 quiet
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getQuietConflictWarnings	TokenNameIdentifier	 get Quiet Conflict Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Should be able to get this from the iterator but there must be a bug. 	TokenNameCOMMENT_LINE	Should be able to get this from the iterator but there must be a bug. 
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
sourceNode	TokenNameIdentifier	 source Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
argsFrame	TokenNameIdentifier	 args Frame
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nParams	TokenNameIdentifier	 n Params
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This code will create a section on the stack that is all the 	TokenNameCOMMENT_LINE	This code will create a section on the stack that is all the 
// evaluated arguments. These will be copied into the real params 	TokenNameCOMMENT_LINE	evaluated arguments. These will be copied into the real params 
// section of each called template. 	TokenNameCOMMENT_LINE	section of each called template. 
argsFrame	TokenNameIdentifier	 args Frame
=	TokenNameEQUAL	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
link	TokenNameIdentifier	 link
(	TokenNameLPAREN	
nParams	TokenNameIdentifier	 n Params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
setStackFrame	TokenNameIdentifier	 set Stack Frame
(	TokenNameLPAREN	
thisframe	TokenNameIdentifier	 thisframe
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
nParams	TokenNameIdentifier	 n Params
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
sourceNode	TokenNameIdentifier	 source Node
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
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
setLocalVariable	TokenNameIdentifier	 set Local Variable
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
argsFrame	TokenNameIdentifier	 args Frame
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
setStackFrame	TokenNameIdentifier	 set Stack Frame
(	TokenNameLPAREN	
argsFrame	TokenNameIdentifier	 args Frame
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushContextNodeList	TokenNameIdentifier	 push Context Node List
(	TokenNameLPAREN	
sourceNodes	TokenNameIdentifier	 source Nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushContextNodeListFlag	TokenNameIdentifier	 push Context Node List Flag
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
IntStack	TokenNameIdentifier	 Int Stack
currentNodes	TokenNameIdentifier	 current Nodes
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNodeStack	TokenNameIdentifier	 get Current Node Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IntStack	TokenNameIdentifier	 Int Stack
currentExpressionNodes	TokenNameIdentifier	 current Expression Nodes
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentExpressionNodeStack	TokenNameIdentifier	 get Current Expression Node Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// pushParams(transformer, xctxt); 	TokenNameCOMMENT_LINE	pushParams(transformer, xctxt); 
int	TokenNameint	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
sourceNodes	TokenNameIdentifier	 source Nodes
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNodes	TokenNameIdentifier	 current Nodes
.	TokenNameDOT	
setTop	TokenNameIdentifier	 set Top
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentExpressionNodes	TokenNameIdentifier	 current Expression Nodes
.	TokenNameDOT	
setTop	TokenNameIdentifier	 set Top
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
exNodeType	TokenNameIdentifier	 ex Node Type
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ElemTemplate	TokenNameIdentifier	 Elem Template
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
tl	TokenNameIdentifier	 tl
.	TokenNameDOT	
getTemplateFast	TokenNameIdentifier	 get Template Fast
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
exNodeType	TokenNameIdentifier	 ex Node Type
,	TokenNameCOMMA	
mode	TokenNameIdentifier	 mode
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
quiet	TokenNameIdentifier	 quiet
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If that didn't locate a node, fall back to a default template rule. 	TokenNameCOMMENT_LINE	If that didn't locate a node, fall back to a default template rule. 
// See http://www.w3.org/TR/xslt#built-in-rule. 	TokenNameCOMMENT_LINE	See http://www.w3.org/TR/xslt#built-in-rule. 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getDefaultRule	TokenNameIdentifier	 get Default Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %OPT% direct faster? 	TokenNameCOMMENT_LINE	%OPT% direct faster? 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
// if(rth.m_elemIsPending || rth.m_docPending) 	TokenNameCOMMENT_LINE	if(rth.m_elemIsPending || rth.m_docPending) 
// rth.flushPending(true); 	TokenNameCOMMENT_LINE	rth.flushPending(true); 
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
pushPairCurrentMatched	TokenNameIdentifier	 push Pair Current Matched
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getDefaultTextRule	TokenNameIdentifier	 get Default Text Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
setCurrentElement	TokenNameIdentifier	 set Current Element
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getDefaultTextRule	TokenNameIdentifier	 get Default Text Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dtm.dispatchCharactersEvents(child, chandler, false); 	TokenNameCOMMENT_LINE	dtm.dispatchCharactersEvents(child, chandler, false); 
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
rth	TokenNameIdentifier	 rth
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
popCurrentMatched	TokenNameIdentifier	 pop Current Matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getDefaultRootRule	TokenNameIdentifier	 get Default Root Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// No default rules for processing instructions and the like. 	TokenNameCOMMENT_LINE	No default rules for processing instructions and the like. 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
setCurrentElement	TokenNameIdentifier	 set Current Element
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
pushPairCurrentMatched	TokenNameIdentifier	 push Pair Current Matched
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
check	TokenNameIdentifier	 check
)	TokenNameRPAREN	
guard	TokenNameIdentifier	 guard
.	TokenNameDOT	
checkForInfinateLoop	TokenNameIdentifier	 check For Infinate Loop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
currentFrameBottom	TokenNameIdentifier	 current Frame Bottom
;	TokenNameSEMICOLON	
// See comment with unlink, below 	TokenNameCOMMENT_LINE	See comment with unlink, below 
if	TokenNameif	
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
m_frameSize	TokenNameIdentifier	 m frame Size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushRTFContext	TokenNameIdentifier	 push RTF Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentFrameBottom	TokenNameIdentifier	 current Frame Bottom
=	TokenNameEQUAL	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
getStackFrame	TokenNameIdentifier	 get Stack Frame
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// See comment with unlink, below 	TokenNameCOMMENT_LINE	See comment with unlink, below 
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
link	TokenNameIdentifier	 link
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
m_frameSize	TokenNameIdentifier	 m frame Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// You can't do the check for nParams here, otherwise the 	TokenNameCOMMENT_LINE	You can't do the check for nParams here, otherwise the 
// xsl:params might not be nulled. 	TokenNameCOMMENT_LINE	xsl:params might not be nulled. 
if	TokenNameif	
(	TokenNameLPAREN	
/* nParams > 0 && */	TokenNameCOMMENT_BLOCK	 nParams > 0 && 
template	TokenNameIdentifier	 template
.	TokenNameDOT	
m_inArgsSize	TokenNameIdentifier	 m in Args Size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
paramIndex	TokenNameIdentifier	 param Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getFirstChildElem	TokenNameIdentifier	 get First Child Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
elem	TokenNameIdentifier	 elem
;	TokenNameSEMICOLON	
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getNextSiblingElem	TokenNameIdentifier	 get Next Sibling Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_PARAMVARIABLE	TokenNameIdentifier	 ELEMNAME  PARAMVARIABLE
==	TokenNameEQUAL_EQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemParam	TokenNameIdentifier	 Elem Param
ep	TokenNameIdentifier	 ep
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemParam	TokenNameIdentifier	 Elem Param
)	TokenNameRPAREN	
elem	TokenNameIdentifier	 elem
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nParams	TokenNameIdentifier	 n Params
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
m_qnameID	TokenNameIdentifier	 m qname ID
==	TokenNameEQUAL_EQUAL	
ep	TokenNameIdentifier	 ep
.	TokenNameDOT	
m_qnameID	TokenNameIdentifier	 m qname ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
getLocalVariable	TokenNameIdentifier	 get Local Variable
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
argsFrame	TokenNameIdentifier	 args Frame
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
setLocalVariable	TokenNameIdentifier	 set Local Variable
(	TokenNameLPAREN	
paramIndex	TokenNameIdentifier	 param Index
,	TokenNameCOMMA	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
nParams	TokenNameIdentifier	 n Params
)	TokenNameRPAREN	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
setLocalVariable	TokenNameIdentifier	 set Local Variable
(	TokenNameLPAREN	
paramIndex	TokenNameIdentifier	 param Index
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
paramIndex	TokenNameIdentifier	 param Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
currentFrameBottom	TokenNameIdentifier	 current Frame Bottom
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Fire a trace event for the template. 	TokenNameCOMMENT_LINE	Fire a trace event for the template. 
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
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// And execute the child templates. 	TokenNameCOMMENT_LINE	And execute the child templates. 
// Loop through the children of the template, calling execute on 	TokenNameCOMMENT_LINE	Loop through the children of the template, calling execute on 
// each of them. 	TokenNameCOMMENT_LINE	each of them. 
for	TokenNamefor	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
m_firstChild	TokenNameIdentifier	 m first Child
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
m_nextSibling	TokenNameIdentifier	 m next Sibling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
setSAXLocator	TokenNameIdentifier	 set SAX Locator
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
pushElemTemplateElement	TokenNameIdentifier	 push Elem Template Element
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
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
}	TokenNameRBRACE	
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
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
m_frameSize	TokenNameIdentifier	 m frame Size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// See Frank Weiss bug around 03/19/2002 (no Bugzilla report yet). 	TokenNameCOMMENT_LINE	See Frank Weiss bug around 03/19/2002 (no Bugzilla report yet). 
// While unlink will restore to the proper place, the real position 	TokenNameCOMMENT_LINE	While unlink will restore to the proper place, the real position 
// may have been changed for xsl:with-param, so that variables 	TokenNameCOMMENT_LINE	may have been changed for xsl:with-param, so that variables 
// can be accessed. 	TokenNameCOMMENT_LINE	can be accessed. 
// of right now. 	TokenNameCOMMENT_LINE	of right now. 
// More: 	TokenNameCOMMENT_LINE	More: 
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
currentFrameBottom	TokenNameIdentifier	 current Frame Bottom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popRTFContext	TokenNameIdentifier	 pop RTF Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
popCurrentMatched	TokenNameIdentifier	 pop Current Matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end while (DTM.NULL != (child = sourceNodes.nextNode())) 	TokenNameCOMMENT_LINE	end while (DTM.NULL != (child = sourceNodes.nextNode())) 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
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
fireSelectedEndEvent	TokenNameIdentifier	 fire Selected End Event
(	TokenNameLPAREN	
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"select"	TokenNameStringLiteral	select
,	TokenNameCOMMA	
new	TokenNamenew	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
m_selectExpression	TokenNameIdentifier	 m select Expression
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XNodeSet	TokenNameIdentifier	 X Node Set
(	TokenNameLPAREN	
sourceNodes	TokenNameIdentifier	 source Nodes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Unlink to the original stack frame 	TokenNameCOMMENT_LINE	Unlink to the original stack frame 
if	TokenNameif	
(	TokenNameLPAREN	
nParams	TokenNameIdentifier	 n Params
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
unlink	TokenNameIdentifier	 unlink
(	TokenNameLPAREN	
thisframe	TokenNameIdentifier	 thisframe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popSAXLocator	TokenNameIdentifier	 pop SAX Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pushContextNodeListFlag	TokenNameIdentifier	 push Context Node List Flag
)	TokenNameRPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popContextNodeList	TokenNameIdentifier	 pop Context Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
popElemTemplateElement	TokenNameIdentifier	 pop Elem Template Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentExpressionNode	TokenNameIdentifier	 pop Current Expression Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentNode	TokenNameIdentifier	 pop Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sourceNodes	TokenNameIdentifier	 source Nodes
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
