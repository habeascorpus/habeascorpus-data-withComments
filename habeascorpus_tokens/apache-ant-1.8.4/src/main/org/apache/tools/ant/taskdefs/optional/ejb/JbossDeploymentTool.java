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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
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
/** * The deployment tool to add the jboss specific deployment descriptor to the ejb jar file. * Jboss only requires one additional file jboss.xml and does not require any additional * compilation. * * @version 1.0 * @see EjbJar#createJboss */	TokenNameCOMMENT_JAVADOC	 The deployment tool to add the jboss specific deployment descriptor to the ejb jar file. Jboss only requires one additional file jboss.xml and does not require any additional compilation. * @version 1.0 @see EjbJar#createJboss 
public	TokenNamepublic	
class	TokenNameclass	
JbossDeploymentTool	TokenNameIdentifier	 Jboss Deployment Tool
extends	TokenNameextends	
GenericDeploymentTool	TokenNameIdentifier	 Generic Deployment Tool
{	TokenNameLBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JBOSS_DD	TokenNameIdentifier	 JBOSS  DD
=	TokenNameEQUAL	
"jboss.xml"	TokenNameStringLiteral	jboss.xml
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JBOSS_CMP10D	TokenNameIdentifier	 JBOSS  CM P10 D
=	TokenNameEQUAL	
"jaws.xml"	TokenNameStringLiteral	jaws.xml
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JBOSS_CMP20D	TokenNameIdentifier	 JBOSS  CM P20 D
=	TokenNameEQUAL	
"jbosscmp-jdbc.xml"	TokenNameStringLiteral	jbosscmp-jdbc.xml
;	TokenNameSEMICOLON	
/** Instance variable that stores the suffix for the jboss jarfile. */	TokenNameCOMMENT_JAVADOC	 Instance variable that stores the suffix for the jboss jarfile. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
jarSuffix	TokenNameIdentifier	 jar Suffix
=	TokenNameEQUAL	
".jar"	TokenNameStringLiteral	.jar
;	TokenNameSEMICOLON	
/** * Setter used to store the suffix for the generated JBoss jar file. * @param inString the string to use as the suffix. */	TokenNameCOMMENT_JAVADOC	 Setter used to store the suffix for the generated JBoss jar file. @param inString the string to use as the suffix. 
public	TokenNamepublic	
void	TokenNamevoid	
setSuffix	TokenNameIdentifier	 set Suffix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
inString	TokenNameIdentifier	 in String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
jarSuffix	TokenNameIdentifier	 jar Suffix
=	TokenNameEQUAL	
inString	TokenNameIdentifier	 in String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add any vendor specific files which should be included in the * EJB Jar. * @param ejbFiles the hashtable of files to populate. * @param ddPrefix the prefix to use. */	TokenNameCOMMENT_JAVADOC	 Add any vendor specific files which should be included in the EJB Jar. @param ejbFiles the hashtable of files to populate. @param ddPrefix the prefix to use. 
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
File	TokenNameIdentifier	 File
jbossDD	TokenNameIdentifier	 jboss DD
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
ddPrefix	TokenNameIdentifier	 dd Prefix
+	TokenNamePLUS	
JBOSS_DD	TokenNameIdentifier	 JBOSS  DD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
jbossDD	TokenNameIdentifier	 jboss DD
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
JBOSS_DD	TokenNameIdentifier	 JBOSS  DD
,	TokenNameCOMMA	
jbossDD	TokenNameIdentifier	 jboss DD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Unable to locate jboss deployment descriptor. "	TokenNameStringLiteral	Unable to locate jboss deployment descriptor. 
+	TokenNamePLUS	
"It was expected to be in "	TokenNameStringLiteral	It was expected to be in 
+	TokenNamePLUS	
jbossDD	TokenNameIdentifier	 jboss DD
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
descriptorFileName	TokenNameIdentifier	 descriptor File Name
=	TokenNameEQUAL	
JBOSS_CMP10D	TokenNameIdentifier	 JBOSS  CM P10 D
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
EjbJar	TokenNameIdentifier	 Ejb Jar
.	TokenNameDOT	
CMPVersion	TokenNameIdentifier	 CMP Version
.	TokenNameDOT	
CMP2_0	TokenNameIdentifier	 CM P2 0
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCmpversion	TokenNameIdentifier	 get Cmpversion
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
descriptorFileName	TokenNameIdentifier	 descriptor File Name
=	TokenNameEQUAL	
JBOSS_CMP20D	TokenNameIdentifier	 JBOSS  CM P20 D
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
jbossCMPD	TokenNameIdentifier	 jboss CMPD
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
ddPrefix	TokenNameIdentifier	 dd Prefix
+	TokenNamePLUS	
descriptorFileName	TokenNameIdentifier	 descriptor File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
jbossCMPD	TokenNameIdentifier	 jboss CMPD
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
descriptorFileName	TokenNameIdentifier	 descriptor File Name
,	TokenNameCOMMA	
jbossCMPD	TokenNameIdentifier	 jboss CMPD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Unable to locate jboss cmp descriptor. "	TokenNameStringLiteral	Unable to locate jboss cmp descriptor. 
+	TokenNamePLUS	
"It was expected to be in "	TokenNameStringLiteral	It was expected to be in 
+	TokenNamePLUS	
jbossCMPD	TokenNameIdentifier	 jboss CMPD
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the vendor specific name of the Jar that will be output. The modification date * of this jar will be checked against the dependent bean classes. */	TokenNameCOMMENT_JAVADOC	 Get the vendor specific name of the Jar that will be output. The modification date of this jar will be checked against the dependent bean classes. 
File	TokenNameIdentifier	 File
getVendorOutputJarFile	TokenNameIdentifier	 get Vendor Output Jar File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseName	TokenNameIdentifier	 base Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getDestDir	TokenNameIdentifier	 get Dest Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDestdir	TokenNameIdentifier	 get Destdir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"DestDir not specified"	TokenNameStringLiteral	DestDir not specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getDestDir	TokenNameIdentifier	 get Dest Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDestdir	TokenNameIdentifier	 get Destdir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
baseName	TokenNameIdentifier	 base Name
+	TokenNamePLUS	
jarSuffix	TokenNameIdentifier	 jar Suffix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
jarSuffix	TokenNameIdentifier	 jar Suffix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called to validate that the tool parameters have been configured. * * @throws BuildException If the Deployment Tool's configuration isn't * valid * @since ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Called to validate that the tool parameters have been configured. * @throws BuildException If the Deployment Tool's configuration isn't valid @since ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
validateConfigured	TokenNameIdentifier	 validate Configured
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
EjbJar	TokenNameIdentifier	 Ejb Jar
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
EjbJar	TokenNameIdentifier	 Ejb Jar
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
