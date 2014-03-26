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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
Resource	TokenNameIdentifier	 Resource
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
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
FileResource	TokenNameIdentifier	 File Resource
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
LoaderUtils	TokenNameIdentifier	 Loader Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
AttributeList	TokenNameIdentifier	 Attribute List
;	TokenNameSEMICOLON	
/** * Configures a Project (complete with Targets and Tasks) based on * a build file. It'll rely on a plugin to do the actual processing * of the file. * <p> * This class also provide static wrappers for common introspection. */	TokenNameCOMMENT_JAVADOC	 Configures a Project (complete with Targets and Tasks) based on a build file. It'll rely on a plugin to do the actual processing of the file. <p> This class also provide static wrappers for common introspection. 
public	TokenNamepublic	
class	TokenNameclass	
ProjectHelper	TokenNameIdentifier	 Project Helper
{	TokenNameLBRACE	
/** The URI for ant name space */	TokenNameCOMMENT_JAVADOC	 The URI for ant name space 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANT_CORE_URI	TokenNameIdentifier	 ANT  CORE  URI
=	TokenNameEQUAL	
"antlib:org.apache.tools.ant"	TokenNameStringLiteral	antlib:org.apache.tools.ant
;	TokenNameSEMICOLON	
/** The URI for antlib current definitions */	TokenNameCOMMENT_JAVADOC	 The URI for antlib current definitions 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANT_CURRENT_URI	TokenNameIdentifier	 ANT  CURRENT  URI
=	TokenNameEQUAL	
"ant:current"	TokenNameStringLiteral	ant:current
;	TokenNameSEMICOLON	
/** The URI for defined types/tasks - the format is antlib:<package> */	TokenNameCOMMENT_JAVADOC	 The URI for defined types/tasks - the format is antlib:<package> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANTLIB_URI	TokenNameIdentifier	 ANTLIB  URI
=	TokenNameEQUAL	
"antlib:"	TokenNameStringLiteral	antlib:
;	TokenNameSEMICOLON	
/** Polymorphic attribute */	TokenNameCOMMENT_JAVADOC	 Polymorphic attribute 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANT_TYPE	TokenNameIdentifier	 ANT  TYPE
=	TokenNameEQUAL	
"ant-type"	TokenNameStringLiteral	ant-type
;	TokenNameSEMICOLON	
/** * Name of JVM system property which provides the name of the * ProjectHelper class to use. */	TokenNameCOMMENT_JAVADOC	 Name of JVM system property which provides the name of the ProjectHelper class to use. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HELPER_PROPERTY	TokenNameIdentifier	 HELPER  PROPERTY
=	TokenNameEQUAL	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
PROJECT_HELPER_CLASS	TokenNameIdentifier	 PROJECT  HELPER  CLASS
;	TokenNameSEMICOLON	
/** * The service identifier in jars which provide Project Helper * implementations. */	TokenNameCOMMENT_JAVADOC	 The service identifier in jars which provide Project Helper implementations. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SERVICE_ID	TokenNameIdentifier	 SERVICE  ID
=	TokenNameEQUAL	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
PROJECT_HELPER_SERVICE	TokenNameIdentifier	 PROJECT  HELPER  SERVICE
;	TokenNameSEMICOLON	
/** * name of project helper reference that we add to a project */	TokenNameCOMMENT_JAVADOC	 name of project helper reference that we add to a project 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROJECTHELPER_REFERENCE	TokenNameIdentifier	 PROJECTHELPER  REFERENCE
=	TokenNameEQUAL	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
REFID_PROJECT_HELPER	TokenNameIdentifier	 REFID  PROJECT  HELPER
;	TokenNameSEMICOLON	
/** * Configures the project with the contents of the specified build file. * * @param project The project to configure. Must not be <code>null</code>. * @param buildFile A build file giving the project's configuration. * Must not be <code>null</code>. * * @exception BuildException if the configuration is invalid or cannot be read */	TokenNameCOMMENT_JAVADOC	 Configures the project with the contents of the specified build file. * @param project The project to configure. Must not be <code>null</code>. @param buildFile A build file giving the project's configuration. Must not be <code>null</code>. * @exception BuildException if the configuration is invalid or cannot be read 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
buildFile	TokenNameIdentifier	 build File
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
FileResource	TokenNameIdentifier	 File Resource
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
new	TokenNamenew	
FileResource	TokenNameIdentifier	 File Resource
(	TokenNameLPAREN	
buildFile	TokenNameIdentifier	 build File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProjectHelper	TokenNameIdentifier	 Project Helper
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
ProjectHelperRepository	TokenNameIdentifier	 Project Helper Repository
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProjectHelperForBuildFile	TokenNameIdentifier	 get Project Helper For Build File
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
PROJECTHELPER_REFERENCE	TokenNameIdentifier	 PROJECTHELPER  REFERENCE
,	TokenNameCOMMA	
helper	TokenNameIdentifier	 helper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
buildFile	TokenNameIdentifier	 build File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Possible value for target's onMissingExtensionPoint attribute. It determines how to deal with * targets that want to extend missing extension-points. * <p> * This class behaves like a Java 1.5 Enum class. * * @since 1.8.2 */	TokenNameCOMMENT_JAVADOC	 Possible value for target's onMissingExtensionPoint attribute. It determines how to deal with targets that want to extend missing extension-points. <p> This class behaves like a Java 1.5 Enum class. * @since 1.8.2 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
OnMissingExtensionPoint	TokenNameIdentifier	 On Missing Extension Point
{	TokenNameLBRACE	
/** fail if the extension-point is not defined */	TokenNameCOMMENT_JAVADOC	 fail if the extension-point is not defined 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
OnMissingExtensionPoint	TokenNameIdentifier	 On Missing Extension Point
FAIL	TokenNameIdentifier	 FAIL
=	TokenNameEQUAL	
new	TokenNamenew	
OnMissingExtensionPoint	TokenNameIdentifier	 On Missing Extension Point
(	TokenNameLPAREN	
"fail"	TokenNameStringLiteral	fail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** warn if the extension-point is not defined */	TokenNameCOMMENT_JAVADOC	 warn if the extension-point is not defined 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
OnMissingExtensionPoint	TokenNameIdentifier	 On Missing Extension Point
WARN	TokenNameIdentifier	 WARN
=	TokenNameEQUAL	
new	TokenNamenew	
OnMissingExtensionPoint	TokenNameIdentifier	 On Missing Extension Point
(	TokenNameLPAREN	
"warn"	TokenNameStringLiteral	warn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** ignore the extensionOf attribute if the extension-point is not defined */	TokenNameCOMMENT_JAVADOC	 ignore the extensionOf attribute if the extension-point is not defined 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
OnMissingExtensionPoint	TokenNameIdentifier	 On Missing Extension Point
IGNORE	TokenNameIdentifier	 IGNORE
=	TokenNameEQUAL	
new	TokenNamenew	
OnMissingExtensionPoint	TokenNameIdentifier	 On Missing Extension Point
(	TokenNameLPAREN	
"ignore"	TokenNameStringLiteral	ignore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
OnMissingExtensionPoint	TokenNameIdentifier	 On Missing Extension Point
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
OnMissingExtensionPoint	TokenNameIdentifier	 On Missing Extension Point
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
FAIL	TokenNameIdentifier	 FAIL
,	TokenNameCOMMA	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
IGNORE	TokenNameIdentifier	 IGNORE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OnMissingExtensionPoint	TokenNameIdentifier	 On Missing Extension Point
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
public	TokenNamepublic	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
OnMissingExtensionPoint	TokenNameIdentifier	 On Missing Extension Point
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
values	TokenNameIdentifier	 values
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
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Unknown onMissingExtensionPoint "	TokenNameStringLiteral	Unknown onMissingExtensionPoint 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Default constructor */	TokenNameCOMMENT_JAVADOC	 Default constructor 
public	TokenNamepublic	
ProjectHelper	TokenNameIdentifier	 Project Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// -------------------- Common properties -------------------- 	TokenNameCOMMENT_LINE	-------------------- Common properties -------------------- 
// The following properties are required by import ( and other tasks 	TokenNameCOMMENT_LINE	The following properties are required by import ( and other tasks 
// that read build files using ProjectHelper ). 	TokenNameCOMMENT_LINE	that read build files using ProjectHelper ). 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
importStack	TokenNameIdentifier	 import Stack
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
extensionStack	TokenNameIdentifier	 extension Stack
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Import stack. * Used to keep track of imported files. Error reporting should * display the import path. * * @return the stack of import source objects. */	TokenNameCOMMENT_JAVADOC	 Import stack. Used to keep track of imported files. Error reporting should display the import path. * @return the stack of import source objects. 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
getImportStack	TokenNameIdentifier	 get Import Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
importStack	TokenNameIdentifier	 import Stack
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Extension stack. * Used to keep track of targets that extend extension points. * * @return a list of three element string arrays where the first * element is the name of the extensionpoint, the second the name * of the target and the third the name of the enum like class * {@link OnMissingExtensionPoint}. */	TokenNameCOMMENT_JAVADOC	 Extension stack. Used to keep track of targets that extend extension points. * @return a list of three element string arrays where the first element is the name of the extensionpoint, the second the name of the target and the third the name of the enum like class {@link OnMissingExtensionPoint}. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getExtensionStack	TokenNameIdentifier	 get Extension Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
extensionStack	TokenNameIdentifier	 extension Stack
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
ThreadLocal	TokenNameIdentifier	 Thread Local
targetPrefix	TokenNameIdentifier	 target Prefix
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadLocal	TokenNameIdentifier	 Thread Local
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
initialValue	TokenNameIdentifier	 initial Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * The prefix to prepend to imported target names. * * <p>May be set by &lt;import&gt;'s as attribute.</p> * * @return the configured prefix or null * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 The prefix to prepend to imported target names. * <p>May be set by &lt;import&gt;'s as attribute.</p> * @return the configured prefix or null * @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getCurrentTargetPrefix	TokenNameIdentifier	 get Current Target Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
targetPrefix	TokenNameIdentifier	 target Prefix
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the prefix to prepend to imported target names. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Sets the prefix to prepend to imported target names. * @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setCurrentTargetPrefix	TokenNameIdentifier	 set Current Target Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
targetPrefix	TokenNameIdentifier	 target Prefix
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
ThreadLocal	TokenNameIdentifier	 Thread Local
prefixSeparator	TokenNameIdentifier	 prefix Separator
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadLocal	TokenNameIdentifier	 Thread Local
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
initialValue	TokenNameIdentifier	 initial Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"."	TokenNameStringLiteral	.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * The separator between the prefix and the target name. * * <p>May be set by &lt;import&gt;'s prefixSeperator attribute.</p> * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 The separator between the prefix and the target name. * <p>May be set by &lt;import&gt;'s prefixSeperator attribute.</p> * @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getCurrentPrefixSeparator	TokenNameIdentifier	 get Current Prefix Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
prefixSeparator	TokenNameIdentifier	 prefix Separator
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the separator between the prefix and the target name. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Sets the separator between the prefix and the target name. * @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setCurrentPrefixSeparator	TokenNameIdentifier	 set Current Prefix Separator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sep	TokenNameIdentifier	 sep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefixSeparator	TokenNameIdentifier	 prefix Separator
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
sep	TokenNameIdentifier	 sep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
ThreadLocal	TokenNameIdentifier	 Thread Local
inIncludeMode	TokenNameIdentifier	 in Include Mode
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadLocal	TokenNameIdentifier	 Thread Local
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
initialValue	TokenNameIdentifier	 initial Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Whether the current file should be read in include as opposed * to import mode. * * <p>In include mode included targets are only known by their * prefixed names and their depends lists get rewritten so that * all dependencies get the prefix as well.</p> * * <p>In import mode imported targets are known by an adorned as * well as a prefixed name and the unadorned target may be * overwritten in the importing build file. The depends list of * the imported targets is not modified at all.</p> * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Whether the current file should be read in include as opposed to import mode. * <p>In include mode included targets are only known by their prefixed names and their depends lists get rewritten so that all dependencies get the prefix as well.</p> * <p>In import mode imported targets are known by an adorned as well as a prefixed name and the unadorned target may be overwritten in the importing build file. The depends list of the imported targets is not modified at all.</p> * @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isInIncludeMode	TokenNameIdentifier	 is In Include Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
inIncludeMode	TokenNameIdentifier	 in Include Mode
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets whether the current file should be read in include as * opposed to import mode. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Sets whether the current file should be read in include as opposed to import mode. * @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setInIncludeMode	TokenNameIdentifier	 set In Include Mode
(	TokenNameLPAREN	
boolean	TokenNameboolean	
includeMode	TokenNameIdentifier	 include Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inIncludeMode	TokenNameIdentifier	 in Include Mode
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
includeMode	TokenNameIdentifier	 include Mode
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -------------------- Parse method -------------------- 	TokenNameCOMMENT_LINE	-------------------- Parse method -------------------- 
/** * Parses the project file, configuring the project as it goes. * * @param project The project for the resulting ProjectHelper to configure. * Must not be <code>null</code>. * @param source The source for XML configuration. A helper must support * at least File, for backward compatibility. Helpers may * support URL, InputStream, etc or specialized types. * * @since Ant1.5 * @exception BuildException if the configuration is invalid or cannot * be read */	TokenNameCOMMENT_JAVADOC	 Parses the project file, configuring the project as it goes. * @param project The project for the resulting ProjectHelper to configure. Must not be <code>null</code>. @param source The source for XML configuration. A helper must support at least File, for backward compatibility. Helpers may support URL, InputStream, etc or specialized types. * @since Ant1.5 @exception BuildException if the configuration is invalid or cannot be read 
public	TokenNamepublic	
void	TokenNamevoid	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"ProjectHelper.parse() must be implemented "	TokenNameStringLiteral	ProjectHelper.parse() must be implemented 
+	TokenNamePLUS	
"in a helper plugin "	TokenNameStringLiteral	in a helper plugin 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the first project helper found in the classpath * * @return an project helper, never <code>null</code> * @see org.apache.tools.ant.ProjectHelperRepository#getHelpers() */	TokenNameCOMMENT_JAVADOC	 Get the first project helper found in the classpath * @return an project helper, never <code>null</code> @see org.apache.tools.ant.ProjectHelperRepository#getHelpers() 
public	TokenNamepublic	
static	TokenNamestatic	
ProjectHelper	TokenNameIdentifier	 Project Helper
getProjectHelper	TokenNameIdentifier	 get Project Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ProjectHelper	TokenNameIdentifier	 Project Helper
)	TokenNameRPAREN	
ProjectHelperRepository	TokenNameIdentifier	 Project Helper Repository
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHelpers	TokenNameIdentifier	 get Helpers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * JDK1.1 compatible access to the context class loader. Cut & paste from JAXP. * * @deprecated since 1.6.x. * Use LoaderUtils.getContextClassLoader() * * @return the current context class loader, or <code>null</code> * if the context class loader is unavailable. */	TokenNameCOMMENT_JAVADOC	 JDK1.1 compatible access to the context class loader. Cut & paste from JAXP. * @deprecated since 1.6.x. Use LoaderUtils.getContextClassLoader() * @return the current context class loader, or <code>null</code> if the context class loader is unavailable. 
public	TokenNamepublic	
static	TokenNamestatic	
ClassLoader	TokenNameIdentifier	 Class Loader
getContextClassLoader	TokenNameIdentifier	 get Context Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LoaderUtils	TokenNameIdentifier	 Loader Utils
.	TokenNameDOT	
isContextLoaderAvailable	TokenNameIdentifier	 is Context Loader Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
LoaderUtils	TokenNameIdentifier	 Loader Utils
.	TokenNameDOT	
getContextClassLoader	TokenNameIdentifier	 get Context Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -------------------- Static utils, used by most helpers ---------------- 	TokenNameCOMMENT_LINE	-------------------- Static utils, used by most helpers ---------------- 
/** * Configures an object using an introspection handler. * * @param target The target object to be configured. * Must not be <code>null</code>. * @param attrs A list of attributes to configure within the target. * Must not be <code>null</code>. * @param project The project containing the target. * Must not be <code>null</code>. * * @deprecated since 1.6.x. * Use IntrospectionHelper for each property. * * @exception BuildException if any of the attributes can't be handled by * the target */	TokenNameCOMMENT_JAVADOC	 Configures an object using an introspection handler. * @param target The target object to be configured. Must not be <code>null</code>. @param attrs A list of attributes to configure within the target. Must not be <code>null</code>. @param project The project containing the target. Must not be <code>null</code>. * @deprecated since 1.6.x. Use IntrospectionHelper for each property. * @exception BuildException if any of the attributes can't be handled by the target 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
AttributeList	TokenNameIdentifier	 Attribute List
attrs	TokenNameIdentifier	 attrs
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
instanceof	TokenNameinstanceof	
TypeAdapter	TokenNameIdentifier	 Type Adapter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TypeAdapter	TokenNameIdentifier	 Type Adapter
)	TokenNameRPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
.	TokenNameDOT	
getProxy	TokenNameIdentifier	 get Proxy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
IntrospectionHelper	TokenNameIdentifier	 Introspection Helper
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
IntrospectionHelper	TokenNameIdentifier	 Introspection Helper
.	TokenNameDOT	
getHelper	TokenNameIdentifier	 get Helper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// reflect these into the target 	TokenNameCOMMENT_LINE	reflect these into the target 
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
replaceProperties	TokenNameIdentifier	 replace Properties
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// id attribute must be set externally 	TokenNameCOMMENT_LINE	id attribute must be set externally 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
be	TokenNameIdentifier	 be
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds the content of #PCDATA sections to an element. * * @param project The project containing the target. * Must not be <code>null</code>. * @param target The target object to be configured. * Must not be <code>null</code>. * @param buf A character array of the text within the element. * Will not be <code>null</code>. * @param start The start element in the array. * @param count The number of characters to read from the array. * * @exception BuildException if the target object doesn't accept text */	TokenNameCOMMENT_JAVADOC	 Adds the content of #PCDATA sections to an element. * @param project The project containing the target. Must not be <code>null</code>. @param target The target object to be configured. Must not be <code>null</code>. @param buf A character array of the text within the element. Will not be <code>null</code>. @param start The start element in the array. @param count The number of characters to read from the array. * @exception BuildException if the target object doesn't accept text 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds the content of #PCDATA sections to an element. * * @param project The project containing the target. * Must not be <code>null</code>. * @param target The target object to be configured. * Must not be <code>null</code>. * @param text Text to add to the target. * May be <code>null</code>, in which case this * method call is a no-op. * * @exception BuildException if the target object doesn't accept text */	TokenNameCOMMENT_JAVADOC	 Adds the content of #PCDATA sections to an element. * @param project The project containing the target. Must not be <code>null</code>. @param target The target object to be configured. Must not be <code>null</code>. @param text Text to add to the target. May be <code>null</code>, in which case this method call is a no-op. * @exception BuildException if the target object doesn't accept text 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
instanceof	TokenNameinstanceof	
TypeAdapter	TokenNameIdentifier	 Type Adapter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TypeAdapter	TokenNameIdentifier	 Type Adapter
)	TokenNameRPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
.	TokenNameDOT	
getProxy	TokenNameIdentifier	 get Proxy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
IntrospectionHelper	TokenNameIdentifier	 Introspection Helper
.	TokenNameDOT	
getHelper	TokenNameIdentifier	 get Helper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Stores a configured child element within its parent object. * * @param project Project containing the objects. * May be <code>null</code>. * @param parent Parent object to add child to. * Must not be <code>null</code>. * @param child Child object to store in parent. * Should not be <code>null</code>. * @param tag Name of element which generated the child. * May be <code>null</code>, in which case * the child is not stored. */	TokenNameCOMMENT_JAVADOC	 Stores a configured child element within its parent object. * @param project Project containing the objects. May be <code>null</code>. @param parent Parent object to add child to. Must not be <code>null</code>. @param child Child object to store in parent. Should not be <code>null</code>. @param tag Name of element which generated the child. May be <code>null</code>, in which case the child is not stored. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
storeChild	TokenNameIdentifier	 store Child
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IntrospectionHelper	TokenNameIdentifier	 Introspection Helper
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
IntrospectionHelper	TokenNameIdentifier	 Introspection Helper
.	TokenNameDOT	
getHelper	TokenNameIdentifier	 get Helper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
storeElement	TokenNameIdentifier	 store Element
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Replaces <code>${xxx}</code> style constructions in the given value with * the string value of the corresponding properties. * * @param project The project containing the properties to replace. * Must not be <code>null</code>. * * @param value The string to be scanned for property references. * May be <code>null</code>. * * @exception BuildException if the string contains an opening * <code>${</code> without a closing * <code>}</code> * @return the original string with the properties replaced, or * <code>null</code> if the original string is <code>null</code>. * * @deprecated since 1.6.x. * Use project.replaceProperties(). * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 Replaces <code>${xxx}</code> style constructions in the given value with the string value of the corresponding properties. * @param project The project containing the properties to replace. Must not be <code>null</code>. * @param value The string to be scanned for property references. May be <code>null</code>. * @exception BuildException if the string contains an opening <code>${</code> without a closing <code>}</code> @return the original string with the properties replaced, or <code>null</code> if the original string is <code>null</code>. * @deprecated since 1.6.x. Use project.replaceProperties(). @since 1.5 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
replaceProperties	TokenNameIdentifier	 replace Properties
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
// needed since project properties are not accessible 	TokenNameCOMMENT_LINE	needed since project properties are not accessible 
return	TokenNamereturn	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
replaceProperties	TokenNameIdentifier	 replace Properties
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Replaces <code>${xxx}</code> style constructions in the given value * with the string value of the corresponding data types. * * @param project The container project. This is used solely for * logging purposes. Must not be <code>null</code>. * @param value The string to be scanned for property references. * May be <code>null</code>, in which case this * method returns immediately with no effect. * @param keys Mapping (String to String) of property names to their * values. Must not be <code>null</code>. * * @exception BuildException if the string contains an opening * <code>${</code> without a closing * <code>}</code> * @return the original string with the properties replaced, or * <code>null</code> if the original string is <code>null</code>. * @deprecated since 1.6.x. * Use PropertyHelper. */	TokenNameCOMMENT_JAVADOC	 Replaces <code>${xxx}</code> style constructions in the given value with the string value of the corresponding data types. * @param project The container project. This is used solely for logging purposes. Must not be <code>null</code>. @param value The string to be scanned for property references. May be <code>null</code>, in which case this method returns immediately with no effect. @param keys Mapping (String to String) of property names to their values. Must not be <code>null</code>. * @exception BuildException if the string contains an opening <code>${</code> without a closing <code>}</code> @return the original string with the properties replaced, or <code>null</code> if the original string is <code>null</code>. @deprecated since 1.6.x. Use PropertyHelper. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
replaceProperties	TokenNameIdentifier	 replace Properties
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Hashtable	TokenNameIdentifier	 Hashtable
keys	TokenNameIdentifier	 keys
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
PropertyHelper	TokenNameIdentifier	 Property Helper
ph	TokenNameIdentifier	 ph
=	TokenNameEQUAL	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
replaceProperties	TokenNameIdentifier	 replace Properties
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
keys	TokenNameIdentifier	 keys
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a string containing <code>${xxx}</code> style property * references into two lists. The first list is a collection * of text fragments, while the other is a set of string property names. * <code>null</code> entries in the first list indicate a property * reference from the second list. * * <p>As of Ant 1.8.0 this method is never invoked by any code * inside of Ant itself.</p> * * @param value Text to parse. Must not be <code>null</code>. * @param fragments List to add text fragments to. * Must not be <code>null</code>. * @param propertyRefs List to add property names to. * Must not be <code>null</code>. * * @deprecated since 1.6.x. * Use PropertyHelper. * @exception BuildException if the string contains an opening * <code>${</code> without a closing <code>}</code> */	TokenNameCOMMENT_JAVADOC	 Parses a string containing <code>${xxx}</code> style property references into two lists. The first list is a collection of text fragments, while the other is a set of string property names. <code>null</code> entries in the first list indicate a property reference from the second list. * <p>As of Ant 1.8.0 this method is never invoked by any code inside of Ant itself.</p> * @param value Text to parse. Must not be <code>null</code>. @param fragments List to add text fragments to. Must not be <code>null</code>. @param propertyRefs List to add property names to. Must not be <code>null</code>. * @deprecated since 1.6.x. Use PropertyHelper. @exception BuildException if the string contains an opening <code>${</code> without a closing <code>}</code> 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
parsePropertyString	TokenNameIdentifier	 parse Property String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
fragments	TokenNameIdentifier	 fragments
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
propertyRefs	TokenNameIdentifier	 property Refs
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
parsePropertyStringDefault	TokenNameIdentifier	 parse Property String Default
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
fragments	TokenNameIdentifier	 fragments
,	TokenNameCOMMA	
propertyRefs	TokenNameIdentifier	 property Refs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Map a namespaced {uri,name} to an internal string format. * For BC purposes the names from the ant core uri will be * mapped to "name", other names will be mapped to * uri + ":" + name. * @param uri The namepace URI * @param name The localname * @return The stringified form of the ns name */	TokenNameCOMMENT_JAVADOC	 Map a namespaced {uri,name} to an internal string format. For BC purposes the names from the ant core uri will be mapped to "name", other names will be mapped to uri + ":" + name. @param uri The namepace URI @param name The localname @return The stringified form of the ns name 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
genComponentName	TokenNameIdentifier	 gen Component Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
||	TokenNameOR_OR	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ANT_CORE_URI	TokenNameIdentifier	 ANT  CORE  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * extract a uri from a component name * * @param componentName The stringified form for {uri, name} * @return The uri or "" if not present */	TokenNameCOMMENT_JAVADOC	 extract a uri from a component name * @param componentName The stringified form for {uri, name} @return The uri or "" if not present 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
extractUriFromComponentName	TokenNameIdentifier	 extract Uri From Component Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
componentName	TokenNameIdentifier	 component Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
componentName	TokenNameIdentifier	 component Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
componentName	TokenNameIdentifier	 component Name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
componentName	TokenNameIdentifier	 component Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * extract the element name from a component name * * @param componentName The stringified form for {uri, name} * @return The element name of the component */	TokenNameCOMMENT_JAVADOC	 extract the element name from a component name * @param componentName The stringified form for {uri, name} @return The element name of the component 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
extractNameFromComponentName	TokenNameIdentifier	 extract Name From Component Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
componentName	TokenNameIdentifier	 component Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
componentName	TokenNameIdentifier	 component Name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
componentName	TokenNameIdentifier	 component Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
componentName	TokenNameIdentifier	 component Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add location to build exception. * @param ex the build exception, if the build exception * does not include * @param newLocation the location of the calling task (may be null) * @return a new build exception based in the build exception with * location set to newLocation. If the original exception * did not have a location, just return the build exception */	TokenNameCOMMENT_JAVADOC	 Add location to build exception. @param ex the build exception, if the build exception does not include @param newLocation the location of the calling task (may be null) @return a new build exception based in the build exception with location set to newLocation. If the original exception did not have a location, just return the build exception 
public	TokenNamepublic	
static	TokenNamestatic	
BuildException	TokenNameIdentifier	 Build Exception
addLocationToBuildException	TokenNameIdentifier	 add Location To Build Exception
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
ex	TokenNameIdentifier	 ex
,	TokenNameCOMMA	
Location	TokenNameIdentifier	 Location
newLocation	TokenNameIdentifier	 new Location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
errorMessage	TokenNameIdentifier	 error Message
=	TokenNameEQUAL	
"The following error occurred while executing this line:"	TokenNameStringLiteral	The following error occurred while executing this line:
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newLocation	TokenNameIdentifier	 new Location
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
errorMessage	TokenNameIdentifier	 error Message
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
errorMessage	TokenNameIdentifier	 error Message
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
,	TokenNameCOMMA	
newLocation	TokenNameIdentifier	 new Location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether this instance of ProjectHelper can parse an Antlib * descriptor given by the URL and return its content as an * UnknownElement ready to be turned into an Antlib task. * * <p>This method should not try to parse the content of the * descriptor, the URL is only given as an argument to allow * subclasses to decide whether they can support a given URL * scheme or not.</p> * * <p>Subclasses that return true in this method must also * override {@link #parseAntlibDescriptor * parseAntlibDescriptor}.</p> * * <p>This implementation returns false.</p> * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Whether this instance of ProjectHelper can parse an Antlib descriptor given by the URL and return its content as an UnknownElement ready to be turned into an Antlib task. * <p>This method should not try to parse the content of the descriptor, the URL is only given as an argument to allow subclasses to decide whether they can support a given URL scheme or not.</p> * <p>Subclasses that return true in this method must also override {@link #parseAntlibDescriptor parseAntlibDescriptor}.</p> * <p>This implementation returns false.</p> * @since Ant 1.8.0 
public	TokenNamepublic	
boolean	TokenNameboolean	
canParseAntlibDescriptor	TokenNameIdentifier	 can Parse Antlib Descriptor
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse the given URL as an antlib descriptor and return the * content as something that can be turned into an Antlib task. * * @since ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Parse the given URL as an antlib descriptor and return the content as something that can be turned into an Antlib task. * @since ant 1.8.0 
public	TokenNamepublic	
UnknownElement	TokenNameIdentifier	 Unknown Element
parseAntlibDescriptor	TokenNameIdentifier	 parse Antlib Descriptor
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
containingProject	TokenNameIdentifier	 containing Project
,	TokenNameCOMMA	
Resource	TokenNameIdentifier	 Resource
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"can't parse antlib descriptors"	TokenNameStringLiteral	can't parse antlib descriptors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if the helper supports the kind of file. Some basic check on the * extension's file should be done here. * * @param buildFile * the file expected to be parsed (never <code>null</code>) * @return true if the helper supports it * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Check if the helper supports the kind of file. Some basic check on the extension's file should be done here. * @param buildFile the file expected to be parsed (never <code>null</code>) @return true if the helper supports it @since Ant 1.8.0 
public	TokenNamepublic	
boolean	TokenNameboolean	
canParseBuildFile	TokenNameIdentifier	 can Parse Build File
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
buildFile	TokenNameIdentifier	 build File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The file name of the build script to be parsed if none specified on the command line * * @return the name of the default file (never <code>null</code>) * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 The file name of the build script to be parsed if none specified on the command line * @return the name of the default file (never <code>null</code>) @since Ant 1.8.0 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDefaultBuildFile	TokenNameIdentifier	 get Default Build File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Main	TokenNameIdentifier	 Main
.	TokenNameDOT	
DEFAULT_BUILD_FILENAME	TokenNameIdentifier	 DEFAULT  BUILD  FILENAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
