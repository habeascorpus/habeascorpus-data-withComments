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
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestPriorityQueue	TokenNameIdentifier	 Test Priority Queue
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
IntegerQueue	TokenNameIdentifier	 Integer Queue
extends	TokenNameextends	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
IntegerQueue	TokenNameIdentifier	 Integer Queue
(	TokenNameLPAREN	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
<	TokenNameLESS	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPQ	TokenNameIdentifier	 test PQ
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
testPQ	TokenNameIdentifier	 test PQ
(	TokenNameLPAREN	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
testPQ	TokenNameIdentifier	 test PQ
(	TokenNameLPAREN	
int	TokenNameint	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
Random	TokenNameIdentifier	 Random
gen	TokenNameIdentifier	 gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
pq	TokenNameIdentifier	 pq
=	TokenNameEQUAL	
new	TokenNamenew	
IntegerQueue	TokenNameIdentifier	 Integer Queue
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sum2	TokenNameIdentifier	 sum2
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
gen	TokenNameIdentifier	 gen
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Date end = new Date(); 	TokenNameCOMMENT_LINE	Date end = new Date(); 
// System.out.print(((float)(end.getTime()-start.getTime()) / count) * 1000); 	TokenNameCOMMENT_LINE	System.out.print(((float)(end.getTime()-start.getTime()) / count) * 1000); 
// System.out.println(" microseconds/put"); 	TokenNameCOMMENT_LINE	System.out.println(" microseconds/put"); 
// start = new Date(); 	TokenNameCOMMENT_LINE	start = new Date(); 
int	TokenNameint	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sum2	TokenNameIdentifier	 sum2
+=	TokenNamePLUS_EQUAL	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
sum	TokenNameIdentifier	 sum
,	TokenNameCOMMA	
sum2	TokenNameIdentifier	 sum2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// end = new Date(); 	TokenNameCOMMENT_LINE	end = new Date(); 
// System.out.print(((float)(end.getTime()-start.getTime()) / count) * 1000); 	TokenNameCOMMENT_LINE	System.out.print(((float)(end.getTime()-start.getTime()) / count) * 1000); 
// System.out.println(" microseconds/pop"); 	TokenNameCOMMENT_LINE	System.out.println(" microseconds/pop"); 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testClear	TokenNameIdentifier	 test Clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
pq	TokenNameIdentifier	 pq
=	TokenNameEQUAL	
new	TokenNamenew	
IntegerQueue	TokenNameIdentifier	 Integer Queue
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFixedSize	TokenNameIdentifier	 test Fixed Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
pq	TokenNameIdentifier	 pq
=	TokenNameEQUAL	
new	TokenNamenew	
IntegerQueue	TokenNameIdentifier	 Integer Queue
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
top	TokenNameIdentifier	 top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInsertWithOverflow	TokenNameIdentifier	 test Insert With Overflow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
pq	TokenNameIdentifier	 pq
=	TokenNameEQUAL	
new	TokenNamenew	
IntegerQueue	TokenNameIdentifier	 Integer Queue
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
i1	TokenNameIdentifier	 i1
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
i2	TokenNameIdentifier	 i2
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
i3	TokenNameIdentifier	 i3
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
i4	TokenNameIdentifier	 i4
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
i5	TokenNameIdentifier	 i5
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
i6	TokenNameIdentifier	 i6
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
i1	TokenNameIdentifier	 i1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
i2	TokenNameIdentifier	 i2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
i3	TokenNameIdentifier	 i3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
i4	TokenNameIdentifier	 i4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
i5	TokenNameIdentifier	 i5
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
i3	TokenNameIdentifier	 i3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// i3 should have been dropped 	TokenNameCOMMENT_LINE	i3 should have been dropped 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
i6	TokenNameIdentifier	 i6
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
i6	TokenNameIdentifier	 i6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// i6 should not have been inserted 	TokenNameCOMMENT_LINE	i6 should not have been inserted 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
top	TokenNameIdentifier	 top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
