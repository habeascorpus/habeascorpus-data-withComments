/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
ValidationContext	TokenNameIdentifier	 Validation Context
;	TokenNameSEMICOLON	
/** * Validator for <precisionDecimal> datatype (W3C Schema 1.1) * * @xerces.experimental * * @author Ankit Pasricha, IBM * * @version $Id: PrecisionDecimalDV.java 446745 2006-09-15 21:43:58Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Validator for <precisionDecimal> datatype (W3C Schema 1.1) * @xerces.experimental * @author Ankit Pasricha, IBM * @version $Id: PrecisionDecimalDV.java 446745 2006-09-15 21:43:58Z mrglavas $ 
class	TokenNameclass	
PrecisionDecimalDV	TokenNameIdentifier	 Precision Decimal DV
extends	TokenNameextends	
TypeValidator	TokenNameIdentifier	 Type Validator
{	TokenNameLBRACE	
static	TokenNamestatic	
class	TokenNameclass	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
{	TokenNameLBRACE	
// sign: 0 for absent; 1 for positive values; -1 for negative values (except in case of INF, -INF) 	TokenNameCOMMENT_LINE	sign: 0 for absent; 1 for positive values; -1 for negative values (except in case of INF, -INF) 
int	TokenNameint	
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// total digits. >= 1 	TokenNameCOMMENT_LINE	total digits. >= 1 
int	TokenNameint	
totalDigits	TokenNameIdentifier	 total Digits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// integer digits when sign != 0 	TokenNameCOMMENT_LINE	integer digits when sign != 0 
int	TokenNameint	
intDigits	TokenNameIdentifier	 int Digits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// fraction digits when sign != 0 	TokenNameCOMMENT_LINE	fraction digits when sign != 0 
int	TokenNameint	
fracDigits	TokenNameIdentifier	 frac Digits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//precision 	TokenNameCOMMENT_LINE	precision 
//int precision = 0; 	TokenNameCOMMENT_LINE	int precision = 0; 
// the string representing the integer part 	TokenNameCOMMENT_LINE	the string representing the integer part 
String	TokenNameIdentifier	 String
ivalue	TokenNameIdentifier	 ivalue
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// the string representing the fraction part 	TokenNameCOMMENT_LINE	the string representing the fraction part 
String	TokenNameIdentifier	 String
fvalue	TokenNameIdentifier	 fvalue
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
int	TokenNameint	
pvalue	TokenNameIdentifier	 pvalue
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"NaN"	TokenNameStringLiteral	NaN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ivalue	TokenNameIdentifier	 ivalue
=	TokenNameEQUAL	
content	TokenNameIdentifier	 content
;	TokenNameSEMICOLON	
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"+INF"	TokenNameStringLiteral	+INF
)	TokenNameRPAREN	
||	TokenNameOR_OR	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"INF"	TokenNameStringLiteral	INF
)	TokenNameRPAREN	
||	TokenNameOR_OR	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-INF"	TokenNameStringLiteral	-INF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ivalue	TokenNameIdentifier	 ivalue
=	TokenNameEQUAL	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'+'	TokenNameCharacterLiteral	
?	TokenNameQUESTION	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
content	TokenNameIdentifier	 content
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
initD	TokenNameIdentifier	 init D
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
initD	TokenNameIdentifier	 init D
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// these 4 variables are used to indicate where the integre/fraction 	TokenNameCOMMENT_LINE	these 4 variables are used to indicate where the integre/fraction 
// parts start/end. 	TokenNameCOMMENT_LINE	parts start/end. 
int	TokenNameint	
intStart	TokenNameIdentifier	 int Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
intEnd	TokenNameIdentifier	 int End
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fracStart	TokenNameIdentifier	 frac Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fracEnd	TokenNameIdentifier	 frac End
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Deal with leading sign symbol if present 	TokenNameCOMMENT_LINE	Deal with leading sign symbol if present 
if	TokenNameif	
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'+'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// skip '+', so intStart should be 1 	TokenNameCOMMENT_LINE	skip '+', so intStart should be 1 
intStart	TokenNameIdentifier	 int Start
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
intStart	TokenNameIdentifier	 int Start
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skip leading zeroes in integer part 	TokenNameCOMMENT_LINE	skip leading zeroes in integer part 
int	TokenNameint	
actualIntStart	TokenNameIdentifier	 actual Int Start
=	TokenNameEQUAL	
intStart	TokenNameIdentifier	 int Start
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
actualIntStart	TokenNameIdentifier	 actual Int Start
<	TokenNameLESS	
len	TokenNameIdentifier	 len
&&	TokenNameAND_AND	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
actualIntStart	TokenNameIdentifier	 actual Int Start
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
actualIntStart	TokenNameIdentifier	 actual Int Start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Find the ending position of the integer part 	TokenNameCOMMENT_LINE	Find the ending position of the integer part 
for	TokenNamefor	
(	TokenNameLPAREN	
intEnd	TokenNameIdentifier	 int End
=	TokenNameEQUAL	
actualIntStart	TokenNameIdentifier	 actual Int Start
;	TokenNameSEMICOLON	
intEnd	TokenNameIdentifier	 int End
<	TokenNameLESS	
len	TokenNameIdentifier	 len
&&	TokenNameAND_AND	
TypeValidator	TokenNameIdentifier	 Type Validator
.	TokenNameDOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
intEnd	TokenNameIdentifier	 int End
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intEnd	TokenNameIdentifier	 int End
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Not reached the end yet 	TokenNameCOMMENT_LINE	Not reached the end yet 
if	TokenNameif	
(	TokenNameLPAREN	
intEnd	TokenNameIdentifier	 int End
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the remaining part is not ".DDD" or "EDDD" or "eDDD", error 	TokenNameCOMMENT_LINE	the remaining part is not ".DDD" or "EDDD" or "eDDD", error 
if	TokenNameif	
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
intEnd	TokenNameIdentifier	 int End
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'.'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
intEnd	TokenNameIdentifier	 int End
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'E'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
intEnd	TokenNameIdentifier	 int End
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
intEnd	TokenNameIdentifier	 int End
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// fraction part starts after '.', and ends at the end of the input 	TokenNameCOMMENT_LINE	fraction part starts after '.', and ends at the end of the input 
fracStart	TokenNameIdentifier	 frac Start
=	TokenNameEQUAL	
intEnd	TokenNameIdentifier	 int End
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// find location of E or e (if present) 	TokenNameCOMMENT_LINE	find location of E or e (if present) 
// Find the ending position of the fracion part 	TokenNameCOMMENT_LINE	Find the ending position of the fracion part 
for	TokenNamefor	
(	TokenNameLPAREN	
fracEnd	TokenNameIdentifier	 frac End
=	TokenNameEQUAL	
fracStart	TokenNameIdentifier	 frac Start
;	TokenNameSEMICOLON	
fracEnd	TokenNameIdentifier	 frac End
<	TokenNameLESS	
len	TokenNameIdentifier	 len
&&	TokenNameAND_AND	
TypeValidator	TokenNameIdentifier	 Type Validator
.	TokenNameDOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
fracEnd	TokenNameIdentifier	 frac End
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fracEnd	TokenNameIdentifier	 frac End
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pvalue	TokenNameIdentifier	 pvalue
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
intEnd	TokenNameIdentifier	 int End
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// no integer part, no fraction part, error. 	TokenNameCOMMENT_LINE	no integer part, no fraction part, error. 
if	TokenNameif	
(	TokenNameLPAREN	
intStart	TokenNameIdentifier	 int Start
==	TokenNameEQUAL_EQUAL	
intEnd	TokenNameIdentifier	 int End
&&	TokenNameAND_AND	
fracStart	TokenNameIdentifier	 frac Start
==	TokenNameEQUAL_EQUAL	
fracEnd	TokenNameIdentifier	 frac End
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ignore trailing zeroes in fraction part 	TokenNameCOMMENT_LINE	ignore trailing zeroes in fraction part 
/*while (fracEnd > fracStart && content.charAt(fracEnd-1) == '0') { fracEnd--; }*/	TokenNameCOMMENT_BLOCK	while (fracEnd > fracStart && content.charAt(fracEnd-1) == '0') { fracEnd--; }
// check whether there is non-digit characters in the fraction part 	TokenNameCOMMENT_LINE	check whether there is non-digit characters in the fraction part 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
fracPos	TokenNameIdentifier	 frac Pos
=	TokenNameEQUAL	
fracStart	TokenNameIdentifier	 frac Start
;	TokenNameSEMICOLON	
fracPos	TokenNameIdentifier	 frac Pos
<	TokenNameLESS	
fracEnd	TokenNameIdentifier	 frac End
;	TokenNameSEMICOLON	
fracPos	TokenNameIdentifier	 frac Pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
TypeValidator	TokenNameIdentifier	 Type Validator
.	TokenNameDOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
fracPos	TokenNameIdentifier	 frac Pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
intDigits	TokenNameIdentifier	 int Digits
=	TokenNameEQUAL	
intEnd	TokenNameIdentifier	 int End
-	TokenNameMINUS	
actualIntStart	TokenNameIdentifier	 actual Int Start
;	TokenNameSEMICOLON	
fracDigits	TokenNameIdentifier	 frac Digits
=	TokenNameEQUAL	
fracEnd	TokenNameIdentifier	 frac End
-	TokenNameMINUS	
fracStart	TokenNameIdentifier	 frac Start
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
intDigits	TokenNameIdentifier	 int Digits
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ivalue	TokenNameIdentifier	 ivalue
=	TokenNameEQUAL	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
actualIntStart	TokenNameIdentifier	 actual Int Start
,	TokenNameCOMMA	
intEnd	TokenNameIdentifier	 int End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fracDigits	TokenNameIdentifier	 frac Digits
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fvalue	TokenNameIdentifier	 fvalue
=	TokenNameEQUAL	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
fracStart	TokenNameIdentifier	 frac Start
,	TokenNameCOMMA	
fracEnd	TokenNameIdentifier	 frac End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fracEnd	TokenNameIdentifier	 frac End
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pvalue	TokenNameIdentifier	 pvalue
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
fracEnd	TokenNameIdentifier	 frac End
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
totalDigits	TokenNameIdentifier	 total Digits
=	TokenNameEQUAL	
intDigits	TokenNameIdentifier	 int Digits
+	TokenNamePLUS	
fracDigits	TokenNameIdentifier	 frac Digits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
instanceof	TokenNameinstanceof	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
oval	TokenNameIdentifier	 oval
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
oval	TokenNameIdentifier	 oval
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
EQUAL	TokenNameIdentifier	 EQUAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return */	TokenNameCOMMENT_JAVADOC	 @return 
private	TokenNameprivate	
int	TokenNameint	
compareFractionalPart	TokenNameIdentifier	 compare Fractional Part
(	TokenNameLPAREN	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
oval	TokenNameIdentifier	 oval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fvalue	TokenNameIdentifier	 fvalue
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
oval	TokenNameIdentifier	 oval
.	TokenNameDOT	
fvalue	TokenNameIdentifier	 fvalue
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
EQUAL	TokenNameIdentifier	 EQUAL
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
temp1	TokenNameIdentifier	 temp1
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
fvalue	TokenNameIdentifier	 fvalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
temp2	TokenNameIdentifier	 temp2
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
oval	TokenNameIdentifier	 oval
.	TokenNameDOT	
fvalue	TokenNameIdentifier	 fvalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
truncateTrailingZeros	TokenNameIdentifier	 truncate Trailing Zeros
(	TokenNameLPAREN	
temp1	TokenNameIdentifier	 temp1
,	TokenNameCOMMA	
temp2	TokenNameIdentifier	 temp2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
temp1	TokenNameIdentifier	 temp1
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
temp2	TokenNameIdentifier	 temp2
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
truncateTrailingZeros	TokenNameIdentifier	 truncate Trailing Zeros
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
fValue	TokenNameIdentifier	 f Value
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
otherFValue	TokenNameIdentifier	 other F Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fValue	TokenNameIdentifier	 f Value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
fValue	TokenNameIdentifier	 f Value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
fValue	TokenNameIdentifier	 f Value
.	TokenNameDOT	
deleteCharAt	TokenNameIdentifier	 delete Char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
otherFValue	TokenNameIdentifier	 other F Value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
otherFValue	TokenNameIdentifier	 other F Value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
otherFValue	TokenNameIdentifier	 other F Value
.	TokenNameDOT	
deleteCharAt	TokenNameIdentifier	 delete Char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// seen NaN 	TokenNameCOMMENT_LINE	seen NaN 
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
//INF is greater than everything and equal to itself 	TokenNameCOMMENT_LINE	INF is greater than everything and equal to itself 
if	TokenNameif	
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"INF"	TokenNameStringLiteral	INF
)	TokenNameRPAREN	
||	TokenNameOR_OR	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
ivalue	TokenNameIdentifier	 ivalue
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"INF"	TokenNameStringLiteral	INF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
EQUAL	TokenNameIdentifier	 EQUAL
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"INF"	TokenNameStringLiteral	INF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LESS_THAN	TokenNameIdentifier	 LESS  THAN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-INF is smaller than everything and equal itself 	TokenNameCOMMENT_LINE	-INF is smaller than everything and equal itself 
if	TokenNameif	
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-INF"	TokenNameStringLiteral	-INF
)	TokenNameRPAREN	
||	TokenNameOR_OR	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
ivalue	TokenNameIdentifier	 ivalue
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-INF"	TokenNameStringLiteral	-INF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
EQUAL	TokenNameIdentifier	 EQUAL
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-INF"	TokenNameStringLiteral	-INF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
LESS_THAN	TokenNameIdentifier	 LESS  THAN
;	TokenNameSEMICOLON	
return	TokenNamereturn	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
!=	TokenNameNOT_EQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
sign	TokenNameIdentifier	 sign
)	TokenNameRPAREN	
return	TokenNamereturn	
sign	TokenNameIdentifier	 sign
>	TokenNameGREATER	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
sign	TokenNameIdentifier	 sign
?	TokenNameQUESTION	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
:	TokenNameCOLON	
LESS_THAN	TokenNameIdentifier	 LESS  THAN
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sign	TokenNameIdentifier	 sign
*	TokenNameMULTIPLY	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// To enable comparison - the exponent part of the decimal will be limited 	TokenNameCOMMENT_LINE	To enable comparison - the exponent part of the decimal will be limited 
// to the max value of int. 	TokenNameCOMMENT_LINE	to the max value of int. 
private	TokenNameprivate	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pvalue	TokenNameIdentifier	 pvalue
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
pvalue	TokenNameIdentifier	 pvalue
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pvalue	TokenNameIdentifier	 pvalue
==	TokenNameEQUAL_EQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
pvalue	TokenNameIdentifier	 pvalue
)	TokenNameRPAREN	
return	TokenNamereturn	
intComp	TokenNameIdentifier	 int Comp
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
intDigits	TokenNameIdentifier	 int Digits
+	TokenNamePLUS	
pvalue	TokenNameIdentifier	 pvalue
!=	TokenNameNOT_EQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
intDigits	TokenNameIdentifier	 int Digits
+	TokenNamePLUS	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
pvalue	TokenNameIdentifier	 pvalue
)	TokenNameRPAREN	
return	TokenNamereturn	
intDigits	TokenNameIdentifier	 int Digits
+	TokenNamePLUS	
pvalue	TokenNameIdentifier	 pvalue
>	TokenNameGREATER	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
intDigits	TokenNameIdentifier	 int Digits
+	TokenNamePLUS	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
pvalue	TokenNameIdentifier	 pvalue
?	TokenNameQUESTION	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
:	TokenNameCOLON	
LESS_THAN	TokenNameIdentifier	 LESS  THAN
;	TokenNameSEMICOLON	
//otherwise the 2 combined values are the same 	TokenNameCOMMENT_LINE	otherwise the 2 combined values are the same 
if	TokenNameif	
(	TokenNameLPAREN	
pvalue	TokenNameIdentifier	 pvalue
>	TokenNameGREATER	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
pvalue	TokenNameIdentifier	 pvalue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
expDiff	TokenNameIdentifier	 exp Diff
=	TokenNameEQUAL	
pvalue	TokenNameIdentifier	 pvalue
-	TokenNameMINUS	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
pvalue	TokenNameIdentifier	 pvalue
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
fbuffer	TokenNameIdentifier	 fbuffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
fvalue	TokenNameIdentifier	 fvalue
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
expDiff	TokenNameIdentifier	 exp Diff
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fracDigits	TokenNameIdentifier	 frac Digits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fvalue	TokenNameIdentifier	 fvalue
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fbuffer	TokenNameIdentifier	 fbuffer
.	TokenNameDOT	
deleteCharAt	TokenNameIdentifier	 delete Char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
compareDecimal	TokenNameIdentifier	 compare Decimal
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
ivalue	TokenNameIdentifier	 ivalue
,	TokenNameCOMMA	
fbuffer	TokenNameIdentifier	 fbuffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
fvalue	TokenNameIdentifier	 fvalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
expDiff	TokenNameIdentifier	 exp Diff
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
pvalue	TokenNameIdentifier	 pvalue
-	TokenNameMINUS	
pvalue	TokenNameIdentifier	 pvalue
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
fbuffer	TokenNameIdentifier	 fbuffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
fvalue	TokenNameIdentifier	 fvalue
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
expDiff	TokenNameIdentifier	 exp Diff
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
fracDigits	TokenNameIdentifier	 frac Digits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
fvalue	TokenNameIdentifier	 fvalue
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fbuffer	TokenNameIdentifier	 fbuffer
.	TokenNameDOT	
deleteCharAt	TokenNameIdentifier	 delete Char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
compareDecimal	TokenNameIdentifier	 compare Decimal
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fvalue	TokenNameIdentifier	 fvalue
,	TokenNameCOMMA	
fbuffer	TokenNameIdentifier	 fbuffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
intComp	TokenNameIdentifier	 int Comp
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @param val * @return */	TokenNameCOMMENT_JAVADOC	 @param val @return 
private	TokenNameprivate	
int	TokenNameint	
intComp	TokenNameIdentifier	 int Comp
(	TokenNameLPAREN	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
intDigits	TokenNameIdentifier	 int Digits
!=	TokenNameNOT_EQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
intDigits	TokenNameIdentifier	 int Digits
)	TokenNameRPAREN	
return	TokenNamereturn	
intDigits	TokenNameIdentifier	 int Digits
>	TokenNameGREATER	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
intDigits	TokenNameIdentifier	 int Digits
?	TokenNameQUESTION	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
:	TokenNameCOLON	
LESS_THAN	TokenNameIdentifier	 LESS  THAN
;	TokenNameSEMICOLON	
return	TokenNamereturn	
compareDecimal	TokenNameIdentifier	 compare Decimal
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
ivalue	TokenNameIdentifier	 ivalue
,	TokenNameCOMMA	
fvalue	TokenNameIdentifier	 fvalue
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
fvalue	TokenNameIdentifier	 fvalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param val * @return */	TokenNameCOMMENT_JAVADOC	 @param val @return 
private	TokenNameprivate	
int	TokenNameint	
compareDecimal	TokenNameIdentifier	 compare Decimal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
iValue	TokenNameIdentifier	 i Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fValue	TokenNameIdentifier	 f Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
otherIValue	TokenNameIdentifier	 other I Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
otherFValue	TokenNameIdentifier	 other F Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
iValue	TokenNameIdentifier	 i Value
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
otherIValue	TokenNameIdentifier	 other I Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
:	TokenNameCOLON	
LESS_THAN	TokenNameIdentifier	 LESS  THAN
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fValue	TokenNameIdentifier	 f Value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
otherFValue	TokenNameIdentifier	 other F Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
EQUAL	TokenNameIdentifier	 EQUAL
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
temp1	TokenNameIdentifier	 temp1
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
fValue	TokenNameIdentifier	 f Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
temp2	TokenNameIdentifier	 temp2
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
otherFValue	TokenNameIdentifier	 other F Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
truncateTrailingZeros	TokenNameIdentifier	 truncate Trailing Zeros
(	TokenNameLPAREN	
temp1	TokenNameIdentifier	 temp1
,	TokenNameCOMMA	
temp2	TokenNameIdentifier	 temp2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
temp1	TokenNameIdentifier	 temp1
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
temp2	TokenNameIdentifier	 temp2
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
EQUAL	TokenNameIdentifier	 EQUAL
:	TokenNameCOLON	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
:	TokenNameCOLON	
LESS_THAN	TokenNameIdentifier	 LESS  THAN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
canonical	TokenNameIdentifier	 canonical
;	TokenNameSEMICOLON	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
canonical	TokenNameIdentifier	 canonical
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
makeCanonical	TokenNameIdentifier	 make Canonical
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
canonical	TokenNameIdentifier	 canonical
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
makeCanonical	TokenNameIdentifier	 make Canonical
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: to be determined by working group 	TokenNameCOMMENT_LINE	REVISIT: to be determined by working group 
canonical	TokenNameIdentifier	 canonical
=	TokenNameEQUAL	
"TBD by Working Group"	TokenNameStringLiteral	TBD by Working Group
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param decimal * @return */	TokenNameCOMMENT_JAVADOC	 @param decimal @return 
public	TokenNamepublic	
boolean	TokenNameboolean	
isIdentical	TokenNameIdentifier	 is Identical
(	TokenNameLPAREN	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
decimal	TokenNameIdentifier	 decimal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
decimal	TokenNameIdentifier	 decimal
.	TokenNameDOT	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"INF"	TokenNameStringLiteral	INF
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ivalue	TokenNameIdentifier	 ivalue
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-INF"	TokenNameStringLiteral	-INF
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ivalue	TokenNameIdentifier	 ivalue
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"NaN"	TokenNameStringLiteral	NaN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
decimal	TokenNameIdentifier	 decimal
.	TokenNameDOT	
sign	TokenNameIdentifier	 sign
&&	TokenNameAND_AND	
intDigits	TokenNameIdentifier	 int Digits
==	TokenNameEQUAL_EQUAL	
decimal	TokenNameIdentifier	 decimal
.	TokenNameDOT	
intDigits	TokenNameIdentifier	 int Digits
&&	TokenNameAND_AND	
fracDigits	TokenNameIdentifier	 frac Digits
==	TokenNameEQUAL_EQUAL	
decimal	TokenNameIdentifier	 decimal
.	TokenNameDOT	
fracDigits	TokenNameIdentifier	 frac Digits
&&	TokenNameAND_AND	
pvalue	TokenNameIdentifier	 pvalue
==	TokenNameEQUAL_EQUAL	
decimal	TokenNameIdentifier	 decimal
.	TokenNameDOT	
pvalue	TokenNameIdentifier	 pvalue
&&	TokenNameAND_AND	
ivalue	TokenNameIdentifier	 ivalue
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
decimal	TokenNameIdentifier	 decimal
.	TokenNameDOT	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fvalue	TokenNameIdentifier	 fvalue
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
decimal	TokenNameIdentifier	 decimal
.	TokenNameDOT	
fvalue	TokenNameIdentifier	 fvalue
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.impl.dv.xs.TypeValidator#getAllowedFacets() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.impl.dv.xs.TypeValidator#getAllowedFacets() 
public	TokenNamepublic	
short	TokenNameshort	
getAllowedFacets	TokenNameIdentifier	 get Allowed Facets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_PATTERN	TokenNameIdentifier	 FACET  PATTERN
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_WHITESPACE	TokenNameIdentifier	 FACET  WHITESPACE
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_ENUMERATION	TokenNameIdentifier	 FACET  ENUMERATION
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_MAXINCLUSIVE	TokenNameIdentifier	 FACET  MAXINCLUSIVE
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_MININCLUSIVE	TokenNameIdentifier	 FACET  MININCLUSIVE
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_MAXEXCLUSIVE	TokenNameIdentifier	 FACET  MAXEXCLUSIVE
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_MINEXCLUSIVE	TokenNameIdentifier	 FACET  MINEXCLUSIVE
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_TOTALDIGITS	TokenNameIdentifier	 FACET  TOTALDIGITS
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_FRACTIONDIGITS	TokenNameIdentifier	 FACET  FRACTIONDIGITS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.impl.dv.xs.TypeValidator#getActualValue(java.lang.String, org.apache.xerces.impl.dv.ValidationContext) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.impl.dv.xs.TypeValidator#getActualValue(java.lang.String, org.apache.xerces.impl.dv.ValidationContext) 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getActualValue	TokenNameIdentifier	 get Actual Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
ValidationContext	TokenNameIdentifier	 Validation Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfe	TokenNameIdentifier	 nfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
(	TokenNameLPAREN	
"cvc-datatype-valid.1.2.1"	TokenNameStringLiteral	cvc-datatype-valid.1.2.1
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
"precisionDecimal"	TokenNameStringLiteral	precisionDecimal
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value1	TokenNameIdentifier	 value1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value2	TokenNameIdentifier	 value2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
)	TokenNameRPAREN	
value1	TokenNameIdentifier	 value1
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
)	TokenNameRPAREN	
value2	TokenNameIdentifier	 value2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getFractionDigits	TokenNameIdentifier	 get Fraction Digits
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
fracDigits	TokenNameIdentifier	 frac Digits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getTotalDigits	TokenNameIdentifier	 get Total Digits
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
totalDigits	TokenNameIdentifier	 total Digits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isIdentical	TokenNameIdentifier	 is Identical
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value1	TokenNameIdentifier	 value1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value2	TokenNameIdentifier	 value2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
value2	TokenNameIdentifier	 value2
instanceof	TokenNameinstanceof	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
value1	TokenNameIdentifier	 value1
instanceof	TokenNameinstanceof	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
)	TokenNameRPAREN	
value1	TokenNameIdentifier	 value1
)	TokenNameRPAREN	
.	TokenNameDOT	
isIdentical	TokenNameIdentifier	 is Identical
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XPrecisionDecimal	TokenNameIdentifier	 X Precision Decimal
)	TokenNameRPAREN	
value2	TokenNameIdentifier	 value2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
