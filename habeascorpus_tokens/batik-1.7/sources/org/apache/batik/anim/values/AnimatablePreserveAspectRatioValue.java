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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SVGConstants	TokenNameIdentifier	 SVG Constants
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
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
;	TokenNameSEMICOLON	
/** * An SVG preserveAspectRatio value in the animation system. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AnimatablePreserveAspectRatioValue.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An SVG preserveAspectRatio value in the animation system. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AnimatablePreserveAspectRatioValue.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AnimatablePreserveAspectRatioValue	TokenNameIdentifier	 Animatable Preserve Aspect Ratio Value
extends	TokenNameextends	
AnimatableValue	TokenNameIdentifier	 Animatable Value
{	TokenNameLBRACE	
/** * Strings for the 'align' values. */	TokenNameCOMMENT_JAVADOC	 Strings for the 'align' values. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ALIGN_VALUES	TokenNameIdentifier	 ALIGN  VALUES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_NONE_VALUE	TokenNameIdentifier	 SVG  NONE  VALUE
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_XMINYMIN_VALUE	TokenNameIdentifier	 SVG  XMINYMIN  VALUE
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_XMIDYMIN_VALUE	TokenNameIdentifier	 SVG  XMIDYMIN  VALUE
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_XMAXYMIN_VALUE	TokenNameIdentifier	 SVG  XMAXYMIN  VALUE
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_XMINYMID_VALUE	TokenNameIdentifier	 SVG  XMINYMID  VALUE
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_XMIDYMID_VALUE	TokenNameIdentifier	 SVG  XMIDYMID  VALUE
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_XMAXYMID_VALUE	TokenNameIdentifier	 SVG  XMAXYMID  VALUE
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_XMINYMAX_VALUE	TokenNameIdentifier	 SVG  XMINYMAX  VALUE
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_XMIDYMAX_VALUE	TokenNameIdentifier	 SVG  XMIDYMAX  VALUE
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_XMAXYMAX_VALUE	TokenNameIdentifier	 SVG  XMAXYMAX  VALUE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Strings for the 'meet-or-slice' values. */	TokenNameCOMMENT_JAVADOC	 Strings for the 'meet-or-slice' values. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
MEET_OR_SLICE_VALUES	TokenNameIdentifier	 MEET  OR  SLICE  VALUES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_MEET_VALUE	TokenNameIdentifier	 SVG  MEET  VALUE
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SLICE_VALUE	TokenNameIdentifier	 SVG  SLICE  VALUE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * The align value. */	TokenNameCOMMENT_JAVADOC	 The align value. 
protected	TokenNameprotected	
short	TokenNameshort	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
/** * The meet-or-slice value. */	TokenNameCOMMENT_JAVADOC	 The meet-or-slice value. 
protected	TokenNameprotected	
short	TokenNameshort	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
;	TokenNameSEMICOLON	
/** * Creates a new, uninitialized AnimatablePreserveAspectRatioValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new, uninitialized AnimatablePreserveAspectRatioValue. 
protected	TokenNameprotected	
AnimatablePreserveAspectRatioValue	TokenNameIdentifier	 Animatable Preserve Aspect Ratio Value
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
/** * Creates a new AnimatablePreserveAspectRatioValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatablePreserveAspectRatioValue. 
public	TokenNamepublic	
AnimatablePreserveAspectRatioValue	TokenNameIdentifier	 Animatable Preserve Aspect Ratio Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
short	TokenNameshort	
align	TokenNameIdentifier	 align
,	TokenNameCOMMA	
short	TokenNameshort	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
=	TokenNameEQUAL	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs interpolation to the given value. Preserve aspect ratio values * cannot be interpolated. */	TokenNameCOMMENT_JAVADOC	 Performs interpolation to the given value. Preserve aspect ratio values cannot be interpolated. 
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
AnimatablePreserveAspectRatioValue	TokenNameIdentifier	 Animatable Preserve Aspect Ratio Value
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
AnimatablePreserveAspectRatioValue	TokenNameIdentifier	 Animatable Preserve Aspect Ratio Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatablePreserveAspectRatioValue	TokenNameIdentifier	 Animatable Preserve Aspect Ratio Value
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
short	TokenNameshort	
newAlign	TokenNameIdentifier	 new Align
,	TokenNameCOMMA	
newMeetOrSlice	TokenNameIdentifier	 new Meet Or Slice
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
interpolation	TokenNameIdentifier	 interpolation
>=	TokenNameGREATER_EQUAL	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatablePreserveAspectRatioValue	TokenNameIdentifier	 Animatable Preserve Aspect Ratio Value
toValue	TokenNameIdentifier	 to Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatablePreserveAspectRatioValue	TokenNameIdentifier	 Animatable Preserve Aspect Ratio Value
)	TokenNameRPAREN	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
newAlign	TokenNameIdentifier	 new Align
=	TokenNameEQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
newMeetOrSlice	TokenNameIdentifier	 new Meet Or Slice
=	TokenNameEQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newAlign	TokenNameIdentifier	 new Align
=	TokenNameEQUAL	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
newMeetOrSlice	TokenNameIdentifier	 new Meet Or Slice
=	TokenNameEQUAL	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
align	TokenNameIdentifier	 align
!=	TokenNameNOT_EQUAL	
newAlign	TokenNameIdentifier	 new Align
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
!=	TokenNameNOT_EQUAL	
newMeetOrSlice	TokenNameIdentifier	 new Meet Or Slice
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
=	TokenNameEQUAL	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
hasChanged	TokenNameIdentifier	 has Changed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the align value. */	TokenNameCOMMENT_JAVADOC	 Returns the align value. 
public	TokenNamepublic	
short	TokenNameshort	
getAlign	TokenNameIdentifier	 get Align
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the meet-or-slice value. */	TokenNameCOMMENT_JAVADOC	 Returns the meet-or-slice value. 
public	TokenNamepublic	
short	TokenNameshort	
getMeetOrSlice	TokenNameIdentifier	 get Meet Or Slice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
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
return	TokenNamereturn	
new	TokenNamenew	
AnimatablePreserveAspectRatioValue	TokenNameIdentifier	 Animatable Preserve Aspect Ratio Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_PRESERVEASPECTRATIO_NONE	TokenNameIdentifier	 SVG  PRESERVEASPECTRATIO  NONE
,	TokenNameCOMMA	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_MEETORSLICE_MEET	TokenNameIdentifier	 SVG  MEETORSLICE  MEET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a string representation of this object. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toStringRep	TokenNameIdentifier	 to String Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
align	TokenNameIdentifier	 align
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
align	TokenNameIdentifier	 align
>	TokenNameGREATER	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
ALIGN_VALUES	TokenNameIdentifier	 ALIGN  VALUES
[	TokenNameLBRACKET	
align	TokenNameIdentifier	 align
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
align	TokenNameIdentifier	 align
==	TokenNameEQUAL_EQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_PRESERVEASPECTRATIO_NONE	TokenNameIdentifier	 SVG  PRESERVEASPECTRATIO  NONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
MEET_OR_SLICE_VALUES	TokenNameIdentifier	 MEET  OR  SLICE  VALUES
[	TokenNameLBRACKET	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
