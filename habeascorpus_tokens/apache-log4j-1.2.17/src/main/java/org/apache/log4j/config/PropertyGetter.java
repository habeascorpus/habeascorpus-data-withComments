/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
config	TokenNameIdentifier	 config
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
LogLog	TokenNameIdentifier	 Log Log
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
beans	TokenNameIdentifier	 beans
.	TokenNameDOT	
BeanInfo	TokenNameIdentifier	 Bean Info
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
beans	TokenNameIdentifier	 beans
.	TokenNameDOT	
IntrospectionException	TokenNameIdentifier	 Introspection Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
beans	TokenNameIdentifier	 beans
.	TokenNameDOT	
Introspector	TokenNameIdentifier	 Introspector
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
beans	TokenNameIdentifier	 beans
.	TokenNameDOT	
PropertyDescriptor	TokenNameIdentifier	 Property Descriptor
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
/** Used for inferring configuration information for a log4j's component. @author Anders Kristensen */	TokenNameCOMMENT_JAVADOC	 Used for inferring configuration information for a log4j's component. @author Anders Kristensen 
public	TokenNamepublic	
class	TokenNameclass	
PropertyGetter	TokenNameIdentifier	 Property Getter
{	TokenNameLBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NULL_ARG	TokenNameIdentifier	 NULL  ARG
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
PropertyDescriptor	TokenNameIdentifier	 Property Descriptor
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
props	TokenNameIdentifier	 props
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
PropertyCallback	TokenNameIdentifier	 Property Callback
{	TokenNameLBRACE	
void	TokenNamevoid	
foundProperty	TokenNameIdentifier	 found Property
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a new PropertyGetter for the specified Object. This is done in prepartion for invoking {@link #getProperties(PropertyGetter.PropertyCallback, String)} one or more times. @param obj the object for which to set properties */	TokenNameCOMMENT_JAVADOC	 Create a new PropertyGetter for the specified Object. This is done in prepartion for invoking {@link #getProperties(PropertyGetter.PropertyCallback, String)} one or more times. @param obj the object for which to set properties 
public	TokenNamepublic	
PropertyGetter	TokenNameIdentifier	 Property Getter
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
throws	TokenNamethrows	
IntrospectionException	TokenNameIdentifier	 Introspection Exception
{	TokenNameLBRACE	
BeanInfo	TokenNameIdentifier	 Bean Info
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
Introspector	TokenNameIdentifier	 Introspector
.	TokenNameDOT	
getBeanInfo	TokenNameIdentifier	 get Bean Info
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getPropertyDescriptors	TokenNameIdentifier	 get Property Descriptors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
PropertyCallback	TokenNameIdentifier	 Property Callback
callback	TokenNameIdentifier	 callback
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
new	TokenNamenew	
PropertyGetter	TokenNameIdentifier	 Property Getter
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
callback	TokenNameIdentifier	 callback
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IntrospectionException	TokenNameIdentifier	 Introspection Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Failed to introspect object "	TokenNameStringLiteral	Failed to introspect object 
+	TokenNamePLUS	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
PropertyCallback	TokenNameIdentifier	 Property Callback
callback	TokenNameIdentifier	 callback
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
getter	TokenNameIdentifier	 getter
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getReadMethod	TokenNameIdentifier	 get Read Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getter	TokenNameIdentifier	 getter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isHandledType	TokenNameIdentifier	 is Handled Type
(	TokenNameLPAREN	
getter	TokenNameIdentifier	 getter
.	TokenNameDOT	
getReturnType	TokenNameIdentifier	 get Return Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.err.println("Ignoring " + props[i].getName() +" " + getter.getReturnType()); 	TokenNameCOMMENT_LINE	System.err.println("Ignoring " + props[i].getName() +" " + getter.getReturnType()); 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getter	TokenNameIdentifier	 getter
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
NULL_ARG	TokenNameIdentifier	 NULL  ARG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.err.println("PROP " + name +": " + result); 	TokenNameCOMMENT_LINE	System.err.println("PROP " + name +": " + result); 
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
callback	TokenNameIdentifier	 callback
.	TokenNameDOT	
foundProperty	TokenNameIdentifier	 found Property
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Failed to get value of property "	TokenNameStringLiteral	Failed to get value of property 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
||	TokenNameOR_OR	
ex	TokenNameIdentifier	 ex
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
"Failed to get value of property "	TokenNameStringLiteral	Failed to get value of property 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Failed to get value of property "	TokenNameStringLiteral	Failed to get value of property 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
isHandledType	TokenNameIdentifier	 is Handled Type
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
