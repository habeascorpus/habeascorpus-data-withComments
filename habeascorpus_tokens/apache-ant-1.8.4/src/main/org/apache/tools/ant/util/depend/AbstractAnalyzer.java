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
.	TokenNameDOT	
depend	TokenNameIdentifier	 depend
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipFile	TokenNameIdentifier	 Zip File
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
VectorSet	TokenNameIdentifier	 Vector Set
;	TokenNameSEMICOLON	
/** * An abstract implementation of the analyzer interface providing support * for the bulk of interface methods. * */	TokenNameCOMMENT_JAVADOC	 An abstract implementation of the analyzer interface providing support for the bulk of interface methods. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractAnalyzer	TokenNameIdentifier	 Abstract Analyzer
implements	TokenNameimplements	
DependencyAnalyzer	TokenNameIdentifier	 Dependency Analyzer
{	TokenNameLBRACE	
/** Maximum number of loops for looking for indirect dependencies. */	TokenNameCOMMENT_JAVADOC	 Maximum number of loops for looking for indirect dependencies. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_LOOPS	TokenNameIdentifier	 MAX  LOOPS
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The source path for the source files */	TokenNameCOMMENT_JAVADOC	 The source path for the source files 
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
sourcePath	TokenNameIdentifier	 source Path
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The classpath containg dirs and jars of class files */	TokenNameCOMMENT_JAVADOC	 The classpath containg dirs and jars of class files 
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
classPath	TokenNameIdentifier	 class Path
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The list of root classes */	TokenNameCOMMENT_JAVADOC	 The list of root classes 
private	TokenNameprivate	
final	TokenNamefinal	
Vector	TokenNameIdentifier	 Vector
rootClasses	TokenNameIdentifier	 root Classes
=	TokenNameEQUAL	
new	TokenNamenew	
VectorSet	TokenNameIdentifier	 Vector Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** true if dependencies have been determined */	TokenNameCOMMENT_JAVADOC	 true if dependencies have been determined 
private	TokenNameprivate	
boolean	TokenNameboolean	
determined	TokenNameIdentifier	 determined
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** the list of File objects that the root classes depend upon */	TokenNameCOMMENT_JAVADOC	 the list of File objects that the root classes depend upon 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
fileDependencies	TokenNameIdentifier	 file Dependencies
;	TokenNameSEMICOLON	
/** the list of java classes the root classes depend upon */	TokenNameCOMMENT_JAVADOC	 the list of java classes the root classes depend upon 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
classDependencies	TokenNameIdentifier	 class Dependencies
;	TokenNameSEMICOLON	
/** true if indirect dependencies should be gathered */	TokenNameCOMMENT_JAVADOC	 true if indirect dependencies should be gathered 
private	TokenNameprivate	
boolean	TokenNameboolean	
closure	TokenNameIdentifier	 closure
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** Setup the analyzer */	TokenNameCOMMENT_JAVADOC	 Setup the analyzer 
protected	TokenNameprotected	
AbstractAnalyzer	TokenNameIdentifier	 Abstract Analyzer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the closure flag. If this flag is true the analyzer will traverse * all class relationships until it has collected the entire set of * direct and indirect dependencies * * @param closure true if dependencies should be traversed to determine * indirect dependencies. */	TokenNameCOMMENT_JAVADOC	 Set the closure flag. If this flag is true the analyzer will traverse all class relationships until it has collected the entire set of direct and indirect dependencies * @param closure true if dependencies should be traversed to determine indirect dependencies. 
public	TokenNamepublic	
void	TokenNamevoid	
setClosure	TokenNameIdentifier	 set Closure
(	TokenNameLPAREN	
boolean	TokenNameboolean	
closure	TokenNameIdentifier	 closure
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
closure	TokenNameIdentifier	 closure
=	TokenNameEQUAL	
closure	TokenNameIdentifier	 closure
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the list of files in the file system upon which the root classes * depend. The files will be either the classfiles or jar files upon * which the root classes depend. * * @return an enumeration of File instances. */	TokenNameCOMMENT_JAVADOC	 Get the list of files in the file system upon which the root classes depend. The files will be either the classfiles or jar files upon which the root classes depend. * @return an enumeration of File instances. 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getFileDependencies	TokenNameIdentifier	 get File Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
supportsFileDependencies	TokenNameIdentifier	 supports File Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"File dependencies are not supported "	TokenNameStringLiteral	File dependencies are not supported 
+	TokenNamePLUS	
"by this analyzer"	TokenNameStringLiteral	by this analyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
determined	TokenNameIdentifier	 determined
)	TokenNameRPAREN	
{	TokenNameLBRACE	
determineDependencies	TokenNameIdentifier	 determine Dependencies
(	TokenNameLPAREN	
fileDependencies	TokenNameIdentifier	 file Dependencies
,	TokenNameCOMMA	
classDependencies	TokenNameIdentifier	 class Dependencies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fileDependencies	TokenNameIdentifier	 file Dependencies
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the list of classes upon which root classes depend. This is a * list of Java classnames in dot notation. * * @return an enumeration of Strings, each being the name of a Java * class in dot notation. */	TokenNameCOMMENT_JAVADOC	 Get the list of classes upon which root classes depend. This is a list of Java classnames in dot notation. * @return an enumeration of Strings, each being the name of a Java class in dot notation. 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getClassDependencies	TokenNameIdentifier	 get Class Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
determined	TokenNameIdentifier	 determined
)	TokenNameRPAREN	
{	TokenNameLBRACE	
determineDependencies	TokenNameIdentifier	 determine Dependencies
(	TokenNameLPAREN	
fileDependencies	TokenNameIdentifier	 file Dependencies
,	TokenNameCOMMA	
classDependencies	TokenNameIdentifier	 class Dependencies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
classDependencies	TokenNameIdentifier	 class Dependencies
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the file that contains the class definition * * @param classname the name of the required class * @return the file instance, zip or class, containing the * class or null if the class could not be found. * @exception IOException if the files in the classpath cannot be read. */	TokenNameCOMMENT_JAVADOC	 Get the file that contains the class definition * @param classname the name of the required class @return the file instance, zip or class, containing the class or null if the class could not be found. @exception IOException if the files in the classpath cannot be read. 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getClassContainer	TokenNameIdentifier	 get Class Container
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
classLocation	TokenNameIdentifier	 class Location
=	TokenNameEQUAL	
classname	TokenNameIdentifier	 classname
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
;	TokenNameSEMICOLON	
// we look through the classpath elements. If the element is a dir 	TokenNameCOMMENT_LINE	we look through the classpath elements. If the element is a dir 
// we look for the file. IF it is a zip, we look for the zip entry 	TokenNameCOMMENT_LINE	we look for the file. IF it is a zip, we look for the zip entry 
return	TokenNamereturn	
getResourceContainer	TokenNameIdentifier	 get Resource Container
(	TokenNameLPAREN	
classLocation	TokenNameIdentifier	 class Location
,	TokenNameCOMMA	
classPath	TokenNameIdentifier	 class Path
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the file that contains the class source. * * @param classname the name of the required class * @return the file instance, zip or java, containing the * source or null if the source for the class could not be found. * @exception IOException if the files in the sourcepath cannot be read. */	TokenNameCOMMENT_JAVADOC	 Get the file that contains the class source. * @param classname the name of the required class @return the file instance, zip or java, containing the source or null if the source for the class could not be found. @exception IOException if the files in the sourcepath cannot be read. 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getSourceContainer	TokenNameIdentifier	 get Source Container
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
sourceLocation	TokenNameIdentifier	 source Location
=	TokenNameEQUAL	
classname	TokenNameIdentifier	 classname
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".java"	TokenNameStringLiteral	.java
;	TokenNameSEMICOLON	
// we look through the source path elements. If the element is a dir 	TokenNameCOMMENT_LINE	we look through the source path elements. If the element is a dir 
// we look for the file. If it is a zip, we look for the zip entry. 	TokenNameCOMMENT_LINE	we look for the file. If it is a zip, we look for the zip entry. 
// This isn't normal for source paths but we get it for free 	TokenNameCOMMENT_LINE	This isn't normal for source paths but we get it for free 
return	TokenNamereturn	
getResourceContainer	TokenNameIdentifier	 get Resource Container
(	TokenNameLPAREN	
sourceLocation	TokenNameIdentifier	 source Location
,	TokenNameCOMMA	
sourcePath	TokenNameIdentifier	 source Path
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a source path to the source path used by this analyzer. The * elements in the given path contain the source files for the classes * being analyzed. Not all analyzers will use this information. * * @param sourcePath The Path instance specifying the source path * elements. */	TokenNameCOMMENT_JAVADOC	 Add a source path to the source path used by this analyzer. The elements in the given path contain the source files for the classes being analyzed. Not all analyzers will use this information. * @param sourcePath The Path instance specifying the source path elements. 
public	TokenNamepublic	
void	TokenNamevoid	
addSourcePath	TokenNameIdentifier	 add Source Path
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
sourcePath	TokenNameIdentifier	 source Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sourcePath	TokenNameIdentifier	 source Path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sourcePath	TokenNameIdentifier	 source Path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sourcePath	TokenNameIdentifier	 source Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sourcePath	TokenNameIdentifier	 source Path
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
sourcePath	TokenNameIdentifier	 source Path
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a classpath to the classpath being used by the analyzer. The * classpath contains the binary classfiles for the classes being * analyzed The elements may either be the directories or jar files.Not * all analyzers will use this information. * * @param classPath the Path instance specifying the classpath elements */	TokenNameCOMMENT_JAVADOC	 Add a classpath to the classpath being used by the analyzer. The classpath contains the binary classfiles for the classes being analyzed The elements may either be the directories or jar files.Not all analyzers will use this information. * @param classPath the Path instance specifying the classpath elements 
public	TokenNamepublic	
void	TokenNamevoid	
addClassPath	TokenNameIdentifier	 add Class Path
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
classPath	TokenNameIdentifier	 class Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classPath	TokenNameIdentifier	 class Path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classPath	TokenNameIdentifier	 class Path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
classPath	TokenNameIdentifier	 class Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
classPath	TokenNameIdentifier	 class Path
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
classPath	TokenNameIdentifier	 class Path
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a root class. The root classes are used to drive the * determination of dependency information. The analyzer will start at * the root classes and add dependencies from there. * * @param className the name of the class in Java dot notation. */	TokenNameCOMMENT_JAVADOC	 Add a root class. The root classes are used to drive the determination of dependency information. The analyzer will start at the root classes and add dependencies from there. * @param className the name of the class in Java dot notation. 
public	TokenNamepublic	
void	TokenNamevoid	
addRootClass	TokenNameIdentifier	 add Root Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
rootClasses	TokenNameIdentifier	 root Classes
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rootClasses	TokenNameIdentifier	 root Classes
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Configure an aspect of the analyzer. The set of aspects that are * supported is specific to each analyzer instance. * * @param name the name of the aspect being configured * @param info the configuration info. */	TokenNameCOMMENT_JAVADOC	 Configure an aspect of the analyzer. The set of aspects that are supported is specific to each analyzer instance. * @param name the name of the aspect being configured @param info the configuration info. 
public	TokenNamepublic	
void	TokenNamevoid	
config	TokenNameIdentifier	 config
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// do nothing by default 	TokenNameCOMMENT_LINE	do nothing by default 
}	TokenNameRBRACE	
/** * Reset the dependency list. This will reset the determined * dependencies and the also list of root classes. */	TokenNameCOMMENT_JAVADOC	 Reset the dependency list. This will reset the determined dependencies and the also list of root classes. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rootClasses	TokenNameIdentifier	 root Classes
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
determined	TokenNameIdentifier	 determined
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
fileDependencies	TokenNameIdentifier	 file Dependencies
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classDependencies	TokenNameIdentifier	 class Dependencies
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an enumeration of the root classes * * @return an enumeration of Strings, each of which is a class name * for a root class. */	TokenNameCOMMENT_JAVADOC	 Get an enumeration of the root classes * @return an enumeration of Strings, each of which is a class name for a root class. 
protected	TokenNameprotected	
Enumeration	TokenNameIdentifier	 Enumeration
getRootClasses	TokenNameIdentifier	 get Root Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rootClasses	TokenNameIdentifier	 root Classes
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicate if the analyzer is required to follow * indirect class relationships. * * @return true if indirect relationships should be followed. */	TokenNameCOMMENT_JAVADOC	 Indicate if the analyzer is required to follow indirect class relationships. * @return true if indirect relationships should be followed. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isClosureRequired	TokenNameIdentifier	 is Closure Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
closure	TokenNameIdentifier	 closure
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine the dependencies of the current set of root classes * * @param files a vector into which Files upon which the root classes * depend should be placed. * @param classes a vector of Strings into which the names of classes * upon which the root classes depend should be placed. */	TokenNameCOMMENT_JAVADOC	 Determine the dependencies of the current set of root classes * @param files a vector into which Files upon which the root classes depend should be placed. @param classes a vector of Strings into which the names of classes upon which the root classes depend should be placed. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
determineDependencies	TokenNameIdentifier	 determine Dependencies
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
files	TokenNameIdentifier	 files
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
classes	TokenNameIdentifier	 classes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Indicate if the particular subclass supports file dependency * information. * * @return true if file dependencies are supported. */	TokenNameCOMMENT_JAVADOC	 Indicate if the particular subclass supports file dependency information. * @return true if file dependencies are supported. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
supportsFileDependencies	TokenNameIdentifier	 supports File Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the file that contains the resource * * @param resourceLocation the name of the required resource. * @param paths the paths which will be searched for the resource. * @return the file instance, zip or class, containing the * class or null if the class could not be found. * @exception IOException if the files in the given paths cannot be read. */	TokenNameCOMMENT_JAVADOC	 Get the file that contains the resource * @param resourceLocation the name of the required resource. @param paths the paths which will be searched for the resource. @return the file instance, zip or class, containing the class or null if the class could not be found. @exception IOException if the files in the given paths cannot be read. 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
getResourceContainer	TokenNameIdentifier	 get Resource Container
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resourceLocation	TokenNameIdentifier	 resource Location
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
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
File	TokenNameIdentifier	 File
element	TokenNameIdentifier	 element
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
resourceLocation	TokenNameIdentifier	 resource Location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resource	TokenNameIdentifier	 resource
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// must be a zip of some sort 	TokenNameCOMMENT_LINE	must be a zip of some sort 
ZipFile	TokenNameIdentifier	 Zip File
zipFile	TokenNameIdentifier	 zip File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
zipFile	TokenNameIdentifier	 zip File
=	TokenNameEQUAL	
new	TokenNamenew	
ZipFile	TokenNameIdentifier	 Zip File
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
zipFile	TokenNameIdentifier	 zip File
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
resourceLocation	TokenNameIdentifier	 resource Location
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
zipFile	TokenNameIdentifier	 zip File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zipFile	TokenNameIdentifier	 zip File
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
