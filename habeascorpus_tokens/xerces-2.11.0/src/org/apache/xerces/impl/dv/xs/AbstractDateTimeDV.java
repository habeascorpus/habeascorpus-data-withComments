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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
datatype	TokenNameIdentifier	 datatype
.	TokenNameDOT	
DatatypeFactory	TokenNameIdentifier	 Datatype Factory
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
Constants	TokenNameIdentifier	 Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
jaxp	TokenNameIdentifier	 jaxp
.	TokenNameDOT	
datatype	TokenNameIdentifier	 datatype
.	TokenNameDOT	
DatatypeFactoryImpl	TokenNameIdentifier	 Datatype Factory Impl
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
XSDateTime	TokenNameIdentifier	 XS Date Time
;	TokenNameSEMICOLON	
/** * This is the base class of all date/time datatype validators. * It implements common code for parsing, validating and comparing datatypes. * Classes that extend this class, must implement parse() method. * * REVISIT: There are many instance variables, which would cause problems * when we support grammar caching. A grammar is possibly used by * two parser instances at the same time, then the same simple type * decl object can be used to validate two strings at the same time. * -SG * * @xerces.internal * * @author Elena Litani * @author Len Berman * @author Gopal Sharma, SUN Microsystems Inc. * * @version $Id: AbstractDateTimeDV.java 965250 2010-07-18 16:04:58Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This is the base class of all date/time datatype validators. It implements common code for parsing, validating and comparing datatypes. Classes that extend this class, must implement parse() method. * REVISIT: There are many instance variables, which would cause problems when we support grammar caching. A grammar is possibly used by two parser instances at the same time, then the same simple type decl object can be used to validate two strings at the same time. -SG * @xerces.internal * @author Elena Litani @author Len Berman @author Gopal Sharma, SUN Microsystems Inc. * @version $Id: AbstractDateTimeDV.java 965250 2010-07-18 16:04:58Z mrglavas $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractDateTimeDV	TokenNameIdentifier	 Abstract Date Time DV
extends	TokenNameextends	
TypeValidator	TokenNameIdentifier	 Type Validator
{	TokenNameLBRACE	
//debugging 	TokenNameCOMMENT_LINE	debugging 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//define shared variables for date/time 	TokenNameCOMMENT_LINE	define shared variables for date/time 
//define constants to be used in assigning default values for 	TokenNameCOMMENT_LINE	define constants to be used in assigning default values for 
//all date/time excluding duration 	TokenNameCOMMENT_LINE	all date/time excluding duration 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
YEAR	TokenNameIdentifier	 YEAR
=	TokenNameEQUAL	
2000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
MONTH	TokenNameIdentifier	 MONTH
=	TokenNameEQUAL	
01	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
DAY	TokenNameIdentifier	 DAY
=	TokenNameEQUAL	
01	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
DatatypeFactory	TokenNameIdentifier	 Datatype Factory
datatypeFactory	TokenNameIdentifier	 datatype Factory
=	TokenNameEQUAL	
new	TokenNamenew	
DatatypeFactoryImpl	TokenNameIdentifier	 Datatype Factory Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//getAllowedFacets() 	TokenNameCOMMENT_LINE	getAllowedFacets() 
// distinguishes between identity and equality for date/time values 	TokenNameCOMMENT_LINE	distinguishes between identity and equality for date/time values 
// ie: two values representing the same "moment in time" but with different 	TokenNameCOMMENT_LINE	ie: two values representing the same "moment in time" but with different 
// remembered timezones are now equal but not identical. 	TokenNameCOMMENT_LINE	remembered timezones are now equal but not identical. 
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
value1	TokenNameIdentifier	 value1
instanceof	TokenNameinstanceof	
DateTimeData	TokenNameIdentifier	 Date Time Data
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
value2	TokenNameIdentifier	 value2
instanceof	TokenNameinstanceof	
DateTimeData	TokenNameIdentifier	 Date Time Data
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DateTimeData	TokenNameIdentifier	 Date Time Data
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
)	TokenNameRPAREN	
value1	TokenNameIdentifier	 value1
;	TokenNameSEMICOLON	
DateTimeData	TokenNameIdentifier	 Date Time Data
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
)	TokenNameRPAREN	
value2	TokenNameIdentifier	 value2
;	TokenNameSEMICOLON	
// original timezones must be the same in addition to date/time values 	TokenNameCOMMENT_LINE	original timezones must be the same in addition to date/time values 
// being 'equal' 	TokenNameCOMMENT_LINE	being 'equal' 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
==	TokenNameEQUAL_EQUAL	
v2	TokenNameIdentifier	 v2
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
==	TokenNameEQUAL_EQUAL	
v2	TokenNameIdentifier	 v2
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//isIdentical() 	TokenNameCOMMENT_LINE	isIdentical() 
// the parameters are in compiled form (from getActualValue) 	TokenNameCOMMENT_LINE	the parameters are in compiled form (from getActualValue) 
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
compareDates	TokenNameIdentifier	 compare Dates
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
)	TokenNameRPAREN	
value1	TokenNameIdentifier	 value1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
)	TokenNameRPAREN	
value2	TokenNameIdentifier	 value2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//compare() 	TokenNameCOMMENT_LINE	compare() 
/** * Compare algorithm described in dateDime (3.2.7). * Duration datatype overwrites this method * * @param date1 normalized date representation of the first value * @param date2 normalized date representation of the second value * @param strict * @return less, greater, less_equal, greater_equal, equal */	TokenNameCOMMENT_JAVADOC	 Compare algorithm described in dateDime (3.2.7). Duration datatype overwrites this method * @param date1 normalized date representation of the first value @param date2 normalized date representation of the second value @param strict @return less, greater, less_equal, greater_equal, equal 
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
if	TokenNameif	
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
==	TokenNameEQUAL_EQUAL	
date2	TokenNameIdentifier	 date2
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compareOrder	TokenNameIdentifier	 compare Order
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
,	TokenNameCOMMA	
date2	TokenNameIdentifier	 date2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
short	TokenNameshort	
c1	TokenNameIdentifier	 c1
,	TokenNameCOMMA	
c2	TokenNameIdentifier	 c2
;	TokenNameSEMICOLON	
DateTimeData	TokenNameIdentifier	 Date Time Data
tempDate	TokenNameIdentifier	 temp Date
=	TokenNameEQUAL	
new	TokenNamenew	
DateTimeData	TokenNameIdentifier	 Date Time Data
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
==	TokenNameEQUAL_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//compare date1<=date1<=(date2 with time zone -14) 	TokenNameCOMMENT_LINE	compare date1<=date1<=(date2 with time zone -14) 
// 	TokenNameCOMMENT_LINE	 
cloneDate	TokenNameIdentifier	 clone Date
(	TokenNameLPAREN	
date2	TokenNameIdentifier	 date2
,	TokenNameCOMMA	
tempDate	TokenNameIdentifier	 temp Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//clones date1 value to global temporary storage: fTempDate 	TokenNameCOMMENT_LINE	clones date1 value to global temporary storage: fTempDate 
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
=	TokenNameEQUAL	
'+'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
tempDate	TokenNameIdentifier	 temp Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
compareOrder	TokenNameIdentifier	 compare Order
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
,	TokenNameCOMMA	
tempDate	TokenNameIdentifier	 temp Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
==	TokenNameEQUAL_EQUAL	
LESS_THAN	TokenNameIdentifier	 LESS  THAN
)	TokenNameRPAREN	
return	TokenNamereturn	
c1	TokenNameIdentifier	 c1
;	TokenNameSEMICOLON	
//compare date1>=(date2 with time zone +14) 	TokenNameCOMMENT_LINE	compare date1>=(date2 with time zone +14) 
// 	TokenNameCOMMENT_LINE	 
cloneDate	TokenNameIdentifier	 clone Date
(	TokenNameLPAREN	
date2	TokenNameIdentifier	 date2
,	TokenNameCOMMA	
tempDate	TokenNameIdentifier	 temp Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//clones date1 value to global temporary storage: tempDate 	TokenNameCOMMENT_LINE	clones date1 value to global temporary storage: tempDate 
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
=	TokenNameEQUAL	
-	TokenNameMINUS	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
=	TokenNameEQUAL	
'-'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
tempDate	TokenNameIdentifier	 temp Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
compareOrder	TokenNameIdentifier	 compare Order
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
,	TokenNameCOMMA	
tempDate	TokenNameIdentifier	 temp Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
==	TokenNameEQUAL_EQUAL	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
)	TokenNameRPAREN	
return	TokenNamereturn	
c2	TokenNameIdentifier	 c2
;	TokenNameSEMICOLON	
return	TokenNamereturn	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
date2	TokenNameIdentifier	 date2
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
==	TokenNameEQUAL_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//compare (date1 with time zone -14)<=date2 	TokenNameCOMMENT_LINE	compare (date1 with time zone -14)<=date2 
// 	TokenNameCOMMENT_LINE	 
cloneDate	TokenNameIdentifier	 clone Date
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
,	TokenNameCOMMA	
tempDate	TokenNameIdentifier	 temp Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//clones date1 value to global temporary storage: tempDate 	TokenNameCOMMENT_LINE	clones date1 value to global temporary storage: tempDate 
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
=	TokenNameEQUAL	
-	TokenNameMINUS	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
=	TokenNameEQUAL	
'-'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"tempDate="	TokenNameStringLiteral	tempDate=
+	TokenNamePLUS	
dateToString	TokenNameIdentifier	 date To String
(	TokenNameLPAREN	
tempDate	TokenNameIdentifier	 temp Date
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
tempDate	TokenNameIdentifier	 temp Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
compareOrder	TokenNameIdentifier	 compare Order
(	TokenNameLPAREN	
tempDate	TokenNameIdentifier	 temp Date
,	TokenNameCOMMA	
date2	TokenNameIdentifier	 date2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"date="	TokenNameStringLiteral	date=
+	TokenNamePLUS	
dateToString	TokenNameIdentifier	 date To String
(	TokenNameLPAREN	
date2	TokenNameIdentifier	 date2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"tempDate="	TokenNameStringLiteral	tempDate=
+	TokenNamePLUS	
dateToString	TokenNameIdentifier	 date To String
(	TokenNameLPAREN	
tempDate	TokenNameIdentifier	 temp Date
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
==	TokenNameEQUAL_EQUAL	
LESS_THAN	TokenNameIdentifier	 LESS  THAN
)	TokenNameRPAREN	
return	TokenNamereturn	
c1	TokenNameIdentifier	 c1
;	TokenNameSEMICOLON	
//compare (date1 with time zone +14)<=date2 	TokenNameCOMMENT_LINE	compare (date1 with time zone +14)<=date2 
// 	TokenNameCOMMENT_LINE	 
cloneDate	TokenNameIdentifier	 clone Date
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
,	TokenNameCOMMA	
tempDate	TokenNameIdentifier	 temp Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//clones date1 value to global temporary storage: tempDate 	TokenNameCOMMENT_LINE	clones date1 value to global temporary storage: tempDate 
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
=	TokenNameEQUAL	
'+'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
tempDate	TokenNameIdentifier	 temp Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
compareOrder	TokenNameIdentifier	 compare Order
(	TokenNameLPAREN	
tempDate	TokenNameIdentifier	 temp Date
,	TokenNameCOMMA	
date2	TokenNameIdentifier	 date2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"tempDate="	TokenNameStringLiteral	tempDate=
+	TokenNamePLUS	
dateToString	TokenNameIdentifier	 date To String
(	TokenNameLPAREN	
tempDate	TokenNameIdentifier	 temp Date
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
==	TokenNameEQUAL_EQUAL	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
)	TokenNameRPAREN	
return	TokenNamereturn	
c2	TokenNameIdentifier	 c2
;	TokenNameSEMICOLON	
return	TokenNamereturn	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given normalized values, determines order-relation * between give date/time objects. * * @param date1 date/time object * @param date2 date/time object * @return 0 if date1 and date2 are equal, a value less than 0 if date1 is less than date2, a value greater than 0 if date1 is greater than date2 */	TokenNameCOMMENT_JAVADOC	 Given normalized values, determines order-relation between give date/time objects. * @param date1 date/time object @param date2 date/time object @return 0 if date1 and date2 are equal, a value less than 0 if date1 is less than date2, a value greater than 0 if date1 is greater than date2 
protected	TokenNameprotected	
short	TokenNameshort	
compareOrder	TokenNameIdentifier	 compare Order
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
date1	TokenNameIdentifier	 date1
,	TokenNameCOMMA	
DateTimeData	TokenNameIdentifier	 Date Time Data
date2	TokenNameIdentifier	 date2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
.	TokenNameDOT	
year	TokenNameIdentifier	 year
<	TokenNameLESS	
date2	TokenNameIdentifier	 date2
.	TokenNameDOT	
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
.	TokenNameDOT	
year	TokenNameIdentifier	 year
>	TokenNameGREATER	
date2	TokenNameIdentifier	 date2
.	TokenNameDOT	
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
.	TokenNameDOT	
month	TokenNameIdentifier	 month
<	TokenNameLESS	
date2	TokenNameIdentifier	 date2
.	TokenNameDOT	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
.	TokenNameDOT	
month	TokenNameIdentifier	 month
>	TokenNameGREATER	
date2	TokenNameIdentifier	 date2
.	TokenNameDOT	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
.	TokenNameDOT	
day	TokenNameIdentifier	 day
<	TokenNameLESS	
date2	TokenNameIdentifier	 date2
.	TokenNameDOT	
day	TokenNameIdentifier	 day
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
.	TokenNameDOT	
day	TokenNameIdentifier	 day
>	TokenNameGREATER	
date2	TokenNameIdentifier	 date2
.	TokenNameDOT	
day	TokenNameIdentifier	 day
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
<	TokenNameLESS	
date2	TokenNameIdentifier	 date2
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
>	TokenNameGREATER	
date2	TokenNameIdentifier	 date2
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
<	TokenNameLESS	
date2	TokenNameIdentifier	 date2
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
>	TokenNameGREATER	
date2	TokenNameIdentifier	 date2
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
.	TokenNameDOT	
second	TokenNameIdentifier	 second
<	TokenNameLESS	
date2	TokenNameIdentifier	 date2
.	TokenNameDOT	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
.	TokenNameDOT	
second	TokenNameIdentifier	 second
>	TokenNameGREATER	
date2	TokenNameIdentifier	 date2
.	TokenNameDOT	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
<	TokenNameLESS	
date2	TokenNameIdentifier	 date2
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date1	TokenNameIdentifier	 date1
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
>	TokenNameGREATER	
date2	TokenNameIdentifier	 date2
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses time hh:mm:ss.sss and time zone if any * * @param start * @param end * @param data * @exception RuntimeException */	TokenNameCOMMENT_JAVADOC	 Parses time hh:mm:ss.sss and time zone if any * @param start @param end @param data @exception RuntimeException 
protected	TokenNameprotected	
void	TokenNamevoid	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
DateTimeData	TokenNameIdentifier	 Date Time Data
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
int	TokenNameint	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//get hours (hh) 	TokenNameCOMMENT_LINE	get hours (hh) 
data	TokenNameIdentifier	 data
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
=	TokenNameEQUAL	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//get minutes (mm) 	TokenNameCOMMENT_LINE	get minutes (mm) 
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
stop	TokenNameIdentifier	 stop
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Error in parsing time zone"	TokenNameStringLiteral	Error in parsing time zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
stop	TokenNameIdentifier	 stop
;	TokenNameSEMICOLON	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
stop	TokenNameIdentifier	 stop
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
=	TokenNameEQUAL	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//get seconds (ss) 	TokenNameCOMMENT_LINE	get seconds (ss) 
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
stop	TokenNameIdentifier	 stop
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Error in parsing time zone"	TokenNameStringLiteral	Error in parsing time zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//find UTC sign if any 	TokenNameCOMMENT_LINE	find UTC sign if any 
int	TokenNameint	
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
findUTCSign	TokenNameIdentifier	 find UTC Sign
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//get seconds (ms) 	TokenNameCOMMENT_LINE	get seconds (ms) 
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
stop	TokenNameIdentifier	 stop
;	TokenNameSEMICOLON	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
sign	TokenNameIdentifier	 sign
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
end	TokenNameIdentifier	 end
:	TokenNameCOLON	
sign	TokenNameIdentifier	 sign
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
second	TokenNameIdentifier	 second
=	TokenNameEQUAL	
parseSecond	TokenNameIdentifier	 parse Second
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//parse UTC time zone (hh:mm) 	TokenNameCOMMENT_LINE	parse UTC time zone (hh:mm) 
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
sign	TokenNameIdentifier	 sign
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses date CCYY-MM-DD * * @param buffer * @param start start position * @param end end position * @param date * @exception RuntimeException */	TokenNameCOMMENT_JAVADOC	 Parses date CCYY-MM-DD * @param buffer @param start start position @param end end position @param date @exception RuntimeException 
protected	TokenNameprotected	
int	TokenNameint	
getDate	TokenNameIdentifier	 get Date
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
DateTimeData	TokenNameIdentifier	 Date Time Data
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
throws	TokenNamethrows	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
getYearMonth	TokenNameIdentifier	 get Year Month
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"CCYY-MM must be followed by '-' sign"	TokenNameStringLiteral	CCYY-MM must be followed by '-' sign
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
stop	TokenNameIdentifier	 stop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses date CCYY-MM * * @param buffer * @param start start position * @param end end position * @param date * @exception RuntimeException */	TokenNameCOMMENT_JAVADOC	 Parses date CCYY-MM * @param buffer @param start start position @param end end position @param date @exception RuntimeException 
protected	TokenNameprotected	
int	TokenNameint	
getYearMonth	TokenNameIdentifier	 get Year Month
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
DateTimeData	TokenNameIdentifier	 Date Time Data
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
throws	TokenNamethrows	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: date starts with preceding '-' sign 	TokenNameCOMMENT_LINE	REVISIT: date starts with preceding '-' sign 
// do we have to do anything with it? 	TokenNameCOMMENT_LINE	do we have to do anything with it? 
// 	TokenNameCOMMENT_LINE	 
start	TokenNameIdentifier	 start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Year separator is missing or misplaced"	TokenNameStringLiteral	Year separator is missing or misplaced
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Year must have 'CCYY' format"	TokenNameStringLiteral	Year must have 'CCYY' format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
4	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Leading zeros are required if the year value would otherwise have fewer than four digits; otherwise they are forbidden"	TokenNameStringLiteral	Leading zeros are required if the year value would otherwise have fewer than four digits; otherwise they are forbidden
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
parseIntYear	TokenNameIdentifier	 parse Int Year
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"CCYY must be followed by '-' sign"	TokenNameStringLiteral	CCYY must be followed by '-' sign
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
//fStart points right after the MONTH 	TokenNameCOMMENT_LINE	fStart points right after the MONTH 
}	TokenNameRBRACE	
/** * Shared code from Date and YearMonth datatypes. * Finds if time zone sign is present * * @param end * @param date * @exception RuntimeException */	TokenNameCOMMENT_JAVADOC	 Shared code from Date and YearMonth datatypes. Finds if time zone sign is present * @param end @param date @exception RuntimeException 
protected	TokenNameprotected	
void	TokenNamevoid	
parseTimeZone	TokenNameIdentifier	 parse Time Zone
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
DateTimeData	TokenNameIdentifier	 Date Time Data
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
throws	TokenNamethrows	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
//fStart points right after the date 	TokenNameCOMMENT_LINE	fStart points right after the date 
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isNextCharUTCSign	TokenNameIdentifier	 is Next Char UTC Sign
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Error in month parsing"	TokenNameStringLiteral	Error in month parsing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses time zone: 'Z' or {+,-} followed by hh:mm * * @param data * @param sign * @exception RuntimeException */	TokenNameCOMMENT_JAVADOC	 Parses time zone: 'Z' or {+,-} followed by hh:mm * @param data @param sign @exception RuntimeException 
protected	TokenNameprotected	
void	TokenNamevoid	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
DateTimeData	TokenNameIdentifier	 Date Time Data
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
sign	TokenNameIdentifier	 sign
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
throws	TokenNamethrows	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
>	TokenNameGREATER	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
sign	TokenNameIdentifier	 sign
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Error in parsing time zone"	TokenNameStringLiteral	Error in parsing time zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
negate	TokenNameIdentifier	 negate
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//parse hr 	TokenNameCOMMENT_LINE	parse hr 
int	TokenNameint	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
++	TokenNamePLUS_PLUS	
sign	TokenNameIdentifier	 sign
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
=	TokenNameEQUAL	
negate	TokenNameIdentifier	 negate
*	TokenNameMULTIPLY	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
sign	TokenNameIdentifier	 sign
,	TokenNameCOMMA	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
stop	TokenNameIdentifier	 stop
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Error in parsing time zone"	TokenNameStringLiteral	Error in parsing time zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//parse min 	TokenNameCOMMENT_LINE	parse min 
data	TokenNameIdentifier	 data
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
=	TokenNameEQUAL	
negate	TokenNameIdentifier	 negate
*	TokenNameMULTIPLY	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
stop	TokenNameIdentifier	 stop
,	TokenNameCOMMA	
stop	TokenNameIdentifier	 stop
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stop	TokenNameIdentifier	 stop
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Error in parsing time zone"	TokenNameStringLiteral	Error in parsing time zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
normalized	TokenNameIdentifier	 normalized
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Error in parsing time zone"	TokenNameStringLiteral	Error in parsing time zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"time[hh]="	TokenNameStringLiteral	time[hh]=
+	TokenNamePLUS	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
+	TokenNamePLUS	
" time[mm]="	TokenNameStringLiteral	 time[mm]=
+	TokenNamePLUS	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Computes index of given char within StringBuffer * * @param start * @param end * @param ch character to look for in StringBuffer * @return index of ch within StringBuffer */	TokenNameCOMMENT_JAVADOC	 Computes index of given char within StringBuffer * @param start @param end @param ch character to look for in StringBuffer @return index of ch within StringBuffer 
protected	TokenNameprotected	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Validates given date/time object accoring to W3C PR Schema * [D.1 ISO 8601 Conventions] * * @param data */	TokenNameCOMMENT_JAVADOC	 Validates given date/time object accoring to W3C PR Schema [D.1 ISO 8601 Conventions] * @param data 
protected	TokenNameprotected	
void	TokenNamevoid	
validateDateTime	TokenNameIdentifier	 validate Date Time
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//REVISIT: should we throw an exception for not valid dates 	TokenNameCOMMENT_LINE	REVISIT: should we throw an exception for not valid dates 
// or reporting an error message should be sufficient? 	TokenNameCOMMENT_LINE	or reporting an error message should be sufficient? 
/** * XML Schema 1.1 - RQ-123: Allow year 0000 in date related types. */	TokenNameCOMMENT_JAVADOC	 XML Schema 1.1 - RQ-123: Allow year 0000 in date related types. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_1_1_SUPPORT	TokenNameIdentifier	 SCHEMA 1 1  SUPPORT
&&	TokenNameAND_AND	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
year	TokenNameIdentifier	 year
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"The year "0000" is an illegal year value"	TokenNameStringLiteral	The year "0000" is an illegal year value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
month	TokenNameIdentifier	 month
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
month	TokenNameIdentifier	 month
>	TokenNameGREATER	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"The month must have values 1 to 12"	TokenNameStringLiteral	The month must have values 1 to 12
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//validate days 	TokenNameCOMMENT_LINE	validate days 
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
day	TokenNameIdentifier	 day
>	TokenNameGREATER	
maxDayInMonthFor	TokenNameIdentifier	 max Day In Month For
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
||	TokenNameOR_OR	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
day	TokenNameIdentifier	 day
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"The day must have values 1 to 31"	TokenNameStringLiteral	The day must have values 1 to 31
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//validate hours 	TokenNameCOMMENT_LINE	validate hours 
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
>	TokenNameGREATER	
23	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
==	TokenNameEQUAL_EQUAL	
24	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
second	TokenNameIdentifier	 second
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
day	TokenNameIdentifier	 day
>	TokenNameGREATER	
maxDayInMonthFor	TokenNameIdentifier	 max Day In Month For
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
month	TokenNameIdentifier	 month
>	TokenNameGREATER	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_1_1_SUPPORT	TokenNameIdentifier	 SCHEMA 1 1  SUPPORT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
year	TokenNameIdentifier	 year
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
year	TokenNameIdentifier	 year
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Hour must have values 0-23, unless 24:00:00"	TokenNameStringLiteral	Hour must have values 0-23, unless 24:00:00
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//validate 	TokenNameCOMMENT_LINE	validate 
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
>	TokenNameGREATER	
59	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Minute must have values 0-59"	TokenNameStringLiteral	Minute must have values 0-59
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//validate 	TokenNameCOMMENT_LINE	validate 
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
second	TokenNameIdentifier	 second
>=	TokenNameGREATER_EQUAL	
60	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
second	TokenNameIdentifier	 second
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Second must have values 0-59"	TokenNameStringLiteral	Second must have values 0-59
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//validate 	TokenNameCOMMENT_LINE	validate 
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
>	TokenNameGREATER	
14	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
<	TokenNameLESS	
-	TokenNameMINUS	
14	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Time zone should have range -14:00 to +14:00"	TokenNameStringLiteral	Time zone should have range -14:00 to +14:00
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
==	TokenNameEQUAL_EQUAL	
14	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
14	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Time zone should have range -14:00 to +14:00"	TokenNameStringLiteral	Time zone should have range -14:00 to +14:00
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
>	TokenNameGREATER	
59	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
<	TokenNameLESS	
-	TokenNameMINUS	
59	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Minute must have values 0-59"	TokenNameStringLiteral	Minute must have values 0-59
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return index of UTC char: 'Z', '+', '-' * * @param start * @param end * @return index of the UTC character that was found */	TokenNameCOMMENT_JAVADOC	 Return index of UTC char: 'Z', '+', '-' * @param start @param end @return index of the UTC character that was found 
protected	TokenNameprotected	
int	TokenNameint	
findUTCSign	TokenNameIdentifier	 find UTC Sign
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
{	TokenNameLBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
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
c	TokenNameIdentifier	 c
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
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'Z'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'+'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>true</code> if the character at start is 'Z', '+' or '-'. */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if the character at start is 'Z', '+' or '-'. 
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
isNextCharUTCSign	TokenNameIdentifier	 is Next Char UTC Sign
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'Z'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'+'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given start and end position, parses string value * * @param buffer string to parse * @param start start position * @param end end position * @return return integer representation of characters */	TokenNameCOMMENT_JAVADOC	 Given start and end position, parses string value * @param buffer string to parse @param start start position @param end end position @return return integer representation of characters 
protected	TokenNameprotected	
int	TokenNameint	
parseInt	TokenNameIdentifier	 parse Int
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
//REVISIT: more testing on this parsing needs to be done. 	TokenNameCOMMENT_LINE	REVISIT: more testing on this parsing needs to be done. 
int	TokenNameint	
radix	TokenNameIdentifier	 radix
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
digit	TokenNameIdentifier	 digit
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
-	TokenNameMINUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
int	TokenNameint	
multmin	TokenNameIdentifier	 multmin
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
/	TokenNameDIVIDE	
radix	TokenNameIdentifier	 radix
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
digit	TokenNameIdentifier	 digit
=	TokenNameEQUAL	
getDigit	TokenNameIdentifier	 get Digit
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
digit	TokenNameIdentifier	 digit
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
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
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
<	TokenNameLESS	
multmin	TokenNameIdentifier	 multmin
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
result	TokenNameIdentifier	 result
*=	TokenNameMULTIPLY_EQUAL	
radix	TokenNameIdentifier	 radix
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
<	TokenNameLESS	
limit	TokenNameIdentifier	 limit
+	TokenNamePLUS	
digit	TokenNameIdentifier	 digit
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
result	TokenNameIdentifier	 result
-=	TokenNameMINUS_EQUAL	
digit	TokenNameIdentifier	 digit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// parse Year differently to support negative value. 	TokenNameCOMMENT_LINE	parse Year differently to support negative value. 
protected	TokenNameprotected	
int	TokenNameint	
parseIntYear	TokenNameIdentifier	 parse Int Year
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
radix	TokenNameIdentifier	 radix
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
negative	TokenNameIdentifier	 negative
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
int	TokenNameint	
multmin	TokenNameIdentifier	 multmin
;	TokenNameSEMICOLON	
int	TokenNameint	
digit	TokenNameIdentifier	 digit
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
negative	TokenNameIdentifier	 negative
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
-	TokenNameMINUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
multmin	TokenNameIdentifier	 multmin
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
/	TokenNameDIVIDE	
radix	TokenNameIdentifier	 radix
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
digit	TokenNameIdentifier	 digit
=	TokenNameEQUAL	
getDigit	TokenNameIdentifier	 get Digit
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
digit	TokenNameIdentifier	 digit
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
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
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
<	TokenNameLESS	
multmin	TokenNameIdentifier	 multmin
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
result	TokenNameIdentifier	 result
*=	TokenNameMULTIPLY_EQUAL	
radix	TokenNameIdentifier	 radix
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
<	TokenNameLESS	
limit	TokenNameIdentifier	 limit
+	TokenNamePLUS	
digit	TokenNameIdentifier	 digit
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
result	TokenNameIdentifier	 result
-=	TokenNameMINUS_EQUAL	
digit	TokenNameIdentifier	 digit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
negative	TokenNameIdentifier	 negative
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
else	TokenNameelse	
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
-	TokenNameMINUS	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If timezone present - normalize dateTime [E Adding durations to dateTimes] * * @param date CCYY-MM-DDThh:mm:ss+03 */	TokenNameCOMMENT_JAVADOC	 If timezone present - normalize dateTime [E Adding durations to dateTimes] * @param date CCYY-MM-DDThh:mm:ss+03 
protected	TokenNameprotected	
void	TokenNamevoid	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: we have common code in addDuration() for durations 	TokenNameCOMMENT_LINE	REVISIT: we have common code in addDuration() for durations 
// should consider reorganizing it. 	TokenNameCOMMENT_LINE	should consider reorganizing it. 
// 	TokenNameCOMMENT_LINE	 
//add minutes (from time zone) 	TokenNameCOMMENT_LINE	add minutes (from time zone) 
int	TokenNameint	
negate	TokenNameIdentifier	 negate
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>date.minute"	TokenNameStringLiteral	==>date.minute
+	TokenNamePLUS	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>date.timezoneMin"	TokenNameStringLiteral	==>date.timezoneMin
+	TokenNamePLUS	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
+	TokenNamePLUS	
negate	TokenNameIdentifier	 negate
*	TokenNameMULTIPLY	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
;	TokenNameSEMICOLON	
int	TokenNameint	
carry	TokenNameIdentifier	 carry
=	TokenNameEQUAL	
fQuotient	TokenNameIdentifier	 f Quotient
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
60	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
date	TokenNameIdentifier	 date
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
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>carry: "	TokenNameStringLiteral	==>carry: 
+	TokenNamePLUS	
carry	TokenNameIdentifier	 carry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//add hours 	TokenNameCOMMENT_LINE	add hours 
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
+	TokenNamePLUS	
negate	TokenNameIdentifier	 negate
*	TokenNameMULTIPLY	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
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
date	TokenNameIdentifier	 date
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
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>date.hour"	TokenNameStringLiteral	==>date.hour
+	TokenNamePLUS	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"==>carry: "	TokenNameStringLiteral	==>carry: 
+	TokenNamePLUS	
carry	TokenNameIdentifier	 carry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
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
date	TokenNameIdentifier	 date
.	TokenNameDOT	
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
+	TokenNamePLUS	
maxDayInMonthFor	TokenNameIdentifier	 max Day In Month For
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
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
date	TokenNameIdentifier	 date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
>	TokenNameGREATER	
temp	TokenNameIdentifier	 temp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
date	TokenNameIdentifier	 date
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
date	TokenNameIdentifier	 date
.	TokenNameDOT	
month	TokenNameIdentifier	 month
+	TokenNamePLUS	
carry	TokenNameIdentifier	 carry
;	TokenNameSEMICOLON	
date	TokenNameIdentifier	 date
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
date	TokenNameIdentifier	 date
.	TokenNameDOT	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
date	TokenNameIdentifier	 date
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
if	TokenNameif	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
year	TokenNameIdentifier	 year
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_1_1_SUPPORT	TokenNameIdentifier	 SCHEMA 1 1  SUPPORT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
=	TokenNameEQUAL	
'Z'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param date */	TokenNameCOMMENT_JAVADOC	 @param date 
protected	TokenNameprotected	
void	TokenNamevoid	
saveUnnormalized	TokenNameIdentifier	 save Unnormalized
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
unNormYear	TokenNameIdentifier	 un Norm Year
=	TokenNameEQUAL	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
year	TokenNameIdentifier	 year
;	TokenNameSEMICOLON	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
unNormMonth	TokenNameIdentifier	 un Norm Month
=	TokenNameEQUAL	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
month	TokenNameIdentifier	 month
;	TokenNameSEMICOLON	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
unNormDay	TokenNameIdentifier	 un Norm Day
=	TokenNameEQUAL	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
;	TokenNameSEMICOLON	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
unNormHour	TokenNameIdentifier	 un Norm Hour
=	TokenNameEQUAL	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
;	TokenNameSEMICOLON	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
unNormMinute	TokenNameIdentifier	 un Norm Minute
=	TokenNameEQUAL	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
;	TokenNameSEMICOLON	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
unNormSecond	TokenNameIdentifier	 un Norm Second
=	TokenNameEQUAL	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
second	TokenNameIdentifier	 second
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets object representation of date/time * * @param data date/time object */	TokenNameCOMMENT_JAVADOC	 Resets object representation of date/time * @param data date/time object 
protected	TokenNameprotected	
void	TokenNamevoid	
resetDateObj	TokenNameIdentifier	 reset Date Obj
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
second	TokenNameIdentifier	 second
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given {year,month} computes maximum * number of days for given month * * @param year * @param month * @return integer containg the number of days in a given month */	TokenNameCOMMENT_JAVADOC	 Given {year,month} computes maximum number of days for given month * @param year @param month @return integer containg the number of days in a given month 
protected	TokenNameprotected	
int	TokenNameint	
maxDayInMonthFor	TokenNameIdentifier	 max Day In Month For
(	TokenNameLPAREN	
int	TokenNameint	
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
int	TokenNameint	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//validate days 	TokenNameCOMMENT_LINE	validate days 
if	TokenNameif	
(	TokenNameLPAREN	
month	TokenNameIdentifier	 month
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
month	TokenNameIdentifier	 month
==	TokenNameEQUAL_EQUAL	
6	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
month	TokenNameIdentifier	 month
==	TokenNameEQUAL_EQUAL	
9	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
month	TokenNameIdentifier	 month
==	TokenNameEQUAL_EQUAL	
11	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
month	TokenNameIdentifier	 month
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isLeapYear	TokenNameIdentifier	 is Leap Year
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
29	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
28	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
isLeapYear	TokenNameIdentifier	 is Leap Year
(	TokenNameLPAREN	
int	TokenNameint	
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//REVISIT: should we take care about Julian calendar? 	TokenNameCOMMENT_LINE	REVISIT: should we take care about Julian calendar? 
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
%	TokenNameREMAINDER	
4	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
%	TokenNameREMAINDER	
100	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
%	TokenNameREMAINDER	
400	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// help function described in W3C PR Schema [E Adding durations to dateTimes] 	TokenNameCOMMENT_LINE	help function described in W3C PR Schema [E Adding durations to dateTimes] 
// 	TokenNameCOMMENT_LINE	 
protected	TokenNameprotected	
int	TokenNameint	
mod	TokenNameIdentifier	 mod
(	TokenNameLPAREN	
int	TokenNameint	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
quotient	TokenNameIdentifier	 quotient
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//modulo(a, b) = a - fQuotient(a,b)*b 	TokenNameCOMMENT_LINE	modulo(a, b) = a - fQuotient(a,b)*b 
return	TokenNamereturn	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
-	TokenNameMINUS	
quotient	TokenNameIdentifier	 quotient
*	TokenNameMULTIPLY	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// help function described in W3C PR Schema [E Adding durations to dateTimes] 	TokenNameCOMMENT_LINE	help function described in W3C PR Schema [E Adding durations to dateTimes] 
// 	TokenNameCOMMENT_LINE	 
protected	TokenNameprotected	
int	TokenNameint	
fQuotient	TokenNameIdentifier	 f Quotient
(	TokenNameLPAREN	
int	TokenNameint	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//fQuotient(a, b) = the greatest integer less than or equal to a/b 	TokenNameCOMMENT_LINE	fQuotient(a, b) = the greatest integer less than or equal to a/b 
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
/	TokenNameDIVIDE	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// help function described in W3C PR Schema [E Adding durations to dateTimes] 	TokenNameCOMMENT_LINE	help function described in W3C PR Schema [E Adding durations to dateTimes] 
// 	TokenNameCOMMENT_LINE	 
protected	TokenNameprotected	
int	TokenNameint	
modulo	TokenNameIdentifier	 modulo
(	TokenNameLPAREN	
int	TokenNameint	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
int	TokenNameint	
low	TokenNameIdentifier	 low
,	TokenNameCOMMA	
int	TokenNameint	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//modulo(a - low, high - low) + low 	TokenNameCOMMENT_LINE	modulo(a - low, high - low) + low 
int	TokenNameint	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
-	TokenNameMINUS	
low	TokenNameIdentifier	 low
;	TokenNameSEMICOLON	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
high	TokenNameIdentifier	 high
-	TokenNameMINUS	
low	TokenNameIdentifier	 low
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
mod	TokenNameIdentifier	 mod
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
fQuotient	TokenNameIdentifier	 f Quotient
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// help function described in W3C PR Schema [E Adding durations to dateTimes] 	TokenNameCOMMENT_LINE	help function described in W3C PR Schema [E Adding durations to dateTimes] 
// 	TokenNameCOMMENT_LINE	 
protected	TokenNameprotected	
int	TokenNameint	
fQuotient	TokenNameIdentifier	 f Quotient
(	TokenNameLPAREN	
int	TokenNameint	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
int	TokenNameint	
low	TokenNameIdentifier	 low
,	TokenNameCOMMA	
int	TokenNameint	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//fQuotient(a - low, high - low) 	TokenNameCOMMENT_LINE	fQuotient(a - low, high - low) 
return	TokenNamereturn	
fQuotient	TokenNameIdentifier	 f Quotient
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
-	TokenNameMINUS	
low	TokenNameIdentifier	 low
,	TokenNameCOMMA	
high	TokenNameIdentifier	 high
-	TokenNameMINUS	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
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
25	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
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
month	TokenNameIdentifier	 month
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
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
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'T'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
second	TokenNameIdentifier	 second
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
final	TokenNamefinal	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
int	TokenNameint	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
nch	TokenNameIdentifier	 nch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
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
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
-	TokenNameMINUS	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nch	TokenNameIdentifier	 nch
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"000"	TokenNameStringLiteral	000
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<	TokenNameLESS	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"00"	TokenNameStringLiteral	00
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<	TokenNameLESS	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nch	TokenNameIdentifier	 nch
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
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
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
-	TokenNameMINUS	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
append2	TokenNameIdentifier	 append2
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
append2	TokenNameIdentifier	 append2
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
intValue	TokenNameIdentifier	 int Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
intValue	TokenNameIdentifier	 int Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
intValue	TokenNameIdentifier	 int Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
append3	TokenNameIdentifier	 append3
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
append3	TokenNameIdentifier	 append3
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
eIndex	TokenNameIdentifier	 e Index
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'E'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eIndex	TokenNameIdentifier	 e Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Need to convert from scientific notation of the form 	TokenNameCOMMENT_LINE	Need to convert from scientific notation of the form 
// n.nnn...E-N (N >= 4) to a normal decimal value. 	TokenNameCOMMENT_LINE	n.nnn...E-N (N >= 4) to a normal decimal value. 
try	TokenNametry	
{	TokenNameLBRACE	
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
eIndex	TokenNameIdentifier	 e Index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This should never happen. 	TokenNameCOMMENT_LINE	This should never happen. 
// It's only possible if String.valueOf(double) is broken. 	TokenNameCOMMENT_LINE	It's only possible if String.valueOf(double) is broken. 
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"0."	TokenNameStringLiteral	0.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Remove trailing zeros. 	TokenNameCOMMENT_LINE	Remove trailing zeros. 
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
eIndex	TokenNameIdentifier	 e Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
--	TokenNameMINUS_MINUS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now append the digits to the end. Skip over the decimal point. 	TokenNameCOMMENT_LINE	Now append the digits to the end. Skip over the decimal point. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Need to convert from scientific notation of the form 	TokenNameCOMMENT_LINE	Need to convert from scientific notation of the form 
// n.nnn...EN (N >= 7) to a normal decimal value. 	TokenNameCOMMENT_LINE	n.nnn...EN (N >= 7) to a normal decimal value. 
try	TokenNametry	
{	TokenNameLBRACE	
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
eIndex	TokenNameIdentifier	 e Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This should never happen. 	TokenNameCOMMENT_LINE	This should never happen. 
// It's only possible if String.valueOf(double) is broken. 	TokenNameCOMMENT_LINE	It's only possible if String.valueOf(double) is broken. 
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
integerEnd	TokenNameIdentifier	 integer End
=	TokenNameEQUAL	
exp	TokenNameIdentifier	 exp
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
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
eIndex	TokenNameIdentifier	 e Index
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
integerEnd	TokenNameIdentifier	 integer End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Append trailing zeroes if necessary. 	TokenNameCOMMENT_LINE	Append trailing zeroes if necessary. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
integerEnd	TokenNameIdentifier	 integer End
-	TokenNameMINUS	
eIndex	TokenNameIdentifier	 e Index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
end	TokenNameIdentifier	 end
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
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
dot	TokenNameIdentifier	 dot
||	TokenNameOR_OR	
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
return	TokenNamereturn	
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
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
//Private help functions 	TokenNameCOMMENT_LINE	Private help functions 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
void	TokenNamevoid	
cloneDate	TokenNameIdentifier	 clone Date
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
finalValue	TokenNameIdentifier	 final Value
,	TokenNameCOMMA	
DateTimeData	TokenNameIdentifier	 Date Time Data
tempDate	TokenNameIdentifier	 temp Date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
finalValue	TokenNameIdentifier	 final Value
.	TokenNameDOT	
year	TokenNameIdentifier	 year
;	TokenNameSEMICOLON	
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
finalValue	TokenNameIdentifier	 final Value
.	TokenNameDOT	
month	TokenNameIdentifier	 month
;	TokenNameSEMICOLON	
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
finalValue	TokenNameIdentifier	 final Value
.	TokenNameDOT	
day	TokenNameIdentifier	 day
;	TokenNameSEMICOLON	
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
=	TokenNameEQUAL	
finalValue	TokenNameIdentifier	 final Value
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
;	TokenNameSEMICOLON	
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
=	TokenNameEQUAL	
finalValue	TokenNameIdentifier	 final Value
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
;	TokenNameSEMICOLON	
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
second	TokenNameIdentifier	 second
=	TokenNameEQUAL	
finalValue	TokenNameIdentifier	 final Value
.	TokenNameDOT	
second	TokenNameIdentifier	 second
;	TokenNameSEMICOLON	
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
=	TokenNameEQUAL	
finalValue	TokenNameIdentifier	 final Value
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
;	TokenNameSEMICOLON	
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
=	TokenNameEQUAL	
finalValue	TokenNameIdentifier	 final Value
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
;	TokenNameSEMICOLON	
tempDate	TokenNameIdentifier	 temp Date
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
=	TokenNameEQUAL	
finalValue	TokenNameIdentifier	 final Value
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Represents date time data */	TokenNameCOMMENT_JAVADOC	 Represents date time data 
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
DateTimeData	TokenNameIdentifier	 Date Time Data
implements	TokenNameimplements	
XSDateTime	TokenNameIdentifier	 XS Date Time
{	TokenNameLBRACE	
int	TokenNameint	
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
month	TokenNameIdentifier	 month
,	TokenNameCOMMA	
day	TokenNameIdentifier	 day
,	TokenNameCOMMA	
hour	TokenNameIdentifier	 hour
,	TokenNameCOMMA	
minute	TokenNameIdentifier	 minute
,	TokenNameCOMMA	
utc	TokenNameIdentifier	 utc
;	TokenNameSEMICOLON	
double	TokenNamedouble	
second	TokenNameIdentifier	 second
;	TokenNameSEMICOLON	
int	TokenNameint	
timezoneHr	TokenNameIdentifier	 timezone Hr
,	TokenNameCOMMA	
timezoneMin	TokenNameIdentifier	 timezone Min
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
originalValue	TokenNameIdentifier	 original Value
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
normalized	TokenNameIdentifier	 normalized
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
int	TokenNameint	
unNormYear	TokenNameIdentifier	 un Norm Year
;	TokenNameSEMICOLON	
int	TokenNameint	
unNormMonth	TokenNameIdentifier	 un Norm Month
;	TokenNameSEMICOLON	
int	TokenNameint	
unNormDay	TokenNameIdentifier	 un Norm Day
;	TokenNameSEMICOLON	
int	TokenNameint	
unNormHour	TokenNameIdentifier	 un Norm Hour
;	TokenNameSEMICOLON	
int	TokenNameint	
unNormMinute	TokenNameIdentifier	 un Norm Minute
;	TokenNameSEMICOLON	
double	TokenNamedouble	
unNormSecond	TokenNameIdentifier	 un Norm Second
;	TokenNameSEMICOLON	
// used for comparisons - to decide the 'interesting' portions of 	TokenNameCOMMENT_LINE	used for comparisons - to decide the 'interesting' portions of 
// a date/time based data type. 	TokenNameCOMMENT_LINE	a date/time based data type. 
int	TokenNameint	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
// a pointer to the type that was used go generate this data 	TokenNameCOMMENT_LINE	a pointer to the type that was used go generate this data 
// note that this is not the actual simple type, but one of the 	TokenNameCOMMENT_LINE	note that this is not the actual simple type, but one of the 
// statically created XXXDV objects, so this won't cause any GC problem. 	TokenNameCOMMENT_LINE	statically created XXXDV objects, so this won't cause any GC problem. 
final	TokenNamefinal	
AbstractDateTimeDV	TokenNameIdentifier	 Abstract Date Time DV
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
canonical	TokenNameIdentifier	 canonical
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DateTimeData	TokenNameIdentifier	 Date Time Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
originalValue	TokenNameIdentifier	 original Value
,	TokenNameCOMMA	
AbstractDateTimeDV	TokenNameIdentifier	 Abstract Date Time DV
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
originalValue	TokenNameIdentifier	 original Value
=	TokenNameEQUAL	
originalValue	TokenNameIdentifier	 original Value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DateTimeData	TokenNameIdentifier	 Date Time Data
(	TokenNameLPAREN	
int	TokenNameint	
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
int	TokenNameint	
month	TokenNameIdentifier	 month
,	TokenNameCOMMA	
int	TokenNameint	
day	TokenNameIdentifier	 day
,	TokenNameCOMMA	
int	TokenNameint	
hour	TokenNameIdentifier	 hour
,	TokenNameCOMMA	
int	TokenNameint	
minute	TokenNameIdentifier	 minute
,	TokenNameCOMMA	
double	TokenNamedouble	
second	TokenNameIdentifier	 second
,	TokenNameCOMMA	
int	TokenNameint	
utc	TokenNameIdentifier	 utc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
originalValue	TokenNameIdentifier	 original Value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
normalized	TokenNameIdentifier	 normalized
,	TokenNameCOMMA	
AbstractDateTimeDV	TokenNameIdentifier	 Abstract Date Time DV
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
year	TokenNameIdentifier	 year
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
month	TokenNameIdentifier	 month
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
day	TokenNameIdentifier	 day
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
=	TokenNameEQUAL	
hour	TokenNameIdentifier	 hour
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
=	TokenNameEQUAL	
minute	TokenNameIdentifier	 minute
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
second	TokenNameIdentifier	 second
=	TokenNameEQUAL	
second	TokenNameIdentifier	 second
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
=	TokenNameEQUAL	
utc	TokenNameIdentifier	 utc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
originalValue	TokenNameIdentifier	 original Value
=	TokenNameEQUAL	
originalValue	TokenNameIdentifier	 original Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
DateTimeData	TokenNameIdentifier	 Date Time Data
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
compareDates	TokenNameIdentifier	 compare Dates
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
canonical	TokenNameIdentifier	 canonical
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
dateToString	TokenNameIdentifier	 date To String
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
canonical	TokenNameIdentifier	 canonical
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xs.datatypes.XSDateTime#getYear() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xs.datatypes.XSDateTime#getYear() 
public	TokenNamepublic	
int	TokenNameint	
getYears	TokenNameIdentifier	 get Years
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
instanceof	TokenNameinstanceof	
DurationDV	TokenNameIdentifier	 Duration DV
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
normalized	TokenNameIdentifier	 normalized
?	TokenNameQUESTION	
year	TokenNameIdentifier	 year
:	TokenNameCOLON	
unNormYear	TokenNameIdentifier	 un Norm Year
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xs.datatypes.XSDateTime#getMonth() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xs.datatypes.XSDateTime#getMonth() 
public	TokenNamepublic	
int	TokenNameint	
getMonths	TokenNameIdentifier	 get Months
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
instanceof	TokenNameinstanceof	
DurationDV	TokenNameIdentifier	 Duration DV
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
year	TokenNameIdentifier	 year
*	TokenNameMULTIPLY	
12	TokenNameIntegerLiteral	
+	TokenNamePLUS	
month	TokenNameIdentifier	 month
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
normalized	TokenNameIdentifier	 normalized
?	TokenNameQUESTION	
month	TokenNameIdentifier	 month
:	TokenNameCOLON	
unNormMonth	TokenNameIdentifier	 un Norm Month
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xs.datatypes.XSDateTime#getDay() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xs.datatypes.XSDateTime#getDay() 
public	TokenNamepublic	
int	TokenNameint	
getDays	TokenNameIdentifier	 get Days
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
instanceof	TokenNameinstanceof	
DurationDV	TokenNameIdentifier	 Duration DV
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
normalized	TokenNameIdentifier	 normalized
?	TokenNameQUESTION	
day	TokenNameIdentifier	 day
:	TokenNameCOLON	
unNormDay	TokenNameIdentifier	 un Norm Day
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xs.datatypes.XSDateTime#getHour() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xs.datatypes.XSDateTime#getHour() 
public	TokenNamepublic	
int	TokenNameint	
getHours	TokenNameIdentifier	 get Hours
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
instanceof	TokenNameinstanceof	
DurationDV	TokenNameIdentifier	 Duration DV
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
normalized	TokenNameIdentifier	 normalized
?	TokenNameQUESTION	
hour	TokenNameIdentifier	 hour
:	TokenNameCOLON	
unNormHour	TokenNameIdentifier	 un Norm Hour
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xs.datatypes.XSDateTime#getMinutes() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xs.datatypes.XSDateTime#getMinutes() 
public	TokenNamepublic	
int	TokenNameint	
getMinutes	TokenNameIdentifier	 get Minutes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
instanceof	TokenNameinstanceof	
DurationDV	TokenNameIdentifier	 Duration DV
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
normalized	TokenNameIdentifier	 normalized
?	TokenNameQUESTION	
minute	TokenNameIdentifier	 minute
:	TokenNameCOLON	
unNormMinute	TokenNameIdentifier	 un Norm Minute
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xs.datatypes.XSDateTime#getSeconds() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xs.datatypes.XSDateTime#getSeconds() 
public	TokenNamepublic	
double	TokenNamedouble	
getSeconds	TokenNameIdentifier	 get Seconds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
instanceof	TokenNameinstanceof	
DurationDV	TokenNameIdentifier	 Duration DV
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
day	TokenNameIdentifier	 day
*	TokenNameMULTIPLY	
24	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
+	TokenNamePLUS	
hour	TokenNameIdentifier	 hour
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
+	TokenNamePLUS	
minute	TokenNameIdentifier	 minute
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
+	TokenNamePLUS	
second	TokenNameIdentifier	 second
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
normalized	TokenNameIdentifier	 normalized
?	TokenNameQUESTION	
second	TokenNameIdentifier	 second
:	TokenNameCOLON	
unNormSecond	TokenNameIdentifier	 un Norm Second
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xs.datatypes.XSDateTime#hasTimeZone() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xs.datatypes.XSDateTime#hasTimeZone() 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasTimeZone	TokenNameIdentifier	 has Time Zone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
utc	TokenNameIdentifier	 utc
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xs.datatypes.XSDateTime#getTimeZoneHours() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xs.datatypes.XSDateTime#getTimeZoneHours() 
public	TokenNamepublic	
int	TokenNameint	
getTimeZoneHours	TokenNameIdentifier	 get Time Zone Hours
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timezoneHr	TokenNameIdentifier	 timezone Hr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xs.datatypes.XSDateTime#getTimeZoneMinutes() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xs.datatypes.XSDateTime#getTimeZoneMinutes() 
public	TokenNamepublic	
int	TokenNameint	
getTimeZoneMinutes	TokenNameIdentifier	 get Time Zone Minutes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timezoneMin	TokenNameIdentifier	 timezone Min
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xs.datatypes.XSDateTime#getLexicalValue() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xs.datatypes.XSDateTime#getLexicalValue() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLexicalValue	TokenNameIdentifier	 get Lexical Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
originalValue	TokenNameIdentifier	 original Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xs.datatypes.XSDateTime#normalize() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xs.datatypes.XSDateTime#normalize() 
public	TokenNamepublic	
XSDateTime	TokenNameIdentifier	 XS Date Time
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
normalized	TokenNameIdentifier	 normalized
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateTimeData	TokenNameIdentifier	 Date Time Data
dt	TokenNameIdentifier	 dt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dt	TokenNameIdentifier	 dt
.	TokenNameDOT	
normalized	TokenNameIdentifier	 normalized
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dt	TokenNameIdentifier	 dt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xs.datatypes.XSDateTime#isNormalized() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xs.datatypes.XSDateTime#isNormalized() 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
normalized	TokenNameIdentifier	 normalized
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateTimeData	TokenNameIdentifier	 Date Time Data
dt	TokenNameIdentifier	 dt
=	TokenNameEQUAL	
new	TokenNamenew	
DateTimeData	TokenNameIdentifier	 Date Time Data
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
month	TokenNameIdentifier	 month
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
day	TokenNameIdentifier	 day
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
second	TokenNameIdentifier	 second
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
utc	TokenNameIdentifier	 utc
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
originalValue	TokenNameIdentifier	 original Value
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
normalized	TokenNameIdentifier	 normalized
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dt	TokenNameIdentifier	 dt
.	TokenNameDOT	
canonical	TokenNameIdentifier	 canonical
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
canonical	TokenNameIdentifier	 canonical
;	TokenNameSEMICOLON	
dt	TokenNameIdentifier	 dt
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
dt	TokenNameIdentifier	 dt
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
timezoneHr	TokenNameIdentifier	 timezone Hr
;	TokenNameSEMICOLON	
dt	TokenNameIdentifier	 dt
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
timezoneMin	TokenNameIdentifier	 timezone Min
;	TokenNameSEMICOLON	
dt	TokenNameIdentifier	 dt
.	TokenNameDOT	
unNormYear	TokenNameIdentifier	 un Norm Year
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
unNormYear	TokenNameIdentifier	 un Norm Year
;	TokenNameSEMICOLON	
dt	TokenNameIdentifier	 dt
.	TokenNameDOT	
unNormMonth	TokenNameIdentifier	 un Norm Month
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
unNormMonth	TokenNameIdentifier	 un Norm Month
;	TokenNameSEMICOLON	
dt	TokenNameIdentifier	 dt
.	TokenNameDOT	
unNormDay	TokenNameIdentifier	 un Norm Day
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
unNormDay	TokenNameIdentifier	 un Norm Day
;	TokenNameSEMICOLON	
dt	TokenNameIdentifier	 dt
.	TokenNameDOT	
unNormHour	TokenNameIdentifier	 un Norm Hour
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
unNormHour	TokenNameIdentifier	 un Norm Hour
;	TokenNameSEMICOLON	
dt	TokenNameIdentifier	 dt
.	TokenNameDOT	
unNormMinute	TokenNameIdentifier	 un Norm Minute
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
unNormMinute	TokenNameIdentifier	 un Norm Minute
;	TokenNameSEMICOLON	
dt	TokenNameIdentifier	 dt
.	TokenNameDOT	
unNormSecond	TokenNameIdentifier	 un Norm Second
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
unNormSecond	TokenNameIdentifier	 un Norm Second
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dt	TokenNameIdentifier	 dt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xs.datatypes.XSDateTime#getXMLGregorianCalendar() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xs.datatypes.XSDateTime#getXMLGregorianCalendar() 
public	TokenNamepublic	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
getXMLGregorianCalendar	TokenNameIdentifier	 get XML Gregorian Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
getXMLGregorianCalendar	TokenNameIdentifier	 get XML Gregorian Calendar
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xs.datatypes.XSDateTime#getDuration() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xs.datatypes.XSDateTime#getDuration() 
public	TokenNamepublic	
Duration	TokenNameIdentifier	 Duration
getDuration	TokenNameIdentifier	 get Duration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
getDuration	TokenNameIdentifier	 get Duration
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
getXMLGregorianCalendar	TokenNameIdentifier	 get XML Gregorian Calendar
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Duration	TokenNameIdentifier	 Duration
getDuration	TokenNameIdentifier	 get Duration
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
BigDecimal	TokenNameIdentifier	 Big Decimal
getFractionalSecondsAsBigDecimal	TokenNameIdentifier	 get Fractional Seconds As Big Decimal
(	TokenNameLPAREN	
DateTimeData	TokenNameIdentifier	 Date Time Data
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append3	TokenNameIdentifier	 append3
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
unNormSecond	TokenNameIdentifier	 un Norm Second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
BigDecimal	TokenNameIdentifier	 Big Decimal
_val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_val	TokenNameIdentifier	 val
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
