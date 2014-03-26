/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * <p>Helper class for the check of the configuration of a given task. * This class provides methods for making assumptions about the task configuration. * After collecting all violations with <tt>assert*</tt> and <tt>fail</tt> * methods the <tt>checkErrors</tt> will throw a BuildException with all collected * messages or does nothing if there wasn't any error.</p> * * <p>Example:</p> * * <pre> * public class MyTask extends Task { * ... * public void execute() { * TaskConfigurationChecker checker = TaskConfigurationChecker(this); * checker.assertConfig( * srcdir != null, * "Attribute 'srcdir' must be set. * ); * checker.assertConfig( * srcdir.exists(), * "Srcdir (" + srcdir + ") must exist." * ); * if (someComplexCondition()) { * fail("Complex condition failed."); * } * checker.checkErrors(); * } * } * </pre> * * @see <a href="http://martinfowler.com/eaaDev/Notification.html">Notification Pattern</a> */	TokenNameCOMMENT_JAVADOC	 <p>Helper class for the check of the configuration of a given task. This class provides methods for making assumptions about the task configuration. After collecting all violations with <tt>assert*</tt> and <tt>fail</tt> methods the <tt>checkErrors</tt> will throw a BuildException with all collected messages or does nothing if there wasn't any error.</p> * <p>Example:</p> * <pre> public class MyTask extends Task { ... public void execute() { TaskConfigurationChecker checker = TaskConfigurationChecker(this); checker.assertConfig( srcdir != null, "Attribute 'srcdir' must be set. ); checker.assertConfig( srcdir.exists(), "Srcdir (" + srcdir + ") must exist." ); if (someComplexCondition()) { fail("Complex condition failed."); } checker.checkErrors(); } } </pre> * @see <a href="http://martinfowler.com/eaaDev/Notification.html">Notification Pattern</a> 
public	TokenNamepublic	
class	TokenNameclass	
TaskConfigurationChecker	TokenNameIdentifier	 Task Configuration Checker
{	TokenNameLBRACE	
/** List of all collected error messages. */	TokenNameCOMMENT_JAVADOC	 List of all collected error messages. 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
/*<String>*/	TokenNameCOMMENT_BLOCK	<String>
errors	TokenNameIdentifier	 errors
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Task for which the configuration should be checked. */	TokenNameCOMMENT_JAVADOC	 Task for which the configuration should be checked. 
private	TokenNameprivate	
final	TokenNamefinal	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
/** * Constructor. * @param task which task should be checked */	TokenNameCOMMENT_JAVADOC	 Constructor. @param task which task should be checked 
public	TokenNamepublic	
TaskConfigurationChecker	TokenNameIdentifier	 Task Configuration Checker
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Asserts that a condition is true. * @param condition which condition to check * @param errormessage errormessage to throw if a condition failed */	TokenNameCOMMENT_JAVADOC	 Asserts that a condition is true. @param condition which condition to check @param errormessage errormessage to throw if a condition failed 
public	TokenNamepublic	
void	TokenNamevoid	
assertConfig	TokenNameIdentifier	 assert Config
(	TokenNameLPAREN	
boolean	TokenNameboolean	
condition	TokenNameIdentifier	 condition
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
errormessage	TokenNameIdentifier	 errormessage
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
condition	TokenNameIdentifier	 condition
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errors	TokenNameIdentifier	 errors
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
errormessage	TokenNameIdentifier	 errormessage
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Registers an error. * @param errormessage the message for the registered error */	TokenNameCOMMENT_JAVADOC	 Registers an error. @param errormessage the message for the registered error 
public	TokenNamepublic	
void	TokenNamevoid	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
errormessage	TokenNameIdentifier	 errormessage
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errors	TokenNameIdentifier	 errors
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
errormessage	TokenNameIdentifier	 errormessage
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if there are any collected errors and throws a BuildException * with all messages if there was one or more. * @throws BuildException if one or more errors were registered */	TokenNameCOMMENT_JAVADOC	 Checks if there are any collected errors and throws a BuildException with all messages if there was one or more. @throws BuildException if one or more errors were registered 
public	TokenNamepublic	
void	TokenNamevoid	
checkErrors	TokenNameIdentifier	 check Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
errors	TokenNameIdentifier	 errors
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Configurationerror on <"	TokenNameStringLiteral	Configurationerror on <
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
">:"	TokenNameStringLiteral	>:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
errors	TokenNameIdentifier	 errors
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"- "	TokenNameStringLiteral	- 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
