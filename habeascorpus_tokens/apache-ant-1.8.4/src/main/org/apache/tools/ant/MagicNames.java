/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
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
launch	TokenNameIdentifier	 launch
.	TokenNameDOT	
Launcher	TokenNameIdentifier	 Launcher
;	TokenNameSEMICOLON	
/** * Magic names used within Ant. * * Not all magic names are here yet. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Magic names used within Ant. * Not all magic names are here yet. * @since Ant 1.6 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
MagicNames	TokenNameIdentifier	 Magic Names
{	TokenNameLBRACE	
private	TokenNameprivate	
MagicNames	TokenNameIdentifier	 Magic Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * prefix for antlib URIs: * {@value} */	TokenNameCOMMENT_JAVADOC	 prefix for antlib URIs: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANTLIB_PREFIX	TokenNameIdentifier	 ANTLIB  PREFIX
=	TokenNameEQUAL	
"antlib:"	TokenNameStringLiteral	antlib:
;	TokenNameSEMICOLON	
/** * Ant version property. * Value: {@value} */	TokenNameCOMMENT_JAVADOC	 Ant version property. Value: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANT_VERSION	TokenNameIdentifier	 ANT  VERSION
=	TokenNameEQUAL	
"ant.version"	TokenNameStringLiteral	ant.version
;	TokenNameSEMICOLON	
/** * System classpath policy. * Value: {@value} */	TokenNameCOMMENT_JAVADOC	 System classpath policy. Value: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BUILD_SYSCLASSPATH	TokenNameIdentifier	 BUILD  SYSCLASSPATH
=	TokenNameEQUAL	
"build.sysclasspath"	TokenNameStringLiteral	build.sysclasspath
;	TokenNameSEMICOLON	
/** * The name of the script repository used by the script repo task. * Value {@value} */	TokenNameCOMMENT_JAVADOC	 The name of the script repository used by the script repo task. Value {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCRIPT_REPOSITORY	TokenNameIdentifier	 SCRIPT  REPOSITORY
=	TokenNameEQUAL	
"org.apache.ant.scriptrepo"	TokenNameStringLiteral	org.apache.ant.scriptrepo
;	TokenNameSEMICOLON	
/** * The name of the reference to the System Class Loader. * Value {@value} **/	TokenNameCOMMENT_JAVADOC	 The name of the reference to the System Class Loader. Value {@value} *
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SYSTEM_LOADER_REF	TokenNameIdentifier	 SYSTEM  LOADER  REF
=	TokenNameEQUAL	
"ant.coreLoader"	TokenNameStringLiteral	ant.coreLoader
;	TokenNameSEMICOLON	
/** * Name of the property which can provide an override of the repository dir. * for the libraries task * Value {@value} */	TokenNameCOMMENT_JAVADOC	 Name of the property which can provide an override of the repository dir. for the libraries task Value {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REPOSITORY_DIR_PROPERTY	TokenNameIdentifier	 REPOSITORY  DIR  PROPERTY
=	TokenNameEQUAL	
"ant.maven.repository.dir"	TokenNameStringLiteral	ant.maven.repository.dir
;	TokenNameSEMICOLON	
/** * Name of the property which can provide an override of the repository URL. * for the libraries task * Value {@value} */	TokenNameCOMMENT_JAVADOC	 Name of the property which can provide an override of the repository URL. for the libraries task Value {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REPOSITORY_URL_PROPERTY	TokenNameIdentifier	 REPOSITORY  URL  PROPERTY
=	TokenNameEQUAL	
"ant.maven.repository.url"	TokenNameStringLiteral	ant.maven.repository.url
;	TokenNameSEMICOLON	
/** * name of the resource that taskdefs are stored under. * Value: {@value} */	TokenNameCOMMENT_JAVADOC	 name of the resource that taskdefs are stored under. Value: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TASKDEF_PROPERTIES_RESOURCE	TokenNameIdentifier	 TASKDEF  PROPERTIES  RESOURCE
=	TokenNameEQUAL	
"/org/apache/tools/ant/taskdefs/defaults.properties"	TokenNameStringLiteral	/org/apache/tools/ant/taskdefs/defaults.properties
;	TokenNameSEMICOLON	
/** * name of the resource that typedefs are stored under. * Value: {@value} */	TokenNameCOMMENT_JAVADOC	 name of the resource that typedefs are stored under. Value: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TYPEDEFS_PROPERTIES_RESOURCE	TokenNameIdentifier	 TYPEDEFS  PROPERTIES  RESOURCE
=	TokenNameEQUAL	
"/org/apache/tools/ant/types/defaults.properties"	TokenNameStringLiteral	/org/apache/tools/ant/types/defaults.properties
;	TokenNameSEMICOLON	
/** * Reference to the current Ant executor. * Value: {@value} */	TokenNameCOMMENT_JAVADOC	 Reference to the current Ant executor. Value: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANT_EXECUTOR_REFERENCE	TokenNameIdentifier	 ANT  EXECUTOR  REFERENCE
=	TokenNameEQUAL	
"ant.executor"	TokenNameStringLiteral	ant.executor
;	TokenNameSEMICOLON	
/** * Property defining the classname of an executor. * Value: {@value} */	TokenNameCOMMENT_JAVADOC	 Property defining the classname of an executor. Value: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANT_EXECUTOR_CLASSNAME	TokenNameIdentifier	 ANT  EXECUTOR  CLASSNAME
=	TokenNameEQUAL	
"ant.executor.class"	TokenNameStringLiteral	ant.executor.class
;	TokenNameSEMICOLON	
/** * property name for basedir of the project. * Value: {@value} */	TokenNameCOMMENT_JAVADOC	 property name for basedir of the project. Value: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROJECT_BASEDIR	TokenNameIdentifier	 PROJECT  BASEDIR
=	TokenNameEQUAL	
"basedir"	TokenNameStringLiteral	basedir
;	TokenNameSEMICOLON	
/** * property for ant file name. * Value: {@value} */	TokenNameCOMMENT_JAVADOC	 property for ant file name. Value: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANT_FILE	TokenNameIdentifier	 ANT  FILE
=	TokenNameEQUAL	
"ant.file"	TokenNameStringLiteral	ant.file
;	TokenNameSEMICOLON	
/** * property for type of ant build file (either file or url) * Value: {@value} * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 property for type of ant build file (either file or url) Value: {@value} @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANT_FILE_TYPE	TokenNameIdentifier	 ANT  FILE  TYPE
=	TokenNameEQUAL	
"ant.file.type"	TokenNameStringLiteral	ant.file.type
;	TokenNameSEMICOLON	
/** * ant build file of type file * Value: {@value} * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 ant build file of type file Value: {@value} @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANT_FILE_TYPE_FILE	TokenNameIdentifier	 ANT  FILE  TYPE  FILE
=	TokenNameEQUAL	
"file"	TokenNameStringLiteral	file
;	TokenNameSEMICOLON	
/** * ant build file of type url * Value: {@value} * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 ant build file of type url Value: {@value} @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANT_FILE_TYPE_URL	TokenNameIdentifier	 ANT  FILE  TYPE  URL
=	TokenNameEQUAL	
"url"	TokenNameStringLiteral	url
;	TokenNameSEMICOLON	
/** * Property used to store the java version ant is running in. * Value: {@value} * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Property used to store the java version ant is running in. Value: {@value} @since Ant 1.7 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANT_JAVA_VERSION	TokenNameIdentifier	 ANT  JAVA  VERSION
=	TokenNameEQUAL	
"ant.java.version"	TokenNameStringLiteral	ant.java.version
;	TokenNameSEMICOLON	
/** * Property used to store the location of ant. * Value: {@value} * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Property used to store the location of ant. Value: {@value} @since Ant 1.7 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANT_HOME	TokenNameIdentifier	 ANT  HOME
=	TokenNameEQUAL	
Launcher	TokenNameIdentifier	 Launcher
.	TokenNameDOT	
ANTHOME_PROPERTY	TokenNameIdentifier	 ANTHOME  PROPERTY
;	TokenNameSEMICOLON	
/** * Property used to store the location of the ant library (typically the ant.jar file.) * Value: {@value} * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Property used to store the location of the ant library (typically the ant.jar file.) Value: {@value} @since Ant 1.7 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANT_LIB	TokenNameIdentifier	 ANT  LIB
=	TokenNameEQUAL	
"ant.core.lib"	TokenNameStringLiteral	ant.core.lib
;	TokenNameSEMICOLON	
/** * property for regular expression implementation. * Value: {@value} */	TokenNameCOMMENT_JAVADOC	 property for regular expression implementation. Value: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REGEXP_IMPL	TokenNameIdentifier	 REGEXP  IMPL
=	TokenNameEQUAL	
"ant.regexp.regexpimpl"	TokenNameStringLiteral	ant.regexp.regexpimpl
;	TokenNameSEMICOLON	
/** * property that provides the default value for javac's and * javadoc's source attribute. * Value: {@value} * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 property that provides the default value for javac's and javadoc's source attribute. Value: {@value} @since Ant 1.7 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BUILD_JAVAC_SOURCE	TokenNameIdentifier	 BUILD  JAVAC  SOURCE
=	TokenNameEQUAL	
"ant.build.javac.source"	TokenNameStringLiteral	ant.build.javac.source
;	TokenNameSEMICOLON	
/** * property that provides the default value for javac's target attribute. * Value: {@value} * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 property that provides the default value for javac's target attribute. Value: {@value} @since Ant 1.7 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BUILD_JAVAC_TARGET	TokenNameIdentifier	 BUILD  JAVAC  TARGET
=	TokenNameEQUAL	
"ant.build.javac.target"	TokenNameStringLiteral	ant.build.javac.target
;	TokenNameSEMICOLON	
/** * Name of the magic property that controls classloader reuse. * Value: {@value} * @since Ant 1.4. */	TokenNameCOMMENT_JAVADOC	 Name of the magic property that controls classloader reuse. Value: {@value} @since Ant 1.4. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REFID_CLASSPATH_REUSE_LOADER	TokenNameIdentifier	 REFID  CLASSPATH  REUSE  LOADER
=	TokenNameEQUAL	
"ant.reuse.loader"	TokenNameStringLiteral	ant.reuse.loader
;	TokenNameSEMICOLON	
/** * Prefix used to store classloader references. * Value: {@value} */	TokenNameCOMMENT_JAVADOC	 Prefix used to store classloader references. Value: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REFID_CLASSPATH_LOADER_PREFIX	TokenNameIdentifier	 REFID  CLASSPATH  LOADER  PREFIX
=	TokenNameEQUAL	
"ant.loader."	TokenNameStringLiteral	ant.loader.
;	TokenNameSEMICOLON	
/** * Reference used to store the property helper. * Value: {@value} */	TokenNameCOMMENT_JAVADOC	 Reference used to store the property helper. Value: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REFID_PROPERTY_HELPER	TokenNameIdentifier	 REFID  PROPERTY  HELPER
=	TokenNameEQUAL	
"ant.PropertyHelper"	TokenNameStringLiteral	ant.PropertyHelper
;	TokenNameSEMICOLON	
/** * Reference used to store the local properties. * Value: {@value} */	TokenNameCOMMENT_JAVADOC	 Reference used to store the local properties. Value: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REFID_LOCAL_PROPERTIES	TokenNameIdentifier	 REFID  LOCAL  PROPERTIES
=	TokenNameEQUAL	
"ant.LocalProperties"	TokenNameStringLiteral	ant.LocalProperties
;	TokenNameSEMICOLON	
/** * Name of JVM system property which provides the name of the ProjectHelper class to use. * Value: {@value} */	TokenNameCOMMENT_JAVADOC	 Name of JVM system property which provides the name of the ProjectHelper class to use. Value: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROJECT_HELPER_CLASS	TokenNameIdentifier	 PROJECT  HELPER  CLASS
=	TokenNameEQUAL	
"org.apache.tools.ant.ProjectHelper"	TokenNameStringLiteral	org.apache.tools.ant.ProjectHelper
;	TokenNameSEMICOLON	
/** * The service identifier in jars which provide ProjectHelper implementations. * Value: {@value} */	TokenNameCOMMENT_JAVADOC	 The service identifier in jars which provide ProjectHelper implementations. Value: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROJECT_HELPER_SERVICE	TokenNameIdentifier	 PROJECT  HELPER  SERVICE
=	TokenNameEQUAL	
"META-INF/services/org.apache.tools.ant.ProjectHelper"	TokenNameStringLiteral	META-INF/services/org.apache.tools.ant.ProjectHelper
;	TokenNameSEMICOLON	
/** * Name of ProjectHelper reference that we add to a project. * Value: {@value} */	TokenNameCOMMENT_JAVADOC	 Name of ProjectHelper reference that we add to a project. Value: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REFID_PROJECT_HELPER	TokenNameIdentifier	 REFID  PROJECT  HELPER
=	TokenNameEQUAL	
"ant.projectHelper"	TokenNameStringLiteral	ant.projectHelper
;	TokenNameSEMICOLON	
/** * Name of the property holding the name of the currently * executing project, if one has been specified. * * Value: {@value} * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Name of the property holding the name of the currently executing project, if one has been specified. * Value: {@value} @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROJECT_NAME	TokenNameIdentifier	 PROJECT  NAME
=	TokenNameEQUAL	
"ant.project.name"	TokenNameStringLiteral	ant.project.name
;	TokenNameSEMICOLON	
/** * Name of the property holding the default target of the * currently executing project, if one has been specified. * * Value: {@value} * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Name of the property holding the default target of the currently executing project, if one has been specified. * Value: {@value} @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROJECT_DEFAULT_TARGET	TokenNameIdentifier	 PROJECT  DEFAULT  TARGET
=	TokenNameEQUAL	
"ant.project.default-target"	TokenNameStringLiteral	ant.project.default-target
;	TokenNameSEMICOLON	
/** * Name of the property holding a comma separated list of targets * that have been invoked (from the command line). * * Value: {@value} * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Name of the property holding a comma separated list of targets that have been invoked (from the command line). * Value: {@value} @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROJECT_INVOKED_TARGETS	TokenNameIdentifier	 PROJECT  INVOKED  TARGETS
=	TokenNameEQUAL	
"ant.project.invoked-targets"	TokenNameStringLiteral	ant.project.invoked-targets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
