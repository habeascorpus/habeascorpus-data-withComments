package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
MavenExecutionRequest	TokenNameIdentifier	 Maven Execution Request
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
pull	TokenNameIdentifier	 pull
.	TokenNameDOT	
XmlPullParserException	TokenNameIdentifier	 Xml Pull Parser Exception
;	TokenNameSEMICOLON	
/** * @author jdcasey * @author Jason van Zyl */	TokenNameCOMMENT_JAVADOC	 @author jdcasey @author Jason van Zyl 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
interface	TokenNameinterface	
MavenSettingsBuilder	TokenNameIdentifier	 Maven Settings Builder
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ROLE	TokenNameIdentifier	 ROLE
=	TokenNameEQUAL	
MavenSettingsBuilder	TokenNameIdentifier	 Maven Settings Builder
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ALT_USER_SETTINGS_XML_LOCATION	TokenNameIdentifier	 ALT  USER  SETTINGS  XML  LOCATION
=	TokenNameEQUAL	
"org.apache.maven.user-settings"	TokenNameStringLiteral	org.apache.maven.user-settings
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ALT_GLOBAL_SETTINGS_XML_LOCATION	TokenNameIdentifier	 ALT  GLOBAL  SETTINGS  XML  LOCATION
=	TokenNameEQUAL	
"org.apache.maven.global-settings"	TokenNameStringLiteral	org.apache.maven.global-settings
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ALT_LOCAL_REPOSITORY_LOCATION	TokenNameIdentifier	 ALT  LOCAL  REPOSITORY  LOCATION
=	TokenNameEQUAL	
"maven.repo.local"	TokenNameStringLiteral	maven.repo.local
;	TokenNameSEMICOLON	
Settings	TokenNameIdentifier	 Settings
buildSettings	TokenNameIdentifier	 build Settings
(	TokenNameLPAREN	
MavenExecutionRequest	TokenNameIdentifier	 Maven Execution Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XmlPullParserException	TokenNameIdentifier	 Xml Pull Parser Exception
;	TokenNameSEMICOLON	
/** * @return a <code>Settings</code> object from the user settings file. * @throws IOException if any * @throws XmlPullParserException if any */	TokenNameCOMMENT_JAVADOC	 @return a <code>Settings</code> object from the user settings file. @throws IOException if any @throws XmlPullParserException if any 
Settings	TokenNameIdentifier	 Settings
buildSettings	TokenNameIdentifier	 build Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XmlPullParserException	TokenNameIdentifier	 Xml Pull Parser Exception
;	TokenNameSEMICOLON	
/** * @param useCachedSettings if true, doesn't reload the user settings * @return a <code>Settings</code> object from the user settings file. * @throws IOException if any * @throws XmlPullParserException if any */	TokenNameCOMMENT_JAVADOC	 @param useCachedSettings if true, doesn't reload the user settings @return a <code>Settings</code> object from the user settings file. @throws IOException if any @throws XmlPullParserException if any 
Settings	TokenNameIdentifier	 Settings
buildSettings	TokenNameIdentifier	 build Settings
(	TokenNameLPAREN	
boolean	TokenNameboolean	
useCachedSettings	TokenNameIdentifier	 use Cached Settings
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XmlPullParserException	TokenNameIdentifier	 Xml Pull Parser Exception
;	TokenNameSEMICOLON	
/** * @param userSettingsFile a given user settings file * @return a <code>Settings</code> object from the user settings file. * @throws IOException if any * @throws XmlPullParserException if any */	TokenNameCOMMENT_JAVADOC	 @param userSettingsFile a given user settings file @return a <code>Settings</code> object from the user settings file. @throws IOException if any @throws XmlPullParserException if any 
Settings	TokenNameIdentifier	 Settings
buildSettings	TokenNameIdentifier	 build Settings
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
userSettingsFile	TokenNameIdentifier	 user Settings File
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XmlPullParserException	TokenNameIdentifier	 Xml Pull Parser Exception
;	TokenNameSEMICOLON	
/** * @param userSettingsFile a given user settings file * @param useCachedSettings if true, doesn't reload the user settings * @return a <code>Settings</code> object from the user settings file. * @throws IOException if any * @throws XmlPullParserException if any */	TokenNameCOMMENT_JAVADOC	 @param userSettingsFile a given user settings file @param useCachedSettings if true, doesn't reload the user settings @return a <code>Settings</code> object from the user settings file. @throws IOException if any @throws XmlPullParserException if any 
Settings	TokenNameIdentifier	 Settings
buildSettings	TokenNameIdentifier	 build Settings
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
userSettingsFile	TokenNameIdentifier	 user Settings File
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useCachedSettings	TokenNameIdentifier	 use Cached Settings
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XmlPullParserException	TokenNameIdentifier	 Xml Pull Parser Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
