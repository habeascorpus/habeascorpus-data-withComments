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
sos	TokenNameIdentifier	 sos
;	TokenNameSEMICOLON	
/** * Interface to hold constants used by the SOS tasks * */	TokenNameCOMMENT_JAVADOC	 Interface to hold constants used by the SOS tasks 
// CheckStyle:InterfaceIsTypeCheck OFF (bc) 	TokenNameCOMMENT_LINE	CheckStyle:InterfaceIsTypeCheck OFF (bc) 
public	TokenNamepublic	
interface	TokenNameinterface	
SOSCmd	TokenNameIdentifier	 SOS Cmd
{	TokenNameLBRACE	
// soscmd Command options 	TokenNameCOMMENT_LINE	soscmd Command options 
/** The sos executable */	TokenNameCOMMENT_JAVADOC	 The sos executable 
String	TokenNameIdentifier	 String
COMMAND_SOS_EXE	TokenNameIdentifier	 COMMAND  SOS  EXE
=	TokenNameEQUAL	
"soscmd"	TokenNameStringLiteral	soscmd
;	TokenNameSEMICOLON	
/** The get file command */	TokenNameCOMMENT_JAVADOC	 The get file command 
String	TokenNameIdentifier	 String
COMMAND_GET_FILE	TokenNameIdentifier	 COMMAND  GET  FILE
=	TokenNameEQUAL	
"GetFile"	TokenNameStringLiteral	GetFile
;	TokenNameSEMICOLON	
/** The get project command */	TokenNameCOMMENT_JAVADOC	 The get project command 
String	TokenNameIdentifier	 String
COMMAND_GET_PROJECT	TokenNameIdentifier	 COMMAND  GET  PROJECT
=	TokenNameEQUAL	
"GetProject"	TokenNameStringLiteral	GetProject
;	TokenNameSEMICOLON	
/** The checkout file command */	TokenNameCOMMENT_JAVADOC	 The checkout file command 
String	TokenNameIdentifier	 String
COMMAND_CHECKOUT_FILE	TokenNameIdentifier	 COMMAND  CHECKOUT  FILE
=	TokenNameEQUAL	
"CheckOutFile"	TokenNameStringLiteral	CheckOutFile
;	TokenNameSEMICOLON	
/** The checkout project command */	TokenNameCOMMENT_JAVADOC	 The checkout project command 
String	TokenNameIdentifier	 String
COMMAND_CHECKOUT_PROJECT	TokenNameIdentifier	 COMMAND  CHECKOUT  PROJECT
=	TokenNameEQUAL	
"CheckOutProject"	TokenNameStringLiteral	CheckOutProject
;	TokenNameSEMICOLON	
/** The checkin file command */	TokenNameCOMMENT_JAVADOC	 The checkin file command 
String	TokenNameIdentifier	 String
COMMAND_CHECKIN_FILE	TokenNameIdentifier	 COMMAND  CHECKIN  FILE
=	TokenNameEQUAL	
"CheckInFile"	TokenNameStringLiteral	CheckInFile
;	TokenNameSEMICOLON	
/** The checkin project command */	TokenNameCOMMENT_JAVADOC	 The checkin project command 
String	TokenNameIdentifier	 String
COMMAND_CHECKIN_PROJECT	TokenNameIdentifier	 COMMAND  CHECKIN  PROJECT
=	TokenNameEQUAL	
"CheckInProject"	TokenNameStringLiteral	CheckInProject
;	TokenNameSEMICOLON	
/** The get history command */	TokenNameCOMMENT_JAVADOC	 The get history command 
String	TokenNameIdentifier	 String
COMMAND_HISTORY	TokenNameIdentifier	 COMMAND  HISTORY
=	TokenNameEQUAL	
"GetFileHistory"	TokenNameStringLiteral	GetFileHistory
;	TokenNameSEMICOLON	
/** The add label command */	TokenNameCOMMENT_JAVADOC	 The add label command 
String	TokenNameIdentifier	 String
COMMAND_LABEL	TokenNameIdentifier	 COMMAND  LABEL
=	TokenNameEQUAL	
"AddLabel"	TokenNameStringLiteral	AddLabel
;	TokenNameSEMICOLON	
/** The project prefix */	TokenNameCOMMENT_JAVADOC	 The project prefix 
String	TokenNameIdentifier	 String
PROJECT_PREFIX	TokenNameIdentifier	 PROJECT  PREFIX
=	TokenNameEQUAL	
"$"	TokenNameStringLiteral	$
;	TokenNameSEMICOLON	
// soscmd Option flags 	TokenNameCOMMENT_LINE	soscmd Option flags 
/** The command option */	TokenNameCOMMENT_JAVADOC	 The command option 
String	TokenNameIdentifier	 String
FLAG_COMMAND	TokenNameIdentifier	 FLAG  COMMAND
=	TokenNameEQUAL	
"-command"	TokenNameStringLiteral	-command
;	TokenNameSEMICOLON	
/** The database (vss server) option */	TokenNameCOMMENT_JAVADOC	 The database (vss server) option 
String	TokenNameIdentifier	 String
FLAG_VSS_SERVER	TokenNameIdentifier	 FLAG  VSS  SERVER
=	TokenNameEQUAL	
"-database"	TokenNameStringLiteral	-database
;	TokenNameSEMICOLON	
/** The username option */	TokenNameCOMMENT_JAVADOC	 The username option 
String	TokenNameIdentifier	 String
FLAG_USERNAME	TokenNameIdentifier	 FLAG  USERNAME
=	TokenNameEQUAL	
"-name"	TokenNameStringLiteral	-name
;	TokenNameSEMICOLON	
/** The password option */	TokenNameCOMMENT_JAVADOC	 The password option 
String	TokenNameIdentifier	 String
FLAG_PASSWORD	TokenNameIdentifier	 FLAG  PASSWORD
=	TokenNameEQUAL	
"-password"	TokenNameStringLiteral	-password
;	TokenNameSEMICOLON	
/** The log option */	TokenNameCOMMENT_JAVADOC	 The log option 
String	TokenNameIdentifier	 String
FLAG_COMMENT	TokenNameIdentifier	 FLAG  COMMENT
=	TokenNameEQUAL	
"-log"	TokenNameStringLiteral	-log
;	TokenNameSEMICOLON	
/** The workdir option */	TokenNameCOMMENT_JAVADOC	 The workdir option 
String	TokenNameIdentifier	 String
FLAG_WORKING_DIR	TokenNameIdentifier	 FLAG  WORKING  DIR
=	TokenNameEQUAL	
"-workdir"	TokenNameStringLiteral	-workdir
;	TokenNameSEMICOLON	
/** The recursive option */	TokenNameCOMMENT_JAVADOC	 The recursive option 
String	TokenNameIdentifier	 String
FLAG_RECURSION	TokenNameIdentifier	 FLAG  RECURSION
=	TokenNameEQUAL	
"-recursive"	TokenNameStringLiteral	-recursive
;	TokenNameSEMICOLON	
/** The revision option */	TokenNameCOMMENT_JAVADOC	 The revision option 
String	TokenNameIdentifier	 String
FLAG_VERSION	TokenNameIdentifier	 FLAG  VERSION
=	TokenNameEQUAL	
"-revision"	TokenNameStringLiteral	-revision
;	TokenNameSEMICOLON	
/** The label option */	TokenNameCOMMENT_JAVADOC	 The label option 
String	TokenNameIdentifier	 String
FLAG_LABEL	TokenNameIdentifier	 FLAG  LABEL
=	TokenNameEQUAL	
"-label"	TokenNameStringLiteral	-label
;	TokenNameSEMICOLON	
/** The no compression option */	TokenNameCOMMENT_JAVADOC	 The no compression option 
String	TokenNameIdentifier	 String
FLAG_NO_COMPRESSION	TokenNameIdentifier	 FLAG  NO  COMPRESSION
=	TokenNameEQUAL	
"-nocompress"	TokenNameStringLiteral	-nocompress
;	TokenNameSEMICOLON	
/** The no cache option */	TokenNameCOMMENT_JAVADOC	 The no cache option 
String	TokenNameIdentifier	 String
FLAG_NO_CACHE	TokenNameIdentifier	 FLAG  NO  CACHE
=	TokenNameEQUAL	
"-nocache"	TokenNameStringLiteral	-nocache
;	TokenNameSEMICOLON	
/** The server option */	TokenNameCOMMENT_JAVADOC	 The server option 
String	TokenNameIdentifier	 String
FLAG_SOS_SERVER	TokenNameIdentifier	 FLAG  SOS  SERVER
=	TokenNameEQUAL	
"-server"	TokenNameStringLiteral	-server
;	TokenNameSEMICOLON	
/** The sos home option */	TokenNameCOMMENT_JAVADOC	 The sos home option 
String	TokenNameIdentifier	 String
FLAG_SOS_HOME	TokenNameIdentifier	 FLAG  SOS  HOME
=	TokenNameEQUAL	
"-soshome"	TokenNameStringLiteral	-soshome
;	TokenNameSEMICOLON	
/** The project option */	TokenNameCOMMENT_JAVADOC	 The project option 
String	TokenNameIdentifier	 String
FLAG_PROJECT	TokenNameIdentifier	 FLAG  PROJECT
=	TokenNameEQUAL	
"-project"	TokenNameStringLiteral	-project
;	TokenNameSEMICOLON	
/** The file option */	TokenNameCOMMENT_JAVADOC	 The file option 
String	TokenNameIdentifier	 String
FLAG_FILE	TokenNameIdentifier	 FLAG  FILE
=	TokenNameEQUAL	
"-file"	TokenNameStringLiteral	-file
;	TokenNameSEMICOLON	
/** The verbose option */	TokenNameCOMMENT_JAVADOC	 The verbose option 
String	TokenNameIdentifier	 String
FLAG_VERBOSE	TokenNameIdentifier	 FLAG  VERBOSE
=	TokenNameEQUAL	
"-verbose"	TokenNameStringLiteral	-verbose
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
