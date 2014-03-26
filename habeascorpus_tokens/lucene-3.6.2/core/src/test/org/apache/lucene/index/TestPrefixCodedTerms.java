package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Iterator	TokenNameIdentifier	 Iterator
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeSet	TokenNameIdentifier	 Tree Set
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
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
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
_TestUtil	TokenNameIdentifier	 Test Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestPrefixCodedTerms	TokenNameIdentifier	 Test Prefix Coded Terms
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmpty	TokenNameIdentifier	 test Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
pb	TokenNameIdentifier	 pb
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
pb	TokenNameIdentifier	 pb
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOne	TokenNameIdentifier	 test One
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"bogus"	TokenNameStringLiteral	bogus
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
pb	TokenNameIdentifier	 pb
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
pb	TokenNameIdentifier	 pb
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRandom	TokenNameIdentifier	 test Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nterms	TokenNameIdentifier	 nterms
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
10000	TokenNameIntegerLiteral	
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
nterms	TokenNameIdentifier	 nterms
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
randomUnicodeString	TokenNameIdentifier	 random Unicode String
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
randomUnicodeString	TokenNameIdentifier	 random Unicode String
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
ref	TokenNameIdentifier	 ref
:	TokenNameCOLON	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
pb	TokenNameIdentifier	 pb
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
:	TokenNameCOLON	
pb	TokenNameIdentifier	 pb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMergeEmpty	TokenNameIdentifier	 test Merge Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>>	TokenNameRIGHT_SHIFT	
subs	TokenNameIdentifier	 subs
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CoalescedDeletes	TokenNameIdentifier	 Coalesced Deletes
.	TokenNameDOT	
mergedIterator	TokenNameIdentifier	 merged Iterator
(	TokenNameLPAREN	
subs	TokenNameIdentifier	 subs
)	TokenNameRPAREN	
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subs	TokenNameIdentifier	 subs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subs	TokenNameIdentifier	 subs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subs	TokenNameIdentifier	 subs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
merged	TokenNameIdentifier	 merged
=	TokenNameEQUAL	
CoalescedDeletes	TokenNameIdentifier	 Coalesced Deletes
.	TokenNameDOT	
mergedIterator	TokenNameIdentifier	 merged Iterator
(	TokenNameLPAREN	
subs	TokenNameIdentifier	 subs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMergeOne	TokenNameIdentifier	 test Merge One
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
new	TokenNamenew	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
pb1	TokenNameIdentifier	 pb1
=	TokenNameEQUAL	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
new	TokenNamenew	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b2	TokenNameIdentifier	 b2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
pb2	TokenNameIdentifier	 pb2
=	TokenNameEQUAL	
b2	TokenNameIdentifier	 b2
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>>	TokenNameRIGHT_SHIFT	
subs	TokenNameIdentifier	 subs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subs	TokenNameIdentifier	 subs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pb1	TokenNameIdentifier	 pb1
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subs	TokenNameIdentifier	 subs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pb2	TokenNameIdentifier	 pb2
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
merged	TokenNameIdentifier	 merged
=	TokenNameEQUAL	
CoalescedDeletes	TokenNameIdentifier	 Coalesced Deletes
.	TokenNameDOT	
mergedIterator	TokenNameIdentifier	 merged Iterator
(	TokenNameLPAREN	
subs	TokenNameIdentifier	 subs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMergeRandom	TokenNameIdentifier	 test Merge Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
pb	TokenNameIdentifier	 pb
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
[	TokenNameLBRACKET	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
superSet	TokenNameIdentifier	 super Set
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
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
pb	TokenNameIdentifier	 pb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nterms	TokenNameIdentifier	 nterms
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nterms	TokenNameIdentifier	 nterms
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
randomUnicodeString	TokenNameIdentifier	 random Unicode String
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
randomUnicodeString	TokenNameIdentifier	 random Unicode String
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
superSet	TokenNameIdentifier	 super Set
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
ref	TokenNameIdentifier	 ref
:	TokenNameCOLON	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pb	TokenNameIdentifier	 pb
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>>	TokenNameRIGHT_SHIFT	
subs	TokenNameIdentifier	 subs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
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
pb	TokenNameIdentifier	 pb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subs	TokenNameIdentifier	 subs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pb	TokenNameIdentifier	 pb
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
superSet	TokenNameIdentifier	 super Set
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
CoalescedDeletes	TokenNameIdentifier	 Coalesced Deletes
.	TokenNameDOT	
mergedIterator	TokenNameIdentifier	 merged Iterator
(	TokenNameLPAREN	
subs	TokenNameIdentifier	 subs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
