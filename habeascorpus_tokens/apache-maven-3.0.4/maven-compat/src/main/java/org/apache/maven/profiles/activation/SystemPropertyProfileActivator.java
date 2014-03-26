package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
profiles	TokenNameIdentifier	 profiles
.	TokenNameDOT	
activation	TokenNameIdentifier	 activation
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
Context	TokenNameIdentifier	 Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
ContextException	TokenNameIdentifier	 Context Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
personality	TokenNameIdentifier	 personality
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
phase	TokenNameIdentifier	 phase
.	TokenNameDOT	
Contextualizable	TokenNameIdentifier	 Contextualizable
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
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
SystemPropertyProfileActivator	TokenNameIdentifier	 System Property Profile Activator
extends	TokenNameextends	
DetectedProfileActivator	TokenNameIdentifier	 Detected Profile Activator
implements	TokenNameimplements	
Contextualizable	TokenNameIdentifier	 Contextualizable
{	TokenNameLBRACE	
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
properties	TokenNameIdentifier	 properties
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
contextualize	TokenNameIdentifier	 contextualize
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
ContextException	TokenNameIdentifier	 Context Exception
{	TokenNameLBRACE	
properties	TokenNameIdentifier	 properties
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
)	TokenNameRPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"SystemProperties"	TokenNameStringLiteral	SystemProperties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
canDetectActivation	TokenNameIdentifier	 can Detect Activation
(	TokenNameLPAREN	
Profile	TokenNameIdentifier	 Profile
profile	TokenNameIdentifier	 profile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
getActivation	TokenNameIdentifier	 get Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
getActivation	TokenNameIdentifier	 get Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isActive	TokenNameIdentifier	 is Active
(	TokenNameLPAREN	
Profile	TokenNameIdentifier	 Profile
profile	TokenNameIdentifier	 profile
)	TokenNameRPAREN	
throws	TokenNamethrows	
ProfileActivationException	TokenNameIdentifier	 Profile Activation Exception
{	TokenNameLBRACE	
Activation	TokenNameIdentifier	 Activation
activation	TokenNameIdentifier	 activation
=	TokenNameEQUAL	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
getActivation	TokenNameIdentifier	 get Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ProfileActivationException	TokenNameIdentifier	 Profile Activation Exception
(	TokenNameLPAREN	
"The property name is required to activate the profile '"	TokenNameStringLiteral	The property name is required to activate the profile '
+	TokenNamePLUS	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
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
String	TokenNameIdentifier	 String
sysValue	TokenNameIdentifier	 sys Value
=	TokenNameEQUAL	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
