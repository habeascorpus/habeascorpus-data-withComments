package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
profiles	TokenNameIdentifier	 profiles
.	TokenNameDOT	
manager	TokenNameIdentifier	 manager
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
Properties	TokenNameIdentifier	 Properties
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
ActivationProperty	TokenNameIdentifier	 Activation Property
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
profiles	TokenNameIdentifier	 profiles
.	TokenNameDOT	
DefaultProfileManager	TokenNameIdentifier	 Default Profile Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
profiles	TokenNameIdentifier	 profiles
.	TokenNameDOT	
ProfileManager	TokenNameIdentifier	 Profile Manager
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
public	TokenNamepublic	
class	TokenNameclass	
DefaultProfileManagerTest	TokenNameIdentifier	 Default Profile Manager Test
extends	TokenNameextends	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
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
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShouldActivateDefaultProfile	TokenNameIdentifier	 test Should Activate Default Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Profile	TokenNameIdentifier	 Profile
notActivated	TokenNameIdentifier	 not Activated
=	TokenNameEQUAL	
new	TokenNamenew	
Profile	TokenNameIdentifier	 Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
notActivated	TokenNameIdentifier	 not Activated
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"notActivated"	TokenNameStringLiteral	notActivated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Activation	TokenNameIdentifier	 Activation
nonActivation	TokenNameIdentifier	 non Activation
=	TokenNameEQUAL	
new	TokenNamenew	
Activation	TokenNameIdentifier	 Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nonActivation	TokenNameIdentifier	 non Activation
.	TokenNameDOT	
setJdk	TokenNameIdentifier	 set Jdk
(	TokenNameLPAREN	
"19.2"	TokenNameStringLiteral	19.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
notActivated	TokenNameIdentifier	 not Activated
.	TokenNameDOT	
setActivation	TokenNameIdentifier	 set Activation
(	TokenNameLPAREN	
nonActivation	TokenNameIdentifier	 non Activation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Profile	TokenNameIdentifier	 Profile
defaultActivated	TokenNameIdentifier	 default Activated
=	TokenNameEQUAL	
new	TokenNamenew	
Profile	TokenNameIdentifier	 Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defaultActivated	TokenNameIdentifier	 default Activated
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"defaultActivated"	TokenNameStringLiteral	defaultActivated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Activation	TokenNameIdentifier	 Activation
defaultActivation	TokenNameIdentifier	 default Activation
=	TokenNameEQUAL	
new	TokenNamenew	
Activation	TokenNameIdentifier	 Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defaultActivation	TokenNameIdentifier	 default Activation
.	TokenNameDOT	
setActiveByDefault	TokenNameIdentifier	 set Active By Default
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defaultActivated	TokenNameIdentifier	 default Activated
.	TokenNameDOT	
setActivation	TokenNameIdentifier	 set Activation
(	TokenNameLPAREN	
defaultActivation	TokenNameIdentifier	 default Activation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProfileManager	TokenNameIdentifier	 Profile Manager
profileManager	TokenNameIdentifier	 profile Manager
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultProfileManager	TokenNameIdentifier	 Default Profile Manager
(	TokenNameLPAREN	
getContainer	TokenNameIdentifier	 get Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profileManager	TokenNameIdentifier	 profile Manager
.	TokenNameDOT	
addProfile	TokenNameIdentifier	 add Profile
(	TokenNameLPAREN	
notActivated	TokenNameIdentifier	 not Activated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profileManager	TokenNameIdentifier	 profile Manager
.	TokenNameDOT	
addProfile	TokenNameIdentifier	 add Profile
(	TokenNameLPAREN	
defaultActivated	TokenNameIdentifier	 default Activated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
profileManager	TokenNameIdentifier	 profile Manager
.	TokenNameDOT	
getActiveProfiles	TokenNameIdentifier	 get Active Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"defaultActivated"	TokenNameStringLiteral	defaultActivated
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Profile	TokenNameIdentifier	 Profile
)	TokenNameRPAREN	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShouldNotActivateDefaultProfile	TokenNameIdentifier	 test Should Not Activate Default Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Profile	TokenNameIdentifier	 Profile
syspropActivated	TokenNameIdentifier	 sysprop Activated
=	TokenNameEQUAL	
new	TokenNamenew	
Profile	TokenNameIdentifier	 Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syspropActivated	TokenNameIdentifier	 sysprop Activated
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"syspropActivated"	TokenNameStringLiteral	syspropActivated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Activation	TokenNameIdentifier	 Activation
syspropActivation	TokenNameIdentifier	 sysprop Activation
=	TokenNameEQUAL	
new	TokenNamenew	
Activation	TokenNameIdentifier	 Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ActivationProperty	TokenNameIdentifier	 Activation Property
syspropProperty	TokenNameIdentifier	 sysprop Property
=	TokenNameEQUAL	
new	TokenNamenew	
ActivationProperty	TokenNameIdentifier	 Activation Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syspropProperty	TokenNameIdentifier	 sysprop Property
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"java.version"	TokenNameStringLiteral	java.version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syspropActivation	TokenNameIdentifier	 sysprop Activation
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
syspropProperty	TokenNameIdentifier	 sysprop Property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syspropActivated	TokenNameIdentifier	 sysprop Activated
.	TokenNameDOT	
setActivation	TokenNameIdentifier	 set Activation
(	TokenNameLPAREN	
syspropActivation	TokenNameIdentifier	 sysprop Activation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Profile	TokenNameIdentifier	 Profile
defaultActivated	TokenNameIdentifier	 default Activated
=	TokenNameEQUAL	
new	TokenNamenew	
Profile	TokenNameIdentifier	 Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defaultActivated	TokenNameIdentifier	 default Activated
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"defaultActivated"	TokenNameStringLiteral	defaultActivated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Activation	TokenNameIdentifier	 Activation
defaultActivation	TokenNameIdentifier	 default Activation
=	TokenNameEQUAL	
new	TokenNamenew	
Activation	TokenNameIdentifier	 Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defaultActivation	TokenNameIdentifier	 default Activation
.	TokenNameDOT	
setActiveByDefault	TokenNameIdentifier	 set Active By Default
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defaultActivated	TokenNameIdentifier	 default Activated
.	TokenNameDOT	
setActivation	TokenNameIdentifier	 set Activation
(	TokenNameLPAREN	
defaultActivation	TokenNameIdentifier	 default Activation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProfileManager	TokenNameIdentifier	 Profile Manager
profileManager	TokenNameIdentifier	 profile Manager
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultProfileManager	TokenNameIdentifier	 Default Profile Manager
(	TokenNameLPAREN	
getContainer	TokenNameIdentifier	 get Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profileManager	TokenNameIdentifier	 profile Manager
.	TokenNameDOT	
addProfile	TokenNameIdentifier	 add Profile
(	TokenNameLPAREN	
syspropActivated	TokenNameIdentifier	 sysprop Activated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profileManager	TokenNameIdentifier	 profile Manager
.	TokenNameDOT	
addProfile	TokenNameIdentifier	 add Profile
(	TokenNameLPAREN	
defaultActivated	TokenNameIdentifier	 default Activated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
profileManager	TokenNameIdentifier	 profile Manager
.	TokenNameDOT	
getActiveProfiles	TokenNameIdentifier	 get Active Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"syspropActivated"	TokenNameStringLiteral	syspropActivated
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Profile	TokenNameIdentifier	 Profile
)	TokenNameRPAREN	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShouldNotActivateReversalOfPresentSystemProperty	TokenNameIdentifier	 test Should Not Activate Reversal Of Present System Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Profile	TokenNameIdentifier	 Profile
syspropActivated	TokenNameIdentifier	 sysprop Activated
=	TokenNameEQUAL	
new	TokenNamenew	
Profile	TokenNameIdentifier	 Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syspropActivated	TokenNameIdentifier	 sysprop Activated
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"syspropActivated"	TokenNameStringLiteral	syspropActivated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Activation	TokenNameIdentifier	 Activation
syspropActivation	TokenNameIdentifier	 sysprop Activation
=	TokenNameEQUAL	
new	TokenNamenew	
Activation	TokenNameIdentifier	 Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ActivationProperty	TokenNameIdentifier	 Activation Property
syspropProperty	TokenNameIdentifier	 sysprop Property
=	TokenNameEQUAL	
new	TokenNamenew	
ActivationProperty	TokenNameIdentifier	 Activation Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syspropProperty	TokenNameIdentifier	 sysprop Property
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"!java.version"	TokenNameStringLiteral	!java.version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syspropActivation	TokenNameIdentifier	 sysprop Activation
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
syspropProperty	TokenNameIdentifier	 sysprop Property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syspropActivated	TokenNameIdentifier	 sysprop Activated
.	TokenNameDOT	
setActivation	TokenNameIdentifier	 set Activation
(	TokenNameLPAREN	
syspropActivation	TokenNameIdentifier	 sysprop Activation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProfileManager	TokenNameIdentifier	 Profile Manager
profileManager	TokenNameIdentifier	 profile Manager
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultProfileManager	TokenNameIdentifier	 Default Profile Manager
(	TokenNameLPAREN	
getContainer	TokenNameIdentifier	 get Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profileManager	TokenNameIdentifier	 profile Manager
.	TokenNameDOT	
addProfile	TokenNameIdentifier	 add Profile
(	TokenNameLPAREN	
syspropActivated	TokenNameIdentifier	 sysprop Activated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
profileManager	TokenNameIdentifier	 profile Manager
.	TokenNameDOT	
getActiveProfiles	TokenNameIdentifier	 get Active Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShouldOverrideAndActivateInactiveProfile	TokenNameIdentifier	 test Should Override And Activate Inactive Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Profile	TokenNameIdentifier	 Profile
syspropActivated	TokenNameIdentifier	 sysprop Activated
=	TokenNameEQUAL	
new	TokenNamenew	
Profile	TokenNameIdentifier	 Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syspropActivated	TokenNameIdentifier	 sysprop Activated
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"syspropActivated"	TokenNameStringLiteral	syspropActivated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Activation	TokenNameIdentifier	 Activation
syspropActivation	TokenNameIdentifier	 sysprop Activation
=	TokenNameEQUAL	
new	TokenNamenew	
Activation	TokenNameIdentifier	 Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ActivationProperty	TokenNameIdentifier	 Activation Property
syspropProperty	TokenNameIdentifier	 sysprop Property
=	TokenNameEQUAL	
new	TokenNamenew	
ActivationProperty	TokenNameIdentifier	 Activation Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syspropProperty	TokenNameIdentifier	 sysprop Property
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"!java.version"	TokenNameStringLiteral	!java.version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syspropActivation	TokenNameIdentifier	 sysprop Activation
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
syspropProperty	TokenNameIdentifier	 sysprop Property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syspropActivated	TokenNameIdentifier	 sysprop Activated
.	TokenNameDOT	
setActivation	TokenNameIdentifier	 set Activation
(	TokenNameLPAREN	
syspropActivation	TokenNameIdentifier	 sysprop Activation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProfileManager	TokenNameIdentifier	 Profile Manager
profileManager	TokenNameIdentifier	 profile Manager
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultProfileManager	TokenNameIdentifier	 Default Profile Manager
(	TokenNameLPAREN	
getContainer	TokenNameIdentifier	 get Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profileManager	TokenNameIdentifier	 profile Manager
.	TokenNameDOT	
addProfile	TokenNameIdentifier	 add Profile
(	TokenNameLPAREN	
syspropActivated	TokenNameIdentifier	 sysprop Activated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profileManager	TokenNameIdentifier	 profile Manager
.	TokenNameDOT	
explicitlyActivate	TokenNameIdentifier	 explicitly Activate
(	TokenNameLPAREN	
"syspropActivated"	TokenNameStringLiteral	syspropActivated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
profileManager	TokenNameIdentifier	 profile Manager
.	TokenNameDOT	
getActiveProfiles	TokenNameIdentifier	 get Active Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"syspropActivated"	TokenNameStringLiteral	syspropActivated
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Profile	TokenNameIdentifier	 Profile
)	TokenNameRPAREN	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShouldOverrideAndDeactivateActiveProfile	TokenNameIdentifier	 test Should Override And Deactivate Active Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Profile	TokenNameIdentifier	 Profile
syspropActivated	TokenNameIdentifier	 sysprop Activated
=	TokenNameEQUAL	
new	TokenNamenew	
Profile	TokenNameIdentifier	 Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syspropActivated	TokenNameIdentifier	 sysprop Activated
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"syspropActivated"	TokenNameStringLiteral	syspropActivated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Activation	TokenNameIdentifier	 Activation
syspropActivation	TokenNameIdentifier	 sysprop Activation
=	TokenNameEQUAL	
new	TokenNamenew	
Activation	TokenNameIdentifier	 Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ActivationProperty	TokenNameIdentifier	 Activation Property
syspropProperty	TokenNameIdentifier	 sysprop Property
=	TokenNameEQUAL	
new	TokenNamenew	
ActivationProperty	TokenNameIdentifier	 Activation Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syspropProperty	TokenNameIdentifier	 sysprop Property
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"java.version"	TokenNameStringLiteral	java.version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syspropActivation	TokenNameIdentifier	 sysprop Activation
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
syspropProperty	TokenNameIdentifier	 sysprop Property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syspropActivated	TokenNameIdentifier	 sysprop Activated
.	TokenNameDOT	
setActivation	TokenNameIdentifier	 set Activation
(	TokenNameLPAREN	
syspropActivation	TokenNameIdentifier	 sysprop Activation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProfileManager	TokenNameIdentifier	 Profile Manager
profileManager	TokenNameIdentifier	 profile Manager
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultProfileManager	TokenNameIdentifier	 Default Profile Manager
(	TokenNameLPAREN	
getContainer	TokenNameIdentifier	 get Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profileManager	TokenNameIdentifier	 profile Manager
.	TokenNameDOT	
addProfile	TokenNameIdentifier	 add Profile
(	TokenNameLPAREN	
syspropActivated	TokenNameIdentifier	 sysprop Activated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profileManager	TokenNameIdentifier	 profile Manager
.	TokenNameDOT	
explicitlyDeactivate	TokenNameIdentifier	 explicitly Deactivate
(	TokenNameLPAREN	
"syspropActivated"	TokenNameStringLiteral	syspropActivated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
profileManager	TokenNameIdentifier	 profile Manager
.	TokenNameDOT	
getActiveProfiles	TokenNameIdentifier	 get Active Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* public void testOsActivationProfile() throws Exception { Profile osActivated = new Profile(); osActivated.setId( "os-profile" ); Activation osActivation = new Activation(); ActivationOS activationOS = new ActivationOS(); activationOS.setName( "!dddd" ); osActivation.setOs( activationOS ); osActivated.setActivation( osActivation ); Properties props = System.getProperties(); ProfileActivationContext ctx = new ProfileActivationContext( props, false ); ProfileManager profileManager = new DefaultProfileManager( getContainer(), props ); profileManager.addProfile( osActivated ); List active = profileManager.getActiveProfiles( null ); assertNotNull( active ); assertEquals( 1, active.size() ); } */	TokenNameCOMMENT_BLOCK	 public void testOsActivationProfile() throws Exception { Profile osActivated = new Profile(); osActivated.setId( "os-profile" ); Activation osActivation = new Activation(); ActivationOS activationOS = new ActivationOS(); activationOS.setName( "!dddd" ); osActivation.setOs( activationOS ); osActivated.setActivation( osActivation ); Properties props = System.getProperties(); ProfileActivationContext ctx = new ProfileActivationContext( props, false ); ProfileManager profileManager = new DefaultProfileManager( getContainer(), props ); profileManager.addProfile( osActivated ); List active = profileManager.getActiveProfiles( null ); assertNotNull( active ); assertEquals( 1, active.size() ); } 
}	TokenNameRBRACE	
