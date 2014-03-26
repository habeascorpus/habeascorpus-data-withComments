/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemForEach.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemForEach.java 468643 2006-10-28 06:56:03Z minchau $ 
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
NodeSorter	TokenNameIdentifier	 Node Sorter
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
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMManager	TokenNameIdentifier	 DTM Manager
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Implement xsl:for-each. * <pre> * <!ELEMENT xsl:for-each * (#PCDATA * %instructions; * %result-elements; * | xsl:sort) * > * * <!ATTLIST xsl:for-each * select %expr; #REQUIRED * %space-att; * > * </pre> * @see <a href="http://www.w3.org/TR/xslt#for-each">for-each in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:for-each. <pre> <!ELEMENT xsl:for-each (#PCDATA %instructions; %result-elements; | xsl:sort) > * <!ATTLIST xsl:for-each select %expr; #REQUIRED %space-att; > </pre> @see <a href="http://www.w3.org/TR/xslt#for-each">for-each in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemForEach	TokenNameIdentifier	 Elem For Each
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
implements	TokenNameimplements	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
6018140636363583690L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Set true to request some basic status reports */	TokenNameCOMMENT_JAVADOC	 Set true to request some basic status reports 
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * This is set by an "xalan-doc-cache-off" pi, or the old "xalan:doc-cache-off" pi. * The old form of the PI only works for XML parsers that are not namespace aware. * It tells the engine that * documents created in the location paths executed by this element * will not be reparsed. It's set by StylesheetHandler during * construction. Note that this feature applies _only_ to xsl:for-each * elements in its current incarnation; a more general cache management * solution is desperately needed. */	TokenNameCOMMENT_JAVADOC	 This is set by an "xalan-doc-cache-off" pi, or the old "xalan:doc-cache-off" pi. The old form of the PI only works for XML parsers that are not namespace aware. It tells the engine that documents created in the location paths executed by this element will not be reparsed. It's set by StylesheetHandler during construction. Note that this feature applies _only_ to xsl:for-each elements in its current incarnation; a more general cache management solution is desperately needed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
m_doc_cache_off	TokenNameIdentifier	 m doc cache off
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Construct a element representing xsl:for-each. */	TokenNameCOMMENT_JAVADOC	 Construct a element representing xsl:for-each. 
public	TokenNamepublic	
ElemForEach	TokenNameIdentifier	 Elem For Each
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * The "select" expression. * @serial */	TokenNameCOMMENT_JAVADOC	 The "select" expression. @serial 
protected	TokenNameprotected	
Expression	TokenNameIdentifier	 Expression
m_selectExpression	TokenNameIdentifier	 m select Expression
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Used to fix bug#16889 * Store XPath away for later processing. */	TokenNameCOMMENT_JAVADOC	 Used to fix bug#16889 Store XPath away for later processing. 
protected	TokenNameprotected	
XPath	TokenNameIdentifier	 X Path
m_xpath	TokenNameIdentifier	 m xpath
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the "select" attribute. * * @param xpath The XPath expression for the "select" attribute. */	TokenNameCOMMENT_JAVADOC	 Set the "select" attribute. * @param xpath The XPath expression for the "select" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setSelect	TokenNameIdentifier	 set Select
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_selectExpression	TokenNameIdentifier	 m select Expression
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The following line is part of the codes added to fix bug#16889 	TokenNameCOMMENT_LINE	The following line is part of the codes added to fix bug#16889 
// Store xpath which will be needed when firing Selected Event 	TokenNameCOMMENT_LINE	Store xpath which will be needed when firing Selected Event 
m_xpath	TokenNameIdentifier	 m xpath
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "select" attribute. * * @return The XPath expression for the "select" attribute. */	TokenNameCOMMENT_JAVADOC	 Get the "select" attribute. * @return The XPath expression for the "select" attribute. 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getSelect	TokenNameIdentifier	 get Select
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_selectExpression	TokenNameIdentifier	 m select Expression
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is called after everything else has been * recomposed, and allows the template to set remaining * values that may be based on some other property that * depends on recomposition. * * NEEDSDOC @param sroot * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 This function is called after everything else has been recomposed, and allows the template to set remaining values that may be based on some other property that depends on recomposition. * NEEDSDOC @param sroot * @throws TransformerException 
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
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
getSortElemCount	TokenNameIdentifier	 get Sort Elem Count
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
getSortElem	TokenNameIdentifier	 get Sort Elem
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
m_selectExpression	TokenNameIdentifier	 m select Expression
)	TokenNameRPAREN	
m_selectExpression	TokenNameIdentifier	 m select Expression
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
else	TokenNameelse	
{	TokenNameLBRACE	
m_selectExpression	TokenNameIdentifier	 m select Expression
=	TokenNameEQUAL	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
m_selectDefault	TokenNameIdentifier	 m select Default
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
getSortElemCount	TokenNameIdentifier	 get Sort Elem Count
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
getSortElem	TokenNameIdentifier	 get Sort Elem
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
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
// /** 	TokenNameCOMMENT_LINE	/** 
// * This function is called after everything else has been 	TokenNameCOMMENT_LINE	* This function is called after everything else has been 
// * recomposed, and allows the template to set remaining 	TokenNameCOMMENT_LINE	* recomposed, and allows the template to set remaining 
// * values that may be based on some other property that 	TokenNameCOMMENT_LINE	* values that may be based on some other property that 
// * depends on recomposition. 	TokenNameCOMMENT_LINE	* depends on recomposition. 
// * 	TokenNameCOMMENT_LINE	* 
// * @throws TransformerException 	TokenNameCOMMENT_LINE	* @throws TransformerException 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public void compose() throws TransformerException 	TokenNameCOMMENT_LINE	public void compose() throws TransformerException 
// { 	TokenNameCOMMENT_LINE	{ 
// 	TokenNameCOMMENT_LINE	 
// if (null == m_selectExpression) 	TokenNameCOMMENT_LINE	if (null == m_selectExpression) 
// { 	TokenNameCOMMENT_LINE	{ 
// m_selectExpression = 	TokenNameCOMMENT_LINE	m_selectExpression = 
// getStylesheetRoot().m_selectDefault.getExpression(); 	TokenNameCOMMENT_LINE	getStylesheetRoot().m_selectDefault.getExpression(); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
/** * Vector containing the xsl:sort elements associated with this element. * @serial */	TokenNameCOMMENT_JAVADOC	 Vector containing the xsl:sort elements associated with this element. @serial 
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
m_sortElems	TokenNameIdentifier	 m sort Elems
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Get the count xsl:sort elements associated with this element. * @return The number of xsl:sort elements. */	TokenNameCOMMENT_JAVADOC	 Get the count xsl:sort elements associated with this element. @return The number of xsl:sort elements. 
public	TokenNamepublic	
int	TokenNameint	
getSortElemCount	TokenNameIdentifier	 get Sort Elem Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_sortElems	TokenNameIdentifier	 m sort Elems
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
m_sortElems	TokenNameIdentifier	 m sort Elems
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a xsl:sort element associated with this element. * * @param i Index of xsl:sort element to get * * @return xsl:sort element at given index */	TokenNameCOMMENT_JAVADOC	 Get a xsl:sort element associated with this element. * @param i Index of xsl:sort element to get * @return xsl:sort element at given index 
public	TokenNamepublic	
ElemSort	TokenNameIdentifier	 Elem Sort
getSortElem	TokenNameIdentifier	 get Sort Elem
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ElemSort	TokenNameIdentifier	 Elem Sort
)	TokenNameRPAREN	
m_sortElems	TokenNameIdentifier	 m sort Elems
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a xsl:sort element associated with this element. * * @param sortElem xsl:sort element to set */	TokenNameCOMMENT_JAVADOC	 Set a xsl:sort element associated with this element. * @param sortElem xsl:sort element to set 
public	TokenNamepublic	
void	TokenNamevoid	
setSortElem	TokenNameIdentifier	 set Sort Elem
(	TokenNameLPAREN	
ElemSort	TokenNameIdentifier	 Elem Sort
sortElem	TokenNameIdentifier	 sort Elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_sortElems	TokenNameIdentifier	 m sort Elems
)	TokenNameRPAREN	
m_sortElems	TokenNameIdentifier	 m sort Elems
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_sortElems	TokenNameIdentifier	 m sort Elems
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
sortElem	TokenNameIdentifier	 sort Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
ELEMNAME_FOREACH	TokenNameIdentifier	 ELEMNAME  FOREACH
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node name. * * @return The element's name */	TokenNameCOMMENT_JAVADOC	 Return the node name. * @return The element's name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_FOREACH_STRING	TokenNameIdentifier	 ELEMNAME  FOREACH  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the xsl:for-each transformation * * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute the xsl:for-each transformation * @param transformer non-null reference to the the current transform-time state. * @throws TransformerException 
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
true	TokenNametrue	
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
fireTraceEvent	TokenNameIdentifier	 fire Trace Event
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//trigger for-each element event 	TokenNameCOMMENT_LINE	trigger for-each element event 
try	TokenNametry	
{	TokenNameLBRACE	
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
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
popCurrentTemplateRuleIsNull	TokenNameIdentifier	 pop Current Template Rule Is Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get template element associated with this * * * @return template element associated with this (itself) */	TokenNameCOMMENT_JAVADOC	 Get template element associated with this * @return template element associated with this (itself) 
protected	TokenNameprotected	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
getTemplateMatch	TokenNameIdentifier	 get Template Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sort given nodes * * * @param xctxt The XPath runtime state for the sort. * @param keys Vector of sort keyx * @param sourceNodes Iterator of nodes to sort * * @return iterator of sorted nodes * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Sort given nodes * @param xctxt The XPath runtime state for the sort. @param keys Vector of sort keyx @param sourceNodes Iterator of nodes to sort * @return iterator of sorted nodes * @throws TransformerException 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
sortNodes	TokenNameIdentifier	 sort Nodes
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
DTMIterator	TokenNameIdentifier	 DTM Iterator
sourceNodes	TokenNameIdentifier	 source Nodes
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
NodeSorter	TokenNameIdentifier	 Node Sorter
sorter	TokenNameIdentifier	 sorter
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSorter	TokenNameIdentifier	 Node Sorter
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sourceNodes	TokenNameIdentifier	 source Nodes
.	TokenNameDOT	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sourceNodes	TokenNameIdentifier	 source Nodes
.	TokenNameDOT	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushContextNodeList	TokenNameIdentifier	 push Context Node List
(	TokenNameLPAREN	
sourceNodes	TokenNameIdentifier	 source Nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
sorter	TokenNameIdentifier	 sorter
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
sourceNodes	TokenNameIdentifier	 source Nodes
,	TokenNameCOMMA	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sourceNodes	TokenNameIdentifier	 source Nodes
.	TokenNameDOT	
setCurrentPos	TokenNameIdentifier	 set Current Pos
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popContextNodeList	TokenNameIdentifier	 pop Context Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sourceNodes	TokenNameIdentifier	 source Nodes
;	TokenNameSEMICOLON	
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
try	TokenNametry	
{	TokenNameLBRACE	
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
// The original code, which is broken for bug#16889, 	TokenNameCOMMENT_LINE	The original code, which is broken for bug#16889, 
// which fails to get the original select expression in the select event. 	TokenNameCOMMENT_LINE	which fails to get the original select expression in the select event. 
/* transformer.getTraceManager().fireSelectedEvent( * sourceNode, * this, * "select", * new XPath(m_selectExpression), * new org.apache.xpath.objects.XNodeSet(sourceNodes)); */	TokenNameCOMMENT_BLOCK	 transformer.getTraceManager().fireSelectedEvent( sourceNode, this, "select", new XPath(m_selectExpression), new org.apache.xpath.objects.XNodeSet(sourceNodes)); 
// The following code fixes bug#16889 	TokenNameCOMMENT_LINE	The following code fixes bug#16889 
// Solution: Store away XPath in setSelect(Xath), and use it here. 	TokenNameCOMMENT_LINE	Solution: Store away XPath in setSelect(Xath), and use it here. 
// Pass m_xath, which the current node is associated with, onto the TraceManager. 	TokenNameCOMMENT_LINE	Pass m_xath, which the current node is associated with, onto the TraceManager. 
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
m_xpath	TokenNameIdentifier	 m xpath
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
xObject	TokenNameIdentifier	 x Object
=	TokenNameEQUAL	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireSelectedEvent	TokenNameIdentifier	 fire Selected Event
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"select"	TokenNameStringLiteral	select
,	TokenNameCOMMA	
m_xpath	TokenNameIdentifier	 m xpath
,	TokenNameCOMMA	
xObject	TokenNameIdentifier	 x Object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
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
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentExpressionNode	TokenNameIdentifier	 push Current Expression Node
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
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
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushSAXLocatorNull	TokenNameIdentifier	 push SAX Locator Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushContextNodeList	TokenNameIdentifier	 push Context Node List
(	TokenNameLPAREN	
sourceNodes	TokenNameIdentifier	 source Nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
pushElemTemplateElement	TokenNameIdentifier	 push Elem Template Element
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// pushParams(transformer, xctxt); 	TokenNameCOMMENT_LINE	pushParams(transformer, xctxt); 
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
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
sourceNode	TokenNameIdentifier	 source Node
&	TokenNameAND	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
IDENT_DTM_DEFAULT	TokenNameIdentifier	 IDENT  DTM  DEFAULT
;	TokenNameSEMICOLON	
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
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
&	TokenNameAND	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
IDENT_DTM_DEFAULT	TokenNameIdentifier	 IDENT  DTM  DEFAULT
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
docID	TokenNameIdentifier	 doc ID
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
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
&	TokenNameAND	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
IDENT_DTM_DEFAULT	TokenNameIdentifier	 IDENT  DTM  DEFAULT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//final int exNodeType = dtm.getExpandedTypeID(child); 	TokenNameCOMMENT_LINE	final int exNodeType = dtm.getExpandedTypeID(child); 
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
// Fire a trace event for the template. 	TokenNameCOMMENT_LINE	Fire a trace event for the template. 
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
fireTraceEvent	TokenNameIdentifier	 fire Trace Event
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// And execute the child templates. 	TokenNameCOMMENT_LINE	And execute the child templates. 
// Loop through the children of the template, calling execute on 	TokenNameCOMMENT_LINE	Loop through the children of the template, calling execute on 
// each of them. 	TokenNameCOMMENT_LINE	each of them. 
for	TokenNamefor	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
this	TokenNamethis	
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
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
setCurrentElement	TokenNameIdentifier	 set Current Element
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
if	TokenNameif	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We need to make sure an old current element is not 	TokenNameCOMMENT_LINE	We need to make sure an old current element is not 
// on the stack. See TransformerImpl#getElementCallstack. 	TokenNameCOMMENT_LINE	on the stack. See TransformerImpl#getElementCallstack. 
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
setCurrentElement	TokenNameIdentifier	 set Current Element
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
// KLUGE: Implement <?xalan:doc_cache_off?> 	TokenNameCOMMENT_LINE	KLUGE: Implement <?xalan:doc_cache_off?> 
// ASSUMPTION: This will be set only when the XPath was indeed 	TokenNameCOMMENT_LINE	ASSUMPTION: This will be set only when the XPath was indeed 
// a call to the Document() function. Calling it in other 	TokenNameCOMMENT_LINE	a call to the Document() function. Calling it in other 
// situations is likely to fry Xalan. 	TokenNameCOMMENT_LINE	situations is likely to fry Xalan. 
// 	TokenNameCOMMENT_LINE	 
// %REVIEW% We need a MUCH cleaner solution -- one that will 	TokenNameCOMMENT_LINE	%REVIEW% We need a MUCH cleaner solution -- one that will 
// handle cleaning up after document() and getDTM() in other 	TokenNameCOMMENT_LINE	handle cleaning up after document() and getDTM() in other 
// contexts. The whole SourceTreeManager mechanism should probably 	TokenNameCOMMENT_LINE	contexts. The whole SourceTreeManager mechanism should probably 
// be moved into DTMManager rather than being explicitly invoked in 	TokenNameCOMMENT_LINE	be moved into DTMManager rather than being explicitly invoked in 
// FuncDocument and here. 	TokenNameCOMMENT_LINE	FuncDocument and here. 
if	TokenNameif	
(	TokenNameLPAREN	
m_doc_cache_off	TokenNameIdentifier	 m doc cache off
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"JJK***** CACHE RELEASE ***** "	TokenNameStringLiteral	JJK***** CACHE RELEASE ***** 
+	TokenNamePLUS	
" dtm="	TokenNameStringLiteral	 dtm=
+	TokenNamePLUS	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getDocumentBaseURI	TokenNameIdentifier	 get Document Base URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NOTE: This will work because this is _NOT_ a shared DTM, and thus has 	TokenNameCOMMENT_LINE	NOTE: This will work because this is _NOT_ a shared DTM, and thus has 
// only a single Document node. If it could ever be an RTF or other 	TokenNameCOMMENT_LINE	only a single Document node. If it could ever be an RTF or other 
// shared DTM, this would require substantial rework. 	TokenNameCOMMENT_LINE	shared DTM, this would require substantial rework. 
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getSourceTreeManager	TokenNameIdentifier	 get Source Tree Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeDocumentFromCache	TokenNameIdentifier	 remove Document From Cache
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popSAXLocator	TokenNameIdentifier	 pop SAX Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
/** * Add a child to the child list. * <!ELEMENT xsl:apply-templates (xsl:sort|xsl:with-param)*> * <!ATTLIST xsl:apply-templates * select %expr; "node()" * mode %qname; #IMPLIED * > * * @param newChild Child to add to child list * * @return Child just added to child list */	TokenNameCOMMENT_JAVADOC	 Add a child to the child list. <!ELEMENT xsl:apply-templates (xsl:sort|xsl:with-param)*> <!ATTLIST xsl:apply-templates select %expr; "node()" mode %qname; #IMPLIED > * @param newChild Child to add to child list * @return Child just added to child list 
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
ELEMNAME_SORT	TokenNameIdentifier	 ELEMNAME  SORT
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSortElem	TokenNameIdentifier	 set Sort Elem
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElemSort	TokenNameIdentifier	 Elem Sort
)	TokenNameRPAREN	
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newChild	TokenNameIdentifier	 new Child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
callAttributes	TokenNameIdentifier	 call Attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
callAttributes	TokenNameIdentifier	 call Attributes
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_selectExpression	TokenNameIdentifier	 m select Expression
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_selectExpression	TokenNameIdentifier	 m select Expression
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
getSortElemCount	TokenNameIdentifier	 get Sort Elem Count
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
getSortElem	TokenNameIdentifier	 get Sort Elem
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
callChildVisitors	TokenNameIdentifier	 call Child Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
,	TokenNameCOMMA	
callAttributes	TokenNameIdentifier	 call Attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExpressionOwner#getExpression() */	TokenNameCOMMENT_JAVADOC	 @see ExpressionOwner#getExpression() 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_selectExpression	TokenNameIdentifier	 m select Expression
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
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_selectExpression	TokenNameIdentifier	 m select Expression
=	TokenNameEQUAL	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * to keep the binary compatibility, assign a default value for newly added * globel varialbe m_xpath during deserialization of an object which was * serialized using an older version */	TokenNameCOMMENT_BLOCK	 to keep the binary compatibility, assign a default value for newly added globel varialbe m_xpath during deserialization of an object which was serialized using an older version 
private	TokenNameprivate	
void	TokenNamevoid	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
defaultReadObject	TokenNameIdentifier	 default Read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_xpath	TokenNameIdentifier	 m xpath
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
