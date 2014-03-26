/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExsltMath.java 468639 2006-10-28 06:52:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExsltMath.java 468639 2006-10-28 06:52:33Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
lib	TokenNameIdentifier	 lib
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
NodeSet	TokenNameIdentifier	 Node Set
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
/** * This class contains EXSLT math extension functions. * It is accessed by specifying a namespace URI as follows: * <pre> * xmlns:math="http://exslt.org/math" * </pre> * * The documentation for each function has been copied from the relevant * EXSLT Implementer page. * * @see <a href="http://www.exslt.org/">EXSLT</a> * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 This class contains EXSLT math extension functions. It is accessed by specifying a namespace URI as follows: <pre> xmlns:math="http://exslt.org/math" </pre> * The documentation for each function has been copied from the relevant EXSLT Implementer page. * @see <a href="http://www.exslt.org/">EXSLT</a> @xsl.usage general 
public	TokenNamepublic	
class	TokenNameclass	
ExsltMath	TokenNameIdentifier	 Exslt Math
extends	TokenNameextends	
ExsltBase	TokenNameIdentifier	 Exslt Base
{	TokenNameLBRACE	
// Constants 	TokenNameCOMMENT_LINE	Constants 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PI	TokenNameIdentifier	 PI
=	TokenNameEQUAL	
"3.1415926535897932384626433832795028841971693993751"	TokenNameStringLiteral	3.1415926535897932384626433832795028841971693993751
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
E	TokenNameIdentifier	 E
=	TokenNameEQUAL	
"2.71828182845904523536028747135266249775724709369996"	TokenNameStringLiteral	2.71828182845904523536028747135266249775724709369996
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
SQRRT2	TokenNameIdentifier	 SQRR T2
=	TokenNameEQUAL	
"1.41421356237309504880168872420969807856967187537694"	TokenNameStringLiteral	1.41421356237309504880168872420969807856967187537694
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
LN2	TokenNameIdentifier	 L N2
=	TokenNameEQUAL	
"0.69314718055994530941723212145817656807550013436025"	TokenNameStringLiteral	0.69314718055994530941723212145817656807550013436025
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
LN10	TokenNameIdentifier	 L N10
=	TokenNameEQUAL	
"2.302585092994046"	TokenNameStringLiteral	2.302585092994046
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
LOG2E	TokenNameIdentifier	 LO G2 E
=	TokenNameEQUAL	
"1.4426950408889633"	TokenNameStringLiteral	1.4426950408889633
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
SQRT1_2	TokenNameIdentifier	 SQR T1 2
=	TokenNameEQUAL	
"0.7071067811865476"	TokenNameStringLiteral	0.7071067811865476
;	TokenNameSEMICOLON	
/** * The math:max function returns the maximum value of the nodes passed as the argument. * The maximum value is defined as follows. The node set passed as an argument is sorted * in descending order as it would be by xsl:sort with a data type of number. The maximum * is the result of converting the string value of the first node in this sorted list to * a number using the number function. * <p> * If the node set is empty, or if the result of converting the string values of any of the * nodes to a number is NaN, then NaN is returned. * * @param nl The NodeList for the node-set to be evaluated. * * @return the maximum value found, NaN if any node cannot be converted to a number. * * @see <a href="http://www.exslt.org/">EXSLT</a> */	TokenNameCOMMENT_JAVADOC	 The math:max function returns the maximum value of the nodes passed as the argument. The maximum value is defined as follows. The node set passed as an argument is sorted in descending order as it would be by xsl:sort with a data type of number. The maximum is the result of converting the string value of the first node in this sorted list to a number using the number function. <p> If the node set is empty, or if the result of converting the string values of any of the nodes to a number is NaN, then NaN is returned. * @param nl The NodeList for the node-set to be evaluated. * @return the maximum value found, NaN if any node cannot be converted to a number. * @see <a href="http://www.exslt.org/">EXSLT</a> 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nl	TokenNameIdentifier	 nl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nl	TokenNameIdentifier	 nl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
double	TokenNamedouble	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
-	TokenNameMINUS	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
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
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
toNumber	TokenNameIdentifier	 to Number
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
>	TokenNameGREATER	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The math:min function returns the minimum value of the nodes passed as the argument. * The minimum value is defined as follows. The node set passed as an argument is sorted * in ascending order as it would be by xsl:sort with a data type of number. The minimum * is the result of converting the string value of the first node in this sorted list to * a number using the number function. * <p> * If the node set is empty, or if the result of converting the string values of any of * the nodes to a number is NaN, then NaN is returned. * * @param nl The NodeList for the node-set to be evaluated. * * @return the minimum value found, NaN if any node cannot be converted to a number. * * @see <a href="http://www.exslt.org/">EXSLT</a> */	TokenNameCOMMENT_JAVADOC	 The math:min function returns the minimum value of the nodes passed as the argument. The minimum value is defined as follows. The node set passed as an argument is sorted in ascending order as it would be by xsl:sort with a data type of number. The minimum is the result of converting the string value of the first node in this sorted list to a number using the number function. <p> If the node set is empty, or if the result of converting the string values of any of the nodes to a number is NaN, then NaN is returned. * @param nl The NodeList for the node-set to be evaluated. * @return the minimum value found, NaN if any node cannot be converted to a number. * @see <a href="http://www.exslt.org/">EXSLT</a> 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nl	TokenNameIdentifier	 nl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nl	TokenNameIdentifier	 nl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
double	TokenNamedouble	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
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
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
toNumber	TokenNameIdentifier	 to Number
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
<	TokenNameLESS	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The math:highest function returns the nodes in the node set whose value is the maximum * value for the node set. The maximum value for the node set is the same as the value as * calculated by math:max. A node has this maximum value if the result of converting its * string value to a number as if by the number function is equal to the maximum value, * where the equality comparison is defined as a numerical comparison using the = operator. * <p> * If any of the nodes in the node set has a non-numeric value, the math:max function will * return NaN. The definition numeric comparisons entails that NaN != NaN. Therefore if any * of the nodes in the node set has a non-numeric value, math:highest will return an empty * node set. * * @param nl The NodeList for the node-set to be evaluated. * * @return node-set with nodes containing the maximum value found, an empty node-set * if any node cannot be converted to a number. */	TokenNameCOMMENT_JAVADOC	 The math:highest function returns the nodes in the node set whose value is the maximum value for the node set. The maximum value for the node set is the same as the value as calculated by math:max. A node has this maximum value if the result of converting its string value to a number as if by the number function is equal to the maximum value, where the equality comparison is defined as a numerical comparison using the = operator. <p> If any of the nodes in the node set has a non-numeric value, the math:max function will return NaN. The definition numeric comparisons entails that NaN != NaN. Therefore if any of the nodes in the node set has a non-numeric value, math:highest will return an empty node set. * @param nl The NodeList for the node-set to be evaluated. * @return node-set with nodes containing the maximum value found, an empty node-set if any node cannot be converted to a number. 
public	TokenNamepublic	
static	TokenNamestatic	
NodeList	TokenNameIdentifier	 Node List
highest	TokenNameIdentifier	 highest
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nl	TokenNameIdentifier	 nl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
maxValue	TokenNameIdentifier	 max Value
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
nl	TokenNameIdentifier	 nl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeSet	TokenNameIdentifier	 Node Set
highNodes	TokenNameIdentifier	 high Nodes
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
highNodes	TokenNameIdentifier	 high Nodes
.	TokenNameDOT	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
maxValue	TokenNameIdentifier	 max Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
highNodes	TokenNameIdentifier	 high Nodes
;	TokenNameSEMICOLON	
// empty Nodeset 	TokenNameCOMMENT_LINE	empty Nodeset 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
toNumber	TokenNameIdentifier	 to Number
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
maxValue	TokenNameIdentifier	 max Value
)	TokenNameRPAREN	
highNodes	TokenNameIdentifier	 high Nodes
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
highNodes	TokenNameIdentifier	 high Nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The math:lowest function returns the nodes in the node set whose value is the minimum value * for the node set. The minimum value for the node set is the same as the value as calculated * by math:min. A node has this minimum value if the result of converting its string value to * a number as if by the number function is equal to the minimum value, where the equality * comparison is defined as a numerical comparison using the = operator. * <p> * If any of the nodes in the node set has a non-numeric value, the math:min function will return * NaN. The definition numeric comparisons entails that NaN != NaN. Therefore if any of the nodes * in the node set has a non-numeric value, math:lowest will return an empty node set. * * @param nl The NodeList for the node-set to be evaluated. * * @return node-set with nodes containing the minimum value found, an empty node-set * if any node cannot be converted to a number. * */	TokenNameCOMMENT_JAVADOC	 The math:lowest function returns the nodes in the node set whose value is the minimum value for the node set. The minimum value for the node set is the same as the value as calculated by math:min. A node has this minimum value if the result of converting its string value to a number as if by the number function is equal to the minimum value, where the equality comparison is defined as a numerical comparison using the = operator. <p> If any of the nodes in the node set has a non-numeric value, the math:min function will return NaN. The definition numeric comparisons entails that NaN != NaN. Therefore if any of the nodes in the node set has a non-numeric value, math:lowest will return an empty node set. * @param nl The NodeList for the node-set to be evaluated. * @return node-set with nodes containing the minimum value found, an empty node-set if any node cannot be converted to a number. 
public	TokenNamepublic	
static	TokenNamestatic	
NodeList	TokenNameIdentifier	 Node List
lowest	TokenNameIdentifier	 lowest
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nl	TokenNameIdentifier	 nl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
minValue	TokenNameIdentifier	 min Value
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
nl	TokenNameIdentifier	 nl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeSet	TokenNameIdentifier	 Node Set
lowNodes	TokenNameIdentifier	 low Nodes
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lowNodes	TokenNameIdentifier	 low Nodes
.	TokenNameDOT	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
minValue	TokenNameIdentifier	 min Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
lowNodes	TokenNameIdentifier	 low Nodes
;	TokenNameSEMICOLON	
// empty Nodeset 	TokenNameCOMMENT_LINE	empty Nodeset 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
toNumber	TokenNameIdentifier	 to Number
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
minValue	TokenNameIdentifier	 min Value
)	TokenNameRPAREN	
lowNodes	TokenNameIdentifier	 low Nodes
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
lowNodes	TokenNameIdentifier	 low Nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The math:abs function returns the absolute value of a number. * * @param num A number * @return The absolute value of the number */	TokenNameCOMMENT_JAVADOC	 The math:abs function returns the absolute value of a number. * @param num A number @return The absolute value of the number 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The math:acos function returns the arccosine value of a number. * * @param num A number * @return The arccosine value of the number */	TokenNameCOMMENT_JAVADOC	 The math:acos function returns the arccosine value of a number. * @param num A number @return The arccosine value of the number 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
acos	TokenNameIdentifier	 acos
(	TokenNameLPAREN	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
acos	TokenNameIdentifier	 acos
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The math:asin function returns the arcsine value of a number. * * @param num A number * @return The arcsine value of the number */	TokenNameCOMMENT_JAVADOC	 The math:asin function returns the arcsine value of a number. * @param num A number @return The arcsine value of the number 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
asin	TokenNameIdentifier	 asin
(	TokenNameLPAREN	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
asin	TokenNameIdentifier	 asin
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The math:atan function returns the arctangent value of a number. * * @param num A number * @return The arctangent value of the number */	TokenNameCOMMENT_JAVADOC	 The math:atan function returns the arctangent value of a number. * @param num A number @return The arctangent value of the number 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
atan	TokenNameIdentifier	 atan
(	TokenNameLPAREN	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
atan	TokenNameIdentifier	 atan
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The math:atan2 function returns the angle ( in radians ) from the X axis to a point (y,x). * * @param num1 The X axis value * @param num2 The Y axis value * @return The angle (in radians) from the X axis to a point (y,x) */	TokenNameCOMMENT_JAVADOC	 The math:atan2 function returns the angle ( in radians ) from the X axis to a point (y,x). * @param num1 The X axis value @param num2 The Y axis value @return The angle (in radians) from the X axis to a point (y,x) 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
atan2	TokenNameIdentifier	 atan2
(	TokenNameLPAREN	
double	TokenNamedouble	
num1	TokenNameIdentifier	 num1
,	TokenNameCOMMA	
double	TokenNamedouble	
num2	TokenNameIdentifier	 num2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
atan2	TokenNameIdentifier	 atan2
(	TokenNameLPAREN	
num1	TokenNameIdentifier	 num1
,	TokenNameCOMMA	
num2	TokenNameIdentifier	 num2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The math:cos function returns cosine of the passed argument. * * @param num A number * @return The cosine value of the number */	TokenNameCOMMENT_JAVADOC	 The math:cos function returns cosine of the passed argument. * @param num A number @return The cosine value of the number 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The math:exp function returns e (the base of natural logarithms) raised to a power. * * @param num A number * @return The value of e raised to the given power */	TokenNameCOMMENT_JAVADOC	 The math:exp function returns e (the base of natural logarithms) raised to a power. * @param num A number @return The value of e raised to the given power 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The math:log function returns the natural logarithm of a number. * * @param num A number * @return The natural logarithm of the number */	TokenNameCOMMENT_JAVADOC	 The math:log function returns the natural logarithm of a number. * @param num A number @return The natural logarithm of the number 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The math:power function returns the value of a base expression taken to a specified power. * * @param num1 The base * @param num2 The power * @return The value of the base expression taken to the specified power */	TokenNameCOMMENT_JAVADOC	 The math:power function returns the value of a base expression taken to a specified power. * @param num1 The base @param num2 The power @return The value of the base expression taken to the specified power 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
power	TokenNameIdentifier	 power
(	TokenNameLPAREN	
double	TokenNamedouble	
num1	TokenNameIdentifier	 num1
,	TokenNameCOMMA	
double	TokenNamedouble	
num2	TokenNameIdentifier	 num2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
num1	TokenNameIdentifier	 num1
,	TokenNameCOMMA	
num2	TokenNameIdentifier	 num2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The math:random function returns a random number from 0 to 1. * * @return A random double from 0 to 1 */	TokenNameCOMMENT_JAVADOC	 The math:random function returns a random number from 0 to 1. * @return A random double from 0 to 1 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
random	TokenNameIdentifier	 random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
random	TokenNameIdentifier	 random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The math:sin function returns the sine of the number. * * @param num A number * @return The sine value of the number */	TokenNameCOMMENT_JAVADOC	 The math:sin function returns the sine of the number. * @param num A number @return The sine value of the number 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The math:sqrt function returns the square root of a number. * * @param num A number * @return The square root of the number */	TokenNameCOMMENT_JAVADOC	 The math:sqrt function returns the square root of a number. * @param num A number @return The square root of the number 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The math:tan function returns the tangent of the number passed as an argument. * * @param num A number * @return The tangent value of the number */	TokenNameCOMMENT_JAVADOC	 The math:tan function returns the tangent of the number passed as an argument. * @param num A number @return The tangent value of the number 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
tan	TokenNameIdentifier	 tan
(	TokenNameLPAREN	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
tan	TokenNameIdentifier	 tan
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The math:constant function returns the specified constant to a set precision. * The possible constants are: * <pre> * PI * E * SQRRT2 * LN2 * LN10 * LOG2E * SQRT1_2 * </pre> * @param name The name of the constant * @param precision The precision * @return The value of the specified constant to the given precision */	TokenNameCOMMENT_JAVADOC	 The math:constant function returns the specified constant to a set precision. The possible constants are: <pre> PI E SQRRT2 LN2 LN10 LOG2E SQRT1_2 </pre> @param name The name of the constant @param precision The precision @return The value of the specified constant to the given precision 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
constant	TokenNameIdentifier	 constant
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
double	TokenNamedouble	
precision	TokenNameIdentifier	 precision
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"PI"	TokenNameStringLiteral	PI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
PI	TokenNameIdentifier	 PI
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"E"	TokenNameStringLiteral	E
)	TokenNameRPAREN	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
E	TokenNameIdentifier	 E
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"SQRRT2"	TokenNameStringLiteral	SQRRT2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
SQRRT2	TokenNameIdentifier	 SQRR T2
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"LN2"	TokenNameStringLiteral	LN2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
LN2	TokenNameIdentifier	 L N2
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"LN10"	TokenNameStringLiteral	LN10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
LN10	TokenNameIdentifier	 L N10
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"LOG2E"	TokenNameStringLiteral	LOG2E
)	TokenNameRPAREN	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
LOG2E	TokenNameIdentifier	 LO G2 E
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"SQRT1_2"	TokenNameStringLiteral	SQRT1_2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
SQRT1_2	TokenNameIdentifier	 SQR T1 2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
precision	TokenNameIdentifier	 precision
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
<=	TokenNameLESS_EQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
