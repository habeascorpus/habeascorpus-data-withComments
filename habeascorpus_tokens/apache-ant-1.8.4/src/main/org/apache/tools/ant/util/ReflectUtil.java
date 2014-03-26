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
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Constructor	TokenNameIdentifier	 Constructor
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
;	TokenNameSEMICOLON	
/** * Utility class to handle reflection on java objects. * The class contains static methods to call reflection * methods, catch any exceptions, converting them * to BuildExceptions. */	TokenNameCOMMENT_JAVADOC	 Utility class to handle reflection on java objects. The class contains static methods to call reflection methods, catch any exceptions, converting them to BuildExceptions. 
// CheckStyle:FinalClassCheck OFF - backward compatible 	TokenNameCOMMENT_LINE	CheckStyle:FinalClassCheck OFF - backward compatible 
public	TokenNamepublic	
class	TokenNameclass	
ReflectUtil	TokenNameIdentifier	 Reflect Util
{	TokenNameLBRACE	
/** private constructor */	TokenNameCOMMENT_JAVADOC	 private constructor 
private	TokenNameprivate	
ReflectUtil	TokenNameIdentifier	 Reflect Util
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Create an instance of a class using the constructor matching * the given arguments. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Create an instance of a class using the constructor matching the given arguments. @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
ofClass	TokenNameIdentifier	 of Class
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argTypes	TokenNameIdentifier	 arg Types
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Constructor	TokenNameIdentifier	 Constructor
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
ofClass	TokenNameIdentifier	 of Class
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
argTypes	TokenNameIdentifier	 arg Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwBuildException	TokenNameIdentifier	 throw Build Exception
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// NotReached 	TokenNameCOMMENT_LINE	NotReached 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Call a method on the object with no parameters. * @param obj the object to invoke the method on. * @param methodName the name of the method to call * @return the object returned by the method */	TokenNameCOMMENT_JAVADOC	 Call a method on the object with no parameters. @param obj the object to invoke the method on. @param methodName the name of the method to call @return the object returned by the method 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwBuildException	TokenNameIdentifier	 throw Build Exception
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// NotReached 	TokenNameCOMMENT_LINE	NotReached 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Call a method on the object with no parameters. * Note: Unlike the invoke method above, this * calls class or static methods, not instance methods. * @param obj the object to invoke the method on. * @param methodName the name of the method to call * @return the object returned by the method */	TokenNameCOMMENT_JAVADOC	 Call a method on the object with no parameters. Note: Unlike the invoke method above, this calls class or static methods, not instance methods. @param obj the object to invoke the method on. @param methodName the name of the method to call @return the object returned by the method 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
invokeStatic	TokenNameIdentifier	 invoke Static
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwBuildException	TokenNameIdentifier	 throw Build Exception
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// NotReached 	TokenNameCOMMENT_LINE	NotReached 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Call a method on the object with one argument. * @param obj the object to invoke the method on. * @param methodName the name of the method to call * @param argType the type of argument. * @param arg the value of the argument. * @return the object returned by the method */	TokenNameCOMMENT_JAVADOC	 Call a method on the object with one argument. @param obj the object to invoke the method on. @param methodName the name of the method to call @param argType the type of argument. @param arg the value of the argument. @return the object returned by the method 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
argType	TokenNameIdentifier	 arg Type
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
argType	TokenNameIdentifier	 arg Type
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
method	TokenNameIdentifier	 method
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
Exception	TokenNameIdentifier	 Exception
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwBuildException	TokenNameIdentifier	 throw Build Exception
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// NotReached 	TokenNameCOMMENT_LINE	NotReached 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Call a method on the object with two argument. * @param obj the object to invoke the method on. * @param methodName the name of the method to call * @param argType1 the type of the first argument. * @param arg1 the value of the first argument. * @param argType2 the type of the second argument. * @param arg2 the value of the second argument. * @return the object returned by the method */	TokenNameCOMMENT_JAVADOC	 Call a method on the object with two argument. @param obj the object to invoke the method on. @param methodName the name of the method to call @param argType1 the type of the first argument. @param arg1 the value of the first argument. @param argType2 the type of the second argument. @param arg2 the value of the second argument. @return the object returned by the method 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
argType1	TokenNameIdentifier	 arg Type1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
argType2	TokenNameIdentifier	 arg Type2
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
argType1	TokenNameIdentifier	 arg Type1
,	TokenNameCOMMA	
argType2	TokenNameIdentifier	 arg Type2
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
method	TokenNameIdentifier	 method
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
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwBuildException	TokenNameIdentifier	 throw Build Exception
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// NotReached 	TokenNameCOMMENT_LINE	NotReached 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the value of a field in an object. * @param obj the object to look at. * @param fieldName the name of the field in the object. * @return the value of the field. * @throws BuildException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Get the value of a field in an object. @param obj the object to look at. @param fieldName the name of the field in the object. @return the value of the field. @throws BuildException if there is an error. 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Field	TokenNameIdentifier	 Field
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDeclaredField	TokenNameIdentifier	 get Declared Field
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
setAccessible	TokenNameIdentifier	 set Accessible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwBuildException	TokenNameIdentifier	 throw Build Exception
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// NotReached 	TokenNameCOMMENT_LINE	NotReached 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A method to convert an invocationTargetException to * a buildexception and throw it. * @param t the invocation target exception. * @throws BuildException the converted exception. */	TokenNameCOMMENT_JAVADOC	 A method to convert an invocationTargetException to a buildexception and throw it. @param t the invocation target exception. @throws BuildException the converted exception. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
throwBuildException	TokenNameIdentifier	 throw Build Exception
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
toBuildException	TokenNameIdentifier	 to Build Exception
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A method to convert an invocationTargetException to * a buildexception. * @param t the invocation target exception. * @return the converted exception. * @since ant 1.7.1 */	TokenNameCOMMENT_JAVADOC	 A method to convert an invocationTargetException to a buildexception. @param t the invocation target exception. @return the converted exception. @since ant 1.7.1 
public	TokenNamepublic	
static	TokenNamestatic	
BuildException	TokenNameIdentifier	 Build Exception
toBuildException	TokenNameIdentifier	 to Build Exception
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
instanceof	TokenNameinstanceof	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
instanceof	TokenNameinstanceof	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
t2	TokenNameIdentifier	 t2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A method to test if an object responds to a given * message (method call) * @param o the object * @param methodName the method to check for * @return true if the object has the method. * @throws BuildException if there is a problem. */	TokenNameCOMMENT_JAVADOC	 A method to test if an object responds to a given message (method call) @param o the object @param methodName the method to check for @return true if the object has the method. @throws BuildException if there is a problem. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
respondsTo	TokenNameIdentifier	 responds To
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methods	TokenNameIdentifier	 methods
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethods	TokenNameIdentifier	 get Methods
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
methods	TokenNameIdentifier	 methods
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
methods	TokenNameIdentifier	 methods
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
methodName	TokenNameIdentifier	 method Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
toBuildException	TokenNameIdentifier	 to Build Exception
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
