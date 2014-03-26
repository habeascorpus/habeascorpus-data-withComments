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
listener	TokenNameIdentifier	 listener
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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
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
DefaultLogger	TokenNameIdentifier	 Default Logger
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
/** * Uses ANSI Color Code Sequences to colorize messages * sent to the console. * * If used with the -logfile option, the output file * will contain all the necessary escape codes to * display the text in colorized mode when displayed * in the console using applications like cat, more, * etc. * * This is designed to work on terminals that support ANSI * color codes. It works on XTerm, ETerm, Mindterm, etc. * It also works on Win9x (with ANSI.SYS loaded.) * * NOTE: * It doesn't work on WinNT's COMMAND.COM even with * ANSI.SYS loaded. * * The default colors used for differentiating * the message levels can be changed by editing the * /org/apache/tools/ant/listener/defaults.properties * file. * This file contains 5 key/value pairs: * AnsiColorLogger.ERROR_COLOR=2;31 * AnsiColorLogger.WARNING_COLOR=2;35 * AnsiColorLogger.INFO_COLOR=2;36 * AnsiColorLogger.VERBOSE_COLOR=2;32 * AnsiColorLogger.DEBUG_COLOR=2;34 * * Another option is to pass a system variable named * ant.logger.defaults, with value set to the path of * the file that contains user defined Ansi Color * Codes, to the <B>java</B> command using -D option. * * To change these colors use the following chart: * * <B>ANSI COLOR LOGGER CONFIGURATION</B> * * Format for AnsiColorLogger.*= * Attribute;Foreground;Background * * Attribute is one of the following: * 0 -> Reset All Attributes (return to normal mode) * 1 -> Bright (Usually turns on BOLD) * 2 -> Dim * 3 -> Underline * 5 -> link * 7 -> Reverse * 8 -> Hidden * * Foreground is one of the following: * 30 -> Black * 31 -> Red * 32 -> Green * 33 -> Yellow * 34 -> Blue * 35 -> Magenta * 36 -> Cyan * 37 -> White * * Background is one of the following: * 40 -> Black * 41 -> Red * 42 -> Green * 43 -> Yellow * 44 -> Blue * 45 -> Magenta * 46 -> Cyan * 47 -> White * */	TokenNameCOMMENT_JAVADOC	 Uses ANSI Color Code Sequences to colorize messages sent to the console. * If used with the -logfile option, the output file will contain all the necessary escape codes to display the text in colorized mode when displayed in the console using applications like cat, more, etc. * This is designed to work on terminals that support ANSI color codes. It works on XTerm, ETerm, Mindterm, etc. It also works on Win9x (with ANSI.SYS loaded.) * NOTE: It doesn't work on WinNT's COMMAND.COM even with ANSI.SYS loaded. * The default colors used for differentiating the message levels can be changed by editing the /org/apache/tools/ant/listener/defaults.properties file. This file contains 5 key/value pairs: AnsiColorLogger.ERROR_COLOR=2;31 AnsiColorLogger.WARNING_COLOR=2;35 AnsiColorLogger.INFO_COLOR=2;36 AnsiColorLogger.VERBOSE_COLOR=2;32 AnsiColorLogger.DEBUG_COLOR=2;34 * Another option is to pass a system variable named ant.logger.defaults, with value set to the path of the file that contains user defined Ansi Color Codes, to the <B>java</B> command using -D option. * To change these colors use the following chart: * <B>ANSI COLOR LOGGER CONFIGURATION</B> * Format for AnsiColorLogger.*= Attribute;Foreground;Background * Attribute is one of the following: 0 -> Reset All Attributes (return to normal mode) 1 -> Bright (Usually turns on BOLD) 2 -> Dim 3 -> Underline 5 -> link 7 -> Reverse 8 -> Hidden * Foreground is one of the following: 30 -> Black 31 -> Red 32 -> Green 33 -> Yellow 34 -> Blue 35 -> Magenta 36 -> Cyan 37 -> White * Background is one of the following: 40 -> Black 41 -> Red 42 -> Green 43 -> Yellow 44 -> Blue 45 -> Magenta 46 -> Cyan 47 -> White 
public	TokenNamepublic	
class	TokenNameclass	
AnsiColorLogger	TokenNameIdentifier	 Ansi Color Logger
extends	TokenNameextends	
DefaultLogger	TokenNameIdentifier	 Default Logger
{	TokenNameLBRACE	
// private static final int ATTR_NORMAL = 0; 	TokenNameCOMMENT_LINE	private static final int ATTR_NORMAL = 0; 
// private static final int ATTR_BRIGHT = 1; 	TokenNameCOMMENT_LINE	private static final int ATTR_BRIGHT = 1; 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ATTR_DIM	TokenNameIdentifier	 ATTR  DIM
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// private static final int ATTR_UNDERLINE = 3; 	TokenNameCOMMENT_LINE	private static final int ATTR_UNDERLINE = 3; 
// private static final int ATTR_BLINK = 5; 	TokenNameCOMMENT_LINE	private static final int ATTR_BLINK = 5; 
// private static final int ATTR_REVERSE = 7; 	TokenNameCOMMENT_LINE	private static final int ATTR_REVERSE = 7; 
// private static final int ATTR_HIDDEN = 8; 	TokenNameCOMMENT_LINE	private static final int ATTR_HIDDEN = 8; 
// private static final int FG_BLACK = 30; 	TokenNameCOMMENT_LINE	private static final int FG_BLACK = 30; 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FG_RED	TokenNameIdentifier	 FG  RED
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FG_GREEN	TokenNameIdentifier	 FG  GREEN
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// private static final int FG_YELLOW = 33; 	TokenNameCOMMENT_LINE	private static final int FG_YELLOW = 33; 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FG_BLUE	TokenNameIdentifier	 FG  BLUE
=	TokenNameEQUAL	
34	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FG_MAGENTA	TokenNameIdentifier	 FG  MAGENTA
=	TokenNameEQUAL	
35	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FG_CYAN	TokenNameIdentifier	 FG  CYAN
=	TokenNameEQUAL	
36	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// private static final int FG_WHITE = 37; 	TokenNameCOMMENT_LINE	private static final int FG_WHITE = 37; 
// private static final int BG_BLACK = 40; 	TokenNameCOMMENT_LINE	private static final int BG_BLACK = 40; 
// private static final int BG_RED = 41; 	TokenNameCOMMENT_LINE	private static final int BG_RED = 41; 
// private static final int BG_GREEN = 42; 	TokenNameCOMMENT_LINE	private static final int BG_GREEN = 42; 
// private static final int BG_YELLOW = 44; 	TokenNameCOMMENT_LINE	private static final int BG_YELLOW = 44; 
// private static final int BG_BLUE = 44; 	TokenNameCOMMENT_LINE	private static final int BG_BLUE = 44; 
// private static final int BG_MAGENTA = 45; 	TokenNameCOMMENT_LINE	private static final int BG_MAGENTA = 45; 
// private static final int BG_CYAN = 46; 	TokenNameCOMMENT_LINE	private static final int BG_CYAN = 46; 
// private static final int BG_WHITE = 47; 	TokenNameCOMMENT_LINE	private static final int BG_WHITE = 47; 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PREFIX	TokenNameIdentifier	 PREFIX
=	TokenNameEQUAL	
"["	TokenNameStringLiteral	[
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SUFFIX	TokenNameIdentifier	 SUFFIX
=	TokenNameEQUAL	
"m"	TokenNameStringLiteral	m
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
SEPARATOR	TokenNameIdentifier	 SEPARATOR
=	TokenNameEQUAL	
';'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
END_COLOR	TokenNameIdentifier	 END  COLOR
=	TokenNameEQUAL	
PREFIX	TokenNameIdentifier	 PREFIX
+	TokenNamePLUS	
SUFFIX	TokenNameIdentifier	 SUFFIX
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
errColor	TokenNameIdentifier	 err Color
=	TokenNameEQUAL	
PREFIX	TokenNameIdentifier	 PREFIX
+	TokenNamePLUS	
ATTR_DIM	TokenNameIdentifier	 ATTR  DIM
+	TokenNamePLUS	
SEPARATOR	TokenNameIdentifier	 SEPARATOR
+	TokenNamePLUS	
FG_RED	TokenNameIdentifier	 FG  RED
+	TokenNamePLUS	
SUFFIX	TokenNameIdentifier	 SUFFIX
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
warnColor	TokenNameIdentifier	 warn Color
=	TokenNameEQUAL	
PREFIX	TokenNameIdentifier	 PREFIX
+	TokenNamePLUS	
ATTR_DIM	TokenNameIdentifier	 ATTR  DIM
+	TokenNamePLUS	
SEPARATOR	TokenNameIdentifier	 SEPARATOR
+	TokenNamePLUS	
FG_MAGENTA	TokenNameIdentifier	 FG  MAGENTA
+	TokenNamePLUS	
SUFFIX	TokenNameIdentifier	 SUFFIX
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
infoColor	TokenNameIdentifier	 info Color
=	TokenNameEQUAL	
PREFIX	TokenNameIdentifier	 PREFIX
+	TokenNamePLUS	
ATTR_DIM	TokenNameIdentifier	 ATTR  DIM
+	TokenNamePLUS	
SEPARATOR	TokenNameIdentifier	 SEPARATOR
+	TokenNamePLUS	
FG_CYAN	TokenNameIdentifier	 FG  CYAN
+	TokenNamePLUS	
SUFFIX	TokenNameIdentifier	 SUFFIX
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
verboseColor	TokenNameIdentifier	 verbose Color
=	TokenNameEQUAL	
PREFIX	TokenNameIdentifier	 PREFIX
+	TokenNamePLUS	
ATTR_DIM	TokenNameIdentifier	 ATTR  DIM
+	TokenNamePLUS	
SEPARATOR	TokenNameIdentifier	 SEPARATOR
+	TokenNamePLUS	
FG_GREEN	TokenNameIdentifier	 FG  GREEN
+	TokenNamePLUS	
SUFFIX	TokenNameIdentifier	 SUFFIX
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
debugColor	TokenNameIdentifier	 debug Color
=	TokenNameEQUAL	
PREFIX	TokenNameIdentifier	 PREFIX
+	TokenNamePLUS	
ATTR_DIM	TokenNameIdentifier	 ATTR  DIM
+	TokenNamePLUS	
SEPARATOR	TokenNameIdentifier	 SEPARATOR
+	TokenNamePLUS	
FG_BLUE	TokenNameIdentifier	 FG  BLUE
+	TokenNamePLUS	
SUFFIX	TokenNameIdentifier	 SUFFIX
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
colorsSet	TokenNameIdentifier	 colors Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Set the colors to use from a property file specified by the * special ant property ant.logger.defaults */	TokenNameCOMMENT_JAVADOC	 Set the colors to use from a property file specified by the special ant property ant.logger.defaults 
private	TokenNameprivate	
void	TokenNamevoid	
setColors	TokenNameIdentifier	 set Colors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
userColorFile	TokenNameIdentifier	 user Color File
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"ant.logger.defaults"	TokenNameStringLiteral	ant.logger.defaults
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
systemColorFile	TokenNameIdentifier	 system Color File
=	TokenNameEQUAL	
"/org/apache/tools/ant/listener/defaults.properties"	TokenNameStringLiteral	/org/apache/tools/ant/listener/defaults.properties
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
prop	TokenNameIdentifier	 prop
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
userColorFile	TokenNameIdentifier	 user Color File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
userColorFile	TokenNameIdentifier	 user Color File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
systemColorFile	TokenNameIdentifier	 system Color File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
errC	TokenNameIdentifier	 err C
=	TokenNameEQUAL	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"AnsiColorLogger.ERROR_COLOR"	TokenNameStringLiteral	AnsiColorLogger.ERROR_COLOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
warn	TokenNameIdentifier	 warn
=	TokenNameEQUAL	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"AnsiColorLogger.WARNING_COLOR"	TokenNameStringLiteral	AnsiColorLogger.WARNING_COLOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"AnsiColorLogger.INFO_COLOR"	TokenNameStringLiteral	AnsiColorLogger.INFO_COLOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
verbose	TokenNameIdentifier	 verbose
=	TokenNameEQUAL	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"AnsiColorLogger.VERBOSE_COLOR"	TokenNameStringLiteral	AnsiColorLogger.VERBOSE_COLOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"AnsiColorLogger.DEBUG_COLOR"	TokenNameStringLiteral	AnsiColorLogger.DEBUG_COLOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
errC	TokenNameIdentifier	 err C
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errColor	TokenNameIdentifier	 err Color
=	TokenNameEQUAL	
PREFIX	TokenNameIdentifier	 PREFIX
+	TokenNamePLUS	
errC	TokenNameIdentifier	 err C
+	TokenNamePLUS	
SUFFIX	TokenNameIdentifier	 SUFFIX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
warn	TokenNameIdentifier	 warn
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
warnColor	TokenNameIdentifier	 warn Color
=	TokenNameEQUAL	
PREFIX	TokenNameIdentifier	 PREFIX
+	TokenNamePLUS	
warn	TokenNameIdentifier	 warn
+	TokenNamePLUS	
SUFFIX	TokenNameIdentifier	 SUFFIX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
infoColor	TokenNameIdentifier	 info Color
=	TokenNameEQUAL	
PREFIX	TokenNameIdentifier	 PREFIX
+	TokenNamePLUS	
info	TokenNameIdentifier	 info
+	TokenNamePLUS	
SUFFIX	TokenNameIdentifier	 SUFFIX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
verboseColor	TokenNameIdentifier	 verbose Color
=	TokenNameEQUAL	
PREFIX	TokenNameIdentifier	 PREFIX
+	TokenNamePLUS	
verbose	TokenNameIdentifier	 verbose
+	TokenNamePLUS	
SUFFIX	TokenNameIdentifier	 SUFFIX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
debugColor	TokenNameIdentifier	 debug Color
=	TokenNameEQUAL	
PREFIX	TokenNameIdentifier	 PREFIX
+	TokenNamePLUS	
debug	TokenNameIdentifier	 debug
+	TokenNamePLUS	
SUFFIX	TokenNameIdentifier	 SUFFIX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Ignore - we will use the defaults. 	TokenNameCOMMENT_LINE	Ignore - we will use the defaults. 
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
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
//Ignore - We do not want this to stop the build. 	TokenNameCOMMENT_LINE	Ignore - We do not want this to stop the build. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see DefaultLogger#printMessage */	TokenNameCOMMENT_JAVADOC	 @see DefaultLogger#printMessage 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
protected	TokenNameprotected	
void	TokenNamevoid	
printMessage	TokenNameIdentifier	 print Message
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
stream	TokenNameIdentifier	 stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
colorsSet	TokenNameIdentifier	 colors Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setColors	TokenNameIdentifier	 set Colors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorsSet	TokenNameIdentifier	 colors Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
:	TokenNameCOLON	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
errColor	TokenNameIdentifier	 err Color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
END_COLOR	TokenNameIdentifier	 END  COLOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
:	TokenNameCOLON	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
warnColor	TokenNameIdentifier	 warn Color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
END_COLOR	TokenNameIdentifier	 END  COLOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
:	TokenNameCOLON	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
infoColor	TokenNameIdentifier	 info Color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
END_COLOR	TokenNameIdentifier	 END  COLOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
:	TokenNameCOLON	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
verboseColor	TokenNameIdentifier	 verbose Color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
END_COLOR	TokenNameIdentifier	 END  COLOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
:	TokenNameCOLON	
// Fall through 	TokenNameCOMMENT_LINE	Fall through 
default	TokenNamedefault	
:	TokenNameCOLON	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
debugColor	TokenNameIdentifier	 debug Color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
END_COLOR	TokenNameIdentifier	 END  COLOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
strmessage	TokenNameIdentifier	 strmessage
=	TokenNameEQUAL	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
strmessage	TokenNameIdentifier	 strmessage
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
