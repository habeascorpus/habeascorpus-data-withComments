/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Contributors: Kitching Simon <Simon.Kitching@orange.ch> 	TokenNameCOMMENT_LINE	Contributors: Kitching Simon <Simon.Kitching@orange.ch> 
// Nicholas Wolff 	TokenNameCOMMENT_LINE	Nicholas Wolff 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
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
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectStreamException	TokenNameIdentifier	 Object Stream Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** Defines the minimum set of levels recognized by the system, that is <code>OFF</code>, <code>FATAL</code>, <code>ERROR</code>, <code>WARN</code>, <code>INFO</code, <code>DEBUG</code> and <code>ALL</code>. <p>The <code>Level</code> class may be subclassed to define a larger level set. @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 Defines the minimum set of levels recognized by the system, that is <code>OFF</code>, <code>FATAL</code>, <code>ERROR</code>, <code>WARN</code>, <code>INFO</code, <code>DEBUG</code> and <code>ALL</code>. <p>The <code>Level</code> class may be subclassed to define a larger level set. @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
Level	TokenNameIdentifier	 Level
extends	TokenNameextends	
Priority	TokenNameIdentifier	 Priority
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** * TRACE level integer value. * @since 1.2.12 */	TokenNameCOMMENT_JAVADOC	 TRACE level integer value. @since 1.2.12 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TRACE_INT	TokenNameIdentifier	 TRACE  INT
=	TokenNameEQUAL	
5000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The <code>OFF</code> has the highest possible rank and is intended to turn off logging. */	TokenNameCOMMENT_JAVADOC	 The <code>OFF</code> has the highest possible rank and is intended to turn off logging. 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
Level	TokenNameIdentifier	 Level
OFF	TokenNameIdentifier	 OFF
=	TokenNameEQUAL	
new	TokenNamenew	
Level	TokenNameIdentifier	 Level
(	TokenNameLPAREN	
OFF_INT	TokenNameIdentifier	 OFF  INT
,	TokenNameCOMMA	
"OFF"	TokenNameStringLiteral	OFF
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The <code>FATAL</code> level designates very severe error events that will presumably lead the application to abort. */	TokenNameCOMMENT_JAVADOC	 The <code>FATAL</code> level designates very severe error events that will presumably lead the application to abort. 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
Level	TokenNameIdentifier	 Level
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
/** The <code>ERROR</code> level designates error events that might still allow the application to continue running. */	TokenNameCOMMENT_JAVADOC	 The <code>ERROR</code> level designates error events that might still allow the application to continue running. 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
Level	TokenNameIdentifier	 Level
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
/** The <code>WARN</code> level designates potentially harmful situations. */	TokenNameCOMMENT_JAVADOC	 The <code>WARN</code> level designates potentially harmful situations. 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
Level	TokenNameIdentifier	 Level
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
/** The <code>INFO</code> level designates informational messages that highlight the progress of the application at coarse-grained level. */	TokenNameCOMMENT_JAVADOC	 The <code>INFO</code> level designates informational messages that highlight the progress of the application at coarse-grained level. 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
Level	TokenNameIdentifier	 Level
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
/** The <code>DEBUG</code> Level designates fine-grained informational events that are most useful to debug an application. */	TokenNameCOMMENT_JAVADOC	 The <code>DEBUG</code> Level designates fine-grained informational events that are most useful to debug an application. 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
Level	TokenNameIdentifier	 Level
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
/** * The <code>TRACE</code> Level designates finer-grained * informational events than the <code>DEBUG</code level. * @since 1.2.12 */	TokenNameCOMMENT_JAVADOC	 The <code>TRACE</code> Level designates finer-grained informational events than the <code>DEBUG</code level. @since 1.2.12 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
TRACE	TokenNameIdentifier	 TRACE
=	TokenNameEQUAL	
new	TokenNamenew	
Level	TokenNameIdentifier	 Level
(	TokenNameLPAREN	
TRACE_INT	TokenNameIdentifier	 TRACE  INT
,	TokenNameCOMMA	
"TRACE"	TokenNameStringLiteral	TRACE
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The <code>ALL</code> has the lowest possible rank and is intended to turn on all logging. */	TokenNameCOMMENT_JAVADOC	 The <code>ALL</code> has the lowest possible rank and is intended to turn on all logging. 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
Level	TokenNameIdentifier	 Level
ALL	TokenNameIdentifier	 ALL
=	TokenNameEQUAL	
new	TokenNamenew	
Level	TokenNameIdentifier	 Level
(	TokenNameLPAREN	
ALL_INT	TokenNameIdentifier	 ALL  INT
,	TokenNameCOMMA	
"ALL"	TokenNameStringLiteral	ALL
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Serialization version id. */	TokenNameCOMMENT_JAVADOC	 Serialization version id. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
3491141966387921974L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Instantiate a Level object. */	TokenNameCOMMENT_JAVADOC	 Instantiate a Level object. 
protected	TokenNameprotected	
Level	TokenNameIdentifier	 Level
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
/** Convert the string passed as argument to a level. If the conversion fails, then this method returns {@link #DEBUG}. */	TokenNameCOMMENT_JAVADOC	 Convert the string passed as argument to a level. If the conversion fails, then this method returns {@link #DEBUG}. 
public	TokenNamepublic	
static	TokenNamestatic	
Level	TokenNameIdentifier	 Level
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sArg	TokenNameIdentifier	 s Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
sArg	TokenNameIdentifier	 s Arg
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Convert an integer passed as argument to a level. If the conversion fails, then this method returns {@link #DEBUG}. */	TokenNameCOMMENT_JAVADOC	 Convert an integer passed as argument to a level. If the conversion fails, then this method returns {@link #DEBUG}. 
public	TokenNamepublic	
static	TokenNamestatic	
Level	TokenNameIdentifier	 Level
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
int	TokenNameint	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Convert an integer passed as argument to a level. If the conversion fails, then this method returns the specified default. */	TokenNameCOMMENT_JAVADOC	 Convert an integer passed as argument to a level. If the conversion fails, then this method returns the specified default. 
public	TokenNamepublic	
static	TokenNamestatic	
Level	TokenNameIdentifier	 Level
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
int	TokenNameint	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
defaultLevel	TokenNameIdentifier	 default Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ALL_INT	TokenNameIdentifier	 ALL  INT
:	TokenNameCOLON	
return	TokenNamereturn	
ALL	TokenNameIdentifier	 ALL
;	TokenNameSEMICOLON	
case	TokenNamecase	
DEBUG_INT	TokenNameIdentifier	 DEBUG  INT
:	TokenNameCOLON	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
;	TokenNameSEMICOLON	
case	TokenNamecase	
INFO_INT	TokenNameIdentifier	 INFO  INT
:	TokenNameCOLON	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
;	TokenNameSEMICOLON	
case	TokenNamecase	
WARN_INT	TokenNameIdentifier	 WARN  INT
:	TokenNameCOLON	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
;	TokenNameSEMICOLON	
case	TokenNamecase	
ERROR_INT	TokenNameIdentifier	 ERROR  INT
:	TokenNameCOLON	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
;	TokenNameSEMICOLON	
case	TokenNamecase	
FATAL_INT	TokenNameIdentifier	 FATAL  INT
:	TokenNameCOLON	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
;	TokenNameSEMICOLON	
case	TokenNamecase	
OFF_INT	TokenNameIdentifier	 OFF  INT
:	TokenNameCOLON	
return	TokenNamereturn	
OFF	TokenNameIdentifier	 OFF
;	TokenNameSEMICOLON	
case	TokenNamecase	
TRACE_INT	TokenNameIdentifier	 TRACE  INT
:	TokenNameCOLON	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
defaultLevel	TokenNameIdentifier	 default Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Convert the string passed as argument to a level. If the conversion fails, then this method returns the value of <code>defaultLevel</code>. */	TokenNameCOMMENT_JAVADOC	 Convert the string passed as argument to a level. If the conversion fails, then this method returns the value of <code>defaultLevel</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
Level	TokenNameIdentifier	 Level
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sArg	TokenNameIdentifier	 s Arg
,	TokenNameCOMMA	
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
return	TokenNamereturn	
defaultLevel	TokenNameIdentifier	 default Level
;	TokenNameSEMICOLON	
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
"ALL"	TokenNameStringLiteral	ALL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ALL	TokenNameIdentifier	 ALL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"DEBUG"	TokenNameStringLiteral	DEBUG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"INFO"	TokenNameStringLiteral	INFO
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"WARN"	TokenNameStringLiteral	WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"ERROR"	TokenNameStringLiteral	ERROR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"FATAL"	TokenNameStringLiteral	FATAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"OFF"	TokenNameStringLiteral	OFF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
OFF	TokenNameIdentifier	 OFF
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"TRACE"	TokenNameStringLiteral	TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// For Turkish i problem, see bug 40937 	TokenNameCOMMENT_LINE	For Turkish i problem, see bug 40937 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"?NFO"	TokenNameStringLiteral	?NFO
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultLevel	TokenNameIdentifier	 default Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Custom deserialization of Level. * @param s serialization stream. * @throws IOException if IO exception. * @throws ClassNotFoundException if class not found. */	TokenNameCOMMENT_JAVADOC	 Custom deserialization of Level. @param s serialization stream. @throws IOException if IO exception. @throws ClassNotFoundException if class not found. 
private	TokenNameprivate	
void	TokenNamevoid	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
final	TokenNamefinal	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
defaultReadObject	TokenNameIdentifier	 default Read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syslogEquivalent	TokenNameIdentifier	 syslog Equivalent
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
levelStr	TokenNameIdentifier	 level Str
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
levelStr	TokenNameIdentifier	 level Str
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
levelStr	TokenNameIdentifier	 level Str
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Serialize level. * @param s serialization stream. * @throws IOException if exception during serialization. */	TokenNameCOMMENT_JAVADOC	 Serialize level. @param s serialization stream. @throws IOException if exception during serialization. 
private	TokenNameprivate	
void	TokenNamevoid	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
final	TokenNamefinal	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
defaultWriteObject	TokenNameIdentifier	 default Write Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
syslogEquivalent	TokenNameIdentifier	 syslog Equivalent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
levelStr	TokenNameIdentifier	 level Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resolved deserialized level to one of the stock instances. * May be overriden in classes derived from Level. * @return resolved object. * @throws ObjectStreamException if exception during resolution. */	TokenNameCOMMENT_JAVADOC	 Resolved deserialized level to one of the stock instances. May be overriden in classes derived from Level. @return resolved object. @throws ObjectStreamException if exception during resolution. 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ObjectStreamException	TokenNameIdentifier	 Object Stream Exception
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// if the deserizalized object is exactly an instance of Level 	TokenNameCOMMENT_LINE	if the deserizalized object is exactly an instance of Level 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// extension of Level can't substitute stock item 	TokenNameCOMMENT_LINE	extension of Level can't substitute stock item 
// 	TokenNameCOMMENT_LINE	 
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
