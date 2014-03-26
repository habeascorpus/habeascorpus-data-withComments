/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
;	TokenNameSEMICOLON	
/** * This class provides parameterized logging services * using the SLF4J pattern syntax. * <p> * Message formatting is only performed when the * request exceeds the threshold level of the logger. * * @since 1.2.16 * */	TokenNameCOMMENT_JAVADOC	 This class provides parameterized logging services using the SLF4J pattern syntax. <p> Message formatting is only performed when the request exceeds the threshold level of the logger. * @since 1.2.16 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
LogSF	TokenNameIdentifier	 Log SF
extends	TokenNameextends	
LogXF	TokenNameIdentifier	 Log XF
{	TokenNameLBRACE	
/** * private constructor. * */	TokenNameCOMMENT_JAVADOC	 private constructor. 
private	TokenNameprivate	
LogSF	TokenNameIdentifier	 Log SF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Formats arguments using SLF4J-like formatter. * @param pattern pattern, may be malformed. * @param arguments arguments. * @return Message string */	TokenNameCOMMENT_JAVADOC	 Formats arguments using SLF4J-like formatter. @param pattern pattern, may be malformed. @param arguments arguments. @return Message string 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retval	TokenNameIdentifier	 retval
+=	TokenNamePLUS_EQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arguments	TokenNameIdentifier	 arguments
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retval	TokenNameIdentifier	 retval
+=	TokenNamePLUS_EQUAL	
arguments	TokenNameIdentifier	 arguments
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
retval	TokenNameIdentifier	 retval
+=	TokenNamePLUS_EQUAL	
"{}"	TokenNameStringLiteral	{}
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
retval	TokenNameIdentifier	 retval
+=	TokenNamePLUS_EQUAL	
"{"	TokenNameStringLiteral	{
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
retval	TokenNameIdentifier	 retval
+=	TokenNamePLUS_EQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"{"	TokenNameStringLiteral	{
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
retval	TokenNameIdentifier	 retval
+	TokenNamePLUS	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Formats arguments using MessageFormat. * @param pattern pattern, may be malformed. * @param arg0 argument, may be null or mismatched. * @return Message string */	TokenNameCOMMENT_JAVADOC	 Formats arguments using MessageFormat. @param pattern pattern, may be malformed. @param arg0 argument, may be null or mismatched. @return Message string 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// if there is an escaped brace, delegate to multi-param formatter 	TokenNameCOMMENT_LINE	if there is an escaped brace, delegate to multi-param formatter 
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"\{"	TokenNameStringLiteral	\{
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
arg0	TokenNameIdentifier	 arg0
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"{}"	TokenNameStringLiteral	{}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
+	TokenNamePLUS	
arg0	TokenNameIdentifier	 arg0
+	TokenNamePLUS	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Formats arguments using MessageFormat using a pattern from * a resource bundle. * @param resourceBundleName name of resource bundle, may be null. * @param key key for pattern in resource bundle, may be null. * @param arguments arguments, may be null or mismatched. * @return Message string or null */	TokenNameCOMMENT_JAVADOC	 Formats arguments using MessageFormat using a pattern from a resource bundle. @param resourceBundleName name of resource bundle, may be null. @param key key for pattern in resource bundle, may be null. @param arguments arguments, may be null or mismatched. @return Message string or null 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
resourceBundleName	TokenNameIdentifier	 resource Bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resourceBundleName	TokenNameIdentifier	 resource Bundle Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
bundle	TokenNameIdentifier	 bundle
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
resourceBundleName	TokenNameIdentifier	 resource Bundle Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
bundle	TokenNameIdentifier	 bundle
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fully Qualified Class Name of this class. */	TokenNameCOMMENT_JAVADOC	 Fully Qualified Class Name of this class. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FQCN	TokenNameIdentifier	 FQCN
=	TokenNameEQUAL	
LogSF	TokenNameIdentifier	 Log SF
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Equivalent of Logger.forcedLog. * * @param logger logger, may not be null. * @param level level, may not be null. * @param msg message, may be null. */	TokenNameCOMMENT_JAVADOC	 Equivalent of Logger.forcedLog. * @param logger logger, may not be null. @param level level, may not be null. @param msg message, may be null. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
callAppenders	TokenNameIdentifier	 call Appenders
(	TokenNameLPAREN	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Equivalent of Logger.forcedLog. * * @param logger logger, may not be null. * @param level level, may not be null. * @param msg message, may be null. * @param t throwable. */	TokenNameCOMMENT_JAVADOC	 Equivalent of Logger.forcedLog. * @param logger logger, may not be null. @param level level, may not be null. @param msg message, may be null. @param t throwable. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
callAppenders	TokenNameIdentifier	 call Appenders
(	TokenNameLPAREN	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be * formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at error level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at error level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at fatal level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at fatal level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param t throwable, may be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be * formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param t throwable, may be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param t throwable, may be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param t throwable, may be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param t throwable, may be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param t throwable, may be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param t throwable, may be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param t throwable, may be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at error level. * @param logger logger, may not be null. * @param t throwable, may be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at error level. @param logger logger, may not be null. @param t throwable, may be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at fatal level. * @param logger logger, may not be null. * @param t throwable, may be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at fatal level. @param logger logger, may not be null. @param t throwable, may be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
byte	TokenNamebyte	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
short	TokenNameshort	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
long	TokenNamelong	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
float	TokenNamefloat	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. * @param arg3 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. @param arg3 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
byte	TokenNamebyte	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
short	TokenNameshort	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
long	TokenNamelong	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
float	TokenNamefloat	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. * @param arg3 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. @param arg3 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
byte	TokenNamebyte	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
short	TokenNameshort	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
long	TokenNamelong	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
float	TokenNamefloat	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. * @param arg3 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. @param arg3 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
byte	TokenNamebyte	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
short	TokenNameshort	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
long	TokenNamelong	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
float	TokenNamefloat	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. * @param arg3 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. @param arg3 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param parameters parameters to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param parameters parameters to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param t throwable, may be null. * @param pattern pattern, may be null. * @param parameters parameters to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param t throwable, may be null. @param pattern pattern, may be null. @param parameters parameters to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param param1 parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param param1 parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param param1 parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param param1 parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param param1 parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param param1 parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
byte	TokenNamebyte	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param param1 parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param param1 parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param param1 parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param param1 parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
short	TokenNameshort	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param param1 parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param param1 parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param param1 parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param param1 parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
long	TokenNamelong	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param param1 parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param param1 parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
float	TokenNamefloat	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param param1 parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param param1 parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specifed level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specifed level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param level level, may not be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. * @param arg3 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param pattern pattern, may be null. @param level level, may not be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. @param arg3 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param parameters parameters to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param parameters parameters to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param t throwable, may be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param parameters parameters to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param t throwable, may be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param parameters parameters to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
byte	TokenNamebyte	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
short	TokenNameshort	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
long	TokenNamelong	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
float	TokenNamefloat	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param0 Parameter to the log message. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param0 Parameter to the log message. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param0	TokenNameIdentifier	 param0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
param0	TokenNameIdentifier	 param0
,	TokenNameCOMMA	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param0 Parameter to the log message. * @param param1 Parameter to the log message. * @param param2 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param0 Parameter to the log message. @param param1 Parameter to the log message. @param param2 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param0	TokenNameIdentifier	 param0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param1	TokenNameIdentifier	 param1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param2	TokenNameIdentifier	 param2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
param0	TokenNameIdentifier	 param0
,	TokenNameCOMMA	
param1	TokenNameIdentifier	 param1
,	TokenNameCOMMA	
param2	TokenNameIdentifier	 param2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param0 Parameter to the log message. * @param param1 Parameter to the log message. * @param param2 Parameter to the log message. * @param param3 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param0 Parameter to the log message. @param param1 Parameter to the log message. @param param2 Parameter to the log message. @param param3 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param0	TokenNameIdentifier	 param0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param1	TokenNameIdentifier	 param1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param2	TokenNameIdentifier	 param2
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param3	TokenNameIdentifier	 param3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
param0	TokenNameIdentifier	 param0
,	TokenNameCOMMA	
param1	TokenNameIdentifier	 param1
,	TokenNameCOMMA	
param2	TokenNameIdentifier	 param2
,	TokenNameCOMMA	
param3	TokenNameIdentifier	 param3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
