/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
LongLegacyBloomFilterTest	TokenNameIdentifier	 Long Legacy Bloom Filter Test
{	TokenNameLBRACE	
public	TokenNamepublic	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
bf	TokenNameIdentifier	 bf
;	TokenNameSEMICOLON	
/** * NB: needs to run with -mx1G */	TokenNameCOMMENT_JAVADOC	 NB: needs to run with -mx1G 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testBigInt	TokenNameIdentifier	 test Big Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bf	TokenNameIdentifier	 bf
=	TokenNameEQUAL	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
.	TokenNameDOT	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
.	TokenNameDOT	
testFalsePositives	TokenNameIdentifier	 test False Positives
(	TokenNameLPAREN	
bf	TokenNameIdentifier	 bf
,	TokenNameCOMMA	
new	TokenNamenew	
KeyGenerator	TokenNameIdentifier	 Key Generator
.	TokenNameDOT	
IntGenerator	TokenNameIdentifier	 Int Generator
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
KeyGenerator	TokenNameIdentifier	 Key Generator
.	TokenNameDOT	
IntGenerator	TokenNameIdentifier	 Int Generator
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testBigRandom	TokenNameIdentifier	 test Big Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bf	TokenNameIdentifier	 bf
=	TokenNameEQUAL	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
.	TokenNameDOT	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
.	TokenNameDOT	
testFalsePositives	TokenNameIdentifier	 test False Positives
(	TokenNameLPAREN	
bf	TokenNameIdentifier	 bf
,	TokenNameCOMMA	
new	TokenNamenew	
KeyGenerator	TokenNameIdentifier	 Key Generator
.	TokenNameDOT	
RandomStringGenerator	TokenNameIdentifier	 Random String Generator
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
KeyGenerator	TokenNameIdentifier	 Key Generator
.	TokenNameDOT	
RandomStringGenerator	TokenNameIdentifier	 Random String Generator
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
timeit	TokenNameIdentifier	 timeit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
300	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
.	TokenNameDOT	
ELEMENTS	TokenNameIdentifier	 ELEMENTS
;	TokenNameSEMICOLON	
bf	TokenNameIdentifier	 bf
=	TokenNameEQUAL	
LegacyBloomFilter	TokenNameIdentifier	 Legacy Bloom Filter
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
.	TokenNameDOT	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
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
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
.	TokenNameDOT	
testFalsePositives	TokenNameIdentifier	 test False Positives
(	TokenNameLPAREN	
bf	TokenNameIdentifier	 bf
,	TokenNameCOMMA	
new	TokenNamenew	
KeyGenerator	TokenNameIdentifier	 Key Generator
.	TokenNameDOT	
RandomStringGenerator	TokenNameIdentifier	 Random String Generator
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
KeyGenerator	TokenNameIdentifier	 Key Generator
.	TokenNameDOT	
RandomStringGenerator	TokenNameIdentifier	 Random String Generator
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bf	TokenNameIdentifier	 bf
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
