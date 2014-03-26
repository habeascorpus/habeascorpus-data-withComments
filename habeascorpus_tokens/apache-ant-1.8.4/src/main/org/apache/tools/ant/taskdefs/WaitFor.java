/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
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
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
Condition	TokenNameIdentifier	 Condition
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
ConditionBase	TokenNameIdentifier	 Condition Base
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
;	TokenNameSEMICOLON	
/** * Wait for an external event to occur. * * Wait for an external process to start or to complete some * task. This is useful with the <code>parallel</code> task to * synchronize the execution of tests with server startup. * * The following attributes can be specified on a waitfor task: * <ul> * <li>maxwait - maximum length of time to wait before giving up</li> * <li>maxwaitunit - The unit to be used to interpret maxwait attribute</li> * <li>checkevery - amount of time to sleep between each check</li> * <li>checkeveryunit - The unit to be used to interpret checkevery attribute</li> * <li>timeoutproperty - name of a property to set if maxwait has been exceeded.</li> * </ul> * * The maxwaitunit and checkeveryunit are allowed to have the following values: * millisecond, second, minute, hour, day and week. The default is millisecond. * * For programmatic use/subclassing, there are two methods that may be overrridden, * <code>processSuccess</code> and <code>processTimeout</code> * @since Ant 1.5 * * @ant.task category="control" */	TokenNameCOMMENT_JAVADOC	 Wait for an external event to occur. * Wait for an external process to start or to complete some task. This is useful with the <code>parallel</code> task to synchronize the execution of tests with server startup. * The following attributes can be specified on a waitfor task: <ul> <li>maxwait - maximum length of time to wait before giving up</li> <li>maxwaitunit - The unit to be used to interpret maxwait attribute</li> <li>checkevery - amount of time to sleep between each check</li> <li>checkeveryunit - The unit to be used to interpret checkevery attribute</li> <li>timeoutproperty - name of a property to set if maxwait has been exceeded.</li> </ul> * The maxwaitunit and checkeveryunit are allowed to have the following values: millisecond, second, minute, hour, day and week. The default is millisecond. * For programmatic use/subclassing, there are two methods that may be overrridden, <code>processSuccess</code> and <code>processTimeout</code> @since Ant 1.5 * @ant.task category="control" 
public	TokenNamepublic	
class	TokenNameclass	
WaitFor	TokenNameIdentifier	 Wait For
extends	TokenNameextends	
ConditionBase	TokenNameIdentifier	 Condition Base
{	TokenNameLBRACE	
/** a millisecond */	TokenNameCOMMENT_JAVADOC	 a millisecond 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
ONE_MILLISECOND	TokenNameIdentifier	 ONE  MILLISECOND
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** a second in milliseconds */	TokenNameCOMMENT_JAVADOC	 a second in milliseconds 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
ONE_SECOND	TokenNameIdentifier	 ONE  SECOND
=	TokenNameEQUAL	
1000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** a minute in milliseconds */	TokenNameCOMMENT_JAVADOC	 a minute in milliseconds 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
ONE_MINUTE	TokenNameIdentifier	 ONE  MINUTE
=	TokenNameEQUAL	
ONE_SECOND	TokenNameIdentifier	 ONE  SECOND
*	TokenNameMULTIPLY	
60L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** an hour in milliseconds */	TokenNameCOMMENT_JAVADOC	 an hour in milliseconds 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
ONE_HOUR	TokenNameIdentifier	 ONE  HOUR
=	TokenNameEQUAL	
ONE_MINUTE	TokenNameIdentifier	 ONE  MINUTE
*	TokenNameMULTIPLY	
60L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** a day in milliseconds */	TokenNameCOMMENT_JAVADOC	 a day in milliseconds 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
ONE_DAY	TokenNameIdentifier	 ONE  DAY
=	TokenNameEQUAL	
ONE_HOUR	TokenNameIdentifier	 ONE  HOUR
*	TokenNameMULTIPLY	
24L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** a week in milliseconds */	TokenNameCOMMENT_JAVADOC	 a week in milliseconds 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
ONE_WEEK	TokenNameIdentifier	 ONE  WEEK
=	TokenNameEQUAL	
ONE_DAY	TokenNameIdentifier	 ONE  DAY
*	TokenNameMULTIPLY	
7L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** default wait time */	TokenNameCOMMENT_JAVADOC	 default wait time 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
DEFAULT_MAX_WAIT_MILLIS	TokenNameIdentifier	 DEFAULT  MAX  WAIT  MILLIS
=	TokenNameEQUAL	
ONE_MINUTE	TokenNameIdentifier	 ONE  MINUTE
*	TokenNameMULTIPLY	
3L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** default check time */	TokenNameCOMMENT_JAVADOC	 default check time 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
DEFAULT_CHECK_MILLIS	TokenNameIdentifier	 DEFAULT  CHECK  MILLIS
=	TokenNameEQUAL	
500L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** default max wait time in the current unit*/	TokenNameCOMMENT_JAVADOC	 default max wait time in the current unit
private	TokenNameprivate	
long	TokenNamelong	
maxWait	TokenNameIdentifier	 max Wait
=	TokenNameEQUAL	
DEFAULT_MAX_WAIT_MILLIS	TokenNameIdentifier	 DEFAULT  MAX  WAIT  MILLIS
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
maxWaitMultiplier	TokenNameIdentifier	 max Wait Multiplier
=	TokenNameEQUAL	
ONE_MILLISECOND	TokenNameIdentifier	 ONE  MILLISECOND
;	TokenNameSEMICOLON	
/** * check time in the current unit */	TokenNameCOMMENT_JAVADOC	 check time in the current unit 
private	TokenNameprivate	
long	TokenNamelong	
checkEvery	TokenNameIdentifier	 check Every
=	TokenNameEQUAL	
DEFAULT_CHECK_MILLIS	TokenNameIdentifier	 DEFAULT  CHECK  MILLIS
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
checkEveryMultiplier	TokenNameIdentifier	 check Every Multiplier
=	TokenNameEQUAL	
ONE_MILLISECOND	TokenNameIdentifier	 ONE  MILLISECOND
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
timeoutProperty	TokenNameIdentifier	 timeout Property
;	TokenNameSEMICOLON	
/** * Constructor, names this task "waitfor". */	TokenNameCOMMENT_JAVADOC	 Constructor, names this task "waitfor". 
public	TokenNamepublic	
WaitFor	TokenNameIdentifier	 Wait For
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"waitfor"	TokenNameStringLiteral	waitfor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor that takes the name of the task in the task name. * * @param taskName the name of the task. * @since Ant 1.8 */	TokenNameCOMMENT_JAVADOC	 Constructor that takes the name of the task in the task name. * @param taskName the name of the task. @since Ant 1.8 
public	TokenNamepublic	
WaitFor	TokenNameIdentifier	 Wait For
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
taskName	TokenNameIdentifier	 task Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
taskName	TokenNameIdentifier	 task Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the maximum length of time to wait. * @param time a <code>long</code> value */	TokenNameCOMMENT_JAVADOC	 Set the maximum length of time to wait. @param time a <code>long</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxWait	TokenNameIdentifier	 set Max Wait
(	TokenNameLPAREN	
long	TokenNamelong	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxWait	TokenNameIdentifier	 max Wait
=	TokenNameEQUAL	
time	TokenNameIdentifier	 time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the max wait time unit * @param unit an enumerated <code>Unit</code> value */	TokenNameCOMMENT_JAVADOC	 Set the max wait time unit @param unit an enumerated <code>Unit</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxWaitUnit	TokenNameIdentifier	 set Max Wait Unit
(	TokenNameLPAREN	
Unit	TokenNameIdentifier	 Unit
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxWaitMultiplier	TokenNameIdentifier	 max Wait Multiplier
=	TokenNameEQUAL	
unit	TokenNameIdentifier	 unit
.	TokenNameDOT	
getMultiplier	TokenNameIdentifier	 get Multiplier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the time between each check * @param time a <code>long</code> value */	TokenNameCOMMENT_JAVADOC	 Set the time between each check @param time a <code>long</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setCheckEvery	TokenNameIdentifier	 set Check Every
(	TokenNameLPAREN	
long	TokenNamelong	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkEvery	TokenNameIdentifier	 check Every
=	TokenNameEQUAL	
time	TokenNameIdentifier	 time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the check every time unit * @param unit an enumerated <code>Unit</code> value */	TokenNameCOMMENT_JAVADOC	 Set the check every time unit @param unit an enumerated <code>Unit</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setCheckEveryUnit	TokenNameIdentifier	 set Check Every Unit
(	TokenNameLPAREN	
Unit	TokenNameIdentifier	 Unit
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkEveryMultiplier	TokenNameIdentifier	 check Every Multiplier
=	TokenNameEQUAL	
unit	TokenNameIdentifier	 unit
.	TokenNameDOT	
getMultiplier	TokenNameIdentifier	 get Multiplier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Name the property to set after a timeout. * @param p the property name */	TokenNameCOMMENT_JAVADOC	 Name the property to set after a timeout. @param p the property name 
public	TokenNamepublic	
void	TokenNamevoid	
setTimeoutProperty	TokenNameIdentifier	 set Timeout Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timeoutProperty	TokenNameIdentifier	 timeout Property
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check repeatedly for the specified conditions until they become * true or the timeout expires. * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Check repeatedly for the specified conditions until they become true or the timeout expires. @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
countConditions	TokenNameIdentifier	 count Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"You must not nest more than one "	TokenNameStringLiteral	You must not nest more than one 
+	TokenNamePLUS	
"condition into "	TokenNameStringLiteral	condition into 
+	TokenNamePLUS	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
countConditions	TokenNameIdentifier	 count Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"You must nest a condition into "	TokenNameStringLiteral	You must nest a condition into 
+	TokenNamePLUS	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Condition	TokenNameIdentifier	 Condition
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Condition	TokenNameIdentifier	 Condition
)	TokenNameRPAREN	
getConditions	TokenNameIdentifier	 get Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
long	TokenNamelong	
maxWaitMillis	TokenNameIdentifier	 max Wait Millis
=	TokenNameEQUAL	
calculateMaxWaitMillis	TokenNameIdentifier	 calculate Max Wait Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
checkEveryMillis	TokenNameIdentifier	 check Every Millis
=	TokenNameEQUAL	
calculateCheckEveryMillis	TokenNameIdentifier	 calculate Check Every Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
maxWaitMillis	TokenNameIdentifier	 max Wait Millis
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processSuccess	TokenNameIdentifier	 process Success
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
checkEveryMillis	TokenNameIdentifier	 check Every Millis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Task "	TokenNameStringLiteral	Task 
+	TokenNamePLUS	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" interrupted, treating as timed out."	TokenNameStringLiteral	 interrupted, treating as timed out.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
processTimeout	TokenNameIdentifier	 process Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the check wait time, in milliseconds. * @since Ant 1.8 * @return how long to wait between checks */	TokenNameCOMMENT_JAVADOC	 Get the check wait time, in milliseconds. @since Ant 1.8 @return how long to wait between checks 
public	TokenNamepublic	
long	TokenNamelong	
calculateCheckEveryMillis	TokenNameIdentifier	 calculate Check Every Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
checkEvery	TokenNameIdentifier	 check Every
*	TokenNameMULTIPLY	
checkEveryMultiplier	TokenNameIdentifier	 check Every Multiplier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the maxiumum wait time, in milliseconds. * @since Ant 1.8 * @return how long to wait before timing out */	TokenNameCOMMENT_JAVADOC	 Get the maxiumum wait time, in milliseconds. @since Ant 1.8 @return how long to wait before timing out 
public	TokenNamepublic	
long	TokenNamelong	
calculateMaxWaitMillis	TokenNameIdentifier	 calculate Max Wait Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxWait	TokenNameIdentifier	 max Wait
*	TokenNameMULTIPLY	
maxWaitMultiplier	TokenNameIdentifier	 max Wait Multiplier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Actions to be taken on a successful waitfor. * This is an override point. The base implementation does nothing. * @since Ant1.7 */	TokenNameCOMMENT_JAVADOC	 Actions to be taken on a successful waitfor. This is an override point. The base implementation does nothing. @since Ant1.7 
protected	TokenNameprotected	
void	TokenNamevoid	
processSuccess	TokenNameIdentifier	 process Success
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": condition was met"	TokenNameStringLiteral	: condition was met
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Actions to be taken on an unsuccessful wait. * This is an override point. It is where the timeout processing takes place. * The base implementation sets the timeoutproperty if there was a timeout * and the property was defined. * @since Ant1.7 */	TokenNameCOMMENT_JAVADOC	 Actions to be taken on an unsuccessful wait. This is an override point. It is where the timeout processing takes place. The base implementation sets the timeoutproperty if there was a timeout and the property was defined. @since Ant1.7 
protected	TokenNameprotected	
void	TokenNamevoid	
processTimeout	TokenNameIdentifier	 process Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": timeout"	TokenNameStringLiteral	: timeout
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
timeoutProperty	TokenNameIdentifier	 timeout Property
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
timeoutProperty	TokenNameIdentifier	 timeout Property
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The enumeration of units: * millisecond, second, minute, hour, day, week * @todo we use timestamps in many places, why not factor this out */	TokenNameCOMMENT_JAVADOC	 The enumeration of units: millisecond, second, minute, hour, day, week @todo we use timestamps in many places, why not factor this out 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Unit	TokenNameIdentifier	 Unit
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
/** millisecond string */	TokenNameCOMMENT_JAVADOC	 millisecond string 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MILLISECOND	TokenNameIdentifier	 MILLISECOND
=	TokenNameEQUAL	
"millisecond"	TokenNameStringLiteral	millisecond
;	TokenNameSEMICOLON	
/** second string */	TokenNameCOMMENT_JAVADOC	 second string 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SECOND	TokenNameIdentifier	 SECOND
=	TokenNameEQUAL	
"second"	TokenNameStringLiteral	second
;	TokenNameSEMICOLON	
/** minute string */	TokenNameCOMMENT_JAVADOC	 minute string 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MINUTE	TokenNameIdentifier	 MINUTE
=	TokenNameEQUAL	
"minute"	TokenNameStringLiteral	minute
;	TokenNameSEMICOLON	
/** hour string */	TokenNameCOMMENT_JAVADOC	 hour string 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HOUR	TokenNameIdentifier	 HOUR
=	TokenNameEQUAL	
"hour"	TokenNameStringLiteral	hour
;	TokenNameSEMICOLON	
/** day string */	TokenNameCOMMENT_JAVADOC	 day string 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DAY	TokenNameIdentifier	 DAY
=	TokenNameEQUAL	
"day"	TokenNameStringLiteral	day
;	TokenNameSEMICOLON	
/** week string */	TokenNameCOMMENT_JAVADOC	 week string 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WEEK	TokenNameIdentifier	 WEEK
=	TokenNameEQUAL	
"week"	TokenNameStringLiteral	week
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
UNITS	TokenNameIdentifier	 UNITS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
HOUR	TokenNameIdentifier	 HOUR
,	TokenNameCOMMA	
DAY	TokenNameIdentifier	 DAY
,	TokenNameCOMMA	
WEEK	TokenNameIdentifier	 WEEK
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
timeTable	TokenNameIdentifier	 time Table
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Constructor the Unit enumerated type. */	TokenNameCOMMENT_JAVADOC	 Constructor the Unit enumerated type. 
public	TokenNamepublic	
Unit	TokenNameIdentifier	 Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timeTable	TokenNameIdentifier	 time Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timeTable	TokenNameIdentifier	 time Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
ONE_SECOND	TokenNameIdentifier	 ONE  SECOND
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timeTable	TokenNameIdentifier	 time Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
ONE_MINUTE	TokenNameIdentifier	 ONE  MINUTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timeTable	TokenNameIdentifier	 time Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
HOUR	TokenNameIdentifier	 HOUR
,	TokenNameCOMMA	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
ONE_HOUR	TokenNameIdentifier	 ONE  HOUR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timeTable	TokenNameIdentifier	 time Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DAY	TokenNameIdentifier	 DAY
,	TokenNameCOMMA	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
ONE_DAY	TokenNameIdentifier	 ONE  DAY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timeTable	TokenNameIdentifier	 time Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
WEEK	TokenNameIdentifier	 WEEK
,	TokenNameCOMMA	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
ONE_WEEK	TokenNameIdentifier	 ONE  WEEK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert the value to a multipler (millisecond to unit). * @return a multipler (a long value) */	TokenNameCOMMENT_JAVADOC	 Convert the value to a multipler (millisecond to unit). @return a multipler (a long value) 
public	TokenNamepublic	
long	TokenNamelong	
getMultiplier	TokenNameIdentifier	 get Multiplier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Long	TokenNameIdentifier	 Long
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
timeTable	TokenNameIdentifier	 time Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see EnumeratedAttribute#getValues() */	TokenNameCOMMENT_JAVADOC	 @see EnumeratedAttribute#getValues() 
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
UNITS	TokenNameIdentifier	 UNITS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
