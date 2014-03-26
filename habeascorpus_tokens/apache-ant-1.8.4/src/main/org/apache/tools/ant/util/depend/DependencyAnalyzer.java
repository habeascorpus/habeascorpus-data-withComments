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
/** * A dependency analyzer analyzes dependencies between Java classes to * determine the minimal set of classes which are required by a set of * &quot;root&quot; classes. Different implementations of this interface can * use different strategies and libraries to determine the required set. For * example, some analyzers will use class files while others might use * source files. Analyzer specific configuration is catered for through a * generic configure method * */	TokenNameCOMMENT_JAVADOC	 A dependency analyzer analyzes dependencies between Java classes to determine the minimal set of classes which are required by a set of &quot;root&quot; classes. Different implementations of this interface can use different strategies and libraries to determine the required set. For example, some analyzers will use class files while others might use source files. Analyzer specific configuration is catered for through a generic configure method 
public	TokenNamepublic	
interface	TokenNameinterface	
DependencyAnalyzer	TokenNameIdentifier	 Dependency Analyzer
{	TokenNameLBRACE	
/** * Add a source path to the source path used by this analyzer. The * elements in the given path contain the source files for the classes * being analyzed. Not all analyzers will use this information. * * @param sourcePath The Path instance specifying the source path * elements. */	TokenNameCOMMENT_JAVADOC	 Add a source path to the source path used by this analyzer. The elements in the given path contain the source files for the classes being analyzed. Not all analyzers will use this information. * @param sourcePath The Path instance specifying the source path elements. 
void	TokenNamevoid	
addSourcePath	TokenNameIdentifier	 add Source Path
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
sourcePath	TokenNameIdentifier	 source Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add a classpath to the classpath being used by the analyzer. The * classpath contains the binary classfiles for the classes being * analyzed The elements may either be the directories or jar files.Not * all analyzers will use this information. * * @param classpath the Path instance specifying the classpath elements */	TokenNameCOMMENT_JAVADOC	 Add a classpath to the classpath being used by the analyzer. The classpath contains the binary classfiles for the classes being analyzed The elements may either be the directories or jar files.Not all analyzers will use this information. * @param classpath the Path instance specifying the classpath elements 
void	TokenNamevoid	
addClassPath	TokenNameIdentifier	 add Class Path
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add a root class. The root classes are used to drive the * determination of dependency information. The analyzer will start at * the root classes and add dependencies from there. * * @param classname the name of the class in Java dot notation. */	TokenNameCOMMENT_JAVADOC	 Add a root class. The root classes are used to drive the determination of dependency information. The analyzer will start at the root classes and add dependencies from there. * @param classname the name of the class in Java dot notation. 
void	TokenNamevoid	
addRootClass	TokenNameIdentifier	 add Root Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the list of files in the file system upon which the root classes * depend. The files will be either the classfiles or jar files upon * which the root classes depend. * * @return an enumeration of File instances. */	TokenNameCOMMENT_JAVADOC	 Get the list of files in the file system upon which the root classes depend. The files will be either the classfiles or jar files upon which the root classes depend. * @return an enumeration of File instances. 
Enumeration	TokenNameIdentifier	 Enumeration
getFileDependencies	TokenNameIdentifier	 get File Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the list of classes upon which root classes depend. This is a * list of Java classnames in dot notation. * * @return an enumeration of Strings, each being the name of a Java * class in dot notation. */	TokenNameCOMMENT_JAVADOC	 Get the list of classes upon which root classes depend. This is a list of Java classnames in dot notation. * @return an enumeration of Strings, each being the name of a Java class in dot notation. 
Enumeration	TokenNameIdentifier	 Enumeration
getClassDependencies	TokenNameIdentifier	 get Class Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Reset the dependency list. This will reset the determined * dependencies and the also list of root classes. */	TokenNameCOMMENT_JAVADOC	 Reset the dependency list. This will reset the determined dependencies and the also list of root classes. 
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Configure an aspect of the analyzer. The set of aspects that are * supported is specific to each analyzer instance. * * @param name the name of the aspect being configured * @param info the configuration information. */	TokenNameCOMMENT_JAVADOC	 Configure an aspect of the analyzer. The set of aspects that are supported is specific to each analyzer instance. * @param name the name of the aspect being configured @param info the configuration information. 
void	TokenNamevoid	
config	TokenNameIdentifier	 config
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the closure flag. If this flag is true the analyzer will traverse * all class relationships until it has collected the entire set of * direct and indirect dependencies * * @param closure true if dependencies should be traversed to determine * indirect dependencies. */	TokenNameCOMMENT_JAVADOC	 Set the closure flag. If this flag is true the analyzer will traverse all class relationships until it has collected the entire set of direct and indirect dependencies * @param closure true if dependencies should be traversed to determine indirect dependencies. 
void	TokenNamevoid	
setClosure	TokenNameIdentifier	 set Closure
(	TokenNameLPAREN	
boolean	TokenNameboolean	
closure	TokenNameIdentifier	 closure
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the file that contains the class definition * * @param classname the name of the required class * @return the file instance, zip or class, containing the * class or null if the class could not be found. * @exception IOException if the files in the classpath cannot be read. */	TokenNameCOMMENT_JAVADOC	 Get the file that contains the class definition * @param classname the name of the required class @return the file instance, zip or class, containing the class or null if the class could not be found. @exception IOException if the files in the classpath cannot be read. 
File	TokenNameIdentifier	 File
getClassContainer	TokenNameIdentifier	 get Class Container
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Get the file that contains the class source. * * @param classname the name of the required class * @return the file instance, zip or java, containing the * source or null if the source for the class could not be found. * @exception IOException if the files in the sourcepath cannot be read. */	TokenNameCOMMENT_JAVADOC	 Get the file that contains the class source. * @param classname the name of the required class @return the file instance, zip or java, containing the source or null if the source for the class could not be found. @exception IOException if the files in the sourcepath cannot be read. 
File	TokenNameIdentifier	 File
getSourceContainer	TokenNameIdentifier	 get Source Container
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
