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
/** * A number-or-percentage value in the animation system. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AnimatableNumberOrPercentageValue.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A number-or-percentage value in the animation system. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AnimatableNumberOrPercentageValue.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AnimatableNumberOrPercentageValue	TokenNameIdentifier	 Animatable Number Or Percentage Value
extends	TokenNameextends	
AnimatableNumberValue	TokenNameIdentifier	 Animatable Number Value
{	TokenNameLBRACE	
/** * Whether the number is a percentage. */	TokenNameCOMMENT_JAVADOC	 Whether the number is a percentage. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isPercentage	TokenNameIdentifier	 is Percentage
;	TokenNameSEMICOLON	
/** * Creates a new, uninitialized AnimatableNumberOrPercentageValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new, uninitialized AnimatableNumberOrPercentageValue. 
protected	TokenNameprotected	
AnimatableNumberOrPercentageValue	TokenNameIdentifier	 Animatable Number Or Percentage Value
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
/** * Creates a new AnimatableNumberOrPercentageValue with a number. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatableNumberOrPercentageValue with a number. 
public	TokenNamepublic	
AnimatableNumberOrPercentageValue	TokenNameIdentifier	 Animatable Number Or Percentage Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
float	TokenNamefloat	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AnimatableNumberOrPercentageValue with either a number * or a percentage. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatableNumberOrPercentageValue with either a number or a percentage. 
public	TokenNamepublic	
AnimatableNumberOrPercentageValue	TokenNameIdentifier	 Animatable Number Or Percentage Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
float	TokenNamefloat	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isPercentage	TokenNameIdentifier	 is Percentage
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isPercentage	TokenNameIdentifier	 is Percentage
=	TokenNameEQUAL	
isPercentage	TokenNameIdentifier	 is Percentage
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
AnimatableNumberOrPercentageValue	TokenNameIdentifier	 Animatable Number Or Percentage Value
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
AnimatableNumberOrPercentageValue	TokenNameIdentifier	 Animatable Number Or Percentage Value
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
AnimatableNumberOrPercentageValue	TokenNameIdentifier	 Animatable Number Or Percentage Value
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
newIsPercentage	TokenNameIdentifier	 new Is Percentage
;	TokenNameSEMICOLON	
AnimatableNumberOrPercentageValue	TokenNameIdentifier	 Animatable Number Or Percentage Value
toValue	TokenNameIdentifier	 to Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableNumberOrPercentageValue	TokenNameIdentifier	 Animatable Number Or Percentage Value
)	TokenNameRPAREN	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
AnimatableNumberOrPercentageValue	TokenNameIdentifier	 Animatable Number Or Percentage Value
accValue	TokenNameIdentifier	 acc Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableNumberOrPercentageValue	TokenNameIdentifier	 Animatable Number Or Percentage Value
)	TokenNameRPAREN	
accumulation	TokenNameIdentifier	 accumulation
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
isPercentage	TokenNameIdentifier	 is Percentage
==	TokenNameEQUAL_EQUAL	
isPercentage	TokenNameIdentifier	 is Percentage
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newValue	TokenNameIdentifier	 new Value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
interpolation	TokenNameIdentifier	 interpolation
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
value	TokenNameIdentifier	 value
-	TokenNameMINUS	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newIsPercentage	TokenNameIdentifier	 new Is Percentage
=	TokenNameEQUAL	
isPercentage	TokenNameIdentifier	 is Percentage
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
interpolation	TokenNameIdentifier	 interpolation
>=	TokenNameGREATER_EQUAL	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newValue	TokenNameIdentifier	 new Value
=	TokenNameEQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
newIsPercentage	TokenNameIdentifier	 new Is Percentage
=	TokenNameEQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
isPercentage	TokenNameIdentifier	 is Percentage
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newValue	TokenNameIdentifier	 new Value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
newIsPercentage	TokenNameIdentifier	 new Is Percentage
=	TokenNameEQUAL	
isPercentage	TokenNameIdentifier	 is Percentage
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newValue	TokenNameIdentifier	 new Value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
newIsPercentage	TokenNameIdentifier	 new Is Percentage
=	TokenNameEQUAL	
isPercentage	TokenNameIdentifier	 is Percentage
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
accumulation	TokenNameIdentifier	 accumulation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
accValue	TokenNameIdentifier	 acc Value
.	TokenNameDOT	
isPercentage	TokenNameIdentifier	 is Percentage
==	TokenNameEQUAL_EQUAL	
newIsPercentage	TokenNameIdentifier	 new Is Percentage
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newValue	TokenNameIdentifier	 new Value
+=	TokenNamePLUS_EQUAL	
multiplier	TokenNameIdentifier	 multiplier
*	TokenNameMULTIPLY	
accValue	TokenNameIdentifier	 acc Value
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
newValue	TokenNameIdentifier	 new Value
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
isPercentage	TokenNameIdentifier	 is Percentage
!=	TokenNameNOT_EQUAL	
newIsPercentage	TokenNameIdentifier	 new Is Percentage
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
isPercentage	TokenNameIdentifier	 is Percentage
=	TokenNameEQUAL	
newIsPercentage	TokenNameIdentifier	 new Is Percentage
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
/** * Returns whether the value is a percentage. */	TokenNameCOMMENT_JAVADOC	 Returns whether the value is a percentage. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isPercentage	TokenNameIdentifier	 is Percentage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isPercentage	TokenNameIdentifier	 is Percentage
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
AnimatableNumberOrPercentageValue	TokenNameIdentifier	 Animatable Number Or Percentage Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
isPercentage	TokenNameIdentifier	 is Percentage
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the CSS text representation of the value. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS text representation of the value. 
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
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
formatNumber	TokenNameIdentifier	 format Number
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isPercentage	TokenNameIdentifier	 is Percentage
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
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
