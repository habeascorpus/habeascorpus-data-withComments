package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
suggest	TokenNameIdentifier	 suggest
.	TokenNameDOT	
fst	TokenNameIdentifier	 fst
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
Arrays	TokenNameIdentifier	 Arrays
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
Locale	TokenNameIdentifier	 Locale
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
suggest	TokenNameIdentifier	 suggest
.	TokenNameDOT	
Lookup	TokenNameIdentifier	 Lookup
.	TokenNameDOT	
LookupResult	TokenNameIdentifier	 Lookup Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
suggest	TokenNameIdentifier	 suggest
.	TokenNameDOT	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
FSTLookup	TokenNameIdentifier	 FST Lookup
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
suggest	TokenNameIdentifier	 suggest
.	TokenNameDOT	
LookupBenchmarkTest	TokenNameIdentifier	 Lookup Benchmark Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
suggest	TokenNameIdentifier	 suggest
.	TokenNameDOT	
TermFreq	TokenNameIdentifier	 Term Freq
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
suggest	TokenNameIdentifier	 suggest
.	TokenNameDOT	
TermFreqArrayIterator	TokenNameIdentifier	 Term Freq Array Iterator
;	TokenNameSEMICOLON	
/** * Unit tests for {@link FSTLookup}. * @deprecated Just to test the old API works */	TokenNameCOMMENT_JAVADOC	 Unit tests for {@link FSTLookup}. @deprecated Just to test the old API works 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
FSTLookupTest	TokenNameIdentifier	 FST Lookup Test
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
TermFreq	TokenNameIdentifier	 Term Freq
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
long	TokenNamelong	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TermFreq	TokenNameIdentifier	 Term Freq
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
FSTLookup	TokenNameIdentifier	 FST Lookup
lookup	TokenNameIdentifier	 lookup
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
=	TokenNameEQUAL	
new	TokenNamenew	
FSTLookup	TokenNameIdentifier	 FST Lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
new	TokenNamenew	
TermFreqArrayIterator	TokenNameIdentifier	 Term Freq Array Iterator
(	TokenNameLPAREN	
evalKeys	TokenNameIdentifier	 eval Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
TermFreq	TokenNameIdentifier	 Term Freq
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
evalKeys	TokenNameIdentifier	 eval Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
TermFreq	TokenNameIdentifier	 Term Freq
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
new	TokenNamenew	
TermFreq	TokenNameIdentifier	 Term Freq
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"oneness"	TokenNameStringLiteral	oneness
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"onerous"	TokenNameStringLiteral	onerous
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"onesimus"	TokenNameStringLiteral	onesimus
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"two"	TokenNameStringLiteral	two
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"twofold"	TokenNameStringLiteral	twofold
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"twonk"	TokenNameStringLiteral	twonk
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"thrive"	TokenNameStringLiteral	thrive
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"through"	TokenNameStringLiteral	through
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"threat"	TokenNameStringLiteral	threat
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"three"	TokenNameStringLiteral	three
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"foundation"	TokenNameStringLiteral	foundation
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"fourblah"	TokenNameStringLiteral	fourblah
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"fourteen"	TokenNameStringLiteral	fourteen
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"four"	TokenNameStringLiteral	four
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"fourier"	TokenNameStringLiteral	fourier
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"fourty"	TokenNameStringLiteral	fourty
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"xo"	TokenNameStringLiteral	xo
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testExactMatchHighPriority	TokenNameIdentifier	 test Exact Match High Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
"two"	TokenNameStringLiteral	two
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"two/1"	TokenNameStringLiteral	two/1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testExactMatchLowPriority	TokenNameIdentifier	 test Exact Match Low Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"one/0"	TokenNameStringLiteral	one/0
,	TokenNameCOMMA	
"oneness/1"	TokenNameStringLiteral	oneness/1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRequestedCount	TokenNameIdentifier	 test Requested Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// 'one' is promoted after collecting two higher ranking results. 	TokenNameCOMMENT_LINE	'one' is promoted after collecting two higher ranking results. 
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"one/0"	TokenNameStringLiteral	one/0
,	TokenNameCOMMA	
"oneness/1"	TokenNameStringLiteral	oneness/1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'one' is at the top after collecting all alphabetical results. 	TokenNameCOMMENT_LINE	'one' is at the top after collecting all alphabetical results. 
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"one/0"	TokenNameStringLiteral	one/0
,	TokenNameCOMMA	
"oneness/1"	TokenNameStringLiteral	oneness/1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'four' is collected in a bucket and then again as an exact match. 	TokenNameCOMMENT_LINE	'four' is collected in a bucket and then again as an exact match. 
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
"four"	TokenNameStringLiteral	four
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"four/0"	TokenNameStringLiteral	four/0
,	TokenNameCOMMA	
"fourblah/1"	TokenNameStringLiteral	fourblah/1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check reordering of exact matches. 	TokenNameCOMMENT_LINE	Check reordering of exact matches. 
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
"four"	TokenNameStringLiteral	four
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"four/0"	TokenNameStringLiteral	four/0
,	TokenNameCOMMA	
"fourblah/1"	TokenNameStringLiteral	fourblah/1
,	TokenNameCOMMA	
"fourteen/1"	TokenNameStringLiteral	fourteen/1
,	TokenNameCOMMA	
"fourier/0"	TokenNameStringLiteral	fourier/0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
=	TokenNameEQUAL	
new	TokenNamenew	
FSTLookup	TokenNameIdentifier	 FST Lookup
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
new	TokenNamenew	
TermFreqArrayIterator	TokenNameIdentifier	 Term Freq Array Iterator
(	TokenNameLPAREN	
evalKeys	TokenNameIdentifier	 eval Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'one' is not promoted after collecting two higher ranking results. 	TokenNameCOMMENT_LINE	'one' is not promoted after collecting two higher ranking results. 
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"oneness/1"	TokenNameStringLiteral	oneness/1
,	TokenNameCOMMA	
"onerous/1"	TokenNameStringLiteral	onerous/1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'one' is at the top after collecting all alphabetical results. 	TokenNameCOMMENT_LINE	'one' is at the top after collecting all alphabetical results. 
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"one/0"	TokenNameStringLiteral	one/0
,	TokenNameCOMMA	
"oneness/1"	TokenNameStringLiteral	oneness/1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMiss	TokenNameIdentifier	 test Miss
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
"xyz"	TokenNameStringLiteral	xyz
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAlphabeticWithWeights	TokenNameIdentifier	 test Alphabetic With Weights
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
"xyz"	TokenNameStringLiteral	xyz
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFullMatchList	TokenNameIdentifier	 test Full Match List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"oneness/1"	TokenNameStringLiteral	oneness/1
,	TokenNameCOMMA	
"onerous/1"	TokenNameStringLiteral	onerous/1
,	TokenNameCOMMA	
"onesimus/1"	TokenNameStringLiteral	onesimus/1
,	TokenNameCOMMA	
"one/0"	TokenNameStringLiteral	one/0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMultilingualInput	TokenNameIdentifier	 test Multilingual Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
TermFreq	TokenNameIdentifier	 Term Freq
>	TokenNameGREATER	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
LookupBenchmarkTest	TokenNameIdentifier	 Lookup Benchmark Test
.	TokenNameDOT	
readTop50KWiki	TokenNameIdentifier	 read Top50 K Wiki
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
=	TokenNameEQUAL	
new	TokenNamenew	
FSTLookup	TokenNameIdentifier	 FST Lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
new	TokenNamenew	
TermFreqArrayIterator	TokenNameIdentifier	 Term Freq Array Iterator
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
TermFreq	TokenNameIdentifier	 Term Freq
tf	TokenNameIdentifier	 tf
:	TokenNameCOLON	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Not found: "	TokenNameStringLiteral	Not found: 
+	TokenNamePLUS	
tf	TokenNameIdentifier	 tf
.	TokenNameDOT	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
bytesToCharSequence	TokenNameIdentifier	 bytes To Char Sequence
(	TokenNameLPAREN	
tf	TokenNameIdentifier	 tf
.	TokenNameDOT	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
tf	TokenNameIdentifier	 tf
.	TokenNameDOT	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
utf8ToString	TokenNameIdentifier	 utf8 To String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
bytesToCharSequence	TokenNameIdentifier	 bytes To Char Sequence
(	TokenNameLPAREN	
tf	TokenNameIdentifier	 tf
.	TokenNameDOT	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyInput	TokenNameIdentifier	 test Empty Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
lookup	TokenNameIdentifier	 lookup
=	TokenNameEQUAL	
new	TokenNamenew	
FSTLookup	TokenNameIdentifier	 FST Lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
new	TokenNamenew	
TermFreqArrayIterator	TokenNameIdentifier	 Term Freq Array Iterator
(	TokenNameLPAREN	
new	TokenNamenew	
TermFreq	TokenNameIdentifier	 Term Freq
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRandom	TokenNameIdentifier	 test Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
TermFreq	TokenNameIdentifier	 Term Freq
>	TokenNameGREATER	
freqs	TokenNameIdentifier	 freqs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
TermFreq	TokenNameIdentifier	 Term Freq
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Random	TokenNameIdentifier	 Random
rnd	TokenNameIdentifier	 rnd
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
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
5000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
freqs	TokenNameIdentifier	 freqs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermFreq	TokenNameIdentifier	 Term Freq
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
rnd	TokenNameIdentifier	 rnd
.	TokenNameDOT	
nextLong	TokenNameIdentifier	 next Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rnd	TokenNameIdentifier	 rnd
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lookup	TokenNameIdentifier	 lookup
=	TokenNameEQUAL	
new	TokenNamenew	
FSTLookup	TokenNameIdentifier	 FST Lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
new	TokenNamenew	
TermFreqArrayIterator	TokenNameIdentifier	 Term Freq Array Iterator
(	TokenNameLPAREN	
freqs	TokenNameIdentifier	 freqs
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
TermFreq	TokenNameIdentifier	 Term Freq
[	TokenNameLBRACKET	
freqs	TokenNameIdentifier	 freqs
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
TermFreq	TokenNameIdentifier	 Term Freq
tf	TokenNameIdentifier	 tf
:	TokenNameCOLON	
freqs	TokenNameIdentifier	 freqs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
CharSequence	TokenNameIdentifier	 Char Sequence
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
bytesToCharSequence	TokenNameIdentifier	 bytes To Char Sequence
(	TokenNameLPAREN	
tf	TokenNameIdentifier	 tf
.	TokenNameDOT	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
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
term	TokenNameIdentifier	 term
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharSequence	TokenNameIdentifier	 Char Sequence
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
subSequence	TokenNameIdentifier	 sub Sequence
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
LookupResult	TokenNameIdentifier	 Lookup Result
lr	TokenNameIdentifier	 lr
:	TokenNameCOLON	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
lr	TokenNameIdentifier	 lr
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
LookupResult	TokenNameIdentifier	 Lookup Result
>	TokenNameGREATER	
res	TokenNameIdentifier	 res
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
res	TokenNameIdentifier	 res
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
colLen	TokenNameIdentifier	 col Len
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
maxLen	TokenNameIdentifier	 max Len
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
,	TokenNameCOMMA	
maxLen	TokenNameIdentifier	 max Len
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
"%"	TokenNameStringLiteral	%
+	TokenNamePLUS	
colLen	TokenNameIdentifier	 col Len
+	TokenNamePLUS	
"s "	TokenNameStringLiteral	s 
+	TokenNamePLUS	
"%"	TokenNameStringLiteral	%
+	TokenNamePLUS	
colLen	TokenNameIdentifier	 col Len
+	TokenNamePLUS	
"s "	TokenNameStringLiteral	s 
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
"Expected"	TokenNameStringLiteral	Expected
,	TokenNameCOMMA	
"Result"	TokenNameStringLiteral	Result
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
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
?	TokenNameQUESTION	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
:	TokenNameCOLON	
"--"	TokenNameStringLiteral	--
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
?	TokenNameQUESTION	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
:	TokenNameCOLON	
"--"	TokenNameStringLiteral	--
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Expected different output: "	TokenNameStringLiteral	Expected different output: 
+	TokenNamePLUS	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
maxLen	TokenNameIdentifier	 max Len
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
