/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
misc	TokenNameIdentifier	 misc
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
DefaultSimilarity	TokenNameIdentifier	 Default Similarity
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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
/** * A similarity with a lengthNorm that provides for a "plateau" of * equally good lengths, and tf helper functions. * * <p> * For lengthNorm, A global min/max can be specified to define the * plateau of lengths that should all have a norm of 1.0. * Below the min, and above the max the lengthNorm drops off in a * sqrt function. * </p> * <p> * A per field min/max can be specified if different fields have * different sweet spots. * </p> * * <p> * For tf, baselineTf and hyperbolicTf functions are provided, which * subclasses can choose between. * </p> * * @see <a href="doc-files/ss.gnuplot">A Gnuplot file used to generate some of the visualizations refrenced from each function.</a> */	TokenNameCOMMENT_JAVADOC	 A similarity with a lengthNorm that provides for a "plateau" of equally good lengths, and tf helper functions. * <p> For lengthNorm, A global min/max can be specified to define the plateau of lengths that should all have a norm of 1.0. Below the min, and above the max the lengthNorm drops off in a sqrt function. </p> <p> A per field min/max can be specified if different fields have different sweet spots. </p> * <p> For tf, baselineTf and hyperbolicTf functions are provided, which subclasses can choose between. </p> * @see <a href="doc-files/ss.gnuplot">A Gnuplot file used to generate some of the visualizations refrenced from each function.</a> 
public	TokenNamepublic	
class	TokenNameclass	
SweetSpotSimilarity	TokenNameIdentifier	 Sweet Spot Similarity
extends	TokenNameextends	
DefaultSimilarity	TokenNameIdentifier	 Default Similarity
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
ln_min	TokenNameIdentifier	 ln min
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
ln_max	TokenNameIdentifier	 ln max
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
ln_steep	TokenNameIdentifier	 ln steep
=	TokenNameEQUAL	
0.5f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Number	TokenNameIdentifier	 Number
>	TokenNameGREATER	
ln_maxs	TokenNameIdentifier	 ln maxs
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Number	TokenNameIdentifier	 Number
>	TokenNameGREATER	
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Number	TokenNameIdentifier	 Number
>	TokenNameGREATER	
ln_mins	TokenNameIdentifier	 ln mins
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Number	TokenNameIdentifier	 Number
>	TokenNameGREATER	
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
ln_steeps	TokenNameIdentifier	 ln steeps
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
>	TokenNameGREATER	
ln_overlaps	TokenNameIdentifier	 ln overlaps
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
>	TokenNameGREATER	
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
tf_base	TokenNameIdentifier	 tf base
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
tf_min	TokenNameIdentifier	 tf min
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
tf_hyper_min	TokenNameIdentifier	 tf hyper min
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
tf_hyper_max	TokenNameIdentifier	 tf hyper max
=	TokenNameEQUAL	
2.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
tf_hyper_base	TokenNameIdentifier	 tf hyper base
=	TokenNameEQUAL	
1.3d	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
tf_hyper_xoffset	TokenNameIdentifier	 tf hyper xoffset
=	TokenNameEQUAL	
10.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SweetSpotSimilarity	TokenNameIdentifier	 Sweet Spot Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the baseline and minimum function variables for baselineTf * * @see #baselineTf */	TokenNameCOMMENT_JAVADOC	 Sets the baseline and minimum function variables for baselineTf * @see #baselineTf 
public	TokenNamepublic	
void	TokenNamevoid	
setBaselineTfFactors	TokenNameIdentifier	 set Baseline Tf Factors
(	TokenNameLPAREN	
float	TokenNamefloat	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
float	TokenNamefloat	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tf_min	TokenNameIdentifier	 tf min
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
tf_base	TokenNameIdentifier	 tf base
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the function variables for the hyperbolicTf functions * * @param min the minimum tf value to ever be returned (default: 0.0) * @param max the maximum tf value to ever be returned (default: 2.0) * @param base the base value to be used in the exponential for the hyperbolic function (default: 1.3) * @param xoffset the midpoint of the hyperbolic function (default: 10.0) * @see #hyperbolicTf */	TokenNameCOMMENT_JAVADOC	 Sets the function variables for the hyperbolicTf functions * @param min the minimum tf value to ever be returned (default: 0.0) @param max the maximum tf value to ever be returned (default: 2.0) @param base the base value to be used in the exponential for the hyperbolic function (default: 1.3) @param xoffset the midpoint of the hyperbolic function (default: 10.0) @see #hyperbolicTf 
public	TokenNamepublic	
void	TokenNamevoid	
setHyperbolicTfFactors	TokenNameIdentifier	 set Hyperbolic Tf Factors
(	TokenNameLPAREN	
float	TokenNamefloat	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
float	TokenNamefloat	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
double	TokenNamedouble	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
float	TokenNamefloat	
xoffset	TokenNameIdentifier	 xoffset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tf_hyper_min	TokenNameIdentifier	 tf hyper min
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
tf_hyper_max	TokenNameIdentifier	 tf hyper max
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
tf_hyper_base	TokenNameIdentifier	 tf hyper base
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
tf_hyper_xoffset	TokenNameIdentifier	 tf hyper xoffset
=	TokenNameEQUAL	
xoffset	TokenNameIdentifier	 xoffset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the default function variables used by lengthNorm when no field * specific variables have been set. * * @see #lengthNorm */	TokenNameCOMMENT_JAVADOC	 Sets the default function variables used by lengthNorm when no field specific variables have been set. * @see #lengthNorm 
public	TokenNamepublic	
void	TokenNamevoid	
setLengthNormFactors	TokenNameIdentifier	 set Length Norm Factors
(	TokenNameLPAREN	
int	TokenNameint	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
int	TokenNameint	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
float	TokenNamefloat	
steepness	TokenNameIdentifier	 steepness
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ln_min	TokenNameIdentifier	 ln min
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ln_max	TokenNameIdentifier	 ln max
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ln_steep	TokenNameIdentifier	 ln steep
=	TokenNameEQUAL	
steepness	TokenNameIdentifier	 steepness
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the function variables used by lengthNorm for a specific named field. * * @param field field name * @param min minimum value * @param max maximum value * @param steepness steepness of the curve * @param discountOverlaps if true, <code>numOverlapTokens</code> will be * subtracted from <code>numTokens</code>; if false then * <code>numOverlapTokens</code> will be assumed to be 0 (see * {@link DefaultSimilarity#computeNorm(String, FieldInvertState)} for details). * * @see #lengthNorm */	TokenNameCOMMENT_JAVADOC	 Sets the function variables used by lengthNorm for a specific named field. * @param field field name @param min minimum value @param max maximum value @param steepness steepness of the curve @param discountOverlaps if true, <code>numOverlapTokens</code> will be subtracted from <code>numTokens</code>; if false then <code>numOverlapTokens</code> will be assumed to be 0 (see {@link DefaultSimilarity#computeNorm(String, FieldInvertState)} for details). * @see #lengthNorm 
public	TokenNamepublic	
void	TokenNamevoid	
setLengthNormFactors	TokenNameIdentifier	 set Length Norm Factors
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
int	TokenNameint	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
int	TokenNameint	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
float	TokenNamefloat	
steepness	TokenNameIdentifier	 steepness
,	TokenNameCOMMA	
boolean	TokenNameboolean	
discountOverlaps	TokenNameIdentifier	 discount Overlaps
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ln_mins	TokenNameIdentifier	 ln mins
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ln_maxs	TokenNameIdentifier	 ln maxs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ln_steeps	TokenNameIdentifier	 ln steeps
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
steepness	TokenNameIdentifier	 steepness
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ln_overlaps	TokenNameIdentifier	 ln overlaps
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
discountOverlaps	TokenNameIdentifier	 discount Overlaps
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implemented as <code> state.getBoost() * * lengthNorm(fieldName, numTokens) </code> where * numTokens does not count overlap tokens if * discountOverlaps is true by default or true for this * specific field. */	TokenNameCOMMENT_JAVADOC	 Implemented as <code> state.getBoost() * lengthNorm(fieldName, numTokens) </code> where numTokens does not count overlap tokens if discountOverlaps is true by default or true for this specific field. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
FieldInvertState	TokenNameIdentifier	 Field Invert State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
numTokens	TokenNameIdentifier	 num Tokens
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
overlaps	TokenNameIdentifier	 overlaps
=	TokenNameEQUAL	
discountOverlaps	TokenNameIdentifier	 discount Overlaps
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ln_overlaps	TokenNameIdentifier	 ln overlaps
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
overlaps	TokenNameIdentifier	 overlaps
=	TokenNameEQUAL	
ln_overlaps	TokenNameIdentifier	 ln overlaps
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
overlaps	TokenNameIdentifier	 overlaps
)	TokenNameRPAREN	
numTokens	TokenNameIdentifier	 num Tokens
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
numTokens	TokenNameIdentifier	 num Tokens
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
computeLengthNorm	TokenNameIdentifier	 compute Length Norm
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
numTokens	TokenNameIdentifier	 num Tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implemented as: * <code> * 1/sqrt( steepness * (abs(x-min) + abs(x-max) - (max-min)) + 1 ) * </code>. * * <p> * This degrades to <code>1/sqrt(x)</code> when min and max are both 1 and * steepness is 0.5 * </p> * * <p> * :TODO: potential optimization is to just flat out return 1.0f if numTerms * is between min and max. * </p> * * @see #setLengthNormFactors * @see <a href="doc-files/ss.computeLengthNorm.svg">An SVG visualization of this function</a> */	TokenNameCOMMENT_JAVADOC	 Implemented as: <code> 1/sqrt( steepness (abs(x-min) + abs(x-max) - (max-min)) + 1 ) </code>. * <p> This degrades to <code>1/sqrt(x)</code> when min and max are both 1 and steepness is 0.5 </p> * <p> :TODO: potential optimization is to just flat out return 1.0f if numTerms is between min and max. </p> * @see #setLengthNormFactors @see <a href="doc-files/ss.computeLengthNorm.svg">An SVG visualization of this function</a> 
public	TokenNamepublic	
float	TokenNamefloat	
computeLengthNorm	TokenNameIdentifier	 compute Length Norm
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
int	TokenNameint	
numTerms	TokenNameIdentifier	 num Terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
ln_min	TokenNameIdentifier	 ln min
;	TokenNameSEMICOLON	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
ln_max	TokenNameIdentifier	 ln max
;	TokenNameSEMICOLON	
float	TokenNamefloat	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
ln_steep	TokenNameIdentifier	 ln steep
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ln_mins	TokenNameIdentifier	 ln mins
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
ln_mins	TokenNameIdentifier	 ln mins
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ln_maxs	TokenNameIdentifier	 ln maxs
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
ln_maxs	TokenNameIdentifier	 ln maxs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ln_steeps	TokenNameIdentifier	 ln steeps
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
ln_steeps	TokenNameIdentifier	 ln steeps
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
1.0f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
numTerms	TokenNameIdentifier	 num Terms
-	TokenNameMINUS	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
numTerms	TokenNameIdentifier	 num Terms
-	TokenNameMINUS	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
-	TokenNameMINUS	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to baselineTf * * @see #baselineTf */	TokenNameCOMMENT_JAVADOC	 Delegates to baselineTf * @see #baselineTf 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
int	TokenNameint	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
baselineTf	TokenNameIdentifier	 baseline Tf
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implemented as: * <code> * (x &lt;= min) &#63; base : sqrt(x+(base**2)-min) * </code> * ...but with a special case check for 0. * <p> * This degrates to <code>sqrt(x)</code> when min and base are both 0 * </p> * * @see #setBaselineTfFactors * @see <a href="doc-files/ss.baselineTf.svg">An SVG visualization of this function</a> */	TokenNameCOMMENT_JAVADOC	 Implemented as: <code> (x &lt;= min) &#63; base : sqrt(x+(base**2)-min) </code> ...but with a special case check for 0. <p> This degrates to <code>sqrt(x)</code> when min and base are both 0 </p> * @see #setBaselineTfFactors @see <a href="doc-files/ss.baselineTf.svg">An SVG visualization of this function</a> 
public	TokenNamepublic	
float	TokenNamefloat	
baselineTf	TokenNameIdentifier	 baseline Tf
(	TokenNameLPAREN	
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
==	TokenNameEQUAL_EQUAL	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
return	TokenNamereturn	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
<=	TokenNameLESS_EQUAL	
tf_min	TokenNameIdentifier	 tf min
)	TokenNameRPAREN	
?	TokenNameQUESTION	
tf_base	TokenNameIdentifier	 tf base
:	TokenNameCOLON	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
+	TokenNamePLUS	
(	TokenNameLPAREN	
tf_base	TokenNameIdentifier	 tf base
*	TokenNameMULTIPLY	
tf_base	TokenNameIdentifier	 tf base
)	TokenNameRPAREN	
-	TokenNameMINUS	
tf_min	TokenNameIdentifier	 tf min
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Uses a hyperbolic tangent function that allows for a hard max... * * <code> * tf(x)=min+(max-min)/2*(((base**(x-xoffset)-base**-(x-xoffset))/(base**(x-xoffset)+base**-(x-xoffset)))+1) * </code> * * <p> * This code is provided as a convenience for subclasses that want * to use a hyperbolic tf function. * </p> * * @see #setHyperbolicTfFactors * @see <a href="doc-files/ss.hyperbolicTf.svg">An SVG visualization of this function</a> */	TokenNameCOMMENT_JAVADOC	 Uses a hyperbolic tangent function that allows for a hard max... * <code> tf(x)=min+(max-min)/2*(((base**(x-xoffset)-base**-(x-xoffset))/(base**(x-xoffset)+base**-(x-xoffset)))+1) </code> * <p> This code is provided as a convenience for subclasses that want to use a hyperbolic tf function. </p> * @see #setHyperbolicTfFactors @see <a href="doc-files/ss.hyperbolicTf.svg">An SVG visualization of this function</a> 
public	TokenNamepublic	
float	TokenNamefloat	
hyperbolicTf	TokenNameIdentifier	 hyperbolic Tf
(	TokenNameLPAREN	
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
==	TokenNameEQUAL_EQUAL	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
return	TokenNamereturn	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
tf_hyper_min	TokenNameIdentifier	 tf hyper min
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
tf_hyper_max	TokenNameIdentifier	 tf hyper max
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
tf_hyper_base	TokenNameIdentifier	 tf hyper base
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
xoffset	TokenNameIdentifier	 xoffset
=	TokenNameEQUAL	
tf_hyper_xoffset	TokenNameIdentifier	 tf hyper xoffset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
-	TokenNameMINUS	
xoffset	TokenNameIdentifier	 xoffset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
+	TokenNamePLUS	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
-	TokenNameMINUS	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2.0f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1.0d	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
?	TokenNameQUESTION	
max	TokenNameIdentifier	 max
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
