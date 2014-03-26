package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
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
FieldInvertState	TokenNameIdentifier	 Field Invert State
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** Expert: Default scoring implementation. */	TokenNameCOMMENT_JAVADOC	 Expert: Default scoring implementation. 
public	TokenNamepublic	
class	TokenNameclass	
DefaultSimilarity	TokenNameIdentifier	 Default Similarity
extends	TokenNameextends	
Similarity	TokenNameIdentifier	 Similarity
{	TokenNameLBRACE	
/** Implemented as * <code>state.getBoost()*lengthNorm(numTerms)</code>, where * <code>numTerms</code> is {@link FieldInvertState#getLength()} if {@link * #setDiscountOverlaps} is false, else it's {@link * FieldInvertState#getLength()} - {@link * FieldInvertState#getNumOverlap()}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Implemented as <code>state.getBoost()*lengthNorm(numTerms)</code>, where <code>numTerms</code> is {@link FieldInvertState#getLength()} if {@link #setDiscountOverlaps} is false, else it's {@link FieldInvertState#getLength()} - {@link FieldInvertState#getNumOverlap()}. * @lucene.experimental 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldInvertState	TokenNameIdentifier	 Field Invert State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
numTerms	TokenNameIdentifier	 num Terms
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
discountOverlaps	TokenNameIdentifier	 discount Overlaps
)	TokenNameRPAREN	
numTerms	TokenNameIdentifier	 num Terms
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getNumOverlap	TokenNameIdentifier	 get Num Overlap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
numTerms	TokenNameIdentifier	 num Terms
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
numTerms	TokenNameIdentifier	 num Terms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Implemented as <code>1/sqrt(sumOfSquaredWeights)</code>. */	TokenNameCOMMENT_JAVADOC	 Implemented as <code>1/sqrt(sumOfSquaredWeights)</code>. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
queryNorm	TokenNameIdentifier	 query Norm
(	TokenNameLPAREN	
float	TokenNamefloat	
sumOfSquaredWeights	TokenNameIdentifier	 sum Of Squared Weights
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
sumOfSquaredWeights	TokenNameIdentifier	 sum Of Squared Weights
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Implemented as <code>sqrt(freq)</code>. */	TokenNameCOMMENT_JAVADOC	 Implemented as <code>sqrt(freq)</code>. 
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
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Implemented as <code>1 / (distance + 1)</code>. */	TokenNameCOMMENT_JAVADOC	 Implemented as <code>1 / (distance + 1)</code>. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
sloppyFreq	TokenNameIdentifier	 sloppy Freq
(	TokenNameLPAREN	
int	TokenNameint	
distance	TokenNameIdentifier	 distance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1.0f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
distance	TokenNameIdentifier	 distance
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Implemented as <code>log(numDocs/(docFreq+1)) + 1</code>. */	TokenNameCOMMENT_JAVADOC	 Implemented as <code>log(numDocs/(docFreq+1)) + 1</code>. 
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
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
numDocs	TokenNameIdentifier	 num Docs
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
docFreq	TokenNameIdentifier	 doc Freq
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Implemented as <code>overlap / maxOverlap</code>. */	TokenNameCOMMENT_JAVADOC	 Implemented as <code>overlap / maxOverlap</code>. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
return	TokenNamereturn	
overlap	TokenNameIdentifier	 overlap
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
maxOverlap	TokenNameIdentifier	 max Overlap
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Default true 	TokenNameCOMMENT_LINE	Default true 
protected	TokenNameprotected	
boolean	TokenNameboolean	
discountOverlaps	TokenNameIdentifier	 discount Overlaps
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** Determines whether overlap tokens (Tokens with * 0 position increment) are ignored when computing * norm. By default this is true, meaning overlap * tokens do not count when computing norms. * * @lucene.experimental * * @see #computeNorm */	TokenNameCOMMENT_JAVADOC	 Determines whether overlap tokens (Tokens with 0 position increment) are ignored when computing norm. By default this is true, meaning overlap tokens do not count when computing norms. * @lucene.experimental * @see #computeNorm 
public	TokenNamepublic	
void	TokenNamevoid	
setDiscountOverlaps	TokenNameIdentifier	 set Discount Overlaps
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
discountOverlaps	TokenNameIdentifier	 discount Overlaps
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #setDiscountOverlaps */	TokenNameCOMMENT_JAVADOC	 @see #setDiscountOverlaps 
public	TokenNamepublic	
boolean	TokenNameboolean	
getDiscountOverlaps	TokenNameIdentifier	 get Discount Overlaps
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
discountOverlaps	TokenNameIdentifier	 discount Overlaps
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
