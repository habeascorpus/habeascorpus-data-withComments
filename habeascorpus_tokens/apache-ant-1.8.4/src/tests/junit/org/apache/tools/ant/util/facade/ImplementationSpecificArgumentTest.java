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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
facade	TokenNameIdentifier	 facade
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
ImplementationSpecificArgumentTest	TokenNameIdentifier	 Implementation Specific Argument Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
ImplementationSpecificArgumentTest	TokenNameIdentifier	 Implementation Specific Argument Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDependsOnImplementation	TokenNameIdentifier	 test Depends On Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ImplementationSpecificArgument	TokenNameIdentifier	 Implementation Specific Argument
ia	TokenNameIdentifier	 ia
=	TokenNameEQUAL	
new	TokenNamenew	
ImplementationSpecificArgument	TokenNameIdentifier	 Implementation Specific Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ia	TokenNameIdentifier	 ia
.	TokenNameDOT	
setLine	TokenNameIdentifier	 set Line
(	TokenNameLPAREN	
"A B"	TokenNameStringLiteral	A B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parts	TokenNameIdentifier	 parts
=	TokenNameEQUAL	
ia	TokenNameIdentifier	 ia
.	TokenNameDOT	
getParts	TokenNameIdentifier	 get Parts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
parts	TokenNameIdentifier	 parts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
parts	TokenNameIdentifier	 parts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"B"	TokenNameStringLiteral	B
,	TokenNameCOMMA	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parts	TokenNameIdentifier	 parts
=	TokenNameEQUAL	
ia	TokenNameIdentifier	 ia
.	TokenNameDOT	
getParts	TokenNameIdentifier	 get Parts
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
parts	TokenNameIdentifier	 parts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
parts	TokenNameIdentifier	 parts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"B"	TokenNameStringLiteral	B
,	TokenNameCOMMA	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ia	TokenNameIdentifier	 ia
.	TokenNameDOT	
setImplementation	TokenNameIdentifier	 set Implementation
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parts	TokenNameIdentifier	 parts
=	TokenNameEQUAL	
ia	TokenNameIdentifier	 ia
.	TokenNameDOT	
getParts	TokenNameIdentifier	 get Parts
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
parts	TokenNameIdentifier	 parts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
parts	TokenNameIdentifier	 parts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parts	TokenNameIdentifier	 parts
=	TokenNameEQUAL	
ia	TokenNameIdentifier	 ia
.	TokenNameDOT	
getParts	TokenNameIdentifier	 get Parts
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
parts	TokenNameIdentifier	 parts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
parts	TokenNameIdentifier	 parts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
,	TokenNameCOMMA	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"B"	TokenNameStringLiteral	B
,	TokenNameCOMMA	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
