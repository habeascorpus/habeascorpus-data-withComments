/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
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
FileInputStream	TokenNameIdentifier	 File Input Stream
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
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
/** * This class is duplicated for each JAXP subpackage so keep it in sync. * It is package private and therefore is not exposed as part of the JAXP * API. * <p> * This code is designed to implement the JAXP 1.1 spec pluggability * feature and is designed to run on JDK version 1.1 and * later, and to compile on JDK 1.2 and onward. * The code also runs both as part of an unbundled jar file and * when bundled as part of the JDK. * <p> * * @xerces.internal * * @version $Id: ObjectFactory.java 924307 2010-03-17 14:36:05Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class is duplicated for each JAXP subpackage so keep it in sync. It is package private and therefore is not exposed as part of the JAXP API. <p> This code is designed to implement the JAXP 1.1 spec pluggability feature and is designed to run on JDK version 1.1 and later, and to compile on JDK 1.2 and onward. The code also runs both as part of an unbundled jar file and when bundled as part of the JDK. <p> * @xerces.internal * @version $Id: ObjectFactory.java 924307 2010-03-17 14:36:05Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
ObjectFactory	TokenNameIdentifier	 Object Factory
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
// name of default properties file to look for in JDK's jre/lib directory 	TokenNameCOMMENT_LINE	name of default properties file to look for in JDK's jre/lib directory 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_PROPERTIES_FILENAME	TokenNameIdentifier	 DEFAULT  PROPERTIES  FILENAME
=	TokenNameEQUAL	
"xerces.properties"	TokenNameStringLiteral	xerces.properties
;	TokenNameSEMICOLON	
/** Set to true for debugging */	TokenNameCOMMENT_JAVADOC	 Set to true for debugging 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Default columns per line. */	TokenNameCOMMENT_JAVADOC	 Default columns per line. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_LINE_LENGTH	TokenNameIdentifier	 DEFAULT  LINE  LENGTH
=	TokenNameEQUAL	
80	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** cache the contents of the xerces.properties file. * Until an attempt has been made to read this file, this will * be null; if the file does not exist or we encounter some other error * during the read, this will be empty. */	TokenNameCOMMENT_JAVADOC	 cache the contents of the xerces.properties file. Until an attempt has been made to read this file, this will be null; if the file does not exist or we encounter some other error during the read, this will be empty. 
private	TokenNameprivate	
static	TokenNamestatic	
Properties	TokenNameIdentifier	 Properties
fXercesProperties	TokenNameIdentifier	 f Xerces Properties
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/*** * Cache the time stamp of the xerces.properties file so * that we know if it's been modified and can invalidate * the cache when necessary. */	TokenNameCOMMENT_JAVADOC	* Cache the time stamp of the xerces.properties file so that we know if it's been modified and can invalidate the cache when necessary. 
private	TokenNameprivate	
static	TokenNamestatic	
long	TokenNamelong	
fLastModified	TokenNameIdentifier	 f Last Modified
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// static methods 	TokenNameCOMMENT_LINE	static methods 
// 	TokenNameCOMMENT_LINE	 
/** * Finds the implementation Class object in the specified order. The * specified order is the following: * <ol> * <li>query the system property using <code>System.getProperty</code> * <li>read <code>META-INF/services/<i>factoryId</i></code> file * <li>use fallback classname * </ol> * * @return Class object of factory, never null * * @param factoryId Name of the factory to find, same as * a property name * @param fallbackClassName Implementation class name, if nothing else * is found. Use null to mean no fallback. * * @exception ObjectFactory.ConfigurationError */	TokenNameCOMMENT_JAVADOC	 Finds the implementation Class object in the specified order. The specified order is the following: <ol> <li>query the system property using <code>System.getProperty</code> <li>read <code>META-INF/services/<i>factoryId</i></code> file <li>use fallback classname </ol> * @return Class object of factory, never null * @param factoryId Name of the factory to find, same as a property name @param fallbackClassName Implementation class name, if nothing else is found. Use null to mean no fallback. * @exception ObjectFactory.ConfigurationError 
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
createObject	TokenNameIdentifier	 create Object
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
factoryId	TokenNameIdentifier	 factory Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fallbackClassName	TokenNameIdentifier	 fallback Class Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationError	TokenNameIdentifier	 Configuration Error
{	TokenNameLBRACE	
return	TokenNamereturn	
createObject	TokenNameIdentifier	 create Object
(	TokenNameLPAREN	
factoryId	TokenNameIdentifier	 factory Id
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
fallbackClassName	TokenNameIdentifier	 fallback Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createObject(String,String):Object 	TokenNameCOMMENT_LINE	createObject(String,String):Object 
/** * Finds the implementation Class object in the specified order. The * specified order is the following: * <ol> * <li>query the system property using <code>System.getProperty</code> * <li>read <code>$java.home/lib/<i>propertiesFilename</i></code> file * <li>read <code>META-INF/services/<i>factoryId</i></code> file * <li>use fallback classname * </ol> * * @return Class object of factory, never null * * @param factoryId Name of the factory to find, same as * a property name * @param propertiesFilename The filename in the $java.home/lib directory * of the properties file. If none specified, * ${java.home}/lib/xerces.properties will be used. * @param fallbackClassName Implementation class name, if nothing else * is found. Use null to mean no fallback. * * @exception ObjectFactory.ConfigurationError */	TokenNameCOMMENT_JAVADOC	 Finds the implementation Class object in the specified order. The specified order is the following: <ol> <li>query the system property using <code>System.getProperty</code> <li>read <code>$java.home/lib/<i>propertiesFilename</i></code> file <li>read <code>META-INF/services/<i>factoryId</i></code> file <li>use fallback classname </ol> * @return Class object of factory, never null * @param factoryId Name of the factory to find, same as a property name @param propertiesFilename The filename in the $java.home/lib directory of the properties file. If none specified, ${java.home}/lib/xerces.properties will be used. @param fallbackClassName Implementation class name, if nothing else is found. Use null to mean no fallback. * @exception ObjectFactory.ConfigurationError 
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
createObject	TokenNameIdentifier	 create Object
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
factoryId	TokenNameIdentifier	 factory Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
propertiesFilename	TokenNameIdentifier	 properties Filename
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fallbackClassName	TokenNameIdentifier	 fallback Class Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationError	TokenNameIdentifier	 Configuration Error
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
debugPrintln	TokenNameIdentifier	 debug Println
(	TokenNameLPAREN	
"debug is on"	TokenNameStringLiteral	debug is on
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLoader	TokenNameIdentifier	 Class Loader
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use the system property first 	TokenNameCOMMENT_LINE	Use the system property first 
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
systemProp	TokenNameIdentifier	 system Prop
=	TokenNameEQUAL	
SecuritySupport	TokenNameIdentifier	 Security Support
.	TokenNameDOT	
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
factoryId	TokenNameIdentifier	 factory Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
systemProp	TokenNameIdentifier	 system Prop
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
systemProp	TokenNameIdentifier	 system Prop
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
debugPrintln	TokenNameIdentifier	 debug Println
(	TokenNameLPAREN	
"found system property, value="	TokenNameStringLiteral	found system property, value=
+	TokenNamePLUS	
systemProp	TokenNameIdentifier	 system Prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
systemProp	TokenNameIdentifier	 system Prop
,	TokenNameCOMMA	
cl	TokenNameIdentifier	 cl
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ignore and continue w/ next location 	TokenNameCOMMENT_LINE	Ignore and continue w/ next location 
}	TokenNameRBRACE	
// Try to read from propertiesFilename, or $java.home/lib/xerces.properties 	TokenNameCOMMENT_LINE	Try to read from propertiesFilename, or $java.home/lib/xerces.properties 
String	TokenNameIdentifier	 String
factoryClassName	TokenNameIdentifier	 factory Class Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// no properties file name specified; use $JAVA_HOME/lib/xerces.properties: 	TokenNameCOMMENT_LINE	no properties file name specified; use $JAVA_HOME/lib/xerces.properties: 
if	TokenNameif	
(	TokenNameLPAREN	
propertiesFilename	TokenNameIdentifier	 properties Filename
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
propertiesFile	TokenNameIdentifier	 properties File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
propertiesFileExists	TokenNameIdentifier	 properties File Exists
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
javah	TokenNameIdentifier	 javah
=	TokenNameEQUAL	
SecuritySupport	TokenNameIdentifier	 Security Support
.	TokenNameDOT	
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
"java.home"	TokenNameStringLiteral	java.home
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
propertiesFilename	TokenNameIdentifier	 properties Filename
=	TokenNameEQUAL	
javah	TokenNameIdentifier	 javah
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"lib"	TokenNameStringLiteral	lib
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
DEFAULT_PROPERTIES_FILENAME	TokenNameIdentifier	 DEFAULT  PROPERTIES  FILENAME
;	TokenNameSEMICOLON	
propertiesFile	TokenNameIdentifier	 properties File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
propertiesFilename	TokenNameIdentifier	 properties Filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
propertiesFileExists	TokenNameIdentifier	 properties File Exists
=	TokenNameEQUAL	
SecuritySupport	TokenNameIdentifier	 Security Support
.	TokenNameDOT	
getFileExists	TokenNameIdentifier	 get File Exists
(	TokenNameLPAREN	
propertiesFile	TokenNameIdentifier	 properties File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// try again... 	TokenNameCOMMENT_LINE	try again... 
fLastModified	TokenNameIdentifier	 f Last Modified
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fXercesProperties	TokenNameIdentifier	 f Xerces Properties
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
loadProperties	TokenNameIdentifier	 load Properties
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// file existed last time 	TokenNameCOMMENT_LINE	file existed last time 
if	TokenNameif	
(	TokenNameLPAREN	
fLastModified	TokenNameIdentifier	 f Last Modified
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
propertiesFileExists	TokenNameIdentifier	 properties File Exists
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fLastModified	TokenNameIdentifier	 f Last Modified
<	TokenNameLESS	
(	TokenNameLPAREN	
fLastModified	TokenNameIdentifier	 f Last Modified
=	TokenNameEQUAL	
SecuritySupport	TokenNameIdentifier	 Security Support
.	TokenNameDOT	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
propertiesFile	TokenNameIdentifier	 properties File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loadProperties	TokenNameIdentifier	 load Properties
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// file has stopped existing... 	TokenNameCOMMENT_LINE	file has stopped existing... 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
propertiesFileExists	TokenNameIdentifier	 properties File Exists
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fLastModified	TokenNameIdentifier	 f Last Modified
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fXercesProperties	TokenNameIdentifier	 f Xerces Properties
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// else, file wasn't modified! 	TokenNameCOMMENT_LINE	else, file wasn't modified! 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// file has started to exist: 	TokenNameCOMMENT_LINE	file has started to exist: 
if	TokenNameif	
(	TokenNameLPAREN	
propertiesFileExists	TokenNameIdentifier	 properties File Exists
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loadProperties	TokenNameIdentifier	 load Properties
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fLastModified	TokenNameIdentifier	 f Last Modified
=	TokenNameEQUAL	
SecuritySupport	TokenNameIdentifier	 Security Support
.	TokenNameDOT	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
propertiesFile	TokenNameIdentifier	 properties File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// else, nothing's changed 	TokenNameCOMMENT_LINE	else, nothing's changed 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
loadProperties	TokenNameIdentifier	 load Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// must never have attempted to read xerces.properties before (or it's outdeated) 	TokenNameCOMMENT_LINE	must never have attempted to read xerces.properties before (or it's outdeated) 
fXercesProperties	TokenNameIdentifier	 f Xerces Properties
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
SecuritySupport	TokenNameIdentifier	 Security Support
.	TokenNameDOT	
getFileInputStream	TokenNameIdentifier	 get File Input Stream
(	TokenNameLPAREN	
propertiesFile	TokenNameIdentifier	 properties File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fXercesProperties	TokenNameIdentifier	 f Xerces Properties
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fXercesProperties	TokenNameIdentifier	 f Xerces Properties
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fLastModified	TokenNameIdentifier	 f Last Modified
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// assert(x instanceof FileNotFoundException 	TokenNameCOMMENT_LINE	assert(x instanceof FileNotFoundException 
// || x instanceof SecurityException) 	TokenNameCOMMENT_LINE	|| x instanceof SecurityException) 
// In both cases, ignore and continue w/ next location 	TokenNameCOMMENT_LINE	In both cases, ignore and continue w/ next location 
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
// try to close the input stream if one was opened. 	TokenNameCOMMENT_LINE	try to close the input stream if one was opened. 
if	TokenNameif	
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fis	TokenNameIdentifier	 fis
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Ignore the exception. 	TokenNameCOMMENT_LINE	Ignore the exception. 
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fXercesProperties	TokenNameIdentifier	 f Xerces Properties
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
factoryClassName	TokenNameIdentifier	 factory Class Name
=	TokenNameEQUAL	
fXercesProperties	TokenNameIdentifier	 f Xerces Properties
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
factoryId	TokenNameIdentifier	 factory Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
fis	TokenNameIdentifier	 fis
=	TokenNameEQUAL	
SecuritySupport	TokenNameIdentifier	 Security Support
.	TokenNameDOT	
getFileInputStream	TokenNameIdentifier	 get File Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
propertiesFilename	TokenNameIdentifier	 properties Filename
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factoryClassName	TokenNameIdentifier	 factory Class Name
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
factoryId	TokenNameIdentifier	 factory Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// assert(x instanceof FileNotFoundException 	TokenNameCOMMENT_LINE	assert(x instanceof FileNotFoundException 
// || x instanceof SecurityException) 	TokenNameCOMMENT_LINE	|| x instanceof SecurityException) 
// In both cases, ignore and continue w/ next location 	TokenNameCOMMENT_LINE	In both cases, ignore and continue w/ next location 
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
// try to close the input stream if one was opened. 	TokenNameCOMMENT_LINE	try to close the input stream if one was opened. 
if	TokenNameif	
(	TokenNameLPAREN	
fis	TokenNameIdentifier	 fis
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fis	TokenNameIdentifier	 fis
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Ignore the exception. 	TokenNameCOMMENT_LINE	Ignore the exception. 
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
factoryClassName	TokenNameIdentifier	 factory Class Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
debugPrintln	TokenNameIdentifier	 debug Println
(	TokenNameLPAREN	
"found in "	TokenNameStringLiteral	found in 
+	TokenNamePLUS	
propertiesFilename	TokenNameIdentifier	 properties Filename
+	TokenNamePLUS	
", value="	TokenNameStringLiteral	, value=
+	TokenNamePLUS	
factoryClassName	TokenNameIdentifier	 factory Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
factoryClassName	TokenNameIdentifier	 factory Class Name
,	TokenNameCOMMA	
cl	TokenNameIdentifier	 cl
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Try Jar Service Provider Mechanism 	TokenNameCOMMENT_LINE	Try Jar Service Provider Mechanism 
Object	TokenNameIdentifier	 Object
provider	TokenNameIdentifier	 provider
=	TokenNameEQUAL	
findJarServiceProvider	TokenNameIdentifier	 find Jar Service Provider
(	TokenNameLPAREN	
factoryId	TokenNameIdentifier	 factory Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
provider	TokenNameIdentifier	 provider
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
provider	TokenNameIdentifier	 provider
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fallbackClassName	TokenNameIdentifier	 fallback Class Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ConfigurationError	TokenNameIdentifier	 Configuration Error
(	TokenNameLPAREN	
"Provider for "	TokenNameStringLiteral	Provider for 
+	TokenNamePLUS	
factoryId	TokenNameIdentifier	 factory Id
+	TokenNamePLUS	
" cannot be found"	TokenNameStringLiteral	 cannot be found
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
debugPrintln	TokenNameIdentifier	 debug Println
(	TokenNameLPAREN	
"using fallback, value="	TokenNameStringLiteral	using fallback, value=
+	TokenNamePLUS	
fallbackClassName	TokenNameIdentifier	 fallback Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
fallbackClassName	TokenNameIdentifier	 fallback Class Name
,	TokenNameCOMMA	
cl	TokenNameIdentifier	 cl
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createObject(String,String,String):Object 	TokenNameCOMMENT_LINE	createObject(String,String,String):Object 
// 	TokenNameCOMMENT_LINE	 
// Private static methods 	TokenNameCOMMENT_LINE	Private static methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns true if debug has been enabled. */	TokenNameCOMMENT_JAVADOC	 Returns true if debug has been enabled. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
SecuritySupport	TokenNameIdentifier	 Security Support
.	TokenNameDOT	
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
"xerces.debug"	TokenNameStringLiteral	xerces.debug
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Allow simply setting the prop to turn on debug 	TokenNameCOMMENT_LINE	Allow simply setting the prop to turn on debug 
return	TokenNamereturn	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
"false"	TokenNameStringLiteral	false
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isDebugEnabled() 	TokenNameCOMMENT_LINE	isDebugEnabled() 
/** Prints a message to standard error if debugging is enabled. */	TokenNameCOMMENT_JAVADOC	 Prints a message to standard error if debugging is enabled. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
debugPrintln	TokenNameIdentifier	 debug Println
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"XERCES: "	TokenNameStringLiteral	XERCES: 
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// debugPrintln(String) 	TokenNameCOMMENT_LINE	debugPrintln(String) 
/** * Figure out which ClassLoader to use. For JDK 1.2 and later use * the context ClassLoader. */	TokenNameCOMMENT_JAVADOC	 Figure out which ClassLoader to use. For JDK 1.2 and later use the context ClassLoader. 
static	TokenNamestatic	
ClassLoader	TokenNameIdentifier	 Class Loader
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationError	TokenNameIdentifier	 Configuration Error
{	TokenNameLBRACE	
// Figure out which ClassLoader to use for loading the provider 	TokenNameCOMMENT_LINE	Figure out which ClassLoader to use for loading the provider 
// class. If there is a Context ClassLoader then use it. 	TokenNameCOMMENT_LINE	class. If there is a Context ClassLoader then use it. 
ClassLoader	TokenNameIdentifier	 Class Loader
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
SecuritySupport	TokenNameIdentifier	 Security Support
.	TokenNameDOT	
getContextClassLoader	TokenNameIdentifier	 get Context Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLoader	TokenNameIdentifier	 Class Loader
system	TokenNameIdentifier	 system
=	TokenNameEQUAL	
SecuritySupport	TokenNameIdentifier	 Security Support
.	TokenNameDOT	
getSystemClassLoader	TokenNameIdentifier	 get System Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLoader	TokenNameIdentifier	 Class Loader
chain	TokenNameIdentifier	 chain
=	TokenNameEQUAL	
system	TokenNameIdentifier	 system
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
==	TokenNameEQUAL_EQUAL	
chain	TokenNameIdentifier	 chain
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assert: we are on JDK 1.1 or we have no Context ClassLoader 	TokenNameCOMMENT_LINE	Assert: we are on JDK 1.1 or we have no Context ClassLoader 
// or any Context ClassLoader in chain of system classloader 	TokenNameCOMMENT_LINE	or any Context ClassLoader in chain of system classloader 
// (including extension ClassLoader) so extend to widest 	TokenNameCOMMENT_LINE	(including extension ClassLoader) so extend to widest 
// ClassLoader (always look in system ClassLoader if Xerces 	TokenNameCOMMENT_LINE	ClassLoader (always look in system ClassLoader if Xerces 
// is in boot/extension/system classpath and in current 	TokenNameCOMMENT_LINE	is in boot/extension/system classpath and in current 
// ClassLoader otherwise); normal classloaders delegate 	TokenNameCOMMENT_LINE	ClassLoader otherwise); normal classloaders delegate 
// back to system ClassLoader first so this widening doesn't 	TokenNameCOMMENT_LINE	back to system ClassLoader first so this widening doesn't 
// change the fact that context ClassLoader will be consulted 	TokenNameCOMMENT_LINE	change the fact that context ClassLoader will be consulted 
ClassLoader	TokenNameIdentifier	 Class Loader
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chain	TokenNameIdentifier	 chain
=	TokenNameEQUAL	
system	TokenNameIdentifier	 system
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
chain	TokenNameIdentifier	 chain
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assert: Current ClassLoader in chain of 	TokenNameCOMMENT_LINE	Assert: Current ClassLoader in chain of 
// boot/extension/system ClassLoaders 	TokenNameCOMMENT_LINE	boot/extension/system ClassLoaders 
return	TokenNamereturn	
system	TokenNameIdentifier	 system
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chain	TokenNameIdentifier	 chain
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
chain	TokenNameIdentifier	 chain
=	TokenNameEQUAL	
SecuritySupport	TokenNameIdentifier	 Security Support
.	TokenNameDOT	
getParentClassLoader	TokenNameIdentifier	 get Parent Class Loader
(	TokenNameLPAREN	
chain	TokenNameIdentifier	 chain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Assert: Current ClassLoader not in chain of 	TokenNameCOMMENT_LINE	Assert: Current ClassLoader not in chain of 
// boot/extension/system ClassLoaders 	TokenNameCOMMENT_LINE	boot/extension/system ClassLoaders 
return	TokenNamereturn	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chain	TokenNameIdentifier	 chain
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// boot ClassLoader reached 	TokenNameCOMMENT_LINE	boot ClassLoader reached 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Check for any extension ClassLoaders in chain up to 	TokenNameCOMMENT_LINE	Check for any extension ClassLoaders in chain up to 
// boot ClassLoader 	TokenNameCOMMENT_LINE	boot ClassLoader 
chain	TokenNameIdentifier	 chain
=	TokenNameEQUAL	
SecuritySupport	TokenNameIdentifier	 Security Support
.	TokenNameDOT	
getParentClassLoader	TokenNameIdentifier	 get Parent Class Loader
(	TokenNameLPAREN	
chain	TokenNameIdentifier	 chain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Assert: Context ClassLoader not in chain of 	TokenNameCOMMENT_LINE	Assert: Context ClassLoader not in chain of 
// boot/extension/system ClassLoaders 	TokenNameCOMMENT_LINE	boot/extension/system ClassLoaders 
return	TokenNamereturn	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// findClassLoader():ClassLoader 	TokenNameCOMMENT_LINE	findClassLoader():ClassLoader 
/** * Create an instance of a class using the specified ClassLoader */	TokenNameCOMMENT_JAVADOC	 Create an instance of a class using the specified ClassLoader 
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
cl	TokenNameIdentifier	 cl
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doFallback	TokenNameIdentifier	 do Fallback
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationError	TokenNameIdentifier	 Configuration Error
{	TokenNameLBRACE	
// assert(className != null); 	TokenNameCOMMENT_LINE	assert(className != null); 
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
providerClass	TokenNameIdentifier	 provider Class
=	TokenNameEQUAL	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
cl	TokenNameIdentifier	 cl
,	TokenNameCOMMA	
doFallback	TokenNameIdentifier	 do Fallback
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
providerClass	TokenNameIdentifier	 provider Class
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
debugPrintln	TokenNameIdentifier	 debug Println
(	TokenNameLPAREN	
"created new instance of "	TokenNameStringLiteral	created new instance of 
+	TokenNamePLUS	
providerClass	TokenNameIdentifier	 provider Class
+	TokenNamePLUS	
" using ClassLoader: "	TokenNameStringLiteral	 using ClassLoader: 
+	TokenNamePLUS	
cl	TokenNameIdentifier	 cl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ConfigurationError	TokenNameIdentifier	 Configuration Error
(	TokenNameLPAREN	
"Provider "	TokenNameStringLiteral	Provider 
+	TokenNamePLUS	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
" not found"	TokenNameStringLiteral	 not found
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ConfigurationError	TokenNameIdentifier	 Configuration Error
(	TokenNameLPAREN	
"Provider "	TokenNameStringLiteral	Provider 
+	TokenNamePLUS	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
" could not be instantiated: "	TokenNameStringLiteral	 could not be instantiated: 
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Find a Class using the specified ClassLoader */	TokenNameCOMMENT_JAVADOC	 Find a Class using the specified ClassLoader 
static	TokenNamestatic	
Class	TokenNameIdentifier	 Class
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
cl	TokenNameIdentifier	 cl
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doFallback	TokenNameIdentifier	 do Fallback
)	TokenNameRPAREN	
throws	TokenNamethrows	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
,	TokenNameCOMMA	
ConfigurationError	TokenNameIdentifier	 Configuration Error
{	TokenNameLBRACE	
//throw security exception if the calling thread is not allowed to access the package 	TokenNameCOMMENT_LINE	throw security exception if the calling thread is not allowed to access the package 
//restrict the access to package as speicified in java.security policy 	TokenNameCOMMENT_LINE	restrict the access to package as speicified in java.security policy 
SecurityManager	TokenNameIdentifier	 Security Manager
security	TokenNameIdentifier	 security
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getSecurityManager	TokenNameIdentifier	 get Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
security	TokenNameIdentifier	 security
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
lastDot	TokenNameIdentifier	 last Dot
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
packageName	TokenNameIdentifier	 package Name
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastDot	TokenNameIdentifier	 last Dot
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
packageName	TokenNameIdentifier	 package Name
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lastDot	TokenNameIdentifier	 last Dot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
checkPackageAccess	TokenNameIdentifier	 check Package Access
(	TokenNameLPAREN	
packageName	TokenNameIdentifier	 package Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Class	TokenNameIdentifier	 Class
providerClass	TokenNameIdentifier	 provider Class
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cl	TokenNameIdentifier	 cl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XXX Use the bootstrap ClassLoader. There is no way to 	TokenNameCOMMENT_LINE	XXX Use the bootstrap ClassLoader. There is no way to 
// load a class using the bootstrap ClassLoader that works 	TokenNameCOMMENT_LINE	load a class using the bootstrap ClassLoader that works 
// in both JDK 1.1 and Java 2. However, this should still 	TokenNameCOMMENT_LINE	in both JDK 1.1 and Java 2. However, this should still 
// work b/c the following should be true: 	TokenNameCOMMENT_LINE	work b/c the following should be true: 
// 	TokenNameCOMMENT_LINE	 
// (cl == null) iff current ClassLoader == null 	TokenNameCOMMENT_LINE	(cl == null) iff current ClassLoader == null 
// 	TokenNameCOMMENT_LINE	 
// Thus Class.forName(String) will use the current 	TokenNameCOMMENT_LINE	Thus Class.forName(String) will use the current 
// ClassLoader which will be the bootstrap ClassLoader. 	TokenNameCOMMENT_LINE	ClassLoader which will be the bootstrap ClassLoader. 
providerClass	TokenNameIdentifier	 provider Class
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
providerClass	TokenNameIdentifier	 provider Class
=	TokenNameEQUAL	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doFallback	TokenNameIdentifier	 do Fallback
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fall back to current classloader 	TokenNameCOMMENT_LINE	Fall back to current classloader 
ClassLoader	TokenNameIdentifier	 Class Loader
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
providerClass	TokenNameIdentifier	 provider Class
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cl	TokenNameIdentifier	 cl
!=	TokenNameNOT_EQUAL	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
providerClass	TokenNameIdentifier	 provider Class
=	TokenNameEQUAL	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
providerClass	TokenNameIdentifier	 provider Class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Try to find provider using Jar Service Provider Mechanism * * @return instance of provider class if found or null */	TokenNameCOMMENT_BLOCK	 Try to find provider using Jar Service Provider Mechanism * @return instance of provider class if found or null 
private	TokenNameprivate	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
findJarServiceProvider	TokenNameIdentifier	 find Jar Service Provider
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
factoryId	TokenNameIdentifier	 factory Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationError	TokenNameIdentifier	 Configuration Error
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
serviceId	TokenNameIdentifier	 service Id
=	TokenNameEQUAL	
"META-INF/services/"	TokenNameStringLiteral	META-INF/services/
+	TokenNamePLUS	
factoryId	TokenNameIdentifier	 factory Id
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// First try the Context ClassLoader 	TokenNameCOMMENT_LINE	First try the Context ClassLoader 
ClassLoader	TokenNameIdentifier	 Class Loader
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
SecuritySupport	TokenNameIdentifier	 Security Support
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
cl	TokenNameIdentifier	 cl
,	TokenNameCOMMA	
serviceId	TokenNameIdentifier	 service Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If no provider found then try the current ClassLoader 	TokenNameCOMMENT_LINE	If no provider found then try the current ClassLoader 
if	TokenNameif	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cl	TokenNameIdentifier	 cl
!=	TokenNameNOT_EQUAL	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
SecuritySupport	TokenNameIdentifier	 Security Support
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
cl	TokenNameIdentifier	 cl
,	TokenNameCOMMA	
serviceId	TokenNameIdentifier	 service Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No provider found 	TokenNameCOMMENT_LINE	No provider found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
debugPrintln	TokenNameIdentifier	 debug Println
(	TokenNameLPAREN	
"found jar resource="	TokenNameStringLiteral	found jar resource=
+	TokenNamePLUS	
serviceId	TokenNameIdentifier	 service Id
+	TokenNamePLUS	
" using ClassLoader: "	TokenNameStringLiteral	 using ClassLoader: 
+	TokenNamePLUS	
cl	TokenNameIdentifier	 cl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Read the service provider name in UTF-8 as specified in 	TokenNameCOMMENT_LINE	Read the service provider name in UTF-8 as specified in 
// the jar spec. Unfortunately this fails in Microsoft 	TokenNameCOMMENT_LINE	the jar spec. Unfortunately this fails in Microsoft 
// VJ++, which does not implement the UTF-8 	TokenNameCOMMENT_LINE	VJ++, which does not implement the UTF-8 
// encoding. Theoretically, we should simply let it fail in 	TokenNameCOMMENT_LINE	encoding. Theoretically, we should simply let it fail in 
// that case, since the JVM is obviously broken if it 	TokenNameCOMMENT_LINE	that case, since the JVM is obviously broken if it 
// doesn't support such a basic standard. But since there 	TokenNameCOMMENT_LINE	doesn't support such a basic standard. But since there 
// are still some users attempting to use VJ++ for 	TokenNameCOMMENT_LINE	are still some users attempting to use VJ++ for 
// development, we have dropped in a fallback which makes a 	TokenNameCOMMENT_LINE	development, we have dropped in a fallback which makes a 
// second attempt using the platform's default encoding. In 	TokenNameCOMMENT_LINE	second attempt using the platform's default encoding. In 
// VJ++ this is apparently ASCII, which is a subset of 	TokenNameCOMMENT_LINE	VJ++ this is apparently ASCII, which is a subset of 
// UTF-8... and since the strings we'll be reading here are 	TokenNameCOMMENT_LINE	UTF-8... and since the strings we'll be reading here are 
// also primarily limited to the 7-bit ASCII range (at 	TokenNameCOMMENT_LINE	also primarily limited to the 7-bit ASCII range (at 
// least, in English versions), this should work well 	TokenNameCOMMENT_LINE	least, in English versions), this should work well 
// enough to keep us on the air until we're ready to 	TokenNameCOMMENT_LINE	enough to keep us on the air until we're ready to 
// officially decommit from VJ++. [Edited comment from 	TokenNameCOMMENT_LINE	officially decommit from VJ++. [Edited comment from 
// jkesselm] 	TokenNameCOMMENT_LINE	jkesselm] 
BufferedReader	TokenNameIdentifier	 Buffered Reader
rd	TokenNameIdentifier	 rd
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
rd	TokenNameIdentifier	 rd
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DEFAULT_LINE_LENGTH	TokenNameIdentifier	 DEFAULT  LINE  LENGTH
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
rd	TokenNameIdentifier	 rd
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DEFAULT_LINE_LENGTH	TokenNameIdentifier	 DEFAULT  LINE  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
factoryClassName	TokenNameIdentifier	 factory Class Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// XXX Does not handle all possible input as specified by the 	TokenNameCOMMENT_LINE	XXX Does not handle all possible input as specified by the 
// Jar Service Provider specification 	TokenNameCOMMENT_LINE	Jar Service Provider specification 
factoryClassName	TokenNameIdentifier	 factory Class Name
=	TokenNameEQUAL	
rd	TokenNameIdentifier	 rd
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No provider found 	TokenNameCOMMENT_LINE	No provider found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// try to close the reader. 	TokenNameCOMMENT_LINE	try to close the reader. 
rd	TokenNameIdentifier	 rd
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Ignore the exception. 	TokenNameCOMMENT_LINE	Ignore the exception. 
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
factoryClassName	TokenNameIdentifier	 factory Class Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
factoryClassName	TokenNameIdentifier	 factory Class Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
debugPrintln	TokenNameIdentifier	 debug Println
(	TokenNameLPAREN	
"found in resource, value="	TokenNameStringLiteral	found in resource, value=
+	TokenNamePLUS	
factoryClassName	TokenNameIdentifier	 factory Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Note: here we do not want to fall back to the current 	TokenNameCOMMENT_LINE	Note: here we do not want to fall back to the current 
// ClassLoader because we want to avoid the case where the 	TokenNameCOMMENT_LINE	ClassLoader because we want to avoid the case where the 
// resource file was found using one ClassLoader and the 	TokenNameCOMMENT_LINE	resource file was found using one ClassLoader and the 
// provider class was instantiated using a different one. 	TokenNameCOMMENT_LINE	provider class was instantiated using a different one. 
return	TokenNamereturn	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
factoryClassName	TokenNameIdentifier	 factory Class Name
,	TokenNameCOMMA	
cl	TokenNameIdentifier	 cl
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// No provider found 	TokenNameCOMMENT_LINE	No provider found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Classes 	TokenNameCOMMENT_LINE	Classes 
// 	TokenNameCOMMENT_LINE	 
/** * A configuration error. */	TokenNameCOMMENT_JAVADOC	 A configuration error. 
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
ConfigurationError	TokenNameIdentifier	 Configuration Error
extends	TokenNameextends	
Error	TokenNameIdentifier	 Error
{	TokenNameLBRACE	
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1914065341994951202L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Exception. */	TokenNameCOMMENT_JAVADOC	 Exception. 
private	TokenNameprivate	
Exception	TokenNameIdentifier	 Exception
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Construct a new instance with the specified detail string and * exception. */	TokenNameCOMMENT_JAVADOC	 Construct a new instance with the specified detail string and exception. 
ConfigurationError	TokenNameIdentifier	 Configuration Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(String,Exception) 	TokenNameCOMMENT_LINE	<init>(String,Exception) 
// 	TokenNameCOMMENT_LINE	 
// methods 	TokenNameCOMMENT_LINE	methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns the exception associated to this error. */	TokenNameCOMMENT_JAVADOC	 Returns the exception associated to this error. 
Exception	TokenNameIdentifier	 Exception
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getException():Exception 	TokenNameCOMMENT_LINE	getException():Exception 
}	TokenNameRBRACE	
// class ConfigurationError 	TokenNameCOMMENT_LINE	class ConfigurationError 
}	TokenNameRBRACE	
// class ObjectFactory 	TokenNameCOMMENT_LINE	class ObjectFactory 
