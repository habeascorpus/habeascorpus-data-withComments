/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
AnimationTarget	TokenNameIdentifier	 Animation Target
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGLength	TokenNameIdentifier	 SVG Length
;	TokenNameSEMICOLON	
/** * An SVG length list value in the animation system. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AnimatableLengthListValue.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An SVG length list value in the animation system. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AnimatableLengthListValue.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AnimatableLengthListValue	TokenNameIdentifier	 Animatable Length List Value
extends	TokenNameextends	
AnimatableValue	TokenNameIdentifier	 Animatable Value
{	TokenNameLBRACE	
/** * The length types. */	TokenNameCOMMENT_JAVADOC	 The length types. 
protected	TokenNameprotected	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lengthTypes	TokenNameIdentifier	 length Types
;	TokenNameSEMICOLON	
/** * The length values. These should be one of the constants defined in * {@link SVGLength}. */	TokenNameCOMMENT_JAVADOC	 The length values. These should be one of the constants defined in {@link SVGLength}. 
protected	TokenNameprotected	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lengthValues	TokenNameIdentifier	 length Values
;	TokenNameSEMICOLON	
/** * How to interpret percentage values. These should be one of the * {@link AnimationTarget}.PERCENTAGE_* constants. */	TokenNameCOMMENT_JAVADOC	 How to interpret percentage values. These should be one of the {@link AnimationTarget}.PERCENTAGE_* constants. 
protected	TokenNameprotected	
short	TokenNameshort	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
;	TokenNameSEMICOLON	
/** * Creates a new, uninitialized AnimatableLengthListValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new, uninitialized AnimatableLengthListValue. 
protected	TokenNameprotected	
AnimatableLengthListValue	TokenNameIdentifier	 Animatable Length List Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AnimatableLengthListValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatableLengthListValue. 
public	TokenNamepublic	
AnimatableLengthListValue	TokenNameIdentifier	 Animatable Length List Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
,	TokenNameCOMMA	
short	TokenNameshort	
pcInterp	TokenNameIdentifier	 pc Interp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lengthTypes	TokenNameIdentifier	 length Types
=	TokenNameEQUAL	
types	TokenNameIdentifier	 types
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lengthValues	TokenNameIdentifier	 length Values
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
=	TokenNameEQUAL	
pcInterp	TokenNameIdentifier	 pc Interp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs interpolation to the given value. */	TokenNameCOMMENT_JAVADOC	 Performs interpolation to the given value. 
public	TokenNamepublic	
AnimatableValue	TokenNameIdentifier	 Animatable Value
interpolate	TokenNameIdentifier	 interpolate
(	TokenNameLPAREN	
AnimatableValue	TokenNameIdentifier	 Animatable Value
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
AnimatableValue	TokenNameIdentifier	 Animatable Value
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
float	TokenNamefloat	
interpolation	TokenNameIdentifier	 interpolation
,	TokenNameCOMMA	
AnimatableValue	TokenNameIdentifier	 Animatable Value
accumulation	TokenNameIdentifier	 accumulation
,	TokenNameCOMMA	
int	TokenNameint	
multiplier	TokenNameIdentifier	 multiplier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatableLengthListValue	TokenNameIdentifier	 Animatable Length List Value
toLengthList	TokenNameIdentifier	 to Length List
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableLengthListValue	TokenNameIdentifier	 Animatable Length List Value
)	TokenNameRPAREN	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
AnimatableLengthListValue	TokenNameIdentifier	 Animatable Length List Value
accLengthList	TokenNameIdentifier	 acc Length List
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableLengthListValue	TokenNameIdentifier	 Animatable Length List Value
)	TokenNameRPAREN	
accumulation	TokenNameIdentifier	 accumulation
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasTo	TokenNameIdentifier	 has To
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasAcc	TokenNameIdentifier	 has Acc
=	TokenNameEQUAL	
accumulation	TokenNameIdentifier	 accumulation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
canInterpolate	TokenNameIdentifier	 can Interpolate
=	TokenNameEQUAL	
!	TokenNameNOT	
(	TokenNameLPAREN	
hasTo	TokenNameIdentifier	 has To
&&	TokenNameAND_AND	
toLengthList	TokenNameIdentifier	 to Length List
.	TokenNameDOT	
lengthTypes	TokenNameIdentifier	 length Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
lengthTypes	TokenNameIdentifier	 length Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
hasAcc	TokenNameIdentifier	 has Acc
&&	TokenNameAND_AND	
accLengthList	TokenNameIdentifier	 acc Length List
.	TokenNameDOT	
lengthTypes	TokenNameIdentifier	 length Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
lengthTypes	TokenNameIdentifier	 length Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
baseLengthTypes	TokenNameIdentifier	 base Length Types
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
baseLengthValues	TokenNameIdentifier	 base Length Values
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
canInterpolate	TokenNameIdentifier	 can Interpolate
&&	TokenNameAND_AND	
hasTo	TokenNameIdentifier	 has To
&&	TokenNameAND_AND	
interpolation	TokenNameIdentifier	 interpolation
>=	TokenNameGREATER_EQUAL	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseLengthTypes	TokenNameIdentifier	 base Length Types
=	TokenNameEQUAL	
toLengthList	TokenNameIdentifier	 to Length List
.	TokenNameDOT	
lengthTypes	TokenNameIdentifier	 length Types
;	TokenNameSEMICOLON	
baseLengthValues	TokenNameIdentifier	 base Length Values
=	TokenNameEQUAL	
toLengthList	TokenNameIdentifier	 to Length List
.	TokenNameDOT	
lengthValues	TokenNameIdentifier	 length Values
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
baseLengthTypes	TokenNameIdentifier	 base Length Types
=	TokenNameEQUAL	
lengthTypes	TokenNameIdentifier	 length Types
;	TokenNameSEMICOLON	
baseLengthValues	TokenNameIdentifier	 base Length Values
=	TokenNameEQUAL	
lengthValues	TokenNameIdentifier	 length Values
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
baseLengthTypes	TokenNameIdentifier	 base Length Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
AnimatableLengthListValue	TokenNameIdentifier	 Animatable Length List Value
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatableLengthListValue	TokenNameIdentifier	 Animatable Length List Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
lengthTypes	TokenNameIdentifier	 length Types
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
lengthValues	TokenNameIdentifier	 length Values
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableLengthListValue	TokenNameIdentifier	 Animatable Length List Value
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
lengthTypes	TokenNameIdentifier	 length Types
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
lengthTypes	TokenNameIdentifier	 length Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
lengthTypes	TokenNameIdentifier	 length Types
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
lengthValues	TokenNameIdentifier	 length Values
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
hasChanged	TokenNameIdentifier	 has Changed
=	TokenNameEQUAL	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
!=	TokenNameNOT_EQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
=	TokenNameEQUAL	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
toV	TokenNameIdentifier	 to V
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
accV	TokenNameIdentifier	 acc V
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
newLengthType	TokenNameIdentifier	 new Length Type
=	TokenNameEQUAL	
baseLengthTypes	TokenNameIdentifier	 base Length Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
newLengthValue	TokenNameIdentifier	 new Length Value
=	TokenNameEQUAL	
baseLengthValues	TokenNameIdentifier	 base Length Values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
canInterpolate	TokenNameIdentifier	 can Interpolate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasTo	TokenNameIdentifier	 has To
&&	TokenNameAND_AND	
!	TokenNameNOT	
AnimatableLengthValue	TokenNameIdentifier	 Animatable Length Value
.	TokenNameDOT	
compatibleTypes	TokenNameIdentifier	 compatible Types
(	TokenNameLPAREN	
newLengthType	TokenNameIdentifier	 new Length Type
,	TokenNameCOMMA	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
,	TokenNameCOMMA	
toLengthList	TokenNameIdentifier	 to Length List
.	TokenNameDOT	
lengthTypes	TokenNameIdentifier	 length Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
toLengthList	TokenNameIdentifier	 to Length List
.	TokenNameDOT	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
)	TokenNameRPAREN	
||	TokenNameOR_OR	
hasAcc	TokenNameIdentifier	 has Acc
&&	TokenNameAND_AND	
!	TokenNameNOT	
AnimatableLengthValue	TokenNameIdentifier	 Animatable Length Value
.	TokenNameDOT	
compatibleTypes	TokenNameIdentifier	 compatible Types
(	TokenNameLPAREN	
newLengthType	TokenNameIdentifier	 new Length Type
,	TokenNameCOMMA	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
,	TokenNameCOMMA	
accLengthList	TokenNameIdentifier	 acc Length List
.	TokenNameDOT	
lengthTypes	TokenNameIdentifier	 length Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
accLengthList	TokenNameIdentifier	 acc Length List
.	TokenNameDOT	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newLengthValue	TokenNameIdentifier	 new Length Value
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
svgToUserSpace	TokenNameIdentifier	 svg To User Space
(	TokenNameLPAREN	
newLengthValue	TokenNameIdentifier	 new Length Value
,	TokenNameCOMMA	
newLengthType	TokenNameIdentifier	 new Length Type
,	TokenNameCOMMA	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newLengthType	TokenNameIdentifier	 new Length Type
=	TokenNameEQUAL	
SVGLength	TokenNameIdentifier	 SVG Length
.	TokenNameDOT	
SVG_LENGTHTYPE_NUMBER	TokenNameIdentifier	 SVG  LENGTHTYPE  NUMBER
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasTo	TokenNameIdentifier	 has To
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toV	TokenNameIdentifier	 to V
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
svgToUserSpace	TokenNameIdentifier	 svg To User Space
(	TokenNameLPAREN	
toLengthList	TokenNameIdentifier	 to Length List
.	TokenNameDOT	
lengthValues	TokenNameIdentifier	 length Values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
toLengthList	TokenNameIdentifier	 to Length List
.	TokenNameDOT	
lengthTypes	TokenNameIdentifier	 length Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
toLengthList	TokenNameIdentifier	 to Length List
.	TokenNameDOT	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasAcc	TokenNameIdentifier	 has Acc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
accV	TokenNameIdentifier	 acc V
=	TokenNameEQUAL	
accumulation	TokenNameIdentifier	 accumulation
.	TokenNameDOT	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
svgToUserSpace	TokenNameIdentifier	 svg To User Space
(	TokenNameLPAREN	
accLengthList	TokenNameIdentifier	 acc Length List
.	TokenNameDOT	
lengthValues	TokenNameIdentifier	 length Values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
accLengthList	TokenNameIdentifier	 acc Length List
.	TokenNameDOT	
lengthTypes	TokenNameIdentifier	 length Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
accLengthList	TokenNameIdentifier	 acc Length List
.	TokenNameDOT	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasTo	TokenNameIdentifier	 has To
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toV	TokenNameIdentifier	 to V
=	TokenNameEQUAL	
toLengthList	TokenNameIdentifier	 to Length List
.	TokenNameDOT	
lengthValues	TokenNameIdentifier	 length Values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasAcc	TokenNameIdentifier	 has Acc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
accV	TokenNameIdentifier	 acc V
=	TokenNameEQUAL	
accLengthList	TokenNameIdentifier	 acc Length List
.	TokenNameDOT	
lengthValues	TokenNameIdentifier	 length Values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
newLengthValue	TokenNameIdentifier	 new Length Value
+=	TokenNamePLUS_EQUAL	
interpolation	TokenNameIdentifier	 interpolation
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
toV	TokenNameIdentifier	 to V
-	TokenNameMINUS	
newLengthValue	TokenNameIdentifier	 new Length Value
)	TokenNameRPAREN	
+	TokenNamePLUS	
multiplier	TokenNameIdentifier	 multiplier
*	TokenNameMULTIPLY	
accV	TokenNameIdentifier	 acc V
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
hasChanged	TokenNameIdentifier	 has Changed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
hasChanged	TokenNameIdentifier	 has Changed
=	TokenNameEQUAL	
newLengthType	TokenNameIdentifier	 new Length Type
!=	TokenNameNOT_EQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
lengthTypes	TokenNameIdentifier	 length Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
||	TokenNameOR_OR	
newLengthValue	TokenNameIdentifier	 new Length Value
!=	TokenNameNOT_EQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
lengthValues	TokenNameIdentifier	 length Values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
lengthTypes	TokenNameIdentifier	 length Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newLengthType	TokenNameIdentifier	 new Length Type
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
lengthValues	TokenNameIdentifier	 length Values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newLengthValue	TokenNameIdentifier	 new Length Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the length types. */	TokenNameCOMMENT_JAVADOC	 Gets the length types. 
public	TokenNamepublic	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLengthTypes	TokenNameIdentifier	 get Length Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lengthTypes	TokenNameIdentifier	 length Types
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the length values. */	TokenNameCOMMENT_JAVADOC	 Gets the length values. 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLengthValues	TokenNameIdentifier	 get Length Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lengthValues	TokenNameIdentifier	 length Values
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether two values of this type can have their distance * computed, as needed by paced animation. */	TokenNameCOMMENT_JAVADOC	 Returns whether two values of this type can have their distance computed, as needed by paced animation. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canPace	TokenNameIdentifier	 can Pace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the absolute distance between this value and the specified other * value. */	TokenNameCOMMENT_JAVADOC	 Returns the absolute distance between this value and the specified other value. 
public	TokenNamepublic	
float	TokenNamefloat	
distanceTo	TokenNameIdentifier	 distance To
(	TokenNameLPAREN	
AnimatableValue	TokenNameIdentifier	 Animatable Value
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a zero value of this AnimatableValue's type. */	TokenNameCOMMENT_JAVADOC	 Returns a zero value of this AnimatableValue's type. 
public	TokenNamepublic	
AnimatableValue	TokenNameIdentifier	 Animatable Value
getZeroValue	TokenNameIdentifier	 get Zero Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vs	TokenNameIdentifier	 vs
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
lengthValues	TokenNameIdentifier	 length Values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
AnimatableLengthListValue	TokenNameIdentifier	 Animatable Length List Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
lengthTypes	TokenNameIdentifier	 length Types
,	TokenNameCOMMA	
vs	TokenNameIdentifier	 vs
,	TokenNameCOMMA	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the CSS text representation of the value. * Length lists can never be used for CSS properties. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS text representation of the value. Length lists can never be used for CSS properties. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lengthValues	TokenNameIdentifier	 length Values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
formatNumber	TokenNameIdentifier	 format Number
(	TokenNameLPAREN	
lengthValues	TokenNameIdentifier	 length Values
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
AnimatableLengthValue	TokenNameIdentifier	 Animatable Length Value
.	TokenNameDOT	
UNITS	TokenNameIdentifier	 UNITS
[	TokenNameLBRACKET	
lengthTypes	TokenNameIdentifier	 length Types
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
lengthValues	TokenNameIdentifier	 length Values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
formatNumber	TokenNameIdentifier	 format Number
(	TokenNameLPAREN	
lengthValues	TokenNameIdentifier	 length Values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
AnimatableLengthValue	TokenNameIdentifier	 Animatable Length Value
.	TokenNameDOT	
UNITS	TokenNameIdentifier	 UNITS
[	TokenNameLBRACKET	
lengthTypes	TokenNameIdentifier	 length Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
