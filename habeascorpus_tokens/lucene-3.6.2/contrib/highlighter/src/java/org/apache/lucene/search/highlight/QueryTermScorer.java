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
Query	TokenNameIdentifier	 Query
;	TokenNameSEMICOLON	
/** * {@link Scorer} implementation which scores text fragments by the number of * unique query terms found. This class uses the {@link QueryTermExtractor} * class to process determine the query terms and their boosts to be used. */	TokenNameCOMMENT_JAVADOC	 {@link Scorer} implementation which scores text fragments by the number of unique query terms found. This class uses the {@link QueryTermExtractor} class to process determine the query terms and their boosts to be used. 
// TODO: provide option to boost score of fragments near beginning of document 	TokenNameCOMMENT_LINE	TODO: provide option to boost score of fragments near beginning of document 
// based on fragment.getFragNum() 	TokenNameCOMMENT_LINE	based on fragment.getFragNum() 
public	TokenNamepublic	
class	TokenNameclass	
QueryTermScorer	TokenNameIdentifier	 Query Term Scorer
implements	TokenNameimplements	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
TextFragment	TokenNameIdentifier	 Text Fragment
currentTextFragment	TokenNameIdentifier	 current Text Fragment
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
uniqueTermsInFragment	TokenNameIdentifier	 unique Terms In Fragment
;	TokenNameSEMICOLON	
float	TokenNamefloat	
totalScore	TokenNameIdentifier	 total Score
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
maxTermWeight	TokenNameIdentifier	 max Term Weight
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
WeightedTerm	TokenNameIdentifier	 Weighted Term
>	TokenNameGREATER	
termsToFind	TokenNameIdentifier	 terms To Find
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
;	TokenNameSEMICOLON	
/** * * @param query a Lucene query (ideally rewritten using query.rewrite before * being passed to this class and the searcher) */	TokenNameCOMMENT_JAVADOC	 * @param query a Lucene query (ideally rewritten using query.rewrite before being passed to this class and the searcher) 
public	TokenNamepublic	
QueryTermScorer	TokenNameIdentifier	 Query Term Scorer
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
QueryTermExtractor	TokenNameIdentifier	 Query Term Extractor
.	TokenNameDOT	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @param query a Lucene query (ideally rewritten using query.rewrite before * being passed to this class and the searcher) * @param fieldName the Field name which is used to match Query terms */	TokenNameCOMMENT_JAVADOC	 * @param query a Lucene query (ideally rewritten using query.rewrite before being passed to this class and the searcher) @param fieldName the Field name which is used to match Query terms 
public	TokenNamepublic	
QueryTermScorer	TokenNameIdentifier	 Query Term Scorer
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
QueryTermExtractor	TokenNameIdentifier	 Query Term Extractor
.	TokenNameDOT	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @param query a Lucene query (ideally rewritten using query.rewrite before * being passed to this class and the searcher) * @param reader used to compute IDF which can be used to a) score selected * fragments better b) use graded highlights eg set font color * intensity * @param fieldName the field on which Inverse Document Frequency (IDF) * calculations are based */	TokenNameCOMMENT_JAVADOC	 * @param query a Lucene query (ideally rewritten using query.rewrite before being passed to this class and the searcher) @param reader used to compute IDF which can be used to a) score selected fragments better b) use graded highlights eg set font color intensity @param fieldName the field on which Inverse Document Frequency (IDF) calculations are based 
public	TokenNamepublic	
QueryTermScorer	TokenNameIdentifier	 Query Term Scorer
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
QueryTermExtractor	TokenNameIdentifier	 Query Term Extractor
.	TokenNameDOT	
getIdfWeightedTerms	TokenNameIdentifier	 get Idf Weighted Terms
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
QueryTermScorer	TokenNameIdentifier	 Query Term Scorer
(	TokenNameLPAREN	
WeightedTerm	TokenNameIdentifier	 Weighted Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
weightedTerms	TokenNameIdentifier	 weighted Terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termsToFind	TokenNameIdentifier	 terms To Find
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
WeightedTerm	TokenNameIdentifier	 Weighted Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
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
WeightedTerm	TokenNameIdentifier	 Weighted Term
existingTerm	TokenNameIdentifier	 existing Term
=	TokenNameEQUAL	
termsToFind	TokenNameIdentifier	 terms To Find
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
// if a term is defined more than once, always use the highest scoring 	TokenNameCOMMENT_LINE	if a term is defined more than once, always use the highest scoring 
// weight 	TokenNameCOMMENT_LINE	weight 
termsToFind	TokenNameIdentifier	 terms To Find
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
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.lucene.search.highlight.Scorer#init(org.apache.lucene.analysis.TokenStream) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.search.highlight.Scorer#init(org.apache.lucene.analysis.TokenStream) 
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * (non-Javadoc) * * @see * org.apache.lucene.search.highlight.FragmentScorer#startFragment(org.apache * .lucene.search.highlight.TextFragment) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) * @see org.apache.lucene.search.highlight.FragmentScorer#startFragment(org.apache .lucene.search.highlight.TextFragment) 
public	TokenNamepublic	
void	TokenNamevoid	
startFragment	TokenNameIdentifier	 start Fragment
(	TokenNameLPAREN	
TextFragment	TokenNameIdentifier	 Text Fragment
newFragment	TokenNameIdentifier	 new Fragment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uniqueTermsInFragment	TokenNameIdentifier	 unique Terms In Fragment
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentTextFragment	TokenNameIdentifier	 current Text Fragment
=	TokenNameEQUAL	
newFragment	TokenNameIdentifier	 new Fragment
;	TokenNameSEMICOLON	
totalScore	TokenNameIdentifier	 total Score
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.lucene.search.highlight.Scorer#getTokenScore() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.search.highlight.Scorer#getTokenScore() 
public	TokenNamepublic	
float	TokenNamefloat	
getTokenScore	TokenNameIdentifier	 get Token Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
termText	TokenNameIdentifier	 term Text
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WeightedTerm	TokenNameIdentifier	 Weighted Term
queryTerm	TokenNameIdentifier	 query Term
=	TokenNameEQUAL	
termsToFind	TokenNameIdentifier	 terms To Find
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
termText	TokenNameIdentifier	 term Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queryTerm	TokenNameIdentifier	 query Term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not a query term - return 	TokenNameCOMMENT_LINE	not a query term - return 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// found a query term - is it unique in this doc? 	TokenNameCOMMENT_LINE	found a query term - is it unique in this doc? 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
uniqueTermsInFragment	TokenNameIdentifier	 unique Terms In Fragment
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
termText	TokenNameIdentifier	 term Text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
totalScore	TokenNameIdentifier	 total Score
+=	TokenNamePLUS_EQUAL	
queryTerm	TokenNameIdentifier	 query Term
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uniqueTermsInFragment	TokenNameIdentifier	 unique Terms In Fragment
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
termText	TokenNameIdentifier	 term Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
queryTerm	TokenNameIdentifier	 query Term
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.lucene.search.highlight.Scorer#getFragmentScore() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.search.highlight.Scorer#getFragmentScore() 
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
/* * (non-Javadoc) * * @see * org.apache.lucene.search.highlight.FragmentScorer#allFragmentsProcessed() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) * @see org.apache.lucene.search.highlight.FragmentScorer#allFragmentsProcessed() 
public	TokenNamepublic	
void	TokenNamevoid	
allFragmentsProcessed	TokenNameIdentifier	 all Fragments Processed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this class has no special operations to perform at end of processing 	TokenNameCOMMENT_LINE	this class has no special operations to perform at end of processing 
}	TokenNameRBRACE	
/** * * @return The highest weighted term (useful for passing to GradientFormatter * to set top end of coloring scale. */	TokenNameCOMMENT_JAVADOC	 * @return The highest weighted term (useful for passing to GradientFormatter to set top end of coloring scale. 
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
}	TokenNameRBRACE	
