/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
dht	TokenNameIdentifier	 dht
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
Murmur3PartitionerTest	TokenNameIdentifier	 Murmur3 Partitioner Test
extends	TokenNameextends	
PartitionerTestCase	TokenNameIdentifier	 Partitioner Test Case
<	TokenNameLESS	
LongToken	TokenNameIdentifier	 Long Token
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
initPartitioner	TokenNameIdentifier	 init Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
partitioner	TokenNameIdentifier	 partitioner
=	TokenNameEQUAL	
new	TokenNamenew	
Murmur3Partitioner	TokenNameIdentifier	 Murmur3 Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
midpointMinimumTestCase	TokenNameIdentifier	 midpoint Minimum Test Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LongToken	TokenNameIdentifier	 Long Token
mintoken	TokenNameIdentifier	 mintoken
=	TokenNameEQUAL	
partitioner	TokenNameIdentifier	 partitioner
.	TokenNameDOT	
getMinimumToken	TokenNameIdentifier	 get Minimum Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
mintoken	TokenNameIdentifier	 mintoken
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
partitioner	TokenNameIdentifier	 partitioner
.	TokenNameDOT	
midpoint	TokenNameIdentifier	 midpoint
(	TokenNameLPAREN	
mintoken	TokenNameIdentifier	 mintoken
,	TokenNameCOMMA	
mintoken	TokenNameIdentifier	 mintoken
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertMidpoint	TokenNameIdentifier	 assert Midpoint
(	TokenNameLPAREN	
mintoken	TokenNameIdentifier	 mintoken
,	TokenNameCOMMA	
tok	TokenNameIdentifier	 tok
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertMidpoint	TokenNameIdentifier	 assert Midpoint
(	TokenNameLPAREN	
mintoken	TokenNameIdentifier	 mintoken
,	TokenNameCOMMA	
tok	TokenNameIdentifier	 tok
(	TokenNameLPAREN	
"aaa"	TokenNameStringLiteral	aaa
)	TokenNameRPAREN	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertMidpoint	TokenNameIdentifier	 assert Midpoint
(	TokenNameLPAREN	
mintoken	TokenNameIdentifier	 mintoken
,	TokenNameCOMMA	
mintoken	TokenNameIdentifier	 mintoken
,	TokenNameCOMMA	
62	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertMidpoint	TokenNameIdentifier	 assert Midpoint
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mintoken	TokenNameIdentifier	 mintoken
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
