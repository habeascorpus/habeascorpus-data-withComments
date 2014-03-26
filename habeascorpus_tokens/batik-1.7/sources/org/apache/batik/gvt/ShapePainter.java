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
/** * Renders the shape of a <tt>ShapeNode</tt>. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: ShapePainter.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Renders the shape of a <tt>ShapeNode</tt>. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: ShapePainter.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ShapePainter	TokenNameIdentifier	 Shape Painter
{	TokenNameLBRACE	
/** * Paints the specified shape using the specified Graphics2D. * * @param g2d the Graphics2D to use */	TokenNameCOMMENT_JAVADOC	 Paints the specified shape using the specified Graphics2D. * @param g2d the Graphics2D to use 
void	TokenNamevoid	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the area painted by this shape painter. */	TokenNameCOMMENT_JAVADOC	 Returns the area painted by this shape painter. 
Shape	TokenNameIdentifier	 Shape
getPaintedArea	TokenNameIdentifier	 get Painted Area
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the bounds of the area painted by this shape painter */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area painted by this shape painter 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getPaintedBounds2D	TokenNameIdentifier	 get Painted Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if <tt>pt</tt> is in the painted area. */	TokenNameCOMMENT_JAVADOC	 Returns true if <tt>pt</tt> is in the painted area. 
boolean	TokenNameboolean	
inPaintedArea	TokenNameIdentifier	 in Painted Area
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the area covered by this shape painter (even if nothing * is painted there). */	TokenNameCOMMENT_JAVADOC	 Returns the area covered by this shape painter (even if nothing is painted there). 
Shape	TokenNameIdentifier	 Shape
getSensitiveArea	TokenNameIdentifier	 get Sensitive Area
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the bounds of the area covered by this shape painter * (even if nothing is painted there). */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area covered by this shape painter (even if nothing is painted there). 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getSensitiveBounds2D	TokenNameIdentifier	 get Sensitive Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if <tt>pt</tt> is in the sensitive area. */	TokenNameCOMMENT_JAVADOC	 Returns true if <tt>pt</tt> is in the sensitive area. 
boolean	TokenNameboolean	
inSensitiveArea	TokenNameIdentifier	 in Sensitive Area
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the Shape this shape painter is associated with. * * @param shape new shape this painter should be associated with. * Should not be null. */	TokenNameCOMMENT_JAVADOC	 Sets the Shape this shape painter is associated with. * @param shape new shape this painter should be associated with. Should not be null. 
void	TokenNamevoid	
setShape	TokenNameIdentifier	 set Shape
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
shape	TokenNameIdentifier	 shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the shape this shape painter is associated with. * * @return shape associated with this painter */	TokenNameCOMMENT_JAVADOC	 Gets the shape this shape painter is associated with. * @return shape associated with this painter 
Shape	TokenNameIdentifier	 Shape
getShape	TokenNameIdentifier	 get Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
