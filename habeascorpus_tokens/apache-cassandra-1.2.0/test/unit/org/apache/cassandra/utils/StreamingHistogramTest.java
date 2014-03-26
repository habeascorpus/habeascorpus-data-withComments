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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInputStream	TokenNameIdentifier	 Data Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
public	TokenNamepublic	
class	TokenNameclass	
StreamingHistogramTest	TokenNameIdentifier	 Streaming Histogram Test
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testFunction	TokenNameIdentifier	 test Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
hist	TokenNameIdentifier	 hist
=	TokenNameEQUAL	
new	TokenNamenew	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
samples	TokenNameIdentifier	 samples
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
36	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
45	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// add 7 points to histogram of 5 bins 	TokenNameCOMMENT_LINE	add 7 points to histogram of 5 bins 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hist	TokenNameIdentifier	 hist
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
samples	TokenNameIdentifier	 samples
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// should end up (2,1),(9.5,2),(17.5,2),(23,1),(36,1) 	TokenNameCOMMENT_LINE	should end up (2,1),(9.5,2),(17.5,2),(23,1),(36,1) 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
expected1	TokenNameIdentifier	 expected1
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected1	TokenNameIdentifier	 expected1
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
2.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected1	TokenNameIdentifier	 expected1
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
9.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected1	TokenNameIdentifier	 expected1
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
17.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected1	TokenNameIdentifier	 expected1
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
23.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected1	TokenNameIdentifier	 expected1
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
36.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
expectedItr	TokenNameIdentifier	 expected Itr
=	TokenNameEQUAL	
expected1	TokenNameIdentifier	 expected1
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
actual	TokenNameIdentifier	 actual
:	TokenNameCOLON	
hist	TokenNameIdentifier	 hist
.	TokenNameDOT	
getAsMap	TokenNameIdentifier	 get As Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
expectedItr	TokenNameIdentifier	 expected Itr
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.01	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// merge test 	TokenNameCOMMENT_LINE	merge test 
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
hist2	TokenNameIdentifier	 hist2
=	TokenNameEQUAL	
new	TokenNamenew	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
samples	TokenNameIdentifier	 samples
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hist2	TokenNameIdentifier	 hist2
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
samples	TokenNameIdentifier	 samples
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
hist	TokenNameIdentifier	 hist
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
hist2	TokenNameIdentifier	 hist2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// should end up (2,1),(9.5,2),(19.33,3),(32.67,3),(45,1) 	TokenNameCOMMENT_LINE	should end up (2,1),(9.5,2),(19.33,3),(32.67,3),(45,1) 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
expected2	TokenNameIdentifier	 expected2
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected2	TokenNameIdentifier	 expected2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
2.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected2	TokenNameIdentifier	 expected2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
9.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected2	TokenNameIdentifier	 expected2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
19.33	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected2	TokenNameIdentifier	 expected2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
32.67	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
3L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected2	TokenNameIdentifier	 expected2
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
45.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedItr	TokenNameIdentifier	 expected Itr
=	TokenNameEQUAL	
expected2	TokenNameIdentifier	 expected2
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
actual	TokenNameIdentifier	 actual
:	TokenNameCOLON	
hist	TokenNameIdentifier	 hist
.	TokenNameDOT	
getAsMap	TokenNameIdentifier	 get As Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
expectedItr	TokenNameIdentifier	 expected Itr
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.01	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// sum test 	TokenNameCOMMENT_LINE	sum test 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3.28	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
hist	TokenNameIdentifier	 hist
.	TokenNameDOT	
sum	TokenNameIdentifier	 sum
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.01	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// sum test (b > max(hist)) 	TokenNameCOMMENT_LINE	sum test (b > max(hist)) 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
10.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
hist	TokenNameIdentifier	 hist
.	TokenNameDOT	
sum	TokenNameIdentifier	 sum
(	TokenNameLPAREN	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.01	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testSerDe	TokenNameIdentifier	 test Ser De
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
hist	TokenNameIdentifier	 hist
=	TokenNameEQUAL	
new	TokenNamenew	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
samples	TokenNameIdentifier	 samples
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
36	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// add 7 points to histogram of 5 bins 	TokenNameCOMMENT_LINE	add 7 points to histogram of 5 bins 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
samples	TokenNameIdentifier	 samples
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hist	TokenNameIdentifier	 hist
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
samples	TokenNameIdentifier	 samples
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
hist	TokenNameIdentifier	 hist
,	TokenNameCOMMA	
new	TokenNamenew	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
deserialized	TokenNameIdentifier	 deserialized
=	TokenNameEQUAL	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// deserialized histogram should have following values 	TokenNameCOMMENT_LINE	deserialized histogram should have following values 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
expected1	TokenNameIdentifier	 expected1
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected1	TokenNameIdentifier	 expected1
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
2.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected1	TokenNameIdentifier	 expected1
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
9.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected1	TokenNameIdentifier	 expected1
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
17.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected1	TokenNameIdentifier	 expected1
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
23.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected1	TokenNameIdentifier	 expected1
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
36.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
expectedItr	TokenNameIdentifier	 expected Itr
=	TokenNameEQUAL	
expected1	TokenNameIdentifier	 expected1
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
actual	TokenNameIdentifier	 actual
:	TokenNameCOLON	
deserialized	TokenNameIdentifier	 deserialized
.	TokenNameDOT	
getAsMap	TokenNameIdentifier	 get As Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
expectedItr	TokenNameIdentifier	 expected Itr
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.01	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
