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
BufferedReader	TokenNameIdentifier	 Buffered Reader
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
FileReader	TokenNameIdentifier	 File Reader
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
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
ResourceCollection	TokenNameIdentifier	 Resource Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** * This is a common abstract base case for script runners. * These classes need to implement executeScript, evaluateScript * and supportsLanguage. * @since Ant 1.7.0 */	TokenNameCOMMENT_JAVADOC	 This is a common abstract base case for script runners. These classes need to implement executeScript, evaluateScript and supportsLanguage. @since Ant 1.7.0 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ScriptRunnerBase	TokenNameIdentifier	 Script Runner Base
{	TokenNameLBRACE	
/** Whether to keep the engine between calls to execute/eval */	TokenNameCOMMENT_JAVADOC	 Whether to keep the engine between calls to execute/eval 
private	TokenNameprivate	
boolean	TokenNameboolean	
keepEngine	TokenNameIdentifier	 keep Engine
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Script language */	TokenNameCOMMENT_JAVADOC	 Script language 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
language	TokenNameIdentifier	 language
;	TokenNameSEMICOLON	
/** Script content */	TokenNameCOMMENT_JAVADOC	 Script content 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
script	TokenNameIdentifier	 script
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** Project this runner is used in */	TokenNameCOMMENT_JAVADOC	 Project this runner is used in 
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/** Classloader to be used when running the script. */	TokenNameCOMMENT_JAVADOC	 Classloader to be used when running the script. 
private	TokenNameprivate	
ClassLoader	TokenNameIdentifier	 Class Loader
scriptLoader	TokenNameIdentifier	 script Loader
;	TokenNameSEMICOLON	
/** Beans to be provided to the script */	TokenNameCOMMENT_JAVADOC	 Beans to be provided to the script 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
beans	TokenNameIdentifier	 beans
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add a list of named objects to the list to be exported to the script * * @param dictionary a map of objects to be placed into the script context * indexed by String names. */	TokenNameCOMMENT_JAVADOC	 Add a list of named objects to the list to be exported to the script * @param dictionary a map of objects to be placed into the script context indexed by String names. 
public	TokenNamepublic	
void	TokenNamevoid	
addBeans	TokenNameIdentifier	 add Beans
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addBean	TokenNameIdentifier	 add Bean
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The key is in the dictionary but cannot be retrieved 	TokenNameCOMMENT_LINE	The key is in the dictionary but cannot be retrieved 
// This is usually due references that refer to tasks 	TokenNameCOMMENT_LINE	This is usually due references that refer to tasks 
// that have not been taskdefed in the current run. 	TokenNameCOMMENT_LINE	that have not been taskdefed in the current run. 
// Ignore 	TokenNameCOMMENT_LINE	Ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add a single object into the script context. * * @param key the name in the context this object is to stored under. * @param bean the object to be stored in the script context. */	TokenNameCOMMENT_JAVADOC	 Add a single object into the script context. * @param key the name in the context this object is to stored under. @param bean the object to be stored in the script context. 
public	TokenNamepublic	
void	TokenNamevoid	
addBean	TokenNameIdentifier	 add Bean
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
bean	TokenNameIdentifier	 bean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isValid	TokenNameIdentifier	 is Valid
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isJavaIdentifierStart	TokenNameIdentifier	 is Java Identifier Start
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
isValid	TokenNameIdentifier	 is Valid
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isValid	TokenNameIdentifier	 is Valid
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isJavaIdentifierPart	TokenNameIdentifier	 is Java Identifier Part
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isValid	TokenNameIdentifier	 is Valid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
beans	TokenNameIdentifier	 beans
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
bean	TokenNameIdentifier	 bean
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the beans used for the script. * @return the map of beans. */	TokenNameCOMMENT_JAVADOC	 Get the beans used for the script. @return the map of beans. 
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
getBeans	TokenNameIdentifier	 get Beans
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
beans	TokenNameIdentifier	 beans
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Do the work. * @param execName the name that will be passed to BSF for this script * execution. */	TokenNameCOMMENT_JAVADOC	 Do the work. @param execName the name that will be passed to BSF for this script execution. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
executeScript	TokenNameIdentifier	 execute Script
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
execName	TokenNameIdentifier	 exec Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Evaluate the script. * @param execName the name that will be passed to the * scripting engine for this script execution. * @return the result of evaluating the script. */	TokenNameCOMMENT_JAVADOC	 Evaluate the script. @param execName the name that will be passed to the scripting engine for this script execution. @return the result of evaluating the script. 
public	TokenNamepublic	
abstract	TokenNameabstract	
Object	TokenNameIdentifier	 Object
evaluateScript	TokenNameIdentifier	 evaluate Script
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
execName	TokenNameIdentifier	 exec Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Check if a script engine can be created for * this language. * @return true if a script engine can be created, false * otherwise. */	TokenNameCOMMENT_JAVADOC	 Check if a script engine can be created for this language. @return true if a script engine can be created, false otherwise. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
supportsLanguage	TokenNameIdentifier	 supports Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the name of the manager prefix used for this * scriptrunner. * @return the prefix string. */	TokenNameCOMMENT_JAVADOC	 Get the name of the manager prefix used for this scriptrunner. @return the prefix string. 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getManagerName	TokenNameIdentifier	 get Manager Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Defines the language (required). * @param language the scripting language name for the script. */	TokenNameCOMMENT_JAVADOC	 Defines the language (required). @param language the scripting language name for the script. 
public	TokenNamepublic	
void	TokenNamevoid	
setLanguage	TokenNameIdentifier	 set Language
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
language	TokenNameIdentifier	 language
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
language	TokenNameIdentifier	 language
=	TokenNameEQUAL	
language	TokenNameIdentifier	 language
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the script language * @return the script language */	TokenNameCOMMENT_JAVADOC	 Get the script language @return the script language 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
language	TokenNameIdentifier	 language
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the script classloader. * @param classLoader the classloader to use. */	TokenNameCOMMENT_JAVADOC	 Set the script classloader. @param classLoader the classloader to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setScriptClassLoader	TokenNameIdentifier	 set Script Class Loader
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
classLoader	TokenNameIdentifier	 class Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
scriptLoader	TokenNameIdentifier	 script Loader
=	TokenNameEQUAL	
classLoader	TokenNameIdentifier	 class Loader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the classloader used to load the script engine. * @return the classloader. */	TokenNameCOMMENT_JAVADOC	 Get the classloader used to load the script engine. @return the classloader. 
protected	TokenNameprotected	
ClassLoader	TokenNameIdentifier	 Class Loader
getScriptClassLoader	TokenNameIdentifier	 get Script Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scriptLoader	TokenNameIdentifier	 script Loader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether to keep the script engine between calls. * @param keepEngine if true, keep the engine. */	TokenNameCOMMENT_JAVADOC	 Whether to keep the script engine between calls. @param keepEngine if true, keep the engine. 
public	TokenNamepublic	
void	TokenNamevoid	
setKeepEngine	TokenNameIdentifier	 set Keep Engine
(	TokenNameLPAREN	
boolean	TokenNameboolean	
keepEngine	TokenNameIdentifier	 keep Engine
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keepEngine	TokenNameIdentifier	 keep Engine
=	TokenNameEQUAL	
keepEngine	TokenNameIdentifier	 keep Engine
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the keep engine attribute. * @return the attribute. */	TokenNameCOMMENT_JAVADOC	 Get the keep engine attribute. @return the attribute. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getKeepEngine	TokenNameIdentifier	 get Keep Engine
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keepEngine	TokenNameIdentifier	 keep Engine
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Load the script from an external file; optional. * @param file the file containing the script source. */	TokenNameCOMMENT_JAVADOC	 Load the script from an external file; optional. @param file the file containing the script source. 
public	TokenNamepublic	
void	TokenNamevoid	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"file "	TokenNameStringLiteral	file 
+	TokenNamePLUS	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
" not found."	TokenNameStringLiteral	 not found.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
readSource	TokenNameIdentifier	 read Source
(	TokenNameLPAREN	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//this can only happen if the file got deleted a short moment ago 	TokenNameCOMMENT_LINE	this can only happen if the file got deleted a short moment ago 
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"file "	TokenNameStringLiteral	file 
+	TokenNamePLUS	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
" not found."	TokenNameStringLiteral	 not found.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Read some source in from the given reader * @param reader the reader; this is closed afterwards. * @param name the name to use in error messages */	TokenNameCOMMENT_JAVADOC	 Read some source in from the given reader @param reader the reader; this is closed afterwards. @param name the name to use in error messages 
private	TokenNameprivate	
void	TokenNamevoid	
readSource	TokenNameIdentifier	 read Source
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
script	TokenNameIdentifier	 script
+=	TokenNamePLUS_EQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
safeReadFully	TokenNameIdentifier	 safe Read Fully
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Failed to read "	TokenNameStringLiteral	Failed to read 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add a resource to the source list. * @since Ant 1.7.1 * @param sourceResource the resource to load * @throws BuildException if the resource cannot be read */	TokenNameCOMMENT_JAVADOC	 Add a resource to the source list. @since Ant 1.7.1 @param sourceResource the resource to load @throws BuildException if the resource cannot be read 
public	TokenNamepublic	
void	TokenNamevoid	
loadResource	TokenNameIdentifier	 load Resource
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
sourceResource	TokenNameIdentifier	 source Resource
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
sourceResource	TokenNameIdentifier	 source Resource
.	TokenNameDOT	
toLongString	TokenNameIdentifier	 to Long String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
sourceResource	TokenNameIdentifier	 source Resource
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Failed to open "	TokenNameStringLiteral	Failed to open 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Failed to open "	TokenNameStringLiteral	Failed to open 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" -it is not readable"	TokenNameStringLiteral	 -it is not readable
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
readSource	TokenNameIdentifier	 read Source
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add all resources in a resource collection to the source list. * @since Ant 1.7.1 * @param collection the resource to load * @throws BuildException if a resource cannot be read */	TokenNameCOMMENT_JAVADOC	 Add all resources in a resource collection to the source list. @since Ant 1.7.1 @param collection the resource to load @throws BuildException if a resource cannot be read 
public	TokenNamepublic	
void	TokenNamevoid	
loadResources	TokenNameIdentifier	 load Resources
(	TokenNameLPAREN	
ResourceCollection	TokenNameIdentifier	 Resource Collection
collection	TokenNameIdentifier	 collection
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
resources	TokenNameIdentifier	 resources
=	TokenNameEQUAL	
collection	TokenNameIdentifier	 collection
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Resource	TokenNameIdentifier	 Resource
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loadResource	TokenNameIdentifier	 load Resource
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the script text. Properties in the text are not expanded! * * @param text a component of the script text to be added. */	TokenNameCOMMENT_JAVADOC	 Set the script text. Properties in the text are not expanded! * @param text a component of the script text to be added. 
public	TokenNamepublic	
void	TokenNamevoid	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
script	TokenNameIdentifier	 script
+=	TokenNamePLUS_EQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current script text content. * @return the script text. */	TokenNameCOMMENT_JAVADOC	 Get the current script text content. @return the script text. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getScript	TokenNameIdentifier	 get Script
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
script	TokenNameIdentifier	 script
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clear the current script text content. */	TokenNameCOMMENT_JAVADOC	 Clear the current script text content. 
public	TokenNamepublic	
void	TokenNamevoid	
clearScript	TokenNameIdentifier	 clear Script
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
script	TokenNameIdentifier	 script
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the project for this runner. * @param project the project. */	TokenNameCOMMENT_JAVADOC	 Set the project for this runner. @param project the project. 
public	TokenNamepublic	
void	TokenNamevoid	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the project for this runner. * @return the project. */	TokenNameCOMMENT_JAVADOC	 Get the project for this runner. @return the project. 
public	TokenNamepublic	
Project	TokenNameIdentifier	 Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Bind the runner to a project component. * Properties, targets and references are all added as beans; * project is bound to project, and self to the component. * @param component to become <code>self</code> */	TokenNameCOMMENT_JAVADOC	 Bind the runner to a project component. Properties, targets and references are all added as beans; project is bound to project, and self to the component. @param component to become <code>self</code> 
public	TokenNamepublic	
void	TokenNamevoid	
bindToComponent	TokenNameIdentifier	 bind To Component
(	TokenNameLPAREN	
ProjectComponent	TokenNameIdentifier	 Project Component
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addBeans	TokenNameIdentifier	 add Beans
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addBeans	TokenNameIdentifier	 add Beans
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getUserProperties	TokenNameIdentifier	 get User Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addBeans	TokenNameIdentifier	 add Beans
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getCopyOfTargets	TokenNameIdentifier	 get Copy Of Targets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addBeans	TokenNameIdentifier	 add Beans
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getCopyOfReferences	TokenNameIdentifier	 get Copy Of References
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addBean	TokenNameIdentifier	 add Bean
(	TokenNameLPAREN	
"project"	TokenNameStringLiteral	project
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addBean	TokenNameIdentifier	 add Bean
(	TokenNameLPAREN	
"self"	TokenNameStringLiteral	self
,	TokenNameCOMMA	
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Bind the runner to a project component. * The project and self are the only beans set. * @param component to become <code>self</code> */	TokenNameCOMMENT_JAVADOC	 Bind the runner to a project component. The project and self are the only beans set. @param component to become <code>self</code> 
public	TokenNamepublic	
void	TokenNamevoid	
bindToComponentMinimum	TokenNameIdentifier	 bind To Component Minimum
(	TokenNameLPAREN	
ProjectComponent	TokenNameIdentifier	 Project Component
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addBean	TokenNameIdentifier	 add Bean
(	TokenNameLPAREN	
"project"	TokenNameStringLiteral	project
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addBean	TokenNameIdentifier	 add Bean
(	TokenNameLPAREN	
"self"	TokenNameStringLiteral	self
,	TokenNameCOMMA	
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if the language attribute is set. * @throws BuildException if it is not. */	TokenNameCOMMENT_JAVADOC	 Check if the language attribute is set. @throws BuildException if it is not. 
protected	TokenNameprotected	
void	TokenNamevoid	
checkLanguage	TokenNameIdentifier	 check Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
language	TokenNameIdentifier	 language
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"script language must be specified"	TokenNameStringLiteral	script language must be specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Replace the current context classloader with the * script context classloader. * @return the current context classloader. */	TokenNameCOMMENT_JAVADOC	 Replace the current context classloader with the script context classloader. @return the current context classloader. 
protected	TokenNameprotected	
ClassLoader	TokenNameIdentifier	 Class Loader
replaceContextLoader	TokenNameIdentifier	 replace Context Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
origContextClassLoader	TokenNameIdentifier	 orig Context Class Loader
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getContextClassLoader	TokenNameIdentifier	 get Context Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getScriptClassLoader	TokenNameIdentifier	 get Script Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setScriptClassLoader	TokenNameIdentifier	 set Script Class Loader
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setContextClassLoader	TokenNameIdentifier	 set Context Class Loader
(	TokenNameLPAREN	
getScriptClassLoader	TokenNameIdentifier	 get Script Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
origContextClassLoader	TokenNameIdentifier	 orig Context Class Loader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Restore the context loader with the original context classloader. * * script context loader. * @param origLoader the original context classloader. */	TokenNameCOMMENT_JAVADOC	 Restore the context loader with the original context classloader. * script context loader. @param origLoader the original context classloader. 
protected	TokenNameprotected	
void	TokenNamevoid	
restoreContextLoader	TokenNameIdentifier	 restore Context Loader
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
origLoader	TokenNameIdentifier	 orig Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setContextClassLoader	TokenNameIdentifier	 set Context Class Loader
(	TokenNameLPAREN	
origLoader	TokenNameIdentifier	 orig Loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
