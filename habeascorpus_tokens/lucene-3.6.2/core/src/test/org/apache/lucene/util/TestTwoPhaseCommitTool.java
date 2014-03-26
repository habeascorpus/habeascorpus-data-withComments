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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
TwoPhaseCommitTool	TokenNameIdentifier	 Two Phase Commit Tool
.	TokenNameDOT	
TwoPhaseCommitWrapper	TokenNameIdentifier	 Two Phase Commit Wrapper
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestTwoPhaseCommitTool	TokenNameIdentifier	 Test Two Phase Commit Tool
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
TwoPhaseCommitImpl	TokenNameIdentifier	 Two Phase Commit Impl
implements	TokenNameimplements	
TwoPhaseCommit	TokenNameIdentifier	 Two Phase Commit
{	TokenNameLBRACE	
static	TokenNamestatic	
boolean	TokenNameboolean	
commitCalled	TokenNameIdentifier	 commit Called
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
failOnPrepare	TokenNameIdentifier	 fail On Prepare
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
failOnCommit	TokenNameIdentifier	 fail On Commit
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
failOnRollback	TokenNameIdentifier	 fail On Rollback
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
rollbackCalled	TokenNameIdentifier	 rollback Called
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
prepareCommitData	TokenNameIdentifier	 prepare Commit Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
commitData	TokenNameIdentifier	 commit Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TwoPhaseCommitImpl	TokenNameIdentifier	 Two Phase Commit Impl
(	TokenNameLPAREN	
boolean	TokenNameboolean	
failOnPrepare	TokenNameIdentifier	 fail On Prepare
,	TokenNameCOMMA	
boolean	TokenNameboolean	
failOnCommit	TokenNameIdentifier	 fail On Commit
,	TokenNameCOMMA	
boolean	TokenNameboolean	
failOnRollback	TokenNameIdentifier	 fail On Rollback
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
failOnPrepare	TokenNameIdentifier	 fail On Prepare
=	TokenNameEQUAL	
failOnPrepare	TokenNameIdentifier	 fail On Prepare
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
failOnCommit	TokenNameIdentifier	 fail On Commit
=	TokenNameEQUAL	
failOnCommit	TokenNameIdentifier	 fail On Commit
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
failOnRollback	TokenNameIdentifier	 fail On Rollback
=	TokenNameEQUAL	
failOnRollback	TokenNameIdentifier	 fail On Rollback
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
prepareCommit	TokenNameIdentifier	 prepare Commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
prepareCommit	TokenNameIdentifier	 prepare Commit
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
prepareCommit	TokenNameIdentifier	 prepare Commit
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
commitData	TokenNameIdentifier	 commit Data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
prepareCommitData	TokenNameIdentifier	 prepare Commit Data
=	TokenNameEQUAL	
commitData	TokenNameIdentifier	 commit Data
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"commit should not have been called before all prepareCommit were"	TokenNameStringLiteral	commit should not have been called before all prepareCommit were
,	TokenNameCOMMA	
commitCalled	TokenNameIdentifier	 commit Called
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
failOnPrepare	TokenNameIdentifier	 fail On Prepare
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"failOnPrepare"	TokenNameStringLiteral	failOnPrepare
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
commitData	TokenNameIdentifier	 commit Data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
commitData	TokenNameIdentifier	 commit Data
=	TokenNameEQUAL	
commitData	TokenNameIdentifier	 commit Data
;	TokenNameSEMICOLON	
commitCalled	TokenNameIdentifier	 commit Called
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
failOnCommit	TokenNameIdentifier	 fail On Commit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"failOnCommit"	TokenNameStringLiteral	failOnCommit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
rollback	TokenNameIdentifier	 rollback
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
rollbackCalled	TokenNameIdentifier	 rollback Called
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
failOnRollback	TokenNameIdentifier	 fail On Rollback
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"failOnRollback"	TokenNameStringLiteral	failOnRollback
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TwoPhaseCommitImpl	TokenNameIdentifier	 Two Phase Commit Impl
.	TokenNameDOT	
commitCalled	TokenNameIdentifier	 commit Called
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// reset count before every test 	TokenNameCOMMENT_LINE	reset count before every test 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPrepareThenCommit	TokenNameIdentifier	 test Prepare Then Commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// tests that prepareCommit() is called on all objects before commit() 	TokenNameCOMMENT_LINE	tests that prepareCommit() is called on all objects before commit() 
TwoPhaseCommitImpl	TokenNameIdentifier	 Two Phase Commit Impl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
objects	TokenNameIdentifier	 objects
=	TokenNameEQUAL	
new	TokenNamenew	
TwoPhaseCommitImpl	TokenNameIdentifier	 Two Phase Commit Impl
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
objects	TokenNameIdentifier	 objects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
TwoPhaseCommitImpl	TokenNameIdentifier	 Two Phase Commit Impl
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// following call will fail if commit() is called before all prepare() were 	TokenNameCOMMENT_LINE	following call will fail if commit() is called before all prepare() were 
TwoPhaseCommitTool	TokenNameIdentifier	 Two Phase Commit Tool
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRollback	TokenNameIdentifier	 test Rollback
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// tests that rollback is called if failure occurs at any stage 	TokenNameCOMMENT_LINE	tests that rollback is called if failure occurs at any stage 
int	TokenNameint	
numObjects	TokenNameIdentifier	 num Objects
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// between [3, 10] 	TokenNameCOMMENT_LINE	between [3, 10] 
TwoPhaseCommitImpl	TokenNameIdentifier	 Two Phase Commit Impl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
objects	TokenNameIdentifier	 objects
=	TokenNameEQUAL	
new	TokenNamenew	
TwoPhaseCommitImpl	TokenNameIdentifier	 Two Phase Commit Impl
[	TokenNameLBRACKET	
numObjects	TokenNameIdentifier	 num Objects
]	TokenNameRBRACKET	
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
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
failOnPrepare	TokenNameIdentifier	 fail On Prepare
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we should not hit failures on commit usually 	TokenNameCOMMENT_LINE	we should not hit failures on commit usually 
boolean	TokenNameboolean	
failOnCommit	TokenNameIdentifier	 fail On Commit
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextDouble	TokenNameIdentifier	 next Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0.05	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
railOnRollback	TokenNameIdentifier	 rail On Rollback
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
objects	TokenNameIdentifier	 objects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
TwoPhaseCommitImpl	TokenNameIdentifier	 Two Phase Commit Impl
(	TokenNameLPAREN	
failOnPrepare	TokenNameIdentifier	 fail On Prepare
,	TokenNameCOMMA	
failOnCommit	TokenNameIdentifier	 fail On Commit
,	TokenNameCOMMA	
railOnRollback	TokenNameIdentifier	 rail On Rollback
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
anyFailure	TokenNameIdentifier	 any Failure
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
TwoPhaseCommitTool	TokenNameIdentifier	 Two Phase Commit Tool
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
anyFailure	TokenNameIdentifier	 any Failure
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
anyFailure	TokenNameIdentifier	 any Failure
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if any failure happened, ensure that rollback was called on all. 	TokenNameCOMMENT_LINE	if any failure happened, ensure that rollback was called on all. 
for	TokenNamefor	
(	TokenNameLPAREN	
TwoPhaseCommitImpl	TokenNameIdentifier	 Two Phase Commit Impl
tpc	TokenNameIdentifier	 tpc
:	TokenNameCOLON	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"rollback was not called while a failure occurred during the 2-phase commit"	TokenNameStringLiteral	rollback was not called while a failure occurred during the 2-phase commit
,	TokenNameCOMMA	
tpc	TokenNameIdentifier	 tpc
.	TokenNameDOT	
rollbackCalled	TokenNameIdentifier	 rollback Called
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWrapper	TokenNameIdentifier	 test Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// tests that TwoPhaseCommitWrapper delegates prepare/commit w/ commitData 	TokenNameCOMMENT_LINE	tests that TwoPhaseCommitWrapper delegates prepare/commit w/ commitData 
TwoPhaseCommitImpl	TokenNameIdentifier	 Two Phase Commit Impl
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
new	TokenNamenew	
TwoPhaseCommitImpl	TokenNameIdentifier	 Two Phase Commit Impl
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
commitData	TokenNameIdentifier	 commit Data
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TwoPhaseCommitWrapper	TokenNameIdentifier	 Two Phase Commit Wrapper
wrapper	TokenNameIdentifier	 wrapper
=	TokenNameEQUAL	
new	TokenNamenew	
TwoPhaseCommitWrapper	TokenNameIdentifier	 Two Phase Commit Wrapper
(	TokenNameLPAREN	
impl	TokenNameIdentifier	 impl
,	TokenNameCOMMA	
commitData	TokenNameIdentifier	 commit Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wrapper	TokenNameIdentifier	 wrapper
.	TokenNameDOT	
prepareCommit	TokenNameIdentifier	 prepare Commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
commitData	TokenNameIdentifier	 commit Data
,	TokenNameCOMMA	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
prepareCommitData	TokenNameIdentifier	 prepare Commit Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// wrapper should ignore passed commitData 	TokenNameCOMMENT_LINE	wrapper should ignore passed commitData 
wrapper	TokenNameIdentifier	 wrapper
.	TokenNameDOT	
prepareCommit	TokenNameIdentifier	 prepare Commit
(	TokenNameLPAREN	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
commitData	TokenNameIdentifier	 commit Data
,	TokenNameCOMMA	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
prepareCommitData	TokenNameIdentifier	 prepare Commit Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wrapper	TokenNameIdentifier	 wrapper
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
commitData	TokenNameIdentifier	 commit Data
,	TokenNameCOMMA	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
commitData	TokenNameIdentifier	 commit Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// wrapper should ignore passed commitData 	TokenNameCOMMENT_LINE	wrapper should ignore passed commitData 
wrapper	TokenNameIdentifier	 wrapper
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
commitData	TokenNameIdentifier	 commit Data
,	TokenNameCOMMA	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
commitData	TokenNameIdentifier	 commit Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNullTPCs	TokenNameIdentifier	 test Null TP Cs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
numObjects	TokenNameIdentifier	 num Objects
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// between [3, 6] 	TokenNameCOMMENT_LINE	between [3, 6] 
TwoPhaseCommit	TokenNameIdentifier	 Two Phase Commit
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tpcs	TokenNameIdentifier	 tpcs
=	TokenNameEQUAL	
new	TokenNamenew	
TwoPhaseCommit	TokenNameIdentifier	 Two Phase Commit
[	TokenNameLBRACKET	
numObjects	TokenNameIdentifier	 num Objects
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
setNull	TokenNameIdentifier	 set Null
=	TokenNameEQUAL	
false	TokenNamefalse	
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
tpcs	TokenNameIdentifier	 tpcs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isNull	TokenNameIdentifier	 is Null
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextDouble	TokenNameIdentifier	 next Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0.3	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isNull	TokenNameIdentifier	 is Null
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setNull	TokenNameIdentifier	 set Null
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
tpcs	TokenNameIdentifier	 tpcs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tpcs	TokenNameIdentifier	 tpcs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
TwoPhaseCommitImpl	TokenNameIdentifier	 Two Phase Commit Impl
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
setNull	TokenNameIdentifier	 set Null
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// none of the TPCs were picked to be null, pick one at random 	TokenNameCOMMENT_LINE	none of the TPCs were picked to be null, pick one at random 
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
numObjects	TokenNameIdentifier	 num Objects
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tpcs	TokenNameIdentifier	 tpcs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// following call would fail if TPCTool won't handle null TPCs properly 	TokenNameCOMMENT_LINE	following call would fail if TPCTool won't handle null TPCs properly 
TwoPhaseCommitTool	TokenNameIdentifier	 Two Phase Commit Tool
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
tpcs	TokenNameIdentifier	 tpcs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
