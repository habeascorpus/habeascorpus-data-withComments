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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
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
index	TokenNameIdentifier	 index
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
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
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
Scorer	TokenNameIdentifier	 Scorer
.	TokenNameDOT	
ScorerVisitor	TokenNameIdentifier	 Scorer Visitor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
AfterClass	TokenNameIdentifier	 After Class
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
public	TokenNamepublic	
class	TokenNameclass	
TestSubScorerFreqs	TokenNameIdentifier	 Test Sub Scorer Freqs
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
IndexSearcher	TokenNameIdentifier	 Index Searcher
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
@	TokenNameAT	
BeforeClass	TokenNameIdentifier	 Before Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
makeIndex	TokenNameIdentifier	 make Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
newLogMergePolicy	TokenNameIdentifier	 new Log Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make sure we have more than one segment occationally 	TokenNameCOMMENT_LINE	make sure we have more than one segment occationally 
int	TokenNameint	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
31	TokenNameIntegerLiteral	
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
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"a b c d b c d c d d"	TokenNameStringLiteral	a b c d b c d c d d
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"a b c d"	TokenNameStringLiteral	a b c d
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
AfterClass	TokenNameIdentifier	 After Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
CountingCollector	TokenNameIdentifier	 Counting Collector
extends	TokenNameextends	
Collector	TokenNameIdentifier	 Collector
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Collector	TokenNameIdentifier	 Collector
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>>	TokenNameRIGHT_SHIFT	
docCounts	TokenNameIdentifier	 doc Counts
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
subScorers	TokenNameIdentifier	 sub Scorers
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ScorerVisitor	TokenNameIdentifier	 Scorer Visitor
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
visitor	TokenNameIdentifier	 visitor
=	TokenNameEQUAL	
new	TokenNamenew	
MockScorerVisitor	TokenNameIdentifier	 Mock Scorer Visitor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
Occur	TokenNameIdentifier	 Occur
>	TokenNameGREATER	
collect	TokenNameIdentifier	 collect
;	TokenNameSEMICOLON	
private	TokenNameprivate	
class	TokenNameclass	
MockScorerVisitor	TokenNameIdentifier	 Mock Scorer Visitor
extends	TokenNameextends	
ScorerVisitor	TokenNameIdentifier	 Scorer Visitor
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
visitOptional	TokenNameIdentifier	 visit Optional
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
subScorers	TokenNameIdentifier	 sub Scorers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
visitProhibited	TokenNameIdentifier	 visit Prohibited
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
subScorers	TokenNameIdentifier	 sub Scorers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
visitRequired	TokenNameIdentifier	 visit Required
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
subScorers	TokenNameIdentifier	 sub Scorers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
CountingCollector	TokenNameIdentifier	 Counting Collector
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
EnumSet	TokenNameIdentifier	 Enum Set
.	TokenNameDOT	
allOf	TokenNameIdentifier	 all Of
(	TokenNameLPAREN	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CountingCollector	TokenNameIdentifier	 Counting Collector
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
Occur	TokenNameIdentifier	 Occur
>	TokenNameGREATER	
collect	TokenNameIdentifier	 collect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
=	TokenNameEQUAL	
collect	TokenNameIdentifier	 collect
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
other	TokenNameIdentifier	 other
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
visitScorers	TokenNameIdentifier	 visit Scorers
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
freqs	TokenNameIdentifier	 freqs
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
ent	TokenNameIdentifier	 ent
:	TokenNameCOLON	
subScorers	TokenNameIdentifier	 sub Scorers
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Scorer	TokenNameIdentifier	 Scorer
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
ent	TokenNameIdentifier	 ent
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
matchId	TokenNameIdentifier	 match Id
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
freqs	TokenNameIdentifier	 freqs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ent	TokenNameIdentifier	 ent
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
matchId	TokenNameIdentifier	 match Id
==	TokenNameEQUAL_EQUAL	
doc	TokenNameIdentifier	 doc
?	TokenNameQUESTION	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
docCounts	TokenNameIdentifier	 doc Counts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
,	TokenNameCOMMA	
freqs	TokenNameIdentifier	 freqs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
this	TokenNamethis	
.	TokenNameDOT	
docBase	TokenNameIdentifier	 doc Base
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
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
other	TokenNameIdentifier	 other
.	TokenNameDOT	
acceptsDocsOutOfOrder	TokenNameIdentifier	 accepts Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
FLOAT_TOLERANCE	TokenNameIdentifier	 FLOAT  TOLERANCE
=	TokenNameEQUAL	
0.00001F	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testTermQuery	TokenNameIdentifier	 test Term Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
TermQuery	TokenNameIdentifier	 Term Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"d"	TokenNameStringLiteral	d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CountingCollector	TokenNameIdentifier	 Counting Collector
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
CountingCollector	TokenNameIdentifier	 Counting Collector
(	TokenNameLPAREN	
TopScoreDocCollector	TokenNameIdentifier	 Top Score Doc Collector
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
maxDocs	TokenNameIdentifier	 max Docs
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
maxDocs	TokenNameIdentifier	 max Docs
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
docCounts	TokenNameIdentifier	 doc Counts
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
maxDocs	TokenNameIdentifier	 max Docs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
doc0	TokenNameIdentifier	 doc0
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
docCounts	TokenNameIdentifier	 doc Counts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc0	TokenNameIdentifier	 doc0
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4.0F	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
doc0	TokenNameIdentifier	 doc0
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FLOAT_TOLERANCE	TokenNameIdentifier	 FLOAT  TOLERANCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
doc1	TokenNameIdentifier	 doc1
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
docCounts	TokenNameIdentifier	 doc Counts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc1	TokenNameIdentifier	 doc1
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1.0F	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
doc1	TokenNameIdentifier	 doc1
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FLOAT_TOLERANCE	TokenNameIdentifier	 FLOAT  TOLERANCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"unchecked"	TokenNameStringLiteral	unchecked
,	TokenNameCOMMA	
"rawtypes"	TokenNameStringLiteral	rawtypes
}	TokenNameRBRACE	
)	TokenNameRPAREN	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testBooleanQuery	TokenNameIdentifier	 test Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
TermQuery	TokenNameIdentifier	 Term Query
aQuery	TokenNameIdentifier	 a Query
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermQuery	TokenNameIdentifier	 Term Query
dQuery	TokenNameIdentifier	 d Query
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"d"	TokenNameStringLiteral	d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermQuery	TokenNameIdentifier	 Term Query
cQuery	TokenNameIdentifier	 c Query
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermQuery	TokenNameIdentifier	 Term Query
yQuery	TokenNameIdentifier	 y Query
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"y"	TokenNameStringLiteral	y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
inner	TokenNameIdentifier	 inner
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cQuery	TokenNameIdentifier	 c Query
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
yQuery	TokenNameIdentifier	 y Query
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
inner	TokenNameIdentifier	 inner
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
aQuery	TokenNameIdentifier	 a Query
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dQuery	TokenNameIdentifier	 d Query
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
Occur	TokenNameIdentifier	 Occur
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
occurList	TokenNameIdentifier	 occur List
=	TokenNameEQUAL	
new	TokenNamenew	
EnumSet	TokenNameIdentifier	 Enum Set
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
EnumSet	TokenNameIdentifier	 Enum Set
.	TokenNameDOT	
of	TokenNameIdentifier	 of
(	TokenNameLPAREN	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
,	TokenNameCOMMA	
EnumSet	TokenNameIdentifier	 Enum Set
.	TokenNameDOT	
of	TokenNameIdentifier	 of
(	TokenNameLPAREN	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
Occur	TokenNameIdentifier	 Occur
>	TokenNameGREATER	
occur	TokenNameIdentifier	 occur
:	TokenNameCOLON	
occurList	TokenNameIdentifier	 occur List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CountingCollector	TokenNameIdentifier	 Counting Collector
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
CountingCollector	TokenNameIdentifier	 Counting Collector
(	TokenNameLPAREN	
TopScoreDocCollector	TokenNameIdentifier	 Top Score Doc Collector
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
occur	TokenNameIdentifier	 occur
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
maxDocs	TokenNameIdentifier	 max Docs
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
maxDocs	TokenNameIdentifier	 max Docs
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
docCounts	TokenNameIdentifier	 doc Counts
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
includeOptional	TokenNameIdentifier	 include Optional
=	TokenNameEQUAL	
occur	TokenNameIdentifier	 occur
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
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
maxDocs	TokenNameIdentifier	 max Docs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
doc0	TokenNameIdentifier	 doc0
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
docCounts	TokenNameIdentifier	 doc Counts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
includeOptional	TokenNameIdentifier	 include Optional
?	TokenNameQUESTION	
5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc0	TokenNameIdentifier	 doc0
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1.0F	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
doc0	TokenNameIdentifier	 doc0
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
aQuery	TokenNameIdentifier	 a Query
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FLOAT_TOLERANCE	TokenNameIdentifier	 FLOAT  TOLERANCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4.0F	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
doc0	TokenNameIdentifier	 doc0
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dQuery	TokenNameIdentifier	 d Query
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FLOAT_TOLERANCE	TokenNameIdentifier	 FLOAT  TOLERANCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
includeOptional	TokenNameIdentifier	 include Optional
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3.0F	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
doc0	TokenNameIdentifier	 doc0
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
cQuery	TokenNameIdentifier	 c Query
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FLOAT_TOLERANCE	TokenNameIdentifier	 FLOAT  TOLERANCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
doc1	TokenNameIdentifier	 doc1
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
docCounts	TokenNameIdentifier	 doc Counts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
includeOptional	TokenNameIdentifier	 include Optional
?	TokenNameQUESTION	
5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc1	TokenNameIdentifier	 doc1
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1.0F	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
doc1	TokenNameIdentifier	 doc1
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
aQuery	TokenNameIdentifier	 a Query
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FLOAT_TOLERANCE	TokenNameIdentifier	 FLOAT  TOLERANCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1.0F	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
doc1	TokenNameIdentifier	 doc1
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dQuery	TokenNameIdentifier	 d Query
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FLOAT_TOLERANCE	TokenNameIdentifier	 FLOAT  TOLERANCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
includeOptional	TokenNameIdentifier	 include Optional
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1.0F	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
doc1	TokenNameIdentifier	 doc1
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
cQuery	TokenNameIdentifier	 c Query
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FLOAT_TOLERANCE	TokenNameIdentifier	 FLOAT  TOLERANCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testPhraseQuery	TokenNameIdentifier	 test Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PhraseQuery	TokenNameIdentifier	 Phrase Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
PhraseQuery	TokenNameIdentifier	 Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CountingCollector	TokenNameIdentifier	 Counting Collector
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
CountingCollector	TokenNameIdentifier	 Counting Collector
(	TokenNameLPAREN	
TopScoreDocCollector	TokenNameIdentifier	 Top Score Doc Collector
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
maxDocs	TokenNameIdentifier	 max Docs
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
maxDocs	TokenNameIdentifier	 max Docs
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
docCounts	TokenNameIdentifier	 doc Counts
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
maxDocs	TokenNameIdentifier	 max Docs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
doc0	TokenNameIdentifier	 doc0
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
docCounts	TokenNameIdentifier	 doc Counts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc0	TokenNameIdentifier	 doc0
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2.0F	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
doc0	TokenNameIdentifier	 doc0
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FLOAT_TOLERANCE	TokenNameIdentifier	 FLOAT  TOLERANCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
doc1	TokenNameIdentifier	 doc1
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
docCounts	TokenNameIdentifier	 doc Counts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc1	TokenNameIdentifier	 doc1
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1.0F	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
doc1	TokenNameIdentifier	 doc1
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FLOAT_TOLERANCE	TokenNameIdentifier	 FLOAT  TOLERANCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
