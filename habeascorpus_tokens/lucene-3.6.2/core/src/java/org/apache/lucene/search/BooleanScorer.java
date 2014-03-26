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
BooleanQuery	TokenNameIdentifier	 Boolean Query
.	TokenNameDOT	
BooleanWeight	TokenNameIdentifier	 Boolean Weight
;	TokenNameSEMICOLON	
/* Description from Doug Cutting (excerpted from * LUCENE-1483): * * BooleanScorer uses an array to score windows of * 2K docs. So it scores docs 0-2K first, then docs 2K-4K, * etc. For each window it iterates through all query terms * and accumulates a score in table[doc%2K]. It also stores * in the table a bitmask representing which terms * contributed to the score. Non-zero scores are chained in * a linked list. At the end of scoring each window it then * iterates through the linked list and, if the bitmask * matches the boolean constraints, collects a hit. For * boolean queries with lots of frequent terms this can be * much faster, since it does not need to update a priority * queue for each posting, instead performing constant-time * operations per posting. The only downside is that it * results in hits being delivered out-of-order within the * window, which means it cannot be nested within other * scorers. But it works well as a top-level scorer. * * The new BooleanScorer2 implementation instead works by * merging priority queues of postings, albeit with some * clever tricks. For example, a pure conjunction (all terms * required) does not require a priority queue. Instead it * sorts the posting streams at the start, then repeatedly * skips the first to to the last. If the first ever equals * the last, then there's a hit. When some terms are * required and some terms are optional, the conjunction can * be evaluated first, then the optional terms can all skip * to the match and be added to the score. Thus the * conjunction can reduce the number of priority queue * updates for the optional terms. */	TokenNameCOMMENT_BLOCK	 Description from Doug Cutting (excerpted from LUCENE-1483): * BooleanScorer uses an array to score windows of 2K docs. So it scores docs 0-2K first, then docs 2K-4K, etc. For each window it iterates through all query terms and accumulates a score in table[doc%2K]. It also stores in the table a bitmask representing which terms contributed to the score. Non-zero scores are chained in a linked list. At the end of scoring each window it then iterates through the linked list and, if the bitmask matches the boolean constraints, collects a hit. For boolean queries with lots of frequent terms this can be much faster, since it does not need to update a priority queue for each posting, instead performing constant-time operations per posting. The only downside is that it results in hits being delivered out-of-order within the window, which means it cannot be nested within other scorers. But it works well as a top-level scorer. * The new BooleanScorer2 implementation instead works by merging priority queues of postings, albeit with some clever tricks. For example, a pure conjunction (all terms required) does not require a priority queue. Instead it sorts the posting streams at the start, then repeatedly skips the first to to the last. If the first ever equals the last, then there's a hit. When some terms are required and some terms are optional, the conjunction can be evaluated first, then the optional terms can all skip to the match and be added to the score. Thus the conjunction can reduce the number of priority queue updates for the optional terms. 
final	TokenNamefinal	
class	TokenNameclass	
BooleanScorer	TokenNameIdentifier	 Boolean Scorer
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
BooleanScorerCollector	TokenNameIdentifier	 Boolean Scorer Collector
extends	TokenNameextends	
Collector	TokenNameIdentifier	 Collector
{	TokenNameLBRACE	
private	TokenNameprivate	
BucketTable	TokenNameIdentifier	 Bucket Table
bucketTable	TokenNameIdentifier	 bucket Table
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BooleanScorerCollector	TokenNameIdentifier	 Boolean Scorer Collector
(	TokenNameLPAREN	
int	TokenNameint	
mask	TokenNameIdentifier	 mask
,	TokenNameCOMMA	
BucketTable	TokenNameIdentifier	 Bucket Table
bucketTable	TokenNameIdentifier	 bucket Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mask	TokenNameIdentifier	 mask
=	TokenNameEQUAL	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bucketTable	TokenNameIdentifier	 bucket Table
=	TokenNameEQUAL	
bucketTable	TokenNameIdentifier	 bucket Table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
BucketTable	TokenNameIdentifier	 Bucket Table
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
bucketTable	TokenNameIdentifier	 bucket Table
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
&	TokenNameAND	
BucketTable	TokenNameIdentifier	 Bucket Table
.	TokenNameDOT	
MASK	TokenNameIdentifier	 MASK
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Bucket	TokenNameIdentifier	 Bucket
bucket	TokenNameIdentifier	 bucket
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
buckets	TokenNameIdentifier	 buckets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
!=	TokenNameNOT_EQUAL	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// invalid bucket 	TokenNameCOMMENT_LINE	invalid bucket 
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
// set doc 	TokenNameCOMMENT_LINE	set doc 
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// initialize score 	TokenNameCOMMENT_LINE	initialize score 
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
// initialize mask 	TokenNameCOMMENT_LINE	initialize mask 
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
coord	TokenNameIdentifier	 coord
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// initialize coord 	TokenNameCOMMENT_LINE	initialize coord 
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
// push onto valid list 	TokenNameCOMMENT_LINE	push onto valid list 
table	TokenNameIdentifier	 table
.	TokenNameDOT	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
bucket	TokenNameIdentifier	 bucket
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// valid bucket 	TokenNameCOMMENT_LINE	valid bucket 
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
score	TokenNameIdentifier	 score
+=	TokenNamePLUS_EQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// increment score 	TokenNameCOMMENT_LINE	increment score 
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
|=	TokenNameOR_EQUAL	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
// add bits in mask 	TokenNameCOMMENT_LINE	add bits in mask 
bucket	TokenNameIdentifier	 bucket
.	TokenNameDOT	
coord	TokenNameIdentifier	 coord
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// increment coord 	TokenNameCOMMENT_LINE	increment coord 
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
// not needed by this implementation 	TokenNameCOMMENT_LINE	not needed by this implementation 
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
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// An internal class which is used in score(Collector, int) for setting the 	TokenNameCOMMENT_LINE	An internal class which is used in score(Collector, int) for setting the 
// current score. This is required since Collector exposes a setScorer method 	TokenNameCOMMENT_LINE	current score. This is required since Collector exposes a setScorer method 
// and implementations that need the score will call scorer.score(). 	TokenNameCOMMENT_LINE	and implementations that need the score will call scorer.score(). 
// Therefore the only methods that are implemented are score() and doc(). 	TokenNameCOMMENT_LINE	Therefore the only methods that are implemented are score() and doc(). 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
BucketScorer	TokenNameIdentifier	 Bucket Scorer
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
int	TokenNameint	
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BucketScorer	TokenNameIdentifier	 Bucket Scorer
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
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
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
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
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
freq	TokenNameIdentifier	 freq
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
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
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
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Bucket	TokenNameIdentifier	 Bucket
{	TokenNameLBRACE	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// tells if bucket is valid 	TokenNameCOMMENT_LINE	tells if bucket is valid 
float	TokenNamefloat	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
// incremental score 	TokenNameCOMMENT_LINE	incremental score 
// TODO: break out bool anyProhibited, int 	TokenNameCOMMENT_LINE	TODO: break out bool anyProhibited, int 
// numRequiredMatched; then we can remove 32 limit on 	TokenNameCOMMENT_LINE	numRequiredMatched; then we can remove 32 limit on 
// required clauses 	TokenNameCOMMENT_LINE	required clauses 
int	TokenNameint	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
// used for bool constraints 	TokenNameCOMMENT_LINE	used for bool constraints 
int	TokenNameint	
coord	TokenNameIdentifier	 coord
;	TokenNameSEMICOLON	
// count of terms in score 	TokenNameCOMMENT_LINE	count of terms in score 
Bucket	TokenNameIdentifier	 Bucket
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
// next valid bucket 	TokenNameCOMMENT_LINE	next valid bucket 
}	TokenNameRBRACE	
/** A simple hash table of document scores within a range. */	TokenNameCOMMENT_JAVADOC	 A simple hash table of document scores within a range. 
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
BucketTable	TokenNameIdentifier	 Bucket Table
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SIZE	TokenNameIdentifier	 SIZE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MASK	TokenNameIdentifier	 MASK
=	TokenNameEQUAL	
SIZE	TokenNameIdentifier	 SIZE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Bucket	TokenNameIdentifier	 Bucket
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buckets	TokenNameIdentifier	 buckets
=	TokenNameEQUAL	
new	TokenNamenew	
Bucket	TokenNameIdentifier	 Bucket
[	TokenNameLBRACKET	
SIZE	TokenNameIdentifier	 SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Bucket	TokenNameIdentifier	 Bucket
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// head of valid list 	TokenNameCOMMENT_LINE	head of valid list 
public	TokenNamepublic	
BucketTable	TokenNameIdentifier	 Bucket Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Pre-fill to save the lazy init when collecting 	TokenNameCOMMENT_LINE	Pre-fill to save the lazy init when collecting 
// each sub: 	TokenNameCOMMENT_LINE	each sub: 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
SIZE	TokenNameIdentifier	 SIZE
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buckets	TokenNameIdentifier	 buckets
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Bucket	TokenNameIdentifier	 Bucket
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collector	TokenNameIdentifier	 Collector
newCollector	TokenNameIdentifier	 new Collector
(	TokenNameLPAREN	
int	TokenNameint	
mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BooleanScorerCollector	TokenNameIdentifier	 Boolean Scorer Collector
(	TokenNameLPAREN	
mask	TokenNameIdentifier	 mask
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SIZE	TokenNameIdentifier	 SIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
SubScorer	TokenNameIdentifier	 Sub Scorer
{	TokenNameLBRACE	
public	TokenNamepublic	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
// TODO: re-enable this if BQ ever sends us required clauses 	TokenNameCOMMENT_LINE	TODO: re-enable this if BQ ever sends us required clauses 
//public boolean required = false; 	TokenNameCOMMENT_LINE	public boolean required = false; 
public	TokenNamepublic	
boolean	TokenNameboolean	
prohibited	TokenNameIdentifier	 prohibited
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Collector	TokenNameIdentifier	 Collector
collector	TokenNameIdentifier	 collector
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SubScorer	TokenNameIdentifier	 Sub Scorer
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SubScorer	TokenNameIdentifier	 Sub Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
,	TokenNameCOMMA	
boolean	TokenNameboolean	
required	TokenNameIdentifier	 required
,	TokenNameCOMMA	
boolean	TokenNameboolean	
prohibited	TokenNameIdentifier	 prohibited
,	TokenNameCOMMA	
Collector	TokenNameIdentifier	 Collector
collector	TokenNameIdentifier	 collector
,	TokenNameCOMMA	
SubScorer	TokenNameIdentifier	 Sub Scorer
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
required	TokenNameIdentifier	 required
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"this scorer cannot handle required=true"	TokenNameStringLiteral	this scorer cannot handle required=true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
// TODO: re-enable this if BQ ever sends us required clauses 	TokenNameCOMMENT_LINE	TODO: re-enable this if BQ ever sends us required clauses 
//this.required = required; 	TokenNameCOMMENT_LINE	this.required = required; 
this	TokenNamethis	
.	TokenNameDOT	
prohibited	TokenNameIdentifier	 prohibited
=	TokenNameEQUAL	
prohibited	TokenNameIdentifier	 prohibited
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
collector	TokenNameIdentifier	 collector
=	TokenNameEQUAL	
collector	TokenNameIdentifier	 collector
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
SubScorer	TokenNameIdentifier	 Sub Scorer
scorers	TokenNameIdentifier	 scorers
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BucketTable	TokenNameIdentifier	 Bucket Table
bucketTable	TokenNameIdentifier	 bucket Table
=	TokenNameEQUAL	
new	TokenNamenew	
BucketTable	TokenNameIdentifier	 Bucket Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
coordFactors	TokenNameIdentifier	 coord Factors
;	TokenNameSEMICOLON	
// TODO: re-enable this if BQ ever sends us required clauses 	TokenNameCOMMENT_LINE	TODO: re-enable this if BQ ever sends us required clauses 
//private int requiredMask = 0; 	TokenNameCOMMENT_LINE	private int requiredMask = 0; 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Bucket	TokenNameIdentifier	 Bucket
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
// Any time a prohibited clause matches we set bit 0: 	TokenNameCOMMENT_LINE	Any time a prohibited clause matches we set bit 0: 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PROHIBITED_MASK	TokenNameIdentifier	 PROHIBITED  MASK
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
BooleanScorer	TokenNameIdentifier	 Boolean Scorer
(	TokenNameLPAREN	
BooleanWeight	TokenNameIdentifier	 Boolean Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
boolean	TokenNameboolean	
disableCoord	TokenNameIdentifier	 disable Coord
,	TokenNameCOMMA	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
int	TokenNameint	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
optionalScorers	TokenNameIdentifier	 optional Scorers
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
prohibitedScorers	TokenNameIdentifier	 prohibited Scorers
,	TokenNameCOMMA	
int	TokenNameint	
maxCoord	TokenNameIdentifier	 max Coord
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
=	TokenNameEQUAL	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
optionalScorers	TokenNameIdentifier	 optional Scorers
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
optionalScorers	TokenNameIdentifier	 optional Scorers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
:	TokenNameCOLON	
optionalScorers	TokenNameIdentifier	 optional Scorers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scorers	TokenNameIdentifier	 scorers
=	TokenNameEQUAL	
new	TokenNamenew	
SubScorer	TokenNameIdentifier	 Sub Scorer
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
bucketTable	TokenNameIdentifier	 bucket Table
.	TokenNameDOT	
newCollector	TokenNameIdentifier	 new Collector
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
scorers	TokenNameIdentifier	 scorers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prohibitedScorers	TokenNameIdentifier	 prohibited Scorers
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
prohibitedScorers	TokenNameIdentifier	 prohibited Scorers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
:	TokenNameCOLON	
prohibitedScorers	TokenNameIdentifier	 prohibited Scorers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scorers	TokenNameIdentifier	 scorers
=	TokenNameEQUAL	
new	TokenNamenew	
SubScorer	TokenNameIdentifier	 Sub Scorer
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
bucketTable	TokenNameIdentifier	 bucket Table
.	TokenNameDOT	
newCollector	TokenNameIdentifier	 new Collector
(	TokenNameLPAREN	
PROHIBITED_MASK	TokenNameIdentifier	 PROHIBITED  MASK
)	TokenNameRPAREN	
,	TokenNameCOMMA	
scorers	TokenNameIdentifier	 scorers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
coordFactors	TokenNameIdentifier	 coord Factors
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
optionalScorers	TokenNameIdentifier	 optional Scorers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
coordFactors	TokenNameIdentifier	 coord Factors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
coordFactors	TokenNameIdentifier	 coord Factors
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
disableCoord	TokenNameIdentifier	 disable Coord
?	TokenNameQUESTION	
1.0f	TokenNameFloatingPointLiteral	
:	TokenNameCOLON	
weight	TokenNameIdentifier	 weight
.	TokenNameDOT	
coord	TokenNameIdentifier	 coord
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
maxCoord	TokenNameIdentifier	 max Coord
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// firstDocID is ignored since nextDoc() initializes 'current' 	TokenNameCOMMENT_LINE	firstDocID is ignored since nextDoc() initializes 'current' 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
collector	TokenNameIdentifier	 collector
,	TokenNameCOMMA	
int	TokenNameint	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
int	TokenNameint	
firstDocID	TokenNameIdentifier	 first Doc ID
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Make sure it's only BooleanScorer that calls us: 	TokenNameCOMMENT_LINE	Make sure it's only BooleanScorer that calls us: 
assert	TokenNameassert	
firstDocID	TokenNameIdentifier	 first Doc ID
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
more	TokenNameIdentifier	 more
;	TokenNameSEMICOLON	
Bucket	TokenNameIdentifier	 Bucket
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
BucketScorer	TokenNameIdentifier	 Bucket Scorer
bs	TokenNameIdentifier	 bs
=	TokenNameEQUAL	
new	TokenNamenew	
BucketScorer	TokenNameIdentifier	 Bucket Scorer
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The internal loop will set the score and doc before calling collect. 	TokenNameCOMMENT_LINE	The internal loop will set the score and doc before calling collect. 
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
bs	TokenNameIdentifier	 bs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
bucketTable	TokenNameIdentifier	 bucket Table
.	TokenNameDOT	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// more queued 	TokenNameCOMMENT_LINE	more queued 
// check prohibited & required 	TokenNameCOMMENT_LINE	check prohibited & required 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
bits	TokenNameIdentifier	 bits
&	TokenNameAND	
PROHIBITED_MASK	TokenNameIdentifier	 PROHIBITED  MASK
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: re-enable this if BQ ever sends us required 	TokenNameCOMMENT_LINE	TODO: re-enable this if BQ ever sends us required 
// clauses 	TokenNameCOMMENT_LINE	clauses 
//&& (current.bits & requiredMask) == requiredMask) { 	TokenNameCOMMENT_LINE	&& (current.bits & requiredMask) == requiredMask) { 
// TODO: can we remove this? 	TokenNameCOMMENT_LINE	TODO: can we remove this? 
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
>=	TokenNameGREATER_EQUAL	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
bucketTable	TokenNameIdentifier	 bucket Table
.	TokenNameDOT	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
bucketTable	TokenNameIdentifier	 bucket Table
.	TokenNameDOT	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
coord	TokenNameIdentifier	 coord
>=	TokenNameGREATER_EQUAL	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bs	TokenNameIdentifier	 bs
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
score	TokenNameIdentifier	 score
*	TokenNameMULTIPLY	
coordFactors	TokenNameIdentifier	 coord Factors
[	TokenNameLBRACKET	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
coord	TokenNameIdentifier	 coord
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bs	TokenNameIdentifier	 bs
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
bs	TokenNameIdentifier	 bs
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
coord	TokenNameIdentifier	 coord
;	TokenNameSEMICOLON	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
// pop the queue 	TokenNameCOMMENT_LINE	pop the queue 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bucketTable	TokenNameIdentifier	 bucket Table
.	TokenNameDOT	
first	TokenNameIdentifier	 first
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
bucketTable	TokenNameIdentifier	 bucket Table
.	TokenNameDOT	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
bucketTable	TokenNameIdentifier	 bucket Table
.	TokenNameDOT	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// refill the queue 	TokenNameCOMMENT_LINE	refill the queue 
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
+=	TokenNamePLUS_EQUAL	
BucketTable	TokenNameIdentifier	 Bucket Table
.	TokenNameDOT	
SIZE	TokenNameIdentifier	 SIZE
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SubScorer	TokenNameIdentifier	 Sub Scorer
sub	TokenNameIdentifier	 sub
=	TokenNameEQUAL	
scorers	TokenNameIdentifier	 scorers
;	TokenNameSEMICOLON	
sub	TokenNameIdentifier	 sub
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
sub	TokenNameIdentifier	 sub
=	TokenNameEQUAL	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
subScorerDocID	TokenNameIdentifier	 sub Scorer Doc ID
=	TokenNameEQUAL	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subScorerDocID	TokenNameIdentifier	 sub Scorer Doc ID
!=	TokenNameNOT_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
more	TokenNameIdentifier	 more
|=	TokenNameOR_EQUAL	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
collector	TokenNameIdentifier	 collector
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
subScorerDocID	TokenNameIdentifier	 sub Scorer Doc ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
bucketTable	TokenNameIdentifier	 bucket Table
.	TokenNameDOT	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
more	TokenNameIdentifier	 more
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
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
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
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
int	TokenNameint	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
float	TokenNamefloat	
score	TokenNameIdentifier	 score
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
void	TokenNamevoid	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
collector	TokenNameIdentifier	 collector
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
collector	TokenNameIdentifier	 collector
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"boolean("	TokenNameStringLiteral	boolean(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SubScorer	TokenNameIdentifier	 Sub Scorer
sub	TokenNameIdentifier	 sub
=	TokenNameEQUAL	
scorers	TokenNameIdentifier	 scorers
;	TokenNameSEMICOLON	
sub	TokenNameIdentifier	 sub
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
sub	TokenNameIdentifier	 sub
=	TokenNameEQUAL	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
visitSubScorers	TokenNameIdentifier	 visit Sub Scorers
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
relationship	TokenNameIdentifier	 relationship
,	TokenNameCOMMA	
ScorerVisitor	TokenNameIdentifier	 Scorer Visitor
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
visitSubScorers	TokenNameIdentifier	 visit Sub Scorers
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
relationship	TokenNameIdentifier	 relationship
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SubScorer	TokenNameIdentifier	 Sub Scorer
sub	TokenNameIdentifier	 sub
=	TokenNameEQUAL	
scorers	TokenNameIdentifier	 scorers
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sub	TokenNameIdentifier	 sub
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: re-enable this if BQ ever sends us required 	TokenNameCOMMENT_LINE	TODO: re-enable this if BQ ever sends us required 
//clauses 	TokenNameCOMMENT_LINE	clauses 
//if (sub.required) { 	TokenNameCOMMENT_LINE	if (sub.required) { 
//relationship = Occur.MUST; 	TokenNameCOMMENT_LINE	relationship = Occur.MUST; 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
prohibited	TokenNameIdentifier	 prohibited
)	TokenNameRPAREN	
{	TokenNameLBRACE	
relationship	TokenNameIdentifier	 relationship
=	TokenNameEQUAL	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// TODO: maybe it's pointless to do this, but, it is 	TokenNameCOMMENT_LINE	TODO: maybe it's pointless to do this, but, it is 
// possible the doc may still be collected, eg foo 	TokenNameCOMMENT_LINE	possible the doc may still be collected, eg foo 
// OR (bar -fee) 	TokenNameCOMMENT_LINE	OR (bar -fee) 
relationship	TokenNameIdentifier	 relationship
=	TokenNameEQUAL	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
visitSubScorers	TokenNameIdentifier	 visit Sub Scorers
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
relationship	TokenNameIdentifier	 relationship
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sub	TokenNameIdentifier	 sub
=	TokenNameEQUAL	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
