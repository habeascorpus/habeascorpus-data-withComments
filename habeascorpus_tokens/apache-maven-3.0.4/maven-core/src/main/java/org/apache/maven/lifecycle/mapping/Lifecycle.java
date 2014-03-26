package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
mapping	TokenNameIdentifier	 mapping
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
/** * Class Lifecycle. */	TokenNameCOMMENT_JAVADOC	 Class Lifecycle. 
public	TokenNamepublic	
class	TokenNameclass	
Lifecycle	TokenNameIdentifier	 Lifecycle
{	TokenNameLBRACE	
/** * Field id */	TokenNameCOMMENT_JAVADOC	 Field id 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
/** * Field phases */	TokenNameCOMMENT_JAVADOC	 Field phases 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
phases	TokenNameIdentifier	 phases
;	TokenNameSEMICOLON	
/* * NOTE: This exists merely for backward-compat with legacy-style lifecycle definitions and allows configuration * injection to work instead of failing. */	TokenNameCOMMENT_BLOCK	 NOTE: This exists merely for backward-compat with legacy-style lifecycle definitions and allows configuration injection to work instead of failing. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unused"	TokenNameStringLiteral	unused
)	TokenNameRPAREN	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
optionalMojos	TokenNameIdentifier	 optional Mojos
;	TokenNameSEMICOLON	
/** * Method getId */	TokenNameCOMMENT_JAVADOC	 Method getId 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Method getPhases */	TokenNameCOMMENT_JAVADOC	 Method getPhases 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getPhases	TokenNameIdentifier	 get Phases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
phases	TokenNameIdentifier	 phases
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Method setId * * @param id */	TokenNameCOMMENT_JAVADOC	 Method setId * @param id 
public	TokenNamepublic	
void	TokenNamevoid	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Method setPhases * * @param phases */	TokenNameCOMMENT_JAVADOC	 Method setPhases * @param phases 
public	TokenNamepublic	
void	TokenNamevoid	
setPhases	TokenNameIdentifier	 set Phases
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
phases	TokenNameIdentifier	 phases
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
phases	TokenNameIdentifier	 phases
=	TokenNameEQUAL	
phases	TokenNameIdentifier	 phases
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-- void setPhases(java.util.List) 	TokenNameCOMMENT_LINE	-- void setPhases(java.util.List) 
}	TokenNameRBRACE	
