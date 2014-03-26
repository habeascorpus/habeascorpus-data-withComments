/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
/** * Utility class to contain version numbers in "Dewey Decimal" * syntax. Numbers in the "Dewey Decimal" syntax consist of positive * decimal integers separated by periods ".". For example, "2.0" or * "1.2.3.4.5.6.7". This allows an extensible number to be used to * represent major, minor, micro, etc versions. The version number * must begin with a number. * */	TokenNameCOMMENT_JAVADOC	 Utility class to contain version numbers in "Dewey Decimal" syntax. Numbers in the "Dewey Decimal" syntax consist of positive decimal integers separated by periods ".". For example, "2.0" or "1.2.3.4.5.6.7". This allows an extensible number to be used to represent major, minor, micro, etc versions. The version number must begin with a number. 
public	TokenNamepublic	
class	TokenNameclass	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
{	TokenNameLBRACE	
/** Array of components that make up DeweyDecimal */	TokenNameCOMMENT_JAVADOC	 Array of components that make up DeweyDecimal 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
components	TokenNameIdentifier	 components
;	TokenNameSEMICOLON	
/** * Construct a DeweyDecimal from an array of integer components. * * @param components an array of integer components. */	TokenNameCOMMENT_JAVADOC	 Construct a DeweyDecimal from an array of integer components. * @param components an array of integer components. 
public	TokenNamepublic	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
components	TokenNameIdentifier	 components
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
components	TokenNameIdentifier	 components
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
components	TokenNameIdentifier	 components
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
components	TokenNameIdentifier	 components
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a DeweyDecimal from string in DeweyDecimal format. * * @param string the string in dewey decimal format * @exception NumberFormatException if string is malformed */	TokenNameCOMMENT_JAVADOC	 Construct a DeweyDecimal from string in DeweyDecimal format. * @param string the string in dewey decimal format @exception NumberFormatException if string is malformed 
public	TokenNamepublic	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
countTokens	TokenNameIdentifier	 count Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
components	TokenNameIdentifier	 components
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
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
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
component	TokenNameIdentifier	 component
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
"Empty component in string"	TokenNameStringLiteral	Empty component in string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
components	TokenNameIdentifier	 components
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Strip '.' token 	TokenNameCOMMENT_LINE	Strip '.' token 
if	TokenNameif	
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//If it ended in a dot, throw an exception 	TokenNameCOMMENT_LINE	If it ended in a dot, throw an exception 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
"DeweyDecimal ended in a '.'"	TokenNameStringLiteral	DeweyDecimal ended in a '.'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return number of components in <code>DeweyDecimal</code>. * * @return the number of components in dewey decimal */	TokenNameCOMMENT_JAVADOC	 Return number of components in <code>DeweyDecimal</code>. * @return the number of components in dewey decimal 
public	TokenNamepublic	
int	TokenNameint	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the component at specified index. * * @param index the index of components * @return the value of component at index */	TokenNameCOMMENT_JAVADOC	 Return the component at specified index. * @param index the index of components @return the value of component at index 
public	TokenNamepublic	
int	TokenNameint	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
components	TokenNameIdentifier	 components
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return <code>true</code> if this <code>DeweyDecimal</code> is * equal to the other <code>DeweyDecimal</code>. * * @param other the other DeweyDecimal * @return true if equal to other DeweyDecimal, false otherwise */	TokenNameCOMMENT_JAVADOC	 Return <code>true</code> if this <code>DeweyDecimal</code> is equal to the other <code>DeweyDecimal</code>. * @param other the other DeweyDecimal @return true if equal to other DeweyDecimal, false otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEqual	TokenNameIdentifier	 is Equal
(	TokenNameLPAREN	
final	TokenNamefinal	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
component1	TokenNameIdentifier	 component1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
?	TokenNameQUESTION	
components	TokenNameIdentifier	 components
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
component2	TokenNameIdentifier	 component2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
?	TokenNameQUESTION	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
components	TokenNameIdentifier	 components
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
component2	TokenNameIdentifier	 component2
!=	TokenNameNOT_EQUAL	
component1	TokenNameIdentifier	 component1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Exact match 	TokenNameCOMMENT_LINE	Exact match 
}	TokenNameRBRACE	
/** * Return <code>true</code> if this <code>DeweyDecimal</code> is * less than the other <code>DeweyDecimal</code>. * * @param other the other DeweyDecimal * @return true if less than other DeweyDecimal, false otherwise */	TokenNameCOMMENT_JAVADOC	 Return <code>true</code> if this <code>DeweyDecimal</code> is less than the other <code>DeweyDecimal</code>. * @param other the other DeweyDecimal @return true if less than other DeweyDecimal, false otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
isLessThan	TokenNameIdentifier	 is Less Than
(	TokenNameLPAREN	
final	TokenNamefinal	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
isGreaterThanOrEqual	TokenNameIdentifier	 is Greater Than Or Equal
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return <code>true</code> if this <code>DeweyDecimal</code> is * less than or equal to the other <code>DeweyDecimal</code>. * * @param other the other DeweyDecimal * @return true if less than or equal to other DeweyDecimal, false otherwise */	TokenNameCOMMENT_JAVADOC	 Return <code>true</code> if this <code>DeweyDecimal</code> is less than or equal to the other <code>DeweyDecimal</code>. * @param other the other DeweyDecimal @return true if less than or equal to other DeweyDecimal, false otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
isLessThanOrEqual	TokenNameIdentifier	 is Less Than Or Equal
(	TokenNameLPAREN	
final	TokenNamefinal	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
isGreaterThan	TokenNameIdentifier	 is Greater Than
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return <code>true</code> if this <code>DeweyDecimal</code> is * greater than the other <code>DeweyDecimal</code>. * * @param other the other DeweyDecimal * @return true if greater than other DeweyDecimal, false otherwise */	TokenNameCOMMENT_JAVADOC	 Return <code>true</code> if this <code>DeweyDecimal</code> is greater than the other <code>DeweyDecimal</code>. * @param other the other DeweyDecimal @return true if greater than other DeweyDecimal, false otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
isGreaterThan	TokenNameIdentifier	 is Greater Than
(	TokenNameLPAREN	
final	TokenNamefinal	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
component1	TokenNameIdentifier	 component1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
?	TokenNameQUESTION	
components	TokenNameIdentifier	 components
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
component2	TokenNameIdentifier	 component2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
?	TokenNameQUESTION	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
components	TokenNameIdentifier	 components
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
component2	TokenNameIdentifier	 component2
>	TokenNameGREATER	
component1	TokenNameIdentifier	 component1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
component2	TokenNameIdentifier	 component2
<	TokenNameLESS	
component1	TokenNameIdentifier	 component1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Exact match 	TokenNameCOMMENT_LINE	Exact match 
}	TokenNameRBRACE	
/** * Return <code>true</code> if this <code>DeweyDecimal</code> is * greater than or equal to the other <code>DeweyDecimal</code>. * * @param other the other DeweyDecimal * @return true if greater than or equal to other DeweyDecimal, false otherwise */	TokenNameCOMMENT_JAVADOC	 Return <code>true</code> if this <code>DeweyDecimal</code> is greater than or equal to the other <code>DeweyDecimal</code>. * @param other the other DeweyDecimal @return true if greater than or equal to other DeweyDecimal, false otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
isGreaterThanOrEqual	TokenNameIdentifier	 is Greater Than Or Equal
(	TokenNameLPAREN	
final	TokenNamefinal	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
component1	TokenNameIdentifier	 component1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
?	TokenNameQUESTION	
components	TokenNameIdentifier	 components
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
component2	TokenNameIdentifier	 component2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
?	TokenNameQUESTION	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
components	TokenNameIdentifier	 components
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
component2	TokenNameIdentifier	 component2
>	TokenNameGREATER	
component1	TokenNameIdentifier	 component1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
component2	TokenNameIdentifier	 component2
<	TokenNameLESS	
component1	TokenNameIdentifier	 component1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Exact match 	TokenNameCOMMENT_LINE	Exact match 
}	TokenNameRBRACE	
/** * Return string representation of <code>DeweyDecimal</code>. * * @return the string representation of DeweyDecimal. */	TokenNameCOMMENT_JAVADOC	 Return string representation of <code>DeweyDecimal</code>. * @return the string representation of DeweyDecimal. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
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
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
components	TokenNameIdentifier	 components
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
