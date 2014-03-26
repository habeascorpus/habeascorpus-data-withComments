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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
datatype	TokenNameIdentifier	 datatype
.	TokenNameDOT	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
datatype	TokenNameIdentifier	 datatype
.	TokenNameDOT	
Duration	TokenNameIdentifier	 Duration
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
/** * Validator for &lt;duration&gt; datatype (W3C Schema Datatypes) * * @xerces.internal * * @author Elena Litani * @author Gopal Sharma, SUN Microsystem Inc. * @version $Id: DurationDV.java 937741 2010-04-25 04:25:46Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Validator for &lt;duration&gt; datatype (W3C Schema Datatypes) * @xerces.internal * @author Elena Litani @author Gopal Sharma, SUN Microsystem Inc. @version $Id: DurationDV.java 937741 2010-04-25 04:25:46Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DurationDV	TokenNameIdentifier	 Duration DV
extends	TokenNameextends	
AbstractDateTimeDV	TokenNameIdentifier	 Abstract Date Time DV
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DURATION_TYPE	TokenNameIdentifier	 DURATION  TYPE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
YEARMONTHDURATION_TYPE	TokenNameIdentifier	 YEARMONTHDURATION  TYPE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DAYTIMEDURATION_TYPE	TokenNameIdentifier	 DAYTIMEDURATION  TYPE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// order-relation on duration is a partial order. The dates below are used to 	TokenNameCOMMENT_LINE	order-relation on duration is a partial order. The dates below are used to 
// for comparison of 2 durations, based on the fact that 	TokenNameCOMMENT_LINE	for comparison of 2 durations, based on the fact that 
// duration x and y is x<=y iff s+x<=s+y 	TokenNameCOMMENT_LINE	duration x and y is x<=y iff s+x<=s+y 
// see 3.2.6 duration W3C schema datatype specs 	TokenNameCOMMENT_LINE	see 3.2.6 duration W3C schema datatype specs 
// 	TokenNameCOMMENT_LINE	 
// the dates are in format: {CCYY,MM,DD, H, S, M, MS, timezone} 	TokenNameCOMMENT_LINE	the dates are in format: {CCYY,MM,DD, H, S, M, MS, timezone} 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
DateTimeData	TokenNameIdentifier	 Date Time Data
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DATETIMES	TokenNameIdentifier	 DATETIMES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
new	TokenNamenew	
DateTimeData	TokenNameIdentifier	 Date Time Data
(	TokenNameLPAREN	
1696	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'Z'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
DateTimeData	TokenNameIdentifier	 Date Time Data
(	TokenNameLPAREN	
1697	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'Z'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
DateTimeData	TokenNameIdentifier	 Date Time Data
(	TokenNameLPAREN	
1903	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'Z'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
DateTimeData	TokenNameIdentifier	 Date Time Data
(	TokenNameLPAREN	
1903	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'Z'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
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
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
DURATION_TYPE	TokenNameIdentifier	 DURATION  TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
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
"duration"	TokenNameStringLiteral	duration
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses, validates and computes normalized version of duration object * * @param str The lexical representation of duration object PnYn MnDTnH nMnS * @param durationType * @return normalized date representation * @exception SchemaDateTimeException Invalid lexical representation */	TokenNameCOMMENT_JAVADOC	 Parses, validates and computes normalized version of duration object * @param str The lexical representation of duration object PnYn MnDTnH nMnS @param durationType @return normalized date representation @exception SchemaDateTimeException Invalid lexical representation 
protected	TokenNameprotected	
DateTimeData	TokenNameIdentifier	 Date Time Data
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
int	TokenNameint	
durationType	TokenNameIdentifier	 duration Type
)	TokenNameRPAREN	
throws	TokenNamethrows	
SchemaDateTimeException	TokenNameIdentifier	 Schema Date Time Exception
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DateTimeData	TokenNameIdentifier	 Date Time Data
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
new	TokenNamenew	
DateTimeData	TokenNameIdentifier	 Date Time Data
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'P'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SchemaDateTimeException	TokenNameIdentifier	 Schema Date Time Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'P'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SchemaDateTimeException	TokenNameIdentifier	 Schema Date Time Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
negate	TokenNameIdentifier	 negate
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//negative duration 	TokenNameCOMMENT_LINE	negative duration 
if	TokenNameif	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
negate	TokenNameIdentifier	 negate
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//at least one number and designator must be seen after P 	TokenNameCOMMENT_LINE	at least one number and designator must be seen after P 
boolean	TokenNameboolean	
designator	TokenNameIdentifier	 designator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
endDate	TokenNameIdentifier	 end Date
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
'T'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endDate	TokenNameIdentifier	 end Date
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endDate	TokenNameIdentifier	 end Date
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
durationType	TokenNameIdentifier	 duration Type
==	TokenNameEQUAL_EQUAL	
YEARMONTHDURATION_TYPE	TokenNameIdentifier	 YEARMONTHDURATION  TYPE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SchemaDateTimeException	TokenNameIdentifier	 Schema Date Time Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//find 'Y' 	TokenNameCOMMENT_LINE	find 'Y' 
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
endDate	TokenNameIdentifier	 end Date
,	TokenNameCOMMA	
'Y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
durationType	TokenNameIdentifier	 duration Type
==	TokenNameEQUAL_EQUAL	
DAYTIMEDURATION_TYPE	TokenNameIdentifier	 DAYTIMEDURATION  TYPE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SchemaDateTimeException	TokenNameIdentifier	 Schema Date Time Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//scan year 	TokenNameCOMMENT_LINE	scan year 
date	TokenNameIdentifier	 date
.	TokenNameDOT	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
negate	TokenNameIdentifier	 negate
*	TokenNameMULTIPLY	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
designator	TokenNameIdentifier	 designator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
endDate	TokenNameIdentifier	 end Date
,	TokenNameCOMMA	
'M'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
durationType	TokenNameIdentifier	 duration Type
==	TokenNameEQUAL_EQUAL	
DAYTIMEDURATION_TYPE	TokenNameIdentifier	 DAYTIMEDURATION  TYPE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SchemaDateTimeException	TokenNameIdentifier	 Schema Date Time Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//scan month 	TokenNameCOMMENT_LINE	scan month 
date	TokenNameIdentifier	 date
.	TokenNameDOT	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
negate	TokenNameIdentifier	 negate
*	TokenNameMULTIPLY	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
designator	TokenNameIdentifier	 designator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
endDate	TokenNameIdentifier	 end Date
,	TokenNameCOMMA	
'D'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
durationType	TokenNameIdentifier	 duration Type
==	TokenNameEQUAL_EQUAL	
YEARMONTHDURATION_TYPE	TokenNameIdentifier	 YEARMONTHDURATION  TYPE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SchemaDateTimeException	TokenNameIdentifier	 Schema Date Time Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//scan day 	TokenNameCOMMENT_LINE	scan day 
date	TokenNameIdentifier	 date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
negate	TokenNameIdentifier	 negate
*	TokenNameMULTIPLY	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
designator	TokenNameIdentifier	 designator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
endDate	TokenNameIdentifier	 end Date
&&	TokenNameAND_AND	
start	TokenNameIdentifier	 start
!=	TokenNameNOT_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SchemaDateTimeException	TokenNameIdentifier	 Schema Date Time Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
!=	TokenNameNOT_EQUAL	
endDate	TokenNameIdentifier	 end Date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//scan hours, minutes, seconds 	TokenNameCOMMENT_LINE	scan hours, minutes, seconds 
//REVISIT: can any item include a decimal fraction or only seconds? 	TokenNameCOMMENT_LINE	REVISIT: can any item include a decimal fraction or only seconds? 
// 	TokenNameCOMMENT_LINE	 
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
++	TokenNamePLUS_PLUS	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
'H'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//scan hours 	TokenNameCOMMENT_LINE	scan hours 
date	TokenNameIdentifier	 date
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
=	TokenNameEQUAL	
negate	TokenNameIdentifier	 negate
*	TokenNameMULTIPLY	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
designator	TokenNameIdentifier	 designator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
'M'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//scan min 	TokenNameCOMMENT_LINE	scan min 
date	TokenNameIdentifier	 date
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
=	TokenNameEQUAL	
negate	TokenNameIdentifier	 negate
*	TokenNameMULTIPLY	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
designator	TokenNameIdentifier	 designator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
'S'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//scan seconds 	TokenNameCOMMENT_LINE	scan seconds 
date	TokenNameIdentifier	 date
.	TokenNameDOT	
second	TokenNameIdentifier	 second
=	TokenNameEQUAL	
negate	TokenNameIdentifier	 negate
*	TokenNameMULTIPLY	
parseSecond	TokenNameIdentifier	 parse Second
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
designator	TokenNameIdentifier	 designator
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// no additional data shouls appear after last item 	TokenNameCOMMENT_LINE	no additional data shouls appear after last item 
// P1Y1M1DT is illigal value as well 	TokenNameCOMMENT_LINE	P1Y1M1DT is illigal value as well 
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
!=	TokenNameNOT_EQUAL	
len	TokenNameIdentifier	 len
||	TokenNameOR_OR	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'T'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SchemaDateTimeException	TokenNameIdentifier	 Schema Date Time Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
designator	TokenNameIdentifier	 designator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SchemaDateTimeException	TokenNameIdentifier	 Schema Date Time Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
date	TokenNameIdentifier	 date
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares 2 given durations. (refer to W3C Schema Datatypes "3.2.6 duration") * * @param date1 Unnormalized duration * @param date2 Unnormalized duration * @param strict (min/max)Exclusive strict == true ( LESS_THAN ) or ( GREATER_THAN ) * (min/max)Inclusive strict == false (LESS_EQUAL) or (GREATER_EQUAL) * @return INDETERMINATE if the order relationship between date1 and date2 is indeterminate. * EQUAL if the order relation between date1 and date2 is EQUAL. * If the strict parameter is true, return LESS_THAN if date1 is less than date2 and * return GREATER_THAN if date1 is greater than date2. * If the strict parameter is false, return LESS_THAN if date1 is less than OR equal to date2 and * return GREATER_THAN if date1 is greater than OR equal to date2 */	TokenNameCOMMENT_JAVADOC	 Compares 2 given durations. (refer to W3C Schema Datatypes "3.2.6 duration") * @param date1 Unnormalized duration @param date2 Unnormalized duration @param strict (min/max)Exclusive strict == true ( LESS_THAN ) or ( GREATER_THAN ) (min/max)Inclusive strict == false (LESS_EQUAL) or (GREATER_EQUAL) @return INDETERMINATE if the order relationship between date1 and date2 is indeterminate. EQUAL if the order relation between date1 and date2 is EQUAL. If the strict parameter is true, return LESS_THAN if date1 is less than date2 and return GREATER_THAN if date1 is greater than date2. If the strict parameter is false, return LESS_THAN if date1 is less than OR equal to date2 and return GREATER_THAN if date1 is greater than OR equal to date2 
protected	TokenNameprotected	
short	TokenNameshort	
compareDates	TokenNameIdentifier	 compare Dates
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
date1	TokenNameIdentifier	 date1
,	TokenNameCOMMA	
DateTimeData	TokenNameIdentifier	 Date Time Data
date2	TokenNameIdentifier	 date2
,	TokenNameCOMMA	
boolean	TokenNameboolean	
strict	TokenNameIdentifier	 strict
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//REVISIT: this is unoptimazed vs of comparing 2 durations 	TokenNameCOMMENT_LINE	REVISIT: this is unoptimazed vs of comparing 2 durations 
// Algorithm is described in 3.2.6.2 W3C Schema Datatype specs 	TokenNameCOMMENT_LINE	Algorithm is described in 3.2.6.2 W3C Schema Datatype specs 
// 	TokenNameCOMMENT_LINE	 
//add constA to both durations 	TokenNameCOMMENT_LINE	add constA to both durations 
short	TokenNameshort	
resultA	TokenNameIdentifier	 result A
,	TokenNameCOMMA	
resultB	TokenNameIdentifier	 result B
=	TokenNameEQUAL	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
//try and see if the objects are equal 	TokenNameCOMMENT_LINE	try and see if the objects are equal 
resultA	TokenNameIdentifier	 result A
=	TokenNameEQUAL	
compareOrder	TokenNameIdentifier	 compare Order
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
,	TokenNameCOMMA	
date2	TokenNameIdentifier	 date2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resultA	TokenNameIdentifier	 result A
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DateTimeData	TokenNameIdentifier	 Date Time Data
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
DateTimeData	TokenNameIdentifier	 Date Time Data
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
DateTimeData	TokenNameIdentifier	 Date Time Data
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
DateTimeData	TokenNameIdentifier	 Date Time Data
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//long comparison algorithm is required 	TokenNameCOMMENT_LINE	long comparison algorithm is required 
DateTimeData	TokenNameIdentifier	 Date Time Data
tempA	TokenNameIdentifier	 temp A
=	TokenNameEQUAL	
addDuration	TokenNameIdentifier	 add Duration
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
,	TokenNameCOMMA	
DATETIMES	TokenNameIdentifier	 DATETIMES
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DateTimeData	TokenNameIdentifier	 Date Time Data
tempB	TokenNameIdentifier	 temp B
=	TokenNameEQUAL	
addDuration	TokenNameIdentifier	 add Duration
(	TokenNameLPAREN	
date2	TokenNameIdentifier	 date2
,	TokenNameCOMMA	
DATETIMES	TokenNameIdentifier	 DATETIMES
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultA	TokenNameIdentifier	 result A
=	TokenNameEQUAL	
compareOrder	TokenNameIdentifier	 compare Order
(	TokenNameLPAREN	
tempA	TokenNameIdentifier	 temp A
,	TokenNameCOMMA	
tempB	TokenNameIdentifier	 temp B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resultA	TokenNameIdentifier	 result A
==	TokenNameEQUAL_EQUAL	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tempA	TokenNameIdentifier	 temp A
=	TokenNameEQUAL	
addDuration	TokenNameIdentifier	 add Duration
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
,	TokenNameCOMMA	
DATETIMES	TokenNameIdentifier	 DATETIMES
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempB	TokenNameIdentifier	 temp B
=	TokenNameEQUAL	
addDuration	TokenNameIdentifier	 add Duration
(	TokenNameLPAREN	
date2	TokenNameIdentifier	 date2
,	TokenNameCOMMA	
DATETIMES	TokenNameIdentifier	 DATETIMES
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultB	TokenNameIdentifier	 result B
=	TokenNameEQUAL	
compareOrder	TokenNameIdentifier	 compare Order
(	TokenNameLPAREN	
tempA	TokenNameIdentifier	 temp A
,	TokenNameCOMMA	
tempB	TokenNameIdentifier	 temp B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultA	TokenNameIdentifier	 result A
=	TokenNameEQUAL	
compareResults	TokenNameIdentifier	 compare Results
(	TokenNameLPAREN	
resultA	TokenNameIdentifier	 result A
,	TokenNameCOMMA	
resultB	TokenNameIdentifier	 result B
,	TokenNameCOMMA	
strict	TokenNameIdentifier	 strict
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resultA	TokenNameIdentifier	 result A
==	TokenNameEQUAL_EQUAL	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tempA	TokenNameIdentifier	 temp A
=	TokenNameEQUAL	
addDuration	TokenNameIdentifier	 add Duration
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
,	TokenNameCOMMA	
DATETIMES	TokenNameIdentifier	 DATETIMES
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempB	TokenNameIdentifier	 temp B
=	TokenNameEQUAL	
addDuration	TokenNameIdentifier	 add Duration
(	TokenNameLPAREN	
date2	TokenNameIdentifier	 date2
,	TokenNameCOMMA	
DATETIMES	TokenNameIdentifier	 DATETIMES
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultB	TokenNameIdentifier	 result B
=	TokenNameEQUAL	
compareOrder	TokenNameIdentifier	 compare Order
(	TokenNameLPAREN	
tempA	TokenNameIdentifier	 temp A
,	TokenNameCOMMA	
tempB	TokenNameIdentifier	 temp B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultA	TokenNameIdentifier	 result A
=	TokenNameEQUAL	
compareResults	TokenNameIdentifier	 compare Results
(	TokenNameLPAREN	
resultA	TokenNameIdentifier	 result A
,	TokenNameCOMMA	
resultB	TokenNameIdentifier	 result B
,	TokenNameCOMMA	
strict	TokenNameIdentifier	 strict
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resultA	TokenNameIdentifier	 result A
==	TokenNameEQUAL_EQUAL	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tempA	TokenNameIdentifier	 temp A
=	TokenNameEQUAL	
addDuration	TokenNameIdentifier	 add Duration
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
,	TokenNameCOMMA	
DATETIMES	TokenNameIdentifier	 DATETIMES
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempB	TokenNameIdentifier	 temp B
=	TokenNameEQUAL	
addDuration	TokenNameIdentifier	 add Duration
(	TokenNameLPAREN	
date2	TokenNameIdentifier	 date2
,	TokenNameCOMMA	
DATETIMES	TokenNameIdentifier	 DATETIMES
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultB	TokenNameIdentifier	 result B
=	TokenNameEQUAL	
compareOrder	TokenNameIdentifier	 compare Order
(	TokenNameLPAREN	
tempA	TokenNameIdentifier	 temp A
,	TokenNameCOMMA	
tempB	TokenNameIdentifier	 temp B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultA	TokenNameIdentifier	 result A
=	TokenNameEQUAL	
compareResults	TokenNameIdentifier	 compare Results
(	TokenNameLPAREN	
resultA	TokenNameIdentifier	 result A
,	TokenNameCOMMA	
resultB	TokenNameIdentifier	 result B
,	TokenNameCOMMA	
strict	TokenNameIdentifier	 strict
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resultA	TokenNameIdentifier	 result A
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
short	TokenNameshort	
compareResults	TokenNameIdentifier	 compare Results
(	TokenNameLPAREN	
short	TokenNameshort	
resultA	TokenNameIdentifier	 result A
,	TokenNameCOMMA	
short	TokenNameshort	
resultB	TokenNameIdentifier	 result B
,	TokenNameCOMMA	
boolean	TokenNameboolean	
strict	TokenNameIdentifier	 strict
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resultB	TokenNameIdentifier	 result B
==	TokenNameEQUAL_EQUAL	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
resultA	TokenNameIdentifier	 result A
!=	TokenNameNOT_EQUAL	
resultB	TokenNameIdentifier	 result B
&&	TokenNameAND_AND	
strict	TokenNameIdentifier	 strict
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
resultA	TokenNameIdentifier	 result A
!=	TokenNameNOT_EQUAL	
resultB	TokenNameIdentifier	 result B
&&	TokenNameAND_AND	
!	TokenNameNOT	
strict	TokenNameIdentifier	 strict
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resultA	TokenNameIdentifier	 result A
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
resultB	TokenNameIdentifier	 result B
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
resultA	TokenNameIdentifier	 result A
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
resultA	TokenNameIdentifier	 result A
:	TokenNameCOLON	
resultB	TokenNameIdentifier	 result B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
resultA	TokenNameIdentifier	 result A
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
DateTimeData	TokenNameIdentifier	 Date Time Data
addDuration	TokenNameIdentifier	 add Duration
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
DateTimeData	TokenNameIdentifier	 Date Time Data
addto	TokenNameIdentifier	 addto
,	TokenNameCOMMA	
DateTimeData	TokenNameIdentifier	 Date Time Data
duration	TokenNameIdentifier	 duration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//REVISIT: some code could be shared between normalize() and this method, 	TokenNameCOMMENT_LINE	REVISIT: some code could be shared between normalize() and this method, 
// however is it worth moving it? The structures are different... 	TokenNameCOMMENT_LINE	however is it worth moving it? The structures are different... 
// 	TokenNameCOMMENT_LINE	 
resetDateObj	TokenNameIdentifier	 reset Date Obj
(	TokenNameLPAREN	
duration	TokenNameIdentifier	 duration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//add months (may be modified additionaly below) 	TokenNameCOMMENT_LINE	add months (may be modified additionaly below) 
int	TokenNameint	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
addto	TokenNameIdentifier	 addto
.	TokenNameDOT	
month	TokenNameIdentifier	 month
+	TokenNamePLUS	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
month	TokenNameIdentifier	 month
;	TokenNameSEMICOLON	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
modulo	TokenNameIdentifier	 modulo
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
carry	TokenNameIdentifier	 carry
=	TokenNameEQUAL	
fQuotient	TokenNameIdentifier	 f Quotient
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//add years (may be modified additionaly below) 	TokenNameCOMMENT_LINE	add years (may be modified additionaly below) 
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
addto	TokenNameIdentifier	 addto
.	TokenNameDOT	
year	TokenNameIdentifier	 year
+	TokenNamePLUS	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
year	TokenNameIdentifier	 year
+	TokenNamePLUS	
carry	TokenNameIdentifier	 carry
;	TokenNameSEMICOLON	
//add seconds 	TokenNameCOMMENT_LINE	add seconds 
double	TokenNamedouble	
dtemp	TokenNameIdentifier	 dtemp
=	TokenNameEQUAL	
addto	TokenNameIdentifier	 addto
.	TokenNameDOT	
second	TokenNameIdentifier	 second
+	TokenNamePLUS	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
second	TokenNameIdentifier	 second
;	TokenNameSEMICOLON	
carry	TokenNameIdentifier	 carry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
dtemp	TokenNameIdentifier	 dtemp
/	TokenNameDIVIDE	
60	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
second	TokenNameIdentifier	 second
=	TokenNameEQUAL	
dtemp	TokenNameIdentifier	 dtemp
-	TokenNameMINUS	
carry	TokenNameIdentifier	 carry
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//add minutes 	TokenNameCOMMENT_LINE	add minutes 
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
addto	TokenNameIdentifier	 addto
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
+	TokenNamePLUS	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
+	TokenNamePLUS	
carry	TokenNameIdentifier	 carry
;	TokenNameSEMICOLON	
carry	TokenNameIdentifier	 carry
=	TokenNameEQUAL	
fQuotient	TokenNameIdentifier	 f Quotient
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
60	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
=	TokenNameEQUAL	
mod	TokenNameIdentifier	 mod
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
60	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
carry	TokenNameIdentifier	 carry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//add hours 	TokenNameCOMMENT_LINE	add hours 
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
addto	TokenNameIdentifier	 addto
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
+	TokenNamePLUS	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
+	TokenNamePLUS	
carry	TokenNameIdentifier	 carry
;	TokenNameSEMICOLON	
carry	TokenNameIdentifier	 carry
=	TokenNameEQUAL	
fQuotient	TokenNameIdentifier	 f Quotient
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
=	TokenNameEQUAL	
mod	TokenNameIdentifier	 mod
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
carry	TokenNameIdentifier	 carry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
addto	TokenNameIdentifier	 addto
.	TokenNameDOT	
day	TokenNameIdentifier	 day
+	TokenNamePLUS	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
+	TokenNamePLUS	
carry	TokenNameIdentifier	 carry
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
maxDayInMonthFor	TokenNameIdentifier	 max Day In Month For
(	TokenNameLPAREN	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
day	TokenNameIdentifier	 day
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//original duration was negative 	TokenNameCOMMENT_LINE	original duration was negative 
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
day	TokenNameIdentifier	 day
+	TokenNamePLUS	
maxDayInMonthFor	TokenNameIdentifier	 max Day In Month For
(	TokenNameLPAREN	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
month	TokenNameIdentifier	 month
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
carry	TokenNameIdentifier	 carry
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
day	TokenNameIdentifier	 day
>	TokenNameGREATER	
temp	TokenNameIdentifier	 temp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
day	TokenNameIdentifier	 day
-	TokenNameMINUS	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
carry	TokenNameIdentifier	 carry
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
month	TokenNameIdentifier	 month
+	TokenNamePLUS	
carry	TokenNameIdentifier	 carry
;	TokenNameSEMICOLON	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
modulo	TokenNameIdentifier	 modulo
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
year	TokenNameIdentifier	 year
+	TokenNamePLUS	
fQuotient	TokenNameIdentifier	 f Quotient
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
=	TokenNameEQUAL	
'Z'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
duration	TokenNameIdentifier	 duration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
double	TokenNamedouble	
parseSecond	TokenNameIdentifier	 parse Second
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
{	TokenNameLBRACE	
int	TokenNameint	
dot	TokenNameIdentifier	 dot
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
dot	TokenNameIdentifier	 dot
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
'9'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
+	TokenNamePLUS	
"' has wrong format"	TokenNameStringLiteral	' has wrong format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dot	TokenNameIdentifier	 dot
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
+	TokenNamePLUS	
"' has wrong format"	TokenNameStringLiteral	' has wrong format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
parseDouble	TokenNameIdentifier	 parse Double
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
+	TokenNamePLUS	
"' has wrong format"	TokenNameStringLiteral	' has wrong format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
dateToString	TokenNameIdentifier	 date To String
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
year	TokenNameIdentifier	 year
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
month	TokenNameIdentifier	 month
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
second	TokenNameIdentifier	 second
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'P'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
year	TokenNameIdentifier	 year
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'Y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
month	TokenNameIdentifier	 month
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'M'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'D'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'T'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'H'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'M'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append2	TokenNameIdentifier	 append2
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
second	TokenNameIdentifier	 second
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'S'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Duration	TokenNameIdentifier	 Duration
getDuration	TokenNameIdentifier	 get Duration
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
year	TokenNameIdentifier	 year
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
month	TokenNameIdentifier	 month
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
second	TokenNameIdentifier	 second
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
datatypeFactory	TokenNameIdentifier	 datatype Factory
.	TokenNameDOT	
newDuration	TokenNameIdentifier	 new Duration
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
year	TokenNameIdentifier	 year
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
?	TokenNameQUESTION	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
*	TokenNameMULTIPLY	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
month	TokenNameIdentifier	 month
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
?	TokenNameQUESTION	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
*	TokenNameMULTIPLY	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
?	TokenNameQUESTION	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
*	TokenNameMULTIPLY	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
?	TokenNameQUESTION	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
*	TokenNameMULTIPLY	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
?	TokenNameQUESTION	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
*	TokenNameMULTIPLY	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
second	TokenNameIdentifier	 second
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
?	TokenNameQUESTION	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
*	TokenNameMULTIPLY	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
