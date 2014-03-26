/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Category	TokenNameIdentifier	 Category
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Level	TokenNameIdentifier	 Level
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
MDC	TokenNameIdentifier	 MDC
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
NDC	TokenNameIdentifier	 NDC
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Priority	TokenNameIdentifier	 Priority
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
Loader	TokenNameIdentifier	 Loader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LogLog	TokenNameIdentifier	 Log Log
;	TokenNameSEMICOLON	
// Contributors: Nelson Minar <nelson@monkey.org> 	TokenNameCOMMENT_LINE	Contributors: Nelson Minar <nelson@monkey.org> 
// Wolf Siberski 	TokenNameCOMMENT_LINE	Wolf Siberski 
// Anders Kristensen <akristensen@dynamicsoft.com> 	TokenNameCOMMENT_LINE	Anders Kristensen <akristensen@dynamicsoft.com> 
/** The internal representation of logging events. When an affirmative decision is made to log then a <code>LoggingEvent</code> instance is created. This instance is passed around to the different log4j components. <p>This class is of concern to those wishing to extend log4j. @author Ceki G&uuml;lc&uuml; @author James P. Cakalic @since 0.8.2 */	TokenNameCOMMENT_JAVADOC	 The internal representation of logging events. When an affirmative decision is made to log then a <code>LoggingEvent</code> instance is created. This instance is passed around to the different log4j components. <p>This class is of concern to those wishing to extend log4j. @author Ceki G&uuml;lc&uuml; @author James P. Cakalic @since 0.8.2 
public	TokenNamepublic	
class	TokenNameclass	
LoggingEvent	TokenNameIdentifier	 Logging Event
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
long	TokenNamelong	
startTime	TokenNameIdentifier	 start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Fully qualified name of the calling category class. */	TokenNameCOMMENT_JAVADOC	 Fully qualified name of the calling category class. 
transient	TokenNametransient	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fqnOfCategoryClass	TokenNameIdentifier	 fqn Of Category Class
;	TokenNameSEMICOLON	
/** * The category of the logging event. This field is not serialized * for performance reasons. * * <p>It is set by the LoggingEvent constructor or set by a remote * entity after deserialization. * * @deprecated This field will be marked as private or be completely * removed in future releases. Please do not use it. * */	TokenNameCOMMENT_JAVADOC	 The category of the logging event. This field is not serialized for performance reasons. * <p>It is set by the LoggingEvent constructor or set by a remote entity after deserialization. * @deprecated This field will be marked as private or be completely removed in future releases. Please do not use it. 
transient	TokenNametransient	
private	TokenNameprivate	
Category	TokenNameIdentifier	 Category
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
/** * <p>The category (logger) name. * * @deprecated This field will be marked as private in future * releases. Please do not access it directly. Use the {@link * #getLoggerName} method instead. * */	TokenNameCOMMENT_JAVADOC	 <p>The category (logger) name. * @deprecated This field will be marked as private in future releases. Please do not access it directly. Use the {@link #getLoggerName} method instead. 
final	TokenNamefinal	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
categoryName	TokenNameIdentifier	 category Name
;	TokenNameSEMICOLON	
/** * Level of logging event. Level cannot be serializable because it * is a flyweight. Due to its special seralization it cannot be * declared final either. * * <p> This field should not be accessed directly. You shoud use the * {@link #getLevel} method instead. * * @deprecated This field will be marked as private in future * releases. Please do not access it directly. Use the {@link * #getLevel} method instead. * */	TokenNameCOMMENT_JAVADOC	 Level of logging event. Level cannot be serializable because it is a flyweight. Due to its special seralization it cannot be declared final either. * <p> This field should not be accessed directly. You shoud use the {@link #getLevel} method instead. * @deprecated This field will be marked as private in future releases. Please do not access it directly. Use the {@link #getLevel} method instead. 
transient	TokenNametransient	
public	TokenNamepublic	
Priority	TokenNameIdentifier	 Priority
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
/** The nested diagnostic context (NDC) of logging event. */	TokenNameCOMMENT_JAVADOC	 The nested diagnostic context (NDC) of logging event. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
ndc	TokenNameIdentifier	 ndc
;	TokenNameSEMICOLON	
/** The mapped diagnostic context (MDC) of logging event. */	TokenNameCOMMENT_JAVADOC	 The mapped diagnostic context (MDC) of logging event. 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
mdcCopy	TokenNameIdentifier	 mdc Copy
;	TokenNameSEMICOLON	
/** Have we tried to do an NDC lookup? If we did, there is no need * to do it again. Note that its value is always false when * serialized. Thus, a receiving SocketNode will never use it's own * (incorrect) NDC. See also writeObject method. */	TokenNameCOMMENT_JAVADOC	 Have we tried to do an NDC lookup? If we did, there is no need to do it again. Note that its value is always false when serialized. Thus, a receiving SocketNode will never use it's own (incorrect) NDC. See also writeObject method. 
private	TokenNameprivate	
boolean	TokenNameboolean	
ndcLookupRequired	TokenNameIdentifier	 ndc Lookup Required
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** Have we tried to do an MDC lookup? If we did, there is no need * to do it again. Note that its value is always false when * serialized. See also the getMDC and getMDCCopy methods. */	TokenNameCOMMENT_JAVADOC	 Have we tried to do an MDC lookup? If we did, there is no need to do it again. Note that its value is always false when serialized. See also the getMDC and getMDCCopy methods. 
private	TokenNameprivate	
boolean	TokenNameboolean	
mdcCopyLookupRequired	TokenNameIdentifier	 mdc Copy Lookup Required
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** The application supplied message of logging event. */	TokenNameCOMMENT_JAVADOC	 The application supplied message of logging event. 
transient	TokenNametransient	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
/** The application supplied message rendered through the log4j objet rendering mechanism.*/	TokenNameCOMMENT_JAVADOC	 The application supplied message rendered through the log4j objet rendering mechanism.
private	TokenNameprivate	
String	TokenNameIdentifier	 String
renderedMessage	TokenNameIdentifier	 rendered Message
;	TokenNameSEMICOLON	
/** The name of thread in which this logging event was generated. */	TokenNameCOMMENT_JAVADOC	 The name of thread in which this logging event was generated. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
threadName	TokenNameIdentifier	 thread Name
;	TokenNameSEMICOLON	
/** This variable contains information about this event's throwable */	TokenNameCOMMENT_JAVADOC	 This variable contains information about this event's throwable 
private	TokenNameprivate	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
throwableInfo	TokenNameIdentifier	 throwable Info
;	TokenNameSEMICOLON	
/** The number of milliseconds elapsed from 1/1/1970 until logging event was created. */	TokenNameCOMMENT_JAVADOC	 The number of milliseconds elapsed from 1/1/1970 until logging event was created. 
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
timeStamp	TokenNameIdentifier	 time Stamp
;	TokenNameSEMICOLON	
/** Location information for the caller. */	TokenNameCOMMENT_JAVADOC	 Location information for the caller. 
private	TokenNameprivate	
LocationInfo	TokenNameIdentifier	 Location Info
locationInfo	TokenNameIdentifier	 location Info
;	TokenNameSEMICOLON	
// Serialization 	TokenNameCOMMENT_LINE	Serialization 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
868428216207166145L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
PARAM_ARRAY	TokenNameIdentifier	 PARAM  ARRAY
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TO_LEVEL	TokenNameIdentifier	 TO  LEVEL
=	TokenNameEQUAL	
"toLevel"	TokenNameStringLiteral	toLevel
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
TO_LEVEL_PARAMS	TokenNameIdentifier	 TO  LEVEL  PARAMS
=	TokenNameEQUAL	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
int	TokenNameint	
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
Hashtable	TokenNameIdentifier	 Hashtable
methodCache	TokenNameIdentifier	 method Cache
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// use a tiny table 	TokenNameCOMMENT_LINE	use a tiny table 
/** Instantiate a LoggingEvent from the supplied parameters. <p>Except {@link #timeStamp} all the other fields of <code>LoggingEvent</code> are filled when actually needed. <p> @param logger The logger generating this event. @param level The level of this event. @param message The message of this event. @param throwable The throwable of this event. */	TokenNameCOMMENT_JAVADOC	 Instantiate a LoggingEvent from the supplied parameters. <p>Except {@link #timeStamp} all the other fields of <code>LoggingEvent</code> are filled when actually needed. <p> @param logger The logger generating this event. @param level The level of this event. @param message The message of this event. @param throwable The throwable of this event. 
public	TokenNamepublic	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fqnOfCategoryClass	TokenNameIdentifier	 fqn Of Category Class
,	TokenNameCOMMA	
Category	TokenNameIdentifier	 Category
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fqnOfCategoryClass	TokenNameIdentifier	 fqn Of Category Class
=	TokenNameEQUAL	
fqnOfCategoryClass	TokenNameIdentifier	 fqn Of Category Class
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
categoryName	TokenNameIdentifier	 category Name
=	TokenNameEQUAL	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
throwable	TokenNameIdentifier	 throwable
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
throwableInfo	TokenNameIdentifier	 throwable Info
=	TokenNameEQUAL	
new	TokenNamenew	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
(	TokenNameLPAREN	
throwable	TokenNameIdentifier	 throwable
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
timeStamp	TokenNameIdentifier	 time Stamp
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Instantiate a LoggingEvent from the supplied parameters. <p>Except {@link #timeStamp} all the other fields of <code>LoggingEvent</code> are filled when actually needed. <p> @param logger The logger generating this event. @param timeStamp the timestamp of this logging event @param level The level of this event. @param message The message of this event. @param throwable The throwable of this event. */	TokenNameCOMMENT_JAVADOC	 Instantiate a LoggingEvent from the supplied parameters. <p>Except {@link #timeStamp} all the other fields of <code>LoggingEvent</code> are filled when actually needed. <p> @param logger The logger generating this event. @param timeStamp the timestamp of this logging event @param level The level of this event. @param message The message of this event. @param throwable The throwable of this event. 
public	TokenNamepublic	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fqnOfCategoryClass	TokenNameIdentifier	 fqn Of Category Class
,	TokenNameCOMMA	
Category	TokenNameIdentifier	 Category
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
long	TokenNamelong	
timeStamp	TokenNameIdentifier	 time Stamp
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fqnOfCategoryClass	TokenNameIdentifier	 fqn Of Category Class
=	TokenNameEQUAL	
fqnOfCategoryClass	TokenNameIdentifier	 fqn Of Category Class
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
categoryName	TokenNameIdentifier	 category Name
=	TokenNameEQUAL	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
throwable	TokenNameIdentifier	 throwable
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
throwableInfo	TokenNameIdentifier	 throwable Info
=	TokenNameEQUAL	
new	TokenNamenew	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
(	TokenNameLPAREN	
throwable	TokenNameIdentifier	 throwable
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timeStamp	TokenNameIdentifier	 time Stamp
=	TokenNameEQUAL	
timeStamp	TokenNameIdentifier	 time Stamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create new instance. @since 1.2.15 @param fqnOfCategoryClass Fully qualified class name of Logger implementation. @param logger The logger generating this event. @param timeStamp the timestamp of this logging event @param level The level of this event. @param message The message of this event. @param threadName thread name @param throwable The throwable of this event. @param ndc Nested diagnostic context @param info Location info @param properties MDC properties */	TokenNameCOMMENT_JAVADOC	 Create new instance. @since 1.2.15 @param fqnOfCategoryClass Fully qualified class name of Logger implementation. @param logger The logger generating this event. @param timeStamp the timestamp of this logging event @param level The level of this event. @param message The message of this event. @param threadName thread name @param throwable The throwable of this event. @param ndc Nested diagnostic context @param info Location info @param properties MDC properties 
public	TokenNamepublic	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fqnOfCategoryClass	TokenNameIdentifier	 fqn Of Category Class
,	TokenNameCOMMA	
final	TokenNamefinal	
Category	TokenNameIdentifier	 Category
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
long	TokenNamelong	
timeStamp	TokenNameIdentifier	 time Stamp
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
threadName	TokenNameIdentifier	 thread Name
,	TokenNameCOMMA	
final	TokenNamefinal	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
throwable	TokenNameIdentifier	 throwable
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ndc	TokenNameIdentifier	 ndc
,	TokenNameCOMMA	
final	TokenNamefinal	
LocationInfo	TokenNameIdentifier	 Location Info
info	TokenNameIdentifier	 info
,	TokenNameCOMMA	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
properties	TokenNameIdentifier	 properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fqnOfCategoryClass	TokenNameIdentifier	 fqn Of Category Class
=	TokenNameEQUAL	
fqnOfCategoryClass	TokenNameIdentifier	 fqn Of Category Class
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
categoryName	TokenNameIdentifier	 category Name
=	TokenNameEQUAL	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
categoryName	TokenNameIdentifier	 category Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
throwable	TokenNameIdentifier	 throwable
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
throwableInfo	TokenNameIdentifier	 throwable Info
=	TokenNameEQUAL	
throwable	TokenNameIdentifier	 throwable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timeStamp	TokenNameIdentifier	 time Stamp
=	TokenNameEQUAL	
timeStamp	TokenNameIdentifier	 time Stamp
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
threadName	TokenNameIdentifier	 thread Name
=	TokenNameEQUAL	
threadName	TokenNameIdentifier	 thread Name
;	TokenNameSEMICOLON	
ndcLookupRequired	TokenNameIdentifier	 ndc Lookup Required
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ndc	TokenNameIdentifier	 ndc
=	TokenNameEQUAL	
ndc	TokenNameIdentifier	 ndc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
locationInfo	TokenNameIdentifier	 location Info
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
;	TokenNameSEMICOLON	
mdcCopyLookupRequired	TokenNameIdentifier	 mdc Copy Lookup Required
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
properties	TokenNameIdentifier	 properties
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mdcCopy	TokenNameIdentifier	 mdc Copy
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
properties	TokenNameIdentifier	 properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Set the location information for this logging event. The collected information is cached for future use. */	TokenNameCOMMENT_JAVADOC	 Set the location information for this logging event. The collected information is cached for future use. 
public	TokenNamepublic	
LocationInfo	TokenNameIdentifier	 Location Info
getLocationInformation	TokenNameIdentifier	 get Location Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
locationInfo	TokenNameIdentifier	 location Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
locationInfo	TokenNameIdentifier	 location Info
=	TokenNameEQUAL	
new	TokenNamenew	
LocationInfo	TokenNameIdentifier	 Location Info
(	TokenNameLPAREN	
new	TokenNamenew	
Throwable	TokenNameIdentifier	 Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fqnOfCategoryClass	TokenNameIdentifier	 fqn Of Category Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
locationInfo	TokenNameIdentifier	 location Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the level of this event. Use this form instead of directly * accessing the <code>level</code> field. */	TokenNameCOMMENT_JAVADOC	 Return the level of this event. Use this form instead of directly accessing the <code>level</code> field. 
public	TokenNamepublic	
Level	TokenNameIdentifier	 Level
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the name of the logger. Use this form instead of directly * accessing the <code>categoryName</code> field. */	TokenNameCOMMENT_JAVADOC	 Return the name of the logger. Use this form instead of directly accessing the <code>categoryName</code> field. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLoggerName	TokenNameIdentifier	 get Logger Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
categoryName	TokenNameIdentifier	 category Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the logger of the event. * Use should be restricted to cloning events. * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 Gets the logger of the event. Use should be restricted to cloning events. @since 1.2.15 
public	TokenNamepublic	
Category	TokenNameIdentifier	 Category
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the message for this logging event. <p>Before serialization, the returned object is the message passed by the user to generate the logging event. After serialization, the returned value equals the String form of the message possibly after object rendering. @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Return the message for this logging event. <p>Before serialization, the returned object is the message passed by the user to generate the logging event. After serialization, the returned value equals the String form of the message possibly after object rendering. @since 1.1 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRenderedMessage	TokenNameIdentifier	 get Rendered Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method returns the NDC for this event. It will return the * correct content even if the event was generated in a different * thread or even on a different machine. The {@link NDC#get} method * should <em>never</em> be called directly. */	TokenNameCOMMENT_JAVADOC	 This method returns the NDC for this event. It will return the correct content even if the event was generated in a different thread or even on a different machine. The {@link NDC#get} method should <em>never</em> be called directly. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNDC	TokenNameIdentifier	 get NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ndcLookupRequired	TokenNameIdentifier	 ndc Lookup Required
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ndcLookupRequired	TokenNameIdentifier	 ndc Lookup Required
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
ndc	TokenNameIdentifier	 ndc
=	TokenNameEQUAL	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ndc	TokenNameIdentifier	 ndc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the the context corresponding to the <code>key</code> parameter. If there is a local MDC copy, possibly because we are in a logging server or running inside AsyncAppender, then we search for the key in MDC copy, if a value is found it is returned. Otherwise, if the search in MDC copy returns a null result, then the current thread's <code>MDC</code> is used. <p>Note that <em>both</em> the local MDC copy and the current thread's MDC are searched. */	TokenNameCOMMENT_JAVADOC	 Returns the the context corresponding to the <code>key</code> parameter. If there is a local MDC copy, possibly because we are in a logging server or running inside AsyncAppender, then we search for the key in MDC copy, if a value is found it is returned. Otherwise, if the search in MDC copy returns a null result, then the current thread's <code>MDC</code> is used. <p>Note that <em>both</em> the local MDC copy and the current thread's MDC are searched. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getMDC	TokenNameIdentifier	 get MDC
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
// Note the mdcCopy is used if it exists. Otherwise we use the MDC 	TokenNameCOMMENT_LINE	Note the mdcCopy is used if it exists. Otherwise we use the MDC 
// that is associated with the thread. 	TokenNameCOMMENT_LINE	that is associated with the thread. 
if	TokenNameif	
(	TokenNameLPAREN	
mdcCopy	TokenNameIdentifier	 mdc Copy
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
mdcCopy	TokenNameIdentifier	 mdc Copy
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Obtain a copy of this thread's MDC prior to serialization or asynchronous logging. */	TokenNameCOMMENT_JAVADOC	 Obtain a copy of this thread's MDC prior to serialization or asynchronous logging. 
public	TokenNamepublic	
void	TokenNamevoid	
getMDCCopy	TokenNameIdentifier	 get MDC Copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mdcCopyLookupRequired	TokenNameIdentifier	 mdc Copy Lookup Required
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mdcCopyLookupRequired	TokenNameIdentifier	 mdc Copy Lookup Required
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// the clone call is required for asynchronous logging. 	TokenNameCOMMENT_LINE	the clone call is required for asynchronous logging. 
// See also bug #5932. 	TokenNameCOMMENT_LINE	See also bug #5932. 
Hashtable	TokenNameIdentifier	 Hashtable
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
getContext	TokenNameIdentifier	 get Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mdcCopy	TokenNameIdentifier	 mdc Copy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRenderedMessage	TokenNameIdentifier	 get Rendered Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
renderedMessage	TokenNameIdentifier	 rendered Message
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
message	TokenNameIdentifier	 message
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
renderedMessage	TokenNameIdentifier	 rendered Message
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
LoggerRepository	TokenNameIdentifier	 Logger Repository
repository	TokenNameIdentifier	 repository
=	TokenNameEQUAL	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
instanceof	TokenNameinstanceof	
RendererSupport	TokenNameIdentifier	 Renderer Support
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RendererSupport	TokenNameIdentifier	 Renderer Support
rs	TokenNameIdentifier	 rs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RendererSupport	TokenNameIdentifier	 Renderer Support
)	TokenNameRPAREN	
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
renderedMessage	TokenNameIdentifier	 rendered Message
=	TokenNameEQUAL	
rs	TokenNameIdentifier	 rs
.	TokenNameDOT	
getRendererMap	TokenNameIdentifier	 get Renderer Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
findAndRender	TokenNameIdentifier	 find And Render
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
renderedMessage	TokenNameIdentifier	 rendered Message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
renderedMessage	TokenNameIdentifier	 rendered Message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the time when the application started, in milliseconds elapsed since 01.01.1970. */	TokenNameCOMMENT_JAVADOC	 Returns the time when the application started, in milliseconds elapsed since 01.01.1970. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
getStartTime	TokenNameIdentifier	 get Start Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startTime	TokenNameIdentifier	 start Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getThreadName	TokenNameIdentifier	 get Thread Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
threadName	TokenNameIdentifier	 thread Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
threadName	TokenNameIdentifier	 thread Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
threadName	TokenNameIdentifier	 thread Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the throwable information contained within this event. May be <code>null</code> if there is no such information. <p>Note that the {@link Throwable} object contained within a {@link ThrowableInformation} does not survive serialization. @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Returns the throwable information contained within this event. May be <code>null</code> if there is no such information. <p>Note that the {@link Throwable} object contained within a {@link ThrowableInformation} does not survive serialization. @since 1.1 
public	TokenNamepublic	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
getThrowableInformation	TokenNameIdentifier	 get Throwable Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
throwableInfo	TokenNameIdentifier	 throwable Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return this event's throwable's string[] representaion. */	TokenNameCOMMENT_JAVADOC	 Return this event's throwable's string[] representaion. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
throwableInfo	TokenNameIdentifier	 throwable Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
throwableInfo	TokenNameIdentifier	 throwable Info
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
readLevel	TokenNameIdentifier	 read Level
(	TokenNameLPAREN	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
ois	TokenNameIdentifier	 ois
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
ois	TokenNameIdentifier	 ois
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
ois	TokenNameIdentifier	 ois
.	TokenNameDOT	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
)	TokenNameRPAREN	
methodCache	TokenNameIdentifier	 method Cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
Loader	TokenNameIdentifier	 Loader
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Note that we use Class.getDeclaredMethod instead of 	TokenNameCOMMENT_LINE	Note that we use Class.getDeclaredMethod instead of 
// Class.getMethod. This assumes that the Level subclass 	TokenNameCOMMENT_LINE	Class.getMethod. This assumes that the Level subclass 
// implements the toLevel(int) method which is a 	TokenNameCOMMENT_LINE	implements the toLevel(int) method which is a 
// requirement. Actually, it does not make sense for Level 	TokenNameCOMMENT_LINE	requirement. Actually, it does not make sense for Level 
// subclasses NOT to implement this method. Also note that 	TokenNameCOMMENT_LINE	subclasses NOT to implement this method. Also note that 
// only Level can be subclassed and not Priority. 	TokenNameCOMMENT_LINE	only Level can be subclassed and not Priority. 
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getDeclaredMethod	TokenNameIdentifier	 get Declared Method
(	TokenNameLPAREN	
TO_LEVEL	TokenNameIdentifier	 TO  LEVEL
,	TokenNameCOMMA	
TO_LEVEL_PARAMS	TokenNameIdentifier	 TO  LEVEL  PARAMS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
methodCache	TokenNameIdentifier	 method Cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
||	TokenNameOR_OR	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Level deserialization failed, reverting to default."	TokenNameStringLiteral	Level deserialization failed, reverting to default.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Level deserialization failed, reverting to default."	TokenNameStringLiteral	Level deserialization failed, reverting to default.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Level deserialization failed, reverting to default."	TokenNameStringLiteral	Level deserialization failed, reverting to default.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Level deserialization failed, reverting to default."	TokenNameStringLiteral	Level deserialization failed, reverting to default.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
ois	TokenNameIdentifier	 ois
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
ois	TokenNameIdentifier	 ois
.	TokenNameDOT	
defaultReadObject	TokenNameIdentifier	 default Read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readLevel	TokenNameIdentifier	 read Level
(	TokenNameLPAREN	
ois	TokenNameIdentifier	 ois
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make sure that no location info is available to Layouts 	TokenNameCOMMENT_LINE	Make sure that no location info is available to Layouts 
if	TokenNameif	
(	TokenNameLPAREN	
locationInfo	TokenNameIdentifier	 location Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
locationInfo	TokenNameIdentifier	 location Info
=	TokenNameEQUAL	
new	TokenNamenew	
LocationInfo	TokenNameIdentifier	 Location Info
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
oos	TokenNameIdentifier	 oos
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Aside from returning the current thread name the wgetThreadName 	TokenNameCOMMENT_LINE	Aside from returning the current thread name the wgetThreadName 
// method sets the threadName variable. 	TokenNameCOMMENT_LINE	method sets the threadName variable. 
this	TokenNamethis	
.	TokenNameDOT	
getThreadName	TokenNameIdentifier	 get Thread Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This sets the renders the message in case it wasn't up to now. 	TokenNameCOMMENT_LINE	This sets the renders the message in case it wasn't up to now. 
this	TokenNamethis	
.	TokenNameDOT	
getRenderedMessage	TokenNameIdentifier	 get Rendered Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This call has a side effect of setting this.ndc and 	TokenNameCOMMENT_LINE	This call has a side effect of setting this.ndc and 
// setting ndcLookupRequired to false if not already false. 	TokenNameCOMMENT_LINE	setting ndcLookupRequired to false if not already false. 
this	TokenNamethis	
.	TokenNameDOT	
getNDC	TokenNameIdentifier	 get NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This call has a side effect of setting this.mdcCopy and 	TokenNameCOMMENT_LINE	This call has a side effect of setting this.mdcCopy and 
// setting mdcLookupRequired to false if not already false. 	TokenNameCOMMENT_LINE	setting mdcLookupRequired to false if not already false. 
this	TokenNamethis	
.	TokenNameDOT	
getMDCCopy	TokenNameIdentifier	 get MDC Copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This sets the throwable sting representation of the event throwable. 	TokenNameCOMMENT_LINE	This sets the throwable sting representation of the event throwable. 
this	TokenNamethis	
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oos	TokenNameIdentifier	 oos
.	TokenNameDOT	
defaultWriteObject	TokenNameIdentifier	 default Write Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// serialize this event's level 	TokenNameCOMMENT_LINE	serialize this event's level 
writeLevel	TokenNameIdentifier	 write Level
(	TokenNameLPAREN	
oos	TokenNameIdentifier	 oos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
writeLevel	TokenNameIdentifier	 write Level
(	TokenNameLPAREN	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
oos	TokenNameIdentifier	 oos
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
oos	TokenNameIdentifier	 oos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
level	TokenNameIdentifier	 level
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
==	TokenNameEQUAL_EQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
oos	TokenNameIdentifier	 oos
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// writing directly the Class object would be nicer, except that 	TokenNameCOMMENT_LINE	writing directly the Class object would be nicer, except that 
// serialized a Class object can not be read back by JDK 	TokenNameCOMMENT_LINE	serialized a Class object can not be read back by JDK 
// 1.1.x. We have to resort to this hack instead. 	TokenNameCOMMENT_LINE	1.1.x. We have to resort to this hack instead. 
oos	TokenNameIdentifier	 oos
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set value for MDC property. * This adds the specified MDC property to the event. * Access to the MDC is not synchronized, so this * method should only be called when it is known that * no other threads are accessing the MDC. * @since 1.2.15 * @param propName * @param propValue */	TokenNameCOMMENT_JAVADOC	 Set value for MDC property. This adds the specified MDC property to the event. Access to the MDC is not synchronized, so this method should only be called when it is known that no other threads are accessing the MDC. @since 1.2.15 @param propName @param propValue 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
propName	TokenNameIdentifier	 prop Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
propValue	TokenNameIdentifier	 prop Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mdcCopy	TokenNameIdentifier	 mdc Copy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getMDCCopy	TokenNameIdentifier	 get MDC Copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mdcCopy	TokenNameIdentifier	 mdc Copy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mdcCopy	TokenNameIdentifier	 mdc Copy
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mdcCopy	TokenNameIdentifier	 mdc Copy
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
propName	TokenNameIdentifier	 prop Name
,	TokenNameCOMMA	
propValue	TokenNameIdentifier	 prop Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a property for this event. The return value can be null. * * Equivalent to getMDC(String) in log4j 1.2. Provided * for compatibility with log4j 1.3. * * @param key property name * @return property value or null if property not set * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 Return a property for this event. The return value can be null. * Equivalent to getMDC(String) in log4j 1.2. Provided for compatibility with log4j 1.3. * @param key property name @return property value or null if property not set @since 1.2.15 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
getMDC	TokenNameIdentifier	 get MDC
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
retval	TokenNameIdentifier	 retval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check for the existence of location information without creating it * (a byproduct of calling getLocationInformation). * @return true if location information has been extracted. * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 Check for the existence of location information without creating it (a byproduct of calling getLocationInformation). @return true if location information has been extracted. @since 1.2.15 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
locationInformationExists	TokenNameIdentifier	 location Information Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
locationInfo	TokenNameIdentifier	 location Info
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Getter for the event's time stamp. The time stamp is calculated starting * from 1970-01-01 GMT. * @return timestamp * * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 Getter for the event's time stamp. The time stamp is calculated starting from 1970-01-01 GMT. @return timestamp * @since 1.2.15 
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
getTimeStamp	TokenNameIdentifier	 get Time Stamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timeStamp	TokenNameIdentifier	 time Stamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the set of the key values in the properties * for the event. * * The returned set is unmodifiable by the caller. * * Provided for compatibility with log4j 1.3 * * @return Set an unmodifiable set of the property keys. * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 Returns the set of the key values in the properties for the event. * The returned set is unmodifiable by the caller. * Provided for compatibility with log4j 1.3 * @return Set an unmodifiable set of the property keys. @since 1.2.15 
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
getPropertyKeySet	TokenNameIdentifier	 get Property Key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the set of properties * for the event. * * The returned set is unmodifiable by the caller. * * Provided for compatibility with log4j 1.3 * * @return Set an unmodifiable map of the properties. * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 Returns the set of properties for the event. * The returned set is unmodifiable by the caller. * Provided for compatibility with log4j 1.3 * @return Set an unmodifiable map of the properties. @since 1.2.15 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getMDCCopy	TokenNameIdentifier	 get MDC Copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
properties	TokenNameIdentifier	 properties
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mdcCopy	TokenNameIdentifier	 mdc Copy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
properties	TokenNameIdentifier	 properties
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
properties	TokenNameIdentifier	 properties
=	TokenNameEQUAL	
mdcCopy	TokenNameIdentifier	 mdc Copy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableMap	TokenNameIdentifier	 unmodifiable Map
(	TokenNameLPAREN	
properties	TokenNameIdentifier	 properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the fully qualified name of the calling logger sub-class/wrapper. * Provided for compatibility with log4j 1.3 * @return fully qualified class name, may be null. * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 Get the fully qualified name of the calling logger sub-class/wrapper. Provided for compatibility with log4j 1.3 @return fully qualified class name, may be null. @since 1.2.15 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFQNOfLoggerClass	TokenNameIdentifier	 get FQN Of Logger Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fqnOfCategoryClass	TokenNameIdentifier	 fqn Of Category Class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This removes the specified MDC property from the event. * Access to the MDC is not synchronized, so this * method should only be called when it is known that * no other threads are accessing the MDC. * @param propName the property name to remove * @since 1.2.16 */	TokenNameCOMMENT_JAVADOC	 This removes the specified MDC property from the event. Access to the MDC is not synchronized, so this method should only be called when it is known that no other threads are accessing the MDC. @param propName the property name to remove @since 1.2.16 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
removeProperty	TokenNameIdentifier	 remove Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propName	TokenNameIdentifier	 prop Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mdcCopy	TokenNameIdentifier	 mdc Copy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getMDCCopy	TokenNameIdentifier	 get MDC Copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mdcCopy	TokenNameIdentifier	 mdc Copy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mdcCopy	TokenNameIdentifier	 mdc Copy
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
mdcCopy	TokenNameIdentifier	 mdc Copy
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
propName	TokenNameIdentifier	 prop Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
