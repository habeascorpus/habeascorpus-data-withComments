package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
params	TokenNameIdentifier	 params
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
CategoryListParams	TokenNameIdentifier	 Category List Params
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
CategoryListParamsTest	TokenNameIdentifier	 Category List Params Test
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testDefaultSettings	TokenNameIdentifier	 test Default Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryListParams	TokenNameIdentifier	 Category List Params
clp	TokenNameIdentifier	 clp
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryListParams	TokenNameIdentifier	 Category List Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong default term"	TokenNameStringLiteral	wrong default term
,	TokenNameCOMMA	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"$facets"	TokenNameStringLiteral	$facets
,	TokenNameCOMMA	
"$fulltree$"	TokenNameStringLiteral	$fulltree$
)	TokenNameRPAREN	
,	TokenNameCOMMA	
clp	TokenNameIdentifier	 clp
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"unexpected default encoder"	TokenNameStringLiteral	unexpected default encoder
,	TokenNameCOMMA	
"Sorting (Unique (DGap (VInt8)))"	TokenNameStringLiteral	Sorting (Unique (DGap (VInt8)))
,	TokenNameCOMMA	
clp	TokenNameIdentifier	 clp
.	TokenNameDOT	
createEncoder	TokenNameIdentifier	 create Encoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"unexpected default decoder"	TokenNameStringLiteral	unexpected default decoder
,	TokenNameCOMMA	
"DGap (VInt8)"	TokenNameStringLiteral	DGap (VInt8)
,	TokenNameCOMMA	
clp	TokenNameIdentifier	 clp
.	TokenNameDOT	
createEncoder	TokenNameIdentifier	 create Encoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createMatchingDecoder	TokenNameIdentifier	 create Matching Decoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that the {@link CategoryListParams#hashCode()} and * {@link CategoryListParams#equals(Object)} are consistent. */	TokenNameCOMMENT_JAVADOC	 Test that the {@link CategoryListParams#hashCode()} and {@link CategoryListParams#equals(Object)} are consistent. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testIdentity	TokenNameIdentifier	 test Identity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryListParams	TokenNameIdentifier	 Category List Params
clParams1	TokenNameIdentifier	 cl Params1
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryListParams	TokenNameIdentifier	 Category List Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Assert identity is correct - a CategoryListParams equals itself. 	TokenNameCOMMENT_LINE	Assert identity is correct - a CategoryListParams equals itself. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"A CategoryListParams object does not equal itself."	TokenNameStringLiteral	A CategoryListParams object does not equal itself.
,	TokenNameCOMMA	
clParams1	TokenNameIdentifier	 cl Params1
,	TokenNameCOMMA	
clParams1	TokenNameIdentifier	 cl Params1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For completeness, the object's hashcode equals itself 	TokenNameCOMMENT_LINE	For completeness, the object's hashcode equals itself 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"A CategoryListParams object's hashCode does not equal itself."	TokenNameStringLiteral	A CategoryListParams object's hashCode does not equal itself.
,	TokenNameCOMMA	
clParams1	TokenNameIdentifier	 cl Params1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
clParams1	TokenNameIdentifier	 cl Params1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that CategoryListParams behave correctly when compared against each * other. */	TokenNameCOMMENT_JAVADOC	 Test that CategoryListParams behave correctly when compared against each other. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testIdentityConsistency	TokenNameIdentifier	 test Identity Consistency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Test 2 CategoryListParams with the default parameter 	TokenNameCOMMENT_LINE	Test 2 CategoryListParams with the default parameter 
CategoryListParams	TokenNameIdentifier	 Category List Params
clParams1	TokenNameIdentifier	 cl Params1
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryListParams	TokenNameIdentifier	 Category List Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryListParams	TokenNameIdentifier	 Category List Params
clParams2	TokenNameIdentifier	 cl Params2
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryListParams	TokenNameIdentifier	 Category List Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2 CategoryListParams with the same default term should equal each other."	TokenNameStringLiteral	2 CategoryListParams with the same default term should equal each other.
,	TokenNameCOMMA	
clParams1	TokenNameIdentifier	 cl Params1
,	TokenNameCOMMA	
clParams2	TokenNameIdentifier	 cl Params2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2 CategoryListParams with the same default term should have the same hashcode"	TokenNameStringLiteral	2 CategoryListParams with the same default term should have the same hashcode
,	TokenNameCOMMA	
clParams1	TokenNameIdentifier	 cl Params1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
clParams2	TokenNameIdentifier	 cl Params2
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Test 2 CategoryListParams with the same specified Term 	TokenNameCOMMENT_LINE	Test 2 CategoryListParams with the same specified Term 
clParams1	TokenNameIdentifier	 cl Params1
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryListParams	TokenNameIdentifier	 Category List Params
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clParams2	TokenNameIdentifier	 cl Params2
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryListParams	TokenNameIdentifier	 Category List Params
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2 CategoryListParams with the same term should equal each other."	TokenNameStringLiteral	2 CategoryListParams with the same term should equal each other.
,	TokenNameCOMMA	
clParams1	TokenNameIdentifier	 cl Params1
,	TokenNameCOMMA	
clParams2	TokenNameIdentifier	 cl Params2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2 CategoryListParams with the same term should have the same hashcode"	TokenNameStringLiteral	2 CategoryListParams with the same term should have the same hashcode
,	TokenNameCOMMA	
clParams1	TokenNameIdentifier	 cl Params1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
clParams2	TokenNameIdentifier	 cl Params2
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Test 2 CategoryListParams with DIFFERENT terms 	TokenNameCOMMENT_LINE	Test 2 CategoryListParams with DIFFERENT terms 
clParams1	TokenNameIdentifier	 cl Params1
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryListParams	TokenNameIdentifier	 Category List Params
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clParams2	TokenNameIdentifier	 cl Params2
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryListParams	TokenNameIdentifier	 Category List Params
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"test2"	TokenNameStringLiteral	test2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"2 CategoryListParams with the different terms should NOT equal each other."	TokenNameStringLiteral	2 CategoryListParams with the different terms should NOT equal each other.
,	TokenNameCOMMA	
clParams1	TokenNameIdentifier	 cl Params1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
clParams2	TokenNameIdentifier	 cl Params2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"2 CategoryListParams with the different terms should NOT have the same hashcode."	TokenNameStringLiteral	2 CategoryListParams with the different terms should NOT have the same hashcode.
,	TokenNameCOMMA	
clParams1	TokenNameIdentifier	 cl Params1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
clParams2	TokenNameIdentifier	 cl Params2
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
