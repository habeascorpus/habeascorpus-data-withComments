/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggerRepository	TokenNameIdentifier	 Logger Repository
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggerFactory	TokenNameIdentifier	 Logger Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
RepositorySelector	TokenNameIdentifier	 Repository Selector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
DefaultRepositorySelector	TokenNameIdentifier	 Default Repository Selector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
RootLogger	TokenNameIdentifier	 Root Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
NOPLoggerRepository	TokenNameIdentifier	 NOP Logger Repository
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
Loader	TokenNameIdentifier	 Loader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
OptionConverter	TokenNameIdentifier	 Option Converter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LogLog	TokenNameIdentifier	 Log Log
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringWriter	TokenNameIdentifier	 String Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
/** * Use the <code>LogManager</code> class to retreive {@link Logger} * instances or to operate on the current {@link * LoggerRepository}. When the <code>LogManager</code> class is loaded * into memory the default initalzation procedure is inititated. The * default intialization procedure</a> is described in the <a * href="../../../../manual.html#defaultInit">short log4j manual</a>. * * @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 Use the <code>LogManager</code> class to retreive {@link Logger} instances or to operate on the current {@link LoggerRepository}. When the <code>LogManager</code> class is loaded into memory the default initalzation procedure is inititated. The default intialization procedure</a> is described in the <a href="../../../../manual.html#defaultInit">short log4j manual</a>. * @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
LogManager	TokenNameIdentifier	 Log Manager
{	TokenNameLBRACE	
/** * @deprecated This variable is for internal use only. It will * become package protected in future versions. * */	TokenNameCOMMENT_JAVADOC	 @deprecated This variable is for internal use only. It will become package protected in future versions. 
static	TokenNamestatic	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_CONFIGURATION_FILE	TokenNameIdentifier	 DEFAULT  CONFIGURATION  FILE
=	TokenNameEQUAL	
"log4j.properties"	TokenNameStringLiteral	log4j.properties
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_XML_CONFIGURATION_FILE	TokenNameIdentifier	 DEFAULT  XML  CONFIGURATION  FILE
=	TokenNameEQUAL	
"log4j.xml"	TokenNameStringLiteral	log4j.xml
;	TokenNameSEMICOLON	
/** * @deprecated This variable is for internal use only. It will * become private in future versions. * */	TokenNameCOMMENT_JAVADOC	 @deprecated This variable is for internal use only. It will become private in future versions. 
static	TokenNamestatic	
final	TokenNamefinal	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
DEFAULT_CONFIGURATION_KEY	TokenNameIdentifier	 DEFAULT  CONFIGURATION  KEY
=	TokenNameEQUAL	
"log4j.configuration"	TokenNameStringLiteral	log4j.configuration
;	TokenNameSEMICOLON	
/** * @deprecated This variable is for internal use only. It will * become private in future versions. * */	TokenNameCOMMENT_JAVADOC	 @deprecated This variable is for internal use only. It will become private in future versions. 
static	TokenNamestatic	
final	TokenNamefinal	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
CONFIGURATOR_CLASS_KEY	TokenNameIdentifier	 CONFIGURATOR  CLASS  KEY
=	TokenNameEQUAL	
"log4j.configuratorClass"	TokenNameStringLiteral	log4j.configuratorClass
;	TokenNameSEMICOLON	
/** * @deprecated This variable is for internal use only. It will * become private in future versions. */	TokenNameCOMMENT_JAVADOC	 @deprecated This variable is for internal use only. It will become private in future versions. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_INIT_OVERRIDE_KEY	TokenNameIdentifier	 DEFAULT  INIT  OVERRIDE  KEY
=	TokenNameEQUAL	
"log4j.defaultInitOverride"	TokenNameStringLiteral	log4j.defaultInitOverride
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
guard	TokenNameIdentifier	 guard
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
RepositorySelector	TokenNameIdentifier	 Repository Selector
repositorySelector	TokenNameIdentifier	 repository Selector
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
// By default we use a DefaultRepositorySelector which always returns 'h'. 	TokenNameCOMMENT_LINE	By default we use a DefaultRepositorySelector which always returns 'h'. 
Hierarchy	TokenNameIdentifier	 Hierarchy
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
Hierarchy	TokenNameIdentifier	 Hierarchy
(	TokenNameLPAREN	
new	TokenNamenew	
RootLogger	TokenNameIdentifier	 Root Logger
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repositorySelector	TokenNameIdentifier	 repository Selector
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultRepositorySelector	TokenNameIdentifier	 Default Repository Selector
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Search for the properties file log4j.properties in the CLASSPATH. */	TokenNameCOMMENT_JAVADOC	 Search for the properties file log4j.properties in the CLASSPATH. 
String	TokenNameIdentifier	 String
override	TokenNameIdentifier	 override
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
DEFAULT_INIT_OVERRIDE_KEY	TokenNameIdentifier	 DEFAULT  INIT  OVERRIDE  KEY
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if there is no default init override, then get the resource 	TokenNameCOMMENT_LINE	if there is no default init override, then get the resource 
// specified by the user or the default config file. 	TokenNameCOMMENT_LINE	specified by the user or the default config file. 
if	TokenNameif	
(	TokenNameLPAREN	
override	TokenNameIdentifier	 override
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
"false"	TokenNameStringLiteral	false
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
override	TokenNameIdentifier	 override
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
configurationOptionStr	TokenNameIdentifier	 configuration Option Str
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
DEFAULT_CONFIGURATION_KEY	TokenNameIdentifier	 DEFAULT  CONFIGURATION  KEY
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
configuratorClassName	TokenNameIdentifier	 configurator Class Name
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
CONFIGURATOR_CLASS_KEY	TokenNameIdentifier	 CONFIGURATOR  CLASS  KEY
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// if the user has not specified the log4j.configuration 	TokenNameCOMMENT_LINE	if the user has not specified the log4j.configuration 
// property, we search first for the file "log4j.xml" and then 	TokenNameCOMMENT_LINE	property, we search first for the file "log4j.xml" and then 
// "log4j.properties" 	TokenNameCOMMENT_LINE	"log4j.properties" 
if	TokenNameif	
(	TokenNameLPAREN	
configurationOptionStr	TokenNameIdentifier	 configuration Option Str
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
Loader	TokenNameIdentifier	 Loader
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
DEFAULT_XML_CONFIGURATION_FILE	TokenNameIdentifier	 DEFAULT  XML  CONFIGURATION  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
Loader	TokenNameIdentifier	 Loader
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
DEFAULT_CONFIGURATION_FILE	TokenNameIdentifier	 DEFAULT  CONFIGURATION  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
configurationOptionStr	TokenNameIdentifier	 configuration Option Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// so, resource is not a URL: 	TokenNameCOMMENT_LINE	so, resource is not a URL: 
// attempt to get the resource from the class path 	TokenNameCOMMENT_LINE	attempt to get the resource from the class path 
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
Loader	TokenNameIdentifier	 Loader
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
configurationOptionStr	TokenNameIdentifier	 configuration Option Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If we have a non-null url, then delegate the rest of the 	TokenNameCOMMENT_LINE	If we have a non-null url, then delegate the rest of the 
// configuration to the OptionConverter.selectAndConfigure 	TokenNameCOMMENT_LINE	configuration to the OptionConverter.selectAndConfigure 
// method. 	TokenNameCOMMENT_LINE	method. 
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Using URL ["	TokenNameStringLiteral	Using URL [
+	TokenNamePLUS	
url	TokenNameIdentifier	 url
+	TokenNamePLUS	
"] for automatic log4j configuration."	TokenNameStringLiteral	] for automatic log4j configuration.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
selectAndConfigure	TokenNameIdentifier	 select And Configure
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
configuratorClassName	TokenNameIdentifier	 configurator Class Name
,	TokenNameCOMMA	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoClassDefFoundError	TokenNameIdentifier	 No Class Def Found Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Error during default initialization"	TokenNameStringLiteral	Error during default initialization
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Could not find resource: ["	TokenNameStringLiteral	Could not find resource: [
+	TokenNamePLUS	
configurationOptionStr	TokenNameIdentifier	 configuration Option Str
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Default initialization of overridden by "	TokenNameStringLiteral	Default initialization of overridden by 
+	TokenNamePLUS	
DEFAULT_INIT_OVERRIDE_KEY	TokenNameIdentifier	 DEFAULT  INIT  OVERRIDE  KEY
+	TokenNamePLUS	
"property."	TokenNameStringLiteral	property.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Sets <code>LoggerFactory</code> but only if the correct <em>guard</em> is passed as parameter. <p>Initally the guard is null. If the guard is <code>null</code>, then invoking this method sets the logger factory and the guard. Following invocations will throw a {@link IllegalArgumentException}, unless the previously set <code>guard</code> is passed as the second parameter. <p>This allows a high-level component to set the {@link RepositorySelector} used by the <code>LogManager</code>. <p>For example, when tomcat starts it will be able to install its own repository selector. However, if and when Tomcat is embedded within JBoss, then JBoss will install its own repository selector and Tomcat will use the repository selector set by its container, JBoss. */	TokenNameCOMMENT_JAVADOC	 Sets <code>LoggerFactory</code> but only if the correct <em>guard</em> is passed as parameter. <p>Initally the guard is null. If the guard is <code>null</code>, then invoking this method sets the logger factory and the guard. Following invocations will throw a {@link IllegalArgumentException}, unless the previously set <code>guard</code> is passed as the second parameter. <p>This allows a high-level component to set the {@link RepositorySelector} used by the <code>LogManager</code>. <p>For example, when tomcat starts it will be able to install its own repository selector. However, if and when Tomcat is embedded within JBoss, then JBoss will install its own repository selector and Tomcat will use the repository selector set by its container, JBoss. 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
setRepositorySelector	TokenNameIdentifier	 set Repository Selector
(	TokenNameLPAREN	
RepositorySelector	TokenNameIdentifier	 Repository Selector
selector	TokenNameIdentifier	 selector
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
guard	TokenNameIdentifier	 guard
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
guard	TokenNameIdentifier	 guard
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
guard	TokenNameIdentifier	 guard
!=	TokenNameNOT_EQUAL	
guard	TokenNameIdentifier	 guard
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Attempted to reset the LoggerFactory without possessing the guard."	TokenNameStringLiteral	Attempted to reset the LoggerFactory without possessing the guard.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"RepositorySelector must be non-null."	TokenNameStringLiteral	RepositorySelector must be non-null.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
guard	TokenNameIdentifier	 guard
=	TokenNameEQUAL	
guard	TokenNameIdentifier	 guard
;	TokenNameSEMICOLON	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
repositorySelector	TokenNameIdentifier	 repository Selector
=	TokenNameEQUAL	
selector	TokenNameIdentifier	 selector
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method tests if called from a method that * is known to result in class members being abnormally * set to null but is assumed to be harmless since the * all classes are in the process of being unloaded. * * @param ex exception used to determine calling stack. * @return true if calling stack is recognized as likely safe. */	TokenNameCOMMENT_JAVADOC	 This method tests if called from a method that is known to result in class members being abnormally set to null but is assumed to be harmless since the all classes are in the process of being unloaded. * @param ex exception used to determine calling stack. @return true if calling stack is recognized as likely safe. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isLikelySafeScenario	TokenNameIdentifier	 is Likely Safe Scenario
(	TokenNameLPAREN	
final	TokenNamefinal	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringWriter	TokenNameIdentifier	 String Writer
stringWriter	TokenNameIdentifier	 string Writer
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
stringWriter	TokenNameIdentifier	 string Writer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
stringWriter	TokenNameIdentifier	 string Writer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"org.apache.catalina.loader.WebappClassLoader.stop"	TokenNameStringLiteral	org.apache.catalina.loader.WebappClassLoader.stop
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
LoggerRepository	TokenNameIdentifier	 Logger Repository
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
repositorySelector	TokenNameIdentifier	 repository Selector
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
repositorySelector	TokenNameIdentifier	 repository Selector
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultRepositorySelector	TokenNameIdentifier	 Default Repository Selector
(	TokenNameLPAREN	
new	TokenNamenew	
NOPLoggerRepository	TokenNameIdentifier	 NOP Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
guard	TokenNameIdentifier	 guard
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Class invariant violation"	TokenNameStringLiteral	Class invariant violation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"log4j called after unloading, see http://logging.apache.org/log4j/1.2/faq.html#unload."	TokenNameStringLiteral	log4j called after unloading, see http://logging.apache.org/log4j/1.2/faq.html#unload.
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isLikelySafeScenario	TokenNameIdentifier	 is Likely Safe Scenario
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
repositorySelector	TokenNameIdentifier	 repository Selector
.	TokenNameDOT	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Retrieve the appropriate root logger. */	TokenNameCOMMENT_JAVADOC	 Retrieve the appropriate root logger. 
public	TokenNamepublic	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Delegate the actual manufacturing of the logger to the logger repository. 	TokenNameCOMMENT_LINE	Delegate the actual manufacturing of the logger to the logger repository. 
return	TokenNamereturn	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Retrieve the appropriate {@link Logger} instance. */	TokenNameCOMMENT_JAVADOC	 Retrieve the appropriate {@link Logger} instance. 
public	TokenNamepublic	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Delegate the actual manufacturing of the logger to the logger repository. 	TokenNameCOMMENT_LINE	Delegate the actual manufacturing of the logger to the logger repository. 
return	TokenNamereturn	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Retrieve the appropriate {@link Logger} instance. */	TokenNameCOMMENT_JAVADOC	 Retrieve the appropriate {@link Logger} instance. 
public	TokenNamepublic	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Delegate the actual manufacturing of the logger to the logger repository. 	TokenNameCOMMENT_LINE	Delegate the actual manufacturing of the logger to the logger repository. 
return	TokenNamereturn	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Retrieve the appropriate {@link Logger} instance. */	TokenNameCOMMENT_JAVADOC	 Retrieve the appropriate {@link Logger} instance. 
public	TokenNamepublic	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
final	TokenNamefinal	
LoggerFactory	TokenNameIdentifier	 Logger Factory
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Delegate the actual manufacturing of the logger to the logger repository. 	TokenNameCOMMENT_LINE	Delegate the actual manufacturing of the logger to the logger repository. 
return	TokenNamereturn	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Enumeration	TokenNameIdentifier	 Enumeration
getCurrentLoggers	TokenNameIdentifier	 get Current Loggers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCurrentLoggers	TokenNameIdentifier	 get Current Loggers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
shutdown	TokenNameIdentifier	 shutdown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
shutdown	TokenNameIdentifier	 shutdown
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
resetConfiguration	TokenNameIdentifier	 reset Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resetConfiguration	TokenNameIdentifier	 reset Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
