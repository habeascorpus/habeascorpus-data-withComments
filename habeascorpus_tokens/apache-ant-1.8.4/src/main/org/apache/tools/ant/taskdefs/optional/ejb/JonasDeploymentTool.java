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
Hashtable	TokenNameIdentifier	 Hashtable
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Path	TokenNameIdentifier	 Path
;	TokenNameSEMICOLON	
/** * The deployment tool to add the jonas specific deployment descriptors to the * ejb JAR file. JONAS only requires one additional file jonas-ejb-jar.xml. * * @version 1.0 * @see EjbJar#createJonas */	TokenNameCOMMENT_JAVADOC	 The deployment tool to add the jonas specific deployment descriptors to the ejb JAR file. JONAS only requires one additional file jonas-ejb-jar.xml. * @version 1.0 @see EjbJar#createJonas 
public	TokenNamepublic	
class	TokenNameclass	
JonasDeploymentTool	TokenNameIdentifier	 Jonas Deployment Tool
extends	TokenNameextends	
GenericDeploymentTool	TokenNameIdentifier	 Generic Deployment Tool
{	TokenNameLBRACE	
/** Public Id of the standard deployment descriptor DTD. */	TokenNameCOMMENT_JAVADOC	 Public Id of the standard deployment descriptor DTD. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EJB_JAR_1_1_PUBLIC_ID	TokenNameIdentifier	 EJB  JAR 1 1  PUBLIC  ID
=	TokenNameEQUAL	
"-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 1.1//EN"	TokenNameStringLiteral	-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 1.1//EN
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EJB_JAR_2_0_PUBLIC_ID	TokenNameIdentifier	 EJB  JAR 2 0  PUBLIC  ID
=	TokenNameEQUAL	
"-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 2.0//EN"	TokenNameStringLiteral	-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 2.0//EN
;	TokenNameSEMICOLON	
/** Public Id of the JOnAS-specific deployment descriptor DTD. */	TokenNameCOMMENT_JAVADOC	 Public Id of the JOnAS-specific deployment descriptor DTD. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JONAS_EJB_JAR_2_4_PUBLIC_ID	TokenNameIdentifier	 JONAS  EJB  JAR 2 4  PUBLIC  ID
=	TokenNameEQUAL	
"-//ObjectWeb//DTD JOnAS 2.4//EN"	TokenNameStringLiteral	-//ObjectWeb//DTD JOnAS 2.4//EN
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JONAS_EJB_JAR_2_5_PUBLIC_ID	TokenNameIdentifier	 JONAS  EJB  JAR 2 5  PUBLIC  ID
=	TokenNameEQUAL	
"-//ObjectWeb//DTD JOnAS 2.5//EN"	TokenNameStringLiteral	-//ObjectWeb//DTD JOnAS 2.5//EN
;	TokenNameSEMICOLON	
/** RMI ORB. */	TokenNameCOMMENT_JAVADOC	 RMI ORB. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RMI_ORB	TokenNameIdentifier	 RMI  ORB
=	TokenNameEQUAL	
"RMI"	TokenNameStringLiteral	RMI
;	TokenNameSEMICOLON	
/** JEREMIE ORB. */	TokenNameCOMMENT_JAVADOC	 JEREMIE ORB. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JEREMIE_ORB	TokenNameIdentifier	 JEREMIE  ORB
=	TokenNameEQUAL	
"JEREMIE"	TokenNameStringLiteral	JEREMIE
;	TokenNameSEMICOLON	
/** DAVID ORB. */	TokenNameCOMMENT_JAVADOC	 DAVID ORB. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DAVID_ORB	TokenNameIdentifier	 DAVID  ORB
=	TokenNameEQUAL	
"DAVID"	TokenNameStringLiteral	DAVID
;	TokenNameSEMICOLON	
/** * Name of the standard deployment descriptor DTD (these files are stored in * the ${JONAS_ROOT}/xml directory). */	TokenNameCOMMENT_JAVADOC	 Name of the standard deployment descriptor DTD (these files are stored in the ${JONAS_ROOT}/xml directory). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EJB_JAR_1_1_DTD	TokenNameIdentifier	 EJB  JAR 1 1  DTD
=	TokenNameEQUAL	
"ejb-jar_1_1.dtd"	TokenNameStringLiteral	ejb-jar_1_1.dtd
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EJB_JAR_2_0_DTD	TokenNameIdentifier	 EJB  JAR 2 0  DTD
=	TokenNameEQUAL	
"ejb-jar_2_0.dtd"	TokenNameStringLiteral	ejb-jar_2_0.dtd
;	TokenNameSEMICOLON	
/** * Name of the JOnAS-specific deployment descriptor DTD (these files are * stored in the ${JONAS_ROOT}/xml directory). */	TokenNameCOMMENT_JAVADOC	 Name of the JOnAS-specific deployment descriptor DTD (these files are stored in the ${JONAS_ROOT}/xml directory). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JONAS_EJB_JAR_2_4_DTD	TokenNameIdentifier	 JONAS  EJB  JAR 2 4  DTD
=	TokenNameEQUAL	
"jonas-ejb-jar_2_4.dtd"	TokenNameStringLiteral	jonas-ejb-jar_2_4.dtd
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JONAS_EJB_JAR_2_5_DTD	TokenNameIdentifier	 JONAS  EJB  JAR 2 5  DTD
=	TokenNameEQUAL	
"jonas-ejb-jar_2_5.dtd"	TokenNameStringLiteral	jonas-ejb-jar_2_5.dtd
;	TokenNameSEMICOLON	
/** Default JOnAS deployment descriptor name. */	TokenNameCOMMENT_JAVADOC	 Default JOnAS deployment descriptor name. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JONAS_DD	TokenNameIdentifier	 JONAS  DD
=	TokenNameEQUAL	
"jonas-ejb-jar.xml"	TokenNameStringLiteral	jonas-ejb-jar.xml
;	TokenNameSEMICOLON	
/** GenIC class name (JOnAS 2.5) */	TokenNameCOMMENT_JAVADOC	 GenIC class name (JOnAS 2.5) 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GENIC_CLASS	TokenNameIdentifier	 GENIC  CLASS
=	TokenNameEQUAL	
"org.objectweb.jonas_ejb.genic.GenIC"	TokenNameStringLiteral	org.objectweb.jonas_ejb.genic.GenIC
;	TokenNameSEMICOLON	
/** Old GenIC class name (JOnAS 2.4.x). */	TokenNameCOMMENT_JAVADOC	 Old GenIC class name (JOnAS 2.4.x). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OLD_GENIC_CLASS_1	TokenNameIdentifier	 OLD  GENIC  CLASS 1
=	TokenNameEQUAL	
"org.objectweb.jonas_ejb.tools.GenWholeIC"	TokenNameStringLiteral	org.objectweb.jonas_ejb.tools.GenWholeIC
;	TokenNameSEMICOLON	
/** Old GenIC class name. */	TokenNameCOMMENT_JAVADOC	 Old GenIC class name. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OLD_GENIC_CLASS_2	TokenNameIdentifier	 OLD  GENIC  CLASS 2
=	TokenNameEQUAL	
"org.objectweb.jonas_ejb.tools.GenIC"	TokenNameStringLiteral	org.objectweb.jonas_ejb.tools.GenIC
;	TokenNameSEMICOLON	
/** * Filename of the standard EJB descriptor (which is passed to this class * from the parent "ejbjar" task). This file is relative to the directory * specified by the "srcdir" attribute in the ejbjar task. */	TokenNameCOMMENT_JAVADOC	 Filename of the standard EJB descriptor (which is passed to this class from the parent "ejbjar" task). This file is relative to the directory specified by the "srcdir" attribute in the ejbjar task. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
descriptorName	TokenNameIdentifier	 descriptor Name
;	TokenNameSEMICOLON	
/** * Filename of the JOnAS-specific EJB descriptor (which is passed to this * class from the parent "ejbjar" task). This file is relative to the * directory specified by the "srcdir" attribute in the ejbjar task. */	TokenNameCOMMENT_JAVADOC	 Filename of the JOnAS-specific EJB descriptor (which is passed to this class from the parent "ejbjar" task). This file is relative to the directory specified by the "srcdir" attribute in the ejbjar task. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
jonasDescriptorName	TokenNameIdentifier	 jonas Descriptor Name
;	TokenNameSEMICOLON	
/* ------------- */	TokenNameCOMMENT_BLOCK	 ------------- 
/* GenIC options */	TokenNameCOMMENT_BLOCK	 GenIC options 
/* ------------- */	TokenNameCOMMENT_BLOCK	 ------------- 
/** * Temporary output directory used by GenIC. */	TokenNameCOMMENT_JAVADOC	 Temporary output directory used by GenIC. 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
outputdir	TokenNameIdentifier	 outputdir
;	TokenNameSEMICOLON	
/** * <code>true</code> if the intermediate Java source files generated by * GenIC must be deleted or not. The default is <code>false</code> */	TokenNameCOMMENT_JAVADOC	 <code>true</code> if the intermediate Java source files generated by GenIC must be deleted or not. The default is <code>false</code> 
private	TokenNameprivate	
boolean	TokenNameboolean	
keepgenerated	TokenNameIdentifier	 keepgenerated
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * <code>true</code> if the generated source files must not be compiled via * the java and rmi compilers. The default is <code>false</code>. */	TokenNameCOMMENT_JAVADOC	 <code>true</code> if the generated source files must not be compiled via the java and rmi compilers. The default is <code>false</code>. 
private	TokenNameprivate	
boolean	TokenNameboolean	
nocompil	TokenNameIdentifier	 nocompil
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * <code>true</code> if the XML deployment descriptors must be parsed * without validation. The default is <code>false</code>. */	TokenNameCOMMENT_JAVADOC	 <code>true</code> if the XML deployment descriptors must be parsed without validation. The default is <code>false</code>. 
private	TokenNameprivate	
boolean	TokenNameboolean	
novalidation	TokenNameIdentifier	 novalidation
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Java compiler to use. The default is the value of * <code>build.compiler</code> property. */	TokenNameCOMMENT_JAVADOC	 Java compiler to use. The default is the value of <code>build.compiler</code> property. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
javac	TokenNameIdentifier	 javac
;	TokenNameSEMICOLON	
/** Options to pass to the java compiler. */	TokenNameCOMMENT_JAVADOC	 Options to pass to the java compiler. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
javacopts	TokenNameIdentifier	 javacopts
;	TokenNameSEMICOLON	
/** Options to pass to the rmi compiler. */	TokenNameCOMMENT_JAVADOC	 Options to pass to the rmi compiler. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
rmicopts	TokenNameIdentifier	 rmicopts
;	TokenNameSEMICOLON	
/** * Whether or not the RMI skeleton and stub must be modified to * implement the implicit propagation of the security context (the * transactional context is always provided). The default is * <code>false</code>. */	TokenNameCOMMENT_JAVADOC	 Whether or not the RMI skeleton and stub must be modified to implement the implicit propagation of the security context (the transactional context is always provided). The default is <code>false</code>. 
private	TokenNameprivate	
boolean	TokenNameboolean	
secpropag	TokenNameIdentifier	 secpropag
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * <code>true</code> if the GenIC call must be verbose. The default * is <code>false</code>. */	TokenNameCOMMENT_JAVADOC	 <code>true</code> if the GenIC call must be verbose. The default is <code>false</code>. 
private	TokenNameprivate	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Additional args to send to GenIC. */	TokenNameCOMMENT_JAVADOC	 Additional args to send to GenIC. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
additionalargs	TokenNameIdentifier	 additionalargs
;	TokenNameSEMICOLON	
/* ------------- */	TokenNameCOMMENT_BLOCK	 ------------- 
/* other options */	TokenNameCOMMENT_BLOCK	 other options 
/* ------------- */	TokenNameCOMMENT_BLOCK	 ------------- 
/** JOnAS root directory. */	TokenNameCOMMENT_JAVADOC	 JOnAS root directory. 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
jonasroot	TokenNameIdentifier	 jonasroot
;	TokenNameSEMICOLON	
/** * <code>true</code> if the generic JAR file used as input to GenIC must be * retained. The default is <code>false</code>. */	TokenNameCOMMENT_JAVADOC	 <code>true</code> if the generic JAR file used as input to GenIC must be retained. The default is <code>false</code>. 
private	TokenNameprivate	
boolean	TokenNameboolean	
keepgeneric	TokenNameIdentifier	 keepgeneric
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Stores the suffix for the JOnAS JAR file. The default is '.jar'. */	TokenNameCOMMENT_JAVADOC	 Stores the suffix for the JOnAS JAR file. The default is '.jar'. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
".jar"	TokenNameStringLiteral	.jar
;	TokenNameSEMICOLON	
/** * ORB to use (RMI, JEREMIE or DAVID). If omitted, it defaults to the one * present in classpath. If specified, the corresponding JOnAS JAR is * automatically added to the classpath. */	TokenNameCOMMENT_JAVADOC	 ORB to use (RMI, JEREMIE or DAVID). If omitted, it defaults to the one present in classpath. If specified, the corresponding JOnAS JAR is automatically added to the classpath. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
orb	TokenNameIdentifier	 orb
;	TokenNameSEMICOLON	
/** * <code>true</code> if GenIC must not be run on the EJB JAR. * The default is <code>false</code>. */	TokenNameCOMMENT_JAVADOC	 <code>true</code> if GenIC must not be run on the EJB JAR. The default is <code>false</code>. 
private	TokenNameprivate	
boolean	TokenNameboolean	
nogenic	TokenNameIdentifier	 nogenic
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/* -------------------- */	TokenNameCOMMENT_BLOCK	 -------------------- 
/* GenIC options setter */	TokenNameCOMMENT_BLOCK	 GenIC options setter 
/* -------------------- */	TokenNameCOMMENT_BLOCK	 -------------------- 
/** * Sets the <code>keepgenerated</code> flag. * * @param aBoolean <code>true</code> if the flag must be set. */	TokenNameCOMMENT_JAVADOC	 Sets the <code>keepgenerated</code> flag. * @param aBoolean <code>true</code> if the flag must be set. 
public	TokenNamepublic	
void	TokenNamevoid	
setKeepgenerated	TokenNameIdentifier	 set Keepgenerated
(	TokenNameLPAREN	
boolean	TokenNameboolean	
aBoolean	TokenNameIdentifier	 a Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keepgenerated	TokenNameIdentifier	 keepgenerated
=	TokenNameEQUAL	
aBoolean	TokenNameIdentifier	 a Boolean
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the additional arguments. * * @param aString additional args. */	TokenNameCOMMENT_JAVADOC	 Sets the additional arguments. * @param aString additional args. 
public	TokenNamepublic	
void	TokenNamevoid	
setAdditionalargs	TokenNameIdentifier	 set Additionalargs
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aString	TokenNameIdentifier	 a String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
additionalargs	TokenNameIdentifier	 additionalargs
=	TokenNameEQUAL	
aString	TokenNameIdentifier	 a String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the <code>nocompil</code> flag. * * @param aBoolean <code>true</code> if the flag must be set. */	TokenNameCOMMENT_JAVADOC	 Sets the <code>nocompil</code> flag. * @param aBoolean <code>true</code> if the flag must be set. 
public	TokenNamepublic	
void	TokenNamevoid	
setNocompil	TokenNameIdentifier	 set Nocompil
(	TokenNameLPAREN	
boolean	TokenNameboolean	
aBoolean	TokenNameIdentifier	 a Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nocompil	TokenNameIdentifier	 nocompil
=	TokenNameEQUAL	
aBoolean	TokenNameIdentifier	 a Boolean
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the <code>novalidation</code> flag. * * @param aBoolean <code>true</code> if the flag must be set. */	TokenNameCOMMENT_JAVADOC	 Sets the <code>novalidation</code> flag. * @param aBoolean <code>true</code> if the flag must be set. 
public	TokenNamepublic	
void	TokenNamevoid	
setNovalidation	TokenNameIdentifier	 set Novalidation
(	TokenNameLPAREN	
boolean	TokenNameboolean	
aBoolean	TokenNameIdentifier	 a Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
novalidation	TokenNameIdentifier	 novalidation
=	TokenNameEQUAL	
aBoolean	TokenNameIdentifier	 a Boolean
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the java compiler to use. * * @param aString the java compiler. */	TokenNameCOMMENT_JAVADOC	 Sets the java compiler to use. * @param aString the java compiler. 
public	TokenNamepublic	
void	TokenNamevoid	
setJavac	TokenNameIdentifier	 set Javac
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aString	TokenNameIdentifier	 a String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
javac	TokenNameIdentifier	 javac
=	TokenNameEQUAL	
aString	TokenNameIdentifier	 a String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the options to pass to the java compiler. * * @param aString the options. */	TokenNameCOMMENT_JAVADOC	 Set the options to pass to the java compiler. * @param aString the options. 
public	TokenNamepublic	
void	TokenNamevoid	
setJavacopts	TokenNameIdentifier	 set Javacopts
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aString	TokenNameIdentifier	 a String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
javacopts	TokenNameIdentifier	 javacopts
=	TokenNameEQUAL	
aString	TokenNameIdentifier	 a String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the options to pass to the rmi compiler. * * @param aString the options. */	TokenNameCOMMENT_JAVADOC	 Set the options to pass to the rmi compiler. * @param aString the options. 
public	TokenNamepublic	
void	TokenNamevoid	
setRmicopts	TokenNameIdentifier	 set Rmicopts
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aString	TokenNameIdentifier	 a String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rmicopts	TokenNameIdentifier	 rmicopts
=	TokenNameEQUAL	
aString	TokenNameIdentifier	 a String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the <code>secpropag</code> flag. * * @param aBoolean <code>true</code> if the flag must be set. */	TokenNameCOMMENT_JAVADOC	 Sets the <code>secpropag</code> flag. * @param aBoolean <code>true</code> if the flag must be set. 
public	TokenNamepublic	
void	TokenNamevoid	
setSecpropag	TokenNameIdentifier	 set Secpropag
(	TokenNameLPAREN	
boolean	TokenNameboolean	
aBoolean	TokenNameIdentifier	 a Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
secpropag	TokenNameIdentifier	 secpropag
=	TokenNameEQUAL	
aBoolean	TokenNameIdentifier	 a Boolean
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the <code>verbose</code> flag. * * @param aBoolean <code>true</code> if the flag must be set. */	TokenNameCOMMENT_JAVADOC	 Sets the <code>verbose</code> flag. * @param aBoolean <code>true</code> if the flag must be set. 
public	TokenNamepublic	
void	TokenNamevoid	
setVerbose	TokenNameIdentifier	 set Verbose
(	TokenNameLPAREN	
boolean	TokenNameboolean	
aBoolean	TokenNameIdentifier	 a Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
verbose	TokenNameIdentifier	 verbose
=	TokenNameEQUAL	
aBoolean	TokenNameIdentifier	 a Boolean
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* -------------------- */	TokenNameCOMMENT_BLOCK	 -------------------- 
/* other options setter */	TokenNameCOMMENT_BLOCK	 other options setter 
/* -------------------- */	TokenNameCOMMENT_BLOCK	 -------------------- 
/** * Set the JOnAS root directory. * * @param aFile the JOnAS root directory. */	TokenNameCOMMENT_JAVADOC	 Set the JOnAS root directory. * @param aFile the JOnAS root directory. 
public	TokenNamepublic	
void	TokenNamevoid	
setJonasroot	TokenNameIdentifier	 set Jonasroot
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
aFile	TokenNameIdentifier	 a File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
jonasroot	TokenNameIdentifier	 jonasroot
=	TokenNameEQUAL	
aFile	TokenNameIdentifier	 a File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the <code>keepgeneric</code> flag. * * @param aBoolean <code>true</code> if the flag must be set. */	TokenNameCOMMENT_JAVADOC	 Sets the <code>keepgeneric</code> flag. * @param aBoolean <code>true</code> if the flag must be set. 
public	TokenNamepublic	
void	TokenNamevoid	
setKeepgeneric	TokenNameIdentifier	 set Keepgeneric
(	TokenNameLPAREN	
boolean	TokenNameboolean	
aBoolean	TokenNameIdentifier	 a Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keepgeneric	TokenNameIdentifier	 keepgeneric
=	TokenNameEQUAL	
aBoolean	TokenNameIdentifier	 a Boolean
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the jar suffix. * * @param aString the string to use as the suffix. */	TokenNameCOMMENT_JAVADOC	 Sets the jar suffix. * @param aString the string to use as the suffix. 
public	TokenNamepublic	
void	TokenNamevoid	
setJarsuffix	TokenNameIdentifier	 set Jarsuffix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aString	TokenNameIdentifier	 a String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
aString	TokenNameIdentifier	 a String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the <code>orb</code> to construct classpath. * * @param aString 'RMI', 'JEREMIE', or 'DAVID'. */	TokenNameCOMMENT_JAVADOC	 Sets the <code>orb</code> to construct classpath. * @param aString 'RMI', 'JEREMIE', or 'DAVID'. 
public	TokenNamepublic	
void	TokenNamevoid	
setOrb	TokenNameIdentifier	 set Orb
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aString	TokenNameIdentifier	 a String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
orb	TokenNameIdentifier	 orb
=	TokenNameEQUAL	
aString	TokenNameIdentifier	 a String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the <code>nogenic</code> flag. * * @param aBoolean <code>true</code> if the flag must be set. */	TokenNameCOMMENT_JAVADOC	 Sets the <code>nogenic</code> flag. * @param aBoolean <code>true</code> if the flag must be set. 
public	TokenNamepublic	
void	TokenNamevoid	
setNogenic	TokenNameIdentifier	 set Nogenic
(	TokenNameLPAREN	
boolean	TokenNameboolean	
aBoolean	TokenNameIdentifier	 a Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nogenic	TokenNameIdentifier	 nogenic
=	TokenNameEQUAL	
aBoolean	TokenNameIdentifier	 a Boolean
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* ------------- */	TokenNameCOMMENT_BLOCK	 ------------- 
/* other methods */	TokenNameCOMMENT_BLOCK	 other methods 
/* ------------- */	TokenNameCOMMENT_BLOCK	 ------------- 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
processDescriptor	TokenNameIdentifier	 process Descriptor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aDescriptorName	TokenNameIdentifier	 a Descriptor Name
,	TokenNameCOMMA	
SAXParser	TokenNameIdentifier	 SAX Parser
saxParser	TokenNameIdentifier	 sax Parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
descriptorName	TokenNameIdentifier	 descriptor Name
=	TokenNameEQUAL	
aDescriptorName	TokenNameIdentifier	 a Descriptor Name
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"JOnAS Deployment Tool processing: "	TokenNameStringLiteral	JOnAS Deployment Tool processing: 
+	TokenNamePLUS	
descriptorName	TokenNameIdentifier	 descriptor Name
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
processDescriptor	TokenNameIdentifier	 process Descriptor
(	TokenNameLPAREN	
descriptorName	TokenNameIdentifier	 descriptor Name
,	TokenNameCOMMA	
saxParser	TokenNameIdentifier	 sax Parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
outputdir	TokenNameIdentifier	 outputdir
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the method deleteOnExit() do not work because the directory is not empty 	TokenNameCOMMENT_LINE	the method deleteOnExit() do not work because the directory is not empty 
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Deleting temp output directory '"	TokenNameStringLiteral	Deleting temp output directory '
+	TokenNamePLUS	
outputdir	TokenNameIdentifier	 outputdir
+	TokenNamePLUS	
"'."	TokenNameStringLiteral	'.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deleteAllFiles	TokenNameIdentifier	 delete All Files
(	TokenNameLPAREN	
outputdir	TokenNameIdentifier	 outputdir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
protected	TokenNameprotected	
void	TokenNamevoid	
writeJar	TokenNameIdentifier	 write Jar
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseName	TokenNameIdentifier	 base Name
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
jarfile	TokenNameIdentifier	 jarfile
,	TokenNameCOMMA	
Hashtable	TokenNameIdentifier	 Hashtable
ejbFiles	TokenNameIdentifier	 ejb Files
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
// create the generic jar first 	TokenNameCOMMENT_LINE	create the generic jar first 
File	TokenNameIdentifier	 File
genericJarFile	TokenNameIdentifier	 generic Jar File
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getVendorOutputJarFile	TokenNameIdentifier	 get Vendor Output Jar File
(	TokenNameLPAREN	
baseName	TokenNameIdentifier	 base Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
writeJar	TokenNameIdentifier	 write Jar
(	TokenNameLPAREN	
baseName	TokenNameIdentifier	 base Name
,	TokenNameCOMMA	
genericJarFile	TokenNameIdentifier	 generic Jar File
,	TokenNameCOMMA	
ejbFiles	TokenNameIdentifier	 ejb Files
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// GenIC call on generic jar 	TokenNameCOMMENT_LINE	GenIC call on generic jar 
addGenICGeneratedFiles	TokenNameIdentifier	 add Gen IC Generated Files
(	TokenNameLPAREN	
genericJarFile	TokenNameIdentifier	 generic Jar File
,	TokenNameCOMMA	
ejbFiles	TokenNameIdentifier	 ejb Files
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create the real jar 	TokenNameCOMMENT_LINE	create the real jar 
super	TokenNamesuper	
.	TokenNameDOT	
writeJar	TokenNameIdentifier	 write Jar
(	TokenNameLPAREN	
baseName	TokenNameIdentifier	 base Name
,	TokenNameCOMMA	
getVendorOutputJarFile	TokenNameIdentifier	 get Vendor Output Jar File
(	TokenNameLPAREN	
baseName	TokenNameIdentifier	 base Name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ejbFiles	TokenNameIdentifier	 ejb Files
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
keepgeneric	TokenNameIdentifier	 keepgeneric
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Deleting generic JAR "	TokenNameStringLiteral	Deleting generic JAR 
+	TokenNamePLUS	
genericJarFile	TokenNameIdentifier	 generic Jar File
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
genericJarFile	TokenNameIdentifier	 generic Jar File
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
protected	TokenNameprotected	
void	TokenNamevoid	
addVendorFiles	TokenNameIdentifier	 add Vendor Files
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
ejbFiles	TokenNameIdentifier	 ejb Files
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ddPrefix	TokenNameIdentifier	 dd Prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// JOnAS-specific descriptor deployment 	TokenNameCOMMENT_LINE	JOnAS-specific descriptor deployment 
jonasDescriptorName	TokenNameIdentifier	 jonas Descriptor Name
=	TokenNameEQUAL	
getJonasDescriptorName	TokenNameIdentifier	 get Jonas Descriptor Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
jonasDD	TokenNameIdentifier	 jonas DD
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
descriptorDir	TokenNameIdentifier	 descriptor Dir
,	TokenNameCOMMA	
jonasDescriptorName	TokenNameIdentifier	 jonas Descriptor Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
jonasDD	TokenNameIdentifier	 jonas DD
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ejbFiles	TokenNameIdentifier	 ejb Files
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
META_DIR	TokenNameIdentifier	 META  DIR
+	TokenNamePLUS	
JONAS_DD	TokenNameIdentifier	 JONAS  DD
,	TokenNameCOMMA	
jonasDD	TokenNameIdentifier	 jonas DD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Unable to locate the JOnAS deployment descriptor. It was expected to be in: "	TokenNameStringLiteral	Unable to locate the JOnAS deployment descriptor. It was expected to be in: 
+	TokenNamePLUS	
jonasDD	TokenNameIdentifier	 jonas DD
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
getVendorOutputJarFile	TokenNameIdentifier	 get Vendor Output Jar File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseName	TokenNameIdentifier	 base Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getDestDir	TokenNameIdentifier	 get Dest Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
baseName	TokenNameIdentifier	 base Name
+	TokenNamePLUS	
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines the name of the JOnAS-specific EJB descriptor using the * specified standard EJB descriptor name. In general, the standard * descriptor will be named "[basename]-ejb-jar.xml", and this method will * return "[basename]-jonas-ejb-jar.xml" or "jonas-[basename].xml" * * @return The name of the JOnAS-specific EJB descriptor file. */	TokenNameCOMMENT_JAVADOC	 Determines the name of the JOnAS-specific EJB descriptor using the specified standard EJB descriptor name. In general, the standard descriptor will be named "[basename]-ejb-jar.xml", and this method will return "[basename]-jonas-ejb-jar.xml" or "jonas-[basename].xml" * @return The name of the JOnAS-specific EJB descriptor file. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getJonasDescriptorName	TokenNameIdentifier	 get Jonas Descriptor Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// descriptorName = <path><basename><basenameterminator><remainder> 	TokenNameCOMMENT_LINE	descriptorName = <path><basename><basenameterminator><remainder> 
// examples = /org/objectweb/fooAppli/foo/Foo-ejb-jar.xml 	TokenNameCOMMENT_LINE	examples = /org/objectweb/fooAppli/foo/Foo-ejb-jar.xml 
// examples = /org/objectweb/fooAppli/foo/Foo.xml (JOnAS convention) 	TokenNameCOMMENT_LINE	examples = /org/objectweb/fooAppli/foo/Foo.xml (JOnAS convention) 
String	TokenNameIdentifier	 String
jonasDN	TokenNameIdentifier	 jonas DN
;	TokenNameSEMICOLON	
// JOnAS-specific DD 	TokenNameCOMMENT_LINE	JOnAS-specific DD 
boolean	TokenNameboolean	
jonasConvention	TokenNameIdentifier	 jonas Convention
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// true if the JOnAS convention is used for the DD 	TokenNameCOMMENT_LINE	true if the JOnAS convention is used for the DD 
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
// Directory path of the EJB descriptor 	TokenNameCOMMENT_LINE	Directory path of the EJB descriptor 
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
;	TokenNameSEMICOLON	
// EJB descriptor file name 	TokenNameCOMMENT_LINE	EJB descriptor file name 
String	TokenNameIdentifier	 String
baseName	TokenNameIdentifier	 base Name
;	TokenNameSEMICOLON	
// Filename appearing before name terminator 	TokenNameCOMMENT_LINE	Filename appearing before name terminator 
String	TokenNameIdentifier	 String
remainder	TokenNameIdentifier	 remainder
;	TokenNameSEMICOLON	
// Filename appearing after the name terminator 	TokenNameCOMMENT_LINE	Filename appearing after the name terminator 
int	TokenNameint	
startOfFileName	TokenNameIdentifier	 start Of File Name
=	TokenNameEQUAL	
descriptorName	TokenNameIdentifier	 descriptor Name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startOfFileName	TokenNameIdentifier	 start Of File Name
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// extract path info 	TokenNameCOMMENT_LINE	extract path info 
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
descriptorName	TokenNameIdentifier	 descriptor Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
startOfFileName	TokenNameIdentifier	 start Of File Name
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
descriptorName	TokenNameIdentifier	 descriptor Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startOfFileName	TokenNameIdentifier	 start Of File Name
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// descriptorName is just a file without path 	TokenNameCOMMENT_LINE	descriptorName is just a file without path 
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
descriptorName	TokenNameIdentifier	 descriptor Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
EJB_DD	TokenNameIdentifier	 EJB  DD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
+	TokenNamePLUS	
JONAS_DD	TokenNameIdentifier	 JONAS  DD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
endOfBaseName	TokenNameIdentifier	 end Of Base Name
=	TokenNameEQUAL	
descriptorName	TokenNameIdentifier	 descriptor Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
baseNameTerminator	TokenNameIdentifier	 base Name Terminator
,	TokenNameCOMMA	
startOfFileName	TokenNameIdentifier	 start Of File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * Check for the odd case where the terminator and/or filename * extension aren't found. These will ensure "jonas-" appears at the * end of the name and before the '.' (if present). */	TokenNameCOMMENT_BLOCK	 Check for the odd case where the terminator and/or filename extension aren't found. These will ensure "jonas-" appears at the end of the name and before the '.' (if present). 
if	TokenNameif	
(	TokenNameLPAREN	
endOfBaseName	TokenNameIdentifier	 end Of Base Name
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// baseNameTerminator not found: the descriptor use the 	TokenNameCOMMENT_LINE	baseNameTerminator not found: the descriptor use the 
// JOnAS naming convention, ie [Foo.xml,jonas-Foo.xml] and 	TokenNameCOMMENT_LINE	JOnAS naming convention, ie [Foo.xml,jonas-Foo.xml] and 
// not [Foo<baseNameTerminator>-ejb-jar.xml, 	TokenNameCOMMENT_LINE	not [Foo<baseNameTerminator>-ejb-jar.xml, 
// Foo<baseNameTerminator>-jonas-ejb-jar.xml]. 	TokenNameCOMMENT_LINE	Foo<baseNameTerminator>-jonas-ejb-jar.xml]. 
endOfBaseName	TokenNameIdentifier	 end Of Base Name
=	TokenNameEQUAL	
descriptorName	TokenNameIdentifier	 descriptor Name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endOfBaseName	TokenNameIdentifier	 end Of Base Name
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no . found 	TokenNameCOMMENT_LINE	no . found 
endOfBaseName	TokenNameIdentifier	 end Of Base Name
=	TokenNameEQUAL	
descriptorName	TokenNameIdentifier	 descriptor Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
jonasConvention	TokenNameIdentifier	 jonas Convention
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
baseName	TokenNameIdentifier	 base Name
=	TokenNameEQUAL	
descriptorName	TokenNameIdentifier	 descriptor Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startOfFileName	TokenNameIdentifier	 start Of File Name
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
endOfBaseName	TokenNameIdentifier	 end Of Base Name
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
remainder	TokenNameIdentifier	 remainder
=	TokenNameEQUAL	
descriptorName	TokenNameIdentifier	 descriptor Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
endOfBaseName	TokenNameIdentifier	 end Of Base Name
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
jonasConvention	TokenNameIdentifier	 jonas Convention
)	TokenNameRPAREN	
{	TokenNameLBRACE	
jonasDN	TokenNameIdentifier	 jonas DN
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
+	TokenNamePLUS	
"jonas-"	TokenNameStringLiteral	jonas-
+	TokenNamePLUS	
baseName	TokenNameIdentifier	 base Name
+	TokenNamePLUS	
".xml"	TokenNameStringLiteral	.xml
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
jonasDN	TokenNameIdentifier	 jonas DN
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
+	TokenNamePLUS	
baseName	TokenNameIdentifier	 base Name
+	TokenNamePLUS	
"jonas-"	TokenNameStringLiteral	jonas-
+	TokenNamePLUS	
remainder	TokenNameIdentifier	 remainder
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Standard EJB descriptor name: "	TokenNameStringLiteral	Standard EJB descriptor name: 
+	TokenNamePLUS	
descriptorName	TokenNameIdentifier	 descriptor Name
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"JOnAS-specific descriptor name: "	TokenNameStringLiteral	JOnAS-specific descriptor name: 
+	TokenNamePLUS	
jonasDN	TokenNameIdentifier	 jonas DN
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
jonasDN	TokenNameIdentifier	 jonas DN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getJarBaseName	TokenNameIdentifier	 get Jar Base Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
descriptorFileName	TokenNameIdentifier	 descriptor File Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
baseName	TokenNameIdentifier	 base Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
namingScheme	TokenNameIdentifier	 naming Scheme
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EjbJar	TokenNameIdentifier	 Ejb Jar
.	TokenNameDOT	
NamingScheme	TokenNameIdentifier	 Naming Scheme
.	TokenNameDOT	
DESCRIPTOR	TokenNameIdentifier	 DESCRIPTOR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// try to find JOnAS specific convention name 	TokenNameCOMMENT_LINE	try to find JOnAS specific convention name 
if	TokenNameif	
(	TokenNameLPAREN	
descriptorFileName	TokenNameIdentifier	 descriptor File Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
baseNameTerminator	TokenNameIdentifier	 base Name Terminator
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// baseNameTerminator not found: the descriptor use the 	TokenNameCOMMENT_LINE	baseNameTerminator not found: the descriptor use the 
// JOnAS naming convention, ie [Foo.xml,jonas-Foo.xml] and 	TokenNameCOMMENT_LINE	JOnAS naming convention, ie [Foo.xml,jonas-Foo.xml] and 
// not [Foo<baseNameTerminator>-ejb-jar.xml, 	TokenNameCOMMENT_LINE	not [Foo<baseNameTerminator>-ejb-jar.xml, 
// Foo<baseNameTerminator>-jonas-ejb-jar.xml]. 	TokenNameCOMMENT_LINE	Foo<baseNameTerminator>-jonas-ejb-jar.xml]. 
String	TokenNameIdentifier	 String
aCanonicalDescriptor	TokenNameIdentifier	 a Canonical Descriptor
=	TokenNameEQUAL	
descriptorFileName	TokenNameIdentifier	 descriptor File Name
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastSeparatorIndex	TokenNameIdentifier	 last Separator Index
=	TokenNameEQUAL	
aCanonicalDescriptor	TokenNameIdentifier	 a Canonical Descriptor
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endOfBaseName	TokenNameIdentifier	 end Of Base Name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastSeparatorIndex	TokenNameIdentifier	 last Separator Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endOfBaseName	TokenNameIdentifier	 end Of Base Name
=	TokenNameEQUAL	
descriptorFileName	TokenNameIdentifier	 descriptor File Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
".xml"	TokenNameStringLiteral	.xml
,	TokenNameCOMMA	
lastSeparatorIndex	TokenNameIdentifier	 last Separator Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
endOfBaseName	TokenNameIdentifier	 end Of Base Name
=	TokenNameEQUAL	
descriptorFileName	TokenNameIdentifier	 descriptor File Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
".xml"	TokenNameStringLiteral	.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endOfBaseName	TokenNameIdentifier	 end Of Base Name
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseName	TokenNameIdentifier	 base Name
=	TokenNameEQUAL	
descriptorFileName	TokenNameIdentifier	 descriptor File Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
endOfBaseName	TokenNameIdentifier	 end Of Base Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
baseName	TokenNameIdentifier	 base Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// else get standard baseName 	TokenNameCOMMENT_LINE	else get standard baseName 
baseName	TokenNameIdentifier	 base Name
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getJarBaseName	TokenNameIdentifier	 get Jar Base Name
(	TokenNameLPAREN	
descriptorFileName	TokenNameIdentifier	 descriptor File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"JAR base name: "	TokenNameStringLiteral	JAR base name: 
+	TokenNamePLUS	
baseName	TokenNameIdentifier	 base Name
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
baseName	TokenNameIdentifier	 base Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
protected	TokenNameprotected	
void	TokenNamevoid	
registerKnownDTDs	TokenNameIdentifier	 register Known DT Ds
(	TokenNameLPAREN	
DescriptorHandler	TokenNameIdentifier	 Descriptor Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
registerDTD	TokenNameIdentifier	 register DTD
(	TokenNameLPAREN	
EJB_JAR_1_1_PUBLIC_ID	TokenNameIdentifier	 EJB  JAR 1 1  PUBLIC  ID
,	TokenNameCOMMA	
jonasroot	TokenNameIdentifier	 jonasroot
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"xml"	TokenNameStringLiteral	xml
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
EJB_JAR_1_1_DTD	TokenNameIdentifier	 EJB  JAR 1 1  DTD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
registerDTD	TokenNameIdentifier	 register DTD
(	TokenNameLPAREN	
EJB_JAR_2_0_PUBLIC_ID	TokenNameIdentifier	 EJB  JAR 2 0  PUBLIC  ID
,	TokenNameCOMMA	
jonasroot	TokenNameIdentifier	 jonasroot
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"xml"	TokenNameStringLiteral	xml
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
EJB_JAR_2_0_DTD	TokenNameIdentifier	 EJB  JAR 2 0  DTD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
registerDTD	TokenNameIdentifier	 register DTD
(	TokenNameLPAREN	
JONAS_EJB_JAR_2_4_PUBLIC_ID	TokenNameIdentifier	 JONAS  EJB  JAR 2 4  PUBLIC  ID
,	TokenNameCOMMA	
jonasroot	TokenNameIdentifier	 jonasroot
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"xml"	TokenNameStringLiteral	xml
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
JONAS_EJB_JAR_2_4_DTD	TokenNameIdentifier	 JONAS  EJB  JAR 2 4  DTD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
registerDTD	TokenNameIdentifier	 register DTD
(	TokenNameLPAREN	
JONAS_EJB_JAR_2_5_PUBLIC_ID	TokenNameIdentifier	 JONAS  EJB  JAR 2 5  PUBLIC  ID
,	TokenNameCOMMA	
jonasroot	TokenNameIdentifier	 jonasroot
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"xml"	TokenNameStringLiteral	xml
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
JONAS_EJB_JAR_2_5_DTD	TokenNameIdentifier	 JONAS  EJB  JAR 2 5  DTD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add to the given hashtable all the file generated by GenIC. * * @param genericJarFile jar file. * @param ejbFiles the hashtable. */	TokenNameCOMMENT_JAVADOC	 Add to the given hashtable all the file generated by GenIC. * @param genericJarFile jar file. @param ejbFiles the hashtable. 
private	TokenNameprivate	
void	TokenNamevoid	
addGenICGeneratedFiles	TokenNameIdentifier	 add Gen IC Generated Files
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
genericJarFile	TokenNameIdentifier	 generic Jar File
,	TokenNameCOMMA	
Hashtable	TokenNameIdentifier	 Hashtable
ejbFiles	TokenNameIdentifier	 ejb Files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Java	TokenNameIdentifier	 Java
genicTask	TokenNameIdentifier	 genic Task
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// GenIC task 	TokenNameCOMMENT_LINE	GenIC task 
String	TokenNameIdentifier	 String
genicClass	TokenNameIdentifier	 genic Class
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// GenIC class (3 are supported for various 	TokenNameCOMMENT_LINE	GenIC class (3 are supported for various 
// versions 	TokenNameCOMMENT_LINE	versions 
if	TokenNameif	
(	TokenNameLPAREN	
nogenic	TokenNameIdentifier	 nogenic
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
genicTask	TokenNameIdentifier	 genic Task
=	TokenNameEQUAL	
new	TokenNamenew	
Java	TokenNameIdentifier	 Java
(	TokenNameLPAREN	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
setTaskName	TokenNameIdentifier	 set Task Name
(	TokenNameLPAREN	
"genic"	TokenNameStringLiteral	genic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
setFork	TokenNameIdentifier	 set Fork
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// jonasroot 	TokenNameCOMMENT_LINE	jonasroot 
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
createJvmarg	TokenNameIdentifier	 create Jvmarg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-Dinstall.root="	TokenNameStringLiteral	-Dinstall.root=
+	TokenNamePLUS	
jonasroot	TokenNameIdentifier	 jonasroot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// java policy file 	TokenNameCOMMENT_LINE	java policy file 
String	TokenNameIdentifier	 String
jonasConfigDir	TokenNameIdentifier	 jonas Config Dir
=	TokenNameEQUAL	
jonasroot	TokenNameIdentifier	 jonasroot
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"config"	TokenNameStringLiteral	config
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
javaPolicyFile	TokenNameIdentifier	 java Policy File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
jonasConfigDir	TokenNameIdentifier	 jonas Config Dir
,	TokenNameCOMMA	
"java.policy"	TokenNameStringLiteral	java.policy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
javaPolicyFile	TokenNameIdentifier	 java Policy File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
createJvmarg	TokenNameIdentifier	 create Jvmarg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-Djava.security.policy="	TokenNameStringLiteral	-Djava.security.policy=
+	TokenNamePLUS	
javaPolicyFile	TokenNameIdentifier	 java Policy File
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// outputdir 	TokenNameCOMMENT_LINE	outputdir 
try	TokenNametry	
{	TokenNameLBRACE	
outputdir	TokenNameIdentifier	 outputdir
=	TokenNameEQUAL	
createTempDir	TokenNameIdentifier	 create Temp Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
aIOException	TokenNameIdentifier	 a IO Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Cannot create temp dir: "	TokenNameStringLiteral	Cannot create temp dir: 
+	TokenNamePLUS	
aIOException	TokenNameIdentifier	 a IO Exception
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
aIOException	TokenNameIdentifier	 a IO Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Using temporary output directory: "	TokenNameStringLiteral	Using temporary output directory: 
+	TokenNamePLUS	
outputdir	TokenNameIdentifier	 outputdir
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-d"	TokenNameStringLiteral	-d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
outputdir	TokenNameIdentifier	 outputdir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// work around a bug of GenIC 2.5 	TokenNameCOMMENT_LINE	work around a bug of GenIC 2.5 
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
ejbFiles	TokenNameIdentifier	 ejb Files
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
outputdir	TokenNameIdentifier	 outputdir
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Worked around a bug of GenIC 2.5."	TokenNameStringLiteral	Worked around a bug of GenIC 2.5.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// classpath 	TokenNameCOMMENT_LINE	classpath 
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
getCombinedClasspath	TokenNameIdentifier	 get Combined Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
jonasConfigDir	TokenNameIdentifier	 jonas Config Dir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
outputdir	TokenNameIdentifier	 outputdir
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// try to create the classpath for the correct ORB 	TokenNameCOMMENT_LINE	try to create the classpath for the correct ORB 
if	TokenNameif	
(	TokenNameLPAREN	
orb	TokenNameIdentifier	 orb
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
orbJar	TokenNameIdentifier	 orb Jar
=	TokenNameEQUAL	
jonasroot	TokenNameIdentifier	 jonasroot
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
orb	TokenNameIdentifier	 orb
+	TokenNamePLUS	
"_jonas.jar"	TokenNameStringLiteral	_jonas.jar
;	TokenNameSEMICOLON	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
orbJar	TokenNameIdentifier	 orb Jar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Using classpath: "	TokenNameStringLiteral	Using classpath: 
+	TokenNamePLUS	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// class name (search in the classpath provided for the ejbjar element) 	TokenNameCOMMENT_LINE	class name (search in the classpath provided for the ejbjar element) 
genicClass	TokenNameIdentifier	 genic Class
=	TokenNameEQUAL	
getGenicClassName	TokenNameIdentifier	 get Genic Class Name
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
genicClass	TokenNameIdentifier	 genic Class
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Cannot find GenIC class in classpath."	TokenNameStringLiteral	Cannot find GenIC class in classpath.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"GenIC class not found, please check the classpath."	TokenNameStringLiteral	GenIC class not found, please check the classpath.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Using '"	TokenNameStringLiteral	Using '
+	TokenNamePLUS	
genicClass	TokenNameIdentifier	 genic Class
+	TokenNamePLUS	
"' GenIC class."	TokenNameStringLiteral	' GenIC class.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
genicClass	TokenNameIdentifier	 genic Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// keepgenerated 	TokenNameCOMMENT_LINE	keepgenerated 
if	TokenNameif	
(	TokenNameLPAREN	
keepgenerated	TokenNameIdentifier	 keepgenerated
)	TokenNameRPAREN	
{	TokenNameLBRACE	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-keepgenerated"	TokenNameStringLiteral	-keepgenerated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// nocompil 	TokenNameCOMMENT_LINE	nocompil 
if	TokenNameif	
(	TokenNameLPAREN	
nocompil	TokenNameIdentifier	 nocompil
)	TokenNameRPAREN	
{	TokenNameLBRACE	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-nocompil"	TokenNameStringLiteral	-nocompil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// novalidation 	TokenNameCOMMENT_LINE	novalidation 
if	TokenNameif	
(	TokenNameLPAREN	
novalidation	TokenNameIdentifier	 novalidation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-novalidation"	TokenNameStringLiteral	-novalidation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// javac 	TokenNameCOMMENT_LINE	javac 
if	TokenNameif	
(	TokenNameLPAREN	
javac	TokenNameIdentifier	 javac
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-javac"	TokenNameStringLiteral	-javac
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLine	TokenNameIdentifier	 set Line
(	TokenNameLPAREN	
javac	TokenNameIdentifier	 javac
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// javacopts 	TokenNameCOMMENT_LINE	javacopts 
if	TokenNameif	
(	TokenNameLPAREN	
javacopts	TokenNameIdentifier	 javacopts
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
javacopts	TokenNameIdentifier	 javacopts
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-javacopts"	TokenNameStringLiteral	-javacopts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLine	TokenNameIdentifier	 set Line
(	TokenNameLPAREN	
javacopts	TokenNameIdentifier	 javacopts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// rmicopts 	TokenNameCOMMENT_LINE	rmicopts 
if	TokenNameif	
(	TokenNameLPAREN	
rmicopts	TokenNameIdentifier	 rmicopts
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
rmicopts	TokenNameIdentifier	 rmicopts
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-rmicopts"	TokenNameStringLiteral	-rmicopts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLine	TokenNameIdentifier	 set Line
(	TokenNameLPAREN	
rmicopts	TokenNameIdentifier	 rmicopts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// secpropag 	TokenNameCOMMENT_LINE	secpropag 
if	TokenNameif	
(	TokenNameLPAREN	
secpropag	TokenNameIdentifier	 secpropag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-secpropag"	TokenNameStringLiteral	-secpropag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// verbose 	TokenNameCOMMENT_LINE	verbose 
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
{	TokenNameLBRACE	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-verbose"	TokenNameStringLiteral	-verbose
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// additionalargs 	TokenNameCOMMENT_LINE	additionalargs 
if	TokenNameif	
(	TokenNameLPAREN	
additionalargs	TokenNameIdentifier	 additionalargs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
additionalargs	TokenNameIdentifier	 additionalargs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// the generated classes must not be added in the generic JAR! 	TokenNameCOMMENT_LINE	the generated classes must not be added in the generic JAR! 
// is that buggy on old JOnAS (2.4) ?? 	TokenNameCOMMENT_LINE	is that buggy on old JOnAS (2.4) ?? 
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-noaddinjar"	TokenNameStringLiteral	-noaddinjar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// input file to process by GenIC 	TokenNameCOMMENT_LINE	input file to process by GenIC 
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
genericJarFile	TokenNameIdentifier	 generic Jar File
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// calling GenIC task 	TokenNameCOMMENT_LINE	calling GenIC task 
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Calling "	TokenNameStringLiteral	Calling 
+	TokenNamePLUS	
genicClass	TokenNameIdentifier	 genic Class
+	TokenNamePLUS	
" for "	TokenNameStringLiteral	 for 
+	TokenNamePLUS	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
descriptorDir	TokenNameIdentifier	 descriptor Dir
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
descriptorName	TokenNameIdentifier	 descriptor Name
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
genicTask	TokenNameIdentifier	 genic Task
.	TokenNameDOT	
executeJava	TokenNameIdentifier	 execute Java
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the method deleteOnExit() do not work because the directory is not empty 	TokenNameCOMMENT_LINE	the method deleteOnExit() do not work because the directory is not empty 
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Deleting temp output directory '"	TokenNameStringLiteral	Deleting temp output directory '
+	TokenNamePLUS	
outputdir	TokenNameIdentifier	 outputdir
+	TokenNamePLUS	
"'."	TokenNameStringLiteral	'.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deleteAllFiles	TokenNameIdentifier	 delete All Files
(	TokenNameLPAREN	
outputdir	TokenNameIdentifier	 outputdir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
keepgeneric	TokenNameIdentifier	 keepgeneric
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Deleting generic JAR "	TokenNameStringLiteral	Deleting generic JAR 
+	TokenNamePLUS	
genericJarFile	TokenNameIdentifier	 generic Jar File
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
genericJarFile	TokenNameIdentifier	 generic Jar File
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"GenIC reported an error."	TokenNameStringLiteral	GenIC reported an error.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// add the generated files to the ejbFiles 	TokenNameCOMMENT_LINE	add the generated files to the ejbFiles 
addAllFiles	TokenNameIdentifier	 add All Files
(	TokenNameLPAREN	
outputdir	TokenNameIdentifier	 outputdir
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
ejbFiles	TokenNameIdentifier	 ejb Files
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the GenIC class name to use in the given classpath. * * @param classpath classpath where the GenIC class must be searched. * @return the GenIC class name. Return <code>null</code> if the class name * cannot be found. */	TokenNameCOMMENT_JAVADOC	 Get the GenIC class name to use in the given classpath. * @param classpath classpath where the GenIC class must be searched. @return the GenIC class name. Return <code>null</code> if the class name cannot be found. 
String	TokenNameIdentifier	 String
getGenicClassName	TokenNameIdentifier	 get Genic Class Name
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Looking for GenIC class in classpath: "	TokenNameStringLiteral	Looking for GenIC class in classpath: 
+	TokenNamePLUS	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
JonasDeploymentTool	TokenNameIdentifier	 Jonas Deployment Tool
.	TokenNameDOT	
GENIC_CLASS	TokenNameIdentifier	 GENIC  CLASS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Found GenIC class '"	TokenNameStringLiteral	Found GenIC class '
+	TokenNamePLUS	
JonasDeploymentTool	TokenNameIdentifier	 Jonas Deployment Tool
.	TokenNameDOT	
GENIC_CLASS	TokenNameIdentifier	 GENIC  CLASS
+	TokenNamePLUS	
"' in classpath."	TokenNameStringLiteral	' in classpath.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
JonasDeploymentTool	TokenNameIdentifier	 Jonas Deployment Tool
.	TokenNameDOT	
GENIC_CLASS	TokenNameIdentifier	 GENIC  CLASS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnf1	TokenNameIdentifier	 cnf1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"GenIC class '"	TokenNameStringLiteral	GenIC class '
+	TokenNamePLUS	
JonasDeploymentTool	TokenNameIdentifier	 Jonas Deployment Tool
.	TokenNameDOT	
GENIC_CLASS	TokenNameIdentifier	 GENIC  CLASS
+	TokenNamePLUS	
"' not found in classpath."	TokenNameStringLiteral	' not found in classpath.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
JonasDeploymentTool	TokenNameIdentifier	 Jonas Deployment Tool
.	TokenNameDOT	
OLD_GENIC_CLASS_1	TokenNameIdentifier	 OLD  GENIC  CLASS 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Found GenIC class '"	TokenNameStringLiteral	Found GenIC class '
+	TokenNamePLUS	
JonasDeploymentTool	TokenNameIdentifier	 Jonas Deployment Tool
.	TokenNameDOT	
OLD_GENIC_CLASS_1	TokenNameIdentifier	 OLD  GENIC  CLASS 1
+	TokenNamePLUS	
"' in classpath."	TokenNameStringLiteral	' in classpath.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
JonasDeploymentTool	TokenNameIdentifier	 Jonas Deployment Tool
.	TokenNameDOT	
OLD_GENIC_CLASS_1	TokenNameIdentifier	 OLD  GENIC  CLASS 1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnf2	TokenNameIdentifier	 cnf2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"GenIC class '"	TokenNameStringLiteral	GenIC class '
+	TokenNamePLUS	
JonasDeploymentTool	TokenNameIdentifier	 Jonas Deployment Tool
.	TokenNameDOT	
OLD_GENIC_CLASS_1	TokenNameIdentifier	 OLD  GENIC  CLASS 1
+	TokenNamePLUS	
"' not found in classpath."	TokenNameStringLiteral	' not found in classpath.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
JonasDeploymentTool	TokenNameIdentifier	 Jonas Deployment Tool
.	TokenNameDOT	
OLD_GENIC_CLASS_2	TokenNameIdentifier	 OLD  GENIC  CLASS 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Found GenIC class '"	TokenNameStringLiteral	Found GenIC class '
+	TokenNamePLUS	
JonasDeploymentTool	TokenNameIdentifier	 Jonas Deployment Tool
.	TokenNameDOT	
OLD_GENIC_CLASS_2	TokenNameIdentifier	 OLD  GENIC  CLASS 2
+	TokenNamePLUS	
"' in classpath."	TokenNameStringLiteral	' in classpath.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
JonasDeploymentTool	TokenNameIdentifier	 Jonas Deployment Tool
.	TokenNameDOT	
OLD_GENIC_CLASS_2	TokenNameIdentifier	 OLD  GENIC  CLASS 2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnf3	TokenNameIdentifier	 cnf3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"GenIC class '"	TokenNameStringLiteral	GenIC class '
+	TokenNamePLUS	
JonasDeploymentTool	TokenNameIdentifier	 Jonas Deployment Tool
.	TokenNameDOT	
OLD_GENIC_CLASS_2	TokenNameIdentifier	 OLD  GENIC  CLASS 2
+	TokenNamePLUS	
"' not found in classpath."	TokenNameStringLiteral	' not found in classpath.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cl	TokenNameIdentifier	 cl
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Verify the configuration. * @param descriptorFileName the name of the descriptor file. * @param saxParser not used. * @throws BuildException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Verify the configuration. @param descriptorFileName the name of the descriptor file. @param saxParser not used. @throws BuildException if there is an error. 
protected	TokenNameprotected	
void	TokenNamevoid	
checkConfiguration	TokenNameIdentifier	 check Configuration
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
descriptorFileName	TokenNameIdentifier	 descriptor File Name
,	TokenNameCOMMA	
SAXParser	TokenNameIdentifier	 SAX Parser
saxParser	TokenNameIdentifier	 sax Parser
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
// jonasroot 	TokenNameCOMMENT_LINE	jonasroot 
if	TokenNameif	
(	TokenNameLPAREN	
jonasroot	TokenNameIdentifier	 jonasroot
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The jonasroot attribut is not set."	TokenNameStringLiteral	The jonasroot attribut is not set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
jonasroot	TokenNameIdentifier	 jonasroot
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
"The jonasroot attribut '"	TokenNameStringLiteral	The jonasroot attribut '
+	TokenNamePLUS	
jonasroot	TokenNameIdentifier	 jonasroot
+	TokenNamePLUS	
"' is not a valid directory."	TokenNameStringLiteral	' is not a valid directory.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// orb 	TokenNameCOMMENT_LINE	orb 
if	TokenNameif	
(	TokenNameLPAREN	
orb	TokenNameIdentifier	 orb
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
orb	TokenNameIdentifier	 orb
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
RMI_ORB	TokenNameIdentifier	 RMI  ORB
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
orb	TokenNameIdentifier	 orb
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
JEREMIE_ORB	TokenNameIdentifier	 JEREMIE  ORB
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
orb	TokenNameIdentifier	 orb
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DAVID_ORB	TokenNameIdentifier	 DAVID  ORB
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The orb attribut '"	TokenNameStringLiteral	The orb attribut '
+	TokenNamePLUS	
orb	TokenNameIdentifier	 orb
+	TokenNamePLUS	
"' is not valid (must be either "	TokenNameStringLiteral	' is not valid (must be either 
+	TokenNamePLUS	
RMI_ORB	TokenNameIdentifier	 RMI  ORB
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
JEREMIE_ORB	TokenNameIdentifier	 JEREMIE  ORB
+	TokenNamePLUS	
" or "	TokenNameStringLiteral	 or 
+	TokenNamePLUS	
DAVID_ORB	TokenNameIdentifier	 DAVID  ORB
+	TokenNamePLUS	
")."	TokenNameStringLiteral	).
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// additionalargs 	TokenNameCOMMENT_LINE	additionalargs 
if	TokenNameif	
(	TokenNameLPAREN	
additionalargs	TokenNameIdentifier	 additionalargs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
additionalargs	TokenNameIdentifier	 additionalargs
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Empty additionalargs attribut."	TokenNameStringLiteral	Empty additionalargs attribut.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// javac 	TokenNameCOMMENT_LINE	javac 
if	TokenNameif	
(	TokenNameLPAREN	
javac	TokenNameIdentifier	 javac
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Empty javac attribut."	TokenNameStringLiteral	Empty javac attribut.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* ----------------------------------------------------------------------------------- */	TokenNameCOMMENT_BLOCK	 ----------------------------------------------------------------------------------- 
/* utilitary methods */	TokenNameCOMMENT_BLOCK	 utilitary methods 
/* ----------------------------------------------------------------------------------- */	TokenNameCOMMENT_BLOCK	 ----------------------------------------------------------------------------------- 
/** * Create a temporary directory for GenIC output. * * @return the temp directory. * @throws BuildException if a temp directory cannot be created. */	TokenNameCOMMENT_JAVADOC	 Create a temporary directory for GenIC output. * @return the temp directory. @throws BuildException if a temp directory cannot be created. 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
createTempDir	TokenNameIdentifier	 create Temp Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
tmpDir	TokenNameIdentifier	 tmp Dir
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"genic"	TokenNameStringLiteral	genic
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmpDir	TokenNameIdentifier	 tmp Dir
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tmpDir	TokenNameIdentifier	 tmp Dir
.	TokenNameDOT	
mkdir	TokenNameIdentifier	 mkdir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Cannot create the temporary directory '"	TokenNameStringLiteral	Cannot create the temporary directory '
+	TokenNamePLUS	
tmpDir	TokenNameIdentifier	 tmp Dir
+	TokenNamePLUS	
"'."	TokenNameStringLiteral	'.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tmpDir	TokenNameIdentifier	 tmp Dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delete a file. If the file is a directory, delete recursivly all the * files inside. * * @param aFile file to delete. */	TokenNameCOMMENT_JAVADOC	 Delete a file. If the file is a directory, delete recursivly all the files inside. * @param aFile file to delete. 
private	TokenNameprivate	
void	TokenNamevoid	
deleteAllFiles	TokenNameIdentifier	 delete All Files
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
aFile	TokenNameIdentifier	 a File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
aFile	TokenNameIdentifier	 a File
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
someFiles	TokenNameIdentifier	 some Files
=	TokenNameEQUAL	
aFile	TokenNameIdentifier	 a File
.	TokenNameDOT	
listFiles	TokenNameIdentifier	 list Files
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
someFiles	TokenNameIdentifier	 some Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deleteAllFiles	TokenNameIdentifier	 delete All Files
(	TokenNameLPAREN	
someFiles	TokenNameIdentifier	 some Files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
aFile	TokenNameIdentifier	 a File
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a file to the a given hashtable. If the file is a directory, add * recursivly all the files inside to the hashtable. * * @param file the file to add. * @param rootDir the current sub-directory to scan. * @param hashtable the hashtable where to add the files. */	TokenNameCOMMENT_JAVADOC	 Add a file to the a given hashtable. If the file is a directory, add recursivly all the files inside to the hashtable. * @param file the file to add. @param rootDir the current sub-directory to scan. @param hashtable the hashtable where to add the files. 
private	TokenNameprivate	
void	TokenNamevoid	
addAllFiles	TokenNameIdentifier	 add All Files
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rootDir	TokenNameIdentifier	 root Dir
,	TokenNameCOMMA	
Hashtable	TokenNameIdentifier	 Hashtable
hashtable	TokenNameIdentifier	 hashtable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
newRootDir	TokenNameIdentifier	 new Root Dir
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
listFiles	TokenNameIdentifier	 list Files
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
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rootDir	TokenNameIdentifier	 root Dir
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newRootDir	TokenNameIdentifier	 new Root Dir
=	TokenNameEQUAL	
rootDir	TokenNameIdentifier	 root Dir
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newRootDir	TokenNameIdentifier	 new Root Dir
=	TokenNameEQUAL	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addAllFiles	TokenNameIdentifier	 add All Files
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
newRootDir	TokenNameIdentifier	 new Root Dir
,	TokenNameCOMMA	
hashtable	TokenNameIdentifier	 hashtable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
hashtable	TokenNameIdentifier	 hashtable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
rootDir	TokenNameIdentifier	 root Dir
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
