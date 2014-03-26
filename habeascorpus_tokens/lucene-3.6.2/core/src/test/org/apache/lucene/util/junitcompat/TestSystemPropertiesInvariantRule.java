package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
junitcompat	TokenNameIdentifier	 junitcompat
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SystemPropertiesInvariantRule	TokenNameIdentifier	 System Properties Invariant Rule
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SystemPropertiesRestoreRule	TokenNameIdentifier	 System Properties Restore Rule
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
TestRule	TokenNameIdentifier	 Test Rule
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
JUnitCore	TokenNameIdentifier	 J Unit Core
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
Result	TokenNameIdentifier	 Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
notification	TokenNameIdentifier	 notification
.	TokenNameDOT	
Failure	TokenNameIdentifier	 Failure
;	TokenNameSEMICOLON	
/** * @see SystemPropertiesRestoreRule * @see SystemPropertiesInvariantRule */	TokenNameCOMMENT_JAVADOC	 @see SystemPropertiesRestoreRule @see SystemPropertiesInvariantRule 
public	TokenNamepublic	
class	TokenNameclass	
TestSystemPropertiesInvariantRule	TokenNameIdentifier	 Test System Properties Invariant Rule
extends	TokenNameextends	
WithNestedTests	TokenNameIdentifier	 With Nested Tests
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
=	TokenNameEQUAL	
"new-property-1"	TokenNameStringLiteral	new-property-1
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALUE1	TokenNameIdentifier	 VALU E1
=	TokenNameEQUAL	
"new-value-1"	TokenNameStringLiteral	new-value-1
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TestSystemPropertiesInvariantRule	TokenNameIdentifier	 Test System Properties Invariant Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Base	TokenNameIdentifier	 Base
extends	TokenNameextends	
WithNestedTests	TokenNameIdentifier	 With Nested Tests
.	TokenNameDOT	
AbstractNestedTest	TokenNameIdentifier	 Abstract Nested Test
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmpty	TokenNameIdentifier	 test Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
InBeforeClass	TokenNameIdentifier	 In Before Class
extends	TokenNameextends	
Base	TokenNameIdentifier	 Base
{	TokenNameLBRACE	
@	TokenNameAT	
BeforeClass	TokenNameIdentifier	 Before Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
beforeClass	TokenNameIdentifier	 before Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
,	TokenNameCOMMA	
VALUE1	TokenNameIdentifier	 VALU E1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
InAfterClass	TokenNameIdentifier	 In After Class
extends	TokenNameextends	
Base	TokenNameIdentifier	 Base
{	TokenNameLBRACE	
@	TokenNameAT	
AfterClass	TokenNameIdentifier	 After Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
afterClass	TokenNameIdentifier	 after Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
,	TokenNameCOMMA	
VALUE1	TokenNameIdentifier	 VALU E1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
InTestMethod	TokenNameIdentifier	 In Test Method
extends	TokenNameextends	
Base	TokenNameIdentifier	 Base
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMethod1	TokenNameIdentifier	 test Method1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Shouldn't be here."	TokenNameStringLiteral	Shouldn't be here.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
,	TokenNameCOMMA	
VALUE1	TokenNameIdentifier	 VALU E1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMethod2	TokenNameIdentifier	 test Method2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testMethod1	TokenNameIdentifier	 test Method1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
NonStringProperties	TokenNameIdentifier	 Non String Properties
extends	TokenNameextends	
Base	TokenNameIdentifier	 Base
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMethod1	TokenNameIdentifier	 test Method1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Will pass."	TokenNameStringLiteral	Will pass.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Properties	TokenNameIdentifier	 Properties
properties	TokenNameIdentifier	 properties
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMethod2	TokenNameIdentifier	 test Method2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testMethod1	TokenNameIdentifier	 test Method1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
AfterClass	TokenNameIdentifier	 After Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
IgnoredProperty	TokenNameIdentifier	 Ignored Property
{	TokenNameLBRACE	
@	TokenNameAT	
Rule	TokenNameIdentifier	 Rule
public	TokenNamepublic	
TestRule	TokenNameIdentifier	 Test Rule
invariant	TokenNameIdentifier	 invariant
=	TokenNameEQUAL	
new	TokenNamenew	
SystemPropertiesInvariantRule	TokenNameIdentifier	 System Properties Invariant Rule
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testMethod1	TokenNameIdentifier	 test Method1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
,	TokenNameCOMMA	
VALUE1	TokenNameIdentifier	 VALU E1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Before	TokenNameIdentifier	 Before
@	TokenNameAT	
After	TokenNameIdentifier	 After
public	TokenNamepublic	
void	TokenNamevoid	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
clearProperty	TokenNameIdentifier	 clear Property
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRuleInvariantBeforeClass	TokenNameIdentifier	 test Rule Invariant Before Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Result	TokenNameIdentifier	 Result
runClasses	TokenNameIdentifier	 run Classes
=	TokenNameEQUAL	
JUnitCore	TokenNameIdentifier	 J Unit Core
.	TokenNameDOT	
runClasses	TokenNameIdentifier	 run Classes
(	TokenNameLPAREN	
InBeforeClass	TokenNameIdentifier	 In Before Class
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
runClasses	TokenNameIdentifier	 run Classes
.	TokenNameDOT	
getFailureCount	TokenNameIdentifier	 get Failure Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runClasses	TokenNameIdentifier	 run Classes
.	TokenNameDOT	
getFailures	TokenNameIdentifier	 get Failures
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRuleInvariantAfterClass	TokenNameIdentifier	 test Rule Invariant After Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Result	TokenNameIdentifier	 Result
runClasses	TokenNameIdentifier	 run Classes
=	TokenNameEQUAL	
JUnitCore	TokenNameIdentifier	 J Unit Core
.	TokenNameDOT	
runClasses	TokenNameIdentifier	 run Classes
(	TokenNameLPAREN	
InAfterClass	TokenNameIdentifier	 In After Class
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
runClasses	TokenNameIdentifier	 run Classes
.	TokenNameDOT	
getFailureCount	TokenNameIdentifier	 get Failure Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runClasses	TokenNameIdentifier	 run Classes
.	TokenNameDOT	
getFailures	TokenNameIdentifier	 get Failures
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRuleInvariantInTestMethod	TokenNameIdentifier	 test Rule Invariant In Test Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Result	TokenNameIdentifier	 Result
runClasses	TokenNameIdentifier	 run Classes
=	TokenNameEQUAL	
JUnitCore	TokenNameIdentifier	 J Unit Core
.	TokenNameDOT	
runClasses	TokenNameIdentifier	 run Classes
(	TokenNameLPAREN	
InTestMethod	TokenNameIdentifier	 In Test Method
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
runClasses	TokenNameIdentifier	 run Classes
.	TokenNameDOT	
getFailureCount	TokenNameIdentifier	 get Failure Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Failure	TokenNameIdentifier	 Failure
f	TokenNameIdentifier	 f
:	TokenNameCOLON	
runClasses	TokenNameIdentifier	 run Classes
.	TokenNameDOT	
getFailures	TokenNameIdentifier	 get Failures
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testNonStringProperties	TokenNameIdentifier	 test Non String Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Result	TokenNameIdentifier	 Result
runClasses	TokenNameIdentifier	 run Classes
=	TokenNameEQUAL	
JUnitCore	TokenNameIdentifier	 J Unit Core
.	TokenNameDOT	
runClasses	TokenNameIdentifier	 run Classes
(	TokenNameLPAREN	
NonStringProperties	TokenNameIdentifier	 Non String Properties
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
runClasses	TokenNameIdentifier	 run Classes
.	TokenNameDOT	
getFailureCount	TokenNameIdentifier	 get Failure Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runClasses	TokenNameIdentifier	 run Classes
.	TokenNameDOT	
getFailures	TokenNameIdentifier	 get Failures
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"Will pass"	TokenNameStringLiteral	Will pass
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
runClasses	TokenNameIdentifier	 run Classes
.	TokenNameDOT	
getRunCount	TokenNameIdentifier	 get Run Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testIgnoredProperty	TokenNameIdentifier	 test Ignored Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
clearProperty	TokenNameIdentifier	 clear Property
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Result	TokenNameIdentifier	 Result
runClasses	TokenNameIdentifier	 run Classes
=	TokenNameEQUAL	
JUnitCore	TokenNameIdentifier	 J Unit Core
.	TokenNameDOT	
runClasses	TokenNameIdentifier	 run Classes
(	TokenNameLPAREN	
IgnoredProperty	TokenNameIdentifier	 Ignored Property
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
runClasses	TokenNameIdentifier	 run Classes
.	TokenNameDOT	
getFailureCount	TokenNameIdentifier	 get Failure Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
VALUE1	TokenNameIdentifier	 VALU E1
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
clearProperty	TokenNameIdentifier	 clear Property
(	TokenNameLPAREN	
PROP_KEY1	TokenNameIdentifier	 PROP  KE Y1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
