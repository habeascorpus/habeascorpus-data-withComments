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
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
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
/** * <p>Factory that creates new <code>javax.xml.datatype</code> <code>Object</code>s that map XML to/from Java <code>Object</code>s.</p> * * <p id="DatatypeFactory.newInstance">{@link #newInstance()} is used to create a new <code>DatatypeFactory</code>. * The following implementation resolution mechanisms are used in the following order:</p> * <ol> * <li> * If the system property specified by {@link #DATATYPEFACTORY_PROPERTY}, "<code>javax.xml.datatype.DatatypeFactory</code>", * exists, a class with the name of the property's value is instantiated. * Any Exception thrown during the instantiation process is wrapped as a {@link DatatypeConfigurationException}. * </li> * <li> * If the file ${JAVA_HOME}/lib/jaxp.properties exists, it is loaded in a {@link java.util.Properties} <code>Object</code>. * The <code>Properties</code> <code>Object </code> is then queried for the property as documented in the prior step * and processed as documented in the prior step. * </li> * <li> * The services resolution mechanism is used, e.g. <code>META-INF/services/java.xml.datatype.DatatypeFactory</code>. * Any Exception thrown during the instantiation process is wrapped as a {@link DatatypeConfigurationException}. * </li> * <li> * The final mechanism is to attempt to instantiate the <code>Class</code> specified by * {@link #DATATYPEFACTORY_IMPLEMENTATION_CLASS}, "<code>javax.xml.datatype.DatatypeFactoryImpl</code>". * Any Exception thrown during the instantiation process is wrapped as a {@link DatatypeConfigurationException}. * </li> * </ol> * * @author <a href="mailto:Joseph.Fialli@Sun.COM">Joseph Fialli</a> * @author <a href="mailto:Jeff.Suttor@Sun.com">Jeff Suttor</a> * @version $Id: DatatypeFactoryImpl.java 554381 2007-07-08 16:03:48Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>Factory that creates new <code>javax.xml.datatype</code> <code>Object</code>s that map XML to/from Java <code>Object</code>s.</p> * <p id="DatatypeFactory.newInstance">{@link #newInstance()} is used to create a new <code>DatatypeFactory</code>. The following implementation resolution mechanisms are used in the following order:</p> <ol> <li> If the system property specified by {@link #DATATYPEFACTORY_PROPERTY}, "<code>javax.xml.datatype.DatatypeFactory</code>", exists, a class with the name of the property's value is instantiated. Any Exception thrown during the instantiation process is wrapped as a {@link DatatypeConfigurationException}. </li> <li> If the file ${JAVA_HOME}/lib/jaxp.properties exists, it is loaded in a {@link java.util.Properties} <code>Object</code>. The <code>Properties</code> <code>Object </code> is then queried for the property as documented in the prior step and processed as documented in the prior step. </li> <li> The services resolution mechanism is used, e.g. <code>META-INF/services/java.xml.datatype.DatatypeFactory</code>. Any Exception thrown during the instantiation process is wrapped as a {@link DatatypeConfigurationException}. </li> <li> The final mechanism is to attempt to instantiate the <code>Class</code> specified by {@link #DATATYPEFACTORY_IMPLEMENTATION_CLASS}, "<code>javax.xml.datatype.DatatypeFactoryImpl</code>". Any Exception thrown during the instantiation process is wrapped as a {@link DatatypeConfigurationException}. </li> </ol> * @author <a href="mailto:Joseph.Fialli@Sun.COM">Joseph Fialli</a> @author <a href="mailto:Jeff.Suttor@Sun.com">Jeff Suttor</a> @version $Id: DatatypeFactoryImpl.java 554381 2007-07-08 16:03:48Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DatatypeFactoryImpl	TokenNameIdentifier	 Datatype Factory Impl
extends	TokenNameextends	
DatatypeFactory	TokenNameIdentifier	 Datatype Factory
{	TokenNameLBRACE	
/** * <p>Public constructor is empty..</p> * * <p>Use {@link DatatypeFactory#newInstance()} to create a <code>DatatypeFactory</code>.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Public constructor is empty..</p> * <p>Use {@link DatatypeFactory#newInstance()} to create a <code>DatatypeFactory</code>.</p> 
public	TokenNamepublic	
DatatypeFactoryImpl	TokenNameIdentifier	 Datatype Factory Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <p>Obtain a new instance of a <code>Duration</code> * specifying the <code>Duration</code> as its string representation, "PnYnMnDTnHnMnS", * as defined in XML Schema 1.0 section 3.2.6.1.</p> * * <p>XML Schema Part 2: Datatypes, 3.2.6 duration, defines <code>duration</code> as:</p> * <blockquote> * duration represents a duration of time. * The value space of duration is a six-dimensional space where the coordinates designate the * Gregorian year, month, day, hour, minute, and second components defined in Section 5.5.3.2 of [ISO 8601], respectively. * These components are ordered in their significance by their order of appearance i.e. as * year, month, day, hour, minute, and second. * </blockquote> * <p>All six values are set and availabe from the created {@link Duration}</p> * * <p>The XML Schema specification states that values can be of an arbitrary size. * Implementations may chose not to or be incapable of supporting arbitrarily large and/or small values. * An {@link UnsupportedOperationException} will be thrown with a message indicating implementation limits * if implementation capacities are exceeded.</p> * * @param lexicalRepresentation <code>String</code> representation of a <code>Duration</code>. * * @return New <code>Duration</code> created from parsing the <code>lexicalRepresentation</code>. * * @throws IllegalArgumentException If <code>lexicalRepresentation</code> is not a valid representation of a <code>Duration</code>. * @throws UnsupportedOperationException If implementation cannot support requested values. * @throws NullPointerException if <code>lexicalRepresentation</code> is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 <p>Obtain a new instance of a <code>Duration</code> specifying the <code>Duration</code> as its string representation, "PnYnMnDTnHnMnS", as defined in XML Schema 1.0 section 3.2.6.1.</p> * <p>XML Schema Part 2: Datatypes, 3.2.6 duration, defines <code>duration</code> as:</p> <blockquote> duration represents a duration of time. The value space of duration is a six-dimensional space where the coordinates designate the Gregorian year, month, day, hour, minute, and second components defined in Section 5.5.3.2 of [ISO 8601], respectively. These components are ordered in their significance by their order of appearance i.e. as year, month, day, hour, minute, and second. </blockquote> <p>All six values are set and availabe from the created {@link Duration}</p> * <p>The XML Schema specification states that values can be of an arbitrary size. Implementations may chose not to or be incapable of supporting arbitrarily large and/or small values. An {@link UnsupportedOperationException} will be thrown with a message indicating implementation limits if implementation capacities are exceeded.</p> * @param lexicalRepresentation <code>String</code> representation of a <code>Duration</code>. * @return New <code>Duration</code> created from parsing the <code>lexicalRepresentation</code>. * @throws IllegalArgumentException If <code>lexicalRepresentation</code> is not a valid representation of a <code>Duration</code>. @throws UnsupportedOperationException If implementation cannot support requested values. @throws NullPointerException if <code>lexicalRepresentation</code> is <code>null</code>. 
public	TokenNamepublic	
Duration	TokenNameIdentifier	 Duration
newDuration	TokenNameIdentifier	 new Duration
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
lexicalRepresentation	TokenNameIdentifier	 lexical Representation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DurationImpl	TokenNameIdentifier	 Duration Impl
(	TokenNameLPAREN	
lexicalRepresentation	TokenNameIdentifier	 lexical Representation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Obtain a new instance of a <code>Duration</code> * specifying the <code>Duration</code> as milliseconds.</p> * * <p>XML Schema Part 2: Datatypes, 3.2.6 duration, defines <code>duration</code> as:</p> * <blockquote> * duration represents a duration of time. * The value space of duration is a six-dimensional space where the coordinates designate the * Gregorian year, month, day, hour, minute, and second components defined in Section 5.5.3.2 of [ISO 8601], respectively. * These components are ordered in their significance by their order of appearance i.e. as * year, month, day, hour, minute, and second. * </blockquote> * <p>All six values are set by computing their values from the specified milliseconds * and are availabe using the <code>get</code> methods of the created {@link Duration}. * The values conform to and are defined by:</p> * <ul> * <li>ISO 8601:2000(E) Section 5.5.3.2 Alternative format</li> * <li><a href="http://www.w3.org/TR/xmlschema-2/#isoformats"> * W3C XML Schema 1.0 Part 2, Appendix D, ISO 8601 Date and Time Formats</a> * </li> * <li>{@link XMLGregorianCalendar} Date/Time Datatype Field Mapping Between XML Schema 1.0 and Java Representation</li> * </ul> * * <p>The default start instance is defined by {@link GregorianCalendar}'s use of the start of the epoch: i.e., * {@link java.util.Calendar#YEAR} = 1970, * {@link java.util.Calendar#MONTH} = {@link java.util.Calendar#JANUARY}, * {@link java.util.Calendar#DATE} = 1, etc. * This is important as there are variations in the Gregorian Calendar, * e.g. leap years have different days in the month = {@link java.util.Calendar#FEBRUARY} * so the result of {@link Duration#getMonths()} and {@link Duration#getDays()} can be influenced.</p> * * @param durationInMilliseconds Duration in milliseconds to create. * * @return New <code>Duration</code> representing <code>durationInMilliseconds</code>. */	TokenNameCOMMENT_JAVADOC	 <p>Obtain a new instance of a <code>Duration</code> specifying the <code>Duration</code> as milliseconds.</p> * <p>XML Schema Part 2: Datatypes, 3.2.6 duration, defines <code>duration</code> as:</p> <blockquote> duration represents a duration of time. The value space of duration is a six-dimensional space where the coordinates designate the Gregorian year, month, day, hour, minute, and second components defined in Section 5.5.3.2 of [ISO 8601], respectively. These components are ordered in their significance by their order of appearance i.e. as year, month, day, hour, minute, and second. </blockquote> <p>All six values are set by computing their values from the specified milliseconds and are availabe using the <code>get</code> methods of the created {@link Duration}. The values conform to and are defined by:</p> <ul> <li>ISO 8601:2000(E) Section 5.5.3.2 Alternative format</li> <li><a href="http://www.w3.org/TR/xmlschema-2/#isoformats"> W3C XML Schema 1.0 Part 2, Appendix D, ISO 8601 Date and Time Formats</a> </li> <li>{@link XMLGregorianCalendar} Date/Time Datatype Field Mapping Between XML Schema 1.0 and Java Representation</li> </ul> * <p>The default start instance is defined by {@link GregorianCalendar}'s use of the start of the epoch: i.e., {@link java.util.Calendar#YEAR} = 1970, {@link java.util.Calendar#MONTH} = {@link java.util.Calendar#JANUARY}, {@link java.util.Calendar#DATE} = 1, etc. This is important as there are variations in the Gregorian Calendar, e.g. leap years have different days in the month = {@link java.util.Calendar#FEBRUARY} so the result of {@link Duration#getMonths()} and {@link Duration#getDays()} can be influenced.</p> * @param durationInMilliseconds Duration in milliseconds to create. * @return New <code>Duration</code> representing <code>durationInMilliseconds</code>. 
public	TokenNamepublic	
Duration	TokenNameIdentifier	 Duration
newDuration	TokenNameIdentifier	 new Duration
(	TokenNameLPAREN	
final	TokenNamefinal	
long	TokenNamelong	
durationInMilliseconds	TokenNameIdentifier	 duration In Milliseconds
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DurationImpl	TokenNameIdentifier	 Duration Impl
(	TokenNameLPAREN	
durationInMilliseconds	TokenNameIdentifier	 duration In Milliseconds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Obtain a new instance of a <code>Duration</code> * specifying the <code>Duration</code> as isPositive, years, months, days, hours, minutes, seconds.</p> * * <p>The XML Schema specification states that values can be of an arbitrary size. * Implementations may chose not to or be incapable of supporting arbitrarily large and/or small values. * An {@link UnsupportedOperationException} will be thrown with a message indicating implementation limits * if implementation capacities are exceeded.</p> * * @param isPositive Set to <code>false</code> to create a negative duration. When the length * of the duration is zero, this parameter will be ignored. * @param years of this <code>Duration</code> * @param months of this <code>Duration</code> * @param days of this <code>Duration</code> * @param hours of this <code>Duration</code> * @param minutes of this <code>Duration</code> * @param seconds of this <code>Duration</code> * * @return New <code>Duration</code> created from the specified values. * * @throws IllegalArgumentException If values are not a valid representation of a <code>Duration</code>. * @throws UnsupportedOperationException If implementation cannot support requested values. * @throws NullPointerException If any values are <code>null</code>. * * @see #newDuration(boolean isPositive, BigInteger years, BigInteger months, BigInteger days, * BigInteger hours, BigInteger minutes, BigDecimal seconds) */	TokenNameCOMMENT_JAVADOC	 <p>Obtain a new instance of a <code>Duration</code> specifying the <code>Duration</code> as isPositive, years, months, days, hours, minutes, seconds.</p> * <p>The XML Schema specification states that values can be of an arbitrary size. Implementations may chose not to or be incapable of supporting arbitrarily large and/or small values. An {@link UnsupportedOperationException} will be thrown with a message indicating implementation limits if implementation capacities are exceeded.</p> * @param isPositive Set to <code>false</code> to create a negative duration. When the length of the duration is zero, this parameter will be ignored. @param years of this <code>Duration</code> @param months of this <code>Duration</code> @param days of this <code>Duration</code> @param hours of this <code>Duration</code> @param minutes of this <code>Duration</code> @param seconds of this <code>Duration</code> * @return New <code>Duration</code> created from the specified values. * @throws IllegalArgumentException If values are not a valid representation of a <code>Duration</code>. @throws UnsupportedOperationException If implementation cannot support requested values. @throws NullPointerException If any values are <code>null</code>. * @see #newDuration(boolean isPositive, BigInteger years, BigInteger months, BigInteger days, BigInteger hours, BigInteger minutes, BigDecimal seconds) 
public	TokenNamepublic	
Duration	TokenNameIdentifier	 Duration
newDuration	TokenNameIdentifier	 new Duration
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
isPositive	TokenNameIdentifier	 is Positive
,	TokenNameCOMMA	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
years	TokenNameIdentifier	 years
,	TokenNameCOMMA	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
months	TokenNameIdentifier	 months
,	TokenNameCOMMA	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
days	TokenNameIdentifier	 days
,	TokenNameCOMMA	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
hours	TokenNameIdentifier	 hours
,	TokenNameCOMMA	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
minutes	TokenNameIdentifier	 minutes
,	TokenNameCOMMA	
final	TokenNamefinal	
BigDecimal	TokenNameIdentifier	 Big Decimal
seconds	TokenNameIdentifier	 seconds
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DurationImpl	TokenNameIdentifier	 Duration Impl
(	TokenNameLPAREN	
isPositive	TokenNameIdentifier	 is Positive
,	TokenNameCOMMA	
years	TokenNameIdentifier	 years
,	TokenNameCOMMA	
months	TokenNameIdentifier	 months
,	TokenNameCOMMA	
days	TokenNameIdentifier	 days
,	TokenNameCOMMA	
hours	TokenNameIdentifier	 hours
,	TokenNameCOMMA	
minutes	TokenNameIdentifier	 minutes
,	TokenNameCOMMA	
seconds	TokenNameIdentifier	 seconds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Create a new instance of an <code>XMLGregorianCalendar</code>.</p> * * <p>All date/time datatype fields set to {@link DatatypeConstants#FIELD_UNDEFINED} or null.</p> * * @return New <code>XMLGregorianCalendar</code> with all date/time datatype fields set to * {@link DatatypeConstants#FIELD_UNDEFINED} or null. */	TokenNameCOMMENT_JAVADOC	 <p>Create a new instance of an <code>XMLGregorianCalendar</code>.</p> * <p>All date/time datatype fields set to {@link DatatypeConstants#FIELD_UNDEFINED} or null.</p> * @return New <code>XMLGregorianCalendar</code> with all date/time datatype fields set to {@link DatatypeConstants#FIELD_UNDEFINED} or null. 
public	TokenNamepublic	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
newXMLGregorianCalendar	TokenNameIdentifier	 new XML Gregorian Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Create a new XMLGregorianCalendar by parsing the String as a lexical representation.</p> * * <p>Parsing the lexical string representation is defined in * <a href="http://www.w3.org/TR/xmlschema-2/#dateTime-order">XML Schema 1.0 Part 2, Section 3.2.[7-14].1, * <em>Lexical Representation</em>.</a></p> * * <p>The string representation may not have any leading and trailing whitespaces.</p> * * <p>The parsing is done field by field so that * the following holds for any lexically correct String x:</p> * <pre> * newXMLGregorianCalendar(x).toXMLFormat().equals(x) * </pre> * <p>Except for the noted lexical/canonical representation mismatches * listed in <a href="http://www.w3.org/2001/05/xmlschema-errata#e2-45"> * XML Schema 1.0 errata, Section 3.2.7.2</a>.</p> * * @param lexicalRepresentation Lexical representation of one the eight XML Schema date/time datatypes. * * @return <code>XMLGregorianCalendar</code> created from the <code>lexicalRepresentation</code>. * * @throws IllegalArgumentException If the <code>lexicalRepresentation</code> is not a valid <code>XMLGregorianCalendar</code>. * @throws NullPointerException If <code>lexicalRepresentation</code> is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 <p>Create a new XMLGregorianCalendar by parsing the String as a lexical representation.</p> * <p>Parsing the lexical string representation is defined in <a href="http://www.w3.org/TR/xmlschema-2/#dateTime-order">XML Schema 1.0 Part 2, Section 3.2.[7-14].1, <em>Lexical Representation</em>.</a></p> * <p>The string representation may not have any leading and trailing whitespaces.</p> * <p>The parsing is done field by field so that the following holds for any lexically correct String x:</p> <pre> newXMLGregorianCalendar(x).toXMLFormat().equals(x) </pre> <p>Except for the noted lexical/canonical representation mismatches listed in <a href="http://www.w3.org/2001/05/xmlschema-errata#e2-45"> XML Schema 1.0 errata, Section 3.2.7.2</a>.</p> * @param lexicalRepresentation Lexical representation of one the eight XML Schema date/time datatypes. * @return <code>XMLGregorianCalendar</code> created from the <code>lexicalRepresentation</code>. * @throws IllegalArgumentException If the <code>lexicalRepresentation</code> is not a valid <code>XMLGregorianCalendar</code>. @throws NullPointerException If <code>lexicalRepresentation</code> is <code>null</code>. 
public	TokenNamepublic	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
newXMLGregorianCalendar	TokenNameIdentifier	 new XML Gregorian Calendar
(	TokenNameLPAREN	
final	TokenNamefinal	
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
/** * <p>Create an <code>XMLGregorianCalendar</code> from a {@link GregorianCalendar}.</p> * * <table border="2" rules="all" cellpadding="2"> * <thead> * <tr> * <th align="center" colspan="2"> * Field by Field Conversion from * {@link GregorianCalendar} to an {@link XMLGregorianCalendar} * </th> * </tr> * <tr> * <th><code>java.util.GregorianCalendar</code> field</th> * <th><code>javax.xml.datatype.XMLGregorianCalendar</code> field</th> * </tr> * </thead> * <tbody> * <tr> * <td><code>ERA == GregorianCalendar.BC ? -YEAR : YEAR</code></td> * <td>{@link XMLGregorianCalendar#setYear(int year)}</td> * </tr> * <tr> * <td><code>MONTH + 1</code></td> * <td>{@link XMLGregorianCalendar#setMonth(int month)}</td> * </tr> * <tr> * <td><code>DAY_OF_MONTH</code></td> * <td>{@link XMLGregorianCalendar#setDay(int day)}</td> * </tr> * <tr> * <td><code>HOUR_OF_DAY, MINUTE, SECOND, MILLISECOND</code></td> * <td>{@link XMLGregorianCalendar#setTime(int hour, int minute, int second, BigDecimal fractional)}</td> * </tr> * <tr> * <td> * <code>(ZONE_OFFSET + DST_OFFSET) / (60*1000)</code><br/> * <em>(in minutes)</em> * </td> * <td>{@link XMLGregorianCalendar#setTimezone(int offset)}<sup><em>*</em></sup> * </td> * </tr> * </tbody> * </table> * <p><em>*</em>conversion loss of information. It is not possible to represent * a <code>java.util.GregorianCalendar</code> daylight savings timezone id in the * XML Schema 1.0 date/time datatype representation.</p> * * <p>To compute the return value's <code>TimeZone</code> field, * <ul> * <li>when <code>this.getTimezone() != FIELD_UNDEFINED</code>, * create a <code>java.util.TimeZone</code> with a custom timezone id * using the <code>this.getTimezone()</code>.</li> * <li>else use the <code>GregorianCalendar</code> default timezone value * for the host is defined as specified by * <code>java.util.TimeZone.getDefault()</code>.</li></p> * * @param cal <code>java.util.GregorianCalendar</code> used to create <code>XMLGregorianCalendar</code> * * @return <code>XMLGregorianCalendar</code> created from <code>java.util.GregorianCalendar</code> * * @throws NullPointerException If <code>cal</code> is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 <p>Create an <code>XMLGregorianCalendar</code> from a {@link GregorianCalendar}.</p> * <table border="2" rules="all" cellpadding="2"> <thead> <tr> <th align="center" colspan="2"> Field by Field Conversion from {@link GregorianCalendar} to an {@link XMLGregorianCalendar} </th> </tr> <tr> <th><code>java.util.GregorianCalendar</code> field</th> <th><code>javax.xml.datatype.XMLGregorianCalendar</code> field</th> </tr> </thead> <tbody> <tr> <td><code>ERA == GregorianCalendar.BC ? -YEAR : YEAR</code></td> <td>{@link XMLGregorianCalendar#setYear(int year)}</td> </tr> <tr> <td><code>MONTH + 1</code></td> <td>{@link XMLGregorianCalendar#setMonth(int month)}</td> </tr> <tr> <td><code>DAY_OF_MONTH</code></td> <td>{@link XMLGregorianCalendar#setDay(int day)}</td> </tr> <tr> <td><code>HOUR_OF_DAY, MINUTE, SECOND, MILLISECOND</code></td> <td>{@link XMLGregorianCalendar#setTime(int hour, int minute, int second, BigDecimal fractional)}</td> </tr> <tr> <td> <code>(ZONE_OFFSET + DST_OFFSET) / (60*1000)</code><br/> <em>(in minutes)</em> </td> <td>{@link XMLGregorianCalendar#setTimezone(int offset)}<sup><em>*</em></sup> </td> </tr> </tbody> </table> <p><em>*</em>conversion loss of information. It is not possible to represent a <code>java.util.GregorianCalendar</code> daylight savings timezone id in the XML Schema 1.0 date/time datatype representation.</p> * <p>To compute the return value's <code>TimeZone</code> field, <ul> <li>when <code>this.getTimezone() != FIELD_UNDEFINED</code>, create a <code>java.util.TimeZone</code> with a custom timezone id using the <code>this.getTimezone()</code>.</li> <li>else use the <code>GregorianCalendar</code> default timezone value for the host is defined as specified by <code>java.util.TimeZone.getDefault()</code>.</li></p> * @param cal <code>java.util.GregorianCalendar</code> used to create <code>XMLGregorianCalendar</code> * @return <code>XMLGregorianCalendar</code> created from <code>java.util.GregorianCalendar</code> * @throws NullPointerException If <code>cal</code> is <code>null</code>. 
public	TokenNamepublic	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
newXMLGregorianCalendar	TokenNameIdentifier	 new XML Gregorian Calendar
(	TokenNameLPAREN	
final	TokenNamefinal	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
cal	TokenNameIdentifier	 cal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Constructor of value spaces that a * <code>java.util.GregorianCalendar</code> instance would need to convert to an * <code>XMLGregorianCalendar</code> instance.</p> * * <p><code>XMLGregorianCalendar eon</code> and * <code>fractionalSecond</code> are set to <code>null</code></p> * * <p>A {@link DatatypeConstants#FIELD_UNDEFINED} value indicates that field isnot set.</p> * * @param year of <code>XMLGregorianCalendar</code> to be created. * @param month of <code>XMLGregorianCalendar</code> to be created. * @param day of <code>XMLGregorianCalendar</code> to be created. * @param hour of <code>XMLGregorianCalendar</code> to be created. * @param minute of <code>XMLGregorianCalendar</code> to be created. * @param second of <code>XMLGregorianCalendar</code> to be created. * @param millisecond of <code>XMLGregorianCalendar</code> to be created. * @param timezone of <code>XMLGregorianCalendar</code> to be created. * * @return <code>XMLGregorianCalendar</code> created from specified values. * * @throws IllegalArgumentException If any individual parameter's value is outside the maximum value constraint for the field * as determined by the Date/Time Data Mapping table in {@link XMLGregorianCalendar} * or if the composite values constitute an invalid <code>XMLGregorianCalendar</code> instance * as determined by {@link XMLGregorianCalendar#isValid()}. */	TokenNameCOMMENT_JAVADOC	 <p>Constructor of value spaces that a <code>java.util.GregorianCalendar</code> instance would need to convert to an <code>XMLGregorianCalendar</code> instance.</p> * <p><code>XMLGregorianCalendar eon</code> and <code>fractionalSecond</code> are set to <code>null</code></p> * <p>A {@link DatatypeConstants#FIELD_UNDEFINED} value indicates that field isnot set.</p> * @param year of <code>XMLGregorianCalendar</code> to be created. @param month of <code>XMLGregorianCalendar</code> to be created. @param day of <code>XMLGregorianCalendar</code> to be created. @param hour of <code>XMLGregorianCalendar</code> to be created. @param minute of <code>XMLGregorianCalendar</code> to be created. @param second of <code>XMLGregorianCalendar</code> to be created. @param millisecond of <code>XMLGregorianCalendar</code> to be created. @param timezone of <code>XMLGregorianCalendar</code> to be created. * @return <code>XMLGregorianCalendar</code> created from specified values. * @throws IllegalArgumentException If any individual parameter's value is outside the maximum value constraint for the field as determined by the Date/Time Data Mapping table in {@link XMLGregorianCalendar} or if the composite values constitute an invalid <code>XMLGregorianCalendar</code> instance as determined by {@link XMLGregorianCalendar#isValid()}. 
public	TokenNamepublic	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
newXMLGregorianCalendar	TokenNameIdentifier	 new XML Gregorian Calendar
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
month	TokenNameIdentifier	 month
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
day	TokenNameIdentifier	 day
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
hour	TokenNameIdentifier	 hour
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
minute	TokenNameIdentifier	 minute
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
second	TokenNameIdentifier	 second
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
millisecond	TokenNameIdentifier	 millisecond
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
.	TokenNameDOT	
createDateTime	TokenNameIdentifier	 create Date Time
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
millisecond	TokenNameIdentifier	 millisecond
,	TokenNameCOMMA	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Constructor allowing for complete value spaces allowed by * W3C XML Schema 1.0 recommendation for xsd:dateTime and related * builtin datatypes. Note that <code>year</code> parameter supports * arbitrarily large numbers and fractionalSecond has infinite * precision.</p> * * @param year of <code>XMLGregorianCalendar</code> to be created. * @param month of <code>XMLGregorianCalendar</code> to be created. * @param day of <code>XMLGregorianCalendar</code> to be created. * @param hour of <code>XMLGregorianCalendar</code> to be created. * @param minute of <code>XMLGregorianCalendar</code> to be created. * @param second of <code>XMLGregorianCalendar</code> to be created. * @param fractionalSecond of <code>XMLGregorianCalendar</code> to be created. * @param timezone of <code>XMLGregorianCalendar</code> to be created. * * @return <code>XMLGregorianCalendar</code> created from specified values. * * @throws IllegalArgumentException If any individual parameter's value is outside the maximum value constraint for the field * as determined by the Date/Time Data Mapping table in {@link XMLGregorianCalendar} * or if the composite values constitute an invalid <code>XMLGregorianCalendar</code> instance * as determined by {@link XMLGregorianCalendar#isValid()}. * @throws NullPointerException If any parameters are <code>null</code>. * */	TokenNameCOMMENT_JAVADOC	 <p>Constructor allowing for complete value spaces allowed by W3C XML Schema 1.0 recommendation for xsd:dateTime and related builtin datatypes. Note that <code>year</code> parameter supports arbitrarily large numbers and fractionalSecond has infinite precision.</p> * @param year of <code>XMLGregorianCalendar</code> to be created. @param month of <code>XMLGregorianCalendar</code> to be created. @param day of <code>XMLGregorianCalendar</code> to be created. @param hour of <code>XMLGregorianCalendar</code> to be created. @param minute of <code>XMLGregorianCalendar</code> to be created. @param second of <code>XMLGregorianCalendar</code> to be created. @param fractionalSecond of <code>XMLGregorianCalendar</code> to be created. @param timezone of <code>XMLGregorianCalendar</code> to be created. * @return <code>XMLGregorianCalendar</code> created from specified values. * @throws IllegalArgumentException If any individual parameter's value is outside the maximum value constraint for the field as determined by the Date/Time Data Mapping table in {@link XMLGregorianCalendar} or if the composite values constitute an invalid <code>XMLGregorianCalendar</code> instance as determined by {@link XMLGregorianCalendar#isValid()}. @throws NullPointerException If any parameters are <code>null</code>. 
public	TokenNamepublic	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
newXMLGregorianCalendar	TokenNameIdentifier	 new XML Gregorian Calendar
(	TokenNameLPAREN	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
year	TokenNameIdentifier	 year
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
month	TokenNameIdentifier	 month
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
day	TokenNameIdentifier	 day
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
hour	TokenNameIdentifier	 hour
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
minute	TokenNameIdentifier	 minute
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
second	TokenNameIdentifier	 second
,	TokenNameCOMMA	
final	TokenNamefinal	
BigDecimal	TokenNameIdentifier	 Big Decimal
fractionalSecond	TokenNameIdentifier	 fractional Second
,	TokenNameCOMMA	
final	TokenNamefinal	
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
hour	TokenNameIdentifier	 hour
,	TokenNameCOMMA	
minute	TokenNameIdentifier	 minute
,	TokenNameCOMMA	
second	TokenNameIdentifier	 second
,	TokenNameCOMMA	
fractionalSecond	TokenNameIdentifier	 fractional Second
,	TokenNameCOMMA	
timezone	TokenNameIdentifier	 timezone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
