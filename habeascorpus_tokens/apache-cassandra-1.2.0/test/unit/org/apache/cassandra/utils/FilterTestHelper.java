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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
FilterTestHelper	TokenNameIdentifier	 Filter Test Helper
{	TokenNameLBRACE	
// used by filter subclass tests 	TokenNameCOMMENT_LINE	used by filter subclass tests 
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
MAX_FAILURE_RATE	TokenNameIdentifier	 MAX  FAILURE  RATE
=	TokenNameEQUAL	
0.1	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BloomCalculations	TokenNameIdentifier	 Bloom Calculations
.	TokenNameDOT	
BloomSpecification	TokenNameIdentifier	 Bloom Specification
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
BloomCalculations	TokenNameIdentifier	 Bloom Calculations
.	TokenNameDOT	
computeBloomSpec	TokenNameIdentifier	 compute Bloom Spec
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
MAX_FAILURE_RATE	TokenNameIdentifier	 MAX  FAILURE  RATE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ELEMENTS	TokenNameIdentifier	 ELEMENTS
=	TokenNameEQUAL	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
ResetableIterator	TokenNameIdentifier	 Resetable Iterator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
intKeys	TokenNameIdentifier	 int Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
KeyGenerator	TokenNameIdentifier	 Key Generator
.	TokenNameDOT	
IntGenerator	TokenNameIdentifier	 Int Generator
(	TokenNameLPAREN	
ELEMENTS	TokenNameIdentifier	 ELEMENTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
ResetableIterator	TokenNameIdentifier	 Resetable Iterator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
randomKeys	TokenNameIdentifier	 random Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
KeyGenerator	TokenNameIdentifier	 Key Generator
.	TokenNameDOT	
RandomStringGenerator	TokenNameIdentifier	 Random String Generator
(	TokenNameLPAREN	
314159	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMENTS	TokenNameIdentifier	 ELEMENTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
ResetableIterator	TokenNameIdentifier	 Resetable Iterator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
randomKeys2	TokenNameIdentifier	 random Keys2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
KeyGenerator	TokenNameIdentifier	 Key Generator
.	TokenNameDOT	
RandomStringGenerator	TokenNameIdentifier	 Random String Generator
(	TokenNameLPAREN	
271828	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ELEMENTS	TokenNameIdentifier	 ELEMENTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
testFalsePositives	TokenNameIdentifier	 test False Positives
(	TokenNameLPAREN	
IFilter	TokenNameIdentifier	 I Filter
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
ResetableIterator	TokenNameIdentifier	 Resetable Iterator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
ResetableIterator	TokenNameIdentifier	 Resetable Iterator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
otherkeys	TokenNameIdentifier	 otherkeys
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
otherkeys	TokenNameIdentifier	 otherkeys
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
fp	TokenNameIdentifier	 fp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
otherkeys	TokenNameIdentifier	 otherkeys
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
isPresent	TokenNameIdentifier	 is Present
(	TokenNameLPAREN	
otherkeys	TokenNameIdentifier	 otherkeys
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fp	TokenNameIdentifier	 fp
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
double	TokenNamedouble	
fp_ratio	TokenNameIdentifier	 fp ratio
=	TokenNameEQUAL	
fp	TokenNameIdentifier	 fp
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
BloomCalculations	TokenNameIdentifier	 Bloom Calculations
.	TokenNameDOT	
probs	TokenNameIdentifier	 probs
[	TokenNameLBRACKET	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
bucketsPerElement	TokenNameIdentifier	 buckets Per Element
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
spec	TokenNameIdentifier	 spec
.	TokenNameDOT	
K	TokenNameIdentifier	 K
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
fp_ratio	TokenNameIdentifier	 fp ratio
<	TokenNameLESS	
1.03	TokenNameDoubleLiteral	
:	TokenNameCOLON	
fp_ratio	TokenNameIdentifier	 fp ratio
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fp_ratio	TokenNameIdentifier	 fp ratio
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTrue	TokenNameIdentifier	 test True
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
