/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XNumber.java 469368 2006-10-31 04:41:36Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XNumber.java 469368 2006-10-31 04:41:36Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
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
/** * This class represents an XPath number, and is capable of * converting the number to other types, such as a string. * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 This class represents an XPath number, and is capable of converting the number to other types, such as a string. @xsl.usage general 
public	TokenNamepublic	
class	TokenNameclass	
XNumber	TokenNameIdentifier	 X Number
extends	TokenNameextends	
XObject	TokenNameIdentifier	 X Object
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
2720400709619020193L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Value of the XNumber object. * @serial */	TokenNameCOMMENT_JAVADOC	 Value of the XNumber object. @serial 
double	TokenNamedouble	
m_val	TokenNameIdentifier	 m val
;	TokenNameSEMICOLON	
/** * Construct a XNodeSet object. * * @param d Value of the object */	TokenNameCOMMENT_JAVADOC	 Construct a XNodeSet object. * @param d Value of the object 
public	TokenNamepublic	
XNumber	TokenNameIdentifier	 X Number
(	TokenNameLPAREN	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_val	TokenNameIdentifier	 m val
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a XNodeSet object. * * @param num Value of the object */	TokenNameCOMMENT_JAVADOC	 Construct a XNodeSet object. * @param num Value of the object 
public	TokenNamepublic	
XNumber	TokenNameIdentifier	 X Number
(	TokenNameLPAREN	
Number	TokenNameIdentifier	 Number
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_val	TokenNameIdentifier	 m val
=	TokenNameEQUAL	
num	TokenNameIdentifier	 num
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell that this is a CLASS_NUMBER. * * @return node type CLASS_NUMBER */	TokenNameCOMMENT_JAVADOC	 Tell that this is a CLASS_NUMBER. * @return node type CLASS_NUMBER 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CLASS_NUMBER	TokenNameIdentifier	 CLASS  NUMBER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a request type, return the equivalent string. * For diagnostic purposes. * * @return type string "#NUMBER" */	TokenNameCOMMENT_JAVADOC	 Given a request type, return the equivalent string. For diagnostic purposes. * @return type string "#NUMBER" 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeString	TokenNameIdentifier	 get Type String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"#NUMBER"	TokenNameStringLiteral	#NUMBER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a number. * * @return the value of the XNumber object */	TokenNameCOMMENT_JAVADOC	 Cast result object to a number. * @return the value of the XNumber object 
public	TokenNamepublic	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_val	TokenNameIdentifier	 m val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Evaluate expression to a number. * * @return 0.0 * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Evaluate expression to a number. * @return 0.0 * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
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
m_val	TokenNameIdentifier	 m val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a boolean. * * @return false if the value is NaN or equal to 0.0 */	TokenNameCOMMENT_JAVADOC	 Cast result object to a boolean. * @return false if the value is NaN or equal to 0.0 
public	TokenNamepublic	
boolean	TokenNameboolean	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
m_val	TokenNameIdentifier	 m val
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
m_val	TokenNameIdentifier	 m val
==	TokenNameEQUAL_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
false	TokenNamefalse	
:	TokenNameCOLON	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Cast result object to a string. 	TokenNameCOMMENT_LINE	* Cast result object to a string. 
// * 	TokenNameCOMMENT_LINE	* 
// * @return "NaN" if the number is NaN, Infinity or -Infinity if 	TokenNameCOMMENT_LINE	* @return "NaN" if the number is NaN, Infinity or -Infinity if 
// * the number is infinite or the string value of the number. 	TokenNameCOMMENT_LINE	* the number is infinite or the string value of the number. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// private static final int PRECISION = 16; 	TokenNameCOMMENT_LINE	private static final int PRECISION = 16; 
// public String str() 	TokenNameCOMMENT_LINE	public String str() 
// { 	TokenNameCOMMENT_LINE	{ 
// 	TokenNameCOMMENT_LINE	 
// if (Double.isNaN(m_val)) 	TokenNameCOMMENT_LINE	if (Double.isNaN(m_val)) 
// { 	TokenNameCOMMENT_LINE	{ 
// return "NaN"; 	TokenNameCOMMENT_LINE	return "NaN"; 
// } 	TokenNameCOMMENT_LINE	} 
// else if (Double.isInfinite(m_val)) 	TokenNameCOMMENT_LINE	else if (Double.isInfinite(m_val)) 
// { 	TokenNameCOMMENT_LINE	{ 
// if (m_val > 0) 	TokenNameCOMMENT_LINE	if (m_val > 0) 
// return "Infinity"; 	TokenNameCOMMENT_LINE	return "Infinity"; 
// else 	TokenNameCOMMENT_LINE	else 
// return "-Infinity"; 	TokenNameCOMMENT_LINE	return "-Infinity"; 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// long longVal = (long)m_val; 	TokenNameCOMMENT_LINE	long longVal = (long)m_val; 
// if ((double)longVal == m_val) 	TokenNameCOMMENT_LINE	if ((double)longVal == m_val) 
// return Long.toString(longVal); 	TokenNameCOMMENT_LINE	return Long.toString(longVal); 
// 	TokenNameCOMMENT_LINE	 
// 	TokenNameCOMMENT_LINE	 
// String s = Double.toString(m_val); 	TokenNameCOMMENT_LINE	String s = Double.toString(m_val); 
// int len = s.length(); 	TokenNameCOMMENT_LINE	int len = s.length(); 
// 	TokenNameCOMMENT_LINE	 
// if (s.charAt(len - 2) == '.' && s.charAt(len - 1) == '0') 	TokenNameCOMMENT_LINE	if (s.charAt(len - 2) == '.' && s.charAt(len - 1) == '0') 
// { 	TokenNameCOMMENT_LINE	{ 
// return s.substring(0, len - 2); 	TokenNameCOMMENT_LINE	return s.substring(0, len - 2); 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// int exp = 0; 	TokenNameCOMMENT_LINE	int exp = 0; 
// int e = s.indexOf('E'); 	TokenNameCOMMENT_LINE	int e = s.indexOf('E'); 
// if (e != -1) 	TokenNameCOMMENT_LINE	if (e != -1) 
// { 	TokenNameCOMMENT_LINE	{ 
// exp = Integer.parseInt(s.substring(e + 1)); 	TokenNameCOMMENT_LINE	exp = Integer.parseInt(s.substring(e + 1)); 
// s = s.substring(0,e); 	TokenNameCOMMENT_LINE	s = s.substring(0,e); 
// len = e; 	TokenNameCOMMENT_LINE	len = e; 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// // Calculate Significant Digits: 	TokenNameCOMMENT_LINE	// Calculate Significant Digits: 
// // look from start of string for first digit 	TokenNameCOMMENT_LINE	// look from start of string for first digit 
// // look from end for last digit 	TokenNameCOMMENT_LINE	// look from end for last digit 
// // significant digits = end - start + (0 or 1 depending on decimal location) 	TokenNameCOMMENT_LINE	// significant digits = end - start + (0 or 1 depending on decimal location) 
// 	TokenNameCOMMENT_LINE	 
// int decimalPos = -1; 	TokenNameCOMMENT_LINE	int decimalPos = -1; 
// int start = (s.charAt(0) == '-') ? 1 : 0; 	TokenNameCOMMENT_LINE	int start = (s.charAt(0) == '-') ? 1 : 0; 
// findStart: for( ; start < len; start++ ) 	TokenNameCOMMENT_LINE	findStart: for( ; start < len; start++ ) 
// { 	TokenNameCOMMENT_LINE	{ 
// switch (s.charAt(start)) 	TokenNameCOMMENT_LINE	switch (s.charAt(start)) 
// { 	TokenNameCOMMENT_LINE	{ 
// case '0': 	TokenNameCOMMENT_LINE	case '0': 
// break; 	TokenNameCOMMENT_LINE	break; 
// case '.': 	TokenNameCOMMENT_LINE	case '.': 
// decimalPos = start; 	TokenNameCOMMENT_LINE	decimalPos = start; 
// break; 	TokenNameCOMMENT_LINE	break; 
// default: 	TokenNameCOMMENT_LINE	default: 
// break findStart; 	TokenNameCOMMENT_LINE	break findStart; 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// int end = s.length() - 1; 	TokenNameCOMMENT_LINE	int end = s.length() - 1; 
// findEnd: for( ; end > start; end-- ) 	TokenNameCOMMENT_LINE	findEnd: for( ; end > start; end-- ) 
// { 	TokenNameCOMMENT_LINE	{ 
// switch (s.charAt(end)) 	TokenNameCOMMENT_LINE	switch (s.charAt(end)) 
// { 	TokenNameCOMMENT_LINE	{ 
// case '0': 	TokenNameCOMMENT_LINE	case '0': 
// break; 	TokenNameCOMMENT_LINE	break; 
// case '.': 	TokenNameCOMMENT_LINE	case '.': 
// decimalPos = end; 	TokenNameCOMMENT_LINE	decimalPos = end; 
// break; 	TokenNameCOMMENT_LINE	break; 
// default: 	TokenNameCOMMENT_LINE	default: 
// break findEnd; 	TokenNameCOMMENT_LINE	break findEnd; 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// int sigDig = end - start; 	TokenNameCOMMENT_LINE	int sigDig = end - start; 
// 	TokenNameCOMMENT_LINE	 
// // clarify decimal location if it has not yet been found 	TokenNameCOMMENT_LINE	// clarify decimal location if it has not yet been found 
// if (decimalPos == -1) 	TokenNameCOMMENT_LINE	if (decimalPos == -1) 
// decimalPos = s.indexOf('.'); 	TokenNameCOMMENT_LINE	decimalPos = s.indexOf('.'); 
// 	TokenNameCOMMENT_LINE	 
// // if decimal is not between start and end, add one to sigDig 	TokenNameCOMMENT_LINE	// if decimal is not between start and end, add one to sigDig 
// if (decimalPos < start || decimalPos > end) 	TokenNameCOMMENT_LINE	if (decimalPos < start || decimalPos > end) 
// ++sigDig; 	TokenNameCOMMENT_LINE	++sigDig; 
// 	TokenNameCOMMENT_LINE	 
// // reduce significant digits to PRECISION if necessary 	TokenNameCOMMENT_LINE	// reduce significant digits to PRECISION if necessary 
// if (sigDig > PRECISION) 	TokenNameCOMMENT_LINE	if (sigDig > PRECISION) 
// { 	TokenNameCOMMENT_LINE	{ 
// // re-scale BigDecimal in order to get significant digits = PRECISION 	TokenNameCOMMENT_LINE	// re-scale BigDecimal in order to get significant digits = PRECISION 
// BigDecimal num = new BigDecimal(s); 	TokenNameCOMMENT_LINE	BigDecimal num = new BigDecimal(s); 
// int newScale = num.scale() - (sigDig - PRECISION); 	TokenNameCOMMENT_LINE	int newScale = num.scale() - (sigDig - PRECISION); 
// if (newScale < 0) 	TokenNameCOMMENT_LINE	if (newScale < 0) 
// newScale = 0; 	TokenNameCOMMENT_LINE	newScale = 0; 
// s = num.setScale(newScale, BigDecimal.ROUND_HALF_UP).toString(); 	TokenNameCOMMENT_LINE	s = num.setScale(newScale, BigDecimal.ROUND_HALF_UP).toString(); 
// 	TokenNameCOMMENT_LINE	 
// // remove trailing '0's; keep track of decimalPos 	TokenNameCOMMENT_LINE	// remove trailing '0's; keep track of decimalPos 
// int truncatePoint = s.length(); 	TokenNameCOMMENT_LINE	int truncatePoint = s.length(); 
// while (s.charAt(--truncatePoint) == '0') 	TokenNameCOMMENT_LINE	while (s.charAt(--truncatePoint) == '0') 
// ; 	TokenNameCOMMENT_LINE	; 
// 	TokenNameCOMMENT_LINE	 
// if (s.charAt(truncatePoint) == '.') 	TokenNameCOMMENT_LINE	if (s.charAt(truncatePoint) == '.') 
// { 	TokenNameCOMMENT_LINE	{ 
// decimalPos = truncatePoint; 	TokenNameCOMMENT_LINE	decimalPos = truncatePoint; 
// } 	TokenNameCOMMENT_LINE	} 
// else 	TokenNameCOMMENT_LINE	else 
// { 	TokenNameCOMMENT_LINE	{ 
// decimalPos = s.indexOf('.'); 	TokenNameCOMMENT_LINE	decimalPos = s.indexOf('.'); 
// truncatePoint += 1; 	TokenNameCOMMENT_LINE	truncatePoint += 1; 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// s = s.substring(0, truncatePoint); 	TokenNameCOMMENT_LINE	s = s.substring(0, truncatePoint); 
// len = s.length(); 	TokenNameCOMMENT_LINE	len = s.length(); 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// // Account for exponent by adding zeros as needed 	TokenNameCOMMENT_LINE	// Account for exponent by adding zeros as needed 
// // and moving the decimal place 	TokenNameCOMMENT_LINE	// and moving the decimal place 
// 	TokenNameCOMMENT_LINE	 
// if (exp == 0) 	TokenNameCOMMENT_LINE	if (exp == 0) 
// return s; 	TokenNameCOMMENT_LINE	return s; 
// 	TokenNameCOMMENT_LINE	 
// start = 0; 	TokenNameCOMMENT_LINE	start = 0; 
// String sign; 	TokenNameCOMMENT_LINE	String sign; 
// if (s.charAt(0) == '-') 	TokenNameCOMMENT_LINE	if (s.charAt(0) == '-') 
// { 	TokenNameCOMMENT_LINE	{ 
// sign = "-"; 	TokenNameCOMMENT_LINE	sign = "-"; 
// start++; 	TokenNameCOMMENT_LINE	start++; 
// } 	TokenNameCOMMENT_LINE	} 
// else 	TokenNameCOMMENT_LINE	else 
// sign = ""; 	TokenNameCOMMENT_LINE	sign = ""; 
// 	TokenNameCOMMENT_LINE	 
// String wholePart = s.substring(start, decimalPos); 	TokenNameCOMMENT_LINE	String wholePart = s.substring(start, decimalPos); 
// String decimalPart = s.substring(decimalPos + 1); 	TokenNameCOMMENT_LINE	String decimalPart = s.substring(decimalPos + 1); 
// 	TokenNameCOMMENT_LINE	 
// // get the number of digits right of the decimal 	TokenNameCOMMENT_LINE	// get the number of digits right of the decimal 
// int decimalLen = decimalPart.length(); 	TokenNameCOMMENT_LINE	int decimalLen = decimalPart.length(); 
// 	TokenNameCOMMENT_LINE	 
// if (exp >= decimalLen) 	TokenNameCOMMENT_LINE	if (exp >= decimalLen) 
// return sign + wholePart + decimalPart + zeros(exp - decimalLen); 	TokenNameCOMMENT_LINE	return sign + wholePart + decimalPart + zeros(exp - decimalLen); 
// 	TokenNameCOMMENT_LINE	 
// if (exp > 0) 	TokenNameCOMMENT_LINE	if (exp > 0) 
// return sign + wholePart + decimalPart.substring(0, exp) + "." 	TokenNameCOMMENT_LINE	return sign + wholePart + decimalPart.substring(0, exp) + "." 
// + decimalPart.substring(exp); 	TokenNameCOMMENT_LINE	+ decimalPart.substring(exp); 
// 	TokenNameCOMMENT_LINE	 
// return sign + "0." + zeros(-1 - exp) + wholePart + decimalPart; 	TokenNameCOMMENT_LINE	return sign + "0." + zeros(-1 - exp) + wholePart + decimalPart; 
// } 	TokenNameCOMMENT_LINE	} 
/** * Cast result object to a string. * * @return "NaN" if the number is NaN, Infinity or -Infinity if * the number is infinite or the string value of the number. */	TokenNameCOMMENT_JAVADOC	 Cast result object to a string. * @return "NaN" if the number is NaN, Infinity or -Infinity if the number is infinite or the string value of the number. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
m_val	TokenNameIdentifier	 m val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"NaN"	TokenNameStringLiteral	NaN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isInfinite	TokenNameIdentifier	 is Infinite
(	TokenNameLPAREN	
m_val	TokenNameIdentifier	 m val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_val	TokenNameIdentifier	 m val
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
"Infinity"	TokenNameStringLiteral	Infinity
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
"-Infinity"	TokenNameStringLiteral	-Infinity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
m_val	TokenNameIdentifier	 m val
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-0"	TokenNameStringLiteral	-0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'E'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sign	TokenNameIdentifier	 sign
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
"-"	TokenNameStringLiteral	-
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
int	TokenNameint	
nDigits	TokenNameIdentifier	 n Digits
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
exp	TokenNameIdentifier	 exp
>=	TokenNameGREATER_EQUAL	
nDigits	TokenNameIdentifier	 n Digits
)	TokenNameRPAREN	
return	TokenNamereturn	
sign	TokenNameIdentifier	 sign
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
+	TokenNamePLUS	
zeros	TokenNameIdentifier	 zeros
(	TokenNameLPAREN	
exp	TokenNameIdentifier	 exp
-	TokenNameMINUS	
nDigits	TokenNameIdentifier	 n Digits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Eliminate trailing 0's - bugzilla 14241 	TokenNameCOMMENT_LINE	Eliminate trailing 0's - bugzilla 14241 
while	TokenNamewhile	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
exp	TokenNameIdentifier	 exp
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
sign	TokenNameIdentifier	 sign
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
exp	TokenNameIdentifier	 exp
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sign	TokenNameIdentifier	 sign
+	TokenNamePLUS	
"0."	TokenNameStringLiteral	0.
+	TokenNamePLUS	
zeros	TokenNameIdentifier	 zeros
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a string of '0' of the given length * * * @param n Length of the string to be returned * * @return a string of '0' with the given length */	TokenNameCOMMENT_JAVADOC	 Return a string of '0' of the given length * @param n Length of the string to be returned * @return a string of '0' with the given length 
static	TokenNamestatic	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
zeros	TokenNameIdentifier	 zeros
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
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
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a java object that's closest to the representation * that should be handed to an extension. * * @return The value of this XNumber as a Double object */	TokenNameCOMMENT_JAVADOC	 Return a java object that's closest to the representation that should be handed to an extension. * @return The value of this XNumber as a Double object 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_obj	TokenNameIdentifier	 m obj
)	TokenNameRPAREN	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
m_val	TokenNameIdentifier	 m val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_obj	TokenNameIdentifier	 m obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if two objects are functionally equal. * * @param obj2 Object to compare this to * * @return true if the two objects are equal * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if two objects are functionally equal. * @param obj2 Object to compare this to * @return true if the two objects are equal * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In order to handle the 'all' semantics of 	TokenNameCOMMENT_LINE	In order to handle the 'all' semantics of 
// nodeset comparisons, we always call the 	TokenNameCOMMENT_LINE	nodeset comparisons, we always call the 
// nodeset function. 	TokenNameCOMMENT_LINE	nodeset function. 
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
)	TokenNameRPAREN	
return	TokenNamereturn	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_BOOLEAN	TokenNameIdentifier	 CLASS  BOOLEAN
)	TokenNameRPAREN	
return	TokenNamereturn	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
m_val	TokenNameIdentifier	 m val
==	TokenNameEQUAL_EQUAL	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
visitNumberLiteral	TokenNameIdentifier	 visit Number Literal
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
