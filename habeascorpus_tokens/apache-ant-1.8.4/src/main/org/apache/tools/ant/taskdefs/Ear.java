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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
ZipFileSet	TokenNameIdentifier	 Zip File Set
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
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
;	TokenNameSEMICOLON	
/** * Creates a EAR archive. Based on WAR task * * @since Ant 1.4 * * @ant.task category="packaging" */	TokenNameCOMMENT_JAVADOC	 Creates a EAR archive. Based on WAR task * @since Ant 1.4 * @ant.task category="packaging" 
public	TokenNamepublic	
class	TokenNameclass	
Ear	TokenNameIdentifier	 Ear
extends	TokenNameextends	
Jar	TokenNameIdentifier	 Jar
{	TokenNameLBRACE	
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
private	TokenNameprivate	
File	TokenNameIdentifier	 File
deploymentDescriptor	TokenNameIdentifier	 deployment Descriptor
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
descriptorAdded	TokenNameIdentifier	 descriptor Added
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XML_DESCRIPTOR_PATH	TokenNameIdentifier	 XML  DESCRIPTOR  PATH
=	TokenNameEQUAL	
"META-INF/application.xml"	TokenNameStringLiteral	META-INF/application.xml
;	TokenNameSEMICOLON	
/** * Create an Ear task. */	TokenNameCOMMENT_JAVADOC	 Create an Ear task. 
public	TokenNamepublic	
Ear	TokenNameIdentifier	 Ear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
archiveType	TokenNameIdentifier	 archive Type
=	TokenNameEQUAL	
"ear"	TokenNameStringLiteral	ear
;	TokenNameSEMICOLON	
emptyBehavior	TokenNameIdentifier	 empty Behavior
=	TokenNameEQUAL	
"create"	TokenNameStringLiteral	create
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the destination file. * @param earFile the destination file * @deprecated since 1.5.x. * Use setDestFile(destfile) instead. */	TokenNameCOMMENT_JAVADOC	 Set the destination file. @param earFile the destination file @deprecated since 1.5.x. Use setDestFile(destfile) instead. 
public	TokenNamepublic	
void	TokenNamevoid	
setEarfile	TokenNameIdentifier	 set Earfile
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
earFile	TokenNameIdentifier	 ear File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setDestFile	TokenNameIdentifier	 set Dest File
(	TokenNameLPAREN	
earFile	TokenNameIdentifier	 ear File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * File to incorporate as application.xml. * @param descr the descriptor file */	TokenNameCOMMENT_JAVADOC	 File to incorporate as application.xml. @param descr the descriptor file 
public	TokenNamepublic	
void	TokenNamevoid	
setAppxml	TokenNameIdentifier	 set Appxml
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
descr	TokenNameIdentifier	 descr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deploymentDescriptor	TokenNameIdentifier	 deployment Descriptor
=	TokenNameEQUAL	
descr	TokenNameIdentifier	 descr
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
deploymentDescriptor	TokenNameIdentifier	 deployment Descriptor
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Deployment descriptor: "	TokenNameStringLiteral	Deployment descriptor: 
+	TokenNamePLUS	
deploymentDescriptor	TokenNameIdentifier	 deployment Descriptor
+	TokenNamePLUS	
" does not exist."	TokenNameStringLiteral	 does not exist.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Create a ZipFileSet for this file, and pass it up. 	TokenNameCOMMENT_LINE	Create a ZipFileSet for this file, and pass it up. 
ZipFileSet	TokenNameIdentifier	 Zip File Set
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
new	TokenNamenew	
ZipFileSet	TokenNameIdentifier	 Zip File Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
deploymentDescriptor	TokenNameIdentifier	 deployment Descriptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setFullpath	TokenNameIdentifier	 set Fullpath
(	TokenNameLPAREN	
XML_DESCRIPTOR_PATH	TokenNameIdentifier	 XML  DESCRIPTOR  PATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
addFileset	TokenNameIdentifier	 add Fileset
(	TokenNameLPAREN	
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds zipfileset. * * @param fs zipfileset to add */	TokenNameCOMMENT_JAVADOC	 Adds zipfileset. * @param fs zipfileset to add 
public	TokenNamepublic	
void	TokenNamevoid	
addArchives	TokenNameIdentifier	 add Archives
(	TokenNameLPAREN	
ZipFileSet	TokenNameIdentifier	 Zip File Set
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We just set the prefix for this fileset, and pass it up. 	TokenNameCOMMENT_LINE	We just set the prefix for this fileset, and pass it up. 
// Do we need to do this? LH 	TokenNameCOMMENT_LINE	Do we need to do this? LH 
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
addFileset	TokenNameIdentifier	 add Fileset
(	TokenNameLPAREN	
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize the output stream. * @param zOut the zip output stream. * @throws IOException on I/O errors * @throws BuildException on other errors */	TokenNameCOMMENT_JAVADOC	 Initialize the output stream. @param zOut the zip output stream. @throws IOException on I/O errors @throws BuildException on other errors 
protected	TokenNameprotected	
void	TokenNamevoid	
initZipOutputStream	TokenNameIdentifier	 init Zip Output Stream
(	TokenNameLPAREN	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
zOut	TokenNameIdentifier	 z Out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
// If no webxml file is specified, it's an error. 	TokenNameCOMMENT_LINE	If no webxml file is specified, it's an error. 
if	TokenNameif	
(	TokenNameLPAREN	
deploymentDescriptor	TokenNameIdentifier	 deployment Descriptor
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
isInUpdateMode	TokenNameIdentifier	 is In Update Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"appxml attribute is required"	TokenNameStringLiteral	appxml attribute is required
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
initZipOutputStream	TokenNameIdentifier	 init Zip Output Stream
(	TokenNameLPAREN	
zOut	TokenNameIdentifier	 z Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Overridden from Zip class to deal with application.xml * @param file the file to add to the archive * @param zOut the stream to write to * @param vPath the name this entry shall have in the archive * @param mode the Unix permissions to set. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Overridden from Zip class to deal with application.xml @param file the file to add to the archive @param zOut the stream to write to @param vPath the name this entry shall have in the archive @param mode the Unix permissions to set. @throws IOException on error 
protected	TokenNameprotected	
void	TokenNamevoid	
zipFile	TokenNameIdentifier	 zip File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
zOut	TokenNameIdentifier	 z Out
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
vPath	TokenNameIdentifier	 v Path
,	TokenNameCOMMA	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// If the file being added is META-INF/application.xml, we 	TokenNameCOMMENT_LINE	If the file being added is META-INF/application.xml, we 
// warn if it's not the one specified in the "appxml" 	TokenNameCOMMENT_LINE	warn if it's not the one specified in the "appxml" 
// attribute - or if it's being added twice, meaning the same 	TokenNameCOMMENT_LINE	attribute - or if it's being added twice, meaning the same 
// file is specified by the "appxml" attribute and in a 	TokenNameCOMMENT_LINE	file is specified by the "appxml" attribute and in a 
// <fileset> element. 	TokenNameCOMMENT_LINE	<fileset> element. 
if	TokenNameif	
(	TokenNameLPAREN	
XML_DESCRIPTOR_PATH	TokenNameIdentifier	 XML  DESCRIPTOR  PATH
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
vPath	TokenNameIdentifier	 v Path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
deploymentDescriptor	TokenNameIdentifier	 deployment Descriptor
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
fileNameEquals	TokenNameIdentifier	 file Name Equals
(	TokenNameLPAREN	
deploymentDescriptor	TokenNameIdentifier	 deployment Descriptor
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
||	TokenNameOR_OR	
descriptorAdded	TokenNameIdentifier	 descriptor Added
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logWhenWriting	TokenNameIdentifier	 log When Writing
(	TokenNameLPAREN	
"Warning: selected "	TokenNameStringLiteral	Warning: selected 
+	TokenNamePLUS	
archiveType	TokenNameIdentifier	 archive Type
+	TokenNamePLUS	
" files include a "	TokenNameStringLiteral	 files include a 
+	TokenNamePLUS	
XML_DESCRIPTOR_PATH	TokenNameIdentifier	 XML  DESCRIPTOR  PATH
+	TokenNamePLUS	
" which will"	TokenNameStringLiteral	 which will
+	TokenNamePLUS	
" be ignored (please use appxml attribute to "	TokenNameStringLiteral	 be ignored (please use appxml attribute to 
+	TokenNamePLUS	
archiveType	TokenNameIdentifier	 archive Type
+	TokenNamePLUS	
" task)"	TokenNameStringLiteral	 task)
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
zipFile	TokenNameIdentifier	 zip File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
zOut	TokenNameIdentifier	 z Out
,	TokenNameCOMMA	
vPath	TokenNameIdentifier	 v Path
,	TokenNameCOMMA	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
descriptorAdded	TokenNameIdentifier	 descriptor Added
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
zipFile	TokenNameIdentifier	 zip File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
zOut	TokenNameIdentifier	 z Out
,	TokenNameCOMMA	
vPath	TokenNameIdentifier	 v Path
,	TokenNameCOMMA	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Make sure we don't think we already have a application.xml next * time this task gets executed. */	TokenNameCOMMENT_JAVADOC	 Make sure we don't think we already have a application.xml next time this task gets executed. 
protected	TokenNameprotected	
void	TokenNamevoid	
cleanUp	TokenNameIdentifier	 clean Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
descriptorAdded	TokenNameIdentifier	 descriptor Added
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
cleanUp	TokenNameIdentifier	 clean Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
