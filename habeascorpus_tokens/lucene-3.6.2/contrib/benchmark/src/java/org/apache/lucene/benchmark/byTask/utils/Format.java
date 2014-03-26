package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
NumberFormat	TokenNameIdentifier	 Number Format
;	TokenNameSEMICOLON	
/** * Formatting utilities (for reports). */	TokenNameCOMMENT_JAVADOC	 Formatting utilities (for reports). 
public	TokenNamepublic	
class	TokenNameclass	
Format	TokenNameIdentifier	 Format
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
NumberFormat	TokenNameIdentifier	 Number Format
numFormat	TokenNameIdentifier	 num Format
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
NumberFormat	TokenNameIdentifier	 Number Format
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
NumberFormat	TokenNameIdentifier	 Number Format
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
NumberFormat	TokenNameIdentifier	 Number Format
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
padd	TokenNameIdentifier	 padd
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
numFormat	TokenNameIdentifier	 num Format
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
setMaximumFractionDigits	TokenNameIdentifier	 set Maximum Fraction Digits
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numFormat	TokenNameIdentifier	 num Format
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
setMinimumFractionDigits	TokenNameIdentifier	 set Minimum Fraction Digits
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numFormat	TokenNameIdentifier	 num Format
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
setMaximumFractionDigits	TokenNameIdentifier	 set Maximum Fraction Digits
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numFormat	TokenNameIdentifier	 num Format
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
setMinimumFractionDigits	TokenNameIdentifier	 set Minimum Fraction Digits
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numFormat	TokenNameIdentifier	 num Format
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
setMaximumFractionDigits	TokenNameIdentifier	 set Maximum Fraction Digits
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numFormat	TokenNameIdentifier	 num Format
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
setMinimumFractionDigits	TokenNameIdentifier	 set Minimum Fraction Digits
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Padd a number from left. * @param numFracDigits number of digits in fraction part - must be 0 or 1 or 2. * @param f number to be formatted. * @param col column name (used for deciding on length). * @return formatted string. */	TokenNameCOMMENT_JAVADOC	 Padd a number from left. @param numFracDigits number of digits in fraction part - must be 0 or 1 or 2. @param f number to be formatted. @param col column name (used for deciding on length). @return formatted string. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
int	TokenNameint	
numFracDigits	TokenNameIdentifier	 num Frac Digits
,	TokenNameCOMMA	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
padd	TokenNameIdentifier	 padd
+	TokenNamePLUS	
numFormat	TokenNameIdentifier	 num Format
[	TokenNameLBRACKET	
numFracDigits	TokenNameIdentifier	 num Frac Digits
]	TokenNameRBRACKET	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
col	TokenNameIdentifier	 col
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
int	TokenNameint	
numFracDigits	TokenNameIdentifier	 num Frac Digits
,	TokenNameCOMMA	
double	TokenNamedouble	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
padd	TokenNameIdentifier	 padd
+	TokenNamePLUS	
numFormat	TokenNameIdentifier	 num Format
[	TokenNameLBRACKET	
numFracDigits	TokenNameIdentifier	 num Frac Digits
]	TokenNameRBRACKET	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
col	TokenNameIdentifier	 col
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pad a number from right. * @param numFracDigits number of digits in fraction part - must be 0 or 1 or 2. * @param f number to be formatted. * @param col column name (used for deciding on length). * @return formatted string. */	TokenNameCOMMENT_JAVADOC	 Pad a number from right. @param numFracDigits number of digits in fraction part - must be 0 or 1 or 2. @param f number to be formatted. @param col column name (used for deciding on length). @return formatted string. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
formatPaddRight	TokenNameIdentifier	 format Padd Right
(	TokenNameLPAREN	
int	TokenNameint	
numFracDigits	TokenNameIdentifier	 num Frac Digits
,	TokenNameCOMMA	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
numFormat	TokenNameIdentifier	 num Format
[	TokenNameLBRACKET	
numFracDigits	TokenNameIdentifier	 num Frac Digits
]	TokenNameRBRACKET	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
+	TokenNamePLUS	
padd	TokenNameIdentifier	 padd
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
col	TokenNameIdentifier	 col
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
formatPaddRight	TokenNameIdentifier	 format Padd Right
(	TokenNameLPAREN	
int	TokenNameint	
numFracDigits	TokenNameIdentifier	 num Frac Digits
,	TokenNameCOMMA	
double	TokenNamedouble	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
numFormat	TokenNameIdentifier	 num Format
[	TokenNameLBRACKET	
numFracDigits	TokenNameIdentifier	 num Frac Digits
]	TokenNameRBRACKET	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
+	TokenNamePLUS	
padd	TokenNameIdentifier	 padd
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
col	TokenNameIdentifier	 col
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pad a number from left. * @param n number to be formatted. * @param col column name (used for deciding on length). * @return formatted string. */	TokenNameCOMMENT_JAVADOC	 Pad a number from left. @param n number to be formatted. @param col column name (used for deciding on length). @return formatted string. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
padd	TokenNameIdentifier	 padd
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
col	TokenNameIdentifier	 col
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pad a string from right. * @param s string to be formatted. * @param col column name (used for deciding on length). * @return formatted string. */	TokenNameCOMMENT_JAVADOC	 Pad a string from right. @param s string to be formatted. @param col column name (used for deciding on length). @return formatted string. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
padd	TokenNameIdentifier	 padd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
col	TokenNameIdentifier	 col
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pad a string from left. * @param s string to be formatted. * @param col column name (used for deciding on length). * @return formatted string. */	TokenNameCOMMENT_JAVADOC	 Pad a string from left. @param s string to be formatted. @param col column name (used for deciding on length). @return formatted string. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
formatPaddLeft	TokenNameIdentifier	 format Padd Left
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
padd	TokenNameIdentifier	 padd
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
col	TokenNameIdentifier	 col
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
