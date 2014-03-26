/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DecimalFormatProperties.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DecimalFormatProperties.java 468643 2006-10-28 06:56:03Z minchau $ 
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormatSymbols	TokenNameIdentifier	 Decimal Format Symbols
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
/** * Implement xsl:decimal-format. * <pre> * <!ELEMENT xsl:decimal-format EMPTY> * <!ATTLIST xsl:decimal-format * name %qname; #IMPLIED * decimal-separator %char; "." * grouping-separator %char; "," * infinity CDATA "Infinity" * minus-sign %char; "-" * NaN CDATA "NaN" * percent %char; "%" * per-mille %char; "&#x2030;" * zero-digit %char; "0" * digit %char; "#" * pattern-separator %char; ";" * > * </pre> * @see <a href="http://www.w3.org/TR/xslt#format-number">format-number in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:decimal-format. <pre> <!ELEMENT xsl:decimal-format EMPTY> <!ATTLIST xsl:decimal-format name %qname; #IMPLIED decimal-separator %char; "." grouping-separator %char; "," infinity CDATA "Infinity" minus-sign %char; "-" NaN CDATA "NaN" percent %char; "%" per-mille %char; "&#x2030;" zero-digit %char; "0" digit %char; "#" pattern-separator %char; ";" > </pre> @see <a href="http://www.w3.org/TR/xslt#format-number">format-number in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
DecimalFormatProperties	TokenNameIdentifier	 Decimal Format Properties
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
6559409339256269446L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** An instance of DecimalFormatSymbols for this element. * @serial */	TokenNameCOMMENT_JAVADOC	 An instance of DecimalFormatSymbols for this element. @serial 
DecimalFormatSymbols	TokenNameIdentifier	 Decimal Format Symbols
m_dfs	TokenNameIdentifier	 m dfs
;	TokenNameSEMICOLON	
/** * Constructor DecimalFormatProperties * */	TokenNameCOMMENT_JAVADOC	 Constructor DecimalFormatProperties 
public	TokenNamepublic	
DecimalFormatProperties	TokenNameIdentifier	 Decimal Format Properties
(	TokenNameLPAREN	
int	TokenNameint	
docOrderNumber	TokenNameIdentifier	 doc Order Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dfs	TokenNameIdentifier	 m dfs
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormatSymbols	TokenNameIdentifier	 Decimal Format Symbols
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set default values, they can be overiden if necessary. 	TokenNameCOMMENT_LINE	Set default values, they can be overiden if necessary. 
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
setInfinity	TokenNameIdentifier	 set Infinity
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRVAL_INFINITY	TokenNameIdentifier	 ATTRVAL  INFINITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
setNaN	TokenNameIdentifier	 set Na N
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRVAL_NAN	TokenNameIdentifier	 ATTRVAL  NAN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_docOrderNumber	TokenNameIdentifier	 m doc Order Number
=	TokenNameEQUAL	
docOrderNumber	TokenNameIdentifier	 doc Order Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the decimal format Symbols for this element. * <p>The xsl:decimal-format element declares a decimal-format, * which controls the interpretation of a format pattern used by * the format-number function. If there is a name attribute, then * the element declares a named decimal-format; otherwise, it * declares the default decimal-format. The value of the name * attribute is a QName, which is expanded as described in [2.4 Qualified Names]. * It is an error to declare either the default decimal-format or a * decimal-format with a given name more than once (even with different * import precedence), unless it is declared every time with the same * value for all attributes (taking into account any default values).</p> * <p>The other attributes on xsl:decimal-format correspond to the * methods on the JDK 1.1 DecimalFormatSymbols class. For each get/set * method pair there is an attribute defined for the xsl:decimal-format * element.</p> * * @return the decimal format Symbols for this element. */	TokenNameCOMMENT_JAVADOC	 Return the decimal format Symbols for this element. <p>The xsl:decimal-format element declares a decimal-format, which controls the interpretation of a format pattern used by the format-number function. If there is a name attribute, then the element declares a named decimal-format; otherwise, it declares the default decimal-format. The value of the name attribute is a QName, which is expanded as described in [2.4 Qualified Names]. It is an error to declare either the default decimal-format or a decimal-format with a given name more than once (even with different import precedence), unless it is declared every time with the same value for all attributes (taking into account any default values).</p> <p>The other attributes on xsl:decimal-format correspond to the methods on the JDK 1.1 DecimalFormatSymbols class. For each get/set method pair there is an attribute defined for the xsl:decimal-format element.</p> * @return the decimal format Symbols for this element. 
public	TokenNamepublic	
DecimalFormatSymbols	TokenNameIdentifier	 Decimal Format Symbols
getDecimalFormatSymbols	TokenNameIdentifier	 get Decimal Format Symbols
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dfs	TokenNameIdentifier	 m dfs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If there is a name attribute, then the element declares a named * decimal-format; otherwise, it declares the default decimal-format. * @serial */	TokenNameCOMMENT_JAVADOC	 If there is a name attribute, then the element declares a named decimal-format; otherwise, it declares the default decimal-format. @serial 
private	TokenNameprivate	
QName	TokenNameIdentifier	 Q Name
m_qname	TokenNameIdentifier	 m qname
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the "name" attribute. * If there is a name attribute, then the element declares a named * decimal-format; otherwise, it declares the default decimal-format. * * @param qname The name to set as the "name" attribute. */	TokenNameCOMMENT_JAVADOC	 Set the "name" attribute. If there is a name attribute, then the element declares a named decimal-format; otherwise, it declares the default decimal-format. * @param qname The name to set as the "name" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
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
/** * Get the "name" attribute. * If there is a name attribute, then the element declares a named * decimal-format; otherwise, it declares the default decimal-format. * * @return the value of the "name" attribute. */	TokenNameCOMMENT_JAVADOC	 Get the "name" attribute. If there is a name attribute, then the element declares a named decimal-format; otherwise, it declares the default decimal-format. * @return the value of the "name" attribute. 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_qname	TokenNameIdentifier	 m qname
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
m_qname	TokenNameIdentifier	 m qname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the "decimal-separator" attribute. * decimal-separator specifies the character used for the decimal sign; * the default value is the period character (.). * * @param ds Character to set as decimal separator */	TokenNameCOMMENT_JAVADOC	 Set the "decimal-separator" attribute. decimal-separator specifies the character used for the decimal sign; the default value is the period character (.). * @param ds Character to set as decimal separator 
public	TokenNamepublic	
void	TokenNamevoid	
setDecimalSeparator	TokenNameIdentifier	 set Decimal Separator
(	TokenNameLPAREN	
char	TokenNamechar	
ds	TokenNameIdentifier	 ds
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
setDecimalSeparator	TokenNameIdentifier	 set Decimal Separator
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "decimal-separator" attribute. * decimal-separator specifies the character used for the decimal sign; * the default value is the period character (.). * * @return the character to use as decimal separator */	TokenNameCOMMENT_JAVADOC	 Get the "decimal-separator" attribute. decimal-separator specifies the character used for the decimal sign; the default value is the period character (.). * @return the character to use as decimal separator 
public	TokenNamepublic	
char	TokenNamechar	
getDecimalSeparator	TokenNameIdentifier	 get Decimal Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
getDecimalSeparator	TokenNameIdentifier	 get Decimal Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the "grouping-separator" attribute. * grouping-separator specifies the character used as a grouping * (e.g. thousands) separator; the default value is the comma character (,). * * @param gs Character to use a grouping separator */	TokenNameCOMMENT_JAVADOC	 Set the "grouping-separator" attribute. grouping-separator specifies the character used as a grouping (e.g. thousands) separator; the default value is the comma character (,). * @param gs Character to use a grouping separator 
public	TokenNamepublic	
void	TokenNamevoid	
setGroupingSeparator	TokenNameIdentifier	 set Grouping Separator
(	TokenNameLPAREN	
char	TokenNamechar	
gs	TokenNameIdentifier	 gs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
setGroupingSeparator	TokenNameIdentifier	 set Grouping Separator
(	TokenNameLPAREN	
gs	TokenNameIdentifier	 gs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "grouping-separator" attribute. * grouping-separator specifies the character used as a grouping * (e.g. thousands) separator; the default value is the comma character (,). * * @return Character to use a grouping separator */	TokenNameCOMMENT_JAVADOC	 Get the "grouping-separator" attribute. grouping-separator specifies the character used as a grouping (e.g. thousands) separator; the default value is the comma character (,). * @return Character to use a grouping separator 
public	TokenNamepublic	
char	TokenNamechar	
getGroupingSeparator	TokenNameIdentifier	 get Grouping Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
getGroupingSeparator	TokenNameIdentifier	 get Grouping Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the "infinity" attribute. * infinity specifies the string used to represent infinity; * the default value is the string Infinity. * * @param inf String to use as the "infinity" attribute. */	TokenNameCOMMENT_JAVADOC	 Set the "infinity" attribute. infinity specifies the string used to represent infinity; the default value is the string Infinity. * @param inf String to use as the "infinity" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setInfinity	TokenNameIdentifier	 set Infinity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
inf	TokenNameIdentifier	 inf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
setInfinity	TokenNameIdentifier	 set Infinity
(	TokenNameLPAREN	
inf	TokenNameIdentifier	 inf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "infinity" attribute. * infinity specifies the string used to represent infinity; * the default value is the string Infinity. * * @return String to use as the "infinity" attribute. */	TokenNameCOMMENT_JAVADOC	 Get the "infinity" attribute. infinity specifies the string used to represent infinity; the default value is the string Infinity. * @return String to use as the "infinity" attribute. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInfinity	TokenNameIdentifier	 get Infinity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
getInfinity	TokenNameIdentifier	 get Infinity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the "minus-sign" attribute. * minus-sign specifies the character used as the default minus sign; the * default value is the hyphen-minus character (-, #x2D). * * @param v Character to use as minus sign */	TokenNameCOMMENT_JAVADOC	 Set the "minus-sign" attribute. minus-sign specifies the character used as the default minus sign; the default value is the hyphen-minus character (-, #x2D). * @param v Character to use as minus sign 
public	TokenNamepublic	
void	TokenNamevoid	
setMinusSign	TokenNameIdentifier	 set Minus Sign
(	TokenNameLPAREN	
char	TokenNamechar	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
setMinusSign	TokenNameIdentifier	 set Minus Sign
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "minus-sign" attribute. * minus-sign specifies the character used as the default minus sign; the * default value is the hyphen-minus character (-, #x2D). * * @return Character to use as minus sign */	TokenNameCOMMENT_JAVADOC	 Get the "minus-sign" attribute. minus-sign specifies the character used as the default minus sign; the default value is the hyphen-minus character (-, #x2D). * @return Character to use as minus sign 
public	TokenNamepublic	
char	TokenNamechar	
getMinusSign	TokenNameIdentifier	 get Minus Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
getMinusSign	TokenNameIdentifier	 get Minus Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the "NaN" attribute. * NaN specifies the string used to represent the NaN value; * the default value is the string NaN. * * @param v String to use as the "NaN" attribute. */	TokenNameCOMMENT_JAVADOC	 Set the "NaN" attribute. NaN specifies the string used to represent the NaN value; the default value is the string NaN. * @param v String to use as the "NaN" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setNaN	TokenNameIdentifier	 set Na N
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
setNaN	TokenNameIdentifier	 set Na N
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "NaN" attribute. * NaN specifies the string used to represent the NaN value; * the default value is the string NaN. * * @return String to use as the "NaN" attribute. */	TokenNameCOMMENT_JAVADOC	 Get the "NaN" attribute. NaN specifies the string used to represent the NaN value; the default value is the string NaN. * @return String to use as the "NaN" attribute. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNaN	TokenNameIdentifier	 get Na N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
getNaN	TokenNameIdentifier	 get Na N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node name. * * @return the element's name */	TokenNameCOMMENT_JAVADOC	 Return the node name. * @return the element's name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_DECIMALFORMAT_STRING	TokenNameIdentifier	 ELEMNAME  DECIMALFORMAT  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the "percent" attribute. * percent specifies the character used as a percent sign; the default * value is the percent character (%). * * @param v Character to use as percent */	TokenNameCOMMENT_JAVADOC	 Set the "percent" attribute. percent specifies the character used as a percent sign; the default value is the percent character (%). * @param v Character to use as percent 
public	TokenNamepublic	
void	TokenNamevoid	
setPercent	TokenNameIdentifier	 set Percent
(	TokenNameLPAREN	
char	TokenNamechar	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
setPercent	TokenNameIdentifier	 set Percent
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "percent" attribute. * percent specifies the character used as a percent sign; the default * value is the percent character (%). * * @return Character to use as percent */	TokenNameCOMMENT_JAVADOC	 Get the "percent" attribute. percent specifies the character used as a percent sign; the default value is the percent character (%). * @return Character to use as percent 
public	TokenNamepublic	
char	TokenNamechar	
getPercent	TokenNameIdentifier	 get Percent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
getPercent	TokenNameIdentifier	 get Percent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the "per-mille" attribute. * per-mille specifies the character used as a per mille sign; the default * value is the Unicode per-mille character (#x2030). * * @param v Character to use as per-mille */	TokenNameCOMMENT_JAVADOC	 Set the "per-mille" attribute. per-mille specifies the character used as a per mille sign; the default value is the Unicode per-mille character (#x2030). * @param v Character to use as per-mille 
public	TokenNamepublic	
void	TokenNamevoid	
setPerMille	TokenNameIdentifier	 set Per Mille
(	TokenNameLPAREN	
char	TokenNamechar	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
setPerMill	TokenNameIdentifier	 set Per Mill
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "per-mille" attribute. * per-mille specifies the character used as a per mille sign; the default * value is the Unicode per-mille character (#x2030). * * @return Character to use as per-mille */	TokenNameCOMMENT_JAVADOC	 Get the "per-mille" attribute. per-mille specifies the character used as a per mille sign; the default value is the Unicode per-mille character (#x2030). * @return Character to use as per-mille 
public	TokenNamepublic	
char	TokenNamechar	
getPerMille	TokenNameIdentifier	 get Per Mille
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
getPerMill	TokenNameIdentifier	 get Per Mill
(	TokenNameLPAREN	
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
ELEMNAME_DECIMALFORMAT	TokenNameIdentifier	 ELEMNAME  DECIMALFORMAT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the "zero-digit" attribute. * zero-digit specifies the character used as the digit zero; the default * value is the digit zero (0). * * @param v Character to use as the digit zero */	TokenNameCOMMENT_JAVADOC	 Set the "zero-digit" attribute. zero-digit specifies the character used as the digit zero; the default value is the digit zero (0). * @param v Character to use as the digit zero 
public	TokenNamepublic	
void	TokenNamevoid	
setZeroDigit	TokenNameIdentifier	 set Zero Digit
(	TokenNameLPAREN	
char	TokenNamechar	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
setZeroDigit	TokenNameIdentifier	 set Zero Digit
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "zero-digit" attribute. * zero-digit specifies the character used as the digit zero; the default * value is the digit zero (0). * * @return Character to use as the digit zero */	TokenNameCOMMENT_JAVADOC	 Get the "zero-digit" attribute. zero-digit specifies the character used as the digit zero; the default value is the digit zero (0). * @return Character to use as the digit zero 
public	TokenNamepublic	
char	TokenNamechar	
getZeroDigit	TokenNameIdentifier	 get Zero Digit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
getZeroDigit	TokenNameIdentifier	 get Zero Digit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the "digit" attribute. * digit specifies the character used for a digit in the format pattern; * the default value is the number sign character (#). * * @param v Character to use for a digit in format pattern */	TokenNameCOMMENT_JAVADOC	 Set the "digit" attribute. digit specifies the character used for a digit in the format pattern; the default value is the number sign character (#). * @param v Character to use for a digit in format pattern 
public	TokenNamepublic	
void	TokenNamevoid	
setDigit	TokenNameIdentifier	 set Digit
(	TokenNameLPAREN	
char	TokenNamechar	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
setDigit	TokenNameIdentifier	 set Digit
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "digit" attribute. * digit specifies the character used for a digit in the format pattern; * the default value is the number sign character (#). * * @return Character to use for a digit in format pattern */	TokenNameCOMMENT_JAVADOC	 Get the "digit" attribute. digit specifies the character used for a digit in the format pattern; the default value is the number sign character (#). * @return Character to use for a digit in format pattern 
public	TokenNamepublic	
char	TokenNamechar	
getDigit	TokenNameIdentifier	 get Digit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
getDigit	TokenNameIdentifier	 get Digit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the "pattern-separator" attribute. * pattern-separator specifies the character used to separate positive * and negative sub patterns in a pattern; the default value is the * semi-colon character (;). * * @param v Character to use as a pattern separator */	TokenNameCOMMENT_JAVADOC	 Set the "pattern-separator" attribute. pattern-separator specifies the character used to separate positive and negative sub patterns in a pattern; the default value is the semi-colon character (;). * @param v Character to use as a pattern separator 
public	TokenNamepublic	
void	TokenNamevoid	
setPatternSeparator	TokenNameIdentifier	 set Pattern Separator
(	TokenNameLPAREN	
char	TokenNamechar	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
setPatternSeparator	TokenNameIdentifier	 set Pattern Separator
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "pattern-separator" attribute. * pattern-separator specifies the character used to separate positive * and negative sub patterns in a pattern; the default value is the * semi-colon character (;). * * @return Character to use as a pattern separator */	TokenNameCOMMENT_JAVADOC	 Get the "pattern-separator" attribute. pattern-separator specifies the character used to separate positive and negative sub patterns in a pattern; the default value is the semi-colon character (;). * @return Character to use as a pattern separator 
public	TokenNamepublic	
char	TokenNamechar	
getPatternSeparator	TokenNameIdentifier	 get Pattern Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dfs	TokenNameIdentifier	 m dfs
.	TokenNameDOT	
getPatternSeparator	TokenNameIdentifier	 get Pattern Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is called to recompose() all of the decimal format properties elements. * * @param root Stylesheet root */	TokenNameCOMMENT_JAVADOC	 This function is called to recompose() all of the decimal format properties elements. * @param root Stylesheet root 
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
recomposeDecimalFormats	TokenNameIdentifier	 recompose Decimal Formats
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
