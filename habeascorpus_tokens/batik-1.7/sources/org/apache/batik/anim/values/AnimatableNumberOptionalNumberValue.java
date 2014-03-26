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
/** * A number-optional-number value in the animation system. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AnimatableNumberOptionalNumberValue.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A number-optional-number value in the animation system. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AnimatableNumberOptionalNumberValue.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AnimatableNumberOptionalNumberValue	TokenNameIdentifier	 Animatable Number Optional Number Value
extends	TokenNameextends	
AnimatableValue	TokenNameIdentifier	 Animatable Value
{	TokenNameLBRACE	
/** * The first number. */	TokenNameCOMMENT_JAVADOC	 The first number. 
protected	TokenNameprotected	
float	TokenNamefloat	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
/** * Whether the optional number is present. */	TokenNameCOMMENT_JAVADOC	 Whether the optional number is present. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
hasOptionalNumber	TokenNameIdentifier	 has Optional Number
;	TokenNameSEMICOLON	
/** * The optional number. */	TokenNameCOMMENT_JAVADOC	 The optional number. 
protected	TokenNameprotected	
float	TokenNamefloat	
optionalNumber	TokenNameIdentifier	 optional Number
;	TokenNameSEMICOLON	
/** * Creates a new, uninitialized AnimatableNumberOptionalNumberValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new, uninitialized AnimatableNumberOptionalNumberValue. 
protected	TokenNameprotected	
AnimatableNumberOptionalNumberValue	TokenNameIdentifier	 Animatable Number Optional Number Value
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
/** * Creates a new AnimatableNumberOptionalNumberValue with one number. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatableNumberOptionalNumberValue with one number. 
public	TokenNamepublic	
AnimatableNumberOptionalNumberValue	TokenNameIdentifier	 Animatable Number Optional Number Value
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AnimatableNumberOptionalNumberValue with two numbers. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatableNumberOptionalNumberValue with two numbers. 
public	TokenNamepublic	
AnimatableNumberOptionalNumberValue	TokenNameIdentifier	 Animatable Number Optional Number Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
float	TokenNamefloat	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
float	TokenNamefloat	
on	TokenNameIdentifier	 on
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
optionalNumber	TokenNameIdentifier	 optional Number
=	TokenNameEQUAL	
on	TokenNameIdentifier	 on
;	TokenNameSEMICOLON	
hasOptionalNumber	TokenNameIdentifier	 has Optional Number
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs interpolation to the given value. Number-optional-number * values cannot be interpolated. */	TokenNameCOMMENT_JAVADOC	 Performs interpolation to the given value. Number-optional-number values cannot be interpolated. 
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
AnimatableNumberOptionalNumberValue	TokenNameIdentifier	 Animatable Number Optional Number Value
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
AnimatableNumberOptionalNumberValue	TokenNameIdentifier	 Animatable Number Optional Number Value
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
AnimatableNumberOptionalNumberValue	TokenNameIdentifier	 Animatable Number Optional Number Value
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
newNumber	TokenNameIdentifier	 new Number
,	TokenNameCOMMA	
newOptionalNumber	TokenNameIdentifier	 new Optional Number
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
newHasOptionalNumber	TokenNameIdentifier	 new Has Optional Number
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
AnimatableNumberOptionalNumberValue	TokenNameIdentifier	 Animatable Number Optional Number Value
toValue	TokenNameIdentifier	 to Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableNumberOptionalNumberValue	TokenNameIdentifier	 Animatable Number Optional Number Value
)	TokenNameRPAREN	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
newNumber	TokenNameIdentifier	 new Number
=	TokenNameEQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
newOptionalNumber	TokenNameIdentifier	 new Optional Number
=	TokenNameEQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
optionalNumber	TokenNameIdentifier	 optional Number
;	TokenNameSEMICOLON	
newHasOptionalNumber	TokenNameIdentifier	 new Has Optional Number
=	TokenNameEQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
hasOptionalNumber	TokenNameIdentifier	 has Optional Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newNumber	TokenNameIdentifier	 new Number
=	TokenNameEQUAL	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
newOptionalNumber	TokenNameIdentifier	 new Optional Number
=	TokenNameEQUAL	
optionalNumber	TokenNameIdentifier	 optional Number
;	TokenNameSEMICOLON	
newHasOptionalNumber	TokenNameIdentifier	 new Has Optional Number
=	TokenNameEQUAL	
hasOptionalNumber	TokenNameIdentifier	 has Optional Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
number	TokenNameIdentifier	 number
!=	TokenNameNOT_EQUAL	
newNumber	TokenNameIdentifier	 new Number
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
hasOptionalNumber	TokenNameIdentifier	 has Optional Number
!=	TokenNameNOT_EQUAL	
newHasOptionalNumber	TokenNameIdentifier	 new Has Optional Number
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
optionalNumber	TokenNameIdentifier	 optional Number
!=	TokenNameNOT_EQUAL	
newOptionalNumber	TokenNameIdentifier	 new Optional Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
optionalNumber	TokenNameIdentifier	 optional Number
=	TokenNameEQUAL	
optionalNumber	TokenNameIdentifier	 optional Number
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
hasOptionalNumber	TokenNameIdentifier	 has Optional Number
=	TokenNameEQUAL	
hasOptionalNumber	TokenNameIdentifier	 has Optional Number
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
/** * Returns the first number. */	TokenNameCOMMENT_JAVADOC	 Returns the first number. 
public	TokenNamepublic	
float	TokenNamefloat	
getNumber	TokenNameIdentifier	 get Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the optional number is present. */	TokenNameCOMMENT_JAVADOC	 Returns whether the optional number is present. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasOptionalNumber	TokenNameIdentifier	 has Optional Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hasOptionalNumber	TokenNameIdentifier	 has Optional Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the optional number. */	TokenNameCOMMENT_JAVADOC	 Returns the optional number. 
public	TokenNamepublic	
float	TokenNamefloat	
getOptionalNumber	TokenNameIdentifier	 get Optional Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
optionalNumber	TokenNameIdentifier	 optional Number
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
if	TokenNameif	
(	TokenNameLPAREN	
hasOptionalNumber	TokenNameIdentifier	 has Optional Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AnimatableNumberOptionalNumberValue	TokenNameIdentifier	 Animatable Number Optional Number Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AnimatableNumberOptionalNumberValue	TokenNameIdentifier	 Animatable Number Optional Number Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
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
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasOptionalNumber	TokenNameIdentifier	 has Optional Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
formatNumber	TokenNameIdentifier	 format Number
(	TokenNameLPAREN	
optionalNumber	TokenNameIdentifier	 optional Number
)	TokenNameRPAREN	
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
