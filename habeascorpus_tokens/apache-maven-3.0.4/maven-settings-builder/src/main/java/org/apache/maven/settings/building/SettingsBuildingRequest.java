package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
building	TokenNameIdentifier	 building
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
/** * Collects settings that control the building of effective settings. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Collects settings that control the building of effective settings. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
SettingsBuildingRequest	TokenNameIdentifier	 Settings Building Request
{	TokenNameLBRACE	
/** * Gets the global settings file. * * @return The global settings file or {@code null} if none. */	TokenNameCOMMENT_JAVADOC	 Gets the global settings file. * @return The global settings file or {@code null} if none. 
File	TokenNameIdentifier	 File
getGlobalSettingsFile	TokenNameIdentifier	 get Global Settings File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the global settings file. A non-existent settings file is equivalent to empty settings. If both user * settings and global settings are given, the user settings take precedence. * * @param globalSettingsFile The global settings file, may be {@code null} to disable global settings. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the global settings file. A non-existent settings file is equivalent to empty settings. If both user settings and global settings are given, the user settings take precedence. * @param globalSettingsFile The global settings file, may be {@code null} to disable global settings. @return This request, never {@code null}. 
SettingsBuildingRequest	TokenNameIdentifier	 Settings Building Request
setGlobalSettingsFile	TokenNameIdentifier	 set Global Settings File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
globalSettingsFile	TokenNameIdentifier	 global Settings File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the global settings source. * * @return The global settings source or {@code null} if none. */	TokenNameCOMMENT_JAVADOC	 Gets the global settings source. * @return The global settings source or {@code null} if none. 
SettingsSource	TokenNameIdentifier	 Settings Source
getGlobalSettingsSource	TokenNameIdentifier	 get Global Settings Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the global settings source. If both user settings and a global settings are given, the user settings take * precedence. * * @param globalSettingsSource The global settings source, may be {@code null} to disable global settings. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the global settings source. If both user settings and a global settings are given, the user settings take precedence. * @param globalSettingsSource The global settings source, may be {@code null} to disable global settings. @return This request, never {@code null}. 
SettingsBuildingRequest	TokenNameIdentifier	 Settings Building Request
setGlobalSettingsSource	TokenNameIdentifier	 set Global Settings Source
(	TokenNameLPAREN	
SettingsSource	TokenNameIdentifier	 Settings Source
globalSettingsSource	TokenNameIdentifier	 global Settings Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the user settings file. * * @return The user settings file or {@code null} if none. */	TokenNameCOMMENT_JAVADOC	 Gets the user settings file. * @return The user settings file or {@code null} if none. 
File	TokenNameIdentifier	 File
getUserSettingsFile	TokenNameIdentifier	 get User Settings File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the user settings file. A non-existent settings file is equivalent to empty settings. If both a user * settings file and a global settings file are given, the user settings take precedence. * * @param userSettingsFile The user settings file, may be {@code null} to disable user settings. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the user settings file. A non-existent settings file is equivalent to empty settings. If both a user settings file and a global settings file are given, the user settings take precedence. * @param userSettingsFile The user settings file, may be {@code null} to disable user settings. @return This request, never {@code null}. 
SettingsBuildingRequest	TokenNameIdentifier	 Settings Building Request
setUserSettingsFile	TokenNameIdentifier	 set User Settings File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
userSettingsFile	TokenNameIdentifier	 user Settings File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the user settings source. * * @return The user settings source or {@code null} if none. */	TokenNameCOMMENT_JAVADOC	 Gets the user settings source. * @return The user settings source or {@code null} if none. 
SettingsSource	TokenNameIdentifier	 Settings Source
getUserSettingsSource	TokenNameIdentifier	 get User Settings Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the user settings source. If both user settings and a global settings are given, the user settings take * precedence. * * @param userSettingsSource The user settings source, may be {@code null} to disable user settings. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the user settings source. If both user settings and a global settings are given, the user settings take precedence. * @param userSettingsSource The user settings source, may be {@code null} to disable user settings. @return This request, never {@code null}. 
SettingsBuildingRequest	TokenNameIdentifier	 Settings Building Request
setUserSettingsSource	TokenNameIdentifier	 set User Settings Source
(	TokenNameLPAREN	
SettingsSource	TokenNameIdentifier	 Settings Source
userSettingsSource	TokenNameIdentifier	 user Settings Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the system properties to use for interpolation. The system properties are collected from the runtime * environment like {@link System#getProperties()} and environment variables. * * @return The system properties, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the system properties to use for interpolation. The system properties are collected from the runtime environment like {@link System#getProperties()} and environment variables. * @return The system properties, never {@code null}. 
Properties	TokenNameIdentifier	 Properties
getSystemProperties	TokenNameIdentifier	 get System Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the system properties to use for interpolation. The system properties are collected from the runtime * environment like {@link System#getProperties()} and environment variables. * * @param systemProperties The system properties, may be {@code null}. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the system properties to use for interpolation. The system properties are collected from the runtime environment like {@link System#getProperties()} and environment variables. * @param systemProperties The system properties, may be {@code null}. @return This request, never {@code null}. 
SettingsBuildingRequest	TokenNameIdentifier	 Settings Building Request
setSystemProperties	TokenNameIdentifier	 set System Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
systemProperties	TokenNameIdentifier	 system Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the user properties to use for interpolation. The user properties have been configured directly by the user * on his discretion, e.g. via the {@code -Dkey=value} parameter on the command line. * * @return The user properties, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the user properties to use for interpolation. The user properties have been configured directly by the user on his discretion, e.g. via the {@code -Dkey=value} parameter on the command line. * @return The user properties, never {@code null}. 
Properties	TokenNameIdentifier	 Properties
getUserProperties	TokenNameIdentifier	 get User Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the user properties to use for interpolation. The user properties have been configured directly by the user * on his discretion, e.g. via the {@code -Dkey=value} parameter on the command line. * * @param userProperties The user properties, may be {@code null}. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the user properties to use for interpolation. The user properties have been configured directly by the user on his discretion, e.g. via the {@code -Dkey=value} parameter on the command line. * @param userProperties The user properties, may be {@code null}. @return This request, never {@code null}. 
SettingsBuildingRequest	TokenNameIdentifier	 Settings Building Request
setUserProperties	TokenNameIdentifier	 set User Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
userProperties	TokenNameIdentifier	 user Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
