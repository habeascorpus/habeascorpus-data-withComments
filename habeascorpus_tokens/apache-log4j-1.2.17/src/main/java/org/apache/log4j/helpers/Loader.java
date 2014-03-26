/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
;	TokenNameSEMICOLON	
/** Load resources (or images) from various sources. @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 Load resources (or images) from various sources. @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
Loader	TokenNameIdentifier	 Loader
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TSTR	TokenNameIdentifier	 TSTR
=	TokenNameEQUAL	
"Caught Exception while in Loader.getResource. This may be innocuous."	TokenNameStringLiteral	Caught Exception while in Loader.getResource. This may be innocuous.
;	TokenNameSEMICOLON	
// We conservatively assume that we are running under Java 1.x 	TokenNameCOMMENT_LINE	We conservatively assume that we are running under Java 1.x 
static	TokenNamestatic	
private	TokenNameprivate	
boolean	TokenNameboolean	
java1	TokenNameIdentifier	 java1
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
boolean	TokenNameboolean	
ignoreTCL	TokenNameIdentifier	 ignore TCL
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
"java.version"	TokenNameStringLiteral	java.version
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'1'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
java1	TokenNameIdentifier	 java1
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
ignoreTCLProp	TokenNameIdentifier	 ignore TCL Prop
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
"log4j.ignoreTCL"	TokenNameStringLiteral	log4j.ignoreTCL
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ignoreTCLProp	TokenNameIdentifier	 ignore TCL Prop
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ignoreTCL	TokenNameIdentifier	 ignore TCL
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
toBoolean	TokenNameIdentifier	 to Boolean
(	TokenNameLPAREN	
ignoreTCLProp	TokenNameIdentifier	 ignore TCL Prop
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get a resource by delegating to getResource(String). * @param resource resource name * @param clazz class, ignored. * @return URL to resource or null. * @deprecated as of 1.2. */	TokenNameCOMMENT_JAVADOC	 Get a resource by delegating to getResource(String). @param resource resource name @param clazz class, ignored. @return URL to resource or null. @deprecated as of 1.2. 
public	TokenNamepublic	
static	TokenNamestatic	
URL	TokenNameIdentifier	 URL
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resource	TokenNameIdentifier	 resource
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This method will search for <code>resource</code> in different places. The search order is as follows: <ol> <p><li>Search for <code>resource</code> using the thread context class loader under Java2. If that fails, search for <code>resource</code> using the class loader that loaded this class (<code>Loader</code>). Under JDK 1.1, only the the class loader that loaded this class (<code>Loader</code>) is used. <p><li>Try one last time with <code>ClassLoader.getSystemResource(resource)</code>, that is is using the system class loader in JDK 1.2 and virtual machine's built-in class loader in JDK 1.1. </ol> */	TokenNameCOMMENT_JAVADOC	 This method will search for <code>resource</code> in different places. The search order is as follows: <ol> <p><li>Search for <code>resource</code> using the thread context class loader under Java2. If that fails, search for <code>resource</code> using the class loader that loaded this class (<code>Loader</code>). Under JDK 1.1, only the the class loader that loaded this class (<code>Loader</code>) is used. <p><li>Try one last time with <code>ClassLoader.getSystemResource(resource)</code>, that is is using the system class loader in JDK 1.2 and virtual machine's built-in class loader in JDK 1.1. </ol> 
static	TokenNamestatic	
public	TokenNamepublic	
URL	TokenNameIdentifier	 URL
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
classLoader	TokenNameIdentifier	 class Loader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
java1	TokenNameIdentifier	 java1
&&	TokenNameAND_AND	
!	TokenNameNOT	
ignoreTCL	TokenNameIdentifier	 ignore TCL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classLoader	TokenNameIdentifier	 class Loader
=	TokenNameEQUAL	
getTCL	TokenNameIdentifier	 get TCL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
classLoader	TokenNameIdentifier	 class Loader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Trying to find ["	TokenNameStringLiteral	Trying to find [
+	TokenNamePLUS	
resource	TokenNameIdentifier	 resource
+	TokenNamePLUS	
"] using context classloader "	TokenNameStringLiteral	] using context classloader 
+	TokenNamePLUS	
classLoader	TokenNameIdentifier	 class Loader
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
classLoader	TokenNameIdentifier	 class Loader
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// We could not find resource. Ler us now try with the 	TokenNameCOMMENT_LINE	We could not find resource. Ler us now try with the 
// classloader that loaded this class. 	TokenNameCOMMENT_LINE	classloader that loaded this class. 
classLoader	TokenNameIdentifier	 class Loader
=	TokenNameEQUAL	
Loader	TokenNameIdentifier	 Loader
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
classLoader	TokenNameIdentifier	 class Loader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Trying to find ["	TokenNameStringLiteral	Trying to find [
+	TokenNamePLUS	
resource	TokenNameIdentifier	 resource
+	TokenNamePLUS	
"] using "	TokenNameStringLiteral	] using 
+	TokenNamePLUS	
classLoader	TokenNameIdentifier	 class Loader
+	TokenNamePLUS	
" class loader."	TokenNameStringLiteral	 class loader.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
classLoader	TokenNameIdentifier	 class Loader
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
TSTR	TokenNameIdentifier	 TSTR
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
||	TokenNameOR_OR	
t	TokenNameIdentifier	 t
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
TSTR	TokenNameIdentifier	 TSTR
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// can't be InterruptedException or InterruptedIOException 	TokenNameCOMMENT_LINE	can't be InterruptedException or InterruptedIOException 
// since not declared, must be error or RuntimeError. 	TokenNameCOMMENT_LINE	since not declared, must be error or RuntimeError. 
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
TSTR	TokenNameIdentifier	 TSTR
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Last ditch attempt: get the resource from the class path. It 	TokenNameCOMMENT_LINE	Last ditch attempt: get the resource from the class path. It 
// may be the case that clazz was loaded by the Extentsion class 	TokenNameCOMMENT_LINE	may be the case that clazz was loaded by the Extentsion class 
// loader which the parent of the system class loader. Hence the 	TokenNameCOMMENT_LINE	loader which the parent of the system class loader. Hence the 
// code below. 	TokenNameCOMMENT_LINE	code below. 
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Trying to find ["	TokenNameStringLiteral	Trying to find [
+	TokenNamePLUS	
resource	TokenNameIdentifier	 resource
+	TokenNamePLUS	
"] using ClassLoader.getSystemResource()."	TokenNameStringLiteral	] using ClassLoader.getSystemResource().
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ClassLoader	TokenNameIdentifier	 Class Loader
.	TokenNameDOT	
getSystemResource	TokenNameIdentifier	 get System Resource
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Are we running under JDK 1.x? */	TokenNameCOMMENT_JAVADOC	 Are we running under JDK 1.x? 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isJava1	TokenNameIdentifier	 is Java1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
java1	TokenNameIdentifier	 java1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the Thread Context Loader which is a JDK 1.2 feature. If we * are running under JDK 1.1 or anything else goes wrong the method * returns <code>null<code>. * * */	TokenNameCOMMENT_JAVADOC	 Get the Thread Context Loader which is a JDK 1.2 feature. If we are running under JDK 1.1 or anything else goes wrong the method returns <code>null<code>. * 
private	TokenNameprivate	
static	TokenNamestatic	
ClassLoader	TokenNameIdentifier	 Class Loader
getTCL	TokenNameIdentifier	 get TCL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
,	TokenNameCOMMA	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
{	TokenNameLBRACE	
// Are we running on a JDK 1.2 or later system? 	TokenNameCOMMENT_LINE	Are we running on a JDK 1.2 or later system? 
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getContextClassLoader"	TokenNameStringLiteral	getContextClassLoader
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We are running on JDK 1.1 	TokenNameCOMMENT_LINE	We are running on JDK 1.1 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
)	TokenNameRPAREN	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If running under JDK 1.2 load the specified class using the * <code>Thread</code> <code>contextClassLoader</code> if that * fails try Class.forname. Under JDK 1.1 only Class.forName is * used. * */	TokenNameCOMMENT_JAVADOC	 If running under JDK 1.2 load the specified class using the <code>Thread</code> <code>contextClassLoader</code> if that fails try Class.forname. Under JDK 1.1 only Class.forName is used. 
static	TokenNamestatic	
public	TokenNamepublic	
Class	TokenNameIdentifier	 Class
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
throws	TokenNamethrows	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
// Just call Class.forName(clazz) if we are running under JDK 1.1 	TokenNameCOMMENT_LINE	Just call Class.forName(clazz) if we are running under JDK 1.1 
// or if we are instructed to ignore the TCL. 	TokenNameCOMMENT_LINE	or if we are instructed to ignore the TCL. 
if	TokenNameif	
(	TokenNameLPAREN	
java1	TokenNameIdentifier	 java1
||	TokenNameOR_OR	
ignoreTCL	TokenNameIdentifier	 ignore TCL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
getTCL	TokenNameIdentifier	 get TCL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we reached here because tcl was null or because of a 	TokenNameCOMMENT_LINE	we reached here because tcl was null or because of a 
// security exception, or because clazz could not be loaded... 	TokenNameCOMMENT_LINE	security exception, or because clazz could not be loaded... 
// In any case we now try one more time 	TokenNameCOMMENT_LINE	In any case we now try one more time 
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
||	TokenNameOR_OR	
e	TokenNameIdentifier	 e
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
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
