package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
profile	TokenNameIdentifier	 profile
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * Describes the environmental context used to determine the activation status of profiles. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Describes the environmental context used to determine the activation status of profiles. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ProfileActivationContext	TokenNameIdentifier	 Profile Activation Context
{	TokenNameLBRACE	
/** * Gets the identifiers of those profiles that should be activated by explicit demand. * * @return The identifiers of those profiles to activate, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the identifiers of those profiles that should be activated by explicit demand. * @return The identifiers of those profiles to activate, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getActiveProfileIds	TokenNameIdentifier	 get Active Profile Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the identifiers of those profiles that should be deactivated by explicit demand. * * @return The identifiers of those profiles to deactivate, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the identifiers of those profiles that should be deactivated by explicit demand. * @return The identifiers of those profiles to deactivate, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getInactiveProfileIds	TokenNameIdentifier	 get Inactive Profile Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the system properties to use for interpolation and profile activation. The system properties are collected * from the runtime environment like {@link System#getProperties()} and environment variables. * * @return The execution properties, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the system properties to use for interpolation and profile activation. The system properties are collected from the runtime environment like {@link System#getProperties()} and environment variables. * @return The execution properties, never {@code null}. 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getSystemProperties	TokenNameIdentifier	 get System Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the user properties to use for interpolation and profile activation. The user properties have been * configured directly by the user on his discretion, e.g. via the {@code -Dkey=value} parameter on the command * line. * * @return The user properties, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the user properties to use for interpolation and profile activation. The user properties have been configured directly by the user on his discretion, e.g. via the {@code -Dkey=value} parameter on the command line. * @return The user properties, never {@code null}. 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getUserProperties	TokenNameIdentifier	 get User Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the base directory of the current project (if any). * * @return The base directory of the current project or {@code null} if none. */	TokenNameCOMMENT_JAVADOC	 Gets the base directory of the current project (if any). * @return The base directory of the current project or {@code null} if none. 
File	TokenNameIdentifier	 File
getProjectDirectory	TokenNameIdentifier	 get Project Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
