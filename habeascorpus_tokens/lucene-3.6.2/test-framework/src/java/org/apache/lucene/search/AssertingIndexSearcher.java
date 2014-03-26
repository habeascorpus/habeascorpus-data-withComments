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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ExecutorService	TokenNameIdentifier	 Executor Service
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
/** * Helper class that adds some extra checks to ensure correct * usage of {@code IndexSearcher} and {@code Weight}. * TODO: Extend this by more checks, that's just a start. */	TokenNameCOMMENT_JAVADOC	 Helper class that adds some extra checks to ensure correct usage of {@code IndexSearcher} and {@code Weight}. TODO: Extend this by more checks, that's just a start. 
public	TokenNamepublic	
class	TokenNameclass	
AssertingIndexSearcher	TokenNameIdentifier	 Asserting Index Searcher
extends	TokenNameextends	
IndexSearcher	TokenNameIdentifier	 Index Searcher
{	TokenNameLBRACE	
public	TokenNamepublic	
AssertingIndexSearcher	TokenNameIdentifier	 Asserting Index Searcher
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AssertingIndexSearcher	TokenNameIdentifier	 Asserting Index Searcher
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
ExecutorService	TokenNameIdentifier	 Executor Service
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not anonymous because else not serializable (compare trunk) 	TokenNameCOMMENT_LINE	not anonymous because else not serializable (compare trunk) 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
UnmodifiableWeight	TokenNameIdentifier	 Unmodifiable Weight
extends	TokenNameextends	
Weight	TokenNameIdentifier	 Weight
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Weight	TokenNameIdentifier	 Weight
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
UnmodifiableWeight	TokenNameIdentifier	 Unmodifiable Weight
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
float	TokenNamefloat	
norm	TokenNameIdentifier	 norm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Weight already normalized."	TokenNameStringLiteral	Weight already normalized.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
boolean	TokenNameboolean	
scoreDocsInOrder	TokenNameIdentifier	 score Docs In Order
,	TokenNameCOMMA	
boolean	TokenNameboolean	
topScorer	TokenNameIdentifier	 top Scorer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
scoreDocsInOrder	TokenNameIdentifier	 score Docs In Order
,	TokenNameCOMMA	
topScorer	TokenNameIdentifier	 top Scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check that scorer obeys disi contract for docID() before next()/advance 	TokenNameCOMMENT_LINE	check that scorer obeys disi contract for docID() before next()/advance 
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
docid	TokenNameIdentifier	 docid
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
docid	TokenNameIdentifier	 docid
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
docid	TokenNameIdentifier	 docid
==	TokenNameEQUAL_EQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
ignored	TokenNameIdentifier	 ignored
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// from a top-level BS1 	TokenNameCOMMENT_LINE	from a top-level BS1 
assert	TokenNameassert	
topScorer	TokenNameIdentifier	 top Scorer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
sumOfSquaredWeights	TokenNameIdentifier	 sum Of Squared Weights
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Weight already normalized."	TokenNameStringLiteral	Weight already normalized.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
scoresDocsOutOfOrder	TokenNameIdentifier	 scores Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
scoresDocsOutOfOrder	TokenNameIdentifier	 scores Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Ensures, that the returned {@code Weight} is not normalized again, which may produce wrong scores. */	TokenNameCOMMENT_JAVADOC	 Ensures, that the returned {@code Weight} is not normalized again, which may produce wrong scores. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Weight	TokenNameIdentifier	 Weight
createNormalizedWeight	TokenNameIdentifier	 create Normalized Weight
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Weight	TokenNameIdentifier	 Weight
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
createNormalizedWeight	TokenNameIdentifier	 create Normalized Weight
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
UnmodifiableWeight	TokenNameIdentifier	 Unmodifiable Weight
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
