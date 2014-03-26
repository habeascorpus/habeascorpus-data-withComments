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
/** * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 @author Benjamin Bentmann 
class	TokenNameclass	
DefaultClassRealmRequest	TokenNameIdentifier	 Default Class Realm Request
implements	TokenNameimplements	
ClassRealmRequest	TokenNameIdentifier	 Class Realm Request
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
RealmType	TokenNameIdentifier	 Realm Type
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ClassLoader	TokenNameIdentifier	 Class Loader
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
parentImports	TokenNameIdentifier	 parent Imports
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
>	TokenNameGREATER	
foreignImports	TokenNameIdentifier	 foreign Imports
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ClassRealmConstituent	TokenNameIdentifier	 Class Realm Constituent
>	TokenNameGREATER	
constituents	TokenNameIdentifier	 constituents
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DefaultClassRealmRequest	TokenNameIdentifier	 Default Class Realm Request
(	TokenNameLPAREN	
RealmType	TokenNameIdentifier	 Realm Type
type	TokenNameIdentifier	 type
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
ClassRealmConstituent	TokenNameIdentifier	 Class Realm Constituent
>	TokenNameGREATER	
constituents	TokenNameIdentifier	 constituents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parentImports	TokenNameIdentifier	 parent Imports
=	TokenNameEQUAL	
parentImports	TokenNameIdentifier	 parent Imports
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
foreignImports	TokenNameIdentifier	 foreign Imports
=	TokenNameEQUAL	
foreignImports	TokenNameIdentifier	 foreign Imports
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
constituents	TokenNameIdentifier	 constituents
=	TokenNameEQUAL	
constituents	TokenNameIdentifier	 constituents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RealmType	TokenNameIdentifier	 Realm Type
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ClassLoader	TokenNameIdentifier	 Class Loader
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getImports	TokenNameIdentifier	 get Imports
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getParentImports	TokenNameIdentifier	 get Parent Imports
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getParentImports	TokenNameIdentifier	 get Parent Imports
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parentImports	TokenNameIdentifier	 parent Imports
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
>	TokenNameGREATER	
getForeignImports	TokenNameIdentifier	 get Foreign Imports
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
foreignImports	TokenNameIdentifier	 foreign Imports
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ClassRealmConstituent	TokenNameIdentifier	 Class Realm Constituent
>	TokenNameGREATER	
getConstituents	TokenNameIdentifier	 get Constituents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
constituents	TokenNameIdentifier	 constituents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
