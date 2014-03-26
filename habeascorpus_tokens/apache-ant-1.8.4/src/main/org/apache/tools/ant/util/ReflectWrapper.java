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
/** * Utility class to handle reflection on java objects. * The class is a holder class for an object and * uses java reflection to call methods on the objects. * If things go wrong, BuildExceptions are thrown. */	TokenNameCOMMENT_JAVADOC	 Utility class to handle reflection on java objects. The class is a holder class for an object and uses java reflection to call methods on the objects. If things go wrong, BuildExceptions are thrown. 
public	TokenNamepublic	
class	TokenNameclass	
ReflectWrapper	TokenNameIdentifier	 Reflect Wrapper
{	TokenNameLBRACE	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
/** * Construct a wrapped object using the no arg constructor. * @param loader the classloader to use to construct the class. * @param name the classname of the object to construct. */	TokenNameCOMMENT_JAVADOC	 Construct a wrapped object using the no arg constructor. @param loader the classloader to use to construct the class. @param name the classname of the object to construct. 
public	TokenNamepublic	
ReflectWrapper	TokenNameIdentifier	 Reflect Wrapper
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
loader	TokenNameIdentifier	 loader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
;	TokenNameSEMICOLON	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Constructor	TokenNameIdentifier	 Constructor
constructor	TokenNameIdentifier	 constructor
;	TokenNameSEMICOLON	
constructor	TokenNameIdentifier	 constructor
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
constructor	TokenNameIdentifier	 constructor
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
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
ReflectUtil	TokenNameIdentifier	 Reflect Util
.	TokenNameDOT	
throwBuildException	TokenNameIdentifier	 throw Build Exception
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Constructor using a passed in object. * @param obj the object to wrap. */	TokenNameCOMMENT_JAVADOC	 Constructor using a passed in object. @param obj the object to wrap. 
public	TokenNamepublic	
ReflectWrapper	TokenNameIdentifier	 Reflect Wrapper
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
/** * @return the wrapped object. */	TokenNameCOMMENT_JAVADOC	 @return the wrapped object. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getObject	TokenNameIdentifier	 get Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Call a method on the object with no parameters. * @param methodName the name of the method to call * @return the object returned by the method */	TokenNameCOMMENT_JAVADOC	 Call a method on the object with no parameters. @param methodName the name of the method to call @return the object returned by the method 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ReflectUtil	TokenNameIdentifier	 Reflect Util
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
methodName	TokenNameIdentifier	 method Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Call a method on the object with one argument. * @param methodName the name of the method to call * @param argType the type of argument. * @param arg the value of the argument. * @return the object returned by the method */	TokenNameCOMMENT_JAVADOC	 Call a method on the object with one argument. @param methodName the name of the method to call @param argType the type of argument. @param arg the value of the argument. @return the object returned by the method 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
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
return	TokenNamereturn	
ReflectUtil	TokenNameIdentifier	 Reflect Util
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
argType	TokenNameIdentifier	 arg Type
,	TokenNameCOMMA	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Call a method on the object with one argument. * @param methodName the name of the method to call * @param argType1 the type of the first argument. * @param arg1 the value of the first argument. * @param argType2 the type of the second argument. * @param arg2 the value of the second argument. * @return the object returned by the method */	TokenNameCOMMENT_JAVADOC	 Call a method on the object with one argument. @param methodName the name of the method to call @param argType1 the type of the first argument. @param arg1 the value of the first argument. @param argType2 the type of the second argument. @param arg2 the value of the second argument. @return the object returned by the method 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
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
return	TokenNamereturn	
ReflectUtil	TokenNameIdentifier	 Reflect Util
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
argType1	TokenNameIdentifier	 arg Type1
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
argType2	TokenNameIdentifier	 arg Type2
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
