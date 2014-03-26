/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
jmx	TokenNameIdentifier	 jmx
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
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
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
AttributeList	TokenNameIdentifier	 Attribute List
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
DynamicMBean	TokenNameIdentifier	 Dynamic M Bean
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
InstanceAlreadyExistsException	TokenNameIdentifier	 Instance Already Exists Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
InstanceNotFoundException	TokenNameIdentifier	 Instance Not Found Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
JMException	TokenNameIdentifier	 JM Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
MBeanRegistration	TokenNameIdentifier	 M Bean Registration
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
MBeanRegistrationException	TokenNameIdentifier	 M Bean Registration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
MBeanServer	TokenNameIdentifier	 M Bean Server
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
NotCompliantMBeanException	TokenNameIdentifier	 Not Compliant M Bean Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
ObjectName	TokenNameIdentifier	 Object Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
management	TokenNameIdentifier	 management
.	TokenNameDOT	
RuntimeOperationsException	TokenNameIdentifier	 Runtime Operations Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Appender	TokenNameIdentifier	 Appender
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractDynamicMBean	TokenNameIdentifier	 Abstract Dynamic M Bean
implements	TokenNameimplements	
DynamicMBean	TokenNameIdentifier	 Dynamic M Bean
,	TokenNameCOMMA	
MBeanRegistration	TokenNameIdentifier	 M Bean Registration
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
dClassName	TokenNameIdentifier	 d Class Name
;	TokenNameSEMICOLON	
MBeanServer	TokenNameIdentifier	 M Bean Server
server	TokenNameIdentifier	 server
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Vector	TokenNameIdentifier	 Vector
mbeanList	TokenNameIdentifier	 mbean List
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get MBean name. * @param appender appender, may not be null. * @return name. * @since 1.2.16 */	TokenNameCOMMENT_JAVADOC	 Get MBean name. @param appender appender, may not be null. @return name. @since 1.2.16 
static	TokenNamestatic	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getAppenderName	TokenNameIdentifier	 get Appender Name
(	TokenNameLPAREN	
final	TokenNamefinal	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// try to get some form of a name, because null is not allowed (exception), and empty string certainly isn't useful in JMX.. 	TokenNameCOMMENT_LINE	try to get some form of a name, because null is not allowed (exception), and empty string certainly isn't useful in JMX.. 
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Enables the to get the values of several attributes of the Dynamic MBean. */	TokenNameCOMMENT_JAVADOC	 Enables the to get the values of several attributes of the Dynamic MBean. 
public	TokenNamepublic	
AttributeList	TokenNameIdentifier	 Attribute List
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attributeNames	TokenNameIdentifier	 attribute Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check attributeNames is not null to avoid NullPointerException later on 	TokenNameCOMMENT_LINE	Check attributeNames is not null to avoid NullPointerException later on 
if	TokenNameif	
(	TokenNameLPAREN	
attributeNames	TokenNameIdentifier	 attribute Names
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeOperationsException	TokenNameIdentifier	 Runtime Operations Exception
(	TokenNameLPAREN	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"attributeNames[] cannot be null"	TokenNameStringLiteral	attributeNames[] cannot be null
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"Cannot invoke a getter of "	TokenNameStringLiteral	Cannot invoke a getter of 
+	TokenNamePLUS	
dClassName	TokenNameIdentifier	 d Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AttributeList	TokenNameIdentifier	 Attribute List
resultList	TokenNameIdentifier	 result List
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeList	TokenNameIdentifier	 Attribute List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if attributeNames is empty, return an empty result list 	TokenNameCOMMENT_LINE	if attributeNames is empty, return an empty result list 
if	TokenNameif	
(	TokenNameLPAREN	
attributeNames	TokenNameIdentifier	 attribute Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
resultList	TokenNameIdentifier	 result List
;	TokenNameSEMICOLON	
// build the result attribute list 	TokenNameCOMMENT_LINE	build the result attribute list 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attributeNames	TokenNameIdentifier	 attribute Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
attributeNames	TokenNameIdentifier	 attribute Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultList	TokenNameIdentifier	 result List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
(	TokenNameLPAREN	
attributeNames	TokenNameIdentifier	 attribute Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
JMException	TokenNameIdentifier	 JM Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
resultList	TokenNameIdentifier	 result List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the values of several attributes of the Dynamic MBean, and returns the * list of attributes that have been set. */	TokenNameCOMMENT_JAVADOC	 Sets the values of several attributes of the Dynamic MBean, and returns the list of attributes that have been set. 
public	TokenNamepublic	
AttributeList	TokenNameIdentifier	 Attribute List
setAttributes	TokenNameIdentifier	 set Attributes
(	TokenNameLPAREN	
AttributeList	TokenNameIdentifier	 Attribute List
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check attributes is not null to avoid NullPointerException later on 	TokenNameCOMMENT_LINE	Check attributes is not null to avoid NullPointerException later on 
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeOperationsException	TokenNameIdentifier	 Runtime Operations Exception
(	TokenNameLPAREN	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"AttributeList attributes cannot be null"	TokenNameStringLiteral	AttributeList attributes cannot be null
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"Cannot invoke a setter of "	TokenNameStringLiteral	Cannot invoke a setter of 
+	TokenNamePLUS	
dClassName	TokenNameIdentifier	 d Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AttributeList	TokenNameIdentifier	 Attribute List
resultList	TokenNameIdentifier	 result List
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeList	TokenNameIdentifier	 Attribute List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if attributeNames is empty, nothing more to do 	TokenNameCOMMENT_LINE	if attributeNames is empty, nothing more to do 
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
resultList	TokenNameIdentifier	 result List
;	TokenNameSEMICOLON	
// for each attribute, try to set it and add to the result list if successfull 	TokenNameCOMMENT_LINE	for each attribute, try to set it and add to the result list if successfull 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Attribute	TokenNameIdentifier	 Attribute
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultList	TokenNameIdentifier	 result List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
JMException	TokenNameIdentifier	 JM Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
resultList	TokenNameIdentifier	 result List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
abstract	TokenNameabstract	
Logger	TokenNameIdentifier	 Logger
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
postDeregister	TokenNameIdentifier	 post Deregister
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"postDeregister is called."	TokenNameStringLiteral	postDeregister is called.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
postRegister	TokenNameIdentifier	 post Register
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Boolean	TokenNameIdentifier	 Boolean
registrationDone	TokenNameIdentifier	 registration Done
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ObjectName	TokenNameIdentifier	 Object Name
preRegister	TokenNameIdentifier	 pre Register
(	TokenNameLPAREN	
MBeanServer	TokenNameIdentifier	 M Bean Server
server	TokenNameIdentifier	 server
,	TokenNameCOMMA	
ObjectName	TokenNameIdentifier	 Object Name
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"preRegister called. Server="	TokenNameStringLiteral	preRegister called. Server=
+	TokenNamePLUS	
server	TokenNameIdentifier	 server
+	TokenNamePLUS	
", name="	TokenNameStringLiteral	, name=
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
server	TokenNameIdentifier	 server
;	TokenNameSEMICOLON	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Registers MBean instance in the attached server. Must <em>NOT</em> * be called before registration of this instance. */	TokenNameCOMMENT_JAVADOC	 Registers MBean instance in the attached server. Must <em>NOT</em> be called before registration of this instance. 
protected	TokenNameprotected	
void	TokenNamevoid	
registerMBean	TokenNameIdentifier	 register M Bean
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
mbean	TokenNameIdentifier	 mbean
,	TokenNameCOMMA	
ObjectName	TokenNameIdentifier	 Object Name
objectName	TokenNameIdentifier	 object Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
InstanceAlreadyExistsException	TokenNameIdentifier	 Instance Already Exists Exception
,	TokenNameCOMMA	
MBeanRegistrationException	TokenNameIdentifier	 M Bean Registration Exception
,	TokenNameCOMMA	
NotCompliantMBeanException	TokenNameIdentifier	 Not Compliant M Bean Exception
{	TokenNameLBRACE	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
registerMBean	TokenNameIdentifier	 register M Bean
(	TokenNameLPAREN	
mbean	TokenNameIdentifier	 mbean
,	TokenNameCOMMA	
objectName	TokenNameIdentifier	 object Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mbeanList	TokenNameIdentifier	 mbean List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
objectName	TokenNameIdentifier	 object Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs cleanup for deregistering this MBean. Default implementation * unregisters MBean instances which are registered using * {@link #registerMBean(Object mbean, ObjectName objectName)}. */	TokenNameCOMMENT_JAVADOC	 Performs cleanup for deregistering this MBean. Default implementation unregisters MBean instances which are registered using {@link #registerMBean(Object mbean, ObjectName objectName)}. 
public	TokenNamepublic	
void	TokenNamevoid	
preDeregister	TokenNameIdentifier	 pre Deregister
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"preDeregister called."	TokenNameStringLiteral	preDeregister called.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
mbeanList	TokenNameIdentifier	 mbean List
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ObjectName	TokenNameIdentifier	 Object Name
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ObjectName	TokenNameIdentifier	 Object Name
)	TokenNameRPAREN	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
unregisterMBean	TokenNameIdentifier	 unregister M Bean
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InstanceNotFoundException	TokenNameIdentifier	 Instance Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Missing MBean "	TokenNameStringLiteral	Missing MBean 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getCanonicalName	TokenNameIdentifier	 get Canonical Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MBeanRegistrationException	TokenNameIdentifier	 M Bean Registration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Failed unregistering "	TokenNameStringLiteral	Failed unregistering 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getCanonicalName	TokenNameIdentifier	 get Canonical Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
