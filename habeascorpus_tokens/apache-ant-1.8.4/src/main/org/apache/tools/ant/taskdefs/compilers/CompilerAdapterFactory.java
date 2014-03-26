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
compilers	TokenNameIdentifier	 compilers
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
Task	TokenNameIdentifier	 Task
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
ClasspathUtils	TokenNameIdentifier	 Classpath Utils
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
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
;	TokenNameSEMICOLON	
/** * Creates the necessary compiler adapter, given basic criteria. * * @since Ant 1.3 */	TokenNameCOMMENT_JAVADOC	 Creates the necessary compiler adapter, given basic criteria. * @since Ant 1.3 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CompilerAdapterFactory	TokenNameIdentifier	 Compiler Adapter Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MODERN_COMPILER	TokenNameIdentifier	 MODERN  COMPILER
=	TokenNameEQUAL	
"com.sun.tools.javac.Main"	TokenNameStringLiteral	com.sun.tools.javac.Main
;	TokenNameSEMICOLON	
/** This is a singleton -- can't create instances!! */	TokenNameCOMMENT_JAVADOC	 This is a singleton -- can't create instances!! 
private	TokenNameprivate	
CompilerAdapterFactory	TokenNameIdentifier	 Compiler Adapter Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Based on the parameter passed in, this method creates the necessary * factory desired. * * The current mapping for compiler names are as follows: * <ul><li>jikes = jikes compiler * <li>classic, javac1.1, javac1.2 = the standard compiler from JDK * 1.1/1.2 * <li>modern, javac1.3, javac1.4, javac1.5 = the compiler of JDK 1.3+ * <li>jvc, microsoft = the command line compiler from Microsoft's SDK * for Java / Visual J++ * <li>kjc = the kopi compiler</li> * <li>gcj = the gcj compiler from gcc</li> * <li>sj, symantec = the Symantec Java compiler</li> * <li><i>a fully qualified classname</i> = the name of a compiler * adapter * </ul> * * @param compilerType either the name of the desired compiler, or the * full classname of the compiler's adapter. * @param task a task to log through. * @return the compiler adapter * @throws BuildException if the compiler type could not be resolved into * a compiler adapter. */	TokenNameCOMMENT_JAVADOC	 Based on the parameter passed in, this method creates the necessary factory desired. * The current mapping for compiler names are as follows: <ul><li>jikes = jikes compiler <li>classic, javac1.1, javac1.2 = the standard compiler from JDK 1.1/1.2 <li>modern, javac1.3, javac1.4, javac1.5 = the compiler of JDK 1.3+ <li>jvc, microsoft = the command line compiler from Microsoft's SDK for Java / Visual J++ <li>kjc = the kopi compiler</li> <li>gcj = the gcj compiler from gcc</li> <li>sj, symantec = the Symantec Java compiler</li> <li><i>a fully qualified classname</i> = the name of a compiler adapter </ul> * @param compilerType either the name of the desired compiler, or the full classname of the compiler's adapter. @param task a task to log through. @return the compiler adapter @throws BuildException if the compiler type could not be resolved into a compiler adapter. 
public	TokenNamepublic	
static	TokenNamestatic	
CompilerAdapter	TokenNameIdentifier	 Compiler Adapter
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
compilerType	TokenNameIdentifier	 compiler Type
,	TokenNameCOMMA	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
compilerType	TokenNameIdentifier	 compiler Type
,	TokenNameCOMMA	
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Based on the parameter passed in, this method creates the necessary * factory desired. * * The current mapping for compiler names are as follows: * <ul><li>jikes = jikes compiler * <li>classic, javac1.1, javac1.2 = the standard compiler from JDK * 1.1/1.2 * <li>modern, javac1.3, javac1.4, javac1.5 = the compiler of JDK 1.3+ * <li>jvc, microsoft = the command line compiler from Microsoft's SDK * for Java / Visual J++ * <li>kjc = the kopi compiler</li> * <li>gcj = the gcj compiler from gcc</li> * <li>sj, symantec = the Symantec Java compiler</li> * <li><i>a fully qualified classname</i> = the name of a compiler * adapter * </ul> * * @param compilerType either the name of the desired compiler, or the * full classname of the compiler's adapter. * @param task a task to log through. * @param classpath the classpath to use when looking up an * adapter class * @return the compiler adapter * @throws BuildException if the compiler type could not be resolved into * a compiler adapter. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Based on the parameter passed in, this method creates the necessary factory desired. * The current mapping for compiler names are as follows: <ul><li>jikes = jikes compiler <li>classic, javac1.1, javac1.2 = the standard compiler from JDK 1.1/1.2 <li>modern, javac1.3, javac1.4, javac1.5 = the compiler of JDK 1.3+ <li>jvc, microsoft = the command line compiler from Microsoft's SDK for Java / Visual J++ <li>kjc = the kopi compiler</li> <li>gcj = the gcj compiler from gcc</li> <li>sj, symantec = the Symantec Java compiler</li> <li><i>a fully qualified classname</i> = the name of a compiler adapter </ul> * @param compilerType either the name of the desired compiler, or the full classname of the compiler's adapter. @param task a task to log through. @param classpath the classpath to use when looking up an adapter class @return the compiler adapter @throws BuildException if the compiler type could not be resolved into a compiler adapter. @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
CompilerAdapter	TokenNameIdentifier	 Compiler Adapter
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
compilerType	TokenNameIdentifier	 compiler Type
,	TokenNameCOMMA	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
compilerType	TokenNameIdentifier	 compiler Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"jikes"	TokenNameStringLiteral	jikes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Jikes	TokenNameIdentifier	 Jikes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
compilerType	TokenNameIdentifier	 compiler Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"extjavac"	TokenNameStringLiteral	extjavac
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
JavacExternal	TokenNameIdentifier	 Javac External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
compilerType	TokenNameIdentifier	 compiler Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"classic"	TokenNameStringLiteral	classic
)	TokenNameRPAREN	
||	TokenNameOR_OR	
compilerType	TokenNameIdentifier	 compiler Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"javac1.1"	TokenNameStringLiteral	javac1.1
)	TokenNameRPAREN	
||	TokenNameOR_OR	
compilerType	TokenNameIdentifier	 compiler Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"javac1.2"	TokenNameStringLiteral	javac1.2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"This version of java does "	TokenNameStringLiteral	This version of java does 
+	TokenNamePLUS	
"not support the classic "	TokenNameStringLiteral	not support the classic 
+	TokenNamePLUS	
"compiler; upgrading to modern"	TokenNameStringLiteral	compiler; upgrading to modern
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compilerType	TokenNameIdentifier	 compiler Type
=	TokenNameEQUAL	
"modern"	TokenNameStringLiteral	modern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//on java<=1.3 the modern falls back to classic if it is not found 	TokenNameCOMMENT_LINE	on java<=1.3 the modern falls back to classic if it is not found 
//but on java>=1.4 we just bail out early 	TokenNameCOMMENT_LINE	but on java>=1.4 we just bail out early 
if	TokenNameif	
(	TokenNameLPAREN	
compilerType	TokenNameIdentifier	 compiler Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"modern"	TokenNameStringLiteral	modern
)	TokenNameRPAREN	
||	TokenNameOR_OR	
compilerType	TokenNameIdentifier	 compiler Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"javac1.3"	TokenNameStringLiteral	javac1.3
)	TokenNameRPAREN	
||	TokenNameOR_OR	
compilerType	TokenNameIdentifier	 compiler Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"javac1.4"	TokenNameStringLiteral	javac1.4
)	TokenNameRPAREN	
||	TokenNameOR_OR	
compilerType	TokenNameIdentifier	 compiler Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"javac1.5"	TokenNameStringLiteral	javac1.5
)	TokenNameRPAREN	
||	TokenNameOR_OR	
compilerType	TokenNameIdentifier	 compiler Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"javac1.6"	TokenNameStringLiteral	javac1.6
)	TokenNameRPAREN	
||	TokenNameOR_OR	
compilerType	TokenNameIdentifier	 compiler Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"javac1.7"	TokenNameStringLiteral	javac1.7
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// does the modern compiler exist? 	TokenNameCOMMENT_LINE	does the modern compiler exist? 
if	TokenNameif	
(	TokenNameLPAREN	
doesModernCompilerExist	TokenNameIdentifier	 does Modern Compiler Exist
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Javac13	TokenNameIdentifier	 Javac13
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to find a javac "	TokenNameStringLiteral	Unable to find a javac 
+	TokenNamePLUS	
"compiler; "	TokenNameStringLiteral	compiler; 
+	TokenNamePLUS	
MODERN_COMPILER	TokenNameIdentifier	 MODERN  COMPILER
+	TokenNamePLUS	
" is not on the "	TokenNameStringLiteral	 is not on the 
+	TokenNamePLUS	
"classpath. "	TokenNameStringLiteral	classpath. 
+	TokenNamePLUS	
"Perhaps JAVA_HOME does not"	TokenNameStringLiteral	Perhaps JAVA_HOME does not
+	TokenNamePLUS	
" point to the JDK. "	TokenNameStringLiteral	 point to the JDK. 
+	TokenNamePLUS	
"It is currently set to ""	TokenNameStringLiteral	It is currently set to "
+	TokenNamePLUS	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
.	TokenNameDOT	
getJavaHome	TokenNameIdentifier	 get Java Home
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
compilerType	TokenNameIdentifier	 compiler Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"jvc"	TokenNameStringLiteral	jvc
)	TokenNameRPAREN	
||	TokenNameOR_OR	
compilerType	TokenNameIdentifier	 compiler Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"microsoft"	TokenNameStringLiteral	microsoft
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Jvc	TokenNameIdentifier	 Jvc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
compilerType	TokenNameIdentifier	 compiler Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"kjc"	TokenNameStringLiteral	kjc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Kjc	TokenNameIdentifier	 Kjc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
compilerType	TokenNameIdentifier	 compiler Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"gcj"	TokenNameStringLiteral	gcj
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Gcj	TokenNameIdentifier	 Gcj
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
compilerType	TokenNameIdentifier	 compiler Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"sj"	TokenNameStringLiteral	sj
)	TokenNameRPAREN	
||	TokenNameOR_OR	
compilerType	TokenNameIdentifier	 compiler Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"symantec"	TokenNameStringLiteral	symantec
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Sj	TokenNameIdentifier	 Sj
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
resolveClassName	TokenNameIdentifier	 resolve Class Name
(	TokenNameLPAREN	
compilerType	TokenNameIdentifier	 compiler Type
,	TokenNameCOMMA	
// Memory-Leak in line below 	TokenNameCOMMENT_LINE	Memory-Leak in line below 
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * query for the Modern compiler existing * @return true if classic os on the classpath */	TokenNameCOMMENT_JAVADOC	 query for the Modern compiler existing @return true if classic os on the classpath 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
doesModernCompilerExist	TokenNameIdentifier	 does Modern Compiler Exist
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
MODERN_COMPILER	TokenNameIdentifier	 MODERN  COMPILER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
CompilerAdapterFactory	TokenNameIdentifier	 Compiler Adapter Factory
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
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
MODERN_COMPILER	TokenNameIdentifier	 MODERN  COMPILER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnfe2	TokenNameIdentifier	 cnfe2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ignore Exception 	TokenNameCOMMENT_LINE	Ignore Exception 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tries to resolve the given classname into a compiler adapter. * Throws a fit if it can't. * * @param className The fully qualified classname to be created. * @param loader the classloader to use * @throws BuildException This is the fit that is thrown if className * isn't an instance of CompilerAdapter. */	TokenNameCOMMENT_JAVADOC	 Tries to resolve the given classname into a compiler adapter. Throws a fit if it can't. * @param className The fully qualified classname to be created. @param loader the classloader to use @throws BuildException This is the fit that is thrown if className isn't an instance of CompilerAdapter. 
private	TokenNameprivate	
static	TokenNamestatic	
CompilerAdapter	TokenNameIdentifier	 Compiler Adapter
resolveClassName	TokenNameIdentifier	 resolve Class Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
CompilerAdapter	TokenNameIdentifier	 Compiler Adapter
)	TokenNameRPAREN	
ClasspathUtils	TokenNameIdentifier	 Classpath Utils
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
loader	TokenNameIdentifier	 loader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
loader	TokenNameIdentifier	 loader
:	TokenNameCOLON	
CompilerAdapterFactory	TokenNameIdentifier	 Compiler Adapter Factory
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
CompilerAdapter	TokenNameIdentifier	 Compiler Adapter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
