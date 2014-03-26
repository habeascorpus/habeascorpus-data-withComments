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
types	TokenNameIdentifier	 types
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
/** * The enumerated values for Ant's log level. */	TokenNameCOMMENT_JAVADOC	 The enumerated values for Ant's log level. 
public	TokenNamepublic	
class	TokenNameclass	
LogLevel	TokenNameIdentifier	 Log Level
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
/** ERR loglevel constant. */	TokenNameCOMMENT_JAVADOC	 ERR loglevel constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
LogLevel	TokenNameIdentifier	 Log Level
ERR	TokenNameIdentifier	 ERR
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"error"	TokenNameStringLiteral	error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** WARN loglevel constant. */	TokenNameCOMMENT_JAVADOC	 WARN loglevel constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
LogLevel	TokenNameIdentifier	 Log Level
WARN	TokenNameIdentifier	 WARN
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"warn"	TokenNameStringLiteral	warn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** INFO loglevel constant. */	TokenNameCOMMENT_JAVADOC	 INFO loglevel constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
LogLevel	TokenNameIdentifier	 Log Level
INFO	TokenNameIdentifier	 INFO
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"info"	TokenNameStringLiteral	info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** VERBOSE loglevel constant. */	TokenNameCOMMENT_JAVADOC	 VERBOSE loglevel constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
LogLevel	TokenNameIdentifier	 Log Level
VERBOSE	TokenNameIdentifier	 VERBOSE
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"verbose"	TokenNameStringLiteral	verbose
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** DEBUG loglevel constant. */	TokenNameCOMMENT_JAVADOC	 DEBUG loglevel constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
LogLevel	TokenNameIdentifier	 Log Level
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"debug"	TokenNameStringLiteral	debug
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Public constructor. */	TokenNameCOMMENT_JAVADOC	 Public constructor. 
public	TokenNamepublic	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see EnumeratedAttribute#getValues * @return the strings allowed for the level attribute */	TokenNameCOMMENT_JAVADOC	 @see EnumeratedAttribute#getValues @return the strings allowed for the level attribute 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"error"	TokenNameStringLiteral	error
,	TokenNameCOMMA	
"warn"	TokenNameStringLiteral	warn
,	TokenNameCOMMA	
"warning"	TokenNameStringLiteral	warning
,	TokenNameCOMMA	
"info"	TokenNameStringLiteral	info
,	TokenNameCOMMA	
"verbose"	TokenNameStringLiteral	verbose
,	TokenNameCOMMA	
"debug"	TokenNameStringLiteral	debug
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * mapping of enumerated values to log levels */	TokenNameCOMMENT_JAVADOC	 mapping of enumerated values to log levels 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
levels	TokenNameIdentifier	 levels
=	TokenNameEQUAL	
{	TokenNameLBRACE	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * get the level of the echo of the current value * @return the level */	TokenNameCOMMENT_JAVADOC	 get the level of the echo of the current value @return the level 
public	TokenNamepublic	
int	TokenNameint	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
levels	TokenNameIdentifier	 levels
[	TokenNameLBRACKET	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
