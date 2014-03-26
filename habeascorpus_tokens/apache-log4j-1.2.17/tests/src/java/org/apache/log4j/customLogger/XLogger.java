/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
customLogger	TokenNameIdentifier	 custom Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
OptionHandler	TokenNameIdentifier	 Option Handler
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
LoggerFactory	TokenNameIdentifier	 Logger Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
XLevel	TokenNameIdentifier	 X Level
;	TokenNameSEMICOLON	
/** A simple example showing Logger sub-classing. It shows the minimum steps necessary to implement one's {@link LoggerFactory}. Note that sub-classes follow the hierarchy even if its loggers belong to different classes. */	TokenNameCOMMENT_JAVADOC	 A simple example showing Logger sub-classing. It shows the minimum steps necessary to implement one's {@link LoggerFactory}. Note that sub-classes follow the hierarchy even if its loggers belong to different classes. 
public	TokenNamepublic	
class	TokenNameclass	
XLogger	TokenNameIdentifier	 X Logger
extends	TokenNameextends	
Logger	TokenNameIdentifier	 Logger
implements	TokenNameimplements	
OptionHandler	TokenNameIdentifier	 Option Handler
{	TokenNameLBRACE	
// It's usually a good idea to add a dot suffix to the fully 	TokenNameCOMMENT_LINE	It's usually a good idea to add a dot suffix to the fully 
// qualified class name. This makes caller localization to work 	TokenNameCOMMENT_LINE	qualified class name. This makes caller localization to work 
// properly even from classes that have almost the same fully 	TokenNameCOMMENT_LINE	properly even from classes that have almost the same fully 
// qualified class name as XLogger, such as XLogegoryTest. 	TokenNameCOMMENT_LINE	qualified class name as XLogger, such as XLogegoryTest. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
FQCN	TokenNameIdentifier	 FQCN
=	TokenNameEQUAL	
XLogger	TokenNameIdentifier	 X Logger
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
;	TokenNameSEMICOLON	
// It's enough to instantiate a factory once and for all. 	TokenNameCOMMENT_LINE	It's enough to instantiate a factory once and for all. 
private	TokenNameprivate	
static	TokenNamestatic	
XFactory	TokenNameIdentifier	 X Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
new	TokenNamenew	
XFactory	TokenNameIdentifier	 X Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** Just calls the parent constuctor. */	TokenNameCOMMENT_JAVADOC	 Just calls the parent constuctor. 
protected	TokenNameprotected	
XLogger	TokenNameIdentifier	 X Logger
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Nothing to activate. */	TokenNameCOMMENT_JAVADOC	 Nothing to activate. 
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Overrides the standard debug method by appending the value of suffix variable to each message. */	TokenNameCOMMENT_JAVADOC	 Overrides the standard debug method by appending the value of suffix variable to each message. 
public	TokenNamepublic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
suffix	TokenNameIdentifier	 suffix
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** We introduce a new printing method in order to support {@link XLevel#LETHAL}. */	TokenNameCOMMENT_JAVADOC	 We introduce a new printing method in order to support {@link XLevel#LETHAL}. 
public	TokenNamepublic	
void	TokenNamevoid	
lethal	TokenNameIdentifier	 lethal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
isDisabled	TokenNameIdentifier	 is Disabled
(	TokenNameLPAREN	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
LETHAL_INT	TokenNameIdentifier	 LETHAL  INT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
LETHAL	TokenNameIdentifier	 LETHAL
.	TokenNameDOT	
isGreaterOrEqual	TokenNameIdentifier	 is Greater Or Equal
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getEffectiveLevel	TokenNameIdentifier	 get Effective Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
LETHAL	TokenNameIdentifier	 LETHAL
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** We introduce a new printing method in order to support {@link XLevel#LETHAL}. */	TokenNameCOMMENT_JAVADOC	 We introduce a new printing method in order to support {@link XLevel#LETHAL}. 
public	TokenNamepublic	
void	TokenNamevoid	
lethal	TokenNameIdentifier	 lethal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
isDisabled	TokenNameIdentifier	 is Disabled
(	TokenNameLPAREN	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
LETHAL_INT	TokenNameIdentifier	 LETHAL  INT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
LETHAL	TokenNameIdentifier	 LETHAL
.	TokenNameDOT	
isGreaterOrEqual	TokenNameIdentifier	 is Greater Or Equal
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getEffectiveLevel	TokenNameIdentifier	 get Effective Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
LETHAL	TokenNameIdentifier	 LETHAL
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
Logger	TokenNameIdentifier	 Logger
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
Logger	TokenNameIdentifier	 Logger
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XLogger	TokenNameIdentifier	 X Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSuffix	TokenNameIdentifier	 get Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSuffix	TokenNameIdentifier	 set Suffix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** We introduce a new printing method that takes the TRACE level. */	TokenNameCOMMENT_JAVADOC	 We introduce a new printing method that takes the TRACE level. 
public	TokenNamepublic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
isDisabled	TokenNameIdentifier	 is Disabled
(	TokenNameLPAREN	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
TRACE_INT	TokenNameIdentifier	 TRACE  INT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
.	TokenNameDOT	
isGreaterOrEqual	TokenNameIdentifier	 is Greater Or Equal
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getEffectiveLevel	TokenNameIdentifier	 get Effective Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** We introduce a new printing method that takes the TRACE level. */	TokenNameCOMMENT_JAVADOC	 We introduce a new printing method that takes the TRACE level. 
public	TokenNamepublic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
isDisabled	TokenNameIdentifier	 is Disabled
(	TokenNameLPAREN	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
TRACE_INT	TokenNameIdentifier	 TRACE  INT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
.	TokenNameDOT	
isGreaterOrEqual	TokenNameIdentifier	 is Greater Or Equal
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getEffectiveLevel	TokenNameIdentifier	 get Effective Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Any sub-class of Logger must also have its own implementation of 	TokenNameCOMMENT_LINE	Any sub-class of Logger must also have its own implementation of 
// CategoryFactory. 	TokenNameCOMMENT_LINE	CategoryFactory. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
XFactory	TokenNameIdentifier	 X Factory
implements	TokenNameimplements	
LoggerFactory	TokenNameIdentifier	 Logger Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
XFactory	TokenNameIdentifier	 X Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Logger	TokenNameIdentifier	 Logger
makeNewLoggerInstance	TokenNameIdentifier	 make New Logger Instance
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XLogger	TokenNameIdentifier	 X Logger
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
