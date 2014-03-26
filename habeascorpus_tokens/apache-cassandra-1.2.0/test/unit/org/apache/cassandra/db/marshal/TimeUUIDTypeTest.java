/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
marshal	TokenNameIdentifier	 marshal
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
UUID	TokenNameIdentifier	 UUID
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
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
UUIDGen	TokenNameIdentifier	 UUID Gen
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TimeUUIDTypeTest	TokenNameIdentifier	 Time UUID Type Test
{	TokenNameLBRACE	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
timeUUIDType	TokenNameIdentifier	 time UUID Type
=	TokenNameEQUAL	
new	TokenNamenew	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testEquality	TokenNameIdentifier	 test Equality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
{	TokenNameLBRACE	
UUID	TokenNameIdentifier	 UUID
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getTimeUUID	TokenNameIdentifier	 get Time UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UUID	TokenNameIdentifier	 UUID
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
UUID	TokenNameIdentifier	 UUID
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getMostSignificantBits	TokenNameIdentifier	 get Most Significant Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getLeastSignificantBits	TokenNameIdentifier	 get Least Significant Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timeUUIDType	TokenNameIdentifier	 time UUID Type
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timeUUIDType	TokenNameIdentifier	 time UUID Type
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
timeUUIDType	TokenNameIdentifier	 time UUID Type
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testSmaller	TokenNameIdentifier	 test Smaller
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
{	TokenNameLBRACE	
UUID	TokenNameIdentifier	 UUID
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getTimeUUID	TokenNameIdentifier	 get Time UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UUID	TokenNameIdentifier	 UUID
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getTimeUUID	TokenNameIdentifier	 get Time UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UUID	TokenNameIdentifier	 UUID
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getTimeUUID	TokenNameIdentifier	 get Time UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timeUUIDType	TokenNameIdentifier	 time UUID Type
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timeUUIDType	TokenNameIdentifier	 time UUID Type
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timeUUIDType	TokenNameIdentifier	 time UUID Type
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
timeUUIDType	TokenNameIdentifier	 time UUID Type
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
timeUUIDType	TokenNameIdentifier	 time UUID Type
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
timeUUIDType	TokenNameIdentifier	 time UUID Type
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testBigger	TokenNameIdentifier	 test Bigger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
{	TokenNameLBRACE	
UUID	TokenNameIdentifier	 UUID
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getTimeUUID	TokenNameIdentifier	 get Time UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UUID	TokenNameIdentifier	 UUID
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getTimeUUID	TokenNameIdentifier	 get Time UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UUID	TokenNameIdentifier	 UUID
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getTimeUUID	TokenNameIdentifier	 get Time UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timeUUIDType	TokenNameIdentifier	 time UUID Type
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timeUUIDType	TokenNameIdentifier	 time UUID Type
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timeUUIDType	TokenNameIdentifier	 time UUID Type
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
timeUUIDType	TokenNameIdentifier	 time UUID Type
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
timeUUIDType	TokenNameIdentifier	 time UUID Type
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
timeUUIDType	TokenNameIdentifier	 time UUID Type
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testTimestampComparison	TokenNameIdentifier	 test Timestamp Comparison
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Random	TokenNameIdentifier	 Random
rng	TokenNameIdentifier	 rng
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
uuids	TokenNameIdentifier	 uuids
=	TokenNameEQUAL	
new	TokenNamenew	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
100	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
uuids	TokenNameIdentifier	 uuids
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uuids	TokenNameIdentifier	 uuids
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rng	TokenNameIdentifier	 rng
.	TokenNameDOT	
nextBytes	TokenNameIdentifier	 next Bytes
(	TokenNameLPAREN	
uuids	TokenNameIdentifier	 uuids
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set version to 1 	TokenNameCOMMENT_LINE	set version to 1 
uuids	TokenNameIdentifier	 uuids
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
0x0F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
uuids	TokenNameIdentifier	 uuids
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
0x10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
uuids	TokenNameIdentifier	 uuids
,	TokenNameCOMMA	
timeUUIDType	TokenNameIdentifier	 time UUID Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
uuids	TokenNameIdentifier	 uuids
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
i0	TokenNameIdentifier	 i0
=	TokenNameEQUAL	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getUUID	TokenNameIdentifier	 get UUID
(	TokenNameLPAREN	
uuids	TokenNameIdentifier	 uuids
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
i1	TokenNameIdentifier	 i1
=	TokenNameEQUAL	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getUUID	TokenNameIdentifier	 get UUID
(	TokenNameLPAREN	
uuids	TokenNameIdentifier	 uuids
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
i0	TokenNameIdentifier	 i0
<=	TokenNameLESS_EQUAL	
i1	TokenNameIdentifier	 i1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testValidTimeVersion	TokenNameIdentifier	 test Valid Time Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UUID	TokenNameIdentifier	 UUID
uuid1	TokenNameIdentifier	 uuid1
=	TokenNameEQUAL	
UUID	TokenNameIdentifier	 UUID
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
"00000000-0000-1000-0000-000000000000"	TokenNameStringLiteral	00000000-0000-1000-0000-000000000000
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
uuid1	TokenNameIdentifier	 uuid1
.	TokenNameDOT	
version	TokenNameIdentifier	 version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
timeUUIDType	TokenNameIdentifier	 time UUID Type
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
uuid1	TokenNameIdentifier	 uuid1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
MarshalException	TokenNameIdentifier	 Marshal Exception
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
void	TokenNamevoid	
testInvalidTimeVersion	TokenNameIdentifier	 test Invalid Time Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UUID	TokenNameIdentifier	 UUID
uuid2	TokenNameIdentifier	 uuid2
=	TokenNameEQUAL	
UUID	TokenNameIdentifier	 UUID
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
"00000000-0000-2100-0000-000000000000"	TokenNameStringLiteral	00000000-0000-2100-0000-000000000000
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
uuid2	TokenNameIdentifier	 uuid2
.	TokenNameDOT	
version	TokenNameIdentifier	 version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
timeUUIDType	TokenNameIdentifier	 time UUID Type
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
uuid2	TokenNameIdentifier	 uuid2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
