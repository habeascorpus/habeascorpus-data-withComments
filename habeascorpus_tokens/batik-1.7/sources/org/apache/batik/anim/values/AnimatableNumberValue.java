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
/** * A number value in the animation system. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AnimatableNumberValue.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A number value in the animation system. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AnimatableNumberValue.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AnimatableNumberValue	TokenNameIdentifier	 Animatable Number Value
extends	TokenNameextends	
AnimatableValue	TokenNameIdentifier	 Animatable Value
{	TokenNameLBRACE	
/** * The value. */	TokenNameCOMMENT_JAVADOC	 The value. 
protected	TokenNameprotected	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * Creates a new, uninitialized AnimatableNumberValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new, uninitialized AnimatableNumberValue. 
protected	TokenNameprotected	
AnimatableNumberValue	TokenNameIdentifier	 Animatable Number Value
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
/** * Creates a new AnimatableNumberValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatableNumberValue. 
public	TokenNamepublic	
AnimatableNumberValue	TokenNameIdentifier	 Animatable Number Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
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
AnimatableNumberValue	TokenNameIdentifier	 Animatable Number Value
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
AnimatableNumberValue	TokenNameIdentifier	 Animatable Number Value
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
AnimatableNumberValue	TokenNameIdentifier	 Animatable Number Value
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatableNumberValue	TokenNameIdentifier	 Animatable Number Value
toNumber	TokenNameIdentifier	 to Number
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableNumberValue	TokenNameIdentifier	 Animatable Number Value
)	TokenNameRPAREN	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
+=	TokenNamePLUS_EQUAL	
interpolation	TokenNameIdentifier	 interpolation
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
toNumber	TokenNameIdentifier	 to Number
.	TokenNameDOT	
value	TokenNameIdentifier	 value
-	TokenNameMINUS	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
accumulation	TokenNameIdentifier	 accumulation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatableNumberValue	TokenNameIdentifier	 Animatable Number Value
accNumber	TokenNameIdentifier	 acc Number
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableNumberValue	TokenNameIdentifier	 Animatable Number Value
)	TokenNameRPAREN	
accumulation	TokenNameIdentifier	 accumulation
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
+=	TokenNamePLUS_EQUAL	
multiplier	TokenNameIdentifier	 multiplier
*	TokenNameMULTIPLY	
accNumber	TokenNameIdentifier	 acc Number
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
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
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
/** * Returns the number value. */	TokenNameCOMMENT_JAVADOC	 Returns the number value. 
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
/** * Returns whether two values of this type can have their distance * computed, as needed by paced animation. */	TokenNameCOMMENT_JAVADOC	 Returns whether two values of this type can have their distance computed, as needed by paced animation. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canPace	TokenNameIdentifier	 can Pace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
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
AnimatableNumberValue	TokenNameIdentifier	 Animatable Number Value
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableNumberValue	TokenNameIdentifier	 Animatable Number Value
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
-	TokenNameMINUS	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
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
AnimatableNumberValue	TokenNameIdentifier	 Animatable Number Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
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
return	TokenNamereturn	
formatNumber	TokenNameIdentifier	 format Number
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
