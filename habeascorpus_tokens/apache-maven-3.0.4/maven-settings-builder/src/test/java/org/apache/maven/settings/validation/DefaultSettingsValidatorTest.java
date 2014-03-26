package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
Mirror	TokenNameIdentifier	 Mirror
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
Profile	TokenNameIdentifier	 Profile
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
Server	TokenNameIdentifier	 Server
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
Settings	TokenNameIdentifier	 Settings
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
building	TokenNameIdentifier	 building
.	TokenNameDOT	
SettingsProblemCollector	TokenNameIdentifier	 Settings Problem Collector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
building	TokenNameIdentifier	 building
.	TokenNameDOT	
SettingsProblem	TokenNameIdentifier	 Settings Problem
.	TokenNameDOT	
Severity	TokenNameIdentifier	 Severity
;	TokenNameSEMICOLON	
/** * @author mkleint */	TokenNameCOMMENT_JAVADOC	 @author mkleint 
public	TokenNamepublic	
class	TokenNameclass	
DefaultSettingsValidatorTest	TokenNameIdentifier	 Default Settings Validator Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
DefaultSettingsValidator	TokenNameIdentifier	 Default Settings Validator
validator	TokenNameIdentifier	 validator
;	TokenNameSEMICOLON	
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
new	TokenNamenew	
DefaultSettingsValidator	TokenNameIdentifier	 Default Settings Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
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
public	TokenNamepublic	
void	TokenNamevoid	
testValidate	TokenNameIdentifier	 test Validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Settings	TokenNameIdentifier	 Settings
model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
new	TokenNamenew	
Settings	TokenNameIdentifier	 Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Profile	TokenNameIdentifier	 Profile
prof	TokenNameIdentifier	 prof
=	TokenNameEQUAL	
new	TokenNamenew	
Profile	TokenNameIdentifier	 Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prof	TokenNameIdentifier	 prof
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"xxx"	TokenNameStringLiteral	xxx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
addProfile	TokenNameIdentifier	 add Profile
(	TokenNameLPAREN	
prof	TokenNameIdentifier	 prof
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
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Repository	TokenNameIdentifier	 Repository
repo	TokenNameIdentifier	 repo
=	TokenNameEQUAL	
new	TokenNamenew	
Repository	TokenNameIdentifier	 Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prof	TokenNameIdentifier	 prof
.	TokenNameDOT	
addRepository	TokenNameIdentifier	 add Repository
(	TokenNameLPAREN	
repo	TokenNameIdentifier	 repo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
problems	TokenNameIdentifier	 problems
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validator	TokenNameIdentifier	 validator
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
"http://xxx.xxx.com"	TokenNameStringLiteral	http://xxx.xxx.com
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
problems	TokenNameIdentifier	 problems
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validator	TokenNameIdentifier	 validator
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"xxx"	TokenNameStringLiteral	xxx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
problems	TokenNameIdentifier	 problems
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validator	TokenNameIdentifier	 validator
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testValidateMirror	TokenNameIdentifier	 test Validate Mirror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Settings	TokenNameIdentifier	 Settings
settings	TokenNameIdentifier	 settings
=	TokenNameEQUAL	
new	TokenNamenew	
Settings	TokenNameIdentifier	 Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mirror	TokenNameIdentifier	 Mirror
mirror	TokenNameIdentifier	 mirror
=	TokenNameEQUAL	
new	TokenNamenew	
Mirror	TokenNameIdentifier	 Mirror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"local"	TokenNameStringLiteral	local
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
addMirror	TokenNameIdentifier	 add Mirror
(	TokenNameLPAREN	
mirror	TokenNameIdentifier	 mirror
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mirror	TokenNameIdentifier	 mirror
=	TokenNameEQUAL	
new	TokenNamenew	
Mirror	TokenNameIdentifier	 Mirror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"illegal\:/chars"	TokenNameStringLiteral	illegal\:/chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
"http://void"	TokenNameStringLiteral	http://void
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
setMirrorOf	TokenNameIdentifier	 set Mirror Of
(	TokenNameLPAREN	
"void"	TokenNameStringLiteral	void
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
addMirror	TokenNameIdentifier	 add Mirror
(	TokenNameLPAREN	
mirror	TokenNameIdentifier	 mirror
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
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'mirrors.mirror.id' must not be 'local'"	TokenNameStringLiteral	'mirrors.mirror.id' must not be 'local'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'mirrors.mirror.url' for local is missing"	TokenNameStringLiteral	'mirrors.mirror.url' for local is missing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'mirrors.mirror.mirrorOf' for local is missing"	TokenNameStringLiteral	'mirrors.mirror.mirrorOf' for local is missing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'mirrors.mirror.id' must not contain any of these characters"	TokenNameStringLiteral	'mirrors.mirror.id' must not contain any of these characters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testValidateRepository	TokenNameIdentifier	 test Validate Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Profile	TokenNameIdentifier	 Profile
profile	TokenNameIdentifier	 profile
=	TokenNameEQUAL	
new	TokenNamenew	
Profile	TokenNameIdentifier	 Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Repository	TokenNameIdentifier	 Repository
repo	TokenNameIdentifier	 repo
=	TokenNameEQUAL	
new	TokenNamenew	
Repository	TokenNameIdentifier	 Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"local"	TokenNameStringLiteral	local
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
addRepository	TokenNameIdentifier	 add Repository
(	TokenNameLPAREN	
repo	TokenNameIdentifier	 repo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo	TokenNameIdentifier	 repo
=	TokenNameEQUAL	
new	TokenNamenew	
Repository	TokenNameIdentifier	 Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"illegal\:/chars"	TokenNameStringLiteral	illegal\:/chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
"http://void"	TokenNameStringLiteral	http://void
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
addRepository	TokenNameIdentifier	 add Repository
(	TokenNameLPAREN	
repo	TokenNameIdentifier	 repo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Settings	TokenNameIdentifier	 Settings
settings	TokenNameIdentifier	 settings
=	TokenNameEQUAL	
new	TokenNamenew	
Settings	TokenNameIdentifier	 Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
addProfile	TokenNameIdentifier	 add Profile
(	TokenNameLPAREN	
profile	TokenNameIdentifier	 profile
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
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'profiles.profile[default].repositories.repository.id' must not be 'local'"	TokenNameStringLiteral	'profiles.profile[default].repositories.repository.id' must not be 'local'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'profiles.profile[default].repositories.repository.url' for local is missing"	TokenNameStringLiteral	'profiles.profile[default].repositories.repository.url' for local is missing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'profiles.profile[default].repositories.repository.id' must not contain any of these characters"	TokenNameStringLiteral	'profiles.profile[default].repositories.repository.id' must not contain any of these characters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testValidateUniqueServerId	TokenNameIdentifier	 test Validate Unique Server Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Settings	TokenNameIdentifier	 Settings
settings	TokenNameIdentifier	 settings
=	TokenNameEQUAL	
new	TokenNamenew	
Settings	TokenNameIdentifier	 Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Server	TokenNameIdentifier	 Server
server1	TokenNameIdentifier	 server1
=	TokenNameEQUAL	
new	TokenNamenew	
Server	TokenNameIdentifier	 Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
server1	TokenNameIdentifier	 server1
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
addServer	TokenNameIdentifier	 add Server
(	TokenNameLPAREN	
server1	TokenNameIdentifier	 server1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Server	TokenNameIdentifier	 Server
server2	TokenNameIdentifier	 server2
=	TokenNameEQUAL	
new	TokenNamenew	
Server	TokenNameIdentifier	 Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
server2	TokenNameIdentifier	 server2
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
addServer	TokenNameIdentifier	 add Server
(	TokenNameLPAREN	
server2	TokenNameIdentifier	 server2
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
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'servers.server.id' must be unique but found duplicate server with id test"	TokenNameStringLiteral	'servers.server.id' must be unique but found duplicate server with id test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testValidateUniqueProfileId	TokenNameIdentifier	 test Validate Unique Profile Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Settings	TokenNameIdentifier	 Settings
settings	TokenNameIdentifier	 settings
=	TokenNameEQUAL	
new	TokenNamenew	
Settings	TokenNameIdentifier	 Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Profile	TokenNameIdentifier	 Profile
profile1	TokenNameIdentifier	 profile1
=	TokenNameEQUAL	
new	TokenNamenew	
Profile	TokenNameIdentifier	 Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profile1	TokenNameIdentifier	 profile1
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
addProfile	TokenNameIdentifier	 add Profile
(	TokenNameLPAREN	
profile1	TokenNameIdentifier	 profile1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Profile	TokenNameIdentifier	 Profile
profile2	TokenNameIdentifier	 profile2
=	TokenNameEQUAL	
new	TokenNamenew	
Profile	TokenNameIdentifier	 Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profile2	TokenNameIdentifier	 profile2
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
addProfile	TokenNameIdentifier	 add Profile
(	TokenNameLPAREN	
profile2	TokenNameIdentifier	 profile2
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
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'profiles.profile.id' must be unique but found duplicate profile with id test"	TokenNameStringLiteral	'profiles.profile.id' must be unique but found duplicate profile with id test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testValidateUniqueRepositoryId	TokenNameIdentifier	 test Validate Unique Repository Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Settings	TokenNameIdentifier	 Settings
settings	TokenNameIdentifier	 settings
=	TokenNameEQUAL	
new	TokenNamenew	
Settings	TokenNameIdentifier	 Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Profile	TokenNameIdentifier	 Profile
profile	TokenNameIdentifier	 profile
=	TokenNameEQUAL	
new	TokenNamenew	
Profile	TokenNameIdentifier	 Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"pro"	TokenNameStringLiteral	pro
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
addProfile	TokenNameIdentifier	 add Profile
(	TokenNameLPAREN	
profile	TokenNameIdentifier	 profile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Repository	TokenNameIdentifier	 Repository
repo1	TokenNameIdentifier	 repo1
=	TokenNameEQUAL	
new	TokenNamenew	
Repository	TokenNameIdentifier	 Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo1	TokenNameIdentifier	 repo1
.	TokenNameDOT	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
"http://apache.org/"	TokenNameStringLiteral	http://apache.org/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo1	TokenNameIdentifier	 repo1
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
addRepository	TokenNameIdentifier	 add Repository
(	TokenNameLPAREN	
repo1	TokenNameIdentifier	 repo1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Repository	TokenNameIdentifier	 Repository
repo2	TokenNameIdentifier	 repo2
=	TokenNameEQUAL	
new	TokenNamenew	
Repository	TokenNameIdentifier	 Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo2	TokenNameIdentifier	 repo2
.	TokenNameDOT	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
"http://apache.org/"	TokenNameStringLiteral	http://apache.org/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo2	TokenNameIdentifier	 repo2
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
addRepository	TokenNameIdentifier	 add Repository
(	TokenNameLPAREN	
repo2	TokenNameIdentifier	 repo2
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
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
settings	TokenNameIdentifier	 settings
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContains	TokenNameIdentifier	 assert Contains
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"'profiles.profile[pro].repositories.repository.id' must be unique"	TokenNameStringLiteral	'profiles.profile[pro].repositories.repository.id' must be unique
+	TokenNamePLUS	
" but found duplicate repository with id test"	TokenNameStringLiteral	 but found duplicate repository with id test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
implements	TokenNameimplements	
SettingsProblemCollector	TokenNameIdentifier	 Settings Problem Collector
{	TokenNameLBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
messages	TokenNameIdentifier	 messages
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
int	TokenNameint	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
int	TokenNameint	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
