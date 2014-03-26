/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
varia	TokenNameIdentifier	 varia
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
ErrorHandler	TokenNameIdentifier	 Error Handler
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Appender	TokenNameIdentifier	 Appender
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LogLog	TokenNameIdentifier	 Log Log
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
;	TokenNameSEMICOLON	
/** * * The <code>FallbackErrorHandler</code> implements the ErrorHandler * interface such that a secondary appender may be specified. This * secondary appender takes over if the primary appender fails for * whatever reason. * * <p>The error message is printed on <code>System.err</code>, and * logged in the new secondary appender. * * @author Ceki G&uuml;c&uuml; * */	TokenNameCOMMENT_JAVADOC	 * The <code>FallbackErrorHandler</code> implements the ErrorHandler interface such that a secondary appender may be specified. This secondary appender takes over if the primary appender fails for whatever reason. * <p>The error message is printed on <code>System.err</code>, and logged in the new secondary appender. * @author Ceki G&uuml;c&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
FallbackErrorHandler	TokenNameIdentifier	 Fallback Error Handler
implements	TokenNameimplements	
ErrorHandler	TokenNameIdentifier	 Error Handler
{	TokenNameLBRACE	
Appender	TokenNameIdentifier	 Appender
backup	TokenNameIdentifier	 backup
;	TokenNameSEMICOLON	
Appender	TokenNameIdentifier	 Appender
primary	TokenNameIdentifier	 primary
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
loggers	TokenNameIdentifier	 loggers
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FallbackErrorHandler	TokenNameIdentifier	 Fallback Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** <em>Adds</em> the logger passed as parameter to the list of loggers that we need to search for in case of appender failure. */	TokenNameCOMMENT_JAVADOC	 <em>Adds</em> the logger passed as parameter to the list of loggers that we need to search for in case of appender failure. 
public	TokenNamepublic	
void	TokenNamevoid	
setLogger	TokenNameIdentifier	 set Logger
(	TokenNameLPAREN	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"FB: Adding logger ["	TokenNameStringLiteral	FB: Adding logger [
+	TokenNamePLUS	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
loggers	TokenNameIdentifier	 loggers
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loggers	TokenNameIdentifier	 loggers
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
loggers	TokenNameIdentifier	 loggers
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** No options to activate. */	TokenNameCOMMENT_JAVADOC	 No options to activate. 
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Prints the message and the stack trace of the exception on <code>System.err</code>. */	TokenNameCOMMENT_JAVADOC	 Prints the message and the stack trace of the exception on <code>System.err</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
int	TokenNameint	
errorCode	TokenNameIdentifier	 error Code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
errorCode	TokenNameIdentifier	 error Code
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Prints the message and the stack trace of the exception on <code>System.err</code>. */	TokenNameCOMMENT_JAVADOC	 Prints the message and the stack trace of the exception on <code>System.err</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
int	TokenNameint	
errorCode	TokenNameIdentifier	 error Code
,	TokenNameCOMMA	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"FB: The following error reported: "	TokenNameStringLiteral	FB: The following error reported: 
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"FB: INITIATING FALLBACK PROCEDURE."	TokenNameStringLiteral	FB: INITIATING FALLBACK PROCEDURE.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
loggers	TokenNameIdentifier	 loggers
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
loggers	TokenNameIdentifier	 loggers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Logger	TokenNameIdentifier	 Logger
)	TokenNameRPAREN	
loggers	TokenNameIdentifier	 loggers
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"FB: Searching for ["	TokenNameStringLiteral	FB: Searching for [
+	TokenNamePLUS	
primary	TokenNameIdentifier	 primary
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"] in logger ["	TokenNameStringLiteral	] in logger [
+	TokenNamePLUS	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"FB: Replacing ["	TokenNameStringLiteral	FB: Replacing [
+	TokenNamePLUS	
primary	TokenNameIdentifier	 primary
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"] by ["	TokenNameStringLiteral	] by [
+	TokenNamePLUS	
backup	TokenNameIdentifier	 backup
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"] in logger ["	TokenNameStringLiteral	] in logger [
+	TokenNamePLUS	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
removeAppender	TokenNameIdentifier	 remove Appender
(	TokenNameLPAREN	
primary	TokenNameIdentifier	 primary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"FB: Adding appender ["	TokenNameStringLiteral	FB: Adding appender [
+	TokenNamePLUS	
backup	TokenNameIdentifier	 backup
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"] to logger "	TokenNameStringLiteral	] to logger 
+	TokenNamePLUS	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
backup	TokenNameIdentifier	 backup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Print a the error message passed as parameter on <code>System.err</code>. */	TokenNameCOMMENT_JAVADOC	 Print a the error message passed as parameter on <code>System.err</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//if(firstTime) { 	TokenNameCOMMENT_LINE	if(firstTime) { 
//LogLog.error(message); 	TokenNameCOMMENT_LINE	LogLog.error(message); 
//firstTime = false; 	TokenNameCOMMENT_LINE	firstTime = false; 
//} 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
/** The appender to which this error handler is attached. */	TokenNameCOMMENT_JAVADOC	 The appender to which this error handler is attached. 
public	TokenNamepublic	
void	TokenNamevoid	
setAppender	TokenNameIdentifier	 set Appender
(	TokenNameLPAREN	
Appender	TokenNameIdentifier	 Appender
primary	TokenNameIdentifier	 primary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"FB: Setting primary appender to ["	TokenNameStringLiteral	FB: Setting primary appender to [
+	TokenNamePLUS	
primary	TokenNameIdentifier	 primary
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
primary	TokenNameIdentifier	 primary
=	TokenNameEQUAL	
primary	TokenNameIdentifier	 primary
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the backup appender. */	TokenNameCOMMENT_JAVADOC	 Set the backup appender. 
public	TokenNamepublic	
void	TokenNamevoid	
setBackupAppender	TokenNameIdentifier	 set Backup Appender
(	TokenNameLPAREN	
Appender	TokenNameIdentifier	 Appender
backup	TokenNameIdentifier	 backup
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"FB: Setting backup appender to ["	TokenNameStringLiteral	FB: Setting backup appender to [
+	TokenNamePLUS	
backup	TokenNameIdentifier	 backup
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
backup	TokenNameIdentifier	 backup
=	TokenNameEQUAL	
backup	TokenNameIdentifier	 backup
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
