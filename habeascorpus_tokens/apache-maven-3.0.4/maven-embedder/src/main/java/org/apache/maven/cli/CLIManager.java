package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
.	TokenNameDOT	
CommandLine	TokenNameIdentifier	 Command Line
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
.	TokenNameDOT	
CommandLineParser	TokenNameIdentifier	 Command Line Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
.	TokenNameDOT	
GnuParser	TokenNameIdentifier	 Gnu Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
.	TokenNameDOT	
HelpFormatter	TokenNameIdentifier	 Help Formatter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
.	TokenNameDOT	
OptionBuilder	TokenNameIdentifier	 Option Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
.	TokenNameDOT	
Options	TokenNameIdentifier	 Options
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * @author Jason van Zyl */	TokenNameCOMMENT_JAVADOC	 @author Jason van Zyl 
public	TokenNamepublic	
class	TokenNameclass	
CLIManager	TokenNameIdentifier	 CLI Manager
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
ALTERNATE_POM_FILE	TokenNameIdentifier	 ALTERNATE  POM  FILE
=	TokenNameEQUAL	
'f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
BATCH_MODE	TokenNameIdentifier	 BATCH  MODE
=	TokenNameEQUAL	
'B'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
SET_SYSTEM_PROPERTY	TokenNameIdentifier	 SET  SYSTEM  PROPERTY
=	TokenNameEQUAL	
'D'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
OFFLINE	TokenNameIdentifier	 OFFLINE
=	TokenNameEQUAL	
'o'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
QUIET	TokenNameIdentifier	 QUIET
=	TokenNameEQUAL	
'q'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
'X'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
ERRORS	TokenNameIdentifier	 ERRORS
=	TokenNameEQUAL	
'e'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
HELP	TokenNameIdentifier	 HELP
=	TokenNameEQUAL	
'h'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
VERSION	TokenNameIdentifier	 VERSION
=	TokenNameEQUAL	
'v'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
SHOW_VERSION	TokenNameIdentifier	 SHOW  VERSION
=	TokenNameEQUAL	
'V'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
NON_RECURSIVE	TokenNameIdentifier	 NON  RECURSIVE
=	TokenNameEQUAL	
'N'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
UPDATE_SNAPSHOTS	TokenNameIdentifier	 UPDATE  SNAPSHOTS
=	TokenNameEQUAL	
'U'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
ACTIVATE_PROFILES	TokenNameIdentifier	 ACTIVATE  PROFILES
=	TokenNameEQUAL	
'P'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SUPRESS_SNAPSHOT_UPDATES	TokenNameIdentifier	 SUPRESS  SNAPSHOT  UPDATES
=	TokenNameEQUAL	
"nsu"	TokenNameStringLiteral	nsu
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
CHECKSUM_FAILURE_POLICY	TokenNameIdentifier	 CHECKSUM  FAILURE  POLICY
=	TokenNameEQUAL	
'C'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
CHECKSUM_WARNING_POLICY	TokenNameIdentifier	 CHECKSUM  WARNING  POLICY
=	TokenNameEQUAL	
'c'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
ALTERNATE_USER_SETTINGS	TokenNameIdentifier	 ALTERNATE  USER  SETTINGS
=	TokenNameEQUAL	
's'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ALTERNATE_GLOBAL_SETTINGS	TokenNameIdentifier	 ALTERNATE  GLOBAL  SETTINGS
=	TokenNameEQUAL	
"gs"	TokenNameStringLiteral	gs
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
ALTERNATE_USER_TOOLCHAINS	TokenNameIdentifier	 ALTERNATE  USER  TOOLCHAINS
=	TokenNameEQUAL	
't'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FAIL_FAST	TokenNameIdentifier	 FAIL  FAST
=	TokenNameEQUAL	
"ff"	TokenNameStringLiteral	ff
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FAIL_AT_END	TokenNameIdentifier	 FAIL  AT  END
=	TokenNameEQUAL	
"fae"	TokenNameStringLiteral	fae
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FAIL_NEVER	TokenNameIdentifier	 FAIL  NEVER
=	TokenNameEQUAL	
"fn"	TokenNameStringLiteral	fn
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RESUME_FROM	TokenNameIdentifier	 RESUME  FROM
=	TokenNameEQUAL	
"rf"	TokenNameStringLiteral	rf
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROJECT_LIST	TokenNameIdentifier	 PROJECT  LIST
=	TokenNameEQUAL	
"pl"	TokenNameStringLiteral	pl
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ALSO_MAKE	TokenNameIdentifier	 ALSO  MAKE
=	TokenNameEQUAL	
"am"	TokenNameStringLiteral	am
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ALSO_MAKE_DEPENDENTS	TokenNameIdentifier	 ALSO  MAKE  DEPENDENTS
=	TokenNameEQUAL	
"amd"	TokenNameStringLiteral	amd
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LOG_FILE	TokenNameIdentifier	 LOG  FILE
=	TokenNameEQUAL	
"l"	TokenNameStringLiteral	l
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ENCRYPT_MASTER_PASSWORD	TokenNameIdentifier	 ENCRYPT  MASTER  PASSWORD
=	TokenNameEQUAL	
"emp"	TokenNameStringLiteral	emp
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ENCRYPT_PASSWORD	TokenNameIdentifier	 ENCRYPT  PASSWORD
=	TokenNameEQUAL	
"ep"	TokenNameStringLiteral	ep
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
THREADS	TokenNameIdentifier	 THREADS
=	TokenNameEQUAL	
"T"	TokenNameStringLiteral	T
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Options	TokenNameIdentifier	 Options
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"static-access"	TokenNameStringLiteral	static-access
)	TokenNameRPAREN	
public	TokenNamepublic	
CLIManager	TokenNameIdentifier	 CLI Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
new	TokenNamenew	
Options	TokenNameIdentifier	 Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"help"	TokenNameStringLiteral	help
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Display help information"	TokenNameStringLiteral	Display help information
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
HELP	TokenNameIdentifier	 HELP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"file"	TokenNameStringLiteral	file
)	TokenNameRPAREN	
.	TokenNameDOT	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Force the use of an alternate POM file."	TokenNameStringLiteral	Force the use of an alternate POM file.
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
ALTERNATE_POM_FILE	TokenNameIdentifier	 ALTERNATE  POM  FILE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"define"	TokenNameStringLiteral	define
)	TokenNameRPAREN	
.	TokenNameDOT	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Define a system property"	TokenNameStringLiteral	Define a system property
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
SET_SYSTEM_PROPERTY	TokenNameIdentifier	 SET  SYSTEM  PROPERTY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"offline"	TokenNameStringLiteral	offline
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Work offline"	TokenNameStringLiteral	Work offline
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
OFFLINE	TokenNameIdentifier	 OFFLINE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"version"	TokenNameStringLiteral	version
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Display version information"	TokenNameStringLiteral	Display version information
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
VERSION	TokenNameIdentifier	 VERSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"quiet"	TokenNameStringLiteral	quiet
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Quiet output - only show errors"	TokenNameStringLiteral	Quiet output - only show errors
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
QUIET	TokenNameIdentifier	 QUIET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"debug"	TokenNameStringLiteral	debug
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Produce execution debug output"	TokenNameStringLiteral	Produce execution debug output
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"errors"	TokenNameStringLiteral	errors
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Produce execution error messages"	TokenNameStringLiteral	Produce execution error messages
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
ERRORS	TokenNameIdentifier	 ERRORS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"non-recursive"	TokenNameStringLiteral	non-recursive
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Do not recurse into sub-projects"	TokenNameStringLiteral	Do not recurse into sub-projects
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
NON_RECURSIVE	TokenNameIdentifier	 NON  RECURSIVE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"update-snapshots"	TokenNameStringLiteral	update-snapshots
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Forces a check for updated releases and snapshots on remote repositories"	TokenNameStringLiteral	Forces a check for updated releases and snapshots on remote repositories
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
UPDATE_SNAPSHOTS	TokenNameIdentifier	 UPDATE  SNAPSHOTS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"activate-profiles"	TokenNameStringLiteral	activate-profiles
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Comma-delimited list of profiles to activate"	TokenNameStringLiteral	Comma-delimited list of profiles to activate
)	TokenNameRPAREN	
.	TokenNameDOT	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
ACTIVATE_PROFILES	TokenNameIdentifier	 ACTIVATE  PROFILES
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"batch-mode"	TokenNameStringLiteral	batch-mode
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Run in non-interactive (batch) mode"	TokenNameStringLiteral	Run in non-interactive (batch) mode
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
BATCH_MODE	TokenNameIdentifier	 BATCH  MODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"no-snapshot-updates"	TokenNameStringLiteral	no-snapshot-updates
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Suppress SNAPSHOT updates"	TokenNameStringLiteral	Suppress SNAPSHOT updates
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
SUPRESS_SNAPSHOT_UPDATES	TokenNameIdentifier	 SUPRESS  SNAPSHOT  UPDATES
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"strict-checksums"	TokenNameStringLiteral	strict-checksums
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Fail the build if checksums don't match"	TokenNameStringLiteral	Fail the build if checksums don't match
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
CHECKSUM_FAILURE_POLICY	TokenNameIdentifier	 CHECKSUM  FAILURE  POLICY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"lax-checksums"	TokenNameStringLiteral	lax-checksums
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Warn if checksums don't match"	TokenNameStringLiteral	Warn if checksums don't match
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
CHECKSUM_WARNING_POLICY	TokenNameIdentifier	 CHECKSUM  WARNING  POLICY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"settings"	TokenNameStringLiteral	settings
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Alternate path for the user settings file"	TokenNameStringLiteral	Alternate path for the user settings file
)	TokenNameRPAREN	
.	TokenNameDOT	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
ALTERNATE_USER_SETTINGS	TokenNameIdentifier	 ALTERNATE  USER  SETTINGS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"global-settings"	TokenNameStringLiteral	global-settings
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Alternate path for the global settings file"	TokenNameStringLiteral	Alternate path for the global settings file
)	TokenNameRPAREN	
.	TokenNameDOT	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
ALTERNATE_GLOBAL_SETTINGS	TokenNameIdentifier	 ALTERNATE  GLOBAL  SETTINGS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"toolchains"	TokenNameStringLiteral	toolchains
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Alternate path for the user toolchains file"	TokenNameStringLiteral	Alternate path for the user toolchains file
)	TokenNameRPAREN	
.	TokenNameDOT	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
ALTERNATE_USER_TOOLCHAINS	TokenNameIdentifier	 ALTERNATE  USER  TOOLCHAINS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"fail-fast"	TokenNameStringLiteral	fail-fast
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Stop at first failure in reactorized builds"	TokenNameStringLiteral	Stop at first failure in reactorized builds
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
FAIL_FAST	TokenNameIdentifier	 FAIL  FAST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"fail-at-end"	TokenNameStringLiteral	fail-at-end
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Only fail the build afterwards; allow all non-impacted builds to continue"	TokenNameStringLiteral	Only fail the build afterwards; allow all non-impacted builds to continue
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
FAIL_AT_END	TokenNameIdentifier	 FAIL  AT  END
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"fail-never"	TokenNameStringLiteral	fail-never
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"NEVER fail the build, regardless of project result"	TokenNameStringLiteral	NEVER fail the build, regardless of project result
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
FAIL_NEVER	TokenNameIdentifier	 FAIL  NEVER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"resume-from"	TokenNameStringLiteral	resume-from
)	TokenNameRPAREN	
.	TokenNameDOT	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Resume reactor from specified project"	TokenNameStringLiteral	Resume reactor from specified project
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
RESUME_FROM	TokenNameIdentifier	 RESUME  FROM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"projects"	TokenNameStringLiteral	projects
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Comma-delimited list of specified reactor projects to build instead of all projects. A project can be specified by [groupId]:artifactId or by its relative path."	TokenNameStringLiteral	Comma-delimited list of specified reactor projects to build instead of all projects. A project can be specified by [groupId]:artifactId or by its relative path.
)	TokenNameRPAREN	
.	TokenNameDOT	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
PROJECT_LIST	TokenNameIdentifier	 PROJECT  LIST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"also-make"	TokenNameStringLiteral	also-make
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"If project list is specified, also build projects required by the list"	TokenNameStringLiteral	If project list is specified, also build projects required by the list
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
ALSO_MAKE	TokenNameIdentifier	 ALSO  MAKE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"also-make-dependents"	TokenNameStringLiteral	also-make-dependents
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"If project list is specified, also build projects that depend on projects on the list"	TokenNameStringLiteral	If project list is specified, also build projects that depend on projects on the list
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
ALSO_MAKE_DEPENDENTS	TokenNameIdentifier	 ALSO  MAKE  DEPENDENTS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"log-file"	TokenNameStringLiteral	log-file
)	TokenNameRPAREN	
.	TokenNameDOT	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Log file to where all build output will go."	TokenNameStringLiteral	Log file to where all build output will go.
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
LOG_FILE	TokenNameIdentifier	 LOG  FILE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"show-version"	TokenNameStringLiteral	show-version
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Display version information WITHOUT stopping build"	TokenNameStringLiteral	Display version information WITHOUT stopping build
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
SHOW_VERSION	TokenNameIdentifier	 SHOW  VERSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"encrypt-master-password"	TokenNameStringLiteral	encrypt-master-password
)	TokenNameRPAREN	
.	TokenNameDOT	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Encrypt master security password"	TokenNameStringLiteral	Encrypt master security password
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
ENCRYPT_MASTER_PASSWORD	TokenNameIdentifier	 ENCRYPT  MASTER  PASSWORD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"encrypt-password"	TokenNameStringLiteral	encrypt-password
)	TokenNameRPAREN	
.	TokenNameDOT	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Encrypt server password"	TokenNameStringLiteral	Encrypt server password
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
ENCRYPT_PASSWORD	TokenNameIdentifier	 ENCRYPT  PASSWORD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"threads"	TokenNameStringLiteral	threads
)	TokenNameRPAREN	
.	TokenNameDOT	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Thread count, for instance 2.0C where C is core multiplied"	TokenNameStringLiteral	Thread count, for instance 2.0C where C is core multiplied
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
THREADS	TokenNameIdentifier	 THREADS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Adding this back in for compatibility with the verifier that hard codes this option. 	TokenNameCOMMENT_LINE	Adding this back in for compatibility with the verifier that hard codes this option. 
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"no-plugin-registry"	TokenNameStringLiteral	no-plugin-registry
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Ineffective, only kept for backward compatibility"	TokenNameStringLiteral	Ineffective, only kept for backward compatibility
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"npr"	TokenNameStringLiteral	npr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"check-plugin-updates"	TokenNameStringLiteral	check-plugin-updates
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Ineffective, only kept for backward compatibility"	TokenNameStringLiteral	Ineffective, only kept for backward compatibility
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"cpu"	TokenNameStringLiteral	cpu
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"update-plugins"	TokenNameStringLiteral	update-plugins
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Ineffective, only kept for backward compatibility"	TokenNameStringLiteral	Ineffective, only kept for backward compatibility
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"up"	TokenNameStringLiteral	up
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
addOption	TokenNameIdentifier	 add Option
(	TokenNameLPAREN	
OptionBuilder	TokenNameIdentifier	 Option Builder
.	TokenNameDOT	
withLongOpt	TokenNameIdentifier	 with Long Opt
(	TokenNameLPAREN	
"no-plugin-updates"	TokenNameStringLiteral	no-plugin-updates
)	TokenNameRPAREN	
.	TokenNameDOT	
withDescription	TokenNameIdentifier	 with Description
(	TokenNameLPAREN	
"Ineffective, only kept for backward compatibility"	TokenNameStringLiteral	Ineffective, only kept for backward compatibility
)	TokenNameRPAREN	
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"npu"	TokenNameStringLiteral	npu
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CommandLine	TokenNameIdentifier	 Command Line
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
// We need to eat any quotes surrounding arguments... 	TokenNameCOMMENT_LINE	We need to eat any quotes surrounding arguments... 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cleanArgs	TokenNameIdentifier	 clean Args
=	TokenNameEQUAL	
cleanArgs	TokenNameIdentifier	 clean Args
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CommandLineParser	TokenNameIdentifier	 Command Line Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
GnuParser	TokenNameIdentifier	 Gnu Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
cleanArgs	TokenNameIdentifier	 clean Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cleanArgs	TokenNameIdentifier	 clean Args
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
cleaned	TokenNameIdentifier	 cleaned
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
currentArg	TokenNameIdentifier	 current Arg
=	TokenNameEQUAL	
null	TokenNamenull	
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
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
addedToBuffer	TokenNameIdentifier	 added To Buffer
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we're in the process of building up another arg, push it and start over. 	TokenNameCOMMENT_LINE	if we're in the process of building up another arg, push it and start over. 
// this is for the case: "-Dfoo=bar "-Dfoo2=bar two" (note the first unterminated quote) 	TokenNameCOMMENT_LINE	this is for the case: "-Dfoo=bar "-Dfoo2=bar two" (note the first unterminated quote) 
if	TokenNameif	
(	TokenNameLPAREN	
currentArg	TokenNameIdentifier	 current Arg
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cleaned	TokenNameIdentifier	 cleaned
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentArg	TokenNameIdentifier	 current Arg
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// start building an argument here. 	TokenNameCOMMENT_LINE	start building an argument here. 
currentArg	TokenNameIdentifier	 current Arg
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addedToBuffer	TokenNameIdentifier	 added To Buffer
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this has to be a separate "if" statement, to capture the case of: "-Dfoo=bar" 	TokenNameCOMMENT_LINE	this has to be a separate "if" statement, to capture the case of: "-Dfoo=bar" 
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
cleanArgPart	TokenNameIdentifier	 clean Arg Part
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if we're building an argument, keep doing so. 	TokenNameCOMMENT_LINE	if we're building an argument, keep doing so. 
if	TokenNameif	
(	TokenNameLPAREN	
currentArg	TokenNameIdentifier	 current Arg
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if this is the case of "-Dfoo=bar", then we need to adjust the buffer. 	TokenNameCOMMENT_LINE	if this is the case of "-Dfoo=bar", then we need to adjust the buffer. 
if	TokenNameif	
(	TokenNameLPAREN	
addedToBuffer	TokenNameIdentifier	 added To Buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentArg	TokenNameIdentifier	 current Arg
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
currentArg	TokenNameIdentifier	 current Arg
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// otherwise, we trim the trailing " and append to the buffer. 	TokenNameCOMMENT_LINE	otherwise, we trim the trailing " and append to the buffer. 
else	TokenNameelse	
{	TokenNameLBRACE	
// TODO: introducing a space here...not sure what else to do but collapse whitespace 	TokenNameCOMMENT_LINE	TODO: introducing a space here...not sure what else to do but collapse whitespace 
currentArg	TokenNameIdentifier	 current Arg
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
cleanArgPart	TokenNameIdentifier	 clean Arg Part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cleaned	TokenNameIdentifier	 cleaned
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentArg	TokenNameIdentifier	 current Arg
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cleaned	TokenNameIdentifier	 cleaned
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cleanArgPart	TokenNameIdentifier	 clean Arg Part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentArg	TokenNameIdentifier	 current Arg
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if we haven't added this arg to the buffer, and we ARE building an argument 	TokenNameCOMMENT_LINE	if we haven't added this arg to the buffer, and we ARE building an argument 
// buffer, then append it with a preceding space...again, not sure what else to 	TokenNameCOMMENT_LINE	buffer, then append it with a preceding space...again, not sure what else to 
// do other than collapse whitespace. 	TokenNameCOMMENT_LINE	do other than collapse whitespace. 
// NOTE: The case of a trailing quote is handled by nullifying the arg buffer. 	TokenNameCOMMENT_LINE	NOTE: The case of a trailing quote is handled by nullifying the arg buffer. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
addedToBuffer	TokenNameIdentifier	 added To Buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentArg	TokenNameIdentifier	 current Arg
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentArg	TokenNameIdentifier	 current Arg
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cleaned	TokenNameIdentifier	 cleaned
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentArg	TokenNameIdentifier	 current Arg
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cleaned	TokenNameIdentifier	 cleaned
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentArg	TokenNameIdentifier	 current Arg
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
cleanedSz	TokenNameIdentifier	 cleaned Sz
=	TokenNameEQUAL	
cleaned	TokenNameIdentifier	 cleaned
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cleanArgs	TokenNameIdentifier	 clean Args
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cleanedSz	TokenNameIdentifier	 cleaned Sz
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cleanArgs	TokenNameIdentifier	 clean Args
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cleanArgs	TokenNameIdentifier	 clean Args
=	TokenNameEQUAL	
cleaned	TokenNameIdentifier	 cleaned
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
cleanedSz	TokenNameIdentifier	 cleaned Sz
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
cleanArgs	TokenNameIdentifier	 clean Args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
displayHelp	TokenNameIdentifier	 display Help
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
stdout	TokenNameIdentifier	 stdout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stdout	TokenNameIdentifier	 stdout
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
stdout	TokenNameIdentifier	 stdout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HelpFormatter	TokenNameIdentifier	 Help Formatter
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
new	TokenNamenew	
HelpFormatter	TokenNameIdentifier	 Help Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
printHelp	TokenNameIdentifier	 print Help
(	TokenNameLPAREN	
pw	TokenNameIdentifier	 pw
,	TokenNameCOMMA	
HelpFormatter	TokenNameIdentifier	 Help Formatter
.	TokenNameDOT	
DEFAULT_WIDTH	TokenNameIdentifier	 DEFAULT  WIDTH
,	TokenNameCOMMA	
"mvn [options] [<goal(s)>] [<phase(s)>]"	TokenNameStringLiteral	mvn [options] [<goal(s)>] [<phase(s)>]
,	TokenNameCOMMA	
" Options:"	TokenNameStringLiteral	 Options:
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
HelpFormatter	TokenNameIdentifier	 Help Formatter
.	TokenNameDOT	
DEFAULT_LEFT_PAD	TokenNameIdentifier	 DEFAULT  LEFT  PAD
,	TokenNameCOMMA	
HelpFormatter	TokenNameIdentifier	 Help Formatter
.	TokenNameDOT	
DEFAULT_DESC_PAD	TokenNameIdentifier	 DEFAULT  DESC  PAD
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
