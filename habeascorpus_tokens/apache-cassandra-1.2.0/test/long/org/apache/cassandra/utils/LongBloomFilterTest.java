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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
LoggerFactory	TokenNameIdentifier	 Logger Factory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
LongBloomFilterTest	TokenNameIdentifier	 Long Bloom Filter Test
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
LongBloomFilterTest	TokenNameIdentifier	 Long Bloom Filter Test
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * NB: needs to run with -mx1G */	TokenNameCOMMENT_JAVADOC	 NB: needs to run with -mx1G 
public	TokenNamepublic	
void	TokenNamevoid	
testBigInt	TokenNameIdentifier	 test Big Int
(	TokenNameLPAREN	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
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
IFilter	TokenNameIdentifier	 I Filter
bf	TokenNameIdentifier	 bf
=	TokenNameEQUAL	
FilterFactory	TokenNameIdentifier	 Filter Factory
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
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
fp	TokenNameIdentifier	 fp
=	TokenNameEQUAL	
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Bloom filter false positive: {}"	TokenNameStringLiteral	Bloom filter false positive: {}
,	TokenNameCOMMA	
fp	TokenNameIdentifier	 fp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBigRandom	TokenNameIdentifier	 test Big Random
(	TokenNameLPAREN	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
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
IFilter	TokenNameIdentifier	 I Filter
bf	TokenNameIdentifier	 bf
=	TokenNameEQUAL	
FilterFactory	TokenNameIdentifier	 Filter Factory
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
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
fp	TokenNameIdentifier	 fp
=	TokenNameEQUAL	
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Bloom filter false positive: {}"	TokenNameStringLiteral	Bloom filter false positive: {}
,	TokenNameCOMMA	
fp	TokenNameIdentifier	 fp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
timeit	TokenNameIdentifier	 timeit
(	TokenNameLPAREN	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
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
IFilter	TokenNameIdentifier	 I Filter
bf	TokenNameIdentifier	 bf
=	TokenNameEQUAL	
FilterFactory	TokenNameIdentifier	 Filter Factory
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
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumfp	TokenNameIdentifier	 sumfp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Bloom filter mean false positive: {}"	TokenNameStringLiteral	Bloom filter mean false positive: {}
,	TokenNameCOMMA	
sumfp	TokenNameIdentifier	 sumfp
/	TokenNameDIVIDE	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testBigIntMurm2	TokenNameIdentifier	 test Big Int Murm2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testBigInt	TokenNameIdentifier	 test Big Int
(	TokenNameLPAREN	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
MURMUR2	TokenNameIdentifier	 MURMU R2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testBigRandomMurm2	TokenNameIdentifier	 test Big Random Murm2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testBigRandom	TokenNameIdentifier	 test Big Random
(	TokenNameLPAREN	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
MURMUR2	TokenNameIdentifier	 MURMU R2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
timeitMurm2	TokenNameIdentifier	 timeit Murm2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timeit	TokenNameIdentifier	 timeit
(	TokenNameLPAREN	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
MURMUR2	TokenNameIdentifier	 MURMU R2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testBigIntMurm3	TokenNameIdentifier	 test Big Int Murm3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testBigInt	TokenNameIdentifier	 test Big Int
(	TokenNameLPAREN	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
MURMUR3	TokenNameIdentifier	 MURMU R3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testBigRandomMurm3	TokenNameIdentifier	 test Big Random Murm3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testBigRandom	TokenNameIdentifier	 test Big Random
(	TokenNameLPAREN	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
MURMUR3	TokenNameIdentifier	 MURMU R3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
timeitMurm3	TokenNameIdentifier	 timeit Murm3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timeit	TokenNameIdentifier	 timeit
(	TokenNameLPAREN	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
MURMUR3	TokenNameIdentifier	 MURMU R3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
