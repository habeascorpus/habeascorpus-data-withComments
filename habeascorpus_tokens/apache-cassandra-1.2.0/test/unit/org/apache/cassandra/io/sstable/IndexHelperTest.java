/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
marshal	TokenNameIdentifier	 marshal
.	TokenNameDOT	
AbstractType	TokenNameIdentifier	 Abstract Type
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
marshal	TokenNameIdentifier	 marshal
.	TokenNameDOT	
IntegerType	TokenNameIdentifier	 Integer Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
IndexInfo	TokenNameIdentifier	 Index Info
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
IndexHelperTest	TokenNameIdentifier	 Index Helper Test
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testIndexHelper	TokenNameIdentifier	 test Index Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexInfo	TokenNameIdentifier	 Index Info
>	TokenNameGREATER	
indexes	TokenNameIdentifier	 indexes
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
IndexInfo	TokenNameIdentifier	 Index Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexes	TokenNameIdentifier	 indexes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
IndexInfo	TokenNameIdentifier	 Index Info
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
5L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexes	TokenNameIdentifier	 indexes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
IndexInfo	TokenNameIdentifier	 Index Info
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
10L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
15L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexes	TokenNameIdentifier	 indexes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
IndexInfo	TokenNameIdentifier	 Index Info
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
20L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
25L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractType	TokenNameIdentifier	 Abstract Type
comp	TokenNameIdentifier	 comp
=	TokenNameEQUAL	
IntegerType	TokenNameIdentifier	 Integer Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
5L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
12L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
17L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
100L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
100L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
100L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
100L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
100L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
5L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
17L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
100L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
100L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
12L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
100L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
100L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
100L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
indexes	TokenNameIdentifier	 indexes
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
