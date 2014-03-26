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
color	TokenNameIdentifier	 color
.	TokenNameDOT	
ColorSpace	TokenNameIdentifier	 Color Space
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
rendered	TokenNameIdentifier	 rendered
.	TokenNameDOT	
TurbulencePatternRed	TokenNameIdentifier	 Turbulence Pattern Red
;	TokenNameSEMICOLON	
/** * Creates a sourceless image from a turbulence function. * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: TurbulenceRable8Bit.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Creates a sourceless image from a turbulence function. * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: TurbulenceRable8Bit.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TurbulenceRable8Bit	TokenNameIdentifier	 Turbulence Rable8 Bit
extends	TokenNameextends	
AbstractColorInterpolationRable	TokenNameIdentifier	 Abstract Color Interpolation Rable
implements	TokenNameimplements	
TurbulenceRable	TokenNameIdentifier	 Turbulence Rable
{	TokenNameLBRACE	
int	TokenNameint	
seed	TokenNameIdentifier	 seed
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Seed value to pseudo rand num gen. 	TokenNameCOMMENT_LINE	Seed value to pseudo rand num gen. 
int	TokenNameint	
numOctaves	TokenNameIdentifier	 num Octaves
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// number of octaves in turbulence function 	TokenNameCOMMENT_LINE	number of octaves in turbulence function 
double	TokenNamedouble	
baseFreqX	TokenNameIdentifier	 base Freq X
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Frequency in X/Y directions 	TokenNameCOMMENT_LINE	Frequency in X/Y directions 
double	TokenNamedouble	
baseFreqY	TokenNameIdentifier	 base Freq Y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
stitched	TokenNameIdentifier	 stitched
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// True if tiles are stitched 	TokenNameCOMMENT_LINE	True if tiles are stitched 
boolean	TokenNameboolean	
fractalNoise	TokenNameIdentifier	 fractal Noise
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// True if fractal noise should be used. 	TokenNameCOMMENT_LINE	True if fractal noise should be used. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
region	TokenNameIdentifier	 region
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TurbulenceRable8Bit	TokenNameIdentifier	 Turbulence Rable8 Bit
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
region	TokenNameIdentifier	 region
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
region	TokenNameIdentifier	 region
=	TokenNameEQUAL	
region	TokenNameIdentifier	 region
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TurbulenceRable8Bit	TokenNameIdentifier	 Turbulence Rable8 Bit
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
region	TokenNameIdentifier	 region
,	TokenNameCOMMA	
int	TokenNameint	
seed	TokenNameIdentifier	 seed
,	TokenNameCOMMA	
int	TokenNameint	
numOctaves	TokenNameIdentifier	 num Octaves
,	TokenNameCOMMA	
double	TokenNamedouble	
baseFreqX	TokenNameIdentifier	 base Freq X
,	TokenNameCOMMA	
double	TokenNamedouble	
baseFreqY	TokenNameIdentifier	 base Freq Y
,	TokenNameCOMMA	
boolean	TokenNameboolean	
stitched	TokenNameIdentifier	 stitched
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fractalNoise	TokenNameIdentifier	 fractal Noise
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
seed	TokenNameIdentifier	 seed
=	TokenNameEQUAL	
seed	TokenNameIdentifier	 seed
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numOctaves	TokenNameIdentifier	 num Octaves
=	TokenNameEQUAL	
numOctaves	TokenNameIdentifier	 num Octaves
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
baseFreqX	TokenNameIdentifier	 base Freq X
=	TokenNameEQUAL	
baseFreqX	TokenNameIdentifier	 base Freq X
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
baseFreqY	TokenNameIdentifier	 base Freq Y
=	TokenNameEQUAL	
baseFreqY	TokenNameIdentifier	 base Freq Y
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
stitched	TokenNameIdentifier	 stitched
=	TokenNameEQUAL	
stitched	TokenNameIdentifier	 stitched
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fractalNoise	TokenNameIdentifier	 fractal Noise
=	TokenNameEQUAL	
fractalNoise	TokenNameIdentifier	 fractal Noise
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
region	TokenNameIdentifier	 region
=	TokenNameEQUAL	
region	TokenNameIdentifier	 region
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the turbulence region */	TokenNameCOMMENT_JAVADOC	 Get the turbulence region 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getTurbulenceRegion	TokenNameIdentifier	 get Turbulence Region
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
)	TokenNameRPAREN	
region	TokenNameIdentifier	 region
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the turbulence region */	TokenNameCOMMENT_JAVADOC	 Get the turbulence region 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
)	TokenNameRPAREN	
region	TokenNameIdentifier	 region
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current seed value for the pseudo random number generator. * @return The current seed value for the pseudo random number generator. */	TokenNameCOMMENT_JAVADOC	 Get the current seed value for the pseudo random number generator. @return The current seed value for the pseudo random number generator. 
public	TokenNamepublic	
int	TokenNameint	
getSeed	TokenNameIdentifier	 get Seed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
seed	TokenNameIdentifier	 seed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current number of octaves for the noise function . * @return The current number of octaves for the noise function . */	TokenNameCOMMENT_JAVADOC	 Get the current number of octaves for the noise function . @return The current number of octaves for the noise function . 
public	TokenNamepublic	
int	TokenNameint	
getNumOctaves	TokenNameIdentifier	 get Num Octaves
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numOctaves	TokenNameIdentifier	 num Octaves
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current base fequency in x direction. * @return The current base fequency in x direction. */	TokenNameCOMMENT_JAVADOC	 Get the current base fequency in x direction. @return The current base fequency in x direction. 
public	TokenNamepublic	
double	TokenNamedouble	
getBaseFrequencyX	TokenNameIdentifier	 get Base Frequency X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
baseFreqX	TokenNameIdentifier	 base Freq X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current base fequency in y direction. * @return The current base fequency in y direction. */	TokenNameCOMMENT_JAVADOC	 Get the current base fequency in y direction. @return The current base fequency in y direction. 
public	TokenNamepublic	
double	TokenNamedouble	
getBaseFrequencyY	TokenNameIdentifier	 get Base Frequency Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
baseFreqY	TokenNameIdentifier	 base Freq Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the turbulence function is currently stitching tiles. * @return true if the turbulence function is currently stitching tiles. */	TokenNameCOMMENT_JAVADOC	 Returns true if the turbulence function is currently stitching tiles. @return true if the turbulence function is currently stitching tiles. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isStitched	TokenNameIdentifier	 is Stitched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stitched	TokenNameIdentifier	 stitched
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the turbulence function is using fractal noise, * instead of turbulence noise. * @return true if the turbulence function is using fractal noise, * instead of turbulence noise. */	TokenNameCOMMENT_JAVADOC	 Returns true if the turbulence function is using fractal noise, instead of turbulence noise. @return true if the turbulence function is using fractal noise, instead of turbulence noise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFractalNoise	TokenNameIdentifier	 is Fractal Noise
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fractalNoise	TokenNameIdentifier	 fractal Noise
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the turbulence region * @param turbulenceRegion region to fill with turbulence function. */	TokenNameCOMMENT_JAVADOC	 Sets the turbulence region @param turbulenceRegion region to fill with turbulence function. 
public	TokenNamepublic	
void	TokenNamevoid	
setTurbulenceRegion	TokenNameIdentifier	 set Turbulence Region
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
turbulenceRegion	TokenNameIdentifier	 turbulence Region
)	TokenNameRPAREN	
{	TokenNameLBRACE	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
region	TokenNameIdentifier	 region
=	TokenNameEQUAL	
turbulenceRegion	TokenNameIdentifier	 turbulence Region
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the seed value for the pseudo random number generator. * @param seed The new seed value for the pseudo random number generator. */	TokenNameCOMMENT_JAVADOC	 Set the seed value for the pseudo random number generator. @param seed The new seed value for the pseudo random number generator. 
public	TokenNamepublic	
void	TokenNamevoid	
setSeed	TokenNameIdentifier	 set Seed
(	TokenNameLPAREN	
int	TokenNameint	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
seed	TokenNameIdentifier	 seed
=	TokenNameEQUAL	
seed	TokenNameIdentifier	 seed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the number of octaves for the noise function . * @param numOctaves The new number of octaves for the noise function . */	TokenNameCOMMENT_JAVADOC	 Set the number of octaves for the noise function . @param numOctaves The new number of octaves for the noise function . 
public	TokenNamepublic	
void	TokenNamevoid	
setNumOctaves	TokenNameIdentifier	 set Num Octaves
(	TokenNameLPAREN	
int	TokenNameint	
numOctaves	TokenNameIdentifier	 num Octaves
)	TokenNameRPAREN	
{	TokenNameLBRACE	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numOctaves	TokenNameIdentifier	 num Octaves
=	TokenNameEQUAL	
numOctaves	TokenNameIdentifier	 num Octaves
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the base fequency in x direction. * @param baseFreqX The new base fequency in x direction. */	TokenNameCOMMENT_JAVADOC	 Set the base fequency in x direction. @param baseFreqX The new base fequency in x direction. 
public	TokenNamepublic	
void	TokenNamevoid	
setBaseFrequencyX	TokenNameIdentifier	 set Base Frequency X
(	TokenNameLPAREN	
double	TokenNamedouble	
baseFreqX	TokenNameIdentifier	 base Freq X
)	TokenNameRPAREN	
{	TokenNameLBRACE	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
baseFreqX	TokenNameIdentifier	 base Freq X
=	TokenNameEQUAL	
baseFreqX	TokenNameIdentifier	 base Freq X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the base fequency in y direction. * @param baseFreqY The new base fequency in y direction. */	TokenNameCOMMENT_JAVADOC	 Set the base fequency in y direction. @param baseFreqY The new base fequency in y direction. 
public	TokenNamepublic	
void	TokenNamevoid	
setBaseFrequencyY	TokenNameIdentifier	 set Base Frequency Y
(	TokenNameLPAREN	
double	TokenNamedouble	
baseFreqY	TokenNameIdentifier	 base Freq Y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
baseFreqY	TokenNameIdentifier	 base Freq Y
=	TokenNameEQUAL	
baseFreqY	TokenNameIdentifier	 base Freq Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set stitching state for tiles. * @param stitched true if the turbulence operator should stitch tiles. */	TokenNameCOMMENT_JAVADOC	 Set stitching state for tiles. @param stitched true if the turbulence operator should stitch tiles. 
public	TokenNamepublic	
void	TokenNamevoid	
setStitched	TokenNameIdentifier	 set Stitched
(	TokenNameLPAREN	
boolean	TokenNameboolean	
stitched	TokenNameIdentifier	 stitched
)	TokenNameRPAREN	
{	TokenNameLBRACE	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
stitched	TokenNameIdentifier	 stitched
=	TokenNameEQUAL	
stitched	TokenNameIdentifier	 stitched
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Turns on/off fractal noise. * @param fractalNoise true if fractal noise should be used. */	TokenNameCOMMENT_JAVADOC	 Turns on/off fractal noise. @param fractalNoise true if fractal noise should be used. 
public	TokenNamepublic	
void	TokenNamevoid	
setFractalNoise	TokenNameIdentifier	 set Fractal Noise
(	TokenNameLPAREN	
boolean	TokenNameboolean	
fractalNoise	TokenNameIdentifier	 fractal Noise
)	TokenNameRPAREN	
{	TokenNameLBRACE	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fractalNoise	TokenNameIdentifier	 fractal Noise
=	TokenNameEQUAL	
fractalNoise	TokenNameIdentifier	 fractal Noise
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
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
aoiRect	TokenNameIdentifier	 aoi Rect
;	TokenNameSEMICOLON	
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
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aoiRect	TokenNameIdentifier	 aoi Rect
=	TokenNameEQUAL	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
rect	TokenNameIdentifier	 rect
=	TokenNameEQUAL	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aoiRect	TokenNameIdentifier	 aoi Rect
=	TokenNameEQUAL	
aoi	TokenNameIdentifier	 aoi
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
aoiRect	TokenNameIdentifier	 aoi Rect
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
intersect	TokenNameIdentifier	 intersect
(	TokenNameLPAREN	
aoiRect	TokenNameIdentifier	 aoi Rect
,	TokenNameCOMMA	
rect	TokenNameIdentifier	 rect
,	TokenNameCOMMA	
aoiRect	TokenNameIdentifier	 aoi Rect
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
usr2dev	TokenNameIdentifier	 usr2dev
=	TokenNameEQUAL	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Compute size of raster image in device space. 	TokenNameCOMMENT_LINE	Compute size of raster image in device space. 
// System.out.println("Turbulence aoi : " + aoi); 	TokenNameCOMMENT_LINE	System.out.println("Turbulence aoi : " + aoi); 
// System.out.println("Scale X : " + usr2dev.getScaleX() + " scaleY : " + usr2dev.getScaleY()); 	TokenNameCOMMENT_LINE	System.out.println("Scale X : " + usr2dev.getScaleX() + " scaleY : " + usr2dev.getScaleY()); 
// System.out.println("Turbulence aoi dev : " + usr2dev.createTransformedShape(aoi).getBounds()); 	TokenNameCOMMENT_LINE	System.out.println("Turbulence aoi dev : " + usr2dev.createTransformedShape(aoi).getBounds()); 
final	TokenNamefinal	
Rectangle	TokenNameIdentifier	 Rectangle
devRect	TokenNameIdentifier	 dev Rect
=	TokenNameEQUAL	
usr2dev	TokenNameIdentifier	 usr2dev
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
aoiRect	TokenNameIdentifier	 aoi Rect
)	TokenNameRPAREN	
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
devRect	TokenNameIdentifier	 dev Rect
.	TokenNameDOT	
width	TokenNameIdentifier	 width
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
devRect	TokenNameIdentifier	 dev Rect
.	TokenNameDOT	
height	TokenNameIdentifier	 height
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ColorSpace	TokenNameIdentifier	 Color Space
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
getOperationColorSpace	TokenNameIdentifier	 get Operation Color Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
tile	TokenNameIdentifier	 tile
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stitched	TokenNameIdentifier	 stitched
)	TokenNameRPAREN	
tile	TokenNameIdentifier	 tile
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
)	TokenNameRPAREN	
region	TokenNameIdentifier	 region
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
patternTxf	TokenNameIdentifier	 pattern Txf
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
patternTxf	TokenNameIdentifier	 pattern Txf
=	TokenNameEQUAL	
usr2dev	TokenNameIdentifier	 usr2dev
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
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TurbulencePatternRed	TokenNameIdentifier	 Turbulence Pattern Red
(	TokenNameLPAREN	
baseFreqX	TokenNameIdentifier	 base Freq X
,	TokenNameCOMMA	
baseFreqY	TokenNameIdentifier	 base Freq Y
,	TokenNameCOMMA	
numOctaves	TokenNameIdentifier	 num Octaves
,	TokenNameCOMMA	
seed	TokenNameIdentifier	 seed
,	TokenNameCOMMA	
fractalNoise	TokenNameIdentifier	 fractal Noise
,	TokenNameCOMMA	
tile	TokenNameIdentifier	 tile
,	TokenNameCOMMA	
patternTxf	TokenNameIdentifier	 pattern Txf
,	TokenNameCOMMA	
devRect	TokenNameIdentifier	 dev Rect
,	TokenNameCOMMA	
cs	TokenNameIdentifier	 cs
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
