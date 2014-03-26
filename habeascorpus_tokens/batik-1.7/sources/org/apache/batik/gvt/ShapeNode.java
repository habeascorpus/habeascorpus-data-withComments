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
Point2D	TokenNameIdentifier	 Point2 D
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HaltingThread	TokenNameIdentifier	 Halting Thread
;	TokenNameSEMICOLON	
/** * A graphics node that represents a shape. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: ShapeNode.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A graphics node that represents a shape. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: ShapeNode.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ShapeNode	TokenNameIdentifier	 Shape Node
extends	TokenNameextends	
AbstractGraphicsNode	TokenNameIdentifier	 Abstract Graphics Node
{	TokenNameLBRACE	
/** * The shape that describes this <tt>ShapeNode</tt>. */	TokenNameCOMMENT_JAVADOC	 The shape that describes this <tt>ShapeNode</tt>. 
protected	TokenNameprotected	
Shape	TokenNameIdentifier	 Shape
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
/** * The shape painter used to paint the shape of this shape node. */	TokenNameCOMMENT_JAVADOC	 The shape painter used to paint the shape of this shape node. 
protected	TokenNameprotected	
ShapePainter	TokenNameIdentifier	 Shape Painter
shapePainter	TokenNameIdentifier	 shape Painter
;	TokenNameSEMICOLON	
/** * Internal Cache: Primitive bounds */	TokenNameCOMMENT_JAVADOC	 Internal Cache: Primitive bounds 
private	TokenNameprivate	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
primitiveBounds	TokenNameIdentifier	 primitive Bounds
;	TokenNameSEMICOLON	
/** * Internal Cache: Geometry bounds */	TokenNameCOMMENT_JAVADOC	 Internal Cache: Geometry bounds 
private	TokenNameprivate	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
geometryBounds	TokenNameIdentifier	 geometry Bounds
;	TokenNameSEMICOLON	
/** * Internal Cache: Sensitive bounds */	TokenNameCOMMENT_JAVADOC	 Internal Cache: Sensitive bounds 
private	TokenNameprivate	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
;	TokenNameSEMICOLON	
/** * Internal Cache: The painted area. */	TokenNameCOMMENT_JAVADOC	 Internal Cache: The painted area. 
private	TokenNameprivate	
Shape	TokenNameIdentifier	 Shape
paintedArea	TokenNameIdentifier	 painted Area
;	TokenNameSEMICOLON	
/** * Internal Cache: The sensitive area. */	TokenNameCOMMENT_JAVADOC	 Internal Cache: The sensitive area. 
private	TokenNameprivate	
Shape	TokenNameIdentifier	 Shape
sensitiveArea	TokenNameIdentifier	 sensitive Area
;	TokenNameSEMICOLON	
/** * Constructs a new empty <tt>ShapeNode</tt>. */	TokenNameCOMMENT_JAVADOC	 Constructs a new empty <tt>ShapeNode</tt>. 
public	TokenNamepublic	
ShapeNode	TokenNameIdentifier	 Shape Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Properties methods 	TokenNameCOMMENT_LINE	Properties methods 
// 	TokenNameCOMMENT_LINE	 
/** * Sets the shape of this <tt>ShapeNode</tt>. * * @param newShape the new shape of this shape node */	TokenNameCOMMENT_JAVADOC	 Sets the shape of this <tt>ShapeNode</tt>. * @param newShape the new shape of this shape node 
public	TokenNamepublic	
void	TokenNamevoid	
setShape	TokenNameIdentifier	 set Shape
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
newShape	TokenNameIdentifier	 new Shape
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fireGraphicsNodeChangeStarted	TokenNameIdentifier	 fire Graphics Node Change Started
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invalidateGeometryCache	TokenNameIdentifier	 invalidate Geometry Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
shape	TokenNameIdentifier	 shape
=	TokenNameEQUAL	
newShape	TokenNameIdentifier	 new Shape
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
shapePainter	TokenNameIdentifier	 shape Painter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newShape	TokenNameIdentifier	 new Shape
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shapePainter	TokenNameIdentifier	 shape Painter
.	TokenNameDOT	
setShape	TokenNameIdentifier	 set Shape
(	TokenNameLPAREN	
newShape	TokenNameIdentifier	 new Shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shapePainter	TokenNameIdentifier	 shape Painter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fireGraphicsNodeChangeCompleted	TokenNameIdentifier	 fire Graphics Node Change Completed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the shape of this <tt>ShapeNode</tt>. */	TokenNameCOMMENT_JAVADOC	 Returns the shape of this <tt>ShapeNode</tt>. 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getShape	TokenNameIdentifier	 get Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the <tt>ShapePainter</tt> used by this shape node to render its * shape. * * @param newShapePainter the new ShapePainter to use */	TokenNameCOMMENT_JAVADOC	 Sets the <tt>ShapePainter</tt> used by this shape node to render its shape. * @param newShapePainter the new ShapePainter to use 
public	TokenNamepublic	
void	TokenNamevoid	
setShapePainter	TokenNameIdentifier	 set Shape Painter
(	TokenNameLPAREN	
ShapePainter	TokenNameIdentifier	 Shape Painter
newShapePainter	TokenNameIdentifier	 new Shape Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// Doesn't matter if we don't have a shape. 	TokenNameCOMMENT_LINE	Doesn't matter if we don't have a shape. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
fireGraphicsNodeChangeStarted	TokenNameIdentifier	 fire Graphics Node Change Started
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invalidateGeometryCache	TokenNameIdentifier	 invalidate Geometry Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
shapePainter	TokenNameIdentifier	 shape Painter
=	TokenNameEQUAL	
newShapePainter	TokenNameIdentifier	 new Shape Painter
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shapePainter	TokenNameIdentifier	 shape Painter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
shape	TokenNameIdentifier	 shape
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
shapePainter	TokenNameIdentifier	 shape Painter
.	TokenNameDOT	
getShape	TokenNameIdentifier	 get Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
shapePainter	TokenNameIdentifier	 shape Painter
.	TokenNameDOT	
setShape	TokenNameIdentifier	 set Shape
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fireGraphicsNodeChangeCompleted	TokenNameIdentifier	 fire Graphics Node Change Completed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the <tt>ShapePainter</tt> used by this shape node to render its * shape. */	TokenNameCOMMENT_JAVADOC	 Returns the <tt>ShapePainter</tt> used by this shape node to render its shape. 
public	TokenNamepublic	
ShapePainter	TokenNameIdentifier	 Shape Painter
getShapePainter	TokenNameIdentifier	 get Shape Painter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
shapePainter	TokenNameIdentifier	 shape Painter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Drawing methods 	TokenNameCOMMENT_LINE	Drawing methods 
// 	TokenNameCOMMENT_LINE	 
/** * Paints this node. * * @param g2d the Graphics2D to use */	TokenNameCOMMENT_JAVADOC	 Paints this node. * @param g2d the Graphics2D to use 
public	TokenNamepublic	
void	TokenNamevoid	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isVisible	TokenNameIdentifier	 is Visible
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
shapePainter	TokenNameIdentifier	 shape Painter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
shapePainter	TokenNameIdentifier	 shape Painter
.	TokenNameDOT	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Geometric methods 	TokenNameCOMMENT_LINE	Geometric methods 
// 	TokenNameCOMMENT_LINE	 
/** * Invalidates this <tt>ShapeNode</tt>. This node and all its ancestors have * been informed that all its cached values related to its bounds must be * recomputed. */	TokenNameCOMMENT_JAVADOC	 Invalidates this <tt>ShapeNode</tt>. This node and all its ancestors have been informed that all its cached values related to its bounds must be recomputed. 
protected	TokenNameprotected	
void	TokenNamevoid	
invalidateGeometryCache	TokenNameIdentifier	 invalidate Geometry Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
invalidateGeometryCache	TokenNameIdentifier	 invalidate Geometry Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
primitiveBounds	TokenNameIdentifier	 primitive Bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
geometryBounds	TokenNameIdentifier	 geometry Bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
paintedArea	TokenNameIdentifier	 painted Area
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
sensitiveArea	TokenNameIdentifier	 sensitive Area
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPointerEventType	TokenNameIdentifier	 set Pointer Event Type
(	TokenNameLPAREN	
int	TokenNameint	
pointerEventType	TokenNameIdentifier	 pointer Event Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setPointerEventType	TokenNameIdentifier	 set Pointer Event Type
(	TokenNameLPAREN	
pointerEventType	TokenNameIdentifier	 pointer Event Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
sensitiveArea	TokenNameIdentifier	 sensitive Area
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the specified Point2D is inside the boundary of this * node, false otherwise. * * @param p the specified Point2D in the user space */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified Point2D is inside the boundary of this node, false otherwise. * @param p the specified Point2D in the user space 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
pointerEventType	TokenNameIdentifier	 pointer Event Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
VISIBLE_PAINTED	TokenNameIdentifier	 VISIBLE  PAINTED
:	TokenNameCOLON	
case	TokenNamecase	
VISIBLE_FILL	TokenNameIdentifier	 VISIBLE  FILL
:	TokenNameCOLON	
case	TokenNamecase	
VISIBLE_STROKE	TokenNameIdentifier	 VISIBLE  STROKE
:	TokenNameCOLON	
case	TokenNamecase	
VISIBLE	TokenNameIdentifier	 VISIBLE
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isVisible	TokenNameIdentifier	 is Visible
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Fall Through 	TokenNameCOMMENT_LINE	Fall Through 
case	TokenNamecase	
PAINTED	TokenNameIdentifier	 PAINTED
:	TokenNameCOLON	
case	TokenNamecase	
FILL	TokenNameIdentifier	 FILL
:	TokenNameCOLON	
case	TokenNamecase	
STROKE	TokenNameIdentifier	 STROKE
:	TokenNameCOLON	
case	TokenNamecase	
ALL	TokenNameIdentifier	 ALL
:	TokenNameCOLON	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
getSensitiveBounds	TokenNameIdentifier	 get Sensitive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
inSensitiveArea	TokenNameIdentifier	 in Sensitive Area
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
NONE	TokenNameIdentifier	 NONE
:	TokenNameCOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns true if the interior of this node intersects the interior of a * specified Rectangle2D, false otherwise. * * @param r the specified Rectangle2D in the user node space */	TokenNameCOMMENT_JAVADOC	 Returns true if the interior of this node intersects the interior of a specified Rectangle2D, false otherwise. * @param r the specified Rectangle2D in the user node space 
public	TokenNamepublic	
boolean	TokenNameboolean	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
paintedArea	TokenNameIdentifier	 painted Area
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
paintedArea	TokenNameIdentifier	 painted Area
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the area covered by this node's primitive paint. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area covered by this node's primitive paint. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getPrimitiveBounds	TokenNameIdentifier	 get Primitive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isVisible	TokenNameIdentifier	 is Visible
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
primitiveBounds	TokenNameIdentifier	 primitive Bounds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
primitiveBounds	TokenNameIdentifier	 primitive Bounds
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shapePainter	TokenNameIdentifier	 shape Painter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
primitiveBounds	TokenNameIdentifier	 primitive Bounds
=	TokenNameEQUAL	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
primitiveBounds	TokenNameIdentifier	 primitive Bounds
=	TokenNameEQUAL	
shapePainter	TokenNameIdentifier	 shape Painter
.	TokenNameDOT	
getPaintedBounds2D	TokenNameIdentifier	 get Painted Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check If we should halt early. 	TokenNameCOMMENT_LINE	Check If we should halt early. 
if	TokenNameif	
(	TokenNameLPAREN	
HaltingThread	TokenNameIdentifier	 Halting Thread
.	TokenNameDOT	
hasBeenHalted	TokenNameIdentifier	 has Been Halted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The Thread has been halted. 	TokenNameCOMMENT_LINE	The Thread has been halted. 
// Invalidate any cached values and proceed (this 	TokenNameCOMMENT_LINE	Invalidate any cached values and proceed (this 
// sets primitiveBounds to null). 	TokenNameCOMMENT_LINE	sets primitiveBounds to null). 
invalidateGeometryCache	TokenNameIdentifier	 invalidate Geometry Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
primitiveBounds	TokenNameIdentifier	 primitive Bounds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
inSensitiveArea	TokenNameIdentifier	 in Sensitive Area
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shapePainter	TokenNameIdentifier	 shape Painter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// <!> NOT REALLY NICE CODE BUT NO OTHER WAY 	TokenNameCOMMENT_LINE	<!> NOT REALLY NICE CODE BUT NO OTHER WAY 
ShapePainter	TokenNameIdentifier	 Shape Painter
strokeShapePainter	TokenNameIdentifier	 stroke Shape Painter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ShapePainter	TokenNameIdentifier	 Shape Painter
fillShapePainter	TokenNameIdentifier	 fill Shape Painter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shapePainter	TokenNameIdentifier	 shape Painter
instanceof	TokenNameinstanceof	
StrokeShapePainter	TokenNameIdentifier	 Stroke Shape Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
strokeShapePainter	TokenNameIdentifier	 stroke Shape Painter
=	TokenNameEQUAL	
shapePainter	TokenNameIdentifier	 shape Painter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
shapePainter	TokenNameIdentifier	 shape Painter
instanceof	TokenNameinstanceof	
FillShapePainter	TokenNameIdentifier	 Fill Shape Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fillShapePainter	TokenNameIdentifier	 fill Shape Painter
=	TokenNameEQUAL	
shapePainter	TokenNameIdentifier	 shape Painter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
shapePainter	TokenNameIdentifier	 shape Painter
instanceof	TokenNameinstanceof	
CompositeShapePainter	TokenNameIdentifier	 Composite Shape Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CompositeShapePainter	TokenNameIdentifier	 Composite Shape Painter
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CompositeShapePainter	TokenNameIdentifier	 Composite Shape Painter
)	TokenNameRPAREN	
shapePainter	TokenNameIdentifier	 shape Painter
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
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
getShapePainterCount	TokenNameIdentifier	 get Shape Painter Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ShapePainter	TokenNameIdentifier	 Shape Painter
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
getShapePainter	TokenNameIdentifier	 get Shape Painter
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
instanceof	TokenNameinstanceof	
StrokeShapePainter	TokenNameIdentifier	 Stroke Shape Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
strokeShapePainter	TokenNameIdentifier	 stroke Shape Painter
=	TokenNameEQUAL	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
instanceof	TokenNameinstanceof	
FillShapePainter	TokenNameIdentifier	 Fill Shape Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fillShapePainter	TokenNameIdentifier	 fill Shape Painter
=	TokenNameEQUAL	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Don't know what we have... 	TokenNameCOMMENT_LINE	Don't know what we have... 
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
pointerEventType	TokenNameIdentifier	 pointer Event Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
VISIBLE_PAINTED	TokenNameIdentifier	 VISIBLE  PAINTED
:	TokenNameCOLON	
case	TokenNamecase	
PAINTED	TokenNameIdentifier	 PAINTED
:	TokenNameCOLON	
return	TokenNamereturn	
shapePainter	TokenNameIdentifier	 shape Painter
.	TokenNameDOT	
inPaintedArea	TokenNameIdentifier	 in Painted Area
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
VISIBLE	TokenNameIdentifier	 VISIBLE
:	TokenNameCOLON	
case	TokenNamecase	
ALL	TokenNameIdentifier	 ALL
:	TokenNameCOLON	
return	TokenNamereturn	
shapePainter	TokenNameIdentifier	 shape Painter
.	TokenNameDOT	
inSensitiveArea	TokenNameIdentifier	 in Sensitive Area
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
VISIBLE_FILL	TokenNameIdentifier	 VISIBLE  FILL
:	TokenNameCOLON	
case	TokenNamecase	
FILL	TokenNameIdentifier	 FILL
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fillShapePainter	TokenNameIdentifier	 fill Shape Painter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
fillShapePainter	TokenNameIdentifier	 fill Shape Painter
.	TokenNameDOT	
inSensitiveArea	TokenNameIdentifier	 in Sensitive Area
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
VISIBLE_STROKE	TokenNameIdentifier	 VISIBLE  STROKE
:	TokenNameCOLON	
case	TokenNamecase	
STROKE	TokenNameIdentifier	 STROKE
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
strokeShapePainter	TokenNameIdentifier	 stroke Shape Painter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
strokeShapePainter	TokenNameIdentifier	 stroke Shape Painter
.	TokenNameDOT	
inSensitiveArea	TokenNameIdentifier	 in Sensitive Area
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
NONE	TokenNameIdentifier	 NONE
:	TokenNameCOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// nothing to tdo 	TokenNameCOMMENT_LINE	nothing to tdo 
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the sensitive area covered by this node, * This includes the stroked area but does not include the effects * of clipping, masking or filtering. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the sensitive area covered by this node, This includes the stroked area but does not include the effects of clipping, masking or filtering. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getSensitiveBounds	TokenNameIdentifier	 get Sensitive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shapePainter	TokenNameIdentifier	 shape Painter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// <!> NOT REALLY NICE CODE BUT NO OTHER WAY 	TokenNameCOMMENT_LINE	<!> NOT REALLY NICE CODE BUT NO OTHER WAY 
ShapePainter	TokenNameIdentifier	 Shape Painter
strokeShapePainter	TokenNameIdentifier	 stroke Shape Painter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ShapePainter	TokenNameIdentifier	 Shape Painter
fillShapePainter	TokenNameIdentifier	 fill Shape Painter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shapePainter	TokenNameIdentifier	 shape Painter
instanceof	TokenNameinstanceof	
StrokeShapePainter	TokenNameIdentifier	 Stroke Shape Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
strokeShapePainter	TokenNameIdentifier	 stroke Shape Painter
=	TokenNameEQUAL	
shapePainter	TokenNameIdentifier	 shape Painter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
shapePainter	TokenNameIdentifier	 shape Painter
instanceof	TokenNameinstanceof	
FillShapePainter	TokenNameIdentifier	 Fill Shape Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fillShapePainter	TokenNameIdentifier	 fill Shape Painter
=	TokenNameEQUAL	
shapePainter	TokenNameIdentifier	 shape Painter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
shapePainter	TokenNameIdentifier	 shape Painter
instanceof	TokenNameinstanceof	
CompositeShapePainter	TokenNameIdentifier	 Composite Shape Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CompositeShapePainter	TokenNameIdentifier	 Composite Shape Painter
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CompositeShapePainter	TokenNameIdentifier	 Composite Shape Painter
)	TokenNameRPAREN	
shapePainter	TokenNameIdentifier	 shape Painter
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
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
getShapePainterCount	TokenNameIdentifier	 get Shape Painter Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ShapePainter	TokenNameIdentifier	 Shape Painter
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
getShapePainter	TokenNameIdentifier	 get Shape Painter
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
instanceof	TokenNameinstanceof	
StrokeShapePainter	TokenNameIdentifier	 Stroke Shape Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
strokeShapePainter	TokenNameIdentifier	 stroke Shape Painter
=	TokenNameEQUAL	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
instanceof	TokenNameinstanceof	
FillShapePainter	TokenNameIdentifier	 Fill Shape Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fillShapePainter	TokenNameIdentifier	 fill Shape Painter
=	TokenNameEQUAL	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Don't know what we have... 	TokenNameCOMMENT_LINE	Don't know what we have... 
switch	TokenNameswitch	
(	TokenNameLPAREN	
pointerEventType	TokenNameIdentifier	 pointer Event Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
VISIBLE_PAINTED	TokenNameIdentifier	 VISIBLE  PAINTED
:	TokenNameCOLON	
case	TokenNamecase	
PAINTED	TokenNameIdentifier	 PAINTED
:	TokenNameCOLON	
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
=	TokenNameEQUAL	
shapePainter	TokenNameIdentifier	 shape Painter
.	TokenNameDOT	
getPaintedBounds2D	TokenNameIdentifier	 get Painted Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
VISIBLE_FILL	TokenNameIdentifier	 VISIBLE  FILL
:	TokenNameCOLON	
case	TokenNamecase	
FILL	TokenNameIdentifier	 FILL
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fillShapePainter	TokenNameIdentifier	 fill Shape Painter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
=	TokenNameEQUAL	
fillShapePainter	TokenNameIdentifier	 fill Shape Painter
.	TokenNameDOT	
getSensitiveBounds2D	TokenNameIdentifier	 get Sensitive Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
VISIBLE_STROKE	TokenNameIdentifier	 VISIBLE  STROKE
:	TokenNameCOLON	
case	TokenNamecase	
STROKE	TokenNameIdentifier	 STROKE
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
strokeShapePainter	TokenNameIdentifier	 stroke Shape Painter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
=	TokenNameEQUAL	
strokeShapePainter	TokenNameIdentifier	 stroke Shape Painter
.	TokenNameDOT	
getSensitiveBounds2D	TokenNameIdentifier	 get Sensitive Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
VISIBLE	TokenNameIdentifier	 VISIBLE
:	TokenNameCOLON	
case	TokenNamecase	
ALL	TokenNameIdentifier	 ALL
:	TokenNameCOLON	
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
=	TokenNameEQUAL	
shapePainter	TokenNameIdentifier	 shape Painter
.	TokenNameDOT	
getSensitiveBounds2D	TokenNameIdentifier	 get Sensitive Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
NONE	TokenNameIdentifier	 NONE
:	TokenNameCOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// nothing to tdo 	TokenNameCOMMENT_LINE	nothing to tdo 
}	TokenNameRBRACE	
return	TokenNamereturn	
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the shape that represents the sensitive area of this graphics * node. */	TokenNameCOMMENT_JAVADOC	 Returns the shape that represents the sensitive area of this graphics node. 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getSensitiveArea	TokenNameIdentifier	 get Sensitive Area
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sensitiveArea	TokenNameIdentifier	 sensitive Area
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
sensitiveArea	TokenNameIdentifier	 sensitive Area
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shapePainter	TokenNameIdentifier	 shape Painter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// <!> NOT REALLY NICE CODE BUT NO OTHER WAY 	TokenNameCOMMENT_LINE	<!> NOT REALLY NICE CODE BUT NO OTHER WAY 
ShapePainter	TokenNameIdentifier	 Shape Painter
strokeShapePainter	TokenNameIdentifier	 stroke Shape Painter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ShapePainter	TokenNameIdentifier	 Shape Painter
fillShapePainter	TokenNameIdentifier	 fill Shape Painter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shapePainter	TokenNameIdentifier	 shape Painter
instanceof	TokenNameinstanceof	
StrokeShapePainter	TokenNameIdentifier	 Stroke Shape Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
strokeShapePainter	TokenNameIdentifier	 stroke Shape Painter
=	TokenNameEQUAL	
shapePainter	TokenNameIdentifier	 shape Painter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
shapePainter	TokenNameIdentifier	 shape Painter
instanceof	TokenNameinstanceof	
FillShapePainter	TokenNameIdentifier	 Fill Shape Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fillShapePainter	TokenNameIdentifier	 fill Shape Painter
=	TokenNameEQUAL	
shapePainter	TokenNameIdentifier	 shape Painter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
shapePainter	TokenNameIdentifier	 shape Painter
instanceof	TokenNameinstanceof	
CompositeShapePainter	TokenNameIdentifier	 Composite Shape Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CompositeShapePainter	TokenNameIdentifier	 Composite Shape Painter
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CompositeShapePainter	TokenNameIdentifier	 Composite Shape Painter
)	TokenNameRPAREN	
shapePainter	TokenNameIdentifier	 shape Painter
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
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
getShapePainterCount	TokenNameIdentifier	 get Shape Painter Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ShapePainter	TokenNameIdentifier	 Shape Painter
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
getShapePainter	TokenNameIdentifier	 get Shape Painter
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
instanceof	TokenNameinstanceof	
StrokeShapePainter	TokenNameIdentifier	 Stroke Shape Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
strokeShapePainter	TokenNameIdentifier	 stroke Shape Painter
=	TokenNameEQUAL	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
instanceof	TokenNameinstanceof	
FillShapePainter	TokenNameIdentifier	 Fill Shape Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fillShapePainter	TokenNameIdentifier	 fill Shape Painter
=	TokenNameEQUAL	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Don't know what we have... 	TokenNameCOMMENT_LINE	Don't know what we have... 
switch	TokenNameswitch	
(	TokenNameLPAREN	
pointerEventType	TokenNameIdentifier	 pointer Event Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
VISIBLE_PAINTED	TokenNameIdentifier	 VISIBLE  PAINTED
:	TokenNameCOLON	
case	TokenNamecase	
PAINTED	TokenNameIdentifier	 PAINTED
:	TokenNameCOLON	
sensitiveArea	TokenNameIdentifier	 sensitive Area
=	TokenNameEQUAL	
shapePainter	TokenNameIdentifier	 shape Painter
.	TokenNameDOT	
getPaintedArea	TokenNameIdentifier	 get Painted Area
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
VISIBLE_FILL	TokenNameIdentifier	 VISIBLE  FILL
:	TokenNameCOLON	
case	TokenNamecase	
FILL	TokenNameIdentifier	 FILL
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fillShapePainter	TokenNameIdentifier	 fill Shape Painter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sensitiveArea	TokenNameIdentifier	 sensitive Area
=	TokenNameEQUAL	
fillShapePainter	TokenNameIdentifier	 fill Shape Painter
.	TokenNameDOT	
getSensitiveArea	TokenNameIdentifier	 get Sensitive Area
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
VISIBLE_STROKE	TokenNameIdentifier	 VISIBLE  STROKE
:	TokenNameCOLON	
case	TokenNamecase	
STROKE	TokenNameIdentifier	 STROKE
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
strokeShapePainter	TokenNameIdentifier	 stroke Shape Painter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sensitiveArea	TokenNameIdentifier	 sensitive Area
=	TokenNameEQUAL	
strokeShapePainter	TokenNameIdentifier	 stroke Shape Painter
.	TokenNameDOT	
getSensitiveArea	TokenNameIdentifier	 get Sensitive Area
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
VISIBLE	TokenNameIdentifier	 VISIBLE
:	TokenNameCOLON	
case	TokenNamecase	
ALL	TokenNameIdentifier	 ALL
:	TokenNameCOLON	
sensitiveArea	TokenNameIdentifier	 sensitive Area
=	TokenNameEQUAL	
shapePainter	TokenNameIdentifier	 shape Painter
.	TokenNameDOT	
getSensitiveArea	TokenNameIdentifier	 get Sensitive Area
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
NONE	TokenNameIdentifier	 NONE
:	TokenNameCOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// nothing to tdo 	TokenNameCOMMENT_LINE	nothing to tdo 
}	TokenNameRBRACE	
return	TokenNamereturn	
sensitiveArea	TokenNameIdentifier	 sensitive Area
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the area covered by this node, without * taking any of its rendering attribute into account. That is, * exclusive of any clipping, masking, filtering or stroking, for * example. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area covered by this node, without taking any of its rendering attribute into account. That is, exclusive of any clipping, masking, filtering or stroking, for example. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getGeometryBounds	TokenNameIdentifier	 get Geometry Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
geometryBounds	TokenNameIdentifier	 geometry Bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
geometryBounds	TokenNameIdentifier	 geometry Bounds
=	TokenNameEQUAL	
normalizeRectangle	TokenNameIdentifier	 normalize Rectangle
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
geometryBounds	TokenNameIdentifier	 geometry Bounds
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
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
