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
Profile	TokenNameIdentifier	 Profile
;	TokenNameSEMICOLON	
/** * Tests {@link JdkVersionProfileActivator}. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Tests {@link JdkVersionProfileActivator}. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
JdkVersionProfileActivatorTest	TokenNameIdentifier	 Jdk Version Profile Activator Test
extends	TokenNameextends	
AbstractProfileActivatorTest	TokenNameIdentifier	 Abstract Profile Activator Test
<	TokenNameLESS	
JdkVersionProfileActivator	TokenNameIdentifier	 Jdk Version Profile Activator
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
JdkVersionProfileActivatorTest	TokenNameIdentifier	 Jdk Version Profile Activator Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
JdkVersionProfileActivator	TokenNameIdentifier	 Jdk Version Profile Activator
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Profile	TokenNameIdentifier	 Profile
newProfile	TokenNameIdentifier	 new Profile
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
jdkVersion	TokenNameIdentifier	 jdk Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Activation	TokenNameIdentifier	 Activation
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
Activation	TokenNameIdentifier	 Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setJdk	TokenNameIdentifier	 set Jdk
(	TokenNameLPAREN	
jdkVersion	TokenNameIdentifier	 jdk Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Profile	TokenNameIdentifier	 Profile
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Profile	TokenNameIdentifier	 Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setActivation	TokenNameIdentifier	 set Activation
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
javaVersion	TokenNameIdentifier	 java Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"java.version"	TokenNameStringLiteral	java.version
,	TokenNameCOMMA	
javaVersion	TokenNameIdentifier	 java Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
props	TokenNameIdentifier	 props
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNullSafe	TokenNameIdentifier	 test Null Safe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Profile	TokenNameIdentifier	 Profile
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Profile	TokenNameIdentifier	 Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setActivation	TokenNameIdentifier	 set Activation
(	TokenNameLPAREN	
new	TokenNamenew	
Activation	TokenNameIdentifier	 Activation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPrefix	TokenNameIdentifier	 test Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Profile	TokenNameIdentifier	 Profile
profile	TokenNameIdentifier	 profile
=	TokenNameEQUAL	
newProfile	TokenNameIdentifier	 new Profile
(	TokenNameLPAREN	
"1.4"	TokenNameStringLiteral	1.4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.4"	TokenNameStringLiteral	1.4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.4.2"	TokenNameStringLiteral	1.4.2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.4.2_09"	TokenNameStringLiteral	1.4.2_09
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.4.2_09-b03"	TokenNameStringLiteral	1.4.2_09-b03
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.3"	TokenNameStringLiteral	1.3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5"	TokenNameStringLiteral	1.5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPrefixNegated	TokenNameIdentifier	 test Prefix Negated
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Profile	TokenNameIdentifier	 Profile
profile	TokenNameIdentifier	 profile
=	TokenNameEQUAL	
newProfile	TokenNameIdentifier	 new Profile
(	TokenNameLPAREN	
"!1.4"	TokenNameStringLiteral	!1.4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.4"	TokenNameStringLiteral	1.4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.4.2"	TokenNameStringLiteral	1.4.2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.4.2_09"	TokenNameStringLiteral	1.4.2_09
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.4.2_09-b03"	TokenNameStringLiteral	1.4.2_09-b03
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.3"	TokenNameStringLiteral	1.3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5"	TokenNameStringLiteral	1.5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testVersionRangeInclusiveBounds	TokenNameIdentifier	 test Version Range Inclusive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Profile	TokenNameIdentifier	 Profile
profile	TokenNameIdentifier	 profile
=	TokenNameEQUAL	
newProfile	TokenNameIdentifier	 new Profile
(	TokenNameLPAREN	
"[1.5,1.6]"	TokenNameStringLiteral	[1.5,1.6]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.4"	TokenNameStringLiteral	1.4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.4.2"	TokenNameStringLiteral	1.4.2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.4.2_09"	TokenNameStringLiteral	1.4.2_09
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.4.2_09-b03"	TokenNameStringLiteral	1.4.2_09-b03
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5"	TokenNameStringLiteral	1.5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5.0"	TokenNameStringLiteral	1.5.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5.0_09"	TokenNameStringLiteral	1.5.0_09
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5.0_09-b03"	TokenNameStringLiteral	1.5.0_09-b03
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5.1"	TokenNameStringLiteral	1.5.1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.6"	TokenNameStringLiteral	1.6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.6.0"	TokenNameStringLiteral	1.6.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.6.0_09"	TokenNameStringLiteral	1.6.0_09
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.6.0_09-b03"	TokenNameStringLiteral	1.6.0_09-b03
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testVersionRangeExclusiveBounds	TokenNameIdentifier	 test Version Range Exclusive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Profile	TokenNameIdentifier	 Profile
profile	TokenNameIdentifier	 profile
=	TokenNameEQUAL	
newProfile	TokenNameIdentifier	 new Profile
(	TokenNameLPAREN	
"(1.3,1.6)"	TokenNameStringLiteral	(1.3,1.6)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.3"	TokenNameStringLiteral	1.3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.3.0"	TokenNameStringLiteral	1.3.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.3.0_09"	TokenNameStringLiteral	1.3.0_09
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.3.0_09-b03"	TokenNameStringLiteral	1.3.0_09-b03
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.3.1"	TokenNameStringLiteral	1.3.1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.3.1_09"	TokenNameStringLiteral	1.3.1_09
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.3.1_09-b03"	TokenNameStringLiteral	1.3.1_09-b03
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5"	TokenNameStringLiteral	1.5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5.0"	TokenNameStringLiteral	1.5.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5.0_09"	TokenNameStringLiteral	1.5.0_09
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5.0_09-b03"	TokenNameStringLiteral	1.5.0_09-b03
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5.1"	TokenNameStringLiteral	1.5.1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.6"	TokenNameStringLiteral	1.6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testVersionRangeInclusiveLowerBound	TokenNameIdentifier	 test Version Range Inclusive Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Profile	TokenNameIdentifier	 Profile
profile	TokenNameIdentifier	 profile
=	TokenNameEQUAL	
newProfile	TokenNameIdentifier	 new Profile
(	TokenNameLPAREN	
"[1.5,)"	TokenNameStringLiteral	[1.5,)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.4"	TokenNameStringLiteral	1.4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.4.2"	TokenNameStringLiteral	1.4.2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.4.2_09"	TokenNameStringLiteral	1.4.2_09
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.4.2_09-b03"	TokenNameStringLiteral	1.4.2_09-b03
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5"	TokenNameStringLiteral	1.5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5.0"	TokenNameStringLiteral	1.5.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5.0_09"	TokenNameStringLiteral	1.5.0_09
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5.0_09-b03"	TokenNameStringLiteral	1.5.0_09-b03
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5.1"	TokenNameStringLiteral	1.5.1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.6"	TokenNameStringLiteral	1.6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.6.0"	TokenNameStringLiteral	1.6.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.6.0_09"	TokenNameStringLiteral	1.6.0_09
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.6.0_09-b03"	TokenNameStringLiteral	1.6.0_09-b03
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testVersionRangeExclusiveUpperBound	TokenNameIdentifier	 test Version Range Exclusive Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Profile	TokenNameIdentifier	 Profile
profile	TokenNameIdentifier	 profile
=	TokenNameEQUAL	
newProfile	TokenNameIdentifier	 new Profile
(	TokenNameLPAREN	
"(,1.6)"	TokenNameStringLiteral	(,1.6)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5"	TokenNameStringLiteral	1.5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5.0"	TokenNameStringLiteral	1.5.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5.0_09"	TokenNameStringLiteral	1.5.0_09
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5.0_09-b03"	TokenNameStringLiteral	1.5.0_09-b03
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.5.1"	TokenNameStringLiteral	1.5.1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.6"	TokenNameStringLiteral	1.6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.6.0"	TokenNameStringLiteral	1.6.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.6.0_09"	TokenNameStringLiteral	1.6.0_09
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertActivation	TokenNameIdentifier	 assert Activation
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"1.6.0_09-b03"	TokenNameStringLiteral	1.6.0_09-b03
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
