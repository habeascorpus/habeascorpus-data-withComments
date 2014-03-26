package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
IDFExplanation	TokenNameIdentifier	 IDF Explanation
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
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * Expert-only. Public for use by other weight implementations */	TokenNameCOMMENT_JAVADOC	 Expert-only. Public for use by other weight implementations 
public	TokenNamepublic	
class	TokenNameclass	
SpanWeight	TokenNameIdentifier	 Span Weight
extends	TokenNameextends	
Weight	TokenNameIdentifier	 Weight
{	TokenNameLBRACE	
protected	TokenNameprotected	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
idf	TokenNameIdentifier	 idf
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
queryNorm	TokenNameIdentifier	 query Norm
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
queryWeight	TokenNameIdentifier	 query Weight
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
SpanQuery	TokenNameIdentifier	 Span Query
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IDFExplanation	TokenNameIdentifier	 IDF Explanation
idfExp	TokenNameIdentifier	 idf Exp
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SpanWeight	TokenNameIdentifier	 Span Weight
(	TokenNameLPAREN	
SpanQuery	TokenNameIdentifier	 Span Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
similarity	TokenNameIdentifier	 similarity
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
extractTerms	TokenNameIdentifier	 extract Terms
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idfExp	TokenNameIdentifier	 idf Exp
=	TokenNameEQUAL	
similarity	TokenNameIdentifier	 similarity
.	TokenNameDOT	
idfExplain	TokenNameIdentifier	 idf Explain
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idf	TokenNameIdentifier	 idf
=	TokenNameEQUAL	
idfExp	TokenNameIdentifier	 idf Exp
.	TokenNameDOT	
getIdf	TokenNameIdentifier	 get Idf
(	TokenNameLPAREN	
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
query	TokenNameIdentifier	 query
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
value	TokenNameIdentifier	 value
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
queryWeight	TokenNameIdentifier	 query Weight
=	TokenNameEQUAL	
idf	TokenNameIdentifier	 idf
*	TokenNameMULTIPLY	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// compute query weight 	TokenNameCOMMENT_LINE	compute query weight 
return	TokenNamereturn	
queryWeight	TokenNameIdentifier	 query Weight
*	TokenNameMULTIPLY	
queryWeight	TokenNameIdentifier	 query Weight
;	TokenNameSEMICOLON	
// square it 	TokenNameCOMMENT_LINE	square it 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
float	TokenNamefloat	
queryNorm	TokenNameIdentifier	 query Norm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
queryNorm	TokenNameIdentifier	 query Norm
=	TokenNameEQUAL	
queryNorm	TokenNameIdentifier	 query Norm
;	TokenNameSEMICOLON	
queryWeight	TokenNameIdentifier	 query Weight
*=	TokenNameMULTIPLY_EQUAL	
queryNorm	TokenNameIdentifier	 query Norm
;	TokenNameSEMICOLON	
// normalize query weight 	TokenNameCOMMENT_LINE	normalize query weight 
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
queryWeight	TokenNameIdentifier	 query Weight
*	TokenNameMULTIPLY	
idf	TokenNameIdentifier	 idf
;	TokenNameSEMICOLON	
// idf for document 	TokenNameCOMMENT_LINE	idf for document 
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
if	TokenNameif	
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SpanScorer	TokenNameIdentifier	 Span Scorer
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getSpans	TokenNameIdentifier	 get Spans
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
ComplexExplanation	TokenNameIdentifier	 Complex Explanation
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ComplexExplanation	TokenNameIdentifier	 Complex Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
"weight("	TokenNameStringLiteral	weight(
+	TokenNamePLUS	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" in "	TokenNameStringLiteral	 in 
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
"), product of:"	TokenNameStringLiteral	), product of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SpanQuery	TokenNameIdentifier	 Span Query
)	TokenNameRPAREN	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
idfExpl	TokenNameIdentifier	 idf Expl
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
idf	TokenNameIdentifier	 idf
,	TokenNameCOMMA	
"idf("	TokenNameStringLiteral	idf(
+	TokenNamePLUS	
field	TokenNameIdentifier	 field
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
idfExp	TokenNameIdentifier	 idf Exp
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// explain query weight 	TokenNameCOMMENT_LINE	explain query weight 
Explanation	TokenNameIdentifier	 Explanation
queryExpl	TokenNameIdentifier	 query Expl
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryExpl	TokenNameIdentifier	 query Expl
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
"queryWeight("	TokenNameStringLiteral	queryWeight(
+	TokenNamePLUS	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"), product of:"	TokenNameStringLiteral	), product of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
boostExpl	TokenNameIdentifier	 boost Expl
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"boost"	TokenNameStringLiteral	boost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
queryExpl	TokenNameIdentifier	 query Expl
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
boostExpl	TokenNameIdentifier	 boost Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryExpl	TokenNameIdentifier	 query Expl
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
idfExpl	TokenNameIdentifier	 idf Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
queryNormExpl	TokenNameIdentifier	 query Norm Expl
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
queryNorm	TokenNameIdentifier	 query Norm
,	TokenNameCOMMA	
"queryNorm"	TokenNameStringLiteral	queryNorm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryExpl	TokenNameIdentifier	 query Expl
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
queryNormExpl	TokenNameIdentifier	 query Norm Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryExpl	TokenNameIdentifier	 query Expl
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
boostExpl	TokenNameIdentifier	 boost Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
idfExpl	TokenNameIdentifier	 idf Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
queryNormExpl	TokenNameIdentifier	 query Norm Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
queryExpl	TokenNameIdentifier	 query Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// explain field weight 	TokenNameCOMMENT_LINE	explain field weight 
ComplexExplanation	TokenNameIdentifier	 Complex Explanation
fieldExpl	TokenNameIdentifier	 field Expl
=	TokenNameEQUAL	
new	TokenNamenew	
ComplexExplanation	TokenNameIdentifier	 Complex Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldExpl	TokenNameIdentifier	 field Expl
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
"fieldWeight("	TokenNameStringLiteral	fieldWeight(
+	TokenNamePLUS	
field	TokenNameIdentifier	 field
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
+	TokenNamePLUS	
" in "	TokenNameStringLiteral	 in 
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
"), product of:"	TokenNameStringLiteral	), product of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
tfExpl	TokenNameIdentifier	 tf Expl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SpanScorer	TokenNameIdentifier	 Span Scorer
)	TokenNameRPAREN	
scorer	TokenNameIdentifier	 scorer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldExpl	TokenNameIdentifier	 field Expl
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
tfExpl	TokenNameIdentifier	 tf Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldExpl	TokenNameIdentifier	 field Expl
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
idfExpl	TokenNameIdentifier	 idf Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
fieldNormExpl	TokenNameIdentifier	 field Norm Expl
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fieldNorms	TokenNameIdentifier	 field Norms
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
fieldNorm	TokenNameIdentifier	 field Norm
=	TokenNameEQUAL	
fieldNorms	TokenNameIdentifier	 field Norms
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
similarity	TokenNameIdentifier	 similarity
.	TokenNameDOT	
decodeNormValue	TokenNameIdentifier	 decode Norm Value
(	TokenNameLPAREN	
fieldNorms	TokenNameIdentifier	 field Norms
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
:	TokenNameCOLON	
1.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
fieldNormExpl	TokenNameIdentifier	 field Norm Expl
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
fieldNorm	TokenNameIdentifier	 field Norm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldNormExpl	TokenNameIdentifier	 field Norm Expl
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
"fieldNorm(field="	TokenNameStringLiteral	fieldNorm(field=
+	TokenNamePLUS	
field	TokenNameIdentifier	 field
+	TokenNamePLUS	
", doc="	TokenNameStringLiteral	, doc=
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldExpl	TokenNameIdentifier	 field Expl
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
fieldNormExpl	TokenNameIdentifier	 field Norm Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldExpl	TokenNameIdentifier	 field Expl
.	TokenNameDOT	
setMatch	TokenNameIdentifier	 set Match
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
tfExpl	TokenNameIdentifier	 tf Expl
.	TokenNameDOT	
isMatch	TokenNameIdentifier	 is Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldExpl	TokenNameIdentifier	 field Expl
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
tfExpl	TokenNameIdentifier	 tf Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
idfExpl	TokenNameIdentifier	 idf Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
fieldNormExpl	TokenNameIdentifier	 field Norm Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
fieldExpl	TokenNameIdentifier	 field Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setMatch	TokenNameIdentifier	 set Match
(	TokenNameLPAREN	
fieldExpl	TokenNameIdentifier	 field Expl
.	TokenNameDOT	
getMatch	TokenNameIdentifier	 get Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// combine them 	TokenNameCOMMENT_LINE	combine them 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
queryExpl	TokenNameIdentifier	 query Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
fieldExpl	TokenNameIdentifier	 field Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queryExpl	TokenNameIdentifier	 query Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
fieldExpl	TokenNameIdentifier	 field Expl
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
