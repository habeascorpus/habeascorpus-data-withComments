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
/** * Deployment tool for Weblogic TOPLink. */	TokenNameCOMMENT_JAVADOC	 Deployment tool for Weblogic TOPLink. 
public	TokenNamepublic	
class	TokenNameclass	
WeblogicTOPLinkDeploymentTool	TokenNameIdentifier	 Weblogic TOP Link Deployment Tool
extends	TokenNameextends	
WeblogicDeploymentTool	TokenNameIdentifier	 Weblogic Deployment Tool
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TL_DTD_LOC	TokenNameIdentifier	 TL  DTD  LOC
=	TokenNameEQUAL	
"http://www.objectpeople.com/tlwl/dtd/toplink-cmp_2_5_1.dtd"	TokenNameStringLiteral	http://www.objectpeople.com/tlwl/dtd/toplink-cmp_2_5_1.dtd
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
toplinkDescriptor	TokenNameIdentifier	 toplink Descriptor
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
toplinkDTD	TokenNameIdentifier	 toplink DTD
;	TokenNameSEMICOLON	
/** * Setter used to store the name of the toplink descriptor. * @param inString the string to use as the descriptor name. */	TokenNameCOMMENT_JAVADOC	 Setter used to store the name of the toplink descriptor. @param inString the string to use as the descriptor name. 
public	TokenNamepublic	
void	TokenNamevoid	
setToplinkdescriptor	TokenNameIdentifier	 set Toplinkdescriptor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
inString	TokenNameIdentifier	 in String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
toplinkDescriptor	TokenNameIdentifier	 toplink Descriptor
=	TokenNameEQUAL	
inString	TokenNameIdentifier	 in String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Setter used to store the location of the toplink DTD file. * This is expected to be an URL (file or otherwise). If running * this on NT using a file URL, the safest thing would be to not use a * drive spec in the URL and make sure the file resides on the drive that * ANT is running from. This will keep the setting in the build XML * platform independent. * * @param inString the string to use as the DTD location. */	TokenNameCOMMENT_JAVADOC	 Setter used to store the location of the toplink DTD file. This is expected to be an URL (file or otherwise). If running this on NT using a file URL, the safest thing would be to not use a drive spec in the URL and make sure the file resides on the drive that ANT is running from. This will keep the setting in the build XML platform independent. * @param inString the string to use as the DTD location. 
public	TokenNamepublic	
void	TokenNamevoid	
setToplinkdtd	TokenNameIdentifier	 set Toplinkdtd
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
inString	TokenNameIdentifier	 in String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
toplinkDTD	TokenNameIdentifier	 toplink DTD
=	TokenNameEQUAL	
inString	TokenNameIdentifier	 in String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the descriptor handler. * @param srcDir the source file. * @return the descriptor handler. */	TokenNameCOMMENT_JAVADOC	 Get the descriptor handler. @param srcDir the source file. @return the descriptor handler. 
protected	TokenNameprotected	
DescriptorHandler	TokenNameIdentifier	 Descriptor Handler
getDescriptorHandler	TokenNameIdentifier	 get Descriptor Handler
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
srcDir	TokenNameIdentifier	 src Dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DescriptorHandler	TokenNameIdentifier	 Descriptor Handler
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getDescriptorHandler	TokenNameIdentifier	 get Descriptor Handler
(	TokenNameLPAREN	
srcDir	TokenNameIdentifier	 src Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
toplinkDTD	TokenNameIdentifier	 toplink DTD
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
registerDTD	TokenNameIdentifier	 register DTD
(	TokenNameLPAREN	
"-//The Object People, Inc.//"	TokenNameStringLiteral	-//The Object People, Inc.//
+	TokenNamePLUS	
"DTD TOPLink for WebLogic CMP 2.5.1//EN"	TokenNameStringLiteral	DTD TOPLink for WebLogic CMP 2.5.1//EN
,	TokenNameCOMMA	
toplinkDTD	TokenNameIdentifier	 toplink DTD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
registerDTD	TokenNameIdentifier	 register DTD
(	TokenNameLPAREN	
"-//The Object People, Inc.//"	TokenNameStringLiteral	-//The Object People, Inc.//
+	TokenNamePLUS	
"DTD TOPLink for WebLogic CMP 2.5.1//EN"	TokenNameStringLiteral	DTD TOPLink for WebLogic CMP 2.5.1//EN
,	TokenNameCOMMA	
TL_DTD_LOC	TokenNameIdentifier	 TL  DTD  LOC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add any vendor specific files which should be included in the * EJB Jar. * @param ejbFiles the hashtable to add files to. * @param ddPrefix the prefix to use. */	TokenNameCOMMENT_JAVADOC	 Add any vendor specific files which should be included in the EJB Jar. @param ejbFiles the hashtable to add files to. @param ddPrefix the prefix to use. 
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
super	TokenNamesuper	
.	TokenNameDOT	
addVendorFiles	TokenNameIdentifier	 add Vendor Files
(	TokenNameLPAREN	
ejbFiles	TokenNameIdentifier	 ejb Files
,	TokenNameCOMMA	
ddPrefix	TokenNameIdentifier	 dd Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Then the toplink deployment descriptor 	TokenNameCOMMENT_LINE	Then the toplink deployment descriptor 
// Setup a naming standard here?. 	TokenNameCOMMENT_LINE	Setup a naming standard here?. 
File	TokenNameIdentifier	 File
toplinkDD	TokenNameIdentifier	 toplink DD
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
toplinkDescriptor	TokenNameIdentifier	 toplink Descriptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
toplinkDD	TokenNameIdentifier	 toplink DD
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
toplinkDescriptor	TokenNameIdentifier	 toplink Descriptor
,	TokenNameCOMMA	
toplinkDD	TokenNameIdentifier	 toplink DD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Unable to locate toplink deployment descriptor. "	TokenNameStringLiteral	Unable to locate toplink deployment descriptor. 
+	TokenNamePLUS	
"It was expected to be in "	TokenNameStringLiteral	It was expected to be in 
+	TokenNamePLUS	
toplinkDD	TokenNameIdentifier	 toplink DD
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called to validate that the tool parameters have been configured. * @throws BuildException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Called to validate that the tool parameters have been configured. @throws BuildException if there is an error. 
public	TokenNamepublic	
void	TokenNamevoid	
validateConfigured	TokenNameIdentifier	 validate Configured
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
validateConfigured	TokenNameIdentifier	 validate Configured
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
toplinkDescriptor	TokenNameIdentifier	 toplink Descriptor
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The toplinkdescriptor attribute must "	TokenNameStringLiteral	The toplinkdescriptor attribute must 
+	TokenNamePLUS	
"be specified"	TokenNameStringLiteral	be specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
