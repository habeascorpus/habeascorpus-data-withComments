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
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
jsp	TokenNameIdentifier	 jsp
.	TokenNameDOT	
JspNameMangler	TokenNameIdentifier	 Jsp Name Mangler
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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
jsp	TokenNameIdentifier	 jsp
.	TokenNameDOT	
Jasper41Mangler	TokenNameIdentifier	 Jasper41 Mangler
;	TokenNameSEMICOLON	
/** * Creates the necessary compiler adapter, given basic criteria. * */	TokenNameCOMMENT_JAVADOC	 Creates the necessary compiler adapter, given basic criteria. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
JspCompilerAdapterFactory	TokenNameIdentifier	 Jsp Compiler Adapter Factory
{	TokenNameLBRACE	
/** This is a singleton -- can't create instances!! */	TokenNameCOMMENT_JAVADOC	 This is a singleton -- can't create instances!! 
private	TokenNameprivate	
JspCompilerAdapterFactory	TokenNameIdentifier	 Jsp Compiler Adapter Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Based on the parameter passed in, this method creates the necessary * factory desired. * * The current mapping for compiler names are as follows: * <ul><li>jasper = jasper compiler (the default) * <li><i>a fully qualified classname</i> = the name of a jsp compiler * adapter * </ul> * * @param compilerType either the name of the desired compiler, or the * full classname of the compiler's adapter. * @param task a task to log through. * @return the compiler * @throws BuildException if the compiler type could not be resolved into * a compiler adapter. */	TokenNameCOMMENT_JAVADOC	 Based on the parameter passed in, this method creates the necessary factory desired. * The current mapping for compiler names are as follows: <ul><li>jasper = jasper compiler (the default) <li><i>a fully qualified classname</i> = the name of a jsp compiler adapter </ul> * @param compilerType either the name of the desired compiler, or the full classname of the compiler's adapter. @param task a task to log through. @return the compiler @throws BuildException if the compiler type could not be resolved into a compiler adapter. 
public	TokenNamepublic	
static	TokenNamestatic	
JspCompilerAdapter	TokenNameIdentifier	 Jsp Compiler Adapter
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
// Memory-Leak in line below 	TokenNameCOMMENT_LINE	Memory-Leak in line below 
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Based on the parameter passed in, this method creates the necessary * factory desired. * * The current mapping for compiler names are as follows: * <ul><li>jasper = jasper compiler (the default) * <li><i>a fully qualified classname</i> = the name of a jsp compiler * adapter * </ul> * * @param compilerType either the name of the desired compiler, or the * full classname of the compiler's adapter. * @param task a task to log through. * @param loader AntClassLoader with which the compiler should be loaded * @return the compiler * @throws BuildException if the compiler type could not be resolved into * a compiler adapter. */	TokenNameCOMMENT_JAVADOC	 Based on the parameter passed in, this method creates the necessary factory desired. * The current mapping for compiler names are as follows: <ul><li>jasper = jasper compiler (the default) <li><i>a fully qualified classname</i> = the name of a jsp compiler adapter </ul> * @param compilerType either the name of the desired compiler, or the full classname of the compiler's adapter. @param task a task to log through. @param loader AntClassLoader with which the compiler should be loaded @return the compiler @throws BuildException if the compiler type could not be resolved into a compiler adapter. 
public	TokenNamepublic	
static	TokenNamestatic	
JspCompilerAdapter	TokenNameIdentifier	 Jsp Compiler Adapter
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
compilerType	TokenNameIdentifier	 compiler Type
,	TokenNameCOMMA	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
loader	TokenNameIdentifier	 loader
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
"jasper"	TokenNameStringLiteral	jasper
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//tomcat4.0 gets the old mangler 	TokenNameCOMMENT_LINE	tomcat4.0 gets the old mangler 
return	TokenNamereturn	
new	TokenNamenew	
JasperC	TokenNameIdentifier	 Jasper C
(	TokenNameLPAREN	
new	TokenNamenew	
JspNameMangler	TokenNameIdentifier	 Jsp Name Mangler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
compilerType	TokenNameIdentifier	 compiler Type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"jasper41"	TokenNameStringLiteral	jasper41
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//tomcat4.1 gets the new one 	TokenNameCOMMENT_LINE	tomcat4.1 gets the new one 
return	TokenNamereturn	
new	TokenNamenew	
JasperC	TokenNameIdentifier	 Jasper C
(	TokenNameLPAREN	
new	TokenNamenew	
Jasper41Mangler	TokenNameIdentifier	 Jasper41 Mangler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
resolveClassName	TokenNameIdentifier	 resolve Class Name
(	TokenNameLPAREN	
compilerType	TokenNameIdentifier	 compiler Type
,	TokenNameCOMMA	
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tries to resolve the given classname into a compiler adapter. * Throws a fit if it can't. * * @param className The fully qualified classname to be created. * @param classloader Classloader with which to load the class * @throws BuildException This is the fit that is thrown if className * isn't an instance of JspCompilerAdapter. */	TokenNameCOMMENT_JAVADOC	 Tries to resolve the given classname into a compiler adapter. Throws a fit if it can't. * @param className The fully qualified classname to be created. @param classloader Classloader with which to load the class @throws BuildException This is the fit that is thrown if className isn't an instance of JspCompilerAdapter. 
private	TokenNameprivate	
static	TokenNamestatic	
JspCompilerAdapter	TokenNameIdentifier	 Jsp Compiler Adapter
resolveClassName	TokenNameIdentifier	 resolve Class Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
classloader	TokenNameIdentifier	 classloader
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
classloader	TokenNameIdentifier	 classloader
.	TokenNameDOT	
findClass	TokenNameIdentifier	 find Class
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
JspCompilerAdapter	TokenNameIdentifier	 Jsp Compiler Adapter
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
" can't be found."	TokenNameStringLiteral	 can't be found.
,	TokenNameCOMMA	
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
cce	TokenNameIdentifier	 cce
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
" isn't the classname of "	TokenNameStringLiteral	 isn't the classname of 
+	TokenNamePLUS	
"a compiler adapter."	TokenNameStringLiteral	a compiler adapter.
,	TokenNameCOMMA	
cce	TokenNameIdentifier	 cce
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for all other possibilities 	TokenNameCOMMENT_LINE	for all other possibilities 
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
" caused an interesting "	TokenNameStringLiteral	 caused an interesting 
+	TokenNamePLUS	
"exception."	TokenNameStringLiteral	exception.
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
