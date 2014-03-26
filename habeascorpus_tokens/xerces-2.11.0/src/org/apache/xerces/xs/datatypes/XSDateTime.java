/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
datatypes	TokenNameIdentifier	 datatypes
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
/** * <p>Interface to expose the values for all date-time related types. The following * table shows the methods defined for various XML Schema 1.0 built-in types. 'X' * marks whether a particular method is defined for a particular type. Accessing undefined * methods may return unexpected values. * * <table border="1"> * <br/> * <tr> * <td> XML Schema Datatype </td> * <td> getYears() </td> * <td> getMonths() </td> * <td> getDays() </td> * <td> getHours() </td> * <td> getMinutes() </td> * <td> getSeconds() </td> * <td> getTimeZoneHours() </td> * <td> getTimeZoneMinutes() </td> * <td> getXMLGregorianCalendar() </td> * <td> getDuration() </td> * <td> hasTimeZone() </td> * <td> normalize() </td> * <td> isNormalized() </td> * <td> getLexicalValue() </td> * </tr> * <tr> * <td> gYear </td> * <td>X</td> * <td>-</td> * <td>-</td> * <td>-</td> * <td>-</td> * <td>-</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>-</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * </tr> * <tr> * <td> gMonth </td> * <td>-</td> * <td>X</td> * <td>-</td> * <td>-</td> * <td>-</td> * <td>-</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>-</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * </tr> * <tr> * <td> gDay </td> * <td>-</td> * <td>-</td> * <td>X</td> * <td>-</td> * <td>-</td> * <td>-</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>-</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * </tr> * <tr> * <td> gYearMonth </td> * <td>X</td> * <td>X</td> * <td>-</td> * <td>-</td> * <td>-</td> * <td>-</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>-</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * </tr> * <tr> * <td> gMonthDay </td> * <td>-</td> * <td>X</td> * <td>X</td> * <td>-</td> * <td>-</td> * <td>-</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>-</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * </tr> * <tr> * <td> date </td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>-</td> * <td>-</td> * <td>-</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>-</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * </tr> * <tr> * <td> time </td> * <td>-</td> * <td>-</td> * <td>-</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>-</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * </tr> * <tr> * <td> datetime </td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>-</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * </tr> * <tr> * <td> duration </td> * <td>-</td> * <td>X</td> * <td>-</td> * <td>-</td> * <td>-</td> * <td>X</td> * <td>-</td> * <td>-</td> * <td>-</td> * <td>X</td> * <td>-</td> * <td>-</td> * <td>-</td> * <td>X</td> * </tr> * </table> * </p> * * @author Ankit Pasricha, IBM * * @version $Id: XSDateTime.java 447250 2006-09-18 05:27:17Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>Interface to expose the values for all date-time related types. The following table shows the methods defined for various XML Schema 1.0 built-in types. 'X' marks whether a particular method is defined for a particular type. Accessing undefined methods may return unexpected values. * <table border="1"> <br/> <tr> <td> XML Schema Datatype </td> <td> getYears() </td> <td> getMonths() </td> <td> getDays() </td> <td> getHours() </td> <td> getMinutes() </td> <td> getSeconds() </td> <td> getTimeZoneHours() </td> <td> getTimeZoneMinutes() </td> <td> getXMLGregorianCalendar() </td> <td> getDuration() </td> <td> hasTimeZone() </td> <td> normalize() </td> <td> isNormalized() </td> <td> getLexicalValue() </td> </tr> <tr> <td> gYear </td> <td>X</td> <td>-</td> <td>-</td> <td>-</td> <td>-</td> <td>-</td> <td>X</td> <td>X</td> <td>X</td> <td>-</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> </tr> <tr> <td> gMonth </td> <td>-</td> <td>X</td> <td>-</td> <td>-</td> <td>-</td> <td>-</td> <td>X</td> <td>X</td> <td>X</td> <td>-</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> </tr> <tr> <td> gDay </td> <td>-</td> <td>-</td> <td>X</td> <td>-</td> <td>-</td> <td>-</td> <td>X</td> <td>X</td> <td>X</td> <td>-</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> </tr> <tr> <td> gYearMonth </td> <td>X</td> <td>X</td> <td>-</td> <td>-</td> <td>-</td> <td>-</td> <td>X</td> <td>X</td> <td>X</td> <td>-</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> </tr> <tr> <td> gMonthDay </td> <td>-</td> <td>X</td> <td>X</td> <td>-</td> <td>-</td> <td>-</td> <td>X</td> <td>X</td> <td>X</td> <td>-</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> </tr> <tr> <td> date </td> <td>X</td> <td>X</td> <td>X</td> <td>-</td> <td>-</td> <td>-</td> <td>X</td> <td>X</td> <td>X</td> <td>-</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> </tr> <tr> <td> time </td> <td>-</td> <td>-</td> <td>-</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> <td>-</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> </tr> <tr> <td> datetime </td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> <td>-</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> </tr> <tr> <td> duration </td> <td>-</td> <td>X</td> <td>-</td> <td>-</td> <td>-</td> <td>X</td> <td>-</td> <td>-</td> <td>-</td> <td>X</td> <td>-</td> <td>-</td> <td>-</td> <td>X</td> </tr> </table> </p> * @author Ankit Pasricha, IBM * @version $Id: XSDateTime.java 447250 2006-09-18 05:27:17Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XSDateTime	TokenNameIdentifier	 XS Date Time
{	TokenNameLBRACE	
/** * @return years - can be negative for date-time related types; * */	TokenNameCOMMENT_JAVADOC	 @return years - can be negative for date-time related types; 
public	TokenNamepublic	
int	TokenNameint	
getYears	TokenNameIdentifier	 get Years
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return months - can be negative only for duration types; * For duration types, it returns years*12 + months */	TokenNameCOMMENT_JAVADOC	 @return months - can be negative only for duration types; For duration types, it returns years*12 + months 
public	TokenNamepublic	
int	TokenNameint	
getMonths	TokenNameIdentifier	 get Months
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return days - cannot be negative; * */	TokenNameCOMMENT_JAVADOC	 @return days - cannot be negative; 
public	TokenNamepublic	
int	TokenNameint	
getDays	TokenNameIdentifier	 get Days
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return hours - cannot be negative; * */	TokenNameCOMMENT_JAVADOC	 @return hours - cannot be negative; 
public	TokenNamepublic	
int	TokenNameint	
getHours	TokenNameIdentifier	 get Hours
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return minutes - cannot be negative; * */	TokenNameCOMMENT_JAVADOC	 @return minutes - cannot be negative; 
public	TokenNamepublic	
int	TokenNameint	
getMinutes	TokenNameIdentifier	 get Minutes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return seconds - can be negative only for durations; * For duration types, it returns days*24*3600 + hours*3600 * + minutes*60 + seconds */	TokenNameCOMMENT_JAVADOC	 @return seconds - can be negative only for durations; For duration types, it returns days*24*3600 + hours*3600 + minutes*60 + seconds 
public	TokenNamepublic	
double	TokenNamedouble	
getSeconds	TokenNameIdentifier	 get Seconds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return boolean (true when timezone is specified in the original lexical value) * */	TokenNameCOMMENT_JAVADOC	 @return boolean (true when timezone is specified in the original lexical value) 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasTimeZone	TokenNameIdentifier	 has Time Zone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return timezone hours (for GMT-xx:xx this will be negative), * */	TokenNameCOMMENT_JAVADOC	 @return timezone hours (for GMT-xx:xx this will be negative), 
public	TokenNamepublic	
int	TokenNameint	
getTimeZoneHours	TokenNameIdentifier	 get Time Zone Hours
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return timezone minutes (for GMT-xx:xx this will be negative), * */	TokenNameCOMMENT_JAVADOC	 @return timezone minutes (for GMT-xx:xx this will be negative), 
public	TokenNamepublic	
int	TokenNameint	
getTimeZoneMinutes	TokenNameIdentifier	 get Time Zone Minutes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return the original lexical value */	TokenNameCOMMENT_JAVADOC	 @return the original lexical value 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLexicalValue	TokenNameIdentifier	 get Lexical Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return a new date-time related object with normalized values * (has no effect on objects already * normalized) */	TokenNameCOMMENT_JAVADOC	 @return a new date-time related object with normalized values (has no effect on objects already normalized) 
public	TokenNamepublic	
XSDateTime	TokenNameIdentifier	 XS Date Time
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return whether a date-time related object is normalized or not * (value is not useful for types where timezone is not specified) */	TokenNameCOMMENT_JAVADOC	 @return whether a date-time related object is normalized or not (value is not useful for types where timezone is not specified) 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return an un-normalized XMLGregorianCalendar (if applicable otherwise null) */	TokenNameCOMMENT_JAVADOC	 @return an un-normalized XMLGregorianCalendar (if applicable otherwise null) 
public	TokenNamepublic	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
getXMLGregorianCalendar	TokenNameIdentifier	 get XML Gregorian Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return a Duration (if applicable otherwise null) */	TokenNameCOMMENT_JAVADOC	 @return a Duration (if applicable otherwise null) 
public	TokenNamepublic	
Duration	TokenNameIdentifier	 Duration
getDuration	TokenNameIdentifier	 get Duration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
