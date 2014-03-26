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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringReader	TokenNameIdentifier	 String Reader
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
Iterator	TokenNameIdentifier	 Iterator
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
Analyzer	TokenNameIdentifier	 Analyzer
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
TermEnum	TokenNameIdentifier	 Term Enum
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
PriorityQueue	TokenNameIdentifier	 Priority Queue
;	TokenNameSEMICOLON	
/** * Fuzzifies ALL terms provided as strings and then picks the best n differentiating terms. * In effect this mixes the behaviour of FuzzyQuery and MoreLikeThis but with special consideration * of fuzzy scoring factors. * This generally produces good results for queries where users may provide details in a number of * fields and have no knowledge of boolean query syntax and also want a degree of fuzzy matching and * a fast query. * * For each source term the fuzzy variants are held in a BooleanQuery with no coord factor (because * we are not looking for matches on multiple variants in any one doc). Additionally, a specialized * TermQuery is used for variants and does not use that variant term's IDF because this would favour rarer * terms eg misspellings. Instead, all variants use the same IDF ranking (the one for the source query * term) and this is factored into the variant's boost. If the source query term does not exist in the * index the average IDF of the variants is used. */	TokenNameCOMMENT_JAVADOC	 Fuzzifies ALL terms provided as strings and then picks the best n differentiating terms. In effect this mixes the behaviour of FuzzyQuery and MoreLikeThis but with special consideration of fuzzy scoring factors. This generally produces good results for queries where users may provide details in a number of fields and have no knowledge of boolean query syntax and also want a degree of fuzzy matching and a fast query. * For each source term the fuzzy variants are held in a BooleanQuery with no coord factor (because we are not looking for matches on multiple variants in any one doc). Additionally, a specialized TermQuery is used for variants and does not use that variant term's IDF because this would favour rarer terms eg misspellings. Instead, all variants use the same IDF ranking (the one for the source query term) and this is factored into the variant's boost. If the source query term does not exist in the index the average IDF of the variants is used. 
public	TokenNamepublic	
class	TokenNameclass	
FuzzyLikeThisQuery	TokenNameIdentifier	 Fuzzy Like This Query
extends	TokenNameextends	
Query	TokenNameIdentifier	 Query
{	TokenNameLBRACE	
static	TokenNamestatic	
Similarity	TokenNameIdentifier	 Similarity
sim	TokenNameIdentifier	 sim
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultSimilarity	TokenNameIdentifier	 Default Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
rewrittenQuery	TokenNameIdentifier	 rewritten Query
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FieldVals	TokenNameIdentifier	 Field Vals
>	TokenNameGREATER	
fieldVals	TokenNameIdentifier	 field Vals
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FieldVals	TokenNameIdentifier	 Field Vals
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
;	TokenNameSEMICOLON	
ScoreTermQueue	TokenNameIdentifier	 Score Term Queue
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
int	TokenNameint	
MAX_VARIANTS_PER_TERM	TokenNameIdentifier	 MAX  VARIANTS  PER  TERM
=	TokenNameEQUAL	
50	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
ignoreTF	TokenNameIdentifier	 ignore TF
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxNumTerms	TokenNameIdentifier	 max Num Terms
;	TokenNameSEMICOLON	
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
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fieldVals	TokenNameIdentifier	 field Vals
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
fieldVals	TokenNameIdentifier	 field Vals
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
ignoreTF	TokenNameIdentifier	 ignore TF
?	TokenNameQUESTION	
1231	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1237	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
maxNumTerms	TokenNameIdentifier	 max Num Terms
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
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
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
FuzzyLikeThisQuery	TokenNameIdentifier	 Fuzzy Like This Query
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FuzzyLikeThisQuery	TokenNameIdentifier	 Fuzzy Like This Query
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
analyzer	TokenNameIdentifier	 analyzer
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
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fieldVals	TokenNameIdentifier	 field Vals
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
fieldVals	TokenNameIdentifier	 field Vals
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
fieldVals	TokenNameIdentifier	 field Vals
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
fieldVals	TokenNameIdentifier	 field Vals
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ignoreTF	TokenNameIdentifier	 ignore TF
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ignoreTF	TokenNameIdentifier	 ignore TF
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
maxNumTerms	TokenNameIdentifier	 max Num Terms
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
maxNumTerms	TokenNameIdentifier	 max Num Terms
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @param maxNumTerms The total number of terms clauses that will appear once rewritten as a BooleanQuery * @param analyzer */	TokenNameCOMMENT_JAVADOC	 * @param maxNumTerms The total number of terms clauses that will appear once rewritten as a BooleanQuery @param analyzer 
public	TokenNamepublic	
FuzzyLikeThisQuery	TokenNameIdentifier	 Fuzzy Like This Query
(	TokenNameLPAREN	
int	TokenNameint	
maxNumTerms	TokenNameIdentifier	 max Num Terms
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
ScoreTermQueue	TokenNameIdentifier	 Score Term Queue
(	TokenNameLPAREN	
maxNumTerms	TokenNameIdentifier	 max Num Terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
analyzer	TokenNameIdentifier	 analyzer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxNumTerms	TokenNameIdentifier	 max Num Terms
=	TokenNameEQUAL	
maxNumTerms	TokenNameIdentifier	 max Num Terms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
class	TokenNameclass	
FieldVals	TokenNameIdentifier	 Field Vals
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
queryString	TokenNameIdentifier	 query String
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
;	TokenNameSEMICOLON	
float	TokenNamefloat	
minSimilarity	TokenNameIdentifier	 min Similarity
;	TokenNameSEMICOLON	
int	TokenNameint	
prefixLength	TokenNameIdentifier	 prefix Length
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FieldVals	TokenNameIdentifier	 Field Vals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
float	TokenNamefloat	
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
queryString	TokenNameIdentifier	 query String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldName	TokenNameIdentifier	 field Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
minSimilarity	TokenNameIdentifier	 min Similarity
=	TokenNameEQUAL	
similarity	TokenNameIdentifier	 similarity
;	TokenNameSEMICOLON	
prefixLength	TokenNameIdentifier	 prefix Length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
queryString	TokenNameIdentifier	 query String
=	TokenNameEQUAL	
queryString	TokenNameIdentifier	 query String
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
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
fieldName	TokenNameIdentifier	 field Name
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
minSimilarity	TokenNameIdentifier	 min Similarity
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
queryString	TokenNameIdentifier	 query String
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
queryString	TokenNameIdentifier	 query String
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
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
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
FieldVals	TokenNameIdentifier	 Field Vals
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FieldVals	TokenNameIdentifier	 Field Vals
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
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
fieldName	TokenNameIdentifier	 field Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
minSimilarity	TokenNameIdentifier	 min Similarity
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
minSimilarity	TokenNameIdentifier	 min Similarity
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
queryString	TokenNameIdentifier	 query String
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
queryString	TokenNameIdentifier	 query String
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
queryString	TokenNameIdentifier	 query String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
queryString	TokenNameIdentifier	 query String
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
/** * Adds user input for "fuzzification" * @param queryString The string which will be parsed by the analyzer and for which fuzzy variants will be parsed * @param fieldName * @param minSimilarity The minimum similarity of the term variants (see FuzzyTermEnum) * @param prefixLength Length of required common prefix on variant terms (see FuzzyTermEnum) */	TokenNameCOMMENT_JAVADOC	 Adds user input for "fuzzification" @param queryString The string which will be parsed by the analyzer and for which fuzzy variants will be parsed @param fieldName @param minSimilarity The minimum similarity of the term variants (see FuzzyTermEnum) @param prefixLength Length of required common prefix on variant terms (see FuzzyTermEnum) 
public	TokenNamepublic	
void	TokenNamevoid	
addTerms	TokenNameIdentifier	 add Terms
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
queryString	TokenNameIdentifier	 query String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
float	TokenNamefloat	
minSimilarity	TokenNameIdentifier	 min Similarity
,	TokenNameCOMMA	
int	TokenNameint	
prefixLength	TokenNameIdentifier	 prefix Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldVals	TokenNameIdentifier	 field Vals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
FieldVals	TokenNameIdentifier	 Field Vals
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
minSimilarity	TokenNameIdentifier	 min Similarity
,	TokenNameCOMMA	
prefixLength	TokenNameIdentifier	 prefix Length
,	TokenNameCOMMA	
queryString	TokenNameIdentifier	 query String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addTerms	TokenNameIdentifier	 add Terms
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
FieldVals	TokenNameIdentifier	 Field Vals
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
queryString	TokenNameIdentifier	 query String
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
TokenStream	TokenNameIdentifier	 Token Stream
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
queryString	TokenNameIdentifier	 query String
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
corpusNumDocs	TokenNameIdentifier	 corpus Num Docs
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
internSavingTemplateTerm	TokenNameIdentifier	 intern Saving Template Term
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//optimization to avoid constructing new Term() objects 	TokenNameCOMMENT_LINE	optimization to avoid constructing new Term() objects 
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
processedTerms	TokenNameIdentifier	 processed Terms
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
processedTerms	TokenNameIdentifier	 processed Terms
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processedTerms	TokenNameIdentifier	 processed Terms
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreTermQueue	TokenNameIdentifier	 Score Term Queue
variantsQ	TokenNameIdentifier	 variants Q
=	TokenNameEQUAL	
new	TokenNamenew	
ScoreTermQueue	TokenNameIdentifier	 Score Term Queue
(	TokenNameLPAREN	
MAX_VARIANTS_PER_TERM	TokenNameIdentifier	 MAX  VARIANTS  PER  TERM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//maxNum variants considered for any one term 	TokenNameCOMMENT_LINE	maxNum variants considered for any one term 
float	TokenNamefloat	
minScore	TokenNameIdentifier	 min Score
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
startTerm	TokenNameIdentifier	 start Term
=	TokenNameEQUAL	
internSavingTemplateTerm	TokenNameIdentifier	 intern Saving Template Term
.	TokenNameDOT	
createTerm	TokenNameIdentifier	 create Term
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FuzzyTermEnum	TokenNameIdentifier	 Fuzzy Term Enum
fe	TokenNameIdentifier	 fe
=	TokenNameEQUAL	
new	TokenNamenew	
FuzzyTermEnum	TokenNameIdentifier	 Fuzzy Term Enum
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
startTerm	TokenNameIdentifier	 start Term
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
minSimilarity	TokenNameIdentifier	 min Similarity
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
prefixLength	TokenNameIdentifier	 prefix Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermEnum	TokenNameIdentifier	 Term Enum
origEnum	TokenNameIdentifier	 orig Enum
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
startTerm	TokenNameIdentifier	 start Term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startTerm	TokenNameIdentifier	 start Term
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
origEnum	TokenNameIdentifier	 orig Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
origEnum	TokenNameIdentifier	 orig Enum
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//store the df so all variants use same idf 	TokenNameCOMMENT_LINE	store the df so all variants use same idf 
}	TokenNameRBRACE	
int	TokenNameint	
numVariants	TokenNameIdentifier	 num Variants
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
totalVariantDocFreqs	TokenNameIdentifier	 total Variant Doc Freqs
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
possibleMatch	TokenNameIdentifier	 possible Match
=	TokenNameEQUAL	
fe	TokenNameIdentifier	 fe
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
possibleMatch	TokenNameIdentifier	 possible Match
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numVariants	TokenNameIdentifier	 num Variants
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
totalVariantDocFreqs	TokenNameIdentifier	 total Variant Doc Freqs
+=	TokenNamePLUS_EQUAL	
fe	TokenNameIdentifier	 fe
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
fe	TokenNameIdentifier	 fe
.	TokenNameDOT	
difference	TokenNameIdentifier	 difference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
variantsQ	TokenNameIdentifier	 variants Q
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
MAX_VARIANTS_PER_TERM	TokenNameIdentifier	 MAX  VARIANTS  PER  TERM
||	TokenNameOR_OR	
score	TokenNameIdentifier	 score
>	TokenNameGREATER	
minScore	TokenNameIdentifier	 min Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ScoreTerm	TokenNameIdentifier	 Score Term
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
ScoreTerm	TokenNameIdentifier	 Score Term
(	TokenNameLPAREN	
possibleMatch	TokenNameIdentifier	 possible Match
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
startTerm	TokenNameIdentifier	 start Term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
variantsQ	TokenNameIdentifier	 variants Q
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
minScore	TokenNameIdentifier	 min Score
=	TokenNameEQUAL	
variantsQ	TokenNameIdentifier	 variants Q
.	TokenNameDOT	
top	TokenNameIdentifier	 top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
// maintain minScore 	TokenNameCOMMENT_LINE	maintain minScore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
fe	TokenNameIdentifier	 fe
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numVariants	TokenNameIdentifier	 num Variants
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
avgDf	TokenNameIdentifier	 avg Df
=	TokenNameEQUAL	
totalVariantDocFreqs	TokenNameIdentifier	 total Variant Doc Freqs
/	TokenNameDIVIDE	
numVariants	TokenNameIdentifier	 num Variants
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
df	TokenNameIdentifier	 df
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
//no direct match we can use as df for all variants 	TokenNameCOMMENT_LINE	no direct match we can use as df for all variants 
{	TokenNameLBRACE	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
avgDf	TokenNameIdentifier	 avg Df
;	TokenNameSEMICOLON	
//use avg df of all variants 	TokenNameCOMMENT_LINE	use avg df of all variants 
}	TokenNameRBRACE	
// take the top variants (scored by edit distance) and reset the score 	TokenNameCOMMENT_LINE	take the top variants (scored by edit distance) and reset the score 
// to include an IDF factor then add to the global queue for ranking 	TokenNameCOMMENT_LINE	to include an IDF factor then add to the global queue for ranking 
// overall top query terms 	TokenNameCOMMENT_LINE	overall top query terms 
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
variantsQ	TokenNameIdentifier	 variants Q
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ScoreTerm	TokenNameIdentifier	 Score Term
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
variantsQ	TokenNameIdentifier	 variants Q
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
score	TokenNameIdentifier	 score
*	TokenNameMULTIPLY	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
sim	TokenNameIdentifier	 sim
.	TokenNameDOT	
idf	TokenNameIdentifier	 idf
(	TokenNameLPAREN	
df	TokenNameIdentifier	 df
,	TokenNameCOMMA	
corpusNumDocs	TokenNameIdentifier	 corpus Num Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
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
rewrittenQuery	TokenNameIdentifier	 rewritten Query
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rewrittenQuery	TokenNameIdentifier	 rewritten Query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//load up the list of possible terms 	TokenNameCOMMENT_LINE	load up the list of possible terms 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
FieldVals	TokenNameIdentifier	 Field Vals
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
fieldVals	TokenNameIdentifier	 field Vals
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldVals	TokenNameIdentifier	 Field Vals
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addTerms	TokenNameIdentifier	 add Terms
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//clear the list of fields 	TokenNameCOMMENT_LINE	clear the list of fields 
fieldVals	TokenNameIdentifier	 field Vals
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//create BooleanQueries to hold the variants for each token/field pair and ensure it 	TokenNameCOMMENT_LINE	create BooleanQueries to hold the variants for each token/field pair and ensure it 
// has no coord factor 	TokenNameCOMMENT_LINE	has no coord factor 
//Step 1: sort the termqueries by term/field 	TokenNameCOMMENT_LINE	Step 1: sort the termqueries by term/field 
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ScoreTerm	TokenNameIdentifier	 Score Term
>>	TokenNameRIGHT_SHIFT	
variantQueries	TokenNameIdentifier	 variant Queries
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ScoreTerm	TokenNameIdentifier	 Score Term
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ScoreTerm	TokenNameIdentifier	 Score Term
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ScoreTerm	TokenNameIdentifier	 Score Term
>	TokenNameGREATER	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
variantQueries	TokenNameIdentifier	 variant Queries
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
fuzziedSourceTerm	TokenNameIdentifier	 fuzzied Source Term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ScoreTerm	TokenNameIdentifier	 Score Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
variantQueries	TokenNameIdentifier	 variant Queries
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
fuzziedSourceTerm	TokenNameIdentifier	 fuzzied Source Term
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Step 2: Organize the sorted termqueries into zero-coord scoring boolean queries 	TokenNameCOMMENT_LINE	Step 2: Organize the sorted termqueries into zero-coord scoring boolean queries 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ScoreTerm	TokenNameIdentifier	 Score Term
>>	TokenNameRIGHT_SHIFT	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
variantQueries	TokenNameIdentifier	 variant Queries
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ScoreTerm	TokenNameIdentifier	 Score Term
>	TokenNameGREATER	
variants	TokenNameIdentifier	 variants
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
variants	TokenNameIdentifier	 variants
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//optimize where only one selected variant 	TokenNameCOMMENT_LINE	optimize where only one selected variant 
ScoreTerm	TokenNameIdentifier	 Score Term
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
variants	TokenNameIdentifier	 variants
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermQuery	TokenNameIdentifier	 Term Query
tq	TokenNameIdentifier	 tq
=	TokenNameEQUAL	
new	TokenNamenew	
FuzzyTermQuery	TokenNameIdentifier	 Fuzzy Term Query
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
ignoreTF	TokenNameIdentifier	 ignore TF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tq	TokenNameIdentifier	 tq
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set the boost to a mix of IDF and score 	TokenNameCOMMENT_LINE	set the boost to a mix of IDF and score 
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
termVariants	TokenNameIdentifier	 term Variants
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//disable coord and IDF for these term variants 	TokenNameCOMMENT_LINE	disable coord and IDF for these term variants 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
ScoreTerm	TokenNameIdentifier	 Score Term
>	TokenNameGREATER	
iterator2	TokenNameIdentifier	 iterator2
=	TokenNameEQUAL	
variants	TokenNameIdentifier	 variants
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iterator2	TokenNameIdentifier	 iterator2
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ScoreTerm	TokenNameIdentifier	 Score Term
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
iterator2	TokenNameIdentifier	 iterator2
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermQuery	TokenNameIdentifier	 Term Query
tq	TokenNameIdentifier	 tq
=	TokenNameEQUAL	
new	TokenNamenew	
FuzzyTermQuery	TokenNameIdentifier	 Fuzzy Term Query
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
ignoreTF	TokenNameIdentifier	 ignore TF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// found a match 	TokenNameCOMMENT_LINE	found a match 
tq	TokenNameIdentifier	 tq
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set the boost using the ScoreTerm's score 	TokenNameCOMMENT_LINE	set the boost using the ScoreTerm's score 
termVariants	TokenNameIdentifier	 term Variants
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add to query 	TokenNameCOMMENT_LINE	add to query 
}	TokenNameRBRACE	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
termVariants	TokenNameIdentifier	 term Variants
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add to query 	TokenNameCOMMENT_LINE	add to query 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//TODO possible alternative step 3 - organize above booleans into a new layer of field-based 	TokenNameCOMMENT_LINE	TODO possible alternative step 3 - organize above booleans into a new layer of field-based 
// booleans with a minimum-should-match of NumFields-1? 	TokenNameCOMMENT_LINE	booleans with a minimum-should-match of NumFields-1? 
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
rewrittenQuery	TokenNameIdentifier	 rewritten Query
=	TokenNameEQUAL	
bq	TokenNameIdentifier	 bq
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bq	TokenNameIdentifier	 bq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Holds info for a fuzzy term variant - initially score is set to edit distance (for ranking best 	TokenNameCOMMENT_LINE	Holds info for a fuzzy term variant - initially score is set to edit distance (for ranking best 
// term variants) then is reset with IDF for use in ranking against all other 	TokenNameCOMMENT_LINE	term variants) then is reset with IDF for use in ranking against all other 
// terms/fields 	TokenNameCOMMENT_LINE	terms/fields 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ScoreTerm	TokenNameIdentifier	 Score Term
{	TokenNameLBRACE	
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
public	TokenNamepublic	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
fuzziedSourceTerm	TokenNameIdentifier	 fuzzied Source Term
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ScoreTerm	TokenNameIdentifier	 Score Term
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
fuzziedSourceTerm	TokenNameIdentifier	 fuzzied Source Term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fuzziedSourceTerm	TokenNameIdentifier	 fuzzied Source Term
=	TokenNameEQUAL	
fuzziedSourceTerm	TokenNameIdentifier	 fuzzied Source Term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ScoreTermQueue	TokenNameIdentifier	 Score Term Queue
extends	TokenNameextends	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
ScoreTerm	TokenNameIdentifier	 Score Term
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
ScoreTermQueue	TokenNameIdentifier	 Score Term Queue
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.lucene.util.PriorityQueue#lessThan(java.lang.Object, java.lang.Object) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.util.PriorityQueue#lessThan(java.lang.Object, java.lang.Object) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
ScoreTerm	TokenNameIdentifier	 Score Term
termA	TokenNameIdentifier	 term A
,	TokenNameCOMMA	
ScoreTerm	TokenNameIdentifier	 Score Term
termB	TokenNameIdentifier	 term B
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
termA	TokenNameIdentifier	 term A
.	TokenNameDOT	
score	TokenNameIdentifier	 score
==	TokenNameEQUAL_EQUAL	
termB	TokenNameIdentifier	 term B
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
return	TokenNamereturn	
termA	TokenNameIdentifier	 term A
.	TokenNameDOT	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
termB	TokenNameIdentifier	 term B
.	TokenNameDOT	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
termA	TokenNameIdentifier	 term A
.	TokenNameDOT	
score	TokenNameIdentifier	 score
<	TokenNameLESS	
termB	TokenNameIdentifier	 term B
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//overrides basic TermQuery to negate effects of IDF (idf is factored into boost of containing BooleanQuery) 	TokenNameCOMMENT_LINE	overrides basic TermQuery to negate effects of IDF (idf is factored into boost of containing BooleanQuery) 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
FuzzyTermQuery	TokenNameIdentifier	 Fuzzy Term Query
extends	TokenNameextends	
TermQuery	TokenNameIdentifier	 Term Query
{	TokenNameLBRACE	
boolean	TokenNameboolean	
ignoreTF	TokenNameIdentifier	 ignore TF
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FuzzyTermQuery	TokenNameIdentifier	 Fuzzy Term Query
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreTF	TokenNameIdentifier	 ignore TF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ignoreTF	TokenNameIdentifier	 ignore TF
=	TokenNameEQUAL	
ignoreTF	TokenNameIdentifier	 ignore TF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Similarity	TokenNameIdentifier	 Similarity
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Similarity	TokenNameIdentifier	 Similarity
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
SimilarityDelegator	TokenNameIdentifier	 Similarity Delegator
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ignoreTF	TokenNameIdentifier	 ignore TF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//ignore tf 	TokenNameCOMMENT_LINE	ignore tf 
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
idf	TokenNameIdentifier	 idf
(	TokenNameLPAREN	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
,	TokenNameCOMMA	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//IDF is already factored into individual term boosts 	TokenNameCOMMENT_LINE	IDF is already factored into individual term boosts 
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.lucene.search.Query#toString(java.lang.String) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.search.Query#toString(java.lang.String) 
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
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isIgnoreTF	TokenNameIdentifier	 is Ignore TF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ignoreTF	TokenNameIdentifier	 ignore TF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setIgnoreTF	TokenNameIdentifier	 set Ignore TF
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignoreTF	TokenNameIdentifier	 ignore TF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ignoreTF	TokenNameIdentifier	 ignore TF
=	TokenNameEQUAL	
ignoreTF	TokenNameIdentifier	 ignore TF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
