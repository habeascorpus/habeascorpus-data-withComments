/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemUse.java 476466 2006-11-18 08:22:31Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemUse.java 476466 2006-11-18 08:22:31Z minchau $ 
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
/** * Implement xsl:use. * This acts as a superclass for ElemCopy, ElemAttributeSet, * ElemElement, and ElemLiteralResult, on order to implement * shared behavior the use-attribute-sets attribute. * @see <a href="http://www.w3.org/TR/xslt#attribute-sets">attribute-sets in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:use. This acts as a superclass for ElemCopy, ElemAttributeSet, ElemElement, and ElemLiteralResult, on order to implement shared behavior the use-attribute-sets attribute. @see <a href="http://www.w3.org/TR/xslt#attribute-sets">attribute-sets in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemUse	TokenNameIdentifier	 Elem Use
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
5830057200289299736L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * The value of the "use-attribute-sets" attribute. * @serial */	TokenNameCOMMENT_JAVADOC	 The value of the "use-attribute-sets" attribute. @serial 
private	TokenNameprivate	
QName	TokenNameIdentifier	 Q Name
m_attributeSetsNames	TokenNameIdentifier	 m attribute Sets Names
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the "use-attribute-sets" attribute. * Attribute sets are used by specifying a use-attribute-sets * attribute on xsl:element, xsl:copy (see [7.5 Copying]) or * xsl:attribute-set elements. The value of the use-attribute-sets * attribute is a whitespace-separated list of names of attribute * sets. Each name is specified as a QName, which is expanded as * described in [2.4 Qualified Names]. * * @param v The value to set for the "use-attribute-sets" attribute. */	TokenNameCOMMENT_JAVADOC	 Set the "use-attribute-sets" attribute. Attribute sets are used by specifying a use-attribute-sets attribute on xsl:element, xsl:copy (see [7.5 Copying]) or xsl:attribute-set elements. The value of the use-attribute-sets attribute is a whitespace-separated list of names of attribute sets. Each name is specified as a QName, which is expanded as described in [2.4 Qualified Names]. * @param v The value to set for the "use-attribute-sets" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setUseAttributeSets	TokenNameIdentifier	 set Use Attribute Sets
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_attributeSetsNames	TokenNameIdentifier	 m attribute Sets Names
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_attributeSetsNames	TokenNameIdentifier	 m attribute Sets Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the "use-attribute-sets" attribute. * Attribute sets are used by specifying a use-attribute-sets * attribute on xsl:element, xsl:copy (see [7.5 Copying]) or * xsl:attribute-set elements. The value of the use-attribute-sets * attribute is a whitespace-separated list of names of attribute * sets. Each name is specified as a QName, which is expanded as * described in [2.4 Qualified Names]. * * @param v The value to set for the "use-attribute-sets" attribute. */	TokenNameCOMMENT_JAVADOC	 Set the "use-attribute-sets" attribute. Attribute sets are used by specifying a use-attribute-sets attribute on xsl:element, xsl:copy (see [7.5 Copying]) or xsl:attribute-set elements. The value of the use-attribute-sets attribute is a whitespace-separated list of names of attribute sets. Each name is specified as a QName, which is expanded as described in [2.4 Qualified Names]. * @param v The value to set for the "use-attribute-sets" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setUseAttributeSets	TokenNameIdentifier	 set Use Attribute Sets
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_attributeSetsNames	TokenNameIdentifier	 m attribute Sets Names
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "use-attribute-sets" attribute. * Attribute sets are used by specifying a use-attribute-sets * attribute on xsl:element, xsl:copy (see [7.5 Copying]) or * xsl:attribute-set elements, or a xsl:use-attribute-sets attribute on * Literal Result Elements. * The value of the use-attribute-sets * attribute is a whitespace-separated list of names of attribute * sets. Each name is specified as a QName, which is expanded as * described in [2.4 Qualified Names]. * * @return The value of the "use-attribute-sets" attribute. */	TokenNameCOMMENT_JAVADOC	 Get the "use-attribute-sets" attribute. Attribute sets are used by specifying a use-attribute-sets attribute on xsl:element, xsl:copy (see [7.5 Copying]) or xsl:attribute-set elements, or a xsl:use-attribute-sets attribute on Literal Result Elements. The value of the use-attribute-sets attribute is a whitespace-separated list of names of attribute sets. Each name is specified as a QName, which is expanded as described in [2.4 Qualified Names]. * @return The value of the "use-attribute-sets" attribute. 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getUseAttributeSets	TokenNameIdentifier	 get Use Attribute Sets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_attributeSetsNames	TokenNameIdentifier	 m attribute Sets Names
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add the attributes from the named attribute sets to the attribute list. * TODO: Error handling for: "It is an error if there are two attribute sets * with the same expanded-name and with equal import precedence and that both * contain the same attribute unless there is a definition of the attribute * set with higher import precedence that also contains the attribute." * * @param transformer non-null reference to the the current transform-time state. * @param stylesheet The owning root stylesheet * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Add the attributes from the named attribute sets to the attribute list. TODO: Error handling for: "It is an error if there are two attribute sets with the same expanded-name and with equal import precedence and that both contain the same attribute unless there is a definition of the attribute set with higher import precedence that also contains the attribute." * @param transformer non-null reference to the the current transform-time state. @param stylesheet The owning root stylesheet * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
applyAttrSets	TokenNameIdentifier	 apply Attr Sets
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
stylesheet	TokenNameIdentifier	 stylesheet
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
applyAttrSets	TokenNameIdentifier	 apply Attr Sets
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
stylesheet	TokenNameIdentifier	 stylesheet
,	TokenNameCOMMA	
m_attributeSetsNames	TokenNameIdentifier	 m attribute Sets Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add the attributes from the named attribute sets to the attribute list. * TODO: Error handling for: "It is an error if there are two attribute sets * with the same expanded-name and with equal import precedence and that both * contain the same attribute unless there is a definition of the attribute * set with higher import precedence that also contains the attribute." * * @param transformer non-null reference to the the current transform-time state. * @param stylesheet The owning root stylesheet * @param attributeSetsNames List of attribute sets names to apply * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Add the attributes from the named attribute sets to the attribute list. TODO: Error handling for: "It is an error if there are two attribute sets with the same expanded-name and with equal import precedence and that both contain the same attribute unless there is a definition of the attribute set with higher import precedence that also contains the attribute." * @param transformer non-null reference to the the current transform-time state. @param stylesheet The owning root stylesheet @param attributeSetsNames List of attribute sets names to apply * @throws TransformerException 
private	TokenNameprivate	
void	TokenNamevoid	
applyAttrSets	TokenNameIdentifier	 apply Attr Sets
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
stylesheet	TokenNameIdentifier	 stylesheet
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
attributeSetsNames	TokenNameIdentifier	 attribute Sets Names
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
attributeSetsNames	TokenNameIdentifier	 attribute Sets Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nNames	TokenNameIdentifier	 n Names
=	TokenNameEQUAL	
attributeSetsNames	TokenNameIdentifier	 attribute Sets Names
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
nNames	TokenNameIdentifier	 n Names
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
attributeSetsNames	TokenNameIdentifier	 attribute Sets Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
attrSets	TokenNameIdentifier	 attr Sets
=	TokenNameEQUAL	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
getAttributeSetComposed	TokenNameIdentifier	 get Attribute Set Composed
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
attrSets	TokenNameIdentifier	 attr Sets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nSets	TokenNameIdentifier	 n Sets
=	TokenNameEQUAL	
attrSets	TokenNameIdentifier	 attr Sets
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Highest priority attribute set will be at the top, 	TokenNameCOMMENT_LINE	Highest priority attribute set will be at the top, 
// so process it last. 	TokenNameCOMMENT_LINE	so process it last. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
nSets	TokenNameIdentifier	 n Sets
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemAttributeSet	TokenNameIdentifier	 Elem Attribute Set
attrSet	TokenNameIdentifier	 attr Set
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemAttributeSet	TokenNameIdentifier	 Elem Attribute Set
)	TokenNameRPAREN	
attrSets	TokenNameIdentifier	 attr Sets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NO_ATTRIB_SET	TokenNameIdentifier	 ER  NO  ATTRIB  SET
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
qname	TokenNameIdentifier	 qname
}	TokenNameRBRACE	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Copy attributes specified by use-attribute-sets to the result tree. * Specifying a use-attribute-sets attribute is equivalent to adding * xsl:attribute elements for each of the attributes in each of the * named attribute sets to the beginning of the content of the element * with the use-attribute-sets attribute, in the same order in which * the names of the attribute sets are specified in the use-attribute-sets * attribute. It is an error if use of use-attribute-sets attributes * on xsl:attribute-set elements causes an attribute set to directly * or indirectly use itself. * * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Copy attributes specified by use-attribute-sets to the result tree. Specifying a use-attribute-sets attribute is equivalent to adding xsl:attribute elements for each of the attributes in each of the named attribute sets to the beginning of the content of the element with the use-attribute-sets attribute, in the same order in which the names of the attribute sets are specified in the use-attribute-sets attribute. It is an error if use of use-attribute-sets attributes on xsl:attribute-set elements causes an attribute set to directly or indirectly use itself. * @param transformer non-null reference to the the current transform-time state. * @throws TransformerException 
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
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_attributeSetsNames	TokenNameIdentifier	 m attribute Sets Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
applyAttrSets	TokenNameIdentifier	 apply Attr Sets
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_attributeSetsNames	TokenNameIdentifier	 m attribute Sets Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
