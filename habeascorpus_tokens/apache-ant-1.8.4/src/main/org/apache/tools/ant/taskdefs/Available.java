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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
PropertyHelper	TokenNameIdentifier	 Property Helper
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
Condition	TokenNameIdentifier	 Condition
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
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
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
FileUtils	TokenNameIdentifier	 File Utils
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
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * Will set the given property if the requested resource is available at * runtime. This task may also be used as a condition by the condition task. * * @since Ant 1.1 * * @ant.task category="control" */	TokenNameCOMMENT_JAVADOC	 Will set the given property if the requested resource is available at runtime. This task may also be used as a condition by the condition task. * @since Ant 1.1 * @ant.task category="control" 
public	TokenNamepublic	
class	TokenNameclass	
Available	TokenNameIdentifier	 Available
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
implements	TokenNameimplements	
Condition	TokenNameIdentifier	 Condition
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
FileUtils	TokenNameIdentifier	 File Utils
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
filepath	TokenNameIdentifier	 filepath
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
resource	TokenNameIdentifier	 resource
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FileDir	TokenNameIdentifier	 File Dir
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
private	TokenNameprivate	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
loader	TokenNameIdentifier	 loader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
"true"	TokenNameStringLiteral	true
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
isTask	TokenNameIdentifier	 is Task
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
ignoreSystemclasses	TokenNameIdentifier	 ignore Systemclasses
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
searchParents	TokenNameIdentifier	 search Parents
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Set the searchParents attribute. * This controls the behaviour of the the "file" type. * If true, the path, parent path and grandparent path are * searched for the file. If false, only the path is seached. * The default value is false. * @param searchParents the value to set. */	TokenNameCOMMENT_JAVADOC	 Set the searchParents attribute. This controls the behaviour of the the "file" type. If true, the path, parent path and grandparent path are searched for the file. If false, only the path is seached. The default value is false. @param searchParents the value to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setSearchParents	TokenNameIdentifier	 set Search Parents
(	TokenNameLPAREN	
boolean	TokenNameboolean	
searchParents	TokenNameIdentifier	 search Parents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
searchParents	TokenNameIdentifier	 search Parents
=	TokenNameEQUAL	
searchParents	TokenNameIdentifier	 search Parents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the classpath to be used when searching for classes and resources. * * @param classpath an Ant Path object containing the search path. */	TokenNameCOMMENT_JAVADOC	 Set the classpath to be used when searching for classes and resources. * @param classpath an Ant Path object containing the search path. 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Classpath to be used when searching for classes and resources. * * @return an empty Path instance to be configured by Ant. */	TokenNameCOMMENT_JAVADOC	 Classpath to be used when searching for classes and resources. * @return an empty Path instance to be configured by Ant. 
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
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
/** * Set the classpath by reference. * * @param r a Reference to a Path instance to be used as the classpath * value. */	TokenNameCOMMENT_JAVADOC	 Set the classpath by reference. * @param r a Reference to a Path instance to be used as the classpath value. 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspathRef	TokenNameIdentifier	 set Classpath Ref
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the path to use when looking for a file. * * @param filepath a Path instance containing the search path for files. */	TokenNameCOMMENT_JAVADOC	 Set the path to use when looking for a file. * @param filepath a Path instance containing the search path for files. 
public	TokenNamepublic	
void	TokenNamevoid	
setFilepath	TokenNameIdentifier	 set Filepath
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
filepath	TokenNameIdentifier	 filepath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createFilepath	TokenNameIdentifier	 create Filepath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
filepath	TokenNameIdentifier	 filepath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Path to search for file resources. * * @return a new Path instance which Ant will configure with a file search * path. */	TokenNameCOMMENT_JAVADOC	 Path to search for file resources. * @return a new Path instance which Ant will configure with a file search path. 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createFilepath	TokenNameIdentifier	 create Filepath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
filepath	TokenNameIdentifier	 filepath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
filepath	TokenNameIdentifier	 filepath
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
filepath	TokenNameIdentifier	 filepath
.	TokenNameDOT	
createPath	TokenNameIdentifier	 create Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the name of the property which will be set if the particular resource * is available. * * @param property the name of the property to set. */	TokenNameCOMMENT_JAVADOC	 Set the name of the property which will be set if the particular resource is available. * @param property the name of the property to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
property	TokenNameIdentifier	 property
=	TokenNameEQUAL	
property	TokenNameIdentifier	 property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the value to be given to the property if the desired resource is * available. * * @param value the value to be given. */	TokenNameCOMMENT_JAVADOC	 Set the value to be given to the property if the desired resource is available. * @param value the value to be given. 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the value to be given to the property if the desired resource is * available. * * @param value the value to be given. */	TokenNameCOMMENT_JAVADOC	 Set the value to be given to the property if the desired resource is available. * @param value the value to be given. 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a classname of a class which must be available to set the given * property. * * @param classname the name of the class required. */	TokenNameCOMMENT_JAVADOC	 Set a classname of a class which must be available to set the given property. * @param classname the name of the class required. 
public	TokenNamepublic	
void	TokenNamevoid	
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classname	TokenNameIdentifier	 classname
=	TokenNameEQUAL	
classname	TokenNameIdentifier	 classname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the file which must be present in the file system to set the given * property. * * @param file the name of the file which is required. */	TokenNameCOMMENT_JAVADOC	 Set the file which must be present in the file system to set the given property. * @param file the name of the file which is required. 
public	TokenNamepublic	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the name of a Java resource which is required to set the property. * * @param resource the name of a resource which is required to be available. */	TokenNameCOMMENT_JAVADOC	 Set the name of a Java resource which is required to set the property. * @param resource the name of a resource which is required to be available. 
public	TokenNamepublic	
void	TokenNamevoid	
setResource	TokenNameIdentifier	 set Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
resource	TokenNameIdentifier	 resource
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated since 1.5.x. * setType(String) is deprecated and is replaced with * setType(Available.FileDir) to make Ant's Introspection * mechanism do the work and also to encapsulate operations on * the type in its own class. * @param type the type of resource */	TokenNameCOMMENT_JAVADOC	 @deprecated since 1.5.x. setType(String) is deprecated and is replaced with setType(Available.FileDir) to make Ant's Introspection mechanism do the work and also to encapsulate operations on the type in its own class. @param type the type of resource 
public	TokenNamepublic	
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"DEPRECATED - The setType(String) method has been deprecated."	TokenNameStringLiteral	DEPRECATED - The setType(String) method has been deprecated.
+	TokenNamePLUS	
" Use setType(Available.FileDir) instead."	TokenNameStringLiteral	 Use setType(Available.FileDir) instead.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
new	TokenNamenew	
FileDir	TokenNameIdentifier	 File Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set what type of file is required - either directory or file. * * @param type an instance of the FileDir enumeratedAttribute indicating * whether the file required is to be a directory or a plain * file. */	TokenNameCOMMENT_JAVADOC	 Set what type of file is required - either directory or file. * @param type an instance of the FileDir enumeratedAttribute indicating whether the file required is to be a directory or a plain file. 
public	TokenNamepublic	
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
FileDir	TokenNameIdentifier	 File Dir
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether the search for classes should ignore the runtime classes and * just use the given classpath. * * @param ignore true if system classes are to be ignored. */	TokenNameCOMMENT_JAVADOC	 Set whether the search for classes should ignore the runtime classes and just use the given classpath. * @param ignore true if system classes are to be ignored. 
public	TokenNamepublic	
void	TokenNamevoid	
setIgnoresystemclasses	TokenNameIdentifier	 set Ignoresystemclasses
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignore	TokenNameIdentifier	 ignore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ignoreSystemclasses	TokenNameIdentifier	 ignore Systemclasses
=	TokenNameEQUAL	
ignore	TokenNameIdentifier	 ignore
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Entry point when operating as a task. * * @exception BuildException if the task is not configured correctly. */	TokenNameCOMMENT_JAVADOC	 Entry point when operating as a task. * @exception BuildException if the task is not configured correctly. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"property attribute is required"	TokenNameStringLiteral	property attribute is required
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isTask	TokenNameIdentifier	 is Task
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PropertyHelper	TokenNameIdentifier	 Property Helper
ph	TokenNameIdentifier	 ph
=	TokenNameEQUAL	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
oldvalue	TokenNameIdentifier	 oldvalue
=	TokenNameEQUAL	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
oldvalue	TokenNameIdentifier	 oldvalue
&&	TokenNameAND_AND	
!	TokenNameNOT	
oldvalue	TokenNameIdentifier	 oldvalue
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"DEPRECATED - <available> used to override an existing"	TokenNameStringLiteral	DEPRECATED - <available> used to override an existing
+	TokenNamePLUS	
" property."	TokenNameStringLiteral	 property.
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
" Build file should not reuse the same property"	TokenNameStringLiteral	 Build file should not reuse the same property
+	TokenNamePLUS	
" name for different values."	TokenNameStringLiteral	 name for different values.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// NB: this makes use of Project#setProperty rather than Project#setNewProperty 	TokenNameCOMMENT_LINE	NB: this makes use of Project#setProperty rather than Project#setNewProperty 
// due to backwards compatiblity reasons 	TokenNameCOMMENT_LINE	due to backwards compatiblity reasons 
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
isTask	TokenNameIdentifier	 is Task
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Evaluate the availability of a resource. * * @return boolean is the resource is available. * @exception BuildException if the condition is not configured correctly */	TokenNameCOMMENT_JAVADOC	 Evaluate the availability of a resource. * @return boolean is the resource is available. @exception BuildException if the condition is not configured correctly 
public	TokenNamepublic	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
file	TokenNameIdentifier	 file
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
resource	TokenNameIdentifier	 resource
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"At least one of (classname|file|"	TokenNameStringLiteral	At least one of (classname|file|
+	TokenNamePLUS	
"resource) is required"	TokenNameStringLiteral	resource) is required
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The type attribute is only valid "	TokenNameStringLiteral	The type attribute is only valid 
+	TokenNamePLUS	
"when specifying the file "	TokenNameStringLiteral	when specifying the file 
+	TokenNamePLUS	
"attribute."	TokenNameStringLiteral	attribute.
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
appendix	TokenNameIdentifier	 appendix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isTask	TokenNameIdentifier	 is Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendix	TokenNameIdentifier	 appendix
=	TokenNameEQUAL	
" to set property "	TokenNameStringLiteral	 to set property 
+	TokenNamePLUS	
property	TokenNameIdentifier	 property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setTaskName	TokenNameIdentifier	 set Task Name
(	TokenNameLPAREN	
"available"	TokenNameStringLiteral	available
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
checkClass	TokenNameIdentifier	 check Class
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Unable to load class "	TokenNameStringLiteral	Unable to load class 
+	TokenNamePLUS	
classname	TokenNameIdentifier	 classname
+	TokenNamePLUS	
appendix	TokenNameIdentifier	 appendix
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
checkFile	TokenNameIdentifier	 check File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"Unable to find "	TokenNameStringLiteral	Unable to find 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
appendix	TokenNameIdentifier	 appendix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
checkResource	TokenNameIdentifier	 check Resource
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Unable to load resource "	TokenNameStringLiteral	Unable to load resource 
+	TokenNamePLUS	
resource	TokenNameIdentifier	 resource
+	TokenNamePLUS	
appendix	TokenNameIdentifier	 appendix
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
loader	TokenNameIdentifier	 loader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isTask	TokenNameIdentifier	 is Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setTaskName	TokenNameIdentifier	 set Task Name
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Search for file/directory either relative to project's * basedir or in the path given as filepath. * * <p>filepath can be a list of directory and/or file names (gen'd * via <fileset>)</p> * * <p>look for:</p><ul> * <li>full-pathname specified == path in list</li> * <li>full-pathname specified == parent dir of path in list</li> * <li>simple name specified == path in list</li> * <li>simple name specified == path in list + name</li> * <li>simple name specified == parent dir + name</li> * <li>simple name specified == parent of parent dir + name</li> * </ul> */	TokenNameCOMMENT_JAVADOC	 Search for file/directory either relative to project's basedir or in the path given as filepath. * <p>filepath can be a list of directory and/or file names (gen'd via <fileset>)</p> * <p>look for:</p><ul> <li>full-pathname specified == path in list</li> <li>full-pathname specified == parent dir of path in list</li> <li>simple name specified == path in list</li> <li>simple name specified == path in list + name</li> <li>simple name specified == parent dir + name</li> <li>simple name specified == parent of parent dir + name</li> </ul> 
private	TokenNameprivate	
boolean	TokenNameboolean	
checkFile	TokenNameIdentifier	 check File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filepath	TokenNameIdentifier	 filepath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
checkFile	TokenNameIdentifier	 check File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paths	TokenNameIdentifier	 paths
=	TokenNameEQUAL	
filepath	TokenNameIdentifier	 filepath
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
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Searching "	TokenNameStringLiteral	Searching 
+	TokenNamePLUS	
paths	TokenNameIdentifier	 paths
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
paths	TokenNameIdentifier	 paths
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ** full-pathname specified == path in list 	TokenNameCOMMENT_LINE	** full-pathname specified == path in list 
// ** simple name specified == path in list 	TokenNameCOMMENT_LINE	** simple name specified == path in list 
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
paths	TokenNameIdentifier	 paths
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Found: "	TokenNameStringLiteral	Found: 
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
isDir	TokenNameIdentifier	 is Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Found directory: "	TokenNameStringLiteral	Found directory: 
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Found file: "	TokenNameStringLiteral	Found file: 
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not the requested type 	TokenNameCOMMENT_LINE	not the requested type 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ** full-pathname specified == parent dir of path in list 	TokenNameCOMMENT_LINE	** full-pathname specified == parent dir of path in list 
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Found: "	TokenNameStringLiteral	Found: 
+	TokenNamePLUS	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
isDir	TokenNameIdentifier	 is Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Found directory: "	TokenNameStringLiteral	Found directory: 
+	TokenNamePLUS	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not the requested type 	TokenNameCOMMENT_LINE	not the requested type 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ** simple name specified == path in list + name 	TokenNameCOMMENT_LINE	** simple name specified == path in list + name 
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
checkFile	TokenNameIdentifier	 check File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
" in "	TokenNameStringLiteral	 in 
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ** simple name specified == parent dir + name 	TokenNameCOMMENT_LINE	** simple name specified == parent dir + name 
while	TokenNamewhile	
(	TokenNameLPAREN	
searchParents	TokenNameIdentifier	 search Parents
&&	TokenNameAND_AND	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
checkFile	TokenNameIdentifier	 check File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
" in "	TokenNameStringLiteral	 in 
+	TokenNamePLUS	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if a given file exists and matches the required type. */	TokenNameCOMMENT_JAVADOC	 Check if a given file exists and matches the required type. 
private	TokenNameprivate	
boolean	TokenNameboolean	
checkFile	TokenNameIdentifier	 check File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
isDir	TokenNameIdentifier	 is Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Found directory: "	TokenNameStringLiteral	Found directory: 
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Found file: "	TokenNameStringLiteral	Found file: 
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
"Found: "	TokenNameStringLiteral	Found: 
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if a given resource can be loaded. */	TokenNameCOMMENT_JAVADOC	 Check if a given resource can be loaded. 
private	TokenNameprivate	
boolean	TokenNameboolean	
checkResource	TokenNameIdentifier	 check Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
loader	TokenNameIdentifier	 loader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
cL	TokenNameIdentifier	 c L
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
if	TokenNameif	
(	TokenNameLPAREN	
cL	TokenNameIdentifier	 c L
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
cL	TokenNameIdentifier	 c L
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
.	TokenNameDOT	
getSystemResourceAsStream	TokenNameIdentifier	 get System Resource As Stream
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Check if a given class can be loaded. */	TokenNameCOMMENT_JAVADOC	 Check if a given class can be loaded. 
private	TokenNameprivate	
boolean	TokenNameboolean	
checkClass	TokenNameIdentifier	 check Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ignoreSystemclasses	TokenNameIdentifier	 ignore Systemclasses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
setParentFirst	TokenNameIdentifier	 set Parent First
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
addJavaLibraries	TokenNameIdentifier	 add Java Libraries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
loader	TokenNameIdentifier	 loader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
findClass	TokenNameIdentifier	 find Class
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// class found but restricted name; this is 	TokenNameCOMMENT_LINE	class found but restricted name; this is 
// actually the case we're looking for in JDK 1.3+, 	TokenNameCOMMENT_LINE	actually the case we're looking for in JDK 1.3+, 
// so catch the exception and return 	TokenNameCOMMENT_LINE	so catch the exception and return 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
loader	TokenNameIdentifier	 loader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
l	TokenNameIdentifier	 l
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
// Can return null to represent the bootstrap class loader. 	TokenNameCOMMENT_LINE	Can return null to represent the bootstrap class loader. 
// see API docs of Class.getClassLoader. 	TokenNameCOMMENT_LINE	see API docs of Class.getClassLoader. 
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"class ""	TokenNameStringLiteral	class "
+	TokenNamePLUS	
classname	TokenNameIdentifier	 classname
+	TokenNamePLUS	
"" was not found"	TokenNameStringLiteral	" was not found
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoClassDefFoundError	TokenNameIdentifier	 No Class Def Found Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Could not load dependent class ""	TokenNameStringLiteral	Could not load dependent class "
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"" for class ""	TokenNameStringLiteral	" for class "
+	TokenNamePLUS	
classname	TokenNameIdentifier	 classname
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * EnumeratedAttribute covering the file types to be checked for, either * file or dir. */	TokenNameCOMMENT_JAVADOC	 EnumeratedAttribute covering the file types to be checked for, either file or dir. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
FileDir	TokenNameIdentifier	 File Dir
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
VALUES	TokenNameIdentifier	 VALUES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"file"	TokenNameStringLiteral	file
,	TokenNameCOMMA	
"dir"	TokenNameStringLiteral	dir
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * @see EnumeratedAttribute#getValues */	TokenNameCOMMENT_JAVADOC	 @see EnumeratedAttribute#getValues 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
VALUES	TokenNameIdentifier	 VALUES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicate if the value specifies a directory. * * @return true if the value specifies a directory. */	TokenNameCOMMENT_JAVADOC	 Indicate if the value specifies a directory. * @return true if the value specifies a directory. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDir	TokenNameIdentifier	 is Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"dir"	TokenNameStringLiteral	dir
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicate if the value specifies a file. * * @return true if the value specifies a file. */	TokenNameCOMMENT_JAVADOC	 Indicate if the value specifies a file. * @return true if the value specifies a file. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"file"	TokenNameStringLiteral	file
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
