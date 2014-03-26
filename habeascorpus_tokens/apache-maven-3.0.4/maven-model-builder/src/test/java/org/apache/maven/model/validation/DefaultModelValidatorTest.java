package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
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
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
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
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
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
xpp3	TokenNameIdentifier	 xpp3
.	TokenNameDOT	
MavenXpp3Reader	TokenNameIdentifier	 Maven Xpp3 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
;	TokenNameSEMICOLON	
/** * @author <a href="mailto:trygvis@inamo.no">Trygve Laugst&oslash;l</a> */	TokenNameCOMMENT_JAVADOC	 @author <a href="mailto:trygvis@inamo.no">Trygve Laugst&oslash;l</a> 
public	TokenNamepublic	
class	TokenNameclass	
DefaultModelValidatorTest	TokenNameIdentifier	 Default Model Validator Test
extends	TokenNameextends	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
ModelValidator	TokenNameIdentifier	 Model Validator
validator	TokenNameIdentifier	 validator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Model	TokenNameIdentifier	 Model
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pom	TokenNameIdentifier	 pom
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
"/poms/validation/"	TokenNameStringLiteral	/poms/validation/
+	TokenNamePLUS	
pom	TokenNameIdentifier	 pom
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"missing resource: "	TokenNameStringLiteral	missing resource: 
+	TokenNamePLUS	
resource	TokenNameIdentifier	 resource
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
MavenXpp3Reader	TokenNameIdentifier	 Maven Xpp3 Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pom	TokenNameIdentifier	 pom
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
validateEffective	TokenNameIdentifier	 validate Effective
(	TokenNameLPAREN	
pom	TokenNameIdentifier	 pom
,	TokenNameCOMMA	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
.	TokenNameDOT	
VALIDATION_LEVEL_STRICT	TokenNameIdentifier	 VALIDATION  LEVEL  STRICT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
validateRaw	TokenNameIdentifier	 validate Raw
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pom	TokenNameIdentifier	 pom
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
validateRaw	TokenNameIdentifier	 validate Raw
(	TokenNameLPAREN	
pom	TokenNameIdentifier	 pom
,	TokenNameCOMMA	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
.	TokenNameDOT	
VALIDATION_LEVEL_STRICT	TokenNameIdentifier	 VALIDATION  LEVEL  STRICT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
validateEffective	TokenNameIdentifier	 validate Effective
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pom	TokenNameIdentifier	 pom
,	TokenNameCOMMA	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
request	TokenNameIdentifier	 request
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValidationLevel	TokenNameIdentifier	 set Validation Level
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
problems	TokenNameIdentifier	 problems
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validator	TokenNameIdentifier	 validator
.	TokenNameDOT	
validateEffectiveModel	TokenNameIdentifier	 validate Effective Model
(	TokenNameLPAREN	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
pom	TokenNameIdentifier	 pom
)	TokenNameRPAREN	
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
problems	TokenNameIdentifier	 problems
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
validateRaw	TokenNameIdentifier	 validate Raw
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pom	TokenNameIdentifier	 pom
,	TokenNameCOMMA	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
request	TokenNameIdentifier	 request
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultModelBuildingRequest	TokenNameIdentifier	 Default Model Building Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValidationLevel	TokenNameIdentifier	 set Validation Level
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
problems	TokenNameIdentifier	 problems
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validator	TokenNameIdentifier	 validator
.	TokenNameDOT	
validateRawModel	TokenNameIdentifier	 validate Raw Model
(	TokenNameLPAREN	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
pom	TokenNameIdentifier	 pom
)	TokenNameRPAREN	
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
problems	TokenNameIdentifier	 problems
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
substring	TokenNameIdentifier	 substring
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
+	TokenNamePLUS	
substring	TokenNameIdentifier	 substring
+	TokenNamePLUS	
"" was not found in: "	TokenNameStringLiteral	" was not found in: 
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
substring	TokenNameIdentifier	 substring
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validator	TokenNameIdentifier	 validator
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ModelValidator	TokenNameIdentifier	 Model Validator
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
validator	TokenNameIdentifier	 validator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
int	TokenNameint	
fatals	TokenNameIdentifier	 fatals
,	TokenNameCOMMA	
int	TokenNameint	
errors	TokenNameIdentifier	 errors
,	TokenNameCOMMA	
int	TokenNameint	
warnings	TokenNameIdentifier	 warnings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFatals	TokenNameIdentifier	 get Fatals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fatals	TokenNameIdentifier	 fatals
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFatals	TokenNameIdentifier	 get Fatals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
errors	TokenNameIdentifier	 errors
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
warnings	TokenNameIdentifier	 warnings
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingModelVersion	TokenNameIdentifier	 test Missing Model Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"missing-modelVersion-pom.xml"	TokenNameStringLiteral	missing-modelVersion-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"'modelVersion' is missing."	TokenNameStringLiteral	'modelVersion' is missing.
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBadModelVersion	TokenNameIdentifier	 test Bad Model Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validateRaw	TokenNameIdentifier	 validate Raw
(	TokenNameLPAREN	
"bad-modelVersion.xml"	TokenNameStringLiteral	bad-modelVersion.xml
,	TokenNameCOMMA	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
.	TokenNameDOT	
VALIDATION_LEVEL_STRICT	TokenNameIdentifier	 VALIDATION  LEVEL  STRICT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"modelVersion"	TokenNameStringLiteral	modelVersion
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingArtifactId	TokenNameIdentifier	 test Missing Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"missing-artifactId-pom.xml"	TokenNameStringLiteral	missing-artifactId-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"'artifactId' is missing."	TokenNameStringLiteral	'artifactId' is missing.
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingGroupId	TokenNameIdentifier	 test Missing Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"missing-groupId-pom.xml"	TokenNameStringLiteral	missing-groupId-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"'groupId' is missing."	TokenNameStringLiteral	'groupId' is missing.
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInvalidIds	TokenNameIdentifier	 test Invalid Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"invalid-ids-pom.xml"	TokenNameStringLiteral	invalid-ids-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"'groupId' with value 'o/a/m' does not match a valid id pattern."	TokenNameStringLiteral	'groupId' with value 'o/a/m' does not match a valid id pattern.
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"'artifactId' with value 'm$-do$' does not match a valid id pattern."	TokenNameStringLiteral	'artifactId' with value 'm$-do$' does not match a valid id pattern.
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingType	TokenNameIdentifier	 test Missing Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"missing-type-pom.xml"	TokenNameStringLiteral	missing-type-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"'packaging' is missing."	TokenNameStringLiteral	'packaging' is missing.
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingVersion	TokenNameIdentifier	 test Missing Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"missing-version-pom.xml"	TokenNameStringLiteral	missing-version-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"'version' is missing."	TokenNameStringLiteral	'version' is missing.
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInvalidAggregatorPackaging	TokenNameIdentifier	 test Invalid Aggregator Packaging
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"invalid-aggregator-packaging-pom.xml"	TokenNameStringLiteral	invalid-aggregator-packaging-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Aggregator projects require 'pom' as packaging."	TokenNameStringLiteral	Aggregator projects require 'pom' as packaging.
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingDependencyArtifactId	TokenNameIdentifier	 test Missing Dependency Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"missing-dependency-artifactId-pom.xml"	TokenNameStringLiteral	missing-dependency-artifactId-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"'dependencies.dependency.artifactId' for groupId:null:jar is missing"	TokenNameStringLiteral	'dependencies.dependency.artifactId' for groupId:null:jar is missing
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingDependencyGroupId	TokenNameIdentifier	 test Missing Dependency Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"missing-dependency-groupId-pom.xml"	TokenNameStringLiteral	missing-dependency-groupId-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"'dependencies.dependency.groupId' for null:artifactId:jar is missing"	TokenNameStringLiteral	'dependencies.dependency.groupId' for null:artifactId:jar is missing
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingDependencyVersion	TokenNameIdentifier	 test Missing Dependency Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"missing-dependency-version-pom.xml"	TokenNameStringLiteral	missing-dependency-version-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"'dependencies.dependency.version' for groupId:artifactId:jar is missing"	TokenNameStringLiteral	'dependencies.dependency.version' for groupId:artifactId:jar is missing
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingDependencyManagementArtifactId	TokenNameIdentifier	 test Missing Dependency Management Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"missing-dependency-mgmt-artifactId-pom.xml"	TokenNameStringLiteral	missing-dependency-mgmt-artifactId-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"'dependencyManagement.dependencies.dependency.artifactId' for groupId:null:jar is missing"	TokenNameStringLiteral	'dependencyManagement.dependencies.dependency.artifactId' for groupId:null:jar is missing
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingDependencyManagementGroupId	TokenNameIdentifier	 test Missing Dependency Management Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"missing-dependency-mgmt-groupId-pom.xml"	TokenNameStringLiteral	missing-dependency-mgmt-groupId-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"'dependencyManagement.dependencies.dependency.groupId' for null:artifactId:jar is missing"	TokenNameStringLiteral	'dependencyManagement.dependencies.dependency.groupId' for null:artifactId:jar is missing
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingAll	TokenNameIdentifier	 test Missing All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"missing-1-pom.xml"	TokenNameStringLiteral	missing-1-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
messages	TokenNameIdentifier	 messages
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"'modelVersion' is missing."	TokenNameStringLiteral	'modelVersion' is missing.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"'groupId' is missing."	TokenNameStringLiteral	'groupId' is missing.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"'artifactId' is missing."	TokenNameStringLiteral	'artifactId' is missing.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"'version' is missing."	TokenNameStringLiteral	'version' is missing.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// type is inherited from the super pom 	TokenNameCOMMENT_LINE	type is inherited from the super pom 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingPluginArtifactId	TokenNameIdentifier	 test Missing Plugin Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"missing-plugin-artifactId-pom.xml"	TokenNameStringLiteral	missing-plugin-artifactId-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"'build.plugins.plugin.artifactId' is missing."	TokenNameStringLiteral	'build.plugins.plugin.artifactId' is missing.
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyPluginVersion	TokenNameIdentifier	 test Empty Plugin Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"empty-plugin-version.xml"	TokenNameStringLiteral	empty-plugin-version.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"'build.plugins.plugin.version' for org.apache.maven.plugins:maven-it-plugin"	TokenNameStringLiteral	'build.plugins.plugin.version' for org.apache.maven.plugins:maven-it-plugin
+	TokenNamePLUS	
" must be a valid version but is ''."	TokenNameStringLiteral	 must be a valid version but is ''.
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingRepositoryId	TokenNameIdentifier	 test Missing Repository Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validateRaw	TokenNameIdentifier	 validate Raw
(	TokenNameLPAREN	
"missing-repository-id-pom.xml"	TokenNameStringLiteral	missing-repository-id-pom.xml
,	TokenNameCOMMA	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
.	TokenNameDOT	
VALIDATION_LEVEL_STRICT	TokenNameIdentifier	 VALIDATION  LEVEL  STRICT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"'repositories.repository.id' is missing."	TokenNameStringLiteral	'repositories.repository.id' is missing.
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"'repositories.repository[null].url' is missing."	TokenNameStringLiteral	'repositories.repository[null].url' is missing.
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"'pluginRepositories.pluginRepository.id' is missing."	TokenNameStringLiteral	'pluginRepositories.pluginRepository.id' is missing.
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"'pluginRepositories.pluginRepository[null].url' is missing."	TokenNameStringLiteral	'pluginRepositories.pluginRepository[null].url' is missing.
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingResourceDirectory	TokenNameIdentifier	 test Missing Resource Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"missing-resource-directory-pom.xml"	TokenNameStringLiteral	missing-resource-directory-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"'build.resources.resource.directory' is missing."	TokenNameStringLiteral	'build.resources.resource.directory' is missing.
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"'build.testResources.testResource.directory' is missing."	TokenNameStringLiteral	'build.testResources.testResource.directory' is missing.
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBadPluginDependencyScope	TokenNameIdentifier	 test Bad Plugin Dependency Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"bad-plugin-dependency-scope.xml"	TokenNameStringLiteral	bad-plugin-dependency-scope.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"test:d"	TokenNameStringLiteral	test:d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"test:e"	TokenNameStringLiteral	test:e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"test:f"	TokenNameStringLiteral	test:f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBadDependencyScope	TokenNameIdentifier	 test Bad Dependency Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"bad-dependency-scope.xml"	TokenNameStringLiteral	bad-dependency-scope.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"test:f"	TokenNameStringLiteral	test:f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"test:g"	TokenNameStringLiteral	test:g
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBadDependencyVersion	TokenNameIdentifier	 test Bad Dependency Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"bad-dependency-version.xml"	TokenNameStringLiteral	bad-dependency-version.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'dependencies.dependency.version' for test:b:jar must be a valid version"	TokenNameStringLiteral	'dependencies.dependency.version' for test:b:jar must be a valid version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'dependencies.dependency.version' for test:c:jar must not contain any of these characters"	TokenNameStringLiteral	'dependencies.dependency.version' for test:c:jar must not contain any of these characters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDuplicateModule	TokenNameIdentifier	 test Duplicate Module
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"duplicate-module.xml"	TokenNameStringLiteral	duplicate-module.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"child"	TokenNameStringLiteral	child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDuplicateProfileId	TokenNameIdentifier	 test Duplicate Profile Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validateRaw	TokenNameIdentifier	 validate Raw
(	TokenNameLPAREN	
"duplicate-profile-id.xml"	TokenNameStringLiteral	duplicate-profile-id.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"non-unique-id"	TokenNameStringLiteral	non-unique-id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBadPluginVersion	TokenNameIdentifier	 test Bad Plugin Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"bad-plugin-version.xml"	TokenNameStringLiteral	bad-plugin-version.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'build.plugins.plugin.version' for test:mip must be a valid version"	TokenNameStringLiteral	'build.plugins.plugin.version' for test:mip must be a valid version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'build.plugins.plugin.version' for test:rmv must be a valid version"	TokenNameStringLiteral	'build.plugins.plugin.version' for test:rmv must be a valid version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'build.plugins.plugin.version' for test:lmv must be a valid version"	TokenNameStringLiteral	'build.plugins.plugin.version' for test:lmv must be a valid version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'build.plugins.plugin.version' for test:ifsc must not contain any of these characters"	TokenNameStringLiteral	'build.plugins.plugin.version' for test:ifsc must not contain any of these characters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDistributionManagementStatus	TokenNameIdentifier	 test Distribution Management Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"distribution-management-status.xml"	TokenNameStringLiteral	distribution-management-status.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"distributionManagement.status"	TokenNameStringLiteral	distributionManagement.status
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIncompleteParent	TokenNameIdentifier	 test Incomplete Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validateRaw	TokenNameIdentifier	 validate Raw
(	TokenNameLPAREN	
"incomplete-parent.xml"	TokenNameStringLiteral	incomplete-parent.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFatals	TokenNameIdentifier	 get Fatals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"parent.groupId"	TokenNameStringLiteral	parent.groupId
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFatals	TokenNameIdentifier	 get Fatals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"parent.artifactId"	TokenNameStringLiteral	parent.artifactId
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFatals	TokenNameIdentifier	 get Fatals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"parent.version"	TokenNameStringLiteral	parent.version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testHardCodedSystemPath	TokenNameIdentifier	 test Hard Coded System Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validateRaw	TokenNameIdentifier	 validate Raw
(	TokenNameLPAREN	
"hard-coded-system-path.xml"	TokenNameStringLiteral	hard-coded-system-path.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"test:a:jar"	TokenNameStringLiteral	test:a:jar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyModule	TokenNameIdentifier	 test Empty Module
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"empty-module.xml"	TokenNameStringLiteral	empty-module.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"'modules.module[0]' has been specified without a path"	TokenNameStringLiteral	'modules.module[0]' has been specified without a path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDuplicatePlugin	TokenNameIdentifier	 test Duplicate Plugin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validateRaw	TokenNameIdentifier	 validate Raw
(	TokenNameLPAREN	
"duplicate-plugin.xml"	TokenNameStringLiteral	duplicate-plugin.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"duplicate declaration of plugin test:duplicate"	TokenNameStringLiteral	duplicate declaration of plugin test:duplicate
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"duplicate declaration of plugin test:managed-duplicate"	TokenNameStringLiteral	duplicate declaration of plugin test:managed-duplicate
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"duplicate declaration of plugin profile:duplicate"	TokenNameStringLiteral	duplicate declaration of plugin profile:duplicate
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"duplicate declaration of plugin profile:managed-duplicate"	TokenNameStringLiteral	duplicate declaration of plugin profile:managed-duplicate
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDuplicatePluginExecution	TokenNameIdentifier	 test Duplicate Plugin Execution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validateRaw	TokenNameIdentifier	 validate Raw
(	TokenNameLPAREN	
"duplicate-plugin-execution.xml"	TokenNameStringLiteral	duplicate-plugin-execution.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"duplicate execution with id a"	TokenNameStringLiteral	duplicate execution with id a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"duplicate execution with id default"	TokenNameStringLiteral	duplicate execution with id default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"duplicate execution with id c"	TokenNameStringLiteral	duplicate execution with id c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"duplicate execution with id b"	TokenNameStringLiteral	duplicate execution with id b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReservedRepositoryId	TokenNameIdentifier	 test Reserved Repository Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"reserved-repository-id.xml"	TokenNameStringLiteral	reserved-repository-id.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'repositories.repository.id'"	TokenNameStringLiteral	'repositories.repository.id'
+	TokenNamePLUS	
" must not be 'local'"	TokenNameStringLiteral	 must not be 'local'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'pluginRepositories.pluginRepository.id' must not be 'local'"	TokenNameStringLiteral	'pluginRepositories.pluginRepository.id' must not be 'local'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'distributionManagement.repository.id' must not be 'local'"	TokenNameStringLiteral	'distributionManagement.repository.id' must not be 'local'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'distributionManagement.snapshotRepository.id' must not be 'local'"	TokenNameStringLiteral	'distributionManagement.snapshotRepository.id' must not be 'local'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingPluginDependencyGroupId	TokenNameIdentifier	 test Missing Plugin Dependency Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"missing-plugin-dependency-groupId.xml"	TokenNameStringLiteral	missing-plugin-dependency-groupId.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
":a:"	TokenNameStringLiteral	:a:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingPluginDependencyArtifactId	TokenNameIdentifier	 test Missing Plugin Dependency Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"missing-plugin-dependency-artifactId.xml"	TokenNameStringLiteral	missing-plugin-dependency-artifactId.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"test:"	TokenNameStringLiteral	test:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingPluginDependencyVersion	TokenNameIdentifier	 test Missing Plugin Dependency Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"missing-plugin-dependency-version.xml"	TokenNameStringLiteral	missing-plugin-dependency-version.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"test:a"	TokenNameStringLiteral	test:a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBadPluginDependencyVersion	TokenNameIdentifier	 test Bad Plugin Dependency Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"bad-plugin-dependency-version.xml"	TokenNameStringLiteral	bad-plugin-dependency-version.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"test:b"	TokenNameStringLiteral	test:b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBadVersion	TokenNameIdentifier	 test Bad Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"bad-version.xml"	TokenNameStringLiteral	bad-version.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'version' must not contain any of these characters"	TokenNameStringLiteral	'version' must not contain any of these characters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBadSnapshotVersion	TokenNameIdentifier	 test Bad Snapshot Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"bad-snapshot-version.xml"	TokenNameStringLiteral	bad-snapshot-version.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'version' uses an unsupported snapshot version format"	TokenNameStringLiteral	'version' uses an unsupported snapshot version format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBadRepositoryId	TokenNameIdentifier	 test Bad Repository Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"bad-repository-id.xml"	TokenNameStringLiteral	bad-repository-id.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'repositories.repository.id' must not contain any of these characters"	TokenNameStringLiteral	'repositories.repository.id' must not contain any of these characters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'pluginRepositories.pluginRepository.id' must not contain any of these characters"	TokenNameStringLiteral	'pluginRepositories.pluginRepository.id' must not contain any of these characters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'distributionManagement.repository.id' must not contain any of these characters"	TokenNameStringLiteral	'distributionManagement.repository.id' must not contain any of these characters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'distributionManagement.snapshotRepository.id' must not contain any of these characters"	TokenNameStringLiteral	'distributionManagement.snapshotRepository.id' must not contain any of these characters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBadDependencyExclusionId	TokenNameIdentifier	 test Bad Dependency Exclusion Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"bad-dependency-exclusion-id.xml"	TokenNameStringLiteral	bad-dependency-exclusion-id.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'dependencies.dependency.exclusions.exclusion.groupId' for gid:aid:jar"	TokenNameStringLiteral	'dependencies.dependency.exclusions.exclusion.groupId' for gid:aid:jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'dependencies.dependency.exclusions.exclusion.artifactId' for gid:aid:jar"	TokenNameStringLiteral	'dependencies.dependency.exclusions.exclusion.artifactId' for gid:aid:jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingDependencyExclusionId	TokenNameIdentifier	 test Missing Dependency Exclusion Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
"missing-dependency-exclusion-id.xml"	TokenNameStringLiteral	missing-dependency-exclusion-id.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'dependencies.dependency.exclusions.exclusion.groupId' for gid:aid:jar is missing"	TokenNameStringLiteral	'dependencies.dependency.exclusions.exclusion.groupId' for gid:aid:jar is missing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'dependencies.dependency.exclusions.exclusion.artifactId' for gid:aid:jar is missing"	TokenNameStringLiteral	'dependencies.dependency.exclusions.exclusion.artifactId' for gid:aid:jar is missing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBadImportScopeType	TokenNameIdentifier	 test Bad Import Scope Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validateRaw	TokenNameIdentifier	 validate Raw
(	TokenNameLPAREN	
"bad-import-scope-type.xml"	TokenNameStringLiteral	bad-import-scope-type.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'dependencyManagement.dependencies.dependency.type' for test:a:jar must be 'pom'"	TokenNameStringLiteral	'dependencyManagement.dependencies.dependency.type' for test:a:jar must be 'pom'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBadImportScopeClassifier	TokenNameIdentifier	 test Bad Import Scope Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validateRaw	TokenNameIdentifier	 validate Raw
(	TokenNameLPAREN	
"bad-import-scope-classifier.xml"	TokenNameStringLiteral	bad-import-scope-classifier.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'dependencyManagement.dependencies.dependency.classifier' for test:a:pom:cls must be empty"	TokenNameStringLiteral	'dependencyManagement.dependencies.dependency.classifier' for test:a:pom:cls must be empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSystemPathRefersToProjectBasedir	TokenNameIdentifier	 test System Path Refers To Project Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
validateRaw	TokenNameIdentifier	 validate Raw
(	TokenNameLPAREN	
"basedir-system-path.xml"	TokenNameStringLiteral	basedir-system-path.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertViolations	TokenNameIdentifier	 assert Violations
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'dependencies.dependency.systemPath' for test:a:jar "	TokenNameStringLiteral	'dependencies.dependency.systemPath' for test:a:jar 
+	TokenNamePLUS	
"should not point at files within the project directory"	TokenNameStringLiteral	should not point at files within the project directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'dependencies.dependency.systemPath' for test:b:jar "	TokenNameStringLiteral	'dependencies.dependency.systemPath' for test:b:jar 
+	TokenNamePLUS	
"should not point at files within the project directory"	TokenNameStringLiteral	should not point at files within the project directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
