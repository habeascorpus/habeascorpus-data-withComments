/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemSort.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemSort.java 468643 2006-10-28 06:56:03Z minchau $ 
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
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * Implement xsl:sort. * <pre> * <!ELEMENT xsl:sort EMPTY> * <!ATTLIST xsl:sort * select %expr; "." * lang %avt; #IMPLIED * data-type %avt; "text" * order %avt; "ascending" * case-order %avt; #IMPLIED * > * <!-- xsl:sort cannot occur after any other elements or * any non-whitespace character --> * </pre> * @see <a href="http://www.w3.org/TR/xslt#sorting">sorting in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:sort. <pre> <!ELEMENT xsl:sort EMPTY> <!ATTLIST xsl:sort select %expr; "." lang %avt; #IMPLIED data-type %avt; "text" order %avt; "ascending" case-order %avt; #IMPLIED > <!-- xsl:sort cannot occur after any other elements or any non-whitespace character --> </pre> @see <a href="http://www.w3.org/TR/xslt#sorting">sorting in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemSort	TokenNameIdentifier	 Elem Sort
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
4991510257335851938L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * xsl:sort has a select attribute whose value is an expression. * @serial */	TokenNameCOMMENT_JAVADOC	 xsl:sort has a select attribute whose value is an expression. @serial 
private	TokenNameprivate	
XPath	TokenNameIdentifier	 X Path
m_selectExpression	TokenNameIdentifier	 m select Expression
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the "select" attribute. * xsl:sort has a select attribute whose value is an expression. * For each node to be processed, the expression is evaluated * with that node as the current node and with the complete * list of nodes being processed in unsorted order as the current * node list. The resulting object is converted to a string as if * by a call to the string function; this string is used as the * sort key for that node. The default value of the select attribute * is ., which will cause the string-value of the current node to * be used as the sort key. * * @param v Value to set for the "select" attribute */	TokenNameCOMMENT_JAVADOC	 Set the "select" attribute. xsl:sort has a select attribute whose value is an expression. For each node to be processed, the expression is evaluated with that node as the current node and with the complete list of nodes being processed in unsorted order as the current node list. The resulting object is converted to a string as if by a call to the string function; this string is used as the sort key for that node. The default value of the select attribute is ., which will cause the string-value of the current node to be used as the sort key. * @param v Value to set for the "select" attribute 
public	TokenNamepublic	
void	TokenNamevoid	
setSelect	TokenNameIdentifier	 set Select
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getPatternString	TokenNameIdentifier	 get Pattern String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
m_selectExpression	TokenNameIdentifier	 m select Expression
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
else	TokenNameelse	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NO_CURLYBRACE	TokenNameIdentifier	 ER  NO  CURLYBRACE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "select" attribute. * xsl:sort has a select attribute whose value is an expression. * For each node to be processed, the expression is evaluated * with that node as the current node and with the complete * list of nodes being processed in unsorted order as the current * node list. The resulting object is converted to a string as if * by a call to the string function; this string is used as the * sort key for that node. The default value of the select attribute * is ., which will cause the string-value of the current node to * be used as the sort key. * * @return The value of the "select" attribute */	TokenNameCOMMENT_JAVADOC	 Get the "select" attribute. xsl:sort has a select attribute whose value is an expression. For each node to be processed, the expression is evaluated with that node as the current node and with the complete list of nodes being processed in unsorted order as the current node list. The resulting object is converted to a string as if by a call to the string function; this string is used as the sort key for that node. The default value of the select attribute is ., which will cause the string-value of the current node to be used as the sort key. * @return The value of the "select" attribute 
public	TokenNamepublic	
XPath	TokenNameIdentifier	 X Path
getSelect	TokenNameIdentifier	 get Select
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_selectExpression	TokenNameIdentifier	 m select Expression
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * lang specifies the language of the sort keys. * @serial */	TokenNameCOMMENT_JAVADOC	 lang specifies the language of the sort keys. @serial 
private	TokenNameprivate	
AVT	TokenNameIdentifier	 AVT
m_lang_avt	TokenNameIdentifier	 m lang avt
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the "lang" attribute. * lang specifies the language of the sort keys; it has the same * range of values as xml:lang [XML]; if no lang value is * specified, the language should be determined from the system environment. * * @param v The value to set for the "lang" attribute */	TokenNameCOMMENT_JAVADOC	 Set the "lang" attribute. lang specifies the language of the sort keys; it has the same range of values as xml:lang [XML]; if no lang value is specified, the language should be determined from the system environment. * @param v The value to set for the "lang" attribute 
public	TokenNamepublic	
void	TokenNamevoid	
setLang	TokenNameIdentifier	 set Lang
(	TokenNameLPAREN	
AVT	TokenNameIdentifier	 AVT
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lang_avt	TokenNameIdentifier	 m lang avt
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "lang" attribute. * lang specifies the language of the sort keys; it has the same * range of values as xml:lang [XML]; if no lang value is * specified, the language should be determined from the system environment. * * @return The value of the "lang" attribute */	TokenNameCOMMENT_JAVADOC	 Get the "lang" attribute. lang specifies the language of the sort keys; it has the same range of values as xml:lang [XML]; if no lang value is specified, the language should be determined from the system environment. * @return The value of the "lang" attribute 
public	TokenNamepublic	
AVT	TokenNameIdentifier	 AVT
getLang	TokenNameIdentifier	 get Lang
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_lang_avt	TokenNameIdentifier	 m lang avt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * data-type specifies the data type of the * strings to be sorted. * @serial */	TokenNameCOMMENT_JAVADOC	 data-type specifies the data type of the strings to be sorted. @serial 
private	TokenNameprivate	
AVT	TokenNameIdentifier	 AVT
m_dataType_avt	TokenNameIdentifier	 m data Type avt
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the "data-type" attribute. * <code>data-type</code> specifies the data type of the * strings; the following values are allowed: * <ul> * <li> * <code>text</code> specifies that the sort keys should be * sorted lexicographically in the culturally correct manner for the * language specified by <code>lang</code>. * </li> * <li> * <code>number</code> specifies that the sort keys should be * converted to numbers and then sorted according to the numeric value; * the sort key is converted to a number as if by a call to the * <b><a href="http://www.w3.org/TR/xpath#function-number">number</a></b> function; the <code>lang</code> * attribute is ignored. * </li> * <li> * A <a href="http://www.w3.org/TR/REC-xml-names#NT-QName">QName</a> with a prefix * is expanded into an <a href="http://www.w3.org/TR/xpath#dt-expanded-name">expanded-name</a> as described * in <a href="#qname">[<b>2.4 Qualified Names</b>]</a>; the expanded-name identifies the data-type; * the behavior in this case is not specified by this document. * </li> * </ul> * <p>The default value is <code>text</code>.</p> * <blockquote> * <b>NOTE: </b>The XSL Working Group plans that future versions of XSLT will * leverage XML Schemas to define further values for this * attribute.</blockquote> * * @param v Value to set for the "data-type" attribute */	TokenNameCOMMENT_JAVADOC	 Set the "data-type" attribute. <code>data-type</code> specifies the data type of the strings; the following values are allowed: <ul> <li> <code>text</code> specifies that the sort keys should be sorted lexicographically in the culturally correct manner for the language specified by <code>lang</code>. </li> <li> <code>number</code> specifies that the sort keys should be converted to numbers and then sorted according to the numeric value; the sort key is converted to a number as if by a call to the <b><a href="http://www.w3.org/TR/xpath#function-number">number</a></b> function; the <code>lang</code> attribute is ignored. </li> <li> A <a href="http://www.w3.org/TR/REC-xml-names#NT-QName">QName</a> with a prefix is expanded into an <a href="http://www.w3.org/TR/xpath#dt-expanded-name">expanded-name</a> as described in <a href="#qname">[<b>2.4 Qualified Names</b>]</a>; the expanded-name identifies the data-type; the behavior in this case is not specified by this document. </li> </ul> <p>The default value is <code>text</code>.</p> <blockquote> <b>NOTE: </b>The XSL Working Group plans that future versions of XSLT will leverage XML Schemas to define further values for this attribute.</blockquote> * @param v Value to set for the "data-type" attribute 
public	TokenNamepublic	
void	TokenNamevoid	
setDataType	TokenNameIdentifier	 set Data Type
(	TokenNameLPAREN	
AVT	TokenNameIdentifier	 AVT
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dataType_avt	TokenNameIdentifier	 m data Type avt
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "data-type" attribute. * <code>data-type</code> specifies the data type of the * strings; the following values are allowed: * <ul> * <li> * <code>text</code> specifies that the sort keys should be * sorted lexicographically in the culturally correct manner for the * language specified by <code>lang</code>. * </li> * <li> * <code>number</code> specifies that the sort keys should be * converted to numbers and then sorted according to the numeric value; * the sort key is converted to a number as if by a call to the * <b><a href="http://www.w3.org/TR/xpath#function-number">number</a></b> function; the <code>lang</code> * attribute is ignored. * </li> * <li> * A <a href="http://www.w3.org/TR/REC-xml-names#NT-QName">QName</a> with a prefix * is expanded into an <a href="http://www.w3.org/TR/xpath#dt-expanded-name">expanded-name</a> as described * in <a href="#qname">[<b>2.4 Qualified Names</b>]</a>; the expanded-name identifies the data-type; * the behavior in this case is not specified by this document. * </li> * </ul> * <p>The default value is <code>text</code>.</p> * <blockquote> * <b>NOTE: </b>The XSL Working Group plans that future versions of XSLT will * leverage XML Schemas to define further values for this * attribute.</blockquote> * * @return The value of the "data-type" attribute */	TokenNameCOMMENT_JAVADOC	 Get the "data-type" attribute. <code>data-type</code> specifies the data type of the strings; the following values are allowed: <ul> <li> <code>text</code> specifies that the sort keys should be sorted lexicographically in the culturally correct manner for the language specified by <code>lang</code>. </li> <li> <code>number</code> specifies that the sort keys should be converted to numbers and then sorted according to the numeric value; the sort key is converted to a number as if by a call to the <b><a href="http://www.w3.org/TR/xpath#function-number">number</a></b> function; the <code>lang</code> attribute is ignored. </li> <li> A <a href="http://www.w3.org/TR/REC-xml-names#NT-QName">QName</a> with a prefix is expanded into an <a href="http://www.w3.org/TR/xpath#dt-expanded-name">expanded-name</a> as described in <a href="#qname">[<b>2.4 Qualified Names</b>]</a>; the expanded-name identifies the data-type; the behavior in this case is not specified by this document. </li> </ul> <p>The default value is <code>text</code>.</p> <blockquote> <b>NOTE: </b>The XSL Working Group plans that future versions of XSLT will leverage XML Schemas to define further values for this attribute.</blockquote> * @return The value of the "data-type" attribute 
public	TokenNamepublic	
AVT	TokenNameIdentifier	 AVT
getDataType	TokenNameIdentifier	 get Data Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dataType_avt	TokenNameIdentifier	 m data Type avt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * order specifies whether the strings should be sorted in ascending * or descending order. * @serial */	TokenNameCOMMENT_JAVADOC	 order specifies whether the strings should be sorted in ascending or descending order. @serial 
private	TokenNameprivate	
AVT	TokenNameIdentifier	 AVT
m_order_avt	TokenNameIdentifier	 m order avt
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the "order" attribute. * order specifies whether the strings should be sorted in ascending * or descending order; ascending specifies ascending order; descending * specifies descending order; the default is ascending. * * @param v The value to set for the "order" attribute */	TokenNameCOMMENT_JAVADOC	 Set the "order" attribute. order specifies whether the strings should be sorted in ascending or descending order; ascending specifies ascending order; descending specifies descending order; the default is ascending. * @param v The value to set for the "order" attribute 
public	TokenNamepublic	
void	TokenNamevoid	
setOrder	TokenNameIdentifier	 set Order
(	TokenNameLPAREN	
AVT	TokenNameIdentifier	 AVT
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_order_avt	TokenNameIdentifier	 m order avt
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "order" attribute. * order specifies whether the strings should be sorted in ascending * or descending order; ascending specifies ascending order; descending * specifies descending order; the default is ascending. * * @return The value of the "order" attribute */	TokenNameCOMMENT_JAVADOC	 Get the "order" attribute. order specifies whether the strings should be sorted in ascending or descending order; ascending specifies ascending order; descending specifies descending order; the default is ascending. * @return The value of the "order" attribute 
public	TokenNamepublic	
AVT	TokenNameIdentifier	 AVT
getOrder	TokenNameIdentifier	 get Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_order_avt	TokenNameIdentifier	 m order avt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * case-order has the value upper-first or lower-first. * The default value is language dependent. * @serial */	TokenNameCOMMENT_JAVADOC	 case-order has the value upper-first or lower-first. The default value is language dependent. @serial 
private	TokenNameprivate	
AVT	TokenNameIdentifier	 AVT
m_caseorder_avt	TokenNameIdentifier	 m caseorder avt
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the "case-order" attribute. * case-order has the value upper-first or lower-first; this applies * when data-type="text", and specifies that upper-case letters should * sort before lower-case letters or vice-versa respectively. * For example, if lang="en", then A a B b are sorted with * case-order="upper-first" and a A b B are sorted with case-order="lower-first". * The default value is language dependent. * * @param v The value to set for the "case-order" attribute * * @serial */	TokenNameCOMMENT_JAVADOC	 Set the "case-order" attribute. case-order has the value upper-first or lower-first; this applies when data-type="text", and specifies that upper-case letters should sort before lower-case letters or vice-versa respectively. For example, if lang="en", then A a B b are sorted with case-order="upper-first" and a A b B are sorted with case-order="lower-first". The default value is language dependent. * @param v The value to set for the "case-order" attribute * @serial 
public	TokenNamepublic	
void	TokenNamevoid	
setCaseOrder	TokenNameIdentifier	 set Case Order
(	TokenNameLPAREN	
AVT	TokenNameIdentifier	 AVT
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_caseorder_avt	TokenNameIdentifier	 m caseorder avt
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "case-order" attribute. * case-order has the value upper-first or lower-first; this applies * when data-type="text", and specifies that upper-case letters should * sort before lower-case letters or vice-versa respectively. * For example, if lang="en", then A a B b are sorted with * case-order="upper-first" and a A b B are sorted with case-order="lower-first". * The default value is language dependent. * * @return The value of the "case-order" attribute */	TokenNameCOMMENT_JAVADOC	 Get the "case-order" attribute. case-order has the value upper-first or lower-first; this applies when data-type="text", and specifies that upper-case letters should sort before lower-case letters or vice-versa respectively. For example, if lang="en", then A a B b are sorted with case-order="upper-first" and a A b B are sorted with case-order="lower-first". The default value is language dependent. * @return The value of the "case-order" attribute 
public	TokenNamepublic	
AVT	TokenNameIdentifier	 AVT
getCaseOrder	TokenNameIdentifier	 get Case Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_caseorder_avt	TokenNameIdentifier	 m caseorder avt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an int constant identifying the type of element. * @see org.apache.xalan.templates.Constants * * @return The token ID of the element */	TokenNameCOMMENT_JAVADOC	 Get an int constant identifying the type of element. @see org.apache.xalan.templates.Constants * @return The token ID of the element 
public	TokenNamepublic	
int	TokenNameint	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_SORT	TokenNameIdentifier	 ELEMNAME  SORT
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
ELEMNAME_SORT_STRING	TokenNameIdentifier	 ELEMNAME  SORT  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a child to the child list. * * @param newChild Child to add to the child list * * @return Child just added to the child list * * @throws DOMException */	TokenNameCOMMENT_JAVADOC	 Add a child to the child list. * @param newChild Child to add to the child list * @return Child just added to the child list * @throws DOMException 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_CANNOT_ADD	TokenNameIdentifier	 ER  CANNOT  ADD
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
newChild	TokenNameIdentifier	 new Child
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can not add " +((ElemTemplateElement)newChild).m_elemName + 	TokenNameCOMMENT_LINE	"Can not add " +((ElemTemplateElement)newChild).m_elemName + 
//" to " + this.m_elemName); 	TokenNameCOMMENT_LINE	" to " + this.m_elemName); 
return	TokenNamereturn	
null	TokenNamenull	
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
m_caseorder_avt	TokenNameIdentifier	 m caseorder avt
)	TokenNameRPAREN	
m_caseorder_avt	TokenNameIdentifier	 m caseorder avt
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
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_dataType_avt	TokenNameIdentifier	 m data Type avt
)	TokenNameRPAREN	
m_dataType_avt	TokenNameIdentifier	 m data Type avt
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
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_lang_avt	TokenNameIdentifier	 m lang avt
)	TokenNameRPAREN	
m_lang_avt	TokenNameIdentifier	 m lang avt
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
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_order_avt	TokenNameIdentifier	 m order avt
)	TokenNameRPAREN	
m_order_avt	TokenNameIdentifier	 m order avt
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
cstate	TokenNameIdentifier	 cstate
.	TokenNameDOT	
getGlobalsSize	TokenNameIdentifier	 get Globals Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
