/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
apps	TokenNameIdentifier	 apps
.	TokenNameDOT	
svgbrowser	TokenNameIdentifier	 svgbrowser
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
BasicStroke	TokenNameIdentifier	 Basic Stroke
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Color	TokenNameIdentifier	 Color
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Graphics	TokenNameIdentifier	 Graphics
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
Rectangle	TokenNameIdentifier	 Rectangle
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
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JSVGCanvas	TokenNameIdentifier	 JSVG Canvas
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
Overlay	TokenNameIdentifier	 Overlay
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
/** * Manages element overlay on the canvas. * * @version $Id$ */	TokenNameCOMMENT_JAVADOC	 Manages element overlay on the canvas. * @version $Id$ 
public	TokenNamepublic	
class	TokenNameclass	
ElementOverlayManager	TokenNameIdentifier	 Element Overlay Manager
{	TokenNameLBRACE	
/** * The color of the outline of the element overlay. */	TokenNameCOMMENT_JAVADOC	 The color of the outline of the element overlay. 
protected	TokenNameprotected	
Color	TokenNameIdentifier	 Color
elementOverlayStrokeColor	TokenNameIdentifier	 element Overlay Stroke Color
=	TokenNameEQUAL	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
black	TokenNameIdentifier	 black
;	TokenNameSEMICOLON	
/** * The color of the element overlay. */	TokenNameCOMMENT_JAVADOC	 The color of the element overlay. 
protected	TokenNameprotected	
Color	TokenNameIdentifier	 Color
elementOverlayColor	TokenNameIdentifier	 element Overlay Color
=	TokenNameEQUAL	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
white	TokenNameIdentifier	 white
;	TokenNameSEMICOLON	
/** * The xor mode. */	TokenNameCOMMENT_JAVADOC	 The xor mode. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
xorMode	TokenNameIdentifier	 xor Mode
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * The canvas. */	TokenNameCOMMENT_JAVADOC	 The canvas. 
protected	TokenNameprotected	
JSVGCanvas	TokenNameIdentifier	 JSVG Canvas
canvas	TokenNameIdentifier	 canvas
;	TokenNameSEMICOLON	
/** * The element overlay. */	TokenNameCOMMENT_JAVADOC	 The element overlay. 
protected	TokenNameprotected	
Overlay	TokenNameIdentifier	 Overlay
elementOverlay	TokenNameIdentifier	 element Overlay
=	TokenNameEQUAL	
new	TokenNamenew	
ElementOverlay	TokenNameIdentifier	 Element Overlay
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Elements to paint. */	TokenNameCOMMENT_JAVADOC	 Elements to paint. 
protected	TokenNameprotected	
ArrayList	TokenNameIdentifier	 Array List
elements	TokenNameIdentifier	 elements
;	TokenNameSEMICOLON	
/** * The controller for the element overlay. */	TokenNameCOMMENT_JAVADOC	 The controller for the element overlay. 
protected	TokenNameprotected	
ElementOverlayController	TokenNameIdentifier	 Element Overlay Controller
controller	TokenNameIdentifier	 controller
;	TokenNameSEMICOLON	
/** * Whether the ElementOverlay is enabled. */	TokenNameCOMMENT_JAVADOC	 Whether the ElementOverlay is enabled. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isOverlayEnabled	TokenNameIdentifier	 is Overlay Enabled
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Constructor. * * @param canvas * The parent canvas */	TokenNameCOMMENT_JAVADOC	 Constructor. * @param canvas The parent canvas 
public	TokenNamepublic	
ElementOverlayManager	TokenNameIdentifier	 Element Overlay Manager
(	TokenNameLPAREN	
JSVGCanvas	TokenNameIdentifier	 JSVG Canvas
canvas	TokenNameIdentifier	 canvas
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
canvas	TokenNameIdentifier	 canvas
=	TokenNameEQUAL	
canvas	TokenNameIdentifier	 canvas
;	TokenNameSEMICOLON	
elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
canvas	TokenNameIdentifier	 canvas
.	TokenNameDOT	
getOverlays	TokenNameIdentifier	 get Overlays
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
elementOverlay	TokenNameIdentifier	 element Overlay
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds an element to the element selection. * * @param elem * The element to add */	TokenNameCOMMENT_JAVADOC	 Adds an element to the element selection. * @param elem The element to add 
public	TokenNamepublic	
void	TokenNamevoid	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the element from the element selection and adds its bound to the * 'dirty' region. * * @param elem * The element to remove */	TokenNameCOMMENT_JAVADOC	 Removes the element from the element selection and adds its bound to the 'dirty' region. * @param elem The element to remove 
public	TokenNamepublic	
void	TokenNamevoid	
removeElement	TokenNameIdentifier	 remove Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// // Gets the area that should be repainted 	TokenNameCOMMENT_LINE	// Gets the area that should be repainted 
// Rectangle currentElementBounds = getElementBounds(elem); 	TokenNameCOMMENT_LINE	Rectangle currentElementBounds = getElementBounds(elem); 
// if (dirtyArea == null) { 	TokenNameCOMMENT_LINE	if (dirtyArea == null) { 
// dirtyArea = currentElementBounds; 	TokenNameCOMMENT_LINE	dirtyArea = currentElementBounds; 
// } else if (currentElementBounds != null) { 	TokenNameCOMMENT_LINE	} else if (currentElementBounds != null) { 
// dirtyArea.add(currentElementBounds); 	TokenNameCOMMENT_LINE	dirtyArea.add(currentElementBounds); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Removes all elements from the element selection list. */	TokenNameCOMMENT_JAVADOC	 Removes all elements from the element selection list. 
public	TokenNamepublic	
void	TokenNamevoid	
removeElements	TokenNameIdentifier	 remove Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repaint	TokenNameIdentifier	 repaint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current selection bounds. * * @return the current selection bounds */	TokenNameCOMMENT_JAVADOC	 Get the current selection bounds. * @return the current selection bounds 
protected	TokenNameprotected	
Rectangle	TokenNameIdentifier	 Rectangle
getAllElementsBounds	TokenNameIdentifier	 get All Elements Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
resultBound	TokenNameIdentifier	 result Bound
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
currentElement	TokenNameIdentifier	 current Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
currentBound	TokenNameIdentifier	 current Bound
=	TokenNameEQUAL	
getElementBounds	TokenNameIdentifier	 get Element Bounds
(	TokenNameLPAREN	
currentElement	TokenNameIdentifier	 current Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resultBound	TokenNameIdentifier	 result Bound
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resultBound	TokenNameIdentifier	 result Bound
=	TokenNameEQUAL	
currentBound	TokenNameIdentifier	 current Bound
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
resultBound	TokenNameIdentifier	 result Bound
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentBound	TokenNameIdentifier	 current Bound
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
resultBound	TokenNameIdentifier	 result Bound
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The bounds of a given element. * * @param elem * The given element * @return Rectangle bounds */	TokenNameCOMMENT_JAVADOC	 The bounds of a given element. * @param elem The given element @return Rectangle bounds 
protected	TokenNameprotected	
Rectangle	TokenNameIdentifier	 Rectangle
getElementBounds	TokenNameIdentifier	 get Element Bounds
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getElementBounds	TokenNameIdentifier	 get Element Bounds
(	TokenNameLPAREN	
canvas	TokenNameIdentifier	 canvas
.	TokenNameDOT	
getUpdateManager	TokenNameIdentifier	 get Update Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBridgeContext	TokenNameIdentifier	 get Bridge Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGraphicsNode	TokenNameIdentifier	 get Graphics Node
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The bounds of a given graphics node. * * @param node * The given graphics node * @return the bounds */	TokenNameCOMMENT_JAVADOC	 The bounds of a given graphics node. * @param node The given graphics node @return the bounds 
protected	TokenNameprotected	
Rectangle	TokenNameIdentifier	 Rectangle
getElementBounds	TokenNameIdentifier	 get Element Bounds
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
canvas	TokenNameIdentifier	 canvas
.	TokenNameDOT	
getRenderingTransform	TokenNameIdentifier	 get Rendering Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Shape	TokenNameIdentifier	 Shape
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
outset	TokenNameIdentifier	 outset
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Increases the given rectangle area for a given amount of units in a * rectangle increasement manner. * * @param r * The given rectangle * @param amount * The given amount of units * @return <code>r</code> */	TokenNameCOMMENT_JAVADOC	 Increases the given rectangle area for a given amount of units in a rectangle increasement manner. * @param r The given rectangle @param amount The given amount of units @return <code>r</code> 
protected	TokenNameprotected	
Rectangle	TokenNameIdentifier	 Rectangle
outset	TokenNameIdentifier	 outset
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
int	TokenNameint	
amount	TokenNameIdentifier	 amount
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-=	TokenNameMINUS_EQUAL	
amount	TokenNameIdentifier	 amount
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-=	TokenNameMINUS_EQUAL	
amount	TokenNameIdentifier	 amount
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
amount	TokenNameIdentifier	 amount
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
amount	TokenNameIdentifier	 amount
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Repaints the canvas. */	TokenNameCOMMENT_JAVADOC	 Repaints the canvas. 
public	TokenNamepublic	
void	TokenNamevoid	
repaint	TokenNameIdentifier	 repaint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
canvas	TokenNameIdentifier	 canvas
.	TokenNameDOT	
repaint	TokenNameIdentifier	 repaint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The element overlay. */	TokenNameCOMMENT_JAVADOC	 The element overlay. 
public	TokenNamepublic	
class	TokenNameclass	
ElementOverlay	TokenNameIdentifier	 Element Overlay
implements	TokenNameimplements	
Overlay	TokenNameIdentifier	 Overlay
{	TokenNameLBRACE	
/** * Paints this overlay. */	TokenNameCOMMENT_JAVADOC	 Paints this overlay. 
public	TokenNamepublic	
void	TokenNamevoid	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
Graphics	TokenNameIdentifier	 Graphics
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
isOverlayEnabled	TokenNameIdentifier	 is Overlay Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isOverlayEnabled	TokenNameIdentifier	 is Overlay Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
currentElement	TokenNameIdentifier	 current Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GraphicsNode	TokenNameIdentifier	 Graphics Node
nodeToPaint	TokenNameIdentifier	 node To Paint
=	TokenNameEQUAL	
canvas	TokenNameIdentifier	 canvas
.	TokenNameDOT	
getUpdateManager	TokenNameIdentifier	 get Update Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBridgeContext	TokenNameIdentifier	 get Bridge Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGraphicsNode	TokenNameIdentifier	 get Graphics Node
(	TokenNameLPAREN	
currentElement	TokenNameIdentifier	 current Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeToPaint	TokenNameIdentifier	 node To Paint
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
elementsAt	TokenNameIdentifier	 elements At
=	TokenNameEQUAL	
nodeToPaint	TokenNameIdentifier	 node To Paint
.	TokenNameDOT	
getGlobalTransform	TokenNameIdentifier	 get Global Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Shape	TokenNameIdentifier	 Shape
selectionHighlight	TokenNameIdentifier	 selection Highlight
=	TokenNameEQUAL	
nodeToPaint	TokenNameIdentifier	 node To Paint
.	TokenNameDOT	
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
canvas	TokenNameIdentifier	 canvas
.	TokenNameDOT	
getRenderingTransform	TokenNameIdentifier	 get Rendering Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
elementsAt	TokenNameIdentifier	 elements At
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Shape	TokenNameIdentifier	 Shape
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
selectionHighlight	TokenNameIdentifier	 selection Highlight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
)	TokenNameRPAREN	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xorMode	TokenNameIdentifier	 xor Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
black	TokenNameIdentifier	 black
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setXORMode	TokenNameIdentifier	 set XOR Mode
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
yellow	TokenNameIdentifier	 yellow
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
draw	TokenNameIdentifier	 draw
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
elementOverlayColor	TokenNameIdentifier	 element Overlay Color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setStroke	TokenNameIdentifier	 set Stroke
(	TokenNameLPAREN	
new	TokenNamenew	
BasicStroke	TokenNameIdentifier	 Basic Stroke
(	TokenNameLPAREN	
1.8f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
elementOverlayStrokeColor	TokenNameIdentifier	 element Overlay Stroke Color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
draw	TokenNameIdentifier	 draw
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Gets the elementOverlayColor. * * @return the elementOverlayColor */	TokenNameCOMMENT_JAVADOC	 Gets the elementOverlayColor. * @return the elementOverlayColor 
public	TokenNamepublic	
Color	TokenNameIdentifier	 Color
getElementOverlayColor	TokenNameIdentifier	 get Element Overlay Color
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elementOverlayColor	TokenNameIdentifier	 element Overlay Color
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the color to use for the element overlay. * * @param selectionOverlayColor The new element overlay color. */	TokenNameCOMMENT_JAVADOC	 Sets the color to use for the element overlay. * @param selectionOverlayColor The new element overlay color. 
public	TokenNamepublic	
void	TokenNamevoid	
setElementOverlayColor	TokenNameIdentifier	 set Element Overlay Color
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
selectionOverlayColor	TokenNameIdentifier	 selection Overlay Color
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
elementOverlayColor	TokenNameIdentifier	 element Overlay Color
=	TokenNameEQUAL	
selectionOverlayColor	TokenNameIdentifier	 selection Overlay Color
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the elementOverlayStrokeColor. * * @return the elementOverlayStrokeColor */	TokenNameCOMMENT_JAVADOC	 Gets the elementOverlayStrokeColor. * @return the elementOverlayStrokeColor 
public	TokenNamepublic	
Color	TokenNameIdentifier	 Color
getElementOverlayStrokeColor	TokenNameIdentifier	 get Element Overlay Stroke Color
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elementOverlayStrokeColor	TokenNameIdentifier	 element Overlay Stroke Color
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the color to use for stroking the element overlay. * * @param selectionOverlayStrokeColor * The new element overlay stroking color. */	TokenNameCOMMENT_JAVADOC	 Sets the color to use for stroking the element overlay. * @param selectionOverlayStrokeColor The new element overlay stroking color. 
public	TokenNamepublic	
void	TokenNamevoid	
setElementOverlayStrokeColor	TokenNameIdentifier	 set Element Overlay Stroke Color
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
selectionOverlayStrokeColor	TokenNameIdentifier	 selection Overlay Stroke Color
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
elementOverlayStrokeColor	TokenNameIdentifier	 element Overlay Stroke Color
=	TokenNameEQUAL	
selectionOverlayStrokeColor	TokenNameIdentifier	 selection Overlay Stroke Color
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the xorMode. * * @return the xorMode */	TokenNameCOMMENT_JAVADOC	 Gets the xorMode. * @return the xorMode 
public	TokenNamepublic	
boolean	TokenNameboolean	
isXorMode	TokenNameIdentifier	 is Xor Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xorMode	TokenNameIdentifier	 xor Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the xor mode. * * @param xorMode * the xorMode to set */	TokenNameCOMMENT_JAVADOC	 Sets the xor mode. * @param xorMode the xorMode to set 
public	TokenNamepublic	
void	TokenNamevoid	
setXorMode	TokenNameIdentifier	 set Xor Mode
(	TokenNameLPAREN	
boolean	TokenNameboolean	
xorMode	TokenNameIdentifier	 xor Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
xorMode	TokenNameIdentifier	 xor Mode
=	TokenNameEQUAL	
xorMode	TokenNameIdentifier	 xor Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the elementOverlay. * * @return the elementOverlay */	TokenNameCOMMENT_JAVADOC	 Gets the elementOverlay. * @return the elementOverlay 
public	TokenNamepublic	
Overlay	TokenNameIdentifier	 Overlay
getElementOverlay	TokenNameIdentifier	 get Element Overlay
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elementOverlay	TokenNameIdentifier	 element Overlay
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the elementOverlay. */	TokenNameCOMMENT_JAVADOC	 Removes the elementOverlay. 
public	TokenNamepublic	
void	TokenNamevoid	
removeOverlay	TokenNameIdentifier	 remove Overlay
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
canvas	TokenNameIdentifier	 canvas
.	TokenNameDOT	
getOverlays	TokenNameIdentifier	 get Overlays
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
elementOverlay	TokenNameIdentifier	 element Overlay
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the element overlay controller. * * @param controller * The element overlay controller */	TokenNameCOMMENT_JAVADOC	 Sets the element overlay controller. * @param controller The element overlay controller 
public	TokenNamepublic	
void	TokenNamevoid	
setController	TokenNameIdentifier	 set Controller
(	TokenNameLPAREN	
ElementOverlayController	TokenNameIdentifier	 Element Overlay Controller
controller	TokenNameIdentifier	 controller
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
controller	TokenNameIdentifier	 controller
=	TokenNameEQUAL	
controller	TokenNameIdentifier	 controller
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If the element overlay is enabled. * * @return isOverlayEnabled */	TokenNameCOMMENT_JAVADOC	 If the element overlay is enabled. * @return isOverlayEnabled 
public	TokenNamepublic	
boolean	TokenNameboolean	
isOverlayEnabled	TokenNameIdentifier	 is Overlay Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isOverlayEnabled	TokenNameIdentifier	 is Overlay Enabled
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Enables / disables the Element overlay. */	TokenNameCOMMENT_JAVADOC	 Enables / disables the Element overlay. 
public	TokenNamepublic	
void	TokenNamevoid	
setOverlayEnabled	TokenNameIdentifier	 set Overlay Enabled
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isOverlayEnabled	TokenNameIdentifier	 is Overlay Enabled
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
isOverlayEnabled	TokenNameIdentifier	 is Overlay Enabled
=	TokenNameEQUAL	
isOverlayEnabled	TokenNameIdentifier	 is Overlay Enabled
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
