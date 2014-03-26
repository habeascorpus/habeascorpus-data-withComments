/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
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
RenderingHints	TokenNameIdentifier	 Rendering Hints
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
NoninvertibleTransformException	TokenNameIdentifier	 Noninvertible Transform Exception
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
RenderedImage	TokenNameIdentifier	 Rendered Image
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
renderable	TokenNameIdentifier	 renderable
.	TokenNameDOT	
RenderContext	TokenNameIdentifier	 Render Context
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
GraphicsUtil	TokenNameIdentifier	 Graphics Util
;	TokenNameSEMICOLON	
/** * Concrete implementation of the AffineRable interface. * This adjusts the input images coordinate system by a general affine * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: AffineRable8Bit.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Concrete implementation of the AffineRable interface. This adjusts the input images coordinate system by a general affine * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: AffineRable8Bit.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AffineRable8Bit	TokenNameIdentifier	 Affine Rable8 Bit
extends	TokenNameextends	
AbstractRable	TokenNameIdentifier	 Abstract Rable
implements	TokenNameimplements	
AffineRable	TokenNameIdentifier	 Affine Rable
,	TokenNameCOMMA	
PaintRable	TokenNameIdentifier	 Paint Rable
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
affine	TokenNameIdentifier	 affine
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
invAffine	TokenNameIdentifier	 inv Affine
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AffineRable8Bit	TokenNameIdentifier	 Affine Rable8 Bit
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
AffineTransform	TokenNameIdentifier	 Affine Transform
affine	TokenNameIdentifier	 affine
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setAffine	TokenNameIdentifier	 set Affine
(	TokenNameLPAREN	
affine	TokenNameIdentifier	 affine
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Filter	TokenNameIdentifier	 Filter
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
affine	TokenNameIdentifier	 affine
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the source to be affine. */	TokenNameCOMMENT_JAVADOC	 Returns the source to be affine. 
public	TokenNamepublic	
Filter	TokenNameIdentifier	 Filter
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
)	TokenNameRPAREN	
srcs	TokenNameIdentifier	 srcs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the source to be affine. * @param src image to affine. */	TokenNameCOMMENT_JAVADOC	 Sets the source to be affine. @param src image to affine. 
public	TokenNamepublic	
void	TokenNamevoid	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the affine transform. * @param affine the new Affine transform to apply. */	TokenNameCOMMENT_JAVADOC	 Set the affine transform. @param affine the new Affine transform to apply. 
public	TokenNamepublic	
void	TokenNamevoid	
setAffine	TokenNameIdentifier	 set Affine
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
affine	TokenNameIdentifier	 affine
)	TokenNameRPAREN	
{	TokenNameLBRACE	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
affine	TokenNameIdentifier	 affine
=	TokenNameEQUAL	
affine	TokenNameIdentifier	 affine
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
invAffine	TokenNameIdentifier	 inv Affine
=	TokenNameEQUAL	
affine	TokenNameIdentifier	 affine
.	TokenNameDOT	
createInverse	TokenNameIdentifier	 create Inverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoninvertibleTransformException	TokenNameIdentifier	 Noninvertible Transform Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invAffine	TokenNameIdentifier	 inv Affine
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the Affine. * @return the Affine transform currently in effect. */	TokenNameCOMMENT_JAVADOC	 Get the Affine. @return the Affine transform currently in effect. 
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
getAffine	TokenNameIdentifier	 get Affine
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
affine	TokenNameIdentifier	 affine
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Should perform the equivilent action as * createRendering followed by drawing the RenderedImage. * * @param g2d The Graphics2D to draw to. * @return true if the paint call succeeded, false if * for some reason the paint failed (in which * case a createRendering should be used). */	TokenNameCOMMENT_JAVADOC	 Should perform the equivilent action as createRendering followed by drawing the RenderedImage. * @param g2d The Graphics2D to draw to. @return true if the paint call succeeded, false if for some reason the paint failed (in which case a createRendering should be used). 
public	TokenNamepublic	
boolean	TokenNameboolean	
paintRable	TokenNameIdentifier	 paint Rable
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
getAffine	TokenNameIdentifier	 get Affine
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
drawImage	TokenNameIdentifier	 draw Image
(	TokenNameLPAREN	
g2d	TokenNameIdentifier	 g2d
,	TokenNameCOMMA	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RenderedImage	TokenNameIdentifier	 Rendered Image
createRendering	TokenNameIdentifier	 create Rendering
(	TokenNameLPAREN	
RenderContext	TokenNameIdentifier	 Render Context
rc	TokenNameIdentifier	 rc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Degenerate Affine no output image.. 	TokenNameCOMMENT_LINE	Degenerate Affine no output image.. 
if	TokenNameif	
(	TokenNameLPAREN	
invAffine	TokenNameIdentifier	 inv Affine
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Just copy over the rendering hints. 	TokenNameCOMMENT_LINE	Just copy over the rendering hints. 
RenderingHints	TokenNameIdentifier	 Rendering Hints
rh	TokenNameIdentifier	 rh
=	TokenNameEQUAL	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
getRenderingHints	TokenNameIdentifier	 get Rendering Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rh	TokenNameIdentifier	 rh
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
rh	TokenNameIdentifier	 rh
=	TokenNameEQUAL	
new	TokenNamenew	
RenderingHints	TokenNameIdentifier	 Rendering Hints
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Map the area of interest to our input... 	TokenNameCOMMENT_LINE	Map the area of interest to our input... 
Shape	TokenNameIdentifier	 Shape
aoi	TokenNameIdentifier	 aoi
=	TokenNameEQUAL	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
getAreaOfInterest	TokenNameIdentifier	 get Area Of Interest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aoi	TokenNameIdentifier	 aoi
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
aoi	TokenNameIdentifier	 aoi
=	TokenNameEQUAL	
invAffine	TokenNameIdentifier	 inv Affine
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
aoi	TokenNameIdentifier	 aoi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// update the current affine transform 	TokenNameCOMMENT_LINE	update the current affine transform 
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
affine	TokenNameIdentifier	 affine
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Return what our input creates (it should factor in our affine). 	TokenNameCOMMENT_LINE	Return what our input creates (it should factor in our affine). 
return	TokenNamereturn	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createRendering	TokenNameIdentifier	 create Rendering
(	TokenNameLPAREN	
new	TokenNamenew	
RenderContext	TokenNameIdentifier	 Render Context
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
,	TokenNameCOMMA	
aoi	TokenNameIdentifier	 aoi
,	TokenNameCOMMA	
rh	TokenNameIdentifier	 rh
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getDependencyRegion	TokenNameIdentifier	 get Dependency Region
(	TokenNameLPAREN	
int	TokenNameint	
srcIndex	TokenNameIdentifier	 src Index
,	TokenNameCOMMA	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
outputRgn	TokenNameIdentifier	 output Rgn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
srcIndex	TokenNameIdentifier	 src Index
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"Affine only has one input"	TokenNameStringLiteral	Affine only has one input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
invAffine	TokenNameIdentifier	 inv Affine
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
invAffine	TokenNameIdentifier	 inv Affine
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
outputRgn	TokenNameIdentifier	 output Rgn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getDirtyRegion	TokenNameIdentifier	 get Dirty Region
(	TokenNameLPAREN	
int	TokenNameint	
srcIndex	TokenNameIdentifier	 src Index
,	TokenNameCOMMA	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
inputRgn	TokenNameIdentifier	 input Rgn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
srcIndex	TokenNameIdentifier	 src Index
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"Affine only has one input"	TokenNameStringLiteral	Affine only has one input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
affine	TokenNameIdentifier	 affine
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
inputRgn	TokenNameIdentifier	 input Rgn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
