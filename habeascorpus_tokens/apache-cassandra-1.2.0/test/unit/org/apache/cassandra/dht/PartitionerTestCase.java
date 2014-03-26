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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Before	TokenNameIdentifier	 Before
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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
fail	TokenNameIdentifier	 fail
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
PartitionerTestCase	TokenNameIdentifier	 Partitioner Test Case
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
{	TokenNameLBRACE	
protected	TokenNameprotected	
IPartitioner	TokenNameIdentifier	 I Partitioner
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
partitioner	TokenNameIdentifier	 partitioner
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
initPartitioner	TokenNameIdentifier	 init Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Before	TokenNameIdentifier	 Before
public	TokenNamepublic	
void	TokenNamevoid	
clean	TokenNameIdentifier	 clean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initPartitioner	TokenNameIdentifier	 init Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
T	TokenNameIdentifier	 T
tok	TokenNameIdentifier	 tok
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
partitioner	TokenNameIdentifier	 partitioner
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
T	TokenNameIdentifier	 T
tok	TokenNameIdentifier	 tok
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tok	TokenNameIdentifier	 tok
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Recurses randomly to the given depth a few times. */	TokenNameCOMMENT_JAVADOC	 Recurses randomly to the given depth a few times. 
public	TokenNamepublic	
void	TokenNamevoid	
assertMidpoint	TokenNameIdentifier	 assert Midpoint
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Random	TokenNameIdentifier	 Random
rand	TokenNameIdentifier	 rand
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
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
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertMidpoint	TokenNameIdentifier	 assert Midpoint
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
rand	TokenNameIdentifier	 rand
,	TokenNameCOMMA	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertMidpoint	TokenNameIdentifier	 assert Midpoint
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
Random	TokenNameIdentifier	 Random
rand	TokenNameIdentifier	 rand
,	TokenNameCOMMA	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
partitioner	TokenNameIdentifier	 partitioner
.	TokenNameDOT	
midpoint	TokenNameIdentifier	 midpoint
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
mid	TokenNameIdentifier	 mid
)	TokenNameRPAREN	
:	TokenNameCOLON	
"For "	TokenNameStringLiteral	For 
+	TokenNamePLUS	
left	TokenNameIdentifier	 left
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
right	TokenNameIdentifier	 right
+	TokenNamePLUS	
": range did not contain mid:"	TokenNameStringLiteral	: range did not contain mid:
+	TokenNamePLUS	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rand	TokenNameIdentifier	 rand
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
assertMidpoint	TokenNameIdentifier	 assert Midpoint
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
mid	TokenNameIdentifier	 mid
,	TokenNameCOMMA	
rand	TokenNameIdentifier	 rand
,	TokenNameCOMMA	
depth	TokenNameIdentifier	 depth
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
assertMidpoint	TokenNameIdentifier	 assert Midpoint
(	TokenNameLPAREN	
mid	TokenNameIdentifier	 mid
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
rand	TokenNameIdentifier	 rand
,	TokenNameCOMMA	
depth	TokenNameIdentifier	 depth
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testMidpoint	TokenNameIdentifier	 test Midpoint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertMidpoint	TokenNameIdentifier	 assert Midpoint
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tok	TokenNameIdentifier	 tok
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertMidpoint	TokenNameIdentifier	 assert Midpoint
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tok	TokenNameIdentifier	 tok
(	TokenNameLPAREN	
"bbb"	TokenNameStringLiteral	bbb
)	TokenNameRPAREN	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testMidpointMinimum	TokenNameIdentifier	 test Midpoint Minimum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
midpointMinimumTestCase	TokenNameIdentifier	 midpoint Minimum Test Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
midpointMinimumTestCase	TokenNameIdentifier	 midpoint Minimum Test Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
T	TokenNameIdentifier	 T
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
126	TokenNameIntegerLiteral	
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
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testMidpointWrapping	TokenNameIdentifier	 test Midpoint Wrapping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertMidpoint	TokenNameIdentifier	 assert Midpoint
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
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
tok	TokenNameIdentifier	 tok
(	TokenNameLPAREN	
"bbb"	TokenNameStringLiteral	bbb
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tok	TokenNameIdentifier	 tok
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testTokenFactoryBytes	TokenNameIdentifier	 test Token Factory Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
TokenFactory	TokenNameIdentifier	 Token Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
partitioner	TokenNameIdentifier	 partitioner
.	TokenNameDOT	
getTokenFactory	TokenNameIdentifier	 get Token Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
tok	TokenNameIdentifier	 tok
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
fromByteArray	TokenNameIdentifier	 from Byte Array
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testTokenFactoryStrings	TokenNameIdentifier	 test Token Factory Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
TokenFactory	TokenNameIdentifier	 Token Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
partitioner	TokenNameIdentifier	 partitioner
.	TokenNameDOT	
getTokenFactory	TokenNameIdentifier	 get Token Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
tok	TokenNameIdentifier	 tok
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testDescribeOwnership	TokenNameIdentifier	 test Describe Ownership
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
testDescribeOwnershipWith	TokenNameIdentifier	 test Describe Ownership With
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// success 	TokenNameCOMMENT_LINE	success 
}	TokenNameRBRACE	
testDescribeOwnershipWith	TokenNameIdentifier	 test Describe Ownership With
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testDescribeOwnershipWith	TokenNameIdentifier	 test Describe Ownership With
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testDescribeOwnershipWith	TokenNameIdentifier	 test Describe Ownership With
(	TokenNameLPAREN	
256	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
testDescribeOwnershipWith	TokenNameIdentifier	 test Describe Ownership With
(	TokenNameLPAREN	
int	TokenNameint	
numTokens	TokenNameIdentifier	 num Tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
numTokens	TokenNameIdentifier	 num Tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
randomToken	TokenNameIdentifier	 random Token
=	TokenNameEQUAL	
partitioner	TokenNameIdentifier	 partitioner
.	TokenNameDOT	
getRandomToken	TokenNameIdentifier	 get Random Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
randomToken	TokenNameIdentifier	 random Token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
randomToken	TokenNameIdentifier	 random Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
owns	TokenNameIdentifier	 owns
=	TokenNameEQUAL	
partitioner	TokenNameIdentifier	 partitioner
.	TokenNameDOT	
describeOwnership	TokenNameIdentifier	 describe Ownership
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
totalOwnership	TokenNameIdentifier	 total Ownership
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
float	TokenNamefloat	
ownership	TokenNameIdentifier	 ownership
:	TokenNameCOLON	
owns	TokenNameIdentifier	 owns
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
totalOwnership	TokenNameIdentifier	 total Ownership
+=	TokenNamePLUS_EQUAL	
ownership	TokenNameIdentifier	 ownership
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
totalOwnership	TokenNameIdentifier	 total Ownership
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
