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
/** helper class for a random seed that is really 3 random seeds: * <ol> * <li>The test class's random seed: this is what the test sees in its beforeClass methods * <li>The test method's random seed: this is what the test method sees starting in its befores * <li>The test runner's random seed (controls the shuffling of test methods) * </ol> */	TokenNameCOMMENT_JAVADOC	 helper class for a random seed that is really 3 random seeds: <ol> <li>The test class's random seed: this is what the test sees in its beforeClass methods <li>The test method's random seed: this is what the test method sees starting in its befores <li>The test runner's random seed (controls the shuffling of test methods) </ol> 
class	TokenNameclass	
ThreeLongs	TokenNameIdentifier	 Three Longs
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
l1	TokenNameIdentifier	 l1
,	TokenNameCOMMA	
l2	TokenNameIdentifier	 l2
,	TokenNameCOMMA	
l3	TokenNameIdentifier	 l3
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ThreeLongs	TokenNameIdentifier	 Three Longs
(	TokenNameLPAREN	
long	TokenNamelong	
l1	TokenNameIdentifier	 l1
,	TokenNameCOMMA	
long	TokenNamelong	
l2	TokenNameIdentifier	 l2
,	TokenNameCOMMA	
long	TokenNamelong	
l3	TokenNameIdentifier	 l3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
l1	TokenNameIdentifier	 l1
=	TokenNameEQUAL	
l1	TokenNameIdentifier	 l1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
l2	TokenNameIdentifier	 l2
=	TokenNameEQUAL	
l2	TokenNameIdentifier	 l2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
l3	TokenNameIdentifier	 l3
=	TokenNameEQUAL	
l3	TokenNameIdentifier	 l3
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
l1	TokenNameIdentifier	 l1
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
l2	TokenNameIdentifier	 l2
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
l3	TokenNameIdentifier	 l3
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ThreeLongs	TokenNameIdentifier	 Three Longs
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
parts	TokenNameIdentifier	 parts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ThreeLongs	TokenNameIdentifier	 Three Longs
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
