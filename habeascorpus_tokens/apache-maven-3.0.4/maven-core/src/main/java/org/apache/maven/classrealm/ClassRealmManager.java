package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
classrealm	TokenNameIdentifier	 classrealm
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Model	TokenNameIdentifier	 Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Plugin	TokenNameIdentifier	 Plugin
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
classworlds	TokenNameIdentifier	 classworlds
.	TokenNameDOT	
realm	TokenNameIdentifier	 realm
.	TokenNameDOT	
ClassRealm	TokenNameIdentifier	 Class Realm
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
Artifact	TokenNameIdentifier	 Artifact
;	TokenNameSEMICOLON	
/** * Manages the class realms used by Maven. <strong>Warning:</strong> This is an internal utility interface that is only * public for technical reasons, it is not part of the public API. In particular, this interface can be changed or * deleted without prior notice. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Manages the class realms used by Maven. <strong>Warning:</strong> This is an internal utility interface that is only public for technical reasons, it is not part of the public API. In particular, this interface can be changed or deleted without prior notice. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ClassRealmManager	TokenNameIdentifier	 Class Realm Manager
{	TokenNameLBRACE	
/** * Gets the class realm hosting the Maven core. * * @return The class realm hosting the Maven core, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the class realm hosting the Maven core. * @return The class realm hosting the Maven core, never {@code null}. 
ClassRealm	TokenNameIdentifier	 Class Realm
getCoreRealm	TokenNameIdentifier	 get Core Realm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the class realm exposing the Maven API. This is basically a restricted view on the Maven core realm. * * @return The class realm exposing the Maven API, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the class realm exposing the Maven API. This is basically a restricted view on the Maven core realm. * @return The class realm exposing the Maven API, never {@code null}. 
ClassRealm	TokenNameIdentifier	 Class Realm
getMavenApiRealm	TokenNameIdentifier	 get Maven Api Realm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new class realm for the specified project and its build extensions. * * @param model The model of the project for which to create a realm, must not be {@code null}. * @param artifacts The artifacts to add to the class realm, may be {@code null}. Unresolved artifacts (i.e. with a * missing file) will automatically be excluded from the realm. * @return The new project realm, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new class realm for the specified project and its build extensions. * @param model The model of the project for which to create a realm, must not be {@code null}. @param artifacts The artifacts to add to the class realm, may be {@code null}. Unresolved artifacts (i.e. with a missing file) will automatically be excluded from the realm. @return The new project realm, never {@code null}. 
ClassRealm	TokenNameIdentifier	 Class Realm
createProjectRealm	TokenNameIdentifier	 create Project Realm
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new class realm for the specified build extension. * * @param plugin The extension plugin for which to create a realm, must not be {@code null}. * @param artifacts The artifacts to add to the class realm, may be {@code null}. Unresolved artifacts (i.e. with a * missing file) will automatically be excluded from the realm. * @return The new extension realm, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new class realm for the specified build extension. * @param plugin The extension plugin for which to create a realm, must not be {@code null}. @param artifacts The artifacts to add to the class realm, may be {@code null}. Unresolved artifacts (i.e. with a missing file) will automatically be excluded from the realm. @return The new extension realm, never {@code null}. 
ClassRealm	TokenNameIdentifier	 Class Realm
createExtensionRealm	TokenNameIdentifier	 create Extension Realm
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
extension	TokenNameIdentifier	 extension
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new class realm for the specified plugin. * * @param plugin The plugin for which to create a realm, must not be {@code null}. * @param parent The parent realm for the new realm, may be {@code null}. * @param parentImports The packages/types to import from the parent realm, may be {@code null}. * @param foreignImports The packages/types to import from foreign realms, may be {@code null}. * @param artifacts The artifacts to add to the class realm, may be {@code null}. Unresolved artifacts (i.e. with a * missing file) will automatically be excluded from the realm. * @return The new plugin realm, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new class realm for the specified plugin. * @param plugin The plugin for which to create a realm, must not be {@code null}. @param parent The parent realm for the new realm, may be {@code null}. @param parentImports The packages/types to import from the parent realm, may be {@code null}. @param foreignImports The packages/types to import from foreign realms, may be {@code null}. @param artifacts The artifacts to add to the class realm, may be {@code null}. Unresolved artifacts (i.e. with a missing file) will automatically be excluded from the realm. @return The new plugin realm, never {@code null}. 
ClassRealm	TokenNameIdentifier	 Class Realm
createPluginRealm	TokenNameIdentifier	 create Plugin Realm
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
parentImports	TokenNameIdentifier	 parent Imports
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
>	TokenNameGREATER	
foreignImports	TokenNameIdentifier	 foreign Imports
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
