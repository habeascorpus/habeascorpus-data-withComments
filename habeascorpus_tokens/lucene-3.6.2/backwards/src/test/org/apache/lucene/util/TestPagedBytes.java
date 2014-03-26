/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
DataOutput	TokenNameIdentifier	 Data Output
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestPagedBytes	TokenNameIdentifier	 Test Paged Bytes
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDataInputOutput	TokenNameIdentifier	 test Data Input Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PagedBytes	TokenNameIdentifier	 Paged Bytes
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
PagedBytes	TokenNameIdentifier	 Paged Bytes
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getDataOutput	TokenNameIdentifier	 get Data Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numBytes	TokenNameIdentifier	 num Bytes
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
10000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
answer	TokenNameIdentifier	 answer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
numBytes	TokenNameIdentifier	 num Bytes
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextBytes	TokenNameIdentifier	 next Bytes
(	TokenNameLPAREN	
answer	TokenNameIdentifier	 answer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
written	TokenNameIdentifier	 written
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
written	TokenNameIdentifier	 written
<	TokenNameLESS	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
answer	TokenNameIdentifier	 answer
[	TokenNameLBRACKET	
written	TokenNameIdentifier	 written
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numBytes	TokenNameIdentifier	 num Bytes
-	TokenNameMINUS	
written	TokenNameIdentifier	 written
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
answer	TokenNameIdentifier	 answer
,	TokenNameCOMMA	
written	TokenNameIdentifier	 written
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
written	TokenNameIdentifier	 written
+=	TokenNamePLUS_EQUAL	
chunk	TokenNameIdentifier	 chunk
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
freeze	TokenNameIdentifier	 freeze
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getDataInput	TokenNameIdentifier	 get Data Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
verify	TokenNameIdentifier	 verify
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
numBytes	TokenNameIdentifier	 num Bytes
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
read	TokenNameIdentifier	 read
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
read	TokenNameIdentifier	 read
<	TokenNameLESS	
numBytes	TokenNameIdentifier	 num Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
verify	TokenNameIdentifier	 verify
[	TokenNameLBRACKET	
read	TokenNameIdentifier	 read
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numBytes	TokenNameIdentifier	 num Bytes
-	TokenNameMINUS	
read	TokenNameIdentifier	 read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
verify	TokenNameIdentifier	 verify
,	TokenNameCOMMA	
read	TokenNameIdentifier	 read
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
read	TokenNameIdentifier	 read
+=	TokenNamePLUS_EQUAL	
chunk	TokenNameIdentifier	 chunk
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
answer	TokenNameIdentifier	 answer
,	TokenNameCOMMA	
verify	TokenNameIdentifier	 verify
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
