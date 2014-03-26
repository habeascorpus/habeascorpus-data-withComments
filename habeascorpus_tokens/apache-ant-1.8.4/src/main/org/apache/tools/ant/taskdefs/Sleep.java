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
Task	TokenNameIdentifier	 Task
;	TokenNameSEMICOLON	
/** * Sleep, or pause, for a period of time. * * A task for sleeping a short period of time, useful when a * build or deployment process requires an interval between tasks. *<p> * A negative value can be supplied to any of attributes provided the total sleep time * is positive, pending fundamental changes in physics and JVM * execution times</p> * Note that sleep times are always hints to be interpreted by the OS how it feels * small times may either be ignored or rounded up to a minimum timeslice. Note * also that the system clocks often have a fairly low granularity too, which complicates * measuring how long a sleep actually took.</p> * * @since Ant 1.4 * @ant.task category="utility" */	TokenNameCOMMENT_JAVADOC	 Sleep, or pause, for a period of time. * A task for sleeping a short period of time, useful when a build or deployment process requires an interval between tasks. *<p> A negative value can be supplied to any of attributes provided the total sleep time is positive, pending fundamental changes in physics and JVM execution times</p> Note that sleep times are always hints to be interpreted by the OS how it feels small times may either be ignored or rounded up to a minimum timeslice. Note also that the system clocks often have a fairly low granularity too, which complicates measuring how long a sleep actually took.</p> * @since Ant 1.4 @ant.task category="utility" 
public	TokenNamepublic	
class	TokenNameclass	
Sleep	TokenNameIdentifier	 Sleep
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/** * failure flag */	TokenNameCOMMENT_JAVADOC	 failure flag 
private	TokenNameprivate	
boolean	TokenNameboolean	
failOnError	TokenNameIdentifier	 fail On Error
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * sleep seconds */	TokenNameCOMMENT_JAVADOC	 sleep seconds 
private	TokenNameprivate	
int	TokenNameint	
seconds	TokenNameIdentifier	 seconds
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * sleep hours */	TokenNameCOMMENT_JAVADOC	 sleep hours 
private	TokenNameprivate	
int	TokenNameint	
hours	TokenNameIdentifier	 hours
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * sleep minutes */	TokenNameCOMMENT_JAVADOC	 sleep minutes 
private	TokenNameprivate	
int	TokenNameint	
minutes	TokenNameIdentifier	 minutes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * sleep milliseconds */	TokenNameCOMMENT_JAVADOC	 sleep milliseconds 
private	TokenNameprivate	
int	TokenNameint	
milliseconds	TokenNameIdentifier	 milliseconds
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Creates new instance */	TokenNameCOMMENT_JAVADOC	 Creates new instance 
public	TokenNamepublic	
Sleep	TokenNameIdentifier	 Sleep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * seconds to add to the sleep time * * @param seconds The new Seconds value */	TokenNameCOMMENT_JAVADOC	 seconds to add to the sleep time * @param seconds The new Seconds value 
public	TokenNamepublic	
void	TokenNamevoid	
setSeconds	TokenNameIdentifier	 set Seconds
(	TokenNameLPAREN	
int	TokenNameint	
seconds	TokenNameIdentifier	 seconds
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
seconds	TokenNameIdentifier	 seconds
=	TokenNameEQUAL	
seconds	TokenNameIdentifier	 seconds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * hours to add to the sleep time. * * @param hours The new Hours value */	TokenNameCOMMENT_JAVADOC	 hours to add to the sleep time. * @param hours The new Hours value 
public	TokenNamepublic	
void	TokenNamevoid	
setHours	TokenNameIdentifier	 set Hours
(	TokenNameLPAREN	
int	TokenNameint	
hours	TokenNameIdentifier	 hours
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hours	TokenNameIdentifier	 hours
=	TokenNameEQUAL	
hours	TokenNameIdentifier	 hours
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * minutes to add to the sleep time * * @param minutes The new Minutes value */	TokenNameCOMMENT_JAVADOC	 minutes to add to the sleep time * @param minutes The new Minutes value 
public	TokenNamepublic	
void	TokenNamevoid	
setMinutes	TokenNameIdentifier	 set Minutes
(	TokenNameLPAREN	
int	TokenNameint	
minutes	TokenNameIdentifier	 minutes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
minutes	TokenNameIdentifier	 minutes
=	TokenNameEQUAL	
minutes	TokenNameIdentifier	 minutes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * milliseconds to add to the sleep time * * @param milliseconds The new Milliseconds value */	TokenNameCOMMENT_JAVADOC	 milliseconds to add to the sleep time * @param milliseconds The new Milliseconds value 
public	TokenNamepublic	
void	TokenNamevoid	
setMilliseconds	TokenNameIdentifier	 set Milliseconds
(	TokenNameLPAREN	
int	TokenNameint	
milliseconds	TokenNameIdentifier	 milliseconds
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
milliseconds	TokenNameIdentifier	 milliseconds
=	TokenNameEQUAL	
milliseconds	TokenNameIdentifier	 milliseconds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * sleep for a period of time * * @param millis time to sleep */	TokenNameCOMMENT_JAVADOC	 sleep for a period of time * @param millis time to sleep 
public	TokenNamepublic	
void	TokenNamevoid	
doSleep	TokenNameIdentifier	 do Sleep
(	TokenNameLPAREN	
long	TokenNamelong	
millis	TokenNameIdentifier	 millis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
millis	TokenNameIdentifier	 millis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ignore Exception 	TokenNameCOMMENT_LINE	Ignore Exception 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * flag controlling whether to break the build on an error. * * @param failOnError The new FailOnError value */	TokenNameCOMMENT_JAVADOC	 flag controlling whether to break the build on an error. * @param failOnError The new FailOnError value 
public	TokenNamepublic	
void	TokenNamevoid	
setFailOnError	TokenNameIdentifier	 set Fail On Error
(	TokenNameLPAREN	
boolean	TokenNameboolean	
failOnError	TokenNameIdentifier	 fail On Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
failOnError	TokenNameIdentifier	 fail On Error
=	TokenNameEQUAL	
failOnError	TokenNameIdentifier	 fail On Error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * return time to sleep * * @return sleep time. if below 0 then there is an error */	TokenNameCOMMENT_JAVADOC	 return time to sleep * @return sleep time. if below 0 then there is an error 
private	TokenNameprivate	
long	TokenNamelong	
getSleepTime	TokenNameIdentifier	 get Sleep Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
hours	TokenNameIdentifier	 hours
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
minutes	TokenNameIdentifier	 minutes
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
60	TokenNameIntegerLiteral	
+	TokenNamePLUS	
seconds	TokenNameIdentifier	 seconds
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
+	TokenNamePLUS	
milliseconds	TokenNameIdentifier	 milliseconds
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
}	TokenNameRBRACE	
/** * verify parameters * * @throws BuildException if something is invalid */	TokenNameCOMMENT_JAVADOC	 verify parameters * @throws BuildException if something is invalid 
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getSleepTime	TokenNameIdentifier	 get Sleep Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Negative sleep periods are not "	TokenNameStringLiteral	Negative sleep periods are not 
+	TokenNamePLUS	
"supported"	TokenNameStringLiteral	supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Executes this build task. Throws org.apache.tools.ant.BuildException * if there is an error during task execution. * * @exception BuildException Description of Exception */	TokenNameCOMMENT_JAVADOC	 Executes this build task. Throws org.apache.tools.ant.BuildException if there is an error during task execution. * @exception BuildException Description of Exception 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
sleepTime	TokenNameIdentifier	 sleep Time
=	TokenNameEQUAL	
getSleepTime	TokenNameIdentifier	 get Sleep Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"sleeping for "	TokenNameStringLiteral	sleeping for 
+	TokenNamePLUS	
sleepTime	TokenNameIdentifier	 sleep Time
+	TokenNamePLUS	
" milliseconds"	TokenNameStringLiteral	 milliseconds
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doSleep	TokenNameIdentifier	 do Sleep
(	TokenNameLPAREN	
sleepTime	TokenNameIdentifier	 sleep Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
failOnError	TokenNameIdentifier	 fail On Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
