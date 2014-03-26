package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PagedBytes	TokenNameIdentifier	 Paged Bytes
.	TokenNameDOT	
PagedBytesDataInput	TokenNameIdentifier	 Paged Bytes Data Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PagedBytes	TokenNameIdentifier	 Paged Bytes
.	TokenNameDOT	
PagedBytesDataOutput	TokenNameIdentifier	 Paged Bytes Data Output
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Ignore	TokenNameIdentifier	 Ignore
;	TokenNameSEMICOLON	
@	TokenNameAT	
Ignore	TokenNameIdentifier	 Ignore
(	TokenNameLPAREN	
"You must increase heap to > 2 G to run this"	TokenNameStringLiteral	You must increase heap to > 2 G to run this
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
Test2BPagedBytes	TokenNameIdentifier	 Test2 B Paged Bytes
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test	TokenNameIdentifier	 test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PagedBytes	TokenNameIdentifier	 Paged Bytes
pb	TokenNameIdentifier	 pb
=	TokenNameEQUAL	
new	TokenNamenew	
PagedBytes	TokenNameIdentifier	 Paged Bytes
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PagedBytesDataOutput	TokenNameIdentifier	 Paged Bytes Data Output
dataOutput	TokenNameIdentifier	 data Output
=	TokenNameEQUAL	
pb	TokenNameIdentifier	 pb
.	TokenNameDOT	
getDataOutput	TokenNameIdentifier	 get Data Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
netBytes	TokenNameIdentifier	 net Bytes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
seed	TokenNameIdentifier	 seed
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextLong	TokenNameIdentifier	 next Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
lastFP	TokenNameIdentifier	 last FP
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Random	TokenNameIdentifier	 Random
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
netBytes	TokenNameIdentifier	 net Bytes
<	TokenNameLESS	
1.1	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
numBytes	TokenNameIdentifier	 num Bytes
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
r2	TokenNameIdentifier	 r2
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100000	TokenNameIntegerLiteral	
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
numBytes	TokenNameIdentifier	 num Bytes
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
nextBytes	TokenNameIdentifier	 next Bytes
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataOutput	TokenNameIdentifier	 data Output
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
fp	TokenNameIdentifier	 fp
=	TokenNameEQUAL	
dataOutput	TokenNameIdentifier	 data Output
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
fp	TokenNameIdentifier	 fp
==	TokenNameEQUAL_EQUAL	
lastFP	TokenNameIdentifier	 last FP
+	TokenNamePLUS	
numBytes	TokenNameIdentifier	 num Bytes
;	TokenNameSEMICOLON	
lastFP	TokenNameIdentifier	 last FP
=	TokenNameEQUAL	
fp	TokenNameIdentifier	 fp
;	TokenNameSEMICOLON	
netBytes	TokenNameIdentifier	 net Bytes
+=	TokenNamePLUS_EQUAL	
numBytes	TokenNameIdentifier	 num Bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pb	TokenNameIdentifier	 pb
.	TokenNameDOT	
freeze	TokenNameIdentifier	 freeze
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PagedBytesDataInput	TokenNameIdentifier	 Paged Bytes Data Input
dataInput	TokenNameIdentifier	 data Input
=	TokenNameEQUAL	
pb	TokenNameIdentifier	 pb
.	TokenNameDOT	
getDataInput	TokenNameIdentifier	 get Data Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastFP	TokenNameIdentifier	 last FP
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
netBytes	TokenNameIdentifier	 net Bytes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
netBytes	TokenNameIdentifier	 net Bytes
<	TokenNameLESS	
1.1	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
numBytes	TokenNameIdentifier	 num Bytes
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
r2	TokenNameIdentifier	 r2
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100000	TokenNameIntegerLiteral	
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
numBytes	TokenNameIdentifier	 num Bytes
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
r2	TokenNameIdentifier	 r2
.	TokenNameDOT	
nextBytes	TokenNameIdentifier	 next Bytes
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytesIn	TokenNameIdentifier	 bytes In
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
numBytes	TokenNameIdentifier	 num Bytes
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dataInput	TokenNameIdentifier	 data Input
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
bytesIn	TokenNameIdentifier	 bytes In
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
bytesIn	TokenNameIdentifier	 bytes In
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
fp	TokenNameIdentifier	 fp
=	TokenNameEQUAL	
dataInput	TokenNameIdentifier	 data Input
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
fp	TokenNameIdentifier	 fp
==	TokenNameEQUAL_EQUAL	
lastFP	TokenNameIdentifier	 last FP
+	TokenNamePLUS	
numBytes	TokenNameIdentifier	 num Bytes
;	TokenNameSEMICOLON	
lastFP	TokenNameIdentifier	 last FP
=	TokenNameEQUAL	
fp	TokenNameIdentifier	 fp
;	TokenNameSEMICOLON	
netBytes	TokenNameIdentifier	 net Bytes
+=	TokenNamePLUS_EQUAL	
numBytes	TokenNameIdentifier	 num Bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
