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
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
javah	TokenNameIdentifier	 javah
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
ProjectComponent	TokenNameIdentifier	 Project Component
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Path	TokenNameIdentifier	 Path
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ClasspathUtils	TokenNameIdentifier	 Classpath Utils
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
;	TokenNameSEMICOLON	
/** * Creates the JavahAdapter based on the user choice and * potentially the VM vendor. * * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Creates the JavahAdapter based on the user choice and potentially the VM vendor. * @since Ant 1.6.3 
// CheckStyle:HideUtilityClassConstructorCheck OFF (bc) 	TokenNameCOMMENT_LINE	CheckStyle:HideUtilityClassConstructorCheck OFF (bc) 
public	TokenNamepublic	
class	TokenNameclass	
JavahAdapterFactory	TokenNameIdentifier	 Javah Adapter Factory
{	TokenNameLBRACE	
/** * Determines the default choice of adapter based on the VM * vendor. * * @return the default choice of adapter based on the VM * vendor */	TokenNameCOMMENT_JAVADOC	 Determines the default choice of adapter based on the VM vendor. * @return the default choice of adapter based on the VM vendor 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
.	TokenNameDOT	
isKaffe	TokenNameIdentifier	 is Kaffe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Kaffeh	TokenNameIdentifier	 Kaffeh
.	TokenNameDOT	
IMPLEMENTATION_NAME	TokenNameIdentifier	 IMPLEMENTATION  NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
.	TokenNameDOT	
isGij	TokenNameIdentifier	 is Gij
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Gcjh	TokenNameIdentifier	 Gcjh
.	TokenNameDOT	
IMPLEMENTATION_NAME	TokenNameIdentifier	 IMPLEMENTATION  NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
SunJavah	TokenNameIdentifier	 Sun Javah
.	TokenNameDOT	
IMPLEMENTATION_NAME	TokenNameIdentifier	 IMPLEMENTATION  NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the JavahAdapter based on the user choice and * potentially the VM vendor. * * @param choice the user choice (if any). * @param log a ProjectComponent instance used to access Ant's * logging system. * @return The adapter to use. * @throws BuildException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Creates the JavahAdapter based on the user choice and potentially the VM vendor. * @param choice the user choice (if any). @param log a ProjectComponent instance used to access Ant's logging system. @return The adapter to use. @throws BuildException if there is an error. 
public	TokenNamepublic	
static	TokenNamestatic	
JavahAdapter	TokenNameIdentifier	 Javah Adapter
getAdapter	TokenNameIdentifier	 get Adapter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
choice	TokenNameIdentifier	 choice
,	TokenNameCOMMA	
ProjectComponent	TokenNameIdentifier	 Project Component
log	TokenNameIdentifier	 log
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getAdapter	TokenNameIdentifier	 get Adapter
(	TokenNameLPAREN	
choice	TokenNameIdentifier	 choice
,	TokenNameCOMMA	
log	TokenNameIdentifier	 log
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the JavahAdapter based on the user choice and * potentially the VM vendor. * * @param choice the user choice (if any). * @param log a ProjectComponent instance used to access Ant's * logging system. * @param classpath the classpath to use when looking up an * adapter class * @return The adapter to use. * @throws BuildException if there is an error. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Creates the JavahAdapter based on the user choice and potentially the VM vendor. * @param choice the user choice (if any). @param log a ProjectComponent instance used to access Ant's logging system. @param classpath the classpath to use when looking up an adapter class @return The adapter to use. @throws BuildException if there is an error. @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
JavahAdapter	TokenNameIdentifier	 Javah Adapter
getAdapter	TokenNameIdentifier	 get Adapter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
choice	TokenNameIdentifier	 choice
,	TokenNameCOMMA	
ProjectComponent	TokenNameIdentifier	 Project Component
log	TokenNameIdentifier	 log
,	TokenNameCOMMA	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
.	TokenNameDOT	
isKaffe	TokenNameIdentifier	 is Kaffe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
choice	TokenNameIdentifier	 choice
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Kaffeh	TokenNameIdentifier	 Kaffeh
.	TokenNameDOT	
IMPLEMENTATION_NAME	TokenNameIdentifier	 IMPLEMENTATION  NAME
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
choice	TokenNameIdentifier	 choice
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Kaffeh	TokenNameIdentifier	 Kaffeh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
.	TokenNameDOT	
isGij	TokenNameIdentifier	 is Gij
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
choice	TokenNameIdentifier	 choice
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Gcjh	TokenNameIdentifier	 Gcjh
.	TokenNameDOT	
IMPLEMENTATION_NAME	TokenNameIdentifier	 IMPLEMENTATION  NAME
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
choice	TokenNameIdentifier	 choice
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Gcjh	TokenNameIdentifier	 Gcjh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
SunJavah	TokenNameIdentifier	 Sun Javah
.	TokenNameDOT	
IMPLEMENTATION_NAME	TokenNameIdentifier	 IMPLEMENTATION  NAME
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
choice	TokenNameIdentifier	 choice
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SunJavah	TokenNameIdentifier	 Sun Javah
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
choice	TokenNameIdentifier	 choice
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resolveClassName	TokenNameIdentifier	 resolve Class Name
(	TokenNameLPAREN	
choice	TokenNameIdentifier	 choice
,	TokenNameCOMMA	
// Memory leak in line below 	TokenNameCOMMENT_LINE	Memory leak in line below 
log	TokenNameIdentifier	 log
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This default has been good enough until Ant 1.6.3, so stick 	TokenNameCOMMENT_LINE	This default has been good enough until Ant 1.6.3, so stick 
// with it 	TokenNameCOMMENT_LINE	with it 
return	TokenNamereturn	
new	TokenNamenew	
SunJavah	TokenNameIdentifier	 Sun Javah
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tries to resolve the given classname into a javah adapter. * Throws a fit if it can't. * * @param className The fully qualified classname to be created. * @param loader the classloader to use * @throws BuildException This is the fit that is thrown if className * isn't an instance of JavahAdapter. */	TokenNameCOMMENT_JAVADOC	 Tries to resolve the given classname into a javah adapter. Throws a fit if it can't. * @param className The fully qualified classname to be created. @param loader the classloader to use @throws BuildException This is the fit that is thrown if className isn't an instance of JavahAdapter. 
private	TokenNameprivate	
static	TokenNamestatic	
JavahAdapter	TokenNameIdentifier	 Javah Adapter
resolveClassName	TokenNameIdentifier	 resolve Class Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
JavahAdapter	TokenNameIdentifier	 Javah Adapter
)	TokenNameRPAREN	
ClasspathUtils	TokenNameIdentifier	 Classpath Utils
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
loader	TokenNameIdentifier	 loader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
loader	TokenNameIdentifier	 loader
:	TokenNameCOLON	
JavahAdapterFactory	TokenNameIdentifier	 Javah Adapter Factory
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
JavahAdapter	TokenNameIdentifier	 Javah Adapter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
