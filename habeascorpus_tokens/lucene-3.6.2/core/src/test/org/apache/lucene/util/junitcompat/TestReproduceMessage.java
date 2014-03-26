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
Arrays	TokenNameIdentifier	 Arrays
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
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
After	TokenNameIdentifier	 After
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
AfterClass	TokenNameIdentifier	 After Class
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
Before	TokenNameIdentifier	 Before
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
BeforeClass	TokenNameIdentifier	 Before Class
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Ignore	TokenNameIdentifier	 Ignore
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Rule	TokenNameIdentifier	 Rule
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
Description	TokenNameIdentifier	 Description
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
runners	TokenNameIdentifier	 runners
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Statement	TokenNameIdentifier	 Statement
;	TokenNameSEMICOLON	
/** * Test reproduce message is right. */	TokenNameCOMMENT_JAVADOC	 Test reproduce message is right. 
public	TokenNamepublic	
class	TokenNameclass	
TestReproduceMessage	TokenNameIdentifier	 Test Reproduce Message
extends	TokenNameextends	
WithNestedTests	TokenNameIdentifier	 With Nested Tests
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
SorePoint	TokenNameIdentifier	 Sore Point
where	TokenNameIdentifier	 where
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
SoreType	TokenNameIdentifier	 Sore Type
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Nested	TokenNameIdentifier	 Nested
extends	TokenNameextends	
AbstractNestedTest	TokenNameIdentifier	 Abstract Nested Test
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
if	TokenNameif	
(	TokenNameLPAREN	
isRunningNested	TokenNameIdentifier	 is Running Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
triggerOn	TokenNameIdentifier	 trigger On
(	TokenNameLPAREN	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
BEFORE_CLASS	TokenNameIdentifier	 BEFORE  CLASS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Rule	TokenNameIdentifier	 Rule
public	TokenNamepublic	
TestRule	TokenNameIdentifier	 Test Rule
rule	TokenNameIdentifier	 rule
=	TokenNameEQUAL	
new	TokenNamenew	
TestRule	TokenNameIdentifier	 Test Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// @Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
Statement	TokenNameIdentifier	 Statement
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
final	TokenNamefinal	
Statement	TokenNameIdentifier	 Statement
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
Description	TokenNameIdentifier	 Description
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Statement	TokenNameIdentifier	 Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isRunningNested	TokenNameIdentifier	 is Running Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
triggerOn	TokenNameIdentifier	 trigger On
(	TokenNameLPAREN	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
RULE	TokenNameIdentifier	 RULE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Class initializer block/ default constructor. */	TokenNameCOMMENT_JAVADOC	 Class initializer block/ default constructor. 
public	TokenNamepublic	
Nested	TokenNameIdentifier	 Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
triggerOn	TokenNameIdentifier	 trigger On
(	TokenNameLPAREN	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
INITIALIZER	TokenNameIdentifier	 INITIALIZER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Before	TokenNameIdentifier	 Before
public	TokenNamepublic	
void	TokenNamevoid	
before	TokenNameIdentifier	 before
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isRunningNested	TokenNameIdentifier	 is Running Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
triggerOn	TokenNameIdentifier	 trigger On
(	TokenNameLPAREN	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
BEFORE	TokenNameIdentifier	 BEFORE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
test	TokenNameIdentifier	 test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
triggerOn	TokenNameIdentifier	 trigger On
(	TokenNameLPAREN	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
TEST	TokenNameIdentifier	 TEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
After	TokenNameIdentifier	 After
public	TokenNamepublic	
void	TokenNamevoid	
after	TokenNameIdentifier	 after
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isRunningNested	TokenNameIdentifier	 is Running Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
triggerOn	TokenNameIdentifier	 trigger On
(	TokenNameLPAREN	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
AFTER	TokenNameIdentifier	 AFTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
AfterClass	TokenNameIdentifier	 After Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
afterClass	TokenNameIdentifier	 after Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isRunningNested	TokenNameIdentifier	 is Running Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
triggerOn	TokenNameIdentifier	 trigger On
(	TokenNameLPAREN	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
AFTER_CLASS	TokenNameIdentifier	 AFTER  CLASS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
triggerOn	TokenNameIdentifier	 trigger On
(	TokenNameLPAREN	
SorePoint	TokenNameIdentifier	 Sore Point
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
==	TokenNameEQUAL_EQUAL	
where	TokenNameIdentifier	 where
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ASSUMPTION	TokenNameIdentifier	 ASSUMPTION
:	TokenNameCOLON	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
.	TokenNameDOT	
assumeTrue	TokenNameIdentifier	 assume True
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"unreachable"	TokenNameStringLiteral	unreachable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ERROR	TokenNameIdentifier	 ERROR
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
FAILURE	TokenNameIdentifier	 FAILURE
:	TokenNameCOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"unreachable"	TokenNameStringLiteral	unreachable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * ASSUMPTIONS. */	TokenNameCOMMENT_BLOCK	 ASSUMPTIONS. 
public	TokenNamepublic	
TestReproduceMessage	TokenNameIdentifier	 Test Reproduce Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
@	TokenNameAT	
Ignore	TokenNameIdentifier	 Ignore
public	TokenNamepublic	
void	TokenNamevoid	
testAssumeBeforeClass	TokenNameIdentifier	 test Assume Before Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
ASSUMPTION	TokenNameIdentifier	 ASSUMPTION
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
BEFORE_CLASS	TokenNameIdentifier	 BEFORE  CLASS
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: Assume failed in"	TokenNameStringLiteral	NOTE: Assume failed in
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
@	TokenNameAT	
Ignore	TokenNameIdentifier	 Ignore
public	TokenNamepublic	
void	TokenNamevoid	
testAssumeInitializer	TokenNameIdentifier	 test Assume Initializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
ASSUMPTION	TokenNameIdentifier	 ASSUMPTION
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
INITIALIZER	TokenNameIdentifier	 INITIALIZER
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: Assume failed in"	TokenNameStringLiteral	NOTE: Assume failed in
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testAssumeRule	TokenNameIdentifier	 test Assume Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
ASSUMPTION	TokenNameIdentifier	 ASSUMPTION
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
RULE	TokenNameIdentifier	 RULE
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: Assume failed in"	TokenNameStringLiteral	NOTE: Assume failed in
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testAssumeBefore	TokenNameIdentifier	 test Assume Before
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
ASSUMPTION	TokenNameIdentifier	 ASSUMPTION
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
BEFORE	TokenNameIdentifier	 BEFORE
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: Assume failed in"	TokenNameStringLiteral	NOTE: Assume failed in
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testAssumeTest	TokenNameIdentifier	 test Assume Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
ASSUMPTION	TokenNameIdentifier	 ASSUMPTION
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
TEST	TokenNameIdentifier	 TEST
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: Assume failed in"	TokenNameStringLiteral	NOTE: Assume failed in
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testAssumeAfter	TokenNameIdentifier	 test Assume After
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
ASSUMPTION	TokenNameIdentifier	 ASSUMPTION
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
AFTER	TokenNameIdentifier	 AFTER
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: Assume failed in"	TokenNameStringLiteral	NOTE: Assume failed in
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
@	TokenNameAT	
Ignore	TokenNameIdentifier	 Ignore
public	TokenNamepublic	
void	TokenNamevoid	
testAssumeAfterClass	TokenNameIdentifier	 test Assume After Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
ASSUMPTION	TokenNameIdentifier	 ASSUMPTION
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
AFTER_CLASS	TokenNameIdentifier	 AFTER  CLASS
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: Assume failed in"	TokenNameStringLiteral	NOTE: Assume failed in
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * FAILURES */	TokenNameCOMMENT_BLOCK	 FAILURES 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
@	TokenNameAT	
Ignore	TokenNameIdentifier	 Ignore
public	TokenNamepublic	
void	TokenNamevoid	
testFailureBeforeClass	TokenNameIdentifier	 test Failure Before Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
FAILURE	TokenNameIdentifier	 FAILURE
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
BEFORE_CLASS	TokenNameIdentifier	 BEFORE  CLASS
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: reproduce with:"	TokenNameStringLiteral	NOTE: reproduce with:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
@	TokenNameAT	
Ignore	TokenNameIdentifier	 Ignore
public	TokenNamepublic	
void	TokenNamevoid	
testFailureInitializer	TokenNameIdentifier	 test Failure Initializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
FAILURE	TokenNameIdentifier	 FAILURE
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
INITIALIZER	TokenNameIdentifier	 INITIALIZER
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: reproduce with:"	TokenNameStringLiteral	NOTE: reproduce with:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testFailureRule	TokenNameIdentifier	 test Failure Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
FAILURE	TokenNameIdentifier	 FAILURE
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
RULE	TokenNameIdentifier	 RULE
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: reproduce with:"	TokenNameStringLiteral	NOTE: reproduce with:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\s"	TokenNameStringLiteral	\s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"-Dtestmethod=test"	TokenNameStringLiteral	-Dtestmethod=test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testFailureBefore	TokenNameIdentifier	 test Failure Before
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
FAILURE	TokenNameIdentifier	 FAILURE
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
BEFORE	TokenNameIdentifier	 BEFORE
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: reproduce with:"	TokenNameStringLiteral	NOTE: reproduce with:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\s"	TokenNameStringLiteral	\s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"-Dtestmethod=test"	TokenNameStringLiteral	-Dtestmethod=test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testFailureTest	TokenNameIdentifier	 test Failure Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
FAILURE	TokenNameIdentifier	 FAILURE
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
TEST	TokenNameIdentifier	 TEST
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: reproduce with:"	TokenNameStringLiteral	NOTE: reproduce with:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\s"	TokenNameStringLiteral	\s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"-Dtestmethod=test"	TokenNameStringLiteral	-Dtestmethod=test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testFailureAfter	TokenNameIdentifier	 test Failure After
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
FAILURE	TokenNameIdentifier	 FAILURE
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
AFTER	TokenNameIdentifier	 AFTER
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: reproduce with:"	TokenNameStringLiteral	NOTE: reproduce with:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\s"	TokenNameStringLiteral	\s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"-Dtestmethod=test"	TokenNameStringLiteral	-Dtestmethod=test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
@	TokenNameAT	
Ignore	TokenNameIdentifier	 Ignore
public	TokenNamepublic	
void	TokenNamevoid	
testFailureAfterClass	TokenNameIdentifier	 test Failure After Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
FAILURE	TokenNameIdentifier	 FAILURE
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
AFTER_CLASS	TokenNameIdentifier	 AFTER  CLASS
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: reproduce with:"	TokenNameStringLiteral	NOTE: reproduce with:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * ERRORS */	TokenNameCOMMENT_BLOCK	 ERRORS 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
@	TokenNameAT	
Ignore	TokenNameIdentifier	 Ignore
public	TokenNamepublic	
void	TokenNamevoid	
testErrorBeforeClass	TokenNameIdentifier	 test Error Before Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
BEFORE_CLASS	TokenNameIdentifier	 BEFORE  CLASS
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: reproduce with:"	TokenNameStringLiteral	NOTE: reproduce with:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
@	TokenNameAT	
Ignore	TokenNameIdentifier	 Ignore
public	TokenNamepublic	
void	TokenNamevoid	
testErrorInitializer	TokenNameIdentifier	 test Error Initializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
INITIALIZER	TokenNameIdentifier	 INITIALIZER
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: reproduce with:"	TokenNameStringLiteral	NOTE: reproduce with:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testErrorRule	TokenNameIdentifier	 test Error Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
RULE	TokenNameIdentifier	 RULE
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: reproduce with:"	TokenNameStringLiteral	NOTE: reproduce with:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\s"	TokenNameStringLiteral	\s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"-Dtestmethod=test"	TokenNameStringLiteral	-Dtestmethod=test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testErrorBefore	TokenNameIdentifier	 test Error Before
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
BEFORE	TokenNameIdentifier	 BEFORE
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: reproduce with:"	TokenNameStringLiteral	NOTE: reproduce with:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\s"	TokenNameStringLiteral	\s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"-Dtestmethod=test"	TokenNameStringLiteral	-Dtestmethod=test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testErrorTest	TokenNameIdentifier	 test Error Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
TEST	TokenNameIdentifier	 TEST
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: reproduce with:"	TokenNameStringLiteral	NOTE: reproduce with:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\s"	TokenNameStringLiteral	\s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"-Dtestmethod=test"	TokenNameStringLiteral	-Dtestmethod=test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testErrorAfter	TokenNameIdentifier	 test Error After
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
AFTER	TokenNameIdentifier	 AFTER
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: reproduce with:"	TokenNameStringLiteral	NOTE: reproduce with:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\s"	TokenNameStringLiteral	\s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"-Dtestmethod=test"	TokenNameStringLiteral	-Dtestmethod=test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
@	TokenNameAT	
Ignore	TokenNameIdentifier	 Ignore
public	TokenNamepublic	
void	TokenNamevoid	
testErrorAfterClass	TokenNameIdentifier	 test Error After Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SoreType	TokenNameIdentifier	 Sore Type
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
;	TokenNameSEMICOLON	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
SorePoint	TokenNameIdentifier	 Sore Point
.	TokenNameDOT	
AFTER_CLASS	TokenNameIdentifier	 AFTER  CLASS
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"NOTE: reproduce with:"	TokenNameStringLiteral	NOTE: reproduce with:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
runAndReturnSyserr	TokenNameIdentifier	 run And Return Syserr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
JUnitCore	TokenNameIdentifier	 J Unit Core
.	TokenNameDOT	
runClasses	TokenNameIdentifier	 run Classes
(	TokenNameLPAREN	
Nested	TokenNameIdentifier	 Nested
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
getSysErr	TokenNameIdentifier	 get Sys Err
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//super.prevSysErr.println("Type: " + type + ", point: " + where + " resulted in:\n" + err); 	TokenNameCOMMENT_LINE	super.prevSysErr.println("Type: " + type + ", point: " + where + " resulted in:\n" + err); 
//super.prevSysErr.println("---"); 	TokenNameCOMMENT_LINE	super.prevSysErr.println("---"); 
return	TokenNamereturn	
err	TokenNameIdentifier	 err
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
