/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
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
/** * This interface is the placeholder for SVG application informations. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGContext.java 478249 2006-11-22 17:29:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This interface is the placeholder for SVG application informations. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGContext.java 478249 2006-11-22 17:29:37Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SVGContext	TokenNameIdentifier	 SVG Context
{	TokenNameLBRACE	
// Constants for percentage interpretation. 	TokenNameCOMMENT_LINE	Constants for percentage interpretation. 
int	TokenNameint	
PERCENTAGE_FONT_SIZE	TokenNameIdentifier	 PERCENTAGE  FONT  SIZE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
PERCENTAGE_VIEWPORT_WIDTH	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  WIDTH
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
PERCENTAGE_VIEWPORT_HEIGHT	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  HEIGHT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
PERCENTAGE_VIEWPORT_SIZE	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  SIZE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Returns the size of a px CSS unit in millimeters. */	TokenNameCOMMENT_JAVADOC	 Returns the size of a px CSS unit in millimeters. 
float	TokenNamefloat	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the size of a px CSS unit in millimeters. * This will be removed after next release. * @see #getPixelUnitToMillimeter() */	TokenNameCOMMENT_JAVADOC	 Returns the size of a px CSS unit in millimeters. This will be removed after next release. @see #getPixelUnitToMillimeter() 
float	TokenNamefloat	
getPixelToMM	TokenNameIdentifier	 get Pixel To MM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the tight bounding box in current user space (i.e., * after application of the transform attribute, if any) on the * geometry of all contained graphics elements, exclusive of * stroke-width and filter effects). */	TokenNameCOMMENT_JAVADOC	 Returns the tight bounding box in current user space (i.e., after application of the transform attribute, if any) on the geometry of all contained graphics elements, exclusive of stroke-width and filter effects). 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBBox	TokenNameIdentifier	 get B Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the transform from the global transform space to pixels. */	TokenNameCOMMENT_JAVADOC	 Returns the transform from the global transform space to pixels. 
AffineTransform	TokenNameIdentifier	 Affine Transform
getScreenTransform	TokenNameIdentifier	 get Screen Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the transform to be used from the global transform space to pixels. */	TokenNameCOMMENT_JAVADOC	 Sets the transform to be used from the global transform space to pixels. 
void	TokenNamevoid	
setScreenTransform	TokenNameIdentifier	 set Screen Transform
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the transformation matrix from current user units * (i.e., after application of the transform attribute, if any) to * the viewport coordinate system for the nearestViewportElement. */	TokenNameCOMMENT_JAVADOC	 Returns the transformation matrix from current user units (i.e., after application of the transform attribute, if any) to the viewport coordinate system for the nearestViewportElement. 
AffineTransform	TokenNameIdentifier	 Affine Transform
getCTM	TokenNameIdentifier	 get CTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the global transformation matrix from the current * element to the root. */	TokenNameCOMMENT_JAVADOC	 Returns the global transformation matrix from the current element to the root. 
AffineTransform	TokenNameIdentifier	 Affine Transform
getGlobalTransform	TokenNameIdentifier	 get Global Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the width of the viewport which directly contains the * associated element. */	TokenNameCOMMENT_JAVADOC	 Returns the width of the viewport which directly contains the associated element. 
float	TokenNamefloat	
getViewportWidth	TokenNameIdentifier	 get Viewport Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the height of the viewport which directly contains the * associated element. */	TokenNameCOMMENT_JAVADOC	 Returns the height of the viewport which directly contains the associated element. 
float	TokenNamefloat	
getViewportHeight	TokenNameIdentifier	 get Viewport Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the font-size on the associated element. */	TokenNameCOMMENT_JAVADOC	 Returns the font-size on the associated element. 
float	TokenNamefloat	
getFontSize	TokenNameIdentifier	 get Font Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
