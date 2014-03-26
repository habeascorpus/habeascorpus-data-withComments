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
EnumSet	TokenNameIdentifier	 Enum Set
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
Set	TokenNameIdentifier	 Set
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
InputLocation	TokenNameIdentifier	 Input Location
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
building	TokenNameIdentifier	 building
.	TokenNameDOT	
ModelProblem	TokenNameIdentifier	 Model Problem
.	TokenNameDOT	
Severity	TokenNameIdentifier	 Severity
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ModelParseException	TokenNameIdentifier	 Model Parse Exception
;	TokenNameSEMICOLON	
/** * Collects problems that are encountered during model building. The primary purpose of this component is to account for * the fact that the problem reporter has/should not have information about the calling context and hence cannot provide * an expressive source hint for the model problem. Instead, the source hint is configured by the model builder before * it delegates to other components that potentially encounter problems. Then, the problem reporter can focus on * providing a simple error message, leaving the donkey work of creating a nice model problem to this component. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Collects problems that are encountered during model building. The primary purpose of this component is to account for the fact that the problem reporter has/should not have information about the calling context and hence cannot provide an expressive source hint for the model problem. Instead, the source hint is configured by the model builder before it delegates to other components that potentially encounter problems. Then, the problem reporter can focus on providing a simple error message, leaving the donkey work of creating a nice model problem to this component. * @author Benjamin Bentmann 
class	TokenNameclass	
DefaultModelProblemCollector	TokenNameIdentifier	 Default Model Problem Collector
implements	TokenNameimplements	
ModelProblemCollector	TokenNameIdentifier	 Model Problem Collector
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ModelBuildingResult	TokenNameIdentifier	 Model Building Result
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ModelProblem	TokenNameIdentifier	 Model Problem
>	TokenNameGREATER	
problems	TokenNameIdentifier	 problems
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Model	TokenNameIdentifier	 Model
sourceModel	TokenNameIdentifier	 source Model
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Model	TokenNameIdentifier	 Model
rootModel	TokenNameIdentifier	 root Model
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ModelProblem	TokenNameIdentifier	 Model Problem
.	TokenNameDOT	
Severity	TokenNameIdentifier	 Severity
>	TokenNameGREATER	
severities	TokenNameIdentifier	 severities
=	TokenNameEQUAL	
EnumSet	TokenNameIdentifier	 Enum Set
.	TokenNameDOT	
noneOf	TokenNameIdentifier	 none Of
(	TokenNameLPAREN	
ModelProblem	TokenNameIdentifier	 Model Problem
.	TokenNameDOT	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DefaultModelProblemCollector	TokenNameIdentifier	 Default Model Problem Collector
(	TokenNameLPAREN	
ModelBuildingResult	TokenNameIdentifier	 Model Building Result
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
problems	TokenNameIdentifier	 problems
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getProblems	TokenNameIdentifier	 get Problems
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ModelProblem	TokenNameIdentifier	 Model Problem
problem	TokenNameIdentifier	 problem
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
severities	TokenNameIdentifier	 severities
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
problem	TokenNameIdentifier	 problem
.	TokenNameDOT	
getSeverity	TokenNameIdentifier	 get Severity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasFatalErrors	TokenNameIdentifier	 has Fatal Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
severities	TokenNameIdentifier	 severities
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
ModelProblem	TokenNameIdentifier	 Model Problem
.	TokenNameDOT	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasErrors	TokenNameIdentifier	 has Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
severities	TokenNameIdentifier	 severities
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
ModelProblem	TokenNameIdentifier	 Model Problem
.	TokenNameDOT	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
||	TokenNameOR_OR	
severities	TokenNameIdentifier	 severities
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
ModelProblem	TokenNameIdentifier	 Model Problem
.	TokenNameDOT	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
)	TokenNameRPAREN	
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
void	TokenNamevoid	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sourceModel	TokenNameIdentifier	 source Model
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sourceModel	TokenNameIdentifier	 source Model
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rootModel	TokenNameIdentifier	 root Model
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rootModel	TokenNameIdentifier	 root Model
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
sourceModel	TokenNameIdentifier	 source Model
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
ModelProblemUtils	TokenNameIdentifier	 Model Problem Utils
.	TokenNameDOT	
toPath	TokenNameIdentifier	 to Path
(	TokenNameLPAREN	
sourceModel	TokenNameIdentifier	 source Model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getModelId	TokenNameIdentifier	 get Model Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ModelProblemUtils	TokenNameIdentifier	 Model Problem Utils
.	TokenNameDOT	
toId	TokenNameIdentifier	 to Id
(	TokenNameLPAREN	
sourceModel	TokenNameIdentifier	 source Model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRootModel	TokenNameIdentifier	 set Root Model
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
rootModel	TokenNameIdentifier	 root Model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rootModel	TokenNameIdentifier	 root Model
=	TokenNameEQUAL	
rootModel	TokenNameIdentifier	 root Model
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Model	TokenNameIdentifier	 Model
getRootModel	TokenNameIdentifier	 get Root Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rootModel	TokenNameIdentifier	 root Model
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRootModelId	TokenNameIdentifier	 get Root Model Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ModelProblemUtils	TokenNameIdentifier	 Model Problem Utils
.	TokenNameDOT	
toId	TokenNameIdentifier	 to Id
(	TokenNameLPAREN	
rootModel	TokenNameIdentifier	 root Model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ModelProblem	TokenNameIdentifier	 Model Problem
problem	TokenNameIdentifier	 problem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
problem	TokenNameIdentifier	 problem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
severities	TokenNameIdentifier	 severities
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
problem	TokenNameIdentifier	 problem
.	TokenNameDOT	
getSeverity	TokenNameIdentifier	 get Severity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ModelProblem	TokenNameIdentifier	 Model Problem
>	TokenNameGREATER	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ModelProblem	TokenNameIdentifier	 Model Problem
problem	TokenNameIdentifier	 problem
:	TokenNameCOLON	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
severities	TokenNameIdentifier	 severities
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
problem	TokenNameIdentifier	 problem
.	TokenNameDOT	
getSeverity	TokenNameIdentifier	 get Severity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Severity	TokenNameIdentifier	 Severity
severity	TokenNameIdentifier	 severity
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
InputLocation	TokenNameIdentifier	 Input Location
location	TokenNameIdentifier	 location
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
modelId	TokenNameIdentifier	 model Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modelId	TokenNameIdentifier	 model Id
=	TokenNameEQUAL	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getModelId	TokenNameIdentifier	 get Model Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
modelId	TokenNameIdentifier	 model Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modelId	TokenNameIdentifier	 model Id
=	TokenNameEQUAL	
getModelId	TokenNameIdentifier	 get Model Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
column	TokenNameIdentifier	 column
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
cause	TokenNameIdentifier	 cause
instanceof	TokenNameinstanceof	
ModelParseException	TokenNameIdentifier	 Model Parse Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ModelParseException	TokenNameIdentifier	 Model Parse Exception
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ModelParseException	TokenNameIdentifier	 Model Parse Exception
)	TokenNameRPAREN	
cause	TokenNameIdentifier	 cause
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ModelProblem	TokenNameIdentifier	 Model Problem
problem	TokenNameIdentifier	 problem
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultModelProblem	TokenNameIdentifier	 Default Model Problem
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
severity	TokenNameIdentifier	 severity
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
modelId	TokenNameIdentifier	 model Id
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
problem	TokenNameIdentifier	 problem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ModelBuildingException	TokenNameIdentifier	 Model Building Exception
newModelBuildingException	TokenNameIdentifier	 new Model Building Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ModelBuildingResult	TokenNameIdentifier	 Model Building Result
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getModelIds	TokenNameIdentifier	 get Model Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DefaultModelBuildingResult	TokenNameIdentifier	 Default Model Building Result
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultModelBuildingResult	TokenNameIdentifier	 Default Model Building Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
setEffectiveModel	TokenNameIdentifier	 set Effective Model
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getEffectiveModel	TokenNameIdentifier	 get Effective Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
setProblems	TokenNameIdentifier	 set Problems
(	TokenNameLPAREN	
getProblems	TokenNameIdentifier	 get Problems
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
setActiveExternalProfiles	TokenNameIdentifier	 set Active External Profiles
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getActiveExternalProfiles	TokenNameIdentifier	 get Active External Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
getRootModelId	TokenNameIdentifier	 get Root Model Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
addModelId	TokenNameIdentifier	 add Model Id
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
setRawModel	TokenNameIdentifier	 set Raw Model
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
getRootModel	TokenNameIdentifier	 get Root Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ModelBuildingException	TokenNameIdentifier	 Model Building Exception
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
