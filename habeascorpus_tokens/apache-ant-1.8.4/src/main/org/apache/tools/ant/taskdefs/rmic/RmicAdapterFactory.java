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
rmic	TokenNameIdentifier	 rmic
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
/** * Creates the necessary rmic adapter, given basic criteria. * * @since 1.4 */	TokenNameCOMMENT_JAVADOC	 Creates the necessary rmic adapter, given basic criteria. * @since 1.4 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
RmicAdapterFactory	TokenNameIdentifier	 Rmic Adapter Factory
{	TokenNameLBRACE	
/** The error message to be used when the compiler cannot be found. */	TokenNameCOMMENT_JAVADOC	 The error message to be used when the compiler cannot be found. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_UNKNOWN_COMPILER	TokenNameIdentifier	 ERROR  UNKNOWN  COMPILER
=	TokenNameEQUAL	
"Class not found: "	TokenNameStringLiteral	Class not found: 
;	TokenNameSEMICOLON	
/** The error message to be used when the class is not an rmic adapter. */	TokenNameCOMMENT_JAVADOC	 The error message to be used when the class is not an rmic adapter. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NOT_RMIC_ADAPTER	TokenNameIdentifier	 ERROR  NOT  RMIC  ADAPTER
=	TokenNameEQUAL	
"Class of unexpected Type: "	TokenNameStringLiteral	Class of unexpected Type: 
;	TokenNameSEMICOLON	
/** If the compiler has this name use a default compiler. */	TokenNameCOMMENT_JAVADOC	 If the compiler has this name use a default compiler. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_COMPILER	TokenNameIdentifier	 DEFAULT  COMPILER
=	TokenNameEQUAL	
"default"	TokenNameStringLiteral	default
;	TokenNameSEMICOLON	
/** This is a singleton -- can't create instances!! */	TokenNameCOMMENT_JAVADOC	 This is a singleton -- can't create instances!! 
private	TokenNameprivate	
RmicAdapterFactory	TokenNameIdentifier	 Rmic Adapter Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Based on the parameter passed in, this method creates the necessary * factory desired. * * <p>The current mapping for rmic names are as follows:</p> * <ul><li>sun = SUN's rmic * <li>kaffe = Kaffe's rmic * <li><i>a fully qualified classname</i> = the name of a rmic * adapter * <li>weblogic = weblogic compiler * <li>forking = Sun's RMIC by forking a new JVM * </ul> * * @param rmicType either the name of the desired rmic, or the * full classname of the rmic's adapter. * @param task a task to log through. * @return the compiler adapter * @throws BuildException if the rmic type could not be resolved into * a rmic adapter. */	TokenNameCOMMENT_JAVADOC	 Based on the parameter passed in, this method creates the necessary factory desired. * <p>The current mapping for rmic names are as follows:</p> <ul><li>sun = SUN's rmic <li>kaffe = Kaffe's rmic <li><i>a fully qualified classname</i> = the name of a rmic adapter <li>weblogic = weblogic compiler <li>forking = Sun's RMIC by forking a new JVM </ul> * @param rmicType either the name of the desired rmic, or the full classname of the rmic's adapter. @param task a task to log through. @return the compiler adapter @throws BuildException if the rmic type could not be resolved into a rmic adapter. 
public	TokenNamepublic	
static	TokenNamestatic	
RmicAdapter	TokenNameIdentifier	 Rmic Adapter
getRmic	TokenNameIdentifier	 get Rmic
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rmicType	TokenNameIdentifier	 rmic Type
,	TokenNameCOMMA	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getRmic	TokenNameIdentifier	 get Rmic
(	TokenNameLPAREN	
rmicType	TokenNameIdentifier	 rmic Type
,	TokenNameCOMMA	
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Based on the parameter passed in, this method creates the necessary * factory desired. * * <p>The current mapping for rmic names are as follows:</p> * <ul><li>sun = SUN's rmic * <li>kaffe = Kaffe's rmic * <li><i>a fully qualified classname</i> = the name of a rmic * adapter * <li>weblogic = weblogic compiler * <li>forking = Sun's RMIC by forking a new JVM * </ul> * * @param rmicType either the name of the desired rmic, or the * full classname of the rmic's adapter. * @param task a task to log through. * @param classpath the classpath to use when looking up an * adapter class * @return the compiler adapter * @throws BuildException if the rmic type could not be resolved into * a rmic adapter. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Based on the parameter passed in, this method creates the necessary factory desired. * <p>The current mapping for rmic names are as follows:</p> <ul><li>sun = SUN's rmic <li>kaffe = Kaffe's rmic <li><i>a fully qualified classname</i> = the name of a rmic adapter <li>weblogic = weblogic compiler <li>forking = Sun's RMIC by forking a new JVM </ul> * @param rmicType either the name of the desired rmic, or the full classname of the rmic's adapter. @param task a task to log through. @param classpath the classpath to use when looking up an adapter class @return the compiler adapter @throws BuildException if the rmic type could not be resolved into a rmic adapter. @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
RmicAdapter	TokenNameIdentifier	 Rmic Adapter
getRmic	TokenNameIdentifier	 get Rmic
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rmicType	TokenNameIdentifier	 rmic Type
,	TokenNameCOMMA	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
//handle default specially by choosing the sun or kaffe compiler 	TokenNameCOMMENT_LINE	handle default specially by choosing the sun or kaffe compiler 
if	TokenNameif	
(	TokenNameLPAREN	
DEFAULT_COMPILER	TokenNameIdentifier	 DEFAULT  COMPILER
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
rmicType	TokenNameIdentifier	 rmic Type
)	TokenNameRPAREN	
||	TokenNameOR_OR	
rmicType	TokenNameIdentifier	 rmic Type
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rmicType	TokenNameIdentifier	 rmic Type
=	TokenNameEQUAL	
KaffeRmic	TokenNameIdentifier	 Kaffe Rmic
.	TokenNameDOT	
isAvailable	TokenNameIdentifier	 is Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
KaffeRmic	TokenNameIdentifier	 Kaffe Rmic
.	TokenNameDOT	
COMPILER_NAME	TokenNameIdentifier	 COMPILER  NAME
:	TokenNameCOLON	
SunRmic	TokenNameIdentifier	 Sun Rmic
.	TokenNameDOT	
COMPILER_NAME	TokenNameIdentifier	 COMPILER  NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SunRmic	TokenNameIdentifier	 Sun Rmic
.	TokenNameDOT	
COMPILER_NAME	TokenNameIdentifier	 COMPILER  NAME
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
rmicType	TokenNameIdentifier	 rmic Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SunRmic	TokenNameIdentifier	 Sun Rmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
KaffeRmic	TokenNameIdentifier	 Kaffe Rmic
.	TokenNameDOT	
COMPILER_NAME	TokenNameIdentifier	 COMPILER  NAME
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
rmicType	TokenNameIdentifier	 rmic Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
KaffeRmic	TokenNameIdentifier	 Kaffe Rmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
WLRmic	TokenNameIdentifier	 WL Rmic
.	TokenNameDOT	
COMPILER_NAME	TokenNameIdentifier	 COMPILER  NAME
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
rmicType	TokenNameIdentifier	 rmic Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
WLRmic	TokenNameIdentifier	 WL Rmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ForkingSunRmic	TokenNameIdentifier	 Forking Sun Rmic
.	TokenNameDOT	
COMPILER_NAME	TokenNameIdentifier	 COMPILER  NAME
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
rmicType	TokenNameIdentifier	 rmic Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ForkingSunRmic	TokenNameIdentifier	 Forking Sun Rmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XNewRmic	TokenNameIdentifier	 X New Rmic
.	TokenNameDOT	
COMPILER_NAME	TokenNameIdentifier	 COMPILER  NAME
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
rmicType	TokenNameIdentifier	 rmic Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XNewRmic	TokenNameIdentifier	 X New Rmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//no match? 	TokenNameCOMMENT_LINE	no match? 
return	TokenNamereturn	
resolveClassName	TokenNameIdentifier	 resolve Class Name
(	TokenNameLPAREN	
rmicType	TokenNameIdentifier	 rmic Type
,	TokenNameCOMMA	
// Memory leak in line below 	TokenNameCOMMENT_LINE	Memory leak in line below 
task	TokenNameIdentifier	 task
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
/** * Tries to resolve the given classname into a rmic adapter. * Throws a fit if it can't. * * @param className The fully qualified classname to be created. * @param loader the classloader to use * @throws BuildException This is the fit that is thrown if className * isn't an instance of RmicAdapter. */	TokenNameCOMMENT_JAVADOC	 Tries to resolve the given classname into a rmic adapter. Throws a fit if it can't. * @param className The fully qualified classname to be created. @param loader the classloader to use @throws BuildException This is the fit that is thrown if className isn't an instance of RmicAdapter. 
private	TokenNameprivate	
static	TokenNamestatic	
RmicAdapter	TokenNameIdentifier	 Rmic Adapter
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
RmicAdapter	TokenNameIdentifier	 Rmic Adapter
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
RmicAdapterFactory	TokenNameIdentifier	 Rmic Adapter Factory
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
RmicAdapter	TokenNameIdentifier	 Rmic Adapter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
