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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
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
ToStringUtils	TokenNameIdentifier	 To String Utils
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** A Query that matches documents matching boolean combinations of other * queries, e.g. {@link TermQuery}s, {@link PhraseQuery}s or other * BooleanQuerys. */	TokenNameCOMMENT_JAVADOC	 A Query that matches documents matching boolean combinations of other queries, e.g. {@link TermQuery}s, {@link PhraseQuery}s or other BooleanQuerys. 
public	TokenNamepublic	
class	TokenNameclass	
BooleanQuery	TokenNameIdentifier	 Boolean Query
extends	TokenNameextends	
Query	TokenNameIdentifier	 Query
implements	TokenNameimplements	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
BooleanClause	TokenNameIdentifier	 Boolean Clause
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
maxClauseCount	TokenNameIdentifier	 max Clause Count
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Thrown when an attempt is made to add more than {@link * #getMaxClauseCount()} clauses. This typically happens if * a PrefixQuery, FuzzyQuery, WildcardQuery, or TermRangeQuery * is expanded to many terms during search. */	TokenNameCOMMENT_JAVADOC	 Thrown when an attempt is made to add more than {@link #getMaxClauseCount()} clauses. This typically happens if a PrefixQuery, FuzzyQuery, WildcardQuery, or TermRangeQuery is expanded to many terms during search. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
TooManyClauses	TokenNameIdentifier	 Too Many Clauses
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
public	TokenNamepublic	
TooManyClauses	TokenNameIdentifier	 Too Many Clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"maxClauseCount is set to "	TokenNameStringLiteral	maxClauseCount is set to 
+	TokenNamePLUS	
maxClauseCount	TokenNameIdentifier	 max Clause Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Return the maximum number of clauses permitted, 1024 by default. * Attempts to add more than the permitted number of clauses cause {@link * TooManyClauses} to be thrown. * @see #setMaxClauseCount(int) */	TokenNameCOMMENT_JAVADOC	 Return the maximum number of clauses permitted, 1024 by default. Attempts to add more than the permitted number of clauses cause {@link TooManyClauses} to be thrown. @see #setMaxClauseCount(int) 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getMaxClauseCount	TokenNameIdentifier	 get Max Clause Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxClauseCount	TokenNameIdentifier	 max Clause Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the maximum number of clauses permitted per BooleanQuery. * Default value is 1024. */	TokenNameCOMMENT_JAVADOC	 Set the maximum number of clauses permitted per BooleanQuery. Default value is 1024. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setMaxClauseCount	TokenNameIdentifier	 set Max Clause Count
(	TokenNameLPAREN	
int	TokenNameint	
maxClauseCount	TokenNameIdentifier	 max Clause Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxClauseCount	TokenNameIdentifier	 max Clause Count
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"maxClauseCount must be >= 1"	TokenNameStringLiteral	maxClauseCount must be >= 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
.	TokenNameDOT	
maxClauseCount	TokenNameIdentifier	 max Clause Count
=	TokenNameEQUAL	
maxClauseCount	TokenNameIdentifier	 max Clause Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
BooleanClause	TokenNameIdentifier	 Boolean Clause
>	TokenNameGREATER	
clauses	TokenNameIdentifier	 clauses
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
BooleanClause	TokenNameIdentifier	 Boolean Clause
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
disableCoord	TokenNameIdentifier	 disable Coord
;	TokenNameSEMICOLON	
/** Constructs an empty boolean query. */	TokenNameCOMMENT_JAVADOC	 Constructs an empty boolean query. 
public	TokenNamepublic	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
disableCoord	TokenNameIdentifier	 disable Coord
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Constructs an empty boolean query. * * {@link Similarity#coord(int,int)} may be disabled in scoring, as * appropriate. For example, this score factor does not make sense for most * automatically generated queries, like {@link WildcardQuery} and {@link * FuzzyQuery}. * * @param disableCoord disables {@link Similarity#coord(int,int)} in scoring. */	TokenNameCOMMENT_JAVADOC	 Constructs an empty boolean query. * {@link Similarity#coord(int,int)} may be disabled in scoring, as appropriate. For example, this score factor does not make sense for most automatically generated queries, like {@link WildcardQuery} and {@link FuzzyQuery}. * @param disableCoord disables {@link Similarity#coord(int,int)} in scoring. 
public	TokenNamepublic	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
boolean	TokenNameboolean	
disableCoord	TokenNameIdentifier	 disable Coord
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
disableCoord	TokenNameIdentifier	 disable Coord
=	TokenNameEQUAL	
disableCoord	TokenNameIdentifier	 disable Coord
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true iff {@link Similarity#coord(int,int)} is disabled in * scoring for this query instance. * @see #BooleanQuery(boolean) */	TokenNameCOMMENT_JAVADOC	 Returns true iff {@link Similarity#coord(int,int)} is disabled in scoring for this query instance. @see #BooleanQuery(boolean) 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCoordDisabled	TokenNameIdentifier	 is Coord Disabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
disableCoord	TokenNameIdentifier	 disable Coord
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specifies a minimum number of the optional BooleanClauses * which must be satisfied. * * <p> * By default no optional clauses are necessary for a match * (unless there are no required clauses). If this method is used, * then the specified number of clauses is required. * </p> * <p> * Use of this method is totally independent of specifying that * any specific clauses are required (or prohibited). This number will * only be compared against the number of matching optional clauses. * </p> * * @param min the number of optional clauses that must match */	TokenNameCOMMENT_JAVADOC	 Specifies a minimum number of the optional BooleanClauses which must be satisfied. * <p> By default no optional clauses are necessary for a match (unless there are no required clauses). If this method is used, then the specified number of clauses is required. </p> <p> Use of this method is totally independent of specifying that any specific clauses are required (or prohibited). This number will only be compared against the number of matching optional clauses. </p> * @param min the number of optional clauses that must match 
public	TokenNamepublic	
void	TokenNamevoid	
setMinimumNumberShouldMatch	TokenNameIdentifier	 set Minimum Number Should Match
(	TokenNameLPAREN	
int	TokenNameint	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
int	TokenNameint	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Gets the minimum number of the optional BooleanClauses * which must be satisfied. */	TokenNameCOMMENT_JAVADOC	 Gets the minimum number of the optional BooleanClauses which must be satisfied. 
public	TokenNamepublic	
int	TokenNameint	
getMinimumNumberShouldMatch	TokenNameIdentifier	 get Minimum Number Should Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Adds a clause to a boolean query. * * @throws TooManyClauses if the new number of clauses exceeds the maximum clause number * @see #getMaxClauseCount() */	TokenNameCOMMENT_JAVADOC	 Adds a clause to a boolean query. * @throws TooManyClauses if the new number of clauses exceeds the maximum clause number @see #getMaxClauseCount() 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
occur	TokenNameIdentifier	 occur
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
BooleanClause	TokenNameIdentifier	 Boolean Clause
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
occur	TokenNameIdentifier	 occur
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Adds a clause to a boolean query. * @throws TooManyClauses if the new number of clauses exceeds the maximum clause number * @see #getMaxClauseCount() */	TokenNameCOMMENT_JAVADOC	 Adds a clause to a boolean query. @throws TooManyClauses if the new number of clauses exceeds the maximum clause number @see #getMaxClauseCount() 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
BooleanClause	TokenNameIdentifier	 Boolean Clause
clause	TokenNameIdentifier	 clause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
maxClauseCount	TokenNameIdentifier	 max Clause Count
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
TooManyClauses	TokenNameIdentifier	 Too Many Clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the set of clauses in this query. */	TokenNameCOMMENT_JAVADOC	 Returns the set of clauses in this query. 
public	TokenNamepublic	
BooleanClause	TokenNameIdentifier	 Boolean Clause
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getClauses	TokenNameIdentifier	 get Clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
BooleanClause	TokenNameIdentifier	 Boolean Clause
[	TokenNameLBRACKET	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the list of clauses in this query. */	TokenNameCOMMENT_JAVADOC	 Returns the list of clauses in this query. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
BooleanClause	TokenNameIdentifier	 Boolean Clause
>	TokenNameGREATER	
clauses	TokenNameIdentifier	 clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clauses	TokenNameIdentifier	 clauses
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns an iterator on the clauses in this query. It implements the {@link Iterable} interface to * make it possible to do: * <pre>for (BooleanClause clause : booleanQuery) {}</pre> */	TokenNameCOMMENT_JAVADOC	 Returns an iterator on the clauses in this query. It implements the {@link Iterable} interface to make it possible to do: <pre>for (BooleanClause clause : booleanQuery) {}</pre> 
public	TokenNamepublic	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
BooleanClause	TokenNameIdentifier	 Boolean Clause
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clauses	TokenNameIdentifier	 clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: the Weight for BooleanQuery, used to * normalize, score and explain these queries. * * <p>NOTE: this API and implementation is subject to * change suddenly in the next release.</p> */	TokenNameCOMMENT_JAVADOC	 Expert: the Weight for BooleanQuery, used to normalize, score and explain these queries. * <p>NOTE: this API and implementation is subject to change suddenly in the next release.</p> 
protected	TokenNameprotected	
class	TokenNameclass	
BooleanWeight	TokenNameIdentifier	 Boolean Weight
extends	TokenNameextends	
Weight	TokenNameIdentifier	 Weight
{	TokenNameLBRACE	
/** The Similarity implementation. */	TokenNameCOMMENT_JAVADOC	 The Similarity implementation. 
protected	TokenNameprotected	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Weight	TokenNameIdentifier	 Weight
>	TokenNameGREATER	
weights	TokenNameIdentifier	 weights
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
maxCoord	TokenNameIdentifier	 max Coord
;	TokenNameSEMICOLON	
// num optional + num required 	TokenNameCOMMENT_LINE	num optional + num required 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
disableCoord	TokenNameIdentifier	 disable Coord
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BooleanWeight	TokenNameIdentifier	 Boolean Weight
(	TokenNameLPAREN	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
boolean	TokenNameboolean	
disableCoord	TokenNameIdentifier	 disable Coord
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
similarity	TokenNameIdentifier	 similarity
=	TokenNameEQUAL	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
disableCoord	TokenNameIdentifier	 disable Coord
=	TokenNameEQUAL	
disableCoord	TokenNameIdentifier	 disable Coord
;	TokenNameSEMICOLON	
weights	TokenNameIdentifier	 weights
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Weight	TokenNameIdentifier	 Weight
>	TokenNameGREATER	
(	TokenNameLPAREN	
clauses	TokenNameIdentifier	 clauses
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
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BooleanClause	TokenNameIdentifier	 Boolean Clause
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
weights	TokenNameIdentifier	 weights
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createWeight	TokenNameIdentifier	 create Weight
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
isProhibited	TokenNameIdentifier	 is Prohibited
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
maxCoord	TokenNameIdentifier	 max Coord
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
BooleanQuery	TokenNameIdentifier	 Boolean Query
.	TokenNameDOT	
this	TokenNamethis	
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
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
float	TokenNamefloat	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
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
weights	TokenNameIdentifier	 weights
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// call sumOfSquaredWeights for all clauses in case of side effects 	TokenNameCOMMENT_LINE	call sumOfSquaredWeights for all clauses in case of side effects 
float	TokenNamefloat	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
weights	TokenNameIdentifier	 weights
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
sumOfSquaredWeights	TokenNameIdentifier	 sum Of Squared Weights
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// sum sub weights 	TokenNameCOMMENT_LINE	sum sub weights 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
isProhibited	TokenNameIdentifier	 is Prohibited
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// only add to sum for non-prohibited clauses 	TokenNameCOMMENT_LINE	only add to sum for non-prohibited clauses 
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sum	TokenNameIdentifier	 sum
*=	TokenNameMULTIPLY_EQUAL	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// boost each sub-weight 	TokenNameCOMMENT_LINE	boost each sub-weight 
return	TokenNamereturn	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
coord	TokenNameIdentifier	 coord
(	TokenNameLPAREN	
int	TokenNameint	
overlap	TokenNameIdentifier	 overlap
,	TokenNameCOMMA	
int	TokenNameint	
maxOverlap	TokenNameIdentifier	 max Overlap
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// LUCENE-4300: in most cases of maxOverlap=1, BQ rewrites itself away, 	TokenNameCOMMENT_LINE	LUCENE-4300: in most cases of maxOverlap=1, BQ rewrites itself away, 
// so coord() is not applied. But when BQ cannot optimize itself away 	TokenNameCOMMENT_LINE	so coord() is not applied. But when BQ cannot optimize itself away 
// for a single clause (minNrShouldMatch, prohibited clauses, etc), its 	TokenNameCOMMENT_LINE	for a single clause (minNrShouldMatch, prohibited clauses, etc), its 
// important not to apply coord(1,1) for consistency, it might not be 1.0F 	TokenNameCOMMENT_LINE	important not to apply coord(1,1) for consistency, it might not be 1.0F 
return	TokenNamereturn	
maxOverlap	TokenNameIdentifier	 max Overlap
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
1F	TokenNameFloatingPointLiteral	
:	TokenNameCOLON	
similarity	TokenNameIdentifier	 similarity
.	TokenNameDOT	
coord	TokenNameIdentifier	 coord
(	TokenNameLPAREN	
overlap	TokenNameIdentifier	 overlap
,	TokenNameCOMMA	
maxOverlap	TokenNameIdentifier	 max Overlap
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
norm	TokenNameIdentifier	 norm
*=	TokenNameMULTIPLY_EQUAL	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// incorporate boost 	TokenNameCOMMENT_LINE	incorporate boost 
for	TokenNamefor	
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
w	TokenNameIdentifier	 w
:	TokenNameCOLON	
weights	TokenNameIdentifier	 weights
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// normalize all clauses, (even if prohibited in case of side affects) 	TokenNameCOMMENT_LINE	normalize all clauses, (even if prohibited in case of side affects) 
w	TokenNameIdentifier	 w
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
norm	TokenNameIdentifier	 norm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
final	TokenNamefinal	
int	TokenNameint	
minShouldMatch	TokenNameIdentifier	 min Should Match
=	TokenNameEQUAL	
BooleanQuery	TokenNameIdentifier	 Boolean Query
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
getMinimumNumberShouldMatch	TokenNameIdentifier	 get Minimum Number Should Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ComplexExplanation	TokenNameIdentifier	 Complex Explanation
sumExpl	TokenNameIdentifier	 sum Expl
=	TokenNameEQUAL	
new	TokenNamenew	
ComplexExplanation	TokenNameIdentifier	 Complex Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumExpl	TokenNameIdentifier	 sum Expl
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
"sum of:"	TokenNameStringLiteral	sum of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
coord	TokenNameIdentifier	 coord
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
shouldMatchCount	TokenNameIdentifier	 should Match Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
BooleanClause	TokenNameIdentifier	 Boolean Clause
>	TokenNameGREATER	
cIter	TokenNameIdentifier	 c Iter
=	TokenNameEQUAL	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Weight	TokenNameIdentifier	 Weight
>	TokenNameGREATER	
wIter	TokenNameIdentifier	 w Iter
=	TokenNameEQUAL	
weights	TokenNameIdentifier	 weights
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wIter	TokenNameIdentifier	 w Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Weight	TokenNameIdentifier	 Weight
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
wIter	TokenNameIdentifier	 w Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanClause	TokenNameIdentifier	 Boolean Clause
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
cIter	TokenNameIdentifier	 c Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
isRequired	TokenNameIdentifier	 is Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
"no match on required clause ("	TokenNameStringLiteral	no match on required clause (
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumExpl	TokenNameIdentifier	 sum Expl
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Explanation	TokenNameIdentifier	 Explanation
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
isMatch	TokenNameIdentifier	 is Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
isProhibited	TokenNameIdentifier	 is Prohibited
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sumExpl	TokenNameIdentifier	 sum Expl
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
coord	TokenNameIdentifier	 coord
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Explanation	TokenNameIdentifier	 Explanation
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
"match on prohibited clause ("	TokenNameStringLiteral	match on prohibited clause (
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumExpl	TokenNameIdentifier	 sum Expl
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getOccur	TokenNameIdentifier	 get Occur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
shouldMatchCount	TokenNameIdentifier	 should Match Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
isRequired	TokenNameIdentifier	 is Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Explanation	TokenNameIdentifier	 Explanation
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
"no match on required clause ("	TokenNameStringLiteral	no match on required clause (
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumExpl	TokenNameIdentifier	 sum Expl
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fail	TokenNameIdentifier	 fail
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sumExpl	TokenNameIdentifier	 sum Expl
.	TokenNameDOT	
setMatch	TokenNameIdentifier	 set Match
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumExpl	TokenNameIdentifier	 sum Expl
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumExpl	TokenNameIdentifier	 sum Expl
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
"Failure to meet condition(s) of required/prohibited clause(s)"	TokenNameStringLiteral	Failure to meet condition(s) of required/prohibited clause(s)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sumExpl	TokenNameIdentifier	 sum Expl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
shouldMatchCount	TokenNameIdentifier	 should Match Count
<	TokenNameLESS	
minShouldMatch	TokenNameIdentifier	 min Should Match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sumExpl	TokenNameIdentifier	 sum Expl
.	TokenNameDOT	
setMatch	TokenNameIdentifier	 set Match
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumExpl	TokenNameIdentifier	 sum Expl
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumExpl	TokenNameIdentifier	 sum Expl
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
"Failure to match minimum number "	TokenNameStringLiteral	Failure to match minimum number 
+	TokenNamePLUS	
"of optional clauses: "	TokenNameStringLiteral	of optional clauses: 
+	TokenNamePLUS	
minShouldMatch	TokenNameIdentifier	 min Should Match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sumExpl	TokenNameIdentifier	 sum Expl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sumExpl	TokenNameIdentifier	 sum Expl
.	TokenNameDOT	
setMatch	TokenNameIdentifier	 set Match
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<	TokenNameLESS	
coord	TokenNameIdentifier	 coord
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumExpl	TokenNameIdentifier	 sum Expl
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
sum	TokenNameIdentifier	 sum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
coordFactor	TokenNameIdentifier	 coord Factor
=	TokenNameEQUAL	
disableCoord	TokenNameIdentifier	 disable Coord
?	TokenNameQUESTION	
1.0f	TokenNameFloatingPointLiteral	
:	TokenNameCOLON	
coord	TokenNameIdentifier	 coord
(	TokenNameLPAREN	
coord	TokenNameIdentifier	 coord
,	TokenNameCOMMA	
maxCoord	TokenNameIdentifier	 max Coord
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
coordFactor	TokenNameIdentifier	 coord Factor
==	TokenNameEQUAL_EQUAL	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sumExpl	TokenNameIdentifier	 sum Expl
;	TokenNameSEMICOLON	
// eliminate wrapper 	TokenNameCOMMENT_LINE	eliminate wrapper 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ComplexExplanation	TokenNameIdentifier	 Complex Explanation
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ComplexExplanation	TokenNameIdentifier	 Complex Explanation
(	TokenNameLPAREN	
sumExpl	TokenNameIdentifier	 sum Expl
.	TokenNameDOT	
isMatch	TokenNameIdentifier	 is Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sum	TokenNameIdentifier	 sum
*	TokenNameMULTIPLY	
coordFactor	TokenNameIdentifier	 coord Factor
,	TokenNameCOMMA	
"product of:"	TokenNameStringLiteral	product of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
sumExpl	TokenNameIdentifier	 sum Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
coordFactor	TokenNameIdentifier	 coord Factor
,	TokenNameCOMMA	
"coord("	TokenNameStringLiteral	coord(
+	TokenNamePLUS	
coord	TokenNameIdentifier	 coord
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
maxCoord	TokenNameIdentifier	 max Coord
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
required	TokenNameIdentifier	 required
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
prohibited	TokenNameIdentifier	 prohibited
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
optional	TokenNameIdentifier	 optional
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
BooleanClause	TokenNameIdentifier	 Boolean Clause
>	TokenNameGREATER	
cIter	TokenNameIdentifier	 c Iter
=	TokenNameEQUAL	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
w	TokenNameIdentifier	 w
:	TokenNameCOLON	
weights	TokenNameIdentifier	 weights
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BooleanClause	TokenNameIdentifier	 Boolean Clause
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
cIter	TokenNameIdentifier	 c Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Scorer	TokenNameIdentifier	 Scorer
subScorer	TokenNameIdentifier	 sub Scorer
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subScorer	TokenNameIdentifier	 sub Scorer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
isRequired	TokenNameIdentifier	 is Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
isRequired	TokenNameIdentifier	 is Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
required	TokenNameIdentifier	 required
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
subScorer	TokenNameIdentifier	 sub Scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
isProhibited	TokenNameIdentifier	 is Prohibited
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prohibited	TokenNameIdentifier	 prohibited
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
subScorer	TokenNameIdentifier	 sub Scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
subScorer	TokenNameIdentifier	 sub Scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Check if we can return a BooleanScorer 	TokenNameCOMMENT_LINE	Check if we can return a BooleanScorer 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
scoreDocsInOrder	TokenNameIdentifier	 score Docs In Order
&&	TokenNameAND_AND	
topScorer	TokenNameIdentifier	 top Scorer
&&	TokenNameAND_AND	
required	TokenNameIdentifier	 required
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BooleanScorer	TokenNameIdentifier	 Boolean Scorer
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
disableCoord	TokenNameIdentifier	 disable Coord
,	TokenNameCOMMA	
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
,	TokenNameCOMMA	
optional	TokenNameIdentifier	 optional
,	TokenNameCOMMA	
prohibited	TokenNameIdentifier	 prohibited
,	TokenNameCOMMA	
maxCoord	TokenNameIdentifier	 max Coord
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
required	TokenNameIdentifier	 required
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no required and optional clauses. 	TokenNameCOMMENT_LINE	no required and optional clauses. 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// either >1 req scorer, or there are 0 req scorers and at least 1 	TokenNameCOMMENT_LINE	either >1 req scorer, or there are 0 req scorers and at least 1 
// optional scorer. Therefore if there are not enough optional scorers 	TokenNameCOMMENT_LINE	optional scorer. Therefore if there are not enough optional scorers 
// no documents will be matched by the query 	TokenNameCOMMENT_LINE	no documents will be matched by the query 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Return a BooleanScorer2 	TokenNameCOMMENT_LINE	Return a BooleanScorer2 
return	TokenNamereturn	
new	TokenNamenew	
BooleanScorer2	TokenNameIdentifier	 Boolean Scorer2
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
disableCoord	TokenNameIdentifier	 disable Coord
,	TokenNameCOMMA	
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
,	TokenNameCOMMA	
required	TokenNameIdentifier	 required
,	TokenNameCOMMA	
prohibited	TokenNameIdentifier	 prohibited
,	TokenNameCOMMA	
optional	TokenNameIdentifier	 optional
,	TokenNameCOMMA	
maxCoord	TokenNameIdentifier	 max Coord
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
for	TokenNamefor	
(	TokenNameLPAREN	
BooleanClause	TokenNameIdentifier	 Boolean Clause
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
clauses	TokenNameIdentifier	 clauses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
isRequired	TokenNameIdentifier	 is Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// BS2 (in-order) will be used by scorer() 	TokenNameCOMMENT_LINE	BS2 (in-order) will be used by scorer() 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// scorer() will return an out-of-order scorer if requested. 	TokenNameCOMMENT_LINE	scorer() will return an out-of-order scorer if requested. 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Weight	TokenNameIdentifier	 Weight
createWeight	TokenNameIdentifier	 create Weight
(	TokenNameLPAREN	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BooleanWeight	TokenNameIdentifier	 Boolean Weight
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
disableCoord	TokenNameIdentifier	 disable Coord
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minNrShouldMatch	TokenNameIdentifier	 min Nr Should Match
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// optimize 1-clause queries 	TokenNameCOMMENT_LINE	optimize 1-clause queries 
BooleanClause	TokenNameIdentifier	 Boolean Clause
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
isProhibited	TokenNameIdentifier	 is Prohibited
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// just return clause 	TokenNameCOMMENT_LINE	just return clause 
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// rewrite first 	TokenNameCOMMENT_LINE	rewrite first 
if	TokenNameif	
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// incorporate boost 	TokenNameCOMMENT_LINE	incorporate boost 
if	TokenNameif	
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// if rewrite was no-op 	TokenNameCOMMENT_LINE	if rewrite was no-op 
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
)	TokenNameRPAREN	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// then clone before boost 	TokenNameCOMMENT_LINE	then clone before boost 
query	TokenNameIdentifier	 query
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// recursively rewrite 	TokenNameCOMMENT_LINE	recursively rewrite 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BooleanClause	TokenNameIdentifier	 Boolean Clause
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
!=	TokenNameNOT_EQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// clause rewrote: must clone 	TokenNameCOMMENT_LINE	clause rewrote: must clone 
if	TokenNameif	
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
new	TokenNamenew	
BooleanClause	TokenNameIdentifier	 Boolean Clause
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getOccur	TokenNameIdentifier	 get Occur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
// some clauses rewrote 	TokenNameCOMMENT_LINE	some clauses rewrote 
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
// no clauses rewrote 	TokenNameCOMMENT_LINE	no clauses rewrote 
}	TokenNameRBRACE	
// inherit javadoc 	TokenNameCOMMENT_LINE	inherit javadoc 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
extractTerms	TokenNameIdentifier	 extract Terms
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
BooleanClause	TokenNameIdentifier	 Boolean Clause
clause	TokenNameIdentifier	 clause
:	TokenNameCOLON	
clauses	TokenNameIdentifier	 clauses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
extractTerms	TokenNameIdentifier	 extract Terms
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
BooleanClause	TokenNameIdentifier	 Boolean Clause
>	TokenNameGREATER	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Prints a user-readable version of this query. */	TokenNameCOMMENT_JAVADOC	 Prints a user-readable version of this query. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
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
boolean	TokenNameboolean	
needParens	TokenNameIdentifier	 need Parens
=	TokenNameEQUAL	
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
getMinimumNumberShouldMatch	TokenNameIdentifier	 get Minimum Number Should Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
needParens	TokenNameIdentifier	 need Parens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"("	TokenNameStringLiteral	(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BooleanClause	TokenNameIdentifier	 Boolean Clause
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
isProhibited	TokenNameIdentifier	 is Prohibited
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
isRequired	TokenNameIdentifier	 is Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"+"	TokenNameStringLiteral	+
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
subQuery	TokenNameIdentifier	 sub Query
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subQuery	TokenNameIdentifier	 sub Query
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subQuery	TokenNameIdentifier	 sub Query
instanceof	TokenNameinstanceof	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// wrap sub-bools in parens 	TokenNameCOMMENT_LINE	wrap sub-bools in parens 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"("	TokenNameStringLiteral	(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
subQuery	TokenNameIdentifier	 sub Query
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
subQuery	TokenNameIdentifier	 sub Query
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"null"	TokenNameStringLiteral	null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needParens	TokenNameIdentifier	 need Parens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getMinimumNumberShouldMatch	TokenNameIdentifier	 get Minimum Number Should Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'~'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getMinimumNumberShouldMatch	TokenNameIdentifier	 get Minimum Number Should Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ToStringUtils	TokenNameIdentifier	 To String Utils
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true iff <code>o</code> is equal to this. */	TokenNameCOMMENT_JAVADOC	 Returns true iff <code>o</code> is equal to this. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
getMinimumNumberShouldMatch	TokenNameIdentifier	 get Minimum Number Should Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getMinimumNumberShouldMatch	TokenNameIdentifier	 get Minimum Number Should Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
disableCoord	TokenNameIdentifier	 disable Coord
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
disableCoord	TokenNameIdentifier	 disable Coord
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a hash code value for this object.*/	TokenNameCOMMENT_JAVADOC	 Returns a hash code value for this object.
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
getMinimumNumberShouldMatch	TokenNameIdentifier	 get Minimum Number Should Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
disableCoord	TokenNameIdentifier	 disable Coord
?	TokenNameQUESTION	
17	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
