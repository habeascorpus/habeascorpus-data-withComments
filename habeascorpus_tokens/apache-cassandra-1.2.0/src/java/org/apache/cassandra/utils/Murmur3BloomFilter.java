/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
IBitSet	TokenNameIdentifier	 I Bit Set
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
Murmur3BloomFilter	TokenNameIdentifier	 Murmur3 Bloom Filter
extends	TokenNameextends	
BloomFilter	TokenNameIdentifier	 Bloom Filter
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Murmur3BloomFilterSerializer	TokenNameIdentifier	 Murmur3 Bloom Filter Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
Murmur3BloomFilterSerializer	TokenNameIdentifier	 Murmur3 Bloom Filter Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Murmur3BloomFilter	TokenNameIdentifier	 Murmur3 Bloom Filter
(	TokenNameLPAREN	
int	TokenNameint	
hashes	TokenNameIdentifier	 hashes
,	TokenNameCOMMA	
IBitSet	TokenNameIdentifier	 I Bit Set
bs	TokenNameIdentifier	 bs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
hashes	TokenNameIdentifier	 hashes
,	TokenNameCOMMA	
bs	TokenNameIdentifier	 bs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
int	TokenNameint	
remaining	TokenNameIdentifier	 remaining
,	TokenNameCOMMA	
long	TokenNamelong	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MurmurHash	TokenNameIdentifier	 Murmur Hash
.	TokenNameDOT	
hash3_x64_128	TokenNameIdentifier	 hash3 x64 128
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Murmur3BloomFilterSerializer	TokenNameIdentifier	 Murmur3 Bloom Filter Serializer
extends	TokenNameextends	
BloomFilterSerializer	TokenNameIdentifier	 Bloom Filter Serializer
{	TokenNameLBRACE	
protected	TokenNameprotected	
BloomFilter	TokenNameIdentifier	 Bloom Filter
createFilter	TokenNameIdentifier	 create Filter
(	TokenNameLPAREN	
int	TokenNameint	
hashes	TokenNameIdentifier	 hashes
,	TokenNameCOMMA	
IBitSet	TokenNameIdentifier	 I Bit Set
bs	TokenNameIdentifier	 bs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Murmur3BloomFilter	TokenNameIdentifier	 Murmur3 Bloom Filter
(	TokenNameLPAREN	
hashes	TokenNameIdentifier	 hashes
,	TokenNameCOMMA	
bs	TokenNameIdentifier	 bs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
