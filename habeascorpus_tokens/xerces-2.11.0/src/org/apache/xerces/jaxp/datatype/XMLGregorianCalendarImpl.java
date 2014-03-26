/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
jaxp	TokenNameIdentifier	 jaxp
.	TokenNameDOT	
datatype	TokenNameIdentifier	 datatype
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TimeZone	TokenNameIdentifier	 Time Zone
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
datatype	TokenNameIdentifier	 datatype
.	TokenNameDOT	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
;	TokenNameSEMICOLON	
/** * <p>Representation for W3C XML Schema 1.0 date/time datatypes. * Specifically, these date/time datatypes are * {@link DatatypeConstants#DATETIME dateTime}, * {@link DatatypeConstants#TIME time}, * {@link DatatypeConstants#DATE date}, * {@link DatatypeConstants#GYEARMONTH gYearMonth}, * {@link DatatypeConstants#GMONTHDAY gMonthDay}, * {@link DatatypeConstants#GYEAR gYear}, * {@link DatatypeConstants#GMONTH gMonth} and * {@link DatatypeConstants#GDAY gDay} * defined in the XML Namespace * <code>"http://www.w3.org/2001/XMLSchema"</code>. * These datatypes are normatively defined in * <a href="http://www.w3.org/TR/xmlschema-2/#dateTime">W3C XML Schema 1.0 Part 2, Section 3.2.7-14</a>.</p> * * <p>The table below defines the mapping between XML Schema 1.0 * date/time datatype fields and this class' fields. It also summarizes * the value constraints for the date and time fields defined in * <a href="http://www.w3.org/TR/xmlschema-2/#isoformats">W3C XML Schema 1.0 Part 2, Appendix D, * <i>ISO 8601 Date and Time Formats</i></a>.</p> * * <a name="datetimefieldsmapping"/> * <table border="2" rules="all" cellpadding="2"> * <thead> * <tr> * <th align="center" colspan="3"> * Date/time datatype field mapping between XML Schema 1.0 and Java representation * </th> * </tr> * </thead> * <tbody> * <tr> * <th>XML Schema 1.0<br/> * datatype<br/> * field</th> * <th>Related<br/>XMLGregorianCalendar<br/>Accessor(s)</th> * <th>Value Range</th> * </tr> * <a name="datetimefield-year"/> * <tr> * <td> year </td> * <td> {@link #getYear()} + {@link #getEon()} or<br/> * {@link #getEonAndYear} * </td> * <td> <code>getYear()</code> is a value between -(10^9-1) to (10^9)-1 * or {@link DatatypeConstants#FIELD_UNDEFINED}.<br/> * {@link #getEon()} is high order year value in billion of years.<br/> * <code>getEon()</code> has values greater than or equal to (10^9) or less than or equal to -(10^9). * A value of null indicates field is undefined.</br> * Given that <a href="http://www.w3.org/2001/05/xmlschema-errata#e2-63">XML Schema 1.0 errata</a> states that the year zero * will be a valid lexical value in a future version of XML Schema, * this class allows the year field to be set to zero. Otherwise, * the year field value is handled exactly as described * in the errata and [ISO-8601-1988]. Note that W3C XML Schema 1.0 * validation does not allow for the year field to have a value of zero. * </td> * </tr> * <a name="datetimefield-month"/> * <tr> * <td> month </td> * <td> {@link #getMonth()} </td> * <td> 1 to 12 or {@link DatatypeConstants#FIELD_UNDEFINED} </td> * </tr> * <a name="datetimefield-day"/> * <tr> * <td> day </td> * <td> {@link #getDay()} </td> * <td> Independent of month, max range is 1 to 31 or {@link DatatypeConstants#FIELD_UNDEFINED}.<br/> * The normative value constraint stated relative to month * field's value is in <a href="http://www.w3.org/TR/xmlschema-2/#isoformats">W3C XML Schema 1.0 Part 2, Appendix D</a>. * </td> * </tr> * <a name="datetimefield-hour"/> * <tr> * <td> hour </td> * <td> {@link #getHour()} </td> * <td> * 0 to 24 or {@link DatatypeConstants#FIELD_UNDEFINED} * <a href="http://www.w3.org/2001/05/xmlschema-errata#e2-45">For a value of 24, the minute and second field must be zero.</a> * </td> * </tr> * <a name="datetimefield-minute"/> * <tr> * <td> minute </td> * <td> {@link #getMinute()} </td> * <td> 0 to 59 or {@link DatatypeConstants#FIELD_UNDEFINED} </td> * </tr> * <a name="datetimefield-second"/> * <tr> * <td>second</td> * <td> * {@link #getSecond()} + {@link #getMillisecond()}/1000 or<br/> * {@link #getSecond()} + {@link #getFractionalSecond()} * </td> * <td> * {@link #getSecond()} from 0 to 60 or {@link DatatypeConstants#FIELD_UNDEFINED}.<br/> * <i>(Note: 60 only allowable for leap second.)</i><br/> * {@link #getFractionalSecond()} allows for infinite precision over the range from 0.0 to 1.0 when * the {@link #getSecond()} is defined.<br/> * <code>FractionalSecond</code> is optional and has a value of <code>null</code> when it is undefined.<br /> * {@link #getMillisecond()} is the convenience * millisecond precision of value of {@link #getFractionalSecond()}. * </td> * </tr> * <tr id="datetimefield-timezone"> * <td> timezone </td> * <td> {@link #getTimezone()} </td> * <td> Number of minutes or {@link DatatypeConstants#FIELD_UNDEFINED}. * Value range from -14 hours (-14 * 60 minutes) to 14 hours (14 * 60 minutes). * </td> * </tr> * </tbody> * </table> * * <p>All maximum value space constraints listed for the fields in the table * above are checked by factory methods, setter methods and parse methods of * this class. <code>IllegalArgumentException</code> is thrown when * parameter's value is outside the maximum value constraint for the field. * Validation checks, for example, whether days in month should be * limited to 29, 30 or 31 days, that are dependent on the values of other * fields are not checked by these methods. * </p> * * <p>The following operations are defined for this class: * <ul> * <li>factory methods to create instances</li> * <li>accessors/mutators for independent date/time fields</li> * <li>conversion between this class and W3C XML Schema 1.0 lexical representation</li> * <li>conversion between this class and <code>java.util.GregorianCalendar</code></li> * <li>partial order relation comparator method, {@link #compare(XMLGregorianCalendar)}</li> * <li>{@link #equals(Object)} defined relative to {@link #compare(XMLGregorianCalendar)}.</li> * <li> addition operation with {@link javax.xml.datatype.Duration}. * instance as defined in <a href="http://www.w3.org/TR/xmlschema-2/#adding-durations-to-dateTimes"> * W3C XML Schema 1.0 Part 2, Appendix E, <i>Adding durations to dateTimes</i></a>.</li> * </ul> * </p> * * @author <a href="mailto:Kohsuke.Kawaguchi@Sun.com">Kohsuke Kawaguchi</a> * @author <a href="mailto:Joseph.Fialli@Sun.com">Joseph Fialli</a> * @version $Id: XMLGregorianCalendarImpl.java 759809 2009-03-30 00:44:05Z mrglavas $ * @see javax.xml.datatype.Duration */	TokenNameCOMMENT_JAVADOC	 <p>Representation for W3C XML Schema 1.0 date/time datatypes. Specifically, these date/time datatypes are {@link DatatypeConstants#DATETIME dateTime}, {@link DatatypeConstants#TIME time}, {@link DatatypeConstants#DATE date}, {@link DatatypeConstants#GYEARMONTH gYearMonth}, {@link DatatypeConstants#GMONTHDAY gMonthDay}, {@link DatatypeConstants#GYEAR gYear}, {@link DatatypeConstants#GMONTH gMonth} and {@link DatatypeConstants#GDAY gDay} defined in the XML Namespace <code>"http://www.w3.org/2001/XMLSchema"</code>. These datatypes are normatively defined in <a href="http://www.w3.org/TR/xmlschema-2/#dateTime">W3C XML Schema 1.0 Part 2, Section 3.2.7-14</a>.</p> * <p>The table below defines the mapping between XML Schema 1.0 date/time datatype fields and this class' fields. It also summarizes the value constraints for the date and time fields defined in <a href="http://www.w3.org/TR/xmlschema-2/#isoformats">W3C XML Schema 1.0 Part 2, Appendix D, <i>ISO 8601 Date and Time Formats</i></a>.</p> * <a name="datetimefieldsmapping"/> <table border="2" rules="all" cellpadding="2"> <thead> <tr> <th align="center" colspan="3"> Date/time datatype field mapping between XML Schema 1.0 and Java representation </th> </tr> </thead> <tbody> <tr> <th>XML Schema 1.0<br/> datatype<br/> field</th> <th>Related<br/>XMLGregorianCalendar<br/>Accessor(s)</th> <th>Value Range</th> </tr> <a name="datetimefield-year"/> <tr> <td> year </td> <td> {@link #getYear()} + {@link #getEon()} or<br/> {@link #getEonAndYear} </td> <td> <code>getYear()</code> is a value between -(10^9-1) to (10^9)-1 or {@link DatatypeConstants#FIELD_UNDEFINED}.<br/> {@link #getEon()} is high order year value in billion of years.<br/> <code>getEon()</code> has values greater than or equal to (10^9) or less than or equal to -(10^9). A value of null indicates field is undefined.</br> Given that <a href="http://www.w3.org/2001/05/xmlschema-errata#e2-63">XML Schema 1.0 errata</a> states that the year zero will be a valid lexical value in a future version of XML Schema, this class allows the year field to be set to zero. Otherwise, the year field value is handled exactly as described in the errata and [ISO-8601-1988]. Note that W3C XML Schema 1.0 validation does not allow for the year field to have a value of zero. </td> </tr> <a name="datetimefield-month"/> <tr> <td> month </td> <td> {@link #getMonth()} </td> <td> 1 to 12 or {@link DatatypeConstants#FIELD_UNDEFINED} </td> </tr> <a name="datetimefield-day"/> <tr> <td> day </td> <td> {@link #getDay()} </td> <td> Independent of month, max range is 1 to 31 or {@link DatatypeConstants#FIELD_UNDEFINED}.<br/> The normative value constraint stated relative to month field's value is in <a href="http://www.w3.org/TR/xmlschema-2/#isoformats">W3C XML Schema 1.0 Part 2, Appendix D</a>. </td> </tr> <a name="datetimefield-hour"/> <tr> <td> hour </td> <td> {@link #getHour()} </td> <td> 0 to 24 or {@link DatatypeConstants#FIELD_UNDEFINED} <a href="http://www.w3.org/2001/05/xmlschema-errata#e2-45">For a value of 24, the minute and second field must be zero.</a> </td> </tr> <a name="datetimefield-minute"/> <tr> <td> minute </td> <td> {@link #getMinute()} </td> <td> 0 to 59 or {@link DatatypeConstants#FIELD_UNDEFINED} </td> </tr> <a name="datetimefield-second"/> <tr> <td>second</td> <td> {@link #getSecond()} + {@link #getMillisecond()}/1000 or<br/> {@link #getSecond()} + {@link #getFractionalSecond()} </td> <td> {@link #getSecond()} from 0 to 60 or {@link DatatypeConstants#FIELD_UNDEFINED}.<br/> <i>(Note: 60 only allowable for leap second.)</i><br/> {@link #getFractionalSecond()} allows for infinite precision over the range from 0.0 to 1.0 when the {@link #getSecond()} is defined.<br/> <code>FractionalSecond</code> is optional and has a value of <code>null</code> when it is undefined.<br /> {@link #getMillisecond()} is the convenience millisecond precision of value of {@link #getFractionalSecond()}. </td> </tr> <tr id="datetimefield-timezone"> <td> timezone </td> <td> {@link #getTimezone()} </td> <td> Number of minutes or {@link DatatypeConstants#FIELD_UNDEFINED}. Value range from -14 hours (-14 60 minutes) to 14 hours (14 60 minutes). </td> </tr> </tbody> </table> * <p>All maximum value space constraints listed for the fields in the table above are checked by factory methods, setter methods and parse methods of this class. <code>IllegalArgumentException</code> is thrown when parameter's value is outside the maximum value constraint for the field. Validation checks, for example, whether days in month should be limited to 29, 30 or 31 days, that are dependent on the values of other fields are not checked by these methods. </p> * <p>The following operations are defined for this class: <ul> <li>factory methods to create instances</li> <li>accessors/mutators for independent date/time fields</li> <li>conversion between this class and W3C XML Schema 1.0 lexical representation</li> <li>conversion between this class and <code>java.util.GregorianCalendar</code></li> <li>partial order relation comparator method, {@link #compare(XMLGregorianCalendar)}</li> <li>{@link #equals(Object)} defined relative to {@link #compare(XMLGregorianCalendar)}.</li> <li> addition operation with {@link javax.xml.datatype.Duration}. instance as defined in <a href="http://www.w3.org/TR/xmlschema-2/#adding-durations-to-dateTimes"> W3C XML Schema 1.0 Part 2, Appendix E, <i>Adding durations to dateTimes</i></a>.</li> </ul> </p> * @author <a href="mailto:Kohsuke.Kawaguchi@Sun.com">Kohsuke Kawaguchi</a> @author <a href="mailto:Joseph.Fialli@Sun.com">Joseph Fialli</a> @version $Id: XMLGregorianCalendarImpl.java 759809 2009-03-30 00:44:05Z mrglavas $ @see javax.xml.datatype.Duration 
class	TokenNameclass	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
extends	TokenNameextends	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** * <p>Stream Unique Identifier.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Stream Unique Identifier.</p> 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
3905403108073447394L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Backup values **/	TokenNameCOMMENT_JAVADOC	 Backup values *
private	TokenNameprivate	
BigInteger	TokenNameIdentifier	 Big Integer
orig_eon	TokenNameIdentifier	 orig eon
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
orig_year	TokenNameIdentifier	 orig year
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
orig_month	TokenNameIdentifier	 orig month
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
orig_day	TokenNameIdentifier	 orig day
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
orig_hour	TokenNameIdentifier	 orig hour
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
orig_minute	TokenNameIdentifier	 orig minute
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
orig_second	TokenNameIdentifier	 orig second
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BigDecimal	TokenNameIdentifier	 Big Decimal
orig_fracSeconds	TokenNameIdentifier	 orig frac Seconds
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
orig_timezone	TokenNameIdentifier	 orig timezone
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
/** * <p>Eon of this <code>XMLGregorianCalendar</code>.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Eon of this <code>XMLGregorianCalendar</code>.</p> 
private	TokenNameprivate	
BigInteger	TokenNameIdentifier	 Big Integer
eon	TokenNameIdentifier	 eon
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * <p>Year of this <code>XMLGregorianCalendar</code>.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Year of this <code>XMLGregorianCalendar</code>.</p> 
private	TokenNameprivate	
int	TokenNameint	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
/** * <p>Month of this <code>XMLGregorianCalendar</code>.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Month of this <code>XMLGregorianCalendar</code>.</p> 
private	TokenNameprivate	
int	TokenNameint	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
/** * <p>Day of this <code>XMLGregorianCalendar</code>.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Day of this <code>XMLGregorianCalendar</code>.</p> 
private	TokenNameprivate	
int	TokenNameint	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
/** * <p>Timezone of this <code>XMLGregorianCalendar</code> in minutes.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Timezone of this <code>XMLGregorianCalendar</code> in minutes.</p> 
private	TokenNameprivate	
int	TokenNameint	
timezone	TokenNameIdentifier	 timezone
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
/** * <p>Hour of this <code>XMLGregorianCalendar</code>.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Hour of this <code>XMLGregorianCalendar</code>.</p> 
private	TokenNameprivate	
int	TokenNameint	
hour	TokenNameIdentifier	 hour
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
/** * <p>Minute of this <code>XMLGregorianCalendar</code>.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Minute of this <code>XMLGregorianCalendar</code>.</p> 
private	TokenNameprivate	
int	TokenNameint	
minute	TokenNameIdentifier	 minute
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
/** * <p>Second of this <code>XMLGregorianCalendar</code>.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Second of this <code>XMLGregorianCalendar</code>.</p> 
private	TokenNameprivate	
int	TokenNameint	
second	TokenNameIdentifier	 second
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
/** * <p>Fractional second of this <code>XMLGregorianCalendar</code>.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Fractional second of this <code>XMLGregorianCalendar</code>.</p> 
private	TokenNameprivate	
BigDecimal	TokenNameIdentifier	 Big Decimal
fractionalSecond	TokenNameIdentifier	 fractional Second
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * <p>BigInteger constant; representing a billion.</p> */	TokenNameCOMMENT_JAVADOC	 <p>BigInteger constant; representing a billion.</p> 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
BILLION_B	TokenNameIdentifier	 BILLION  B
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
1000000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <p>int constant; representing a billion.</p> */	TokenNameCOMMENT_JAVADOC	 <p>int constant; representing a billion.</p> 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BILLION_I	TokenNameIdentifier	 BILLION  I
=	TokenNameEQUAL	
1000000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * <p>Obtain a pure Gregorian Calendar by calling * GregorianCalendar.setChange(PURE_GREGORIAN_CHANGE). </p> */	TokenNameCOMMENT_JAVADOC	 <p>Obtain a pure Gregorian Calendar by calling GregorianCalendar.setChange(PURE_GREGORIAN_CHANGE). </p> 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Date	TokenNameIdentifier	 Date
PURE_GREGORIAN_CHANGE	TokenNameIdentifier	 PURE  GREGORIAN  CHANGE
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Year index for MIN_ and MAX_FIELD_VALUES. */	TokenNameCOMMENT_JAVADOC	 Year index for MIN_ and MAX_FIELD_VALUES. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
YEAR	TokenNameIdentifier	 YEAR
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Month index for MIN_ and MAX_FIELD_VALUES. */	TokenNameCOMMENT_JAVADOC	 Month index for MIN_ and MAX_FIELD_VALUES. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MONTH	TokenNameIdentifier	 MONTH
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Day index for MIN_ and MAX_FIELD_VALUES. */	TokenNameCOMMENT_JAVADOC	 Day index for MIN_ and MAX_FIELD_VALUES. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DAY	TokenNameIdentifier	 DAY
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Hour index for MIN_ and MAX_FIELD_VALUES. */	TokenNameCOMMENT_JAVADOC	 Hour index for MIN_ and MAX_FIELD_VALUES. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HOUR	TokenNameIdentifier	 HOUR
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Minute index for MIN_ and MAX_FIELD_VALUES. */	TokenNameCOMMENT_JAVADOC	 Minute index for MIN_ and MAX_FIELD_VALUES. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MINUTE	TokenNameIdentifier	 MINUTE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Second index for MIN_ and MAX_FIELD_VALUES. */	TokenNameCOMMENT_JAVADOC	 Second index for MIN_ and MAX_FIELD_VALUES. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SECOND	TokenNameIdentifier	 SECOND
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Second index for MIN_ and MAX_FIELD_VALUES. */	TokenNameCOMMENT_JAVADOC	 Second index for MIN_ and MAX_FIELD_VALUES. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Timezone index for MIN_ and MAX_FIELD_VALUES */	TokenNameCOMMENT_JAVADOC	 Timezone index for MIN_ and MAX_FIELD_VALUES 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIMEZONE	TokenNameIdentifier	 TIMEZONE
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Minimum field values indexed by YEAR..TIMEZONE. */	TokenNameCOMMENT_JAVADOC	 Minimum field values indexed by YEAR..TIMEZONE. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MIN_FIELD_VALUE	TokenNameIdentifier	 MIN  FIELD  VALUE
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
//Year field can be smaller than this, 	TokenNameCOMMENT_LINE	Year field can be smaller than this, 
// only constraint on integer value of year. 	TokenNameCOMMENT_LINE	only constraint on integer value of year. 
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
JANUARY	TokenNameIdentifier	 JANUARY
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
//day of month 	TokenNameCOMMENT_LINE	day of month 
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
//hour 	TokenNameCOMMENT_LINE	hour 
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
//minute 	TokenNameCOMMENT_LINE	minute 
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
//second 	TokenNameCOMMENT_LINE	second 
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
//millisecond 	TokenNameCOMMENT_LINE	millisecond 
-	TokenNameMINUS	
14	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
//timezone 	TokenNameCOMMENT_LINE	timezone 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Maximum field values indexed by YEAR..TIMEZONE. */	TokenNameCOMMENT_JAVADOC	 Maximum field values indexed by YEAR..TIMEZONE. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_FIELD_VALUE	TokenNameIdentifier	 MAX  FIELD  VALUE
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
// Year field can be bigger than this, 	TokenNameCOMMENT_LINE	Year field can be bigger than this, 
// only constraint on integer value of year. 	TokenNameCOMMENT_LINE	only constraint on integer value of year. 
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
DECEMBER	TokenNameIdentifier	 DECEMBER
,	TokenNameCOMMA	
31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
//day of month 	TokenNameCOMMENT_LINE	day of month 
24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
//hour 	TokenNameCOMMENT_LINE	hour 
59	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
//minute 	TokenNameCOMMENT_LINE	minute 
60	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
//second (leap second allows for 60) 	TokenNameCOMMENT_LINE	second (leap second allows for 60) 
999	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
//millisecond 	TokenNameCOMMENT_LINE	millisecond 
14	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
//timezone 	TokenNameCOMMENT_LINE	timezone 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * field names indexed by YEAR..TIMEZONE. */	TokenNameCOMMENT_JAVADOC	 field names indexed by YEAR..TIMEZONE. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FIELD_NAME	TokenNameIdentifier	 FIELD  NAME
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"Year"	TokenNameStringLiteral	Year
,	TokenNameCOMMA	
"Month"	TokenNameStringLiteral	Month
,	TokenNameCOMMA	
"Day"	TokenNameStringLiteral	Day
,	TokenNameCOMMA	
"Hour"	TokenNameStringLiteral	Hour
,	TokenNameCOMMA	
"Minute"	TokenNameStringLiteral	Minute
,	TokenNameCOMMA	
"Second"	TokenNameStringLiteral	Second
,	TokenNameCOMMA	
"Millisecond"	TokenNameStringLiteral	Millisecond
,	TokenNameCOMMA	
"Timezone"	TokenNameStringLiteral	Timezone
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * <p>Use as a template for default field values when * converting to a {@link GregorianCalendar}, set to a leap * year date of January 1, 0400 at midnight.</p> * * <p>Fields that are optional for an <code>xsd:dateTime</code> instances are defaulted to not being set to any value. * <code>XMLGregorianCalendar</code> fields millisecond, fractional second and timezone return the value indicating * that the field is not set, {@link DatatypeConstants#FIELD_UNDEFINED} for millisecond and timezone * and <code>null</code> for fractional second.</p> * * @see #toGregorianCalendar(TimeZone, Locale, XMLGregorianCalendar) */	TokenNameCOMMENT_JAVADOC	 <p>Use as a template for default field values when converting to a {@link GregorianCalendar}, set to a leap year date of January 1, 0400 at midnight.</p> * <p>Fields that are optional for an <code>xsd:dateTime</code> instances are defaulted to not being set to any value. <code>XMLGregorianCalendar</code> fields millisecond, fractional second and timezone return the value indicating that the field is not set, {@link DatatypeConstants#FIELD_UNDEFINED} for millisecond and timezone and <code>null</code> for fractional second.</p> * @see #toGregorianCalendar(TimeZone, Locale, XMLGregorianCalendar) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
LEAP_YEAR_DEFAULT	TokenNameIdentifier	 LEAP  YEAR  DEFAULT
=	TokenNameEQUAL	
createDateTime	TokenNameIdentifier	 create Date Time
(	TokenNameLPAREN	
400	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
//year 	TokenNameCOMMENT_LINE	year 
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
JANUARY	TokenNameIdentifier	 JANUARY
,	TokenNameCOMMA	
//month 	TokenNameCOMMENT_LINE	month 
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// day 	TokenNameCOMMENT_LINE	day 
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// hour 	TokenNameCOMMENT_LINE	hour 
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// minute 	TokenNameCOMMENT_LINE	minute 
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// second 	TokenNameCOMMENT_LINE	second 
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
// milliseconds 	TokenNameCOMMENT_LINE	milliseconds 
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
// timezone 	TokenNameCOMMENT_LINE	timezone 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
/** * Constructs a new XMLGregorianCalendar object. * * String parsing documented by {@link #parse(String)}. * * Returns a non-null valid XMLGregorianCalendar object that holds the * value indicated by the lexicalRepresentation parameter. * * @param lexicalRepresentation * Lexical representation of one the eight * XML Schema date/time datatypes. * @throws IllegalArgumentException * If the given string does not conform as documented in * {@link #parse(String)}. * @throws NullPointerException * If the given string is null. */	TokenNameCOMMENT_JAVADOC	 Constructs a new XMLGregorianCalendar object. * String parsing documented by {@link #parse(String)}. * Returns a non-null valid XMLGregorianCalendar object that holds the value indicated by the lexicalRepresentation parameter. * @param lexicalRepresentation Lexical representation of one the eight XML Schema date/time datatypes. @throws IllegalArgumentException If the given string does not conform as documented in {@link #parse(String)}. @throws NullPointerException If the given string is null. 
protected	TokenNameprotected	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lexicalRepresentation	TokenNameIdentifier	 lexical Representation
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
// compute format string for this lexical representation. 	TokenNameCOMMENT_LINE	compute format string for this lexical representation. 
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
lexRep	TokenNameIdentifier	 lex Rep
=	TokenNameEQUAL	
lexicalRepresentation	TokenNameIdentifier	 lexical Representation
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
NOT_FOUND	TokenNameIdentifier	 NOT  FOUND
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
lexRepLength	TokenNameIdentifier	 lex Rep Length
=	TokenNameEQUAL	
lexRep	TokenNameIdentifier	 lex Rep
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// current parser needs a format string, 	TokenNameCOMMENT_LINE	current parser needs a format string, 
// use following heuristics to figure out what xml schema date/time 	TokenNameCOMMENT_LINE	use following heuristics to figure out what xml schema date/time 
// datatype this lexical string could represent. 	TokenNameCOMMENT_LINE	datatype this lexical string could represent. 
if	TokenNameif	
(	TokenNameLPAREN	
lexRep	TokenNameIdentifier	 lex Rep
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'T'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
NOT_FOUND	TokenNameIdentifier	 NOT  FOUND
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// found Date Time separater, must be xsd:DateTime 	TokenNameCOMMENT_LINE	found Date Time separater, must be xsd:DateTime 
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
"%Y-%M-%DT%h:%m:%s"	TokenNameStringLiteral	%Y-%M-%DT%h:%m:%s
+	TokenNamePLUS	
"%z"	TokenNameStringLiteral	%z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
lexRepLength	TokenNameIdentifier	 lex Rep Length
>=	TokenNameGREATER_EQUAL	
3	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
lexRep	TokenNameIdentifier	 lex Rep
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// found ":", must be xsd:Time 	TokenNameCOMMENT_LINE	found ":", must be xsd:Time 
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
"%h:%m:%s"	TokenNameStringLiteral	%h:%m:%s
+	TokenNamePLUS	
"%z"	TokenNameStringLiteral	%z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
lexRep	TokenNameIdentifier	 lex Rep
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"--"	TokenNameStringLiteral	--
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check for GDay || GMonth || GMonthDay 	TokenNameCOMMENT_LINE	check for GDay || GMonth || GMonthDay 
if	TokenNameif	
(	TokenNameLPAREN	
lexRepLength	TokenNameIdentifier	 lex Rep Length
>=	TokenNameGREATER_EQUAL	
3	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
lexRep	TokenNameIdentifier	 lex Rep
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// GDAY 	TokenNameCOMMENT_LINE	GDAY 
// Fix 4971612: invalid SCCS macro substitution in data string 	TokenNameCOMMENT_LINE	Fix 4971612: invalid SCCS macro substitution in data string 
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
"---%D"	TokenNameStringLiteral	---%D
+	TokenNamePLUS	
"%z"	TokenNameStringLiteral	%z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
lexRepLength	TokenNameIdentifier	 lex Rep Length
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
lexRepLength	TokenNameIdentifier	 lex Rep Length
>=	TokenNameGREATER_EQUAL	
6	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
lexRep	TokenNameIdentifier	 lex Rep
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'+'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
lexRep	TokenNameIdentifier	 lex Rep
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
lexRep	TokenNameIdentifier	 lex Rep
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
lexRepLength	TokenNameIdentifier	 lex Rep Length
==	TokenNameEQUAL_EQUAL	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// GMonth 	TokenNameCOMMENT_LINE	GMonth 
// Fix 4971612: invalid SCCS macro substitution in data string 	TokenNameCOMMENT_LINE	Fix 4971612: invalid SCCS macro substitution in data string 
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
"--%M--%z"	TokenNameStringLiteral	--%M--%z
;	TokenNameSEMICOLON	
Parser	TokenNameIdentifier	 Parser
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Parser	TokenNameIdentifier	 Parser
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
lexRep	TokenNameIdentifier	 lex Rep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check for validity 	TokenNameCOMMENT_LINE	check for validity 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"InvalidXGCRepresentation"	TokenNameStringLiteral	InvalidXGCRepresentation
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
lexicalRepresentation	TokenNameIdentifier	 lexical Representation
}	TokenNameRBRACE	
)	TokenNameRPAREN	
//"\"" + lexicalRepresentation + "\" is not a valid representation of an XML Gregorian Calendar value." 	TokenNameCOMMENT_LINE	"\"" + lexicalRepresentation + "\" is not a valid representation of an XML Gregorian Calendar value." 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
save	TokenNameIdentifier	 save
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
"--%M%z"	TokenNameStringLiteral	--%M%z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// GMonthDay or invalid lexicalRepresentation 	TokenNameCOMMENT_LINE	GMonthDay or invalid lexicalRepresentation 
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
"--%M-%D"	TokenNameStringLiteral	--%M-%D
+	TokenNamePLUS	
"%z"	TokenNameStringLiteral	%z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// check for Date || GYear | GYearMonth 	TokenNameCOMMENT_LINE	check for Date || GYear | GYearMonth 
int	TokenNameint	
countSeparator	TokenNameIdentifier	 count Separator
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// start at index 1 to skip potential negative sign for year. 	TokenNameCOMMENT_LINE	start at index 1 to skip potential negative sign for year. 
int	TokenNameint	
timezoneOffset	TokenNameIdentifier	 timezone Offset
=	TokenNameEQUAL	
lexRep	TokenNameIdentifier	 lex Rep
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
timezoneOffset	TokenNameIdentifier	 timezone Offset
!=	TokenNameNOT_EQUAL	
NOT_FOUND	TokenNameIdentifier	 NOT  FOUND
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// found timezone, strip it off for distinguishing 	TokenNameCOMMENT_LINE	found timezone, strip it off for distinguishing 
// between Date, GYear and GYearMonth so possible 	TokenNameCOMMENT_LINE	between Date, GYear and GYearMonth so possible 
// negative sign in timezone is not mistaken as 	TokenNameCOMMENT_LINE	negative sign in timezone is not mistaken as 
// a separator. 	TokenNameCOMMENT_LINE	a separator. 
lexRepLength	TokenNameIdentifier	 lex Rep Length
-=	TokenNameMINUS_EQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
lexRepLength	TokenNameIdentifier	 lex Rep Length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lexRep	TokenNameIdentifier	 lex Rep
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
countSeparator	TokenNameIdentifier	 count Separator
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
countSeparator	TokenNameIdentifier	 count Separator
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// GYear 	TokenNameCOMMENT_LINE	GYear 
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
"%Y"	TokenNameStringLiteral	%Y
+	TokenNamePLUS	
"%z"	TokenNameStringLiteral	%z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
countSeparator	TokenNameIdentifier	 count Separator
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// GYearMonth 	TokenNameCOMMENT_LINE	GYearMonth 
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
"%Y-%M"	TokenNameStringLiteral	%Y-%M
+	TokenNamePLUS	
"%z"	TokenNameStringLiteral	%z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Date or invalid lexicalRepresentation 	TokenNameCOMMENT_LINE	Date or invalid lexicalRepresentation 
// Fix 4971612: invalid SCCS macro substitution in data string 	TokenNameCOMMENT_LINE	Fix 4971612: invalid SCCS macro substitution in data string 
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
"%Y-%M-%D"	TokenNameStringLiteral	%Y-%M-%D
+	TokenNamePLUS	
"%z"	TokenNameStringLiteral	%z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Parser	TokenNameIdentifier	 Parser
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Parser	TokenNameIdentifier	 Parser
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
lexRep	TokenNameIdentifier	 lex Rep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check for validity 	TokenNameCOMMENT_LINE	check for validity 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"InvalidXGCRepresentation"	TokenNameStringLiteral	InvalidXGCRepresentation
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
lexicalRepresentation	TokenNameIdentifier	 lexical Representation
}	TokenNameRBRACE	
)	TokenNameRPAREN	
//"\"" + lexicalRepresentation + "\" is not a valid representation of an XML Gregorian Calendar value." 	TokenNameCOMMENT_LINE	"\"" + lexicalRepresentation + "\" is not a valid representation of an XML Gregorian Calendar value." 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
save	TokenNameIdentifier	 save
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
void	TokenNamevoid	
save	TokenNameIdentifier	 save
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
orig_eon	TokenNameIdentifier	 orig eon
=	TokenNameEQUAL	
eon	TokenNameIdentifier	 eon
;	TokenNameSEMICOLON	
orig_year	TokenNameIdentifier	 orig year
=	TokenNameEQUAL	
year	TokenNameIdentifier	 year
;	TokenNameSEMICOLON	
orig_month	TokenNameIdentifier	 orig month
=	TokenNameEQUAL	
month	TokenNameIdentifier	 month
;	TokenNameSEMICOLON	
orig_day	TokenNameIdentifier	 orig day
=	TokenNameEQUAL	
day	TokenNameIdentifier	 day
;	TokenNameSEMICOLON	
orig_hour	TokenNameIdentifier	 orig hour
=	TokenNameEQUAL	
hour	TokenNameIdentifier	 hour
;	TokenNameSEMICOLON	
orig_minute	TokenNameIdentifier	 orig minute
=	TokenNameEQUAL	
minute	TokenNameIdentifier	 minute
;	TokenNameSEMICOLON	
orig_second	TokenNameIdentifier	 orig second
=	TokenNameEQUAL	
second	TokenNameIdentifier	 second
;	TokenNameSEMICOLON	
orig_fracSeconds	TokenNameIdentifier	 orig frac Seconds
=	TokenNameEQUAL	
fractionalSecond	TokenNameIdentifier	 fractional Second
;	TokenNameSEMICOLON	
orig_timezone	TokenNameIdentifier	 orig timezone
=	TokenNameEQUAL	
timezone	TokenNameIdentifier	 timezone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Create an instance with all date/time datatype fields set to * {@link DatatypeConstants#FIELD_UNDEFINED} or null respectively.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Create an instance with all date/time datatype fields set to {@link DatatypeConstants#FIELD_UNDEFINED} or null respectively.</p> 
public	TokenNamepublic	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// field initializers already do the correct initialization. 	TokenNameCOMMENT_LINE	field initializers already do the correct initialization. 
}	TokenNameRBRACE	
/** * <p>Private constructor allowing for complete value spaces allowed by * W3C XML Schema 1.0 recommendation for xsd:dateTime and related * builtin datatypes. Note that <code>year</code> parameter supports * arbitrarily large numbers and fractionalSecond has infinite * precision.</p> * * @param year of <code>XMLGregorianCalendar</code> to be created. * @param month of <code>XMLGregorianCalendar</code> to be created. * @param day of <code>XMLGregorianCalendar</code> to be created. * @param hour of <code>XMLGregorianCalendar</code> to be created. * @param minute of <code>XMLGregorianCalendar</code> to be created. * @param second of <code>XMLGregorianCalendar</code> to be created. * @param fractionalSecond of <code>XMLGregorianCalendar</code> to be created. * @param timezone of <code>XMLGregorianCalendar</code> to be created. * */	TokenNameCOMMENT_JAVADOC	 <p>Private constructor allowing for complete value spaces allowed by W3C XML Schema 1.0 recommendation for xsd:dateTime and related builtin datatypes. Note that <code>year</code> parameter supports arbitrarily large numbers and fractionalSecond has infinite precision.</p> * @param year of <code>XMLGregorianCalendar</code> to be created. @param month of <code>XMLGregorianCalendar</code> to be created. @param day of <code>XMLGregorianCalendar</code> to be created. @param hour of <code>XMLGregorianCalendar</code> to be created. @param minute of <code>XMLGregorianCalendar</code> to be created. @param second of <code>XMLGregorianCalendar</code> to be created. @param fractionalSecond of <code>XMLGregorianCalendar</code> to be created. @param timezone of <code>XMLGregorianCalendar</code> to be created. 
protected	TokenNameprotected	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
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
int	TokenNameint	
second	TokenNameIdentifier	 second
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
fractionalSecond	TokenNameIdentifier	 fractional Second
,	TokenNameCOMMA	
int	TokenNameint	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setYear	TokenNameIdentifier	 set Year
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMonth	TokenNameIdentifier	 set Month
(	TokenNameLPAREN	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setDay	TokenNameIdentifier	 set Day
(	TokenNameLPAREN	
day	TokenNameIdentifier	 day
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
hour	TokenNameIdentifier	 hour
,	TokenNameCOMMA	
minute	TokenNameIdentifier	 minute
,	TokenNameCOMMA	
second	TokenNameIdentifier	 second
,	TokenNameCOMMA	
fractionalSecond	TokenNameIdentifier	 fractional Second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTimezone	TokenNameIdentifier	 set Timezone
(	TokenNameLPAREN	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check for validity 	TokenNameCOMMENT_LINE	check for validity 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"InvalidXGCValue-fractional"	TokenNameStringLiteral	InvalidXGCValue-fractional
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
day	TokenNameIdentifier	 day
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
hour	TokenNameIdentifier	 hour
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
minute	TokenNameIdentifier	 minute
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fractionalSecond	TokenNameIdentifier	 fractional Second
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** String yearString = "null"; if (year != null) { yearString = year.toString(); } String fractionalSecondString = "null"; if (fractionalSecond != null) { fractionalSecondString = fractionalSecond.toString(); } throw new IllegalArgumentException( "year = " + yearString + ", month = " + month + ", day = " + day + ", hour = " + hour + ", minute = " + minute + ", second = " + second + ", fractionalSecond = " + fractionalSecondString + ", timezone = " + timezone + ", is not a valid representation of an XML Gregorian Calendar value." ); */	TokenNameCOMMENT_JAVADOC	 String yearString = "null"; if (year != null) { yearString = year.toString(); } String fractionalSecondString = "null"; if (fractionalSecond != null) { fractionalSecondString = fractionalSecond.toString(); } throw new IllegalArgumentException( "year = " + yearString + ", month = " + month + ", day = " + day + ", hour = " + hour + ", minute = " + minute + ", second = " + second + ", fractionalSecond = " + fractionalSecondString + ", timezone = " + timezone + ", is not a valid representation of an XML Gregorian Calendar value." ); 
}	TokenNameRBRACE	
save	TokenNameIdentifier	 save
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Private constructor of value spaces that a * <code>java.util.GregorianCalendar</code> instance would need to convert to an * <code>XMLGregorianCalendar</code> instance.</p> * * <p><code>XMLGregorianCalendar eon</code> and * <code>fractionalSecond</code> are set to <code>null</code></p> * * @param year of <code>XMLGregorianCalendar</code> to be created. * @param month of <code>XMLGregorianCalendar</code> to be created. * @param day of <code>XMLGregorianCalendar</code> to be created. * @param hour of <code>XMLGregorianCalendar</code> to be created. * @param minute of <code>XMLGregorianCalendar</code> to be created. * @param second of <code>XMLGregorianCalendar</code> to be created. * @param millisecond of <code>XMLGregorianCalendar</code> to be created. * @param timezone of <code>XMLGregorianCalendar</code> to be created. */	TokenNameCOMMENT_JAVADOC	 <p>Private constructor of value spaces that a <code>java.util.GregorianCalendar</code> instance would need to convert to an <code>XMLGregorianCalendar</code> instance.</p> * <p><code>XMLGregorianCalendar eon</code> and <code>fractionalSecond</code> are set to <code>null</code></p> * @param year of <code>XMLGregorianCalendar</code> to be created. @param month of <code>XMLGregorianCalendar</code> to be created. @param day of <code>XMLGregorianCalendar</code> to be created. @param hour of <code>XMLGregorianCalendar</code> to be created. @param minute of <code>XMLGregorianCalendar</code> to be created. @param second of <code>XMLGregorianCalendar</code> to be created. @param millisecond of <code>XMLGregorianCalendar</code> to be created. @param timezone of <code>XMLGregorianCalendar</code> to be created. 
private	TokenNameprivate	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
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
int	TokenNameint	
second	TokenNameIdentifier	 second
,	TokenNameCOMMA	
int	TokenNameint	
millisecond	TokenNameIdentifier	 millisecond
,	TokenNameCOMMA	
int	TokenNameint	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setYear	TokenNameIdentifier	 set Year
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMonth	TokenNameIdentifier	 set Month
(	TokenNameLPAREN	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setDay	TokenNameIdentifier	 set Day
(	TokenNameLPAREN	
day	TokenNameIdentifier	 day
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
hour	TokenNameIdentifier	 hour
,	TokenNameCOMMA	
minute	TokenNameIdentifier	 minute
,	TokenNameCOMMA	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTimezone	TokenNameIdentifier	 set Timezone
(	TokenNameLPAREN	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BigDecimal	TokenNameIdentifier	 Big Decimal
realMilliseconds	TokenNameIdentifier	 real Milliseconds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
millisecond	TokenNameIdentifier	 millisecond
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
realMilliseconds	TokenNameIdentifier	 real Milliseconds
=	TokenNameEQUAL	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
millisecond	TokenNameIdentifier	 millisecond
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setFractionalSecond	TokenNameIdentifier	 set Fractional Second
(	TokenNameLPAREN	
realMilliseconds	TokenNameIdentifier	 real Milliseconds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"InvalidXGCValue-milli"	TokenNameStringLiteral	InvalidXGCValue-milli
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
day	TokenNameIdentifier	 day
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
hour	TokenNameIdentifier	 hour
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
minute	TokenNameIdentifier	 minute
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
millisecond	TokenNameIdentifier	 millisecond
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* throw new IllegalArgumentException( "year = " + year + ", month = " + month + ", day = " + day + ", hour = " + hour + ", minute = " + minute + ", second = " + second + ", millisecond = " + millisecond + ", timezone = " + timezone + ", is not a valid representation of an XML Gregorian Calendar value." ); */	TokenNameCOMMENT_BLOCK	 throw new IllegalArgumentException( "year = " + year + ", month = " + month + ", day = " + day + ", hour = " + hour + ", minute = " + minute + ", second = " + second + ", millisecond = " + millisecond + ", timezone = " + timezone + ", is not a valid representation of an XML Gregorian Calendar value." ); 
}	TokenNameRBRACE	
save	TokenNameIdentifier	 save
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Convert a <code>java.util.GregorianCalendar</code> to XML Schema 1.0 * representation.</p> * * <table border="2" rules="all" cellpadding="2"> * <thead> * <tr> * <th align="center" colspan="2"> * Field by Field Conversion from * <code>java.util.GregorianCalendar</code> to this class * </th> * </tr> * </thead> * <tbody> * <tr> * <th><code>javax.xml.datatype.XMLGregorianCalendar</code> field</th> * <th><code>java.util.GregorianCalendar</code> field</th> * </tr> * <tr> * <th>{@link #setYear(int)}</th> * <th><code>ERA == GregorianCalendar.BC ? -YEAR : YEAR</code></th> * </tr> * <tr> * <th>{@link #setMonth(int)}</th> * <th><code>MONTH + 1</code></th> * </tr> * <tr> * <th>{@link #setDay(int)}</th> * <th><code>DAY_OF_MONTH</code></th> * </tr> * <tr> * <th>{@link #setTime(int,int,int, BigDecimal)}</th> * <th><code>HOUR_OF_DAY, MINUTE, SECOND, MILLISECOND</code></th> * </tr> * <tr> * <th>{@link #setTimezone(int)}<i>*</i></th> * <th><code>(ZONE_OFFSET + DST_OFFSET) / (60*1000)</code><br/> * <i>(in minutes)</i> * </th> * </tr> * </tbody> * </table> * <p><i>*</i>conversion loss of information. It is not possible to represent * a <code>java.util.GregorianCalendar</code> daylight savings timezone id in the * XML Schema 1.0 date/time datatype representation.</p> * * <p>To compute the return value's <code>TimeZone</code> field, * <ul> * <li>when <code>this.getTimezone() != DatatypeConstants.FIELD_UNDEFINED</code>, * create a <code>java.util.TimeZone</code> with a custom timezone id * using the <code>this.getTimezone()</code>.</li> * <li>else use the <code>GregorianCalendar</code> default timezone value * for the host is defined as specified by * <code>java.util.TimeZone.getDefault()</code>.</li></p> * * @param cal <code>java.util.GregorianCalendar</code> used to create <code>XMLGregorianCalendar</code> */	TokenNameCOMMENT_JAVADOC	 <p>Convert a <code>java.util.GregorianCalendar</code> to XML Schema 1.0 representation.</p> * <table border="2" rules="all" cellpadding="2"> <thead> <tr> <th align="center" colspan="2"> Field by Field Conversion from <code>java.util.GregorianCalendar</code> to this class </th> </tr> </thead> <tbody> <tr> <th><code>javax.xml.datatype.XMLGregorianCalendar</code> field</th> <th><code>java.util.GregorianCalendar</code> field</th> </tr> <tr> <th>{@link #setYear(int)}</th> <th><code>ERA == GregorianCalendar.BC ? -YEAR : YEAR</code></th> </tr> <tr> <th>{@link #setMonth(int)}</th> <th><code>MONTH + 1</code></th> </tr> <tr> <th>{@link #setDay(int)}</th> <th><code>DAY_OF_MONTH</code></th> </tr> <tr> <th>{@link #setTime(int,int,int, BigDecimal)}</th> <th><code>HOUR_OF_DAY, MINUTE, SECOND, MILLISECOND</code></th> </tr> <tr> <th>{@link #setTimezone(int)}<i>*</i></th> <th><code>(ZONE_OFFSET + DST_OFFSET) / (60*1000)</code><br/> <i>(in minutes)</i> </th> </tr> </tbody> </table> <p><i>*</i>conversion loss of information. It is not possible to represent a <code>java.util.GregorianCalendar</code> daylight savings timezone id in the XML Schema 1.0 date/time datatype representation.</p> * <p>To compute the return value's <code>TimeZone</code> field, <ul> <li>when <code>this.getTimezone() != DatatypeConstants.FIELD_UNDEFINED</code>, create a <code>java.util.TimeZone</code> with a custom timezone id using the <code>this.getTimezone()</code>.</li> <li>else use the <code>GregorianCalendar</code> default timezone value for the host is defined as specified by <code>java.util.TimeZone.getDefault()</code>.</li></p> * @param cal <code>java.util.GregorianCalendar</code> used to create <code>XMLGregorianCalendar</code> 
public	TokenNamepublic	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
(	TokenNameLPAREN	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
cal	TokenNameIdentifier	 cal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
ERA	TokenNameIdentifier	 ERA
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
BC	TokenNameIdentifier	 BC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
-	TokenNameMINUS	
year	TokenNameIdentifier	 year
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setYear	TokenNameIdentifier	 set Year
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Calendar.MONTH is zero based, XSD Date datatype's month field starts 	TokenNameCOMMENT_LINE	Calendar.MONTH is zero based, XSD Date datatype's month field starts 
// with JANUARY as 1. 	TokenNameCOMMENT_LINE	with JANUARY as 1. 
this	TokenNamethis	
.	TokenNameDOT	
setMonth	TokenNameIdentifier	 set Month
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setDay	TokenNameIdentifier	 set Day
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Calendar ZONE_OFFSET and DST_OFFSET fields are in milliseconds. 	TokenNameCOMMENT_LINE	Calendar ZONE_OFFSET and DST_OFFSET fields are in milliseconds. 
int	TokenNameint	
offsetInMinutes	TokenNameIdentifier	 offset In Minutes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
ZONE_OFFSET	TokenNameIdentifier	 ZONE  OFFSET
)	TokenNameRPAREN	
+	TokenNamePLUS	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DST_OFFSET	TokenNameIdentifier	 DST  OFFSET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setTimezone	TokenNameIdentifier	 set Timezone
(	TokenNameLPAREN	
offsetInMinutes	TokenNameIdentifier	 offset In Minutes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
save	TokenNameIdentifier	 save
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Factories 	TokenNameCOMMENT_LINE	Factories 
/** * <p>Create a Java representation of XML Schema builtin datatype <code>dateTime</code>. * All possible fields are specified for this factory method.</p> * * @param year represents both high-order eons and low-order year. * @param month of <code>dateTime</code> * @param day of <code>dateTime</code> * @param hours of <code>dateTime</code> * @param minutes of <code>dateTime</code> * @param seconds of <code>dateTime</code> * @param fractionalSecond value of null indicates optional field is absent. * @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set. * * @return <code>XMLGregorianCalendar</code> created from parameter values. * * @see DatatypeConstants#FIELD_UNDEFINED * * @throws IllegalArgumentException if any parameter is outside value * constraints for the field as specified in * <a href="#datetimefieldmapping">date/time field mapping table</a>. */	TokenNameCOMMENT_JAVADOC	 <p>Create a Java representation of XML Schema builtin datatype <code>dateTime</code>. All possible fields are specified for this factory method.</p> * @param year represents both high-order eons and low-order year. @param month of <code>dateTime</code> @param day of <code>dateTime</code> @param hours of <code>dateTime</code> @param minutes of <code>dateTime</code> @param seconds of <code>dateTime</code> @param fractionalSecond value of null indicates optional field is absent. @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set. * @return <code>XMLGregorianCalendar</code> created from parameter values. * @see DatatypeConstants#FIELD_UNDEFINED * @throws IllegalArgumentException if any parameter is outside value constraints for the field as specified in <a href="#datetimefieldmapping">date/time field mapping table</a>. 
public	TokenNamepublic	
static	TokenNamestatic	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
createDateTime	TokenNameIdentifier	 create Date Time
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
int	TokenNameint	
month	TokenNameIdentifier	 month
,	TokenNameCOMMA	
int	TokenNameint	
day	TokenNameIdentifier	 day
,	TokenNameCOMMA	
int	TokenNameint	
hours	TokenNameIdentifier	 hours
,	TokenNameCOMMA	
int	TokenNameint	
minutes	TokenNameIdentifier	 minutes
,	TokenNameCOMMA	
int	TokenNameint	
seconds	TokenNameIdentifier	 seconds
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
fractionalSecond	TokenNameIdentifier	 fractional Second
,	TokenNameCOMMA	
int	TokenNameint	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
month	TokenNameIdentifier	 month
,	TokenNameCOMMA	
day	TokenNameIdentifier	 day
,	TokenNameCOMMA	
hours	TokenNameIdentifier	 hours
,	TokenNameCOMMA	
minutes	TokenNameIdentifier	 minutes
,	TokenNameCOMMA	
seconds	TokenNameIdentifier	 seconds
,	TokenNameCOMMA	
fractionalSecond	TokenNameIdentifier	 fractional Second
,	TokenNameCOMMA	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Create a Java instance of XML Schema builtin datatype dateTime.</p> * * @param year represents both high-order eons and low-order year. * @param month of <code>dateTime</code> * @param day of <code>dateTime</code> * @param hour of <code>dateTime</code> * @param minute of <code>dateTime</code> * @param second of <code>dateTime</code> * * @return <code>XMLGregorianCalendar</code> created from parameter values. * * @throws IllegalArgumentException if any parameter is outside value constraints for the field as specified in * <a href="#datetimefieldmapping">date/time field mapping table</a>. * * @see DatatypeConstants#FIELD_UNDEFINED */	TokenNameCOMMENT_JAVADOC	 <p>Create a Java instance of XML Schema builtin datatype dateTime.</p> * @param year represents both high-order eons and low-order year. @param month of <code>dateTime</code> @param day of <code>dateTime</code> @param hour of <code>dateTime</code> @param minute of <code>dateTime</code> @param second of <code>dateTime</code> * @return <code>XMLGregorianCalendar</code> created from parameter values. * @throws IllegalArgumentException if any parameter is outside value constraints for the field as specified in <a href="#datetimefieldmapping">date/time field mapping table</a>. * @see DatatypeConstants#FIELD_UNDEFINED 
public	TokenNamepublic	
static	TokenNamestatic	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
createDateTime	TokenNameIdentifier	 create Date Time
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
int	TokenNameint	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
(	TokenNameLPAREN	
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
second	TokenNameIdentifier	 second
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
//millisecond 	TokenNameCOMMENT_LINE	millisecond 
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
//timezone 	TokenNameCOMMENT_LINE	timezone 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Create a Java representation of XML Schema builtin datatype <code>dateTime</code>. * All possible fields are specified for this factory method.</p> * * @param year represents low-order year. * @param month of <code>dateTime</code> * @param day of <code>dateTime</code> * @param hours of <code>dateTime</code> * @param minutes of <code>dateTime</code> * @param seconds of <code>dateTime</code> * @param milliseconds of <code>dateTime</code>. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set. * @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set. * * @return <code>XMLGregorianCalendar</code> created from parameter values. * * @throws IllegalArgumentException if any parameter is outside value constraints for the field as specified in * <a href="#datetimefieldmapping">date/time field mapping table</a>. * * @see DatatypeConstants#FIELD_UNDEFINED */	TokenNameCOMMENT_JAVADOC	 <p>Create a Java representation of XML Schema builtin datatype <code>dateTime</code>. All possible fields are specified for this factory method.</p> * @param year represents low-order year. @param month of <code>dateTime</code> @param day of <code>dateTime</code> @param hours of <code>dateTime</code> @param minutes of <code>dateTime</code> @param seconds of <code>dateTime</code> @param milliseconds of <code>dateTime</code>. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set. @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set. * @return <code>XMLGregorianCalendar</code> created from parameter values. * @throws IllegalArgumentException if any parameter is outside value constraints for the field as specified in <a href="#datetimefieldmapping">date/time field mapping table</a>. * @see DatatypeConstants#FIELD_UNDEFINED 
public	TokenNamepublic	
static	TokenNamestatic	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
createDateTime	TokenNameIdentifier	 create Date Time
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
hours	TokenNameIdentifier	 hours
,	TokenNameCOMMA	
int	TokenNameint	
minutes	TokenNameIdentifier	 minutes
,	TokenNameCOMMA	
int	TokenNameint	
seconds	TokenNameIdentifier	 seconds
,	TokenNameCOMMA	
int	TokenNameint	
milliseconds	TokenNameIdentifier	 milliseconds
,	TokenNameCOMMA	
int	TokenNameint	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
month	TokenNameIdentifier	 month
,	TokenNameCOMMA	
day	TokenNameIdentifier	 day
,	TokenNameCOMMA	
hours	TokenNameIdentifier	 hours
,	TokenNameCOMMA	
minutes	TokenNameIdentifier	 minutes
,	TokenNameCOMMA	
seconds	TokenNameIdentifier	 seconds
,	TokenNameCOMMA	
milliseconds	TokenNameIdentifier	 milliseconds
,	TokenNameCOMMA	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Create a Java representation of XML Schema builtin datatype <code>date</code> or <code>g*</code>.</p> * * <p>For example, an instance of <code>gYear</code> can be created invoking this factory * with <code>month</code> and <code>day</code> parameters set to * {@link DatatypeConstants#FIELD_UNDEFINED}.</p> * * @param year of <code>XMLGregorianCalendar</code> to be created. * @param month of <code>XMLGregorianCalendar</code> to be created. * @param day of <code>XMLGregorianCalendar</code> to be created. * @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set. * * @return <code>XMLGregorianCalendar</code> created from parameter values. * * @see DatatypeConstants#FIELD_UNDEFINED * * @throws IllegalArgumentException if any parameter is outside value * constraints for the field as specified in * <a href="#datetimefieldmapping">date/time field mapping table</a>. */	TokenNameCOMMENT_JAVADOC	 <p>Create a Java representation of XML Schema builtin datatype <code>date</code> or <code>g*</code>.</p> * <p>For example, an instance of <code>gYear</code> can be created invoking this factory with <code>month</code> and <code>day</code> parameters set to {@link DatatypeConstants#FIELD_UNDEFINED}.</p> * @param year of <code>XMLGregorianCalendar</code> to be created. @param month of <code>XMLGregorianCalendar</code> to be created. @param day of <code>XMLGregorianCalendar</code> to be created. @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set. * @return <code>XMLGregorianCalendar</code> created from parameter values. * @see DatatypeConstants#FIELD_UNDEFINED * @throws IllegalArgumentException if any parameter is outside value constraints for the field as specified in <a href="#datetimefieldmapping">date/time field mapping table</a>. 
public	TokenNamepublic	
static	TokenNamestatic	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
createDate	TokenNameIdentifier	 create Date
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
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
month	TokenNameIdentifier	 month
,	TokenNameCOMMA	
day	TokenNameIdentifier	 day
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
// hour 	TokenNameCOMMENT_LINE	hour 
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
// minute 	TokenNameCOMMENT_LINE	minute 
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
// second 	TokenNameCOMMENT_LINE	second 
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
// millisecond 	TokenNameCOMMENT_LINE	millisecond 
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a Java instance of XML Schema builtin datatype <code>time</code>. * @param hours number of hours * @param minutes number of minutes * @param seconds number of seconds * @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set. * * @return <code>XMLGregorianCalendar</code> created from parameter values. * * @see DatatypeConstants#FIELD_UNDEFINED * * @throws IllegalArgumentException if any parameter is outside value * constraints for the field as specified in * <a href="#datetimefieldmapping">date/time field mapping table</a>. */	TokenNameCOMMENT_JAVADOC	 Create a Java instance of XML Schema builtin datatype <code>time</code>. @param hours number of hours @param minutes number of minutes @param seconds number of seconds @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set. * @return <code>XMLGregorianCalendar</code> created from parameter values. * @see DatatypeConstants#FIELD_UNDEFINED * @throws IllegalArgumentException if any parameter is outside value constraints for the field as specified in <a href="#datetimefieldmapping">date/time field mapping table</a>. 
public	TokenNamepublic	
static	TokenNamestatic	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
createTime	TokenNameIdentifier	 create Time
(	TokenNameLPAREN	
int	TokenNameint	
hours	TokenNameIdentifier	 hours
,	TokenNameCOMMA	
int	TokenNameint	
minutes	TokenNameIdentifier	 minutes
,	TokenNameCOMMA	
int	TokenNameint	
seconds	TokenNameIdentifier	 seconds
,	TokenNameCOMMA	
int	TokenNameint	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
// Year 	TokenNameCOMMENT_LINE	Year 
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
// Month 	TokenNameCOMMENT_LINE	Month 
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
// Day 	TokenNameCOMMENT_LINE	Day 
hours	TokenNameIdentifier	 hours
,	TokenNameCOMMA	
minutes	TokenNameIdentifier	 minutes
,	TokenNameCOMMA	
seconds	TokenNameIdentifier	 seconds
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
//Millisecond 	TokenNameCOMMENT_LINE	Millisecond 
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Create a Java instance of XML Schema builtin datatype time.</p> * * @param hours number of hours * @param minutes number of minutes * @param seconds number of seconds * @param fractionalSecond value of <code>null</code> indicates that this optional field is not set. * @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set. * * @return <code>XMLGregorianCalendar</code> created from parameter values. * * @see DatatypeConstants#FIELD_UNDEFINED * * @throws IllegalArgumentException if any parameter is outside value * constraints for the field as specified in * <a href="#datetimefieldmapping">date/time field mapping table</a>. */	TokenNameCOMMENT_JAVADOC	 <p>Create a Java instance of XML Schema builtin datatype time.</p> * @param hours number of hours @param minutes number of minutes @param seconds number of seconds @param fractionalSecond value of <code>null</code> indicates that this optional field is not set. @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set. * @return <code>XMLGregorianCalendar</code> created from parameter values. * @see DatatypeConstants#FIELD_UNDEFINED * @throws IllegalArgumentException if any parameter is outside value constraints for the field as specified in <a href="#datetimefieldmapping">date/time field mapping table</a>. 
public	TokenNamepublic	
static	TokenNamestatic	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
createTime	TokenNameIdentifier	 create Time
(	TokenNameLPAREN	
int	TokenNameint	
hours	TokenNameIdentifier	 hours
,	TokenNameCOMMA	
int	TokenNameint	
minutes	TokenNameIdentifier	 minutes
,	TokenNameCOMMA	
int	TokenNameint	
seconds	TokenNameIdentifier	 seconds
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
fractionalSecond	TokenNameIdentifier	 fractional Second
,	TokenNameCOMMA	
int	TokenNameint	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
// Year 	TokenNameCOMMENT_LINE	Year 
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
// month 	TokenNameCOMMENT_LINE	month 
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
// day 	TokenNameCOMMENT_LINE	day 
hours	TokenNameIdentifier	 hours
,	TokenNameCOMMA	
minutes	TokenNameIdentifier	 minutes
,	TokenNameCOMMA	
seconds	TokenNameIdentifier	 seconds
,	TokenNameCOMMA	
fractionalSecond	TokenNameIdentifier	 fractional Second
,	TokenNameCOMMA	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Create a Java instance of XML Schema builtin datatype time.</p> * * @param hours number of hours * @param minutes number of minutes * @param seconds number of seconds * @param milliseconds number of milliseconds * @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set. * * @return <code>XMLGregorianCalendar</code> created from parameter values. * * @see DatatypeConstants#FIELD_UNDEFINED * * @throws IllegalArgumentException if any parameter is outside value * constraints for the field as specified in * <a href="#datetimefieldmapping">date/time field mapping table</a>. */	TokenNameCOMMENT_JAVADOC	 <p>Create a Java instance of XML Schema builtin datatype time.</p> * @param hours number of hours @param minutes number of minutes @param seconds number of seconds @param milliseconds number of milliseconds @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set. * @return <code>XMLGregorianCalendar</code> created from parameter values. * @see DatatypeConstants#FIELD_UNDEFINED * @throws IllegalArgumentException if any parameter is outside value constraints for the field as specified in <a href="#datetimefieldmapping">date/time field mapping table</a>. 
public	TokenNamepublic	
static	TokenNamestatic	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
createTime	TokenNameIdentifier	 create Time
(	TokenNameLPAREN	
int	TokenNameint	
hours	TokenNameIdentifier	 hours
,	TokenNameCOMMA	
int	TokenNameint	
minutes	TokenNameIdentifier	 minutes
,	TokenNameCOMMA	
int	TokenNameint	
seconds	TokenNameIdentifier	 seconds
,	TokenNameCOMMA	
int	TokenNameint	
milliseconds	TokenNameIdentifier	 milliseconds
,	TokenNameCOMMA	
int	TokenNameint	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
// year 	TokenNameCOMMENT_LINE	year 
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
// month 	TokenNameCOMMENT_LINE	month 
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
,	TokenNameCOMMA	
// day 	TokenNameCOMMENT_LINE	day 
hours	TokenNameIdentifier	 hours
,	TokenNameCOMMA	
minutes	TokenNameIdentifier	 minutes
,	TokenNameCOMMA	
seconds	TokenNameIdentifier	 seconds
,	TokenNameCOMMA	
milliseconds	TokenNameIdentifier	 milliseconds
,	TokenNameCOMMA	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Accessors 	TokenNameCOMMENT_LINE	Accessors 
/** * <p>Return high order component for XML Schema 1.0 dateTime datatype field for * <code>year</code>. * <code>null</code> if this optional part of the year field is not defined.</p> * * <p>Value constraints for this value are summarized in * <a href="#datetimefield-year">year field of date/time field mapping table</a>.</p> * @return eon of this <code>XMLGregorianCalendar</code>. The value * returned is an integer multiple of 10^9. * * @see #getYear() * @see #getEonAndYear() */	TokenNameCOMMENT_JAVADOC	 <p>Return high order component for XML Schema 1.0 dateTime datatype field for <code>year</code>. <code>null</code> if this optional part of the year field is not defined.</p> * <p>Value constraints for this value are summarized in <a href="#datetimefield-year">year field of date/time field mapping table</a>.</p> @return eon of this <code>XMLGregorianCalendar</code>. The value returned is an integer multiple of 10^9. * @see #getYear() @see #getEonAndYear() 
public	TokenNamepublic	
BigInteger	TokenNameIdentifier	 Big Integer
getEon	TokenNameIdentifier	 get Eon
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
eon	TokenNameIdentifier	 eon
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Return low order component for XML Schema 1.0 dateTime datatype field for * <code>year</code> or {@link DatatypeConstants#FIELD_UNDEFINED}.</p> * * <p>Value constraints for this value are summarized in * <a href="#datetimefield-year">year field of date/time field mapping table</a>.</p> * * @return year of this <code>XMLGregorianCalendar</code>. * * @see #getEon() * @see #getEonAndYear() */	TokenNameCOMMENT_JAVADOC	 <p>Return low order component for XML Schema 1.0 dateTime datatype field for <code>year</code> or {@link DatatypeConstants#FIELD_UNDEFINED}.</p> * <p>Value constraints for this value are summarized in <a href="#datetimefield-year">year field of date/time field mapping table</a>.</p> * @return year of this <code>XMLGregorianCalendar</code>. * @see #getEon() @see #getEonAndYear() 
public	TokenNamepublic	
int	TokenNameint	
getYear	TokenNameIdentifier	 get Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
year	TokenNameIdentifier	 year
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Return XML Schema 1.0 dateTime datatype field for * <code>year</code>.</p> * * <p>Value constraints for this value are summarized in * <a href="#datetimefield-year">year field of date/time field mapping table</a>.</p> * * @return sum of <code>eon</code> and <code>BigInteger.valueOf(year)</code> * when both fields are defined. When only <code>year</code> is defined, * return it. When both <code>eon</code> and <code>year</code> are not * defined, return <code>null</code>. * * @see #getEon() * @see #getYear() */	TokenNameCOMMENT_JAVADOC	 <p>Return XML Schema 1.0 dateTime datatype field for <code>year</code>.</p> * <p>Value constraints for this value are summarized in <a href="#datetimefield-year">year field of date/time field mapping table</a>.</p> * @return sum of <code>eon</code> and <code>BigInteger.valueOf(year)</code> when both fields are defined. When only <code>year</code> is defined, return it. When both <code>eon</code> and <code>year</code> are not defined, return <code>null</code>. * @see #getEon() @see #getYear() 
public	TokenNamepublic	
BigInteger	TokenNameIdentifier	 Big Integer
getEonAndYear	TokenNameIdentifier	 get Eon And Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// both are defined 	TokenNameCOMMENT_LINE	both are defined 
if	TokenNameif	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
eon	TokenNameIdentifier	 eon
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
eon	TokenNameIdentifier	 eon
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// only year is defined 	TokenNameCOMMENT_LINE	only year is defined 
if	TokenNameif	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
eon	TokenNameIdentifier	 eon
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// neither are defined 	TokenNameCOMMENT_LINE	neither are defined 
// or only eon is defined which is not valid without a year 	TokenNameCOMMENT_LINE	or only eon is defined which is not valid without a year 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Return number of month or {@link DatatypeConstants#FIELD_UNDEFINED}.</p> * * <p>Value constraints for this value are summarized in * <a href="#datetimefield-month">month field of date/time field mapping table</a>.</p> * * @return year of this <code>XMLGregorianCalendar</code>. * */	TokenNameCOMMENT_JAVADOC	 <p>Return number of month or {@link DatatypeConstants#FIELD_UNDEFINED}.</p> * <p>Value constraints for this value are summarized in <a href="#datetimefield-month">month field of date/time field mapping table</a>.</p> * @return year of this <code>XMLGregorianCalendar</code>. 
public	TokenNamepublic	
int	TokenNameint	
getMonth	TokenNameIdentifier	 get Month
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
month	TokenNameIdentifier	 month
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return day in month or {@link DatatypeConstants#FIELD_UNDEFINED}.</p> * * <p>Value constraints for this value are summarized in * <a href="#datetimefield-day">day field of date/time field mapping table</a>.</p> * * @see #setDay(int) */	TokenNameCOMMENT_JAVADOC	 Return day in month or {@link DatatypeConstants#FIELD_UNDEFINED}.</p> * <p>Value constraints for this value are summarized in <a href="#datetimefield-day">day field of date/time field mapping table</a>.</p> * @see #setDay(int) 
public	TokenNamepublic	
int	TokenNameint	
getDay	TokenNameIdentifier	 get Day
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
day	TokenNameIdentifier	 day
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return timezone offset in minutes or * {@link DatatypeConstants#FIELD_UNDEFINED} if this optional field is not defined. * * <p>Value constraints for this value are summarized in * <a href="#datetimefield-timezone">timezone field of date/time field mapping table</a>.</p> * * @see #setTimezone(int) */	TokenNameCOMMENT_JAVADOC	 Return timezone offset in minutes or {@link DatatypeConstants#FIELD_UNDEFINED} if this optional field is not defined. * <p>Value constraints for this value are summarized in <a href="#datetimefield-timezone">timezone field of date/time field mapping table</a>.</p> * @see #setTimezone(int) 
public	TokenNamepublic	
int	TokenNameint	
getTimezone	TokenNameIdentifier	 get Timezone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timezone	TokenNameIdentifier	 timezone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return hours or {@link DatatypeConstants#FIELD_UNDEFINED}. * Returns {@link DatatypeConstants#FIELD_UNDEFINED} if this field is not defined. * * <p>Value constraints for this value are summarized in * <a href="#datetimefield-hour">hour field of date/time field mapping table</a>.</p> * @see #setTime(int, int, int) */	TokenNameCOMMENT_JAVADOC	 Return hours or {@link DatatypeConstants#FIELD_UNDEFINED}. Returns {@link DatatypeConstants#FIELD_UNDEFINED} if this field is not defined. * <p>Value constraints for this value are summarized in <a href="#datetimefield-hour">hour field of date/time field mapping table</a>.</p> @see #setTime(int, int, int) 
public	TokenNamepublic	
int	TokenNameint	
getHour	TokenNameIdentifier	 get Hour
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hour	TokenNameIdentifier	 hour
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return minutes or {@link DatatypeConstants#FIELD_UNDEFINED}.<\p> * Returns {@link DatatypeConstants#FIELD_UNDEFINED} if this field is not defined. * * <p>Value constraints for this value are summarized in * <a href="#datetimefield-minute">minute field of date/time field mapping table</a>.</p> * @see #setTime(int, int, int) */	TokenNameCOMMENT_JAVADOC	 Return minutes or {@link DatatypeConstants#FIELD_UNDEFINED}.<\p> Returns {@link DatatypeConstants#FIELD_UNDEFINED} if this field is not defined. * <p>Value constraints for this value are summarized in <a href="#datetimefield-minute">minute field of date/time field mapping table</a>.</p> @see #setTime(int, int, int) 
public	TokenNamepublic	
int	TokenNameint	
getMinute	TokenNameIdentifier	 get Minute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
minute	TokenNameIdentifier	 minute
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Return seconds or {@link DatatypeConstants#FIELD_UNDEFINED}.<\p> * * <p>Returns {@link DatatypeConstants#FIELD_UNDEFINED} if this field is not defined. * When this field is not defined, the optional xs:dateTime * fractional seconds field, represented by * {@link #getFractionalSecond()} and {@link #getMillisecond()}, * must not be defined.</p> * * <p>Value constraints for this value are summarized in * <a href="#datetimefield-second">second field of date/time field mapping table</a>.</p> * * @return Second of this <code>XMLGregorianCalendar</code>. * * @see #getFractionalSecond() * @see #getMillisecond() * @see #setTime(int, int, int) */	TokenNameCOMMENT_JAVADOC	 <p>Return seconds or {@link DatatypeConstants#FIELD_UNDEFINED}.<\p> * <p>Returns {@link DatatypeConstants#FIELD_UNDEFINED} if this field is not defined. When this field is not defined, the optional xs:dateTime fractional seconds field, represented by {@link #getFractionalSecond()} and {@link #getMillisecond()}, must not be defined.</p> * <p>Value constraints for this value are summarized in <a href="#datetimefield-second">second field of date/time field mapping table</a>.</p> * @return Second of this <code>XMLGregorianCalendar</code>. * @see #getFractionalSecond() @see #getMillisecond() @see #setTime(int, int, int) 
public	TokenNamepublic	
int	TokenNameint	
getSecond	TokenNameIdentifier	 get Second
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
second	TokenNameIdentifier	 second
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return result of adding second and fractional second field */	TokenNameCOMMENT_JAVADOC	 @return result of adding second and fractional second field 
private	TokenNameprivate	
BigDecimal	TokenNameIdentifier	 Big Decimal
getSeconds	TokenNameIdentifier	 get Seconds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DECIMAL_ZERO	TokenNameIdentifier	 DECIMAL  ZERO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BigDecimal	TokenNameIdentifier	 Big Decimal
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fractionalSecond	TokenNameIdentifier	 fractional Second
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fractionalSecond	TokenNameIdentifier	 fractional Second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Return millisecond precision of {@link #getFractionalSecond()}.<\p> * * <p>This method represents a convenience accessor to infinite * precision fractional second value returned by * {@link #getFractionalSecond()}. The returned value is the rounded * down to milliseconds value of * {@link #getFractionalSecond()}. When {@link #getFractionalSecond()} * returns <code>null</code>, this method must return * {@link DatatypeConstants#FIELD_UNDEFINED}.</p> * * <p>Value constraints for this value are summarized in * <a href="#datetimefield-second">second field of date/time field mapping table</a>.</p> * * @return Millisecond of this <code>XMLGregorianCalendar</code>. * * @see #getFractionalSecond() * @see #setTime(int, int, int) */	TokenNameCOMMENT_JAVADOC	 <p>Return millisecond precision of {@link #getFractionalSecond()}.<\p> * <p>This method represents a convenience accessor to infinite precision fractional second value returned by {@link #getFractionalSecond()}. The returned value is the rounded down to milliseconds value of {@link #getFractionalSecond()}. When {@link #getFractionalSecond()} returns <code>null</code>, this method must return {@link DatatypeConstants#FIELD_UNDEFINED}.</p> * <p>Value constraints for this value are summarized in <a href="#datetimefield-second">second field of date/time field mapping table</a>.</p> * @return Millisecond of this <code>XMLGregorianCalendar</code>. * @see #getFractionalSecond() @see #setTime(int, int, int) 
public	TokenNamepublic	
int	TokenNameint	
getMillisecond	TokenNameIdentifier	 get Millisecond
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fractionalSecond	TokenNameIdentifier	 fractional Second
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// TODO: Non-optimal solution for now. 	TokenNameCOMMENT_LINE	TODO: Non-optimal solution for now. 
// Efficient implementation would only store as BigDecimal 	TokenNameCOMMENT_LINE	Efficient implementation would only store as BigDecimal 
// when needed and millisecond otherwise. 	TokenNameCOMMENT_LINE	when needed and millisecond otherwise. 
return	TokenNamereturn	
fractionalSecond	TokenNameIdentifier	 fractional Second
.	TokenNameDOT	
movePointRight	TokenNameIdentifier	 move Point Right
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Return fractional seconds.</p> * * <p><code>null</code> is returned when this optional field is not defined.</p> * * <p>Value constraints are detailed in * <a href="#datetimefield-second">second field of date/time field mapping table</a>.</p> * * <p>This optional field can only have a defined value when the * xs:dateTime second field, represented by ({@link #getSecond()}, * does not return {@link DatatypeConstants#FIELD_UNDEFINED}).</p> * * @return fractional seconds of this <code>XMLGregorianCalendar</code>. * * @see #getSecond() * @see #setTime(int, int, int, BigDecimal) */	TokenNameCOMMENT_JAVADOC	 <p>Return fractional seconds.</p> * <p><code>null</code> is returned when this optional field is not defined.</p> * <p>Value constraints are detailed in <a href="#datetimefield-second">second field of date/time field mapping table</a>.</p> * <p>This optional field can only have a defined value when the xs:dateTime second field, represented by ({@link #getSecond()}, does not return {@link DatatypeConstants#FIELD_UNDEFINED}).</p> * @return fractional seconds of this <code>XMLGregorianCalendar</code>. * @see #getSecond() @see #setTime(int, int, int, BigDecimal) 
public	TokenNamepublic	
BigDecimal	TokenNameIdentifier	 Big Decimal
getFractionalSecond	TokenNameIdentifier	 get Fractional Second
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fractionalSecond	TokenNameIdentifier	 fractional Second
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setters 	TokenNameCOMMENT_LINE	setters 
/** * <p>Set low and high order component of XSD <code>dateTime</code> year field.</p> * * <p>Unset this field by invoking the setter with a parameter value of <code>null</code>.</p> * * @param year value constraints summarized in <a href="#datetimefield-year">year field of date/time field mapping table</a>. * * @throws IllegalArgumentException if <code>year</code> parameter is * outside value constraints for the field as specified in * <a href="#datetimefieldmapping">date/time field mapping table</a>. */	TokenNameCOMMENT_JAVADOC	 <p>Set low and high order component of XSD <code>dateTime</code> year field.</p> * <p>Unset this field by invoking the setter with a parameter value of <code>null</code>.</p> * @param year value constraints summarized in <a href="#datetimefield-year">year field of date/time field mapping table</a>. * @throws IllegalArgumentException if <code>year</code> parameter is outside value constraints for the field as specified in <a href="#datetimefieldmapping">date/time field mapping table</a>. 
public	TokenNamepublic	
void	TokenNamevoid	
setYear	TokenNameIdentifier	 set Year
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
eon	TokenNameIdentifier	 eon
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
year	TokenNameIdentifier	 year
.	TokenNameDOT	
remainder	TokenNameIdentifier	 remainder
(	TokenNameLPAREN	
BILLION_B	TokenNameIdentifier	 BILLION  B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setEon	TokenNameIdentifier	 set Eon
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Set year of XSD <code>dateTime</code> year field.</p> * * <p>Unset this field by invoking the setter with a parameter value of * {@link DatatypeConstants#FIELD_UNDEFINED}.</p> * * <p>Note: if the absolute value of the <code>year</code> parameter * is less than 10^9, the eon component of the XSD year field is set to * <code>null</code> by this method.</p> * * @param year value constraints are summarized in <a href="#datetimefield-year">year field of date/time field mapping table</a>. * If year is {@link DatatypeConstants#FIELD_UNDEFINED}, then eon is set to <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 <p>Set year of XSD <code>dateTime</code> year field.</p> * <p>Unset this field by invoking the setter with a parameter value of {@link DatatypeConstants#FIELD_UNDEFINED}.</p> * <p>Note: if the absolute value of the <code>year</code> parameter is less than 10^9, the eon component of the XSD year field is set to <code>null</code> by this method.</p> * @param year value constraints are summarized in <a href="#datetimefield-year">year field of date/time field mapping table</a>. If year is {@link DatatypeConstants#FIELD_UNDEFINED}, then eon is set to <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setYear	TokenNameIdentifier	 set Year
(	TokenNameLPAREN	
int	TokenNameint	
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
eon	TokenNameIdentifier	 eon
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
<	TokenNameLESS	
BILLION_I	TokenNameIdentifier	 BILLION  I
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
eon	TokenNameIdentifier	 eon
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
theYear	TokenNameIdentifier	 the Year
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BigInteger	TokenNameIdentifier	 Big Integer
remainder	TokenNameIdentifier	 remainder
=	TokenNameEQUAL	
theYear	TokenNameIdentifier	 the Year
.	TokenNameDOT	
remainder	TokenNameIdentifier	 remainder
(	TokenNameLPAREN	
BILLION_B	TokenNameIdentifier	 BILLION  B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
remainder	TokenNameIdentifier	 remainder
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setEon	TokenNameIdentifier	 set Eon
(	TokenNameLPAREN	
theYear	TokenNameIdentifier	 the Year
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
remainder	TokenNameIdentifier	 remainder
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Set high order part of XSD <code>dateTime</code> year field.</p> * * <p>Unset this field by invoking the setter with a parameter value of * <code>null</code>.</p> * * @param eon value constraints summarized in <a href="#datetimefield-year">year field of date/time field mapping table</a>. */	TokenNameCOMMENT_JAVADOC	 <p>Set high order part of XSD <code>dateTime</code> year field.</p> * <p>Unset this field by invoking the setter with a parameter value of <code>null</code>.</p> * @param eon value constraints summarized in <a href="#datetimefield-year">year field of date/time field mapping table</a>. 
private	TokenNameprivate	
void	TokenNamevoid	
setEon	TokenNameIdentifier	 set Eon
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
eon	TokenNameIdentifier	 eon
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
eon	TokenNameIdentifier	 eon
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
eon	TokenNameIdentifier	 eon
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
ZERO	TokenNameIdentifier	 ZERO
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Treat ZERO as field being undefined. 	TokenNameCOMMENT_LINE	Treat ZERO as field being undefined. 
this	TokenNamethis	
.	TokenNameDOT	
eon	TokenNameIdentifier	 eon
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
eon	TokenNameIdentifier	 eon
=	TokenNameEQUAL	
eon	TokenNameIdentifier	 eon
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Set month.</p> * * <p>Unset this field by invoking the setter with a parameter value of {@link DatatypeConstants#FIELD_UNDEFINED}.</p> * * @param month value constraints summarized in <a href="#datetimefield-month">month field of date/time field mapping table</a>. * * @throws IllegalArgumentException if <code>month</code> parameter is * outside value constraints for the field as specified in * <a href="#datetimefieldmapping">date/time field mapping table</a>. */	TokenNameCOMMENT_JAVADOC	 <p>Set month.</p> * <p>Unset this field by invoking the setter with a parameter value of {@link DatatypeConstants#FIELD_UNDEFINED}.</p> * @param month value constraints summarized in <a href="#datetimefield-month">month field of date/time field mapping table</a>. * @throws IllegalArgumentException if <code>month</code> parameter is outside value constraints for the field as specified in <a href="#datetimefieldmapping">date/time field mapping table</a>. 
public	TokenNamepublic	
void	TokenNamevoid	
setMonth	TokenNameIdentifier	 set Month
(	TokenNameLPAREN	
int	TokenNameint	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkFieldValueConstraint	TokenNameIdentifier	 check Field Value Constraint
(	TokenNameLPAREN	
MONTH	TokenNameIdentifier	 MONTH
,	TokenNameCOMMA	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
month	TokenNameIdentifier	 month
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Set days in month.</p> * * <p>Unset this field by invoking the setter with a parameter value of {@link DatatypeConstants#FIELD_UNDEFINED}.</p> * * @param day value constraints summarized in <a href="#datetimefield-day">day field of date/time field mapping table</a>. * * @throws IllegalArgumentException if <code>day</code> parameter is * outside value constraints for the field as specified in * <a href="#datetimefieldmapping">date/time field mapping table</a>. */	TokenNameCOMMENT_JAVADOC	 <p>Set days in month.</p> * <p>Unset this field by invoking the setter with a parameter value of {@link DatatypeConstants#FIELD_UNDEFINED}.</p> * @param day value constraints summarized in <a href="#datetimefield-day">day field of date/time field mapping table</a>. * @throws IllegalArgumentException if <code>day</code> parameter is outside value constraints for the field as specified in <a href="#datetimefieldmapping">date/time field mapping table</a>. 
public	TokenNamepublic	
void	TokenNamevoid	
setDay	TokenNameIdentifier	 set Day
(	TokenNameLPAREN	
int	TokenNameint	
day	TokenNameIdentifier	 day
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkFieldValueConstraint	TokenNameIdentifier	 check Field Value Constraint
(	TokenNameLPAREN	
DAY	TokenNameIdentifier	 DAY
,	TokenNameCOMMA	
day	TokenNameIdentifier	 day
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
day	TokenNameIdentifier	 day
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Set the number of minutes in the timezone offset.</p> * * <p>Unset this field by invoking the setter with a parameter value of {@link DatatypeConstants#FIELD_UNDEFINED}.</p> * * @param offset value constraints summarized in <a href="#datetimefield-timezone"> * timezone field of date/time field mapping table</a>. * * @throws IllegalArgumentException if <code>offset</code> parameter is * outside value constraints for the field as specified in * <a href="#datetimefieldmapping">date/time field mapping table</a>. */	TokenNameCOMMENT_JAVADOC	 <p>Set the number of minutes in the timezone offset.</p> * <p>Unset this field by invoking the setter with a parameter value of {@link DatatypeConstants#FIELD_UNDEFINED}.</p> * @param offset value constraints summarized in <a href="#datetimefield-timezone"> timezone field of date/time field mapping table</a>. * @throws IllegalArgumentException if <code>offset</code> parameter is outside value constraints for the field as specified in <a href="#datetimefieldmapping">date/time field mapping table</a>. 
public	TokenNamepublic	
void	TokenNamevoid	
setTimezone	TokenNameIdentifier	 set Timezone
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkFieldValueConstraint	TokenNameIdentifier	 check Field Value Constraint
(	TokenNameLPAREN	
TIMEZONE	TokenNameIdentifier	 TIMEZONE
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
timezone	TokenNameIdentifier	 timezone
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Set time as one unit.</p> * * @param hour value constraints are summarized in * <a href="#datetimefield-hour">hour field of date/time field mapping table</a>. * @param minute value constraints are summarized in * <a href="#datetimefield-minute">minute field of date/time field mapping table</a>. * @param second value constraints are summarized in * <a href="#datetimefield-second">second field of date/time field mapping table</a>. * * @see #setTime(int, int, int, BigDecimal) * * @throws IllegalArgumentException if any parameter is * outside value constraints for the field as specified in * <a href="#datetimefieldmapping">date/time field mapping table</a>. */	TokenNameCOMMENT_JAVADOC	 <p>Set time as one unit.</p> * @param hour value constraints are summarized in <a href="#datetimefield-hour">hour field of date/time field mapping table</a>. @param minute value constraints are summarized in <a href="#datetimefield-minute">minute field of date/time field mapping table</a>. @param second value constraints are summarized in <a href="#datetimefield-second">second field of date/time field mapping table</a>. * @see #setTime(int, int, int, BigDecimal) * @throws IllegalArgumentException if any parameter is outside value constraints for the field as specified in <a href="#datetimefieldmapping">date/time field mapping table</a>. 
public	TokenNamepublic	
void	TokenNamevoid	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
int	TokenNameint	
hour	TokenNameIdentifier	 hour
,	TokenNameCOMMA	
int	TokenNameint	
minute	TokenNameIdentifier	 minute
,	TokenNameCOMMA	
int	TokenNameint	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
hour	TokenNameIdentifier	 hour
,	TokenNameCOMMA	
minute	TokenNameIdentifier	 minute
,	TokenNameCOMMA	
second	TokenNameIdentifier	 second
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkFieldValueConstraint	TokenNameIdentifier	 check Field Value Constraint
(	TokenNameLPAREN	
int	TokenNameint	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<	TokenNameLESS	
MIN_FIELD_VALUE	TokenNameIdentifier	 MIN  FIELD  VALUE
[	TokenNameLBRACKET	
field	TokenNameIdentifier	 field
]	TokenNameRBRACKET	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
||	TokenNameOR_OR	
value	TokenNameIdentifier	 value
>	TokenNameGREATER	
MAX_FIELD_VALUE	TokenNameIdentifier	 MAX  FIELD  VALUE
[	TokenNameLBRACKET	
field	TokenNameIdentifier	 field
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/** throw new IllegalArgumentException("invalid value " + value + " for " + FIELD_NAME[field] + " field"); */	TokenNameCOMMENT_JAVADOC	 throw new IllegalArgumentException("invalid value " + value + " for " + FIELD_NAME[field] + " field"); 
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"InvalidFieldValue"	TokenNameStringLiteral	InvalidFieldValue
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FIELD_NAME	TokenNameIdentifier	 FIELD  NAME
[	TokenNameLBRACKET	
field	TokenNameIdentifier	 field
]	TokenNameRBRACKET	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setHour	TokenNameIdentifier	 set Hour
(	TokenNameLPAREN	
int	TokenNameint	
hour	TokenNameIdentifier	 hour
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkFieldValueConstraint	TokenNameIdentifier	 check Field Value Constraint
(	TokenNameLPAREN	
HOUR	TokenNameIdentifier	 HOUR
,	TokenNameCOMMA	
hour	TokenNameIdentifier	 hour
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hour	TokenNameIdentifier	 hour
=	TokenNameEQUAL	
hour	TokenNameIdentifier	 hour
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMinute	TokenNameIdentifier	 set Minute
(	TokenNameLPAREN	
int	TokenNameint	
minute	TokenNameIdentifier	 minute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkFieldValueConstraint	TokenNameIdentifier	 check Field Value Constraint
(	TokenNameLPAREN	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
minute	TokenNameIdentifier	 minute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minute	TokenNameIdentifier	 minute
=	TokenNameEQUAL	
minute	TokenNameIdentifier	 minute
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSecond	TokenNameIdentifier	 set Second
(	TokenNameLPAREN	
int	TokenNameint	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkFieldValueConstraint	TokenNameIdentifier	 check Field Value Constraint
(	TokenNameLPAREN	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
second	TokenNameIdentifier	 second
=	TokenNameEQUAL	
second	TokenNameIdentifier	 second
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Set time as one unit, including the optional infinite precison * fractional seconds.</p> * * @param hour value constraints are summarized in * <a href="#datetimefield-hour">hour field of date/time field mapping table</a>. * @param minute value constraints are summarized in * <a href="#datetimefield-minute">minute field of date/time field mapping table</a>. * @param second value constraints are summarized in * <a href="#datetimefield-second">second field of date/time field mapping table</a>. * @param fractional value of <code>null</code> indicates this optional * field is not set. * * @throws IllegalArgumentException if any parameter is * outside value constraints for the field as specified in * <a href="#datetimefieldmapping">date/time field mapping table</a>. */	TokenNameCOMMENT_JAVADOC	 <p>Set time as one unit, including the optional infinite precison fractional seconds.</p> * @param hour value constraints are summarized in <a href="#datetimefield-hour">hour field of date/time field mapping table</a>. @param minute value constraints are summarized in <a href="#datetimefield-minute">minute field of date/time field mapping table</a>. @param second value constraints are summarized in <a href="#datetimefield-second">second field of date/time field mapping table</a>. @param fractional value of <code>null</code> indicates this optional field is not set. * @throws IllegalArgumentException if any parameter is outside value constraints for the field as specified in <a href="#datetimefieldmapping">date/time field mapping table</a>. 
public	TokenNamepublic	
void	TokenNamevoid	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
int	TokenNameint	
hour	TokenNameIdentifier	 hour
,	TokenNameCOMMA	
int	TokenNameint	
minute	TokenNameIdentifier	 minute
,	TokenNameCOMMA	
int	TokenNameint	
second	TokenNameIdentifier	 second
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
fractional	TokenNameIdentifier	 fractional
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setHour	TokenNameIdentifier	 set Hour
(	TokenNameLPAREN	
hour	TokenNameIdentifier	 hour
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMinute	TokenNameIdentifier	 set Minute
(	TokenNameLPAREN	
minute	TokenNameIdentifier	 minute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSecond	TokenNameIdentifier	 set Second
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFractionalSecond	TokenNameIdentifier	 set Fractional Second
(	TokenNameLPAREN	
fractional	TokenNameIdentifier	 fractional
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Set time as one unit, including optional milliseconds.</p> * * @param hour value constraints are summarized in * <a href="#datetimefield-hour">hour field of date/time field mapping table</a>. * @param minute value constraints are summarized in * <a href="#datetimefield-minute">minute field of date/time field mapping table</a>. * @param second value constraints are summarized in * <a href="#datetimefield-second">second field of date/time field mapping table</a>. * @param millisecond value of {@link DatatypeConstants#FIELD_UNDEFINED} indicates this * optional field is not set. * * @throws IllegalArgumentException if any parameter is * outside value constraints for the field as specified in * <a href="#datetimefieldmapping">date/time field mapping table</a>. */	TokenNameCOMMENT_JAVADOC	 <p>Set time as one unit, including optional milliseconds.</p> * @param hour value constraints are summarized in <a href="#datetimefield-hour">hour field of date/time field mapping table</a>. @param minute value constraints are summarized in <a href="#datetimefield-minute">minute field of date/time field mapping table</a>. @param second value constraints are summarized in <a href="#datetimefield-second">second field of date/time field mapping table</a>. @param millisecond value of {@link DatatypeConstants#FIELD_UNDEFINED} indicates this optional field is not set. * @throws IllegalArgumentException if any parameter is outside value constraints for the field as specified in <a href="#datetimefieldmapping">date/time field mapping table</a>. 
public	TokenNamepublic	
void	TokenNamevoid	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
int	TokenNameint	
hour	TokenNameIdentifier	 hour
,	TokenNameCOMMA	
int	TokenNameint	
minute	TokenNameIdentifier	 minute
,	TokenNameCOMMA	
int	TokenNameint	
second	TokenNameIdentifier	 second
,	TokenNameCOMMA	
int	TokenNameint	
millisecond	TokenNameIdentifier	 millisecond
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setHour	TokenNameIdentifier	 set Hour
(	TokenNameLPAREN	
hour	TokenNameIdentifier	 hour
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMinute	TokenNameIdentifier	 set Minute
(	TokenNameLPAREN	
minute	TokenNameIdentifier	 minute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSecond	TokenNameIdentifier	 set Second
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMillisecond	TokenNameIdentifier	 set Millisecond
(	TokenNameLPAREN	
millisecond	TokenNameIdentifier	 millisecond
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// comparisons 	TokenNameCOMMENT_LINE	comparisons 
/** * <p>Compare two instances of W3C XML Schema 1.0 date/time datatypes * according to partial order relation defined in * <a href="http://www.w3.org/TR/xmlschema-2/#dateTime-order">W3C XML Schema 1.0 Part 2, Section 3.2.7.3, * <i>Order relation on dateTime</i></a>.</p> * * <p><code>xsd:dateTime</code> datatype field mapping to accessors of * this class are defined in * <a href="#datetimefieldmapping">date/time field mapping table</a>.</p> * * @param rhs instance of <code>XMLGregorianCalendar</code> to compare * * @return the relationship between <code>lhs</code> and <code>rhs</code> as * {@link DatatypeConstants#LESSER}, * {@link DatatypeConstants#EQUAL}, * {@link DatatypeConstants#GREATER} or * {@link DatatypeConstants#INDETERMINATE}. * * @throws NullPointerException if <code>lhs</code> or <code>rhs</code> * parameters are null. */	TokenNameCOMMENT_JAVADOC	 <p>Compare two instances of W3C XML Schema 1.0 date/time datatypes according to partial order relation defined in <a href="http://www.w3.org/TR/xmlschema-2/#dateTime-order">W3C XML Schema 1.0 Part 2, Section 3.2.7.3, <i>Order relation on dateTime</i></a>.</p> * <p><code>xsd:dateTime</code> datatype field mapping to accessors of this class are defined in <a href="#datetimefieldmapping">date/time field mapping table</a>.</p> * @param rhs instance of <code>XMLGregorianCalendar</code> to compare * @return the relationship between <code>lhs</code> and <code>rhs</code> as {@link DatatypeConstants#LESSER}, {@link DatatypeConstants#EQUAL}, {@link DatatypeConstants#GREATER} or {@link DatatypeConstants#INDETERMINATE}. * @throws NullPointerException if <code>lhs</code> or <code>rhs</code> parameters are null. 
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
rhs	TokenNameIdentifier	 rhs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//MLGregorianCalendar lhs = this; 	TokenNameCOMMENT_LINE	MLGregorianCalendar lhs = this; 
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
P	TokenNameIdentifier	 P
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
Q	TokenNameIdentifier	 Q
=	TokenNameEQUAL	
rhs	TokenNameIdentifier	 rhs
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
.	TokenNameDOT	
getTimezone	TokenNameIdentifier	 get Timezone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Q	TokenNameIdentifier	 Q
.	TokenNameDOT	
getTimezone	TokenNameIdentifier	 get Timezone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Optimization: 	TokenNameCOMMENT_LINE	Optimization: 
// both instances are in same timezone or 	TokenNameCOMMENT_LINE	both instances are in same timezone or 
// both are FIELD_UNDEFINED. 	TokenNameCOMMENT_LINE	both are FIELD_UNDEFINED. 
// Avoid costly normalization of timezone to 'Z' time. 	TokenNameCOMMENT_LINE	Avoid costly normalization of timezone to 'Z' time. 
return	TokenNamereturn	
internalCompare	TokenNameIdentifier	 internal Compare
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
,	TokenNameCOMMA	
Q	TokenNameIdentifier	 Q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
.	TokenNameDOT	
getTimezone	TokenNameIdentifier	 get Timezone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
Q	TokenNameIdentifier	 Q
.	TokenNameDOT	
getTimezone	TokenNameIdentifier	 get Timezone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Both instances have different timezones. 	TokenNameCOMMENT_LINE	Both instances have different timezones. 
// Normalize to UTC time and compare. 	TokenNameCOMMENT_LINE	Normalize to UTC time and compare. 
P	TokenNameIdentifier	 P
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
)	TokenNameRPAREN	
P	TokenNameIdentifier	 P
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Q	TokenNameIdentifier	 Q
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
)	TokenNameRPAREN	
Q	TokenNameIdentifier	 Q
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
internalCompare	TokenNameIdentifier	 internal Compare
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
,	TokenNameCOMMA	
Q	TokenNameIdentifier	 Q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
.	TokenNameDOT	
getTimezone	TokenNameIdentifier	 get Timezone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
.	TokenNameDOT	
getTimezone	TokenNameIdentifier	 get Timezone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P	TokenNameIdentifier	 P
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
)	TokenNameRPAREN	
P	TokenNameIdentifier	 P
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// C. step 1 	TokenNameCOMMENT_LINE	C. step 1 
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
MinQ	TokenNameIdentifier	 Min Q
=	TokenNameEQUAL	
normalizeToTimezone	TokenNameIdentifier	 normalize To Timezone
(	TokenNameLPAREN	
Q	TokenNameIdentifier	 Q
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MIN_TIMEZONE_OFFSET	TokenNameIdentifier	 MIN  TIMEZONE  OFFSET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
internalCompare	TokenNameIdentifier	 internal Compare
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
,	TokenNameCOMMA	
MinQ	TokenNameIdentifier	 Min Q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
LESSER	TokenNameIdentifier	 LESSER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// C. step 2 	TokenNameCOMMENT_LINE	C. step 2 
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
MaxQ	TokenNameIdentifier	 Max Q
=	TokenNameEQUAL	
normalizeToTimezone	TokenNameIdentifier	 normalize To Timezone
(	TokenNameLPAREN	
Q	TokenNameIdentifier	 Q
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MAX_TIMEZONE_OFFSET	TokenNameIdentifier	 MAX  TIMEZONE  OFFSET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
internalCompare	TokenNameIdentifier	 internal Compare
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
,	TokenNameCOMMA	
MaxQ	TokenNameIdentifier	 Max Q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
GREATER	TokenNameIdentifier	 GREATER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// C. step 3 	TokenNameCOMMENT_LINE	C. step 3 
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Q.getTimezone() != DatatypeConstants.FIELD_UNDEFINED 	TokenNameCOMMENT_LINE	Q.getTimezone() != DatatypeConstants.FIELD_UNDEFINED 
// P has no timezone and Q does. 	TokenNameCOMMENT_LINE	P has no timezone and Q does. 
if	TokenNameif	
(	TokenNameLPAREN	
Q	TokenNameIdentifier	 Q
.	TokenNameDOT	
getTimezone	TokenNameIdentifier	 get Timezone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Q	TokenNameIdentifier	 Q
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
)	TokenNameRPAREN	
normalizeToTimezone	TokenNameIdentifier	 normalize To Timezone
(	TokenNameLPAREN	
Q	TokenNameIdentifier	 Q
,	TokenNameCOMMA	
Q	TokenNameIdentifier	 Q
.	TokenNameDOT	
getTimezone	TokenNameIdentifier	 get Timezone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// D. step 1 	TokenNameCOMMENT_LINE	D. step 1 
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
MaxP	TokenNameIdentifier	 Max P
=	TokenNameEQUAL	
normalizeToTimezone	TokenNameIdentifier	 normalize To Timezone
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MAX_TIMEZONE_OFFSET	TokenNameIdentifier	 MAX  TIMEZONE  OFFSET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
internalCompare	TokenNameIdentifier	 internal Compare
(	TokenNameLPAREN	
MaxP	TokenNameIdentifier	 Max P
,	TokenNameCOMMA	
Q	TokenNameIdentifier	 Q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
LESSER	TokenNameIdentifier	 LESSER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// D. step 2 	TokenNameCOMMENT_LINE	D. step 2 
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
MinP	TokenNameIdentifier	 Min P
=	TokenNameEQUAL	
normalizeToTimezone	TokenNameIdentifier	 normalize To Timezone
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MIN_TIMEZONE_OFFSET	TokenNameIdentifier	 MIN  TIMEZONE  OFFSET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
internalCompare	TokenNameIdentifier	 internal Compare
(	TokenNameLPAREN	
MinP	TokenNameIdentifier	 Min P
,	TokenNameCOMMA	
Q	TokenNameIdentifier	 Q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
GREATER	TokenNameIdentifier	 GREATER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// D. step 3 	TokenNameCOMMENT_LINE	D. step 3 
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Normalize this instance to UTC.</p> * * <p>2000-03-04T23:00:00+03:00 normalizes to 2000-03-04T20:00:00Z</p> * <p>Implements W3C XML Schema Part 2, Section 3.2.7.3 (A).</p> */	TokenNameCOMMENT_JAVADOC	 <p>Normalize this instance to UTC.</p> * <p>2000-03-04T23:00:00+03:00 normalizes to 2000-03-04T20:00:00Z</p> <p>Implements W3C XML Schema Part 2, Section 3.2.7.3 (A).</p> 
public	TokenNamepublic	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
normalized	TokenNameIdentifier	 normalized
=	TokenNameEQUAL	
normalizeToTimezone	TokenNameIdentifier	 normalize To Timezone
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if timezone was undefined, leave it undefined 	TokenNameCOMMENT_LINE	if timezone was undefined, leave it undefined 
if	TokenNameif	
(	TokenNameLPAREN	
getTimezone	TokenNameIdentifier	 get Timezone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
normalized	TokenNameIdentifier	 normalized
.	TokenNameDOT	
setTimezone	TokenNameIdentifier	 set Timezone
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if milliseconds was undefined, leave it undefined 	TokenNameCOMMENT_LINE	if milliseconds was undefined, leave it undefined 
if	TokenNameif	
(	TokenNameLPAREN	
getMillisecond	TokenNameIdentifier	 get Millisecond
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
normalized	TokenNameIdentifier	 normalized
.	TokenNameDOT	
setMillisecond	TokenNameIdentifier	 set Millisecond
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
normalized	TokenNameIdentifier	 normalized
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Normalize this instance to UTC.</p> * * <p>2000-03-04T23:00:00+03:00 normalizes to 2000-03-04T20:00:00Z</p> * <p>Implements W3C XML Schema Part 2, Section 3.2.7.3 (A).</p> */	TokenNameCOMMENT_JAVADOC	 <p>Normalize this instance to UTC.</p> * <p>2000-03-04T23:00:00+03:00 normalizes to 2000-03-04T20:00:00Z</p> <p>Implements W3C XML Schema Part 2, Section 3.2.7.3 (A).</p> 
private	TokenNameprivate	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
normalizeToTimezone	TokenNameIdentifier	 normalize To Timezone
(	TokenNameLPAREN	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
cal	TokenNameIdentifier	 cal
,	TokenNameCOMMA	
int	TokenNameint	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
minutes	TokenNameIdentifier	 minutes
=	TokenNameEQUAL	
timezone	TokenNameIdentifier	 timezone
;	TokenNameSEMICOLON	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
)	TokenNameRPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// normalizing to UTC time negates the timezone offset before 	TokenNameCOMMENT_LINE	normalizing to UTC time negates the timezone offset before 
// addition. 	TokenNameCOMMENT_LINE	addition. 
minutes	TokenNameIdentifier	 minutes
=	TokenNameEQUAL	
-	TokenNameMINUS	
minutes	TokenNameIdentifier	 minutes
;	TokenNameSEMICOLON	
Duration	TokenNameIdentifier	 Duration
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
DurationImpl	TokenNameIdentifier	 Duration Impl
(	TokenNameLPAREN	
minutes	TokenNameIdentifier	 minutes
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// isPositive 	TokenNameCOMMENT_LINE	isPositive 
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
//years 	TokenNameCOMMENT_LINE	years 
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
//months 	TokenNameCOMMENT_LINE	months 
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
//days 	TokenNameCOMMENT_LINE	days 
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
//hours 	TokenNameCOMMENT_LINE	hours 
minutes	TokenNameIdentifier	 minutes
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
-	TokenNameMINUS	
minutes	TokenNameIdentifier	 minutes
:	TokenNameCOLON	
minutes	TokenNameIdentifier	 minutes
,	TokenNameCOMMA	
// absolute 	TokenNameCOMMENT_LINE	absolute 
0	TokenNameIntegerLiteral	
//seconds 	TokenNameCOMMENT_LINE	seconds 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set to zulu UTC time. 	TokenNameCOMMENT_LINE	set to zulu UTC time. 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setTimezone	TokenNameIdentifier	 set Timezone
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * <p>Implements Step B from http://www.w3.org/TR/xmlschema-2/#dateTime-order </p> * @param P calendar instance with normalized timezone offset or * having same timezone as Q * @param Q calendar instance with normalized timezone offset or * having same timezone as P * * @return result of comparing P and Q, value of * {@link DatatypeConstants#EQUAL}, * {@link DatatypeConstants#LESSER}, * {@link DatatypeConstants#GREATER} or * {@link DatatypeConstants#INDETERMINATE}. */	TokenNameCOMMENT_JAVADOC	 * <p>Implements Step B from http://www.w3.org/TR/xmlschema-2/#dateTime-order </p> @param P calendar instance with normalized timezone offset or having same timezone as Q @param Q calendar instance with normalized timezone offset or having same timezone as P * @return result of comparing P and Q, value of {@link DatatypeConstants#EQUAL}, {@link DatatypeConstants#LESSER}, {@link DatatypeConstants#GREATER} or {@link DatatypeConstants#INDETERMINATE}. 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
internalCompare	TokenNameIdentifier	 internal Compare
(	TokenNameLPAREN	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
P	TokenNameIdentifier	 P
,	TokenNameCOMMA	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
Q	TokenNameIdentifier	 Q
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
// compare Year. 	TokenNameCOMMENT_LINE	compare Year. 
if	TokenNameif	
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
.	TokenNameDOT	
getEon	TokenNameIdentifier	 get Eon
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Q	TokenNameIdentifier	 Q
.	TokenNameDOT	
getEon	TokenNameIdentifier	 get Eon
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Eon field is only equal when null. 	TokenNameCOMMENT_LINE	Eon field is only equal when null. 
// optimized case for comparing year not requiring eon field. 	TokenNameCOMMENT_LINE	optimized case for comparing year not requiring eon field. 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
compareField	TokenNameIdentifier	 compare Field
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
.	TokenNameDOT	
getYear	TokenNameIdentifier	 get Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Q	TokenNameIdentifier	 Q
.	TokenNameDOT	
getYear	TokenNameIdentifier	 get Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
compareField	TokenNameIdentifier	 compare Field
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
.	TokenNameDOT	
getEonAndYear	TokenNameIdentifier	 get Eon And Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Q	TokenNameIdentifier	 Q
.	TokenNameDOT	
getEonAndYear	TokenNameIdentifier	 get Eon And Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
compareField	TokenNameIdentifier	 compare Field
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
.	TokenNameDOT	
getMonth	TokenNameIdentifier	 get Month
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Q	TokenNameIdentifier	 Q
.	TokenNameDOT	
getMonth	TokenNameIdentifier	 get Month
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
compareField	TokenNameIdentifier	 compare Field
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
.	TokenNameDOT	
getDay	TokenNameIdentifier	 get Day
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Q	TokenNameIdentifier	 Q
.	TokenNameDOT	
getDay	TokenNameIdentifier	 get Day
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
compareField	TokenNameIdentifier	 compare Field
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
.	TokenNameDOT	
getHour	TokenNameIdentifier	 get Hour
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Q	TokenNameIdentifier	 Q
.	TokenNameDOT	
getHour	TokenNameIdentifier	 get Hour
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
compareField	TokenNameIdentifier	 compare Field
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
.	TokenNameDOT	
getMinute	TokenNameIdentifier	 get Minute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Q	TokenNameIdentifier	 Q
.	TokenNameDOT	
getMinute	TokenNameIdentifier	 get Minute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
compareField	TokenNameIdentifier	 compare Field
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
.	TokenNameDOT	
getSecond	TokenNameIdentifier	 get Second
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Q	TokenNameIdentifier	 Q
.	TokenNameDOT	
getSecond	TokenNameIdentifier	 get Second
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
compareField	TokenNameIdentifier	 compare Field
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
.	TokenNameDOT	
getFractionalSecond	TokenNameIdentifier	 get Fractional Second
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Q	TokenNameIdentifier	 Q
.	TokenNameDOT	
getFractionalSecond	TokenNameIdentifier	 get Fractional Second
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Implement Step B from * http://www.w3.org/TR/xmlschema-2/#dateTime-order.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Implement Step B from http://www.w3.org/TR/xmlschema-2/#dateTime-order.</p> 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
compareField	TokenNameIdentifier	 compare Field
(	TokenNameLPAREN	
int	TokenNameint	
Pfield	TokenNameIdentifier	 Pfield
,	TokenNameCOMMA	
int	TokenNameint	
Qfield	TokenNameIdentifier	 Qfield
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Pfield	TokenNameIdentifier	 Pfield
==	TokenNameEQUAL_EQUAL	
Qfield	TokenNameIdentifier	 Qfield
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//fields are either equal in value or both undefined. 	TokenNameCOMMENT_LINE	fields are either equal in value or both undefined. 
// Step B. 1.1 AND optimized result of performing 1.1-1.4. 	TokenNameCOMMENT_LINE	Step B. 1.1 AND optimized result of performing 1.1-1.4. 
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Pfield	TokenNameIdentifier	 Pfield
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
||	TokenNameOR_OR	
Qfield	TokenNameIdentifier	 Qfield
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Step B. 1.2 	TokenNameCOMMENT_LINE	Step B. 1.2 
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Step B. 1.3-4. 	TokenNameCOMMENT_LINE	Step B. 1.3-4. 
return	TokenNamereturn	
(	TokenNameLPAREN	
Pfield	TokenNameIdentifier	 Pfield
<	TokenNameLESS	
Qfield	TokenNameIdentifier	 Qfield
?	TokenNameQUESTION	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
LESSER	TokenNameIdentifier	 LESSER
:	TokenNameCOLON	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
GREATER	TokenNameIdentifier	 GREATER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
compareField	TokenNameIdentifier	 compare Field
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
Pfield	TokenNameIdentifier	 Pfield
,	TokenNameCOMMA	
BigInteger	TokenNameIdentifier	 Big Integer
Qfield	TokenNameIdentifier	 Qfield
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Pfield	TokenNameIdentifier	 Pfield
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Qfield	TokenNameIdentifier	 Qfield
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
:	TokenNameCOLON	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Qfield	TokenNameIdentifier	 Qfield
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Pfield	TokenNameIdentifier	 Pfield
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Qfield	TokenNameIdentifier	 Qfield
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
compareField	TokenNameIdentifier	 compare Field
(	TokenNameLPAREN	
BigDecimal	TokenNameIdentifier	 Big Decimal
Pfield	TokenNameIdentifier	 Pfield
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
Qfield	TokenNameIdentifier	 Qfield
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// optimization. especially when both arguments are null. 	TokenNameCOMMENT_LINE	optimization. especially when both arguments are null. 
if	TokenNameif	
(	TokenNameLPAREN	
Pfield	TokenNameIdentifier	 Pfield
==	TokenNameEQUAL_EQUAL	
Qfield	TokenNameIdentifier	 Qfield
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Pfield	TokenNameIdentifier	 Pfield
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Pfield	TokenNameIdentifier	 Pfield
=	TokenNameEQUAL	
DECIMAL_ZERO	TokenNameIdentifier	 DECIMAL  ZERO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Qfield	TokenNameIdentifier	 Qfield
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Qfield	TokenNameIdentifier	 Qfield
=	TokenNameEQUAL	
DECIMAL_ZERO	TokenNameIdentifier	 DECIMAL  ZERO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Pfield	TokenNameIdentifier	 Pfield
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Qfield	TokenNameIdentifier	 Qfield
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Indicates whether parameter <code>obj</code> is "equal to" this one.</p> * * @param obj to compare. * * @return <code>true</code> when <code>compare(this,(XMLGregorianCalendar)obj) == EQUAL.</code>. */	TokenNameCOMMENT_JAVADOC	 <p>Indicates whether parameter <code>obj</code> is "equal to" this one.</p> * @param obj to compare. * @return <code>true</code> when <code>compare(this,(XMLGregorianCalendar)obj) == EQUAL.</code>. 
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
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Returns a hash code consistent with the definition of the equals method.</p> * * @return hash code of this object. */	TokenNameCOMMENT_JAVADOC	 <p>Returns a hash code consistent with the definition of the equals method.</p> * @return hash code of this object. 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Following two dates compare to EQUALS since in different timezones. 	TokenNameCOMMENT_LINE	Following two dates compare to EQUALS since in different timezones. 
// 2000-01-15T12:00:00-05:00 == 2000-01-15T13:00:00-04:00 	TokenNameCOMMENT_LINE	2000-01-15T12:00:00-05:00 == 2000-01-15T13:00:00-04:00 
// 	TokenNameCOMMENT_LINE	 
// Must ensure both instances generate same hashcode by normalizing 	TokenNameCOMMENT_LINE	Must ensure both instances generate same hashcode by normalizing 
// this to UTC timezone. 	TokenNameCOMMENT_LINE	this to UTC timezone. 
int	TokenNameint	
timezone	TokenNameIdentifier	 timezone
=	TokenNameEQUAL	
getTimezone	TokenNameIdentifier	 get Timezone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
timezone	TokenNameIdentifier	 timezone
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timezone	TokenNameIdentifier	 timezone
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
gc	TokenNameIdentifier	 gc
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
timezone	TokenNameIdentifier	 timezone
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gc	TokenNameIdentifier	 gc
=	TokenNameEQUAL	
normalizeToTimezone	TokenNameIdentifier	 normalize To Timezone
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
getTimezone	TokenNameIdentifier	 get Timezone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getYear	TokenNameIdentifier	 get Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getMonth	TokenNameIdentifier	 get Month
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getDay	TokenNameIdentifier	 get Day
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getHour	TokenNameIdentifier	 get Hour
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getMinute	TokenNameIdentifier	 get Minute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getSecond	TokenNameIdentifier	 get Second
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Constructs a new XMLGregorianCalendar object by * parsing its lexical string representation as defined in * <a href="http://www.w3.org/TR/xmlschema-2/#dateTime-order">XML Schema 1.0 Part 2, Section 3.2.[7-14].1, * <i>Lexical Representation</i>.</a></p> * * <p>The string representation may not have any leading and trailing whitespaces.</p> * * <p>The parsing is done field by field so that * the following holds for any lexically correct string x:</p> * <pre> * new XMLGregorianCalendar(x).toXMLFormat().equals(x) * </pre> * Except for the noted lexical/canonical representation mismatches * listed in <a href="http://www.w3.org/2001/05/xmlschema-errata#e2-45"> * XML Schema 1.0 errata, Section 3.2.7.2</a>. * * <p>Returns a non-null valid XMLGregorianCalendar object that holds the value * indicated by the lexicalRepresentation parameter.</p> * * @param lexicalRepresentation Lexical representation of one the 8 XML Schema calendar datatypes. * * @return <code>XMLGregorianCalendar</code> created from parsing <code>lexicalRepresentation</code> parameter. * * @throws IllegalArgumentException * If the given string does not conform to the aforementioned * specification. * @throws NullPointerException * If the given string is null. */	TokenNameCOMMENT_JAVADOC	 <p>Constructs a new XMLGregorianCalendar object by parsing its lexical string representation as defined in <a href="http://www.w3.org/TR/xmlschema-2/#dateTime-order">XML Schema 1.0 Part 2, Section 3.2.[7-14].1, <i>Lexical Representation</i>.</a></p> * <p>The string representation may not have any leading and trailing whitespaces.</p> * <p>The parsing is done field by field so that the following holds for any lexically correct string x:</p> <pre> new XMLGregorianCalendar(x).toXMLFormat().equals(x) </pre> Except for the noted lexical/canonical representation mismatches listed in <a href="http://www.w3.org/2001/05/xmlschema-errata#e2-45"> XML Schema 1.0 errata, Section 3.2.7.2</a>. * <p>Returns a non-null valid XMLGregorianCalendar object that holds the value indicated by the lexicalRepresentation parameter.</p> * @param lexicalRepresentation Lexical representation of one the 8 XML Schema calendar datatypes. * @return <code>XMLGregorianCalendar</code> created from parsing <code>lexicalRepresentation</code> parameter. * @throws IllegalArgumentException If the given string does not conform to the aforementioned specification. @throws NullPointerException If the given string is null. 
public	TokenNamepublic	
static	TokenNamestatic	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lexicalRepresentation	TokenNameIdentifier	 lexical Representation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
(	TokenNameLPAREN	
lexicalRepresentation	TokenNameIdentifier	 lexical Representation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Return the lexical representation of <code>this</code> instance. * The format is specified in * <a href="http://www.w3.org/TR/xmlschema-2/#dateTime-order">XML Schema 1.0 Part 2, Section 3.2.[7-14].1, * <i>Lexical Representation</i>".</a></p> * * <p>Specific target lexical representation format is determined by * {@link #getXMLSchemaType()}.</p> * * @return XML, as <code>String</code>, representation of this <code>XMLGregorianCalendar</code> * * @throws java.lang.IllegalStateException if the combination of set fields * does not match one of the eight defined XML Schema builtin date/time datatypes. */	TokenNameCOMMENT_JAVADOC	 <p>Return the lexical representation of <code>this</code> instance. The format is specified in <a href="http://www.w3.org/TR/xmlschema-2/#dateTime-order">XML Schema 1.0 Part 2, Section 3.2.[7-14].1, <i>Lexical Representation</i>".</a></p> * <p>Specific target lexical representation format is determined by {@link #getXMLSchemaType()}.</p> * @return XML, as <code>String</code>, representation of this <code>XMLGregorianCalendar</code> * @throws java.lang.IllegalStateException if the combination of set fields does not match one of the eight defined XML Schema builtin date/time datatypes. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toXMLFormat	TokenNameIdentifier	 to XML Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QName	TokenNameIdentifier	 Q Name
typekind	TokenNameIdentifier	 typekind
=	TokenNameEQUAL	
getXMLSchemaType	TokenNameIdentifier	 get XML Schema Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
formatString	TokenNameIdentifier	 format String
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
typekind	TokenNameIdentifier	 typekind
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
DATETIME	TokenNameIdentifier	 DATETIME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formatString	TokenNameIdentifier	 format String
=	TokenNameEQUAL	
"%Y-%M-%DT%h:%m:%s"	TokenNameStringLiteral	%Y-%M-%DT%h:%m:%s
+	TokenNamePLUS	
"%z"	TokenNameStringLiteral	%z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
typekind	TokenNameIdentifier	 typekind
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
DATE	TokenNameIdentifier	 DATE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fix 4971612: invalid SCCS macro substitution in data string 	TokenNameCOMMENT_LINE	Fix 4971612: invalid SCCS macro substitution in data string 
formatString	TokenNameIdentifier	 format String
=	TokenNameEQUAL	
"%Y-%M-%D"	TokenNameStringLiteral	%Y-%M-%D
+	TokenNamePLUS	
"%z"	TokenNameStringLiteral	%z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
typekind	TokenNameIdentifier	 typekind
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
TIME	TokenNameIdentifier	 TIME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formatString	TokenNameIdentifier	 format String
=	TokenNameEQUAL	
"%h:%m:%s"	TokenNameStringLiteral	%h:%m:%s
+	TokenNamePLUS	
"%z"	TokenNameStringLiteral	%z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
typekind	TokenNameIdentifier	 typekind
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
GMONTH	TokenNameIdentifier	 GMONTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formatString	TokenNameIdentifier	 format String
=	TokenNameEQUAL	
"--%M--%z"	TokenNameStringLiteral	--%M--%z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
typekind	TokenNameIdentifier	 typekind
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
GDAY	TokenNameIdentifier	 GDAY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fix 4971612: invalid SCCS macro substitution in data string 	TokenNameCOMMENT_LINE	Fix 4971612: invalid SCCS macro substitution in data string 
formatString	TokenNameIdentifier	 format String
=	TokenNameEQUAL	
"---%D"	TokenNameStringLiteral	---%D
+	TokenNamePLUS	
"%z"	TokenNameStringLiteral	%z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
typekind	TokenNameIdentifier	 typekind
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
GYEAR	TokenNameIdentifier	 GYEAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formatString	TokenNameIdentifier	 format String
=	TokenNameEQUAL	
"%Y"	TokenNameStringLiteral	%Y
+	TokenNamePLUS	
"%z"	TokenNameStringLiteral	%z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
typekind	TokenNameIdentifier	 typekind
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
GYEARMONTH	TokenNameIdentifier	 GYEARMONTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fix 4971612: invalid SCCS macro substitution in data string 	TokenNameCOMMENT_LINE	Fix 4971612: invalid SCCS macro substitution in data string 
formatString	TokenNameIdentifier	 format String
=	TokenNameEQUAL	
"%Y-%M"	TokenNameStringLiteral	%Y-%M
+	TokenNamePLUS	
"%z"	TokenNameStringLiteral	%z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
typekind	TokenNameIdentifier	 typekind
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
GMONTHDAY	TokenNameIdentifier	 GMONTHDAY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fix 4971612: invalid SCCS macro substitution in data string 	TokenNameCOMMENT_LINE	Fix 4971612: invalid SCCS macro substitution in data string 
formatString	TokenNameIdentifier	 format String
=	TokenNameEQUAL	
"--%M-%D"	TokenNameStringLiteral	--%M-%D
+	TokenNamePLUS	
"%z"	TokenNameStringLiteral	%z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
formatString	TokenNameIdentifier	 format String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Return the name of the XML Schema date/time type that this instance * maps to. Type is computed based on fields that are set.</p> * * <table border="2" rules="all" cellpadding="2"> * <thead> * <tr> * <th align="center" colspan="7"> * Required fields for XML Schema 1.0 Date/Time Datatypes.<br/> * <i>(timezone is optional for all date/time datatypes)</i> * </th> * </tr> * </thead> * <tbody> * <tr> * <td>Datatype</td> * <td>year</td> * <td>month</td> * <td>day</td> * <td>hour</td> * <td>minute</td> * <td>second</td> * </tr> * <tr> * <td>{@link DatatypeConstants#DATETIME}</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td>X</td> * </tr> * <tr> * <td>{@link DatatypeConstants#DATE}</td> * <td>X</td> * <td>X</td> * <td>X</td> * <td></td> * <td></td> * <td></td> * </tr> * <tr> * <td>{@link DatatypeConstants#TIME}</td> * <td></td> * <td></td> * <td></td> * <td>X</td> * <td>X</td> * <td>X</td> * </tr> * <tr> * <td>{@link DatatypeConstants#GYEARMONTH}</td> * <td>X</td> * <td>X</td> * <td></td> * <td></td> * <td></td> * <td></td> * </tr> * <tr> * <td>{@link DatatypeConstants#GMONTHDAY}</td> * <td></td> * <td>X</td> * <td>X</td> * <td></td> * <td></td> * <td></td> * </tr> * <tr> * <td>{@link DatatypeConstants#GYEAR}</td> * <td>X</td> * <td></td> * <td></td> * <td></td> * <td></td> * <td></td> * </tr> * <tr> * <td>{@link DatatypeConstants#GMONTH}</td> * <td></td> * <td>X</td> * <td></td> * <td></td> * <td></td> * <td></td> * </tr> * <tr> * <td>{@link DatatypeConstants#GDAY}</td> * <td></td> * <td></td> * <td>X</td> * <td></td> * <td></td> * <td></td> * </tr> * </tbody> * </table> * * @throws java.lang.IllegalStateException if the combination of set fields * does not match one of the eight defined XML Schema builtin * date/time datatypes. * @return One of the following class constants: * {@link DatatypeConstants#DATETIME}, * {@link DatatypeConstants#TIME}, * {@link DatatypeConstants#DATE}, * {@link DatatypeConstants#GYEARMONTH}, * {@link DatatypeConstants#GMONTHDAY}, * {@link DatatypeConstants#GYEAR}, * {@link DatatypeConstants#GMONTH} or * {@link DatatypeConstants#GDAY}. */	TokenNameCOMMENT_JAVADOC	 <p>Return the name of the XML Schema date/time type that this instance maps to. Type is computed based on fields that are set.</p> * <table border="2" rules="all" cellpadding="2"> <thead> <tr> <th align="center" colspan="7"> Required fields for XML Schema 1.0 Date/Time Datatypes.<br/> <i>(timezone is optional for all date/time datatypes)</i> </th> </tr> </thead> <tbody> <tr> <td>Datatype</td> <td>year</td> <td>month</td> <td>day</td> <td>hour</td> <td>minute</td> <td>second</td> </tr> <tr> <td>{@link DatatypeConstants#DATETIME}</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> <td>X</td> </tr> <tr> <td>{@link DatatypeConstants#DATE}</td> <td>X</td> <td>X</td> <td>X</td> <td></td> <td></td> <td></td> </tr> <tr> <td>{@link DatatypeConstants#TIME}</td> <td></td> <td></td> <td></td> <td>X</td> <td>X</td> <td>X</td> </tr> <tr> <td>{@link DatatypeConstants#GYEARMONTH}</td> <td>X</td> <td>X</td> <td></td> <td></td> <td></td> <td></td> </tr> <tr> <td>{@link DatatypeConstants#GMONTHDAY}</td> <td></td> <td>X</td> <td>X</td> <td></td> <td></td> <td></td> </tr> <tr> <td>{@link DatatypeConstants#GYEAR}</td> <td>X</td> <td></td> <td></td> <td></td> <td></td> <td></td> </tr> <tr> <td>{@link DatatypeConstants#GMONTH}</td> <td></td> <td>X</td> <td></td> <td></td> <td></td> <td></td> </tr> <tr> <td>{@link DatatypeConstants#GDAY}</td> <td></td> <td></td> <td>X</td> <td></td> <td></td> <td></td> </tr> </tbody> </table> * @throws java.lang.IllegalStateException if the combination of set fields does not match one of the eight defined XML Schema builtin date/time datatypes. @return One of the following class constants: {@link DatatypeConstants#DATETIME}, {@link DatatypeConstants#TIME}, {@link DatatypeConstants#DATE}, {@link DatatypeConstants#GYEARMONTH}, {@link DatatypeConstants#GMONTHDAY}, {@link DatatypeConstants#GYEAR}, {@link DatatypeConstants#GMONTH} or {@link DatatypeConstants#GDAY}. 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getXMLSchemaType	TokenNameIdentifier	 get XML Schema Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// DATETIME 	TokenNameCOMMENT_LINE	DATETIME 
if	TokenNameif	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
month	TokenNameIdentifier	 month
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
day	TokenNameIdentifier	 day
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
hour	TokenNameIdentifier	 hour
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
minute	TokenNameIdentifier	 minute
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
second	TokenNameIdentifier	 second
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
DATETIME	TokenNameIdentifier	 DATETIME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DATE 	TokenNameCOMMENT_LINE	DATE 
if	TokenNameif	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
month	TokenNameIdentifier	 month
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
day	TokenNameIdentifier	 day
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
hour	TokenNameIdentifier	 hour
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
minute	TokenNameIdentifier	 minute
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
second	TokenNameIdentifier	 second
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
DATE	TokenNameIdentifier	 DATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TIME 	TokenNameCOMMENT_LINE	TIME 
if	TokenNameif	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
month	TokenNameIdentifier	 month
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
day	TokenNameIdentifier	 day
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
hour	TokenNameIdentifier	 hour
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
minute	TokenNameIdentifier	 minute
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
second	TokenNameIdentifier	 second
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
TIME	TokenNameIdentifier	 TIME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// GYEARMONTH 	TokenNameCOMMENT_LINE	GYEARMONTH 
if	TokenNameif	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
month	TokenNameIdentifier	 month
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
day	TokenNameIdentifier	 day
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
hour	TokenNameIdentifier	 hour
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
minute	TokenNameIdentifier	 minute
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
second	TokenNameIdentifier	 second
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
GYEARMONTH	TokenNameIdentifier	 GYEARMONTH
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// GMONTHDAY 	TokenNameCOMMENT_LINE	GMONTHDAY 
if	TokenNameif	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
month	TokenNameIdentifier	 month
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
day	TokenNameIdentifier	 day
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
hour	TokenNameIdentifier	 hour
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
minute	TokenNameIdentifier	 minute
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
second	TokenNameIdentifier	 second
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
GMONTHDAY	TokenNameIdentifier	 GMONTHDAY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// GYEAR 	TokenNameCOMMENT_LINE	GYEAR 
if	TokenNameif	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
month	TokenNameIdentifier	 month
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
day	TokenNameIdentifier	 day
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
hour	TokenNameIdentifier	 hour
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
minute	TokenNameIdentifier	 minute
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
second	TokenNameIdentifier	 second
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
GYEAR	TokenNameIdentifier	 GYEAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// GMONTH 	TokenNameCOMMENT_LINE	GMONTH 
if	TokenNameif	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
month	TokenNameIdentifier	 month
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
day	TokenNameIdentifier	 day
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
hour	TokenNameIdentifier	 hour
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
minute	TokenNameIdentifier	 minute
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
second	TokenNameIdentifier	 second
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
GMONTH	TokenNameIdentifier	 GMONTH
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// GDAY 	TokenNameCOMMENT_LINE	GDAY 
if	TokenNameif	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
month	TokenNameIdentifier	 month
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
day	TokenNameIdentifier	 day
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
hour	TokenNameIdentifier	 hour
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
minute	TokenNameIdentifier	 minute
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
second	TokenNameIdentifier	 second
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
GDAY	TokenNameIdentifier	 GDAY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// unknown 	TokenNameCOMMENT_LINE	unknown 
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"#getXMLSchemaType() :"	TokenNameStringLiteral	#getXMLSchemaType() :
+	TokenNamePLUS	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"InvalidXGCFields"	TokenNameStringLiteral	InvalidXGCFields
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Validate instance by <code>getXMLSchemaType()</code> constraints. * @return true if data values are valid. */	TokenNameCOMMENT_JAVADOC	 Validate instance by <code>getXMLSchemaType()</code> constraints. @return true if data values are valid. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// since setters do not allow for invalid values, 	TokenNameCOMMENT_LINE	since setters do not allow for invalid values, 
// (except for exceptional case of year field of zero), 	TokenNameCOMMENT_LINE	(except for exceptional case of year field of zero), 
// no need to check for anything except for constraints 	TokenNameCOMMENT_LINE	no need to check for anything except for constraints 
// between fields. 	TokenNameCOMMENT_LINE	between fields. 
// check if days in month is valid. Can be dependent on leap year. 	TokenNameCOMMENT_LINE	check if days in month is valid. Can be dependent on leap year. 
if	TokenNameif	
(	TokenNameLPAREN	
month	TokenNameIdentifier	 month
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
&&	TokenNameAND_AND	
day	TokenNameIdentifier	 day
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
eon	TokenNameIdentifier	 eon
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
day	TokenNameIdentifier	 day
>	TokenNameGREATER	
maximumDayInMonthFor	TokenNameIdentifier	 maximum Day In Month For
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
day	TokenNameIdentifier	 day
>	TokenNameGREATER	
maximumDayInMonthFor	TokenNameIdentifier	 maximum Day In Month For
(	TokenNameLPAREN	
getEonAndYear	TokenNameIdentifier	 get Eon And Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Use 2000 as a default since it's a leap year. 	TokenNameCOMMENT_LINE	Use 2000 as a default since it's a leap year. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
day	TokenNameIdentifier	 day
>	TokenNameGREATER	
maximumDayInMonthFor	TokenNameIdentifier	 maximum Day In Month For
(	TokenNameLPAREN	
2000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// http://www.w3.org/2001/05/xmlschema-errata#e2-45 	TokenNameCOMMENT_LINE	http://www.w3.org/2001/05/xmlschema-errata#e2-45 
if	TokenNameif	
(	TokenNameLPAREN	
hour	TokenNameIdentifier	 hour
==	TokenNameEQUAL_EQUAL	
24	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
minute	TokenNameIdentifier	 minute
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
second	TokenNameIdentifier	 second
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
fractionalSecond	TokenNameIdentifier	 fractional Second
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fractionalSecond	TokenNameIdentifier	 fractional Second
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
DECIMAL_ZERO	TokenNameIdentifier	 DECIMAL  ZERO
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XML Schema 1.0 specification defines year value of zero as 	TokenNameCOMMENT_LINE	XML Schema 1.0 specification defines year value of zero as 
// invalid. Allow this class to set year field to zero 	TokenNameCOMMENT_LINE	invalid. Allow this class to set year field to zero 
// since XML Schema 1.0 errata states that lexical zero will 	TokenNameCOMMENT_LINE	since XML Schema 1.0 errata states that lexical zero will 
// be allowed in next version and treated as 1 B.C.E. 	TokenNameCOMMENT_LINE	be allowed in next version and treated as 1 B.C.E. 
if	TokenNameif	
(	TokenNameLPAREN	
eon	TokenNameIdentifier	 eon
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
year	TokenNameIdentifier	 year
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Add <code>duration</code> to this instance.<\p> * * <p>The computation is specified in * <a href="http://www.w3.org/TR/xmlschema-2/#adding-durations-to-dateTimes">XML Schema 1.0 Part 2, Appendix E, * <i>Adding durations to dateTimes</i>></a>. * <a href="#datetimefieldsmapping">date/time field mapping table</a> * defines the mapping from XML Schema 1.0 <code>dateTime</code> fields * to this class' representation of those fields.</p> * * @param duration Duration to add to this <code>XMLGregorianCalendar</code>. * * @throws NullPointerException when <code>duration</code> parameter is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 <p>Add <code>duration</code> to this instance.<\p> * <p>The computation is specified in <a href="http://www.w3.org/TR/xmlschema-2/#adding-durations-to-dateTimes">XML Schema 1.0 Part 2, Appendix E, <i>Adding durations to dateTimes</i>></a>. <a href="#datetimefieldsmapping">date/time field mapping table</a> defines the mapping from XML Schema 1.0 <code>dateTime</code> fields to this class' representation of those fields.</p> * @param duration Duration to add to this <code>XMLGregorianCalendar</code>. * @throws NullPointerException when <code>duration</code> parameter is <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Duration	TokenNameIdentifier	 Duration
duration	TokenNameIdentifier	 duration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * Extracted from * http://www.w3.org/TR/xmlschema-2/#adding-durations-to-dateTimes * to ensure implemented properly. See spec for definitions of methods * used in algorithm. * * Given a dateTime S and a duration D, specifies how to compute a * dateTime E where E is the end of the time period with start S and * duration D i.e. E = S + D. * * The following is the precise specification. * These steps must be followed in the same order. * If a field in D is not specified, it is treated as if it were zero. * If a field in S is not specified, it is treated in the calculation * as if it were the minimum allowed value in that field, however, * after the calculation is concluded, the corresponding field in * E is removed (set to unspecified). * * Months (may be modified additionally below) * temp := S[month] + D[month] * E[month] := modulo(temp, 1, 13) * carry := fQuotient(temp, 1, 13) */	TokenNameCOMMENT_BLOCK	 Extracted from http://www.w3.org/TR/xmlschema-2/#adding-durations-to-dateTimes to ensure implemented properly. See spec for definitions of methods used in algorithm. * Given a dateTime S and a duration D, specifies how to compute a dateTime E where E is the end of the time period with start S and duration D i.e. E = S + D. * The following is the precise specification. These steps must be followed in the same order. If a field in D is not specified, it is treated as if it were zero. If a field in S is not specified, it is treated in the calculation as if it were the minimum allowed value in that field, however, after the calculation is concluded, the corresponding field in E is removed (set to unspecified). * Months (may be modified additionally below) temp := S[month] + D[month] E[month] := modulo(temp, 1, 13) carry := fQuotient(temp, 1, 13) 
boolean	TokenNameboolean	
fieldUndefined	TokenNameIdentifier	 field Undefined
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
signum	TokenNameIdentifier	 signum
=	TokenNameEQUAL	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
startMonth	TokenNameIdentifier	 start Month
=	TokenNameEQUAL	
getMonth	TokenNameIdentifier	 get Month
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startMonth	TokenNameIdentifier	 start Month
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startMonth	TokenNameIdentifier	 start Month
=	TokenNameEQUAL	
MIN_FIELD_VALUE	TokenNameIdentifier	 MIN  FIELD  VALUE
[	TokenNameLBRACKET	
MONTH	TokenNameIdentifier	 MONTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fieldUndefined	TokenNameIdentifier	 field Undefined
[	TokenNameLBRACKET	
MONTH	TokenNameIdentifier	 MONTH
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
dMonths	TokenNameIdentifier	 d Months
=	TokenNameEQUAL	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MONTHS	TokenNameIdentifier	 MONTHS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
signum	TokenNameIdentifier	 signum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BigInteger	TokenNameIdentifier	 Big Integer
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
startMonth	TokenNameIdentifier	 start Month
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dMonths	TokenNameIdentifier	 d Months
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMonth	TokenNameIdentifier	 set Month
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
.	TokenNameDOT	
mod	TokenNameIdentifier	 mod
(	TokenNameLPAREN	
TWELVE	TokenNameIdentifier	 TWELVE
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BigInteger	TokenNameIdentifier	 Big Integer
carry	TokenNameIdentifier	 carry
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
divide	TokenNameIdentifier	 divide
(	TokenNameLPAREN	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
TWELVE	TokenNameIdentifier	 TWELVE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
ROUND_FLOOR	TokenNameIdentifier	 ROUND  FLOOR
)	TokenNameRPAREN	
.	TokenNameDOT	
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Years (may be modified additionally below) * E[year] := S[year] + D[year] + carry */	TokenNameCOMMENT_BLOCK	 Years (may be modified additionally below) E[year] := S[year] + D[year] + carry 
BigInteger	TokenNameIdentifier	 Big Integer
startYear	TokenNameIdentifier	 start Year
=	TokenNameEQUAL	
getEonAndYear	TokenNameIdentifier	 get Eon And Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startYear	TokenNameIdentifier	 start Year
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldUndefined	TokenNameIdentifier	 field Undefined
[	TokenNameLBRACKET	
YEAR	TokenNameIdentifier	 YEAR
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
startYear	TokenNameIdentifier	 start Year
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
ZERO	TokenNameIdentifier	 ZERO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
dYears	TokenNameIdentifier	 d Years
=	TokenNameEQUAL	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
YEARS	TokenNameIdentifier	 YEARS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
signum	TokenNameIdentifier	 signum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BigInteger	TokenNameIdentifier	 Big Integer
endYear	TokenNameIdentifier	 end Year
=	TokenNameEQUAL	
startYear	TokenNameIdentifier	 start Year
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dYears	TokenNameIdentifier	 d Years
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
carry	TokenNameIdentifier	 carry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setYear	TokenNameIdentifier	 set Year
(	TokenNameLPAREN	
endYear	TokenNameIdentifier	 end Year
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Zone * E[zone] := S[zone] * * no-op since adding to this, not to a new end point. */	TokenNameCOMMENT_BLOCK	 Zone E[zone] := S[zone] * no-op since adding to this, not to a new end point. 
/* Seconds * temp := S[second] + D[second] * E[second] := modulo(temp, 60) * carry := fQuotient(temp, 60) */	TokenNameCOMMENT_BLOCK	 Seconds temp := S[second] + D[second] E[second] := modulo(temp, 60) carry := fQuotient(temp, 60) 
BigDecimal	TokenNameIdentifier	 Big Decimal
startSeconds	TokenNameIdentifier	 start Seconds
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getSecond	TokenNameIdentifier	 get Second
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldUndefined	TokenNameIdentifier	 field Undefined
[	TokenNameLBRACKET	
SECOND	TokenNameIdentifier	 SECOND
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
startSeconds	TokenNameIdentifier	 start Seconds
=	TokenNameEQUAL	
DECIMAL_ZERO	TokenNameIdentifier	 DECIMAL  ZERO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// seconds + fractionalSeconds 	TokenNameCOMMENT_LINE	seconds + fractionalSeconds 
startSeconds	TokenNameIdentifier	 start Seconds
=	TokenNameEQUAL	
getSeconds	TokenNameIdentifier	 get Seconds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Duration seconds is SECONDS + FRACTIONALSECONDS. 	TokenNameCOMMENT_LINE	Duration seconds is SECONDS + FRACTIONALSECONDS. 
BigDecimal	TokenNameIdentifier	 Big Decimal
dSeconds	TokenNameIdentifier	 d Seconds
=	TokenNameEQUAL	
DurationImpl	TokenNameIdentifier	 Duration Impl
.	TokenNameDOT	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigDecimal	TokenNameIdentifier	 Big Decimal
)	TokenNameRPAREN	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
signum	TokenNameIdentifier	 signum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BigDecimal	TokenNameIdentifier	 Big Decimal
tempBD	TokenNameIdentifier	 temp BD
=	TokenNameEQUAL	
startSeconds	TokenNameIdentifier	 start Seconds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dSeconds	TokenNameIdentifier	 d Seconds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BigDecimal	TokenNameIdentifier	 Big Decimal
fQuotient	TokenNameIdentifier	 f Quotient
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
tempBD	TokenNameIdentifier	 temp BD
.	TokenNameDOT	
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
divide	TokenNameIdentifier	 divide
(	TokenNameLPAREN	
DECIMAL_SIXTY	TokenNameIdentifier	 DECIMAL  SIXTY
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
ROUND_FLOOR	TokenNameIdentifier	 ROUND  FLOOR
)	TokenNameRPAREN	
.	TokenNameDOT	
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BigDecimal	TokenNameIdentifier	 Big Decimal
endSeconds	TokenNameIdentifier	 end Seconds
=	TokenNameEQUAL	
tempBD	TokenNameIdentifier	 temp BD
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
fQuotient	TokenNameIdentifier	 f Quotient
.	TokenNameDOT	
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
DECIMAL_SIXTY	TokenNameIdentifier	 DECIMAL  SIXTY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
carry	TokenNameIdentifier	 carry
=	TokenNameEQUAL	
fQuotient	TokenNameIdentifier	 f Quotient
.	TokenNameDOT	
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSecond	TokenNameIdentifier	 set Second
(	TokenNameLPAREN	
endSeconds	TokenNameIdentifier	 end Seconds
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BigDecimal	TokenNameIdentifier	 Big Decimal
tempFracSeconds	TokenNameIdentifier	 temp Frac Seconds
=	TokenNameEQUAL	
endSeconds	TokenNameIdentifier	 end Seconds
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
getSecond	TokenNameIdentifier	 get Second
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tempFracSeconds	TokenNameIdentifier	 temp Frac Seconds
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
DECIMAL_ZERO	TokenNameIdentifier	 DECIMAL  ZERO
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setFractionalSecond	TokenNameIdentifier	 set Fractional Second
(	TokenNameLPAREN	
DECIMAL_ONE	TokenNameIdentifier	 DECIMAL  ONE
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tempFracSeconds	TokenNameIdentifier	 temp Frac Seconds
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getSecond	TokenNameIdentifier	 get Second
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSecond	TokenNameIdentifier	 set Second
(	TokenNameLPAREN	
59	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
carry	TokenNameIdentifier	 carry
=	TokenNameEQUAL	
carry	TokenNameIdentifier	 carry
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setSecond	TokenNameIdentifier	 set Second
(	TokenNameLPAREN	
getSecond	TokenNameIdentifier	 get Second
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setFractionalSecond	TokenNameIdentifier	 set Fractional Second
(	TokenNameLPAREN	
tempFracSeconds	TokenNameIdentifier	 temp Frac Seconds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Minutes * temp := S[minute] + D[minute] + carry * E[minute] := modulo(temp, 60) * carry := fQuotient(temp, 60) */	TokenNameCOMMENT_BLOCK	 Minutes temp := S[minute] + D[minute] + carry E[minute] := modulo(temp, 60) carry := fQuotient(temp, 60) 
int	TokenNameint	
startMinutes	TokenNameIdentifier	 start Minutes
=	TokenNameEQUAL	
getMinute	TokenNameIdentifier	 get Minute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startMinutes	TokenNameIdentifier	 start Minutes
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldUndefined	TokenNameIdentifier	 field Undefined
[	TokenNameLBRACKET	
MINUTE	TokenNameIdentifier	 MINUTE
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
startMinutes	TokenNameIdentifier	 start Minutes
=	TokenNameEQUAL	
MIN_FIELD_VALUE	TokenNameIdentifier	 MIN  FIELD  VALUE
[	TokenNameLBRACKET	
MINUTE	TokenNameIdentifier	 MINUTE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
dMinutes	TokenNameIdentifier	 d Minutes
=	TokenNameEQUAL	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MINUTES	TokenNameIdentifier	 MINUTES
)	TokenNameRPAREN	
,	TokenNameCOMMA	
signum	TokenNameIdentifier	 signum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
startMinutes	TokenNameIdentifier	 start Minutes
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dMinutes	TokenNameIdentifier	 d Minutes
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
carry	TokenNameIdentifier	 carry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMinute	TokenNameIdentifier	 set Minute
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
mod	TokenNameIdentifier	 mod
(	TokenNameLPAREN	
SIXTY	TokenNameIdentifier	 SIXTY
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
carry	TokenNameIdentifier	 carry
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
)	TokenNameRPAREN	
.	TokenNameDOT	
divide	TokenNameIdentifier	 divide
(	TokenNameLPAREN	
DECIMAL_SIXTY	TokenNameIdentifier	 DECIMAL  SIXTY
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
ROUND_FLOOR	TokenNameIdentifier	 ROUND  FLOOR
)	TokenNameRPAREN	
.	TokenNameDOT	
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Hours * temp := S[hour] + D[hour] + carry * E[hour] := modulo(temp, 24) * carry := fQuotient(temp, 24) */	TokenNameCOMMENT_BLOCK	 Hours temp := S[hour] + D[hour] + carry E[hour] := modulo(temp, 24) carry := fQuotient(temp, 24) 
int	TokenNameint	
startHours	TokenNameIdentifier	 start Hours
=	TokenNameEQUAL	
getHour	TokenNameIdentifier	 get Hour
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startHours	TokenNameIdentifier	 start Hours
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldUndefined	TokenNameIdentifier	 field Undefined
[	TokenNameLBRACKET	
HOUR	TokenNameIdentifier	 HOUR
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
startHours	TokenNameIdentifier	 start Hours
=	TokenNameEQUAL	
MIN_FIELD_VALUE	TokenNameIdentifier	 MIN  FIELD  VALUE
[	TokenNameLBRACKET	
HOUR	TokenNameIdentifier	 HOUR
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
dHours	TokenNameIdentifier	 d Hours
=	TokenNameEQUAL	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
HOURS	TokenNameIdentifier	 HOURS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
signum	TokenNameIdentifier	 signum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
startHours	TokenNameIdentifier	 start Hours
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dHours	TokenNameIdentifier	 d Hours
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
carry	TokenNameIdentifier	 carry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setHour	TokenNameIdentifier	 set Hour
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
mod	TokenNameIdentifier	 mod
(	TokenNameLPAREN	
TWENTY_FOUR	TokenNameIdentifier	 TWENTY  FOUR
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
carry	TokenNameIdentifier	 carry
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
)	TokenNameRPAREN	
.	TokenNameDOT	
divide	TokenNameIdentifier	 divide
(	TokenNameLPAREN	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
TWENTY_FOUR	TokenNameIdentifier	 TWENTY  FOUR
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
ROUND_FLOOR	TokenNameIdentifier	 ROUND  FLOOR
)	TokenNameRPAREN	
.	TokenNameDOT	
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Days * if S[day] > maximumDayInMonthFor(E[year], E[month]) * + tempDays := maximumDayInMonthFor(E[year], E[month]) * else if S[day] < 1 * + tempDays := 1 * else * + tempDays := S[day] * E[day] := tempDays + D[day] + carry * START LOOP * + IF E[day] < 1 * # E[day] := E[day] + * maximumDayInMonthFor(E[year], E[month] - 1) * # carry := -1 * + ELSE IF E[day] > maximumDayInMonthFor(E[year], E[month]) * # E[day] := * E[day] - maximumDayInMonthFor(E[year], E[month]) * # carry := 1 * + ELSE EXIT LOOP * + temp := E[month] + carry * + E[month] := modulo(temp, 1, 13) * + E[year] := E[year] + fQuotient(temp, 1, 13) * + GOTO START LOOP */	TokenNameCOMMENT_BLOCK	 Days if S[day] > maximumDayInMonthFor(E[year], E[month]) + tempDays := maximumDayInMonthFor(E[year], E[month]) else if S[day] < 1 + tempDays := 1 else + tempDays := S[day] E[day] := tempDays + D[day] + carry START LOOP + IF E[day] < 1 # E[day] := E[day] + maximumDayInMonthFor(E[year], E[month] - 1) # carry := -1 + ELSE IF E[day] > maximumDayInMonthFor(E[year], E[month]) # E[day] := E[day] - maximumDayInMonthFor(E[year], E[month]) # carry := 1 + ELSE EXIT LOOP + temp := E[month] + carry + E[month] := modulo(temp, 1, 13) + E[year] := E[year] + fQuotient(temp, 1, 13) + GOTO START LOOP 
BigInteger	TokenNameIdentifier	 Big Integer
tempDays	TokenNameIdentifier	 temp Days
;	TokenNameSEMICOLON	
int	TokenNameint	
startDay	TokenNameIdentifier	 start Day
=	TokenNameEQUAL	
getDay	TokenNameIdentifier	 get Day
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startDay	TokenNameIdentifier	 start Day
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldUndefined	TokenNameIdentifier	 field Undefined
[	TokenNameLBRACKET	
DAY	TokenNameIdentifier	 DAY
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
startDay	TokenNameIdentifier	 start Day
=	TokenNameEQUAL	
MIN_FIELD_VALUE	TokenNameIdentifier	 MIN  FIELD  VALUE
[	TokenNameLBRACKET	
DAY	TokenNameIdentifier	 DAY
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
dDays	TokenNameIdentifier	 d Days
=	TokenNameEQUAL	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
duration	TokenNameIdentifier	 duration
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
DAYS	TokenNameIdentifier	 DAYS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
signum	TokenNameIdentifier	 signum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxDayInMonth	TokenNameIdentifier	 max Day In Month
=	TokenNameEQUAL	
maximumDayInMonthFor	TokenNameIdentifier	 maximum Day In Month For
(	TokenNameLPAREN	
getEonAndYear	TokenNameIdentifier	 get Eon And Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getMonth	TokenNameIdentifier	 get Month
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startDay	TokenNameIdentifier	 start Day
>	TokenNameGREATER	
maxDayInMonth	TokenNameIdentifier	 max Day In Month
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tempDays	TokenNameIdentifier	 temp Days
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
maxDayInMonth	TokenNameIdentifier	 max Day In Month
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
startDay	TokenNameIdentifier	 start Day
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tempDays	TokenNameIdentifier	 temp Days
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tempDays	TokenNameIdentifier	 temp Days
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
startDay	TokenNameIdentifier	 start Day
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
endDays	TokenNameIdentifier	 end Days
=	TokenNameEQUAL	
tempDays	TokenNameIdentifier	 temp Days
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dDays	TokenNameIdentifier	 d Days
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
carry	TokenNameIdentifier	 carry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
monthCarry	TokenNameIdentifier	 month Carry
;	TokenNameSEMICOLON	
int	TokenNameint	
intTemp	TokenNameIdentifier	 int Temp
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endDays	TokenNameIdentifier	 end Days
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// calculate days in previous month, watch for month roll over 	TokenNameCOMMENT_LINE	calculate days in previous month, watch for month roll over 
BigInteger	TokenNameIdentifier	 Big Integer
mdimf	TokenNameIdentifier	 mdimf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
month	TokenNameIdentifier	 month
>=	TokenNameGREATER_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mdimf	TokenNameIdentifier	 mdimf
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
maximumDayInMonthFor	TokenNameIdentifier	 maximum Day In Month For
(	TokenNameLPAREN	
getEonAndYear	TokenNameIdentifier	 get Eon And Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getMonth	TokenNameIdentifier	 get Month
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// roll over to December of previous year 	TokenNameCOMMENT_LINE	roll over to December of previous year 
mdimf	TokenNameIdentifier	 mdimf
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
maximumDayInMonthFor	TokenNameIdentifier	 maximum Day In Month For
(	TokenNameLPAREN	
getEonAndYear	TokenNameIdentifier	 get Eon And Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
endDays	TokenNameIdentifier	 end Days
=	TokenNameEQUAL	
endDays	TokenNameIdentifier	 end Days
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mdimf	TokenNameIdentifier	 mdimf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
monthCarry	TokenNameIdentifier	 month Carry
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
endDays	TokenNameIdentifier	 end Days
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
maximumDayInMonthFor	TokenNameIdentifier	 maximum Day In Month For
(	TokenNameLPAREN	
getEonAndYear	TokenNameIdentifier	 get Eon And Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getMonth	TokenNameIdentifier	 get Month
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endDays	TokenNameIdentifier	 end Days
=	TokenNameEQUAL	
endDays	TokenNameIdentifier	 end Days
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
-	TokenNameMINUS	
maximumDayInMonthFor	TokenNameIdentifier	 maximum Day In Month For
(	TokenNameLPAREN	
getEonAndYear	TokenNameIdentifier	 get Eon And Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getMonth	TokenNameIdentifier	 get Month
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
monthCarry	TokenNameIdentifier	 month Carry
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
intTemp	TokenNameIdentifier	 int Temp
=	TokenNameEQUAL	
getMonth	TokenNameIdentifier	 get Month
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
monthCarry	TokenNameIdentifier	 month Carry
;	TokenNameSEMICOLON	
int	TokenNameint	
endMonth	TokenNameIdentifier	 end Month
=	TokenNameEQUAL	
(	TokenNameLPAREN	
intTemp	TokenNameIdentifier	 int Temp
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
(	TokenNameLPAREN	
13	TokenNameIntegerLiteral	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
quotient	TokenNameIdentifier	 quotient
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endMonth	TokenNameIdentifier	 end Month
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endMonth	TokenNameIdentifier	 end Month
=	TokenNameEQUAL	
(	TokenNameLPAREN	
13	TokenNameIntegerLiteral	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
endMonth	TokenNameIdentifier	 end Month
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
quotient	TokenNameIdentifier	 quotient
=	TokenNameEQUAL	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
intTemp	TokenNameIdentifier	 int Temp
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
divide	TokenNameIdentifier	 divide
(	TokenNameLPAREN	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
TWELVE	TokenNameIdentifier	 TWELVE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
ROUND_UP	TokenNameIdentifier	 ROUND  UP
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
quotient	TokenNameIdentifier	 quotient
=	TokenNameEQUAL	
(	TokenNameLPAREN	
intTemp	TokenNameIdentifier	 int Temp
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
13	TokenNameIntegerLiteral	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endMonth	TokenNameIdentifier	 end Month
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setMonth	TokenNameIdentifier	 set Month
(	TokenNameLPAREN	
endMonth	TokenNameIdentifier	 end Month
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
quotient	TokenNameIdentifier	 quotient
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setYear	TokenNameIdentifier	 set Year
(	TokenNameLPAREN	
getEonAndYear	TokenNameIdentifier	 get Eon And Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
quotient	TokenNameIdentifier	 quotient
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
setDay	TokenNameIdentifier	 set Day
(	TokenNameLPAREN	
endDays	TokenNameIdentifier	 end Days
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set fields that where undefined before this addition, back to undefined. 	TokenNameCOMMENT_LINE	set fields that where undefined before this addition, back to undefined. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
YEAR	TokenNameIdentifier	 YEAR
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
SECOND	TokenNameIdentifier	 SECOND
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldUndefined	TokenNameIdentifier	 field Undefined
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
YEAR	TokenNameIdentifier	 YEAR
:	TokenNameCOLON	
setYear	TokenNameIdentifier	 set Year
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MONTH	TokenNameIdentifier	 MONTH
:	TokenNameCOLON	
setMonth	TokenNameIdentifier	 set Month
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DAY	TokenNameIdentifier	 DAY
:	TokenNameCOLON	
setDay	TokenNameIdentifier	 set Day
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
HOUR	TokenNameIdentifier	 HOUR
:	TokenNameCOLON	
setHour	TokenNameIdentifier	 set Hour
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MINUTE	TokenNameIdentifier	 MINUTE
:	TokenNameCOLON	
setMinute	TokenNameIdentifier	 set Minute
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SECOND	TokenNameIdentifier	 SECOND
:	TokenNameCOLON	
setSecond	TokenNameIdentifier	 set Second
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setFractionalSecond	TokenNameIdentifier	 set Fractional Second
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
FOUR	TokenNameIdentifier	 FOUR
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
HUNDRED	TokenNameIdentifier	 HUNDRED
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
FOUR_HUNDRED	TokenNameIdentifier	 FOUR  HUNDRED
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
400	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
SIXTY	TokenNameIdentifier	 SIXTY
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
60	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
TWENTY_FOUR	TokenNameIdentifier	 TWENTY  FOUR
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
TWELVE	TokenNameIdentifier	 TWELVE
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BigDecimal	TokenNameIdentifier	 Big Decimal
DECIMAL_ZERO	TokenNameIdentifier	 DECIMAL  ZERO
=	TokenNameEQUAL	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BigDecimal	TokenNameIdentifier	 Big Decimal
DECIMAL_ONE	TokenNameIdentifier	 DECIMAL  ONE
=	TokenNameEQUAL	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BigDecimal	TokenNameIdentifier	 Big Decimal
DECIMAL_SIXTY	TokenNameIdentifier	 DECIMAL  SIXTY
=	TokenNameEQUAL	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
60	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
DaysInMonth	TokenNameIdentifier	 Days In Month
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// XML Schema months start at 1. 	TokenNameCOMMENT_LINE	XML Schema months start at 1. 
31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
31	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
maximumDayInMonthFor	TokenNameIdentifier	 maximum Day In Month For
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
int	TokenNameint	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
month	TokenNameIdentifier	 month
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FEBRUARY	TokenNameIdentifier	 FEBRUARY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DaysInMonth	TokenNameIdentifier	 Days In Month
.	TokenNameDOT	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
month	TokenNameIdentifier	 month
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
.	TokenNameDOT	
mod	TokenNameIdentifier	 mod
(	TokenNameLPAREN	
FOUR_HUNDRED	TokenNameIdentifier	 FOUR  HUNDRED
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
ZERO	TokenNameIdentifier	 ZERO
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
year	TokenNameIdentifier	 year
.	TokenNameDOT	
mod	TokenNameIdentifier	 mod
(	TokenNameLPAREN	
HUNDRED	TokenNameIdentifier	 HUNDRED
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
ZERO	TokenNameIdentifier	 ZERO
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
year	TokenNameIdentifier	 year
.	TokenNameDOT	
mod	TokenNameIdentifier	 mod
(	TokenNameLPAREN	
FOUR	TokenNameIdentifier	 FOUR
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
ZERO	TokenNameIdentifier	 ZERO
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// is a leap year. 	TokenNameCOMMENT_LINE	is a leap year. 
return	TokenNamereturn	
29	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
DaysInMonth	TokenNameIdentifier	 Days In Month
.	TokenNameDOT	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
month	TokenNameIdentifier	 month
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
maximumDayInMonthFor	TokenNameIdentifier	 maximum Day In Month For
(	TokenNameLPAREN	
int	TokenNameint	
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
int	TokenNameint	
month	TokenNameIdentifier	 month
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
month	TokenNameIdentifier	 month
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FEBRUARY	TokenNameIdentifier	 FEBRUARY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DaysInMonth	TokenNameIdentifier	 Days In Month
.	TokenNameDOT	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
month	TokenNameIdentifier	 month
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
%	TokenNameREMAINDER	
400	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
%	TokenNameREMAINDER	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
%	TokenNameREMAINDER	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// is a leap year. 	TokenNameCOMMENT_LINE	is a leap year. 
return	TokenNamereturn	
29	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
DaysInMonth	TokenNameIdentifier	 Days In Month
.	TokenNameDOT	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FEBRUARY	TokenNameIdentifier	 FEBRUARY
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Convert <code>this</code> to <code>java.util.GregorianCalendar</code>.</p> * * <p>When <code>this</code> instance has an undefined field, this * conversion relies on the <code>java.util.GregorianCalendar</code> default * for its corresponding field. A notable difference between * XML Schema 1.0 date/time datatypes and <code>java.util.GregorianCalendar</code> * is that Timezone value is optional for date/time datatypes and it is * a required field for <code>java.util.GregorianCalendar</code>. See javadoc * for <code>java.util.TimeZone.getDefault()</code> on how the default * is determined. To explicitly specify the <code>TimeZone</code> * instance, see * {@link #toGregorianCalendar(TimeZone, Locale, XMLGregorianCalendar)}.</p> * * <table border="2" rules="all" cellpadding="2"> * <thead> * <tr> * <th align="center" colspan="2"> * Field by Field Conversion from this class to * <code>java.util.GregorianCalendar</code> * </th> * </tr> * </thead> * <tbody> * <tr> * <th><code>java.util.GregorianCalendar</code> field</th> * <th><code>javax.xml.datatype.XMLGregorianCalendar</code> field</th> * </tr> * <tr> * <th><code>ERA</code></th> * <th>{@link #getEonAndYear()}<code>.signum() < 0 ? GregorianCalendar.BC : GregorianCalendar.AD</code></th> * </tr> * <tr> * <th><code>YEAR</code></th> * <th>{@link #getEonAndYear()}<code>.abs().intValue()</code><i>*</i></th> * </tr> * <tr> * <th><code>MONTH</code></th> * <th>{@link #getMonth()}<code> - 1</code></th> * </tr> * <tr> * <th><code>DAY_OF_MONTH</code></th> * <th>{@link #getDay()}</th> * </tr> * <tr> * <th><code>AM_PM</code></th> * <th>{@link #getHour()} < 12 : Calendar.AM : Calendar.PM</th> * </tr> * <tr> * <th><code>HOUR_OF_DAY</code></th> * <th>{@link #getHour()}</th> * </tr> * <tr> * <th><code>MINUTE</code></th> * <th>{@link #getMinute()}</th> * </tr> * <tr> * <th><code>SECOND</code></th> * <th>{@link #getSecond()}</th> * </tr> * <tr> * <th><code>MILLISECOND</code></th> * <th>get millisecond order from {@link #getFractionalSecond()}<i>*</i> </th> * </tr> * <tr> * <th><code>GregorianCalendar.setTimeZone(TimeZone)</code></th> * <th>{@link #getTimezone()} formatted into Custom timezone id</th> * </tr> * </tbody> * </table> * <i>*</i> designates possible loss of precision during the conversion due * to source datatype having higer precison than target datatype. * * <p>To ensure consistency in conversion implementations, the new * <code>GregorianCalendar</code> should be instantiated in following * manner. * <ul> * <li>Using <code>timeZone</code> value as defined above, create a new * <code>java.util.GregorianCalendar(timeZone,Locale.getDefault())</code>. * </li> * <li>Initialize all GregorianCalendar fields by calling {(@link GegorianCalendar#clear()}.</li> * <li>Obtain a pure Gregorian Calendar by invoking * <code>GregorianCalendar.setGregorianChange( * new Date(Long.MIN_VALUE))</code>.</li> * <li>Its fields ERA, YEAR, MONTH, DAY_OF_MONTH, HOUR_OF_DAY, * MINUTE, SECOND and MILLISECOND are set using the method * <code>Calendar.set(int,int)</code></li> * </ul> * </p> * * @see #toGregorianCalendar(java.util.TimeZone, java.util.Locale, XMLGregorianCalendar) */	TokenNameCOMMENT_JAVADOC	 <p>Convert <code>this</code> to <code>java.util.GregorianCalendar</code>.</p> * <p>When <code>this</code> instance has an undefined field, this conversion relies on the <code>java.util.GregorianCalendar</code> default for its corresponding field. A notable difference between XML Schema 1.0 date/time datatypes and <code>java.util.GregorianCalendar</code> is that Timezone value is optional for date/time datatypes and it is a required field for <code>java.util.GregorianCalendar</code>. See javadoc for <code>java.util.TimeZone.getDefault()</code> on how the default is determined. To explicitly specify the <code>TimeZone</code> instance, see {@link #toGregorianCalendar(TimeZone, Locale, XMLGregorianCalendar)}.</p> * <table border="2" rules="all" cellpadding="2"> <thead> <tr> <th align="center" colspan="2"> Field by Field Conversion from this class to <code>java.util.GregorianCalendar</code> </th> </tr> </thead> <tbody> <tr> <th><code>java.util.GregorianCalendar</code> field</th> <th><code>javax.xml.datatype.XMLGregorianCalendar</code> field</th> </tr> <tr> <th><code>ERA</code></th> <th>{@link #getEonAndYear()}<code>.signum() < 0 ? GregorianCalendar.BC : GregorianCalendar.AD</code></th> </tr> <tr> <th><code>YEAR</code></th> <th>{@link #getEonAndYear()}<code>.abs().intValue()</code><i>*</i></th> </tr> <tr> <th><code>MONTH</code></th> <th>{@link #getMonth()}<code> - 1</code></th> </tr> <tr> <th><code>DAY_OF_MONTH</code></th> <th>{@link #getDay()}</th> </tr> <tr> <th><code>AM_PM</code></th> <th>{@link #getHour()} < 12 : Calendar.AM : Calendar.PM</th> </tr> <tr> <th><code>HOUR_OF_DAY</code></th> <th>{@link #getHour()}</th> </tr> <tr> <th><code>MINUTE</code></th> <th>{@link #getMinute()}</th> </tr> <tr> <th><code>SECOND</code></th> <th>{@link #getSecond()}</th> </tr> <tr> <th><code>MILLISECOND</code></th> <th>get millisecond order from {@link #getFractionalSecond()}<i>*</i> </th> </tr> <tr> <th><code>GregorianCalendar.setTimeZone(TimeZone)</code></th> <th>{@link #getTimezone()} formatted into Custom timezone id</th> </tr> </tbody> </table> <i>*</i> designates possible loss of precision during the conversion due to source datatype having higer precison than target datatype. * <p>To ensure consistency in conversion implementations, the new <code>GregorianCalendar</code> should be instantiated in following manner. <ul> <li>Using <code>timeZone</code> value as defined above, create a new <code>java.util.GregorianCalendar(timeZone,Locale.getDefault())</code>. </li> <li>Initialize all GregorianCalendar fields by calling {(@link GegorianCalendar#clear()}.</li> <li>Obtain a pure Gregorian Calendar by invoking <code>GregorianCalendar.setGregorianChange( new Date(Long.MIN_VALUE))</code>.</li> <li>Its fields ERA, YEAR, MONTH, DAY_OF_MONTH, HOUR_OF_DAY, MINUTE, SECOND and MILLISECOND are set using the method <code>Calendar.set(int,int)</code></li> </ul> </p> * @see #toGregorianCalendar(java.util.TimeZone, java.util.Locale, XMLGregorianCalendar) 
public	TokenNamepublic	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
toGregorianCalendar	TokenNameIdentifier	 to Gregorian Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_TIMEZONE_OFFSET	TokenNameIdentifier	 DEFAULT  TIMEZONE  OFFSET
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
TimeZone	TokenNameIdentifier	 Time Zone
tz	TokenNameIdentifier	 tz
=	TokenNameEQUAL	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
DEFAULT_TIMEZONE_OFFSET	TokenNameIdentifier	 DEFAULT  TIMEZONE  OFFSET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
(	TokenNameLPAREN	
tz	TokenNameIdentifier	 tz
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setGregorianChange	TokenNameIdentifier	 set Gregorian Change
(	TokenNameLPAREN	
PURE_GREGORIAN_CHANGE	TokenNameIdentifier	 PURE  GREGORIAN  CHANGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if year( and eon) are undefined, leave default Calendar values 	TokenNameCOMMENT_LINE	if year( and eon) are undefined, leave default Calendar values 
if	TokenNameif	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
eon	TokenNameIdentifier	 eon
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
ERA	TokenNameIdentifier	 ERA
,	TokenNameCOMMA	
year	TokenNameIdentifier	 year
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
BC	TokenNameIdentifier	 BC
:	TokenNameCOLON	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
AD	TokenNameIdentifier	 AD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
eonAndYear	TokenNameIdentifier	 eon And Year
=	TokenNameEQUAL	
getEonAndYear	TokenNameIdentifier	 get Eon And Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
ERA	TokenNameIdentifier	 ERA
,	TokenNameCOMMA	
eonAndYear	TokenNameIdentifier	 eon And Year
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
BC	TokenNameIdentifier	 BC
:	TokenNameCOLON	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
AD	TokenNameIdentifier	 AD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
eonAndYear	TokenNameIdentifier	 eon And Year
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// only set month if it is set 	TokenNameCOMMENT_LINE	only set month if it is set 
if	TokenNameif	
(	TokenNameLPAREN	
month	TokenNameIdentifier	 month
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Calendar.MONTH is zero based while XMLGregorianCalendar month field is not. 	TokenNameCOMMENT_LINE	Calendar.MONTH is zero based while XMLGregorianCalendar month field is not. 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
,	TokenNameCOMMA	
month	TokenNameIdentifier	 month
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// only set day if it is set 	TokenNameCOMMENT_LINE	only set day if it is set 
if	TokenNameif	
(	TokenNameLPAREN	
day	TokenNameIdentifier	 day
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
,	TokenNameCOMMA	
day	TokenNameIdentifier	 day
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// only set hour if it is set 	TokenNameCOMMENT_LINE	only set hour if it is set 
if	TokenNameif	
(	TokenNameLPAREN	
hour	TokenNameIdentifier	 hour
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
,	TokenNameCOMMA	
hour	TokenNameIdentifier	 hour
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// only set minute if it is set 	TokenNameCOMMENT_LINE	only set minute if it is set 
if	TokenNameif	
(	TokenNameLPAREN	
minute	TokenNameIdentifier	 minute
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
minute	TokenNameIdentifier	 minute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// only set second if it is set 	TokenNameCOMMENT_LINE	only set second if it is set 
if	TokenNameif	
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// only set millisend if it is set 	TokenNameCOMMENT_LINE	only set millisend if it is set 
if	TokenNameif	
(	TokenNameLPAREN	
fractionalSecond	TokenNameIdentifier	 fractional Second
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
getMillisecond	TokenNameIdentifier	 get Millisecond
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Convert <code>this</code> along with provided parameters * to <code>java.util.GregorianCalendar</code> instance.</p> * * <p> Since XML Schema 1.0 date/time datetypes has no concept of * timezone ids or daylight savings timezone ids, this conversion operation * allows the user to explicitly specify one with * <code>timezone</code> parameter.</p> * * <p>To compute the return value's <code>TimeZone</code> field, * <ul> * <li>when parameter <code>timeZone</code> is non-null, * it is the timezone field.</li> * <li>else when <code>this.getTimezone() != DatatypeConstants.FIELD_UNDEFINED</code>, * create a <code>java.util.TimeZone</code> with a custom timezone id * using the <code>this.getTimezone()</code>.</li> * <li>else when <code>defaults.getTimezone() != DatatypeConstants.FIELD_UNDEFINED</code>, * create a <code>java.util.TimeZone</code> with a custom timezone id * using <code>defaults.getTimezone()</code>.</li> * <li>else use the <code>GregorianCalendar</code> default timezone value * for the host is definedas specified by * <code>java.util.TimeZone.getDefault()</code>.</li></p> * * <p>To ensure consistency in conversion implementations, the new * <code>GregorianCalendar</code> should be instantiated in following * manner. * <ul> * <li>Create a new <code>java.util.GregorianCalendar(TimeZone, * Locale)</code> with TimeZone set as specified above and the * <code>Locale</code> parameter. * </li> * <li>Initialize all GregorianCalendar fields by calling {(@link GegorianCalendar#clear()}.</li> * <li>Obtain a pure Gregorian Calendar by invoking * <code>GregorianCalendar.setGregorianChange( * new Date(Long.MIN_VALUE))</code>.</li> * <li>Its fields ERA, YEAR, MONTH, DAY_OF_MONTH, HOUR_OF_DAY, * MINUTE, SECOND and MILLISECOND are set using the method * <code>Calendar.set(int,int)</code></li> * </ul> * * @param timezone provide Timezone. <code>null</code> is a legal value. * @param aLocale provide explicit Locale. Use default GregorianCalendar locale if * value is <code>null</code>. * @param defaults provide default field values to use when corresponding * field for this instance is DatatypeConstants.FIELD_UNDEFINED or null. * If <code>defaults</code>is <code>null</code> or a field * within the specified <code>defaults</code> is undefined, * just use <code>java.util.GregorianCalendar</code> defaults. * @return a java.util.GregorianCalendar conversion of this instance. * * @see #LEAP_YEAR_DEFAULT */	TokenNameCOMMENT_JAVADOC	 <p>Convert <code>this</code> along with provided parameters to <code>java.util.GregorianCalendar</code> instance.</p> * <p> Since XML Schema 1.0 date/time datetypes has no concept of timezone ids or daylight savings timezone ids, this conversion operation allows the user to explicitly specify one with <code>timezone</code> parameter.</p> * <p>To compute the return value's <code>TimeZone</code> field, <ul> <li>when parameter <code>timeZone</code> is non-null, it is the timezone field.</li> <li>else when <code>this.getTimezone() != DatatypeConstants.FIELD_UNDEFINED</code>, create a <code>java.util.TimeZone</code> with a custom timezone id using the <code>this.getTimezone()</code>.</li> <li>else when <code>defaults.getTimezone() != DatatypeConstants.FIELD_UNDEFINED</code>, create a <code>java.util.TimeZone</code> with a custom timezone id using <code>defaults.getTimezone()</code>.</li> <li>else use the <code>GregorianCalendar</code> default timezone value for the host is definedas specified by <code>java.util.TimeZone.getDefault()</code>.</li></p> * <p>To ensure consistency in conversion implementations, the new <code>GregorianCalendar</code> should be instantiated in following manner. <ul> <li>Create a new <code>java.util.GregorianCalendar(TimeZone, Locale)</code> with TimeZone set as specified above and the <code>Locale</code> parameter. </li> <li>Initialize all GregorianCalendar fields by calling {(@link GegorianCalendar#clear()}.</li> <li>Obtain a pure Gregorian Calendar by invoking <code>GregorianCalendar.setGregorianChange( new Date(Long.MIN_VALUE))</code>.</li> <li>Its fields ERA, YEAR, MONTH, DAY_OF_MONTH, HOUR_OF_DAY, MINUTE, SECOND and MILLISECOND are set using the method <code>Calendar.set(int,int)</code></li> </ul> * @param timezone provide Timezone. <code>null</code> is a legal value. @param aLocale provide explicit Locale. Use default GregorianCalendar locale if value is <code>null</code>. @param defaults provide default field values to use when corresponding field for this instance is DatatypeConstants.FIELD_UNDEFINED or null. If <code>defaults</code>is <code>null</code> or a field within the specified <code>defaults</code> is undefined, just use <code>java.util.GregorianCalendar</code> defaults. @return a java.util.GregorianCalendar conversion of this instance. * @see #LEAP_YEAR_DEFAULT 
public	TokenNamepublic	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
toGregorianCalendar	TokenNameIdentifier	 to Gregorian Calendar
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TimeZone	TokenNameIdentifier	 Time Zone
timezone	TokenNameIdentifier	 timezone
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
aLocale	TokenNameIdentifier	 a Locale
,	TokenNameCOMMA	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
defaults	TokenNameIdentifier	 defaults
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
TimeZone	TokenNameIdentifier	 Time Zone
tz	TokenNameIdentifier	 tz
=	TokenNameEQUAL	
timezone	TokenNameIdentifier	 timezone
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tz	TokenNameIdentifier	 tz
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
defaultZoneoffset	TokenNameIdentifier	 default Zoneoffset
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
defaults	TokenNameIdentifier	 defaults
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultZoneoffset	TokenNameIdentifier	 default Zoneoffset
=	TokenNameEQUAL	
defaults	TokenNameIdentifier	 defaults
.	TokenNameDOT	
getTimezone	TokenNameIdentifier	 get Timezone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tz	TokenNameIdentifier	 tz
=	TokenNameEQUAL	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
defaultZoneoffset	TokenNameIdentifier	 default Zoneoffset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
aLocale	TokenNameIdentifier	 a Locale
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aLocale	TokenNameIdentifier	 a Locale
=	TokenNameEQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
(	TokenNameLPAREN	
tz	TokenNameIdentifier	 tz
,	TokenNameCOMMA	
aLocale	TokenNameIdentifier	 a Locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setGregorianChange	TokenNameIdentifier	 set Gregorian Change
(	TokenNameLPAREN	
PURE_GREGORIAN_CHANGE	TokenNameIdentifier	 PURE  GREGORIAN  CHANGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if year( and eon) are undefined, leave default Calendar values 	TokenNameCOMMENT_LINE	if year( and eon) are undefined, leave default Calendar values 
if	TokenNameif	
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
eon	TokenNameIdentifier	 eon
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
ERA	TokenNameIdentifier	 ERA
,	TokenNameCOMMA	
year	TokenNameIdentifier	 year
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
BC	TokenNameIdentifier	 BC
:	TokenNameCOLON	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
AD	TokenNameIdentifier	 AD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
year	TokenNameIdentifier	 year
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
eonAndYear	TokenNameIdentifier	 eon And Year
=	TokenNameEQUAL	
getEonAndYear	TokenNameIdentifier	 get Eon And Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
ERA	TokenNameIdentifier	 ERA
,	TokenNameCOMMA	
eonAndYear	TokenNameIdentifier	 eon And Year
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
BC	TokenNameIdentifier	 BC
:	TokenNameCOLON	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
AD	TokenNameIdentifier	 AD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
eonAndYear	TokenNameIdentifier	 eon And Year
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// use default if set 	TokenNameCOMMENT_LINE	use default if set 
if	TokenNameif	
(	TokenNameLPAREN	
defaults	TokenNameIdentifier	 defaults
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
defaultYear	TokenNameIdentifier	 default Year
=	TokenNameEQUAL	
defaults	TokenNameIdentifier	 defaults
.	TokenNameDOT	
getYear	TokenNameIdentifier	 get Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
defaultYear	TokenNameIdentifier	 default Year
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
defaults	TokenNameIdentifier	 defaults
.	TokenNameDOT	
getEon	TokenNameIdentifier	 get Eon
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
ERA	TokenNameIdentifier	 ERA
,	TokenNameCOMMA	
defaultYear	TokenNameIdentifier	 default Year
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
BC	TokenNameIdentifier	 BC
:	TokenNameCOLON	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
AD	TokenNameIdentifier	 AD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
defaultYear	TokenNameIdentifier	 default Year
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
defaultEonAndYear	TokenNameIdentifier	 default Eon And Year
=	TokenNameEQUAL	
defaults	TokenNameIdentifier	 defaults
.	TokenNameDOT	
getEonAndYear	TokenNameIdentifier	 get Eon And Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
ERA	TokenNameIdentifier	 ERA
,	TokenNameCOMMA	
defaultEonAndYear	TokenNameIdentifier	 default Eon And Year
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
BC	TokenNameIdentifier	 BC
:	TokenNameCOLON	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
AD	TokenNameIdentifier	 AD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
defaultEonAndYear	TokenNameIdentifier	 default Eon And Year
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// only set month if it is set 	TokenNameCOMMENT_LINE	only set month if it is set 
if	TokenNameif	
(	TokenNameLPAREN	
month	TokenNameIdentifier	 month
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Calendar.MONTH is zero based while XMLGregorianCalendar month field is not. 	TokenNameCOMMENT_LINE	Calendar.MONTH is zero based while XMLGregorianCalendar month field is not. 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
,	TokenNameCOMMA	
month	TokenNameIdentifier	 month
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// use default if set 	TokenNameCOMMENT_LINE	use default if set 
final	TokenNamefinal	
int	TokenNameint	
defaultMonth	TokenNameIdentifier	 default Month
=	TokenNameEQUAL	
(	TokenNameLPAREN	
defaults	TokenNameIdentifier	 defaults
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
defaults	TokenNameIdentifier	 defaults
.	TokenNameDOT	
getMonth	TokenNameIdentifier	 get Month
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
defaultMonth	TokenNameIdentifier	 default Month
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Calendar.MONTH is zero based while XMLGregorianCalendar month field is not. 	TokenNameCOMMENT_LINE	Calendar.MONTH is zero based while XMLGregorianCalendar month field is not. 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
,	TokenNameCOMMA	
defaultMonth	TokenNameIdentifier	 default Month
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// only set day if it is set 	TokenNameCOMMENT_LINE	only set day if it is set 
if	TokenNameif	
(	TokenNameLPAREN	
day	TokenNameIdentifier	 day
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
,	TokenNameCOMMA	
day	TokenNameIdentifier	 day
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// use default if set 	TokenNameCOMMENT_LINE	use default if set 
final	TokenNamefinal	
int	TokenNameint	
defaultDay	TokenNameIdentifier	 default Day
=	TokenNameEQUAL	
(	TokenNameLPAREN	
defaults	TokenNameIdentifier	 defaults
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
defaults	TokenNameIdentifier	 defaults
.	TokenNameDOT	
getDay	TokenNameIdentifier	 get Day
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
defaultDay	TokenNameIdentifier	 default Day
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
,	TokenNameCOMMA	
defaultDay	TokenNameIdentifier	 default Day
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// only set hour if it is set 	TokenNameCOMMENT_LINE	only set hour if it is set 
if	TokenNameif	
(	TokenNameLPAREN	
hour	TokenNameIdentifier	 hour
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
,	TokenNameCOMMA	
hour	TokenNameIdentifier	 hour
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// use default if set 	TokenNameCOMMENT_LINE	use default if set 
int	TokenNameint	
defaultHour	TokenNameIdentifier	 default Hour
=	TokenNameEQUAL	
(	TokenNameLPAREN	
defaults	TokenNameIdentifier	 defaults
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
defaults	TokenNameIdentifier	 defaults
.	TokenNameDOT	
getHour	TokenNameIdentifier	 get Hour
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
defaultHour	TokenNameIdentifier	 default Hour
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
,	TokenNameCOMMA	
defaultHour	TokenNameIdentifier	 default Hour
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// only set minute if it is set 	TokenNameCOMMENT_LINE	only set minute if it is set 
if	TokenNameif	
(	TokenNameLPAREN	
minute	TokenNameIdentifier	 minute
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
minute	TokenNameIdentifier	 minute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// use default if set 	TokenNameCOMMENT_LINE	use default if set 
final	TokenNamefinal	
int	TokenNameint	
defaultMinute	TokenNameIdentifier	 default Minute
=	TokenNameEQUAL	
(	TokenNameLPAREN	
defaults	TokenNameIdentifier	 defaults
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
defaults	TokenNameIdentifier	 defaults
.	TokenNameDOT	
getMinute	TokenNameIdentifier	 get Minute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
defaultMinute	TokenNameIdentifier	 default Minute
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
defaultMinute	TokenNameIdentifier	 default Minute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// only set second if it is set 	TokenNameCOMMENT_LINE	only set second if it is set 
if	TokenNameif	
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// use default if set 	TokenNameCOMMENT_LINE	use default if set 
final	TokenNamefinal	
int	TokenNameint	
defaultSecond	TokenNameIdentifier	 default Second
=	TokenNameEQUAL	
(	TokenNameLPAREN	
defaults	TokenNameIdentifier	 defaults
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
defaults	TokenNameIdentifier	 defaults
.	TokenNameDOT	
getSecond	TokenNameIdentifier	 get Second
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
defaultSecond	TokenNameIdentifier	 default Second
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
defaultSecond	TokenNameIdentifier	 default Second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// only set millisend if it is set 	TokenNameCOMMENT_LINE	only set millisend if it is set 
if	TokenNameif	
(	TokenNameLPAREN	
fractionalSecond	TokenNameIdentifier	 fractional Second
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
getMillisecond	TokenNameIdentifier	 get Millisecond
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// use default if set 	TokenNameCOMMENT_LINE	use default if set 
final	TokenNamefinal	
BigDecimal	TokenNameIdentifier	 Big Decimal
defaultFractionalSecond	TokenNameIdentifier	 default Fractional Second
=	TokenNameEQUAL	
(	TokenNameLPAREN	
defaults	TokenNameIdentifier	 defaults
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
defaults	TokenNameIdentifier	 defaults
.	TokenNameDOT	
getFractionalSecond	TokenNameIdentifier	 get Fractional Second
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
defaultFractionalSecond	TokenNameIdentifier	 default Fractional Second
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
defaults	TokenNameIdentifier	 defaults
.	TokenNameDOT	
getMillisecond	TokenNameIdentifier	 get Millisecond
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Returns a <code>java.util.TimeZone</code> for this class.</p> * * <p>If timezone field is defined for this instance, * returns TimeZone initialized with custom timezone id * of zoneoffset. If timezone field is undefined, * try the defaultZoneoffset that was passed in. * If defaultZoneoffset is DatatypeConstants.FIELD_UNDEFINED, return * default timezone for this host. * (Same default as java.util.GregorianCalendar).</p> * * @param defaultZoneoffset default zoneoffset if this zoneoffset is * {@link DatatypeConstants#FIELD_UNDEFINED}. * * @return TimeZone for this. */	TokenNameCOMMENT_JAVADOC	 <p>Returns a <code>java.util.TimeZone</code> for this class.</p> * <p>If timezone field is defined for this instance, returns TimeZone initialized with custom timezone id of zoneoffset. If timezone field is undefined, try the defaultZoneoffset that was passed in. If defaultZoneoffset is DatatypeConstants.FIELD_UNDEFINED, return default timezone for this host. (Same default as java.util.GregorianCalendar).</p> * @param defaultZoneoffset default zoneoffset if this zoneoffset is {@link DatatypeConstants#FIELD_UNDEFINED}. * @return TimeZone for this. 
public	TokenNamepublic	
TimeZone	TokenNameIdentifier	 Time Zone
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
int	TokenNameint	
defaultZoneoffset	TokenNameIdentifier	 default Zoneoffset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimeZone	TokenNameIdentifier	 Time Zone
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
zoneoffset	TokenNameIdentifier	 zoneoffset
=	TokenNameEQUAL	
getTimezone	TokenNameIdentifier	 get Timezone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
zoneoffset	TokenNameIdentifier	 zoneoffset
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zoneoffset	TokenNameIdentifier	 zoneoffset
=	TokenNameEQUAL	
defaultZoneoffset	TokenNameIdentifier	 default Zoneoffset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
zoneoffset	TokenNameIdentifier	 zoneoffset
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// zoneoffset is in minutes. Convert to custom timezone id format. 	TokenNameCOMMENT_LINE	zoneoffset is in minutes. Convert to custom timezone id format. 
char	TokenNamechar	
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
zoneoffset	TokenNameIdentifier	 zoneoffset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
'+'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zoneoffset	TokenNameIdentifier	 zoneoffset
=	TokenNameEQUAL	
-	TokenNameMINUS	
zoneoffset	TokenNameIdentifier	 zoneoffset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
hour	TokenNameIdentifier	 hour
=	TokenNameEQUAL	
zoneoffset	TokenNameIdentifier	 zoneoffset
/	TokenNameDIVIDE	
60	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
minutes	TokenNameIdentifier	 minutes
=	TokenNameEQUAL	
zoneoffset	TokenNameIdentifier	 zoneoffset
-	TokenNameMINUS	
(	TokenNameLPAREN	
hour	TokenNameIdentifier	 hour
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Javadoc for java.util.TimeZone documents max length 	TokenNameCOMMENT_LINE	Javadoc for java.util.TimeZone documents max length 
// for customTimezoneId is 8 when optional ':' is not used. 	TokenNameCOMMENT_LINE	for customTimezoneId is 8 when optional ':' is not used. 
// Format is 	TokenNameCOMMENT_LINE	Format is 
// "GMT" ('-'|''+') (digit digit?) (digit digit)? 	TokenNameCOMMENT_LINE	"GMT" ('-'|''+') (digit digit?) (digit digit)? 
// hour minutes 	TokenNameCOMMENT_LINE	hour minutes 
StringBuffer	TokenNameIdentifier	 String Buffer
customTimezoneId	TokenNameIdentifier	 custom Timezone Id
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
customTimezoneId	TokenNameIdentifier	 custom Timezone Id
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
customTimezoneId	TokenNameIdentifier	 custom Timezone Id
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
customTimezoneId	TokenNameIdentifier	 custom Timezone Id
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
hour	TokenNameIdentifier	 hour
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minutes	TokenNameIdentifier	 minutes
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minutes	TokenNameIdentifier	 minutes
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
customTimezoneId	TokenNameIdentifier	 custom Timezone Id
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
customTimezoneId	TokenNameIdentifier	 custom Timezone Id
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
minutes	TokenNameIdentifier	 minutes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
customTimezoneId	TokenNameIdentifier	 custom Timezone Id
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Creates and returns a copy of this object.</p> * * @return copy of this <code>Object</code> */	TokenNameCOMMENT_JAVADOC	 <p>Creates and returns a copy of this object.</p> * @return copy of this <code>Object</code> 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Both this.eon and this.fractionalSecond are instances 	TokenNameCOMMENT_LINE	Both this.eon and this.fractionalSecond are instances 
// of immutable classes, so they do not need to be cloned. 	TokenNameCOMMENT_LINE	of immutable classes, so they do not need to be cloned. 
return	TokenNamereturn	
new	TokenNamenew	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
(	TokenNameLPAREN	
getEonAndYear	TokenNameIdentifier	 get Eon And Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
fractionalSecond	TokenNameIdentifier	 fractional Second
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Unset all fields to undefined.</p> * * <p>Set all int fields to {@link DatatypeConstants#FIELD_UNDEFINED} and reference fields * to null.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Unset all fields to undefined.</p> * <p>Set all int fields to {@link DatatypeConstants#FIELD_UNDEFINED} and reference fields to null.</p> 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eon	TokenNameIdentifier	 eon
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
timezone	TokenNameIdentifier	 timezone
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
// in minutes 	TokenNameCOMMENT_LINE	in minutes 
hour	TokenNameIdentifier	 hour
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
minute	TokenNameIdentifier	 minute
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
second	TokenNameIdentifier	 second
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
;	TokenNameSEMICOLON	
fractionalSecond	TokenNameIdentifier	 fractional Second
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMillisecond	TokenNameIdentifier	 set Millisecond
(	TokenNameLPAREN	
int	TokenNameint	
millisecond	TokenNameIdentifier	 millisecond
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
millisecond	TokenNameIdentifier	 millisecond
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fractionalSecond	TokenNameIdentifier	 fractional Second
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
checkFieldValueConstraint	TokenNameIdentifier	 check Field Value Constraint
(	TokenNameLPAREN	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
millisecond	TokenNameIdentifier	 millisecond
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fractionalSecond	TokenNameIdentifier	 fractional Second
=	TokenNameEQUAL	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
millisecond	TokenNameIdentifier	 millisecond
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFractionalSecond	TokenNameIdentifier	 set Fractional Second
(	TokenNameLPAREN	
BigDecimal	TokenNameIdentifier	 Big Decimal
fractional	TokenNameIdentifier	 fractional
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fractional	TokenNameIdentifier	 fractional
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fractional	TokenNameIdentifier	 fractional
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
DECIMAL_ZERO	TokenNameIdentifier	 DECIMAL  ZERO
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
fractional	TokenNameIdentifier	 fractional
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
DECIMAL_ONE	TokenNameIdentifier	 DECIMAL  ONE
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"InvalidFractional"	TokenNameStringLiteral	InvalidFractional
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fractional	TokenNameIdentifier	 fractional
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fractionalSecond	TokenNameIdentifier	 fractional Second
=	TokenNameEQUAL	
fractional	TokenNameIdentifier	 fractional
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
class	TokenNameclass	
Parser	TokenNameIdentifier	 Parser
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
flen	TokenNameIdentifier	 flen
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
vlen	TokenNameIdentifier	 vlen
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fidx	TokenNameIdentifier	 fidx
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
vidx	TokenNameIdentifier	 vidx
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Parser	TokenNameIdentifier	 Parser
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
flen	TokenNameIdentifier	 flen
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
vlen	TokenNameIdentifier	 vlen
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Parse a formated <code>String</code> into an <code>XMLGregorianCalendar</code>.</p> * * <p>If <code>String</code> is not formated as a legal <code>XMLGregorianCalendar</code> value, * an <code>IllegalArgumentException</code> is thrown.</p> * * @throws IllegalArgumentException If <code>String</code> is not formated as a legal <code>XMLGregorianCalendar</code> value. */	TokenNameCOMMENT_JAVADOC	 <p>Parse a formated <code>String</code> into an <code>XMLGregorianCalendar</code>.</p> * <p>If <code>String</code> is not formated as a legal <code>XMLGregorianCalendar</code> value, an <code>IllegalArgumentException</code> is thrown.</p> * @throws IllegalArgumentException If <code>String</code> is not formated as a legal <code>XMLGregorianCalendar</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
fidx	TokenNameIdentifier	 fidx
<	TokenNameLESS	
flen	TokenNameIdentifier	 flen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
fch	TokenNameIdentifier	 fch
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
fidx	TokenNameIdentifier	 fidx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fch	TokenNameIdentifier	 fch
!=	TokenNameNOT_EQUAL	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not a meta character 	TokenNameCOMMENT_LINE	not a meta character 
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
fch	TokenNameIdentifier	 fch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// seen meta character. we don't do error check against the format 	TokenNameCOMMENT_LINE	seen meta character. we don't do error check against the format 
switch	TokenNameswitch	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
fidx	TokenNameIdentifier	 fidx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'Y'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// year 	TokenNameCOMMENT_LINE	year 
parseYear	TokenNameIdentifier	 parse Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'M'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// month 	TokenNameCOMMENT_LINE	month 
setMonth	TokenNameIdentifier	 set Month
(	TokenNameLPAREN	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'D'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// days 	TokenNameCOMMENT_LINE	days 
setDay	TokenNameIdentifier	 set Day
(	TokenNameLPAREN	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'h'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// hours 	TokenNameCOMMENT_LINE	hours 
setHour	TokenNameIdentifier	 set Hour
(	TokenNameLPAREN	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'm'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// minutes 	TokenNameCOMMENT_LINE	minutes 
setMinute	TokenNameIdentifier	 set Minute
(	TokenNameLPAREN	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
's'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// parse seconds. 	TokenNameCOMMENT_LINE	parse seconds. 
setSecond	TokenNameIdentifier	 set Second
(	TokenNameLPAREN	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setFractionalSecond	TokenNameIdentifier	 set Fractional Second
(	TokenNameLPAREN	
parseBigDecimal	TokenNameIdentifier	 parse Big Decimal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'z'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// time zone. missing, 'Z', or [+-]nn:nn 	TokenNameCOMMENT_LINE	time zone. missing, 'Z', or [+-]nn:nn 
char	TokenNamechar	
vch	TokenNameIdentifier	 vch
=	TokenNameEQUAL	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
vch	TokenNameIdentifier	 vch
==	TokenNameEQUAL_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vidx	TokenNameIdentifier	 vidx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
setTimezone	TokenNameIdentifier	 set Timezone
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
vch	TokenNameIdentifier	 vch
==	TokenNameEQUAL_EQUAL	
'+'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
vch	TokenNameIdentifier	 vch
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vidx	TokenNameIdentifier	 vidx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTimezone	TokenNameIdentifier	 set Timezone
(	TokenNameLPAREN	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
+	TokenNamePLUS	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
vch	TokenNameIdentifier	 vch
==	TokenNameEQUAL_EQUAL	
'+'	TokenNameCharacterLiteral	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// illegal meta character. impossible. 	TokenNameCOMMENT_LINE	illegal meta character. impossible. 
throw	TokenNamethrow	
new	TokenNamenew	
InternalError	TokenNameIdentifier	 Internal Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
vidx	TokenNameIdentifier	 vidx
!=	TokenNameNOT_EQUAL	
vlen	TokenNameIdentifier	 vlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// some tokens are left in the input 	TokenNameCOMMENT_LINE	some tokens are left in the input 
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//,vidx); 	TokenNameCOMMENT_LINE	,vidx); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
char	TokenNamechar	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
vidx	TokenNameIdentifier	 vidx
==	TokenNameEQUAL_EQUAL	
vlen	TokenNameIdentifier	 vlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
vidx	TokenNameIdentifier	 vidx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
char	TokenNamechar	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
vidx	TokenNameIdentifier	 vidx
==	TokenNameEQUAL_EQUAL	
vlen	TokenNameIdentifier	 vlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//,vidx); 	TokenNameCOMMENT_LINE	,vidx); 
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
vidx	TokenNameIdentifier	 vidx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//,vidx-1); 	TokenNameCOMMENT_LINE	,vidx-1); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
parseYear	TokenNameIdentifier	 parse Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
int	TokenNameint	
vstart	TokenNameIdentifier	 vstart
=	TokenNameEQUAL	
vidx	TokenNameIdentifier	 vidx
;	TokenNameSEMICOLON	
int	TokenNameint	
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// skip leading negative, if it exists 	TokenNameCOMMENT_LINE	skip leading negative, if it exists 
if	TokenNameif	
(	TokenNameLPAREN	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vidx	TokenNameIdentifier	 vidx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vidx	TokenNameIdentifier	 vidx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
digits	TokenNameIdentifier	 digits
=	TokenNameEQUAL	
vidx	TokenNameIdentifier	 vidx
-	TokenNameMINUS	
vstart	TokenNameIdentifier	 vstart
-	TokenNameMINUS	
sign	TokenNameIdentifier	 sign
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
digits	TokenNameIdentifier	 digits
<	TokenNameLESS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we are expecting more digits 	TokenNameCOMMENT_LINE	we are expecting more digits 
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//,vidx); 	TokenNameCOMMENT_LINE	,vidx); 
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
yearString	TokenNameIdentifier	 year String
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
vstart	TokenNameIdentifier	 vstart
,	TokenNameCOMMA	
vidx	TokenNameIdentifier	 vidx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
digits	TokenNameIdentifier	 digits
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setYear	TokenNameIdentifier	 set Year
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
yearString	TokenNameIdentifier	 year String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setYear	TokenNameIdentifier	 set Year
(	TokenNameLPAREN	
new	TokenNamenew	
BigInteger	TokenNameIdentifier	 Big Integer
(	TokenNameLPAREN	
yearString	TokenNameIdentifier	 year String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
int	TokenNameint	
minDigits	TokenNameIdentifier	 min Digits
,	TokenNameCOMMA	
int	TokenNameint	
maxDigits	TokenNameIdentifier	 max Digits
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
int	TokenNameint	
vstart	TokenNameIdentifier	 vstart
=	TokenNameEQUAL	
vidx	TokenNameIdentifier	 vidx
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
vidx	TokenNameIdentifier	 vidx
-	TokenNameMINUS	
vstart	TokenNameIdentifier	 vstart
)	TokenNameRPAREN	
<	TokenNameLESS	
maxDigits	TokenNameIdentifier	 max Digits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vidx	TokenNameIdentifier	 vidx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
vidx	TokenNameIdentifier	 vidx
-	TokenNameMINUS	
vstart	TokenNameIdentifier	 vstart
)	TokenNameRPAREN	
<	TokenNameLESS	
minDigits	TokenNameIdentifier	 min Digits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we are expecting more digits 	TokenNameCOMMENT_LINE	we are expecting more digits 
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//,vidx); 	TokenNameCOMMENT_LINE	,vidx); 
}	TokenNameRBRACE	
// NumberFormatException is IllegalArgumentException 	TokenNameCOMMENT_LINE	NumberFormatException is IllegalArgumentException 
// try { 	TokenNameCOMMENT_LINE	try { 
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
vstart	TokenNameIdentifier	 vstart
,	TokenNameCOMMA	
vidx	TokenNameIdentifier	 vidx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// } catch( NumberFormatException e ) { 	TokenNameCOMMENT_LINE	} catch( NumberFormatException e ) { 
// // if the value is too long for int, NumberFormatException is thrown 	TokenNameCOMMENT_LINE	// if the value is too long for int, NumberFormatException is thrown 
// throw new IllegalArgumentException(value,vstart); 	TokenNameCOMMENT_LINE	throw new IllegalArgumentException(value,vstart); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
private	TokenNameprivate	
BigDecimal	TokenNameIdentifier	 Big Decimal
parseBigDecimal	TokenNameIdentifier	 parse Big Decimal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
int	TokenNameint	
vstart	TokenNameIdentifier	 vstart
=	TokenNameEQUAL	
vidx	TokenNameIdentifier	 vidx
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vidx	TokenNameIdentifier	 vidx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vidx	TokenNameIdentifier	 vidx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
vstart	TokenNameIdentifier	 vstart
,	TokenNameCOMMA	
vidx	TokenNameIdentifier	 vidx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
'0'	TokenNameCharacterLiteral	
<=	TokenNameLESS_EQUAL	
ch	TokenNameIdentifier	 ch
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fidx	TokenNameIdentifier	 fidx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flen	TokenNameIdentifier	 flen
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
fidx	TokenNameIdentifier	 fidx
<	TokenNameLESS	
flen	TokenNameIdentifier	 flen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
fch	TokenNameIdentifier	 fch
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
fidx	TokenNameIdentifier	 fidx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fch	TokenNameIdentifier	 fch
!=	TokenNameNOT_EQUAL	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not a meta char 	TokenNameCOMMENT_LINE	not a meta char 
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fch	TokenNameIdentifier	 fch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
fidx	TokenNameIdentifier	 fidx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'Y'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eon	TokenNameIdentifier	 eon
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
absYear	TokenNameIdentifier	 abs Year
=	TokenNameEQUAL	
year	TokenNameIdentifier	 year
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
absYear	TokenNameIdentifier	 abs Year
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
absYear	TokenNameIdentifier	 abs Year
=	TokenNameEQUAL	
-	TokenNameMINUS	
year	TokenNameIdentifier	 year
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printNumber	TokenNameIdentifier	 print Number
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
absYear	TokenNameIdentifier	 abs Year
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
printNumber	TokenNameIdentifier	 print Number
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
getEonAndYear	TokenNameIdentifier	 get Eon And Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'M'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
printNumber	TokenNameIdentifier	 print Number
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
getMonth	TokenNameIdentifier	 get Month
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'D'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
printNumber	TokenNameIdentifier	 print Number
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
getDay	TokenNameIdentifier	 get Day
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'h'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
printNumber	TokenNameIdentifier	 print Number
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
getHour	TokenNameIdentifier	 get Hour
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'm'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
printNumber	TokenNameIdentifier	 print Number
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
getMinute	TokenNameIdentifier	 get Minute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
's'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
printNumber	TokenNameIdentifier	 print Number
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
getSecond	TokenNameIdentifier	 get Second
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getFractionalSecond	TokenNameIdentifier	 get Fractional Second
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
frac	TokenNameIdentifier	 frac
=	TokenNameEQUAL	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
getFractionalSecond	TokenNameIdentifier	 get Fractional Second
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//skip leading zero. 	TokenNameCOMMENT_LINE	skip leading zero. 
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
frac	TokenNameIdentifier	 frac
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
frac	TokenNameIdentifier	 frac
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'z'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
getTimezone	TokenNameIdentifier	 get Timezone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
!=	TokenNameNOT_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
*=	TokenNameMULTIPLY_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'+'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printNumber	TokenNameIdentifier	 print Number
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
/	TokenNameDIVIDE	
60	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printNumber	TokenNameIdentifier	 print Number
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
%	TokenNameREMAINDER	
60	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
InternalError	TokenNameIdentifier	 Internal Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// impossible 	TokenNameCOMMENT_LINE	impossible 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints an integer as a String. * * @param out * The formatted string will be appended into this buffer. * @param number * The integer to be printed. * @param nDigits * The field will be printed by using at least this * number of digits. For example, 5 will be printed as "0005" * if nDigits==4. */	TokenNameCOMMENT_JAVADOC	 Prints an integer as a String. * @param out The formatted string will be appended into this buffer. @param number The integer to be printed. @param nDigits The field will be printed by using at least this number of digits. For example, 5 will be printed as "0005" if nDigits==4. 
private	TokenNameprivate	
void	TokenNamevoid	
printNumber	TokenNameIdentifier	 print Number
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
int	TokenNameint	
number	TokenNameIdentifier	 number
,	TokenNameCOMMA	
int	TokenNameint	
nDigits	TokenNameIdentifier	 n Digits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nDigits	TokenNameIdentifier	 n Digits
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints an BigInteger as a String. * * @param out * The formatted string will be appended into this buffer. * @param number * The integer to be printed. * @param nDigits * The field will be printed by using at least this * number of digits. For example, 5 will be printed as "0005" * if nDigits==4. */	TokenNameCOMMENT_JAVADOC	 Prints an BigInteger as a String. * @param out The formatted string will be appended into this buffer. @param number The integer to be printed. @param nDigits The field will be printed by using at least this number of digits. For example, 5 will be printed as "0005" if nDigits==4. 
private	TokenNameprivate	
void	TokenNamevoid	
printNumber	TokenNameIdentifier	 print Number
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
BigInteger	TokenNameIdentifier	 Big Integer
number	TokenNameIdentifier	 number
,	TokenNameCOMMA	
int	TokenNameint	
nDigits	TokenNameIdentifier	 n Digits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
number	TokenNameIdentifier	 number
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nDigits	TokenNameIdentifier	 n Digits
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Turns {@link BigDecimal} to a string representation.</p> * * <p>Due to a behavior change in the {@link BigDecimal#toString()} * method in JDK1.5, this had to be implemented here.</p> * * @param bd <code>BigDecimal</code> to format as a <code>String</code> * * @return <code>String</code> representation of <code>BigDecimal</code> */	TokenNameCOMMENT_JAVADOC	 <p>Turns {@link BigDecimal} to a string representation.</p> * <p>Due to a behavior change in the {@link BigDecimal#toString()} method in JDK1.5, this had to be implemented here.</p> * @param bd <code>BigDecimal</code> to format as a <code>String</code> * @return <code>String</code> representation of <code>BigDecimal</code> 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
BigDecimal	TokenNameIdentifier	 Big Decimal
bd	TokenNameIdentifier	 bd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
intString	TokenNameIdentifier	 int String
=	TokenNameEQUAL	
bd	TokenNameIdentifier	 bd
.	TokenNameDOT	
unscaledValue	TokenNameIdentifier	 unscaled Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
scale	TokenNameIdentifier	 scale
=	TokenNameEQUAL	
bd	TokenNameIdentifier	 bd
.	TokenNameDOT	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scale	TokenNameIdentifier	 scale
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
intString	TokenNameIdentifier	 int String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Insert decimal point */	TokenNameCOMMENT_BLOCK	 Insert decimal point 
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
;	TokenNameSEMICOLON	
int	TokenNameint	
insertionPoint	TokenNameIdentifier	 insertion Point
=	TokenNameEQUAL	
intString	TokenNameIdentifier	 int String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
scale	TokenNameIdentifier	 scale
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
insertionPoint	TokenNameIdentifier	 insertion Point
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* Point goes right before intVal */	TokenNameCOMMENT_BLOCK	 Point goes right before intVal 
return	TokenNamereturn	
"0."	TokenNameStringLiteral	0.
+	TokenNamePLUS	
intString	TokenNameIdentifier	 int String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
insertionPoint	TokenNameIdentifier	 insertion Point
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* Point goes inside intVal */	TokenNameCOMMENT_BLOCK	 Point goes inside intVal 
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
intString	TokenNameIdentifier	 int String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
insertionPoint	TokenNameIdentifier	 insertion Point
,	TokenNameCOMMA	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
/* We must insert zeros between point and intVal */	TokenNameCOMMENT_BLOCK	 We must insert zeros between point and intVal 
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
-	TokenNameMINUS	
insertionPoint	TokenNameIdentifier	 insertion Point
+	TokenNamePLUS	
intString	TokenNameIdentifier	 int String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
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
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
-	TokenNameMINUS	
insertionPoint	TokenNameIdentifier	 insertion Point
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
intString	TokenNameIdentifier	 int String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compute <code>value*signum</code> where value==null is treated as * value==0. * @return non-null {@link BigInteger}. */	TokenNameCOMMENT_JAVADOC	 Compute <code>value*signum</code> where value==null is treated as value==0. @return non-null {@link BigInteger}. 
static	TokenNamestatic	
BigInteger	TokenNameIdentifier	 Big Integer
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
Number	TokenNameIdentifier	 Number
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
signum	TokenNameIdentifier	 signum
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
signum	TokenNameIdentifier	 signum
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
ZERO	TokenNameIdentifier	 ZERO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
signum	TokenNameIdentifier	 signum
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
negate	TokenNameIdentifier	 negate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** <p><code>reset()</code> is designed to allow the reuse of existing * <code>XMLGregorianCalendar</code>s thus saving resources associated * with the creation of new <code>XMLGregorianCalendar</code>s.</p> */	TokenNameCOMMENT_JAVADOC	 <p><code>reset()</code> is designed to allow the reuse of existing <code>XMLGregorianCalendar</code>s thus saving resources associated with the creation of new <code>XMLGregorianCalendar</code>s.</p> 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eon	TokenNameIdentifier	 eon
=	TokenNameEQUAL	
orig_eon	TokenNameIdentifier	 orig eon
;	TokenNameSEMICOLON	
year	TokenNameIdentifier	 year
=	TokenNameEQUAL	
orig_year	TokenNameIdentifier	 orig year
;	TokenNameSEMICOLON	
month	TokenNameIdentifier	 month
=	TokenNameEQUAL	
orig_month	TokenNameIdentifier	 orig month
;	TokenNameSEMICOLON	
day	TokenNameIdentifier	 day
=	TokenNameEQUAL	
orig_day	TokenNameIdentifier	 orig day
;	TokenNameSEMICOLON	
hour	TokenNameIdentifier	 hour
=	TokenNameEQUAL	
orig_hour	TokenNameIdentifier	 orig hour
;	TokenNameSEMICOLON	
minute	TokenNameIdentifier	 minute
=	TokenNameEQUAL	
orig_minute	TokenNameIdentifier	 orig minute
;	TokenNameSEMICOLON	
second	TokenNameIdentifier	 second
=	TokenNameEQUAL	
orig_second	TokenNameIdentifier	 orig second
;	TokenNameSEMICOLON	
fractionalSecond	TokenNameIdentifier	 fractional Second
=	TokenNameEQUAL	
orig_fracSeconds	TokenNameIdentifier	 orig frac Seconds
;	TokenNameSEMICOLON	
timezone	TokenNameIdentifier	 timezone
=	TokenNameEQUAL	
orig_timezone	TokenNameIdentifier	 orig timezone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes {@link XMLGregorianCalendar} as a lexical representation * for maximum future compatibility. * * @return * An object that encapsulates the string * returned by <code>this.toXMLFormat()</code>. */	TokenNameCOMMENT_JAVADOC	 Writes {@link XMLGregorianCalendar} as a lexical representation for maximum future compatibility. * @return An object that encapsulates the string returned by <code>this.toXMLFormat()</code>. 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
writeReplace	TokenNameIdentifier	 write Replace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SerializedXMLGregorianCalendar	TokenNameIdentifier	 Serialized XML Gregorian Calendar
(	TokenNameLPAREN	
toXMLFormat	TokenNameIdentifier	 to XML Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
