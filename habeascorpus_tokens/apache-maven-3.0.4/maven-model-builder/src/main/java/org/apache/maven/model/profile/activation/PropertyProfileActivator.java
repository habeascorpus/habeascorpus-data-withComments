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
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * Determines profile activation based on the existence or value of some execution property. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Determines profile activation based on the existence or value of some execution property. * @author Benjamin Bentmann 
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
"property"	TokenNameStringLiteral	property
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
PropertyProfileActivator	TokenNameIdentifier	 Property Profile Activator
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
ActivationProperty	TokenNameIdentifier	 Activation Property
property	TokenNameIdentifier	 property
=	TokenNameEQUAL	
activation	TokenNameIdentifier	 activation
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
property	TokenNameIdentifier	 property
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
reverseName	TokenNameIdentifier	 reverse Name
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"!"	TokenNameStringLiteral	!
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reverseName	TokenNameIdentifier	 reverse Name
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Severity	TokenNameIdentifier	 Severity
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"The property name is required to activate the profile "	TokenNameStringLiteral	The property name is required to activate the profile 
+	TokenNamePLUS	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
property	TokenNameIdentifier	 property
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
sysValue	TokenNameIdentifier	 sys Value
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getUserProperties	TokenNameIdentifier	 get User Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sysValue	TokenNameIdentifier	 sys Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sysValue	TokenNameIdentifier	 sys Value
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getSystemProperties	TokenNameIdentifier	 get System Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
propValue	TokenNameIdentifier	 prop Value
=	TokenNameEQUAL	
property	TokenNameIdentifier	 property
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
isNotEmpty	TokenNameIdentifier	 is Not Empty
(	TokenNameLPAREN	
propValue	TokenNameIdentifier	 prop Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
reverseValue	TokenNameIdentifier	 reverse Value
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
propValue	TokenNameIdentifier	 prop Value
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"!"	TokenNameStringLiteral	!
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reverseValue	TokenNameIdentifier	 reverse Value
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
propValue	TokenNameIdentifier	 prop Value
=	TokenNameEQUAL	
propValue	TokenNameIdentifier	 prop Value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we have a value, so it has to match the system value... 	TokenNameCOMMENT_LINE	we have a value, so it has to match the system value... 
boolean	TokenNameboolean	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
propValue	TokenNameIdentifier	 prop Value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
sysValue	TokenNameIdentifier	 sys Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reverseValue	TokenNameIdentifier	 reverse Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
!	TokenNameNOT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
isNotEmpty	TokenNameIdentifier	 is Not Empty
(	TokenNameLPAREN	
sysValue	TokenNameIdentifier	 sys Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reverseName	TokenNameIdentifier	 reverse Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
!	TokenNameNOT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
active	TokenNameIdentifier	 active
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
