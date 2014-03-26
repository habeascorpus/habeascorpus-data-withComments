/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Paint	TokenNameIdentifier	 Paint
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
PaintContext	TokenNameIdentifier	 Paint Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Rectangle	TokenNameIdentifier	 Rectangle
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
RenderingHints	TokenNameIdentifier	 Rendering Hints
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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
ColorModel	TokenNameIdentifier	 Color Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
Raster	TokenNameIdentifier	 Raster
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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
PadMode	TokenNameIdentifier	 Pad Mode
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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
renderable	TokenNameIdentifier	 renderable
.	TokenNameDOT	
Filter	TokenNameIdentifier	 Filter
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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
renderable	TokenNameIdentifier	 renderable
.	TokenNameDOT	
PadRable8Bit	TokenNameIdentifier	 Pad Rable8 Bit
;	TokenNameSEMICOLON	
/** * The PatternPaint class provides a way to fill a Shape with a a pattern * defined as a GVT Tree. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: PatternPaint.java 478188 2006-11-22 15:19:17Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 The PatternPaint class provides a way to fill a Shape with a a pattern defined as a GVT Tree. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: PatternPaint.java 478188 2006-11-22 15:19:17Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
PatternPaint	TokenNameIdentifier	 Pattern Paint
implements	TokenNameimplements	
Paint	TokenNameIdentifier	 Paint
{	TokenNameLBRACE	
/** * The <tt>GraphicsNode</tt> that this <tt>Paint</tt> uses to * produce the pixel pattern */	TokenNameCOMMENT_JAVADOC	 The <tt>GraphicsNode</tt> that this <tt>Paint</tt> uses to produce the pixel pattern 
private	TokenNameprivate	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
/** * The region to which this paint is constrained */	TokenNameCOMMENT_JAVADOC	 The region to which this paint is constrained 
private	TokenNameprivate	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
patternRegion	TokenNameIdentifier	 pattern Region
;	TokenNameSEMICOLON	
/** * Additional pattern transform, added on top of the * user space to device space transform (i.e., before * the tiling space */	TokenNameCOMMENT_JAVADOC	 Additional pattern transform, added on top of the user space to device space transform (i.e., before the tiling space 
private	TokenNameprivate	
AffineTransform	TokenNameIdentifier	 Affine Transform
patternTransform	TokenNameIdentifier	 pattern Transform
;	TokenNameSEMICOLON	
/* * The basic tile to fill the region with. * we replicate this out in the Context. */	TokenNameCOMMENT_BLOCK	 The basic tile to fill the region with. we replicate this out in the Context. 
private	TokenNameprivate	
Filter	TokenNameIdentifier	 Filter
tile	TokenNameIdentifier	 tile
;	TokenNameSEMICOLON	
/** * Controls whether or not the pattern overflows * the pattern tile */	TokenNameCOMMENT_JAVADOC	 Controls whether or not the pattern overflows the pattern tile 
private	TokenNameprivate	
boolean	TokenNameboolean	
overflow	TokenNameIdentifier	 overflow
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PatternPaintContext	TokenNameIdentifier	 Pattern Paint Context
lastContext	TokenNameIdentifier	 last Context
;	TokenNameSEMICOLON	
/** * Constructs a new <tt>PatternPaint</tt>. * * @param node Used to generate the paint pixel pattern * @param patternRegion Region to which this paint is constrained * @param overflow controls whether or not the node can overflow * the patternRegion. * @param patternTransform additional transform added on * top of the user space to device space transform. */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>PatternPaint</tt>. * @param node Used to generate the paint pixel pattern @param patternRegion Region to which this paint is constrained @param overflow controls whether or not the node can overflow the patternRegion. @param patternTransform additional transform added on top of the user space to device space transform. 
public	TokenNamepublic	
PatternPaint	TokenNameIdentifier	 Pattern Paint
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
patternRegion	TokenNameIdentifier	 pattern Region
,	TokenNameCOMMA	
boolean	TokenNameboolean	
overflow	TokenNameIdentifier	 overflow
,	TokenNameCOMMA	
AffineTransform	TokenNameIdentifier	 Affine Transform
patternTransform	TokenNameIdentifier	 pattern Transform
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
patternRegion	TokenNameIdentifier	 pattern Region
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
patternRegion	TokenNameIdentifier	 pattern Region
=	TokenNameEQUAL	
patternRegion	TokenNameIdentifier	 pattern Region
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
overflow	TokenNameIdentifier	 overflow
=	TokenNameEQUAL	
overflow	TokenNameIdentifier	 overflow
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
patternTransform	TokenNameIdentifier	 pattern Transform
=	TokenNameEQUAL	
patternTransform	TokenNameIdentifier	 pattern Transform
;	TokenNameSEMICOLON	
// Wrap the input node so that the primitivePaint 	TokenNameCOMMENT_LINE	Wrap the input node so that the primitivePaint 
// in GraphicsNodeRable takes the filter, clip.... 	TokenNameCOMMENT_LINE	in GraphicsNodeRable takes the filter, clip.... 
// into account. 	TokenNameCOMMENT_LINE	into account. 
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
comp	TokenNameIdentifier	 comp
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Filter	TokenNameIdentifier	 Filter
gnr	TokenNameIdentifier	 gnr
=	TokenNameEQUAL	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
getGraphicsNodeRable	TokenNameIdentifier	 get Graphics Node Rable
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
padBounds	TokenNameIdentifier	 pad Bounds
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
)	TokenNameRPAREN	
patternRegion	TokenNameIdentifier	 pattern Region
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// When there is overflow, make sure we take the full node bounds into 	TokenNameCOMMENT_LINE	When there is overflow, make sure we take the full node bounds into 
// account. 	TokenNameCOMMENT_LINE	account. 
if	TokenNameif	
(	TokenNameLPAREN	
overflow	TokenNameIdentifier	 overflow
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
nodeBounds	TokenNameIdentifier	 node Bounds
=	TokenNameEQUAL	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("Comp Bounds : " + nodeBounds); 	TokenNameCOMMENT_LINE	System.out.println("Comp Bounds : " + nodeBounds); 
// System.out.println("Node Bounds : " + node.getBounds(gnrc)); 	TokenNameCOMMENT_LINE	System.out.println("Node Bounds : " + node.getBounds(gnrc)); 
padBounds	TokenNameIdentifier	 pad Bounds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
nodeBounds	TokenNameIdentifier	 node Bounds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println("Pattern region : " + patternRegion); 	TokenNameCOMMENT_LINE	System.out.println("Pattern region : " + patternRegion); 
// System.out.println("Node txf : " + node.getTransform()); 	TokenNameCOMMENT_LINE	System.out.println("Node txf : " + node.getTransform()); 
tile	TokenNameIdentifier	 tile
=	TokenNameEQUAL	
new	TokenNamenew	
PadRable8Bit	TokenNameIdentifier	 Pad Rable8 Bit
(	TokenNameLPAREN	
gnr	TokenNameIdentifier	 gnr
,	TokenNameCOMMA	
padBounds	TokenNameIdentifier	 pad Bounds
,	TokenNameCOMMA	
PadMode	TokenNameIdentifier	 Pad Mode
.	TokenNameDOT	
ZERO_PAD	TokenNameIdentifier	 ZERO  PAD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the graphics node that define the pattern. */	TokenNameCOMMENT_JAVADOC	 Returns the graphics node that define the pattern. 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getGraphicsNode	TokenNameIdentifier	 get Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the pattern region. */	TokenNameCOMMENT_JAVADOC	 Returns the pattern region. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getPatternRect	TokenNameIdentifier	 get Pattern Rect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
)	TokenNameRPAREN	
patternRegion	TokenNameIdentifier	 pattern Region
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the additional transform of the pattern paint. */	TokenNameCOMMENT_JAVADOC	 Returns the additional transform of the pattern paint. 
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
getPatternTransform	TokenNameIdentifier	 get Pattern Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
patternTransform	TokenNameIdentifier	 pattern Transform
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getOverflow	TokenNameIdentifier	 get Overflow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
overflow	TokenNameIdentifier	 overflow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a context used to generate the pattern. */	TokenNameCOMMENT_JAVADOC	 Creates and returns a context used to generate the pattern. 
public	TokenNamepublic	
PaintContext	TokenNameIdentifier	 Paint Context
createContext	TokenNameIdentifier	 create Context
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
deviceBounds	TokenNameIdentifier	 device Bounds
,	TokenNameCOMMA	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
userBounds	TokenNameIdentifier	 user Bounds
,	TokenNameCOMMA	
AffineTransform	TokenNameIdentifier	 Affine Transform
xform	TokenNameIdentifier	 xform
,	TokenNameCOMMA	
RenderingHints	TokenNameIdentifier	 Rendering Hints
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Concatenate the patternTransform to xform 	TokenNameCOMMENT_LINE	Concatenate the patternTransform to xform 
if	TokenNameif	
(	TokenNameLPAREN	
patternTransform	TokenNameIdentifier	 pattern Transform
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xform	TokenNameIdentifier	 xform
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
xform	TokenNameIdentifier	 xform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xform	TokenNameIdentifier	 xform
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
patternTransform	TokenNameIdentifier	 pattern Transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
lastContext	TokenNameIdentifier	 last Context
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
lastContext	TokenNameIdentifier	 last Context
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
xform	TokenNameIdentifier	 xform
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastContext	TokenNameIdentifier	 last Context
.	TokenNameDOT	
getUsr2Dev	TokenNameIdentifier	 get Usr2 Dev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
q	TokenNameIdentifier	 q
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
q	TokenNameIdentifier	 q
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
q	TokenNameIdentifier	 q
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
q	TokenNameIdentifier	 q
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
q	TokenNameIdentifier	 q
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
q	TokenNameIdentifier	 q
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
lastContext	TokenNameIdentifier	 last Context
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
PatternPaintContextWrapper	TokenNameIdentifier	 Pattern Paint Context Wrapper
(	TokenNameLPAREN	
lastContext	TokenNameIdentifier	 last Context
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// System.out.println("CreateContext Called: " + this); 	TokenNameCOMMENT_LINE	System.out.println("CreateContext Called: " + this); 
// System.out.println("CM : " + cm); 	TokenNameCOMMENT_LINE	System.out.println("CM : " + cm); 
// System.out.println("xForm : " + xform); 	TokenNameCOMMENT_LINE	System.out.println("xForm : " + xform); 
lastContext	TokenNameIdentifier	 last Context
=	TokenNameEQUAL	
new	TokenNamenew	
PatternPaintContext	TokenNameIdentifier	 Pattern Paint Context
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
xform	TokenNameIdentifier	 xform
,	TokenNameCOMMA	
hints	TokenNameIdentifier	 hints
,	TokenNameCOMMA	
tile	TokenNameIdentifier	 tile
,	TokenNameCOMMA	
patternRegion	TokenNameIdentifier	 pattern Region
,	TokenNameCOMMA	
overflow	TokenNameIdentifier	 overflow
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lastContext	TokenNameIdentifier	 last Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the transparency mode for this pattern paint. */	TokenNameCOMMENT_JAVADOC	 Returns the transparency mode for this pattern paint. 
public	TokenNamepublic	
int	TokenNameint	
getTransparency	TokenNameIdentifier	 get Transparency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TRANSLUCENT	TokenNameIdentifier	 TRANSLUCENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
PatternPaintContextWrapper	TokenNameIdentifier	 Pattern Paint Context Wrapper
implements	TokenNameimplements	
PaintContext	TokenNameIdentifier	 Paint Context
{	TokenNameLBRACE	
PatternPaintContext	TokenNameIdentifier	 Pattern Paint Context
ppc	TokenNameIdentifier	 ppc
;	TokenNameSEMICOLON	
int	TokenNameint	
xShift	TokenNameIdentifier	 x Shift
,	TokenNameCOMMA	
yShift	TokenNameIdentifier	 y Shift
;	TokenNameSEMICOLON	
PatternPaintContextWrapper	TokenNameIdentifier	 Pattern Paint Context Wrapper
(	TokenNameLPAREN	
PatternPaintContext	TokenNameIdentifier	 Pattern Paint Context
ppc	TokenNameIdentifier	 ppc
,	TokenNameCOMMA	
int	TokenNameint	
xShift	TokenNameIdentifier	 x Shift
,	TokenNameCOMMA	
int	TokenNameint	
yShift	TokenNameIdentifier	 y Shift
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ppc	TokenNameIdentifier	 ppc
=	TokenNameEQUAL	
ppc	TokenNameIdentifier	 ppc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
xShift	TokenNameIdentifier	 x Shift
=	TokenNameEQUAL	
xShift	TokenNameIdentifier	 x Shift
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
yShift	TokenNameIdentifier	 y Shift
=	TokenNameEQUAL	
yShift	TokenNameIdentifier	 y Shift
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColorModel	TokenNameIdentifier	 Color Model
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ppc	TokenNameIdentifier	 ppc
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Raster	TokenNameIdentifier	 Raster
getRaster	TokenNameIdentifier	 get Raster
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ppc	TokenNameIdentifier	 ppc
.	TokenNameDOT	
getRaster	TokenNameIdentifier	 get Raster
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
xShift	TokenNameIdentifier	 x Shift
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
yShift	TokenNameIdentifier	 y Shift
,	TokenNameCOMMA	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
