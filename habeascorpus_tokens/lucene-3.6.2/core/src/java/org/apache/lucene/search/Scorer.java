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
/** * Expert: Common scoring functionality for different types of queries. * * <p> * A <code>Scorer</code> iterates over documents matching a * query in increasing order of doc Id. * </p> * <p> * Document scores are computed using a given <code>Similarity</code> * implementation. * </p> * * <p><b>NOTE</b>: The values Float.Nan, * Float.NEGATIVE_INFINITY and Float.POSITIVE_INFINITY are * not valid scores. Certain collectors (eg {@link * TopScoreDocCollector}) will not properly collect hits * with these scores. */	TokenNameCOMMENT_JAVADOC	 Expert: Common scoring functionality for different types of queries. * <p> A <code>Scorer</code> iterates over documents matching a query in increasing order of doc Id. </p> <p> Document scores are computed using a given <code>Similarity</code> implementation. </p> * <p><b>NOTE</b>: The values Float.Nan, Float.NEGATIVE_INFINITY and Float.POSITIVE_INFINITY are not valid scores. Certain collectors (eg {@link TopScoreDocCollector}) will not properly collect hits with these scores. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Scorer	TokenNameIdentifier	 Scorer
extends	TokenNameextends	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
/** * Constructs a Scorer * @param weight The scorers <code>Weight</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs a Scorer @param weight The scorers <code>Weight</code>. 
protected	TokenNameprotected	
Scorer	TokenNameIdentifier	 Scorer
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Constructs a Scorer. * @param similarity The <code>Similarity</code> implementation used by this scorer. * @deprecated Use {@link #Scorer(Weight)} instead. */	TokenNameCOMMENT_JAVADOC	 Constructs a Scorer. @param similarity The <code>Similarity</code> implementation used by this scorer. @deprecated Use {@link #Scorer(Weight)} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
Scorer	TokenNameIdentifier	 Scorer
(	TokenNameLPAREN	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a Scorer * @param similarity The <code>Similarity</code> implementation used by this scorer. * @param weight The scorers <code>Weight</code> * @deprecated Use {@link #Scorer(Weight)} instead. */	TokenNameCOMMENT_JAVADOC	 Constructs a Scorer @param similarity The <code>Similarity</code> implementation used by this scorer. @param weight The scorers <code>Weight</code> @deprecated Use {@link #Scorer(Weight)} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
Scorer	TokenNameIdentifier	 Scorer
(	TokenNameLPAREN	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
similarity	TokenNameIdentifier	 similarity
=	TokenNameEQUAL	
similarity	TokenNameIdentifier	 similarity
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the Similarity implementation used by this scorer. * @deprecated Store any Similarity you might need privately in your implementation instead. */	TokenNameCOMMENT_JAVADOC	 Returns the Similarity implementation used by this scorer. @deprecated Store any Similarity you might need privately in your implementation instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
Similarity	TokenNameIdentifier	 Similarity
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
similarity	TokenNameIdentifier	 similarity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Scores and collects all matching documents. * @param collector The collector to which all matching documents are passed. */	TokenNameCOMMENT_JAVADOC	 Scores and collects all matching documents. @param collector The collector to which all matching documents are passed. 
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
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Expert: Collects matching documents in a range. Hook for optimization. * Note, <code>firstDocID</code> is added to ensure that {@link #nextDoc()} * was called before this method. * * <p><b>NOTE:</b> Because of backwards compatibility, this method is still * declared as <b>protected</b>, but it is intended to be <b>public</b>, * because it's called from other classes (like BooleanScorer). * If you subclass {@code Scorer}, you should declare the overridden method * as public to ease transition to Lucene 4.0, where it will be public.</p> * * @param collector * The collector to which all matching documents are passed. * @param max * Do not score documents past this. * @param firstDocID * The first document ID (ensures {@link #nextDoc()} is called before * this method. * @return true if more matching documents may remain. */	TokenNameCOMMENT_JAVADOC	 Expert: Collects matching documents in a range. Hook for optimization. Note, <code>firstDocID</code> is added to ensure that {@link #nextDoc()} was called before this method. * <p><b>NOTE:</b> Because of backwards compatibility, this method is still declared as <b>protected</b>, but it is intended to be <b>public</b>, because it's called from other classes (like BooleanScorer). If you subclass {@code Scorer}, you should declare the overridden method as public to ease transition to Lucene 4.0, where it will be public.</p> * @param collector The collector to which all matching documents are passed. @param max Do not score documents past this. @param firstDocID The first document ID (ensures {@link #nextDoc()} is called before this method. @return true if more matching documents may remain. 
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
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
firstDocID	TokenNameIdentifier	 first Doc ID
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
<	TokenNameLESS	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
!=	TokenNameNOT_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the score of the current document matching the query. * Initially invalid, until {@link #nextDoc()} or {@link #advance(int)} * is called the first time, or when called from within * {@link Collector#collect}. */	TokenNameCOMMENT_JAVADOC	 Returns the score of the current document matching the query. Initially invalid, until {@link #nextDoc()} or {@link #advance(int)} is called the first time, or when called from within {@link Collector#collect}. 
public	TokenNamepublic	
abstract	TokenNameabstract	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Returns number of matches for the current document. * This returns a float (not int) because * SloppyPhraseScorer discounts its freq according to how * "sloppy" the match was. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Returns number of matches for the current document. This returns a float (not int) because SloppyPhraseScorer discounts its freq according to how "sloppy" the match was. * @lucene.experimental 
public	TokenNamepublic	
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
this	TokenNamethis	
+	TokenNamePLUS	
" does not implement freq()"	TokenNameStringLiteral	 does not implement freq()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A callback to gather information from a scorer and its sub-scorers. Each * the top-level scorer as well as each of its sub-scorers are passed to * either one of the visit methods depending on their boolean relationship in * the query. * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A callback to gather information from a scorer and its sub-scorers. Each the top-level scorer as well as each of its sub-scorers are passed to either one of the visit methods depending on their boolean relationship in the query. @lucene.experimental 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
ScorerVisitor	TokenNameIdentifier	 Scorer Visitor
<	TokenNameLESS	
P	TokenNameIdentifier	 P
extends	TokenNameextends	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
C	TokenNameIdentifier	 C
extends	TokenNameextends	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
S	TokenNameIdentifier	 S
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** * Invoked for all optional scorer * * @param parent the parent query of the child query or <code>null</code> if the child is a top-level query * @param child the query of the currently visited scorer * @param scorer the current scorer */	TokenNameCOMMENT_JAVADOC	 Invoked for all optional scorer * @param parent the parent query of the child query or <code>null</code> if the child is a top-level query @param child the query of the currently visited scorer @param scorer the current scorer 
public	TokenNamepublic	
void	TokenNamevoid	
visitOptional	TokenNameIdentifier	 visit Optional
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
C	TokenNameIdentifier	 C
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
S	TokenNameIdentifier	 S
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked for all required scorer * * @param parent the parent query of the child query or <code>null</code> if the child is a top-level query * @param child the query of the currently visited scorer * @param scorer the current scorer */	TokenNameCOMMENT_JAVADOC	 Invoked for all required scorer * @param parent the parent query of the child query or <code>null</code> if the child is a top-level query @param child the query of the currently visited scorer @param scorer the current scorer 
public	TokenNamepublic	
void	TokenNamevoid	
visitRequired	TokenNameIdentifier	 visit Required
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
C	TokenNameIdentifier	 C
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
S	TokenNameIdentifier	 S
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked for all prohibited scorer * * @param parent the parent query of the child query or <code>null</code> if the child is a top-level query * @param child the query of the currently visited scorer * @param scorer the current scorer */	TokenNameCOMMENT_JAVADOC	 Invoked for all prohibited scorer * @param parent the parent query of the child query or <code>null</code> if the child is a top-level query @param child the query of the currently visited scorer @param scorer the current scorer 
public	TokenNamepublic	
void	TokenNamevoid	
visitProhibited	TokenNameIdentifier	 visit Prohibited
(	TokenNameLPAREN	
P	TokenNameIdentifier	 P
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
C	TokenNameIdentifier	 C
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
S	TokenNameIdentifier	 S
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Expert: call this to gather details for all sub-scorers for this query. * This can be used, in conjunction with a custom {@link Collector} to gather * details about how each sub-query matched the current hit. * * @param visitor a callback executed for each sub-scorer * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Expert: call this to gather details for all sub-scorers for this query. This can be used, in conjunction with a custom {@link Collector} to gather details about how each sub-query matched the current hit. * @param visitor a callback executed for each sub-scorer @lucene.experimental 
public	TokenNamepublic	
void	TokenNamevoid	
visitScorers	TokenNameIdentifier	 visit Scorers
(	TokenNameLPAREN	
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
visitSubScorers	TokenNameIdentifier	 visit Sub Scorers
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
/*must id default*/	TokenNameCOMMENT_BLOCK	must id default
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@link Scorer} subclasses should implement this method if the subclass * itself contains multiple scorers to support gathering details for * sub-scorers via {@link ScorerVisitor} * <p> * Note: this method will throw {@link UnsupportedOperationException} if no * associated {@link Weight} instance is provided to * {@link #Scorer(Weight)} * </p> * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 {@link Scorer} subclasses should implement this method if the subclass itself contains multiple scorers to support gathering details for sub-scorers via {@link ScorerVisitor} <p> Note: this method will throw {@link UnsupportedOperationException} if no associated {@link Weight} instance is provided to {@link #Scorer(Weight)} </p> * @lucene.experimental 
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
if	TokenNameif	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
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
switch	TokenNameswitch	
(	TokenNameLPAREN	
relationship	TokenNameIdentifier	 relationship
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
MUST	TokenNameIdentifier	 MUST
:	TokenNameCOLON	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitRequired	TokenNameIdentifier	 visit Required
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
:	TokenNameCOLON	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitProhibited	TokenNameIdentifier	 visit Prohibited
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SHOULD	TokenNameIdentifier	 SHOULD
:	TokenNameCOLON	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitOptional	TokenNameIdentifier	 visit Optional
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
