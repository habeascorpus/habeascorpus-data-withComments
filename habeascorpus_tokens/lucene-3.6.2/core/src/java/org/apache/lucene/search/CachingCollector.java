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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
;	TokenNameSEMICOLON	
/** * Caches all docs, and optionally also scores, coming from * a search, and is then able to replay them to another * collector. You specify the max RAM this class may use. * Once the collection is done, call {@link #isCached}. If * this returns true, you can use {@link #replay} against a * new collector. If it returns false, this means too much * RAM was required and you must instead re-run the original * search. * * <p><b>NOTE</b>: this class consumes 4 (or 8 bytes, if * scoring is cached) per collected document. If the result * set is large this can easily be a very substantial amount * of RAM! * * <p><b>NOTE</b>: this class caches at least 128 documents * before checking RAM limits. * * <p>See the Lucene <tt>contrib/grouping</tt> module for more * details including a full code example.</p> * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Caches all docs, and optionally also scores, coming from a search, and is then able to replay them to another collector. You specify the max RAM this class may use. Once the collection is done, call {@link #isCached}. If this returns true, you can use {@link #replay} against a new collector. If it returns false, this means too much RAM was required and you must instead re-run the original search. * <p><b>NOTE</b>: this class consumes 4 (or 8 bytes, if scoring is cached) per collected document. If the result set is large this can easily be a very substantial amount of RAM! * <p><b>NOTE</b>: this class caches at least 128 documents before checking RAM limits. * <p>See the Lucene <tt>contrib/grouping</tt> module for more details including a full code example.</p> * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
CachingCollector	TokenNameIdentifier	 Caching Collector
extends	TokenNameextends	
Collector	TokenNameIdentifier	 Collector
{	TokenNameLBRACE	
// Max out at 512K arrays 	TokenNameCOMMENT_LINE	Max out at 512K arrays 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_ARRAY_SIZE	TokenNameIdentifier	 MAX  ARRAY  SIZE
=	TokenNameEQUAL	
512	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INITIAL_ARRAY_SIZE	TokenNameIdentifier	 INITIAL  ARRAY  SIZE
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EMPTY_INT_ARRAY	TokenNameIdentifier	 EMPTY  INT  ARRAY
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SegStart	TokenNameIdentifier	 Seg Start
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SegStart	TokenNameIdentifier	 Seg Start
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
CachedScorer	TokenNameIdentifier	 Cached Scorer
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
// NOTE: these members are package-private b/c that way accessing them from 	TokenNameCOMMENT_LINE	NOTE: these members are package-private b/c that way accessing them from 
// the outer class does not incur access check by the JVM. The same 	TokenNameCOMMENT_LINE	the outer class does not incur access check by the JVM. The same 
// situation would be if they were defined in the outer class as private 	TokenNameCOMMENT_LINE	situation would be if they were defined in the outer class as private 
// members. 	TokenNameCOMMENT_LINE	members. 
int	TokenNameint	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CachedScorer	TokenNameIdentifier	 Cached Scorer
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
final	TokenNamefinal	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// A CachingCollector which caches scores 	TokenNameCOMMENT_LINE	A CachingCollector which caches scores 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
ScoreCachingCollector	TokenNameIdentifier	 Score Caching Collector
extends	TokenNameextends	
CachingCollector	TokenNameIdentifier	 Caching Collector
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
CachedScorer	TokenNameIdentifier	 Cached Scorer
cachedScorer	TokenNameIdentifier	 cached Scorer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
cachedScores	TokenNameIdentifier	 cached Scores
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
curScores	TokenNameIdentifier	 cur Scores
;	TokenNameSEMICOLON	
ScoreCachingCollector	TokenNameIdentifier	 Score Caching Collector
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
double	TokenNamedouble	
maxRAMMB	TokenNameIdentifier	 max RAMMB
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
maxRAMMB	TokenNameIdentifier	 max RAMMB
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cachedScorer	TokenNameIdentifier	 cached Scorer
=	TokenNameEQUAL	
new	TokenNamenew	
CachedScorer	TokenNameIdentifier	 Cached Scorer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cachedScores	TokenNameIdentifier	 cached Scores
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curScores	TokenNameIdentifier	 cur Scores
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
128	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cachedScores	TokenNameIdentifier	 cached Scores
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
curScores	TokenNameIdentifier	 cur Scores
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ScoreCachingCollector	TokenNameIdentifier	 Score Caching Collector
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
int	TokenNameint	
maxDocsToCache	TokenNameIdentifier	 max Docs To Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
maxDocsToCache	TokenNameIdentifier	 max Docs To Cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cachedScorer	TokenNameIdentifier	 cached Scorer
=	TokenNameEQUAL	
new	TokenNamenew	
CachedScorer	TokenNameIdentifier	 Cached Scorer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cachedScores	TokenNameIdentifier	 cached Scores
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curScores	TokenNameIdentifier	 cur Scores
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
INITIAL_ARRAY_SIZE	TokenNameIdentifier	 INITIAL  ARRAY  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cachedScores	TokenNameIdentifier	 cached Scores
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
curScores	TokenNameIdentifier	 cur Scores
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
if	TokenNameif	
(	TokenNameLPAREN	
curDocs	TokenNameIdentifier	 cur Docs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Cache was too large 	TokenNameCOMMENT_LINE	Cache was too large 
cachedScorer	TokenNameIdentifier	 cached Scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cachedScorer	TokenNameIdentifier	 cached Scorer
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Allocate a bigger array or abort caching 	TokenNameCOMMENT_LINE	Allocate a bigger array or abort caching 
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
curDocs	TokenNameIdentifier	 cur Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
+=	TokenNamePLUS_EQUAL	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
// Compute next array length - don't allocate too big arrays 	TokenNameCOMMENT_LINE	Compute next array length - don't allocate too big arrays 
int	TokenNameint	
nextLength	TokenNameIdentifier	 next Length
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
curDocs	TokenNameIdentifier	 cur Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextLength	TokenNameIdentifier	 next Length
>	TokenNameGREATER	
MAX_ARRAY_SIZE	TokenNameIdentifier	 MAX  ARRAY  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextLength	TokenNameIdentifier	 next Length
=	TokenNameEQUAL	
MAX_ARRAY_SIZE	TokenNameIdentifier	 MAX  ARRAY  SIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
nextLength	TokenNameIdentifier	 next Length
>	TokenNameGREATER	
maxDocsToCache	TokenNameIdentifier	 max Docs To Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// try to allocate a smaller array 	TokenNameCOMMENT_LINE	try to allocate a smaller array 
nextLength	TokenNameIdentifier	 next Length
=	TokenNameEQUAL	
maxDocsToCache	TokenNameIdentifier	 max Docs To Cache
-	TokenNameMINUS	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextLength	TokenNameIdentifier	 next Length
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Too many docs to collect -- clear cache 	TokenNameCOMMENT_LINE	Too many docs to collect -- clear cache 
curDocs	TokenNameIdentifier	 cur Docs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
curScores	TokenNameIdentifier	 cur Scores
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
cachedSegs	TokenNameIdentifier	 cached Segs
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cachedDocs	TokenNameIdentifier	 cached Docs
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cachedScores	TokenNameIdentifier	 cached Scores
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cachedScorer	TokenNameIdentifier	 cached Scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cachedScorer	TokenNameIdentifier	 cached Scorer
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
curDocs	TokenNameIdentifier	 cur Docs
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
nextLength	TokenNameIdentifier	 next Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cachedDocs	TokenNameIdentifier	 cached Docs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
curDocs	TokenNameIdentifier	 cur Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curScores	TokenNameIdentifier	 cur Scores
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
nextLength	TokenNameIdentifier	 next Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cachedScores	TokenNameIdentifier	 cached Scores
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
curScores	TokenNameIdentifier	 cur Scores
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
curDocs	TokenNameIdentifier	 cur Docs
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
cachedScorer	TokenNameIdentifier	 cached Scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
curScores	TokenNameIdentifier	 cur Scores
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
cachedScorer	TokenNameIdentifier	 cached Scorer
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
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
replay	TokenNameIdentifier	 replay
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
replayInit	TokenNameIdentifier	 replay Init
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
curUpto	TokenNameIdentifier	 cur Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
curBase	TokenNameIdentifier	 cur Base
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
chunkUpto	TokenNameIdentifier	 chunk Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
curDocs	TokenNameIdentifier	 cur Docs
=	TokenNameEQUAL	
EMPTY_INT_ARRAY	TokenNameIdentifier	 EMPTY  INT  ARRAY
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SegStart	TokenNameIdentifier	 Seg Start
seg	TokenNameIdentifier	 seg
:	TokenNameCOLON	
cachedSegs	TokenNameIdentifier	 cached Segs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
cachedScorer	TokenNameIdentifier	 cached Scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
curBase	TokenNameIdentifier	 cur Base
+	TokenNamePLUS	
curUpto	TokenNameIdentifier	 cur Upto
<	TokenNameLESS	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
curUpto	TokenNameIdentifier	 cur Upto
==	TokenNameEQUAL_EQUAL	
curDocs	TokenNameIdentifier	 cur Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curBase	TokenNameIdentifier	 cur Base
+=	TokenNamePLUS_EQUAL	
curDocs	TokenNameIdentifier	 cur Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
curDocs	TokenNameIdentifier	 cur Docs
=	TokenNameEQUAL	
cachedDocs	TokenNameIdentifier	 cached Docs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
chunkUpto	TokenNameIdentifier	 chunk Upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curScores	TokenNameIdentifier	 cur Scores
=	TokenNameEQUAL	
cachedScores	TokenNameIdentifier	 cached Scores
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
chunkUpto	TokenNameIdentifier	 chunk Upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chunkUpto	TokenNameIdentifier	 chunk Upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
curUpto	TokenNameIdentifier	 cur Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cachedScorer	TokenNameIdentifier	 cached Scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
curScores	TokenNameIdentifier	 cur Scores
[	TokenNameLBRACKET	
curUpto	TokenNameIdentifier	 cur Upto
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cachedScorer	TokenNameIdentifier	 cached Scorer
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
curDocs	TokenNameIdentifier	 cur Docs
[	TokenNameLBRACKET	
curUpto	TokenNameIdentifier	 cur Upto
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
curDocs	TokenNameIdentifier	 cur Docs
[	TokenNameLBRACKET	
curUpto	TokenNameIdentifier	 cur Upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
cachedScorer	TokenNameIdentifier	 cached Scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isCached	TokenNameIdentifier	 is Cached
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"CachingCollector ("	TokenNameStringLiteral	CachingCollector (
+	TokenNamePLUS	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
+	TokenNamePLUS	
" docs & scores cached)"	TokenNameStringLiteral	 docs & scores cached)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
"CachingCollector (cache was cleared)"	TokenNameStringLiteral	CachingCollector (cache was cleared)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// A CachingCollector which does not cache scores 	TokenNameCOMMENT_LINE	A CachingCollector which does not cache scores 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
NoScoreCachingCollector	TokenNameIdentifier	 No Score Caching Collector
extends	TokenNameextends	
CachingCollector	TokenNameIdentifier	 Caching Collector
{	TokenNameLBRACE	
NoScoreCachingCollector	TokenNameIdentifier	 No Score Caching Collector
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
double	TokenNamedouble	
maxRAMMB	TokenNameIdentifier	 max RAMMB
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
maxRAMMB	TokenNameIdentifier	 max RAMMB
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
NoScoreCachingCollector	TokenNameIdentifier	 No Score Caching Collector
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
int	TokenNameint	
maxDocsToCache	TokenNameIdentifier	 max Docs To Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
maxDocsToCache	TokenNameIdentifier	 max Docs To Cache
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
if	TokenNameif	
(	TokenNameLPAREN	
curDocs	TokenNameIdentifier	 cur Docs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Cache was too large 	TokenNameCOMMENT_LINE	Cache was too large 
other	TokenNameIdentifier	 other
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Allocate a bigger array or abort caching 	TokenNameCOMMENT_LINE	Allocate a bigger array or abort caching 
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
curDocs	TokenNameIdentifier	 cur Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
+=	TokenNamePLUS_EQUAL	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
// Compute next array length - don't allocate too big arrays 	TokenNameCOMMENT_LINE	Compute next array length - don't allocate too big arrays 
int	TokenNameint	
nextLength	TokenNameIdentifier	 next Length
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
curDocs	TokenNameIdentifier	 cur Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextLength	TokenNameIdentifier	 next Length
>	TokenNameGREATER	
MAX_ARRAY_SIZE	TokenNameIdentifier	 MAX  ARRAY  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextLength	TokenNameIdentifier	 next Length
=	TokenNameEQUAL	
MAX_ARRAY_SIZE	TokenNameIdentifier	 MAX  ARRAY  SIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
nextLength	TokenNameIdentifier	 next Length
>	TokenNameGREATER	
maxDocsToCache	TokenNameIdentifier	 max Docs To Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// try to allocate a smaller array 	TokenNameCOMMENT_LINE	try to allocate a smaller array 
nextLength	TokenNameIdentifier	 next Length
=	TokenNameEQUAL	
maxDocsToCache	TokenNameIdentifier	 max Docs To Cache
-	TokenNameMINUS	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextLength	TokenNameIdentifier	 next Length
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Too many docs to collect -- clear cache 	TokenNameCOMMENT_LINE	Too many docs to collect -- clear cache 
curDocs	TokenNameIdentifier	 cur Docs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
cachedSegs	TokenNameIdentifier	 cached Segs
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cachedDocs	TokenNameIdentifier	 cached Docs
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
curDocs	TokenNameIdentifier	 cur Docs
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
nextLength	TokenNameIdentifier	 next Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cachedDocs	TokenNameIdentifier	 cached Docs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
curDocs	TokenNameIdentifier	 cur Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
curDocs	TokenNameIdentifier	 cur Docs
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
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
replay	TokenNameIdentifier	 replay
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
replayInit	TokenNameIdentifier	 replay Init
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
curUpto	TokenNameIdentifier	 cur Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
curbase	TokenNameIdentifier	 curbase
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
chunkUpto	TokenNameIdentifier	 chunk Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
curDocs	TokenNameIdentifier	 cur Docs
=	TokenNameEQUAL	
EMPTY_INT_ARRAY	TokenNameIdentifier	 EMPTY  INT  ARRAY
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SegStart	TokenNameIdentifier	 Seg Start
seg	TokenNameIdentifier	 seg
:	TokenNameCOLON	
cachedSegs	TokenNameIdentifier	 cached Segs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
curbase	TokenNameIdentifier	 curbase
+	TokenNamePLUS	
curUpto	TokenNameIdentifier	 cur Upto
<	TokenNameLESS	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
curUpto	TokenNameIdentifier	 cur Upto
==	TokenNameEQUAL_EQUAL	
curDocs	TokenNameIdentifier	 cur Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curbase	TokenNameIdentifier	 curbase
+=	TokenNamePLUS_EQUAL	
curDocs	TokenNameIdentifier	 cur Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
curDocs	TokenNameIdentifier	 cur Docs
=	TokenNameEQUAL	
cachedDocs	TokenNameIdentifier	 cached Docs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
chunkUpto	TokenNameIdentifier	 chunk Upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chunkUpto	TokenNameIdentifier	 chunk Upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
curUpto	TokenNameIdentifier	 cur Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
curDocs	TokenNameIdentifier	 cur Docs
[	TokenNameLBRACKET	
curUpto	TokenNameIdentifier	 cur Upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isCached	TokenNameIdentifier	 is Cached
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"CachingCollector ("	TokenNameStringLiteral	CachingCollector (
+	TokenNamePLUS	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
+	TokenNamePLUS	
" docs cached)"	TokenNameStringLiteral	 docs cached)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
"CachingCollector (cache was cleared)"	TokenNameStringLiteral	CachingCollector (cache was cleared)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// TODO: would be nice if a collector defined a 	TokenNameCOMMENT_LINE	TODO: would be nice if a collector defined a 
// needsScores() method so we can specialize / do checks 	TokenNameCOMMENT_LINE	needsScores() method so we can specialize / do checks 
// up front. This is only relevant for the ScoreCaching 	TokenNameCOMMENT_LINE	up front. This is only relevant for the ScoreCaching 
// version -- if the wrapped Collector does not need 	TokenNameCOMMENT_LINE	version -- if the wrapped Collector does not need 
// scores, it can avoid cachedScorer entirely. 	TokenNameCOMMENT_LINE	scores, it can avoid cachedScorer entirely. 
protected	TokenNameprotected	
final	TokenNamefinal	
Collector	TokenNameIdentifier	 Collector
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
maxDocsToCache	TokenNameIdentifier	 max Docs To Cache
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegStart	TokenNameIdentifier	 Seg Start
>	TokenNameGREATER	
cachedSegs	TokenNameIdentifier	 cached Segs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegStart	TokenNameIdentifier	 Seg Start
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
cachedDocs	TokenNameIdentifier	 cached Docs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexReader	TokenNameIdentifier	 Index Reader
lastReader	TokenNameIdentifier	 last Reader
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
curDocs	TokenNameIdentifier	 cur Docs
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
lastDocBase	TokenNameIdentifier	 last Doc Base
;	TokenNameSEMICOLON	
/** * Creates a {@link CachingCollector} which does not wrap another collector. * The cached documents and scores can later be {@link #replay(Collector) * replayed}. * * @param acceptDocsOutOfOrder * whether documents are allowed to be collected out-of-order */	TokenNameCOMMENT_JAVADOC	 Creates a {@link CachingCollector} which does not wrap another collector. The cached documents and scores can later be {@link #replay(Collector) replayed}. * @param acceptDocsOutOfOrder whether documents are allowed to be collected out-of-order 
public	TokenNamepublic	
static	TokenNamestatic	
CachingCollector	TokenNameIdentifier	 Caching Collector
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
acceptDocsOutOfOrder	TokenNameIdentifier	 accept Docs Out Of Order
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cacheScores	TokenNameIdentifier	 cache Scores
,	TokenNameCOMMA	
double	TokenNamedouble	
maxRAMMB	TokenNameIdentifier	 max RAMMB
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collector	TokenNameIdentifier	 Collector
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
new	TokenNamenew	
Collector	TokenNameIdentifier	 Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
cacheScores	TokenNameIdentifier	 cache Scores
,	TokenNameCOMMA	
maxRAMMB	TokenNameIdentifier	 max RAMMB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new {@link CachingCollector} that wraps the given collector and * caches documents and scores up to the specified RAM threshold. * * @param other * the Collector to wrap and delegate calls to. * @param cacheScores * whether to cache scores in addition to document IDs. Note that * this increases the RAM consumed per doc * @param maxRAMMB * the maximum RAM in MB to consume for caching the documents and * scores. If the collector exceeds the threshold, no documents and * scores are cached. */	TokenNameCOMMENT_JAVADOC	 Create a new {@link CachingCollector} that wraps the given collector and caches documents and scores up to the specified RAM threshold. * @param other the Collector to wrap and delegate calls to. @param cacheScores whether to cache scores in addition to document IDs. Note that this increases the RAM consumed per doc @param maxRAMMB the maximum RAM in MB to consume for caching the documents and scores. If the collector exceeds the threshold, no documents and scores are cached. 
public	TokenNamepublic	
static	TokenNamestatic	
CachingCollector	TokenNameIdentifier	 Caching Collector
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cacheScores	TokenNameIdentifier	 cache Scores
,	TokenNameCOMMA	
double	TokenNamedouble	
maxRAMMB	TokenNameIdentifier	 max RAMMB
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cacheScores	TokenNameIdentifier	 cache Scores
?	TokenNameQUESTION	
new	TokenNamenew	
ScoreCachingCollector	TokenNameIdentifier	 Score Caching Collector
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
maxRAMMB	TokenNameIdentifier	 max RAMMB
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
NoScoreCachingCollector	TokenNameIdentifier	 No Score Caching Collector
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
maxRAMMB	TokenNameIdentifier	 max RAMMB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new {@link CachingCollector} that wraps the given collector and * caches documents and scores up to the specified max docs threshold. * * @param other * the Collector to wrap and delegate calls to. * @param cacheScores * whether to cache scores in addition to document IDs. Note that * this increases the RAM consumed per doc * @param maxDocsToCache * the maximum number of documents for caching the documents and * possible the scores. If the collector exceeds the threshold, * no documents and scores are cached. */	TokenNameCOMMENT_JAVADOC	 Create a new {@link CachingCollector} that wraps the given collector and caches documents and scores up to the specified max docs threshold. * @param other the Collector to wrap and delegate calls to. @param cacheScores whether to cache scores in addition to document IDs. Note that this increases the RAM consumed per doc @param maxDocsToCache the maximum number of documents for caching the documents and possible the scores. If the collector exceeds the threshold, no documents and scores are cached. 
public	TokenNamepublic	
static	TokenNamestatic	
CachingCollector	TokenNameIdentifier	 Caching Collector
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cacheScores	TokenNameIdentifier	 cache Scores
,	TokenNameCOMMA	
int	TokenNameint	
maxDocsToCache	TokenNameIdentifier	 max Docs To Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cacheScores	TokenNameIdentifier	 cache Scores
?	TokenNameQUESTION	
new	TokenNamenew	
ScoreCachingCollector	TokenNameIdentifier	 Score Caching Collector
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
maxDocsToCache	TokenNameIdentifier	 max Docs To Cache
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
NoScoreCachingCollector	TokenNameIdentifier	 No Score Caching Collector
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
maxDocsToCache	TokenNameIdentifier	 max Docs To Cache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Prevent extension from non-internal classes 	TokenNameCOMMENT_LINE	Prevent extension from non-internal classes 
private	TokenNameprivate	
CachingCollector	TokenNameIdentifier	 Caching Collector
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
double	TokenNamedouble	
maxRAMMB	TokenNameIdentifier	 max RAMMB
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cacheScores	TokenNameIdentifier	 cache Scores
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
cachedDocs	TokenNameIdentifier	 cached Docs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curDocs	TokenNameIdentifier	 cur Docs
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
INITIAL_ARRAY_SIZE	TokenNameIdentifier	 INITIAL  ARRAY  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cachedDocs	TokenNameIdentifier	 cached Docs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
curDocs	TokenNameIdentifier	 cur Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bytesPerDoc	TokenNameIdentifier	 bytes Per Doc
=	TokenNameEQUAL	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cacheScores	TokenNameIdentifier	 cache Scores
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytesPerDoc	TokenNameIdentifier	 bytes Per Doc
+=	TokenNamePLUS_EQUAL	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_FLOAT	TokenNameIdentifier	 NUM  BYTES  FLOAT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
maxDocsToCache	TokenNameIdentifier	 max Docs To Cache
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
maxRAMMB	TokenNameIdentifier	 max RAMMB
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
bytesPerDoc	TokenNameIdentifier	 bytes Per Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
CachingCollector	TokenNameIdentifier	 Caching Collector
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
int	TokenNameint	
maxDocsToCache	TokenNameIdentifier	 max Docs To Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
cachedDocs	TokenNameIdentifier	 cached Docs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curDocs	TokenNameIdentifier	 cur Docs
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
INITIAL_ARRAY_SIZE	TokenNameIdentifier	 INITIAL  ARRAY  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cachedDocs	TokenNameIdentifier	 cached Docs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
curDocs	TokenNameIdentifier	 cur Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxDocsToCache	TokenNameIdentifier	 max Docs To Cache
=	TokenNameEQUAL	
maxDocsToCache	TokenNameIdentifier	 max Docs To Cache
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
public	TokenNamepublic	
boolean	TokenNameboolean	
isCached	TokenNameIdentifier	 is Cached
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
curDocs	TokenNameIdentifier	 cur Docs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
other	TokenNameIdentifier	 other
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastReader	TokenNameIdentifier	 last Reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cachedSegs	TokenNameIdentifier	 cached Segs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
SegStart	TokenNameIdentifier	 Seg Start
(	TokenNameLPAREN	
lastReader	TokenNameIdentifier	 last Reader
,	TokenNameCOMMA	
lastDocBase	TokenNameIdentifier	 last Doc Base
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastDocBase	TokenNameIdentifier	 last Doc Base
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
lastReader	TokenNameIdentifier	 last Reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Reused by the specialized inner classes. */	TokenNameCOMMENT_JAVADOC	 Reused by the specialized inner classes. 
void	TokenNamevoid	
replayInit	TokenNameIdentifier	 replay Init
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isCached	TokenNameIdentifier	 is Cached
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"cannot replay: cache was cleared because too much RAM was required"	TokenNameStringLiteral	cannot replay: cache was cleared because too much RAM was required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
acceptsDocsOutOfOrder	TokenNameIdentifier	 accepts Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
acceptsDocsOutOfOrder	TokenNameIdentifier	 accepts Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"cannot replay: given collector does not support "	TokenNameStringLiteral	cannot replay: given collector does not support 
+	TokenNamePLUS	
"out-of-order collection, while the wrapped collector does. "	TokenNameStringLiteral	out-of-order collection, while the wrapped collector does. 
+	TokenNamePLUS	
"Therefore cached documents may be out-of-order."	TokenNameStringLiteral	Therefore cached documents may be out-of-order.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println("CC: replay totHits=" + (upto + base)); 	TokenNameCOMMENT_LINE	System.out.println("CC: replay totHits=" + (upto + base)); 
if	TokenNameif	
(	TokenNameLPAREN	
lastReader	TokenNameIdentifier	 last Reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cachedSegs	TokenNameIdentifier	 cached Segs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
SegStart	TokenNameIdentifier	 Seg Start
(	TokenNameLPAREN	
lastReader	TokenNameIdentifier	 last Reader
,	TokenNameCOMMA	
lastDocBase	TokenNameIdentifier	 last Doc Base
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastReader	TokenNameIdentifier	 last Reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Replays the cached doc IDs (and scores) to the given Collector. If this * instance does not cache scores, then Scorer is not set on * {@code other.setScorer} as well as scores are not replayed. * * @throws IllegalStateException * if this collector is not cached (i.e., if the RAM limits were too * low for the number of documents + scores to cache). * @throws IllegalArgumentException * if the given Collect's does not support out-of-order collection, * while the collector passed to the ctor does. */	TokenNameCOMMENT_JAVADOC	 Replays the cached doc IDs (and scores) to the given Collector. If this instance does not cache scores, then Scorer is not set on {@code other.setScorer} as well as scores are not replayed. * @throws IllegalStateException if this collector is not cached (i.e., if the RAM limits were too low for the number of documents + scores to cache). @throws IllegalArgumentException if the given Collect's does not support out-of-order collection, while the collector passed to the ctor does. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
replay	TokenNameIdentifier	 replay
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
