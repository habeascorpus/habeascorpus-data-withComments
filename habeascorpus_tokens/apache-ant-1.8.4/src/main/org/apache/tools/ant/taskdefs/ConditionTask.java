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
/** * Task to set a property conditionally using &lt;uptodate&gt;, &lt;available&gt;, * and many other supported conditions. * * <p>This task supports boolean logic as well as pluggable conditions * to decide, whether a property should be set.</p> * * <p>This task does not extend Task to take advantage of * ConditionBase.</p> * * @since Ant 1.4 * * @ant.task category="control" */	TokenNameCOMMENT_JAVADOC	 Task to set a property conditionally using &lt;uptodate&gt;, &lt;available&gt;, and many other supported conditions. * <p>This task supports boolean logic as well as pluggable conditions to decide, whether a property should be set.</p> * <p>This task does not extend Task to take advantage of ConditionBase.</p> * @since Ant 1.4 * @ant.task category="control" 
public	TokenNamepublic	
class	TokenNameclass	
ConditionTask	TokenNameIdentifier	 Condition Task
extends	TokenNameextends	
ConditionBase	TokenNameIdentifier	 Condition Base
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
"true"	TokenNameStringLiteral	true
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
alternative	TokenNameIdentifier	 alternative
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Constructor, names this task "condition". */	TokenNameCOMMENT_JAVADOC	 Constructor, names this task "condition". 
public	TokenNamepublic	
ConditionTask	TokenNameIdentifier	 Condition Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"condition"	TokenNameStringLiteral	condition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The name of the property to set. Required. * @param p the name of the property * @since Ant 1.4 */	TokenNameCOMMENT_JAVADOC	 The name of the property to set. Required. @param p the name of the property @since Ant 1.4 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
property	TokenNameIdentifier	 property
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The value for the property to set, if condition evaluates to true. * Defaults to "true". * @param value the (Object) value of the property * @since Ant 1.8 */	TokenNameCOMMENT_JAVADOC	 The value for the property to set, if condition evaluates to true. Defaults to "true". @param value the (Object) value of the property @since Ant 1.8 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The value for the property to set, if condition evaluates to true. * Defaults to "true". * @param v the value of the property * @since Ant 1.4 */	TokenNameCOMMENT_JAVADOC	 The value for the property to set, if condition evaluates to true. Defaults to "true". @param v the value of the property @since Ant 1.4 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The value for the property to set, if condition evaluates to false. * If this attribute is not specified, the property will not be set. * @param alt the alternate value of the property. * @since Ant 1.8 */	TokenNameCOMMENT_JAVADOC	 The value for the property to set, if condition evaluates to false. If this attribute is not specified, the property will not be set. @param alt the alternate value of the property. @since Ant 1.8 
public	TokenNamepublic	
void	TokenNamevoid	
setElse	TokenNameIdentifier	 set Else
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
alt	TokenNameIdentifier	 alt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
alternative	TokenNameIdentifier	 alternative
=	TokenNameEQUAL	
alt	TokenNameIdentifier	 alt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The value for the property to set, if condition evaluates to false. * If this attribute is not specified, the property will not be set. * @param e the alternate value of the property. * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 The value for the property to set, if condition evaluates to false. If this attribute is not specified, the property will not be set. @param e the alternate value of the property. @since Ant 1.6.3 
public	TokenNamepublic	
void	TokenNamevoid	
setElse	TokenNameIdentifier	 set Else
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setElse	TokenNameIdentifier	 set Else
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See whether our nested condition holds and set the property. * * @since Ant 1.4 * @exception BuildException if an error occurs */	TokenNameCOMMENT_JAVADOC	 See whether our nested condition holds and set the property. * @since Ant 1.4 @exception BuildException if an error occurs 
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
"You must not nest more than one condition into <"	TokenNameStringLiteral	You must not nest more than one condition into <
+	TokenNamePLUS	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
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
"You must nest a condition into <"	TokenNameStringLiteral	You must nest a condition into <
+	TokenNamePLUS	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The property attribute is required."	TokenNameStringLiteral	The property attribute is required.
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
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Condition true; setting "	TokenNameStringLiteral	Condition true; setting 
+	TokenNamePLUS	
property	TokenNameIdentifier	 property
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
alternative	TokenNameIdentifier	 alternative
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Condition false; setting "	TokenNameStringLiteral	Condition false; setting 
+	TokenNamePLUS	
property	TokenNameIdentifier	 property
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
alternative	TokenNameIdentifier	 alternative
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
alternative	TokenNameIdentifier	 alternative
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Condition false; not setting "	TokenNameStringLiteral	Condition false; not setting 
+	TokenNamePLUS	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
