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
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
DefaultProfileActivationContext	TokenNameIdentifier	 Default Profile Activation Context
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
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
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
/** * Provides common services to test {@link ProfileActivator} implementations. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Provides common services to test {@link ProfileActivator} implementations. * @author Benjamin Bentmann 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractProfileActivatorTest	TokenNameIdentifier	 Abstract Profile Activator Test
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
ProfileActivator	TokenNameIdentifier	 Profile Activator
>	TokenNameGREATER	
extends	TokenNameextends	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
activatorClass	TokenNameIdentifier	 activator Class
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
roleHint	TokenNameIdentifier	 role Hint
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
T	TokenNameIdentifier	 T
activator	TokenNameIdentifier	 activator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AbstractProfileActivatorTest	TokenNameIdentifier	 Abstract Profile Activator Test
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
activatorClass	TokenNameIdentifier	 activator Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
activatorClass	TokenNameIdentifier	 activator Class
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"class of profile activator to test is not specified"	TokenNameStringLiteral	class of profile activator to test is not specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
activatorClass	TokenNameIdentifier	 activator Class
=	TokenNameEQUAL	
activatorClass	TokenNameIdentifier	 activator Class
;	TokenNameSEMICOLON	
roleHint	TokenNameIdentifier	 role Hint
=	TokenNameEQUAL	
activatorClass	TokenNameIdentifier	 activator Class
.	TokenNameDOT	
getAnnotation	TokenNameIdentifier	 get Annotation
(	TokenNameLPAREN	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
.	TokenNameDOT	
hint	TokenNameIdentifier	 hint
(	TokenNameLPAREN	
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
activator	TokenNameIdentifier	 activator
=	TokenNameEQUAL	
activatorClass	TokenNameIdentifier	 activator Class
.	TokenNameDOT	
cast	TokenNameIdentifier	 cast
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ProfileActivator	TokenNameIdentifier	 Profile Activator
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
roleHint	TokenNameIdentifier	 role Hint
)	TokenNameRPAREN	
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
activator	TokenNameIdentifier	 activator
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
protected	TokenNameprotected	
ProfileActivationContext	TokenNameIdentifier	 Profile Activation Context
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
final	TokenNamefinal	
Properties	TokenNameIdentifier	 Properties
userProperties	TokenNameIdentifier	 user Properties
,	TokenNameCOMMA	
final	TokenNamefinal	
Properties	TokenNameIdentifier	 Properties
systemProperties	TokenNameIdentifier	 system Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DefaultProfileActivationContext	TokenNameIdentifier	 Default Profile Activation Context
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultProfileActivationContext	TokenNameIdentifier	 Default Profile Activation Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
setUserProperties	TokenNameIdentifier	 set User Properties
(	TokenNameLPAREN	
userProperties	TokenNameIdentifier	 user Properties
)	TokenNameRPAREN	
.	TokenNameDOT	
setSystemProperties	TokenNameIdentifier	 set System Properties
(	TokenNameLPAREN	
systemProperties	TokenNameIdentifier	 system Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
boolean	TokenNameboolean	
active	TokenNameIdentifier	 active
,	TokenNameCOMMA	
Profile	TokenNameIdentifier	 Profile
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
ProfileActivationContext	TokenNameIdentifier	 Profile Activation Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
problems	TokenNameIdentifier	 problems
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleProblemCollector	TokenNameIdentifier	 Simple Problem Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
,	TokenNameCOMMA	
activator	TokenNameIdentifier	 activator
.	TokenNameDOT	
isActive	TokenNameIdentifier	 is Active
(	TokenNameLPAREN	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
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
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
problems	TokenNameIdentifier	 problems
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
}	TokenNameRBRACE	
