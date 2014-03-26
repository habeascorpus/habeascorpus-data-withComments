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
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
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
/** * Validator for &lt;gDay&gt; datatype (W3C Schema datatypes) * * @xerces.internal * * @author Elena Litani * @author Gopal Sharma, SUN Microsystem Inc. * @version $Id: DayDV.java 937741 2010-04-25 04:25:46Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Validator for &lt;gDay&gt; datatype (W3C Schema datatypes) * @xerces.internal * @author Elena Litani @author Gopal Sharma, SUN Microsystem Inc. @version $Id: DayDV.java 937741 2010-04-25 04:25:46Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DayDV	TokenNameIdentifier	 Day DV
extends	TokenNameextends	
AbstractDateTimeDV	TokenNameIdentifier	 Abstract Date Time DV
{	TokenNameLBRACE	
//size without time zone: ---09 	TokenNameCOMMENT_LINE	size without time zone: ---09 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
DAY_SIZE	TokenNameIdentifier	 DAY  SIZE
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
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
"gDay"	TokenNameStringLiteral	gDay
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses, validates and computes normalized version of gDay object * * @param str The lexical representation of gDay object ---DD * with possible time zone Z or (-),(+)hh:mm * Pattern: ---(\\d\\d)(Z|(([-+])(\\d\\d)(:(\\d\\d))? * @return normalized date representation * @exception SchemaDateTimeException Invalid lexical representation */	TokenNameCOMMENT_JAVADOC	 Parses, validates and computes normalized version of gDay object * @param str The lexical representation of gDay object ---DD with possible time zone Z or (-),(+)hh:mm Pattern: ---(\\d\\d)(Z|(([-+])(\\d\\d)(:(\\d\\d))? @return normalized date representation @exception SchemaDateTimeException Invalid lexical representation 
protected	TokenNameprotected	
DateTimeData	TokenNameIdentifier	 Date Time Data
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
throws	TokenNamethrows	
SchemaDateTimeException	TokenNameIdentifier	 Schema Date Time Exception
{	TokenNameLBRACE	
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
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'-'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'-'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SchemaDateTimeException	TokenNameIdentifier	 Schema Date Time Exception
(	TokenNameLPAREN	
"Error in day parsing"	TokenNameStringLiteral	Error in day parsing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//initialize values 	TokenNameCOMMENT_LINE	initialize values 
date	TokenNameIdentifier	 date
.	TokenNameDOT	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
YEAR	TokenNameIdentifier	 YEAR
;	TokenNameSEMICOLON	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
MONTH	TokenNameIdentifier	 MONTH
;	TokenNameSEMICOLON	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DAY_SIZE	TokenNameIdentifier	 DAY  SIZE
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isNextCharUTCSign	TokenNameIdentifier	 is Next Char UTC Sign
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
DAY_SIZE	TokenNameIdentifier	 DAY  SIZE
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SchemaDateTimeException	TokenNameIdentifier	 Schema Date Time Exception
(	TokenNameLPAREN	
"Error in day parsing"	TokenNameStringLiteral	Error in day parsing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
DAY_SIZE	TokenNameIdentifier	 DAY  SIZE
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//validate and normalize 	TokenNameCOMMENT_LINE	validate and normalize 
validateDateTime	TokenNameIdentifier	 validate Date Time
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//save unnormalized values 	TokenNameCOMMENT_LINE	save unnormalized values 
saveUnnormalized	TokenNameIdentifier	 save Unnormalized
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
!=	TokenNameNOT_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
date	TokenNameIdentifier	 date
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts gDay object representation to String * * @param date gDay object * @return lexical representation of gDay: ---DD with an optional time zone sign */	TokenNameCOMMENT_JAVADOC	 Converts gDay object representation to String * @param date gDay object @return lexical representation of gDay: ---DD with an optional time zone sign 
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
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
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
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
getXMLGregorianCalendar	TokenNameIdentifier	 get XML Gregorian Calendar
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
datatypeFactory	TokenNameIdentifier	 datatype Factory
.	TokenNameDOT	
newXMLGregorianCalendar	TokenNameIdentifier	 new XML Gregorian Calendar
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
unNormDay	TokenNameIdentifier	 un Norm Day
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
hasTimeZone	TokenNameIdentifier	 has Time Zone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
+	TokenNamePLUS	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
:	TokenNameCOLON	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
