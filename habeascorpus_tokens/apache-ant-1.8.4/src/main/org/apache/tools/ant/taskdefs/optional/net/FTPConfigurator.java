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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
net	TokenNameIdentifier	 net
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
ftp	TokenNameIdentifier	 ftp
.	TokenNameDOT	
FTPClient	TokenNameIdentifier	 FTP Client
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
ftp	TokenNameIdentifier	 ftp
.	TokenNameDOT	
FTPClientConfig	TokenNameIdentifier	 FTP Client Config
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
BuildException	TokenNameIdentifier	 Build Exception
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
/** * The sole purpose of this class is (note that it is package-private * is to serve as a separate, static compilation unit for importing * FTPClientConfig, to enable users who wish to use the FTP task * without using its new features to avoid the need to * upgrade to jakarta-commons-net 1.4.0, where FTPClientConfig was * introduced. */	TokenNameCOMMENT_JAVADOC	 The sole purpose of this class is (note that it is package-private is to serve as a separate, static compilation unit for importing FTPClientConfig, to enable users who wish to use the FTP task without using its new features to avoid the need to upgrade to jakarta-commons-net 1.4.0, where FTPClientConfig was introduced. 
// CheckStyle:HideUtilityClassConstructorCheck OFF (bc) 	TokenNameCOMMENT_LINE	CheckStyle:HideUtilityClassConstructorCheck OFF (bc) 
class	TokenNameclass	
FTPConfigurator	TokenNameIdentifier	 FTP Configurator
{	TokenNameLBRACE	
/** * configures the supplied FTPClient with the various * attributes set in the supplied FTP task. * @param client the FTPClient to be configured * @param task the FTP task whose attributes are used to * configure the client * @return the client as configured. */	TokenNameCOMMENT_JAVADOC	 configures the supplied FTPClient with the various attributes set in the supplied FTP task. @param client the FTPClient to be configured @param task the FTP task whose attributes are used to configure the client @return the client as configured. 
static	TokenNamestatic	
FTPClient	TokenNameIdentifier	 FTP Client
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
FTPClient	TokenNameIdentifier	 FTP Client
client	TokenNameIdentifier	 client
,	TokenNameCOMMA	
FTPTaskConfig	TokenNameIdentifier	 FTP Task Config
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"custom configuration"	TokenNameStringLiteral	custom configuration
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FTPClientConfig	TokenNameIdentifier	 FTP Client Config
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
systemTypeKey	TokenNameIdentifier	 system Type Key
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getSystemTypeKey	TokenNameIdentifier	 get System Type Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
systemTypeKey	TokenNameIdentifier	 system Type Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
systemTypeKey	TokenNameIdentifier	 system Type Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
new	TokenNamenew	
FTPClientConfig	TokenNameIdentifier	 FTP Client Config
(	TokenNameLPAREN	
systemTypeKey	TokenNameIdentifier	 system Type Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"custom config: system key = "	TokenNameStringLiteral	custom config: system key = 
+	TokenNamePLUS	
systemTypeKey	TokenNameIdentifier	 system Type Key
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
new	TokenNamenew	
FTPClientConfig	TokenNameIdentifier	 FTP Client Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"custom config: system key = default (UNIX)"	TokenNameStringLiteral	custom config: system key = default (UNIX)
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
defaultDateFormatConfig	TokenNameIdentifier	 default Date Format Config
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getDefaultDateFormatConfig	TokenNameIdentifier	 get Default Date Format Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
defaultDateFormatConfig	TokenNameIdentifier	 default Date Format Config
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
setDefaultDateFormatStr	TokenNameIdentifier	 set Default Date Format Str
(	TokenNameLPAREN	
defaultDateFormatConfig	TokenNameIdentifier	 default Date Format Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"custom config: default date format = "	TokenNameStringLiteral	custom config: default date format = 
+	TokenNamePLUS	
defaultDateFormatConfig	TokenNameIdentifier	 default Date Format Config
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
recentDateFormatConfig	TokenNameIdentifier	 recent Date Format Config
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getRecentDateFormatConfig	TokenNameIdentifier	 get Recent Date Format Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
recentDateFormatConfig	TokenNameIdentifier	 recent Date Format Config
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
setRecentDateFormatStr	TokenNameIdentifier	 set Recent Date Format Str
(	TokenNameLPAREN	
recentDateFormatConfig	TokenNameIdentifier	 recent Date Format Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"custom config: recent date format = "	TokenNameStringLiteral	custom config: recent date format = 
+	TokenNamePLUS	
recentDateFormatConfig	TokenNameIdentifier	 recent Date Format Config
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
serverLanguageCodeConfig	TokenNameIdentifier	 server Language Code Config
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getServerLanguageCodeConfig	TokenNameIdentifier	 get Server Language Code Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
serverLanguageCodeConfig	TokenNameIdentifier	 server Language Code Config
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
serverLanguageCodeConfig	TokenNameIdentifier	 server Language Code Config
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
FTPClientConfig	TokenNameIdentifier	 FTP Client Config
.	TokenNameDOT	
getSupportedLanguageCodes	TokenNameIdentifier	 get Supported Language Codes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
serverLanguageCodeConfig	TokenNameIdentifier	 server Language Code Config
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"unsupported language code"	TokenNameStringLiteral	unsupported language code
+	TokenNamePLUS	
serverLanguageCodeConfig	TokenNameIdentifier	 server Language Code Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
setServerLanguageCode	TokenNameIdentifier	 set Server Language Code
(	TokenNameLPAREN	
serverLanguageCodeConfig	TokenNameIdentifier	 server Language Code Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"custom config: server language code = "	TokenNameStringLiteral	custom config: server language code = 
+	TokenNamePLUS	
serverLanguageCodeConfig	TokenNameIdentifier	 server Language Code Config
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
serverTimeZoneConfig	TokenNameIdentifier	 server Time Zone Config
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getServerTimeZoneConfig	TokenNameIdentifier	 get Server Time Zone Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
serverTimeZoneConfig	TokenNameIdentifier	 server Time Zone Config
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
setServerTimeZoneId	TokenNameIdentifier	 set Server Time Zone Id
(	TokenNameLPAREN	
serverTimeZoneConfig	TokenNameIdentifier	 server Time Zone Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"custom config: server time zone ID = "	TokenNameStringLiteral	custom config: server time zone ID = 
+	TokenNamePLUS	
serverTimeZoneConfig	TokenNameIdentifier	 server Time Zone Config
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
shortMonthNamesConfig	TokenNameIdentifier	 short Month Names Config
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
getShortMonthNamesConfig	TokenNameIdentifier	 get Short Month Names Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shortMonthNamesConfig	TokenNameIdentifier	 short Month Names Config
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
setShortMonthNames	TokenNameIdentifier	 set Short Month Names
(	TokenNameLPAREN	
shortMonthNamesConfig	TokenNameIdentifier	 short Month Names Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"custom config: short month names = "	TokenNameStringLiteral	custom config: short month names = 
+	TokenNamePLUS	
shortMonthNamesConfig	TokenNameIdentifier	 short Month Names Config
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
client	TokenNameIdentifier	 client
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
