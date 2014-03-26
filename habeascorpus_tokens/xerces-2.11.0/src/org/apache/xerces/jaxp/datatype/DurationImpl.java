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
/** * <p>Immutable representation of a time span as defined in * the W3C XML Schema 1.0 specification.</p> * * <p>A Duration object represents a period of Gregorian time, * which consists of six fields (years, months, days, hours, * minutes, and seconds) plus a sign (+/-) field.</p> * * <p>The first five fields have non-negative (>=0) integers or null * (which represents that the field is not set), * and the seconds field has a non-negative decimal or null. * A negative sign indicates a negative duration.</p> * * <p>This class provides a number of methods that make it easy * to use for the duration datatype of XML Schema 1.0 with * the errata.</p> * * <h2>Order relationship</h2> * <p>Duration objects only have partial order, where two values A and B * maybe either:</p> * <ol> * <li>A&lt;B (A is shorter than B) * <li>A&gt;B (A is longer than B) * <li>A==B (A and B are of the same duration) * <li>A&lt;>B (Comparison between A and B is indeterminate) * </ol> * <p>For example, 30 days cannot be meaningfully compared to one month. * The {@link #compare(Duration)} method implements this * relationship.</p> * * <p>See the {@link #isLongerThan(Duration)} method for details about * the order relationship among {@link Duration} objects.</p> * * * * <h2>Operations over Duration</h2> * <p>This class provides a set of basic arithmetic operations, such * as addition, subtraction and multiplication. * Because durations don't have total order, an operation could * fail for some combinations of operations. For example, you cannot * subtract 15 days from 1 month. See the javadoc of those methods * for detailed conditions where this could happen.</p> * * <p>Also, division of a duration by a number is not provided because * the {@link Duration} class can only deal with finite precision * decimal numbers. For example, one cannot represent 1 sec divided by 3.</p> * * <p>However, you could substitute a division by 3 with multiplying * by numbers such as 0.3 or 0.333.</p> * * * * <h2>Range of allowed values</h2> * <p> * Because some operations of {@link Duration} rely on {@link Calendar} * even though {@link Duration} can hold very large or very small values, * some of the methods may not work correctly on such {@link Duration}s. * The impacted methods document their dependency on {@link Calendar}. * * * @author <a href="mailto:Kohsuke.Kawaguchi@Sun.com">Kohsuke Kawaguchi</a> * @author <a href="mailto:Joseph.Fialli@Sun.com">Joseph Fialli</a> * @version $Id: DurationImpl.java 944783 2010-05-16 09:45:19Z mukulg $ * @see XMLGregorianCalendar#add(Duration) */	TokenNameCOMMENT_JAVADOC	 <p>Immutable representation of a time span as defined in the W3C XML Schema 1.0 specification.</p> * <p>A Duration object represents a period of Gregorian time, which consists of six fields (years, months, days, hours, minutes, and seconds) plus a sign (+/-) field.</p> * <p>The first five fields have non-negative (>=0) integers or null (which represents that the field is not set), and the seconds field has a non-negative decimal or null. A negative sign indicates a negative duration.</p> * <p>This class provides a number of methods that make it easy to use for the duration datatype of XML Schema 1.0 with the errata.</p> * <h2>Order relationship</h2> <p>Duration objects only have partial order, where two values A and B maybe either:</p> <ol> <li>A&lt;B (A is shorter than B) <li>A&gt;B (A is longer than B) <li>A==B (A and B are of the same duration) <li>A&lt;>B (Comparison between A and B is indeterminate) </ol> <p>For example, 30 days cannot be meaningfully compared to one month. The {@link #compare(Duration)} method implements this relationship.</p> * <p>See the {@link #isLongerThan(Duration)} method for details about the order relationship among {@link Duration} objects.</p> * * <h2>Operations over Duration</h2> <p>This class provides a set of basic arithmetic operations, such as addition, subtraction and multiplication. Because durations don't have total order, an operation could fail for some combinations of operations. For example, you cannot subtract 15 days from 1 month. See the javadoc of those methods for detailed conditions where this could happen.</p> * <p>Also, division of a duration by a number is not provided because the {@link Duration} class can only deal with finite precision decimal numbers. For example, one cannot represent 1 sec divided by 3.</p> * <p>However, you could substitute a division by 3 with multiplying by numbers such as 0.3 or 0.333.</p> * * <h2>Range of allowed values</h2> <p> Because some operations of {@link Duration} rely on {@link Calendar} even though {@link Duration} can hold very large or very small values, some of the methods may not work correctly on such {@link Duration}s. The impacted methods document their dependency on {@link Calendar}. * @author <a href="mailto:Kohsuke.Kawaguchi@Sun.com">Kohsuke Kawaguchi</a> @author <a href="mailto:Joseph.Fialli@Sun.com">Joseph Fialli</a> @version $Id: DurationImpl.java 944783 2010-05-16 09:45:19Z mukulg $ @see XMLGregorianCalendar#add(Duration) 
class	TokenNameclass	
DurationImpl	TokenNameIdentifier	 Duration Impl
extends	TokenNameextends	
Duration	TokenNameIdentifier	 Duration
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** * <p>Stream Unique Identifier.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Stream Unique Identifier.</p> 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
2650025807136350131L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * <p>Internal array of value Fields.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Internal array of value Fields.</p> 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FIELDS	TokenNameIdentifier	 FIELDS
=	TokenNameEQUAL	
new	TokenNamenew	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
YEARS	TokenNameIdentifier	 YEARS
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MONTHS	TokenNameIdentifier	 MONTHS
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
DAYS	TokenNameIdentifier	 DAYS
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
HOURS	TokenNameIdentifier	 HOURS
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MINUTES	TokenNameIdentifier	 MINUTES
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * <p>BigDecimal value of 0.</p> */	TokenNameCOMMENT_JAVADOC	 <p>BigDecimal value of 0.</p> 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BigDecimal	TokenNameIdentifier	 Big Decimal
ZERO	TokenNameIdentifier	 ZERO
=	TokenNameEQUAL	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <p>Indicates the sign. -1, 0 or 1 if the duration is negative, * zero, or positive.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Indicates the sign. -1, 0 or 1 if the duration is negative, zero, or positive.</p> 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
signum	TokenNameIdentifier	 signum
;	TokenNameSEMICOLON	
/** * <p>Years of this <code>Duration</code>.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Years of this <code>Duration</code>.</p> 
private	TokenNameprivate	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
years	TokenNameIdentifier	 years
;	TokenNameSEMICOLON	
/** * <p>Months of this <code>Duration</code>.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Months of this <code>Duration</code>.</p> 
private	TokenNameprivate	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
months	TokenNameIdentifier	 months
;	TokenNameSEMICOLON	
/** * <p>Days of this <code>Duration</code>.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Days of this <code>Duration</code>.</p> 
private	TokenNameprivate	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
days	TokenNameIdentifier	 days
;	TokenNameSEMICOLON	
/** * <p>Hours of this <code>Duration</code>.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Hours of this <code>Duration</code>.</p> 
private	TokenNameprivate	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
hours	TokenNameIdentifier	 hours
;	TokenNameSEMICOLON	
/** * <p>Minutes of this <code>Duration</code>.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Minutes of this <code>Duration</code>.</p> 
private	TokenNameprivate	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
minutes	TokenNameIdentifier	 minutes
;	TokenNameSEMICOLON	
/** * <p>Seconds of this <code>Duration</code>.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Seconds of this <code>Duration</code>.</p> 
private	TokenNameprivate	
final	TokenNamefinal	
BigDecimal	TokenNameIdentifier	 Big Decimal
seconds	TokenNameIdentifier	 seconds
;	TokenNameSEMICOLON	
/** * Returns the sign of this duration in -1,0, or 1. * * @return * -1 if this duration is negative, 0 if the duration is zero, * and 1 if the duration is postive. */	TokenNameCOMMENT_JAVADOC	 Returns the sign of this duration in -1,0, or 1. * @return -1 if this duration is negative, 0 if the duration is zero, and 1 if the duration is postive. 
public	TokenNamepublic	
int	TokenNameint	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
signum	TokenNameIdentifier	 signum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * TODO: Javadoc * @param isPositive Sign. * * @return 1 if positive, else -1. */	TokenNameCOMMENT_JAVADOC	 TODO: Javadoc @param isPositive Sign. * @return 1 if positive, else -1. 
private	TokenNameprivate	
int	TokenNameint	
calcSignum	TokenNameIdentifier	 calc Signum
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isPositive	TokenNameIdentifier	 is Positive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
years	TokenNameIdentifier	 years
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
years	TokenNameIdentifier	 years
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
months	TokenNameIdentifier	 months
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
months	TokenNameIdentifier	 months
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
days	TokenNameIdentifier	 days
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
days	TokenNameIdentifier	 days
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
hours	TokenNameIdentifier	 hours
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
hours	TokenNameIdentifier	 hours
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
minutes	TokenNameIdentifier	 minutes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
minutes	TokenNameIdentifier	 minutes
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
seconds	TokenNameIdentifier	 seconds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
seconds	TokenNameIdentifier	 seconds
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isPositive	TokenNameIdentifier	 is Positive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Constructs a new Duration object by specifying each field individually.</p> * * <p>All the parameters are optional as long as at least one field is present. * If specified, parameters have to be zero or positive.</p> * * @param isPositive Set to <code>false</code> to create a negative duration. When the length * of the duration is zero, this parameter will be ignored. * @param years of this <code>Duration</code> * @param months of this <code>Duration</code> * @param days of this <code>Duration</code> * @param hours of this <code>Duration</code> * @param minutes of this <code>Duration</code> * @param seconds of this <code>Duration</code> * * @throws IllegalArgumentException * If years, months, days, hours, minutes and * seconds parameters are all <code>null</code>. Or if any * of those parameters are negative. */	TokenNameCOMMENT_JAVADOC	 <p>Constructs a new Duration object by specifying each field individually.</p> * <p>All the parameters are optional as long as at least one field is present. If specified, parameters have to be zero or positive.</p> * @param isPositive Set to <code>false</code> to create a negative duration. When the length of the duration is zero, this parameter will be ignored. @param years of this <code>Duration</code> @param months of this <code>Duration</code> @param days of this <code>Duration</code> @param hours of this <code>Duration</code> @param minutes of this <code>Duration</code> @param seconds of this <code>Duration</code> * @throws IllegalArgumentException If years, months, days, hours, minutes and seconds parameters are all <code>null</code>. Or if any of those parameters are negative. 
protected	TokenNameprotected	
DurationImpl	TokenNameIdentifier	 Duration Impl
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isPositive	TokenNameIdentifier	 is Positive
,	TokenNameCOMMA	
BigInteger	TokenNameIdentifier	 Big Integer
years	TokenNameIdentifier	 years
,	TokenNameCOMMA	
BigInteger	TokenNameIdentifier	 Big Integer
months	TokenNameIdentifier	 months
,	TokenNameCOMMA	
BigInteger	TokenNameIdentifier	 Big Integer
days	TokenNameIdentifier	 days
,	TokenNameCOMMA	
BigInteger	TokenNameIdentifier	 Big Integer
hours	TokenNameIdentifier	 hours
,	TokenNameCOMMA	
BigInteger	TokenNameIdentifier	 Big Integer
minutes	TokenNameIdentifier	 minutes
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
seconds	TokenNameIdentifier	 seconds
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
years	TokenNameIdentifier	 years
=	TokenNameEQUAL	
years	TokenNameIdentifier	 years
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
months	TokenNameIdentifier	 months
=	TokenNameEQUAL	
months	TokenNameIdentifier	 months
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
days	TokenNameIdentifier	 days
=	TokenNameEQUAL	
days	TokenNameIdentifier	 days
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hours	TokenNameIdentifier	 hours
=	TokenNameEQUAL	
hours	TokenNameIdentifier	 hours
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minutes	TokenNameIdentifier	 minutes
=	TokenNameEQUAL	
minutes	TokenNameIdentifier	 minutes
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
seconds	TokenNameIdentifier	 seconds
=	TokenNameEQUAL	
seconds	TokenNameIdentifier	 seconds
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
=	TokenNameEQUAL	
calcSignum	TokenNameIdentifier	 calc Signum
(	TokenNameLPAREN	
isPositive	TokenNameIdentifier	 is Positive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// sanity check 	TokenNameCOMMENT_LINE	sanity check 
if	TokenNameif	
(	TokenNameLPAREN	
years	TokenNameIdentifier	 years
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
months	TokenNameIdentifier	 months
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
days	TokenNameIdentifier	 days
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
hours	TokenNameIdentifier	 hours
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
minutes	TokenNameIdentifier	 minutes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
seconds	TokenNameIdentifier	 seconds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
//"all the fields are null" 	TokenNameCOMMENT_LINE	"all the fields are null" 
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"AllFieldsNull"	TokenNameStringLiteral	AllFieldsNull
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
testNonNegative	TokenNameIdentifier	 test Non Negative
(	TokenNameLPAREN	
years	TokenNameIdentifier	 years
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
YEARS	TokenNameIdentifier	 YEARS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testNonNegative	TokenNameIdentifier	 test Non Negative
(	TokenNameLPAREN	
months	TokenNameIdentifier	 months
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MONTHS	TokenNameIdentifier	 MONTHS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testNonNegative	TokenNameIdentifier	 test Non Negative
(	TokenNameLPAREN	
days	TokenNameIdentifier	 days
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
DAYS	TokenNameIdentifier	 DAYS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testNonNegative	TokenNameIdentifier	 test Non Negative
(	TokenNameLPAREN	
hours	TokenNameIdentifier	 hours
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
HOURS	TokenNameIdentifier	 HOURS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testNonNegative	TokenNameIdentifier	 test Non Negative
(	TokenNameLPAREN	
minutes	TokenNameIdentifier	 minutes
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MINUTES	TokenNameIdentifier	 MINUTES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testNonNegative	TokenNameIdentifier	 test Non Negative
(	TokenNameLPAREN	
seconds	TokenNameIdentifier	 seconds
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Makes sure that the given number is non-negative. If it is not, * throw {@link IllegalArgumentException}.</p> * * @param n Number to test. * @param f Field to test. */	TokenNameCOMMENT_JAVADOC	 <p>Makes sure that the given number is non-negative. If it is not, throw {@link IllegalArgumentException}.</p> * @param n Number to test. @param f Field to test. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
testNonNegative	TokenNameIdentifier	 test Non Negative
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
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
"NegativeField"	TokenNameStringLiteral	NegativeField
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Makes sure that the given number is non-negative. If it is not, * throw {@link IllegalArgumentException}.</p> * * @param n Number to test. * @param f Field to test. */	TokenNameCOMMENT_JAVADOC	 <p>Makes sure that the given number is non-negative. If it is not, throw {@link IllegalArgumentException}.</p> * @param n Number to test. @param f Field to test. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
testNonNegative	TokenNameIdentifier	 test Non Negative
(	TokenNameLPAREN	
BigDecimal	TokenNameIdentifier	 Big Decimal
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
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
"NegativeField"	TokenNameStringLiteral	NegativeField
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Constructs a new Duration object by specifying each field * individually.</p> * * <p>This method is functionally equivalent to * invoking another constructor by wrapping * all non-zero parameters into {@link BigInteger} and {@link BigDecimal}. * Zero value of int parameter is equivalent of null value of * the corresponding field.</p> * * @see #DurationImpl(boolean, BigInteger, BigInteger, BigInteger, BigInteger, * BigInteger, BigDecimal) */	TokenNameCOMMENT_JAVADOC	 <p>Constructs a new Duration object by specifying each field individually.</p> * <p>This method is functionally equivalent to invoking another constructor by wrapping all non-zero parameters into {@link BigInteger} and {@link BigDecimal}. Zero value of int parameter is equivalent of null value of the corresponding field.</p> * @see #DurationImpl(boolean, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigDecimal) 
protected	TokenNameprotected	
DurationImpl	TokenNameIdentifier	 Duration Impl
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
isPositive	TokenNameIdentifier	 is Positive
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
years	TokenNameIdentifier	 years
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
months	TokenNameIdentifier	 months
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
days	TokenNameIdentifier	 days
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
hours	TokenNameIdentifier	 hours
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
minutes	TokenNameIdentifier	 minutes
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
seconds	TokenNameIdentifier	 seconds
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
isPositive	TokenNameIdentifier	 is Positive
,	TokenNameCOMMA	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
years	TokenNameIdentifier	 years
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
months	TokenNameIdentifier	 months
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
days	TokenNameIdentifier	 days
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
hours	TokenNameIdentifier	 hours
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
minutes	TokenNameIdentifier	 minutes
)	TokenNameRPAREN	
,	TokenNameCOMMA	
seconds	TokenNameIdentifier	 seconds
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
seconds	TokenNameIdentifier	 seconds
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * TODO: Javadoc * * @param i int to convert to BigInteger. * * @return BigInteger representation of int. */	TokenNameCOMMENT_JAVADOC	 TODO: Javadoc * @param i int to convert to BigInteger. * @return BigInteger representation of int. 
private	TokenNameprivate	
static	TokenNamestatic	
BigInteger	TokenNameIdentifier	 Big Integer
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// field may not be set 	TokenNameCOMMENT_LINE	field may not be set 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
FIELD_UNDEFINED	TokenNameIdentifier	 FIELD  UNDEFINED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// int -> BigInteger 	TokenNameCOMMENT_LINE	int -> BigInteger 
return	TokenNamereturn	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Constructs a new Duration object by specifying the duration * in milliseconds.</p> * * <p>The DAYS, HOURS, MINUTES and SECONDS fields are used to * represent the specifed duration in a reasonable way. * That is, the constructed object <code>x</code> satisfies * the following conditions:</p> * <ul> * <li>x.getHours()&lt;24 * <li>x.getMinutes()&lt;60 * <li>x.getSeconds()&lt;60 * </ul> * * @param durationInMilliSeconds * The length of the duration in milliseconds. */	TokenNameCOMMENT_JAVADOC	 <p>Constructs a new Duration object by specifying the duration in milliseconds.</p> * <p>The DAYS, HOURS, MINUTES and SECONDS fields are used to represent the specifed duration in a reasonable way. That is, the constructed object <code>x</code> satisfies the following conditions:</p> <ul> <li>x.getHours()&lt;24 <li>x.getMinutes()&lt;60 <li>x.getSeconds()&lt;60 </ul> * @param durationInMilliSeconds The length of the duration in milliseconds. 
protected	TokenNameprotected	
DurationImpl	TokenNameIdentifier	 Duration Impl
(	TokenNameLPAREN	
final	TokenNamefinal	
long	TokenNamelong	
durationInMilliSeconds	TokenNameIdentifier	 duration In Milli Seconds
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
is0x8000000000000000L	TokenNameIdentifier	 is0x8000000000000000 L
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
long	TokenNamelong	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
durationInMilliSeconds	TokenNameIdentifier	 duration In Milli Seconds
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
signum	TokenNameIdentifier	 signum
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
signum	TokenNameIdentifier	 signum
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
==	TokenNameEQUAL_EQUAL	
0x8000000000000000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// negating 0x8000000000000000L causes an overflow 	TokenNameCOMMENT_LINE	negating 0x8000000000000000L causes an overflow 
l	TokenNameIdentifier	 l
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
is0x8000000000000000L	TokenNameIdentifier	 is0x8000000000000000 L
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
l	TokenNameIdentifier	 l
*=	TokenNameMULTIPLY_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
signum	TokenNameIdentifier	 signum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
years	TokenNameIdentifier	 years
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
months	TokenNameIdentifier	 months
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
seconds	TokenNameIdentifier	 seconds
=	TokenNameEQUAL	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
%	TokenNameREMAINDER	
60000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
is0x8000000000000000L	TokenNameIdentifier	 is0x8000000000000000 L
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
/=	TokenNameDIVIDE_EQUAL	
60000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minutes	TokenNameIdentifier	 minutes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
%	TokenNameREMAINDER	
60L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
/=	TokenNameDIVIDE_EQUAL	
60L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hours	TokenNameIdentifier	 hours
=	TokenNameEQUAL	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
%	TokenNameREMAINDER	
24L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
/=	TokenNameDIVIDE_EQUAL	
24L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
days	TokenNameIdentifier	 days
=	TokenNameEQUAL	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new Duration object by * parsing its string representation * "PnYnMnDTnHnMnS" as defined in XML Schema 1.0 section 3.2.6.1. * * <p> * The string representation may not have any leading * and trailing whitespaces. * * <p> * For example, this method parses strings like * "P1D" (1 day), "-PT100S" (-100 sec.), "P1DT12H" (1 days and 12 hours). * * <p> * The parsing is done field by field so that * the following holds for any lexically correct string x: * <pre> * new Duration(x).toString().equals(x) * </pre> * * Returns a non-null valid duration object that holds the value * indicated by the lexicalRepresentation parameter. * * @param lexicalRepresentation * Lexical representation of a duration. * @throws IllegalArgumentException * If the given string does not conform to the aforementioned * specification. * @throws NullPointerException * If the given string is null. */	TokenNameCOMMENT_JAVADOC	 Constructs a new Duration object by parsing its string representation "PnYnMnDTnHnMnS" as defined in XML Schema 1.0 section 3.2.6.1. * <p> The string representation may not have any leading and trailing whitespaces. * <p> For example, this method parses strings like "P1D" (1 day), "-PT100S" (-100 sec.), "P1DT12H" (1 days and 12 hours). * <p> The parsing is done field by field so that the following holds for any lexically correct string x: <pre> new Duration(x).toString().equals(x) </pre> * Returns a non-null valid duration object that holds the value indicated by the lexicalRepresentation parameter. * @param lexicalRepresentation Lexical representation of a duration. @throws IllegalArgumentException If the given string does not conform to the aforementioned specification. @throws NullPointerException If the given string is null. 
protected	TokenNameprotected	
DurationImpl	TokenNameIdentifier	 Duration Impl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lexicalRepresentation	TokenNameIdentifier	 lexical Representation
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
// only if I could use the JDK1.4 regular expression .... 	TokenNameCOMMENT_LINE	only if I could use the JDK1.4 regular expression .... 
if	TokenNameif	
(	TokenNameLPAREN	
lexicalRepresentation	TokenNameIdentifier	 lexical Representation
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
lexicalRepresentation	TokenNameIdentifier	 lexical Representation
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
positive	TokenNameIdentifier	 positive
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
timeRequired	TokenNameIdentifier	 time Required
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&&	TokenNameAND_AND	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
positive	TokenNameIdentifier	 positive
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
positive	TokenNameIdentifier	 positive
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&&	TokenNameAND_AND	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'P'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//,idx[0]-1); 	TokenNameCOMMENT_LINE	,idx[0]-1); 
}	TokenNameRBRACE	
// phase 1: chop the string into chunks 	TokenNameCOMMENT_LINE	phase 1: chop the string into chunks 
// (where a chunk is '<number><a symbol>' 	TokenNameCOMMENT_LINE	(where a chunk is '<number><a symbol>' 
//-------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------- 
int	TokenNameint	
dateLen	TokenNameIdentifier	 date Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dateParts	TokenNameIdentifier	 date Parts
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
datePartsIndex	TokenNameIdentifier	 date Parts Index
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&&	TokenNameAND_AND	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
dateLen	TokenNameIdentifier	 date Len
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
datePartsIndex	TokenNameIdentifier	 date Parts Index
[	TokenNameLBRACKET	
dateLen	TokenNameIdentifier	 date Len
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dateParts	TokenNameIdentifier	 date Parts
[	TokenNameLBRACKET	
dateLen	TokenNameIdentifier	 date Len
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
parsePiece	TokenNameIdentifier	 parse Piece
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'T'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timeRequired	TokenNameIdentifier	 time Required
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ,idx[0]-1); 	TokenNameCOMMENT_LINE	,idx[0]-1); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
timeLen	TokenNameIdentifier	 time Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
timeParts	TokenNameIdentifier	 time Parts
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
timePartsIndex	TokenNameIdentifier	 time Parts Index
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&&	TokenNameAND_AND	
isDigitOrPeriod	TokenNameIdentifier	 is Digit Or Period
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
timeLen	TokenNameIdentifier	 time Len
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timePartsIndex	TokenNameIdentifier	 time Parts Index
[	TokenNameLBRACKET	
timeLen	TokenNameIdentifier	 time Len
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
timeParts	TokenNameIdentifier	 time Parts
[	TokenNameLBRACKET	
timeLen	TokenNameIdentifier	 time Len
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
parsePiece	TokenNameIdentifier	 parse Piece
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
timeRequired	TokenNameIdentifier	 time Required
&&	TokenNameAND_AND	
timeLen	TokenNameIdentifier	 time Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ,idx[0]); 	TokenNameCOMMENT_LINE	,idx[0]); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ,idx[0]); 	TokenNameCOMMENT_LINE	,idx[0]); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dateLen	TokenNameIdentifier	 date Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
timeLen	TokenNameIdentifier	 time Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ,idx[0]); 	TokenNameCOMMENT_LINE	,idx[0]); 
}	TokenNameRBRACE	
// phase 2: check the ordering of chunks 	TokenNameCOMMENT_LINE	phase 2: check the ordering of chunks 
//-------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------- 
organizeParts	TokenNameIdentifier	 organize Parts
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
dateParts	TokenNameIdentifier	 date Parts
,	TokenNameCOMMA	
datePartsIndex	TokenNameIdentifier	 date Parts Index
,	TokenNameCOMMA	
dateLen	TokenNameIdentifier	 date Len
,	TokenNameCOMMA	
"YMD"	TokenNameStringLiteral	YMD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
organizeParts	TokenNameIdentifier	 organize Parts
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
timeParts	TokenNameIdentifier	 time Parts
,	TokenNameCOMMA	
timePartsIndex	TokenNameIdentifier	 time Parts Index
,	TokenNameCOMMA	
timeLen	TokenNameIdentifier	 time Len
,	TokenNameCOMMA	
"HMS"	TokenNameStringLiteral	HMS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// parse into numbers 	TokenNameCOMMENT_LINE	parse into numbers 
years	TokenNameIdentifier	 years
=	TokenNameEQUAL	
parseBigInteger	TokenNameIdentifier	 parse Big Integer
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
dateParts	TokenNameIdentifier	 date Parts
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
datePartsIndex	TokenNameIdentifier	 date Parts Index
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
months	TokenNameIdentifier	 months
=	TokenNameEQUAL	
parseBigInteger	TokenNameIdentifier	 parse Big Integer
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
dateParts	TokenNameIdentifier	 date Parts
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
datePartsIndex	TokenNameIdentifier	 date Parts Index
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
days	TokenNameIdentifier	 days
=	TokenNameEQUAL	
parseBigInteger	TokenNameIdentifier	 parse Big Integer
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
dateParts	TokenNameIdentifier	 date Parts
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
datePartsIndex	TokenNameIdentifier	 date Parts Index
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hours	TokenNameIdentifier	 hours
=	TokenNameEQUAL	
parseBigInteger	TokenNameIdentifier	 parse Big Integer
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
timeParts	TokenNameIdentifier	 time Parts
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
timePartsIndex	TokenNameIdentifier	 time Parts Index
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
minutes	TokenNameIdentifier	 minutes
=	TokenNameEQUAL	
parseBigInteger	TokenNameIdentifier	 parse Big Integer
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
timeParts	TokenNameIdentifier	 time Parts
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
timePartsIndex	TokenNameIdentifier	 time Parts Index
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
seconds	TokenNameIdentifier	 seconds
=	TokenNameEQUAL	
parseBigDecimal	TokenNameIdentifier	 parse Big Decimal
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
timeParts	TokenNameIdentifier	 time Parts
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
timePartsIndex	TokenNameIdentifier	 time Parts Index
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
signum	TokenNameIdentifier	 signum
=	TokenNameEQUAL	
calcSignum	TokenNameIdentifier	 calc Signum
(	TokenNameLPAREN	
positive	TokenNameIdentifier	 positive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * TODO: Javadoc * * @param ch char to test. * * @return true if ch is a digit, else false. */	TokenNameCOMMENT_JAVADOC	 TODO: Javadoc * @param ch char to test. * @return true if ch is a digit, else false. 
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
/** * TODO: Javadoc * * @param ch to test. * * @return true if ch is a digit or a period, else false. */	TokenNameCOMMENT_JAVADOC	 TODO: Javadoc * @param ch to test. * @return true if ch is a digit or a period, else false. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isDigitOrPeriod	TokenNameIdentifier	 is Digit Or Period
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * TODO: Javadoc * * @param whole String to parse. * @param idx TODO: ??? * * @return Result of parsing. * * @throws IllegalArgumentException If whole cannot be parsed. */	TokenNameCOMMENT_JAVADOC	 TODO: Javadoc * @param whole String to parse. @param idx TODO: ??? * @return Result of parsing. * @throws IllegalArgumentException If whole cannot be parsed. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
parsePiece	TokenNameIdentifier	 parse Piece
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
whole	TokenNameIdentifier	 whole
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
whole	TokenNameIdentifier	 whole
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isDigitOrPeriod	TokenNameIdentifier	 is Digit Or Period
(	TokenNameLPAREN	
whole	TokenNameIdentifier	 whole
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
whole	TokenNameIdentifier	 whole
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
whole	TokenNameIdentifier	 whole
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ,idx[0]); 	TokenNameCOMMENT_LINE	,idx[0]); 
}	TokenNameRBRACE	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
whole	TokenNameIdentifier	 whole
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * TODO: Javadoc. * * @param whole TODO: ??? * @param parts TODO: ??? * @param partsIndex TODO: ??? * @param len TODO: ??? * @param tokens TODO: ??? * * @throws IllegalArgumentException TODO: ??? */	TokenNameCOMMENT_JAVADOC	 TODO: Javadoc. * @param whole TODO: ??? @param parts TODO: ??? @param partsIndex TODO: ??? @param len TODO: ??? @param tokens TODO: ??? * @throws IllegalArgumentException TODO: ??? 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
organizeParts	TokenNameIdentifier	 organize Parts
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
whole	TokenNameIdentifier	 whole
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parts	TokenNameIdentifier	 parts
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
partsIndex	TokenNameIdentifier	 parts Index
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
whole	TokenNameIdentifier	 whole
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
nidx	TokenNameIdentifier	 nidx
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nidx	TokenNameIdentifier	 nidx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
whole	TokenNameIdentifier	 whole
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ,partsIndex[i]+parts[i].length()-1); 	TokenNameCOMMENT_LINE	,partsIndex[i]+parts[i].length()-1); 
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
nidx	TokenNameIdentifier	 nidx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
nidx	TokenNameIdentifier	 nidx
;	TokenNameSEMICOLON	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
partsIndex	TokenNameIdentifier	 parts Index
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
partsIndex	TokenNameIdentifier	 parts Index
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * TODO: Javadoc * * @param whole TODO: ???. * @param part TODO: ???. * @param index TODO: ???. * * @return TODO: ???. * * @throws IllegalArgumentException TODO: ???. */	TokenNameCOMMENT_JAVADOC	 TODO: Javadoc * @param whole TODO: ???. @param part TODO: ???. @param index TODO: ???. * @return TODO: ???. * @throws IllegalArgumentException TODO: ???. 
private	TokenNameprivate	
static	TokenNamestatic	
BigInteger	TokenNameIdentifier	 Big Integer
parseBigInteger	TokenNameIdentifier	 parse Big Integer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
whole	TokenNameIdentifier	 whole
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
part	TokenNameIdentifier	 part
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
part	TokenNameIdentifier	 part
=	TokenNameEQUAL	
part	TokenNameIdentifier	 part
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
part	TokenNameIdentifier	 part
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// try { 	TokenNameCOMMENT_LINE	try { 
return	TokenNamereturn	
new	TokenNamenew	
BigInteger	TokenNameIdentifier	 Big Integer
(	TokenNameLPAREN	
part	TokenNameIdentifier	 part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// } catch( NumberFormatException e ) { 	TokenNameCOMMENT_LINE	} catch( NumberFormatException e ) { 
// throw new ParseException( whole, index ); 	TokenNameCOMMENT_LINE	throw new ParseException( whole, index ); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
/** * TODO: Javadoc. * * @param whole TODO: ???. * @param part TODO: ???. * @param index TODO: ???. * * @return TODO: ???. * * @throws IllegalArgumentException TODO: ???. */	TokenNameCOMMENT_JAVADOC	 TODO: Javadoc. * @param whole TODO: ???. @param part TODO: ???. @param index TODO: ???. * @return TODO: ???. * @throws IllegalArgumentException TODO: ???. 
private	TokenNameprivate	
static	TokenNamestatic	
BigDecimal	TokenNameIdentifier	 Big Decimal
parseBigDecimal	TokenNameIdentifier	 parse Big Decimal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
whole	TokenNameIdentifier	 whole
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
part	TokenNameIdentifier	 part
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
part	TokenNameIdentifier	 part
=	TokenNameEQUAL	
part	TokenNameIdentifier	 part
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
part	TokenNameIdentifier	 part
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NumberFormatException is IllegalArgumentException 	TokenNameCOMMENT_LINE	NumberFormatException is IllegalArgumentException 
// try { 	TokenNameCOMMENT_LINE	try { 
return	TokenNamereturn	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
part	TokenNameIdentifier	 part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// } catch( NumberFormatException e ) { 	TokenNameCOMMENT_LINE	} catch( NumberFormatException e ) { 
// throw new ParseException( whole, index ); 	TokenNameCOMMENT_LINE	throw new ParseException( whole, index ); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
/** * <p>Four constants defined for the comparison of durations.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Four constants defined for the comparison of durations.</p> 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TEST_POINTS	TokenNameIdentifier	 TEST  POINTS
=	TokenNameEQUAL	
new	TokenNamenew	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
"1696-09-01T00:00:00Z"	TokenNameStringLiteral	1696-09-01T00:00:00Z
)	TokenNameRPAREN	
,	TokenNameCOMMA	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
"1697-02-01T00:00:00Z"	TokenNameStringLiteral	1697-02-01T00:00:00Z
)	TokenNameRPAREN	
,	TokenNameCOMMA	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
"1903-03-01T00:00:00Z"	TokenNameStringLiteral	1903-03-01T00:00:00Z
)	TokenNameRPAREN	
,	TokenNameCOMMA	
XMLGregorianCalendarImpl	TokenNameIdentifier	 XML Gregorian Calendar Impl
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
"1903-07-01T00:00:00Z"	TokenNameStringLiteral	1903-07-01T00:00:00Z
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * <p>Partial order relation comparison with this <code>Duration</code> instance.</p> * * <p>Comparison result must be in accordance with * <a href="http://www.w3.org/TR/xmlschema-2/#duration-order">W3C XML Schema 1.0 Part 2, Section 3.2.7.6.2, * <i>Order relation on duration</i></a>.</p> * * <p>Return:</p> * <ul> * <li>{@link DatatypeConstants#LESSER} if this <code>Duration</code> is shorter than <code>duration</code> parameter</li> * <li>{@link DatatypeConstants#EQUAL} if this <code>Duration</code> is equal to <code>duration</code> parameter</li> * <li>{@link DatatypeConstants#GREATER} if this <code>Duration</code> is longer than <code>duration</code> parameter</li> * <li>{@link DatatypeConstants#INDETERMINATE} if a conclusive partial order relation cannot be determined</li> * </ul> * * @param duration to compare * * @return the relationship between <code>this</code> <code>Duration</code>and <code>duration</code> parameter as * {@link DatatypeConstants#LESSER}, {@link DatatypeConstants#EQUAL}, {@link DatatypeConstants#GREATER} * or {@link DatatypeConstants#INDETERMINATE}. * * @throws UnsupportedOperationException If the underlying implementation * cannot reasonably process the request, e.g. W3C XML Schema allows for * arbitrarily large/small/precise values, the request may be beyond the * implementations capability. * @throws NullPointerException if <code>duration</code> is <code>null</code>. * * @see #isShorterThan(Duration) * @see #isLongerThan(Duration) */	TokenNameCOMMENT_JAVADOC	 <p>Partial order relation comparison with this <code>Duration</code> instance.</p> * <p>Comparison result must be in accordance with <a href="http://www.w3.org/TR/xmlschema-2/#duration-order">W3C XML Schema 1.0 Part 2, Section 3.2.7.6.2, <i>Order relation on duration</i></a>.</p> * <p>Return:</p> <ul> <li>{@link DatatypeConstants#LESSER} if this <code>Duration</code> is shorter than <code>duration</code> parameter</li> <li>{@link DatatypeConstants#EQUAL} if this <code>Duration</code> is equal to <code>duration</code> parameter</li> <li>{@link DatatypeConstants#GREATER} if this <code>Duration</code> is longer than <code>duration</code> parameter</li> <li>{@link DatatypeConstants#INDETERMINATE} if a conclusive partial order relation cannot be determined</li> </ul> * @param duration to compare * @return the relationship between <code>this</code> <code>Duration</code>and <code>duration</code> parameter as {@link DatatypeConstants#LESSER}, {@link DatatypeConstants#EQUAL}, {@link DatatypeConstants#GREATER} or {@link DatatypeConstants#INDETERMINATE}. * @throws UnsupportedOperationException If the underlying implementation cannot reasonably process the request, e.g. W3C XML Schema allows for arbitrarily large/small/precise values, the request may be beyond the implementations capability. @throws NullPointerException if <code>duration</code> is <code>null</code>. * @see #isShorterThan(Duration) @see #isLongerThan(Duration) 
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
Duration	TokenNameIdentifier	 Duration
rhs	TokenNameIdentifier	 rhs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
maxintAsBigInteger	TokenNameIdentifier	 maxint As Big Integer
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check for fields that are too large in this Duration 	TokenNameCOMMENT_LINE	check for fields that are too large in this Duration 
if	TokenNameif	
(	TokenNameLPAREN	
years	TokenNameIdentifier	 years
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
years	TokenNameIdentifier	 years
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
maxintAsBigInteger	TokenNameIdentifier	 maxint As Big Integer
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"TooLarge"	TokenNameStringLiteral	TooLarge
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
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
"#compare(Duration duration)"	TokenNameStringLiteral	#compare(Duration duration)
+	TokenNamePLUS	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
YEARS	TokenNameIdentifier	 YEARS
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
years	TokenNameIdentifier	 years
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
//this.getClass().getName() + "#compare(Duration duration)" 	TokenNameCOMMENT_LINE	this.getClass().getName() + "#compare(Duration duration)" 
//+ " years too large to be supported by this implementation " 	TokenNameCOMMENT_LINE	+ " years too large to be supported by this implementation " 
//+ years.toString() 	TokenNameCOMMENT_LINE	+ years.toString() 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
months	TokenNameIdentifier	 months
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
months	TokenNameIdentifier	 months
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
maxintAsBigInteger	TokenNameIdentifier	 maxint As Big Integer
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"TooLarge"	TokenNameStringLiteral	TooLarge
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
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
"#compare(Duration duration)"	TokenNameStringLiteral	#compare(Duration duration)
+	TokenNamePLUS	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MONTHS	TokenNameIdentifier	 MONTHS
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
months	TokenNameIdentifier	 months
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
//this.getClass().getName() + "#compare(Duration duration)" 	TokenNameCOMMENT_LINE	this.getClass().getName() + "#compare(Duration duration)" 
//+ " months too large to be supported by this implementation " 	TokenNameCOMMENT_LINE	+ " months too large to be supported by this implementation " 
//+ months.toString() 	TokenNameCOMMENT_LINE	+ months.toString() 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
days	TokenNameIdentifier	 days
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
days	TokenNameIdentifier	 days
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
maxintAsBigInteger	TokenNameIdentifier	 maxint As Big Integer
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"TooLarge"	TokenNameStringLiteral	TooLarge
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
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
"#compare(Duration duration)"	TokenNameStringLiteral	#compare(Duration duration)
+	TokenNamePLUS	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
DAYS	TokenNameIdentifier	 DAYS
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
days	TokenNameIdentifier	 days
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
//this.getClass().getName() + "#compare(Duration duration)" 	TokenNameCOMMENT_LINE	this.getClass().getName() + "#compare(Duration duration)" 
//+ " days too large to be supported by this implementation " 	TokenNameCOMMENT_LINE	+ " days too large to be supported by this implementation " 
//+ days.toString() 	TokenNameCOMMENT_LINE	+ days.toString() 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hours	TokenNameIdentifier	 hours
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
hours	TokenNameIdentifier	 hours
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
maxintAsBigInteger	TokenNameIdentifier	 maxint As Big Integer
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"TooLarge"	TokenNameStringLiteral	TooLarge
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
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
"#compare(Duration duration)"	TokenNameStringLiteral	#compare(Duration duration)
+	TokenNamePLUS	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
HOURS	TokenNameIdentifier	 HOURS
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
hours	TokenNameIdentifier	 hours
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
//this.getClass().getName() + "#compare(Duration duration)" 	TokenNameCOMMENT_LINE	this.getClass().getName() + "#compare(Duration duration)" 
//+ " hours too large to be supported by this implementation " 	TokenNameCOMMENT_LINE	+ " hours too large to be supported by this implementation " 
//+ hours.toString() 	TokenNameCOMMENT_LINE	+ hours.toString() 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minutes	TokenNameIdentifier	 minutes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
minutes	TokenNameIdentifier	 minutes
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
maxintAsBigInteger	TokenNameIdentifier	 maxint As Big Integer
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"TooLarge"	TokenNameStringLiteral	TooLarge
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
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
"#compare(Duration duration)"	TokenNameStringLiteral	#compare(Duration duration)
+	TokenNamePLUS	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MINUTES	TokenNameIdentifier	 MINUTES
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
minutes	TokenNameIdentifier	 minutes
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
//this.getClass().getName() + "#compare(Duration duration)" 	TokenNameCOMMENT_LINE	this.getClass().getName() + "#compare(Duration duration)" 
//+ " minutes too large to be supported by this implementation " 	TokenNameCOMMENT_LINE	+ " minutes too large to be supported by this implementation " 
//+ minutes.toString() 	TokenNameCOMMENT_LINE	+ minutes.toString() 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
seconds	TokenNameIdentifier	 seconds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
seconds	TokenNameIdentifier	 seconds
.	TokenNameDOT	
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
maxintAsBigInteger	TokenNameIdentifier	 maxint As Big Integer
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"TooLarge"	TokenNameStringLiteral	TooLarge
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
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
"#compare(Duration duration)"	TokenNameStringLiteral	#compare(Duration duration)
+	TokenNamePLUS	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
seconds	TokenNameIdentifier	 seconds
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
//this.getClass().getName() + "#compare(Duration duration)" 	TokenNameCOMMENT_LINE	this.getClass().getName() + "#compare(Duration duration)" 
//+ " seconds too large to be supported by this implementation " 	TokenNameCOMMENT_LINE	+ " seconds too large to be supported by this implementation " 
//+ seconds.toString() 	TokenNameCOMMENT_LINE	+ seconds.toString() 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check for fields that are too large in rhs Duration 	TokenNameCOMMENT_LINE	check for fields that are too large in rhs Duration 
BigInteger	TokenNameIdentifier	 Big Integer
rhsYears	TokenNameIdentifier	 rhs Years
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
YEARS	TokenNameIdentifier	 YEARS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rhsYears	TokenNameIdentifier	 rhs Years
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
rhsYears	TokenNameIdentifier	 rhs Years
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
maxintAsBigInteger	TokenNameIdentifier	 maxint As Big Integer
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"TooLarge"	TokenNameStringLiteral	TooLarge
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
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
"#compare(Duration duration)"	TokenNameStringLiteral	#compare(Duration duration)
+	TokenNamePLUS	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
YEARS	TokenNameIdentifier	 YEARS
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rhsYears	TokenNameIdentifier	 rhs Years
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
//this.getClass().getName() + "#compare(Duration duration)" 	TokenNameCOMMENT_LINE	this.getClass().getName() + "#compare(Duration duration)" 
//+ " years too large to be supported by this implementation " 	TokenNameCOMMENT_LINE	+ " years too large to be supported by this implementation " 
//+ rhsYears.toString() 	TokenNameCOMMENT_LINE	+ rhsYears.toString() 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
rhsMonths	TokenNameIdentifier	 rhs Months
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MONTHS	TokenNameIdentifier	 MONTHS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rhsMonths	TokenNameIdentifier	 rhs Months
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
rhsMonths	TokenNameIdentifier	 rhs Months
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
maxintAsBigInteger	TokenNameIdentifier	 maxint As Big Integer
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"TooLarge"	TokenNameStringLiteral	TooLarge
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
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
"#compare(Duration duration)"	TokenNameStringLiteral	#compare(Duration duration)
+	TokenNamePLUS	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MONTHS	TokenNameIdentifier	 MONTHS
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rhsMonths	TokenNameIdentifier	 rhs Months
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
//this.getClass().getName() + "#compare(Duration duration)" 	TokenNameCOMMENT_LINE	this.getClass().getName() + "#compare(Duration duration)" 
//+ " months too large to be supported by this implementation " 	TokenNameCOMMENT_LINE	+ " months too large to be supported by this implementation " 
//+ rhsMonths.toString() 	TokenNameCOMMENT_LINE	+ rhsMonths.toString() 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
rhsDays	TokenNameIdentifier	 rhs Days
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
DAYS	TokenNameIdentifier	 DAYS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rhsDays	TokenNameIdentifier	 rhs Days
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
rhsDays	TokenNameIdentifier	 rhs Days
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
maxintAsBigInteger	TokenNameIdentifier	 maxint As Big Integer
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"TooLarge"	TokenNameStringLiteral	TooLarge
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
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
"#compare(Duration duration)"	TokenNameStringLiteral	#compare(Duration duration)
+	TokenNamePLUS	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
DAYS	TokenNameIdentifier	 DAYS
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rhsDays	TokenNameIdentifier	 rhs Days
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
//this.getClass().getName() + "#compare(Duration duration)" 	TokenNameCOMMENT_LINE	this.getClass().getName() + "#compare(Duration duration)" 
//+ " days too large to be supported by this implementation " 	TokenNameCOMMENT_LINE	+ " days too large to be supported by this implementation " 
//+ rhsDays.toString() 	TokenNameCOMMENT_LINE	+ rhsDays.toString() 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
rhsHours	TokenNameIdentifier	 rhs Hours
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
HOURS	TokenNameIdentifier	 HOURS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rhsHours	TokenNameIdentifier	 rhs Hours
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
rhsHours	TokenNameIdentifier	 rhs Hours
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
maxintAsBigInteger	TokenNameIdentifier	 maxint As Big Integer
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"TooLarge"	TokenNameStringLiteral	TooLarge
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
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
"#compare(Duration duration)"	TokenNameStringLiteral	#compare(Duration duration)
+	TokenNamePLUS	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
HOURS	TokenNameIdentifier	 HOURS
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rhsHours	TokenNameIdentifier	 rhs Hours
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
//this.getClass().getName() + "#compare(Duration duration)" 	TokenNameCOMMENT_LINE	this.getClass().getName() + "#compare(Duration duration)" 
//+ " hours too large to be supported by this implementation " 	TokenNameCOMMENT_LINE	+ " hours too large to be supported by this implementation " 
//+ rhsHours.toString() 	TokenNameCOMMENT_LINE	+ rhsHours.toString() 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
rhsMinutes	TokenNameIdentifier	 rhs Minutes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MINUTES	TokenNameIdentifier	 MINUTES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rhsMinutes	TokenNameIdentifier	 rhs Minutes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
rhsMinutes	TokenNameIdentifier	 rhs Minutes
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
maxintAsBigInteger	TokenNameIdentifier	 maxint As Big Integer
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"TooLarge"	TokenNameStringLiteral	TooLarge
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
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
"#compare(Duration duration)"	TokenNameStringLiteral	#compare(Duration duration)
+	TokenNamePLUS	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MINUTES	TokenNameIdentifier	 MINUTES
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rhsMinutes	TokenNameIdentifier	 rhs Minutes
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
//this.getClass().getName() + "#compare(Duration duration)" 	TokenNameCOMMENT_LINE	this.getClass().getName() + "#compare(Duration duration)" 
//+ " minutes too large to be supported by this implementation " 	TokenNameCOMMENT_LINE	+ " minutes too large to be supported by this implementation " 
//+ rhsMinutes.toString() 	TokenNameCOMMENT_LINE	+ rhsMinutes.toString() 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BigDecimal	TokenNameIdentifier	 Big Decimal
rhsSecondsAsBigDecimal	TokenNameIdentifier	 rhs Seconds As Big Decimal
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BigDecimal	TokenNameIdentifier	 Big Decimal
)	TokenNameRPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BigInteger	TokenNameIdentifier	 Big Integer
rhsSeconds	TokenNameIdentifier	 rhs Seconds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rhsSecondsAsBigDecimal	TokenNameIdentifier	 rhs Seconds As Big Decimal
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rhsSeconds	TokenNameIdentifier	 rhs Seconds
=	TokenNameEQUAL	
rhsSecondsAsBigDecimal	TokenNameIdentifier	 rhs Seconds As Big Decimal
.	TokenNameDOT	
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rhsSeconds	TokenNameIdentifier	 rhs Seconds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
rhsSeconds	TokenNameIdentifier	 rhs Seconds
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
maxintAsBigInteger	TokenNameIdentifier	 maxint As Big Integer
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"TooLarge"	TokenNameStringLiteral	TooLarge
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
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
"#compare(Duration duration)"	TokenNameStringLiteral	#compare(Duration duration)
+	TokenNamePLUS	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rhsSeconds	TokenNameIdentifier	 rhs Seconds
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
//this.getClass().getName() + "#compare(Duration duration)" 	TokenNameCOMMENT_LINE	this.getClass().getName() + "#compare(Duration duration)" 
//+ " seconds too large to be supported by this implementation " 	TokenNameCOMMENT_LINE	+ " seconds too large to be supported by this implementation " 
//+ rhsSeconds.toString() 	TokenNameCOMMENT_LINE	+ rhsSeconds.toString() 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// turn this Duration into a GregorianCalendar 	TokenNameCOMMENT_LINE	turn this Duration into a GregorianCalendar 
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
lhsCalendar	TokenNameIdentifier	 lhs Calendar
=	TokenNameEQUAL	
new	TokenNamenew	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
(	TokenNameLPAREN	
1970	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lhsCalendar	TokenNameIdentifier	 lhs Calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
getYears	TokenNameIdentifier	 get Years
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lhsCalendar	TokenNameIdentifier	 lhs Calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
,	TokenNameCOMMA	
getMonths	TokenNameIdentifier	 get Months
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lhsCalendar	TokenNameIdentifier	 lhs Calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
DAY_OF_YEAR	TokenNameIdentifier	 DAY  OF  YEAR
,	TokenNameCOMMA	
getDays	TokenNameIdentifier	 get Days
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lhsCalendar	TokenNameIdentifier	 lhs Calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
,	TokenNameCOMMA	
getHours	TokenNameIdentifier	 get Hours
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lhsCalendar	TokenNameIdentifier	 lhs Calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
getMinutes	TokenNameIdentifier	 get Minutes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lhsCalendar	TokenNameIdentifier	 lhs Calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
getSeconds	TokenNameIdentifier	 get Seconds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// turn compare Duration into a GregorianCalendar 	TokenNameCOMMENT_LINE	turn compare Duration into a GregorianCalendar 
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
rhsCalendar	TokenNameIdentifier	 rhs Calendar
=	TokenNameEQUAL	
new	TokenNamenew	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
(	TokenNameLPAREN	
1970	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rhsCalendar	TokenNameIdentifier	 rhs Calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getYears	TokenNameIdentifier	 get Years
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rhsCalendar	TokenNameIdentifier	 rhs Calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
,	TokenNameCOMMA	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getMonths	TokenNameIdentifier	 get Months
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rhsCalendar	TokenNameIdentifier	 rhs Calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
DAY_OF_YEAR	TokenNameIdentifier	 DAY  OF  YEAR
,	TokenNameCOMMA	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getDays	TokenNameIdentifier	 get Days
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rhsCalendar	TokenNameIdentifier	 rhs Calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
,	TokenNameCOMMA	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getHours	TokenNameIdentifier	 get Hours
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rhsCalendar	TokenNameIdentifier	 rhs Calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getMinutes	TokenNameIdentifier	 get Minutes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rhsCalendar	TokenNameIdentifier	 rhs Calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getSeconds	TokenNameIdentifier	 get Seconds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lhsCalendar	TokenNameIdentifier	 lhs Calendar
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rhsCalendar	TokenNameIdentifier	 rhs Calendar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
compareDates	TokenNameIdentifier	 compare Dates
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
rhs	TokenNameIdentifier	 rhs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares 2 given durations. (refer to W3C Schema Datatypes "3.2.6 duration") * * @param duration1 Unnormalized duration * @param duration2 Unnormalized duration * @return INDETERMINATE if the order relationship between date1 and date2 is indeterminate. * EQUAL if the order relation between date1 and date2 is EQUAL. * If the strict parameter is true, return LESS_THAN if date1 is less than date2 and * return GREATER_THAN if date1 is greater than date2. * If the strict parameter is false, return LESS_THAN if date1 is less than OR equal to date2 and * return GREATER_THAN if date1 is greater than OR equal to date2 */	TokenNameCOMMENT_JAVADOC	 Compares 2 given durations. (refer to W3C Schema Datatypes "3.2.6 duration") * @param duration1 Unnormalized duration @param duration2 Unnormalized duration @return INDETERMINATE if the order relationship between date1 and date2 is indeterminate. EQUAL if the order relation between date1 and date2 is EQUAL. If the strict parameter is true, return LESS_THAN if date1 is less than date2 and return GREATER_THAN if date1 is greater than date2. If the strict parameter is false, return LESS_THAN if date1 is less than OR equal to date2 and return GREATER_THAN if date1 is greater than OR equal to date2 
private	TokenNameprivate	
int	TokenNameint	
compareDates	TokenNameIdentifier	 compare Dates
(	TokenNameLPAREN	
Duration	TokenNameIdentifier	 Duration
duration1	TokenNameIdentifier	 duration1
,	TokenNameCOMMA	
Duration	TokenNameIdentifier	 Duration
duration2	TokenNameIdentifier	 duration2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
resultA	TokenNameIdentifier	 result A
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
int	TokenNameint	
resultB	TokenNameIdentifier	 result B
=	TokenNameEQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
tempA	TokenNameIdentifier	 temp A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
)	TokenNameRPAREN	
TEST_POINTS	TokenNameIdentifier	 TEST  POINTS
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
tempB	TokenNameIdentifier	 temp B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
)	TokenNameRPAREN	
TEST_POINTS	TokenNameIdentifier	 TEST  POINTS
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//long comparison algorithm is required 	TokenNameCOMMENT_LINE	long comparison algorithm is required 
tempA	TokenNameIdentifier	 temp A
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
duration1	TokenNameIdentifier	 duration1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempB	TokenNameIdentifier	 temp B
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
duration2	TokenNameIdentifier	 duration2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultA	TokenNameIdentifier	 result A
=	TokenNameEQUAL	
tempA	TokenNameIdentifier	 temp A
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
tempB	TokenNameIdentifier	 temp B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resultA	TokenNameIdentifier	 result A
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tempA	TokenNameIdentifier	 temp A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
)	TokenNameRPAREN	
TEST_POINTS	TokenNameIdentifier	 TEST  POINTS
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempB	TokenNameIdentifier	 temp B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
)	TokenNameRPAREN	
TEST_POINTS	TokenNameIdentifier	 TEST  POINTS
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempA	TokenNameIdentifier	 temp A
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
duration1	TokenNameIdentifier	 duration1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempB	TokenNameIdentifier	 temp B
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
duration2	TokenNameIdentifier	 duration2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultB	TokenNameIdentifier	 result B
=	TokenNameEQUAL	
tempA	TokenNameIdentifier	 temp A
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resultA	TokenNameIdentifier	 result A
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tempA	TokenNameIdentifier	 temp A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
)	TokenNameRPAREN	
TEST_POINTS	TokenNameIdentifier	 TEST  POINTS
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempB	TokenNameIdentifier	 temp B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
)	TokenNameRPAREN	
TEST_POINTS	TokenNameIdentifier	 TEST  POINTS
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempA	TokenNameIdentifier	 temp A
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
duration1	TokenNameIdentifier	 duration1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempB	TokenNameIdentifier	 temp B
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
duration2	TokenNameIdentifier	 duration2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultB	TokenNameIdentifier	 result B
=	TokenNameEQUAL	
tempA	TokenNameIdentifier	 temp A
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resultA	TokenNameIdentifier	 result A
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tempA	TokenNameIdentifier	 temp A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
)	TokenNameRPAREN	
TEST_POINTS	TokenNameIdentifier	 TEST  POINTS
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempB	TokenNameIdentifier	 temp B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLGregorianCalendar	TokenNameIdentifier	 XML Gregorian Calendar
)	TokenNameRPAREN	
TEST_POINTS	TokenNameIdentifier	 TEST  POINTS
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempA	TokenNameIdentifier	 temp A
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
duration1	TokenNameIdentifier	 duration1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempB	TokenNameIdentifier	 temp B
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
duration2	TokenNameIdentifier	 duration2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultB	TokenNameIdentifier	 result B
=	TokenNameEQUAL	
tempA	TokenNameIdentifier	 temp A
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resultA	TokenNameIdentifier	 result A
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
compareResults	TokenNameIdentifier	 compare Results
(	TokenNameLPAREN	
int	TokenNameint	
resultA	TokenNameIdentifier	 result A
,	TokenNameCOMMA	
int	TokenNameint	
resultB	TokenNameIdentifier	 result B
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resultB	TokenNameIdentifier	 result B
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
resultA	TokenNameIdentifier	 result A
!=	TokenNameNOT_EQUAL	
resultB	TokenNameIdentifier	 result B
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
resultA	TokenNameIdentifier	 result A
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a hash code consistent with the definition of the equals method. * * @see Object#hashCode() */	TokenNameCOMMENT_JAVADOC	 Returns a hash code consistent with the definition of the equals method. * @see Object#hashCode() 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// component wise hash is not correct because 1day = 24hours 	TokenNameCOMMENT_LINE	component wise hash is not correct because 1day = 24hours 
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
TEST_POINTS	TokenNameIdentifier	 TEST  POINTS
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
toGregorianCalendar	TokenNameIdentifier	 to Gregorian Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
addTo	TokenNameIdentifier	 add To
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
getCalendarTimeInMillis	TokenNameIdentifier	 get Calendar Time In Millis
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a string representation of this duration object. * * <p> * The result is formatter according to the XML Schema 1.0 * spec and can be always parsed back later into the * equivalent duration object by * the {@link #DurationImpl(String)} constructor. * * <p> * Formally, the following holds for any {@link Duration} * object x. * <pre> * new Duration(x.toString()).equals(x) * </pre> * * @return * Always return a non-null valid String object. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this duration object. * <p> The result is formatter according to the XML Schema 1.0 spec and can be always parsed back later into the equivalent duration object by the {@link #DurationImpl(String)} constructor. * <p> Formally, the following holds for any {@link Duration} object x. <pre> new Duration(x.toString()).equals(x) </pre> * @return Always return a non-null valid String object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
signum	TokenNameIdentifier	 signum
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
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'P'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
years	TokenNameIdentifier	 years
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
years	TokenNameIdentifier	 years
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'Y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
months	TokenNameIdentifier	 months
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
months	TokenNameIdentifier	 months
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'M'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
days	TokenNameIdentifier	 days
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
days	TokenNameIdentifier	 days
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'D'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hours	TokenNameIdentifier	 hours
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
minutes	TokenNameIdentifier	 minutes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
seconds	TokenNameIdentifier	 seconds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'T'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hours	TokenNameIdentifier	 hours
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
hours	TokenNameIdentifier	 hours
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'H'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minutes	TokenNameIdentifier	 minutes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
minutes	TokenNameIdentifier	 minutes
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'M'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
seconds	TokenNameIdentifier	 seconds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
seconds	TokenNameIdentifier	 seconds
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'S'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
/** * Checks if a field is set. * * A field of a duration object may or may not be present. * This method can be used to test if a field is present. * * @param field * one of the six Field constants (YEARS,MONTHS,DAYS,HOURS, * MINUTES, or SECONDS.) * @return * true if the field is present. false if not. * * @throws NullPointerException * If the field parameter is null. */	TokenNameCOMMENT_JAVADOC	 Checks if a field is set. * A field of a duration object may or may not be present. This method can be used to test if a field is present. * @param field one of the six Field constants (YEARS,MONTHS,DAYS,HOURS, MINUTES, or SECONDS.) @return true if the field is present. false if not. * @throws NullPointerException If the field parameter is null. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
=	TokenNameEQUAL	
"javax.xml.datatype.Duration"	TokenNameStringLiteral	javax.xml.datatype.Duration
+	TokenNamePLUS	
"#isSet(DatatypeConstants.Field field)"	TokenNameStringLiteral	#isSet(DatatypeConstants.Field field)
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
//"cannot be called with field == null" 	TokenNameCOMMENT_LINE	"cannot be called with field == null" 
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"FieldCannotBeNull"	TokenNameStringLiteral	FieldCannotBeNull
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
methodName	TokenNameIdentifier	 method Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
YEARS	TokenNameIdentifier	 YEARS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
years	TokenNameIdentifier	 years
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MONTHS	TokenNameIdentifier	 MONTHS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
months	TokenNameIdentifier	 months
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
DAYS	TokenNameIdentifier	 DAYS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
days	TokenNameIdentifier	 days
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
HOURS	TokenNameIdentifier	 HOURS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hours	TokenNameIdentifier	 hours
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MINUTES	TokenNameIdentifier	 MINUTES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
minutes	TokenNameIdentifier	 minutes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
seconds	TokenNameIdentifier	 seconds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
=	TokenNameEQUAL	
"javax.xml.datatype.Duration"	TokenNameStringLiteral	javax.xml.datatype.Duration
+	TokenNamePLUS	
"#isSet(DatatypeConstants.Field field)"	TokenNameStringLiteral	#isSet(DatatypeConstants.Field field)
;	TokenNameSEMICOLON	
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
"UnknownField"	TokenNameStringLiteral	UnknownField
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the value of a field. * * Fields of a duration object may contain arbitrary large value. * Therefore this method is designed to return a {@link Number} object. * * In case of YEARS, MONTHS, DAYS, HOURS, and MINUTES, the returned * number will be a non-negative integer. In case of seconds, * the returned number may be a non-negative decimal value. * * @param field * one of the six Field constants (YEARS,MONTHS,DAYS,HOURS, * MINUTES, or SECONDS.) * @return * If the specified field is present, this method returns * a non-null non-negative {@link Number} object that * represents its value. If it is not present, return null. * For YEARS, MONTHS, DAYS, HOURS, and MINUTES, this method * returns a {@link BigInteger} object. For SECONDS, this * method returns a {@link BigDecimal}. * * @throws NullPointerException * If the field parameter is null. */	TokenNameCOMMENT_JAVADOC	 Gets the value of a field. * Fields of a duration object may contain arbitrary large value. Therefore this method is designed to return a {@link Number} object. * In case of YEARS, MONTHS, DAYS, HOURS, and MINUTES, the returned number will be a non-negative integer. In case of seconds, the returned number may be a non-negative decimal value. * @param field one of the six Field constants (YEARS,MONTHS,DAYS,HOURS, MINUTES, or SECONDS.) @return If the specified field is present, this method returns a non-null non-negative {@link Number} object that represents its value. If it is not present, return null. For YEARS, MONTHS, DAYS, HOURS, and MINUTES, this method returns a {@link BigInteger} object. For SECONDS, this method returns a {@link BigDecimal}. * @throws NullPointerException If the field parameter is null. 
public	TokenNamepublic	
Number	TokenNameIdentifier	 Number
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
=	TokenNameEQUAL	
"javax.xml.datatype.Duration"	TokenNameStringLiteral	javax.xml.datatype.Duration
+	TokenNamePLUS	
"#isSet(DatatypeConstants.Field field) "	TokenNameStringLiteral	#isSet(DatatypeConstants.Field field) 
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
DatatypeMessageFormatter	TokenNameIdentifier	 Datatype Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"FieldCannotBeNull"	TokenNameStringLiteral	FieldCannotBeNull
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
methodName	TokenNameIdentifier	 method Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
YEARS	TokenNameIdentifier	 YEARS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
years	TokenNameIdentifier	 years
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MONTHS	TokenNameIdentifier	 MONTHS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
months	TokenNameIdentifier	 months
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
DAYS	TokenNameIdentifier	 DAYS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
days	TokenNameIdentifier	 days
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
HOURS	TokenNameIdentifier	 HOURS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hours	TokenNameIdentifier	 hours
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MINUTES	TokenNameIdentifier	 MINUTES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
minutes	TokenNameIdentifier	 minutes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
seconds	TokenNameIdentifier	 seconds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** throw new IllegalArgumentException( "javax.xml.datatype.Duration" + "#(getSet(DatatypeConstants.Field field) called with an unknown field: " + field.toString() ); */	TokenNameCOMMENT_JAVADOC	 throw new IllegalArgumentException( "javax.xml.datatype.Duration" + "#(getSet(DatatypeConstants.Field field) called with an unknown field: " + field.toString() ); 
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
=	TokenNameEQUAL	
"javax.xml.datatype.Duration"	TokenNameStringLiteral	javax.xml.datatype.Duration
+	TokenNamePLUS	
"#(getSet(DatatypeConstants.Field field)"	TokenNameStringLiteral	#(getSet(DatatypeConstants.Field field)
;	TokenNameSEMICOLON	
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
"UnknownField"	TokenNameStringLiteral	UnknownField
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtains the value of the YEARS field as an integer value, * or 0 if not present. * * <p> * This method is a convenience method around the * {@link #getField(DatatypeConstants.Field)} method. * * <p> * Note that since this method returns <tt>int</tt>, this * method will return an incorrect value for {@link Duration}s * with the year field that goes beyond the range of <tt>int</tt>. * Use <code>getField(YEARS)</code> to avoid possible loss of precision.</p> * * @return * If the YEARS field is present, return * its value as an integer by using the {@link Number#intValue()} * method. If the YEARS field is not present, return 0. */	TokenNameCOMMENT_JAVADOC	 Obtains the value of the YEARS field as an integer value, or 0 if not present. * <p> This method is a convenience method around the {@link #getField(DatatypeConstants.Field)} method. * <p> Note that since this method returns <tt>int</tt>, this method will return an incorrect value for {@link Duration}s with the year field that goes beyond the range of <tt>int</tt>. Use <code>getField(YEARS)</code> to avoid possible loss of precision.</p> * @return If the YEARS field is present, return its value as an integer by using the {@link Number#intValue()} method. If the YEARS field is not present, return 0. 
public	TokenNamepublic	
int	TokenNameint	
getYears	TokenNameIdentifier	 get Years
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getInt	TokenNameIdentifier	 get Int
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
YEARS	TokenNameIdentifier	 YEARS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtains the value of the MONTHS field as an integer value, * or 0 if not present. * * This method works just like {@link #getYears()} except * that this method works on the MONTHS field. * * @return Months of this <code>Duration</code>. */	TokenNameCOMMENT_JAVADOC	 Obtains the value of the MONTHS field as an integer value, or 0 if not present. * This method works just like {@link #getYears()} except that this method works on the MONTHS field. * @return Months of this <code>Duration</code>. 
public	TokenNamepublic	
int	TokenNameint	
getMonths	TokenNameIdentifier	 get Months
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getInt	TokenNameIdentifier	 get Int
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MONTHS	TokenNameIdentifier	 MONTHS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtains the value of the DAYS field as an integer value, * or 0 if not present. * * This method works just like {@link #getYears()} except * that this method works on the DAYS field. * * @return Days of this <code>Duration</code>. */	TokenNameCOMMENT_JAVADOC	 Obtains the value of the DAYS field as an integer value, or 0 if not present. * This method works just like {@link #getYears()} except that this method works on the DAYS field. * @return Days of this <code>Duration</code>. 
public	TokenNamepublic	
int	TokenNameint	
getDays	TokenNameIdentifier	 get Days
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getInt	TokenNameIdentifier	 get Int
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
DAYS	TokenNameIdentifier	 DAYS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtains the value of the HOURS field as an integer value, * or 0 if not present. * * This method works just like {@link #getYears()} except * that this method works on the HOURS field. * * @return Hours of this <code>Duration</code>. * */	TokenNameCOMMENT_JAVADOC	 Obtains the value of the HOURS field as an integer value, or 0 if not present. * This method works just like {@link #getYears()} except that this method works on the HOURS field. * @return Hours of this <code>Duration</code>. 
public	TokenNamepublic	
int	TokenNameint	
getHours	TokenNameIdentifier	 get Hours
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getInt	TokenNameIdentifier	 get Int
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
HOURS	TokenNameIdentifier	 HOURS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtains the value of the MINUTES field as an integer value, * or 0 if not present. * * This method works just like {@link #getYears()} except * that this method works on the MINUTES field. * * @return Minutes of this <code>Duration</code>. * */	TokenNameCOMMENT_JAVADOC	 Obtains the value of the MINUTES field as an integer value, or 0 if not present. * This method works just like {@link #getYears()} except that this method works on the MINUTES field. * @return Minutes of this <code>Duration</code>. 
public	TokenNamepublic	
int	TokenNameint	
getMinutes	TokenNameIdentifier	 get Minutes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getInt	TokenNameIdentifier	 get Int
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MINUTES	TokenNameIdentifier	 MINUTES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtains the value of the SECONDS field as an integer value, * or 0 if not present. * * This method works just like {@link #getYears()} except * that this method works on the SECONDS field. * * @return seconds in the integer value. The fraction of seconds * will be discarded (for example, if the actual value is 2.5, * this method returns 2) */	TokenNameCOMMENT_JAVADOC	 Obtains the value of the SECONDS field as an integer value, or 0 if not present. * This method works just like {@link #getYears()} except that this method works on the SECONDS field. * @return seconds in the integer value. The fraction of seconds will be discarded (for example, if the actual value is 2.5, this method returns 2) 
public	TokenNamepublic	
int	TokenNameint	
getSeconds	TokenNameIdentifier	 get Seconds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getInt	TokenNameIdentifier	 get Int
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Return the requested field value as an int.</p> * * <p>If field is not set, i.e. == null, 0 is returned.</p> * * @param field To get value for. * * @return int value of field or 0 if field is not set. */	TokenNameCOMMENT_JAVADOC	 <p>Return the requested field value as an int.</p> * <p>If field is not set, i.e. == null, 0 is returned.</p> * @param field To get value for. * @return int value of field or 0 if field is not set. 
private	TokenNameprivate	
int	TokenNameint	
getInt	TokenNameIdentifier	 get Int
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Number	TokenNameIdentifier	 Number
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Returns the length of the duration in milli-seconds.</p> * * <p>If the seconds field carries more digits than milli-second order, * those will be simply discarded (or in other words, rounded to zero.) * For example, for any Calendar value <code>x<code>,</p> * <pre> * <code>new Duration("PT10.00099S").getTimeInMills(x) == 10000</code>. * <code>new Duration("-PT10.00099S").getTimeInMills(x) == -10000</code>. * </pre> * * <p> * Note that this method uses the {@link #addTo(Calendar)} method, * which may work incorectly with {@link Duration} objects with * very large values in its fields. See the {@link #addTo(Calendar)} * method for details. * * @param startInstant * The length of a month/year varies. The <code>startInstant</code> is * used to disambiguate this variance. Specifically, this method * returns the difference between <code>startInstant</code> and * <code>startInstant+duration</code> * * @return milliseconds between <code>startInstant</code> and * <code>startInstant</code> plus this <code>Duration</code> * * @throws NullPointerException if <code>startInstant</code> parameter * is null. * */	TokenNameCOMMENT_JAVADOC	 <p>Returns the length of the duration in milli-seconds.</p> * <p>If the seconds field carries more digits than milli-second order, those will be simply discarded (or in other words, rounded to zero.) For example, for any Calendar value <code>x<code>,</p> <pre> <code>new Duration("PT10.00099S").getTimeInMills(x) == 10000</code>. <code>new Duration("-PT10.00099S").getTimeInMills(x) == -10000</code>. </pre> * <p> Note that this method uses the {@link #addTo(Calendar)} method, which may work incorectly with {@link Duration} objects with very large values in its fields. See the {@link #addTo(Calendar)} method for details. * @param startInstant The length of a month/year varies. The <code>startInstant</code> is used to disambiguate this variance. Specifically, this method returns the difference between <code>startInstant</code> and <code>startInstant+duration</code> * @return milliseconds between <code>startInstant</code> and <code>startInstant</code> plus this <code>Duration</code> * @throws NullPointerException if <code>startInstant</code> parameter is null. 
public	TokenNamepublic	
long	TokenNamelong	
getTimeInMillis	TokenNameIdentifier	 get Time In Millis
(	TokenNameLPAREN	
final	TokenNamefinal	
Calendar	TokenNameIdentifier	 Calendar
startInstant	TokenNameIdentifier	 start Instant
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
)	TokenNameRPAREN	
startInstant	TokenNameIdentifier	 start Instant
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addTo	TokenNameIdentifier	 add To
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getCalendarTimeInMillis	TokenNameIdentifier	 get Calendar Time In Millis
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
)	TokenNameRPAREN	
-	TokenNameMINUS	
getCalendarTimeInMillis	TokenNameIdentifier	 get Calendar Time In Millis
(	TokenNameLPAREN	
startInstant	TokenNameIdentifier	 start Instant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Returns the length of the duration in milli-seconds.</p> * * <p>If the seconds field carries more digits than milli-second order, * those will be simply discarded (or in other words, rounded to zero.) * For example, for any <code>Date</code> value <code>x<code>,</p> * <pre> * <code>new Duration("PT10.00099S").getTimeInMills(x) == 10000</code>. * <code>new Duration("-PT10.00099S").getTimeInMills(x) == -10000</code>. * </pre> * * <p> * Note that this method uses the {@link #addTo(Date)} method, * which may work incorectly with {@link Duration} objects with * very large values in its fields. See the {@link #addTo(Date)} * method for details. * * @param startInstant * The length of a month/year varies. The <code>startInstant</code> is * used to disambiguate this variance. Specifically, this method * returns the difference between <code>startInstant</code> and * <code>startInstant+duration</code>. * * @throws NullPointerException * If the startInstant parameter is null. * * @return milliseconds between <code>startInstant</code> and * <code>startInstant</code> plus this <code>Duration</code> * * @see #getTimeInMillis(Calendar) */	TokenNameCOMMENT_JAVADOC	 <p>Returns the length of the duration in milli-seconds.</p> * <p>If the seconds field carries more digits than milli-second order, those will be simply discarded (or in other words, rounded to zero.) For example, for any <code>Date</code> value <code>x<code>,</p> <pre> <code>new Duration("PT10.00099S").getTimeInMills(x) == 10000</code>. <code>new Duration("-PT10.00099S").getTimeInMills(x) == -10000</code>. </pre> * <p> Note that this method uses the {@link #addTo(Date)} method, which may work incorectly with {@link Duration} objects with very large values in its fields. See the {@link #addTo(Date)} method for details. * @param startInstant The length of a month/year varies. The <code>startInstant</code> is used to disambiguate this variance. Specifically, this method returns the difference between <code>startInstant</code> and <code>startInstant+duration</code>. * @throws NullPointerException If the startInstant parameter is null. * @return milliseconds between <code>startInstant</code> and <code>startInstant</code> plus this <code>Duration</code> * @see #getTimeInMillis(Calendar) 
public	TokenNamepublic	
long	TokenNamelong	
getTimeInMillis	TokenNameIdentifier	 get Time In Millis
(	TokenNameLPAREN	
final	TokenNamefinal	
Date	TokenNameIdentifier	 Date
startInstant	TokenNameIdentifier	 start Instant
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
new	TokenNamenew	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
startInstant	TokenNameIdentifier	 start Instant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
addTo	TokenNameIdentifier	 add To
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getCalendarTimeInMillis	TokenNameIdentifier	 get Calendar Time In Millis
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
)	TokenNameRPAREN	
-	TokenNameMINUS	
startInstant	TokenNameIdentifier	 start Instant
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Returns an equivalent but "normalized" duration value. 	TokenNameCOMMENT_LINE	* Returns an equivalent but "normalized" duration value. 
// * 	TokenNameCOMMENT_LINE	* 
// * Intuitively, the normalization moves YEARS into 	TokenNameCOMMENT_LINE	* Intuitively, the normalization moves YEARS into 
// * MONTHS (by x12) and moves DAYS, HOURS, and MINUTES fields 	TokenNameCOMMENT_LINE	* MONTHS (by x12) and moves DAYS, HOURS, and MINUTES fields 
// * into SECONDS (by x86400, x3600, and x60 respectively.) 	TokenNameCOMMENT_LINE	* into SECONDS (by x86400, x3600, and x60 respectively.) 
// * 	TokenNameCOMMENT_LINE	* 
// * 	TokenNameCOMMENT_LINE	* 
// * Formally, this method satisfies the following conditions: 	TokenNameCOMMENT_LINE	* Formally, this method satisfies the following conditions: 
// * <ul> 	TokenNameCOMMENT_LINE	* <ul> 
// * <li>x.normalize().equals(x) 	TokenNameCOMMENT_LINE	* <li>x.normalize().equals(x) 
// * <li>!x.normalize().isSet(Duration.YEARS) 	TokenNameCOMMENT_LINE	* <li>!x.normalize().isSet(Duration.YEARS) 
// * <li>!x.normalize().isSet(Duration.DAYS) 	TokenNameCOMMENT_LINE	* <li>!x.normalize().isSet(Duration.DAYS) 
// * <li>!x.normalize().isSet(Duration.HOURS) 	TokenNameCOMMENT_LINE	* <li>!x.normalize().isSet(Duration.HOURS) 
// * <li>!x.normalize().isSet(Duration.MINUTES) 	TokenNameCOMMENT_LINE	* <li>!x.normalize().isSet(Duration.MINUTES) 
// * </ul> 	TokenNameCOMMENT_LINE	* </ul> 
// * 	TokenNameCOMMENT_LINE	* 
// * @return 	TokenNameCOMMENT_LINE	* @return 
// * always return a non-null valid value. 	TokenNameCOMMENT_LINE	* always return a non-null valid value. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public Duration normalize() { 	TokenNameCOMMENT_LINE	public Duration normalize() { 
// return null; 	TokenNameCOMMENT_LINE	return null; 
// } 	TokenNameCOMMENT_LINE	} 
/** * <p>Converts the years and months fields into the days field * by using a specific time instant as the reference point.</p> * * <p>For example, duration of one month normalizes to 31 days * given the start time instance "July 8th 2003, 17:40:32".</p> * * <p>Formally, the computation is done as follows:</p> * <ol> * <li>The given Calendar object is cloned. * <li>The years, months and days fields will be added to * the {@link Calendar} object * by using the {@link Calendar#add(int,int)} method. * <li>The difference between two Calendars are computed in terms of days. * <li>The computed days, along with the hours, minutes and seconds * fields of this duration object is used to construct a new * Duration object. * </ol> * * <p>Note that since the Calendar class uses <code>int</code> to * hold the value of year and month, this method may produce * an unexpected result if this duration object holds * a very large value in the years or months fields.</p> * * @param startTimeInstant <code>Calendar</code> reference point. * * @return <code>Duration</code> of years and months of this <code>Duration</code> as days. * * @throws NullPointerException If the startTimeInstant parameter is null. */	TokenNameCOMMENT_JAVADOC	 <p>Converts the years and months fields into the days field by using a specific time instant as the reference point.</p> * <p>For example, duration of one month normalizes to 31 days given the start time instance "July 8th 2003, 17:40:32".</p> * <p>Formally, the computation is done as follows:</p> <ol> <li>The given Calendar object is cloned. <li>The years, months and days fields will be added to the {@link Calendar} object by using the {@link Calendar#add(int,int)} method. <li>The difference between two Calendars are computed in terms of days. <li>The computed days, along with the hours, minutes and seconds fields of this duration object is used to construct a new Duration object. </ol> * <p>Note that since the Calendar class uses <code>int</code> to hold the value of year and month, this method may produce an unexpected result if this duration object holds a very large value in the years or months fields.</p> * @param startTimeInstant <code>Calendar</code> reference point. * @return <code>Duration</code> of years and months of this <code>Duration</code> as days. * @throws NullPointerException If the startTimeInstant parameter is null. 
public	TokenNamepublic	
Duration	TokenNameIdentifier	 Duration
normalizeWith	TokenNameIdentifier	 normalize With
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
startTimeInstant	TokenNameIdentifier	 start Time Instant
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
)	TokenNameRPAREN	
startTimeInstant	TokenNameIdentifier	 start Time Instant
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// using int may cause overflow, but 	TokenNameCOMMENT_LINE	using int may cause overflow, but 
// Calendar internally treats value as int anyways. 	TokenNameCOMMENT_LINE	Calendar internally treats value as int anyways. 
c	TokenNameIdentifier	 c
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
getYears	TokenNameIdentifier	 get Years
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
signum	TokenNameIdentifier	 signum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
,	TokenNameCOMMA	
getMonths	TokenNameIdentifier	 get Months
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
signum	TokenNameIdentifier	 signum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
,	TokenNameCOMMA	
getDays	TokenNameIdentifier	 get Days
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
signum	TokenNameIdentifier	 signum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// obtain the difference in terms of days 	TokenNameCOMMENT_LINE	obtain the difference in terms of days 
long	TokenNamelong	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
getCalendarTimeInMillis	TokenNameIdentifier	 get Calendar Time In Millis
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
-	TokenNameMINUS	
getCalendarTimeInMillis	TokenNameIdentifier	 get Calendar Time In Millis
(	TokenNameLPAREN	
startTimeInstant	TokenNameIdentifier	 start Time Instant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
days	TokenNameIdentifier	 days
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
1000L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
60L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
60L	TokenNameLongLiteral	
*	TokenNameMULTIPLY	
24L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DurationImpl	TokenNameIdentifier	 Duration Impl
(	TokenNameLPAREN	
days	TokenNameIdentifier	 days
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
days	TokenNameIdentifier	 days
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
HOURS	TokenNameIdentifier	 HOURS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MINUTES	TokenNameIdentifier	 MINUTES
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
BigDecimal	TokenNameIdentifier	 Big Decimal
)	TokenNameRPAREN	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Computes a new duration whose value is <code>factor</code> times * longer than the value of this duration.</p> * * <p>This method is provided for the convenience. * It is functionally equivalent to the following code:</p> * <pre> * multiply(new BigDecimal(String.valueOf(factor))) * </pre> * * @param factor Factor times longer of new <code>Duration</code> to create. * * @return New <code>Duration</code> that is <code>factor</code>times longer than this <code>Duration</code>. * * @see #multiply(BigDecimal) */	TokenNameCOMMENT_JAVADOC	 <p>Computes a new duration whose value is <code>factor</code> times longer than the value of this duration.</p> * <p>This method is provided for the convenience. It is functionally equivalent to the following code:</p> <pre> multiply(new BigDecimal(String.valueOf(factor))) </pre> * @param factor Factor times longer of new <code>Duration</code> to create. * @return New <code>Duration</code> that is <code>factor</code>times longer than this <code>Duration</code>. * @see #multiply(BigDecimal) 
public	TokenNamepublic	
Duration	TokenNameIdentifier	 Duration
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
int	TokenNameint	
factor	TokenNameIdentifier	 factor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
factor	TokenNameIdentifier	 factor
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Computes a new duration whose value is <code>factor</code> times * longer than the value of this duration. * * <p> * For example, * <pre> * "P1M" (1 month) * "12" = "P12M" (12 months) * "PT1M" (1 min) * "0.3" = "PT18S" (18 seconds) * "P1M" (1 month) * "1.5" = IllegalStateException * </pre> * * <p> * Since the {@link Duration} class is immutable, this method * doesn't change the value of this object. It simply computes * a new Duration object and returns it. * * <p> * The operation will be performed field by field with the precision * of {@link BigDecimal}. Since all the fields except seconds are * restricted to hold integers, * any fraction produced by the computation will be * carried down toward the next lower unit. For example, * if you multiply "P1D" (1 day) with "0.5", then it will be 0.5 day, * which will be carried down to "PT12H" (12 hours). * When fractions of month cannot be meaningfully carried down * to days, or year to months, this will cause an * {@link IllegalStateException} to be thrown. * For example if you multiple one month by 0.5.</p> * * <p> * To avoid {@link IllegalStateException}, use * the {@link #normalizeWith(Calendar)} method to remove the years * and months fields. * * @param factor to multiply by * * @return * returns a non-null valid {@link Duration} object * * @throws IllegalStateException if operation produces fraction in * the months field. * * @throws NullPointerException if the <code>factor</code> parameter is * <code>null</code>. * */	TokenNameCOMMENT_JAVADOC	 Computes a new duration whose value is <code>factor</code> times longer than the value of this duration. * <p> For example, <pre> "P1M" (1 month) "12" = "P12M" (12 months) "PT1M" (1 min) "0.3" = "PT18S" (18 seconds) "P1M" (1 month) "1.5" = IllegalStateException </pre> * <p> Since the {@link Duration} class is immutable, this method doesn't change the value of this object. It simply computes a new Duration object and returns it. * <p> The operation will be performed field by field with the precision of {@link BigDecimal}. Since all the fields except seconds are restricted to hold integers, any fraction produced by the computation will be carried down toward the next lower unit. For example, if you multiply "P1D" (1 day) with "0.5", then it will be 0.5 day, which will be carried down to "PT12H" (12 hours). When fractions of month cannot be meaningfully carried down to days, or year to months, this will cause an {@link IllegalStateException} to be thrown. For example if you multiple one month by 0.5.</p> * <p> To avoid {@link IllegalStateException}, use the {@link #normalizeWith(Calendar)} method to remove the years and months fields. * @param factor to multiply by * @return returns a non-null valid {@link Duration} object * @throws IllegalStateException if operation produces fraction in the months field. * @throws NullPointerException if the <code>factor</code> parameter is <code>null</code>. 
public	TokenNamepublic	
Duration	TokenNameIdentifier	 Duration
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
BigDecimal	TokenNameIdentifier	 Big Decimal
factor	TokenNameIdentifier	 factor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BigDecimal	TokenNameIdentifier	 Big Decimal
carry	TokenNameIdentifier	 carry
=	TokenNameEQUAL	
ZERO	TokenNameIdentifier	 ZERO
;	TokenNameSEMICOLON	
int	TokenNameint	
factorSign	TokenNameIdentifier	 factor Sign
=	TokenNameEQUAL	
factor	TokenNameIdentifier	 factor
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factor	TokenNameIdentifier	 factor
=	TokenNameEQUAL	
factor	TokenNameIdentifier	 factor
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BigDecimal	TokenNameIdentifier	 Big Decimal
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BigDecimal	TokenNameIdentifier	 Big Decimal
bd	TokenNameIdentifier	 bd
=	TokenNameEQUAL	
getFieldAsBigDecimal	TokenNameIdentifier	 get Field As Big Decimal
(	TokenNameLPAREN	
FIELDS	TokenNameIdentifier	 FIELDS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bd	TokenNameIdentifier	 bd
=	TokenNameEQUAL	
bd	TokenNameIdentifier	 bd
.	TokenNameDOT	
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
factor	TokenNameIdentifier	 factor
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
carry	TokenNameIdentifier	 carry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bd	TokenNameIdentifier	 bd
.	TokenNameDOT	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
ROUND_DOWN	TokenNameIdentifier	 ROUND  DOWN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bd	TokenNameIdentifier	 bd
=	TokenNameEQUAL	
bd	TokenNameIdentifier	 bd
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bd	TokenNameIdentifier	 bd
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// illegal carry-down 	TokenNameCOMMENT_LINE	illegal carry-down 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
carry	TokenNameIdentifier	 carry
=	TokenNameEQUAL	
ZERO	TokenNameIdentifier	 ZERO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
carry	TokenNameIdentifier	 carry
=	TokenNameEQUAL	
bd	TokenNameIdentifier	 bd
.	TokenNameDOT	
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
FACTORS	TokenNameIdentifier	 FACTORS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
seconds	TokenNameIdentifier	 seconds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
seconds	TokenNameIdentifier	 seconds
.	TokenNameDOT	
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
factor	TokenNameIdentifier	 factor
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
carry	TokenNameIdentifier	 carry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
carry	TokenNameIdentifier	 carry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DurationImpl	TokenNameIdentifier	 Duration Impl
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
*	TokenNameMULTIPLY	
factorSign	TokenNameIdentifier	 factor Sign
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
years	TokenNameIdentifier	 years
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
months	TokenNameIdentifier	 months
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
days	TokenNameIdentifier	 days
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
hours	TokenNameIdentifier	 hours
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
minutes	TokenNameIdentifier	 minutes
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
seconds	TokenNameIdentifier	 seconds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Gets the value of the field as a {@link BigDecimal}.</p> * * <p>If the field is unset, return 0.</p> * * @param f Field to get value for. * * @return non-null valid {@link BigDecimal}. */	TokenNameCOMMENT_JAVADOC	 <p>Gets the value of the field as a {@link BigDecimal}.</p> * <p>If the field is unset, return 0.</p> * @param f Field to get value for. * @return non-null valid {@link BigDecimal}. 
private	TokenNameprivate	
BigDecimal	TokenNameIdentifier	 Big Decimal
getFieldAsBigDecimal	TokenNameIdentifier	 get Field As Big Decimal
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
==	TokenNameEQUAL_EQUAL	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
seconds	TokenNameIdentifier	 seconds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
seconds	TokenNameIdentifier	 seconds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
ZERO	TokenNameIdentifier	 ZERO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ZERO	TokenNameIdentifier	 ZERO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>BigInteger value of BigDecimal value.</p> * * @param value Value to convert. * @param canBeNull Can returned value be null? * * @return BigInteger value of BigDecimal, possibly null. */	TokenNameCOMMENT_JAVADOC	 <p>BigInteger value of BigDecimal value.</p> * @param value Value to convert. @param canBeNull Can returned value be null? * @return BigInteger value of BigDecimal, possibly null. 
private	TokenNameprivate	
static	TokenNamestatic	
BigInteger	TokenNameIdentifier	 Big Integer
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
BigDecimal	TokenNameIdentifier	 Big Decimal
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
canBeNull	TokenNameIdentifier	 can Be Null
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
canBeNull	TokenNameIdentifier	 can Be Null
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
unscaledValue	TokenNameIdentifier	 unscaled Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * 1 unit of FIELDS[i] is equivalent to <code>FACTORS[i]</code> unit of * FIELDS[i+1]. */	TokenNameCOMMENT_JAVADOC	 1 unit of FIELDS[i] is equivalent to <code>FACTORS[i]</code> unit of FIELDS[i+1]. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BigDecimal	TokenNameIdentifier	 Big Decimal
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FACTORS	TokenNameIdentifier	 FACTORS
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
/*undefined*/	TokenNameCOMMENT_BLOCK	undefined
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
60	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
60	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * <p>Computes a new duration whose value is <code>this+rhs</code>.</p> * * <p>For example,</p> * <pre> * "1 day" + "-3 days" = "-2 days" * "1 year" + "1 day" = "1 year and 1 day" * "-(1 hour,50 minutes)" + "-20 minutes" = "-(1 hours,70 minutes)" * "15 hours" + "-3 days" = "-(2 days,9 hours)" * "1 year" + "-1 day" = IllegalStateException * </pre> * * <p>Since there's no way to meaningfully subtract 1 day from 1 month, * there are cases where the operation fails in * {@link IllegalStateException}.</p> * * <p> * Formally, the computation is defined as follows.</p> * <p> * Firstly, we can assume that two {@link Duration}s to be added * are both positive without losing generality (i.e., * <code>(-X)+Y=Y-X</code>, <code>X+(-Y)=X-Y</code>, * <code>(-X)+(-Y)=-(X+Y)</code>) * * <p> * Addition of two positive {@link Duration}s are simply defined as * field by field addition where missing fields are treated as 0. * <p> * A field of the resulting {@link Duration} will be unset if and * only if respective fields of two input {@link Duration}s are unset. * <p> * Note that <code>lhs.add(rhs)</code> will be always successful if * <code>lhs.signum()*rhs.signum()!=-1</code> or both of them are * normalized.</p> * * @param rhs <code>Duration</code> to add to this <code>Duration</code> * * @return * non-null valid Duration object. * * @throws NullPointerException * If the rhs parameter is null. * @throws IllegalStateException * If two durations cannot be meaningfully added. For * example, adding negative one day to one month causes * this exception. * * * @see #subtract(Duration) */	TokenNameCOMMENT_JAVADOC	 <p>Computes a new duration whose value is <code>this+rhs</code>.</p> * <p>For example,</p> <pre> "1 day" + "-3 days" = "-2 days" "1 year" + "1 day" = "1 year and 1 day" "-(1 hour,50 minutes)" + "-20 minutes" = "-(1 hours,70 minutes)" "15 hours" + "-3 days" = "-(2 days,9 hours)" "1 year" + "-1 day" = IllegalStateException </pre> * <p>Since there's no way to meaningfully subtract 1 day from 1 month, there are cases where the operation fails in {@link IllegalStateException}.</p> * <p> Formally, the computation is defined as follows.</p> <p> Firstly, we can assume that two {@link Duration}s to be added are both positive without losing generality (i.e., <code>(-X)+Y=Y-X</code>, <code>X+(-Y)=X-Y</code>, <code>(-X)+(-Y)=-(X+Y)</code>) * <p> Addition of two positive {@link Duration}s are simply defined as field by field addition where missing fields are treated as 0. <p> A field of the resulting {@link Duration} will be unset if and only if respective fields of two input {@link Duration}s are unset. <p> Note that <code>lhs.add(rhs)</code> will be always successful if <code>lhs.signum()*rhs.signum()!=-1</code> or both of them are normalized.</p> * @param rhs <code>Duration</code> to add to this <code>Duration</code> * @return non-null valid Duration object. * @throws NullPointerException If the rhs parameter is null. @throws IllegalStateException If two durations cannot be meaningfully added. For example, adding negative one day to one month causes this exception. * @see #subtract(Duration) 
public	TokenNamepublic	
Duration	TokenNameIdentifier	 Duration
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
final	TokenNamefinal	
Duration	TokenNameIdentifier	 Duration
rhs	TokenNameIdentifier	 rhs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Duration	TokenNameIdentifier	 Duration
lhs	TokenNameIdentifier	 lhs
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
BigDecimal	TokenNameIdentifier	 Big Decimal
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
YEARS	TokenNameIdentifier	 YEARS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
YEARS	TokenNameIdentifier	 YEARS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MONTHS	TokenNameIdentifier	 MONTHS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MONTHS	TokenNameIdentifier	 MONTHS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
DAYS	TokenNameIdentifier	 DAYS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
DAYS	TokenNameIdentifier	 DAYS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
HOURS	TokenNameIdentifier	 HOURS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
HOURS	TokenNameIdentifier	 HOURS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MINUTES	TokenNameIdentifier	 MINUTES
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
)	TokenNameRPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MINUTES	TokenNameIdentifier	 MINUTES
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigDecimal	TokenNameIdentifier	 Big Decimal
)	TokenNameRPAREN	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigDecimal	TokenNameIdentifier	 Big Decimal
)	TokenNameRPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getSign	TokenNameIdentifier	 get Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// align sign 	TokenNameCOMMENT_LINE	align sign 
alignSigns	TokenNameIdentifier	 align Signs
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Y,M 	TokenNameCOMMENT_LINE	Y,M 
alignSigns	TokenNameIdentifier	 align Signs
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// D,h,m,s 	TokenNameCOMMENT_LINE	D,h,m,s 
// make sure that the sign bit is consistent across all 6 fields. 	TokenNameCOMMENT_LINE	make sure that the sign bit is consistent across all 6 fields. 
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
*	TokenNameMULTIPLY	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DurationImpl	TokenNameIdentifier	 Duration Impl
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
YEARS	TokenNameIdentifier	 YEARS
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
YEARS	TokenNameIdentifier	 YEARS
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MONTHS	TokenNameIdentifier	 MONTHS
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MONTHS	TokenNameIdentifier	 MONTHS
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
DAYS	TokenNameIdentifier	 DAYS
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
DAYS	TokenNameIdentifier	 DAYS
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
HOURS	TokenNameIdentifier	 HOURS
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
HOURS	TokenNameIdentifier	 HOURS
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toBigInteger	TokenNameIdentifier	 to Big Integer
(	TokenNameLPAREN	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MINUTES	TokenNameIdentifier	 MINUTES
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
MINUTES	TokenNameIdentifier	 MINUTES
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
DatatypeConstants	TokenNameIdentifier	 Datatype Constants
.	TokenNameDOT	
SECONDS	TokenNameIdentifier	 SECONDS
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
alignSigns	TokenNameIdentifier	 align Signs
(	TokenNameLPAREN	
BigDecimal	TokenNameIdentifier	 Big Decimal
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// align sign 	TokenNameCOMMENT_LINE	align sign 
boolean	TokenNameboolean	
touched	TokenNameIdentifier	 touched
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
// repeat until all the sign bits become consistent 	TokenNameCOMMENT_LINE	repeat until all the sign bits become consistent 
touched	TokenNameIdentifier	 touched
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// sign of the left fields 	TokenNameCOMMENT_LINE	sign of the left fields 
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
s	TokenNameIdentifier	 s
*	TokenNameMULTIPLY	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this field has different sign than its left field. 	TokenNameCOMMENT_LINE	this field has different sign than its left field. 
touched	TokenNameIdentifier	 touched
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// compute the number of unit that needs to be borrowed. 	TokenNameCOMMENT_LINE	compute the number of unit that needs to be borrowed. 
BigDecimal	TokenNameIdentifier	 Big Decimal
borrow	TokenNameIdentifier	 borrow
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
divide	TokenNameIdentifier	 divide
(	TokenNameLPAREN	
FACTORS	TokenNameIdentifier	 FACTORS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
ROUND_UP	TokenNameIdentifier	 ROUND  UP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
borrow	TokenNameIdentifier	 borrow
=	TokenNameEQUAL	
borrow	TokenNameIdentifier	 borrow
.	TokenNameDOT	
negate	TokenNameIdentifier	 negate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// update values 	TokenNameCOMMENT_LINE	update values 
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
borrow	TokenNameIdentifier	 borrow
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
borrow	TokenNameIdentifier	 borrow
.	TokenNameDOT	
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
FACTORS	TokenNameIdentifier	 FACTORS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
touched	TokenNameIdentifier	 touched
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compute <code>value*signum</code> where value==null is treated as * value==0. * @param value Value to sanitize. * @param signum 0 to sanitize to 0, > 0 to sanitize to <code>value</code>, < 0 to sanitize to negative <code>value</code>. * * @return non-null {@link BigDecimal}. */	TokenNameCOMMENT_JAVADOC	 Compute <code>value*signum</code> where value==null is treated as value==0. @param value Value to sanitize. @param signum 0 to sanitize to 0, > 0 to sanitize to <code>value</code>, < 0 to sanitize to negative <code>value</code>. * @return non-null {@link BigDecimal}. 
private	TokenNameprivate	
static	TokenNamestatic	
BigDecimal	TokenNameIdentifier	 Big Decimal
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
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
ZERO	TokenNameIdentifier	 ZERO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
signum	TokenNameIdentifier	 signum
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
negate	TokenNameIdentifier	 negate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Compute <code>value*signum</code> where <code>value==null</code> is treated as <code>value==0</code></p>. * * @param value Value to sanitize. * @param signum 0 to sanitize to 0, > 0 to sanitize to <code>value</code>, < 0 to sanitize to negative <code>value</code>. * * @return non-null {@link BigDecimal}. */	TokenNameCOMMENT_JAVADOC	 <p>Compute <code>value*signum</code> where <code>value==null</code> is treated as <code>value==0</code></p>. * @param value Value to sanitize. @param signum 0 to sanitize to 0, > 0 to sanitize to <code>value</code>, < 0 to sanitize to negative <code>value</code>. * @return non-null {@link BigDecimal}. 
static	TokenNamestatic	
BigDecimal	TokenNameIdentifier	 Big Decimal
sanitize	TokenNameIdentifier	 sanitize
(	TokenNameLPAREN	
BigDecimal	TokenNameIdentifier	 Big Decimal
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
ZERO	TokenNameIdentifier	 ZERO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
signum	TokenNameIdentifier	 signum
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
negate	TokenNameIdentifier	 negate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Computes a new duration whose value is <code>this-rhs</code>.</p> * * <p>For example:</p> * <pre> * "1 day" - "-3 days" = "4 days" * "1 year" - "1 day" = IllegalStateException * "-(1 hour,50 minutes)" - "-20 minutes" = "-(1hours,30 minutes)" * "15 hours" - "-3 days" = "3 days and 15 hours" * "1 year" - "-1 day" = "1 year and 1 day" * </pre> * * <p>Since there's no way to meaningfully subtract 1 day from 1 month, * there are cases where the operation fails in {@link IllegalStateException}.</p> * * <p>Formally the computation is defined as follows. * First, we can assume that two {@link Duration}s are both positive * without losing generality. (i.e., * <code>(-X)-Y=-(X+Y)</code>, <code>X-(-Y)=X+Y</code>, * <code>(-X)-(-Y)=-(X-Y)</code>)</p> * * <p>Then two durations are subtracted field by field. * If the sign of any non-zero field <tt>F</tt> is different from * the sign of the most significant field, * 1 (if <tt>F</tt> is negative) or -1 (otherwise) * will be borrowed from the next bigger unit of <tt>F</tt>.</p> * * <p>This process is repeated until all the non-zero fields have * the same sign.</p> * * <p>If a borrow occurs in the days field (in other words, if * the computation needs to borrow 1 or -1 month to compensate * days), then the computation fails by throwing an * {@link IllegalStateException}.</p> * * @param rhs <code>Duration</code> to substract from this <code>Duration</code>. * * @return New <code>Duration</code> created from subtracting <code>rhs</code> from this <code>Duration</code>. * * @throws IllegalStateException * If two durations cannot be meaningfully subtracted. For * example, subtracting one day from one month causes * this exception. * * @throws NullPointerException * If the rhs parameter is null. * * @see #add(Duration) */	TokenNameCOMMENT_JAVADOC	 <p>Computes a new duration whose value is <code>this-rhs</code>.</p> * <p>For example:</p> <pre> "1 day" - "-3 days" = "4 days" "1 year" - "1 day" = IllegalStateException "-(1 hour,50 minutes)" - "-20 minutes" = "-(1hours,30 minutes)" "15 hours" - "-3 days" = "3 days and 15 hours" "1 year" - "-1 day" = "1 year and 1 day" </pre> * <p>Since there's no way to meaningfully subtract 1 day from 1 month, there are cases where the operation fails in {@link IllegalStateException}.</p> * <p>Formally the computation is defined as follows. First, we can assume that two {@link Duration}s are both positive without losing generality. (i.e., <code>(-X)-Y=-(X+Y)</code>, <code>X-(-Y)=X+Y</code>, <code>(-X)-(-Y)=-(X-Y)</code>)</p> * <p>Then two durations are subtracted field by field. If the sign of any non-zero field <tt>F</tt> is different from the sign of the most significant field, 1 (if <tt>F</tt> is negative) or -1 (otherwise) will be borrowed from the next bigger unit of <tt>F</tt>.</p> * <p>This process is repeated until all the non-zero fields have the same sign.</p> * <p>If a borrow occurs in the days field (in other words, if the computation needs to borrow 1 or -1 month to compensate days), then the computation fails by throwing an {@link IllegalStateException}.</p> * @param rhs <code>Duration</code> to substract from this <code>Duration</code>. * @return New <code>Duration</code> created from subtracting <code>rhs</code> from this <code>Duration</code>. * @throws IllegalStateException If two durations cannot be meaningfully subtracted. For example, subtracting one day from one month causes this exception. * @throws NullPointerException If the rhs parameter is null. * @see #add(Duration) 
public	TokenNamepublic	
Duration	TokenNameIdentifier	 Duration
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
final	TokenNamefinal	
Duration	TokenNameIdentifier	 Duration
rhs	TokenNameIdentifier	 rhs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
negate	TokenNameIdentifier	 negate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new {@link Duration} object whose * value is <code>-this</code>. * * <p> * Since the {@link Duration} class is immutable, this method * doesn't change the value of this object. It simply computes * a new Duration object and returns it. * * @return * always return a non-null valid {@link Duration} object. */	TokenNameCOMMENT_JAVADOC	 Returns a new {@link Duration} object whose value is <code>-this</code>. * <p> Since the {@link Duration} class is immutable, this method doesn't change the value of this object. It simply computes a new Duration object and returns it. * @return always return a non-null valid {@link Duration} object. 
public	TokenNamepublic	
Duration	TokenNameIdentifier	 Duration
negate	TokenNameIdentifier	 negate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DurationImpl	TokenNameIdentifier	 Duration Impl
(	TokenNameLPAREN	
signum	TokenNameIdentifier	 signum
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
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
/** * Returns the sign of this duration in -1,0, or 1. * * @return * -1 if this duration is negative, 0 if the duration is zero, * and 1 if the duration is postive. */	TokenNameCOMMENT_JAVADOC	 Returns the sign of this duration in -1,0, or 1. * @return -1 if this duration is negative, 0 if the duration is zero, and 1 if the duration is postive. 
public	TokenNamepublic	
int	TokenNameint	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
signum	TokenNameIdentifier	 signum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds this duration to a {@link Calendar} object. * * <p> * Calls {@link java.util.Calendar#add(int,int)} in the * order of YEARS, MONTHS, DAYS, HOURS, MINUTES, SECONDS, and MILLISECONDS * if those fields are present. Because the {@link Calendar} class * uses int to hold values, there are cases where this method * won't work correctly (for example if values of fields * exceed the range of int.) * </p> * * <p> * Also, since this duration class is a Gregorian duration, this * method will not work correctly if the given {@link Calendar} * object is based on some other calendar systems. * </p> * * <p> * Any fractional parts of this {@link Duration} object * beyond milliseconds will be simply ignored. For example, if * this duration is "P1.23456S", then 1 is added to SECONDS, * 234 is added to MILLISECONDS, and the rest will be unused. * </p> * * <p> * Note that because {@link Calendar#add(int, int)} is using * <tt>int</tt>, {@link Duration} with values beyond the * range of <tt>int</tt> in its fields * will cause overflow/underflow to the given {@link Calendar}. * {@link XMLGregorianCalendar#add(Duration)} provides the same * basic operation as this method while avoiding * the overflow/underflow issues. * * @param calendar * A calendar object whose value will be modified. * @throws NullPointerException * if the calendar parameter is null. */	TokenNameCOMMENT_JAVADOC	 Adds this duration to a {@link Calendar} object. * <p> Calls {@link java.util.Calendar#add(int,int)} in the order of YEARS, MONTHS, DAYS, HOURS, MINUTES, SECONDS, and MILLISECONDS if those fields are present. Because the {@link Calendar} class uses int to hold values, there are cases where this method won't work correctly (for example if values of fields exceed the range of int.) </p> * <p> Also, since this duration class is a Gregorian duration, this method will not work correctly if the given {@link Calendar} object is based on some other calendar systems. </p> * <p> Any fractional parts of this {@link Duration} object beyond milliseconds will be simply ignored. For example, if this duration is "P1.23456S", then 1 is added to SECONDS, 234 is added to MILLISECONDS, and the rest will be unused. </p> * <p> Note that because {@link Calendar#add(int, int)} is using <tt>int</tt>, {@link Duration} with values beyond the range of <tt>int</tt> in its fields will cause overflow/underflow to the given {@link Calendar}. {@link XMLGregorianCalendar#add(Duration)} provides the same basic operation as this method while avoiding the overflow/underflow issues. * @param calendar A calendar object whose value will be modified. @throws NullPointerException if the calendar parameter is null. 
public	TokenNamepublic	
void	TokenNamevoid	
addTo	TokenNameIdentifier	 add To
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
calendar	TokenNameIdentifier	 calendar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
getYears	TokenNameIdentifier	 get Years
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
signum	TokenNameIdentifier	 signum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
,	TokenNameCOMMA	
getMonths	TokenNameIdentifier	 get Months
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
signum	TokenNameIdentifier	 signum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
,	TokenNameCOMMA	
getDays	TokenNameIdentifier	 get Days
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
signum	TokenNameIdentifier	 signum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR	TokenNameIdentifier	 HOUR
,	TokenNameCOMMA	
getHours	TokenNameIdentifier	 get Hours
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
signum	TokenNameIdentifier	 signum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
getMinutes	TokenNameIdentifier	 get Minutes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
signum	TokenNameIdentifier	 signum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
getSeconds	TokenNameIdentifier	 get Seconds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
signum	TokenNameIdentifier	 signum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
seconds	TokenNameIdentifier	 seconds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BigDecimal	TokenNameIdentifier	 Big Decimal
fraction	TokenNameIdentifier	 fraction
=	TokenNameEQUAL	
seconds	TokenNameIdentifier	 seconds
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
seconds	TokenNameIdentifier	 seconds
.	TokenNameDOT	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
ROUND_DOWN	TokenNameIdentifier	 ROUND  DOWN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
millisec	TokenNameIdentifier	 millisec
=	TokenNameEQUAL	
fraction	TokenNameIdentifier	 fraction
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
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
millisec	TokenNameIdentifier	 millisec
*	TokenNameMULTIPLY	
signum	TokenNameIdentifier	 signum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds this duration to a {@link Date} object. * * <p> * The given date is first converted into * a {@link java.util.GregorianCalendar}, then the duration * is added exactly like the {@link #addTo(Calendar)} method. * * <p> * The updated time instant is then converted back into a * {@link Date} object and used to update the given {@link Date} object. * * <p> * This somewhat redundant computation is necessary to unambiguously * determine the duration of months and years. * * @param date * A date object whose value will be modified. * @throws NullPointerException * if the date parameter is null. */	TokenNameCOMMENT_JAVADOC	 Adds this duration to a {@link Date} object. * <p> The given date is first converted into a {@link java.util.GregorianCalendar}, then the duration is added exactly like the {@link #addTo(Calendar)} method. * <p> The updated time instant is then converted back into a {@link Date} object and used to update the given {@link Date} object. * <p> This somewhat redundant computation is necessary to unambiguously determine the duration of months and years. * @param date A date object whose value will be modified. @throws NullPointerException if the date parameter is null. 
public	TokenNamepublic	
void	TokenNamevoid	
addTo	TokenNameIdentifier	 add To
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
new	TokenNamenew	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this will throw NPE if date==null 	TokenNameCOMMENT_LINE	this will throw NPE if date==null 
this	TokenNamethis	
.	TokenNameDOT	
addTo	TokenNameIdentifier	 add To
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
getCalendarTimeInMillis	TokenNameIdentifier	 get Calendar Time In Millis
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calls the {@link Calendar#getTimeInMillis} method. * Prior to JDK1.4, this method was protected and therefore * cannot be invoked directly. * * In future, this should be replaced by * <code>cal.getTimeInMillis()</code> */	TokenNameCOMMENT_JAVADOC	 Calls the {@link Calendar#getTimeInMillis} method. Prior to JDK1.4, this method was protected and therefore cannot be invoked directly. * In future, this should be replaced by <code>cal.getTimeInMillis()</code> 
private	TokenNameprivate	
static	TokenNamestatic	
long	TokenNamelong	
getCalendarTimeInMillis	TokenNameIdentifier	 get Calendar Time In Millis
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes {@link Duration} as a lexical representation * for maximum future compatibility. * * @return * An object that encapsulates the string * returned by <code>this.toString()</code>. */	TokenNameCOMMENT_JAVADOC	 Writes {@link Duration} as a lexical representation for maximum future compatibility. * @return An object that encapsulates the string returned by <code>this.toString()</code>. 
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
SerializedDuration	TokenNameIdentifier	 Serialized Duration
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
