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
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
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
Reference	TokenNameIdentifier	 Reference
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * EXPERIMENTAL * Create or modifies ClassLoader. The required pathRef parameter * will be used to add classpath elements. * * The classpath is a regular path. Currently only file components are * supported (future extensions may allow URLs). * * You can modify the core loader by not specifying any name or using * "ant.coreLoader". (the core loader is used to load system ant * tasks and for taskdefs that don't specify an explicit path). * * Taskdef and typedef can use the loader you create if the name follows * the "ant.loader.NAME" pattern. NAME will be used as a pathref when * calling taskdef. * * This tasks will not modify the core loader if "build.sysclasspath=only" * * The typical use is: * <pre> * &lt;path id="ant.deps" &gt; * &lt;fileset dir="myDir" &gt; * &lt;include name="junit.jar, bsf.jar, js.jar, etc"/&gt; * &lt;/fileset&gt; * &lt;/path&gt; * * &lt;classloader pathRef="ant.deps" /&gt; * * </pre> * */	TokenNameCOMMENT_JAVADOC	 EXPERIMENTAL Create or modifies ClassLoader. The required pathRef parameter will be used to add classpath elements. * The classpath is a regular path. Currently only file components are supported (future extensions may allow URLs). * You can modify the core loader by not specifying any name or using "ant.coreLoader". (the core loader is used to load system ant tasks and for taskdefs that don't specify an explicit path). * Taskdef and typedef can use the loader you create if the name follows the "ant.loader.NAME" pattern. NAME will be used as a pathref when calling taskdef. * This tasks will not modify the core loader if "build.sysclasspath=only" * The typical use is: <pre> &lt;path id="ant.deps" &gt; &lt;fileset dir="myDir" &gt; &lt;include name="junit.jar, bsf.jar, js.jar, etc"/&gt; &lt;/fileset&gt; &lt;/path&gt; * &lt;classloader pathRef="ant.deps" /&gt; * </pre> 
public	TokenNamepublic	
class	TokenNameclass	
Classloader	TokenNameIdentifier	 Classloader
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/** @see MagicNames#SYSTEM_LOADER_REF */	TokenNameCOMMENT_JAVADOC	 @see MagicNames#SYSTEM_LOADER_REF 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SYSTEM_LOADER_REF	TokenNameIdentifier	 SYSTEM  LOADER  REF
=	TokenNameEQUAL	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
SYSTEM_LOADER_REF	TokenNameIdentifier	 SYSTEM  LOADER  REF
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
reset	TokenNameIdentifier	 reset
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
parentFirst	TokenNameIdentifier	 parent First
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
parentName	TokenNameIdentifier	 parent Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Default constructor */	TokenNameCOMMENT_JAVADOC	 Default constructor 
public	TokenNamepublic	
Classloader	TokenNameIdentifier	 Classloader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Name of the loader. If none, the default loader will be modified * * @param name the name of this loader */	TokenNameCOMMENT_JAVADOC	 Name of the loader. If none, the default loader will be modified * @param name the name of this loader 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset the classloader, if it already exists. A new loader will * be created and all the references to the old one will be removed. * (it is not possible to remove paths from a loader). The new * path will be used. * * @param b true if the loader is to be reset. */	TokenNameCOMMENT_JAVADOC	 Reset the classloader, if it already exists. A new loader will be created and all the references to the old one will be removed. (it is not possible to remove paths from a loader). The new path will be used. * @param b true if the loader is to be reset. 
public	TokenNamepublic	
void	TokenNamevoid	
setReset	TokenNameIdentifier	 set Reset
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set reverse attribute. * @param b if true reverse the normal classloader lookup. * @deprecated use setParentFirst with a negated argument instead */	TokenNameCOMMENT_JAVADOC	 Set reverse attribute. @param b if true reverse the normal classloader lookup. @deprecated use setParentFirst with a negated argument instead 
public	TokenNamepublic	
void	TokenNamevoid	
setReverse	TokenNameIdentifier	 set Reverse
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parentFirst	TokenNameIdentifier	 parent First
=	TokenNameEQUAL	
!	TokenNameNOT	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set reverse attribute. * @param b if true reverse the normal classloader lookup. */	TokenNameCOMMENT_JAVADOC	 Set reverse attribute. @param b if true reverse the normal classloader lookup. 
public	TokenNamepublic	
void	TokenNamevoid	
setParentFirst	TokenNameIdentifier	 set Parent First
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parentFirst	TokenNameIdentifier	 parent First
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the name of the parent. * @param name the parent name. */	TokenNameCOMMENT_JAVADOC	 Set the name of the parent. @param name the parent name. 
public	TokenNamepublic	
void	TokenNamevoid	
setParentName	TokenNameIdentifier	 set Parent Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parentName	TokenNameIdentifier	 parent Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Specify which path will be used. If the loader already exists * and is an AntClassLoader (or any other loader we can extend), * the path will be added to the loader. * @param pathRef a reference to a path. * @throws BuildException if there is a problem. */	TokenNameCOMMENT_JAVADOC	 Specify which path will be used. If the loader already exists and is an AntClassLoader (or any other loader we can extend), the path will be added to the loader. @param pathRef a reference to a path. @throws BuildException if there is a problem. 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspathRef	TokenNameIdentifier	 set Classpath Ref
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
pathRef	TokenNameIdentifier	 path Ref
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
)	TokenNameRPAREN	
pathRef	TokenNameIdentifier	 path Ref
.	TokenNameDOT	
getReferencedObject	TokenNameIdentifier	 get Referenced Object
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the classpath to be used when searching for component being defined * * @param classpath an Ant Path object containing the classpath. */	TokenNameCOMMENT_JAVADOC	 Set the classpath to be used when searching for component being defined * @param classpath an Ant Path object containing the classpath. 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a classpath. * @return a path for configuration. */	TokenNameCOMMENT_JAVADOC	 Create a classpath. @return a path for configuration. 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
createPath	TokenNameIdentifier	 create Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * do the classloader manipulation. */	TokenNameCOMMENT_JAVADOC	 do the classloader manipulation. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Gump friendly - don't mess with the core loader if only classpath 	TokenNameCOMMENT_LINE	Gump friendly - don't mess with the core loader if only classpath 
if	TokenNameif	
(	TokenNameLPAREN	
"only"	TokenNameStringLiteral	only
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"build.sysclasspath"	TokenNameStringLiteral	build.sysclasspath
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
SYSTEM_LOADER_REF	TokenNameIdentifier	 SYSTEM  LOADER  REF
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Changing the system loader is disabled "	TokenNameStringLiteral	Changing the system loader is disabled 
+	TokenNamePLUS	
"by build.sysclasspath=only"	TokenNameStringLiteral	by build.sysclasspath=only
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
loaderName	TokenNameIdentifier	 loader Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
SYSTEM_LOADER_REF	TokenNameIdentifier	 SYSTEM  LOADER  REF
:	TokenNameCOLON	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
loaderName	TokenNameIdentifier	 loader Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reset	TokenNameIdentifier	 reset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Are any other references held ? Can we 'close' the loader 	TokenNameCOMMENT_LINE	Are any other references held ? Can we 'close' the loader 
// so it removes the locks on jars ? 	TokenNameCOMMENT_LINE	so it removes the locks on jars ? 
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// a new one will be created. 	TokenNameCOMMENT_LINE	a new one will be created. 
}	TokenNameRBRACE	
// XXX maybe use reflection to addPathElement (other patterns ?) 	TokenNameCOMMENT_LINE	XXX maybe use reflection to addPathElement (other patterns ?) 
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Referenced object is not an AntClassLoader"	TokenNameStringLiteral	Referenced object is not an AntClassLoader
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
acl	TokenNameIdentifier	 acl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
existingLoader	TokenNameIdentifier	 existing Loader
=	TokenNameEQUAL	
acl	TokenNameIdentifier	 acl
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
acl	TokenNameIdentifier	 acl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Construct a new class loader 	TokenNameCOMMENT_LINE	Construct a new class loader 
Object	TokenNameIdentifier	 Object
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parentName	TokenNameIdentifier	 parent Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
parentName	TokenNameIdentifier	 parent Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
instanceof	TokenNameinstanceof	
ClassLoader	TokenNameIdentifier	 Class Loader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// TODO: allow user to request the system or no parent 	TokenNameCOMMENT_LINE	TODO: allow user to request the system or no parent 
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The core loader must be reverse 	TokenNameCOMMENT_LINE	The core loader must be reverse 
//reverse=true; 	TokenNameCOMMENT_LINE	reverse=true; 
}	TokenNameRBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Setting parent loader "	TokenNameStringLiteral	Setting parent loader 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
parent	TokenNameIdentifier	 parent
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
parentFirst	TokenNameIdentifier	 parent First
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The param is "parentFirst" 	TokenNameCOMMENT_LINE	The param is "parentFirst" 
acl	TokenNameIdentifier	 acl
=	TokenNameEQUAL	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
.	TokenNameDOT	
newAntClassLoader	TokenNameIdentifier	 new Ant Class Loader
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
classpath	TokenNameIdentifier	 classpath
,	TokenNameCOMMA	
parentFirst	TokenNameIdentifier	 parent First
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
loaderName	TokenNameIdentifier	 loader Name
,	TokenNameCOMMA	
acl	TokenNameIdentifier	 acl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This allows the core loader to load optional tasks 	TokenNameCOMMENT_LINE	This allows the core loader to load optional tasks 
// without delegating 	TokenNameCOMMENT_LINE	without delegating 
acl	TokenNameIdentifier	 acl
.	TokenNameDOT	
addLoaderPackageRoot	TokenNameIdentifier	 add Loader Package Root
(	TokenNameLPAREN	
"org.apache.tools.ant.taskdefs.optional"	TokenNameStringLiteral	org.apache.tools.ant.taskdefs.optional
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setCoreLoader	TokenNameIdentifier	 set Core Loader
(	TokenNameLPAREN	
acl	TokenNameIdentifier	 acl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
existingLoader	TokenNameIdentifier	 existing Loader
&&	TokenNameAND_AND	
classpath	TokenNameIdentifier	 classpath
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
list	TokenNameIdentifier	 list
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
list	TokenNameIdentifier	 list
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Adding to class loader "	TokenNameStringLiteral	Adding to class loader 
+	TokenNamePLUS	
acl	TokenNameIdentifier	 acl
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
acl	TokenNameIdentifier	 acl
.	TokenNameDOT	
addPathElement	TokenNameIdentifier	 add Path Element
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// XXX add exceptions 	TokenNameCOMMENT_LINE	XXX add exceptions 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
