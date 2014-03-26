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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
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
/** * Ensures proper functions of {@link LuceneTestCase#setUp()} * and {@link LuceneTestCase#tearDown()}. */	TokenNameCOMMENT_JAVADOC	 Ensures proper functions of {@link LuceneTestCase#setUp()} and {@link LuceneTestCase#tearDown()}. 
public	TokenNamepublic	
class	TokenNameclass	
TestSetupTeardownChaining	TokenNameIdentifier	 Test Setup Teardown Chaining
extends	TokenNameextends	
WithNestedTests	TokenNameIdentifier	 With Nested Tests
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
NestedSetupChain	TokenNameIdentifier	 Nested Setup Chain
extends	TokenNameextends	
AbstractNestedTest	TokenNameIdentifier	 Abstract Nested Test
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// missing call. 	TokenNameCOMMENT_LINE	missing call. 
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testMe	TokenNameIdentifier	 test Me
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
NestedTeardownChain	TokenNameIdentifier	 Nested Teardown Chain
extends	TokenNameextends	
AbstractNestedTest	TokenNameIdentifier	 Abstract Nested Test
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// missing call. 	TokenNameCOMMENT_LINE	missing call. 
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testMe	TokenNameIdentifier	 test Me
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
TestSetupTeardownChaining	TokenNameIdentifier	 Test Setup Teardown Chaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Verify super method calls on {@link LuceneTestCase#setUp()}. */	TokenNameCOMMENT_JAVADOC	 Verify super method calls on {@link LuceneTestCase#setUp()}. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testSetupChaining	TokenNameIdentifier	 test Setup Chaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Result	TokenNameIdentifier	 Result
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
JUnitCore	TokenNameIdentifier	 J Unit Core
.	TokenNameDOT	
runClasses	TokenNameIdentifier	 run Classes
(	TokenNameLPAREN	
NestedSetupChain	TokenNameIdentifier	 Nested Setup Chain
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
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFailureCount	TokenNameIdentifier	 get Failure Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Failure	TokenNameIdentifier	 Failure
failure	TokenNameIdentifier	 failure
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFailures	TokenNameIdentifier	 get Failures
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
failure	TokenNameIdentifier	 failure
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"One of the overrides of setUp does not propagate the call."	TokenNameStringLiteral	One of the overrides of setUp does not propagate the call.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Verify super method calls on {@link LuceneTestCase#tearDown()}. */	TokenNameCOMMENT_JAVADOC	 Verify super method calls on {@link LuceneTestCase#tearDown()}. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testTeardownChaining	TokenNameIdentifier	 test Teardown Chaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Result	TokenNameIdentifier	 Result
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
JUnitCore	TokenNameIdentifier	 J Unit Core
.	TokenNameDOT	
runClasses	TokenNameIdentifier	 run Classes
(	TokenNameLPAREN	
NestedTeardownChain	TokenNameIdentifier	 Nested Teardown Chain
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
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFailureCount	TokenNameIdentifier	 get Failure Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Failure	TokenNameIdentifier	 Failure
failure	TokenNameIdentifier	 failure
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFailures	TokenNameIdentifier	 get Failures
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
failure	TokenNameIdentifier	 failure
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"One of the overrides of tearDown does not propagate the call."	TokenNameStringLiteral	One of the overrides of tearDown does not propagate the call.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
