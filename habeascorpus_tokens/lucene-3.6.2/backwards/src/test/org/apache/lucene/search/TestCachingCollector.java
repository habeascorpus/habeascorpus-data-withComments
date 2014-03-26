package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexReader	TokenNameIdentifier	 Index Reader
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestCachingCollector	TokenNameIdentifier	 Test Caching Collector
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
ONE_BYTE	TokenNameIdentifier	 ONE  BYTE
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 1 byte out of MB 	TokenNameCOMMENT_LINE	1 byte out of MB 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
MockScorer	TokenNameIdentifier	 Mock Scorer
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
private	TokenNameprivate	
MockScorer	TokenNameIdentifier	 Mock Scorer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
NoOpCollector	TokenNameIdentifier	 No Op Collector
extends	TokenNameextends	
Collector	TokenNameIdentifier	 Collector
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
acceptDocsOutOfOrder	TokenNameIdentifier	 accept Docs Out Of Order
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NoOpCollector	TokenNameIdentifier	 No Op Collector
(	TokenNameLPAREN	
boolean	TokenNameboolean	
acceptDocsOutOfOrder	TokenNameIdentifier	 accept Docs Out Of Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
acceptDocsOutOfOrder	TokenNameIdentifier	 accept Docs Out Of Order
=	TokenNameEQUAL	
acceptDocsOutOfOrder	TokenNameIdentifier	 accept Docs Out Of Order
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
acceptsDocsOutOfOrder	TokenNameIdentifier	 accepts Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
acceptDocsOutOfOrder	TokenNameIdentifier	 accept Docs Out Of Order
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBasic	TokenNameIdentifier	 test Basic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
boolean	TokenNameboolean	
cacheScores	TokenNameIdentifier	 cache Scores
:	TokenNameCOLON	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CachingCollector	TokenNameIdentifier	 Caching Collector
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
CachingCollector	TokenNameIdentifier	 Caching Collector
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
new	TokenNamenew	
NoOpCollector	TokenNameIdentifier	 No Op Collector
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cacheScores	TokenNameIdentifier	 cache Scores
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
new	TokenNamenew	
MockScorer	TokenNameIdentifier	 Mock Scorer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// collect 1000 docs 	TokenNameCOMMENT_LINE	collect 1000 docs 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// now replay them 	TokenNameCOMMENT_LINE	now replay them 
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
replay	TokenNameIdentifier	 replay
(	TokenNameLPAREN	
new	TokenNamenew	
Collector	TokenNameIdentifier	 Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
prevDocID	TokenNameIdentifier	 prev Doc ID
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
prevDocID	TokenNameIdentifier	 prev Doc ID
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prevDocID	TokenNameIdentifier	 prev Doc ID
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
acceptsDocsOutOfOrder	TokenNameIdentifier	 accepts Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIllegalStateOnReplay	TokenNameIdentifier	 test Illegal State On Replay
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CachingCollector	TokenNameIdentifier	 Caching Collector
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
CachingCollector	TokenNameIdentifier	 Caching Collector
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
new	TokenNamenew	
NoOpCollector	TokenNameIdentifier	 No Op Collector
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
ONE_BYTE	TokenNameIdentifier	 ONE  BYTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
new	TokenNamenew	
MockScorer	TokenNameIdentifier	 Mock Scorer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// collect 130 docs, this should be enough for triggering cache abort. 	TokenNameCOMMENT_LINE	collect 130 docs, this should be enough for triggering cache abort. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
130	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"CachingCollector should not be cached due to low memory limit"	TokenNameStringLiteral	CachingCollector should not be cached due to low memory limit
,	TokenNameCOMMA	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
isCached	TokenNameIdentifier	 is Cached
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
replay	TokenNameIdentifier	 replay
(	TokenNameLPAREN	
new	TokenNamenew	
NoOpCollector	TokenNameIdentifier	 No Op Collector
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"replay should fail if CachingCollector is not cached"	TokenNameStringLiteral	replay should fail if CachingCollector is not cached
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expected 	TokenNameCOMMENT_LINE	expected 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIllegalCollectorOnReplay	TokenNameIdentifier	 test Illegal Collector On Replay
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// tests that the Collector passed to replay() has an out-of-order mode that 	TokenNameCOMMENT_LINE	tests that the Collector passed to replay() has an out-of-order mode that 
// is valid with the Collector passed to the ctor 	TokenNameCOMMENT_LINE	is valid with the Collector passed to the ctor 
// 'src' Collector does not support out-of-order 	TokenNameCOMMENT_LINE	'src' Collector does not support out-of-order 
CachingCollector	TokenNameIdentifier	 Caching Collector
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
CachingCollector	TokenNameIdentifier	 Caching Collector
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
new	TokenNamenew	
NoOpCollector	TokenNameIdentifier	 No Op Collector
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
ONE_BYTE	TokenNameIdentifier	 ONE  BYTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
new	TokenNamenew	
MockScorer	TokenNameIdentifier	 Mock Scorer
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
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
replay	TokenNameIdentifier	 replay
(	TokenNameLPAREN	
new	TokenNamenew	
NoOpCollector	TokenNameIdentifier	 No Op Collector
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this call should not fail 	TokenNameCOMMENT_LINE	this call should not fail 
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
replay	TokenNameIdentifier	 replay
(	TokenNameLPAREN	
new	TokenNamenew	
NoOpCollector	TokenNameIdentifier	 No Op Collector
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this call should not fail 	TokenNameCOMMENT_LINE	this call should not fail 
// 'src' Collector supports out-of-order 	TokenNameCOMMENT_LINE	'src' Collector supports out-of-order 
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
CachingCollector	TokenNameIdentifier	 Caching Collector
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
new	TokenNamenew	
NoOpCollector	TokenNameIdentifier	 No Op Collector
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
ONE_BYTE	TokenNameIdentifier	 ONE  BYTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
new	TokenNamenew	
MockScorer	TokenNameIdentifier	 Mock Scorer
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
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
replay	TokenNameIdentifier	 replay
(	TokenNameLPAREN	
new	TokenNamenew	
NoOpCollector	TokenNameIdentifier	 No Op Collector
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this call should not fail 	TokenNameCOMMENT_LINE	this call should not fail 
try	TokenNametry	
{	TokenNameLBRACE	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
replay	TokenNameIdentifier	 replay
(	TokenNameLPAREN	
new	TokenNamenew	
NoOpCollector	TokenNameIdentifier	 No Op Collector
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this call should fail 	TokenNameCOMMENT_LINE	this call should fail 
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"should have failed if an in-order Collector was given to replay(), "	TokenNameStringLiteral	should have failed if an in-order Collector was given to replay(), 
+	TokenNamePLUS	
"while CachingCollector was initialized with out-of-order collection"	TokenNameStringLiteral	while CachingCollector was initialized with out-of-order collection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ok 	TokenNameCOMMENT_LINE	ok 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCachedArraysAllocation	TokenNameIdentifier	 test Cached Arrays Allocation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// tests the cached arrays allocation -- if the 'nextLength' was too high, 	TokenNameCOMMENT_LINE	tests the cached arrays allocation -- if the 'nextLength' was too high, 
// caching would terminate even if a smaller length would suffice. 	TokenNameCOMMENT_LINE	caching would terminate even if a smaller length would suffice. 
// set RAM limit enough for 150 docs + random(10000) 	TokenNameCOMMENT_LINE	set RAM limit enough for 150 docs + random(10000) 
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
150	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
boolean	TokenNameboolean	
cacheScores	TokenNameIdentifier	 cache Scores
:	TokenNameCOLON	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bytesPerDoc	TokenNameIdentifier	 bytes Per Doc
=	TokenNameEQUAL	
cacheScores	TokenNameIdentifier	 cache Scores
?	TokenNameQUESTION	
8	TokenNameIntegerLiteral	
:	TokenNameCOLON	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
CachingCollector	TokenNameIdentifier	 Caching Collector
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
CachingCollector	TokenNameIdentifier	 Caching Collector
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
new	TokenNamenew	
NoOpCollector	TokenNameIdentifier	 No Op Collector
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cacheScores	TokenNameIdentifier	 cache Scores
,	TokenNameCOMMA	
bytesPerDoc	TokenNameIdentifier	 bytes Per Doc
*	TokenNameMULTIPLY	
ONE_BYTE	TokenNameIdentifier	 ONE  BYTE
*	TokenNameMULTIPLY	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
new	TokenNamenew	
MockScorer	TokenNameIdentifier	 Mock Scorer
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
numDocs	TokenNameIdentifier	 num Docs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
isCached	TokenNameIdentifier	 is Cached
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The 151's document should terminate caching 	TokenNameCOMMENT_LINE	The 151's document should terminate caching 
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
isCached	TokenNameIdentifier	 is Cached
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoWrappedCollector	TokenNameIdentifier	 test No Wrapped Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
boolean	TokenNameboolean	
cacheScores	TokenNameIdentifier	 cache Scores
:	TokenNameCOLON	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create w/ null wrapped collector, and test that the methods work 	TokenNameCOMMENT_LINE	create w/ null wrapped collector, and test that the methods work 
CachingCollector	TokenNameIdentifier	 Caching Collector
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
CachingCollector	TokenNameIdentifier	 Caching Collector
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
cacheScores	TokenNameIdentifier	 cache Scores
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
ONE_BYTE	TokenNameIdentifier	 ONE  BYTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
new	TokenNamenew	
MockScorer	TokenNameIdentifier	 Mock Scorer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
isCached	TokenNameIdentifier	 is Cached
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
replay	TokenNameIdentifier	 replay
(	TokenNameLPAREN	
new	TokenNamenew	
NoOpCollector	TokenNameIdentifier	 No Op Collector
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
