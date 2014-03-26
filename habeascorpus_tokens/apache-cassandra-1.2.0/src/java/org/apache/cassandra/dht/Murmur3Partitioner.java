/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
math	TokenNameIdentifier	 math
.	TokenNameDOT	
BigDecimal	TokenNameIdentifier	 Big Decimal
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
math	TokenNameIdentifier	 math
.	TokenNameDOT	
BigInteger	TokenNameIdentifier	 Big Integer
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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
Map	TokenNameIdentifier	 Map
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
DecoratedKey	TokenNameIdentifier	 Decorated Key
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
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
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
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
FBUtilities	TokenNameIdentifier	 FB Utilities
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
MurmurHash	TokenNameIdentifier	 Murmur Hash
;	TokenNameSEMICOLON	
/** * This class generates a BigIntegerToken using a Murmur3 hash. */	TokenNameCOMMENT_JAVADOC	 This class generates a BigIntegerToken using a Murmur3 hash. 
public	TokenNamepublic	
class	TokenNameclass	
Murmur3Partitioner	TokenNameIdentifier	 Murmur3 Partitioner
extends	TokenNameextends	
AbstractPartitioner	TokenNameIdentifier	 Abstract Partitioner
<	TokenNameLESS	
LongToken	TokenNameIdentifier	 Long Token
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
LongToken	TokenNameIdentifier	 Long Token
MINIMUM	TokenNameIdentifier	 MINIMUM
=	TokenNameEQUAL	
new	TokenNamenew	
LongToken	TokenNameIdentifier	 Long Token
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
MAXIMUM	TokenNameIdentifier	 MAXIMUM
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DecoratedKey	TokenNameIdentifier	 Decorated Key
convertFromDiskFormat	TokenNameIdentifier	 convert From Disk Format
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DecoratedKey	TokenNameIdentifier	 Decorated Key
decorateKey	TokenNameIdentifier	 decorate Key
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DecoratedKey	TokenNameIdentifier	 Decorated Key
(	TokenNameLPAREN	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
midpoint	TokenNameIdentifier	 midpoint
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
lToken	TokenNameIdentifier	 l Token
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
rToken	TokenNameIdentifier	 r Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// using BigInteger to avoid long overflow in intermediate operations 	TokenNameCOMMENT_LINE	using BigInteger to avoid long overflow in intermediate operations 
BigInteger	TokenNameIdentifier	 Big Integer
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LongToken	TokenNameIdentifier	 Long Token
)	TokenNameRPAREN	
lToken	TokenNameIdentifier	 l Token
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LongToken	TokenNameIdentifier	 Long Token
)	TokenNameRPAREN	
rToken	TokenNameIdentifier	 r Token
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
,	TokenNameCOMMA	
midpoint	TokenNameIdentifier	 midpoint
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
midpoint	TokenNameIdentifier	 midpoint
=	TokenNameEQUAL	
sum	TokenNameIdentifier	 sum
.	TokenNameDOT	
shiftRight	TokenNameIdentifier	 shift Right
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
// wrapping case 	TokenNameCOMMENT_LINE	wrapping case 
{	TokenNameLBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
MAXIMUM	TokenNameIdentifier	 MAXIMUM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BigInteger	TokenNameIdentifier	 Big Integer
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
MINIMUM	TokenNameIdentifier	 MINIMUM
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// length of range we're bisecting is (R - min) + (max - L) 	TokenNameCOMMENT_LINE	length of range we're bisecting is (R - min) + (max - L) 
// so we add that to L giving 	TokenNameCOMMENT_LINE	so we add that to L giving 
// L + ((R - min) + (max - L) / 2) = (L + R + max - min) / 2 	TokenNameCOMMENT_LINE	L + ((R - min) + (max - L) / 2) = (L + R + max - min) / 2 
midpoint	TokenNameIdentifier	 midpoint
=	TokenNameEQUAL	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
shiftRight	TokenNameIdentifier	 shift Right
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
midpoint	TokenNameIdentifier	 midpoint
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
midpoint	TokenNameIdentifier	 midpoint
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
midpoint	TokenNameIdentifier	 midpoint
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
LongToken	TokenNameIdentifier	 Long Token
(	TokenNameLPAREN	
midpoint	TokenNameIdentifier	 midpoint
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LongToken	TokenNameIdentifier	 Long Token
getMinimumToken	TokenNameIdentifier	 get Minimum Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MINIMUM	TokenNameIdentifier	 MINIMUM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Generate the token of a key. * Note that we need to ensure all generated token are strictly bigger than MINIMUM. * In particular we don't want MINIMUM to correspond to any key because the range (MINIMUM, X] doesn't * include MINIMUM but we use such range to select all data whose token is smaller than X. */	TokenNameCOMMENT_JAVADOC	 Generate the token of a key. Note that we need to ensure all generated token are strictly bigger than MINIMUM. In particular we don't want MINIMUM to correspond to any key because the range (MINIMUM, X] doesn't include MINIMUM but we use such range to select all data whose token is smaller than X. 
public	TokenNamepublic	
LongToken	TokenNameIdentifier	 Long Token
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
MINIMUM	TokenNameIdentifier	 MINIMUM
;	TokenNameSEMICOLON	
long	TokenNamelong	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
MurmurHash	TokenNameIdentifier	 Murmur Hash
.	TokenNameDOT	
hash3_x64_128	TokenNameIdentifier	 hash3 x64 128
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
LongToken	TokenNameIdentifier	 Long Token
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LongToken	TokenNameIdentifier	 Long Token
getRandomToken	TokenNameIdentifier	 get Random Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
LongToken	TokenNameIdentifier	 Long Token
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
threadLocalRandom	TokenNameIdentifier	 thread Local Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
nextLong	TokenNameIdentifier	 next Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
long	TokenNamelong	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
long	TokenNamelong	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We exclude the MINIMUM value; see getToken() 	TokenNameCOMMENT_LINE	We exclude the MINIMUM value; see getToken() 
return	TokenNamereturn	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
?	TokenNameQUESTION	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
:	TokenNameCOLON	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
preservesOrder	TokenNameIdentifier	 preserves Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
describeOwnership	TokenNameIdentifier	 describe Ownership
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
sortedTokens	TokenNameIdentifier	 sorted Tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
ownerships	TokenNameIdentifier	 ownerships
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
sortedTokens	TokenNameIdentifier	 sorted Tokens
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 0-case 	TokenNameCOMMENT_LINE	0-case 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"No nodes present in the cluster. How did you call this?"	TokenNameStringLiteral	No nodes present in the cluster. How did you call this?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 1-case 	TokenNameCOMMENT_LINE	1-case 
if	TokenNameif	
(	TokenNameLPAREN	
sortedTokens	TokenNameIdentifier	 sorted Tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
ownerships	TokenNameIdentifier	 ownerships
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// n-case 	TokenNameCOMMENT_LINE	n-case 
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
ri	TokenNameIdentifier	 ri
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
MAXIMUM	TokenNameIdentifier	 MAXIMUM
)	TokenNameRPAREN	
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
MINIMUM	TokenNameIdentifier	 MINIMUM
.	TokenNameDOT	
token	TokenNameIdentifier	 token
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// (used for addition later) 	TokenNameCOMMENT_LINE	(used for addition later) 
final	TokenNamefinal	
BigDecimal	TokenNameIdentifier	 Big Decimal
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
ri	TokenNameIdentifier	 ri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BigInteger	TokenNameIdentifier	 Big Integer
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LongToken	TokenNameIdentifier	 Long Token
)	TokenNameRPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The first token and its value 	TokenNameCOMMENT_LINE	The first token and its value 
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
BigInteger	TokenNameIdentifier	 Big Integer
tim1	TokenNameIdentifier	 tim1
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
;	TokenNameSEMICOLON	
// The last token and its value (after loop) 	TokenNameCOMMENT_LINE	The last token and its value (after loop) 
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LongToken	TokenNameIdentifier	 Long Token
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The next token and its value 	TokenNameCOMMENT_LINE	The next token and its value 
float	TokenNamefloat	
age	TokenNameIdentifier	 age
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
tim1	TokenNameIdentifier	 tim1
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ri	TokenNameIdentifier	 ri
)	TokenNameRPAREN	
.	TokenNameDOT	
mod	TokenNameIdentifier	 mod
(	TokenNameLPAREN	
ri	TokenNameIdentifier	 ri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
divide	TokenNameIdentifier	 divide
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
ROUND_HALF_EVEN	TokenNameIdentifier	 ROUND  HALF  EVEN
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %age = ((T(i) - T(i-1) + R) % R) / R 	TokenNameCOMMENT_LINE	%age = ((T(i) - T(i-1) + R) % R) / R 
ownerships	TokenNameIdentifier	 ownerships
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
age	TokenNameIdentifier	 age
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// save (T(i) -> %age) 	TokenNameCOMMENT_LINE	save (T(i) -> %age) 
tim1	TokenNameIdentifier	 tim1
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
;	TokenNameSEMICOLON	
// -> advance loop 	TokenNameCOMMENT_LINE	-> advance loop 
}	TokenNameRBRACE	
// The start token's range extends backward to the last token, which is why both were saved above. 	TokenNameCOMMENT_LINE	The start token's range extends backward to the last token, which is why both were saved above. 
float	TokenNamefloat	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LongToken	TokenNameIdentifier	 Long Token
)	TokenNameRPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ri	TokenNameIdentifier	 ri
)	TokenNameRPAREN	
.	TokenNameDOT	
mod	TokenNameIdentifier	 mod
(	TokenNameLPAREN	
ri	TokenNameIdentifier	 ri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
divide	TokenNameIdentifier	 divide
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
BigDecimal	TokenNameIdentifier	 Big Decimal
.	TokenNameDOT	
ROUND_HALF_EVEN	TokenNameIdentifier	 ROUND  HALF  EVEN
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ownerships	TokenNameIdentifier	 ownerships
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ownerships	TokenNameIdentifier	 ownerships
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
TokenFactory	TokenNameIdentifier	 Token Factory
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
getTokenFactory	TokenNameIdentifier	 get Token Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenFactory	TokenNameIdentifier	 token Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
TokenFactory	TokenNameIdentifier	 Token Factory
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
tokenFactory	TokenNameIdentifier	 token Factory
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
TokenFactory	TokenNameIdentifier	 Token Factory
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
longToken	TokenNameIdentifier	 long Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
longToken	TokenNameIdentifier	 long Token
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
fromByteArray	TokenNameIdentifier	 from Byte Array
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
LongToken	TokenNameIdentifier	 Long Token
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
longToken	TokenNameIdentifier	 long Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
longToken	TokenNameIdentifier	 long Token
.	TokenNameDOT	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Long	TokenNameIdentifier	 Long
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
LongToken	TokenNameIdentifier	 Long Token
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
