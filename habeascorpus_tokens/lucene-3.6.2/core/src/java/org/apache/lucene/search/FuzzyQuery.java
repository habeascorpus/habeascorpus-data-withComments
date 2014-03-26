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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Implements the fuzzy search query. The similarity measurement * is based on the Levenshtein (edit distance) algorithm. * * <p><em>Warning:</em> this query is not very scalable with its default prefix * length of 0 - in this case, *every* term will be enumerated and * cause an edit score calculation. * * <p>This query uses {@link MultiTermQuery.TopTermsScoringBooleanQueryRewrite} * as default. So terms will be collected and scored according to their * edit distance. Only the top terms are used for building the {@link BooleanQuery}. * It is not recommended to change the rewrite mode for fuzzy queries. */	TokenNameCOMMENT_JAVADOC	 Implements the fuzzy search query. The similarity measurement is based on the Levenshtein (edit distance) algorithm. * <p><em>Warning:</em> this query is not very scalable with its default prefix length of 0 - in this case, *every* term will be enumerated and cause an edit score calculation. * <p>This query uses {@link MultiTermQuery.TopTermsScoringBooleanQueryRewrite} as default. So terms will be collected and scored according to their edit distance. Only the top terms are used for building the {@link BooleanQuery}. It is not recommended to change the rewrite mode for fuzzy queries. 
public	TokenNamepublic	
class	TokenNameclass	
FuzzyQuery	TokenNameIdentifier	 Fuzzy Query
extends	TokenNameextends	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
float	TokenNamefloat	
defaultMinSimilarity	TokenNameIdentifier	 default Min Similarity
=	TokenNameEQUAL	
0.5f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
defaultPrefixLength	TokenNameIdentifier	 default Prefix Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
defaultMaxExpansions	TokenNameIdentifier	 default Max Expansions
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
prefixLength	TokenNameIdentifier	 prefix Length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
termLongEnough	TokenNameIdentifier	 term Long Enough
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
/** * Create a new FuzzyQuery that will match terms with a similarity * of at least <code>minimumSimilarity</code> to <code>term</code>. * If a <code>prefixLength</code> &gt; 0 is specified, a common prefix * of that length is also required. * * @param term the term to search for * @param minimumSimilarity a value between 0 and 1 to set the required similarity * between the query term and the matching terms. For example, for a * <code>minimumSimilarity</code> of <code>0.5</code> a term of the same length * as the query term is considered similar to the query term if the edit distance * between both terms is less than <code>length(term)*0.5</code> * @param prefixLength length of common (non-fuzzy) prefix * @param maxExpansions the maximum number of terms to match. If this number is * greater than {@link BooleanQuery#getMaxClauseCount} when the query is rewritten, * then the maxClauseCount will be used instead. * @throws IllegalArgumentException if minimumSimilarity is &gt;= 1 or &lt; 0 * or if prefixLength &lt; 0 */	TokenNameCOMMENT_JAVADOC	 Create a new FuzzyQuery that will match terms with a similarity of at least <code>minimumSimilarity</code> to <code>term</code>. If a <code>prefixLength</code> &gt; 0 is specified, a common prefix of that length is also required. * @param term the term to search for @param minimumSimilarity a value between 0 and 1 to set the required similarity between the query term and the matching terms. For example, for a <code>minimumSimilarity</code> of <code>0.5</code> a term of the same length as the query term is considered similar to the query term if the edit distance between both terms is less than <code>length(term)*0.5</code> @param prefixLength length of common (non-fuzzy) prefix @param maxExpansions the maximum number of terms to match. If this number is greater than {@link BooleanQuery#getMaxClauseCount} when the query is rewritten, then the maxClauseCount will be used instead. @throws IllegalArgumentException if minimumSimilarity is &gt;= 1 or &lt; 0 or if prefixLength &lt; 0 
public	TokenNamepublic	
FuzzyQuery	TokenNameIdentifier	 Fuzzy Query
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
float	TokenNamefloat	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
,	TokenNameCOMMA	
int	TokenNameint	
prefixLength	TokenNameIdentifier	 prefix Length
,	TokenNameCOMMA	
int	TokenNameint	
maxExpansions	TokenNameIdentifier	 max Expansions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
>=	TokenNameGREATER_EQUAL	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"minimumSimilarity >= 1"	TokenNameStringLiteral	minimumSimilarity >= 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
<	TokenNameLESS	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"minimumSimilarity < 0"	TokenNameStringLiteral	minimumSimilarity < 0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefixLength	TokenNameIdentifier	 prefix Length
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"prefixLength < 0"	TokenNameStringLiteral	prefixLength < 0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
maxExpansions	TokenNameIdentifier	 max Expansions
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"maxExpansions < 0"	TokenNameStringLiteral	maxExpansions < 0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setRewriteMethod	TokenNameIdentifier	 set Rewrite Method
(	TokenNameLPAREN	
new	TokenNamenew	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
.	TokenNameDOT	
TopTermsScoringBooleanQueryRewrite	TokenNameIdentifier	 Top Terms Scoring Boolean Query Rewrite
(	TokenNameLPAREN	
maxExpansions	TokenNameIdentifier	 max Expansions
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1.0f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
1.0f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
termLongEnough	TokenNameIdentifier	 term Long Enough
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
=	TokenNameEQUAL	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prefixLength	TokenNameIdentifier	 prefix Length
=	TokenNameEQUAL	
prefixLength	TokenNameIdentifier	 prefix Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calls {@link #FuzzyQuery(Term, float) FuzzyQuery(term, minimumSimilarity, prefixLength, Integer.MAX_VALUE)}. */	TokenNameCOMMENT_JAVADOC	 Calls {@link #FuzzyQuery(Term, float) FuzzyQuery(term, minimumSimilarity, prefixLength, Integer.MAX_VALUE)}. 
public	TokenNamepublic	
FuzzyQuery	TokenNameIdentifier	 Fuzzy Query
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
float	TokenNamefloat	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
,	TokenNameCOMMA	
int	TokenNameint	
prefixLength	TokenNameIdentifier	 prefix Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
,	TokenNameCOMMA	
prefixLength	TokenNameIdentifier	 prefix Length
,	TokenNameCOMMA	
defaultMaxExpansions	TokenNameIdentifier	 default Max Expansions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calls {@link #FuzzyQuery(Term, float) FuzzyQuery(term, minimumSimilarity, 0, Integer.MAX_VALUE)}. */	TokenNameCOMMENT_JAVADOC	 Calls {@link #FuzzyQuery(Term, float) FuzzyQuery(term, minimumSimilarity, 0, Integer.MAX_VALUE)}. 
public	TokenNamepublic	
FuzzyQuery	TokenNameIdentifier	 Fuzzy Query
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
float	TokenNamefloat	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
,	TokenNameCOMMA	
defaultPrefixLength	TokenNameIdentifier	 default Prefix Length
,	TokenNameCOMMA	
defaultMaxExpansions	TokenNameIdentifier	 default Max Expansions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calls {@link #FuzzyQuery(Term, float) FuzzyQuery(term, 0.5f, 0, Integer.MAX_VALUE)}. */	TokenNameCOMMENT_JAVADOC	 Calls {@link #FuzzyQuery(Term, float) FuzzyQuery(term, 0.5f, 0, Integer.MAX_VALUE)}. 
public	TokenNamepublic	
FuzzyQuery	TokenNameIdentifier	 Fuzzy Query
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
defaultMinSimilarity	TokenNameIdentifier	 default Min Similarity
,	TokenNameCOMMA	
defaultPrefixLength	TokenNameIdentifier	 default Prefix Length
,	TokenNameCOMMA	
defaultMaxExpansions	TokenNameIdentifier	 default Max Expansions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the minimum similarity that is required for this query to match. * @return float value between 0.0 and 1.0 */	TokenNameCOMMENT_JAVADOC	 Returns the minimum similarity that is required for this query to match. @return float value between 0.0 and 1.0 
public	TokenNamepublic	
float	TokenNamefloat	
getMinSimilarity	TokenNameIdentifier	 get Min Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the non-fuzzy prefix length. This is the number of characters at the start * of a term that must be identical (not fuzzy) to the query term if the query * is to match that term. */	TokenNameCOMMENT_JAVADOC	 Returns the non-fuzzy prefix length. This is the number of characters at the start of a term that must be identical (not fuzzy) to the query term if the query is to match that term. 
public	TokenNamepublic	
int	TokenNameint	
getPrefixLength	TokenNameIdentifier	 get Prefix Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefixLength	TokenNameIdentifier	 prefix Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
FilteredTermEnum	TokenNameIdentifier	 Filtered Term Enum
getEnum	TokenNameIdentifier	 get Enum
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
termLongEnough	TokenNameIdentifier	 term Long Enough
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// can only match if it's exact 	TokenNameCOMMENT_LINE	can only match if it's exact 
return	TokenNamereturn	
new	TokenNamenew	
SingleTermEnum	TokenNameIdentifier	 Single Term Enum
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FuzzyTermEnum	TokenNameIdentifier	 Fuzzy Term Enum
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
,	TokenNameCOMMA	
prefixLength	TokenNameIdentifier	 prefix Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the pattern term. */	TokenNameCOMMENT_JAVADOC	 Returns the pattern term. 
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
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
final	TokenNamefinal	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
prime	TokenNameIdentifier	 prime
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
prefixLength	TokenNameIdentifier	 prefix Length
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
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
obj	TokenNameIdentifier	 obj
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
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
FuzzyQuery	TokenNameIdentifier	 Fuzzy Query
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FuzzyQuery	TokenNameIdentifier	 Fuzzy Query
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
minimumSimilarity	TokenNameIdentifier	 minimum Similarity
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefixLength	TokenNameIdentifier	 prefix Length
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
prefixLength	TokenNameIdentifier	 prefix Length
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
term	TokenNameIdentifier	 term
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
