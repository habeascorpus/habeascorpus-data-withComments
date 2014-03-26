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
Paint	TokenNameIdentifier	 Paint
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
Stroke	TokenNameIdentifier	 Stroke
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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Point2D	TokenNameIdentifier	 Point2 D
;	TokenNameSEMICOLON	
/** * A shape painter that can be used to draw the outline of a shape. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: StrokeShapePainter.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A shape painter that can be used to draw the outline of a shape. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: StrokeShapePainter.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
StrokeShapePainter	TokenNameIdentifier	 Stroke Shape Painter
implements	TokenNameimplements	
ShapePainter	TokenNameIdentifier	 Shape Painter
{	TokenNameLBRACE	
/** * Shape painted by this painter. */	TokenNameCOMMENT_JAVADOC	 Shape painted by this painter. 
protected	TokenNameprotected	
Shape	TokenNameIdentifier	 Shape
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
/** * Stroked version of the shape. */	TokenNameCOMMENT_JAVADOC	 Stroked version of the shape. 
protected	TokenNameprotected	
Shape	TokenNameIdentifier	 Shape
strokedShape	TokenNameIdentifier	 stroked Shape
;	TokenNameSEMICOLON	
/** * The stroke attribute used to draw the outline of the shape. */	TokenNameCOMMENT_JAVADOC	 The stroke attribute used to draw the outline of the shape. 
protected	TokenNameprotected	
Stroke	TokenNameIdentifier	 Stroke
stroke	TokenNameIdentifier	 stroke
;	TokenNameSEMICOLON	
/** * The paint attribute used to draw the outline of the shape. */	TokenNameCOMMENT_JAVADOC	 The paint attribute used to draw the outline of the shape. 
protected	TokenNameprotected	
Paint	TokenNameIdentifier	 Paint
paint	TokenNameIdentifier	 paint
;	TokenNameSEMICOLON	
/** * Constructs a new <tt>ShapePainter</tt> that can be used to draw the * outline of a <tt>Shape</tt>. * * @param shape shape to be painted by this painter. * Should not be null. */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>ShapePainter</tt> that can be used to draw the outline of a <tt>Shape</tt>. * @param shape shape to be painted by this painter. Should not be null. 
public	TokenNamepublic	
StrokeShapePainter	TokenNameIdentifier	 Stroke Shape Painter
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
this	TokenNamethis	
.	TokenNameDOT	
shape	TokenNameIdentifier	 shape
=	TokenNameEQUAL	
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the stroke used to draw the outline of a shape. * * @param newStroke the stroke object used to draw the outline of the shape */	TokenNameCOMMENT_JAVADOC	 Sets the stroke used to draw the outline of a shape. * @param newStroke the stroke object used to draw the outline of the shape 
public	TokenNamepublic	
void	TokenNamevoid	
setStroke	TokenNameIdentifier	 set Stroke
(	TokenNameLPAREN	
Stroke	TokenNameIdentifier	 Stroke
newStroke	TokenNameIdentifier	 new Stroke
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
stroke	TokenNameIdentifier	 stroke
=	TokenNameEQUAL	
newStroke	TokenNameIdentifier	 new Stroke
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strokedShape	TokenNameIdentifier	 stroked Shape
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the stroke used to draw the outline of the shape. */	TokenNameCOMMENT_JAVADOC	 Gets the stroke used to draw the outline of the shape. 
public	TokenNamepublic	
Stroke	TokenNameIdentifier	 Stroke
getStroke	TokenNameIdentifier	 get Stroke
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stroke	TokenNameIdentifier	 stroke
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the paint used to fill a shape. * * @param newPaint the paint object used to draw the shape */	TokenNameCOMMENT_JAVADOC	 Sets the paint used to fill a shape. * @param newPaint the paint object used to draw the shape 
public	TokenNamepublic	
void	TokenNamevoid	
setPaint	TokenNameIdentifier	 set Paint
(	TokenNameLPAREN	
Paint	TokenNameIdentifier	 Paint
newPaint	TokenNameIdentifier	 new Paint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
paint	TokenNameIdentifier	 paint
=	TokenNameEQUAL	
newPaint	TokenNameIdentifier	 new Paint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the paint used to draw the outline of the shape. */	TokenNameCOMMENT_JAVADOC	 Gets the paint used to draw the outline of the shape. 
public	TokenNamepublic	
Paint	TokenNameIdentifier	 Paint
getPaint	TokenNameIdentifier	 get Paint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
paint	TokenNameIdentifier	 paint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Paints the outline of the specified shape using the specified * Graphics2D. * * @param g2d the Graphics2D to use */	TokenNameCOMMENT_JAVADOC	 Paints the outline of the specified shape using the specified Graphics2D. * @param g2d the Graphics2D to use 
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
stroke	TokenNameIdentifier	 stroke
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
paint	TokenNameIdentifier	 paint
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setPaint	TokenNameIdentifier	 set Paint
(	TokenNameLPAREN	
paint	TokenNameIdentifier	 paint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setStroke	TokenNameIdentifier	 set Stroke
(	TokenNameLPAREN	
stroke	TokenNameIdentifier	 stroke
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
draw	TokenNameIdentifier	 draw
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
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
(	TokenNameLPAREN	
paint	TokenNameIdentifier	 paint
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
stroke	TokenNameIdentifier	 stroke
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
strokedShape	TokenNameIdentifier	 stroked Shape
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
strokedShape	TokenNameIdentifier	 stroked Shape
=	TokenNameEQUAL	
stroke	TokenNameIdentifier	 stroke
.	TokenNameDOT	
createStrokedShape	TokenNameIdentifier	 create Stroked Shape
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
strokedShape	TokenNameIdentifier	 stroked Shape
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the area painted by this shape painter */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area painted by this shape painter 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getPaintedBounds2D	TokenNameIdentifier	 get Painted Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Shape	TokenNameIdentifier	 Shape
painted	TokenNameIdentifier	 painted
=	TokenNameEQUAL	
getPaintedArea	TokenNameIdentifier	 get Painted Area
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
painted	TokenNameIdentifier	 painted
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
painted	TokenNameIdentifier	 painted
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the area covered by this shape painter */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area covered by this shape painter 
public	TokenNamepublic	
boolean	TokenNameboolean	
inPaintedArea	TokenNameIdentifier	 in Painted Area
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Shape	TokenNameIdentifier	 Shape
painted	TokenNameIdentifier	 painted
=	TokenNameEQUAL	
getPaintedArea	TokenNameIdentifier	 get Painted Area
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
painted	TokenNameIdentifier	 painted
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
painted	TokenNameIdentifier	 painted
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the area covered by this shape painter (even if not painted). */	TokenNameCOMMENT_JAVADOC	 Returns the area covered by this shape painter (even if not painted). 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getSensitiveArea	TokenNameIdentifier	 get Sensitive Area
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stroke	TokenNameIdentifier	 stroke
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
strokedShape	TokenNameIdentifier	 stroked Shape
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
strokedShape	TokenNameIdentifier	 stroked Shape
=	TokenNameEQUAL	
stroke	TokenNameIdentifier	 stroke
.	TokenNameDOT	
createStrokedShape	TokenNameIdentifier	 create Stroked Shape
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
strokedShape	TokenNameIdentifier	 stroked Shape
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the area covered by this shape painter * (even if not painted). */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area covered by this shape painter (even if not painted). 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getSensitiveBounds2D	TokenNameIdentifier	 get Sensitive Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Shape	TokenNameIdentifier	 Shape
sensitive	TokenNameIdentifier	 sensitive
=	TokenNameEQUAL	
getSensitiveArea	TokenNameIdentifier	 get Sensitive Area
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sensitive	TokenNameIdentifier	 sensitive
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sensitive	TokenNameIdentifier	 sensitive
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the area covered by this shape painter * (even if not painted). */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area covered by this shape painter (even if not painted). 
public	TokenNamepublic	
boolean	TokenNameboolean	
inSensitiveArea	TokenNameIdentifier	 in Sensitive Area
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Shape	TokenNameIdentifier	 Shape
sensitive	TokenNameIdentifier	 sensitive
=	TokenNameEQUAL	
getSensitiveArea	TokenNameIdentifier	 get Sensitive Area
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sensitive	TokenNameIdentifier	 sensitive
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sensitive	TokenNameIdentifier	 sensitive
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
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
this	TokenNamethis	
.	TokenNameDOT	
shape	TokenNameIdentifier	 shape
=	TokenNameEQUAL	
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strokedShape	TokenNameIdentifier	 stroked Shape
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the Shape this shape painter is associated with. * * @return shape associated with this painter. */	TokenNameCOMMENT_JAVADOC	 Gets the Shape this shape painter is associated with. * @return shape associated with this painter. 
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
}	TokenNameRBRACE	
