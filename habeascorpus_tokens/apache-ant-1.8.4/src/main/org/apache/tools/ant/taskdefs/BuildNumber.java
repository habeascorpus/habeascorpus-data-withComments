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
FileInputStream	TokenNameIdentifier	 File Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
Properties	TokenNameIdentifier	 Properties
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
/** * Read, increment, and write a build number in a file * It will first * attempt to read a build number from a file, then set the property * "build.number" to the value that was read in (or 0 if no such value). Then * it will increment the build number by one and write it back out into the * file. * * @since Ant 1.5 * @ant.task name="buildnumber" */	TokenNameCOMMENT_JAVADOC	 Read, increment, and write a build number in a file It will first attempt to read a build number from a file, then set the property "build.number" to the value that was read in (or 0 if no such value). Then it will increment the build number by one and write it back out into the file. * @since Ant 1.5 @ant.task name="buildnumber" 
public	TokenNamepublic	
class	TokenNameclass	
BuildNumber	TokenNameIdentifier	 Build Number
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/** * The name of the property in which the build number is stored. */	TokenNameCOMMENT_JAVADOC	 The name of the property in which the build number is stored. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_PROPERTY_NAME	TokenNameIdentifier	 DEFAULT  PROPERTY  NAME
=	TokenNameEQUAL	
"build.number"	TokenNameStringLiteral	build.number
;	TokenNameSEMICOLON	
/** The default filename to use if no file specified. */	TokenNameCOMMENT_JAVADOC	 The default filename to use if no file specified. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_FILENAME	TokenNameIdentifier	 DEFAULT  FILENAME
=	TokenNameEQUAL	
DEFAULT_PROPERTY_NAME	TokenNameIdentifier	 DEFAULT  PROPERTY  NAME
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
/** The File in which the build number is stored. */	TokenNameCOMMENT_JAVADOC	 The File in which the build number is stored. 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
myFile	TokenNameIdentifier	 my File
;	TokenNameSEMICOLON	
/** * The file in which the build number is stored. Defaults to * "build.number" if not specified. * * @param file the file in which build number is stored. */	TokenNameCOMMENT_JAVADOC	 The file in which the build number is stored. Defaults to "build.number" if not specified. * @param file the file in which build number is stored. 
public	TokenNamepublic	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
myFile	TokenNameIdentifier	 my File
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Run task. * * @exception BuildException if an error occurs */	TokenNameCOMMENT_JAVADOC	 Run task. * @exception BuildException if an error occurs 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
savedFile	TokenNameIdentifier	 saved File
=	TokenNameEQUAL	
myFile	TokenNameIdentifier	 my File
;	TokenNameSEMICOLON	
// may be altered in validate 	TokenNameCOMMENT_LINE	may be altered in validate 
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Properties	TokenNameIdentifier	 Properties
properties	TokenNameIdentifier	 properties
=	TokenNameEQUAL	
loadProperties	TokenNameIdentifier	 load Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
buildNumber	TokenNameIdentifier	 build Number
=	TokenNameEQUAL	
getBuildNumber	TokenNameIdentifier	 get Build Number
(	TokenNameLPAREN	
properties	TokenNameIdentifier	 properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DEFAULT_PROPERTY_NAME	TokenNameIdentifier	 DEFAULT  PROPERTY  NAME
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
buildNumber	TokenNameIdentifier	 build Number
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Write the properties file back out 	TokenNameCOMMENT_LINE	Write the properties file back out 
FileOutputStream	TokenNameIdentifier	 File Output Stream
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
myFile	TokenNameIdentifier	 my File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
"Build Number for ANT. Do not edit!"	TokenNameStringLiteral	Build Number for ANT. Do not edit!
;	TokenNameSEMICOLON	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
store	TokenNameIdentifier	 store
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
final	TokenNamefinal	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"Error while writing "	TokenNameStringLiteral	Error while writing 
+	TokenNamePLUS	
myFile	TokenNameIdentifier	 my File
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
final	TokenNamefinal	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"error closing output stream "	TokenNameStringLiteral	error closing output stream 
+	TokenNamePLUS	
ioe	TokenNameIdentifier	 ioe
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
myFile	TokenNameIdentifier	 my File
=	TokenNameEQUAL	
savedFile	TokenNameIdentifier	 saved File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Finally set the property 	TokenNameCOMMENT_LINE	Finally set the property 
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
DEFAULT_PROPERTY_NAME	TokenNameIdentifier	 DEFAULT  PROPERTY  NAME
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
buildNumber	TokenNameIdentifier	 build Number
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Utility method to retrieve build number from properties object. * * @param properties the properties to retrieve build number from * @return the build number or if no number in properties object * @throws BuildException if build.number property is not an integer */	TokenNameCOMMENT_JAVADOC	 Utility method to retrieve build number from properties object. * @param properties the properties to retrieve build number from @return the build number or if no number in properties object @throws BuildException if build.number property is not an integer 
private	TokenNameprivate	
int	TokenNameint	
getBuildNumber	TokenNameIdentifier	 get Build Number
(	TokenNameLPAREN	
final	TokenNamefinal	
Properties	TokenNameIdentifier	 Properties
properties	TokenNameIdentifier	 properties
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
buildNumber	TokenNameIdentifier	 build Number
=	TokenNameEQUAL	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
DEFAULT_PROPERTY_NAME	TokenNameIdentifier	 DEFAULT  PROPERTY  NAME
,	TokenNameCOMMA	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Try parsing the line into an integer. 	TokenNameCOMMENT_LINE	Try parsing the line into an integer. 
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
buildNumber	TokenNameIdentifier	 build Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
final	TokenNamefinal	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfe	TokenNameIdentifier	 nfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
myFile	TokenNameIdentifier	 my File
+	TokenNamePLUS	
" contains a non integer build number: "	TokenNameStringLiteral	 contains a non integer build number: 
+	TokenNamePLUS	
buildNumber	TokenNameIdentifier	 build Number
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
nfe	TokenNameIdentifier	 nfe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Utility method to load properties from file. * * @return the loaded properties * @throws BuildException */	TokenNameCOMMENT_JAVADOC	 Utility method to load properties from file. * @return the loaded properties @throws BuildException 
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
loadProperties	TokenNameIdentifier	 load Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
FileInputStream	TokenNameIdentifier	 File Input Stream
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
Properties	TokenNameIdentifier	 Properties
properties	TokenNameIdentifier	 properties
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
myFile	TokenNameIdentifier	 my File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
properties	TokenNameIdentifier	 properties
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
final	TokenNamefinal	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
final	TokenNamefinal	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"error closing input stream "	TokenNameStringLiteral	error closing input stream 
+	TokenNamePLUS	
ioe	TokenNameIdentifier	 ioe
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Validate that the task parameters are valid. * * @throws BuildException if parameters are invalid */	TokenNameCOMMENT_JAVADOC	 Validate that the task parameters are valid. * @throws BuildException if parameters are invalid 
private	TokenNameprivate	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
myFile	TokenNameIdentifier	 my File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
myFile	TokenNameIdentifier	 my File
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DEFAULT_FILENAME	TokenNameIdentifier	 DEFAULT  FILENAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
myFile	TokenNameIdentifier	 my File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
createNewFile	TokenNameIdentifier	 create New File
(	TokenNameLPAREN	
myFile	TokenNameIdentifier	 my File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
final	TokenNamefinal	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
myFile	TokenNameIdentifier	 my File
+	TokenNamePLUS	
" doesn't exist and new file can't be created."	TokenNameStringLiteral	 doesn't exist and new file can't be created.
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
myFile	TokenNameIdentifier	 my File
.	TokenNameDOT	
canRead	TokenNameIdentifier	 can Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"Unable to read from "	TokenNameStringLiteral	Unable to read from 
+	TokenNamePLUS	
myFile	TokenNameIdentifier	 my File
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
myFile	TokenNameIdentifier	 my File
.	TokenNameDOT	
canWrite	TokenNameIdentifier	 can Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"Unable to write to "	TokenNameStringLiteral	Unable to write to 
+	TokenNamePLUS	
myFile	TokenNameIdentifier	 my File
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
