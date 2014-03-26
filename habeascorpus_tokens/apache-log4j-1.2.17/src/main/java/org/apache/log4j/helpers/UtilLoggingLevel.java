/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
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
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Level	TokenNameIdentifier	 Level
;	TokenNameSEMICOLON	
/** * An extension of the Level class that provides support for java.util.logging * Levels. * * * @author Scott Deboy (sdeboy@apache.org) */	TokenNameCOMMENT_JAVADOC	 An extension of the Level class that provides support for java.util.logging Levels. * @author Scott Deboy (sdeboy@apache.org) 
public	TokenNamepublic	
class	TokenNameclass	
UtilLoggingLevel	TokenNameIdentifier	 Util Logging Level
extends	TokenNameextends	
Level	TokenNameIdentifier	 Level
{	TokenNameLBRACE	
/** * Serialization version id. */	TokenNameCOMMENT_JAVADOC	 Serialization version id. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
909301162611820211L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Numerical value for SEVERE. */	TokenNameCOMMENT_JAVADOC	 Numerical value for SEVERE. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SEVERE_INT	TokenNameIdentifier	 SEVERE  INT
=	TokenNameEQUAL	
22000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Numerical value for WARNING. */	TokenNameCOMMENT_JAVADOC	 Numerical value for WARNING. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WARNING_INT	TokenNameIdentifier	 WARNING  INT
=	TokenNameEQUAL	
21000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//INFO level defined in parent as 20000..no need to redefine here 	TokenNameCOMMENT_LINE	INFO level defined in parent as 20000..no need to redefine here 
/** * Numerical value for CONFIG. */	TokenNameCOMMENT_JAVADOC	 Numerical value for CONFIG. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONFIG_INT	TokenNameIdentifier	 CONFIG  INT
=	TokenNameEQUAL	
14000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Numerical value for FINE. */	TokenNameCOMMENT_JAVADOC	 Numerical value for FINE. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FINE_INT	TokenNameIdentifier	 FINE  INT
=	TokenNameEQUAL	
13000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Numerical value for FINER. */	TokenNameCOMMENT_JAVADOC	 Numerical value for FINER. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FINER_INT	TokenNameIdentifier	 FINER  INT
=	TokenNameEQUAL	
12000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Numerical value for FINEST. */	TokenNameCOMMENT_JAVADOC	 Numerical value for FINEST. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FINEST_INT	TokenNameIdentifier	 FINEST  INT
=	TokenNameEQUAL	
11000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Numerical value for UNKNOWN. */	TokenNameCOMMENT_JAVADOC	 Numerical value for UNKNOWN. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
UNKNOWN_INT	TokenNameIdentifier	 UNKNOWN  INT
=	TokenNameEQUAL	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * SEVERE. */	TokenNameCOMMENT_JAVADOC	 SEVERE. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
UtilLoggingLevel	TokenNameIdentifier	 Util Logging Level
SEVERE	TokenNameIdentifier	 SEVERE
=	TokenNameEQUAL	
new	TokenNamenew	
UtilLoggingLevel	TokenNameIdentifier	 Util Logging Level
(	TokenNameLPAREN	
SEVERE_INT	TokenNameIdentifier	 SEVERE  INT
,	TokenNameCOMMA	
"SEVERE"	TokenNameStringLiteral	SEVERE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * WARNING. */	TokenNameCOMMENT_JAVADOC	 WARNING. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
UtilLoggingLevel	TokenNameIdentifier	 Util Logging Level
WARNING	TokenNameIdentifier	 WARNING
=	TokenNameEQUAL	
new	TokenNamenew	
UtilLoggingLevel	TokenNameIdentifier	 Util Logging Level
(	TokenNameLPAREN	
WARNING_INT	TokenNameIdentifier	 WARNING  INT
,	TokenNameCOMMA	
"WARNING"	TokenNameStringLiteral	WARNING
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * INFO. */	TokenNameCOMMENT_JAVADOC	 INFO. 
//note: we've aligned the int values of the java.util.logging INFO level with log4j's level 	TokenNameCOMMENT_LINE	note: we've aligned the int values of the java.util.logging INFO level with log4j's level 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
UtilLoggingLevel	TokenNameIdentifier	 Util Logging Level
INFO	TokenNameIdentifier	 INFO
=	TokenNameEQUAL	
new	TokenNamenew	
UtilLoggingLevel	TokenNameIdentifier	 Util Logging Level
(	TokenNameLPAREN	
INFO_INT	TokenNameIdentifier	 INFO  INT
,	TokenNameCOMMA	
"INFO"	TokenNameStringLiteral	INFO
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * CONFIG. */	TokenNameCOMMENT_JAVADOC	 CONFIG. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
UtilLoggingLevel	TokenNameIdentifier	 Util Logging Level
CONFIG	TokenNameIdentifier	 CONFIG
=	TokenNameEQUAL	
new	TokenNamenew	
UtilLoggingLevel	TokenNameIdentifier	 Util Logging Level
(	TokenNameLPAREN	
CONFIG_INT	TokenNameIdentifier	 CONFIG  INT
,	TokenNameCOMMA	
"CONFIG"	TokenNameStringLiteral	CONFIG
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * FINE. */	TokenNameCOMMENT_JAVADOC	 FINE. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
UtilLoggingLevel	TokenNameIdentifier	 Util Logging Level
FINE	TokenNameIdentifier	 FINE
=	TokenNameEQUAL	
new	TokenNamenew	
UtilLoggingLevel	TokenNameIdentifier	 Util Logging Level
(	TokenNameLPAREN	
FINE_INT	TokenNameIdentifier	 FINE  INT
,	TokenNameCOMMA	
"FINE"	TokenNameStringLiteral	FINE
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * FINER. */	TokenNameCOMMENT_JAVADOC	 FINER. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
UtilLoggingLevel	TokenNameIdentifier	 Util Logging Level
FINER	TokenNameIdentifier	 FINER
=	TokenNameEQUAL	
new	TokenNamenew	
UtilLoggingLevel	TokenNameIdentifier	 Util Logging Level
(	TokenNameLPAREN	
FINER_INT	TokenNameIdentifier	 FINER  INT
,	TokenNameCOMMA	
"FINER"	TokenNameStringLiteral	FINER
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * FINEST. */	TokenNameCOMMENT_JAVADOC	 FINEST. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
UtilLoggingLevel	TokenNameIdentifier	 Util Logging Level
FINEST	TokenNameIdentifier	 FINEST
=	TokenNameEQUAL	
new	TokenNamenew	
UtilLoggingLevel	TokenNameIdentifier	 Util Logging Level
(	TokenNameLPAREN	
FINEST_INT	TokenNameIdentifier	 FINEST  INT
,	TokenNameCOMMA	
"FINEST"	TokenNameStringLiteral	FINEST
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create new instance. * @param level numeric value for level. * @param levelStr symbolic name for level. * @param syslogEquivalent Equivalent syslog severity. */	TokenNameCOMMENT_JAVADOC	 Create new instance. @param level numeric value for level. @param levelStr symbolic name for level. @param syslogEquivalent Equivalent syslog severity. 
protected	TokenNameprotected	
UtilLoggingLevel	TokenNameIdentifier	 Util Logging Level
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
levelStr	TokenNameIdentifier	 level Str
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
syslogEquivalent	TokenNameIdentifier	 syslog Equivalent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
levelStr	TokenNameIdentifier	 level Str
,	TokenNameCOMMA	
syslogEquivalent	TokenNameIdentifier	 syslog Equivalent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert an integer passed as argument to a level. If the * conversion fails, then this method returns the specified default. * @param val numeric value. * @param defaultLevel level to be returned if no level matches * numeric value. * @return matching level or default level. */	TokenNameCOMMENT_JAVADOC	 Convert an integer passed as argument to a level. If the conversion fails, then this method returns the specified default. @param val numeric value. @param defaultLevel level to be returned if no level matches numeric value. @return matching level or default level. 
public	TokenNamepublic	
static	TokenNamestatic	
UtilLoggingLevel	TokenNameIdentifier	 Util Logging Level
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
final	TokenNamefinal	
UtilLoggingLevel	TokenNameIdentifier	 Util Logging Level
defaultLevel	TokenNameIdentifier	 default Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SEVERE_INT	TokenNameIdentifier	 SEVERE  INT
:	TokenNameCOLON	
return	TokenNamereturn	
SEVERE	TokenNameIdentifier	 SEVERE
;	TokenNameSEMICOLON	
case	TokenNamecase	
WARNING_INT	TokenNameIdentifier	 WARNING  INT
:	TokenNameCOLON	
return	TokenNamereturn	
WARNING	TokenNameIdentifier	 WARNING
;	TokenNameSEMICOLON	
case	TokenNamecase	
INFO_INT	TokenNameIdentifier	 INFO  INT
:	TokenNameCOLON	
return	TokenNamereturn	
INFO	TokenNameIdentifier	 INFO
;	TokenNameSEMICOLON	
case	TokenNamecase	
CONFIG_INT	TokenNameIdentifier	 CONFIG  INT
:	TokenNameCOLON	
return	TokenNamereturn	
CONFIG	TokenNameIdentifier	 CONFIG
;	TokenNameSEMICOLON	
case	TokenNamecase	
FINE_INT	TokenNameIdentifier	 FINE  INT
:	TokenNameCOLON	
return	TokenNamereturn	
FINE	TokenNameIdentifier	 FINE
;	TokenNameSEMICOLON	
case	TokenNamecase	
FINER_INT	TokenNameIdentifier	 FINER  INT
:	TokenNameCOLON	
return	TokenNamereturn	
FINER	TokenNameIdentifier	 FINER
;	TokenNameSEMICOLON	
case	TokenNamecase	
FINEST_INT	TokenNameIdentifier	 FINEST  INT
:	TokenNameCOLON	
return	TokenNamereturn	
FINEST	TokenNameIdentifier	 FINEST
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
defaultLevel	TokenNameIdentifier	 default Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Gets level matching numeric value. * @param val numeric value. * @return matching level or UtilLoggerLevel.FINEST if no match. */	TokenNameCOMMENT_JAVADOC	 Gets level matching numeric value. @param val numeric value. @return matching level or UtilLoggerLevel.FINEST if no match. 
public	TokenNamepublic	
static	TokenNamestatic	
Level	TokenNameIdentifier	 Level
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
FINEST	TokenNameIdentifier	 FINEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets list of supported levels. * @return list of supported levels. */	TokenNameCOMMENT_JAVADOC	 Gets list of supported levels. @return list of supported levels. 
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
getAllPossibleLevels	TokenNameIdentifier	 get All Possible Levels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FINE	TokenNameIdentifier	 FINE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FINER	TokenNameIdentifier	 FINER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FINEST	TokenNameIdentifier	 FINEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
CONFIG	TokenNameIdentifier	 CONFIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
WARNING	TokenNameIdentifier	 WARNING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SEVERE	TokenNameIdentifier	 SEVERE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get level with specified symbolic name. * @param s symbolic name. * @return matching level or Level.DEBUG if no match. */	TokenNameCOMMENT_JAVADOC	 Get level with specified symbolic name. @param s symbolic name. @return matching level or Level.DEBUG if no match. 
public	TokenNamepublic	
static	TokenNamestatic	
Level	TokenNameIdentifier	 Level
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get level with specified symbolic name. * @param sArg symbolic name. * @param defaultLevel level to return if no match. * @return matching level or defaultLevel if no match. */	TokenNameCOMMENT_JAVADOC	 Get level with specified symbolic name. @param sArg symbolic name. @param defaultLevel level to return if no match. @return matching level or defaultLevel if no match. 
public	TokenNamepublic	
static	TokenNamestatic	
Level	TokenNameIdentifier	 Level
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sArg	TokenNameIdentifier	 s Arg
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
defaultLevel	TokenNameIdentifier	 default Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sArg	TokenNameIdentifier	 s Arg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultLevel	TokenNameIdentifier	 default Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
sArg	TokenNameIdentifier	 s Arg
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"SEVERE"	TokenNameStringLiteral	SEVERE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SEVERE	TokenNameIdentifier	 SEVERE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//if(s.equals("FINE")) return Level.FINE; 	TokenNameCOMMENT_LINE	if(s.equals("FINE")) return Level.FINE; 
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"WARNING"	TokenNameStringLiteral	WARNING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
WARNING	TokenNameIdentifier	 WARNING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"INFO"	TokenNameStringLiteral	INFO
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
INFO	TokenNameIdentifier	 INFO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"CONFI"	TokenNameStringLiteral	CONFI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CONFIG	TokenNameIdentifier	 CONFIG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"FINE"	TokenNameStringLiteral	FINE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FINE	TokenNameIdentifier	 FINE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"FINER"	TokenNameStringLiteral	FINER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FINER	TokenNameIdentifier	 FINER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"FINEST"	TokenNameStringLiteral	FINEST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FINEST	TokenNameIdentifier	 FINEST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
defaultLevel	TokenNameIdentifier	 default Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
