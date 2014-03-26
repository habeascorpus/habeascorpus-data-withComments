/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
jaxp	TokenNameIdentifier	 jaxp
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
datatype	TokenNameIdentifier	 datatype
.	TokenNameDOT	
DatatypeConfigurationException	TokenNameIdentifier	 Datatype Configuration Exception
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
/** * <p>A sample which demonstrates usage of the JAXP 1.3 Datatype API.</p> * * @version $Id: DatatypeAPIUsage.java 447685 2006-09-19 02:37:49Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>A sample which demonstrates usage of the JAXP 1.3 Datatype API.</p> * @version $Id: DatatypeAPIUsage.java 447685 2006-09-19 02:37:49Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DatatypeAPIUsage	TokenNameIdentifier	 Datatype API Usage
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
DatatypeFactory	TokenNameIdentifier	 Datatype Factory
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
DatatypeFactory	TokenNameIdentifier	 Datatype Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// my work number in milliseconds: 	TokenNameCOMMENT_LINE	my work number in milliseconds: 
Duration	TokenNameIdentifier	 Duration
myPhone	TokenNameIdentifier	 my Phone
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
newDuration	TokenNameIdentifier	 new Duration
(	TokenNameLPAREN	
9054133519l	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Duration	TokenNameIdentifier	 Duration
myLife	TokenNameIdentifier	 my Life
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
newDuration	TokenNameIdentifier	 new Duration
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
compareVal	TokenNameIdentifier	 compare Val
=	TokenNameEQUAL	
myPhone	TokenNameIdentifier	 my Phone
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
myLife	TokenNameIdentifier	 my Life
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
compareVal	TokenNameIdentifier	 compare Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
LESSER	TokenNameIdentifier	 LESSER
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"There are fewer milliseconds in my phone number than my lifespan."	TokenNameStringLiteral	There are fewer milliseconds in my phone number than my lifespan.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"The same number of milliseconds are in my phone number and my lifespan."	TokenNameStringLiteral	The same number of milliseconds are in my phone number and my lifespan.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
GREATER	TokenNameIdentifier	 GREATER
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"There are more milliseconds in my phone number than my lifespan."	TokenNameStringLiteral	There are more milliseconds in my phone number than my lifespan.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"The comparison could not be carried out."	TokenNameStringLiteral	The comparison could not be carried out.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create a yearMonthDuration 	TokenNameCOMMENT_LINE	create a yearMonthDuration 
Duration	TokenNameIdentifier	 Duration
ymDuration	TokenNameIdentifier	 ym Duration
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
newDurationYearMonth	TokenNameIdentifier	 new Duration Year Month
(	TokenNameLPAREN	
"P12Y10M"	TokenNameStringLiteral	P12Y10M
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"P12Y10M is of type: "	TokenNameStringLiteral	P12Y10M is of type: 
+	TokenNamePLUS	
ymDuration	TokenNameIdentifier	 ym Duration
.	TokenNameDOT	
getXMLSchemaType	TokenNameIdentifier	 get XML Schema Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create a dayTimeDuration (really this time) 	TokenNameCOMMENT_LINE	create a dayTimeDuration (really this time) 
Duration	TokenNameIdentifier	 Duration
dtDuration	TokenNameIdentifier	 dt Duration
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
newDurationDayTime	TokenNameIdentifier	 new Duration Day Time
(	TokenNameLPAREN	
"P10DT10H12M0S"	TokenNameStringLiteral	P10DT10H12M0S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"P10DT10H12M0S is of type: "	TokenNameStringLiteral	P10DT10H12M0S is of type: 
+	TokenNamePLUS	
dtDuration	TokenNameIdentifier	 dt Duration
.	TokenNameDOT	
getXMLSchemaType	TokenNameIdentifier	 get XML Schema Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// try to fool the factory! 	TokenNameCOMMENT_LINE	try to fool the factory! 
try	TokenNametry	
{	TokenNameLBRACE	
ymDuration	TokenNameIdentifier	 ym Duration
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
newDurationYearMonth	TokenNameIdentifier	 new Duration Year Month
(	TokenNameLPAREN	
"P12Y10M1D"	TokenNameStringLiteral	P12Y10M1D
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'duration': P12Y10M1D is not 'yearMonthDuration'!!!"	TokenNameStringLiteral	'duration': P12Y10M1D is not 'yearMonthDuration'!!!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
xgc	TokenNameIdentifier	 xgc
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
newXMLGregorianCalendar	TokenNameIdentifier	 new XML Gregorian Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xgc	TokenNameIdentifier	 xgc
.	TokenNameDOT	
setYear	TokenNameIdentifier	 set Year
(	TokenNameLPAREN	
1975	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xgc	TokenNameIdentifier	 xgc
.	TokenNameDOT	
setMonth	TokenNameIdentifier	 set Month
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
AUGUST	TokenNameIdentifier	 AUGUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xgc	TokenNameIdentifier	 xgc
.	TokenNameDOT	
setDay	TokenNameIdentifier	 set Day
(	TokenNameLPAREN	
11	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xgc	TokenNameIdentifier	 xgc
.	TokenNameDOT	
setHour	TokenNameIdentifier	 set Hour
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xgc	TokenNameIdentifier	 xgc
.	TokenNameDOT	
setMinute	TokenNameIdentifier	 set Minute
(	TokenNameLPAREN	
44	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xgc	TokenNameIdentifier	 xgc
.	TokenNameDOT	
setSecond	TokenNameIdentifier	 set Second
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xgc	TokenNameIdentifier	 xgc
.	TokenNameDOT	
setMillisecond	TokenNameIdentifier	 set Millisecond
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xgc	TokenNameIdentifier	 xgc
.	TokenNameDOT	
setTimezone	TokenNameIdentifier	 set Timezone
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xgc	TokenNameIdentifier	 xgc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
myPhone	TokenNameIdentifier	 my Phone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"The approximate end of the number of milliseconds in my phone number was "	TokenNameStringLiteral	The approximate end of the number of milliseconds in my phone number was 
+	TokenNamePLUS	
xgc	TokenNameIdentifier	 xgc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//adding a duration to XMLGregorianCalendar 	TokenNameCOMMENT_LINE	adding a duration to XMLGregorianCalendar 
xgc	TokenNameIdentifier	 xgc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
myLife	TokenNameIdentifier	 my Life
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Adding the duration myLife to the above calendar:"	TokenNameStringLiteral	Adding the duration myLife to the above calendar:
+	TokenNamePLUS	
xgc	TokenNameIdentifier	 xgc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create a new XMLGregorianCalendar using the string format of xgc. 	TokenNameCOMMENT_LINE	create a new XMLGregorianCalendar using the string format of xgc. 
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
xgcCopy	TokenNameIdentifier	 xgc Copy
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
newXMLGregorianCalendar	TokenNameIdentifier	 new XML Gregorian Calendar
(	TokenNameLPAREN	
xgc	TokenNameIdentifier	 xgc
.	TokenNameDOT	
toXMLFormat	TokenNameIdentifier	 to XML Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// should be equal-if not what happened!! 	TokenNameCOMMENT_LINE	should be equal-if not what happened!! 
if	TokenNameif	
(	TokenNameLPAREN	
xgcCopy	TokenNameIdentifier	 xgc Copy
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
xgc	TokenNameIdentifier	 xgc
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"oooops!"	TokenNameStringLiteral	oooops!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Very good: "	TokenNameStringLiteral	Very good: 
+	TokenNamePLUS	
xgc	TokenNameIdentifier	 xgc
+	TokenNamePLUS	
" is equal to "	TokenNameStringLiteral	 is equal to 
+	TokenNamePLUS	
xgcCopy	TokenNameIdentifier	 xgc Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
DatatypeConfigurationException	TokenNameIdentifier	 Datatype Configuration Exception
dce	TokenNameIdentifier	 dce
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: Datatype error occurred - "	TokenNameStringLiteral	error: Datatype error occurred - 
+	TokenNamePLUS	
dce	TokenNameIdentifier	 dce
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dce	TokenNameIdentifier	 dce
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// main(String[]) 	TokenNameCOMMENT_LINE	main(String[]) 
}	TokenNameRBRACE	
// DatatypeAPIUsage 	TokenNameCOMMENT_LINE	DatatypeAPIUsage 
