package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
alt	TokenNameIdentifier	 alt
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
BenchmarkTestCase	TokenNameIdentifier	 Benchmark Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
Benchmark	TokenNameIdentifier	 Benchmark
;	TokenNameSEMICOLON	
/** Tests that tasks in alternate packages are found. */	TokenNameCOMMENT_JAVADOC	 Tests that tasks in alternate packages are found. 
public	TokenNamepublic	
class	TokenNameclass	
AltPackageTaskTest	TokenNameIdentifier	 Alt Package Task Test
extends	TokenNameextends	
BenchmarkTestCase	TokenNameIdentifier	 Benchmark Test Case
{	TokenNameLBRACE	
/** Benchmark should fail loading the algorithm when alt is not specified */	TokenNameCOMMENT_JAVADOC	 Benchmark should fail loading the algorithm when alt is not specified 
public	TokenNamepublic	
void	TokenNamevoid	
testWithoutAlt	TokenNameIdentifier	 test Without Alt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
execBenchmark	TokenNameIdentifier	 exec Benchmark
(	TokenNameLPAREN	
altAlg	TokenNameIdentifier	 alt Alg
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"Should have failed to run the algorithm"	TokenNameStringLiteral	Should have failed to run the algorithm
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expected exception, do nothing 	TokenNameCOMMENT_LINE	expected exception, do nothing 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Benchmark should be able to load the algorithm when alt is specified */	TokenNameCOMMENT_JAVADOC	 Benchmark should be able to load the algorithm when alt is specified 
public	TokenNamepublic	
void	TokenNamevoid	
testWithAlt	TokenNameIdentifier	 test With Alt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Benchmark	TokenNameIdentifier	 Benchmark
bm	TokenNameIdentifier	 bm
=	TokenNameEQUAL	
execBenchmark	TokenNameIdentifier	 exec Benchmark
(	TokenNameLPAREN	
altAlg	TokenNameIdentifier	 alt Alg
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
bm	TokenNameIdentifier	 bm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
bm	TokenNameIdentifier	 bm
.	TokenNameDOT	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPoints	TokenNameIdentifier	 get Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
altAlg	TokenNameIdentifier	 alt Alg
(	TokenNameLPAREN	
boolean	TokenNameboolean	
allowAlt	TokenNameIdentifier	 allow Alt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
altTask	TokenNameIdentifier	 alt Task
=	TokenNameEQUAL	
"{ AltTest }"	TokenNameStringLiteral	{ AltTest }
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
allowAlt	TokenNameIdentifier	 allow Alt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alt.tasks.packages = "	TokenNameStringLiteral	alt.tasks.packages = 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPackage	TokenNameIdentifier	 get Package
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
altTask	TokenNameIdentifier	 alt Task
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
altTask	TokenNameIdentifier	 alt Task
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
