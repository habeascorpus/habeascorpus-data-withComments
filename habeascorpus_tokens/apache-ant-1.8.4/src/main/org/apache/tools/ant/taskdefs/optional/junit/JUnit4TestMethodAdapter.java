/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
JUnit4TestAdapterCache	TokenNameIdentifier	 J Unit4 Test Adapter Cache
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestResult	TokenNameIdentifier	 Test Result
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
Request	TokenNameIdentifier	 Request
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
Runner	TokenNameIdentifier	 Runner
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
manipulation	TokenNameIdentifier	 manipulation
.	TokenNameDOT	
Filter	TokenNameIdentifier	 Filter
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
notification	TokenNameIdentifier	 notification
.	TokenNameDOT	
RunListener	TokenNameIdentifier	 Run Listener
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
RunNotifier	TokenNameIdentifier	 Run Notifier
;	TokenNameSEMICOLON	
/** * Adapter between JUnit 3.8.x API and JUnit 4.x API for execution of tests * and listening of events (test start, test finish, test failure). * The constructor is passed a JUnit 4 test class and a list of name of methods * in it that should be executed. Method {@link #run run(TestResult)} executes * the given JUnit-4-style test methods and notifies the given {@code TestResult} * object using its old (JUnit 3.8.x style) API. * * @author Marian Petras */	TokenNameCOMMENT_JAVADOC	 Adapter between JUnit 3.8.x API and JUnit 4.x API for execution of tests and listening of events (test start, test finish, test failure). The constructor is passed a JUnit 4 test class and a list of name of methods in it that should be executed. Method {@link #run run(TestResult)} executes the given JUnit-4-style test methods and notifies the given {@code TestResult} object using its old (JUnit 3.8.x style) API. * @author Marian Petras 
public	TokenNamepublic	
class	TokenNameclass	
JUnit4TestMethodAdapter	TokenNameIdentifier	 J Unit4 Test Method Adapter
implements	TokenNameimplements	
Test	TokenNameIdentifier	 Test
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
testClass	TokenNameIdentifier	 test Class
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methodNames	TokenNameIdentifier	 method Names
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Runner	TokenNameIdentifier	 Runner
runner	TokenNameIdentifier	 runner
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Cache	TokenNameIdentifier	 Cache
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
/** * Creates a new adapter for the given class and a method within the class. * * @param testClass test class containing the method to be executed * @param methodNames names of the test methods that are to be executed * @exception java.lang.IllegalArgumentException * if any of the arguments is {@code null} * or if any of the given method names is {@code null} or empty */	TokenNameCOMMENT_JAVADOC	 Creates a new adapter for the given class and a method within the class. * @param testClass test class containing the method to be executed @param methodNames names of the test methods that are to be executed @exception java.lang.IllegalArgumentException if any of the arguments is {@code null} or if any of the given method names is {@code null} or empty 
public	TokenNamepublic	
JUnit4TestMethodAdapter	TokenNameIdentifier	 J Unit4 Test Method Adapter
(	TokenNameLPAREN	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
testClass	TokenNameIdentifier	 test Class
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methodNames	TokenNameIdentifier	 method Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
testClass	TokenNameIdentifier	 test Class
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"testClass is <null>"	TokenNameStringLiteral	testClass is <null>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
methodNames	TokenNameIdentifier	 method Names
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"methodNames is <null>"	TokenNameStringLiteral	methodNames is <null>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
methodNames	TokenNameIdentifier	 method Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"method name #"	TokenNameStringLiteral	method name #
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" is <null>"	TokenNameStringLiteral	 is <null>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
methodNames	TokenNameIdentifier	 method Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"method name #"	TokenNameStringLiteral	method name #
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" is empty"	TokenNameStringLiteral	 is empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
testClass	TokenNameIdentifier	 test Class
=	TokenNameEQUAL	
testClass	TokenNameIdentifier	 test Class
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
methodNames	TokenNameIdentifier	 method Names
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
Cache	TokenNameIdentifier	 Cache
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
// Warning: If 'testClass' is an old-style (pre-JUnit-4) class, 	TokenNameCOMMENT_LINE	Warning: If 'testClass' is an old-style (pre-JUnit-4) class, 
// then all its test methods will be executed by the returned runner! 	TokenNameCOMMENT_LINE	then all its test methods will be executed by the returned runner! 
Request	TokenNameIdentifier	 Request
request	TokenNameIdentifier	 request
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
request	TokenNameIdentifier	 request
=	TokenNameEQUAL	
Request	TokenNameIdentifier	 Request
.	TokenNameDOT	
method	TokenNameIdentifier	 method
(	TokenNameLPAREN	
testClass	TokenNameIdentifier	 test Class
,	TokenNameCOMMA	
methodNames	TokenNameIdentifier	 method Names
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
request	TokenNameIdentifier	 request
=	TokenNameEQUAL	
Request	TokenNameIdentifier	 Request
.	TokenNameDOT	
aClass	TokenNameIdentifier	 a Class
(	TokenNameLPAREN	
testClass	TokenNameIdentifier	 test Class
)	TokenNameRPAREN	
.	TokenNameDOT	
filterWith	TokenNameIdentifier	 filter With
(	TokenNameLPAREN	
new	TokenNamenew	
MultipleMethodsFilter	TokenNameIdentifier	 Multiple Methods Filter
(	TokenNameLPAREN	
testClass	TokenNameIdentifier	 test Class
,	TokenNameCOMMA	
methodNames	TokenNameIdentifier	 method Names
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
runner	TokenNameIdentifier	 runner
=	TokenNameEQUAL	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getRunner	TokenNameIdentifier	 get Runner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
countTestCases	TokenNameIdentifier	 count Test Cases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
testCount	TokenNameIdentifier	 test Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Description	TokenNameIdentifier	 Description
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
/*<Test>*/	TokenNameCOMMENT_BLOCK	<Test>
getTests	TokenNameIdentifier	 get Tests
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
asTestList	TokenNameIdentifier	 as Test List
(	TokenNameLPAREN	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Class	TokenNameIdentifier	 Class
getTestClass	TokenNameIdentifier	 get Test Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
testClass	TokenNameIdentifier	 test Class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
final	TokenNamefinal	
TestResult	TokenNameIdentifier	 Test Result
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getNotifier	TokenNameIdentifier	 get Notifier
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
testClassName	TokenNameIdentifier	 test Class Name
=	TokenNameEQUAL	
testClass	TokenNameIdentifier	 test Class
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
testClassName	TokenNameIdentifier	 test Class Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
12	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methodNames	TokenNameIdentifier	 method Names
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methodNames	TokenNameIdentifier	 method Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
MultipleMethodsFilter	TokenNameIdentifier	 Multiple Methods Filter
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Description	TokenNameIdentifier	 Description
methodsListDescription	TokenNameIdentifier	 methods List Description
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
testClass	TokenNameIdentifier	 test Class
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methodNames	TokenNameIdentifier	 method Names
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MultipleMethodsFilter	TokenNameIdentifier	 Multiple Methods Filter
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
testClass	TokenNameIdentifier	 test Class
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methodNames	TokenNameIdentifier	 method Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
testClass	TokenNameIdentifier	 test Class
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"testClass is <null>"	TokenNameStringLiteral	testClass is <null>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
methodNames	TokenNameIdentifier	 method Names
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"methodNames is <null>"	TokenNameStringLiteral	methodNames is <null>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
methodsListDescription	TokenNameIdentifier	 methods List Description
=	TokenNameEQUAL	
Description	TokenNameIdentifier	 Description
.	TokenNameDOT	
createSuiteDescription	TokenNameIdentifier	 create Suite Description
(	TokenNameLPAREN	
testClass	TokenNameIdentifier	 test Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
methodsListDescription	TokenNameIdentifier	 methods List Description
.	TokenNameDOT	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
Description	TokenNameIdentifier	 Description
.	TokenNameDOT	
createTestDescription	TokenNameIdentifier	 create Test Description
(	TokenNameLPAREN	
testClass	TokenNameIdentifier	 test Class
,	TokenNameCOMMA	
methodNames	TokenNameIdentifier	 method Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
testClass	TokenNameIdentifier	 test Class
=	TokenNameEQUAL	
testClass	TokenNameIdentifier	 test Class
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
methodNames	TokenNameIdentifier	 method Names
=	TokenNameEQUAL	
methodNames	TokenNameIdentifier	 method Names
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldRun	TokenNameIdentifier	 should Run
(	TokenNameLPAREN	
Description	TokenNameIdentifier	 Description
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
description	TokenNameIdentifier	 description
.	TokenNameDOT	
isTest	TokenNameIdentifier	 is Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
/*<Description>*/	TokenNameCOMMENT_BLOCK	<Description>
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
methodsListDescription	TokenNameIdentifier	 methods List Description
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Description	TokenNameIdentifier	 Description
methodDescription	TokenNameIdentifier	 method Description
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Description	TokenNameIdentifier	 Description
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
methodDescription	TokenNameIdentifier	 method Description
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
/*<Description>*/	TokenNameCOMMENT_BLOCK	<Description>
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
description	TokenNameIdentifier	 description
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Description	TokenNameIdentifier	 Description
each	TokenNameIdentifier	 each
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Description	TokenNameIdentifier	 Description
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shouldRun	TokenNameIdentifier	 should Run
(	TokenNameLPAREN	
each	TokenNameIdentifier	 each
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
describe	TokenNameIdentifier	 describe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
40	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"No methods"	TokenNameStringLiteral	No methods
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
"Method"	TokenNameStringLiteral	Method
:	TokenNameCOLON	
"Methods"	TokenNameStringLiteral	Methods
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methodNames	TokenNameIdentifier	 method Names
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methodNames	TokenNameIdentifier	 method Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
testClass	TokenNameIdentifier	 test Class
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Effectively a copy of {@code JUnit4TestAdapterCache}, except that its * method {@code getNotifier()} does not require an argument * of type {@code JUnit4TestAdapter}. */	TokenNameCOMMENT_JAVADOC	 Effectively a copy of {@code JUnit4TestAdapterCache}, except that its method {@code getNotifier()} does not require an argument of type {@code JUnit4TestAdapter}. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Cache	TokenNameIdentifier	 Cache
extends	TokenNameextends	
JUnit4TestAdapterCache	TokenNameIdentifier	 J Unit4 Test Adapter Cache
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
8454901854293461610L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Cache	TokenNameIdentifier	 Cache
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
Cache	TokenNameIdentifier	 Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
JUnit4TestAdapterCache	TokenNameIdentifier	 J Unit4 Test Adapter Cache
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RunNotifier	TokenNameIdentifier	 Run Notifier
getNotifier	TokenNameIdentifier	 get Notifier
(	TokenNameLPAREN	
final	TokenNamefinal	
TestResult	TokenNameIdentifier	 Test Result
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RunNotifier	TokenNameIdentifier	 Run Notifier
notifier	TokenNameIdentifier	 notifier
=	TokenNameEQUAL	
new	TokenNamenew	
RunNotifier	TokenNameIdentifier	 Run Notifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
notifier	TokenNameIdentifier	 notifier
.	TokenNameDOT	
addListener	TokenNameIdentifier	 add Listener
(	TokenNameLPAREN	
new	TokenNamenew	
RunListener	TokenNameIdentifier	 Run Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFailure	TokenNameIdentifier	 test Failure
(	TokenNameLPAREN	
Failure	TokenNameIdentifier	 Failure
failure	TokenNameIdentifier	 failure
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addError	TokenNameIdentifier	 add Error
(	TokenNameLPAREN	
asTest	TokenNameIdentifier	 as Test
(	TokenNameLPAREN	
failure	TokenNameIdentifier	 failure
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
failure	TokenNameIdentifier	 failure
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFinished	TokenNameIdentifier	 test Finished
(	TokenNameLPAREN	
Description	TokenNameIdentifier	 Description
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
endTest	TokenNameIdentifier	 end Test
(	TokenNameLPAREN	
asTest	TokenNameIdentifier	 as Test
(	TokenNameLPAREN	
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testStarted	TokenNameIdentifier	 test Started
(	TokenNameLPAREN	
Description	TokenNameIdentifier	 Description
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
startTest	TokenNameIdentifier	 start Test
(	TokenNameLPAREN	
asTest	TokenNameIdentifier	 as Test
(	TokenNameLPAREN	
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
notifier	TokenNameIdentifier	 notifier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
