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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
math	TokenNameIdentifier	 math
.	TokenNameDOT	
BigDecimal	TokenNameIdentifier	 Big Decimal
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
math	TokenNameIdentifier	 math
.	TokenNameDOT	
BigInteger	TokenNameIdentifier	 Big Integer
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
datatypes	TokenNameIdentifier	 datatypes
.	TokenNameDOT	
XSDecimal	TokenNameIdentifier	 XS Decimal
;	TokenNameSEMICOLON	
/** * Represent the schema type "decimal" * * @xerces.internal * * @author Neeraj Bajaj, Sun Microsystems, inc. * @author Sandy Gao, IBM * * @version $Id: DecimalDV.java 446745 2006-09-15 21:43:58Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Represent the schema type "decimal" * @xerces.internal * @author Neeraj Bajaj, Sun Microsystems, inc. @author Sandy Gao, IBM * @version $Id: DecimalDV.java 446745 2006-09-15 21:43:58Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DecimalDV	TokenNameIdentifier	 Decimal DV
extends	TokenNameextends	
TypeValidator	TokenNameIdentifier	 Type Validator
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
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
XDecimal	TokenNameIdentifier	 X Decimal
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
"decimal"	TokenNameStringLiteral	decimal
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
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
XDecimal	TokenNameIdentifier	 X Decimal
)	TokenNameRPAREN	
value1	TokenNameIdentifier	 value1
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XDecimal	TokenNameIdentifier	 X Decimal
)	TokenNameRPAREN	
value2	TokenNameIdentifier	 value2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
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
XDecimal	TokenNameIdentifier	 X Decimal
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
totalDigits	TokenNameIdentifier	 total Digits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
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
XDecimal	TokenNameIdentifier	 X Decimal
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
fracDigits	TokenNameIdentifier	 frac Digits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Avoid using the heavy-weight java.math.BigDecimal 	TokenNameCOMMENT_LINE	Avoid using the heavy-weight java.math.BigDecimal 
static	TokenNamestatic	
class	TokenNameclass	
XDecimal	TokenNameIdentifier	 X Decimal
implements	TokenNameimplements	
XSDecimal	TokenNameIdentifier	 XS Decimal
{	TokenNameLBRACE	
// sign: 0 for vlaue 0; 1 for positive values; -1 for negative values 	TokenNameCOMMENT_LINE	sign: 0 for vlaue 0; 1 for positive values; -1 for negative values 
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
// whether the canonical form contains decimal point 	TokenNameCOMMENT_LINE	whether the canonical form contains decimal point 
boolean	TokenNameboolean	
integer	TokenNameIdentifier	 integer
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
XDecimal	TokenNameIdentifier	 X Decimal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
{	TokenNameLBRACE	
initD	TokenNameIdentifier	 init D
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XDecimal	TokenNameIdentifier	 X Decimal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
boolean	TokenNameboolean	
integer	TokenNameIdentifier	 integer
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
integer	TokenNameIdentifier	 integer
)	TokenNameRPAREN	
initI	TokenNameIdentifier	 init I
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
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
// keep '-', so intStart is stil 0 	TokenNameCOMMENT_LINE	keep '-', so intStart is stil 0 
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
// the remaining part is not ".DDD", error 	TokenNameCOMMENT_LINE	the remaining part is not ".DDD", error 
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
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fraction part starts after '.', and ends at the end of the input 	TokenNameCOMMENT_LINE	fraction part starts after '.', and ends at the end of the input 
fracStart	TokenNameIdentifier	 frac Start
=	TokenNameEQUAL	
intEnd	TokenNameIdentifier	 int End
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fracEnd	TokenNameIdentifier	 frac End
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
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
while	TokenNamewhile	
(	TokenNameLPAREN	
fracEnd	TokenNameIdentifier	 frac End
>	TokenNameGREATER	
fracStart	TokenNameIdentifier	 frac Start
&&	TokenNameAND_AND	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
fracEnd	TokenNameIdentifier	 frac End
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fracEnd	TokenNameIdentifier	 frac End
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
totalDigits	TokenNameIdentifier	 total Digits
=	TokenNameEQUAL	
intDigits	TokenNameIdentifier	 int Digits
+	TokenNamePLUS	
fracDigits	TokenNameIdentifier	 frac Digits
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
if	TokenNameif	
(	TokenNameLPAREN	
fracDigits	TokenNameIdentifier	 frac Digits
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// ".00", treat it as "0" 	TokenNameCOMMENT_LINE	".00", treat it as "0" 
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
initI	TokenNameIdentifier	 init I
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
// these 2 variables are used to indicate where the integre start/end. 	TokenNameCOMMENT_LINE	these 2 variables are used to indicate where the integre start/end. 
int	TokenNameint	
intStart	TokenNameIdentifier	 int Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
intEnd	TokenNameIdentifier	 int End
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
// keep '-', so intStart is stil 0 	TokenNameCOMMENT_LINE	keep '-', so intStart is stil 0 
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
// Not reached the end yet, error 	TokenNameCOMMENT_LINE	Not reached the end yet, error 
if	TokenNameif	
(	TokenNameLPAREN	
intEnd	TokenNameIdentifier	 int End
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no integer part, error. 	TokenNameCOMMENT_LINE	no integer part, error. 
if	TokenNameif	
(	TokenNameLPAREN	
intStart	TokenNameIdentifier	 int Start
==	TokenNameEQUAL_EQUAL	
intEnd	TokenNameIdentifier	 int End
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intDigits	TokenNameIdentifier	 int Digits
=	TokenNameEQUAL	
intEnd	TokenNameIdentifier	 int End
-	TokenNameMINUS	
actualIntStart	TokenNameIdentifier	 actual Int Start
;	TokenNameSEMICOLON	
fracDigits	TokenNameIdentifier	 frac Digits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
totalDigits	TokenNameIdentifier	 total Digits
=	TokenNameEQUAL	
intDigits	TokenNameIdentifier	 int Digits
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
else	TokenNameelse	
{	TokenNameLBRACE	
// "00", treat it as "0" 	TokenNameCOMMENT_LINE	"00", treat it as "0" 
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
integer	TokenNameIdentifier	 integer
=	TokenNameEQUAL	
true	TokenNametrue	
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
XDecimal	TokenNameIdentifier	 X Decimal
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
XDecimal	TokenNameIdentifier	 X Decimal
oval	TokenNameIdentifier	 oval
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XDecimal	TokenNameIdentifier	 X Decimal
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
!=	TokenNameNOT_EQUAL	
oval	TokenNameIdentifier	 oval
.	TokenNameDOT	
sign	TokenNameIdentifier	 sign
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
intDigits	TokenNameIdentifier	 int Digits
==	TokenNameEQUAL_EQUAL	
oval	TokenNameIdentifier	 oval
.	TokenNameDOT	
intDigits	TokenNameIdentifier	 int Digits
&&	TokenNameAND_AND	
fracDigits	TokenNameIdentifier	 frac Digits
==	TokenNameEQUAL_EQUAL	
oval	TokenNameIdentifier	 oval
.	TokenNameDOT	
fracDigits	TokenNameIdentifier	 frac Digits
&&	TokenNameAND_AND	
ivalue	TokenNameIdentifier	 ivalue
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
oval	TokenNameIdentifier	 oval
.	TokenNameDOT	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fvalue	TokenNameIdentifier	 fvalue
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
oval	TokenNameIdentifier	 oval
.	TokenNameDOT	
fvalue	TokenNameIdentifier	 fvalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
XDecimal	TokenNameIdentifier	 X Decimal
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sign	TokenNameIdentifier	 sign
*	TokenNameMULTIPLY	
intComp	TokenNameIdentifier	 int Comp
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
intComp	TokenNameIdentifier	 int Comp
(	TokenNameLPAREN	
XDecimal	TokenNameIdentifier	 X Decimal
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
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
ivalue	TokenNameIdentifier	 ivalue
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
ivalue	TokenNameIdentifier	 ivalue
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
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
fvalue	TokenNameIdentifier	 fvalue
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
fvalue	TokenNameIdentifier	 fvalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
integer	TokenNameIdentifier	 integer
)	TokenNameRPAREN	
canonical	TokenNameIdentifier	 canonical
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
else	TokenNameelse	
canonical	TokenNameIdentifier	 canonical
=	TokenNameEQUAL	
"0.0"	TokenNameStringLiteral	0.0
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
integer	TokenNameIdentifier	 integer
&&	TokenNameAND_AND	
sign	TokenNameIdentifier	 sign
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
canonical	TokenNameIdentifier	 canonical
=	TokenNameEQUAL	
ivalue	TokenNameIdentifier	 ivalue
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for -0.1, total digits is 1, so we need 3 extra spots 	TokenNameCOMMENT_LINE	for -0.1, total digits is 1, so we need 3 extra spots 
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
totalDigits	TokenNameIdentifier	 total Digits
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
intDigits	TokenNameIdentifier	 int Digits
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
integer	TokenNameIdentifier	 integer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fracDigits	TokenNameIdentifier	 frac Digits
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fvalue	TokenNameIdentifier	 fvalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
canonical	TokenNameIdentifier	 canonical
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BigDecimal	TokenNameIdentifier	 Big Decimal
getBigDecimal	TokenNameIdentifier	 get Big Decimal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
ZERO	TokenNameIdentifier	 ZERO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BigInteger	TokenNameIdentifier	 Big Integer
getBigInteger	TokenNameIdentifier	 get Big Integer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fracDigits	TokenNameIdentifier	 frac Digits
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
ZERO	TokenNameIdentifier	 ZERO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BigInteger	TokenNameIdentifier	 Big Integer
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BigInteger	TokenNameIdentifier	 Big Integer
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fracDigits	TokenNameIdentifier	 frac Digits
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getInt	TokenNameIdentifier	 get Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fracDigits	TokenNameIdentifier	 frac Digits
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getShort	TokenNameIdentifier	 get Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fracDigits	TokenNameIdentifier	 frac Digits
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
parseShort	TokenNameIdentifier	 parse Short
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
parseShort	TokenNameIdentifier	 parse Short
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
getByte	TokenNameIdentifier	 get Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fracDigits	TokenNameIdentifier	 frac Digits
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
parseByte	TokenNameIdentifier	 parse Byte
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
parseByte	TokenNameIdentifier	 parse Byte
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class DecimalDV 	TokenNameCOMMENT_LINE	class DecimalDV 
