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
FieldCache	TokenNameIdentifier	 Field Cache
;	TokenNameSEMICOLON	
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
/** * An instance of this subclass should be returned by * {@link CustomScoreQuery#getCustomScoreProvider}, if you want * to modify the custom score calculation of a {@link CustomScoreQuery}. * <p>Since Lucene 2.9, queries operate on each segment of an index separately, * so the protected {@link #reader} field can be used to resolve doc IDs, * as the supplied <code>doc</code> ID is per-segment and without knowledge * of the IndexReader you cannot access the document or {@link FieldCache}. * * @lucene.experimental * @since 2.9.2 */	TokenNameCOMMENT_JAVADOC	 An instance of this subclass should be returned by {@link CustomScoreQuery#getCustomScoreProvider}, if you want to modify the custom score calculation of a {@link CustomScoreQuery}. <p>Since Lucene 2.9, queries operate on each segment of an index separately, so the protected {@link #reader} field can be used to resolve doc IDs, as the supplied <code>doc</code> ID is per-segment and without knowledge of the IndexReader you cannot access the document or {@link FieldCache}. * @lucene.experimental @since 2.9.2 
public	TokenNamepublic	
class	TokenNameclass	
CustomScoreProvider	TokenNameIdentifier	 Custom Score Provider
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
/** * Creates a new instance of the provider class for the given {@link IndexReader}. */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of the provider class for the given {@link IndexReader}. 
public	TokenNamepublic	
CustomScoreProvider	TokenNameIdentifier	 Custom Score Provider
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compute a custom score by the subQuery score and a number of * {@link ValueSourceQuery} scores. * <p> * Subclasses can override this method to modify the custom score. * <p> * If your custom scoring is different than the default herein you * should override at least one of the two customScore() methods. * If the number of ValueSourceQueries is always &lt; 2 it is * sufficient to override the other * {@link #customScore(int, float, float) customScore()} * method, which is simpler. * <p> * The default computation herein is a multiplication of given scores: * <pre> * ModifiedScore = valSrcScore * valSrcScores[0] * valSrcScores[1] * ... * </pre> * * @param doc id of scored doc. * @param subQueryScore score of that doc by the subQuery. * @param valSrcScores scores of that doc by the ValueSourceQuery. * @return custom score. */	TokenNameCOMMENT_JAVADOC	 Compute a custom score by the subQuery score and a number of {@link ValueSourceQuery} scores. <p> Subclasses can override this method to modify the custom score. <p> If your custom scoring is different than the default herein you should override at least one of the two customScore() methods. If the number of ValueSourceQueries is always &lt; 2 it is sufficient to override the other {@link #customScore(int, float, float) customScore()} method, which is simpler. <p> The default computation herein is a multiplication of given scores: <pre> ModifiedScore = valSrcScore valSrcScores[0] valSrcScores[1] ... </pre> * @param doc id of scored doc. @param subQueryScore score of that doc by the subQuery. @param valSrcScores scores of that doc by the ValueSourceQuery. @return custom score. 
public	TokenNamepublic	
float	TokenNamefloat	
customScore	TokenNameIdentifier	 custom Score
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
subQueryScore	TokenNameIdentifier	 sub Query Score
,	TokenNameCOMMA	
float	TokenNamefloat	
valSrcScores	TokenNameIdentifier	 val Src Scores
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
valSrcScores	TokenNameIdentifier	 val Src Scores
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
customScore	TokenNameIdentifier	 custom Score
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
subQueryScore	TokenNameIdentifier	 sub Query Score
,	TokenNameCOMMA	
valSrcScores	TokenNameIdentifier	 val Src Scores
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
valSrcScores	TokenNameIdentifier	 val Src Scores
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
customScore	TokenNameIdentifier	 custom Score
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
subQueryScore	TokenNameIdentifier	 sub Query Score
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
subQueryScore	TokenNameIdentifier	 sub Query Score
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
valSrcScores	TokenNameIdentifier	 val Src Scores
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
score	TokenNameIdentifier	 score
*=	TokenNameMULTIPLY_EQUAL	
valSrcScores	TokenNameIdentifier	 val Src Scores
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compute a custom score by the subQuery score and the ValueSourceQuery score. * <p> * Subclasses can override this method to modify the custom score. * <p> * If your custom scoring is different than the default herein you * should override at least one of the two customScore() methods. * If the number of ValueSourceQueries is always &lt; 2 it is * sufficient to override this customScore() method, which is simpler. * <p> * The default computation herein is a multiplication of the two scores: * <pre> * ModifiedScore = subQueryScore * valSrcScore * </pre> * * @param doc id of scored doc. * @param subQueryScore score of that doc by the subQuery. * @param valSrcScore score of that doc by the ValueSourceQuery. * @return custom score. */	TokenNameCOMMENT_JAVADOC	 Compute a custom score by the subQuery score and the ValueSourceQuery score. <p> Subclasses can override this method to modify the custom score. <p> If your custom scoring is different than the default herein you should override at least one of the two customScore() methods. If the number of ValueSourceQueries is always &lt; 2 it is sufficient to override this customScore() method, which is simpler. <p> The default computation herein is a multiplication of the two scores: <pre> ModifiedScore = subQueryScore valSrcScore </pre> * @param doc id of scored doc. @param subQueryScore score of that doc by the subQuery. @param valSrcScore score of that doc by the ValueSourceQuery. @return custom score. 
public	TokenNamepublic	
float	TokenNamefloat	
customScore	TokenNameIdentifier	 custom Score
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
subQueryScore	TokenNameIdentifier	 sub Query Score
,	TokenNameCOMMA	
float	TokenNamefloat	
valSrcScore	TokenNameIdentifier	 val Src Score
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
subQueryScore	TokenNameIdentifier	 sub Query Score
*	TokenNameMULTIPLY	
valSrcScore	TokenNameIdentifier	 val Src Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Explain the custom score. * Whenever overriding {@link #customScore(int, float, float[])}, * this method should also be overridden to provide the correct explanation * for the part of the custom scoring. * * @param doc doc being explained. * @param subQueryExpl explanation for the sub-query part. * @param valSrcExpls explanation for the value source part. * @return an explanation for the custom score */	TokenNameCOMMENT_JAVADOC	 Explain the custom score. Whenever overriding {@link #customScore(int, float, float[])}, this method should also be overridden to provide the correct explanation for the part of the custom scoring. * @param doc doc being explained. @param subQueryExpl explanation for the sub-query part. @param valSrcExpls explanation for the value source part. @return an explanation for the custom score 
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
customExplain	TokenNameIdentifier	 custom Explain
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
Explanation	TokenNameIdentifier	 Explanation
subQueryExpl	TokenNameIdentifier	 sub Query Expl
,	TokenNameCOMMA	
Explanation	TokenNameIdentifier	 Explanation
valSrcExpls	TokenNameIdentifier	 val Src Expls
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
valSrcExpls	TokenNameIdentifier	 val Src Expls
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
customExplain	TokenNameIdentifier	 custom Explain
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
subQueryExpl	TokenNameIdentifier	 sub Query Expl
,	TokenNameCOMMA	
valSrcExpls	TokenNameIdentifier	 val Src Expls
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
valSrcExpls	TokenNameIdentifier	 val Src Expls
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subQueryExpl	TokenNameIdentifier	 sub Query Expl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
valSrcScore	TokenNameIdentifier	 val Src Score
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
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
valSrcExpls	TokenNameIdentifier	 val Src Expls
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
valSrcScore	TokenNameIdentifier	 val Src Score
*=	TokenNameMULTIPLY_EQUAL	
valSrcExpls	TokenNameIdentifier	 val Src Expls
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Explanation	TokenNameIdentifier	 Explanation
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
valSrcScore	TokenNameIdentifier	 val Src Score
*	TokenNameMULTIPLY	
subQueryExpl	TokenNameIdentifier	 sub Query Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"custom score: product of:"	TokenNameStringLiteral	custom score: product of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
subQueryExpl	TokenNameIdentifier	 sub Query Expl
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
valSrcExpls	TokenNameIdentifier	 val Src Expls
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
valSrcExpls	TokenNameIdentifier	 val Src Expls
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Explain the custom score. * Whenever overriding {@link #customScore(int, float, float)}, * this method should also be overridden to provide the correct explanation * for the part of the custom scoring. * * @param doc doc being explained. * @param subQueryExpl explanation for the sub-query part. * @param valSrcExpl explanation for the value source part. * @return an explanation for the custom score */	TokenNameCOMMENT_JAVADOC	 Explain the custom score. Whenever overriding {@link #customScore(int, float, float)}, this method should also be overridden to provide the correct explanation for the part of the custom scoring. * @param doc doc being explained. @param subQueryExpl explanation for the sub-query part. @param valSrcExpl explanation for the value source part. @return an explanation for the custom score 
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
customExplain	TokenNameIdentifier	 custom Explain
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
Explanation	TokenNameIdentifier	 Explanation
subQueryExpl	TokenNameIdentifier	 sub Query Expl
,	TokenNameCOMMA	
Explanation	TokenNameIdentifier	 Explanation
valSrcExpl	TokenNameIdentifier	 val Src Expl
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
float	TokenNamefloat	
valSrcScore	TokenNameIdentifier	 val Src Score
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
valSrcExpl	TokenNameIdentifier	 val Src Expl
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
valSrcScore	TokenNameIdentifier	 val Src Score
*=	TokenNameMULTIPLY_EQUAL	
valSrcExpl	TokenNameIdentifier	 val Src Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Explanation	TokenNameIdentifier	 Explanation
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
valSrcScore	TokenNameIdentifier	 val Src Score
*	TokenNameMULTIPLY	
subQueryExpl	TokenNameIdentifier	 sub Query Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"custom score: product of:"	TokenNameStringLiteral	custom score: product of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
subQueryExpl	TokenNameIdentifier	 sub Query Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
valSrcExpl	TokenNameIdentifier	 val Src Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
