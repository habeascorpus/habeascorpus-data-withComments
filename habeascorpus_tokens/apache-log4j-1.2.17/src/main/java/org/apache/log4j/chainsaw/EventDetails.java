/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
chainsaw	TokenNameIdentifier	 chainsaw
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
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
/** * Represents the details of a logging event. It is intended to overcome the * problem that a LoggingEvent cannot be constructed with purely fake data. * * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a> * @version 1.0 */	TokenNameCOMMENT_JAVADOC	 Represents the details of a logging event. It is intended to overcome the problem that a LoggingEvent cannot be constructed with purely fake data. * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a> @version 1.0 
class	TokenNameclass	
EventDetails	TokenNameIdentifier	 Event Details
{	TokenNameLBRACE	
/** the time of the event **/	TokenNameCOMMENT_JAVADOC	 the time of the event *
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
mTimeStamp	TokenNameIdentifier	 m Time Stamp
;	TokenNameSEMICOLON	
/** the priority of the event **/	TokenNameCOMMENT_JAVADOC	 the priority of the event *
private	TokenNameprivate	
final	TokenNamefinal	
Priority	TokenNameIdentifier	 Priority
mPriority	TokenNameIdentifier	 m Priority
;	TokenNameSEMICOLON	
/** the category of the event **/	TokenNameCOMMENT_JAVADOC	 the category of the event *
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
mCategoryName	TokenNameIdentifier	 m Category Name
;	TokenNameSEMICOLON	
/** the NDC for the event **/	TokenNameCOMMENT_JAVADOC	 the NDC for the event *
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
mNDC	TokenNameIdentifier	 m NDC
;	TokenNameSEMICOLON	
/** the thread for the event **/	TokenNameCOMMENT_JAVADOC	 the thread for the event *
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
mThreadName	TokenNameIdentifier	 m Thread Name
;	TokenNameSEMICOLON	
/** the msg for the event **/	TokenNameCOMMENT_JAVADOC	 the msg for the event *
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
mMessage	TokenNameIdentifier	 m Message
;	TokenNameSEMICOLON	
/** the throwable details the event **/	TokenNameCOMMENT_JAVADOC	 the throwable details the event *
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mThrowableStrRep	TokenNameIdentifier	 m Throwable Str Rep
;	TokenNameSEMICOLON	
/** the location details for the event **/	TokenNameCOMMENT_JAVADOC	 the location details for the event *
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
mLocationDetails	TokenNameIdentifier	 m Location Details
;	TokenNameSEMICOLON	
/** * Creates a new <code>EventDetails</code> instance. * @param aTimeStamp a <code>long</code> value * @param aPriority a <code>Priority</code> value * @param aCategoryName a <code>String</code> value * @param aNDC a <code>String</code> value * @param aThreadName a <code>String</code> value * @param aMessage a <code>String</code> value * @param aThrowableStrRep a <code>String[]</code> value * @param aLocationDetails a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>EventDetails</code> instance. @param aTimeStamp a <code>long</code> value @param aPriority a <code>Priority</code> value @param aCategoryName a <code>String</code> value @param aNDC a <code>String</code> value @param aThreadName a <code>String</code> value @param aMessage a <code>String</code> value @param aThrowableStrRep a <code>String[]</code> value @param aLocationDetails a <code>String</code> value 
EventDetails	TokenNameIdentifier	 Event Details
(	TokenNameLPAREN	
long	TokenNamelong	
aTimeStamp	TokenNameIdentifier	 a Time Stamp
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
aPriority	TokenNameIdentifier	 a Priority
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aCategoryName	TokenNameIdentifier	 a Category Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aNDC	TokenNameIdentifier	 a NDC
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aThreadName	TokenNameIdentifier	 a Thread Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aMessage	TokenNameIdentifier	 a Message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
aThrowableStrRep	TokenNameIdentifier	 a Throwable Str Rep
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aLocationDetails	TokenNameIdentifier	 a Location Details
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mTimeStamp	TokenNameIdentifier	 m Time Stamp
=	TokenNameEQUAL	
aTimeStamp	TokenNameIdentifier	 a Time Stamp
;	TokenNameSEMICOLON	
mPriority	TokenNameIdentifier	 m Priority
=	TokenNameEQUAL	
aPriority	TokenNameIdentifier	 a Priority
;	TokenNameSEMICOLON	
mCategoryName	TokenNameIdentifier	 m Category Name
=	TokenNameEQUAL	
aCategoryName	TokenNameIdentifier	 a Category Name
;	TokenNameSEMICOLON	
mNDC	TokenNameIdentifier	 m NDC
=	TokenNameEQUAL	
aNDC	TokenNameIdentifier	 a NDC
;	TokenNameSEMICOLON	
mThreadName	TokenNameIdentifier	 m Thread Name
=	TokenNameEQUAL	
aThreadName	TokenNameIdentifier	 a Thread Name
;	TokenNameSEMICOLON	
mMessage	TokenNameIdentifier	 m Message
=	TokenNameEQUAL	
aMessage	TokenNameIdentifier	 a Message
;	TokenNameSEMICOLON	
mThrowableStrRep	TokenNameIdentifier	 m Throwable Str Rep
=	TokenNameEQUAL	
aThrowableStrRep	TokenNameIdentifier	 a Throwable Str Rep
;	TokenNameSEMICOLON	
mLocationDetails	TokenNameIdentifier	 m Location Details
=	TokenNameEQUAL	
aLocationDetails	TokenNameIdentifier	 a Location Details
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new <code>EventDetails</code> instance. * * @param aEvent a <code>LoggingEvent</code> value */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>EventDetails</code> instance. * @param aEvent a <code>LoggingEvent</code> value 
EventDetails	TokenNameIdentifier	 Event Details
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
aEvent	TokenNameIdentifier	 a Event
.	TokenNameDOT	
timeStamp	TokenNameIdentifier	 time Stamp
,	TokenNameCOMMA	
aEvent	TokenNameIdentifier	 a Event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
aEvent	TokenNameIdentifier	 a Event
.	TokenNameDOT	
getLoggerName	TokenNameIdentifier	 get Logger Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
aEvent	TokenNameIdentifier	 a Event
.	TokenNameDOT	
getNDC	TokenNameIdentifier	 get NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
aEvent	TokenNameIdentifier	 a Event
.	TokenNameDOT	
getThreadName	TokenNameIdentifier	 get Thread Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
aEvent	TokenNameIdentifier	 a Event
.	TokenNameDOT	
getRenderedMessage	TokenNameIdentifier	 get Rendered Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
aEvent	TokenNameIdentifier	 a Event
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
aEvent	TokenNameIdentifier	 a Event
.	TokenNameDOT	
getLocationInformation	TokenNameIdentifier	 get Location Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
aEvent	TokenNameIdentifier	 a Event
.	TokenNameDOT	
getLocationInformation	TokenNameIdentifier	 get Location Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fullInfo	TokenNameIdentifier	 full Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #mTimeStamp **/	TokenNameCOMMENT_JAVADOC	 @see #mTimeStamp *
long	TokenNamelong	
getTimeStamp	TokenNameIdentifier	 get Time Stamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mTimeStamp	TokenNameIdentifier	 m Time Stamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #mPriority **/	TokenNameCOMMENT_JAVADOC	 @see #mPriority *
Priority	TokenNameIdentifier	 Priority
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mPriority	TokenNameIdentifier	 m Priority
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #mCategoryName **/	TokenNameCOMMENT_JAVADOC	 @see #mCategoryName *
String	TokenNameIdentifier	 String
getCategoryName	TokenNameIdentifier	 get Category Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mCategoryName	TokenNameIdentifier	 m Category Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #mNDC **/	TokenNameCOMMENT_JAVADOC	 @see #mNDC *
String	TokenNameIdentifier	 String
getNDC	TokenNameIdentifier	 get NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mNDC	TokenNameIdentifier	 m NDC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #mThreadName **/	TokenNameCOMMENT_JAVADOC	 @see #mThreadName *
String	TokenNameIdentifier	 String
getThreadName	TokenNameIdentifier	 get Thread Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mThreadName	TokenNameIdentifier	 m Thread Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #mMessage **/	TokenNameCOMMENT_JAVADOC	 @see #mMessage *
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mMessage	TokenNameIdentifier	 m Message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #mLocationDetails **/	TokenNameCOMMENT_JAVADOC	 @see #mLocationDetails *
String	TokenNameIdentifier	 String
getLocationDetails	TokenNameIdentifier	 get Location Details
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mLocationDetails	TokenNameIdentifier	 m Location Details
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #mThrowableStrRep **/	TokenNameCOMMENT_JAVADOC	 @see #mThrowableStrRep *
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mThrowableStrRep	TokenNameIdentifier	 m Throwable Str Rep
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
