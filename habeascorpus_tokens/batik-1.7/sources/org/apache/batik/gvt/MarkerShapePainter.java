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
AffineTransform	TokenNameIdentifier	 Affine Transform
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Arc2D	TokenNameIdentifier	 Arc2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
PathIterator	TokenNameIdentifier	 Path Iterator
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
ExtendedGeneralPath	TokenNameIdentifier	 Extended General Path
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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
ExtendedPathIterator	TokenNameIdentifier	 Extended Path Iterator
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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
ExtendedShape	TokenNameIdentifier	 Extended Shape
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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
ShapeExtender	TokenNameIdentifier	 Shape Extender
;	TokenNameSEMICOLON	
/** * A shape painter that can be used to paint markers on a shape. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: MarkerShapePainter.java 504084 2007-02-06 11:24:46Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A shape painter that can be used to paint markers on a shape. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: MarkerShapePainter.java 504084 2007-02-06 11:24:46Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
MarkerShapePainter	TokenNameIdentifier	 Marker Shape Painter
implements	TokenNameimplements	
ShapePainter	TokenNameIdentifier	 Shape Painter
{	TokenNameLBRACE	
/** * The Shape to be painted. */	TokenNameCOMMENT_JAVADOC	 The Shape to be painted. 
protected	TokenNameprotected	
ExtendedShape	TokenNameIdentifier	 Extended Shape
extShape	TokenNameIdentifier	 ext Shape
;	TokenNameSEMICOLON	
/** * Start Marker */	TokenNameCOMMENT_JAVADOC	 Start Marker 
protected	TokenNameprotected	
Marker	TokenNameIdentifier	 Marker
startMarker	TokenNameIdentifier	 start Marker
;	TokenNameSEMICOLON	
/** * Middle Marker */	TokenNameCOMMENT_JAVADOC	 Middle Marker 
protected	TokenNameprotected	
Marker	TokenNameIdentifier	 Marker
middleMarker	TokenNameIdentifier	 middle Marker
;	TokenNameSEMICOLON	
/** * End Marker */	TokenNameCOMMENT_JAVADOC	 End Marker 
protected	TokenNameprotected	
Marker	TokenNameIdentifier	 Marker
endMarker	TokenNameIdentifier	 end Marker
;	TokenNameSEMICOLON	
/** * Start marker proxy. */	TokenNameCOMMENT_JAVADOC	 Start marker proxy. 
private	TokenNameprivate	
ProxyGraphicsNode	TokenNameIdentifier	 Proxy Graphics Node
startMarkerProxy	TokenNameIdentifier	 start Marker Proxy
;	TokenNameSEMICOLON	
/** * Middle marker proxy. */	TokenNameCOMMENT_JAVADOC	 Middle marker proxy. 
private	TokenNameprivate	
ProxyGraphicsNode	TokenNameIdentifier	 Proxy Graphics Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
middleMarkerProxies	TokenNameIdentifier	 middle Marker Proxies
;	TokenNameSEMICOLON	
/** * End marker proxy. */	TokenNameCOMMENT_JAVADOC	 End marker proxy. 
private	TokenNameprivate	
ProxyGraphicsNode	TokenNameIdentifier	 Proxy Graphics Node
endMarkerProxy	TokenNameIdentifier	 end Marker Proxy
;	TokenNameSEMICOLON	
/** * Contains the various marker proxies. */	TokenNameCOMMENT_JAVADOC	 Contains the various marker proxies. 
private	TokenNameprivate	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
markerGroup	TokenNameIdentifier	 marker Group
;	TokenNameSEMICOLON	
/** * Internal Cache: Primitive bounds */	TokenNameCOMMENT_JAVADOC	 Internal Cache: Primitive bounds 
private	TokenNameprivate	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
dPrimitiveBounds	TokenNameIdentifier	 d Primitive Bounds
;	TokenNameSEMICOLON	
/** * Internal Cache: Geometry bounds */	TokenNameCOMMENT_JAVADOC	 Internal Cache: Geometry bounds 
private	TokenNameprivate	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
dGeometryBounds	TokenNameIdentifier	 d Geometry Bounds
;	TokenNameSEMICOLON	
/** * Constructs a new <tt>MarkerShapePainter</tt> that can be used to markers * on top of a shape. * * @param shape Shape to be painted by this painter. * Should not be null */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>MarkerShapePainter</tt> that can be used to markers on top of a shape. * @param shape Shape to be painted by this painter. Should not be null 
public	TokenNamepublic	
MarkerShapePainter	TokenNameIdentifier	 Marker Shape Painter
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
shape	TokenNameIdentifier	 shape
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
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
shape	TokenNameIdentifier	 shape
instanceof	TokenNameinstanceof	
ExtendedShape	TokenNameIdentifier	 Extended Shape
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
extShape	TokenNameIdentifier	 ext Shape
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendedShape	TokenNameIdentifier	 Extended Shape
)	TokenNameRPAREN	
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
extShape	TokenNameIdentifier	 ext Shape
=	TokenNameEQUAL	
new	TokenNamenew	
ShapeExtender	TokenNameIdentifier	 Shape Extender
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Paints the specified shape using the specified Graphics2D. * * @param g2d the Graphics2D to use */	TokenNameCOMMENT_JAVADOC	 Paints the specified shape using the specified Graphics2D. * @param g2d the Graphics2D to use 
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
markerGroup	TokenNameIdentifier	 marker Group
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buildMarkerGroup	TokenNameIdentifier	 build Marker Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
markerGroup	TokenNameIdentifier	 marker Group
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
markerGroup	TokenNameIdentifier	 marker Group
.	TokenNameDOT	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the area painted by this shape painter. */	TokenNameCOMMENT_JAVADOC	 Returns the area painted by this shape painter. 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getPaintedArea	TokenNameIdentifier	 get Painted Area
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
markerGroup	TokenNameIdentifier	 marker Group
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buildMarkerGroup	TokenNameIdentifier	 build Marker Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
markerGroup	TokenNameIdentifier	 marker Group
.	TokenNameDOT	
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the area painted by this shape painter */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area painted by this shape painter 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getPaintedBounds2D	TokenNameIdentifier	 get Painted Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
markerGroup	TokenNameIdentifier	 marker Group
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buildMarkerGroup	TokenNameIdentifier	 build Marker Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
markerGroup	TokenNameIdentifier	 marker Group
.	TokenNameDOT	
getPrimitiveBounds	TokenNameIdentifier	 get Primitive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if pt is in the area painted by this shape painter */	TokenNameCOMMENT_JAVADOC	 Returns true if pt is in the area painted by this shape painter 
public	TokenNamepublic	
boolean	TokenNameboolean	
inPaintedArea	TokenNameIdentifier	 in Painted Area
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
markerGroup	TokenNameIdentifier	 marker Group
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buildMarkerGroup	TokenNameIdentifier	 build Marker Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
gn	TokenNameIdentifier	 gn
=	TokenNameEQUAL	
markerGroup	TokenNameIdentifier	 marker Group
.	TokenNameDOT	
nodeHitAt	TokenNameIdentifier	 node Hit At
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
gn	TokenNameIdentifier	 gn
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the area covered by this shape painter (even if not painted). * This is always null for Markers. */	TokenNameCOMMENT_JAVADOC	 Returns the area covered by this shape painter (even if not painted). This is always null for Markers. 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getSensitiveArea	TokenNameIdentifier	 get Sensitive Area
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the area covered by this shape painte * (even if not painted). This is always null for Markers. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area covered by this shape painte (even if not painted). This is always null for Markers. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getSensitiveBounds2D	TokenNameIdentifier	 get Sensitive Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if pt is in the sensitive area. * This is always false for Markers. */	TokenNameCOMMENT_JAVADOC	 Returns true if pt is in the sensitive area. This is always false for Markers. 
public	TokenNamepublic	
boolean	TokenNameboolean	
inSensitiveArea	TokenNameIdentifier	 in Sensitive Area
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the Shape this shape painter is associated with. * * @param shape new shape this painter should be associated with. * Should not be null. */	TokenNameCOMMENT_JAVADOC	 Sets the Shape this shape painter is associated with. * @param shape new shape this painter should be associated with. Should not be null. 
public	TokenNamepublic	
void	TokenNamevoid	
setShape	TokenNameIdentifier	 set Shape
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
shape	TokenNameIdentifier	 shape
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
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
shape	TokenNameIdentifier	 shape
instanceof	TokenNameinstanceof	
ExtendedShape	TokenNameIdentifier	 Extended Shape
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
extShape	TokenNameIdentifier	 ext Shape
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendedShape	TokenNameIdentifier	 Extended Shape
)	TokenNameRPAREN	
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
extShape	TokenNameIdentifier	 ext Shape
=	TokenNameEQUAL	
new	TokenNamenew	
ShapeExtender	TokenNameIdentifier	 Shape Extender
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
startMarkerProxy	TokenNameIdentifier	 start Marker Proxy
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
middleMarkerProxies	TokenNameIdentifier	 middle Marker Proxies
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
endMarkerProxy	TokenNameIdentifier	 end Marker Proxy
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
markerGroup	TokenNameIdentifier	 marker Group
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the Shape this shape painter is associated with as an * Extended Shape. * * @return shape associated with this painter */	TokenNameCOMMENT_JAVADOC	 Gets the Shape this shape painter is associated with as an Extended Shape. * @return shape associated with this painter 
public	TokenNamepublic	
ExtendedShape	TokenNameIdentifier	 Extended Shape
getExtShape	TokenNameIdentifier	 get Ext Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
extShape	TokenNameIdentifier	 ext Shape
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the Shape this shape painter is associated with. * * @return shape associated with this painter */	TokenNameCOMMENT_JAVADOC	 Gets the Shape this shape painter is associated with. * @return shape associated with this painter 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getShape	TokenNameIdentifier	 get Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
extShape	TokenNameIdentifier	 ext Shape
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the marker that shall be drawn at the first vertex of the given * shape. */	TokenNameCOMMENT_JAVADOC	 Returns the marker that shall be drawn at the first vertex of the given shape. 
public	TokenNamepublic	
Marker	TokenNameIdentifier	 Marker
getStartMarker	TokenNameIdentifier	 get Start Marker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startMarker	TokenNameIdentifier	 start Marker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the marker that shall be drawn at the first vertex of the given * shape. * * @param startMarker the start marker */	TokenNameCOMMENT_JAVADOC	 Sets the marker that shall be drawn at the first vertex of the given shape. * @param startMarker the start marker 
public	TokenNamepublic	
void	TokenNamevoid	
setStartMarker	TokenNameIdentifier	 set Start Marker
(	TokenNameLPAREN	
Marker	TokenNameIdentifier	 Marker
startMarker	TokenNameIdentifier	 start Marker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
startMarker	TokenNameIdentifier	 start Marker
=	TokenNameEQUAL	
startMarker	TokenNameIdentifier	 start Marker
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
startMarkerProxy	TokenNameIdentifier	 start Marker Proxy
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
markerGroup	TokenNameIdentifier	 marker Group
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the marker that shall be drawn at every other vertex (not the * first or the last one) of the given shape. */	TokenNameCOMMENT_JAVADOC	 Returns the marker that shall be drawn at every other vertex (not the first or the last one) of the given shape. 
public	TokenNamepublic	
Marker	TokenNameIdentifier	 Marker
getMiddleMarker	TokenNameIdentifier	 get Middle Marker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
middleMarker	TokenNameIdentifier	 middle Marker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the marker that shall be drawn at every other vertex (not the first * or the last one) of the given shape. * * @param middleMarker the middle marker */	TokenNameCOMMENT_JAVADOC	 Sets the marker that shall be drawn at every other vertex (not the first or the last one) of the given shape. * @param middleMarker the middle marker 
public	TokenNamepublic	
void	TokenNamevoid	
setMiddleMarker	TokenNameIdentifier	 set Middle Marker
(	TokenNameLPAREN	
Marker	TokenNameIdentifier	 Marker
middleMarker	TokenNameIdentifier	 middle Marker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
middleMarker	TokenNameIdentifier	 middle Marker
=	TokenNameEQUAL	
middleMarker	TokenNameIdentifier	 middle Marker
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
middleMarkerProxies	TokenNameIdentifier	 middle Marker Proxies
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
markerGroup	TokenNameIdentifier	 marker Group
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the marker that shall be drawn at the last vertex of the given * shape. */	TokenNameCOMMENT_JAVADOC	 Returns the marker that shall be drawn at the last vertex of the given shape. 
public	TokenNamepublic	
Marker	TokenNameIdentifier	 Marker
getEndMarker	TokenNameIdentifier	 get End Marker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
endMarker	TokenNameIdentifier	 end Marker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the marker that shall be drawn at the last vertex of the given * shape. * * @param endMarker the end marker */	TokenNameCOMMENT_JAVADOC	 Sets the marker that shall be drawn at the last vertex of the given shape. * @param endMarker the end marker 
public	TokenNamepublic	
void	TokenNamevoid	
setEndMarker	TokenNameIdentifier	 set End Marker
(	TokenNameLPAREN	
Marker	TokenNameIdentifier	 Marker
endMarker	TokenNameIdentifier	 end Marker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
endMarker	TokenNameIdentifier	 end Marker
=	TokenNameEQUAL	
endMarker	TokenNameIdentifier	 end Marker
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
endMarkerProxy	TokenNameIdentifier	 end Marker Proxy
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
markerGroup	TokenNameIdentifier	 marker Group
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// --------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------------------- 
// Internal methods to build GraphicsNode according to the Marker 	TokenNameCOMMENT_LINE	Internal methods to build GraphicsNode according to the Marker 
// --------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------------------- 
/** * Builds a new marker group with the current set of markers. */	TokenNameCOMMENT_JAVADOC	 Builds a new marker group with the current set of markers. 
protected	TokenNameprotected	
void	TokenNamevoid	
buildMarkerGroup	TokenNameIdentifier	 build Marker Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startMarker	TokenNameIdentifier	 start Marker
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
startMarkerProxy	TokenNameIdentifier	 start Marker Proxy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startMarkerProxy	TokenNameIdentifier	 start Marker Proxy
=	TokenNameEQUAL	
buildStartMarkerProxy	TokenNameIdentifier	 build Start Marker Proxy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
middleMarker	TokenNameIdentifier	 middle Marker
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
middleMarkerProxies	TokenNameIdentifier	 middle Marker Proxies
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
middleMarkerProxies	TokenNameIdentifier	 middle Marker Proxies
=	TokenNameEQUAL	
buildMiddleMarkerProxies	TokenNameIdentifier	 build Middle Marker Proxies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endMarker	TokenNameIdentifier	 end Marker
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
endMarkerProxy	TokenNameIdentifier	 end Marker Proxy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endMarkerProxy	TokenNameIdentifier	 end Marker Proxy
=	TokenNameEQUAL	
buildEndMarkerProxy	TokenNameIdentifier	 build End Marker Proxy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startMarkerProxy	TokenNameIdentifier	 start Marker Proxy
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
startMarkerProxy	TokenNameIdentifier	 start Marker Proxy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
middleMarkerProxies	TokenNameIdentifier	 middle Marker Proxies
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
middleMarkerProxies	TokenNameIdentifier	 middle Marker Proxies
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
middleMarkerProxies	TokenNameIdentifier	 middle Marker Proxies
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endMarkerProxy	TokenNameIdentifier	 end Marker Proxy
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
endMarkerProxy	TokenNameIdentifier	 end Marker Proxy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
markerGroup	TokenNameIdentifier	 marker Group
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds a proxy <tt>GraphicsNode</tt> for the input <tt>Marker</tt> to be * drawn at the start position */	TokenNameCOMMENT_JAVADOC	 Builds a proxy <tt>GraphicsNode</tt> for the input <tt>Marker</tt> to be drawn at the start position 
protected	TokenNameprotected	
ProxyGraphicsNode	TokenNameIdentifier	 Proxy Graphics Node
buildStartMarkerProxy	TokenNameIdentifier	 build Start Marker Proxy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExtendedPathIterator	TokenNameIdentifier	 Extended Path Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
getExtShape	TokenNameIdentifier	 get Ext Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getExtendedPathIterator	TokenNameIdentifier	 get Extended Path Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get initial point on the path 	TokenNameCOMMENT_LINE	Get initial point on the path 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
coords	TokenNameIdentifier	 coords
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
segType	TokenNameIdentifier	 seg Type
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
segType	TokenNameIdentifier	 seg Type
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
coords	TokenNameIdentifier	 coords
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segType	TokenNameIdentifier	 seg Type
!=	TokenNameNOT_EQUAL	
ExtendedPathIterator	TokenNameIdentifier	 Extended Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
markerPosition	TokenNameIdentifier	 marker Position
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the marker's orient property is NaN, 	TokenNameCOMMENT_LINE	If the marker's orient property is NaN, 
// the slope needs to be computed 	TokenNameCOMMENT_LINE	the slope needs to be computed 
double	TokenNamedouble	
rotation	TokenNameIdentifier	 rotation
=	TokenNameEQUAL	
startMarker	TokenNameIdentifier	 start Marker
.	TokenNameDOT	
getOrient	TokenNameIdentifier	 get Orient
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
rotation	TokenNameIdentifier	 rotation
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
nextSegType	TokenNameIdentifier	 next Seg Type
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nextSegType	TokenNameIdentifier	 next Seg Type
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextSegType	TokenNameIdentifier	 next Seg Type
==	TokenNameEQUAL_EQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CLOSE	TokenNameIdentifier	 SEG  CLOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextSegType	TokenNameIdentifier	 next Seg Type
=	TokenNameEQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rotation	TokenNameIdentifier	 rotation
=	TokenNameEQUAL	
computeRotation	TokenNameIdentifier	 compute Rotation
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// no previous seg. 	TokenNameCOMMENT_LINE	no previous seg. 
coords	TokenNameIdentifier	 coords
,	TokenNameCOMMA	
segType	TokenNameIdentifier	 seg Type
,	TokenNameCOMMA	
// segment ending on start point 	TokenNameCOMMENT_LINE	segment ending on start point 
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
nextSegType	TokenNameIdentifier	 next Seg Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// segment out of start point 	TokenNameCOMMENT_LINE	segment out of start point 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Now, compute the marker's proxy transform 	TokenNameCOMMENT_LINE	Now, compute the marker's proxy transform 
AffineTransform	TokenNameIdentifier	 Affine Transform
markerTxf	TokenNameIdentifier	 marker Txf
=	TokenNameEQUAL	
computeMarkerTransform	TokenNameIdentifier	 compute Marker Transform
(	TokenNameLPAREN	
startMarker	TokenNameIdentifier	 start Marker
,	TokenNameCOMMA	
markerPosition	TokenNameIdentifier	 marker Position
,	TokenNameCOMMA	
rotation	TokenNameIdentifier	 rotation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProxyGraphicsNode	TokenNameIdentifier	 Proxy Graphics Node
gn	TokenNameIdentifier	 gn
=	TokenNameEQUAL	
new	TokenNamenew	
ProxyGraphicsNode	TokenNameIdentifier	 Proxy Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
startMarker	TokenNameIdentifier	 start Marker
.	TokenNameDOT	
getMarkerNode	TokenNameIdentifier	 get Marker Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
markerTxf	TokenNameIdentifier	 marker Txf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gn	TokenNameIdentifier	 gn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds a proxy <tt>GraphicsNode</tt> for the input <tt>Marker</tt> to be * drawn at the end position. */	TokenNameCOMMENT_JAVADOC	 Builds a proxy <tt>GraphicsNode</tt> for the input <tt>Marker</tt> to be drawn at the end position. 
protected	TokenNameprotected	
ProxyGraphicsNode	TokenNameIdentifier	 Proxy Graphics Node
buildEndMarkerProxy	TokenNameIdentifier	 build End Marker Proxy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExtendedPathIterator	TokenNameIdentifier	 Extended Path Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
getExtShape	TokenNameIdentifier	 get Ext Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getExtendedPathIterator	TokenNameIdentifier	 get Extended Path Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nPoints	TokenNameIdentifier	 n Points
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Get first point, in case the last segment on the 	TokenNameCOMMENT_LINE	Get first point, in case the last segment on the 
// path is a close 	TokenNameCOMMENT_LINE	path is a close 
if	TokenNameif	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
coords	TokenNameIdentifier	 coords
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
moveTo	TokenNameIdentifier	 move To
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
segType	TokenNameIdentifier	 seg Type
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
segType	TokenNameIdentifier	 seg Type
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
coords	TokenNameIdentifier	 coords
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segType	TokenNameIdentifier	 seg Type
!=	TokenNameNOT_EQUAL	
ExtendedPathIterator	TokenNameIdentifier	 Extended Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nPoints	TokenNameIdentifier	 n Points
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
moveTo	TokenNameIdentifier	 move To
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
moveTo	TokenNameIdentifier	 move To
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now, get the last two points on the path 	TokenNameCOMMENT_LINE	Now, get the last two points on the path 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lastButOne	TokenNameIdentifier	 last But One
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
{	TokenNameLBRACE	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastSegType	TokenNameIdentifier	 last Seg Type
=	TokenNameEQUAL	
segType	TokenNameIdentifier	 seg Type
;	TokenNameSEMICOLON	
int	TokenNameint	
lastButOneSegType	TokenNameIdentifier	 last But One Seg Type
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
lastButOne	TokenNameIdentifier	 last But One
;	TokenNameSEMICOLON	
lastButOne	TokenNameIdentifier	 last But One
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
lastButOneSegType	TokenNameIdentifier	 last But One Seg Type
=	TokenNameEQUAL	
lastSegType	TokenNameIdentifier	 last Seg Type
;	TokenNameSEMICOLON	
lastSegType	TokenNameIdentifier	 last Seg Type
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastSegType	TokenNameIdentifier	 last Seg Type
==	TokenNameEQUAL_EQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
moveTo	TokenNameIdentifier	 move To
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
moveTo	TokenNameIdentifier	 move To
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
lastSegType	TokenNameIdentifier	 last Seg Type
==	TokenNameEQUAL_EQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CLOSE	TokenNameIdentifier	 SEG  CLOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastSegType	TokenNameIdentifier	 last Seg Type
=	TokenNameEQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
;	TokenNameSEMICOLON	
last	TokenNameIdentifier	 last
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
moveTo	TokenNameIdentifier	 move To
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
last	TokenNameIdentifier	 last
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
moveTo	TokenNameIdentifier	 move To
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nPoints	TokenNameIdentifier	 n Points
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nPoints	TokenNameIdentifier	 n Points
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Turn the last segment into a position 	TokenNameCOMMENT_LINE	Turn the last segment into a position 
Point2D	TokenNameIdentifier	 Point2 D
markerPosition	TokenNameIdentifier	 marker Position
=	TokenNameEQUAL	
getSegmentTerminatingPoint	TokenNameIdentifier	 get Segment Terminating Point
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
,	TokenNameCOMMA	
lastSegType	TokenNameIdentifier	 last Seg Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the marker's orient property is NaN, 	TokenNameCOMMENT_LINE	If the marker's orient property is NaN, 
// the slope needs to be computed 	TokenNameCOMMENT_LINE	the slope needs to be computed 
double	TokenNamedouble	
rotation	TokenNameIdentifier	 rotation
=	TokenNameEQUAL	
endMarker	TokenNameIdentifier	 end Marker
.	TokenNameDOT	
getOrient	TokenNameIdentifier	 get Orient
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
rotation	TokenNameIdentifier	 rotation
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rotation	TokenNameIdentifier	 rotation
=	TokenNameEQUAL	
computeRotation	TokenNameIdentifier	 compute Rotation
(	TokenNameLPAREN	
lastButOne	TokenNameIdentifier	 last But One
,	TokenNameCOMMA	
lastButOneSegType	TokenNameIdentifier	 last But One Seg Type
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
,	TokenNameCOMMA	
lastSegType	TokenNameIdentifier	 last Seg Type
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now, compute the marker's proxy transform 	TokenNameCOMMENT_LINE	Now, compute the marker's proxy transform 
AffineTransform	TokenNameIdentifier	 Affine Transform
markerTxf	TokenNameIdentifier	 marker Txf
=	TokenNameEQUAL	
computeMarkerTransform	TokenNameIdentifier	 compute Marker Transform
(	TokenNameLPAREN	
endMarker	TokenNameIdentifier	 end Marker
,	TokenNameCOMMA	
markerPosition	TokenNameIdentifier	 marker Position
,	TokenNameCOMMA	
rotation	TokenNameIdentifier	 rotation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProxyGraphicsNode	TokenNameIdentifier	 Proxy Graphics Node
gn	TokenNameIdentifier	 gn
=	TokenNameEQUAL	
new	TokenNamenew	
ProxyGraphicsNode	TokenNameIdentifier	 Proxy Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
endMarker	TokenNameIdentifier	 end Marker
.	TokenNameDOT	
getMarkerNode	TokenNameIdentifier	 get Marker Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
markerTxf	TokenNameIdentifier	 marker Txf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gn	TokenNameIdentifier	 gn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds a proxy <tt>GraphicsNode</tt> for the input * <tt>Marker</tt> to be drawn at the middle positions */	TokenNameCOMMENT_JAVADOC	 Builds a proxy <tt>GraphicsNode</tt> for the input <tt>Marker</tt> to be drawn at the middle positions 
protected	TokenNameprotected	
ProxyGraphicsNode	TokenNameIdentifier	 Proxy Graphics Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buildMiddleMarkerProxies	TokenNameIdentifier	 build Middle Marker Proxies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExtendedPathIterator	TokenNameIdentifier	 Extended Path Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
getExtShape	TokenNameIdentifier	 get Ext Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getExtendedPathIterator	TokenNameIdentifier	 get Extended Path Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
prevSegType	TokenNameIdentifier	 prev Seg Type
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currSegType	TokenNameIdentifier	 curr Seg Type
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nextSegType	TokenNameIdentifier	 next Seg Type
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Get the first three points on the path 	TokenNameCOMMENT_LINE	Get the first three points on the path 
if	TokenNameif	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prevSegType	TokenNameIdentifier	 prev Seg Type
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
moveTo	TokenNameIdentifier	 move To
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prevSegType	TokenNameIdentifier	 prev Seg Type
!=	TokenNameNOT_EQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
moveTo	TokenNameIdentifier	 move To
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
moveTo	TokenNameIdentifier	 move To
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currSegType	TokenNameIdentifier	 curr Seg Type
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currSegType	TokenNameIdentifier	 curr Seg Type
==	TokenNameEQUAL_EQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
moveTo	TokenNameIdentifier	 move To
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
moveTo	TokenNameIdentifier	 move To
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
currSegType	TokenNameIdentifier	 curr Seg Type
==	TokenNameEQUAL_EQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CLOSE	TokenNameIdentifier	 SEG  CLOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currSegType	TokenNameIdentifier	 curr Seg Type
=	TokenNameEQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
;	TokenNameSEMICOLON	
curr	TokenNameIdentifier	 curr
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
moveTo	TokenNameIdentifier	 move To
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
curr	TokenNameIdentifier	 curr
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
moveTo	TokenNameIdentifier	 move To
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
proxies	TokenNameIdentifier	 proxies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextSegType	TokenNameIdentifier	 next Seg Type
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextSegType	TokenNameIdentifier	 next Seg Type
==	TokenNameEQUAL_EQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
moveTo	TokenNameIdentifier	 move To
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
moveTo	TokenNameIdentifier	 move To
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nextSegType	TokenNameIdentifier	 next Seg Type
==	TokenNameEQUAL_EQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CLOSE	TokenNameIdentifier	 SEG  CLOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextSegType	TokenNameIdentifier	 next Seg Type
=	TokenNameEQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
moveTo	TokenNameIdentifier	 move To
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
moveTo	TokenNameIdentifier	 move To
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
proxies	TokenNameIdentifier	 proxies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
createMiddleMarker	TokenNameIdentifier	 create Middle Marker
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
prevSegType	TokenNameIdentifier	 prev Seg Type
,	TokenNameCOMMA	
curr	TokenNameIdentifier	 curr
,	TokenNameCOMMA	
currSegType	TokenNameIdentifier	 curr Seg Type
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
nextSegType	TokenNameIdentifier	 next Seg Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
;	TokenNameSEMICOLON	
prevSegType	TokenNameIdentifier	 prev Seg Type
=	TokenNameEQUAL	
currSegType	TokenNameIdentifier	 curr Seg Type
;	TokenNameSEMICOLON	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
currSegType	TokenNameIdentifier	 curr Seg Type
=	TokenNameEQUAL	
nextSegType	TokenNameIdentifier	 next Seg Type
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ProxyGraphicsNode	TokenNameIdentifier	 Proxy Graphics Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
gn	TokenNameIdentifier	 gn
=	TokenNameEQUAL	
new	TokenNamenew	
ProxyGraphicsNode	TokenNameIdentifier	 Proxy Graphics Node
[	TokenNameLBRACKET	
proxies	TokenNameIdentifier	 proxies
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
proxies	TokenNameIdentifier	 proxies
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
gn	TokenNameIdentifier	 gn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gn	TokenNameIdentifier	 gn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a ProxyGraphicsNode for a middle marker. */	TokenNameCOMMENT_JAVADOC	 Creates a ProxyGraphicsNode for a middle marker. 
private	TokenNameprivate	
ProxyGraphicsNode	TokenNameIdentifier	 Proxy Graphics Node
createMiddleMarker	TokenNameIdentifier	 create Middle Marker
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
int	TokenNameint	
prevSegType	TokenNameIdentifier	 prev Seg Type
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
curr	TokenNameIdentifier	 curr
,	TokenNameCOMMA	
int	TokenNameint	
currSegType	TokenNameIdentifier	 curr Seg Type
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
int	TokenNameint	
nextSegType	TokenNameIdentifier	 next Seg Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Turn the curr segment into a position 	TokenNameCOMMENT_LINE	Turn the curr segment into a position 
Point2D	TokenNameIdentifier	 Point2 D
markerPosition	TokenNameIdentifier	 marker Position
=	TokenNameEQUAL	
getSegmentTerminatingPoint	TokenNameIdentifier	 get Segment Terminating Point
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
,	TokenNameCOMMA	
currSegType	TokenNameIdentifier	 curr Seg Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the marker's orient property is NaN, 	TokenNameCOMMENT_LINE	If the marker's orient property is NaN, 
// the slope needs to be computed 	TokenNameCOMMENT_LINE	the slope needs to be computed 
double	TokenNamedouble	
rotation	TokenNameIdentifier	 rotation
=	TokenNameEQUAL	
middleMarker	TokenNameIdentifier	 middle Marker
.	TokenNameDOT	
getOrient	TokenNameIdentifier	 get Orient
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
rotation	TokenNameIdentifier	 rotation
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rotation	TokenNameIdentifier	 rotation
=	TokenNameEQUAL	
computeRotation	TokenNameIdentifier	 compute Rotation
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
prevSegType	TokenNameIdentifier	 prev Seg Type
,	TokenNameCOMMA	
curr	TokenNameIdentifier	 curr
,	TokenNameCOMMA	
currSegType	TokenNameIdentifier	 curr Seg Type
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
nextSegType	TokenNameIdentifier	 next Seg Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now, compute the marker's proxy transform 	TokenNameCOMMENT_LINE	Now, compute the marker's proxy transform 
AffineTransform	TokenNameIdentifier	 Affine Transform
markerTxf	TokenNameIdentifier	 marker Txf
=	TokenNameEQUAL	
computeMarkerTransform	TokenNameIdentifier	 compute Marker Transform
(	TokenNameLPAREN	
middleMarker	TokenNameIdentifier	 middle Marker
,	TokenNameCOMMA	
markerPosition	TokenNameIdentifier	 marker Position
,	TokenNameCOMMA	
rotation	TokenNameIdentifier	 rotation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProxyGraphicsNode	TokenNameIdentifier	 Proxy Graphics Node
gn	TokenNameIdentifier	 gn
=	TokenNameEQUAL	
new	TokenNamenew	
ProxyGraphicsNode	TokenNameIdentifier	 Proxy Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
middleMarker	TokenNameIdentifier	 middle Marker
.	TokenNameDOT	
getMarkerNode	TokenNameIdentifier	 get Marker Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
markerTxf	TokenNameIdentifier	 marker Txf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gn	TokenNameIdentifier	 gn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the rotation according to the specified parameters in degrees. */	TokenNameCOMMENT_JAVADOC	 Returns the rotation according to the specified parameters in degrees. 
private	TokenNameprivate	
double	TokenNamedouble	
computeRotation	TokenNameIdentifier	 compute Rotation
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
int	TokenNameint	
prevSegType	TokenNameIdentifier	 prev Seg Type
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
curr	TokenNameIdentifier	 curr
,	TokenNameCOMMA	
int	TokenNameint	
currSegType	TokenNameIdentifier	 curr Seg Type
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
int	TokenNameint	
nextSegType	TokenNameIdentifier	 next Seg Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Compute in slope, i.e., the slope of the segment 	TokenNameCOMMENT_LINE	Compute in slope, i.e., the slope of the segment 
// going into the current point 	TokenNameCOMMENT_LINE	going into the current point 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
inSlope	TokenNameIdentifier	 in Slope
=	TokenNameEQUAL	
computeInSlope	TokenNameIdentifier	 compute In Slope
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
prevSegType	TokenNameIdentifier	 prev Seg Type
,	TokenNameCOMMA	
curr	TokenNameIdentifier	 curr
,	TokenNameCOMMA	
currSegType	TokenNameIdentifier	 curr Seg Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Compute out slope, i.e., the slope of the segment 	TokenNameCOMMENT_LINE	Compute out slope, i.e., the slope of the segment 
// going out of the current point 	TokenNameCOMMENT_LINE	going out of the current point 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
outSlope	TokenNameIdentifier	 out Slope
=	TokenNameEQUAL	
computeOutSlope	TokenNameIdentifier	 compute Out Slope
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
,	TokenNameCOMMA	
currSegType	TokenNameIdentifier	 curr Seg Type
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
nextSegType	TokenNameIdentifier	 next Seg Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inSlope	TokenNameIdentifier	 in Slope
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inSlope	TokenNameIdentifier	 in Slope
=	TokenNameEQUAL	
outSlope	TokenNameIdentifier	 out Slope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
outSlope	TokenNameIdentifier	 out Slope
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outSlope	TokenNameIdentifier	 out Slope
=	TokenNameEQUAL	
inSlope	TokenNameIdentifier	 in Slope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inSlope	TokenNameIdentifier	 in Slope
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
inSlope	TokenNameIdentifier	 in Slope
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
outSlope	TokenNameIdentifier	 out Slope
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
inSlope	TokenNameIdentifier	 in Slope
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
outSlope	TokenNameIdentifier	 out Slope
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
dy	TokenNameIdentifier	 dy
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The two vectors are exact opposites. There is no way to 	TokenNameCOMMENT_LINE	The two vectors are exact opposites. There is no way to 
// know which direction to go (+90 or -90). Choose +90 	TokenNameCOMMENT_LINE	know which direction to go (+90 or -90). Choose +90 
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toDegrees	TokenNameIdentifier	 to Degrees
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
atan2	TokenNameIdentifier	 atan2
(	TokenNameLPAREN	
inSlope	TokenNameIdentifier	 in Slope
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
inSlope	TokenNameIdentifier	 in Slope
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
90	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toDegrees	TokenNameIdentifier	 to Degrees
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
atan2	TokenNameIdentifier	 atan2
(	TokenNameLPAREN	
dy	TokenNameIdentifier	 dy
,	TokenNameCOMMA	
dx	TokenNameIdentifier	 dx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns dx/dy for the in slope. */	TokenNameCOMMENT_JAVADOC	 Returns dx/dy for the in slope. 
private	TokenNameprivate	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
computeInSlope	TokenNameIdentifier	 compute In Slope
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
int	TokenNameint	
prevSegType	TokenNameIdentifier	 prev Seg Type
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
curr	TokenNameIdentifier	 curr
,	TokenNameCOMMA	
int	TokenNameint	
currSegType	TokenNameIdentifier	 curr Seg Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Compute point into which the slope runs 	TokenNameCOMMENT_LINE	Compute point into which the slope runs 
Point2D	TokenNameIdentifier	 Point2 D
currEndPoint	TokenNameIdentifier	 curr End Point
=	TokenNameEQUAL	
getSegmentTerminatingPoint	TokenNameIdentifier	 get Segment Terminating Point
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
,	TokenNameCOMMA	
currSegType	TokenNameIdentifier	 curr Seg Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
currSegType	TokenNameIdentifier	 curr Seg Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
:	TokenNameCOLON	
{	TokenNameLBRACE	
// This is equivalent to a line from the previous segment's 	TokenNameCOMMENT_LINE	This is equivalent to a line from the previous segment's 
// terminating point and the current end point. 	TokenNameCOMMENT_LINE	terminating point and the current end point. 
Point2D	TokenNameIdentifier	 Point2 D
prevEndPoint	TokenNameIdentifier	 prev End Point
=	TokenNameEQUAL	
getSegmentTerminatingPoint	TokenNameIdentifier	 get Segment Terminating Point
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
prevSegType	TokenNameIdentifier	 prev Seg Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
currEndPoint	TokenNameIdentifier	 curr End Point
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
prevEndPoint	TokenNameIdentifier	 prev End Point
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
currEndPoint	TokenNameIdentifier	 curr End Point
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
prevEndPoint	TokenNameIdentifier	 prev End Point
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_QUADTO	TokenNameIdentifier	 SEG  QUADTO
:	TokenNameCOLON	
// If the current segment is a line, quad or cubic curve. 	TokenNameCOMMENT_LINE	If the current segment is a line, quad or cubic curve. 
// the slope is about equal to that of the line from the 	TokenNameCOMMENT_LINE	the slope is about equal to that of the line from the 
// last control point and the curEndPoint 	TokenNameCOMMENT_LINE	last control point and the curEndPoint 
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
currEndPoint	TokenNameIdentifier	 curr End Point
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
curr	TokenNameIdentifier	 curr
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
currEndPoint	TokenNameIdentifier	 curr End Point
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
curr	TokenNameIdentifier	 curr
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CUBICTO	TokenNameIdentifier	 SEG  CUBICTO
:	TokenNameCOLON	
// If the current segment is a quad or cubic curve. 	TokenNameCOMMENT_LINE	If the current segment is a quad or cubic curve. 
// the slope is about equal to that of the line from the 	TokenNameCOMMENT_LINE	the slope is about equal to that of the line from the 
// last control point and the curEndPoint 	TokenNameCOMMENT_LINE	last control point and the curEndPoint 
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
currEndPoint	TokenNameIdentifier	 curr End Point
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
curr	TokenNameIdentifier	 curr
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
currEndPoint	TokenNameIdentifier	 curr End Point
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
curr	TokenNameIdentifier	 curr
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ExtendedPathIterator	TokenNameIdentifier	 Extended Path Iterator
.	TokenNameDOT	
SEG_ARCTO	TokenNameIdentifier	 SEG  ARCTO
:	TokenNameCOLON	
{	TokenNameLBRACE	
// If the current segment is an ARCTO then we build the 	TokenNameCOMMENT_LINE	If the current segment is an ARCTO then we build the 
// arc and ask for it's end angle and get the tangent there. 	TokenNameCOMMENT_LINE	arc and ask for it's end angle and get the tangent there. 
Point2D	TokenNameIdentifier	 Point2 D
prevEndPoint	TokenNameIdentifier	 prev End Point
=	TokenNameEQUAL	
getSegmentTerminatingPoint	TokenNameIdentifier	 get Segment Terminating Point
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
prevSegType	TokenNameIdentifier	 prev Seg Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
large	TokenNameIdentifier	 large
=	TokenNameEQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0.	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
goLeft	TokenNameIdentifier	 go Left
=	TokenNameEQUAL	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0.	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arc2D	TokenNameIdentifier	 Arc2 D
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
ExtendedGeneralPath	TokenNameIdentifier	 Extended General Path
.	TokenNameDOT	
computeArc	TokenNameIdentifier	 compute Arc
(	TokenNameLPAREN	
prevEndPoint	TokenNameIdentifier	 prev End Point
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
prevEndPoint	TokenNameIdentifier	 prev End Point
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
curr	TokenNameIdentifier	 curr
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
curr	TokenNameIdentifier	 curr
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
curr	TokenNameIdentifier	 curr
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
large	TokenNameIdentifier	 large
,	TokenNameCOMMA	
goLeft	TokenNameIdentifier	 go Left
,	TokenNameCOMMA	
curr	TokenNameIdentifier	 curr
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
curr	TokenNameIdentifier	 curr
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
theta	TokenNameIdentifier	 theta
=	TokenNameEQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
getAngleStart	TokenNameIdentifier	 get Angle Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
getAngleExtent	TokenNameIdentifier	 get Angle Extent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
theta	TokenNameIdentifier	 theta
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
-	TokenNameMINUS	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2.0	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2.0	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("In Theta: " + Math.toDegrees(theta) + 	TokenNameCOMMENT_LINE	System.out.println("In Theta: " + Math.toDegrees(theta) + 
// " Dx/Dy: " + dx + "/" + dy); 	TokenNameCOMMENT_LINE	" Dx/Dy: " + dx + "/" + dy); 
if	TokenNameif	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
ang	TokenNameIdentifier	 ang
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
-	TokenNameMINUS	
curr	TokenNameIdentifier	 curr
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sinA	TokenNameIdentifier	 sin A
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
ang	TokenNameIdentifier	 ang
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
cosA	TokenNameIdentifier	 cos A
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
ang	TokenNameIdentifier	 ang
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
tdx	TokenNameIdentifier	 tdx
=	TokenNameEQUAL	
dx	TokenNameIdentifier	 dx
*	TokenNameMULTIPLY	
cosA	TokenNameIdentifier	 cos A
-	TokenNameMINUS	
dy	TokenNameIdentifier	 dy
*	TokenNameMULTIPLY	
sinA	TokenNameIdentifier	 sin A
;	TokenNameSEMICOLON	
double	TokenNamedouble	
tdy	TokenNameIdentifier	 tdy
=	TokenNameEQUAL	
dx	TokenNameIdentifier	 dx
*	TokenNameMULTIPLY	
sinA	TokenNameIdentifier	 sin A
+	TokenNamePLUS	
dy	TokenNameIdentifier	 dy
*	TokenNameMULTIPLY	
cosA	TokenNameIdentifier	 cos A
;	TokenNameSEMICOLON	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
tdx	TokenNameIdentifier	 tdx
;	TokenNameSEMICOLON	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
tdy	TokenNameIdentifier	 tdy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println(" Rotate: " + curr[2] + 	TokenNameCOMMENT_LINE	System.out.println(" Rotate: " + curr[2] + 
// " Dx/Dy: " + dx + "/" + dy); 	TokenNameCOMMENT_LINE	" Dx/Dy: " + dx + "/" + dy); 
if	TokenNameif	
(	TokenNameLPAREN	
goLeft	TokenNameIdentifier	 go Left
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
-	TokenNameMINUS	
dx	TokenNameIdentifier	 dx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
-	TokenNameMINUS	
dy	TokenNameIdentifier	 dy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println(" GoLeft? " + goLeft + 	TokenNameCOMMENT_LINE	System.out.println(" GoLeft? " + goLeft + 
// " Dx/Dy: " + dx + "/" + dy); 	TokenNameCOMMENT_LINE	" Dx/Dy: " + dx + "/" + dy); 
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CLOSE	TokenNameIdentifier	 SEG  CLOSE
:	TokenNameCOLON	
// Should not have any close at this point 	TokenNameCOMMENT_LINE	Should not have any close at this point 
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"should not have SEG_CLOSE here"	TokenNameStringLiteral	should not have SEG_CLOSE here
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
:	TokenNameCOLON	
// Cannot compute the slope 	TokenNameCOMMENT_LINE	Cannot compute the slope 
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
dy	TokenNameIdentifier	 dy
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
dx	TokenNameIdentifier	 dx
,	TokenNameCOMMA	
dy	TokenNameIdentifier	 dy
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns dx/dy for the out slope. */	TokenNameCOMMENT_JAVADOC	 Returns dx/dy for the out slope. 
private	TokenNameprivate	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
computeOutSlope	TokenNameIdentifier	 compute Out Slope
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
curr	TokenNameIdentifier	 curr
,	TokenNameCOMMA	
int	TokenNameint	
currSegType	TokenNameIdentifier	 curr Seg Type
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
int	TokenNameint	
nextSegType	TokenNameIdentifier	 next Seg Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Point2D	TokenNameIdentifier	 Point2 D
currEndPoint	TokenNameIdentifier	 curr End Point
=	TokenNameEQUAL	
getSegmentTerminatingPoint	TokenNameIdentifier	 get Segment Terminating Point
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
,	TokenNameCOMMA	
currSegType	TokenNameIdentifier	 curr Seg Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextSegType	TokenNameIdentifier	 next Seg Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CLOSE	TokenNameIdentifier	 SEG  CLOSE
:	TokenNameCOLON	
// Should not happen at this point, because all close 	TokenNameCOMMENT_LINE	Should not happen at this point, because all close 
// segments have been replaced by lineTo segments. 	TokenNameCOMMENT_LINE	segments have been replaced by lineTo segments. 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CUBICTO	TokenNameIdentifier	 SEG  CUBICTO
:	TokenNameCOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
:	TokenNameCOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_QUADTO	TokenNameIdentifier	 SEG  QUADTO
:	TokenNameCOLON	
// If the next segment is a line, quad or cubic curve. 	TokenNameCOMMENT_LINE	If the next segment is a line, quad or cubic curve. 
// the slope is about equal to that of the line from 	TokenNameCOMMENT_LINE	the slope is about equal to that of the line from 
// curEndPoint and the first control point 	TokenNameCOMMENT_LINE	curEndPoint and the first control point 
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
currEndPoint	TokenNameIdentifier	 curr End Point
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
currEndPoint	TokenNameIdentifier	 curr End Point
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ExtendedPathIterator	TokenNameIdentifier	 Extended Path Iterator
.	TokenNameDOT	
SEG_ARCTO	TokenNameIdentifier	 SEG  ARCTO
:	TokenNameCOLON	
{	TokenNameLBRACE	
// If the current segment is an ARCTO then we build the 	TokenNameCOMMENT_LINE	If the current segment is an ARCTO then we build the 
// arc and ask for it's end angle and get the tangent there. 	TokenNameCOMMENT_LINE	arc and ask for it's end angle and get the tangent there. 
boolean	TokenNameboolean	
large	TokenNameIdentifier	 large
=	TokenNameEQUAL	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0.	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
goLeft	TokenNameIdentifier	 go Left
=	TokenNameEQUAL	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0.	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arc2D	TokenNameIdentifier	 Arc2 D
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
ExtendedGeneralPath	TokenNameIdentifier	 Extended General Path
.	TokenNameDOT	
computeArc	TokenNameIdentifier	 compute Arc
(	TokenNameLPAREN	
currEndPoint	TokenNameIdentifier	 curr End Point
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currEndPoint	TokenNameIdentifier	 curr End Point
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
large	TokenNameIdentifier	 large
,	TokenNameCOMMA	
goLeft	TokenNameIdentifier	 go Left
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
theta	TokenNameIdentifier	 theta
=	TokenNameEQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
getAngleStart	TokenNameIdentifier	 get Angle Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
theta	TokenNameIdentifier	 theta
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
-	TokenNameMINUS	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2.0	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2.0	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("Out Theta: " + Math.toDegrees(theta) + 	TokenNameCOMMENT_LINE	System.out.println("Out Theta: " + Math.toDegrees(theta) + 
// " Dx/Dy: " + dx + "/" + dy); 	TokenNameCOMMENT_LINE	" Dx/Dy: " + dx + "/" + dy); 
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
ang	TokenNameIdentifier	 ang
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
-	TokenNameMINUS	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sinA	TokenNameIdentifier	 sin A
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
ang	TokenNameIdentifier	 ang
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
cosA	TokenNameIdentifier	 cos A
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
ang	TokenNameIdentifier	 ang
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
tdx	TokenNameIdentifier	 tdx
=	TokenNameEQUAL	
dx	TokenNameIdentifier	 dx
*	TokenNameMULTIPLY	
cosA	TokenNameIdentifier	 cos A
-	TokenNameMINUS	
dy	TokenNameIdentifier	 dy
*	TokenNameMULTIPLY	
sinA	TokenNameIdentifier	 sin A
;	TokenNameSEMICOLON	
double	TokenNamedouble	
tdy	TokenNameIdentifier	 tdy
=	TokenNameEQUAL	
dx	TokenNameIdentifier	 dx
*	TokenNameMULTIPLY	
sinA	TokenNameIdentifier	 sin A
+	TokenNamePLUS	
dy	TokenNameIdentifier	 dy
*	TokenNameMULTIPLY	
cosA	TokenNameIdentifier	 cos A
;	TokenNameSEMICOLON	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
tdx	TokenNameIdentifier	 tdx
;	TokenNameSEMICOLON	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
tdy	TokenNameIdentifier	 tdy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println(" Rotate: " + next[2] + 	TokenNameCOMMENT_LINE	System.out.println(" Rotate: " + next[2] + 
// " Dx/Dy: " + dx + "/" + dy); 	TokenNameCOMMENT_LINE	" Dx/Dy: " + dx + "/" + dy); 
if	TokenNameif	
(	TokenNameLPAREN	
goLeft	TokenNameIdentifier	 go Left
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
-	TokenNameMINUS	
dx	TokenNameIdentifier	 dx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
-	TokenNameMINUS	
dy	TokenNameIdentifier	 dy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println(" GoLeft? " + goLeft + 	TokenNameCOMMENT_LINE	System.out.println(" GoLeft? " + goLeft + 
// " Dx/Dy: " + dx + "/" + dy); 	TokenNameCOMMENT_LINE	" Dx/Dy: " + dx + "/" + dy); 
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
:	TokenNameCOLON	
// Cannot compute the out slope 	TokenNameCOMMENT_LINE	Cannot compute the out slope 
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
dy	TokenNameIdentifier	 dy
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
dx	TokenNameIdentifier	 dx
,	TokenNameCOMMA	
dy	TokenNameIdentifier	 dy
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Normalizes the input vector. This assumes an non-zero length */	TokenNameCOMMENT_JAVADOC	 Normalizes the input vector. This assumes an non-zero length 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/=	TokenNameDIVIDE_EQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/=	TokenNameDIVIDE_EQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Computes the transform for the input marker, so that it is positioned at * the given position with the specified rotation */	TokenNameCOMMENT_JAVADOC	 Computes the transform for the input marker, so that it is positioned at the given position with the specified rotation 
private	TokenNameprivate	
AffineTransform	TokenNameIdentifier	 Affine Transform
computeMarkerTransform	TokenNameIdentifier	 compute Marker Transform
(	TokenNameLPAREN	
Marker	TokenNameIdentifier	 Marker
marker	TokenNameIdentifier	 marker
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
markerPosition	TokenNameIdentifier	 marker Position
,	TokenNameCOMMA	
double	TokenNamedouble	
rotation	TokenNameIdentifier	 rotation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Point2D	TokenNameIdentifier	 Point2 D
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
marker	TokenNameIdentifier	 marker
.	TokenNameDOT	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/*AffineTransform txf = AffineTransform.getTranslateInstance(markerPosition.getX() - ref.getX(), markerPosition.getY() - ref.getY());*/	TokenNameCOMMENT_BLOCK	AffineTransform txf = AffineTransform.getTranslateInstance(markerPosition.getX() - ref.getX(), markerPosition.getY() - ref.getY());
AffineTransform	TokenNameIdentifier	 Affine Transform
txf	TokenNameIdentifier	 txf
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
txf	TokenNameIdentifier	 txf
.	TokenNameDOT	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
markerPosition	TokenNameIdentifier	 marker Position
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
markerPosition	TokenNameIdentifier	 marker Position
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
rotation	TokenNameIdentifier	 rotation
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
txf	TokenNameIdentifier	 txf
.	TokenNameDOT	
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
rotation	TokenNameIdentifier	 rotation
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
txf	TokenNameIdentifier	 txf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Extracts the terminating point, depending on the segment type. */	TokenNameCOMMENT_JAVADOC	 Extracts the terminating point, depending on the segment type. 
protected	TokenNameprotected	
Point2D	TokenNameIdentifier	 Point2 D
getSegmentTerminatingPoint	TokenNameIdentifier	 get Segment Terminating Point
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
coords	TokenNameIdentifier	 coords
,	TokenNameCOMMA	
int	TokenNameint	
segType	TokenNameIdentifier	 seg Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
segType	TokenNameIdentifier	 seg Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CUBICTO	TokenNameIdentifier	 SEG  CUBICTO
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_QUADTO	TokenNameIdentifier	 SEG  QUADTO
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ExtendedPathIterator	TokenNameIdentifier	 Extended Path Iterator
.	TokenNameDOT	
SEG_ARCTO	TokenNameIdentifier	 SEG  ARCTO
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CLOSE	TokenNameIdentifier	 SEG  CLOSE
:	TokenNameCOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"invalid segmentType:"	TokenNameStringLiteral	invalid segmentType:
+	TokenNamePLUS	
segType	TokenNameIdentifier	 seg Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Should never happen: close segments are replaced with lineTo 	TokenNameCOMMENT_LINE	Should never happen: close segments are replaced with lineTo 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
