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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ClasspathUtils	TokenNameIdentifier	 Classpath Utils
;	TokenNameSEMICOLON	
/** * Base class for Definitions handling uri and class loading. * (This was part of Definer) * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Base class for Definitions handling uri and class loading. (This was part of Definer) * @since Ant 1.6 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DefBase	TokenNameIdentifier	 Def Base
extends	TokenNameextends	
AntlibDefinition	TokenNameIdentifier	 Antlib Definition
{	TokenNameLBRACE	
private	TokenNameprivate	
ClassLoader	TokenNameIdentifier	 Class Loader
createdLoader	TokenNameIdentifier	 created Loader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ClasspathUtils	TokenNameIdentifier	 Classpath Utils
.	TokenNameDOT	
Delegate	TokenNameIdentifier	 Delegate
cpDelegate	TokenNameIdentifier	 cp Delegate
;	TokenNameSEMICOLON	
/** * Check if classpath attributes have been set. * (to be called before getCpDelegate() is used. * @return true if cpDelegate has been created. */	TokenNameCOMMENT_JAVADOC	 Check if classpath attributes have been set. (to be called before getCpDelegate() is used. @return true if cpDelegate has been created. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
hasCpDelegate	TokenNameIdentifier	 has Cp Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cpDelegate	TokenNameIdentifier	 cp Delegate
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param reverseLoader if true a delegated loader will take precedence over * the parent * @deprecated since 1.6.x. * stop using this attribute * @ant.attribute ignore="true" */	TokenNameCOMMENT_JAVADOC	 @param reverseLoader if true a delegated loader will take precedence over the parent @deprecated since 1.6.x. stop using this attribute @ant.attribute ignore="true" 
public	TokenNamepublic	
void	TokenNamevoid	
setReverseLoader	TokenNameIdentifier	 set Reverse Loader
(	TokenNameLPAREN	
boolean	TokenNameboolean	
reverseLoader	TokenNameIdentifier	 reverse Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getDelegate	TokenNameIdentifier	 get Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setReverseLoader	TokenNameIdentifier	 set Reverse Loader
(	TokenNameLPAREN	
reverseLoader	TokenNameIdentifier	 reverse Loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"The reverseloader attribute is DEPRECATED. It will be removed"	TokenNameStringLiteral	The reverseloader attribute is DEPRECATED. It will be removed
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the classpath for this definition */	TokenNameCOMMENT_JAVADOC	 @return the classpath for this definition 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDelegate	TokenNameIdentifier	 get Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the reverse loader attribute of the classpath delegate. */	TokenNameCOMMENT_JAVADOC	 @return the reverse loader attribute of the classpath delegate. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReverseLoader	TokenNameIdentifier	 is Reverse Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDelegate	TokenNameIdentifier	 get Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isReverseLoader	TokenNameIdentifier	 is Reverse Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the loader id of the class path Delegate. * @return the loader id */	TokenNameCOMMENT_JAVADOC	 Returns the loader id of the class path Delegate. @return the loader id 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLoaderId	TokenNameIdentifier	 get Loader Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDelegate	TokenNameIdentifier	 get Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassLoadId	TokenNameIdentifier	 get Class Load Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the class path id of the class path delegate. * @return the class path id */	TokenNameCOMMENT_JAVADOC	 Returns the class path id of the class path delegate. @return the class path id 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getClasspathId	TokenNameIdentifier	 get Classpath Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDelegate	TokenNameIdentifier	 get Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassLoadId	TokenNameIdentifier	 get Class Load Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the classpath to be used when searching for component being defined. * * @param classpath an Ant Path object containing the classpath. */	TokenNameCOMMENT_JAVADOC	 Set the classpath to be used when searching for component being defined. * @param classpath an Ant Path object containing the classpath. 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getDelegate	TokenNameIdentifier	 get Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create the classpath to be used when searching for component being * defined. * @return the classpath of the this definition */	TokenNameCOMMENT_JAVADOC	 Create the classpath to be used when searching for component being defined. @return the classpath of the this definition 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDelegate	TokenNameIdentifier	 get Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a reference to a classpath to use when loading the files. * To actually share the same loader, set loaderref as well * @param r the reference to the classpath */	TokenNameCOMMENT_JAVADOC	 Set a reference to a classpath to use when loading the files. To actually share the same loader, set loaderref as well @param r the reference to the classpath 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspathRef	TokenNameIdentifier	 set Classpath Ref
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getDelegate	TokenNameIdentifier	 get Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setClasspathref	TokenNameIdentifier	 set Classpathref
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Use the reference to locate the loader. If the loader is not * found, the specified classpath will be used and registered * with the specified name. * * This allows multiple taskdef/typedef to use the same class loader, * so they can be used together, eliminating the need to * put them in the CLASSPATH. * * @param r the reference to locate the loader. * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Use the reference to locate the loader. If the loader is not found, the specified classpath will be used and registered with the specified name. * This allows multiple taskdef/typedef to use the same class loader, so they can be used together, eliminating the need to put them in the CLASSPATH. * @param r the reference to locate the loader. @since Ant 1.5 
public	TokenNamepublic	
void	TokenNamevoid	
setLoaderRef	TokenNameIdentifier	 set Loader Ref
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getDelegate	TokenNameIdentifier	 get Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLoaderRef	TokenNameIdentifier	 set Loader Ref
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * create a classloader for this definition * @return the classloader from the cpDelegate */	TokenNameCOMMENT_JAVADOC	 create a classloader for this definition @return the classloader from the cpDelegate 
protected	TokenNameprotected	
ClassLoader	TokenNameIdentifier	 Class Loader
createLoader	TokenNameIdentifier	 create Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getAntlibClassLoader	TokenNameIdentifier	 get Antlib Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
cpDelegate	TokenNameIdentifier	 cp Delegate
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAntlibClassLoader	TokenNameIdentifier	 get Antlib Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
createdLoader	TokenNameIdentifier	 created Loader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createdLoader	TokenNameIdentifier	 created Loader
=	TokenNameEQUAL	
getDelegate	TokenNameIdentifier	 get Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// need to load Task via system classloader or the new 	TokenNameCOMMENT_LINE	need to load Task via system classloader or the new 
// task we want to define will never be a Task but always 	TokenNameCOMMENT_LINE	task we want to define will never be a Task but always 
// be wrapped into a TaskAdapter. 	TokenNameCOMMENT_LINE	be wrapped into a TaskAdapter. 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
)	TokenNameRPAREN	
createdLoader	TokenNameIdentifier	 created Loader
)	TokenNameRPAREN	
.	TokenNameDOT	
addSystemPackageRoot	TokenNameIdentifier	 add System Package Root
(	TokenNameLPAREN	
"org.apache.tools.ant"	TokenNameStringLiteral	org.apache.tools.ant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
createdLoader	TokenNameIdentifier	 created Loader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.tools.ant.Task#init() * @throws BuildException on error. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 @see org.apache.tools.ant.Task#init() @throws BuildException on error. @since Ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ClasspathUtils	TokenNameIdentifier	 Classpath Utils
.	TokenNameDOT	
Delegate	TokenNameIdentifier	 Delegate
getDelegate	TokenNameIdentifier	 get Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cpDelegate	TokenNameIdentifier	 cp Delegate
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cpDelegate	TokenNameIdentifier	 cp Delegate
=	TokenNameEQUAL	
ClasspathUtils	TokenNameIdentifier	 Classpath Utils
.	TokenNameDOT	
getDelegate	TokenNameIdentifier	 get Delegate
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
cpDelegate	TokenNameIdentifier	 cp Delegate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
