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
/** * A task to provide "nice-ness" to the current thread, and/or to * query the current value. * Examples: * <pre> &lt;nice currentPriority="current.value" &gt;</pre><p> * Set <code>currentPriority</code> to the current priority * <pre> &lt;nice newPriority="10" &gt;</pre><p> * Raise the priority of the build process (But not forked programs) * <pre> &lt;nice currentPriority="old" newPriority="3" &gt;</pre><p> * Lower the priority of the build process (But not forked programs), and save * the old value to the property <code>old</code>. * * @ant.task name="nice" category="control" */	TokenNameCOMMENT_JAVADOC	 A task to provide "nice-ness" to the current thread, and/or to query the current value. Examples: <pre> &lt;nice currentPriority="current.value" &gt;</pre><p> Set <code>currentPriority</code> to the current priority <pre> &lt;nice newPriority="10" &gt;</pre><p> Raise the priority of the build process (But not forked programs) <pre> &lt;nice currentPriority="old" newPriority="3" &gt;</pre><p> Lower the priority of the build process (But not forked programs), and save the old value to the property <code>old</code>. * @ant.task name="nice" category="control" 
public	TokenNamepublic	
class	TokenNameclass	
Nice	TokenNameIdentifier	 Nice
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/** * the new priority */	TokenNameCOMMENT_JAVADOC	 the new priority 
private	TokenNameprivate	
Integer	TokenNameIdentifier	 Integer
newPriority	TokenNameIdentifier	 new Priority
;	TokenNameSEMICOLON	
/** * the current priority */	TokenNameCOMMENT_JAVADOC	 the current priority 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
currentPriority	TokenNameIdentifier	 current Priority
;	TokenNameSEMICOLON	
/** * Execute the task * @exception BuildException if something goes wrong with the build */	TokenNameCOMMENT_JAVADOC	 Execute the task @exception BuildException if something goes wrong with the build 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
self	TokenNameIdentifier	 self
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
priority	TokenNameIdentifier	 priority
=	TokenNameEQUAL	
self	TokenNameIdentifier	 self
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentPriority	TokenNameIdentifier	 current Priority
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
currentPriority	TokenNameIdentifier	 current Priority
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//if there is a new priority, and it is different, change it 	TokenNameCOMMENT_LINE	if there is a new priority, and it is different, change it 
if	TokenNameif	
(	TokenNameLPAREN	
newPriority	TokenNameIdentifier	 new Priority
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
priority	TokenNameIdentifier	 priority
!=	TokenNameNOT_EQUAL	
newPriority	TokenNameIdentifier	 new Priority
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
self	TokenNameIdentifier	 self
.	TokenNameDOT	
setPriority	TokenNameIdentifier	 set Priority
(	TokenNameLPAREN	
newPriority	TokenNameIdentifier	 new Priority
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//catch permissions denial and keep going 	TokenNameCOMMENT_LINE	catch permissions denial and keep going 
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Unable to set new priority -a security manager is in the way"	TokenNameStringLiteral	Unable to set new priority -a security manager is in the way
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
iae	TokenNameIdentifier	 iae
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Priority out of range"	TokenNameStringLiteral	Priority out of range
,	TokenNameCOMMA	
iae	TokenNameIdentifier	 iae
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The name of a property to set to the value of the current * thread priority. Optional * @param currentPriority the property name. */	TokenNameCOMMENT_JAVADOC	 The name of a property to set to the value of the current thread priority. Optional @param currentPriority the property name. 
public	TokenNamepublic	
void	TokenNamevoid	
setCurrentPriority	TokenNameIdentifier	 set Current Priority
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
currentPriority	TokenNameIdentifier	 current Priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
currentPriority	TokenNameIdentifier	 current Priority
=	TokenNameEQUAL	
currentPriority	TokenNameIdentifier	 current Priority
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * the new priority, in the range 1-10. * @param newPriority the new priority value. */	TokenNameCOMMENT_JAVADOC	 the new priority, in the range 1-10. @param newPriority the new priority value. 
public	TokenNamepublic	
void	TokenNamevoid	
setNewPriority	TokenNameIdentifier	 set New Priority
(	TokenNameLPAREN	
int	TokenNameint	
newPriority	TokenNameIdentifier	 new Priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newPriority	TokenNameIdentifier	 new Priority
<	TokenNameLESS	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
MIN_PRIORITY	TokenNameIdentifier	 MIN  PRIORITY
||	TokenNameOR_OR	
newPriority	TokenNameIdentifier	 new Priority
>	TokenNameGREATER	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
MAX_PRIORITY	TokenNameIdentifier	 MAX  PRIORITY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The thread priority is out of the range 1-10"	TokenNameStringLiteral	The thread priority is out of the range 1-10
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
newPriority	TokenNameIdentifier	 new Priority
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
newPriority	TokenNameIdentifier	 new Priority
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
