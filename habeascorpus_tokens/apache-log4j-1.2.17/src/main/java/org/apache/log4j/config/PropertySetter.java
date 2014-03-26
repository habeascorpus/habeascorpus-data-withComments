/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Contributors: Georg Lundesgaard 	TokenNameCOMMENT_LINE	Contributors: Georg Lundesgaard 
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
Appender	TokenNameIdentifier	 Appender
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Level	TokenNameIdentifier	 Level
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
OptionConverter	TokenNameIdentifier	 Option Converter
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
OptionHandler	TokenNameIdentifier	 Option Handler
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
ErrorHandler	TokenNameIdentifier	 Error Handler
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
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
/** General purpose Object property setter. Clients repeatedly invokes {@link #setProperty setProperty(name,value)} in order to invoke setters on the Object specified in the constructor. This class relies on the JavaBeans {@link Introspector} to analyze the given Object Class using reflection. <p>Usage: <pre> PropertySetter ps = new PropertySetter(anObject); ps.set("name", "Joe"); ps.set("age", "32"); ps.set("isMale", "true"); </pre> will cause the invocations anObject.setName("Joe"), anObject.setAge(32), and setMale(true) if such methods exist with those signatures. Otherwise an {@link IntrospectionException} are thrown. @author Anders Kristensen @since 1.1 */	TokenNameCOMMENT_JAVADOC	 General purpose Object property setter. Clients repeatedly invokes {@link #setProperty setProperty(name,value)} in order to invoke setters on the Object specified in the constructor. This class relies on the JavaBeans {@link Introspector} to analyze the given Object Class using reflection. <p>Usage: <pre> PropertySetter ps = new PropertySetter(anObject); ps.set("name", "Joe"); ps.set("age", "32"); ps.set("isMale", "true"); </pre> will cause the invocations anObject.setName("Joe"), anObject.setAge(32), and setMale(true) if such methods exist with those signatures. Otherwise an {@link IntrospectionException} are thrown. @author Anders Kristensen @since 1.1 
public	TokenNamepublic	
class	TokenNameclass	
PropertySetter	TokenNameIdentifier	 Property Setter
{	TokenNameLBRACE	
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
/** Create a new PropertySetter for the specified Object. This is done in prepartion for invoking {@link #setProperty} one or more times. @param obj the object for which to set properties */	TokenNameCOMMENT_JAVADOC	 Create a new PropertySetter for the specified Object. This is done in prepartion for invoking {@link #setProperty} one or more times. @param obj the object for which to set properties 
public	TokenNamepublic	
PropertySetter	TokenNameIdentifier	 Property Setter
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Uses JavaBeans {@link Introspector} to computer setters of object to be configured. */	TokenNameCOMMENT_JAVADOC	 Uses JavaBeans {@link Introspector} to computer setters of object to be configured. 
protected	TokenNameprotected	
void	TokenNamevoid	
introspect	TokenNameIdentifier	 introspect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
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
"Failed to introspect "	TokenNameStringLiteral	Failed to introspect 
+	TokenNamePLUS	
obj	TokenNameIdentifier	 obj
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
PropertyDescriptor	TokenNameIdentifier	 Property Descriptor
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Set the properties of an object passed as a parameter in one go. The <code>properties</code> are parsed relative to a <code>prefix</code>. @param obj The object to configure. @param properties A java.util.Properties containing keys and values. @param prefix Only keys having the specified prefix will be set. */	TokenNameCOMMENT_JAVADOC	 Set the properties of an object passed as a parameter in one go. The <code>properties</code> are parsed relative to a <code>prefix</code>. @param obj The object to configure. @param properties A java.util.Properties containing keys and values. @param prefix Only keys having the specified prefix will be set. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setProperties	TokenNameIdentifier	 set Properties
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
Properties	TokenNameIdentifier	 Properties
properties	TokenNameIdentifier	 properties
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
PropertySetter	TokenNameIdentifier	 Property Setter
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
.	TokenNameDOT	
setProperties	TokenNameIdentifier	 set Properties
(	TokenNameLPAREN	
properties	TokenNameIdentifier	 properties
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the properites for the object that match the <code>prefix</code> passed as parameter. */	TokenNameCOMMENT_JAVADOC	 Set the properites for the object that match the <code>prefix</code> passed as parameter. 
public	TokenNamepublic	
void	TokenNamevoid	
setProperties	TokenNameIdentifier	 set Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
properties	TokenNameIdentifier	 properties
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
propertyNames	TokenNameIdentifier	 property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// handle only properties that start with the desired frefix. 	TokenNameCOMMENT_LINE	handle only properties that start with the desired frefix. 
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore key if it contains dots after the prefix 	TokenNameCOMMENT_LINE	ignore key if it contains dots after the prefix 
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.err.println("----------Ignoring---["+key 	TokenNameCOMMENT_LINE	System.err.println("----------Ignoring---["+key 
// +"], prefix=["+prefix+"]."); 	TokenNameCOMMENT_LINE	+"], prefix=["+prefix+"]."); 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
findAndSubst	TokenNameIdentifier	 find And Subst
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
properties	TokenNameIdentifier	 properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
"layout"	TokenNameStringLiteral	layout
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"errorhandler"	TokenNameStringLiteral	errorhandler
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
Appender	TokenNameIdentifier	 Appender
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// if the property type is an OptionHandler 	TokenNameCOMMENT_LINE	if the property type is an OptionHandler 
// (for example, triggeringPolicy of org.apache.log4j.rolling.RollingFileAppender) 	TokenNameCOMMENT_LINE	(for example, triggeringPolicy of org.apache.log4j.rolling.RollingFileAppender) 
PropertyDescriptor	TokenNameIdentifier	 Property Descriptor
prop	TokenNameIdentifier	 prop
=	TokenNameEQUAL	
getPropertyDescriptor	TokenNameIdentifier	 get Property Descriptor
(	TokenNameLPAREN	
Introspector	TokenNameIdentifier	 Introspector
.	TokenNameDOT	
decapitalize	TokenNameIdentifier	 decapitalize
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
OptionHandler	TokenNameIdentifier	 Option Handler
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
getPropertyType	TokenNameIdentifier	 get Property Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
getWriteMethod	TokenNameIdentifier	 get Write Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
OptionHandler	TokenNameIdentifier	 Option Handler
opt	TokenNameIdentifier	 opt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OptionHandler	TokenNameIdentifier	 Option Handler
)	TokenNameRPAREN	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
instantiateByKey	TokenNameIdentifier	 instantiate By Key
(	TokenNameLPAREN	
properties	TokenNameIdentifier	 properties
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
getPropertyType	TokenNameIdentifier	 get Property Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PropertySetter	TokenNameIdentifier	 Property Setter
setter	TokenNameIdentifier	 setter
=	TokenNameEQUAL	
new	TokenNamenew	
PropertySetter	TokenNameIdentifier	 Property Setter
(	TokenNameLPAREN	
opt	TokenNameIdentifier	 opt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setter	TokenNameIdentifier	 setter
.	TokenNameDOT	
setProperties	TokenNameIdentifier	 set Properties
(	TokenNameLPAREN	
properties	TokenNameIdentifier	 properties
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
getWriteMethod	TokenNameIdentifier	 get Write Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
opt	TokenNameIdentifier	 opt
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"Failed to set property ["	TokenNameStringLiteral	Failed to set property [
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
"] to value ""	TokenNameStringLiteral	] to value "
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
"". "	TokenNameStringLiteral	". 
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
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
"Failed to set property ["	TokenNameStringLiteral	Failed to set property [
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
"] to value ""	TokenNameStringLiteral	] to value "
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
"". "	TokenNameStringLiteral	". 
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
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
"Failed to set property ["	TokenNameStringLiteral	Failed to set property [
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
"] to value ""	TokenNameStringLiteral	] to value "
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
"". "	TokenNameStringLiteral	". 
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
activate	TokenNameIdentifier	 activate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set a property on this PropertySetter's Object. If successful, this method will invoke a setter method on the underlying Object. The setter is the one for the specified property name and the value is determined partly from the setter argument type and partly from the value specified in the call to this method. <p>If the setter expects a String no conversion is necessary. If it expects an int, then an attempt is made to convert 'value' to an int using new Integer(value). If the setter expects a boolean, the conversion is by new Boolean(value). @param name name of the property @param value String value of the property */	TokenNameCOMMENT_JAVADOC	 Set a property on this PropertySetter's Object. If successful, this method will invoke a setter method on the underlying Object. The setter is the one for the specified property name and the value is determined partly from the setter argument type and partly from the value specified in the call to this method. <p>If the setter expects a String no conversion is necessary. If it expects an int, then an attempt is made to convert 'value' to an int using new Integer(value). If the setter expects a boolean, the conversion is by new Boolean(value). @param name name of the property @param value String value of the property 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
Introspector	TokenNameIdentifier	 Introspector
.	TokenNameDOT	
decapitalize	TokenNameIdentifier	 decapitalize
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PropertyDescriptor	TokenNameIdentifier	 Property Descriptor
prop	TokenNameIdentifier	 prop
=	TokenNameEQUAL	
getPropertyDescriptor	TokenNameIdentifier	 get Property Descriptor
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//LogLog.debug("---------Key: "+name+", type="+prop.getPropertyType()); 	TokenNameCOMMENT_LINE	LogLog.debug("---------Key: "+name+", type="+prop.getPropertyType()); 
if	TokenNameif	
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"No such property ["	TokenNameStringLiteral	No such property [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"] in "	TokenNameStringLiteral	] in 
+	TokenNamePLUS	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
PropertySetterException	TokenNameIdentifier	 Property Setter Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Failed to set property ["	TokenNameStringLiteral	Failed to set property [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"] to value ""	TokenNameStringLiteral	] to value "
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
"". "	TokenNameStringLiteral	". 
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
rootCause	TokenNameIdentifier	 root Cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Set the named property given a {@link PropertyDescriptor}. @param prop A PropertyDescriptor describing the characteristics of the property to set. @param name The named of the property to set. @param value The value of the property. */	TokenNameCOMMENT_JAVADOC	 Set the named property given a {@link PropertyDescriptor}. @param prop A PropertyDescriptor describing the characteristics of the property to set. @param name The named of the property to set. @param value The value of the property. 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
PropertyDescriptor	TokenNameIdentifier	 Property Descriptor
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
PropertySetterException	TokenNameIdentifier	 Property Setter Exception
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
setter	TokenNameIdentifier	 setter
=	TokenNameEQUAL	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
getWriteMethod	TokenNameIdentifier	 get Write Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
setter	TokenNameIdentifier	 setter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
PropertySetterException	TokenNameIdentifier	 Property Setter Exception
(	TokenNameLPAREN	
"No setter for property ["	TokenNameStringLiteral	No setter for property [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramTypes	TokenNameIdentifier	 param Types
=	TokenNameEQUAL	
setter	TokenNameIdentifier	 setter
.	TokenNameDOT	
getParameterTypes	TokenNameIdentifier	 get Parameter Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
paramTypes	TokenNameIdentifier	 param Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
PropertySetterException	TokenNameIdentifier	 Property Setter Exception
(	TokenNameLPAREN	
"#params for setter != 1"	TokenNameStringLiteral	#params for setter != 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
convertArg	TokenNameIdentifier	 convert Arg
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
PropertySetterException	TokenNameIdentifier	 Property Setter Exception
(	TokenNameLPAREN	
"Conversion to type ["	TokenNameStringLiteral	Conversion to type [
+	TokenNamePLUS	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] failed. Reason: "	TokenNameStringLiteral	] failed. Reason: 
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
PropertySetterException	TokenNameIdentifier	 Property Setter Exception
(	TokenNameLPAREN	
"Conversion to type ["	TokenNameStringLiteral	Conversion to type [
+	TokenNamePLUS	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"] failed."	TokenNameStringLiteral	] failed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Setting property ["	TokenNameStringLiteral	Setting property [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"] to ["	TokenNameStringLiteral	] to [
+	TokenNamePLUS	
arg	TokenNameIdentifier	 arg
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
setter	TokenNameIdentifier	 setter
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
arg	TokenNameIdentifier	 arg
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
PropertySetterException	TokenNameIdentifier	 Property Setter Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
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
throw	TokenNamethrow	
new	TokenNamenew	
PropertySetterException	TokenNameIdentifier	 Property Setter Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
PropertySetterException	TokenNameIdentifier	 Property Setter Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Convert <code>val</code> a String parameter to an object of a given type. */	TokenNameCOMMENT_JAVADOC	 Convert <code>val</code> a String parameter to an object of a given type. 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
convertArg	TokenNameIdentifier	 convert Arg
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"false"	TokenNameStringLiteral	false
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ErrorHandler	TokenNameIdentifier	 Error Handler
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
instantiateByClassName	TokenNameIdentifier	 instantiate By Class Name
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
ErrorHandler	TokenNameIdentifier	 Error Handler
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
PropertyDescriptor	TokenNameIdentifier	 Property Descriptor
getPropertyDescriptor	TokenNameIdentifier	 get Property Descriptor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
introspect	TokenNameIdentifier	 introspect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
props	TokenNameIdentifier	 props
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
activate	TokenNameIdentifier	 activate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
OptionHandler	TokenNameIdentifier	 Option Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
OptionHandler	TokenNameIdentifier	 Option Handler
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
