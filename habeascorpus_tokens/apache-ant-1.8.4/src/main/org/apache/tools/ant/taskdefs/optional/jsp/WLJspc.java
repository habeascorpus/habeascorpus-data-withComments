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
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
jsp	TokenNameIdentifier	 jsp
;	TokenNameSEMICOLON	
//apache/ant imports 	TokenNameCOMMENT_LINE	apache/ant imports 
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
Date	TokenNameIdentifier	 Date
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
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
Java	TokenNameIdentifier	 Java
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
MatchingTask	TokenNameIdentifier	 Matching Task
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
/** * Precompiles JSP's using WebLogic's JSP compiler (weblogic.jspc). * * Tested only on Weblogic 4.5.1 - NT4.0 and Solaris 5.7 * * required attributes * src : root of source tree for JSP, ie, the document root for your weblogic server * dest : root of destination directory, what you have set as * WorkingDir in the weblogic properties * package : start package name under which your JSP's would be compiled * * other attributes * classpath * * A classpath should be set which contains the weblogic classes as well as all * application classes referenced by the JSP. The system classpath is also * appended when the jspc is called, so you may choose to put everything in * the classpath while calling Ant. However, since presumably the JSP's will * reference classes being build by Ant, it would be better to explicitly add * the classpath in the task * * The task checks timestamps on the JSP's and the generated classes, and compiles * only those files that have changed. * * It follows the weblogic naming convention of putting classes in * <b> _dirName/_fileName.class for dirname/fileName.jsp </b> * * Limitation: It compiles the files thru the Classic compiler only. * Limitation: Since it is my experience that weblogic jspc throws out of * memory error on being given too many files at one go, it is * called multiple times with one jsp file each. * * <pre> * example * &lt;target name="jspcompile" depends="compile"&gt; * &lt;wljspc src="c:\\weblogic\\myserver\\public_html" * dest="c:\\weblogic\\myserver\\serverclasses" package="myapp.jsp"&gt; * &lt;classpath&gt; * &lt;pathelement location="${weblogic.classpath}" /&gt; * &lt;pathelement path="${compile.dest}" /&gt; * &lt;/classpath&gt; * * &lt;/wljspc&gt; * &lt;/target&gt; * </pre> * */	TokenNameCOMMENT_JAVADOC	 Precompiles JSP's using WebLogic's JSP compiler (weblogic.jspc). * Tested only on Weblogic 4.5.1 - NT4.0 and Solaris 5.7 * required attributes src : root of source tree for JSP, ie, the document root for your weblogic server dest : root of destination directory, what you have set as WorkingDir in the weblogic properties package : start package name under which your JSP's would be compiled * other attributes classpath * A classpath should be set which contains the weblogic classes as well as all application classes referenced by the JSP. The system classpath is also appended when the jspc is called, so you may choose to put everything in the classpath while calling Ant. However, since presumably the JSP's will reference classes being build by Ant, it would be better to explicitly add the classpath in the task * The task checks timestamps on the JSP's and the generated classes, and compiles only those files that have changed. * It follows the weblogic naming convention of putting classes in <b> _dirName/_fileName.class for dirname/fileName.jsp </b> * Limitation: It compiles the files thru the Classic compiler only. Limitation: Since it is my experience that weblogic jspc throws out of memory error on being given too many files at one go, it is called multiple times with one jsp file each. * <pre> example &lt;target name="jspcompile" depends="compile"&gt; &lt;wljspc src="c:\\weblogic\\myserver\\public_html" dest="c:\\weblogic\\myserver\\serverclasses" package="myapp.jsp"&gt; &lt;classpath&gt; &lt;pathelement location="${weblogic.classpath}" /&gt; &lt;pathelement path="${compile.dest}" /&gt; &lt;/classpath&gt; * &lt;/wljspc&gt; &lt;/target&gt; </pre> 
public	TokenNamepublic	
class	TokenNameclass	
WLJspc	TokenNameIdentifier	 WL Jspc
extends	TokenNameextends	
MatchingTask	TokenNameIdentifier	 Matching Task
{	TokenNameLBRACE	
//TODO Test on other versions of weblogic 	TokenNameCOMMENT_LINE	TODO Test on other versions of weblogic 
//TODO add more attributes to the task, to take care of all jspc options 	TokenNameCOMMENT_LINE	TODO add more attributes to the task, to take care of all jspc options 
//TODO Test on Unix 	TokenNameCOMMENT_LINE	TODO Test on Unix 
/** root of compiled files tree */	TokenNameCOMMENT_JAVADOC	 root of compiled files tree 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
destinationDirectory	TokenNameIdentifier	 destination Directory
;	TokenNameSEMICOLON	
/** root of source files tree */	TokenNameCOMMENT_JAVADOC	 root of source files tree 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
sourceDirectory	TokenNameIdentifier	 source Directory
;	TokenNameSEMICOLON	
/** package under which resultant classes will reside */	TokenNameCOMMENT_JAVADOC	 package under which resultant classes will reside 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
destinationPackage	TokenNameIdentifier	 destination Package
;	TokenNameSEMICOLON	
/** classpath used to compile the jsp files. */	TokenNameCOMMENT_JAVADOC	 classpath used to compile the jsp files. 
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
compileClasspath	TokenNameIdentifier	 compile Classpath
;	TokenNameSEMICOLON	
//private String compilerPath; //fully qualified name for the compiler executable 	TokenNameCOMMENT_LINE	private String compilerPath; //fully qualified name for the compiler executable 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
pathToPackage	TokenNameIdentifier	 path To Package
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
filesToDo	TokenNameIdentifier	 files To Do
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Run the task. * @throws BuildException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Run the task. @throws BuildException if there is an error. 
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
!	TokenNameNOT	
destinationDirectory	TokenNameIdentifier	 destination Directory
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"destination directory "	TokenNameStringLiteral	destination directory 
+	TokenNamePLUS	
destinationDirectory	TokenNameIdentifier	 destination Directory
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" is not valid"	TokenNameStringLiteral	 is not valid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
sourceDirectory	TokenNameIdentifier	 source Directory
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"src directory "	TokenNameStringLiteral	src directory 
+	TokenNamePLUS	
sourceDirectory	TokenNameIdentifier	 source Directory
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" is not valid"	TokenNameStringLiteral	 is not valid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
destinationPackage	TokenNameIdentifier	 destination Package
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"package attribute must be present."	TokenNameStringLiteral	package attribute must be present.
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pathToPackage	TokenNameIdentifier	 path To Package
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
destinationPackage	TokenNameIdentifier	 destination Package
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get all the files in the sourceDirectory 	TokenNameCOMMENT_LINE	get all the files in the sourceDirectory 
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getDirectoryScanner	TokenNameIdentifier	 get Directory Scanner
(	TokenNameLPAREN	
sourceDirectory	TokenNameIdentifier	 source Directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//use the systemclasspath as well, to include the ant jar 	TokenNameCOMMENT_LINE	use the systemclasspath as well, to include the ant jar 
if	TokenNameif	
(	TokenNameLPAREN	
compileClasspath	TokenNameIdentifier	 compile Classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
compileClasspath	TokenNameIdentifier	 compile Classpath
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
compileClasspath	TokenNameIdentifier	 compile Classpath
=	TokenNameEQUAL	
compileClasspath	TokenNameIdentifier	 compile Classpath
.	TokenNameDOT	
concatSystemClasspath	TokenNameIdentifier	 concat System Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getIncludedFiles	TokenNameIdentifier	 get Included Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Weblogic.jspc calls System.exit() ... have to fork 	TokenNameCOMMENT_LINE	Weblogic.jspc calls System.exit() ... have to fork 
// Therefore, takes loads of time 	TokenNameCOMMENT_LINE	Therefore, takes loads of time 
// Can pass directories at a time (*.jsp) but easily runs out of 	TokenNameCOMMENT_LINE	Can pass directories at a time (*.jsp) but easily runs out of 
// memory on hefty dirs (even on a Sun) 	TokenNameCOMMENT_LINE	memory on hefty dirs (even on a Sun) 
Java	TokenNameIdentifier	 Java
helperTask	TokenNameIdentifier	 helper Task
=	TokenNameEQUAL	
new	TokenNamenew	
Java	TokenNameIdentifier	 Java
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
helperTask	TokenNameIdentifier	 helper Task
.	TokenNameDOT	
setFork	TokenNameIdentifier	 set Fork
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
helperTask	TokenNameIdentifier	 helper Task
.	TokenNameDOT	
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
"weblogic.jspc"	TokenNameStringLiteral	weblogic.jspc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
helperTask	TokenNameIdentifier	 helper Task
.	TokenNameDOT	
setTaskName	TokenNameIdentifier	 set Task Name
(	TokenNameLPAREN	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
12	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
File	TokenNameIdentifier	 File
jspFile	TokenNameIdentifier	 jsp File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
parents	TokenNameIdentifier	 parents
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//XXX this array stuff is a remnant of prev trials.. gotta remove. 	TokenNameCOMMENT_LINE	XXX this array stuff is a remnant of prev trials.. gotta remove. 
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
"-d"	TokenNameStringLiteral	-d
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
destinationDirectory	TokenNameIdentifier	 destination Directory
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
"-docroot"	TokenNameStringLiteral	-docroot
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sourceDirectory	TokenNameIdentifier	 source Directory
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
"-keepgenerated"	TokenNameStringLiteral	-keepgenerated
;	TokenNameSEMICOLON	
//Call compiler as class... dont want to fork again 	TokenNameCOMMENT_LINE	Call compiler as class... dont want to fork again 
//Use classic compiler -- can be parameterised? 	TokenNameCOMMENT_LINE	Use classic compiler -- can be parameterised? 
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
"-compilerclass"	TokenNameStringLiteral	-compilerclass
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
"sun.tools.javac.Main"	TokenNameStringLiteral	sun.tools.javac.Main
;	TokenNameSEMICOLON	
//Weblogic jspc does not seem to work unless u explicitly set this... 	TokenNameCOMMENT_LINE	Weblogic jspc does not seem to work unless u explicitly set this... 
// Does not take the classpath from the env.... 	TokenNameCOMMENT_LINE	Does not take the classpath from the env.... 
// Am i missing something about the Java task?? 	TokenNameCOMMENT_LINE	Am i missing something about the Java task?? 
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
"-classpath"	TokenNameStringLiteral	-classpath
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
compileClasspath	TokenNameIdentifier	 compile Classpath
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scanDir	TokenNameIdentifier	 scan Dir
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Compiling "	TokenNameStringLiteral	Compiling 
+	TokenNamePLUS	
filesToDo	TokenNameIdentifier	 files To Do
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" JSP files"	TokenNameStringLiteral	 JSP files
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
filesToDo	TokenNameIdentifier	 files To Do
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//XXX 	TokenNameCOMMENT_LINE	XXX 
// All this to get package according to weblogic standards 	TokenNameCOMMENT_LINE	All this to get package according to weblogic standards 
// Can be written better... this is too hacky! 	TokenNameCOMMENT_LINE	Can be written better... this is too hacky! 
// Careful.. similar code in scanDir , but slightly different!! 	TokenNameCOMMENT_LINE	Careful.. similar code in scanDir , but slightly different!! 
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
filesToDo	TokenNameIdentifier	 files To Do
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jspFile	TokenNameIdentifier	 jsp File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
"-package"	TokenNameStringLiteral	-package
;	TokenNameSEMICOLON	
parents	TokenNameIdentifier	 parents
=	TokenNameEQUAL	
jspFile	TokenNameIdentifier	 jsp File
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
parents	TokenNameIdentifier	 parents
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
parents	TokenNameIdentifier	 parents
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parents	TokenNameIdentifier	 parents
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
replaceString	TokenNameIdentifier	 replace String
(	TokenNameLPAREN	
parents	TokenNameIdentifier	 parents
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
,	TokenNameCOMMA	
"_."	TokenNameStringLiteral	_.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
destinationPackage	TokenNameIdentifier	 destination Package
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
"_"	TokenNameStringLiteral	_
+	TokenNamePLUS	
parents	TokenNameIdentifier	 parents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
destinationPackage	TokenNameIdentifier	 destination Package
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sourceDirectory	TokenNameIdentifier	 source Directory
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
filename	TokenNameIdentifier	 filename
;	TokenNameSEMICOLON	
helperTask	TokenNameIdentifier	 helper Task
.	TokenNameDOT	
clearArgs	TokenNameIdentifier	 clear Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
helperTask	TokenNameIdentifier	 helper Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
helperTask	TokenNameIdentifier	 helper Task
.	TokenNameDOT	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
compileClasspath	TokenNameIdentifier	 compile Classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
helperTask	TokenNameIdentifier	 helper Task
.	TokenNameDOT	
executeJava	TokenNameIdentifier	 execute Java
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
" failed to compile"	TokenNameStringLiteral	 failed to compile
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the classpath to be used for this compilation. * @param classpath the classpath to use. */	TokenNameCOMMENT_JAVADOC	 Set the classpath to be used for this compilation. @param classpath the classpath to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
compileClasspath	TokenNameIdentifier	 compile Classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
compileClasspath	TokenNameIdentifier	 compile Classpath
=	TokenNameEQUAL	
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
compileClasspath	TokenNameIdentifier	 compile Classpath
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Maybe creates a nested classpath element. * @return a path to be configured. */	TokenNameCOMMENT_JAVADOC	 Maybe creates a nested classpath element. @return a path to be configured. 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
compileClasspath	TokenNameIdentifier	 compile Classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
compileClasspath	TokenNameIdentifier	 compile Classpath
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
compileClasspath	TokenNameIdentifier	 compile Classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the directory containing the source jsp's * * * @param dirName the directory containg the source jsp's */	TokenNameCOMMENT_JAVADOC	 Set the directory containing the source jsp's * @param dirName the directory containg the source jsp's 
public	TokenNamepublic	
void	TokenNamevoid	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dirName	TokenNameIdentifier	 dir Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sourceDirectory	TokenNameIdentifier	 source Directory
=	TokenNameEQUAL	
dirName	TokenNameIdentifier	 dir Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the directory containing the source jsp's * * * @param dirName the directory containg the source jsp's */	TokenNameCOMMENT_JAVADOC	 Set the directory containing the source jsp's * @param dirName the directory containg the source jsp's 
public	TokenNamepublic	
void	TokenNamevoid	
setDest	TokenNameIdentifier	 set Dest
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dirName	TokenNameIdentifier	 dir Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
destinationDirectory	TokenNameIdentifier	 destination Directory
=	TokenNameEQUAL	
dirName	TokenNameIdentifier	 dir Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the package under which the compiled classes go * * @param packageName the package name for the clases */	TokenNameCOMMENT_JAVADOC	 Set the package under which the compiled classes go * @param packageName the package name for the clases 
public	TokenNamepublic	
void	TokenNamevoid	
setPackage	TokenNameIdentifier	 set Package
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
packageName	TokenNameIdentifier	 package Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
destinationPackage	TokenNameIdentifier	 destination Package
=	TokenNameEQUAL	
packageName	TokenNameIdentifier	 package Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Scan the array of files and add the jsp * files that need to be compiled to the filesToDo field. * @param files the files to scan. */	TokenNameCOMMENT_JAVADOC	 Scan the array of files and add the jsp files that need to be compiled to the filesToDo field. @param files the files to scan. 
protected	TokenNameprotected	
void	TokenNamevoid	
scanDir	TokenNameIdentifier	 scan Dir
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
jspFile	TokenNameIdentifier	 jsp File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
parents	TokenNameIdentifier	 parents
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pack	TokenNameIdentifier	 pack
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
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
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
srcFile	TokenNameIdentifier	 src File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
sourceDirectory	TokenNameIdentifier	 source Directory
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//XXX 	TokenNameCOMMENT_LINE	XXX 
// All this to convert source to destination directory according 	TokenNameCOMMENT_LINE	All this to convert source to destination directory according 
// to weblogic standards Can be written better... this is too hacky! 	TokenNameCOMMENT_LINE	to weblogic standards Can be written better... this is too hacky! 
jspFile	TokenNameIdentifier	 jsp File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parents	TokenNameIdentifier	 parents
=	TokenNameEQUAL	
jspFile	TokenNameIdentifier	 jsp File
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
parents	TokenNameIdentifier	 parents
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
parents	TokenNameIdentifier	 parents
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parents	TokenNameIdentifier	 parents
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
replaceString	TokenNameIdentifier	 replace String
(	TokenNameLPAREN	
parents	TokenNameIdentifier	 parents
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
,	TokenNameCOMMA	
"_/"	TokenNameStringLiteral	_/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pack	TokenNameIdentifier	 pack
=	TokenNameEQUAL	
pathToPackage	TokenNameIdentifier	 path To Package
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"_"	TokenNameStringLiteral	_
+	TokenNamePLUS	
parents	TokenNameIdentifier	 parents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pack	TokenNameIdentifier	 pack
=	TokenNameEQUAL	
pathToPackage	TokenNameIdentifier	 path To Package
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
filePath	TokenNameIdentifier	 file Path
=	TokenNameEQUAL	
pack	TokenNameIdentifier	 pack
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"_"	TokenNameStringLiteral	_
;	TokenNameSEMICOLON	
int	TokenNameint	
startingIndex	TokenNameIdentifier	 starting Index
=	TokenNameEQUAL	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
endingIndex	TokenNameIdentifier	 ending Index
=	TokenNameEQUAL	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
".jsp"	TokenNameStringLiteral	.jsp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endingIndex	TokenNameIdentifier	 ending Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Skipping "	TokenNameStringLiteral	Skipping 
+	TokenNamePLUS	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
". Not a JSP"	TokenNameStringLiteral	. Not a JSP
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
filePath	TokenNameIdentifier	 file Path
+=	TokenNamePLUS_EQUAL	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startingIndex	TokenNameIdentifier	 starting Index
,	TokenNameCOMMA	
endingIndex	TokenNameIdentifier	 ending Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filePath	TokenNameIdentifier	 file Path
+=	TokenNamePLUS_EQUAL	
".class"	TokenNameStringLiteral	.class
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
classFile	TokenNameIdentifier	 class File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
destinationDirectory	TokenNameIdentifier	 destination Directory
,	TokenNameCOMMA	
filePath	TokenNameIdentifier	 file Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcFile	TokenNameIdentifier	 src File
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Warning: file modified in the future: "	TokenNameStringLiteral	Warning: file modified in the future: 
+	TokenNamePLUS	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
srcFile	TokenNameIdentifier	 src File
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
classFile	TokenNameIdentifier	 class File
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filesToDo	TokenNameIdentifier	 files To Do
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Recompiling File "	TokenNameStringLiteral	Recompiling File 
+	TokenNamePLUS	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Replace occurances of a string with a replacement string. * @param inpString the string to convert. * @param escapeChars the string to replace. * @param replaceChars the string to place. * @return the converted string. */	TokenNameCOMMENT_JAVADOC	 Replace occurances of a string with a replacement string. @param inpString the string to convert. @param escapeChars the string to replace. @param replaceChars the string to place. @return the converted string. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
replaceString	TokenNameIdentifier	 replace String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
inpString	TokenNameIdentifier	 inp String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
escapeChars	TokenNameIdentifier	 escape Chars
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
replaceChars	TokenNameIdentifier	 replace Chars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
localString	TokenNameIdentifier	 local String
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
int	TokenNameint	
numTokens	TokenNameIdentifier	 num Tokens
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
inpString	TokenNameIdentifier	 inp String
,	TokenNameCOMMA	
escapeChars	TokenNameIdentifier	 escape Chars
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numTokens	TokenNameIdentifier	 num Tokens
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
countTokens	TokenNameIdentifier	 count Tokens
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
numTokens	TokenNameIdentifier	 num Tokens
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
escapeChars	TokenNameIdentifier	 escape Chars
)	TokenNameRPAREN	
?	TokenNameQUESTION	
replaceChars	TokenNameIdentifier	 replace Chars
:	TokenNameCOLON	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localString	TokenNameIdentifier	 local String
+=	TokenNamePLUS_EQUAL	
test	TokenNameIdentifier	 test
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
localString	TokenNameIdentifier	 local String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
