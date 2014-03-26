package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
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
public	TokenNamepublic	
Lifecycle	TokenNameIdentifier	 Lifecycle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Lifecycle	TokenNameIdentifier	 Lifecycle
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
phases	TokenNameIdentifier	 phases
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
defaultPhases	TokenNameIdentifier	 default Phases
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
phases	TokenNameIdentifier	 phases
=	TokenNameEQUAL	
phases	TokenNameIdentifier	 phases
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
defaultPhases	TokenNameIdentifier	 default Phases
=	TokenNameEQUAL	
defaultPhases	TokenNameIdentifier	 default Phases
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <lifecycle> 	TokenNameCOMMENT_LINE	<lifecycle> 
// <id>clean</id> 	TokenNameCOMMENT_LINE	<id>clean</id> 
// <phases> 	TokenNameCOMMENT_LINE	<phases> 
// <phase>pre-clean</phase> 	TokenNameCOMMENT_LINE	<phase>pre-clean</phase> 
// <phase>clean</phase> 	TokenNameCOMMENT_LINE	<phase>clean</phase> 
// <phase>post-clean</phase> 	TokenNameCOMMENT_LINE	<phase>post-clean</phase> 
// </phases> 	TokenNameCOMMENT_LINE	</phases> 
// <default-phases> 	TokenNameCOMMENT_LINE	<default-phases> 
// <clean>org.apache.maven.plugins:maven-clean-plugin:clean</clean> 	TokenNameCOMMENT_LINE	<clean>org.apache.maven.plugins:maven-clean-plugin:clean</clean> 
// </default-phases> 	TokenNameCOMMENT_LINE	</default-phases> 
// </lifecycle> 	TokenNameCOMMENT_LINE	</lifecycle> 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
phases	TokenNameIdentifier	 phases
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
defaultPhases	TokenNameIdentifier	 default Phases
;	TokenNameSEMICOLON	
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
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
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
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getDefaultPhases	TokenNameIdentifier	 get Default Phases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultPhases	TokenNameIdentifier	 default Phases
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
+	TokenNamePLUS	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
phases	TokenNameIdentifier	 phases
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
