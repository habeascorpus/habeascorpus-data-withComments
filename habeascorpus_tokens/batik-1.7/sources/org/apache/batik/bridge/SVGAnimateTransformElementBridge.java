/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
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
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
TransformAnimation	TokenNameIdentifier	 Transform Animation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
AnimatableValue	TokenNameIdentifier	 Animatable Value
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
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
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
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
SVGTypes	TokenNameIdentifier	 SVG Types
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
SVGTransform	TokenNameIdentifier	 SVG Transform
;	TokenNameSEMICOLON	
/** * Bridge class for the 'animateTransform' animation element. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: SVGAnimateTransformElementBridge.java 496029 2007-01-14 04:00:34Z cam $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the 'animateTransform' animation element. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: SVGAnimateTransformElementBridge.java 496029 2007-01-14 04:00:34Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGAnimateTransformElementBridge	TokenNameIdentifier	 SVG Animate Transform Element Bridge
extends	TokenNameextends	
SVGAnimateElementBridge	TokenNameIdentifier	 SVG Animate Element Bridge
{	TokenNameLBRACE	
/** * Returns 'animateTransform'. */	TokenNameCOMMENT_JAVADOC	 Returns 'animateTransform'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_ANIMATE_TRANSFORM_TAG	TokenNameIdentifier	 SVG  ANIMATE  TRANSFORM  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new instance of this bridge. */	TokenNameCOMMENT_JAVADOC	 Returns a new instance of this bridge. 
public	TokenNamepublic	
Bridge	TokenNameIdentifier	 Bridge
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SVGAnimateTransformElementBridge	TokenNameIdentifier	 SVG Animate Transform Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the animation object for the animation element. */	TokenNameCOMMENT_JAVADOC	 Creates the animation object for the animation element. 
protected	TokenNameprotected	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
createAnimation	TokenNameIdentifier	 create Animation
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
parseType	TokenNameIdentifier	 parse Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AnimatableValue	TokenNameIdentifier	 Animatable Value
from	TokenNameIdentifier	 from
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
by	TokenNameIdentifier	 by
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
hasAttributeNS	TokenNameIdentifier	 has Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_FROM_ATTRIBUTE	TokenNameIdentifier	 SVG  FROM  ATTRIBUTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
from	TokenNameIdentifier	 from
=	TokenNameEQUAL	
parseValue	TokenNameIdentifier	 parse Value
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_FROM_ATTRIBUTE	TokenNameIdentifier	 SVG  FROM  ATTRIBUTE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
hasAttributeNS	TokenNameIdentifier	 has Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_TO_ATTRIBUTE	TokenNameIdentifier	 SVG  TO  ATTRIBUTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
parseValue	TokenNameIdentifier	 parse Value
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_TO_ATTRIBUTE	TokenNameIdentifier	 SVG  TO  ATTRIBUTE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
hasAttributeNS	TokenNameIdentifier	 has Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_BY_ATTRIBUTE	TokenNameIdentifier	 SVG  BY  ATTRIBUTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
by	TokenNameIdentifier	 by
=	TokenNameEQUAL	
parseValue	TokenNameIdentifier	 parse Value
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_BY_ATTRIBUTE	TokenNameIdentifier	 SVG  BY  ATTRIBUTE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TransformAnimation	TokenNameIdentifier	 Transform Animation
(	TokenNameLPAREN	
timedElement	TokenNameIdentifier	 timed Element
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
parseCalcMode	TokenNameIdentifier	 parse Calc Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parseKeyTimes	TokenNameIdentifier	 parse Key Times
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parseKeySplines	TokenNameIdentifier	 parse Key Splines
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parseAdditive	TokenNameIdentifier	 parse Additive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parseAccumulate	TokenNameIdentifier	 parse Accumulate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parseValues	TokenNameIdentifier	 parse Values
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
by	TokenNameIdentifier	 by
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the parsed 'type' attribute from the animation element. */	TokenNameCOMMENT_JAVADOC	 Returns the parsed 'type' attribute from the animation element. 
protected	TokenNameprotected	
short	TokenNameshort	
parseType	TokenNameIdentifier	 parse Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
typeString	TokenNameIdentifier	 type String
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_TYPE_ATTRIBUTE	TokenNameIdentifier	 SVG  TYPE  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
typeString	TokenNameIdentifier	 type String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"translate"	TokenNameStringLiteral	translate
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_TRANSLATE	TokenNameIdentifier	 SVG  TRANSFORM  TRANSLATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
typeString	TokenNameIdentifier	 type String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"scale"	TokenNameStringLiteral	scale
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SCALE	TokenNameIdentifier	 SVG  TRANSFORM  SCALE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
typeString	TokenNameIdentifier	 type String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"rotate"	TokenNameStringLiteral	rotate
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_ROTATE	TokenNameIdentifier	 SVG  TRANSFORM  ROTATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
typeString	TokenNameIdentifier	 type String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"skewX"	TokenNameStringLiteral	skewX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWX	TokenNameIdentifier	 SVG  TRANSFORM  SKEWX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
typeString	TokenNameIdentifier	 type String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"skewY"	TokenNameStringLiteral	skewY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWY	TokenNameIdentifier	 SVG  TRANSFORM  SKEWY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
.	TokenNameDOT	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_TYPE_ATTRIBUTE	TokenNameIdentifier	 SVG  TYPE  ATTRIBUTE
,	TokenNameCOMMA	
typeString	TokenNameIdentifier	 type String
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a transform value. */	TokenNameCOMMENT_JAVADOC	 Parses a transform value. 
protected	TokenNameprotected	
AnimatableValue	TokenNameIdentifier	 Animatable Value
parseValue	TokenNameIdentifier	 parse Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
val1	TokenNameIdentifier	 val1
,	TokenNameCOMMA	
val2	TokenNameIdentifier	 val2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
val3	TokenNameIdentifier	 val3
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
','	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
val1	TokenNameIdentifier	 val1
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
&&	TokenNameAND_AND	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWX	TokenNameIdentifier	 SVG  TRANSFORM  SKEWX
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWY	TokenNameIdentifier	 SVG  TRANSFORM  SKEWY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
val2	TokenNameIdentifier	 val2
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
&&	TokenNameAND_AND	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_ROTATE	TokenNameIdentifier	 SVG  TRANSFORM  ROTATE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
','	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
val3	TokenNameIdentifier	 val3
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
&&	TokenNameAND_AND	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_TRANSLATE	TokenNameIdentifier	 SVG  TRANSFORM  TRANSLATE
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setTranslate	TokenNameIdentifier	 set Translate
(	TokenNameLPAREN	
val1	TokenNameIdentifier	 val1
,	TokenNameCOMMA	
val2	TokenNameIdentifier	 val2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setTranslate	TokenNameIdentifier	 set Translate
(	TokenNameLPAREN	
val1	TokenNameIdentifier	 val1
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SCALE	TokenNameIdentifier	 SVG  TRANSFORM  SCALE
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
val1	TokenNameIdentifier	 val1
,	TokenNameCOMMA	
val2	TokenNameIdentifier	 val2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
val1	TokenNameIdentifier	 val1
,	TokenNameCOMMA	
val1	TokenNameIdentifier	 val1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_ROTATE	TokenNameIdentifier	 SVG  TRANSFORM  ROTATE
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setRotate	TokenNameIdentifier	 set Rotate
(	TokenNameLPAREN	
val1	TokenNameIdentifier	 val1
,	TokenNameCOMMA	
val2	TokenNameIdentifier	 val2
,	TokenNameCOMMA	
val3	TokenNameIdentifier	 val3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setRotate	TokenNameIdentifier	 set Rotate
(	TokenNameLPAREN	
val1	TokenNameIdentifier	 val1
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWX	TokenNameIdentifier	 SVG  TRANSFORM  SKEWX
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setSkewX	TokenNameIdentifier	 set Skew X
(	TokenNameLPAREN	
val1	TokenNameIdentifier	 val1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWY	TokenNameIdentifier	 SVG  TRANSFORM  SKEWY
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setSkewY	TokenNameIdentifier	 set Skew Y
(	TokenNameLPAREN	
val1	TokenNameIdentifier	 val1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the parsed 'values' attribute from the animation element. */	TokenNameCOMMENT_JAVADOC	 Returns the parsed 'values' attribute from the animation element. 
protected	TokenNameprotected	
AnimatableValue	TokenNameIdentifier	 Animatable Value
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parseValues	TokenNameIdentifier	 parse Values
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
valuesString	TokenNameIdentifier	 values String
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  VALUES  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
valuesString	TokenNameIdentifier	 values String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArrayList	TokenNameIdentifier	 Array List
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
outer	TokenNameIdentifier	 outer
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
valuesString	TokenNameIdentifier	 values String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
outer	TokenNameIdentifier	 outer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
valuesString	TokenNameIdentifier	 values String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
valuesString	TokenNameIdentifier	 values String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
valueString	TokenNameIdentifier	 value String
=	TokenNameEQUAL	
valuesString	TokenNameIdentifier	 values String
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AnimatableValue	TokenNameIdentifier	 Animatable Value
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
parseValue	TokenNameIdentifier	 parse Value
(	TokenNameLPAREN	
valueString	TokenNameIdentifier	 value String
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
.	TokenNameDOT	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  VALUES  ATTRIBUTE
,	TokenNameCOMMA	
valuesString	TokenNameIdentifier	 values String
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AnimatableValue	TokenNameIdentifier	 Animatable Value
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatableValue	TokenNameIdentifier	 Animatable Value
[	TokenNameLBRACKET	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
AnimatableValue	TokenNameIdentifier	 Animatable Value
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the animation element being handled by this bridge can * animate attributes of the specified type. * @param type one of the TYPE_ constants defined in {@link SVGTypes}. */	TokenNameCOMMENT_JAVADOC	 Returns whether the animation element being handled by this bridge can animate attributes of the specified type. @param type one of the TYPE_ constants defined in {@link SVGTypes}. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
canAnimateType	TokenNameIdentifier	 can Animate Type
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_TRANSFORM_LIST	TokenNameIdentifier	 TYPE  TRANSFORM  LIST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
