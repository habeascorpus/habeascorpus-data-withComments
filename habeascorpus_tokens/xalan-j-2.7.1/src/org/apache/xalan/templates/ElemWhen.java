/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemWhen.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemWhen.java 468643 2006-10-28 06:56:03Z minchau $ 
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
XPath	TokenNameIdentifier	 X Path
;	TokenNameSEMICOLON	
/** * Implement xsl:when. * <pre> * <!ELEMENT xsl:when %template;> * <!ATTLIST xsl:when * test %expr; #REQUIRED * %space-att; * > * </pre> * @see <a href="http://www.w3.org/TR/xslt#section-Conditional-Processing-with-xsl:choose">XXX in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:when. <pre> <!ELEMENT xsl:when %template;> <!ATTLIST xsl:when test %expr; #REQUIRED %space-att; > </pre> @see <a href="http://www.w3.org/TR/xslt#section-Conditional-Processing-with-xsl:choose">XXX in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemWhen	TokenNameIdentifier	 Elem When
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
5984065730262071360L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Each xsl:when element has a single attribute, test, * which specifies an expression. * @serial */	TokenNameCOMMENT_JAVADOC	 Each xsl:when element has a single attribute, test, which specifies an expression. @serial 
private	TokenNameprivate	
XPath	TokenNameIdentifier	 X Path
m_test	TokenNameIdentifier	 m test
;	TokenNameSEMICOLON	
/** * Set the "test" attribute. * Each xsl:when element has a single attribute, test, * which specifies an expression. * * @param v Value to set for the "test" attribute. */	TokenNameCOMMENT_JAVADOC	 Set the "test" attribute. Each xsl:when element has a single attribute, test, which specifies an expression. * @param v Value to set for the "test" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setTest	TokenNameIdentifier	 set Test
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_test	TokenNameIdentifier	 m test
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "test" attribute. * Each xsl:when element has a single attribute, test, * which specifies an expression. * * @return Value of the "test" attribute. */	TokenNameCOMMENT_JAVADOC	 Get the "test" attribute. Each xsl:when element has a single attribute, test, which specifies an expression. * @return Value of the "test" attribute. 
public	TokenNamepublic	
XPath	TokenNameIdentifier	 X Path
getTest	TokenNameIdentifier	 get Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_test	TokenNameIdentifier	 m test
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
ELEMNAME_WHEN	TokenNameIdentifier	 ELEMNAME  WHEN
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
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
m_test	TokenNameIdentifier	 m test
)	TokenNameRPAREN	
m_test	TokenNameIdentifier	 m test
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
ELEMNAME_WHEN_STRING	TokenNameIdentifier	 ELEMNAME  WHEN  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor ElemWhen * */	TokenNameCOMMENT_JAVADOC	 Constructor ElemWhen 
public	TokenNamepublic	
ElemWhen	TokenNameIdentifier	 Elem When
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
)	TokenNameRPAREN	
m_test	TokenNameIdentifier	 m test
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
m_test	TokenNameIdentifier	 m test
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
}	TokenNameRBRACE	
