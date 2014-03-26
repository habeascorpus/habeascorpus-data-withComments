package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
TypeSizes	TokenNameIdentifier	 Type Sizes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ISerializer	TokenNameIdentifier	 I Serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
IntervalTreeTest	TokenNameIdentifier	 Interval Tree Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testSearch	TokenNameIdentifier	 test Search
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>>	TokenNameRIGHT_SHIFT	
intervals	TokenNameIdentifier	 intervals
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
-	TokenNameMINUS	
300	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
49	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
60	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IntervalTree	TokenNameIdentifier	 Interval Tree
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
,	TokenNameCOMMA	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>>	TokenNameRIGHT_SHIFT	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
IntervalTree	TokenNameIdentifier	 Interval Tree
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
intervals	TokenNameIdentifier	 intervals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>>	TokenNameRIGHT_SHIFT	
intervals2	TokenNameIdentifier	 intervals2
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//stravinsky 1880-1971 	TokenNameCOMMENT_LINE	stravinsky 1880-1971 
intervals2	TokenNameIdentifier	 intervals2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
1880	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1971	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Schoenberg 	TokenNameCOMMENT_LINE	Schoenberg 
intervals2	TokenNameIdentifier	 intervals2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
1874	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1951	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Grieg 	TokenNameCOMMENT_LINE	Grieg 
intervals2	TokenNameIdentifier	 intervals2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
1843	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1907	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Schubert 	TokenNameCOMMENT_LINE	Schubert 
intervals2	TokenNameIdentifier	 intervals2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
1779	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1828	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Mozart 	TokenNameCOMMENT_LINE	Mozart 
intervals2	TokenNameIdentifier	 intervals2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
1756	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1828	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Schuetz 	TokenNameCOMMENT_LINE	Schuetz 
intervals2	TokenNameIdentifier	 intervals2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
1585	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1672	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IntervalTree	TokenNameIdentifier	 Interval Tree
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
,	TokenNameCOMMA	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>>	TokenNameRIGHT_SHIFT	
it2	TokenNameIdentifier	 it2
=	TokenNameEQUAL	
IntervalTree	TokenNameIdentifier	 Interval Tree
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
intervals2	TokenNameIdentifier	 intervals2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
it2	TokenNameIdentifier	 it2
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
1829	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1842	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
intersection1	TokenNameIdentifier	 intersection1
=	TokenNameEQUAL	
it2	TokenNameIdentifier	 it2
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
1907	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1907	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
intersection1	TokenNameIdentifier	 intersection1
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intersection1	TokenNameIdentifier	 intersection1
=	TokenNameEQUAL	
it2	TokenNameIdentifier	 it2
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
1780	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1790	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
intersection1	TokenNameIdentifier	 intersection1
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testIteration	TokenNameIdentifier	 test Iteration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>>	TokenNameRIGHT_SHIFT	
intervals	TokenNameIdentifier	 intervals
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
-	TokenNameMINUS	
300	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
49	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
60	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IntervalTree	TokenNameIdentifier	 Interval Tree
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
,	TokenNameCOMMA	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>>	TokenNameRIGHT_SHIFT	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
IntervalTree	TokenNameIdentifier	 Interval Tree
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
intervals	TokenNameIdentifier	 intervals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
intervals	TokenNameIdentifier	 intervals
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
minOrdering	TokenNameIdentifier	 min Ordering
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>>	TokenNameRIGHT_SHIFT	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
it	TokenNameIdentifier	 it
)	TokenNameRPAREN	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
intervals	TokenNameIdentifier	 intervals
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testSerialization	TokenNameIdentifier	 test Serialization
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
intervals	TokenNameIdentifier	 intervals
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
-	TokenNameMINUS	
300	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"d"	TokenNameStringLiteral	d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"e"	TokenNameStringLiteral	e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"f"	TokenNameStringLiteral	f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"g"	TokenNameStringLiteral	g
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"h"	TokenNameStringLiteral	h
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"i"	TokenNameStringLiteral	i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"j"	TokenNameStringLiteral	j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"k"	TokenNameStringLiteral	k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intervals	TokenNameIdentifier	 intervals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
49	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
60	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"l"	TokenNameStringLiteral	l
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IntervalTree	TokenNameIdentifier	 Interval Tree
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
IntervalTree	TokenNameIdentifier	 Interval Tree
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
intervals	TokenNameIdentifier	 intervals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
IntervalTree	TokenNameIdentifier	 Interval Tree
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
IntervalTree	TokenNameIdentifier	 Interval Tree
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
(	TokenNameLPAREN	
new	TokenNamenew	
ISerializer	TokenNameIdentifier	 I Serializer
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
TypeSizes	TokenNameIdentifier	 Type Sizes
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
ISerializer	TokenNameIdentifier	 I Serializer
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
TypeSizes	TokenNameIdentifier	 Type Sizes
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
Interval	TokenNameIdentifier	 Interval
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
baos	TokenNameIdentifier	 baos
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
(	TokenNameLPAREN	
baos	TokenNameIdentifier	 baos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataInputStream	TokenNameIdentifier	 Data Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
baos	TokenNameIdentifier	 baos
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IntervalTree	TokenNameIdentifier	 Interval Tree
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
it2	TokenNameIdentifier	 it2
=	TokenNameEQUAL	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
intervals2	TokenNameIdentifier	 intervals2
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
it2	TokenNameIdentifier	 it2
)	TokenNameRPAREN	
intervals2	TokenNameIdentifier	 intervals2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
intervals	TokenNameIdentifier	 intervals
,	TokenNameCOMMA	
intervals2	TokenNameIdentifier	 intervals2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
