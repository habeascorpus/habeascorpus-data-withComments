package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
function	TokenNameIdentifier	 function
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
TermDocs	TokenNameIdentifier	 Term Docs
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
ToStringUtils	TokenNameIdentifier	 To String Utils
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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * Expert: A Query that sets the scores of document to the * values obtained from a {@link org.apache.lucene.search.function.ValueSource ValueSource}. * <p> * This query provides a score for <em>each and every</em> undeleted document in the index. * <p> * The value source can be based on a (cached) value of an indexed field, but it * can also be based on an external source, e.g. values read from an external database. * <p> * Score is set as: Score(doc,query) = query.getBoost()<sup>2</sup> * valueSource(doc). * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Expert: A Query that sets the scores of document to the values obtained from a {@link org.apache.lucene.search.function.ValueSource ValueSource}. <p> This query provides a score for <em>each and every</em> undeleted document in the index. <p> The value source can be based on a (cached) value of an indexed field, but it can also be based on an external source, e.g. values read from an external database. <p> Score is set as: Score(doc,query) = query.getBoost()<sup>2</sup> valueSource(doc). * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
extends	TokenNameextends	
Query	TokenNameIdentifier	 Query
{	TokenNameLBRACE	
ValueSource	TokenNameIdentifier	 Value Source
valSrc	TokenNameIdentifier	 val Src
;	TokenNameSEMICOLON	
/** * Create a value source query * @param valSrc provides the values defines the function to be used for scoring */	TokenNameCOMMENT_JAVADOC	 Create a value source query @param valSrc provides the values defines the function to be used for scoring 
public	TokenNamepublic	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
(	TokenNameLPAREN	
ValueSource	TokenNameIdentifier	 Value Source
valSrc	TokenNameIdentifier	 val Src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
valSrc	TokenNameIdentifier	 val Src
=	TokenNameEQUAL	
valSrc	TokenNameIdentifier	 val Src
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.Query#rewrite(org.apache.lucene.index.IndexReader) */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.Query#rewrite(org.apache.lucene.index.IndexReader) 
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
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.Query#extractTerms(java.util.Set) */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.Query#extractTerms(java.util.Set) 
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
// no terms involved here 	TokenNameCOMMENT_LINE	no terms involved here 
}	TokenNameRBRACE	
class	TokenNameclass	
ValueSourceWeight	TokenNameIdentifier	 Value Source Weight
extends	TokenNameextends	
Weight	TokenNameIdentifier	 Weight
{	TokenNameLBRACE	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
;	TokenNameSEMICOLON	
float	TokenNamefloat	
queryNorm	TokenNameIdentifier	 query Norm
;	TokenNameSEMICOLON	
float	TokenNamefloat	
queryWeight	TokenNameIdentifier	 query Weight
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ValueSourceWeight	TokenNameIdentifier	 Value Source Weight
(	TokenNameLPAREN	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.Weight#getQuery() */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.Weight#getQuery() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
.	TokenNameDOT	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.Weight#getValue() */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.Weight#getValue() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
queryWeight	TokenNameIdentifier	 query Weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.Weight#sumOfSquaredWeights() */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.Weight#sumOfSquaredWeights() 
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
queryWeight	TokenNameIdentifier	 query Weight
=	TokenNameEQUAL	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
queryWeight	TokenNameIdentifier	 query Weight
*	TokenNameMULTIPLY	
queryWeight	TokenNameIdentifier	 query Weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.Weight#normalize(float) */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.Weight#normalize(float) 
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
this	TokenNamethis	
.	TokenNameDOT	
queryNorm	TokenNameIdentifier	 query Norm
=	TokenNameEQUAL	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
queryWeight	TokenNameIdentifier	 query Weight
*=	TokenNameMULTIPLY_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
queryNorm	TokenNameIdentifier	 query Norm
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
return	TokenNamereturn	
new	TokenNamenew	
ValueSourceScorer	TokenNameIdentifier	 Value Source Scorer
(	TokenNameLPAREN	
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.Weight#explain(org.apache.lucene.index.IndexReader, int) */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.Weight#explain(org.apache.lucene.index.IndexReader, int) 
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
DocValues	TokenNameIdentifier	 Doc Values
vals	TokenNameIdentifier	 vals
=	TokenNameEQUAL	
valSrc	TokenNameIdentifier	 val Src
.	TokenNameDOT	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
sc	TokenNameIdentifier	 sc
=	TokenNameEQUAL	
queryWeight	TokenNameIdentifier	 query Weight
*	TokenNameMULTIPLY	
vals	TokenNameIdentifier	 vals
.	TokenNameDOT	
floatVal	TokenNameIdentifier	 float Val
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ComplexExplanation	TokenNameIdentifier	 Complex Explanation
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
sc	TokenNameIdentifier	 sc
,	TokenNameCOMMA	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", product of:"	TokenNameStringLiteral	, product of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"boost"	TokenNameStringLiteral	boost
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
queryNorm	TokenNameIdentifier	 query Norm
,	TokenNameCOMMA	
"queryNorm"	TokenNameStringLiteral	queryNorm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A scorer that (simply) matches all documents, and scores each document with * the value of the value source in effect. As an example, if the value source * is a (cached) field source, then value of that field in that document will * be used. (assuming field is indexed for this doc, with a single token.) */	TokenNameCOMMENT_JAVADOC	 A scorer that (simply) matches all documents, and scores each document with the value of the value source in effect. As an example, if the value source is a (cached) field source, then value of that field in that document will be used. (assuming field is indexed for this doc, with a single token.) 
private	TokenNameprivate	
class	TokenNameclass	
ValueSourceScorer	TokenNameIdentifier	 Value Source Scorer
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
float	TokenNamefloat	
qWeight	TokenNameIdentifier	 q Weight
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
DocValues	TokenNameIdentifier	 Doc Values
vals	TokenNameIdentifier	 vals
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
TermDocs	TokenNameIdentifier	 Term Docs
termDocs	TokenNameIdentifier	 term Docs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// constructor 	TokenNameCOMMENT_LINE	constructor 
private	TokenNameprivate	
ValueSourceScorer	TokenNameIdentifier	 Value Source Scorer
(	TokenNameLPAREN	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
ValueSourceWeight	TokenNameIdentifier	 Value Source Weight
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qWeight	TokenNameIdentifier	 q Weight
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this is when/where the values are first created. 	TokenNameCOMMENT_LINE	this is when/where the values are first created. 
vals	TokenNameIdentifier	 vals
=	TokenNameEQUAL	
valSrc	TokenNameIdentifier	 val Src
.	TokenNameDOT	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termDocs	TokenNameIdentifier	 term Docs
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
null	TokenNamenull	
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
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
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
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
?	TokenNameQUESTION	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.Scorer#score() */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.Scorer#score() 
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
qWeight	TokenNameIdentifier	 q Weight
*	TokenNameMULTIPLY	
vals	TokenNameIdentifier	 vals
.	TokenNameDOT	
floatVal	TokenNameIdentifier	 float Val
(	TokenNameLPAREN	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
.	TokenNameDOT	
ValueSourceWeight	TokenNameIdentifier	 Value Source Weight
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
return	TokenNamereturn	
valSrc	TokenNameIdentifier	 val Src
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ToStringUtils	TokenNameIdentifier	 To String Utils
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true if <code>o</code> is equal to this. */	TokenNameCOMMENT_JAVADOC	 Returns true if <code>o</code> is equal to this. 
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
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
super	TokenNamesuper	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
valSrc	TokenNameIdentifier	 val Src
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
valSrc	TokenNameIdentifier	 val Src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a hash code value for this object. */	TokenNameCOMMENT_JAVADOC	 Returns a hash code value for this object. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
valSrc	TokenNameIdentifier	 val Src
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
