/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
Iterators	TokenNameIdentifier	 Iterators
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
BeforeClass	TokenNameIdentifier	 Before Class
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
assertEquals	TokenNameIdentifier	 assert Equals
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
dht	TokenNameIdentifier	 dht
.	TokenNameDOT	
Token	TokenNameIdentifier	 Token
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
TokenMetadata	TokenNameIdentifier	 Token Metadata
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
.	TokenNameDOT	
StorageService	TokenNameIdentifier	 Storage Service
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TokenMetadataTest	TokenNameIdentifier	 Token Metadata Test
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ONE	TokenNameIdentifier	 ONE
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
SIX	TokenNameIdentifier	 SIX
=	TokenNameEQUAL	
"6"	TokenNameStringLiteral	6
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
RING	TokenNameIdentifier	 RING
;	TokenNameSEMICOLON	
@	TokenNameAT	
BeforeClass	TokenNameIdentifier	 Before Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
beforeClass	TokenNameIdentifier	 before Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
TokenMetadata	TokenNameIdentifier	 Token Metadata
tmd	TokenNameIdentifier	 tmd
=	TokenNameEQUAL	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getTokenMetadata	TokenNameIdentifier	 get Token Metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmd	TokenNameIdentifier	 tmd
.	TokenNameDOT	
updateNormalToken	TokenNameIdentifier	 update Normal Token
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
(	TokenNameLPAREN	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.1"	TokenNameStringLiteral	127.0.0.1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmd	TokenNameIdentifier	 tmd
.	TokenNameDOT	
updateNormalToken	TokenNameIdentifier	 update Normal Token
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
(	TokenNameLPAREN	
SIX	TokenNameIdentifier	 SIX
)	TokenNameRPAREN	
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getByName	TokenNameIdentifier	 get By Name
(	TokenNameLPAREN	
"127.0.0.6"	TokenNameStringLiteral	127.0.0.6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RING	TokenNameIdentifier	 RING
=	TokenNameEQUAL	
tmd	TokenNameIdentifier	 tmd
.	TokenNameDOT	
sortedTokens	TokenNameIdentifier	 sorted Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
testRingIterator	TokenNameIdentifier	 test Ring Iterator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeMin	TokenNameIdentifier	 include Min
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterators	TokenNameIdentifier	 Iterators
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
actual	TokenNameIdentifier	 actual
,	TokenNameCOMMA	
TokenMetadata	TokenNameIdentifier	 Token Metadata
.	TokenNameDOT	
ringIterator	TokenNameIdentifier	 ring Iterator
(	TokenNameLPAREN	
RING	TokenNameIdentifier	 RING
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
,	TokenNameCOMMA	
includeMin	TokenNameIdentifier	 include Min
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Mismatch at index "	TokenNameStringLiteral	Mismatch at index 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
actual	TokenNameIdentifier	 actual
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRingIterator	TokenNameIdentifier	 test Ring Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testRingIterator	TokenNameIdentifier	 test Ring Iterator
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testRingIterator	TokenNameIdentifier	 test Ring Iterator
(	TokenNameLPAREN	
"7"	TokenNameStringLiteral	7
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testRingIterator	TokenNameIdentifier	 test Ring Iterator
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testRingIterator	TokenNameIdentifier	 test Ring Iterator
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRingIteratorIncludeMin	TokenNameIdentifier	 test Ring Iterator Include Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testRingIterator	TokenNameIdentifier	 test Ring Iterator
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testRingIterator	TokenNameIdentifier	 test Ring Iterator
(	TokenNameLPAREN	
"7"	TokenNameStringLiteral	7
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testRingIterator	TokenNameIdentifier	 test Ring Iterator
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testRingIterator	TokenNameIdentifier	 test Ring Iterator
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testRingIteratorEmptyRing	TokenNameIdentifier	 test Ring Iterator Empty Ring
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RING	TokenNameIdentifier	 RING
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testRingIterator	TokenNameIdentifier	 test Ring Iterator
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
