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
BufferedReader	TokenNameIdentifier	 Buffered Reader
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
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Constructor	TokenNameIdentifier	 Constructor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
ProjectHelper2	TokenNameIdentifier	 Project Helper2
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LoaderUtils	TokenNameIdentifier	 Loader Utils
;	TokenNameSEMICOLON	
/** * Repository of {@link ProjectHelper} found in the classpath or via * some System properties. * * <p>See the ProjectHelper documentation in the manual.</p> * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Repository of {@link ProjectHelper} found in the classpath or via some System properties. * <p>See the ProjectHelper documentation in the manual.</p> * @since Ant 1.8.0 
public	TokenNamepublic	
class	TokenNameclass	
ProjectHelperRepository	TokenNameIdentifier	 Project Helper Repository
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEBUG_PROJECT_HELPER_REPOSITORY	TokenNameIdentifier	 DEBUG  PROJECT  HELPER  REPOSITORY
=	TokenNameEQUAL	
"ant.project-helper-repo.debug"	TokenNameStringLiteral	ant.project-helper-repo.debug
;	TokenNameSEMICOLON	
// The message log level is not accessible here because everything 	TokenNameCOMMENT_LINE	The message log level is not accessible here because everything 
// is instanciated statically 	TokenNameCOMMENT_LINE	is instanciated statically 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
"true"	TokenNameStringLiteral	true
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
DEBUG_PROJECT_HELPER_REPOSITORY	TokenNameIdentifier	 DEBUG  PROJECT  HELPER  REPOSITORY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
ProjectHelperRepository	TokenNameIdentifier	 Project Helper Repository
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
ProjectHelperRepository	TokenNameIdentifier	 Project Helper Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
/* <Constructor> */	TokenNameCOMMENT_BLOCK	 <Constructor> 
helpers	TokenNameIdentifier	 helpers
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NO_CLASS	TokenNameIdentifier	 NO  CLASS
=	TokenNameEQUAL	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NO_OBJECT	TokenNameIdentifier	 NO  OBJECT
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Constructor	TokenNameIdentifier	 Constructor
PROJECTHELPER2_CONSTRUCTOR	TokenNameIdentifier	 PROJECTHELPE R2  CONSTRUCTOR
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
PROJECTHELPER2_CONSTRUCTOR	TokenNameIdentifier	 PROJECTHELPE R2  CONSTRUCTOR
=	TokenNameEQUAL	
ProjectHelper2	TokenNameIdentifier	 Project Helper2
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
NO_CLASS	TokenNameIdentifier	 NO  CLASS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ProjectHelper2 must be available 	TokenNameCOMMENT_LINE	ProjectHelper2 must be available 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ProjectHelperRepository	TokenNameIdentifier	 Project Helper Repository
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ProjectHelperRepository	TokenNameIdentifier	 Project Helper Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collectProjectHelpers	TokenNameIdentifier	 collect Project Helpers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
collectProjectHelpers	TokenNameIdentifier	 collect Project Helpers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First, try the system property 	TokenNameCOMMENT_LINE	First, try the system property 
Constructor	TokenNameIdentifier	 Constructor
projectHelper	TokenNameIdentifier	 project Helper
=	TokenNameEQUAL	
getProjectHelperBySystemProperty	TokenNameIdentifier	 get Project Helper By System Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerProjectHelper	TokenNameIdentifier	 register Project Helper
(	TokenNameLPAREN	
projectHelper	TokenNameIdentifier	 project Helper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// A JDK1.3 'service' ( like in JAXP ). That will plug a helper 	TokenNameCOMMENT_LINE	A JDK1.3 'service' ( like in JAXP ). That will plug a helper 
// automatically if in CLASSPATH, with the right META-INF/services. 	TokenNameCOMMENT_LINE	automatically if in CLASSPATH, with the right META-INF/services. 
try	TokenNametry	
{	TokenNameLBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
classLoader	TokenNameIdentifier	 class Loader
=	TokenNameEQUAL	
LoaderUtils	TokenNameIdentifier	 Loader Utils
.	TokenNameDOT	
getContextClassLoader	TokenNameIdentifier	 get Context Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
classLoader	TokenNameIdentifier	 class Loader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
resources	TokenNameIdentifier	 resources
=	TokenNameEQUAL	
classLoader	TokenNameIdentifier	 class Loader
.	TokenNameDOT	
getResources	TokenNameIdentifier	 get Resources
(	TokenNameLPAREN	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
SERVICE_ID	TokenNameIdentifier	 SERVICE  ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
)	TokenNameRPAREN	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
projectHelper	TokenNameIdentifier	 project Helper
=	TokenNameEQUAL	
getProjectHelperByService	TokenNameIdentifier	 get Project Helper By Service
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerProjectHelper	TokenNameIdentifier	 register Project Helper
(	TokenNameLPAREN	
projectHelper	TokenNameIdentifier	 project Helper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
InputStream	TokenNameIdentifier	 Input Stream
systemResource	TokenNameIdentifier	 system Resource
=	TokenNameEQUAL	
ClassLoader	TokenNameIdentifier	 Class Loader
.	TokenNameDOT	
getSystemResourceAsStream	TokenNameIdentifier	 get System Resource As Stream
(	TokenNameLPAREN	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
SERVICE_ID	TokenNameIdentifier	 SERVICE  ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
systemResource	TokenNameIdentifier	 system Resource
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
projectHelper	TokenNameIdentifier	 project Helper
=	TokenNameEQUAL	
getProjectHelperByService	TokenNameIdentifier	 get Project Helper By Service
(	TokenNameLPAREN	
systemResource	TokenNameIdentifier	 system Resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerProjectHelper	TokenNameIdentifier	 register Project Helper
(	TokenNameLPAREN	
projectHelper	TokenNameIdentifier	 project Helper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Unable to load ProjectHelper from service "	TokenNameStringLiteral	Unable to load ProjectHelper from service 
+	TokenNamePLUS	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
SERVICE_ID	TokenNameIdentifier	 SERVICE  ID
+	TokenNamePLUS	
" ("	TokenNameStringLiteral	 (
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Register the specified project helper into the repository. * <p> * The helper will be added after all the already registered helpers, but * before the default one (ProjectHelper2) * * @param helperClassName * the fully qualified name of the helper * @throws BuildException * if the class cannot be loaded or if there is no constructor * with no argument * @since Ant 1.8.2 */	TokenNameCOMMENT_JAVADOC	 Register the specified project helper into the repository. <p> The helper will be added after all the already registered helpers, but before the default one (ProjectHelper2) * @param helperClassName the fully qualified name of the helper @throws BuildException if the class cannot be loaded or if there is no constructor with no argument @since Ant 1.8.2 
public	TokenNamepublic	
void	TokenNamevoid	
registerProjectHelper	TokenNameIdentifier	 register Project Helper
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
helperClassName	TokenNameIdentifier	 helper Class Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
registerProjectHelper	TokenNameIdentifier	 register Project Helper
(	TokenNameLPAREN	
getHelperConstructor	TokenNameIdentifier	 get Helper Constructor
(	TokenNameLPAREN	
helperClassName	TokenNameIdentifier	 helper Class Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Register the specified project helper into the repository. * <p> * The helper will be added after all the already registered helpers, but * before the default one (ProjectHelper2) * * @param helperClass * the class of the helper * @throws BuildException * if there is no constructor with no argument * @since Ant 1.8.2 */	TokenNameCOMMENT_JAVADOC	 Register the specified project helper into the repository. <p> The helper will be added after all the already registered helpers, but before the default one (ProjectHelper2) * @param helperClass the class of the helper @throws BuildException if there is no constructor with no argument @since Ant 1.8.2 
public	TokenNamepublic	
void	TokenNamevoid	
registerProjectHelper	TokenNameIdentifier	 register Project Helper
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
helperClass	TokenNameIdentifier	 helper Class
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
registerProjectHelper	TokenNameIdentifier	 register Project Helper
(	TokenNameLPAREN	
helperClass	TokenNameIdentifier	 helper Class
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
NO_CLASS	TokenNameIdentifier	 NO  CLASS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Couldn't find no-arg constructor in "	TokenNameStringLiteral	Couldn't find no-arg constructor in 
+	TokenNamePLUS	
helperClass	TokenNameIdentifier	 helper Class
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
registerProjectHelper	TokenNameIdentifier	 register Project Helper
(	TokenNameLPAREN	
Constructor	TokenNameIdentifier	 Constructor
helperConstructor	TokenNameIdentifier	 helper Constructor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
helperConstructor	TokenNameIdentifier	 helper Constructor
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"ProjectHelper "	TokenNameStringLiteral	ProjectHelper 
+	TokenNamePLUS	
helperConstructor	TokenNameIdentifier	 helper Constructor
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" registered."	TokenNameStringLiteral	 registered.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
helperConstructor	TokenNameIdentifier	 helper Constructor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Constructor	TokenNameIdentifier	 Constructor
getProjectHelperBySystemProperty	TokenNameIdentifier	 get Project Helper By System Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
helperClass	TokenNameIdentifier	 helper Class
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
HELPER_PROPERTY	TokenNameIdentifier	 HELPER  PROPERTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
helperClass	TokenNameIdentifier	 helper Class
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getHelperConstructor	TokenNameIdentifier	 get Helper Constructor
(	TokenNameLPAREN	
helperClass	TokenNameIdentifier	 helper Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Unable to load ProjectHelper class ""	TokenNameStringLiteral	Unable to load ProjectHelper class "
+	TokenNamePLUS	
helperClass	TokenNameIdentifier	 helper Class
+	TokenNamePLUS	
" specified in system property "	TokenNameStringLiteral	 specified in system property 
+	TokenNamePLUS	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
HELPER_PROPERTY	TokenNameIdentifier	 HELPER  PROPERTY
+	TokenNamePLUS	
" ("	TokenNameStringLiteral	 (
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Constructor	TokenNameIdentifier	 Constructor
getProjectHelperByService	TokenNameIdentifier	 get Project Helper By Service
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// This code is needed by EBCDIC and other strange systems. 	TokenNameCOMMENT_LINE	This code is needed by EBCDIC and other strange systems. 
// It's a fix for bugs reported in xerces 	TokenNameCOMMENT_LINE	It's a fix for bugs reported in xerces 
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
isr	TokenNameIdentifier	 isr
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
isr	TokenNameIdentifier	 isr
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isr	TokenNameIdentifier	 isr
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
rd	TokenNameIdentifier	 rd
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
isr	TokenNameIdentifier	 isr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
helperClassName	TokenNameIdentifier	 helper Class Name
=	TokenNameEQUAL	
rd	TokenNameIdentifier	 rd
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rd	TokenNameIdentifier	 rd
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
helperClassName	TokenNameIdentifier	 helper Class Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
helperClassName	TokenNameIdentifier	 helper Class Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getHelperConstructor	TokenNameIdentifier	 get Helper Constructor
(	TokenNameLPAREN	
helperClassName	TokenNameIdentifier	 helper Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Unable to load ProjectHelper from service "	TokenNameStringLiteral	Unable to load ProjectHelper from service 
+	TokenNamePLUS	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
SERVICE_ID	TokenNameIdentifier	 SERVICE  ID
+	TokenNamePLUS	
" ("	TokenNameStringLiteral	 (
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the constructor with not argument of an helper from its class name. * It'll first try the thread class loader, then Class.forName() will load * from the same loader that loaded this class. * * @param helperClass * The name of the class to create an instance of. Must not be * <code>null</code>. * * @return the constructor of the specified class. * * @exception BuildException * if the class cannot be found or if a constructor with no * argument cannot be found. */	TokenNameCOMMENT_JAVADOC	 Get the constructor with not argument of an helper from its class name. It'll first try the thread class loader, then Class.forName() will load from the same loader that loaded this class. * @param helperClass The name of the class to create an instance of. Must not be <code>null</code>. * @return the constructor of the specified class. * @exception BuildException if the class cannot be found or if a constructor with no argument cannot be found. 
private	TokenNameprivate	
Constructor	TokenNameIdentifier	 Constructor
getHelperConstructor	TokenNameIdentifier	 get Helper Constructor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
helperClass	TokenNameIdentifier	 helper Class
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
classLoader	TokenNameIdentifier	 class Loader
=	TokenNameEQUAL	
LoaderUtils	TokenNameIdentifier	 Loader Utils
.	TokenNameDOT	
getContextClassLoader	TokenNameIdentifier	 get Context Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
classLoader	TokenNameIdentifier	 class Loader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
classLoader	TokenNameIdentifier	 class Loader
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
helperClass	TokenNameIdentifier	 helper Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// try next method 	TokenNameCOMMENT_LINE	try next method 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
helperClass	TokenNameIdentifier	 helper Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
NO_CLASS	TokenNameIdentifier	 NO  CLASS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the helper that will be able to parse the specified build file. The helper * will be chosen among the ones found in the classpath * * @return the first ProjectHelper that fit the requirement (never <code>null</code>). */	TokenNameCOMMENT_JAVADOC	 Get the helper that will be able to parse the specified build file. The helper will be chosen among the ones found in the classpath * @return the first ProjectHelper that fit the requirement (never <code>null</code>). 
public	TokenNamepublic	
ProjectHelper	TokenNameIdentifier	 Project Helper
getProjectHelperForBuildFile	TokenNameIdentifier	 get Project Helper For Build File
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
buildFile	TokenNameIdentifier	 build File
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
getHelpers	TokenNameIdentifier	 get Helpers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ProjectHelper	TokenNameIdentifier	 Project Helper
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ProjectHelper	TokenNameIdentifier	 Project Helper
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
canParseBuildFile	TokenNameIdentifier	 can Parse Build File
(	TokenNameLPAREN	
buildFile	TokenNameIdentifier	 build File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"ProjectHelper "	TokenNameStringLiteral	ProjectHelper 
+	TokenNamePLUS	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" selected for the build file "	TokenNameStringLiteral	 selected for the build file 
+	TokenNamePLUS	
buildFile	TokenNameIdentifier	 build File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
helper	TokenNameIdentifier	 helper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"BUG: at least the ProjectHelper2 should "	TokenNameStringLiteral	BUG: at least the ProjectHelper2 should 
+	TokenNamePLUS	
"have supported the file "	TokenNameStringLiteral	have supported the file 
+	TokenNamePLUS	
buildFile	TokenNameIdentifier	 build File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the helper that will be able to parse the specified antlib. The helper * will be chosen among the ones found in the classpath * * @return the first ProjectHelper that fit the requirement (never <code>null</code>). */	TokenNameCOMMENT_JAVADOC	 Get the helper that will be able to parse the specified antlib. The helper will be chosen among the ones found in the classpath * @return the first ProjectHelper that fit the requirement (never <code>null</code>). 
public	TokenNamepublic	
ProjectHelper	TokenNameIdentifier	 Project Helper
getProjectHelperForAntlib	TokenNameIdentifier	 get Project Helper For Antlib
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
antlib	TokenNameIdentifier	 antlib
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
getHelpers	TokenNameIdentifier	 get Helpers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ProjectHelper	TokenNameIdentifier	 Project Helper
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ProjectHelper	TokenNameIdentifier	 Project Helper
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
canParseAntlibDescriptor	TokenNameIdentifier	 can Parse Antlib Descriptor
(	TokenNameLPAREN	
antlib	TokenNameIdentifier	 antlib
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"ProjectHelper "	TokenNameStringLiteral	ProjectHelper 
+	TokenNamePLUS	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" selected for the antlib "	TokenNameStringLiteral	 selected for the antlib 
+	TokenNamePLUS	
antlib	TokenNameIdentifier	 antlib
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
helper	TokenNameIdentifier	 helper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"BUG: at least the ProjectHelper2 should "	TokenNameStringLiteral	BUG: at least the ProjectHelper2 should 
+	TokenNamePLUS	
"have supported the file "	TokenNameStringLiteral	have supported the file 
+	TokenNamePLUS	
antlib	TokenNameIdentifier	 antlib
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an iterator on the list of project helpers configured. The iterator * will always return at least one element as there will always be the * default project helper configured. * * @return an iterator of {@link ProjectHelper} */	TokenNameCOMMENT_JAVADOC	 Get an iterator on the list of project helpers configured. The iterator will always return at least one element as there will always be the default project helper configured. * @return an iterator of {@link ProjectHelper} 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
getHelpers	TokenNameIdentifier	 get Helpers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ConstructingIterator	TokenNameIdentifier	 Constructing Iterator
(	TokenNameLPAREN	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ConstructingIterator	TokenNameIdentifier	 Constructing Iterator
implements	TokenNameimplements	
Iterator	TokenNameIdentifier	 Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
nested	TokenNameIdentifier	 nested
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
empty	TokenNameIdentifier	 empty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
ConstructingIterator	TokenNameIdentifier	 Constructing Iterator
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
nested	TokenNameIdentifier	 nested
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
nested	TokenNameIdentifier	 nested
=	TokenNameEQUAL	
nested	TokenNameIdentifier	 nested
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nested	TokenNameIdentifier	 nested
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
empty	TokenNameIdentifier	 empty
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Constructor	TokenNameIdentifier	 Constructor
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nested	TokenNameIdentifier	 nested
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Constructor	TokenNameIdentifier	 Constructor
)	TokenNameRPAREN	
nested	TokenNameIdentifier	 nested
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// last but not least, ant default project helper 	TokenNameCOMMENT_LINE	last but not least, ant default project helper 
empty	TokenNameIdentifier	 empty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
PROJECTHELPER2_CONSTRUCTOR	TokenNameIdentifier	 PROJECTHELPE R2  CONSTRUCTOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
NO_OBJECT	TokenNameIdentifier	 NO  OBJECT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Failed to invoke no-arg constructor"	TokenNameStringLiteral	Failed to invoke no-arg constructor
+	TokenNamePLUS	
" on "	TokenNameStringLiteral	 on 
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"remove is not supported"	TokenNameStringLiteral	remove is not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
