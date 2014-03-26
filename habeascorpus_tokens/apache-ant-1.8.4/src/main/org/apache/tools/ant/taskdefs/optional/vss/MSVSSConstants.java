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
vss	TokenNameIdentifier	 vss
;	TokenNameSEMICOLON	
/** * Holds all the constants for the VSS tasks. * */	TokenNameCOMMENT_JAVADOC	 Holds all the constants for the VSS tasks. 
// CheckStyle:InterfaceIsType OFF (bc) 	TokenNameCOMMENT_LINE	CheckStyle:InterfaceIsType OFF (bc) 
public	TokenNamepublic	
interface	TokenNameinterface	
MSVSSConstants	TokenNameIdentifier	 MSVSS Constants
{	TokenNameLBRACE	
/** Constant for the thing to execute */	TokenNameCOMMENT_JAVADOC	 Constant for the thing to execute 
String	TokenNameIdentifier	 String
SS_EXE	TokenNameIdentifier	 SS  EXE
=	TokenNameEQUAL	
"ss"	TokenNameStringLiteral	ss
;	TokenNameSEMICOLON	
/** Dollar Sigh to prefix the project path */	TokenNameCOMMENT_JAVADOC	 Dollar Sigh to prefix the project path 
String	TokenNameIdentifier	 String
PROJECT_PREFIX	TokenNameIdentifier	 PROJECT  PREFIX
=	TokenNameEQUAL	
"$"	TokenNameStringLiteral	$
;	TokenNameSEMICOLON	
/** The 'CP' command */	TokenNameCOMMENT_JAVADOC	 The 'CP' command 
String	TokenNameIdentifier	 String
COMMAND_CP	TokenNameIdentifier	 COMMAND  CP
=	TokenNameEQUAL	
"CP"	TokenNameStringLiteral	CP
;	TokenNameSEMICOLON	
/** The 'Add' command */	TokenNameCOMMENT_JAVADOC	 The 'Add' command 
String	TokenNameIdentifier	 String
COMMAND_ADD	TokenNameIdentifier	 COMMAND  ADD
=	TokenNameEQUAL	
"Add"	TokenNameStringLiteral	Add
;	TokenNameSEMICOLON	
/** The 'Get' command */	TokenNameCOMMENT_JAVADOC	 The 'Get' command 
String	TokenNameIdentifier	 String
COMMAND_GET	TokenNameIdentifier	 COMMAND  GET
=	TokenNameEQUAL	
"Get"	TokenNameStringLiteral	Get
;	TokenNameSEMICOLON	
/** The 'Checkout' command */	TokenNameCOMMENT_JAVADOC	 The 'Checkout' command 
String	TokenNameIdentifier	 String
COMMAND_CHECKOUT	TokenNameIdentifier	 COMMAND  CHECKOUT
=	TokenNameEQUAL	
"Checkout"	TokenNameStringLiteral	Checkout
;	TokenNameSEMICOLON	
/** The 'Checkin' command */	TokenNameCOMMENT_JAVADOC	 The 'Checkin' command 
String	TokenNameIdentifier	 String
COMMAND_CHECKIN	TokenNameIdentifier	 COMMAND  CHECKIN
=	TokenNameEQUAL	
"Checkin"	TokenNameStringLiteral	Checkin
;	TokenNameSEMICOLON	
/** The 'Label' command */	TokenNameCOMMENT_JAVADOC	 The 'Label' command 
String	TokenNameIdentifier	 String
COMMAND_LABEL	TokenNameIdentifier	 COMMAND  LABEL
=	TokenNameEQUAL	
"Label"	TokenNameStringLiteral	Label
;	TokenNameSEMICOLON	
/** The 'History' command */	TokenNameCOMMENT_JAVADOC	 The 'History' command 
String	TokenNameIdentifier	 String
COMMAND_HISTORY	TokenNameIdentifier	 COMMAND  HISTORY
=	TokenNameEQUAL	
"History"	TokenNameStringLiteral	History
;	TokenNameSEMICOLON	
/** The 'Create' command */	TokenNameCOMMENT_JAVADOC	 The 'Create' command 
String	TokenNameIdentifier	 String
COMMAND_CREATE	TokenNameIdentifier	 COMMAND  CREATE
=	TokenNameEQUAL	
"Create"	TokenNameStringLiteral	Create
;	TokenNameSEMICOLON	
/** The brief style flag */	TokenNameCOMMENT_JAVADOC	 The brief style flag 
String	TokenNameIdentifier	 String
STYLE_BRIEF	TokenNameIdentifier	 STYLE  BRIEF
=	TokenNameEQUAL	
"brief"	TokenNameStringLiteral	brief
;	TokenNameSEMICOLON	
/** The codediff style flag */	TokenNameCOMMENT_JAVADOC	 The codediff style flag 
String	TokenNameIdentifier	 String
STYLE_CODEDIFF	TokenNameIdentifier	 STYLE  CODEDIFF
=	TokenNameEQUAL	
"codediff"	TokenNameStringLiteral	codediff
;	TokenNameSEMICOLON	
/** The nofile style flag */	TokenNameCOMMENT_JAVADOC	 The nofile style flag 
String	TokenNameIdentifier	 String
STYLE_NOFILE	TokenNameIdentifier	 STYLE  NOFILE
=	TokenNameEQUAL	
"nofile"	TokenNameStringLiteral	nofile
;	TokenNameSEMICOLON	
/** The default style flag */	TokenNameCOMMENT_JAVADOC	 The default style flag 
String	TokenNameIdentifier	 String
STYLE_DEFAULT	TokenNameIdentifier	 STYLE  DEFAULT
=	TokenNameEQUAL	
"default"	TokenNameStringLiteral	default
;	TokenNameSEMICOLON	
/** The text for current (default) timestamp */	TokenNameCOMMENT_JAVADOC	 The text for current (default) timestamp 
String	TokenNameIdentifier	 String
TIME_CURRENT	TokenNameIdentifier	 TIME  CURRENT
=	TokenNameEQUAL	
"current"	TokenNameStringLiteral	current
;	TokenNameSEMICOLON	
/** The text for modified timestamp */	TokenNameCOMMENT_JAVADOC	 The text for modified timestamp 
String	TokenNameIdentifier	 String
TIME_MODIFIED	TokenNameIdentifier	 TIME  MODIFIED
=	TokenNameEQUAL	
"modified"	TokenNameStringLiteral	modified
;	TokenNameSEMICOLON	
/** The text for updated timestamp */	TokenNameCOMMENT_JAVADOC	 The text for updated timestamp 
String	TokenNameIdentifier	 String
TIME_UPDATED	TokenNameIdentifier	 TIME  UPDATED
=	TokenNameEQUAL	
"updated"	TokenNameStringLiteral	updated
;	TokenNameSEMICOLON	
/** The text for replacing writable files */	TokenNameCOMMENT_JAVADOC	 The text for replacing writable files 
String	TokenNameIdentifier	 String
WRITABLE_REPLACE	TokenNameIdentifier	 WRITABLE  REPLACE
=	TokenNameEQUAL	
"replace"	TokenNameStringLiteral	replace
;	TokenNameSEMICOLON	
/** The text for skiping writable files */	TokenNameCOMMENT_JAVADOC	 The text for skiping writable files 
String	TokenNameIdentifier	 String
WRITABLE_SKIP	TokenNameIdentifier	 WRITABLE  SKIP
=	TokenNameEQUAL	
"skip"	TokenNameStringLiteral	skip
;	TokenNameSEMICOLON	
/** The text for failing on writable files */	TokenNameCOMMENT_JAVADOC	 The text for failing on writable files 
String	TokenNameIdentifier	 String
WRITABLE_FAIL	TokenNameIdentifier	 WRITABLE  FAIL
=	TokenNameEQUAL	
"fail"	TokenNameStringLiteral	fail
;	TokenNameSEMICOLON	
/** -Y flag */	TokenNameCOMMENT_JAVADOC	 -Y flag 
String	TokenNameIdentifier	 String
FLAG_LOGIN	TokenNameIdentifier	 FLAG  LOGIN
=	TokenNameEQUAL	
"-Y"	TokenNameStringLiteral	-Y
;	TokenNameSEMICOLON	
/** -GL flag */	TokenNameCOMMENT_JAVADOC	 -GL flag 
String	TokenNameIdentifier	 String
FLAG_OVERRIDE_WORKING_DIR	TokenNameIdentifier	 FLAG  OVERRIDE  WORKING  DIR
=	TokenNameEQUAL	
"-GL"	TokenNameStringLiteral	-GL
;	TokenNameSEMICOLON	
/** -I- flag */	TokenNameCOMMENT_JAVADOC	 -I- flag 
String	TokenNameIdentifier	 String
FLAG_AUTORESPONSE_DEF	TokenNameIdentifier	 FLAG  AUTORESPONSE  DEF
=	TokenNameEQUAL	
"-I-"	TokenNameStringLiteral	-I-
;	TokenNameSEMICOLON	
/** -I-Y flag */	TokenNameCOMMENT_JAVADOC	 -I-Y flag 
String	TokenNameIdentifier	 String
FLAG_AUTORESPONSE_YES	TokenNameIdentifier	 FLAG  AUTORESPONSE  YES
=	TokenNameEQUAL	
"-I-Y"	TokenNameStringLiteral	-I-Y
;	TokenNameSEMICOLON	
/** -I-N flag */	TokenNameCOMMENT_JAVADOC	 -I-N flag 
String	TokenNameIdentifier	 String
FLAG_AUTORESPONSE_NO	TokenNameIdentifier	 FLAG  AUTORESPONSE  NO
=	TokenNameEQUAL	
"-I-N"	TokenNameStringLiteral	-I-N
;	TokenNameSEMICOLON	
/** -R flag */	TokenNameCOMMENT_JAVADOC	 -R flag 
String	TokenNameIdentifier	 String
FLAG_RECURSION	TokenNameIdentifier	 FLAG  RECURSION
=	TokenNameEQUAL	
"-R"	TokenNameStringLiteral	-R
;	TokenNameSEMICOLON	
/** -V flag */	TokenNameCOMMENT_JAVADOC	 -V flag 
String	TokenNameIdentifier	 String
FLAG_VERSION	TokenNameIdentifier	 FLAG  VERSION
=	TokenNameEQUAL	
"-V"	TokenNameStringLiteral	-V
;	TokenNameSEMICOLON	
/** -Vd flag */	TokenNameCOMMENT_JAVADOC	 -Vd flag 
String	TokenNameIdentifier	 String
FLAG_VERSION_DATE	TokenNameIdentifier	 FLAG  VERSION  DATE
=	TokenNameEQUAL	
"-Vd"	TokenNameStringLiteral	-Vd
;	TokenNameSEMICOLON	
/** -VL flag */	TokenNameCOMMENT_JAVADOC	 -VL flag 
String	TokenNameIdentifier	 String
FLAG_VERSION_LABEL	TokenNameIdentifier	 FLAG  VERSION  LABEL
=	TokenNameEQUAL	
"-VL"	TokenNameStringLiteral	-VL
;	TokenNameSEMICOLON	
/** -W flag */	TokenNameCOMMENT_JAVADOC	 -W flag 
String	TokenNameIdentifier	 String
FLAG_WRITABLE	TokenNameIdentifier	 FLAG  WRITABLE
=	TokenNameEQUAL	
"-W"	TokenNameStringLiteral	-W
;	TokenNameSEMICOLON	
/** -N flag */	TokenNameCOMMENT_JAVADOC	 -N flag 
String	TokenNameIdentifier	 String
VALUE_NO	TokenNameIdentifier	 VALUE  NO
=	TokenNameEQUAL	
"-N"	TokenNameStringLiteral	-N
;	TokenNameSEMICOLON	
/** -Y flag */	TokenNameCOMMENT_JAVADOC	 -Y flag 
String	TokenNameIdentifier	 String
VALUE_YES	TokenNameIdentifier	 VALUE  YES
=	TokenNameEQUAL	
"-Y"	TokenNameStringLiteral	-Y
;	TokenNameSEMICOLON	
/** -O- flag */	TokenNameCOMMENT_JAVADOC	 -O- flag 
String	TokenNameIdentifier	 String
FLAG_QUIET	TokenNameIdentifier	 FLAG  QUIET
=	TokenNameEQUAL	
"-O-"	TokenNameStringLiteral	-O-
;	TokenNameSEMICOLON	
/** -C flag */	TokenNameCOMMENT_JAVADOC	 -C flag 
String	TokenNameIdentifier	 String
FLAG_COMMENT	TokenNameIdentifier	 FLAG  COMMENT
=	TokenNameEQUAL	
"-C"	TokenNameStringLiteral	-C
;	TokenNameSEMICOLON	
/** -L flag */	TokenNameCOMMENT_JAVADOC	 -L flag 
String	TokenNameIdentifier	 String
FLAG_LABEL	TokenNameIdentifier	 FLAG  LABEL
=	TokenNameEQUAL	
"-L"	TokenNameStringLiteral	-L
;	TokenNameSEMICOLON	
/** ~d flag */	TokenNameCOMMENT_JAVADOC	 ~d flag 
String	TokenNameIdentifier	 String
VALUE_FROMDATE	TokenNameIdentifier	 VALUE  FROMDATE
=	TokenNameEQUAL	
"~d"	TokenNameStringLiteral	~d
;	TokenNameSEMICOLON	
/** ~L flag */	TokenNameCOMMENT_JAVADOC	 ~L flag 
String	TokenNameIdentifier	 String
VALUE_FROMLABEL	TokenNameIdentifier	 VALUE  FROMLABEL
=	TokenNameEQUAL	
"~L"	TokenNameStringLiteral	~L
;	TokenNameSEMICOLON	
/** -O flag */	TokenNameCOMMENT_JAVADOC	 -O flag 
String	TokenNameIdentifier	 String
FLAG_OUTPUT	TokenNameIdentifier	 FLAG  OUTPUT
=	TokenNameEQUAL	
"-O"	TokenNameStringLiteral	-O
;	TokenNameSEMICOLON	
/** -U flag */	TokenNameCOMMENT_JAVADOC	 -U flag 
String	TokenNameIdentifier	 String
FLAG_USER	TokenNameIdentifier	 FLAG  USER
=	TokenNameEQUAL	
"-U"	TokenNameStringLiteral	-U
;	TokenNameSEMICOLON	
/** -F- flag */	TokenNameCOMMENT_JAVADOC	 -F- flag 
String	TokenNameIdentifier	 String
FLAG_NO_FILE	TokenNameIdentifier	 FLAG  NO  FILE
=	TokenNameEQUAL	
"-F-"	TokenNameStringLiteral	-F-
;	TokenNameSEMICOLON	
/** -B flag */	TokenNameCOMMENT_JAVADOC	 -B flag 
String	TokenNameIdentifier	 String
FLAG_BRIEF	TokenNameIdentifier	 FLAG  BRIEF
=	TokenNameEQUAL	
"-B"	TokenNameStringLiteral	-B
;	TokenNameSEMICOLON	
/** -D flag */	TokenNameCOMMENT_JAVADOC	 -D flag 
String	TokenNameIdentifier	 String
FLAG_CODEDIFF	TokenNameIdentifier	 FLAG  CODEDIFF
=	TokenNameEQUAL	
"-D"	TokenNameStringLiteral	-D
;	TokenNameSEMICOLON	
/** -GTC flag */	TokenNameCOMMENT_JAVADOC	 -GTC flag 
String	TokenNameIdentifier	 String
FLAG_FILETIME_DEF	TokenNameIdentifier	 FLAG  FILETIME  DEF
=	TokenNameEQUAL	
"-GTC"	TokenNameStringLiteral	-GTC
;	TokenNameSEMICOLON	
/** -GTM flag */	TokenNameCOMMENT_JAVADOC	 -GTM flag 
String	TokenNameIdentifier	 String
FLAG_FILETIME_MODIFIED	TokenNameIdentifier	 FLAG  FILETIME  MODIFIED
=	TokenNameEQUAL	
"-GTM"	TokenNameStringLiteral	-GTM
;	TokenNameSEMICOLON	
/** -GTU flag */	TokenNameCOMMENT_JAVADOC	 -GTU flag 
String	TokenNameIdentifier	 String
FLAG_FILETIME_UPDATED	TokenNameIdentifier	 FLAG  FILETIME  UPDATED
=	TokenNameEQUAL	
"-GTU"	TokenNameStringLiteral	-GTU
;	TokenNameSEMICOLON	
/** -GWR flag */	TokenNameCOMMENT_JAVADOC	 -GWR flag 
String	TokenNameIdentifier	 String
FLAG_REPLACE_WRITABLE	TokenNameIdentifier	 FLAG  REPLACE  WRITABLE
=	TokenNameEQUAL	
"-GWR"	TokenNameStringLiteral	-GWR
;	TokenNameSEMICOLON	
/** -GWS flag */	TokenNameCOMMENT_JAVADOC	 -GWS flag 
String	TokenNameIdentifier	 String
FLAG_SKIP_WRITABLE	TokenNameIdentifier	 FLAG  SKIP  WRITABLE
=	TokenNameEQUAL	
"-GWS"	TokenNameStringLiteral	-GWS
;	TokenNameSEMICOLON	
/** -G- flag */	TokenNameCOMMENT_JAVADOC	 -G- flag 
String	TokenNameIdentifier	 String
FLAG_NO_GET	TokenNameIdentifier	 FLAG  NO  GET
=	TokenNameEQUAL	
"-G-"	TokenNameStringLiteral	-G-
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
