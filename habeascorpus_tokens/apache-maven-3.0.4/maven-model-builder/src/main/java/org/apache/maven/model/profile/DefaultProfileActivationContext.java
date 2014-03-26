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
Collections	TokenNameIdentifier	 Collections
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
/** * Describes the environmental context used to determine the activation status of profiles. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Describes the environmental context used to determine the activation status of profiles. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
DefaultProfileActivationContext	TokenNameIdentifier	 Default Profile Activation Context
implements	TokenNameimplements	
ProfileActivationContext	TokenNameIdentifier	 Profile Activation Context
{	TokenNameLBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
systemProperties	TokenNameIdentifier	 system Properties
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
userProperties	TokenNameIdentifier	 user Properties
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
projectDirectory	TokenNameIdentifier	 project Directory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getActiveProfileIds	TokenNameIdentifier	 get Active Profile Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the identifiers of those profiles that should be activated by explicit demand. * * @param activeProfileIds The identifiers of those profiles to activate, may be {@code null}. * @return This context, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the identifiers of those profiles that should be activated by explicit demand. * @param activeProfileIds The identifiers of those profiles to activate, may be {@code null}. @return This context, never {@code null}. 
public	TokenNamepublic	
DefaultProfileActivationContext	TokenNameIdentifier	 Default Profile Activation Context
setActiveProfileIds	TokenNameIdentifier	 set Active Profile Ids
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableList	TokenNameIdentifier	 unmodifiable List
(	TokenNameLPAREN	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
activeProfileIds	TokenNameIdentifier	 active Profile Ids
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getInactiveProfileIds	TokenNameIdentifier	 get Inactive Profile Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the identifiers of those profiles that should be deactivated by explicit demand. * * @param inactiveProfileIds The identifiers of those profiles to deactivate, may be {@code null}. * @return This context, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the identifiers of those profiles that should be deactivated by explicit demand. * @param inactiveProfileIds The identifiers of those profiles to deactivate, may be {@code null}. @return This context, never {@code null}. 
public	TokenNamepublic	
DefaultProfileActivationContext	TokenNameIdentifier	 Default Profile Activation Context
setInactiveProfileIds	TokenNameIdentifier	 set Inactive Profile Ids
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableList	TokenNameIdentifier	 unmodifiable List
(	TokenNameLPAREN	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
inactiveProfileIds	TokenNameIdentifier	 inactive Profile Ids
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getSystemProperties	TokenNameIdentifier	 get System Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
systemProperties	TokenNameIdentifier	 system Properties
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the system properties to use for interpolation and profile activation. The system properties are collected * from the runtime environment like {@link System#getProperties()} and environment variables. * * @param systemProperties The system properties, may be {@code null}. * @return This context, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the system properties to use for interpolation and profile activation. The system properties are collected from the runtime environment like {@link System#getProperties()} and environment variables. * @param systemProperties The system properties, may be {@code null}. @return This context, never {@code null}. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
DefaultProfileActivationContext	TokenNameIdentifier	 Default Profile Activation Context
setSystemProperties	TokenNameIdentifier	 set System Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
systemProperties	TokenNameIdentifier	 system Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
systemProperties	TokenNameIdentifier	 system Properties
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
systemProperties	TokenNameIdentifier	 system Properties
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableMap	TokenNameIdentifier	 unmodifiable Map
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
)	TokenNameRPAREN	
systemProperties	TokenNameIdentifier	 system Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
systemProperties	TokenNameIdentifier	 system Properties
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the system properties to use for interpolation and profile activation. The system properties are collected * from the runtime environment like {@link System#getProperties()} and environment variables. * * @param systemProperties The system properties, may be {@code null}. * @return This context, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the system properties to use for interpolation and profile activation. The system properties are collected from the runtime environment like {@link System#getProperties()} and environment variables. * @param systemProperties The system properties, may be {@code null}. @return This context, never {@code null}. 
public	TokenNamepublic	
DefaultProfileActivationContext	TokenNameIdentifier	 Default Profile Activation Context
setSystemProperties	TokenNameIdentifier	 set System Properties
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
systemProperties	TokenNameIdentifier	 system Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
systemProperties	TokenNameIdentifier	 system Properties
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
systemProperties	TokenNameIdentifier	 system Properties
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableMap	TokenNameIdentifier	 unmodifiable Map
(	TokenNameLPAREN	
systemProperties	TokenNameIdentifier	 system Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
systemProperties	TokenNameIdentifier	 system Properties
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getUserProperties	TokenNameIdentifier	 get User Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userProperties	TokenNameIdentifier	 user Properties
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the user properties to use for interpolation and profile activation. The user properties have been * configured directly by the user on his discretion, e.g. via the {@code -Dkey=value} parameter on the command * line. * * @param userProperties The user properties, may be {@code null}. * @return This context, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the user properties to use for interpolation and profile activation. The user properties have been configured directly by the user on his discretion, e.g. via the {@code -Dkey=value} parameter on the command line. * @param userProperties The user properties, may be {@code null}. @return This context, never {@code null}. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
DefaultProfileActivationContext	TokenNameIdentifier	 Default Profile Activation Context
setUserProperties	TokenNameIdentifier	 set User Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
userProperties	TokenNameIdentifier	 user Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
userProperties	TokenNameIdentifier	 user Properties
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userProperties	TokenNameIdentifier	 user Properties
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableMap	TokenNameIdentifier	 unmodifiable Map
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
)	TokenNameRPAREN	
userProperties	TokenNameIdentifier	 user Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userProperties	TokenNameIdentifier	 user Properties
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the user properties to use for interpolation and profile activation. The user properties have been * configured directly by the user on his discretion, e.g. via the {@code -Dkey=value} parameter on the command * line. * * @param userProperties The user properties, may be {@code null}. * @return This context, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the user properties to use for interpolation and profile activation. The user properties have been configured directly by the user on his discretion, e.g. via the {@code -Dkey=value} parameter on the command line. * @param userProperties The user properties, may be {@code null}. @return This context, never {@code null}. 
public	TokenNamepublic	
DefaultProfileActivationContext	TokenNameIdentifier	 Default Profile Activation Context
setUserProperties	TokenNameIdentifier	 set User Properties
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
userProperties	TokenNameIdentifier	 user Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
userProperties	TokenNameIdentifier	 user Properties
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userProperties	TokenNameIdentifier	 user Properties
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableMap	TokenNameIdentifier	 unmodifiable Map
(	TokenNameLPAREN	
userProperties	TokenNameIdentifier	 user Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userProperties	TokenNameIdentifier	 user Properties
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getProjectDirectory	TokenNameIdentifier	 get Project Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
projectDirectory	TokenNameIdentifier	 project Directory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the base directory of the current project. * * @param projectDirectory The base directory of the current project, may be {@code null} if profile activation * happens in the context of metadata retrieval rather than project building. * @return This context, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the base directory of the current project. * @param projectDirectory The base directory of the current project, may be {@code null} if profile activation happens in the context of metadata retrieval rather than project building. @return This context, never {@code null}. 
public	TokenNamepublic	
DefaultProfileActivationContext	TokenNameIdentifier	 Default Profile Activation Context
setProjectDirectory	TokenNameIdentifier	 set Project Directory
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
projectDirectory	TokenNameIdentifier	 project Directory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
projectDirectory	TokenNameIdentifier	 project Directory
=	TokenNameEQUAL	
projectDirectory	TokenNameIdentifier	 project Directory
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
