package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
building	TokenNameIdentifier	 building
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
Profile	TokenNameIdentifier	 Profile
;	TokenNameSEMICOLON	
/** * Collects the output of the model builder. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Collects the output of the model builder. * @author Benjamin Bentmann 
class	TokenNameclass	
DefaultModelBuildingResult	TokenNameIdentifier	 Default Model Building Result
implements	TokenNameimplements	
ModelBuildingResult	TokenNameIdentifier	 Model Building Result
{	TokenNameLBRACE	
private	TokenNameprivate	
Model	TokenNameIdentifier	 Model
effectiveModel	TokenNameIdentifier	 effective Model
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
modelIds	TokenNameIdentifier	 model Ids
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Model	TokenNameIdentifier	 Model
>	TokenNameGREATER	
rawModels	TokenNameIdentifier	 raw Models
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>>	TokenNameRIGHT_SHIFT	
activePomProfiles	TokenNameIdentifier	 active Pom Profiles
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
activeExternalProfiles	TokenNameIdentifier	 active External Profiles
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ModelProblem	TokenNameIdentifier	 Model Problem
>	TokenNameGREATER	
problems	TokenNameIdentifier	 problems
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DefaultModelBuildingResult	TokenNameIdentifier	 Default Model Building Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modelIds	TokenNameIdentifier	 model Ids
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rawModels	TokenNameIdentifier	 raw Models
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Model	TokenNameIdentifier	 Model
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
activePomProfiles	TokenNameIdentifier	 active Pom Profiles
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
activeExternalProfiles	TokenNameIdentifier	 active External Profiles
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
problems	TokenNameIdentifier	 problems
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ModelProblem	TokenNameIdentifier	 Model Problem
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Model	TokenNameIdentifier	 Model
getEffectiveModel	TokenNameIdentifier	 get Effective Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
effectiveModel	TokenNameIdentifier	 effective Model
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultModelBuildingResult	TokenNameIdentifier	 Default Model Building Result
setEffectiveModel	TokenNameIdentifier	 set Effective Model
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
effectiveModel	TokenNameIdentifier	 effective Model
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getModelIds	TokenNameIdentifier	 get Model Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
modelIds	TokenNameIdentifier	 model Ids
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultModelBuildingResult	TokenNameIdentifier	 Default Model Building Result
addModelId	TokenNameIdentifier	 add Model Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
modelId	TokenNameIdentifier	 model Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
modelId	TokenNameIdentifier	 model Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"no model identifier specified"	TokenNameStringLiteral	no model identifier specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
modelIds	TokenNameIdentifier	 model Ids
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
modelId	TokenNameIdentifier	 model Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Model	TokenNameIdentifier	 Model
getRawModel	TokenNameIdentifier	 get Raw Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rawModels	TokenNameIdentifier	 raw Models
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
modelIds	TokenNameIdentifier	 model Ids
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Model	TokenNameIdentifier	 Model
getRawModel	TokenNameIdentifier	 get Raw Model
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
modelId	TokenNameIdentifier	 model Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rawModels	TokenNameIdentifier	 raw Models
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
modelId	TokenNameIdentifier	 model Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultModelBuildingResult	TokenNameIdentifier	 Default Model Building Result
setRawModel	TokenNameIdentifier	 set Raw Model
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
modelId	TokenNameIdentifier	 model Id
,	TokenNameCOMMA	
Model	TokenNameIdentifier	 Model
rawModel	TokenNameIdentifier	 raw Model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
modelId	TokenNameIdentifier	 model Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"no model identifier specified"	TokenNameStringLiteral	no model identifier specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rawModels	TokenNameIdentifier	 raw Models
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
modelId	TokenNameIdentifier	 model Id
,	TokenNameCOMMA	
rawModel	TokenNameIdentifier	 raw Model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
getActivePomProfiles	TokenNameIdentifier	 get Active Pom Profiles
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
modelId	TokenNameIdentifier	 model Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
activePomProfiles	TokenNameIdentifier	 active Pom Profiles
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
modelId	TokenNameIdentifier	 model Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultModelBuildingResult	TokenNameIdentifier	 Default Model Building Result
setActivePomProfiles	TokenNameIdentifier	 set Active Pom Profiles
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
modelId	TokenNameIdentifier	 model Id
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
activeProfiles	TokenNameIdentifier	 active Profiles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
modelId	TokenNameIdentifier	 model Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"no model identifier specified"	TokenNameStringLiteral	no model identifier specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
activeProfiles	TokenNameIdentifier	 active Profiles
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
activePomProfiles	TokenNameIdentifier	 active Pom Profiles
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
modelId	TokenNameIdentifier	 model Id
,	TokenNameCOMMA	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
(	TokenNameLPAREN	
activeProfiles	TokenNameIdentifier	 active Profiles
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
activePomProfiles	TokenNameIdentifier	 active Pom Profiles
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
modelId	TokenNameIdentifier	 model Id
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
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
getActiveExternalProfiles	TokenNameIdentifier	 get Active External Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
activeExternalProfiles	TokenNameIdentifier	 active External Profiles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultModelBuildingResult	TokenNameIdentifier	 Default Model Building Result
setActiveExternalProfiles	TokenNameIdentifier	 set Active External Profiles
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
activeProfiles	TokenNameIdentifier	 active Profiles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
activeProfiles	TokenNameIdentifier	 active Profiles
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
activeExternalProfiles	TokenNameIdentifier	 active External Profiles
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
(	TokenNameLPAREN	
activeProfiles	TokenNameIdentifier	 active Profiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
activeExternalProfiles	TokenNameIdentifier	 active External Profiles
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
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
ModelProblem	TokenNameIdentifier	 Model Problem
>	TokenNameGREATER	
getProblems	TokenNameIdentifier	 get Problems
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
problems	TokenNameIdentifier	 problems
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultModelBuildingResult	TokenNameIdentifier	 Default Model Building Result
setProblems	TokenNameIdentifier	 set Problems
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ModelProblem	TokenNameIdentifier	 Model Problem
>	TokenNameGREATER	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
problems	TokenNameIdentifier	 problems
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ModelProblem	TokenNameIdentifier	 Model Problem
>	TokenNameGREATER	
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
