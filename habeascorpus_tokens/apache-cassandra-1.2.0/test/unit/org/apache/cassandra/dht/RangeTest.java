/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
dht	TokenNameIdentifier	 dht
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
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
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
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
RowPosition	TokenNameIdentifier	 Row Position
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
range	TokenNameIdentifier	 range
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
RangeTest	TokenNameIdentifier	 Range Test
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testContains	TokenNameIdentifier	 test Contains
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Range	TokenNameIdentifier	 Range
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"101"	TokenNameStringLiteral	101
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testContainsWrapping	TokenNameIdentifier	 test Contains Wrapping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Range	TokenNameIdentifier	 Range
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"101"	TokenNameStringLiteral	101
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"200"	TokenNameStringLiteral	200
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testContainsRange	TokenNameIdentifier	 test Contains Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Range	TokenNameIdentifier	 Range
one	TokenNameIdentifier	 one
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
two	TokenNameIdentifier	 two
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
thr	TokenNameIdentifier	 thr
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
fou	TokenNameIdentifier	 fou
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"12"	TokenNameStringLiteral	12
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
one	TokenNameIdentifier	 one
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
one	TokenNameIdentifier	 one
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
thr	TokenNameIdentifier	 thr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
one	TokenNameIdentifier	 one
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
fou	TokenNameIdentifier	 fou
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
two	TokenNameIdentifier	 two
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
two	TokenNameIdentifier	 two
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
thr	TokenNameIdentifier	 thr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
two	TokenNameIdentifier	 two
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
fou	TokenNameIdentifier	 fou
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
thr	TokenNameIdentifier	 thr
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
thr	TokenNameIdentifier	 thr
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
thr	TokenNameIdentifier	 thr
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
fou	TokenNameIdentifier	 fou
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
fou	TokenNameIdentifier	 fou
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
fou	TokenNameIdentifier	 fou
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
fou	TokenNameIdentifier	 fou
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
thr	TokenNameIdentifier	 thr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testContainsRangeWrapping	TokenNameIdentifier	 test Contains Range Wrapping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Range	TokenNameIdentifier	 Range
one	TokenNameIdentifier	 one
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
two	TokenNameIdentifier	 two
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
thr	TokenNameIdentifier	 thr
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"12"	TokenNameStringLiteral	12
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
fou	TokenNameIdentifier	 fou
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"6"	TokenNameStringLiteral	6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
fiv	TokenNameIdentifier	 fiv
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
one	TokenNameIdentifier	 one
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
one	TokenNameIdentifier	 one
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
thr	TokenNameIdentifier	 thr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
one	TokenNameIdentifier	 one
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
fou	TokenNameIdentifier	 fou
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
two	TokenNameIdentifier	 two
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
two	TokenNameIdentifier	 two
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
thr	TokenNameIdentifier	 thr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
two	TokenNameIdentifier	 two
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
fou	TokenNameIdentifier	 fou
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
thr	TokenNameIdentifier	 thr
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
thr	TokenNameIdentifier	 thr
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
thr	TokenNameIdentifier	 thr
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
fou	TokenNameIdentifier	 fou
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
fou	TokenNameIdentifier	 fou
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
fou	TokenNameIdentifier	 fou
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
fou	TokenNameIdentifier	 fou
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
thr	TokenNameIdentifier	 thr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
fiv	TokenNameIdentifier	 fiv
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
fiv	TokenNameIdentifier	 fiv
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
fiv	TokenNameIdentifier	 fiv
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
thr	TokenNameIdentifier	 thr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
fiv	TokenNameIdentifier	 fiv
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
fou	TokenNameIdentifier	 fou
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testContainsRangeOneWrapping	TokenNameIdentifier	 test Contains Range One Wrapping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Range	TokenNameIdentifier	 Range
wrap1	TokenNameIdentifier	 wrap1
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
wrap2	TokenNameIdentifier	 wrap2
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
nowrap1	TokenNameIdentifier	 nowrap1
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
nowrap2	TokenNameIdentifier	 nowrap2
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
nowrap3	TokenNameIdentifier	 nowrap3
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
wrap1	TokenNameIdentifier	 wrap1
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
nowrap1	TokenNameIdentifier	 nowrap1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
wrap1	TokenNameIdentifier	 wrap1
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
nowrap2	TokenNameIdentifier	 nowrap2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
wrap1	TokenNameIdentifier	 wrap1
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
nowrap3	TokenNameIdentifier	 nowrap3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
wrap2	TokenNameIdentifier	 wrap2
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
nowrap1	TokenNameIdentifier	 nowrap1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
wrap2	TokenNameIdentifier	 wrap2
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
nowrap2	TokenNameIdentifier	 nowrap2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
wrap2	TokenNameIdentifier	 wrap2
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
nowrap3	TokenNameIdentifier	 nowrap3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testIntersects	TokenNameIdentifier	 test Intersects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Range	TokenNameIdentifier	 Range
all	TokenNameIdentifier	 all
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// technically, this is a wrapping range 	TokenNameCOMMENT_LINE	technically, this is a wrapping range 
Range	TokenNameIdentifier	 Range
one	TokenNameIdentifier	 one
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
two	TokenNameIdentifier	 two
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"8"	TokenNameStringLiteral	8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
not	TokenNameIdentifier	 not
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"12"	TokenNameStringLiteral	12
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
all	TokenNameIdentifier	 all
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
all	TokenNameIdentifier	 all
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
one	TokenNameIdentifier	 one
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
two	TokenNameIdentifier	 two
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
one	TokenNameIdentifier	 one
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
not	TokenNameIdentifier	 not
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
not	TokenNameIdentifier	 not
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
two	TokenNameIdentifier	 two
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
not	TokenNameIdentifier	 not
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
not	TokenNameIdentifier	 not
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testIntersectsWrapping	TokenNameIdentifier	 test Intersects Wrapping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Range	TokenNameIdentifier	 Range
onewrap	TokenNameIdentifier	 onewrap
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
onecomplement	TokenNameIdentifier	 onecomplement
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
onewrap	TokenNameIdentifier	 onewrap
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
onewrap	TokenNameIdentifier	 onewrap
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
onestartswith	TokenNameIdentifier	 onestartswith
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
onewrap	TokenNameIdentifier	 onewrap
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"12"	TokenNameStringLiteral	12
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
oneendswith	TokenNameIdentifier	 oneendswith
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
onewrap	TokenNameIdentifier	 onewrap
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
twowrap	TokenNameIdentifier	 twowrap
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
not	TokenNameIdentifier	 not
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"6"	TokenNameStringLiteral	6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
onewrap	TokenNameIdentifier	 onewrap
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
onecomplement	TokenNameIdentifier	 onecomplement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
onewrap	TokenNameIdentifier	 onewrap
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
onestartswith	TokenNameIdentifier	 onestartswith
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
onewrap	TokenNameIdentifier	 onewrap
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
oneendswith	TokenNameIdentifier	 oneendswith
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
onewrap	TokenNameIdentifier	 onewrap
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
twowrap	TokenNameIdentifier	 twowrap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
twowrap	TokenNameIdentifier	 twowrap
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
onewrap	TokenNameIdentifier	 onewrap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
onewrap	TokenNameIdentifier	 onewrap
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
not	TokenNameIdentifier	 not
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
not	TokenNameIdentifier	 not
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
onewrap	TokenNameIdentifier	 onewrap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
twowrap	TokenNameIdentifier	 twowrap
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
not	TokenNameIdentifier	 not
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
not	TokenNameIdentifier	 not
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
twowrap	TokenNameIdentifier	 twowrap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
RingPosition	TokenNameIdentifier	 Ring Position
>	TokenNameGREATER	
void	TokenNamevoid	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
one	TokenNameIdentifier	 one
,	TokenNameCOMMA	
Range	TokenNameIdentifier	 Range
two	TokenNameIdentifier	 two
,	TokenNameCOMMA	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
...	TokenNameELLIPSIS	
ranges	TokenNameIdentifier	 ranges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
correct	TokenNameIdentifier	 correct
=	TokenNameEQUAL	
Range	TokenNameIdentifier	 Range
.	TokenNameDOT	
rangeSet	TokenNameIdentifier	 range Set
(	TokenNameLPAREN	
ranges	TokenNameIdentifier	 ranges
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
>	TokenNameGREATER	
result1	TokenNameIdentifier	 result1
=	TokenNameEQUAL	
one	TokenNameIdentifier	 one
.	TokenNameDOT	
intersectionWith	TokenNameIdentifier	 intersection With
(	TokenNameLPAREN	
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
result1	TokenNameIdentifier	 result1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
correct	TokenNameIdentifier	 correct
)	TokenNameRPAREN	
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%s != %s"	TokenNameStringLiteral	%s != %s
,	TokenNameCOMMA	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
result1	TokenNameIdentifier	 result1
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
,	TokenNameCOMMA	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
correct	TokenNameIdentifier	 correct
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
>	TokenNameGREATER	
result2	TokenNameIdentifier	 result2
=	TokenNameEQUAL	
two	TokenNameIdentifier	 two
.	TokenNameDOT	
intersectionWith	TokenNameIdentifier	 intersection With
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
result2	TokenNameIdentifier	 result2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
correct	TokenNameIdentifier	 correct
)	TokenNameRPAREN	
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%s != %s"	TokenNameStringLiteral	%s != %s
,	TokenNameCOMMA	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
result2	TokenNameIdentifier	 result2
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
,	TokenNameCOMMA	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
correct	TokenNameIdentifier	 correct
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertNoIntersection	TokenNameIdentifier	 assert No Intersection
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
wraps1	TokenNameIdentifier	 wraps1
,	TokenNameCOMMA	
Range	TokenNameIdentifier	 Range
nowrap3	TokenNameIdentifier	 nowrap3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
wraps1	TokenNameIdentifier	 wraps1
,	TokenNameCOMMA	
nowrap3	TokenNameIdentifier	 nowrap3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testIntersectionWithAll	TokenNameIdentifier	 test Intersection With All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Range	TokenNameIdentifier	 Range
all0	TokenNameIdentifier	 all0
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
all10	TokenNameIdentifier	 all10
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
all100	TokenNameIdentifier	 all100
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
all1000	TokenNameIdentifier	 all1000
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"1000"	TokenNameStringLiteral	1000
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"1000"	TokenNameStringLiteral	1000
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
wraps	TokenNameIdentifier	 wraps
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
all0	TokenNameIdentifier	 all0
,	TokenNameCOMMA	
wraps	TokenNameIdentifier	 wraps
,	TokenNameCOMMA	
wraps	TokenNameIdentifier	 wraps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
all10	TokenNameIdentifier	 all10
,	TokenNameCOMMA	
wraps	TokenNameIdentifier	 wraps
,	TokenNameCOMMA	
wraps	TokenNameIdentifier	 wraps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
all100	TokenNameIdentifier	 all100
,	TokenNameCOMMA	
wraps	TokenNameIdentifier	 wraps
,	TokenNameCOMMA	
wraps	TokenNameIdentifier	 wraps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
all1000	TokenNameIdentifier	 all1000
,	TokenNameCOMMA	
wraps	TokenNameIdentifier	 wraps
,	TokenNameCOMMA	
wraps	TokenNameIdentifier	 wraps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testIntersectionContains	TokenNameIdentifier	 test Intersection Contains
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Range	TokenNameIdentifier	 Range
wraps1	TokenNameIdentifier	 wraps1
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
wraps2	TokenNameIdentifier	 wraps2
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"90"	TokenNameStringLiteral	90
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"20"	TokenNameStringLiteral	20
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
wraps3	TokenNameIdentifier	 wraps3
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"90"	TokenNameStringLiteral	90
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
nowrap1	TokenNameIdentifier	 nowrap1
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"110"	TokenNameStringLiteral	110
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
nowrap2	TokenNameIdentifier	 nowrap2
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
nowrap3	TokenNameIdentifier	 nowrap3
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"9"	TokenNameStringLiteral	9
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
wraps1	TokenNameIdentifier	 wraps1
,	TokenNameCOMMA	
wraps2	TokenNameIdentifier	 wraps2
,	TokenNameCOMMA	
wraps1	TokenNameIdentifier	 wraps1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
wraps3	TokenNameIdentifier	 wraps3
,	TokenNameCOMMA	
wraps2	TokenNameIdentifier	 wraps2
,	TokenNameCOMMA	
wraps3	TokenNameIdentifier	 wraps3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
wraps1	TokenNameIdentifier	 wraps1
,	TokenNameCOMMA	
nowrap1	TokenNameIdentifier	 nowrap1
,	TokenNameCOMMA	
nowrap1	TokenNameIdentifier	 nowrap1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
wraps1	TokenNameIdentifier	 wraps1
,	TokenNameCOMMA	
nowrap2	TokenNameIdentifier	 nowrap2
,	TokenNameCOMMA	
nowrap2	TokenNameIdentifier	 nowrap2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
nowrap2	TokenNameIdentifier	 nowrap2
,	TokenNameCOMMA	
nowrap3	TokenNameIdentifier	 nowrap3
,	TokenNameCOMMA	
nowrap3	TokenNameIdentifier	 nowrap3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
wraps1	TokenNameIdentifier	 wraps1
,	TokenNameCOMMA	
wraps1	TokenNameIdentifier	 wraps1
,	TokenNameCOMMA	
wraps1	TokenNameIdentifier	 wraps1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
nowrap1	TokenNameIdentifier	 nowrap1
,	TokenNameCOMMA	
nowrap1	TokenNameIdentifier	 nowrap1
,	TokenNameCOMMA	
nowrap1	TokenNameIdentifier	 nowrap1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
nowrap2	TokenNameIdentifier	 nowrap2
,	TokenNameCOMMA	
nowrap2	TokenNameIdentifier	 nowrap2
,	TokenNameCOMMA	
nowrap2	TokenNameIdentifier	 nowrap2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
wraps3	TokenNameIdentifier	 wraps3
,	TokenNameCOMMA	
wraps3	TokenNameIdentifier	 wraps3
,	TokenNameCOMMA	
wraps3	TokenNameIdentifier	 wraps3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testNoIntersection	TokenNameIdentifier	 test No Intersection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Range	TokenNameIdentifier	 Range
wraps1	TokenNameIdentifier	 wraps1
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
wraps2	TokenNameIdentifier	 wraps2
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
nowrap1	TokenNameIdentifier	 nowrap1
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
nowrap2	TokenNameIdentifier	 nowrap2
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"200"	TokenNameStringLiteral	200
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
nowrap3	TokenNameIdentifier	 nowrap3
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNoIntersection	TokenNameIdentifier	 assert No Intersection
(	TokenNameLPAREN	
wraps1	TokenNameIdentifier	 wraps1
,	TokenNameCOMMA	
nowrap3	TokenNameIdentifier	 nowrap3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNoIntersection	TokenNameIdentifier	 assert No Intersection
(	TokenNameLPAREN	
wraps2	TokenNameIdentifier	 wraps2
,	TokenNameCOMMA	
nowrap1	TokenNameIdentifier	 nowrap1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNoIntersection	TokenNameIdentifier	 assert No Intersection
(	TokenNameLPAREN	
nowrap1	TokenNameIdentifier	 nowrap1
,	TokenNameCOMMA	
nowrap2	TokenNameIdentifier	 nowrap2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testIntersectionOneWraps	TokenNameIdentifier	 test Intersection One Wraps
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Range	TokenNameIdentifier	 Range
wraps1	TokenNameIdentifier	 wraps1
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
wraps2	TokenNameIdentifier	 wraps2
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
nowrap1	TokenNameIdentifier	 nowrap1
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"200"	TokenNameStringLiteral	200
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
nowrap2	TokenNameIdentifier	 nowrap2
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
wraps1	TokenNameIdentifier	 wraps1
,	TokenNameCOMMA	
nowrap1	TokenNameIdentifier	 nowrap1
,	TokenNameCOMMA	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"200"	TokenNameStringLiteral	200
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
wraps2	TokenNameIdentifier	 wraps2
,	TokenNameCOMMA	
nowrap1	TokenNameIdentifier	 nowrap1
,	TokenNameCOMMA	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"200"	TokenNameStringLiteral	200
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
wraps1	TokenNameIdentifier	 wraps1
,	TokenNameCOMMA	
nowrap2	TokenNameIdentifier	 nowrap2
,	TokenNameCOMMA	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testIntersectionTwoWraps	TokenNameIdentifier	 test Intersection Two Wraps
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Range	TokenNameIdentifier	 Range
wraps1	TokenNameIdentifier	 wraps1
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"20"	TokenNameStringLiteral	20
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
wraps2	TokenNameIdentifier	 wraps2
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"120"	TokenNameStringLiteral	120
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"90"	TokenNameStringLiteral	90
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
wraps3	TokenNameIdentifier	 wraps3
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"120"	TokenNameStringLiteral	120
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"110"	TokenNameStringLiteral	110
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
wraps4	TokenNameIdentifier	 wraps4
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
wraps5	TokenNameIdentifier	 wraps5
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
wraps6	TokenNameIdentifier	 wraps6
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"30"	TokenNameStringLiteral	30
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
wraps1	TokenNameIdentifier	 wraps1
,	TokenNameCOMMA	
wraps2	TokenNameIdentifier	 wraps2
,	TokenNameCOMMA	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"120"	TokenNameStringLiteral	120
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"20"	TokenNameStringLiteral	20
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
wraps1	TokenNameIdentifier	 wraps1
,	TokenNameCOMMA	
wraps3	TokenNameIdentifier	 wraps3
,	TokenNameCOMMA	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"120"	TokenNameStringLiteral	120
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"20"	TokenNameStringLiteral	20
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"110"	TokenNameStringLiteral	110
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
wraps1	TokenNameIdentifier	 wraps1
,	TokenNameCOMMA	
wraps4	TokenNameIdentifier	 wraps4
,	TokenNameCOMMA	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"20"	TokenNameStringLiteral	20
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
wraps1	TokenNameIdentifier	 wraps1
,	TokenNameCOMMA	
wraps5	TokenNameIdentifier	 wraps5
,	TokenNameCOMMA	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"20"	TokenNameStringLiteral	20
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertIntersection	TokenNameIdentifier	 assert Intersection
(	TokenNameLPAREN	
wraps1	TokenNameIdentifier	 wraps1
,	TokenNameCOMMA	
wraps6	TokenNameIdentifier	 wraps6
,	TokenNameCOMMA	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"100"	TokenNameStringLiteral	100
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testByteTokensCompare	TokenNameIdentifier	 test Byte Tokens Compare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
new	TokenNamenew	
BytesToken	TokenNameIdentifier	 Bytes Token
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
new	TokenNamenew	
BytesToken	TokenNameIdentifier	 Bytes Token
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
t3	TokenNameIdentifier	 t3
=	TokenNameEQUAL	
new	TokenNamenew	
BytesToken	TokenNameIdentifier	 Bytes Token
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
t3	TokenNameIdentifier	 t3
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
t3	TokenNameIdentifier	 t3
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
t4	TokenNameIdentifier	 t4
=	TokenNameEQUAL	
new	TokenNamenew	
BytesToken	TokenNameIdentifier	 Bytes Token
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
t5	TokenNameIdentifier	 t5
=	TokenNameEQUAL	
new	TokenNamenew	
BytesToken	TokenNameIdentifier	 Bytes Token
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
t4	TokenNameIdentifier	 t4
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
t5	TokenNameIdentifier	 t5
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
t5	TokenNameIdentifier	 t5
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
t4	TokenNameIdentifier	 t4
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
t4	TokenNameIdentifier	 t4
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Range	TokenNameIdentifier	 Range
makeRange	TokenNameIdentifier	 make Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
token1	TokenNameIdentifier	 token1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
token2	TokenNameIdentifier	 token2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
token1	TokenNameIdentifier	 token1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
token2	TokenNameIdentifier	 token2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
>	TokenNameGREATER	
makeRanges	TokenNameIdentifier	 make Ranges
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokenPairs	TokenNameIdentifier	 token Pairs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
>	TokenNameGREATER	
ranges	TokenNameIdentifier	 ranges
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
>	TokenNameGREATER	
(	TokenNameLPAREN	
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
tokenPairs	TokenNameIdentifier	 token Pairs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
makeRange	TokenNameIdentifier	 make Range
(	TokenNameLPAREN	
tokenPairs	TokenNameIdentifier	 token Pairs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
tokenPairs	TokenNameIdentifier	 token Pairs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ranges	TokenNameIdentifier	 ranges
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens	TokenNameIdentifier	 new Tokens
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
>	TokenNameGREATER	
ranges	TokenNameIdentifier	 ranges
=	TokenNameEQUAL	
makeRanges	TokenNameIdentifier	 make Ranges
(	TokenNameLPAREN	
newTokens	TokenNameIdentifier	 new Tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
newRange	TokenNameIdentifier	 new Range
:	TokenNameCOLON	
ranges	TokenNameIdentifier	 ranges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
>	TokenNameGREATER	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
oldRange	TokenNameIdentifier	 old Range
.	TokenNameDOT	
differenceToFetch	TokenNameIdentifier	 difference To Fetch
(	TokenNameLPAREN	
newRange	TokenNameIdentifier	 new Range
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
diff	TokenNameIdentifier	 diff
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
makeRanges	TokenNameIdentifier	 make Ranges
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"Old range: "	TokenNameStringLiteral	Old range: 
+	TokenNamePLUS	
oldRange	TokenNameIdentifier	 old Range
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"New range: "	TokenNameStringLiteral	New range: 
+	TokenNamePLUS	
newRange	TokenNameIdentifier	 new Range
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"Difference: (result) "	TokenNameStringLiteral	Difference: (result) 
+	TokenNamePLUS	
diff	TokenNameIdentifier	 diff
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" != "	TokenNameStringLiteral	 != 
+	TokenNamePLUS	
makeRanges	TokenNameIdentifier	 make Ranges
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
+	TokenNamePLUS	
" (expected)"	TokenNameStringLiteral	 (expected)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testDifferenceToFetchNoWrap	TokenNameIdentifier	 test Difference To Fetch No Wrap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Range	TokenNameIdentifier	 Range
oldRange	TokenNameIdentifier	 old Range
=	TokenNameEQUAL	
makeRange	TokenNameIdentifier	 make Range
(	TokenNameLPAREN	
"10"	TokenNameStringLiteral	10
,	TokenNameCOMMA	
"40"	TokenNameStringLiteral	40
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// New range is entirely contained 	TokenNameCOMMENT_LINE	New range is entirely contained 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens1	TokenNameIdentifier	 new Tokens1
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"20"	TokenNameStringLiteral	20
,	TokenNameCOMMA	
"30"	TokenNameStringLiteral	30
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"10"	TokenNameStringLiteral	10
,	TokenNameCOMMA	
"20"	TokenNameStringLiteral	20
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"10"	TokenNameStringLiteral	10
,	TokenNameCOMMA	
"40"	TokenNameStringLiteral	40
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"20"	TokenNameStringLiteral	20
,	TokenNameCOMMA	
"40"	TokenNameStringLiteral	40
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected1	TokenNameIdentifier	 expected1
=	TokenNameEQUAL	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens1	TokenNameIdentifier	 new Tokens1
,	TokenNameCOMMA	
expected1	TokenNameIdentifier	 expected1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Right half of the new range is needed 	TokenNameCOMMENT_LINE	Right half of the new range is needed 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens2	TokenNameIdentifier	 new Tokens2
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"10"	TokenNameStringLiteral	10
,	TokenNameCOMMA	
"50"	TokenNameStringLiteral	50
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"20"	TokenNameStringLiteral	20
,	TokenNameCOMMA	
"50"	TokenNameStringLiteral	50
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"40"	TokenNameStringLiteral	40
,	TokenNameCOMMA	
"50"	TokenNameStringLiteral	50
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected2	TokenNameIdentifier	 expected2
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"40"	TokenNameStringLiteral	40
,	TokenNameCOMMA	
"50"	TokenNameStringLiteral	50
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens2	TokenNameIdentifier	 new Tokens2
,	TokenNameCOMMA	
expected2	TokenNameIdentifier	 expected2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Left half of the new range is needed 	TokenNameCOMMENT_LINE	Left half of the new range is needed 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens3	TokenNameIdentifier	 new Tokens3
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"0"	TokenNameStringLiteral	0
,	TokenNameCOMMA	
"10"	TokenNameStringLiteral	10
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"0"	TokenNameStringLiteral	0
,	TokenNameCOMMA	
"20"	TokenNameStringLiteral	20
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"0"	TokenNameStringLiteral	0
,	TokenNameCOMMA	
"40"	TokenNameStringLiteral	40
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected3	TokenNameIdentifier	 expected3
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"0"	TokenNameStringLiteral	0
,	TokenNameCOMMA	
"10"	TokenNameStringLiteral	10
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens3	TokenNameIdentifier	 new Tokens3
,	TokenNameCOMMA	
expected3	TokenNameIdentifier	 expected3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Parts on both ends of the new range are needed 	TokenNameCOMMENT_LINE	Parts on both ends of the new range are needed 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens4	TokenNameIdentifier	 new Tokens4
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"0"	TokenNameStringLiteral	0
,	TokenNameCOMMA	
"50"	TokenNameStringLiteral	50
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected4	TokenNameIdentifier	 expected4
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"0"	TokenNameStringLiteral	0
,	TokenNameCOMMA	
"10"	TokenNameStringLiteral	10
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"40"	TokenNameStringLiteral	40
,	TokenNameCOMMA	
"50"	TokenNameStringLiteral	50
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens4	TokenNameIdentifier	 new Tokens4
,	TokenNameCOMMA	
expected4	TokenNameIdentifier	 expected4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testDifferenceToFetchBothWrap	TokenNameIdentifier	 test Difference To Fetch Both Wrap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Range	TokenNameIdentifier	 Range
oldRange	TokenNameIdentifier	 old Range
=	TokenNameEQUAL	
makeRange	TokenNameIdentifier	 make Range
(	TokenNameLPAREN	
"1010"	TokenNameStringLiteral	1010
,	TokenNameCOMMA	
"40"	TokenNameStringLiteral	40
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// New range is entirely contained 	TokenNameCOMMENT_LINE	New range is entirely contained 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens1	TokenNameIdentifier	 new Tokens1
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"1020"	TokenNameStringLiteral	1020
,	TokenNameCOMMA	
"30"	TokenNameStringLiteral	30
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"1010"	TokenNameStringLiteral	1010
,	TokenNameCOMMA	
"20"	TokenNameStringLiteral	20
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"1010"	TokenNameStringLiteral	1010
,	TokenNameCOMMA	
"40"	TokenNameStringLiteral	40
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"1020"	TokenNameStringLiteral	1020
,	TokenNameCOMMA	
"40"	TokenNameStringLiteral	40
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected1	TokenNameIdentifier	 expected1
=	TokenNameEQUAL	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens1	TokenNameIdentifier	 new Tokens1
,	TokenNameCOMMA	
expected1	TokenNameIdentifier	 expected1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Right half of the new range is needed 	TokenNameCOMMENT_LINE	Right half of the new range is needed 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens2	TokenNameIdentifier	 new Tokens2
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"1010"	TokenNameStringLiteral	1010
,	TokenNameCOMMA	
"50"	TokenNameStringLiteral	50
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"1020"	TokenNameStringLiteral	1020
,	TokenNameCOMMA	
"50"	TokenNameStringLiteral	50
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"1040"	TokenNameStringLiteral	1040
,	TokenNameCOMMA	
"50"	TokenNameStringLiteral	50
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected2	TokenNameIdentifier	 expected2
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"40"	TokenNameStringLiteral	40
,	TokenNameCOMMA	
"50"	TokenNameStringLiteral	50
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens2	TokenNameIdentifier	 new Tokens2
,	TokenNameCOMMA	
expected2	TokenNameIdentifier	 expected2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Left half of the new range is needed 	TokenNameCOMMENT_LINE	Left half of the new range is needed 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens3	TokenNameIdentifier	 new Tokens3
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"1000"	TokenNameStringLiteral	1000
,	TokenNameCOMMA	
"10"	TokenNameStringLiteral	10
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"1000"	TokenNameStringLiteral	1000
,	TokenNameCOMMA	
"20"	TokenNameStringLiteral	20
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"1000"	TokenNameStringLiteral	1000
,	TokenNameCOMMA	
"40"	TokenNameStringLiteral	40
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected3	TokenNameIdentifier	 expected3
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"1000"	TokenNameStringLiteral	1000
,	TokenNameCOMMA	
"1010"	TokenNameStringLiteral	1010
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens3	TokenNameIdentifier	 new Tokens3
,	TokenNameCOMMA	
expected3	TokenNameIdentifier	 expected3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Parts on both ends of the new range are needed 	TokenNameCOMMENT_LINE	Parts on both ends of the new range are needed 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens4	TokenNameIdentifier	 new Tokens4
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"1000"	TokenNameStringLiteral	1000
,	TokenNameCOMMA	
"50"	TokenNameStringLiteral	50
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected4	TokenNameIdentifier	 expected4
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"1000"	TokenNameStringLiteral	1000
,	TokenNameCOMMA	
"1010"	TokenNameStringLiteral	1010
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"40"	TokenNameStringLiteral	40
,	TokenNameCOMMA	
"50"	TokenNameStringLiteral	50
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens4	TokenNameIdentifier	 new Tokens4
,	TokenNameCOMMA	
expected4	TokenNameIdentifier	 expected4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testDifferenceToFetchOldWraps	TokenNameIdentifier	 test Difference To Fetch Old Wraps
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Range	TokenNameIdentifier	 Range
oldRange	TokenNameIdentifier	 old Range
=	TokenNameEQUAL	
makeRange	TokenNameIdentifier	 make Range
(	TokenNameLPAREN	
"1010"	TokenNameStringLiteral	1010
,	TokenNameCOMMA	
"40"	TokenNameStringLiteral	40
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// New range is entirely contained 	TokenNameCOMMENT_LINE	New range is entirely contained 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens1	TokenNameIdentifier	 new Tokens1
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"0"	TokenNameStringLiteral	0
,	TokenNameCOMMA	
"30"	TokenNameStringLiteral	30
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"0"	TokenNameStringLiteral	0
,	TokenNameCOMMA	
"40"	TokenNameStringLiteral	40
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"10"	TokenNameStringLiteral	10
,	TokenNameCOMMA	
"40"	TokenNameStringLiteral	40
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected1	TokenNameIdentifier	 expected1
=	TokenNameEQUAL	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens1	TokenNameIdentifier	 new Tokens1
,	TokenNameCOMMA	
expected1	TokenNameIdentifier	 expected1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Right half of the new range is needed 	TokenNameCOMMENT_LINE	Right half of the new range is needed 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens2	TokenNameIdentifier	 new Tokens2
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"0"	TokenNameStringLiteral	0
,	TokenNameCOMMA	
"50"	TokenNameStringLiteral	50
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"10"	TokenNameStringLiteral	10
,	TokenNameCOMMA	
"50"	TokenNameStringLiteral	50
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"40"	TokenNameStringLiteral	40
,	TokenNameCOMMA	
"50"	TokenNameStringLiteral	50
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected2	TokenNameIdentifier	 expected2
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"40"	TokenNameStringLiteral	40
,	TokenNameCOMMA	
"50"	TokenNameStringLiteral	50
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens2	TokenNameIdentifier	 new Tokens2
,	TokenNameCOMMA	
expected2	TokenNameIdentifier	 expected2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Whole range is needed 	TokenNameCOMMENT_LINE	Whole range is needed 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens3	TokenNameIdentifier	 new Tokens3
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"50"	TokenNameStringLiteral	50
,	TokenNameCOMMA	
"90"	TokenNameStringLiteral	90
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected3	TokenNameIdentifier	 expected3
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"50"	TokenNameStringLiteral	50
,	TokenNameCOMMA	
"90"	TokenNameStringLiteral	90
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens3	TokenNameIdentifier	 new Tokens3
,	TokenNameCOMMA	
expected3	TokenNameIdentifier	 expected3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Both ends of the new range overlaps the old range 	TokenNameCOMMENT_LINE	Both ends of the new range overlaps the old range 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens4	TokenNameIdentifier	 new Tokens4
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"10"	TokenNameStringLiteral	10
,	TokenNameCOMMA	
"1010"	TokenNameStringLiteral	1010
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"40"	TokenNameStringLiteral	40
,	TokenNameCOMMA	
"1010"	TokenNameStringLiteral	1010
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"10"	TokenNameStringLiteral	10
,	TokenNameCOMMA	
"1030"	TokenNameStringLiteral	1030
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"40"	TokenNameStringLiteral	40
,	TokenNameCOMMA	
"1030"	TokenNameStringLiteral	1030
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected4	TokenNameIdentifier	 expected4
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"40"	TokenNameStringLiteral	40
,	TokenNameCOMMA	
"1010"	TokenNameStringLiteral	1010
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens4	TokenNameIdentifier	 new Tokens4
,	TokenNameCOMMA	
expected4	TokenNameIdentifier	 expected4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Only RHS of the new range overlaps the old range 	TokenNameCOMMENT_LINE	Only RHS of the new range overlaps the old range 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens5	TokenNameIdentifier	 new Tokens5
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"60"	TokenNameStringLiteral	60
,	TokenNameCOMMA	
"1010"	TokenNameStringLiteral	1010
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"60"	TokenNameStringLiteral	60
,	TokenNameCOMMA	
"1030"	TokenNameStringLiteral	1030
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected5	TokenNameIdentifier	 expected5
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"60"	TokenNameStringLiteral	60
,	TokenNameCOMMA	
"1010"	TokenNameStringLiteral	1010
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens5	TokenNameIdentifier	 new Tokens5
,	TokenNameCOMMA	
expected5	TokenNameIdentifier	 expected5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testDifferenceToFetchNewWraps	TokenNameIdentifier	 test Difference To Fetch New Wraps
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Range	TokenNameIdentifier	 Range
oldRange	TokenNameIdentifier	 old Range
=	TokenNameEQUAL	
makeRange	TokenNameIdentifier	 make Range
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
,	TokenNameCOMMA	
"40"	TokenNameStringLiteral	40
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Only the LHS of the new range is needed 	TokenNameCOMMENT_LINE	Only the LHS of the new range is needed 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens1	TokenNameIdentifier	 new Tokens1
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"1010"	TokenNameStringLiteral	1010
,	TokenNameCOMMA	
"0"	TokenNameStringLiteral	0
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"1010"	TokenNameStringLiteral	1010
,	TokenNameCOMMA	
"10"	TokenNameStringLiteral	10
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"1010"	TokenNameStringLiteral	1010
,	TokenNameCOMMA	
"40"	TokenNameStringLiteral	40
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected1	TokenNameIdentifier	 expected1
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"1010"	TokenNameStringLiteral	1010
,	TokenNameCOMMA	
"0"	TokenNameStringLiteral	0
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens1	TokenNameIdentifier	 new Tokens1
,	TokenNameCOMMA	
expected1	TokenNameIdentifier	 expected1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Both ends of the new range are needed 	TokenNameCOMMENT_LINE	Both ends of the new range are needed 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens2	TokenNameIdentifier	 new Tokens2
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"1010"	TokenNameStringLiteral	1010
,	TokenNameCOMMA	
"50"	TokenNameStringLiteral	50
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected2	TokenNameIdentifier	 expected2
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"1010"	TokenNameStringLiteral	1010
,	TokenNameCOMMA	
"0"	TokenNameStringLiteral	0
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"40"	TokenNameStringLiteral	40
,	TokenNameCOMMA	
"50"	TokenNameStringLiteral	50
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens2	TokenNameIdentifier	 new Tokens2
,	TokenNameCOMMA	
expected2	TokenNameIdentifier	 expected2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldRange	TokenNameIdentifier	 old Range
=	TokenNameEQUAL	
makeRange	TokenNameIdentifier	 make Range
(	TokenNameLPAREN	
"20"	TokenNameStringLiteral	20
,	TokenNameCOMMA	
"40"	TokenNameStringLiteral	40
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Whole new range is needed 	TokenNameCOMMENT_LINE	Whole new range is needed 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens3	TokenNameIdentifier	 new Tokens3
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"1010"	TokenNameStringLiteral	1010
,	TokenNameCOMMA	
"0"	TokenNameStringLiteral	0
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected3	TokenNameIdentifier	 expected3
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"1010"	TokenNameStringLiteral	1010
,	TokenNameCOMMA	
"0"	TokenNameStringLiteral	0
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens3	TokenNameIdentifier	 new Tokens3
,	TokenNameCOMMA	
expected3	TokenNameIdentifier	 expected3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Whole new range is needed (matching endpoints) 	TokenNameCOMMENT_LINE	Whole new range is needed (matching endpoints) 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens4	TokenNameIdentifier	 new Tokens4
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"1010"	TokenNameStringLiteral	1010
,	TokenNameCOMMA	
"20"	TokenNameStringLiteral	20
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected4	TokenNameIdentifier	 expected4
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"1010"	TokenNameStringLiteral	1010
,	TokenNameCOMMA	
"20"	TokenNameStringLiteral	20
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens4	TokenNameIdentifier	 new Tokens4
,	TokenNameCOMMA	
expected4	TokenNameIdentifier	 expected4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Only RHS of new range is needed 	TokenNameCOMMENT_LINE	Only RHS of new range is needed 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens5	TokenNameIdentifier	 new Tokens5
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"30"	TokenNameStringLiteral	30
,	TokenNameCOMMA	
"0"	TokenNameStringLiteral	0
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"40"	TokenNameStringLiteral	40
,	TokenNameCOMMA	
"0"	TokenNameStringLiteral	0
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected5	TokenNameIdentifier	 expected5
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"40"	TokenNameStringLiteral	40
,	TokenNameCOMMA	
"0"	TokenNameStringLiteral	0
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens5	TokenNameIdentifier	 new Tokens5
,	TokenNameCOMMA	
expected5	TokenNameIdentifier	 expected5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Only RHS of new range is needed (matching endpoints) 	TokenNameCOMMENT_LINE	Only RHS of new range is needed (matching endpoints) 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTokens6	TokenNameIdentifier	 new Tokens6
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"30"	TokenNameStringLiteral	30
,	TokenNameCOMMA	
"20"	TokenNameStringLiteral	20
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"40"	TokenNameStringLiteral	40
,	TokenNameCOMMA	
"20"	TokenNameStringLiteral	20
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected6	TokenNameIdentifier	 expected6
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"40"	TokenNameStringLiteral	40
,	TokenNameCOMMA	
"20"	TokenNameStringLiteral	20
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkDifference	TokenNameIdentifier	 check Difference
(	TokenNameLPAREN	
oldRange	TokenNameIdentifier	 old Range
,	TokenNameCOMMA	
newTokens6	TokenNameIdentifier	 new Tokens6
,	TokenNameCOMMA	
expected6	TokenNameIdentifier	 expected6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
RingPosition	TokenNameIdentifier	 Ring Position
>	TokenNameGREATER	
void	TokenNamevoid	
assertNormalize	TokenNameIdentifier	 assert Normalize
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
Range	TokenNameIdentifier	 Range
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
:	TokenNameCOLON	
"Expecting "	TokenNameStringLiteral	Expecting 
+	TokenNamePLUS	
expected	TokenNameIdentifier	 expected
+	TokenNamePLUS	
" but got "	TokenNameStringLiteral	 but got 
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testNormalizeNoop	TokenNameIdentifier	 test Normalize Noop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>>	TokenNameRIGHT_SHIFT	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"4"	TokenNameStringLiteral	4
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNormalize	TokenNameIdentifier	 assert Normalize
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testNormalizeSimpleOverlap	TokenNameIdentifier	 test Normalize Simple Overlap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>>	TokenNameRIGHT_SHIFT	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"3"	TokenNameStringLiteral	3
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNormalize	TokenNameIdentifier	 assert Normalize
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNormalize	TokenNameIdentifier	 assert Normalize
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testNormalizeSort	TokenNameIdentifier	 test Normalize Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>>	TokenNameRIGHT_SHIFT	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"4"	TokenNameStringLiteral	4
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"4"	TokenNameStringLiteral	4
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNormalize	TokenNameIdentifier	 assert Normalize
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testNormalizeUnwrap	TokenNameIdentifier	 test Normalize Unwrap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>>	TokenNameRIGHT_SHIFT	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"9"	TokenNameStringLiteral	9
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"9"	TokenNameStringLiteral	9
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNormalize	TokenNameIdentifier	 assert Normalize
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testNormalizeComplex	TokenNameIdentifier	 test Normalize Complex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>>	TokenNameRIGHT_SHIFT	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"8"	TokenNameStringLiteral	8
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"7"	TokenNameStringLiteral	7
,	TokenNameCOMMA	
"9"	TokenNameStringLiteral	9
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"4"	TokenNameStringLiteral	4
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"4"	TokenNameStringLiteral	4
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"7"	TokenNameStringLiteral	7
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNormalize	TokenNameIdentifier	 assert Normalize
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"5"	TokenNameStringLiteral	5
,	TokenNameCOMMA	
"9"	TokenNameStringLiteral	9
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
,	TokenNameCOMMA	
"9"	TokenNameStringLiteral	9
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNormalize	TokenNameIdentifier	 assert Normalize
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"9"	TokenNameStringLiteral	9
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"4"	TokenNameStringLiteral	4
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNormalize	TokenNameIdentifier	 assert Normalize
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"4"	TokenNameStringLiteral	4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"4"	TokenNameStringLiteral	4
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
"5"	TokenNameStringLiteral	5
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNormalize	TokenNameIdentifier	 assert Normalize
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
