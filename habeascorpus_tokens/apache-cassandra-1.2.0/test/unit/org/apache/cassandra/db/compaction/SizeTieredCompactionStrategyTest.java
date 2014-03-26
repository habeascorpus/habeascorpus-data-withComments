/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
compaction	TokenNameIdentifier	 compaction
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
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
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
SchemaLoader	TokenNameIdentifier	 Schema Loader
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
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
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
Table	TokenNameIdentifier	 Table
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
Pair	TokenNameIdentifier	 Pair
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SizeTieredCompactionStrategyTest	TokenNameIdentifier	 Size Tiered Compaction Strategy Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testGetBuckets	TokenNameIdentifier	 test Get Buckets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
pairs	TokenNameIdentifier	 pairs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
strings	TokenNameIdentifier	 strings
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"bbbb"	TokenNameStringLiteral	bbbb
,	TokenNameCOMMA	
"cccccccc"	TokenNameStringLiteral	cccccccc
,	TokenNameCOMMA	
"cccccccc"	TokenNameStringLiteral	cccccccc
,	TokenNameCOMMA	
"bbbb"	TokenNameStringLiteral	bbbb
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
st	TokenNameIdentifier	 st
:	TokenNameCOLON	
strings	TokenNameIdentifier	 strings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
pair	TokenNameIdentifier	 pair
=	TokenNameEQUAL	
Pair	TokenNameIdentifier	 Pair
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
,	TokenNameCOMMA	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pairs	TokenNameIdentifier	 pairs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pair	TokenNameIdentifier	 pair
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ColumnFamilyStore	TokenNameIdentifier	 Column Family Store
cfs	TokenNameIdentifier	 cfs
=	TokenNameEQUAL	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
)	TokenNameRPAREN	
.	TokenNameDOT	
getColumnFamilyStore	TokenNameIdentifier	 get Column Family Store
(	TokenNameLPAREN	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
opts	TokenNameIdentifier	 opts
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
opts	TokenNameIdentifier	 opts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SizeTieredCompactionStrategy	TokenNameIdentifier	 Size Tiered Compaction Strategy
.	TokenNameDOT	
MIN_SSTABLE_SIZE_KEY	TokenNameIdentifier	 MIN  SSTABLE  SIZE  KEY
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SizeTieredCompactionStrategy	TokenNameIdentifier	 Size Tiered Compaction Strategy
strategy	TokenNameIdentifier	 strategy
=	TokenNameEQUAL	
new	TokenNamenew	
SizeTieredCompactionStrategy	TokenNameIdentifier	 Size Tiered Compaction Strategy
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
buckets	TokenNameIdentifier	 buckets
=	TokenNameEQUAL	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
getBuckets	TokenNameIdentifier	 get Buckets
(	TokenNameLPAREN	
pairs	TokenNameIdentifier	 pairs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
bucket	TokenNameIdentifier	 bucket
:	TokenNameCOLON	
buckets	TokenNameIdentifier	 buckets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pairs	TokenNameIdentifier	 pairs
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
strings2	TokenNameIdentifier	 strings2
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"aaa"	TokenNameStringLiteral	aaa
,	TokenNameCOMMA	
"bbbbbbbb"	TokenNameStringLiteral	bbbbbbbb
,	TokenNameCOMMA	
"aaa"	TokenNameStringLiteral	aaa
,	TokenNameCOMMA	
"bbbbbbbb"	TokenNameStringLiteral	bbbbbbbb
,	TokenNameCOMMA	
"bbbbbbbb"	TokenNameStringLiteral	bbbbbbbb
,	TokenNameCOMMA	
"aaa"	TokenNameStringLiteral	aaa
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
st	TokenNameIdentifier	 st
:	TokenNameCOLON	
strings2	TokenNameIdentifier	 strings2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
pair	TokenNameIdentifier	 pair
=	TokenNameEQUAL	
Pair	TokenNameIdentifier	 Pair
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
,	TokenNameCOMMA	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pairs	TokenNameIdentifier	 pairs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pair	TokenNameIdentifier	 pair
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buckets	TokenNameIdentifier	 buckets
=	TokenNameEQUAL	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
getBuckets	TokenNameIdentifier	 get Buckets
(	TokenNameLPAREN	
pairs	TokenNameIdentifier	 pairs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
bucket	TokenNameIdentifier	 bucket
:	TokenNameCOLON	
buckets	TokenNameIdentifier	 buckets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Test the "min" functionality 	TokenNameCOMMENT_LINE	Test the "min" functionality 
pairs	TokenNameIdentifier	 pairs
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
strings3	TokenNameIdentifier	 strings3
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"aaa"	TokenNameStringLiteral	aaa
,	TokenNameCOMMA	
"bbbbbbbb"	TokenNameStringLiteral	bbbbbbbb
,	TokenNameCOMMA	
"aaa"	TokenNameStringLiteral	aaa
,	TokenNameCOMMA	
"bbbbbbbb"	TokenNameStringLiteral	bbbbbbbb
,	TokenNameCOMMA	
"bbbbbbbb"	TokenNameStringLiteral	bbbbbbbb
,	TokenNameCOMMA	
"aaa"	TokenNameStringLiteral	aaa
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
st	TokenNameIdentifier	 st
:	TokenNameCOLON	
strings3	TokenNameIdentifier	 strings3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
pair	TokenNameIdentifier	 pair
=	TokenNameEQUAL	
Pair	TokenNameIdentifier	 Pair
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
,	TokenNameCOMMA	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pairs	TokenNameIdentifier	 pairs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pair	TokenNameIdentifier	 pair
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
opts	TokenNameIdentifier	 opts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SizeTieredCompactionStrategy	TokenNameIdentifier	 Size Tiered Compaction Strategy
.	TokenNameDOT	
MIN_SSTABLE_SIZE_KEY	TokenNameIdentifier	 MIN  SSTABLE  SIZE  KEY
,	TokenNameCOMMA	
"10"	TokenNameStringLiteral	10
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
strategy	TokenNameIdentifier	 strategy
=	TokenNameEQUAL	
new	TokenNamenew	
SizeTieredCompactionStrategy	TokenNameIdentifier	 Size Tiered Compaction Strategy
(	TokenNameLPAREN	
cfs	TokenNameIdentifier	 cfs
,	TokenNameCOMMA	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buckets	TokenNameIdentifier	 buckets
=	TokenNameEQUAL	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
getBuckets	TokenNameIdentifier	 get Buckets
(	TokenNameLPAREN	
pairs	TokenNameIdentifier	 pairs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// notice the min is 10 	TokenNameCOMMENT_LINE	notice the min is 10 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
