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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
abstract	TokenNameabstract	
class	TokenNameclass	
BloomFilter	TokenNameIdentifier	 Bloom Filter
implements	TokenNameimplements	
IFilter	TokenNameIdentifier	 I Filter
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
IBitSet	TokenNameIdentifier	 I Bit Set
bitset	TokenNameIdentifier	 bitset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
hashCount	TokenNameIdentifier	 hash Count
;	TokenNameSEMICOLON	
BloomFilter	TokenNameIdentifier	 Bloom Filter
(	TokenNameLPAREN	
int	TokenNameint	
hashes	TokenNameIdentifier	 hashes
,	TokenNameCOMMA	
IBitSet	TokenNameIdentifier	 I Bit Set
bitset	TokenNameIdentifier	 bitset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hashCount	TokenNameIdentifier	 hash Count
=	TokenNameEQUAL	
hashes	TokenNameIdentifier	 hashes
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bitset	TokenNameIdentifier	 bitset
=	TokenNameEQUAL	
bitset	TokenNameIdentifier	 bitset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getHashBuckets	TokenNameIdentifier	 get Hash Buckets
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getHashBuckets	TokenNameIdentifier	 get Hash Buckets
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
hashCount	TokenNameIdentifier	 hash Count
,	TokenNameCOMMA	
bitset	TokenNameIdentifier	 bitset
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
// Murmur is faster than an SHA-based approach and provides as-good collision 	TokenNameCOMMENT_LINE	Murmur is faster than an SHA-based approach and provides as-good collision 
// resistance. The combinatorial generation approach described in 	TokenNameCOMMENT_LINE	resistance. The combinatorial generation approach described in 
// https://www.eecs.harvard.edu/~michaelm/postscripts/tr-02-05.pdf 	TokenNameCOMMENT_LINE	http://www.eecs.harvard.edu/~kirsch/pubs/bbbf/esa06.pdf 
// does prove to work in actual tests, and is obviously faster 	TokenNameCOMMENT_LINE	does prove to work in actual tests, and is obviously faster 
// than performing further iterations of murmur. 	TokenNameCOMMENT_LINE	than performing further iterations of murmur. 
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getHashBuckets	TokenNameIdentifier	 get Hash Buckets
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
hashCount	TokenNameIdentifier	 hash Count
,	TokenNameCOMMA	
long	TokenNamelong	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
hashCount	TokenNameIdentifier	 hash Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
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
0L	TokenNameLongLiteral	
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
hashCount	TokenNameIdentifier	 hash Count
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
bucketIndex	TokenNameIdentifier	 bucket Index
:	TokenNameCOLON	
getHashBuckets	TokenNameIdentifier	 get Hash Buckets
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bitset	TokenNameIdentifier	 bitset
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
bucketIndex	TokenNameIdentifier	 bucket Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isPresent	TokenNameIdentifier	 is Present
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
bucketIndex	TokenNameIdentifier	 bucket Index
:	TokenNameCOLON	
getHashBuckets	TokenNameIdentifier	 get Hash Buckets
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
bitset	TokenNameIdentifier	 bitset
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
bucketIndex	TokenNameIdentifier	 bucket Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bitset	TokenNameIdentifier	 bitset
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
bitset	TokenNameIdentifier	 bitset
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
