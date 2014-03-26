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
security	TokenNameIdentifier	 security
.	TokenNameDOT	
MessageDigest	TokenNameIdentifier	 Message Digest
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
NoSuchAlgorithmException	TokenNameIdentifier	 No Such Algorithm Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
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
Set	TokenNameIdentifier	 Set
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
/** * The goods are here: www.ietf.org/rfc/rfc4122.txt. */	TokenNameCOMMENT_JAVADOC	 The goods are here: www.ietf.org/rfc/rfc4122.txt. 
public	TokenNamepublic	
class	TokenNameclass	
UUIDGen	TokenNameIdentifier	 UUID Gen
{	TokenNameLBRACE	
// A grand day! millis at 00:00:00.000 15 Oct 1582. 	TokenNameCOMMENT_LINE	A grand day! millis at 00:00:00.000 15 Oct 1582. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
START_EPOCH	TokenNameIdentifier	 START  EPOCH
=	TokenNameEQUAL	
-	TokenNameMINUS	
12219292800000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
clockSeqAndNode	TokenNameIdentifier	 clock Seq And Node
=	TokenNameEQUAL	
makeClockSeqAndNode	TokenNameIdentifier	 make Clock Seq And Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// placement of this singleton is important. It needs to be instantiated *AFTER* the other statics. 	TokenNameCOMMENT_LINE	placement of this singleton is important. It needs to be instantiated *AFTER* the other statics. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
UUIDGen	TokenNameIdentifier	 UUID Gen
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
UUIDGen	TokenNameIdentifier	 UUID Gen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
lastNanos	TokenNameIdentifier	 last Nanos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
UUIDGen	TokenNameIdentifier	 UUID Gen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// make sure someone didn't whack the clockSeqAndNode by changing the order of instantiation. 	TokenNameCOMMENT_LINE	make sure someone didn't whack the clockSeqAndNode by changing the order of instantiation. 
if	TokenNameif	
(	TokenNameLPAREN	
clockSeqAndNode	TokenNameIdentifier	 clock Seq And Node
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"singleton instantiation is misplaced."	TokenNameStringLiteral	singleton instantiation is misplaced.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a type 1 UUID (time-based UUID). * * @return a UUID instance */	TokenNameCOMMENT_JAVADOC	 Creates a type 1 UUID (time-based UUID). * @return a UUID instance 
public	TokenNamepublic	
static	TokenNamestatic	
UUID	TokenNameIdentifier	 UUID
getTimeUUID	TokenNameIdentifier	 get Time UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
UUID	TokenNameIdentifier	 UUID
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
createTimeSafe	TokenNameIdentifier	 create Time Safe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
clockSeqAndNode	TokenNameIdentifier	 clock Seq And Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** creates a type 1 uuid from raw bytes. */	TokenNameCOMMENT_JAVADOC	 creates a type 1 uuid from raw bytes. 
public	TokenNamepublic	
static	TokenNamestatic	
UUID	TokenNameIdentifier	 UUID
getUUID	TokenNameIdentifier	 get UUID
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
raw	TokenNameIdentifier	 raw
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
UUID	TokenNameIdentifier	 UUID
(	TokenNameLPAREN	
raw	TokenNameIdentifier	 raw
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
raw	TokenNameIdentifier	 raw
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
raw	TokenNameIdentifier	 raw
.	TokenNameDOT	
getLong	TokenNameIdentifier	 get Long
(	TokenNameLPAREN	
raw	TokenNameIdentifier	 raw
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** decomposes a uuid into raw bytes. */	TokenNameCOMMENT_JAVADOC	 decomposes a uuid into raw bytes. 
public	TokenNamepublic	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
uuid	TokenNameIdentifier	 uuid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
most	TokenNameIdentifier	 most
=	TokenNameEQUAL	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
getMostSignificantBits	TokenNameIdentifier	 get Most Significant Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
least	TokenNameIdentifier	 least
=	TokenNameEQUAL	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
getLeastSignificantBits	TokenNameIdentifier	 get Least Significant Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
16	TokenNameIntegerLiteral	
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
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
most	TokenNameIdentifier	 most
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
least	TokenNameIdentifier	 least
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a 16 byte representation of a type 1 UUID (a time-based UUID), * based on the current system time. * * @return a type 1 UUID represented as a byte[] */	TokenNameCOMMENT_JAVADOC	 Returns a 16 byte representation of a type 1 UUID (a time-based UUID), based on the current system time. * @return a type 1 UUID represented as a byte[] 
public	TokenNamepublic	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTimeUUIDBytes	TokenNameIdentifier	 get Time UUID Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createTimeUUIDBytes	TokenNameIdentifier	 create Time UUID Bytes
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
createTimeSafe	TokenNameIdentifier	 create Time Safe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a milliseconds-since-epoch timestamp into the 16 byte representation * of a type 1 UUID (a time-based UUID). * * <p><i><b>Warning:</b> This method is not guaranteed to return unique UUIDs; Multiple * invocations using identical timestamps will result in identical UUIDs.</i></p> * * @param timeMillis * @return a type 1 UUID represented as a byte[] */	TokenNameCOMMENT_JAVADOC	 Converts a milliseconds-since-epoch timestamp into the 16 byte representation of a type 1 UUID (a time-based UUID). * <p><i><b>Warning:</b> This method is not guaranteed to return unique UUIDs; Multiple invocations using identical timestamps will result in identical UUIDs.</i></p> * @param timeMillis @return a type 1 UUID represented as a byte[] 
public	TokenNamepublic	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTimeUUIDBytes	TokenNameIdentifier	 get Time UUID Bytes
(	TokenNameLPAREN	
long	TokenNamelong	
timeMillis	TokenNameIdentifier	 time Millis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createTimeUUIDBytes	TokenNameIdentifier	 create Time UUID Bytes
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
createTimeUnsafe	TokenNameIdentifier	 create Time Unsafe
(	TokenNameLPAREN	
timeMillis	TokenNameIdentifier	 time Millis
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a 100-nanoseconds precision timestamp into the 16 byte representation * of a type 1 UUID (a time-based UUID). * * To specify a 100-nanoseconds precision timestamp, one should provide a milliseconds timestamp and * a number 0 <= n < 10000 such that n*100 is the number of nanoseconds within that millisecond. * * <p><i><b>Warning:</b> This method is not guaranteed to return unique UUIDs; Multiple * invocations using identical timestamps will result in identical UUIDs.</i></p> * * @return a type 1 UUID represented as a byte[] */	TokenNameCOMMENT_JAVADOC	 Converts a 100-nanoseconds precision timestamp into the 16 byte representation of a type 1 UUID (a time-based UUID). * To specify a 100-nanoseconds precision timestamp, one should provide a milliseconds timestamp and a number 0 <= n < 10000 such that n*100 is the number of nanoseconds within that millisecond. * <p><i><b>Warning:</b> This method is not guaranteed to return unique UUIDs; Multiple invocations using identical timestamps will result in identical UUIDs.</i></p> * @return a type 1 UUID represented as a byte[] 
public	TokenNamepublic	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTimeUUIDBytes	TokenNameIdentifier	 get Time UUID Bytes
(	TokenNameLPAREN	
long	TokenNamelong	
timeMillis	TokenNameIdentifier	 time Millis
,	TokenNameCOMMA	
int	TokenNameint	
nanos	TokenNameIdentifier	 nanos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nanos	TokenNameIdentifier	 nanos
>=	TokenNameGREATER_EQUAL	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
createTimeUUIDBytes	TokenNameIdentifier	 create Time UUID Bytes
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
createTimeUnsafe	TokenNameIdentifier	 create Time Unsafe
(	TokenNameLPAREN	
timeMillis	TokenNameIdentifier	 time Millis
,	TokenNameCOMMA	
nanos	TokenNameIdentifier	 nanos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
createTimeUUIDBytes	TokenNameIdentifier	 create Time UUID Bytes
(	TokenNameLPAREN	
long	TokenNamelong	
msb	TokenNameIdentifier	 msb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
lsb	TokenNameIdentifier	 lsb
=	TokenNameEQUAL	
clockSeqAndNode	TokenNameIdentifier	 clock Seq And Node
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
uuidBytes	TokenNameIdentifier	 uuid Bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
16	TokenNameIntegerLiteral	
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
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
uuidBytes	TokenNameIdentifier	 uuid Bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
msb	TokenNameIdentifier	 msb
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
uuidBytes	TokenNameIdentifier	 uuid Bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
lsb	TokenNameIdentifier	 lsb
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
uuidBytes	TokenNameIdentifier	 uuid Bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a milliseconds-since-epoch value for a type-1 UUID. * * @param uuid a type-1 (time-based) UUID * @return the number of milliseconds since the unix epoch * @throws IllegalArgumentException if the UUID is not version 1 */	TokenNameCOMMENT_JAVADOC	 Returns a milliseconds-since-epoch value for a type-1 UUID. * @param uuid a type-1 (time-based) UUID @return the number of milliseconds since the unix epoch @throws IllegalArgumentException if the UUID is not version 1 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
getAdjustedTimestamp	TokenNameIdentifier	 get Adjusted Timestamp
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
uuid	TokenNameIdentifier	 uuid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
version	TokenNameIdentifier	 version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"incompatible with uuid version: "	TokenNameStringLiteral	incompatible with uuid version: 
+	TokenNamePLUS	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
version	TokenNameIdentifier	 version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
START_EPOCH	TokenNameIdentifier	 START  EPOCH
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
long	TokenNamelong	
makeClockSeqAndNode	TokenNameIdentifier	 make Clock Seq And Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
clock	TokenNameIdentifier	 clock
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
nextLong	TokenNameIdentifier	 next Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
lsb	TokenNameIdentifier	 lsb
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lsb	TokenNameIdentifier	 lsb
|=	TokenNameOR_EQUAL	
0x8000000000000000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// variant (2 bits) 	TokenNameCOMMENT_LINE	variant (2 bits) 
lsb	TokenNameIdentifier	 lsb
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
clock	TokenNameIdentifier	 clock
&	TokenNameAND	
0x0000000000003FFFL	TokenNameLongLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
48	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// clock sequence (14 bits) 	TokenNameCOMMENT_LINE	clock sequence (14 bits) 
lsb	TokenNameIdentifier	 lsb
|=	TokenNameOR_EQUAL	
makeNode	TokenNameIdentifier	 make Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 6 bytes 	TokenNameCOMMENT_LINE	6 bytes 
return	TokenNamereturn	
lsb	TokenNameIdentifier	 lsb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// needs to return two different values for the same when. 	TokenNameCOMMENT_LINE	needs to return two different values for the same when. 
// we can generate at most 10k UUIDs per ms. 	TokenNameCOMMENT_LINE	we can generate at most 10k UUIDs per ms. 
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
long	TokenNamelong	
createTimeSafe	TokenNameIdentifier	 create Time Safe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
nanosSince	TokenNameIdentifier	 nanos Since
=	TokenNameEQUAL	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
START_EPOCH	TokenNameIdentifier	 START  EPOCH
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nanosSince	TokenNameIdentifier	 nanos Since
>	TokenNameGREATER	
lastNanos	TokenNameIdentifier	 last Nanos
)	TokenNameRPAREN	
lastNanos	TokenNameIdentifier	 last Nanos
=	TokenNameEQUAL	
nanosSince	TokenNameIdentifier	 nanos Since
;	TokenNameSEMICOLON	
else	TokenNameelse	
nanosSince	TokenNameIdentifier	 nanos Since
=	TokenNameEQUAL	
++	TokenNamePLUS_PLUS	
lastNanos	TokenNameIdentifier	 last Nanos
;	TokenNameSEMICOLON	
return	TokenNamereturn	
createTime	TokenNameIdentifier	 create Time
(	TokenNameLPAREN	
nanosSince	TokenNameIdentifier	 nanos Since
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
long	TokenNamelong	
createTimeUnsafe	TokenNameIdentifier	 create Time Unsafe
(	TokenNameLPAREN	
long	TokenNamelong	
when	TokenNameIdentifier	 when
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createTimeUnsafe	TokenNameIdentifier	 create Time Unsafe
(	TokenNameLPAREN	
when	TokenNameIdentifier	 when
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
long	TokenNamelong	
createTimeUnsafe	TokenNameIdentifier	 create Time Unsafe
(	TokenNameLPAREN	
long	TokenNamelong	
when	TokenNameIdentifier	 when
,	TokenNameCOMMA	
int	TokenNameint	
nanos	TokenNameIdentifier	 nanos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
nanosSince	TokenNameIdentifier	 nanos Since
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
when	TokenNameIdentifier	 when
-	TokenNameMINUS	
START_EPOCH	TokenNameIdentifier	 START  EPOCH
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
nanos	TokenNameIdentifier	 nanos
;	TokenNameSEMICOLON	
return	TokenNamereturn	
createTime	TokenNameIdentifier	 create Time
(	TokenNameLPAREN	
nanosSince	TokenNameIdentifier	 nanos Since
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
long	TokenNamelong	
createTime	TokenNameIdentifier	 create Time
(	TokenNameLPAREN	
long	TokenNamelong	
nanosSince	TokenNameIdentifier	 nanos Since
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
msb	TokenNameIdentifier	 msb
=	TokenNameEQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
msb	TokenNameIdentifier	 msb
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
0x00000000ffffffffL	TokenNameLongLiteral	
&	TokenNameAND	
nanosSince	TokenNameIdentifier	 nanos Since
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
msb	TokenNameIdentifier	 msb
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
0x0000ffff00000000L	TokenNameLongLiteral	
&	TokenNameAND	
nanosSince	TokenNameIdentifier	 nanos Since
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
msb	TokenNameIdentifier	 msb
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
0xffff000000000000L	TokenNameLongLiteral	
&	TokenNameAND	
nanosSince	TokenNameIdentifier	 nanos Since
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
48	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
msb	TokenNameIdentifier	 msb
|=	TokenNameOR_EQUAL	
0x0000000000001000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// sets the version to 1. 	TokenNameCOMMENT_LINE	sets the version to 1. 
return	TokenNamereturn	
msb	TokenNameIdentifier	 msb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
long	TokenNamelong	
makeNode	TokenNameIdentifier	 make Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * We don't have access to the MAC address but need to generate a node part * that identify this host as uniquely as possible. * The spec says that one option is to take as many source that identify * this node as possible and hash them together. That's what we do here by * gathering all the ip of this host. * Note that FBUtilities.getBroadcastAddress() should be enough to uniquely * identify the node *in the cluster* but it triggers DatabaseDescriptor * instanciation and the UUID generator is used in Stress for instance, * where we don't want to require the yaml. */	TokenNameCOMMENT_BLOCK	 We don't have access to the MAC address but need to generate a node part that identify this host as uniquely as possible. The spec says that one option is to take as many source that identify this node as possible and hash them together. That's what we do here by gathering all the ip of this host. Note that FBUtilities.getBroadcastAddress() should be enough to uniquely identify the node *in the cluster* but it triggers DatabaseDescriptor instanciation and the UUID generator is used in Stress for instance, where we don't want to require the yaml. 
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
localAddresses	TokenNameIdentifier	 local Addresses
=	TokenNameEQUAL	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getAllLocalAddresses	TokenNameIdentifier	 get All Local Addresses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
localAddresses	TokenNameIdentifier	 local Addresses
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Cannot generate the node component of the UUID because cannot retrieve any IP addresses."	TokenNameStringLiteral	Cannot generate the node component of the UUID because cannot retrieve any IP addresses.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ideally, we'd use the MAC address, but java doesn't expose that. 	TokenNameCOMMENT_LINE	ideally, we'd use the MAC address, but java doesn't expose that. 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
localAddresses	TokenNameIdentifier	 local Addresses
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
node	TokenNameIdentifier	 node
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
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
0x00000000000000ff	TokenNameIntegerLiteral	
&	TokenNameAND	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
hash	TokenNameIdentifier	 hash
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
(	TokenNameLPAREN	
0xff00000000000000L	TokenNameLongLiteral	
&	TokenNameAND	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Since we don't use the mac address, the spec says that multicast 	TokenNameCOMMENT_LINE	Since we don't use the mac address, the spec says that multicast 
// bit (least significant bit of the first octet of the node ID) must be 1. 	TokenNameCOMMENT_LINE	bit (least significant bit of the first octet of the node ID) must be 1. 
return	TokenNamereturn	
node	TokenNameIdentifier	 node
|	TokenNameOR	
0x0000010000000000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
MessageDigest	TokenNameIdentifier	 Message Digest
messageDigest	TokenNameIdentifier	 message Digest
=	TokenNameEQUAL	
MessageDigest	TokenNameIdentifier	 Message Digest
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
"MD5"	TokenNameStringLiteral	MD5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
addr	TokenNameIdentifier	 addr
:	TokenNameCOLON	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
messageDigest	TokenNameIdentifier	 message Digest
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
addr	TokenNameIdentifier	 addr
.	TokenNameDOT	
getAddress	TokenNameIdentifier	 get Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
messageDigest	TokenNameIdentifier	 message Digest
.	TokenNameDOT	
digest	TokenNameIdentifier	 digest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchAlgorithmException	TokenNameIdentifier	 No Such Algorithm Exception
nsae	TokenNameIdentifier	 nsae
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"MD5 digest algorithm is not available"	TokenNameStringLiteral	MD5 digest algorithm is not available
,	TokenNameCOMMA	
nsae	TokenNameIdentifier	 nsae
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// for the curious, here is how I generated START_EPOCH 	TokenNameCOMMENT_LINE	for the curious, here is how I generated START_EPOCH 
// Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT-0")); 	TokenNameCOMMENT_LINE	Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT-0")); 
// c.set(Calendar.YEAR, 1582); 	TokenNameCOMMENT_LINE	c.set(Calendar.YEAR, 1582); 
// c.set(Calendar.MONTH, Calendar.OCTOBER); 	TokenNameCOMMENT_LINE	c.set(Calendar.MONTH, Calendar.OCTOBER); 
// c.set(Calendar.DAY_OF_MONTH, 15); 	TokenNameCOMMENT_LINE	c.set(Calendar.DAY_OF_MONTH, 15); 
// c.set(Calendar.HOUR_OF_DAY, 0); 	TokenNameCOMMENT_LINE	c.set(Calendar.HOUR_OF_DAY, 0); 
// c.set(Calendar.MINUTE, 0); 	TokenNameCOMMENT_LINE	c.set(Calendar.MINUTE, 0); 
// c.set(Calendar.SECOND, 0); 	TokenNameCOMMENT_LINE	c.set(Calendar.SECOND, 0); 
// c.set(Calendar.MILLISECOND, 0); 	TokenNameCOMMENT_LINE	c.set(Calendar.MILLISECOND, 0); 
// long START_EPOCH = c.getTimeInMillis(); 	TokenNameCOMMENT_LINE	long START_EPOCH = c.getTimeInMillis(); 
