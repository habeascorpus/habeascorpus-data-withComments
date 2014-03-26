/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Contributors: Kitching Simon <Simon.Kitching@orange.ch> 	TokenNameCOMMENT_LINE	Contributors: Kitching Simon <Simon.Kitching@orange.ch> 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
;	TokenNameSEMICOLON	
/** <font color="#AA4444">Refrain from using this class directly, use the {@link Level} class instead</font>. @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 <font color="#AA4444">Refrain from using this class directly, use the {@link Level} class instead</font>. @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
Priority	TokenNameIdentifier	 Priority
{	TokenNameLBRACE	
transient	TokenNametransient	
int	TokenNameint	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
transient	TokenNametransient	
String	TokenNameIdentifier	 String
levelStr	TokenNameIdentifier	 level Str
;	TokenNameSEMICOLON	
transient	TokenNametransient	
int	TokenNameint	
syslogEquivalent	TokenNameIdentifier	 syslog Equivalent
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
OFF_INT	TokenNameIdentifier	 OFF  INT
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
FATAL_INT	TokenNameIdentifier	 FATAL  INT
=	TokenNameEQUAL	
50000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
ERROR_INT	TokenNameIdentifier	 ERROR  INT
=	TokenNameEQUAL	
40000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
WARN_INT	TokenNameIdentifier	 WARN  INT
=	TokenNameEQUAL	
30000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
INFO_INT	TokenNameIdentifier	 INFO  INT
=	TokenNameEQUAL	
20000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
DEBUG_INT	TokenNameIdentifier	 DEBUG  INT
=	TokenNameEQUAL	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//public final static int FINE_INT = DEBUG_INT; 	TokenNameCOMMENT_LINE	public final static int FINE_INT = DEBUG_INT; 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
ALL_INT	TokenNameIdentifier	 ALL  INT
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
/** * @deprecated Use {@link Level#FATAL} instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated Use {@link Level#FATAL} instead. 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
Priority	TokenNameIdentifier	 Priority
FATAL	TokenNameIdentifier	 FATAL
=	TokenNameEQUAL	
new	TokenNamenew	
Level	TokenNameIdentifier	 Level
(	TokenNameLPAREN	
FATAL_INT	TokenNameIdentifier	 FATAL  INT
,	TokenNameCOMMA	
"FATAL"	TokenNameStringLiteral	FATAL
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @deprecated Use {@link Level#ERROR} instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated Use {@link Level#ERROR} instead. 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
Priority	TokenNameIdentifier	 Priority
ERROR	TokenNameIdentifier	 ERROR
=	TokenNameEQUAL	
new	TokenNamenew	
Level	TokenNameIdentifier	 Level
(	TokenNameLPAREN	
ERROR_INT	TokenNameIdentifier	 ERROR  INT
,	TokenNameCOMMA	
"ERROR"	TokenNameStringLiteral	ERROR
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @deprecated Use {@link Level#WARN} instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated Use {@link Level#WARN} instead. 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
Priority	TokenNameIdentifier	 Priority
WARN	TokenNameIdentifier	 WARN
=	TokenNameEQUAL	
new	TokenNamenew	
Level	TokenNameIdentifier	 Level
(	TokenNameLPAREN	
WARN_INT	TokenNameIdentifier	 WARN  INT
,	TokenNameCOMMA	
"WARN"	TokenNameStringLiteral	WARN
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @deprecated Use {@link Level#INFO} instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated Use {@link Level#INFO} instead. 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
Priority	TokenNameIdentifier	 Priority
INFO	TokenNameIdentifier	 INFO
=	TokenNameEQUAL	
new	TokenNamenew	
Level	TokenNameIdentifier	 Level
(	TokenNameLPAREN	
INFO_INT	TokenNameIdentifier	 INFO  INT
,	TokenNameCOMMA	
"INFO"	TokenNameStringLiteral	INFO
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @deprecated Use {@link Level#DEBUG} instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated Use {@link Level#DEBUG} instead. 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
Priority	TokenNameIdentifier	 Priority
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
new	TokenNamenew	
Level	TokenNameIdentifier	 Level
(	TokenNameLPAREN	
DEBUG_INT	TokenNameIdentifier	 DEBUG  INT
,	TokenNameCOMMA	
"DEBUG"	TokenNameStringLiteral	DEBUG
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Default constructor for deserialization. */	TokenNameCOMMENT_JAVADOC	 Default constructor for deserialization. 
protected	TokenNameprotected	
Priority	TokenNameIdentifier	 Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
DEBUG_INT	TokenNameIdentifier	 DEBUG  INT
;	TokenNameSEMICOLON	
levelStr	TokenNameIdentifier	 level Str
=	TokenNameEQUAL	
"DEBUG"	TokenNameStringLiteral	DEBUG
;	TokenNameSEMICOLON	
syslogEquivalent	TokenNameIdentifier	 syslog Equivalent
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Instantiate a level object. */	TokenNameCOMMENT_JAVADOC	 Instantiate a level object. 
protected	TokenNameprotected	
Priority	TokenNameIdentifier	 Priority
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
levelStr	TokenNameIdentifier	 level Str
,	TokenNameCOMMA	
int	TokenNameint	
syslogEquivalent	TokenNameIdentifier	 syslog Equivalent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
levelStr	TokenNameIdentifier	 level Str
=	TokenNameEQUAL	
levelStr	TokenNameIdentifier	 level Str
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
syslogEquivalent	TokenNameIdentifier	 syslog Equivalent
=	TokenNameEQUAL	
syslogEquivalent	TokenNameIdentifier	 syslog Equivalent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Two priorities are equal if their level fields are equal. @since 1.2 */	TokenNameCOMMENT_JAVADOC	 Two priorities are equal if their level fields are equal. @since 1.2 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Priority	TokenNameIdentifier	 Priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Priority	TokenNameIdentifier	 Priority
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
==	TokenNameEQUAL_EQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Return the syslog equivalent of this priority as an integer. */	TokenNameCOMMENT_JAVADOC	 Return the syslog equivalent of this priority as an integer. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getSyslogEquivalent	TokenNameIdentifier	 get Syslog Equivalent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
syslogEquivalent	TokenNameIdentifier	 syslog Equivalent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns <code>true</code> if this level has a higher or equal level than the level passed as argument, <code>false</code> otherwise. <p>You should think twice before overriding the default implementation of <code>isGreaterOrEqual</code> method. */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if this level has a higher or equal level than the level passed as argument, <code>false</code> otherwise. <p>You should think twice before overriding the default implementation of <code>isGreaterOrEqual</code> method. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isGreaterOrEqual	TokenNameIdentifier	 is Greater Or Equal
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
level	TokenNameIdentifier	 level
>=	TokenNameGREATER_EQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return all possible priorities as an array of Level objects in descending order. @deprecated This method will be removed with no replacement. */	TokenNameCOMMENT_JAVADOC	 Return all possible priorities as an array of Level objects in descending order. @deprecated This method will be removed with no replacement. 
public	TokenNamepublic	
static	TokenNamestatic	
Priority	TokenNameIdentifier	 Priority
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAllPossiblePriorities	TokenNameIdentifier	 get All Possible Priorities
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Priority	TokenNameIdentifier	 Priority
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the string representation of this priority. */	TokenNameCOMMENT_JAVADOC	 Returns the string representation of this priority. 
final	TokenNamefinal	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
levelStr	TokenNameIdentifier	 level Str
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the integer representation of this level. */	TokenNameCOMMENT_JAVADOC	 Returns the integer representation of this level. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated Please use the {@link Level#toLevel(String)} method instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated Please use the {@link Level#toLevel(String)} method instead. 
public	TokenNamepublic	
static	TokenNamestatic	
Priority	TokenNameIdentifier	 Priority
toPriority	TokenNameIdentifier	 to Priority
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sArg	TokenNameIdentifier	 s Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
sArg	TokenNameIdentifier	 s Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated Please use the {@link Level#toLevel(int)} method instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated Please use the {@link Level#toLevel(int)} method instead. 
public	TokenNamepublic	
static	TokenNamestatic	
Priority	TokenNameIdentifier	 Priority
toPriority	TokenNameIdentifier	 to Priority
(	TokenNameLPAREN	
int	TokenNameint	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toPriority	TokenNameIdentifier	 to Priority
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated Please use the {@link Level#toLevel(int, Level)} method instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated Please use the {@link Level#toLevel(int, Level)} method instead. 
public	TokenNamepublic	
static	TokenNamestatic	
Priority	TokenNameIdentifier	 Priority
toPriority	TokenNameIdentifier	 to Priority
(	TokenNameLPAREN	
int	TokenNameint	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
defaultPriority	TokenNameIdentifier	 default Priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
defaultPriority	TokenNameIdentifier	 default Priority
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated Please use the {@link Level#toLevel(String, Level)} method instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated Please use the {@link Level#toLevel(String, Level)} method instead. 
public	TokenNamepublic	
static	TokenNamestatic	
Priority	TokenNameIdentifier	 Priority
toPriority	TokenNameIdentifier	 to Priority
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sArg	TokenNameIdentifier	 s Arg
,	TokenNameCOMMA	
Priority	TokenNameIdentifier	 Priority
defaultPriority	TokenNameIdentifier	 default Priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
sArg	TokenNameIdentifier	 s Arg
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
defaultPriority	TokenNameIdentifier	 default Priority
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
