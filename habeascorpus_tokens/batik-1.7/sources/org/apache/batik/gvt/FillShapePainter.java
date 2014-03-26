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
/** * A shape painter that can be used to fill a shape. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: FillShapePainter.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 A shape painter that can be used to fill a shape. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: FillShapePainter.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
FillShapePainter	TokenNameIdentifier	 Fill Shape Painter
implements	TokenNameimplements	
ShapePainter	TokenNameIdentifier	 Shape Painter
{	TokenNameLBRACE	
/** * The Shape to be painted. */	TokenNameCOMMENT_JAVADOC	 The Shape to be painted. 
protected	TokenNameprotected	
Shape	TokenNameIdentifier	 Shape
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
/** * The paint attribute used to fill the shape. */	TokenNameCOMMENT_JAVADOC	 The paint attribute used to fill the shape. 
protected	TokenNameprotected	
Paint	TokenNameIdentifier	 Paint
paint	TokenNameIdentifier	 paint
;	TokenNameSEMICOLON	
/** * Constructs a new <tt>FillShapePainter</tt> that can be used to fill * a <tt>Shape</tt>. * * @param shape Shape to be painted by this painter * Should not be null. */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>FillShapePainter</tt> that can be used to fill a <tt>Shape</tt>. * @param shape Shape to be painted by this painter Should not be null. 
public	TokenNamepublic	
FillShapePainter	TokenNameIdentifier	 Fill Shape Painter
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
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Shape can not be null!"	TokenNameStringLiteral	Shape can not be null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
shape	TokenNameIdentifier	 shape
=	TokenNameEQUAL	
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the paint used to fill a shape. * * @param newPaint the paint object used to fill the shape */	TokenNameCOMMENT_JAVADOC	 Sets the paint used to fill a shape. * @param newPaint the paint object used to fill the shape 
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
fill	TokenNameIdentifier	 fill
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
paint	TokenNameIdentifier	 paint
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
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
(	TokenNameLPAREN	
paint	TokenNameIdentifier	 paint
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
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
(	TokenNameLPAREN	
paint	TokenNameIdentifier	 paint
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the area covered by this shape painter (even if not painted). * */	TokenNameCOMMENT_JAVADOC	 Returns the area covered by this shape painter (even if not painted). 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getSensitiveArea	TokenNameIdentifier	 get Sensitive Area
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the area covered by this shape painte * (even if not painted). */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area covered by this shape painte (even if not painted). 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getSensitiveBounds2D	TokenNameIdentifier	 get Sensitive Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if pt is in the area painted by this shape painter */	TokenNameCOMMENT_JAVADOC	 Returns true if pt is in the area painted by this shape painter 
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
shape	TokenNameIdentifier	 shape
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
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
}	TokenNameRBRACE	
/** * Gets the Shape this shape painter is associated with. * * @return shape associated with this Painter. */	TokenNameCOMMENT_JAVADOC	 Gets the Shape this shape painter is associated with. * @return shape associated with this Painter. 
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
