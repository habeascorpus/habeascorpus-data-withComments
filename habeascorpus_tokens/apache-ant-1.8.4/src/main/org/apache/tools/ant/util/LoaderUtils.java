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
launch	TokenNameIdentifier	 launch
.	TokenNameDOT	
Locator	TokenNameIdentifier	 Locator
;	TokenNameSEMICOLON	
// CheckStyle:HideUtilityClassConstructorCheck OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:HideUtilityClassConstructorCheck OFF - bc 
/** * ClassLoader utility methods * */	TokenNameCOMMENT_JAVADOC	 ClassLoader utility methods 
public	TokenNamepublic	
class	TokenNameclass	
LoaderUtils	TokenNameIdentifier	 Loader Utils
{	TokenNameLBRACE	
/** Utilities used for file operations */	TokenNameCOMMENT_JAVADOC	 Utilities used for file operations 
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
/** * Set the context classloader * * @param loader the ClassLoader to be used as the context class loader * on the current thread. */	TokenNameCOMMENT_JAVADOC	 Set the context classloader * @param loader the ClassLoader to be used as the context class loader on the current thread. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setContextClassLoader	TokenNameIdentifier	 set Context Class Loader
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
currentThread	TokenNameIdentifier	 current Thread
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentThread	TokenNameIdentifier	 current Thread
.	TokenNameDOT	
setContextClassLoader	TokenNameIdentifier	 set Context Class Loader
(	TokenNameLPAREN	
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * JDK1.1 compatible access to set the context class loader. * * @return the ClassLoader instance being used as the context * classloader on the current thread. Returns null on JDK 1.1 */	TokenNameCOMMENT_JAVADOC	 JDK1.1 compatible access to set the context class loader. * @return the ClassLoader instance being used as the context classloader on the current thread. Returns null on JDK 1.1 
public	TokenNamepublic	
static	TokenNamestatic	
ClassLoader	TokenNameIdentifier	 Class Loader
getContextClassLoader	TokenNameIdentifier	 get Context Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
currentThread	TokenNameIdentifier	 current Thread
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
currentThread	TokenNameIdentifier	 current Thread
.	TokenNameDOT	
getContextClassLoader	TokenNameIdentifier	 get Context Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicates if the context class loader methods are available * * @return true if the get and set methods dealing with the context * classloader are available. */	TokenNameCOMMENT_JAVADOC	 Indicates if the context class loader methods are available * @return true if the get and set methods dealing with the context classloader are available. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isContextLoaderAvailable	TokenNameIdentifier	 is Context Loader Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Normalize a source location * * @param source the source location to be normalized. * * @return the normalized source location. */	TokenNameCOMMENT_JAVADOC	 Normalize a source location * @param source the source location to be normalized. * @return the normalized source location. 
private	TokenNameprivate	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
normalizeSource	TokenNameIdentifier	 normalize Source
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// relative path 	TokenNameCOMMENT_LINE	relative path 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find the directory or jar file the class has been loaded from. * * @param c the class whose location is required. * @return the file or jar with the class or null if we cannot * determine the location. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Find the directory or jar file the class has been loaded from. * @param c the class whose location is required. @return the file or jar with the class or null if we cannot determine the location. * @since Ant 1.6 
public	TokenNamepublic	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
getClassSource	TokenNameIdentifier	 get Class Source
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
normalizeSource	TokenNameIdentifier	 normalize Source
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
getClassSource	TokenNameIdentifier	 get Class Source
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find the directory or a give resource has been loaded from. * * @param c the classloader to be consulted for the source * @param resource the resource whose location is required. * * @return the file with the resource source or null if * we cannot determine the location. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Find the directory or a give resource has been loaded from. * @param c the classloader to be consulted for the source @param resource the resource whose location is required. * @return the file with the resource source or null if we cannot determine the location. * @since Ant 1.6 
public	TokenNamepublic	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
getResourceSource	TokenNameIdentifier	 get Resource Source
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
LoaderUtils	TokenNameIdentifier	 Loader Utils
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
normalizeSource	TokenNameIdentifier	 normalize Source
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
getResourceSource	TokenNameIdentifier	 get Resource Source
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the resource name of a class name. * @param className the name of the class to convert. * @return the corresponding resource name. * @since Ant 1.7.0. */	TokenNameCOMMENT_JAVADOC	 Return the resource name of a class name. @param className the name of the class to convert. @return the corresponding resource name. @since Ant 1.7.0. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
classNameToResource	TokenNameIdentifier	 class Name To Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
className	TokenNameIdentifier	 class Name
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
}	TokenNameRBRACE	
/** * Check if a classloader has a classname resource. * @param loader the classloader to look it. * @param className the name of the class to look for. * @return true if the classexists, false otherwise * @since Ant 1.7.0. */	TokenNameCOMMENT_JAVADOC	 Check if a classloader has a classname resource. @param loader the classloader to look it. @param className the name of the class to look for. @return true if the classexists, false otherwise @since Ant 1.7.0. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
classExists	TokenNameIdentifier	 class Exists
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
loader	TokenNameIdentifier	 loader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
classNameToResource	TokenNameIdentifier	 class Name To Resource
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
