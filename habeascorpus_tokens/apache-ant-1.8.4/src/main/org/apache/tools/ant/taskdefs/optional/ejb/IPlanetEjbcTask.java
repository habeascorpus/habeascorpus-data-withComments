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
ejb	TokenNameIdentifier	 ejb
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParser	TokenNameIdentifier	 SAX Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Path	TokenNameIdentifier	 Path
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * Compiles EJB stubs and skeletons for the iPlanet Application Server. * The EJBs to be processed are specified by the EJB 1.1 standard XML * descriptor, and additional attributes are obtained from the iPlanet Application * Server-specific XML descriptor. Since the XML descriptors can include * multiple EJBs, this is a convenient way of specifying many EJBs in a single * Ant task. The following attributes are allowed: * <ul> * <li><i>ejbdescriptor</i> -- Standard EJB 1.1 XML descriptor (typically * titled "ejb-jar.xml"). This attribute is * required. * <li><i>iasdescriptor</i> -- EJB XML descriptor for iPlanet Application * Server (typically titled "ias-ejb-jar.xml). * This attribute is required. * <li><i>dest</i> -- The is the base directory where the RMI stubs and * skeletons are written. In addition, the class files * for each bean (home interface, remote interface, and * EJB implementation) must be found in this directory. * This attribute is required. * <li><i>classpath</i> -- The classpath used when generating EJB stubs and * skeletons. This is an optional attribute (if * omitted, the classpath specified when Ant was * started will be used). Nested "classpath" * elements may also be used. * <li><i>keepgenerated</i> -- Indicates whether or not the Java source * files which are generated by ejbc will be * saved or automatically deleted. If "yes", * the source files will be retained. This is * an optional attribute (if omitted, it * defaults to "no"). * <li><i>debug</i> -- Indicates whether or not the ejbc utility should * log additional debugging statements to the standard * output. If "yes", the additional debugging statements * will be generated (if omitted, it defaults to "no"). * <li><i>iashome</i> -- May be used to specify the "home" directory for * this iPlanet Application Server installation. This * is used to find the ejbc utility if it isn't * included in the user's system path. This is an * optional attribute (if specified, it should refer * to the <code>[install-location]/iplanet/ias6/ias * </code> directory). If omitted, the ejbc utility * must be on the user's system path. * </ul> * <p> * For each EJB specified, this task will locate the three classes that comprise * the EJB. If these class files cannot be located in the <code>dest</code> * directory, the task will fail. The task will also attempt to locate the EJB * stubs and skeletons in this directory. If found, the timestamps on the * stubs and skeletons will be checked to ensure they are up to date. Only if * these files cannot be found or if they are out of date will ejbc be called * to generate new stubs and skeletons. * * @see IPlanetEjbc * * @ant.task name="iplanet-ejbc" category="ejb" */	TokenNameCOMMENT_JAVADOC	 Compiles EJB stubs and skeletons for the iPlanet Application Server. The EJBs to be processed are specified by the EJB 1.1 standard XML descriptor, and additional attributes are obtained from the iPlanet Application Server-specific XML descriptor. Since the XML descriptors can include multiple EJBs, this is a convenient way of specifying many EJBs in a single Ant task. The following attributes are allowed: <ul> <li><i>ejbdescriptor</i> -- Standard EJB 1.1 XML descriptor (typically titled "ejb-jar.xml"). This attribute is required. <li><i>iasdescriptor</i> -- EJB XML descriptor for iPlanet Application Server (typically titled "ias-ejb-jar.xml). This attribute is required. <li><i>dest</i> -- The is the base directory where the RMI stubs and skeletons are written. In addition, the class files for each bean (home interface, remote interface, and EJB implementation) must be found in this directory. This attribute is required. <li><i>classpath</i> -- The classpath used when generating EJB stubs and skeletons. This is an optional attribute (if omitted, the classpath specified when Ant was started will be used). Nested "classpath" elements may also be used. <li><i>keepgenerated</i> -- Indicates whether or not the Java source files which are generated by ejbc will be saved or automatically deleted. If "yes", the source files will be retained. This is an optional attribute (if omitted, it defaults to "no"). <li><i>debug</i> -- Indicates whether or not the ejbc utility should log additional debugging statements to the standard output. If "yes", the additional debugging statements will be generated (if omitted, it defaults to "no"). <li><i>iashome</i> -- May be used to specify the "home" directory for this iPlanet Application Server installation. This is used to find the ejbc utility if it isn't included in the user's system path. This is an optional attribute (if specified, it should refer to the <code>[install-location]/iplanet/ias6/ias </code> directory). If omitted, the ejbc utility must be on the user's system path. </ul> <p> For each EJB specified, this task will locate the three classes that comprise the EJB. If these class files cannot be located in the <code>dest</code> directory, the task will fail. The task will also attempt to locate the EJB stubs and skeletons in this directory. If found, the timestamps on the stubs and skeletons will be checked to ensure they are up to date. Only if these files cannot be found or if they are out of date will ejbc be called to generate new stubs and skeletons. * @see IPlanetEjbc * @ant.task name="iplanet-ejbc" category="ejb" 
public	TokenNamepublic	
class	TokenNameclass	
IPlanetEjbcTask	TokenNameIdentifier	 I Planet Ejbc Task
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/* Attributes set by the Ant build file */	TokenNameCOMMENT_BLOCK	 Attributes set by the Ant build file 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
ejbdescriptor	TokenNameIdentifier	 ejbdescriptor
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
iasdescriptor	TokenNameIdentifier	 iasdescriptor
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
dest	TokenNameIdentifier	 dest
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
keepgenerated	TokenNameIdentifier	 keepgenerated
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
iashome	TokenNameIdentifier	 iashome
;	TokenNameSEMICOLON	
/** * Sets the location of the standard XML EJB descriptor. Typically, this * file is named "ejb-jar.xml". * * @param ejbdescriptor The name and location of the EJB descriptor. */	TokenNameCOMMENT_JAVADOC	 Sets the location of the standard XML EJB descriptor. Typically, this file is named "ejb-jar.xml". * @param ejbdescriptor The name and location of the EJB descriptor. 
public	TokenNamepublic	
void	TokenNamevoid	
setEjbdescriptor	TokenNameIdentifier	 set Ejbdescriptor
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
ejbdescriptor	TokenNameIdentifier	 ejbdescriptor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ejbdescriptor	TokenNameIdentifier	 ejbdescriptor
=	TokenNameEQUAL	
ejbdescriptor	TokenNameIdentifier	 ejbdescriptor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the location of the iAS-specific XML EJB descriptor. Typically, * this file is named "ias-ejb-jar.xml". * * @param iasdescriptor The name and location of the iAS-specific EJB * descriptor. */	TokenNameCOMMENT_JAVADOC	 Sets the location of the iAS-specific XML EJB descriptor. Typically, this file is named "ias-ejb-jar.xml". * @param iasdescriptor The name and location of the iAS-specific EJB descriptor. 
public	TokenNamepublic	
void	TokenNamevoid	
setIasdescriptor	TokenNameIdentifier	 set Iasdescriptor
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
iasdescriptor	TokenNameIdentifier	 iasdescriptor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
iasdescriptor	TokenNameIdentifier	 iasdescriptor
=	TokenNameEQUAL	
iasdescriptor	TokenNameIdentifier	 iasdescriptor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the destination directory where the EJB source classes must exist * and where the stubs and skeletons will be written. The destination * directory must exist before this task is executed. * * @param dest The directory where the compiled classes will be written. */	TokenNameCOMMENT_JAVADOC	 Sets the destination directory where the EJB source classes must exist and where the stubs and skeletons will be written. The destination directory must exist before this task is executed. * @param dest The directory where the compiled classes will be written. 
public	TokenNamepublic	
void	TokenNamevoid	
setDest	TokenNameIdentifier	 set Dest
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
dest	TokenNameIdentifier	 dest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the classpath to be used when compiling the EJB stubs and skeletons. * * @param classpath The classpath to be used. */	TokenNameCOMMENT_JAVADOC	 Sets the classpath to be used when compiling the EJB stubs and skeletons. * @param classpath The classpath to be used. 
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
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds to the classpath used when compiling the EJB stubs and skeletons. * @return the class path. */	TokenNameCOMMENT_JAVADOC	 Adds to the classpath used when compiling the EJB stubs and skeletons. @return the class path. 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classpath	TokenNameIdentifier	 classpath
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
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
createPath	TokenNameIdentifier	 create Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, the Java source files which are generated by ejbc will be saved . * * @param keepgenerated A boolean indicating if the Java source files for * the stubs and skeletons should be retained. */	TokenNameCOMMENT_JAVADOC	 If true, the Java source files which are generated by ejbc will be saved . * @param keepgenerated A boolean indicating if the Java source files for the stubs and skeletons should be retained. 
public	TokenNamepublic	
void	TokenNamevoid	
setKeepgenerated	TokenNameIdentifier	 set Keepgenerated
(	TokenNameLPAREN	
boolean	TokenNameboolean	
keepgenerated	TokenNameIdentifier	 keepgenerated
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keepgenerated	TokenNameIdentifier	 keepgenerated
=	TokenNameEQUAL	
keepgenerated	TokenNameIdentifier	 keepgenerated
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, debugging output will be generated when ejbc is * executed. * * @param debug A boolean indicating if debugging output should be generated */	TokenNameCOMMENT_JAVADOC	 If true, debugging output will be generated when ejbc is executed. * @param debug A boolean indicating if debugging output should be generated 
public	TokenNamepublic	
void	TokenNamevoid	
setDebug	TokenNameIdentifier	 set Debug
(	TokenNameLPAREN	
boolean	TokenNameboolean	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
debug	TokenNameIdentifier	 debug
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * May be used to specify the "home" directory for this iAS installation. * The directory specified should typically be * <code>[install-location]/iplanet/ias6/ias</code>. * * @param iashome The home directory for the user's iAS installation. */	TokenNameCOMMENT_JAVADOC	 May be used to specify the "home" directory for this iAS installation. The directory specified should typically be <code>[install-location]/iplanet/ias6/ias</code>. * @param iashome The home directory for the user's iAS installation. 
public	TokenNamepublic	
void	TokenNamevoid	
setIashome	TokenNameIdentifier	 set Iashome
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
iashome	TokenNameIdentifier	 iashome
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
iashome	TokenNameIdentifier	 iashome
=	TokenNameEQUAL	
iashome	TokenNameIdentifier	 iashome
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Does the work. * @throws BuildException if there is a problem. */	TokenNameCOMMENT_JAVADOC	 Does the work. @throws BuildException if there is a problem. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
checkConfiguration	TokenNameIdentifier	 check Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeEjbc	TokenNameIdentifier	 execute Ejbc
(	TokenNameLPAREN	
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Verifies that the user selections are valid. * * @throws BuildException If the user selections are invalid. */	TokenNameCOMMENT_JAVADOC	 Verifies that the user selections are valid. * @throws BuildException If the user selections are invalid. 
private	TokenNameprivate	
void	TokenNamevoid	
checkConfiguration	TokenNameIdentifier	 check Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ejbdescriptor	TokenNameIdentifier	 ejbdescriptor
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"The standard EJB descriptor must be specified using "	TokenNameStringLiteral	The standard EJB descriptor must be specified using 
+	TokenNamePLUS	
"the "ejbdescriptor" attribute."	TokenNameStringLiteral	the "ejbdescriptor" attribute.
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
!	TokenNameNOT	
ejbdescriptor	TokenNameIdentifier	 ejbdescriptor
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
ejbdescriptor	TokenNameIdentifier	 ejbdescriptor
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"The standard EJB descriptor ("	TokenNameStringLiteral	The standard EJB descriptor (
+	TokenNamePLUS	
ejbdescriptor	TokenNameIdentifier	 ejbdescriptor
+	TokenNamePLUS	
") was not found or isn't a file."	TokenNameStringLiteral	) was not found or isn't a file.
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
iasdescriptor	TokenNameIdentifier	 iasdescriptor
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"The iAS-speific XML descriptor must be specified using"	TokenNameStringLiteral	The iAS-speific XML descriptor must be specified using
+	TokenNamePLUS	
" the "iasdescriptor" attribute."	TokenNameStringLiteral	 the "iasdescriptor" attribute.
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
!	TokenNameNOT	
iasdescriptor	TokenNameIdentifier	 iasdescriptor
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
iasdescriptor	TokenNameIdentifier	 iasdescriptor
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"The iAS-specific XML descriptor ("	TokenNameStringLiteral	The iAS-specific XML descriptor (
+	TokenNamePLUS	
iasdescriptor	TokenNameIdentifier	 iasdescriptor
+	TokenNamePLUS	
") was not found or isn't a file."	TokenNameStringLiteral	) was not found or isn't a file.
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"The destination directory must be specified using "	TokenNameStringLiteral	The destination directory must be specified using 
+	TokenNamePLUS	
"the "dest" attribute."	TokenNameStringLiteral	the "dest" attribute.
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
!	TokenNameNOT	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"The destination directory ("	TokenNameStringLiteral	The destination directory (
+	TokenNamePLUS	
dest	TokenNameIdentifier	 dest
+	TokenNamePLUS	
") was not "	TokenNameStringLiteral	) was not 
+	TokenNamePLUS	
"found or isn't a directory."	TokenNameStringLiteral	found or isn't a directory.
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
iashome	TokenNameIdentifier	 iashome
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
iashome	TokenNameIdentifier	 iashome
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"If "iashome" is specified, it must be a valid "	TokenNameStringLiteral	If "iashome" is specified, it must be a valid 
+	TokenNamePLUS	
"directory (it was set to "	TokenNameStringLiteral	directory (it was set to 
+	TokenNamePLUS	
iashome	TokenNameIdentifier	 iashome
+	TokenNamePLUS	
")."	TokenNameStringLiteral	).
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a SAXParser that may be used to process the XML descriptors. * * @return Parser which may be used to process the EJB descriptors. * @throws BuildException If the parser cannot be created or configured. */	TokenNameCOMMENT_JAVADOC	 Returns a SAXParser that may be used to process the XML descriptors. * @return Parser which may be used to process the EJB descriptors. @throws BuildException If the parser cannot be created or configured. 
private	TokenNameprivate	
SAXParser	TokenNameIdentifier	 SAX Parser
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
SAXParser	TokenNameIdentifier	 SAX Parser
saxParser	TokenNameIdentifier	 sax Parser
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
saxParserFactory	TokenNameIdentifier	 sax Parser Factory
=	TokenNameEQUAL	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
saxParserFactory	TokenNameIdentifier	 sax Parser Factory
.	TokenNameDOT	
setValidating	TokenNameIdentifier	 set Validating
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
saxParser	TokenNameIdentifier	 sax Parser
=	TokenNameEQUAL	
saxParserFactory	TokenNameIdentifier	 sax Parser Factory
.	TokenNameDOT	
newSAXParser	TokenNameIdentifier	 new SAX Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Unable to create a SAXParser: "	TokenNameStringLiteral	Unable to create a SAXParser: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Unable to create a SAXParser: "	TokenNameStringLiteral	Unable to create a SAXParser: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
saxParser	TokenNameIdentifier	 sax Parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Executes the EJBc utility using the SAXParser provided. * * @param saxParser SAXParser that may be used to process the EJB * descriptors * @throws BuildException If there is an error reading or parsing the XML * descriptors */	TokenNameCOMMENT_JAVADOC	 Executes the EJBc utility using the SAXParser provided. * @param saxParser SAXParser that may be used to process the EJB descriptors @throws BuildException If there is an error reading or parsing the XML descriptors 
private	TokenNameprivate	
void	TokenNamevoid	
executeEjbc	TokenNameIdentifier	 execute Ejbc
(	TokenNameLPAREN	
SAXParser	TokenNameIdentifier	 SAX Parser
saxParser	TokenNameIdentifier	 sax Parser
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
IPlanetEjbc	TokenNameIdentifier	 I Planet Ejbc
ejbc	TokenNameIdentifier	 ejbc
=	TokenNameEQUAL	
new	TokenNamenew	
IPlanetEjbc	TokenNameIdentifier	 I Planet Ejbc
(	TokenNameLPAREN	
ejbdescriptor	TokenNameIdentifier	 ejbdescriptor
,	TokenNameCOMMA	
iasdescriptor	TokenNameIdentifier	 iasdescriptor
,	TokenNameCOMMA	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
saxParser	TokenNameIdentifier	 sax Parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ejbc	TokenNameIdentifier	 ejbc
.	TokenNameDOT	
setRetainSource	TokenNameIdentifier	 set Retain Source
(	TokenNameLPAREN	
keepgenerated	TokenNameIdentifier	 keepgenerated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ejbc	TokenNameIdentifier	 ejbc
.	TokenNameDOT	
setDebugOutput	TokenNameIdentifier	 set Debug Output
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iashome	TokenNameIdentifier	 iashome
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ejbc	TokenNameIdentifier	 ejbc
.	TokenNameDOT	
setIasHomeDir	TokenNameIdentifier	 set Ias Home Dir
(	TokenNameLPAREN	
iashome	TokenNameIdentifier	 iashome
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ejbc	TokenNameIdentifier	 ejbc
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
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
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"An IOException occurred while trying to read the XML "	TokenNameStringLiteral	An IOException occurred while trying to read the XML 
+	TokenNamePLUS	
"descriptor file: "	TokenNameStringLiteral	descriptor file: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"A SAXException occurred while trying to read the XML "	TokenNameStringLiteral	A SAXException occurred while trying to read the XML 
+	TokenNamePLUS	
"descriptor file: "	TokenNameStringLiteral	descriptor file: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IPlanetEjbc	TokenNameIdentifier	 I Planet Ejbc
.	TokenNameDOT	
EjbcException	TokenNameIdentifier	 Ejbc Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"An exception occurred while trying to run the ejbc "	TokenNameStringLiteral	An exception occurred while trying to run the ejbc 
+	TokenNamePLUS	
"utility: "	TokenNameStringLiteral	utility: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the CLASSPATH to be used when calling EJBc. If no user CLASSPATH * is specified, the System classpath is returned instead. * * @return Path The classpath to be used for EJBc. */	TokenNameCOMMENT_JAVADOC	 Returns the CLASSPATH to be used when calling EJBc. If no user CLASSPATH is specified, the System classpath is returned instead. * @return Path The classpath to be used for EJBc. 
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Path	TokenNameIdentifier	 Path
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
concatSystemClasspath	TokenNameIdentifier	 concat System Classpath
(	TokenNameLPAREN	
"last"	TokenNameStringLiteral	last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
concatSystemClasspath	TokenNameIdentifier	 concat System Classpath
(	TokenNameLPAREN	
"ignore"	TokenNameStringLiteral	ignore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
cp	TokenNameIdentifier	 cp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
