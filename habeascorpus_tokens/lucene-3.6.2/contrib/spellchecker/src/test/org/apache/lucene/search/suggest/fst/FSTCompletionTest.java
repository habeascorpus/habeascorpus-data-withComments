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
*	TokenNameMULTIPLY	
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
*	TokenNameMULTIPLY	
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
FSTCompletion	TokenNameIdentifier	 FST Completion
.	TokenNameDOT	
Completion	TokenNameIdentifier	 Completion
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Unit tests for {@link FSTCompletion}. */	TokenNameCOMMENT_JAVADOC	 Unit tests for {@link FSTCompletion}. 
public	TokenNamepublic	
class	TokenNameclass	
FSTCompletionTest	TokenNameIdentifier	 FST Completion Test
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
int	TokenNameint	
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
FSTCompletion	TokenNameIdentifier	 FST Completion
completion	TokenNameIdentifier	 completion
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FSTCompletion	TokenNameIdentifier	 FST Completion
completionAlphabetical	TokenNameIdentifier	 completion Alphabetical
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
FSTCompletionBuilder	TokenNameIdentifier	 FST Completion Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
FSTCompletionBuilder	TokenNameIdentifier	 FST Completion Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
TermFreq	TokenNameIdentifier	 Term Freq
tf	TokenNameIdentifier	 tf
:	TokenNameCOLON	
evalKeys	TokenNameIdentifier	 eval Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tf	TokenNameIdentifier	 tf
.	TokenNameDOT	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
tf	TokenNameIdentifier	 tf
.	TokenNameDOT	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
completion	TokenNameIdentifier	 completion
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
completionAlphabetical	TokenNameIdentifier	 completion Alphabetical
=	TokenNameEQUAL	
new	TokenNamenew	
FSTCompletion	TokenNameIdentifier	 FST Completion
(	TokenNameLPAREN	
completion	TokenNameIdentifier	 completion
.	TokenNameDOT	
getFST	TokenNameIdentifier	 get FST
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
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
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"oneness"	TokenNameStringLiteral	oneness
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"onerous"	TokenNameStringLiteral	onerous
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"onesimus"	TokenNameStringLiteral	onesimus
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"two"	TokenNameStringLiteral	two
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"twofold"	TokenNameStringLiteral	twofold
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"twonk"	TokenNameStringLiteral	twonk
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"thrive"	TokenNameStringLiteral	thrive
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"through"	TokenNameStringLiteral	through
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"threat"	TokenNameStringLiteral	threat
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"three"	TokenNameStringLiteral	three
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"foundation"	TokenNameStringLiteral	foundation
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"fourblah"	TokenNameStringLiteral	fourblah
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"fourteen"	TokenNameStringLiteral	fourteen
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"four"	TokenNameStringLiteral	four
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"fourier"	TokenNameStringLiteral	fourier
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
"fourty"	TokenNameStringLiteral	fourty
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
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
completion	TokenNameIdentifier	 completion
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
stringToCharSequence	TokenNameIdentifier	 string To Char Sequence
(	TokenNameLPAREN	
"two"	TokenNameStringLiteral	two
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"two/1.0"	TokenNameStringLiteral	two/1.0
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
completion	TokenNameIdentifier	 completion
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
stringToCharSequence	TokenNameIdentifier	 string To Char Sequence
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"one/0.0"	TokenNameStringLiteral	one/0.0
,	TokenNameCOMMA	
"oneness/1.0"	TokenNameStringLiteral	oneness/1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testExactMatchReordering	TokenNameIdentifier	 test Exact Match Reordering
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// Check reordering of exact matches. 	TokenNameCOMMENT_LINE	Check reordering of exact matches. 
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
completion	TokenNameIdentifier	 completion
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
stringToCharSequence	TokenNameIdentifier	 string To Char Sequence
(	TokenNameLPAREN	
"four"	TokenNameStringLiteral	four
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"four/0.0"	TokenNameStringLiteral	four/0.0
,	TokenNameCOMMA	
"fourblah/1.0"	TokenNameStringLiteral	fourblah/1.0
,	TokenNameCOMMA	
"fourteen/1.0"	TokenNameStringLiteral	fourteen/1.0
,	TokenNameCOMMA	
"fourier/0.0"	TokenNameStringLiteral	fourier/0.0
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
completion	TokenNameIdentifier	 completion
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
stringToCharSequence	TokenNameIdentifier	 string To Char Sequence
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"one/0.0"	TokenNameStringLiteral	one/0.0
,	TokenNameCOMMA	
"oneness/1.0"	TokenNameStringLiteral	oneness/1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'four' is collected in a bucket and then again as an exact match. 	TokenNameCOMMENT_LINE	'four' is collected in a bucket and then again as an exact match. 
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
completion	TokenNameIdentifier	 completion
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
stringToCharSequence	TokenNameIdentifier	 string To Char Sequence
(	TokenNameLPAREN	
"four"	TokenNameStringLiteral	four
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"four/0.0"	TokenNameStringLiteral	four/0.0
,	TokenNameCOMMA	
"fourblah/1.0"	TokenNameStringLiteral	fourblah/1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check reordering of exact matches. 	TokenNameCOMMENT_LINE	Check reordering of exact matches. 
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
completion	TokenNameIdentifier	 completion
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
stringToCharSequence	TokenNameIdentifier	 string To Char Sequence
(	TokenNameLPAREN	
"four"	TokenNameStringLiteral	four
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"four/0.0"	TokenNameStringLiteral	four/0.0
,	TokenNameCOMMA	
"fourblah/1.0"	TokenNameStringLiteral	fourblah/1.0
,	TokenNameCOMMA	
"fourteen/1.0"	TokenNameStringLiteral	fourteen/1.0
,	TokenNameCOMMA	
"fourier/0.0"	TokenNameStringLiteral	fourier/0.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'one' is at the top after collecting all alphabetical results. 	TokenNameCOMMENT_LINE	'one' is at the top after collecting all alphabetical results. 
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
completionAlphabetical	TokenNameIdentifier	 completion Alphabetical
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
stringToCharSequence	TokenNameIdentifier	 string To Char Sequence
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"one/0.0"	TokenNameStringLiteral	one/0.0
,	TokenNameCOMMA	
"oneness/1.0"	TokenNameStringLiteral	oneness/1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'one' is not promoted after collecting two higher ranking results. 	TokenNameCOMMENT_LINE	'one' is not promoted after collecting two higher ranking results. 
FSTCompletion	TokenNameIdentifier	 FST Completion
noPromotion	TokenNameIdentifier	 no Promotion
=	TokenNameEQUAL	
new	TokenNamenew	
FSTCompletion	TokenNameIdentifier	 FST Completion
(	TokenNameLPAREN	
completion	TokenNameIdentifier	 completion
.	TokenNameDOT	
getFST	TokenNameIdentifier	 get FST
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
noPromotion	TokenNameIdentifier	 no Promotion
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
stringToCharSequence	TokenNameIdentifier	 string To Char Sequence
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"oneness/1.0"	TokenNameStringLiteral	oneness/1.0
,	TokenNameCOMMA	
"onerous/1.0"	TokenNameStringLiteral	onerous/1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'one' is at the top after collecting all alphabetical results. 	TokenNameCOMMENT_LINE	'one' is at the top after collecting all alphabetical results. 
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
completionAlphabetical	TokenNameIdentifier	 completion Alphabetical
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
stringToCharSequence	TokenNameIdentifier	 string To Char Sequence
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"one/0.0"	TokenNameStringLiteral	one/0.0
,	TokenNameCOMMA	
"oneness/1.0"	TokenNameStringLiteral	oneness/1.0
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
completion	TokenNameIdentifier	 completion
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
stringToCharSequence	TokenNameIdentifier	 string To Char Sequence
(	TokenNameLPAREN	
"xyz"	TokenNameStringLiteral	xyz
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
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
completionAlphabetical	TokenNameIdentifier	 completion Alphabetical
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
stringToCharSequence	TokenNameIdentifier	 string To Char Sequence
(	TokenNameLPAREN	
"xyz"	TokenNameStringLiteral	xyz
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
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
completion	TokenNameIdentifier	 completion
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
stringToCharSequence	TokenNameIdentifier	 string To Char Sequence
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"oneness/1.0"	TokenNameStringLiteral	oneness/1.0
,	TokenNameCOMMA	
"onerous/1.0"	TokenNameStringLiteral	onerous/1.0
,	TokenNameCOMMA	
"onesimus/1.0"	TokenNameStringLiteral	onesimus/1.0
,	TokenNameCOMMA	
"one/0.0"	TokenNameStringLiteral	one/0.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testThreeByte	TokenNameIdentifier	 test Three Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xF0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xAD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA2	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FSTCompletionBuilder	TokenNameIdentifier	 FST Completion Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
FSTCompletionBuilder	TokenNameIdentifier	 FST Completion Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FSTCompletion	TokenNameIdentifier	 FST Completion
lookup	TokenNameIdentifier	 lookup
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Completion	TokenNameIdentifier	 Completion
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
stringToCharSequence	TokenNameIdentifier	 string To Char Sequence
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLargeInputConstantWeights	TokenNameIdentifier	 test Large Input Constant Weights
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
FSTCompletionLookup	TokenNameIdentifier	 FST Completion Lookup
lookup	TokenNameIdentifier	 lookup
=	TokenNameEQUAL	
new	TokenNamenew	
FSTCompletionLookup	TokenNameIdentifier	 FST Completion Lookup
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Random	TokenNameIdentifier	 Random
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
TermFreq	TokenNameIdentifier	 Term Freq
>	TokenNameGREATER	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
TermFreq	TokenNameIdentifier	 Term Freq
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
5000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermFreq	TokenNameIdentifier	 Term Freq
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
randomSimpleString	TokenNameIdentifier	 random Simple String
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
new	TokenNamenew	
TermFreqArrayIterator	TokenNameIdentifier	 Term Freq Array Iterator
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// All the weights were constant, so all returned buckets must be constant, whatever they 	TokenNameCOMMENT_LINE	All the weights were constant, so all returned buckets must be constant, whatever they 
// are. 	TokenNameCOMMENT_LINE	are. 
Long	TokenNameIdentifier	 Long
previous	TokenNameIdentifier	 previous
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
TermFreq	TokenNameIdentifier	 Term Freq
tf	TokenNameIdentifier	 tf
:	TokenNameCOLON	
keys	TokenNameIdentifier	 keys
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Long	TokenNameIdentifier	 Long
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Number	TokenNameIdentifier	 Number
)	TokenNameRPAREN	
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
)	TokenNameRPAREN	
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
previous	TokenNameIdentifier	 previous
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
previous	TokenNameIdentifier	 previous
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
previous	TokenNameIdentifier	 previous
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
FSTCompletionLookup	TokenNameIdentifier	 FST Completion Lookup
lookup	TokenNameIdentifier	 lookup
=	TokenNameEQUAL	
new	TokenNamenew	
FSTCompletionLookup	TokenNameIdentifier	 FST Completion Lookup
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
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Not found: "	TokenNameStringLiteral	Not found: 
+	TokenNamePLUS	
tf	TokenNameIdentifier	 tf
.	TokenNameDOT	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
List	TokenNameIdentifier	 List
<	TokenNameLESS	
LookupResult	TokenNameIdentifier	 Lookup Result
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
stringToCharSequence	TokenNameIdentifier	 string To Char Sequence
(	TokenNameLPAREN	
"wit"	TokenNameStringLiteral	wit
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
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
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"wit"	TokenNameStringLiteral	wit
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// exact match. 	TokenNameCOMMENT_LINE	exact match. 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"with"	TokenNameStringLiteral	with
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// highest count. 	TokenNameCOMMENT_LINE	highest count. 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyInput	TokenNameIdentifier	 test Empty Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
completion	TokenNameIdentifier	 completion
=	TokenNameEQUAL	
new	TokenNamenew	
FSTCompletionBuilder	TokenNameIdentifier	 FST Completion Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertMatchEquals	TokenNameIdentifier	 assert Match Equals
(	TokenNameLPAREN	
completion	TokenNameIdentifier	 completion
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
stringToCharSequence	TokenNameIdentifier	 string To Char Sequence
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
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
2500	TokenNameIntegerLiteral	
+	TokenNamePLUS	
rnd	TokenNameIdentifier	 rnd
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
2500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FSTCompletionLookup	TokenNameIdentifier	 FST Completion Lookup
lookup	TokenNameIdentifier	 lookup
=	TokenNameEQUAL	
new	TokenNamenew	
FSTCompletionLookup	TokenNameIdentifier	 FST Completion Lookup
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
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
tf	TokenNameIdentifier	 tf
.	TokenNameDOT	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
utf8ToString	TokenNameIdentifier	 utf8 To String
(	TokenNameLPAREN	
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
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
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
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
stringToCharSequence	TokenNameIdentifier	 string To Char Sequence
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
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
Completion	TokenNameIdentifier	 Completion
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
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
stripScore	TokenNameIdentifier	 strip Score
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
,	TokenNameCOMMA	
stripScore	TokenNameIdentifier	 strip Score
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stripScore	TokenNameIdentifier	 strip Score
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
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
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
"\/[0-9\.]+"	TokenNameStringLiteral	\/[0-9\.]+
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
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
