/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
svg12	TokenNameIdentifier	 svg12
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Dimension	TokenNameIdentifier	 Dimension
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Graphics2D	TokenNameIdentifier	 Graphics2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Shape	TokenNameIdentifier	 Shape
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
AffineTransform	TokenNameIdentifier	 Affine Transform
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
SoftReference	TokenNameIdentifier	 Soft Reference
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
BridgeContext	TokenNameIdentifier	 Bridge Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
GVTBuilder	TokenNameIdentifier	 GVT Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
AbstractGraphicsNode	TokenNameIdentifier	 Abstract Graphics Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
GraphicsNode	TokenNameIdentifier	 Graphics Node
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
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * RasterRable This is used to wrap a Rendered Image back into the * RenderableImage world. * * @author <a href="mailto:Thomas.DeWeese@Kodak.com">Thomas DeWeese</a> * @version $Id: MultiResGraphicsNode.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 RasterRable This is used to wrap a Rendered Image back into the RenderableImage world. * @author <a href="mailto:Thomas.DeWeese@Kodak.com">Thomas DeWeese</a> @version $Id: MultiResGraphicsNode.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
MultiResGraphicsNode	TokenNameIdentifier	 Multi Res Graphics Node
extends	TokenNameextends	
AbstractGraphicsNode	TokenNameIdentifier	 Abstract Graphics Node
implements	TokenNameimplements	
SVGConstants	TokenNameIdentifier	 SVG Constants
{	TokenNameLBRACE	
SoftReference	TokenNameIdentifier	 Soft Reference
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcs	TokenNameIdentifier	 srcs
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcElems	TokenNameIdentifier	 src Elems
;	TokenNameSEMICOLON	
Dimension	TokenNameIdentifier	 Dimension
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
minSz	TokenNameIdentifier	 min Sz
;	TokenNameSEMICOLON	
Dimension	TokenNameIdentifier	 Dimension
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
maxSz	TokenNameIdentifier	 max Sz
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
bounds	TokenNameIdentifier	 bounds
;	TokenNameSEMICOLON	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
multiImgElem	TokenNameIdentifier	 multi Img Elem
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MultiResGraphicsNode	TokenNameIdentifier	 Multi Res Graphics Node
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
multiImgElem	TokenNameIdentifier	 multi Img Elem
,	TokenNameCOMMA	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcElems	TokenNameIdentifier	 src Elems
,	TokenNameCOMMA	
Dimension	TokenNameIdentifier	 Dimension
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
minSz	TokenNameIdentifier	 min Sz
,	TokenNameCOMMA	
Dimension	TokenNameIdentifier	 Dimension
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
maxSz	TokenNameIdentifier	 max Sz
,	TokenNameCOMMA	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
multiImgElem	TokenNameIdentifier	 multi Img Elem
=	TokenNameEQUAL	
multiImgElem	TokenNameIdentifier	 multi Img Elem
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
srcElems	TokenNameIdentifier	 src Elems
=	TokenNameEQUAL	
new	TokenNamenew	
Element	TokenNameIdentifier	 Element
[	TokenNameLBRACKET	
srcElems	TokenNameIdentifier	 src Elems
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minSz	TokenNameIdentifier	 min Sz
=	TokenNameEQUAL	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
[	TokenNameLBRACKET	
srcElems	TokenNameIdentifier	 src Elems
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxSz	TokenNameIdentifier	 max Sz
=	TokenNameEQUAL	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
[	TokenNameLBRACKET	
srcElems	TokenNameIdentifier	 src Elems
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
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
srcElems	TokenNameIdentifier	 src Elems
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
srcElems	TokenNameIdentifier	 src Elems
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
srcElems	TokenNameIdentifier	 src Elems
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minSz	TokenNameIdentifier	 min Sz
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
minSz	TokenNameIdentifier	 min Sz
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxSz	TokenNameIdentifier	 max Sz
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
maxSz	TokenNameIdentifier	 max Sz
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
srcs	TokenNameIdentifier	 srcs
=	TokenNameEQUAL	
new	TokenNamenew	
SoftReference	TokenNameIdentifier	 Soft Reference
[	TokenNameLBRACKET	
srcElems	TokenNameIdentifier	 src Elems
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
bounds	TokenNameIdentifier	 bounds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Paints this node without applying Filter, Mask, Composite, and clip. * * @param g2d the Graphics2D to use */	TokenNameCOMMENT_JAVADOC	 Paints this node without applying Filter, Mask, Composite, and clip. * @param g2d the Graphics2D to use 
public	TokenNamepublic	
void	TokenNamevoid	
primitivePaint	TokenNameIdentifier	 primitive Paint
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get the current affine transform 	TokenNameCOMMENT_LINE	get the current affine transform 
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
scx	TokenNameIdentifier	 scx
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getShearY	TokenNameIdentifier	 get Shear Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getShearY	TokenNameIdentifier	 get Shear Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getScaleX	TokenNameIdentifier	 get Scale X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getScaleX	TokenNameIdentifier	 get Scale X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
scy	TokenNameIdentifier	 scy
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getShearX	TokenNameIdentifier	 get Shear X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getShearX	TokenNameIdentifier	 get Shear X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getScaleY	TokenNameIdentifier	 get Scale Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getScaleY	TokenNameIdentifier	 get Scale Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GraphicsNode	TokenNameIdentifier	 Graphics Node
gn	TokenNameIdentifier	 gn
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scx	TokenNameIdentifier	 scx
;	TokenNameSEMICOLON	
double	TokenNamedouble	
minDist	TokenNameIdentifier	 min Dist
=	TokenNameEQUAL	
calcDist	TokenNameIdentifier	 calc Dist
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
minSz	TokenNameIdentifier	 min Sz
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
maxSz	TokenNameIdentifier	 max Sz
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
minIdx	TokenNameIdentifier	 min Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// System.err.println("Width: " + w); 	TokenNameCOMMENT_LINE	System.err.println("Width: " + w); 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
minSz	TokenNameIdentifier	 min Sz
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
dist	TokenNameIdentifier	 dist
=	TokenNameEQUAL	
calcDist	TokenNameIdentifier	 calc Dist
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
minSz	TokenNameIdentifier	 min Sz
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
maxSz	TokenNameIdentifier	 max Sz
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.err.println("Dist: " + dist); 	TokenNameCOMMENT_LINE	System.err.println("Dist: " + dist); 
if	TokenNameif	
(	TokenNameLPAREN	
dist	TokenNameIdentifier	 dist
<	TokenNameLESS	
minDist	TokenNameIdentifier	 min Dist
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minDist	TokenNameIdentifier	 min Dist
=	TokenNameEQUAL	
dist	TokenNameIdentifier	 dist
;	TokenNameSEMICOLON	
minIdx	TokenNameIdentifier	 min Idx
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
minSz	TokenNameIdentifier	 min Sz
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
>=	TokenNameGREATER_EQUAL	
minSz	TokenNameIdentifier	 min Sz
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
maxSz	TokenNameIdentifier	 max Sz
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
<=	TokenNameLESS_EQUAL	
maxSz	TokenNameIdentifier	 max Sz
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We have a range match 	TokenNameCOMMENT_LINE	We have a range match 
// System.err.println("Match: " + i + " " + 	TokenNameCOMMENT_LINE	System.err.println("Match: " + i + " " + 
// minSz[i] + " -> " + maxSz[i]); 	TokenNameCOMMENT_LINE	minSz[i] + " -> " + maxSz[i]); 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
minIdx	TokenNameIdentifier	 min Idx
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
minIdx	TokenNameIdentifier	 min Idx
;	TokenNameSEMICOLON	
gn	TokenNameIdentifier	 gn
=	TokenNameEQUAL	
getGraphicsNode	TokenNameIdentifier	 get Graphics Node
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gn	TokenNameIdentifier	 gn
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// This makes sure that the image 'pushes out' to it's pixel 	TokenNameCOMMENT_LINE	This makes sure that the image 'pushes out' to it's pixel 
// bounderies. 	TokenNameCOMMENT_LINE	bounderies. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
gnBounds	TokenNameIdentifier	 gn Bounds
=	TokenNameEQUAL	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gnBounds	TokenNameIdentifier	 gn Bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
gnDevW	TokenNameIdentifier	 gn Dev W
=	TokenNameEQUAL	
gnBounds	TokenNameIdentifier	 gn Bounds
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scx	TokenNameIdentifier	 scx
;	TokenNameSEMICOLON	
double	TokenNamedouble	
gnDevH	TokenNameIdentifier	 gn Dev H
=	TokenNameEQUAL	
gnBounds	TokenNameIdentifier	 gn Bounds
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scy	TokenNameIdentifier	 scy
;	TokenNameSEMICOLON	
double	TokenNamedouble	
gnDevX	TokenNameIdentifier	 gn Dev X
=	TokenNameEQUAL	
gnBounds	TokenNameIdentifier	 gn Bounds
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scx	TokenNameIdentifier	 scx
;	TokenNameSEMICOLON	
double	TokenNamedouble	
gnDevY	TokenNameIdentifier	 gn Dev Y
=	TokenNameEQUAL	
gnBounds	TokenNameIdentifier	 gn Bounds
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scy	TokenNameIdentifier	 scy
;	TokenNameSEMICOLON	
double	TokenNamedouble	
gnDevX0	TokenNameIdentifier	 gn Dev X0
,	TokenNameCOMMA	
gnDevX1	TokenNameIdentifier	 gn Dev X1
,	TokenNameCOMMA	
gnDevY0	TokenNameIdentifier	 gn Dev Y0
,	TokenNameCOMMA	
gnDevY1	TokenNameIdentifier	 gn Dev Y1
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gnDevW	TokenNameIdentifier	 gn Dev W
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gnDevX0	TokenNameIdentifier	 gn Dev X0
=	TokenNameEQUAL	
gnDevX	TokenNameIdentifier	 gn Dev X
+	TokenNamePLUS	
gnDevW	TokenNameIdentifier	 gn Dev W
;	TokenNameSEMICOLON	
gnDevX1	TokenNameIdentifier	 gn Dev X1
=	TokenNameEQUAL	
gnDevX	TokenNameIdentifier	 gn Dev X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
gnDevX0	TokenNameIdentifier	 gn Dev X0
=	TokenNameEQUAL	
gnDevX	TokenNameIdentifier	 gn Dev X
;	TokenNameSEMICOLON	
gnDevX1	TokenNameIdentifier	 gn Dev X1
=	TokenNameEQUAL	
gnDevX	TokenNameIdentifier	 gn Dev X
+	TokenNamePLUS	
gnDevW	TokenNameIdentifier	 gn Dev W
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gnDevH	TokenNameIdentifier	 gn Dev H
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gnDevY0	TokenNameIdentifier	 gn Dev Y0
=	TokenNameEQUAL	
gnDevY	TokenNameIdentifier	 gn Dev Y
+	TokenNamePLUS	
gnDevH	TokenNameIdentifier	 gn Dev H
;	TokenNameSEMICOLON	
gnDevY1	TokenNameIdentifier	 gn Dev Y1
=	TokenNameEQUAL	
gnDevY	TokenNameIdentifier	 gn Dev Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
gnDevY0	TokenNameIdentifier	 gn Dev Y0
=	TokenNameEQUAL	
gnDevY	TokenNameIdentifier	 gn Dev Y
;	TokenNameSEMICOLON	
gnDevY1	TokenNameIdentifier	 gn Dev Y1
=	TokenNameEQUAL	
gnDevY	TokenNameIdentifier	 gn Dev Y
+	TokenNamePLUS	
gnDevH	TokenNameIdentifier	 gn Dev H
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This calculate the width/height in pixels given 'worst 	TokenNameCOMMENT_LINE	This calculate the width/height in pixels given 'worst 
// case' assessment. 	TokenNameCOMMENT_LINE	case' assessment. 
gnDevW	TokenNameIdentifier	 gn Dev W
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
gnDevX1	TokenNameIdentifier	 gn Dev X1
)	TokenNameRPAREN	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
gnDevX0	TokenNameIdentifier	 gn Dev X0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gnDevH	TokenNameIdentifier	 gn Dev H
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
gnDevY1	TokenNameIdentifier	 gn Dev Y1
)	TokenNameRPAREN	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
gnDevY0	TokenNameIdentifier	 gn Dev Y0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scx	TokenNameIdentifier	 scx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
gnDevW	TokenNameIdentifier	 gn Dev W
/	TokenNameDIVIDE	
gnBounds	TokenNameIdentifier	 gn Bounds
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
scx	TokenNameIdentifier	 scx
;	TokenNameSEMICOLON	
scy	TokenNameIdentifier	 scy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
gnDevH	TokenNameIdentifier	 gn Dev H
/	TokenNameDIVIDE	
gnBounds	TokenNameIdentifier	 gn Bounds
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
scy	TokenNameIdentifier	 scy
;	TokenNameSEMICOLON	
// This scales things up slightly so our edges fall on device 	TokenNameCOMMENT_LINE	This scales things up slightly so our edges fall on device 
// pixel boundries. 	TokenNameCOMMENT_LINE	pixel boundries. 
AffineTransform	TokenNameIdentifier	 Affine Transform
nat	TokenNameIdentifier	 nat
=	TokenNameEQUAL	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nat	TokenNameIdentifier	 nat
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
nat	TokenNameIdentifier	 nat
.	TokenNameDOT	
getScaleX	TokenNameIdentifier	 get Scale X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scx	TokenNameIdentifier	 scx
,	TokenNameCOMMA	
nat	TokenNameIdentifier	 nat
.	TokenNameDOT	
getShearY	TokenNameIdentifier	 get Shear Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scx	TokenNameIdentifier	 scx
,	TokenNameCOMMA	
nat	TokenNameIdentifier	 nat
.	TokenNameDOT	
getShearX	TokenNameIdentifier	 get Shear X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scy	TokenNameIdentifier	 scy
,	TokenNameCOMMA	
nat	TokenNameIdentifier	 nat
.	TokenNameDOT	
getScaleY	TokenNameIdentifier	 get Scale Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scy	TokenNameIdentifier	 scy
,	TokenNameCOMMA	
nat	TokenNameIdentifier	 nat
.	TokenNameDOT	
getTranslateX	TokenNameIdentifier	 get Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
nat	TokenNameIdentifier	 nat
.	TokenNameDOT	
getTranslateY	TokenNameIdentifier	 get Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
nat	TokenNameIdentifier	 nat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// double sx = bounds.getWidth()/sizes[idx].getWidth(); 	TokenNameCOMMENT_LINE	double sx = bounds.getWidth()/sizes[idx].getWidth(); 
// double sy = bounds.getHeight()/sizes[idx].getHeight(); 	TokenNameCOMMENT_LINE	double sy = bounds.getHeight()/sizes[idx].getHeight(); 
// System.err.println("Scale: [" + sx + ", " + sy + "]"); 	TokenNameCOMMENT_LINE	System.err.println("Scale: [" + sx + ", " + sy + "]"); 
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This function can be tweaked to any extent. This is a very 	TokenNameCOMMENT_LINE	This function can be tweaked to any extent. This is a very 
// simple measure of 'goodness'. It has two main flaws as is, 	TokenNameCOMMENT_LINE	simple measure of 'goodness'. It has two main flaws as is, 
// mostly in regards to distance calc with 'unbounded' ranges. 	TokenNameCOMMENT_LINE	mostly in regards to distance calc with 'unbounded' ranges. 
// First it doesn't punish if the distance is the wrong way on the 	TokenNameCOMMENT_LINE	First it doesn't punish if the distance is the wrong way on the 
// unbounded range (so over a max by 10 is the same as under a max 	TokenNameCOMMENT_LINE	unbounded range (so over a max by 10 is the same as under a max 
// by 10) this is compensated by the absolute preference for 	TokenNameCOMMENT_LINE	by 10) this is compensated by the absolute preference for 
// matches 'in range' above. The other issue is that unbounded 	TokenNameCOMMENT_LINE	matches 'in range' above. The other issue is that unbounded 
// ranages tend to 'win' when the value is near the boundry point 	TokenNameCOMMENT_LINE	ranages tend to 'win' when the value is near the boundry point 
// since they use distance from the boundry point rather than the 	TokenNameCOMMENT_LINE	since they use distance from the boundry point rather than the 
// middle of the range. As it is this seems to meet all the 	TokenNameCOMMENT_LINE	middle of the range. As it is this seems to meet all the 
// requirements of the SVG specification however. 	TokenNameCOMMENT_LINE	requirements of the SVG specification however. 
public	TokenNamepublic	
double	TokenNamedouble	
calcDist	TokenNameIdentifier	 calc Dist
(	TokenNameLPAREN	
double	TokenNamedouble	
loc	TokenNameIdentifier	 loc
,	TokenNameCOMMA	
Dimension	TokenNameIdentifier	 Dimension
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
Dimension	TokenNameIdentifier	 Dimension
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
10E10	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// very large number. 	TokenNameCOMMENT_LINE	very large number. 
else	TokenNameelse	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
-	TokenNameMINUS	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
-	TokenNameMINUS	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
double	TokenNamedouble	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
width	TokenNameIdentifier	 width
+	TokenNamePLUS	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
-	TokenNameMINUS	
mid	TokenNameIdentifier	 mid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the bounds of the area covered by this node's primitive paint. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area covered by this node's primitive paint. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getPrimitiveBounds	TokenNameIdentifier	 get Primitive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bounds	TokenNameIdentifier	 bounds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getGeometryBounds	TokenNameIdentifier	 get Geometry Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bounds	TokenNameIdentifier	 bounds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getSensitiveBounds	TokenNameIdentifier	 get Sensitive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bounds	TokenNameIdentifier	 bounds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the outline of this node. */	TokenNameCOMMENT_JAVADOC	 Returns the outline of this node. 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bounds	TokenNameIdentifier	 bounds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getGraphicsNode	TokenNameIdentifier	 get Graphics Node
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
srcs	TokenNameIdentifier	 srcs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
srcs	TokenNameIdentifier	 srcs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
GVTBuilder	TokenNameIdentifier	 GVT Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getGVTBuilder	TokenNameIdentifier	 get GVT Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GraphicsNode	TokenNameIdentifier	 Graphics Node
gn	TokenNameIdentifier	 gn
;	TokenNameSEMICOLON	
gn	TokenNameIdentifier	 gn
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
srcElems	TokenNameIdentifier	 src Elems
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcs	TokenNameIdentifier	 srcs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
SoftReference	TokenNameIdentifier	 Soft Reference
(	TokenNameLPAREN	
gn	TokenNameIdentifier	 gn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gn	TokenNameIdentifier	 gn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
