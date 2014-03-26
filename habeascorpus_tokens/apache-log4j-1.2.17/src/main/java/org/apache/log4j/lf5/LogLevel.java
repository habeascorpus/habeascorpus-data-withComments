/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Color	TokenNameIdentifier	 Color
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * The LogLevel class defines a set of standard logging levels. * * The logging Level objects are ordered and are specified by ordered * integers. Enabling logging at a given level also enables logging at all * higher levels. * * @author Michael J. Sikorsky * @author Robert Shaw * @author Brent Sprecher * @author Richard Hurst * @author Brad Marlborough */	TokenNameCOMMENT_JAVADOC	 The LogLevel class defines a set of standard logging levels. * The logging Level objects are ordered and are specified by ordered integers. Enabling logging at a given level also enables logging at all higher levels. * @author Michael J. Sikorsky @author Robert Shaw @author Brent Sprecher @author Richard Hurst @author Brad Marlborough 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
LogLevel	TokenNameIdentifier	 Log Level
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// log4j log levels. 	TokenNameCOMMENT_LINE	log4j log levels. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
FATAL	TokenNameIdentifier	 FATAL
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"FATAL"	TokenNameStringLiteral	FATAL
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
ERROR	TokenNameIdentifier	 ERROR
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"ERROR"	TokenNameStringLiteral	ERROR
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
WARN	TokenNameIdentifier	 WARN
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"WARN"	TokenNameStringLiteral	WARN
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
INFO	TokenNameIdentifier	 INFO
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"INFO"	TokenNameStringLiteral	INFO
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"DEBUG"	TokenNameStringLiteral	DEBUG
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// jdk1.4 log levels NOTE: also includes INFO 	TokenNameCOMMENT_LINE	jdk1.4 log levels NOTE: also includes INFO 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
SEVERE	TokenNameIdentifier	 SEVERE
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"SEVERE"	TokenNameStringLiteral	SEVERE
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
WARNING	TokenNameIdentifier	 WARNING
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"WARNING"	TokenNameStringLiteral	WARNING
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
CONFIG	TokenNameIdentifier	 CONFIG
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"CONFIG"	TokenNameStringLiteral	CONFIG
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
FINE	TokenNameIdentifier	 FINE
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"FINE"	TokenNameStringLiteral	FINE
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
FINER	TokenNameIdentifier	 FINER
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"FINER"	TokenNameStringLiteral	FINER
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
FINEST	TokenNameIdentifier	 FINEST
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"FINEST"	TokenNameStringLiteral	FINEST
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
_label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
_precedence	TokenNameIdentifier	 precedence
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
private	TokenNameprivate	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_log4JLevels	TokenNameIdentifier	 log4 J Levels
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_jdk14Levels	TokenNameIdentifier	 jdk14 Levels
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_allDefaultLevels	TokenNameIdentifier	 all Default Levels
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
_logLevelMap	TokenNameIdentifier	 log Level Map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
_logLevelColorMap	TokenNameIdentifier	 log Level Color Map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
_registeredLogLevelMap	TokenNameIdentifier	 registered Log Level Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
static	TokenNamestatic	
{	TokenNameLBRACE	
_log4JLevels	TokenNameIdentifier	 log4 J Levels
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
FATAL	TokenNameIdentifier	 FATAL
,	TokenNameCOMMA	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
DEBUG	TokenNameIdentifier	 DEBUG
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
_jdk14Levels	TokenNameIdentifier	 jdk14 Levels
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SEVERE	TokenNameIdentifier	 SEVERE
,	TokenNameCOMMA	
WARNING	TokenNameIdentifier	 WARNING
,	TokenNameCOMMA	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
CONFIG	TokenNameIdentifier	 CONFIG
,	TokenNameCOMMA	
FINE	TokenNameIdentifier	 FINE
,	TokenNameCOMMA	
FINER	TokenNameIdentifier	 FINER
,	TokenNameCOMMA	
FINEST	TokenNameIdentifier	 FINEST
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
_allDefaultLevels	TokenNameIdentifier	 all Default Levels
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
FATAL	TokenNameIdentifier	 FATAL
,	TokenNameCOMMA	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
SEVERE	TokenNameIdentifier	 SEVERE
,	TokenNameCOMMA	
WARNING	TokenNameIdentifier	 WARNING
,	TokenNameCOMMA	
CONFIG	TokenNameIdentifier	 CONFIG
,	TokenNameCOMMA	
FINE	TokenNameIdentifier	 FINE
,	TokenNameCOMMA	
FINER	TokenNameIdentifier	 FINER
,	TokenNameCOMMA	
FINEST	TokenNameIdentifier	 FINEST
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
_logLevelMap	TokenNameIdentifier	 log Level Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
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
_allDefaultLevels	TokenNameIdentifier	 all Default Levels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_logLevelMap	TokenNameIdentifier	 log Level Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
_allDefaultLevels	TokenNameIdentifier	 all Default Levels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
_allDefaultLevels	TokenNameIdentifier	 all Default Levels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// prepopulate map with levels and text color of black 	TokenNameCOMMENT_LINE	prepopulate map with levels and text color of black 
_logLevelColorMap	TokenNameIdentifier	 log Level Color Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
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
_allDefaultLevels	TokenNameIdentifier	 all Default Levels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_logLevelColorMap	TokenNameIdentifier	 log Level Color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
_allDefaultLevels	TokenNameIdentifier	 all Default Levels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
black	TokenNameIdentifier	 black
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
int	TokenNameint	
precedence	TokenNameIdentifier	 precedence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
_precedence	TokenNameIdentifier	 precedence
=	TokenNameEQUAL	
precedence	TokenNameIdentifier	 precedence
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
/** * Return the Label of the LogLevel. */	TokenNameCOMMENT_JAVADOC	 Return the Label of the LogLevel. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the level supplied is encompassed by this level. * For example, LogLevel.SEVERE encompasses no other LogLevels and * LogLevel.FINE encompasses all other LogLevels. By definition, * a LogLevel encompasses itself. */	TokenNameCOMMENT_JAVADOC	 Returns true if the level supplied is encompassed by this level. For example, LogLevel.SEVERE encompasses no other LogLevels and LogLevel.FINE encompasses all other LogLevels. By definition, a LogLevel encompasses itself. 
public	TokenNamepublic	
boolean	TokenNameboolean	
encompasses	TokenNameIdentifier	 encompasses
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
.	TokenNameDOT	
getPrecedence	TokenNameIdentifier	 get Precedence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
getPrecedence	TokenNameIdentifier	 get Precedence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert a log level label into a LogLevel object. * * @param level The label of a level to be converted into a LogLevel. * @return LogLevel The LogLevel with a label equal to level. * @throws LogLevelFormatException Is thrown when the level can not be * converted into a LogLevel. */	TokenNameCOMMENT_JAVADOC	 Convert a log level label into a LogLevel object. * @param level The label of a level to be converted into a LogLevel. @return LogLevel The LogLevel with a label equal to level. @throws LogLevelFormatException Is thrown when the level can not be converted into a LogLevel. 
public	TokenNamepublic	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
throws	TokenNamethrows	
LogLevelFormatException	TokenNameIdentifier	 Log Level Format Exception
{	TokenNameLBRACE	
LogLevel	TokenNameIdentifier	 Log Level
logLevel	TokenNameIdentifier	 log Level
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
level	TokenNameIdentifier	 level
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logLevel	TokenNameIdentifier	 log Level
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
)	TokenNameRPAREN	
_logLevelMap	TokenNameIdentifier	 log Level Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Didn't match, Check for registered LogLevels 	TokenNameCOMMENT_LINE	Didn't match, Check for registered LogLevels 
if	TokenNameif	
(	TokenNameLPAREN	
logLevel	TokenNameIdentifier	 log Level
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
_registeredLogLevelMap	TokenNameIdentifier	 registered Log Level Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logLevel	TokenNameIdentifier	 log Level
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
)	TokenNameRPAREN	
_registeredLogLevelMap	TokenNameIdentifier	 registered Log Level Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logLevel	TokenNameIdentifier	 log Level
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Error while trying to parse ("	TokenNameStringLiteral	Error while trying to parse (
+	TokenNamePLUS	
level	TokenNameIdentifier	 level
+	TokenNamePLUS	
") into"	TokenNameStringLiteral	) into
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" a LogLevel."	TokenNameStringLiteral	 a LogLevel.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
LogLevelFormatException	TokenNameIdentifier	 Log Level Format Exception
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
logLevel	TokenNameIdentifier	 log Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Registers a used defined LogLevel. * * @param logLevel The log level to be registered. Cannot be a default LogLevel * @return LogLevel The replaced log level. */	TokenNameCOMMENT_JAVADOC	 Registers a used defined LogLevel. * @param logLevel The log level to be registered. Cannot be a default LogLevel @return LogLevel The replaced log level. 
public	TokenNamepublic	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
logLevel	TokenNameIdentifier	 log Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logLevel	TokenNameIdentifier	 log Level
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// ensure that this is not a default log level 	TokenNameCOMMENT_LINE	ensure that this is not a default log level 
if	TokenNameif	
(	TokenNameLPAREN	
_logLevelMap	TokenNameIdentifier	 log Level Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
logLevel	TokenNameIdentifier	 log Level
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
)	TokenNameRPAREN	
_registeredLogLevelMap	TokenNameIdentifier	 registered Log Level Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
logLevel	TokenNameIdentifier	 log Level
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
logLevel	TokenNameIdentifier	 log Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
logLevels	TokenNameIdentifier	 log Levels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logLevels	TokenNameIdentifier	 log Levels
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
logLevels	TokenNameIdentifier	 log Levels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
logLevels	TokenNameIdentifier	 log Levels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
logLevels	TokenNameIdentifier	 log Levels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logLevels	TokenNameIdentifier	 log Levels
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
logLevels	TokenNameIdentifier	 log Levels
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
LogLevel	TokenNameIdentifier	 Log Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getPrecedence	TokenNameIdentifier	 get Precedence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
getPrecedence	TokenNameIdentifier	 get Precedence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
equals	TokenNameIdentifier	 equals
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
equals	TokenNameIdentifier	 equals
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_label	TokenNameIdentifier	 label
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// set a text color for a specific log level 	TokenNameCOMMENT_LINE	set a text color for a specific log level 
public	TokenNamepublic	
void	TokenNamevoid	
setLogLevelColorMap	TokenNameIdentifier	 set Log Level Color Map
(	TokenNameLPAREN	
LogLevel	TokenNameIdentifier	 Log Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
color	TokenNameIdentifier	 color
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// remove the old entry 	TokenNameCOMMENT_LINE	remove the old entry 
_logLevelColorMap	TokenNameIdentifier	 log Level Color Map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add the new color entry 	TokenNameCOMMENT_LINE	add the new color entry 
if	TokenNameif	
(	TokenNameLPAREN	
color	TokenNameIdentifier	 color
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
color	TokenNameIdentifier	 color
=	TokenNameEQUAL	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
black	TokenNameIdentifier	 black
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_logLevelColorMap	TokenNameIdentifier	 log Level Color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
color	TokenNameIdentifier	 color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
resetLogLevelColorMap	TokenNameIdentifier	 reset Log Level Color Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// empty the map 	TokenNameCOMMENT_LINE	empty the map 
_logLevelColorMap	TokenNameIdentifier	 log Level Color Map
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// repopulate map and reset text color black 	TokenNameCOMMENT_LINE	repopulate map and reset text color black 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
_allDefaultLevels	TokenNameIdentifier	 all Default Levels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_logLevelColorMap	TokenNameIdentifier	 log Level Color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
_allDefaultLevels	TokenNameIdentifier	 all Default Levels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
black	TokenNameIdentifier	 black
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @return A <code>List</code> of <code>LogLevel</code> objects that map * to log4j <code>Priority</code> objects. */	TokenNameCOMMENT_JAVADOC	 @return A <code>List</code> of <code>LogLevel</code> objects that map to log4j <code>Priority</code> objects. 
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
getLog4JLevels	TokenNameIdentifier	 get Log4 J Levels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
_log4JLevels	TokenNameIdentifier	 log4 J Levels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
getJdk14Levels	TokenNameIdentifier	 get Jdk14 Levels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
_jdk14Levels	TokenNameIdentifier	 jdk14 Levels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
getAllDefaultLevels	TokenNameIdentifier	 get All Default Levels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
_allDefaultLevels	TokenNameIdentifier	 all Default Levels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
getLogLevelColorMap	TokenNameIdentifier	 get Log Level Color Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_logLevelColorMap	TokenNameIdentifier	 log Level Color Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
int	TokenNameint	
getPrecedence	TokenNameIdentifier	 get Precedence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_precedence	TokenNameIdentifier	 precedence
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Methods: 	TokenNameCOMMENT_LINE	Private Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Nested Top-Level Classes or Interfaces: 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
}	TokenNameRBRACE	
