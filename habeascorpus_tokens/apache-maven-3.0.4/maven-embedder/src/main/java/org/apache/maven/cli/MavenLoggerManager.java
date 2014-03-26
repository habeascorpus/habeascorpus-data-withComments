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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
logging	TokenNameIdentifier	 logging
.	TokenNameDOT	
AbstractLoggerManager	TokenNameIdentifier	 Abstract Logger Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
logging	TokenNameIdentifier	 logging
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
logging	TokenNameIdentifier	 logging
.	TokenNameDOT	
LoggerManager	TokenNameIdentifier	 Logger Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
logging	TokenNameIdentifier	 logging
.	TokenNameDOT	
console	TokenNameIdentifier	 console
.	TokenNameDOT	
ConsoleLogger	TokenNameIdentifier	 Console Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
personality	TokenNameIdentifier	 personality
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
phase	TokenNameIdentifier	 phase
.	TokenNameDOT	
Initializable	TokenNameIdentifier	 Initializable
;	TokenNameSEMICOLON	
/** * This is a simple logger manager that will only write the logging statements to the console. * <p/> * Sample configuration: * <pre> * <logging> * <implementation>org.codehaus.plexus.logging.ConsoleLoggerManager</implementation> * <logger> * <threshold>DEBUG</threshold> * </logger> * </logging> * </pre> * * @author Jason van Zyl * @author <a href="mailto:trygvis@inamo.no">Trygve Laugst&oslash;l</a> */	TokenNameCOMMENT_JAVADOC	 This is a simple logger manager that will only write the logging statements to the console. <p/> Sample configuration: <pre> <logging> <implementation>org.codehaus.plexus.logging.ConsoleLoggerManager</implementation> <logger> <threshold>DEBUG</threshold> </logger> </logging> </pre> * @author Jason van Zyl @author <a href="mailto:trygvis@inamo.no">Trygve Laugst&oslash;l</a> 
public	TokenNamepublic	
class	TokenNameclass	
MavenLoggerManager	TokenNameIdentifier	 Maven Logger Manager
extends	TokenNameextends	
AbstractLoggerManager	TokenNameIdentifier	 Abstract Logger Manager
implements	TokenNameimplements	
LoggerManager	TokenNameIdentifier	 Logger Manager
,	TokenNameCOMMA	
Initializable	TokenNameIdentifier	 Initializable
{	TokenNameLBRACE	
/** * Message of this level or higher will be logged. * <p/> * This field is set by the plexus container thus the name is 'threshold'. The field * currentThreshold contains the current setting of the threshold. */	TokenNameCOMMENT_JAVADOC	 Message of this level or higher will be logged. <p/> This field is set by the plexus container thus the name is 'threshold'. The field currentThreshold contains the current setting of the threshold. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
"info"	TokenNameStringLiteral	info
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
currentThreshold	TokenNameIdentifier	 current Threshold
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MavenLoggerManager	TokenNameIdentifier	 Maven Logger Manager
(	TokenNameLPAREN	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Initializing ConsoleLoggerManager: "	TokenNameStringLiteral	Initializing ConsoleLoggerManager: 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentThreshold	TokenNameIdentifier	 current Threshold
=	TokenNameEQUAL	
parseThreshold	TokenNameIdentifier	 parse Threshold
(	TokenNameLPAREN	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentThreshold	TokenNameIdentifier	 current Threshold
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Could not parse the threshold level: '"	TokenNameStringLiteral	Could not parse the threshold level: '
+	TokenNamePLUS	
threshold	TokenNameIdentifier	 threshold
+	TokenNamePLUS	
"', setting to debug."	TokenNameStringLiteral	', setting to debug.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentThreshold	TokenNameIdentifier	 current Threshold
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
LEVEL_DEBUG	TokenNameIdentifier	 LEVEL  DEBUG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
int	TokenNameint	
currentThreshold	TokenNameIdentifier	 current Threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
currentThreshold	TokenNameIdentifier	 current Threshold
=	TokenNameEQUAL	
currentThreshold	TokenNameIdentifier	 current Threshold
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setThresholds	TokenNameIdentifier	 set Thresholds
(	TokenNameLPAREN	
int	TokenNameint	
currentThreshold	TokenNameIdentifier	 current Threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
currentThreshold	TokenNameIdentifier	 current Threshold
=	TokenNameEQUAL	
currentThreshold	TokenNameIdentifier	 current Threshold
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
currentThreshold	TokenNameIdentifier	 current Threshold
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return Returns the threshold. */	TokenNameCOMMENT_JAVADOC	 @return Returns the threshold. 
public	TokenNamepublic	
int	TokenNameint	
getThreshold	TokenNameIdentifier	 get Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentThreshold	TokenNameIdentifier	 current Threshold
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
role	TokenNameIdentifier	 role
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
roleHint	TokenNameIdentifier	 role Hint
,	TokenNameCOMMA	
int	TokenNameint	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getThreshold	TokenNameIdentifier	 get Threshold
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
role	TokenNameIdentifier	 role
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
roleHint	TokenNameIdentifier	 role Hint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentThreshold	TokenNameIdentifier	 current Threshold
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Logger	TokenNameIdentifier	 Logger
getLoggerForComponent	TokenNameIdentifier	 get Logger For Component
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
role	TokenNameIdentifier	 role
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
roleHint	TokenNameIdentifier	 role Hint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
returnComponentLogger	TokenNameIdentifier	 return Component Logger
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
role	TokenNameIdentifier	 role
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
roleHint	TokenNameIdentifier	 role Hint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getActiveLoggerCount	TokenNameIdentifier	 get Active Logger Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
parseThreshold	TokenNameIdentifier	 parse Threshold
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"debug"	TokenNameStringLiteral	debug
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ConsoleLogger	TokenNameIdentifier	 Console Logger
.	TokenNameDOT	
LEVEL_DEBUG	TokenNameIdentifier	 LEVEL  DEBUG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"info"	TokenNameStringLiteral	info
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ConsoleLogger	TokenNameIdentifier	 Console Logger
.	TokenNameDOT	
LEVEL_INFO	TokenNameIdentifier	 LEVEL  INFO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"warn"	TokenNameStringLiteral	warn
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ConsoleLogger	TokenNameIdentifier	 Console Logger
.	TokenNameDOT	
LEVEL_WARN	TokenNameIdentifier	 LEVEL  WARN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"error"	TokenNameStringLiteral	error
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ConsoleLogger	TokenNameIdentifier	 Console Logger
.	TokenNameDOT	
LEVEL_ERROR	TokenNameIdentifier	 LEVEL  ERROR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"fatal"	TokenNameStringLiteral	fatal
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ConsoleLogger	TokenNameIdentifier	 Console Logger
.	TokenNameDOT	
LEVEL_FATAL	TokenNameIdentifier	 LEVEL  FATAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove this method and all references when this code is verified. * * @param msg */	TokenNameCOMMENT_JAVADOC	 Remove this method and all references when this code is verified. * @param msg 
private	TokenNameprivate	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
