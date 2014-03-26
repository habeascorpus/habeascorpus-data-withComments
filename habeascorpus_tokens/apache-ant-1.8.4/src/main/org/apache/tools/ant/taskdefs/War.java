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
/** * An extension of &lt;jar&gt; to create a WAR archive. * Contains special treatment for files that should end up in the * <code>WEB-INF/lib</code>, <code>WEB-INF/classes</code> or * <code>WEB-INF</code> directories of the Web Application Archive.</p> * <p>(The War task is a shortcut for specifying the particular layout of a WAR file. * The same thing can be accomplished by using the <i>prefix</i> and <i>fullpath</i> * attributes of zipfilesets in a Zip or Jar task.)</p> * <p>The extended zipfileset element from the zip task * (with attributes <i>prefix</i>, <i>fullpath</i>, and <i>src</i>) * is available in the War task.</p> * * @since Ant 1.2 * * @ant.task category="packaging" * @see Jar */	TokenNameCOMMENT_JAVADOC	 An extension of &lt;jar&gt; to create a WAR archive. Contains special treatment for files that should end up in the <code>WEB-INF/lib</code>, <code>WEB-INF/classes</code> or <code>WEB-INF</code> directories of the Web Application Archive.</p> <p>(The War task is a shortcut for specifying the particular layout of a WAR file. The same thing can be accomplished by using the <i>prefix</i> and <i>fullpath</i> attributes of zipfilesets in a Zip or Jar task.)</p> <p>The extended zipfileset element from the zip task (with attributes <i>prefix</i>, <i>fullpath</i>, and <i>src</i>) is available in the War task.</p> * @since Ant 1.2 * @ant.task category="packaging" @see Jar 
public	TokenNamepublic	
class	TokenNameclass	
War	TokenNameIdentifier	 War
extends	TokenNameextends	
Jar	TokenNameIdentifier	 Jar
{	TokenNameLBRACE	
/** * our web.xml deployment descriptor */	TokenNameCOMMENT_JAVADOC	 our web.xml deployment descriptor 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
deploymentDescriptor	TokenNameIdentifier	 deployment Descriptor
;	TokenNameSEMICOLON	
/** * flag set if the descriptor is added */	TokenNameCOMMENT_JAVADOC	 flag set if the descriptor is added 
private	TokenNameprivate	
boolean	TokenNameboolean	
needxmlfile	TokenNameIdentifier	 needxmlfile
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
addedWebXmlFile	TokenNameIdentifier	 added Web Xml File
;	TokenNameSEMICOLON	
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
/** path to web.xml file */	TokenNameCOMMENT_JAVADOC	 path to web.xml file 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XML_DESCRIPTOR_PATH	TokenNameIdentifier	 XML  DESCRIPTOR  PATH
=	TokenNameEQUAL	
"WEB-INF/web.xml"	TokenNameStringLiteral	WEB-INF/web.xml
;	TokenNameSEMICOLON	
/** Constructor for the War Task. */	TokenNameCOMMENT_JAVADOC	 Constructor for the War Task. 
public	TokenNamepublic	
War	TokenNameIdentifier	 War
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
archiveType	TokenNameIdentifier	 archive Type
=	TokenNameEQUAL	
"war"	TokenNameStringLiteral	war
;	TokenNameSEMICOLON	
emptyBehavior	TokenNameIdentifier	 empty Behavior
=	TokenNameEQUAL	
"create"	TokenNameStringLiteral	create
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <i>Deprecated<i> name of the file to create * -use <tt>destfile</tt> instead. * @param warFile the destination file * @deprecated since 1.5.x. * Use setDestFile(File) instead * @ant.attribute ignore="true" */	TokenNameCOMMENT_JAVADOC	 <i>Deprecated<i> name of the file to create -use <tt>destfile</tt> instead. @param warFile the destination file @deprecated since 1.5.x. Use setDestFile(File) instead @ant.attribute ignore="true" 
public	TokenNamepublic	
void	TokenNamevoid	
setWarfile	TokenNameIdentifier	 set Warfile
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
warFile	TokenNameIdentifier	 war File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setDestFile	TokenNameIdentifier	 set Dest File
(	TokenNameLPAREN	
warFile	TokenNameIdentifier	 war File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set the deployment descriptor to use (WEB-INF/web.xml); * required unless <tt>update=true</tt> * @param descr the deployment descriptor file */	TokenNameCOMMENT_JAVADOC	 set the deployment descriptor to use (WEB-INF/web.xml); required unless <tt>update=true</tt> @param descr the deployment descriptor file 
public	TokenNamepublic	
void	TokenNamevoid	
setWebxml	TokenNameIdentifier	 set Webxml
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
/** * Set the policy on the web.xml file, that is, whether or not it is needed * @param needxmlfile whether a web.xml file is needed. Default: true */	TokenNameCOMMENT_JAVADOC	 Set the policy on the web.xml file, that is, whether or not it is needed @param needxmlfile whether a web.xml file is needed. Default: true 
public	TokenNamepublic	
void	TokenNamevoid	
setNeedxmlfile	TokenNameIdentifier	 set Needxmlfile
(	TokenNameLPAREN	
boolean	TokenNameboolean	
needxmlfile	TokenNameIdentifier	 needxmlfile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
needxmlfile	TokenNameIdentifier	 needxmlfile
=	TokenNameEQUAL	
needxmlfile	TokenNameIdentifier	 needxmlfile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add files under WEB-INF/lib/ * @param fs the zip file set to add */	TokenNameCOMMENT_JAVADOC	 add files under WEB-INF/lib/ @param fs the zip file set to add 
public	TokenNamepublic	
void	TokenNamevoid	
addLib	TokenNameIdentifier	 add Lib
(	TokenNameLPAREN	
ZipFileSet	TokenNameIdentifier	 Zip File Set
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We just set the prefix for this fileset, and pass it up. 	TokenNameCOMMENT_LINE	We just set the prefix for this fileset, and pass it up. 
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
"WEB-INF/lib/"	TokenNameStringLiteral	WEB-INF/lib/
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
/** * add files under WEB-INF/classes * @param fs the zip file set to add */	TokenNameCOMMENT_JAVADOC	 add files under WEB-INF/classes @param fs the zip file set to add 
public	TokenNamepublic	
void	TokenNamevoid	
addClasses	TokenNameIdentifier	 add Classes
(	TokenNameLPAREN	
ZipFileSet	TokenNameIdentifier	 Zip File Set
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We just set the prefix for this fileset, and pass it up. 	TokenNameCOMMENT_LINE	We just set the prefix for this fileset, and pass it up. 
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
"WEB-INF/classes/"	TokenNameStringLiteral	WEB-INF/classes/
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
/** * files to add under WEB-INF; * @param fs the zip file set to add */	TokenNameCOMMENT_JAVADOC	 files to add under WEB-INF; @param fs the zip file set to add 
public	TokenNamepublic	
void	TokenNamevoid	
addWebinf	TokenNameIdentifier	 add Webinf
(	TokenNameLPAREN	
ZipFileSet	TokenNameIdentifier	 Zip File Set
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We just set the prefix for this fileset, and pass it up. 	TokenNameCOMMENT_LINE	We just set the prefix for this fileset, and pass it up. 
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
"WEB-INF/"	TokenNameStringLiteral	WEB-INF/
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
/** * override of parent; validates configuration * before initializing the output stream. * @param zOut the zip output stream * @throws IOException on output error * @throws BuildException if invalid configuration */	TokenNameCOMMENT_JAVADOC	 override of parent; validates configuration before initializing the output stream. @param zOut the zip output stream @throws IOException on output error @throws BuildException if invalid configuration 
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
super	TokenNamesuper	
.	TokenNameDOT	
initZipOutputStream	TokenNameIdentifier	 init Zip Output Stream
(	TokenNameLPAREN	
zOut	TokenNameIdentifier	 z Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Overridden from Zip class to deal with web.xml * * Here are cases that can arise * -not a web.xml file : add * -first web.xml : add, remember we added it * -same web.xml again: skip * -alternate web.xml : warn and skip * * @param file the file to add to the archive * @param zOut the stream to write to * @param vPath the name this entry shall have in the archive * @param mode the Unix permissions to set. * @throws IOException on output error */	TokenNameCOMMENT_JAVADOC	 Overridden from Zip class to deal with web.xml * Here are cases that can arise -not a web.xml file : add -first web.xml : add, remember we added it -same web.xml again: skip -alternate web.xml : warn and skip * @param file the file to add to the archive @param zOut the stream to write to @param vPath the name this entry shall have in the archive @param mode the Unix permissions to set. @throws IOException on output error 
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
// If the file being added is WEB-INF/web.xml, we warn if it's 	TokenNameCOMMENT_LINE	If the file being added is WEB-INF/web.xml, we warn if it's 
// not the one specified in the "webxml" attribute - or if 	TokenNameCOMMENT_LINE	not the one specified in the "webxml" attribute - or if 
// it's being added twice, meaning the same file is specified 	TokenNameCOMMENT_LINE	it's being added twice, meaning the same file is specified 
// by the "webxml" attribute and in a <fileset> element. 	TokenNameCOMMENT_LINE	by the "webxml" attribute and in a <fileset> element. 
//by default, we add the file. 	TokenNameCOMMENT_LINE	by default, we add the file. 
boolean	TokenNameboolean	
addFile	TokenNameIdentifier	 add File
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
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
//a web.xml file was found. See if it is a duplicate or not 	TokenNameCOMMENT_LINE	a web.xml file was found. See if it is a duplicate or not 
if	TokenNameif	
(	TokenNameLPAREN	
addedWebXmlFile	TokenNameIdentifier	 added Web Xml File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//a second web.xml file, so skip it 	TokenNameCOMMENT_LINE	a second web.xml file, so skip it 
addFile	TokenNameIdentifier	 add File
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//check to see if we warn or not 	TokenNameCOMMENT_LINE	check to see if we warn or not 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
fileNameEquals	TokenNameIdentifier	 file Name Equals
(	TokenNameLPAREN	
addedWebXmlFile	TokenNameIdentifier	 added Web Xml File
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logWhenWriting	TokenNameIdentifier	 log When Writing
(	TokenNameLPAREN	
"Warning: selected "	TokenNameStringLiteral	Warning: selected 
+	TokenNamePLUS	
archiveType	TokenNameIdentifier	 archive Type
+	TokenNamePLUS	
" files include a second "	TokenNameStringLiteral	 files include a second 
+	TokenNamePLUS	
XML_DESCRIPTOR_PATH	TokenNameIdentifier	 XML  DESCRIPTOR  PATH
+	TokenNamePLUS	
" which will be ignored. "	TokenNameStringLiteral	 which will be ignored. 
+	TokenNamePLUS	
"The duplicate entry is at "	TokenNameStringLiteral	The duplicate entry is at 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
+	TokenNamePLUS	
'\n'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
"The file that will be used is "	TokenNameStringLiteral	The file that will be used is 
+	TokenNamePLUS	
addedWebXmlFile	TokenNameIdentifier	 added Web Xml File
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//no added file, yet 	TokenNameCOMMENT_LINE	no added file, yet 
addedWebXmlFile	TokenNameIdentifier	 added Web Xml File
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
//there is no web.xml file, so add it 	TokenNameCOMMENT_LINE	there is no web.xml file, so add it 
addFile	TokenNameIdentifier	 add File
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
//and remember that we did 	TokenNameCOMMENT_LINE	and remember that we did 
deploymentDescriptor	TokenNameIdentifier	 deployment Descriptor
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
addFile	TokenNameIdentifier	 add File
)	TokenNameRPAREN	
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
/** * Make sure we don't think we already have a web.xml next time this task * gets executed. */	TokenNameCOMMENT_JAVADOC	 Make sure we don't think we already have a web.xml next time this task gets executed. 
protected	TokenNameprotected	
void	TokenNamevoid	
cleanUp	TokenNameIdentifier	 clean Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
addedWebXmlFile	TokenNameIdentifier	 added Web Xml File
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
deploymentDescriptor	TokenNameIdentifier	 deployment Descriptor
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
needxmlfile	TokenNameIdentifier	 needxmlfile
&&	TokenNameAND_AND	
!	TokenNameNOT	
isInUpdateMode	TokenNameIdentifier	 is In Update Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
hasUpdatedFile	TokenNameIdentifier	 has Updated File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No WEB-INF/web.xml file was added. "	TokenNameStringLiteral	No WEB-INF/web.xml file was added. 
+	TokenNamePLUS	
"If this is your intent, set needxmlfile='false' "	TokenNameStringLiteral	If this is your intent, set needxmlfile='false' 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addedWebXmlFile	TokenNameIdentifier	 added Web Xml File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
cleanUp	TokenNameIdentifier	 clean Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
