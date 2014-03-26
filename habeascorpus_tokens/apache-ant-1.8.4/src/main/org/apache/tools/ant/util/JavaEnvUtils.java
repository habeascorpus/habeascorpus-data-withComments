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
FileWriter	TokenNameIdentifier	 File Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
Os	TokenNameIdentifier	 Os
;	TokenNameSEMICOLON	
/** * A set of helper methods related to locating executables or checking * conditons of a given Java installation. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 A set of helper methods related to locating executables or checking conditons of a given Java installation. * @since Ant 1.5 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
{	TokenNameLBRACE	
private	TokenNameprivate	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Are we on a DOS-based system */	TokenNameCOMMENT_JAVADOC	 Are we on a DOS-based system 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
IS_DOS	TokenNameIdentifier	 IS  DOS
=	TokenNameEQUAL	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"dos"	TokenNameStringLiteral	dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Are we on Novell NetWare */	TokenNameCOMMENT_JAVADOC	 Are we on Novell NetWare 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
IS_NETWARE	TokenNameIdentifier	 IS  NETWARE
=	TokenNameEQUAL	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isName	TokenNameIdentifier	 is Name
(	TokenNameLPAREN	
"netware"	TokenNameStringLiteral	netware
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Are we on AIX */	TokenNameCOMMENT_JAVADOC	 Are we on AIX 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
IS_AIX	TokenNameIdentifier	 IS  AIX
=	TokenNameEQUAL	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isName	TokenNameIdentifier	 is Name
(	TokenNameLPAREN	
"aix"	TokenNameStringLiteral	aix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** shortcut for System.getProperty("java.home") */	TokenNameCOMMENT_JAVADOC	 shortcut for System.getProperty("java.home") 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVA_HOME	TokenNameIdentifier	 JAVA  HOME
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.home"	TokenNameStringLiteral	java.home
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** FileUtils instance for path normalization */	TokenNameCOMMENT_JAVADOC	 FileUtils instance for path normalization 
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
/** Version of currently running VM. */	TokenNameCOMMENT_JAVADOC	 Version of currently running VM. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
javaVersion	TokenNameIdentifier	 java Version
;	TokenNameSEMICOLON	
/** floating version of the JVM */	TokenNameCOMMENT_JAVADOC	 floating version of the JVM 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
javaVersionNumber	TokenNameIdentifier	 java Version Number
;	TokenNameSEMICOLON	
/** Version constant for Java 1.0 */	TokenNameCOMMENT_JAVADOC	 Version constant for Java 1.0 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVA_1_0	TokenNameIdentifier	 JAVA 1 0
=	TokenNameEQUAL	
"1.0"	TokenNameStringLiteral	1.0
;	TokenNameSEMICOLON	
/** Number Version constant for Java 1.0 */	TokenNameCOMMENT_JAVADOC	 Number Version constant for Java 1.0 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VERSION_1_0	TokenNameIdentifier	 VERSION 1 0
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Version constant for Java 1.1 */	TokenNameCOMMENT_JAVADOC	 Version constant for Java 1.1 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVA_1_1	TokenNameIdentifier	 JAVA 1 1
=	TokenNameEQUAL	
"1.1"	TokenNameStringLiteral	1.1
;	TokenNameSEMICOLON	
/** Number Version constant for Java 1.1 */	TokenNameCOMMENT_JAVADOC	 Number Version constant for Java 1.1 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VERSION_1_1	TokenNameIdentifier	 VERSION 1 1
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Version constant for Java 1.2 */	TokenNameCOMMENT_JAVADOC	 Version constant for Java 1.2 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVA_1_2	TokenNameIdentifier	 JAVA 1 2
=	TokenNameEQUAL	
"1.2"	TokenNameStringLiteral	1.2
;	TokenNameSEMICOLON	
/** Number Version constant for Java 1.2 */	TokenNameCOMMENT_JAVADOC	 Number Version constant for Java 1.2 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VERSION_1_2	TokenNameIdentifier	 VERSION 1 2
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Version constant for Java 1.3 */	TokenNameCOMMENT_JAVADOC	 Version constant for Java 1.3 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVA_1_3	TokenNameIdentifier	 JAVA 1 3
=	TokenNameEQUAL	
"1.3"	TokenNameStringLiteral	1.3
;	TokenNameSEMICOLON	
/** Number Version constant for Java 1.3 */	TokenNameCOMMENT_JAVADOC	 Number Version constant for Java 1.3 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VERSION_1_3	TokenNameIdentifier	 VERSION 1 3
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Version constant for Java 1.4 */	TokenNameCOMMENT_JAVADOC	 Version constant for Java 1.4 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVA_1_4	TokenNameIdentifier	 JAVA 1 4
=	TokenNameEQUAL	
"1.4"	TokenNameStringLiteral	1.4
;	TokenNameSEMICOLON	
/** Number Version constant for Java 1.4 */	TokenNameCOMMENT_JAVADOC	 Number Version constant for Java 1.4 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VERSION_1_4	TokenNameIdentifier	 VERSION 1 4
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Version constant for Java 1.5 */	TokenNameCOMMENT_JAVADOC	 Version constant for Java 1.5 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVA_1_5	TokenNameIdentifier	 JAVA 1 5
=	TokenNameEQUAL	
"1.5"	TokenNameStringLiteral	1.5
;	TokenNameSEMICOLON	
/** Number Version constant for Java 1.5 */	TokenNameCOMMENT_JAVADOC	 Number Version constant for Java 1.5 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VERSION_1_5	TokenNameIdentifier	 VERSION 1 5
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Version constant for Java 1.6 */	TokenNameCOMMENT_JAVADOC	 Version constant for Java 1.6 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVA_1_6	TokenNameIdentifier	 JAVA 1 6
=	TokenNameEQUAL	
"1.6"	TokenNameStringLiteral	1.6
;	TokenNameSEMICOLON	
/** Number Version constant for Java 1.6 */	TokenNameCOMMENT_JAVADOC	 Number Version constant for Java 1.6 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VERSION_1_6	TokenNameIdentifier	 VERSION 1 6
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Version constant for Java 1.7 */	TokenNameCOMMENT_JAVADOC	 Version constant for Java 1.7 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVA_1_7	TokenNameIdentifier	 JAVA 1 7
=	TokenNameEQUAL	
"1.7"	TokenNameStringLiteral	1.7
;	TokenNameSEMICOLON	
/** Number Version constant for Java 1.7 */	TokenNameCOMMENT_JAVADOC	 Number Version constant for Java 1.7 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VERSION_1_7	TokenNameIdentifier	 VERSION 1 7
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Version constant for Java 1.8 */	TokenNameCOMMENT_JAVADOC	 Version constant for Java 1.8 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVA_1_8	TokenNameIdentifier	 JAVA 1 8
=	TokenNameEQUAL	
"1.8"	TokenNameStringLiteral	1.8
;	TokenNameSEMICOLON	
/** Number Version constant for Java 1.8 */	TokenNameCOMMENT_JAVADOC	 Number Version constant for Java 1.8 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VERSION_1_8	TokenNameIdentifier	 VERSION 1 8
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Whether this is the Kaffe VM */	TokenNameCOMMENT_JAVADOC	 Whether this is the Kaffe VM 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
kaffeDetected	TokenNameIdentifier	 kaffe Detected
;	TokenNameSEMICOLON	
/** Whether this is the GNU VM (gcj/gij) */	TokenNameCOMMENT_JAVADOC	 Whether this is the GNU VM (gcj/gij) 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
gijDetected	TokenNameIdentifier	 gij Detected
;	TokenNameSEMICOLON	
/** Whether this is Apache Harmony */	TokenNameCOMMENT_JAVADOC	 Whether this is Apache Harmony 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
harmonyDetected	TokenNameIdentifier	 harmony Detected
;	TokenNameSEMICOLON	
/** array of packages in the runtime */	TokenNameCOMMENT_JAVADOC	 array of packages in the runtime 
private	TokenNameprivate	
static	TokenNamestatic	
Vector	TokenNameIdentifier	 Vector
jrePackages	TokenNameIdentifier	 jre Packages
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
// Determine the Java version by looking at available classes 	TokenNameCOMMENT_LINE	Determine the Java version by looking at available classes 
// java.net.Proxy was introduced in JDK 1.5 	TokenNameCOMMENT_LINE	java.net.Proxy was introduced in JDK 1.5 
// java.lang.CharSequence was introduced in JDK 1.4 	TokenNameCOMMENT_LINE	java.lang.CharSequence was introduced in JDK 1.4 
// java.lang.StrictMath was introduced in JDK 1.3 	TokenNameCOMMENT_LINE	java.lang.StrictMath was introduced in JDK 1.3 
// java.lang.ThreadLocal was introduced in JDK 1.2 	TokenNameCOMMENT_LINE	java.lang.ThreadLocal was introduced in JDK 1.2 
// java.lang.Void was introduced in JDK 1.1 	TokenNameCOMMENT_LINE	java.lang.Void was introduced in JDK 1.1 
// Count up version until a NoClassDefFoundError ends the try 	TokenNameCOMMENT_LINE	Count up version until a NoClassDefFoundError ends the try 
try	TokenNametry	
{	TokenNameLBRACE	
javaVersion	TokenNameIdentifier	 java Version
=	TokenNameEQUAL	
JAVA_1_0	TokenNameIdentifier	 JAVA 1 0
;	TokenNameSEMICOLON	
javaVersionNumber	TokenNameIdentifier	 java Version Number
=	TokenNameEQUAL	
VERSION_1_0	TokenNameIdentifier	 VERSION 1 0
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"java.lang.Void"	TokenNameStringLiteral	java.lang.Void
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javaVersion	TokenNameIdentifier	 java Version
=	TokenNameEQUAL	
JAVA_1_1	TokenNameIdentifier	 JAVA 1 1
;	TokenNameSEMICOLON	
javaVersionNumber	TokenNameIdentifier	 java Version Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"java.lang.ThreadLocal"	TokenNameStringLiteral	java.lang.ThreadLocal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javaVersion	TokenNameIdentifier	 java Version
=	TokenNameEQUAL	
JAVA_1_2	TokenNameIdentifier	 JAVA 1 2
;	TokenNameSEMICOLON	
javaVersionNumber	TokenNameIdentifier	 java Version Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"java.lang.StrictMath"	TokenNameStringLiteral	java.lang.StrictMath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javaVersion	TokenNameIdentifier	 java Version
=	TokenNameEQUAL	
JAVA_1_3	TokenNameIdentifier	 JAVA 1 3
;	TokenNameSEMICOLON	
javaVersionNumber	TokenNameIdentifier	 java Version Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"java.lang.CharSequence"	TokenNameStringLiteral	java.lang.CharSequence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javaVersion	TokenNameIdentifier	 java Version
=	TokenNameEQUAL	
JAVA_1_4	TokenNameIdentifier	 JAVA 1 4
;	TokenNameSEMICOLON	
javaVersionNumber	TokenNameIdentifier	 java Version Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"java.net.Proxy"	TokenNameStringLiteral	java.net.Proxy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javaVersion	TokenNameIdentifier	 java Version
=	TokenNameEQUAL	
JAVA_1_5	TokenNameIdentifier	 JAVA 1 5
;	TokenNameSEMICOLON	
javaVersionNumber	TokenNameIdentifier	 java Version Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"java.net.CookieStore"	TokenNameStringLiteral	java.net.CookieStore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javaVersion	TokenNameIdentifier	 java Version
=	TokenNameEQUAL	
JAVA_1_6	TokenNameIdentifier	 JAVA 1 6
;	TokenNameSEMICOLON	
javaVersionNumber	TokenNameIdentifier	 java Version Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"java.nio.file.FileSystem"	TokenNameStringLiteral	java.nio.file.FileSystem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javaVersion	TokenNameIdentifier	 java Version
=	TokenNameEQUAL	
JAVA_1_7	TokenNameIdentifier	 JAVA 1 7
;	TokenNameSEMICOLON	
javaVersionNumber	TokenNameIdentifier	 java Version Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"java.lang.reflect.Executable"	TokenNameStringLiteral	java.lang.reflect.Executable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javaVersion	TokenNameIdentifier	 java Version
=	TokenNameEQUAL	
JAVA_1_8	TokenNameIdentifier	 JAVA 1 8
;	TokenNameSEMICOLON	
javaVersionNumber	TokenNameIdentifier	 java Version Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// swallow as we've hit the max class version that 	TokenNameCOMMENT_LINE	swallow as we've hit the max class version that 
// we have 	TokenNameCOMMENT_LINE	we have 
}	TokenNameRBRACE	
kaffeDetected	TokenNameIdentifier	 kaffe Detected
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"kaffe.util.NotImplemented"	TokenNameStringLiteral	kaffe.util.NotImplemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
kaffeDetected	TokenNameIdentifier	 kaffe Detected
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// swallow as this simply doesn't seem to be Kaffe 	TokenNameCOMMENT_LINE	swallow as this simply doesn't seem to be Kaffe 
}	TokenNameRBRACE	
gijDetected	TokenNameIdentifier	 gij Detected
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"gnu.gcj.Core"	TokenNameStringLiteral	gnu.gcj.Core
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gijDetected	TokenNameIdentifier	 gij Detected
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// swallow as this simply doesn't seem to be gcj/gij 	TokenNameCOMMENT_LINE	swallow as this simply doesn't seem to be gcj/gij 
}	TokenNameRBRACE	
harmonyDetected	TokenNameIdentifier	 harmony Detected
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"org.apache.harmony.luni.util.Base64"	TokenNameStringLiteral	org.apache.harmony.luni.util.Base64
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
harmonyDetected	TokenNameIdentifier	 harmony Detected
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// swallow as this simply doesn't seem to be Apache Harmony 	TokenNameCOMMENT_LINE	swallow as this simply doesn't seem to be Apache Harmony 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the version of Java this class is running under. * @return the version of Java as a String, e.g. "1.6" */	TokenNameCOMMENT_JAVADOC	 Returns the version of Java this class is running under. @return the version of Java as a String, e.g. "1.6" 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getJavaVersion	TokenNameIdentifier	 get Java Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
javaVersion	TokenNameIdentifier	 java Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the version of Java this class is running under. * This number can be used for comparisions; it will always be * @return the version of Java as a number 10x the major/minor, * e.g Java1.5 has a value of 15 */	TokenNameCOMMENT_JAVADOC	 Returns the version of Java this class is running under. This number can be used for comparisions; it will always be @return the version of Java as a number 10x the major/minor, e.g Java1.5 has a value of 15 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getJavaVersionNumber	TokenNameIdentifier	 get Java Version Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
javaVersionNumber	TokenNameIdentifier	 java Version Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares the current Java version to the passed in String - * assumes the argument is one of the constants defined in this * class. * Note that Ant now requires JDK 1.4+ so {@link #JAVA_1_0} through * {@link #JAVA_1_3} need no longer be tested for. * @param version the version to check against the current version. * @return true if the version of Java is the same as the given version. * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Compares the current Java version to the passed in String - assumes the argument is one of the constants defined in this class. Note that Ant now requires JDK 1.4+ so {@link #JAVA_1_0} through {@link #JAVA_1_3} need no longer be tested for. @param version the version to check against the current version. @return true if the version of Java is the same as the given version. @since Ant 1.5 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isJavaVersion	TokenNameIdentifier	 is Java Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
javaVersion	TokenNameIdentifier	 java Version
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares the current Java version to the passed in String - * assumes the argument is one of the constants defined in this * class. * Note that Ant now requires JDK 1.4+ so {@link #JAVA_1_0} through * {@link #JAVA_1_3} need no longer be tested for. * @param version the version to check against the current version. * @return true if the version of Java is the same or higher than the * given version. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Compares the current Java version to the passed in String - assumes the argument is one of the constants defined in this class. Note that Ant now requires JDK 1.4+ so {@link #JAVA_1_0} through {@link #JAVA_1_3} need no longer be tested for. @param version the version to check against the current version. @return true if the version of Java is the same or higher than the given version. @since Ant 1.7 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isAtLeastJavaVersion	TokenNameIdentifier	 is At Least Java Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
javaVersion	TokenNameIdentifier	 java Version
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether the current Java VM is Kaffe. * @return true if the current Java VM is Kaffe. * @since Ant 1.6.3 * @see <a href="http://www.kaffe.org/">http://www.kaffe.org/</a> */	TokenNameCOMMENT_JAVADOC	 Checks whether the current Java VM is Kaffe. @return true if the current Java VM is Kaffe. @since Ant 1.6.3 @see <a href="http://www.kaffe.org/">http://www.kaffe.org/</a> 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isKaffe	TokenNameIdentifier	 is Kaffe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
kaffeDetected	TokenNameIdentifier	 kaffe Detected
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether the current Java VM is the GNU interpreter gij * or we are running in a gcj precompiled binary. * @since Ant 1.8.2 * @return true if the current Java VM is gcj/gij. */	TokenNameCOMMENT_JAVADOC	 Checks whether the current Java VM is the GNU interpreter gij or we are running in a gcj precompiled binary. @since Ant 1.8.2 @return true if the current Java VM is gcj/gij. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isGij	TokenNameIdentifier	 is Gij
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gijDetected	TokenNameIdentifier	 gij Detected
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether the current VM is Apache Harmony. * @since Ant 1.8.2 * @return true if the current VM is Apache Harmony. */	TokenNameCOMMENT_JAVADOC	 Checks whether the current VM is Apache Harmony. @since Ant 1.8.2 @return true if the current VM is Apache Harmony. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isApacheHarmony	TokenNameIdentifier	 is Apache Harmony
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
harmonyDetected	TokenNameIdentifier	 harmony Detected
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Finds an executable that is part of a JRE installation based on * the java.home system property. * * <p><code>java</code>, <code>keytool</code>, * <code>policytool</code>, <code>orbd</code>, <code>rmid</code>, * <code>rmiregistry</code>, <code>servertool</code> and * <code>tnameserv</code> are JRE executables on Sun based * JRE's.</p> * * <p>You typically find them in <code>JAVA_HOME/jre/bin</code> if * <code>JAVA_HOME</code> points to your JDK installation. JDK * &lt; 1.2 has them in the same directory as the JDK * executables.</p> * @param command the java executable to find. * @return the path to the command. * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Finds an executable that is part of a JRE installation based on the java.home system property. * <p><code>java</code>, <code>keytool</code>, <code>policytool</code>, <code>orbd</code>, <code>rmid</code>, <code>rmiregistry</code>, <code>servertool</code> and <code>tnameserv</code> are JRE executables on Sun based JRE's.</p> * <p>You typically find them in <code>JAVA_HOME/jre/bin</code> if <code>JAVA_HOME</code> points to your JDK installation. JDK &lt; 1.2 has them in the same directory as the JDK executables.</p> @param command the java executable to find. @return the path to the command. @since Ant 1.5 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getJreExecutable	TokenNameIdentifier	 get Jre Executable
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
IS_NETWARE	TokenNameIdentifier	 IS  NETWARE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Extrapolating from: 	TokenNameCOMMENT_LINE	Extrapolating from: 
// "NetWare may have a "java" in that directory, but 99% of 	TokenNameCOMMENT_LINE	"NetWare may have a "java" in that directory, but 99% of 
// the time, you don't want to execute it" -- Jeff Tulley 	TokenNameCOMMENT_LINE	the time, you don't want to execute it" -- Jeff Tulley 
// <JTULLEY@novell.com> 	TokenNameCOMMENT_LINE	<JTULLEY@novell.com> 
return	TokenNamereturn	
command	TokenNameIdentifier	 command
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
jExecutable	TokenNameIdentifier	 j Executable
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
IS_AIX	TokenNameIdentifier	 IS  AIX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// On IBM's JDK 1.2 the directory layout is different, 1.3 follows 	TokenNameCOMMENT_LINE	On IBM's JDK 1.2 the directory layout is different, 1.3 follows 
// Sun's layout. 	TokenNameCOMMENT_LINE	Sun's layout. 
jExecutable	TokenNameIdentifier	 j Executable
=	TokenNameEQUAL	
findInDir	TokenNameIdentifier	 find In Dir
(	TokenNameLPAREN	
JAVA_HOME	TokenNameIdentifier	 JAVA  HOME
+	TokenNamePLUS	
"/sh"	TokenNameStringLiteral	/sh
,	TokenNameCOMMA	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
jExecutable	TokenNameIdentifier	 j Executable
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
jExecutable	TokenNameIdentifier	 j Executable
=	TokenNameEQUAL	
findInDir	TokenNameIdentifier	 find In Dir
(	TokenNameLPAREN	
JAVA_HOME	TokenNameIdentifier	 JAVA  HOME
+	TokenNamePLUS	
"/bin"	TokenNameStringLiteral	/bin
,	TokenNameCOMMA	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
jExecutable	TokenNameIdentifier	 j Executable
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
jExecutable	TokenNameIdentifier	 j Executable
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Unfortunately on Windows java.home doesn't always refer 	TokenNameCOMMENT_LINE	Unfortunately on Windows java.home doesn't always refer 
// to the correct location, so we need to fall back to 	TokenNameCOMMENT_LINE	to the correct location, so we need to fall back to 
// assuming java is somewhere on the PATH. 	TokenNameCOMMENT_LINE	assuming java is somewhere on the PATH. 
return	TokenNamereturn	
addExtension	TokenNameIdentifier	 add Extension
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Finds an executable that is part of a JDK installation based on * the java.home system property. * * <p>You typically find them in <code>JAVA_HOME/bin</code> if * <code>JAVA_HOME</code> points to your JDK installation.</p> * @param command the java executable to find. * @return the path to the command. * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Finds an executable that is part of a JDK installation based on the java.home system property. * <p>You typically find them in <code>JAVA_HOME/bin</code> if <code>JAVA_HOME</code> points to your JDK installation.</p> @param command the java executable to find. @return the path to the command. @since Ant 1.5 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getJdkExecutable	TokenNameIdentifier	 get Jdk Executable
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
IS_NETWARE	TokenNameIdentifier	 IS  NETWARE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Extrapolating from: 	TokenNameCOMMENT_LINE	Extrapolating from: 
// "NetWare may have a "java" in that directory, but 99% of 	TokenNameCOMMENT_LINE	"NetWare may have a "java" in that directory, but 99% of 
// the time, you don't want to execute it" -- Jeff Tulley 	TokenNameCOMMENT_LINE	the time, you don't want to execute it" -- Jeff Tulley 
// <JTULLEY@novell.com> 	TokenNameCOMMENT_LINE	<JTULLEY@novell.com> 
return	TokenNamereturn	
command	TokenNameIdentifier	 command
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
jExecutable	TokenNameIdentifier	 j Executable
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
IS_AIX	TokenNameIdentifier	 IS  AIX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// On IBM's JDK 1.2 the directory layout is different, 1.3 follows 	TokenNameCOMMENT_LINE	On IBM's JDK 1.2 the directory layout is different, 1.3 follows 
// Sun's layout. 	TokenNameCOMMENT_LINE	Sun's layout. 
jExecutable	TokenNameIdentifier	 j Executable
=	TokenNameEQUAL	
findInDir	TokenNameIdentifier	 find In Dir
(	TokenNameLPAREN	
JAVA_HOME	TokenNameIdentifier	 JAVA  HOME
+	TokenNamePLUS	
"/../sh"	TokenNameStringLiteral	/../sh
,	TokenNameCOMMA	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
jExecutable	TokenNameIdentifier	 j Executable
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
jExecutable	TokenNameIdentifier	 j Executable
=	TokenNameEQUAL	
findInDir	TokenNameIdentifier	 find In Dir
(	TokenNameLPAREN	
JAVA_HOME	TokenNameIdentifier	 JAVA  HOME
+	TokenNamePLUS	
"/../bin"	TokenNameStringLiteral	/../bin
,	TokenNameCOMMA	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
jExecutable	TokenNameIdentifier	 j Executable
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
jExecutable	TokenNameIdentifier	 j Executable
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// fall back to JRE bin directory, also catches JDK 1.0 and 1.1 	TokenNameCOMMENT_LINE	fall back to JRE bin directory, also catches JDK 1.0 and 1.1 
// where java.home points to the root of the JDK and Mac OS X where 	TokenNameCOMMENT_LINE	where java.home points to the root of the JDK and Mac OS X where 
// the whole directory layout is different from Sun's 	TokenNameCOMMENT_LINE	the whole directory layout is different from Sun's 
return	TokenNamereturn	
getJreExecutable	TokenNameIdentifier	 get Jre Executable
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds a system specific extension to the name of an executable. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Adds a system specific extension to the name of an executable. * @since Ant 1.5 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
addExtension	TokenNameIdentifier	 add Extension
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is the most common extension case - exe for windows and OS/2, 	TokenNameCOMMENT_LINE	This is the most common extension case - exe for windows and OS/2, 
// nothing for *nix. 	TokenNameCOMMENT_LINE	nothing for *nix. 
return	TokenNamereturn	
command	TokenNameIdentifier	 command
+	TokenNamePLUS	
(	TokenNameLPAREN	
IS_DOS	TokenNameIdentifier	 IS  DOS
?	TokenNameQUESTION	
".exe"	TokenNameStringLiteral	.exe
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look for an executable in a given directory. * * @return null if the executable cannot be found. */	TokenNameCOMMENT_JAVADOC	 Look for an executable in a given directory. * @return null if the executable cannot be found. 
private	TokenNameprivate	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
findInDir	TokenNameIdentifier	 find In Dir
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dirName	TokenNameIdentifier	 dir Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
commandName	TokenNameIdentifier	 command Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
dirName	TokenNameIdentifier	 dir Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
executable	TokenNameIdentifier	 executable
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executable	TokenNameIdentifier	 executable
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
addExtension	TokenNameIdentifier	 add Extension
(	TokenNameLPAREN	
commandName	TokenNameIdentifier	 command Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
executable	TokenNameIdentifier	 executable
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executable	TokenNameIdentifier	 executable
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
executable	TokenNameIdentifier	 executable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * demand creation of the package list. * When you add a new package, add a new test below. */	TokenNameCOMMENT_JAVADOC	 demand creation of the package list. When you add a new package, add a new test below. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
buildJrePackages	TokenNameIdentifier	 build Jre Packages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
jrePackages	TokenNameIdentifier	 jre Packages
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
javaVersionNumber	TokenNameIdentifier	 java Version Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
VERSION_1_8	TokenNameIdentifier	 VERSION 1 8
:	TokenNameCOLON	
case	TokenNamecase	
VERSION_1_7	TokenNameIdentifier	 VERSION 1 7
:	TokenNameCOLON	
case	TokenNamecase	
VERSION_1_6	TokenNameIdentifier	 VERSION 1 6
:	TokenNameCOLON	
case	TokenNamecase	
VERSION_1_5	TokenNameIdentifier	 VERSION 1 5
:	TokenNameCOLON	
//In Java1.5, the apache stuff moved. 	TokenNameCOMMENT_LINE	In Java1.5, the apache stuff moved. 
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"com.sun.org.apache"	TokenNameStringLiteral	com.sun.org.apache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//fall through. 	TokenNameCOMMENT_LINE	fall through. 
case	TokenNamecase	
VERSION_1_4	TokenNameIdentifier	 VERSION 1 4
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
javaVersionNumber	TokenNameIdentifier	 java Version Number
==	TokenNameEQUAL_EQUAL	
VERSION_1_4	TokenNameIdentifier	 VERSION 1 4
)	TokenNameRPAREN	
{	TokenNameLBRACE	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"org.apache.crimson"	TokenNameStringLiteral	org.apache.crimson
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"org.apache.xalan"	TokenNameStringLiteral	org.apache.xalan
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"org.apache.xml"	TokenNameStringLiteral	org.apache.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"org.apache.xpath"	TokenNameStringLiteral	org.apache.xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"org.ietf.jgss"	TokenNameStringLiteral	org.ietf.jgss
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"org.w3c.dom"	TokenNameStringLiteral	org.w3c.dom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"org.xml.sax"	TokenNameStringLiteral	org.xml.sax
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fall through 	TokenNameCOMMENT_LINE	fall through 
case	TokenNamecase	
VERSION_1_3	TokenNameIdentifier	 VERSION 1 3
:	TokenNameCOLON	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"org.omg"	TokenNameStringLiteral	org.omg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"com.sun.corba"	TokenNameStringLiteral	com.sun.corba
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"com.sun.jndi"	TokenNameStringLiteral	com.sun.jndi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"com.sun.media"	TokenNameStringLiteral	com.sun.media
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"com.sun.naming"	TokenNameStringLiteral	com.sun.naming
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"com.sun.org.omg"	TokenNameStringLiteral	com.sun.org.omg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"com.sun.rmi"	TokenNameStringLiteral	com.sun.rmi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"sunw.io"	TokenNameStringLiteral	sunw.io
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"sunw.util"	TokenNameStringLiteral	sunw.util
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fall through 	TokenNameCOMMENT_LINE	fall through 
case	TokenNamecase	
VERSION_1_2	TokenNameIdentifier	 VERSION 1 2
:	TokenNameCOLON	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"com.sun.java"	TokenNameStringLiteral	com.sun.java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"com.sun.image"	TokenNameStringLiteral	com.sun.image
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// are there any here that we forgot? 	TokenNameCOMMENT_LINE	are there any here that we forgot? 
// fall through 	TokenNameCOMMENT_LINE	fall through 
case	TokenNamecase	
VERSION_1_1	TokenNameIdentifier	 VERSION 1 1
:	TokenNameCOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
//things like sun.reflection, sun.misc, sun.net 	TokenNameCOMMENT_LINE	things like sun.reflection, sun.misc, sun.net 
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"sun"	TokenNameStringLiteral	sun
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"java"	TokenNameStringLiteral	java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jrePackages	TokenNameIdentifier	 jre Packages
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"javax"	TokenNameStringLiteral	javax
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Testing helper method; kept here for unification of changes. * @return a list of test classes depending on the java version. */	TokenNameCOMMENT_JAVADOC	 Testing helper method; kept here for unification of changes. @return a list of test classes depending on the java version. 
public	TokenNamepublic	
static	TokenNamestatic	
Vector	TokenNameIdentifier	 Vector
getJrePackageTestCases	TokenNameIdentifier	 get Jre Package Test Cases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
tests	TokenNameIdentifier	 tests
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"java.lang.Object"	TokenNameStringLiteral	java.lang.Object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
javaVersionNumber	TokenNameIdentifier	 java Version Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
VERSION_1_8	TokenNameIdentifier	 VERSION 1 8
:	TokenNameCOLON	
case	TokenNamecase	
VERSION_1_7	TokenNameIdentifier	 VERSION 1 7
:	TokenNameCOLON	
case	TokenNamecase	
VERSION_1_6	TokenNameIdentifier	 VERSION 1 6
:	TokenNameCOLON	
case	TokenNamecase	
VERSION_1_5	TokenNameIdentifier	 VERSION 1 5
:	TokenNameCOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl "	TokenNameStringLiteral	com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fall tru 	TokenNameCOMMENT_LINE	Fall tru 
case	TokenNamecase	
VERSION_1_4	TokenNameIdentifier	 VERSION 1 4
:	TokenNameCOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"sun.audio.AudioPlayer"	TokenNameStringLiteral	sun.audio.AudioPlayer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
javaVersionNumber	TokenNameIdentifier	 java Version Number
==	TokenNameEQUAL_EQUAL	
VERSION_1_4	TokenNameIdentifier	 VERSION 1 4
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"org.apache.crimson.parser.ContentModel"	TokenNameStringLiteral	org.apache.crimson.parser.ContentModel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"org.apache.xalan.processor.ProcessorImport"	TokenNameStringLiteral	org.apache.xalan.processor.ProcessorImport
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"org.apache.xml.utils.URI"	TokenNameStringLiteral	org.apache.xml.utils.URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"org.apache.xpath.XPathFactory"	TokenNameStringLiteral	org.apache.xpath.XPathFactory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"org.ietf.jgss.Oid"	TokenNameStringLiteral	org.ietf.jgss.Oid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"org.w3c.dom.Attr"	TokenNameStringLiteral	org.w3c.dom.Attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"org.xml.sax.XMLReader"	TokenNameStringLiteral	org.xml.sax.XMLReader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fall through 	TokenNameCOMMENT_LINE	fall through 
case	TokenNamecase	
VERSION_1_3	TokenNameIdentifier	 VERSION 1 3
:	TokenNameCOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"org.omg.CORBA.Any"	TokenNameStringLiteral	org.omg.CORBA.Any
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"com.sun.corba.se.internal.corba.AnyImpl"	TokenNameStringLiteral	com.sun.corba.se.internal.corba.AnyImpl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"com.sun.jndi.ldap.LdapURL"	TokenNameStringLiteral	com.sun.jndi.ldap.LdapURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"com.sun.media.sound.Printer"	TokenNameStringLiteral	com.sun.media.sound.Printer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"com.sun.naming.internal.VersionHelper"	TokenNameStringLiteral	com.sun.naming.internal.VersionHelper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"com.sun.org.omg.CORBA.Initializer"	TokenNameStringLiteral	com.sun.org.omg.CORBA.Initializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"sunw.io.Serializable"	TokenNameStringLiteral	sunw.io.Serializable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"sunw.util.EventListener"	TokenNameStringLiteral	sunw.util.EventListener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fall through 	TokenNameCOMMENT_LINE	fall through 
case	TokenNamecase	
VERSION_1_2	TokenNameIdentifier	 VERSION 1 2
:	TokenNameCOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"javax.accessibility.Accessible"	TokenNameStringLiteral	javax.accessibility.Accessible
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"sun.misc.BASE64Encoder"	TokenNameStringLiteral	sun.misc.BASE64Encoder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"com.sun.image.codec.jpeg.JPEGCodec"	TokenNameStringLiteral	com.sun.image.codec.jpeg.JPEGCodec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fall through 	TokenNameCOMMENT_LINE	fall through 
case	TokenNamecase	
VERSION_1_1	TokenNameIdentifier	 VERSION 1 1
:	TokenNameCOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
//things like sun.reflection, sun.misc, sun.net 	TokenNameCOMMENT_LINE	things like sun.reflection, sun.misc, sun.net 
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"sun.reflect.SerializationConstructorAccessorImpl"	TokenNameStringLiteral	sun.reflect.SerializationConstructorAccessorImpl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"sun.net.www.http.HttpClient"	TokenNameStringLiteral	sun.net.www.http.HttpClient
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"sun.audio.AudioPlayer"	TokenNameStringLiteral	sun.audio.AudioPlayer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tests	TokenNameIdentifier	 tests
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get a vector of strings of packages built into * that platforms runtime jar(s) * @return list of packages. */	TokenNameCOMMENT_JAVADOC	 get a vector of strings of packages built into that platforms runtime jar(s) @return list of packages. 
public	TokenNamepublic	
static	TokenNamestatic	
Vector	TokenNameIdentifier	 Vector
getJrePackages	TokenNameIdentifier	 get Jre Packages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
jrePackages	TokenNameIdentifier	 jre Packages
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buildJrePackages	TokenNameIdentifier	 build Jre Packages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
jrePackages	TokenNameIdentifier	 jre Packages
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * Writes the command into a temporary DCL script and returns the * corresponding File object. * It is the job of the caller to delete the file on exit. * @param cmd the command. * @return the file containing the command. * @throws IOException if there is an error writing to the file. */	TokenNameCOMMENT_JAVADOC	 * Writes the command into a temporary DCL script and returns the corresponding File object. It is the job of the caller to delete the file on exit. @param cmd the command. @return the file containing the command. @throws IOException if there is an error writing to the file. 
public	TokenNamepublic	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
createVmsJavaOptionFile	TokenNameIdentifier	 create Vms Java Option File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
script	TokenNameIdentifier	 script
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"ANT"	TokenNameStringLiteral	ANT
,	TokenNameCOMMA	
".JAVA_OPTS"	TokenNameStringLiteral	.JAVA_OPTS
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
(	TokenNameLPAREN	
new	TokenNamenew	
FileWriter	TokenNameIdentifier	 File Writer
(	TokenNameLPAREN	
script	TokenNameIdentifier	 script
)	TokenNameRPAREN	
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
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
newLine	TokenNameIdentifier	 new Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
script	TokenNameIdentifier	 script
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the value of ${java.home} * @return the java home value. */	TokenNameCOMMENT_JAVADOC	 Return the value of ${java.home} @return the java home value. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getJavaHome	TokenNameIdentifier	 get Java Home
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
JAVA_HOME	TokenNameIdentifier	 JAVA  HOME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
