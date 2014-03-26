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
.	TokenNameDOT	
activation	TokenNameIdentifier	 activation
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Activation	TokenNameIdentifier	 Activation
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
ActivationOS	TokenNameIdentifier	 Activation OS
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
ModelProblemCollector	TokenNameIdentifier	 Model Problem Collector
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
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
ProfileActivationContext	TokenNameIdentifier	 Profile Activation Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Component	TokenNameIdentifier	 Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Os	TokenNameIdentifier	 Os
;	TokenNameSEMICOLON	
/** * Determines profile activation based on the operating system of the current runtime platform. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Determines profile activation based on the operating system of the current runtime platform. * @author Benjamin Bentmann 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ProfileActivator	TokenNameIdentifier	 Profile Activator
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
hint	TokenNameIdentifier	 hint
=	TokenNameEQUAL	
"os"	TokenNameStringLiteral	os
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
OperatingSystemProfileActivator	TokenNameIdentifier	 Operating System Profile Activator
implements	TokenNameimplements	
ProfileActivator	TokenNameIdentifier	 Profile Activator
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isActive	TokenNameIdentifier	 is Active
(	TokenNameLPAREN	
Profile	TokenNameIdentifier	 Profile
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
ProfileActivationContext	TokenNameIdentifier	 Profile Activation Context
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
ModelProblemCollector	TokenNameIdentifier	 Model Problem Collector
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Activation	TokenNameIdentifier	 Activation
activation	TokenNameIdentifier	 activation
=	TokenNameEQUAL	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
getActivation	TokenNameIdentifier	 get Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
activation	TokenNameIdentifier	 activation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ActivationOS	TokenNameIdentifier	 Activation OS
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
activation	TokenNameIdentifier	 activation
.	TokenNameDOT	
getOs	TokenNameIdentifier	 get Os
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
ensureAtLeastOneNonNull	TokenNameIdentifier	 ensure At Least One Non Null
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
&&	TokenNameAND_AND	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getFamily	TokenNameIdentifier	 get Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
determineFamilyMatch	TokenNameIdentifier	 determine Family Match
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getFamily	TokenNameIdentifier	 get Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
&&	TokenNameAND_AND	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
determineNameMatch	TokenNameIdentifier	 determine Name Match
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
&&	TokenNameAND_AND	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getArch	TokenNameIdentifier	 get Arch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
determineArchMatch	TokenNameIdentifier	 determine Arch Match
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getArch	TokenNameIdentifier	 get Arch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
&&	TokenNameAND_AND	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
determineVersionMatch	TokenNameIdentifier	 determine Version Match
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
active	TokenNameIdentifier	 active
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
ensureAtLeastOneNonNull	TokenNameIdentifier	 ensure At Least One Non Null
(	TokenNameLPAREN	
ActivationOS	TokenNameIdentifier	 Activation OS
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getArch	TokenNameIdentifier	 get Arch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getFamily	TokenNameIdentifier	 get Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
determineVersionMatch	TokenNameIdentifier	 determine Version Match
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"!"	TokenNameStringLiteral	!
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isVersion	TokenNameIdentifier	 is Version
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
determineArchMatch	TokenNameIdentifier	 determine Arch Match
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arch	TokenNameIdentifier	 arch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
arch	TokenNameIdentifier	 arch
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"!"	TokenNameStringLiteral	!
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isArch	TokenNameIdentifier	 is Arch
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
determineNameMatch	TokenNameIdentifier	 determine Name Match
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"!"	TokenNameStringLiteral	!
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isName	TokenNameIdentifier	 is Name
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
determineFamilyMatch	TokenNameIdentifier	 determine Family Match
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
family	TokenNameIdentifier	 family
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
family	TokenNameIdentifier	 family
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"!"	TokenNameStringLiteral	!
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
