/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
GraphicContext	TokenNameIdentifier	 Graphic Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
TransformType	TokenNameIdentifier	 Transform Type
;	TokenNameSEMICOLON	
/** * Utility class that converts a GraphicContext transform stack * into an SVG transform attribute. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @author <a href="mailto:paul_evenblij@compuware.com">Paul Evenblij</a> * @version $Id: SVGTransform.java 501495 2007-01-30 18:00:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Utility class that converts a GraphicContext transform stack into an SVG transform attribute. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @author <a href="mailto:paul_evenblij@compuware.com">Paul Evenblij</a> @version $Id: SVGTransform.java 501495 2007-01-30 18:00:36Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGTransform	TokenNameIdentifier	 SVG Transform
extends	TokenNameextends	
AbstractSVGConverter	TokenNameIdentifier	 Abstract SVG Converter
{	TokenNameLBRACE	
/** * Ratio used to convert radians to degrees */	TokenNameCOMMENT_JAVADOC	 Ratio used to convert radians to degrees 
private	TokenNameprivate	
static	TokenNamestatic	
double	TokenNamedouble	
radiansToDegrees	TokenNameIdentifier	 radians To Degrees
=	TokenNameEQUAL	
180.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
;	TokenNameSEMICOLON	
/** * @param generatorContext used by converter to handle precision * or to create elements. */	TokenNameCOMMENT_JAVADOC	 @param generatorContext used by converter to handle precision or to create elements. 
public	TokenNamepublic	
SVGTransform	TokenNameIdentifier	 SVG Transform
(	TokenNameLPAREN	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts part or all of the input GraphicContext into * a set of attribute/value pairs and related definitions * * @param gc GraphicContext to be converted * @return descriptor of the attributes required to represent * some or all of the GraphicContext state, along * with the related definitions * @see org.apache.batik.svggen.SVGDescriptor */	TokenNameCOMMENT_JAVADOC	 Converts part or all of the input GraphicContext into a set of attribute/value pairs and related definitions * @param gc GraphicContext to be converted @return descriptor of the attributes required to represent some or all of the GraphicContext state, along with the related definitions @see org.apache.batik.svggen.SVGDescriptor 
public	TokenNamepublic	
SVGDescriptor	TokenNameIdentifier	 SVG Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
GraphicContext	TokenNameIdentifier	 Graphic Context
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SVGTransformDescriptor	TokenNameIdentifier	 SVG Transform Descriptor
(	TokenNameLPAREN	
toSVGTransform	TokenNameIdentifier	 to SVG Transform
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param gc GraphicContext whose transform stack should be converted * to SVG. * @return the value of an SVG attribute equivalent to the input * GraphicContext's transform stack. */	TokenNameCOMMENT_JAVADOC	 @param gc GraphicContext whose transform stack should be converted to SVG. @return the value of an SVG attribute equivalent to the input GraphicContext's transform stack. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
toSVGTransform	TokenNameIdentifier	 to SVG Transform
(	TokenNameLPAREN	
GraphicContext	TokenNameIdentifier	 Graphic Context
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toSVGTransform	TokenNameIdentifier	 to SVG Transform
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getTransformStack	TokenNameIdentifier	 get Transform Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method tries to collapse the transform stack into an SVG * string as compact as possible while still conveying the semantic * of the stack. Successive stack elements of the same kind (e.g., two * successive transforms or scales) are collapsed into a single element. * * @param transformStack sequence of transform that should * be converted to an SVG transform attribute equivalent */	TokenNameCOMMENT_JAVADOC	 This method tries to collapse the transform stack into an SVG string as compact as possible while still conveying the semantic of the stack. Successive stack elements of the same kind (e.g., two successive transforms or scales) are collapsed into a single element. * @param transformStack sequence of transform that should be converted to an SVG transform attribute equivalent 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
toSVGTransform	TokenNameIdentifier	 to SVG Transform
(	TokenNameLPAREN	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
transformStack	TokenNameIdentifier	 transform Stack
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nTransforms	TokenNameIdentifier	 n Transforms
=	TokenNameEQUAL	
transformStack	TokenNameIdentifier	 transform Stack
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Append transforms in the presentation stack 	TokenNameCOMMENT_LINE	Append transforms in the presentation stack 
// 	TokenNameCOMMENT_LINE	 
Stack	TokenNameIdentifier	 Stack
presentation	TokenNameIdentifier	 presentation
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/** * Adapted push implementation */	TokenNameCOMMENT_JAVADOC	 Adapted push implementation 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
isIdentity	TokenNameIdentifier	 is Identity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// identity transform: don't push, 	TokenNameCOMMENT_LINE	identity transform: don't push, 
// and try to return top of stack 	TokenNameCOMMENT_LINE	and try to return top of stack 
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// non-identity: push, 	TokenNameCOMMENT_LINE	non-identity: push, 
// and return null 	TokenNameCOMMENT_LINE	and return null 
super	TokenNamesuper	
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adapted pop implementation */	TokenNameCOMMENT_JAVADOC	 Adapted pop implementation 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
super	TokenNamesuper	
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
canConcatenate	TokenNameIdentifier	 can Concatenate
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// We keep a separate 'presentation' stack, which contains 	TokenNameCOMMENT_LINE	We keep a separate 'presentation' stack, which contains 
// all concatenated elements. The top of this stack is the 	TokenNameCOMMENT_LINE	all concatenated elements. The top of this stack is the 
// element we try to concatenate onto. If this element 	TokenNameCOMMENT_LINE	element we try to concatenate onto. If this element 
// becomes an identity transform, we discard it and look at 	TokenNameCOMMENT_LINE	becomes an identity transform, we discard it and look at 
// the element underneath it instead. 	TokenNameCOMMENT_LINE	the element underneath it instead. 
// The presentation stack is guaranteed not to contain 	TokenNameCOMMENT_LINE	The presentation stack is guaranteed not to contain 
// identity transforms. 	TokenNameCOMMENT_LINE	identity transforms. 
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nTransforms	TokenNameIdentifier	 n Transforms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we do not have an element to concatenate onto, 	TokenNameCOMMENT_LINE	If we do not have an element to concatenate onto, 
// we grab one here. 	TokenNameCOMMENT_LINE	we grab one here. 
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
)	TokenNameRPAREN	
transformStack	TokenNameIdentifier	 transform Stack
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// try to concatenate as much as possible 	TokenNameCOMMENT_LINE	try to concatenate as much as possible 
canConcatenate	TokenNameIdentifier	 can Concatenate
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nTransforms	TokenNameIdentifier	 n Transforms
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
canConcatenate	TokenNameIdentifier	 can Concatenate
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
transformStack	TokenNameIdentifier	 transform Stack
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
canConcatenate	TokenNameIdentifier	 can Concatenate
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// loop variable assertion: 	TokenNameCOMMENT_LINE	loop variable assertion: 
// If "i" does not increment during this iteration, it is guaranteed 	TokenNameCOMMENT_LINE	If "i" does not increment during this iteration, it is guaranteed 
// to do so in the next, since "i" can only keep the same value as a 	TokenNameCOMMENT_LINE	to do so in the next, since "i" can only keep the same value as a 
// result of "element" having a non-null value on starting this 	TokenNameCOMMENT_LINE	result of "element" having a non-null value on starting this 
// iteration, which can only be the case if it was popped from the 	TokenNameCOMMENT_LINE	iteration, which can only be the case if it was popped from the 
// stack during the previous one. The stack does not contain 	TokenNameCOMMENT_LINE	stack during the previous one. The stack does not contain 
// identities, and since "i" has not grown, "element" has remained 	TokenNameCOMMENT_LINE	identities, and since "i" has not grown, "element" has remained 
// unchanged and will be pushed onto the stack again. "element" will 	TokenNameCOMMENT_LINE	unchanged and will be pushed onto the stack again. "element" will 
// then become null, so "i" will eventually increment. 	TokenNameCOMMENT_LINE	then become null, so "i" will eventually increment. 
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
// Get rid of identity transforms within the stack. 	TokenNameCOMMENT_LINE	Get rid of identity transforms within the stack. 
// If an identity is pushed, it is immediately removed, and 	TokenNameCOMMENT_LINE	If an identity is pushed, it is immediately removed, and 
// the current top of stack will be returned to concatenate onto. 	TokenNameCOMMENT_LINE	the current top of stack will be returned to concatenate onto. 
// Otherwise, null will be returned. 	TokenNameCOMMENT_LINE	Otherwise, null will be returned. 
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
)	TokenNameRPAREN	
presentation	TokenNameIdentifier	 presentation
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Push back teh last element popped, if not null 	TokenNameCOMMENT_LINE	Push back teh last element popped, if not null 
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
presentation	TokenNameIdentifier	 presentation
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Transform presentation stack to SVG 	TokenNameCOMMENT_LINE	Transform presentation stack to SVG 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
nPresentations	TokenNameIdentifier	 n Presentations
=	TokenNameEQUAL	
presentation	TokenNameIdentifier	 presentation
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
transformStackBuffer	TokenNameIdentifier	 transform Stack Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
nPresentations	TokenNameIdentifier	 n Presentations
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nPresentations	TokenNameIdentifier	 n Presentations
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformStackBuffer	TokenNameIdentifier	 transform Stack Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
convertTransform	TokenNameIdentifier	 convert Transform
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
)	TokenNameRPAREN	
presentation	TokenNameIdentifier	 presentation
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformStackBuffer	TokenNameIdentifier	 transform Stack Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SPACE	TokenNameIdentifier	 SPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
transformValue	TokenNameIdentifier	 transform Value
=	TokenNameEQUAL	
transformStackBuffer	TokenNameIdentifier	 transform Stack Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
transformValue	TokenNameIdentifier	 transform Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts an AffineTransform to an SVG transform string */	TokenNameCOMMENT_JAVADOC	 Converts an AffineTransform to an SVG transform string 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
convertTransform	TokenNameIdentifier	 convert Transform
(	TokenNameLPAREN	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
transformElement	TokenNameIdentifier	 transform Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
transformString	TokenNameIdentifier	 transform String
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
transformParameters	TokenNameIdentifier	 transform Parameters
=	TokenNameEQUAL	
transformElement	TokenNameIdentifier	 transform Element
.	TokenNameDOT	
getTransformParameters	TokenNameIdentifier	 get Transform Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
transformElement	TokenNameIdentifier	 transform Element
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
TRANSFORM_TRANSLATE	TokenNameIdentifier	 TRANSFORM  TRANSLATE
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
transformElement	TokenNameIdentifier	 transform Element
.	TokenNameDOT	
isIdentity	TokenNameIdentifier	 is Identity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
TRANSFORM_TRANSLATE	TokenNameIdentifier	 TRANSFORM  TRANSLATE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
OPEN_PARENTHESIS	TokenNameIdentifier	 OPEN  PARENTHESIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
COMMA	TokenNameIdentifier	 COMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
CLOSE_PARENTHESIS	TokenNameIdentifier	 CLOSE  PARENTHESIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
TRANSFORM_ROTATE	TokenNameIdentifier	 TRANSFORM  ROTATE
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
transformElement	TokenNameIdentifier	 transform Element
.	TokenNameDOT	
isIdentity	TokenNameIdentifier	 is Identity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
TRANSFORM_ROTATE	TokenNameIdentifier	 TRANSFORM  ROTATE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
OPEN_PARENTHESIS	TokenNameIdentifier	 OPEN  PARENTHESIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
radiansToDegrees	TokenNameIdentifier	 radians To Degrees
*	TokenNameMULTIPLY	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
CLOSE_PARENTHESIS	TokenNameIdentifier	 CLOSE  PARENTHESIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
TRANSFORM_SCALE	TokenNameIdentifier	 TRANSFORM  SCALE
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
transformElement	TokenNameIdentifier	 transform Element
.	TokenNameDOT	
isIdentity	TokenNameIdentifier	 is Identity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
TRANSFORM_SCALE	TokenNameIdentifier	 TRANSFORM  SCALE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
OPEN_PARENTHESIS	TokenNameIdentifier	 OPEN  PARENTHESIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
COMMA	TokenNameIdentifier	 COMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
CLOSE_PARENTHESIS	TokenNameIdentifier	 CLOSE  PARENTHESIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
TRANSFORM_SHEAR	TokenNameIdentifier	 TRANSFORM  SHEAR
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
transformElement	TokenNameIdentifier	 transform Element
.	TokenNameDOT	
isIdentity	TokenNameIdentifier	 is Identity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
TRANSFORM_MATRIX	TokenNameIdentifier	 TRANSFORM  MATRIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
OPEN_PARENTHESIS	TokenNameIdentifier	 OPEN  PARENTHESIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
COMMA	TokenNameIdentifier	 COMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
COMMA	TokenNameIdentifier	 COMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
COMMA	TokenNameIdentifier	 COMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
COMMA	TokenNameIdentifier	 COMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
COMMA	TokenNameIdentifier	 COMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
CLOSE_PARENTHESIS	TokenNameIdentifier	 CLOSE  PARENTHESIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
TRANSFORM_GENERAL	TokenNameIdentifier	 TRANSFORM  GENERAL
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
transformElement	TokenNameIdentifier	 transform Element
.	TokenNameDOT	
isIdentity	TokenNameIdentifier	 is Identity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
TRANSFORM_MATRIX	TokenNameIdentifier	 TRANSFORM  MATRIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
OPEN_PARENTHESIS	TokenNameIdentifier	 OPEN  PARENTHESIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
COMMA	TokenNameIdentifier	 COMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
COMMA	TokenNameIdentifier	 COMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
COMMA	TokenNameIdentifier	 COMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
COMMA	TokenNameIdentifier	 COMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
COMMA	TokenNameIdentifier	 COMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
CLOSE_PARENTHESIS	TokenNameIdentifier	 CLOSE  PARENTHESIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// This should never happen. If it does, there is a 	TokenNameCOMMENT_LINE	This should never happen. If it does, there is a 
// serious error. 	TokenNameCOMMENT_LINE	serious error. 
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
transformString	TokenNameIdentifier	 transform String
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
