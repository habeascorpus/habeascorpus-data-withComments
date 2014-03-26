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
/** * A number-or-identifier value in the animation system. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AnimatableNumberOrIdentValue.java 492528 2007-01-04 11:45:47Z cam $ */	TokenNameCOMMENT_JAVADOC	 A number-or-identifier value in the animation system. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AnimatableNumberOrIdentValue.java 492528 2007-01-04 11:45:47Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AnimatableNumberOrIdentValue	TokenNameIdentifier	 Animatable Number Or Ident Value
extends	TokenNameextends	
AnimatableNumberValue	TokenNameIdentifier	 Animatable Number Value
{	TokenNameLBRACE	
/** * Whether this value is an identifier. */	TokenNameCOMMENT_JAVADOC	 Whether this value is an identifier. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isIdent	TokenNameIdentifier	 is Ident
;	TokenNameSEMICOLON	
/** * The identifier. */	TokenNameCOMMENT_JAVADOC	 The identifier. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
ident	TokenNameIdentifier	 ident
;	TokenNameSEMICOLON	
/** * Whether numbers should be considered as numeric keywords, as with the * font-weight property. */	TokenNameCOMMENT_JAVADOC	 Whether numbers should be considered as numeric keywords, as with the font-weight property. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
numericIdent	TokenNameIdentifier	 numeric Ident
;	TokenNameSEMICOLON	
/** * Creates a new, uninitialized AnimatableNumberOrIdentValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new, uninitialized AnimatableNumberOrIdentValue. 
protected	TokenNameprotected	
AnimatableNumberOrIdentValue	TokenNameIdentifier	 Animatable Number Or Ident Value
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
/** * Creates a new AnimatableNumberOrIdentValue for a Number value. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatableNumberOrIdentValue for a Number value. 
public	TokenNamepublic	
AnimatableNumberOrIdentValue	TokenNameIdentifier	 Animatable Number Or Ident Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
boolean	TokenNameboolean	
numericIdent	TokenNameIdentifier	 numeric Ident
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numericIdent	TokenNameIdentifier	 numeric Ident
=	TokenNameEQUAL	
numericIdent	TokenNameIdentifier	 numeric Ident
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AnimatableNumberOrIdentValue for an identifier value. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatableNumberOrIdentValue for an identifier value. 
public	TokenNamepublic	
AnimatableNumberOrIdentValue	TokenNameIdentifier	 Animatable Number Or Ident Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ident	TokenNameIdentifier	 ident
=	TokenNameEQUAL	
ident	TokenNameIdentifier	 ident
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isIdent	TokenNameIdentifier	 is Ident
=	TokenNameEQUAL	
true	TokenNametrue	
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
AnimatableNumberOrIdentValue	TokenNameIdentifier	 Animatable Number Or Ident Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
numericIdent	TokenNameIdentifier	 numeric Ident
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
if	TokenNameif	
(	TokenNameLPAREN	
isIdent	TokenNameIdentifier	 is Ident
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ident	TokenNameIdentifier	 ident
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numericIdent	TokenNameIdentifier	 numeric Ident
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
AnimatableNumberOrIdentValue	TokenNameIdentifier	 Animatable Number Or Ident Value
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
AnimatableNumberOrIdentValue	TokenNameIdentifier	 Animatable Number Or Ident Value
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
AnimatableNumberOrIdentValue	TokenNameIdentifier	 Animatable Number Or Ident Value
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isIdent	TokenNameIdentifier	 is Ident
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
hasChanged	TokenNameIdentifier	 has Changed
=	TokenNameEQUAL	
!	TokenNameNOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
isIdent	TokenNameIdentifier	 is Ident
||	TokenNameOR_OR	
!	TokenNameNOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
ident	TokenNameIdentifier	 ident
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
ident	TokenNameIdentifier	 ident
=	TokenNameEQUAL	
ident	TokenNameIdentifier	 ident
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
isIdent	TokenNameIdentifier	 is Ident
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
numericIdent	TokenNameIdentifier	 numeric Ident
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
hasChanged	TokenNameIdentifier	 has Changed
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
value	TokenNameIdentifier	 value
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
isIdent	TokenNameIdentifier	 is Ident
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
isIdent	TokenNameIdentifier	 is Ident
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
hasChanged	TokenNameIdentifier	 has Changed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
numericIdent	TokenNameIdentifier	 numeric Ident
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
float	TokenNamefloat	
oldValue	TokenNameIdentifier	 old Value
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
interpolate	TokenNameIdentifier	 interpolate
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
interpolation	TokenNameIdentifier	 interpolation
,	TokenNameCOMMA	
accumulation	TokenNameIdentifier	 accumulation
,	TokenNameCOMMA	
multiplier	TokenNameIdentifier	 multiplier
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
numericIdent	TokenNameIdentifier	 numeric Ident
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
oldValue	TokenNameIdentifier	 old Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
hasChanged	TokenNameIdentifier	 has Changed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
AnimatableNumberOrIdentValue	TokenNameIdentifier	 Animatable Number Or Ident Value
toValue	TokenNameIdentifier	 to Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableNumberOrIdentValue	TokenNameIdentifier	 Animatable Number Or Ident Value
)	TokenNameRPAREN	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isIdent	TokenNameIdentifier	 is Ident
||	TokenNameOR_OR	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
isIdent	TokenNameIdentifier	 is Ident
||	TokenNameOR_OR	
numericIdent	TokenNameIdentifier	 numeric Ident
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
interpolation	TokenNameIdentifier	 interpolation
>=	TokenNameGREATER_EQUAL	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
isIdent	TokenNameIdentifier	 is Ident
!=	TokenNameNOT_EQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
isIdent	TokenNameIdentifier	 is Ident
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
value	TokenNameIdentifier	 value
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
isIdent	TokenNameIdentifier	 is Ident
&&	TokenNameAND_AND	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
isIdent	TokenNameIdentifier	 is Ident
&&	TokenNameAND_AND	
!	TokenNameNOT	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
ident	TokenNameIdentifier	 ident
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
isIdent	TokenNameIdentifier	 is Ident
=	TokenNameEQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
isIdent	TokenNameIdentifier	 is Ident
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
ident	TokenNameIdentifier	 ident
=	TokenNameEQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
ident	TokenNameIdentifier	 ident
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
numericIdent	TokenNameIdentifier	 numeric Ident
=	TokenNameEQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
numericIdent	TokenNameIdentifier	 numeric Ident
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
hasChanged	TokenNameIdentifier	 has Changed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
isIdent	TokenNameIdentifier	 is Ident
!=	TokenNameNOT_EQUAL	
isIdent	TokenNameIdentifier	 is Ident
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
value	TokenNameIdentifier	 value
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
isIdent	TokenNameIdentifier	 is Ident
&&	TokenNameAND_AND	
isIdent	TokenNameIdentifier	 is Ident
&&	TokenNameAND_AND	
!	TokenNameNOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
ident	TokenNameIdentifier	 ident
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
isIdent	TokenNameIdentifier	 is Ident
=	TokenNameEQUAL	
isIdent	TokenNameIdentifier	 is Ident
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
ident	TokenNameIdentifier	 ident
=	TokenNameEQUAL	
ident	TokenNameIdentifier	 ident
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
numericIdent	TokenNameIdentifier	 numeric Ident
=	TokenNameEQUAL	
numericIdent	TokenNameIdentifier	 numeric Ident
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
hasChanged	TokenNameIdentifier	 has Changed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
interpolate	TokenNameIdentifier	 interpolate
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
interpolation	TokenNameIdentifier	 interpolation
,	TokenNameCOMMA	
accumulation	TokenNameIdentifier	 accumulation
,	TokenNameCOMMA	
multiplier	TokenNameIdentifier	 multiplier
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
numericIdent	TokenNameIdentifier	 numeric Ident
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
