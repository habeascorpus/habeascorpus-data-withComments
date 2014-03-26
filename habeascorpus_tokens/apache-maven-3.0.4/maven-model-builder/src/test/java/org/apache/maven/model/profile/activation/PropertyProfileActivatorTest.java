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
/** * Tests {@link PropertyProfileActivator}. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Tests {@link PropertyProfileActivator}. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
PropertyProfileActivatorTest	TokenNameIdentifier	 Property Profile Activator Test
extends	TokenNameextends	
AbstractProfileActivatorTest	TokenNameIdentifier	 Abstract Profile Activator Test
<	TokenNameLESS	
PropertyProfileActivator	TokenNameIdentifier	 Property Profile Activator
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
PropertyProfileActivatorTest	TokenNameIdentifier	 Property Profile Activator Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
PropertyProfileActivator	TokenNameIdentifier	 Property Profile Activator
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
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ActivationProperty	TokenNameIdentifier	 Activation Property
ap	TokenNameIdentifier	 ap
=	TokenNameEQUAL	
new	TokenNamenew	
ActivationProperty	TokenNameIdentifier	 Activation Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ap	TokenNameIdentifier	 ap
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ap	TokenNameIdentifier	 ap
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
ap	TokenNameIdentifier	 ap
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
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
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
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
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
testWithNameOnly_UserProperty	TokenNameIdentifier	 test With Name Only  User Property
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
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
null	TokenNamenull	
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
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
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
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
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
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"other"	TokenNameStringLiteral	other
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithNameOnly_SystemProperty	TokenNameIdentifier	 test With Name Only  System Property
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
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
null	TokenNamenull	
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
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
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
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
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
"other"	TokenNameStringLiteral	other
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithNegatedNameOnly_UserProperty	TokenNameIdentifier	 test With Negated Name Only  User Property
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
"!prop"	TokenNameStringLiteral	!prop
,	TokenNameCOMMA	
null	TokenNamenull	
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
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
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
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
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
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"other"	TokenNameStringLiteral	other
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithNegatedNameOnly_SystemProperty	TokenNameIdentifier	 test With Negated Name Only  System Property
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
"!prop"	TokenNameStringLiteral	!prop
,	TokenNameCOMMA	
null	TokenNamenull	
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
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
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
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
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
"other"	TokenNameStringLiteral	other
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithValue_UserProperty	TokenNameIdentifier	 test With Value  User Property
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
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
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
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
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
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"other"	TokenNameStringLiteral	other
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
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
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithValue_SystemProperty	TokenNameIdentifier	 test With Value  System Property
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
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
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
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
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
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"other"	TokenNameStringLiteral	other
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
"other"	TokenNameStringLiteral	other
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithNegatedValue_UserProperty	TokenNameIdentifier	 test With Negated Value  User Property
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
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"!value"	TokenNameStringLiteral	!value
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
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
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
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"other"	TokenNameStringLiteral	other
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
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
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithNegatedValue_SystemProperty	TokenNameIdentifier	 test With Negated Value  System Property
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
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"!value"	TokenNameStringLiteral	!value
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
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
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
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"other"	TokenNameStringLiteral	other
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
"other"	TokenNameStringLiteral	other
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithValue_UserPropertyDominantOverSystemProperty	TokenNameIdentifier	 test With Value  User Property Dominant Over System Property
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
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
props1	TokenNameIdentifier	 props1
=	TokenNameEQUAL	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
props2	TokenNameIdentifier	 props2
=	TokenNameEQUAL	
newProperties	TokenNameIdentifier	 new Properties
(	TokenNameLPAREN	
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"other"	TokenNameStringLiteral	other
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
props1	TokenNameIdentifier	 props1
,	TokenNameCOMMA	
props2	TokenNameIdentifier	 props2
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
props2	TokenNameIdentifier	 props2
,	TokenNameCOMMA	
props1	TokenNameIdentifier	 props1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
