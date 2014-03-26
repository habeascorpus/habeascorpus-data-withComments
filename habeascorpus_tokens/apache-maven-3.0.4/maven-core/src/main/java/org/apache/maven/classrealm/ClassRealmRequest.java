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
/** * Describes the requirements for a new class realm. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Describes the requirements for a new class realm. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ClassRealmRequest	TokenNameIdentifier	 Class Realm Request
{	TokenNameLBRACE	
/** * The type of a class realm. */	TokenNameCOMMENT_JAVADOC	 The type of a class realm. 
enum	TokenNameenum	
RealmType	TokenNameIdentifier	 Realm Type
{	TokenNameLBRACE	
/** * The class realm for the public API of the Maven core. */	TokenNameCOMMENT_JAVADOC	 The class realm for the public API of the Maven core. 
Core	TokenNameIdentifier	 Core
,	TokenNameCOMMA	
/** * A class realm for a project to aggregates its build extensions. */	TokenNameCOMMENT_JAVADOC	 A class realm for a project to aggregates its build extensions. 
Project	TokenNameIdentifier	 Project
,	TokenNameCOMMA	
/** * A class realm for a build extension. */	TokenNameCOMMENT_JAVADOC	 A class realm for a build extension. 
Extension	TokenNameIdentifier	 Extension
,	TokenNameCOMMA	
/** * A class realm for a plugin. */	TokenNameCOMMENT_JAVADOC	 A class realm for a plugin. 
Plugin	TokenNameIdentifier	 Plugin
,	TokenNameCOMMA	
}	TokenNameRBRACE	
/** * Gets the type of the class realm. * * @return The type of the class realm, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the type of the class realm. * @return The type of the class realm, never {@code null}. 
RealmType	TokenNameIdentifier	 Realm Type
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the parent class realm (if any). * * @return The parent class realm or {@code null} if using the default parent. */	TokenNameCOMMENT_JAVADOC	 Gets the parent class realm (if any). * @return The parent class realm or {@code null} if using the default parent. 
ClassLoader	TokenNameIdentifier	 Class Loader
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @deprecated Use {@link #getParentImports()} instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated Use {@link #getParentImports()} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getImports	TokenNameIdentifier	 get Imports
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the packages/types to import from the parent realm. * * @return The modifiable list of packages/types to import from the parent realm, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the packages/types to import from the parent realm. * @return The modifiable list of packages/types to import from the parent realm, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getParentImports	TokenNameIdentifier	 get Parent Imports
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the packages/types to import from foreign realms. * * @return The modifiable map of packages/types to import from foreign realms, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the packages/types to import from foreign realms. * @return The modifiable map of packages/types to import from foreign realms, never {@code null}. 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
>	TokenNameGREATER	
getForeignImports	TokenNameIdentifier	 get Foreign Imports
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the constituents for the class realm. * * @return The modifiable list of constituents for the class realm, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the constituents for the class realm. * @return The modifiable list of constituents for the class realm, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ClassRealmConstituent	TokenNameIdentifier	 Class Realm Constituent
>	TokenNameGREATER	
getConstituents	TokenNameIdentifier	 get Constituents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
