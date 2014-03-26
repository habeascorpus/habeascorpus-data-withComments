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
launch	TokenNameIdentifier	 launch
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
URLClassLoader	TokenNameIdentifier	 URL Class Loader
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** * This is a launcher for Ant. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 This is a launcher for Ant. * @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
Launcher	TokenNameIdentifier	 Launcher
{	TokenNameLBRACE	
/** * The Ant Home (installation) Directory property. * {@value} */	TokenNameCOMMENT_JAVADOC	 The Ant Home (installation) Directory property. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANTHOME_PROPERTY	TokenNameIdentifier	 ANTHOME  PROPERTY
=	TokenNameEQUAL	
"ant.home"	TokenNameStringLiteral	ant.home
;	TokenNameSEMICOLON	
/** * The Ant Library Directory property. * {@value} */	TokenNameCOMMENT_JAVADOC	 The Ant Library Directory property. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANTLIBDIR_PROPERTY	TokenNameIdentifier	 ANTLIBDIR  PROPERTY
=	TokenNameEQUAL	
"ant.library.dir"	TokenNameStringLiteral	ant.library.dir
;	TokenNameSEMICOLON	
/** * The directory name of the per-user ant directory. * {@value} */	TokenNameCOMMENT_JAVADOC	 The directory name of the per-user ant directory. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANT_PRIVATEDIR	TokenNameIdentifier	 ANT  PRIVATEDIR
=	TokenNameEQUAL	
".ant"	TokenNameStringLiteral	.ant
;	TokenNameSEMICOLON	
/** * The name of a per-user library directory. * {@value} */	TokenNameCOMMENT_JAVADOC	 The name of a per-user library directory. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANT_PRIVATELIB	TokenNameIdentifier	 ANT  PRIVATELIB
=	TokenNameEQUAL	
"lib"	TokenNameStringLiteral	lib
;	TokenNameSEMICOLON	
/** * launch diagnostics flag; for debugging trouble at launch time. */	TokenNameCOMMENT_JAVADOC	 launch diagnostics flag; for debugging trouble at launch time. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
launchDiag	TokenNameIdentifier	 launch Diag
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The location of a per-user library directory. * <p> * It's value is the concatenation of {@link #ANT_PRIVATEDIR} * with {@link #ANT_PRIVATELIB}, with an appropriate file separator * in between. For example, on Unix, it's <code>.ant/lib</code>. */	TokenNameCOMMENT_JAVADOC	 The location of a per-user library directory. <p> It's value is the concatenation of {@link #ANT_PRIVATEDIR} with {@link #ANT_PRIVATELIB}, with an appropriate file separator in between. For example, on Unix, it's <code>.ant/lib</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USER_LIBDIR	TokenNameIdentifier	 USER  LIBDIR
=	TokenNameEQUAL	
ANT_PRIVATEDIR	TokenNameIdentifier	 ANT  PRIVATEDIR
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
+	TokenNamePLUS	
ANT_PRIVATELIB	TokenNameIdentifier	 ANT  PRIVATELIB
;	TokenNameSEMICOLON	
/** * The startup class that is to be run. * {@value} */	TokenNameCOMMENT_JAVADOC	 The startup class that is to be run. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MAIN_CLASS	TokenNameIdentifier	 MAIN  CLASS
=	TokenNameEQUAL	
"org.apache.tools.ant.Main"	TokenNameStringLiteral	org.apache.tools.ant.Main
;	TokenNameSEMICOLON	
/** * System property with user home directory. * {@value} */	TokenNameCOMMENT_JAVADOC	 System property with user home directory. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USER_HOMEDIR	TokenNameIdentifier	 USER  HOMEDIR
=	TokenNameEQUAL	
"user.home"	TokenNameStringLiteral	user.home
;	TokenNameSEMICOLON	
/** * System property with application classpath. * {@value} */	TokenNameCOMMENT_JAVADOC	 System property with application classpath. {@value} 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVA_CLASS_PATH	TokenNameIdentifier	 JAVA  CLASS  PATH
=	TokenNameEQUAL	
"java.class.path"	TokenNameStringLiteral	java.class.path
;	TokenNameSEMICOLON	
/** * Exit code on trouble */	TokenNameCOMMENT_JAVADOC	 Exit code on trouble 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EXIT_CODE_ERROR	TokenNameIdentifier	 EXIT  CODE  ERROR
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Entry point for starting command line Ant. * * @param args commandline arguments */	TokenNameCOMMENT_JAVADOC	 Entry point for starting command line Ant. * @param args commandline arguments 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
exitCode	TokenNameIdentifier	 exit Code
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Launcher	TokenNameIdentifier	 Launcher
launcher	TokenNameIdentifier	 launcher
=	TokenNameEQUAL	
new	TokenNamenew	
Launcher	TokenNameIdentifier	 Launcher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exitCode	TokenNameIdentifier	 exit Code
=	TokenNameEQUAL	
launcher	TokenNameIdentifier	 launcher
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
LaunchException	TokenNameIdentifier	 Launch Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exitCode	TokenNameIdentifier	 exit Code
=	TokenNameEQUAL	
EXIT_CODE_ERROR	TokenNameIdentifier	 EXIT  CODE  ERROR
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exitCode	TokenNameIdentifier	 exit Code
=	TokenNameEQUAL	
EXIT_CODE_ERROR	TokenNameIdentifier	 EXIT  CODE  ERROR
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
exitCode	TokenNameIdentifier	 exit Code
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
launchDiag	TokenNameIdentifier	 launch Diag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Exit code: "	TokenNameStringLiteral	Exit code: 
+	TokenNamePLUS	
exitCode	TokenNameIdentifier	 exit Code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
exitCode	TokenNameIdentifier	 exit Code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add a CLASSPATH or -lib to lib path urls. * Only filesystem resources are supported. * * @param path the classpath or lib path to add to the libPathULRLs * @param getJars if true and a path is a directory, add the jars in * the directory to the path urls * @param libPathURLs the list of paths to add to * @throws MalformedURLException if we can't create a URL */	TokenNameCOMMENT_JAVADOC	 Add a CLASSPATH or -lib to lib path urls. Only filesystem resources are supported. * @param path the classpath or lib path to add to the libPathULRLs @param getJars if true and a path is a directory, add the jars in the directory to the path urls @param libPathURLs the list of paths to add to @throws MalformedURLException if we can't create a URL 
private	TokenNameprivate	
void	TokenNamevoid	
addPath	TokenNameIdentifier	 add Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
boolean	TokenNameboolean	
getJars	TokenNameIdentifier	 get Jars
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
libPathURLs	TokenNameIdentifier	 lib Path UR Ls
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparator	TokenNameIdentifier	 path Separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
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
getJars	TokenNameIdentifier	 get Jars
&&	TokenNameAND_AND	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// add any jars in the directory 	TokenNameCOMMENT_LINE	add any jars in the directory 
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dirURLs	TokenNameIdentifier	 dir UR Ls
=	TokenNameEQUAL	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
getLocationURLs	TokenNameIdentifier	 get Location UR Ls
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
dirURLs	TokenNameIdentifier	 dir UR Ls
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
launchDiag	TokenNameIdentifier	 launch Diag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"adding library JAR: "	TokenNameStringLiteral	adding library JAR: 
+	TokenNamePLUS	
dirURLs	TokenNameIdentifier	 dir UR Ls
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
libPathURLs	TokenNameIdentifier	 lib Path UR Ls
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dirURLs	TokenNameIdentifier	 dir UR Ls
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
fileToURL	TokenNameIdentifier	 file To URL
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
launchDiag	TokenNameIdentifier	 launch Diag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"adding library URL: "	TokenNameStringLiteral	adding library URL: 
+	TokenNamePLUS	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
libPathURLs	TokenNameIdentifier	 lib Path UR Ls
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Run the launcher to launch Ant. * * @param args the command line arguments * @return an exit code. As the normal ant main calls exit when it ends, * this is for handling failures at bind-time * @throws MalformedURLException if the URLs required for the classloader * cannot be created. * @throws LaunchException for launching problems */	TokenNameCOMMENT_JAVADOC	 Run the launcher to launch Ant. * @param args the command line arguments @return an exit code. As the normal ant main calls exit when it ends, this is for handling failures at bind-time @throws MalformedURLException if the URLs required for the classloader cannot be created. @throws LaunchException for launching problems 
private	TokenNameprivate	
int	TokenNameint	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
LaunchException	TokenNameIdentifier	 Launch Exception
,	TokenNameCOMMA	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
antHomeProperty	TokenNameIdentifier	 ant Home Property
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
ANTHOME_PROPERTY	TokenNameIdentifier	 ANTHOME  PROPERTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
antHome	TokenNameIdentifier	 ant Home
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
sourceJar	TokenNameIdentifier	 source Jar
=	TokenNameEQUAL	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
getClassSource	TokenNameIdentifier	 get Class Source
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
jarDir	TokenNameIdentifier	 jar Dir
=	TokenNameEQUAL	
sourceJar	TokenNameIdentifier	 source Jar
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
mainClassname	TokenNameIdentifier	 main Classname
=	TokenNameEQUAL	
MAIN_CLASS	TokenNameIdentifier	 MAIN  CLASS
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
antHomeProperty	TokenNameIdentifier	 ant Home Property
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
antHome	TokenNameIdentifier	 ant Home
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
antHomeProperty	TokenNameIdentifier	 ant Home Property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
antHome	TokenNameIdentifier	 ant Home
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
antHome	TokenNameIdentifier	 ant Home
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
antHome	TokenNameIdentifier	 ant Home
=	TokenNameEQUAL	
jarDir	TokenNameIdentifier	 jar Dir
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
ANTHOME_PROPERTY	TokenNameIdentifier	 ANTHOME  PROPERTY
,	TokenNameCOMMA	
antHome	TokenNameIdentifier	 ant Home
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
antHome	TokenNameIdentifier	 ant Home
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
LaunchException	TokenNameIdentifier	 Launch Exception
(	TokenNameLPAREN	
"Ant home is set incorrectly or "	TokenNameStringLiteral	Ant home is set incorrectly or 
+	TokenNamePLUS	
"ant could not be located (estimated value="	TokenNameStringLiteral	ant could not be located (estimated value=
+	TokenNamePLUS	
antHome	TokenNameIdentifier	 ant Home
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
libPaths	TokenNameIdentifier	 lib Paths
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
cpString	TokenNameIdentifier	 cp String
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
argList	TokenNameIdentifier	 arg List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArgs	TokenNameIdentifier	 new Args
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
noUserLib	TokenNameIdentifier	 no User Lib
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
noClassPath	TokenNameIdentifier	 no Class Path
=	TokenNameEQUAL	
false	TokenNamefalse	
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
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-lib"	TokenNameStringLiteral	-lib
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
LaunchException	TokenNameIdentifier	 Launch Exception
(	TokenNameLPAREN	
"The -lib argument must "	TokenNameStringLiteral	The -lib argument must 
+	TokenNamePLUS	
"be followed by a library location"	TokenNameStringLiteral	be followed by a library location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
libPaths	TokenNameIdentifier	 lib Paths
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-cp"	TokenNameStringLiteral	-cp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
LaunchException	TokenNameIdentifier	 Launch Exception
(	TokenNameLPAREN	
"The -cp argument must "	TokenNameStringLiteral	The -cp argument must 
+	TokenNamePLUS	
"be followed by a classpath expression"	TokenNameStringLiteral	be followed by a classpath expression
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cpString	TokenNameIdentifier	 cp String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
LaunchException	TokenNameIdentifier	 Launch Exception
(	TokenNameLPAREN	
"The -cp argument must "	TokenNameStringLiteral	The -cp argument must 
+	TokenNamePLUS	
"not be repeated"	TokenNameStringLiteral	not be repeated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cpString	TokenNameIdentifier	 cp String
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"--nouserlib"	TokenNameStringLiteral	--nouserlib
)	TokenNameRPAREN	
||	TokenNameOR_OR	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-nouserlib"	TokenNameStringLiteral	-nouserlib
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
noUserLib	TokenNameIdentifier	 no User Lib
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"--launchdiag"	TokenNameStringLiteral	--launchdiag
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
launchDiag	TokenNameIdentifier	 launch Diag
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"--noclasspath"	TokenNameStringLiteral	--noclasspath
)	TokenNameRPAREN	
||	TokenNameOR_OR	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-noclasspath"	TokenNameStringLiteral	-noclasspath
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
noClassPath	TokenNameIdentifier	 no Class Path
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-main"	TokenNameStringLiteral	-main
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
LaunchException	TokenNameIdentifier	 Launch Exception
(	TokenNameLPAREN	
"The -main argument must "	TokenNameStringLiteral	The -main argument must 
+	TokenNamePLUS	
"be followed by a library location"	TokenNameStringLiteral	be followed by a library location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mainClassname	TokenNameIdentifier	 main Classname
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
argList	TokenNameIdentifier	 arg List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
logPath	TokenNameIdentifier	 log Path
(	TokenNameLPAREN	
"Launcher JAR"	TokenNameStringLiteral	Launcher JAR
,	TokenNameCOMMA	
sourceJar	TokenNameIdentifier	 source Jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logPath	TokenNameIdentifier	 log Path
(	TokenNameLPAREN	
"Launcher JAR directory"	TokenNameStringLiteral	Launcher JAR directory
,	TokenNameCOMMA	
sourceJar	TokenNameIdentifier	 source Jar
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logPath	TokenNameIdentifier	 log Path
(	TokenNameLPAREN	
"java.home"	TokenNameStringLiteral	java.home
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.home"	TokenNameStringLiteral	java.home
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//decide whether to copy the existing arg set, or 	TokenNameCOMMENT_LINE	decide whether to copy the existing arg set, or 
//build a new one from the list of all args excluding the special 	TokenNameCOMMENT_LINE	build a new one from the list of all args excluding the special 
//operations that only we handle 	TokenNameCOMMENT_LINE	operations that only we handle 
if	TokenNameif	
(	TokenNameLPAREN	
argList	TokenNameIdentifier	 arg List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newArgs	TokenNameIdentifier	 new Args
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newArgs	TokenNameIdentifier	 new Args
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
argList	TokenNameIdentifier	 arg List
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
argList	TokenNameIdentifier	 arg List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
libURLs	TokenNameIdentifier	 lib UR Ls
=	TokenNameEQUAL	
getLibPathURLs	TokenNameIdentifier	 get Lib Path UR Ls
(	TokenNameLPAREN	
noClassPath	TokenNameIdentifier	 no Class Path
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
cpString	TokenNameIdentifier	 cp String
,	TokenNameCOMMA	
libPaths	TokenNameIdentifier	 lib Paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
systemURLs	TokenNameIdentifier	 system UR Ls
=	TokenNameEQUAL	
getSystemURLs	TokenNameIdentifier	 get System UR Ls
(	TokenNameLPAREN	
jarDir	TokenNameIdentifier	 jar Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
userURLs	TokenNameIdentifier	 user UR Ls
=	TokenNameEQUAL	
noUserLib	TokenNameIdentifier	 no User Lib
?	TokenNameQUESTION	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
:	TokenNameCOLON	
getUserURLs	TokenNameIdentifier	 get User UR Ls
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
toolsJAR	TokenNameIdentifier	 tools JAR
=	TokenNameEQUAL	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
getToolsJar	TokenNameIdentifier	 get Tools Jar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logPath	TokenNameIdentifier	 log Path
(	TokenNameLPAREN	
"tools.jar"	TokenNameStringLiteral	tools.jar
,	TokenNameCOMMA	
toolsJAR	TokenNameIdentifier	 tools JAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
jars	TokenNameIdentifier	 jars
=	TokenNameEQUAL	
getJarArray	TokenNameIdentifier	 get Jar Array
(	TokenNameLPAREN	
libURLs	TokenNameIdentifier	 lib UR Ls
,	TokenNameCOMMA	
userURLs	TokenNameIdentifier	 user UR Ls
,	TokenNameCOMMA	
systemURLs	TokenNameIdentifier	 system UR Ls
,	TokenNameCOMMA	
toolsJAR	TokenNameIdentifier	 tools JAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now update the class.path property 	TokenNameCOMMENT_LINE	now update the class.path property 
StringBuffer	TokenNameIdentifier	 String Buffer
baseClassPath	TokenNameIdentifier	 base Class Path
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
JAVA_CLASS_PATH	TokenNameIdentifier	 JAVA  CLASS  PATH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseClassPath	TokenNameIdentifier	 base Class Path
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
baseClassPath	TokenNameIdentifier	 base Class Path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparatorChar	TokenNameIdentifier	 path Separator Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseClassPath	TokenNameIdentifier	 base Class Path
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
baseClassPath	TokenNameIdentifier	 base Class Path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
jars	TokenNameIdentifier	 jars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseClassPath	TokenNameIdentifier	 base Class Path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparatorChar	TokenNameIdentifier	 path Separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
baseClassPath	TokenNameIdentifier	 base Class Path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
fromURI	TokenNameIdentifier	 from URI
(	TokenNameLPAREN	
jars	TokenNameIdentifier	 jars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
JAVA_CLASS_PATH	TokenNameIdentifier	 JAVA  CLASS  PATH
,	TokenNameCOMMA	
baseClassPath	TokenNameIdentifier	 base Class Path
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URLClassLoader	TokenNameIdentifier	 URL Class Loader
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
new	TokenNamenew	
URLClassLoader	TokenNameIdentifier	 URL Class Loader
(	TokenNameLPAREN	
jars	TokenNameIdentifier	 jars
,	TokenNameCOMMA	
Launcher	TokenNameIdentifier	 Launcher
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setContextClassLoader	TokenNameIdentifier	 set Context Class Loader
(	TokenNameLPAREN	
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
mainClass	TokenNameIdentifier	 main Class
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
exitCode	TokenNameIdentifier	 exit Code
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Throwable	TokenNameIdentifier	 Throwable
thrown	TokenNameIdentifier	 thrown
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
mainClass	TokenNameIdentifier	 main Class
=	TokenNameEQUAL	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
mainClassname	TokenNameIdentifier	 main Classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AntMain	TokenNameIdentifier	 Ant Main
main	TokenNameIdentifier	 main
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AntMain	TokenNameIdentifier	 Ant Main
)	TokenNameRPAREN	
mainClass	TokenNameIdentifier	 main Class
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
main	TokenNameIdentifier	 main
.	TokenNameDOT	
startAnt	TokenNameIdentifier	 start Ant
(	TokenNameLPAREN	
newArgs	TokenNameIdentifier	 new Args
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Incompatible version of "	TokenNameStringLiteral	Incompatible version of 
+	TokenNamePLUS	
mainClassname	TokenNameIdentifier	 main Classname
+	TokenNamePLUS	
" detected"	TokenNameStringLiteral	 detected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
mainJar	TokenNameIdentifier	 main Jar
=	TokenNameEQUAL	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
getClassSource	TokenNameIdentifier	 get Class Source
(	TokenNameLPAREN	
mainClass	TokenNameIdentifier	 main Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Location of this class "	TokenNameStringLiteral	Location of this class 
+	TokenNamePLUS	
mainJar	TokenNameIdentifier	 main Jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
thrown	TokenNameIdentifier	 thrown
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Failed to locate"	TokenNameStringLiteral	Failed to locate
+	TokenNamePLUS	
mainClassname	TokenNameIdentifier	 main Classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
thrown	TokenNameIdentifier	 thrown
=	TokenNameEQUAL	
cnfe	TokenNameIdentifier	 cnfe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
thrown	TokenNameIdentifier	 thrown
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
thrown	TokenNameIdentifier	 thrown
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
ANTHOME_PROPERTY	TokenNameIdentifier	 ANTHOME  PROPERTY
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
antHome	TokenNameIdentifier	 ant Home
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Classpath: "	TokenNameStringLiteral	Classpath: 
+	TokenNamePLUS	
baseClassPath	TokenNameIdentifier	 base Class Path
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Launcher JAR: "	TokenNameStringLiteral	Launcher JAR: 
+	TokenNamePLUS	
sourceJar	TokenNameIdentifier	 source Jar
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Launcher Directory: "	TokenNameStringLiteral	Launcher Directory: 
+	TokenNamePLUS	
jarDir	TokenNameIdentifier	 jar Dir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exitCode	TokenNameIdentifier	 exit Code
=	TokenNameEQUAL	
EXIT_CODE_ERROR	TokenNameIdentifier	 EXIT  CODE  ERROR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
exitCode	TokenNameIdentifier	 exit Code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the list of -lib entries and -cp entry into * a URL array. * @param cpString the classpath string * @param libPaths the list of -lib entries. * @return an array of URLs. * @throws MalformedURLException if the URLs cannot be created. */	TokenNameCOMMENT_JAVADOC	 Get the list of -lib entries and -cp entry into a URL array. @param cpString the classpath string @param libPaths the list of -lib entries. @return an array of URLs. @throws MalformedURLException if the URLs cannot be created. 
private	TokenNameprivate	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLibPathURLs	TokenNameIdentifier	 get Lib Path UR Ls
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cpString	TokenNameIdentifier	 cp String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
libPaths	TokenNameIdentifier	 lib Paths
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
libPathURLs	TokenNameIdentifier	 lib Path UR Ls
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cpString	TokenNameIdentifier	 cp String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addPath	TokenNameIdentifier	 add Path
(	TokenNameLPAREN	
cpString	TokenNameIdentifier	 cp String
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
libPathURLs	TokenNameIdentifier	 lib Path UR Ls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
libPaths	TokenNameIdentifier	 lib Paths
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
libPath	TokenNameIdentifier	 lib Path
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
addPath	TokenNameIdentifier	 add Path
(	TokenNameLPAREN	
libPath	TokenNameIdentifier	 lib Path
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
libPathURLs	TokenNameIdentifier	 lib Path UR Ls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
libPathURLs	TokenNameIdentifier	 lib Path UR Ls
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
libPathURLs	TokenNameIdentifier	 lib Path UR Ls
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the jar files in ANT_HOME/lib. * determine ant library directory for system jars: use property * or default using location of ant-launcher.jar * @param antLauncherDir the dir that ant-launcher ran from * @return the URLs * @throws MalformedURLException if the URLs cannot be created. */	TokenNameCOMMENT_JAVADOC	 Get the jar files in ANT_HOME/lib. determine ant library directory for system jars: use property or default using location of ant-launcher.jar @param antLauncherDir the dir that ant-launcher ran from @return the URLs @throws MalformedURLException if the URLs cannot be created. 
private	TokenNameprivate	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSystemURLs	TokenNameIdentifier	 get System UR Ls
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
antLauncherDir	TokenNameIdentifier	 ant Launcher Dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
antLibDir	TokenNameIdentifier	 ant Lib Dir
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
antLibDirProperty	TokenNameIdentifier	 ant Lib Dir Property
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
ANTLIBDIR_PROPERTY	TokenNameIdentifier	 ANTLIBDIR  PROPERTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
antLibDirProperty	TokenNameIdentifier	 ant Lib Dir Property
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
antLibDir	TokenNameIdentifier	 ant Lib Dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
antLibDirProperty	TokenNameIdentifier	 ant Lib Dir Property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
antLibDir	TokenNameIdentifier	 ant Lib Dir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
antLibDir	TokenNameIdentifier	 ant Lib Dir
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
antLibDir	TokenNameIdentifier	 ant Lib Dir
=	TokenNameEQUAL	
antLauncherDir	TokenNameIdentifier	 ant Launcher Dir
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
ANTLIBDIR_PROPERTY	TokenNameIdentifier	 ANTLIBDIR  PROPERTY
,	TokenNameCOMMA	
antLibDir	TokenNameIdentifier	 ant Lib Dir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
getLocationURLs	TokenNameIdentifier	 get Location UR Ls
(	TokenNameLPAREN	
antLibDir	TokenNameIdentifier	 ant Lib Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the jar files in user.home/.ant/lib * @return the URLS from the user's lib dir * @throws MalformedURLException if the URLs cannot be created. */	TokenNameCOMMENT_JAVADOC	 Get the jar files in user.home/.ant/lib @return the URLS from the user's lib dir @throws MalformedURLException if the URLs cannot be created. 
private	TokenNameprivate	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getUserURLs	TokenNameIdentifier	 get User UR Ls
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
userLibDir	TokenNameIdentifier	 user Lib Dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
USER_HOMEDIR	TokenNameIdentifier	 USER  HOMEDIR
)	TokenNameRPAREN	
,	TokenNameCOMMA	
USER_LIBDIR	TokenNameIdentifier	 USER  LIBDIR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
getLocationURLs	TokenNameIdentifier	 get Location UR Ls
(	TokenNameLPAREN	
userLibDir	TokenNameIdentifier	 user Lib Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Combine the various jar sources into a single array of jars. * @param libJars the jars specified in -lib command line options * @param userJars the jars in ~/.ant/lib * @param systemJars the jars in $ANT_HOME/lib * @param toolsJar the tools.jar file * @return a combined array * @throws MalformedURLException if there is a problem. */	TokenNameCOMMENT_JAVADOC	 Combine the various jar sources into a single array of jars. @param libJars the jars specified in -lib command line options @param userJars the jars in ~/.ant/lib @param systemJars the jars in $ANT_HOME/lib @param toolsJar the tools.jar file @return a combined array @throws MalformedURLException if there is a problem. 
private	TokenNameprivate	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getJarArray	TokenNameIdentifier	 get Jar Array
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
libJars	TokenNameIdentifier	 lib Jars
,	TokenNameCOMMA	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
userJars	TokenNameIdentifier	 user Jars
,	TokenNameCOMMA	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
systemJars	TokenNameIdentifier	 system Jars
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
toolsJar	TokenNameIdentifier	 tools Jar
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
{	TokenNameLBRACE	
int	TokenNameint	
numJars	TokenNameIdentifier	 num Jars
=	TokenNameEQUAL	
libJars	TokenNameIdentifier	 lib Jars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
userJars	TokenNameIdentifier	 user Jars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
systemJars	TokenNameIdentifier	 system Jars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
toolsJar	TokenNameIdentifier	 tools Jar
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numJars	TokenNameIdentifier	 num Jars
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
jars	TokenNameIdentifier	 jars
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
numJars	TokenNameIdentifier	 num Jars
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
libJars	TokenNameIdentifier	 lib Jars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
jars	TokenNameIdentifier	 jars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
libJars	TokenNameIdentifier	 lib Jars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
userJars	TokenNameIdentifier	 user Jars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
jars	TokenNameIdentifier	 jars
,	TokenNameCOMMA	
libJars	TokenNameIdentifier	 lib Jars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
userJars	TokenNameIdentifier	 user Jars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
systemJars	TokenNameIdentifier	 system Jars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
jars	TokenNameIdentifier	 jars
,	TokenNameCOMMA	
userJars	TokenNameIdentifier	 user Jars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
libJars	TokenNameIdentifier	 lib Jars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
systemJars	TokenNameIdentifier	 system Jars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
toolsJar	TokenNameIdentifier	 tools Jar
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
jars	TokenNameIdentifier	 jars
[	TokenNameLBRACKET	
jars	TokenNameIdentifier	 jars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
fileToURL	TokenNameIdentifier	 file To URL
(	TokenNameLPAREN	
toolsJar	TokenNameIdentifier	 tools Jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
jars	TokenNameIdentifier	 jars
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set a system property, optionally log what is going on * @param name property name * @param value value */	TokenNameCOMMENT_JAVADOC	 set a system property, optionally log what is going on @param name property name @param value value 
private	TokenNameprivate	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
launchDiag	TokenNameIdentifier	 launch Diag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Setting ""	TokenNameStringLiteral	Setting "
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"" to ""	TokenNameStringLiteral	" to "
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
logPath	TokenNameIdentifier	 log Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
launchDiag	TokenNameIdentifier	 launch Diag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"= ""	TokenNameStringLiteral	= "
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
