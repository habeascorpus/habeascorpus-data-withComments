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
/** * Validator for &lt;dateTime&gt; datatype (W3C Schema Datatypes) * * @xerces.internal * * @author Elena Litani * @author Gopal Sharma, SUN Microsystem Inc. * * @version $Id: DateTimeDV.java 937741 2010-04-25 04:25:46Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Validator for &lt;dateTime&gt; datatype (W3C Schema Datatypes) * @xerces.internal * @author Elena Litani @author Gopal Sharma, SUN Microsystem Inc. * @version $Id: DateTimeDV.java 937741 2010-04-25 04:25:46Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DateTimeDV	TokenNameIdentifier	 Date Time DV
extends	TokenNameextends	
AbstractDateTimeDV	TokenNameIdentifier	 Abstract Date Time DV
{	TokenNameLBRACE	
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
"dateTime"	TokenNameStringLiteral	dateTime
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses, validates and computes normalized version of dateTime object * * @param str The lexical representation of dateTime object CCYY-MM-DDThh:mm:ss.sss * with possible time zone Z or (-),(+)hh:mm * @return normalized dateTime representation * @exception SchemaDateTimeException Invalid lexical representation */	TokenNameCOMMENT_JAVADOC	 Parses, validates and computes normalized version of dateTime object * @param str The lexical representation of dateTime object CCYY-MM-DDThh:mm:ss.sss with possible time zone Z or (-),(+)hh:mm @return normalized dateTime representation @exception SchemaDateTimeException Invalid lexical representation 
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
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
'T'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// both time and date 	TokenNameCOMMENT_LINE	both time and date 
int	TokenNameint	
dateEnd	TokenNameIdentifier	 date End
=	TokenNameEQUAL	
getDate	TokenNameIdentifier	 get Date
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Check the separator character between Date and Time 	TokenNameCOMMENT_LINE	Check the separator character between Date and Time 
if	TokenNameif	
(	TokenNameLPAREN	
dateEnd	TokenNameIdentifier	 date End
!=	TokenNameNOT_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
+	TokenNamePLUS	
" is an invalid dateTime dataype value. "	TokenNameStringLiteral	 is an invalid dateTime dataype value. 
+	TokenNamePLUS	
"Invalid character(s) seprating date and time values."	TokenNameStringLiteral	Invalid character(s) seprating date and time values.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//validate and normalize 	TokenNameCOMMENT_LINE	validate and normalize 
//REVISIT: do we need SchemaDateTimeException? 	TokenNameCOMMENT_LINE	REVISIT: do we need SchemaDateTimeException? 
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
return	TokenNamereturn	
date	TokenNameIdentifier	 date
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
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
unNormYear	TokenNameIdentifier	 un Norm Year
)	TokenNameRPAREN	
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
unNormMonth	TokenNameIdentifier	 un Norm Month
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
unNormDay	TokenNameIdentifier	 un Norm Day
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
unNormHour	TokenNameIdentifier	 un Norm Hour
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
unNormMinute	TokenNameIdentifier	 un Norm Minute
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
unNormSecond	TokenNameIdentifier	 un Norm Second
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
unNormSecond	TokenNameIdentifier	 un Norm Second
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
getFractionalSecondsAsBigDecimal	TokenNameIdentifier	 get Fractional Seconds As Big Decimal
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
hasTimeZone	TokenNameIdentifier	 has Time Zone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
+	TokenNamePLUS	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
)	TokenNameRPAREN	
:	TokenNameCOLON	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
