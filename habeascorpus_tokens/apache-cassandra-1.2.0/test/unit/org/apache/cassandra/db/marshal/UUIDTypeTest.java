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
/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
UUIDGen	TokenNameIdentifier	 UUID Gen
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
UUIDTypeTest	TokenNameIdentifier	 UUID Type Test
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
UUIDTypeTest	TokenNameIdentifier	 UUID Type Test
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UUIDType	TokenNameIdentifier	 UUID Type
uuidType	TokenNameIdentifier	 uuid Type
=	TokenNameEQUAL	
new	TokenNamenew	
UUIDType	TokenNameIdentifier	 UUID Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCompare	TokenNameIdentifier	 test Compare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UUID	TokenNameIdentifier	 UUID
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getTimeUUID	TokenNameIdentifier	 get Time UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UUID	TokenNameIdentifier	 UUID
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getTimeUUID	TokenNameIdentifier	 get Time UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testCompare	TokenNameIdentifier	 test Compare
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testCompare	TokenNameIdentifier	 test Compare
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testCompare	TokenNameIdentifier	 test Compare
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testCompare	TokenNameIdentifier	 test Compare
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testCompare	TokenNameIdentifier	 test Compare
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UUID	TokenNameIdentifier	 UUID
nullId	TokenNameIdentifier	 null Id
=	TokenNameEQUAL	
new	TokenNamenew	
UUID	TokenNameIdentifier	 UUID
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testCompare	TokenNameIdentifier	 test Compare
(	TokenNameLPAREN	
nullId	TokenNameIdentifier	 null Id
,	TokenNameCOMMA	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testCompare	TokenNameIdentifier	 test Compare
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
nullId	TokenNameIdentifier	 null Id
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testCompare	TokenNameIdentifier	 test Compare
(	TokenNameLPAREN	
nullId	TokenNameIdentifier	 null Id
,	TokenNameCOMMA	
nullId	TokenNameIdentifier	 null Id
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
<	TokenNameLESS	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UUID	TokenNameIdentifier	 UUID
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
UUID	TokenNameIdentifier	 UUID
.	TokenNameDOT	
randomUUID	TokenNameIdentifier	 random UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UUID	TokenNameIdentifier	 UUID
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
UUID	TokenNameIdentifier	 UUID
.	TokenNameDOT	
randomUUID	TokenNameIdentifier	 random UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testCompare	TokenNameIdentifier	 test Compare
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
,	TokenNameCOMMA	
r2	TokenNameIdentifier	 r2
,	TokenNameCOMMA	
compareUUID	TokenNameIdentifier	 compare UUID
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
,	TokenNameCOMMA	
r2	TokenNameIdentifier	 r2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testCompare	TokenNameIdentifier	 test Compare
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
,	TokenNameCOMMA	
r1	TokenNameIdentifier	 r1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testCompare	TokenNameIdentifier	 test Compare
(	TokenNameLPAREN	
r2	TokenNameIdentifier	 r2
,	TokenNameCOMMA	
r2	TokenNameIdentifier	 r2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testCompare	TokenNameIdentifier	 test Compare
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
r1	TokenNameIdentifier	 r1
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testCompare	TokenNameIdentifier	 test Compare
(	TokenNameLPAREN	
r2	TokenNameIdentifier	 r2
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
compareUnsigned	TokenNameIdentifier	 compare Unsigned
(	TokenNameLPAREN	
long	TokenNamelong	
n1	TokenNameIdentifier	 n1
,	TokenNameCOMMA	
long	TokenNamelong	
n2	TokenNameIdentifier	 n2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n1	TokenNameIdentifier	 n1
==	TokenNameEQUAL_EQUAL	
n2	TokenNameIdentifier	 n2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
n1	TokenNameIdentifier	 n1
<	TokenNameLESS	
n2	TokenNameIdentifier	 n2
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
n1	TokenNameIdentifier	 n1
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
n2	TokenNameIdentifier	 n2
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
compareUUID	TokenNameIdentifier	 compare UUID
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
u1	TokenNameIdentifier	 u1
,	TokenNameCOMMA	
UUID	TokenNameIdentifier	 UUID
u2	TokenNameIdentifier	 u2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
compareUnsigned	TokenNameIdentifier	 compare Unsigned
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
.	TokenNameDOT	
getMostSignificantBits	TokenNameIdentifier	 get Most Significant Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
u2	TokenNameIdentifier	 u2
.	TokenNameDOT	
getMostSignificantBits	TokenNameIdentifier	 get Most Significant Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
compareUnsigned	TokenNameIdentifier	 compare Unsigned
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
.	TokenNameDOT	
getLeastSignificantBits	TokenNameIdentifier	 get Least Significant Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
u2	TokenNameIdentifier	 u2
.	TokenNameDOT	
getLeastSignificantBits	TokenNameIdentifier	 get Least Significant Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
describeCompare	TokenNameIdentifier	 describe Compare
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
u1	TokenNameIdentifier	 u1
,	TokenNameCOMMA	
UUID	TokenNameIdentifier	 UUID
u2	TokenNameIdentifier	 u2
,	TokenNameCOMMA	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
tb1	TokenNameIdentifier	 tb1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"null"	TokenNameStringLiteral	null
:	TokenNameCOLON	
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
.	TokenNameDOT	
version	TokenNameIdentifier	 version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"time-based "	TokenNameStringLiteral	time-based 
:	TokenNameCOLON	
"random "	TokenNameStringLiteral	random 
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tb2	TokenNameIdentifier	 tb2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
u2	TokenNameIdentifier	 u2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"null"	TokenNameStringLiteral	null
:	TokenNameCOLON	
(	TokenNameLPAREN	
u2	TokenNameIdentifier	 u2
.	TokenNameDOT	
version	TokenNameIdentifier	 version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"time-based "	TokenNameStringLiteral	time-based 
:	TokenNameCOLON	
"random "	TokenNameStringLiteral	random 
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
comp	TokenNameIdentifier	 comp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
" < "	TokenNameStringLiteral	 < 
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
" = "	TokenNameStringLiteral	 = 
:	TokenNameCOLON	
" > "	TokenNameStringLiteral	 > 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tb1	TokenNameIdentifier	 tb1
+	TokenNamePLUS	
u1	TokenNameIdentifier	 u1
+	TokenNamePLUS	
comp	TokenNameIdentifier	 comp
+	TokenNamePLUS	
tb2	TokenNameIdentifier	 tb2
+	TokenNamePLUS	
u2	TokenNameIdentifier	 u2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
sign	TokenNameIdentifier	 sign
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
uuid	TokenNameIdentifier	 uuid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
;	TokenNameSEMICOLON	
long	TokenNamelong	
msb	TokenNameIdentifier	 msb
=	TokenNameEQUAL	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
getMostSignificantBits	TokenNameIdentifier	 get Most Significant Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
lsb	TokenNameIdentifier	 lsb
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
bytes	TokenNameIdentifier	 bytes
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
bytes	TokenNameIdentifier	 bytes
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
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
bytes	TokenNameIdentifier	 bytes
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
}	TokenNameRBRACE	
return	TokenNamereturn	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
logJdkUUIDCompareToVariance	TokenNameIdentifier	 log Jdk UUID Compare To Variance
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
u1	TokenNameIdentifier	 u1
,	TokenNameCOMMA	
UUID	TokenNameIdentifier	 UUID
u2	TokenNameIdentifier	 u2
,	TokenNameCOMMA	
int	TokenNameint	
expC	TokenNameIdentifier	 exp C
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
u2	TokenNameIdentifier	 u2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
.	TokenNameDOT	
version	TokenNameIdentifier	 version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
u2	TokenNameIdentifier	 u2
.	TokenNameDOT	
version	TokenNameIdentifier	 version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
.	TokenNameDOT	
version	TokenNameIdentifier	 version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
u2	TokenNameIdentifier	 u2
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
expC	TokenNameIdentifier	 exp C
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"*** Note: java.util.UUID.compareTo() would have compared this differently"	TokenNameStringLiteral	*** Note: java.util.UUID.compareTo() would have compared this differently
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCompare	TokenNameIdentifier	 test Compare
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
u1	TokenNameIdentifier	 u1
,	TokenNameCOMMA	
UUID	TokenNameIdentifier	 UUID
u2	TokenNameIdentifier	 u2
,	TokenNameCOMMA	
int	TokenNameint	
expC	TokenNameIdentifier	 exp C
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
sign	TokenNameIdentifier	 sign
(	TokenNameLPAREN	
uuidType	TokenNameIdentifier	 uuid Type
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
u2	TokenNameIdentifier	 u2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expC	TokenNameIdentifier	 exp C
=	TokenNameEQUAL	
sign	TokenNameIdentifier	 sign
(	TokenNameLPAREN	
expC	TokenNameIdentifier	 exp C
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Expected "	TokenNameStringLiteral	Expected 
+	TokenNamePLUS	
describeCompare	TokenNameIdentifier	 describe Compare
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
,	TokenNameCOMMA	
u2	TokenNameIdentifier	 u2
,	TokenNameCOMMA	
expC	TokenNameIdentifier	 exp C
)	TokenNameRPAREN	
+	TokenNamePLUS	
", got "	TokenNameStringLiteral	, got 
+	TokenNamePLUS	
describeCompare	TokenNameIdentifier	 describe Compare
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
,	TokenNameCOMMA	
u2	TokenNameIdentifier	 u2
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
expC	TokenNameIdentifier	 exp C
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
.	TokenNameDOT	
version	TokenNameIdentifier	 version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
u2	TokenNameIdentifier	 u2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
u2	TokenNameIdentifier	 u2
.	TokenNameDOT	
version	TokenNameIdentifier	 version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
sign	TokenNameIdentifier	 sign
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
u2	TokenNameIdentifier	 u2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logJdkUUIDCompareToVariance	TokenNameIdentifier	 log Jdk UUID Compare To Variance
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
,	TokenNameCOMMA	
u2	TokenNameIdentifier	 u2
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testTimeEquality	TokenNameIdentifier	 test Time Equality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
uuidType	TokenNameIdentifier	 uuid Type
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testTimeSmaller	TokenNameIdentifier	 test Time Smaller
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
assert	TokenNameassert	
uuidType	TokenNameIdentifier	 uuid Type
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
uuidType	TokenNameIdentifier	 uuid Type
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
uuidType	TokenNameIdentifier	 uuid Type
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
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
testTimeBigger	TokenNameIdentifier	 test Time Bigger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
assert	TokenNameassert	
uuidType	TokenNameIdentifier	 uuid Type
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
uuidType	TokenNameIdentifier	 uuid Type
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
uuidType	TokenNameIdentifier	 uuid Type
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytebuffer	TokenNameIdentifier	 bytebuffer
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
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
uuidType	TokenNameIdentifier	 uuid Type
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
}	TokenNameRBRACE	
