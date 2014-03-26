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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
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
/** * An SVG transform list value in the animation system. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AnimatableTransformListValue.java 515307 2007-03-06 21:15:58Z cam $ */	TokenNameCOMMENT_JAVADOC	 An SVG transform list value in the animation system. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AnimatableTransformListValue.java 515307 2007-03-06 21:15:58Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
extends	TokenNameextends	
AnimatableValue	TokenNameIdentifier	 Animatable Value
{	TokenNameLBRACE	
/** * Identity transform value of type 'skewX'. */	TokenNameCOMMENT_JAVADOC	 Identity transform value of type 'skewX'. 
protected	TokenNameprotected	
static	TokenNamestatic	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
IDENTITY_SKEWX	TokenNameIdentifier	 IDENTITY  SKEWX
=	TokenNameEQUAL	
new	TokenNamenew	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Identity transform value of type 'skewY'. */	TokenNameCOMMENT_JAVADOC	 Identity transform value of type 'skewY'. 
protected	TokenNameprotected	
static	TokenNamestatic	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
IDENTITY_SKEWY	TokenNameIdentifier	 IDENTITY  SKEWY
=	TokenNameEQUAL	
new	TokenNamenew	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Identity transform value of type 'scale'. */	TokenNameCOMMENT_JAVADOC	 Identity transform value of type 'scale'. 
protected	TokenNameprotected	
static	TokenNamestatic	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
IDENTITY_SCALE	TokenNameIdentifier	 IDENTITY  SCALE
=	TokenNameEQUAL	
new	TokenNamenew	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Identity transform value of type 'rotate'. */	TokenNameCOMMENT_JAVADOC	 Identity transform value of type 'rotate'. 
protected	TokenNameprotected	
static	TokenNamestatic	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
IDENTITY_ROTATE	TokenNameIdentifier	 IDENTITY  ROTATE
=	TokenNameEQUAL	
new	TokenNamenew	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Identity transform value of type 'translate'. */	TokenNameCOMMENT_JAVADOC	 Identity transform value of type 'translate'. 
protected	TokenNameprotected	
static	TokenNamestatic	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
IDENTITY_TRANSLATE	TokenNameIdentifier	 IDENTITY  TRANSLATE
=	TokenNameEQUAL	
new	TokenNamenew	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
IDENTITY_SKEWX	TokenNameIdentifier	 IDENTITY  SKEWX
.	TokenNameDOT	
setSkewX	TokenNameIdentifier	 set Skew X
(	TokenNameLPAREN	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IDENTITY_SKEWY	TokenNameIdentifier	 IDENTITY  SKEWY
.	TokenNameDOT	
setSkewY	TokenNameIdentifier	 set Skew Y
(	TokenNameLPAREN	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IDENTITY_SCALE	TokenNameIdentifier	 IDENTITY  SCALE
.	TokenNameDOT	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IDENTITY_ROTATE	TokenNameIdentifier	 IDENTITY  ROTATE
.	TokenNameDOT	
setRotate	TokenNameIdentifier	 set Rotate
(	TokenNameLPAREN	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IDENTITY_TRANSLATE	TokenNameIdentifier	 IDENTITY  TRANSLATE
.	TokenNameDOT	
setTranslate	TokenNameIdentifier	 set Translate
(	TokenNameLPAREN	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * List of transforms. */	TokenNameCOMMENT_JAVADOC	 List of transforms. 
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
transforms	TokenNameIdentifier	 transforms
;	TokenNameSEMICOLON	
/** * Creates a new, uninitialized AnimatableTransformListValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new, uninitialized AnimatableTransformListValue. 
protected	TokenNameprotected	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
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
/** * Creates a new AnimatableTransformListValue with a single transform. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatableTransformListValue with a single transform. 
public	TokenNamepublic	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AnimatableTransformListValue with a transform list. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatableTransformListValue with a transform list. 
public	TokenNamepublic	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
transforms	TokenNameIdentifier	 transforms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
transforms	TokenNameIdentifier	 transforms
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
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
toTransformList	TokenNameIdentifier	 to Transform List
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
accTransformList	TokenNameIdentifier	 acc Transform List
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
accumulation	TokenNameIdentifier	 accumulation
;	TokenNameSEMICOLON	
int	TokenNameint	
accSize	TokenNameIdentifier	 acc Size
=	TokenNameEQUAL	
accumulation	TokenNameIdentifier	 accumulation
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
accTransformList	TokenNameIdentifier	 acc Transform List
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
accSize	TokenNameIdentifier	 acc Size
*	TokenNameMULTIPLY	
multiplier	TokenNameIdentifier	 multiplier
;	TokenNameSEMICOLON	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
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
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
multiplier	TokenNameIdentifier	 multiplier
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
accSize	TokenNameIdentifier	 acc Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
accTransformList	TokenNameIdentifier	 acc Transform List
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
tt	TokenNameIdentifier	 tt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
toTransformList	TokenNameIdentifier	 to Transform List
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
ft	TokenNameIdentifier	 ft
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For the case of an additive animation with an underlying 	TokenNameCOMMENT_LINE	For the case of an additive animation with an underlying 
// transform list of zero elements. 	TokenNameCOMMENT_LINE	transform list of zero elements. 
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
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
SVG_TRANSFORM_SKEWX	TokenNameIdentifier	 SVG  TRANSFORM  SKEWX
:	TokenNameCOLON	
ft	TokenNameIdentifier	 ft
=	TokenNameEQUAL	
IDENTITY_SKEWX	TokenNameIdentifier	 IDENTITY  SKEWX
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWY	TokenNameIdentifier	 SVG  TRANSFORM  SKEWY
:	TokenNameCOLON	
ft	TokenNameIdentifier	 ft
=	TokenNameEQUAL	
IDENTITY_SKEWY	TokenNameIdentifier	 IDENTITY  SKEWY
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SCALE	TokenNameIdentifier	 SVG  TRANSFORM  SCALE
:	TokenNameCOLON	
ft	TokenNameIdentifier	 ft
=	TokenNameEQUAL	
IDENTITY_SCALE	TokenNameIdentifier	 IDENTITY  SCALE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_ROTATE	TokenNameIdentifier	 SVG  TRANSFORM  ROTATE
:	TokenNameCOLON	
ft	TokenNameIdentifier	 ft
=	TokenNameEQUAL	
IDENTITY_ROTATE	TokenNameIdentifier	 IDENTITY  ROTATE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_TRANSLATE	TokenNameIdentifier	 SVG  TRANSFORM  TRANSLATE
:	TokenNameCOLON	
ft	TokenNameIdentifier	 ft
=	TokenNameEQUAL	
IDENTITY_TRANSLATE	TokenNameIdentifier	 IDENTITY  TRANSLATE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ft	TokenNameIdentifier	 ft
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
ft	TokenNameIdentifier	 ft
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWX	TokenNameIdentifier	 SVG  TRANSFORM  SKEWX
:	TokenNameCOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWY	TokenNameIdentifier	 SVG  TRANSFORM  SKEWY
:	TokenNameCOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
ft	TokenNameIdentifier	 ft
.	TokenNameDOT	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
+=	TokenNamePLUS_EQUAL	
interpolation	TokenNameIdentifier	 interpolation
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWX	TokenNameIdentifier	 SVG  TRANSFORM  SKEWX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setSkewX	TokenNameIdentifier	 set Skew X
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWY	TokenNameIdentifier	 SVG  TRANSFORM  SKEWY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setSkewY	TokenNameIdentifier	 set Skew Y
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
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
{	TokenNameLBRACE	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
fm	TokenNameIdentifier	 fm
=	TokenNameEQUAL	
ft	TokenNameIdentifier	 ft
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
tm	TokenNameIdentifier	 tm
=	TokenNameEQUAL	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
fm	TokenNameIdentifier	 fm
.	TokenNameDOT	
getA	TokenNameIdentifier	 get A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
fm	TokenNameIdentifier	 fm
.	TokenNameDOT	
getD	TokenNameIdentifier	 get D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
+=	TokenNamePLUS_EQUAL	
interpolation	TokenNameIdentifier	 interpolation
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
tm	TokenNameIdentifier	 tm
.	TokenNameDOT	
getA	TokenNameIdentifier	 get A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
+=	TokenNamePLUS_EQUAL	
interpolation	TokenNameIdentifier	 interpolation
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
tm	TokenNameIdentifier	 tm
.	TokenNameDOT	
getD	TokenNameIdentifier	 get D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_ROTATE	TokenNameIdentifier	 SVG  TRANSFORM  ROTATE
:	TokenNameCOLON	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
ft	TokenNameIdentifier	 ft
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
ft	TokenNameIdentifier	 ft
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
+=	TokenNamePLUS_EQUAL	
interpolation	TokenNameIdentifier	 interpolation
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
+=	TokenNamePLUS_EQUAL	
interpolation	TokenNameIdentifier	 interpolation
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
ft	TokenNameIdentifier	 ft
.	TokenNameDOT	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
+=	TokenNamePLUS_EQUAL	
interpolation	TokenNameIdentifier	 interpolation
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setRotate	TokenNameIdentifier	 set Rotate
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_TRANSLATE	TokenNameIdentifier	 SVG  TRANSFORM  TRANSLATE
:	TokenNameCOLON	
{	TokenNameLBRACE	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
fm	TokenNameIdentifier	 fm
=	TokenNameEQUAL	
ft	TokenNameIdentifier	 ft
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
tm	TokenNameIdentifier	 tm
=	TokenNameEQUAL	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
fm	TokenNameIdentifier	 fm
.	TokenNameDOT	
getE	TokenNameIdentifier	 get E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
fm	TokenNameIdentifier	 fm
.	TokenNameDOT	
getF	TokenNameIdentifier	 get F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
+=	TokenNamePLUS_EQUAL	
interpolation	TokenNameIdentifier	 interpolation
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
tm	TokenNameIdentifier	 tm
.	TokenNameDOT	
getE	TokenNameIdentifier	 get E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
+=	TokenNamePLUS_EQUAL	
interpolation	TokenNameIdentifier	 interpolation
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
tm	TokenNameIdentifier	 tm
.	TokenNameDOT	
getF	TokenNameIdentifier	 get F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setTranslate	TokenNameIdentifier	 set Translate
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
ft	TokenNameIdentifier	 ft
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
assign	TokenNameIdentifier	 assign
(	TokenNameLPAREN	
ft	TokenNameIdentifier	 ft
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XXX Do better checking for changes. 	TokenNameCOMMENT_LINE	XXX Do better checking for changes. 
res	TokenNameIdentifier	 res
.	TokenNameDOT	
hasChanged	TokenNameIdentifier	 has Changed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs a two-way interpolation between the specified values. * value[12] and to[12] must all be of the same type, either scale or * translation transforms, or all null. */	TokenNameCOMMENT_JAVADOC	 Performs a two-way interpolation between the specified values. value[12] and to[12] must all be of the same type, either scale or translation transforms, or all null. 
public	TokenNamepublic	
static	TokenNamestatic	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
interpolate	TokenNameIdentifier	 interpolate
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
res	TokenNameIdentifier	 res
,	TokenNameCOMMA	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
value1	TokenNameIdentifier	 value1
,	TokenNameCOMMA	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
value2	TokenNameIdentifier	 value2
,	TokenNameCOMMA	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
to1	TokenNameIdentifier	 to1
,	TokenNameCOMMA	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
to2	TokenNameIdentifier	 to2
,	TokenNameCOMMA	
float	TokenNamefloat	
interpolation1	TokenNameIdentifier	 interpolation1
,	TokenNameCOMMA	
float	TokenNamefloat	
interpolation2	TokenNameIdentifier	 interpolation2
,	TokenNameCOMMA	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
accumulation	TokenNameIdentifier	 accumulation
,	TokenNameCOMMA	
int	TokenNameint	
multiplier	TokenNameIdentifier	 multiplier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
accSize	TokenNameIdentifier	 acc Size
=	TokenNameEQUAL	
accumulation	TokenNameIdentifier	 accumulation
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
accumulation	TokenNameIdentifier	 accumulation
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
accSize	TokenNameIdentifier	 acc Size
*	TokenNameMULTIPLY	
multiplier	TokenNameIdentifier	 multiplier
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
(	TokenNameLPAREN	
to1	TokenNameIdentifier	 to1
.	TokenNameDOT	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
multiplier	TokenNameIdentifier	 multiplier
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
accSize	TokenNameIdentifier	 acc Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
accumulation	TokenNameIdentifier	 accumulation
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
ft1	TokenNameIdentifier	 ft1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
value1	TokenNameIdentifier	 value1
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
ft2	TokenNameIdentifier	 ft2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
value2	TokenNameIdentifier	 value2
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
ft1	TokenNameIdentifier	 ft1
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SCALE	TokenNameIdentifier	 SVG  TRANSFORM  SCALE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
ft1	TokenNameIdentifier	 ft1
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getA	TokenNameIdentifier	 get A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
ft2	TokenNameIdentifier	 ft2
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getD	TokenNameIdentifier	 get D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
ft1	TokenNameIdentifier	 ft1
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getE	TokenNameIdentifier	 get E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
ft2	TokenNameIdentifier	 ft2
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getF	TokenNameIdentifier	 get F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
to1	TokenNameIdentifier	 to1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
tt1	TokenNameIdentifier	 tt1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
to1	TokenNameIdentifier	 to1
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
tt2	TokenNameIdentifier	 tt2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
to2	TokenNameIdentifier	 to2
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SCALE	TokenNameIdentifier	 SVG  TRANSFORM  SCALE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
+=	TokenNamePLUS_EQUAL	
interpolation1	TokenNameIdentifier	 interpolation1
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
tt1	TokenNameIdentifier	 tt1
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getA	TokenNameIdentifier	 get A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
+=	TokenNamePLUS_EQUAL	
interpolation2	TokenNameIdentifier	 interpolation2
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
tt2	TokenNameIdentifier	 tt2
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getD	TokenNameIdentifier	 get D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
+=	TokenNamePLUS_EQUAL	
interpolation1	TokenNameIdentifier	 interpolation1
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
tt1	TokenNameIdentifier	 tt1
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getE	TokenNameIdentifier	 get E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
+=	TokenNamePLUS_EQUAL	
interpolation2	TokenNameIdentifier	 interpolation2
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
tt2	TokenNameIdentifier	 tt2
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getF	TokenNameIdentifier	 get F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SCALE	TokenNameIdentifier	 SVG  TRANSFORM  SCALE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setTranslate	TokenNameIdentifier	 set Translate
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XXX Do better checking for changes. 	TokenNameCOMMENT_LINE	XXX Do better checking for changes. 
res	TokenNameIdentifier	 res
.	TokenNameDOT	
hasChanged	TokenNameIdentifier	 has Changed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs a three-way interpolation between the specified values. * value[123] and to[123] must all be single rotation transforms, * or all null. */	TokenNameCOMMENT_JAVADOC	 Performs a three-way interpolation between the specified values. value[123] and to[123] must all be single rotation transforms, or all null. 
public	TokenNamepublic	
static	TokenNamestatic	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
interpolate	TokenNameIdentifier	 interpolate
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
res	TokenNameIdentifier	 res
,	TokenNameCOMMA	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
value1	TokenNameIdentifier	 value1
,	TokenNameCOMMA	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
value2	TokenNameIdentifier	 value2
,	TokenNameCOMMA	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
value3	TokenNameIdentifier	 value3
,	TokenNameCOMMA	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
to1	TokenNameIdentifier	 to1
,	TokenNameCOMMA	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
to2	TokenNameIdentifier	 to2
,	TokenNameCOMMA	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
to3	TokenNameIdentifier	 to3
,	TokenNameCOMMA	
float	TokenNamefloat	
interpolation1	TokenNameIdentifier	 interpolation1
,	TokenNameCOMMA	
float	TokenNamefloat	
interpolation2	TokenNameIdentifier	 interpolation2
,	TokenNameCOMMA	
float	TokenNamefloat	
interpolation3	TokenNameIdentifier	 interpolation3
,	TokenNameCOMMA	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
accumulation	TokenNameIdentifier	 accumulation
,	TokenNameCOMMA	
int	TokenNameint	
multiplier	TokenNameIdentifier	 multiplier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
accSize	TokenNameIdentifier	 acc Size
=	TokenNameEQUAL	
accumulation	TokenNameIdentifier	 accumulation
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
accumulation	TokenNameIdentifier	 accumulation
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
accSize	TokenNameIdentifier	 acc Size
*	TokenNameMULTIPLY	
multiplier	TokenNameIdentifier	 multiplier
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
(	TokenNameLPAREN	
to1	TokenNameIdentifier	 to1
.	TokenNameDOT	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
multiplier	TokenNameIdentifier	 multiplier
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
accSize	TokenNameIdentifier	 acc Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
accumulation	TokenNameIdentifier	 accumulation
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
ft1	TokenNameIdentifier	 ft1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
value1	TokenNameIdentifier	 value1
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
ft2	TokenNameIdentifier	 ft2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
value2	TokenNameIdentifier	 value2
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
ft3	TokenNameIdentifier	 ft3
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
value3	TokenNameIdentifier	 value3
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
ft1	TokenNameIdentifier	 ft1
.	TokenNameDOT	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
ft2	TokenNameIdentifier	 ft2
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
ft3	TokenNameIdentifier	 ft3
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
to1	TokenNameIdentifier	 to1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
tt1	TokenNameIdentifier	 tt1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
to1	TokenNameIdentifier	 to1
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
tt2	TokenNameIdentifier	 tt2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
to2	TokenNameIdentifier	 to2
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
tt3	TokenNameIdentifier	 tt3
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
to3	TokenNameIdentifier	 to3
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
+=	TokenNamePLUS_EQUAL	
interpolation1	TokenNameIdentifier	 interpolation1
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
tt1	TokenNameIdentifier	 tt1
.	TokenNameDOT	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
+=	TokenNamePLUS_EQUAL	
interpolation2	TokenNameIdentifier	 interpolation2
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
tt2	TokenNameIdentifier	 tt2
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
+=	TokenNamePLUS_EQUAL	
interpolation3	TokenNameIdentifier	 interpolation3
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
tt3	TokenNameIdentifier	 tt3
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setRotate	TokenNameIdentifier	 set Rotate
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX Do better checking for changes. 	TokenNameCOMMENT_LINE	XXX Do better checking for changes. 
res	TokenNameIdentifier	 res
.	TokenNameDOT	
hasChanged	TokenNameIdentifier	 has Changed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the transforms. */	TokenNameCOMMENT_JAVADOC	 Gets the transforms. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
getTransforms	TokenNameIdentifier	 get Transforms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
type1	TokenNameIdentifier	 type1
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type1	TokenNameIdentifier	 type1
!=	TokenNameNOT_EQUAL	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
m1	TokenNameIdentifier	 m1
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
m2	TokenNameIdentifier	 m2
=	TokenNameEQUAL	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type1	TokenNameIdentifier	 type1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_TRANSLATE	TokenNameIdentifier	 SVG  TRANSFORM  TRANSLATE
:	TokenNameCOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
m1	TokenNameIdentifier	 m1
.	TokenNameDOT	
getE	TokenNameIdentifier	 get E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
m2	TokenNameIdentifier	 m2
.	TokenNameDOT	
getE	TokenNameIdentifier	 get E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
m1	TokenNameIdentifier	 m1
.	TokenNameDOT	
getF	TokenNameIdentifier	 get F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
m2	TokenNameIdentifier	 m2
.	TokenNameDOT	
getF	TokenNameIdentifier	 get F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SCALE	TokenNameIdentifier	 SVG  TRANSFORM  SCALE
:	TokenNameCOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
m1	TokenNameIdentifier	 m1
.	TokenNameDOT	
getA	TokenNameIdentifier	 get A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
m2	TokenNameIdentifier	 m2
.	TokenNameDOT	
getA	TokenNameIdentifier	 get A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
m1	TokenNameIdentifier	 m1
.	TokenNameDOT	
getD	TokenNameIdentifier	 get D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
m2	TokenNameIdentifier	 m2
.	TokenNameDOT	
getD	TokenNameIdentifier	 get D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_ROTATE	TokenNameIdentifier	 SVG  TRANSFORM  ROTATE
:	TokenNameCOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWX	TokenNameIdentifier	 SVG  TRANSFORM  SKEWX
:	TokenNameCOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWY	TokenNameIdentifier	 SVG  TRANSFORM  SKEWY
:	TokenNameCOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the distance between this value's first component and the * specified other value's first component. */	TokenNameCOMMENT_JAVADOC	 Returns the distance between this value's first component and the specified other value's first component. 
public	TokenNamepublic	
float	TokenNamefloat	
distanceTo1	TokenNameIdentifier	 distance To1
(	TokenNameLPAREN	
AnimatableValue	TokenNameIdentifier	 Animatable Value
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
type1	TokenNameIdentifier	 type1
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type1	TokenNameIdentifier	 type1
!=	TokenNameNOT_EQUAL	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
m1	TokenNameIdentifier	 m1
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
m2	TokenNameIdentifier	 m2
=	TokenNameEQUAL	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type1	TokenNameIdentifier	 type1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_TRANSLATE	TokenNameIdentifier	 SVG  TRANSFORM  TRANSLATE
:	TokenNameCOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
m1	TokenNameIdentifier	 m1
.	TokenNameDOT	
getE	TokenNameIdentifier	 get E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
m2	TokenNameIdentifier	 m2
.	TokenNameDOT	
getE	TokenNameIdentifier	 get E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SCALE	TokenNameIdentifier	 SVG  TRANSFORM  SCALE
:	TokenNameCOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
m1	TokenNameIdentifier	 m1
.	TokenNameDOT	
getA	TokenNameIdentifier	 get A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
m2	TokenNameIdentifier	 m2
.	TokenNameDOT	
getA	TokenNameIdentifier	 get A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_ROTATE	TokenNameIdentifier	 SVG  TRANSFORM  ROTATE
:	TokenNameCOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWX	TokenNameIdentifier	 SVG  TRANSFORM  SKEWX
:	TokenNameCOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWY	TokenNameIdentifier	 SVG  TRANSFORM  SKEWY
:	TokenNameCOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the distance between this value's second component and the * specified other value's second component. */	TokenNameCOMMENT_JAVADOC	 Returns the distance between this value's second component and the specified other value's second component. 
public	TokenNamepublic	
float	TokenNamefloat	
distanceTo2	TokenNameIdentifier	 distance To2
(	TokenNameLPAREN	
AnimatableValue	TokenNameIdentifier	 Animatable Value
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
type1	TokenNameIdentifier	 type1
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type1	TokenNameIdentifier	 type1
!=	TokenNameNOT_EQUAL	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
m1	TokenNameIdentifier	 m1
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
m2	TokenNameIdentifier	 m2
=	TokenNameEQUAL	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type1	TokenNameIdentifier	 type1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_TRANSLATE	TokenNameIdentifier	 SVG  TRANSFORM  TRANSLATE
:	TokenNameCOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
m1	TokenNameIdentifier	 m1
.	TokenNameDOT	
getF	TokenNameIdentifier	 get F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
m2	TokenNameIdentifier	 m2
.	TokenNameDOT	
getF	TokenNameIdentifier	 get F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SCALE	TokenNameIdentifier	 SVG  TRANSFORM  SCALE
:	TokenNameCOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
m1	TokenNameIdentifier	 m1
.	TokenNameDOT	
getD	TokenNameIdentifier	 get D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
m2	TokenNameIdentifier	 m2
.	TokenNameDOT	
getD	TokenNameIdentifier	 get D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_ROTATE	TokenNameIdentifier	 SVG  TRANSFORM  ROTATE
:	TokenNameCOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the distance between this value's third component and the * specified other value's third component. */	TokenNameCOMMENT_JAVADOC	 Returns the distance between this value's third component and the specified other value's third component. 
public	TokenNamepublic	
float	TokenNamefloat	
distanceTo3	TokenNameIdentifier	 distance To3
(	TokenNameLPAREN	
AnimatableValue	TokenNameIdentifier	 Animatable Value
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
type1	TokenNameIdentifier	 type1
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type1	TokenNameIdentifier	 type1
!=	TokenNameNOT_EQUAL	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type1	TokenNameIdentifier	 type1
==	TokenNameEQUAL_EQUAL	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_ROTATE	TokenNameIdentifier	 SVG  TRANSFORM  ROTATE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a zero value of this AnimatableValue's type. This returns an * empty transform list. */	TokenNameCOMMENT_JAVADOC	 Returns a zero value of this AnimatableValue's type. This returns an empty transform list. 
public	TokenNamepublic	
AnimatableValue	TokenNameIdentifier	 Animatable Value
getZeroValue	TokenNameIdentifier	 get Zero Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the CSS text representation of the value. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS text representation of the value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toStringRep	TokenNameIdentifier	 to String Rep
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
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
transforms	TokenNameIdentifier	 transforms
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"null"	TokenNameStringLiteral	null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_TRANSLATE	TokenNameIdentifier	 SVG  TRANSFORM  TRANSLATE
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"translate("	TokenNameStringLiteral	translate(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getE	TokenNameIdentifier	 get E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getF	TokenNameIdentifier	 get F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SCALE	TokenNameIdentifier	 SVG  TRANSFORM  SCALE
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"scale("	TokenNameStringLiteral	scale(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getA	TokenNameIdentifier	 get A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getD	TokenNameIdentifier	 get D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWX	TokenNameIdentifier	 SVG  TRANSFORM  SKEWX
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"skewX("	TokenNameStringLiteral	skewX(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWY	TokenNameIdentifier	 SVG  TRANSFORM  SKEWY
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"skewY("	TokenNameStringLiteral	skewY(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_ROTATE	TokenNameIdentifier	 SVG  TRANSFORM  ROTATE
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"rotate("	TokenNameStringLiteral	rotate(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
