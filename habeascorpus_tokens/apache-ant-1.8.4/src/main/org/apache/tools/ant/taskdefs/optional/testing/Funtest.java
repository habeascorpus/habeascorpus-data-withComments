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
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
testing	TokenNameIdentifier	 testing
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
TaskAdapter	TokenNameIdentifier	 Task Adapter
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
WorkerAnt	TokenNameIdentifier	 Worker Ant
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
Parallel	TokenNameIdentifier	 Parallel
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
Sequential	TokenNameIdentifier	 Sequential
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
WaitFor	TokenNameIdentifier	 Wait For
;	TokenNameSEMICOLON	
/** * Task to provide functional testing under Ant, with a fairly complex worflow of: * * <ul> * <li>Conditional execution</li> * <li>Application to start</li> * <li>A probe to "waitfor" before running tests</li> * <li>A tests sequence</li> * <li>A reporting sequence that runs after the tests have finished</li> * <li>A "teardown" clause that runs after the rest.</li> * <li>Automated termination of the program it executes, if a timeout is not met</li> * <li>Checking of a failure property and automatic raising of a fault * (with the text in failureText) * if test shutdown and reporting succeeded</li> * </ul> * * The task is designed to be framework neutral; it will work with JUnit, * TestNG and other test frameworks That can be * executed from Ant. It bears a resemblance to the FunctionalTest task from * SmartFrog, as the attribute names were * chosen to make migration easier. However, this task benefits from the * ability to tweak Ant's internals, and so * simplify the workflow, and from the experience of using the SmartFrog task. * No code has been shared. * * @since Ant 1.8 */	TokenNameCOMMENT_JAVADOC	 Task to provide functional testing under Ant, with a fairly complex worflow of: * <ul> <li>Conditional execution</li> <li>Application to start</li> <li>A probe to "waitfor" before running tests</li> <li>A tests sequence</li> <li>A reporting sequence that runs after the tests have finished</li> <li>A "teardown" clause that runs after the rest.</li> <li>Automated termination of the program it executes, if a timeout is not met</li> <li>Checking of a failure property and automatic raising of a fault (with the text in failureText) if test shutdown and reporting succeeded</li> </ul> * The task is designed to be framework neutral; it will work with JUnit, TestNG and other test frameworks That can be executed from Ant. It bears a resemblance to the FunctionalTest task from SmartFrog, as the attribute names were chosen to make migration easier. However, this task benefits from the ability to tweak Ant's internals, and so simplify the workflow, and from the experience of using the SmartFrog task. No code has been shared. * @since Ant 1.8 
public	TokenNamepublic	
class	TokenNameclass	
Funtest	TokenNameIdentifier	 Funtest
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/** * A condition that must be true before the tests are run. This makes it * easier to define complex tests that only * run if certain conditions are met, such as OS or network state. */	TokenNameCOMMENT_JAVADOC	 A condition that must be true before the tests are run. This makes it easier to define complex tests that only run if certain conditions are met, such as OS or network state. 
private	TokenNameprivate	
NestedCondition	TokenNameIdentifier	 Nested Condition
condition	TokenNameIdentifier	 condition
;	TokenNameSEMICOLON	
/** * Used internally to set the workflow up */	TokenNameCOMMENT_JAVADOC	 Used internally to set the workflow up 
private	TokenNameprivate	
Parallel	TokenNameIdentifier	 Parallel
timedTests	TokenNameIdentifier	 timed Tests
;	TokenNameSEMICOLON	
/** * Setup runs if the condition is met. Once setup is complete, teardown * will be run when the task finishes */	TokenNameCOMMENT_JAVADOC	 Setup runs if the condition is met. Once setup is complete, teardown will be run when the task finishes 
private	TokenNameprivate	
Sequential	TokenNameIdentifier	 Sequential
setup	TokenNameIdentifier	 setup
;	TokenNameSEMICOLON	
/** * The application to run */	TokenNameCOMMENT_JAVADOC	 The application to run 
private	TokenNameprivate	
Sequential	TokenNameIdentifier	 Sequential
application	TokenNameIdentifier	 application
;	TokenNameSEMICOLON	
/** * A block that halts the tests until met. */	TokenNameCOMMENT_JAVADOC	 A block that halts the tests until met. 
private	TokenNameprivate	
BlockFor	TokenNameIdentifier	 Block For
block	TokenNameIdentifier	 block
;	TokenNameSEMICOLON	
/** * Tests to run */	TokenNameCOMMENT_JAVADOC	 Tests to run 
private	TokenNameprivate	
Sequential	TokenNameIdentifier	 Sequential
tests	TokenNameIdentifier	 tests
;	TokenNameSEMICOLON	
/** * Reporting only runs if the tests were executed. If the block stopped * them, reporting is skipped. */	TokenNameCOMMENT_JAVADOC	 Reporting only runs if the tests were executed. If the block stopped them, reporting is skipped. 
private	TokenNameprivate	
Sequential	TokenNameIdentifier	 Sequential
reporting	TokenNameIdentifier	 reporting
;	TokenNameSEMICOLON	
/** * Any teardown operations. */	TokenNameCOMMENT_JAVADOC	 Any teardown operations. 
private	TokenNameprivate	
Sequential	TokenNameIdentifier	 Sequential
teardown	TokenNameIdentifier	 teardown
;	TokenNameSEMICOLON	
/** * time for the tests to time out */	TokenNameCOMMENT_JAVADOC	 time for the tests to time out 
private	TokenNameprivate	
long	TokenNamelong	
timeout	TokenNameIdentifier	 timeout
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
timeoutUnitMultiplier	TokenNameIdentifier	 timeout Unit Multiplier
=	TokenNameEQUAL	
WaitFor	TokenNameIdentifier	 Wait For
.	TokenNameDOT	
ONE_MILLISECOND	TokenNameIdentifier	 ONE  MILLISECOND
;	TokenNameSEMICOLON	
/** * time for the execution to time out. */	TokenNameCOMMENT_JAVADOC	 time for the execution to time out. 
private	TokenNameprivate	
long	TokenNamelong	
shutdownTime	TokenNameIdentifier	 shutdown Time
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
WaitFor	TokenNameIdentifier	 Wait For
.	TokenNameDOT	
ONE_SECOND	TokenNameIdentifier	 ONE  SECOND
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
shutdownUnitMultiplier	TokenNameIdentifier	 shutdown Unit Multiplier
=	TokenNameEQUAL	
WaitFor	TokenNameIdentifier	 Wait For
.	TokenNameDOT	
ONE_MILLISECOND	TokenNameIdentifier	 ONE  MILLISECOND
;	TokenNameSEMICOLON	
/** * Name of a property to look for */	TokenNameCOMMENT_JAVADOC	 Name of a property to look for 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
failureProperty	TokenNameIdentifier	 failure Property
;	TokenNameSEMICOLON	
/** * Message to send when tests failed */	TokenNameCOMMENT_JAVADOC	 Message to send when tests failed 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
failureMessage	TokenNameIdentifier	 failure Message
=	TokenNameEQUAL	
"Tests failed"	TokenNameStringLiteral	Tests failed
;	TokenNameSEMICOLON	
/** * Flag to set to true if you don't care about any shutdown errors. * <p/> * In that situation, errors raised during teardown are logged but not * turned into BuildFault events. Similar to catching and ignoring * <code>finally {}</code> clauses in Java/ */	TokenNameCOMMENT_JAVADOC	 Flag to set to true if you don't care about any shutdown errors. <p/> In that situation, errors raised during teardown are logged but not turned into BuildFault events. Similar to catching and ignoring <code>finally {}</code> clauses in Java/ 
private	TokenNameprivate	
boolean	TokenNameboolean	
failOnTeardownErrors	TokenNameIdentifier	 fail On Teardown Errors
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * What was thrown in the test run (including reporting) */	TokenNameCOMMENT_JAVADOC	 What was thrown in the test run (including reporting) 
private	TokenNameprivate	
BuildException	TokenNameIdentifier	 Build Exception
testException	TokenNameIdentifier	 test Exception
;	TokenNameSEMICOLON	
/** * What got thrown during teardown */	TokenNameCOMMENT_JAVADOC	 What got thrown during teardown 
private	TokenNameprivate	
BuildException	TokenNameIdentifier	 Build Exception
teardownException	TokenNameIdentifier	 teardown Exception
;	TokenNameSEMICOLON	
/** * Did the application throw an exception */	TokenNameCOMMENT_JAVADOC	 Did the application throw an exception 
private	TokenNameprivate	
BuildException	TokenNameIdentifier	 Build Exception
applicationException	TokenNameIdentifier	 application Exception
;	TokenNameSEMICOLON	
/** * Did the task throw an exception */	TokenNameCOMMENT_JAVADOC	 Did the task throw an exception 
private	TokenNameprivate	
BuildException	TokenNameIdentifier	 Build Exception
taskException	TokenNameIdentifier	 task Exception
;	TokenNameSEMICOLON	
/** {@value} */	TokenNameCOMMENT_JAVADOC	 {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WARN_OVERRIDING	TokenNameIdentifier	 WARN  OVERRIDING
=	TokenNameEQUAL	
"Overriding previous definition of "	TokenNameStringLiteral	Overriding previous definition of 
;	TokenNameSEMICOLON	
/** {@value} */	TokenNameCOMMENT_JAVADOC	 {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
APPLICATION_FORCIBLY_SHUT_DOWN	TokenNameIdentifier	 APPLICATION  FORCIBLY  SHUT  DOWN
=	TokenNameEQUAL	
"Application forcibly shut down"	TokenNameStringLiteral	Application forcibly shut down
;	TokenNameSEMICOLON	
/** {@value} */	TokenNameCOMMENT_JAVADOC	 {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SHUTDOWN_INTERRUPTED	TokenNameIdentifier	 SHUTDOWN  INTERRUPTED
=	TokenNameEQUAL	
"Shutdown interrupted"	TokenNameStringLiteral	Shutdown interrupted
;	TokenNameSEMICOLON	
/** {@value} */	TokenNameCOMMENT_JAVADOC	 {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SKIPPING_TESTS	TokenNameIdentifier	 SKIPPING  TESTS
=	TokenNameEQUAL	
"Condition failed -skipping tests"	TokenNameStringLiteral	Condition failed -skipping tests
;	TokenNameSEMICOLON	
/** Application exception : {@value} */	TokenNameCOMMENT_JAVADOC	 Application exception : {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
APPLICATION_EXCEPTION	TokenNameIdentifier	 APPLICATION  EXCEPTION
=	TokenNameEQUAL	
"Application Exception"	TokenNameStringLiteral	Application Exception
;	TokenNameSEMICOLON	
/** Teardown exception : {@value} */	TokenNameCOMMENT_JAVADOC	 Teardown exception : {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEARDOWN_EXCEPTION	TokenNameIdentifier	 TEARDOWN  EXCEPTION
=	TokenNameEQUAL	
"Teardown Exception"	TokenNameStringLiteral	Teardown Exception
;	TokenNameSEMICOLON	
/** * Log if the definition is overriding something * * @param name what is being defined * @param definition what should be null if you don't want a warning */	TokenNameCOMMENT_JAVADOC	 Log if the definition is overriding something * @param name what is being defined @param definition what should be null if you don't want a warning 
private	TokenNameprivate	
void	TokenNamevoid	
logOverride	TokenNameIdentifier	 log Override
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
definition	TokenNameIdentifier	 definition
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
definition	TokenNameIdentifier	 definition
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
WARN_OVERRIDING	TokenNameIdentifier	 WARN  OVERRIDING
+	TokenNamePLUS	
'<'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
'>'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add a condition element. * @return <code>ConditionBase</code>. * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Add a condition element. @return <code>ConditionBase</code>. @since Ant 1.6.2 
public	TokenNamepublic	
ConditionBase	TokenNameIdentifier	 Condition Base
createCondition	TokenNameIdentifier	 create Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logOverride	TokenNameIdentifier	 log Override
(	TokenNameLPAREN	
"condition"	TokenNameStringLiteral	condition
,	TokenNameCOMMA	
condition	TokenNameIdentifier	 condition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
condition	TokenNameIdentifier	 condition
=	TokenNameEQUAL	
new	TokenNamenew	
NestedCondition	TokenNameIdentifier	 Nested Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
condition	TokenNameIdentifier	 condition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an application. * @param sequence the application to add. */	TokenNameCOMMENT_JAVADOC	 Add an application. @param sequence the application to add. 
public	TokenNamepublic	
void	TokenNamevoid	
addApplication	TokenNameIdentifier	 add Application
(	TokenNameLPAREN	
Sequential	TokenNameIdentifier	 Sequential
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logOverride	TokenNameIdentifier	 log Override
(	TokenNameLPAREN	
"application"	TokenNameStringLiteral	application
,	TokenNameCOMMA	
application	TokenNameIdentifier	 application
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
application	TokenNameIdentifier	 application
=	TokenNameEQUAL	
sequence	TokenNameIdentifier	 sequence
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a setup sequence. * @param sequence the setup sequence to add. */	TokenNameCOMMENT_JAVADOC	 Add a setup sequence. @param sequence the setup sequence to add. 
public	TokenNamepublic	
void	TokenNamevoid	
addSetup	TokenNameIdentifier	 add Setup
(	TokenNameLPAREN	
Sequential	TokenNameIdentifier	 Sequential
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logOverride	TokenNameIdentifier	 log Override
(	TokenNameLPAREN	
"setup"	TokenNameStringLiteral	setup
,	TokenNameCOMMA	
setup	TokenNameIdentifier	 setup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setup	TokenNameIdentifier	 setup
=	TokenNameEQUAL	
sequence	TokenNameIdentifier	 sequence
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a block. * @param sequence the block for to add. */	TokenNameCOMMENT_JAVADOC	 Add a block. @param sequence the block for to add. 
public	TokenNamepublic	
void	TokenNamevoid	
addBlock	TokenNameIdentifier	 add Block
(	TokenNameLPAREN	
BlockFor	TokenNameIdentifier	 Block For
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logOverride	TokenNameIdentifier	 log Override
(	TokenNameLPAREN	
"block"	TokenNameStringLiteral	block
,	TokenNameCOMMA	
block	TokenNameIdentifier	 block
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
sequence	TokenNameIdentifier	 sequence
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add tests. * @param sequence a sequence to add. */	TokenNameCOMMENT_JAVADOC	 add tests. @param sequence a sequence to add. 
public	TokenNamepublic	
void	TokenNamevoid	
addTests	TokenNameIdentifier	 add Tests
(	TokenNameLPAREN	
Sequential	TokenNameIdentifier	 Sequential
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logOverride	TokenNameIdentifier	 log Override
(	TokenNameLPAREN	
"tests"	TokenNameStringLiteral	tests
,	TokenNameCOMMA	
tests	TokenNameIdentifier	 tests
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
=	TokenNameEQUAL	
sequence	TokenNameIdentifier	 sequence
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set reporting sequence of tasks. * @param sequence a reporting sequence to use. */	TokenNameCOMMENT_JAVADOC	 set reporting sequence of tasks. @param sequence a reporting sequence to use. 
public	TokenNamepublic	
void	TokenNamevoid	
addReporting	TokenNameIdentifier	 add Reporting
(	TokenNameLPAREN	
Sequential	TokenNameIdentifier	 Sequential
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logOverride	TokenNameIdentifier	 log Override
(	TokenNameLPAREN	
"reporting"	TokenNameStringLiteral	reporting
,	TokenNameCOMMA	
reporting	TokenNameIdentifier	 reporting
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reporting	TokenNameIdentifier	 reporting
=	TokenNameEQUAL	
sequence	TokenNameIdentifier	 sequence
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set teardown sequence of tasks. * @param sequence a teardown sequence to use. */	TokenNameCOMMENT_JAVADOC	 set teardown sequence of tasks. @param sequence a teardown sequence to use. 
public	TokenNamepublic	
void	TokenNamevoid	
addTeardown	TokenNameIdentifier	 add Teardown
(	TokenNameLPAREN	
Sequential	TokenNameIdentifier	 Sequential
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logOverride	TokenNameIdentifier	 log Override
(	TokenNameLPAREN	
"teardown"	TokenNameStringLiteral	teardown
,	TokenNameCOMMA	
teardown	TokenNameIdentifier	 teardown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
teardown	TokenNameIdentifier	 teardown
=	TokenNameEQUAL	
sequence	TokenNameIdentifier	 sequence
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the failOnTeardownErrors attribute. * @param failOnTeardownErrors the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the failOnTeardownErrors attribute. @param failOnTeardownErrors the value to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setFailOnTeardownErrors	TokenNameIdentifier	 set Fail On Teardown Errors
(	TokenNameLPAREN	
boolean	TokenNameboolean	
failOnTeardownErrors	TokenNameIdentifier	 fail On Teardown Errors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
failOnTeardownErrors	TokenNameIdentifier	 fail On Teardown Errors
=	TokenNameEQUAL	
failOnTeardownErrors	TokenNameIdentifier	 fail On Teardown Errors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the failureMessage attribute. * @param failureMessage the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the failureMessage attribute. @param failureMessage the value to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setFailureMessage	TokenNameIdentifier	 set Failure Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
failureMessage	TokenNameIdentifier	 failure Message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
failureMessage	TokenNameIdentifier	 failure Message
=	TokenNameEQUAL	
failureMessage	TokenNameIdentifier	 failure Message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the failureProperty attribute. * @param failureProperty the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the failureProperty attribute. @param failureProperty the value to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setFailureProperty	TokenNameIdentifier	 set Failure Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
failureProperty	TokenNameIdentifier	 failure Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
failureProperty	TokenNameIdentifier	 failure Property
=	TokenNameEQUAL	
failureProperty	TokenNameIdentifier	 failure Property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the shutdownTime attribute. * @param shutdownTime the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the shutdownTime attribute. @param shutdownTime the value to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setShutdownTime	TokenNameIdentifier	 set Shutdown Time
(	TokenNameLPAREN	
long	TokenNamelong	
shutdownTime	TokenNameIdentifier	 shutdown Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shutdownTime	TokenNameIdentifier	 shutdown Time
=	TokenNameEQUAL	
shutdownTime	TokenNameIdentifier	 shutdown Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the timeout attribute. * @param timeout the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the timeout attribute. @param timeout the value to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setTimeout	TokenNameIdentifier	 set Timeout
(	TokenNameLPAREN	
long	TokenNamelong	
timeout	TokenNameIdentifier	 timeout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timeout	TokenNameIdentifier	 timeout
=	TokenNameEQUAL	
timeout	TokenNameIdentifier	 timeout
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the timeoutunit attribute. * @param unit the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the timeoutunit attribute. @param unit the value to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setTimeoutUnit	TokenNameIdentifier	 set Timeout Unit
(	TokenNameLPAREN	
WaitFor	TokenNameIdentifier	 Wait For
.	TokenNameDOT	
Unit	TokenNameIdentifier	 Unit
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timeoutUnitMultiplier	TokenNameIdentifier	 timeout Unit Multiplier
=	TokenNameEQUAL	
unit	TokenNameIdentifier	 unit
.	TokenNameDOT	
getMultiplier	TokenNameIdentifier	 get Multiplier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the shutdownunit attribute. * @param unit the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the shutdownunit attribute. @param unit the value to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setShutdownUnit	TokenNameIdentifier	 set Shutdown Unit
(	TokenNameLPAREN	
WaitFor	TokenNameIdentifier	 Wait For
.	TokenNameDOT	
Unit	TokenNameIdentifier	 Unit
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
shutdownUnitMultiplier	TokenNameIdentifier	 shutdown Unit Multiplier
=	TokenNameEQUAL	
unit	TokenNameIdentifier	 unit
.	TokenNameDOT	
getMultiplier	TokenNameIdentifier	 get Multiplier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the application exception. * @return the application exception. */	TokenNameCOMMENT_JAVADOC	 Get the application exception. @return the application exception. 
public	TokenNamepublic	
BuildException	TokenNameIdentifier	 Build Exception
getApplicationException	TokenNameIdentifier	 get Application Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
applicationException	TokenNameIdentifier	 application Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the teardown exception. * @return the teardown exception. */	TokenNameCOMMENT_JAVADOC	 Get the teardown exception. @return the teardown exception. 
public	TokenNamepublic	
BuildException	TokenNameIdentifier	 Build Exception
getTeardownException	TokenNameIdentifier	 get Teardown Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
teardownException	TokenNameIdentifier	 teardown Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the test exception. * @return the test exception. */	TokenNameCOMMENT_JAVADOC	 Get the test exception. @return the test exception. 
public	TokenNamepublic	
BuildException	TokenNameIdentifier	 Build Exception
getTestException	TokenNameIdentifier	 get Test Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
testException	TokenNameIdentifier	 test Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the task exception. * @return the task exception. */	TokenNameCOMMENT_JAVADOC	 Get the task exception. @return the task exception. 
public	TokenNamepublic	
BuildException	TokenNameIdentifier	 Build Exception
getTaskException	TokenNameIdentifier	 get Task Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
taskException	TokenNameIdentifier	 task Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Bind and initialise a task * @param task task to bind */	TokenNameCOMMENT_JAVADOC	 Bind and initialise a task @param task task to bind 
private	TokenNameprivate	
void	TokenNamevoid	
bind	TokenNameIdentifier	 bind
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
bindToOwner	TokenNameIdentifier	 bind To Owner
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a newly bound parallel instance * @param parallelTimeout timeout * @return a bound and initialised parallel instance. */	TokenNameCOMMENT_JAVADOC	 Create a newly bound parallel instance @param parallelTimeout timeout @return a bound and initialised parallel instance. 
private	TokenNameprivate	
Parallel	TokenNameIdentifier	 Parallel
newParallel	TokenNameIdentifier	 new Parallel
(	TokenNameLPAREN	
long	TokenNamelong	
parallelTimeout	TokenNameIdentifier	 parallel Timeout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Parallel	TokenNameIdentifier	 Parallel
par	TokenNameIdentifier	 par
=	TokenNameEQUAL	
new	TokenNamenew	
Parallel	TokenNameIdentifier	 Parallel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bind	TokenNameIdentifier	 bind
(	TokenNameLPAREN	
par	TokenNameIdentifier	 par
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
par	TokenNameIdentifier	 par
.	TokenNameDOT	
setFailOnAny	TokenNameIdentifier	 set Fail On Any
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
par	TokenNameIdentifier	 par
.	TokenNameDOT	
setTimeout	TokenNameIdentifier	 set Timeout
(	TokenNameLPAREN	
parallelTimeout	TokenNameIdentifier	 parallel Timeout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
par	TokenNameIdentifier	 par
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a newly bound parallel instance with one child * @param parallelTimeout timeout * @param child task * @return a bound and initialised parallel instance. */	TokenNameCOMMENT_JAVADOC	 Create a newly bound parallel instance with one child @param parallelTimeout timeout @param child task @return a bound and initialised parallel instance. 
private	TokenNameprivate	
Parallel	TokenNameIdentifier	 Parallel
newParallel	TokenNameIdentifier	 new Parallel
(	TokenNameLPAREN	
long	TokenNamelong	
parallelTimeout	TokenNameIdentifier	 parallel Timeout
,	TokenNameCOMMA	
Task	TokenNameIdentifier	 Task
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Parallel	TokenNameIdentifier	 Parallel
par	TokenNameIdentifier	 par
=	TokenNameEQUAL	
newParallel	TokenNameIdentifier	 new Parallel
(	TokenNameLPAREN	
parallelTimeout	TokenNameIdentifier	 parallel Timeout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
par	TokenNameIdentifier	 par
.	TokenNameDOT	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
par	TokenNameIdentifier	 par
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add any task validation needed to ensure internal code quality * @param task task * @param role role of the task */	TokenNameCOMMENT_JAVADOC	 Add any task validation needed to ensure internal code quality @param task task @param role role of the task 
private	TokenNameprivate	
void	TokenNamevoid	
validateTask	TokenNameIdentifier	 validate Task
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
role	TokenNameIdentifier	 role
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
+	TokenNamePLUS	
" task is not bound to the project"	TokenNameStringLiteral	 task is not bound to the project
+	TokenNamePLUS	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Run the functional test sequence. * <p/> * This is a fairly complex workflow -what is going on is that we try to clean up * no matter how the run ended, and to retain the innermost exception that got thrown * during cleanup. That is, if teardown fails after the tests themselves failed, it is the * test failing that is more important. * @throws BuildException if something was caught during the run or teardown. */	TokenNameCOMMENT_JAVADOC	 Run the functional test sequence. <p/> This is a fairly complex workflow -what is going on is that we try to clean up no matter how the run ended, and to retain the innermost exception that got thrown during cleanup. That is, if teardown fails after the tests themselves failed, it is the test failing that is more important. @throws BuildException if something was caught during the run or teardown. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
//validation 	TokenNameCOMMENT_LINE	validation 
validateTask	TokenNameIdentifier	 validate Task
(	TokenNameLPAREN	
setup	TokenNameIdentifier	 setup
,	TokenNameCOMMA	
"setup"	TokenNameStringLiteral	setup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validateTask	TokenNameIdentifier	 validate Task
(	TokenNameLPAREN	
application	TokenNameIdentifier	 application
,	TokenNameCOMMA	
"application"	TokenNameStringLiteral	application
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validateTask	TokenNameIdentifier	 validate Task
(	TokenNameLPAREN	
tests	TokenNameIdentifier	 tests
,	TokenNameCOMMA	
"tests"	TokenNameStringLiteral	tests
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validateTask	TokenNameIdentifier	 validate Task
(	TokenNameLPAREN	
reporting	TokenNameIdentifier	 reporting
,	TokenNameCOMMA	
"reporting"	TokenNameStringLiteral	reporting
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validateTask	TokenNameIdentifier	 validate Task
(	TokenNameLPAREN	
teardown	TokenNameIdentifier	 teardown
,	TokenNameCOMMA	
"teardown"	TokenNameStringLiteral	teardown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//check the condition 	TokenNameCOMMENT_LINE	check the condition 
//and bail out if it is defined but not true 	TokenNameCOMMENT_LINE	and bail out if it is defined but not true 
if	TokenNameif	
(	TokenNameLPAREN	
condition	TokenNameIdentifier	 condition
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//we are skipping the test 	TokenNameCOMMENT_LINE	we are skipping the test 
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
SKIPPING_TESTS	TokenNameIdentifier	 SKIPPING  TESTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
timeoutMillis	TokenNameIdentifier	 timeout Millis
=	TokenNameEQUAL	
timeout	TokenNameIdentifier	 timeout
*	TokenNameMULTIPLY	
timeoutUnitMultiplier	TokenNameIdentifier	 timeout Unit Multiplier
;	TokenNameSEMICOLON	
//set up the application to run in a separate thread 	TokenNameCOMMENT_LINE	set up the application to run in a separate thread 
Parallel	TokenNameIdentifier	 Parallel
applicationRun	TokenNameIdentifier	 application Run
=	TokenNameEQUAL	
newParallel	TokenNameIdentifier	 new Parallel
(	TokenNameLPAREN	
timeoutMillis	TokenNameIdentifier	 timeout Millis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//with a worker which we can use to manage it 	TokenNameCOMMENT_LINE	with a worker which we can use to manage it 
WorkerAnt	TokenNameIdentifier	 Worker Ant
worker	TokenNameIdentifier	 worker
=	TokenNameEQUAL	
new	TokenNamenew	
WorkerAnt	TokenNameIdentifier	 Worker Ant
(	TokenNameLPAREN	
applicationRun	TokenNameIdentifier	 application Run
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
application	TokenNameIdentifier	 application
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
applicationRun	TokenNameIdentifier	 application Run
.	TokenNameDOT	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
application	TokenNameIdentifier	 application
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//The test run consists of the block followed by the tests. 	TokenNameCOMMENT_LINE	The test run consists of the block followed by the tests. 
long	TokenNamelong	
testRunTimeout	TokenNameIdentifier	 test Run Timeout
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Sequential	TokenNameIdentifier	 Sequential
testRun	TokenNameIdentifier	 test Run
=	TokenNameEQUAL	
new	TokenNamenew	
Sequential	TokenNameIdentifier	 Sequential
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bind	TokenNameIdentifier	 bind
(	TokenNameLPAREN	
testRun	TokenNameIdentifier	 test Run
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//waitfor is not a task, it needs to be adapted 	TokenNameCOMMENT_LINE	waitfor is not a task, it needs to be adapted 
TaskAdapter	TokenNameIdentifier	 Task Adapter
ta	TokenNameIdentifier	 ta
=	TokenNameEQUAL	
new	TokenNamenew	
TaskAdapter	TokenNameIdentifier	 Task Adapter
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ta	TokenNameIdentifier	 ta
.	TokenNameDOT	
bindToOwner	TokenNameIdentifier	 bind To Owner
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validateTask	TokenNameIdentifier	 validate Task
(	TokenNameLPAREN	
ta	TokenNameIdentifier	 ta
,	TokenNameCOMMA	
"block"	TokenNameStringLiteral	block
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testRun	TokenNameIdentifier	 test Run
.	TokenNameDOT	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
ta	TokenNameIdentifier	 ta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//add the block time to the total test run timeout 	TokenNameCOMMENT_LINE	add the block time to the total test run timeout 
testRunTimeout	TokenNameIdentifier	 test Run Timeout
=	TokenNameEQUAL	
block	TokenNameIdentifier	 block
.	TokenNameDOT	
calculateMaxWaitMillis	TokenNameIdentifier	 calculate Max Wait Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//add the tests and more delay 	TokenNameCOMMENT_LINE	add the tests and more delay 
if	TokenNameif	
(	TokenNameLPAREN	
tests	TokenNameIdentifier	 tests
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testRun	TokenNameIdentifier	 test Run
.	TokenNameDOT	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
tests	TokenNameIdentifier	 tests
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testRunTimeout	TokenNameIdentifier	 test Run Timeout
+=	TokenNamePLUS_EQUAL	
timeoutMillis	TokenNameIdentifier	 timeout Millis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//add the reporting and more delay 	TokenNameCOMMENT_LINE	add the reporting and more delay 
if	TokenNameif	
(	TokenNameLPAREN	
reporting	TokenNameIdentifier	 reporting
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testRun	TokenNameIdentifier	 test Run
.	TokenNameDOT	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
reporting	TokenNameIdentifier	 reporting
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testRunTimeout	TokenNameIdentifier	 test Run Timeout
+=	TokenNamePLUS_EQUAL	
timeoutMillis	TokenNameIdentifier	 timeout Millis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//wrap this in a parallel purely to set up timeouts for the 	TokenNameCOMMENT_LINE	wrap this in a parallel purely to set up timeouts for the 
//test run 	TokenNameCOMMENT_LINE	test run 
timedTests	TokenNameIdentifier	 timed Tests
=	TokenNameEQUAL	
newParallel	TokenNameIdentifier	 new Parallel
(	TokenNameLPAREN	
testRunTimeout	TokenNameIdentifier	 test Run Timeout
,	TokenNameCOMMA	
testRun	TokenNameIdentifier	 test Run
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
//run any setup task 	TokenNameCOMMENT_LINE	run any setup task 
if	TokenNameif	
(	TokenNameLPAREN	
setup	TokenNameIdentifier	 setup
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Parallel	TokenNameIdentifier	 Parallel
setupRun	TokenNameIdentifier	 setup Run
=	TokenNameEQUAL	
newParallel	TokenNameIdentifier	 new Parallel
(	TokenNameLPAREN	
timeoutMillis	TokenNameIdentifier	 timeout Millis
,	TokenNameCOMMA	
setup	TokenNameIdentifier	 setup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setupRun	TokenNameIdentifier	 setup Run
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//start the worker thread and leave it running 	TokenNameCOMMENT_LINE	start the worker thread and leave it running 
worker	TokenNameIdentifier	 worker
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//start the probe+test sequence 	TokenNameCOMMENT_LINE	start the probe+test sequence 
timedTests	TokenNameIdentifier	 timed Tests
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Record the exception and continue 	TokenNameCOMMENT_LINE	Record the exception and continue 
testException	TokenNameIdentifier	 test Exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
//teardown always runs; its faults are filed away 	TokenNameCOMMENT_LINE	teardown always runs; its faults are filed away 
if	TokenNameif	
(	TokenNameLPAREN	
teardown	TokenNameIdentifier	 teardown
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Parallel	TokenNameIdentifier	 Parallel
teardownRun	TokenNameIdentifier	 teardown Run
=	TokenNameEQUAL	
newParallel	TokenNameIdentifier	 new Parallel
(	TokenNameLPAREN	
timeoutMillis	TokenNameIdentifier	 timeout Millis
,	TokenNameCOMMA	
teardown	TokenNameIdentifier	 teardown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
teardownRun	TokenNameIdentifier	 teardown Run
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
teardownException	TokenNameIdentifier	 teardown Exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//we get here whether or not the tests/teardown have thrown a BuildException. 	TokenNameCOMMENT_LINE	we get here whether or not the tests/teardown have thrown a BuildException. 
//do a forced shutdown of the running application, before processing the faults 	TokenNameCOMMENT_LINE	do a forced shutdown of the running application, before processing the faults 
try	TokenNametry	
{	TokenNameLBRACE	
//wait for the worker to have finished 	TokenNameCOMMENT_LINE	wait for the worker to have finished 
long	TokenNamelong	
shutdownTimeMillis	TokenNameIdentifier	 shutdown Time Millis
=	TokenNameEQUAL	
shutdownTime	TokenNameIdentifier	 shutdown Time
*	TokenNameMULTIPLY	
shutdownUnitMultiplier	TokenNameIdentifier	 shutdown Unit Multiplier
;	TokenNameSEMICOLON	
worker	TokenNameIdentifier	 worker
.	TokenNameDOT	
waitUntilFinished	TokenNameIdentifier	 wait Until Finished
(	TokenNameLPAREN	
shutdownTimeMillis	TokenNameIdentifier	 shutdown Time Millis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
worker	TokenNameIdentifier	 worker
.	TokenNameDOT	
isAlive	TokenNameIdentifier	 is Alive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//then, if it is still running, interrupt it a second time. 	TokenNameCOMMENT_LINE	then, if it is still running, interrupt it a second time. 
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
APPLICATION_FORCIBLY_SHUT_DOWN	TokenNameIdentifier	 APPLICATION  FORCIBLY  SHUT  DOWN
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
worker	TokenNameIdentifier	 worker
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
worker	TokenNameIdentifier	 worker
.	TokenNameDOT	
waitUntilFinished	TokenNameIdentifier	 wait Until Finished
(	TokenNameLPAREN	
shutdownTimeMillis	TokenNameIdentifier	 shutdown Time Millis
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
//success, something interrupted the shutdown. There may be a leaked 	TokenNameCOMMENT_LINE	success, something interrupted the shutdown. There may be a leaked 
//worker; 	TokenNameCOMMENT_LINE	worker; 
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
SHUTDOWN_INTERRUPTED	TokenNameIdentifier	 SHUTDOWN  INTERRUPTED
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
applicationException	TokenNameIdentifier	 application Exception
=	TokenNameEQUAL	
worker	TokenNameIdentifier	 worker
.	TokenNameDOT	
getBuildException	TokenNameIdentifier	 get Build Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Now faults are analysed 	TokenNameCOMMENT_LINE	Now faults are analysed 
processExceptions	TokenNameIdentifier	 process Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Now faults are analysed. * <p> The priority is * <ol> * <li>testexceptions, except those indicating a build timeout when the application itself failed.<br> (because often it is the application fault that is more interesting than the probe failure, which is usually triggered by the application not starting </li><li> Application exceptions (above test timeout exceptions) </li><li> Teardown exceptions -except when they are being ignored </li><li> Test failures as indicated by the failure property </li></ol> */	TokenNameCOMMENT_JAVADOC	 Now faults are analysed. <p> The priority is <ol> <li>testexceptions, except those indicating a build timeout when the application itself failed.<br> (because often it is the application fault that is more interesting than the probe failure, which is usually triggered by the application not starting </li><li> Application exceptions (above test timeout exceptions) </li><li> Teardown exceptions -except when they are being ignored </li><li> Test failures as indicated by the failure property </li></ol> 
protected	TokenNameprotected	
void	TokenNamevoid	
processExceptions	TokenNameIdentifier	 process Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
taskException	TokenNameIdentifier	 task Exception
=	TokenNameEQUAL	
testException	TokenNameIdentifier	 test Exception
;	TokenNameSEMICOLON	
//look for an application fault 	TokenNameCOMMENT_LINE	look for an application fault 
if	TokenNameif	
(	TokenNameLPAREN	
applicationException	TokenNameIdentifier	 application Exception
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
taskException	TokenNameIdentifier	 task Exception
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
taskException	TokenNameIdentifier	 task Exception
instanceof	TokenNameinstanceof	
BuildTimeoutException	TokenNameIdentifier	 Build Timeout Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
taskException	TokenNameIdentifier	 task Exception
=	TokenNameEQUAL	
applicationException	TokenNameIdentifier	 application Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ignoringThrowable	TokenNameIdentifier	 ignoring Throwable
(	TokenNameLPAREN	
APPLICATION_EXCEPTION	TokenNameIdentifier	 APPLICATION  EXCEPTION
,	TokenNameCOMMA	
applicationException	TokenNameIdentifier	 application Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//now look for teardown faults, which may be ignored 	TokenNameCOMMENT_LINE	now look for teardown faults, which may be ignored 
if	TokenNameif	
(	TokenNameLPAREN	
teardownException	TokenNameIdentifier	 teardown Exception
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
taskException	TokenNameIdentifier	 task Exception
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
failOnTeardownErrors	TokenNameIdentifier	 fail On Teardown Errors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
taskException	TokenNameIdentifier	 task Exception
=	TokenNameEQUAL	
teardownException	TokenNameIdentifier	 teardown Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//don't let the cleanup exception get in the way of any other failure 	TokenNameCOMMENT_LINE	don't let the cleanup exception get in the way of any other failure 
ignoringThrowable	TokenNameIdentifier	 ignoring Throwable
(	TokenNameLPAREN	
TEARDOWN_EXCEPTION	TokenNameIdentifier	 TEARDOWN  EXCEPTION
,	TokenNameCOMMA	
teardownException	TokenNameIdentifier	 teardown Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//now, analyse the tests 	TokenNameCOMMENT_LINE	now, analyse the tests 
if	TokenNameif	
(	TokenNameLPAREN	
failureProperty	TokenNameIdentifier	 failure Property
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
failureProperty	TokenNameIdentifier	 failure Property
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//we've failed 	TokenNameCOMMENT_LINE	we've failed 
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
failureMessage	TokenNameIdentifier	 failure Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
taskException	TokenNameIdentifier	 task Exception
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
taskException	TokenNameIdentifier	 task Exception
=	TokenNameEQUAL	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
failureMessage	TokenNameIdentifier	 failure Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//at this point taskException is null or not. 	TokenNameCOMMENT_LINE	at this point taskException is null or not. 
//if not, throw the exception 	TokenNameCOMMENT_LINE	if not, throw the exception 
if	TokenNameif	
(	TokenNameLPAREN	
taskException	TokenNameIdentifier	 task Exception
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
taskException	TokenNameIdentifier	 task Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * log that we are ignoring something rather than rethrowing it. * @param type name of exception * @param thrown what was thrown */	TokenNameCOMMENT_JAVADOC	 log that we are ignoring something rather than rethrowing it. @param type name of exception @param thrown what was thrown 
protected	TokenNameprotected	
void	TokenNamevoid	
ignoringThrowable	TokenNameIdentifier	 ignoring Throwable
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
thrown	TokenNameIdentifier	 thrown
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
thrown	TokenNameIdentifier	 thrown
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
thrown	TokenNameIdentifier	 thrown
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
NestedCondition	TokenNameIdentifier	 Nested Condition
extends	TokenNameextends	
ConditionBase	TokenNameIdentifier	 Condition Base
implements	TokenNameimplements	
Condition	TokenNameIdentifier	 Condition
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
countConditions	TokenNameIdentifier	 count Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"A single nested condition is required."	TokenNameStringLiteral	A single nested condition is required.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Condition	TokenNameIdentifier	 Condition
)	TokenNameRPAREN	
(	TokenNameLPAREN	
getConditions	TokenNameIdentifier	 get Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
