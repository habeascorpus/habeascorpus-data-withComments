package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
TestVirtualMethod	TokenNameIdentifier	 Test Virtual Method
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
TestVirtualMethod	TokenNameIdentifier	 Test Virtual Method
>	TokenNameGREATER	
publicTestMethod	TokenNameIdentifier	 public Test Method
=	TokenNameEQUAL	
new	TokenNamenew	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
TestVirtualMethod	TokenNameIdentifier	 Test Virtual Method
>	TokenNameGREATER	
(	TokenNameLPAREN	
TestVirtualMethod	TokenNameIdentifier	 Test Virtual Method
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"publicTest"	TokenNameStringLiteral	publicTest
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
TestVirtualMethod	TokenNameIdentifier	 Test Virtual Method
>	TokenNameGREATER	
protectedTestMethod	TokenNameIdentifier	 protected Test Method
=	TokenNameEQUAL	
new	TokenNamenew	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
TestVirtualMethod	TokenNameIdentifier	 Test Virtual Method
>	TokenNameGREATER	
(	TokenNameLPAREN	
TestVirtualMethod	TokenNameIdentifier	 Test Virtual Method
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"protectedTest"	TokenNameStringLiteral	protectedTest
,	TokenNameCOMMA	
int	TokenNameint	
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
publicTest	TokenNameIdentifier	 public Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
protectedTest	TokenNameIdentifier	 protected Test
(	TokenNameLPAREN	
int	TokenNameint	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
TestClass1	TokenNameIdentifier	 Test Class1
extends	TokenNameextends	
TestVirtualMethod	TokenNameIdentifier	 Test Virtual Method
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
publicTest	TokenNameIdentifier	 public Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
protectedTest	TokenNameIdentifier	 protected Test
(	TokenNameLPAREN	
int	TokenNameint	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
TestClass2	TokenNameIdentifier	 Test Class2
extends	TokenNameextends	
TestClass1	TokenNameIdentifier	 Test Class1
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
// make it public here 	TokenNameCOMMENT_LINE	make it public here 
public	TokenNamepublic	
void	TokenNamevoid	
protectedTest	TokenNameIdentifier	 protected Test
(	TokenNameLPAREN	
int	TokenNameint	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
TestClass3	TokenNameIdentifier	 Test Class3
extends	TokenNameextends	
TestClass2	TokenNameIdentifier	 Test Class2
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
publicTest	TokenNameIdentifier	 public Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
TestClass4	TokenNameIdentifier	 Test Class4
extends	TokenNameextends	
TestVirtualMethod	TokenNameIdentifier	 Test Virtual Method
{	TokenNameLBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
TestClass5	TokenNameIdentifier	 Test Class5
extends	TokenNameextends	
TestClass4	TokenNameIdentifier	 Test Class4
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGeneral	TokenNameIdentifier	 test General
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
publicTestMethod	TokenNameIdentifier	 public Test Method
.	TokenNameDOT	
getImplementationDistance	TokenNameIdentifier	 get Implementation Distance
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
publicTestMethod	TokenNameIdentifier	 public Test Method
.	TokenNameDOT	
getImplementationDistance	TokenNameIdentifier	 get Implementation Distance
(	TokenNameLPAREN	
TestClass1	TokenNameIdentifier	 Test Class1
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
publicTestMethod	TokenNameIdentifier	 public Test Method
.	TokenNameDOT	
getImplementationDistance	TokenNameIdentifier	 get Implementation Distance
(	TokenNameLPAREN	
TestClass2	TokenNameIdentifier	 Test Class2
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
publicTestMethod	TokenNameIdentifier	 public Test Method
.	TokenNameDOT	
getImplementationDistance	TokenNameIdentifier	 get Implementation Distance
(	TokenNameLPAREN	
TestClass3	TokenNameIdentifier	 Test Class3
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
publicTestMethod	TokenNameIdentifier	 public Test Method
.	TokenNameDOT	
isOverriddenAsOf	TokenNameIdentifier	 is Overridden As Of
(	TokenNameLPAREN	
TestClass4	TokenNameIdentifier	 Test Class4
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
publicTestMethod	TokenNameIdentifier	 public Test Method
.	TokenNameDOT	
isOverriddenAsOf	TokenNameIdentifier	 is Overridden As Of
(	TokenNameLPAREN	
TestClass5	TokenNameIdentifier	 Test Class5
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
protectedTestMethod	TokenNameIdentifier	 protected Test Method
.	TokenNameDOT	
getImplementationDistance	TokenNameIdentifier	 get Implementation Distance
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
protectedTestMethod	TokenNameIdentifier	 protected Test Method
.	TokenNameDOT	
getImplementationDistance	TokenNameIdentifier	 get Implementation Distance
(	TokenNameLPAREN	
TestClass1	TokenNameIdentifier	 Test Class1
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
protectedTestMethod	TokenNameIdentifier	 protected Test Method
.	TokenNameDOT	
getImplementationDistance	TokenNameIdentifier	 get Implementation Distance
(	TokenNameLPAREN	
TestClass2	TokenNameIdentifier	 Test Class2
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
protectedTestMethod	TokenNameIdentifier	 protected Test Method
.	TokenNameDOT	
getImplementationDistance	TokenNameIdentifier	 get Implementation Distance
(	TokenNameLPAREN	
TestClass3	TokenNameIdentifier	 Test Class3
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
protectedTestMethod	TokenNameIdentifier	 protected Test Method
.	TokenNameDOT	
isOverriddenAsOf	TokenNameIdentifier	 is Overridden As Of
(	TokenNameLPAREN	
TestClass4	TokenNameIdentifier	 Test Class4
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
protectedTestMethod	TokenNameIdentifier	 protected Test Method
.	TokenNameDOT	
isOverriddenAsOf	TokenNameIdentifier	 is Overridden As Of
(	TokenNameLPAREN	
TestClass5	TokenNameIdentifier	 Test Class5
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
VirtualMethod	TokenNameIdentifier	 Virtual Method
.	TokenNameDOT	
compareImplementationDistance	TokenNameIdentifier	 compare Implementation Distance
(	TokenNameLPAREN	
TestClass3	TokenNameIdentifier	 Test Class3
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
publicTestMethod	TokenNameIdentifier	 public Test Method
,	TokenNameCOMMA	
protectedTestMethod	TokenNameIdentifier	 protected Test Method
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
VirtualMethod	TokenNameIdentifier	 Virtual Method
.	TokenNameDOT	
compareImplementationDistance	TokenNameIdentifier	 compare Implementation Distance
(	TokenNameLPAREN	
TestClass5	TokenNameIdentifier	 Test Class5
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
publicTestMethod	TokenNameIdentifier	 public Test Method
,	TokenNameCOMMA	
protectedTestMethod	TokenNameIdentifier	 protected Test Method
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
void	TokenNamevoid	
testExceptions	TokenNameIdentifier	 test Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// cast to Class to remove generics: 	TokenNameCOMMENT_LINE	cast to Class to remove generics: 
publicTestMethod	TokenNameIdentifier	 public Test Method
.	TokenNameDOT	
getImplementationDistance	TokenNameIdentifier	 get Implementation Distance
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
)	TokenNameRPAREN	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"LuceneTestCase is not a subclass and can never override publicTest(String)"	TokenNameStringLiteral	LuceneTestCase is not a subclass and can never override publicTest(String)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// pass 	TokenNameCOMMENT_LINE	pass 
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
new	TokenNamenew	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
TestVirtualMethod	TokenNameIdentifier	 Test Virtual Method
>	TokenNameGREATER	
(	TokenNameLPAREN	
TestVirtualMethod	TokenNameIdentifier	 Test Virtual Method
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"bogus"	TokenNameStringLiteral	bogus
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Method bogus() does not exist, so IAE should be thrown"	TokenNameStringLiteral	Method bogus() does not exist, so IAE should be thrown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// pass 	TokenNameCOMMENT_LINE	pass 
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
new	TokenNamenew	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
TestClass2	TokenNameIdentifier	 Test Class2
>	TokenNameGREATER	
(	TokenNameLPAREN	
TestClass2	TokenNameIdentifier	 Test Class2
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"publicTest"	TokenNameStringLiteral	publicTest
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Method publicTest(String) is not declared in TestClass2, so IAE should be thrown"	TokenNameStringLiteral	Method publicTest(String) is not declared in TestClass2, so IAE should be thrown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// pass 	TokenNameCOMMENT_LINE	pass 
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// try to create a second instance of the same baseClass / method combination 	TokenNameCOMMENT_LINE	try to create a second instance of the same baseClass / method combination 
new	TokenNamenew	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
TestVirtualMethod	TokenNameIdentifier	 Test Virtual Method
>	TokenNameGREATER	
(	TokenNameLPAREN	
TestVirtualMethod	TokenNameIdentifier	 Test Virtual Method
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"publicTest"	TokenNameStringLiteral	publicTest
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Violating singleton status succeeded"	TokenNameStringLiteral	Violating singleton status succeeded
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// pass 	TokenNameCOMMENT_LINE	pass 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
