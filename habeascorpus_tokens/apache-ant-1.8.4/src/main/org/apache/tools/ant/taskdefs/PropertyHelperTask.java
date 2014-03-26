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
MagicNames	TokenNameIdentifier	 Magic Names
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
PropertyHelper	TokenNameIdentifier	 Property Helper
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
/** * This task is designed to allow the user to install a different * PropertyHelper on the current Project. This task also allows the * installation of PropertyHelper delegates on either the newly installed * or existing PropertyHelper. * @since Ant 1.8 */	TokenNameCOMMENT_JAVADOC	 This task is designed to allow the user to install a different PropertyHelper on the current Project. This task also allows the installation of PropertyHelper delegates on either the newly installed or existing PropertyHelper. @since Ant 1.8 
public	TokenNamepublic	
class	TokenNameclass	
PropertyHelperTask	TokenNameIdentifier	 Property Helper Task
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/** * Nested delegate for refid usage. */	TokenNameCOMMENT_JAVADOC	 Nested delegate for refid usage. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
DelegateElement	TokenNameIdentifier	 Delegate Element
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
refid	TokenNameIdentifier	 refid
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DelegateElement	TokenNameIdentifier	 Delegate Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Get the refid. * @return String */	TokenNameCOMMENT_JAVADOC	 Get the refid. @return String 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRefid	TokenNameIdentifier	 get Refid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
refid	TokenNameIdentifier	 refid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the refid. * @param refid the String to set */	TokenNameCOMMENT_JAVADOC	 Set the refid. @param refid the String to set 
public	TokenNamepublic	
void	TokenNamevoid	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
refid	TokenNameIdentifier	 refid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
refid	TokenNameIdentifier	 refid
=	TokenNameEQUAL	
refid	TokenNameIdentifier	 refid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
Delegate	TokenNameIdentifier	 Delegate
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
refid	TokenNameIdentifier	 refid
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"refid required for generic delegate"	TokenNameStringLiteral	refid required for generic delegate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
Delegate	TokenNameIdentifier	 Delegate
)	TokenNameRPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
refid	TokenNameIdentifier	 refid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
PropertyHelper	TokenNameIdentifier	 Property Helper
propertyHelper	TokenNameIdentifier	 property Helper
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
delegates	TokenNameIdentifier	 delegates
;	TokenNameSEMICOLON	
/** * Add a new PropertyHelper to be set on the Project. * @param propertyHelper the PropertyHelper to set. */	TokenNameCOMMENT_JAVADOC	 Add a new PropertyHelper to be set on the Project. @param propertyHelper the PropertyHelper to set. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
addConfigured	TokenNameIdentifier	 add Configured
(	TokenNameLPAREN	
PropertyHelper	TokenNameIdentifier	 Property Helper
propertyHelper	TokenNameIdentifier	 property Helper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
propertyHelper	TokenNameIdentifier	 property Helper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Only one PropertyHelper can be installed"	TokenNameStringLiteral	Only one PropertyHelper can be installed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
propertyHelper	TokenNameIdentifier	 property Helper
=	TokenNameEQUAL	
propertyHelper	TokenNameIdentifier	 property Helper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a PropertyHelper delegate to the existing or new PropertyHelper. * @param delegate the delegate to add. */	TokenNameCOMMENT_JAVADOC	 Add a PropertyHelper delegate to the existing or new PropertyHelper. @param delegate the delegate to add. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
addConfigured	TokenNameIdentifier	 add Configured
(	TokenNameLPAREN	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
Delegate	TokenNameIdentifier	 Delegate
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getAddDelegateList	TokenNameIdentifier	 get Add Delegate List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a nested &lt;delegate refid="foo" /&gt; element. * @return DelegateElement */	TokenNameCOMMENT_JAVADOC	 Add a nested &lt;delegate refid="foo" /&gt; element. @return DelegateElement 
public	TokenNamepublic	
DelegateElement	TokenNameIdentifier	 Delegate Element
createDelegate	TokenNameIdentifier	 create Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DelegateElement	TokenNameIdentifier	 Delegate Element
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
DelegateElement	TokenNameIdentifier	 Delegate Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getAddDelegateList	TokenNameIdentifier	 get Add Delegate List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the task. * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 Execute the task. @throws BuildException on error. 
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
"Project instance not set"	TokenNameStringLiteral	Project instance not set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
propertyHelper	TokenNameIdentifier	 property Helper
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
delegates	TokenNameIdentifier	 delegates
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Either a new PropertyHelper"	TokenNameStringLiteral	Either a new PropertyHelper
+	TokenNamePLUS	
" or one or more PropertyHelper delegates are required"	TokenNameStringLiteral	 or one or more PropertyHelper delegates are required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PropertyHelper	TokenNameIdentifier	 Property Helper
ph	TokenNameIdentifier	 ph
=	TokenNameEQUAL	
propertyHelper	TokenNameIdentifier	 property Helper
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ph	TokenNameIdentifier	 ph
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ph	TokenNameIdentifier	 ph
=	TokenNameEQUAL	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ph	TokenNameIdentifier	 ph
=	TokenNameEQUAL	
propertyHelper	TokenNameIdentifier	 property Helper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
ph	TokenNameIdentifier	 ph
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
delegates	TokenNameIdentifier	 delegates
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
delegates	TokenNameIdentifier	 delegates
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
Delegate	TokenNameIdentifier	 Delegate
delegate	TokenNameIdentifier	 delegate
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
DelegateElement	TokenNameIdentifier	 Delegate Element
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DelegateElement	TokenNameIdentifier	 Delegate Element
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
Delegate	TokenNameIdentifier	 Delegate
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Adding PropertyHelper delegate "	TokenNameStringLiteral	Adding PropertyHelper delegate 
+	TokenNamePLUS	
delegate	TokenNameIdentifier	 delegate
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
propertyHelper	TokenNameIdentifier	 property Helper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Installing PropertyHelper "	TokenNameStringLiteral	Installing PropertyHelper 
+	TokenNamePLUS	
propertyHelper	TokenNameIdentifier	 property Helper
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO copy existing properties to new PH? 	TokenNameCOMMENT_LINE	TODO copy existing properties to new PH? 
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
REFID_PROPERTY_HELPER	TokenNameIdentifier	 REFID  PROPERTY  HELPER
,	TokenNameCOMMA	
propertyHelper	TokenNameIdentifier	 property Helper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
List	TokenNameIdentifier	 List
getAddDelegateList	TokenNameIdentifier	 get Add Delegate List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
delegates	TokenNameIdentifier	 delegates
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
delegates	TokenNameIdentifier	 delegates
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
delegates	TokenNameIdentifier	 delegates
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
