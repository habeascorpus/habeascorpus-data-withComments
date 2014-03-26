package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
highlight	TokenNameIdentifier	 highlight
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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
CachingTokenFilter	TokenNameIdentifier	 Caching Token Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenStream	TokenNameIdentifier	 Token Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
memory	TokenNameIdentifier	 memory
.	TokenNameDOT	
MemoryIndex	TokenNameIdentifier	 Memory Index
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
Query	TokenNameIdentifier	 Query
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
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
SpanQuery	TokenNameIdentifier	 Span Query
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
StringHelper	TokenNameIdentifier	 String Helper
;	TokenNameSEMICOLON	
/** * {@link Scorer} implementation which scores text fragments by the number of * unique query terms found. This class converts appropriate {@link Query}s to * {@link SpanQuery}s and attempts to score only those terms that participated in * generating the 'hit' on the document. */	TokenNameCOMMENT_JAVADOC	 {@link Scorer} implementation which scores text fragments by the number of unique query terms found. This class converts appropriate {@link Query}s to {@link SpanQuery}s and attempts to score only those terms that participated in generating the 'hit' on the document. 
public	TokenNamepublic	
class	TokenNameclass	
QueryScorer	TokenNameIdentifier	 Query Scorer
implements	TokenNameimplements	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
private	TokenNameprivate	
float	TokenNamefloat	
totalScore	TokenNameIdentifier	 total Score
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
foundTerms	TokenNameIdentifier	 found Terms
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
WeightedSpanTerm	TokenNameIdentifier	 Weighted Span Term
>	TokenNameGREATER	
fieldWeightedSpanTerms	TokenNameIdentifier	 field Weighted Span Terms
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
maxTermWeight	TokenNameIdentifier	 max Term Weight
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
defaultField	TokenNameIdentifier	 default Field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncAtt	TokenNameIdentifier	 pos Inc Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
expandMultiTermQuery	TokenNameIdentifier	 expand Multi Term Query
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
skipInitExtractor	TokenNameIdentifier	 skip Init Extractor
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
wrapToCaching	TokenNameIdentifier	 wrap To Caching
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxCharsToAnalyze	TokenNameIdentifier	 max Chars To Analyze
;	TokenNameSEMICOLON	
/** * @param query Query to use for highlighting */	TokenNameCOMMENT_JAVADOC	 @param query Query to use for highlighting 
public	TokenNamepublic	
QueryScorer	TokenNameIdentifier	 Query Scorer
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param query Query to use for highlighting * @param field Field to highlight - pass null to ignore fields */	TokenNameCOMMENT_JAVADOC	 @param query Query to use for highlighting @param field Field to highlight - pass null to ignore fields 
public	TokenNamepublic	
QueryScorer	TokenNameIdentifier	 Query Scorer
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param query Query to use for highlighting * @param field Field to highlight - pass null to ignore fields * @param reader {@link IndexReader} to use for quasi tf/idf scoring */	TokenNameCOMMENT_JAVADOC	 @param query Query to use for highlighting @param field Field to highlight - pass null to ignore fields @param reader {@link IndexReader} to use for quasi tf/idf scoring 
public	TokenNamepublic	
QueryScorer	TokenNameIdentifier	 Query Scorer
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param query to use for highlighting * @param reader {@link IndexReader} to use for quasi tf/idf scoring * @param field to highlight - pass null to ignore fields * @param defaultField */	TokenNameCOMMENT_JAVADOC	 @param query to use for highlighting @param reader {@link IndexReader} to use for quasi tf/idf scoring @param field to highlight - pass null to ignore fields @param defaultField 
public	TokenNamepublic	
QueryScorer	TokenNameIdentifier	 Query Scorer
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
defaultField	TokenNameIdentifier	 default Field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
defaultField	TokenNameIdentifier	 default Field
=	TokenNameEQUAL	
StringHelper	TokenNameIdentifier	 String Helper
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
defaultField	TokenNameIdentifier	 default Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param defaultField - The default field for queries with the field name unspecified */	TokenNameCOMMENT_JAVADOC	 @param defaultField - The default field for queries with the field name unspecified 
public	TokenNamepublic	
QueryScorer	TokenNameIdentifier	 Query Scorer
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
defaultField	TokenNameIdentifier	 default Field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
defaultField	TokenNameIdentifier	 default Field
=	TokenNameEQUAL	
StringHelper	TokenNameIdentifier	 String Helper
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
defaultField	TokenNameIdentifier	 default Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param weightedTerms an array of pre-created {@link WeightedSpanTerm}s */	TokenNameCOMMENT_JAVADOC	 @param weightedTerms an array of pre-created {@link WeightedSpanTerm}s 
public	TokenNamepublic	
QueryScorer	TokenNameIdentifier	 Query Scorer
(	TokenNameLPAREN	
WeightedSpanTerm	TokenNameIdentifier	 Weighted Span Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
weightedTerms	TokenNameIdentifier	 weighted Terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fieldWeightedSpanTerms	TokenNameIdentifier	 field Weighted Span Terms
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
WeightedSpanTerm	TokenNameIdentifier	 Weighted Span Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
weightedTerms	TokenNameIdentifier	 weighted Terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
weightedTerms	TokenNameIdentifier	 weighted Terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WeightedSpanTerm	TokenNameIdentifier	 Weighted Span Term
existingTerm	TokenNameIdentifier	 existing Term
=	TokenNameEQUAL	
fieldWeightedSpanTerms	TokenNameIdentifier	 field Weighted Span Terms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
weightedTerms	TokenNameIdentifier	 weighted Terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
existingTerm	TokenNameIdentifier	 existing Term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
existingTerm	TokenNameIdentifier	 existing Term
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
<	TokenNameLESS	
weightedTerms	TokenNameIdentifier	 weighted Terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if a term is defined more than once, always use the highest 	TokenNameCOMMENT_LINE	if a term is defined more than once, always use the highest 
// scoring weight 	TokenNameCOMMENT_LINE	scoring weight 
fieldWeightedSpanTerms	TokenNameIdentifier	 field Weighted Span Terms
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
weightedTerms	TokenNameIdentifier	 weighted Terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
weightedTerms	TokenNameIdentifier	 weighted Terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxTermWeight	TokenNameIdentifier	 max Term Weight
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
maxTermWeight	TokenNameIdentifier	 max Term Weight
,	TokenNameCOMMA	
weightedTerms	TokenNameIdentifier	 weighted Terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
skipInitExtractor	TokenNameIdentifier	 skip Init Extractor
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * (non-Javadoc) * * @see org.apache.lucene.search.highlight.Scorer#getFragmentScore() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) * @see org.apache.lucene.search.highlight.Scorer#getFragmentScore() 
public	TokenNamepublic	
float	TokenNamefloat	
getFragmentScore	TokenNameIdentifier	 get Fragment Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
totalScore	TokenNameIdentifier	 total Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @return The highest weighted term (useful for passing to * GradientFormatter to set top end of coloring scale). */	TokenNameCOMMENT_JAVADOC	 * @return The highest weighted term (useful for passing to GradientFormatter to set top end of coloring scale). 
public	TokenNamepublic	
float	TokenNamefloat	
getMaxTermWeight	TokenNameIdentifier	 get Max Term Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxTermWeight	TokenNameIdentifier	 max Term Weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * (non-Javadoc) * * @see org.apache.lucene.search.highlight.Scorer#getTokenScore(org.apache.lucene.analysis.Token, * int) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) * @see org.apache.lucene.search.highlight.Scorer#getTokenScore(org.apache.lucene.analysis.Token, int) 
public	TokenNamepublic	
float	TokenNamefloat	
getTokenScore	TokenNameIdentifier	 get Token Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
position	TokenNameIdentifier	 position
+=	TokenNamePLUS_EQUAL	
posIncAtt	TokenNameIdentifier	 pos Inc Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
termText	TokenNameIdentifier	 term Text
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WeightedSpanTerm	TokenNameIdentifier	 Weighted Span Term
weightedSpanTerm	TokenNameIdentifier	 weighted Span Term
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
weightedSpanTerm	TokenNameIdentifier	 weighted Span Term
=	TokenNameEQUAL	
fieldWeightedSpanTerms	TokenNameIdentifier	 field Weighted Span Terms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
termText	TokenNameIdentifier	 term Text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
weightedSpanTerm	TokenNameIdentifier	 weighted Span Term
.	TokenNameDOT	
positionSensitive	TokenNameIdentifier	 position Sensitive
&&	TokenNameAND_AND	
!	TokenNameNOT	
weightedSpanTerm	TokenNameIdentifier	 weighted Span Term
.	TokenNameDOT	
checkPosition	TokenNameIdentifier	 check Position
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
weightedSpanTerm	TokenNameIdentifier	 weighted Span Term
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// found a query term - is it unique in this doc? 	TokenNameCOMMENT_LINE	found a query term - is it unique in this doc? 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
foundTerms	TokenNameIdentifier	 found Terms
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
termText	TokenNameIdentifier	 term Text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
totalScore	TokenNameIdentifier	 total Score
+=	TokenNamePLUS_EQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
foundTerms	TokenNameIdentifier	 found Terms
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
termText	TokenNameIdentifier	 term Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.lucene.search.highlight.Scorer#init(org.apache.lucene.analysis.TokenStream) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.search.highlight.Scorer#init(org.apache.lucene.analysis.TokenStream) 
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
tokenStream	TokenNameIdentifier	 token Stream
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posIncAtt	TokenNameIdentifier	 pos Inc Att
=	TokenNameEQUAL	
tokenStream	TokenNameIdentifier	 token Stream
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
skipInitExtractor	TokenNameIdentifier	 skip Init Extractor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldWeightedSpanTerms	TokenNameIdentifier	 field Weighted Span Terms
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldWeightedSpanTerms	TokenNameIdentifier	 field Weighted Span Terms
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
initExtractor	TokenNameIdentifier	 init Extractor
(	TokenNameLPAREN	
tokenStream	TokenNameIdentifier	 token Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve the {@link WeightedSpanTerm} for the specified token. Useful for passing * Span information to a {@link Fragmenter}. * * @param token to get {@link WeightedSpanTerm} for * @return WeightedSpanTerm for token */	TokenNameCOMMENT_JAVADOC	 Retrieve the {@link WeightedSpanTerm} for the specified token. Useful for passing Span information to a {@link Fragmenter}. * @param token to get {@link WeightedSpanTerm} for @return WeightedSpanTerm for token 
public	TokenNamepublic	
WeightedSpanTerm	TokenNameIdentifier	 Weighted Span Term
getWeightedSpanTerm	TokenNameIdentifier	 get Weighted Span Term
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldWeightedSpanTerms	TokenNameIdentifier	 field Weighted Span Terms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
boolean	TokenNameboolean	
expandMultiTermQuery	TokenNameIdentifier	 expand Multi Term Query
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
expandMultiTermQuery	TokenNameIdentifier	 expand Multi Term Query
=	TokenNameEQUAL	
expandMultiTermQuery	TokenNameIdentifier	 expand Multi Term Query
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
TokenStream	TokenNameIdentifier	 Token Stream
initExtractor	TokenNameIdentifier	 init Extractor
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
WeightedSpanTermExtractor	TokenNameIdentifier	 Weighted Span Term Extractor
qse	TokenNameIdentifier	 qse
=	TokenNameEQUAL	
newTermExtractor	TokenNameIdentifier	 new Term Extractor
(	TokenNameLPAREN	
defaultField	TokenNameIdentifier	 default Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qse	TokenNameIdentifier	 qse
.	TokenNameDOT	
setMaxDocCharsToAnalyze	TokenNameIdentifier	 set Max Doc Chars To Analyze
(	TokenNameLPAREN	
maxCharsToAnalyze	TokenNameIdentifier	 max Chars To Analyze
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qse	TokenNameIdentifier	 qse
.	TokenNameDOT	
setExpandMultiTermQuery	TokenNameIdentifier	 set Expand Multi Term Query
(	TokenNameLPAREN	
expandMultiTermQuery	TokenNameIdentifier	 expand Multi Term Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qse	TokenNameIdentifier	 qse
.	TokenNameDOT	
setWrapIfNotCachingTokenFilter	TokenNameIdentifier	 set Wrap If Not Caching Token Filter
(	TokenNameLPAREN	
wrapToCaching	TokenNameIdentifier	 wrap To Caching
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fieldWeightedSpanTerms	TokenNameIdentifier	 field Weighted Span Terms
=	TokenNameEQUAL	
qse	TokenNameIdentifier	 qse
.	TokenNameDOT	
getWeightedSpanTerms	TokenNameIdentifier	 get Weighted Span Terms
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
tokenStream	TokenNameIdentifier	 token Stream
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fieldWeightedSpanTerms	TokenNameIdentifier	 field Weighted Span Terms
=	TokenNameEQUAL	
qse	TokenNameIdentifier	 qse
.	TokenNameDOT	
getWeightedSpanTermsWithScores	TokenNameIdentifier	 get Weighted Span Terms With Scores
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
tokenStream	TokenNameIdentifier	 token Stream
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
qse	TokenNameIdentifier	 qse
.	TokenNameDOT	
isCachedTokenStream	TokenNameIdentifier	 is Cached Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
qse	TokenNameIdentifier	 qse
.	TokenNameDOT	
getTokenStream	TokenNameIdentifier	 get Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
WeightedSpanTermExtractor	TokenNameIdentifier	 Weighted Span Term Extractor
newTermExtractor	TokenNameIdentifier	 new Term Extractor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
defaultField	TokenNameIdentifier	 default Field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultField	TokenNameIdentifier	 default Field
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
WeightedSpanTermExtractor	TokenNameIdentifier	 Weighted Span Term Extractor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
WeightedSpanTermExtractor	TokenNameIdentifier	 Weighted Span Term Extractor
(	TokenNameLPAREN	
defaultField	TokenNameIdentifier	 default Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * (non-Javadoc) * * @see org.apache.lucene.search.highlight.Scorer#startFragment(org.apache.lucene.search.highlight.TextFragment) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) * @see org.apache.lucene.search.highlight.Scorer#startFragment(org.apache.lucene.search.highlight.TextFragment) 
public	TokenNamepublic	
void	TokenNamevoid	
startFragment	TokenNameIdentifier	 start Fragment
(	TokenNameLPAREN	
TextFragment	TokenNameIdentifier	 Text Fragment
newFragment	TokenNameIdentifier	 new Fragment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundTerms	TokenNameIdentifier	 found Terms
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalScore	TokenNameIdentifier	 total Score
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if multi-term queries should be expanded */	TokenNameCOMMENT_JAVADOC	 @return true if multi-term queries should be expanded 
public	TokenNamepublic	
boolean	TokenNameboolean	
isExpandMultiTermQuery	TokenNameIdentifier	 is Expand Multi Term Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expandMultiTermQuery	TokenNameIdentifier	 expand Multi Term Query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Controls whether or not multi-term queries are expanded * against a {@link MemoryIndex} {@link IndexReader}. * * @param expandMultiTermQuery true if multi-term queries should be expanded */	TokenNameCOMMENT_JAVADOC	 Controls whether or not multi-term queries are expanded against a {@link MemoryIndex} {@link IndexReader}. * @param expandMultiTermQuery true if multi-term queries should be expanded 
public	TokenNamepublic	
void	TokenNamevoid	
setExpandMultiTermQuery	TokenNameIdentifier	 set Expand Multi Term Query
(	TokenNameLPAREN	
boolean	TokenNameboolean	
expandMultiTermQuery	TokenNameIdentifier	 expand Multi Term Query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
expandMultiTermQuery	TokenNameIdentifier	 expand Multi Term Query
=	TokenNameEQUAL	
expandMultiTermQuery	TokenNameIdentifier	 expand Multi Term Query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * By default, {@link TokenStream}s that are not of the type * {@link CachingTokenFilter} are wrapped in a {@link CachingTokenFilter} to * ensure an efficient reset - if you are already using a different caching * {@link TokenStream} impl and you don't want it to be wrapped, set this to * false. * * @param wrap */	TokenNameCOMMENT_JAVADOC	 By default, {@link TokenStream}s that are not of the type {@link CachingTokenFilter} are wrapped in a {@link CachingTokenFilter} to ensure an efficient reset - if you are already using a different caching {@link TokenStream} impl and you don't want it to be wrapped, set this to false. * @param wrap 
public	TokenNamepublic	
void	TokenNamevoid	
setWrapIfNotCachingTokenFilter	TokenNameIdentifier	 set Wrap If Not Caching Token Filter
(	TokenNameLPAREN	
boolean	TokenNameboolean	
wrap	TokenNameIdentifier	 wrap
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
wrapToCaching	TokenNameIdentifier	 wrap To Caching
=	TokenNameEQUAL	
wrap	TokenNameIdentifier	 wrap
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMaxDocCharsToAnalyze	TokenNameIdentifier	 set Max Doc Chars To Analyze
(	TokenNameLPAREN	
int	TokenNameint	
maxDocCharsToAnalyze	TokenNameIdentifier	 max Doc Chars To Analyze
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxCharsToAnalyze	TokenNameIdentifier	 max Chars To Analyze
=	TokenNameEQUAL	
maxDocCharsToAnalyze	TokenNameIdentifier	 max Doc Chars To Analyze
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
